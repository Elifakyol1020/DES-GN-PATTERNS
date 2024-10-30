package factorymethod;

public class Coupon_Factory {
    public static coupon coupon(int point){
        if(point<50){
            return new Food_coupon();
        }else
            return new Electronic_Coupon();
    }
}
