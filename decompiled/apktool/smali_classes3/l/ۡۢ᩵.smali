.class public final Ll/ۡۢ᩵;
.super Ll/᩹ۜ᩵;
.source "QA30"

# interfaces
.implements Ll/ۗ᩷᩵;
.implements Ll/ۨ᩷᩵;


# static fields
.field public static final ܳ֫:Ljava/util/Random;

.field public static ᩻֫:Ll/֫᩻֨;


# instance fields
.field public final ֫֫:Ll/ۧۤᩴ;

.field public final ۗ:Ljava/util/concurrent/locks/ReentrantLock;

.field public ۙ:Ljava/lang/Thread;

.field public final ۛ:Ljava/lang/String;

.field public final ۟:Ll/ۧۤᩴ;

.field public ۤ:Ll/۟᩷᩵;

.field public final ۧ֫:Ll/ۧۤᩴ;

.field public ۨ:Ll/ۧ᩷᩵;

.field public final ۫:Ljava/util/List;

.field public ۬:J

.field public final ܰ:Ll/ۧۤᩴ;

.field public volatile ܽ֫:Ljava/net/MulticastSocket;

.field public final ܿ֫:Ljava/util/Set;

.field public ᩳ֫:I

.field public volatile ᩶:Ljava/net/InetAddress;

.field public final ᩸:Ll/᩺ۜ᩵;

.field public final ᩹:Ljava/util/concurrent/ExecutorService;

.field public final ᩺:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 62
    const-class v0, Ll/ۡۢ᩵;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/String;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ۡۢ᩵;->᩻֫:Ll/֫᩻֨;

    .line 337
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    sput-object v0, Ll/ۡۢ᩵;->ܳ֫:Ljava/util/Random;

    return-void
.end method

.method public constructor <init>(Ljava/net/InetAddress;)V
    .locals 3

    .line 405
    invoke-direct {p0}, Ll/᩹ۜ᩵;-><init>()V

    .line 320
    new-instance v0, Ll/ۖۡ᩵;

    invoke-direct {v0}, Ll/ۖۡ᩵;-><init>()V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Ll/ۡۢ᩵;->᩹:Ljava/util/concurrent/ExecutorService;

    .line 342
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Ll/ۡۢ᩵;->ۗ:Ljava/util/concurrent/locks/ReentrantLock;

    .line 1792
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ۡۢ᩵;->᩺:Ljava/lang/Object;

    .line 406
    sget-object v0, Ll/ۡۢ᩵;->᩻֫:Ll/֫᩻֨;

    const-string v1, "JmDNS instance created"

    invoke-interface {v0, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 408
    new-instance v0, Ll/᩺ۜ᩵;

    const/16 v1, 0x64

    .line 75
    invoke-direct {v0, v1}, Ll/ۧۤᩴ;-><init>(I)V

    .line 408
    iput-object v0, p0, Ll/ۡۢ᩵;->᩸:Ll/᩺ۜ᩵;

    .line 0
    invoke-static {}, Ll/ܽ᩷ᩳ;->ܽ()Ljava/util/List;

    move-result-object v0

    .line 410
    iput-object v0, p0, Ll/ۡۢ᩵;->۫:Ljava/util/List;

    .line 411
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    iput-object v0, p0, Ll/ۡۢ᩵;->۟:Ll/ۧۤᩴ;

    .line 412
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-static {v0}, Ll/᩶۬ᩴ;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Ll/ۡۢ᩵;->ܿ֫:Ljava/util/Set;

    .line 413
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    iput-object v0, p0, Ll/ۡۢ᩵;->ܰ:Ll/ۧۤᩴ;

    .line 415
    new-instance v0, Ll/ۧۤᩴ;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ll/ۧۤᩴ;-><init>(I)V

    iput-object v0, p0, Ll/ۡۢ᩵;->ۧ֫:Ll/ۧۤᩴ;

    .line 416
    new-instance v2, Ll/ۧۤᩴ;

    invoke-direct {v2, v1}, Ll/ۧۤᩴ;-><init>(I)V

    iput-object v2, p0, Ll/ۡۢ᩵;->֫֫:Ll/ۧۤᩴ;

    .line 418
    invoke-static {p1, p0}, Ll/۟᩷᩵;->֫(Ljava/net/InetAddress;Ll/ۡۢ᩵;)Ll/۟᩷᩵;

    move-result-object p1

    iput-object p1, p0, Ll/ۡۢ᩵;->ۤ:Ll/۟᩷᩵;

    .line 134
    iget-object v1, p1, Ll/۟᩷᩵;->᩶:Ljava/lang/String;

    .line 419
    iput-object v1, p0, Ll/ۡۢ᩵;->ۛ:Ljava/lang/String;

    .line 432
    invoke-direct {p0, p1}, Ll/ۡۢ᩵;->֫(Ll/۟᩷᩵;)V

    .line 433
    invoke-virtual {v0}, Ll/ۧۤᩴ;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ۡۢ᩵;->֫(Ljava/util/Collection;)V

    .line 435
    invoke-virtual {p0}, Ll/ۡۢ᩵;->ۖ()V

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 2269
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    .line 2270
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    .line 2271
    invoke-virtual {v1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2272
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    sub-int/2addr v0, p0

    add-int/lit8 v0, v0, -0x1

    const/4 p0, 0x0

    invoke-virtual {p1, p0, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    return-object p1
.end method

.method private ֫(Ljava/lang/String;Ll/ۛۜ᩵;Z)V
    .locals 7

    .line 946
    new-instance v1, Ll/ܺۢ᩵;

    invoke-direct {v1, p2, p3}, Ll/ܺۢ᩵;-><init>(Ll/ۛۜ᩵;Z)V

    .line 947
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p2

    .line 948
    iget-object p3, p0, Ll/ۡۢ᩵;->۟:Ll/ۧۤᩴ;

    invoke-virtual {p3, p2}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/List;

    if-nez p3, :cond_1

    .line 950
    iget-object p3, p0, Ll/ۡۢ᩵;->۟:Ll/ۧۤᩴ;

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    invoke-virtual {p3, p2, v0}, Ll/ۧۤᩴ;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-nez p3, :cond_0

    .line 951
    iget-object p3, p0, Ll/ۡۢ᩵;->ܰ:Ll/ۧۤᩴ;

    new-instance v0, Ll/ۜۢ᩵;

    invoke-direct {v0, p1}, Ll/ۜۢ᩵;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2, v0}, Ll/ۧۤᩴ;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-nez p3, :cond_0

    .line 953
    iget-object p3, p0, Ll/ۡۢ᩵;->ܰ:Ll/ۧۤᩴ;

    invoke-virtual {p3, p2}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ۛۜ᩵;

    const/4 v0, 0x1

    invoke-direct {p0, p2, p3, v0}, Ll/ۡۢ᩵;->֫(Ljava/lang/String;Ll/ۛۜ᩵;Z)V

    .line 956
    :cond_0
    iget-object p3, p0, Ll/ۡۢ᩵;->۟:Ll/ۧۤᩴ;

    invoke-virtual {p3, p2}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/List;

    :cond_1
    if-eqz p3, :cond_3

    move-object v0, p3

    .line 959
    monitor-enter v0

    .line 960
    :try_start_0
    invoke-interface {p3, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 961
    invoke-interface {p3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 963
    :cond_2
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 966
    :cond_3
    :goto_0
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 682
    iget-object v0, p0, Ll/ۡۢ᩵;->᩸:Ll/᩺ۜ᩵;

    .line 967
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 98
    invoke-virtual {v0}, Ll/ۧۤᩴ;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-eqz v3, :cond_4

    .line 100
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    .line 968
    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰۜ᩵;

    .line 969
    check-cast v2, Ll/᩹᩷᩵;

    .line 970
    invoke-virtual {v2}, Ll/ܰۜ᩵;->ᩳ()Ll/ۨۢ᩵;

    move-result-object v3

    sget-object v4, Ll/ۨۢ᩵;->ܳۧ:Ll/ۨۢ᩵;

    if-ne v3, v4, :cond_6

    .line 971
    invoke-virtual {v2}, Ll/ܰۜ᩵;->֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 974
    new-instance v3, Ll/ܶۢ᩵;

    invoke-virtual {v2}, Ll/ܰۜ᩵;->ܳ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Ll/ܰۜ᩵;->ܳ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Ll/ܰۜ᩵;->ۧ()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Ll/ۡۢ᩵;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    .line 1035
    invoke-virtual {v2, v6}, Ll/᩹᩷᩵;->֫(Z)Ll/᩶ۢ᩵;

    move-result-object v2

    .line 974
    invoke-direct {v3, p0, v4, v5, v2}, Ll/ܶۢ᩵;-><init>(Ll/ۡۢ᩵;Ljava/lang/String;Ljava/lang/String;Ll/ۤۜ᩵;)V

    invoke-virtual {p3, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 979
    :cond_7
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_8

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/۬ۜ᩵;

    .line 980
    invoke-virtual {v1, p3}, Ll/ܺۢ᩵;->֫(Ll/۬ۜ᩵;)V

    goto :goto_3

    .line 983
    :cond_8
    invoke-virtual {p0, p1}, Ll/ۡۢ᩵;->֫(Ljava/lang/String;)V

    return-void
.end method

.method private ֫(Ljava/util/Collection;)V
    .locals 3

    .line 439
    iget-object v0, p0, Ll/ۡۢ᩵;->ۙ:Ljava/lang/Thread;

    if-nez v0, :cond_0

    .line 440
    new-instance v0, Ll/ۗۢ᩵;

    invoke-direct {v0, p0}, Ll/ۗۢ᩵;-><init>(Ll/ۡۢ᩵;)V

    iput-object v0, p0, Ll/ۡۢ᩵;->ۙ:Ljava/lang/Thread;

    .line 441
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 443
    :cond_0
    invoke-virtual {p0}, Ll/ۡۢ᩵;->ᩳ()V

    .line 444
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۤۜ᩵;

    .line 446
    :try_start_0
    new-instance v1, Ll/᩶ۢ᩵;

    invoke-direct {v1, v0}, Ll/᩶ۢ᩵;-><init>(Ll/ۤۜ᩵;)V

    invoke-virtual {p0, v1}, Ll/ۡۢ᩵;->ۧ(Ll/᩶ۢ᩵;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 448
    sget-object v1, Ll/ۡۢ᩵;->᩻֫:Ll/֫᩻֨;

    const-string v2, "start() Registration exception "

    invoke-interface {v1, v2, v0}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private ֫(Ll/۟᩷᩵;)V
    .locals 4

    .line 454
    iget-object v0, p0, Ll/ۡۢ᩵;->᩶:Ljava/net/InetAddress;

    if-nez v0, :cond_1

    .line 138
    iget-object v0, p1, Ll/۟᩷᩵;->᩸:Ljava/net/InetAddress;

    .line 455
    instance-of v0, v0, Ljava/net/Inet6Address;

    if-eqz v0, :cond_0

    .line 456
    sget-object v0, Ll/۬ۢ᩵;->ᩳ:Ljava/lang/String;

    invoke-static {v0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v0

    iput-object v0, p0, Ll/ۡۢ᩵;->᩶:Ljava/net/InetAddress;

    goto :goto_0

    .line 458
    :cond_0
    sget-object v0, Ll/۬ۢ᩵;->ܽ:Ljava/lang/String;

    invoke-static {v0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v0

    iput-object v0, p0, Ll/ۡۢ᩵;->᩶:Ljava/net/InetAddress;

    .line 461
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ۡۢ᩵;->ܽ֫:Ljava/net/MulticastSocket;

    if-eqz v0, :cond_2

    .line 462
    invoke-direct {p0}, Ll/ۡۢ᩵;->ܺ֫()V

    .line 473
    :cond_2
    new-instance v0, Ljava/net/MulticastSocket;

    sget v1, Ll/۬ۢ᩵;->ܿ:I

    invoke-direct {v0, v1}, Ljava/net/MulticastSocket;-><init>(I)V

    iput-object v0, p0, Ll/ۡۢ᩵;->ܽ֫:Ljava/net/MulticastSocket;

    if-eqz p1, :cond_3

    .line 156
    iget-object v0, p1, Ll/۟᩷᩵;->᩹:Ljava/net/NetworkInterface;

    if-eqz v0, :cond_3

    .line 475
    new-instance v0, Ljava/net/InetSocketAddress;

    iget-object v2, p0, Ll/ۡۢ᩵;->᩶:Ljava/net/InetAddress;

    invoke-direct {v0, v2, v1}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 476
    iget-object v1, p0, Ll/ۡۢ᩵;->ܽ֫:Ljava/net/MulticastSocket;

    .line 156
    iget-object v2, p1, Ll/۟᩷᩵;->᩹:Ljava/net/NetworkInterface;

    .line 476
    invoke-virtual {v1, v2}, Ljava/net/MulticastSocket;->setNetworkInterface(Ljava/net/NetworkInterface;)V

    .line 478
    sget-object v1, Ll/ۡۢ᩵;->᩻֫:Ll/֫᩻֨;

    const-string v2, "Trying to joinGroup({}, {})"

    .line 156
    iget-object v3, p1, Ll/۟᩷᩵;->᩹:Ljava/net/NetworkInterface;

    .line 478
    invoke-interface {v1, v2, v0, v3}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 481
    iget-object v1, p0, Ll/ۡۢ᩵;->ܽ֫:Ljava/net/MulticastSocket;

    .line 156
    iget-object p1, p1, Ll/۟᩷᩵;->᩹:Ljava/net/NetworkInterface;

    .line 481
    invoke-virtual {v1, v0, p1}, Ljava/net/MulticastSocket;->joinGroup(Ljava/net/SocketAddress;Ljava/net/NetworkInterface;)V

    goto :goto_1

    .line 483
    :cond_3
    sget-object p1, Ll/ۡۢ᩵;->᩻֫:Ll/֫᩻֨;

    const-string v0, "Trying to joinGroup({})"

    iget-object v1, p0, Ll/ۡۢ᩵;->᩶:Ljava/net/InetAddress;

    invoke-interface {p1, v1, v0}, Ll/֫᩻֨;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 484
    iget-object p1, p0, Ll/ۡۢ᩵;->ܽ֫:Ljava/net/MulticastSocket;

    iget-object v0, p0, Ll/ۡۢ᩵;->᩶:Ljava/net/InetAddress;

    invoke-virtual {p1, v0}, Ljava/net/MulticastSocket;->joinGroup(Ljava/net/InetAddress;)V

    .line 487
    :goto_1
    iget-object p1, p0, Ll/ۡۢ᩵;->ܽ֫:Ljava/net/MulticastSocket;

    const/16 v0, 0xff

    invoke-virtual {p1, v0}, Ljava/net/MulticastSocket;->setTimeToLive(I)V

    return-void
.end method

.method private ۖ֫()V
    .locals 4

    .line 2110
    sget-object v0, Ll/ۡۢ᩵;->᩻֫:Ll/֫᩻֨;

    const-string v1, "disposeServiceCollectors()"

    invoke-interface {v0, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 2111
    iget-object v0, p0, Ll/ۡۢ᩵;->ܰ:Ll/ۧۤᩴ;

    invoke-virtual {v0}, Ll/ۧۤᩴ;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 2112
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۜۢ᩵;

    if-eqz v3, :cond_0

    .line 2114
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 2115
    invoke-virtual {p0, v2, v3}, Ll/ۡۢ᩵;->ۧ(Ljava/lang/String;Ll/ۛۜ᩵;)V

    .line 2116
    invoke-virtual {v0, v2, v3}, Ll/ۧۤᩴ;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method private ܺ֫()V
    .locals 4

    .line 493
    sget-object v0, Ll/ۡۢ᩵;->᩻֫:Ll/֫᩻֨;

    const-string v1, "closeMulticastSocket()"

    invoke-interface {v0, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 494
    iget-object v0, p0, Ll/ۡۢ᩵;->ܽ֫:Ljava/net/MulticastSocket;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    .line 498
    :try_start_0
    iget-object v0, p0, Ll/ۡۢ᩵;->ܽ֫:Ljava/net/MulticastSocket;

    iget-object v2, p0, Ll/ۡۢ᩵;->᩶:Ljava/net/InetAddress;

    invoke-virtual {v0, v2}, Ljava/net/MulticastSocket;->leaveGroup(Ljava/net/InetAddress;)V
    :try_end_0
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_4

    .line 502
    :catch_1
    :goto_0
    :try_start_1
    iget-object v0, p0, Ll/ۡۢ᩵;->ܽ֫:Ljava/net/MulticastSocket;

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->close()V

    .line 509
    :goto_1
    iget-object v0, p0, Ll/ۡۢ᩵;->ۙ:Ljava/lang/Thread;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v0, p0

    .line 510
    monitor-enter v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 512
    :try_start_2
    iget-object v2, p0, Ll/ۡۢ᩵;->ۙ:Ljava/lang/Thread;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Thread;->isAlive()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 514
    sget-object v2, Ll/ۡۢ᩵;->᩻֫:Ll/֫᩻֨;

    const-string v3, "closeMulticastSocket(): waiting for jmDNS monitor"

    invoke-interface {v2, v3}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    const-wide/16 v2, 0x3e8

    .line 515
    invoke-virtual {p0, v2, v3}, Ljava/lang/Object;->wait(J)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v2

    goto :goto_3

    .line 520
    :catch_2
    :cond_0
    :goto_2
    :try_start_3
    monitor-exit v0

    goto :goto_1

    :goto_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v2

    .line 522
    :cond_1
    iput-object v1, p0, Ll/ۡۢ᩵;->ۙ:Ljava/lang/Thread;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_5

    .line 524
    :goto_4
    sget-object v2, Ll/ۡۢ᩵;->᩻֫:Ll/֫᩻֨;

    const-string v3, "closeMulticastSocket() Close socket exception "

    invoke-interface {v2, v3, v0}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 526
    :goto_5
    iput-object v1, p0, Ll/ۡۢ᩵;->ܽ֫:Ljava/net/MulticastSocket;

    :cond_2
    return-void
.end method

.method private ܽ(Ll/᩶ۢ᩵;)V
    .locals 11

    .line 1158
    invoke-virtual {p1}, Ll/᩶ۢ᩵;->ۢ()Ljava/lang/String;

    move-result-object v0

    .line 1159
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 682
    :cond_0
    iget-object v3, p0, Ll/ۡۢ᩵;->᩸:Ll/᩺ۜ᩵;

    .line 1166
    invoke-virtual {p1}, Ll/᩶ۢ᩵;->ۢ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ll/᩺ۜ᩵;->֫(Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    iget-object v7, p0, Ll/ۡۢ᩵;->ۤ:Ll/۟᩷᩵;

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܰۜ᩵;

    .line 1167
    sget-object v8, Ll/ۨۢ᩵;->ܳۧ:Ll/ۨۢ᩵;

    invoke-virtual {v4}, Ll/ܰۜ᩵;->ᩳ()Ll/ۨۢ᩵;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-virtual {v4, v1, v2}, Ll/ܰۜ᩵;->֫(J)Z

    move-result v8

    if-nez v8, :cond_1

    .line 1168
    move-object v8, v4

    check-cast v8, Ll/ܶ᩷᩵;

    .line 1169
    invoke-virtual {v8}, Ll/ܶ᩷᩵;->᩵()I

    move-result v9

    invoke-virtual {p1}, Ll/᩶ۢ᩵;->ۡ()I

    move-result v10

    if-ne v9, v10, :cond_2

    invoke-virtual {v8}, Ll/ܶ᩷᩵;->ۚ()Ljava/lang/String;

    move-result-object v9

    .line 134
    iget-object v10, v7, Ll/۟᩷᩵;->᩶:Ljava/lang/String;

    .line 1169
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1

    .line 1172
    :cond_2
    invoke-virtual {v8}, Ll/ܶ᩷᩵;->ۚ()Ljava/lang/String;

    move-result-object v3

    .line 134
    iget-object v9, v7, Ll/۟᩷᩵;->᩶:Ljava/lang/String;

    .line 1174
    invoke-virtual {v8}, Ll/ܶ᩷᩵;->ۚ()Ljava/lang/String;

    move-result-object v8

    .line 134
    iget-object v10, v7, Ll/۟᩷᩵;->᩶:Ljava/lang/String;

    .line 1174
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    const/4 v10, 0x4

    new-array v10, v10, [Ljava/lang/Object;

    aput-object v4, v10, v5

    aput-object v3, v10, v6

    const/4 v3, 0x2

    aput-object v9, v10, v3

    const/4 v3, 0x3

    aput-object v8, v10, v3

    .line 1170
    sget-object v3, Ll/ۡۢ᩵;->᩻֫:Ll/֫᩻֨;

    const-string v4, "makeServiceNameUnique() JmDNS.makeServiceNameUnique srv collision:{} s.server={} {} equals:{}"

    invoke-interface {v3, v4, v10}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1176
    invoke-static {}, Ll/᩵ۢ᩵;->֫()Ll/֨ۢ᩵;

    move-result-object v3

    invoke-virtual {p1}, Ll/᩶ۢ᩵;->getName()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ll/֡ۢ᩵;->᩶:Ll/֡ۢ᩵;

    check-cast v3, Ll/ۚۢ᩵;

    invoke-virtual {v3, v4, v5}, Ll/ۚۢ᩵;->֫(Ljava/lang/String;Ll/֡ۢ᩵;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ll/᩶ۢ᩵;->֫(Ljava/lang/String;)V

    const/4 v5, 0x1

    .line 1184
    :cond_3
    iget-object v3, p0, Ll/ۡۢ᩵;->ۧ֫:Ll/ۧۤᩴ;

    invoke-virtual {p1}, Ll/᩶ۢ᩵;->ۢ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۤۜ᩵;

    if-eqz v3, :cond_4

    if-eq v3, p1, :cond_4

    .line 1186
    invoke-static {}, Ll/᩵ۢ᩵;->֫()Ll/֨ۢ᩵;

    move-result-object v3

    .line 138
    iget-object v4, v7, Ll/۟᩷᩵;->᩸:Ljava/net/InetAddress;

    .line 1186
    invoke-virtual {p1}, Ll/᩶ۢ᩵;->getName()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ll/֡ۢ᩵;->᩶:Ll/֡ۢ᩵;

    check-cast v3, Ll/ۚۢ᩵;

    invoke-virtual {v3, v4, v5}, Ll/ۚۢ᩵;->֫(Ljava/lang/String;Ll/֡ۢ᩵;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ll/᩶ۢ᩵;->֫(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    move v6, v5

    :goto_0
    if-nez v6, :cond_0

    .line 1192
    invoke-virtual {p1}, Ll/᩶ۢ᩵;->ۢ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    return-void
.end method

.method public static ᩵֫()Ljava/util/Random;
    .locals 1

    .line 2298
    sget-object v0, Ll/ۡۢ᩵;->ܳ֫:Ljava/util/Random;

    return-object v0
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 649
    iget-object v0, p0, Ll/ۡۢ᩵;->ۤ:Ll/۟᩷᩵;

    invoke-virtual {v0}, Ll/۟᩷᩵;->ۜ()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const-string v1, "Cancelling JmDNS: {}"

    .line 1931
    sget-object v2, Ll/ۡۢ᩵;->᩻֫:Ll/֫᩻֨;

    invoke-interface {v2, p0, v1}, Ll/֫᩻֨;->ܿ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 553
    invoke-virtual {v0}, Ll/۟᩷᩵;->֫()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "Canceling the timer"

    .line 1939
    invoke-interface {v2, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 1940
    invoke-virtual {p0}, Ll/ۡۢ᩵;->ܽ()V

    .line 1943
    invoke-virtual {p0}, Ll/ۡۢ᩵;->᩷֫()V

    .line 1944
    invoke-direct {p0}, Ll/ۡۢ᩵;->ۖ֫()V

    const-string v1, "Wait for JmDNS cancel: {}"

    .line 1946
    invoke-interface {v2, p0, v1}, Ll/֫᩻֨;->ܿ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 673
    invoke-virtual {v0}, Ll/۟᩷᩵;->ܺ()Z

    const-string v0, "Canceling the state timer"

    .line 1951
    invoke-interface {v2, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 1952
    invoke-virtual {p0}, Ll/ۡۢ᩵;->֫()V

    .line 1955
    iget-object v0, p0, Ll/ۡۢ᩵;->᩹:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 1958
    invoke-direct {p0}, Ll/ۡۢ᩵;->ܺ֫()V

    .line 1967
    invoke-static {}, Ll/ۛ᩷᩵;->֫()Ll/ۛ᩷᩵;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/ۛ᩷᩵;->֫(Ll/ۡۢ᩵;)V

    const-string v0, "JmDNS closed."

    .line 1969
    invoke-interface {v2, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    :cond_1
    const/4 v0, 0x0

    .line 1971
    invoke-virtual {p0, v0}, Ll/ۡۢ᩵;->֫(Ll/֫ۡ᩵;)V

    return-void
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 690
    iget-object v0, p0, Ll/ۡۢ᩵;->ۛ:Ljava/lang/String;

    return-object v0
.end method

.method public final isClosed()Z
    .locals 1

    .line 657
    iget-object v0, p0, Ll/ۡۢ᩵;->ۤ:Ll/۟᩷᩵;

    invoke-virtual {v0}, Ll/۟᩷᩵;->᩻()Z

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const/16 v0, 0x800

    const-string v1, "\n\t---- Local Host -----\n\t"

    .line 0
    invoke-static {v0, v1}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1992
    iget-object v1, p0, Ll/ۡۢ᩵;->ۤ:Ll/۟᩷᩵;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\n\t---- Services -----"

    .line 1993
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1994
    iget-object v1, p0, Ll/ۡۢ᩵;->ۧ֫:Ll/ۧۤᩴ;

    invoke-virtual {v1}, Ll/ۧۤᩴ;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string v3, ": "

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    const-string v4, "\n\t\tService: "

    .line 1995
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1996
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1997
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1998
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v1, "\n\t---- Types ----"

    .line 2000
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2002
    iget-object v1, p0, Ll/ۡۢ᩵;->֫֫:Ll/ۧۤᩴ;

    invoke-virtual {v1}, Ll/ۧۤᩴ;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۢۢ᩵;

    const-string v4, "\n\t\tType: "

    .line 2003
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2004
    invoke-virtual {v2}, Ll/ۢۢ᩵;->֫()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2005
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2006
    invoke-virtual {v2}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v2, "no subtypes"

    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    const-string v1, "\n"

    .line 2008
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2009
    iget-object v1, p0, Ll/ۡۢ᩵;->᩸:Ll/᩺ۜ᩵;

    invoke-virtual {v1}, Ll/᩺ۜ᩵;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n\t---- Service Collectors ----"

    .line 2010
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2012
    iget-object v1, p0, Ll/ۡۢ᩵;->ܰ:Ll/ۧۤᩴ;

    invoke-virtual {v1}, Ll/ۧۤᩴ;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    const-string v4, "\n\t\tService Collector: "

    .line 2013
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2014
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2015
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2016
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_3
    const-string v1, "\n\t---- Service Listeners ----"

    .line 2018
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2020
    iget-object v1, p0, Ll/ۡۢ᩵;->۟:Ll/ۧۤᩴ;

    invoke-virtual {v1}, Ll/ۧۤᩴ;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    const-string v4, "\n\t\tService Listener: "

    .line 2021
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2022
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2023
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2024
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 2026
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()V
    .locals 10

    .line 1895
    sget-object v0, Ll/ۡۢ᩵;->᩻֫:Ll/֫᩻֨;

    iget-object v1, p0, Ll/ۡۢ᩵;->᩸:Ll/᩺ۜ᩵;

    invoke-virtual {v1}, Ll/᩺ۜ᩵;->֫()V

    .line 1897
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 1898
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 97
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 98
    invoke-virtual {v1}, Ll/ۧۤᩴ;->values()Ljava/util/Collection;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    if-eqz v7, :cond_0

    .line 100
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 1899
    :cond_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܰۜ᩵;

    .line 1901
    :try_start_0
    move-object v7, v6

    check-cast v7, Ll/᩹᩷᩵;

    .line 1902
    invoke-virtual {v7, v2, v3}, Ll/᩹᩷᩵;->֫(J)Z

    move-result v8

    if-eqz v8, :cond_3

    .line 1903
    sget-object v8, Ll/᩻ۢ᩵;->ۗ:Ll/᩻ۢ᩵;

    invoke-virtual {p0, v2, v3, v7, v8}, Ll/ۡۢ᩵;->֫(JLl/᩹᩷᩵;Ll/᩻ۢ᩵;)V

    const-string v8, "Removing DNSEntry from cache: {}"

    .line 1904
    invoke-interface {v0, v6, v8}, Ll/֫᩻֨;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1905
    invoke-virtual {v1, v7}, Ll/᩺ۜ᩵;->ܽ(Ll/᩹᩷᩵;)V

    goto :goto_1

    .line 1906
    :cond_3
    invoke-virtual {v7, v2, v3}, Ll/᩹᩷᩵;->ܽ(J)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 1907
    invoke-virtual {v7}, Ll/᩹᩷᩵;->ۘ()V

    const/4 v8, 0x0

    .line 1035
    invoke-virtual {v7, v8}, Ll/᩹᩷᩵;->֫(Z)Ll/᩶ۢ᩵;

    move-result-object v7

    .line 1908
    invoke-virtual {v7}, Ll/᩶ۢ᩵;->֨()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v7

    .line 1910
    invoke-virtual {v4, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 1233
    iget-object v8, p0, Ll/ۡۢ᩵;->ܰ:Ll/ۧۤᩴ;

    invoke-virtual {v7}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ll/ۧۤᩴ;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 1235
    invoke-virtual {p0, v7}, Ll/ۡۢ᩵;->֫(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v7

    .line 1916
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 690
    iget-object v9, p0, Ll/ۡۢ᩵;->ۛ:Ljava/lang/String;

    .line 1916
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, ".Error while reaping records: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v6, v7}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1917
    invoke-virtual {p0}, Ll/ۡۢ᩵;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v6}, Ll/֫᩻֨;->ᩳ(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/᩶ۢ᩵;
    .locals 4

    .line 762
    invoke-virtual {p0}, Ll/ۡۢ᩵;->֡()V

    .line 763
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    .line 764
    invoke-virtual {p0, p1}, Ll/ۡۢ᩵;->ۧ(Ljava/lang/String;)Z

    .line 765
    new-instance v1, Ll/ۜۢ᩵;

    invoke-direct {v1, p1}, Ll/ۜۢ᩵;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ۡۢ᩵;->ܰ:Ll/ۧۤᩴ;

    invoke-virtual {v2, v0, v1}, Ll/ۧۤᩴ;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/4 v3, 0x1

    if-nez v1, :cond_0

    .line 766
    invoke-virtual {v2, v0}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛۜ᩵;

    invoke-direct {p0, v0, v1, v3}, Ll/ۡۢ᩵;->֫(Ljava/lang/String;Ll/ۛۜ᩵;Z)V

    .line 770
    :cond_0
    invoke-virtual {p0, p1, p2, p3, v3}, Ll/ۡۢ᩵;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ll/᩶ۢ᩵;

    move-result-object p1

    .line 772
    invoke-virtual {p0, p1}, Ll/ۡۢ᩵;->֫(Ll/᩶ۢ᩵;)V

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ll/᩶ۢ᩵;
    .locals 16

    move/from16 v7, p4

    .line 779
    new-instance v8, Ll/᩶ۢ᩵;

    .line 18
    invoke-static/range {p1 .. p1}, Ll/ۙۢ᩵;->֫(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v0

    .line 20
    sget-object v1, Ll/۫ۜ᩵;->ۙ:Ll/۫ۜ᩵;

    move-object/from16 v2, p2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    sget-object v1, Ll/۫ۜ᩵;->۬:Ll/۫ۜ᩵;

    move-object/from16 v2, p3

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    invoke-static {v0}, Ll/᩶ۢ᩵;->֫(Ljava/util/Map;)Ljava/util/HashMap;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v0, v8

    move/from16 v5, p4

    .line 168
    invoke-direct/range {v0 .. v6}, Ll/᩶ۢ᩵;-><init>(Ljava/util/Map;IIIZ[B)V

    .line 780
    new-instance v0, Ll/۠᩷᩵;

    sget-object v15, Ll/ۛۢ᩵;->ۙ:Ll/ۛۢ᩵;

    const/4 v13, 0x0

    invoke-virtual {v8}, Ll/᩶ۢ᩵;->ۘ()Ljava/lang/String;

    move-result-object v14

    const/4 v12, 0x0

    move-object v9, v0

    move-object/from16 v10, p1

    move-object v11, v15

    invoke-direct/range {v9 .. v14}, Ll/۠᩷᩵;-><init>(Ljava/lang/String;Ll/ۛۢ᩵;ZILjava/lang/String;)V

    move-object/from16 v9, p0

    iget-object v10, v9, Ll/ۡۢ᩵;->᩸:Ll/᩺ۜ᩵;

    invoke-virtual {v10, v0}, Ll/᩺ۜ᩵;->ۧ(Ll/᩹᩷᩵;)Ll/ܰۜ᩵;

    move-result-object v0

    .line 781
    instance-of v1, v0, Ll/᩹᩷᩵;

    if-eqz v1, :cond_9

    .line 782
    check-cast v0, Ll/᩹᩷᩵;

    invoke-virtual {v0, v7}, Ll/᩹᩷᩵;->֫(Z)Ll/᩶ۢ᩵;

    move-result-object v0

    .line 786
    invoke-virtual {v0}, Ll/᩶ۢ᩵;->۫()Ljava/util/HashMap;

    move-result-object v1

    .line 789
    invoke-virtual {v8}, Ll/᩶ۢ᩵;->ۘ()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ll/ۨۢ᩵;->ܳۧ:Ll/ۨۢ᩵;

    invoke-virtual {v10, v2, v3, v15}, Ll/᩺ۜ᩵;->֫(Ljava/lang/String;Ll/ۨۢ᩵;Ll/ۛۢ᩵;)Ll/ܰۜ᩵;

    move-result-object v2

    .line 790
    instance-of v3, v2, Ll/᩹᩷᩵;

    if-eqz v3, :cond_0

    .line 791
    check-cast v2, Ll/᩹᩷᩵;

    invoke-virtual {v2, v7}, Ll/᩹᩷᩵;->֫(Z)Ll/᩶ۢ᩵;

    move-result-object v11

    .line 793
    new-instance v12, Ll/᩶ۢ᩵;

    invoke-virtual {v11}, Ll/᩶ۢ᩵;->ۡ()I

    move-result v2

    invoke-virtual {v11}, Ll/᩶ۢ᩵;->۠()I

    move-result v3

    invoke-virtual {v11}, Ll/᩶ۢ᩵;->ܺ()I

    move-result v4

    const/4 v6, 0x0

    move-object v0, v12

    move/from16 v5, p4

    invoke-direct/range {v0 .. v6}, Ll/᩶ۢ᩵;-><init>(Ljava/util/Map;IIIZ[B)V

    .line 794
    invoke-virtual {v11}, Ll/᩶ۢ᩵;->ۚ()[B

    move-result-object v0

    .line 795
    invoke-virtual {v11}, Ll/᩶ۢ᩵;->᩵()Ljava/lang/String;

    move-result-object v1

    move-object v2, v1

    move-object v1, v0

    move-object v0, v12

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    const-string v2, ""

    .line 798
    :goto_0
    sget-object v3, Ll/ۨۢ᩵;->ۙ:Ll/ۨۢ᩵;

    invoke-virtual {v10, v2, v3, v15}, Ll/᩺ۜ᩵;->ۧ(Ljava/lang/String;Ll/ۨۢ᩵;Ll/ۛۢ᩵;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܰۜ᩵;

    .line 799
    instance-of v6, v4, Ll/᩹᩷᩵;

    if-eqz v6, :cond_1

    .line 800
    check-cast v4, Ll/᩹᩷᩵;

    invoke-virtual {v4, v7}, Ll/᩹᩷᩵;->֫(Z)Ll/᩶ۢ᩵;

    move-result-object v4

    .line 802
    invoke-virtual {v4}, Ll/᩶ۢ᩵;->ܿ()[Ljava/net/Inet4Address;

    move-result-object v6

    array-length v11, v6

    :goto_2
    if-ge v5, v11, :cond_2

    aget-object v12, v6, v5

    .line 803
    invoke-virtual {v0, v12}, Ll/᩶ۢ᩵;->֫(Ljava/net/Inet4Address;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 805
    :cond_2
    invoke-virtual {v4}, Ll/᩶ۢ᩵;->ۚ()[B

    move-result-object v4

    invoke-virtual {v0, v4}, Ll/᩶ۢ᩵;->֫([B)V

    goto :goto_1

    .line 809
    :cond_3
    sget-object v3, Ll/ۨۢ᩵;->۬:Ll/ۨۢ᩵;

    sget-object v4, Ll/ۛۢ᩵;->ۙ:Ll/ۛۢ᩵;

    invoke-virtual {v10, v2, v3, v4}, Ll/᩺ۜ᩵;->ۧ(Ljava/lang/String;Ll/ۨۢ᩵;Ll/ۛۢ᩵;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܰۜ᩵;

    .line 810
    instance-of v4, v3, Ll/᩹᩷᩵;

    if-eqz v4, :cond_4

    .line 811
    check-cast v3, Ll/᩹᩷᩵;

    invoke-virtual {v3, v7}, Ll/᩹᩷᩵;->֫(Z)Ll/᩶ۢ᩵;

    move-result-object v3

    .line 813
    invoke-virtual {v3}, Ll/᩶ۢ᩵;->ۜ()[Ljava/net/Inet6Address;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    :goto_4
    if-ge v6, v5, :cond_5

    aget-object v11, v4, v6

    .line 814
    invoke-virtual {v0, v11}, Ll/᩶ۢ᩵;->֫(Ljava/net/Inet6Address;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    .line 816
    :cond_5
    invoke-virtual {v3}, Ll/᩶ۢ᩵;->ۚ()[B

    move-result-object v3

    invoke-virtual {v0, v3}, Ll/᩶ۢ᩵;->֫([B)V

    goto :goto_3

    .line 820
    :cond_6
    invoke-virtual {v0}, Ll/᩶ۢ᩵;->ۘ()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ll/ۨۢ᩵;->ۢۧ:Ll/ۨۢ᩵;

    sget-object v4, Ll/ۛۢ᩵;->ۙ:Ll/ۛۢ᩵;

    invoke-virtual {v10, v2, v3, v4}, Ll/᩺ۜ᩵;->֫(Ljava/lang/String;Ll/ۨۢ᩵;Ll/ۛۢ᩵;)Ll/ܰۜ᩵;

    move-result-object v2

    .line 821
    instance-of v3, v2, Ll/᩹᩷᩵;

    if-eqz v3, :cond_7

    .line 822
    check-cast v2, Ll/᩹᩷᩵;

    invoke-virtual {v2, v7}, Ll/᩹᩷᩵;->֫(Z)Ll/᩶ۢ᩵;

    move-result-object v2

    .line 824
    invoke-virtual {v2}, Ll/᩶ۢ᩵;->ۚ()[B

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/᩶ۢ᩵;->֫([B)V

    .line 827
    :cond_7
    invoke-virtual {v0}, Ll/᩶ۢ᩵;->ۚ()[B

    move-result-object v2

    array-length v2, v2

    if-nez v2, :cond_8

    .line 828
    invoke-virtual {v0, v1}, Ll/᩶ۢ᩵;->֫([B)V

    .line 830
    :cond_8
    invoke-virtual {v0}, Ll/᩶ۢ᩵;->ܶ()Z

    move-result v1

    if-eqz v1, :cond_9

    return-object v0

    :cond_9
    return-object v8
.end method

.method public final ֫()V
    .locals 1

    .line 1688
    invoke-static {}, Ll/ۛ᩷᩵;->֫()Ll/ۛ᩷᩵;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/ۛ᩷᩵;->ۧ(Ll/ۡۢ᩵;)Ll/ۨ᩷᩵;

    move-result-object v0

    invoke-interface {v0}, Ll/ۨ᩷᩵;->֫()V

    return-void
.end method

.method public final ֫(I)V
    .locals 0

    .line 2290
    iput p1, p0, Ll/ۡۢ᩵;->ᩳ֫:I

    return-void
.end method

.method public final ֫(JLl/᩹᩷᩵;Ll/᩻ۢ᩵;)V
    .locals 4

    .line 1249
    invoke-virtual {p3, p0}, Ll/᩹᩷᩵;->֫(Ll/ۡۢ᩵;)Ll/ܶۢ᩵;

    move-result-object v1

    .line 1250
    sget-object v0, Ll/᩻ۢ᩵;->ۗ:Ll/᩻ۢ᩵;

    if-ne p4, v0, :cond_1

    sget-object v0, Ll/ۨۢ᩵;->ܳۧ:Ll/ۨۢ᩵;

    invoke-virtual {p3}, Ll/ܰۜ᩵;->ᩳ()Ll/ۨۢ᩵;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1343
    invoke-virtual {v1}, Ll/ܶۢ᩵;->ܽ()Ll/ۤۜ᩵;

    move-result-object v0

    .line 1344
    instance-of v2, v0, Ll/ܽ᩷᩵;

    if-nez v2, :cond_0

    goto :goto_0

    .line 1347
    :cond_0
    check-cast v0, Ll/ܽ᩷᩵;

    .line 1349
    invoke-virtual {p0, v0}, Ll/ۡۢ᩵;->֫(Ll/ܽ᩷᩵;)V

    .line 1257
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ۡۢ᩵;->۫:Ljava/util/List;

    monitor-enter v0

    .line 1258
    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Ll/ۡۢ᩵;->۫:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1259
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 1260
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽ᩷᩵;

    .line 682
    iget-object v3, p0, Ll/ۡۢ᩵;->᩸:Ll/᩺ۜ᩵;

    .line 1261
    invoke-interface {v2, v3, p1, p2, p3}, Ll/ܽ᩷᩵;->֫(Ll/᩺ۜ᩵;JLl/ܰۜ᩵;)V

    goto :goto_1

    .line 1274
    :cond_2
    sget-object p1, Ll/ۨۢ᩵;->᩺֫:Ll/ۨۢ᩵;

    .line 1275
    invoke-virtual {p3}, Ll/ܰۜ᩵;->ᩳ()Ll/ۨۢ᩵;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    sget-object p1, Ll/ۨۢ᩵;->ܳۧ:Ll/ۨۢ᩵;

    .line 1276
    invoke-virtual {p3}, Ll/ܰۜ᩵;->ᩳ()Ll/ۨۢ᩵;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    sget-object p1, Ll/᩻ۢ᩵;->ۗ:Ll/᩻ۢ᩵;

    invoke-virtual {p1, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    .line 1278
    :cond_3
    invoke-virtual {v1}, Ll/ܶۢ᩵;->ܽ()Ll/ۤۜ᩵;

    move-result-object p1

    const/4 p2, 0x0

    if-eqz p1, :cond_4

    invoke-virtual {v1}, Ll/ܶۢ᩵;->ܽ()Ll/ۤۜ᩵;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۤۜ᩵;->ܶ()Z

    move-result p1

    if-nez p1, :cond_5

    .line 1280
    :cond_4
    invoke-virtual {v1}, Ll/ܶۢ᩵;->ᩳ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1}, Ll/ܶۢ᩵;->getName()Ljava/lang/String;

    move-result-object p3

    const-string v0, ""

    invoke-virtual {p0, p1, p3, v0, p2}, Ll/ۡۢ᩵;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ll/᩶ۢ᩵;

    move-result-object p1

    .line 1281
    invoke-virtual {p1}, Ll/᩶ۢ᩵;->ܶ()Z

    move-result p3

    if-eqz p3, :cond_5

    .line 1282
    new-instance p3, Ll/ܶۢ᩵;

    invoke-virtual {v1}, Ll/ܶۢ᩵;->ᩳ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ll/ܶۢ᩵;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p3, p0, v0, v1, p1}, Ll/ܶۢ᩵;-><init>(Ll/ۡۢ᩵;Ljava/lang/String;Ljava/lang/String;Ll/ۤۜ᩵;)V

    move-object v1, p3

    .line 1286
    :cond_5
    iget-object p1, p0, Ll/ۡۢ᩵;->۟:Ll/ۧۤᩴ;

    invoke-virtual {v1}, Ll/ܶۢ᩵;->ᩳ()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_6

    move-object v0, p1

    .line 1289
    monitor-enter v0

    .line 1290
    :try_start_1
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1291
    monitor-exit v0

    goto :goto_2

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 1293
    :cond_6
    sget-object p3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 1295
    :goto_2
    sget-object p1, Ll/ۡۢ᩵;->᩻֫:Ll/֫᩻֨;

    .line 690
    iget-object v0, p0, Ll/ۡۢ᩵;->ۛ:Ljava/lang/String;

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, p2

    const/4 p2, 0x1

    aput-object v1, v2, p2

    const/4 p2, 0x2

    aput-object p3, v2, p2

    const/4 v0, 0x3

    aput-object p4, v2, v0

    .line 1295
    invoke-interface {p1, v2}, Ll/֫᩻֨;->ۧ([Ljava/lang/Object;)V

    .line 1301
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_b

    .line 1304
    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_9

    if-eq p1, p2, :cond_7

    goto :goto_5

    .line 1306
    :cond_7
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܺۢ᩵;

    .line 1307
    invoke-virtual {p2}, Ll/ۘۢ᩵;->ۧ()Z

    move-result p3

    if-eqz p3, :cond_8

    .line 1308
    invoke-virtual {p2, v1}, Ll/ܺۢ᩵;->֫(Ll/۬ۜ᩵;)V

    goto :goto_3

    .line 1310
    :cond_8
    iget-object p3, p0, Ll/ۡۢ᩵;->᩹:Ljava/util/concurrent/ExecutorService;

    new-instance p4, Ll/ᩳۢ᩵;

    invoke-direct {p4, p2, v1}, Ll/ᩳۢ᩵;-><init>(Ll/ܺۢ᩵;Ll/۬ۜ᩵;)V

    invoke-interface {p3, p4}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_3

    .line 1321
    :cond_9
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܺۢ᩵;

    .line 1322
    invoke-virtual {p2}, Ll/ۘۢ᩵;->ۧ()Z

    move-result p3

    if-eqz p3, :cond_a

    .line 1323
    invoke-virtual {p2, v1}, Ll/ܺۢ᩵;->ۧ(Ll/۬ۜ᩵;)V

    goto :goto_4

    .line 1325
    :cond_a
    iget-object p3, p0, Ll/ۡۢ᩵;->᩹:Ljava/util/concurrent/ExecutorService;

    new-instance p4, Ll/ܿۢ᩵;

    invoke-direct {p4, p2, v1}, Ll/ܿۢ᩵;-><init>(Ll/ܺۢ᩵;Ll/۬ۜ᩵;)V

    invoke-interface {p3, p4}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_4

    :cond_b
    :goto_5
    return-void

    :catchall_1
    move-exception p1

    .line 1259
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 1760
    invoke-static {}, Ll/ۛ᩷᩵;->֫()Ll/ۛ᩷᩵;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/ۛ᩷᩵;->ۧ(Ll/ۡۢ᩵;)Ll/ۨ᩷᩵;

    move-result-object v0

    invoke-interface {v0, p1}, Ll/ۨ᩷᩵;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ll/ۛۜ᩵;)V
    .locals 1

    const/4 v0, 0x0

    .line 942
    invoke-direct {p0, p1, p2, v0}, Ll/ۡۢ᩵;->֫(Ljava/lang/String;Ll/ۛۜ᩵;Z)V

    return-void
.end method

.method public final ֫(Ll/֫ۡ᩵;)V
    .locals 1

    .line 537
    iget-object v0, p0, Ll/ۡۢ᩵;->ۤ:Ll/۟᩷᩵;

    invoke-virtual {v0, p1}, Ll/۟᩷᩵;->֫(Ll/֫ۡ᩵;)V

    return-void
.end method

.method public final ֫(Ll/ۧ᩷᩵;)V
    .locals 7

    .line 1467
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 1472
    invoke-virtual {p1}, Ll/ᩳ᩷᩵;->֫()Ljava/util/ArrayList;

    move-result-object p1

    .line 1516
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1517
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1520
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩹᩷᩵;

    .line 1521
    invoke-virtual {v4}, Ll/ܰۜ᩵;->ᩳ()Ll/ۨۢ᩵;

    move-result-object v5

    sget-object v6, Ll/ۨۢ᩵;->ۙ:Ll/ۨۢ᩵;

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {v4}, Ll/ܰۜ᩵;->ᩳ()Ll/ۨۢ᩵;

    move-result-object v5

    sget-object v6, Ll/ۨۢ᩵;->۬:Ll/ۨۢ᩵;

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    .line 1524
    :cond_0
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1522
    :cond_1
    :goto_1
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1527
    :cond_2
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1474
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩹᩷᩵;

    .line 1475
    invoke-virtual {p0, v4, v0, v1}, Ll/ۡۢ᩵;->֫(Ll/᩹᩷᩵;J)V

    .line 1477
    sget-object v5, Ll/ۨۢ᩵;->ۙ:Ll/ۨۢ᩵;

    invoke-virtual {v4}, Ll/ܰۜ᩵;->ᩳ()Ll/ۨۢ᩵;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    sget-object v5, Ll/ۨۢ᩵;->۬:Ll/ۨۢ᩵;

    invoke-virtual {v4}, Ll/ܰۜ᩵;->ᩳ()Ll/ۨۢ᩵;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_3

    .line 1480
    :cond_3
    invoke-virtual {v4, p0}, Ll/᩹᩷᩵;->ܽ(Ll/ۡۢ᩵;)Z

    move-result v4

    or-int/2addr v3, v4

    goto :goto_2

    .line 1478
    :cond_4
    :goto_3
    invoke-virtual {v4, p0}, Ll/᩹᩷᩵;->ܽ(Ll/ۡۢ᩵;)Z

    move-result v4

    or-int/2addr v2, v4

    goto :goto_2

    :cond_5
    if-nez v2, :cond_7

    if-eqz v3, :cond_6

    goto :goto_4

    :cond_6
    return-void

    .line 1486
    :cond_7
    :goto_4
    invoke-virtual {p0}, Ll/ۡۢ᩵;->ᩳ()V

    return-void
.end method

.method public final ֫(Ll/ۧ᩷᩵;Ljava/net/InetAddress;I)V
    .locals 1

    .line 1769
    invoke-static {}, Ll/ۛ᩷᩵;->֫()Ll/ۛ᩷᩵;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/ۛ᩷᩵;->ۧ(Ll/ۡۢ᩵;)Ll/ۨ᩷᩵;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Ll/ۨ᩷᩵;->֫(Ll/ۧ᩷᩵;Ljava/net/InetAddress;I)V

    return-void
.end method

.method public final ֫(Ll/ܳ᩷᩵;)V
    .locals 6

    .line 1623
    invoke-virtual {p1}, Ll/ᩳ᩷᩵;->ۜ()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1627
    invoke-virtual {p1}, Ll/ܳ᩷᩵;->᩵()Ljava/net/InetSocketAddress;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1628
    invoke-virtual {p1}, Ll/ܳ᩷᩵;->᩵()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v0

    .line 1629
    invoke-virtual {p1}, Ll/ܳ᩷᩵;->᩵()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v1

    goto :goto_0

    .line 1631
    :cond_0
    iget-object v0, p0, Ll/ۡۢ᩵;->᩶:Ljava/net/InetAddress;

    .line 1632
    sget v1, Ll/۬ۢ᩵;->ܿ:I

    .line 1635
    :goto_0
    invoke-virtual {p1}, Ll/ܳ᩷᩵;->ᩴ()[B

    move-result-object p1

    .line 1636
    new-instance v2, Ljava/net/DatagramPacket;

    array-length v3, p1

    invoke-direct {v2, p1, v3, v0, v1}, Ljava/net/DatagramPacket;-><init>([BILjava/net/InetAddress;I)V

    .line 1638
    sget-object p1, Ll/ۡۢ᩵;->᩻֫:Ll/֫᩻֨;

    invoke-interface {p1}, Ll/֫᩻֨;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1640
    :try_start_0
    new-instance v0, Ll/ۧ᩷᩵;

    invoke-direct {v0, v2}, Ll/ۧ᩷᩵;-><init>(Ljava/net/DatagramPacket;)V

    .line 1641
    invoke-interface {p1}, Ll/֫᩻֨;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "send({}) JmDNS out:{}"

    .line 690
    iget-object v3, p0, Ll/ۡۢ᩵;->ۛ:Ljava/lang/String;

    .line 1642
    invoke-virtual {v0}, Ll/ۧ᩷᩵;->᩵()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v3, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 1645
    sget-object v0, Ll/ۡۢ᩵;->᩻֫:Ll/֫᩻֨;

    const-class v1, Ll/ۡۢ᩵;

    invoke-virtual {v1}, Ljava/lang/Class;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, ".send("

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 690
    iget-object v4, p0, Ll/ۡۢ᩵;->ۛ:Ljava/lang/String;

    const-string v5, ") - JmDNS can not parse what it sends!!!"

    .line 0
    invoke-static {v3, v4, v5}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 1645
    invoke-interface {v0, v1, v3, p1}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1648
    :cond_1
    :goto_1
    iget-object p1, p0, Ll/ۡۢ᩵;->ܽ֫:Ljava/net/MulticastSocket;

    if-eqz p1, :cond_2

    .line 1649
    invoke-virtual {p1}, Ljava/net/DatagramSocket;->isClosed()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1650
    invoke-virtual {p1, v2}, Ljava/net/DatagramSocket;->send(Ljava/net/DatagramPacket;)V

    :cond_2
    return-void
.end method

.method public final ֫(Ll/ܶۢ᩵;)V
    .locals 4

    .line 891
    iget-object v0, p0, Ll/ۡۢ᩵;->۟:Ll/ۧۤᩴ;

    invoke-virtual {p1}, Ll/ܶۢ᩵;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_0

    .line 893
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 894
    invoke-virtual {p1}, Ll/ܶۢ᩵;->ܽ()Ll/ۤۜ᩵;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ll/ܶۢ᩵;->ܽ()Ll/ۤۜ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۤۜ᩵;->ܶ()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, v1

    .line 896
    monitor-enter v0

    .line 897
    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 898
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 899
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܺۢ᩵;

    .line 900
    iget-object v2, p0, Ll/ۡۢ᩵;->᩹:Ljava/util/concurrent/ExecutorService;

    new-instance v3, Ll/֫ۢ᩵;

    invoke-direct {v3, v1, p1}, Ll/֫ۢ᩵;-><init>(Ll/ܺۢ᩵;Ll/ܶۢ᩵;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 898
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ܽ᩷᩵;)V
    .locals 1

    .line 1224
    iget-object v0, p0, Ll/ۡۢ᩵;->۫:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/᩶ۢ᩵;)V
    .locals 1

    .line 1742
    invoke-static {}, Ll/ۛ᩷᩵;->֫()Ll/ۛ᩷᩵;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/ۛ᩷᩵;->ۧ(Ll/ۡۢ᩵;)Ll/ۨ᩷᩵;

    move-result-object v0

    invoke-interface {v0, p1}, Ll/ۨ᩷᩵;->֫(Ll/᩶ۢ᩵;)V

    return-void
.end method

.method public final ֫(Ll/᩶ۢ᩵;Ll/ᩴ᩷᩵;)V
    .locals 7

    .line 1202
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 1205
    iget-object v2, p0, Ll/ۡۢ᩵;->۫:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1210
    invoke-virtual {p2}, Ll/ܰۜ᩵;->ۧ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Ll/ۡۢ᩵;->᩸:Ll/᩺ۜ᩵;

    invoke-virtual {v3, v2}, Ll/᩺ۜ᩵;->֫(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܰۜ᩵;

    if-eqz v4, :cond_0

    .line 224
    invoke-virtual {v4}, Ll/ܰۜ᩵;->ܽ()Ll/ۛۢ᩵;

    move-result-object v5

    invoke-virtual {p2}, Ll/ܰۜ᩵;->ܽ()Ll/ۛۢ᩵;

    move-result-object v6

    if-ne v5, v6, :cond_0

    .line 261
    invoke-virtual {p2, v4}, Ll/ܰۜ᩵;->ۧ(Ll/ܰۜ᩵;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {p2}, Ll/ܰۜ᩵;->ۧ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Ll/ܰۜ᩵;->ۧ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 1211
    invoke-virtual {v4, v0, v1}, Ll/ܰۜ᩵;->֫(J)Z

    move-result v5

    if-nez v5, :cond_0

    .line 1212
    invoke-virtual {p1, v3, v0, v1, v4}, Ll/᩶ۢ᩵;->֫(Ll/᩺ۜ᩵;JLl/ܰۜ᩵;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ֫(Ll/᩷ۡ᩵;)V
    .locals 1

    .line 593
    iget-object v0, p0, Ll/ۡۢ᩵;->ۤ:Ll/۟᩷᩵;

    invoke-virtual {v0, p1}, Ll/۟᩷᩵;->֫(Ll/᩷ۡ᩵;)V

    return-void
.end method

.method public final ֫(Ll/᩷ۡ᩵;Ll/۟ۢ᩵;)V
    .locals 1

    .line 585
    iget-object v0, p0, Ll/ۡۢ᩵;->ۤ:Ll/۟᩷᩵;

    invoke-virtual {v0, p1, p2}, Ll/۟᩷᩵;->֫(Ll/᩷ۡ᩵;Ll/۟ۢ᩵;)V

    return-void
.end method

.method public final ֫(Ll/᩹᩷᩵;J)V
    .locals 11

    .line 1355
    sget-object v0, Ll/᩻ۢ᩵;->᩶:Ll/᩻ۢ᩵;

    .line 1356
    invoke-virtual {p1, p2, p3}, Ll/᩹᩷᩵;->֫(J)Z

    move-result v1

    .line 1357
    sget-object v2, Ll/ۡۢ᩵;->᩻֫:Ll/֫᩻֨;

    const-string v3, "{} handle response: {}"

    .line 690
    iget-object v4, p0, Ll/ۡۢ᩵;->ۛ:Ljava/lang/String;

    .line 1357
    invoke-interface {v2, v3, v4, p1}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1360
    invoke-virtual {p1}, Ll/ܰۜ᩵;->ۜ()Z

    move-result v3

    if-nez v3, :cond_a

    invoke-virtual {p1}, Ll/ܰۜ᩵;->᩻()Z

    move-result v3

    if-nez v3, :cond_a

    .line 1361
    invoke-virtual {p1}, Ll/ܰۜ᩵;->᩷()Z

    move-result v3

    .line 682
    iget-object v4, p0, Ll/ۡۢ᩵;->᩸:Ll/᩺ۜ᩵;

    .line 1362
    invoke-virtual {v4, p1}, Ll/᩺ۜ᩵;->ۧ(Ll/᩹᩷᩵;)Ll/ܰۜ᩵;

    move-result-object v4

    check-cast v4, Ll/᩹᩷᩵;

    const-string v5, "{} handle response cached record: {}"

    .line 690
    iget-object v6, p0, Ll/ۡۢ᩵;->ۛ:Ljava/lang/String;

    .line 1363
    invoke-interface {v2, v5, v6, v4}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    if-eqz v3, :cond_1

    .line 682
    iget-object v2, p0, Ll/ۡۢ᩵;->᩸:Ll/᩺ۜ᩵;

    .line 1372
    invoke-virtual {p1}, Ll/ܰۜ᩵;->֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/᩺ۜ᩵;->֫(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܰۜ᩵;

    .line 1373
    invoke-virtual {p1}, Ll/ܰۜ᩵;->ᩳ()Ll/ۨۢ᩵;

    move-result-object v5

    invoke-virtual {v3}, Ll/ܰۜ᩵;->ᩳ()Ll/ۨۢ᩵;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 1374
    invoke-virtual {p1}, Ll/ܰۜ᩵;->ܽ()Ll/ۛۢ᩵;

    move-result-object v5

    invoke-virtual {v3}, Ll/ܰۜ᩵;->ܽ()Ll/ۛۢ᩵;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    move-object v5, v3

    check-cast v5, Ll/᩹᩷᩵;

    .line 1458
    invoke-virtual {v5}, Ll/᩹᩷᩵;->ۡ()J

    move-result-wide v6

    const-wide/16 v8, 0x3e8

    sub-long v8, p2, v8

    cmp-long v10, v6, v8

    if-gez v10, :cond_0

    .line 1377
    sget-object v6, Ll/ۡۢ᩵;->᩻֫:Ll/֫᩻֨;

    const-string v7, "setWillExpireSoon() on: {}"

    invoke-interface {v6, v3, v7}, Ll/֫᩻֨;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1379
    invoke-virtual {v5, p2, p3}, Ll/᩹᩷᩵;->ᩳ(J)V

    goto :goto_0

    :cond_1
    if-eqz v4, :cond_9

    if-eqz v1, :cond_3

    .line 1386
    invoke-virtual {p1}, Ll/᩹᩷᩵;->ۖ()I

    move-result v0

    if-nez v0, :cond_2

    .line 1387
    sget-object v0, Ll/᩻ۢ᩵;->᩶:Ll/᩻ۢ᩵;

    .line 1388
    sget-object v2, Ll/ۡۢ᩵;->᩻֫:Ll/֫᩻֨;

    const-string v3, "Record is expired - setWillExpireSoon() on:\n\t{}"

    invoke-interface {v2, v4, v3}, Ll/֫᩻֨;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1389
    invoke-virtual {v4, p2, p3}, Ll/᩹᩷᩵;->ᩳ(J)V

    goto/16 :goto_3

    .line 1392
    :cond_2
    sget-object v0, Ll/᩻ۢ᩵;->ۗ:Ll/᩻ۢ᩵;

    .line 1393
    sget-object v2, Ll/ۡۢ᩵;->᩻֫:Ll/֫᩻֨;

    const-string v3, "Record is expired - removeDNSEntry() on:\n\t{}"

    invoke-interface {v2, v4, v3}, Ll/֫᩻֨;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 682
    iget-object v2, p0, Ll/ۡۢ᩵;->᩸:Ll/᩺ۜ᩵;

    .line 1394
    invoke-virtual {v2, v4}, Ll/᩺ۜ᩵;->ܽ(Ll/᩹᩷᩵;)V

    goto/16 :goto_3

    .line 1398
    :cond_3
    invoke-virtual {p1, v4}, Ll/᩹᩷᩵;->ܽ(Ll/᩹᩷᩵;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 88
    invoke-virtual {p1}, Ll/ܰۜ᩵;->ܿ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4}, Ll/ܰۜ᩵;->ܿ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 1401
    invoke-virtual {p1}, Ll/ܰۜ᩵;->ܿ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_4

    goto :goto_1

    .line 1415
    :cond_4
    invoke-virtual {v4, p1}, Ll/᩹᩷᩵;->ۧ(Ll/᩹᩷᩵;)V

    move-object p1, v4

    goto/16 :goto_3

    .line 1404
    :cond_5
    :goto_1
    invoke-virtual {p1}, Ll/᩹᩷᩵;->ᩴ()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 1405
    sget-object v2, Ll/᩻ۢ᩵;->۬:Ll/᩻ۢ᩵;

    .line 1406
    sget-object v0, Ll/ۡۢ᩵;->᩻֫:Ll/֫᩻֨;

    const-string v3, "Record (singleValued) has changed - replaceDNSEntry() on:\n\t{}\n\t{}"

    invoke-interface {v0, v3, p1, v4}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 682
    iget-object v0, p0, Ll/ۡۢ᩵;->᩸:Ll/᩺ۜ᩵;

    .line 1407
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    invoke-virtual {p1}, Ll/ܰۜ᩵;->֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4}, Ll/ܰۜ᩵;->֫()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 259
    invoke-virtual {p1}, Ll/ܰۜ᩵;->֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-nez v3, :cond_6

    .line 261
    invoke-virtual {p1}, Ll/ܰۜ᩵;->֫()Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v3, v5}, Ll/ۧۤᩴ;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    invoke-virtual {p1}, Ll/ܰۜ᩵;->֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/List;

    :cond_6
    move-object v0, v3

    .line 264
    monitor-enter v0

    .line 265
    :try_start_0
    invoke-interface {v3, v4}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 266
    invoke-interface {v3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 267
    monitor-exit v0

    goto :goto_2

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_7
    :goto_2
    move-object v0, v2

    goto :goto_3

    .line 1410
    :cond_8
    sget-object v0, Ll/᩻ۢ᩵;->᩹:Ll/᩻ۢ᩵;

    .line 1411
    sget-object v2, Ll/ۡۢ᩵;->᩻֫:Ll/֫᩻֨;

    const-string v3, "Record (multiValue) has changed - addDNSEntry on:\n\t{}"

    invoke-interface {v2, p1, v3}, Ll/֫᩻֨;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 682
    iget-object v2, p0, Ll/ۡۢ᩵;->᩸:Ll/᩺ۜ᩵;

    .line 1412
    invoke-virtual {v2, p1}, Ll/᩺ۜ᩵;->֫(Ll/᩹᩷᩵;)V

    goto :goto_3

    :cond_9
    if-nez v1, :cond_a

    .line 1421
    sget-object v0, Ll/᩻ۢ᩵;->᩹:Ll/᩻ۢ᩵;

    .line 1422
    sget-object v2, Ll/ۡۢ᩵;->᩻֫:Ll/֫᩻֨;

    const-string v3, "Record not cached - addDNSEntry on:\n\t{}"

    invoke-interface {v2, p1, v3}, Ll/֫᩻֨;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 682
    iget-object v2, p0, Ll/ۡۢ᩵;->᩸:Ll/᩺ۜ᩵;

    .line 1423
    invoke-virtual {v2, p1}, Ll/᩺ۜ᩵;->֫(Ll/᩹᩷᩵;)V

    .line 1429
    :cond_a
    :goto_3
    invoke-virtual {p1}, Ll/ܰۜ᩵;->ᩳ()Ll/ۨۢ᩵;

    move-result-object v2

    sget-object v3, Ll/ۨۢ᩵;->᩺֫:Ll/ۨۢ᩵;

    if-ne v2, v3, :cond_c

    .line 1432
    invoke-virtual {p1}, Ll/ܰۜ᩵;->ۜ()Z

    move-result v2

    if-eqz v2, :cond_b

    if-nez v1, :cond_d

    .line 1435
    check-cast p1, Ll/۠᩷᩵;

    invoke-virtual {p1}, Ll/۠᩷᩵;->᩵()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۡۢ᩵;->ۧ(Ljava/lang/String;)Z

    return-void

    .line 1439
    :cond_b
    invoke-virtual {p1}, Ll/ܰۜ᩵;->ۧ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ll/ۡۢ᩵;->ۧ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 1440
    sget-object v1, Ll/᩻ۢ᩵;->᩶:Ll/᩻ۢ᩵;

    if-ne v0, v1, :cond_c

    .line 1441
    sget-object v0, Ll/᩻ۢ᩵;->ۙ:Ll/᩻ۢ᩵;

    .line 1446
    :cond_c
    sget-object v1, Ll/᩻ۢ᩵;->᩶:Ll/᩻ۢ᩵;

    if-eq v0, v1, :cond_d

    .line 1447
    invoke-virtual {p0, p2, p3, p1, v0}, Ll/ۡۢ᩵;->֫(JLl/᩹᩷᩵;Ll/᩻ۢ᩵;)V

    :cond_d
    return-void
.end method

.method public final ۖ()V
    .locals 1

    .line 1733
    invoke-static {}, Ll/ۛ᩷᩵;->֫()Ll/ۛ᩷᩵;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/ۛ᩷᩵;->ۧ(Ll/ۡۢ᩵;)Ll/ۨ᩷᩵;

    move-result-object v0

    invoke-interface {v0}, Ll/ۨ᩷᩵;->ۖ()V

    return-void
.end method

.method public final ۗ()Ll/ۧۤᩴ;
    .locals 1

    .line 2322
    iget-object v0, p0, Ll/ۡۢ᩵;->֫֫:Ll/ۧۤᩴ;

    return-object v0
.end method

.method public final ۘ()V
    .locals 1

    .line 1706
    invoke-static {}, Ll/ۛ᩷᩵;->֫()Ll/ۛ᩷᩵;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/ۛ᩷᩵;->ۧ(Ll/ۡۢ᩵;)Ll/ۨ᩷᩵;

    move-result-object v0

    invoke-interface {v0}, Ll/ۨ᩷᩵;->ۘ()V

    return-void
.end method

.method public final ۙ()Ll/۟᩷᩵;
    .locals 1

    .line 707
    iget-object v0, p0, Ll/ۡۢ᩵;->ۤ:Ll/۟᩷᩵;

    return-object v0
.end method

.method public final ۜ()V
    .locals 1

    .line 1724
    invoke-static {}, Ll/ۛ᩷᩵;->֫()Ll/ۛ᩷᩵;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/ۛ᩷᩵;->ۧ(Ll/ۡۢ᩵;)Ll/ۨ᩷᩵;

    move-result-object v0

    invoke-interface {v0}, Ll/ۨ᩷᩵;->ۜ()V

    return-void
.end method

.method public final ۟()Z
    .locals 1

    .line 641
    iget-object v0, p0, Ll/ۡۢ᩵;->ۤ:Ll/۟᩷᩵;

    invoke-virtual {v0}, Ll/۟᩷᩵;->ܿ()Z

    move-result v0

    return v0
.end method

.method public final ۤ()Ljava/net/MulticastSocket;
    .locals 1

    .line 2326
    iget-object v0, p0, Ll/ۡۢ᩵;->ܽ֫:Ljava/net/MulticastSocket;

    return-object v0
.end method

.method public final ۧ(J)V
    .locals 0

    .line 2282
    iput-wide p1, p0, Ll/ۡۢ᩵;->۬:J

    return-void
.end method

.method public final ۧ(Ljava/lang/String;Ll/ۛۜ᩵;)V
    .locals 4

    .line 991
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    .line 992
    iget-object v0, p0, Ll/ۡۢ᩵;->۟:Ll/ۧۤᩴ;

    invoke-virtual {v0, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_1

    move-object v0, v1

    .line 994
    monitor-enter v0

    .line 995
    :try_start_0
    new-instance v2, Ll/ܺۢ᩵;

    const/4 v3, 0x0

    invoke-direct {v2, p2, v3}, Ll/ܺۢ᩵;-><init>(Ll/ۛۜ᩵;Z)V

    .line 996
    invoke-interface {v1, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 997
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 998
    iget-object p2, p0, Ll/ۡۢ᩵;->۟:Ll/ۧۤᩴ;

    invoke-virtual {p2, p1, v1}, Ll/ۧۤᩴ;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1000
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    return-void
.end method

.method public final ۧ(Ll/ۧ᩷᩵;)V
    .locals 2

    .line 2302
    iget-object v0, p0, Ll/ۡۢ᩵;->ۗ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 1579
    :try_start_0
    iget-object v1, p0, Ll/ۡۢ᩵;->ۨ:Ll/ۧ᩷᩵;

    if-ne v1, p1, :cond_0

    const/4 p1, 0x0

    .line 1580
    iput-object p1, p0, Ll/ۡۢ᩵;->ۨ:Ll/ۧ᩷᩵;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2306
    :cond_0
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 1584
    throw p1
.end method

.method public final ۧ(Ll/ۧ᩷᩵;Ljava/net/InetAddress;I)V
    .locals 4

    const-string v0, "{} handle query: {}"

    .line 690
    iget-object v1, p0, Ll/ۡۢ᩵;->ۛ:Ljava/lang/String;

    .line 1541
    sget-object v2, Ll/ۡۢ᩵;->᩻֫:Ll/֫᩻֨;

    invoke-interface {v2, v0, v1, p1}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1544
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1545
    invoke-virtual {p1}, Ll/ᩳ᩷᩵;->֫()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹᩷᩵;

    .line 1546
    invoke-virtual {v2, p0}, Ll/᩹᩷᩵;->ۧ(Ll/ۡۢ᩵;)Z

    move-result v2

    or-int/2addr v1, v2

    goto :goto_0

    .line 2302
    :cond_0
    iget-object v0, p0, Ll/ۡۢ᩵;->ۗ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 1552
    :try_start_0
    iget-object v2, p0, Ll/ۡۢ᩵;->ۨ:Ll/ۧ᩷᩵;

    if-eqz v2, :cond_1

    .line 1553
    invoke-virtual {v2, p1}, Ll/ۧ᩷᩵;->֫(Ll/ۧ᩷᩵;)V

    goto :goto_1

    .line 1555
    :cond_1
    invoke-virtual {p1}, Ll/ۧ᩷᩵;->clone()Ll/ۧ᩷᩵;

    move-result-object v2

    .line 1556
    invoke-virtual {p1}, Ll/ᩳ᩷᩵;->ܺ()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 1557
    iput-object v2, p0, Ll/ۡۢ᩵;->ۨ:Ll/ۧ᩷᩵;

    .line 1559
    :cond_2
    invoke-virtual {p0, v2, p2, p3}, Ll/ۡۢ᩵;->֫(Ll/ۧ᩷᩵;Ljava/net/InetAddress;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2306
    :goto_1
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 1566
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    .line 144
    iget-object p1, p1, Ll/ᩳ᩷᩵;->ۧ:Ljava/util/List;

    .line 1567
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩹᩷᩵;

    .line 1568
    invoke-virtual {p0, v0, p2, p3}, Ll/ۡۢ᩵;->֫(Ll/᩹᩷᩵;J)V

    goto :goto_2

    :cond_3
    if-eqz v1, :cond_4

    .line 1572
    invoke-virtual {p0}, Ll/ۡۢ᩵;->ᩳ()V

    :cond_4
    return-void

    :catchall_0
    move-exception p1

    .line 2306
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 1564
    throw p1
.end method

.method public final ۧ(Ll/᩶ۢ᩵;)V
    .locals 4

    .line 649
    iget-object v0, p0, Ll/ۡۢ᩵;->ۤ:Ll/۟᩷᩵;

    invoke-virtual {v0}, Ll/۟᩷᩵;->ۜ()Z

    move-result v1

    iget-object v2, v0, Ll/۟᩷᩵;->᩸:Ljava/net/InetAddress;

    if-nez v1, :cond_6

    .line 657
    invoke-virtual {v0}, Ll/۟᩷᩵;->᩻()Z

    move-result v1

    if-nez v1, :cond_6

    .line 1014
    invoke-virtual {p1}, Ll/᩶ۢ᩵;->ۗ()Ll/ۡۢ᩵;

    move-result-object v1

    iget-object v3, p0, Ll/ۡۢ᩵;->ۧ֫:Ll/ۧۤᩴ;

    if-eqz v1, :cond_2

    .line 1015
    invoke-virtual {p1}, Ll/᩶ۢ᩵;->ۗ()Ll/ۡۢ᩵;

    move-result-object v1

    if-ne v1, p0, :cond_1

    .line 1017
    invoke-virtual {p1}, Ll/᩶ۢ᩵;->ۢ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 1018
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "A service information can only be registered once."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1016
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "A service information can only be registered with a single instamce of JmDNS."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1021
    :cond_2
    :goto_0
    invoke-virtual {p1, p0}, Ll/᩶ۢ᩵;->֫(Ll/ۡۢ᩵;)V

    .line 1023
    invoke-virtual {p1}, Ll/᩶ۢ᩵;->ۤ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ll/ۡۢ᩵;->ۧ(Ljava/lang/String;)Z

    .line 1026
    invoke-virtual {p1}, Ll/᩶ۢ᩵;->۟()Z

    .line 134
    iget-object v0, v0, Ll/۟᩷᩵;->᩶:Ljava/lang/String;

    .line 1027
    invoke-virtual {p1, v0}, Ll/᩶ۢ᩵;->ۧ(Ljava/lang/String;)V

    .line 142
    instance-of v0, v2, Ljava/net/Inet4Address;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 143
    move-object v0, v2

    check-cast v0, Ljava/net/Inet4Address;

    goto :goto_1

    :cond_3
    move-object v0, v1

    .line 1028
    :goto_1
    invoke-virtual {p1, v0}, Ll/᩶ۢ᩵;->֫(Ljava/net/Inet4Address;)V

    .line 149
    instance-of v0, v2, Ljava/net/Inet6Address;

    if-eqz v0, :cond_4

    .line 150
    move-object v1, v2

    check-cast v1, Ljava/net/Inet6Address;

    .line 1029
    :cond_4
    invoke-virtual {p1, v1}, Ll/᩶ۢ᩵;->֫(Ljava/net/Inet6Address;)V

    .line 1031
    invoke-direct {p0, p1}, Ll/ۡۢ᩵;->ܽ(Ll/᩶ۢ᩵;)V

    .line 1032
    :goto_2
    invoke-virtual {p1}, Ll/᩶ۢ᩵;->ۢ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0, p1}, Ll/ۧۤᩴ;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 1033
    invoke-direct {p0, p1}, Ll/ۡۢ᩵;->ܽ(Ll/᩶ۢ᩵;)V

    goto :goto_2

    .line 1036
    :cond_5
    invoke-virtual {p0}, Ll/ۡۢ᩵;->ᩳ()V

    .line 1038
    sget-object v0, Ll/ۡۢ᩵;->᩻֫:Ll/֫᩻֨;

    const-string v1, "registerService() JmDNS registered service as {}"

    invoke-interface {v0, p1, v1}, Ll/֫᩻֨;->ܿ(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    .line 1010
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This DNS is closed."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ(Ljava/lang/String;)Z
    .locals 13

    .line 1096
    invoke-static {p1}, Ll/ۙۢ᩵;->֫(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v0

    .line 1097
    sget-object v1, Ll/۫ۜ᩵;->᩶:Ll/۫ۜ᩵;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 1098
    sget-object v2, Ll/۫ۜ᩵;->ۗ:Ll/۫ۜ᩵;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 1099
    sget-object v3, Ll/۫ۜ᩵;->᩹:Ll/۫ۜ᩵;

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 1100
    sget-object v4, Ll/۫ۜ᩵;->۬:Ll/۫ۜ᩵;

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 1102
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_0

    const-string v5, "_"

    const-string v6, "."

    .line 0
    invoke-static {v5, v3, v6}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_0
    const-string v5, ""

    .line 1102
    :goto_0
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_1

    const-string v5, "_"

    const-string v6, "."

    .line 0
    invoke-static {v5, v2, v6}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    const-string v2, ""

    :goto_1
    const-string v5, "."

    invoke-static {v0, v2, v1, v5}, Ll/᩺᩵ܿ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1103
    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    .line 1104
    sget-object v5, Ll/ۡۢ᩵;->᩻֫:Ll/֫᩻֨;

    const-string v6, "{} registering service type: {} as: {}{}{}"

    .line 690
    iget-object v7, p0, Ll/ۡۢ᩵;->ۛ:Ljava/lang/String;

    .line 1108
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v8

    if-lez v8, :cond_2

    const-string v8, " subtype: "

    goto :goto_2

    :cond_2
    const-string v8, ""

    .line 1109
    :goto_2
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v9

    if-lez v9, :cond_3

    move-object v9, v4

    goto :goto_3

    :cond_3
    const-string v9, ""

    :goto_3
    const/4 v10, 0x5

    new-array v10, v10, [Ljava/lang/Object;

    const/4 v11, 0x0

    aput-object v7, v10, v11

    const/4 v7, 0x1

    aput-object p1, v10, v7

    const/4 p1, 0x2

    aput-object v2, v10, p1

    const/4 p1, 0x3

    aput-object v8, v10, p1

    const/4 p1, 0x4

    aput-object v9, v10, p1

    .line 1104
    invoke-interface {v5, v6, v10}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1111
    iget-object p1, p0, Ll/ۡۢ᩵;->֫֫:Ll/ۧۤᩴ;

    invoke-virtual {p1, v0}, Ll/ۧۤᩴ;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    const/4 v5, 0x0

    if-nez p1, :cond_5

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    const-string v3, "dns-sd"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    const-string v3, "in-addr.arpa"

    invoke-virtual {p1, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_5

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    const-string v1, "ip6.arpa"

    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_5

    .line 1112
    iget-object p1, p0, Ll/ۡۢ᩵;->֫֫:Ll/ۧۤᩴ;

    new-instance v1, Ll/ۢۢ᩵;

    invoke-direct {v1, v2}, Ll/ۢۢ᩵;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0, v1}, Ll/ۧۤᩴ;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_4

    const/4 p1, 0x1

    goto :goto_4

    :cond_4
    const/4 p1, 0x0

    :goto_4
    if-eqz p1, :cond_6

    .line 1114
    iget-object v1, p0, Ll/ۡۢ᩵;->ܿ֫:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v3

    new-array v3, v3, [Ll/ۖۢ᩵;

    invoke-interface {v1, v3}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ll/ۖۢ᩵;

    .line 1115
    new-instance v3, Ll/ܶۢ᩵;

    const-string v6, ""

    invoke-direct {v3, p0, v2, v6, v5}, Ll/ܶۢ᩵;-><init>(Ll/ۡۢ᩵;Ljava/lang/String;Ljava/lang/String;Ll/ۤۜ᩵;)V

    .line 1116
    array-length v6, v1

    const/4 v8, 0x0

    :goto_5
    if-ge v8, v6, :cond_6

    aget-object v9, v1, v8

    .line 1117
    iget-object v10, p0, Ll/ۡۢ᩵;->᩹:Ljava/util/concurrent/ExecutorService;

    new-instance v12, Ll/ۧۢ᩵;

    invoke-direct {v12, v9, v3}, Ll/ۧۢ᩵;-><init>(Ll/ۖۢ᩵;Ll/ܶۢ᩵;)V

    invoke-interface {v10, v12}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    add-int/lit8 v8, v8, 0x1

    goto :goto_5

    :cond_5
    const/4 p1, 0x0

    .line 1127
    :cond_6
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_a

    .line 1128
    iget-object v1, p0, Ll/ۡۢ᩵;->֫֫:Ll/ۧۤᩴ;

    invoke-virtual {v1, v0}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ll/ۢۢ᩵;

    if-eqz v1, :cond_a

    .line 237
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    return p1

    :cond_7
    move-object v0, v1

    .line 1130
    monitor-enter v0

    .line 237
    :try_start_0
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    .line 1133
    invoke-virtual {v1, v4}, Ll/ۢۢ᩵;->֫(Ljava/lang/String;)V

    .line 1134
    iget-object p1, p0, Ll/ۡۢ᩵;->ܿ֫:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v1

    new-array v1, v1, [Ll/ۖۢ᩵;

    invoke-interface {p1, v1}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ll/ۖۢ᩵;

    .line 1135
    new-instance v1, Ll/ܶۢ᩵;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "_"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "._sub."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    invoke-direct {v1, p0, v2, v3, v5}, Ll/ܶۢ᩵;-><init>(Ll/ۡۢ᩵;Ljava/lang/String;Ljava/lang/String;Ll/ۤۜ᩵;)V

    .line 1136
    array-length v2, p1

    :goto_6
    if-ge v11, v2, :cond_9

    aget-object v3, p1, v11

    .line 1137
    iget-object v4, p0, Ll/ۡۢ᩵;->᩹:Ljava/util/concurrent/ExecutorService;

    new-instance v5, Ll/ܽۢ᩵;

    invoke-direct {v5, v3, v1}, Ll/ܽۢ᩵;-><init>(Ll/ۖۢ᩵;Ll/ܶۢ᩵;)V

    invoke-interface {v4, v5}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    add-int/lit8 v11, v11, 0x1

    goto :goto_6

    :cond_8
    move v7, p1

    .line 1146
    :cond_9
    monitor-exit v0

    return v7

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_a
    return p1
.end method

.method public final ۧ(Ll/᩷ۡ᩵;Ll/۟ۢ᩵;)Z
    .locals 1

    .line 601
    iget-object v0, p0, Ll/ۡۢ᩵;->ۤ:Ll/۟᩷᩵;

    invoke-virtual {v0, p1, p2}, Ll/۟᩷᩵;->ۧ(Ll/᩷ۡ᩵;Ll/۟ۢ᩵;)Z

    move-result p1

    return p1
.end method

.method public final ۧ֫()Z
    .locals 1

    .line 633
    iget-object v0, p0, Ll/ۡۢ᩵;->ۤ:Ll/۟᩷᩵;

    invoke-virtual {v0}, Ll/۟᩷᩵;->ܳ()Z

    move-result v0

    return v0
.end method

.method public final ۬()Ljava/util/concurrent/ConcurrentMap;
    .locals 1

    .line 2278
    iget-object v0, p0, Ll/ۡۢ᩵;->ۧ֫:Ll/ۧۤᩴ;

    return-object v0
.end method

.method public final ܰ()Z
    .locals 1

    .line 625
    iget-object v0, p0, Ll/ۡۢ᩵;->ۤ:Ll/۟᩷᩵;

    invoke-virtual {v0}, Ll/۟᩷᩵;->ᩳ()Z

    move-result v0

    return v0
.end method

.method public final ܳ()V
    .locals 1

    .line 1715
    invoke-static {}, Ll/ۛ᩷᩵;->֫()Ll/ۛ᩷᩵;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/ۛ᩷᩵;->ۧ(Ll/ۡۢ᩵;)Ll/ۨ᩷᩵;

    move-result-object v0

    invoke-interface {v0}, Ll/ۨ᩷᩵;->ܳ()V

    return-void
.end method

.method public final ܳ֫()V
    .locals 5

    .line 1798
    sget-object v1, Ll/ۡۢ᩵;->᩻֫:Ll/֫᩻֨;

    const-string v0, "{}.recover()"

    .line 690
    iget-object v2, p0, Ll/ۡۢ᩵;->ۛ:Ljava/lang/String;

    .line 1798
    invoke-interface {v1, v2, v0}, Ll/֫᩻֨;->ܿ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 649
    iget-object v0, p0, Ll/ۡۢ᩵;->ۤ:Ll/۟᩷᩵;

    invoke-virtual {v0}, Ll/۟᩷᩵;->ۜ()Z

    move-result v0

    if-nez v0, :cond_2

    .line 657
    iget-object v0, p0, Ll/ۡۢ᩵;->ۤ:Ll/۟᩷᩵;

    invoke-virtual {v0}, Ll/۟᩷᩵;->᩻()Z

    move-result v0

    if-nez v0, :cond_2

    .line 633
    iget-object v0, p0, Ll/ۡۢ᩵;->ۤ:Ll/۟᩷᩵;

    invoke-virtual {v0}, Ll/۟᩷᩵;->ܳ()Z

    move-result v0

    if-nez v0, :cond_2

    .line 641
    iget-object v0, p0, Ll/ۡۢ᩵;->ۤ:Ll/۟᩷᩵;

    invoke-virtual {v0}, Ll/۟᩷᩵;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1807
    :cond_0
    iget-object v0, p0, Ll/ۡۢ᩵;->᩺:Ljava/lang/Object;

    monitor-enter v0

    .line 553
    :try_start_0
    iget-object v2, p0, Ll/ۡۢ᩵;->ۤ:Ll/۟᩷᩵;

    invoke-virtual {v2}, Ll/۟᩷᩵;->֫()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1811
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 690
    iget-object v3, p0, Ll/ۡۢ᩵;->ۛ:Ljava/lang/String;

    .line 1811
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ".recover()"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "{} thread {}"

    .line 1812
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v3, v2, v4}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1813
    new-instance v1, Ll/ܳۢ᩵;

    invoke-direct {v1, p0, v2}, Ll/ܳۢ᩵;-><init>(Ll/ۡۢ᩵;Ljava/lang/String;)V

    .line 1822
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 1824
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_2
    :goto_0
    return-void
.end method

.method public final ܶ()Ll/᩺ۜ᩵;
    .locals 1

    .line 682
    iget-object v0, p0, Ll/ۡۢ᩵;->᩸:Ll/᩺ۜ᩵;

    return-object v0
.end method

.method public final ܽ()V
    .locals 1

    .line 1679
    invoke-static {}, Ll/ۛ᩷᩵;->֫()Ll/ۛ᩷᩵;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/ۛ᩷᩵;->ۧ(Ll/ۡۢ᩵;)Ll/ۨ᩷᩵;

    move-result-object v0

    invoke-interface {v0}, Ll/ۨ᩷᩵;->ܽ()V

    return-void
.end method

.method public final ܿ֫()Z
    .locals 1

    .line 609
    iget-object v0, p0, Ll/ۡۢ᩵;->ۤ:Ll/۟᩷᩵;

    invoke-virtual {v0}, Ll/۟᩷᩵;->᩷()Z

    move-result v0

    return v0
.end method

.method public final ᩳ()V
    .locals 1

    .line 1697
    invoke-static {}, Ll/ۛ᩷᩵;->֫()Ll/ۛ᩷᩵;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/ۛ᩷᩵;->ۧ(Ll/ۡۢ᩵;)Ll/ۨ᩷᩵;

    move-result-object v0

    invoke-interface {v0}, Ll/ۨ᩷᩵;->ᩳ()V

    return-void
.end method

.method public final ᩳ֫()Z
    .locals 1

    .line 649
    iget-object v0, p0, Ll/ۡۢ᩵;->ۤ:Ll/۟᩷᩵;

    invoke-virtual {v0}, Ll/۟᩷᩵;->ۜ()Z

    move-result v0

    return v0
.end method

.method public final ᩴ()V
    .locals 1

    .line 1670
    invoke-static {}, Ll/ۛ᩷᩵;->֫()Ll/ۛ᩷᩵;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/ۛ᩷᩵;->ۧ(Ll/ۡۢ᩵;)Ll/ۨ᩷᩵;

    move-result-object v0

    invoke-interface {v0}, Ll/ۨ᩷᩵;->ᩴ()V

    return-void
.end method

.method public final ᩵()V
    .locals 6

    .line 1830
    sget-object v0, Ll/ۡۢ᩵;->᩻֫:Ll/֫᩻֨;

    iget-object v1, p0, Ll/ۡۢ᩵;->ۛ:Ljava/lang/String;

    const-string v2, "{}.recover() Cleanning up"

    invoke-interface {v0, v1, v2}, Ll/֫᩻֨;->ܿ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "RECOVERING"

    .line 1832
    invoke-interface {v0, v2}, Ll/֫᩻֨;->ᩳ(Ljava/lang/String;)V

    .line 1834
    invoke-virtual {p0}, Ll/ۡۢ᩵;->᩻()V

    .line 1837
    new-instance v2, Ljava/util/ArrayList;

    .line 2278
    iget-object v3, p0, Ll/ۡۢ᩵;->ۧ֫:Ll/ۧۤᩴ;

    .line 1837
    invoke-virtual {v3}, Ll/ۧۤᩴ;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1840
    invoke-virtual {p0}, Ll/ۡۢ᩵;->᩷֫()V

    .line 1841
    invoke-direct {p0}, Ll/ۡۢ᩵;->ۖ֫()V

    .line 673
    iget-object v3, p0, Ll/ۡۢ᩵;->ۤ:Ll/۟᩷᩵;

    invoke-virtual {v3}, Ll/۟᩷᩵;->ܺ()Z

    .line 1846
    invoke-virtual {p0}, Ll/ۡۢ᩵;->ᩴ()V

    .line 1850
    invoke-direct {p0}, Ll/ۡۢ᩵;->ܺ֫()V

    .line 682
    iget-object v4, p0, Ll/ۡۢ᩵;->᩸:Ll/᩺ۜ᩵;

    .line 1853
    invoke-virtual {v4}, Ll/ۧۤᩴ;->clear()V

    const-string v4, "{}.recover() All is clean"

    .line 1854
    invoke-interface {v0, v1, v4}, Ll/֫᩻֨;->ܿ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 641
    invoke-virtual {v3}, Ll/۟᩷᩵;->ܿ()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 1860
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۤۜ᩵;

    .line 1861
    check-cast v5, Ll/᩶ۢ᩵;

    invoke-virtual {v5}, Ll/᩶ۢ᩵;->۟()Z

    goto :goto_0

    .line 569
    :cond_0
    invoke-virtual {v3}, Ll/۟᩷᩵;->ۢ()Z

    .line 1866
    :try_start_0
    invoke-direct {p0, v3}, Ll/ۡۢ᩵;->֫(Ll/۟᩷᩵;)V

    .line 1867
    invoke-direct {p0, v2}, Ll/ۡۢ᩵;->֫(Ljava/util/Collection;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v2

    .line 1869
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ".recover() Start services exception "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3, v2}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    const-string v2, "{}.recover() We are back!"

    .line 1871
    invoke-interface {v0, v1, v2}, Ll/֫᩻֨;->ᩳ(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :cond_1
    const-string v2, "{}.recover() Could not recover we are Down!"

    .line 1874
    invoke-interface {v0, v1, v2}, Ll/֫᩻֨;->ᩳ(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final ᩶()J
    .locals 2

    .line 2286
    iget-wide v0, p0, Ll/ۡۢ᩵;->۬:J

    return-wide v0
.end method

.method public final ᩷֫()V
    .locals 7

    const-string v0, "unregisterAllServices()"

    .line 1065
    sget-object v1, Ll/ۡۢ᩵;->᩻֫:Ll/֫᩻֨;

    invoke-interface {v1, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 1067
    iget-object v0, p0, Ll/ۡۢ᩵;->ۧ֫:Ll/ۧۤᩴ;

    invoke-virtual {v0}, Ll/ۧۤᩴ;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۤۜ᩵;

    if-eqz v3, :cond_0

    .line 1069
    move-object v4, v3

    check-cast v4, Ll/᩶ۢ᩵;

    const-string v5, "Cancelling service info: {}"

    .line 1070
    invoke-interface {v1, v3, v5}, Ll/֫᩻֨;->ܿ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1071
    invoke-virtual {v4}, Ll/᩶ۢ᩵;->᩶()Z

    goto :goto_0

    .line 1074
    :cond_1
    invoke-virtual {p0}, Ll/ۡۢ᩵;->ۜ()V

    .line 1076
    invoke-virtual {v0}, Ll/ۧۤᩴ;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 1077
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۤۜ᩵;

    if-eqz v4, :cond_2

    .line 1079
    move-object v5, v4

    check-cast v5, Ll/᩶ۢ᩵;

    .line 1080
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v6, "Wait for service info cancel: {}"

    .line 1082
    invoke-interface {v1, v4, v6}, Ll/֫᩻֨;->ܿ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1083
    invoke-virtual {v5}, Ll/᩶ۢ᩵;->ܽ֫()Z

    .line 1084
    invoke-virtual {v0, v3, v4}, Ll/ۧۤᩴ;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final ᩸()Ljava/net/InetAddress;
    .locals 1

    .line 2330
    iget-object v0, p0, Ll/ۡۢ᩵;->᩶:Ljava/net/InetAddress;

    return-object v0
.end method

.method public final ᩹()Ljava/net/InetAddress;
    .locals 1

    .line 715
    iget-object v0, p0, Ll/ۡۢ᩵;->ۤ:Ll/۟᩷᩵;

    .line 138
    iget-object v0, v0, Ll/۟᩷᩵;->᩸:Ljava/net/InetAddress;

    return-object v0
.end method

.method public final ᩺()I
    .locals 1

    .line 2294
    iget v0, p0, Ll/ۡۢ᩵;->ᩳ֫:I

    return v0
.end method

.method public final ᩻()V
    .locals 1

    .line 1661
    invoke-static {}, Ll/ۛ᩷᩵;->֫()Ll/ۛ᩷᩵;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/ۛ᩷᩵;->ۧ(Ll/ۡۢ᩵;)Ll/ۨ᩷᩵;

    move-result-object v0

    invoke-interface {v0}, Ll/ۨ᩷᩵;->᩻()V

    return-void
.end method

.method public final ᩻֫()V
    .locals 1

    .line 545
    iget-object v0, p0, Ll/ۡۢ᩵;->ۤ:Ll/۟᩷᩵;

    invoke-virtual {v0}, Ll/۟᩷᩵;->ۡ()V

    return-void
.end method
