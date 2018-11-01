package core;

import java.io.IOException;

public class SimpleKV implements KeyValue {

    public SimpleKV() {

    }

    @Override
    public KeyValue initAndMakeStore(String path) {
	return new SimpleKV();
    }

    @Override
    public void load(String path) throws IOException {
	System.out.println("Loaded!");
    }

    @Override
    public void write(byte[] key, byte[] value) {
	System.out.println("Written!");
    }

    @Override
    public byte[] read(byte[] key) {
	System.out.println("Read!");
	return null;
    }

    @Override
    public void store(String path) throws IOException {
	System.out.println("Stored!");
    }

    @Override
    public void writeBeginTx(int tid, byte[] key, byte[] value) {
	System.out.println("Written and began tx!");
    }

    @Override
    public void writeEndTx(int tid, byte[] key, byte[] value) {
	System.out.println("Written and ended tx!");
    }

    @Override
    public void commit(int tid) {
	System.out.println("Done!");
    }

}
