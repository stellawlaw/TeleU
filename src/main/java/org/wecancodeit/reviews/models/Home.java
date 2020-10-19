package org.wecancodeit.reviews.models;

public class Home {
    private String horror;
    private String comedy;


    public Home(String horror, String comedy) {
        this.horror = horror;
        this.comedy = comedy;
    }

    public String getHorror() {
        return horror;
    }

    public String getComedy() {
        return comedy;
    }
}
