package com.si.smartfood.Model;

/**
 * Created by Caio Ribeiro on 01/05/2015.
 */
public class AppRestaurante
{
    int CNPJ, CEP, Telefone;
    String RazaoSocial, Nome, Endereco, Bairro , Estado, Municipio, email;


    public void Inserir(String novoNome, String novoBairro, int novoCEP, int novoCNPJ, String novoEmail, String novoEndereco, String novoEstado, String novoMunicipio, String novoRazao, int novoTelefone)
    {
        setNome(novoNome);
        setBairro(novoBairro);
        setCEP(novoCEP);
        setCNPJ(novoCNPJ);
        setEmail(novoEmail);
        setEndereco(novoEndereco);
        setEstado(novoEstado);
        setMunicipio(novoMunicipio);
        setRazaoSocial(novoRazao);
        setTelefone(novoTelefone);
    }
    public void Consultar(int codRestaurante)
    {

    }
    public void Excluir()
    {

    }
    public void Alterar(int codRestaurante, String novoNome, String novoBairro, int novoCEP, int novoCNPJ, String novoEmail, String novoEndereco, String novoEstado, String novoMunicipio, String novoRazao, int novoTelefone)
    {
    //FALTA LOCALIZAR RESTAURANTE PELO CODIGO
        setNome(novoNome);
        setBairro(novoBairro);
        setCEP(novoCEP);
        setCNPJ(novoCNPJ);
        setEmail(novoEmail);
        setEndereco(novoEndereco);
        setEstado(novoEstado);
        setMunicipio(novoMunicipio);
        setRazaoSocial(novoRazao);
        setTelefone(novoTelefone);
    }
    public int getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int telefone) {
        Telefone = telefone;
    }

    public String getRazaoSocial() {
        return RazaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        RazaoSocial = razaoSocial;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEndereço() {
        return Endereco;
    }

    public void setEndereco(String endereço) {
        Endereco = endereço;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public void setMunicipio(String municipio) {
        Municipio = municipio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
