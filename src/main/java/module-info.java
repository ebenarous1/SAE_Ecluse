module universite_paris8.iut.ebenarous.sae_ecluse {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens universite_paris8.iut.ebenarous.sae_ecluse to javafx.fxml;
    exports universite_paris8.iut.ebenarous.sae_ecluse;
}