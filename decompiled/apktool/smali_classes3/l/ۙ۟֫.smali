.class public final Ll/ۙ۟֫;
.super Ljava/lang/Object;
.source "R8QD"

# interfaces
.implements Ll/ܰܰ֫;


# direct methods
.method public static ۧ(Ll/᩺ܰ֫;)Landroid/media/MediaCodec;
    .locals 2

    .line 77
    iget-object p0, p0, Ll/᩺ܰ֫;->֫:Ll/ܿ۟֫;

    .line 78
    iget-object p0, p0, Ll/ܿ۟֫;->ۡ:Ljava/lang/String;

    .line 79
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "createCodec:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 38
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 80
    invoke-static {p0}, Landroid/media/MediaCodec;->createByCodecName(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object p0

    .line 49
    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/᩺ܰ֫;)Ll/ۧ۟֫;
    .locals 5

    const/4 v0, 0x0

    .line 52
    :try_start_0
    invoke-static {p1}, Ll/ۙ۟֫;->ۧ(Ll/᩺ܰ֫;)Landroid/media/MediaCodec;

    move-result-object v0

    const-string v1, "configureCodec"

    .line 38
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 55
    iget-object v1, p1, Ll/᩺ܰ֫;->ܳ:Landroid/view/Surface;

    if-nez v1, :cond_0

    iget-object v2, p1, Ll/᩺ܰ֫;->֫:Ll/ܿ۟֫;

    iget-boolean v2, v2, Ll/ܿ۟֫;->ᩳ:Z

    if-eqz v2, :cond_0

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x23

    if-lt v2, v3, :cond_0

    const/16 v2, 0x8

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 60
    :goto_0
    iget-object v3, p1, Ll/᩺ܰ֫;->ܿ:Landroid/media/MediaFormat;

    iget-object v4, p1, Ll/᩺ܰ֫;->ۧ:Landroid/media/MediaCrypto;

    invoke-virtual {v0, v3, v1, v4, v2}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 49
    invoke-static {}, Landroid/os/Trace;->endSection()V

    const-string v1, "startCodec"

    .line 38
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 64
    invoke-virtual {v0}, Landroid/media/MediaCodec;->start()V

    .line 49
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 66
    new-instance v1, Ll/ۗ۟֫;

    iget-object p1, p1, Ll/᩺ܰ֫;->ᩳ:Ll/ۨܰ֫;

    invoke-direct {v1, v0, p1}, Ll/ۗ۟֫;-><init>(Landroid/media/MediaCodec;Ll/ۨܰ֫;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    :goto_1
    if-eqz v0, :cond_1

    .line 69
    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    .line 71
    :cond_1
    throw p1
.end method
