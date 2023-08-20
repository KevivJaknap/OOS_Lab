import java.util.*;
public class VideoStoreLauncher {
    List<Video> videos;
    VideoStoreLauncher(){
        videos = new ArrayList<Video>();
    }
    void addVideo(String title){
        Video v = new Video();
        v.title = title;
        v.isRented = false;
        videos.add(v);
    }
    //check if video is rented
    boolean check(String title){
        for (Video video : videos) {
            if (video.title.equals(title)) {
                return video.isRented;
            }
        }
        return false;
    }
    void doRent(String title){
        boolean flag = false;
        for (Video video : videos) {
            if (video.title.equals(title) && !video.isRented) {
                video.isRented = true;
                flag = true;
            }
        }
        if(!flag){
            System.out.println("Video not available");
        }
    }
    void doReturn(String title){
        for (Video video : videos) {
            if (video.title.equals(title)) {
                video.isRented = false;
            }
        }
    }
    void listInventory(){
        String st;
        for (Video video : videos) {
            if (video.isRented) {
                st = "Rented";
            } else {
                st = "Available";
            }
            System.out.println(video.title + " " + st);
        }
    }
    void addBulkVideos(int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            String title = sc.nextLine();
            addVideo(title);
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        VideoStoreLauncher vsl = new VideoStoreLauncher();
        int n;
        do{
            System.out.println("1-Add video");
            System.out.println("2-Check availability");
            System.out.println("3-Rent video");
            System.out.println("4-Return video");
            System.out.println("5-List inventory");
            System.out.println("6-Exit");

            while(!scn.hasNextInt()){
                System.out.println("Enter a valid integer");
                scn.next();
            }
            n = scn.nextInt();
            switch(n){
                case 1:
                    System.out.println("Enter number of videos: ");
                    int N = scn.nextInt();
                    vsl.addBulkVideos(N);
                    break;
                case 2:
                    System.out.println("Title: ");
                    String title = scn.next();
                    if(vsl.check(title)){
                        System.out.println("Not available");
                    }
                    else{
                        System.out.println("Available");
                    }
                    break;
                case 3:
                    System.out.println("Title: ");
                    String title1 = scn.next();
                    vsl.doRent(title1);
                    break;
                case 4:
                    System.out.println("Title: ");
                    String title2 = scn.next();
                    vsl.doReturn(title2);
                    break;
                case 5:
                    vsl.listInventory();
                    break;
                case 6:
                    break;
            }
        }while(n != 6);
    }
}
