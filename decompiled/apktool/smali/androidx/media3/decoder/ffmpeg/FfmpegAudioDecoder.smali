.class public final Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;
.super Ll/ۗ᩸֫;
.source "FfmpegAudioDecoder.java"


# instance fields
.field public final ֡:I

.field public ֨:Z

.field public final ۚ:[B

.field public final ۠:Ll/۟᩸֫;

.field public ܶ:J

.field public volatile ᩴ:I

.field public final ᩵:Ljava/lang/String;

.field public ᩸:I

.field public volatile ᩹:I


# direct methods
.method public constructor <init>(ILl/۠ᩴ֫;Z)V
    .locals 10

    const/16 v0, 0x10

    new-array v1, v0, [Ll/᩸᩸֫;

    new-array v0, v0, [Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    .line 68
    invoke-direct {p0, v1, v0}, Ll/ۗ᩸֫;-><init>([Ll/᩸᩸֫;[Ll/᩶᩸֫;)V

    .line 69
    invoke-static {}, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 72
    iget-object v0, p2, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    invoke-static {p2}, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->֫(Ll/۠ᩴ֫;)Ljava/lang/String;

    move-result-object v2

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    iput-object v2, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->᩵:Ljava/lang/String;

    .line 74
    iget-object v1, p2, Ll/۠ᩴ֫;->᩸:Ljava/util/List;

    .line 218
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x2

    const/4 v7, -0x1

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v3, "audio/opus"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v7, 0x3

    goto :goto_0

    :sswitch_1
    const-string v3, "audio/alac"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    goto :goto_0

    :sswitch_2
    const-string v3, "audio/mp4a-latm"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    const/4 v7, 0x1

    goto :goto_0

    :sswitch_3
    const-string v3, "audio/vorbis"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    const/4 v7, 0x0

    :goto_0
    const/4 v3, 0x0

    packed-switch v7, :pswitch_data_0

    move-object v8, v3

    goto :goto_2

    .line 238
    :pswitch_0
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    .line 239
    array-length v4, v1

    add-int/lit8 v4, v4, 0xc

    .line 240
    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v7

    .line 241
    invoke-virtual {v7, v4}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    const v4, 0x616c6163

    .line 242
    invoke-virtual {v7, v4}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 243
    invoke-virtual {v7, v5}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 244
    array-length v4, v1

    invoke-virtual {v7, v1, v5, v4}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 245
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    goto :goto_1

    .line 221
    :pswitch_1
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    :goto_1
    move-object v8, v1

    goto :goto_2

    .line 249
    :pswitch_2
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, [B

    .line 250
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    .line 251
    array-length v8, v7

    array-length v9, v1

    add-int/2addr v8, v9

    add-int/lit8 v8, v8, 0x6

    new-array v8, v8, [B

    .line 252
    array-length v9, v7

    shr-int/lit8 v9, v9, 0x8

    int-to-byte v9, v9

    aput-byte v9, v8, v5

    .line 253
    array-length v9, v7

    and-int/lit16 v9, v9, 0xff

    int-to-byte v9, v9

    aput-byte v9, v8, v4

    .line 254
    array-length v4, v7

    invoke-static {v7, v5, v8, v6, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 255
    array-length v4, v7

    add-int/2addr v4, v6

    aput-byte v5, v8, v4

    .line 256
    array-length v4, v7

    add-int/lit8 v4, v4, 0x3

    aput-byte v5, v8, v4

    .line 257
    array-length v4, v7

    add-int/lit8 v4, v4, 0x4

    array-length v9, v1

    shr-int/lit8 v9, v9, 0x8

    int-to-byte v9, v9

    aput-byte v9, v8, v4

    .line 258
    array-length v4, v7

    add-int/lit8 v4, v4, 0x5

    array-length v9, v1

    and-int/lit16 v9, v9, 0xff

    int-to-byte v9, v9

    aput-byte v9, v8, v4

    .line 259
    array-length v4, v7

    add-int/lit8 v4, v4, 0x6

    array-length v7, v1

    invoke-static {v1, v5, v8, v4, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 74
    :goto_2
    iput-object v8, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->ۚ:[B

    .line 179
    iget-object v1, p2, Ll/۠ᩴ֫;->ۜ:Ljava/lang/String;

    const-string v4, "audio/mpeg"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "video/mp4"

    .line 180
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "audio/mp4"

    .line 181
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "application/mp4"

    .line 182
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 77
    :cond_4
    new-instance v3, Ll/۟᩸֫;

    invoke-static {}, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->֫()I

    move-result v0

    invoke-direct {v3, v0}, Ll/۟᩸֫;-><init>(I)V

    .line 78
    :cond_5
    iput-object v3, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->۠:Ll/۟᩸֫;

    if-eqz p3, :cond_6

    const/4 v6, 0x4

    .line 79
    :cond_6
    iput v6, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->֡:I

    if-eqz p3, :cond_7

    const v0, 0x1fffe

    goto :goto_3

    :cond_7
    const v0, 0xffff

    .line 81
    :goto_3
    iput v0, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->᩸:I

    .line 82
    iget v5, p2, Ll/۠ᩴ֫;->ܽ֫:I

    iget v6, p2, Ll/۠ᩴ֫;->ܿ:I

    move-object v1, p0

    move-object v3, v8

    move v4, p3

    .line 83
    invoke-direct/range {v1 .. v6}, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->ffmpegInitialize(Ljava/lang/String;[BZII)J

    move-result-wide p2

    iput-wide p2, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->ܶ:J

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-eqz v2, :cond_8

    .line 87
    invoke-virtual {p0, p1}, Ll/ۗ᩸֫;->֫(I)V

    return-void

    .line 85
    :cond_8
    new-instance p1, Ll/ۨ᩸֫;

    const-string p2, "Initialization failed."

    .line 31
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 85
    throw p1

    .line 70
    :cond_9
    new-instance p1, Ll/ۨ᩸֫;

    const-string p2, "Failed to load decoder native libraries."

    .line 31
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 70
    throw p1

    :sswitch_data_0
    .sparse-switch
        -0x3bd43e14 -> :sswitch_3
        -0x3313c2e -> :sswitch_2
        0x59ac6426 -> :sswitch_1
        0x59b2d2d8 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private native ffmpegDecode(JLjava/nio/ByteBuffer;ILandroidx/media3/decoder/SimpleDecoderOutputBuffer;Ljava/nio/ByteBuffer;I)I
.end method

.method private native ffmpegGetChannelCount(J)I
.end method

.method private native ffmpegGetSampleRate(J)I
.end method

.method private native ffmpegInitialize(Ljava/lang/String;[BZII)J
.end method

.method private native ffmpegRelease(J)V
.end method

.method private native ffmpegReset(J[B)J
.end method

.method private growOutputBuffer(Landroidx/media3/decoder/SimpleDecoderOutputBuffer;I)Ljava/nio/ByteBuffer;
    .locals 4

    .line 180
    iput p2, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->᩸:I

    .line 62
    iget-object v0, p1, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;->ۗ:Ljava/nio/ByteBuffer;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v1

    const/4 v2, 0x0

    if-lt p2, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ll/᩺֡֫;->֫(Z)V

    .line 64
    invoke-static {p2}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 65
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v3

    .line 66
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 67
    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 68
    invoke-virtual {v1, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 69
    invoke-virtual {v1, p2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 70
    iput-object v1, p1, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;->ۗ:Ljava/nio/ByteBuffer;

    return-object v1
.end method

.method public static synthetic ֫(Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;Landroidx/media3/decoder/SimpleDecoderOutputBuffer;)V
    .locals 0

    .line 104
    invoke-virtual {p0, p1}, Ll/ۗ᩸֫;->֫(Ll/᩶᩸֫;)V

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 2

    .line 92
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ffmpeg"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->ۧ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->᩵:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/Throwable;)Ll/۠᩸֫;
    .locals 2

    .line 109
    new-instance v0, Ll/ۨ᩸֫;

    const-string v1, "Unexpected decode error"

    .line 50
    invoke-direct {v0, v1, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public final ֫(Ll/᩸᩸֫;Ll/᩶᩸֫;Z)Ll/۠᩸֫;
    .locals 9

    .line 38
    check-cast p2, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    if-eqz p3, :cond_1

    .line 117
    iget-wide v0, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->ܶ:J

    iget-object p3, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->ۚ:[B

    invoke-direct {p0, v0, v1, p3}, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->ffmpegReset(J[B)J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->ܶ:J

    const-wide/16 v2, 0x0

    cmp-long p3, v0, v2

    if-nez p3, :cond_0

    .line 119
    new-instance p1, Ll/ۨ᩸֫;

    const-string p2, "Error resetting (see logcat)."

    .line 31
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    return-object p1

    .line 121
    :cond_0
    iget-object p3, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->۠:Ll/۟᩸֫;

    if-eqz p3, :cond_1

    .line 123
    invoke-virtual {p3}, Ll/۟᩸֫;->֫()V

    .line 126
    :cond_1
    iget-object p3, p1, Ll/᩸᩸֫;->ۙ:Ljava/nio/ByteBuffer;

    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 127
    iget-wide v0, p1, Ll/᩸᩸֫;->ۤ:J

    .line 128
    iget-object v2, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->۠:Ll/۟᩸֫;

    if-eqz v2, :cond_2

    .line 129
    invoke-virtual {v2, v0, v1, p3}, Ll/۟᩸֫;->֫(JLjava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object p3

    .line 130
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->۠:Ll/۟᩸֫;

    iget-wide v1, p1, Ll/᩸᩸֫;->ۤ:J

    invoke-virtual {v0, v1, v2}, Ll/۟᩸֫;->֫(J)J

    move-result-wide v0

    :cond_2
    move-object v3, p3

    .line 132
    invoke-virtual {v3}, Ljava/nio/Buffer;->limit()I

    move-result v4

    .line 133
    iget p1, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->᩸:I

    invoke-virtual {p2, p1, v0, v1}, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;->ۧ(IJ)Ljava/nio/ByteBuffer;

    move-result-object v6

    .line 134
    iget-object p1, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->۠:Ll/۟᩸֫;

    const/4 p3, 0x0

    const/4 v8, 0x1

    if-eqz p1, :cond_3

    if-nez v4, :cond_3

    .line 136
    iput-boolean v8, p2, Ll/᩶᩸֫;->᩹:Z

    return-object p3

    .line 139
    :cond_3
    iget-wide v1, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->ܶ:J

    iget v7, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->᩸:I

    move-object v0, p0

    move-object v5, p2

    .line 140
    invoke-direct/range {v0 .. v7}, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->ffmpegDecode(JLjava/nio/ByteBuffer;ILandroidx/media3/decoder/SimpleDecoderOutputBuffer;Ljava/nio/ByteBuffer;I)I

    move-result p1

    const/4 v0, -0x2

    if-ne p1, v0, :cond_4

    .line 143
    new-instance p1, Ll/ۨ᩸֫;

    const-string p2, "Error decoding (see logcat)."

    .line 31
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_4
    const/4 v0, -0x1

    if-ne p1, v0, :cond_5

    .line 148
    iput-boolean v8, p2, Ll/᩶᩸֫;->᩹:Z

    return-object p3

    :cond_5
    if-nez p1, :cond_6

    .line 152
    iput-boolean v8, p2, Ll/᩶᩸֫;->᩹:Z

    return-object p3

    .line 155
    :cond_6
    iget-boolean v0, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->֨:Z

    if-nez v0, :cond_8

    .line 156
    iget-wide v0, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->ܶ:J

    invoke-direct {p0, v0, v1}, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->ffmpegGetChannelCount(J)I

    move-result v0

    iput v0, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->ᩴ:I

    .line 157
    iget-wide v0, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->ܶ:J

    invoke-direct {p0, v0, v1}, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->ffmpegGetSampleRate(J)I

    move-result v0

    iput v0, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->᩹:I

    .line 158
    iget v0, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->᩹:I

    if-nez v0, :cond_7

    const-string v0, "alac"

    iget-object v1, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->᩵:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 159
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->ۚ:[B

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    new-instance v0, Ll/ᩳ֨֫;

    iget-object v1, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->ۚ:[B

    invoke-direct {v0, v1}, Ll/ᩳ֨֫;-><init>([B)V

    .line 163
    iget-object v1, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->ۚ:[B

    array-length v1, v1

    add-int/lit8 v1, v1, -0x4

    invoke-virtual {v0, v1}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 164
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩹()I

    move-result v0

    iput v0, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->᩹:I

    .line 166
    :cond_7
    iput-boolean v8, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->֨:Z

    .line 170
    :cond_8
    iget-object p2, p2, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;->ۗ:Ljava/nio/ByteBuffer;

    .line 155
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 171
    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 172
    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    return-object p3
.end method

.method public final ֫()V
    .locals 2

    .line 186
    invoke-super {p0}, Ll/ۗ᩸֫;->֫()V

    .line 187
    iget-wide v0, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->ܶ:J

    invoke-direct {p0, v0, v1}, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->ffmpegRelease(J)V

    const-wide/16 v0, 0x0

    .line 188
    iput-wide v0, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->ܶ:J

    return-void
.end method

.method public final ۜ()I
    .locals 1

    .line 202
    iget v0, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->᩹:I

    return v0
.end method

.method public final ܳ()I
    .locals 1

    .line 195
    iget v0, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->ᩴ:I

    return v0
.end method

.method public final ܿ()Ll/᩶᩸֫;
    .locals 2

    .line 104
    new-instance v0, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    new-instance v1, Ll/ۤ᩸֫;

    invoke-direct {v1, p0}, Ll/ۤ᩸֫;-><init>(Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;)V

    invoke-direct {v0, v1}, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;-><init>(Ll/᩹᩸֫;)V

    return-object v0
.end method

.method public final ᩳ()Ll/᩸᩸֫;
    .locals 3

    .line 97
    new-instance v0, Ll/᩸᩸֫;

    const/4 v1, 0x2

    .line 99
    invoke-static {}, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->֫()I

    move-result v2

    invoke-direct {v0, v1, v2}, Ll/᩸᩸֫;-><init>(II)V

    return-object v0
.end method

.method public final ᩻()I
    .locals 1

    .line 209
    iget v0, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->֡:I

    return v0
.end method
