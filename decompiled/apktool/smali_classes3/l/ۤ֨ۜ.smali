.class public final Ll/ۤ֨ۜ;
.super Ljava/lang/Object;
.source "K74T"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final ۗ:Ljava/io/Closeable;

.field public final ۙ:Ll/ۨ֨ۜ;

.field public ᩶:Z

.field public ᩸:Ljava/lang/Throwable;

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ll/ۨ֨ۜ;Ljava/io/Closeable;)V
    .locals 0

    .line 686
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 687
    iput-object p1, p0, Ll/ۤ֨ۜ;->ۙ:Ll/ۨ֨ۜ;

    .line 688
    iput-object p2, p0, Ll/ۤ֨ۜ;->ۗ:Ljava/io/Closeable;

    return-void
.end method

.method private ֫()V
    .locals 3

    .line 734
    iget-object v0, p0, Ll/ۤ֨ۜ;->᩸:Ljava/lang/Throwable;

    .line 735
    instance-of v1, v0, Ljava/io/IOException;

    if-nez v1, :cond_3

    .line 738
    instance-of v1, v0, Ljava/lang/RuntimeException;

    if-nez v1, :cond_2

    .line 741
    instance-of v1, v0, Ljava/lang/Error;

    if-nez v1, :cond_1

    if-nez v0, :cond_0

    return-void

    .line 745
    :cond_0
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Failed to close HLS thumbnail resource"

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 741
    :cond_1
    check-cast v0, Ljava/lang/Error;

    .line 742
    throw v0

    .line 738
    :cond_2
    check-cast v0, Ljava/lang/RuntimeException;

    .line 739
    throw v0

    .line 735
    :cond_3
    check-cast v0, Ljava/io/IOException;

    .line 736
    throw v0
.end method


# virtual methods
.method public final close()V
    .locals 3

    move-object v0, p0

    .line 694
    monitor-enter v0

    .line 695
    :try_start_0
    iget-boolean v1, p0, Ll/ۤ֨ۜ;->᩹:Z

    if-eqz v1, :cond_0

    .line 696
    invoke-direct {p0}, Ll/ۤ֨ۜ;->֫()V

    .line 697
    monitor-exit v0

    return-void

    .line 699
    :cond_0
    iget-boolean v1, p0, Ll/ۤ֨ۜ;->᩶:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    .line 701
    :goto_0
    iget-boolean v2, p0, Ll/ۤ֨ۜ;->᩹:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    if-nez v2, :cond_1

    .line 703
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    goto :goto_0

    :catch_0
    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    if-eqz v1, :cond_2

    .line 709
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 711
    :cond_2
    invoke-direct {p0}, Ll/ۤ֨ۜ;->֫()V

    .line 712
    monitor-exit v0

    return-void

    .line 714
    :cond_3
    iput-boolean v2, p0, Ll/ۤ֨ۜ;->᩶:Z

    .line 715
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 718
    :try_start_3
    iget-object v0, p0, Ll/ۤ֨ۜ;->ۗ:Ljava/io/Closeable;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-object v0, p0

    .line 722
    monitor-enter v0

    const/4 v1, 0x0

    .line 723
    :try_start_4
    iput-object v1, p0, Ll/ۤ֨ۜ;->᩸:Ljava/lang/Throwable;

    .line 724
    iput-boolean v2, p0, Ll/ۤ֨ۜ;->᩹:Z

    .line 725
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 726
    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v1

    :catchall_1
    move-exception v0

    move-object v1, v0

    move-object v0, p0

    .line 722
    monitor-enter v0

    .line 723
    :try_start_5
    iput-object v1, p0, Ll/ۤ֨ۜ;->᩸:Ljava/lang/Throwable;

    .line 724
    iput-boolean v2, p0, Ll/ۤ֨ۜ;->᩹:Z

    .line 725
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 726
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 727
    :goto_1
    iget-object v0, p0, Ll/ۤ֨ۜ;->ۙ:Ll/ۨ֨ۜ;

    invoke-static {v0, p0}, Ll/ۨ֨ۜ;->֫(Ll/ۨ֨ۜ;Ll/ۤ֨ۜ;)V

    .line 729
    invoke-direct {p0}, Ll/ۤ֨ۜ;->֫()V

    return-void

    :catchall_2
    move-exception v1

    .line 726
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    throw v1

    :catchall_3
    move-exception v1

    .line 715
    :try_start_7
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    throw v1
.end method
