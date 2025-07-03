// 1D ARRAY


//GIVEN ARRAY TO CALCULATE SUM

// class Index{
//     public static void main(String[] args) {
//         int [] arr1={1,2,3,4,5,};
//         int[] arr2={4,2,4,2,4};
//         int sum=0;
//         for(int i=0;i<arr1.length;i++){
//             sum=sum+arr1[i]+arr2[i];
//         }
//         System.out.println(sum);
//     }
// }



// GIVEN 2 ARRAY TO CONVERT 3RD NEW ARRAY

// class Index{
//     public static void main(String[] args) {
//         int [] arr1={1,2,3,4,5};
//         int[] arr2={4,2,4,2,4};
//      int [] arr3=new int[arr1.length+arr2.length];

//      for(int i=0;i<arr1.length;i++){
//         arr3[i]=arr1[i];
//      }

//      for (int k=0;k<arr2.length;k++){
//         arr3[arr1.length+k]=arr2[k];
//      }
     
//      for(int j=0;j<arr3.length;j++){
//         System.out.println(arr3[j]);
//      }
//     }

// }


// 4: Common Elements in Two Arrays



// class Index{
//     public static void main(String[] args) {
//         int [] arr1={1,2,3,4,5};
//         int[] arr2={4,2,4,2,4};

//         // System.out.println("common Array");

//         for(int i=0; i<arr1.length;i++){

//             for(int j=0;j<arr2.length;j++){
//                 if(arr1[i]==arr2[j]){
//                     System.out.println(arr1[i]+ " ");
//                 }

//             }
//         }

//     }
// }




// Q5: Unique Elements from Both Arrays



// class Index{
//     public static void main(String[] args) {
//         int [] arr1={1,2,3,4,5};
//         int[] arr2={4,2,4,2,4};


        
//       System.out.print("Unique elements: ");


class Index{
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5};
        int[] arr2={4,2,4,2,4};



for (int i = 0; i < arr1.length; i++) {
boolean found = false;

for (int j = 0; j < arr2.length; j++) {
if (arr1[i] == arr2[j]) {
found = true;
break;
}
}
if (!found) {
System.out.print(arr1[i] + " ");
}
}
// arr2 elements not in arr1
for (int i = 0; i < arr2.length; i++) {
boolean found = false;
for (int j = 0; j < arr1.length; j++) {
if (arr2[i] == arr1[j]) {
found = true;
break;
}
}
if (!found) {
System.out.print(arr2[i] + " ");

}
}
    }
}


