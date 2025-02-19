package behavioral.state;

public class AuctionStartedState implements AuctionState{

    @Override
    public void startAuction(Auction auction) {
        System.out.println("Auction already started");
    }

    @Override
    public void closeAuction(Auction auction) {
        auction.setState(new AuctionClosedState());
        System.out.println("Auction closed");
    }

    @Override
    public void placeBit() {
        System.out.println("Bit placed");
    }
}
