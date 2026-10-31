.class public abstract Ll/᩵᩻ۘ;
.super Ljava/lang/Object;
.source "2BMB"


# static fields
.field public static final ֨:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field public ֡:Ljava/lang/Thread;

.field public volatile ֫:Z

.field public volatile ۖ:I

.field public volatile ۘ:I

.field public ۚ:[B

.field public volatile ۜ:I

.field public volatile ۡ:Z

.field public ۢ:I

.field public volatile ۧ:I

.field public ܳ:Ll/᩵᩷ۘ;

.field public volatile ܺ:I

.field public volatile ܽ:Z

.field public ܿ:I

.field public volatile ᩳ:Z

.field public volatile ᩴ:J

.field public ᩵:Ll/۟ۢۘ;

.field public volatile ᩷:I

.field public volatile ᩻:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 47
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Ll/᩵᩻ۘ;->֨:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 50
    iput v0, p0, Ll/᩵᩻ۘ;->ܺ:I

    .line 51
    sget-object v0, Ll/᩵ۡۘ;->ܽ:[B

    .line 397
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v1, "foo"

    .line 393
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 51
    iput-object v0, p0, Ll/᩵᩻ۘ;->ۚ:[B

    const/high16 v0, 0x100000

    .line 52
    iput v0, p0, Ll/᩵᩻ۘ;->᩷:I

    .line 53
    iget v0, p0, Ll/᩵᩻ۘ;->᩷:I

    iput v0, p0, Ll/᩵᩻ۘ;->ۜ:I

    const/16 v0, 0x4000

    .line 54
    iput v0, p0, Ll/᩵᩻ۘ;->᩻:I

    const-wide/16 v0, 0x0

    .line 56
    iput-wide v0, p0, Ll/᩵᩻ۘ;->ᩴ:J

    const/4 v0, 0x0

    .line 57
    iput v0, p0, Ll/᩵᩻ۘ;->ۘ:I

    const/4 v1, 0x0

    .line 59
    iput-object v1, p0, Ll/᩵᩻ۘ;->ܳ:Ll/᩵᩷ۘ;

    .line 60
    iput-object v1, p0, Ll/᩵᩻ۘ;->֡:Ljava/lang/Thread;

    .line 62
    iput-boolean v0, p0, Ll/᩵᩻ۘ;->ᩳ:Z

    .line 65
    iput-boolean v0, p0, Ll/᩵᩻ۘ;->֫:Z

    .line 66
    iput-boolean v0, p0, Ll/᩵᩻ۘ;->ܽ:Z

    .line 67
    iput-boolean v0, p0, Ll/᩵᩻ۘ;->ۡ:Z

    .line 71
    iput v0, p0, Ll/᩵᩻ۘ;->ۖ:I

    .line 72
    iput v0, p0, Ll/᩵᩻ۘ;->ۧ:I

    .line 76
    iput v0, p0, Ll/᩵᩻ۘ;->ۢ:I

    .line 84
    sget-object v0, Ll/᩵᩻ۘ;->֨:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    const v1, 0x7fffffff

    and-int/2addr v0, v1

    iput v0, p0, Ll/᩵᩻ۘ;->ܿ:I

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 519
    iget-boolean v0, p0, Ll/᩵᩻ۘ;->֫:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 521
    iput-boolean v0, p0, Ll/᩵᩻ۘ;->֫:Z

    .line 522
    iput-boolean v0, p0, Ll/᩵᩻ۘ;->ᩳ:Z

    .line 94
    iget v0, p0, Ll/᩵᩻ۘ;->ܺ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    goto :goto_0

    .line 529
    :cond_1
    :try_start_0
    new-instance v1, Ll/ܺ᩻ۘ;

    const/16 v2, 0x64

    invoke-direct {v1, v2}, Ll/ܺ᩻ۘ;-><init>(I)V

    .line 530
    new-instance v2, Ll/۠ۢۘ;

    invoke-direct {v2, v1}, Ll/۠ۢۘ;-><init>(Ll/ܺ᩻ۘ;)V

    .line 531
    invoke-virtual {v2}, Ll/۠ۢۘ;->֫()V

    const/16 v3, 0x61

    .line 532
    invoke-virtual {v1, v3}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 533
    invoke-virtual {v1, v0}, Ll/ܺ᩻ۘ;->ۧ(I)V

    move-object v0, p0

    .line 534
    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 535
    :try_start_1
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->᩻()Ll/۟ۢۘ;

    move-result-object v1

    invoke-virtual {v1, v2}, Ll/۟ۢۘ;->ۧ(Ll/۠ۢۘ;)V

    .line 536
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :goto_0
    return-void
.end method

.method public ֫(I)V
    .locals 2

    .line 104
    iput p1, p0, Ll/᩵᩻ۘ;->ۧ:I

    .line 106
    :try_start_0
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->ܺ()V

    .line 107
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->ᩴ()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const/4 v0, 0x0

    .line 109
    iput-boolean v0, p0, Ll/᩵᩻ۘ;->ܽ:Z

    .line 110
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->ۧ()V

    .line 111
    instance-of v0, p1, Ll/۫᩷ۘ;

    if-eqz v0, :cond_0

    .line 112
    check-cast p1, Ll/۫᩷ۘ;

    throw p1

    .line 113
    :cond_0
    new-instance v0, Ll/۫᩷ۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 43
    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 113
    throw v0
.end method

.method public final declared-synchronized ֫(J)V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 425
    :try_start_0
    iget-wide v1, p0, Ll/᩵᩻ۘ;->ᩴ:J

    add-long/2addr v1, p1

    iput-wide v1, p0, Ll/᩵᩻ۘ;->ᩴ:J

    .line 426
    iget p1, p0, Ll/᩵᩻ۘ;->ۢ:I

    if-lez p1, :cond_0

    .line 427
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 428
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

.method public ֫(Ll/ܺ᩻ۘ;)V
    .locals 2

    .line 126
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/᩵᩻ۘ;->ۧ(I)V

    .line 127
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ۢ()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ll/᩵᩻ۘ;->ۧ(J)V

    .line 128
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result p1

    .line 431
    iput p1, p0, Ll/᩵᩻ۘ;->ۘ:I

    return-void
.end method

.method public ֫([BII)V
    .locals 2

    .line 442
    :try_start_0
    iget-object v0, p0, Ll/᩵᩻ۘ;->ܳ:Ll/᩵᩷ۘ;

    .line 76
    iget-object v1, v0, Ll/᩵᩷ۘ;->ۧ:Ljava/io/OutputStream;

    invoke-virtual {v1, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 77
    iget-object p1, v0, Ll/᩵᩷ۘ;->ۧ:Ljava/io/OutputStream;

    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public final ۖ()V
    .locals 3

    .line 679
    new-instance v0, Ll/ܺ᩻ۘ;

    const/16 v1, 0xc8

    invoke-direct {v0, v1}, Ll/ܺ᩻ۘ;-><init>(I)V

    .line 680
    new-instance v1, Ll/۠ۢۘ;

    invoke-direct {v1, v0}, Ll/۠ۢۘ;-><init>(Ll/ܺ᩻ۘ;)V

    .line 681
    invoke-virtual {v1}, Ll/۠ۢۘ;->֫()V

    const/16 v2, 0x5b

    .line 682
    invoke-virtual {v0, v2}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 94
    iget v2, p0, Ll/᩵᩻ۘ;->ܺ:I

    .line 683
    invoke-virtual {v0, v2}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 684
    iget v2, p0, Ll/᩵᩻ۘ;->ܿ:I

    invoke-virtual {v0, v2}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 685
    iget v2, p0, Ll/᩵᩻ۘ;->ۜ:I

    invoke-virtual {v0, v2}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 686
    iget v2, p0, Ll/᩵᩻ۘ;->᩻:I

    invoke-virtual {v0, v2}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 687
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->᩻()Ll/۟ۢۘ;

    move-result-object v0

    invoke-virtual {v0, v1}, Ll/۟ۢۘ;->ۧ(Ll/۠ۢۘ;)V

    return-void
.end method

.method public final ۘ()V
    .locals 4

    .line 692
    :try_start_0
    new-instance v0, Ll/ܺ᩻ۘ;

    const/16 v1, 0xc8

    invoke-direct {v0, v1}, Ll/ܺ᩻ۘ;-><init>(I)V

    .line 693
    new-instance v1, Ll/۠ۢۘ;

    invoke-direct {v1, v0}, Ll/۠ۢۘ;-><init>(Ll/ܺ᩻ۘ;)V

    .line 694
    invoke-virtual {v1}, Ll/۠ۢۘ;->֫()V

    const/16 v2, 0x5c

    .line 695
    invoke-virtual {v0, v2}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 94
    iget v2, p0, Ll/᩵᩻ۘ;->ܺ:I

    .line 696
    invoke-virtual {v0, v2}, Ll/ܺ᩻ۘ;->ۧ(I)V

    const/4 v2, 0x1

    .line 697
    invoke-virtual {v0, v2}, Ll/ܺ᩻ۘ;->ۧ(I)V

    const-string v2, "open failed"

    .line 698
    sget-object v3, Ll/᩵ۡۘ;->ܽ:[B

    .line 397
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 393
    invoke-virtual {v2, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v2

    .line 698
    invoke-virtual {v0, v2}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 699
    sget-object v2, Ll/᩵ۡۘ;->ܽ:[B

    invoke-virtual {v0, v2}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 700
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->᩻()Ll/۟ۢۘ;

    move-result-object v0

    invoke-virtual {v0, v1}, Ll/۟ۢۘ;->ۧ(Ll/۠ۢۘ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public ۜ()V
    .locals 0

    return-void
.end method

.method public abstract ۡ()V
.end method

.method public final ۢ()Z
    .locals 1

    .line 582
    iget-object v0, p0, Ll/᩵᩻ۘ;->᩵:Ll/۟ۢۘ;

    if-eqz v0, :cond_0

    .line 584
    invoke-virtual {v0}, Ll/۟ۢۘ;->ۢ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/᩵᩻ۘ;->ܽ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ۧ()V
    .locals 2

    move-object v0, p0

    .line 552
    :try_start_0
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 553
    :try_start_1
    iget-boolean v1, p0, Ll/᩵᩻ۘ;->ܽ:Z

    if-nez v1, :cond_0

    .line 554
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 574
    iget-object v0, p0, Ll/᩵᩻ۘ;->᩵:Ll/۟ۢۘ;

    if-eqz v0, :cond_2

    .line 576
    invoke-virtual {v0, p0}, Ll/۟ۢۘ;->֫(Ll/᩵᩻ۘ;)V

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 556
    :try_start_2
    iput-boolean v1, p0, Ll/᩵᩻ۘ;->ܽ:Z

    .line 557
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 559
    :try_start_3
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->֫()V

    const/4 v0, 0x1

    .line 561
    iput-boolean v0, p0, Ll/᩵᩻ۘ;->ᩳ:Z

    const/4 v0, 0x0

    .line 563
    iput-object v0, p0, Ll/᩵᩻ۘ;->֡:Ljava/lang/Thread;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 566
    :try_start_4
    iget-object v0, p0, Ll/᩵᩻ۘ;->ܳ:Ll/᩵᩷ۘ;

    if-eqz v0, :cond_1

    .line 567
    invoke-virtual {v0}, Ll/᩵᩷ۘ;->֫()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_0

    :catch_0
    nop

    .line 574
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/᩵᩻ۘ;->᩵:Ll/۟ۢۘ;

    if-eqz v0, :cond_2

    .line 576
    invoke-virtual {v0, p0}, Ll/۟ۢۘ;->֫(Ll/᩵᩻ۘ;)V

    :cond_2
    return-void

    :catchall_0
    move-exception v1

    .line 557
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :catchall_1
    move-exception v0

    .line 574
    iget-object v1, p0, Ll/᩵᩻ۘ;->᩵:Ll/۟ۢۘ;

    if-eqz v1, :cond_3

    .line 576
    invoke-virtual {v1, p0}, Ll/۟ۢۘ;->֫(Ll/᩵᩻ۘ;)V

    .line 578
    :cond_3
    throw v0
.end method

.method public final declared-synchronized ۧ(I)V
    .locals 1

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 88
    :try_start_0
    iput p1, p0, Ll/᩵᩻ۘ;->ܺ:I

    .line 89
    iget p1, p0, Ll/᩵᩻ۘ;->ۢ:I

    if-lez p1, :cond_0

    .line 90
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
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

.method public final declared-synchronized ۧ(J)V
    .locals 1

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 421
    :try_start_0
    iput-wide p1, p0, Ll/᩵᩻ۘ;->ᩴ:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 422
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

.method public final ܳ()Ljava/io/InputStream;
    .locals 4

    .line 156
    iget-object v0, p0, Ll/᩵᩻ۘ;->᩵:Ll/۟ۢۘ;

    if-eqz v0, :cond_0

    .line 157
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->ۢ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3560
    iget-object v0, v0, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v0}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v0

    .line 157
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    const v0, 0x8000

    .line 163
    :try_start_0
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->᩻()Ll/۟ۢۘ;

    move-result-object v1

    const-string v2, "max_input_buffer_size"

    invoke-virtual {v1, v2}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const v1, 0x8000

    .line 166
    :goto_0
    new-instance v2, Ll/ۖ᩻ۘ;

    invoke-direct {v2, v1}, Ll/ۖ᩻ۘ;-><init>(I)V

    if-ge v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    .line 169
    :goto_1
    iget-object v1, p0, Ll/᩵᩻ۘ;->ܳ:Ll/᩵᩷ۘ;

    new-instance v3, Ll/ᩴ᩻ۘ;

    invoke-direct {v3, v2, v0}, Ll/ᩴ᩻ۘ;-><init>(Ljava/io/PipedInputStream;Z)V

    .line 44
    iput-object v3, v1, Ll/᩵᩷ۘ;->ۧ:Ljava/io/OutputStream;

    return-object v2
.end method

.method public final ܺ()V
    .locals 13

    .line 723
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->᩻()Ll/۟ۢۘ;

    move-result-object v1

    .line 724
    invoke-virtual {v1}, Ll/۟ۢۘ;->ۢ()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 728
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->ܿ()Ll/۠ۢۘ;

    move-result-object v0

    .line 729
    invoke-virtual {v1, v0}, Ll/۟ۢۘ;->ۧ(Ll/۠ۢۘ;)V

    .line 732
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 733
    iget v0, p0, Ll/᩵᩻ۘ;->ۧ:I

    int-to-long v4, v0

    const-wide/16 v6, 0x0

    const/4 v8, 0x1

    cmp-long v9, v4, v6

    if-eqz v9, :cond_0

    const/4 v0, 0x1

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    const/16 v0, 0x7d0

    const/16 v6, 0x7d0

    :goto_0
    move-object v0, p0

    .line 736
    monitor-enter v0

    .line 94
    :goto_1
    :try_start_0
    iget v7, p0, Ll/᩵᩻ۘ;->ܺ:I

    const/4 v10, -0x1

    if-ne v7, v10, :cond_3

    .line 737
    invoke-virtual {v1}, Ll/۟ۢۘ;->ۢ()Z

    move-result v7

    if-eqz v7, :cond_3

    if-lez v6, :cond_3

    const/4 v7, 0x0

    if-lez v9, :cond_1

    .line 739
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    sub-long/2addr v10, v2

    cmp-long v12, v10, v4

    if-lez v12, :cond_1

    const/4 v6, 0x0

    goto :goto_1

    :cond_1
    if-nez v9, :cond_2

    const-wide/16 v10, 0xa

    goto :goto_2

    :cond_2
    move-wide v10, v4

    .line 746
    :goto_2
    :try_start_1
    iput v8, p0, Ll/᩵᩻ۘ;->ۢ:I

    .line 747
    invoke-virtual {p0, v10, v11}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v1

    .line 750
    :try_start_2
    iput v7, p0, Ll/᩵᩻ۘ;->ۢ:I

    .line 751
    throw v1

    .line 750
    :catch_0
    :goto_3
    iput v7, p0, Ll/᩵᩻ۘ;->ۢ:I

    add-int/lit8 v6, v6, -0x1

    goto :goto_1

    .line 754
    :cond_3
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 755
    invoke-virtual {v1}, Ll/۟ۢۘ;->ۢ()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 94
    iget v0, p0, Ll/᩵᩻ۘ;->ܺ:I

    if-eq v0, v10, :cond_5

    .line 761
    iget-boolean v0, p0, Ll/᩵᩻ۘ;->ۡ:Z

    if-eqz v0, :cond_4

    .line 764
    iput-boolean v8, p0, Ll/᩵᩻ۘ;->ܽ:Z

    return-void

    .line 762
    :cond_4
    new-instance v0, Ll/۫᩷ۘ;

    const-string v1, "channel is not opened."

    .line 39
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 762
    throw v0

    .line 759
    :cond_5
    new-instance v0, Ll/۫᩷ۘ;

    const-string v1, "channel is not opened."

    .line 39
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 759
    throw v0

    .line 756
    :cond_6
    new-instance v0, Ll/۫᩷ۘ;

    const-string v1, "session is down"

    .line 39
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 756
    throw v0

    :catchall_1
    move-exception v1

    .line 754
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v1

    .line 725
    :cond_7
    new-instance v0, Ll/۫᩷ۘ;

    const-string v1, "session is down"

    .line 39
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 725
    throw v0
.end method

.method public final ܽ()V
    .locals 4

    .line 463
    iget-boolean v0, p0, Ll/᩵᩻ۘ;->ᩳ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 465
    iput-boolean v0, p0, Ll/᩵᩻ۘ;->ᩳ:Z

    .line 94
    iget v0, p0, Ll/᩵᩻ۘ;->ܺ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    goto :goto_0

    .line 472
    :cond_1
    :try_start_0
    new-instance v1, Ll/ܺ᩻ۘ;

    const/16 v2, 0x64

    invoke-direct {v1, v2}, Ll/ܺ᩻ۘ;-><init>(I)V

    .line 473
    new-instance v2, Ll/۠ۢۘ;

    invoke-direct {v2, v1}, Ll/۠ۢۘ;-><init>(Ll/ܺ᩻ۘ;)V

    .line 474
    invoke-virtual {v2}, Ll/۠ۢۘ;->֫()V

    const/16 v3, 0x60

    .line 475
    invoke-virtual {v1, v3}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 476
    invoke-virtual {v1, v0}, Ll/ܺ᩻ۘ;->ۧ(I)V

    move-object v0, p0

    .line 477
    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 478
    :try_start_1
    iget-boolean v1, p0, Ll/᩵᩻ۘ;->֫:Z

    if-nez v1, :cond_2

    .line 479
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->᩻()Ll/۟ۢۘ;

    move-result-object v1

    invoke-virtual {v1, v2}, Ll/۟ۢۘ;->ۧ(Ll/۠ۢۘ;)V

    .line 480
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :goto_0
    return-void
.end method

.method public ܿ()Ll/۠ۢۘ;
    .locals 3

    .line 706
    new-instance v0, Ll/ܺ᩻ۘ;

    const/16 v1, 0xc8

    invoke-direct {v0, v1}, Ll/ܺ᩻ۘ;-><init>(I)V

    .line 707
    new-instance v1, Ll/۠ۢۘ;

    invoke-direct {v1, v0}, Ll/۠ۢۘ;-><init>(Ll/ܺ᩻ۘ;)V

    .line 713
    invoke-virtual {v1}, Ll/۠ۢۘ;->֫()V

    const/16 v2, 0x5a

    .line 714
    invoke-virtual {v0, v2}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 715
    iget-object v2, p0, Ll/᩵᩻ۘ;->ۚ:[B

    invoke-virtual {v0, v2}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 716
    iget v2, p0, Ll/᩵᩻ۘ;->ܿ:I

    invoke-virtual {v0, v2}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 717
    iget v2, p0, Ll/᩵᩻ۘ;->ۜ:I

    invoke-virtual {v0, v2}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 718
    iget v2, p0, Ll/᩵᩻ۘ;->᩻:I

    invoke-virtual {v0, v2}, Ll/ܺ᩻ۘ;->ۧ(I)V

    return-object v1
.end method

.method public ᩳ()V
    .locals 1

    .line 457
    :try_start_0
    iget-object v0, p0, Ll/᩵᩻ۘ;->ܳ:Ll/᩵᩷ۘ;

    invoke-virtual {v0}, Ll/᩵᩷ۘ;->ܽ()V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public ᩴ()V
    .locals 0

    return-void
.end method

.method public final ᩷()Z
    .locals 1

    .line 543
    iget-boolean v0, p0, Ll/᩵᩻ۘ;->֫:Z

    return v0
.end method

.method public final ᩻()Ll/۟ۢۘ;
    .locals 2

    .line 667
    iget-object v0, p0, Ll/᩵᩻ۘ;->᩵:Ll/۟ۢۘ;

    if-eqz v0, :cond_0

    return-object v0

    .line 669
    :cond_0
    new-instance v0, Ll/۫᩷ۘ;

    const-string v1, "session is not available"

    .line 39
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 669
    throw v0
.end method
