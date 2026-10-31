.class public final Ll/ᩳۡܿ;
.super Ljava/lang/Object;
.source "O700"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final ۗ:I

.field public final ۙ:Ll/ܶۜܿ;

.field public final synthetic ۤ:Ll/᩷ۡܿ;

.field public final ۫:Ll/᩶᩸ᩳ;

.field public final ۬:Ll/۟ۖܿ;

.field public final ᩶:Ll/ۢۖܿ;

.field public final ᩸:Ll/᩺ۖܿ;

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ll/᩷ۡܿ;Ll/᩶᩸ᩳ;Ll/ܶۜܿ;ILl/۟ۖܿ;Ll/ۢۖܿ;ILl/᩺ۖܿ;)V
    .locals 0

    .line 1829
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳۡܿ;->ۤ:Ll/᩷ۡܿ;

    .line 1830
    iput-object p2, p0, Ll/ᩳۡܿ;->۫:Ll/᩶᩸ᩳ;

    .line 1831
    iput-object p3, p0, Ll/ᩳۡܿ;->ۙ:Ll/ܶۜܿ;

    .line 1832
    iput p4, p0, Ll/ᩳۡܿ;->ۗ:I

    .line 1833
    iput-object p5, p0, Ll/ᩳۡܿ;->۬:Ll/۟ۖܿ;

    .line 1834
    iput-object p6, p0, Ll/ᩳۡܿ;->᩶:Ll/ۢۖܿ;

    .line 1835
    iput p7, p0, Ll/ᩳۡܿ;->᩹:I

    .line 1836
    iput-object p8, p0, Ll/ᩳۡܿ;->᩸:Ll/᩺ۖܿ;

    return-void
.end method

.method private ֫()I
    .locals 6

    .line 1890
    iget-object v0, p0, Ll/ᩳۡܿ;->ۤ:Ll/᩷ۡܿ;

    monitor-enter v0

    .line 1891
    :try_start_0
    iget-object v1, p0, Ll/ᩳۡܿ;->ۤ:Ll/᩷ۡܿ;

    invoke-static {v1}, Ll/᩷ۡܿ;->֫(Ll/᩷ۡܿ;)Ll/ܿۡܿ;

    move-result-object v1

    iget-object v1, v1, Ll/ܿۡܿ;->ۧ:Ll/ᩳۡܿ;

    const/4 v2, 0x0

    if-eq v1, p0, :cond_0

    .line 1892
    monitor-exit v0

    return v2

    .line 1894
    :cond_0
    iget-object v1, p0, Ll/ᩳۡܿ;->ۤ:Ll/᩷ۡܿ;

    invoke-static {v1}, Ll/᩷ۡܿ;->ܽ(Ll/᩷ۡܿ;)Ll/۫ۨᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    iget-object v3, p0, Ll/ᩳۡܿ;->۫:Ll/᩶᩸ᩳ;

    const/4 v4, 0x1

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Ll/ᩳۡܿ;->ۤ:Ll/᩷ۡܿ;

    .line 1895
    invoke-static {v1}, Ll/᩷ۡܿ;->ܳ(Ll/᩷ۡܿ;)Ll/ܶۜܿ;

    move-result-object v1

    iget-object v3, p0, Ll/ᩳۡܿ;->ۙ:Ll/ܶۜܿ;

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Ll/ᩳۡܿ;->۫:Ll/᩶᩸ᩳ;

    .line 1896
    invoke-interface {v1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v1

    iget v3, p0, Ll/ᩳۡܿ;->ۗ:I

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Ll/ᩳۡܿ;->ۤ:Ll/᩷ۡܿ;

    invoke-static {v1}, Ll/᩷ۡܿ;->ۧ(Ll/᩷ۡܿ;)Ll/ܳۡܿ;

    move-result-object v1

    iget v1, v1, Ll/ܳۡܿ;->ᩳ:I

    iget v3, p0, Ll/ᩳۡܿ;->᩹:I

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Ll/ᩳۡܿ;->ۤ:Ll/᩷ۡܿ;

    invoke-static {v1}, Ll/᩷ۡܿ;->֫(Ll/᩷ۡܿ;)Ll/ܿۡܿ;

    move-result-object v1

    iget-object v1, v1, Ll/ܿۡܿ;->ܽ:Ll/᩺ۖܿ;

    iget-object v3, p0, Ll/ᩳۡܿ;->᩸:Ll/᩺ۖܿ;

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Ll/ᩳۡܿ;->ۤ:Ll/᩷ۡܿ;

    iget-object v3, p0, Ll/ᩳۡܿ;->۫:Ll/᩶᩸ᩳ;

    iget v5, p0, Ll/ᩳۡܿ;->ۗ:I

    .line 1899
    invoke-static {v1, v3, v5}, Ll/᩷ۡܿ;->֫(Ll/᩷ۡܿ;Ll/᩶᩸ᩳ;I)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 1900
    :goto_0
    iget-object v3, p0, Ll/ᩳۡܿ;->ۤ:Ll/᩷ۡܿ;

    invoke-static {v3}, Ll/᩷ۡܿ;->ۧ(Ll/᩷ۡܿ;)Ll/ܳۡܿ;

    move-result-object v3

    iget-object v3, v3, Ll/ܳۡܿ;->᩷:Ll/ۢۖܿ;

    iget-object v5, p0, Ll/ᩳۡܿ;->᩶:Ll/ۢۖܿ;

    if-ne v3, v5, :cond_2

    iget-object v3, p0, Ll/ᩳۡܿ;->ۤ:Ll/᩷ۡܿ;

    invoke-static {v3}, Ll/᩷ۡܿ;->ۧ(Ll/᩷ۡܿ;)Ll/ܳۡܿ;

    move-result-object v3

    iget-object v3, v3, Ll/ܳۡܿ;->ۡ:Ll/۟ۖܿ;

    iget-object v5, p0, Ll/ᩳۡܿ;->۬:Ll/۟ۖܿ;

    if-ne v3, v5, :cond_2

    iget-object v3, p0, Ll/ᩳۡܿ;->۫:Ll/᩶᩸ᩳ;

    .line 1902
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    iget-object v5, p0, Ll/ᩳۡܿ;->᩶:Ll/ۢۖܿ;

    invoke-virtual {v5}, Ll/ۢۖܿ;->֫()I

    move-result v5

    if-ne v3, v5, :cond_2

    const/4 v3, 0x1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    if-eqz v1, :cond_5

    if-nez v3, :cond_3

    goto :goto_2

    .line 1909
    :cond_3
    iget-object v1, p0, Ll/ᩳۡܿ;->ۤ:Ll/᩷ۡܿ;

    invoke-static {v1}, Ll/᩷ۡܿ;->ܽ(Ll/᩷ۡܿ;)Ll/۫ۨᩳ;

    move-result-object v1

    .line 1907
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Ll/ᩳۡܿ;->ۤ:Ll/᩷ۡܿ;

    invoke-static {v1}, Ll/᩷ۡܿ;->ܽ(Ll/᩷ۡܿ;)Ll/۫ۨᩳ;

    move-result-object v1

    .line 1908
    invoke-virtual {v1}, Ll/۫ۨᩳ;->ܽܽ()Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Ll/ᩳۡܿ;->ۤ:Ll/᩷ۡܿ;

    invoke-static {v1}, Ll/᩷ۡܿ;->ܽ(Ll/᩷ۡܿ;)Ll/۫ۨᩳ;

    move-result-object v1

    .line 1909
    invoke-virtual {v1}, Ll/۫ۨᩳ;->᩹ۧ()Z

    move-result v1

    if-nez v1, :cond_4

    const/4 v4, 0x2

    :cond_4
    monitor-exit v0

    return v4

    .line 1904
    :cond_5
    :goto_2
    iget-object v1, p0, Ll/ᩳۡܿ;->ۤ:Ll/᩷ۡܿ;

    invoke-static {v1}, Ll/᩷ۡܿ;->֫(Ll/᩷ۡܿ;)Ll/ܿۡܿ;

    move-result-object v1

    const/4 v3, 0x0

    iput-object v3, v1, Ll/ܿۡܿ;->ۧ:Ll/ᩳۡܿ;

    .line 1905
    monitor-exit v0

    return v2

    :catchall_0
    move-exception v1

    .line 1910
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1841
    invoke-direct {p0}, Ll/ᩳۡܿ;->֫()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    goto/16 :goto_4

    .line 1846
    :cond_0
    iget-object v0, p0, Ll/ᩳۡܿ;->۬:Ll/۟ۖܿ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/۟ۖܿ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1847
    iget-object v0, p0, Ll/ᩳۡܿ;->ۤ:Ll/᩷ۡܿ;

    invoke-static {v0}, Ll/᩷ۡܿ;->ܽ(Ll/᩷ۡܿ;)Ll/۫ۨᩳ;

    move-result-object v0

    iget-object v1, p0, Ll/ᩳۡܿ;->۬:Ll/۟ۖܿ;

    .line 1848
    invoke-virtual {v1}, Ll/۟ۖܿ;->ۧ()I

    move-result v1

    iget-object v2, p0, Ll/ᩳۡܿ;->۬:Ll/۟ۖܿ;

    invoke-virtual {v2}, Ll/۟ۖܿ;->֫()I

    move-result v2

    iget-object v3, p0, Ll/ᩳۡܿ;->᩸:Ll/᩺ۖܿ;

    .line 1849
    invoke-virtual {v3}, Ll/᩺ۖܿ;->֫()[I

    move-result-object v3

    .line 1847
    invoke-virtual {v0, v1, v2, v3}, Ll/۫ۨᩳ;->֫(II[I)Z

    move-result v0

    goto :goto_0

    .line 1851
    :cond_1
    iget-object v0, p0, Ll/ᩳۡܿ;->ۤ:Ll/᩷ۡܿ;

    invoke-static {v0}, Ll/᩷ۡܿ;->ܽ(Ll/᩷ۡܿ;)Ll/۫ۨᩳ;

    move-result-object v0

    iget-object v1, p0, Ll/ᩳۡܿ;->᩸:Ll/᩺ۖܿ;

    invoke-virtual {v1}, Ll/᩺ۖܿ;->֫()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/۫ۨᩳ;->֫([I)Z

    move-result v0

    :goto_0
    if-nez v0, :cond_2

    .line 1854
    iget-object v0, p0, Ll/ᩳۡܿ;->ۤ:Ll/᩷ۡܿ;

    invoke-static {v0}, Ll/᩷ۡܿ;->ܽ(Ll/᩷ۡܿ;)Ll/۫ۨᩳ;

    move-result-object v0

    const-wide/16 v1, 0x64

    invoke-virtual {v0, p0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    .line 1859
    :cond_2
    iget-object v0, p0, Ll/ᩳۡܿ;->ۤ:Ll/᩷ۡܿ;

    monitor-enter v0

    .line 1860
    :try_start_0
    iget-object v1, p0, Ll/ᩳۡܿ;->ۤ:Ll/᩷ۡܿ;

    invoke-static {v1}, Ll/᩷ۡܿ;->֫(Ll/᩷ۡܿ;)Ll/ܿۡܿ;

    move-result-object v1

    iget-object v1, v1, Ll/ܿۡܿ;->ۧ:Ll/ᩳۡܿ;

    if-ne v1, p0, :cond_6

    .line 1861
    iget-object v1, p0, Ll/ᩳۡܿ;->ۤ:Ll/᩷ۡܿ;

    invoke-static {v1}, Ll/᩷ۡܿ;->֫(Ll/᩷ۡܿ;)Ll/ܿۡܿ;

    move-result-object v1

    iget-boolean v1, v1, Ll/ܿۡܿ;->֫:Z

    .line 1862
    iget-object v2, p0, Ll/ᩳۡܿ;->ۤ:Ll/᩷ۡܿ;

    invoke-static {v2}, Ll/᩷ۡܿ;->֫(Ll/᩷ۡܿ;)Ll/ܿۡܿ;

    move-result-object v2

    iget-boolean v2, v2, Ll/ܿۡܿ;->ۜ:Z

    .line 1864
    iget-object v3, p0, Ll/ᩳۡܿ;->ۤ:Ll/᩷ۡܿ;

    invoke-static {v3}, Ll/᩷ۡܿ;->֫(Ll/᩷ۡܿ;)Ll/ܿۡܿ;

    move-result-object v3

    const/4 v4, 0x0

    iput-object v4, v3, Ll/ܿۡܿ;->ۧ:Ll/ᩳۡܿ;

    .line 1865
    iget-object v3, p0, Ll/ᩳۡܿ;->ۤ:Ll/᩷ۡܿ;

    invoke-static {v3}, Ll/᩷ۡܿ;->ᩳ(Ll/᩷ۡܿ;)V

    .line 1867
    iget-object v3, p0, Ll/ᩳۡܿ;->۬:Ll/۟ۖܿ;

    if-eqz v3, :cond_5

    if-eqz v1, :cond_3

    goto :goto_1

    .line 1869
    :cond_3
    invoke-virtual {v3}, Ll/۟ۖܿ;->᩻()Z

    move-result v1

    if-nez v1, :cond_4

    .line 1871
    iget-object v1, p0, Ll/ᩳۡܿ;->ۤ:Ll/᩷ۡܿ;

    iget-object v3, p0, Ll/ᩳۡܿ;->۫:Ll/᩶᩸ᩳ;

    invoke-static {v1}, Ll/᩷ۡܿ;->֫(Ll/᩷ۡܿ;)Ll/ܿۡܿ;

    move-result-object v4

    iget-object v4, v4, Ll/ܿۡܿ;->ۡ:Ll/᩺ۖܿ;

    iget-object v5, p0, Ll/ᩳۡܿ;->᩸:Ll/᩺ۖܿ;

    invoke-virtual {v4, v5}, Ll/᩺ۖܿ;->֫(Ll/᩺ۖܿ;)Ll/᩺ۖܿ;

    move-result-object v4

    invoke-static {v1, v3, v4}, Ll/᩷ۡܿ;->֫(Ll/᩷ۡܿ;Ll/᩶᩸ᩳ;Ll/᩺ۖܿ;)V

    goto :goto_2

    .line 1873
    :cond_4
    iget-object v1, p0, Ll/ᩳۡܿ;->ۤ:Ll/᩷ۡܿ;

    iget-object v3, p0, Ll/ᩳۡܿ;->۫:Ll/᩶᩸ᩳ;

    iget-object v4, p0, Ll/ᩳۡܿ;->۬:Ll/۟ۖܿ;

    invoke-static {v1, v3, v4}, Ll/᩷ۡܿ;->֫(Ll/᩷ۡܿ;Ll/᩶᩸ᩳ;Ll/۟ۖܿ;)V

    goto :goto_2

    .line 1868
    :cond_5
    :goto_1
    iget-object v1, p0, Ll/ᩳۡܿ;->ۤ:Ll/᩷ۡܿ;

    invoke-static {v1}, Ll/᩷ۡܿ;->ܿ(Ll/᩷ۡܿ;)V

    :goto_2
    const/4 v1, 0x1

    goto :goto_3

    :cond_6
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 1877
    :goto_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_7

    goto :goto_4

    .line 1882
    :cond_7
    iget-object v0, p0, Ll/ᩳۡܿ;->ۤ:Ll/᩷ۡܿ;

    invoke-static {v0}, Ll/᩷ۡܿ;->ܽ(Ll/᩷ۡܿ;)Ll/۫ۨᩳ;

    move-result-object v0

    .line 2207
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۡ()V

    .line 2208
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    if-eqz v2, :cond_8

    .line 1884
    iget-object v0, p0, Ll/ᩳۡܿ;->ۤ:Ll/᩷ۡܿ;

    iget-object v1, p0, Ll/ᩳۡܿ;->۫:Ll/᩶᩸ᩳ;

    invoke-static {v0, v1}, Ll/᩷ۡܿ;->֫(Ll/᩷ۡܿ;Ll/᩶᩸ᩳ;)V

    :cond_8
    :goto_4
    return-void

    :catchall_0
    move-exception v1

    .line 1877
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
