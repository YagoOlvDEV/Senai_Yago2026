public class MainExercicio1 {
    public static void main(String[] args) throws Exception {
       ContaBancaria conta1= new ContaBancaria("Yago de oliveira", 1234, 2291);
       ContaBancaria conta2 = new ContaBancaria("henrique", 1234, 56788);
       ContaBancaria conta3 = new ContaBancaria("henriqueee", 1234, 56777);
       System.out.println("Titular: " + conta1.titular + " - Agencia: "
               + conta1.agencia + " - Numero da Conta: " + conta1.numeroConta + " - Saldo: " + conta1.saldo);
       System.out.println("Titular: " + conta2.titular + " - Agencia: "
               + conta2.agencia + " - Numero da Conta: " + conta2.numeroConta + " - Saldo: " + conta2.saldo);
       System.out.println("Titular: " + conta3.titular + " - Agencia: "
               + conta3.agencia + " - Numero da Conta: " + conta3.numeroConta + " - Saldo: " + conta3.saldo);
    }
}
