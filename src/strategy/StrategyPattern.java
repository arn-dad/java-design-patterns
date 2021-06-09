package strategy;

public class StrategyPattern {
    public static void main(String[] args) {
        System.out.println("Strategy pattern");

        ImageStorage imageStorage = new ImageStorage(new JpegCompressor());

        imageStorage.store("picture.jpg");

        imageStorage.store("picture-2.jpg", new PngCompressor());

        imageStorage.store("picture-3.jpg");

    }
}
