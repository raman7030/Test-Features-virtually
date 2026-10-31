.class public final Ll/ܿۤ֫;
.super Ljava/lang/Object;
.source "68UW"


# direct methods
.method public static ֫(Landroid/media/AudioTrack;Ll/ܰ۬֫;)V
    .locals 1

    .line 2502
    invoke-virtual {p1}, Ll/ܰ۬֫;->֫()Landroid/media/metrics/LogSessionId;

    move-result-object p1

    .line 2503
    invoke-static {}, Ll/ۛۙܽ;->֫()Landroid/media/metrics/LogSessionId;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/media/metrics/LogSessionId;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2504
    invoke-virtual {p0, p1}, Landroid/media/AudioTrack;->setLogSessionId(Landroid/media/metrics/LogSessionId;)V

    :cond_0
    return-void
.end method
