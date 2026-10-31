.class public final Ll/᩵֡ۢ;
.super Ljava/lang/Object;
.source "T7B2"


# static fields
.field public static final ۖ:[B

.field public static final ۘ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static final ۡ:J

.field public static final synthetic ۢ:I

.field public static final ܺ:J


# instance fields
.field public final ֫:Ljava/util/LinkedHashMap;

.field public final ۜ:Ll/᩶۫᩷;

.field public ۧ:Ljava/util/concurrent/ScheduledExecutorService;

.field public ܳ:Z

.field public ܽ:Ljava/util/concurrent/ScheduledFuture;

.field public final ܿ:Ljava/lang/Object;

.field public ᩳ:J

.field public final ᩷:Ll/ܺ֡ۢ;

.field public final ᩻:Ll/ۢ֡ۢ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 40
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1e

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Ll/᩵֡ۢ;->ܺ:J

    .line 41
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xa

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Ll/᩵֡ۢ;->ۡ:J

    const/4 v0, 0x1

    new-array v0, v0, [B

    const/4 v1, 0x0

    aput-byte v1, v0, v1

    .line 44
    sput-object v0, Ll/᩵֡ۢ;->ۖ:[B

    .line 45
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Ll/᩵֡ۢ;->ۘ:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public constructor <init>(Ll/֫ۚۢ;)V
    .locals 3

    .line 61
    new-instance v0, Ll/ۢ֡ۢ;

    .line 63
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    new-instance v1, Ll/᩶۫᩷;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-direct {v0, p1, v1}, Ll/ۢ֡ۢ;-><init>(Landroid/content/Context;Ll/᩶۫᩷;)V

    new-instance p1, Ll/ܺ֡ۢ;

    .line 706
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 63
    new-instance v1, Ll/᩶۫᩷;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    new-instance v2, Ljava/lang/Object;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v2, p0, Ll/᩵֡ۢ;->ܿ:Ljava/lang/Object;

    .line 48
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v2, p0, Ll/᩵֡ۢ;->֫:Ljava/util/LinkedHashMap;

    .line 74
    iput-object v0, p0, Ll/᩵֡ۢ;->᩻:Ll/ۢ֡ۢ;

    .line 75
    iput-object p1, p0, Ll/᩵֡ۢ;->᩷:Ll/ܺ֡ۢ;

    .line 76
    iput-object v1, p0, Ll/᩵֡ۢ;->ۜ:Ll/᩶۫᩷;

    return-void
.end method

.method public static bridge synthetic ֫(I)Ljava/net/InetAddress;
    .locals 0

    .line 0
    invoke-static {p0}, Ll/᩵֡ۢ;->ۧ(I)Ljava/net/InetAddress;

    move-result-object p0

    return-object p0
.end method

.method private ֫(Ll/ᩴ֡ۢ;J)Ljava/util/ArrayList;
    .locals 9

    .line 217
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 218
    iget-object v0, p0, Ll/᩵֡ۢ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 219
    :try_start_0
    iget-object v2, p0, Ll/᩵֡ۢ;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 220
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    .line 221
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۡ֡ۢ;

    .line 222
    invoke-static {v3}, Ll/ۡ֡ۢ;->ۧ(Ll/ۡ֡ۢ;)J

    move-result-wide v4

    sub-long v4, p2, v4

    sget-wide v6, Ll/᩵֡ۢ;->ۡ:J

    cmp-long v8, v4, v6

    if-gtz v8, :cond_5

    invoke-static {v3}, Ll/ۡ֡ۢ;->֫(Ll/ۡ֡ۢ;)Ljava/net/InetAddress;

    move-result-object v4

    .line 356
    invoke-static {v4}, Ll/᩵֡ۢ;->ᩳ(Ljava/net/InetAddress;)Z

    move-result v5

    const/4 v6, 0x0

    if-nez v5, :cond_0

    goto :goto_1

    .line 359
    :cond_0
    iget-object v5, p1, Ll/ᩴ֡ۢ;->ᩳ:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_2

    .line 360
    iget-object v5, p1, Ll/ᩴ֡ۢ;->ᩳ:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۘ֡ۢ;

    .line 361
    invoke-virtual {v7, v4}, Ll/ۘ֡ۢ;->֫(Ljava/net/InetAddress;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v6, 0x1

    goto :goto_1

    .line 367
    :cond_2
    invoke-virtual {v4}, Ljava/net/InetAddress;->isSiteLocalAddress()Z

    move-result v6

    :cond_3
    :goto_1
    if-nez v6, :cond_4

    goto :goto_2

    .line 226
    :cond_4
    invoke-static {v3}, Ll/ۡ֡ۢ;->֫(Ll/ۡ֡ۢ;)Ljava/net/InetAddress;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 223
    :cond_5
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 228
    :cond_6
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public static ֫(Ll/᩵֡ۢ;J)V
    .locals 6

    .line 167
    invoke-direct {p0, p1, p2}, Ll/᩵֡ۢ;->֫(J)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_4

    .line 197
    :cond_0
    :try_start_0
    iget-object v0, p0, Ll/᩵֡ۢ;->᩻:Ll/ۢ֡ۢ;

    invoke-virtual {v0}, Ll/ۢ֡ۢ;->֫()Ll/ᩴ֡ۢ;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 468
    :catch_0
    new-instance v0, Ll/ᩴ֡ۢ;

    const/4 v1, 0x0

    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {v0, v1, v1, v1, v2}, Ll/ᩴ֡ۢ;-><init>(Ljava/net/InetAddress;Ljava/net/InetAddress;Ljava/net/InetAddress;Ljava/util/List;)V

    :goto_0
    move-object v1, v0

    .line 171
    iget-object v0, p0, Ll/᩵֡ۢ;->ۜ:Ll/᩶۫᩷;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    .line 172
    iget-object v0, v1, Ll/ᩴ֡ۢ;->ܽ:Ljava/net/InetAddress;

    if-nez v0, :cond_3

    .line 208
    iget-object p1, p0, Ll/᩵֡ۢ;->ܿ:Ljava/lang/Object;

    move-object v0, p1

    monitor-enter v0

    .line 263
    :try_start_1
    iget-object p0, p0, Ll/᩵֡ۢ;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 264
    :cond_1
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 265
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۡ֡ۢ;

    .line 266
    invoke-static {p1}, Ll/ۡ֡ۢ;->ۧ(Ll/ۡ֡ۢ;)J

    move-result-wide p1

    sub-long p1, v2, p1

    sget-wide v4, Ll/᩵֡ۢ;->ۡ:J

    cmp-long v1, p1, v4

    if-lez v1, :cond_1

    .line 267
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    .line 210
    :cond_2
    monitor-exit v0

    goto :goto_4

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    .line 177
    :cond_3
    invoke-direct {p0, v1, v2, v3}, Ll/᩵֡ۢ;->֫(Ll/ᩴ֡ۢ;J)Ljava/util/ArrayList;

    move-result-object v0

    .line 178
    iget-object v2, v1, Ll/ᩴ֡ۢ;->ۧ:Ljava/net/InetAddress;

    if-eqz v2, :cond_4

    .line 245
    invoke-direct {p0, p1, p2}, Ll/᩵֡ۢ;->֫(J)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 179
    iget-object v2, v1, Ll/ᩴ֡ۢ;->ܽ:Ljava/net/InetAddress;

    iget-object v3, v1, Ll/ᩴ֡ۢ;->ۧ:Ljava/net/InetAddress;

    .line 253
    :try_start_2
    iget-object v4, p0, Ll/᩵֡ۢ;->᩷:Ll/ܺ֡ۢ;

    invoke-virtual {v4, v2, v3}, Ll/ܺ֡ۢ;->֫(Ljava/net/InetAddress;Ljava/net/InetAddress;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    :catch_1
    nop

    .line 181
    :cond_4
    :goto_2
    iget-object v2, v1, Ll/ᩴ֡ۢ;->֫:Ljava/net/InetAddress;

    if-eqz v2, :cond_5

    .line 245
    invoke-direct {p0, p1, p2}, Ll/᩵֡ۢ;->֫(J)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 182
    iget-object v2, v1, Ll/ᩴ֡ۢ;->ܽ:Ljava/net/InetAddress;

    iget-object v3, v1, Ll/ᩴ֡ۢ;->֫:Ljava/net/InetAddress;

    .line 253
    :try_start_3
    iget-object v4, p0, Ll/᩵֡ۢ;->᩷:Ll/ܺ֡ۢ;

    invoke-virtual {v4, v2, v3}, Ll/ܺ֡ۢ;->֫(Ljava/net/InetAddress;Ljava/net/InetAddress;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_2

    .line 184
    :catch_2
    :cond_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/net/InetAddress;

    .line 245
    invoke-direct {p0, p1, p2}, Ll/᩵֡ۢ;->֫(J)Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_4

    .line 188
    :cond_6
    iget-object v3, v1, Ll/ᩴ֡ۢ;->ܽ:Ljava/net/InetAddress;

    .line 253
    :try_start_4
    iget-object v4, p0, Ll/᩵֡ۢ;->᩷:Ll/ܺ֡ۢ;

    invoke-virtual {v4, v3, v2}, Ll/ܺ֡ۢ;->֫(Ljava/net/InetAddress;Ljava/net/InetAddress;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_3

    :catch_3
    nop

    goto :goto_3

    :cond_7
    :goto_4
    return-void
.end method

.method private ֫(J)Z
    .locals 4

    .line 236
    iget-object v0, p0, Ll/᩵֡ۢ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 237
    :try_start_0
    iget-boolean v1, p0, Ll/᩵֡ۢ;->ܳ:Z

    if-eqz v1, :cond_0

    iget-wide v1, p0, Ll/᩵֡ۢ;->ᩳ:J

    cmp-long v3, v1, p1

    if-nez v3, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 238
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public static ֫(Ljava/net/InetAddress;)Z
    .locals 1

    .line 385
    instance-of v0, p0, Ljava/net/Inet4Address;

    if-eqz v0, :cond_0

    .line 386
    invoke-virtual {p0}, Ljava/net/InetAddress;->isAnyLocalAddress()Z

    move-result v0

    if-nez v0, :cond_0

    .line 387
    invoke-virtual {p0}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    move-result v0

    if-nez v0, :cond_0

    .line 388
    invoke-virtual {p0}, Ljava/net/InetAddress;->isMulticastAddress()Z

    move-result v0

    if-nez v0, :cond_0

    .line 389
    invoke-virtual {p0}, Ljava/net/InetAddress;->isLinkLocalAddress()Z

    move-result v0

    if-nez v0, :cond_0

    .line 390
    invoke-static {p0}, Ll/᩵֡ۢ;->ܽ(Ljava/net/InetAddress;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static bridge synthetic ۧ(Ljava/net/InetAddress;)I
    .locals 0

    .line 0
    invoke-static {p0}, Ll/᩵֡ۢ;->ܿ(Ljava/net/InetAddress;)I

    move-result p0

    return p0
.end method

.method public static ۧ(I)Ljava/net/InetAddress;
    .locals 6

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    and-int/lit16 v1, p0, 0xff

    int-to-byte v1, v1

    shr-int/lit8 v2, p0, 0x8

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    shr-int/lit8 v3, p0, 0x10

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    shr-int/lit8 p0, p0, 0x18

    and-int/lit16 p0, p0, 0xff

    int-to-byte p0, p0

    const/4 v4, 0x4

    new-array v4, v4, [B

    const/4 v5, 0x0

    aput-byte v1, v4, v5

    const/4 v1, 0x1

    aput-byte v2, v4, v1

    const/4 v1, 0x2

    aput-byte v3, v4, v1

    const/4 v1, 0x3

    aput-byte p0, v4, v1

    .line 775
    :try_start_0
    invoke-static {v4}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    move-result-object p0
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    return-object v0
.end method

.method public static ܽ(I)Ljava/net/InetAddress;
    .locals 0

    .line 757
    invoke-static {p0}, Ll/᩵֡ۢ;->ۧ(I)Ljava/net/InetAddress;

    move-result-object p0

    return-object p0
.end method

.method public static ܽ(Ljava/net/InetAddress;)Z
    .locals 4

    .line 344
    invoke-virtual {p0}, Ljava/net/InetAddress;->getAddress()[B

    move-result-object p0

    .line 345
    array-length v0, p0

    const/4 v1, 0x4

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    aget-byte v0, p0, v2

    const/16 v1, 0xff

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    aget-byte v3, p0, v0

    and-int/2addr v3, v1

    if-ne v3, v1, :cond_0

    const/4 v3, 0x2

    aget-byte v3, p0, v3

    and-int/2addr v3, v1

    if-ne v3, v1, :cond_0

    const/4 v3, 0x3

    aget-byte p0, p0, v3

    and-int/2addr p0, v1

    if-ne p0, v1, :cond_0

    return v0

    :cond_0
    return v2
.end method

.method public static bridge synthetic ܽ()[B
    .locals 1

    .line 0
    sget-object v0, Ll/᩵֡ۢ;->ۖ:[B

    return-object v0
.end method

.method public static ܿ(Ljava/net/InetAddress;)I
    .locals 3

    .line 802
    invoke-virtual {p0}, Ljava/net/InetAddress;->getAddress()[B

    move-result-object p0

    .line 803
    array-length v0, p0

    const/4 v1, 0x4

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    .line 806
    :cond_0
    aget-byte v0, p0, v2

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    const/4 v1, 0x1

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    const/4 v1, 0x2

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    const/4 v1, 0x3

    aget-byte p0, p0, v1

    and-int/lit16 p0, p0, 0xff

    or-int/2addr p0, v0

    return p0
.end method

.method private ܿ()V
    .locals 9

    .line 276
    :goto_0
    iget-object v0, p0, Ll/᩵֡ۢ;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/AbstractMap;->size()I

    move-result v1

    const/16 v2, 0x8

    if-le v1, v2, :cond_3

    .line 279
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    const-wide v3, 0x7fffffffffffffffL

    :cond_0
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    .line 280
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۡ֡ۢ;

    invoke-static {v6}, Ll/ۡ֡ۢ;->ۧ(Ll/ۡ֡ۢ;)J

    move-result-wide v6

    cmp-long v8, v6, v3

    if-gez v8, :cond_0

    .line 281
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۡ֡ۢ;

    invoke-static {v2}, Ll/ۡ֡ۢ;->ۧ(Ll/ۡ֡ۢ;)J

    move-result-wide v3

    .line 282
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_1

    :cond_1
    if-nez v2, :cond_2

    goto :goto_2

    .line 288
    :cond_2
    invoke-virtual {v0, v2}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    :goto_2
    return-void
.end method

.method public static ᩳ(I)I
    .locals 5

    .line 785
    invoke-static {p0}, Ll/᩵֡ۢ;->ۧ(I)Ljava/net/InetAddress;

    move-result-object p0

    .line 786
    instance-of v0, p0, Ljava/net/Inet4Address;

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    .line 789
    :cond_0
    invoke-static {p0}, Ll/᩵֡ۢ;->ܿ(Ljava/net/InetAddress;)I

    move-result p0

    .line 790
    invoke-static {p0}, Ljava/lang/Integer;->bitCount(I)I

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    const/16 v2, 0x20

    if-ne v0, v2, :cond_2

    const/4 v2, -0x1

    goto :goto_0

    :cond_2
    rsub-int/lit8 v2, v0, 0x20

    const-wide v3, 0xffffffffL

    shl-long v2, v3, v2

    long-to-int v2, v2

    :goto_0
    if-ne p0, v2, :cond_3

    return v0

    :cond_3
    return v1
.end method

.method public static bridge synthetic ᩳ()Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 1

    .line 0
    sget-object v0, Ll/᩵֡ۢ;->ۘ:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object v0
.end method

.method public static ᩳ(Ljava/net/InetAddress;)Z
    .locals 1

    .line 332
    instance-of v0, p0, Ljava/net/Inet4Address;

    if-eqz v0, :cond_0

    .line 333
    invoke-virtual {p0}, Ljava/net/InetAddress;->isAnyLocalAddress()Z

    move-result v0

    if-nez v0, :cond_0

    .line 334
    invoke-virtual {p0}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    move-result v0

    if-nez v0, :cond_0

    .line 335
    invoke-virtual {p0}, Ljava/net/InetAddress;->isMulticastAddress()Z

    move-result v0

    if-nez v0, :cond_0

    .line 336
    invoke-virtual {p0}, Ljava/net/InetAddress;->isLinkLocalAddress()Z

    move-result v0

    if-nez v0, :cond_0

    .line 337
    invoke-static {p0}, Ll/᩵֡ۢ;->ܽ(Ljava/net/InetAddress;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final ֫()V
    .locals 11

    .line 83
    iget-object v0, p0, Ll/᩵֡ۢ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 84
    :try_start_0
    iget-boolean v1, p0, Ll/᩵֡ۢ;->ܳ:Z

    if-eqz v1, :cond_0

    .line 85
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 87
    iput-boolean v1, p0, Ll/᩵֡ۢ;->ܳ:Z

    .line 88
    iget-wide v1, p0, Ll/᩵֡ۢ;->ᩳ:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/᩵֡ۢ;->ᩳ:J

    .line 89
    new-instance v3, Ll/ۖ֡ۢ;

    .line 724
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 89
    invoke-static {v3}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v4

    iput-object v4, p0, Ll/᩵֡ۢ;->ۧ:Ljava/util/concurrent/ScheduledExecutorService;

    .line 90
    new-instance v5, Ll/᩷֡ۢ;

    invoke-direct {v5, p0, v1, v2}, Ll/᩷֡ۢ;-><init>(Ll/᩵֡ۢ;J)V

    sget-wide v8, Ll/᩵֡ۢ;->ܺ:J

    sget-object v10, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v6, 0x0

    invoke-interface/range {v4 .. v10}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v1

    iput-object v1, p0, Ll/᩵֡ۢ;->ܽ:Ljava/util/concurrent/ScheduledFuture;

    .line 95
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 6

    const/4 v0, 0x0

    if-nez p1, :cond_0

    goto :goto_1

    .line 300
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 301
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const-string v1, "\\."

    const/4 v2, -0x1

    .line 304
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p1

    .line 305
    array-length v1, p1

    const/4 v2, 0x4

    if-eq v1, v2, :cond_2

    goto :goto_1

    :cond_2
    new-array v1, v2, [B

    const/4 v2, 0x0

    .line 309
    :goto_0
    array-length v3, p1

    if-ge v2, v3, :cond_4

    .line 311
    :try_start_0
    aget-object v3, p1, v2

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    if-ltz v3, :cond_5

    const/16 v4, 0xff

    if-le v3, v4, :cond_3

    goto :goto_1

    :cond_3
    int-to-byte v3, v3

    .line 315
    aput-byte v3, v1, v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 321
    :cond_4
    :try_start_1
    invoke-static {v1}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    move-result-object p1

    .line 322
    invoke-static {p1}, Ll/᩵֡ۢ;->ᩳ(Ljava/net/InetAddress;)Z

    move-result v1
    :try_end_1
    .catch Ljava/net/UnknownHostException; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz v1, :cond_5

    goto :goto_2

    :catch_0
    :cond_5
    :goto_1
    move-object p1, v0

    :goto_2
    if-nez p1, :cond_6

    goto :goto_4

    .line 127
    :cond_6
    iget-object v0, p0, Ll/᩵֡ۢ;->ۜ:Ll/᩶۫᩷;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    .line 128
    invoke-virtual {p1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v3

    .line 129
    iget-object v0, p0, Ll/᩵֡ۢ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 130
    :try_start_2
    iget-object v4, p0, Ll/᩵֡ۢ;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v4, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۡ֡ۢ;

    if-nez v4, :cond_7

    .line 132
    iget-object v4, p0, Ll/᩵֡ۢ;->֫:Ljava/util/LinkedHashMap;

    new-instance v5, Ll/ۡ֡ۢ;

    invoke-direct {v5, p1, v1, v2}, Ll/ۡ֡ۢ;-><init>(Ljava/net/InetAddress;J)V

    invoke-virtual {v4, v3, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 134
    :cond_7
    invoke-static {v4, v1, v2}, Ll/ۡ֡ۢ;->֫(Ll/ۡ֡ۢ;J)V

    .line 136
    :goto_3
    invoke-direct {p0}, Ll/᩵֡ۢ;->ܿ()V

    .line 137
    monitor-exit v0

    :goto_4
    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final ۧ()V
    .locals 5

    .line 103
    iget-object v0, p0, Ll/᩵֡ۢ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    .line 104
    :try_start_0
    iput-boolean v1, p0, Ll/᩵֡ۢ;->ܳ:Z

    .line 105
    iget-wide v1, p0, Ll/᩵֡ۢ;->ᩳ:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/᩵֡ۢ;->ᩳ:J

    .line 106
    iget-object v1, p0, Ll/᩵֡ۢ;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->clear()V

    .line 107
    iget-object v1, p0, Ll/᩵֡ۢ;->ܽ:Ljava/util/concurrent/ScheduledFuture;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const/4 v3, 0x1

    .line 108
    invoke-interface {v1, v3}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 109
    iput-object v2, p0, Ll/᩵֡ۢ;->ܽ:Ljava/util/concurrent/ScheduledFuture;

    .line 111
    :cond_0
    iget-object v1, p0, Ll/᩵֡ۢ;->ۧ:Ljava/util/concurrent/ScheduledExecutorService;

    .line 112
    iput-object v2, p0, Ll/᩵֡ۢ;->ۧ:Ljava/util/concurrent/ScheduledExecutorService;

    .line 113
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 115
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    .line 113
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
