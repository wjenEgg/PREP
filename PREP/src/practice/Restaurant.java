package practice;


import java.util.Date;
import java.util.Queue;
import java.util.Set;


public class Restaurant {
	
	public class Customer{
		private String cID;
		private String cName;
		private Set<Order> orderHistory; 
		
		public Customer(){}
		
		public void CreateOrder(Order o){ }
		public void DeleteOrder(Order o){ }
		public void UpdateOrder(Order o){ }
		
		public String CusID(){
			return this.cID;
		}
		public String CusName(){
			return this.cName;
		}
		public Order GetOrder(String oID){
			//return the Order that matches orderID
			return new Order(oID);
		}
	}
	
	public class Order{
		private String id;
		private Dish[] d;
		private float oPrice;
		private Date date;
		
		public Order(String id){
			this.id = id;
		}
		public void AddDish(Dish d){ 
			//Need to update oPrice
		}
		public void DeleteDish(Dish D){
			//Need to update oPrice
		}
		public Dish GetNextDish(){
			//Return next dish without any chef assigned
			return new Dish();
		}
		public float GetOrderPrice(){
			return this.oPrice;
		}
	}
	
	public class Dish{
		private String dId;
		private String dName;
		private float dPrice;
		private Chef c;
	}
	
	public class Chef{
		private String cId;
		//True if occupied
		private boolean IsOccupied;
		
		public boolean getStatus(){
			return this.IsOccupied;
		}
	}
	
	public class CusControl{
		
		private Set<Customer> customer;
		
		public void AddCustomer(Customer c){}
		public void DeleteCustomer(Customer c){}
		public void UpdateCustomer(Customer c){}
		public int GetSize(){
			return -1;
		}
		public Customer GetCustomer(String cid){
			return new Customer();
		}
	}
	
	public class ChefControl{
		private Set<Chef> chefBusy;
		private Queue<Chef> chefAvailable;
		
		public ChefControl(){ }
		
		public boolean AssignChef(Order o){ return true;}
		public void ReleaseChef(Chef c){}
		
	}
	
	public class Admin{
		CusControl cusControl = new CusControl();
		ChefControl chefControl = new ChefControl();
	}

}
