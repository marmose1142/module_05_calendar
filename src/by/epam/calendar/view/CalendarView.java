package by.epam.calendar.view;

import by.epam.calendar.entity.Calendar;

public class CalendarView {
    public void printListWeekends(Calendar calendar) {
        for (int i = 0; i < calendar.getListMonths().size(); i++) {
            System.out.println("Выходные дни, " + calendar.getListMonths().get(i).getName() + ":");
            for (int j = 0; j < calendar.getListMonths().get(i).getWeekend().length; j++) {
                System.out.print(calendar.getListMonths().get(i).getWeekend()[j]);
            }
        }
    }

    public void printListPublicHoliday(Calendar calendar) {
        
        for(int i=0;i<calendar.getListMonths().size();i++) {
            System.out.println(" Праздничные дни в "+ calendar.getListMonths().get(i).getName() +":");
            if(calendar.getListMonths().get(i).getPublicHoliday().length==0){
                System.out.println("--");
            }
            for(int j=0;j<calendar.getListMonths().get(i).getPublicHoliday().length;j++) {
                System.out.println(calendar.getListMonths().get(i).getPublicHoliday()[j]);
                }
            }
        }
    }

