.class public final Ll/ᩳۤ֫;
.super Ljava/lang/Object;
.source "68UW"


# direct methods
.method public static ֫(Landroid/media/AudioTrack;Ll/ۢۤ֫;)J
    .locals 7

    .line 2487
    iget v0, p1, Ll/ۢۤ֫;->᩷:I

    if-nez v0, :cond_0

    .line 2488
    invoke-virtual {p0}, Landroid/media/AudioTrack;->getBufferSizeInFrames()I

    move-result p0

    int-to-long v0, p0

    .line 2374
    iget p0, p1, Ll/ۢۤ֫;->ۡ:I

    invoke-static {p0, v0, v1}, Ll/ۘ֨֫;->֫(IJ)J

    move-result-wide p0

    return-wide p0

    .line 2490
    :cond_0
    invoke-virtual {p0}, Landroid/media/AudioTrack;->getBufferSizeInFrames()I

    move-result p0

    int-to-long v0, p0

    iget p0, p1, Ll/ۢۤ֫;->ۜ:I

    .line 2466
    invoke-static {p0}, Ll/᩹᩷ۧ;->֫(I)I

    move-result p0

    const p1, -0x7fffffff

    if-eq p0, p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 2467
    :goto_0
    invoke-static {p1}, Ll/᩺֡֫;->ۧ(Z)V

    int-to-long v4, p0

    .line 2492
    sget-object v6, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v2, 0xf4240

    .line 2489
    invoke-static/range {v0 .. v6}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static ֫(Landroid/media/AudioTrack;Ll/ۢ۫֫;)V
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 2482
    :cond_0
    iget-object p1, p1, Ll/ۢ۫֫;->֫:Landroid/media/AudioDeviceInfo;

    .line 2481
    :goto_0
    invoke-virtual {p0, p1}, Landroid/media/AudioTrack;->setPreferredDevice(Landroid/media/AudioDeviceInfo;)Z

    return-void
.end method
