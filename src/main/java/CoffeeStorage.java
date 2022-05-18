package main.java;

public class CoffeeStorage {

    public int Beans = 0;
    public int Water = 0;
    public int Chocolate = 0;
    public int Milk = 0;

    public void refillMilk(int i){
        this.Milk += i;
    }

    public void refillBeans(int i){
        this.Beans += i;
    }

    public void refillWater(int i){
        this.Water += i;
    }

    public void refillChocolate(int i){
        this.Chocolate += i;
    }

    public boolean useMilk(){
        if(this.Milk <= 0){
            return false;
        }
        this.Milk--;
        return true;
    }

    public boolean useBeans(){
        if(this.Beans <= 0){
            return false;
        }
        this.Beans--;
        return true;
    }

    public boolean useWater(){
        if(this.Water <= 0){
            return false;
        }
        this.Water--;
        return true;
    }

    public boolean useChocolate(){
        if(this.Chocolate <= 0){
            return false;
        }
        this.Chocolate--;
        return true;
    }
}
