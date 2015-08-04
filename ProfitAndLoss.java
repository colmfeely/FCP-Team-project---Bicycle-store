import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class ProfitAndLoss {

	      Database data= new Database();
		  private ArrayList<PurchasingTransaction>purchasingTransactions= new ArrayList<PurchasingTransaction>();
		  private ArrayList<SalesTransaction>salesTransactions= new ArrayList<SalesTransaction>();
		  private ArrayList<Transaction> allTransactions=new ArrayList<Transaction>();
		  private boolean profitMaking;
		  private double totalTransactionValue;
		
		
public ProfitAndLoss() {
			this.profitMaking = profitMaking;
			this.totalTransactionValue = totalTransactionValue;
			allTransactions.addAll(purchasingTransactions); // add first arraylist
			allTransactions.addAll(salesTransactions); // add Second arraylist
			
			 
			
		}
	
	public ArrayList<Transaction> getTransactions() {
		return getTransactions();
	}


	public void setTransactions(ArrayList<Transaction> allTransactions) {
		this.allTransactions = allTransactions;
	}







	public boolean isProfitMaking() {
		return profitMaking;
	}


	public void setProfitMaking(boolean profitMaking) {
		this.profitMaking = profitMaking;
	}


	public double getTransactionValue() {
		return totalTransactionValue;
	}


	public void setTransactionValue(double totalTransactionValue) {
		this.totalTransactionValue = totalTransactionValue;
	}
	
	
	public void calculateTransactionValue(){
		double totalValue=0;
		for(Transaction transaction: allTransactions){
		totalValue=totalValue + transaction.getTransactionCost();
		setTransactionValue(totalValue);
		}
		
		
		if(totalValue>0){
			setProfitMaking(true);
		}
		
		
		
	}


	
	public void display() {
		if(profitMaking==true){
			System.out.println("The company is making a profit");
			System.out.println("The companies profit is: €" + getTransactionValue());
		}else if(profitMaking==false){
			System.out.println("The company is making a loss");
			System.out.println("The companies loss is: -€" + getTransactionValue());
			
		}
	}


}
