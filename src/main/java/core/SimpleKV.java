package core;

import java.util.Iterator;

public class SimpleKV implements KeyValue {

    public SimpleKV() {

    }

    @Override
    public SimpleKV initAndMakeStore(String path) {
	return new SimpleKV();
    }

    @Override
    public void write(char[] key, char[] value) {
	System.out.println("Written!");
    }

    @Override
    public char[] read(char[] key) {
	System.out.println("Read!");
	return null;
    }

    @Override
    public Iterator<KVPair> readRange(char[] startKey, char[] endKey) {
	System.out.println("Read range!");
	return null;
    }

    @Override
    public void beginTx() {
	System.out.println("Done!");
    }

    @Override
    public void commit() {
	System.out.println("Done!");
    }

}
