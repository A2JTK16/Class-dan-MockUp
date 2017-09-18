/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author AGS
 */
class Event {
    
    private long id_event;
    private String eventName;
    private int arrivaltime;
    private int departuretime;
    //String location;
    private short reminderoption;
    private String note;
    
    public Event(long id_event, String eventName, int arrivaltime, int departuretime, short reminderoption, String note){
        this.id_event = id_event;
        this.eventName = eventName;
        this.arrivaltime = arrivaltime;
        this.departuretime = departuretime;
        this.reminderoption = reminderoption;
        this.note = note;
    }
/**
     * @return the id_event
     */
    public long getId_event() {
        return id_event;
    }

    /**
     * @return the eventName
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * @return the arrivaltime
     */
    public int getArrivaltime() {
        return arrivaltime;
    }

    /**
     * @return the departuretime
     */
    public int getDeparturetime() {
        return departuretime;
    }

    /**
     * @return the reminderoption
     */
    public Short getReminderoption() {
        return reminderoption;
    }

    /**
     * @return the note
     */
    public String getNote() {
        return note;
    }

    /**
     * @param id_event the id_event to set
     */
    public void setId_event(long id_event) {
        this.id_event = id_event;
    }

    /**
     * @param eventName the eventName to set
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /**
     * @param arrivaltime the arrivaltime to set
     */
    public void setArrivaltime(int arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    /**
     * @param departuretime the departuretime to set
     */
    public void setDeparturetime(int departuretime) {
        this.departuretime = departuretime;
    }

    /**
     * @param reminderoption the reminderoption to set
     */
    public void setReminderoption(short reminderoption) {
        this.reminderoption = reminderoption;
    }

    /**
     * @param note the note to set
     */
    public void setNote(String note) {
        this.note = note;
    }
}
