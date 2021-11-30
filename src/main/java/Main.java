public class Main {
    public static void main(String[] args)
    {

            int inputNumberArray[] = { 10, 5, 350, 100, 45, 95, 560, 101,770,561 ,1000};
            int firstLargestNum = 0;
            int secondLargestNum = 0;

            for (int i = 0; i < inputNumberArray.length; i++) {
                if (firstLargestNum < inputNumberArray[i]) {
                    secondLargestNum = firstLargestNum;
                    firstLargestNum = inputNumberArray[i];
                } else if (secondLargestNum < inputNumberArray[i]) {
                    secondLargestNum = inputNumberArray[i];
                }
            }
            System.out.println("First Latest Number:" + firstLargestNum+ ", Second Latest Number:" + secondLargestNum);
        }
    }
        

    

