package cse360assign2;

public class Calculator {

	private int total;
	private StringBuffer hold;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		hold = new StringBuffer("0 "); //initial value of total is 0 and is displayed as such
	}
	
	public int getTotal () {			//returns value of total
		return total;
	}
	
	public void add (int value) {		//adds parameter value to total value
		total = total + value;
		hold.append(" + " + value);
		
	}
	
	public void subtract (int value) {	//subtracts parameter value from total value
		total = total - value;
		hold.append(" - " + value);
	}
	
	public void multiply (int value) {	//multiplies parameter value with total value
		total = total * value;
		hold.append(" * " + value);
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
		hold.append(" / " + value);
	}
	
	public String getHistory () {		//lists operands called on
		
		return hold.toString();
	}
}