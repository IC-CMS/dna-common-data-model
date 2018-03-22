package cms.sre.dna_common_data_model;

import java.util.*;

public class Block<T> {
    public static <T> List<Block<T>> getInitialBlockChain(T obj){
        return new LinkedList<Block<T>>(Arrays.asList(new Block<T>(obj)));
    }

    public static <T> List<Block<T>> addTransaction(T obj, List<Block<T>> blockChain){
        Block<T> newBlock = new Block<T>(obj);
        List<Block<T>> newChain = new LinkedList<Block<T>>(blockChain);
        if (blockChain.size() > 0) {
            newBlock.previousHash  = blockChain.get(blockChain.size() - 1)
                    .getHash();
        }
        newChain.add(newBlock);
        return newChain;
    }

    private Calendar created = new GregorianCalendar();
    private T obj;
    private int previousHash;

    protected Block(T obj){
        this.obj = obj;
        this.previousHash = 0;
    }

    public Calendar getCreated() {
        return created;
    }

    public Block<T> setCreated(Calendar created) {
        this.created = created;
        return this;
    }

    public T getObj() {
        return obj;
    }

    public Block<T> setObj(T obj) {
        this.obj = obj;
        return this;
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public Block<T> setPreviousHash(int previousHash) {
        this.previousHash = previousHash;
        return this;
    }

    public int getHash(){
        return this.obj == null ? 0 : this.obj.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Block)) return false;
        Block<?> block = (Block<?>) o;
        return previousHash == block.previousHash &&
                Objects.equals(created, block.created) &&
                Objects.equals(obj, block.obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(created, obj, previousHash);
    }
}

