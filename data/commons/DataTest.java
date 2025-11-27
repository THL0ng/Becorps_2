package commons;

import java.util.Random;

public class DataTest {
    public static final String userName = "superadmin@becorps.com";
    public static final String password = "Becorps@2022";

    public static int getRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(99999);
    }


    /// ////// Step 1 //////////
    public static String firstName = "Long" + getRandomNumber() + "gmail.com";
    public static String secondName = "Test" + getRandomNumber();
    public static String thirdName =  "Becorps" + getRandomNumber();
    public static String companyActivity =  "Test Automation";
    public static String addresscompany = "Hồ Chí Minh" + " " + getRandomNumber();

    /// ////// Step 2 /////////
    public static int  capitalAmount = getRandomNumber();
    public static String  numberOfShares = "40000";
    public static String firstNameShareholder = "Number";
    public static String lastNameShareholder = "1";
    public static String lastNameShareholder2 = "2";
    public static int identification = getRandomNumber();
    public static String email = "JohnDee" + getRandomNumber() + "@gmail.com";
    public static String numberPhone = "+49123456789";
    public static String addressShareholder = "HCM City";
    public static String numberOfShare_Distribution = "8000";
    public static String numberOfShare_Distribution2 = "32000";
    /// /////////////////////////////////












}
