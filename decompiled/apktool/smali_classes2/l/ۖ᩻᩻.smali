.class public final Ll/ۖ᩻᩻;
.super Ljava/lang/Object;
.source "C7HP"


# static fields
.field public static final synthetic ܶ:I

.field public static final ᩸:Ll/ۡۤۡ;


# instance fields
.field public final ֡:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final ֨:Ljava/lang/Object;

.field public final ֫:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final ۖ:Z

.field public final ۘ:Ll/ܿ᩵ܿ;

.field public final ۚ:Ljava/lang/String;

.field public final ۜ:J

.field public final ۠:Ll/ܶ᩵ܿ;

.field public final ۡ:Z

.field public ۢ:J

.field public final ۧ:Ljava/lang/ThreadLocal;

.field public final ܳ:Ljava/util/concurrent/atomic/AtomicLong;

.field public final ܺ:Ll/᩻ۖܽ;

.field public final ܽ:Ll/᩻᩻᩻;

.field public final ܿ:Ll/ܶ᩵ܿ;

.field public volatile ᩳ:Z

.field public final ᩴ:Ljava/lang/String;

.field public final ᩵:Z

.field public final ᩷:J

.field public final ᩻:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3e8

    .line 96
    invoke-static {v0}, Ll/ۡۤۡ;->֫(I)Ll/ۡۤۡ;

    move-result-object v0

    sput-object v0, Ll/ۖ᩻᩻;->᩸:Ll/ۡۤۡ;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;ZLl/᩻ۖܽ;JJLjava/lang/Object;Ll/ܿ᩵ܿ;ZZLjava/lang/ThreadLocal;Ll/᩻᩻᩻;)V
    .locals 5

    move-object v0, p0

    .line 140
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v1, v0, Ll/ۖ᩻᩻;->֡:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 90
    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v1, v0, Ll/ۖ᩻᩻;->֫:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 91
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v1, v0, Ll/ۖ᩻᩻;->᩻:Ljava/util/concurrent/atomic/AtomicReference;

    .line 92
    new-instance v1, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v3, 0x0

    invoke-direct {v1, v3, v4}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v1, v0, Ll/ۖ᩻᩻;->ܳ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 93
    iput-boolean v2, v0, Ll/ۖ᩻᩻;->ᩳ:Z

    move-object v1, p2

    .line 142
    iput-object v1, v0, Ll/ۖ᩻᩻;->ᩴ:Ljava/lang/String;

    move-object/from16 v1, p17

    .line 144
    iput-object v1, v0, Ll/ۖ᩻᩻;->ۧ:Ljava/lang/ThreadLocal;

    .line 145
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-object v1, p4

    .line 146
    iput-object v1, v0, Ll/ۖ᩻᩻;->ۚ:Ljava/lang/String;

    move-object v1, p5

    .line 147
    iput-object v1, v0, Ll/ۖ᩻᩻;->۠:Ll/ܶ᩵ܿ;

    move-object v1, p6

    .line 148
    iput-object v1, v0, Ll/ۖ᩻᩻;->ܿ:Ll/ܶ᩵ܿ;

    move v1, p7

    .line 149
    iput-boolean v1, v0, Ll/ۖ᩻᩻;->᩵:Z

    move-object v1, p8

    .line 150
    iput-object v1, v0, Ll/ۖ᩻᩻;->ܺ:Ll/᩻ۖܽ;

    move-wide v1, p9

    .line 151
    iput-wide v1, v0, Ll/ۖ᩻᩻;->ۜ:J

    move-wide/from16 v1, p11

    .line 152
    iput-wide v1, v0, Ll/ۖ᩻᩻;->᩷:J

    move-object/from16 v1, p13

    .line 153
    iput-object v1, v0, Ll/ۖ᩻᩻;->֨:Ljava/lang/Object;

    move-object/from16 v1, p14

    .line 154
    iput-object v1, v0, Ll/ۖ᩻᩻;->ۘ:Ll/ܿ᩵ܿ;

    move/from16 v1, p15

    .line 155
    iput-boolean v1, v0, Ll/ۖ᩻᩻;->ۖ:Z

    move/from16 v1, p16

    .line 156
    iput-boolean v1, v0, Ll/ۖ᩻᩻;->ۡ:Z

    move-object/from16 v1, p18

    .line 157
    iput-object v1, v0, Ll/ۖ᩻᩻;->ܽ:Ll/᩻᩻᩻;

    return-void
.end method

.method public static ֫(J)Ljava/lang/String;
    .locals 5

    const-wide/16 v0, 0x400

    cmp-long v2, p0, v0

    if-gez v2, :cond_0

    .line 393
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, "B"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-wide/32 v0, 0x100000

    const/4 v2, 0x0

    const/4 v3, 0x1

    cmp-long v4, p0, v0

    if-gez v4, :cond_1

    long-to-double p0, p0

    const-wide/high16 v0, 0x4090000000000000L    # 1024.0

    div-double/2addr p0, v0

    .line 395
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    new-array p1, v3, [Ljava/lang/Object;

    aput-object p0, p1, v2

    const-string p0, "%.2fKB"

    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const-wide/32 v0, 0x40000000

    cmp-long v4, p0, v0

    if-gez v4, :cond_2

    long-to-double p0, p0

    const-wide/high16 v0, 0x4130000000000000L    # 1048576.0

    div-double/2addr p0, v0

    .line 397
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    new-array p1, v3, [Ljava/lang/Object;

    aput-object p0, p1, v2

    const-string p0, "%.2fMB"

    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    long-to-double p0, p0

    const-wide/high16 v0, 0x41d0000000000000L    # 1.073741824E9

    div-double/2addr p0, v0

    .line 399
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    new-array p1, v3, [Ljava/lang/Object;

    aput-object p0, p1, v2

    const-string p0, "%.2fGB"

    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private ֫()V
    .locals 4

    .line 361
    iget-boolean v0, p0, Ll/ۖ᩻᩻;->᩵:Z

    if-nez v0, :cond_0

    goto :goto_2

    .line 365
    :cond_0
    iget-boolean v0, p0, Ll/ۖ᩻᩻;->ۖ:Z

    iget-object v1, p0, Ll/ۖ᩻᩻;->۠:Ll/ܶ᩵ܿ;

    if-eqz v0, :cond_3

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 367
    iget-boolean v0, p0, Ll/ۖ᩻᩻;->ۡ:Z

    if-eqz v0, :cond_1

    .line 368
    new-instance v0, Ll/ܺ᩻᩻;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1, v0}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܿۖ᩷;)Z

    move-result v0

    goto :goto_0

    .line 369
    :cond_1
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۬()Z

    move-result v0

    :goto_0
    if-nez v0, :cond_3

    .line 370
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    .line 371
    :cond_2
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unable to replace target file: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v1, v2}, Ll/ۘ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    .line 371
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 375
    :cond_3
    :goto_1
    iget-object v0, p0, Ll/ۖ᩻᩻;->ܿ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v0

    if-eqz v0, :cond_4

    :goto_2
    return-void

    .line 376
    :cond_4
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unable to rename file to target: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v1, v2}, Ll/ۘ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    .line 376
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private declared-synchronized ֫(Z)V
    .locals 7

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 273
    :try_start_0
    iget-boolean v1, p0, Ll/ۖ᩻᩻;->ᩳ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    .line 274
    monitor-exit v0

    return-void

    :cond_0
    const/4 v2, 0x1

    .line 276
    :try_start_1
    iput-boolean v2, p0, Ll/ۖ᩻᩻;->ᩳ:Z

    .line 277
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 279
    iget-object v1, p0, Ll/ۖ᩻᩻;->ܺ:Ll/᩻ۖܽ;

    monitor-enter v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 280
    :try_start_2
    iget-object v3, p0, Ll/ۖ᩻᩻;->ܺ:Ll/᩻ۖܽ;

    invoke-static {v3}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 281
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v1, 0x0

    if-nez p1, :cond_1

    .line 283
    :try_start_3
    iget-object p1, p0, Ll/ۖ᩻᩻;->᩻:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_1

    iget-object p1, p0, Ll/ۖ᩻᩻;->ܳ:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v3

    iget-wide v5, p0, Ll/ۖ᩻᩻;->ۜ:J

    cmp-long p1, v3, v5

    if-ltz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 284
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v2, :cond_4

    .line 289
    :try_start_4
    invoke-direct {p0}, Ll/ۖ᩻᩻;->֫()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 295
    :try_start_5
    iget-object v2, p0, Ll/ۖ᩻᩻;->᩻:Ljava/util/concurrent/atomic/AtomicReference;

    :cond_2
    const/4 v3, 0x0

    .line 0
    invoke-virtual {v2, v3, p1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 384
    :goto_1
    iget-object p1, p0, Ll/ۖ᩻᩻;->ܿ:Ll/ܶ᩵ܿ;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۬()Z

    goto :goto_3

    :cond_4
    iget-object p1, p0, Ll/ۖ᩻᩻;->ܿ:Ll/ܶ᩵ܿ;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۬()Z

    :goto_2
    move v1, v2

    .line 326
    :goto_3
    iget-object p1, p0, Ll/ۖ᩻᩻;->ܽ:Ll/᩻᩻᩻;

    if-eqz p1, :cond_5

    .line 327
    invoke-interface {p1, p0, v1}, Ll/᩻᩻᩻;->֫(Ll/ۖ᩻᩻;Z)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 329
    :cond_5
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 281
    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    throw p1
.end method


# virtual methods
.method public final declared-synchronized ֫(Ll/֫᩵ܿ;)V
    .locals 8

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 101
    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    .line 102
    iget-wide v3, p0, Ll/ۖ᩻᩻;->ۢ:J

    sub-long v3, v1, v3

    const-wide/16 v5, 0xbb8

    cmp-long v7, v3, v5

    if-ltz v7, :cond_0

    sget-object v3, Ll/ۖ᩻᩻;->᩸:Ll/ۡۤۡ;

    invoke-virtual {v3}, Ll/ۡۤۡ;->֫()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 103
    iget-object v3, p0, Ll/ۖ᩻᩻;->ۧ:Ljava/lang/ThreadLocal;

    iget-object v4, p0, Ll/ۖ᩻᩻;->ᩴ:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 104
    invoke-virtual {p1}, Ll/֫᩵ܿ;->᩷֫()V

    .line 105
    iput-wide v1, p0, Ll/ۖ᩻᩻;->ۢ:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Ll/ۡ᩻᩻;Z)V
    .locals 10

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 201
    :try_start_0
    iget-object v1, p0, Ll/ۖ᩻᩻;->֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v1

    .line 202
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 203
    iget-wide v4, p1, Ll/ۡ᩻᩻;->ۢ:J

    sub-long/2addr v2, v4

    long-to-double v2, v2

    const-wide v4, 0x408f400000000000L    # 1000.0

    div-double/2addr v2, v4

    .line 205
    iget-object v4, p1, Ll/ۡ᩻᩻;->֫:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v4

    iget-wide v6, p1, Ll/ۡ᩻᩻;->᩷:J

    sub-long/2addr v4, v6

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    cmpl-double p1, v2, v6

    if-lez p1, :cond_0

    long-to-double v4, v4

    div-double/2addr v4, v2

    double-to-long v2, v4

    goto :goto_0

    :cond_0
    move-wide v2, v8

    :goto_0
    cmp-long p1, v2, v8

    if-lez p1, :cond_1

    .line 207
    invoke-static {v2, v3}, Ll/ۖ᩻᩻;->֫(J)Ljava/lang/String;

    :cond_1
    if-nez v1, :cond_2

    .line 237
    invoke-direct {p0, p2}, Ll/ۖ᩻᩻;->֫(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 239
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
