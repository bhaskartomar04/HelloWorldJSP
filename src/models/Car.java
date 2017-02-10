package models;

import java.io.Serializable;

public class Car implements Serializable {
    private static final long serialVersionUID = -1914796470469476183L;

	private String seater;

    private Location location;

    private String name;

    private String ac;

    private String hourly_rate;

    private String image;

    private String rating;

    private String type;

    public String getSeater ()
    {
        return seater;
    }

    public void setSeater (String seater)
    {
        this.seater = seater;
    }

    public Location getLocation ()
    {
        return location;
    }

    public void setLocation (Location location)
    {
        this.location = location;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getAc ()
    {
        return ac;
    }

    public void setAc (String ac)
    {
        this.ac = ac;
    }

    public String getHourly_rate ()
    {
        return hourly_rate;
    }

    public void setHourly_rate (String hourly_rate)
    {
        this.hourly_rate = hourly_rate;
    }

    public String getImage ()
    {
        return image;
    }

    public void setImage (String image)
    {
        this.image = image;
    }

    public String getRating ()
    {
        return rating;
    }

    public void setRating (String rating)
    {
        this.rating = rating;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [seater = "+seater+", location = "+location+", name = "+name+", ac = "+ac+", hourly_rate = "+hourly_rate+", image = "+image+", rating = "+rating+", type = "+type+"]";
    }
}
