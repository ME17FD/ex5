public class StringCalculator {

    
    public static int calcul(String input) {
        
        if(input == null || input.isEmpty()) return 0;

        input = input.replace("\n", ",");

        String[] numbers = input.split(",");
        int sum = 0;

        for (String num : numbers) {
            String i = num.trim();
            if (!i.isEmpty()){
            sum += Integer.parseInt(i.trim());}
        }

        return sum;
    }
}

