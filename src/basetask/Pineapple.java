package basetask;

public class Pineapple {
    private String grade;
    private double heatCapacity;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getHeatCapacity() {
        return heatCapacity;
    }

    public void setHeatCapacity(double heatCapacity) {
        this.heatCapacity = heatCapacity;
    }

    public Pineapple(String newGrade, double newheatCapacity) {
        this.grade = newGrade;
        this.heatCapacity = newheatCapacity;
    }
    public void printPineappleDetails() {
        if (heatCapacity > 2140){
            System.out.println("Я ананас, теплоемкость которого больше, чем у ветчины");
        }else{
            System.out.println("В ветчине тепла запасется больше :( ");
        }

    }
}

