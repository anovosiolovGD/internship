package blockchain;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class BlockChain {
    private int lengthOfPrefix = 0;
    private final ArrayBlockingQueue<Block> blockDeque = new ArrayBlockingQueue<>(30);

    public synchronized void addBlockToChain(Block block) { //synchronized because the method calling this is synchronized
        if (blockDeque.size() == 0) {
            block.setPreviousHash("0");
        } else {
            block.setPreviousHash(blockDeque.poll().getHash());//set it to the hash of the last element
        }
        blockDeque.add(block);
        System.out.println(block);
    }
    public Block getBlock(){
        return blockDeque.peek();
    }

//    public void printBlocks() {
//        Iterator<Block> blockIterator = blockDeque.descendingIterator();//iterate FIFO
//        blockIterator.forEachRemaining(System.out::println);
//
//    }


    public synchronized void createBlock(long miner) {
        Block block = new Block(lengthOfPrefix, miner);
        addBlockToChain(block);

        long creationTimeOfLastBlock = block.getCreationDuration();
        if (creationTimeOfLastBlock > 60) {
            lengthOfPrefix--;
        } else if (creationTimeOfLastBlock < 10) {
            lengthOfPrefix++;
        }

    }

}
