.class public final Ll/ۙᩴ;
.super Ll/֫᩺᩵;
.source "C58G"


# static fields
.field public static volatile ܽ:Ll/ۙᩴ;


# instance fields
.field public ۧ:Ll/۫ᩴ;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    .line 31
    invoke-direct {p0, v0}, Ll/֫᩺᩵;-><init>(I)V

    .line 50
    new-instance v0, Ll/۫ᩴ;

    invoke-direct {v0}, Ll/۫ᩴ;-><init>()V

    .line 51
    iput-object v0, p0, Ll/ۙᩴ;->ۧ:Ll/۫ᩴ;

    return-void
.end method

.method public static ۧ()Ll/ۙᩴ;
    .locals 2

    .line 61
    sget-object v0, Ll/ۙᩴ;->ܽ:Ll/ۙᩴ;

    if-eqz v0, :cond_0

    .line 62
    sget-object v0, Ll/ۙᩴ;->ܽ:Ll/ۙᩴ;

    return-object v0

    .line 64
    :cond_0
    const-class v0, Ll/ۙᩴ;

    monitor-enter v0

    .line 65
    :try_start_0
    sget-object v1, Ll/ۙᩴ;->ܽ:Ll/ۙᩴ;

    if-nez v1, :cond_1

    .line 66
    new-instance v1, Ll/ۙᩴ;

    invoke-direct {v1}, Ll/ۙᩴ;-><init>()V

    sput-object v1, Ll/ۙᩴ;->ܽ:Ll/ۙᩴ;

    .line 68
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    sget-object v0, Ll/ۙᩴ;->ܽ:Ll/ۙᩴ;

    return-object v0

    :catchall_0
    move-exception v1

    .line 68
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public final ֫(Ljava/lang/Runnable;)V
    .locals 1

    .line 93
    iget-object v0, p0, Ll/ۙᩴ;->ۧ:Ll/۫ᩴ;

    invoke-virtual {v0, p1}, Ll/۫ᩴ;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ֫()Z
    .locals 2

    .line 108
    iget-object v0, p0, Ll/ۙᩴ;->ۧ:Ll/۫ᩴ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
