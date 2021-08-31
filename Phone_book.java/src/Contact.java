public class Contact {
    private String firstName;
    private long  phoneNumber;
    private String emailId;
    public Contact(){}
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public Contact(String firstName, long phoneNumber,
                   String emailId) {
        super();
        this.firstName = firstName;

        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
    }
}