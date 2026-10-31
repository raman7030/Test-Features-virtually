.class public final Ll/᩵᩶ܿ;
.super Ljava/lang/Object;
.source "N17O"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final ۗ:Ljava/io/DataInputStream;

.field public final ۙ:Z

.field public final ۛ:Ljava/io/DataOutputStream;

.field public final ۤ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final ۨ:Ll/ۙ᩸ܿ;

.field public final ۫:Ljava/util/concurrent/locks/ReentrantLock;

.field public volatile ۬:J

.field public final ܰ:I

.field public final ᩶:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final ᩸:I

.field public volatile ᩹:Z

.field public final ᩺:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Ll/ۙ᩸ܿ;Z)V
    .locals 3

    .line 423
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 415
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Ll/᩵᩶ܿ;->۫:Ljava/util/concurrent/locks/ReentrantLock;

    .line 416
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Ll/᩵᩶ܿ;->ۤ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 417
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Ll/᩵᩶ܿ;->᩺:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 418
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Ll/᩵᩶ܿ;->᩶:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 424
    iput-object p1, p0, Ll/᩵᩶ܿ;->ۨ:Ll/ۙ᩸ܿ;

    .line 425
    iput-boolean p2, p0, Ll/᩵᩶ܿ;->ۙ:Z

    .line 479
    new-instance p2, Ljava/io/DataInputStream;

    new-instance v0, Ll/ۘ᩶ܿ;

    invoke-interface {p1}, Ll/ۙ᩸ܿ;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    invoke-direct {v0, p0, v2}, Ll/ۘ᩶ܿ;-><init>(Ll/᩵᩶ܿ;Ljava/io/InputStream;)V

    invoke-direct {p2, v0}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 426
    iput-object p2, p0, Ll/᩵᩶ܿ;->ۗ:Ljava/io/DataInputStream;

    .line 545
    new-instance v0, Ljava/io/BufferedOutputStream;

    invoke-interface {p1}, Ll/ۙ᩸ܿ;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2

    invoke-interface {p1}, Ll/ۙ᩸ܿ;->getSendBufferSize()I

    move-result p1

    invoke-direct {v0, v2, p1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V

    .line 546
    new-instance p1, Ljava/io/DataOutputStream;

    new-instance v2, Ll/ᩴ᩶ܿ;

    invoke-direct {v2, p0, v0}, Ll/ᩴ᩶ܿ;-><init>(Ll/᩵᩶ܿ;Ljava/io/BufferedOutputStream;)V

    invoke-direct {p1, v2}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 427
    iput-object p1, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    const/4 p1, 0x4

    new-array v0, p1, [B

    .line 646
    :try_start_0
    invoke-virtual {p2, v0, v1, p1}, Ljava/io/DataInputStream;->readFully([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 432
    invoke-static {}, Ll/᩹᩶ܿ;->֫()[B

    move-result-object p1

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 435
    invoke-direct {p0}, Ll/᩵᩶ܿ;->ܶ()I

    move-result p1

    iput p1, p0, Ll/᩵᩶ܿ;->᩸:I

    .line 436
    invoke-direct {p0}, Ll/᩵᩶ܿ;->ܶ()I

    move-result p1

    iput p1, p0, Ll/᩵᩶ܿ;->ܰ:I

    return-void

    .line 433
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Magic error"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_0
    move-exception p1

    .line 648
    invoke-direct {p0, p1}, Ll/᩵᩶ܿ;->֫(Ljava/io/IOException;)V

    throw p1
.end method

.method private ֡()Ll/ܿ᩹ܿ;
    .locals 14

    .line 1470
    iget-object v0, p0, Ll/᩵᩶ܿ;->ۗ:Ljava/io/DataInputStream;

    invoke-direct {p0}, Ll/᩵᩶ܿ;->᩶()Ljava/lang/String;

    move-result-object v2

    .line 618
    :try_start_0
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 1472
    invoke-direct {p0}, Ll/᩵᩶ܿ;->ܶ()I

    move-result v4

    .line 1473
    invoke-direct {p0}, Ll/᩵᩶ܿ;->ܶ()I

    move-result v5

    .line 1474
    invoke-direct {p0}, Ll/᩵᩶ܿ;->᩸()J

    move-result-wide v6

    .line 1475
    invoke-direct {p0}, Ll/᩵᩶ܿ;->᩸()J

    move-result-wide v8

    .line 1476
    invoke-direct {p0}, Ll/᩵᩶ܿ;->᩸()J

    move-result-wide v10

    const v1, 0xf000

    and-int/2addr v1, v3

    const v12, 0xa000

    if-ne v1, v12, :cond_0

    .line 1480
    invoke-direct {p0}, Ll/᩵᩶ܿ;->᩶()Ljava/lang/String;

    move-result-object v1

    .line 618
    :try_start_1
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    move v13, v0

    move-object v12, v1

    goto :goto_0

    :catch_0
    move-exception v0

    .line 620
    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(Ljava/io/IOException;)V

    throw v0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    move-object v12, v0

    const/4 v13, 0x0

    .line 1483
    :goto_0
    new-instance v0, Ll/ܿ᩹ܿ;

    move-object v1, v0

    invoke-direct/range {v1 .. v13}, Ll/ܿ᩹ܿ;-><init>(Ljava/lang/String;IIIJJJLjava/lang/String;I)V

    return-object v0

    :catch_1
    move-exception v0

    .line 620
    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(Ljava/io/IOException;)V

    throw v0
.end method

.method public static ֫(Ll/᩵᩶ܿ;)B
    .locals 1

    .line 610
    :try_start_0
    iget-object v0, p0, Ll/᩵᩶ܿ;->ۗ:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readByte()B

    move-result p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception v0

    .line 612
    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(Ljava/io/IOException;)V

    throw v0
.end method

.method public static ֫(Ll/᩵᩶ܿ;III[B)I
    .locals 2

    .line 814
    iget-object v0, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    if-ltz p2, :cond_3

    if-ltz p3, :cond_3

    array-length v1, p4

    if-gt p3, v1, :cond_3

    array-length v1, p4

    sub-int/2addr v1, p3

    if-gt p2, v1, :cond_3

    if-nez p2, :cond_0

    const/4 p0, 0x0

    return p0

    .line 820
    :cond_0
    iget v1, p0, Ll/᩵᩶ܿ;->᩸:I

    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    move-result p2

    const/16 v1, 0xc

    .line 821
    invoke-direct {p0, v1}, Ll/᩵᩶ܿ;->֫(B)V

    .line 822
    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 823
    invoke-virtual {v0, p2}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 824
    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V

    const-string p1, "Read failed"

    const/16 v0, 0x8

    .line 825
    invoke-direct {p0, v0, p1}, Ll/᩵᩶ܿ;->ۧ(ILjava/lang/String;)I

    .line 826
    invoke-direct {p0}, Ll/᩵᩶ܿ;->ܶ()I

    move-result p1

    if-ltz p1, :cond_2

    if-gt p1, p2, :cond_2

    .line 827
    array-length p2, p4

    sub-int/2addr p2, p3

    if-gt p1, p2, :cond_2

    .line 646
    :try_start_0
    iget-object p2, p0, Ll/᩵᩶ܿ;->ۗ:Ljava/io/DataInputStream;

    invoke-virtual {p2, p4, p3, p1}, Ljava/io/DataInputStream;->readFully([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_1

    const/4 p0, -0x1

    return p0

    :cond_1
    return p1

    :catch_0
    move-exception p1

    .line 648
    invoke-direct {p0, p1}, Ll/᩵᩶ܿ;->֫(Ljava/io/IOException;)V

    throw p1

    :cond_2
    const-string p2, "Invalid read size: "

    .line 0
    invoke-static {p1, p2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 828
    invoke-direct {p0, p1}, Ll/᩵᩶ܿ;->ᩴ(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object p0

    throw p0

    .line 815
    :cond_3
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    throw p0
.end method

.method public static synthetic ֫(Ll/᩵᩶ܿ;I)J
    .locals 1

    const/16 v0, 0x12

    .line 910
    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(B)V

    .line 911
    iget-object v0, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 912
    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V

    const-string p1, "Length failed"

    const/4 v0, 0x5

    .line 913
    invoke-direct {p0, v0, p1}, Ll/᩵᩶ܿ;->ۧ(ILjava/lang/String;)I

    .line 914
    invoke-direct {p0}, Ll/᩵᩶ܿ;->᩸()J

    move-result-wide p0

    return-wide p0
.end method

.method private ֫(Ll/᩻᩹ܿ;)J
    .locals 5

    .line 1756
    iget-object v0, p0, Ll/᩵᩶ܿ;->۫:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    .line 1758
    :try_start_0
    iget-object v3, p0, Ll/᩵᩶ܿ;->ۤ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 1762
    iget-object v3, p0, Ll/᩵᩶ܿ;->ۨ:Ll/ۙ᩸ܿ;

    invoke-interface {v3}, Ll/ۙ᩸ܿ;->ۨۧ()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {}, Ll/ۧۨۡ;->֫()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1763
    sget-object v3, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v4, Ll/۫᩹ܿ;

    invoke-direct {v4, p1}, Ll/۫᩹ܿ;-><init>(Ll/᩻᩹ܿ;)V

    invoke-interface {v3, v4}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 1765
    :try_start_1
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 1767
    :try_start_2
    invoke-static {p1}, Ll/᩹᩶ܿ;->֫(Ljava/lang/Throwable;)V

    throw v0

    .line 1770
    :cond_0
    invoke-interface {p1}, Ll/᩻᩹ܿ;->call()J

    move-result-wide v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 1779
    :goto_0
    iget-object p1, p0, Ll/᩵᩶ܿ;->۫:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 1780
    iput-wide v1, p0, Ll/᩵᩶ܿ;->۬:J

    return-wide v3

    .line 1759
    :cond_1
    :try_start_3
    new-instance p1, Ljava/io/IOException;

    const-string v3, "Connection closed"

    invoke-direct {p1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    .line 1832
    :try_start_4
    invoke-static {p1}, Ll/᩹᩶ܿ;->֫(Ljava/lang/Throwable;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p1

    .line 1779
    iget-object v0, p0, Ll/᩵᩶ܿ;->۫:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 1780
    iput-wide v1, p0, Ll/᩵᩶ܿ;->۬:J

    .line 1781
    throw p1
.end method

.method public static ֫(Ll/᩵᩶ܿ;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Landroid/os/ParcelFileDescriptor;
    .locals 5

    .line 741
    invoke-static {p2}, Ll/᩹᩶ܿ;->ۧ(Ljava/lang/String;)B

    move-result p2

    const-string v0, "Path"

    .line 1505
    invoke-static {p1, v0}, Ll/᩵᩶ܿ;->ܿ(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object p1

    const/16 v0, 0xa

    .line 743
    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(B)V

    .line 745
    invoke-direct {p0, p1}, Ll/᩵᩶ܿ;->ܽ([B)V

    .line 746
    iget-object p1, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    invoke-virtual {p1, p2}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 747
    invoke-virtual {p1}, Ljava/io/DataOutputStream;->flush()V

    .line 1601
    iget-object p1, p0, Ll/᩵᩶ܿ;->ۤ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1604
    sget-object p2, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ll/ܽ᩶ܿ;

    invoke-direct {v1, p0, p3}, Ll/ܽ᩶ܿ;-><init>(Ll/᩵᩶ܿ;I)V

    invoke-interface {p2, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p2

    const/4 p3, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_6

    .line 1614
    :try_start_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x1f4

    invoke-interface {p2, v3, v4, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide p1
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    const/16 p3, 0x20

    ushr-long v0, p1, p3

    const-wide/16 v2, 0xff

    and-long/2addr v0, v2

    long-to-int p3, v0

    int-to-byte p3, p3

    const/4 v0, -0x1

    if-eq p3, v0, :cond_2

    if-nez p3, :cond_1

    long-to-int p0, p1

    if-gez p0, :cond_0

    .line 757
    invoke-static {}, Ll/᩹᩶ܿ;->ۧ()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0, p4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const/4 p0, 0x0

    goto :goto_1

    .line 766
    :cond_0
    invoke-static {p0}, Landroid/os/ParcelFileDescriptor;->adoptFd(I)Landroid/os/ParcelFileDescriptor;

    move-result-object p0

    :goto_1
    return-object p0

    :cond_1
    const-string p1, "Unknown open fd result code: "

    .line 0
    invoke-static {p3, p1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 780
    invoke-direct {p0, p1}, Ll/᩵᩶ܿ;->ᩴ(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object p0

    throw p0

    .line 769
    :cond_2
    invoke-direct {p0}, Ll/᩵᩶ܿ;->᩶()Ljava/lang/String;

    move-result-object p0

    .line 770
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p0, "Open fd failed"

    .line 776
    :cond_3
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_0
    move-exception p0

    .line 1621
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    .line 1622
    instance-of p1, p0, Ljava/io/IOException;

    if-nez p1, :cond_5

    .line 1625
    instance-of p1, p0, Ljava/lang/RuntimeException;

    if-eqz p1, :cond_4

    .line 1626
    check-cast p0, Ljava/lang/RuntimeException;

    throw p0

    .line 1628
    :cond_4
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    .line 1623
    :cond_5
    check-cast p0, Ljava/io/IOException;

    throw p0

    :catch_1
    move-exception p2

    .line 1617
    invoke-virtual {p1, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1618
    invoke-direct {p0}, Ll/᩵᩶ܿ;->᩵()V

    .line 1619
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, p2}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p0

    :catch_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1631
    :cond_6
    invoke-virtual {p1, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1632
    invoke-direct {p0}, Ll/᩵᩶ܿ;->᩵()V

    const/4 p0, 0x1

    .line 1633
    invoke-interface {p2, p0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 1634
    new-instance p0, Ll/᩵ۤۡ;

    const-string p1, "Open fd failed, timeout after 5 seconds"

    .line 14
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1634
    throw p0
.end method

.method private ֫(Ll/ۜ᩹ܿ;Z)Ljava/lang/Object;
    .locals 5

    .line 1789
    iget-object v0, p0, Ll/᩵᩶ܿ;->۫:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    .line 1791
    :try_start_0
    iget-object v3, p0, Ll/᩵᩶ܿ;->ۤ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 1795
    iget-object v3, p0, Ll/᩵᩶ܿ;->ۨ:Ll/ۙ᩸ܿ;

    invoke-interface {v3}, Ll/ۙ᩸ܿ;->ۨۧ()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {}, Ll/ۧۨۡ;->֫()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1796
    sget-object v3, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v4, Ll/᩹᩹ܿ;

    invoke-direct {v4, p1}, Ll/᩹᩹ܿ;-><init>(Ll/ۜ᩹ܿ;)V

    invoke-interface {v3, v4}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 1798
    :try_start_1
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 1800
    :try_start_2
    invoke-static {p1}, Ll/᩹᩶ܿ;->֫(Ljava/lang/Throwable;)V

    throw v0

    .line 1803
    :cond_0
    invoke-interface {p1}, Ll/ۜ᩹ܿ;->call()Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 1819
    :goto_0
    iget-object p2, p0, Ll/᩵᩶ܿ;->۫:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 1820
    iput-wide v1, p0, Ll/᩵᩶ܿ;->۬:J

    return-object p1

    .line 1792
    :cond_1
    :try_start_3
    new-instance p1, Ljava/io/IOException;

    const-string v3, "Connection closed"

    invoke-direct {p1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    if-eqz p2, :cond_2

    .line 1832
    :try_start_4
    invoke-static {p1}, Ll/᩹᩶ܿ;->֫(Ljava/lang/Throwable;)V

    throw v0

    .line 1817
    :cond_2
    invoke-static {p1}, Ll/᩹᩶ܿ;->֫(Ljava/lang/Throwable;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p1

    .line 1819
    iget-object p2, p0, Ll/᩵᩶ܿ;->۫:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 1820
    iput-wide v1, p0, Ll/᩵᩶ܿ;->۬:J

    .line 1821
    throw p1
.end method

.method public static ֫(Ll/᩵᩶ܿ;Ljava/lang/String;Z)Ljava/util/ArrayList;
    .locals 1

    .line 1505
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "Path"

    invoke-static {p1, v0}, Ll/᩵᩶ܿ;->ܿ(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object p1

    const/16 v0, 0x14

    .line 935
    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(B)V

    .line 937
    invoke-direct {p0, p1}, Ll/᩵᩶ܿ;->ܽ([B)V

    .line 938
    iget-object p1, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    invoke-virtual {p1, p2}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    .line 939
    invoke-virtual {p1}, Ljava/io/DataOutputStream;->flush()V

    const-string p1, "List dir failed"

    const/16 p2, 0x1e

    .line 941
    invoke-direct {p0, p2, p1}, Ll/᩵᩶ܿ;->ۧ(ILjava/lang/String;)I

    .line 943
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 945
    :goto_0
    invoke-direct {p0}, Ll/᩵᩶ܿ;->᩹()I

    move-result p2

    const/16 v0, 0xfe

    if-ne p2, v0, :cond_0

    .line 946
    invoke-direct {p0}, Ll/᩵᩶ܿ;->֡()Ll/ܿ᩹ܿ;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/16 v0, 0xef

    if-ne p2, v0, :cond_1

    return-object p1

    .line 950
    :cond_1
    invoke-virtual {p0}, Ll/᩵᩶ܿ;->close()V

    .line 951
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Error"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/᩵᩶ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۚ᩶ܿ;
    .locals 1

    .line 794
    invoke-static {p2}, Ll/᩹᩶ܿ;->ۧ(Ljava/lang/String;)B

    move-result p2

    const-string v0, "Path"

    .line 1505
    invoke-static {p1, v0}, Ll/᩵᩶ܿ;->ܿ(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object p1

    const/16 v0, 0xb

    .line 796
    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(B)V

    .line 798
    invoke-direct {p0, p1}, Ll/᩵᩶ܿ;->ܽ([B)V

    .line 799
    iget-object p1, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    invoke-virtual {p1, p2}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 800
    invoke-virtual {p1}, Ljava/io/DataOutputStream;->flush()V

    const-string p1, "Open failed"

    const/4 p2, 0x5

    .line 801
    invoke-direct {p0, p2, p1}, Ll/᩵᩶ܿ;->ۧ(ILjava/lang/String;)I

    .line 803
    new-instance p1, Ll/ۚ᩶ܿ;

    .line 618
    :try_start_0
    iget-object p2, p0, Ll/᩵᩶ܿ;->ۗ:Ljava/io/DataInputStream;

    invoke-virtual {p2}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result p2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 803
    invoke-direct {p1, p0, p2}, Ll/ۚ᩶ܿ;-><init>(Ll/᩵᩶ܿ;I)V

    .line 804
    iget-object p0, p0, Ll/᩵᩶ܿ;->᩶:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    return-object p1

    :catch_0
    move-exception p1

    .line 620
    invoke-direct {p0, p1}, Ll/᩵᩶ܿ;->֫(Ljava/io/IOException;)V

    throw p1
.end method

.method private ֫(B)V
    .locals 1

    .line 1533
    iget-object v0, p0, Ll/᩵᩶ܿ;->ۤ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1536
    iget-object v0, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->writeByte(I)V

    return-void

    .line 1534
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Connection closed"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ֫(Ljava/io/IOException;)V
    .locals 1

    .line 452
    invoke-virtual {p0}, Ll/᩵᩶ܿ;->ܽ()V

    .line 453
    iget-object p1, p0, Ll/᩵᩶ܿ;->ۤ:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 454
    invoke-direct {p0}, Ll/᩵᩶ܿ;->᩵()V

    return-void
.end method

.method private ֫(Ll/ܳ᩹ܿ;Z)V
    .locals 5

    .line 1699
    iget-object v0, p0, Ll/᩵᩶ܿ;->۫:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    .line 1701
    :try_start_0
    iget-object v3, p0, Ll/᩵᩶ܿ;->ۤ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 1704
    iget-object v3, p0, Ll/᩵᩶ܿ;->ۨ:Ll/ۙ᩸ܿ;

    invoke-interface {v3}, Ll/ۙ᩸ܿ;->ۨۧ()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {}, Ll/ۧۨۡ;->֫()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1705
    sget-object v3, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v4, Ll/֨᩹ܿ;

    invoke-direct {v4, p1}, Ll/֨᩹ܿ;-><init>(Ll/ܳ᩹ܿ;)V

    invoke-interface {v3, v4}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 1710
    :try_start_1
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 1712
    :try_start_2
    invoke-static {p1}, Ll/᩹᩶ܿ;->֫(Ljava/lang/Throwable;)V

    throw v0

    .line 1715
    :cond_0
    invoke-interface {p1}, Ll/ܳ᩹ܿ;->call()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_0
    if-eqz p2, :cond_1

    .line 1721
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    :cond_1
    iput-wide v1, p0, Ll/᩵᩶ܿ;->۬:J

    .line 1722
    iget-object p1, p0, Ll/᩵᩶ܿ;->۫:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    .line 1702
    :cond_2
    :try_start_3
    new-instance p1, Ljava/io/IOException;

    const-string v3, "Connection closed"

    invoke-direct {p1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    .line 1832
    :try_start_4
    invoke-static {p1}, Ll/᩹᩶ܿ;->֫(Ljava/lang/Throwable;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p1

    if-eqz p2, :cond_3

    .line 1721
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    :cond_3
    iput-wide v1, p0, Ll/᩵᩶ܿ;->۬:J

    .line 1722
    iget-object p2, p0, Ll/᩵᩶ܿ;->۫:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 1723
    throw p1
.end method

.method public static synthetic ֫(Ll/᩵᩶ܿ;IJ)V
    .locals 1

    const/16 v0, 0x13

    .line 922
    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(B)V

    .line 923
    iget-object v0, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 924
    invoke-virtual {v0, p2, p3}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 925
    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V

    const-string p1, "Truncate failed"

    const/4 p2, 0x5

    .line 926
    invoke-direct {p0, p2, p1}, Ll/᩵᩶ܿ;->ۧ(ILjava/lang/String;)I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩵᩶ܿ;Ljava/io/IOException;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/᩵᩶ܿ;->֫(Ljava/io/IOException;)V

    return-void
.end method

.method public static synthetic ֫(Ll/᩵᩶ܿ;Ljava/lang/String;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1289
    invoke-static {p1}, Ll/᩵᩶ܿ;->ۘ(Ljava/lang/String;)[B

    move-result-object p1

    const/16 v0, 0x29

    .line 1290
    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(B)V

    .line 1292
    invoke-direct {p0, p1}, Ll/᩵᩶ܿ;->ܽ([B)V

    .line 1293
    iget-object p1, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    invoke-virtual {p1}, Ljava/io/DataOutputStream;->flush()V

    const-string p1, "Remove empty directory failed"

    const/16 v0, 0x3c

    .line 1295
    invoke-direct {p0, v0, p1}, Ll/᩵᩶ܿ;->ۧ(ILjava/lang/String;)I

    return-void
.end method

.method public static synthetic ֫(Ll/᩵᩶ܿ;Ljava/lang/String;I)V
    .locals 1

    .line 1364
    invoke-static {p1}, Ll/᩵᩶ܿ;->ۘ(Ljava/lang/String;)[B

    move-result-object p1

    const/16 v0, 0x21

    .line 1365
    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(B)V

    .line 1366
    invoke-direct {p0, p1}, Ll/᩵᩶ܿ;->ܽ([B)V

    .line 1367
    iget-object p1, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 1368
    invoke-virtual {p1, p2}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 1369
    invoke-virtual {p1}, Ljava/io/DataOutputStream;->flush()V

    const-string p1, "Remove attr failed"

    const/4 p2, 0x5

    .line 1370
    invoke-direct {p0, p2, p1}, Ll/᩵᩶ܿ;->ۧ(ILjava/lang/String;)I

    return-void
.end method

.method public static synthetic ֫(Ll/᩵᩶ܿ;Ljava/lang/String;IIZZ)V
    .locals 1

    .line 1179
    invoke-static {p1}, Ll/᩵᩶ܿ;->ۘ(Ljava/lang/String;)[B

    move-result-object p1

    const/16 v0, 0x1b

    .line 1180
    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(B)V

    .line 1182
    invoke-direct {p0, p1}, Ll/᩵᩶ܿ;->ܽ([B)V

    .line 1183
    iget-object p1, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    invoke-virtual {p1, p2}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 1184
    invoke-virtual {p1, p3}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 1185
    invoke-virtual {p1, p4}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    .line 1186
    invoke-virtual {p1, p5}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    .line 1187
    invoke-virtual {p1}, Ljava/io/DataOutputStream;->flush()V

    const-string p1, "Chown failed"

    const/4 p2, 0x5

    .line 1189
    invoke-direct {p0, p2, p1}, Ll/᩵᩶ܿ;->ۧ(ILjava/lang/String;)I

    return-void
.end method

.method public static synthetic ֫(Ll/᩵᩶ܿ;Ljava/lang/String;IZZ)V
    .locals 1

    .line 1162
    invoke-static {p1}, Ll/᩵᩶ܿ;->ۘ(Ljava/lang/String;)[B

    move-result-object p1

    const/16 v0, 0x1a

    .line 1163
    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(B)V

    .line 1165
    invoke-direct {p0, p1}, Ll/᩵᩶ܿ;->ܽ([B)V

    .line 1166
    iget-object p1, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    invoke-virtual {p1, p2}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 1167
    invoke-virtual {p1, p3}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    .line 1168
    invoke-virtual {p1, p4}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    .line 1169
    invoke-virtual {p1}, Ljava/io/DataOutputStream;->flush()V

    const-string p1, "Chmod failed"

    const/4 p2, 0x5

    .line 1171
    invoke-direct {p0, p2, p1}, Ll/᩵᩶ܿ;->ۧ(ILjava/lang/String;)I

    return-void
.end method

.method public static synthetic ֫(Ll/᩵᩶ܿ;Ljava/lang/String;J)V
    .locals 1

    .line 1303
    invoke-static {p1}, Ll/᩵᩶ܿ;->ۘ(Ljava/lang/String;)[B

    move-result-object p1

    const/16 v0, 0x1f

    .line 1304
    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(B)V

    .line 1306
    invoke-direct {p0, p1}, Ll/᩵᩶ܿ;->ܽ([B)V

    .line 1308
    iget-object p1, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    invoke-virtual {p1, p2, p3}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 1309
    invoke-virtual {p1}, Ljava/io/DataOutputStream;->flush()V

    const-string p1, "Set time failed"

    const/4 p2, 0x5

    .line 1311
    invoke-direct {p0, p2, p1}, Ll/᩵᩶ܿ;->ۧ(ILjava/lang/String;)I

    return-void
.end method

.method public static ֫(Ll/᩵᩶ܿ;Ljava/lang/String;Ljava/lang/String;ZLjava/util/function/IntConsumer;)V
    .locals 2

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "Path"

    .line 1505
    invoke-static {p1, v0}, Ll/᩵᩶ܿ;->ܿ(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object p1

    .line 1404
    invoke-static {p2}, Ll/᩵᩶ܿ;->ۘ(Ljava/lang/String;)[B

    move-result-object p2

    const/16 v0, 0x22

    .line 1406
    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(B)V

    .line 1407
    invoke-direct {p0, p1}, Ll/᩵᩶ܿ;->ܽ([B)V

    .line 1408
    invoke-direct {p0, p2}, Ll/᩵᩶ܿ;->ܽ([B)V

    .line 1409
    iget-object p1, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    invoke-virtual {p1, p3}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    .line 1410
    invoke-virtual {p1}, Ljava/io/DataOutputStream;->flush()V

    const/4 p2, 0x0

    const/4 p3, 0x0

    :cond_0
    :goto_0
    const-string v0, "Copy failed"

    const/16 v1, 0x3c

    .line 1414
    invoke-direct {p0, v1, v0}, Ll/᩵᩶ܿ;->ۧ(ILjava/lang/String;)I

    move-result v0

    if-lez v0, :cond_2

    if-eqz p4, :cond_0

    const/16 v1, 0x76

    .line 1417
    :try_start_0
    invoke-interface {p4, v0}, Ljava/util/function/IntConsumer;->accept(I)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p4

    if-nez p3, :cond_1

    .line 1427
    :try_start_1
    invoke-direct {p0, v1}, Ll/᩵᩶ܿ;->֫(B)V

    .line 1428
    invoke-virtual {p1}, Ljava/io/DataOutputStream;->flush()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 1430
    invoke-virtual {p4, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 1434
    :cond_1
    :goto_1
    iget-object p1, p0, Ll/᩵᩶ܿ;->ۤ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1435
    invoke-direct {p0}, Ll/᩵᩶ܿ;->᩵()V

    .line 1436
    throw p4

    :catch_1
    if-nez p3, :cond_0

    .line 1420
    invoke-direct {p0, v1}, Ll/᩵᩶ܿ;->֫(B)V

    .line 1421
    invoke-virtual {p1}, Ljava/io/DataOutputStream;->flush()V

    const/4 p3, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static ֫(Ll/᩵᩶ܿ;[B)V
    .locals 1

    const-string v0, "Path"

    .line 26
    invoke-static {v0, p1}, Ll/ۙ᩶ܿ;->֫(Ljava/lang/String;[B)V

    const/16 v0, 0x1e

    .line 1258
    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(B)V

    .line 1260
    invoke-direct {p0, p1}, Ll/᩵᩶ܿ;->ܽ([B)V

    .line 1261
    iget-object p1, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    invoke-virtual {p1}, Ljava/io/DataOutputStream;->flush()V

    const-string p1, "Remove failed"

    const/16 v0, 0x3c

    .line 1263
    invoke-direct {p0, v0, p1}, Ll/᩵᩶ܿ;->ۧ(ILjava/lang/String;)I

    return-void
.end method

.method public static ֫(Ll/᩵᩶ܿ;[B[B)V
    .locals 1

    const-string v0, "Path"

    .line 26
    invoke-static {v0, p1}, Ll/ۙ᩶ܿ;->֫(Ljava/lang/String;[B)V

    invoke-static {v0, p2}, Ll/ۙ᩶ܿ;->֫(Ljava/lang/String;[B)V

    const/16 v0, 0x1d

    .line 1230
    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(B)V

    .line 1232
    invoke-direct {p0, p1}, Ll/᩵᩶ܿ;->ܽ([B)V

    .line 1233
    invoke-direct {p0, p2}, Ll/᩵᩶ܿ;->ܽ([B)V

    .line 1234
    iget-object p1, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    invoke-virtual {p1}, Ljava/io/DataOutputStream;->flush()V

    const-string p1, "Move failed"

    const/16 p2, 0x3c

    .line 1236
    invoke-direct {p0, p2, p1}, Ll/᩵᩶ܿ;->ۧ(ILjava/lang/String;)I

    return-void
.end method

.method public static ֫(Ll/᩵᩶ܿ;Ljava/lang/String;Ljava/util/ArrayList;)[Z
    .locals 6

    .line 1132
    iget-object v0, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    const-string v1, "Base path"

    invoke-static {p1, v1}, Ll/᩵᩶ܿ;->ܿ(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object p1

    .line 1133
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1134
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "Name"

    .line 1135
    invoke-static {v3, v4}, Ll/᩵᩶ܿ;->ܿ(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v3

    .line 40
    array-length v4, p1

    array-length v5, v3

    add-int/2addr v4, v5

    add-int/lit8 v4, v4, 0x1

    const/16 v5, 0x1001

    if-gt v4, v5, :cond_0

    .line 1137
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 41
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Combined path too long"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    const/16 v2, 0x24

    .line 1139
    invoke-direct {p0, v2}, Ll/᩵᩶ܿ;->֫(B)V

    .line 1141
    invoke-direct {p0, p1}, Ll/᩵᩶ܿ;->ܽ([B)V

    .line 1142
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 1143
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    .line 1144
    invoke-direct {p0, v1}, Ll/᩵᩶ܿ;->ܽ([B)V

    goto :goto_1

    .line 1146
    :cond_2
    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V

    const-string p1, "Check batch exists failed"

    const/4 v0, 0x5

    .line 1148
    invoke-direct {p0, v0, p1}, Ll/᩵᩶ܿ;->ۧ(ILjava/lang/String;)I

    .line 1150
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p2, p1, [Z

    const/4 v0, 0x0

    :goto_2
    if-ge v0, p1, :cond_4

    .line 610
    :try_start_0
    iget-object v1, p0, Ll/᩵᩶ܿ;->ۗ:Ljava/io/DataInputStream;

    invoke-virtual {v1}, Ljava/io/DataInputStream;->readByte()B

    move-result v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_3

    const/4 v1, 0x1

    goto :goto_3

    :cond_3
    const/4 v1, 0x0

    .line 1152
    :goto_3
    aput-boolean v1, p2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 612
    invoke-direct {p0, p1}, Ll/᩵᩶ܿ;->֫(Ljava/io/IOException;)V

    throw p1

    :cond_4
    return-object p2
.end method

.method public static ۘ(Ljava/lang/String;)[B
    .locals 1

    .line 1512
    invoke-static {p0}, Ll/᩹᩶ܿ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "Path"

    .line 1505
    invoke-static {p0, v0}, Ll/᩵᩶ܿ;->ܿ(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۜ(Ll/᩵᩶ܿ;Ljava/lang/String;)V
    .locals 1

    .line 1243
    invoke-static {p1}, Ll/᩵᩶ܿ;->ۘ(Ljava/lang/String;)[B

    move-result-object p1

    const/16 v0, 0x1e

    .line 1244
    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(B)V

    .line 1246
    invoke-direct {p0, p1}, Ll/᩵᩶ܿ;->ܽ([B)V

    .line 1247
    iget-object p1, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    invoke-virtual {p1}, Ljava/io/DataOutputStream;->flush()V

    const-string p1, "Remove failed"

    const/16 v0, 0x3c

    .line 1249
    invoke-direct {p0, v0, p1}, Ll/᩵᩶ܿ;->ۧ(ILjava/lang/String;)I

    return-void
.end method

.method public static ۢ(Ll/᩵᩶ܿ;Ljava/lang/String;)J
    .locals 1

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "Path"

    .line 1505
    invoke-static {p1, v0}, Ll/᩵᩶ܿ;->ܿ(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object p1

    const/16 v0, 0x26

    .line 1062
    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(B)V

    .line 1064
    invoke-direct {p0, p1}, Ll/᩵᩶ܿ;->ܽ([B)V

    .line 1065
    iget-object p1, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    invoke-virtual {p1}, Ljava/io/DataOutputStream;->flush()V

    const-string p1, "get file actual size failed"

    const/4 v0, 0x5

    .line 1067
    invoke-direct {p0, v0, p1}, Ll/᩵᩶ܿ;->ۧ(ILjava/lang/String;)I

    .line 1069
    invoke-direct {p0}, Ll/᩵᩶ܿ;->᩸()J

    move-result-wide p0

    return-wide p0
.end method

.method private ۧ(ILjava/lang/String;)I
    .locals 9

    if-eqz p1, :cond_8

    .line 1543
    sget-object v0, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ll/ܰ᩵ܿ;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0}, Ll/ܰ᩵ܿ;-><init>(ILjava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    mul-int/lit8 v1, p1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 1546
    :goto_0
    iget-object v4, p0, Ll/᩵᩶ܿ;->ۤ:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v5, 0x1

    if-ge v3, v1, :cond_7

    .line 1548
    :try_start_0
    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v7, 0x1f4

    invoke-interface {v0, v7, v8, v6}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Byte;

    invoke-virtual {v6}, Ljava/lang/Byte;->byteValue()B

    move-result v6

    const/4 v7, -0x1

    if-eq v6, v7, :cond_3

    if-eqz v6, :cond_2

    if-eq v6, v5, :cond_1

    const/4 v5, 0x2

    if-ne v6, v5, :cond_0

    goto :goto_1

    .line 1573
    :cond_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Unknown result code: "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {p0, v5}, Ll/᩵᩶ܿ;->ᩴ(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v5

    throw v5

    .line 1555
    :cond_1
    invoke-direct {p0}, Ll/᩵᩶ܿ;->ܶ()I

    move-result p1

    return p1

    :cond_2
    :goto_1
    return v2

    .line 1564
    :cond_3
    invoke-direct {p0}, Ll/᩵᩶ܿ;->᩶()Ljava/lang/String;

    move-result-object v5

    .line 1565
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_4

    move-object v5, p2

    .line 1570
    :cond_4
    new-instance v6, Ljava/io/IOException;

    invoke-direct {v6, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v6
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    .line 1581
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    .line 1582
    instance-of p2, p1, Ljava/io/IOException;

    if-nez p2, :cond_6

    .line 1585
    instance-of p2, p1, Ljava/lang/RuntimeException;

    if-eqz p2, :cond_5

    .line 1586
    check-cast p1, Ljava/lang/RuntimeException;

    throw p1

    .line 1588
    :cond_5
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    .line 1583
    :cond_6
    check-cast p1, Ljava/io/IOException;

    throw p1

    :catch_1
    move-exception p1

    .line 1577
    invoke-virtual {v4, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1578
    invoke-direct {p0}, Ll/᩵᩶ܿ;->᩵()V

    .line 1579
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1591
    :cond_7
    invoke-virtual {v4, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1592
    invoke-direct {p0}, Ll/᩵᩶ܿ;->᩵()V

    .line 1593
    invoke-interface {v0, v5}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 1594
    new-instance v0, Ll/᩵ۤۡ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ", timeout after "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " seconds"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 14
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1594
    throw v0

    .line 1541
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public static ۧ(Ll/᩵᩶ܿ;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 2

    .line 1505
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "Path"

    invoke-static {p1, v0}, Ll/᩵᩶ܿ;->ܿ(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object p1

    const/16 v0, 0x15

    .line 995
    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(B)V

    .line 997
    invoke-direct {p0, p1}, Ll/᩵᩶ܿ;->ܽ([B)V

    .line 998
    iget-object p1, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    .line 999
    invoke-virtual {p1}, Ljava/io/DataOutputStream;->flush()V

    const-string p1, "List dir failed"

    const/16 v0, 0x1e

    .line 1001
    invoke-direct {p0, v0, p1}, Ll/᩵᩶ܿ;->ۧ(ILjava/lang/String;)I

    .line 1003
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 1005
    :goto_0
    invoke-direct {p0}, Ll/᩵᩶ܿ;->᩹()I

    move-result v0

    const/16 v1, 0xfe

    if-ne v0, v1, :cond_0

    .line 1006
    invoke-direct {p0}, Ll/᩵᩶ܿ;->᩶()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/16 v1, 0xef

    if-ne v0, v1, :cond_1

    return-object p1

    .line 1010
    :cond_1
    invoke-virtual {p0}, Ll/᩵᩶ܿ;->close()V

    .line 1011
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Error"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic ۧ(Ll/᩵᩶ܿ;)V
    .locals 2

    const/16 v0, 0x27

    .line 1450
    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(B)V

    .line 1451
    iget-object v0, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V

    const-string v0, "Ping failed"

    const/4 v1, 0x5

    .line 1452
    invoke-direct {p0, v1, v0}, Ll/᩵᩶ܿ;->ۧ(ILjava/lang/String;)I

    return-void
.end method

.method public static synthetic ۧ(Ll/᩵᩶ܿ;I)V
    .locals 3

    .line 868
    iget-object v0, p0, Ll/᩵᩶ܿ;->᩶:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v1, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    const/16 v2, 0xf

    :try_start_0
    invoke-direct {p0, v2}, Ll/᩵᩶ܿ;->֫(B)V

    .line 869
    invoke-virtual {v1, p1}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 870
    invoke-virtual {v1}, Ljava/io/DataOutputStream;->flush()V

    const-string p1, "Close failed"

    const/16 v1, 0x8

    .line 871
    invoke-direct {p0, v1, p1}, Ll/᩵᩶ܿ;->ۧ(ILjava/lang/String;)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 879
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    return-void

    :catchall_0
    move-exception p0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 874
    :try_start_1
    iget-object v1, p0, Ll/᩵᩶ܿ;->ۤ:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 875
    invoke-direct {p0}, Ll/᩵᩶ܿ;->᩵()V

    .line 876
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 879
    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 880
    throw p0
.end method

.method public static synthetic ۧ(Ll/᩵᩶ܿ;III[B)V
    .locals 2

    .line 839
    iget-object v0, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    if-ltz p2, :cond_0

    if-ltz p3, :cond_0

    array-length v1, p4

    if-gt p3, v1, :cond_0

    array-length v1, p4

    sub-int/2addr v1, p3

    if-gt p2, v1, :cond_0

    const/16 v1, 0xd

    .line 842
    invoke-direct {p0, v1}, Ll/᩵᩶ܿ;->֫(B)V

    .line 843
    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 844
    invoke-virtual {v0, p2}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 845
    invoke-virtual {v0, p4, p3, p2}, Ljava/io/DataOutputStream;->write([BII)V

    .line 846
    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V

    const-string p1, "Write failed"

    const/16 p2, 0x8

    .line 847
    invoke-direct {p0, p2, p1}, Ll/᩵᩶ܿ;->ۧ(ILjava/lang/String;)I

    return-void

    .line 840
    :cond_0
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    throw p0
.end method

.method public static synthetic ۧ(Ll/᩵᩶ܿ;IJ)V
    .locals 1

    const/16 v0, 0x11

    .line 899
    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(B)V

    .line 900
    iget-object v0, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 901
    invoke-virtual {v0, p2, p3}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 902
    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V

    const-string p1, "Seek failed"

    const/4 p2, 0x5

    .line 903
    invoke-direct {p0, p2, p1}, Ll/᩵᩶ܿ;->ۧ(ILjava/lang/String;)I

    return-void
.end method

.method public static ۧ(Ll/᩵᩶ܿ;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "Path"

    .line 1505
    invoke-static {p1, v0}, Ll/᩵᩶ܿ;->ܿ(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object p1

    .line 1078
    invoke-static {p2}, Ll/᩵᩶ܿ;->ۘ(Ljava/lang/String;)[B

    move-result-object p2

    const/16 v0, 0x17

    .line 1079
    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(B)V

    .line 1081
    invoke-direct {p0, p1}, Ll/᩵᩶ܿ;->ܽ([B)V

    .line 1082
    invoke-direct {p0, p2}, Ll/᩵᩶ܿ;->ܽ([B)V

    .line 1083
    iget-object p1, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    invoke-virtual {p1}, Ljava/io/DataOutputStream;->flush()V

    const-string p1, "Symlink failed"

    const/4 p2, 0x5

    .line 1085
    invoke-direct {p0, p2, p1}, Ll/᩵᩶ܿ;->ۧ(ILjava/lang/String;)I

    return-void
.end method

.method public static synthetic ۧ(Ll/᩵᩶ܿ;Ljava/lang/String;Z)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1197
    invoke-static {p1}, Ll/᩵᩶ܿ;->ۘ(Ljava/lang/String;)[B

    move-result-object p1

    const/16 v0, 0x1c

    .line 1198
    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(B)V

    .line 1200
    invoke-direct {p0, p1}, Ll/᩵᩶ܿ;->ܽ([B)V

    .line 1201
    iget-object p1, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    invoke-virtual {p1, p2}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    .line 1202
    invoke-virtual {p1}, Ljava/io/DataOutputStream;->flush()V

    const-string p1, "Mkdir failed"

    const/4 p2, 0x5

    .line 1204
    invoke-direct {p0, p2, p1}, Ll/᩵᩶ܿ;->ۧ(ILjava/lang/String;)I

    return-void
.end method

.method public static synthetic ܳ(Ll/᩵᩶ܿ;Ljava/lang/String;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1273
    invoke-static {p1}, Ll/᩵᩶ܿ;->ۘ(Ljava/lang/String;)[B

    move-result-object p1

    const/16 v0, 0x28

    .line 1274
    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(B)V

    .line 1276
    invoke-direct {p0, p1}, Ll/᩵᩶ܿ;->ܽ([B)V

    .line 1277
    iget-object p1, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    invoke-virtual {p1}, Ljava/io/DataOutputStream;->flush()V

    const-string p1, "Unlink file or link failed"

    const/16 v0, 0x3c

    .line 1279
    invoke-direct {p0, v0, p1}, Ll/᩵᩶ܿ;->ۧ(ILjava/lang/String;)I

    return-void
.end method

.method private ܶ()I
    .locals 1

    .line 626
    :try_start_0
    iget-object v0, p0, Ll/᩵᩶ܿ;->ۗ:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    .line 628
    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(Ljava/io/IOException;)V

    throw v0
.end method

.method public static synthetic ܽ(Ll/᩵᩶ܿ;I)Ljava/lang/Long;
    .locals 2

    .line 1606
    :try_start_0
    invoke-static {p1}, Lbin/mt/plus/Features3;->receiveFdResponse(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    .line 1608
    invoke-direct {p0, p1}, Ll/᩵᩶ܿ;->֫(Ljava/io/IOException;)V

    throw p1
.end method

.method public static ܽ(Ll/᩵᩶ܿ;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "Path"

    .line 1505
    invoke-static {p1, v0}, Ll/᩵᩶ܿ;->ܿ(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object p1

    const/16 v0, 0x18

    .line 1093
    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(B)V

    .line 1095
    invoke-direct {p0, p1}, Ll/᩵᩶ܿ;->ܽ([B)V

    .line 1096
    iget-object p1, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    invoke-virtual {p1}, Ljava/io/DataOutputStream;->flush()V

    const-string p1, "realPath failed"

    const/4 v0, 0x5

    .line 1098
    invoke-direct {p0, v0, p1}, Ll/᩵᩶ܿ;->ۧ(ILjava/lang/String;)I

    .line 1100
    invoke-direct {p0}, Ll/᩵᩶ܿ;->᩶()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ܽ(Ll/᩵᩶ܿ;)V
    .locals 1

    const/16 v0, 0x23

    .line 1463
    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(B)V

    .line 1464
    iget-object v0, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V

    .line 1465
    iget-object p0, p0, Ll/᩵᩶ܿ;->ۤ:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public static synthetic ܽ(Ll/᩵᩶ܿ;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1212
    invoke-static {p1}, Ll/᩵᩶ܿ;->ۘ(Ljava/lang/String;)[B

    move-result-object p1

    .line 1213
    invoke-static {p2}, Ll/᩵᩶ܿ;->ۘ(Ljava/lang/String;)[B

    move-result-object p2

    const/16 v0, 0x1d

    .line 1214
    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(B)V

    .line 1216
    invoke-direct {p0, p1}, Ll/᩵᩶ܿ;->ܽ([B)V

    .line 1217
    invoke-direct {p0, p2}, Ll/᩵᩶ܿ;->ܽ([B)V

    .line 1218
    iget-object p1, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    invoke-virtual {p1}, Ljava/io/DataOutputStream;->flush()V

    const-string p1, "Move failed"

    const/16 p2, 0x3c

    .line 1220
    invoke-direct {p0, p2, p1}, Ll/᩵᩶ܿ;->ۧ(ILjava/lang/String;)I

    return-void
.end method

.method private ܽ([B)V
    .locals 2

    .line 1527
    array-length v0, p1

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 1528
    invoke-virtual {v1, p1}, Ljava/io/OutputStream;->write([B)V

    const/4 p1, 0x0

    .line 1529
    invoke-virtual {v1, p1}, Ljava/io/DataOutputStream;->write(I)V

    return-void
.end method

.method public static synthetic ܿ(Ll/᩵᩶ܿ;I)J
    .locals 1

    const/16 v0, 0x10

    .line 887
    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(B)V

    .line 888
    iget-object v0, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 889
    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V

    const-string p1, "Tell failed"

    const/4 v0, 0x5

    .line 890
    invoke-direct {p0, v0, p1}, Ll/᩵᩶ܿ;->ۧ(ILjava/lang/String;)I

    .line 891
    invoke-direct {p0}, Ll/᩵᩶ܿ;->᩸()J

    move-result-wide p0

    return-wide p0
.end method

.method public static ܿ(Ll/᩵᩶ܿ;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 3

    .line 1505
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "Path"

    invoke-static {p1, v0}, Ll/᩵᩶ܿ;->ܿ(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object p1

    const/16 v0, 0x2a

    .line 965
    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(B)V

    .line 967
    invoke-direct {p0, p1}, Ll/᩵᩶ܿ;->ܽ([B)V

    .line 968
    iget-object p1, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    .line 969
    invoke-virtual {p1}, Ljava/io/DataOutputStream;->flush()V

    const/16 p1, 0x1e

    const-string v0, "Checked list dir failed"

    .line 971
    invoke-direct {p0, p1, v0}, Ll/᩵᩶ܿ;->ۧ(ILjava/lang/String;)I

    .line 972
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 974
    :goto_0
    invoke-direct {p0}, Ll/᩵᩶ܿ;->᩹()I

    move-result v1

    const/16 v2, 0xfe

    if-ne v1, v2, :cond_0

    .line 975
    invoke-direct {p0}, Ll/᩵᩶ܿ;->֡()Ll/ܿ᩹ܿ;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/16 v2, 0xff

    if-ne v1, v2, :cond_2

    .line 978
    invoke-direct {p0}, Ll/᩵᩶ܿ;->᩶()Ljava/lang/String;

    move-result-object p0

    .line 979
    new-instance p1, Ljava/io/IOException;

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move-object v0, p0

    .line 980
    :goto_1
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    const/16 v0, 0xef

    if-ne v1, v0, :cond_3

    return-object p1

    :cond_3
    const-string p1, "Invalid checked directory stream marker: "

    .line 0
    invoke-static {v1, p1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 983
    invoke-direct {p0, p1}, Ll/᩵᩶ܿ;->ᩴ(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object p0

    throw p0
.end method

.method public static ܿ(Ljava/lang/String;Ljava/lang/String;)[B
    .locals 1

    .line 1516
    invoke-static {}, Ll/᩹᩶ܿ;->ܽ()Ljava/nio/charset/Charset;

    move-result-object v0

    .line 17
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    .line 18
    invoke-static {p1, p0}, Ll/ۙ᩶ܿ;->֫(Ljava/lang/String;[B)V

    return-object p0
.end method

.method public static ᩳ(Ll/᩵᩶ܿ;Ljava/lang/String;)Ll/ܿ᩹ܿ;
    .locals 1

    const-string v0, "Path"

    .line 1505
    invoke-static {p1, v0}, Ll/᩵᩶ܿ;->ܿ(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object p1

    const/16 v0, 0x16

    .line 1047
    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(B)V

    .line 1049
    invoke-direct {p0, p1}, Ll/᩵᩶ܿ;->ܽ([B)V

    .line 1050
    iget-object p1, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    invoke-virtual {p1}, Ljava/io/DataOutputStream;->flush()V

    const-string p1, "Read file info failed"

    const/4 v0, 0x5

    .line 1052
    invoke-direct {p0, v0, p1}, Ll/᩵᩶ܿ;->ۧ(ILjava/lang/String;)I

    .line 1054
    invoke-direct {p0}, Ll/᩵᩶ܿ;->֡()Ll/ܿ᩹ܿ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ᩳ(Ll/᩵᩶ܿ;I)V
    .locals 1

    const/16 v0, 0xe

    .line 854
    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(B)V

    .line 855
    iget-object v0, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 856
    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V

    const-string p1, "Sync failed"

    const/16 v0, 0x8

    .line 857
    invoke-direct {p0, v0, p1}, Ll/᩵᩶ܿ;->ۧ(ILjava/lang/String;)I

    return-void
.end method

.method private ᩴ(Ljava/lang/String;)Ljava/io/IOException;
    .locals 2

    .line 462
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 463
    invoke-virtual {p0}, Ll/᩵᩶ܿ;->ܽ()V

    .line 464
    iget-object p1, p0, Ll/᩵᩶ܿ;->ۤ:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 465
    invoke-direct {p0}, Ll/᩵᩶ܿ;->᩵()V

    return-object v0
.end method

.method private ᩵()V
    .locals 3

    const/4 v0, 0x1

    .line 470
    iget-object v1, p0, Ll/᩵᩶ܿ;->᩺:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 474
    :cond_0
    iget-object v0, p0, Ll/᩵᩶ܿ;->ۤ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 475
    iget-object v0, p0, Ll/᩵᩶ܿ;->ۨ:Ll/ۙ᩸ܿ;

    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-void
.end method

.method private ᩶()Ljava/lang/String;
    .locals 2

    .line 1487
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 1489
    :goto_0
    invoke-direct {p0}, Ll/᩵᩶ܿ;->᩹()I

    move-result v1

    if-lez v1, :cond_0

    .line 1490
    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    goto :goto_0

    :cond_0
    const-string v1, "UTF-8"

    .line 1492
    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static ᩷(Ll/᩵᩶ܿ;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 2

    .line 1505
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "Path"

    invoke-static {p1, v0}, Ll/᩵᩶ܿ;->ܿ(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object p1

    const/16 v0, 0x25

    .line 1022
    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(B)V

    .line 1024
    invoke-direct {p0, p1}, Ll/᩵᩶ܿ;->ܽ([B)V

    .line 1025
    iget-object p1, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    invoke-virtual {p1}, Ljava/io/DataOutputStream;->flush()V

    const-string p1, "List dir failed"

    const/16 v0, 0x1e

    .line 1027
    invoke-direct {p0, v0, p1}, Ll/᩵᩶ܿ;->ۧ(ILjava/lang/String;)I

    .line 1029
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 1031
    :goto_0
    invoke-direct {p0}, Ll/᩵᩶ܿ;->᩹()I

    move-result v0

    const/16 v1, 0xfe

    if-ne v0, v1, :cond_1

    .line 1496
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 1498
    :goto_1
    invoke-direct {p0}, Ll/᩵᩶ܿ;->᩹()I

    move-result v1

    if-lez v1, :cond_0

    .line 1499
    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    goto :goto_1

    .line 1501
    :cond_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 1032
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const/16 v1, 0xef

    if-ne v0, v1, :cond_2

    return-object p1

    .line 1036
    :cond_2
    invoke-virtual {p0}, Ll/᩵᩶ܿ;->close()V

    .line 1037
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Error"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private ᩸()J
    .locals 2

    .line 634
    :try_start_0
    iget-object v0, p0, Ll/᩵᩶ܿ;->ۗ:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readLong()J

    move-result-wide v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    move-exception v0

    .line 636
    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(Ljava/io/IOException;)V

    throw v0
.end method

.method private ᩹()I
    .locals 2

    .line 598
    :try_start_0
    iget-object v0, p0, Ll/᩵᩶ܿ;->ۗ:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-ltz v0, :cond_0

    return v0

    .line 603
    :cond_0
    new-instance v0, Ljava/io/EOFException;

    const-string v1, "Connection closed"

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(Ljava/io/IOException;)V

    throw v0

    :catch_0
    move-exception v0

    .line 600
    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(Ljava/io/IOException;)V

    throw v0
.end method

.method public static ᩻(Ll/᩵᩶ܿ;Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 1

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "Path"

    .line 1505
    invoke-static {p1, v0}, Ll/᩵᩶ܿ;->ܿ(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object p1

    const/16 v0, 0x19

    .line 1109
    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(B)V

    .line 1111
    invoke-direct {p0, p1}, Ll/᩵᩶ܿ;->ܽ([B)V

    .line 1112
    iget-object p1, p0, Ll/᩵᩶ܿ;->ۛ:Ljava/io/DataOutputStream;

    invoke-virtual {p1}, Ljava/io/DataOutputStream;->flush()V

    const-string p1, "Check exists failed"

    const/4 v0, 0x5

    .line 1114
    invoke-direct {p0, v0, p1}, Ll/᩵᩶ܿ;->ۧ(ILjava/lang/String;)I

    .line 610
    :try_start_0
    iget-object p1, p0, Ll/᩵᩶ܿ;->ۗ:Ljava/io/DataInputStream;

    invoke-virtual {p1}, Ljava/io/DataInputStream;->readByte()B

    move-result p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    .line 1116
    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :catch_0
    move-exception p1

    .line 612
    invoke-direct {p0, p1}, Ll/᩵᩶ܿ;->֫(Ljava/io/IOException;)V

    throw p1
.end method


# virtual methods
.method public final close()V
    .locals 2

    const/4 v0, 0x1

    .line 1659
    iput-boolean v0, p0, Ll/᩵᩶ܿ;->᩹:Z

    .line 1660
    iget-object v0, p0, Ll/᩵᩶ܿ;->᩺:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 1664
    :cond_0
    :try_start_0
    iget-object v0, p0, Ll/᩵᩶ܿ;->ۤ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1461
    new-instance v0, Ll/᩷᩹ܿ;

    invoke-direct {v0, p0}, Ll/᩷᩹ܿ;-><init>(Ll/᩵᩶ܿ;)V

    const/4 v1, 0x0

    .line 1692
    invoke-direct {p0, v0, v1}, Ll/᩵᩶ܿ;->֫(Ll/ܳ᩹ܿ;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1668
    :cond_1
    invoke-direct {p0}, Ll/᩵᩶ܿ;->᩵()V

    return-void

    :catchall_0
    move-exception v0

    invoke-direct {p0}, Ll/᩵᩶ܿ;->᩵()V

    .line 1669
    throw v0
.end method

.method public final ֫(Ljava/lang/String;Z)Ljava/util/List;
    .locals 1

    .line 931
    new-instance v0, Ll/ۚ᩹ܿ;

    invoke-direct {v0, p0, p1, p2}, Ll/ۚ᩹ܿ;-><init>(Ll/᩵᩶ܿ;Ljava/lang/String;Z)V

    const/4 p1, 0x1

    .line 1785
    invoke-direct {p0, v0, p1}, Ll/᩵᩶ܿ;->֫(Ll/ۜ᩹ܿ;Z)Ljava/lang/Object;

    move-result-object p1

    .line 931
    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public final ֫()V
    .locals 2

    const/4 v0, 0x1

    .line 1673
    iput-boolean v0, p0, Ll/᩵᩶ܿ;->᩹:Z

    .line 1674
    invoke-virtual {p0}, Ll/᩵᩶ܿ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1675
    sget-object v0, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ll/᩵᩹ܿ;

    invoke-direct {v1, p0}, Ll/᩵᩹ܿ;-><init>(Ll/᩵᩶ܿ;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void

    .line 1686
    :cond_0
    invoke-static {p0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 1687
    iget-object v0, p0, Ll/᩵᩶ܿ;->ۤ:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public final ֫(I)V
    .locals 1

    .line 865
    new-instance v0, Ll/֫᩶ܿ;

    invoke-direct {v0, p0, p1}, Ll/֫᩶ܿ;-><init>(Ll/᩵᩶ܿ;I)V

    const/4 p1, 0x0

    .line 1692
    invoke-direct {p0, v0, p1}, Ll/᩵᩶ܿ;->֫(Ll/ܳ᩹ܿ;Z)V

    return-void
.end method

.method public final ֫(IJ)V
    .locals 1

    .line 896
    new-instance v0, Ll/ܰ᩹ܿ;

    invoke-direct {v0, p0, p1, p2, p3}, Ll/ܰ᩹ܿ;-><init>(Ll/᩵᩶ܿ;IJ)V

    const/4 p1, 0x0

    .line 1692
    invoke-direct {p0, v0, p1}, Ll/᩵᩶ܿ;->֫(Ll/ܳ᩹ܿ;Z)V

    return-void
.end method

.method public final ֫(JLjava/lang/String;)V
    .locals 1

    .line 1300
    new-instance v0, Ll/ۜ᩶ܿ;

    invoke-direct {v0, p0, p3, p1, p2}, Ll/ۜ᩶ܿ;-><init>(Ll/᩵᩶ܿ;Ljava/lang/String;J)V

    const/4 p1, 0x0

    .line 1692
    invoke-direct {p0, v0, p1}, Ll/᩵᩶ܿ;->֫(Ll/ܳ᩹ܿ;Z)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;IIZZ)V
    .locals 8

    .line 1176
    new-instance v7, Ll/ۖ᩹ܿ;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v0 .. v6}, Ll/ۖ᩹ܿ;-><init>(Ll/᩵᩶ܿ;Ljava/lang/String;IIZZ)V

    const/4 p1, 0x0

    .line 1692
    invoke-direct {p0, v7, p1}, Ll/᩵᩶ܿ;->֫(Ll/ܳ᩹ܿ;Z)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;IZZ)V
    .locals 7

    .line 1159
    new-instance v6, Ll/ۨ᩹ܿ;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Ll/ۨ᩹ܿ;-><init>(Ll/᩵᩶ܿ;Ljava/lang/String;IZZ)V

    const/4 p1, 0x0

    .line 1692
    invoke-direct {p0, v6, p1}, Ll/᩵᩶ܿ;->֫(Ll/ܳ᩹ܿ;Z)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1074
    new-instance v0, Ll/ᩳ᩶ܿ;

    invoke-direct {v0, p0, p1, p2}, Ll/ᩳ᩶ܿ;-><init>(Ll/᩵᩶ܿ;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 1692
    invoke-direct {p0, v0, p1}, Ll/᩵᩶ܿ;->֫(Ll/ܳ᩹ܿ;Z)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;ZLjava/util/function/IntConsumer;)V
    .locals 7

    .line 1400
    new-instance v6, Ll/ۢ᩹ܿ;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Ll/ۢ᩹ܿ;-><init>(Ll/᩵᩶ܿ;Ljava/lang/String;Ljava/lang/String;ZLjava/util/function/IntConsumer;)V

    const/4 p1, 0x0

    .line 1692
    invoke-direct {p0, v6, p1}, Ll/᩵᩶ܿ;->֫(Ll/ܳ᩹ܿ;Z)V

    return-void
.end method

.method public final varargs ֫(Ljava/lang/String;[Ll/ۗ᩸ܿ;)V
    .locals 5

    .line 1354
    array-length v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    aget-object v4, p2, v2

    .line 1355
    iget v4, v4, Ll/ۗ᩸ܿ;->᩶:I

    or-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1361
    :cond_0
    new-instance p2, Ll/ܶ᩹ܿ;

    invoke-direct {p2, p0, p1, v3}, Ll/ܶ᩹ܿ;-><init>(Ll/᩵᩶ܿ;Ljava/lang/String;I)V

    .line 1692
    invoke-direct {p0, p2, v1}, Ll/᩵᩶ܿ;->֫(Ll/ܳ᩹ܿ;Z)V

    return-void
.end method

.method public final ֫([B[B)V
    .locals 1

    .line 1225
    new-instance v0, Ll/ۢ᩶ܿ;

    invoke-direct {v0, p0, p1, p2}, Ll/ۢ᩶ܿ;-><init>(Ll/᩵᩶ܿ;[B[B)V

    const/4 p1, 0x0

    .line 1692
    invoke-direct {p0, v0, p1}, Ll/᩵᩶ܿ;->֫(Ll/ܳ᩹ܿ;Z)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)Z
    .locals 1

    .line 1106
    new-instance v0, Ll/᩷᩶ܿ;

    invoke-direct {v0, p0, p1}, Ll/᩷᩶ܿ;-><init>(Ll/᩵᩶ܿ;Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 1785
    invoke-direct {p0, v0, p1}, Ll/᩵᩶ܿ;->֫(Ll/ۜ᩹ܿ;Z)Ljava/lang/Object;

    move-result-object p1

    .line 1106
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final ֫(Ljava/lang/String;Ljava/util/ArrayList;)[Z
    .locals 2

    .line 1121
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    const v1, 0xffff

    if-gt v0, v1, :cond_1

    const-string v0, "/"

    .line 1124
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1125
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1129
    :cond_0
    new-instance v0, Ll/ᩴ᩹ܿ;

    invoke-direct {v0, p0, p1, p2}, Ll/ᩴ᩹ܿ;-><init>(Ll/᩵᩶ܿ;Ljava/lang/String;Ljava/util/ArrayList;)V

    const/4 p1, 0x1

    .line 1785
    invoke-direct {p0, v0, p1}, Ll/᩵᩶ܿ;->֫(Ll/ۜ᩹ܿ;Z)Ljava/lang/Object;

    move-result-object p1

    .line 1129
    check-cast p1, [Z

    return-object p1

    .line 1122
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Too many names"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۖ(Ljava/lang/String;)V
    .locals 1

    .line 1269
    new-instance v0, Ll/᩻᩶ܿ;

    invoke-direct {v0, p0, p1}, Ll/᩻᩶ܿ;-><init>(Ll/᩵᩶ܿ;Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 1692
    invoke-direct {p0, v0, p1}, Ll/᩵᩶ܿ;->֫(Ll/ܳ᩹ܿ;Z)V

    return-void
.end method

.method public final ۖ()Z
    .locals 2

    .line 1642
    iget v0, p0, Ll/᩵᩶ܿ;->ܰ:I

    const/16 v1, 0x7d0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۘ()V
    .locals 2

    .line 1448
    :try_start_0
    new-instance v0, Ll/ۡ᩹ܿ;

    invoke-direct {v0, p0}, Ll/ۡ᩹ܿ;-><init>(Ll/᩵᩶ܿ;)V

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Ll/᩵᩶ܿ;->֫(Ll/ܳ᩹ܿ;Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 1455
    invoke-direct {p0}, Ll/᩵᩶ܿ;->᩵()V

    .line 1456
    throw v0
.end method

.method public final ۜ(Ljava/lang/String;)Ll/ܿ᩹ܿ;
    .locals 1

    .line 1044
    new-instance v0, Ll/ܺ᩹ܿ;

    invoke-direct {v0, p0, p1}, Ll/ܺ᩹ܿ;-><init>(Ll/᩵᩶ܿ;Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-direct {p0, v0, p1}, Ll/᩵᩶ܿ;->֫(Ll/ۜ᩹ܿ;Z)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܿ᩹ܿ;

    return-object p1
.end method

.method public final ۜ()Z
    .locals 1

    .line 1638
    iget v0, p0, Ll/᩵᩶ܿ;->ܰ:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۡ(Ljava/lang/String;)V
    .locals 1

    .line 1241
    new-instance v0, Ll/ۡ᩶ܿ;

    invoke-direct {v0, p0, p1}, Ll/ۡ᩶ܿ;-><init>(Ll/᩵᩶ܿ;Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 1692
    invoke-direct {p0, v0, p1}, Ll/᩵᩶ܿ;->֫(Ll/ܳ᩹ܿ;Z)V

    return-void
.end method

.method public final ۢ(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1090
    new-instance v0, Ll/ۖ᩶ܿ;

    invoke-direct {v0, p0, p1}, Ll/ۖ᩶ܿ;-><init>(Ll/᩵᩶ܿ;Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 1785
    invoke-direct {p0, v0, p1}, Ll/᩵᩶ܿ;->֫(Ll/ۜ᩹ܿ;Z)Ljava/lang/Object;

    move-result-object p1

    .line 1090
    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final ۧ(I)J
    .locals 2

    .line 908
    new-instance v0, Ll/ۤ᩹ܿ;

    invoke-direct {v0, p0, p1}, Ll/ۤ᩹ܿ;-><init>(Ll/᩵᩶ܿ;I)V

    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(Ll/᩻᩹ܿ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۧ(Ljava/lang/String;)J
    .locals 2

    .line 1059
    new-instance v0, Ll/᩶᩹ܿ;

    invoke-direct {v0, p0, p1}, Ll/᩶᩹ܿ;-><init>(Ll/᩵᩶ܿ;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(Ll/᩻᩹ܿ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۧ(Ljava/lang/String;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    .locals 10

    .line 705
    iget-object v0, p0, Ll/᩵᩶ܿ;->ۨ:Ll/ۙ᩸ܿ;

    invoke-interface {v0}, Ll/ۙ᩸ܿ;->۠()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/16 v1, 0x2f

    .line 711
    invoke-virtual {p1, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    const/4 v2, 0x1

    add-int/2addr v1, v2

    const/4 v3, 0x0

    invoke-virtual {p1, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    .line 712
    invoke-static {}, Ll/᩹᩶ܿ;->ۧ()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 718
    :cond_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1e

    if-lt v1, v3, :cond_3

    const-string v1, "/storage/emulated/999/Android/"

    .line 720
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    const-string v4, "obb/"

    const-string v5, "data/"

    if-eqz v1, :cond_2

    .line 721
    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 722
    invoke-virtual {v1, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    const-string v1, "/mnt/user/999/self/primary/Android/"

    .line 726
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x23

    .line 727
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 728
    invoke-virtual {v1, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_0

    .line 733
    :cond_3
    invoke-interface {v0}, Ll/ۙ᩸ܿ;->ᩴ֫()I

    move-result v8

    if-gez v8, :cond_5

    :cond_4
    :goto_0
    const/4 p1, 0x0

    return-object p1

    .line 738
    :cond_5
    new-instance v0, Ll/ۙ᩹ܿ;

    move-object v4, v0

    move-object v5, p0

    move-object v6, p1

    move-object v7, p2

    invoke-direct/range {v4 .. v9}, Ll/ۙ᩹ܿ;-><init>(Ll/᩵᩶ܿ;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 1785
    invoke-direct {p0, v0, v2}, Ll/᩵᩶ܿ;->֫(Ll/ۜ᩹ܿ;Z)Ljava/lang/Object;

    move-result-object p1

    .line 738
    check-cast p1, Landroid/os/ParcelFileDescriptor;

    return-object p1
.end method

.method public final ۧ(IJ)V
    .locals 1

    .line 919
    new-instance v0, Ll/ۛ᩹ܿ;

    invoke-direct {v0, p0, p1, p2, p3}, Ll/ۛ᩹ܿ;-><init>(Ll/᩵᩶ܿ;IJ)V

    const/4 p1, 0x0

    .line 1692
    invoke-direct {p0, v0, p1}, Ll/᩵᩶ܿ;->֫(Ll/ܳ᩹ܿ;Z)V

    return-void
.end method

.method public final ۧ(I[BII)V
    .locals 7

    .line 836
    new-instance v6, Ll/᩺᩹ܿ;

    move-object v0, v6

    move-object v1, p0

    move v2, p1

    move v3, p4

    move v4, p3

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Ll/᩺᩹ܿ;-><init>(Ll/᩵᩶ܿ;III[B)V

    const/4 p1, 0x0

    .line 1692
    invoke-direct {p0, v6, p1}, Ll/᩵᩶ܿ;->֫(Ll/ܳ᩹ܿ;Z)V

    return-void
.end method

.method public final ۧ(Ljava/lang/String;Z)V
    .locals 1

    .line 1194
    new-instance v0, Ll/֡᩹ܿ;

    invoke-direct {v0, p0, p1, p2}, Ll/֡᩹ܿ;-><init>(Ll/᩵᩶ܿ;Ljava/lang/String;Z)V

    const/4 p1, 0x0

    .line 1692
    invoke-direct {p0, v0, p1}, Ll/᩵᩶ܿ;->֫(Ll/ܳ᩹ܿ;Z)V

    return-void
.end method

.method public final ۧ([B)V
    .locals 1

    .line 1254
    new-instance v0, Ll/۠᩹ܿ;

    invoke-direct {v0, p0, p1}, Ll/۠᩹ܿ;-><init>(Ll/᩵᩶ܿ;[B)V

    const/4 p1, 0x0

    .line 1692
    invoke-direct {p0, v0, p1}, Ll/᩵᩶ܿ;->֫(Ll/ܳ᩹ܿ;Z)V

    return-void
.end method

.method public final ܳ(Ljava/lang/String;)Ljava/util/List;
    .locals 1

    .line 1018
    new-instance v0, Ll/ۘ᩹ܿ;

    invoke-direct {v0, p0, p1}, Ll/ۘ᩹ܿ;-><init>(Ll/᩵᩶ܿ;Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 1785
    invoke-direct {p0, v0, p1}, Ll/᩵᩶ܿ;->֫(Ll/ۜ᩹ܿ;Z)Ljava/lang/Object;

    move-result-object p1

    .line 1018
    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public final ܳ()Z
    .locals 1

    .line 700
    iget-object v0, p0, Ll/᩵᩶ܿ;->۫:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->isLocked()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/᩵᩶ܿ;->᩶:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ܺ(Ljava/lang/String;)V
    .locals 1

    .line 1285
    new-instance v0, Ll/۟᩹ܿ;

    invoke-direct {v0, p0, p1}, Ll/۟᩹ܿ;-><init>(Ll/᩵᩶ܿ;Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 1692
    invoke-direct {p0, v0, p1}, Ll/᩵᩶ܿ;->֫(Ll/ܳ᩹ܿ;Z)V

    return-void
.end method

.method public final ܽ(Ljava/lang/String;Z)Ljava/io/OutputStream;
    .locals 3

    .line 670
    invoke-static {p1}, Ll/᩹᩶ܿ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "w"

    const-string v1, "a"

    if-eqz p2, :cond_0

    move-object v2, v1

    goto :goto_0

    :cond_0
    move-object v2, v0

    .line 671
    :goto_0
    invoke-virtual {p0, p1, v2}, Ll/᩵᩶ܿ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 673
    new-instance p1, Landroid/os/ParcelFileDescriptor$AutoCloseOutputStream;

    invoke-direct {p1, v2}, Landroid/os/ParcelFileDescriptor$AutoCloseOutputStream;-><init>(Landroid/os/ParcelFileDescriptor;)V

    return-object p1

    :cond_1
    if-eqz p2, :cond_2

    move-object v0, v1

    .line 791
    :cond_2
    new-instance p2, Ll/᩸᩹ܿ;

    invoke-direct {p2, p0, p1, v0}, Ll/᩸᩹ܿ;-><init>(Ll/᩵᩶ܿ;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 1785
    invoke-direct {p0, p2, p1}, Ll/᩵᩶ܿ;->֫(Ll/ۜ᩹ܿ;Z)Ljava/lang/Object;

    move-result-object p1

    .line 791
    check-cast p1, Ll/ۚ᩶ܿ;

    .line 676
    new-instance p2, Ljava/io/BufferedOutputStream;

    new-instance v0, Ll/۠᩶ܿ;

    invoke-direct {v0, p1}, Ll/۠᩶ܿ;-><init>(Ll/ۚ᩶ܿ;)V

    iget p1, p0, Ll/᩵᩶ܿ;->᩸:I

    invoke-direct {p2, v0, p1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V

    return-object p2
.end method

.method public final ܽ()V
    .locals 3

    .line 448
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-string v0, "[%08x]"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    return-void
.end method

.method public final ܽ(I)V
    .locals 1

    .line 852
    new-instance v0, Ll/ۧ᩶ܿ;

    invoke-direct {v0, p0, p1}, Ll/ۧ᩶ܿ;-><init>(Ll/᩵᩶ܿ;I)V

    const/4 p1, 0x0

    .line 1692
    invoke-direct {p0, v0, p1}, Ll/᩵᩶ܿ;->֫(Ll/ܳ᩹ܿ;Z)V

    return-void
.end method

.method public final ܽ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1209
    new-instance v0, Ll/ܺ᩶ܿ;

    invoke-direct {v0, p0, p1, p2}, Ll/ܺ᩶ܿ;-><init>(Ll/᩵᩶ܿ;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 1692
    invoke-direct {p0, v0, p1}, Ll/᩵᩶ܿ;->֫(Ll/ܳ᩹ܿ;Z)V

    return-void
.end method

.method public final ܿ(Ljava/lang/String;)Ljava/util/List;
    .locals 1

    .line 991
    new-instance v0, Ll/ܳ᩶ܿ;

    invoke-direct {v0, p0, p1}, Ll/ܳ᩶ܿ;-><init>(Ll/᩵᩶ܿ;Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 1785
    invoke-direct {p0, v0, p1}, Ll/᩵᩶ܿ;->֫(Ll/ۜ᩹ܿ;Z)Ljava/lang/Object;

    move-result-object p1

    .line 991
    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public final ᩳ()I
    .locals 1

    .line 1650
    iget v0, p0, Ll/᩵᩶ܿ;->ܰ:I

    return v0
.end method

.method public final ᩳ(I)J
    .locals 2

    .line 885
    new-instance v0, Ll/ܿ᩶ܿ;

    invoke-direct {v0, p0, p1}, Ll/ܿ᩶ܿ;-><init>(Ll/᩵᩶ܿ;I)V

    invoke-direct {p0, v0}, Ll/᩵᩶ܿ;->֫(Ll/᩻᩹ܿ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ᩳ(Ljava/lang/String;)Ljava/util/List;
    .locals 1

    .line 960
    new-instance v0, Ll/ۗ᩹ܿ;

    invoke-direct {v0, p0, p1}, Ll/ۗ᩹ܿ;-><init>(Ll/᩵᩶ܿ;Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 1785
    invoke-direct {p0, v0, p1}, Ll/᩵᩶ܿ;->֫(Ll/ۜ᩹ܿ;Z)Ljava/lang/Object;

    move-result-object p1

    .line 960
    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public final ᩳ(Ljava/lang/String;Ljava/lang/String;)Ll/ۖۖܽ;
    .locals 3

    .line 680
    invoke-static {p2}, Ll/᩹᩶ܿ;->֫(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 681
    invoke-static {p1}, Ll/᩹᩶ܿ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 683
    :cond_0
    invoke-virtual {p0, p1, p2}, Ll/᩵᩶ܿ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 685
    new-instance v1, Ll/᩸᩶ܿ;

    iget-boolean v2, p0, Ll/᩵᩶ܿ;->ۙ:Z

    invoke-direct {v1, v0, p1, p2, v2}, Ll/᩸᩶ܿ;-><init>(Landroid/os/ParcelFileDescriptor;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v1

    .line 791
    :cond_1
    new-instance v0, Ll/᩸᩹ܿ;

    invoke-direct {v0, p0, p1, p2}, Ll/᩸᩹ܿ;-><init>(Ll/᩵᩶ܿ;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x1

    .line 1785
    invoke-direct {p0, v0, v1}, Ll/᩵᩶ܿ;->֫(Ll/ۜ᩹ܿ;Z)Ljava/lang/Object;

    move-result-object v0

    .line 791
    check-cast v0, Ll/ۚ᩶ܿ;

    .line 688
    new-instance v1, Ll/ܶ᩶ܿ;

    invoke-direct {v1, v0, p1, p2}, Ll/ܶ᩶ܿ;-><init>(Ll/ۚ᩶ܿ;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public final ᩴ()V
    .locals 2

    const-wide/16 v0, 0x0

    .line 442
    iput-wide v0, p0, Ll/᩵᩶ܿ;->۬:J

    return-void
.end method

.method public final ᩻(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 2

    const-string v0, "r"

    .line 657
    invoke-virtual {p0, p1, v0}, Ll/᩵᩶ܿ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 659
    new-instance p1, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;

    invoke-direct {p1, v1}, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;-><init>(Landroid/os/ParcelFileDescriptor;)V

    return-object p1

    .line 791
    :cond_0
    new-instance v1, Ll/᩸᩹ܿ;

    invoke-direct {v1, p0, p1, v0}, Ll/᩸᩹ܿ;-><init>(Ll/᩵᩶ܿ;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 1785
    invoke-direct {p0, v1, p1}, Ll/᩵᩶ܿ;->֫(Ll/ۜ᩹ܿ;Z)Ljava/lang/Object;

    move-result-object p1

    .line 791
    check-cast p1, Ll/ۚ᩶ܿ;

    .line 662
    new-instance v0, Ljava/io/BufferedInputStream;

    new-instance v1, Ll/֨᩶ܿ;

    invoke-direct {v1, p1}, Ll/֨᩶ܿ;-><init>(Ll/ۚ᩶ܿ;)V

    iget p1, p0, Ll/᩵᩶ܿ;->᩸:I

    invoke-direct {v0, v1, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    return-object v0
.end method

.method public final ᩻()Z
    .locals 2

    .line 1646
    iget v0, p0, Ll/᩵᩶ܿ;->ܰ:I

    if-eqz v0, :cond_1

    const/16 v1, 0x7d0

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
