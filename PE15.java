import javax.swing.JOptionPane;
public class PE15 {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "Hello World!");

        String name = JOptionPane.showInputDialog("What is your name?"); //prompt for some input
        System.out.println(name);

        /*
        Modify the program from Exercise •• E1.16 so that the dialog continues with the
        message “My name is Hal! What would you like me to do?” Discard the user’s input
        and display a message such as
        I'm sorry, Dave. I'm afraid I can't do that.
        Replace Dave with the name that was provided by the user
         */
        String dialog = JOptionPane.showInputDialog("What is your name?"); //prompt for some input
        String input = JOptionPane.showInputDialog("What would you like me to do?");//prompt for some input
        String output = "I'm sorry " + dialog + ". I'm afraid I can't do that";
        JOptionPane.showMessageDialog (null, output); //tell user about something that has happened
    }
}
