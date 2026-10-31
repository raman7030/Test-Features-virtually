.class public final Ll/۠۟֫;
.super Ljava/lang/Object;
.source "M8RW"

# interfaces
.implements Ll/֨۟֫;


# virtual methods
.method public final ֫()I
    .locals 1

    .line 867
    invoke-static {}, Landroid/media/MediaCodecList;->getCodecCount()I

    move-result v0

    return v0
.end method

.method public final ֫(I)Landroid/media/MediaCodecInfo;
    .locals 0

    .line 872
    invoke-static {p1}, Landroid/media/MediaCodecList;->getCodecInfoAt(I)Landroid/media/MediaCodecInfo;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z
    .locals 0

    const-string p3, "secure-playback"

    .line 885
    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "video/avc"

    .line 886
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
