public class Main {

    static boolean isFind(int value, int[] arr){
        for(int i : arr){
            if(value == i){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int[] arr1 = {5,69,54,8,36,15,4,2,35,65,78,47,15,4,66,25,35,66,89,74,12,42,42,4,2};
        int[] duplicate = new int[arr1.length];
        int startIndex=0;

        for(int i=0; i < arr1.length; i++){
            for(int j=0; j < arr1.length; j++){
                if(i != j && arr1[i] == arr1[j]){
                    if(!isFind(arr1[i],duplicate)){
                        duplicate[startIndex++] = arr1[i];
                    }
                    break;
                }
            }
        }

        for(int value:duplicate){
            if(value != 0 && value %2 == 0){
                System.out.println(value);
            }
        }
    }
}