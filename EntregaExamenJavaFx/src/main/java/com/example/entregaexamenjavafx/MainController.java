package com.example.entregaexamenjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private GridPane gridPaneAddTarea;
    @FXML
    private Text areaNombre;
    @FXML
    private TextField nombre;
    @FXML
    private Text areaEdad;
    @FXML
    private Text areaPeso;
    @FXML
    private Text areaSexo;
    @FXML
    private Text areaAltura;
    @FXML
    private Spinner ad;
    @FXML
    private Text areaActividad;
    @FXML
    private Spinner sge;
    @FXML
    private Spinner di;
    @FXML
    private Button añadirAlumno;
    @FXML
    private TextField apellido;
    @FXML
    private Spinner pmdm;
    @FXML
    private Text areaActividad1;
    @FXML
    private Text areaActividad2;
    @FXML
    private Text areaActividad21;
    @FXML
    private Spinner psp;
    @FXML
    private Spinner eie;
    @FXML
    private Spinner hlc;
    @FXML
    private Button descargarBtn;
    @FXML
    private Button exitBtn;
    @FXML
    private TableView vistaTabla;
    @FXML
    private TableColumn nombreCol;
    @FXML
    private TableColumn adCol;
    @FXML
    private TableColumn sgeCol;
    @FXML
    private TableColumn diCol;
    @FXML
    private TableColumn pmdmCol;
    @FXML
    private TableColumn pspCol;
    @FXML
    private TableColumn eieCol;
    @FXML
    private TableColumn hlcCol;

    @FXML
    public void addButtonOnAction(ActionEvent actionEvent) {

        String name = null;
        String apellidos = null;
        Double ad_value = 0.0;
        Double sge_value = 0.0;
        Double di_value = 0.0;
        Double pmdm_value = 0.0;
        Double psp_value = 0.0;
        Double eie_value = 0.0;
        Double hlc_value = 0.0;
        Double media_value = 0.0;
        try {
            name = nombre.getText();
            apellidos = apellido.getText();
            ad_value = (Double) ad.getValue();
            sge_value = (Double) sge.getValue();
            di_value = (Double) di.getValue();
            pmdm_value = (Double) pmdm.getValue();
            psp_value = (Double) psp.getValue();
            eie_value = (Double) eie.getValue();
            hlc_value = (Double) hlc.getValue();

            nombreCol.setCellValueFactory(new PropertyValueFactory<>("nombre"));
            adCol.setCellValueFactory(new PropertyValueFactory<>("ad"));
            sgeCol.setCellValueFactory(new PropertyValueFactory<>("sge"));
            diCol.setCellValueFactory(new PropertyValueFactory<>("di"));
            pmdmCol.setCellValueFactory(new PropertyValueFactory<>("pmdm"));
            pspCol.setCellValueFactory(new PropertyValueFactory<>("psp"));
            eieCol.setCellValueFactory(new PropertyValueFactory<>("eie"));
            hlcCol.setCellValueFactory(new PropertyValueFactory<>("hlc"));

            if (name != null && apellidos != null && sge_value >= 0.0 && ad_value >= 0.0 && di_value >= 0.0 && pmdm_value >= 0.0 && psp_value >= 0.0 && eie_value >= 0.0 && hlc_value >= 0.0) {
                Alumno al = new Alumno(null, name, apellidos, ad_value, sge_value, di_value, pmdm_value, psp_value, eie_value, hlc_value);
                vistaTabla.getItems().add(al);

                vistaTabla.refresh();

                nombre.clear();
                ad.getValueFactory().setValue(0.0);
                sge.getValueFactory().setValue(0.0);
                di.getValueFactory().setValue(0.0);
                pmdm.getValueFactory().setValue(0.0);
                psp.getValueFactory().setValue(0.0);
                eie.getValueFactory().setValue(0.0);
                hlc.getValueFactory().setValue(0.0);
            } else {
                System.out.println("Rellene correctamente los Campos");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);


        }
    }

    @FXML
    public void descargarButtonOnAction(ActionEvent actionEvent) {
    }

    @FXML
    public void exitButtonOnAction(ActionEvent actionEvent) {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ad.setValueFactory(new SpinnerValueFactory.DoubleSpinnerValueFactory(0, 10));
        sge.setValueFactory(new SpinnerValueFactory.DoubleSpinnerValueFactory(0, 10));
        di.setValueFactory(new SpinnerValueFactory.DoubleSpinnerValueFactory(0, 10));
        pmdm.setValueFactory(new SpinnerValueFactory.DoubleSpinnerValueFactory(0, 10));
        psp.setValueFactory(new SpinnerValueFactory.DoubleSpinnerValueFactory(0, 10));
        eie.setValueFactory(new SpinnerValueFactory.DoubleSpinnerValueFactory(0, 10));
        hlc.setValueFactory(new SpinnerValueFactory.DoubleSpinnerValueFactory(0, 10));

        nombreCol.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        adCol.setCellValueFactory(new PropertyValueFactory<>("ad"));
        sgeCol.setCellValueFactory(new PropertyValueFactory<>("sge"));
        diCol.setCellValueFactory(new PropertyValueFactory<>("di"));
        pmdmCol.setCellValueFactory(new PropertyValueFactory<>("pmdm"));
        pspCol.setCellValueFactory(new PropertyValueFactory<>("psp"));
        eieCol.setCellValueFactory(new PropertyValueFactory<>("eie"));
        hlcCol.setCellValueFactory(new PropertyValueFactory<>("hlc"));

        AlumnoControl alc = new AlumnoControl();
        ArrayList<Alumno> alumnos = alc.addAlumnos();
        for (Alumno alu : alumnos) {
            vistaTabla.getItems().add(alu);
        }
        vistaTabla.refresh();
    }
}
