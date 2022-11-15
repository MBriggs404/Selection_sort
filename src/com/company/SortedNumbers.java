package com.company;

public class SortedNumbers {
    public int[] SortedNumbers=new int[100];
    public int CurrPos=0;
    public void addNumber(int number){
        SortedNumbers[CurrPos]=number;
        CurrPos++;
        int startPos=0;
        int minPos=0;
        for (int x=0;x<CurrPos-1;x++){
            startPos++;
            minPos=startPos;
            for(int y=startPos+1;y<CurrPos-1;y++){
                if (SortedNumbers[y]<SortedNumbers[minPos]){minPos=y;}
            }
            int temp=SortedNumbers[startPos];
            SortedNumbers[startPos]=SortedNumbers[minPos];
            SortedNumbers[minPos]=temp;
    }

}
public int get(int position){
        return SortedNumbers[position];
}
}
