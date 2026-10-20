
public class BANKACCOUNT {

        private String Accountname;
        private double balance;
        static String BankName;
        static String Banklocation;

    BANKACCOUNT() {
            Accountname = "DAHABSHIIL BANK";
            balance = 0.0;
            BankName = "";
            Banklocation = "WADAJIR";

        }


    public String getAccountname() {
            return Accountname;

    }
    public double getbalance(){
        return balance;

    }

    public String getBankName() {
        return BankName;
    }


    public String getBanklocation() {
        return Banklocation;
    }

    public void setAccountname(String accountname) {
        Accountname = accountname;

    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void setBankName(String bankName) {
        BankName = bankName;
    }

    public static void setBanklocation(String banklocation) {
        Banklocation = banklocation;
    }
    void deposit(double amount) {


        balance = balance + amount;
    }
    void withdraw(double amount) {
        if (balance <= amount)
            balance = balance - amount;
        else
            System.out.println("insuffient your balance");

    }
    void  displayaccINFO(){
        System.out.println("ACCOUNT name :"+Accountname);
        System.out.println("BALANCE :"+balance);


    }
    void displaybankInfo(){
        System.out.println("BANK LOCATION :"+Banklocation);
        System.out.println("bank name :"+BankName);
    }
    }




