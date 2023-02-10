package com.ddockddack.domain.member.request;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Schema(description = "MemberModifyImgRequest")
public class MemberModifyImgReq {
    private MultipartFile profile;

    @Override
    public String toString() {
        return "MemberModifyReq{" +
            ", profile='" + profile + '\'' +
            '}';
    }
}
