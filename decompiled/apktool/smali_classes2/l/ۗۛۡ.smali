.class public final Ll/ۗۛۡ;
.super Ljava/lang/Object;
.source "N7I4"


# instance fields
.field public final ֫:Ljava/util/HashSet;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ۗۛۡ;->֫:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)V
    .locals 3

    .line 20
    iget-object v0, p0, Ll/ۗۛۡ;->֫:Ljava/util/HashSet;

    monitor-enter v0

    .line 21
    :goto_0
    :try_start_0
    iget-object v1, p0, Ll/ۗۛۡ;->֫:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 23
    :try_start_1
    iget-object v1, p0, Ll/ۗۛۡ;->֫:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 25
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 26
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "\u7ebf\u7a0b\u88ab\u4e2d\u65ad"

    invoke-direct {v1, v2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 29
    :cond_0
    iget-object v1, p0, Ll/ۗۛۡ;->֫:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 30
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 2

    .line 39
    iget-object v0, p0, Ll/ۗۛۡ;->֫:Ljava/util/HashSet;

    monitor-enter v0

    .line 40
    :try_start_0
    iget-object v1, p0, Ll/ۗۛۡ;->֫:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 41
    iget-object p1, p0, Ll/ۗۛۡ;->֫:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 42
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
