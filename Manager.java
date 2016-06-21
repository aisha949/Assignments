class Manager extends MonthlyEmployee {
	int bonus;
	public Manager(String empname,double emppayRate,int bonus){
		super(empname,emppayRate);
		this.bonus=bonus;
	}
	public void setBonus(int newBonus){
		this.bonus=newBonus;
	}
	public double pay(){
		return payRate;
	}

	
}