public class SpreadSheetTabs {

    private String[] tabs;

    private int nextAvailable; // Number of items in list (note: NOT capacity)

    private int nextSheetNumber; // Number of next sheet added to list
    
    private int capacity;

    public SpreadSheetTabs() {

        tabs = new String[256];

        tabs[0] = "Sheet1";

        tabs[1] = "Sheet2";

        tabs[2] = "Sheet3";

        nextAvailable = 3; // Initially the list has 3 tabs (as shown above)

        nextSheetNumber = 4; // The next NEW sheet number
        
        capacity=3;

    }

    public boolean add(){
        if(nextAvailable<256){
        tabs[nextAvailable]="Sheet"+nextSheetNumber;
        nextAvailable++;
        nextSheetNumber++;
        return true;
    }else{return false;}
    }
    
    public int move(String from, String to, boolean before){
        String temp;
        for (int i=0;i<capacity;i++){
            temp=tabs[i];
            if (temp.contains(from)){
                
    }
}