/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AGS
 */
/*Tanggal
Event
- judul event
- lokasi event
- ket event
Catatan*/
public class Calendar {
    private int tanggal;
    private String judulEvent;
    private String lokasiEvent;
    private String ketEvent;

    /**
     * @return the tanggal
     */
    public int getTanggal() {
        return tanggal;
    }

    /**
     * @param tanggal the tanggal to set
     */
    public void setTanggal(int tanggal) {
        this.tanggal = tanggal;
    }

    /**
     * @return the judulEvent
     */
    public String getJudulEvent() {
        return judulEvent;
    }

    /**
     * @param judulEvent the judulEvent to set
     */
    public void setJudulEvent(String judulEvent) {
        this.judulEvent = judulEvent;
    }

    /**
     * @return the lokasiEvent
     */
    public String getLokasiEvent() {
        return lokasiEvent;
    }

    /**
     * @param lokasiEvent the lokasiEvent to set
     */
    public void setLokasiEvent(String lokasiEvent) {
        this.lokasiEvent = lokasiEvent;
    }

    /**
     * @return the ketEvent
     */
    public String getKetEvent() {
        return ketEvent;
    }

    /**
     * @param ketEvent the ketEvent to set
     */
    public void setKetEvent(String ketEvent) {
        this.ketEvent = ketEvent;
    }
}
