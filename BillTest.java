public class BillTest {
    public static void main(String[] args) {
        Bill myBill = new Bill();
        ElectricityBill myElectricityBill = new ElectricityBill();
    //    Bill[] bills = new Bill[Bill.getTotalCount()];
    //    myBill.setUnitsOfConsumption(30);
        Bill[] bills = new Bill[]{myBill, myElectricityBill};
        System.out.println("heyy smith");

        private getAverageBillAmount(){
            double averageAmount=0;
            for (Bill bill:bills) {
                averageAmount += bill.getBillAmount();
            }
            averageAmount /= bills.length;
            return averageAmount;
        }
    }
}

class Bill {
    // initializer block
    int billNumber;
    private double unitsOfConsumption, unitRate;
    static int count = 1001;

    // constructor
    Bill(int billNumber) { // only one argument constructor
        this.billNumber = billNumber;
        this.unitsOfConsumption = 0;
        this.unitRate = 8;
        count++;
    }

    Bill(int billNumber, double unitsOfConsumption, double unitRate) { // overloaded constructor
        this.billNumber = billNumber;
        this.unitsOfConsumption = unitsOfConsumption;
        this.unitRate = unitRate;
        count++;
    }

    Bill() { // Default Constructor
        this.billNumber = count++;
        this.unitsOfConsumption = 100;
        this.unitRate = 8;
    }

    Bill(Bill myBill) { // copy constructor
        this.billNumber = myBill.billNumber;
        this.unitsOfConsumption = myBill.unitsOfConsumption;
        this.unitRate = myBill.unitRate;
        count++;
    }
    // constructor ends

    // methods
    // getters
    int getBillNumber() {
        return billNumber;
    }

    double getUnitsOfConsumption() {
        return unitsOfConsumption;
    }

    double getUnitRate() {
        return unitRate;
    }

    // setters
    // void setBillNumber(int billNumber){
    // this.billNumber = billNumber;
    // }
    void setUnitsOfConsumption(double unitsOfConsumption) {
        this.unitsOfConsumption = unitsOfConsumption;
    }

    void setUnitRate(double unitRate) {
        this.unitRate = unitRate;
    }

    double getBillAmount() {
        return unitsOfConsumption * unitRate;
    }

    // other methods
    static int getTotalCount() {
        return (count - 1001);
    }

    boolean equals(Bill bill1) {
        return this.billNumber == bill1.billNumber;
    }

    public String toString() {
        return "Bill Number: " + billNumber + "\nUnits of Consumption: " + unitsOfConsumption + "\nUnit Rate: "
                + unitRate + "\nBill Amount: " + getBillAmount();
    }

}

class ElectricityBill extends Bill {
    double fixedCharge;

    ElectricityBill(int billNumber, double unitsOfConsumption, double unitRate, double fixedCharge) { // Overloaded
                                                                                                      // Constructor
        super.billNumber = billNumber;
        super.setUnitsOfConsumption(unitsOfConsumption);
        super.setUnitRate(unitRate);
        this.fixedCharge = fixedCharge;
    }

    ElectricityBill() {
        super();
        // super(billNumber, unitsOfConsumption, unitRate);
        this.fixedCharge = 100; // fixed charge initialized
    }

    double getFixedCharge() {
        return fixedCharge;
    }

    void setFixedCharge(double fixedCharge) {
        this.fixedCharge = fixedCharge;
        return;
    }

    double getBillAmount() {
        return getUnitsOfConsumption() * getUnitRate() + this.fixedCharge;
    }
}
