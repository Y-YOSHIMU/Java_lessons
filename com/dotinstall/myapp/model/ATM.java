public class ATM {

    public static int totalMoney = 0;
    public static int numATMs = 0;
    public int money;

    public ATM(int inputMoney) {
        this.money = inputMoney;

        numATMs += 1;
        totalMoney += inputMoney;
    }

    public void withdrawMoney(int amountToWithdraw) {
        if(amountToWithdraw <= this.money) {
            this.money -= amountToWithdraw;
            totalMoney -= amountToWithdraw;
        }
    }

    public static void averageMoney() {
        System.out.println(totalMoney / numATMs);
        // error: non-static variable this cannot be referenced from a static context
        // staticメソッドでインスタンス変数にアクセスしようとしたためエラー
        // System.out.println(this.money);
    }

    public static void main(String[] args) {

        System.out.println("Total number of ATMs: " + ATM.numATMs);

        ATM firstATM = new ATM(1000);
        ATM secondATM = new ATM(500);

        System.out.println("Total number of ATMs: " + ATM.numATMs);

        System.out.println("Total amount of money in all ATMs: " + ATM.totalMoney);
        firstATM.withdrawMoney(500);
        secondATM.withdrawMoney(200);
        System.out.println("Total amount of money in all ATMs: " + ATM.totalMoney);

        // staticメソッドはインスタンスではなくクラス名で呼び出す
        ATM.averageMoney();

        // System.out.println(firstATM.money);
        // System.out.println(secondATM.money);
        // System.out.println(ATM.totalMoney);
        // System.out.println(firstATM.totalMoney);
        // System.out.println(secondATM.totalMoney);
        
    }
}