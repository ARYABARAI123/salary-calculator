public abstract class Employee
{
Scanner sc=new Scanner(System.in);
private String empName,empAddress,empDesignation,empDept,
doj,bankName;
private long UAN,PF_NO,ESINo,empId,bankAcctNo;
private int totalWorkingDays,paidDays,leavesTaken,lopDay
s;
private double grosswage,totalEarning,totalDeductions,bas
icWage,hra,conveyanceAllowances,
medicalAllowances,otherAllowances,epf,esi,pt,loan
Recovery;
public String getEmpName() {
return empName;
}
public void setEmpName(String empName) {
this.empName = empName;
}
public String getEmpAddress() {
return empAddress;
}
public void setEmpAddress(String empAddress) {
this.empAddress = empAddress;
}
public String getEmpDesignation() {
return empDesignation;
}
public void setEmpDesignation(String empDesignation) {
this.empDesignation = empDesignation;
}
public String getEmpDept() {
return empDept;
}
public void setEmpDept(String empDept) {
this.empDept = empDept;
}
Java_Assignment_5 7
public String getDoj() {
return doj;
}
public void setDoj(String doj) {
this.doj = doj;
}
public String getBankName() {
return bankName;
}
public void setBankName(String bankName) {
this.bankName = bankName;
}
public long getUAN() {
return UAN;
}
public void setUAN(long UAN) {
this.UAN = UAN;
}
public long getPF_NO() {
return PF_NO;
}
public void setPF_NO(long PF_NO) {
this.PF_NO = PF_NO;
}
public long getESINo() {
return ESINo;
}
public void setESINo(long ESINo) {
this.ESINo = ESINo;
}
public long getEmpId() {
return empId;
}
public void setEmpId(long empId) {
this.empId = empId;
}
public long getBankAcctNo() {
return bankAcctNo;
}
public void setBankAcctNo(long bankAcctNo) {
this.bankAcctNo = bankAcctNo;
}
public int getTotalWorkingDays() {
return totalWorkingDays;
}
public void setTotalWorkingDays(int totalWorkingDays) {
this.totalWorkingDays = totalWorkingDays;
}
public int getPaidDays() {
return paidDays;
}
public void setPaidDays(int paidDays) {
this.paidDays = paidDays;
}
Java_Assignment_5 9
public int getLeavesTaken() {
return leavesTaken;
}
public void setLeavesTaken(int leavesTaken) {
this.leavesTaken = leavesTaken;
}
public int getLopDays() {
return lopDays;
}
public void setLopDays(int lopDays) {
this.lopDays = lopDays;
}
public double getGrosswage() {
return grosswage;
}
public void setGrosswage(double grosswage) {
this.grosswage = grosswage;
}
public double getTotalEarning() {
return totalEarning;
}
public void setTotalEarning(double totalEarning) {
this.totalEarning = totalEarning;
}
public double getTotalDeductions() {
return totalDeductions;
}
Java_Assignment_5 10
public void setTotalDeductions(double totalDeductions) {
this.totalDeductions = totalDeductions;
}
public double getBasicWage() {
return basicWage;
}
public void setBasicWage(double basicWage) {
this.basicWage = basicWage;
}
public double getHra() {
return hra;
}
public void setHra(double hra) {
this.hra = hra;
}
public double getConveyanceAllowances() {
return conveyanceAllowances;
}
public void setConveyanceAllowances(double conveyanceAllo
wances) {
this.conveyanceAllowances = conveyanceAllowances;
}
public double getMedicalAllowances() {
return medicalAllowances;
}
public void setMedicalAllowances(double medicalAllowance
s) {
Java_Assignment_5 11
this.medicalAllowances = medicalAllowances;
}
public double getOtherAllowances() {
return otherAllowances;
}
public void setOtherAllowances(double otherAllowances) {
this.otherAllowances = otherAllowances;
}
public double getEpf() {
return epf;
}
public void setEpf(double epf) {
this.epf = epf;
}
public double getEsi() {
return esi;
}
public void setEsi(double esi) {
this.esi = esi;
}
public double getPt() {
return pt;
}
public void setPt(double pt) {
this.pt = pt;
}
public double getLoanRecovery() {
Java_Assignment_5 12
return loanRecovery;
}
public void setLoanRecovery(double loanRecovery) {
this.loanRecovery = loanRecovery;
}
public abstract void salaryCalculation();
public void getEmployeeDetails()
{
System.out.println("Employee Id");
long eid=sc.nextLong();
setEmpId(eid);
System.out.println("Employee Name");
String ename=sc.next();
setEmpName(ename);
System.out.println("Employee Designation");
String d = sc.next();
setEmpDesignation(d);
System.out.println("Employee Department");
String dept=sc.next();
setEmpDept(dept);
System.out.println("Employee DOJ");
String doj=sc.next();
setDoj(doj);
System.out.println("Employee UAN");
long u=sc.nextLong();
setUAN(u);
System.out.println("Employee PF Number");
long pf=sc.nextLong();
setPF_NO(pf);
System.out.println("Employee ESI Number");
long esi=sc.nextLong();
Java_Assignment_5 13
setEsi(esi);
System.out.println("Employee Bank Name");
String bn=sc.next();
setBankName(bn);
System.out.println("Employee Bank Account No");
long acct=sc.nextLong();
setBankAcctNo(acct);
System.out.println("Employee Gross Wage");
double gw=sc.nextDouble();
setGrosswage(gw);
setTotalWorkingDays(30);
setLopDays(1);
setPaidDays(getTotalWorkingDays()-getLopDays());
System.out.println("Employee leaves taken");
int lt=sc.nextInt();
setLeavesTaken(lt);
}
}
