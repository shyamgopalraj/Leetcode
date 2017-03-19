

import java.util.LinkedList;

import java.util.Scanner;



public class BasicLinkedList
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> Sample = new LinkedList<Integer>();
		
		System.out.println("Enter your choice of operation on LinkedList");
		System.out.print("1. Add an item to LinkedList\n"
				+ "2. Add an item to LinkedList at particular pos\n"+
				"3. Delete an item from LinkedList\n"
				+ "4. Delete an item from LinkedList at particular pos\n"
				+ "5. Search for an item from LinkedList\n"
				+ "6. Any other integer value exits\n");
		
		Scanner input = new Scanner(System.in);
		boolean ContinuePlay = true;
		
		
		
		while (ContinuePlay)
		{
			System.out.println("Enter your choice of operation");
			int option = input.nextInt();
			int item;
			
			switch (option)
			{
			case 1:
				System.out.println("Enter item to be Added/Searched/Deleted");
				item = input.nextInt();	
				Sample.add(item);
				System.out.println("item added successfully");
				System.out.println(Sample);
				break;
			case 2:
				try {
					System.out.println("Enter item to be Added/Searched/Deleted");
					item = input.nextInt();	
					System.out.println("Enter position of item to be inserted");
					int pos = input.nextInt();
					Sample.add(pos,item);
					System.out.println("item added successfully");
					System.out.println(Sample);
					
				} catch (IndexOutOfBoundsException e) {
					System.out.println();
				}						
				break;
				
			case 3:
					System.out.println("Enter item to be Deleted");
					item = input.nextInt();
					if (Sample.indexOf(item) == -1)
						System.out.println("No such element in list");
					else
					{	
						Sample.remove(Sample.indexOf(item));
						System.out.println("item removed successfully");				
						System.out.println(Sample);	
					}
				
				break;
				
			case 4:
				System.out.println("Enter position of item to be deleted");
				int pos = input.nextInt();
				pos = pos-1;
				try
				{
					Sample.remove(pos);
					System.out.println(Sample);
					
				}
				catch (IndexOutOfBoundsException e)
				{
					System.out.println(e);
				}
							
				break;
			
			case 5:
				System.out.println("Enter item to be Searched");
				item = input.nextInt();	
				if (Sample.indexOf(item) == -1)
					System.out.println("No such element in list");
				else
				{
					System.out.format("element found at position - %d\n",Sample.indexOf(item));
				}
				break;
				
			default:
				System.out.println("Bored of playing with linkedlist");
				ContinuePlay = false;
				input.close();
				break;
			}
			}
		}
}
