.class public final Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;
.super Ljava/lang/Object;
.source "FfmpegLibrary.java"


# static fields
.field public static final ֫:Ll/֡ۚ֫;

.field public static ۧ:I

.field public static ܽ:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "media3.decoder.ffmpeg"

    .line 34
    invoke-static {v0}, Ll/ܽ᩵֫;->֫(Ljava/lang/String;)V

    .line 39
    new-instance v0, Ll/᩺᩸֫;

    const-string v1, "ffmpegJNI"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    .line 40
    invoke-direct {v0, v1}, Ll/֡ۚ֫;-><init>([Ljava/lang/String;)V

    .line 39
    sput-object v0, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->֫:Ll/֡ۚ֫;

    const/4 v0, -0x1

    .line 48
    sput v0, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->ۧ:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native ffmpegGetInputBufferPaddingSize()I
.end method

.method public static native ffmpegGetVersion()Ljava/lang/String;
.end method

.method public static native ffmpegHasDecoder(Ljava/lang/String;)Z
.end method

.method public static ֫()I
    .locals 2

    .line 69
    sget-object v0, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->֫:Ll/֡ۚ֫;

    invoke-virtual {v0}, Ll/֡ۚ֫;->֫()Z

    move-result v0

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    .line 94
    :cond_0
    sget v0, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->ۧ:I

    if-ne v0, v1, :cond_1

    .line 95
    invoke-static {}, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->ffmpegGetInputBufferPaddingSize()I

    move-result v0

    sput v0, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->ۧ:I

    .line 97
    :cond_1
    sget v0, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->ۧ:I

    return v0
.end method

.method public static ֫(Ll/۠ᩴ֫;)Ljava/lang/String;
    .locals 3

    .line 173
    iget-object p0, p0, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 128
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, -0x1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "audio/g711-mlaw"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v2, 0x13

    goto/16 :goto_0

    :sswitch_1
    const-string v1, "audio/g711-alaw"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v2, 0x12

    goto/16 :goto_0

    :sswitch_2
    const-string v1, "audio/true-hd"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v2, 0x11

    goto/16 :goto_0

    :sswitch_3
    const-string v1, "audio/vnd.dts.hd"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v2, 0x10

    goto/16 :goto_0

    :sswitch_4
    const-string v1, "audio/opus"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v2, 0xf

    goto/16 :goto_0

    :sswitch_5
    const-string v1, "audio/mpeg"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v2, 0xe

    goto/16 :goto_0

    :sswitch_6
    const-string v1, "audio/flac"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v2, 0xd

    goto/16 :goto_0

    :sswitch_7
    const-string v1, "audio/eac3"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v2, 0xc

    goto/16 :goto_0

    :sswitch_8
    const-string v1, "audio/alac"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v2, 0xb

    goto/16 :goto_0

    :sswitch_9
    const-string v1, "audio/3gpp"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v2, 0xa

    goto/16 :goto_0

    :sswitch_a
    const-string v1, "video/avc"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v2, 0x9

    goto/16 :goto_0

    :sswitch_b
    const-string v1, "audio/ac3"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 v2, 0x8

    goto/16 :goto_0

    :sswitch_c
    const-string v1, "audio/mp4a-latm"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_d

    goto :goto_0

    :cond_d
    const/4 v2, 0x7

    goto :goto_0

    :sswitch_d
    const-string v1, "audio/mpeg-L2"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_e

    goto :goto_0

    :cond_e
    const/4 v2, 0x6

    goto :goto_0

    :sswitch_e
    const-string v1, "audio/mpeg-L1"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_f

    goto :goto_0

    :cond_f
    const/4 v2, 0x5

    goto :goto_0

    :sswitch_f
    const-string v1, "audio/vorbis"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_10

    goto :goto_0

    :cond_10
    const/4 v2, 0x4

    goto :goto_0

    :sswitch_10
    const-string v1, "audio/vnd.dts"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_11

    goto :goto_0

    :cond_11
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_11
    const-string v1, "audio/amr-wb"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_12

    goto :goto_0

    :cond_12
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_12
    const-string v1, "video/hevc"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_13

    goto :goto_0

    :cond_13
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_13
    const-string v1, "audio/eac3-joc"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_14

    goto :goto_0

    :cond_14
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    return-object v0

    :pswitch_0
    const-string p0, "pcm_mulaw"

    return-object p0

    :pswitch_1
    const-string p0, "pcm_alaw"

    return-object p0

    :pswitch_2
    const-string p0, "truehd"

    return-object p0

    :pswitch_3
    const-string p0, "opus"

    return-object p0

    :pswitch_4
    const-string p0, "flac"

    return-object p0

    :pswitch_5
    const-string p0, "alac"

    return-object p0

    :pswitch_6
    const-string p0, "amrnb"

    return-object p0

    :pswitch_7
    const-string p0, "h264"

    return-object p0

    :pswitch_8
    const-string p0, "ac3"

    return-object p0

    :pswitch_9
    const-string p0, "aac"

    return-object p0

    :pswitch_a
    const-string p0, "mp3"

    return-object p0

    :pswitch_b
    const-string p0, "vorbis"

    return-object p0

    :pswitch_c
    const-string p0, "dca"

    return-object p0

    :pswitch_d
    const-string p0, "amrwb"

    return-object p0

    :pswitch_e
    const-string p0, "hevc"

    return-object p0

    :pswitch_f
    const-string p0, "eac3"

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e929daa -> :sswitch_13
        -0x63185e82 -> :sswitch_12
        -0x5fc6f775 -> :sswitch_11
        -0x41455b98 -> :sswitch_10
        -0x3bd43e14 -> :sswitch_f
        -0x19cc928c -> :sswitch_e
        -0x19cc928b -> :sswitch_d
        -0x3313c2e -> :sswitch_c
        0xb269698 -> :sswitch_b
        0x4f62373a -> :sswitch_a
        0x59976a2d -> :sswitch_9
        0x59ac6426 -> :sswitch_8
        0x59ae0c65 -> :sswitch_7
        0x59aeaa01 -> :sswitch_6
        0x59b1e81e -> :sswitch_5
        0x59b2d2d8 -> :sswitch_4
        0x59c2dc42 -> :sswitch_3
        0x5cc95062 -> :sswitch_2
        0x71710385 -> :sswitch_1
        0x717677f9 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_f
        :pswitch_4
        :pswitch_a
        :pswitch_3
        :pswitch_c
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ۧ()Ljava/lang/String;
    .locals 1

    .line 69
    sget-object v0, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->֫:Ll/֡ۚ֫;

    invoke-virtual {v0}, Ll/֡ۚ֫;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 80
    :cond_0
    sget-object v0, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->ܽ:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 81
    invoke-static {}, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->ffmpegGetVersion()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->ܽ:Ljava/lang/String;

    .line 83
    :cond_1
    sget-object v0, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public static ۧ(Ll/۠ᩴ֫;)Z
    .locals 3

    .line 69
    sget-object v0, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->֫:Ll/֡ۚ֫;

    invoke-virtual {v0}, Ll/֡ۚ֫;->֫()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    .line 118
    :cond_0
    invoke-static {p0}, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->֫(Ll/۠ᩴ֫;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    :goto_0
    return v1

    .line 190
    :cond_1
    invoke-static {p0}, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->ffmpegHasDecoder(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 191
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "No "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " decoder available. Check the FFmpeg build configuration."

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    return v1

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method public static ܽ()Z
    .locals 1

    .line 69
    sget-object v0, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->֫:Ll/֡ۚ֫;

    invoke-virtual {v0}, Ll/֡ۚ֫;->֫()Z

    move-result v0

    return v0
.end method
