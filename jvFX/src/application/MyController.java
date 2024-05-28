package application;
	
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class MyController {
	@FXML
	private TextField Email;
	@FXML
	private TextField FullName;
	@FXML
	Label error;
	
	@FXML
	public void onClickRegisterButton()
	{
		String mail=Email.getText();
		String name=FullName.getText();
		System.out.println(mail);
		System.out.println(name);
	}	
}
