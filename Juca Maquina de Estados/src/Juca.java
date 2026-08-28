import static java.lang.Math.max;

public class Juca {
    public int hunger = 0;
    public int fatigue = 0;

//1 = working, 2 = eating, 3 = sleeping
    public int state = 1;

    public Juca(int hunger, int fatigue, int state){
        this.hunger = hunger;
        this.fatigue = fatigue;
        this.state = state;
    }

    public void vida_clt(){
        switch (state){
            case 1:
                hunger += 2;
                fatigue += 5;
                break;

            case 2:
                hunger -= 5;
                break;

            case 3:
                hunger += 1;
                fatigue -= 10;
                break;
        }
    }

    public void limitador(){
        hunger = max(hunger, 0);
        fatigue = max(fatigue, 0);
    }
}
