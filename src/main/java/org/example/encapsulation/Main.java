package org.example.encapsulation;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();

        account.setAccNo(1000L);
        account.setName("Pooja");
        account.setEmail("pooja@gmail.com");
        account.setAmount(10000f);

        System.out.println("Account holder name "+account.getName());
        System.out.println("Account No is "+account.getAccNo());
        System.out.println("Account holder email id is "+account.getEmail());
        System.out.println("Balance in account is "+account.getAmount());
    }
}
