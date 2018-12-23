package com.pixeldi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckoutService {

    @Autowired
    private final Discountable discountable;


    @Autowired
    public CheckoutService(Discountable discountable) {
        this.discountable = discountable;
    }

    public double checkout(double shoppingCartTotal) {
        double totalAfterDiscount = shoppingCartTotal - (shoppingCartTotal * discountable.getDiscount());
        System.out.printf("%nShopping cart initially [$%.2f] with a discount of %.2f%% = [$%.2f]%n%n",
                shoppingCartTotal,
                discountable.getDiscount() * 100,
                totalAfterDiscount);

        return totalAfterDiscount;
    }

    @Override
    public String toString() {
        return "CheckoutService{" +
                "discountable=" + discountable +
                '}';
    }
}
