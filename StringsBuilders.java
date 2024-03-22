public class StringsBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Saima");
        sb.append(" Farheen");
        System.out.println(sb);
        System.out.println(sb.length());

        System.out.println(sb.charAt(0));

        sb.setCharAt(0, 'F');
        System.out.println(sb);

        sb.insert(2, 'T');
        System.out.println(sb);
          
        //3 is non exclusive
        sb.delete(2, 4);
        System.out.println(sb);
        

        
    }
    
}
