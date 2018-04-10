package main;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LogicApplication extends Application
{
	public static void main(String[] args)
	{
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		primaryStage.setTitle("Logic Converter");
		VBox root = new VBox();
		Scene s = new Scene(root, 300, 300, Color.WHITESMOKE);
		
		setUpMenu(root);
		
		primaryStage.setScene(s);
		primaryStage.show();
	}
	
	private void setUpMenu(Pane root)
	{
		MenuBar menuBar = new MenuBar();
		
		Menu menuFile = new Menu("File");
		MenuItem load = new MenuItem("Load");
		menuFile.getItems().addAll(load);
		load.setOnAction(event ->
		{
			// TODO this might be better using the name() method rather than the class name
			Map<String, Class<? extends LogicSystem>> m = LogicSystem.classes.stream().collect(Collectors.toMap(Class::getSimpleName, b -> b));
			ChoiceDialog<String> dialog = new ChoiceDialog<String>(null, m.keySet());
			dialog.setTitle("Test"); // TODO Change
			dialog.setContentText("Choose a proof type:");
			Optional<Class<? extends LogicSystem>> result = dialog.showAndWait().map(m::get);
			System.out.println(result);
		});
		
		menuBar.getMenus().addAll(menuFile);
		root.getChildren().add(menuBar);
	}
}