.class public final Ll/֫ۤ֫;
.super Ljava/lang/Object;
.source "Q8S0"


# direct methods
.method public static ֫(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;Z)Ll/ܺ۫֫;
    .locals 2

    .line 161
    invoke-static {p0, p1}, Landroid/media/AudioManager;->getPlaybackOffloadSupport(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)I

    move-result p0

    if-nez p0, :cond_0

    .line 163
    sget-object p0, Ll/ܺ۫֫;->ᩳ:Ll/ܺ۫֫;

    return-object p0

    .line 165
    :cond_0
    new-instance p1, Ll/ۡ۫֫;

    .line 41
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 168
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x20

    if-le v0, v1, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    .line 171
    :goto_0
    invoke-virtual {p1}, Ll/ۡ۫֫;->ۧ()V

    .line 172
    invoke-virtual {p1, p0}, Ll/ۡ۫֫;->֫(Z)V

    .line 173
    invoke-virtual {p1, p2}, Ll/ۡ۫֫;->ۧ(Z)V

    .line 174
    invoke-virtual {p1}, Ll/ۡ۫֫;->֫()Ll/ܺ۫֫;

    move-result-object p0

    return-object p0
.end method
