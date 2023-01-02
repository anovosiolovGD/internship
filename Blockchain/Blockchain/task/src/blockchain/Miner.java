package blockchain;

public class Miner implements Runnable {
    private final Blockchain blockchain;

    public Miner(Blockchain blockchain, String threadName) {
        this.blockchain = blockchain;
        Thread.currentThread().setName(threadName); // TODO: 30/12/2020 does it work?
    }

    @Override
    public void run() {
        try {
            while (blockchain.getNextBlockId() <= 5) {
                final var block = Block.getUnproved(
                        Thread.currentThread().getName(),
                        blockchain.getNextBlockId(),
                        blockchain.getLastBlockHash());
                block.prove(blockchain.getNextZeroes());
                blockchain.addBlock(block);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}