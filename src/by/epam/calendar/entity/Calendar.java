package by.epam.calendar.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Calendar {
    private String name;
    private List<Month> listMonths = new ArrayList<>();

    public Calendar() {
        super();
    }

    public Calendar(String name) {
        super();
        this.name = name;
    }

    public Calendar(String name, List<Month> listMonths) {
        super();
        this.name = name;
        this.listMonths = listMonths;
    }

    public void addMonth(Month month) {
        listMonths.add(month);
    }

    public void remove(Month month) {
        listMonths.remove(month);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Month> getListMonths() {
        return listMonths;
    }

    public void setListMonths(List<Month> listMonths) {
        this.listMonths = listMonths;
    }

    public static class Month {
        private String name;
        private int numberOfDays;
        private int[] weekend;
        private int[] publicHoliday;

        public Month() {
            super();
        }

        public Month(String name, int numberOfDays, int[] weekend, int[] publicHoliday) {
            super();
            this.name = name;
            this.numberOfDays = numberOfDays;
            this.weekend = weekend;
            this.publicHoliday = publicHoliday;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNumberOfDays() {
            return numberOfDays;
        }

        public void setNumberOfDays(int numberOfDays) {
            this.numberOfDays = numberOfDays;
        }

        public int[] getWeekend() {
            return weekend;
        }

        public void setWeekend(int[] weekend) {
            this.weekend = weekend;
        }

        public int[] getPublicHoliday() {
            return publicHoliday;
        }

        public void setPublicHoliday(int[] publicHoliday) {
            this.publicHoliday = publicHoliday;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + Arrays.hashCode(publicHoliday);
            result = prime * result + Arrays.hashCode(weekend);
            result = prime * result + Objects.hash(name, numberOfDays);
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Month other = (Month) obj;
            return Objects.equals(name, other.name) && numberOfDays == other.numberOfDays
                    && Arrays.equals(publicHoliday, other.publicHoliday) && Arrays.equals(weekend, other.weekend);
        }

        @Override
        public String toString() {
            return "Month [name=" + name + ", numberOfDays=" + numberOfDays + ", weekend=" + Arrays.toString(weekend)
                    + ", publicHoliday=" + Arrays.toString(publicHoliday) + "]";
        }

    }

    @Override
    public int hashCode() {
        return Objects.hash(listMonths, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Calendar other = (Calendar) obj;
        return Objects.equals(listMonths, other.listMonths) && Objects.equals(name, other.name);
    }

    @Override
    public String toString() {
        return "Calendar [name=" + name + ", listMonths=" + listMonths + "]";
    }

}
