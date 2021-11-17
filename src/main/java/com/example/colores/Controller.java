package com.example.colores;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public class Controller {
    private IntegerProperty redValue = new SimpleIntegerProperty();
    private IntegerProperty greenValue = new SimpleIntegerProperty();
    private IntegerProperty blueValue = new SimpleIntegerProperty();
    private Label preview;
    private Label redLabel;
    private Label greenLabel;
    private Label blueLabel;
    private Slider redSlider;
    private Slider greenSlider;
    private Slider blueSlider;

    public Controller(final Label preview, Label redLabel, Label greenLabel, Label blueLabel, Slider redSlider, Slider greenSlider, Slider blueSlider) {
        this.preview = preview;
        this.redLabel = redLabel;
        this.greenLabel = greenLabel;
        this.blueLabel = blueLabel;
        this.redSlider = redSlider;
        this.greenSlider = greenSlider;
        this.blueSlider = blueSlider;
        this.redValue.bind(redSlider.valueProperty());
        this.greenValue.bind(greenSlider.valueProperty());
        this.blueValue.bind(blueSlider.valueProperty());
        redLabel.textProperty().bind(this.redValue.asString());
        greenLabel.textProperty().bind(this.greenValue.asString());
        blueLabel.textProperty().bind(this.blueValue.asString());
        this.redValue.addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> observableValue, Number oldValue, Number newValue) {
                preview.setBackground(new Background(new BackgroundFill[]{new BackgroundFill(
                        Color.rgb(Controller.this.redValue.get(), Controller.this.greenValue.get(), Controller.this.blueValue.get()), (CornerRadii)null, (Insets)null)}));
            }
        });
        this.greenValue.addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> observableValue, Number oldValue, Number newValue) {
                preview.setBackground(new Background(new BackgroundFill[]{new BackgroundFill(Color.rgb(Controller.this.redValue.get(), Controller.this.greenValue.get(), Controller.this.blueValue.get()), (CornerRadii)null, (Insets)null)}));
            }
        });
        this.blueValue.addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> observableValue, Number oldValue, Number newValue) {
                preview.setBackground(new Background(new BackgroundFill[]{new BackgroundFill(Color.rgb(Controller.this.redValue.get(), Controller.this.greenValue.get(), Controller.this.blueValue.get()), (CornerRadii)null, (Insets)null)}));
            }
        });
    }
}