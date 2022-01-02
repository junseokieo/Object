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

    // Audience의 bag에 접근하는 부분을 Bag에 가져옴
    public Long hold(Ticket ticket){
        if(hasInvitation()) {
            setTicket(ticket);
            return 0L; // Long 형 0
        } else{
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

    private boolean hasInvitation(){
        return invitation != null;
    }

    private boolean hasTicket(){
        return ticket != null;
    }

    private void setTicket(Ticket ticket){
        this.ticket = ticket;
    }

    private void minusAmount(Long amount){
        this.amount -= amount;
    }

    private void plusAmount(Long amount){
        this.amount += amount;
    }
}
