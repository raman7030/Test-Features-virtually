.class public final Ll/۟۫֫;
.super Ljava/lang/Object;
.source "Q8S0"


# direct methods
.method public static ֫(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;Z)Ll/ܺ۫֫;
    .locals 0

    .line 142
    invoke-static {p0, p1}, Landroid/media/AudioManager;->isOffloadedPlaybackSupported(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)Z

    move-result p0

    if-nez p0, :cond_0

    .line 143
    sget-object p0, Ll/ܺ۫֫;->ᩳ:Ll/ܺ۫֫;

    return-object p0

    .line 145
    :cond_0
    new-instance p0, Ll/ۡ۫֫;

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 146
    invoke-virtual {p0}, Ll/ۡ۫֫;->ۧ()V

    .line 147
    invoke-virtual {p0, p2}, Ll/ۡ۫֫;->ۧ(Z)V

    .line 148
    invoke-virtual {p0}, Ll/ۡ۫֫;->֫()Ll/ܺ۫֫;

    move-result-object p0

    return-object p0
.end method
