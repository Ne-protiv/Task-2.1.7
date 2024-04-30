public class Task {
    public static void main(String[] args) {
        Day yourDay = Day.SATURDAY;
        boolean isWeekEnd = yourDay.isWeekend();
        System.out.println(isWeekEnd);
        String RusName = yourDay.getRusName(yourDay);
        System.out.println(RusName);
    }

    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

        public boolean isWeekend() {
            return equals(Day.SATURDAY) || equals(Day.SUNDAY);
        }

        public String getRusName(Day day) {
            return switch (day) {
                case MONDAY -> "Понедельник";
                case TUESDAY -> "Вторник";
                case WEDNESDAY -> "Среда";
                case THURSDAY -> "Четверг";
                case FRIDAY -> "Пятница";
                case SUNDAY -> "Суббота";
                case SATURDAY -> "Воскресение";
            };
        }
    }
}
