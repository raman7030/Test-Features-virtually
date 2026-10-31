.class public final Ll/ܳ۫֫;
.super Landroid/media/AudioDeviceCallback;
.source "O8SZ"


# instance fields
.field public final synthetic ֫:Ll/᩷۫֫;


# direct methods
.method public constructor <init>(Ll/᩷۫֫;)V
    .locals 0

    .line 254
    iput-object p1, p0, Ll/ܳ۫֫;->֫:Ll/᩷۫֫;

    invoke-direct {p0}, Landroid/media/AudioDeviceCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAudioDevicesAdded([Landroid/media/AudioDeviceInfo;)V
    .locals 3

    .line 257
    iget-object p1, p0, Ll/ܳ۫֫;->֫:Ll/᩷۫֫;

    invoke-static {p1}, Ll/᩷۫֫;->ۧ(Ll/᩷۫֫;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Ll/ܳ۫֫;->֫:Ll/᩷۫֫;

    invoke-static {v1}, Ll/᩷۫֫;->֫(Ll/᩷۫֫;)Ll/ᩳᩴ֫;

    move-result-object v1

    iget-object v2, p0, Ll/ܳ۫֫;->֫:Ll/᩷۫֫;

    invoke-static {v2}, Ll/᩷۫֫;->ܽ(Ll/᩷۫֫;)Ll/ۢ۫֫;

    move-result-object v2

    .line 258
    invoke-static {v0, v1, v2}, Ll/ᩳ۫֫;->֫(Landroid/content/Context;Ll/ᩳᩴ֫;Ll/ۢ۫֫;)Ll/ᩳ۫֫;

    move-result-object v0

    .line 257
    invoke-static {p1, v0}, Ll/᩷۫֫;->֫(Ll/᩷۫֫;Ll/ᩳ۫֫;)V

    return-void
.end method

.method public final onAudioDevicesRemoved([Landroid/media/AudioDeviceInfo;)V
    .locals 3

    .line 263
    iget-object v0, p0, Ll/ܳ۫֫;->֫:Ll/᩷۫֫;

    invoke-static {v0}, Ll/᩷۫֫;->ܽ(Ll/᩷۫֫;)Ll/ۢ۫֫;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ۘ֨֫;->֫(Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 264
    iget-object p1, p0, Ll/ܳ۫֫;->֫:Ll/᩷۫֫;

    invoke-static {p1}, Ll/᩷۫֫;->ᩳ(Ll/᩷۫֫;)V

    .line 266
    :cond_0
    iget-object p1, p0, Ll/ܳ۫֫;->֫:Ll/᩷۫֫;

    invoke-static {p1}, Ll/᩷۫֫;->ۧ(Ll/᩷۫֫;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Ll/ܳ۫֫;->֫:Ll/᩷۫֫;

    invoke-static {v1}, Ll/᩷۫֫;->֫(Ll/᩷۫֫;)Ll/ᩳᩴ֫;

    move-result-object v1

    iget-object v2, p0, Ll/ܳ۫֫;->֫:Ll/᩷۫֫;

    invoke-static {v2}, Ll/᩷۫֫;->ܽ(Ll/᩷۫֫;)Ll/ۢ۫֫;

    move-result-object v2

    .line 267
    invoke-static {v0, v1, v2}, Ll/ᩳ۫֫;->֫(Landroid/content/Context;Ll/ᩳᩴ֫;Ll/ۢ۫֫;)Ll/ᩳ۫֫;

    move-result-object v0

    .line 266
    invoke-static {p1, v0}, Ll/᩷۫֫;->֫(Ll/᩷۫֫;Ll/ᩳ۫֫;)V

    return-void
.end method
