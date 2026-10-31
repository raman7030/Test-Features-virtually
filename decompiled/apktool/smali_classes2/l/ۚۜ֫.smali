.class public abstract Ll/ۚۜ֫;
.super Ljava/lang/Object;
.source "O5NM"


# instance fields
.field public final ֡:Ll/۬᩻֫;

.field public final ֨:Ll/ۨۛ;

.field public ֫:Ljava/util/ArrayList;

.field public ֫֫:Ll/ۢᩳ;

.field public ۖ:Z

.field public final ۗ:Ll/᩺᩻֫;

.field public ۘ:Ll/ۙ᩻֫;

.field public final ۙ:Ll/ۛ᩻֫;

.field public final ۚ:Ll/ۤ᩻֫;

.field public final ۛ:Ljava/util/ArrayList;

.field public ۜ:Ll/ܿۜ֫;

.field public ۟:Ll/ۢᩳ;

.field public ۠:Z

.field public ۡ:Z

.field public ۢ:Ljava/lang/Runnable;

.field public ۤ:Ll/ۡ᩻֫;

.field public ۧ:Ljava/util/ArrayList;

.field public ۧ֫:Z

.field public ۨ:Ll/ۡ᩻֫;

.field public final ۫:Ll/ۨ᩻֫;

.field public final ۬:Ll/ܰ᩻֫;

.field public final ܰ:Ljava/util/Map;

.field public ܳ:Ljava/util/ArrayList;

.field public ܳ֫:Ljava/util/ArrayList;

.field public ܶ:Ll/᩹ۜ֫;

.field public final ܺ:Ll/ۨۜ֫;

.field public final ܽ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public ܽ֫:Z

.field public ܿ:Ll/ܶ᩻֫;

.field public ܿ֫:Ljava/util/ArrayList;

.field public final ᩳ:Ljava/util/Map;

.field public ᩳ֫:Ljava/util/ArrayList;

.field public ᩴ:Ll/᩶᩻֫;

.field public ᩵:Ljava/util/ArrayDeque;

.field public ᩶:Ll/ۨܽ;

.field public ᩷:Z

.field public final ᩸:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final ᩹:Ll/֡ܽ;

.field public ᩺:Ll/ۢᩳ;

.field public ᩻:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 106
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 416
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۚۜ֫;->ۛ:Ljava/util/ArrayList;

    .line 419
    new-instance v0, Ll/ۨۜ֫;

    invoke-direct {v0}, Ll/ۨۜ֫;-><init>()V

    iput-object v0, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    .line 422
    new-instance v0, Ll/۬᩻֫;

    invoke-direct {v0, p0}, Ll/۬᩻֫;-><init>(Ll/ۚۜ֫;)V

    iput-object v0, p0, Ll/ۚۜ֫;->֡:Ll/۬᩻֫;

    .line 425
    new-instance v0, Ll/ۧۜ֫;

    invoke-direct {v0, p0}, Ll/ۧۜ֫;-><init>(Ll/ۚۜ֫;)V

    iput-object v0, p0, Ll/ۚۜ֫;->᩹:Ll/֡ܽ;

    .line 433
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Ll/ۚۜ֫;->ܽ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 435
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 436
    invoke-static {v0}, Ll/᩶۬ᩴ;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Ll/ۚۜ֫;->ᩳ:Ljava/util/Map;

    .line 438
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 439
    invoke-static {v0}, Ll/᩶۬ᩴ;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Ll/ۚۜ֫;->ܰ:Ljava/util/Map;

    .line 440
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 441
    invoke-static {v0}, Ll/᩶۬ᩴ;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 444
    new-instance v0, Ll/ۤ᩻֫;

    invoke-direct {v0, p0}, Ll/ۤ᩻֫;-><init>(Ll/ۚۜ֫;)V

    iput-object v0, p0, Ll/ۚۜ֫;->ۚ:Ll/ۤ᩻֫;

    .line 446
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Ll/ۚۜ֫;->᩸:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 449
    new-instance v0, Ll/ۛ᩻֫;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ll/ۛ᩻֫;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Ll/ۚۜ֫;->ۙ:Ll/ۛ᩻֫;

    .line 454
    new-instance v0, Ll/ۨ᩻֫;

    invoke-direct {v0, v1, p0}, Ll/ۨ᩻֫;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Ll/ۚۜ֫;->۫:Ll/ۨ᩻֫;

    .line 459
    new-instance v0, Ll/᩺᩻֫;

    invoke-direct {v0, p0}, Ll/᩺᩻֫;-><init>(Ll/ۚۜ֫;)V

    iput-object v0, p0, Ll/ۚۜ֫;->ۗ:Ll/᩺᩻֫;

    .line 465
    new-instance v0, Ll/ܰ᩻֫;

    invoke-direct {v0, p0}, Ll/ܰ᩻֫;-><init>(Ll/ۚۜ֫;)V

    iput-object v0, p0, Ll/ۚۜ֫;->۬:Ll/ܰ᩻֫;

    .line 472
    new-instance v0, Ll/ܽۜ֫;

    invoke-direct {v0, p0}, Ll/ܽۜ֫;-><init>(Ll/ۚۜ֫;)V

    iput-object v0, p0, Ll/ۚۜ֫;->֨:Ll/ۨۛ;

    const/4 v0, -0x1

    .line 494
    iput v0, p0, Ll/ۚۜ֫;->᩻:I

    .line 502
    new-instance v0, Ll/ᩳۜ֫;

    invoke-direct {v0, p0}, Ll/ᩳۜ֫;-><init>(Ll/ۚۜ֫;)V

    iput-object v0, p0, Ll/ۚۜ֫;->ᩴ:Ll/᩶᩻֫;

    .line 511
    new-instance v0, Ll/ܿۜ֫;

    .line 512
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 511
    iput-object v0, p0, Ll/ۚۜ֫;->ۜ:Ll/ܿۜ֫;

    .line 524
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Ll/ۚۜ֫;->᩵:Ljava/util/ArrayDeque;

    .line 544
    new-instance v0, Ll/ܳۜ֫;

    invoke-direct {v0, p0}, Ll/ܳۜ֫;-><init>(Ll/ۚۜ֫;)V

    iput-object v0, p0, Ll/ۚۜ֫;->ۢ:Ljava/lang/Runnable;

    return-void
.end method

.method private ֡(Ll/ۡ᩻֫;)V
    .locals 3

    .line 1977
    invoke-direct {p0, p1}, Ll/ۚۜ֫;->ۘ(Ll/ۡ᩻֫;)Landroid/view/ViewGroup;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1979
    invoke-virtual {p1}, Ll/ۡ᩻֫;->getEnterAnim()I

    move-result v1

    invoke-virtual {p1}, Ll/ۡ᩻֫;->getExitAnim()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {p1}, Ll/ۡ᩻֫;->getPopEnterAnim()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {p1}, Ll/ۡ᩻֫;->getPopExitAnim()I

    move-result v2

    add-int/2addr v1, v2

    if-lez v1, :cond_1

    const v1, 0x7f0a0690

    .line 1981
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    .line 1982
    invoke-virtual {v0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 1984
    :cond_0
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۡ᩻֫;

    .line 1985
    invoke-virtual {p1}, Ll/ۡ᩻֫;->getPopDirection()Z

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۡ᩻֫;->setPopDirection(Z)V

    :cond_1
    return-void
.end method

.method public static synthetic ֫(Ll/ۚۜ֫;)Ll/ۨۜ֫;
    .locals 0

    .line 106
    iget-object p0, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    return-object p0
.end method

.method private ֫(Ljava/lang/IllegalStateException;)V
    .locals 4

    const-string v0, "  "

    .line 552
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 554
    new-instance v1, Ll/֡᩷֫;

    invoke-direct {v1}, Ll/֡᩷֫;-><init>()V

    .line 555
    new-instance v2, Ljava/io/PrintWriter;

    invoke-direct {v2, v1}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 556
    iget-object v1, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    :try_start_0
    new-array v0, v3, [Ljava/lang/String;

    .line 558
    invoke-virtual {v1, v2, v0}, Ll/ۙ᩻֫;->֫(Ljava/io/PrintWriter;[Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-array v1, v3, [Ljava/lang/String;

    const/4 v3, 0x0

    .line 564
    invoke-virtual {p0, v0, v3, v2, v1}, Ll/ۚۜ֫;->֫(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 569
    :catch_0
    :goto_0
    throw p1
.end method

.method private ֫(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4

    .line 1790
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 1794
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne v0, v1, :cond_6

    .line 1798
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_4

    .line 1801
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳܳ֫;

    iget-boolean v3, v3, Ll/ܽ᩷֫;->ۖ:Z

    if-nez v3, :cond_3

    if-eq v2, v1, :cond_1

    .line 1805
    invoke-direct {p0, p1, p2, v2, v1}, Ll/ۚۜ֫;->ۧ(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    :cond_1
    add-int/lit8 v2, v1, 0x1

    .line 1810
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    :goto_1
    if-ge v2, v0, :cond_2

    .line 1812
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 1813
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳܳ֫;

    iget-boolean v3, v3, Ll/ܽ᩷֫;->ۖ:Z

    if-nez v3, :cond_2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 1817
    :cond_2
    invoke-direct {p0, p1, p2, v1, v2}, Ll/ۚۜ֫;->ۧ(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    add-int/lit8 v1, v2, -0x1

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    if-eq v2, v0, :cond_5

    .line 1823
    invoke-direct {p0, p1, p2, v2, v0}, Ll/ۚۜ֫;->ۧ(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    :cond_5
    :goto_2
    return-void

    .line 1795
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Internal error with the back stack records"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic ֫(Ll/ۚۜ֫;Landroid/content/res/Configuration;)V
    .locals 1

    .line 450
    invoke-direct {p0}, Ll/ۚۜ֫;->۟()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 451
    invoke-virtual {p0, v0, p1}, Ll/ۚۜ֫;->֫(ZLandroid/content/res/Configuration;)V

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/ۚۜ֫;Ljava/lang/Integer;)V
    .locals 1

    .line 455
    invoke-direct {p0}, Ll/ۚۜ֫;->۟()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 v0, 0x50

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    .line 456
    invoke-virtual {p0, p1}, Ll/ۚۜ֫;->֫(Z)V

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/ۚۜ֫;Ll/۟᩶;)V
    .locals 1

    .line 467
    invoke-direct {p0}, Ll/ۚۜ֫;->۟()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 468
    invoke-virtual {p1}, Ll/۟᩶;->֫()Z

    move-result p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Ll/ۚۜ֫;->ۧ(ZZ)V

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/ۚۜ֫;Ll/ܽ᩶;)V
    .locals 1

    .line 461
    invoke-direct {p0}, Ll/ۚۜ֫;->۟()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 462
    invoke-virtual {p1}, Ll/ܽ᩶;->֫()Z

    move-result p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Ll/ۚۜ֫;->֫(ZZ)V

    :cond_0
    return-void
.end method

.method private ֫(II)Z
    .locals 4

    const/4 v0, 0x0

    .line 854
    invoke-virtual {p0, v0}, Ll/ۚۜ֫;->ۧ(Z)Z

    const/4 v1, 0x1

    .line 855
    invoke-direct {p0, v1}, Ll/ۚۜ֫;->ܽ(Z)V

    .line 857
    iget-object v2, p0, Ll/ۚۜ֫;->ۨ:Ll/ۡ᩻֫;

    if-eqz v2, :cond_0

    if-gez p1, :cond_0

    .line 860
    invoke-virtual {v2}, Ll/ۡ᩻֫;->getChildFragmentManager()Ll/ۚۜ֫;

    move-result-object v2

    .line 861
    invoke-virtual {v2}, Ll/ۚۜ֫;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_0

    return v1

    .line 867
    :cond_0
    iget-object v2, p0, Ll/ۚۜ֫;->ܳ֫:Ljava/util/ArrayList;

    iget-object v3, p0, Ll/ۚۜ֫;->ܿ֫:Ljava/util/ArrayList;

    invoke-virtual {p0, v2, v3, p1, p2}, Ll/ۚۜ֫;->֫(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 869
    iput-boolean v1, p0, Ll/ۚۜ֫;->ۡ:Z

    .line 871
    :try_start_0
    iget-object p2, p0, Ll/ۚۜ֫;->ܳ֫:Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ۚۜ֫;->ܿ֫:Ljava/util/ArrayList;

    invoke-direct {p0, p2, v1}, Ll/ۚۜ֫;->֫(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 873
    invoke-direct {p0}, Ll/ۚۜ֫;->᩺()V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-direct {p0}, Ll/ۚۜ֫;->᩺()V

    .line 874
    throw p1

    .line 877
    :cond_1
    :goto_0
    invoke-direct {p0}, Ll/ۚۜ֫;->֫֫()V

    .line 2080
    iget-boolean p2, p0, Ll/ۚۜ֫;->ۖ:Z

    iget-object v1, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    if-eqz p2, :cond_2

    .line 2081
    iput-boolean v0, p0, Ll/ۚۜ֫;->ۖ:Z

    .line 1444
    invoke-virtual {v1}, Ll/ۨۜ֫;->ۧ()Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛۜ֫;

    .line 1445
    invoke-virtual {p0, v0}, Ll/ۚۜ֫;->֫(Ll/ۛۜ֫;)V

    goto :goto_1

    .line 879
    :cond_2
    invoke-virtual {v1}, Ll/ۨۜ֫;->֫()V

    return p1
.end method

.method private ֫֫()V
    .locals 3

    .line 632
    iget-object v0, p0, Ll/ۚۜ֫;->ۛ:Ljava/util/ArrayList;

    monitor-enter v0

    .line 633
    :try_start_0
    iget-object v1, p0, Ll/ۚۜ֫;->ۛ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    .line 634
    iget-object v1, p0, Ll/ۚۜ֫;->᩹:Ll/֡ܽ;

    invoke-virtual {v1, v2}, Ll/֡ܽ;->֫(Z)V

    .line 635
    monitor-exit v0

    return-void

    .line 637
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 641
    iget-object v0, p0, Ll/ۚۜ֫;->᩹:Ll/֡ܽ;

    invoke-virtual {p0}, Ll/ۚۜ֫;->᩵()I

    move-result v1

    if-lez v1, :cond_1

    iget-object v1, p0, Ll/ۚۜ֫;->ۤ:Ll/ۡ᩻֫;

    .line 642
    invoke-static {v1}, Ll/ۚۜ֫;->᩵(Ll/ۡ᩻֫;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 641
    :goto_0
    invoke-virtual {v0, v2}, Ll/֡ܽ;->֫(Z)V

    return-void

    :catchall_0
    move-exception v1

    .line 637
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method private ۖ(Ll/ۡ᩻֫;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 3157
    iget-object v0, p1, Ll/ۡ᩻֫;->mWho:Ljava/lang/String;

    .line 1605
    iget-object v1, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    invoke-virtual {v1, v0}, Ll/ۨۜ֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩻֫;

    move-result-object v0

    .line 3157
    invoke-virtual {p1, v0}, Ll/ۡ᩻֫;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3158
    invoke-virtual {p1}, Ll/ۡ᩻֫;->performPrimaryNavigationFragmentChanged()V

    :cond_0
    return-void
.end method

.method private ۘ(Ll/ۡ᩻֫;)Landroid/view/ViewGroup;
    .locals 1

    .line 1991
    iget-object v0, p1, Ll/ۡ᩻֫;->mContainer:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    return-object v0

    .line 1995
    :cond_0
    iget v0, p1, Ll/ۡ᩻֫;->mContainerId:I

    if-gtz v0, :cond_1

    goto :goto_0

    .line 2002
    :cond_1
    iget-object v0, p0, Ll/ۚۜ֫;->ܿ:Ll/ܶ᩻֫;

    invoke-virtual {v0}, Ll/ܶ᩻֫;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2003
    iget-object v0, p0, Ll/ۚۜ֫;->ܿ:Ll/ܶ᩻֫;

    iget p1, p1, Ll/ۡ᩻֫;->mContainerId:I

    invoke-virtual {v0, p1}, Ll/ܶ᩻֫;->֫(I)Landroid/view/View;

    move-result-object p1

    .line 2005
    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    .line 2006
    check-cast p1, Landroid/view/ViewGroup;

    return-object p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private ۟()Z
    .locals 2

    .line 3364
    iget-object v0, p0, Ll/ۚۜ֫;->ۤ:Ll/ۡ᩻֫;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    .line 3367
    :cond_0
    invoke-virtual {v0}, Ll/ۡ᩻֫;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ۚۜ֫;->ۤ:Ll/ۡ᩻֫;

    invoke-virtual {v0}, Ll/ۡ᩻֫;->getParentFragmentManager()Ll/ۚۜ֫;

    move-result-object v0

    invoke-direct {v0}, Ll/ۚۜ֫;->۟()Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private ۧ(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    .line 1837
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳܳ֫;

    iget-boolean v5, v5, Ll/ܽ᩷֫;->ۖ:Z

    .line 1839
    iget-object v6, v0, Ll/ۚۜ֫;->ᩳ֫:Ljava/util/ArrayList;

    if-nez v6, :cond_0

    .line 1840
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, v0, Ll/ۚۜ֫;->ᩳ֫:Ljava/util/ArrayList;

    goto :goto_0

    .line 1842
    :cond_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    .line 1844
    :goto_0
    iget-object v6, v0, Ll/ۚۜ֫;->ᩳ֫:Ljava/util/ArrayList;

    iget-object v7, v0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    invoke-virtual {v7}, Ll/ۨۜ֫;->ܿ()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 3182
    iget-object v6, v0, Ll/ۚۜ֫;->ۨ:Ll/ۡ᩻֫;

    const/4 v8, 0x0

    move v9, v3

    :goto_1
    const/4 v10, 0x1

    if-ge v9, v4, :cond_12

    .line 1847
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ᩳܳ֫;

    .line 1848
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Boolean;

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    if-nez v12, :cond_c

    .line 1850
    iget-object v12, v0, Ll/ۚۜ֫;->ᩳ֫:Ljava/util/ArrayList;

    .line 507
    iget-object v13, v11, Ll/ܽ᩷֫;->ۢ:Ljava/util/ArrayList;

    const/4 v14, 0x0

    :goto_2
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v15

    if-ge v14, v15, :cond_b

    .line 508
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll/ۧ᩷֫;

    .line 509
    iget v3, v15, Ll/ۧ᩷֫;->֫:I

    if-eq v3, v10, :cond_a

    const/4 v10, 0x2

    if-eq v3, v10, :cond_4

    const/4 v10, 0x3

    if-eq v3, v10, :cond_2

    const/4 v10, 0x6

    if-eq v3, v10, :cond_2

    const/4 v10, 0x7

    if-eq v3, v10, :cond_a

    const/16 v10, 0x8

    if-eq v3, v10, :cond_1

    goto :goto_3

    .line 565
    :cond_1
    new-instance v3, Ll/ۧ᩷֫;

    const/16 v10, 0x9

    const/4 v2, 0x0

    invoke-direct {v3, v10, v6, v2}, Ll/ۧ᩷֫;-><init>(ILl/ۡ᩻֫;I)V

    invoke-virtual {v13, v14, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    const/4 v2, 0x1

    .line 566
    iput-boolean v2, v15, Ll/ۧ᩷֫;->ܳ:Z

    add-int/lit8 v14, v14, 0x1

    .line 569
    iget-object v6, v15, Ll/ۧ᩷֫;->ܿ:Ll/ۡ᩻֫;

    goto :goto_3

    .line 516
    :cond_2
    iget-object v2, v15, Ll/ۧ᩷֫;->ܿ:Ll/ۡ᩻֫;

    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 517
    iget-object v2, v15, Ll/ۧ᩷֫;->ܿ:Ll/ۡ᩻֫;

    if-ne v2, v6, :cond_3

    .line 518
    new-instance v3, Ll/ۧ᩷֫;

    const/16 v6, 0x9

    invoke-direct {v3, v2, v6}, Ll/ۧ᩷֫;-><init>(Ll/ۡ᩻֫;I)V

    invoke-virtual {v13, v14, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v14, v14, 0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    move-object v6, v3

    goto :goto_4

    :cond_3
    :goto_3
    const/4 v2, 0x1

    :goto_4
    move-object/from16 v18, v7

    goto/16 :goto_9

    .line 525
    :cond_4
    iget-object v2, v15, Ll/ۧ᩷֫;->ܿ:Ll/ۡ᩻֫;

    .line 526
    iget v3, v2, Ll/ۡ᩻֫;->mContainerId:I

    .line 528
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v10

    add-int/lit8 v10, v10, -0x1

    const/16 v16, 0x0

    :goto_5
    if-ltz v10, :cond_8

    .line 529
    invoke-virtual {v12, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v18, v7

    move-object/from16 v7, v17

    check-cast v7, Ll/ۡ᩻֫;

    .line 530
    iget v1, v7, Ll/ۡ᩻֫;->mContainerId:I

    if-ne v1, v3, :cond_7

    if-ne v7, v2, :cond_5

    const/4 v1, 0x1

    move/from16 v17, v3

    const/16 v16, 0x1

    goto :goto_7

    :cond_5
    if-ne v7, v6, :cond_6

    .line 537
    new-instance v1, Ll/ۧ᩷֫;

    const/16 v6, 0x9

    move/from16 v17, v3

    const/4 v3, 0x0

    invoke-direct {v1, v6, v7, v3}, Ll/ۧ᩷֫;-><init>(ILl/ۡ᩻֫;I)V

    invoke-virtual {v13, v14, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v14, v14, 0x1

    const/4 v6, 0x0

    goto :goto_6

    :cond_6
    move/from16 v17, v3

    const/4 v3, 0x0

    .line 541
    :goto_6
    new-instance v1, Ll/ۧ᩷֫;

    move-object/from16 v19, v6

    const/4 v6, 0x3

    invoke-direct {v1, v6, v7, v3}, Ll/ۧ᩷֫;-><init>(ILl/ۡ᩻֫;I)V

    .line 542
    iget v3, v15, Ll/ۧ᩷֫;->ܽ:I

    iput v3, v1, Ll/ۧ᩷֫;->ܽ:I

    .line 543
    iget v3, v15, Ll/ۧ᩷֫;->ۜ:I

    iput v3, v1, Ll/ۧ᩷֫;->ۜ:I

    .line 544
    iget v3, v15, Ll/ۧ᩷֫;->ᩳ:I

    iput v3, v1, Ll/ۧ᩷֫;->ᩳ:I

    .line 545
    iget v3, v15, Ll/ۧ᩷֫;->᩷:I

    iput v3, v1, Ll/ۧ᩷֫;->᩷:I

    .line 546
    invoke-virtual {v13, v14, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 547
    invoke-virtual {v12, v7}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    add-int/lit8 v14, v14, 0x1

    move-object/from16 v6, v19

    goto :goto_7

    :cond_7
    move/from16 v17, v3

    :goto_7
    add-int/lit8 v10, v10, -0x1

    move-object/from16 v1, p1

    move/from16 v3, v17

    move-object/from16 v7, v18

    goto :goto_5

    :cond_8
    move-object/from16 v18, v7

    const/4 v1, 0x1

    if-eqz v16, :cond_9

    .line 553
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v14, v14, -0x1

    goto :goto_8

    .line 556
    :cond_9
    iput v1, v15, Ll/ۧ᩷֫;->֫:I

    .line 557
    iput-boolean v1, v15, Ll/ۧ᩷֫;->ܳ:Z

    .line 558
    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_8
    const/4 v2, 0x1

    goto :goto_9

    :cond_a
    move-object/from16 v18, v7

    const/4 v2, 0x1

    .line 512
    iget-object v1, v15, Ll/ۧ᩷֫;->ܿ:Ll/ۡ᩻֫;

    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_9
    add-int/2addr v14, v2

    const/4 v10, 0x1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v7, v18

    goto/16 :goto_2

    :cond_b
    move-object/from16 v18, v7

    goto :goto_d

    :cond_c
    move-object/from16 v18, v7

    const/4 v1, 0x1

    .line 1852
    iget-object v2, v0, Ll/ۚۜ֫;->ᩳ֫:Ljava/util/ArrayList;

    .line 588
    iget-object v3, v11, Ll/ܽ᩷֫;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v7

    sub-int/2addr v7, v1

    :goto_a
    if-ltz v7, :cond_f

    .line 589
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ۧ᩷֫;

    .line 590
    iget v12, v10, Ll/ۧ᩷֫;->֫:I

    const/4 v13, 0x3

    if-eq v12, v1, :cond_e

    if-eq v12, v13, :cond_d

    packed-switch v12, :pswitch_data_0

    goto :goto_c

    .line 606
    :pswitch_0
    iget-object v1, v10, Ll/ۧ᩷֫;->᩻:Ll/ܰۢ֫;

    iput-object v1, v10, Ll/ۧ᩷֫;->ۧ:Ll/ܰۢ֫;

    goto :goto_c

    .line 600
    :pswitch_1
    iget-object v1, v10, Ll/ۧ᩷֫;->ܿ:Ll/ۡ᩻֫;

    goto :goto_b

    :pswitch_2
    const/4 v1, 0x0

    :goto_b
    move-object v6, v1

    goto :goto_c

    .line 597
    :cond_d
    :pswitch_3
    iget-object v1, v10, Ll/ۧ᩷֫;->ܿ:Ll/ۡ᩻֫;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_c

    .line 593
    :cond_e
    :pswitch_4
    iget-object v1, v10, Ll/ۧ᩷֫;->ܿ:Ll/ۡ᩻֫;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :goto_c
    add-int/lit8 v7, v7, -0x1

    const/4 v1, 0x1

    goto :goto_a

    :cond_f
    :goto_d
    if-nez v8, :cond_11

    .line 1854
    iget-boolean v1, v11, Ll/ܽ᩷֫;->֫:Z

    if-eqz v1, :cond_10

    goto :goto_e

    :cond_10
    const/4 v1, 0x0

    const/4 v8, 0x0

    goto :goto_f

    :cond_11
    :goto_e
    const/4 v1, 0x1

    const/4 v8, 0x1

    :goto_f
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v7, v18

    goto/16 :goto_1

    :cond_12
    move-object/from16 v18, v7

    .line 1856
    iget-object v1, v0, Ll/ۚۜ֫;->ᩳ֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    if-nez v5, :cond_15

    .line 1858
    iget v1, v0, Ll/ۚۜ֫;->᩻:I

    const/4 v2, 0x1

    if-lt v1, v2, :cond_15

    move/from16 v1, p3

    :goto_10
    if-ge v1, v4, :cond_15

    move-object/from16 v2, p1

    .line 1862
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳܳ֫;

    .line 1863
    iget-object v3, v3, Ll/ܽ᩷֫;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_13
    :goto_11
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_14

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۧ᩷֫;

    .line 1864
    iget-object v5, v5, Ll/ۧ᩷֫;->ܿ:Ll/ۡ᩻֫;

    if-eqz v5, :cond_13

    .line 1865
    iget-object v6, v5, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    if-eqz v6, :cond_13

    .line 1867
    invoke-virtual {v0, v5}, Ll/ۚۜ֫;->ᩳ(Ll/ۡ᩻֫;)Ll/ۛۜ֫;

    move-result-object v5

    move-object/from16 v6, v18

    .line 1868
    invoke-virtual {v6, v5}, Ll/ۨۜ֫;->֫(Ll/ۛۜ֫;)V

    goto :goto_11

    :cond_14
    move-object/from16 v6, v18

    add-int/lit8 v1, v1, 0x1

    goto :goto_10

    :cond_15
    move-object/from16 v2, p1

    move/from16 v1, p3

    :goto_12
    const/4 v3, -0x1

    if-ge v1, v4, :cond_22

    .line 1958
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳܳ֫;

    move-object/from16 v6, p2

    .line 1959
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    const-string v9, "Unknown cmd: "

    if-eqz v7, :cond_1d

    .line 1961
    invoke-virtual {v5, v3}, Ll/ᩳܳ֫;->֫(I)V

    .line 430
    iget-object v3, v5, Ll/ᩳܳ֫;->֨:Ll/ۚۜ֫;

    iget-object v7, v5, Ll/ܽ᩷֫;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v10

    const/4 v11, 0x1

    sub-int/2addr v10, v11

    :goto_13
    if-ltz v10, :cond_21

    .line 431
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ۧ᩷֫;

    .line 432
    iget-object v13, v12, Ll/ۧ᩷֫;->ܿ:Ll/ۡ᩻֫;

    if-eqz v13, :cond_1a

    const/4 v14, 0x0

    .line 434
    iput-boolean v14, v13, Ll/ۡ᩻֫;->mBeingSaved:Z

    .line 435
    invoke-virtual {v13, v11}, Ll/ۡ᩻֫;->setPopDirection(Z)V

    .line 436
    iget v11, v5, Ll/ܽ᩷֫;->᩵:I

    const/16 v14, 0x2002

    const/16 v15, 0x1001

    if-eq v11, v15, :cond_19

    if-eq v11, v14, :cond_18

    const/16 v14, 0x1004

    const/16 v15, 0x2005

    if-eq v11, v15, :cond_19

    const/16 v15, 0x1003

    if-eq v11, v15, :cond_17

    if-eq v11, v14, :cond_16

    const/4 v14, 0x0

    goto :goto_14

    :cond_16
    const/16 v14, 0x2005

    goto :goto_14

    :cond_17
    const/16 v14, 0x1003

    goto :goto_14

    :cond_18
    const/16 v14, 0x1001

    :cond_19
    :goto_14
    invoke-virtual {v13, v14}, Ll/ۡ᩻֫;->setNextTransition(I)V

    .line 438
    iget-object v11, v5, Ll/ܽ᩷֫;->ᩴ:Ljava/util/ArrayList;

    iget-object v14, v5, Ll/ܽ᩷֫;->ۘ:Ljava/util/ArrayList;

    invoke-virtual {v13, v11, v14}, Ll/ۡ᩻֫;->setSharedElementNames(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 440
    :cond_1a
    iget v11, v12, Ll/ۧ᩷֫;->֫:I

    packed-switch v11, :pswitch_data_1

    .line 478
    :pswitch_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v12, Ll/ۧ᩷֫;->֫:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 475
    :pswitch_6
    iget-object v11, v12, Ll/ۧ᩷֫;->᩻:Ll/ܰۢ֫;

    invoke-virtual {v3, v13, v11}, Ll/ۚۜ֫;->֫(Ll/ۡ᩻֫;Ll/ܰۢ֫;)V

    goto/16 :goto_15

    .line 472
    :pswitch_7
    invoke-virtual {v3, v13}, Ll/ۚۜ֫;->ܺ(Ll/ۡ᩻֫;)V

    goto :goto_15

    :pswitch_8
    const/4 v11, 0x0

    .line 469
    invoke-virtual {v3, v11}, Ll/ۚۜ֫;->ܺ(Ll/ۡ᩻֫;)V

    goto :goto_15

    .line 464
    :pswitch_9
    iget v11, v12, Ll/ۧ᩷֫;->ܽ:I

    iget v14, v12, Ll/ۧ᩷֫;->ᩳ:I

    iget v15, v12, Ll/ۧ᩷֫;->ۜ:I

    iget v12, v12, Ll/ۧ᩷֫;->᩷:I

    invoke-virtual {v13, v11, v14, v15, v12}, Ll/ۡ᩻֫;->setAnimations(IIII)V

    const/4 v11, 0x1

    .line 465
    invoke-virtual {v3, v13, v11}, Ll/ۚۜ֫;->֫(Ll/ۡ᩻֫;Z)V

    .line 466
    invoke-virtual {v3, v13}, Ll/ۚۜ֫;->ܿ(Ll/ۡ᩻֫;)V

    goto :goto_15

    .line 460
    :pswitch_a
    iget v11, v12, Ll/ۧ᩷֫;->ܽ:I

    iget v14, v12, Ll/ۧ᩷֫;->ᩳ:I

    iget v15, v12, Ll/ۧ᩷֫;->ۜ:I

    iget v12, v12, Ll/ۧ᩷֫;->᩷:I

    invoke-virtual {v13, v11, v14, v15, v12}, Ll/ۡ᩻֫;->setAnimations(IIII)V

    .line 461
    invoke-virtual {v3, v13}, Ll/ۚۜ֫;->ܽ(Ll/ۡ᩻֫;)V

    goto :goto_15

    .line 455
    :pswitch_b
    iget v11, v12, Ll/ۧ᩷֫;->ܽ:I

    iget v14, v12, Ll/ۧ᩷֫;->ᩳ:I

    iget v15, v12, Ll/ۧ᩷֫;->ۜ:I

    iget v12, v12, Ll/ۧ᩷֫;->᩷:I

    invoke-virtual {v13, v11, v14, v15, v12}, Ll/ۡ᩻֫;->setAnimations(IIII)V

    const/4 v11, 0x1

    .line 456
    invoke-virtual {v3, v13, v11}, Ll/ۚۜ֫;->֫(Ll/ۡ᩻֫;Z)V

    .line 457
    invoke-virtual {v3, v13}, Ll/ۚۜ֫;->ۜ(Ll/ۡ᩻֫;)V

    goto :goto_15

    .line 451
    :pswitch_c
    iget v11, v12, Ll/ۧ᩷֫;->ܽ:I

    iget v14, v12, Ll/ۧ᩷֫;->ᩳ:I

    iget v15, v12, Ll/ۧ᩷֫;->ۜ:I

    iget v12, v12, Ll/ۧ᩷֫;->᩷:I

    invoke-virtual {v13, v11, v14, v15, v12}, Ll/ۡ᩻֫;->setAnimations(IIII)V

    .line 452
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v11, 0x2

    .line 1530
    invoke-static {v11}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v11

    if-eqz v11, :cond_1b

    invoke-static {v13}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 1531
    :cond_1b
    iget-boolean v11, v13, Ll/ۡ᩻֫;->mHidden:Z

    if-eqz v11, :cond_1c

    const/4 v11, 0x0

    .line 1532
    iput-boolean v11, v13, Ll/ۡ᩻֫;->mHidden:Z

    .line 1535
    iget-boolean v11, v13, Ll/ۡ᩻֫;->mHiddenChanged:Z

    xor-int/lit8 v11, v11, 0x1

    iput-boolean v11, v13, Ll/ۡ᩻֫;->mHiddenChanged:Z

    goto :goto_15

    .line 447
    :pswitch_d
    iget v11, v12, Ll/ۧ᩷֫;->ܽ:I

    iget v14, v12, Ll/ۧ᩷֫;->ᩳ:I

    iget v15, v12, Ll/ۧ᩷֫;->ۜ:I

    iget v12, v12, Ll/ۧ᩷֫;->᩷:I

    invoke-virtual {v13, v11, v14, v15, v12}, Ll/ۡ᩻֫;->setAnimations(IIII)V

    .line 448
    invoke-virtual {v3, v13}, Ll/ۚۜ֫;->֫(Ll/ۡ᩻֫;)Ll/ۛۜ֫;

    :cond_1c
    :goto_15
    const/4 v11, 0x1

    goto :goto_16

    .line 442
    :pswitch_e
    iget v11, v12, Ll/ۧ᩷֫;->ܽ:I

    iget v14, v12, Ll/ۧ᩷֫;->ᩳ:I

    iget v15, v12, Ll/ۧ᩷֫;->ۜ:I

    iget v12, v12, Ll/ۧ᩷֫;->᩷:I

    invoke-virtual {v13, v11, v14, v15, v12}, Ll/ۡ᩻֫;->setAnimations(IIII)V

    const/4 v11, 0x1

    .line 443
    invoke-virtual {v3, v13, v11}, Ll/ۚۜ֫;->֫(Ll/ۡ᩻֫;Z)V

    .line 444
    invoke-virtual {v3, v13}, Ll/ۚۜ֫;->ۢ(Ll/ۡ᩻֫;)V

    :goto_16
    add-int/lit8 v10, v10, -0x1

    goto/16 :goto_13

    :cond_1d
    const/4 v3, 0x1

    .line 1964
    invoke-virtual {v5, v3}, Ll/ᩳܳ֫;->֫(I)V

    .line 373
    iget-object v3, v5, Ll/ᩳܳ֫;->֨:Ll/ۚۜ֫;

    iget-object v7, v5, Ll/ܽ᩷֫;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v10

    const/4 v11, 0x0

    :goto_17
    if-ge v11, v10, :cond_21

    .line 375
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ۧ᩷֫;

    .line 376
    iget-object v13, v12, Ll/ۧ᩷֫;->ܿ:Ll/ۡ᩻֫;

    if-eqz v13, :cond_1e

    const/4 v14, 0x0

    .line 378
    iput-boolean v14, v13, Ll/ۡ᩻֫;->mBeingSaved:Z

    .line 379
    invoke-virtual {v13, v14}, Ll/ۡ᩻֫;->setPopDirection(Z)V

    .line 380
    iget v14, v5, Ll/ܽ᩷֫;->᩵:I

    invoke-virtual {v13, v14}, Ll/ۡ᩻֫;->setNextTransition(I)V

    .line 381
    iget-object v14, v5, Ll/ܽ᩷֫;->ۘ:Ljava/util/ArrayList;

    iget-object v15, v5, Ll/ܽ᩷֫;->ᩴ:Ljava/util/ArrayList;

    invoke-virtual {v13, v14, v15}, Ll/ۡ᩻֫;->setSharedElementNames(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 383
    :cond_1e
    iget v14, v12, Ll/ۧ᩷֫;->֫:I

    packed-switch v14, :pswitch_data_2

    .line 421
    :pswitch_f
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v12, Ll/ۧ᩷֫;->֫:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 418
    :pswitch_10
    iget-object v12, v12, Ll/ۧ᩷֫;->ۧ:Ll/ܰۢ֫;

    invoke-virtual {v3, v13, v12}, Ll/ۚۜ֫;->֫(Ll/ۡ᩻֫;Ll/ܰۢ֫;)V

    goto :goto_18

    :pswitch_11
    const/4 v12, 0x0

    .line 415
    invoke-virtual {v3, v12}, Ll/ۚۜ֫;->ܺ(Ll/ۡ᩻֫;)V

    goto :goto_18

    .line 412
    :pswitch_12
    invoke-virtual {v3, v13}, Ll/ۚۜ֫;->ܺ(Ll/ۡ᩻֫;)V

    :goto_18
    move-object/from16 v16, v5

    goto/16 :goto_19

    .line 407
    :pswitch_13
    iget v14, v12, Ll/ۧ᩷֫;->ܽ:I

    iget v15, v12, Ll/ۧ᩷֫;->ᩳ:I

    move-object/from16 v16, v5

    iget v5, v12, Ll/ۧ᩷֫;->ۜ:I

    iget v12, v12, Ll/ۧ᩷֫;->᩷:I

    invoke-virtual {v13, v14, v15, v5, v12}, Ll/ۡ᩻֫;->setAnimations(IIII)V

    const/4 v5, 0x0

    .line 408
    invoke-virtual {v3, v13, v5}, Ll/ۚۜ֫;->֫(Ll/ۡ᩻֫;Z)V

    .line 409
    invoke-virtual {v3, v13}, Ll/ۚۜ֫;->ܽ(Ll/ۡ᩻֫;)V

    goto/16 :goto_19

    :pswitch_14
    move-object/from16 v16, v5

    .line 403
    iget v5, v12, Ll/ۧ᩷֫;->ܽ:I

    iget v14, v12, Ll/ۧ᩷֫;->ᩳ:I

    iget v15, v12, Ll/ۧ᩷֫;->ۜ:I

    iget v12, v12, Ll/ۧ᩷֫;->᩷:I

    invoke-virtual {v13, v5, v14, v15, v12}, Ll/ۡ᩻֫;->setAnimations(IIII)V

    .line 404
    invoke-virtual {v3, v13}, Ll/ۚۜ֫;->ܿ(Ll/ۡ᩻֫;)V

    goto :goto_19

    :pswitch_15
    move-object/from16 v16, v5

    .line 398
    iget v5, v12, Ll/ۧ᩷֫;->ܽ:I

    iget v14, v12, Ll/ۧ᩷֫;->ᩳ:I

    iget v15, v12, Ll/ۧ᩷֫;->ۜ:I

    iget v12, v12, Ll/ۧ᩷֫;->᩷:I

    invoke-virtual {v13, v5, v14, v15, v12}, Ll/ۡ᩻֫;->setAnimations(IIII)V

    const/4 v5, 0x0

    .line 399
    invoke-virtual {v3, v13, v5}, Ll/ۚۜ֫;->֫(Ll/ۡ᩻֫;Z)V

    const/4 v12, 0x2

    .line 1530
    invoke-static {v12}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v12

    if-eqz v12, :cond_1f

    invoke-static {v13}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 1531
    :cond_1f
    iget-boolean v12, v13, Ll/ۡ᩻֫;->mHidden:Z

    if-eqz v12, :cond_20

    .line 1532
    iput-boolean v5, v13, Ll/ۡ᩻֫;->mHidden:Z

    .line 1535
    iget-boolean v5, v13, Ll/ۡ᩻֫;->mHiddenChanged:Z

    xor-int/lit8 v5, v5, 0x1

    iput-boolean v5, v13, Ll/ۡ᩻֫;->mHiddenChanged:Z

    goto :goto_19

    :pswitch_16
    move-object/from16 v16, v5

    .line 394
    iget v5, v12, Ll/ۧ᩷֫;->ܽ:I

    iget v14, v12, Ll/ۧ᩷֫;->ᩳ:I

    iget v15, v12, Ll/ۧ᩷֫;->ۜ:I

    iget v12, v12, Ll/ۧ᩷֫;->᩷:I

    invoke-virtual {v13, v5, v14, v15, v12}, Ll/ۡ᩻֫;->setAnimations(IIII)V

    .line 395
    invoke-virtual {v3, v13}, Ll/ۚۜ֫;->ۜ(Ll/ۡ᩻֫;)V

    goto :goto_19

    :pswitch_17
    move-object/from16 v16, v5

    .line 390
    iget v5, v12, Ll/ۧ᩷֫;->ܽ:I

    iget v14, v12, Ll/ۧ᩷֫;->ᩳ:I

    iget v15, v12, Ll/ۧ᩷֫;->ۜ:I

    iget v12, v12, Ll/ۧ᩷֫;->᩷:I

    invoke-virtual {v13, v5, v14, v15, v12}, Ll/ۡ᩻֫;->setAnimations(IIII)V

    .line 391
    invoke-virtual {v3, v13}, Ll/ۚۜ֫;->ۢ(Ll/ۡ᩻֫;)V

    goto :goto_19

    :pswitch_18
    move-object/from16 v16, v5

    .line 385
    iget v5, v12, Ll/ۧ᩷֫;->ܽ:I

    iget v14, v12, Ll/ۧ᩷֫;->ᩳ:I

    iget v15, v12, Ll/ۧ᩷֫;->ۜ:I

    iget v12, v12, Ll/ۧ᩷֫;->᩷:I

    invoke-virtual {v13, v5, v14, v15, v12}, Ll/ۡ᩻֫;->setAnimations(IIII)V

    const/4 v5, 0x0

    .line 386
    invoke-virtual {v3, v13, v5}, Ll/ۚۜ֫;->֫(Ll/ۡ᩻֫;Z)V

    .line 387
    invoke-virtual {v3, v13}, Ll/ۚۜ֫;->֫(Ll/ۡ᩻֫;)Ll/ۛۜ֫;

    :cond_20
    :goto_19
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v5, v16

    goto/16 :goto_17

    :cond_21
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_12

    :cond_22
    move-object/from16 v6, p2

    add-int/lit8 v1, v4, -0x1

    .line 1877
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    move/from16 v5, p3

    :goto_1a
    if-ge v5, v4, :cond_27

    .line 1881
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ᩳܳ֫;

    if-eqz v1, :cond_24

    .line 1884
    iget-object v9, v7, Ll/ܽ᩷֫;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v9

    :cond_23
    :goto_1b
    add-int/lit8 v9, v9, -0x1

    if-ltz v9, :cond_26

    .line 1885
    iget-object v10, v7, Ll/ܽ᩷֫;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ۧ᩷֫;

    .line 1886
    iget-object v10, v10, Ll/ۧ᩷֫;->ܿ:Ll/ۡ᩻֫;

    if-eqz v10, :cond_23

    .line 1889
    invoke-virtual {v0, v10}, Ll/ۚۜ֫;->ᩳ(Ll/ۡ᩻֫;)Ll/ۛۜ֫;

    move-result-object v10

    .line 1890
    invoke-virtual {v10}, Ll/ۛۜ֫;->ۢ()V

    goto :goto_1b

    .line 1894
    :cond_24
    iget-object v7, v7, Ll/ܽ᩷֫;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_25
    :goto_1c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_26

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۧ᩷֫;

    .line 1895
    iget-object v9, v9, Ll/ۧ᩷֫;->ܿ:Ll/ۡ᩻֫;

    if-eqz v9, :cond_25

    .line 1898
    invoke-virtual {v0, v9}, Ll/ۚۜ֫;->ᩳ(Ll/ۡ᩻֫;)Ll/ۛۜ֫;

    move-result-object v9

    .line 1899
    invoke-virtual {v9}, Ll/ۛۜ֫;->ۢ()V

    goto :goto_1c

    :cond_26
    add-int/lit8 v5, v5, 0x1

    goto :goto_1a

    .line 1906
    :cond_27
    iget v5, v0, Ll/ۚۜ֫;->᩻:I

    const/4 v7, 0x1

    invoke-virtual {v0, v5, v7}, Ll/ۚۜ֫;->֫(IZ)V

    .line 1930
    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    move/from16 v7, p3

    :goto_1d
    if-ge v7, v4, :cond_2a

    .line 1932
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ᩳܳ֫;

    .line 1933
    iget-object v9, v9, Ll/ܽ᩷֫;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_28
    :goto_1e
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_29

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ۧ᩷֫;

    .line 1934
    iget-object v10, v10, Ll/ۧ᩷֫;->ܿ:Ll/ۡ᩻֫;

    if-eqz v10, :cond_28

    .line 1936
    iget-object v10, v10, Ll/ۡ᩻֫;->mContainer:Landroid/view/ViewGroup;

    if-eqz v10, :cond_28

    .line 55
    invoke-virtual/range {p0 .. p0}, Ll/ۚۜ֫;->᩶()Ll/۬᩷֫;

    move-result-object v11

    .line 56
    invoke-static {v10, v11}, Ll/ۗ᩷֫;->֫(Landroid/view/ViewGroup;Ll/۬᩷֫;)Ll/ۗ᩷֫;

    move-result-object v10

    .line 1938
    invoke-virtual {v5, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1e

    :cond_29
    add-int/lit8 v7, v7, 0x1

    goto :goto_1d

    .line 1909
    :cond_2a
    invoke-virtual {v5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1f
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۗ᩷֫;

    .line 228
    iput-boolean v1, v7, Ll/ۗ᩷֫;->ܽ:Z

    .line 1911
    invoke-virtual {v7}, Ll/ۗ᩷֫;->ᩳ()V

    .line 1912
    invoke-virtual {v7}, Ll/ۗ᩷֫;->֫()V

    goto :goto_1f

    :cond_2b
    move/from16 v1, p3

    :goto_20
    if-ge v1, v4, :cond_2d

    .line 1916
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳܳ֫;

    .line 1917
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-eqz v7, :cond_2c

    .line 1918
    iget v7, v5, Ll/ᩳܳ֫;->ۚ:I

    if-ltz v7, :cond_2c

    .line 1919
    iput v3, v5, Ll/ᩳܳ֫;->ۚ:I

    .line 296
    :cond_2c
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v1, v1, 0x1

    goto :goto_20

    :cond_2d
    if-eqz v8, :cond_2e

    .line 2087
    iget-object v1, v0, Ll/ۚۜ֫;->ۧ:Ljava/util/ArrayList;

    if-eqz v1, :cond_2e

    const/4 v1, 0x0

    .line 2088
    :goto_21
    iget-object v2, v0, Ll/ۚۜ֫;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_2e

    .line 2089
    iget-object v2, v0, Ll/ۚۜ֫;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩴۜ֫;

    invoke-interface {v2}, Ll/ᩴۜ֫;->֫()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_21

    :cond_2e
    return-void

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_e
        :pswitch_5
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_18
        :pswitch_f
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch
.end method

.method private ܰ()Ljava/util/HashSet;
    .locals 4

    .line 2034
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 2036
    iget-object v1, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    invoke-virtual {v1}, Ll/ۨۜ֫;->ۧ()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛۜ֫;

    .line 2037
    invoke-virtual {v2}, Ll/ۛۜ֫;->᩷()Ll/ۡ᩻֫;

    move-result-object v2

    iget-object v2, v2, Ll/ۡ᩻֫;->mContainer:Landroid/view/ViewGroup;

    if-eqz v2, :cond_0

    .line 2040
    invoke-virtual {p0}, Ll/ۚۜ֫;->᩶()Ll/۬᩷֫;

    move-result-object v3

    .line 2039
    invoke-static {v2, v3}, Ll/ۗ᩷֫;->֫(Landroid/view/ViewGroup;Ll/۬᩷֫;)Ll/ۗ᩷֫;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private ܽ(Z)V
    .locals 2

    .line 1694
    iget-boolean v0, p0, Ll/ۚۜ֫;->ۡ:Z

    if-nez v0, :cond_6

    .line 1698
    iget-object v0, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    if-nez v0, :cond_1

    .line 1699
    iget-boolean p1, p0, Ll/ۚۜ֫;->᩷:Z

    if-eqz p1, :cond_0

    .line 1700
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "FragmentManager has been destroyed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1702
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "FragmentManager has not been attached to a host."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1706
    :cond_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    invoke-virtual {v1}, Ll/ۙ᩻֫;->ܿ()Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_5

    if-nez p1, :cond_3

    .line 1609
    invoke-virtual {p0}, Ll/ۚۜ֫;->۬()Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    .line 1610
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Can not perform this action after onSaveInstanceState"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1714
    :cond_3
    :goto_0
    iget-object p1, p0, Ll/ۚۜ֫;->ܳ֫:Ljava/util/ArrayList;

    if-nez p1, :cond_4

    .line 1715
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۚۜ֫;->ܳ֫:Ljava/util/ArrayList;

    .line 1716
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۚۜ֫;->ܿ֫:Ljava/util/ArrayList;

    :cond_4
    return-void

    .line 1707
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Must be called from main thread of fragment host"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1695
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "FragmentManager is already executing transactions"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ܿ(I)Z
    .locals 1

    const-string v0, "FragmentManager"

    .line 134
    invoke-static {v0, p0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private ᩳ(I)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 2975
    :try_start_0
    iput-boolean v0, p0, Ll/ۚۜ֫;->ۡ:Z

    .line 2976
    iget-object v2, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    invoke-virtual {v2, p1}, Ll/ۨۜ֫;->֫(I)V

    .line 2977
    invoke-virtual {p0, p1, v1}, Ll/ۚۜ֫;->֫(IZ)V

    .line 2978
    invoke-direct {p0}, Ll/ۚۜ֫;->ܰ()Ljava/util/HashSet;

    move-result-object p1

    .line 2979
    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۗ᩷֫;

    .line 2980
    invoke-virtual {v2}, Ll/ۗ᩷֫;->ۧ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 2983
    :cond_0
    iput-boolean v1, p0, Ll/ۚۜ֫;->ۡ:Z

    .line 2985
    invoke-virtual {p0, v0}, Ll/ۚۜ֫;->ۧ(Z)Z

    return-void

    :catchall_0
    move-exception p1

    .line 2983
    iput-boolean v1, p0, Ll/ۚۜ֫;->ۡ:Z

    .line 2984
    throw p1
.end method

.method public static ᩴ(Ll/ۡ᩻֫;)Z
    .locals 3

    .line 3353
    iget-boolean v0, p0, Ll/ۡ᩻֫;->mHasMenu:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/ۡ᩻֫;->mMenuVisible:Z

    if-nez v0, :cond_3

    :cond_0
    iget-object p0, p0, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    .line 3341
    iget-object p0, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    invoke-virtual {p0}, Ll/ۨۜ֫;->ܽ()Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    const/4 v1, 0x0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۡ᩻֫;

    if-eqz v2, :cond_2

    .line 3343
    invoke-static {v2}, Ll/ۚۜ֫;->ᩴ(Ll/ۡ᩻֫;)Z

    move-result v1

    :cond_2
    if-eqz v1, :cond_1

    :cond_3
    const/4 p0, 0x1

    return p0

    :cond_4
    return v0
.end method

.method public static ᩵(Ll/ۡ᩻֫;)Z
    .locals 2

    if-nez p0, :cond_0

    goto :goto_0

    .line 656
    :cond_0
    iget-object v0, p0, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    .line 3182
    iget-object v1, v0, Ll/ۚۜ֫;->ۨ:Ll/ۡ᩻֫;

    .line 662
    invoke-virtual {p0, v1}, Ll/ۡ᩻֫;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    iget-object p0, v0, Ll/ۚۜ֫;->ۤ:Ll/ۡ᩻֫;

    .line 663
    invoke-static {p0}, Ll/ۚۜ֫;->᩵(Ll/ۡ᩻֫;)Z

    move-result p0

    if-eqz p0, :cond_1

    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method private ᩺()V
    .locals 1

    const/4 v0, 0x0

    .line 1745
    iput-boolean v0, p0, Ll/ۚۜ֫;->ۡ:Z

    .line 1746
    iget-object v0, p0, Ll/ۚۜ֫;->ܿ֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1747
    iget-object v0, p0, Ll/ۚۜ֫;->ܳ֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    const/16 v0, 0x80

    const-string v1, "FragmentManager{"

    .line 0
    invoke-static {v0, v1}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1270
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " in "

    .line 1271
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1272
    iget-object v1, p0, Ll/ۚۜ֫;->ۤ:Ll/ۡ᩻֫;

    const-string v2, "}"

    const-string v3, "{"

    if-eqz v1, :cond_0

    .line 1273
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 1274
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1275
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1276
    iget-object v1, p0, Ll/ۚۜ֫;->ۤ:Ll/ۡ᩻֫;

    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1277
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 1278
    :cond_0
    iget-object v1, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    if-eqz v1, :cond_1

    .line 1279
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 1280
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1281
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1282
    iget-object v1, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1283
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const-string v1, "null"

    .line 1285
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    const-string v1, "}}"

    .line 1287
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1288
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()Ll/ܶ᩻֫;
    .locals 1

    .line 2595
    iget-object v0, p0, Ll/ۚۜ֫;->ܿ:Ll/ܶ᩻֫;

    return-object v0
.end method

.method public final ֨()Ljava/util/List;
    .locals 1

    .line 1164
    iget-object v0, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    invoke-virtual {v0}, Ll/ۨۜ֫;->ܿ()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 1684
    iget-object v0, p0, Ll/ۚۜ֫;->ܽ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    return v0
.end method

.method public final ֫(Ll/ۡ᩻֫;)Ll/ۛۜ֫;
    .locals 3

    .line 1473
    iget-object v0, p1, Ll/ۡ᩻֫;->mPreviousWho:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 1474
    invoke-static {p1, v0}, Ll/᩺᩷֫;->֫(Ll/ۡ᩻֫;Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x2

    .line 1476
    invoke-static {v0}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ll/ۡ᩻֫;->toString()Ljava/lang/String;

    .line 1477
    :cond_1
    invoke-virtual {p0, p1}, Ll/ۚۜ֫;->ᩳ(Ll/ۡ᩻֫;)Ll/ۛۜ֫;

    move-result-object v0

    .line 1478
    iput-object p0, p1, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    .line 1479
    iget-object v1, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    invoke-virtual {v1, v0}, Ll/ۨۜ֫;->֫(Ll/ۛۜ֫;)V

    .line 1480
    iget-boolean v2, p1, Ll/ۡ᩻֫;->mDetached:Z

    if-nez v2, :cond_3

    .line 1481
    invoke-virtual {v1, p1}, Ll/ۨۜ֫;->֫(Ll/ۡ᩻֫;)V

    const/4 v1, 0x0

    .line 1482
    iput-boolean v1, p1, Ll/ۡ᩻֫;->mRemoving:Z

    .line 1483
    iget-object v2, p1, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    if-nez v2, :cond_2

    .line 1484
    iput-boolean v1, p1, Ll/ۡ᩻֫;->mHiddenChanged:Z

    .line 1486
    :cond_2
    invoke-static {p1}, Ll/ۚۜ֫;->ᩴ(Ll/ۡ᩻֫;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    .line 1487
    iput-boolean p1, p0, Ll/ۚۜ֫;->۠:Z

    :cond_3
    return-object v0
.end method

.method public final ֫(I)Ll/ۡ᩻֫;
    .locals 1

    .line 1579
    iget-object v0, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    invoke-virtual {v0, p1}, Ll/ۨۜ֫;->ۧ(I)Ll/ۡ᩻֫;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;)Ll/ۡ᩻֫;
    .locals 1

    .line 1605
    iget-object v0, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    invoke-virtual {v0, p1}, Ll/ۨۜ֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩻֫;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(IZ)V
    .locals 1

    .line 1424
    iget-object v0, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    if-nez v0, :cond_1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 1425
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "No activity"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-nez p2, :cond_2

    .line 1428
    iget p2, p0, Ll/ۚۜ֫;->᩻:I

    if-ne p1, p2, :cond_2

    goto :goto_2

    .line 1432
    :cond_2
    iput p1, p0, Ll/ۚۜ֫;->᩻:I

    .line 1433
    iget-object p1, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    invoke-virtual {p1}, Ll/ۨۜ֫;->᩻()V

    .line 1444
    invoke-virtual {p1}, Ll/ۨۜ֫;->ۧ()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۛۜ֫;

    .line 1445
    invoke-virtual {p0, p2}, Ll/ۚۜ֫;->֫(Ll/ۛۜ֫;)V

    goto :goto_1

    .line 1436
    :cond_3
    iget-boolean p1, p0, Ll/ۚۜ֫;->۠:Z

    if-eqz p1, :cond_4

    iget-object p1, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    if-eqz p1, :cond_4

    iget p2, p0, Ll/ۚۜ֫;->᩻:I

    const/4 v0, 0x7

    if-ne p2, v0, :cond_4

    .line 1437
    invoke-virtual {p1}, Ll/ۙ᩻֫;->᩷()V

    const/4 p1, 0x0

    .line 1438
    iput-boolean p1, p0, Ll/ۚۜ֫;->۠:Z

    :cond_4
    :goto_2
    return-void
.end method

.method public final ֫(Landroid/os/Parcelable;)V
    .locals 14

    .line 2457
    check-cast p1, Landroid/os/Bundle;

    .line 2459
    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "result_"

    .line 2460
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 2461
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 2463
    iget-object v3, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    invoke-virtual {v3}, Ll/ۙ᩻֫;->ᩳ()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    const/4 v3, 0x7

    .line 2464
    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 2465
    iget-object v3, p0, Ll/ۚۜ֫;->ܰ:Ljava/util/Map;

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 2471
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2472
    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string v3, "state"

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v4, "fragment_"

    .line 2473
    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 2474
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 2476
    iget-object v4, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    invoke-virtual {v4}, Ll/ۙ᩻֫;->ᩳ()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 2477
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Ll/۬ۜ֫;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 2481
    :cond_3
    iget-object v1, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    invoke-virtual {v1, v0}, Ll/ۨۜ֫;->ۧ(Ljava/util/ArrayList;)V

    .line 2483
    invoke-virtual {p1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Ll/ܶۜ֫;

    if-nez p1, :cond_4

    return-void

    .line 2488
    :cond_4
    invoke-virtual {v1}, Ll/ۨۜ֫;->ۜ()V

    .line 2489
    iget-object v0, p1, Ll/ܶۜ֫;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    iget-object v3, p0, Ll/ۚۜ֫;->ۚ:Ll/ۤ᩻֫;

    const/4 v4, 0x0

    const/4 v5, 0x2

    if-eqz v2, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 2491
    invoke-virtual {v1, v2, v4}, Ll/ۨۜ֫;->֫(Ljava/lang/String;Ll/۬ۜ֫;)Ll/۬ۜ֫;

    move-result-object v11

    if-eqz v11, :cond_5

    .line 2494
    iget-object v2, p0, Ll/ۚۜ֫;->ܶ:Ll/᩹ۜ֫;

    iget-object v4, v11, Ll/۬ۜ֫;->۟:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ll/᩹ۜ֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩻֫;

    move-result-object v2

    if-eqz v2, :cond_7

    .line 2496
    invoke-static {v5}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 2497
    invoke-virtual {v2}, Ll/ۡ᩻֫;->toString()Ljava/lang/String;

    .line 2500
    :cond_6
    new-instance v4, Ll/ۛۜ֫;

    invoke-direct {v4, v3, v1, v2, v11}, Ll/ۛۜ֫;-><init>(Ll/ۤ᩻֫;Ll/ۨۜ֫;Ll/ۡ᩻֫;Ll/۬ۜ֫;)V

    goto :goto_3

    .line 2503
    :cond_7
    new-instance v4, Ll/ۛۜ֫;

    iget-object v2, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    .line 2504
    invoke-virtual {v2}, Ll/ۙ᩻֫;->ᩳ()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v9

    .line 2505
    invoke-virtual {p0}, Ll/ۚۜ֫;->ۚ()Ll/᩶᩻֫;

    move-result-object v10

    iget-object v7, p0, Ll/ۚۜ֫;->ۚ:Ll/ۤ᩻֫;

    iget-object v8, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    move-object v6, v4

    invoke-direct/range {v6 .. v11}, Ll/ۛۜ֫;-><init>(Ll/ۤ᩻֫;Ll/ۨۜ֫;Ljava/lang/ClassLoader;Ll/᩶᩻֫;Ll/۬ۜ֫;)V

    .line 2507
    :goto_3
    invoke-virtual {v4}, Ll/ۛۜ֫;->᩷()Ll/ۡ᩻֫;

    move-result-object v2

    .line 2508
    iput-object p0, v2, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    .line 2509
    invoke-static {v5}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 2510
    invoke-virtual {v2}, Ll/ۡ᩻֫;->toString()Ljava/lang/String;

    .line 2512
    :cond_8
    iget-object v2, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    invoke-virtual {v2}, Ll/ۙ᩻֫;->ᩳ()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v4, v2}, Ll/ۛۜ֫;->֫(Ljava/lang/ClassLoader;)V

    .line 2513
    invoke-virtual {v1, v4}, Ll/ۨۜ֫;->֫(Ll/ۛۜ֫;)V

    .line 2517
    iget v2, p0, Ll/ۚۜ֫;->᩻:I

    invoke-virtual {v4, v2}, Ll/ۛۜ֫;->֫(I)V

    goto :goto_2

    .line 2523
    :cond_9
    iget-object v0, p0, Ll/ۚۜ֫;->ܶ:Ll/᩹ۜ֫;

    invoke-virtual {v0}, Ll/᩹ۜ֫;->ᩳ()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_a
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v6, 0x1

    if-eqz v2, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۡ᩻֫;

    .line 2524
    iget-object v7, v2, Ll/ۡ᩻֫;->mWho:Ljava/lang/String;

    invoke-virtual {v1, v7}, Ll/ۨۜ֫;->֫(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_a

    .line 2525
    invoke-static {v5}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v7

    if-eqz v7, :cond_b

    .line 2526
    invoke-virtual {v2}, Ll/ۡ᩻֫;->toString()Ljava/lang/String;

    iget-object v7, p1, Ll/ܶۜ֫;->᩸:Ljava/util/ArrayList;

    invoke-static {v7}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 2529
    :cond_b
    iget-object v7, p0, Ll/ۚۜ֫;->ܶ:Ll/᩹ۜ֫;

    invoke-virtual {v7, v2}, Ll/᩹ۜ֫;->ܿ(Ll/ۡ᩻֫;)V

    .line 2533
    iput-object p0, v2, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    .line 2534
    new-instance v7, Ll/ۛۜ֫;

    invoke-direct {v7, v3, v1, v2}, Ll/ۛۜ֫;-><init>(Ll/ۤ᩻֫;Ll/ۨۜ֫;Ll/ۡ᩻֫;)V

    .line 2536
    invoke-virtual {v7, v6}, Ll/ۛۜ֫;->֫(I)V

    .line 2537
    invoke-virtual {v7}, Ll/ۛۜ֫;->ۢ()V

    .line 2538
    iput-boolean v6, v2, Ll/ۡ᩻֫;->mRemoving:Z

    .line 2539
    invoke-virtual {v7}, Ll/ۛۜ֫;->ۢ()V

    goto :goto_4

    .line 2544
    :cond_c
    iget-object v0, p1, Ll/ܶۜ֫;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ll/ۨۜ֫;->֫(Ljava/util/ArrayList;)V

    .line 2547
    iget-object v0, p1, Ll/ܶۜ֫;->᩶:[Ll/ܳܳ֫;

    if-eqz v0, :cond_13

    .line 2548
    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p1, Ll/ܶۜ֫;->᩶:[Ll/ܳܳ֫;

    array-length v2, v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/ۚۜ֫;->֫:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 2549
    :goto_5
    iget-object v2, p1, Ll/ܶۜ֫;->᩶:[Ll/ܳܳ֫;

    array-length v3, v2

    if-ge v0, v3, :cond_14

    .line 2550
    aget-object v2, v2, v0

    .line 111
    iget-object v3, v2, Ll/ܳܳ֫;->۬:Ljava/util/ArrayList;

    new-instance v4, Ll/ᩳܳ֫;

    invoke-direct {v4, p0}, Ll/ᩳܳ֫;-><init>(Ll/ۚۜ֫;)V

    .line 153
    iget-object v7, v2, Ll/ܳܳ֫;->ۨ:[I

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 155
    :goto_6
    array-length v10, v7

    if-ge v8, v10, :cond_f

    .line 156
    new-instance v10, Ll/ۧ᩷֫;

    invoke-direct {v10}, Ll/ۧ᩷֫;-><init>()V

    add-int/lit8 v11, v8, 0x1

    .line 157
    aget v12, v7, v8

    iput v12, v10, Ll/ۧ᩷֫;->֫:I

    .line 158
    invoke-static {v5}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v5

    if-eqz v5, :cond_d

    .line 159
    invoke-static {v4}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    aget v5, v7, v11

    .line 162
    :cond_d
    invoke-static {}, Ll/ܰۢ֫;->values()[Ll/ܰۢ֫;

    move-result-object v5

    iget-object v12, v2, Ll/ܳܳ֫;->ۛ:[I

    aget v12, v12, v9

    aget-object v5, v5, v12

    iput-object v5, v10, Ll/ۧ᩷֫;->᩻:Ll/ܰۢ֫;

    .line 163
    invoke-static {}, Ll/ܰۢ֫;->values()[Ll/ܰۢ֫;

    move-result-object v5

    iget-object v12, v2, Ll/ܳܳ֫;->ۗ:[I

    aget v12, v12, v9

    aget-object v5, v5, v12

    iput-object v5, v10, Ll/ۧ᩷֫;->ۧ:Ll/ܰۢ֫;

    add-int/lit8 v5, v8, 0x2

    .line 164
    aget v11, v7, v11

    if-eqz v11, :cond_e

    const/4 v11, 0x1

    goto :goto_7

    :cond_e
    const/4 v11, 0x0

    :goto_7
    iput-boolean v11, v10, Ll/ۧ᩷֫;->ܳ:Z

    add-int/lit8 v11, v8, 0x3

    .line 165
    aget v5, v7, v5

    iput v5, v10, Ll/ۧ᩷֫;->ܽ:I

    add-int/lit8 v12, v8, 0x4

    .line 166
    aget v11, v7, v11

    iput v11, v10, Ll/ۧ᩷֫;->ᩳ:I

    add-int/lit8 v13, v8, 0x5

    .line 167
    aget v12, v7, v12

    iput v12, v10, Ll/ۧ᩷֫;->ۜ:I

    add-int/lit8 v8, v8, 0x6

    .line 168
    aget v13, v7, v13

    iput v13, v10, Ll/ۧ᩷֫;->᩷:I

    .line 169
    iput v5, v4, Ll/ܽ᩷֫;->᩻:I

    .line 170
    iput v11, v4, Ll/ܽ᩷֫;->ۜ:I

    .line 171
    iput v12, v4, Ll/ܽ᩷֫;->ۡ:I

    .line 172
    iput v13, v4, Ll/ܽ᩷֫;->ܺ:I

    .line 173
    invoke-virtual {v4, v10}, Ll/ܽ᩷֫;->֫(Ll/ۧ᩷֫;)V

    add-int/lit8 v9, v9, 0x1

    const/4 v5, 0x2

    goto :goto_6

    :cond_f
    const/4 v5, 0x2

    .line 176
    iget v7, v2, Ll/ܳܳ֫;->֫֫:I

    iput v7, v4, Ll/ܽ᩷֫;->᩵:I

    .line 177
    iget-object v7, v2, Ll/ܳܳ֫;->ۤ:Ljava/lang/String;

    iput-object v7, v4, Ll/ܽ᩷֫;->᩷:Ljava/lang/String;

    .line 178
    iput-boolean v6, v4, Ll/ܽ᩷֫;->֫:Z

    .line 179
    iget v7, v2, Ll/ܳܳ֫;->᩶:I

    iput v7, v4, Ll/ܽ᩷֫;->ܿ:I

    .line 180
    iget-object v7, v2, Ll/ܳܳ֫;->ۙ:Ljava/lang/CharSequence;

    iput-object v7, v4, Ll/ܽ᩷֫;->ܳ:Ljava/lang/CharSequence;

    .line 181
    iget v7, v2, Ll/ܳܳ֫;->᩸:I

    iput v7, v4, Ll/ܽ᩷֫;->ܽ:I

    .line 182
    iget-object v7, v2, Ll/ܳܳ֫;->᩹:Ljava/lang/CharSequence;

    iput-object v7, v4, Ll/ܽ᩷֫;->ᩳ:Ljava/lang/CharSequence;

    .line 183
    iget-object v7, v2, Ll/ܳܳ֫;->ܰ:Ljava/util/ArrayList;

    iput-object v7, v4, Ll/ܽ᩷֫;->ۘ:Ljava/util/ArrayList;

    .line 184
    iget-object v7, v2, Ll/ܳܳ֫;->۟:Ljava/util/ArrayList;

    iput-object v7, v4, Ll/ܽ᩷֫;->ᩴ:Ljava/util/ArrayList;

    .line 185
    iget-boolean v7, v2, Ll/ܳܳ֫;->᩺:Z

    iput-boolean v7, v4, Ll/ܽ᩷֫;->ۖ:Z

    .line 113
    iget v2, v2, Ll/ܳܳ֫;->۫:I

    iput v2, v4, Ll/ᩳܳ֫;->ۚ:I

    const/4 v2, 0x0

    .line 114
    :goto_8
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v2, v7, :cond_11

    .line 115
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    if-eqz v7, :cond_10

    .line 117
    iget-object v8, v4, Ll/ܽ᩷֫;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۧ᩷֫;

    .line 1605
    invoke-virtual {v1, v7}, Ll/ۨۜ֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩻֫;

    move-result-object v7

    .line 117
    iput-object v7, v8, Ll/ۧ᩷֫;->ܿ:Ll/ۡ᩻֫;

    :cond_10
    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    .line 120
    :cond_11
    invoke-virtual {v4, v6}, Ll/ᩳܳ֫;->֫(I)V

    .line 2551
    invoke-static {v5}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v2

    if-eqz v2, :cond_12

    .line 2552
    invoke-virtual {v4}, Ll/ᩳܳ֫;->toString()Ljava/lang/String;

    .line 2554
    new-instance v2, Ll/֡᩷֫;

    invoke-direct {v2}, Ll/֡᩷֫;-><init>()V

    .line 2555
    new-instance v3, Ljava/io/PrintWriter;

    invoke-direct {v3, v2}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    const-string v2, "  "

    const/4 v5, 0x0

    .line 2556
    invoke-virtual {v4, v2, v3, v5}, Ll/ᩳܳ֫;->֫(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    .line 2557
    invoke-virtual {v3}, Ljava/io/PrintWriter;->close()V

    .line 2559
    :cond_12
    iget-object v2, p0, Ll/ۚۜ֫;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    const/4 v5, 0x2

    goto/16 :goto_5

    .line 2562
    :cond_13
    iput-object v4, p0, Ll/ۚۜ֫;->֫:Ljava/util/ArrayList;

    .line 2564
    :cond_14
    iget-object v0, p0, Ll/ۚۜ֫;->ܽ:Ljava/util/concurrent/atomic/AtomicInteger;

    iget v2, p1, Ll/ܶۜ֫;->ۙ:I

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 2566
    iget-object v0, p1, Ll/ܶۜ֫;->ۤ:Ljava/lang/String;

    if-eqz v0, :cond_15

    .line 1605
    invoke-virtual {v1, v0}, Ll/ۨۜ֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩻֫;

    move-result-object v0

    .line 2567
    iput-object v0, p0, Ll/ۚۜ֫;->ۨ:Ll/ۡ᩻֫;

    .line 2568
    invoke-direct {p0, v0}, Ll/ۚۜ֫;->ۖ(Ll/ۡ᩻֫;)V

    .line 2571
    :cond_15
    iget-object v0, p1, Ll/ܶۜ֫;->ۗ:Ljava/util/ArrayList;

    if-eqz v0, :cond_16

    const/4 v1, 0x0

    .line 2573
    :goto_9
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_16

    .line 2574
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p1, Ll/ܶۜ֫;->۬:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۜܳ֫;

    iget-object v4, p0, Ll/ۚۜ֫;->ᩳ:Ljava/util/Map;

    invoke-interface {v4, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    .line 2578
    :cond_16
    new-instance v0, Ljava/util/ArrayDeque;

    iget-object p1, p1, Ll/ܶۜ֫;->۫:Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ll/ۚۜ֫;->᩵:Ljava/util/ArrayDeque;

    return-void
.end method

.method public final ֫(Landroid/view/Menu;)V
    .locals 2

    .line 3134
    iget v0, p0, Ll/ۚۜ֫;->᩻:I

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    goto :goto_1

    .line 3137
    :cond_0
    iget-object v0, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    invoke-virtual {v0}, Ll/ۨۜ֫;->ܿ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡ᩻֫;

    if-eqz v1, :cond_1

    .line 3139
    invoke-virtual {v1, p1}, Ll/ۡ᩻֫;->performOptionsMenuClosed(Landroid/view/Menu;)V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 4

    const-string v0, "    "

    .line 0
    invoke-static {p1, v0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1303
    iget-object v1, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    invoke-virtual {v1, p1, p2, p3, p4}, Ll/ۨۜ֫;->֫(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 1306
    iget-object p2, p0, Ll/ۚۜ֫;->ܳ:Ljava/util/ArrayList;

    const/4 p4, 0x0

    if-eqz p2, :cond_0

    .line 1307
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_0

    .line 1309
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "Fragments Created Menus:"

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    .line 1311
    iget-object v2, p0, Ll/ۚۜ֫;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۡ᩻֫;

    .line 1312
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "  #"

    .line 1313
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1314
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    const-string v3, ": "

    .line 1315
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1316
    invoke-virtual {v2}, Ll/ۡ᩻֫;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1321
    :cond_0
    iget-object p2, p0, Ll/ۚۜ֫;->֫:Ljava/util/ArrayList;

    if-eqz p2, :cond_1

    .line 1322
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_1

    .line 1324
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "Back Stack:"

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    const/4 v1, 0x0

    :goto_1
    if-ge v1, p2, :cond_1

    .line 1326
    iget-object v2, p0, Ll/ۚۜ֫;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳܳ֫;

    .line 1327
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "  #"

    .line 1328
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1329
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    const-string v3, ": "

    .line 1330
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1331
    invoke-virtual {v2}, Ll/ᩳܳ֫;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    const/4 v3, 0x1

    .line 59
    invoke-virtual {v2, v0, p3, v3}, Ll/ᩳܳ֫;->֫(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 1337
    :cond_1
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1338
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Back Stack Index: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Ll/ۚۜ֫;->ܽ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 1340
    iget-object p2, p0, Ll/ۚۜ֫;->ۛ:Ljava/util/ArrayList;

    move-object v0, p2

    monitor-enter v0

    .line 1341
    :try_start_0
    iget-object p2, p0, Ll/ۚۜ֫;->ۛ:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_2

    .line 1343
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "Pending Actions:"

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :goto_2
    if-ge p4, p2, :cond_2

    .line 1345
    iget-object v1, p0, Ll/ۚۜ֫;->ۛ:Ljava/util/ArrayList;

    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩵ۜ֫;

    .line 1346
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v2, "  #"

    .line 1347
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1348
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    const-string v2, ": "

    .line 1349
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1350
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    add-int/lit8 p4, p4, 0x1

    goto :goto_2

    .line 1353
    :cond_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1355
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "FragmentManager misc state:"

    .line 1356
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 1357
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mHost="

    .line 1358
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1359
    iget-object p2, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1360
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mContainer="

    .line 1361
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1362
    iget-object p2, p0, Ll/ۚۜ֫;->ܿ:Ll/ܶ᩻֫;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1363
    iget-object p2, p0, Ll/ۚۜ֫;->ۤ:Ll/ۡ᩻֫;

    if-eqz p2, :cond_3

    .line 1364
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mParent="

    .line 1365
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1366
    iget-object p2, p0, Ll/ۚۜ֫;->ۤ:Ll/ۡ᩻֫;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1368
    :cond_3
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mCurState="

    .line 1369
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1370
    iget p2, p0, Ll/ۚۜ֫;->᩻:I

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(I)V

    const-string p2, " mStateSaved="

    .line 1371
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1372
    iget-boolean p2, p0, Ll/ۚۜ֫;->ۧ֫:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    const-string p2, " mStopped="

    .line 1373
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1374
    iget-boolean p2, p0, Ll/ۚۜ֫;->ܽ֫:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    const-string p2, " mDestroyed="

    .line 1375
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1376
    iget-boolean p2, p0, Ll/ۚۜ֫;->᩷:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Z)V

    .line 1377
    iget-boolean p2, p0, Ll/ۚۜ֫;->۠:Z

    if-eqz p2, :cond_4

    .line 1378
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p1, "  mNeedMenuInvalidate="

    .line 1379
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1380
    iget-boolean p1, p0, Ll/ۚۜ֫;->۠:Z

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->println(Z)V

    :cond_4
    return-void

    :catchall_0
    move-exception p1

    .line 1353
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/ۙ᩻֫;Ll/ܶ᩻֫;Ll/ۡ᩻֫;)V
    .locals 3

    .line 2607
    iget-object v0, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    if-nez v0, :cond_f

    .line 2608
    iput-object p1, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    .line 2609
    iput-object p2, p0, Ll/ۚۜ֫;->ܿ:Ll/ܶ᩻֫;

    .line 2610
    iput-object p3, p0, Ll/ۚۜ֫;->ۤ:Ll/ۡ᩻֫;

    .line 2614
    iget-object p2, p0, Ll/ۚۜ֫;->᩸:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz p3, :cond_0

    .line 2615
    new-instance v0, Ll/ۜۜ֫;

    invoke-direct {v0, p3}, Ll/ۜۜ֫;-><init>(Ll/ۡ᩻֫;)V

    .line 3302
    :goto_0
    invoke-virtual {p2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 2623
    :cond_0
    instance-of v0, p1, Ll/᩶ۜ֫;

    if-eqz v0, :cond_1

    .line 2624
    move-object v0, p1

    check-cast v0, Ll/᩶ۜ֫;

    goto :goto_0

    .line 2627
    :cond_1
    :goto_1
    iget-object p2, p0, Ll/ۚۜ֫;->ۤ:Ll/ۡ᩻֫;

    if-eqz p2, :cond_2

    .line 2631
    invoke-direct {p0}, Ll/ۚۜ֫;->֫֫()V

    .line 2634
    :cond_2
    instance-of p2, p1, Ll/᩺ܽ;

    if-eqz p2, :cond_4

    .line 2635
    move-object p2, p1

    check-cast p2, Ll/᩺ܽ;

    .line 2636
    invoke-interface {p2}, Ll/᩺ܽ;->getOnBackPressedDispatcher()Ll/ۨܽ;

    move-result-object v0

    iput-object v0, p0, Ll/ۚۜ֫;->᩶:Ll/ۨܽ;

    if-eqz p3, :cond_3

    move-object p2, p3

    .line 2638
    :cond_3
    iget-object v1, p0, Ll/ۚۜ֫;->᩹:Ll/֡ܽ;

    invoke-virtual {v0, p2, v1}, Ll/ۨܽ;->֫(Ll/᩻ۡ֫;Ll/֡ܽ;)V

    :cond_4
    if-eqz p3, :cond_5

    .line 2643
    iget-object p1, p3, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    .line 1174
    iget-object p1, p1, Ll/ۚۜ֫;->ܶ:Ll/᩹ۜ֫;

    invoke-virtual {p1, p3}, Ll/᩹ۜ֫;->ܽ(Ll/ۡ᩻֫;)Ll/᩹ۜ֫;

    move-result-object p1

    .line 2643
    iput-object p1, p0, Ll/ۚۜ֫;->ܶ:Ll/᩹ۜ֫;

    goto :goto_2

    .line 2644
    :cond_5
    instance-of p2, p1, Ll/۬ܺ֫;

    if-eqz p2, :cond_6

    .line 2645
    check-cast p1, Ll/۬ܺ֫;

    invoke-interface {p1}, Ll/۬ܺ֫;->getViewModelStore()Ll/ۗܺ֫;

    move-result-object p1

    .line 2646
    invoke-static {p1}, Ll/᩹ۜ֫;->֫(Ll/ۗܺ֫;)Ll/᩹ۜ֫;

    move-result-object p1

    iput-object p1, p0, Ll/ۚۜ֫;->ܶ:Ll/᩹ۜ֫;

    goto :goto_2

    .line 2648
    :cond_6
    new-instance p1, Ll/᩹ۜ֫;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ll/᩹ۜ֫;-><init>(Z)V

    iput-object p1, p0, Ll/ۚۜ֫;->ܶ:Ll/᩹ۜ֫;

    .line 2651
    :goto_2
    iget-object p1, p0, Ll/ۚۜ֫;->ܶ:Ll/᩹ۜ֫;

    invoke-virtual {p0}, Ll/ۚۜ֫;->۬()Z

    move-result p2

    invoke-virtual {p1, p2}, Ll/᩹ۜ֫;->֫(Z)V

    .line 2652
    iget-object p1, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    iget-object p2, p0, Ll/ۚۜ֫;->ܶ:Ll/᩹ۜ֫;

    invoke-virtual {p1, p2}, Ll/ۨۜ֫;->֫(Ll/᩹ۜ֫;)V

    .line 2654
    iget-object p1, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    instance-of p2, p1, Ll/᩹۫ۧ;

    if-eqz p2, :cond_7

    if-nez p3, :cond_7

    .line 2655
    check-cast p1, Ll/᩹۫ۧ;

    .line 2656
    invoke-interface {p1}, Ll/᩹۫ۧ;->getSavedStateRegistry()Ll/ܶ۫ۧ;

    move-result-object p1

    .line 2657
    new-instance p2, Ll/۟᩻֫;

    invoke-direct {p2, p0}, Ll/۟᩻֫;-><init>(Ll/ۚۜ֫;)V

    const-string v0, "android:support:fragments"

    invoke-virtual {p1, v0, p2}, Ll/ܶ۫ۧ;->֫(Ljava/lang/String;Ll/۠۫ۧ;)V

    .line 2663
    invoke-virtual {p1, v0}, Ll/ܶ۫ۧ;->֫(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 2665
    invoke-virtual {p0, p1}, Ll/ۚۜ֫;->֫(Landroid/os/Parcelable;)V

    .line 2669
    :cond_7
    iget-object p1, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    instance-of p2, p1, Ll/֡ᩳ;

    if-eqz p2, :cond_9

    .line 2670
    check-cast p1, Ll/֡ᩳ;

    .line 2671
    invoke-interface {p1}, Ll/֡ᩳ;->֫()Ll/᩵ᩳ;

    move-result-object p1

    if-eqz p3, :cond_8

    .line 2673
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p3, Ll/ۡ᩻֫;->mWho:Ljava/lang/String;

    const-string v1, ":"

    .line 0
    invoke-static {p2, v0, v1}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_3

    :cond_8
    const-string p2, ""

    :goto_3
    const-string v0, "FragmentManager:"

    invoke-static {v0, p2}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "StartActivityForResult"

    invoke-static {p2, v0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2676
    new-instance v1, Ll/᩶ᩳ;

    .line 29
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 2676
    new-instance v2, Ll/᩷ۜ֫;

    invoke-direct {v2, p0}, Ll/᩷ۜ֫;-><init>(Ll/ۚۜ֫;)V

    invoke-virtual {p1, v0, v1, v2}, Ll/᩵ᩳ;->֫(Ljava/lang/String;Ll/᩸ᩳ;Ll/᩷ᩳ;)Ll/ۢᩳ;

    move-result-object v0

    iput-object v0, p0, Ll/ۚۜ֫;->۟:Ll/ۢᩳ;

    const-string v0, "StartIntentSenderForResult"

    .line 0
    invoke-static {p2, v0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2703
    new-instance v1, Ll/ܺۜ֫;

    .line 29
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 2703
    new-instance v2, Ll/ۢۜ֫;

    invoke-direct {v2, p0}, Ll/ۢۜ֫;-><init>(Ll/ۚۜ֫;)V

    invoke-virtual {p1, v0, v1, v2}, Ll/᩵ᩳ;->֫(Ljava/lang/String;Ll/᩸ᩳ;Ll/᩷ᩳ;)Ll/ۢᩳ;

    move-result-object v0

    iput-object v0, p0, Ll/ۚۜ֫;->֫֫:Ll/ۢᩳ;

    const-string v0, "RequestPermissions"

    .line 0
    invoke-static {p2, v0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 2730
    new-instance v0, Ll/᩹ᩳ;

    .line 29
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 2730
    new-instance v1, Ll/֫ۜ֫;

    invoke-direct {v1, p0}, Ll/֫ۜ֫;-><init>(Ll/ۚۜ֫;)V

    invoke-virtual {p1, p2, v0, v1}, Ll/᩵ᩳ;->֫(Ljava/lang/String;Ll/᩸ᩳ;Ll/᩷ᩳ;)Ll/ۢᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/ۚۜ֫;->᩺:Ll/ۢᩳ;

    .line 2766
    :cond_9
    iget-object p1, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    instance-of p2, p1, Ll/ۗۙ;

    if-eqz p2, :cond_a

    .line 2767
    check-cast p1, Ll/ۗۙ;

    .line 2769
    iget-object p2, p0, Ll/ۚۜ֫;->ۙ:Ll/ۛ᩻֫;

    invoke-interface {p1, p2}, Ll/ۗۙ;->֫(Ll/۬ۤ;)V

    .line 2773
    :cond_a
    iget-object p1, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    instance-of p2, p1, Ll/۬ۙ;

    if-eqz p2, :cond_b

    .line 2774
    check-cast p1, Ll/۬ۙ;

    .line 2775
    iget-object p2, p0, Ll/ۚۜ֫;->۫:Ll/ۨ᩻֫;

    invoke-interface {p1, p2}, Ll/۬ۙ;->ܿ(Ll/۬ۤ;)V

    .line 2778
    :cond_b
    iget-object p1, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    instance-of p2, p1, Ll/ۤ᩶;

    if-eqz p2, :cond_c

    .line 2779
    check-cast p1, Ll/ۤ᩶;

    .line 2781
    iget-object p2, p0, Ll/ۚۜ֫;->ۗ:Ll/᩺᩻֫;

    invoke-interface {p1, p2}, Ll/ۤ᩶;->᩻(Ll/۬ۤ;)V

    .line 2785
    :cond_c
    iget-object p1, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    instance-of p2, p1, Ll/ۛ᩶;

    if-eqz p2, :cond_d

    .line 2786
    check-cast p1, Ll/ۛ᩶;

    .line 2788
    iget-object p2, p0, Ll/ۚۜ֫;->۬:Ll/ܰ᩻֫;

    invoke-interface {p1, p2}, Ll/ۛ᩶;->ᩳ(Ll/۬ۤ;)V

    .line 2792
    :cond_d
    iget-object p1, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    instance-of p2, p1, Ll/᩶ۛ;

    if-eqz p2, :cond_e

    if-nez p3, :cond_e

    .line 2793
    check-cast p1, Ll/᩶ۛ;

    iget-object p2, p0, Ll/ۚۜ֫;->֨:Ll/ۨۛ;

    invoke-interface {p1, p2}, Ll/᩶ۛ;->addMenuProvider(Ll/ۨۛ;)V

    :cond_e
    return-void

    .line 2607
    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Already attached"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ۛۜ֫;)V
    .locals 2

    .line 1385
    invoke-virtual {p1}, Ll/ۛۜ֫;->᩷()Ll/ۡ᩻֫;

    move-result-object v0

    .line 1386
    iget-boolean v1, v0, Ll/ۡ᩻֫;->mDeferStart:Z

    if-eqz v1, :cond_1

    .line 1387
    iget-boolean v1, p0, Ll/ۚۜ֫;->ۡ:Z

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    .line 1389
    iput-boolean p1, p0, Ll/ۚۜ֫;->ۖ:Z

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 1392
    iput-boolean v1, v0, Ll/ۡ᩻֫;->mDeferStart:Z

    .line 1393
    invoke-virtual {p1}, Ll/ۛۜ֫;->ۢ()V

    :cond_1
    return-void
.end method

.method public final ֫(Ll/ۡ᩻֫;Landroid/content/Intent;ILandroid/os/Bundle;)V
    .locals 1
    .param p2    # Landroid/content/Intent;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param

    .line 2817
    iget-object v0, p0, Ll/ۚۜ֫;->۟:Ll/ۢᩳ;

    if-eqz v0, :cond_1

    .line 2818
    new-instance v0, Ll/ۘۜ֫;

    iget-object p1, p1, Ll/ۡ᩻֫;->mWho:Ljava/lang/String;

    invoke-direct {v0, p1, p3}, Ll/ۘۜ֫;-><init>(Ljava/lang/String;I)V

    .line 2819
    iget-object p1, p0, Ll/ۚۜ֫;->᩵:Ljava/util/ArrayDeque;

    invoke-virtual {p1, v0}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    if-eqz p2, :cond_0

    if-eqz p4, :cond_0

    const-string p1, "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"

    .line 2821
    invoke-virtual {p2, p1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 2823
    :cond_0
    iget-object p1, p0, Ll/ۚۜ֫;->۟:Ll/ۢᩳ;

    .line 47
    invoke-virtual {p1, p2}, Ll/ۢᩳ;->֫(Ljava/lang/Object;)V

    return-void

    .line 2825
    :cond_1
    iget-object p1, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    invoke-virtual {p1, p2, p3, p4}, Ll/ۙ᩻֫;->֫(Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void
.end method

.method public final ֫(Ll/ۡ᩻֫;Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
    .locals 9
    .param p2    # Landroid/content/IntentSender;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param

    move-object v0, p0

    move-object/from16 v8, p8

    .line 2834
    iget-object v1, v0, Ll/ۚۜ֫;->֫֫:Ll/ۢᩳ;

    if-eqz v1, :cond_4

    const/4 v1, 0x2

    if-eqz v8, :cond_2

    if-nez p4, :cond_0

    .line 2837
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    const-string v3, "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE"

    const/4 v4, 0x1

    .line 2838
    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    goto :goto_0

    :cond_0
    move-object v2, p4

    .line 2840
    :goto_0
    invoke-static {v1}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 2841
    invoke-virtual/range {p8 .. p8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    invoke-static {p1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_1
    const-string v3, "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"

    .line 2844
    invoke-virtual {v2, v3, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    goto :goto_1

    :cond_2
    move-object v2, p4

    .line 2846
    :goto_1
    new-instance v3, Ll/ۚᩳ;

    move-object v4, p2

    invoke-direct {v3, p2}, Ll/ۚᩳ;-><init>(Landroid/content/IntentSender;)V

    .line 2847
    invoke-virtual {v3, v2}, Ll/ۚᩳ;->֫(Landroid/content/Intent;)V

    move v5, p5

    move v6, p6

    .line 2848
    invoke-virtual {v3, p6, p5}, Ll/ۚᩳ;->֫(II)V

    invoke-virtual {v3}, Ll/ۚᩳ;->֫()Ll/۠ᩳ;

    move-result-object v2

    .line 2849
    new-instance v3, Ll/ۘۜ֫;

    move-object v4, p1

    iget-object v5, v4, Ll/ۡ᩻֫;->mWho:Ljava/lang/String;

    move v7, p3

    invoke-direct {v3, v5, p3}, Ll/ۘۜ֫;-><init>(Ljava/lang/String;I)V

    .line 2850
    iget-object v5, v0, Ll/ۚۜ֫;->᩵:Ljava/util/ArrayDeque;

    invoke-virtual {v5, v3}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 2851
    invoke-static {v1}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 2852
    invoke-virtual {p1}, Ll/ۡ᩻֫;->toString()Ljava/lang/String;

    .line 2854
    :cond_3
    iget-object v1, v0, Ll/ۚۜ֫;->֫֫:Ll/ۢᩳ;

    .line 47
    invoke-virtual {v1, v2}, Ll/ۢᩳ;->֫(Ljava/lang/Object;)V

    return-void

    :cond_4
    move-object v4, p2

    move v7, p3

    move v5, p5

    move v6, p6

    .line 2856
    iget-object v1, v0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move/from16 v7, p7

    move-object/from16 v8, p8

    invoke-virtual/range {v1 .. v8}, Ll/ۙ᩻֫;->֫(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    return-void
.end method

.method public final ֫(Ll/ۡ᩻֫;Ll/ܰۢ֫;)V
    .locals 2

    .line 3186
    iget-object v0, p1, Ll/ۡ᩻֫;->mWho:Ljava/lang/String;

    .line 1605
    iget-object v1, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    invoke-virtual {v1, v0}, Ll/ۨۜ֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩻֫;

    move-result-object v0

    .line 3186
    invoke-virtual {p1, v0}, Ll/ۡ᩻֫;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Ll/ۡ᩻֫;->mHost:Ll/ۙ᩻֫;

    if-eqz v0, :cond_0

    iget-object v0, p1, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    if-ne v0, p0, :cond_1

    .line 3191
    :cond_0
    iput-object p2, p1, Ll/ۡ᩻֫;->mMaxState:Ll/ܰۢ֫;

    return-void

    .line 3188
    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Fragment "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not an active fragment of FragmentManager "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final ֫(Ll/ۡ᩻֫;Z)V
    .locals 1

    .line 1406
    invoke-direct {p0, p1}, Ll/ۚۜ֫;->ۘ(Ll/ۡ᩻֫;)Landroid/view/ViewGroup;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 1408
    instance-of v0, p1, Ll/᩸᩻֫;

    if-eqz v0, :cond_0

    .line 1409
    check-cast p1, Ll/᩸᩻֫;

    xor-int/lit8 p2, p2, 0x1

    invoke-virtual {p1, p2}, Ll/᩸᩻֫;->֫(Z)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۡ᩻֫;[Ljava/lang/String;I)V
    .locals 1

    .line 2864
    iget-object v0, p0, Ll/ۚۜ֫;->᩺:Ll/ۢᩳ;

    if-eqz v0, :cond_0

    .line 2865
    new-instance v0, Ll/ۘۜ֫;

    iget-object p1, p1, Ll/ۡ᩻֫;->mWho:Ljava/lang/String;

    invoke-direct {v0, p1, p3}, Ll/ۘۜ֫;-><init>(Ljava/lang/String;I)V

    .line 2866
    iget-object p1, p0, Ll/ۚۜ֫;->᩵:Ljava/util/ArrayDeque;

    invoke-virtual {p1, v0}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 2867
    iget-object p1, p0, Ll/ۚۜ֫;->᩺:Ll/ۢᩳ;

    .line 47
    invoke-virtual {p1, p2}, Ll/ۢᩳ;->֫(Ljava/lang/Object;)V

    return-void

    .line 2869
    :cond_0
    iget-object p1, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final ֫(Ll/ۨ᩸ۧ;)V
    .locals 1

    .line 903
    iget-object v0, p0, Ll/ۚۜ֫;->ۧ:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 904
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۚۜ֫;->ۧ:Ljava/util/ArrayList;

    .line 906
    :cond_0
    iget-object v0, p0, Ll/ۚۜ֫;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/ᩳܳ֫;Z)V
    .locals 1

    if-eqz p2, :cond_1

    .line 1721
    iget-object v0, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/ۚۜ֫;->᩷:Z

    if-eqz v0, :cond_1

    :cond_0
    return-void

    .line 1725
    :cond_1
    invoke-direct {p0, p2}, Ll/ۚۜ֫;->ܽ(Z)V

    .line 1726
    iget-object p2, p0, Ll/ۚۜ֫;->ܳ֫:Ljava/util/ArrayList;

    iget-object v0, p0, Ll/ۚۜ֫;->ܿ֫:Ljava/util/ArrayList;

    invoke-virtual {p1, p2, v0}, Ll/ᩳܳ֫;->֫(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    const/4 p1, 0x1

    .line 1727
    iput-boolean p1, p0, Ll/ۚۜ֫;->ۡ:Z

    .line 1729
    :try_start_0
    iget-object p1, p0, Ll/ۚۜ֫;->ܳ֫:Ljava/util/ArrayList;

    iget-object p2, p0, Ll/ۚۜ֫;->ܿ֫:Ljava/util/ArrayList;

    invoke-direct {p0, p1, p2}, Ll/ۚۜ֫;->֫(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1731
    invoke-direct {p0}, Ll/ۚۜ֫;->᩺()V

    .line 1735
    invoke-direct {p0}, Ll/ۚۜ֫;->֫֫()V

    .line 2080
    iget-boolean p1, p0, Ll/ۚۜ֫;->ۖ:Z

    iget-object p2, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    .line 2081
    iput-boolean p1, p0, Ll/ۚۜ֫;->ۖ:Z

    .line 1444
    invoke-virtual {p2}, Ll/ۨۜ֫;->ۧ()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛۜ֫;

    .line 1445
    invoke-virtual {p0, v0}, Ll/ۚۜ֫;->֫(Ll/ۛۜ֫;)V

    goto :goto_0

    .line 1737
    :cond_2
    invoke-virtual {p2}, Ll/ۨۜ֫;->֫()V

    return-void

    :catchall_0
    move-exception p1

    .line 1731
    invoke-direct {p0}, Ll/ۚۜ֫;->᩺()V

    .line 1732
    throw p1
.end method

.method public final ֫(Ll/᩵ۜ֫;Z)V
    .locals 2

    if-nez p2, :cond_3

    .line 1642
    iget-object v0, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    if-nez v0, :cond_1

    .line 1643
    iget-boolean p1, p0, Ll/ۚۜ֫;->᩷:Z

    if-eqz p1, :cond_0

    .line 1644
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "FragmentManager has been destroyed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1646
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "FragmentManager has not been attached to a host."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1609
    :cond_1
    invoke-virtual {p0}, Ll/ۚۜ֫;->۬()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    .line 1610
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Can not perform this action after onSaveInstanceState"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1652
    :cond_3
    :goto_0
    iget-object v0, p0, Ll/ۚۜ֫;->ۛ:Ljava/util/ArrayList;

    monitor-enter v0

    .line 1653
    :try_start_0
    iget-object v1, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    if-nez v1, :cond_5

    if-eqz p2, :cond_4

    .line 1656
    monitor-exit v0

    return-void

    .line 1658
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Activity has been destroyed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1660
    :cond_5
    iget-object p2, p0, Ll/ۚۜ֫;->ۛ:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1661
    invoke-virtual {p0}, Ll/ۚۜ֫;->ۨ()V

    .line 1662
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/᩸᩻֫;)V
    .locals 5

    .line 1096
    iget-object v0, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    invoke-virtual {v0}, Ll/ۨۜ֫;->ۧ()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛۜ֫;

    .line 1097
    invoke-virtual {v1}, Ll/ۛۜ֫;->᩷()Ll/ۡ᩻֫;

    move-result-object v2

    .line 1098
    iget v3, v2, Ll/ۡ᩻֫;->mContainerId:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    if-ne v3, v4, :cond_0

    iget-object v3, v2, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    if-eqz v3, :cond_0

    .line 1099
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    if-nez v3, :cond_0

    .line 1101
    iput-object p1, v2, Ll/ۡ᩻֫;->mContainer:Landroid/view/ViewGroup;

    .line 1102
    invoke-virtual {v1}, Ll/ۛۜ֫;->֫()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ֫(Z)V
    .locals 3

    if-eqz p1, :cond_1

    .line 3042
    iget-object v0, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    instance-of v0, v0, Ll/۬ۙ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 3043
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ll/ۚۜ֫;->֫(Ljava/lang/IllegalStateException;)V

    const/4 p1, 0x0

    throw p1

    .line 3047
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    invoke-virtual {v0}, Ll/ۨۜ֫;->ܿ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡ᩻֫;

    if-eqz v1, :cond_2

    .line 3049
    invoke-virtual {v1}, Ll/ۡ᩻֫;->performLowMemory()V

    if-eqz p1, :cond_2

    .line 3051
    iget-object v1, v1, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ll/ۚۜ֫;->֫(Z)V

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final ֫(ZLandroid/content/res/Configuration;)V
    .locals 3

    if-eqz p1, :cond_1

    .line 3026
    iget-object v0, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    instance-of v0, v0, Ll/ۗۙ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 3027
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ll/ۚۜ֫;->֫(Ljava/lang/IllegalStateException;)V

    const/4 p1, 0x0

    throw p1

    .line 3031
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    invoke-virtual {v0}, Ll/ۨۜ֫;->ܿ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡ᩻֫;

    if-eqz v1, :cond_2

    .line 3033
    invoke-virtual {v1, p2}, Ll/ۡ᩻֫;->performConfigurationChanged(Landroid/content/res/Configuration;)V

    if-eqz p1, :cond_2

    .line 3035
    iget-object v1, v1, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    const/4 v2, 0x1

    invoke-virtual {v1, v2, p2}, Ll/ۚۜ֫;->֫(ZLandroid/content/res/Configuration;)V

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final ֫(ZZ)V
    .locals 3

    if-eqz p2, :cond_1

    .line 2989
    iget-object v0, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    instance-of v0, v0, Ll/ۤ᩶;

    if-nez v0, :cond_0

    goto :goto_0

    .line 2990
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ll/ۚۜ֫;->֫(Ljava/lang/IllegalStateException;)V

    const/4 p1, 0x0

    throw p1

    .line 2994
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    invoke-virtual {v0}, Ll/ۨۜ֫;->ܿ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡ᩻֫;

    if-eqz v1, :cond_2

    .line 2996
    invoke-virtual {v1, p1}, Ll/ۡ᩻֫;->performMultiWindowModeChanged(Z)V

    if-eqz p2, :cond_2

    .line 2998
    iget-object v1, v1, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, Ll/ۚۜ֫;->֫(ZZ)V

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final ֫(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
    .locals 6

    .line 3059
    iget v0, p0, Ll/ۚۜ֫;->᩻:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    return v1

    .line 3064
    :cond_0
    iget-object v0, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    invoke-virtual {v0}, Ll/ۨۜ֫;->ܿ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۡ᩻֫;

    if-eqz v4, :cond_1

    .line 675
    invoke-virtual {v4}, Ll/ۡ᩻֫;->isMenuVisible()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 3066
    invoke-virtual {v4, p1, p2}, Ll/ۡ᩻֫;->performCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    move-result v5

    if-eqz v5, :cond_1

    if-nez v2, :cond_2

    .line 3069
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 3071
    :cond_2
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x1

    goto :goto_0

    .line 3076
    :cond_3
    iget-object p1, p0, Ll/ۚۜ֫;->ܳ:Ljava/util/ArrayList;

    if-eqz p1, :cond_6

    .line 3077
    :goto_1
    iget-object p1, p0, Ll/ۚۜ֫;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge v1, p1, :cond_6

    .line 3078
    iget-object p1, p0, Ll/ۚۜ֫;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۡ᩻֫;

    if-eqz v2, :cond_4

    .line 3079
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    .line 3080
    :cond_4
    invoke-virtual {p1}, Ll/ۡ᩻֫;->onDestroyOptionsMenu()V

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 3085
    :cond_6
    iput-object v2, p0, Ll/ۚۜ֫;->ܳ:Ljava/util/ArrayList;

    return v3
.end method

.method public final ֫(Landroid/view/MenuItem;)Z
    .locals 4

    .line 3120
    iget v0, p0, Ll/ۚۜ֫;->᩻:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    return v1

    .line 3123
    :cond_0
    iget-object v0, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    invoke-virtual {v0}, Ll/ۨۜ֫;->ܿ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۡ᩻֫;

    if-eqz v3, :cond_1

    .line 3125
    invoke-virtual {v3, p1}, Ll/ۡ᩻֫;->performContextItemSelected(Landroid/view/MenuItem;)Z

    move-result v3

    if-eqz v3, :cond_1

    return v2

    :cond_2
    return v1
.end method

.method public final ֫(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z
    .locals 5

    const/4 v0, 0x1

    and-int/2addr p4, v0

    const/4 v1, 0x0

    if-eqz p4, :cond_0

    const/4 p4, 0x1

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    .line 2295
    :goto_0
    iget-object v2, p0, Ll/ۚۜ֫;->֫:Ljava/util/ArrayList;

    const/4 v3, -0x1

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_4

    :cond_1
    if-gez p3, :cond_3

    if-eqz p4, :cond_2

    const/4 v3, 0x0

    goto :goto_4

    .line 2302
    :cond_2
    iget-object p3, p0, Ll/ۚۜ֫;->֫:Ljava/util/ArrayList;

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p3

    add-int/lit8 v3, p3, -0x1

    goto :goto_4

    .line 2307
    :cond_3
    iget-object v2, p0, Ll/ۚۜ֫;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v0

    :goto_1
    if-ltz v2, :cond_5

    .line 2309
    iget-object v4, p0, Ll/ۚۜ֫;->֫:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ᩳܳ֫;

    if-ltz p3, :cond_4

    .line 2313
    iget v4, v4, Ll/ᩳܳ֫;->ۚ:I

    if-ne p3, v4, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    :cond_5
    :goto_2
    if-gez v2, :cond_6

    move v3, v2

    goto :goto_4

    :cond_6
    if-eqz p4, :cond_7

    move v3, v2

    :goto_3
    if-lez v3, :cond_9

    .line 2324
    iget-object p4, p0, Ll/ۚۜ֫;->֫:Ljava/util/ArrayList;

    add-int/lit8 v2, v3, -0x1

    invoke-virtual {p4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ll/ᩳܳ֫;

    if-ltz p3, :cond_9

    .line 2325
    iget p4, p4, Ll/ᩳܳ֫;->ۚ:I

    if-ne p3, p4, :cond_9

    add-int/lit8 v3, v3, -0x1

    goto :goto_3

    .line 2332
    :cond_7
    iget-object p3, p0, Ll/ۚۜ֫;->֫:Ljava/util/ArrayList;

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p3

    sub-int/2addr p3, v0

    if-ne v2, p3, :cond_8

    goto :goto_4

    :cond_8
    add-int/lit8 v3, v2, 0x1

    :cond_9
    :goto_4
    if-gez v3, :cond_a

    return v1

    .line 2271
    :cond_a
    iget-object p3, p0, Ll/ۚۜ֫;->֫:Ljava/util/ArrayList;

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p3

    sub-int/2addr p3, v0

    :goto_5
    if-lt p3, v3, :cond_b

    .line 2272
    iget-object p4, p0, Ll/ۚۜ֫;->֫:Ljava/util/ArrayList;

    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ll/ᩳܳ֫;

    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2273
    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p3, p3, -0x1

    goto :goto_5

    :cond_b
    return v0
.end method

.method public final ۖ()V
    .locals 2

    const/4 v0, 0x1

    .line 2917
    iput-boolean v0, p0, Ll/ۚۜ֫;->ܽ֫:Z

    .line 2918
    iget-object v1, p0, Ll/ۚۜ֫;->ܶ:Ll/᩹ۜ֫;

    invoke-virtual {v1, v0}, Ll/᩹ۜ֫;->֫(Z)V

    const/4 v0, 0x4

    .line 2919
    invoke-direct {p0, v0}, Ll/ۚۜ֫;->ᩳ(I)V

    return-void
.end method

.method public final ۗ()Z
    .locals 1

    .line 1262
    iget-boolean v0, p0, Ll/ۚۜ֫;->᩷:Z

    return v0
.end method

.method public final ۘ()V
    .locals 1

    const/4 v0, 0x2

    .line 2888
    invoke-direct {p0, v0}, Ll/ۚۜ֫;->ᩳ(I)V

    return-void
.end method

.method public final ۙ()V
    .locals 1

    const/4 v0, 0x1

    .line 696
    invoke-virtual {p0, v0}, Ll/ۚۜ֫;->ۧ(Z)Z

    .line 697
    iget-object v0, p0, Ll/ۚۜ֫;->᩹:Ll/֡ܽ;

    invoke-virtual {v0}, Ll/֡ܽ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 699
    invoke-virtual {p0}, Ll/ۚۜ֫;->ۤ()Z

    return-void

    .line 707
    :cond_0
    iget-object v0, p0, Ll/ۚۜ֫;->᩶:Ll/ۨܽ;

    invoke-virtual {v0}, Ll/ۨܽ;->֫()V

    return-void
.end method

.method public final ۚ()Ll/᩶᩻֫;
    .locals 1

    .line 3222
    iget-object v0, p0, Ll/ۚۜ֫;->ۤ:Ll/ۡ᩻֫;

    if-eqz v0, :cond_0

    .line 3227
    iget-object v0, v0, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v0}, Ll/ۚۜ֫;->ۚ()Ll/᩶᩻֫;

    move-result-object v0

    return-object v0

    .line 3229
    :cond_0
    iget-object v0, p0, Ll/ۚۜ֫;->ᩴ:Ll/᩶᩻֫;

    return-object v0
.end method

.method public final ۛ()Landroid/os/Bundle;
    .locals 10

    .line 2369
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 2016
    invoke-direct {p0}, Ll/ۚۜ֫;->ܰ()Ljava/util/HashSet;

    move-result-object v1

    .line 2017
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۗ᩷֫;

    .line 253
    iget-boolean v5, v2, Ll/ۗ᩷֫;->ۧ:Z

    if-eqz v5, :cond_0

    .line 254
    invoke-static {v4}, Ll/ۚۜ֫;->ܿ(I)Z

    .line 259
    iput-boolean v3, v2, Ll/ۗ᩷֫;->ۧ:Z

    .line 260
    invoke-virtual {v2}, Ll/ۗ᩷֫;->֫()V

    goto :goto_0

    .line 2027
    :cond_1
    invoke-direct {p0}, Ll/ۚۜ֫;->ܰ()Ljava/util/HashSet;

    move-result-object v1

    .line 2028
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۗ᩷֫;

    .line 2029
    invoke-virtual {v2}, Ll/ۗ᩷֫;->ۧ()V

    goto :goto_1

    :cond_2
    const/4 v1, 0x1

    .line 2374
    invoke-virtual {p0, v1}, Ll/ۚۜ֫;->ۧ(Z)Z

    .line 2376
    iput-boolean v1, p0, Ll/ۚۜ֫;->ۧ֫:Z

    .line 2377
    iget-object v2, p0, Ll/ۚۜ֫;->ܶ:Ll/᩹ۜ֫;

    invoke-virtual {v2, v1}, Ll/᩹ۜ֫;->֫(Z)V

    .line 2380
    iget-object v1, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    invoke-virtual {v1}, Ll/ۨۜ֫;->᩷()Ljava/util/ArrayList;

    move-result-object v2

    .line 2383
    invoke-virtual {v1}, Ll/ۨۜ֫;->ᩳ()Ljava/util/ArrayList;

    move-result-object v5

    .line 2384
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_3

    .line 2385
    invoke-static {v4}, Ll/ۚۜ֫;->ܿ(I)Z

    return-object v0

    .line 2390
    :cond_3
    invoke-virtual {v1}, Ll/ۨۜ֫;->ۢ()Ljava/util/ArrayList;

    move-result-object v1

    .line 2394
    iget-object v6, p0, Ll/ۚۜ֫;->֫:Ljava/util/ArrayList;

    if-eqz v6, :cond_5

    .line 2395
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-lez v6, :cond_5

    .line 2397
    new-array v7, v6, [Ll/ܳܳ֫;

    :goto_2
    if-ge v3, v6, :cond_6

    .line 2399
    new-instance v8, Ll/ܳܳ֫;

    iget-object v9, p0, Ll/ۚۜ֫;->֫:Ljava/util/ArrayList;

    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ᩳܳ֫;

    invoke-direct {v8, v9}, Ll/ܳܳ֫;-><init>(Ll/ᩳܳ֫;)V

    aput-object v8, v7, v3

    .line 2400
    invoke-static {v4}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v8

    if-eqz v8, :cond_4

    .line 2401
    iget-object v8, p0, Ll/ۚۜ֫;->֫:Ljava/util/ArrayList;

    .line 2402
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_5
    const/4 v7, 0x0

    .line 2408
    :cond_6
    new-instance v3, Ll/ܶۜ֫;

    invoke-direct {v3}, Ll/ܶۜ֫;-><init>()V

    .line 2409
    iput-object v2, v3, Ll/ܶۜ֫;->᩸:Ljava/util/ArrayList;

    .line 2410
    iput-object v1, v3, Ll/ܶۜ֫;->᩹:Ljava/util/ArrayList;

    .line 2411
    iput-object v7, v3, Ll/ܶۜ֫;->᩶:[Ll/ܳܳ֫;

    .line 2412
    iget-object v1, p0, Ll/ۚۜ֫;->ܽ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    iput v1, v3, Ll/ܶۜ֫;->ۙ:I

    .line 2413
    iget-object v1, p0, Ll/ۚۜ֫;->ۨ:Ll/ۡ᩻֫;

    if-eqz v1, :cond_7

    .line 2414
    iget-object v1, v1, Ll/ۡ᩻֫;->mWho:Ljava/lang/String;

    iput-object v1, v3, Ll/ܶۜ֫;->ۤ:Ljava/lang/String;

    .line 2416
    :cond_7
    iget-object v1, v3, Ll/ܶۜ֫;->ۗ:Ljava/util/ArrayList;

    iget-object v2, p0, Ll/ۚۜ֫;->ᩳ:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 2417
    iget-object v1, v3, Ll/ܶۜ֫;->۬:Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 2418
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Ll/ۚۜ֫;->᩵:Ljava/util/ArrayDeque;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v1, v3, Ll/ܶۜ֫;->۫:Ljava/util/ArrayList;

    const-string v1, "state"

    .line 2419
    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 2421
    iget-object v2, p0, Ll/ۚۜ֫;->ܰ:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v6, "result_"

    .line 0
    invoke-static {v6, v4}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 2422
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/os/Bundle;

    invoke-virtual {v0, v6, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_3

    .line 2425
    :cond_8
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۬ۜ֫;

    .line 2426
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 2427
    invoke-virtual {v4, v1, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 2428
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "fragment_"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v3, Ll/۬ۜ֫;->۟:Ljava/lang/String;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_4

    :cond_9
    return-object v0
.end method

.method public final ۜ()V
    .locals 3

    .line 3329
    iget-object v0, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    invoke-virtual {v0}, Ll/ۨۜ֫;->ܽ()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡ᩻֫;

    if-eqz v1, :cond_0

    .line 3331
    invoke-virtual {v1}, Ll/ۡ᩻֫;->isHidden()Z

    move-result v2

    invoke-virtual {v1, v2}, Ll/ۡ᩻֫;->onHiddenChanged(Z)V

    .line 3332
    iget-object v1, v1, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v1}, Ll/ۚۜ֫;->ۜ()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ۜ(Ll/ۡ᩻֫;)V
    .locals 2

    const/4 v0, 0x2

    .line 1514
    invoke-static {v0}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 1515
    :cond_0
    iget-boolean v0, p1, Ll/ۡ᩻֫;->mHidden:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 1516
    iput-boolean v0, p1, Ll/ۡ᩻֫;->mHidden:Z

    .line 1519
    iget-boolean v1, p1, Ll/ۡ᩻֫;->mHiddenChanged:Z

    xor-int/2addr v0, v1

    iput-boolean v0, p1, Ll/ۡ᩻֫;->mHiddenChanged:Z

    .line 1520
    invoke-direct {p0, p1}, Ll/ۚۜ֫;->֡(Ll/ۡ᩻֫;)V

    :cond_1
    return-void
.end method

.method public final ۠()Ll/ۙ᩻֫;
    .locals 1

    .line 2585
    iget-object v0, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    return-object v0
.end method

.method public final ۡ()V
    .locals 2

    const/4 v0, 0x0

    .line 2906
    iput-boolean v0, p0, Ll/ۚۜ֫;->ۧ֫:Z

    .line 2907
    iput-boolean v0, p0, Ll/ۚۜ֫;->ܽ֫:Z

    .line 2908
    iget-object v1, p0, Ll/ۚۜ֫;->ܶ:Ll/᩹ۜ֫;

    invoke-virtual {v1, v0}, Ll/᩹ۜ֫;->֫(Z)V

    const/4 v0, 0x7

    .line 2909
    invoke-direct {p0, v0}, Ll/ۚۜ֫;->ᩳ(I)V

    return-void
.end method

.method public final ۡ(Ll/ۡ᩻֫;)V
    .locals 1

    .line 1182
    iget-object v0, p0, Ll/ۚۜ֫;->ܶ:Ll/᩹ۜ֫;

    invoke-virtual {v0, p1}, Ll/᩹ۜ֫;->ܿ(Ll/ۡ᩻֫;)V

    return-void
.end method

.method public final ۢ()V
    .locals 1

    .line 3163
    invoke-direct {p0}, Ll/ۚۜ֫;->֫֫()V

    .line 3165
    iget-object v0, p0, Ll/ۚۜ֫;->ۨ:Ll/ۡ᩻֫;

    invoke-direct {p0, v0}, Ll/ۚۜ֫;->ۖ(Ll/ۡ᩻֫;)V

    return-void
.end method

.method public final ۢ(Ll/ۡ᩻֫;)V
    .locals 2

    const/4 v0, 0x2

    .line 1494
    invoke-static {v0}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1495
    invoke-static {p1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 1497
    :cond_0
    invoke-virtual {p1}, Ll/ۡ᩻֫;->isInBackStack()Z

    move-result v0

    .line 1498
    iget-boolean v1, p1, Ll/ۡ᩻֫;->mDetached:Z

    if-eqz v1, :cond_2

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    return-void

    .line 1499
    :cond_2
    :goto_0
    iget-object v0, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    invoke-virtual {v0, p1}, Ll/ۨۜ֫;->ܽ(Ll/ۡ᩻֫;)V

    .line 1500
    invoke-static {p1}, Ll/ۚۜ֫;->ᩴ(Ll/ۡ᩻֫;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    .line 1501
    iput-boolean v1, p0, Ll/ۚۜ֫;->۠:Z

    .line 1503
    :cond_3
    iput-boolean v1, p1, Ll/ۡ᩻֫;->mRemoving:Z

    .line 1504
    invoke-direct {p0, p1}, Ll/ۚۜ֫;->֡(Ll/ۡ᩻֫;)V

    return-void
.end method

.method public final ۤ()Z
    .locals 2

    const/4 v0, -0x1

    const/4 v1, 0x0

    .line 778
    invoke-direct {p0, v0, v1}, Ll/ۚۜ֫;->֫(II)Z

    move-result v0

    return v0
.end method

.method public final ۧ(Ljava/lang/String;)Ll/ۡ᩻֫;
    .locals 1

    .line 1596
    iget-object v0, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    invoke-virtual {v0, p1}, Ll/ۨۜ֫;->ܽ(Ljava/lang/String;)Ll/ۡ᩻֫;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ()Ll/ܽ᩷֫;
    .locals 1

    .line 598
    new-instance v0, Ll/ᩳܳ֫;

    invoke-direct {v0, p0}, Ll/ᩳܳ֫;-><init>(Ll/ۚۜ֫;)V

    return-object v0
.end method

.method public final ۧ(I)V
    .locals 1

    const/4 v0, 0x0

    .line 823
    invoke-virtual {p0, p1, v0}, Ll/ۚۜ֫;->ۧ(IZ)V

    return-void
.end method

.method public final ۧ(IZ)V
    .locals 1

    if-ltz p1, :cond_0

    .line 830
    new-instance v0, Ll/֡ۜ֫;

    invoke-direct {v0, p0, p1}, Ll/֡ۜ֫;-><init>(Ll/ۚۜ֫;I)V

    invoke-virtual {p0, v0, p2}, Ll/ۚۜ֫;->֫(Ll/᩵ۜ֫;Z)V

    return-void

    .line 828
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "Bad id: "

    .line 0
    invoke-static {p1, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 828
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final ۧ(Ll/ۡ᩻֫;)V
    .locals 1

    .line 1178
    iget-object v0, p0, Ll/ۚۜ֫;->ܶ:Ll/᩹ۜ֫;

    invoke-virtual {v0, p1}, Ll/᩹ۜ֫;->֫(Ll/ۡ᩻֫;)V

    return-void
.end method

.method public final ۧ(ZZ)V
    .locals 3

    if-eqz p2, :cond_1

    .line 3007
    iget-object v0, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    instance-of v0, v0, Ll/ۛ᩶;

    if-nez v0, :cond_0

    goto :goto_0

    .line 3008
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ll/ۚۜ֫;->֫(Ljava/lang/IllegalStateException;)V

    const/4 p1, 0x0

    throw p1

    .line 3013
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    invoke-virtual {v0}, Ll/ۨۜ֫;->ܿ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡ᩻֫;

    if-eqz v1, :cond_2

    .line 3015
    invoke-virtual {v1, p1}, Ll/ۡ᩻֫;->performPictureInPictureModeChanged(Z)V

    if-eqz p2, :cond_2

    .line 3017
    iget-object v1, v1, Ll/ۡ᩻֫;->mChildFragmentManager:Ll/ۚۜ֫;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, Ll/ۚۜ֫;->ۧ(ZZ)V

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final ۧ(Landroid/view/Menu;)Z
    .locals 4

    .line 3091
    iget v0, p0, Ll/ۚۜ֫;->᩻:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    return v1

    .line 3095
    :cond_0
    iget-object v0, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    invoke-virtual {v0}, Ll/ۨۜ֫;->ܿ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۡ᩻֫;

    if-eqz v2, :cond_1

    .line 675
    invoke-virtual {v2}, Ll/ۡ᩻֫;->isMenuVisible()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 3097
    invoke-virtual {v2, p1}, Ll/ۡ᩻֫;->performPrepareOptionsMenu(Landroid/view/Menu;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public final ۧ(Landroid/view/MenuItem;)Z
    .locals 4

    .line 3106
    iget v0, p0, Ll/ۚۜ֫;->᩻:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    return v1

    .line 3109
    :cond_0
    iget-object v0, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    invoke-virtual {v0}, Ll/ۨۜ֫;->ܿ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۡ᩻֫;

    if-eqz v3, :cond_1

    .line 3111
    invoke-virtual {v3, p1}, Ll/ۡ᩻֫;->performOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v3

    if-eqz v3, :cond_1

    return v2

    :cond_2
    return v1
.end method

.method public final ۧ(Z)Z
    .locals 8

    .line 1754
    invoke-direct {p0, p1}, Ll/ۚۜ֫;->ܽ(Z)V

    const/4 p1, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1757
    :goto_0
    iget-object v2, p0, Ll/ۚۜ֫;->ܳ֫:Ljava/util/ArrayList;

    iget-object v3, p0, Ll/ۚۜ֫;->ܿ֫:Ljava/util/ArrayList;

    .line 2059
    iget-object v0, p0, Ll/ۚۜ֫;->ۛ:Ljava/util/ArrayList;

    monitor-enter v0

    .line 2060
    :try_start_0
    iget-object v4, p0, Ll/ۚۜ֫;->ۛ:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 2061
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/4 v0, 0x0

    goto :goto_2

    .line 2065
    :cond_0
    :try_start_1
    iget-object v4, p0, Ll/ۚۜ֫;->ۛ:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_1
    if-ge v5, v4, :cond_1

    .line 2067
    iget-object v7, p0, Ll/ۚۜ֫;->ۛ:Ljava/util/ArrayList;

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩵ۜ֫;

    invoke-interface {v7, v2, v3}, Ll/᩵ۜ֫;->֫(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    move-result v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    or-int/2addr v6, v7

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 2072
    :cond_1
    :try_start_2
    iget-object v2, p0, Ll/ۚۜ֫;->ۛ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 2073
    iget-object v2, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    invoke-virtual {v2}, Ll/ۙ᩻֫;->ܿ()Landroid/os/Handler;

    move-result-object v2

    iget-object v3, p0, Ll/ۚۜ֫;->ۢ:Ljava/lang/Runnable;

    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 2075
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move v0, v6

    :goto_2
    if-eqz v0, :cond_2

    const/4 v1, 0x1

    .line 1758
    iput-boolean v1, p0, Ll/ۚۜ֫;->ۡ:Z

    .line 1760
    :try_start_3
    iget-object v0, p0, Ll/ۚۜ֫;->ܳ֫:Ljava/util/ArrayList;

    iget-object v2, p0, Ll/ۚۜ֫;->ܿ֫:Ljava/util/ArrayList;

    invoke-direct {p0, v0, v2}, Ll/ۚۜ֫;->֫(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1762
    invoke-direct {p0}, Ll/ۚۜ֫;->᩺()V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-direct {p0}, Ll/ۚۜ֫;->᩺()V

    .line 1763
    throw p1

    .line 1767
    :cond_2
    invoke-direct {p0}, Ll/ۚۜ֫;->֫֫()V

    .line 2080
    iget-boolean v0, p0, Ll/ۚۜ֫;->ۖ:Z

    if-eqz v0, :cond_3

    .line 2081
    iput-boolean p1, p0, Ll/ۚۜ֫;->ۖ:Z

    .line 1444
    iget-object p1, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    invoke-virtual {p1}, Ll/ۨۜ֫;->ۧ()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛۜ֫;

    .line 1445
    invoke-virtual {p0, v0}, Ll/ۚۜ֫;->֫(Ll/ۛۜ֫;)V

    goto :goto_3

    .line 1769
    :cond_3
    iget-object p1, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    invoke-virtual {p1}, Ll/ۨۜ֫;->֫()V

    return v1

    :catchall_1
    move-exception p1

    .line 2072
    :try_start_4
    iget-object v1, p0, Ll/ۚۜ֫;->ۛ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 2073
    iget-object v1, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    invoke-virtual {v1}, Ll/ۙ᩻֫;->ܿ()Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Ll/ۚۜ֫;->ۢ:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 2074
    throw p1

    :catchall_2
    move-exception p1

    .line 2075
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw p1
.end method

.method public final ۨ()V
    .locals 3

    .line 1673
    iget-object v0, p0, Ll/ۚۜ֫;->ۛ:Ljava/util/ArrayList;

    monitor-enter v0

    .line 1674
    :try_start_0
    iget-object v1, p0, Ll/ۚۜ֫;->ۛ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 1676
    iget-object v1, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    invoke-virtual {v1}, Ll/ۙ᩻֫;->ܿ()Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Ll/ۚۜ֫;->ۢ:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1677
    iget-object v1, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    invoke-virtual {v1}, Ll/ۙ᩻֫;->ܿ()Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Ll/ۚۜ֫;->ۢ:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1678
    invoke-direct {p0}, Ll/ۚۜ֫;->֫֫()V

    .line 1680
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ۫()V
    .locals 2

    .line 2801
    iget-object v0, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 2804
    iput-boolean v0, p0, Ll/ۚۜ֫;->ۧ֫:Z

    .line 2805
    iput-boolean v0, p0, Ll/ۚۜ֫;->ܽ֫:Z

    .line 2806
    iget-object v1, p0, Ll/ۚۜ֫;->ܶ:Ll/᩹ۜ֫;

    invoke-virtual {v1, v0}, Ll/᩹ۜ֫;->֫(Z)V

    .line 2807
    iget-object v0, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    invoke-virtual {v0}, Ll/ۨۜ֫;->ܿ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡ᩻֫;

    if-eqz v1, :cond_1

    .line 2809
    invoke-virtual {v1}, Ll/ۡ᩻֫;->noteStateNotSaved()V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final ۬()Z
    .locals 1

    .line 1630
    iget-boolean v0, p0, Ll/ۚۜ֫;->ۧ֫:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/ۚۜ֫;->ܽ֫:Z

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

.method public final ܳ()V
    .locals 5

    const/4 v0, 0x1

    .line 2927
    iput-boolean v0, p0, Ll/ۚۜ֫;->᩷:Z

    .line 2928
    invoke-virtual {p0, v0}, Ll/ۚۜ֫;->ۧ(Z)Z

    .line 2027
    invoke-direct {p0}, Ll/ۚۜ֫;->ܰ()Ljava/util/HashSet;

    move-result-object v1

    .line 2028
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۗ᩷֫;

    .line 2029
    invoke-virtual {v2}, Ll/ۗ᩷֫;->ۧ()V

    goto :goto_0

    .line 1240
    :cond_0
    iget-object v1, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    instance-of v2, v1, Ll/۬ܺ֫;

    iget-object v3, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    if-eqz v2, :cond_1

    .line 1241
    invoke-virtual {v3}, Ll/ۨۜ֫;->ܳ()Ll/᩹ۜ֫;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩹ۜ֫;->ܿ()Z

    move-result v0

    goto :goto_1

    .line 1242
    :cond_1
    invoke-virtual {v1}, Ll/ۙ᩻֫;->ᩳ()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Ll/۫ۤ᩷;->֫(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1243
    iget-object v1, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    invoke-virtual {v1}, Ll/ۙ᩻֫;->ᩳ()Landroid/content/Context;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    .line 1244
    invoke-virtual {v1}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result v1

    xor-int/2addr v0, v1

    :cond_2
    :goto_1
    if-eqz v0, :cond_4

    .line 1249
    iget-object v0, p0, Ll/ۚۜ֫;->ᩳ:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۜܳ֫;

    .line 1250
    iget-object v1, v1, Ll/ۜܳ֫;->᩸:Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 1251
    invoke-virtual {v3}, Ll/ۨۜ֫;->ܳ()Ll/᩹ۜ֫;

    move-result-object v4

    invoke-virtual {v4, v2}, Ll/᩹ۜ֫;->֫(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    const/4 v0, -0x1

    .line 2931
    invoke-direct {p0, v0}, Ll/ۚۜ֫;->ᩳ(I)V

    .line 2932
    iget-object v0, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    instance-of v1, v0, Ll/۬ۙ;

    if-eqz v1, :cond_5

    .line 2933
    check-cast v0, Ll/۬ۙ;

    .line 2934
    iget-object v1, p0, Ll/ۚۜ֫;->۫:Ll/ۨ᩻֫;

    invoke-interface {v0, v1}, Ll/۬ۙ;->ܽ(Ll/۬ۤ;)V

    .line 2936
    :cond_5
    iget-object v0, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    instance-of v1, v0, Ll/ۗۙ;

    if-eqz v1, :cond_6

    .line 2937
    check-cast v0, Ll/ۗۙ;

    .line 2939
    iget-object v1, p0, Ll/ۚۜ֫;->ۙ:Ll/ۛ᩻֫;

    invoke-interface {v0, v1}, Ll/ۗۙ;->ۜ(Ll/۬ۤ;)V

    .line 2942
    :cond_6
    iget-object v0, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    instance-of v1, v0, Ll/ۤ᩶;

    if-eqz v1, :cond_7

    .line 2943
    check-cast v0, Ll/ۤ᩶;

    .line 2945
    iget-object v1, p0, Ll/ۚۜ֫;->ۗ:Ll/᩺᩻֫;

    invoke-interface {v0, v1}, Ll/ۤ᩶;->ܳ(Ll/۬ۤ;)V

    .line 2948
    :cond_7
    iget-object v0, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    instance-of v1, v0, Ll/ۛ᩶;

    if-eqz v1, :cond_8

    .line 2949
    check-cast v0, Ll/ۛ᩶;

    .line 2951
    iget-object v1, p0, Ll/ۚۜ֫;->۬:Ll/ܰ᩻֫;

    invoke-interface {v0, v1}, Ll/ۛ᩶;->ۧ(Ll/۬ۤ;)V

    .line 2954
    :cond_8
    iget-object v0, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    instance-of v1, v0, Ll/᩶ۛ;

    if-eqz v1, :cond_9

    .line 2955
    check-cast v0, Ll/᩶ۛ;

    iget-object v1, p0, Ll/ۚۜ֫;->֨:Ll/ۨۛ;

    invoke-interface {v0, v1}, Ll/᩶ۛ;->removeMenuProvider(Ll/ۨۛ;)V

    :cond_9
    const/4 v0, 0x0

    .line 2957
    iput-object v0, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    .line 2958
    iput-object v0, p0, Ll/ۚۜ֫;->ܿ:Ll/ܶ᩻֫;

    .line 2959
    iput-object v0, p0, Ll/ۚۜ֫;->ۤ:Ll/ۡ᩻֫;

    .line 2960
    iget-object v1, p0, Ll/ۚۜ֫;->᩶:Ll/ۨܽ;

    if-eqz v1, :cond_a

    .line 2963
    iget-object v1, p0, Ll/ۚۜ֫;->᩹:Ll/֡ܽ;

    invoke-virtual {v1}, Ll/֡ܽ;->ᩳ()V

    .line 2964
    iput-object v0, p0, Ll/ۚۜ֫;->᩶:Ll/ۨܽ;

    .line 2966
    :cond_a
    iget-object v0, p0, Ll/ۚۜ֫;->۟:Ll/ۢᩳ;

    if-eqz v0, :cond_b

    .line 2967
    invoke-virtual {v0}, Ll/ۢᩳ;->֫()V

    .line 2968
    iget-object v0, p0, Ll/ۚۜ֫;->֫֫:Ll/ۢᩳ;

    invoke-virtual {v0}, Ll/ۢᩳ;->֫()V

    .line 2969
    iget-object v0, p0, Ll/ۚۜ֫;->᩺:Ll/ۢᩳ;

    invoke-virtual {v0}, Ll/ۢᩳ;->֫()V

    :cond_b
    return-void
.end method

.method public final ܳ(Ll/ۡ᩻֫;)V
    .locals 2

    .line 3312
    iget-object v0, p0, Ll/ۚۜ֫;->᩸:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩶ۜ֫;

    .line 3313
    invoke-interface {v1, p1}, Ll/᩶ۜ֫;->֫(Ll/ۡ᩻֫;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ܶ()Landroid/view/LayoutInflater$Factory2;
    .locals 1

    .line 3395
    iget-object v0, p0, Ll/ۚۜ֫;->֡:Ll/۬᩻֫;

    return-object v0
.end method

.method public final ܺ()V
    .locals 2

    const/4 v0, 0x0

    .line 2899
    iput-boolean v0, p0, Ll/ۚۜ֫;->ۧ֫:Z

    .line 2900
    iput-boolean v0, p0, Ll/ۚۜ֫;->ܽ֫:Z

    .line 2901
    iget-object v1, p0, Ll/ۚۜ֫;->ܶ:Ll/᩹ۜ֫;

    invoke-virtual {v1, v0}, Ll/᩹ۜ֫;->֫(Z)V

    const/4 v0, 0x5

    .line 2902
    invoke-direct {p0, v0}, Ll/ۚۜ֫;->ᩳ(I)V

    return-void
.end method

.method public final ܺ(Ll/ۡ᩻֫;)V
    .locals 3

    if-eqz p1, :cond_1

    .line 3145
    iget-object v0, p1, Ll/ۡ᩻֫;->mWho:Ljava/lang/String;

    .line 1605
    iget-object v1, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    invoke-virtual {v1, v0}, Ll/ۨۜ֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩻֫;

    move-result-object v0

    .line 3145
    invoke-virtual {p1, v0}, Ll/ۡ᩻֫;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Ll/ۡ᩻֫;->mHost:Ll/ۙ᩻֫;

    if-eqz v0, :cond_1

    iget-object v0, p1, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    if-ne v0, p0, :cond_0

    goto :goto_0

    .line 3147
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not an active fragment of FragmentManager "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3150
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ۚۜ֫;->ۨ:Ll/ۡ᩻֫;

    .line 3151
    iput-object p1, p0, Ll/ۚۜ֫;->ۨ:Ll/ۡ᩻֫;

    .line 3152
    invoke-direct {p0, v0}, Ll/ۚۜ֫;->ۖ(Ll/ۡ᩻֫;)V

    .line 3153
    iget-object p1, p0, Ll/ۚۜ֫;->ۨ:Ll/ۡ᩻֫;

    invoke-direct {p0, p1}, Ll/ۚۜ֫;->ۖ(Ll/ۡ᩻֫;)V

    return-void
.end method

.method public final ܽ(Ljava/lang/String;)Ll/ۡ᩻֫;
    .locals 1

    .line 1600
    iget-object v0, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    invoke-virtual {v0, p1}, Ll/ۨۜ֫;->ᩳ(Ljava/lang/String;)Ll/ۡ᩻֫;

    move-result-object p1

    return-object p1
.end method

.method public final ܽ()V
    .locals 2

    const/4 v0, 0x0

    .line 2892
    iput-boolean v0, p0, Ll/ۚۜ֫;->ۧ֫:Z

    .line 2893
    iput-boolean v0, p0, Ll/ۚۜ֫;->ܽ֫:Z

    .line 2894
    iget-object v1, p0, Ll/ۚۜ֫;->ܶ:Ll/᩹ۜ֫;

    invoke-virtual {v1, v0}, Ll/᩹ۜ֫;->֫(Z)V

    const/4 v0, 0x4

    .line 2895
    invoke-direct {p0, v0}, Ll/ۚۜ֫;->ᩳ(I)V

    return-void
.end method

.method public final ܽ(I)V
    .locals 2

    if-ltz p1, :cond_0

    const/4 v0, 0x1

    .line 843
    invoke-direct {p0, p1, v0}, Ll/ۚۜ֫;->֫(II)Z

    return-void

    .line 841
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Bad id: "

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 841
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܽ(Ll/ۡ᩻֫;)V
    .locals 2

    const/4 v0, 0x2

    .line 1556
    invoke-static {v0}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 1557
    :cond_0
    iget-boolean v1, p1, Ll/ۡ᩻֫;->mDetached:Z

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    .line 1558
    iput-boolean v1, p1, Ll/ۡ᩻֫;->mDetached:Z

    .line 1559
    iget-boolean v1, p1, Ll/ۡ᩻֫;->mAdded:Z

    if-nez v1, :cond_2

    .line 1560
    iget-object v1, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    invoke-virtual {v1, p1}, Ll/ۨۜ֫;->֫(Ll/ۡ᩻֫;)V

    .line 1561
    invoke-static {v0}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ll/ۡ᩻֫;->toString()Ljava/lang/String;

    .line 1562
    :cond_1
    invoke-static {p1}, Ll/ۚۜ֫;->ᩴ(Ll/ۡ᩻֫;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    .line 1563
    iput-boolean p1, p0, Ll/ۚۜ֫;->۠:Z

    :cond_2
    return-void
.end method

.method public final ܿ()V
    .locals 2

    const/4 v0, 0x0

    .line 2881
    iput-boolean v0, p0, Ll/ۚۜ֫;->ۧ֫:Z

    .line 2882
    iput-boolean v0, p0, Ll/ۚۜ֫;->ܽ֫:Z

    .line 2883
    iget-object v1, p0, Ll/ۚۜ֫;->ܶ:Ll/᩹ۜ֫;

    invoke-virtual {v1, v0}, Ll/᩹ۜ֫;->֫(Z)V

    const/4 v0, 0x1

    .line 2884
    invoke-direct {p0, v0}, Ll/ۚۜ֫;->ᩳ(I)V

    return-void
.end method

.method public final ܿ(Ll/ۡ᩻֫;)V
    .locals 3

    const/4 v0, 0x2

    .line 1540
    invoke-static {v0}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 1541
    :cond_0
    iget-boolean v1, p1, Ll/ۡ᩻֫;->mDetached:Z

    if-nez v1, :cond_3

    const/4 v1, 0x1

    .line 1542
    iput-boolean v1, p1, Ll/ۡ᩻֫;->mDetached:Z

    .line 1543
    iget-boolean v2, p1, Ll/ۡ᩻֫;->mAdded:Z

    if-eqz v2, :cond_3

    .line 1545
    invoke-static {v0}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ll/ۡ᩻֫;->toString()Ljava/lang/String;

    .line 1546
    :cond_1
    iget-object v0, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    invoke-virtual {v0, p1}, Ll/ۨۜ֫;->ܽ(Ll/ۡ᩻֫;)V

    .line 1547
    invoke-static {p1}, Ll/ۚۜ֫;->ᩴ(Ll/ۡ᩻֫;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1548
    iput-boolean v1, p0, Ll/ۚۜ֫;->۠:Z

    .line 1550
    :cond_2
    invoke-direct {p0, p1}, Ll/ۚۜ֫;->֡(Ll/ۡ᩻֫;)V

    :cond_3
    return-void
.end method

.method public final ᩳ(Ll/ۡ᩻֫;)Ll/ۛۜ֫;
    .locals 3

    .line 1459
    iget-object v0, p1, Ll/ۡ᩻֫;->mWho:Ljava/lang/String;

    iget-object v1, p0, Ll/ۚۜ֫;->ܺ:Ll/ۨۜ֫;

    invoke-virtual {v1, v0}, Ll/ۨۜ֫;->ܿ(Ljava/lang/String;)Ll/ۛۜ֫;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 1463
    :cond_0
    new-instance v0, Ll/ۛۜ֫;

    iget-object v2, p0, Ll/ۚۜ֫;->ۚ:Ll/ۤ᩻֫;

    invoke-direct {v0, v2, v1, p1}, Ll/ۛۜ֫;-><init>(Ll/ۤ᩻֫;Ll/ۨۜ֫;Ll/ۡ᩻֫;)V

    .line 1466
    iget-object p1, p0, Ll/ۚۜ֫;->ۘ:Ll/ۙ᩻֫;

    invoke-virtual {p1}, Ll/ۙ᩻֫;->ᩳ()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۛۜ֫;->֫(Ljava/lang/ClassLoader;)V

    .line 1468
    iget p1, p0, Ll/ۚۜ֫;->᩻:I

    invoke-virtual {v0, p1}, Ll/ۛۜ֫;->֫(I)V

    return-object v0
.end method

.method public final ᩳ()V
    .locals 2

    const/4 v0, 0x0

    .line 2874
    iput-boolean v0, p0, Ll/ۚۜ֫;->ۧ֫:Z

    .line 2875
    iput-boolean v0, p0, Ll/ۚۜ֫;->ܽ֫:Z

    .line 2876
    iget-object v1, p0, Ll/ۚۜ֫;->ܶ:Ll/᩹ۜ֫;

    invoke-virtual {v1, v0}, Ll/᩹ۜ֫;->֫(Z)V

    .line 2877
    invoke-direct {p0, v0}, Ll/ۚۜ֫;->ᩳ(I)V

    return-void
.end method

.method public final ᩴ()Ll/ۡۜ֫;
    .locals 2

    const/4 v0, 0x0

    .line 896
    iget-object v1, p0, Ll/ۚۜ֫;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۡۜ֫;

    return-object v0
.end method

.method public final ᩵()I
    .locals 1

    .line 887
    iget-object v0, p0, Ll/ۚۜ֫;->֫:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩶()Ll/۬᩷֫;
    .locals 1

    .line 3255
    iget-object v0, p0, Ll/ۚۜ֫;->ۤ:Ll/ۡ᩻֫;

    if-eqz v0, :cond_0

    .line 3260
    iget-object v0, v0, Ll/ۡ᩻֫;->mFragmentManager:Ll/ۚۜ֫;

    invoke-virtual {v0}, Ll/ۚۜ֫;->᩶()Ll/۬᩷֫;

    move-result-object v0

    return-object v0

    .line 3262
    :cond_0
    iget-object v0, p0, Ll/ۚۜ֫;->ۜ:Ll/ܿۜ֫;

    return-object v0
.end method

.method public final ᩷()V
    .locals 1

    const/4 v0, 0x5

    .line 2913
    invoke-direct {p0, v0}, Ll/ۚۜ֫;->ᩳ(I)V

    return-void
.end method

.method public final ᩷(Ll/ۡ᩻֫;)V
    .locals 1

    .line 3357
    iget-boolean v0, p1, Ll/ۡ᩻֫;->mAdded:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Ll/ۚۜ֫;->ᩴ(Ll/ۡ᩻֫;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 3358
    iput-boolean p1, p0, Ll/ۚۜ֫;->۠:Z

    :cond_0
    return-void
.end method

.method public final ᩸()Ll/ۤ᩻֫;
    .locals 1

    .line 3267
    iget-object v0, p0, Ll/ۚۜ֫;->ۚ:Ll/ۤ᩻֫;

    return-object v0
.end method

.method public final ᩹()Ll/ۡ᩻֫;
    .locals 1

    .line 2590
    iget-object v0, p0, Ll/ۚۜ֫;->ۤ:Ll/ۡ᩻֫;

    return-object v0
.end method

.method public final ᩻(Ll/ۡ᩻֫;)Ll/ۗܺ֫;
    .locals 1

    .line 1169
    iget-object v0, p0, Ll/ۚۜ֫;->ܶ:Ll/᩹ۜ֫;

    invoke-virtual {v0, p1}, Ll/᩹ۜ֫;->ᩳ(Ll/ۡ᩻֫;)Ll/ۗܺ֫;

    move-result-object p1

    return-object p1
.end method

.method public final ᩻()V
    .locals 1

    const/4 v0, 0x1

    .line 2923
    invoke-direct {p0, v0}, Ll/ۚۜ֫;->ᩳ(I)V

    return-void
.end method
