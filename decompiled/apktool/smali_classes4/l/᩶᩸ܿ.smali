.class public final Ll/᩶᩸ܿ;
.super Ljava/lang/Object;
.source "Y9BP"


# static fields
.field public static ֫:Ljava/util/ArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 16
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Ll/᩶᩸ܿ;->֫:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized ֫()V
    .locals 11

    .line 2
    const-class v0, Ll/᩶᩸ܿ;

    .line 3
    monitor-enter v0

    .line 101
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 103
    sget-object v3, Ll/᩶᩸ܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    const/4 v4, 0x0

    :goto_0
    if-ltz v3, :cond_3

    .line 104
    sget-object v5, Ll/᩶᩸ܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩵᩶ܿ;

    .line 653
    iget-object v6, v5, Ll/᩵᩶ܿ;->ۤ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v6

    if-nez v6, :cond_0

    .line 106
    invoke-virtual {v5}, Ll/᩵᩶ܿ;->֫()V

    .line 107
    sget-object v5, Ll/᩶᩸ܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    .line 110
    :cond_0
    invoke-virtual {v5}, Ll/᩵᩶ܿ;->ܳ()Z

    move-result v6

    if-nez v6, :cond_2

    iget-wide v6, v5, Ll/᩵᩶ܿ;->۬:J

    sub-long v6, v1, v6

    const-wide/16 v8, 0x7530

    cmp-long v10, v6, v8

    if-ltz v10, :cond_2

    const/4 v6, 0x2

    if-lt v4, v6, :cond_1

    .line 112
    invoke-virtual {v5}, Ll/᩵᩶ܿ;->ܽ()V

    .line 113
    invoke-virtual {v5}, Ll/᩵᩶ܿ;->֫()V

    .line 114
    sget-object v5, Ll/᩶᩸ܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    .line 116
    :cond_1
    invoke-virtual {v5}, Ll/᩵᩶ܿ;->ܽ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v4, v4, 0x1

    :cond_2
    :goto_1
    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    .line 121
    :cond_3
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

.method public static ֫(Ljava/util/ArrayList;)V
    .locals 1

    .line 124
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 128
    :cond_0
    sget-object v0, Ll/᩶᩸ܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 129
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩵᩶ܿ;

    .line 130
    invoke-virtual {v0}, Ll/᩵᩶ܿ;->֫()V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public static declared-synchronized ۧ()V
    .locals 5

    .line 2
    const-class v0, Ll/᩶᩸ܿ;

    .line 3
    monitor-enter v0

    .line 91
    :try_start_0
    sget-object v1, Ll/᩶᩸ܿ;->֫:Ljava/util/ArrayList;

    .line 92
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    sput-object v2, Ll/᩶᩸ܿ;->֫:Ljava/util/ArrayList;

    .line 93
    sget-object v2, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v3, Ll/ۚۡܿ;

    const/4 v4, 0x1

    invoke-direct {v3, v4, v1}, Ll/ۚۡܿ;-><init>(ILjava/lang/Object;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
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

.method public static declared-synchronized ܽ()Ll/᩵᩶ܿ;
    .locals 12

    .line 2
    const-class v0, Ll/᩶᩸ܿ;

    .line 3
    monitor-enter v0

    .line 23
    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 25
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 26
    sget-object v1, Ll/᩶᩸ܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Ll/᩵᩶ܿ;

    .line 653
    iget-object v1, v6, Ll/᩵᩶ܿ;->ۤ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-nez v1, :cond_1

    .line 28
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1654
    :cond_1
    iget-boolean v1, v6, Ll/᩵᩶ܿ;->᩹:Z

    if-eqz v1, :cond_2

    goto :goto_0

    .line 34
    :cond_2
    invoke-virtual {v6}, Ll/᩵᩶ܿ;->ܳ()Z

    move-result v1

    if-nez v1, :cond_0

    move-object v1, v6

    .line 36
    monitor-enter v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 37
    :try_start_2
    iget-wide v7, v6, Ll/᩵᩶ܿ;->۬:J

    sub-long v7, v3, v7

    const-wide/16 v9, 0x32

    cmp-long v11, v7, v9

    if-lez v11, :cond_3

    .line 44
    iput-wide v3, v6, Ll/᩵᩶ܿ;->۬:J

    .line 48
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 58
    :try_start_3
    invoke-static {v2}, Ll/᩶᩸ܿ;->֫(Ljava/util/ArrayList;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 48
    monitor-exit v0

    return-object v6

    .line 54
    :cond_3
    :try_start_4
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 58
    :cond_4
    :try_start_6
    invoke-static {v2}, Ll/᩶᩸ܿ;->֫(Ljava/util/ArrayList;)V

    .line 60
    invoke-static {}, Ll/᩶᩸ܿ;->ܿ()Ll/᩵᩶ܿ;

    move-result-object v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    monitor-exit v0

    return-object v1

    :catchall_1
    move-exception v1

    .line 58
    :try_start_7
    invoke-static {v2}, Ll/᩶᩸ܿ;->֫(Ljava/util/ArrayList;)V

    .line 59
    throw v1

    :catchall_2
    move-exception v1

    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    throw v1
.end method

.method public static ܿ()Ll/᩵᩶ܿ;
    .locals 5

    :try_start_0
    const-string v0, "creating connection"

    .line 66
    invoke-static {v0}, Ll/᩶ۘܽ;->֫(Ljava/lang/String;)V

    .line 67
    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v0

    check-cast v0, Ll/᩺᩸ܿ;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ll/᩺᩸ܿ;->֫(Z)Ll/᩵᩶ܿ;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1650
    iget v1, v0, Ll/᩵᩶ܿ;->ܰ:I

    .line 75
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "connection created uid-"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩶ۘܽ;->֫(Ljava/lang/String;)V

    .line 77
    new-instance v1, Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 78
    sget-object v2, Ll/᩶᩸ܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩵᩶ܿ;

    .line 653
    iget-object v4, v3, Ll/᩵᩶ܿ;->ۤ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v4

    if-nez v4, :cond_0

    .line 80
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 83
    :cond_1
    invoke-static {v1}, Ll/᩶᩸ܿ;->֫(Ljava/util/ArrayList;)V

    .line 85
    sget-object v1, Ll/᩶᩸ܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "connection count "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Ll/᩶᩸ܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩶ۘܽ;->֫(Ljava/lang/String;)V

    return-object v0

    :catch_0
    move-exception v0

    .line 69
    sget v1, Ll/᩶ۘܽ;->֫:I

    const-string v1, "mtio "

    const-string v2, "error"

    .line 142
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 71
    throw v0
.end method

.method public static ᩳ()Z
    .locals 1

    .line 19
    sget-object v0, Ll/᩶᩸ܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    return v0
.end method
