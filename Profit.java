package StockTask;

public class Profit {
	    public int Profit(int[] stock) {
	        int profit = 0;
	        int j = 0;
	        for (int i = 0; i < stock.length; i ++){
	          int comparison = stock[i] - stock[j];
	          if(comparison > profit){
	        	  profit = comparison;
	          }     
	          if(stock[i] < stock[j])
	              j = i;
	        }
	        return profit;
	    }public static void main(String args[]) {
	    	Profit p=new Profit();
	    	int[] arr= {7,1,5,3,6,4};
	    	System.out.println(p.Profit(arr));
	    	}
	    
	    
	}    
	

