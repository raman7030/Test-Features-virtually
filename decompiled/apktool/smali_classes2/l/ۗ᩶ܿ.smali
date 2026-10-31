.class public final Ll/ۗ᩶ܿ;
.super Ljava/lang/Object;
.source "L17P"


# static fields
.field public static ֫:Ljava/util/ArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 14
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Ll/ۗ᩶ܿ;->֫:Ljava/util/ArrayList;

    .line 19
    invoke-static {}, Ll/ۙ᩸᩷;->ܺ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 20
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Ll/ۖ֨ۢ;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ll/ۖ֨ۢ;-><init>(I)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    const/4 v1, 0x1

    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setDaemon(Z)V

    const-string v1, "mtio-idle-cleaner"

    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 34
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :cond_0
    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ll/᩵᩶ܿ;
    .locals 1

    .line 43
    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v0

    invoke-interface {v0}, Ll/֡᩶ܿ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "/data"

    .line 67
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "/data/data/"

    .line 69
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "/data/user/"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "/data/user_de/"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_0

    .line 74
    :cond_0
    invoke-static {p0}, Ll/᩵᩸ܿ;->֫(Ljava/lang/String;)Ll/ۘ᩸ܿ;

    move-result-object p0

    if-eqz p0, :cond_2

    :cond_1
    :goto_0
    const/4 p0, 0x1

    goto :goto_1

    :cond_2
    const/4 p0, 0x0

    .line 43
    :goto_1
    invoke-static {p0}, Ll/ۗ᩶ܿ;->֫(Z)Ll/᩵᩶ܿ;

    move-result-object p0

    return-object p0
.end method

.method public static declared-synchronized ֫(Z)Ll/᩵᩶ܿ;
    .locals 11

    .line 2
    const-class v0, Ll/ۗ᩶ܿ;

    .line 3
    monitor-enter v0

    if-eqz p0, :cond_0

    .line 73
    :try_start_0
    invoke-static {}, Ll/᩶᩸ܿ;->ܽ()Ll/᩵᩶ܿ;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v0

    return-object p0

    .line 75
    :cond_0
    :try_start_1
    new-instance p0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-direct {p0, v1}, Ljava/util/ArrayList;-><init>(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 77
    :try_start_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 78
    sget-object v1, Ll/ۗ᩶ܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Ll/᩵᩶ܿ;

    .line 653
    iget-object v1, v5, Ll/᩵᩶ܿ;->ۤ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-nez v1, :cond_2

    .line 80
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1654
    :cond_2
    iget-boolean v1, v5, Ll/᩵᩶ܿ;->᩹:Z

    if-eqz v1, :cond_3

    goto :goto_0

    .line 86
    :cond_3
    invoke-virtual {v5}, Ll/᩵᩶ܿ;->ܳ()Z

    move-result v1

    if-nez v1, :cond_1

    move-object v1, v5

    .line 88
    monitor-enter v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 89
    :try_start_3
    iget-wide v6, v5, Ll/᩵᩶ܿ;->۬:J

    sub-long v6, v2, v6

    const-wide/16 v8, 0x32

    cmp-long v10, v6, v8

    if-lez v10, :cond_4

    .line 96
    iput-wide v2, v5, Ll/᩵᩶ܿ;->۬:J

    .line 100
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 110
    :try_start_4
    invoke-static {p0}, Ll/ۗ᩶ܿ;->֫(Ljava/util/ArrayList;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 100
    monitor-exit v0

    return-object v5

    .line 106
    :cond_4
    :try_start_5
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 110
    :cond_5
    :try_start_7
    invoke-static {p0}, Ll/ۗ᩶ܿ;->֫(Ljava/util/ArrayList;)V

    .line 112
    invoke-static {}, Ll/ۗ᩶ܿ;->ᩳ()Ll/᩵᩶ܿ;

    move-result-object p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    monitor-exit v0

    return-object p0

    :catchall_1
    move-exception v1

    .line 110
    :try_start_8
    invoke-static {p0}, Ll/ۗ᩶ܿ;->֫(Ljava/util/ArrayList;)V

    .line 111
    throw v1

    :catchall_2
    move-exception p0

    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    throw p0
.end method

.method public static ֫()V
    .locals 11

    :goto_0
    const-wide/16 v0, 0x61a8

    .line 24
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 0
    const-class v0, Ll/ۗ᩶ܿ;

    monitor-enter v0

    .line 156
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 158
    sget-object v3, Ll/ۗ᩶ܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    const/4 v4, 0x0

    :goto_1
    if-ltz v3, :cond_3

    .line 159
    sget-object v5, Ll/ۗ᩶ܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩵᩶ܿ;

    .line 653
    iget-object v6, v5, Ll/᩵᩶ܿ;->ۤ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v6

    if-nez v6, :cond_0

    .line 161
    invoke-virtual {v5}, Ll/᩵᩶ܿ;->֫()V

    .line 162
    sget-object v5, Ll/ۗ᩶ܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_2

    .line 165
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

    .line 167
    invoke-virtual {v5}, Ll/᩵᩶ܿ;->ܽ()V

    .line 168
    invoke-virtual {v5}, Ll/᩵᩶ܿ;->֫()V

    .line 169
    sget-object v5, Ll/ۗ᩶ܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_2

    .line 171
    :cond_1
    invoke-virtual {v5}, Ll/᩵᩶ܿ;->ܽ()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/lit8 v4, v4, 0x1

    :cond_2
    :goto_2
    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    .line 176
    :cond_3
    monitor-exit v0

    .line 29
    invoke-static {}, Ll/᩶᩸ܿ;->֫()V

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 176
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1

    :catch_0
    return-void
.end method

.method public static ֫(Ljava/util/ArrayList;)V
    .locals 1

    .line 179
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 183
    :cond_0
    sget-object v0, Ll/ۗ᩶ܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 184
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩵᩶ܿ;

    .line 185
    invoke-virtual {v0}, Ll/᩵᩶ܿ;->֫()V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public static ۧ(Z)Ll/᩵᩶ܿ;
    .locals 2

    .line 50
    invoke-static {p0}, Ll/ۗ᩶ܿ;->֫(Z)Ll/᩵᩶ܿ;

    move-result-object v0

    .line 52
    :try_start_0
    invoke-virtual {v0}, Ll/᩵᩶ܿ;->ۘ()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v1

    .line 55
    invoke-virtual {v0}, Ll/᩵᩶ܿ;->֫()V

    .line 58
    :try_start_1
    invoke-static {p0}, Ll/ۗ᩶ܿ;->֫(Z)Ll/᩵᩶ܿ;

    move-result-object p0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    .line 59
    :try_start_2
    invoke-virtual {p0}, Ll/᩵᩶ܿ;->ۘ()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    return-object p0

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_0

    .line 63
    invoke-virtual {p0}, Ll/᩵᩶ܿ;->֫()V

    .line 65
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 66
    throw v0
.end method

.method public static ۧ()V
    .locals 4

    .line 145
    sget-object v0, Ll/ۗ᩶ܿ;->֫:Ljava/util/ArrayList;

    .line 146
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sput-object v1, Ll/ۗ᩶ܿ;->֫:Ljava/util/ArrayList;

    .line 147
    sget-object v1, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Ll/ܺ᩷ܳ;

    const/4 v3, 0x1

    invoke-direct {v2, v3, v0}, Ll/ܺ᩷ܳ;-><init>(ILjava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 152
    invoke-static {}, Ll/᩶᩸ܿ;->ۧ()V

    return-void
.end method

.method public static ܽ()Z
    .locals 1

    .line 39
    sget-object v0, Ll/ۗ᩶ܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public static ᩳ()Ll/᩵᩶ܿ;
    .locals 6

    :try_start_0
    const-string v0, "creating connection"

    .line 118
    invoke-static {v0}, Ll/᩶ۘܽ;->֫(Ljava/lang/String;)V

    .line 119
    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v0

    check-cast v0, Ll/᩺᩸ܿ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/᩺᩸ܿ;->֫(Z)Ll/᩵᩶ܿ;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1650
    iget v2, v0, Ll/᩵᩶ܿ;->ܰ:I

    .line 126
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "connection created uid-"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/᩶ۘܽ;->֫(Ljava/lang/String;)V

    .line 129
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 130
    sget-object v1, Ll/ۗ᩶ܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩵᩶ܿ;

    .line 653
    iget-object v5, v4, Ll/᩵᩶ܿ;->ۤ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v5

    if-nez v5, :cond_1

    .line 132
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1650
    :cond_1
    iget v5, v4, Ll/᩵᩶ܿ;->ܰ:I

    if-eq v5, v2, :cond_0

    .line 134
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 137
    :cond_2
    invoke-static {v3}, Ll/ۗ᩶ܿ;->֫(Ljava/util/ArrayList;)V

    .line 139
    sget-object v1, Ll/ۗ᩶ܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "connection count "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Ll/ۗ᩶ܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩶ۘܽ;->֫(Ljava/lang/String;)V

    return-object v0

    :catch_0
    move-exception v0

    .line 121
    sget v1, Ll/᩶ۘܽ;->֫:I

    const-string v1, "mtio "

    const-string v2, "error"

    .line 142
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 123
    throw v0
.end method
