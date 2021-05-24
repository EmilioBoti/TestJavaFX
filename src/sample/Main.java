package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.Cursor;
import javafx.scene.text.Text;


public class Main extends Application {

    public final double MAX_WIDTH = 250.0;
    public final double MAX_HEIGHT = 250.0;


    @Override
    public void start(Stage primaryStage) throws Exception{

        Text l1 = new Text("text 1");
        l1.setFont(new Font(20));
        //l1.setFill(Color.web("#274C77"));

        Text l2 = new Text("text 2");
        l2.setFont(new Font(20));
        l2.setFill(Color.web("#ffffff"));

        Text l3 = new Text("text 3");
        l3.setFont(new Font(20));
        l3.setFill(Color.web("#ffffff"));

        Text l4 = new Text("text 4");
        l4.setFont(new Font(20));
        //l4.setFill(Color.web("#274C77"));

        StackPane stack1 = new StackPane();
        stack1.setPrefWidth(MAX_WIDTH);
        stack1.setPrefHeight(MAX_HEIGHT);
        //stack1.setAlignment(Pos.TOP_LEFT);
        stack1.setBackground(new Background(new BackgroundFill(Color.web("#ffffff"),CornerRadii.EMPTY, Insets.EMPTY)));
        stack1.getChildren().add(l1);

        StackPane stack2 = new StackPane();
        stack2.setPrefWidth(MAX_WIDTH);
        stack2.setPrefHeight(MAX_HEIGHT);
        //stack2.setAlignment(Pos.TOP_RIGHT);
        stack2.setBackground(new Background(new BackgroundFill(Color.web("#000000"),CornerRadii.EMPTY, Insets.EMPTY)));
        stack2.getChildren().add(l2);

        StackPane stack3 = new StackPane();
        stack3.setPrefWidth(MAX_WIDTH);
        stack3.setPrefHeight(MAX_HEIGHT);
        //stack3.setAlignment(Pos.BOTTOM_LEFT);
        stack3.setBackground(new Background(new BackgroundFill(Color.web("#000000"),CornerRadii.EMPTY, Insets.EMPTY)));
        stack3.getChildren().add(l3);

        StackPane stack4 = new StackPane();
        stack4.setPrefWidth(MAX_WIDTH);
        stack4.setPrefHeight(MAX_HEIGHT);
        //stack4.setAlignment(Pos.BOTTOM_RIGHT);
        stack4.setBackground(new Background(new BackgroundFill(Color.web("#ffffff"),CornerRadii.EMPTY, Insets.EMPTY)));
        stack4.getChildren().add(l4);

        HBox box1 = new HBox();
        box1.getChildren().addAll(stack1, stack2);

        HBox box2 = new HBox();
        box2.getChildren().addAll(stack3, stack4);

        VBox main = new VBox();
        main.getChildren().addAll(box1, box2);


        //button top
        Button btnt = new Button();
        btnt.setCursor(Cursor.HAND);
        btnt.setText("Top");
        btnt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                l1.setText("clicked one!");
            }
        });
        //button bottom
        Button btnd = new Button();
        btnd.setText("Bottom");
        btnd.setCursor(Cursor.HAND);
        btnd.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e){
                Platform.exit();
            }
        });
        //button left
        Button btnl = new Button();
        btnl.setText("Left");
        btnl.setCursor(Cursor.HAND);
        btnl.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e){
                l3.setText("Clicked three!");
            }
        });
        //button right
        Button btnr = new Button();
        btnr.setText("Right");
        btnr.setCursor(Cursor.HAND);
        btnr.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e){
                l2.setText("Clicked two!");
            }
        });

        BorderPane root = new BorderPane();
        root.setCenter(main);

        root.setTop(btnt);
        btnt.setMaxWidth(Double.MAX_VALUE);
        btnt.maxHeight(Double.MAX_VALUE);

        root.setBottom(btnd);
        btnd.setMaxWidth(Double.MAX_VALUE);
        btnd.setMaxHeight(Double.MAX_VALUE);

        root.setLeft(btnl);
        btnl.setMaxWidth(Double.MAX_VALUE);
        btnl.setMaxHeight(Double.MAX_VALUE);

        root.setRight(btnr);
        btnr.setMaxWidth(Double.MAX_VALUE);
        btnr.setMaxHeight(Double.MAX_VALUE);

        Scene s = new Scene(root,500, 500);


        primaryStage.setTitle("Exercise");
        primaryStage.setScene(s);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
