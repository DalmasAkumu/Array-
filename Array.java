public class Array {
    public static void main(String[] args){
        int [] marksArray = new int []{81, 106,5, 15,26};
        int temp;
        for (int i=0; i<marksArray.length;i++) {
             System.out.println(marksArray[i]);
        } 

        for (int i=0; i<marksArray.length;i++){
            for (int j=i; j<marksArray.length; j++){
                if (marksArray[i]< marksArray [j]){
                    temp = marksArray[i];
                    marksArray[i]= marksArray[j];
                    marksArray[j]= temp;
                }
            }
        }
        System.out.println();  
          
        
        System.out.println("Sorted arrays in descending order: ");  
        for (int a : marksArray) {   
            System.out.println(a); 

        }
    }
    
}
