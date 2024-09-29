package encapMulti.MultInterface;

class Customer{
	private String name;
	private String email;
	public Customer(String name, String email) {
		this.name = name;
		this.email = email;	}
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
         return name;	
		}
		public void setEmail( String email) {
			this.email = email;
		}
		public String getEmail() {
			return email;
		}			
		}

class Order{
	private int orderId;
	private int amount;
	private Customer customer;
	public Order(int orderId, int amount, Customer customer) {
		this.orderId = orderId;
		this.amount = amount;
		this.customer = customer;
	}
	public void setOrderId(int orderId) {
		this. orderId=  orderId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setAmount() {
		this.amount= amount;
	}
	public int getAmount() {
		return amount;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer() {
		this.customer= customer;
	}
	public void customerDetails() {
		System.out.println("print Name: "+ customer.getName());
		System.out.println("print email: "+ customer.getEmail());
	}
	public void OrderDetails() {
		System.out.println("print ID: "+ orderId);	
		System.out.println("print Amount :"+ amount);
		customerDetails();
	}
}
public class MultiEncap {
	public static void main(String[] args) {
		Customer customer = new Customer("Devi","Deviammulu97@gmail.com");
		Order order = new Order(4, 400000,customer);
		order.OrderDetails();
			}


}
