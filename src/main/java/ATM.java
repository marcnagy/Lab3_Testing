package main.java;

public class ATM extends ATMstorage {

    public String state = "LOGOUT";

    public Boolean input(char c){
        if(this.state.equals("LOGOUT")){
            if(c == 'l'){
                this.state = "LOGIN";
                return true;
            }else if(c == 'u'){
                this.state = "UNLOCKED";
                return true;
            }
        }else if(this.state.equals("LOGIN")){
            if(c == 'w'){
                return this.withdraw();
            }else if(c == 'd') {
                this.fill(1);
                return true;
            }else if(c == 'o') {
                this.state = "LOGOUT";
                return true;
            }
        }else if(this.state.equals("UNLOCKED")){
            if(c == 'f'){
                this.fill(1);
                return true;
            }else if(c == 'l') {
                this.state = "LOGOUT";
                return true;
            }
        }
        return false;
    }
}
