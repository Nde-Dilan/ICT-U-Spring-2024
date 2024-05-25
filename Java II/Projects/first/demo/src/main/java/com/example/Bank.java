package main.java.com.example;


interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    double viewBalance();
  }
  
  class Bank {
    private List<Account> accounts;
  
    public Bank() {
      this.accounts = new ArrayList<>();
    }
  
    public void addAccount(Account account) {
      accounts.add(account);
    }
  }
  
  class SavingsAccount implements Account {
    // Implement methods for deposit, withdraw, calculateInterest specific to SavingsAccount
  }
  
  class CurrentAccount implements Account {
    // Implement methods for deposit, withdraw specific to CurrentAccount
  }
  