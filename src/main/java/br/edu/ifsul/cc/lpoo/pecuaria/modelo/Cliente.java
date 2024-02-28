/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.pecuaria.modelo;

import java.util.Calendar;

/**
 *
 * @author damen
 */
public class Cliente extends Pessoa{
    
    private String cnpj;
    private Calendar data_ultima_compra;
    private float valor_compras;

    public Cliente() {
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Calendar getData_ultima_compra() {
        return data_ultima_compra;
    }

    public void setData_ultima_compra(Calendar data_ultima_compra) {
        this.data_ultima_compra = data_ultima_compra;
    }

    public float getValor_compras() {
        return valor_compras;
    }

    public void setValor_compras(float valor_compras) {
        this.valor_compras = valor_compras;
    }
    
}
