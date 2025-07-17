
class Computer {
    public void playMusic() {
        System.out.println("Playing music...");
    }
    public String getMeAPen(int cost){ 
        if(cost >= 10) {
        return "Pen";
        }
            return "Not enough money for a pen";
    }
}

    public class Demo {

        
        public static void main(String[] args) {
          
            Computer computer = new Computer();
            computer.playMusic();
            String str = computer.getMeAPen(0);
            System.out.println(str);
        }
    }

