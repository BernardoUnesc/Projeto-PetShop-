package br.pet.getset;

public class FuncionarioGetSet {

    private String Nome;
    private String Cargo;
    private String Sexo;
    private String Endereco;
    private String Email;
    private String CPF;
    private int Idade;
    private int id;
    private long Num_Pis;
    private long Telefone;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public long getNum_Pis() {
        return Num_Pis;
    }

    public void setNum_Pis(long Num_Pis) {
        this.Num_Pis = Num_Pis;
    }

    public long getTelefone() {
        return Telefone;
    }

    public void setTelefone(long Telefone) {
        this.Telefone = Telefone;
    }

    @Override
    public String toString() {
        return "Nome = " + Nome + "\nCargo = " + Cargo + "\nSexo = " + Sexo + "\nEndereço = " + Endereco + "\nEmail = " + Email + "\nIdade = " + getIdade() + "\nCPF = " + getCPF() + "\nNúmero do pis = " + getNum_Pis() + "\nTelefone = " + getTelefone();
    }

}
