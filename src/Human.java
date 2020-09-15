public class Human {

    static class Head {
        private String colorHair;
        private String colorEyes;

        public void setColorEyes(String colorEyes) {this.colorEyes = colorEyes;}
        public void setColorHair(String colorHair) {this.colorHair = colorHair;}

        public String getColorEyes() {return colorEyes;}
        public String getColorHair() {return colorHair;}
    }

    static class Leg {
        private int sizeFoot;
        private String legLeftRight;

        public void setLegLeftRight(String legLeftRight) {this.legLeftRight = legLeftRight;}
        public void setSizeFoot(int sizeFoot) {this.sizeFoot = sizeFoot;}

        public int getSizeFoot() {return sizeFoot;}
        public String getLegLeftRight() {return legLeftRight;}
    }

    static class Hand {
        private int numberFinger;

        public void setNumberFinger(int numberFinger) {this.numberFinger = numberFinger;}

        public int getNumberFinger() {return numberFinger;}
    }

}
