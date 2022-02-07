package by.epam.calendar.main;

import by.epam.calendar.entity.Calendar;
import by.epam.calendar.view.CalendarView;
/*Создать класс Календарь с внутренним классом с помощью объектов которого можно хранить информацию о праздничных
        * и выходных днях.*/

public class Main {

    public static void main(String[] args) {
        Calendar calendar = new Calendar("Календарь 2022");
        CalendarView calendarView = new CalendarView();
        calendar.addMonth(new Calendar.Month("январь", 31, new int[]{1, 2, 8, 9, 15, 16, 22, 23, 29, 30},
                new int[]{1, 2, 7}));
        calendar.addMonth(
                new Calendar.Month("февраль", 28, new int[]{5, 6, 12, 13, 19, 20, 26, 27}, new int[]{23}));
        calendar.addMonth(new Calendar.Month("март", 31, new int[]{5, 6, 12, 13, 19, 20, 26, 27}, new int[]{8}));
        calendar.addMonth(
                new Calendar.Month("апрель", 30, new int[]{5, 6, 12, 13, 19, 20, 26, 27}, new int[]{24}));
        calendar.addMonth(
                new Calendar.Month("май", 31, new int[]{5, 6, 12, 13, 19, 20, 26, 27}, new int[]{1, 3, 9}));
        calendar.addMonth(new Calendar.Month("июнь", 30, new int[]{5, 6, 12, 13, 19, 20, 26, 27}, new int[]{}));
        calendar.addMonth(new Calendar.Month("июль", 31, new int[]{5, 6, 12, 13, 19, 20, 26, 27}, new int[]{3}));
        calendar.addMonth(new Calendar.Month("август", 31, new int[]{5, 6, 12, 13, 19, 20, 26, 27}, new int[]{}));
        calendar.addMonth(
                new Calendar.Month("сентябрь", 30, new int[]{5, 6, 12, 13, 19, 20, 26, 27}, new int[]{1}));
        calendar.addMonth(new Calendar.Month("октябрь", 31, new int[]{5, 6, 12, 13, 19, 20, 26, 27}, new int[]{}));
        calendar.addMonth(
                new Calendar.Month("ноябрь", 30, new int[]{5, 6, 12, 13, 19, 20, 26, 27}, new int[]{7}));
        calendar.addMonth(
                new Calendar.Month("декабрь", 31, new int[]{5, 6, 12, 13, 19, 20, 26, 27}, new int[]{25}));

        calendarView.printListWeekends(calendar);
        System.out.println();
        System.out.println("=========================");

        calendarView.printListPublicHoliday(calendar);

    }
}

