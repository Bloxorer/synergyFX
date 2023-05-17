package com.example.synergyfx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Counter extends Application {

    private int count = 0;
    private Text countText;

    @Override
    public void start(Stage stage) {
        // Создаем счетчик и метку
        countText = new Text("Нажатий кнопки: 0");

        // Создаем кнопку
        Button button = new Button("Нажми меня!");
        button.setOnAction(e -> handleButtonClick());

        // Упаковываем все в вертикальный контейнер
        VBox root = new VBox(10, countText, button);
        root.setAlignment(Pos.CENTER);

        // Создаем сцену и отображаем её
        Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.setTitle("Счётчик нажатий кнопки");
        stage.show();
    }

    private void handleButtonClick() {
        count++;
        countText.setText("Нажатий кнопки: " + count);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
