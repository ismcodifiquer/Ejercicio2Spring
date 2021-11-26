package com.example;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public NotificationService() {
    }

    public String ImprimirSaludo() {
        return "hola como estás";
    }
}
