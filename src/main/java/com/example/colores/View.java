package com.example.colores;

import javafx.beans.binding.NumberBinding;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class View extends VBox {
    private Label preview;
    private Label redLabel;
    private Label greenLabel;
    private Label blueLabel;
    private Label valueRed;
    private Label valueGreen;
    private Label valueBlue;
    private Slider redSlider;
    private Slider greenSlider;
    private Slider blueSlider;
    private HBox red;
    private HBox green;
    private HBox blue;

    public View() {
        initView();
        Controller control =
                new Controller(preview, valueRed, valueGreen, valueBlue, redSlider, greenSlider, blueSlider);
    }

    public void initView() {
        preview = new Label();
        preview.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        preview.setMinSize(400, 200);
        redSlider = new Slider(0, 255, 0);
        greenSlider = new Slider(0, 255, 0);
        blueSlider = new Slider(0, 255, 0);
        redLabel = new Label("Rojo");
        greenLabel = new Label("Verde");
        blueLabel = new Label("Azul");
        valueRed = new Label("0");
        valueGreen = new Label("0");
        valueBlue = new Label("0");

        red = new HBox();
        green = new HBox();
        blue = new HBox();

        red.getChildren().addAll(redLabel, redSlider, valueRed);
        green.getChildren().addAll(greenLabel, greenSlider, valueGreen);
        blue.getChildren().addAll(blueLabel, blueSlider, valueBlue);

        this.getChildren().addAll(preview, red, green, blue);

    }

}
