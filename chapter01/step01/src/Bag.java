import java.util.function.IntBinaryOperator;

public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    // 초대장이 없는 관객의 가방
    public Bag(long amount){
        this(null, amount);
    }

    // 초대장이 있는 관객의 가방
    public Bag(Invitation invitation, long amount){
        this.invitation = invitation;
        this.amount = amount;
    }

    public boolean hasInvitation(){
        return invitation != null;
    }

    public boolean hasTicket(){
        return ticket != null;
    }
    public void setTicket(Ticket ticket){
        this.ticket = ticket;
    }

    public void minusAmount(Long amount){
        this.amount -= amount;
    }

    public void plusAmount(Long amount){
        this.amount += amount;
    }
}
