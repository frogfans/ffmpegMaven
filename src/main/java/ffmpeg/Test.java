package ffmpeg;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        list.add("-i F:\\video\\dapeng.mp4 -vn -vcodec copy F:\\video\\output.mp4");
        LinkedList<String> ffmpegCmds = new LinkedList<>(list);
        ffmpegCmds.addFirst("FFMPEG_PATH");
        String[] cmdarray = ffmpegCmds.toArray(new String[ffmpegCmds.size()]);

        cmdarray = cmdarray.clone();


    }
}
