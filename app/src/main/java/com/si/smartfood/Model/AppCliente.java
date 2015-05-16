package com.si.smartfood.Model;

/**
 * Created by Caio Ribeiro on 01/05/2015.
 */
public class AppCliente
{
    int Telefone, CodCli;
    String Nome, Email, Estado, Cidade;
    String Senha, Repetir_Senha;

    AppCliente()
    {

    }


    public void Login()
    {

    }
    public void Inserir(String novoNome,String novoEmail, int novoTelefone, String novoEstado, String novoCidade)
    {
        //Criar novo código de cliente
        setCidade(novoCidade);
        setEmail(novoEmail);
        setEstado(novoEstado);
        setNome(novoNome);
        setTelefone(novoTelefone);
    }
    public void Excluir()
    {
        //Esconder registro a partir do código do cliente
    }
    public void Consultar(int codCli)
    {

        Nome = getNome();
        Email = getEmail();
        Estado = getEstado();
        Cidade = getCidade();
        Telefone = getTelefone();
    }
    public void Alterar(String novoNome,String novoEmail, int novoTelefone, String novoEstado, String novoCidade)
    {
        setCidade(novoCidade);
        setEmail(novoEmail);
        setEstado(novoEstado);
        setNome(novoNome);
        setTelefone(novoTelefone);
    }

    public int getCodCli() {
        return CodCli;
    }

    public void setCodCli(int codCli) {
        CodCli = codCli;
    }
    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int telefone) {
        Telefone = telefone;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public String getRepetir_Senha() {
        return Repetir_Senha;
    }

    public void setRepetir_Senha(String repetir_Senha) {
        Repetir_Senha = repetir_Senha;
    }
}
