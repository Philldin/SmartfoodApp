/**
 * Created by Caio Ribeiro on 01/05/2015.
 */
package com.si.smartfood.Model;

import java.util.ArrayList;


public class AppPrato {
    int Calorias, CodPrato;
    ArrayList Ingredientes;
    String Nome, EndImagem;
    double Valor;

    AppPrato()
    {

    }
    public void Inserir(String novoNome, int novoCalorias, String novoImagem, ArrayList novoIngredientes, double novoValor)
    {
        setNome(novoNome);
        setCalorias(novoCalorias);
        setEndImagem(novoImagem);
        setIngredientes(novoIngredientes);
        setValor(novoValor);


    }
    public void Excluir(int codPrato)
    {

    }
    public void Consultar(int codPrato)
    {

    }
    public void ConsultarTodos()
    {

    }
    public void ConsultarTodos(int codRestaurante)
    {

    }
    public void Alterar(String novoNome, int novoCalorias, String novoImagem, ArrayList novoIngredientes, double novoValor, int codPrato)
    {
        //FALTA LOCALIZAR PELO CODIGO O PRATO
        setNome(novoNome);
        setCalorias(novoCalorias);
        setEndImagem(novoImagem);
        setIngredientes(novoIngredientes);
        setValor(novoValor);
    }
    public int getCalorias() {
        return Calorias;
    }

    public void setCalorias(int calorias) {
        Calorias = calorias;
    }

    public int getCodPrato() {
        return CodPrato;
    }

    public void setCodPrato(int codPrato) {
        CodPrato = codPrato;
    }

    public ArrayList getIngredientes() {
        return Ingredientes;
    }

    public void setIngredientes(ArrayList ingredientes) {
        Ingredientes = ingredientes;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEndImagem() {
        return EndImagem;
    }

    public void setEndImagem(String endImagem) {
        EndImagem = endImagem;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double valor) {
        Valor = valor;
    }


}
