package core;

import java.io.IOException;
import java.util.Iterator;

public interface KeyValue {

    SimpleKV initAndMakeStore(String path);

    SimpleKV load(String path) throws IOException;

    void store(String path) throws IOException;

    void write(char[] key, char[] value);

    char[] read(char[] key);

    Iterator<KVPair> readRange(char[] startKey, char[] endKey);

    void beginTx(int tid);

    public void commit(int tid);

}
