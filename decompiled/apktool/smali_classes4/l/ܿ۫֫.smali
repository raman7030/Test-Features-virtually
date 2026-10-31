.class public final Ll/ܿ۫֫;
.super Ljava/lang/Object;
.source "O8SZ"


# direct methods
.method public static ֫(Landroid/content/Context;Landroid/media/AudioDeviceCallback;)V
    .locals 0

    .line 281
    invoke-static {p0}, Ll/ۖ֡֫;->֫(Landroid/content/Context;)Landroid/media/AudioManager;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/media/AudioManager;->unregisterAudioDeviceCallback(Landroid/media/AudioDeviceCallback;)V

    return-void
.end method

.method public static ֫(Landroid/content/Context;Landroid/media/AudioDeviceCallback;Landroid/os/Handler;)V
    .locals 0

    .line 276
    invoke-static {p0}, Ll/ۖ֡֫;->֫(Landroid/content/Context;)Landroid/media/AudioManager;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, Landroid/media/AudioManager;->registerAudioDeviceCallback(Landroid/media/AudioDeviceCallback;Landroid/os/Handler;)V

    return-void
.end method
