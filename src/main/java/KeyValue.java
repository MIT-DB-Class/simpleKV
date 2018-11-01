import java.io.IOException;

public interface KeyValue {

    KeyValue initAndMakeStore(String path);

    void load(String path) throws IOException;

    void write(byte[] key, byte[] value);

    public void writeBeginTx(int tid, byte[] key, byte[] value);

    public void writeEndTx(int tid, byte[] key, byte[] value);

    public void commit(int tid);

    byte[] read(byte[] key);

    void store(String path) throws IOException;

}
