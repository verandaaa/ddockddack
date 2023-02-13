import router from "@/router";
import {
  findByAccessToken,
  accesstokenRegeneration,
  logout,
} from "@/api/member";

export const memberStore = {
  namespaced: true,
  state: {
    accessToken: "",
    memberInfo: {
      memberId: "",
      email: "",
      nickname: "",
      profile: "",
      role: "",
    },
  },
  getters: {
    getAccessToken(state) {
      return state.accessToken;
    },
  },
  mutations: {
    setToken(state, accessToken) {
      state.accessToken = accessToken;
    },
    setMemberInfo(state, memberInfo) {
      state.memberInfo = memberInfo;
    },
  },
  actions: {
    setTokensAsync({ commit }, accessToken) {
      commit("setToken", accessToken);
    },

    async getMemberInfo({ commit, state }) {
      let accessToken = state.accessToken;
      await findByAccessToken(
        accessToken,
        ({ data }) => {
          if (data.email !== "") {
            // console.log("getMemberInfo data >> ", data);
            commit("setMemberInfo", data);
          } else {
            console.log("유저 정보 없음!!!!");
          }
        },
        async (error) => {
          console.log("[토큰 만료]", error.response.status);
        }
      );
    },

    async accesstokenReissue({ commit, state }, isAuthPage) {
      await accesstokenRegeneration(
        ({ data }) => {
          if (data) {
            let accessToken = data;
            commit("setToken", accessToken);
          }
        },
        async (error) => {
          //AccessToken 갱신 실패시 refreshToken이 문제임 >> 다시 로그인해야함
          if (error === 401 && isAuthPage) {
            console.log("갱신 실패");
            await logout(
              state.memberInfo.id,
              ({ data }) => {
                if (data.status === 200) {
                  console.log("리프레시 토큰 제거 성공");
                } else {
                  console.log("리프레시 토큰 제거 실패");
                }
                // alert("RefreshToken 기간 만료!!! 다시 로그인해 주세요.");
                // store.dispatch("commonStore/setCurrentModalAsync", {
                //   name: "login",
                //   data: "",
                // });
                router.push({ name: "main" });
              },
              (error) => {
                console.log(error);
              }
            );
          }
        }
      );
    },
  },

  async userLogout({ commit }, accessToken) {
    await logout(
      accessToken,
      ({ data }) => {
        if (data.status === 200) {
          commit("setMemberInfo", null);
        } else {
          console.log("유저 정보 없음!!!!");
        }
      },
      (error) => {
        console.log(error);
      }
    );
  },
};
