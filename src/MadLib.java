public class MadLib {

    /*Create your own MadLibs. (https://www.madtakes.com/) You may use a story or example from the
    website if you don't wish to make up your own. This program must run entirely in the console.
     */
        public static class L9 {

        public static void main(String[] args) {

            String firstName;
            String lastName;

            firstName = JOptionPane.showInputDialog("What is your age?");
            lastName = JOptionPane.showInputDialog("What is your birth year?");

            JOptionPane.showMessageDialog(null, "Hey there" + firstName + "!");

            int yearBirth, monthOfYear ;
            double dayOfMonth, dayOfWeek = 7;

            yearBirth = Integer.parseInt(JOptionPane.showInputDialog("What is your age today?"));
            monthOfYear = Integer.parseInt(JOptionPane.showInputDialog("What is your birth month?"));

            yearBirth = monthOfYear / 12;
            dayOfMonth = dayOfWeek / 7;


        }}


    }
    
}
