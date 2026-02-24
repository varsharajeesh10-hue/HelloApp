public class PenDistribution {

    public static void main(String[] args) {

        int totalPens = 14;
        int totalStudents = 3;

        // Using division to find pens per student
        int pensPerStudent = totalPens / totalStudents;

        // Using modulus to find remaining pens
        int remainingPens = totalPens % totalStudents;

        System.out.println("The Pen Per Student is " 
                + pensPerStudent 
                + " and the remaining pen not distributed is " 
                + remainingPens);
    }
}
