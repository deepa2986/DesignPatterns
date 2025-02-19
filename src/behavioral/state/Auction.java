package behavioral.state;

public class Auction {

  //  private boolean isOpen;
    private AuctionState state;

//    public Auction(){
//        this.isOpen = false;
//    }

    public Auction(){
        this.state = new AuctionClosedState();
    }

    public void startAuction(){
//        if(isOpen){
//            System.out.println("Auction already started");
//        }else{
//            this.isOpen = true;
//            System.out.println("Auction started");
//        }
        state.startAuction(this);
    }

    public void closeAuction(){
//        if(!isOpen){
//            System.out.println("Auction already closed");
//        }else {
//            this.isOpen = false;
//            System.out.println("Auction closed");
//        }
        state.closeAuction(this);
    }

    public void placeBid() {
//        if(isOpen){
//            System.out.println("Bid placed");
//        }else System.out.println("Bid not placed because auction closed");
//    }
        state.placeBit();
    }

    public void setState(AuctionState state){
        this.state = state;
    }
}
