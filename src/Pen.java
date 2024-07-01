public class Pen {
    String color;
    Boolean button;
    double ink;
    String inkColor;
    double inkConsumption;

    Pen() {

    }
    Pen(double ink, double inkConsumption) {
        this.ink = ink;
        this.inkConsumption = inkConsumption;
    }

    Pen(double ink, String inkColor, double inkConsumption){
        this.ink = ink;
        this.inkColor = inkColor;
        this.inkConsumption = inkConsumption;
    }

    Pen (boolean button, double ink, String inkColor, double inkConsumption){
        this.button = button;
        this.ink = ink;
        this.inkColor = inkColor;
        this.inkConsumption = inkConsumption;
    }

    void clickButton() {
        button =! button;
    }
//        if (button) {
//            button = false;
//        } else {
//            button = true;
//        }
//    }

    void write(String word) {
        if (button){
            if (ink > 0){
                System.out.println(word);
                ink -= word.length() * inkConsumption;
            } else {
                System.out.println("Ink is not available");
            }
        } else {
            System.out.println("Press the button before the write!");
        }
    }

    void changePaste(double ink) {
        this.ink = ink;
    }
}
