package Assign5;
interface Searchable{
    boolean search(String keyword);
}
class Document implements Searchable{
    String[] content;
    Document(String[] content){
        this.content = content;
    }
    public boolean search(String keyword){
        for(String s : content){
            if(s.equals(keyword)){
                return true;
            }
        }
        return false;
    }
}
class WebPage implements Searchable{
    String[] content;
    WebPage(String[] content){
        this.content = content;
    }
    public boolean search(String keyword){
        for(String s : content){
            if(s.equals(keyword)){
                return true;
            }
        }
        return false;
    }
}
public class Q9 {
    public static void main(String[] args){
        String s = "This is OOPS lab assignment test";
        String[] content = s.split(" ");
        Document d = new Document(content);
        WebPage w = new WebPage(content);
        System.out.println(d.search("OOPS"));
        System.out.println(w.search("Lab"));
    }
}
