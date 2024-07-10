package io.zipcoder;

public class Music {

    private static String[] playList = {"wheniseeyouagain","borntorun","nothingelsematters","cecelia"};

    public Music(String[] playList){
        this.playList = playList;
    }

    public static Integer selection(Integer startIndex, String selection){

        int fastForward = 0;
        int rewind = 0;

        for (int i = startIndex; i <= playList.length; i++) {
            if (i == playList.length) {
                i = 0;
            } else if (playList[i].equals(selection)) {
                break;
            }
            fastForward++;
            System.out.println("countUp: " + fastForward);
        }

        for (int i = startIndex; i >= 0; i--) {
            if (playList[i].equals(selection)) {
                break;
            } else if (i == 0){
                i = playList.length;
            }
            rewind++;
            System.out.println("countDown: " + rewind);
        }

        if (fastForward < rewind) {
            return fastForward;
        } else if (fastForward == rewind) {
            return fastForward;
        } else {
            return rewind;
        }
    }

    public static void main(String[] args){
        selection(2, "borntorun");
    }
}
