public class Reversestring {
    public static void main(String[] args) {
         String str = "hello";
         char[] arr = str.toCharArray();

         int left=0;
         int right= arr.length -1;

         while(left < right) {
            char temp=0;
            temp=arr[right];
            arr[right]=arr[left];
            arr[left]= arr[temp];

            left++;
            right--;

            String reversed = new String(arr);
            System.out.println(str);
            System.out.println(reversed);
         }
    }
}
