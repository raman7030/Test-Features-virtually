.class public final Ll/᩷֨᩵;
.super Ll/۟֨᩵;
.source "YA21"

# interfaces
.implements Ll/ۢ֨᩵;


# static fields
.field public static ᩴ֫:Ll/֫᩻֨;


# instance fields
.field public ֫֫:Ljava/io/InputStream;

.field public ۖ֫:Ljava/lang/String;

.field public final ۘ֫:Ll/ᩴۡ᩵;

.field public ۜ֫:J

.field public ۟:Ll/ܿۖ᩵;

.field public ۡ֫:Z

.field public final ۢ֫:Z

.field public final ۧ֫:Ljava/util/concurrent/atomic/AtomicLong;

.field public final ܰ:Ljava/util/concurrent/Semaphore;

.field public ܳ֫:[B

.field public ܺ֫:Ljava/net/Socket;

.field public ܽ֫:Ll/᩷ۖ᩵;

.field public ܿ֫:I

.field public ᩳ֫:Ljava/io/OutputStream;

.field public final ᩷֫:Ljava/util/LinkedList;

.field public ᩺:Ll/ۘۡ᩵;

.field public final ᩻֫:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 108
    const-class v0, Ll/᩷֨᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ll/ᩴۡ᩵;Ll/ۘۡ᩵;IZ)V
    .locals 4

    .line 139
    invoke-direct {p0}, Ll/۟֨᩵;-><init>()V

    const/4 v0, 0x0

    .line 110
    iput-boolean v0, p0, Ll/᩷֨᩵;->ۡ֫:Z

    .line 116
    new-instance v1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v1, p0, Ll/᩷֨᩵;->ۧ֫:Ljava/util/concurrent/atomic/AtomicLong;

    const/16 v1, 0x400

    new-array v1, v1, [B

    .line 119
    iput-object v1, p0, Ll/᩷֨᩵;->᩻֫:[B

    .line 121
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    iput-object v1, p0, Ll/᩷֨᩵;->᩷֫:Ljava/util/LinkedList;

    const/4 v1, 0x0

    .line 123
    iput-object v1, p0, Ll/᩷֨᩵;->ۖ֫:Ljava/lang/String;

    .line 132
    new-instance v1, Ljava/util/concurrent/Semaphore;

    const/4 v2, 0x1

    invoke-direct {v1, v2, v2}, Ljava/util/concurrent/Semaphore;-><init>(IZ)V

    iput-object v1, p0, Ll/᩷֨᩵;->ܰ:Ljava/util/concurrent/Semaphore;

    const/16 v1, 0x40

    new-array v1, v1, [B

    .line 136
    iput-object v1, p0, Ll/᩷֨᩵;->ܳ֫:[B

    .line 140
    iput-object p1, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    if-nez p4, :cond_0

    .line 142
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Ll/᩷֨᩵;->ۢ֫:Z

    .line 143
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p1

    check-cast p1, Ll/ܰۡ᩵;

    invoke-virtual {p1}, Ll/ܰۡ᩵;->֫֫()I

    move-result p1

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/᩷֨᩵;->ۜ֫:J

    .line 145
    iput-object p2, p0, Ll/᩷֨᩵;->᩺:Ll/ۘۡ᩵;

    .line 146
    iput p3, p0, Ll/᩷֨᩵;->ܿ֫:I

    return-void
.end method

.method private ֫(Ll/۟ܺ᩵;Z)I
    .locals 5

    if-eqz p2, :cond_0

    .line 561
    invoke-virtual {p0, p1}, Ll/᩷֨᩵;->ܽ(Ll/۟ܺ᩵;)J

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    .line 563
    invoke-interface {p1, v0, v1}, Ll/ܰܺ᩵;->֫(J)V

    .line 564
    iget-object p2, p0, Ll/᩷֨᩵;->ۧ֫:Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v0, 0x1

    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    :goto_0
    const/4 p2, 0x4

    .line 566
    iget-object v0, p0, Ll/᩷֨᩵;->᩻֫:[B

    invoke-interface {p1, p2, v0}, Ll/ܰܺ᩵;->֫(I[B)I

    move-result v1

    const v2, 0xffff

    and-int/2addr v2, v1

    const/4 v3, 0x0

    .line 567
    invoke-static {v2, v3, v0}, Ll/ۗ֨᩵;->֫(II[B)V

    .line 569
    sget-object v2, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    invoke-interface {v2}, Ll/֫᩻֨;->ܽ()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 570
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, p1}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 571
    invoke-static {v0, p2, v1}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, p1}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 574
    :cond_1
    iget-object p1, p0, Ll/᩷֨᩵;->ᩳ֫:Ljava/io/OutputStream;

    add-int/lit8 p2, v1, 0x4

    invoke-virtual {p1, v0, v3, p2}, Ljava/io/OutputStream;->write([BII)V

    .line 575
    iget-object p1, p0, Ll/᩷֨᩵;->ᩳ֫:Ljava/io/OutputStream;

    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    const-string p1, "Wrote negotiate request"

    .line 576
    invoke-interface {v2, p1}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    return v1
.end method

.method private ֫(I)Ll/᩻ۖ᩵;
    .locals 8

    .line 476
    iget-object v0, p0, Ll/۟֨᩵;->᩸:Ljava/lang/Object;

    monitor-enter v0

    const/16 v1, 0x8b

    if-ne p1, v1, :cond_0

    .line 478
    :try_start_0
    invoke-virtual {p0}, Ll/᩷֨᩵;->ܰ()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_1

    :cond_0
    if-nez p1, :cond_1

    const/16 p1, 0x1bd

    .line 483
    :cond_1
    new-instance v1, Ljava/net/Socket;

    invoke-direct {v1}, Ljava/net/Socket;-><init>()V

    iput-object v1, p0, Ll/᩷֨᩵;->ܺ֫:Ljava/net/Socket;

    .line 486
    new-instance v2, Ljava/net/InetSocketAddress;

    iget-object v3, p0, Ll/᩷֨᩵;->᩺:Ll/ۘۡ᩵;

    invoke-interface {v3}, Ll/ۘۡ᩵;->֫()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, p1}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    iget-object p1, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p1

    check-cast p1, Ll/ܰۡ᩵;

    invoke-virtual {p1}, Ll/ܰۡ᩵;->ܿ()I

    move-result p1

    invoke-virtual {v1, v2, p1}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    .line 487
    iget-object p1, p0, Ll/᩷֨᩵;->ܺ֫:Ljava/net/Socket;

    iget-object v1, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    invoke-interface {v1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v1

    check-cast v1, Ll/ܰۡ᩵;

    invoke-virtual {v1}, Ll/ܰۡ᩵;->ۧ֫()I

    move-result v1

    invoke-virtual {p1, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 489
    iget-object p1, p0, Ll/᩷֨᩵;->ܺ֫:Ljava/net/Socket;

    invoke-virtual {p1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p1

    iput-object p1, p0, Ll/᩷֨᩵;->ᩳ֫:Ljava/io/OutputStream;

    .line 490
    iget-object p1, p0, Ll/᩷֨᩵;->ܺ֫:Ljava/net/Socket;

    invoke-virtual {p1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    iput-object p1, p0, Ll/᩷֨᩵;->֫֫:Ljava/io/InputStream;

    .line 493
    :goto_0
    iget-object p1, p0, Ll/᩷֨᩵;->ܰ:Ljava/util/concurrent/Semaphore;

    invoke-virtual {p1}, Ljava/util/concurrent/Semaphore;->drainPermits()I

    move-result p1

    if-nez p1, :cond_2

    .line 494
    sget-object p1, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    const-string v1, "It appears we previously lost some credits"

    invoke-interface {p1, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 497
    :cond_2
    iget-boolean p1, p0, Ll/᩷֨᩵;->ۡ֫:Z

    const/4 v1, 0x0

    if-nez p1, :cond_b

    .line 267
    iget-object p1, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    .line 497
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 502
    new-instance p1, Ll/ۢۘ᩵;

    .line 267
    iget-object v2, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    .line 502
    invoke-interface {v2}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v2

    iget-boolean v3, p0, Ll/᩷֨᩵;->ۢ֫:Z

    invoke-direct {p1, v2, v3}, Ll/ۢۘ᩵;-><init>(Ll/֨ۡ᩵;Z)V

    const/4 v2, 0x1

    .line 503
    invoke-direct {p0, p1, v2}, Ll/᩷֨᩵;->֫(Ll/۟ܺ᩵;Z)I

    move-result v3

    .line 504
    invoke-direct {p0}, Ll/᩷֨᩵;->۟()V

    .line 508
    iget-boolean v4, p0, Ll/᩷֨᩵;->ۡ֫:Z

    const/4 v5, 0x0

    const/4 v6, 0x4

    if-nez v4, :cond_6

    .line 267
    iget-object v2, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    .line 509
    invoke-interface {v2}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v2

    check-cast v2, Ll/ܰۡ᩵;

    invoke-virtual {v2}, Ll/ܰۡ᩵;->ۚ()Ll/᩸ۡ᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩸ۡ᩵;->ۧ()Z

    move-result v2

    if-nez v2, :cond_5

    .line 512
    new-instance v2, Ll/ۡۘ᩵;

    .line 267
    iget-object v4, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    .line 512
    invoke-direct {v2, v4}, Ll/ۡۘ᩵;-><init>(Ll/ᩴۡ᩵;)V

    .line 513
    iget-object v4, p0, Ll/᩷֨᩵;->᩻֫:[B

    invoke-virtual {v2, v4}, Ll/ۨۖ᩵;->decode([B)I

    .line 514
    invoke-virtual {v2}, Ll/ۨۖ᩵;->᩷()V

    .line 516
    sget-object v4, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    invoke-interface {v4}, Ll/֫᩻֨;->ܽ()Z

    move-result v7

    if-eqz v7, :cond_3

    .line 517
    invoke-virtual {v2}, Ll/ۡۘ᩵;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v4, v7}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 518
    iget-object v7, p0, Ll/᩷֨᩵;->᩻֫:[B

    invoke-static {v7, v6, v3}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v4, v3}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 545
    :cond_3
    invoke-virtual {v2}, Ll/ۡۘ᩵;->ۡ֫()I

    move-result v3

    if-lez v3, :cond_4

    .line 547
    iget-object v4, p0, Ll/᩷֨᩵;->ܰ:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v4, v3}, Ljava/util/concurrent/Semaphore;->release(I)V

    .line 549
    :cond_4
    iget-object v3, p0, Ll/᩷֨᩵;->᩻֫:[B

    invoke-static {v3, v5}, Ljava/util/Arrays;->fill([BB)V

    .line 550
    new-instance v3, Ll/᩻ۖ᩵;

    invoke-direct {v3, p1, v2, v1, v1}, Ll/᩻ۖ᩵;-><init>(Ll/ۜۖ᩵;Ll/᩷ۖ᩵;[B[B)V

    monitor-exit v0

    return-object v3

    .line 510
    :cond_5
    new-instance p1, Ll/᩵ۡ᩵;

    const-string v1, "Server does not support SMB2"

    .line 58
    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 510
    throw p1

    .line 521
    :cond_6
    new-instance p1, Ll/ۗ᩵᩵;

    .line 267
    iget-object v3, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    .line 521
    invoke-interface {v3}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v3

    invoke-direct {p1, v3}, Ll/ۗ᩵᩵;-><init>(Ll/֨ۡ᩵;)V

    .line 522
    iget-object v3, p0, Ll/᩷֨᩵;->᩻֫:[B

    .line 536
    invoke-virtual {p1, v3, v6, v5}, Ll/ۗᩴ᩵;->֫([BIZ)I

    .line 523
    invoke-virtual {p1}, Ll/۫ᩴ᩵;->᩷()V

    .line 525
    invoke-virtual {p1}, Ll/ۗ᩵᩵;->ۚ֫()I

    move-result v3

    const/16 v4, 0x2ff

    if-ne v3, v4, :cond_7

    .line 526
    invoke-direct {p0, p1}, Ll/᩷֨᩵;->ۧ(Ll/ۗ᩵᩵;)Ll/᩻ۖ᩵;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 527
    :cond_7
    invoke-virtual {p1}, Ll/ۗ᩵᩵;->ۚ֫()I

    move-result v3

    const/16 v4, 0x202

    if-ne v3, v4, :cond_a

    .line 83
    invoke-virtual {p1}, Ll/ۗᩴ᩵;->ᩳ֫()I

    move-result v3

    if-lez v3, :cond_8

    .line 533
    iget-object v4, p0, Ll/᩷֨᩵;->ܰ:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v4, v3}, Ljava/util/concurrent/Semaphore;->release(I)V

    .line 535
    :cond_8
    iget-object v3, p0, Ll/᩷֨᩵;->᩻֫:[B

    invoke-static {v3, v5}, Ljava/util/Arrays;->fill([BB)V

    .line 536
    new-instance v3, Ll/᩻ۖ᩵;

    new-instance v4, Ll/ۙ᩵᩵;

    .line 267
    iget-object v5, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    .line 538
    invoke-interface {v5}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v5

    .line 539
    iget-boolean v6, p0, Ll/᩷֨᩵;->ۢ֫:Z

    if-eqz v6, :cond_9

    const/4 v2, 0x2

    :cond_9
    invoke-direct {v4, v5, v2}, Ll/ۙ᩵᩵;-><init>(Ll/֨ۡ᩵;I)V

    invoke-direct {v3, v4, p1, v1, v1}, Ll/᩻ۖ᩵;-><init>(Ll/ۜۖ᩵;Ll/᩷ۖ᩵;[B[B)V

    monitor-exit v0

    return-object v3

    .line 528
    :cond_a
    new-instance p1, Ll/᩵ۡ᩵;

    const-string v1, "Server returned invalid dialect verison in multi protocol negotiation"

    .line 58
    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 528
    throw p1

    .line 498
    :cond_b
    sget-object p1, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    const-string v2, "Using SMB2 only negotiation"

    invoke-interface {p1, v2}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 499
    invoke-direct {p0, v1}, Ll/᩷֨᩵;->ۧ(Ll/ۗ᩵᩵;)Ll/᩻ۖ᩵;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 551
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private ֫(Ll/֫ۖ᩵;Ljava/lang/String;Ll/ܽۖ᩵;)V
    .locals 8

    .line 1467
    iget-object v0, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    invoke-interface {v0}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    :try_start_0
    iget-object v3, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    .line 1469
    invoke-interface {p3}, Ll/ܽۖ᩵;->֫()Ljava/lang/String;

    move-result-object v5

    invoke-interface {p3}, Ll/ܽۖ᩵;->ܽ()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x1

    move-object v2, p0

    move-object v4, p2

    invoke-virtual/range {v2 .. v7}, Ll/᩷֨᩵;->֫(Ll/ᩴۡ᩵;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ll/ۡۖ᩵;

    move-result-object v1
    :try_end_0
    .catch Ll/᩵ۡ᩵; {:try_start_0 .. :try_end_0} :catch_0

    .line 1474
    sget-object v2, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    if-nez v1, :cond_1

    .line 1475
    invoke-interface {v2}, Ll/֫᩻֨;->֫()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 1476
    invoke-interface {p1}, Ll/ܰ֨᩵;->getErrorCode()I

    move-result p2

    const/16 p3, 0x8

    invoke-static {p2, p3}, Ll/۫֨᩵;->֫(II)Ljava/lang/String;

    move-result-object p2

    const-string p3, "Error code: 0x"

    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {v2, p2}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 1478
    :cond_0
    new-instance p2, Ll/ۗۚ᩵;

    invoke-interface {p1}, Ll/ܰ֨᩵;->getErrorCode()I

    move-result p1

    invoke-direct {p2, p1}, Ll/ۗۚ᩵;-><init>(I)V

    throw p2

    .line 1481
    :cond_1
    invoke-interface {p3}, Ll/ܽۖ᩵;->ܽ()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-interface {v0}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1484
    :cond_2
    invoke-interface {v2}, Ll/֫᩻֨;->֫()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 1485
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p3, "Got referral "

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, p1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 1488
    :cond_3
    invoke-interface {v0}, Ll/ᩴۡ᩵;->ᩳ()Ll/ܶۡ᩵;

    move-result-object p1

    check-cast p1, Ll/ܰ֡᩵;

    invoke-virtual {p1, v0, p2, v1}, Ll/ܰ֡᩵;->֫(Ll/ᩴۡ᩵;Ljava/lang/String;Ll/ۡۖ᩵;)V

    .line 1489
    new-instance p1, Ll/۟֡᩵;

    invoke-direct {p1, v1}, Ll/۟֡᩵;-><init>(Ll/ۡۖ᩵;)V

    throw p1

    :catch_0
    move-exception p1

    .line 1471
    new-instance p2, Ll/ۗۚ᩵;

    const-string p3, "Failed to get DFS referral"

    invoke-direct {p2, p3, p1}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2
.end method

.method private ֫(Ll/ܰܺ᩵;)V
    .locals 8

    const-string v0, "Invalid payload size: "

    .line 1244
    iget-object v1, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    invoke-interface {v1}, Ll/ᩴۡ᩵;->᩷()Ll/ۤ֡᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۤ֡᩵;->֫()[B

    move-result-object v2

    .line 1246
    :try_start_0
    iget-object v3, p0, Ll/᩷֨᩵;->᩻֫:[B

    const/4 v4, 0x0

    const/16 v5, 0x24

    invoke-static {v3, v4, v2, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v3, 0x2

    .line 1247
    invoke-static {v3, v2}, Ll/ۗ֨᩵;->֫(I[B)S

    move-result v3

    const v4, 0xffff

    and-int/2addr v3, v4

    const/16 v6, 0x21

    if-lt v3, v6, :cond_4

    add-int/lit8 v6, v3, 0x4

    .line 1248
    invoke-interface {v1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v7

    check-cast v7, Ll/ܰۡ᩵;

    invoke-virtual {v7}, Ll/ܰۡ᩵;->᩵()I

    move-result v7

    invoke-static {v4, v7}, Ljava/lang/Math;->min(II)I

    move-result v4

    if-gt v6, v4, :cond_4

    const/16 v0, 0x9

    .line 1251
    invoke-static {v0, v2}, Ll/ۗ֨᩵;->ᩳ(I[B)I

    move-result v0

    .line 1252
    invoke-interface {p1}, Ll/ܰܺ᩵;->᩶()I

    move-result v4

    const/16 v6, 0x2e

    if-ne v4, v6, :cond_2

    if-eqz v0, :cond_0

    const v4, -0x7ffffffb

    if-ne v0, v4, :cond_2

    .line 1255
    :cond_0
    move-object v0, p1

    check-cast v0, Ll/֡ۘ᩵;

    .line 1258
    iget-object v3, p0, Ll/᩷֨᩵;->֫֫:Ljava/io/InputStream;

    const/16 v4, 0x1b

    invoke-static {v3, v2, v5, v4}, Ll/۟֨᩵;->֫(Ljava/io/InputStream;[BII)I

    .line 1260
    invoke-interface {p1, v2}, Ll/ܰܺ᩵;->decode([B)I

    .line 1262
    invoke-virtual {v0}, Ll/֡ۘ᩵;->ۘ֫()I

    move-result p1

    add-int/lit8 p1, p1, -0x3b

    .line 1263
    invoke-virtual {v0}, Ll/ۨۖ᩵;->֫֫()I

    move-result v3

    if-lez v3, :cond_1

    if-lez p1, :cond_1

    const/4 v3, 0x4

    if-ge p1, v3, :cond_1

    .line 1264
    iget-object v3, p0, Ll/᩷֨᩵;->֫֫:Ljava/io/InputStream;

    const/16 v4, 0x3f

    invoke-static {v3, v2, v4, p1}, Ll/۟֨᩵;->֫(Ljava/io/InputStream;[BII)I

    .line 1266
    :cond_1
    invoke-virtual {v0}, Ll/֡ۘ᩵;->ۖ֫()I

    move-result p1

    if-lez p1, :cond_3

    .line 1267
    iget-object p1, p0, Ll/᩷֨᩵;->֫֫:Ljava/io/InputStream;

    invoke-virtual {v0}, Ll/֡ۘ᩵;->ܺ֫()[B

    move-result-object v3

    invoke-virtual {v0}, Ll/֡ۘ᩵;->ᩴ֫()I

    move-result v4

    invoke-virtual {v0}, Ll/֡ۘ᩵;->ۖ֫()I

    move-result v0

    invoke-static {p1, v3, v4, v0}, Ll/۟֨᩵;->֫(Ljava/io/InputStream;[BII)I

    goto :goto_0

    .line 1270
    :cond_2
    iget-object v0, p0, Ll/᩷֨᩵;->֫֫:Ljava/io/InputStream;

    add-int/lit8 v3, v3, -0x20

    invoke-static {v0, v2, v5, v3}, Ll/۟֨᩵;->֫(Ljava/io/InputStream;[BII)I

    .line 1271
    invoke-interface {p1, v2}, Ll/ܰܺ᩵;->decode([B)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1274
    :cond_3
    :goto_0
    invoke-interface {v1}, Ll/ᩴۡ᩵;->᩷()Ll/ۤ֡᩵;

    move-result-object p1

    invoke-virtual {p1, v2}, Ll/ۤ֡᩵;->֫([B)V

    return-void

    .line 1249
    :cond_4
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    .line 1274
    invoke-interface {v1}, Ll/ᩴۡ᩵;->᩷()Ll/ۤ֡᩵;

    move-result-object v0

    invoke-virtual {v0, v2}, Ll/ۤ֡᩵;->֫([B)V

    .line 1275
    throw p1
.end method

.method private ۟()V
    .locals 5

    .line 591
    iget-object v0, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    :try_start_0
    iget-object v1, p0, Ll/᩷֨᩵;->ܺ֫:Ljava/net/Socket;

    invoke-interface {v0}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v2

    check-cast v2, Ll/ܰۡ᩵;

    invoke-virtual {v2}, Ll/ܰۡ᩵;->ܿ()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 592
    invoke-virtual {p0}, Ll/᩷֨᩵;->ۖ()Ljava/lang/Long;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_2

    .line 595
    iget-object v1, p0, Ll/᩷֨᩵;->ܺ֫:Ljava/net/Socket;

    invoke-interface {v0}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v0

    check-cast v0, Ll/ܰۡ᩵;

    invoke-virtual {v0}, Ll/ܰۡ᩵;->ۧ֫()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/net/Socket;->setSoTimeout(I)V

    const/4 v0, 0x2

    .line 597
    iget-object v1, p0, Ll/᩷֨᩵;->᩻֫:[B

    invoke-static {v0, v1}, Ll/ۗ֨᩵;->֫(I[B)S

    move-result v0

    const v2, 0xffff

    and-int/2addr v0, v2

    const/16 v2, 0x21

    if-lt v0, v2, :cond_1

    add-int/lit8 v2, v0, 0x4

    .line 598
    array-length v3, v1

    if-gt v2, v3, :cond_1

    .line 601
    iget-boolean v2, p0, Ll/᩷֨᩵;->ۡ֫:Z

    if-eqz v2, :cond_0

    const/16 v2, 0x40

    goto :goto_0

    :cond_0
    const/16 v2, 0x20

    .line 602
    :goto_0
    iget-object v3, p0, Ll/᩷֨᩵;->֫֫:Ljava/io/InputStream;

    add-int/lit8 v4, v2, 0x4

    sub-int/2addr v0, v2

    invoke-static {v3, v1, v4, v0}, Ll/۟֨᩵;->֫(Ljava/io/InputStream;[BII)I

    .line 603
    sget-object v0, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    const-string v1, "Read negotiate response"

    invoke-interface {v0, v1}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    return-void

    .line 599
    :cond_1
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Invalid payload size: "

    .line 0
    invoke-static {v0, v2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 599
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 593
    :cond_2
    :try_start_1
    new-instance v1, Ljava/io/IOException;

    const-string v2, "transport closed in negotiate"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v1

    .line 595
    iget-object v2, p0, Ll/᩷֨᩵;->ܺ֫:Ljava/net/Socket;

    invoke-interface {v0}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v0

    check-cast v0, Ll/ܰۡ᩵;

    invoke-virtual {v0}, Ll/ܰۡ᩵;->ۧ֫()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 596
    throw v1
.end method

.method private ۧ(Ll/ۗ᩵᩵;)Ll/᩻ۖ᩵;
    .locals 10

    .line 616
    iget-object v0, p0, Ll/᩷֨᩵;->ܰ:Ljava/util/concurrent/Semaphore;

    iget-object v1, p0, Ll/᩷֨᩵;->᩻֫:[B

    .line 618
    invoke-virtual {p0, p1}, Ll/᩷֨᩵;->֫(Ll/ۗ᩵᩵;)I

    move-result v2

    .line 621
    new-instance v3, Ll/ۙ᩵᩵;

    iget-object v4, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    invoke-interface {v4}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v5

    invoke-direct {v3, v5, v2}, Ll/ۙ᩵᩵;-><init>(Ll/֨ۡ᩵;I)V

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    .line 626
    :try_start_0
    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->availablePermits()I

    move-result v7

    rsub-int v7, v7, 0x200

    invoke-static {v6, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    .line 154
    invoke-virtual {v3, v7}, Ll/ۗᩴ᩵;->ۜ(I)V

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 628
    :goto_0
    invoke-direct {p0, v3, p1}, Ll/᩷֨᩵;->֫(Ll/۟ܺ᩵;Z)I

    move-result p1

    .line 629
    invoke-interface {v4}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v7

    check-cast v7, Ll/ܰۡ᩵;

    invoke-virtual {v7}, Ll/ܰۡ᩵;->֡()Ll/᩸ۡ᩵;

    move-result-object v7

    sget-object v8, Ll/᩸ۡ᩵;->ۛ:Ll/᩸ۡ᩵;

    invoke-virtual {v7, v8}, Ll/᩸ۡ᩵;->֫(Ll/᩸ۡ᩵;)Z

    move-result v7

    const/4 v8, 0x4

    if-eqz v7, :cond_1

    .line 631
    new-array v9, p1, [B

    .line 632
    invoke-static {v1, v8, v9, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_1

    :cond_1
    move-object v9, v5

    .line 635
    :goto_1
    invoke-direct {p0}, Ll/᩷֨᩵;->۟()V

    .line 637
    invoke-virtual {v3, v4}, Ll/۬ᩴ᩵;->ۧ(Ll/ᩴۡ᩵;)Ll/۫ᩴ᩵;

    move-result-object p1

    check-cast p1, Ll/ۗ᩵᩵;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 536
    :try_start_1
    invoke-virtual {p1, v1, v8, v2}, Ll/ۗᩴ᩵;->֫([BIZ)I

    move-result v4

    .line 639
    invoke-virtual {p1}, Ll/۫ᩴ᩵;->᩷()V

    if-eqz v7, :cond_2

    .line 642
    new-array v5, v4, [B

    .line 643
    invoke-static {v1, v8, v5, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_2

    :cond_2
    move-object v9, v5

    .line 648
    :goto_2
    sget-object v4, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    invoke-interface {v4}, Ll/֫᩻֨;->ܽ()Z

    move-result v7

    if-eqz v7, :cond_3

    .line 649
    invoke-virtual {p1}, Ll/ۗ᩵᩵;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v4, v7}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 650
    invoke-static {v1, v8, v2}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v4, v7}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 652
    :cond_3
    new-instance v4, Ll/᩻ۖ᩵;

    invoke-direct {v4, v3, p1, v9, v5}, Ll/᩻ۖ᩵;-><init>(Ll/ۜۖ᩵;Ll/᩷ۖ᩵;[B[B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 261
    invoke-virtual {p1}, Ll/ۗᩴ᩵;->ᩳ֫()I

    move-result p1

    if-nez p1, :cond_4

    goto :goto_3

    :cond_4
    move v6, p1

    .line 658
    :goto_3
    invoke-virtual {v0, v6}, Ljava/util/concurrent/Semaphore;->release(I)V

    .line 659
    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([BB)V

    return-object v4

    :catchall_0
    move-exception v3

    move-object v5, p1

    goto :goto_4

    :catchall_1
    move-exception p1

    move-object v3, p1

    :goto_4
    if-eqz v5, :cond_5

    .line 261
    invoke-virtual {v5}, Ll/ۗᩴ᩵;->ᩳ֫()I

    move-result p1

    goto :goto_5

    :cond_5
    const/4 p1, 0x0

    :goto_5
    if-nez p1, :cond_6

    goto :goto_6

    :cond_6
    move v6, p1

    .line 658
    :goto_6
    invoke-virtual {v0, v6}, Ljava/util/concurrent/Semaphore;->release(I)V

    .line 659
    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([BB)V

    .line 660
    throw v3
.end method

.method private ۧ(Ll/ܰܺ᩵;)V
    .locals 20

    move-object/from16 v1, p0

    const/4 v0, 0x2

    .line 1162
    iget-object v2, v1, Ll/᩷֨᩵;->᩻֫:[B

    invoke-static {v0, v2}, Ll/ۗ֨᩵;->֫(I[B)S

    move-result v3

    const v4, 0xffff

    and-int/2addr v3, v4

    const/4 v4, 0x1

    aget-byte v4, v2, v4

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x10

    or-int/2addr v3, v4

    const/16 v4, 0x41

    if-lt v3, v4, :cond_12

    const/4 v4, 0x0

    .line 1167
    aget-byte v5, v2, v4

    if-nez v5, :cond_11

    const/4 v5, 0x4

    aget-byte v6, v2, v5

    const/4 v7, -0x2

    if-ne v6, v7, :cond_11

    const/4 v6, 0x5

    aget-byte v6, v2, v6

    const/16 v7, 0x53

    if-ne v6, v7, :cond_11

    const/4 v6, 0x6

    aget-byte v6, v2, v6

    const/16 v7, 0x4d

    if-ne v6, v7, :cond_11

    const/4 v6, 0x7

    aget-byte v6, v2, v6

    const/16 v7, 0x42

    if-ne v6, v7, :cond_11

    const/16 v6, 0x18

    .line 1172
    invoke-static {v6, v2}, Ll/ۗ֨᩵;->ᩳ(I[B)I

    move-result v6

    .line 1173
    iget-object v7, v1, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    invoke-interface {v7}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v8

    check-cast v8, Ll/ܰۡ᩵;

    invoke-virtual {v8}, Ll/ܰۡ᩵;->᩵()I

    move-result v8

    if-eqz v6, :cond_0

    move v9, v6

    goto :goto_0

    :cond_0
    move v9, v3

    :goto_0
    const-string v10, "Message size %d exceeds maxiumum buffer size %d"

    if-gt v9, v8, :cond_10

    .line 1179
    move-object/from16 v9, p1

    check-cast v9, Ll/۫ᩴ᩵;

    .line 1180
    invoke-interface {v7}, Ll/ᩴۡ᩵;->᩷()Ll/ۤ֡᩵;

    move-result-object v11

    invoke-virtual {v11}, Ll/ۤ֡᩵;->֫()[B

    move-result-object v11

    if-eqz v6, :cond_1

    move v12, v6

    goto :goto_1

    :cond_1
    move v12, v3

    :goto_1
    const/16 v13, 0x40

    .line 1185
    :try_start_0
    invoke-static {v2, v5, v11, v4, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1186
    iget-object v2, v1, Ll/᩷֨᩵;->֫֫:Ljava/io/InputStream;

    add-int/lit8 v5, v12, -0x40

    invoke-static {v2, v11, v13, v5}, Ll/۟֨᩵;->֫(Ljava/io/InputStream;[BII)I

    .line 1188
    invoke-virtual {v9, v12}, Ll/ۗᩴ᩵;->᩷(I)V

    .line 536
    invoke-virtual {v9, v11, v4, v4}, Ll/ۗᩴ᩵;->֫([BIZ)I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v5, 0x3

    const-string v14, "WHAT? ( read %d decoded %d ): %s"

    if-gt v2, v12, :cond_f

    const/4 v15, 0x1

    const-string v0, "Overlapping commands"

    if-eqz v6, :cond_3

    if-gt v2, v6, :cond_2

    goto :goto_2

    .line 1194
    :cond_2
    :try_start_1
    new-instance v2, Ljava/io/IOException;

    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_3
    :goto_2
    sub-int/2addr v3, v12

    const/4 v2, 0x2

    :goto_3
    if-lez v3, :cond_e

    if-eqz v6, :cond_e

    .line 1199
    invoke-virtual {v9}, Ll/ۗᩴ᩵;->᩹()Ll/֫ۖ᩵;

    move-result-object v6

    move-object v9, v6

    check-cast v9, Ll/۫ᩴ᩵;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1200
    sget-object v6, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    if-nez v9, :cond_4

    :try_start_2
    const-string v0, "Response not properly set up"

    .line 1201
    invoke-interface {v6, v0}, Ll/֫᩻֨;->ᩳ(Ljava/lang/String;)V

    .line 1202
    iget-object v0, v1, Ll/᩷֨᩵;->֫֫:Ljava/io/InputStream;

    int-to-long v2, v3

    invoke-virtual {v0, v2, v3}, Ljava/io/InputStream;->skip(J)J

    goto/16 :goto_6

    .line 1207
    :cond_4
    iget-object v12, v1, Ll/᩷֨᩵;->֫֫:Ljava/io/InputStream;

    invoke-static {v12, v11, v4, v13}, Ll/۟֨᩵;->֫(Ljava/io/InputStream;[BII)I

    const/16 v12, 0x14

    .line 1208
    invoke-static {v12, v11}, Ll/ۗ֨᩵;->ᩳ(I[B)I

    move-result v12

    if-eqz v12, :cond_5

    if-gt v12, v8, :cond_6

    :cond_5
    if-nez v12, :cond_8

    if-le v3, v8, :cond_8

    .line 1211
    :cond_6
    new-instance v0, Ljava/io/IOException;

    if-eqz v12, :cond_7

    move v3, v12

    .line 1212
    :cond_7
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v3, v2, v4

    aput-object v5, v2, v15

    invoke-static {v10, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    if-eqz v12, :cond_9

    move v2, v12

    goto :goto_4

    :cond_9
    move v2, v3

    .line 1217
    :goto_4
    invoke-interface {v6}, Ll/֫᩻֨;->֫()Z

    move-result v4

    if-eqz v4, :cond_a

    const-string v13, "Compound next command %d read size %d remain %d"

    .line 1218
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v17

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v18

    const/16 v19, 0x0

    new-array v4, v5, [Ljava/lang/Object;

    aput-object v16, v4, v19

    aput-object v17, v4, v15

    const/4 v15, 0x2

    aput-object v18, v4, v15

    invoke-static {v13, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v6, v4}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    :cond_a
    const/4 v4, 0x2

    .line 1221
    invoke-virtual {v9, v2}, Ll/ۗᩴ᩵;->᩷(I)V

    .line 1222
    iget-object v6, v1, Ll/᩷֨᩵;->֫֫:Ljava/io/InputStream;

    add-int/lit8 v13, v2, -0x40

    const/16 v15, 0x40

    invoke-static {v6, v11, v15, v13}, Ll/۟֨᩵;->֫(Ljava/io/InputStream;[BII)I

    const/4 v6, 0x0

    const/4 v13, 0x1

    .line 1224
    invoke-virtual {v9, v11, v6, v13}, Ll/ۗᩴ᩵;->֫([BIZ)I

    move-result v6

    if-gt v6, v2, :cond_d

    if-eqz v12, :cond_c

    if-gt v6, v12, :cond_b

    goto :goto_5

    .line 1228
    :cond_b
    new-instance v2, Ljava/io/IOException;

    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_c
    :goto_5
    sub-int/2addr v3, v2

    const/4 v2, 0x2

    const/4 v4, 0x0

    const/4 v6, 0x1

    move v6, v12

    const/16 v13, 0x40

    const/4 v15, 0x1

    goto/16 :goto_3

    .line 1226
    :cond_d
    new-instance v0, Ljava/io/IOException;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v2, v5, v6

    const/4 v2, 0x1

    aput-object v3, v5, v2

    aput-object v9, v5, v4

    invoke-static {v14, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1233
    :cond_e
    :goto_6
    invoke-interface {v7}, Ll/ᩴۡ᩵;->᩷()Ll/ۤ֡᩵;

    move-result-object v0

    invoke-virtual {v0, v11}, Ll/ۤ֡᩵;->֫([B)V

    return-void

    :cond_f
    const/4 v0, 0x2

    .line 1192
    :try_start_3
    new-instance v3, Ljava/io/IOException;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v4, v5, v6

    const/4 v4, 0x1

    aput-object v2, v5, v4

    aput-object v9, v5, v0

    invoke-static {v14, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception v0

    .line 1233
    invoke-interface {v7}, Ll/ᩴۡ᩵;->᩷()Ll/ۤ֡᩵;

    move-result-object v2

    invoke-virtual {v2, v11}, Ll/ۤ֡᩵;->֫([B)V

    .line 1234
    throw v0

    .line 1176
    :cond_10
    new-instance v0, Ljava/io/IOException;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    const/4 v2, 0x1

    aput-object v3, v4, v2

    invoke-static {v10, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1169
    :cond_11
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Houston we have a synchronization problem"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1164
    :cond_12
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Invalid payload size: "

    .line 0
    invoke-static {v3, v2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1164
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ۧ([B)V
    .locals 3

    .line 1745
    iget-object v0, p0, Ll/᩷֨᩵;->ܳ֫:[B

    monitor-enter v0

    .line 1746
    :try_start_0
    array-length v1, p1

    iget-object v2, p0, Ll/᩷֨᩵;->ܳ֫:[B

    invoke-virtual {p0, v1, p1, v2}, Ll/᩷֨᩵;->֫(I[B[B)[B

    move-result-object p1

    iput-object p1, p0, Ll/᩷֨᩵;->ܳ֫:[B

    .line 1747
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private ܽ(Ll/۟ܺ᩵;Ll/֫ۖ᩵;Ljava/util/Set;)V
    .locals 8

    .line 1579
    invoke-interface {p1}, Ll/ܰܺ᩵;->᩶()I

    move-result v0

    invoke-interface {p2, v0}, Ll/ܰܺ᩵;->ܿ(I)V

    .line 1580
    check-cast p1, Ll/ᩳᩴ᩵;

    .line 1581
    check-cast p2, Ll/ܿᩴ᩵;

    .line 1582
    invoke-virtual {p2}, Ll/ܿᩴ᩵;->reset()V

    .line 267
    :try_start_0
    iget-object v0, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    .line 1590
    invoke-interface {v0}, Ll/ᩴۡ᩵;->᩷()Ll/ۤ֡᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۤ֡᩵;->֫()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ᩳᩴ᩵;->ۧ([B)V

    .line 1591
    invoke-virtual {p1}, Ll/ᩳᩴ᩵;->nextElement()V

    .line 1592
    invoke-virtual {p1}, Ll/ᩳᩴ᩵;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1593
    new-instance v0, Ll/۟ۖ᩵;

    .line 267
    iget-object v1, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    .line 1593
    invoke-interface {v1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/۟ۖ᩵;-><init>(Ll/֨ۡ᩵;)V

    .line 1594
    invoke-virtual {p0, p1, v0, p3}, Ll/۟֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;Ljava/util/Set;)Ll/ܰ֨᩵;

    .line 1595
    invoke-virtual {v0}, Ll/ۨۖ᩵;->getErrorCode()I

    move-result v1

    if-eqz v1, :cond_0

    .line 1596
    invoke-virtual {p0, p1, v0}, Ll/᩷֨᩵;->֫(Ll/ۨۖ᩵;Ll/ۨۖ᩵;)Z

    .line 1598
    :cond_0
    invoke-virtual {p1}, Ll/ᩳᩴ᩵;->nextElement()V

    invoke-virtual {p1}, Ll/ۨۖ᩵;->ۜ()J

    move-result-wide v0

    goto :goto_0

    .line 1600
    :cond_1
    invoke-virtual {p0, p1}, Ll/᩷֨᩵;->ܽ(Ll/۟ܺ᩵;)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :goto_0
    move-wide v1, v0

    .line 1604
    :try_start_1
    invoke-virtual {p2}, Ll/ۨۖ᩵;->ۤ()V

    .line 1605
    invoke-virtual {p0, p1}, Ll/᩷֨᩵;->ۧ(Ll/۟ܺ᩵;)I

    move-result v0

    int-to-long v3, v0

    .line 1606
    sget-object v0, Ll/֡ۚ᩵;->ۙ:Ll/֡ۚ᩵;

    invoke-interface {p3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1607
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    add-long/2addr v5, v3

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p2, v0}, Ll/ۨۖ᩵;->֫(Ljava/lang/Long;)V

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    .line 1609
    invoke-virtual {p2, v0}, Ll/ۨۖ᩵;->֫(Ljava/lang/Long;)V

    .line 267
    :goto_1
    iget-object v0, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    .line 1612
    invoke-interface {v0}, Ll/ᩴۡ᩵;->᩷()Ll/ۤ֡᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۤ֡᩵;->֫()[B

    move-result-object v0

    .line 1613
    invoke-virtual {p2, v0}, Ll/ܿᩴ᩵;->ܽ([B)V

    .line 1615
    iget-object v0, p0, Ll/۟֨᩵;->ۙ:Ll/ۧۤᩴ;

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v0, v5, p2}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1119
    :goto_2
    sget-object v0, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {p0, p1}, Ll/᩷֨᩵;->֫(Ll/۟ܺ᩵;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 1624
    :try_start_3
    invoke-virtual {p1}, Ll/ᩳᩴ᩵;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Ll/ᩳᩴ᩵;->nextElement()V

    goto :goto_2

    :cond_3
    move-object v0, p2

    .line 1629
    monitor-enter v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 1630
    :goto_3
    :try_start_4
    invoke-virtual {p2}, Ll/ۨۖ᩵;->۟()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-virtual {p2}, Ll/ܿᩴ᩵;->hasMoreElements()Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_4

    .line 1647
    :cond_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 1649
    :try_start_5
    invoke-virtual {p2}, Ll/ۨۖ᩵;->۟()Z

    move-result p3

    if-eqz p3, :cond_6

    .line 1653
    invoke-virtual {p2}, Ll/ۨۖ᩵;->getErrorCode()I

    move-result p3

    if-eqz p3, :cond_5

    .line 1654
    invoke-virtual {p0, p1, p2}, Ll/᩷֨᩵;->֫(Ll/ۨۖ᩵;Ll/ۨۖ᩵;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 1658
    :cond_5
    :try_start_6
    iget-object p3, p0, Ll/۟֨᩵;->ۙ:Ll/ۧۤᩴ;

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p3, v0}, Ll/ۧۤᩴ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    iget-object p3, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    .line 1659
    invoke-interface {p3}, Ll/ᩴۡ᩵;->᩷()Ll/ۤ֡᩵;

    move-result-object p3

    invoke-virtual {p2}, Ll/ܿᩴ᩵;->᩵֫()[B

    move-result-object p2

    invoke-virtual {p3, p2}, Ll/ۤ֡᩵;->֫([B)V
    :try_end_6
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 267
    iget-object p2, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    .line 1664
    invoke-interface {p2}, Ll/ᩴۡ᩵;->᩷()Ll/ۤ֡᩵;

    move-result-object p2

    invoke-virtual {p1}, Ll/ᩳᩴ᩵;->ܺ֫()[B

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/ۤ֡᩵;->֫([B)V

    return-void

    .line 1650
    :cond_6
    :try_start_7
    new-instance p3, Ll/֫۠᩵;

    const-string v0, "Failed to read response"

    .line 58
    invoke-direct {p3, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1650
    throw p3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 1631
    :cond_7
    :goto_4
    :try_start_8
    sget-object v5, Ll/֡ۚ᩵;->ۙ:Ll/֡ۚ᩵;

    invoke-interface {p3, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_9

    .line 1632
    invoke-virtual {p2, v3, v4}, Ljava/lang/Object;->wait(J)V

    .line 1633
    invoke-virtual {p2}, Ll/ۨۖ᩵;->ᩳ()Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    sub-long/2addr v3, v5

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-lez v7, :cond_8

    goto :goto_3

    .line 1635
    :cond_8
    new-instance p3, Ll/֫۠᩵;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " timedout waiting for response to "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 58
    invoke-direct {p3, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1635
    throw p3

    .line 1638
    :cond_9
    invoke-virtual {p2}, Ljava/lang/Object;->wait()V

    .line 1639
    sget-object v5, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    invoke-interface {v5}, Ll/֫᩻֨;->ܽ()Z

    move-result v6

    if-eqz v6, :cond_a

    .line 1640
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Wait returned "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/᩷֨᩵;->᩻()Z

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 1642
    :cond_a
    invoke-virtual {p0}, Ll/᩷֨᩵;->᩻()Z

    move-result v5

    if-nez v5, :cond_b

    goto/16 :goto_3

    .line 1643
    :cond_b
    new-instance p3, Ljava/io/EOFException;

    const-string v3, "Transport closed while waiting for result"

    invoke-direct {p3, v3}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p3

    :catchall_0
    move-exception p3

    .line 1647
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :try_start_9
    throw p3

    :catch_0
    move-exception p3

    const-string v3, "send failed"

    .line 1121
    invoke-interface {v0, v3, p3}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 1123
    :try_start_a
    invoke-virtual {p0}, Ll/۟֨᩵;->ܽ()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    goto :goto_5

    :catch_1
    move-exception v3

    .line 1125
    :try_start_b
    invoke-virtual {p3, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    const-string v4, "disconnect failed"

    .line 1126
    invoke-interface {v0, v4, v3}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1128
    :goto_5
    throw p3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    :catchall_1
    move-exception p3

    .line 1658
    :try_start_c
    iget-object v0, p0, Ll/۟֨᩵;->ۙ:Ll/ۧۤᩴ;

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۧۤᩴ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    iget-object v0, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    .line 1659
    invoke-interface {v0}, Ll/ᩴۡ᩵;->᩷()Ll/ۤ֡᩵;

    move-result-object v0

    invoke-virtual {p2}, Ll/ܿᩴ᩵;->᩵֫()[B

    move-result-object p2

    invoke-virtual {v0, p2}, Ll/ۤ֡᩵;->֫([B)V

    .line 1660
    throw p3
    :try_end_c
    .catch Ljava/lang/InterruptedException; {:try_start_c .. :try_end_c} :catch_2
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    :catchall_2
    move-exception p2

    goto :goto_6

    :catch_2
    move-exception p2

    .line 1662
    :try_start_d
    new-instance p3, Ll/֫۠᩵;

    .line 66
    invoke-direct {p3, p2}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 1662
    throw p3
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 267
    :goto_6
    iget-object p3, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    .line 1664
    invoke-interface {p3}, Ll/ᩴۡ᩵;->᩷()Ll/ۤ֡᩵;

    move-result-object p3

    invoke-virtual {p1}, Ll/ᩳᩴ᩵;->ܺ֫()[B

    move-result-object p1

    invoke-virtual {p3, p1}, Ll/ۤ֡᩵;->֫([B)V

    .line 1665
    throw p2
.end method

.method private ᩳ(Ll/۟ܺ᩵;)Z
    .locals 5

    :goto_0
    const/4 v0, 0x1

    if-eqz p1, :cond_8

    .line 1553
    iget-boolean v1, p0, Ll/᩷֨᩵;->ۡ֫:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_6

    .line 1554
    move-object v1, p1

    check-cast v1, Ll/ۗᩴ᩵;

    invoke-interface {p1}, Ll/ܰܺ᩵;->ۧ()Ll/֫ۖ᩵;

    move-result-object v3

    .line 1398
    invoke-interface {v3}, Ll/ܰ֨᩵;->getErrorCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    goto :goto_2

    .line 1427
    :sswitch_0
    instance-of p1, v1, Ll/ܽۖ᩵;

    if-nez p1, :cond_0

    .line 1428
    new-instance p1, Ll/ۗۚ᩵;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Invalid request for a DFS NT_STATUS_PATH_NOT_COVERED response "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1430
    :cond_0
    check-cast v1, Ll/ܽۖ᩵;

    invoke-interface {v1}, Ll/ܽۖ᩵;->᩵()Ljava/lang/String;

    move-result-object p1

    .line 1431
    invoke-direct {p0, v3, p1, v1}, Ll/᩷֨᩵;->֫(Ll/֫ۖ᩵;Ljava/lang/String;Ll/ܽۖ᩵;)V

    const/4 p1, 0x0

    throw p1

    .line 1417
    :sswitch_1
    new-instance p1, Ll/᩹ۚ᩵;

    invoke-interface {v3}, Ll/ܰ֨᩵;->getErrorCode()I

    move-result v0

    .line 39
    invoke-direct {p1, v0}, Ll/ۗۚ᩵;-><init>(I)V

    .line 1417
    throw p1

    .line 1425
    :sswitch_2
    new-instance p1, Ll/֡֨᩵;

    invoke-direct {p1}, Ll/֡֨᩵;-><init>()V

    throw p1

    .line 1435
    :sswitch_3
    instance-of v0, v3, Ll/ۢ᩵᩵;

    if-eqz v0, :cond_1

    goto :goto_1

    .line 1438
    :cond_1
    instance-of v0, v3, Ll/ۘ᩵᩵;

    if-eqz v0, :cond_4

    .line 1439
    move-object v0, v3

    check-cast v0, Ll/ۘ᩵᩵;

    invoke-virtual {v0}, Ll/ۘ᩵᩵;->᩵֫()I

    move-result v0

    const v4, 0x11c017

    if-eq v0, v4, :cond_2

    const v4, 0x11400c

    if-ne v0, v4, :cond_4

    :cond_2
    :goto_1
    :sswitch_4
    const/4 v0, 0x0

    .line 1451
    :sswitch_5
    invoke-interface {v3}, Ll/ܰ֨᩵;->ۢ()Z

    move-result v1

    if-nez v1, :cond_3

    if-nez v0, :cond_7

    goto :goto_3

    .line 1452
    :cond_3
    new-instance p1, Ll/۠ۚ᩵;

    const-string v0, "Signature verification failed."

    .line 47
    invoke-direct {p1, v0}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    .line 1452
    throw p1

    .line 1446
    :cond_4
    :goto_2
    sget-object p1, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    invoke-interface {p1}, Ll/֫᩻֨;->֫()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1447
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Error code: 0x"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v3}, Ll/ܰ֨᩵;->getErrorCode()I

    move-result v2

    const/16 v4, 0x8

    invoke-static {v2, v4}, Ll/۫֨᩵;->֫(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " for "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 1449
    :cond_5
    new-instance p1, Ll/ۗۚ᩵;

    invoke-interface {v3}, Ll/ܰ֨᩵;->getErrorCode()I

    move-result v0

    invoke-direct {p1, v0}, Ll/ۗۚ᩵;-><init>(I)V

    throw p1

    .line 1558
    :cond_6
    move-object v0, p1

    check-cast v0, Ll/ۨۖ᩵;

    invoke-interface {p1}, Ll/ܰܺ᩵;->ۧ()Ll/֫ۖ᩵;

    move-result-object v1

    check-cast v1, Ll/ۨۖ᩵;

    invoke-virtual {p0, v0, v1}, Ll/᩷֨᩵;->֫(Ll/ۨۖ᩵;Ll/ۨۖ᩵;)Z

    move-result v0

    if-nez v0, :cond_7

    :goto_3
    return v2

    .line 1562
    :cond_7
    invoke-interface {p1}, Ll/۟ܺ᩵;->getNext()Ll/۟ܺ᩵;

    move-result-object p1

    goto/16 :goto_0

    :cond_8
    return v0

    :sswitch_data_0
    .sparse-switch
        -0x7ffffffb -> :sswitch_3
        -0x7ffffffa -> :sswitch_5
        -0x3ffffff0 -> :sswitch_2
        -0x3fffffea -> :sswitch_4
        -0x3fffffde -> :sswitch_1
        -0x3fffff96 -> :sswitch_1
        -0x3fffff93 -> :sswitch_1
        -0x3fffff92 -> :sswitch_1
        -0x3fffff91 -> :sswitch_1
        -0x3fffff90 -> :sswitch_1
        -0x3fffff8f -> :sswitch_1
        -0x3fffff8e -> :sswitch_1
        -0x3fffff45 -> :sswitch_2
        -0x3ffffe74 -> :sswitch_1
        -0x3ffffdcc -> :sswitch_1
        -0x3ffffda9 -> :sswitch_0
        0x0 -> :sswitch_5
        0x103 -> :sswitch_4
        0x10b -> :sswitch_4
        0x10c -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final getContext()Ll/ᩴۡ᩵;
    .locals 1

    .line 267
    iget-object v0, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1672
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ll/۟֨᩵;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩷֨᩵;->᩺:Ll/ۘۡ᩵;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩷֨᩵;->ܿ֫:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/۟֨᩵;->ۗ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",signingEnforced="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll/᩷֨᩵;->ۢ֫:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",usage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1673
    invoke-virtual {p0}, Ll/۟֨᩵;->ܳ()J

    move-result-wide v1

    const-string v3, "]"

    .line 0
    invoke-static {v0, v1, v2, v3}, Ll/ܺ۫᩷;->֫(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۗ᩵᩵;)I
    .locals 1

    .line 1805
    iget-boolean v0, p0, Ll/᩷֨᩵;->ۢ֫:Z

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ll/ۗ᩵᩵;->ۖ()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x3

    return p1
.end method

.method public final ֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;Ljava/util/Set;)Ll/֫ۖ᩵;
    .locals 22

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    .line 1046
    instance-of v4, v0, Ll/ۧۖ᩵;

    if-eqz v4, :cond_2

    if-nez v2, :cond_0

    .line 1048
    move-object v2, v0

    check-cast v2, Ll/ۧۖ᩵;

    .line 267
    iget-object v4, v1, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    .line 1048
    invoke-interface {v2, v4}, Ll/ۧۖ᩵;->ۧ(Ll/ᩴۡ᩵;)Ll/֫ۖ᩵;

    move-result-object v2

    goto :goto_1

    .line 1049
    :cond_0
    invoke-virtual/range {p0 .. p0}, Ll/᩷֨᩵;->۬()Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    .line 1050
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Should not provide response argument for SMB2"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1052
    :cond_2
    instance-of v4, v0, Ll/ۤۖ᩵;

    if-eqz v4, :cond_5

    instance-of v4, v2, Ll/ۤۖ᩵;

    if-eqz v4, :cond_5

    .line 1053
    move-object v4, v0

    check-cast v4, Ll/ۤۖ᩵;

    .line 1054
    move-object v5, v2

    check-cast v5, Ll/ۤۖ᩵;

    .line 1057
    :goto_0
    invoke-virtual {v4, v5}, Ll/ۨۖ᩵;->֫(Ll/֫ۖ᩵;)V

    .line 1059
    invoke-virtual {v4}, Ll/ۤۖ᩵;->ۡ֫()Ll/ۨۖ᩵;

    move-result-object v4

    if-nez v4, :cond_3

    goto :goto_1

    .line 1063
    :cond_3
    invoke-virtual {v5}, Ll/ۤۖ᩵;->ۡ֫()Ll/ۨۖ᩵;

    move-result-object v5

    .line 1064
    invoke-virtual {v4, v4}, Ll/ۨۖ᩵;->֫(Ll/֫ۖ᩵;)V

    .line 1066
    instance-of v6, v4, Ll/ۤۖ᩵;

    if-eqz v6, :cond_6

    instance-of v6, v5, Ll/ۤۖ᩵;

    if-nez v6, :cond_4

    goto :goto_1

    .line 1069
    :cond_4
    check-cast v4, Ll/ۤۖ᩵;

    .line 1070
    check-cast v5, Ll/ۤۖ᩵;

    goto :goto_0

    .line 1074
    :cond_5
    invoke-interface/range {p1 .. p2}, Ll/ܰܺ᩵;->֫(Ll/֫ۖ᩵;)V

    :cond_6
    :goto_1
    if-eqz v2, :cond_34

    .line 267
    iget-object v4, v1, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    .line 908
    invoke-interface {v4}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v4

    check-cast v4, Ll/ܰۡ᩵;

    invoke-virtual {v4}, Ll/ܰۡ᩵;->᩵()I

    move-result v4

    move-object v5, v0

    :goto_2
    if-eqz v5, :cond_31

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v9, v8

    move-object v8, v5

    :goto_3
    const/4 v10, 0x1

    if-eqz v8, :cond_11

    add-int/lit8 v6, v6, 0x1

    .line 918
    invoke-interface {v8}, Ll/۟ܺ᩵;->size()I

    move-result v11

    .line 920
    invoke-interface {v8}, Ll/۟ܺ᩵;->getNext()Ll/۟ܺ᩵;

    move-result-object v12

    .line 921
    sget-object v13, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    invoke-interface {v13}, Ll/֫᩻֨;->ܽ()Z

    move-result v14

    if-eqz v14, :cond_7

    const-string v15, "%s costs %d avail %d (%s)"

    .line 923
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v16

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/16 v17, 0x3

    iget-object v14, v1, Ll/᩷֨᩵;->ܰ:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v14}, Ljava/util/concurrent/Semaphore;->availablePermits()I

    move-result v14

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const/16 v19, 0x1

    move/from16 v20, v6

    iget-object v6, v1, Ll/۟֨᩵;->᩹:Ljava/lang/String;

    move-object/from16 v21, v2

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const/16 v18, 0x0

    aput-object v16, v2, v18

    aput-object v10, v2, v19

    const/4 v10, 0x2

    aput-object v14, v2, v10

    aput-object v6, v2, v17

    invoke-static {v15, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 922
    invoke-interface {v13, v2}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    goto :goto_4

    :cond_7
    move-object/from16 v21, v2

    move/from16 v20, v6

    :goto_4
    const/4 v14, 0x0

    if-eqz v12, :cond_8

    .line 925
    invoke-interface {v8, v12}, Ll/۟ܺ᩵;->ܽ(Ll/۟ܺ᩵;)Z

    move-result v2

    if-eqz v2, :cond_9

    :cond_8
    add-int v2, v7, v11

    if-ge v2, v4, :cond_9

    iget-object v6, v1, Ll/᩷֨᩵;->ܰ:Ljava/util/concurrent/Semaphore;

    const/4 v10, 0x1

    invoke-virtual {v6, v10}, Ljava/util/concurrent/Semaphore;->tryAcquire(I)Z

    move-result v6

    if-eqz v6, :cond_9

    move v7, v2

    move-object v9, v8

    move-object v8, v12

    move/from16 v6, v20

    move-object/from16 v2, v21

    goto :goto_3

    :cond_9
    if-nez v9, :cond_b

    add-int/2addr v7, v11

    if-gt v7, v4, :cond_a

    goto :goto_5

    .line 930
    :cond_a
    new-instance v0, Ll/ۗۚ᩵;

    const-string v2, "Request size %d exceeds allowable size %d: %s"

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v3, v5, v14

    const/4 v3, 0x1

    aput-object v4, v5, v3

    const/4 v3, 0x2

    aput-object v8, v5, v3

    invoke-static {v2, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    :goto_5
    if-nez v9, :cond_f

    .line 936
    :try_start_0
    invoke-virtual {v1, v8}, Ll/᩷֨᩵;->ۧ(Ll/۟ܺ᩵;)I

    move-result v2

    int-to-long v6, v2

    .line 937
    sget-object v2, Ll/֡ۚ᩵;->ۙ:Ll/֡ۚ᩵;

    invoke-interface {v3, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    .line 938
    iget-object v2, v1, Ll/᩷֨᩵;->ܰ:Ljava/util/concurrent/Semaphore;

    const/4 v6, 0x1

    invoke-virtual {v2, v6}, Ljava/util/concurrent/Semaphore;->acquire(I)V

    goto :goto_6

    :cond_c
    const/4 v2, 0x1

    .line 940
    iget-object v9, v1, Ll/᩷֨᩵;->ܰ:Ljava/util/concurrent/Semaphore;

    sget-object v10, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v9, v2, v6, v7, v10}, Ljava/util/concurrent/Semaphore;->tryAcquire(IJLjava/util/concurrent/TimeUnit;)Z

    move-result v2

    if-eqz v2, :cond_e

    :goto_6
    move-object/from16 v16, v8

    .line 947
    monitor-enter v16
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 948
    :try_start_1
    invoke-interface {v8}, Ll/۟ܺ᩵;->֨()Ll/۟ܺ᩵;

    move-result-object v2

    .line 950
    invoke-interface {v13}, Ll/֫᩻֨;->֫()Z

    move-result v6

    if-eqz v6, :cond_d

    if-eqz v2, :cond_d

    .line 951
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Insufficient credits, send only first "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, " next is "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v13, v6}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 953
    :cond_d
    monitor-exit v16

    goto :goto_7

    :catchall_0
    move-exception v0

    monitor-exit v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0

    .line 941
    :cond_e
    new-instance v0, Ll/ۗۚ᩵;

    const-string v2, "Failed to acquire credits in time"

    invoke-direct {v0, v2}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception v0

    .line 956
    new-instance v2, Ljava/io/InterruptedIOException;

    const-string v3, "Interrupted while acquiring credits"

    invoke-direct {v2, v3}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 957
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 958
    throw v2

    .line 962
    :cond_f
    invoke-interface {v13}, Ll/֫᩻֨;->֫()Z

    move-result v2

    if-eqz v2, :cond_10

    .line 963
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v6, "Not enough credits, split at "

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v13, v2}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    :cond_10
    move-object/from16 v16, v9

    .line 965
    monitor-enter v16

    .line 966
    :try_start_3
    invoke-interface {v9}, Ll/۟ܺ᩵;->֨()Ll/۟ܺ᩵;

    move-result-object v2

    .line 967
    monitor-exit v16

    :goto_7
    move/from16 v6, v20

    goto :goto_8

    :catchall_1
    move-exception v0

    monitor-exit v16
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0

    :cond_11
    move-object/from16 v21, v2

    const/4 v2, 0x0

    .line 972
    :goto_8
    iget-object v7, v1, Ll/᩷֨᩵;->ܰ:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v7}, Ljava/util/concurrent/Semaphore;->availablePermits()I

    move-result v7

    rsub-int v7, v7, 0x200

    sub-int/2addr v7, v6

    const/4 v8, 0x1

    add-int/2addr v7, v8

    invoke-static {v8, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    .line 973
    sget-object v8, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    invoke-interface {v8}, Ll/֫᩻֨;->ܽ()Z

    move-result v9

    if-eqz v9, :cond_12

    .line 974
    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "Request credits "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v9}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 976
    :cond_12
    invoke-interface {v0, v7}, Ll/۟ܺ᩵;->֫(I)V

    .line 980
    :try_start_4
    invoke-interface {v5}, Ll/ܰܺ᩵;->ۧ()Ll/֫ۖ᩵;

    move-result-object v7

    .line 981
    invoke-interface {v8}, Ll/֫᩻֨;->ܽ()Z

    move-result v9

    if-eqz v9, :cond_13

    .line 982
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Sending "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v9}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 984
    :cond_13
    invoke-virtual {v1, v5, v7, v3}, Ll/۟֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;Ljava/util/Set;)Ll/ܰ֨᩵;

    move-result-object v7

    check-cast v7, Ll/֫ۖ᩵;

    .line 986
    invoke-direct {v1, v5}, Ll/᩷֨᩵;->ᩳ(Ll/۟ܺ᩵;)Z

    move-result v9

    if-nez v9, :cond_1d

    .line 987
    invoke-interface {v8}, Ll/֫᩻֨;->֫()Z

    move-result v0

    if-eqz v0, :cond_14

    .line 988
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Breaking on error "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v8, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :cond_14
    const/4 v0, 0x0

    .line 1004
    :goto_9
    invoke-interface {v5}, Ll/۟ܺ᩵;->۬()Z

    move-result v2

    if-eqz v2, :cond_15

    .line 1005
    sget-object v2, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    const-string v3, "Async"

    invoke-interface {v2, v3}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    goto :goto_b

    .line 1009
    :cond_15
    invoke-interface {v5}, Ll/ܰܺ᩵;->ۧ()Ll/֫ۖ᩵;

    move-result-object v2

    if-nez v2, :cond_16

    .line 1012
    sget-object v2, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Response not properly set up for"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ll/֫᩻֨;->ᩳ(Ljava/lang/String;)V

    goto :goto_a

    .line 1013
    :cond_16
    invoke-interface {v2}, Ll/ܰ֨᩵;->۟()Z

    move-result v3

    if-eqz v3, :cond_17

    .line 1014
    invoke-interface {v2}, Ll/ܰ֨᩵;->ܶ()I

    move-result v2

    add-int/2addr v2, v0

    move v0, v2

    .line 1016
    :cond_17
    :goto_a
    invoke-interface {v5}, Ll/۟ܺ᩵;->getNext()Ll/۟ܺ᩵;

    move-result-object v2

    if-nez v2, :cond_1c

    .line 1022
    :goto_b
    invoke-virtual/range {p0 .. p0}, Ll/᩷֨᩵;->᩻()Z

    move-result v2

    if-nez v2, :cond_1a

    invoke-interface {v5}, Ll/۟ܺ᩵;->۬()Z

    move-result v2

    if-nez v2, :cond_1a

    invoke-interface {v5}, Ll/ܰܺ᩵;->ۧ()Ll/֫ۖ᩵;

    move-result-object v2

    invoke-interface {v2}, Ll/֫ۖ᩵;->ۨ()Z

    move-result v2

    if-nez v2, :cond_1a

    invoke-interface {v5}, Ll/ܰܺ᩵;->ۧ()Ll/֫ۖ᩵;

    move-result-object v2

    invoke-interface {v2}, Ll/ܰ֨᩵;->ۘ()Z

    move-result v2

    if-nez v2, :cond_1a

    if-nez v0, :cond_1a

    .line 1024
    iget-object v0, v1, Ll/᩷֨᩵;->ܰ:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->availablePermits()I

    move-result v0

    if-gtz v0, :cond_19

    if-lez v6, :cond_18

    goto :goto_c

    .line 1027
    :cond_18
    sget-object v0, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Server "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " took away all our credits"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ll/֫᩻֨;->ᩳ(Ljava/lang/String;)V

    goto/16 :goto_17

    .line 1025
    :cond_19
    :goto_c
    sget-object v0, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Server "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " returned zero credits for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    goto/16 :goto_17

    .line 1029
    :cond_1a
    invoke-interface {v5}, Ll/۟ܺ᩵;->۬()Z

    move-result v2

    if-nez v2, :cond_32

    .line 1030
    sget-object v2, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    invoke-interface {v2}, Ll/֫᩻֨;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_1b

    .line 1031
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Adding credits "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 1033
    :cond_1b
    iget-object v2, v1, Ll/᩷֨᩵;->ܰ:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/Semaphore;->release(I)V

    goto/16 :goto_17

    :cond_1c
    move-object v5, v2

    goto/16 :goto_9

    :cond_1d
    if-eqz v2, :cond_1e

    .line 996
    :try_start_5
    invoke-interface {v7, v2}, Ll/֫ۖ᩵;->֫(Ll/۟ܺ᩵;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :cond_1e
    const/4 v7, 0x0

    .line 1004
    :goto_d
    invoke-interface {v5}, Ll/۟ܺ᩵;->۬()Z

    move-result v8

    if-eqz v8, :cond_1f

    .line 1005
    sget-object v8, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    const-string v9, "Async"

    invoke-interface {v8, v9}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    goto :goto_f

    .line 1009
    :cond_1f
    invoke-interface {v5}, Ll/ܰܺ᩵;->ۧ()Ll/֫ۖ᩵;

    move-result-object v8

    if-nez v8, :cond_20

    .line 1012
    sget-object v8, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "Response not properly set up for"

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v9}, Ll/֫᩻֨;->ᩳ(Ljava/lang/String;)V

    goto :goto_e

    .line 1013
    :cond_20
    invoke-interface {v8}, Ll/ܰ֨᩵;->۟()Z

    move-result v9

    if-eqz v9, :cond_21

    .line 1014
    invoke-interface {v8}, Ll/ܰ֨᩵;->ܶ()I

    move-result v8

    add-int/2addr v8, v7

    move v7, v8

    .line 1016
    :cond_21
    :goto_e
    invoke-interface {v5}, Ll/۟ܺ᩵;->getNext()Ll/۟ܺ᩵;

    move-result-object v8

    if-nez v8, :cond_27

    .line 1022
    :goto_f
    invoke-virtual/range {p0 .. p0}, Ll/᩷֨᩵;->᩻()Z

    move-result v8

    if-nez v8, :cond_24

    invoke-interface {v5}, Ll/۟ܺ᩵;->۬()Z

    move-result v8

    if-nez v8, :cond_24

    invoke-interface {v5}, Ll/ܰܺ᩵;->ۧ()Ll/֫ۖ᩵;

    move-result-object v8

    invoke-interface {v8}, Ll/֫ۖ᩵;->ۨ()Z

    move-result v8

    if-nez v8, :cond_24

    invoke-interface {v5}, Ll/ܰܺ᩵;->ۧ()Ll/֫ۖ᩵;

    move-result-object v8

    invoke-interface {v8}, Ll/ܰ֨᩵;->ۘ()Z

    move-result v8

    if-nez v8, :cond_24

    if-nez v7, :cond_24

    .line 1024
    iget-object v7, v1, Ll/᩷֨᩵;->ܰ:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v7}, Ljava/util/concurrent/Semaphore;->availablePermits()I

    move-result v7

    if-gtz v7, :cond_23

    if-lez v6, :cond_22

    goto :goto_10

    .line 1027
    :cond_22
    sget-object v5, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Server "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, " took away all our credits"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Ll/֫᩻֨;->ᩳ(Ljava/lang/String;)V

    goto :goto_11

    .line 1025
    :cond_23
    :goto_10
    sget-object v6, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Server "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v8, " returned zero credits for "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v6, v5}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    goto :goto_11

    .line 1029
    :cond_24
    invoke-interface {v5}, Ll/۟ܺ᩵;->۬()Z

    move-result v5

    if-nez v5, :cond_26

    .line 1030
    sget-object v5, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    invoke-interface {v5}, Ll/֫᩻֨;->ܽ()Z

    move-result v6

    if-eqz v6, :cond_25

    .line 1031
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v8, "Adding credits "

    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 1033
    :cond_25
    iget-object v5, v1, Ll/᩷֨᩵;->ܰ:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v5, v7}, Ljava/util/concurrent/Semaphore;->release(I)V

    :cond_26
    :goto_11
    move-object v5, v2

    move-object/from16 v2, v21

    goto/16 :goto_2

    :cond_27
    move-object v5, v8

    goto/16 :goto_d

    :catchall_2
    move-exception v0

    const/4 v2, 0x0

    .line 1004
    :goto_12
    invoke-interface {v5}, Ll/۟ܺ᩵;->۬()Z

    move-result v3

    if-eqz v3, :cond_28

    .line 1005
    sget-object v3, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    const-string v4, "Async"

    invoke-interface {v3, v4}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    goto :goto_14

    .line 1009
    :cond_28
    invoke-interface {v5}, Ll/ܰܺ᩵;->ۧ()Ll/֫ۖ᩵;

    move-result-object v3

    if-nez v3, :cond_29

    .line 1012
    sget-object v3, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v7, "Response not properly set up for"

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ll/֫᩻֨;->ᩳ(Ljava/lang/String;)V

    goto :goto_13

    .line 1013
    :cond_29
    invoke-interface {v3}, Ll/ܰ֨᩵;->۟()Z

    move-result v4

    if-eqz v4, :cond_2a

    .line 1014
    invoke-interface {v3}, Ll/ܰ֨᩵;->ܶ()I

    move-result v3

    add-int/2addr v3, v2

    move v2, v3

    .line 1016
    :cond_2a
    :goto_13
    invoke-interface {v5}, Ll/۟ܺ᩵;->getNext()Ll/۟ܺ᩵;

    move-result-object v3

    if-nez v3, :cond_30

    .line 1022
    :goto_14
    invoke-virtual/range {p0 .. p0}, Ll/᩷֨᩵;->᩻()Z

    move-result v3

    if-nez v3, :cond_2d

    invoke-interface {v5}, Ll/۟ܺ᩵;->۬()Z

    move-result v3

    if-nez v3, :cond_2d

    invoke-interface {v5}, Ll/ܰܺ᩵;->ۧ()Ll/֫ۖ᩵;

    move-result-object v3

    invoke-interface {v3}, Ll/֫ۖ᩵;->ۨ()Z

    move-result v3

    if-nez v3, :cond_2d

    invoke-interface {v5}, Ll/ܰܺ᩵;->ۧ()Ll/֫ۖ᩵;

    move-result-object v3

    invoke-interface {v3}, Ll/ܰ֨᩵;->ۘ()Z

    move-result v3

    if-nez v3, :cond_2d

    if-nez v2, :cond_2d

    .line 1024
    iget-object v2, v1, Ll/᩷֨᩵;->ܰ:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v2}, Ljava/util/concurrent/Semaphore;->availablePermits()I

    move-result v2

    if-gtz v2, :cond_2c

    if-lez v6, :cond_2b

    goto :goto_15

    .line 1027
    :cond_2b
    sget-object v2, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Server "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " took away all our credits"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ll/֫᩻֨;->ᩳ(Ljava/lang/String;)V

    goto :goto_16

    .line 1025
    :cond_2c
    :goto_15
    sget-object v2, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Server "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " returned zero credits for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    goto :goto_16

    .line 1029
    :cond_2d
    invoke-interface {v5}, Ll/۟ܺ᩵;->۬()Z

    move-result v3

    if-nez v3, :cond_2f

    .line 1030
    sget-object v3, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    invoke-interface {v3}, Ll/֫᩻֨;->ܽ()Z

    move-result v4

    if-eqz v4, :cond_2e

    .line 1031
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Adding credits "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 1033
    :cond_2e
    iget-object v3, v1, Ll/᩷֨᩵;->ܰ:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/Semaphore;->release(I)V

    .line 1035
    :cond_2f
    :goto_16
    throw v0

    :cond_30
    move-object v5, v3

    goto/16 :goto_12

    :cond_31
    move-object/from16 v21, v2

    .line 1038
    :cond_32
    :goto_17
    invoke-interface/range {v21 .. v21}, Ll/ܰ֨᩵;->۟()Z

    move-result v0

    if-eqz v0, :cond_33

    return-object v21

    .line 1039
    :cond_33
    new-instance v0, Ljava/io/IOException;

    const-string v2, "No response"

    invoke-interface/range {v21 .. v21}, Ll/ܰ֨᩵;->getException()Ljava/lang/Exception;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 1077
    :cond_34
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Invalid response"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Ll/ᩴۡ᩵;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ll/ۡۖ᩵;
    .locals 19

    move-object/from16 v0, p2

    move-object/from16 v1, p4

    move/from16 v2, p5

    .line 1680
    sget-object v3, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    invoke-interface {v3}, Ll/֫᩻֨;->֫()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 1681
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Resolving DFS path "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 1684
    :cond_0
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x2

    const/4 v6, 0x0

    if-lt v4, v5, :cond_2

    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x5c

    if-ne v4, v5, :cond_2

    const/4 v4, 0x1

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-eq v4, v5, :cond_1

    goto :goto_0

    .line 1685
    :cond_1
    new-instance v1, Ll/ۗۚ᩵;

    const-string v2, "Path must not start with double slash: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    :goto_0
    move-object/from16 v4, p0

    move-object/from16 v5, p1

    move-object/from16 v7, p3

    .line 1688
    invoke-virtual {v4, v5, v7, v1}, Ll/᩷֨᩵;->֫(Ll/ᩴۡ᩵;Ljava/lang/String;Ljava/lang/String;)Ll/᩻֨᩵;

    move-result-object v7

    .line 1689
    :try_start_0
    invoke-virtual {v7}, Ll/᩻֨᩵;->ۘ()Ll/᩷֨᩵;

    move-result-object v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    :try_start_1
    const-string v9, "IPC$"

    .line 1690
    invoke-virtual {v7, v9}, Ll/᩻֨᩵;->֫(Ljava/lang/String;)Ll/᩵֨᩵;

    move-result-object v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 1692
    :try_start_2
    new-instance v10, Ll/ܿ֫ܽ;

    invoke-direct {v10, v0}, Ll/ܿ֫ܽ;-><init>(Ljava/lang/Object;)V

    .line 1694
    invoke-virtual/range {p0 .. p0}, Ll/᩷֨᩵;->۬()Z

    move-result v11

    if-eqz v11, :cond_3

    .line 1695
    new-instance v11, Ll/ۖ᩵᩵;

    invoke-interface/range {p1 .. p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v12

    const v13, 0x60194

    invoke-direct {v11, v12, v13}, Ll/ۖ᩵᩵;-><init>(Ll/֨ۡ᩵;I)V

    .line 1696
    invoke-virtual {v11}, Ll/ۖ᩵᩵;->ۘ֫()V

    .line 1697
    invoke-virtual {v11, v10}, Ll/ۖ᩵᩵;->֫(Ll/᩹ۡ᩵;)V

    new-array v10, v6, [Ll/֡ۚ᩵;

    .line 1698
    invoke-virtual {v9, v11, v10}, Ll/᩵֨᩵;->֫(Ll/۬ᩴ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    move-result-object v10

    check-cast v10, Ll/ۘ᩵᩵;

    const-class v11, Ll/ۖۖ᩵;

    invoke-virtual {v10, v11}, Ll/ۘ᩵᩵;->֫(Ljava/lang/Class;)Ll/۠ۡ᩵;

    move-result-object v10

    check-cast v10, Ll/ۖۖ᩵;

    goto :goto_1

    .line 1700
    :cond_3
    new-instance v10, Ll/ۚᩴ᩵;

    invoke-interface/range {p1 .. p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v11

    invoke-direct {v10, v11}, Ll/ۚᩴ᩵;-><init>(Ll/֨ۡ᩵;)V

    .line 1701
    new-instance v11, Ll/֡ᩴ᩵;

    invoke-interface/range {p1 .. p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v12

    invoke-direct {v11, v0, v12}, Ll/֡ᩴ᩵;-><init>(Ljava/lang/String;Ll/֨ۡ᩵;)V

    .line 409
    sget-object v12, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    invoke-virtual {v9, v11, v10, v12}, Ll/᩵֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;Ljava/util/Set;)Ll/֫ۖ᩵;

    .line 1702
    invoke-virtual {v10}, Ll/ۚᩴ᩵;->֡֫()Ll/ۖۖ᩵;

    move-result-object v10

    .line 1705
    :goto_1
    invoke-virtual {v10}, Ll/ۖۖ᩵;->ܽ()I

    move-result v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v12, 0x0

    if-nez v11, :cond_4

    .line 190
    :try_start_3
    invoke-virtual {v9}, Ll/᩵֨᩵;->֡()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 122
    :try_start_4
    invoke-virtual {v8}, Ll/۟֨᩵;->ۘ()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 213
    invoke-virtual {v7}, Ll/᩻֨᩵;->᩸()V

    return-object v12

    :cond_4
    if-eqz v2, :cond_5

    .line 1707
    :try_start_5
    invoke-virtual {v10}, Ll/ۖۖ᩵;->ܽ()I

    move-result v11

    if-ge v11, v2, :cond_6

    .line 1708
    :cond_5
    invoke-virtual {v10}, Ll/ۖۖ᩵;->ܽ()I

    move-result v2

    .line 1712
    :cond_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    invoke-interface/range {p1 .. p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v5

    check-cast v5, Ll/ܰۡ᩵;

    invoke-virtual {v5}, Ll/ܰۡ᩵;->ܳ()J

    move-result-wide v15

    const-wide/16 v17, 0x3e8

    mul-long v15, v15, v17

    add-long/2addr v13, v15

    .line 1713
    invoke-virtual {v10}, Ll/ۖۖ᩵;->ܳ()[Ll/ۘۖ᩵;

    move-result-object v5

    :goto_2
    if-ge v6, v2, :cond_9

    .line 1715
    aget-object v11, v5, v6

    invoke-virtual {v10}, Ll/ۖۖ᩵;->ܿ()I

    move-result v15

    invoke-static {v11, v0, v13, v14, v15}, Ll/ۡۖ᩵;->֫(Ll/ۘۖ᩵;Ljava/lang/String;JI)Ll/ۡۖ᩵;

    move-result-object v11

    .line 1716
    invoke-virtual {v11, v1}, Ll/ۡۖ᩵;->֫(Ljava/lang/String;)V

    .line 1718
    invoke-virtual {v10}, Ll/ۖۖ᩵;->᩻()I

    move-result v15

    and-int/lit8 v15, v15, 0x2

    if-nez v15, :cond_7

    invoke-virtual {v11}, Ll/ۡۖ᩵;->ܺ()I

    move-result v15

    and-int/lit8 v15, v15, 0x2

    if-nez v15, :cond_7

    .line 1719
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Non-root referral is not final "

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 1720
    invoke-virtual {v11}, Ll/ۡۖ᩵;->ۖ()V

    :cond_7
    if-nez v12, :cond_8

    goto :goto_3

    .line 1726
    :cond_8
    invoke-virtual {v12, v11}, Ll/ۡۖ᩵;->֫(Ll/ܺۖ᩵;)V

    :goto_3
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v0, p2

    move-object v12, v11

    goto :goto_2

    .line 1731
    :cond_9
    invoke-interface {v3}, Ll/֫᩻֨;->֫()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 1732
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Got referral "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 190
    :cond_a
    :try_start_6
    invoke-virtual {v9}, Ll/᩵֨᩵;->֡()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 122
    :try_start_7
    invoke-virtual {v8}, Ll/۟֨᩵;->ۘ()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 213
    invoke-virtual {v7}, Ll/᩻֨᩵;->᩸()V

    return-object v12

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 190
    :try_start_8
    invoke-virtual {v9}, Ll/᩵֨᩵;->֡()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object v2, v0

    .line 1688
    :try_start_9
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :catchall_2
    move-exception v0

    move-object v1, v0

    .line 122
    :try_start_a
    invoke-virtual {v8}, Ll/۟֨᩵;->ۘ()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    goto :goto_5

    :catchall_3
    move-exception v0

    move-object v2, v0

    .line 1688
    :try_start_b
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    :catchall_4
    move-exception v0

    move-object v1, v0

    .line 213
    :try_start_c
    invoke-virtual {v7}, Ll/᩻֨᩵;->᩸()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    goto :goto_6

    :catchall_5
    move-exception v0

    move-object v2, v0

    .line 1688
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw v1
.end method

.method public final ֫(Ljava/lang/Class;)Ll/ۢ֨᩵;
    .locals 1

    .line 325
    const-class v0, Ll/᩷֨᩵;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object p0

    .line 328
    :cond_0
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1
.end method

.method public final declared-synchronized ֫(Ll/ᩴۡ᩵;Ljava/lang/String;Ljava/lang/String;)Ll/᩻֨᩵;
    .locals 8

    const-string v1, "Currently "

    move-object v0, p0

    .line 3
    monitor-enter v0

    .line 351
    :try_start_0
    sget-object v2, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    invoke-interface {v2}, Ll/֫᩻֨;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 352
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩷֨᩵;->᩷֫:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->size()I

    move-result v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " session(s) active for "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    :cond_0
    if-eqz p2, :cond_1

    .line 356
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p2, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p2

    :cond_1
    if-eqz p3, :cond_2

    .line 360
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p3, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p3

    .line 363
    :cond_2
    iget-object v1, p0, Ll/᩷֨᩵;->᩷֫:Ljava/util/LinkedList;

    invoke-interface {v1}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object v1

    .line 364
    :cond_3
    :goto_0
    invoke-interface {v1}, Ljava/util/ListIterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 365
    invoke-interface {v1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩻֨᩵;

    .line 366
    invoke-virtual {v2, p1, p2, p3}, Ll/᩻֨᩵;->֫(Ll/ᩴۡ᩵;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 367
    sget-object p1, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    invoke-interface {p1}, Ll/֫᩻֨;->ܽ()Z

    move-result p2

    if-eqz p2, :cond_4

    .line 368
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Reusing existing session "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 370
    :cond_4
    invoke-virtual {v2}, Ll/᩻֨᩵;->֫()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v2

    .line 371
    :cond_5
    :try_start_1
    sget-object v3, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    invoke-interface {v3}, Ll/֫᩻֨;->ܽ()Z

    move-result v4

    if-eqz v4, :cond_3

    .line 372
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Existing session "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " does not match "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ll/ᩴۡ᩵;->֫()Ll/ۛ֡᩵;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v2}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    goto :goto_0

    .line 377
    :cond_6
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v1

    check-cast v1, Ll/ܰۡ᩵;

    invoke-virtual {v1}, Ll/ܰۡ᩵;->֫֫()I

    move-result v1

    if-lez v1, :cond_9

    iget-wide v1, p0, Ll/᩷֨᩵;->ۜ֫:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    cmp-long v5, v1, v3

    if-gez v5, :cond_9

    .line 378
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v1

    check-cast v1, Ll/ܰۡ᩵;

    invoke-virtual {v1}, Ll/ܰۡ᩵;->֫֫()I

    move-result v1

    int-to-long v1, v1

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/᩷֨᩵;->ۜ֫:J

    .line 379
    iget-object v1, p0, Ll/᩷֨᩵;->᩷֫:Ljava/util/LinkedList;

    invoke-interface {v1}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object v1

    .line 380
    :cond_7
    :goto_1
    invoke-interface {v1}, Ljava/util/ListIterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    .line 381
    invoke-interface {v1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩻֨᩵;

    .line 382
    invoke-virtual {v2}, Ll/᩻֨᩵;->᩻()Ljava/lang/Long;

    move-result-object v5

    if-eqz v5, :cond_7

    invoke-virtual {v2}, Ll/᩻֨᩵;->᩻()Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    cmp-long v7, v5, v3

    if-gez v7, :cond_7

    invoke-virtual {v2}, Ll/᩻֨᩵;->֡()Z

    move-result v5

    if-nez v5, :cond_7

    .line 383
    sget-object v5, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    invoke-interface {v5}, Ll/֫᩻֨;->֫()Z

    move-result v6

    if-eqz v6, :cond_8

    .line 384
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Closing session after timeout "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    :cond_8
    const/4 v5, 0x0

    .line 386
    invoke-virtual {v2, v5, v5}, Ll/᩻֨᩵;->֫(ZZ)Z

    goto :goto_1

    .line 390
    :cond_9
    new-instance v1, Ll/᩻֨᩵;

    invoke-direct {v1, p1, p2, p3, p0}, Ll/᩻֨᩵;-><init>(Ll/ᩴۡ᩵;Ljava/lang/String;Ljava/lang/String;Ll/᩷֨᩵;)V

    .line 391
    sget-object p1, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    invoke-interface {p1}, Ll/֫᩻֨;->֫()Z

    move-result p2

    if-eqz p2, :cond_a

    .line 392
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Establishing new session "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " on "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Ll/۟֨᩵;->᩹:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 394
    :cond_a
    iget-object p1, p0, Ll/᩷֨᩵;->᩷֫:Ljava/util/LinkedList;

    invoke-virtual {p1, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 395
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final ֫(Ljava/lang/Long;)V
    .locals 12

    const-string v1, "Skipping message "

    .line 1281
    iget-object v0, p0, Ll/۟֨᩵;->᩸:Ljava/lang/Object;

    monitor-enter v0

    .line 1282
    :try_start_0
    iget-object v2, p0, Ll/᩷֨᩵;->᩻֫:[B

    const/4 v3, 0x2

    invoke-static {v3, v2}, Ll/ۗ֨᩵;->֫(I[B)S

    move-result v2

    const v3, 0xffff

    and-int/2addr v2, v3

    const/16 v4, 0x21

    if-lt v2, v4, :cond_7

    add-int/lit8 v4, v2, 0x4

    .line 267
    iget-object v5, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    .line 1283
    invoke-interface {v5}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v5

    check-cast v5, Ll/ܰۡ᩵;

    invoke-virtual {v5}, Ll/ܰۡ᩵;->ۛ()I

    move-result v5

    if-le v4, v5, :cond_0

    goto/16 :goto_1

    .line 1320
    :cond_0
    iget-object v4, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    iget-object v5, p0, Ll/᩷֨᩵;->᩻֫:[B

    .line 1324
    iget-boolean v6, p0, Ll/᩷֨᩵;->ۡ֫:Z

    const/4 v7, 0x0

    if-eqz v6, :cond_2

    .line 1325
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    const-wide/16 v10, -0x1

    cmp-long v6, v8, v10

    if-eqz v6, :cond_1

    goto :goto_0

    :cond_1
    const/16 v6, 0x10

    .line 1328
    invoke-static {v6, v5}, Ll/ۗ֨᩵;->ۧ(I[B)S

    move-result v5

    and-int/2addr v3, v5

    const/16 v5, 0x12

    if-ne v3, v5, :cond_4

    .line 1330
    new-instance v7, Ll/۠᩵᩵;

    invoke-interface {v4}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v3

    .line 41
    invoke-direct {v7, v3}, Ll/۫ᩴ᩵;-><init>(Ll/֨ۡ᩵;)V

    goto :goto_0

    .line 1333
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    const-wide/32 v10, 0xffff

    cmp-long v3, v8, v10

    if-eqz v3, :cond_3

    goto :goto_0

    :cond_3
    const/16 v3, 0x8

    .line 1336
    aget-byte v3, v5, v3

    const/16 v5, 0x24

    if-ne v3, v5, :cond_4

    .line 1338
    new-instance v7, Ll/ܳۘ᩵;

    invoke-interface {v4}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v3

    invoke-direct {v7, v3}, Ll/ܳۘ᩵;-><init>(Ll/֨ۡ᩵;)V

    :cond_4
    :goto_0
    if-eqz v7, :cond_5

    .line 1290
    sget-object p1, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    const-string v1, "Parsing notification"

    invoke-interface {p1, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 1291
    invoke-virtual {p0, v7}, Ll/᩷֨᩵;->֫(Ll/ܰ֨᩵;)V

    .line 1310
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Received notification "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ll/֫᩻֨;->ܽ(Ljava/lang/String;)V

    .line 1293
    monitor-exit v0

    return-void

    .line 1295
    :cond_5
    sget-object v3, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v3, p1}, Ll/֫᩻֨;->ᩳ(Ljava/lang/String;)V

    .line 1296
    invoke-virtual {p0}, Ll/᩷֨᩵;->۬()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 1297
    iget-object p1, p0, Ll/᩷֨᩵;->֫֫:Ljava/io/InputStream;

    add-int/lit8 v2, v2, -0x40

    int-to-long v1, v2

    invoke-virtual {p1, v1, v2}, Ljava/io/InputStream;->skip(J)J

    goto :goto_2

    .line 1299
    :cond_6
    iget-object p1, p0, Ll/᩷֨᩵;->֫֫:Ljava/io/InputStream;

    add-int/lit8 v2, v2, -0x20

    int-to-long v1, v2

    invoke-virtual {p1, v1, v2}, Ljava/io/InputStream;->skip(J)J

    goto :goto_2

    .line 1285
    :cond_7
    :goto_1
    sget-object p1, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    const-string v1, "Flusing stream input"

    invoke-interface {p1, v1}, Ll/֫᩻֨;->ᩳ(Ljava/lang/String;)V

    .line 1286
    iget-object p1, p0, Ll/᩷֨᩵;->֫֫:Ljava/io/InputStream;

    invoke-virtual {p1}, Ljava/io/InputStream;->available()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {p1, v1, v2}, Ljava/io/InputStream;->skip(J)J

    .line 1302
    :goto_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/۟ܺ᩵;)V
    .locals 7

    .line 267
    iget-object v0, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    .line 873
    invoke-interface {v0}, Ll/ᩴۡ᩵;->᩷()Ll/ۤ֡᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۤ֡᩵;->֫()[B

    move-result-object v1

    .line 876
    :try_start_0
    iget-object v0, p0, Ll/۟֨᩵;->᩶:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v2, 0x4

    .line 877
    :try_start_1
    invoke-interface {p1, v2, v1}, Ll/ܰܺ᩵;->֫(I[B)I

    move-result v3

    const v4, 0xffff

    and-int/2addr v4, v3

    const/4 v5, 0x0

    .line 878
    invoke-static {v4, v5, v1}, Ll/ۗ֨᩵;->֫(II[B)V

    .line 879
    sget-object v4, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    invoke-interface {v4}, Ll/֫᩻֨;->ܽ()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 881
    :cond_0
    sget-object v4, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v6}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 883
    instance-of v6, p1, Ll/ۤۖ᩵;

    if-eqz v6, :cond_1

    check-cast p1, Ll/ۤۖ᩵;

    invoke-virtual {p1}, Ll/ۤۖ᩵;->ۡ֫()Ll/ۨۖ᩵;

    move-result-object p1

    if-nez p1, :cond_0

    .line 884
    :cond_1
    invoke-static {v1, v2, v3}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v4, p1}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 892
    :cond_2
    iget-object p1, p0, Ll/᩷֨᩵;->ᩳ֫:Ljava/io/OutputStream;

    add-int/2addr v3, v2

    invoke-virtual {p1, v1, v5, v3}, Ljava/io/OutputStream;->write([BII)V

    .line 893
    iget-object p1, p0, Ll/᩷֨᩵;->ᩳ֫:Ljava/io/OutputStream;

    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    .line 894
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 267
    iget-object p1, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    .line 896
    invoke-interface {p1}, Ll/ᩴۡ᩵;->᩷()Ll/ۤ֡᩵;

    move-result-object p1

    invoke-virtual {p1, v1}, Ll/ۤ֡᩵;->֫([B)V

    return-void

    :catchall_0
    move-exception p1

    .line 894
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    .line 267
    iget-object v0, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    .line 896
    invoke-interface {v0}, Ll/ᩴۡ᩵;->᩷()Ll/ۤ֡᩵;

    move-result-object v0

    invoke-virtual {v0, v1}, Ll/ۤ֡᩵;->֫([B)V

    .line 897
    throw p1
.end method

.method public final ֫(Ll/۟ܺ᩵;Ll/ۨۖ᩵;)V
    .locals 1

    .line 1494
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    invoke-virtual {p0, p1, p2, v0}, Ll/᩷֨᩵;->ۧ(Ll/۟ܺ᩵;Ll/֫ۖ᩵;Ljava/util/Set;)Ll/֫ۖ᩵;

    return-void
.end method

.method public final ֫(Ll/ܰ֨᩵;)V
    .locals 3

    .line 1136
    move-object v0, p1

    check-cast v0, Ll/ܰܺ᩵;

    .line 1137
    iget-object v1, p0, Ll/᩷֨᩵;->ܽ֫:Ll/᩷ۖ᩵;

    invoke-interface {v1, p1}, Ll/᩷ۖ᩵;->֫(Ll/ܰ֨᩵;)V

    .line 1139
    :try_start_0
    iget-boolean v1, p0, Ll/᩷֨᩵;->ۡ֫:Z

    if-eqz v1, :cond_0

    .line 1140
    invoke-direct {p0, v0}, Ll/᩷֨᩵;->ۧ(Ll/ܰܺ᩵;)V

    return-void

    .line 1142
    :cond_0
    invoke-direct {p0, v0}, Ll/᩷֨᩵;->֫(Ll/ܰܺ᩵;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object v1, v0

    .line 1145
    sget-object v0, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    const-string v2, "Failure decoding message, disconnecting transport"

    invoke-interface {v0, v2, v1}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1146
    invoke-interface {p1, v1}, Ll/ܰ֨᩵;->֫(Ljava/lang/Exception;)V

    move-object v0, p1

    .line 1147
    monitor-enter v0

    .line 1148
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 1149
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1150
    throw v1

    :catchall_0
    move-exception p1

    .line 1149
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/ܿۖ᩵;)V
    .locals 0

    .line 250
    iput-object p1, p0, Ll/᩷֨᩵;->۟:Ll/ܿۖ᩵;

    return-void
.end method

.method public final ֫(Ll/ۘۡ᩵;ILjava/lang/String;)Z
    .locals 2

    .line 400
    iget v0, p0, Ll/۟֨᩵;->ۗ:I

    const/4 v1, 0x5

    if-eq v0, v1, :cond_4

    iget v0, p0, Ll/۟֨᩵;->ۗ:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    if-nez p3, :cond_1

    .line 405
    invoke-interface {p1}, Ll/ۘۡ᩵;->ۧ()Ljava/lang/String;

    move-result-object p3

    .line 406
    :cond_1
    iget-object v0, p0, Ll/᩷֨᩵;->ۖ֫:Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-virtual {p3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_4

    :cond_2
    iget-object p3, p0, Ll/᩷֨᩵;->᩺:Ll/ۘۡ᩵;

    invoke-virtual {p1, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    if-eqz p2, :cond_3

    iget p1, p0, Ll/᩷֨᩵;->ܿ֫:I

    if-eq p2, p1, :cond_3

    const/16 p3, 0x1bd

    if-ne p2, p3, :cond_4

    const/16 p2, 0x8b

    if-ne p1, p2, :cond_4

    :cond_3
    const/4 p1, 0x1

    return p1

    :cond_4
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ll/۟ܺ᩵;Ll/ܰ֨᩵;)Z
    .locals 11

    const-string v1, "Credit from intermediate "

    const-string v2, "Have intermediate reply "

    .line 1085
    iget-boolean v0, p0, Ll/᩷֨᩵;->ۡ֫:Z

    const/4 v3, 0x0

    if-nez v0, :cond_0

    return v3

    .line 1088
    :cond_0
    move-object v4, p1

    check-cast v4, Ll/۬ᩴ᩵;

    .line 1089
    move-object v5, p2

    check-cast v5, Ll/۫ᩴ᩵;

    move-object v0, v5

    .line 1090
    monitor-enter v0

    .line 1091
    :try_start_0
    invoke-virtual {v5}, Ll/ۗᩴ᩵;->ۨ()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-virtual {v5}, Ll/۫ᩴ᩵;->ۘ֫()Z

    move-result v6

    if-nez v6, :cond_5

    invoke-virtual {v5}, Ll/ۗᩴ᩵;->ۢ֫()I

    move-result v6

    const/16 v7, 0x103

    if-ne v6, v7, :cond_5

    invoke-virtual {v5}, Ll/ۗᩴ᩵;->ۧ֫()J

    move-result-wide v6

    const-wide/16 v8, 0x0

    cmp-long v10, v6, v8

    if-eqz v10, :cond_5

    .line 1092
    invoke-virtual {v5}, Ll/۫ᩴ᩵;->ᩴ֫()V

    .line 1093
    invoke-virtual {v4}, Ll/ۗᩴ᩵;->ۨ()Z

    move-result v3

    .line 1094
    invoke-virtual {v5}, Ll/ۗᩴ᩵;->ۧ֫()J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Ll/ۗᩴ᩵;->ܽ(J)V

    .line 1095
    invoke-virtual {v5}, Ll/۫ᩴ᩵;->ᩳ()Ljava/lang/Long;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 1097
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-virtual {p0, p1}, Ll/᩷֨᩵;->ۧ(Ll/۟ܺ᩵;)I

    move-result p1

    int-to-long v8, p1

    add-long/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v5, p1}, Ll/۫ᩴ᩵;->֫(Ljava/lang/Long;)V

    .line 1099
    :cond_1
    sget-object p1, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    invoke-interface {p1}, Ll/֫᩻֨;->֫()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 1100
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    :cond_2
    if-nez v3, :cond_4

    .line 1104
    invoke-virtual {v5}, Ll/ۗᩴ᩵;->ᩳ֫()I

    move-result p2

    .line 1105
    invoke-interface {p1}, Ll/֫᩻֨;->֫()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 1106
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 1108
    :cond_3
    iget-object p1, p0, Ll/᩷֨᩵;->ܰ:Ljava/util/concurrent/Semaphore;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/Semaphore;->release(I)V

    :cond_4
    const/4 p1, 0x1

    .line 1110
    monitor-exit v0

    return p1

    .line 1112
    :cond_5
    monitor-exit v0

    return v3

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/ۨۖ᩵;Ll/ۨۖ᩵;)Z
    .locals 4

    .line 1347
    invoke-virtual {p2}, Ll/ۨۖ᩵;->getErrorCode()I

    move-result v0

    const v1, 0x30002

    if-ne v0, v1, :cond_0

    const v0, -0x3ffffda9    # -2.0001428f

    .line 1349
    invoke-virtual {p2, v0}, Ll/ۨۖ᩵;->᩻(I)V

    goto :goto_0

    .line 1351
    :cond_0
    invoke-virtual {p2}, Ll/ۨۖ᩵;->getErrorCode()I

    move-result v0

    invoke-static {v0}, Ll/ۗۚ᩵;->ۧ(I)I

    move-result v0

    invoke-virtual {p2, v0}, Ll/ۨۖ᩵;->᩻(I)V

    .line 1353
    :goto_0
    invoke-virtual {p2}, Ll/ۨۖ᩵;->getErrorCode()I

    move-result v0

    if-eqz v0, :cond_2

    sparse-switch v0, :sswitch_data_0

    packed-switch v0, :pswitch_data_0

    .line 1379
    sget-object v0, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    invoke-interface {v0}, Ll/֫᩻֨;->֫()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1380
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Error code: 0x"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ll/ۨۖ᩵;->getErrorCode()I

    move-result v2

    const/16 v3, 0x8

    invoke-static {v2, v3}, Ll/۫֨᩵;->֫(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    goto :goto_1

    .line 1369
    :sswitch_0
    new-instance p1, Ll/֡֨᩵;

    invoke-direct {p1}, Ll/֡֨᩵;-><init>()V

    throw p1

    .line 1373
    :sswitch_1
    invoke-virtual {p1}, Ll/ۨۖ᩵;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p2, v0, p1}, Ll/᩷֨᩵;->֫(Ll/֫ۖ᩵;Ljava/lang/String;Ll/ܽۖ᩵;)V

    const/4 p1, 0x0

    throw p1

    :sswitch_2
    const/4 p1, 0x0

    goto :goto_2

    .line 1367
    :pswitch_0
    :sswitch_3
    new-instance p1, Ll/᩹ۚ᩵;

    invoke-virtual {p2}, Ll/ۨۖ᩵;->getErrorCode()I

    move-result p2

    .line 39
    invoke-direct {p1, p2}, Ll/ۗۚ᩵;-><init>(I)V

    .line 1367
    throw p1

    .line 1382
    :cond_1
    :goto_1
    new-instance p1, Ll/ۗۚ᩵;

    invoke-virtual {p2}, Ll/ۨۖ᩵;->getErrorCode()I

    move-result p2

    invoke-direct {p1, p2}, Ll/ۗۚ᩵;-><init>(I)V

    throw p1

    :cond_2
    :sswitch_4
    const/4 p1, 0x1

    .line 1384
    :goto_2
    invoke-virtual {p2}, Ll/ۨۖ᩵;->ۢ()Z

    move-result p2

    if-nez p2, :cond_3

    return p1

    .line 1385
    :cond_3
    new-instance p1, Ll/ۗۚ᩵;

    const-string p2, "Signature verification failed."

    invoke-direct {p1, p2}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_data_0
    .sparse-switch
        -0x7ffffffb -> :sswitch_2
        -0x3fffffea -> :sswitch_2
        -0x3fffffde -> :sswitch_3
        -0x3fffff96 -> :sswitch_3
        -0x3fffff5e -> :sswitch_1
        -0x3fffff45 -> :sswitch_0
        -0x3ffffe74 -> :sswitch_3
        -0x3ffffdcc -> :sswitch_3
        -0x3ffffda9 -> :sswitch_1
        0x0 -> :sswitch_4
    .end sparse-switch

    :pswitch_data_0
    .packed-switch -0x3fffff93
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(I[B[B)[B
    .locals 3

    .line 1752
    iget-boolean v0, p0, Ll/᩷֨᩵;->ۡ֫:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Ll/᩷֨᩵;->ܽ֫:Ll/᩷ۖ᩵;

    if-eqz v0, :cond_3

    .line 1756
    check-cast v0, Ll/ۗ᩵᩵;

    .line 1757
    invoke-virtual {v0}, Ll/ۗ᩵᩵;->᩻()Ll/᩸ۡ᩵;

    move-result-object v1

    sget-object v2, Ll/᩸ۡ᩵;->ۛ:Ll/᩸ۡ᩵;

    invoke-virtual {v1, v2}, Ll/᩸ۡ᩵;->֫(Ll/᩸ۡ᩵;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1762
    invoke-virtual {v0}, Ll/ۗ᩵᩵;->ܶ֫()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    :try_start_0
    const-string v0, "SHA-512"

    .line 79
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p3, :cond_0

    .line 1771
    invoke-virtual {v0, p3}, Ljava/security/MessageDigest;->update([B)V

    :cond_0
    const/4 p3, 0x0

    .line 1773
    invoke-virtual {v0, p2, p3, p1}, Ljava/security/MessageDigest;->update([BII)V

    .line 1774
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    .line 81
    new-instance p2, Ll/֡ۡ᩵;

    .line 66
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 81
    throw p2

    .line 1767
    :cond_1
    new-instance p1, Ll/֡֨᩵;

    invoke-direct {p1}, Ll/֡֨᩵;-><init>()V

    throw p1

    .line 1758
    :cond_2
    new-instance p1, Ll/֡֨᩵;

    invoke-direct {p1}, Ll/֡֨᩵;-><init>()V

    throw p1

    .line 1753
    :cond_3
    new-instance p1, Ll/֡֨᩵;

    invoke-direct {p1}, Ll/֡֨᩵;-><init>()V

    throw p1
.end method

.method public final ۖ()Ljava/lang/Long;
    .locals 16

    move-object/from16 v0, p0

    .line 806
    :cond_0
    iget-object v1, v0, Ll/᩷֨᩵;->֫֫:Ljava/io/InputStream;

    iget-object v2, v0, Ll/᩷֨᩵;->᩻֫:[B

    const/4 v3, 0x0

    const/4 v4, 0x4

    invoke-static {v1, v2, v3, v4}, Ll/۟֨᩵;->֫(Ljava/io/InputStream;[BII)I

    move-result v1

    const/4 v5, 0x0

    if-ge v1, v4, :cond_1

    return-object v5

    .line 810
    :cond_1
    aget-byte v1, v2, v3

    const/16 v6, -0x7b

    if-eq v1, v6, :cond_0

    .line 812
    iget-object v1, v0, Ll/᩷֨᩵;->֫֫:Ljava/io/InputStream;

    const/16 v6, 0x20

    invoke-static {v1, v2, v4, v6}, Ll/۟֨᩵;->֫(Ljava/io/InputStream;[BII)I

    move-result v1

    if-ge v1, v6, :cond_2

    return-object v5

    .line 816
    :cond_2
    sget-object v1, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    invoke-interface {v1}, Ll/֫᩻֨;->ܽ()Z

    move-result v7

    if-eqz v7, :cond_3

    .line 817
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "New data read: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v1, v7}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 818
    invoke-static {v2, v4, v6}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v1, v7}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 830
    :cond_3
    :goto_0
    aget-byte v7, v2, v3

    const/16 v8, 0x42

    const/4 v9, 0x7

    const/16 v10, 0x4d

    const/4 v11, 0x6

    const/16 v12, 0x53

    const/4 v13, 0x5

    const/4 v14, 0x1

    if-nez v7, :cond_5

    aget-byte v4, v2, v4

    const/4 v15, -0x2

    if-ne v4, v15, :cond_5

    aget-byte v4, v2, v13

    if-ne v4, v12, :cond_5

    aget-byte v4, v2, v11

    if-ne v4, v10, :cond_5

    aget-byte v4, v2, v9

    if-ne v4, v8, :cond_5

    .line 832
    iput-boolean v14, v0, Ll/᩷֨᩵;->ۡ֫:Z

    .line 835
    iget-object v1, v0, Ll/᩷֨᩵;->֫֫:Ljava/io/InputStream;

    const/16 v3, 0x24

    invoke-static {v1, v2, v3, v6}, Ll/۟֨᩵;->֫(Ljava/io/InputStream;[BII)I

    move-result v1

    if-ge v1, v6, :cond_4

    return-object v5

    .line 143
    :cond_4
    invoke-static {v6, v2}, Ll/ۗ֨᩵;->ᩳ(I[B)I

    move-result v1

    int-to-long v3, v1

    const-wide v7, 0xffffffffL

    and-long/2addr v3, v7

    shl-long/2addr v3, v6

    const/16 v1, 0x1c

    .line 145
    invoke-static {v1, v2}, Ll/ۗ֨᩵;->ᩳ(I[B)I

    move-result v1

    int-to-long v1, v1

    and-long/2addr v1, v7

    or-long/2addr v1, v3

    .line 838
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    return-object v1

    :cond_5
    const/4 v15, 0x4

    const/4 v4, -0x1

    if-nez v7, :cond_6

    .line 841
    aget-byte v7, v2, v14

    if-nez v7, :cond_6

    aget-byte v7, v2, v15

    if-ne v7, v4, :cond_6

    aget-byte v7, v2, v13

    if-ne v7, v12, :cond_6

    aget-byte v7, v2, v11

    if-ne v7, v10, :cond_6

    aget-byte v7, v2, v9

    if-ne v7, v8, :cond_6

    const/16 v1, 0x22

    .line 865
    invoke-static {v1, v2}, Ll/ۗ֨᩵;->ۧ(I[B)S

    move-result v1

    int-to-long v1, v1

    const-wide/32 v3, 0xffff

    and-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    return-object v1

    :cond_6
    const/4 v7, 0x0

    :goto_1
    const/16 v8, 0x23

    if-ge v7, v8, :cond_7

    const/16 v8, 0x10

    .line 849
    invoke-static {v2, v3, v8}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object v8

    const-string v9, "Possibly out of phase, trying to resync "

    invoke-virtual {v9, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v1, v8}, Ll/֫᩻֨;->ᩳ(Ljava/lang/String;)V

    add-int/lit8 v8, v7, 0x1

    .line 850
    aget-byte v9, v2, v8

    aput-byte v9, v2, v7

    move v7, v8

    goto :goto_1

    .line 853
    :cond_7
    iget-object v7, v0, Ll/᩷֨᩵;->֫֫:Ljava/io/InputStream;

    invoke-virtual {v7}, Ljava/io/InputStream;->read()I

    move-result v7

    if-ne v7, v4, :cond_8

    return-object v5

    :cond_8
    int-to-byte v4, v7

    .line 855
    aput-byte v4, v2, v8

    const/4 v4, 0x4

    goto/16 :goto_0
.end method

.method public final ۗ()Ljava/lang/String;
    .locals 1

    .line 178
    iget-object v0, p0, Ll/᩷֨᩵;->ۖ֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ۙ()Ll/ۘۡ᩵;
    .locals 1

    .line 172
    iget-object v0, p0, Ll/᩷֨᩵;->᩺:Ll/ۘۡ᩵;

    return-object v0
.end method

.method public final ۜ()Z
    .locals 2

    .line 205
    iget-object v0, p0, Ll/᩷֨᩵;->ܺ֫:Ljava/net/Socket;

    .line 206
    invoke-super {p0}, Ll/۟֨᩵;->ۜ()Z

    move-result v1

    if-nez v1, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/net/Socket;->isClosed()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ۤ()Z
    .locals 1

    .line 310
    iget-boolean v0, p0, Ll/᩷֨᩵;->ۢ֫:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 313
    :cond_0
    invoke-virtual {p0}, Ll/᩷֨᩵;->᩸()Ll/᩷ۖ᩵;

    move-result-object v0

    invoke-interface {v0}, Ll/᩷ۖ᩵;->ۖ()Z

    move-result v0

    return v0
.end method

.method public final ۧ(Ll/۟ܺ᩵;)I
    .locals 0

    if-eqz p1, :cond_0

    .line 161
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    :cond_0
    iget-object p1, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    .line 166
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p1

    check-cast p1, Ll/ܰۡ᩵;

    invoke-virtual {p1}, Ll/ܰۡ᩵;->᩺()I

    move-result p1

    return p1
.end method

.method public final ۧ(Ll/۟ܺ᩵;Ll/֫ۖ᩵;Ljava/util/Set;)Ll/֫ۖ᩵;
    .locals 3

    const-string v0, "Sending "

    .line 1500
    invoke-virtual {p0}, Ll/᩷֨᩵;->ᩴ()Z

    .line 1501
    iget-boolean v1, p0, Ll/᩷֨᩵;->ۡ֫:Z

    if-eqz v1, :cond_1

    instance-of v2, p1, Ll/ۗᩴ᩵;

    if-eqz v2, :cond_0

    goto :goto_0

    .line 1502
    :cond_0
    new-instance p2, Ll/ۗۚ᩵;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string p3, "Not an SMB2 request "

    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_0
    if-nez v1, :cond_3

    .line 1503
    instance-of v1, p1, Ll/ۨۖ᩵;

    if-eqz v1, :cond_2

    goto :goto_1

    .line 1504
    :cond_2
    new-instance p1, Ll/ۗۚ᩵;

    const-string p2, "Not an SMB1 request"

    invoke-direct {p1, p2}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1507
    :cond_3
    :goto_1
    iget-object v1, p0, Ll/᩷֨᩵;->ܽ֫:Ll/᩷ۖ᩵;

    invoke-interface {v1, p1}, Ll/᩷ۖ᩵;->ۧ(Ll/۟ܺ᩵;)V

    if-eqz p2, :cond_4

    .line 1510
    invoke-interface {p1, p2}, Ll/ܰܺ᩵;->֫(Ll/֫ۖ᩵;)V

    .line 1511
    invoke-interface {p1}, Ll/ܰܺ᩵;->getDigest()Ll/ܿۖ᩵;

    move-result-object v1

    invoke-interface {p2, v1}, Ll/ܰܺ᩵;->֫(Ll/ܿۖ᩵;)V

    .line 1515
    :cond_4
    :try_start_0
    sget-object v1, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    invoke-interface {v1}, Ll/֫᩻֨;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 1516
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 1518
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1521
    instance-of v0, p1, Ll/ᩳᩴ᩵;

    if-eqz v0, :cond_6

    .line 1522
    invoke-direct {p0, p1, p2, p3}, Ll/᩷֨᩵;->ܽ(Ll/۟ܺ᩵;Ll/֫ۖ᩵;Ljava/util/Set;)V

    goto :goto_2

    :cond_6
    if-eqz p2, :cond_7

    .line 1525
    invoke-interface {p1}, Ll/ܰܺ᩵;->᩶()I

    move-result v0

    invoke-interface {p2, v0}, Ll/ܰܺ᩵;->ܿ(I)V

    .line 1527
    :cond_7
    invoke-virtual {p0, p1, p2, p3}, Ll/᩷֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;Ljava/util/Set;)Ll/֫ۖ᩵;

    move-result-object p2
    :try_end_0
    .catch Ll/ۗۚ᩵; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1535
    :goto_2
    invoke-interface {v1}, Ll/֫᩻֨;->ܽ()Z

    move-result p3

    if-eqz p3, :cond_8

    .line 1536
    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Response is "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-interface {v1, p3}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 1539
    :cond_8
    invoke-direct {p0, p1}, Ll/᩷֨᩵;->ᩳ(Ll/۟ܺ᩵;)Z

    return-object p2

    :catch_0
    move-exception p1

    .line 1532
    new-instance p2, Ll/ۗۚ᩵;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2

    :catch_1
    move-exception p1

    .line 1530
    throw p1
.end method

.method public final declared-synchronized ۧ(ZZ)Z
    .locals 11

    const-string v1, "Currently "

    const-string v2, "Disconnecting transport "

    const-string v3, "Disconnecting transport while still in use "

    move-object v0, p0

    .line 7
    monitor-enter v0

    .line 743
    :try_start_0
    iget-object v4, p0, Ll/᩷֨᩵;->᩷֫:Ljava/util/LinkedList;

    invoke-interface {v4}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object v4

    .line 745
    invoke-virtual {p0}, Ll/۟֨᩵;->ܳ()J

    move-result-wide v5

    const/4 v7, 0x0

    if-eqz p2, :cond_0

    const-wide/16 v8, 0x1

    cmp-long v10, v5, v8

    if-nez v10, :cond_1

    :cond_0
    if-nez p2, :cond_2

    const-wide/16 v8, 0x0

    cmp-long p2, v5, v8

    if-lez p2, :cond_2

    .line 747
    :cond_1
    sget-object p2, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Ll/᩷֨᩵;->᩷֫:Ljava/util/LinkedList;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p2, v3}, Ll/֫᩻֨;->ᩳ(Ljava/lang/String;)V

    const/4 p2, 0x1

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    .line 751
    :goto_0
    sget-object v3, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    invoke-interface {v3}, Ll/֫᩻֨;->֫()Z

    move-result v5

    if-eqz v5, :cond_3

    .line 752
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v2}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :cond_3
    const/4 v2, 0x0

    .line 756
    :try_start_1
    invoke-interface {v3}, Ll/֫᩻֨;->ܽ()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 757
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩷֨᩵;->᩷֫:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->size()I

    move-result v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " session(s) active for "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v1}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 759
    :cond_4
    :goto_1
    invoke-interface {v4}, Ljava/util/ListIterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 761
    invoke-interface {v4}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩻֨᩵;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 763
    :try_start_2
    invoke-virtual {v1, p1, v7}, Ll/᩻֨᩵;->֫(ZZ)Z

    move-result v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    or-int/2addr p2, v1

    .line 767
    :goto_2
    :try_start_3
    invoke-interface {v4}, Ljava/util/ListIterator;->remove()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception v1

    .line 765
    :try_start_4
    sget-object v3, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    const-string v5, "Failed to close session"

    invoke-interface {v3, v5, v1}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_2

    .line 767
    :goto_3
    :try_start_5
    invoke-interface {v4}, Ljava/util/ListIterator;->remove()V

    .line 768
    throw p1

    .line 771
    :cond_5
    iget-object p1, p0, Ll/᩷֨᩵;->ܺ֫:Ljava/net/Socket;

    if-eqz p1, :cond_6

    .line 772
    invoke-virtual {p1}, Ljava/net/Socket;->shutdownOutput()V

    .line 773
    iget-object p1, p0, Ll/᩷֨᩵;->ᩳ֫:Ljava/io/OutputStream;

    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V

    .line 774
    iget-object p1, p0, Ll/᩷֨᩵;->֫֫:Ljava/io/InputStream;

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    .line 775
    iget-object p1, p0, Ll/᩷֨᩵;->ܺ֫:Ljava/net/Socket;

    invoke-virtual {p1}, Ljava/net/Socket;->close()V

    .line 776
    sget-object p1, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    const-string v1, "Socket closed"

    invoke-interface {p1, v1}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    goto :goto_4

    .line 778
    :cond_6
    sget-object p1, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    const-string v1, "Not yet initialized"

    invoke-interface {p1, v1}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 783
    :goto_4
    :try_start_6
    iput-object v2, p0, Ll/᩷֨᩵;->ܺ֫:Ljava/net/Socket;

    .line 784
    iput-object v2, p0, Ll/᩷֨᩵;->۟:Ll/ܿۖ᩵;

    .line 785
    iput-object v2, p0, Ll/᩷֨᩵;->ۖ֫:Ljava/lang/String;

    .line 786
    iget-object p1, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    :goto_5
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܳ()Ll/ۨۡ᩵;

    move-result-object p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_6

    :catchall_1
    move-exception p1

    goto :goto_7

    :catch_1
    move-exception p1

    .line 781
    :try_start_7
    sget-object v1, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    const-string v3, "Exception in disconnect"

    invoke-interface {v1, v3, p1}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 783
    :try_start_8
    iput-object v2, p0, Ll/᩷֨᩵;->ܺ֫:Ljava/net/Socket;

    .line 784
    iput-object v2, p0, Ll/᩷֨᩵;->۟:Ll/ܿۖ᩵;

    .line 785
    iput-object v2, p0, Ll/᩷֨᩵;->ۖ֫:Ljava/lang/String;

    .line 786
    iget-object p1, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    goto :goto_5

    :goto_6
    check-cast p1, Ll/ܺ֨᩵;

    invoke-virtual {p1, p0}, Ll/ܺ֨᩵;->֫(Ll/ۢ֨᩵;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 788
    monitor-exit v0

    return p2

    .line 783
    :goto_7
    :try_start_9
    iput-object v2, p0, Ll/᩷֨᩵;->ܺ֫:Ljava/net/Socket;

    .line 784
    iput-object v2, p0, Ll/᩷֨᩵;->۟:Ll/ܿۖ᩵;

    .line 785
    iput-object v2, p0, Ll/᩷֨᩵;->ۖ֫:Ljava/lang/String;

    .line 786
    iget-object p2, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    invoke-interface {p2}, Ll/ᩴۡ᩵;->ܳ()Ll/ۨۡ᩵;

    move-result-object p2

    check-cast p2, Ll/ܺ֨᩵;

    invoke-virtual {p2, p0}, Ll/ܺ֨᩵;->֫(Ll/ۢ֨᩵;)V

    .line 787
    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    throw p1
.end method

.method public final ۬()Z
    .locals 1

    .line 242
    iget-boolean v0, p0, Ll/᩷֨᩵;->ۡ֫:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ll/᩷֨᩵;->᩸()Ll/᩷ۖ᩵;

    move-result-object v0

    instance-of v0, v0, Ll/ۗ᩵᩵;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ܰ()V
    .locals 8

    .line 416
    new-instance v0, Ll/ܽ֡᩵;

    iget-object v1, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    invoke-interface {v1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v2

    iget-object v3, p0, Ll/᩷֨᩵;->᩺:Ll/ۘۡ᩵;

    invoke-interface {v3}, Ll/ۘۡ᩵;->ᩳ()Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x20

    const/4 v6, 0x0

    invoke-direct {v0, v2, v4, v5, v6}, Ll/ܽ֡᩵;-><init>(Ll/֨ۡ᩵;Ljava/lang/String;ILjava/lang/String;)V

    .line 418
    :goto_0
    new-instance v2, Ljava/net/Socket;

    invoke-direct {v2}, Ljava/net/Socket;-><init>()V

    iput-object v2, p0, Ll/᩷֨᩵;->ܺ֫:Ljava/net/Socket;

    .line 421
    new-instance v4, Ljava/net/InetSocketAddress;

    invoke-interface {v3}, Ll/ۘۡ᩵;->֫()Ljava/lang/String;

    move-result-object v5

    const/16 v6, 0x8b

    invoke-direct {v4, v5, v6}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    invoke-interface {v1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v5

    check-cast v5, Ll/ܰۡ᩵;

    invoke-virtual {v5}, Ll/ܰۡ᩵;->ܿ()I

    move-result v5

    invoke-virtual {v2, v4, v5}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    .line 422
    iget-object v2, p0, Ll/᩷֨᩵;->ܺ֫:Ljava/net/Socket;

    invoke-interface {v1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v4

    check-cast v4, Ll/ܰۡ᩵;

    invoke-virtual {v4}, Ll/ܰۡ᩵;->ۧ֫()I

    move-result v4

    invoke-virtual {v2, v4}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 424
    iget-object v2, p0, Ll/᩷֨᩵;->ܺ֫:Ljava/net/Socket;

    invoke-virtual {v2}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2

    iput-object v2, p0, Ll/᩷֨᩵;->ᩳ֫:Ljava/io/OutputStream;

    .line 425
    iget-object v2, p0, Ll/᩷֨᩵;->ܺ֫:Ljava/net/Socket;

    invoke-virtual {v2}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    iput-object v2, p0, Ll/᩷֨᩵;->֫֫:Ljava/io/InputStream;

    .line 427
    new-instance v2, Ll/᩵֡᩵;

    invoke-interface {v1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v4

    invoke-interface {v1}, Ll/ᩴۡ᩵;->ܽ()Ll/᩶ۡ᩵;

    move-result-object v5

    check-cast v5, Ll/ۢ֡᩵;

    invoke-virtual {v5}, Ll/ۢ֡᩵;->֫()Ll/ܽ֡᩵;

    move-result-object v5

    invoke-direct {v2, v4, v0, v5}, Ll/᩵֡᩵;-><init>(Ll/֨ۡ᩵;Ll/ܽ֡᩵;Ll/ܽ֡᩵;)V

    .line 428
    iget-object v4, p0, Ll/᩷֨᩵;->ᩳ֫:Ljava/io/OutputStream;

    iget-object v5, p0, Ll/᩷֨᩵;->᩻֫:[B

    invoke-virtual {v2, v5}, Ll/᩵֡᩵;->֫([B)I

    move-result v2

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6, v2}, Ljava/io/OutputStream;->write([BII)V

    .line 429
    iget-object v2, p0, Ll/᩷֨᩵;->֫֫:Ljava/io/InputStream;

    const/4 v4, 0x4

    invoke-static {v2, v5, v6, v4}, Ll/۟֨᩵;->֫(Ljava/io/InputStream;[BII)I

    move-result v2

    sget-object v7, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    if-lt v2, v4, :cond_7

    .line 437
    aget-byte v2, v5, v6

    and-int/lit16 v2, v2, 0xff

    const/4 v4, -0x1

    if-eq v2, v4, :cond_6

    const/16 v4, 0x82

    if-eq v2, v4, :cond_4

    const/16 v5, 0x83

    if-ne v2, v5, :cond_3

    .line 444
    iget-object v2, p0, Ll/᩷֨᩵;->֫֫:Ljava/io/InputStream;

    invoke-virtual {v2}, Ljava/io/InputStream;->read()I

    move-result v2

    and-int/lit16 v2, v2, 0xff

    const/16 v5, 0x80

    if-eq v2, v5, :cond_1

    if-ne v2, v4, :cond_0

    goto :goto_1

    .line 451
    :cond_0
    invoke-virtual {p0}, Ll/۟֨᩵;->ܽ()V

    .line 452
    new-instance v0, Ll/ۖ֡᩵;

    invoke-direct {v0, v2}, Ll/ۖ֡᩵;-><init>(I)V

    throw v0

    .line 448
    :cond_1
    :goto_1
    iget-object v2, p0, Ll/᩷֨᩵;->ܺ֫:Ljava/net/Socket;

    invoke-virtual {v2}, Ljava/net/Socket;->close()V

    .line 463
    invoke-interface {v3, v1}, Ll/ۘۡ᩵;->֫(Ll/ᩴۡ᩵;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Ll/ܽ֡᩵;->ܽ:Ljava/lang/String;

    if-eqz v2, :cond_2

    goto/16 :goto_0

    .line 465
    :cond_2
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to establish session with "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 459
    :cond_3
    invoke-virtual {p0}, Ll/۟֨᩵;->ܽ()V

    .line 460
    new-instance v0, Ll/ۖ֡᩵;

    invoke-direct {v0, v6}, Ll/ۖ֡᩵;-><init>(I)V

    throw v0

    .line 439
    :cond_4
    invoke-interface {v7}, Ll/֫᩻֨;->֫()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 440
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "session established ok with "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v7, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    :cond_5
    return-void

    .line 456
    :cond_6
    invoke-virtual {p0}, Ll/۟֨᩵;->ܽ()V

    .line 457
    new-instance v0, Ll/ۖ֡᩵;

    invoke-direct {v0, v4}, Ll/ۖ֡᩵;-><init>(I)V

    throw v0

    .line 431
    :cond_7
    :try_start_0
    iget-object v0, p0, Ll/᩷֨᩵;->ܺ֫:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    const-string v1, "Failed to close socket"

    .line 433
    invoke-interface {v7, v1, v0}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 435
    :goto_2
    new-instance v0, Ll/ۗۚ᩵;

    const-string v1, "EOF during NetBIOS session request"

    invoke-direct {v0, v1}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܽ(Ll/۟ܺ᩵;)J
    .locals 4

    .line 794
    iget-object v0, p0, Ll/᩷֨᩵;->ۧ֫:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    .line 795
    iget-boolean v2, p0, Ll/᩷֨᩵;->ۡ֫:Z

    if-nez v2, :cond_0

    const-wide/16 v2, 0x7d00

    .line 796
    rem-long/2addr v0, v2

    .line 798
    :cond_0
    invoke-interface {p1, v0, v1}, Ll/ܰܺ᩵;->֫(J)V

    return-wide v0
.end method

.method public final ᩳ()V
    .locals 6

    .line 685
    sget-object v1, Ll/᩷֨᩵;->ᩴ֫:Ll/֫᩻֨;

    invoke-interface {v1}, Ll/֫᩻֨;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 686
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Connecting in state "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Ll/۟֨᩵;->ۗ:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " addr "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/᩷֨᩵;->᩺:Ll/ۘۡ᩵;

    invoke-interface {v2}, Ll/ۘۡ᩵;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 691
    :cond_0
    :try_start_0
    iget v0, p0, Ll/᩷֨᩵;->ܿ֫:I

    invoke-direct {p0, v0}, Ll/᩷֨᩵;->֫(I)Ll/᩻ۖ᩵;

    move-result-object v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 707
    invoke-interface {v1}, Ll/֫᩻֨;->֫()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 708
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Negotiation response on "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Ll/۟֨᩵;->᩹:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " :"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 711
    :cond_1
    invoke-virtual {v2}, Ll/᩻ۖ᩵;->ܿ()Ll/᩷ۖ᩵;

    move-result-object v0

    .line 267
    iget-object v3, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    .line 711
    invoke-virtual {v2}, Ll/᩻ۖ᩵;->ܽ()Ll/ۜۖ᩵;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Ll/᩷ۖ᩵;->֫(Ll/ᩴۡ᩵;Ll/ۜۖ᩵;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 715
    invoke-virtual {v2}, Ll/᩻ۖ᩵;->ܿ()Ll/᩷ۖ᩵;

    move-result-object v0

    invoke-interface {v0}, Ll/᩷ۖ᩵;->ۖ()Z

    move-result v0

    .line 716
    invoke-virtual {v2}, Ll/᩻ۖ᩵;->ܿ()Ll/᩷ۖ᩵;

    move-result-object v3

    invoke-interface {v3}, Ll/᩷ۖ᩵;->ۚ()Z

    move-result v3

    .line 717
    invoke-interface {v1}, Ll/֫᩻֨;->֫()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 718
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Signature negotiation enforced "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v5, p0, Ll/᩷֨᩵;->ۢ֫:Z

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, " (server "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ") enabled false (server "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    iget-object v0, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    .line 720
    invoke-interface {v0}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 718
    invoke-interface {v1, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 724
    :cond_2
    iget-object v0, p0, Ll/᩷֨᩵;->᩺:Ll/ۘۡ᩵;

    invoke-interface {v0}, Ll/ۘۡ᩵;->ۧ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/᩷֨᩵;->ۖ֫:Ljava/lang/String;

    .line 725
    invoke-virtual {v2}, Ll/᩻ۖ᩵;->ܿ()Ll/᩷ۖ᩵;

    move-result-object v0

    iput-object v0, p0, Ll/᩷֨᩵;->ܽ֫:Ll/᩷ۖ᩵;

    .line 726
    invoke-virtual {v2}, Ll/᩻ۖ᩵;->ܿ()Ll/᩷ۖ᩵;

    move-result-object v0

    invoke-interface {v0}, Ll/᩷ۖ᩵;->᩻()Ll/᩸ۡ᩵;

    move-result-object v0

    sget-object v3, Ll/᩸ۡ᩵;->ۛ:Ll/᩸ۡ᩵;

    invoke-virtual {v0, v3}, Ll/᩸ۡ᩵;->֫(Ll/᩸ۡ᩵;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 727
    invoke-virtual {v2}, Ll/᩻ۖ᩵;->ᩳ()[B

    move-result-object v3

    .line 1745
    iget-object v0, p0, Ll/᩷֨᩵;->ܳ֫:[B

    monitor-enter v0

    .line 1746
    :try_start_1
    array-length v4, v3

    iget-object v5, p0, Ll/᩷֨᩵;->ܳ֫:[B

    invoke-virtual {p0, v4, v3, v5}, Ll/᩷֨᩵;->֫(I[B[B)[B

    move-result-object v3

    iput-object v3, p0, Ll/᩷֨᩵;->ܳ֫:[B

    .line 1747
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 728
    invoke-virtual {v2}, Ll/᩻ۖ᩵;->ܳ()[B

    move-result-object v0

    invoke-direct {p0, v0}, Ll/᩷֨᩵;->ۧ([B)V

    .line 729
    invoke-interface {v1}, Ll/֫᩻֨;->֫()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 730
    iget-object v0, p0, Ll/᩷֨᩵;->ܳ֫:[B

    const/4 v2, 0x0

    .line 86
    array-length v3, v0

    invoke-static {v0, v2, v3}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object v0

    const-string v2, "Preauth hash after negotiate "

    .line 730
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception v1

    .line 1747
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1

    :cond_3
    return-void

    .line 712
    :cond_4
    new-instance v0, Ll/ۗۚ᩵;

    const-string v1, "This client is not compatible with the server."

    invoke-direct {v0, v1}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_0
    move-exception v0

    .line 267
    iget-object v1, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    .line 693
    invoke-interface {v1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 699
    throw v0
.end method

.method public final ᩴ()Z
    .locals 4

    .line 672
    :try_start_0
    iget-object v0, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    invoke-interface {v0}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v0

    check-cast v0, Ll/ܰۡ᩵;

    invoke-virtual {v0}, Ll/ܰۡ᩵;->᩺()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p0, v0, v1}, Ll/۟֨᩵;->ۧ(J)Z

    move-result v0
    :try_end_0
    .catch Ll/֫۠᩵; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    .line 674
    new-instance v1, Ll/ۗۚ᩵;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to connect: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Ll/᩷֨᩵;->᩺:Ll/ۘۡ᩵;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1
.end method

.method public final ᩵()Ll/ܿۖ᩵;
    .locals 1

    .line 258
    iget-object v0, p0, Ll/᩷֨᩵;->۟:Ll/ܿۖ᩵;

    return-object v0
.end method

.method public final ᩶()[B
    .locals 1

    .line 1740
    iget-object v0, p0, Ll/᩷֨᩵;->ܳ֫:[B

    return-object v0
.end method

.method public final ᩸()Ll/᩷ۖ᩵;
    .locals 3

    .line 222
    :try_start_0
    iget-object v0, p0, Ll/᩷֨᩵;->ܽ֫:Ll/᩷ۖ᩵;

    if-nez v0, :cond_0

    .line 223
    iget-object v0, p0, Ll/᩷֨᩵;->ۘ֫:Ll/ᩴۡ᩵;

    invoke-interface {v0}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v0

    check-cast v0, Ll/ܰۡ᩵;

    invoke-virtual {v0}, Ll/ܰۡ᩵;->᩺()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p0, v0, v1}, Ll/۟֨᩵;->ۧ(J)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 228
    :cond_0
    iget-object v0, p0, Ll/᩷֨᩵;->ܽ֫:Ll/᩷ۖ᩵;

    if-eqz v0, :cond_1

    return-object v0

    .line 230
    :cond_1
    new-instance v0, Ll/ۗۚ᩵;

    const-string v1, "Connection did not complete, failed to get negotiation response"

    invoke-direct {v0, v1}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_0
    move-exception v0

    .line 226
    new-instance v1, Ll/ۗۚ᩵;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1
.end method

.method public final ᩹()I
    .locals 1

    .line 186
    iget-object v0, p0, Ll/᩷֨᩵;->᩷֫:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    return v0
.end method

.method public final ᩺()Z
    .locals 2

    .line 300
    iget-boolean v0, p0, Ll/᩷֨᩵;->ۢ֫:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 303
    :cond_0
    invoke-virtual {p0}, Ll/᩷֨᩵;->᩸()Ll/᩷ۖ᩵;

    move-result-object v0

    .line 304
    invoke-interface {v0}, Ll/᩷ۖ᩵;->᩸()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ll/᩷ۖ᩵;->ۖ()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩻()Z
    .locals 2

    .line 198
    iget-object v0, p0, Ll/᩷֨᩵;->ܺ֫:Ljava/net/Socket;

    .line 199
    invoke-super {p0}, Ll/۟֨᩵;->᩻()Z

    move-result v1

    if-nez v1, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/net/Socket;->isClosed()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
