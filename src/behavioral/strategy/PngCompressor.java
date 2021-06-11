package behavioral.strategy;
// Concrete Strategy B
public class PngCompressor implements Compressor{
    @Override
    public void compress(String fileName) {
        System.out.println("Compress using PNG Compressor");
    }
}
