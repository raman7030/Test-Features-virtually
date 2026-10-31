.class public final Ll/ۘۤ֫;
.super Ljava/lang/Object;
.source "68UW"


# instance fields
.field public final ֫:Landroid/media/AudioTrack;

.field public final ۧ:Ll/᩷۫֫;

.field public ܽ:Ll/ۖۤ֫;


# direct methods
.method public constructor <init>(Landroid/media/AudioTrack;Ll/᩷۫֫;)V
    .locals 1

    .line 2107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2108
    iput-object p1, p0, Ll/ۘۤ֫;->֫:Landroid/media/AudioTrack;

    .line 2109
    iput-object p2, p0, Ll/ۘۤ֫;->ۧ:Ll/᩷۫֫;

    .line 2110
    new-instance p2, Ll/ۖۤ֫;

    invoke-direct {p2, p0}, Ll/ۖۤ֫;-><init>(Ll/ۘۤ֫;)V

    iput-object p2, p0, Ll/ۘۤ֫;->ܽ:Ll/ۖۤ֫;

    .line 2111
    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 2112
    iget-object v0, p0, Ll/ۘۤ֫;->ܽ:Ll/ۖۤ֫;

    invoke-virtual {p1, v0, p2}, Landroid/media/AudioTrack;->addOnRoutingChangedListener(Landroid/media/AudioRouting$OnRoutingChangedListener;Landroid/os/Handler;)V

    return-void
.end method

.method public static ֫(Ll/ۘۤ֫;Landroid/media/AudioRouting;)V
    .locals 1

    .line 2121
    iget-object v0, p0, Ll/ۘۤ֫;->ܽ:Ll/ۖۤ֫;

    if-nez v0, :cond_0

    goto :goto_0

    .line 2125
    :cond_0
    invoke-interface {p1}, Landroid/media/AudioRouting;->getRoutedDevice()Landroid/media/AudioDeviceInfo;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 2127
    iget-object p0, p0, Ll/ۘۤ֫;->ۧ:Ll/᩷۫֫;

    invoke-virtual {p0, p1}, Ll/᩷۫֫;->֫(Landroid/media/AudioDeviceInfo;)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 2116
    iget-object v0, p0, Ll/ۘۤ֫;->ܽ:Ll/ۖۤ֫;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2116
    iget-object v1, p0, Ll/ۘۤ֫;->֫:Landroid/media/AudioTrack;

    invoke-virtual {v1, v0}, Landroid/media/AudioTrack;->removeOnRoutingChangedListener(Landroid/media/AudioRouting$OnRoutingChangedListener;)V

    const/4 v0, 0x0

    .line 2117
    iput-object v0, p0, Ll/ۘۤ֫;->ܽ:Ll/ۖۤ֫;

    return-void
.end method
