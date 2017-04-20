public enum EnumClass{
	CREDIT(30,23),DEBIT(2,245),CASH(123,234);
	
	int fee;
	int amount;
	
	EnumClass(int fee,int amount){
		this.fee=fee;
		this.amount=amount;
	}
	
	public int getFee(){
		return fee;
	}
	
	public int getAmount(){
		return amount;
	}
}