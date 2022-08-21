class RightTriangle {
    public static void main(String args[]){
        int i,j;
        System.out.println("Right angled triangle");
        for (i=0;i<10;i++){
           for(j=0;j<10;j++){
             if(j==0||i==9)
             System.out.print(" *");
             else if(i!=j)
             System.out.print("  ");
             else if(i==j)
             System.out.print(" *");
             
        }
        System.out.println("");
    }
    }
    
}
