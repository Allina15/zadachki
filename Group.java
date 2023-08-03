public class Group {
    String groupName;
    int startDate;
    String mentor;
    Person2 person2;

    public Group(String groupName, int startDate, String mentor, Person2 person2) {
        this.groupName = groupName;
        this.startDate = startDate;
        this.mentor = mentor;
        this.person2 = person2;
    }

    @Override
    public String toString() {
        return "Group " +
                "groupName=" + groupName +
                ", startDate=" + startDate +
                ", mentor=" + mentor +
                ", person2=" + person2;
    }
}
