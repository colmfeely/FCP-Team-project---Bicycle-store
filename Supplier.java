public class Supplier {
	
	private String supplierID;
	private String name;
	private String address;
	private String typeOfProduct;

	public Supplier() {
		
		/*
		this.supplierID = supplierID;
		this.name = name;
		this.address = address;
		this.typeOfProduct = typeOfProduct;
		*/
		
	}

	public String getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(String supplierID) {
		this.supplierID = supplierID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTypeOfProduct() {
		return typeOfProduct;
	}

	public void setTypeOfProduct(String typeOfProduct) {
		this.typeOfProduct = typeOfProduct;
	}
	/*public void display(){
		System.out.println(name+ "'s supplier I.D is "+ supplierID+ ". The companies address is '"+ 
				address+"' and the product they sell is "+ typeOfProduct+ ".");
	}*/
	

}

