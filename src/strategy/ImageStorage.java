package strategy;

import org.jetbrains.annotations.NotNull;

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
    public void store(String fileName, @NotNull Compressor compressor) {
        compressor.compress(fileName);
    }
}
