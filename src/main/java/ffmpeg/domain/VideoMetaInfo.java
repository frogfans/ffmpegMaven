package ffmpeg.domain;

import lombok.Data;

/**
 * Author: dreamer-1
 * Date: 2018/5/7
 * Time: 16:32
 * Description: 视频数据基本信息类
 */
@Data
public class VideoMetaInfo extends MetaInfo {
    /**
     * 视频时长 ,单位：毫秒
     */
    private Long duration;
    /**
     * 比特率，单位：Kb/s
     * 指视频每秒传送的比特数
     */
    private Integer bitRate;
    /**
     * 编码器
     */
    private String decoder;
    /**
     * 帧率，单位：FPS（Frame Per Second）
     * 指视频每秒包含的帧数
     */
    private Float frameRate;
}
