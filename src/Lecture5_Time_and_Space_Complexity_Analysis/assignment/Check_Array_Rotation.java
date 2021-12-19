package Lecture5_Time_and_Space_Complexity_Analysis.assignment;

public class Check_Array_Rotation {
    //LOGIC IS SIMPLE JUST SET MIN TO 1ST INDEX AND VALUE
    public static int arrayRotateCheck(int[] arr){
        if(arr.length <= 1) return 0;
        int min = arr[0];
        int min_index = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (min > arr[i])
            {
                min = arr[i];
                min_index = i;
            }
        }
        return min_index;
    }

    public static void main(String[] args) {
        int [] arr = {26 ,30 ,33 ,38 ,1 ,3 ,6 ,11 ,12 ,17 ,22 };
        //Answer is 4th index so 4
        System.out.println(arrayRotateCheck(arr));


    }


}

