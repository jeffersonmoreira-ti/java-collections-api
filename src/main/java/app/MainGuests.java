package app;

import model.GuestList;

public class MainGuests {
    public static void main(String[] args) {
        GuestList guestList = new GuestList();

        System.out.println("Total # of guests: " + guestList.countGuests());

        guestList.addGuestToList("Jeff", 159357);
        guestList.addGuestToList("Monty", 789456);
        guestList.addGuestToList("Emeth", 452187);
        guestList.addGuestToList("Loyd", 452187);
        guestList.addGuestToList("Bill", 963785);

        guestList.showGests();

        System.out.println("Total # of guests: " + guestList.countGuests());

        guestList.deleteGuestByInvitationCode(452187);

        guestList.showGests();

        System.out.println("Total # of guests: " + guestList.countGuests());

    }


}
