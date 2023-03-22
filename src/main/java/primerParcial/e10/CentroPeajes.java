package primerParcial.e10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CentroPeajes {
    private static CentroPeajes instance = new CentroPeajes();
    private File logFile;
    private FileWriter fw;
    private BufferedWriter bw;
    private double dineroRecaudado = 0;

    private CentroPeajes() {
        try {
            logFile = new File("src\\main\\java\\ejerciciosP1\\primerParcial.e10\\log.txt");
            if (!logFile.exists()) {
                logFile.createNewFile();
            }
            fw = new FileWriter(logFile, true);
            bw = new BufferedWriter(fw);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static CentroPeajes getInstance() {
        return instance;
    }

    public void registrarVehiculo(Vehiculo vehiculo){
        dineroRecaudado+=500;
        writeLog("Ingresó: "+ vehiculo+", dinero recaudado: "+dineroRecaudado);
    }
    private void writeLog(String logMessage) {
        try {
            bw.write(logMessage);
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cerrar(){
        try {
            bw.write("***************************************************");
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
