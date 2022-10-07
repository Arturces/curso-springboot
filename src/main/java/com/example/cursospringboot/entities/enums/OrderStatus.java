package com.example.cursospringboot.entities.enums;

public enum OrderStatus {

    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code; //codigo do tipo enumerado

    private OrderStatus(int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }

    public static OrderStatus valueOf(int code) {
        for (OrderStatus value : OrderStatus.values()) {// percorre todos os valores possiveis do tipo enumerado e vai testar.
            if (value.getCode() == code) { //o codigo do pagamento foi igual ao codigo que estamos querendo, ele vai retornar o valor qu queremos
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }
}
