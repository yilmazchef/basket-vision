package be.intec.vision.basket.models.http;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum HttpFailureMessages {
    USER_DOES_NOT_EXIST("There is no such user with the given information"),
    STORE_DOES_NOT_EXIST("There is no such store with the given information"),
    BASKET_CURRENT_PRICE_DOES_NOT_MATCH("Given price does not match with the current price of the basket"),
    INGREDIENTS_DOES_NOT_EXIST("There are no such ingredients"),
    BASKET_OUT_OF_STOCK("Store does not have enough basket in their stock"),
    BASKET_DOES_NOT_EXIST("There is no such basket with the given information"),
    BASKET_EXIST_CANNOT_BE_CREATED("The basket you wanted to add already exists in the basket"),
    BASKET_DOES_NOT_EXISTS_CANNOT_BE_UPDATED("There is no such basket with the given information. Therefore, it cannot be updated."),
    BASKET_DOES_NOT_EXISTS_CANNOT_BE_DELETED("There is no such basket with the given information. Therefore, it cannot be deleted."),
    UNKNOWN_FAILURE("An unknown exception happened."),
    USER_HAS_NO_BASKETS_IN_THIS_STORE("Given user does not have any basket from the given store"),
    USER_HAS_NO_BASKETS("Basket is empty based on the given external user id and session information"),
    SESSION_DOES_NOT_EXISTS("Given user does/did not have such a session"),
    INVALID_BASKET_QUANTITY("Basket quantity can not be negative or new quantity is equal to the old ones"),
    USER_HAS_NO_ADDRESS("Given user does not have any address yet"),
    USER_HAS_NO_CONTACT("Given user does not have any contact yet"),
    ADDRESS_DOES_NOT_EXIST("Given address does not exist"),
    CONTACT_DOES_NOT_EXIST("Given contact does not exist"),
    ADDRESS_ALREADY_EXISTS("The address you wanted to create already exists"),
    CONTACT_ALREADY_EXISTS("The contact you wanted to create already exists"),
    PAYMENT_ALREADY_EXISTS("The payment you wanted to create already exists"),
    ORDER_ALREADY_EXISTS("The order you wanted to create already exists"),
    PAYMENT_DOES_NOT_EXIST_IN_BASKET("Given payment does not exist in basket"),
    ADDRESS_DOES_NOT_EXIST_IN_BASKET("Given address does not exist in basket"),
    CONTACT_DOES_NOT_EXIST_IN_BASKET("Given contact does not exist in basket"),
    ORDER_DOES_NOT_EXIST_IN_BASKET("Given order does not exist in basket"),
    BASKET_DOES_NOT_EXIST_IN_BASKET("Given basket does not exist in basket"),
    USER_HAS_NO_SUCH_BASKET("Given user did not add this basket to basket"),
    REQUIRED_FIELDS_ARE_MISSING_IN_CREATE_REQUEST("Required fields are missing in create request"),
    BASKET_COULD_NOT_BE_UPDATED("For an unknown reason basket could not be updated"),
    BASKET_COULD_NOT_BE_DELETED("Basket can not be deleted due to an unknown reason"),
    USER_HAS_NO_PAYMENT("Given user does not have any payment"),
    USER_HAS_NO_ORDERS("Given user has no orders in basket"),
    USER_HAS_NO_ORDER_FROM_THIS_STORE("Given user has no order from given store"),
    FAILED_TO_CREATE_BASKET("There has been a problem while creating the BASKET"),
    ORDER_COULD_NOT_BE_DELETED("Given order coul not be deleted"),
    BASKET_IS_REQUIRED("Basket is required."),
    FAILED_TO_UPDATE_BASKET("There has been a problem while updating the BASKET"),
    BASKET_NOT_FOUND("Basket is not found"),
    BASKET_ID_IS_REQUIRED("Basket ID is required"),
    BASKET_TITLE_IS_REQUIRED("Basket title is required"),
    BASKET_ALREADY_EXIST("The basket you wanted to create already exists\"");

    private final String description;
}
