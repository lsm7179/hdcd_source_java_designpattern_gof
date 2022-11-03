package com.my.pattern.strategy;

public class PhotoShopClient {

    public static void main(String[] args) {

        System.out.println("신나게 일하는 중..");
        Image image = new PngImage();

        System.out.println("저장하자!");
        image.save(PdfSaving::new);

        System.out.println("저장했으니 퇴근해야지..");

        System.out.println("--------------------------");

        System.out.println("다시 일하는 중..");
        Image jpgImage = new JpgImage();

        System.out.println("저장하자!");
        jpgImage.setStrategy(()-> System.out.println("클립보드로 저장되었습니다."));
        jpgImage.save();

        System.out.println("저장했으니 퇴근해야지..");
    }
}
