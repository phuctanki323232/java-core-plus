package lesson5.Activity52;

public class CheckResult {
    private int numOfPass;
    private int numOfFail;

    public CheckResult(int numOfPass, int numOfFail) {
        this.numOfPass = numOfPass;
        this.numOfFail = numOfFail;
    }

    public int getNumOfPass() {
        return numOfPass;
    }

    public void setNumOfPass(int numOfPass) {
        this.numOfPass = numOfPass;
    }

    public int getNumOfFail() {
        return numOfFail;
    }

    public void setNumOfFail(int numOfFail) {
        this.numOfFail = numOfFail;
    }
}
