package frq2_class_design;
/*
This question involves methods that distribute text across lines of an electronic sign. The electronic sign and
the text to be displayed on it are represented by the Sign class. You will write the complete Sign class,
which contains a constructor and two methods.
The Sign class constructor has two parameters. The first parameter is a String that contains the
message to be displayed on the sign. The second parameter is an int that contains the width of each line of
the sign. The width is the positive maximum number of characters that can be displayed on a single line of the
sign.
A sign contains as many lines as are necessary to display the entire message. The message is split among the
lines of the sign without regard to spaces or punctuation. Only the last line of the sign may contain fewer
characters than the width indicated by the constructor parameter.
The following are examples of a message displayed on signs of different widths. Assume that in each
example, the sign is declared with the width specified in the first column of the table and with the message
"Everything on sale, please come in", which contains 34 characters.

The numberOfLines method returns an int representing the number of lines needed to display the
text on the sign. In the previous examples, numberOfLines would return 3, 2, and 1, respectively,
for the sign widths shown in the table.

The getLines method returns a String containing the message broken into lines separated by
semicolons (;) or returns null if the message is the empty string. The constructor parameter that
contains the message to be displayed will not include any semicolons. As an example, in the first row of the
preceding table, getLines would return "Everything on s;ale, please com;e in".
No semicolon should appear at the end of the String returned by getLines
 */
public class Sign {

    private String message;
    private int width;

    public Sign(String mes, int w){
        message = mes;
        width = w;
    }

    public int numberOfLines() {
        return message.length() / width + (message.length() % width != 0 ? 1 : 0);
    }

    public String getLines(){
        if(message.equals("")) return null;
        String newMessage ="";
        int i = 0;
        for(; i < numberOfLines() - 1; i++) {
            newMessage += message.substring(i*width, (i+1)*width) + ";" ;
        }
        newMessage += message.substring(numberOfLines()-1);
        return newMessage;
    }
}
