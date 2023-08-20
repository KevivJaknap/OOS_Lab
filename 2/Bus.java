public class Bus {
    int busno;
    String from;
    String to;
    int kilometers;
    char type;

    public Bus(int busno, String from, String to, int kilometers, char type) {
        this.busno = busno;
        this.from = from;
        this.to = to;
        this.kilometers = kilometers;
        this.type = type;
    }
    public Bus(int busno, String from, String to, int kilometers) {
        this.busno = busno;
        this.from = from;
        this.to = to;
        this.kilometers = kilometers;
        this.type = 'O';
    }
    public int calcFare(){
        if(this.type == 'O'){
            return 10*this.kilometers;
        }
        else if(this.type == 'F'){
            return 20*this.kilometers;
        }
        else{
            return 24*this.kilometers;
        }
    }
    public void Show(){
        System.out.println(this.busno+","+this.from+","+this.to+","+this.kilometers+","+this.type+","+this.calcFare());
    }
}
