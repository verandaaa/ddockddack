//package com.ddockddack.domain.similarity.service;
//
//import org.junit.jupiter.api.Test;
//
//import java.io.*;
//
//class FeatureDetectorDescriptorTest {
//
//    @Test
//    void featureCompare() throws IOException {
//        final FeatureDetectorDescriptor featureDetectorDescriptor
//                = new FeatureDetectorDescriptor();
//
//        File hurray1 = new File("./src/test/resources/testImage/image_similarity_test/hurray1.jpg");
//        InputStream hurrayStream1 = new FileInputStream(hurray1);
//
//        File hurray2 = new File("./src/test/resources/testImage/image_similarity_test/hurray2.jpg");
//        InputStream hurrayStream2 = new FileInputStream(hurray2);
//
//        File hurray3 = new File("./src/test/resources/testImage/image_similarity_test/hurray3.jpg");
//        InputStream hurrayStream3 = new FileInputStream(hurray3);
//
//
//        File arms1 = new File("./src/test/resources/testImage/image_similarity_test/arms1.jpg");
//        InputStream armsStream1 = new FileInputStream(arms1);
//
//        File arms2 = new File("./src/test/resources/testImage/image_similarity_test/arms2.jpg");
//        InputStream armsStream2 = new FileInputStream(arms2);
//
//        File arms3 = new File("./src/test/resources/testImage/image_similarity_test/arms3.jpg");
//        InputStream armsStream3 = new FileInputStream(arms3);
//
//
//        File face1 = new File("./src/test/resources/testImage/image_similarity_test/face1.jpg");
//        InputStream faceStream1 = new FileInputStream(face1);
//
//        File face2 = new File("./src/test/resources/testImage/image_similarity_test/face2.jpg");
//        InputStream faceStream2 = new FileInputStream(face2);
//
//        File face3 = new File("./src/test/resources/testImage/image_similarity_test/face3.jpg");
//        InputStream faceStream3 = new FileInputStream(face3);
//
//        File face4 = new File("./src/test/resources/testImage/image_similarity_test/face4.jpeg");
//        InputStream faceStream4 = new FileInputStream(face4);
//
//        File ho1 = new File("./src/test/resources/testImage/image_similarity_test/ho1.jpg");
//        InputStream ho1Stream = new FileInputStream(ho1);
//
//        File worstcase = new File("./src/test/resources/testImage/image_similarity_test/worstcase.jpg");
//        InputStream worstcaseStream = new FileInputStream(worstcase);
//
////        InputStream cannot be reusable (if stream reaches to the end, destroyed and cannot revert)
//        System.out.println("?????? ?????? ??????");
//        System.out.println("hurray 1,2: " + featureDetectorDescriptor.compareFeatures(hurrayStream1, hurrayStream2));
//        System.out.println("arms 1,2: " + featureDetectorDescriptor.compareFeatures(armsStream1, armsStream2));
//
//        System.out.println("-------------------------");
//        System.out.println("?????? ?????? ??????");
//        System.out.println("hurray vs arms: " + featureDetectorDescriptor.compareFeatures(hurrayStream3, armsStream3));
//
//        System.out.println("-------------------------");
//        System.out.println("????????? ????????????, ?????? ????????? ??????");
//        System.out.println("face(????????????,??????????????????) 1,2: " + featureDetectorDescriptor.compareFeatures(faceStream1, faceStream2));
//
//        System.out.println("-------------------------");
//        System.out.println("feature extraction ????????? ?????? ??????");
//        System.out.println("feature ????????? ??????: " + featureDetectorDescriptor.compareFeatures(ho1Stream, worstcaseStream));
//
//    }
//}