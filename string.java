public class string {
    public static void main(String[] args) {
        String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the string is " + text.length());

        // upper case and lower case
        String new_text = "Hello Nepal";
        System.out.println("The upper case of the string \"" + new_text + "\" is " + new_text.toUpperCase());
        System.out.println("The lower case of the string \"" + new_text + "\" is " + new_text.toLowerCase());    
    
    // character finding in the text

    String sentence = "Hello this is the text finder";
    System.out.println(sentence.indexOf("is"));
    
    // concentration
    String first_name = "Shyam";
    String last_name = "Gopal";
    System.out.println(first_name + " " + last_name);
    System.out.println(first_name.concat(last_name));




    }
}
