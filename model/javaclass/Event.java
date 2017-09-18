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
    
    private int id_event; //saya rubah dari long menjadi int
    private String eventName;
    private int arrivaltime;
    private int departuretime;
    //String location;
    private int reminderoption; //saya rubah dari short menjadi int
    private String note;
    
    //penamaan event saya ganti menjadi addEvent supaya tidak jadi kontrakstor
    public void addEvent(int id_event, String eventName, int arrivaltime, int departuretime, int reminderoption, String note){
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
    public int getId_event() {
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
    public int getReminderoption() {
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
    public void setId_event(int id_event) {
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
    public void setReminderoption(int reminderoption) {
        this.reminderoption = reminderoption;
    }

    /**
     * @param note the note to set
     */
    public void setNote(String note) {
        this.note = note;
    }
    
    //Method supaya programbisa di running
    public static void main(String[] args)
    {
       Event E = new Event();
       
       //Method input
       E.addEvent(1234,"apajare",123,123,123,"apane");
       //Method print ke layar
       System.out.println("Event : " + E.id_event);
    }   
}
