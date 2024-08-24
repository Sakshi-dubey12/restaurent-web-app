public class Main {
    public static void main(String[] args) {
        IDandPasswords idandPasswords = new IDandPasswords();
        //argument like  idandPassword.getLoginInfo bcz this going to return our hash map

        LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());
    }
}