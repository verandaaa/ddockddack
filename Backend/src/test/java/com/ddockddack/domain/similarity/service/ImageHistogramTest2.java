//package com.ddockddack.domain.similarity.service;
//
//import org.junit.jupiter.api.Test;
//import org.opencv.core.Mat;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.List;
//
//class ImageHistogramTest2 {
//
//    @Test
//    void getHistogram() {
//    }
//
//    @Test
//    void compareHistograms() throws IOException {
//        final ImageHistogram imageHistogram = new ImageHistogram();
//
//        File hurray1 = new File("./src/test/resources/testImage/image_similarity_test/hurray1.jpg");
//        InputStream hurrayStream1 = new FileInputStream(hurray1);
//        List<Mat> hurrayHist1 = imageHistogram.getHistogram(hurrayStream1);
//
//        File hurray2 = new File("./src/test/resources/testImage/image_similarity_test/hurray2.jpg");
//        InputStream hurrayStream2 = new FileInputStream(hurray2);
//        List<Mat> hurrayHist2 = imageHistogram.getHistogram(hurrayStream2);
//
//        File hurray3 = new File("./src/test/resources/testImage/image_similarity_test/hurray3.jpg");
//        InputStream hurrayStream3 = new FileInputStream(hurray3);
//        List<Mat> hurrayHist3 = imageHistogram.getHistogram(hurrayStream3);
//
//
//        File arms1 = new File("./src/test/resources/testImage/image_similarity_test/arms1.jpg");
//        InputStream armsStream1 = new FileInputStream(arms1);
//        List<Mat> armsHist1 = imageHistogram.getHistogram(armsStream1);
//
//        File arms2 = new File("./src/test/resources/testImage/image_similarity_test/arms2.jpg");
//        InputStream armsStream2 = new FileInputStream(arms2);
//        List<Mat> armsHist2 = imageHistogram.getHistogram(armsStream2);
//
//        File arms3 = new File("./src/test/resources/testImage/image_similarity_test/arms3.jpg");
//        InputStream armsStream3 = new FileInputStream(arms3);
//        List<Mat> armsHist3 = imageHistogram.getHistogram(armsStream3);
//
//
//
//        File face1 = new File("./src/test/resources/testImage/image_similarity_test/face1.jpg");
//        InputStream faceStream1 = new FileInputStream(face1);
//        List<Mat> faceHist1 = imageHistogram.getHistogram(faceStream1);
//
//
////      ???  JPEG YUV420 ????????? ??????????????? ????????? ?????????,
////         JPEG GRAY8BPP ?????????
////         {cv::Exception: C:\build\master_winpack-bindings-win64-vc14-static\opencv\modules\imgproc\src\histogram.cpp:148: error: (-215) j < nimages in function cv::histPrepareImages}
////         ?????? ??????
////      ???  JPG, JPEG ????????? ????????? ???????????? ??????????????? ???????????? ??? ??????.
//
//        File face2 = new File("./src/test/resources/testImage/image_similarity_test/face2.jpg");
//        InputStream faceStream2 = new FileInputStream(face2);
//        List<Mat> faceHist2 = imageHistogram.getHistogram(faceStream2);
//
//        File face3 = new File("./src/test/resources/testImage/image_similarity_test/face3.jpg");
//        InputStream faceStream3 = new FileInputStream(face3);
//        List<Mat> faceHist3 = imageHistogram.getHistogram(faceStream3);
//
////        File face4 = new File("./src/test/resources/testImage/image_similarity_test/face4.jpg");
//        File face4 = new File("./src/test/resources/testImage/image_similarity_test/face4.jpeg");
//        InputStream faceStream4 = new FileInputStream(face4);
//        List<Mat> faceHist4 = imageHistogram.getHistogram(faceStream4);
//
//
//
////        InputStream cannot be reusable (if stream reaches to the end, destroyed and cannot revert)
//        System.out.println("?????? ?????? ??????");
//        System.out.println("hurray 1,2: " +
//                imageHistogram.compareHistograms(hurrayHist1, hurrayHist2));
//
//        System.out.println("arms 1,2: " +
//                imageHistogram.compareHistograms(armsHist1, armsHist2));
//
//        System.out.println("-------------------------");
//        System.out.println("?????? ?????? ??????");
//        System.out.println("hurray vs arms: " +
//                imageHistogram.compareHistograms(hurrayHist3, armsHist3));
//
//        System.out.println("-------------------------");
//        System.out.println("????????? ????????????, ?????? ????????? ??????");
//        System.out.println("face(????????????,??????????????????) 1,2: " +
//                imageHistogram.compareHistograms(faceHist1, faceHist2));
//        System.out.println("face(???????????????,????????????) 3,4: " +
//                imageHistogram.compareHistograms(faceHist3, faceHist4));
//        System.out.println("Unit Test End.");
//    }
//}