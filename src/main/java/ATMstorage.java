package main.java;

public class ATMstorage {

    public int money = 0;

    public void fill(int i){
        this.money += i;
    }

    public boolean withdraw(){
        if(this.money <= 0){
            return false;
        }
        this.money--;
        return true;
    }

}
