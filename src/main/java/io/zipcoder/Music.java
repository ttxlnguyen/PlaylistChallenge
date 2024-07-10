package io.zipcoder;

public class Music {

    private static String[] playList = {"wheniseeyouagain","borntorun","nothingelsematters","cecelia"};

    public Music(String[] playList){
        this.playList = playList;
    }

    public static Integer selection(Integer startIndex, String selection){

        int countUp = 0;
        int countDown = 0;

        for (int i = startIndex; i <= playList.length; i++) {
            if (i == playList.length) {
                i = 0;
            } else if (playList[i].equals(selection)) {
                break;
            }
            countUp++;
            System.out.println("countUp: " + countUp);
        }

        for (int i = startIndex; i >= 0; i--) {
            if (playList[i].equals(selection)) {

                break;
            } else if (i == 0){
                i = playList.length;
            }
            countDown++;
            System.out.println("countDown: " + countDown);
        }

        if (countUp < countDown) {
            return countUp;
        } else if (countUp == countDown) {
            return countUp;
        } else {
            return countDown;
        }
    }

    public static void main(String[] args){
        selection(2, "borntorun");
    }
}
