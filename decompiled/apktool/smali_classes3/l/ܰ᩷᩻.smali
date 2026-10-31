.class public final Ll/ܰ᩷᩻;
.super Ljava/lang/Object;
.source "W79N"


# instance fields
.field public final ֫:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final ۧ:Ljava/util/LinkedHashMap;

.field public final ܳ:Ljava/lang/ref/WeakReference;

.field public final ܽ:Ll/ۚۡ֫;

.field public ܿ:Landroid/net/wifi/WifiManager$MulticastLock;

.field public final ᩳ:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Ll/֡ۚۢ;)V
    .locals 1

    .line 719
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 710
    new-instance v0, Ll/ۚۡ֫;

    invoke-direct {v0}, Ll/ۚۡ֫;-><init>()V

    iput-object v0, p0, Ll/ܰ᩷᩻;->ܽ:Ll/ۚۡ֫;

    .line 711
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ll/ܰ᩷᩻;->ᩳ:Ljava/util/LinkedHashMap;

    .line 712
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ll/ܰ᩷᩻;->ۧ:Ljava/util/LinkedHashMap;

    .line 713
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Ll/ܰ᩷᩻;->֫:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 720
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/ܰ᩷᩻;->ܳ:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method private declared-synchronized ֫(Ljava/lang/String;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 780
    :try_start_0
    iget-object v1, p0, Ll/ܰ᩷᩻;->ᩳ:Ljava/util/LinkedHashMap;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 781
    invoke-direct {p0}, Ll/ܰ᩷᩻;->ۧ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 783
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

.method private declared-synchronized ֫(Ljava/lang/String;Ll/ۧۢ᩻;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 762
    :try_start_0
    iget-object v1, p0, Ll/ܰ᩷᩻;->ᩳ:Ljava/util/LinkedHashMap;

    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 763
    invoke-direct {p0}, Ll/ܰ᩷᩻;->ۧ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 764
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

.method public static synthetic ֫(Ll/ܰ᩷᩻;)V
    .locals 1

    .line 845
    iget-object p0, p0, Ll/ܰ᩷᩻;->ܳ:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/֡ۚۢ;

    if-eqz p0, :cond_0

    .line 846
    invoke-virtual {p0}, Ll/֡ۚۢ;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f0a0631

    .line 847
    invoke-virtual {p0, v0}, Ll/֡ۚۢ;->֫(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    if-eqz p0, :cond_0

    const v0, 0x7f1208d3

    .line 849
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(I)V

    :cond_0
    return-void
.end method

.method public static ֫(Ll/ܰ᩷᩻;I)V
    .locals 0

    if-nez p1, :cond_0

    .line 844
    new-instance p1, Ll/᩺᩷᩻;

    invoke-direct {p1, p0}, Ll/᩺᩷᩻;-><init>(Ll/ܰ᩷᩻;)V

    invoke-static {p1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void

    .line 828
    :cond_0
    iget-object p0, p0, Ll/ܰ᩷᩻;->֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    return-void
.end method

.method public static ֫(Ll/ܰ᩷᩻;Ll/ۗܺ᩷;)V
    .locals 2

    .line 728
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "wifi"

    .line 729
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiManager;

    if-nez v0, :cond_0

    goto :goto_0

    .line 733
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ":NetworkServiceScanner"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/net/wifi/WifiManager;->createMulticastLock(Ljava/lang/String;)Landroid/net/wifi/WifiManager$MulticastLock;

    move-result-object p1

    const/4 v0, 0x0

    .line 734
    invoke-virtual {p1, v0}, Landroid/net/wifi/WifiManager$MulticastLock;->setReferenceCounted(Z)V

    .line 735
    invoke-virtual {p1}, Landroid/net/wifi/WifiManager$MulticastLock;->acquire()V

    .line 736
    iput-object p1, p0, Ll/ܰ᩷᩻;->ܿ:Landroid/net/wifi/WifiManager$MulticastLock;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    return-void
.end method

.method public static ֫(Ll/ܰ᩷᩻;Ll/ۧۢ᩻;)V
    .locals 3

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 799
    :try_start_0
    iget-object v1, p0, Ll/ܰ᩷᩻;->ۧ:Ljava/util/LinkedHashMap;

    invoke-static {p1}, Ll/ۧۢ᩻;->֫(Ll/ۧۢ᩻;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 800
    iget-object v1, p0, Ll/ܰ᩷᩻;->ۧ:Ljava/util/LinkedHashMap;

    invoke-static {p1}, Ll/ۧۢ᩻;->֫(Ll/ۧۢ᩻;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 801
    invoke-direct {p0}, Ll/ܰ᩷᩻;->ۧ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 803
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ֫(Ll/ܰ᩷᩻;Ll/᩷ۢ᩻;Ljava/lang/String;)V
    .locals 1

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 789
    :try_start_0
    invoke-virtual {p1}, Ll/᩷ۢ᩻;->ۧ()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-direct {p0}, Ll/ܰ᩷᩻;->֫()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 792
    :cond_0
    invoke-direct {p0, p2}, Ll/ܰ᩷᩻;->֫(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 793
    monitor-exit v0

    return-void

    .line 790
    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ֫(Ll/ܰ᩷᩻;Ll/᩷ۢ᩻;Ljava/lang/String;Ll/ۧۢ᩻;)V
    .locals 1

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 770
    :try_start_0
    invoke-virtual {p1}, Ll/᩷ۢ᩻;->ۧ()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-direct {p0}, Ll/ܰ᩷᩻;->֫()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 773
    :cond_0
    invoke-direct {p0, p2, p3}, Ll/ܰ᩷᩻;->֫(Ljava/lang/String;Ll/ۧۢ᩻;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 774
    monitor-exit v0

    return-void

    .line 771
    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method private ֫()Z
    .locals 1

    .line 816
    iget-object v0, p0, Ll/ܰ᩷᩻;->ܳ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡ۚۢ;

    if-eqz v0, :cond_1

    .line 817
    invoke-virtual {v0}, Ll/֡ۚۢ;->ۜ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public static bridge synthetic ۧ(Ll/ܰ᩷᩻;)Ll/ۚۡ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܰ᩷᩻;->ܽ:Ll/ۚۡ֫;

    return-object p0
.end method

.method private ۧ()V
    .locals 6

    .line 809
    iget-object v0, p0, Ll/ܰ᩷᩻;->ᩳ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    iget-object v1, p0, Ll/ܰ᩷᩻;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    .line 1707
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1708
    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1709
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۧۢ᩻;

    .line 1710
    invoke-static {v4}, Ll/ۧۢ᩻;->֫(Ll/ۧۢ᩻;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 1711
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1714
    :cond_1
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧۢ᩻;

    .line 1715
    invoke-static {v1}, Ll/ۧۢ᩻;->֫(Ll/ۧۢ᩻;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 1716
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 809
    :cond_3
    iget-object v0, p0, Ll/ܰ᩷᩻;->ܽ:Ll/ۚۡ֫;

    invoke-virtual {v0, v2}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    return-void
.end method

.method public static ܽ(Ll/ܰ᩷᩻;)V
    .locals 1

    .line 835
    iget-object v0, p0, Ll/ܰ᩷᩻;->֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_0

    .line 844
    new-instance v0, Ll/᩺᩷᩻;

    invoke-direct {v0, p0}, Ll/᩺᩷᩻;-><init>(Ll/ܰ᩷᩻;)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public static ܿ(Ll/ܰ᩷᩻;)V
    .locals 2

    .line 746
    iget-object v0, p0, Ll/ܰ᩷᩻;->ܿ:Landroid/net/wifi/WifiManager$MulticastLock;

    const/4 v1, 0x0

    .line 747
    iput-object v1, p0, Ll/ܰ᩷᩻;->ܿ:Landroid/net/wifi/WifiManager$MulticastLock;

    if-eqz v0, :cond_1

    .line 748
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$MulticastLock;->isHeld()Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    .line 752
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$MulticastLock;->release()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    :goto_0
    return-void
.end method

.method public static bridge synthetic ᩳ(Ll/ܰ᩷᩻;)Z
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܰ᩷᩻;->֫()Z

    move-result p0

    return p0
.end method
