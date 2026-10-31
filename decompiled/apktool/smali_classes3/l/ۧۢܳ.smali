.class public final Ll/ۧۢܳ;
.super Ljava/lang/Object;
.source "123V"


# instance fields
.field public ֫:Ljava/lang/Runnable;

.field public volatile ۧ:Z

.field public final synthetic ܽ:Ll/ܽۢܳ;


# direct methods
.method public constructor <init>(Ll/ܽۢܳ;Ljava/lang/Runnable;)V
    .locals 0

    .line 1714
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧۢܳ;->ܽ:Ll/ܽۢܳ;

    const/4 p1, 0x0

    .line 1710
    iput-boolean p1, p0, Ll/ۧۢܳ;->ۧ:Z

    .line 1715
    iput-object p2, p0, Ll/ۧۢܳ;->֫:Ljava/lang/Runnable;

    return-void
.end method

.method public static ֫(Ll/ۧۢܳ;)V
    .locals 1

    const/4 v0, 0x1

    .line 1764
    invoke-direct {p0, v0}, Ll/ۧۢܳ;->֫(Z)V

    return-void
.end method

.method private ֫(Z)V
    .locals 6

    move-object v0, p0

    .line 1770
    monitor-enter v0

    .line 1771
    :try_start_0
    iget-boolean v1, p0, Ll/ۧۢܳ;->ۧ:Z

    if-eqz v1, :cond_0

    .line 1772
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 1773
    iput-boolean v1, p0, Ll/ۧۢܳ;->ۧ:Z

    const/4 v2, 0x0

    if-eqz p1, :cond_1

    .line 1775
    iget-object p1, p0, Ll/ۧۢܳ;->֫:Ljava/lang/Runnable;

    goto :goto_0

    :cond_1
    move-object p1, v2

    .line 1777
    :goto_0
    iput-object v2, p0, Ll/ۧۢܳ;->֫:Ljava/lang/Runnable;

    .line 1778
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 1780
    iget-object v0, p0, Ll/ۧۢܳ;->ܽ:Ll/ܽۢܳ;

    invoke-static {v0}, Ll/ܽۢܳ;->ܿ(Ll/ܽۢܳ;)Ljava/util/HashSet;

    move-result-object v0

    monitor-enter v0

    .line 1781
    :try_start_1
    iget-object v3, p0, Ll/ۧۢܳ;->ܽ:Ll/ܽۢܳ;

    invoke-static {v3}, Ll/ܽۢܳ;->ܿ(Ll/ܽۢܳ;)Ljava/util/HashSet;

    move-result-object v3

    invoke-virtual {v3, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 1782
    monitor-exit v0

    return-void

    .line 1783
    :cond_2
    iget-object v3, p0, Ll/ۧۢܳ;->ܽ:Ll/ܽۢܳ;

    invoke-static {v3}, Ll/ܽۢܳ;->ܿ(Ll/ܽۢܳ;)Ljava/util/HashSet;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/HashSet;->isEmpty()Z

    move-result v3

    .line 1784
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_3

    .line 1786
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_3
    if-eqz v3, :cond_7

    .line 1789
    iget-object p1, p0, Ll/ۧۢܳ;->ܽ:Ll/ܽۢܳ;

    invoke-static {p1}, Ll/ܽۢܳ;->ᩳ(Ll/ܽۢܳ;)Ll/۟᩷ܳ;

    move-result-object p1

    .line 1870
    iget-object v0, p1, Ll/۟᩷ܳ;->ܿ:Landroid/view/ViewGroup;

    if-eqz v0, :cond_7

    iget-object v0, p1, Ll/۟᩷ܳ;->֫:Ll/ܿ֡ۘ;

    if-eqz v0, :cond_7

    iget-object v3, p1, Ll/۟᩷ܳ;->ۧ:Ll/ܿ֡ۘ;

    if-nez v3, :cond_4

    goto :goto_1

    .line 1872
    :cond_4
    invoke-virtual {v0}, Ll/ۨ֡ۘ;->cancel()V

    .line 1873
    iget-object v0, p1, Ll/۟᩷ܳ;->ۧ:Ll/ܿ֡ۘ;

    invoke-virtual {v0}, Ll/ۨ֡ۘ;->cancel()V

    .line 1874
    iget-object v0, p1, Ll/۟᩷ܳ;->ܽ:Ll/ܿ֡ۘ;

    if-eqz v0, :cond_5

    .line 1875
    invoke-virtual {v0}, Ll/ۨ֡ۘ;->cancel()V

    .line 1876
    :cond_5
    iget-object v0, p1, Ll/۟᩷ܳ;->ܿ:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->getAlpha()F

    move-result v0

    const v3, 0x3d8f5c29    # 0.07f

    cmpg-float v0, v0, v3

    if-gtz v0, :cond_6

    .line 1877
    iget-object v0, p1, Ll/۟᩷ܳ;->ܿ:Landroid/view/ViewGroup;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1878
    iput-object v2, p1, Ll/۟᩷ܳ;->ܿ:Landroid/view/ViewGroup;

    .line 1879
    iput-object v2, p1, Ll/۟᩷ܳ;->֫:Ll/ܿ֡ۘ;

    .line 1880
    iput-object v2, p1, Ll/۟᩷ܳ;->ۧ:Ll/ܿ֡ۘ;

    .line 1881
    iput-object v2, p1, Ll/۟᩷ܳ;->ܽ:Ll/ܿ֡ۘ;

    return-void

    .line 1884
    :cond_6
    iget-object v0, p1, Ll/۟᩷ܳ;->ܿ:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->getAlpha()F

    move-result v3

    const/4 v4, 0x2

    new-array v4, v4, [F

    const/4 v5, 0x0

    aput v3, v4, v5

    const/4 v3, 0x0

    aput v3, v4, v1

    invoke-static {v0, v4}, Ll/ܿ֡ۘ;->֫(Ljava/lang/Object;[F)Ll/ܿ֡ۘ;

    move-result-object v0

    iput-object v0, p1, Ll/۟᩷ܳ;->ᩳ:Ll/ܿ֡ۘ;

    .line 1885
    new-instance v1, Ll/ܰ᩷ܳ;

    invoke-direct {v1, p1}, Ll/ܰ᩷ܳ;-><init>(Ll/۟᩷ܳ;)V

    invoke-virtual {v0, v1}, Ll/᩺᩵ۘ;->֫(Ll/ܰ᩵ۘ;)V

    .line 1895
    iget-object v0, p1, Ll/۟᩷ܳ;->ᩳ:Ll/ܿ֡ۘ;

    invoke-virtual {v0}, Ll/ۨ֡ۘ;->ܳ()V

    .line 1896
    iput-object v2, p1, Ll/۟᩷ܳ;->֫:Ll/ܿ֡ۘ;

    .line 1897
    iput-object v2, p1, Ll/۟᩷ܳ;->ۧ:Ll/ܿ֡ۘ;

    .line 1898
    iput-object v2, p1, Ll/۟᩷ܳ;->ܽ:Ll/ܿ֡ۘ;

    :cond_7
    :goto_1
    return-void

    :catchall_0
    move-exception p1

    .line 1784
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    .line 1778
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 1759
    invoke-direct {p0, v0}, Ll/ۧۢܳ;->֫(Z)V

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 1719
    iget-boolean v0, p0, Ll/ۧۢܳ;->ۧ:Z

    return v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 1723
    iget-boolean v0, p0, Ll/ۧۢܳ;->ۧ:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
