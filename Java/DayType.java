package DayTypeProgram;

public class DayType {
    private String day;

    public void day()
    {
        day = "Sun";
    }

    public DayType()
    {
        setDay(day);
    }

    public void setDay(String sday)
    {
        day = sday;
        //sday = day;
    }
    
    public String getDay()
    {
        return day;
    }
    
    public String nextDay(String sday)
    {
        switch(sday)
        {
            case "Sun":
                return "Mon";
            case "Mon":
                return "Tue";
            case "Tue":
                return "Wed";
            case "Wed":
                return "Thu";
            case "Thu":
                return "Fri";
            case "Fri":
                return "Sat";
            case "Sat":
                return "Sun";
        }
        return sday;
    }

    public String previousDay(String sday)
    {
        switch(sday)
        {
            case "Sun":
                return "Sat";
            case "Mon":
                return "Sun";
            case "Tue":
                return "Mon";
            case "Wed":
                return "Tue";
            case "Thu":
                return "Wed";
            case "Fri":
                return "Thu";
            case "Sat":
                return "Fri";
        }
        return sday;
    }

    public String addDays(int noDays)
    {
        String tempDay = day;
        for(int i = 0; i < noDays; i++)
        {
            tempDay = nextDay(tempDay);
        }
        return tempDay;
    }

    public String subtractDays(int noDays)
    {
        String tempDay = day;
        for(int i = 0; i < noDays; i++)
        {
            tempDay = previousDay(tempDay);
        }
        return tempDay;
    }
    
}
