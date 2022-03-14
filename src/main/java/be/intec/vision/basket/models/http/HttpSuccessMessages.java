package be.intec.vision.basket.models.http;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum HttpSuccessMessages {
    BASKET_ADDED("Product added to the basket based on the given information"),
    BASKET_UPDATED("Product updated based on the new information"),
    BASKET_DELETED("Product deleted based on the given information"),
    BASKETS_DELETED("Products deleted based on the given information"),
    ADDRESS_ADDED("Address added to the basket based on the given information"),
    CONTACT_ADDED("Contact added to the basket based on the given information"),
    PAYMENTS_ADDED("Payments added to the basket based on the given information"),
    PAYMENT_UPDATED("Payment updated based on the new information"),
    ORDERS_ADDED("Orders added to the basket based on the given information"),
    ADDRESS_DELETED("Address deleted based on the given information"),
    CONTACT_DELETED("Contact deleted based on the given information"),
    PAYMENT_DELETED("Payment with the given information deleted"),
    ORDER_DELETED("Order with the given information deleted"),
    BASKET_EXISTS("Given basket exists"),
    CONTACT_EXISTS("Given contact exists"),
    PAYMENT_EXISTS("Given payment exists"),
    ORDER_EXISTS("Given order exists"),
    ADDRESS_EXISTS("Given address exists"),
    PAYMENT_CREATED("Given payment created"),
    BASKET_CREATED("A new basket created"),
    BASKET_ALREADY_EXIST("The basket already exists");

    private final String description;
}
