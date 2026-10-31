.class public final Ll/ۛ᩸֫;
.super Ll/ܰ۫֫;
.source "O8F6"


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [Ll/֡֡֫;

    .line 76
    new-instance v1, Ll/᩷ۤ֫;

    .line 79
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v2

    invoke-direct {v1, v2}, Ll/᩷ۤ֫;-><init>(Landroid/content/ContextWrapper;)V

    invoke-virtual {v1, v0}, Ll/᩷ۤ֫;->֫([Ll/֡֡֫;)V

    invoke-virtual {v1}, Ll/᩷ۤ֫;->֫()Ll/۠ۤ֫;

    move-result-object v0

    const/4 v1, 0x0

    .line 76
    invoke-direct {p0, v1, v1, v0}, Ll/ۛ᩸֫;-><init>(Landroid/os/Handler;Ll/ۚ۫֫;Ll/ۙ۫֫;)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;Ll/ۚ۫֫;Ll/ۙ۫֫;)V
    .locals 0

    .line 94
    invoke-direct {p0, p1, p2, p3}, Ll/ܰ۫֫;-><init>(Landroid/os/Handler;Ll/ۚ۫֫;Ll/ۙ۫֫;)V

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "FfmpegAudioRenderer"

    return-object v0
.end method

.method public final ֫(Ll/֨᩸֫;)Ll/۠ᩴ֫;
    .locals 2

    .line 45
    check-cast p1, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    new-instance v0, Ll/֨ᩴ֫;

    invoke-direct {v0}, Ll/֨ᩴ֫;-><init>()V

    const-string v1, "audio/raw"

    .line 150
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    .line 151
    invoke-virtual {p1}, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->ܳ()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->ᩳ(I)V

    .line 152
    invoke-virtual {p1}, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->ۜ()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->۠(I)V

    .line 153
    invoke-virtual {p1}, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->᩻()I

    move-result p1

    invoke-virtual {v0, p1}, Ll/֨ᩴ֫;->᩵(I)V

    .line 154
    invoke-virtual {v0}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/۠ᩴ֫;)Ll/֨᩸֫;
    .locals 7

    const-string v0, "createFfmpegAudioDecoder"

    .line 38
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 133
    iget v0, p1, Ll/۠ᩴ֫;->ۗ:I

    iget v1, p1, Ll/۠ᩴ֫;->ܽ֫:I

    iget v2, p1, Ll/۠ᩴ֫;->ܿ:I

    const/4 v3, -0x1

    if-eq v0, v3, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x1680

    .line 134
    :goto_0
    new-instance v3, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;

    const/4 v4, 0x2

    .line 163
    invoke-static {v4, v2, v1}, Ll/ۘ֨֫;->ܽ(III)Ll/۠ᩴ֫;

    move-result-object v5

    .line 162
    invoke-virtual {p0, v5}, Ll/ܰ۫֫;->ᩳ(Ll/۠ᩴ֫;)Z

    move-result v5

    const/4 v6, 0x1

    if-nez v5, :cond_1

    goto :goto_1

    :cond_1
    const/4 v5, 0x4

    .line 175
    invoke-static {v5, v2, v1}, Ll/ۘ֨֫;->ܽ(III)Ll/۠ᩴ֫;

    move-result-object v1

    .line 174
    invoke-virtual {p0, v1}, Ll/ܰ۫֫;->ܽ(Ll/۠ᩴ֫;)I

    move-result v1

    if-eq v1, v4, :cond_2

    const/4 v6, 0x0

    goto :goto_1

    :cond_2
    const-string v1, "audio/ac3"

    .line 181
    iget-object v2, p1, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    xor-int/2addr v6, v1

    .line 136
    :goto_1
    invoke-direct {v3, v0, p1, v6}, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;-><init>(ILl/۠ᩴ֫;Z)V

    .line 49
    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-object v3
.end method

.method public final ܿ(Ll/۠ᩴ֫;)I
    .locals 5

    .line 104
    iget-object v0, p1, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    iget v1, p1, Ll/۠ᩴ֫;->ܽ֫:I

    iget v2, p1, Ll/۠ᩴ֫;->ܿ:I

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    invoke-static {}, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-static {v0}, Ll/ۢ᩵֫;->᩻(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 107
    :cond_0
    invoke-static {p1}, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->ۧ(Ll/۠ᩴ֫;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x2

    .line 163
    invoke-static {v0, v2, v1}, Ll/ۘ֨֫;->ܽ(III)Ll/۠ᩴ֫;

    move-result-object v3

    .line 162
    invoke-virtual {p0, v3}, Ll/ܰ۫֫;->ᩳ(Ll/۠ᩴ֫;)Z

    move-result v3

    const/4 v4, 0x4

    if-nez v3, :cond_1

    .line 163
    invoke-static {v4, v2, v1}, Ll/ۘ֨֫;->ܽ(III)Ll/۠ᩴ֫;

    move-result-object v1

    .line 162
    invoke-virtual {p0, v1}, Ll/ܰ۫֫;->ᩳ(Ll/۠ᩴ֫;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 111
    :cond_1
    iget p1, p1, Ll/۠ᩴ֫;->᩷:I

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v4

    :cond_3
    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_4
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩵()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method
