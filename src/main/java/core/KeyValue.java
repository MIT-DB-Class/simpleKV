package core;

import java.util.Iterator;

public interface KeyValue {

    /**
     * To implement in Lab 5.
     * 
     * Instantiates a SimpleKV object that implements this KeyValue interface if
     * the path given is empty. If the path is non-empty, it loads the data.
     * 
     * @param path
     *            Path to the file that stores the data.
     * @return SimpleKV object
     */
    SimpleKV initAndMakeStore(String path);

    /**
     * To implement in Lab 5.
     * 
     * Stores the value in the associated to the input key
     * 
     * @param key
     * @param value
     */
    void write(char[] key, char[] value);

    /**
     * To implement in Lab 5.
     * 
     * Returns the value stored at key, or null if no value exists.
     * 
     * @param key
     * @return char[] with the value stored at that key, or null if no value
     *         exists
     */
    char[] read(char[] key);

    /**
     * To implement in Lab 5.
     * 
     * Performs a range read on the key-value store. Returns an iterator over
     * the key-value pairs found in the range [startKey, endKey]
     * 
     * @param startKey
     *            char[] that indicates the beginning of the range
     * @param endKey
     *            char[] that indicates the end of the range
     * @return
     */
    Iterator<KVPair> readRange(char[] startKey, char[] endKey);

    /**
     * To implement in Lab 6.
     * 
     * Indicates the beginning of a transactions. Note there cannot be multiple
     * transactions ongoing at the same time.
     * 
     */
    void beginTx();

    /**
     * To implement in Lab 6.
     * 
     * Indicates that the transaction has finished and should be durable
     * 
     */
    public void commit();

}
