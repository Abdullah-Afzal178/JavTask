import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<BankingSystem> accounts = new ArrayList<>();
        String path = "/home/zeeshan/Downloads/BankingSystem1/src/Account_Details.csv";
        String line = "";
        try{
            FileReader file=new FileReader(path);
            BufferedReader buffer=new BufferedReader(file);
            while((line=buffer.readLine())!=null){
                BankingSystem acc=new BankingSystem();
                acc.setAccount_Number(Integer.parseInt((line.split(","))[0]));
                acc.setName((line.split(","))[1]);
                acc.setBalance(Double.parseDouble((line.split(","))[2]));
                accounts.add(acc);
            }
        }catch (Exception e){
            System.out.println(e);
        }
        while (true) {
            BankingSystem new_account = new BankingSystem();
            System.out.println("Choose an option:");
            System.out.println("1.Add account:");
            System.out.println("2.Remove account:");
            System.out.println("3.Check Balance:");
            System.out.println("4.Deposit Amount:");
            System.out.println("5.Withdraw Amount:");
            System.out.println("6.To get all account details.");
            System.out.println("7: To transfer to another account.");
            System.out.println("8. To exit");
            try {
                Scanner user_input = new Scanner(System.in);
                int choice = user_input.nextInt();
                if (choice == 8) {
                    System.out.println("######################## Thank You ########################");
                    break;
                }
                if (choice == 1) {
                    if (new_account.addAccount()) {
                        accounts.add(new_account);
                        System.out.println("########################### Account Added ###########################");
                    }
                }
                if (choice == 2) {
                    System.out.println("######################## Enter Account Number you want to remove ########################");
                    try {
                        Scanner user_Input = new Scanner(System.in);
                        int acc_number = user_Input.nextInt();
                        for (BankingSystem Current_Account : accounts) {
                            if (Current_Account.Search(acc_number)) {
                                accounts.remove(Current_Account);
                                System.out.println("#################  Account with account number (" + acc_number + ") has been removed. #####################");
                                break;
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Enter valid Account Number.");
                    }
                }
                if (choice == 3) {
                    System.out.println("######################## Enter Account Number you want to check balance: ########################");
                    try {
                        Scanner user_Input = new Scanner(System.in);
                        int acc_number = user_Input.nextInt();
                        for (BankingSystem Current_Account : accounts) {
                            if (Current_Account.Search(acc_number)) {
                                System.out.println("######################## Your account balance is: " + Current_Account.checkBalance() + "  ########################");
                                break;
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Enter Valid Account Number.");

                    }
                }
                if (choice == 4) {
                    double amount;
                    System.out.println("######################## Enter Account Number you want to Deposit: ########################");
                    try {
                        Scanner user_Input = new Scanner(System.in);
                        int acc_number = user_Input.nextInt();
                        System.out.println("######################## Enter Amount you want to Deposit: ########################");
                        Scanner user = new Scanner(System.in);
                        amount = user.nextDouble();
                        for (BankingSystem Current_Account : accounts) {
                            if (Current_Account.Search(acc_number)) {
                                Current_Account.deposit(amount);
//                                System.out.println("########################  You new balance is: " + Current_Account.checkBalance() + "  ########################");
                                break;
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Enter Valid Details.");

                    }
                }
                if (choice == 5) {
                    double amount;
                    System.out.println("######################## Enter Account Number you want to Withdraw: ########################");
                    try {
                        Scanner user_Input = new Scanner(System.in);
                        int acc_number = user_Input.nextInt();
                        System.out.println("######################## Enter Amount you want to withdraw: ########################");
                        Scanner user = new Scanner(System.in);
                        amount = user.nextDouble();
                        for (BankingSystem Current_Account : accounts) {
                            if (Current_Account.Search(acc_number)) {
                                Current_Account.withdraw(amount);
//                                System.out.println("########################  You new balance is: " + Current_Account.checkBalance() + "  ########################");
                                break;
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Enter Valid Details.");

                    }
                }
                if (choice == 6) {
                    for (BankingSystem account : accounts) {
                        System.out.println(account);
                    }

                }
                if (choice == 7) {
                    double amount;
                    try {
                        System.out.println("Enter account you want to transfer from:");
                        Scanner user_Input = new Scanner(System.in);
                        int from = user_Input.nextInt();
                        System.out.println("Enter account you want to transfer to:");
                        Scanner user_Input1 = new Scanner(System.in);
                        int to = user_Input1.nextInt();

                        System.out.println("Enter amount to transfer");
                        Scanner in = new Scanner(System.in);
                        amount = in.nextDouble();


                        for (BankingSystem Current_Account : accounts) {
                            if (Current_Account.Search(from)) {
                                Current_Account.withdraw(amount);
                                break;
                            }
                        }
                        for (BankingSystem Current_Account : accounts) {
                            if (Current_Account.Search(to)) {
                                Current_Account.deposit(amount);
                                System.out.println("########################  Successfully transfered.  ########################");
                                break;
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Enter a Valid Account Number");
                    }
                }
            } catch (Exception e) {
                System.out.println("Enter a valid choice.");

            }
        }
    }
}