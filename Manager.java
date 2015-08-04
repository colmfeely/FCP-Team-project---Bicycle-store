import java.util.ArrayList;
import java.util.Scanner;

public class Manager extends Employee{
	
	
	private String division;
	private String speciality;
	
	

	public Manager(int staffID, String name, String phoneNum, String password, String division, String speciality) {
		super(staffID, name, phoneNum, password);
		
		this.division = division;
		this.speciality = speciality;
	
		
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	public void display(){
		System.out.println("Manager");
		System.out.println("Division: "+ division);
		System.out.println("Speciality: "+ speciality);
		super.display();
		
	}
	
	public void addNewSupplier(){
		 Scanner in = new Scanner(System.in);
	        ArrayList <Supplier> supplierList = new ArrayList <Supplier>();
	        char ans;

	        do
	        {
	            Supplier supplier = new Supplier(); 
	            System.out.print("Supplier ID number: ");
	            supplier.setSupplierID(in.next());
	            
	            System.out.print("Supplier Name: ");
	            supplier.setName(in.next());

	            System.out.print("Address: ");
	            supplier.setAddress(in.next());

	            System.out.print("Type of Product: ");
	            supplier.setTypeOfProduct(in.next());

	            supplierList.add(supplier);

	            System.out.print("Would you like to add a new supplier (y/n)? ");
	            String answer = in.next();
	            ans = answer.charAt(0);
	        }while(ans == 'y');

	        for(Supplier supplier: supplierList){
	            System.out.print(supplier.getName()+ " who deals in "+ supplier.getTypeOfProduct()+" has been added as a supplier. ");

	        }
	        System.out.print("The company currently has "+supplierList.size()+ " suppliers");
	        } 
	}


