.class public abstract Ll/ۗ᩸֫;
.super Ljava/lang/Object;
.source "38PP"

# interfaces
.implements Ll/֨᩸֫;


# instance fields
.field public ֫:I

.field public ۖ:Z

.field public ۘ:I

.field public ۜ:Z

.field public final ۡ:Ljava/util/ArrayDeque;

.field public ۢ:J

.field public final ۧ:[Ll/᩸᩸֫;

.field public ܳ:Ll/᩸᩸֫;

.field public final ܺ:Ljava/util/ArrayDeque;

.field public ܽ:I

.field public final ܿ:Ljava/lang/Thread;

.field public final ᩳ:[Ll/᩶᩸֫;

.field public final ᩷:Ljava/lang/Object;

.field public ᩻:Ll/۠᩸֫;


# direct methods
.method public constructor <init>([Ll/᩸᩸֫;[Ll/᩶᩸֫;)V
    .locals 3

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ۗ᩸֫;->᩷:Ljava/lang/Object;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 60
    iput-wide v0, p0, Ll/ۗ᩸֫;->ۢ:J

    .line 61
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Ll/ۗ᩸֫;->ۡ:Ljava/util/ArrayDeque;

    .line 62
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Ll/ۗ᩸֫;->ܺ:Ljava/util/ArrayDeque;

    .line 63
    iput-object p1, p0, Ll/ۗ᩸֫;->ۧ:[Ll/᩸᩸֫;

    .line 64
    array-length p1, p1

    iput p1, p0, Ll/ۗ᩸֫;->֫:I

    const/4 p1, 0x0

    const/4 v0, 0x0

    .line 65
    :goto_0
    iget v1, p0, Ll/ۗ᩸֫;->֫:I

    if-ge v0, v1, :cond_0

    .line 66
    iget-object v1, p0, Ll/ۗ᩸֫;->ۧ:[Ll/᩸᩸֫;

    invoke-virtual {p0}, Ll/ۗ᩸֫;->ᩳ()Ll/᩸᩸֫;

    move-result-object v2

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 68
    :cond_0
    iput-object p2, p0, Ll/ۗ᩸֫;->ᩳ:[Ll/᩶᩸֫;

    .line 69
    array-length p2, p2

    iput p2, p0, Ll/ۗ᩸֫;->ܽ:I

    .line 70
    :goto_1
    iget p2, p0, Ll/ۗ᩸֫;->ܽ:I

    if-ge p1, p2, :cond_1

    .line 71
    iget-object p2, p0, Ll/ۗ᩸֫;->ᩳ:[Ll/᩶᩸֫;

    invoke-virtual {p0}, Ll/ۗ᩸֫;->ܿ()Ll/᩶᩸֫;

    move-result-object v0

    aput-object v0, p2, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    .line 73
    :cond_1
    new-instance p1, Ll/ۙ᩸֫;

    invoke-direct {p1, p0}, Ll/ۙ᩸֫;-><init>(Ll/ۗ᩸֫;)V

    iput-object p1, p0, Ll/ۗ᩸֫;->ܿ:Ljava/lang/Thread;

    .line 80
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public static ֫(Ll/ۗ᩸֫;)V
    .locals 1

    .line 230
    :goto_0
    :try_start_0
    invoke-direct {p0}, Ll/ۗ᩸֫;->ܳ()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :catch_0
    move-exception p0

    .line 235
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method private ܳ()Z
    .locals 8

    .line 245
    iget-object v0, p0, Ll/ۗ᩸֫;->᩷:Ljava/lang/Object;

    monitor-enter v0

    .line 246
    :goto_0
    :try_start_0
    iget-boolean v1, p0, Ll/ۗ᩸֫;->ۖ:Z

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_1

    .line 308
    iget-object v1, p0, Ll/ۗ᩸֫;->ۡ:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget v1, p0, Ll/ۗ᩸֫;->ܽ:I

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_1
    if-nez v1, :cond_1

    .line 247
    iget-object v1, p0, Ll/ۗ᩸֫;->᩷:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V

    goto :goto_0

    .line 249
    :cond_1
    iget-boolean v1, p0, Ll/ۗ᩸֫;->ۖ:Z

    if-eqz v1, :cond_2

    .line 250
    monitor-exit v0

    return v3

    .line 252
    :cond_2
    iget-object v1, p0, Ll/ۗ᩸֫;->ۡ:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸᩸֫;

    .line 253
    iget-object v4, p0, Ll/ۗ᩸֫;->ᩳ:[Ll/᩶᩸֫;

    iget v5, p0, Ll/ۗ᩸֫;->ܽ:I

    sub-int/2addr v5, v2

    iput v5, p0, Ll/ۗ᩸֫;->ܽ:I

    aget-object v4, v4, v5

    .line 254
    iget-boolean v5, p0, Ll/ۗ᩸֫;->ۜ:Z

    .line 255
    iput-boolean v3, p0, Ll/ۗ᩸֫;->ۜ:Z

    .line 256
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/4 v0, 0x4

    .line 45
    invoke-virtual {v1, v0}, Ll/ۘ᩸֫;->ᩳ(I)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 259
    invoke-virtual {v4, v0}, Ll/ۘ᩸֫;->ۧ(I)V

    goto :goto_4

    .line 261
    :cond_3
    iget-wide v6, v1, Ll/᩸᩸֫;->ۤ:J

    iput-wide v6, v4, Ll/᩶᩸֫;->ۙ:J

    const/high16 v0, 0x8000000

    .line 36
    invoke-virtual {v1, v0}, Ll/ۘ᩸֫;->ᩳ(I)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 263
    invoke-virtual {v4, v0}, Ll/ۘ᩸֫;->ۧ(I)V

    .line 265
    :cond_4
    iget-wide v6, v1, Ll/᩸᩸֫;->ۤ:J

    invoke-virtual {p0, v6, v7}, Ll/ۗ᩸֫;->ܽ(J)Z

    move-result v0

    if-nez v0, :cond_5

    .line 266
    iput-boolean v2, v4, Ll/᩶᩸֫;->᩹:Z

    .line 270
    :cond_5
    :try_start_1
    invoke-virtual {p0, v1, v4, v5}, Ll/ۗ᩸֫;->֫(Ll/᩸᩸֫;Ll/᩶᩸֫;Z)Ll/۠᩸֫;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0

    :goto_2
    move-object v5, v0

    goto :goto_3

    :catch_0
    move-exception v0

    .line 279
    invoke-virtual {p0, v0}, Ll/ۗ᩸֫;->֫(Ljava/lang/Throwable;)Ll/۠᩸֫;

    move-result-object v0

    goto :goto_2

    :catch_1
    move-exception v0

    .line 274
    invoke-virtual {p0, v0}, Ll/ۗ᩸֫;->֫(Ljava/lang/Throwable;)Ll/۠᩸֫;

    move-result-object v0

    goto :goto_2

    :goto_3
    if-eqz v5, :cond_6

    .line 282
    iget-object v0, p0, Ll/ۗ᩸֫;->᩷:Ljava/lang/Object;

    monitor-enter v0

    .line 283
    :try_start_2
    iput-object v5, p0, Ll/ۗ᩸֫;->᩻:Ll/۠᩸֫;

    .line 284
    monitor-exit v0

    return v3

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1

    .line 289
    :cond_6
    :goto_4
    iget-object v0, p0, Ll/ۗ᩸֫;->᩷:Ljava/lang/Object;

    monitor-enter v0

    .line 290
    :try_start_3
    iget-boolean v5, p0, Ll/ۗ᩸֫;->ۜ:Z

    if-eqz v5, :cond_7

    .line 291
    invoke-virtual {v4}, Ll/᩶᩸֫;->ᩴ()V

    goto :goto_5

    .line 292
    :cond_7
    iget-boolean v5, v4, Ll/᩶᩸֫;->᩹:Z

    if-eqz v5, :cond_8

    .line 293
    iget v3, p0, Ll/ۗ᩸֫;->ۘ:I

    add-int/2addr v3, v2

    iput v3, p0, Ll/ۗ᩸֫;->ۘ:I

    .line 294
    invoke-virtual {v4}, Ll/᩶᩸֫;->ᩴ()V

    goto :goto_5

    .line 296
    :cond_8
    iget v5, p0, Ll/ۗ᩸֫;->ۘ:I

    iput v5, v4, Ll/᩶᩸֫;->᩶:I

    .line 297
    iput v3, p0, Ll/ۗ᩸֫;->ۘ:I

    .line 298
    iget-object v3, p0, Ll/ۗ᩸֫;->ܺ:Ljava/util/ArrayDeque;

    invoke-virtual {v3, v4}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 312
    :goto_5
    invoke-virtual {v1}, Ll/᩸᩸֫;->ۧ()V

    .line 313
    iget-object v3, p0, Ll/ۗ᩸֫;->ۧ:[Ll/᩸᩸֫;

    iget v4, p0, Ll/ۗ᩸֫;->֫:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Ll/ۗ᩸֫;->֫:I

    aput-object v1, v3, v4

    .line 302
    monitor-exit v0

    return v2

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v1

    :catchall_2
    move-exception v1

    .line 256
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw v1
.end method


# virtual methods
.method public final flush()V
    .locals 5

    .line 174
    iget-object v0, p0, Ll/ۗ᩸֫;->᩷:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    .line 175
    :try_start_0
    iput-boolean v1, p0, Ll/ۗ᩸֫;->ۜ:Z

    const/4 v1, 0x0

    .line 176
    iput v1, p0, Ll/ۗ᩸֫;->ۘ:I

    .line 177
    iget-object v1, p0, Ll/ۗ᩸֫;->ܳ:Ll/᩸᩸֫;

    if-eqz v1, :cond_0

    .line 312
    invoke-virtual {v1}, Ll/᩸᩸֫;->ۧ()V

    .line 313
    iget-object v2, p0, Ll/ۗ᩸֫;->ۧ:[Ll/᩸᩸֫;

    iget v3, p0, Ll/ۗ᩸֫;->֫:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Ll/ۗ᩸֫;->֫:I

    aput-object v1, v2, v3

    const/4 v1, 0x0

    .line 179
    iput-object v1, p0, Ll/ۗ᩸֫;->ܳ:Ll/᩸᩸֫;

    .line 181
    :cond_0
    :goto_0
    iget-object v1, p0, Ll/ۗ᩸֫;->ۡ:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 182
    iget-object v1, p0, Ll/ۗ᩸֫;->ۡ:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸᩸֫;

    .line 312
    invoke-virtual {v1}, Ll/᩸᩸֫;->ۧ()V

    .line 313
    iget-object v2, p0, Ll/ۗ᩸֫;->ۧ:[Ll/᩸᩸֫;

    iget v3, p0, Ll/ۗ᩸֫;->֫:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Ll/ۗ᩸֫;->֫:I

    aput-object v1, v2, v3

    goto :goto_0

    .line 184
    :cond_1
    :goto_1
    iget-object v1, p0, Ll/ۗ᩸֫;->ܺ:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 185
    iget-object v1, p0, Ll/ۗ᩸֫;->ܺ:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩶᩸֫;

    invoke-virtual {v1}, Ll/᩶᩸֫;->ᩴ()V

    goto :goto_1

    .line 187
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public abstract ֫(Ljava/lang/Throwable;)Ll/۠᩸֫;
.end method

.method public abstract ֫(Ll/᩸᩸֫;Ll/᩶᩸֫;Z)Ll/۠᩸֫;
.end method

.method public ֫()V
    .locals 2

    .line 193
    iget-object v0, p0, Ll/ۗ᩸֫;->᩷:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    .line 194
    :try_start_0
    iput-boolean v1, p0, Ll/ۗ᩸֫;->ۖ:Z

    .line 195
    iget-object v1, p0, Ll/ۗ᩸֫;->᩷:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 196
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 198
    :try_start_1
    iget-object v0, p0, Ll/ۗ᩸֫;->ܿ:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->join()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    .line 200
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    return-void

    :catchall_0
    move-exception v1

    .line 196
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final ֫(I)V
    .locals 4

    .line 92
    iget v0, p0, Ll/ۗ᩸֫;->֫:I

    iget-object v1, p0, Ll/ۗ᩸֫;->ۧ:[Ll/᩸᩸֫;

    array-length v2, v1

    const/4 v3, 0x0

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 93
    array-length v0, v1

    :goto_1
    if-ge v3, v0, :cond_1

    aget-object v2, v1, v3

    .line 94
    invoke-virtual {v2, p1}, Ll/᩸᩸֫;->ܳ(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final bridge synthetic ֫(Ljava/lang/Object;)V
    .locals 0

    .line 29
    check-cast p1, Ll/᩸᩸֫;

    invoke-virtual {p0, p1}, Ll/ۗ᩸֫;->֫(Ll/᩸᩸֫;)V

    return-void
.end method

.method public final ֫(Ll/᩶᩸֫;)V
    .locals 4

    .line 166
    iget-object v0, p0, Ll/ۗ᩸֫;->᩷:Ljava/lang/Object;

    monitor-enter v0

    .line 317
    :try_start_0
    invoke-virtual {p1}, Ll/᩶᩸֫;->ۧ()V

    .line 318
    iget-object v1, p0, Ll/ۗ᩸֫;->ᩳ:[Ll/᩶᩸֫;

    iget v2, p0, Ll/ۗ᩸֫;->ܽ:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Ll/ۗ᩸֫;->ܽ:I

    aput-object p1, v1, v2

    .line 308
    iget-object p1, p0, Ll/ۗ᩸֫;->ۡ:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    iget p1, p0, Ll/ۗ᩸֫;->ܽ:I

    if-lez p1, :cond_0

    .line 224
    iget-object p1, p0, Ll/ۗ᩸֫;->᩷:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->notify()V

    .line 169
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/᩸᩸֫;)V
    .locals 2

    .line 138
    iget-object v0, p0, Ll/ۗ᩸֫;->᩷:Ljava/lang/Object;

    monitor-enter v0

    .line 210
    :try_start_0
    iget-object v1, p0, Ll/ۗ᩸֫;->᩻:Ll/۠᩸֫;

    if-nez v1, :cond_2

    .line 140
    iget-object v1, p0, Ll/ۗ᩸֫;->ܳ:Ll/᩸᩸֫;

    if-ne p1, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ll/᩺֡֫;->֫(Z)V

    .line 141
    iget-object v1, p0, Ll/ۗ᩸֫;->ۡ:Ljava/util/ArrayDeque;

    invoke-virtual {v1, p1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 308
    iget-object p1, p0, Ll/ۗ᩸֫;->ۡ:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    iget p1, p0, Ll/ۗ᩸֫;->ܽ:I

    if-lez p1, :cond_1

    .line 224
    iget-object p1, p0, Ll/ۗ᩸֫;->᩷:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->notify()V

    :cond_1
    const/4 p1, 0x0

    .line 143
    iput-object p1, p0, Ll/ۗ᩸֫;->ܳ:Ll/᩸᩸֫;

    .line 144
    monitor-exit v0

    return-void

    .line 212
    :cond_2
    throw v1

    :catchall_0
    move-exception p1

    .line 144
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final bridge synthetic ۧ()Ljava/lang/Object;
    .locals 1

    .line 29
    invoke-virtual {p0}, Ll/ۗ᩸֫;->ۧ()Ll/᩶᩸֫;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Ll/᩶᩸֫;
    .locals 2

    .line 150
    iget-object v0, p0, Ll/ۗ᩸֫;->᩷:Ljava/lang/Object;

    monitor-enter v0

    .line 210
    :try_start_0
    iget-object v1, p0, Ll/ۗ᩸֫;->᩻:Ll/۠᩸֫;

    if-nez v1, :cond_1

    .line 152
    iget-object v1, p0, Ll/ۗ᩸֫;->ܺ:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 153
    monitor-exit v0

    return-object v1

    .line 155
    :cond_0
    iget-object v1, p0, Ll/ۗ᩸֫;->ܺ:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩶᩸֫;

    monitor-exit v0

    return-object v1

    .line 212
    :cond_1
    throw v1

    :catchall_0
    move-exception v1

    .line 156
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ۧ(J)V
    .locals 3

    .line 116
    iget-object v0, p0, Ll/ۗ᩸֫;->᩷:Ljava/lang/Object;

    monitor-enter v0

    .line 117
    :try_start_0
    iget v1, p0, Ll/ۗ᩸֫;->֫:I

    iget-object v2, p0, Ll/ۗ᩸֫;->ۧ:[Ll/᩸᩸֫;

    array-length v2, v2

    if-eq v1, v2, :cond_1

    iget-boolean v1, p0, Ll/ۗ᩸֫;->ۜ:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 118
    iput-wide p1, p0, Ll/ۗ᩸֫;->ۢ:J

    .line 119
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ܽ()Ljava/lang/Object;
    .locals 3

    .line 125
    iget-object v0, p0, Ll/ۗ᩸֫;->᩷:Ljava/lang/Object;

    monitor-enter v0

    .line 210
    :try_start_0
    iget-object v1, p0, Ll/ۗ᩸֫;->᩻:Ll/۠᩸֫;

    if-nez v1, :cond_2

    .line 127
    iget-object v1, p0, Ll/ۗ᩸֫;->ܳ:Ll/᩸᩸֫;

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 129
    iget v1, p0, Ll/ۗ᩸֫;->֫:I

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    .line 131
    :cond_1
    iget-object v2, p0, Ll/ۗ᩸֫;->ۧ:[Ll/᩸᩸֫;

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Ll/ۗ᩸֫;->֫:I

    aget-object v1, v2, v1

    :goto_1
    iput-object v1, p0, Ll/ۗ᩸֫;->ܳ:Ll/᩸᩸֫;

    .line 132
    monitor-exit v0

    return-object v1

    .line 212
    :cond_2
    throw v1

    :catchall_0
    move-exception v1

    .line 133
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ܽ(J)Z
    .locals 6

    .line 109
    iget-object v0, p0, Ll/ۗ᩸֫;->᩷:Ljava/lang/Object;

    monitor-enter v0

    .line 110
    :try_start_0
    iget-wide v1, p0, Ll/ۗ᩸֫;->ۢ:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1

    cmp-long v3, p1, v1

    if-ltz v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 111
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public abstract ܿ()Ll/᩶᩸֫;
.end method

.method public abstract ᩳ()Ll/᩸᩸֫;
.end method
