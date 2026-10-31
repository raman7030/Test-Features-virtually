.class public final Ll/᩺ۤ֫;
.super Landroid/os/Handler;
.source "58TM"


# instance fields
.field public ֫:Z

.field public final synthetic ۧ:Ll/ۧۛ֫;


# direct methods
.method public constructor <init>(Ll/ۧۛ֫;Landroid/os/Looper;)V
    .locals 0

    .line 643
    iput-object p1, p0, Ll/᩺ۤ֫;->ۧ:Ll/ۧۛ֫;

    .line 644
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method

.method private ֫(Landroid/os/Message;Ll/ۜۨ֫;)Z
    .locals 6

    .line 693
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ll/ܰۤ֫;

    .line 694
    iget-boolean v1, v0, Ll/ܰۤ֫;->֫:Z

    const/4 v2, 0x0

    if-nez v1, :cond_0

    goto :goto_1

    .line 697
    :cond_0
    iget v1, v0, Ll/ܰۤ֫;->ۧ:I

    const/4 v3, 0x1

    add-int/2addr v1, v3

    iput v1, v0, Ll/ܰۤ֫;->ۧ:I

    .line 698
    iget-object v4, p0, Ll/᩺ۤ֫;->ۧ:Ll/ۧۛ֫;

    invoke-static {v4}, Ll/ۧۛ֫;->ۧ(Ll/ۧۛ֫;)Ll/ۧܳۧ;

    move-result-object v4

    const/4 v5, 0x3

    .line 699
    invoke-interface {v4, v5}, Ll/ۧܳۧ;->֫(I)I

    move-result v4

    if-le v1, v4, :cond_1

    goto :goto_1

    .line 702
    :cond_1
    new-instance v1, Ll/ۧۧۧ;

    .line 708
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 709
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 713
    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Ljava/io/IOException;

    if-eqz v1, :cond_2

    .line 714
    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    check-cast p2, Ljava/io/IOException;

    goto :goto_0

    .line 715
    :cond_2
    new-instance v1, Ll/֫ۛ֫;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    .line 65
    invoke-direct {v1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    move-object p2, v1

    .line 716
    :goto_0
    iget-object v1, p0, Ll/᩺ۤ֫;->ۧ:Ll/ۧۛ֫;

    invoke-static {v1}, Ll/ۧۛ֫;->ۧ(Ll/ۧۛ֫;)Ll/ۧܳۧ;

    move-result-object v1

    new-instance v4, Ll/֫ܳۧ;

    iget v0, v0, Ll/ܰۤ֫;->ۧ:I

    invoke-direct {v4, p2, v0}, Ll/֫ܳۧ;-><init>(Ljava/io/IOException;I)V

    .line 717
    invoke-interface {v1, v4}, Ll/ۧܳۧ;->֫(Ll/֫ܳۧ;)J

    move-result-wide v4

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p2, v4, v0

    if-nez p2, :cond_3

    :goto_1
    return v2

    :cond_3
    move-object v0, p0

    .line 724
    monitor-enter v0

    .line 725
    :try_start_0
    iget-boolean p2, p0, Ll/᩺ۤ֫;->֫:Z

    if-nez p2, :cond_4

    .line 726
    invoke-static {p1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p0, p1, v4, v5}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 727
    monitor-exit v0

    return v3

    .line 729
    :cond_4
    monitor-exit v0

    return v2

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 659
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll/ܰۤ֫;

    .line 662
    :try_start_0
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v2, 0x1

    if-eq v0, v2, :cond_1

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    .line 668
    iget-object v0, p0, Ll/᩺ۤ֫;->ۧ:Ll/ۧۛ֫;

    invoke-static {v0}, Ll/ۧۛ֫;->֫(Ll/ۧۛ֫;)Ll/᩻ۨ֫;

    move-result-object v0

    iget-object v2, p0, Ll/᩺ۤ֫;->ۧ:Ll/ۧۛ֫;

    invoke-static {v2}, Ll/ۧۛ֫;->ᩳ(Ll/ۧۛ֫;)Ljava/util/UUID;

    move-result-object v2

    iget-object v3, v1, Ll/ܰۤ֫;->ܽ:Ljava/lang/Object;

    check-cast v3, Ll/ۛۛ֫;

    check-cast v0, Ll/ܿۨ֫;

    invoke-virtual {v0, v2, v3}, Ll/ܿۨ֫;->֫(Ljava/util/UUID;Ll/ۛۛ֫;)[B

    move-result-object v0

    goto :goto_0

    .line 671
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 664
    :cond_1
    iget-object v0, p0, Ll/᩺ۤ֫;->ۧ:Ll/ۧۛ֫;

    invoke-static {v0}, Ll/ۧۛ֫;->֫(Ll/ۧۛ֫;)Ll/᩻ۨ֫;

    move-result-object v0

    iget-object v2, v1, Ll/ܰۤ֫;->ܽ:Ljava/lang/Object;

    check-cast v2, Ll/ܰۛ֫;

    .line 665
    check-cast v0, Ll/ܿۨ֫;

    invoke-virtual {v0, v2}, Ll/ܿۨ֫;->֫(Ll/ܰۛ֫;)[B

    move-result-object v0
    :try_end_0
    .catch Ll/ۜۨ֫; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v2, "Key/provisioning request produced an unexpected exception. Not retrying."

    .line 679
    invoke-static {v2, v0}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    move-exception v0

    .line 674
    invoke-direct {p0, p1, v0}, Ll/᩺ۤ֫;->֫(Landroid/os/Message;Ll/ۜۨ֫;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    move-object v2, v0

    .line 682
    iget-object v0, p0, Ll/᩺ۤ֫;->ۧ:Ll/ۧۛ֫;

    invoke-static {v0}, Ll/ۧۛ֫;->ۧ(Ll/ۧۛ֫;)Ll/ۧܳۧ;

    move-result-object v0

    iget-wide v3, v1, Ll/ܰۤ֫;->ᩳ:J

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v0, p0

    .line 683
    monitor-enter v0

    .line 684
    :try_start_1
    iget-boolean v3, p0, Ll/᩺ۤ֫;->֫:Z

    if-nez v3, :cond_3

    .line 685
    iget-object v3, p0, Ll/᩺ۤ֫;->ۧ:Ll/ۧۛ֫;

    invoke-static {v3}, Ll/ۧۛ֫;->ܽ(Ll/ۧۛ֫;)Ll/۟ۤ֫;

    move-result-object v3

    iget p1, p1, Landroid/os/Message;->what:I

    iget-object v1, v1, Ll/ܰۤ֫;->ܽ:Ljava/lang/Object;

    .line 686
    invoke-static {v1, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v1

    invoke-virtual {v3, p1, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    .line 687
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 689
    :cond_3
    monitor-exit v0

    :goto_1
    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, 0x0

    .line 734
    :try_start_0
    invoke-virtual {p0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    const/4 v1, 0x1

    .line 735
    iput-boolean v1, p0, Ll/᩺ۤ֫;->֫:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 736
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
