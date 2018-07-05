# XVideo
XVideo is a video player toolkit

播放流程: 获取流-->解码-->播放
录制播放路程: 录制音频视频-->剪辑-->编码-->上传服务器 别人播放.
直播过程 : 录制音视频-->编码-->流媒体传输-->服务器--->流媒体传输到其他app-->解码-->播放

# 视频开发过程

1. 录制音视频 AudioRecord/MediaRecord
2. 视频剪辑 mp4parser 或ffmpeg
3. 音视频编码 aac&h264
4. 上传大文件 网络框架,进度监听,断点续传
5. 流媒体传输 流媒体传输协议rtmp rtsp hls
6. 音视频解码 aac&h264
7. 渲染播放 MediaPlayer

# 常见库
vitamio
webRTC
ffmpeg
vlc
ijkplayer
