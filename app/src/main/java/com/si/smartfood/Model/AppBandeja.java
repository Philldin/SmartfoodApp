package com.si.smartfood.Model;

import java.util.ArrayList;

/**
 * Created by Caio Ribeiro on 01/05/2015.
 */
public class AppBandeja {
    int CodBandeja;
    ArrayList Itens;
    ArrayList Precos;
    ArrayList Qtd;
    Double Total;

    public int getCodBandeja() {
        return CodBandeja;
    }

    public void setCodBandeja(int codBandeja) {
        CodBandeja = codBandeja;
    }

    public ArrayList getItens() {
        return Itens;
    }

    public void setItens(ArrayList itens) {
        Itens = itens;
    }

    public ArrayList getPrecos() {
        return Precos;
    }

    public void setPrecos(ArrayList precos) {
        Precos = precos;
    }

    public ArrayList getQtd() {
        return Qtd;
    }

    public void setQtd(ArrayList qtd) {
        Qtd = qtd;
    }

    public Double getTotal() {
        return Total;
    }

    public void setTotal(Double total) {
        Total = total;
    }
}
