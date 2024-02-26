package isp.lab6.exercise3;

import java.util.Set;

public class UserInterface {
    private LoginSystem loginSyst;
    private OnlineStore store;
    public void LoadInterface(){

    }
    public UserInterface ( LoginSystem loginSyst , OnlineStore store ) {
        this.loginSyst = loginSyst;
        this.store = store;
    }
    public class LoginSystem{
        private Set<User> users;
        private OnlineStore store;

        public LoginSystem ( Set<User> users , OnlineStore store ) {
            this.users = users;
            this.store = store;
        }
    }
}
