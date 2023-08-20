package datastructure;

public class DSAArrays {
    private int[] element;
    public DSAArrays(int[] element) {
        this.element = element;
    }
    public int[] getElement() {
        return element;
    }
    public int[] rotateArray(int position){
        int length = this.element.length;
        int counter=1;
        while (counter<=position){
            int last=this.element[0];
            for (int i=0;i<length-1;i++){
                this.element[i]=this.element[i+1];
            }
            this.element[length-1]=last;
            counter++;
        }
        return this.element;
    }
}
