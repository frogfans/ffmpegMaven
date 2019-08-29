package ffmpeg;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        File fileInput = new File("F:\\video\\dapeng.mp4");
        File fileOutPut = new File("F:\\video\\output.mp4");
//        list.add("-i F:\\video\\dapeng.mp4 -vn -vcodec copy F:\\video\\output.mp4");
//        MediaUtil.convertVideo(fileInput, fileOutPut);
        list.add("-i");
        list.add("F:\\video\\dapeng.mp4");
        list.add("-vn");
        list.add("-vcodec");
        list.add("copy");
        list.add("F:\\video\\output.mp4");

        MediaUtil.executeCommand(list);
    }
}
