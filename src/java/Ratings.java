/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joesadler
 */
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
        
class Ratings {
    
    @Expose
    private String critics_rating;
    @Expose
    private Integer critic_score;
    @Expose
    private String audience_rating;
    @Expose
    private Integer audience_score;

    /**
     * @return the critics_rating
     */
    public String getCritics_rating() {
        return critics_rating;
    }

    /**
     * @param critics_rating the critics_rating to set
     */
    public void setCritics_rating(String critics_rating) {
        this.critics_rating = critics_rating;
    }

    /**
     * @return the critic_score
     */
    public Integer getCritic_score() {
        return critic_score;
    }

    /**
     * @param critic_score the critic_score to set
     */
    public void setCritic_score(Integer critic_score) {
        this.critic_score = critic_score;
    }

    /**
     * @return the audience_rating
     */
    public String getAudience_rating() {
        return audience_rating;
    }

    /**
     * @param audience_rating the audience_rating to set
     */
    public void setAudience_rating(String audience_rating) {
        this.audience_rating = audience_rating;
    }

    /**
     * @return the audience_score
     */
    public Integer getAudience_score() {
        return audience_score;
    }

    /**
     * @param audience_score the audience_score to set
     */
    public void setAudience_score(Integer audience_score) {
        this.audience_score = audience_score;
    }
    
}