package javawithout;



public class Bank {



public static void main(String[] args) {



BankA bA = new BankA();

bA.getBalance();



BankB bB = new BankB();

bB.getBalance();



BankC bC = new BankC();

bC.getBalance();





}



}



abstract class Bank1{



public abstract void getBalance();

}



class BankA extends Bank1{



@Override

public void getBalance(){

System.out.println("Deposited: $100 ");

}

}



class BankB extends Bank1{



@Override

public void getBalance(){

System.out.println("Deposited: $150 ");

}

}



class BankC extends Bank1{



@Override

public void getBalance(){

System.out.println("Deposited: $200 ");

}

}

