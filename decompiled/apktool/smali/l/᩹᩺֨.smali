.class public final Ll/᩹᩺֨;
.super Ll/ܳ֨۠;
.source "8459"


# instance fields
.field public ֫:Ll/᩶֡֨;

.field public final synthetic ۧ:Ll/᩺᩺֨;


# direct methods
.method public constructor <init>(Ll/᩺᩺֨;)V
    .locals 0

    .line 3437
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 724
    iput-object p1, p0, Ll/᩹᩺֨;->ۧ:Ll/᩺᩺֨;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۚۚ۠;Ll/ۛ֡֨;Ll/᩶֡֨;)V
    .locals 12

    .line 755
    iget-object p3, p3, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    :goto_0
    sget-object v0, Ll/ۙ֨֨;->ۙ:Ll/ۨۚ֨;

    if-eq p3, v0, :cond_3

    .line 756
    iget-object v0, p3, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v0}, Ll/ۛ֡֨;->֨֫()Ll/ܰ᩵֨;

    move-result-object v0

    iget-object v1, p2, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    sget-object v2, Ll/֨᩵֨;->᩹:Ll/֨᩵֨;

    const/4 v3, 0x0

    .line 107
    invoke-virtual {v0, v1, v3, v2}, Ll/۟᩵֨;->֫(Ll/ۤܶ۠;Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;

    move-result-object v0

    .line 756
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    iget-object v2, p0, Ll/᩹᩺֨;->ۧ:Ll/᩺᩺֨;

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛ֡֨;

    .line 758
    iget-object v3, p2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    iget-object v4, v1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    if-ne v3, v4, :cond_0

    invoke-static {v2}, Ll/᩺᩺֨;->ܳ(Ll/᩺᩺֨;)Ll/ۛ᩸֨;

    move-result-object v3

    invoke-static {v2}, Ll/᩺᩺֨;->ܳ(Ll/᩺᩺֨;)Ll/ۛ᩸֨;

    move-result-object v4

    iget-object v5, p2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 759
    invoke-virtual {v4, v5}, Ll/ۛ᩸֨;->ۢ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v4

    invoke-static {v2}, Ll/᩺᩺֨;->ܳ(Ll/᩺᩺֨;)Ll/ۛ᩸֨;

    move-result-object v5

    iget-object v6, v1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v5, v6}, Ll/ۛ᩸֨;->ۢ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ll/ۛ᩸֨;->ܿ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v3

    if-eqz v3, :cond_0

    if-eq p2, v1, :cond_0

    .line 761
    invoke-virtual {p2}, Ll/ۛ֡֨;->۬()J

    move-result-wide v3

    const-wide/16 v5, 0x1000

    and-long/2addr v3, v5

    invoke-virtual {v1}, Ll/ۛ֡֨;->۬()J

    move-result-wide v7

    and-long/2addr v7, v5

    cmp-long v9, v3, v7

    if-eqz v9, :cond_0

    .line 762
    invoke-virtual {p2}, Ll/ۛ֡֨;->۬()J

    move-result-wide v3

    const-wide v7, 0x80000000L

    and-long/2addr v3, v7

    const-wide/16 v9, 0x0

    cmp-long v11, v3, v9

    if-nez v11, :cond_0

    invoke-virtual {v1}, Ll/ۛ֡֨;->۬()J

    move-result-wide v3

    and-long/2addr v3, v7

    cmp-long v7, v3, v9

    if-nez v7, :cond_0

    .line 763
    invoke-virtual {v1}, Ll/ۛ֡֨;->۬()J

    move-result-wide v3

    and-long/2addr v3, v5

    cmp-long p3, v3, v9

    if-nez p3, :cond_1

    move-object p2, v1

    .line 773
    :cond_1
    iget-object p3, p2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {p3}, Ll/ۙ֨֨;->᩻֫()Z

    move-result p3

    if-nez p3, :cond_3

    .line 774
    invoke-static {v2}, Ll/᩺᩺֨;->֫(Ll/᩺᩺֨;)Ll/᩹ܶ۠;

    move-result-object p3

    invoke-virtual {p2}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v0

    invoke-virtual {p2}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v1

    sget-object v2, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 8086
    new-instance v2, Ll/ۨ۠۠;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p2, v3, v4

    const/4 p2, 0x1

    aput-object v1, v3, p2

    const-string p2, "compiler"

    const-string v1, "synthetic.name.conflict"

    invoke-direct {v2, p2, v1, v3}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 774
    invoke-static {v0, v2}, Ll/ۛᩴ۠;->֫(Ll/ۛ֡֨;Ll/ۨ۠۠;)Ll/۫۠۠;

    move-result-object p2

    invoke-virtual {p3, p1, p2}, Ll/ۖ֨۠;->֫(Ll/ۗ۠۠;Ll/۫۠۠;)V

    return-void

    .line 755
    :cond_2
    invoke-static {v2}, Ll/᩺᩺֨;->ܳ(Ll/᩺᩺֨;)Ll/ۛ᩸֨;

    move-result-object v0

    invoke-virtual {v0, p3}, Ll/ۛ᩸֨;->᩸(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p3

    goto/16 :goto_0

    :cond_3
    return-void
.end method

.method public final ֫(Ll/ۚ᩵۠;)V
    .locals 2

    .line 744
    iget-object v0, p0, Ll/᩹᩺֨;->֫:Ll/᩶֡֨;

    .line 745
    iget-object v1, p1, Ll/ۚ᩵۠;->᩺:Ll/ܳ֡֨;

    iput-object v1, p0, Ll/᩹᩺֨;->֫:Ll/᩶֡֨;

    .line 747
    :try_start_0
    invoke-super {p0, p1}, Ll/ܳ֨۠;->֫(Ll/ۚ᩵۠;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 750
    iput-object v0, p0, Ll/᩹᩺֨;->֫:Ll/᩶֡֨;

    return-void

    :catchall_0
    move-exception p1

    iput-object v0, p0, Ll/᩹᩺֨;->֫:Ll/᩶֡֨;

    .line 751
    throw p1
.end method

.method public final ֫(Ll/ۡ֡۠;)V
    .locals 2

    .line 730
    iget-object v0, p1, Ll/ۡ֡۠;->۟:Ll/ۘ֡֨;

    iget-object v1, p0, Ll/᩹᩺֨;->֫:Ll/᩶֡֨;

    invoke-virtual {p0, p1, v0, v1}, Ll/᩹᩺֨;->֫(Ll/ۚۚ۠;Ll/ۛ֡֨;Ll/᩶֡֨;)V

    .line 731
    invoke-super {p0, p1}, Ll/ܳ֨۠;->֫(Ll/ۡ֡۠;)V

    return-void
.end method

.method public final ֫(Ll/ۢۚ۠;)V
    .locals 3

    .line 736
    iget-object v0, p1, Ll/ۢۚ۠;->᩺:Ll/۫֡֨;

    iget-object v1, v0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v1, v1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v2, Ll/֨ᩴ֨;->᩻֫:Ll/֨ᩴ֨;

    if-ne v1, v2, :cond_0

    .line 737
    iget-object v1, p0, Ll/᩹᩺֨;->֫:Ll/᩶֡֨;

    invoke-virtual {p0, p1, v0, v1}, Ll/᩹᩺֨;->֫(Ll/ۚۚ۠;Ll/ۛ֡֨;Ll/᩶֡֨;)V

    .line 739
    :cond_0
    invoke-super {p0, p1}, Ll/ܳ֨۠;->֫(Ll/ۢۚ۠;)V

    return-void
.end method
