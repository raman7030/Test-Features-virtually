.class public final Ll/᩷۟᩵;
.super Ljava/lang/Object;
.source "G4FN"

# interfaces
.implements Ll/ܽܰ᩵;


# instance fields
.field public final ۗ:Ll/᩸֫֡;

.field public final ۙ:Ll/ۡ۟᩵;

.field public final ۬:Ll/ۙܽ֡;

.field public ᩶:Z

.field public final ᩸:Ll/ܿ۟᩵;

.field public ᩹:Ll/᩶ܰ᩵;


# direct methods
.method public constructor <init>(Ll/ܿ۟᩵;Ll/ۡ۟᩵;)V
    .locals 2

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p1, p0, Ll/᩷۟᩵;->᩸:Ll/ܿ۟᩵;

    .line 61
    iput-object p2, p0, Ll/᩷۟᩵;->ۙ:Ll/ۡ۟᩵;

    .line 63
    new-instance p2, Ll/᩸֫֡;

    invoke-direct {p2, p1}, Ll/᩸֫֡;-><init>(Ll/ܿ۟᩵;)V

    iput-object p2, p0, Ll/᩷۟᩵;->ۗ:Ll/᩸֫֡;

    .line 64
    new-instance p2, Ll/᩻۟᩵;

    invoke-direct {p2, p0}, Ll/᩻۟᩵;-><init>(Ll/᩷۟᩵;)V

    iput-object p2, p0, Ll/᩷۟᩵;->۬:Ll/ۙܽ֡;

    .line 302
    iget p1, p1, Ll/ܿ۟᩵;->᩶:I

    int-to-long v0, p1

    .line 69
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p2, v0, v1}, Ll/ܶᩳ֡;->ۧ(J)Ll/ܶᩳ֡;

    return-void
.end method

.method public static synthetic ֫(Ll/᩷۟᩵;)Ll/᩶ܰ᩵;
    .locals 0

    .line 41
    iget-object p0, p0, Ll/᩷۟᩵;->᩹:Ll/᩶ܰ᩵;

    return-object p0
.end method

.method public static ֫(Ll/ܿ۟᩵;Ll/ۡ۟᩵;)Ll/᩷۟᩵;
    .locals 1

    .line 74
    new-instance v0, Ll/᩷۟᩵;

    invoke-direct {v0, p0, p1}, Ll/᩷۟᩵;-><init>(Ll/ܿ۟᩵;Ll/ۡ۟᩵;)V

    .line 420
    iget-object p0, p0, Ll/ܿ۟᩵;->ܰ:Ll/᩹ܰ᩵;

    .line 75
    check-cast p0, Ll/᩸ܰ᩵;

    .line 59
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p0, Ll/᩶ܰ᩵;->֫:Ll/᩶ܰ᩵;

    .line 75
    iput-object p0, v0, Ll/᩷۟᩵;->᩹:Ll/᩶ܰ᩵;

    return-object v0
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    .line 131
    iget-object v0, p0, Ll/᩷۟᩵;->ۗ:Ll/᩸֫֡;

    invoke-virtual {v0}, Ll/᩸֫֡;->֫()V

    return-void
.end method

.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 148
    iget-object v0, p0, Ll/᩷۟᩵;->᩸:Ll/ܿ۟᩵;

    iget-object v1, p0, Ll/᩷۟᩵;->ۙ:Ll/ۡ۟᩵;

    invoke-static {v0, v1}, Ll/᩷۟᩵;->֫(Ll/ܿ۟᩵;Ll/ۡ۟᩵;)Ll/᩷۟᩵;

    move-result-object v0

    return-object v0
.end method

.method public final execute()Ll/ᩴ۟᩵;
    .locals 3

    move-object v0, p0

    .line 84
    monitor-enter v0

    .line 85
    :try_start_0
    iget-boolean v1, p0, Ll/᩷۟᩵;->᩶:Z

    if-nez v1, :cond_1

    const/4 v1, 0x1

    .line 86
    iput-boolean v1, p0, Ll/᩷۟᩵;->᩶:Z

    .line 87
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 116
    invoke-static {}, Ll/ᩴܽ֡;->ܽ()Ll/ᩴܽ֡;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩴܽ֡;->ۧ()Ljava/lang/Object;

    move-result-object v0

    .line 117
    iget-object v1, p0, Ll/᩷۟᩵;->ۗ:Ll/᩸֫֡;

    invoke-virtual {v1, v0}, Ll/᩸֫֡;->֫(Ljava/lang/Object;)V

    .line 89
    iget-object v0, p0, Ll/᩷۟᩵;->۬:Ll/ۙܽ֡;

    invoke-virtual {v0}, Ll/ۙܽ֡;->᩻()V

    .line 90
    iget-object v0, p0, Ll/᩷۟᩵;->᩹:Ll/᩶ܰ᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    :try_start_1
    iget-object v0, p0, Ll/᩷۟᩵;->᩸:Ll/ܿ۟᩵;

    .line 390
    iget-object v0, v0, Ll/ܿ۟᩵;->ۨ:Ll/ۚܰ᩵;

    .line 92
    invoke-virtual {v0, p0}, Ll/ۚܰ᩵;->֫(Ll/᩷۟᩵;)V

    .line 93
    invoke-virtual {p0}, Ll/᩷۟᩵;->֫()Ll/ᩴ۟᩵;

    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_0

    .line 101
    iget-object v1, p0, Ll/᩷۟᩵;->᩸:Ll/ܿ۟᩵;

    .line 390
    iget-object v1, v1, Ll/ܿ۟᩵;->ۨ:Ll/ۚܰ᩵;

    .line 101
    invoke-virtual {v1, p0}, Ll/ۚܰ᩵;->ۧ(Ll/᩷۟᩵;)V

    return-object v0

    .line 94
    :cond_0
    :try_start_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Canceled"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 97
    :try_start_3
    invoke-virtual {p0, v0}, Ll/᩷۟᩵;->֫(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    .line 98
    iget-object v1, p0, Ll/᩷۟᩵;->᩹:Ll/᩶ܰ᩵;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 101
    :goto_0
    iget-object v1, p0, Ll/᩷۟᩵;->᩸:Ll/ܿ۟᩵;

    .line 390
    iget-object v1, v1, Ll/ܿ۟᩵;->ۨ:Ll/ۚܰ᩵;

    .line 101
    invoke-virtual {v1, p0}, Ll/ۚܰ᩵;->ۧ(Ll/᩷۟᩵;)V

    throw v0

    .line 85
    :cond_1
    :try_start_4
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Already Executed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_1
    move-exception v1

    .line 87
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v1
.end method

.method public final ֫(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 106
    iget-object v0, p0, Ll/᩷۟᩵;->۬:Ll/ۙܽ֡;

    invoke-virtual {v0}, Ll/ۙܽ֡;->ۜ()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    .line 108
    :cond_0
    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_1

    .line 110
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_1
    return-object v0
.end method

.method public final ֫()Ll/ᩴ۟᩵;
    .locals 15

    .line 242
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 407
    iget-object v0, p0, Ll/᩷۟᩵;->᩸:Ll/ܿ۟᩵;

    iget-object v2, v0, Ll/ܿ۟᩵;->ܽ֫:Ljava/util/List;

    .line 243
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 244
    iget-object v12, p0, Ll/᩷۟᩵;->ۗ:Ll/᩸֫֡;

    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 245
    new-instance v2, Ll/ۖ֫֡;

    .line 334
    iget-object v3, v0, Ll/ܿ۟᩵;->ۛ:Ll/᩵ܰ᩵;

    .line 245
    invoke-direct {v2, v3}, Ll/ۖ֫֡;-><init>(Ll/᩵ܰ᩵;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 246
    new-instance v2, Ll/ۗ۟᩵;

    .line 342
    iget-object v3, v0, Ll/ܿ۟᩵;->᩹:Ll/۟᩺᩵;

    if-eqz v3, :cond_0

    iget-object v3, v3, Ll/۟᩺᩵;->᩹:Ll/ᩳ֫֡;

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 246
    :goto_0
    invoke-direct {v2, v3}, Ll/ۗ۟᩵;-><init>(Ll/ᩳ֫֡;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 247
    new-instance v2, Ll/ܿ֫֡;

    invoke-direct {v2, v0}, Ll/ܿ֫֡;-><init>(Ll/ܿ۟᩵;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 416
    iget-object v2, v0, Ll/ܿ۟᩵;->ᩳ֫:Ljava/util/List;

    .line 249
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 251
    new-instance v2, Ll/ᩴ֫֡;

    .line 36
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 251
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 253
    new-instance v13, Ll/۠֫֡;

    iget-object v8, p0, Ll/᩷۟᩵;->᩹:Ll/᩶ܰ᩵;

    .line 307
    iget v9, v0, Ll/ܿ۟᩵;->۬:I

    .line 312
    iget v10, v0, Ll/ܿ۟᩵;->ۜ֫:I

    .line 317
    iget v11, v0, Ll/ܿ۟᩵;->ܺ֫:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 255
    iget-object v14, p0, Ll/᩷۟᩵;->ۙ:Ll/ۡ۟᩵;

    move-object v0, v13

    move-object v6, v14

    move-object v7, p0

    invoke-direct/range {v0 .. v11}, Ll/۠֫֡;-><init>(Ljava/util/ArrayList;Ll/ܺ֫֡;Ll/᩵֫֡;Ll/᩻֫֡;ILl/ۡ۟᩵;Ll/ܽܰ᩵;Ll/᩶ܰ᩵;III)V

    .line 257
    invoke-virtual {v13, v14}, Ll/۠֫֡;->֫(Ll/ۡ۟᩵;)Ll/ᩴ۟᩵;

    move-result-object v0

    .line 258
    invoke-virtual {v12}, Ll/᩸֫֡;->ۧ()Z

    move-result v1

    if-nez v1, :cond_1

    return-object v0

    .line 259
    :cond_1
    invoke-static {v0}, Ll/᩶۟᩵;->֫(Ljava/io/Closeable;)V

    .line 260
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Canceled"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Ll/ᩳܰ᩵;)V
    .locals 2

    move-object v0, p0

    .line 121
    monitor-enter v0

    .line 122
    :try_start_0
    iget-boolean v1, p0, Ll/᩷۟᩵;->᩶:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 123
    iput-boolean v1, p0, Ll/᩷۟᩵;->᩶:Z

    .line 124
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    invoke-static {}, Ll/ᩴܽ֡;->ܽ()Ll/ᩴܽ֡;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩴܽ֡;->ۧ()Ljava/lang/Object;

    move-result-object v0

    .line 117
    iget-object v1, p0, Ll/᩷۟᩵;->ۗ:Ll/᩸֫֡;

    invoke-virtual {v1, v0}, Ll/᩸֫֡;->֫(Ljava/lang/Object;)V

    .line 126
    iget-object v0, p0, Ll/᩷۟᩵;->᩹:Ll/᩶ܰ᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    iget-object v0, p0, Ll/᩷۟᩵;->᩸:Ll/ܿ۟᩵;

    .line 390
    iget-object v0, v0, Ll/ܿ۟᩵;->ۨ:Ll/ۚܰ᩵;

    .line 127
    new-instance v1, Ll/ۜ۟᩵;

    invoke-direct {v1, p0, p1}, Ll/ۜ۟᩵;-><init>(Ll/᩷۟᩵;Ll/ᩳܰ᩵;)V

    invoke-virtual {v0, v1}, Ll/ۚܰ᩵;->֫(Ll/ۜ۟᩵;)V

    return-void

    .line 122
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Already Executed"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 124
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ᩻()Z
    .locals 1

    .line 143
    iget-object v0, p0, Ll/᩷۟᩵;->ۗ:Ll/᩸֫֡;

    invoke-virtual {v0}, Ll/᩸֫֡;->ۧ()Z

    move-result v0

    return v0
.end method
