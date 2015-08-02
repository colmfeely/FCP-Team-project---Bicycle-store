import java.util.ArrayList;

public class Database {
	
	private ArrayList<Bicycle> bicycles;
	private ArrayList<CustomerAccount> customers;
	private ArrayList<Employee> employees;
	private ArrayList<Supplier> suppliers;
	private ArrayList<Transaction> transactions;

	public Database() {
		bicycles = new ArrayList<Bicycle>();
		customers = new ArrayList<CustomerAccount>();
		employees = new ArrayList<Employee>();
		suppliers = new ArrayList<Supplier>();
		transactions = new ArrayList<Transaction>();
	}
	
	public boolean addCustomer(CustomerAccount customer) {
		return customers.add(customer);
	}
	
	public CustomerAccount getCustomer(int id) {
		for(CustomerAccount customer : customers) {
			if(customer.getId() == id)
				return customer;
		}
		// if customer not found return null and output message to cmd line
		System.out.println("Customer not found");
		return null;
	}
	
	public boolean removeCustomer(CustomerAccount customer) {
		return customers.remove(customer);
	}
	
	public boolean addBicycle(Bicycle bicycle) {
		return bicycles.add(bicycle);
	}
	
	public Bicycle getBicycle(String name) {
		for(Bicycle bicycle : bicycles) {
			if(bicycle.getName().equals(name))
				return bicycle;
		}
		// if customer not found return null and output message to cmd line
		System.out.println("Bicycle: "+name+" not found");
		return null;
	}
	
	public boolean removeBicycle(Bicycle bicycle) {
		return bicycles.remove(bicycle);
	}
	
	public boolean addEmployee(Employee employee) {
		return employees.add(employee);
	}
	
	public Employee getEmployee(int id) {
		for(Employee employee : employees) {
			if(employee.getId() == id)
				return employee;
		}
		// if customer not found return null and output message to cmd line
		System.out.println("Employee not found");
		return null;
	}
	
	public boolean removeEmployee(Employee employee) {
		return employees.remove(employee);
	}
	
	public boolean addSupplier(Supplier supplier) {
		return suppliers.add(supplier);
	}
	
	public Supplier getSupplier(int id) {
		for(Supplier supplier : suppliers) {
			if(supplier.getId() == id)
				return supplier;
		}
		// if customer not found return null and output message to cmd line
		System.out.println("Customer not found");
		return null;
	}
	
	public boolean removeSupplier(Supplier supplier) {
		return suppliers.remove(supplier);
	}

	public boolean addTransaction(Transaction transaction) {
		return transactions.add(transaction);
	}
	
	public Transaction getTransaction(int id) {
		for(Transaction transaction : transactions) {
			if(transaction.getTransactionId() == id)
				return transaction;
		}
		// if customer not found return null and output message to cmd line
		System.out.println("Customer not found");
		return null;
	}
	
	public boolean removeTransaction(Transaction transaction) {
		return transactions.remove(transaction);
	}
	
	public ArrayList<Bicycle> getBicycles() {
		return bicycles;
	}

	public void setBicycles(ArrayList<Bicycle> bicycles) {
		this.bicycles = bicycles;
	}

	public ArrayList<CustomerAccount> getCustomers() {
		return customers;
	}

	public void setCustomers(ArrayList<CustomerAccount> customers) {
		this.customers = customers;
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}

	public ArrayList<Supplier> getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(ArrayList<Supplier> suppliers) {
		this.suppliers = suppliers;
	}

	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	}
}
