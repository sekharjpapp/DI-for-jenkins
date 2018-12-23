package com.pixeldi;

import org.springframework.stereotype.Component;

@Component
public class NightOwlDiscount implements Discountable {

    @Override
    public double getDiscount() {
        return 0.35;
    }


}
