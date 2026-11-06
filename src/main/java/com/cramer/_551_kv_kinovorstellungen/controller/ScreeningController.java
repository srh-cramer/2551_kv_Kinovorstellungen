package com.cramer._551_kv_kinovorstellungen.controller;

import com.cramer._551_kv_kinovorstellungen.model.Screening;
import com.cramer._551_kv_kinovorstellungen.model.ScreeningService;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ScreeningController {
    @FXML
    private TableView<Screening> screeningTable;
    @FXML
    private TableColumn<Screening, String> nameColumn;
    @FXML
    private TableColumn<Screening, String> roomColumn;
    @FXML
    private TableColumn<Screening, String> timeColumn;
    @FXML
    private TableColumn<Screening, Integer> freeSeatsColumn;

    private ScreeningService screeningService = new ScreeningService();

    @FXML
    public void initialize() {
        nameColumn.setCellValueFactory(
                data -> new SimpleStringProperty(data.getValue().title())
        );
        roomColumn.setCellValueFactory(
                data -> new SimpleStringProperty(data.getValue().room())
        );
        timeColumn.setCellValueFactory(
                data -> new SimpleStringProperty(data.getValue().time())
        );
        freeSeatsColumn.setCellValueFactory(
                data -> new SimpleIntegerProperty(data.getValue().freeSeats()).asObject()
        );

        showAllScreenings();
    }

    @FXML
    private void showAllScreenings() {
        screeningTable.getItems().clear();
        screeningTable.getItems().addAll(screeningService.getAllScreenings());
    }

    @FXML
    private void showAvailableScreenings(){
        // TODO: Aufgabe 1
    }

    // TODO: Aufgabe 2
}
