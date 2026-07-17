public public class VideoStore {

    Video[] store;
    int count;


    public VideoStore() {
        store = new Video[10];
        count = 0;
    }


    public void addVideo(String name) {

        store[count] = new Video(name);
        count++;

        System.out.println("Video \"" + name + "\" added successfully.");
    }


    public void doCheckout(String name) {

        for(int i=0; i<count; i++) {

            if(store[i].getName().equals(name)) {

                store[i].doCheckout();

                System.out.println("Video \"" + name + "\" checked out successfully.");
                return;
            }
        }

        System.out.println("Video not found");
    }



    public void doReturn(String name) {

        for(int i=0; i<count; i++) {

            if(store[i].getName().equals(name)) {

                store[i].doReturn();

                System.out.println("Video \"" + name + "\" returned successfully.");
                return;
            }
        }

        System.out.println("Video not found");
    }



    public void receiveRating(String name, int rating) {

        for(int i=0; i<count; i++) {

            if(store[i].getName().equals(name)) {

                store[i].receiveRating(rating);

                System.out.println("Rating \"" + rating +
                        "\" has been mapped to the Video \"" + name + "\".");

                return;
            }
        }

        System.out.println("Video not found");
    }



    public void listInventory() {

        System.out.println("------------------------------------------");
        System.out.println("Video Name | Checkout Status | Rating");


        for(int i=0; i<count; i++) {

            System.out.println(
                store[i].getName() + " | " +
                store[i].getCheckout() + " | " +
                store[i].getRating()
            );
        }

        System.out.println("------------------------------------------");
    }
}{

}
