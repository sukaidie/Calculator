package application;

public class Model {
	
	public String calculate(double number1,double number2, String operator) {
		switch (operator) {
		case "+":
			double result=number1+number2;
			if(Math.round(result)-result==0){
				   return String.valueOf((long)result);
				  }
			return String.valueOf(result);
		case "-":
			double result2=number1-number2;
			if(Math.round(result2)-result2==0){
				   return String.valueOf((long)result2);
				  }
			return String.valueOf(result2);
		case "x":
			double result3=number1*number2;
			if(Math.round(result3)-result3==0){
				   return String.valueOf((long)result3);
				  }
			return String.valueOf(result3);
		case "÷":
			if(number2==0) {
				return "Error";
			}
			else{
				double result4=number1/number2;
				if(Math.round(result4)-result4==0){
					   return String.valueOf((long)result4);
					  }
				return String.valueOf(result4);
			}
		default:
			return "0";
		}
	}
	

}
