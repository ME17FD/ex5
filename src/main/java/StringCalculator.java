public class StringCalculator {

    
    public static int calcul(String input) {
        
        if(input == null || input.isEmpty()) return 0;
        
        

        String[] numbers = input.split(",");
        int sum = 0;

        for (String num : numbers) {
            sum += Integer.parseInt(num.trim());
        }

        return sum;
    }
}

