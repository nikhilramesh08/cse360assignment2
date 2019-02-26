package cse360assign2;

public class Calculator {

	private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {			//returns value of total
		return 0;
	}
	
	public void add (int value) {		//adds parameter value to total value
		total = total + value;
	}
	
	public void subtract (int value) {	//subtracts parameter value from total value
		total = total - value;
	}
	
	public void multiply (int value) {	//multiplies parameter value with total value
		total = total * value;
	}
	
	public void divide (int value) {	//divides total value by parameter value
		if(value == 0)
		{
		total = 0;
		}
		else
		{
			total = total / value;
		}
	}
	
	public String getHistory () {		//lists operands called on
		return "";
	}
}