.class public final Ll/ܽۚۜ;
.super Ljava/lang/Object;
.source "Q8FL"

# interfaces
.implements Ll/ܶ۠֫;
.implements Ll/֫۟ۜ;


# static fields
.field public static final ܳ֫:Ll/ܶ᩵ܿ;

.field public static final ܿ֫:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field public ֫֫:Z

.field public final ۗ:Ll/᩻۬ۜ;

.field public volatile ۙ:I

.field public ۛ:Ll/ۛۢᩴ;

.field public volatile ۟:Z

.field public ۤ:Ljava/io/IOException;

.field public final ۧ֫:Ll/ܶ᩵ܿ;

.field public final ۨ:Ljava/util/HashMap;

.field public ۫:Ll/۟֡ۜ;

.field public final ۬:Ll/ᩳۚۜ;

.field public final ܰ:Ll/ۧۚۜ;

.field public final ܽ֫:Ll/ܰܺܳ;

.field public final ᩳ֫:Ljava/lang/String;

.field public final ᩶:Ll/ۗܺ᩷;

.field public ᩸:Ljava/lang/String;

.field public volatile ᩹:I

.field public final ᩺:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 59
    sget-object v0, Ll/ܽ֡ܿ;->ۧ:Ll/ܶ᩵ܿ;

    const-string v1, ".media"

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    sput-object v0, Ll/ܽۚۜ;->ܳ֫:Ll/ܶ᩵ܿ;

    .line 60
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Ll/ܽۚۜ;->ܿ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public constructor <init>(Ll/ۤۤۜ;Ll/ܰܺܳ;Ll/ᩳۚۜ;Ll/ۧۚۜ;Ll/᩻۬ۜ;)V
    .locals 1

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Ll/ܽۚۜ;->᩺:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 70
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܽۚۜ;->ۨ:Ljava/util/HashMap;

    .line 76
    sget-object v0, Ll/۟֡ۜ;->۬:Ll/۟֡ۜ;

    iput-object v0, p0, Ll/ܽۚۜ;->۫:Ll/۟֡ۜ;

    .line 102
    iput-object p1, p0, Ll/ܽۚۜ;->᩶:Ll/ۗܺ᩷;

    .line 103
    iput-object p2, p0, Ll/ܽۚۜ;->ܽ֫:Ll/ܰܺܳ;

    .line 104
    iput-object p3, p0, Ll/ܽۚۜ;->۬:Ll/ᩳۚۜ;

    .line 105
    iput-object p4, p0, Ll/ܽۚۜ;->ܰ:Ll/ۧۚۜ;

    .line 106
    iput-object p5, p0, Ll/ܽۚۜ;->ۗ:Ll/᩻۬ۜ;

    .line 107
    instance-of p1, p2, Ll/ۖۧ᩻;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 108
    iput-object p1, p0, Ll/ܽۚۜ;->ۧ֫:Ll/ܶ᩵ܿ;

    const-string p1, "local"

    .line 109
    iput-object p1, p0, Ll/ܽۚۜ;->ᩳ֫:Ljava/lang/String;

    return-void

    .line 111
    :cond_0
    invoke-static {}, Ll/ܳۤۡ;->֫()Ljava/security/MessageDigest;

    move-result-object p1

    .line 112
    invoke-virtual {p2, p1}, Ll/ܰܺܳ;->֫(Ljava/security/MessageDigest;)V

    .line 113
    invoke-virtual {p1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p1

    invoke-static {p1}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object p1

    const/4 p3, 0x0

    const/16 p4, 0x8

    invoke-virtual {p1, p3, p4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ܽۚۜ;->ᩳ֫:Ljava/lang/String;

    .line 114
    sget-object p3, Ll/ܽۚۜ;->ܳ֫:Ll/ܶ᩵ܿ;

    invoke-virtual {p3, p1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 115
    instance-of p2, p2, Ll/ۗۢ᩻;

    if-eqz p2, :cond_1

    .line 116
    iput-object p1, p0, Ll/ܽۚۜ;->ۧ֫:Ll/ܶ᩵ܿ;

    return-void

    .line 127
    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object p3, Ll/ܽۚۜ;->ܿ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "-"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide p3

    invoke-static {p3, p4}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 118
    invoke-virtual {p1, p2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    iput-object p1, p0, Ll/ܽۚۜ;->ۧ֫:Ll/ܶ᩵ܿ;

    return-void
.end method

.method public static ֫(Ll/ܽۚۜ;Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    move-object v1, p1

    :goto_0
    if-eqz v1, :cond_1

    .line 522
    instance-of v0, v1, Ll/ۛ᩹ۘ;

    if-eqz v0, :cond_0

    move-object v0, p0

    .line 523
    monitor-enter v0

    .line 524
    :try_start_0
    sget-object v1, Ll/۟֡ۜ;->ۗ:Ll/۟֡ۜ;

    iput-object v1, p0, Ll/ܽۚۜ;->۫:Ll/۟֡ۜ;

    const/4 v1, 0x0

    .line 525
    iput-object v1, p0, Ll/ܽۚۜ;->ۤ:Ljava/io/IOException;

    .line 526
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 527
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 528
    new-instance p0, Ll/᩹᩶ۜ;

    const-string v0, "Network storage does not support HLS range requests"

    .line 17
    invoke-direct {p0, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object p0

    :catchall_0
    move-exception p0

    .line 527
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    .line 530
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    goto :goto_0

    :cond_1
    return-object p1
.end method

.method private ֫(Ll/ܶ᩵ܿ;Ll/ᩳۜܳ;Ljava/lang/String;)Ll/֫ۚۜ;
    .locals 8

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    .line 305
    :goto_1
    iget-boolean v2, p0, Ll/ܽۚۜ;->۟:Z

    if-nez v2, :cond_d

    .line 308
    iget-object v2, p0, Ll/ܽۚۜ;->ۨ:Ljava/util/HashMap;

    invoke-virtual {v2, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫ۚۜ;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_b

    .line 310
    iget-boolean v5, v2, Ll/֫ۚۜ;->ᩳ:Z

    if-eqz v5, :cond_0

    .line 311
    iget v1, v2, Ll/֫ۚۜ;->ܿ:I

    add-int/2addr v1, v4

    iput v1, v2, Ll/֫ۚۜ;->ܿ:I

    .line 313
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 318
    iget v1, v2, Ll/֫ۚۜ;->ܿ:I

    sub-int/2addr v1, v4

    iput v1, v2, Ll/֫ۚۜ;->ܿ:I

    const/4 v1, 0x1

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 315
    :catch_0
    :try_start_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 316
    new-instance p1, Ljava/io/InterruptedIOException;

    const-string p2, "Interrupted while waiting for media cache"

    invoke-direct {p1, p2}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 318
    :goto_2
    iget p2, v2, Ll/֫ۚۜ;->ܿ:I

    sub-int/2addr p2, v4

    iput p2, v2, Ll/֫ۚۜ;->ܿ:I

    .line 319
    throw p1

    .line 323
    :cond_0
    iget-boolean v4, v2, Ll/֫ۚۜ;->ܽ:Z

    if-eqz v4, :cond_2

    .line 324
    invoke-direct {p0, p2, p1}, Ll/ܽۚۜ;->֫(Ll/ᩳۜܳ;Ll/ܶ᩵ܿ;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v3

    .line 327
    :cond_1
    iget-object v1, p0, Ll/ܽۚۜ;->ۨ:Ljava/util/HashMap;

    invoke-virtual {v1, p3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 328
    :cond_2
    iget-object v3, v2, Ll/֫ۚۜ;->ۧ:Ljava/io/IOException;

    if-eqz v3, :cond_6

    if-nez v1, :cond_4

    .line 330
    iget v1, v2, Ll/֫ۚۜ;->ܿ:I

    if-lez v1, :cond_3

    goto :goto_3

    .line 336
    :cond_3
    iget-object v1, p0, Ll/ܽۚۜ;->ۨ:Ljava/util/HashMap;

    invoke-virtual {v1, p3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 331
    :cond_4
    :goto_3
    iget p1, v2, Ll/֫ۚۜ;->ܿ:I

    if-nez p1, :cond_5

    .line 332
    iget-object p1, p0, Ll/ܽۚۜ;->ۨ:Ljava/util/HashMap;

    invoke-virtual {p1, p3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    :cond_5
    throw v3

    .line 337
    :cond_6
    iget-boolean v3, v2, Ll/֫ۚۜ;->֫:Z

    if-eqz v3, :cond_a

    if-nez v1, :cond_8

    .line 338
    iget v1, v2, Ll/֫ۚۜ;->ܿ:I

    if-lez v1, :cond_7

    goto :goto_4

    .line 344
    :cond_7
    iget-object v1, p0, Ll/ܽۚۜ;->ۨ:Ljava/util/HashMap;

    invoke-virtual {v1, p3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 339
    :cond_8
    :goto_4
    iget p1, v2, Ll/֫ۚۜ;->ܿ:I

    if-nez p1, :cond_9

    .line 340
    iget-object p1, p0, Ll/ܽۚۜ;->ۨ:Ljava/util/HashMap;

    invoke-virtual {p1, p3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    :cond_9
    new-instance p1, Ll/ۘ֡ۜ;

    invoke-interface {p2}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object p2

    .line 15
    invoke-direct {p1, p2}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 342
    throw p1

    .line 346
    :cond_a
    iget-object v1, p0, Ll/ܽۚۜ;->ۨ:Ljava/util/HashMap;

    invoke-virtual {v1, p3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 819
    :cond_b
    invoke-interface {p2}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v1

    const-wide/16 v5, 0x0

    cmp-long v7, v1, v5

    if-lez v7, :cond_c

    invoke-direct {p0, p2, p1}, Ll/ܽۚۜ;->֫(Ll/ᩳۜܳ;Ll/ܶ᩵ܿ;)Z

    move-result p1

    if-eqz p1, :cond_c

    .line 352
    new-instance p1, Ll/֫ۚۜ;

    invoke-direct {p1, v0}, Ll/֫ۚۜ;-><init>(I)V

    .line 353
    iput-boolean v4, p1, Ll/֫ۚۜ;->ܽ:Z

    .line 354
    iget-object p2, p0, Ll/ܽۚۜ;->ۨ:Ljava/util/HashMap;

    invoke-virtual {p2, p3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v3

    .line 357
    :cond_c
    new-instance p1, Ll/֫ۚۜ;

    invoke-direct {p1, v0}, Ll/֫ۚۜ;-><init>(I)V

    .line 358
    iput-boolean v4, p1, Ll/֫ۚۜ;->ᩳ:Z

    .line 359
    iget-object p2, p0, Ll/ܽۚۜ;->ۨ:Ljava/util/HashMap;

    invoke-virtual {p2, p3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1

    .line 306
    :cond_d
    new-instance p1, Ll/ۘ֡ۜ;

    invoke-interface {p2}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object p2

    .line 15
    invoke-direct {p1, p2}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 306
    throw p1
.end method

.method public static bridge synthetic ֫(Ll/ܽۚۜ;)Ll/ۛۢᩴ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܽۚۜ;->ۛ:Ll/ۛۢᩴ;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ܽۚۜ;Ll/ᩳۜܳ;Ljava/lang/String;)Ll/ܰ᩻᩻;
    .locals 1

    const/4 v0, 0x1

    .line 0
    invoke-direct {p0, p1, p2, v0}, Ll/ܽۚۜ;->֫(Ll/ᩳۜܳ;Ljava/lang/String;Z)Ll/ܰ᩻᩻;

    move-result-object p0

    return-object p0
.end method

.method private ֫(Ll/ᩳۜܳ;Ljava/lang/String;Z)Ll/ܰ᩻᩻;
    .locals 10

    .line 829
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_7

    iget-object v0, p0, Ll/ܽۚۜ;->ܽ֫:Ll/ܰܺܳ;

    instance-of v1, v0, Ll/ۗۢ᩻;

    if-eqz v1, :cond_7

    move-object v1, v0

    check-cast v1, Ll/ۗۢ᩻;

    move-object v0, p0

    .line 832
    monitor-enter v0

    .line 833
    :try_start_0
    iget-boolean v2, p0, Ll/ܽۚۜ;->۟:Z

    if-nez v2, :cond_6

    .line 836
    iget-object v2, p0, Ll/ܽۚۜ;->۫:Ll/۟֡ۜ;

    sget-object v3, Ll/۟֡ۜ;->ۙ:Ll/۟֡ۜ;

    if-eq v2, v3, :cond_1

    .line 837
    iget-object p1, p0, Ll/ܽۚۜ;->ۤ:Ljava/io/IOException;

    if-nez p1, :cond_0

    .line 838
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Network range cache is not ready"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 839
    :cond_0
    throw p1

    :cond_1
    const v2, 0x7f0a03e0

    .line 841
    invoke-interface {p1, v2}, Ll/ᩳۜܳ;->ۜ(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/ref/WeakReference;

    if-eqz v4, :cond_4

    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 842
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ll/ܰ᩻᩻;

    if-eqz v4, :cond_4

    check-cast v3, Ll/ܰ᩻᩻;

    .line 843
    invoke-virtual {v3}, Ll/ܰ᩻᩻;->᩻()Z

    move-result v4

    if-eqz v4, :cond_3

    if-eqz p3, :cond_2

    .line 845
    iput-object p2, p0, Ll/ܽۚۜ;->᩸:Ljava/lang/String;

    .line 847
    :cond_2
    monitor-exit v0

    return-object v3

    :cond_3
    const/4 v3, 0x0

    .line 849
    invoke-interface {p1, v2, v3}, Ll/ᩳۜܳ;->ۧ(ILjava/lang/Object;)V

    .line 851
    :cond_4
    new-instance v9, Ll/ܰ᩻᩻;

    new-instance v4, Ll/ܶ֡ۜ;

    invoke-direct {v4, v1, p1}, Ll/ܶ֡ۜ;-><init>(Ll/ۗۢ᩻;Ll/ᩳۜܳ;)V

    .line 853
    invoke-interface {p1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v5

    .line 854
    invoke-interface {p1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v6

    .line 806
    iget-object v1, p0, Ll/ܽۚۜ;->ۧ֫:Ll/ܶ᩵ܿ;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, ".page"

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v8

    move-object v3, v9

    .line 855
    invoke-direct/range {v3 .. v8}, Ll/ܰ᩻᩻;-><init>(Ll/ܶ֡ۜ;Ljava/lang/String;JLl/ܶ᩵ܿ;)V

    .line 857
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v9}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {p1, v2, v1}, Ll/ᩳۜܳ;->ۧ(ILjava/lang/Object;)V

    if-eqz p3, :cond_5

    .line 859
    iput-object p2, p0, Ll/ܽۚۜ;->᩸:Ljava/lang/String;

    .line 861
    :cond_5
    monitor-exit v0

    return-object v9

    .line 834
    :cond_6
    new-instance p2, Ll/ۘ֡ۜ;

    invoke-interface {p1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object p1

    .line 15
    invoke-direct {p2, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 834
    throw p2

    :catchall_0
    move-exception p1

    .line 862
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 830
    :cond_7
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Network range cache is not available"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ll/ܽۚۜ;Ljava/lang/String;)Ll/ܶ᩵ܿ;
    .locals 0

    .line 798
    iget-object p0, p0, Ll/ܽۚۜ;->ۧ֫:Ll/ܶ᩵ܿ;

    invoke-virtual {p0, p1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    return-object p0
.end method

.method private ֫(I)V
    .locals 2

    if-eqz p1, :cond_0

    .line 170
    iget v0, p0, Ll/ܽۚۜ;->ۙ:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    .line 171
    iput p1, p0, Ll/ܽۚۜ;->ۙ:I

    .line 172
    iget-object p1, p0, Ll/ܽۚۜ;->ۛ:Ll/ۛۢᩴ;

    if-eqz p1, :cond_0

    .line 174
    new-instance v0, Ll/ܰ֨ۡ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0, p1}, Ll/ܰ֨ۡ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method private ֫(Ljava/lang/String;Ll/֫ۚۜ;Ljava/io/IOException;Z)V
    .locals 4

    move-object v0, p0

    .line 371
    monitor-enter v0

    .line 372
    :try_start_0
    iget-object v1, p0, Ll/ܽۚۜ;->ۨ:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֫ۚۜ;

    if-ne p1, p2, :cond_3

    const/4 p1, 0x0

    .line 374
    iput-boolean p1, p2, Ll/֫ۚۜ;->ᩳ:Z

    .line 375
    iget-boolean v1, p0, Ll/ܽۚۜ;->۟:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_2

    if-nez p4, :cond_2

    instance-of p4, p3, Ll/ۘ֡ۜ;

    if-eqz p4, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p3, :cond_1

    .line 380
    iput-object p3, p2, Ll/֫ۚۜ;->ۧ:Ljava/io/IOException;

    .line 381
    iput-boolean p1, p2, Ll/֫ۚۜ;->֫:Z

    .line 382
    iput-boolean p1, p2, Ll/֫ۚۜ;->ܽ:Z

    goto :goto_1

    .line 384
    :cond_1
    iput-boolean v3, p2, Ll/֫ۚۜ;->ܽ:Z

    .line 385
    iput-object v2, p2, Ll/֫ۚۜ;->ۧ:Ljava/io/IOException;

    .line 386
    iput-boolean p1, p2, Ll/֫ۚۜ;->֫:Z

    goto :goto_1

    .line 376
    :cond_2
    :goto_0
    iput-boolean v3, p2, Ll/֫ۚۜ;->֫:Z

    .line 377
    iput-object v2, p2, Ll/֫ۚۜ;->ۧ:Ljava/io/IOException;

    .line 378
    iput-boolean p1, p2, Ll/֫ۚۜ;->ܽ:Z

    .line 388
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 390
    :cond_3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public static ֫(Ll/ܽۚۜ;II)V
    .locals 2

    .line 199
    invoke-direct {p0, p1}, Ll/ܽۚۜ;->ۧ(I)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 202
    :cond_0
    iget-object v0, p0, Ll/ܽۚۜ;->ۛ:Ll/ۛۢᩴ;

    if-eqz v0, :cond_1

    .line 204
    new-instance v1, Ll/᩸֡ۜ;

    invoke-direct {v1, p0, p1, v0, p2}, Ll/᩸֡ۜ;-><init>(Ll/ܽۚۜ;ILl/ۛۢᩴ;I)V

    invoke-static {v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static synthetic ֫(Ll/ܽۚۜ;ILl/ۛۢᩴ;)V
    .locals 0

    .line 191
    iget p0, p0, Ll/ܽۚۜ;->ۙ:I

    if-ne p0, p1, :cond_0

    const/4 p0, -0x1

    .line 192
    invoke-interface {p2, p0}, Ljava/util/function/IntConsumer;->accept(I)V

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/ܽۚۜ;ILl/ۛۢᩴ;I)V
    .locals 0

    .line 205
    invoke-direct {p0, p1}, Ll/ܽۚۜ;->ۧ(I)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 206
    invoke-interface {p2, p3}, Ljava/util/function/IntConsumer;->accept(I)V

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/ܽۚۜ;Ll/ۛۢᩴ;)V
    .locals 0

    .line 175
    iget p0, p0, Ll/ܽۚۜ;->ۙ:I

    if-nez p0, :cond_0

    const/4 p0, -0x2

    .line 176
    invoke-interface {p1, p0}, Ljava/util/function/IntConsumer;->accept(I)V

    :cond_0
    return-void
.end method

.method public static ֫(Ll/ܽۚۜ;Ll/ᩳۜܳ;)V
    .locals 1

    .line 509
    iget-object v0, p0, Ll/ܽۚۜ;->ܽ֫:Ll/ܰܺܳ;

    instance-of v0, v0, Ll/ۗۢ᩻;

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 510
    invoke-direct {p0, p1, v0}, Ll/ܽۚۜ;->֫(Ll/ᩳۜܳ;Z)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    .line 511
    :cond_0
    new-instance p0, Ll/᩹᩶ۜ;

    const-string p1, "Network storage does not support HLS range requests"

    .line 13
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 511
    throw p0

    :cond_1
    :goto_0
    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܽۚۜ;I)Z
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ܽۚۜ;->ۧ(I)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic ֫(Ll/ܽۚۜ;Ll/ᩳۜܳ;Ll/ܶ᩵ܿ;)Z
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Ll/ܽۚۜ;->֫(Ll/ᩳۜܳ;Ll/ܶ᩵ܿ;)Z

    move-result p0

    return p0
.end method

.method private ֫(Ll/ᩳۜܳ;Ll/ܶ᩵ܿ;)Z
    .locals 8

    .line 810
    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-lez v0, :cond_0

    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v2

    invoke-interface {p1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-eqz v0, :cond_0

    goto :goto_4

    .line 814
    :cond_0
    iget-object v0, p0, Ll/ܽۚۜ;->ܽ֫:Ll/ܰܺܳ;

    instance-of v0, v0, Ll/ۗۢ᩻;

    if-eqz v0, :cond_4

    .line 815
    invoke-interface {p1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v2

    .line 144
    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v4

    const-wide/16 v6, 0xc

    cmp-long p1, v4, v6

    if-gez p1, :cond_1

    goto :goto_2

    :cond_1
    :try_start_0
    const-string p1, "r"

    .line 147
    invoke-virtual {p2, p1}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 148
    :try_start_1
    invoke-virtual {p1}, Ll/᩻ۖܽ;->readInt()I

    move-result p2

    const v0, 0x15632185

    if-ne p2, v0, :cond_2

    invoke-virtual {p1}, Ll/᩻ۖܽ;->readLong()J

    move-result-wide v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmp-long p2, v4, v2

    if-nez p2, :cond_2

    const/4 p2, 0x1

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    .line 149
    :goto_0
    :try_start_2
    invoke-virtual {p1}, Ll/᩻ۖܽ;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_3

    :catchall_0
    move-exception p2

    .line 147
    :try_start_3
    invoke-virtual {p1}, Ll/᩻ۖܽ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p2
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    :cond_3
    :goto_2
    const/4 p2, 0x0

    :goto_3
    if-nez p2, :cond_5

    :cond_4
    const/4 v1, 0x1

    :cond_5
    :goto_4
    return v1
.end method

.method private ֫(Ll/ᩳۜܳ;Z)Z
    .locals 4

    const/4 v1, 0x0

    if-nez p2, :cond_0

    .line 441
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x17

    if-lt p2, v0, :cond_b

    .line 442
    :cond_0
    iget-object p2, p0, Ll/ܽۚۜ;->ܽ֫:Ll/ܰܺܳ;

    instance-of v0, p2, Ll/ۗۢ᩻;

    if-eqz v0, :cond_b

    check-cast p2, Ll/ۗۢ᩻;

    move-object v0, p0

    .line 446
    monitor-enter v0

    .line 448
    :goto_0
    :try_start_0
    iget-boolean v2, p0, Ll/ܽۚۜ;->۟:Z

    if-nez v2, :cond_a

    .line 451
    iget-object v2, p0, Ll/ܽۚۜ;->۫:Ll/۟֡ۜ;

    sget-object v3, Ll/۟֡ۜ;->ۙ:Ll/۟֡ۜ;

    if-ne v2, v3, :cond_1

    const/4 p1, 0x1

    .line 452
    monitor-exit v0

    return p1

    .line 454
    :cond_1
    sget-object v3, Ll/۟֡ۜ;->ۗ:Ll/۟֡ۜ;

    if-ne v2, v3, :cond_2

    .line 455
    monitor-exit v0

    return v1

    .line 457
    :cond_2
    sget-object v3, Ll/۟֡ۜ;->᩹:Ll/۟֡ۜ;

    if-ne v2, v3, :cond_4

    .line 458
    iget-object p1, p0, Ll/ܽۚۜ;->ۤ:Ljava/io/IOException;

    if-nez p1, :cond_3

    .line 459
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Network range support probe failed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 460
    :cond_3
    throw p1

    .line 462
    :cond_4
    sget-object v3, Ll/۟֡ۜ;->᩶:Ll/۟֡ۜ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-ne v2, v3, :cond_5

    .line 464
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    .line 466
    :catch_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 467
    new-instance p1, Ljava/io/InterruptedIOException;

    const-string p2, "Interrupted while probing network range support"

    invoke-direct {p1, p2}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 471
    :cond_5
    iput-object v3, p0, Ll/ܽۚۜ;->۫:Ll/۟֡ۜ;

    .line 475
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const/4 v2, 0x0

    .line 482
    :try_start_3
    invoke-virtual {p2}, Ll/ۗۢ᩻;->ۙ()Z

    move-result v1
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    move-object p2, v2

    goto :goto_1

    :catch_1
    move-exception p2

    :goto_1
    move-object v0, p0

    .line 486
    monitor-enter v0

    .line 487
    :try_start_4
    iget-boolean v3, p0, Ll/ܽۚۜ;->۟:Z

    if-nez v3, :cond_9

    .line 493
    iput-object p2, p0, Ll/ܽۚۜ;->ۤ:Ljava/io/IOException;

    if-eqz p2, :cond_6

    .line 495
    sget-object p1, Ll/۟֡ۜ;->᩹:Ll/۟֡ۜ;

    goto :goto_2

    :cond_6
    if-eqz v1, :cond_7

    .line 496
    sget-object p1, Ll/۟֡ۜ;->ۙ:Ll/۟֡ۜ;

    goto :goto_2

    :cond_7
    sget-object p1, Ll/۟֡ۜ;->ۗ:Ll/۟֡ۜ;

    :goto_2
    iput-object p1, p0, Ll/ܽۚۜ;->۫:Ll/۟֡ۜ;

    .line 497
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 498
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez p2, :cond_8

    return v1

    .line 500
    :cond_8
    throw p2

    .line 488
    :cond_9
    :try_start_5
    sget-object p2, Ll/۟֡ۜ;->۬:Ll/۟֡ۜ;

    iput-object p2, p0, Ll/ܽۚۜ;->۫:Ll/۟֡ۜ;

    .line 489
    iput-object v2, p0, Ll/ܽۚۜ;->ۤ:Ljava/io/IOException;

    .line 490
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 491
    new-instance p2, Ll/ۘ֡ۜ;

    invoke-interface {p1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object p1

    .line 15
    invoke-direct {p2, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 491
    throw p2

    :catchall_0
    move-exception p1

    .line 498
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p1

    .line 449
    :cond_a
    :try_start_6
    new-instance p2, Ll/ۘ֡ۜ;

    invoke-interface {p1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object p1

    .line 15
    invoke-direct {p2, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 449
    throw p2

    :catchall_1
    move-exception p1

    .line 475
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw p1

    :cond_b
    return v1
.end method

.method private ۜ(Ll/ᩳۜܳ;)Ll/ۙ᩶ۜ;
    .locals 10

    .line 943
    iget-object v0, p0, Ll/ܽۚۜ;->ۗ:Ll/᩻۬ۜ;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ll/᩻۬ۜ;->᩻()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-ltz v5, :cond_5

    .line 946
    iget-object v1, p0, Ll/ܽۚۜ;->ܽ֫:Ll/ܰܺܳ;

    invoke-virtual {v0}, Ll/᩻۬ۜ;->ܳ()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, p1, v2}, Ll/᩷۬ۜ;->֫(Ll/ܰܺܳ;Ll/ᩳۜܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 947
    invoke-virtual {v0}, Ll/᩻۬ۜ;->ᩳ()Ll/ܺ᩸֫;

    move-result-object v2

    const/4 v9, 0x0

    if-eqz v2, :cond_0

    .line 948
    invoke-virtual {v0}, Ll/᩻۬ۜ;->ᩳ()Ll/ܺ᩸֫;

    move-result-object v3

    const-wide/16 v5, 0x0

    invoke-interface {p1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v7

    move-object v4, v1

    invoke-virtual/range {v3 .. v8}, Ll/ܺ᩸֫;->ܳ(Ljava/lang/String;JJ)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 949
    :goto_0
    new-instance v3, Ll/ܳܶۜ;

    invoke-direct {v3, p0}, Ll/ܳܶۜ;-><init>(Ljava/lang/Object;)V

    if-nez v2, :cond_1

    iget-object v2, p0, Ll/ܽۚۜ;->۫:Ll/۟֡ۜ;

    sget-object v4, Ll/۟֡ۜ;->ۙ:Ll/۟֡ۜ;

    if-ne v2, v4, :cond_1

    const/4 v9, 0x1

    .line 124
    :cond_1
    new-instance v2, Ll/ۢۗۜ;

    new-instance v4, Ll/ۜ᩸ܽ;

    invoke-direct {v4, v1}, Ll/ۜ᩸ܽ;-><init>(Ljava/lang/Object;)V

    invoke-direct {v2, v0, v3, v4}, Ll/ۢۗۜ;-><init>(Ll/᩻۬ۜ;Ll/ܶ۠֫;Ll/᩻ۗۜ;)V

    .line 126
    new-instance v4, Ll/ܿۗۜ;

    invoke-direct {v4, v0, v2, v1, v9}, Ll/ܿۗۜ;-><init>(Ll/᩻۬ۜ;Ll/ۢۗۜ;Ljava/lang/String;Z)V

    .line 954
    iget-object v0, p0, Ll/ܽۚۜ;->۬:Ll/ᩳۚۜ;

    invoke-interface {p1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ᩳۚۜ;->֫(Ljava/lang/String;)Ll/ۧ᩵֫;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 955
    iget-object v0, v0, Ll/ۧ᩵֫;->ܽ:Ll/ۨᩴ֫;

    if-nez v0, :cond_2

    goto :goto_1

    .line 956
    :cond_2
    iget-object v0, v0, Ll/ۨᩴ֫;->᩻:Landroid/net/Uri;

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v0, 0x0

    :goto_2
    move-object v5, v0

    if-eqz v5, :cond_4

    .line 960
    new-instance v0, Ll/ۙ᩶ۜ;

    invoke-interface {p1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v7

    move-object v3, v0

    move-object v6, v1

    invoke-direct/range {v3 .. v8}, Ll/ۙ᩶ۜ;-><init>(Ll/ܿۗۜ;Landroid/net/Uri;Ljava/lang/String;J)V

    return-object v0

    .line 958
    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Media URI is missing"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 944
    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Unified preview cache is not available"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ۧ(Ll/ܽۚۜ;I)V
    .locals 2

    .line 184
    invoke-direct {p0, p1}, Ll/ܽۚۜ;->ۧ(I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Ll/ܽۚۜ;->ۙ:I

    if-ne v0, p1, :cond_0

    goto :goto_0

    .line 187
    :cond_0
    iput p1, p0, Ll/ܽۚۜ;->ۙ:I

    .line 188
    iget-object v0, p0, Ll/ܽۚۜ;->ۛ:Ll/ۛۢᩴ;

    if-eqz v0, :cond_1

    .line 190
    new-instance v1, Ll/᩹֡ۜ;

    invoke-direct {v1, p0, p1, v0}, Ll/᩹֡ۜ;-><init>(Ll/ܽۚۜ;ILl/ۛۢᩴ;)V

    invoke-static {v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ܽۚۜ;Ll/ᩳۜܳ;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Ll/ܽۚۜ;->ܽ(Ll/ᩳۜܳ;Ljava/lang/String;)V

    return-void
.end method

.method private ۧ(I)Z
    .locals 1

    if-eqz p1, :cond_0

    .line 163
    iget-boolean v0, p0, Ll/ܽۚۜ;->۟:Z

    if-nez v0, :cond_0

    iget v0, p0, Ll/ܽۚۜ;->᩹:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static bridge synthetic ۧ(Ll/ܽۚۜ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܽۚۜ;->۟:Z

    return p0
.end method

.method public static ۧ(Ll/ܽۚۜ;Ll/ᩳۜܳ;)Z
    .locals 1

    const/4 v0, 0x0

    .line 434
    invoke-direct {p0, p1, v0}, Ll/ܽۚۜ;->֫(Ll/ᩳۜܳ;Z)Z

    move-result p0

    return p0
.end method

.method public static ܳ(Ll/ᩳۜܳ;)Ljava/lang/String;
    .locals 4

    .line 536
    invoke-static {}, Ll/ܳۤۡ;->֫()Ljava/security/MessageDigest;

    move-result-object v0

    .line 537
    invoke-interface {p0}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ܳۤۡ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    const/16 v1, 0x3a

    .line 538
    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update(B)V

    .line 539
    invoke-interface {p0}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/security/MessageDigest;->update([B)V

    .line 540
    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update(B)V

    .line 541
    invoke-interface {p0}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->update([B)V

    .line 542
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    invoke-static {p0}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    const/16 v1, 0x18

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ܽۚۜ;)Ll/ܶ᩵ܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܽۚۜ;->ۧ֫:Ll/ܶ᩵ܿ;

    return-object p0
.end method

.method private ܽ(Ll/ᩳۜܳ;Ljava/lang/String;)V
    .locals 2

    move-object v0, p0

    .line 889
    monitor-enter v0

    .line 898
    :try_start_0
    iget-object v1, p0, Ll/ܽۚۜ;->᩸:Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    .line 899
    iput-object v1, p0, Ll/ܽۚۜ;->᩸:Ljava/lang/String;

    :cond_0
    const p2, 0x7f0a03e0

    .line 901
    invoke-interface {p1, p2, v1}, Ll/ᩳۜܳ;->ۧ(ILjava/lang/Object;)V

    .line 891
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public static ܽ(Ll/ܽۚۜ;Ll/ᩳۜܳ;)Z
    .locals 5

    .line 397
    iget-object v0, p0, Ll/ܽۚۜ;->ۧ֫:Ll/ܶ᩵ܿ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 400
    :cond_0
    invoke-static {p1}, Ll/ܽۚۜ;->ܳ(Ll/ᩳۜܳ;)Ljava/lang/String;

    move-result-object v0

    .line 798
    iget-object v2, p0, Ll/ܽۚۜ;->ۧ֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v2, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    move-object v0, p0

    .line 401
    monitor-enter v0

    .line 402
    :try_start_0
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 403
    monitor-exit v0

    return v1

    .line 405
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 427
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x17

    if-lt v0, v3, :cond_2

    .line 426
    iget-object v0, p0, Ll/ܽۚۜ;->ܽ֫:Ll/ܰܺܳ;

    instance-of v3, v0, Ll/ۗۢ᩻;

    if-eqz v3, :cond_2

    check-cast v0, Ll/ۗۢ᩻;

    .line 427
    invoke-virtual {v0}, Ll/ۗۢ᩻;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p0, 0x1

    return p0

    .line 409
    :cond_2
    :try_start_1
    iget-object v0, p0, Ll/ܽۚۜ;->ܽ֫:Ll/ܰܺܳ;

    iget-object p0, p0, Ll/ܽۚۜ;->᩶:Ll/ۗܺ᩷;

    invoke-virtual {v0, p0, p1}, Ll/ܰܺܳ;->֫(Ll/ۗܺ᩷;Ll/ᩳۜܳ;)Ljava/io/InputStream;

    move-result-object p0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz p0, :cond_3

    .line 413
    :try_start_2
    invoke-interface {p1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v3

    const/4 p1, 0x0

    invoke-virtual {v2, p0, v3, v4, p1}, Ll/ܶ᩵ܿ;->֫(Ljava/io/InputStream;JLl/ۚ᩸ܿ;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 414
    :try_start_3
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    return v1

    .line 411
    :cond_3
    :try_start_4
    new-instance v0, Ll/ۖ֡ۜ;

    invoke-interface {p1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object p1

    .line 15
    invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 411
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catchall_0
    move-exception p1

    if-eqz p0, :cond_4

    .line 409
    :try_start_5
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    :try_start_6
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_0
    throw p1
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0

    :catch_0
    move-exception p0

    .line 415
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->۫()Z

    .line 416
    throw p0

    :catchall_2
    move-exception p0

    .line 405
    :try_start_7
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    throw p0
.end method

.method public static bridge synthetic ܿ(Ll/ᩳۜܳ;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ܽۚۜ;->ܳ(Ll/ᩳۜܳ;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ܽۚۜ;)Ll/ܰܺܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܽۚۜ;->ܽ֫:Ll/ܰܺܳ;

    return-object p0
.end method

.method private ᩻(Ll/ᩳۜܳ;)Ll/۫֡ۜ;
    .locals 10

    .line 566
    invoke-static {p1}, Ll/ܽۚۜ;->ܳ(Ll/ᩳۜܳ;)Ljava/lang/String;

    move-result-object v1

    .line 798
    iget-object v0, p0, Ll/ܽۚۜ;->ۧ֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    move-object v0, p0

    .line 568
    monitor-enter v0

    .line 569
    :try_start_0
    iget-boolean v3, p0, Ll/ܽۚۜ;->۟:Z

    if-eqz v3, :cond_0

    .line 570
    sget-object p1, Ll/۫֡ۜ;->᩷:Ll/۫֡ۜ;

    monitor-exit v0

    return-object p1

    .line 572
    :cond_0
    iget-object v3, p0, Ll/ܽۚۜ;->ۨ:Ljava/util/HashMap;

    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֫ۚۜ;

    if-eqz v3, :cond_3

    .line 574
    iget-boolean v4, v3, Ll/֫ۚۜ;->ᩳ:Z

    if-eqz v4, :cond_1

    .line 575
    sget-object p1, Ll/۫֡ۜ;->᩷:Ll/۫֡ۜ;

    monitor-exit v0

    return-object p1

    .line 577
    :cond_1
    iget-boolean v3, v3, Ll/֫ۚۜ;->ܽ:Z

    if-eqz v3, :cond_3

    .line 578
    invoke-direct {p0, p1, v2}, Ll/ܽۚۜ;->֫(Ll/ᩳۜܳ;Ll/ܶ᩵ܿ;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 581
    invoke-interface {p1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/۫֡ۜ;->֫(Ljava/lang/String;)Z

    move-result p1

    .line 579
    invoke-static {v2, p1}, Ll/۫֡ۜ;->֫(Ll/ܶ᩵ܿ;Z)Ll/۫֡ۜ;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 583
    :cond_2
    iget-object v3, p0, Ll/ܽۚۜ;->ۨ:Ljava/util/HashMap;

    invoke-virtual {v3, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 819
    :cond_3
    invoke-interface {p1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    cmp-long v9, v3, v5

    if-lez v9, :cond_4

    invoke-direct {p0, p1, v2}, Ll/ܽۚۜ;->֫(Ll/ᩳۜܳ;Ll/ܶ᩵ܿ;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, 0x1

    goto :goto_0

    :cond_4
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_5

    .line 587
    new-instance v3, Ll/֫ۚۜ;

    invoke-direct {v3, v7}, Ll/֫ۚۜ;-><init>(I)V

    .line 588
    iput-boolean v8, v3, Ll/֫ۚۜ;->ܽ:Z

    .line 589
    iget-object v4, p0, Ll/ܽۚۜ;->ۨ:Ljava/util/HashMap;

    invoke-virtual {v4, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 592
    invoke-interface {p1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/۫֡ۜ;->֫(Ljava/lang/String;)Z

    move-result p1

    .line 590
    invoke-static {v2, p1}, Ll/۫֡ۜ;->֫(Ll/ܶ᩵ܿ;Z)Ll/۫֡ۜ;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 594
    :cond_5
    sget-object p1, Ll/۫֡ۜ;->᩷:Ll/۫֡ۜ;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 595
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method


# virtual methods
.method public final ֫(Ll/ۗ۠֫;Ll/᩻۬ۜ;)Ljava/lang/String;
    .locals 1

    .line 714
    iget-object p1, p1, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    invoke-virtual {p0, p1}, Ll/ܽۚۜ;->ۧ(Landroid/net/Uri;)Ll/ᩳۜܳ;

    move-result-object p1

    invoke-virtual {p2}, Ll/᩻۬ۜ;->ܳ()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Ll/ܽۚۜ;->ܽ֫:Ll/ܰܺܳ;

    invoke-static {v0, p1, p2}, Ll/᩷۬ۜ;->֫(Ll/ܰܺܳ;Ll/ᩳۜܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Landroid/net/Uri;)Ll/۟ܰۜ;
    .locals 4

    .line 723
    invoke-virtual {p0, p1}, Ll/ܽۚۜ;->ۧ(Landroid/net/Uri;)Ll/ᩳۜܳ;

    move-result-object p1

    .line 724
    iget-object v0, p0, Ll/ܽۚۜ;->ۧ֫:Ll/ܶ᩵ܿ;

    if-nez v0, :cond_0

    .line 725
    new-instance v0, Ll/ۙ֡ۜ;

    invoke-interface {p1}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/ۙ֡ۜ;-><init>(Ll/ܶ᩵ܿ;)V

    return-object v0

    .line 727
    :cond_0
    invoke-static {p1}, Ll/ܽۚۜ;->ܳ(Ll/ᩳۜܳ;)Ljava/lang/String;

    move-result-object v1

    .line 798
    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 729
    invoke-direct {p0, p1, v0}, Ll/ܽۚۜ;->֫(Ll/ᩳۜܳ;Ll/ܶ᩵ܿ;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 730
    invoke-direct {p0, p1, v1}, Ll/ܽۚۜ;->ܽ(Ll/ᩳۜܳ;Ljava/lang/String;)V

    .line 731
    new-instance p1, Ll/ۙ֡ۜ;

    invoke-direct {p1, v0}, Ll/ۙ֡ۜ;-><init>(Ll/ܶ᩵ܿ;)V

    return-object p1

    .line 733
    :cond_1
    iget-object v0, p0, Ll/ܽۚۜ;->ܽ֫:Ll/ܰܺܳ;

    instance-of v0, v0, Ll/ۗۢ᩻;

    const/4 v2, 0x0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 434
    :try_start_0
    invoke-direct {p0, p1, v0}, Ll/ܽۚۜ;->֫(Ll/ᩳۜܳ;Z)Z

    move-result v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v3, :cond_3

    :goto_0
    return-object v2

    .line 745
    :cond_3
    invoke-direct {p0, p1, v1, v0}, Ll/ܽۚۜ;->֫(Ll/ᩳۜܳ;Ljava/lang/String;Z)Ll/ܰ᩻᩻;

    move-result-object p1

    .line 746
    new-instance v0, Ll/ۨ֡ۜ;

    invoke-direct {v0, p1}, Ll/ۨ֡ۜ;-><init>(Ll/ܰ᩻᩻;)V

    return-object v0

    :catch_0
    return-object v2
.end method

.method public final ֫(Ll/ᩳۜܳ;)Ll/۫֡ۜ;
    .locals 11

    .line 550
    iget-object v0, p0, Ll/ܽۚۜ;->ۧ֫:Ll/ܶ᩵ܿ;

    if-nez v0, :cond_0

    .line 552
    invoke-interface {p1}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 553
    invoke-interface {p1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/۫֡ۜ;->֫(Ljava/lang/String;)Z

    move-result p1

    .line 551
    invoke-static {v0, p1}, Ll/۫֡ۜ;->֫(Ll/ܶ᩵ܿ;Z)Ll/۫֡ۜ;

    move-result-object p1

    return-object p1

    .line 555
    :cond_0
    iget-object v0, p0, Ll/ܽۚۜ;->ܽ֫:Ll/ܰܺܳ;

    instance-of v0, v0, Ll/ۗۢ᩻;

    if-eqz v0, :cond_c

    const-string v1, "network:"

    .line 603
    invoke-static {p1}, Ll/ܽۚۜ;->ܳ(Ll/ᩳۜܳ;)Ljava/lang/String;

    move-result-object v2

    .line 798
    iget-object v0, p0, Ll/ܽۚۜ;->ۧ֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v0, v2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    move-object v0, p0

    .line 605
    monitor-enter v0

    .line 606
    :try_start_0
    invoke-direct {p0, p1, v3}, Ll/ܽۚۜ;->֫(Ll/ᩳۜܳ;Ll/ܶ᩵ܿ;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 898
    iget-object v1, p0, Ll/ܽۚۜ;->᩸:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 899
    iput-object v2, p0, Ll/ܽۚۜ;->᩸:Ljava/lang/String;

    :cond_1
    const v1, 0x7f0a03e0

    .line 901
    invoke-interface {p1, v1, v2}, Ll/ᩳۜܳ;->ۧ(ILjava/lang/Object;)V

    .line 610
    invoke-interface {p1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/۫֡ۜ;->֫(Ljava/lang/String;)Z

    move-result p1

    .line 608
    invoke-static {v3, p1}, Ll/۫֡ۜ;->֫(Ll/ܶ᩵ܿ;Z)Ll/۫֡ۜ;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 612
    :cond_2
    iget-boolean v3, p0, Ll/ܽۚۜ;->۟:Z

    if-eqz v3, :cond_3

    .line 613
    sget-object p1, Ll/۫֡ۜ;->᩷:Ll/۫֡ۜ;

    monitor-exit v0

    return-object p1

    .line 615
    :cond_3
    iget-object v3, p0, Ll/ܽۚۜ;->ۨ:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֫ۚۜ;

    if-eqz v3, :cond_7

    .line 617
    iget-boolean v4, v3, Ll/֫ۚۜ;->ᩳ:Z

    if-eqz v4, :cond_4

    .line 618
    sget-object p1, Ll/۫֡ۜ;->᩷:Ll/۫֡ۜ;

    monitor-exit v0

    return-object p1

    .line 620
    :cond_4
    iget-boolean v4, v3, Ll/֫ۚۜ;->ܽ:Z

    if-eqz v4, :cond_5

    .line 621
    iget-object v3, p0, Ll/ܽۚۜ;->ۨ:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 622
    :cond_5
    iget-object v4, v3, Ll/֫ۚۜ;->ۧ:Ljava/io/IOException;

    if-nez v4, :cond_6

    iget-boolean v3, v3, Ll/֫ۚۜ;->֫:Z

    if-eqz v3, :cond_7

    .line 623
    :cond_6
    sget-object p1, Ll/۫֡ۜ;->᩻:Ll/۫֡ۜ;

    monitor-exit v0

    return-object p1

    .line 626
    :cond_7
    :goto_0
    iget-object v3, p0, Ll/ܽۚۜ;->ۗ:Ll/᩻۬ۜ;

    const/16 v4, 0x17

    if-eqz v3, :cond_9

    invoke-virtual {v3}, Ll/᩻۬ۜ;->᩻()Z

    move-result v3

    if-eqz v3, :cond_9

    .line 627
    iget-object v1, p0, Ll/ܽۚۜ;->ܽ֫:Ll/ܰܺܳ;

    iget-object v3, p0, Ll/ܽۚۜ;->ۗ:Ll/᩻۬ۜ;

    invoke-virtual {v3}, Ll/᩻۬ۜ;->ܳ()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, p1, v3}, Ll/᩷۬ۜ;->֫(Ll/ܰܺܳ;Ll/ᩳۜܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 628
    invoke-interface {p1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long v3, v5, v7

    if-ltz v3, :cond_8

    iget-object v3, p0, Ll/ܽۚۜ;->ۗ:Ll/᩻۬ۜ;

    .line 629
    invoke-virtual {v3}, Ll/᩻۬ۜ;->ᩳ()Ll/ܺ᩸֫;

    move-result-object v3

    if-eqz v3, :cond_8

    iget-object v3, p0, Ll/ܽۚۜ;->ۗ:Ll/᩻۬ۜ;

    .line 630
    invoke-virtual {v3}, Ll/᩻۬ۜ;->ᩳ()Ll/ܺ᩸֫;

    move-result-object v5

    invoke-interface {p1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v9

    const-wide/16 v7, 0x0

    move-object v6, v1

    invoke-virtual/range {v5 .. v10}, Ll/ܺ᩸֫;->ܳ(Ljava/lang/String;JJ)Z

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_1

    .line 631
    :cond_8
    iget-object v3, p0, Ll/ܽۚۜ;->۫:Ll/۟֡ۜ;

    sget-object v5, Ll/۟֡ۜ;->ۙ:Ll/۟֡ۜ;

    if-ne v3, v5, :cond_a

    :goto_1
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v3, v4, :cond_a

    .line 633
    new-instance v3, Ll/᩺֡ۜ;

    invoke-direct {v3, p0, p1, v2, v1}, Ll/᩺֡ۜ;-><init>(Ll/ܽۚۜ;Ll/ᩳۜܳ;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v3}, Ll/۫֡ۜ;->֫(Ll/᩺֡ۜ;)Ll/۫֡ۜ;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 639
    :cond_9
    iget-object v3, p0, Ll/ܽۚۜ;->۫:Ll/۟֡ۜ;

    sget-object v5, Ll/۟֡ۜ;->ۙ:Ll/۟֡ۜ;

    if-ne v3, v5, :cond_a

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v3, v4, :cond_a

    .line 641
    new-instance v3, Ll/᩺֡ۜ;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ܽۚۜ;->ᩳ֫:Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, p0, p1, v2, v1}, Ll/᩺֡ۜ;-><init>(Ll/ܽۚۜ;Ll/ᩳۜܳ;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v3}, Ll/۫֡ۜ;->֫(Ll/᩺֡ۜ;)Ll/۫֡ۜ;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 647
    :cond_a
    iget-object p1, p0, Ll/ܽۚۜ;->۫:Ll/۟֡ۜ;

    sget-object v1, Ll/۟֡ۜ;->᩹:Ll/۟֡ۜ;

    if-ne p1, v1, :cond_b

    .line 648
    sget-object p1, Ll/۫֡ۜ;->᩻:Ll/۫֡ۜ;

    monitor-exit v0

    return-object p1

    .line 650
    :cond_b
    sget-object p1, Ll/۫֡ۜ;->᩷:Ll/۫֡ۜ;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 651
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 558
    :cond_c
    invoke-direct {p0, p1}, Ll/ܽۚۜ;->᩻(Ll/ᩳۜܳ;)Ll/۫֡ۜ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ᩳۜܳ;Ljava/lang/String;)Ll/ܰ֡ۜ;
    .locals 2

    .line 909
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_1

    .line 913
    iget-object v0, p0, Ll/ܽۚۜ;->ۗ:Ll/᩻۬ۜ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/᩻۬ۜ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 914
    invoke-direct {p0, p1}, Ll/ܽۚۜ;->ۜ(Ll/ᩳۜܳ;)Ll/ۙ᩶ۜ;

    move-result-object p1

    .line 915
    new-instance p2, Ll/ܰ֡ۜ;

    new-instance v0, Ll/ۛ᩶ۜ;

    invoke-direct {v0, p1}, Ll/ۛ᩶ۜ;-><init>(Ll/۟ܰۜ;)V

    invoke-direct {p2, v0}, Ll/ܰ֡ۜ;-><init>(Landroid/media/MediaDataSource;)V

    return-object p2

    :cond_0
    const/4 v0, 0x0

    .line 917
    invoke-direct {p0, p1, p2, v0}, Ll/ܽۚۜ;->֫(Ll/ᩳۜܳ;Ljava/lang/String;Z)Ll/ܰ᩻᩻;

    move-result-object p1

    .line 919
    :try_start_0
    new-instance p2, Ll/ܰ֡ۜ;

    invoke-virtual {p1}, Ll/ܰ᩻᩻;->֫()Landroid/media/MediaDataSource;

    move-result-object v0

    invoke-direct {p2, v0}, Ll/ܰ֡ۜ;-><init>(Landroid/media/MediaDataSource;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p2

    .line 921
    invoke-virtual {p1}, Ll/ܰ᩻᩻;->close()V

    .line 922
    throw p2

    .line 911
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Network preview data source is not available"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()Ll/᩸۠֫;
    .locals 2

    .line 699
    iget-object v0, p0, Ll/ܽۚۜ;->ܰ:Ll/ۧۚۜ;

    sget-object v1, Ll/ۧۚۜ;->᩹:Ll/ۧۚۜ;

    if-ne v0, v1, :cond_0

    new-instance v0, Ll/ۗ֡ۜ;

    invoke-direct {v0, p0}, Ll/ۗ֡ۜ;-><init>(Ll/ܽۚۜ;)V

    return-object v0

    :cond_0
    new-instance v0, Ll/ۤ֡ۜ;

    invoke-direct {v0, p0}, Ll/ۤ֡ۜ;-><init>(Ll/ܽۚۜ;)V

    return-object v0
.end method

.method public final ֫(Ll/ۛۢᩴ;)V
    .locals 0

    .line 137
    iput-object p1, p0, Ll/ܽۚۜ;->ۛ:Ll/ۛۢᩴ;

    return-void
.end method

.method public final ۧ(Ll/ᩳۜܳ;Ljava/lang/String;)Ll/۟ܰۜ;
    .locals 1

    .line 932
    iget-object v0, p0, Ll/ܽۚۜ;->ۗ:Ll/᩻۬ۜ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/᩻۬ۜ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 933
    invoke-direct {p0, p1}, Ll/ܽۚۜ;->ۜ(Ll/ᩳۜܳ;)Ll/ۙ᩶ۜ;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x0

    .line 935
    invoke-direct {p0, p1, p2, v0}, Ll/ܽۚۜ;->֫(Ll/ᩳۜܳ;Ljava/lang/String;Z)Ll/ܰ᩻᩻;

    move-result-object p1

    .line 936
    new-instance p2, Ll/ۨ֡ۜ;

    invoke-direct {p2, p1}, Ll/ۨ֡ۜ;-><init>(Ll/ܰ᩻᩻;)V

    return-object p2
.end method

.method public final ۧ(Landroid/net/Uri;)Ll/ᩳۜܳ;
    .locals 3

    .line 754
    iget-object v0, p0, Ll/ܽۚۜ;->۬:Ll/ᩳۚۜ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    if-nez p1, :cond_0

    goto :goto_0

    .line 224
    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v2

    .line 212
    invoke-virtual {v0, v2}, Ll/ᩳۚۜ;->֫(Ljava/lang/String;)Ll/ۧ᩵֫;

    move-result-object v0

    if-nez v0, :cond_1

    :goto_0
    move-object v0, v1

    goto :goto_1

    .line 213
    :cond_1
    invoke-static {v0}, Ll/ᩳۚۜ;->֫(Ll/ۧ᩵֫;)Ll/ᩳۜܳ;

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_2

    return-object v0

    :cond_2
    if-nez p1, :cond_3

    goto :goto_2

    .line 758
    :cond_3
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    :goto_2
    if-eqz v1, :cond_5

    .line 762
    iget-object p1, p0, Ll/ܽۚۜ;->ܽ֫:Ll/ܰܺܳ;

    invoke-virtual {p1, v1}, Ll/ܰܺܳ;->֫(Ljava/lang/String;)Ll/ᩳۜܳ;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 763
    move-object v0, p1

    check-cast v0, Ll/ܺۘܳ;

    invoke-virtual {v0}, Ll/ܺۘܳ;->ۙ֫()Z

    move-result v0

    if-eqz v0, :cond_4

    return-object p1

    .line 764
    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Media item not found: "

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 760
    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Media path is null"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ(Ll/ᩳۜܳ;)Ll/᩻ۖܽ;
    .locals 4

    const-string v0, "r"

    .line 780
    iget-object v1, p0, Ll/ܽۚۜ;->ۧ֫:Ll/ܶ᩵ܿ;

    if-nez v1, :cond_0

    .line 781
    invoke-interface {p1}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object p1

    return-object p1

    .line 783
    :cond_0
    invoke-static {p1}, Ll/ܽۚۜ;->ܳ(Ll/ᩳۜܳ;)Ljava/lang/String;

    move-result-object v2

    .line 798
    invoke-virtual {v1, v2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 785
    invoke-direct {p0, p1, v1}, Ll/ܽۚۜ;->֫(Ll/ᩳۜܳ;Ll/ܶ᩵ܿ;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 786
    invoke-direct {p0, p1, v2}, Ll/ܽۚۜ;->ܽ(Ll/ᩳۜܳ;Ljava/lang/String;)V

    .line 787
    invoke-virtual {v1, v0}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 v3, 0x0

    .line 434
    invoke-direct {p0, p1, v3}, Ll/ܽۚۜ;->֫(Ll/ᩳۜܳ;Z)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v0, 0x1

    .line 790
    invoke-direct {p0, p1, v2, v0}, Ll/ܽۚۜ;->֫(Ll/ᩳۜܳ;Ljava/lang/String;Z)Ll/ܰ᩻᩻;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܰ᩻᩻;->ܽ()Ll/ۖۖܽ;

    move-result-object p1

    .line 791
    invoke-static {p1}, Ll/֡ۖܽ;->֫(Ll/ۖۖܽ;)Ll/᩻ۖܽ;

    move-result-object p1

    return-object p1

    .line 793
    :cond_2
    invoke-virtual {v1, v0}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ()V
    .locals 2

    .line 155
    iget v0, p0, Ll/ܽۚۜ;->᩹:I

    .line 156
    iget-object v1, p0, Ll/ܽۚۜ;->᩺:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v1

    .line 157
    iput v1, p0, Ll/ܽۚۜ;->᩹:I

    .line 158
    invoke-direct {p0, v0}, Ll/ܽۚۜ;->֫(I)V

    return-void
.end method

.method public final ܽ()V
    .locals 3

    move-object v0, p0

    .line 681
    monitor-enter v0

    .line 682
    :try_start_0
    iget-boolean v1, p0, Ll/ܽۚۜ;->֫֫:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Ll/ܽۚۜ;->ۧ֫:Ll/ܶ᩵ܿ;

    if-eqz v1, :cond_1

    iget-object v2, p0, Ll/ܽۚۜ;->ܽ֫:Ll/ܰܺܳ;

    instance-of v2, v2, Ll/ۗۢ᩻;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    .line 685
    iput-boolean v2, p0, Ll/ܽۚۜ;->֫֫:Z

    .line 687
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 688
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۬()Z

    return-void

    .line 683
    :cond_1
    :goto_0
    :try_start_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    .line 687
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ܽ(Ll/ᩳۜܳ;)V
    .locals 18

    move-object/from16 v7, p0

    move-object/from16 v0, p1

    .line 213
    iget-object v1, v7, Ll/ܽۚۜ;->ۧ֫:Ll/ܶ᩵ܿ;

    if-nez v1, :cond_0

    goto :goto_0

    .line 216
    :cond_0
    invoke-static/range {p1 .. p1}, Ll/ܽۚۜ;->ܳ(Ll/ᩳۜܳ;)Ljava/lang/String;

    move-result-object v8

    .line 798
    iget-object v1, v7, Ll/ܽۚۜ;->ۧ֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v1, v8}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v9

    .line 218
    iget-object v1, v7, Ll/ܽۚۜ;->ܽ֫:Ll/ܰܺܳ;

    instance-of v1, v1, Ll/ۗۢ᩻;

    const/4 v10, 0x0

    if-eqz v1, :cond_2

    .line 219
    invoke-direct {v7, v0, v9}, Ll/ܽۚۜ;->֫(Ll/ᩳۜܳ;Ll/ܶ᩵ܿ;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 220
    invoke-direct {v7, v0, v8}, Ll/ܽۚۜ;->ܽ(Ll/ᩳۜܳ;Ljava/lang/String;)V

    return-void

    .line 434
    :cond_1
    invoke-direct {v7, v0, v10}, Ll/ܽۚۜ;->֫(Ll/ᩳۜܳ;Z)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    .line 227
    :cond_2
    iget-object v1, v7, Ll/ܽۚۜ;->᩶:Ll/ۗܺ᩷;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, v7, Ll/ܽۚۜ;->᩶:Ll/ۗܺ᩷;

    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_3
    :goto_0
    return-void

    :cond_4
    move-object/from16 v16, p0

    .line 231
    monitor-enter v16

    .line 232
    :try_start_0
    invoke-direct {v7, v9, v0, v8}, Ll/ܽۚۜ;->֫(Ll/ܶ᩵ܿ;Ll/ᩳۜܳ;Ljava/lang/String;)Ll/֫ۚۜ;

    move-result-object v11

    if-nez v11, :cond_5

    .line 234
    monitor-exit v16

    return-void

    .line 236
    :cond_5
    monitor-exit v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    .line 237
    invoke-virtual {v9}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 239
    invoke-virtual {v9}, Ll/ܶ᩵ܿ;->۫()Z

    .line 155
    :cond_6
    iget v1, v7, Ll/ܽۚۜ;->᩹:I

    .line 156
    iget-object v2, v7, Ll/ܽۚۜ;->᩺:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v12

    .line 157
    iput v12, v7, Ll/ܽۚۜ;->᩹:I

    .line 158
    invoke-direct {v7, v1}, Ll/ܽۚۜ;->֫(I)V

    .line 242
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    const/4 v1, 0x1

    new-array v13, v1, [Z

    aput-boolean v10, v13, v10

    .line 245
    :try_start_1
    iget-object v1, v7, Ll/ܽۚۜ;->ܽ֫:Ll/ܰܺܳ;

    iget-object v2, v7, Ll/ܽۚۜ;->᩶:Ll/ۗܺ᩷;

    invoke-virtual {v1, v2, v0}, Ll/ܰܺܳ;->֫(Ll/ۗܺ᩷;Ll/ᩳۜܳ;)Ljava/io/InputStream;

    move-result-object v15
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    if-eqz v15, :cond_a

    .line 249
    :try_start_2
    invoke-interface/range {p1 .. p1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v5

    new-instance v2, Ll/᩶֡ۜ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object v1, v2

    move-object v14, v2

    move-object/from16 v2, p0

    move-object/from16 v17, v11

    move-wide v10, v5

    move v5, v12

    move-object v6, v13

    :try_start_3
    invoke-direct/range {v1 .. v6}, Ll/᩶֡ۜ;-><init>(Ll/ܽۚۜ;JI[Z)V

    invoke-virtual {v9, v15, v10, v11, v14}, Ll/ܶ᩵ܿ;->֫(Ljava/io/InputStream;JLl/ۚ᩸ܿ;)V

    const/4 v1, 0x0

    .line 283
    aget-boolean v2, v13, v1

    if-nez v2, :cond_9

    invoke-direct {v7, v12}, Ll/ܽۚۜ;->ۧ(I)Z

    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v2, :cond_9

    .line 286
    :try_start_4
    invoke-virtual {v15}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 291
    aget-boolean v0, v13, v1

    if-nez v0, :cond_8

    invoke-direct {v7, v12}, Ll/ܽۚۜ;->ۧ(I)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_1

    :cond_7
    move-object/from16 v1, v17

    const/4 v2, 0x0

    const/4 v10, 0x0

    goto :goto_2

    :cond_8
    :goto_1
    const/4 v10, 0x1

    move-object/from16 v1, v17

    const/4 v2, 0x0

    :goto_2
    invoke-direct {v7, v8, v1, v2, v10}, Ll/ܽۚۜ;->֫(Ljava/lang/String;Ll/֫ۚۜ;Ljava/io/IOException;Z)V

    .line 292
    invoke-direct {v7, v12}, Ll/ܽۚۜ;->֫(I)V

    return-void

    :catchall_0
    move-exception v0

    move-object/from16 v1, v17

    goto :goto_6

    :catch_0
    move-exception v0

    move-object/from16 v1, v17

    goto :goto_8

    :cond_9
    move-object/from16 v1, v17

    const/4 v2, 0x0

    .line 284
    :try_start_5
    new-instance v3, Ll/ۘ֡ۜ;

    invoke-interface/range {p1 .. p1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v0

    .line 15
    invoke-direct {v3, v0}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 284
    throw v3

    :catchall_1
    move-exception v0

    move-object/from16 v1, v17

    goto :goto_3

    :catchall_2
    move-exception v0

    move-object v1, v11

    :goto_3
    const/4 v2, 0x0

    goto :goto_4

    :cond_a
    move-object v1, v11

    const/4 v2, 0x0

    .line 247
    new-instance v3, Ll/ۖ֡ۜ;

    invoke-interface/range {p1 .. p1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v0

    .line 15
    invoke-direct {v3, v0}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 247
    throw v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :catchall_3
    move-exception v0

    :goto_4
    move-object v3, v0

    if-eqz v15, :cond_b

    .line 245
    :try_start_6
    invoke-virtual {v15}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    goto :goto_5

    :catchall_4
    move-exception v0

    move-object v4, v0

    :try_start_7
    invoke-virtual {v3, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_b
    :goto_5
    throw v3
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    :catchall_5
    move-exception v0

    goto :goto_7

    :catch_1
    move-exception v0

    goto :goto_8

    :catchall_6
    move-exception v0

    move-object v1, v11

    :goto_6
    const/4 v2, 0x0

    :goto_7
    move-object v14, v2

    goto :goto_9

    :catch_2
    move-exception v0

    move-object v1, v11

    :goto_8
    move-object v14, v0

    .line 288
    :try_start_8
    invoke-virtual {v9}, Ll/ܶ᩵ܿ;->۫()Z

    .line 289
    throw v14
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    :catchall_7
    move-exception v0

    :goto_9
    const/4 v2, 0x0

    .line 291
    aget-boolean v3, v13, v2

    if-nez v3, :cond_d

    invoke-direct {v7, v12}, Ll/ܽۚۜ;->ۧ(I)Z

    move-result v3

    if-nez v3, :cond_c

    goto :goto_a

    :cond_c
    const/4 v10, 0x0

    goto :goto_b

    :cond_d
    :goto_a
    const/4 v10, 0x1

    :goto_b
    invoke-direct {v7, v8, v1, v14, v10}, Ll/ܽۚۜ;->֫(Ljava/lang/String;Ll/֫ۚۜ;Ljava/io/IOException;Z)V

    .line 292
    invoke-direct {v7, v12}, Ll/ܽۚۜ;->֫(I)V

    .line 293
    throw v0

    :catchall_8
    move-exception v0

    .line 236
    :try_start_9
    monitor-exit v16
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    throw v0
.end method

.method public final ܿ()V
    .locals 6

    move-object v0, p0

    .line 658
    monitor-enter v0

    .line 659
    :try_start_0
    iget-boolean v1, p0, Ll/ܽۚۜ;->۟:Z

    if-eqz v1, :cond_0

    .line 660
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 662
    iput-boolean v1, p0, Ll/ܽۚۜ;->۟:Z

    .line 155
    iget v2, p0, Ll/ܽۚۜ;->᩹:I

    .line 156
    iget-object v3, p0, Ll/ܽۚۜ;->᩺:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v3

    .line 157
    iput v3, p0, Ll/ܽۚۜ;->᩹:I

    .line 158
    invoke-direct {p0, v2}, Ll/ܽۚۜ;->֫(I)V

    .line 664
    iget-object v2, p0, Ll/ܽۚۜ;->ۨ:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֫ۚۜ;

    .line 665
    iget-boolean v4, v3, Ll/֫ۚۜ;->ᩳ:Z

    if-eqz v4, :cond_1

    const/4 v4, 0x0

    .line 666
    iput-boolean v4, v3, Ll/֫ۚۜ;->ᩳ:Z

    .line 667
    iput-boolean v1, v3, Ll/֫ۚۜ;->֫:Z

    const/4 v5, 0x0

    .line 668
    iput-object v5, v3, Ll/֫ۚۜ;->ۧ:Ljava/io/IOException;

    .line 669
    iput-boolean v4, v3, Ll/֫ۚۜ;->ܽ:Z

    goto :goto_0

    .line 672
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 673
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ᩳ()Ll/ܰܺܳ;
    .locals 1

    .line 133
    iget-object v0, p0, Ll/ܽۚۜ;->ܽ֫:Ll/ܰܺܳ;

    return-object v0
.end method

.method public final ᩳ(Ll/ᩳۜܳ;)V
    .locals 3

    .line 870
    invoke-static {p1}, Ll/ܽۚۜ;->ܳ(Ll/ᩳۜܳ;)Ljava/lang/String;

    move-result-object v1

    move-object v0, p0

    .line 871
    monitor-enter v0

    .line 872
    :try_start_0
    iget-object v2, p0, Ll/ܽۚۜ;->᩸:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const v1, 0x7f0a03e0

    .line 873
    invoke-interface {p1, v1}, Ll/ᩳۜܳ;->ۜ(I)Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_0

    check-cast p1, Ljava/lang/ref/WeakReference;

    .line 874
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Ll/ܰ᩻᩻;

    if-eqz v1, :cond_0

    check-cast p1, Ll/ܰ᩻᩻;

    .line 878
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 880
    :try_start_1
    invoke-virtual {p1}, Ll/ܰ᩻᩻;->ܳ()V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void

    .line 875
    :cond_0
    :try_start_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 878
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method
