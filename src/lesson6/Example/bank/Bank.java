package lesson6.Example.bank;

public class Bank {
    private String name;
    private String logo;
    private Float laiSuat;

    public Bank(String name, String logo, Float laiSuat) {
        this.name = name;
        this.logo = logo;
        this.laiSuat = laiSuat;
    }

    public Bank() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Float getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(Float laiSuat) {
        this.laiSuat = laiSuat;
    }

    protected void  printLaiSuat() {
        System.out.print(laiSuat);
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.printLaiSuat();
    }
}
