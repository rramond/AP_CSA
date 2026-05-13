package frq2_class_design;
/*
This question involves the SignedText class, which contains methods that are used to include
a signature as part of a string of text. You will write the complete SignedText class, which
contains a constructor and two methods.
The SignedText constructor takes two String parameters. The first parameter is a first
name and the second parameter is a last name. The length of the second parameter is always
greater than or equal to 1.
The getSignature method takes no parameters and returns a formatted signature string
constructed from the first and last names according to the following rules.
• If the first name is an empty string, the returned signature string contains just the last
name.
• If the first name is not an empty string, the returned signature string is the first letter of
the first name, a dash ("-"), and the last name, in that order.
The addSignature method returns a possibly revised copy of its String parameter. The
parameter will contain at most one occurrence of the object’s signature, at either the beginning
or the end of the parameter. The returned string is created from the parameter according to the
following rules.
• If the object’s signature does not occur in the String parameter of the method, the
returned String is the value of the parameter with the signature added to the end.
• If the object’s signature occurs at the end of the String parameter, the returned
String is the unchanged value of the parameter.
• If the object’s signature occurs at the beginning of the String parameter, the returned
String is the value of the original parameter with the signature removed from the
beginning and appended to the end of the parameter
 */
public class SignedText {
    private String firstName;
    private String lastName;
    public SignedText(String fname, String lname) {
        firstName = fname;
        lastName = lname;
    }

    public String getSignature() {
        if (firstName.isEmpty())
            return lastName;
        return (firstName.charAt(0) + "-" + lastName);
    }

    public String addSignature(String s) {
        String signature = getSignature();
        if (!s.contains(signature)) {
            return s + signature;
        } else if (s.startsWith(signature)) {
            return s.substring(signature.length()) + signature;
        } else if (s.endsWith(signature)) {
            return s;
        }
        return s; // ← silent lie
    }
}
