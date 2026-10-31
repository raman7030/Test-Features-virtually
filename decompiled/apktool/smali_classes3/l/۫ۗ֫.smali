.class public final Ll/۫ۗ֫;
.super Ljava/lang/Object;
.source "C8TC"


# instance fields
.field public ֫:Landroid/os/HandlerThread;

.field public final ۧ:Ljava/lang/Object;

.field public ܽ:Landroid/os/Looper;

.field public ᩳ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/۫ۗ֫;->ۧ:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 68
    iput-object v0, p0, Ll/۫ۗ֫;->ܽ:Landroid/os/Looper;

    .line 69
    iput-object v0, p0, Ll/۫ۗ֫;->֫:Landroid/os/HandlerThread;

    const/4 v0, 0x0

    .line 70
    iput v0, p0, Ll/۫ۗ֫;->ᩳ:I

    return-void
.end method


# virtual methods
.method public final ֫()Landroid/os/Looper;
    .locals 4

    .line 81
    iget-object v0, p0, Ll/۫ۗ֫;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 82
    :try_start_0
    iget-object v1, p0, Ll/۫ۗ֫;->ܽ:Landroid/os/Looper;

    if-nez v1, :cond_1

    .line 83
    iget v1, p0, Ll/۫ۗ֫;->ᩳ:I

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/۫ۗ֫;->֫:Landroid/os/HandlerThread;

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 86
    new-instance v1, Landroid/os/HandlerThread;

    const-string v2, "ExoPlayer:Playback"

    const/16 v3, -0x10

    invoke-direct {v1, v2, v3}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    iput-object v1, p0, Ll/۫ۗ֫;->֫:Landroid/os/HandlerThread;

    .line 88
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 89
    iget-object v1, p0, Ll/۫ۗ֫;->֫:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    iput-object v1, p0, Ll/۫ۗ֫;->ܽ:Landroid/os/Looper;

    .line 91
    :cond_1
    iget v1, p0, Ll/۫ۗ֫;->ᩳ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/۫ۗ֫;->ᩳ:I

    .line 92
    iget-object v1, p0, Ll/۫ۗ֫;->ܽ:Landroid/os/Looper;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 93
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ۧ()V
    .locals 2

    .line 103
    iget-object v0, p0, Ll/۫ۗ֫;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 104
    :try_start_0
    iget v1, p0, Ll/۫ۗ֫;->ᩳ:I

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 105
    iget v1, p0, Ll/۫ۗ֫;->ᩳ:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Ll/۫ۗ֫;->ᩳ:I

    if-nez v1, :cond_1

    .line 106
    iget-object v1, p0, Ll/۫ۗ֫;->֫:Landroid/os/HandlerThread;

    if-eqz v1, :cond_1

    .line 107
    invoke-virtual {v1}, Landroid/os/HandlerThread;->quit()Z

    const/4 v1, 0x0

    .line 108
    iput-object v1, p0, Ll/۫ۗ֫;->֫:Landroid/os/HandlerThread;

    .line 109
    iput-object v1, p0, Ll/۫ۗ֫;->ܽ:Landroid/os/Looper;

    .line 111
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
