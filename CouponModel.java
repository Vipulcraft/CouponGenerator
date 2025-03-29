import java.util.Random;

public class CouponModel {
    private static final int DISCOUNT_DAILY_CUSTOMER = 15;
    private static final int DISCOUNT_NEW_USER = 10;
    private static final int DISCOUNT_SPECIAL_USER = 20;
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public int getDiscountPercentage(String userType) {
        switch (userType) {
            case "Daily Customer":
                return DISCOUNT_DAILY_CUSTOMER;
            case "New User":
                return DISCOUNT_NEW_USER;
            case "Special User":
                return DISCOUNT_SPECIAL_USER;
            default:
                return 0;
        }
    }

    public String generateCouponCode() {
        StringBuilder couponCode = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            couponCode.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return couponCode.toString();
    }
}

