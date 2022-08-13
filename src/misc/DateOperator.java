package misc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class DateOperator {
	
	public static boolean isDate(String stringDate, String format) {
		int dd, mm, yy;
		boolean leapYear = false;
		
		switch(format) {
		
		case "ddMMyy":
			dd = Integer.parseInt(stringDate.substring(0, 2));
			mm = Integer.parseInt(stringDate.substring(2, 4));
	        yy = Integer.parseInt(stringDate.substring(4));
	        break;
		case "ddMMyyyy":
			dd = Integer.parseInt(stringDate.substring(0, 2));
            mm = Integer.parseInt(stringDate.substring(2, 4));
            yy = Integer.parseInt(stringDate.substring(4));
            break;
		
		case "dd-MM-yyyy":
			dd = Integer.parseInt(stringDate.substring(0, 2));
            mm = Integer.parseInt(stringDate.substring(3, 5));
            yy = Integer.parseInt(stringDate.substring(6));
			break;
			
		case "dd/MM/yyyy":
		     dd = Integer.parseInt(stringDate.substring(0, 2));
             mm = Integer.parseInt(stringDate.substring(3, 5));
             yy = Integer.parseInt(stringDate.substring(6));
             break;
		
		case "yyyyMMdd":
			 yy = Integer.parseInt(stringDate.substring(0, 4));
             mm = Integer.parseInt(stringDate.substring(4, 6));
             dd = Integer.parseInt(stringDate.substring(6));
             break;
			
		case "yyyy-MM-dd":
			  yy = Integer.parseInt(stringDate.substring(0, 4));
	          mm = Integer.parseInt(stringDate.substring(5, 7));
	          dd = Integer.parseInt(stringDate.substring(8));
	          break;
			
		case "yyyy/MM/dd":
		     yy = Integer.parseInt(stringDate.substring(0, 4));
             mm = Integer.parseInt(stringDate.substring(5, 7));
             dd = Integer.parseInt(stringDate.substring(8));
             break;
			
		default:
			dd = 0;
            mm = 0;
            yy = 0;
            break;
		
		
		
		
		}
		
		
		if (yy % 4 == 0) {
			
			if(yy % 100 != 0) {
				leapYear = true;
			}
			
			if(yy % 100 == 0) {
				
				if(yy % 400 == 0) {
					leapYear = true;
					
				}
			}
	    }
		
		
		 if (mm < 1 || mm > 12) {
	            return false;
	            
		 }else {
			 
			 switch(mm) {
			 
			 //Enero.
			 case 1:
				 if (dd < 1 || dd > 31) {
                     return false;
                 }
				 break;
				 
		     //Febrero
			 case 2:
				 
				 if (leapYear == true) {
                     if (dd < 1 || dd > 29) {
                         return false;
                     }
                 } else {
                     if (dd < 1 || dd > 28) {
                         return false;
                     }
                 }
					
				 break;
			  
		     //Marzo
			 case 3:
				 if (dd < 1 || dd > 31) {
                     return false;
                 }
				 break;
				 
			 //Abril
			 case 4:
				 if (dd < 1 || dd > 30) {
                     return false;
                 }
				 break;
				 
			 //Mayo
			 case 5:
				 if (dd < 1 || dd > 31) {
                     return false;
                 }
				 break;
				 
		     //Junio
			 case 6:
				 if (dd < 1 || dd > 30) {
                     return false;
                 }
				 break;
				 
			 //Julio
			 case 7:
				 if (dd < 1 || dd > 31) {
                     return false;
                 }
				 break;
				 
			 //Agosto	 
			 case 8:
				 if (dd < 1 || dd > 31) {
                     return false;
                 }
				 break;
				 
			 //Septiembre
			 case 9:
				 if (dd < 1 || dd > 30) {
                     return false;
                 }
				 break;
				 
			 //Octubre
			 case 10:
				 if (dd < 1 || dd > 31) {
                     return false;
                 }
				 break;
				 
		     //Noviembre
			 case 11:
				 if (dd < 1 || dd > 30) {
                     return false;
                 }
				 break;
				 
			 //Diciembre	  
			 case 12:
				 if (dd < 1 || dd > 31) {
                     return false;
                 }
				 break;
				 
			 default:
			 
                 if (dd < 1 || dd > 30) {
                     return false;
                 }
			 
			 }
			 
		}
		
		 
	    return true;
		
	}
	
	
	public static Date stringToDate(String date, String format) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            return sdf.parse(date);
        } catch (ParseException ex) {
            return null;
        }
    }

    public static String dateToString(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }
	
    
    
    public static int getAge(Date birthDate) {
        int age = 0;
        if (birthDate == null) {
            return age;
        }
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        LocalDate localDate = birthDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int byear  = localDate.getYear();
        int bmonth = localDate.getMonthValue();
        int bday   = localDate.getDayOfMonth();


        //la diferencia
        age = year - byear;
        if (month < bmonth) {
            age = age - 1;
        } else {
            if (month == bmonth) {
                if (day < bday) {
                    age = age - 1;
                }
            }
        }
        return age;
    }
	

}
