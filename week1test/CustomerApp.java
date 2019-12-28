import java.util.*;
import java.lang.*;
public class CustomerApp {
	public static void main(String[] args) {
			Customer [] cust=new Customer[10];
			
			cust[0]=new Customer(101,"Gargesh","8765438976","gar@xyz.com");
			cust[1]=new Customer(102,"josh","8765438976","ga@xyz.com");
			cust[2]=new Customer(103,"Gary","8765438976","gawer@xyz.com");
			int i=4;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Id:");
			String id=sc.next();
			System.out.println("Enter password:");
			String pass=sc.next();
			
			if(id.equals("ABCCust") && pass.equals("abc@123")){
				System.out.println("Choose Option: \n1.Add Customer Details\n"
						+ "2.Print Customer Details\n3.Edit Existing Details\n4.Delete Existing Customer details\n5.Exit");
				int option=sc.nextInt();
				switch(option){
				case 1:
					if(i<9)
					{
						System.out.print("Enter id:");
						int id1=sc.nextInt();
						System.out.print("Enter name:");
						String n=sc.next();
						System.out.print("Enter email:");
						String e=sc.next();
						System.out.print("Enter mobile no.:");
						String mo=sc.next();
						cust[i]=new Customer(id1,n,mo,e);
						i++;
						System.out.println("Added Successfully");
						break;
					}
					else
						System.out.println("List full");
					break;
				case 2:
					System.out.println("Enter customer Id:");
					int custId1=sc.nextInt();
					for(int j=0;j<i;j++){
						if(custId1==cust[j].id){
							cust[j].toString();
						}
					}
					break;
				case 3:
					System.out.println("Enter customer Id:");
					int custId2=sc.nextInt();
					for(int j=0;j<cust.length;j++){
						if(custId2==cust[j].id){
							System.out.println("Select Detail to update:\n1.ID\n2.Name\n3.Email\n4.Mobile number");
							int c=sc.nextInt();
							switch(c){
							case 1:
								System.out.println("Enter new Id:");
								cust[j].setId(sc.nextInt());
								break;
							case 2:
								System.out.println("Enter new Name:");
								cust[j].setName(sc.next());
								break;
							case 3:
								System.out.println("Enter new Email:");
								cust[j].setEmail(sc.next());
								break;
							case 4:
								System.out.println("Enter new Mobile no:");
								cust[j].setMobileNo(sc.next());
								break;
							default:
								System.out.println("Invalid Input");
							}
						}
					}
					break;
				case 4:
					if(i>=0)
					{
						System.out.print("Enter Id: ");
						int eid=sc.nextInt();
						for(int m=0;m<=i;m++)
						{
							if(eid==cust[m].getId())
							{
								for(int j=m;j<i;j++)
								{
									cust[j]=cust[j+1];
								}
								cust[i]=null;
								i--;
							}
						}
						System.out.println("Customer Deleted");
						break;
					}
					System.out.print("List is empty");
					break;
				default:
					System.out.println("Invalid Input");
				}
			 }
			else
				System.out.println("Invalid Id or Password");
			
			System.out.println("Sorted Customer List");
			Arrays.sort(cust);
			for(int k=0;i<cust.length;k++)
				System.out.println(cust[k]);
		}
}
