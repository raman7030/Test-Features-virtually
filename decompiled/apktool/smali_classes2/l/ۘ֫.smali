.class public final Ll/ۘ֫;
.super Landroid/media/session/MediaController$Callback;
.source "N5R1"


# instance fields
.field public final ֫:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Ll/᩵֫;)V
    .locals 1

    .line 834
    invoke-direct {p0}, Landroid/media/session/MediaController$Callback;-><init>()V

    .line 835
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/ۘ֫;->֫:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final onAudioInfoChanged(Landroid/media/session/MediaController$PlaybackInfo;)V
    .locals 1

    .line 908
    iget-object v0, p0, Ll/ۘ֫;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩵֫;

    if-eqz v0, :cond_0

    .line 911
    invoke-virtual {p1}, Landroid/media/session/MediaController$PlaybackInfo;->getPlaybackType()I

    .line 912
    invoke-virtual {p1}, Landroid/media/session/MediaController$PlaybackInfo;->getAudioAttributes()Landroid/media/AudioAttributes;

    sget v0, Ll/ۘۖ֫;->ۧ:I

    .line 913
    invoke-virtual {p1}, Landroid/media/session/MediaController$PlaybackInfo;->getVolumeControl()I

    .line 914
    invoke-virtual {p1}, Landroid/media/session/MediaController$PlaybackInfo;->getMaxVolume()I

    .line 915
    invoke-virtual {p1}, Landroid/media/session/MediaController$PlaybackInfo;->getCurrentVolume()I

    :cond_0
    return-void
.end method

.method public final onExtrasChanged(Landroid/os/Bundle;)V
    .locals 0

    .line 899
    invoke-static {p1}, Ll/᩻ۧ;->֫(Landroid/os/Bundle;)V

    .line 900
    iget-object p1, p0, Ll/ۘ֫;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩵֫;

    return-void
.end method

.method public final onMetadataChanged(Landroid/media/MediaMetadata;)V
    .locals 1

    .line 875
    iget-object v0, p0, Ll/ۘ֫;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩵֫;

    if-eqz v0, :cond_0

    .line 877
    invoke-static {p1}, Ll/ۧ֫;->֫(Landroid/media/MediaMetadata;)V

    :cond_0
    return-void
.end method

.method public final onPlaybackStateChanged(Landroid/media/session/PlaybackState;)V
    .locals 0

    .line 862
    iget-object p1, p0, Ll/ۘ֫;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩵֫;

    return-void
.end method

.method public final onQueueChanged(Ljava/util/List;)V
    .locals 1

    .line 883
    iget-object v0, p0, Ll/ۘ֫;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩵֫;

    if-eqz v0, :cond_0

    .line 885
    invoke-static {p1}, Ll/ۧۧ;->֫(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public final onQueueTitleChanged(Ljava/lang/CharSequence;)V
    .locals 0

    .line 891
    iget-object p1, p0, Ll/ۘ֫;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩵֫;

    return-void
.end method

.method public final onSessionDestroyed()V
    .locals 1

    .line 840
    iget-object v0, p0, Ll/ۘ֫;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩵֫;

    return-void
.end method

.method public final onSessionEvent(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 848
    invoke-static {p2}, Ll/᩻ۧ;->֫(Landroid/os/Bundle;)V

    .line 849
    iget-object p1, p0, Ll/ۘ֫;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩵֫;

    return-void
.end method
