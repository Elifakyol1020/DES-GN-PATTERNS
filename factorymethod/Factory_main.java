package factorymethod;

public class Factory_main {
    public static void main(String[] args){
        Coupon_Factory factory=new Coupon_Factory();
        coupon coupon1=factory.coupon(30);
        System.out.println(coupon1.message());
    }
}
