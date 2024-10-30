package factorymethod;

import java.util.UUID;

public class Electronic_Coupon implements coupon{
    @Override
    public String code() {
        return UUID.randomUUID().toString();
    }

    @Override
    public String message() {
        return "I am a elektronic coupon";
    }
}
