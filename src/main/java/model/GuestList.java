package model;

import java.util.HashSet;
import java.util.Set;

public class GuestList {
    private Set<Guest> guestList;

    public GuestList() {
        this.guestList = new HashSet<>();
    }

    public void addGuestToList(String name, int invitationCode) {
        guestList.add(new Guest(name, invitationCode));
    }

    public void deleteGuestByInvitationCode(int invitationCode) {
        Guest guestToRemove = null;

        for (Guest guest : guestList) {
            if (guest.getInvitationCode() == invitationCode) {
                guestToRemove = guest;
                break;
            }
        }
        guestList.remove(guestToRemove);
    }

    public int countGuests() {
        return guestList.size();
    }

    public void showGests() {
        System.out.println(guestList);
    }
}
