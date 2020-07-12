module templatefx {
	requires javafx.controls;
	requires javafx.fxml;
	requires transitive javafx.graphics;
	
	opens org.template to javafx.fxml;
	exports org.template;
	
}