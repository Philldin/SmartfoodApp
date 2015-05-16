package com.si.smartfood.Model;

import java.sql.Date;
import java.util.ArrayList;

/**
 * Created by Caio Ribeiro on 01/05/2015.
 */
public class AppPedido {
    int CodPedido;
    Date DataPgto;
    double Total;
    ArrayList ItensPedidos;
    public void Inserir(Date novoDataPgto, double novoTotal, ArrayList novoItensPedidos, ArrayList novoValorItemPedido)
    {
        setDataPgto(novoDataPgto);
        setItensPedidos(novoItensPedidos);
        setTotal(novoTotal);
    }
    public void Consultar(int codPedido)
    {

    }
    public void ConsultarPedCli(int codCliente)
    {

    }
    public void Excluir(int codPedido)
    {

    }

    public int getCodPedido() {
        return CodPedido;
    }

    public Date getDataPgto() {
        return DataPgto;
    }

    public double getTotal() {
        return Total;
    }

    public ArrayList getItensPedidos() {
        return ItensPedidos;
    }



    public void setCodPedido(int codPedido) {
        CodPedido = codPedido;
    }

    public void setDataPgto(Date dataPgto) {
        DataPgto = dataPgto;
    }

    public void setTotal(double total) {
        this.Total = total;
    }

    public void setItensPedidos(ArrayList itensPedidos) {
        ItensPedidos = itensPedidos;
    }


}
