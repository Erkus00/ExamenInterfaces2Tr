package com.example.entregaexamenjavafx;

import com.example.entregaexamenjavafx.model.Alumno;
import com.example.entregaexamenjavafx.model.Informe;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import net.sf.jasperreports.engine.JRException;

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
    private Spinner<Double> ad;
    @FXML
    private Text areaActividad;
    @FXML
    private Spinner<Double> sge;
    @FXML
    private Spinner<Double> di;
    @FXML
    private Button añadirAlumno;
    @FXML
    private TextField apellido;
    @FXML
    private Spinner<Double> pmdm;
    @FXML
    private Text areaActividad1;
    @FXML
    private Text areaActividad2;
    @FXML
    private Text areaActividad21;
    @FXML
    private Spinner<Double> psp;
    @FXML
    private Spinner<Double> eie;
    @FXML
    private Spinner<Double> hlc;
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
    private TextField nombreLabel;
    @FXML
    private TextField mediaLabel;
    @FXML
    private TextField suspensosLabel;

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

            if (name != null && apellidos != null && sge_value >= 0.0 && ad_value >= 0.0 && di_value >= 0.0 && pmdm_value >= 0.0 && psp_value >= 0.0 && eie_value >= 0.0 && hlc_value >= 0.0 && sge_value <= 10.0 && ad_value <= 10.0 && di_value <= 10.0 && pmdm_value <= 10.0 && psp_value <= 10.0 && eie_value <= 10.0 && hlc_value <= 10.0) {
                Alumno al = new Alumno(null, name, apellidos, ad_value, sge_value, di_value, pmdm_value, psp_value, eie_value, hlc_value);
                vistaTabla.getItems().add(al);

                vistaTabla.refresh();

                nombre.clear();
                apellido.clear();
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
    public void descargarButtonOnAction(ActionEvent actionEvent) throws JRException {
        Informe.showReportCalificaciones();
        Informe.showPDFCalificaciones();
    }

    @FXML
    public void exitButtonOnAction(ActionEvent actionEvent) {
        System.exit(0);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ad.setValueFactory(new SpinnerValueFactory.DoubleSpinnerValueFactory(0.0, 10.0, 0.0, 0.1));
        sge.setValueFactory(new SpinnerValueFactory.DoubleSpinnerValueFactory(0.0, 10.0, 0.0, 0.1));
        di.setValueFactory(new SpinnerValueFactory.DoubleSpinnerValueFactory(0.0, 10.0, 0.0, 0.1));
        pmdm.setValueFactory(new SpinnerValueFactory.DoubleSpinnerValueFactory(0.0, 10.0, 0.0, 0.1));
        psp.setValueFactory(new SpinnerValueFactory.DoubleSpinnerValueFactory(0.0, 10.0, 0.0, 0.1));
        eie.setValueFactory(new SpinnerValueFactory.DoubleSpinnerValueFactory(0.0, 10.0, 0.0, 0.1));
        hlc.setValueFactory(new SpinnerValueFactory.DoubleSpinnerValueFactory(0.0, 10.0, 0.0, 0.1));

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

        vistaTabla.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                Alumno alumno = (Alumno) newValue;
                String nombreCompleto = "Nombre: " + alumno.getNombre();


                nombreLabel.setText(nombreCompleto);
                double notaMedia = alumno.getNotaMedia();


                if (notaMedia >= 0) {
                    mediaLabel.setText("Nota media: " + notaMedia);
                } else {
                    mediaLabel.setText("No tiene todas las asignaturas aprobadas.");
                }
                int numSuspensos = alumno.getSuspensos();
                if (numSuspensos > 0) {
                    suspensosLabel.setText("Suspensos: " + numSuspensos);
                } else {
                    suspensosLabel.setText("No tiene ningun suspenso");
                }
            }
        });

    }
}
