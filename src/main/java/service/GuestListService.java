package service;

import model.Guest;

import java.util.HashSet;
import java.util.Set;

public class GuestListService {
    private Set<Guest> guestList;

    public GuestListService() {
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
