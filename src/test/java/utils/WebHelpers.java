package utils;

public class WebHelpers {

    protected String firstName;
    protected String lastName;
    protected String password;
    protected int dayOfBirth;
    protected int monthOfBirth;
    protected int yearOfBirth;
    protected int gender;


    public void inputRegData(String firstName, String lastName, String password, int dayOfBirth, int monthOfBirth, int yearOfBirth, int gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
    }
}
