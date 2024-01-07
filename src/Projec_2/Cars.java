package Projec_2;

public class Cars {
   private double carPrice;
   private String color;

    public Cars(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }
    double calculateSalsePrice(){
        return carPrice;
    }

    public double getCarPrice() {
        return carPrice;
    }
}
class  Sedan extends Cars{
    double length;

    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }

    @Override
    public double calculateSalsePrice() {
        // return super.calculateSalsePrice()
        double price = getCarPrice();
        if (length > 20) {
            return -((price / 100) * 5);
        } else
            return price-((price/100)*10);
        }
    }
    class Truck extends Cars{
    double weight;

        public Truck(double carPrice, String color, double weight) {
            super(carPrice, color);
            this.weight = weight;
        }

        @Override
        double calculateSalsePrice() {
            //return super.calculateSalsePrice();
            double price=getCarPrice();
            if (weight >2000){
                return  price-((price/100)*10);

            }else
                return  -((price/100)*20);
        }
    }
    class CarTester {
        public static void main(String[] args) {
            Cars[] cars={new Sedan(21999.99,"Grey",18.5),
                    new Truck(89899.99,"Black",9999.99)};
            for (Cars cars1:cars){
                System.out.println("The price is "+cars1.calculateSalsePrice());
            }
        }
    }