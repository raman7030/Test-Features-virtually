.class public final Ll/ܽۨ֫;
.super Ljava/lang/Object;
.source "J8KC"


# direct methods
.method public static ֫(Landroid/media/MediaDrm;[BLl/ܰ۬֫;)V
    .locals 1

    .line 615
    invoke-virtual {p2}, Ll/ܰ۬֫;->֫()Landroid/media/metrics/LogSessionId;

    move-result-object p2

    .line 616
    invoke-static {}, Ll/ۛۙܽ;->֫()Landroid/media/metrics/LogSessionId;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/media/metrics/LogSessionId;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 618
    invoke-virtual {p0, p1}, Landroid/media/MediaDrm;->getPlaybackComponent([B)Landroid/media/MediaDrm$PlaybackComponent;

    move-result-object p0

    .line 155
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 619
    invoke-virtual {p0, p2}, Landroid/media/MediaDrm$PlaybackComponent;->setLogSessionId(Landroid/media/metrics/LogSessionId;)V

    :cond_0
    return-void
.end method

.method public static ֫(Landroid/media/MediaDrm;Ljava/lang/String;I)Z
    .locals 0

    .line 610
    invoke-virtual {p0, p1, p2}, Landroid/media/MediaDrm;->requiresSecureDecoder(Ljava/lang/String;I)Z

    move-result p0

    return p0
.end method
