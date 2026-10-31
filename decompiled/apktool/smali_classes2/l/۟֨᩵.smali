.class public abstract Ll/۟֨᩵;
.super Ljava/lang/Object;
.source "I9US"

# interfaces
.implements Ljava/lang/Runnable;
.implements Ljava/lang/AutoCloseable;


# static fields
.field public static ۛ:I

.field public static final ۨ:Ll/֫᩻֨;


# instance fields
.field public volatile ۗ:I

.field public final ۙ:Ll/ۧۤᩴ;

.field public final ۤ:Ljava/util/concurrent/atomic/AtomicLong;

.field public volatile ۫:Ljava/lang/Thread;

.field public volatile ۬:Ll/֫۠᩵;

.field public final ᩶:Ljava/lang/Object;

.field public final ᩸:Ljava/lang/Object;

.field public ᩹:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 49
    const-class v0, Ll/۟֨᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/۟֨᩵;->ۨ:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 90
    iput v0, p0, Ll/۟֨᩵;->ۗ:I

    .line 92
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Transport"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget v1, Ll/۟֨᩵;->ۛ:I

    add-int/lit8 v2, v1, 0x1

    sput v2, Ll/۟֨᩵;->ۛ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/۟֨᩵;->᩹:Ljava/lang/String;

    .line 96
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/۟֨᩵;->᩸:Ljava/lang/Object;

    .line 97
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/۟֨᩵;->᩶:Ljava/lang/Object;

    .line 99
    new-instance v0, Ll/ۧۤᩴ;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ll/ۧۤᩴ;-><init>(I)V

    iput-object v0, p0, Ll/۟֨᩵;->ۙ:Ll/ۧۤᩴ;

    .line 100
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x1

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Ll/۟֨᩵;->ۤ:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method

.method public static ֫(Ljava/io/InputStream;[BII)I
    .locals 3

    add-int v0, p2, p3

    .line 65
    array-length v1, p1

    if-gt v0, v1, :cond_2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_1

    add-int v1, p2, v0

    sub-int v2, p3, v0

    .line 70
    invoke-virtual {p0, p1, v1, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v1

    if-gtz v1, :cond_0

    goto :goto_1

    :cond_0
    add-int/2addr v0, v1

    goto :goto_0

    :cond_1
    :goto_1
    return v0

    .line 66
    :cond_2
    new-instance p0, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Buffer too short, bufsize "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length p1, p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " read "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private ֫(Ll/۟ܺ᩵;Ll/ܰ֨᩵;J)V
    .locals 6

    move-object v1, p1

    :goto_0
    if-eqz p2, :cond_b

    move-object v0, p2

    .line 333
    monitor-enter v0

    .line 334
    :try_start_0
    invoke-interface {p2}, Ll/ܰ֨᩵;->۟()Z

    move-result v2

    if-nez v2, :cond_a

    const-wide/16 v2, 0x0

    cmp-long v4, p3, v2

    if-lez v4, :cond_6

    .line 336
    invoke-virtual {p2, p3, p4}, Ljava/lang/Object;->wait(J)V

    .line 337
    invoke-interface {p2}, Ll/ܰ֨᩵;->۟()Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {p0, v1, p2}, Ll/۟֨᩵;->֫(Ll/۟ܺ᩵;Ll/ܰ֨᩵;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 338
    monitor-exit v0

    goto :goto_0

    .line 341
    :cond_0
    invoke-interface {p2}, Ll/ܰ֨᩵;->ۘ()Z

    move-result p3

    if-nez p3, :cond_5

    .line 344
    invoke-virtual {p0}, Ll/۟֨᩵;->᩻()Z

    move-result p3

    if-eqz p3, :cond_2

    iget p3, p0, Ll/۟֨᩵;->ۗ:I

    const/4 p4, 0x5

    if-ne p3, p4, :cond_1

    goto :goto_1

    .line 345
    :cond_1
    new-instance p1, Ll/֫۠᩵;

    const-string p2, "Transport was disconnected while waiting for a response (transport: %s state: %d),"

    iget-object p3, p0, Ll/۟֨᩵;->᩹:Ljava/lang/String;

    iget p4, p0, Ll/۟֨᩵;->ۗ:I

    .line 349
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p3, v1, v2

    const/4 p3, 0x1

    aput-object p4, v1, p3

    .line 346
    invoke-static {p2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    .line 58
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 346
    throw p1

    .line 351
    :cond_2
    :goto_1
    invoke-interface {p2}, Ll/ܰ֨᩵;->ᩳ()Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide p3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr p3, v4

    cmp-long v4, p3, v2

    if-gtz v4, :cond_4

    .line 353
    sget-object p1, Ll/۟֨᩵;->ۨ:Ll/֫᩻֨;

    invoke-interface {p1}, Ll/֫᩻֨;->֫()Z

    move-result p2

    if-eqz p2, :cond_3

    .line 354
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "State is "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p3, p0, Ll/۟֨᩵;->ۗ:I

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 356
    :cond_3
    new-instance p1, Ll/᩺֨᩵;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p3, p0, Ll/۟֨᩵;->᩹:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " timedout waiting for response to "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 58
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 356
    throw p1

    .line 358
    :cond_4
    monitor-exit v0

    goto/16 :goto_0

    .line 342
    :cond_5
    new-instance p1, Ll/֫۠᩵;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p4, p0, Ll/۟֨᩵;->᩹:Ljava/lang/String;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " error reading response to "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p2}, Ll/ܰ֨᩵;->getException()Ljava/lang/Exception;

    move-result-object p2

    .line 50
    invoke-direct {p1, p3, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 342
    throw p1

    .line 361
    :cond_6
    invoke-virtual {p2}, Ljava/lang/Object;->wait()V

    .line 362
    invoke-virtual {p0, p1, p2}, Ll/۟֨᩵;->֫(Ll/۟ܺ᩵;Ll/ܰ֨᩵;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 363
    monitor-exit v0

    goto/16 :goto_0

    .line 365
    :cond_7
    sget-object v2, Ll/۟֨᩵;->ۨ:Ll/֫᩻֨;

    invoke-interface {v2}, Ll/֫᩻֨;->֫()Z

    move-result v3

    if-eqz v3, :cond_8

    .line 366
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Wait returned state is "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p0, Ll/۟֨᩵;->ۗ:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 368
    :cond_8
    invoke-virtual {p0}, Ll/۟֨᩵;->᩻()Z

    move-result v2

    if-nez v2, :cond_9

    .line 371
    monitor-exit v0

    goto/16 :goto_0

    .line 369
    :cond_9
    new-instance p1, Ljava/lang/InterruptedException;

    const-string p2, "Transport was disconnected while waiting for a response"

    invoke-direct {p1, p2}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 373
    :cond_a
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 375
    invoke-interface {v1}, Ll/۟ܺ᩵;->ܿ()Ll/۟ܺ᩵;

    move-result-object v1

    if-eqz v1, :cond_b

    .line 378
    invoke-interface {v1}, Ll/۟ܺ᩵;->ۧ()Ll/ܰ֨᩵;

    move-result-object p2

    goto/16 :goto_0

    :catchall_0
    move-exception p1

    .line 373
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_b
    return-void
.end method

.method private declared-synchronized ᩳ(J)V
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 624
    :try_start_0
    iget-object v1, p0, Ll/۟֨᩵;->۫:Ljava/lang/Thread;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 625
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    if-eq v3, v1, :cond_0

    .line 626
    iput-object v2, p0, Ll/۟֨᩵;->۫:Ljava/lang/Thread;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 628
    :try_start_1
    sget-object v2, Ll/۟֨᩵;->ۨ:Ll/֫᩻֨;

    const-string v3, "Interrupting transport thread"

    invoke-interface {v2, v3}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 629
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    const-string v3, "Joining transport thread"

    .line 630
    invoke-interface {v2, v3}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 631
    invoke-virtual {v1, p1, p2}, Ljava/lang/Thread;->join(J)V

    const-string p1, "Joined transport thread"

    .line 632
    invoke-interface {v2, p1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 634
    :try_start_2
    new-instance p2, Ll/֫۠᩵;

    const-string v1, "Failed to join transport thread"

    .line 50
    invoke-direct {p2, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 634
    throw p2

    :cond_0
    if-eqz v1, :cond_1

    .line 637
    iput-object v2, p0, Ll/۟֨᩵;->۫:Ljava/lang/Thread;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 639
    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method private ᩴ()V
    .locals 7

    .line 405
    :goto_0
    iget-object v0, p0, Ll/۟֨᩵;->۫:Ljava/lang/Thread;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_e

    .line 407
    :try_start_0
    iget-object v0, p0, Ll/۟֨᩵;->᩸:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 410
    :try_start_1
    invoke-virtual {p0}, Ll/۟֨᩵;->ۖ()Ljava/lang/Long;

    move-result-object v1
    :try_end_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v1, :cond_1

    move-object v1, p0

    .line 432
    :try_start_2
    monitor-enter v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 433
    :try_start_3
    iget-object v2, p0, Ll/۟֨᩵;->ۙ:Ll/ۧۤᩴ;

    invoke-virtual {v2}, Ll/ۧۤᩴ;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܰ֨᩵;

    .line 434
    invoke-interface {v3}, Ll/ܰ֨᩵;->ۗ()V

    goto :goto_1

    .line 436
    :cond_0
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 437
    :try_start_4
    new-instance v1, Ljava/io/IOException;

    const-string v2, "end of stream"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_0
    move-exception v2

    .line 436
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    throw v2

    .line 440
    :cond_1
    iget-object v2, p0, Ll/۟֨᩵;->ۙ:Ll/ۧۤᩴ;

    invoke-virtual {v2, v1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰ֨᩵;

    if-nez v2, :cond_3

    .line 442
    sget-object v2, Ll/۟֨᩵;->ۨ:Ll/֫᩻֨;

    invoke-interface {v2}, Ll/֫᩻֨;->֫()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 443
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unexpected message id, skipping message "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 445
    :cond_2
    invoke-virtual {p0, v1}, Ll/۟֨᩵;->֫(Ljava/lang/Long;)V

    goto :goto_2

    .line 447
    :cond_3
    invoke-virtual {p0, v2}, Ll/۟֨᩵;->֫(Ll/ܰ֨᩵;)V

    .line 448
    invoke-interface {v2}, Ll/ܰ֨᩵;->᩷()V

    .line 450
    :goto_2
    monitor-exit v0

    goto :goto_0

    :catchall_1
    move-exception v1

    goto :goto_4

    :catch_0
    move-exception v1

    .line 412
    sget-object v2, Ll/۟֨᩵;->ۨ:Ll/֫᩻֨;

    const-string v3, "Socket timeout during peekKey"

    invoke-interface {v2, v3, v1}, Ll/֫᩻֨;->ܽ(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 162
    iget-object v2, p0, Ll/۟֨᩵;->ۤ:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-lez v6, :cond_6

    .line 414
    sget-object v1, Ll/۟֨᩵;->ۨ:Ll/֫᩻֨;

    invoke-interface {v1}, Ll/֫᩻֨;->֫()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 415
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Transport still in use, no idle timeout "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 418
    :cond_4
    iget-object v1, p0, Ll/۟֨᩵;->ۙ:Ll/ۧۤᩴ;

    invoke-virtual {v1}, Ll/ۧۤᩴ;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ll/ܰ֨᩵;

    move-object v1, v3

    .line 419
    monitor-enter v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 420
    :try_start_7
    invoke-virtual {v3}, Ljava/lang/Object;->notifyAll()V

    .line 421
    monitor-exit v1

    goto :goto_3

    :catchall_2
    move-exception v2

    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :try_start_8
    throw v2

    .line 423
    :cond_5
    monitor-exit v0

    goto/16 :goto_0

    .line 426
    :cond_6
    sget-object v2, Ll/۟֨᩵;->ۨ:Ll/֫᩻֨;

    invoke-interface {v2}, Ll/֫᩻֨;->֫()Z

    move-result v3

    if-eqz v3, :cond_7

    .line 427
    iget-object v3, p0, Ll/۟֨᩵;->᩹:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Idle timeout on "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 429
    :cond_7
    throw v1

    .line 450
    :goto_4
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :try_start_9
    throw v1
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1

    :catch_1
    move-exception v0

    move-object v1, v0

    .line 452
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    .line 453
    instance-of v2, v1, Ljava/net/SocketTimeoutException;

    const/4 v3, 0x0

    if-nez v2, :cond_9

    if-eqz v0, :cond_8

    const-string v2, "Read timed out"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_5

    :cond_8
    const/4 v2, 0x0

    goto :goto_6

    :cond_9
    :goto_5
    const/4 v2, 0x1

    :goto_6
    if-eqz v0, :cond_a

    const-string v4, "Socket closed"

    .line 454
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 457
    sget-object v0, Ll/۟֨᩵;->ۨ:Ll/֫᩻֨;

    const-string v4, "Remote closed connection"

    invoke-interface {v0, v4}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    goto :goto_7

    :cond_a
    if-eqz v2, :cond_b

    .line 459
    sget-object v0, Ll/۟֨᩵;->ۨ:Ll/֫᩻֨;

    const-string v4, "socket timeout in non peek state"

    invoke-interface {v0, v4, v1}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_7

    .line 461
    :cond_b
    sget-object v0, Ll/۟֨᩵;->ۨ:Ll/֫᩻֨;

    const-string v4, "recv failed"

    invoke-interface {v0, v4, v1}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    :goto_7
    move-object v0, p0

    .line 464
    monitor-enter v0

    xor-int/lit8 v2, v2, 0x1

    .line 466
    :try_start_a
    invoke-virtual {p0, v2, v3}, Ll/۟֨᩵;->֫(ZZ)Z
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_2
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    goto :goto_8

    :catchall_3
    move-exception v1

    goto :goto_b

    :catch_2
    move-exception v2

    .line 468
    :try_start_b
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 469
    sget-object v4, Ll/۟֨᩵;->ۨ:Ll/֫᩻֨;

    const-string v5, "Failed to disconnect"

    invoke-interface {v4, v5, v2}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 471
    :goto_8
    sget-object v2, Ll/۟֨᩵;->ۨ:Ll/֫᩻֨;

    const-string v4, "Disconnected"

    invoke-interface {v2, v4}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 474
    iget-object v2, p0, Ll/۟֨᩵;->ۙ:Ll/ۧۤᩴ;

    invoke-virtual {v2}, Ll/ۧۤᩴ;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 475
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_c

    .line 476
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܰ֨᩵;

    .line 477
    invoke-interface {v3, v1}, Ll/ܰ֨᩵;->֫(Ljava/lang/Exception;)V

    .line 478
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    const/4 v3, 0x1

    goto :goto_9

    :cond_c
    if-eqz v3, :cond_d

    .line 483
    sget-object v1, Ll/۟֨᩵;->ۨ:Ll/֫᩻֨;

    const-string v2, "Notified clients"

    invoke-interface {v1, v2}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    goto :goto_a

    .line 485
    :cond_d
    sget-object v2, Ll/۟֨᩵;->ۨ:Ll/֫᩻֨;

    const-string v3, "Exception without a request pending"

    invoke-interface {v2, v3, v1}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 487
    :goto_a
    monitor-exit v0

    goto :goto_c

    .line 488
    :goto_b
    monitor-exit v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    throw v1

    :cond_e
    :goto_c
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 122
    invoke-virtual {p0}, Ll/۟֨᩵;->ۘ()V

    return-void
.end method

.method public final finalize()V
    .locals 5

    .line 152
    invoke-virtual {p0}, Ll/۟֨᩵;->᩻()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/۟֨᩵;->ۤ:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 153
    sget-object v0, Ll/۟֨᩵;->ۨ:Ll/֫᩻֨;

    const-string v1, "Session was not properly released"

    invoke-interface {v0, v1}, Ll/֫᩻֨;->ᩳ(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final run()V
    .locals 5

    .line 706
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    const/4 v2, 0x2

    .line 715
    :try_start_0
    iget v0, p0, Ll/۟֨᩵;->ۗ:I

    const/4 v3, 0x5

    if-eq v0, v3, :cond_0

    iget v0, p0, Ll/۟֨᩵;->ۗ:I

    const/4 v3, 0x6

    if-eq v0, v3, :cond_0

    .line 716
    invoke-virtual {p0}, Ll/۟֨᩵;->ᩳ()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :cond_0
    move-object v0, v1

    .line 722
    monitor-enter v0

    .line 723
    :try_start_1
    iget-object v3, p0, Ll/۟֨᩵;->۫:Ljava/lang/Thread;

    if-eq v1, v3, :cond_1

    .line 733
    monitor-exit v0

    return-void

    .line 741
    :cond_1
    iput v2, p0, Ll/۟֨᩵;->ۗ:I

    .line 742
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 743
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 749
    invoke-direct {p0}, Ll/۟֨᩵;->ᩴ()V

    return-void

    :catchall_0
    move-exception v1

    .line 743
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1

    :catchall_1
    move-exception v0

    move-object v3, v0

    move-object v0, v1

    .line 722
    monitor-enter v0

    .line 723
    :try_start_3
    iget-object v4, p0, Ll/۟֨᩵;->۫:Ljava/lang/Thread;

    if-eq v1, v4, :cond_2

    .line 733
    monitor-exit v0

    goto :goto_2

    .line 741
    :cond_2
    iput v2, p0, Ll/۟֨᩵;->ۗ:I

    .line 742
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 743
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 744
    throw v3

    :catchall_2
    move-exception v1

    .line 743
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw v1

    :catch_0
    move-exception v0

    move-object v3, v0

    move-object v0, v1

    .line 722
    monitor-enter v0

    .line 723
    :try_start_5
    iget-object v4, p0, Ll/۟֨᩵;->۫:Ljava/lang/Thread;

    if-eq v1, v4, :cond_4

    .line 728
    instance-of v1, v3, Ljava/net/SocketTimeoutException;

    if-eqz v1, :cond_3

    .line 729
    sget-object v1, Ll/۟֨᩵;->ۨ:Ll/֫᩻֨;

    const-string v2, "Timeout connecting"

    invoke-interface {v1, v2, v3}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_0

    .line 731
    :cond_3
    sget-object v1, Ll/۟֨᩵;->ۨ:Ll/֫᩻֨;

    const-string v2, "Exception in transport thread"

    invoke-interface {v1, v2, v3}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 733
    :goto_0
    monitor-exit v0

    goto :goto_2

    .line 736
    :cond_4
    instance-of v4, v3, Ljava/net/SocketTimeoutException;

    if-eqz v4, :cond_5

    .line 737
    new-instance v4, Ll/ۛ֨᩵;

    .line 66
    invoke-direct {v4, v3}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 737
    iput-object v4, p0, Ll/۟֨᩵;->۬:Ll/֫۠᩵;

    goto :goto_1

    .line 739
    :cond_5
    new-instance v4, Ll/֫۠᩵;

    .line 66
    invoke-direct {v4, v3}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 739
    iput-object v4, p0, Ll/۟֨᩵;->۬:Ll/֫۠᩵;

    .line 741
    :goto_1
    iput v2, p0, Ll/۟֨᩵;->ۗ:I

    .line 742
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 743
    monitor-exit v0

    :goto_2
    return-void

    :catchall_3
    move-exception v1

    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    throw v1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 755
    iget-object v0, p0, Ll/۟֨᩵;->᩹:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ll/۟ܺ᩵;Ll/ܰ֨᩵;Ljava/util/Set;J)J
    .locals 9

    const-wide/16 v0, 0x0

    move-object v2, p1

    move-wide v3, v0

    :goto_0
    if-eqz p2, :cond_3

    .line 288
    invoke-interface {p2}, Ll/ܰ֨᩵;->reset()V

    .line 290
    sget-object v5, Ll/֡ۚ᩵;->ۗ:Ll/֡ۚ᩵;

    invoke-interface {p3, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 291
    invoke-interface {p2}, Ll/ۨ֨᩵;->֡()V

    .line 294
    :cond_0
    invoke-virtual {p0, v2}, Ll/۟֨᩵;->ܽ(Ll/۟ܺ᩵;)J

    move-result-wide v5

    cmp-long v7, v3, v0

    if-nez v7, :cond_1

    move-wide v3, v5

    :cond_1
    cmp-long v7, p4, v0

    if-lez v7, :cond_2

    .line 301
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    add-long/2addr v7, p4

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-interface {p2, v7}, Ll/ܰ֨᩵;->֫(Ljava/lang/Long;)V

    goto :goto_1

    :cond_2
    const/4 v7, 0x0

    .line 303
    invoke-interface {p2, v7}, Ll/ܰ֨᩵;->֫(Ljava/lang/Long;)V

    .line 306
    :goto_1
    invoke-interface {p2, v5, v6}, Ll/ܰ֨᩵;->֫(J)V

    .line 307
    iget-object v7, p0, Ll/۟֨᩵;->ۙ:Ll/ۧۤᩴ;

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v7, v5, p2}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    invoke-interface {v2}, Ll/۟ܺ᩵;->ܿ()Ll/۟ܺ᩵;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 312
    invoke-interface {v2}, Ll/۟ܺ᩵;->ۧ()Ll/ܰ֨᩵;

    move-result-object p2

    goto :goto_0

    .line 269
    :cond_3
    invoke-virtual {p0, p1}, Ll/۟֨᩵;->֫(Ll/۟ܺ᩵;)V

    return-wide v3
.end method

.method public final ֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;Ljava/util/Set;)Ll/ܰ֨᩵;
    .locals 10

    .line 207
    invoke-virtual {p0}, Ll/۟֨᩵;->᩻()Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Ll/۟֨᩵;->ۗ:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 208
    :cond_0
    new-instance p1, Ll/֫۠᩵;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Transport is disconnected "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p3, p0, Ll/۟֨᩵;->᩹:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 58
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 208
    throw p1

    .line 211
    :cond_1
    :goto_0
    :try_start_0
    sget-object v0, Ll/֡ۚ᩵;->ۙ:Ll/֡ۚ᩵;

    invoke-interface {p3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0, p1}, Ll/۟֨᩵;->ۧ(Ll/۟ܺ᩵;)I

    move-result v0

    int-to-long v0, v0

    goto :goto_1

    :catchall_0
    move-exception p3

    goto/16 :goto_8

    :catch_0
    move-exception p3

    goto/16 :goto_5

    :catch_1
    move-exception p3

    goto/16 :goto_6

    :cond_2
    const-wide/16 v0, 0x0

    :goto_1
    move-wide v8, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-wide v6, v8

    .line 213
    invoke-virtual/range {v2 .. v7}, Ll/۟֨᩵;->֫(Ll/۟ܺ᩵;Ll/ܰ֨᩵;Ljava/util/Set;J)J

    move-result-wide v1

    .line 215
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p3

    iget-object v0, p0, Ll/۟֨᩵;->۫:Ljava/lang/Thread;

    if-ne p3, v0, :cond_5

    .line 219
    iget-object p3, p0, Ll/۟֨᩵;->᩸:Ljava/lang/Object;

    move-object v0, p3

    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 220
    :try_start_1
    invoke-virtual {p0}, Ll/۟֨᩵;->ۖ()Ljava/lang/Long;

    move-result-object p3

    .line 221
    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    cmp-long v5, v3, v1

    if-nez v5, :cond_4

    .line 222
    invoke-virtual {p0, p2}, Ll/۟֨᩵;->֫(Ll/ܰ֨᩵;)V

    .line 223
    invoke-interface {p2}, Ll/ܰ֨᩵;->᩷()V

    .line 224
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object p3, p2

    :goto_2
    if-eqz p3, :cond_3

    .line 246
    iget-object v0, p0, Ll/۟֨᩵;->ۙ:Ll/ۧۤᩴ;

    invoke-interface {p3}, Ll/ܰ֨᩵;->ۜ()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {v0, p3}, Ll/ۧۤᩴ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    invoke-interface {p1}, Ll/۟ܺ᩵;->ܿ()Ll/۟ܺ᩵;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 250
    invoke-interface {p1}, Ll/۟ܺ᩵;->ۧ()Ll/ܰ֨᩵;

    move-result-object p3

    goto :goto_2

    :cond_3
    return-object p2

    .line 226
    :cond_4
    :try_start_2
    invoke-virtual {p0, p3}, Ll/۟֨᩵;->֫(Ljava/lang/Long;)V

    .line 227
    monitor-exit v0

    goto :goto_3

    :catchall_1
    move-exception p3

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    throw p3

    .line 230
    :cond_5
    :goto_3
    invoke-direct {p0, p1, p2, v8, v9}, Ll/۟֨᩵;->֫(Ll/۟ܺ᩵;Ll/ܰ֨᩵;J)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object p3, p2

    :goto_4
    if-eqz p3, :cond_6

    .line 246
    iget-object v0, p0, Ll/۟֨᩵;->ۙ:Ll/ۧۤᩴ;

    invoke-interface {p3}, Ll/ܰ֨᩵;->ۜ()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {v0, p3}, Ll/ۧۤᩴ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    invoke-interface {p1}, Ll/۟ܺ᩵;->ܿ()Ll/۟ܺ᩵;

    move-result-object p1

    if-eqz p1, :cond_6

    .line 250
    invoke-interface {p1}, Ll/۟ܺ᩵;->ۧ()Ll/ܰ֨᩵;

    move-result-object p3

    goto :goto_4

    :cond_6
    return-object p2

    .line 241
    :goto_5
    :try_start_4
    new-instance v0, Ll/֫۠᩵;

    .line 66
    invoke-direct {v0, p3}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 241
    throw v0

    .line 232
    :goto_6
    sget-object v0, Ll/۟֨᩵;->ۨ:Ll/֫᩻֨;

    const-string v1, "sendrecv failed"

    invoke-interface {v0, v1, p3}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 234
    :try_start_5
    invoke-virtual {p0}, Ll/۟֨᩵;->ܽ()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_7

    :catch_2
    move-exception v0

    .line 236
    :try_start_6
    invoke-virtual {p3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 237
    sget-object v1, Ll/۟֨᩵;->ۨ:Ll/֫᩻֨;

    const-string v2, "disconnect failed"

    invoke-interface {v1, v2, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 239
    :goto_7
    throw p3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_8
    if-eqz p2, :cond_7

    .line 246
    iget-object v0, p0, Ll/۟֨᩵;->ۙ:Ll/ۧۤᩴ;

    invoke-interface {p2}, Ll/ܰ֨᩵;->ۜ()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {v0, p2}, Ll/ۧۤᩴ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    invoke-interface {p1}, Ll/۟ܺ᩵;->ܿ()Ll/۟ܺ᩵;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 250
    invoke-interface {p1}, Ll/۟ܺ᩵;->ۧ()Ll/ܰ֨᩵;

    move-result-object p2

    goto :goto_8

    .line 255
    :cond_7
    throw p3
.end method

.method public final ֫()V
    .locals 5

    .line 107
    iget-object v0, p0, Ll/۟֨᩵;->ۤ:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    move-result-wide v0

    .line 108
    sget-object v2, Ll/۟֨᩵;->ۨ:Ll/֫᩻֨;

    invoke-interface {v2}, Ll/֫᩻֨;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 109
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Acquire transport "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public abstract ֫(Ljava/lang/Long;)V
.end method

.method public abstract ֫(Ll/۟ܺ᩵;)V
.end method

.method public abstract ֫(Ll/ܰ֨᩵;)V
.end method

.method public ֫(Ll/۟ܺ᩵;Ll/ܰ֨᩵;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final declared-synchronized ֫(ZZ)Z
    .locals 8

    const-string v1, "Invalid state: "

    move-object v0, p0

    monitor-enter v0

    .line 665
    :try_start_0
    iget v2, p0, Ll/۟֨᩵;->ۗ:I

    const/4 v3, 0x0

    if-eqz v2, :cond_5

    const/4 v4, 0x2

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v7, 0x6

    if-eq v2, v4, :cond_1

    const/4 v4, 0x3

    if-eq v2, v4, :cond_2

    const/4 p1, 0x4

    if-eq v2, p1, :cond_0

    if-eq v2, v5, :cond_5

    if-eq v2, v7, :cond_5

    .line 691
    sget-object p1, Ll/۟֨᩵;->ۨ:Ll/֫᩻֨;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/۟֨᩵;->ۗ:I

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ll/֫᩻֨;->֫(Ljava/lang/String;)V

    .line 692
    iput-object v6, p0, Ll/۟֨᩵;->۫:Ljava/lang/Thread;

    .line 693
    iput v7, p0, Ll/۟֨᩵;->ۗ:I

    goto :goto_1

    :cond_0
    move-object p1, v6

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    .line 673
    :cond_2
    iget-object v1, p0, Ll/۟֨᩵;->ۙ:Ll/ۧۤᩴ;

    invoke-virtual {v1}, Ll/ۧۤᩴ;->size()I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_3

    if-nez p1, :cond_3

    if-eqz p2, :cond_3

    goto :goto_1

    .line 677
    :cond_3
    :try_start_1
    iput v5, p0, Ll/۟֨᩵;->ۗ:I

    .line 678
    invoke-virtual {p0, p1, p2}, Ll/۟֨᩵;->ۧ(ZZ)Z

    move-result p1

    .line 679
    iput v7, p0, Ll/۟֨᩵;->ۗ:I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 680
    monitor-exit v0

    return p1

    :catch_0
    move-exception p1

    .line 682
    :try_start_2
    iput v7, p0, Ll/۟֨᩵;->ۗ:I

    .line 687
    :goto_0
    iput-object v6, p0, Ll/۟֨᩵;->۫:Ljava/lang/Thread;

    .line 688
    iput v7, p0, Ll/۟֨᩵;->ۗ:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v6, p1

    :goto_1
    if-nez v6, :cond_4

    .line 700
    monitor-exit v0

    return v3

    .line 698
    :cond_4
    :try_start_3
    throw v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 669
    :cond_5
    monitor-exit v0

    return v3

    :catchall_0
    move-exception p1

    .line 700
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method public abstract ۖ()Ljava/lang/Long;
.end method

.method public final ۘ()V
    .locals 6

    .line 130
    iget-object v0, p0, Ll/۟֨᩵;->ۤ:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->decrementAndGet()J

    move-result-wide v0

    .line 131
    sget-object v2, Ll/۟֨᩵;->ۨ:Ll/֫᩻֨;

    invoke-interface {v2}, Ll/֫᩻֨;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 132
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Release transport "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    :cond_0
    const-wide/16 v3, 0x0

    cmp-long v5, v0, v3

    if-nez v5, :cond_1

    .line 136
    invoke-interface {v2}, Ll/֫᩻֨;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 137
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Transport usage dropped to zero "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    return-void

    :cond_1
    if-ltz v5, :cond_3

    :cond_2
    return-void

    .line 140
    :cond_3
    new-instance v0, Ll/۬ۡ᩵;

    const-string v1, "Usage count dropped below zero"

    .line 58
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 140
    throw v0
.end method

.method public ۜ()Z
    .locals 2

    .line 193
    iget v0, p0, Ll/۟֨᩵;->ۗ:I

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    iget v0, p0, Ll/۟֨᩵;->ۗ:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public abstract ۧ(Ll/۟ܺ᩵;)I
.end method

.method public final declared-synchronized ۧ(J)Z
    .locals 18

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    const-string v0, "Invalid state: "

    const-string v4, "Invalid state: "

    const-string v5, "Invalid state: "

    const-string v6, "Invalid state: "

    const-string v7, "Connecting "

    const-string v8, "Invalid state: "

    const-string v9, "Invalid state: "

    const-string v10, "Invalid state: "

    move-object/from16 v16, p0

    .line 21
    monitor-enter v16

    .line 522
    :try_start_0
    iget v11, v1, Ll/۟֨᩵;->ۗ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/4 v12, 0x1

    const/4 v14, 0x4

    const/4 v15, 0x3

    const/4 v13, 0x6

    if-eqz v11, :cond_b

    if-eq v11, v12, :cond_6

    if-eq v11, v15, :cond_4

    if-eq v11, v14, :cond_3

    const/4 v4, 0x5

    if-eq v11, v4, :cond_1

    if-ne v11, v13, :cond_0

    goto :goto_0

    .line 556
    :cond_0
    :try_start_1
    new-instance v4, Ll/֫۠᩵;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 58
    invoke-direct {v4, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 557
    throw v4

    .line 553
    :cond_1
    :goto_0
    sget-object v0, Ll/۟֨᩵;->ۨ:Ll/֫᩻֨;

    const-string v4, "Trying to connect a disconnected transport"

    invoke-interface {v0, v4}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V
    :try_end_1
    .catch Ll/ۛ֨᩵; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ll/֫۠᩵; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 609
    :try_start_2
    iget v4, v1, Ll/۟֨᩵;->ۗ:I

    if-eqz v4, :cond_2

    if-eq v4, v15, :cond_2

    if-eq v4, v14, :cond_2

    const/4 v5, 0x5

    if-eq v4, v5, :cond_2

    if-eq v4, v13, :cond_2

    .line 611
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ll/֫᩻֨;->֫(Ljava/lang/String;)V

    .line 612
    iput v13, v1, Ll/۟֨᩵;->ۗ:I

    .line 613
    invoke-direct/range {p0 .. p2}, Ll/۟֨᩵;->ᩳ(J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 554
    :cond_2
    monitor-exit v16

    :goto_1
    const/4 v0, 0x0

    return v0

    .line 549
    :cond_3
    :try_start_3
    iput v13, v1, Ll/۟֨᩵;->ۗ:I

    .line 550
    new-instance v0, Ll/֫۠᩵;

    const-string v4, "Connection in error"

    iget-object v5, v1, Ll/۟֨᩵;->۬:Ll/֫۠᩵;

    .line 50
    invoke-direct {v0, v4, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 550
    throw v0
    :try_end_3
    .catch Ll/ۛ֨᩵; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ll/֫۠᩵; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 609
    :cond_4
    :try_start_4
    iget v0, v1, Ll/۟֨᩵;->ۗ:I

    if-eqz v0, :cond_5

    if-eq v0, v15, :cond_5

    if-eq v0, v14, :cond_5

    const/4 v4, 0x5

    if-eq v0, v4, :cond_5

    if-eq v0, v13, :cond_5

    .line 611
    sget-object v4, Ll/۟֨᩵;->ۨ:Ll/֫᩻֨;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ll/֫᩻֨;->֫(Ljava/lang/String;)V

    .line 612
    iput v13, v1, Ll/۟֨᩵;->ۗ:I

    .line 613
    invoke-direct/range {p0 .. p2}, Ll/۟֨᩵;->ᩳ(J)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 547
    :cond_5
    monitor-exit v16

    return v12

    .line 529
    :cond_6
    :try_start_5
    iget-object v0, v1, Ll/۟֨᩵;->۫:Ljava/lang/Thread;

    invoke-virtual {v0, v2, v3}, Ljava/lang/Object;->wait(J)V

    .line 530
    iget v0, v1, Ll/۟֨᩵;->ۗ:I

    if-eq v0, v12, :cond_a

    const/4 v9, 0x2

    if-eq v0, v9, :cond_7

    goto :goto_2

    .line 537
    :cond_7
    iget-object v0, v1, Ll/۟֨᩵;->۬:Ll/֫۠᩵;

    if-nez v0, :cond_9

    .line 542
    iput v15, v1, Ll/۟֨᩵;->ۗ:I
    :try_end_5
    .catch Ll/ۛ֨᩵; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ll/֫۠᩵; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 609
    :try_start_6
    iget v0, v1, Ll/۟֨᩵;->ۗ:I

    if-eqz v0, :cond_8

    if-eq v0, v15, :cond_8

    if-eq v0, v14, :cond_8

    const/4 v4, 0x5

    if-eq v0, v4, :cond_8

    if-eq v0, v13, :cond_8

    .line 611
    sget-object v4, Ll/۟֨᩵;->ۨ:Ll/֫᩻֨;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ll/֫᩻֨;->֫(Ljava/lang/String;)V

    .line 612
    iput v13, v1, Ll/۟֨᩵;->ۗ:I

    .line 613
    invoke-direct/range {p0 .. p2}, Ll/۟֨᩵;->ᩳ(J)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 543
    :cond_8
    monitor-exit v16

    return v12

    .line 538
    :cond_9
    :try_start_7
    iput v14, v1, Ll/۟֨᩵;->ۗ:I

    .line 539
    invoke-direct/range {p0 .. p2}, Ll/۟֨᩵;->ᩳ(J)V

    .line 540
    iget-object v0, v1, Ll/۟֨᩵;->۬:Ll/֫۠᩵;

    throw v0

    .line 533
    :cond_a
    iput v13, v1, Ll/۟֨᩵;->ۗ:I

    .line 534
    invoke-direct/range {p0 .. p2}, Ll/۟֨᩵;->ᩳ(J)V

    .line 535
    new-instance v0, Ll/ۛ֨᩵;

    const-string v4, "Connection timeout"

    .line 58
    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 535
    throw v0

    .line 560
    :cond_b
    :goto_2
    sget-object v0, Ll/۟֨᩵;->ۨ:Ll/֫᩻֨;

    invoke-interface {v0}, Ll/֫᩻֨;->֫()Z

    move-result v8

    if-eqz v8, :cond_c

    .line 561
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v7, v1, Ll/۟֨᩵;->᩹:Ljava/lang/String;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v0, v7}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 564
    :cond_c
    iput v12, v1, Ll/۟֨᩵;->ۗ:I

    const/4 v7, 0x0

    .line 565
    iput-object v7, v1, Ll/۟֨᩵;->۬:Ll/֫۠᩵;

    .line 567
    new-instance v7, Ljava/lang/Thread;

    iget-object v8, v1, Ll/۟֨᩵;->᩹:Ljava/lang/String;

    invoke-direct {v7, v1, v8}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 568
    invoke-virtual {v7, v12}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 569
    iput-object v7, v1, Ll/۟֨᩵;->۫:Ljava/lang/Thread;

    .line 571
    iget-object v8, v1, Ll/۟֨᩵;->۫:Ljava/lang/Thread;

    move-object/from16 v17, v8

    monitor-enter v17
    :try_end_7
    .catch Ll/ۛ֨᩵; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ll/֫۠᩵; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 572
    :try_start_8
    invoke-virtual {v7}, Ljava/lang/Thread;->start()V

    .line 573
    invoke-virtual {v7, v2, v3}, Ljava/lang/Object;->wait(J)V

    .line 575
    iget v7, v1, Ll/۟֨᩵;->ۗ:I

    if-eq v7, v12, :cond_13

    const/4 v8, 0x2

    if-eq v7, v8, :cond_10

    if-eq v7, v15, :cond_e

    .line 590
    monitor-exit v17
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 609
    :try_start_9
    iget v5, v1, Ll/۟֨᩵;->ۗ:I

    if-eqz v5, :cond_d

    if-eq v5, v15, :cond_d

    if-eq v5, v14, :cond_d

    const/4 v6, 0x5

    if-eq v5, v6, :cond_d

    if-eq v5, v13, :cond_d

    .line 611
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ll/֫᩻֨;->֫(Ljava/lang/String;)V

    .line 612
    iput v13, v1, Ll/۟֨᩵;->ۗ:I

    .line 613
    invoke-direct/range {p0 .. p2}, Ll/۟֨᩵;->ᩳ(J)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 590
    :cond_d
    monitor-exit v16

    goto/16 :goto_1

    .line 588
    :cond_e
    :try_start_a
    monitor-exit v17
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 609
    :try_start_b
    iget v4, v1, Ll/۟֨᩵;->ۗ:I

    if-eqz v4, :cond_f

    if-eq v4, v15, :cond_f

    if-eq v4, v14, :cond_f

    const/4 v5, 0x5

    if-eq v4, v5, :cond_f

    if-eq v4, v13, :cond_f

    .line 611
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ll/֫᩻֨;->֫(Ljava/lang/String;)V

    .line 612
    iput v13, v1, Ll/۟֨᩵;->ۗ:I

    .line 613
    invoke-direct/range {p0 .. p2}, Ll/۟֨᩵;->ᩳ(J)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 588
    :cond_f
    monitor-exit v16

    return v12

    .line 581
    :cond_10
    :try_start_c
    iget-object v4, v1, Ll/۟֨᩵;->۬:Ll/֫۠᩵;

    if-nez v4, :cond_12

    .line 585
    iput v15, v1, Ll/۟֨᩵;->ۗ:I

    .line 586
    monitor-exit v17
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 609
    :try_start_d
    iget v4, v1, Ll/۟֨᩵;->ۗ:I

    if-eqz v4, :cond_11

    if-eq v4, v15, :cond_11

    if-eq v4, v14, :cond_11

    const/4 v6, 0x5

    if-eq v4, v6, :cond_11

    if-eq v4, v13, :cond_11

    .line 611
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ll/֫᩻֨;->֫(Ljava/lang/String;)V

    .line 612
    iput v13, v1, Ll/۟֨᩵;->ۗ:I

    .line 613
    invoke-direct/range {p0 .. p2}, Ll/۟֨᩵;->ᩳ(J)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 586
    :cond_11
    monitor-exit v16

    return v12

    .line 582
    :cond_12
    :try_start_e
    iput v14, v1, Ll/۟֨᩵;->ۗ:I

    .line 583
    iget-object v0, v1, Ll/۟֨᩵;->۬:Ll/֫۠᩵;

    throw v0

    .line 578
    :cond_13
    iput v13, v1, Ll/۟֨᩵;->ۗ:I

    .line 579
    new-instance v0, Ll/ۛ֨᩵;

    const-string v4, "Connection timeout"

    .line 58
    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 579
    throw v0

    :catchall_0
    move-exception v0

    .line 592
    monitor-exit v17
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    :try_start_f
    throw v0
    :try_end_f
    .catch Ll/ۛ֨᩵; {:try_start_f .. :try_end_f} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_f .. :try_end_f} :catch_1
    .catch Ll/֫۠᩵; {:try_start_f .. :try_end_f} :catch_0
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    :catchall_1
    move-exception v0

    goto :goto_3

    :catch_0
    move-exception v0

    .line 603
    :try_start_10
    invoke-direct/range {p0 .. p2}, Ll/۟֨᩵;->ᩳ(J)V

    .line 604
    throw v0

    :catch_1
    move-exception v0

    .line 599
    iput v13, v1, Ll/۟֨᩵;->ۗ:I

    .line 600
    invoke-direct/range {p0 .. p2}, Ll/۟֨᩵;->ᩳ(J)V

    .line 601
    new-instance v4, Ll/֫۠᩵;

    .line 66
    invoke-direct {v4, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 601
    throw v4

    :catch_2
    move-exception v0

    .line 594
    invoke-direct/range {p0 .. p2}, Ll/۟֨᩵;->ᩳ(J)V

    const/4 v4, 0x0

    .line 596
    iput v4, v1, Ll/۟֨᩵;->ۗ:I

    .line 597
    throw v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    .line 609
    :goto_3
    :try_start_11
    iget v4, v1, Ll/۟֨᩵;->ۗ:I

    if-eqz v4, :cond_14

    if-eq v4, v15, :cond_14

    if-eq v4, v14, :cond_14

    const/4 v5, 0x5

    if-eq v4, v5, :cond_14

    if-eq v4, v13, :cond_14

    .line 611
    sget-object v5, Ll/۟֨᩵;->ۨ:Ll/֫᩻֨;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Invalid state: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v5, v4}, Ll/֫᩻֨;->֫(Ljava/lang/String;)V

    .line 612
    iput v13, v1, Ll/۟֨᩵;->ۗ:I

    .line 613
    invoke-direct/range {p0 .. p2}, Ll/۟֨᩵;->ᩳ(J)V

    .line 615
    :cond_14
    throw v0

    :catchall_2
    move-exception v0

    monitor-exit v16
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_2

    throw v0
.end method

.method public abstract ۧ(ZZ)Z
.end method

.method public final ܳ()J
    .locals 2

    .line 162
    iget-object v0, p0, Ll/۟֨᩵;->ۤ:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    return-wide v0
.end method

.method public abstract ܽ(Ll/۟ܺ᩵;)J
.end method

.method public final declared-synchronized ܽ()V
    .locals 2

    move-object v0, p0

    monitor-enter v0

    const/4 v1, 0x1

    .line 650
    :try_start_0
    invoke-virtual {p0, v1, v1}, Ll/۟֨᩵;->֫(ZZ)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

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

.method public abstract ᩳ()V
.end method

.method public ᩻()Z
    .locals 2

    .line 185
    iget v0, p0, Ll/۟֨᩵;->ۗ:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    iget v0, p0, Ll/۟֨᩵;->ۗ:I

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    iget v0, p0, Ll/۟֨᩵;->ۗ:I

    const/4 v1, 0x6

    if-eq v0, v1, :cond_1

    iget v0, p0, Ll/۟֨᩵;->ۗ:I

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
