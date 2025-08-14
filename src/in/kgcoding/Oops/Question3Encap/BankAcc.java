package in.kgcoding.Oops.Question3Encap;

public class BankAcc {
    private int account_number;
    private long balance;

    public BankAcc(int account_number) {
        this.account_number = account_number;
    }

    public void Dipposite(int account_number,long Amount){
       if (this.account_number == account_number ){
         this.balance+=Amount;
           System.out.println("Rs " + Amount + " has been add to your account");
       }else{ System.out.println("this is not  account number you enter   ");}
        System.out.println("your balance is : "+ balance);
    }

    public long WithDrawl(int account_number ,long Ammount){

        if (this.account_number == account_number ){
            this.balance-=Ammount;
            System.out.println("your balance is : "+ balance);
        }else System.out.println("sorry ");
        return Ammount;
    }

    public long CheckBalance(int account_number){
        if (this.account_number == account_number ){
          return balance;
        }else System.out.println("sorry ");
        return 0;
    }

}
