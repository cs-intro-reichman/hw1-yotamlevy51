// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		String time = args[0];
        String [] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        int updatehour = hours;
        String updateminutes = String.valueOf(minutes);

		//know i will change it to am/pm
    
        if (minutes<10)
        {
        updateminutes = "0" + updateminutes; 
        }
        
        if (hours >= 13)
         {
            updateminutes = updateminutes + " PM"; 
            updatehour = hours-12;
        }
         if (hours < 12)
		  {
            updateminutes = updateminutes + " AM";
		}
        if (hours==12)
		 {
			updateminutes = updateminutes + " PM";
		}
        
    System.out.println(updatehour +":"+ updateminutes);
    
    }
			
		}

	