 class RodarAplicacao {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        //upcast abaixo

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();


        // downcast abaixo ( nao se usa em O a Obj)
        // Gerente gerente = new Funcionario();
        //Vendedor vendedor = (Vendedor) new Funcionario();
    }
}