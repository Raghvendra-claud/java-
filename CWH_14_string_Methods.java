public class CWH_14_string_Methods {
    public static void main(String[] args) {
        String name = "Harry";
        // System.out.print(name);

        int length = name.length();
        // System.out.println(length);

        String lstr = name.toLowerCase();
        // System.out.println(lstr);

        String ustr = name.toUpperCase();
        // System.out.println(ustr);

        String nonTrimed = "   Abhay    ";
        // System.out.println(nonTrimed);
        // System.out.println(nonTrimed.trim());

        // System.out.println(name.substring(3,4));

        // System.out.println(name.replace("Harry", "Abhay"));

        String newname = "Raghvendra";
        System.out.println(newname.charAt(5));

        System.out.println(newname.indexOf(5));

        System.out.println(newname.indexOf('v', 5));

        System.out.println(newname.lastIndexOf('a'));
        
        // System.out.println(newname.equals("Raghvendra"));
        System.out.println(newname.equalsIgnoreCase("raghvendra"));
    }
}