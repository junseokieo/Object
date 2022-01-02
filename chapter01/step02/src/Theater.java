public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller){
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience){
        /* 극장이 ticketseller나 audience에 접근하는 것을 제거
        if (audience.getBag().hasInvitation()){
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        }else {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }*/

        // Theater는 단지 ticketSeller가 sellTo 메세지를 이해하고 응답할 수 있다는 사실만 알고 있다.
        ticketSeller.sellTo(audience);
    }
}
