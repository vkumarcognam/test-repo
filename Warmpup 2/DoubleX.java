/*
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
*/

class DoubleX 
{
	public static void main(String[] args) {
		System.out.println(doubleX("axxbb"));
	}
	static boolean doubleX(String str) {
  		boolean flag = false;
  		int lastIndexOfX = str.lastIndexOf('x');
  		
	    for(int i=0;i<=lastIndexOfX;i++){
	    
		    if((i+1)<=lastIndexOfX && str.charAt(i)=='x' && str.charAt(i+1)=='x')
		      flag=true;
		      
		    if((i+1)<=lastIndexOfX && str.charAt(i)=='x' && str.charAt(i+1)!='x'){
		      flag=false;
		      break;
		    }
	   }
 	return flag;
	}
}
