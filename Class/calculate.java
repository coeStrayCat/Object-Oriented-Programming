class Calculate {
  private int daysWorked;
  private int taxPercent;
  protected int dailyRate;
  public String employeeName;
  public String employeePosition;
  public int age;

   public Calculate(String employeeName,  String employeePosition, int age) {
    this.employeeName = employeeName;
    this.employeePosition = employeePosition;
    this.age = age;
    this.daysWorked = 20;
    this.dailyRate = 750;
    this.taxPercent = 3;
  }
  public Calculate(int daysWorked, int dailyRate, int taxPercent) {
    this.daysWorked = daysWorked;
    this.dailyRate = dailyRate;
    this.taxPercent = taxPercent;
  }
  public Calculate() {

  }
   
}


// public int getDaysWorked() {
//     return daysWorked;
//   }

//   public void setDaysWorked(int daysWorked) {
//     this.daysWorked = daysWorked;
//   }
//   public int getTaxPercent() {
//     return taxPercent;
//   }

//   public void setTaxPercent(int taxPercent) {
//     this.taxPercent = taxPercent;
//   }

//   public int getDailyRate() {
//     return dailyRate;
//   }
//   public void setDailyRate(int dailyRate) {
//     this.dailyRate = dailyRate;
//   }
//   public String getEmployeeName() {
//     return employeeName;
//   }
//   public void setEmployeeName(String employeeName) {
//     this.employeeName = employeeName;
//   }
 