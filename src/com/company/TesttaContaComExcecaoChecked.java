package com.company;

public class TesttaContaComExcecaoChecked {
    public static void main(String[] args) {

        Conta c = new Conta();
        try {
            c.deposita();
        } catch(Exception ex) {
            System.out.println("Tratamento ....");
        }

    }
}
