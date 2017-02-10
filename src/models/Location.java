package models;

import java.io.Serializable;

public class Location implements Serializable {
    private static final long serialVersionUID = -1914796470469476183L;

	private String longitude;

    private String latitude;

    public String getLongitude ()
    {
        return longitude;
    }

    public void setLongitude (String longitude)
    {
        this.longitude = longitude;
    }

    public String getLatitude ()
    {
        return latitude;
    }

    public void setLatitude (String latitude)
    {
        this.latitude = latitude;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [longitude = "+longitude+", latitude = "+latitude+"]";
    }
}
	