package factorymethod;

import java.util.UUID;

public class Food_coupon implements coupon{
    @Override
    public String code() {
        return UUID.randomUUID().toString();
    }

    @Override
    public String message() {
        return "I am a food coupon";
    }
}
