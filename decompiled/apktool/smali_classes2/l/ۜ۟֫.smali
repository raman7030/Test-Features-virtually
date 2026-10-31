.class public final Ll/ۜ۟֫;
.super Ljava/lang/Object;
.source "W8Q2"


# direct methods
.method public static ֫(Ll/᩺ܰ֫;Ll/ܰ۬֫;)V
    .locals 1

    .line 2795
    invoke-virtual {p1}, Ll/ܰ۬֫;->֫()Landroid/media/metrics/LogSessionId;

    move-result-object p1

    .line 2796
    invoke-static {}, Ll/ۛۙܽ;->֫()Landroid/media/metrics/LogSessionId;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/media/metrics/LogSessionId;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2797
    iget-object p0, p0, Ll/᩺ܰ֫;->ܿ:Landroid/media/MediaFormat;

    const-string v0, "log-session-id"

    invoke-virtual {p1}, Landroid/media/metrics/LogSessionId;->getStringId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
