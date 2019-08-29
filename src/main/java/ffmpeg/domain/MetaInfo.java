package ffmpeg.domain;

import lombok.Data;

/**
 * Author: dreamer-1
 * Date: 2018/5/7
 * Time: 16:30
 * Description: 多媒体数据（包含图片，视频）的基本信息类
 */
@Data
public class MetaInfo {
    /**
     * 多媒体信息的宽度，图片代表宽度，视频代表帧宽度 ，单位为px
     */
    private Integer width;
    /**
     * 多媒体信息的宽度，图片代表高度，视频代表帧高度 ，单位为px
     */
    private Integer height;
    /**
     * 多媒体的大小，指的是存储体积，单位为B
     */
    private Long size;
    /**
     * 格式
     */
    private String format;


}
