public class Audience {
    private Bag bag;

    public Audience(Bag bag){
        this.bag = bag;
    }

    /*public Bag getBag(){
        return bag;
    }*/

    // 관객이 자율적으로 가방에 접근해 문제를 해결함
    public Long buy(Ticket ticket){
        if(bag.hasInvitation()) {
            bag.setTicket(ticket);
            return 0L; // Long 형 0
        } else{
            bag.setTicket(ticket);
            bag.minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }
}
