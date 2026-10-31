.class public final Ll/ۙۧ֡;
.super Ljava/lang/Object;
.source "G4EL"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final ۙ:Ljava/util/logging/Logger;


# instance fields
.field public final ᩶:Ll/ۛܽ֡;

.field public final ᩸:Ll/᩶ۧ֡;

.field public final ᩹:Ll/֫ۧ֡;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 60
    const-class v0, Ll/ᩳۧ֡;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Ll/ۙۧ֡;->ۙ:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Ll/ۛܽ֡;)V
    .locals 1

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    iput-object p1, p0, Ll/ۙۧ֡;->᩶:Ll/ۛܽ֡;

    .line 73
    new-instance v0, Ll/᩶ۧ֡;

    invoke-direct {v0, p1}, Ll/᩶ۧ֡;-><init>(Ll/ۛܽ֡;)V

    iput-object v0, p0, Ll/ۙۧ֡;->᩸:Ll/᩶ۧ֡;

    .line 74
    new-instance p1, Ll/֫ۧ֡;

    invoke-direct {p1, v0}, Ll/֫ۧ֡;-><init>(Ll/֨ᩳ֡;)V

    iput-object p1, p0, Ll/ۙۧ֡;->᩹:Ll/֫ۧ֡;

    return-void
.end method

.method public static ֫(IBS)I
    .locals 1

    and-int/lit8 p1, p1, 0x8

    if-eqz p1, :cond_0

    add-int/lit8 p0, p0, -0x1

    :cond_0
    if-gt p2, p0, :cond_1

    sub-int/2addr p0, p2

    int-to-short p0, p0

    return p0

    .line 408
    :cond_1
    invoke-static {p2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 p2, 0x2

    new-array p2, p2, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p1, p2, v0

    const/4 p1, 0x1

    aput-object p0, p2, p1

    const-string p0, "PROTOCOL_ERROR padding %s > remaining length %s"

    invoke-static {p0, p2}, Ll/ᩳۧ֡;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static ֫(Ll/ۛܽ֡;)I
    .locals 2

    .line 399
    invoke-interface {p0}, Ll/ۛܽ֡;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x10

    .line 400
    invoke-interface {p0}, Ll/ۛܽ֡;->readByte()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    .line 401
    invoke-interface {p0}, Ll/ۛܽ֡;->readByte()B

    move-result p0

    and-int/lit16 p0, p0, 0xff

    or-int/2addr p0, v0

    return p0
.end method

.method private ֫(Ll/᩸ۧ֡;IBI)V
    .locals 10

    const/4 v1, 0x0

    if-eqz p4, :cond_9

    and-int/lit8 v0, p3, 0x1

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    const/4 v7, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v7, 0x0

    :goto_0
    and-int/lit8 v0, p3, 0x8

    if-eqz v0, :cond_1

    .line 173
    iget-object v0, p0, Ll/ۙۧ֡;->᩶:Ll/ۛܽ֡;

    invoke-interface {v0}, Ll/ۛܽ֡;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    int-to-short v0, v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    and-int/lit8 v3, p3, 0x20

    if-eqz v3, :cond_2

    .line 226
    iget-object v3, p0, Ll/ۙۧ֡;->᩶:Ll/ۛܽ֡;

    invoke-interface {v3}, Ll/ۛܽ֡;->readInt()I

    .line 229
    invoke-interface {v3}, Ll/ۛܽ֡;->readByte()B

    add-int/lit8 p2, p2, -0x5

    .line 180
    :cond_2
    invoke-static {p2, p3, v0}, Ll/ۙۧ֡;->֫(IBS)I

    move-result p2

    .line 189
    iget-object v3, p0, Ll/ۙۧ֡;->᩸:Ll/᩶ۧ֡;

    iput p2, v3, Ll/᩶ۧ֡;->᩹:I

    iput p2, v3, Ll/᩶ۧ֡;->᩶:I

    .line 190
    iput-short v0, v3, Ll/᩶ۧ֡;->ۙ:S

    .line 191
    iput-byte p3, v3, Ll/᩶ۧ֡;->᩸:B

    .line 192
    iput p4, v3, Ll/᩶ۧ֡;->۬:I

    .line 196
    iget-object p2, p0, Ll/ۙۧ֡;->᩹:Ll/֫ۧ֡;

    invoke-virtual {p2}, Ll/֫ۧ֡;->ܽ()V

    .line 197
    invoke-virtual {p2}, Ll/֫ۧ֡;->֫()Ljava/util/ArrayList;

    move-result-object p2

    .line 715
    iget-object p3, p1, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    if-eqz p4, :cond_3

    and-int/lit8 v0, p4, 0x1

    if-nez v0, :cond_3

    .line 716
    invoke-virtual {p3, p2, p4, v7}, Ll/᩹ۧ֡;->֫(Ljava/util/ArrayList;IZ)V

    return-void

    :cond_3
    move-object v0, p3

    .line 720
    monitor-enter v0

    .line 721
    :try_start_0
    iget-object p3, p1, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    invoke-virtual {p3, p4}, Ll/᩹ۧ֡;->֫(I)Ll/ۤۧ֡;

    move-result-object p3

    if-nez p3, :cond_7

    .line 725
    iget-object p3, p1, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    invoke-static {p3}, Ll/᩹ۧ֡;->ܳ(Ll/᩹ۧ֡;)Z

    move-result p3

    if-eqz p3, :cond_4

    monitor-exit v0

    return-void

    .line 728
    :cond_4
    iget-object p3, p1, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    iget v3, p3, Ll/᩹ۧ֡;->᩺:I

    if-gt p4, v3, :cond_5

    monitor-exit v0

    return-void

    .line 731
    :cond_5
    rem-int/lit8 v3, p4, 0x2

    iget p3, p3, Ll/᩹ۧ֡;->۟:I

    const/4 v9, 0x2

    rem-int/2addr p3, v9

    if-ne v3, p3, :cond_6

    monitor-exit v0

    return-void

    .line 734
    :cond_6
    invoke-static {p2}, Ll/᩶۟᩵;->֫(Ljava/util/ArrayList;)Ll/ۤܰ᩵;

    move-result-object v8

    .line 735
    new-instance p2, Ll/ۤۧ֡;

    iget-object v5, p1, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    const/4 v6, 0x0

    move-object v3, p2

    move v4, p4

    invoke-direct/range {v3 .. v8}, Ll/ۤۧ֡;-><init>(ILl/᩹ۧ֡;ZZLl/ۤܰ᩵;)V

    .line 737
    iget-object p3, p1, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    iput p4, p3, Ll/᩹ۧ֡;->᩺:I

    .line 738
    iget-object p3, p3, Ll/᩹ۧ֡;->ۜ֫:Ljava/util/LinkedHashMap;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {p3, v3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 739
    invoke-static {}, Ll/᩹ۧ֡;->ܳ()Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object p3

    new-instance v3, Ll/֨ۧ֡;

    iget-object v4, p1, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    iget-object v4, v4, Ll/᩹ۧ֡;->ۤ:Ljava/lang/String;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    new-array v5, v9, [Ljava/lang/Object;

    aput-object v4, v5, v1

    aput-object p4, v5, v2

    invoke-direct {v3, p1, v5, p2}, Ll/֨ۧ֡;-><init>(Ll/᩸ۧ֡;[Ljava/lang/Object;Ll/ۤۧ֡;)V

    invoke-virtual {p3, v3}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 752
    monitor-exit v0

    return-void

    .line 754
    :cond_7
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 757
    invoke-virtual {p3, p2}, Ll/ۤۧ֡;->֫(Ljava/util/ArrayList;)V

    if-eqz v7, :cond_8

    .line 758
    invoke-virtual {p3}, Ll/ۤۧ֡;->᩻()V

    :cond_8
    return-void

    :catchall_0
    move-exception p1

    .line 754
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_9
    const-string p1, "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"

    new-array p2, v1, [Ljava/lang/Object;

    .line 169
    invoke-static {p1, p2}, Ll/ᩳۧ֡;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method private ֫(Ll/᩸ۧ֡;II)V
    .locals 5

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/16 v0, 0x8

    if-lt p2, v0, :cond_5

    if-nez p3, :cond_4

    .line 319
    iget-object p3, p0, Ll/ۙۧ֡;->᩶:Ll/ۛܽ֡;

    invoke-interface {p3}, Ll/ۛܽ֡;->readInt()I

    move-result p3

    .line 320
    iget-object v4, p0, Ll/ۙۧ֡;->᩶:Ll/ۛܽ֡;

    invoke-interface {v4}, Ll/ۛܽ֡;->readInt()I

    move-result v4

    sub-int/2addr p2, v0

    .line 322
    invoke-static {v4}, Ll/ܰ֫֡;->֫(I)Ll/ܰ֫֡;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 326
    sget-object v0, Ll/ۨܽ֡;->ۙ:Ll/ۨܽ֡;

    if-lez p2, :cond_0

    .line 328
    iget-object v0, p0, Ll/ۙۧ֡;->᩶:Ll/ۛܽ֡;

    int-to-long v1, p2

    invoke-interface {v0, v1, v2}, Ll/ۛܽ֡;->ۜ(J)Ll/ۨܽ֡;

    move-result-object v0

    .line 847
    :cond_0
    invoke-virtual {v0}, Ll/ۨܽ֡;->᩷()I

    .line 852
    iget-object p2, p1, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    move-object v0, p2

    monitor-enter v0

    .line 853
    :try_start_0
    iget-object p2, p1, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    iget-object p2, p2, Ll/᩹ۧ֡;->ۜ֫:Ljava/util/LinkedHashMap;

    invoke-virtual {p2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p2

    iget-object v1, p1, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    iget-object v1, v1, Ll/᩹ۧ֡;->ۜ֫:Ljava/util/LinkedHashMap;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    new-array v1, v1, [Ll/ۤۧ֡;

    invoke-interface {p2, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ll/ۤۧ֡;

    .line 854
    iget-object v1, p1, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    invoke-static {v1}, Ll/᩹ۧ֡;->᩻(Ll/᩹ۧ֡;)V

    .line 855
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 858
    array-length v0, p2

    :goto_0
    if-ge v3, v0, :cond_2

    aget-object v1, p2, v3

    .line 105
    iget v2, v1, Ll/ۤۧ֡;->ܳ:I

    if-le v2, p3, :cond_1

    .line 859
    invoke-virtual {v1}, Ll/ۤۧ֡;->ܿ()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 860
    sget-object v2, Ll/ܰ֫֡;->۟:Ll/ܰ֫֡;

    invoke-virtual {v1, v2}, Ll/ۤۧ֡;->ܽ(Ll/ܰ֫֡;)V

    .line 861
    iget-object v2, p1, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    .line 105
    iget v1, v1, Ll/ۤۧ֡;->ܳ:I

    .line 861
    invoke-virtual {v2, v1}, Ll/᩹ۧ֡;->ۧ(I)Ll/ۤۧ֡;

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-void

    :catchall_0
    move-exception p1

    .line 855
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_3
    const-string p1, "TYPE_GOAWAY unexpected error code: %d"

    .line 324
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    new-array p3, v1, [Ljava/lang/Object;

    aput-object p2, p3, v3

    invoke-static {p1, p3}, Ll/ᩳۧ֡;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v2

    :cond_4
    const-string p1, "TYPE_GOAWAY streamId != 0"

    new-array p2, v3, [Ljava/lang/Object;

    .line 318
    invoke-static {p1, p2}, Ll/ᩳۧ֡;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v2

    :cond_5
    const-string p1, "TYPE_GOAWAY length < 8: %s"

    .line 317
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    new-array p3, v1, [Ljava/lang/Object;

    aput-object p2, p3, v3

    invoke-static {p1, p3}, Ll/ᩳۧ֡;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v2
.end method

.method private ۧ(Ll/᩸ۧ֡;IBI)V
    .locals 4

    const/16 v0, 0x8

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne p2, v0, :cond_5

    if-nez p4, :cond_4

    .line 309
    iget-object p2, p0, Ll/ۙۧ֡;->᩶:Ll/ۛܽ֡;

    invoke-interface {p2}, Ll/ۛܽ֡;->readInt()I

    move-result p2

    .line 310
    iget-object p4, p0, Ll/ۙۧ֡;->᩶:Ll/ۛܽ֡;

    invoke-interface {p4}, Ll/ۛܽ֡;->readInt()I

    move-result p4

    and-int/2addr p3, v3

    if-eqz p3, :cond_3

    .line 826
    iget-object p3, p1, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    move-object v0, p3

    monitor-enter v0

    if-ne p2, v3, :cond_0

    .line 828
    :try_start_0
    iget-object p1, p1, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    invoke-static {p1}, Ll/᩹ۧ֡;->ܽ(Ll/᩹ۧ֡;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 p3, 0x2

    if-ne p2, p3, :cond_1

    .line 830
    iget-object p1, p1, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    invoke-static {p1}, Ll/᩹ۧ֡;->᩷(Ll/᩹ۧ֡;)V

    goto :goto_0

    :cond_1
    const/4 p3, 0x3

    if-ne p2, p3, :cond_2

    .line 832
    iget-object p2, p1, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    invoke-static {p2}, Ll/᩹ۧ֡;->ۢ(Ll/᩹ۧ֡;)V

    .line 833
    iget-object p1, p1, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 835
    :cond_2
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 839
    :cond_3
    :try_start_1
    iget-object p3, p1, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    invoke-static {p3}, Ll/᩹ۧ֡;->ۜ(Ll/᩹ۧ֡;)Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object p3

    new-instance v0, Ll/ۚۧ֡;

    iget-object p1, p1, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    invoke-direct {v0, p1, p2, p4}, Ll/ۚۧ֡;-><init>(Ll/᩹ۧ֡;II)V

    invoke-virtual {p3, v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void

    :cond_4
    const-string p1, "TYPE_PING streamId != 0"

    new-array p2, v2, [Ljava/lang/Object;

    .line 308
    invoke-static {p1, p2}, Ll/ᩳۧ֡;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v1

    :cond_5
    const-string p1, "TYPE_PING length != 8: %s"

    .line 307
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    new-array p3, v3, [Ljava/lang/Object;

    aput-object p2, p3, v2

    invoke-static {p1, p3}, Ll/ᩳۧ֡;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v1
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 342
    iget-object v0, p0, Ll/ۙۧ֡;->᩶:Ll/ۛܽ֡;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public final ֫(ZLl/᩸ۧ֡;)Z
    .locals 12

    const/4 v0, 0x0

    .line 95
    :try_start_0
    iget-object v1, p0, Ll/ۙۧ֡;->᩶:Ll/ۛܽ֡;

    const-wide/16 v2, 0x9

    invoke-interface {v1, v2, v3}, Ll/ۛܽ֡;->ܿ(J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 111
    iget-object v1, p0, Ll/ۙۧ֡;->᩶:Ll/ۛܽ֡;

    invoke-static {v1}, Ll/ۙۧ֡;->֫(Ll/ۛܽ֡;)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ltz v1, :cond_24

    const/16 v4, 0x4000

    if-gt v1, v4, :cond_24

    .line 115
    iget-object v5, p0, Ll/ۙۧ֡;->᩶:Ll/ۛܽ֡;

    invoke-interface {v5}, Ll/ۛܽ֡;->readByte()B

    move-result v5

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    const/4 v6, 0x4

    if-eqz p1, :cond_1

    if-ne v5, v6, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "Expected a SETTINGS frame but was %s"

    .line 117
    invoke-static {v5}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p2

    new-array v1, v3, [Ljava/lang/Object;

    aput-object p2, v1, v0

    invoke-static {p1, v1}, Ll/ᩳۧ֡;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v2

    .line 119
    :cond_1
    :goto_0
    iget-object p1, p0, Ll/ۙۧ֡;->᩶:Ll/ۛܽ֡;

    invoke-interface {p1}, Ll/ۛܽ֡;->readByte()B

    move-result p1

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    .line 120
    iget-object v7, p0, Ll/ۙۧ֡;->᩶:Ll/ۛܽ֡;

    invoke-interface {v7}, Ll/ۛܽ֡;->readInt()I

    move-result v7

    const v8, 0x7fffffff

    and-int v9, v7, v8

    .line 121
    sget-object v10, Ll/ۙۧ֡;->ۙ:Ljava/util/logging/Logger;

    sget-object v11, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v10, v11}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v11

    if-eqz v11, :cond_2

    invoke-static {v3, v9, v1, v5, p1}, Ll/ᩳۧ֡;->֫(ZIIBB)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_2
    const/4 v10, 0x5

    packed-switch v5, :pswitch_data_0

    .line 162
    iget-object p1, p0, Ll/ۙۧ֡;->᩶:Ll/ۛܽ֡;

    int-to-long v0, v1

    invoke-interface {p1, v0, v1}, Ll/ۛܽ֡;->skip(J)V

    return v3

    :pswitch_0
    if-ne v1, v6, :cond_6

    .line 336
    iget-object p1, p0, Ll/ۙۧ֡;->᩶:Ll/ۛܽ֡;

    invoke-interface {p1}, Ll/ۛܽ֡;->readInt()I

    move-result p1

    int-to-long v4, p1

    const-wide/32 v6, 0x7fffffff

    and-long/2addr v4, v6

    const-wide/16 v6, 0x0

    cmp-long p1, v4, v6

    if-eqz p1, :cond_5

    if-nez v9, :cond_3

    .line 868
    iget-object p1, p2, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    move-object v0, p1

    monitor-enter v0

    .line 869
    :try_start_1
    iget-object p1, p2, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    iget-wide v1, p1, Ll/᩹ۧ֡;->᩹:J

    add-long/2addr v1, v4

    iput-wide v1, p1, Ll/᩹ۧ֡;->᩹:J

    .line 870
    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 871
    monitor-exit v0

    return v3

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 873
    :cond_3
    iget-object p2, p2, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    invoke-virtual {p2, v9}, Ll/᩹ۧ֡;->֫(I)Ll/ۤۧ֡;

    move-result-object p2

    if-eqz p2, :cond_17

    move-object v0, p2

    .line 875
    monitor-enter v0

    .line 634
    :try_start_2
    iget-wide v1, p2, Ll/ۤۧ֡;->֫:J

    add-long/2addr v1, v4

    iput-wide v1, p2, Ll/ۤۧ֡;->֫:J

    if-lez p1, :cond_4

    .line 635
    invoke-virtual {p2}, Ljava/lang/Object;->notifyAll()V

    .line 877
    :cond_4
    monitor-exit v0

    return v3

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    :cond_5
    const-string p1, "windowSizeIncrement was 0"

    .line 337
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    new-array v1, v3, [Ljava/lang/Object;

    aput-object p2, v1, v0

    invoke-static {p1, v1}, Ll/ᩳۧ֡;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v2

    :cond_6
    const-string p1, "TYPE_WINDOW_UPDATE length !=4: %s"

    .line 335
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    new-array v1, v3, [Ljava/lang/Object;

    aput-object p2, v1, v0

    invoke-static {p1, v1}, Ll/ᩳۧ֡;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v2

    .line 153
    :pswitch_1
    invoke-direct {p0, p2, v1, v9}, Ll/ۙۧ֡;->֫(Ll/᩸ۧ֡;II)V

    return v3

    .line 149
    :pswitch_2
    invoke-direct {p0, p2, v1, p1, v9}, Ll/ۙۧ֡;->ۧ(Ll/᩸ۧ֡;IBI)V

    return v3

    .line 294
    :pswitch_3
    iget-object v4, p0, Ll/ۙۧ֡;->᩶:Ll/ۛܽ֡;

    if-eqz v9, :cond_8

    and-int/lit8 v2, p1, 0x8

    if-eqz v2, :cond_7

    .line 297
    invoke-interface {v4}, Ll/ۛܽ֡;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    int-to-short v0, v0

    .line 298
    :cond_7
    invoke-interface {v4}, Ll/ۛܽ֡;->readInt()I

    move-result v2

    and-int/2addr v2, v8

    add-int/lit8 v1, v1, -0x4

    .line 300
    invoke-static {v1, p1, v0}, Ll/ۙۧ֡;->֫(IBS)I

    move-result v1

    .line 189
    iget-object v4, p0, Ll/ۙۧ֡;->᩸:Ll/᩶ۧ֡;

    iput v1, v4, Ll/᩶ۧ֡;->᩹:I

    iput v1, v4, Ll/᩶ۧ֡;->᩶:I

    .line 190
    iput-short v0, v4, Ll/᩶ۧ֡;->ۙ:S

    .line 191
    iput-byte p1, v4, Ll/᩶ۧ֡;->᩸:B

    .line 192
    iput v9, v4, Ll/᩶ۧ֡;->۬:I

    .line 196
    iget-object p1, p0, Ll/ۙۧ֡;->᩹:Ll/֫ۧ֡;

    invoke-virtual {p1}, Ll/֫ۧ֡;->ܽ()V

    .line 197
    invoke-virtual {p1}, Ll/֫ۧ֡;->֫()Ljava/util/ArrayList;

    move-result-object p1

    .line 889
    iget-object p2, p2, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    invoke-virtual {p2, p1, v2}, Ll/᩹ۧ֡;->֫(Ljava/util/ArrayList;I)V

    return v3

    :cond_8
    const-string p1, "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"

    new-array p2, v0, [Ljava/lang/Object;

    .line 295
    invoke-static {p1, p2}, Ll/ᩳۧ֡;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v2

    .line 247
    :pswitch_4
    iget-object v5, p0, Ll/ۙۧ֡;->᩶:Ll/ۛܽ֡;

    if-nez v9, :cond_15

    and-int/2addr p1, v3

    if-eqz p1, :cond_a

    if-nez v1, :cond_9

    goto/16 :goto_3

    :cond_9
    const-string p1, "FRAME_SIZE_ERROR ack frame should be empty!"

    new-array p2, v0, [Ljava/lang/Object;

    .line 249
    invoke-static {p1, p2}, Ll/ᩳۧ֡;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v2

    .line 254
    :cond_a
    rem-int/lit8 p1, v1, 0x6

    if-nez p1, :cond_14

    .line 255
    new-instance p1, Ll/֫ܽ֡;

    invoke-direct {p1}, Ll/֫ܽ֡;-><init>()V

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v1, :cond_13

    .line 257
    invoke-interface {v5}, Ll/ۛܽ֡;->readShort()S

    move-result v8

    const v9, 0xffff

    and-int/2addr v8, v9

    .line 258
    invoke-interface {v5}, Ll/ۛܽ֡;->readInt()I

    move-result v9

    const/4 v11, 0x2

    if-eq v8, v11, :cond_10

    const/4 v11, 0x3

    if-eq v8, v11, :cond_f

    if-eq v8, v6, :cond_d

    if-eq v8, v10, :cond_b

    goto :goto_2

    :cond_b
    if-lt v9, v4, :cond_c

    const v11, 0xffffff

    if-gt v9, v11, :cond_c

    goto :goto_2

    :cond_c
    const-string p1, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s"

    .line 279
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    new-array v1, v3, [Ljava/lang/Object;

    aput-object p2, v1, v0

    invoke-static {p1, v1}, Ll/ᩳۧ֡;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v2

    :cond_d
    if-ltz v9, :cond_e

    const/4 v8, 0x7

    goto :goto_2

    :cond_e
    const-string p1, "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"

    new-array p2, v0, [Ljava/lang/Object;

    .line 274
    invoke-static {p1, p2}, Ll/ᩳۧ֡;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v2

    :cond_f
    const/4 v8, 0x4

    goto :goto_2

    :cond_10
    if-eqz v9, :cond_12

    if-ne v9, v3, :cond_11

    goto :goto_2

    :cond_11
    const-string p1, "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"

    new-array p2, v0, [Ljava/lang/Object;

    .line 265
    invoke-static {p1, p2}, Ll/ᩳۧ֡;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v2

    .line 287
    :cond_12
    :goto_2
    invoke-virtual {p1, v8, v9}, Ll/֫ܽ֡;->֫(II)V

    add-int/lit8 v7, v7, 0x6

    goto :goto_1

    .line 774
    :cond_13
    iget-object v1, p2, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    :try_start_3
    invoke-static {v1}, Ll/᩹ۧ֡;->ۜ(Ll/᩹ۧ֡;)Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object v2

    new-instance v4, Ll/۠ۧ֡;

    iget-object v1, v1, Ll/᩹ۧ֡;->ۤ:Ljava/lang/String;

    new-array v5, v3, [Ljava/lang/Object;

    aput-object v1, v5, v0

    invoke-direct {v4, p2, v5, p1}, Ll/۠ۧ֡;-><init>(Ll/᩸ۧ֡;[Ljava/lang/Object;Ll/֫ܽ֡;)V

    invoke-virtual {v2, v4}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_3
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_3

    :cond_14
    const-string p1, "TYPE_SETTINGS length %% 6 != 0: %s"

    .line 254
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    new-array v1, v3, [Ljava/lang/Object;

    aput-object p2, v1, v0

    invoke-static {p1, v1}, Ll/ᩳۧ֡;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v2

    :cond_15
    const-string p1, "TYPE_SETTINGS streamId != 0"

    new-array p2, v0, [Ljava/lang/Object;

    .line 247
    invoke-static {p1, p2}, Ll/ᩳۧ֡;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v2

    :pswitch_5
    if-ne v1, v6, :cond_1a

    if-eqz v9, :cond_19

    .line 237
    iget-object p1, p0, Ll/ۙۧ֡;->᩶:Ll/ۛܽ֡;

    invoke-interface {p1}, Ll/ۛܽ֡;->readInt()I

    move-result p1

    .line 238
    invoke-static {p1}, Ll/ܰ֫֡;->֫(I)Ll/ܰ֫֡;

    move-result-object v1

    if-eqz v1, :cond_18

    .line 762
    iget-object p1, p2, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    if-eqz v9, :cond_16

    and-int/lit8 p2, v7, 0x1

    if-nez p2, :cond_16

    .line 763
    invoke-virtual {p1, v9, v1}, Ll/᩹ۧ֡;->֫(ILl/ܰ֫֡;)V

    return v3

    .line 766
    :cond_16
    invoke-virtual {p1, v9}, Ll/᩹ۧ֡;->ۧ(I)Ll/ۤۧ֡;

    move-result-object p1

    if-eqz p1, :cond_17

    .line 768
    invoke-virtual {p1, v1}, Ll/ۤۧ֡;->ܽ(Ll/ܰ֫֡;)V

    :catch_0
    :cond_17
    :goto_3
    return v3

    :cond_18
    const-string p2, "TYPE_RST_STREAM unexpected error code: %d"

    .line 240
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array v1, v3, [Ljava/lang/Object;

    aput-object p1, v1, v0

    invoke-static {p2, v1}, Ll/ᩳۧ֡;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v2

    :cond_19
    const-string p1, "TYPE_RST_STREAM streamId == 0"

    new-array p2, v0, [Ljava/lang/Object;

    .line 236
    invoke-static {p1, p2}, Ll/ᩳۧ֡;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v2

    :cond_1a
    const-string p1, "TYPE_RST_STREAM length: %d != 4"

    .line 235
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    new-array v1, v3, [Ljava/lang/Object;

    aput-object p2, v1, v0

    invoke-static {p1, v1}, Ll/ᩳۧ֡;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v2

    :pswitch_6
    if-ne v1, v10, :cond_1c

    if-eqz v9, :cond_1b

    .line 226
    iget-object p1, p0, Ll/ۙۧ֡;->᩶:Ll/ۛܽ֡;

    invoke-interface {p1}, Ll/ۛܽ֡;->readInt()I

    .line 229
    invoke-interface {p1}, Ll/ۛܽ֡;->readByte()B

    return v3

    :cond_1b
    const-string p1, "TYPE_PRIORITY streamId == 0"

    new-array p2, v0, [Ljava/lang/Object;

    .line 221
    invoke-static {p1, p2}, Ll/ᩳۧ֡;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v2

    :cond_1c
    const-string p1, "TYPE_PRIORITY length: %d != 5"

    .line 220
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    new-array v1, v3, [Ljava/lang/Object;

    aput-object p2, v1, v0

    invoke-static {p1, v1}, Ll/ᩳۧ֡;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v2

    .line 129
    :pswitch_7
    invoke-direct {p0, p2, v1, p1, v9}, Ll/ۙۧ֡;->֫(Ll/᩸ۧ֡;IBI)V

    return v3

    .line 202
    :pswitch_8
    iget-object v4, p0, Ll/ۙۧ֡;->᩶:Ll/ۛܽ֡;

    if-eqz v9, :cond_23

    and-int/lit8 v5, p1, 0x1

    if-eqz v5, :cond_1d

    const/4 v5, 0x1

    goto :goto_4

    :cond_1d
    const/4 v5, 0x0

    :goto_4
    and-int/lit8 v6, p1, 0x20

    if-nez v6, :cond_22

    and-int/lit8 v2, p1, 0x8

    if-eqz v2, :cond_1e

    .line 211
    invoke-interface {v4}, Ll/ۛܽ֡;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    int-to-short v0, v0

    .line 212
    :cond_1e
    invoke-static {v1, p1, v0}, Ll/ۙۧ֡;->֫(IBS)I

    move-result p1

    .line 696
    iget-object p2, p2, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    if-eqz v9, :cond_1f

    and-int/lit8 v1, v7, 0x1

    if-nez v1, :cond_1f

    .line 697
    invoke-virtual {p2, v9, v4, p1, v5}, Ll/᩹ۧ֡;->֫(ILl/ۛܽ֡;IZ)V

    goto :goto_5

    .line 700
    :cond_1f
    invoke-virtual {p2, v9}, Ll/᩹ۧ֡;->֫(I)Ll/ۤۧ֡;

    move-result-object v1

    if-nez v1, :cond_20

    .line 702
    sget-object v1, Ll/ܰ֫֡;->ܰ:Ll/ܰ֫֡;

    invoke-virtual {p2, v9, v1}, Ll/᩹ۧ֡;->ۧ(ILl/ܰ֫֡;)V

    int-to-long v1, p1

    .line 703
    invoke-virtual {p2, v1, v2}, Ll/᩹ۧ֡;->ᩳ(J)V

    .line 704
    invoke-interface {v4, v1, v2}, Ll/ۛܽ֡;->skip(J)V

    goto :goto_5

    .line 707
    :cond_20
    invoke-virtual {v1, v4, p1}, Ll/ۤۧ֡;->֫(Ll/ۛܽ֡;I)V

    if-eqz v5, :cond_21

    .line 709
    invoke-virtual {v1}, Ll/ۤۧ֡;->᩻()V

    :cond_21
    :goto_5
    int-to-long p1, v0

    .line 215
    invoke-interface {v4, p1, p2}, Ll/ۛܽ֡;->skip(J)V

    return v3

    :cond_22
    const-string p1, "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"

    new-array p2, v0, [Ljava/lang/Object;

    .line 208
    invoke-static {p1, p2}, Ll/ᩳۧ֡;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v2

    :cond_23
    const-string p1, "PROTOCOL_ERROR: TYPE_DATA streamId == 0"

    new-array p2, v0, [Ljava/lang/Object;

    .line 202
    invoke-static {p1, p2}, Ll/ᩳۧ֡;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v2

    :cond_24
    const-string p1, "FRAME_SIZE_ERROR: %s"

    .line 113
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    new-array v1, v3, [Ljava/lang/Object;

    aput-object p2, v1, v0

    invoke-static {p1, v1}, Ll/ᩳۧ֡;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v2

    :catch_1
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
