/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjava;

/**
 *
 * @author ASUS
 */
public class Location {
    //deklarasi atribut
    private String name;
    private double longitude; //longitude = garis bujur
    private double latitude;  //latitude = garis lintang
   
    // create and initialize a point with given name and
    // (latitude, longitude) specified in degrees
    public Location(String name, double latitude, double longitude) {
        this.name = name;
        this.latitude  = latitude;
        this.longitude = longitude;
    }

    // return distance between this location and that location
    // measured in statute miles
//Nautical mile atau dalam bahasa Indonesia mil laut adalah satuan panjang yang  digunakan di seluruh dunia untuk keperluan kelautan seperti menghitung jarak dalam pelayaran dan penerbangan. Satu mil laut sama dengan 1,852 km; 1,1508 mil normal
//untuk menghitung jarak antar lokasi
    public double distanceTo(Location that) {
        double STATUTE_MILES_PER_NAUTICAL_MILE = 1.15077945;
        double lat1 = Math.toRadians(this.latitude); //latitude lokasi 1
        double lon1 = Math.toRadians(this.longitude); //longitude lokasi 1
        double lat2 = Math.toRadians(that.latitude); //latitude lokasi 2
        double lon2 = Math.toRadians(that.longitude); //longitude lokasi 2

        // great circle distance in radians, using law of cosines formula (aturan kosinus)
  //Method acos() mengembalikan nilai arccosine dari nilai double yang ditentukan. Acos = invers cosinus.

        double angle = Math.acos(Math.sin(lat1) * Math.sin(lat2)
                               + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));

        // each degree on a great circle of Earth is 60 nautical miles
// Setiap derajat pada lingkaran besar Bumi adalah 60 mil laut

        double nauticalMiles = 60 * Math.toDegrees(angle);
        double statuteMiles = STATUTE_MILES_PER_NAUTICAL_MILE * nauticalMiles;
        return statuteMiles; //mengembalikan nilai
    }

    // return string representation of this point
    public String toString() {
        return name + " (" + latitude + ", " + longitude + ")";
    }

    // test client
    public static void main(String[] args) {
        Location loc1 = new Location("JAKARTA", -6.21462, 106.84513);
        Location loc2 = new Location("BANDUNG", -6.914744, 107.609810);  
        double distance = loc1.distanceTo(loc2);
        System.out.println(distance + " miles from");
        System.out.println(loc1 + " to " + loc2);
    }
}
