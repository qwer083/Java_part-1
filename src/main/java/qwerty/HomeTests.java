package qwerty;
public class HomeTests {
            public Object myVar;



            public static String getType(Object myVar) {return ((Object) myVar).getClass().getSimpleName();
            }


            public static void main(String[] args) {


                byte aByte = 55;
                short aShort = 59;
                int aInt = 7003;
                long aLong = 15000000;
                float aFloat = 6.23f;
                double aDouble = 4.2359;
                char aChar = 'D';
                boolean aBool = true;
                String myText = "Hello";

                System.out.println(myText);
                System.out.println("myByte type is " + getType(aByte));
                System.out.println("myInt type is " + getType(aInt));
                System.out.println("myLong type is " + getType(aLong));
                System.out.println("myFloat type is " + getType(aFloat));
                System.out.println("myDouble type is " + getType(aDouble));

                int[] arr = new int[]{78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
                System.out.print("\nArray elements before sorting:");

                for(
                        int i :arr)

                {
                    System.out.print(i + " ");
                }
                //System.out.print("\nArray elements after sorting:");

                for(
                        int i = 0;
                        i<arr.length;i++)

                {
                    for (int j = i + 1; j < arr.length; j++) {
                        int tmp;
                        if (arr[i] > arr[j]) {
                            tmp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = tmp;
                        }
                    }

                }

            }
        }



