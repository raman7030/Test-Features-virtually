.class public final Ll/ܿ֡ܳ;
.super Ljava/lang/Object;
.source "473S"


# static fields
.field public static final ֫:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "MIUI BACKUP\n"

    .line 64
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    sput-object v0, Ll/ܿ֡ܳ;->֫:[B

    return-void
.end method

.method public static bridge synthetic ֫(JJ)J
    .locals 0

    .line 0
    invoke-static {p0, p1, p2, p3}, Ll/ܿ֡ܳ;->ۧ(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static ֫(Lnet/sf/sevenzipjbinding/SevenZipException;)Ljava/io/IOException;
    .locals 3

    .line 825
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 826
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 827
    invoke-virtual {v0, p0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 828
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_6

    .line 829
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Throwable;

    .line 830
    invoke-virtual {v1, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 833
    :cond_1
    instance-of v2, p0, Ljava/io/IOException;

    if-eqz v2, :cond_2

    instance-of v2, p0, Lnet/sf/sevenzipjbinding/SevenZipException;

    if-nez v2, :cond_2

    .line 834
    check-cast p0, Ljava/io/IOException;

    return-object p0

    .line 836
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 837
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 839
    :cond_3
    instance-of v2, p0, Lnet/sf/sevenzipjbinding/SevenZipException;

    if-eqz v2, :cond_0

    check-cast p0, Lnet/sf/sevenzipjbinding/SevenZipException;

    .line 841
    invoke-virtual {p0}, Lnet/sf/sevenzipjbinding/SevenZipException;->getCauseLastThrown()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 842
    invoke-virtual {p0}, Lnet/sf/sevenzipjbinding/SevenZipException;->getCauseLastThrown()Ljava/lang/Throwable;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 844
    :cond_4
    invoke-virtual {p0}, Lnet/sf/sevenzipjbinding/SevenZipException;->getCauseFirstPotentialThrown()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_5

    .line 845
    invoke-virtual {p0}, Lnet/sf/sevenzipjbinding/SevenZipException;->getCauseFirstPotentialThrown()Ljava/lang/Throwable;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 847
    :cond_5
    invoke-virtual {p0}, Lnet/sf/sevenzipjbinding/SevenZipException;->getCauseLastPotentialThrown()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 848
    invoke-virtual {p0}, Lnet/sf/sevenzipjbinding/SevenZipException;->getCauseLastPotentialThrown()Ljava/lang/Throwable;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_6
    const/4 p0, 0x0

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ܰܺܳ;)Ljava/util/LinkedHashMap;
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ܿ֡ܳ;->ᩳ(Ll/ܰܺܳ;)Ljava/util/LinkedHashMap;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ܰܺܳ;Ll/֨ۚܳ;)Ll/ۛ᩵ܳ;
    .locals 2

    const/4 v0, 0x0

    .line 127
    :try_start_0
    instance-of v1, p0, Ll/᩵ۙ᩻;

    if-eqz v1, :cond_0

    check-cast p0, Ll/᩵ۙ᩻;

    .line 128
    invoke-static {p0, p1}, Ll/ܿ֡ܳ;->֫(Ll/᩵ۙ᩻;Ll/֨ۚܳ;)V

    goto :goto_0

    .line 129
    :cond_0
    instance-of v1, p0, Ll/ܿ᩸᩻;

    if-eqz v1, :cond_1

    check-cast p0, Ll/ܿ᩸᩻;

    .line 130
    invoke-static {p0, p1}, Ll/ܿ֡ܳ;->֫(Ll/ܿ᩸᩻;Ll/֨ۚܳ;)V

    goto :goto_0

    .line 131
    :cond_1
    instance-of v1, p0, Ll/ۖۛܳ;

    if-eqz v1, :cond_2

    check-cast p0, Ll/ۖۛܳ;

    .line 132
    invoke-static {p0, p1}, Ll/ܿ֡ܳ;->֫(Ll/ۖۛܳ;Ll/֨ۚܳ;)V

    goto :goto_0

    .line 133
    :cond_2
    instance-of v1, p0, Ll/ۨۛܳ;

    if-eqz v1, :cond_4

    check-cast p0, Ll/ۨۛܳ;

    .line 134
    invoke-static {p0, p1}, Ll/ܿ֡ܳ;->֫(Ll/ۨۛܳ;Ll/֨ۚܳ;)V

    .line 138
    :goto_0
    invoke-virtual {p1}, Ll/֨ۚܳ;->۫֫()Z

    move-result p0

    if-eqz p0, :cond_3

    .line 914
    new-instance p0, Ll/ۛ᩵ܳ;

    sget-object p1, Ll/ۧ֡ܳ;->᩹:Ll/ۧ֡ܳ;

    invoke-direct {p0, p1, v0, v0}, Ll/ۛ᩵ܳ;-><init>(Ll/ۧ֡ܳ;Ljava/lang/String;Ljava/lang/Exception;)V

    return-object p0

    .line 902
    :cond_3
    new-instance p0, Ll/ۛ᩵ܳ;

    sget-object p1, Ll/ۧ֡ܳ;->۬:Ll/ۧ֡ܳ;

    invoke-direct {p0, p1, v0, v0}, Ll/ۛ᩵ܳ;-><init>(Ll/ۧ֡ܳ;Ljava/lang/String;Ljava/lang/Exception;)V

    return-object p0

    .line 136
    :cond_4
    new-instance p0, Ll/ᩳ֡ܳ;

    .line 1085
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 136
    throw p0
    :try_end_0
    .catch Ll/ܽ֡ܳ; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ll/ᩳ֡ܳ; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ll/ۤ᩵ܳ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    .line 918
    new-instance p1, Ll/ۛ᩵ܳ;

    sget-object v1, Ll/ۧ֡ܳ;->᩶:Ll/ۧ֡ܳ;

    invoke-direct {p1, v1, v0, p0}, Ll/ۛ᩵ܳ;-><init>(Ll/ۧ֡ܳ;Ljava/lang/String;Ljava/lang/Exception;)V

    return-object p1

    :catch_1
    move-exception p0

    .line 144
    invoke-static {p0}, Ll/ۤ᩵ܳ;->֫(Ll/ۤ᩵ܳ;)Ljava/lang/String;

    move-result-object p0

    .line 906
    new-instance p1, Ll/ۛ᩵ܳ;

    sget-object v1, Ll/ۧ֡ܳ;->ۙ:Ll/ۧ֡ܳ;

    invoke-direct {p1, v1, p0, v0}, Ll/ۛ᩵ܳ;-><init>(Ll/ۧ֡ܳ;Ljava/lang/String;Ljava/lang/Exception;)V

    return-object p1

    .line 910
    :catch_2
    new-instance p0, Ll/ۛ᩵ܳ;

    sget-object p1, Ll/ۧ֡ܳ;->ۗ:Ll/ۧ֡ܳ;

    invoke-direct {p0, p1, v0, v0}, Ll/ۛ᩵ܳ;-><init>(Ll/ۧ֡ܳ;Ljava/lang/String;Ljava/lang/Exception;)V

    return-object p0

    .line 914
    :catch_3
    new-instance p0, Ll/ۛ᩵ܳ;

    sget-object p1, Ll/ۧ֡ܳ;->᩹:Ll/ۧ֡ܳ;

    invoke-direct {p0, p1, v0, v0}, Ll/ۛ᩵ܳ;-><init>(Ll/ۧ֡ܳ;Ljava/lang/String;Ljava/lang/Exception;)V

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ܶ᩵ܿ;)Ll/۫᩵ܳ;
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ܿ֡ܳ;->ۧ(Ll/ܶ᩵ܿ;)Ll/۫᩵ܳ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/io/BufferedInputStream;)V
    .locals 7

    .line 560
    sget-object v0, Ll/ܿ֡ܳ;->֫:[B

    array-length v1, v0

    const/16 v2, 0x800

    add-int/2addr v1, v2

    invoke-virtual {p0, v1}, Ljava/io/BufferedInputStream;->mark(I)V

    .line 561
    array-length v1, v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_1

    aget-byte v5, v0, v4

    .line 562
    invoke-virtual {p0}, Ljava/io/BufferedInputStream;->read()I

    move-result v6

    and-int/lit16 v5, v5, 0xff

    if-eq v6, v5, :cond_0

    .line 563
    invoke-virtual {p0}, Ljava/io/BufferedInputStream;->reset()V

    return-void

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_1
    const/16 v1, 0x8

    if-ge v3, v2, :cond_4

    if-ge v0, v1, :cond_4

    .line 569
    invoke-virtual {p0}, Ljava/io/BufferedInputStream;->read()I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_2

    goto :goto_2

    :cond_2
    const/16 v1, 0xa

    if-ne v4, v1, :cond_3

    add-int/lit8 v0, v0, 0x1

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    if-eq v0, v1, :cond_5

    .line 578
    invoke-virtual {p0}, Ljava/io/BufferedInputStream;->reset()V

    :cond_5
    return-void
.end method

.method public static ֫(Ll/ۖۛܳ;Ll/֨ۚܳ;)V
    .locals 9

    .line 585
    :try_start_0
    new-instance v0, Ll/۠᩵ܳ;

    invoke-direct {v0, p1}, Ll/۠᩵ܳ;-><init>(Ll/֨ۚܳ;)V

    invoke-virtual {p0, v0}, Ll/ۖۛܳ;->֫(Ll/۠᩵ܳ;)Z

    move-result v0
    :try_end_0
    .catch Lnet/sf/sevenzipjbinding/SevenZipException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4

    if-eqz v0, :cond_7

    .line 601
    invoke-virtual {p0}, Ll/ۖۛܳ;->᩶ۧ()Ljava/util/List;

    move-result-object v3

    .line 602
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 603
    new-instance v7, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v7}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 604
    new-instance v8, Ll/ۙ᩵ܳ;

    move-object v1, v8

    move-object v2, p0

    move-object v4, v0

    move-object v5, p1

    move-object v6, v7

    invoke-direct/range {v1 .. v6}, Ll/ۙ᩵ܳ;-><init>(Ll/ۖۛܳ;Ljava/util/List;Ljava/util/concurrent/atomic/AtomicReference;Ll/֨ۚܳ;Ljava/util/concurrent/atomic/AtomicInteger;)V

    .line 661
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object p0

    .line 662
    new-instance v1, Ll/ܰ᩵ܿ;

    const/4 v2, 0x2

    invoke-direct {v1, v2, v8}, Ll/ܰ᩵ܿ;-><init>(ILjava/lang/Object;)V

    invoke-interface {p0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v1

    .line 666
    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 670
    :goto_0
    :try_start_1
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x64

    invoke-interface {v1, v3, v4, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 672
    invoke-virtual {p1}, Ll/֨ۚܳ;->۫֫()Z

    move-result v2

    if-nez v2, :cond_0

    const/16 v2, 0x64

    .line 193
    invoke-virtual {p1, v2}, Ll/ۘ۠ۢ;->ۢ(I)V
    :try_end_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 706
    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    return-void

    .line 673
    :cond_0
    :try_start_2
    new-instance v2, Ll/ܽ֡ܳ;

    .line 1093
    invoke-direct {v2}, Ljava/io/IOException;-><init>()V

    .line 673
    throw v2
    :try_end_2
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception v1

    .line 684
    :try_start_3
    invoke-virtual {p1}, Ll/֨ۚܳ;->۫֫()Z

    move-result v2

    if-nez v2, :cond_5

    .line 687
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    .line 819
    instance-of v2, v1, Ljava/lang/Exception;

    if-eqz v2, :cond_1

    check-cast v1, Ljava/lang/Exception;

    goto :goto_1

    :cond_1
    new-instance v2, Ljava/lang/Exception;

    invoke-direct {v2, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    move-object v1, v2

    .line 688
    :goto_1
    invoke-static {v1}, Ll/ܿ֡ܳ;->֫(Ljava/lang/Exception;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 691
    instance-of v2, v1, Lnet/sf/sevenzipjbinding/SevenZipException;

    if-eqz v2, :cond_3

    move-object v2, v1

    check-cast v2, Lnet/sf/sevenzipjbinding/SevenZipException;

    .line 692
    invoke-static {v2}, Ll/ܿ֡ܳ;->֫(Lnet/sf/sevenzipjbinding/SevenZipException;)Ljava/io/IOException;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 694
    throw v2

    .line 696
    :cond_2
    new-instance v2, Ll/ۤ᩵ܳ;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    check-cast v1, Ljava/io/IOException;

    invoke-direct {v2, v0, v1}, Ll/ۤ᩵ܳ;-><init>(Ljava/lang/String;Ljava/io/IOException;)V

    throw v2

    .line 698
    :cond_3
    throw v1

    .line 689
    :cond_4
    new-instance v0, Ll/ᩳ֡ܳ;

    .line 1089
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 689
    throw v0

    .line 685
    :cond_5
    new-instance v0, Ll/ܽ֡ܳ;

    .line 1093
    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    .line 685
    throw v0

    .line 678
    :catch_1
    invoke-virtual {p1}, Ll/֨ۚܳ;->۫֫()Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_0

    .line 682
    :cond_6
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    .line 193
    invoke-virtual {p1, v2}, Ll/ۘ۠ۢ;->ۢ(I)V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 702
    :catch_2
    :try_start_4
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 183
    invoke-virtual {p1}, Ll/֨ۚܳ;->cancel()V

    .line 704
    new-instance p1, Ll/ܽ֡ܳ;

    .line 1093
    invoke-direct {p1}, Ljava/io/IOException;-><init>()V

    .line 704
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 706
    :goto_2
    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 707
    throw p1

    .line 183
    :cond_7
    :try_start_5
    invoke-virtual {p1}, Ll/֨ۚܳ;->cancel()V

    .line 587
    new-instance p0, Ll/ܽ֡ܳ;

    .line 1093
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    .line 587
    throw p0
    :try_end_5
    .catch Lnet/sf/sevenzipjbinding/SevenZipException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    :catch_3
    move-exception p0

    goto :goto_3

    :catch_4
    move-exception p0

    .line 599
    throw p0

    .line 590
    :goto_3
    invoke-virtual {p1}, Ll/֨ۚܳ;->۫֫()Z

    move-result p1

    if-nez p1, :cond_9

    .line 593
    invoke-static {p0}, Ll/ܿ֡ܳ;->֫(Lnet/sf/sevenzipjbinding/SevenZipException;)Ljava/io/IOException;

    move-result-object p1

    if-eqz p1, :cond_8

    .line 595
    throw p1

    .line 597
    :cond_8
    new-instance p1, Ll/ۤ᩵ܳ;

    const/4 v0, 0x0

    invoke-direct {p1, v0, p0}, Ll/ۤ᩵ܳ;-><init>(Ljava/lang/String;Ljava/io/IOException;)V

    throw p1

    .line 591
    :cond_9
    new-instance p0, Ll/ܽ֡ܳ;

    .line 1093
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    .line 591
    throw p0
.end method

.method public static ֫(Ll/ۗ᩵ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 0

    .line 774
    check-cast p0, Ll/֨ۚܳ;

    invoke-virtual {p0}, Ll/֨ۚܳ;->۫֫()Z

    move-result p0

    if-nez p0, :cond_1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result p0

    if-nez p0, :cond_1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p0

    if-nez p0, :cond_1

    :cond_0
    return-void

    .line 775
    :cond_1
    new-instance p0, Ll/ܽ֡ܳ;

    .line 1093
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    .line 775
    throw p0
.end method

.method public static ֫(Ll/ۨۛܳ;Ll/֨ۚܳ;)V
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 528
    :try_start_0
    invoke-virtual {p0, v0}, Ll/ۨۛܳ;->֫(Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3

    .line 532
    invoke-virtual {p0}, Ll/ۨۛܳ;->ۘ()Ll/۫ۛܳ;

    move-result-object v0

    .line 533
    invoke-virtual {p0}, Ll/ۨۛܳ;->ۜ()Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 534
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v2

    .line 535
    :try_start_1
    new-instance v3, Ll/۬᩵ܳ;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v4

    invoke-direct {v3, v2, v4, v5, p1}, Ll/۬᩵ܳ;-><init>(Ljava/io/InputStream;JLl/֨ۚܳ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 536
    :try_start_2
    invoke-virtual {v0}, Ll/۫ۛܳ;->ᩳ()Ll/ܺۨܳ;

    move-result-object p0

    invoke-virtual {p0, v3}, Ll/ܺۨܳ;->ۧ(Ljava/io/InputStream;)Ljava/io/InputStream;

    move-result-object p0
    :try_end_2
    .catch Ll/ܽ֡ܳ; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    const/high16 v3, 0x10000

    :try_start_3
    new-array v3, v3, [B

    .line 733
    :goto_0
    invoke-virtual {p0, v3}, Ljava/io/InputStream;->read([B)I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_0

    .line 734
    invoke-static {p1, v1}, Ll/ܿ֡ܳ;->֫(Ll/ۗ᩵ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    goto :goto_0

    .line 737
    :cond_0
    invoke-static {p1, v1}, Ll/ܿ֡ܳ;->֫(Ll/ۗ᩵ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 538
    :try_start_4
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ll/ܽ֡ܳ; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-eqz v2, :cond_1

    .line 555
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    if-eqz p0, :cond_2

    .line 536
    :try_start_5
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p0

    :try_start_6
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_1
    throw p1
    :try_end_6
    .catch Ll/ܽ֡ܳ; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catch_0
    move-exception p0

    .line 546
    :try_start_7
    const-class p1, Ll/۟᩵ܳ;

    move-object v3, p0

    :goto_2
    if-eqz v3, :cond_4

    .line 859
    invoke-virtual {p1, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 860
    invoke-virtual {p1, v3}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ljava/lang/Throwable;

    goto :goto_3

    .line 858
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    goto :goto_2

    .line 546
    :cond_4
    :goto_3
    check-cast v1, Ll/۟᩵ܳ;

    if-nez v1, :cond_6

    .line 550
    invoke-static {p0}, Ll/ܿ֡ܳ;->֫(Ljava/lang/Exception;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 551
    new-instance p1, Ll/ᩳ֡ܳ;

    .line 1089
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 551
    throw p1

    .line 553
    :cond_5
    new-instance p1, Ll/ۤ᩵ܳ;

    invoke-virtual {v0}, Ll/ܺۘܳ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0, p0}, Ll/ۤ᩵ܳ;-><init>(Ljava/lang/String;Ljava/io/IOException;)V

    throw p1

    .line 548
    :cond_6
    throw v1

    :catch_1
    move-exception p0

    .line 541
    invoke-static {p0}, Ll/ܿ֡ܳ;->֫(Ljava/lang/Exception;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 542
    new-instance p1, Ll/ᩳ֡ܳ;

    .line 1089
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 542
    throw p1

    .line 544
    :cond_7
    throw p0

    :catch_2
    move-exception p0

    .line 539
    throw p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :catchall_2
    move-exception p0

    if-eqz v2, :cond_8

    .line 534
    :try_start_8
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_8
    :goto_4
    throw p0

    :catch_3
    move-exception p0

    .line 530
    new-instance p1, Ll/ۤ᩵ܳ;

    invoke-direct {p1, v1, p0}, Ll/ۤ᩵ܳ;-><init>(Ljava/lang/String;Ljava/io/IOException;)V

    throw p1
.end method

.method public static ֫(Ll/ܿ᩸᩻;Ll/֨ۚܳ;)V
    .locals 17

    move-object/from16 v0, p1

    .line 463
    invoke-virtual/range {p0 .. p0}, Ll/ܿ᩸᩻;->ۖ()Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 464
    new-instance v2, Ll/۬᩵ܳ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v3

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v4

    invoke-direct {v2, v3, v4, v5, v0}, Ll/۬᩵ܳ;-><init>(Ljava/io/InputStream;JLl/֨ۚܳ;)V

    .line 465
    :try_start_0
    new-instance v1, Ljava/io/BufferedInputStream;

    const/high16 v3, 0x10000

    invoke-direct {v1, v2, v3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    const/4 v4, 0x0

    .line 468
    :try_start_1
    new-instance v5, Ll/֨᩵ܳ;

    invoke-direct {v5, v1}, Ll/֨᩵ܳ;-><init>(Ljava/io/BufferedInputStream;)V

    invoke-static {v1, v5}, Ll/۫ܶ᩻;->֫(Ljava/io/BufferedInputStream;Ll/֨᩵ܳ;)Ljava/io/InputStream;

    move-result-object v5

    if-nez v5, :cond_0

    move-object v5, v1

    .line 472
    :cond_0
    instance-of v6, v5, Ljava/io/BufferedInputStream;

    if-eqz v6, :cond_1

    .line 473
    check-cast v5, Ljava/io/BufferedInputStream;

    goto :goto_0

    :cond_1
    new-instance v6, Ljava/io/BufferedInputStream;

    invoke-direct {v6, v5, v3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    move-object v5, v6

    .line 474
    :goto_0
    invoke-static {v5}, Ll/ܿ֡ܳ;->֫(Ljava/io/BufferedInputStream;)V

    .line 475
    invoke-virtual/range {p0 .. p0}, Ll/ܿ᩸᩻;->ۜ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    const/16 v7, 0x200

    if-eqz v6, :cond_2

    .line 476
    new-instance v6, Ll/۠᩷֡;

    .line 184
    invoke-direct {v6, v5, v7, v4}, Ll/۠᩷֡;-><init>(Ljava/io/InputStream;ILjava/lang/String;)V

    goto :goto_1

    .line 477
    :cond_2
    new-instance v6, Ll/۠᩷֡;

    invoke-virtual/range {p0 .. p0}, Ll/ܿ᩸᩻;->ۜ()Ljava/lang/String;

    move-result-object v8

    .line 236
    invoke-direct {v6, v5, v7, v8}, Ll/۠᩷֡;-><init>(Ljava/io/InputStream;ILjava/lang/String;)V

    .line 478
    :goto_1
    invoke-virtual {v6}, Ll/۠᩷֡;->ۜ()V
    :try_end_1
    .catch Ll/ܽ֡ܳ; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ll/ۤ᩵ܳ; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 483
    :cond_3
    :goto_2
    :try_start_2
    invoke-virtual {v6}, Ll/۠᩷֡;->ܳ()Ll/֨᩷֡;

    move-result-object v7
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const/4 v8, -0x1

    if-nez v7, :cond_7

    :try_start_3
    new-array v3, v3, [B

    .line 746
    :cond_4
    invoke-virtual {v5, v3}, Ljava/io/InputStream;->read([B)I

    move-result v7

    if-eq v7, v8, :cond_6

    .line 747
    invoke-static {v0, v4}, Ll/ܿ֡ܳ;->֫(Ll/ۗ᩵ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    const/4 v9, 0x0

    :goto_3
    if-ge v9, v7, :cond_4

    .line 749
    aget-byte v10, v3, v9

    if-nez v10, :cond_5

    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    .line 750
    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v3, "Non-zero data after TAR end marker"

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 754
    :cond_6
    invoke-static {v0, v4}, Ll/ܿ֡ܳ;->֫(Ll/ۗ᩵ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 504
    :try_start_4
    invoke-virtual {v6}, Ll/۠᩷֡;->close()V
    :try_end_4
    .catch Ll/ܽ֡ܳ; {:try_start_4 .. :try_end_4} :catch_5
    .catch Ll/ۤ᩵ܳ; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 522
    :try_start_5
    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    invoke-virtual {v2}, Ll/۬᩵ܳ;->close()V

    return-void

    .line 494
    :cond_7
    :try_start_6
    invoke-virtual {v7}, Ll/֨᩷֡;->ۘ()Ljava/lang/String;

    move-result-object v9
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :try_start_7
    new-array v10, v3, [B

    const-wide/16 v11, 0x0

    .line 733
    :goto_4
    invoke-virtual {v6, v10}, Ljava/io/InputStream;->read([B)I

    move-result v13

    if-eq v13, v8, :cond_8

    .line 734
    invoke-static {v0, v4}, Ll/ܿ֡ܳ;->֫(Ll/ۗ᩵ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    int-to-long v13, v13

    add-long/2addr v11, v13

    goto :goto_4

    :cond_8
    const-wide/16 v13, 0x0

    .line 737
    invoke-static {v0, v4}, Ll/ܿ֡ܳ;->֫(Ll/ۗ᩵ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 496
    invoke-virtual {v7}, Ll/֨᩷֡;->᩵()J

    move-result-wide v15

    cmp-long v8, v15, v13

    if-ltz v8, :cond_3

    invoke-virtual {v7}, Ll/֨᩷֡;->᩵()J

    move-result-wide v13

    cmp-long v8, v11, v13

    if-nez v8, :cond_9

    goto :goto_2

    .line 497
    :cond_9
    new-instance v0, Ll/ۤ᩵ܳ;

    new-instance v3, Ljava/io/IOException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Unexpected TAR entry size: "

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v8, " != "

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 498
    invoke-virtual {v7}, Ll/֨᩷֡;->᩵()J

    move-result-wide v7

    invoke-virtual {v5, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v9, v3}, Ll/ۤ᩵ܳ;-><init>(Ljava/lang/String;Ljava/io/IOException;)V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :catchall_0
    move-exception v0

    goto :goto_6

    :catchall_1
    move-exception v0

    goto :goto_7

    :catch_0
    move-exception v0

    move-object v3, v0

    .line 485
    :try_start_8
    invoke-virtual {v6}, Ll/۠᩷֡;->ܽ()Ll/֨᩷֡;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 486
    invoke-virtual {v0}, Ll/֨᩷֡;->ܶ()Z

    move-result v5

    if-nez v5, :cond_a

    .line 487
    invoke-virtual {v0}, Ll/֨᩷֡;->ۘ()Ljava/lang/String;

    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    move-object v9, v0

    goto :goto_5

    :cond_a
    move-object v9, v4

    .line 489
    :goto_5
    :try_start_9
    throw v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :goto_6
    move-object v3, v0

    goto :goto_8

    :goto_7
    move-object v3, v0

    move-object v9, v4

    .line 478
    :goto_8
    :try_start_a
    invoke-virtual {v6}, Ll/۠᩷֡;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    goto :goto_9

    :catchall_2
    move-exception v0

    move-object v5, v0

    :try_start_b
    invoke-virtual {v3, v5}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_9
    throw v3
    :try_end_b
    .catch Ll/ܽ֡ܳ; {:try_start_b .. :try_end_b} :catch_5
    .catch Ll/ۤ᩵ܳ; {:try_start_b .. :try_end_b} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_b .. :try_end_b} :catch_3
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_1
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    :catch_1
    move-exception v0

    goto :goto_a

    :catchall_3
    move-exception v0

    move-object v3, v0

    goto :goto_e

    :catch_2
    move-exception v0

    move-object v9, v4

    .line 513
    :goto_a
    :try_start_c
    const-class v3, Ll/۟᩵ܳ;

    move-object v5, v0

    :goto_b
    if-eqz v5, :cond_c

    .line 859
    invoke-virtual {v3, v5}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b

    .line 860
    invoke-virtual {v3, v5}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/Throwable;

    goto :goto_c

    .line 858
    :cond_b
    invoke-virtual {v5}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    goto :goto_b

    .line 513
    :cond_c
    :goto_c
    check-cast v4, Ll/۟᩵ܳ;

    if-nez v4, :cond_e

    .line 517
    invoke-static {v0}, Ll/ܿ֡ܳ;->֫(Ljava/lang/Exception;)Z

    move-result v3

    if-eqz v3, :cond_d

    .line 518
    new-instance v3, Ll/ᩳ֡ܳ;

    .line 1089
    invoke-direct {v3, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 518
    throw v3

    .line 520
    :cond_d
    new-instance v3, Ll/ۤ᩵ܳ;

    invoke-direct {v3, v9, v0}, Ll/ۤ᩵ܳ;-><init>(Ljava/lang/String;Ljava/io/IOException;)V

    throw v3

    .line 515
    :cond_e
    throw v4

    :catch_3
    move-exception v0

    .line 508
    invoke-static {v0}, Ll/ܿ֡ܳ;->֫(Ljava/lang/Exception;)Z

    move-result v3

    if-eqz v3, :cond_f

    .line 509
    new-instance v3, Ll/ᩳ֡ܳ;

    .line 1089
    invoke-direct {v3, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 509
    throw v3

    .line 511
    :cond_f
    throw v0

    :catch_4
    move-exception v0

    goto :goto_d

    :catch_5
    move-exception v0

    .line 506
    :goto_d
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 464
    :goto_e
    :try_start_d
    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    goto :goto_f

    :catchall_4
    move-exception v0

    move-object v1, v0

    :try_start_e
    invoke-virtual {v3, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_f
    throw v3
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    :catchall_5
    move-exception v0

    move-object v1, v0

    :try_start_f
    invoke-virtual {v2}, Ll/۬᩵ܳ;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    goto :goto_10

    :catchall_6
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_10
    throw v1
.end method

.method public static ֫(Ll/ᩳܰۡ;Ll/᩵ۙ᩻;Ll/ۗ᩺ۡ;[BLl/ܰ᩵ܳ;ZLl/֨ۚܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p6

    .line 311
    invoke-virtual/range {p2 .. p2}, Ll/ۗ᩺ۡ;->ᩴ()Z

    move-result v0

    const/4 v7, -0x1

    if-eqz v0, :cond_15

    .line 336
    invoke-static/range {p2 .. p2}, Ll/᩹᩶᩻;->֫(Ll/ۗ᩺ۡ;)Z

    move-result v0

    const/4 v8, 0x0

    if-eqz v0, :cond_8

    .line 409
    invoke-virtual/range {p1 .. p1}, Ll/᩵ۙ᩻;->ᩴ()Ljava/lang/String;

    move-result-object v0

    move-object v9, v8

    .line 411
    :goto_0
    invoke-static/range {p6 .. p7}, Ll/ܿ֡ܳ;->֫(Ll/ۗ᩵ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    if-eqz v0, :cond_1

    .line 413
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_0

    goto :goto_2

    :cond_0
    const/4 v10, 0x0

    move-object v10, v9

    const/4 v11, 0x0

    :goto_1
    move-object v9, v0

    goto :goto_3

    :cond_1
    :goto_2
    if-nez v9, :cond_2

    .line 415
    new-instance v0, Ll/᩹᩵ܳ;

    invoke-direct {v0, v6}, Ll/᩹᩵ܳ;-><init>(Ll/֨ۚܳ;)V

    invoke-static {v1, v3, v0}, Ll/᩹᩶᩻;->֫(Ll/ᩳܰۡ;Ll/ۗ᩺ۡ;Ll/ܿۖ᩷;)Ljava/util/List;

    move-result-object v9

    .line 417
    :cond_2
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 418
    new-instance v10, Ll/۫֨ܳ;

    new-instance v11, Ll/᩶᩵ܳ;

    invoke-direct {v11, v0}, Ll/᩶᩵ܳ;-><init>(Ljava/lang/Object;)V

    invoke-direct {v10, v8, v11}, Ll/۫֨ܳ;-><init>(Ll/ۗܺ᩷;Ll/۬֨ܳ;)V

    .line 419
    new-instance v11, Ll/۠᩵ܳ;

    invoke-direct {v11, v6}, Ll/۠᩵ܳ;-><init>(Ll/֨ۚܳ;)V

    invoke-virtual {v10, v11}, Ll/۫֨ܳ;->֫(Ljava/util/function/BooleanSupplier;)V

    .line 420
    invoke-virtual {v10, v9}, Ll/۫֨ܳ;->֫(Ljava/util/List;)Z

    move-result v10

    if-eqz v10, :cond_7

    .line 424
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v10, 0x1

    move-object v10, v9

    const/4 v11, 0x1

    goto :goto_1

    .line 428
    :goto_3
    invoke-virtual {v1, v9}, Ll/ᩳܰۡ;->֫(Ljava/lang/String;)V

    const-wide/16 v12, 0x0

    .line 429
    :try_start_0
    new-instance v14, Ljava/io/BufferedInputStream;

    invoke-virtual {v1, v3}, Ll/ᩳܰۡ;->ܽ(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object v0

    invoke-direct {v14, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ll/ܽ֡ܳ; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ll/ۘܰۡ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 430
    :try_start_1
    invoke-static {v3, v14}, Ll/᩹᩶᩻;->֫(Ll/ۗ᩺ۡ;Ljava/io/BufferedInputStream;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 763
    :goto_4
    invoke-virtual {v14, v4}, Ljava/io/InputStream;->read([B)I

    move-result v0

    if-eq v0, v7, :cond_3

    .line 764
    invoke-static/range {p6 .. p7}, Ll/ܿ֡ܳ;->֫(Ll/ۗ᩵ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-object v15, v9

    int-to-long v8, v0

    .line 765
    :try_start_2
    invoke-static {v12, v13, v8, v9}, Ll/ܿ֡ܳ;->ۧ(JJ)J

    move-result-wide v12

    .line 766
    invoke-virtual {v5, v8, v9}, Ll/ܰ᩵ܳ;->ۧ(J)V

    .line 767
    invoke-virtual/range {p4 .. p4}, Ll/ܰ᩵ܳ;->ܽ()V

    const/4 v0, -0x1

    move-object v9, v15

    const/4 v7, -0x1

    const/4 v8, 0x0

    goto :goto_4

    :cond_3
    move-object v15, v9

    .line 769
    invoke-static/range {p6 .. p7}, Ll/ܿ֡ܳ;->֫(Ll/ۗ᩵ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 434
    invoke-virtual/range {p2 .. p2}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v8

    invoke-virtual {v5, v8, v9, v12, v13}, Ll/ܰ᩵ܳ;->֫(JJ)V

    .line 435
    invoke-virtual/range {p1 .. p1}, Ll/᩵ۙ᩻;->᩵()Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v8, v15

    :try_start_3
    invoke-static {v0, v8}, Ll/ۤܺܳ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 437
    :try_start_4
    invoke-virtual {v14}, Ljava/io/BufferedInputStream;->close()V
    :try_end_4
    .catch Ll/ܽ֡ܳ; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ll/ۘܰۡ; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    goto/16 :goto_c

    :catchall_0
    move-exception v0

    move-object v8, v15

    goto :goto_5

    :cond_4
    move-object v8, v9

    .line 431
    :try_start_5
    new-instance v0, Ll/ۘܰۡ;

    invoke-virtual/range {p2 .. p2}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v0, v9}, Ll/ۘܰۡ;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception v0

    goto :goto_5

    :catchall_2
    move-exception v0

    move-object v8, v9

    :goto_5
    move-object v9, v0

    .line 429
    :try_start_6
    invoke-virtual {v14}, Ljava/io/BufferedInputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_6

    :catchall_3
    move-exception v0

    move-object v12, v0

    :try_start_7
    invoke-virtual {v9, v12}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw v9
    :try_end_7
    .catch Ll/ܽ֡ܳ; {:try_start_7 .. :try_end_7} :catch_3
    .catch Ll/ۘܰۡ; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0

    :catch_0
    move-exception v0

    .line 448
    invoke-static {v0}, Ll/ܿ֡ܳ;->֫(Ljava/lang/Exception;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 449
    new-instance v1, Ll/ᩳ֡ܳ;

    .line 1089
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 449
    throw v1

    .line 451
    :cond_5
    new-instance v1, Ll/ۤ᩵ܳ;

    invoke-virtual/range {p2 .. p2}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ll/ۤ᩵ܳ;-><init>(Ljava/lang/String;Ljava/io/IOException;)V

    throw v1

    :catch_1
    move-object v8, v9

    .line 440
    :catch_2
    invoke-virtual/range {p4 .. p4}, Ll/ܰ᩵ܳ;->֫()V

    .line 441
    invoke-virtual/range {p4 .. p4}, Ll/ܰ᩵ܳ;->ܽ()V

    .line 442
    invoke-virtual/range {p1 .. p1}, Ll/᩵ۙ᩻;->᩵()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v8}, Ll/ۤܺܳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v11, :cond_6

    .line 444
    invoke-static {}, Ll/᩹᩶᩻;->֫()V

    :cond_6
    const/4 v0, -0x1

    move-object v9, v10

    const/4 v0, 0x0

    const/4 v7, -0x1

    const/4 v8, 0x0

    goto/16 :goto_0

    :catch_3
    move-exception v0

    .line 438
    throw v0

    .line 183
    :cond_7
    invoke-virtual/range {p6 .. p6}, Ll/֨ۚܳ;->cancel()V

    .line 422
    new-instance v0, Ll/ܽ֡ܳ;

    .line 1093
    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    .line 422
    throw v0

    :cond_8
    const/4 v0, 0x0

    const/4 v7, 0x0

    .line 342
    :cond_9
    :goto_7
    invoke-static/range {p6 .. p7}, Ll/ܿ֡ܳ;->֫(Ll/ۗ᩵ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 345
    invoke-virtual/range {p1 .. p1}, Ll/᩵ۙ᩻;->ᩴ()Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_b

    .line 346
    invoke-virtual {v10}, Ljava/lang/String;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_a

    goto :goto_8

    :cond_a
    const/4 v0, 0x0

    goto :goto_9

    :cond_b
    :goto_8
    if-nez v7, :cond_c

    .line 348
    invoke-static {}, Ll/ۤܺܳ;->ۧ()Ljava/util/Iterator;

    move-result-object v7

    .line 350
    :cond_c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_d

    .line 351
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 352
    invoke-virtual {v2, v0}, Ll/᩵ۙ᩻;->ᩳ(Ljava/lang/String;)V

    const/4 v10, 0x0

    const/4 v11, 0x1

    goto :goto_a

    .line 355
    :cond_d
    new-instance v10, Ll/۫֨ܳ;

    new-instance v11, Ll/۟ۢۡ;

    const/4 v12, 0x1

    invoke-direct {v11, v12, v2}, Ll/۟ۢۡ;-><init>(ILjava/lang/Object;)V

    invoke-direct {v10, v0, v11}, Ll/۫֨ܳ;-><init>(Ll/ۗܺ᩷;Ll/۬֨ܳ;)V

    .line 356
    new-instance v0, Ll/۠᩵ܳ;

    invoke-direct {v0, v6}, Ll/۠᩵ܳ;-><init>(Ll/֨ۚܳ;)V

    invoke-virtual {v10, v0}, Ll/۫֨ܳ;->֫(Ljava/util/function/BooleanSupplier;)V

    .line 357
    invoke-virtual {v10}, Ll/۫֨ܳ;->֫()Z

    move-result v0

    if-eqz v0, :cond_14

    .line 362
    invoke-virtual/range {p1 .. p1}, Ll/᩵ۙ᩻;->ᩴ()Ljava/lang/String;

    move-result-object v10

    :goto_9
    const/4 v11, 0x0

    move-object/from16 v16, v10

    move v10, v0

    move-object/from16 v0, v16

    .line 365
    :goto_a
    invoke-virtual {v1, v0}, Ll/ᩳܰۡ;->֫(Ljava/lang/String;)V

    .line 366
    :try_start_8
    new-instance v12, Ljava/io/BufferedInputStream;

    invoke-virtual {v1, v3}, Ll/ᩳܰۡ;->ܽ(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object v13

    invoke-direct {v12, v13}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_8
    .catch Ll/ܽ֡ܳ; {:try_start_8 .. :try_end_8} :catch_6
    .catch Ll/ۘܰۡ; {:try_start_8 .. :try_end_8} :catch_5
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_4

    .line 367
    :try_start_9
    invoke-static {v3, v12}, Ll/᩹᩶᩻;->֫(Ll/ۗ᩺ۡ;Ljava/io/BufferedInputStream;)Z

    move-result v13

    if-eqz v13, :cond_11

    const-wide/16 v13, 0x0

    .line 763
    :goto_b
    invoke-virtual {v12, v4}, Ljava/io/InputStream;->read([B)I

    move-result v15

    const/4 v8, -0x1

    if-eq v15, v8, :cond_e

    .line 764
    invoke-static/range {p6 .. p7}, Ll/ܿ֡ܳ;->֫(Ll/ۗ᩵ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    int-to-long v8, v15

    .line 765
    invoke-static {v13, v14, v8, v9}, Ll/ܿ֡ܳ;->ۧ(JJ)J

    move-result-wide v13

    .line 766
    invoke-virtual {v5, v8, v9}, Ll/ܰ᩵ܳ;->ۧ(J)V

    .line 767
    invoke-virtual/range {p4 .. p4}, Ll/ܰ᩵ܳ;->ܽ()V

    goto :goto_b

    .line 769
    :cond_e
    invoke-static/range {p6 .. p7}, Ll/ܿ֡ܳ;->֫(Ll/ۗ᩵ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 371
    invoke-virtual/range {p2 .. p2}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v8

    invoke-virtual {v5, v8, v9, v13, v14}, Ll/ܰ᩵ܳ;->֫(JJ)V

    if-eqz v11, :cond_f

    .line 373
    invoke-virtual/range {p1 .. p1}, Ll/᩵ۙ᩻;->᩵()Ljava/lang/String;

    move-result-object v8

    invoke-static {v0, v8}, Ll/᩹᩶᩻;->֫(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 376
    :cond_f
    :try_start_a
    invoke-virtual {v12}, Ljava/io/BufferedInputStream;->close()V
    :try_end_a
    .catch Ll/ܽ֡ܳ; {:try_start_a .. :try_end_a} :catch_6
    .catch Ll/ۘܰۡ; {:try_start_a .. :try_end_a} :catch_5
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_4

    :goto_c
    if-eqz p5, :cond_10

    .line 314
    invoke-virtual/range {p4 .. p4}, Ll/ܰ᩵ܳ;->ܽ()V

    :cond_10
    return-void

    .line 368
    :cond_11
    :try_start_b
    new-instance v0, Ll/ۘܰۡ;

    invoke-virtual/range {p2 .. p2}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v0, v8}, Ll/ۘܰۡ;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    :catchall_4
    move-exception v0

    move-object v8, v0

    .line 366
    :try_start_c
    invoke-virtual {v12}, Ljava/io/BufferedInputStream;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    goto :goto_d

    :catchall_5
    move-exception v0

    move-object v9, v0

    :try_start_d
    invoke-virtual {v8, v9}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_d
    throw v8
    :try_end_d
    .catch Ll/ܽ֡ܳ; {:try_start_d .. :try_end_d} :catch_6
    .catch Ll/ۘܰۡ; {:try_start_d .. :try_end_d} :catch_5
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_4

    :catch_4
    move-exception v0

    .line 387
    invoke-static {v0}, Ll/ܿ֡ܳ;->֫(Ljava/lang/Exception;)Z

    move-result v8

    if-nez v8, :cond_13

    .line 391
    invoke-virtual/range {p2 .. p2}, Ll/ۗ᩺ۡ;->ܰ()Z

    move-result v8

    if-eqz v11, :cond_12

    if-eqz v8, :cond_12

    .line 392
    invoke-virtual/range {p4 .. p4}, Ll/ܰ᩵ܳ;->֫()V

    .line 393
    invoke-virtual/range {p4 .. p4}, Ll/ܰ᩵ܳ;->ܽ()V

    const/4 v0, 0x0

    .line 394
    invoke-virtual {v2, v0}, Ll/᩵ۙ᩻;->ᩳ(Ljava/lang/String;)V

    goto/16 :goto_7

    .line 397
    :cond_12
    new-instance v1, Ll/ۤ᩵ܳ;

    invoke-virtual/range {p2 .. p2}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ll/ۤ᩵ܳ;-><init>(Ljava/lang/String;Ljava/io/IOException;)V

    throw v1

    .line 388
    :cond_13
    new-instance v1, Ll/ᩳ֡ܳ;

    .line 1089
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 388
    throw v1

    .line 380
    :catch_5
    invoke-virtual/range {p4 .. p4}, Ll/ܰ᩵ܳ;->֫()V

    .line 381
    invoke-virtual/range {p4 .. p4}, Ll/ܰ᩵ܳ;->ܽ()V

    const/4 v0, 0x0

    .line 382
    invoke-virtual {v2, v0}, Ll/᩵ۙ᩻;->ᩳ(Ljava/lang/String;)V

    if-eqz v10, :cond_9

    .line 384
    invoke-static {}, Ll/᩹᩶᩻;->֫()V

    goto/16 :goto_7

    :catch_6
    move-exception v0

    .line 378
    throw v0

    .line 183
    :cond_14
    invoke-virtual/range {p6 .. p6}, Ll/֨ۚܳ;->cancel()V

    .line 360
    new-instance v0, Ll/ܽ֡ܳ;

    .line 1093
    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    .line 360
    throw v0

    :cond_15
    const-wide/16 v7, 0x0

    .line 318
    :try_start_e
    invoke-virtual {v1, v3}, Ll/ᩳܰۡ;->ܽ(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object v1
    :try_end_e
    .catch Ll/ܽ֡ܳ; {:try_start_e .. :try_end_e} :catch_8
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_7

    .line 716
    :cond_16
    :goto_e
    :try_start_f
    invoke-virtual {v1, v4}, Ljava/io/InputStream;->read([B)I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_17

    .line 717
    invoke-static/range {p6 .. p7}, Ll/ܿ֡ܳ;->֫(Ll/ۗ᩵ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    int-to-long v9, v0

    .line 719
    invoke-virtual {v5, v9, v10}, Ll/ܰ᩵ܳ;->֫(J)V

    if-eqz p5, :cond_16

    .line 721
    invoke-virtual/range {p4 .. p4}, Ll/ܰ᩵ܳ;->ܽ()V

    goto :goto_e

    .line 724
    :cond_17
    invoke-static/range {p6 .. p7}, Ll/ܿ֡ܳ;->֫(Ll/ۗ᩵ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 320
    invoke-virtual/range {p2 .. p2}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v9

    cmp-long v0, v9, v7

    if-nez v0, :cond_18

    const-wide/16 v6, 0x1

    .line 977
    invoke-virtual {v5, v6, v7}, Ll/ܰ᩵ܳ;->֫(J)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    .line 321
    :cond_18
    :try_start_10
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_10
    .catch Ll/ܽ֡ܳ; {:try_start_10 .. :try_end_10} :catch_8
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_7

    return-void

    :catchall_6
    move-exception v0

    move-object v2, v0

    .line 318
    :try_start_11
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    goto :goto_f

    :catchall_7
    move-exception v0

    move-object v1, v0

    :try_start_12
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_f
    throw v2
    :try_end_12
    .catch Ll/ܽ֡ܳ; {:try_start_12 .. :try_end_12} :catch_8
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_7

    :catch_7
    move-exception v0

    .line 325
    invoke-static {v0}, Ll/ܿ֡ܳ;->֫(Ljava/lang/Exception;)Z

    move-result v1

    if-eqz v1, :cond_19

    .line 326
    new-instance v1, Ll/ᩳ֡ܳ;

    .line 1089
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 326
    throw v1

    .line 328
    :cond_19
    new-instance v1, Ll/ۤ᩵ܳ;

    invoke-virtual/range {p2 .. p2}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ll/ۤ᩵ܳ;-><init>(Ljava/lang/String;Ljava/io/IOException;)V

    throw v1

    :catch_8
    move-exception v0

    .line 323
    throw v0
.end method

.method public static synthetic ֫(Ll/᩵ۙ᩻;Ljava/util/List;Ll/֨ۚܳ;Ljava/util/concurrent/atomic/AtomicBoolean;Ll/ܰ᩵ܳ;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 10

    const/high16 v0, 0x10000

    new-array v0, v0, [B

    .line 213
    :try_start_0
    invoke-virtual {p0}, Ll/᩵ۙ᩻;->֡()Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {p0}, Ll/᩵ۙ᩻;->ܶ()[B

    move-result-object v2

    invoke-static {v1, v2}, Ll/ᩳܰۡ;->֫(Ll/ܶ᩵ܿ;[B)Ll/ᩳܰۡ;

    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 214
    :try_start_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ll/ۗ᩺ۡ;

    .line 215
    invoke-static {p2, p3}, Ll/ܿ֡ܳ;->֫(Ll/ۗ᩵ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    const/4 v6, 0x0

    move-object v1, v9

    move-object v2, p0

    move-object v4, v0

    move-object v5, p4

    move-object v7, p2

    move-object v8, p3

    .line 216
    invoke-static/range {v1 .. v8}, Ll/ܿ֡ܳ;->֫(Ll/ᩳܰۡ;Ll/᩵ۙ᩻;Ll/ۗ᩺ۡ;[BLl/ܰ᩵ܳ;ZLl/֨ۚܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 218
    :cond_0
    :try_start_2
    invoke-virtual {v9}, Ll/ᩳܰۡ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-void

    :catchall_1
    move-exception p0

    goto :goto_3

    .line 213
    :goto_1
    :try_start_3
    invoke-virtual {v9}, Ll/ᩳܰۡ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception p1

    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 219
    :goto_3
    instance-of p1, p0, Ll/ܽ֡ܳ;

    if-nez p1, :cond_3

    :cond_1
    const/4 p1, 0x0

    .line 0
    invoke-virtual {p5, p1, p0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_4

    :cond_2
    invoke-virtual {p5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    :cond_3
    :goto_4
    const/4 p0, 0x1

    .line 222
    invoke-virtual {p3, p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public static ֫(Ll/᩵ۙ᩻;Ll/֨ۚܳ;)V
    .locals 17

    move-object/from16 v0, p1

    .line 152
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v1

    .line 160
    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual/range {p0 .. p0}, Ll/᩵ۙ᩻;->ۗ()Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 165
    new-instance v3, Ll/ۗۢۡ;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Ll/ۗۢۡ;-><init>(I)V

    invoke-static {v2, v3}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 166
    new-instance v3, Ll/ܶ᩵ܳ;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-static {v3}, Ll/۠۬ᩴ;->comparingLong(Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;

    move-result-object v3

    invoke-static {v2, v3}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 167
    new-instance v9, Ll/ܰ᩵ܳ;

    .line 781
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const-wide/16 v4, 0x0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const-wide/16 v7, 0x1

    if-eqz v6, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۗ᩺ۡ;

    .line 782
    invoke-virtual {v6}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v10

    invoke-static {v7, v8, v10, v11}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    invoke-static {v4, v5, v6, v7}, Ll/ܿ֡ܳ;->ۧ(JJ)J

    move-result-wide v4

    goto :goto_0

    .line 784
    :cond_0
    invoke-static {v7, v8, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    .line 167
    invoke-direct {v9, v3, v4, v0}, Ll/ܰ᩵ܳ;-><init>(JLl/֨ۚܳ;)V

    .line 169
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 170
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 171
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۗ᩺ۡ;

    .line 172
    invoke-virtual {v4}, Ll/ۗ᩺ۡ;->ᩴ()Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {v4}, Ll/ۗ᩺ۡ;->֨()I

    move-result v5

    if-eqz v5, :cond_1

    .line 173
    invoke-virtual {v4}, Ll/ۗ᩺ۡ;->֨()I

    move-result v5

    const/16 v6, 0x8

    if-ne v5, v6, :cond_2

    .line 174
    :cond_1
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 176
    :cond_2
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 180
    :cond_3
    invoke-virtual/range {p0 .. p0}, Ll/᩵ۙ᩻;->֡()Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->᩶֫()Z

    move-result v2

    .line 181
    invoke-virtual/range {p0 .. p0}, Ll/᩵ۙ᩻;->᩹()Z

    move-result v4

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v6, 0x1

    if-eqz v2, :cond_6

    const/4 v2, 0x2

    if-ge v5, v2, :cond_4

    goto :goto_3

    :cond_4
    if-eqz v4, :cond_5

    goto :goto_2

    :cond_5
    const/4 v2, 0x4

    .line 199
    :goto_2
    invoke-static {v6, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v5, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v6, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    goto :goto_4

    :cond_6
    :goto_3
    const/4 v1, 0x1

    :goto_4
    if-le v1, v6, :cond_15

    .line 257
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const-wide/16 v4, 0x0

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۗ᩺ۡ;

    .line 288
    invoke-virtual {v6}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v11

    invoke-virtual {v6}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v13

    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v11

    invoke-static {v7, v8, v11, v12}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v11

    .line 258
    invoke-static {v4, v5, v11, v12}, Ll/ܿ֡ܳ;->ۧ(JJ)J

    move-result-wide v4

    goto :goto_5

    :cond_7
    const-wide/16 v11, 0x0

    int-to-long v13, v1

    .line 260
    div-long v15, v4, v13

    .line 261
    rem-long/2addr v4, v13

    const/4 v2, 0x0

    cmp-long v6, v4, v11

    if-nez v6, :cond_8

    const/4 v4, 0x0

    goto :goto_6

    :cond_8
    const/4 v4, 0x1

    :goto_6
    int-to-long v4, v4

    add-long/2addr v4, v15

    .line 260
    invoke-static {v7, v8, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    .line 262
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 263
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 265
    :goto_7
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-ge v2, v8, :cond_b

    .line 266
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v8

    sub-int/2addr v8, v2

    .line 267
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v13

    sub-int v13, v1, v13

    .line 269
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v14

    if-nez v14, :cond_a

    const/4 v14, 0x1

    if-le v13, v14, :cond_a

    add-int/lit8 v13, v13, -0x1

    if-lt v8, v13, :cond_a

    cmp-long v14, v11, v4

    if-gez v14, :cond_9

    if-ne v8, v13, :cond_a

    .line 272
    :cond_9
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 273
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    const-wide/16 v11, 0x0

    .line 276
    :cond_a
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۗ᩺ۡ;

    .line 277
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 288
    invoke-virtual {v8}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v13

    move-wide v15, v4

    invoke-virtual {v8}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v4

    invoke-static {v13, v14, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    const-wide/16 v13, 0x1

    invoke-static {v13, v14, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    .line 278
    invoke-static {v11, v12, v4, v5}, Ll/ܿ֡ܳ;->ۧ(JJ)J

    move-result-wide v11

    add-int/lit8 v2, v2, 0x1

    move-wide v4, v15

    goto :goto_7

    .line 280
    :cond_b
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_c

    .line 281
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    :cond_c
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-static {v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v8

    .line 207
    new-instance v11, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v11}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 208
    new-instance v12, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v12}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 209
    new-instance v13, Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v13, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 210
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_8
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/util/List;

    .line 211
    new-instance v15, Ll/᩸᩵ܳ;

    move-object v1, v15

    move-object/from16 v2, p0

    move-object/from16 v4, p1

    move-object v5, v11

    move-object v6, v9

    move-object v7, v12

    invoke-direct/range {v1 .. v7}, Ll/᩸᩵ܳ;-><init>(Ll/᩵ۙ᩻;Ljava/util/List;Ll/֨ۚܳ;Ljava/util/concurrent/atomic/AtomicBoolean;Ll/ܰ᩵ܳ;Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-interface {v8, v15}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v1

    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 226
    :cond_d
    invoke-interface {v8}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 228
    :cond_e
    :goto_9
    :try_start_1
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x64

    invoke-interface {v8, v2, v3, v1}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    move-result v1

    if-nez v1, :cond_11

    .line 229
    invoke-virtual {v9}, Ll/ܰ᩵ܳ;->ܽ()V

    .line 230
    invoke-virtual/range {p1 .. p1}, Ll/֨ۚܳ;->۫֫()Z

    move-result v1

    if-nez v1, :cond_f

    invoke-virtual {v12}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_e

    :cond_f
    const/4 v1, 0x1

    .line 231
    invoke-virtual {v11, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 232
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/Future;

    const/4 v3, 0x1

    .line 233
    invoke-interface {v2, v3}, Ljava/util/concurrent/Future;->cancel(Z)Z

    goto :goto_a

    .line 235
    :cond_10
    invoke-interface {v8}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_9

    .line 245
    :cond_11
    invoke-virtual/range {p1 .. p1}, Ll/֨ۚܳ;->۫֫()Z

    move-result v1

    if-nez v1, :cond_14

    .line 248
    invoke-virtual {v12}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    if-nez v1, :cond_12

    goto :goto_c

    .line 819
    :cond_12
    instance-of v0, v1, Ljava/lang/Exception;

    if-eqz v0, :cond_13

    check-cast v1, Ljava/lang/Exception;

    goto :goto_b

    :cond_13
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    move-object v1, v0

    .line 250
    :goto_b
    throw v1

    .line 246
    :cond_14
    new-instance v0, Ll/ܽ֡ܳ;

    .line 1093
    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    .line 246
    throw v0

    .line 239
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 183
    invoke-virtual/range {p1 .. p1}, Ll/֨ۚܳ;->cancel()V

    const/4 v0, 0x1

    .line 241
    invoke-virtual {v11, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 242
    invoke-interface {v8}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 243
    new-instance v0, Ll/ܽ֡ܳ;

    .line 1093
    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    .line 243
    throw v0

    .line 185
    :cond_15
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 186
    new-instance v1, Ll/ܶ᩵ܳ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v1}, Ll/۠۬ᩴ;->comparingLong(Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;

    move-result-object v1

    invoke-static {v10, v1}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 294
    :goto_c
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_16

    goto :goto_e

    .line 297
    :cond_16
    invoke-virtual/range {p0 .. p0}, Ll/᩵ۙ᩻;->֡()Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Ll/᩵ۙ᩻;->ܶ()[B

    move-result-object v2

    invoke-static {v1, v2}, Ll/ᩳܰۡ;->֫(Ll/ܶ᩵ܿ;[B)Ll/ᩳܰۡ;

    move-result-object v11

    .line 298
    :try_start_2
    new-instance v12, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v12}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    const/high16 v1, 0x10000

    new-array v13, v1, [B

    .line 300
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_d
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ll/ۗ᩺ۡ;

    .line 301
    invoke-static {v0, v12}, Ll/ܿ֡ܳ;->֫(Ll/ۗ᩵ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    const/4 v6, 0x1

    move-object v1, v11

    move-object/from16 v2, p0

    move-object v4, v13

    move-object v5, v9

    move-object/from16 v7, p1

    move-object v8, v12

    .line 302
    invoke-static/range {v1 .. v8}, Ll/ܿ֡ܳ;->֫(Ll/ᩳܰۡ;Ll/᩵ۙ᩻;Ll/ۗ᩺ۡ;[BLl/ܰ᩵ܳ;ZLl/֨ۚܳ;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_d

    .line 304
    :cond_17
    invoke-virtual {v11}, Ll/ᩳܰۡ;->close()V

    .line 189
    :goto_e
    invoke-virtual {v9}, Ll/ܰ᩵ܳ;->ۧ()V

    .line 190
    invoke-virtual {v9}, Ll/ܰ᩵ܳ;->ܽ()V

    return-void

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 297
    :try_start_3
    invoke-virtual {v11}, Ll/ᩳܰۡ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_f

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_f
    throw v1

    :catch_1
    move-exception v0

    .line 162
    new-instance v1, Ll/ۤ᩵ܳ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v0}, Ll/ۤ᩵ܳ;-><init>(Ljava/lang/String;Ljava/io/IOException;)V

    throw v1
.end method

.method public static ֫(Ljava/lang/Exception;)Z
    .locals 3

    :goto_0
    if-eqz p0, :cond_3

    .line 796
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "unsupported"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 799
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 801
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "unsupported compression method"

    .line 802
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "unsupported encryption method"

    .line 803
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "unsupported method"

    .line 804
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "unsupportedmethod"

    .line 805
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "not implemented"

    .line 806
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "e_notimpl"

    .line 807
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "dictionary mismatch"

    .line 808
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "dictionary required"

    .line 809
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "requires a dictionary"

    .line 810
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    :goto_1
    const/4 p0, 0x1

    return p0

    .line 795
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    goto :goto_0

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method public static ۧ(JJ)J
    .locals 5

    const-wide v0, 0x7fffffffffffffffL

    sub-long v2, v0, p0

    cmp-long v4, p2, v2

    if-lez v4, :cond_0

    return-wide v0

    :cond_0
    add-long/2addr p0, p2

    return-wide p0
.end method

.method public static ۧ(Ll/ܰܺܳ;)Ll/֫֡ܳ;
    .locals 4

    .line 78
    invoke-static {p0}, Ll/ܿ֡ܳ;->ᩳ(Ll/ܰܺܳ;)Ljava/util/LinkedHashMap;

    move-result-object p0

    .line 79
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 80
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶ᩵ܿ;

    .line 81
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1}, Ll/ܿ֡ܳ;->ۧ(Ll/ܶ᩵ܿ;)Ll/۫᩵ܳ;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 83
    :cond_0
    new-instance p0, Ll/֫֡ܳ;

    .line 0
    new-instance v1, Ljava/util/HashMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    .line 83
    invoke-direct {p0, v0}, Ll/֫֡ܳ;-><init>(Ljava/util/Map;)V

    return-object p0
.end method

.method public static ۧ(Ll/ܶ᩵ܿ;)Ll/۫᩵ܳ;
    .locals 7

    .line 118
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 121
    new-instance v0, Ll/۫᩵ܳ;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v3

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v5

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Ll/۫᩵ܳ;-><init>(Ljava/lang/String;JJ)V

    return-object v0

    .line 119
    :cond_0
    new-instance v0, Ljava/io/FileNotFoundException;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ܽ(Ll/ܰܺܳ;)Ll/ܶ᩵ܿ;
    .locals 1

    .line 867
    instance-of v0, p0, Ll/᩵ۙ᩻;

    if-eqz v0, :cond_0

    check-cast p0, Ll/᩵ۙ᩻;

    .line 868
    invoke-virtual {p0}, Ll/᩵ۙ᩻;->֡()Ll/ܶ᩵ܿ;

    move-result-object p0

    return-object p0

    .line 870
    :cond_0
    instance-of v0, p0, Ll/ܿ᩸᩻;

    if-eqz v0, :cond_1

    check-cast p0, Ll/ܿ᩸᩻;

    .line 871
    invoke-virtual {p0}, Ll/ܿ᩸᩻;->ۖ()Ll/ܶ᩵ܿ;

    move-result-object p0

    return-object p0

    .line 873
    :cond_1
    instance-of v0, p0, Ll/ۖۛܳ;

    if-eqz v0, :cond_2

    check-cast p0, Ll/ۖۛܳ;

    .line 874
    invoke-virtual {p0}, Ll/ۖۛܳ;->ۖ()Ll/ܶ᩵ܿ;

    move-result-object p0

    return-object p0

    .line 876
    :cond_2
    instance-of v0, p0, Ll/ۨۛܳ;

    if-eqz v0, :cond_3

    check-cast p0, Ll/ۨۛܳ;

    .line 877
    invoke-virtual {p0}, Ll/ۨۛܳ;->ۜ()Ll/ܶ᩵ܿ;

    move-result-object p0

    return-object p0

    .line 879
    :cond_3
    new-instance p0, Ll/ᩳ֡ܳ;

    .line 1085
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 879
    throw p0
.end method

.method public static ܿ(Ll/ܰܺܳ;)Ljava/lang/String;
    .locals 0

    .line 73
    invoke-static {p0}, Ll/ܿ֡ܳ;->ܽ(Ll/ܰܺܳ;)Ll/ܶ᩵ܿ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ᩳ(Ll/ܰܺܳ;)Ljava/util/LinkedHashMap;
    .locals 6

    const-string v0, "Invalid ZIP split volume count: "

    .line 89
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 90
    invoke-static {p0}, Ll/ܿ֡ܳ;->ܽ(Ll/ܰܺܳ;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 91
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    instance-of v3, p0, Ll/᩵ۙ᩻;

    if-eqz v3, :cond_1

    move-object v3, p0

    check-cast v3, Ll/᩵ۙ᩻;

    invoke-virtual {v3}, Ll/᩵ۙ᩻;->᩹()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 94
    :try_start_0
    new-instance p0, Ll/۬ۜܽ;

    invoke-virtual {v3}, Ll/᩵ۙ᩻;->ܶ()[B

    move-result-object v3

    invoke-direct {p0, v3}, Ll/۬ۜܽ;-><init>([B)V

    .line 95
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v3

    if-lez v3, :cond_0

    const/16 v4, 0x2710

    if-gt v3, v4, :cond_0

    .line 99
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۢ֫()Ll/ܶ᩵ܿ;

    move-result-object v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v3, :cond_2

    .line 101
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    .line 102
    invoke-virtual {p0}, Ll/۬ۜܽ;->readLong()J

    .line 103
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 97
    :cond_0
    new-instance p0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    goto :goto_1

    :catch_1
    move-exception p0

    .line 106
    :goto_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid ZIP split metadata"

    invoke-direct {v0, v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 108
    :cond_1
    instance-of v0, p0, Ll/ۖۛܳ;

    if-eqz v0, :cond_2

    check-cast p0, Ll/ۖۛܳ;

    .line 109
    invoke-virtual {p0}, Ll/ۖۛܳ;->ᩴ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶ᩵ܿ;

    .line 110
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_2
    return-object v1
.end method
