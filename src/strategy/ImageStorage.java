package strategy;

// Context
public class ImageStorage {
    private Compressor compressor;

    public ImageStorage(Compressor compressor) {
        this.compressor = compressor;
    }

    public void store(String fileName) {
        compressor.compress(fileName);
    }
    // pattern not includes method overload
    public void store(String fileName, Compressor compressor) {
        compressor.compress(fileName);
    }
}
