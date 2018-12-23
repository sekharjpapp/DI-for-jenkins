package com.pixeldi.controller;

import com.pixeldi.CheckoutService;
import com.pixeldi.NightOwlDiscount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ShoppingCartController {

    @Autowired
    private CheckoutService checkoutService;

    @Autowired
    private NightOwlDiscount nightOwlDiscount;

    @GetMapping
    public CheckoutService getDiscount(){
        checkoutService.checkout(200);
        return  checkoutService;
    }
}
