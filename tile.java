public class tile {
    //set the attributes class called tile
    String letter;
    int value;
    public void tile(){
    }//end constructor

    //constructor new tile object
    // with letter and value
    public tile(String letter, int value){
        setLetter(letter);
        setValue(value);

    }//constructor

    // accessor methods to get and set the attributes of the class
    public String getLetter() {
        return letter;

    }//end letter

    public void setLetter(String letter){
        this.letter = letter;

    }//end set letter

    //accessor methods to get and set the attributes of the class
    public int getValue(){

        return value;
    }//end int=value

    public void setValue(int value){
        this.value = value;
    }//end get int=value

    public void printtile(){
        System.out.println("this letter is: " + letter + " this value is: " + value);
    }
    public class tiltlegenrator {
        public static void main(String[] args) {

            tile p = new tile("z", 10);
            p.printtile();
        }
    }


}//end main
