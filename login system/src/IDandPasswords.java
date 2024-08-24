import java.util.HashMap;

public class IDandPasswords {
    HashMap<String,String> logininfo = new HashMap<String,String>();
    //constructor of ID and passwords
    IDandPasswords(){
        //user id and pass
        logininfo.put("Bro","pizza");
        logininfo.put("Sakshi","Buggu");
        logininfo.put("Dubey","aabc123");
        logininfo.put("Riya","k1518iya");
    }

    protected HashMap getLoginInfo(){
        return logininfo;

    }
}
