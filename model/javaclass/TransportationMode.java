/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_proyek3;

/**
 *
 * @author Reza Dwi Kurniawan
 */
public class Transportation_mode {
    private String idKendaraan;
    private String namaKendaraan;
    private int transportationSpeed;
    
    public Transportation_mode(String namaKendaraan, String idKendaraan){
    idKendaraan = this.namaKendaraan;
    namaKendaraan = this.idKendaraan;
}

    Transportation_mode() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the idKendaraan
     */
    public String getIdKendaraan() {
        return idKendaraan;
    }

    /**
     * @return the namaKendaraan
     */
    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    /**
     * @param idKendaraan the idKendaraan to set
     */
    public void setIdKendaraan(String idKendaraan) {
        this.idKendaraan = idKendaraan;
    }

    /**
     * @param namaKendaraan the namaKendaraan to set
     */
    public void setNamaKendaraan(String namaKendaraan) {
        this.namaKendaraan = namaKendaraan;
    }
    
    public int countTransportationSpeed (String namaKendaraan){
        String transportationName = null;
        switch (transportationName){
            case "sepeda" :
                transportationSpeed = 10; //set speed untuk sepeda
                break;
            case "motor" :
                transportationSpeed = 60; //set speed untuk motor
                break;
            case "mobil" :
                transportationSpeed = 40; //set speed untuk mobil
                break;
        }
        return transportationSpeed;
    }
    
    
    
}
