public class Main {
    public static void main(String[] args){
        Juca juca = new Juca(0, 0, 1);

        int loop = 100;

        while (loop != 0){
            switch (juca.state){
                case 1:
                    System.out.println("Trabalhando...");
                    break;

                case 2:
                    System.out.println("Comendo...");
                    break;

                case 3:
                    System.out.println("Dormindo...");
                    break;
            }

            System.out.println("Fome: " + juca.hunger);
            System.out.println("Cansaço: " + juca.fatigue);

            switch (juca.state){
                case 1:
                    if (juca.fatigue > 50){
                        juca.state = 3;
                        System.out.println("Bateu um sono...");
                    } else if (juca.hunger > 10) {
                        juca.state = 2;
                        System.out.println("Bateu uma fome...");
                    } else {
                        break;
                    }

                case 2:
                    while (juca.hunger != 0){
                        break;
                    }
                    if (juca.hunger <= 0){
                        juca.hunger = 0;
                        System.out.println("Ufá! Já estou cheio...");
                        juca.state = 1;
                        System.out.println("Hora de ir para o trabalho!");
                    }

                case 3:
                    if (juca.fatigue <= 0){
                        juca.fatigue = 0;

                        if (juca.hunger <= 10){
                            juca.state = 1;
                            System.out.println("Hora de ir para o trabalho!");
                        } else if (juca.hunger > 10){
                            juca.state = 2;
                            System.out.println("Bateu uma fome...");
                        } else{
                            break;
                        }
                    }
            }

            juca.vida_clt();
            juca.limitador();

            System.out.println("");
            loop--;
        }

        System.out.println("Morreu");
    }
}
