.class public final Ll/ᩳ۟᩵;
.super Ljava/lang/Object;
.source "V4F9"


# instance fields
.field public final ֡:Ljava/util/ArrayList;

.field public ֨:Ll/۬᩺᩵;

.field public ֫:Ll/۬᩺᩵;

.field public ۖ:Z

.field public ۘ:Z

.field public ۙ:I

.field public ۚ:Ljava/util/List;

.field public ۜ:Ljava/util/List;

.field public ۠:Ljava/net/ProxySelector;

.field public ۡ:Ll/۠ܰ᩵;

.field public ۢ:Ll/ۚܰ᩵;

.field public ۧ:Ll/۟᩺᩵;

.field public ܳ:I

.field public ܶ:I

.field public ܺ:Ll/᩹ܰ᩵;

.field public ܽ:I

.field public ܿ:Ll/᩻ܰ᩵;

.field public ᩳ:Ll/֨ܽ֡;

.field public ᩴ:Ljavax/net/ssl/HostnameVerifier;

.field public final ᩵:Ljava/util/ArrayList;

.field public ᩶:Ljavax/net/ssl/SSLSocketFactory;

.field public ᩷:Ll/᩵ܰ᩵;

.field public ᩸:Z

.field public ᩹:Ljavax/net/SocketFactory;

.field public ᩻:Ll/ۡܰ᩵;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 473
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 448
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ᩳ۟᩵;->᩵:Ljava/util/ArrayList;

    .line 449
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ᩳ۟᩵;->֡:Ljava/util/ArrayList;

    .line 474
    new-instance v0, Ll/ۚܰ᩵;

    invoke-direct {v0}, Ll/ۚܰ᩵;-><init>()V

    iput-object v0, p0, Ll/ᩳ۟᩵;->ۢ:Ll/ۚܰ᩵;

    .line 475
    sget-object v0, Ll/ܿ۟᩵;->ۘ֫:Ljava/util/List;

    iput-object v0, p0, Ll/ᩳ۟᩵;->ۚ:Ljava/util/List;

    .line 476
    sget-object v0, Ll/ܿ۟᩵;->ۖ֫:Ljava/util/List;

    iput-object v0, p0, Ll/ᩳ۟᩵;->ۜ:Ljava/util/List;

    .line 57
    new-instance v0, Ll/᩸ܰ᩵;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 477
    iput-object v0, p0, Ll/ᩳ۟᩵;->ܺ:Ll/᩹ܰ᩵;

    .line 478
    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    move-result-object v0

    iput-object v0, p0, Ll/ᩳ۟᩵;->۠:Ljava/net/ProxySelector;

    if-nez v0, :cond_0

    .line 480
    new-instance v0, Ll/᩵ܽ֡;

    .line 29
    invoke-direct {v0}, Ljava/net/ProxySelector;-><init>()V

    .line 480
    iput-object v0, p0, Ll/ᩳ۟᩵;->۠:Ljava/net/ProxySelector;

    .line 482
    :cond_0
    sget-object v0, Ll/᩵ܰ᩵;->֫:Ll/᩵ܰ᩵;

    iput-object v0, p0, Ll/ᩳ۟᩵;->᩷:Ll/᩵ܰ᩵;

    .line 483
    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    move-result-object v0

    iput-object v0, p0, Ll/ᩳ۟᩵;->᩹:Ljavax/net/SocketFactory;

    .line 484
    sget-object v0, Ll/۠ܽ֡;->֫:Ll/۠ܽ֡;

    iput-object v0, p0, Ll/ᩳ۟᩵;->ᩴ:Ljavax/net/ssl/HostnameVerifier;

    .line 485
    sget-object v0, Ll/᩻ܰ᩵;->ܽ:Ll/᩻ܰ᩵;

    iput-object v0, p0, Ll/ᩳ۟᩵;->ܿ:Ll/᩻ܰ᩵;

    .line 486
    sget-object v0, Ll/۬᩺᩵;->֫:Ll/۬᩺᩵;

    iput-object v0, p0, Ll/ᩳ۟᩵;->֨:Ll/۬᩺᩵;

    .line 487
    iput-object v0, p0, Ll/ᩳ۟᩵;->֫:Ll/۬᩺᩵;

    .line 488
    new-instance v0, Ll/ۡܰ᩵;

    invoke-direct {v0}, Ll/ۡܰ᩵;-><init>()V

    iput-object v0, p0, Ll/ᩳ۟᩵;->᩻:Ll/ۡܰ᩵;

    .line 489
    sget-object v0, Ll/۠ܰ᩵;->֫:Ll/۠ܰ᩵;

    iput-object v0, p0, Ll/ᩳ۟᩵;->ۡ:Ll/۠ܰ᩵;

    const/4 v0, 0x1

    .line 490
    iput-boolean v0, p0, Ll/ᩳ۟᩵;->ۘ:Z

    .line 491
    iput-boolean v0, p0, Ll/ᩳ۟᩵;->ۖ:Z

    .line 492
    iput-boolean v0, p0, Ll/ᩳ۟᩵;->᩸:Z

    const/4 v0, 0x0

    .line 493
    iput v0, p0, Ll/ᩳ۟᩵;->ܽ:I

    const/16 v0, 0x2710

    .line 494
    iput v0, p0, Ll/ᩳ۟᩵;->ܳ:I

    .line 495
    iput v0, p0, Ll/ᩳ۟᩵;->ܶ:I

    .line 496
    iput v0, p0, Ll/ᩳ۟᩵;->ۙ:I

    return-void
.end method

.method public constructor <init>(Ll/ܿ۟᩵;)V
    .locals 3

    .line 500
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 448
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ᩳ۟᩵;->᩵:Ljava/util/ArrayList;

    .line 449
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ll/ᩳ۟᩵;->֡:Ljava/util/ArrayList;

    .line 501
    iget-object v2, p1, Ll/ܿ۟᩵;->ۨ:Ll/ۚܰ᩵;

    iput-object v2, p0, Ll/ᩳ۟᩵;->ۢ:Ll/ۚܰ᩵;

    .line 503
    iget-object v2, p1, Ll/ܿ۟᩵;->ܿ֫:Ljava/util/List;

    iput-object v2, p0, Ll/ᩳ۟᩵;->ۚ:Ljava/util/List;

    .line 504
    iget-object v2, p1, Ll/ܿ۟᩵;->ۤ:Ljava/util/List;

    iput-object v2, p0, Ll/ᩳ۟᩵;->ۜ:Ljava/util/List;

    .line 505
    iget-object v2, p1, Ll/ܿ۟᩵;->ܽ֫:Ljava/util/List;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 506
    iget-object v0, p1, Ll/ܿ۟᩵;->ᩳ֫:Ljava/util/List;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 507
    iget-object v0, p1, Ll/ܿ۟᩵;->ܰ:Ll/᩹ܰ᩵;

    iput-object v0, p0, Ll/ᩳ۟᩵;->ܺ:Ll/᩹ܰ᩵;

    .line 508
    iget-object v0, p1, Ll/ܿ۟᩵;->᩻֫:Ljava/net/ProxySelector;

    iput-object v0, p0, Ll/ᩳ۟᩵;->۠:Ljava/net/ProxySelector;

    .line 509
    iget-object v0, p1, Ll/ܿ۟᩵;->ۛ:Ll/᩵ܰ᩵;

    iput-object v0, p0, Ll/ᩳ۟᩵;->᩷:Ll/᩵ܰ᩵;

    .line 511
    iget-object v0, p1, Ll/ܿ۟᩵;->᩹:Ll/۟᩺᩵;

    iput-object v0, p0, Ll/ᩳ۟᩵;->ۧ:Ll/۟᩺᩵;

    .line 512
    iget-object v0, p1, Ll/ܿ۟᩵;->ۢ֫:Ljavax/net/SocketFactory;

    iput-object v0, p0, Ll/ᩳ۟᩵;->᩹:Ljavax/net/SocketFactory;

    .line 513
    iget-object v0, p1, Ll/ܿ۟᩵;->ۡ֫:Ljavax/net/ssl/SSLSocketFactory;

    iput-object v0, p0, Ll/ᩳ۟᩵;->᩶:Ljavax/net/ssl/SSLSocketFactory;

    .line 514
    iget-object v0, p1, Ll/ܿ۟᩵;->ۙ:Ll/֨ܽ֡;

    iput-object v0, p0, Ll/ᩳ۟᩵;->ᩳ:Ll/֨ܽ֡;

    .line 515
    iget-object v0, p1, Ll/ܿ۟᩵;->ۧ֫:Ljavax/net/ssl/HostnameVerifier;

    iput-object v0, p0, Ll/ᩳ۟᩵;->ᩴ:Ljavax/net/ssl/HostnameVerifier;

    .line 516
    iget-object v0, p1, Ll/ܿ۟᩵;->ۗ:Ll/᩻ܰ᩵;

    iput-object v0, p0, Ll/ᩳ۟᩵;->ܿ:Ll/᩻ܰ᩵;

    .line 517
    iget-object v0, p1, Ll/ܿ۟᩵;->ܳ֫:Ll/۬᩺᩵;

    iput-object v0, p0, Ll/ᩳ۟᩵;->֨:Ll/۬᩺᩵;

    .line 518
    iget-object v0, p1, Ll/ܿ۟᩵;->᩸:Ll/۬᩺᩵;

    iput-object v0, p0, Ll/ᩳ۟᩵;->֫:Ll/۬᩺᩵;

    .line 519
    iget-object v0, p1, Ll/ܿ۟᩵;->۫:Ll/ۡܰ᩵;

    iput-object v0, p0, Ll/ᩳ۟᩵;->᩻:Ll/ۡܰ᩵;

    .line 520
    iget-object v0, p1, Ll/ܿ۟᩵;->᩺:Ll/۠ܰ᩵;

    iput-object v0, p0, Ll/ᩳ۟᩵;->ۡ:Ll/۠ܰ᩵;

    .line 521
    iget-boolean v0, p1, Ll/ܿ۟᩵;->֫֫:Z

    iput-boolean v0, p0, Ll/ᩳ۟᩵;->ۘ:Z

    .line 522
    iget-boolean v0, p1, Ll/ܿ۟᩵;->۟:Z

    iput-boolean v0, p0, Ll/ᩳ۟᩵;->ۖ:Z

    .line 523
    iget-boolean v0, p1, Ll/ܿ۟᩵;->᩷֫:Z

    iput-boolean v0, p0, Ll/ᩳ۟᩵;->᩸:Z

    .line 524
    iget v0, p1, Ll/ܿ۟᩵;->᩶:I

    iput v0, p0, Ll/ᩳ۟᩵;->ܽ:I

    .line 525
    iget v0, p1, Ll/ܿ۟᩵;->۬:I

    iput v0, p0, Ll/ᩳ۟᩵;->ܳ:I

    .line 526
    iget v0, p1, Ll/ܿ۟᩵;->ۜ֫:I

    iput v0, p0, Ll/ᩳ۟᩵;->ܶ:I

    .line 527
    iget p1, p1, Ll/ܿ۟᩵;->ܺ֫:I

    iput p1, p0, Ll/ᩳ۟᩵;->ۙ:I

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ܿ۟᩵;
    .locals 1

    .line 1040
    new-instance v0, Ll/ܿ۟᩵;

    invoke-direct {v0, p0}, Ll/ܿ۟᩵;-><init>(Ll/ᩳ۟᩵;)V

    return-object v0
.end method

.method public final ֫(J)V
    .locals 1

    .line 2
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 540
    invoke-static {p1, p2, v0}, Ll/᩶۟᩵;->֫(JLjava/util/concurrent/TimeUnit;)I

    move-result p1

    iput p1, p0, Ll/ᩳ۟᩵;->ܽ:I

    return-void
.end method

.method public final ֫(JLjava/util/concurrent/TimeUnit;)V
    .locals 0

    .line 567
    invoke-static {p1, p2, p3}, Ll/᩶۟᩵;->֫(JLjava/util/concurrent/TimeUnit;)I

    move-result p1

    iput p1, p0, Ll/ᩳ۟᩵;->ܳ:I

    return-void
.end method

.method public final ֫(Ljava/util/List;)V
    .locals 0

    .line 979
    invoke-static {p1}, Ll/᩶۟᩵;->֫(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ᩳ۟᩵;->ۜ:Ljava/util/List;

    return-void
.end method

.method public final ֫(Ljavax/net/SocketFactory;)V
    .locals 0

    .line 752
    iput-object p1, p0, Ll/ᩳ۟᩵;->᩹:Ljavax/net/SocketFactory;

    return-void
.end method

.method public final ֫(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)V
    .locals 0

    if-eqz p2, :cond_0

    .line 806
    iput-object p1, p0, Ll/ᩳ۟᩵;->᩶:Ljavax/net/ssl/SSLSocketFactory;

    .line 41
    invoke-static {}, Ll/ᩴܽ֡;->ܽ()Ll/ᩴܽ֡;

    move-result-object p1

    invoke-virtual {p1, p2}, Ll/ᩴܽ֡;->֫(Ljavax/net/ssl/X509TrustManager;)Ll/֨ܽ֡;

    move-result-object p1

    .line 807
    iput-object p1, p0, Ll/ᩳ۟᩵;->ᩳ:Ll/֨ܽ֡;

    return-void

    .line 805
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "trustManager == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/۟᩺᩵;)V
    .locals 0

    .line 726
    iput-object p1, p0, Ll/ᩳ۟᩵;->ۧ:Ll/۟᩺᩵;

    return-void
.end method

.method public final ֫(Ll/۬᩺᩵;)V
    .locals 0

    .line 842
    iput-object p1, p0, Ll/ᩳ۟᩵;->֫:Ll/۬᩺᩵;

    return-void
.end method

.method public final ֫(Ll/ܺۚ᩻;)V
    .locals 0

    .line 819
    iput-object p1, p0, Ll/ᩳ۟᩵;->ᩴ:Ljavax/net/ssl/HostnameVerifier;

    return-void
.end method

.method public final ֫(Ll/᩺ܰ᩵;)V
    .locals 1

    .line 994
    iget-object v0, p0, Ll/ᩳ۟᩵;->᩵:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۧ(JLjava/util/concurrent/TimeUnit;)V
    .locals 0

    .line 596
    invoke-static {p1, p2, p3}, Ll/᩶۟᩵;->֫(JLjava/util/concurrent/TimeUnit;)I

    move-result p1

    iput p1, p0, Ll/ᩳ۟᩵;->ܶ:I

    return-void
.end method

.method public final ۧ(Ll/᩺ܰ᩵;)V
    .locals 1

    .line 1009
    iget-object v0, p0, Ll/ᩳ۟᩵;->֡:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ܽ(JLjava/util/concurrent/TimeUnit;)V
    .locals 0

    .line 626
    invoke-static {p1, p2, p3}, Ll/᩶۟᩵;->֫(JLjava/util/concurrent/TimeUnit;)I

    move-result p1

    iput p1, p0, Ll/ᩳ۟᩵;->ۙ:I

    return-void
.end method
