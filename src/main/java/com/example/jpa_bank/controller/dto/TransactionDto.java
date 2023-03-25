package com.example.jpa_bank.controller.dto;

import lombok.Data;

import java.math.BigInteger;

@Data
public class TransactionDto {
    private Integer id;
    private int origen;
    private int destination;
    private int amount;
    private int transaccionId;
    private int cuentaDestino;
    private int cuentaOrigen;
    private int monto;

}
