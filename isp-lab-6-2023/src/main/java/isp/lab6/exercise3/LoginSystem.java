package isp.lab6.exercise3;

import java.util.Set;

public class LoginSystem {
    private Set<User> users;
    private OnlineStore store;

    public LoginSystem ( Set<User> users , OnlineStore store ) {
        this.users=users;
        this.store = store;
    }

    public void Register( String userName, String password) {

    }
    public boolean Login(String userName,String password){
        if(userName.equals("MyUserName") && password.equals ( "MyPassword" )){
            return true;
        } else {
            return false;
        }
    }
    public boolean Logout(String username){

        return false;
    }

}
