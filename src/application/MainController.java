package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {
	@FXML
	private Label result;
	private double number1=0;
	private String operator="";
	private boolean start=true;
	private Model model1=new Model();
	
	public void processNumbers(ActionEvent event) {
		if(start) {
			result.setText("");
			start=false;
		}
		String value=((Button)event.getSource()).getText();
		result.setText(result.getText()+value);
	}
	
	public void processOnOff(ActionEvent event) {
		String value=((Button)event.getSource()).getText();
		if(value.equals("ON")) {
			result.setText("0");
		}
		else{
			result.setText("");
		}
	}
	
	public void processOperators(ActionEvent event) {
		String value=((Button)event.getSource()).getText();
		if(!value.equals("=")) {
			if(!operator.isEmpty()) {
				return;
			}
			operator=value;
			number1=Double.parseDouble(result.getText());
			result.setText(operator);
			start=true;
		}else {
			if(operator.isEmpty()) {
				return;
			}
			double number2=Double.parseDouble(result.getText());
			String output=  model1.calculate(number1,number2,operator);
			result.setText(String.valueOf(output));
			operator="";
			start=true;
		}
	}
}
