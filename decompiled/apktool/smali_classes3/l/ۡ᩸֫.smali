.class public final Ll/ۡ᩸֫;
.super Ljava/lang/Thread;
.source "M74O"


# instance fields
.field public final synthetic ᩸:Ll/ܺ᩸֫;

.field public final synthetic ᩹:Landroid/os/ConditionVariable;


# direct methods
.method public constructor <init>(Ll/ܺ᩸֫;Landroid/os/ConditionVariable;)V
    .locals 0

    .line 230
    iput-object p1, p0, Ll/ۡ᩸֫;->᩸:Ll/ܺ᩸֫;

    iput-object p2, p0, Ll/ۡ᩸֫;->᩹:Landroid/os/ConditionVariable;

    const-string p1, "ExoPlayer:SimpleCacheInit"

    invoke-direct {p0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 233
    iget-object v0, p0, Ll/ۡ᩸֫;->᩸:Ll/ܺ᩸֫;

    monitor-enter v0

    .line 234
    :try_start_0
    iget-object v1, p0, Ll/ۡ᩸֫;->᩹:Landroid/os/ConditionVariable;

    invoke-virtual {v1}, Landroid/os/ConditionVariable;->open()V

    .line 235
    iget-object v1, p0, Ll/ۡ᩸֫;->᩸:Ll/ܺ᩸֫;

    invoke-static {v1}, Ll/ܺ᩸֫;->ۧ(Ll/ܺ᩸֫;)V

    .line 236
    iget-object v1, p0, Ll/ۡ᩸֫;->᩸:Ll/ܺ᩸֫;

    invoke-static {v1}, Ll/ܺ᩸֫;->֫(Ll/ܺ᩸֫;)Ll/۫ܶ֫;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
