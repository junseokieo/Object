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
        return bag.hold(ticket);
    }
}
