/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_proyek3;

import javax.tools.JavaFileManager.Location;

/**
 *
 * @author Reza Dwi Kurniawan
 */
public class EstimationTime {
    private int distance;
    private int speed;
    private int estimationTime;

    /**
     * @return the distance
     */
    public int getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(int distance) {
        this.distance = distance;
    }

    /**
     * @return the speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public int countEstimationTime(){
        int transportationSpeed;
        String transportationName = null;
        Transportation_mode tMode = new Transportation_mode(); //instansiasi objek baru
        transportationSpeed = tMode.countTransportationSpeed(transportationName); //pengsian nilai dari method countTransportationSpeed di objek tMode ke var transportationSpeed
        Location location1 = new Location(-6.914744,107.609810); //instansiasi lokasi pertama dan pengisian nilai menggunakan konstruktor *latlong untuk kota bandung
        Location location2 = new Location(-6.121435,106.774124); //instansiasi lokasi kedua dan pengisian nilai menggunakan konstruktor *latlong untuk kota jakarta
        int distance = location1.distanceTo(location2); //penghitungan jarak dari lok1 ke lok2 menggunakan method distanceTo di class yang lain
        return estimationTime = distance/transportationSpeed; //mengembalikan nilai int yang dijadikan sebagai estimation time arrival
    }
}
