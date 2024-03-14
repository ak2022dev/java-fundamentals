package bites.examples;

public class Announcement {
    public String celebration() {
        return "Eid!";
    }

    public String changeOfPlan() {
        return "I am doing X instead of Y!";
    }

    public String apology() {
        return "I am so sorry!";
    }

    public String politeNotice() {
        return "Please remember that afternoon coaching session begins at 3pm!";
    }

    public String help() {
        return "I need help, please!";
    }
    public static void main( String[] args ) {
        /* Commented out from when methods were static
        System.out.println(Announcement.celebration());
        System.out.println(Announcement.changeOfPlan());
        System.out.println(Announcement.apology());
        System.out.println(Announcement.politeNotice());
        System.out.println(Announcement.help());
         */
        Announcement myAnnouncement = new Announcement();
        System.out.println(myAnnouncement.celebration());
        System.out.println(myAnnouncement.changeOfPlan());
        System.out.println(myAnnouncement.apology());
        System.out.println(myAnnouncement.politeNotice());
        System.out.println(myAnnouncement.help());
    }
}
