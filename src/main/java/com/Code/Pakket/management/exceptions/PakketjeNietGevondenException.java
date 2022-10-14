package com.Code.Pakket.management.exceptions;

public class PakketjeNietGevondenException extends RuntimeException{
    public PakketjeNietGevondenException(int id)
    {
        super("Geen pakketje gevonden met id: "+ id);
    }
}
