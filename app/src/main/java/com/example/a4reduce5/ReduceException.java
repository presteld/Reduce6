package com.example.a4reduce5;

public class ReduceException extends Exception{
    private int iZaehler =0;
    private int iNenner =0;

    public ReduceException(String message, int iNenner, int iZaehler) {
        super(message);
        this.iNenner = iNenner;
        this.iZaehler = iZaehler;
    }

    public int getiZaehler() {
        return iZaehler;
    }

    public int getiNenner() {
        return iNenner;
    }
}

