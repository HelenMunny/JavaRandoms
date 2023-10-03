package practice;

public class Arrays {
    public static void main(String[] args) {
//     HashMap<String,Integer> products = new HashMap<>();
//        products.put("Soap",10);
//        products.put("Cookies",12);
//        products.put("Shampoo",5);
//        products.put("Plates",20);
//        products.put("Dishes",100);
//
//        System.out.println(products);
//        System.out.println(products.keySet());



//        ArrayList<Integer> nums = new ArrayList<>();
//        nums.add(3);
//        nums.add(7);
//        nums.add(8);
//        nums.add(1);
//        nums.add(15);
//
//        int sum=0;
//        for (int l=0; l<nums.size(); l++){
//            System.out.println(nums.get(l));
//        }

        int[] nums = {3,7,9,-5,1,0};
        int min =0;
        for(int k=0; k<nums.length; k++){
            if(min>nums[k]){
                min = nums[k];
            }
        }
        System.out.println(min);
        int max =0;
        for(int n=0;n<nums.length;n++){
            if(max<nums[n]){
                max = nums[n];
            }
        }
        System.out.println(max);


    }
}
