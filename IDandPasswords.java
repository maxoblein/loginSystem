import java.util.HashMap;
public class IDandPasswords {
    
    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){
        logininfo.put("maxoblein","skis");
        logininfo.put("dougwager","beer");
        logininfo.put("tomatkins","cricket");
    }

    public HashMap getLoginInfo(){
        return logininfo;
    }

}
