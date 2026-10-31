.class public final Ll/ۢ֡ۢ;
.super Ljava/lang/Object;
.source "T7B2"


# instance fields
.field public final ֫:Landroid/content/Context;

.field public final ۧ:Ll/᩶۫᩷;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ll/᩶۫᩷;)V
    .locals 0

    .line 533
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 534
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ll/ۢ֡ۢ;->֫:Landroid/content/Context;

    .line 535
    iput-object p2, p0, Ll/ۢ֡ۢ;->ۧ:Ll/᩶۫᩷;

    return-void
.end method

.method public static ֫(Landroid/net/ConnectivityManager;Landroid/net/Network;Ljava/net/Inet4Address;)Ll/ᩴ֡ۢ;
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    goto :goto_1

    .line 595
    :cond_0
    invoke-virtual {p0, p1}, Landroid/net/ConnectivityManager;->getLinkProperties(Landroid/net/Network;)Landroid/net/LinkProperties;

    move-result-object p0

    if-nez p0, :cond_1

    goto :goto_1

    .line 614
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 615
    invoke-virtual {p0}, Landroid/net/LinkProperties;->getLinkAddresses()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/LinkAddress;

    .line 616
    invoke-virtual {v2}, Landroid/net/LinkAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v3

    .line 617
    instance-of v4, v3, Ljava/net/Inet4Address;

    if-nez v4, :cond_3

    goto :goto_0

    .line 620
    :cond_3
    new-instance v4, Ll/ۘ֡ۢ;

    invoke-virtual {v2}, Landroid/net/LinkAddress;->getPrefixLength()I

    move-result v2

    invoke-direct {v4, v3, v2}, Ll/ۘ֡ۢ;-><init>(Ljava/net/InetAddress;I)V

    .line 621
    invoke-virtual {v4, p2}, Ll/ۘ֡ۢ;->֫(Ljava/net/InetAddress;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 622
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 600
    :cond_4
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    :goto_1
    return-object v0

    .line 633
    :cond_5
    invoke-virtual {p0}, Landroid/net/LinkProperties;->getRoutes()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/RouteInfo;

    .line 634
    invoke-virtual {v1}, Landroid/net/RouteInfo;->isDefaultRoute()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {v1}, Landroid/net/RouteInfo;->getGateway()Ljava/net/InetAddress;

    move-result-object v2

    invoke-static {v2}, Ll/᩵֡ۢ;->֫(Ljava/net/InetAddress;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 635
    invoke-virtual {v1}, Landroid/net/RouteInfo;->getGateway()Ljava/net/InetAddress;

    move-result-object p0

    goto :goto_2

    :cond_7
    move-object p0, v0

    :goto_2
    if-eqz p0, :cond_8

    .line 604
    invoke-static {p1, p0}, Ll/ۢ֡ۢ;->֫(Ljava/util/List;Ljava/net/InetAddress;)Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_3

    :cond_8
    move-object v0, p0

    .line 607
    :goto_3
    new-instance p0, Ll/ᩴ֡ۢ;

    invoke-direct {p0, p2, v0, p1}, Ll/ᩴ֡ۢ;-><init>(Ljava/net/InetAddress;Ljava/net/InetAddress;Ljava/util/List;)V

    return-object p0
.end method

.method private ֫(Ljava/net/Inet4Address;)Ll/ᩴ֡ۢ;
    .locals 4

    .line 656
    iget-object v0, p0, Ll/ۢ֡ۢ;->֫:Landroid/content/Context;

    const-string v1, "wifi"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiManager;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 658
    new-instance v0, Ll/ᩴ֡ۢ;

    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {v0, p1, v1, v2}, Ll/ᩴ֡ۢ;-><init>(Ljava/net/InetAddress;Ljava/net/InetAddress;Ljava/util/List;)V

    return-object v0

    .line 660
    :cond_0
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getDhcpInfo()Landroid/net/DhcpInfo;

    move-result-object v0

    if-nez v0, :cond_1

    .line 662
    new-instance v0, Ll/ᩴ֡ۢ;

    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {v0, p1, v1, v2}, Ll/ᩴ֡ۢ;-><init>(Ljava/net/InetAddress;Ljava/net/InetAddress;Ljava/util/List;)V

    return-object v0

    .line 664
    :cond_1
    iget v2, v0, Landroid/net/DhcpInfo;->ipAddress:I

    invoke-static {v2}, Ll/᩵֡ۢ;->֫(I)Ljava/net/InetAddress;

    move-result-object v2

    .line 665
    invoke-virtual {p1, v2}, Ljava/net/InetAddress;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 666
    new-instance v0, Ll/ᩴ֡ۢ;

    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {v0, p1, v1, v2}, Ll/ᩴ֡ۢ;-><init>(Ljava/net/InetAddress;Ljava/net/InetAddress;Ljava/util/List;)V

    return-object v0

    .line 683
    :cond_2
    iget v2, v0, Landroid/net/DhcpInfo;->netmask:I

    invoke-static {v2}, Ll/᩵֡ۢ;->ᩳ(I)I

    move-result v2

    if-gez v2, :cond_3

    .line 685
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_0

    .line 687
    :cond_3
    new-instance v3, Ll/ۘ֡ۢ;

    invoke-direct {v3, p1, v2}, Ll/ۘ֡ۢ;-><init>(Ljava/net/InetAddress;I)V

    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 669
    :goto_0
    iget v0, v0, Landroid/net/DhcpInfo;->gateway:I

    invoke-static {v0}, Ll/᩵֡ۢ;->ܽ(I)Ljava/net/InetAddress;

    move-result-object v0

    .line 670
    invoke-static {v0}, Ll/᩵֡ۢ;->֫(Ljava/net/InetAddress;)Z

    move-result v3

    if-nez v3, :cond_4

    move-object v0, v1

    :cond_4
    if-eqz v0, :cond_5

    .line 673
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_5

    invoke-static {v2, v0}, Ll/ۢ֡ۢ;->֫(Ljava/util/List;Ljava/net/InetAddress;)Z

    move-result v3

    if-nez v3, :cond_5

    .line 674
    new-instance v0, Ll/ᩴ֡ۢ;

    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {v0, p1, v1, v2}, Ll/ᩴ֡ۢ;-><init>(Ljava/net/InetAddress;Ljava/net/InetAddress;Ljava/util/List;)V

    return-object v0

    .line 676
    :cond_5
    new-instance v1, Ll/ᩴ֡ۢ;

    invoke-direct {v1, p1, v0, v2}, Ll/ᩴ֡ۢ;-><init>(Ljava/net/InetAddress;Ljava/net/InetAddress;Ljava/util/List;)V

    return-object v1
.end method

.method public static ֫(Ljava/util/List;Ljava/net/InetAddress;)Z
    .locals 1

    .line 694
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘ֡ۢ;

    .line 695
    invoke-virtual {v0, p1}, Ll/ۘ֡ۢ;->֫(Ljava/net/InetAddress;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final ֫()Ll/ᩴ֡ۢ;
    .locals 7

    .line 543
    iget-object v0, p0, Ll/ۢ֡ۢ;->ۧ:Ll/᩶۫᩷;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ll/۬ۘۢ;->ۧ()Ljava/net/Inet4Address;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    .line 375
    invoke-virtual {v0}, Ljava/net/InetAddress;->isAnyLocalAddress()Z

    move-result v2

    if-nez v2, :cond_8

    .line 376
    invoke-virtual {v0}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    move-result v2

    if-nez v2, :cond_8

    .line 377
    invoke-virtual {v0}, Ljava/net/InetAddress;->isMulticastAddress()Z

    move-result v2

    if-nez v2, :cond_8

    .line 378
    invoke-virtual {v0}, Ljava/net/InetAddress;->isLinkLocalAddress()Z

    move-result v2

    if-nez v2, :cond_8

    .line 564
    iget-object v2, p0, Ll/ۢ֡ۢ;->֫:Landroid/content/Context;

    const-string v3, "connectivity"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/ConnectivityManager;

    if-nez v2, :cond_0

    .line 566
    new-instance v2, Ll/ᩴ֡ۢ;

    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {v2, v0, v1, v3}, Ll/ᩴ֡ۢ;-><init>(Ljava/net/InetAddress;Ljava/net/InetAddress;Ljava/util/List;)V

    goto :goto_1

    .line 568
    :cond_0
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x17

    if-lt v3, v4, :cond_1

    .line 569
    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v3

    .line 570
    invoke-static {v2, v3, v0}, Ll/ۢ֡ۢ;->֫(Landroid/net/ConnectivityManager;Landroid/net/Network;Ljava/net/Inet4Address;)Ll/ᩴ֡ۢ;

    move-result-object v3

    if-eqz v3, :cond_1

    move-object v2, v3

    goto :goto_1

    .line 575
    :cond_1
    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getAllNetworks()[Landroid/net/Network;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 577
    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_3

    aget-object v6, v3, v5

    .line 578
    invoke-static {v2, v6, v0}, Ll/ۢ֡ۢ;->֫(Landroid/net/ConnectivityManager;Landroid/net/Network;Ljava/net/Inet4Address;)Ll/ᩴ֡ۢ;

    move-result-object v6

    if-eqz v6, :cond_2

    move-object v2, v6

    goto :goto_1

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 584
    :cond_3
    new-instance v2, Ll/ᩴ֡ۢ;

    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {v2, v0, v1, v3}, Ll/ᩴ֡ۢ;-><init>(Ljava/net/InetAddress;Ljava/net/InetAddress;Ljava/util/List;)V

    .line 548
    :goto_1
    iget-object v3, v2, Ll/ᩴ֡ۢ;->ۧ:Ljava/net/InetAddress;

    iget-object v4, v2, Ll/ᩴ֡ۢ;->ᩳ:Ljava/util/List;

    if-eqz v3, :cond_4

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_4

    return-object v2

    .line 646
    :cond_4
    :try_start_0
    invoke-direct {p0, v0}, Ll/ۢ֡ۢ;->֫(Ljava/net/Inet4Address;)Ll/ᩴ֡ۢ;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 648
    :catch_0
    new-instance v2, Ll/ᩴ֡ۢ;

    sget-object v5, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {v2, v0, v1, v5}, Ll/ᩴ֡ۢ;-><init>(Ljava/net/InetAddress;Ljava/net/InetAddress;Ljava/util/List;)V

    :goto_2
    if-eqz v3, :cond_5

    goto :goto_3

    .line 552
    :cond_5
    iget-object v3, v2, Ll/ᩴ֡ۢ;->ۧ:Ljava/net/InetAddress;

    .line 553
    :goto_3
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_6

    iget-object v4, v2, Ll/ᩴ֡ۢ;->ᩳ:Ljava/util/List;

    :cond_6
    if-eqz v3, :cond_7

    .line 554
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_7

    invoke-static {v4, v3}, Ll/ۢ֡ۢ;->֫(Ljava/util/List;Ljava/net/InetAddress;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_4

    :cond_7
    move-object v1, v3

    .line 557
    :goto_4
    new-instance v2, Ll/ᩴ֡ۢ;

    invoke-direct {v2, v0, v1, v4}, Ll/ᩴ֡ۢ;-><init>(Ljava/net/InetAddress;Ljava/net/InetAddress;Ljava/util/List;)V

    return-object v2

    .line 468
    :cond_8
    new-instance v0, Ll/ᩴ֡ۢ;

    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {v0, v1, v1, v1, v2}, Ll/ᩴ֡ۢ;-><init>(Ljava/net/InetAddress;Ljava/net/InetAddress;Ljava/net/InetAddress;Ljava/util/List;)V

    return-object v0
.end method
