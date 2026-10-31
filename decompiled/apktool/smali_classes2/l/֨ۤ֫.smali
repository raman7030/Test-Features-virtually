.class public final Ll/֨ۤ֫;
.super Ljava/lang/Object;
.source "68UW"


# instance fields
.field public final ֫:Landroid/media/AudioTrack$StreamEventCallback;

.field public final ۧ:Landroid/os/Handler;

.field public final synthetic ܽ:Ll/۠ۤ֫;


# direct methods
.method public constructor <init>(Ll/۠ۤ֫;)V
    .locals 1

    .line 2137
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ۤ֫;->ܽ:Ll/۠ۤ֫;

    .line 2138
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Ll/֨ۤ֫;->ۧ:Landroid/os/Handler;

    .line 2142
    new-instance p1, Ll/ۚۤ֫;

    invoke-direct {p1, p0}, Ll/ۚۤ֫;-><init>(Ll/֨ۤ֫;)V

    iput-object p1, p0, Ll/֨ۤ֫;->֫:Landroid/media/AudioTrack$StreamEventCallback;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/media/AudioTrack;)V
    .locals 2

    .line 2184
    iget-object v0, p0, Ll/֨ۤ֫;->ۧ:Landroid/os/Handler;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ll/֡ۤ֫;

    invoke-direct {v1, v0}, Ll/֡ۤ֫;-><init>(Landroid/os/Handler;)V

    iget-object v0, p0, Ll/֨ۤ֫;->֫:Landroid/media/AudioTrack$StreamEventCallback;

    invoke-virtual {p1, v1, v0}, Landroid/media/AudioTrack;->registerStreamEventCallback(Ljava/util/concurrent/Executor;Landroid/media/AudioTrack$StreamEventCallback;)V

    return-void
.end method

.method public final ۧ(Landroid/media/AudioTrack;)V
    .locals 1

    .line 2188
    iget-object v0, p0, Ll/֨ۤ֫;->֫:Landroid/media/AudioTrack$StreamEventCallback;

    invoke-virtual {p1, v0}, Landroid/media/AudioTrack;->unregisterStreamEventCallback(Landroid/media/AudioTrack$StreamEventCallback;)V

    .line 2189
    iget-object p1, p0, Ll/֨ۤ֫;->ۧ:Landroid/os/Handler;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method
