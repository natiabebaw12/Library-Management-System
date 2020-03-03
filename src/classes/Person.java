package classes;

public class Person {

    private String fullName;
    private String gender;
    private int contactNo;
    private String address;

    public void setInfo(String fullName, String gender, String address, int contactNo) {
        this.fullName = fullName;
        this.gender = gender;
        this.address = address;
        this.contactNo = contactNo;
        
    }

    public String getFullName() {
        return fullName;
    }

    public String getGender() {
        return gender;
    }

    public int getContactNo() {
        return contactNo;
    }

    public String getAddress() {
        return address;
    }

}
