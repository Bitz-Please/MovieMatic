/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Class that deals with the release dates of movies
 * @author joesadler
 */
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import java.io.Serializable;

@Generated("org.jsonschema2pojo")
        
class ReleaseDates implements Serializable {
    
    @Expose
    private String theater;
    @Expose
    private String dvd;

    /**
     * @return the theater
     */
    public String getTheater() {
        return theater;
    }

    /**
     * @param theater the theater to set
     */
    public void setTheater(String theater) {
        this.theater = theater;
    }

    /**
     * @return the dvd
     */
    public String getDvd() {
        return dvd;
    }

    /**
     * @param dvd the dvd to set
     */
    public void setDvd(String dvd) {
        this.dvd = dvd;
    }
    
    
}
