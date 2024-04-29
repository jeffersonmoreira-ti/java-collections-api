package app;

import service.GuestListService;

public class MainGuests {
    public static void main(String[] args) {
        GuestListService guestListService = new GuestListService();

        System.out.println("Total # of guests: " + guestListService.countGuests());

        guestListService.addGuestToList("Jeff", 159357);
        guestListService.addGuestToList("Monty", 789456);
        guestListService.addGuestToList("Emeth", 452187);
        guestListService.addGuestToList("Loyd", 452187);
        guestListService.addGuestToList("Bill", 963785);

        guestListService.showGests();

        System.out.println("Total # of guests: " + guestListService.countGuests());

        guestListService.deleteGuestByInvitationCode(452187);

        guestListService.showGests();

        System.out.println("Total # of guests: " + guestListService.countGuests());

    }


}
