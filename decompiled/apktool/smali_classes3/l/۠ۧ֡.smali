.class public final Ll/۠ۧ֡;
.super Ll/ܶ۟᩵;
.source "I4F9"


# instance fields
.field public final synthetic ᩶:Ll/֫ܽ֡;

.field public final synthetic ᩹:Ll/᩸ۧ֡;


# direct methods
.method public varargs constructor <init>(Ll/᩸ۧ֡;[Ljava/lang/Object;Ll/֫ܽ֡;)V
    .locals 0

    .line 774
    iput-object p1, p0, Ll/۠ۧ֡;->᩹:Ll/᩸ۧ֡;

    iput-object p3, p0, Ll/۠ۧ֡;->᩶:Ll/֫ܽ֡;

    const-string p1, "OkHttp %s ACK Settings"

    invoke-direct {p0, p1, p2}, Ll/ܶ۟᩵;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 13

    .line 776
    iget-object v2, p0, Ll/۠ۧ֡;->᩹:Ll/᩸ۧ֡;

    iget-object v3, p0, Ll/۠ۧ֡;->᩶:Ll/֫ܽ֡;

    .line 787
    iget-object v0, v2, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    iget-object v0, v0, Ll/᩹ۧ֡;->ۢ֫:Ll/ۛۧ֡;

    monitor-enter v0

    .line 788
    :try_start_0
    iget-object v1, v2, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 789
    :try_start_1
    iget-object v4, v2, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    iget-object v4, v4, Ll/᩹ۧ֡;->ۧ֫:Ll/֫ܽ֡;

    invoke-virtual {v4}, Ll/֫ܽ֡;->ۧ()I

    move-result v4

    .line 791
    iget-object v5, v2, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    iget-object v5, v5, Ll/᩹ۧ֡;->ۧ֫:Ll/֫ܽ֡;

    invoke-virtual {v5, v3}, Ll/֫ܽ֡;->֫(Ll/֫ܽ֡;)V

    .line 792
    iget-object v3, v2, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    iget-object v3, v3, Ll/᩹ۧ֡;->ۧ֫:Ll/֫ܽ֡;

    invoke-virtual {v3}, Ll/֫ܽ֡;->ۧ()I

    move-result v3

    const/4 v5, -0x1

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    if-eq v3, v5, :cond_0

    if-eq v3, v4, :cond_0

    sub-int/2addr v3, v4

    int-to-long v3, v3

    .line 795
    iget-object v5, v2, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    iget-object v5, v5, Ll/᩹ۧ֡;->ۜ֫:Ljava/util/LinkedHashMap;

    invoke-interface {v5}, Ljava/util/Map;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_1

    .line 796
    iget-object v5, v2, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    iget-object v5, v5, Ll/᩹ۧ֡;->ۜ֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v5

    iget-object v8, v2, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    iget-object v8, v8, Ll/᩹ۧ֡;->ۜ֫:Ljava/util/LinkedHashMap;

    invoke-interface {v8}, Ljava/util/Map;->size()I

    move-result v8

    new-array v8, v8, [Ll/ۤۧ֡;

    invoke-interface {v5, v8}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v5

    move-object v8, v5

    check-cast v8, [Ll/ۤۧ֡;

    goto :goto_0

    :cond_0
    move-wide v3, v6

    .line 799
    :cond_1
    :goto_0
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 801
    :try_start_2
    iget-object v1, v2, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    iget-object v5, v1, Ll/᩹ۧ֡;->ۢ֫:Ll/ۛۧ֡;

    iget-object v1, v1, Ll/᩹ۧ֡;->ۧ֫:Ll/֫ܽ֡;

    invoke-virtual {v5, v1}, Ll/ۛۧ֡;->֫(Ll/֫ܽ֡;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    .line 803
    :catch_0
    :try_start_3
    iget-object v1, v2, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 526
    :try_start_4
    sget-object v5, Ll/ܰ֫֡;->ܰ:Ll/ܰ֫֡;

    invoke-virtual {v1, v5, v5}, Ll/᩹ۧ֡;->֫(Ll/ܰ֫֡;Ll/ܰ֫֡;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 805
    :catch_1
    :goto_1
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    const/4 v1, 0x0

    if-eqz v8, :cond_3

    .line 807
    array-length v5, v8

    const/4 v0, 0x0

    const/4 v9, 0x0

    :goto_2
    if-ge v9, v5, :cond_3

    aget-object v10, v8, v9

    move-object v0, v10

    .line 808
    monitor-enter v0

    .line 634
    :try_start_6
    iget-wide v11, v10, Ll/ۤۧ֡;->֫:J

    add-long/2addr v11, v3

    iput-wide v11, v10, Ll/ۤۧ֡;->֫:J

    cmp-long v11, v3, v6

    if-lez v11, :cond_2

    .line 635
    invoke-virtual {v10}, Ljava/lang/Object;->notifyAll()V

    .line 810
    :cond_2
    monitor-exit v0

    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw v1

    .line 813
    :cond_3
    invoke-static {}, Ll/᩹ۧ֡;->ܳ()Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    new-instance v3, Ll/ܶۧ֡;

    iget-object v4, v2, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    iget-object v4, v4, Ll/᩹ۧ֡;->ۤ:Ljava/lang/String;

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v4, v5, v1

    invoke-direct {v3, v2, v5}, Ll/ܶۧ֡;-><init>(Ll/᩸ۧ֡;[Ljava/lang/Object;)V

    invoke-virtual {v0, v3}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void

    :catchall_1
    move-exception v2

    .line 799
    :try_start_7
    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :try_start_8
    throw v2

    :catchall_2
    move-exception v1

    .line 805
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    throw v1
.end method
