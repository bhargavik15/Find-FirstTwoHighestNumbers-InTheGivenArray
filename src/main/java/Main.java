public class Main {
    public static void main(String[] args) {
        int inputNumberArray[] = {11, 22, 45, 92, 21, 54, 79, 11};
        int firstLargestNumber = 0;
        int secondLargestNumber = 0;
        for (int i = 0; i < inputNumberArray.length; i++) {


            if (firstLargestNumber < inputNumberArray[i]) {


                firstLargestNumber = inputNumberArray[i];

            } else if (secondLargestNumber < inputNumberArray[i]) {

                {
                    secondLargestNumber = inputNumberArray[i];
                }


            }
            System.out.println("First Largest Number:" + firstLargestNumber + ",Second Largest Number:" + secondLargestNumber);
        }
    }
}
