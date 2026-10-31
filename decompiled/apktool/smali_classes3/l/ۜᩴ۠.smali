.class public final Ll/ۜᩴ۠;
.super Ll/ܳ֨۠;
.source "640U"


# instance fields
.field public final synthetic ֫:Ll/֨ᩴ۠;

.field public ۧ:Ll/֨᩵۠;


# direct methods
.method public constructor <init>(Ll/֨ᩴ۠;)V
    .locals 0

    .line 3437
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1594
    iput-object p1, p0, Ll/ۜᩴ۠;->֫:Ll/֨ᩴ۠;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֨᩵۠;)V
    .locals 3

    .line 1602
    iget-object v0, p1, Ll/֨᩵۠;->᩺:Ll/۠֡֨;

    if-eqz v0, :cond_1

    .line 1603
    iget-object v0, p1, Ll/֨᩵۠;->ܰ:Ll/ᩳ᩶۠;

    sget-object v1, Ll/ܽ᩶۠;->۬:Ll/ܽ᩶۠;

    const-string v2, "package-info"

    .line 1544
    invoke-interface {v0, v2, v1}, Ll/ᩳ᩶۠;->֫(Ljava/lang/String;Ll/ܽ᩶۠;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1604
    iget-object v0, p1, Ll/֨᩵۠;->᩺:Ll/۠֡֨;

    iget-object v0, v0, Ll/۠֡֨;->ܰ:Ll/ܳ֡֨;

    invoke-virtual {v0}, Ll/ܳ֡֨;->᩺֫()V

    .line 1606
    :cond_0
    iget-object v0, p1, Ll/֨᩵۠;->᩺:Ll/۠֡֨;

    invoke-virtual {v0}, Ll/۠֡֨;->ۗ֫()V

    .line 1608
    :cond_1
    iget-object v0, p1, Ll/֨᩵۠;->ܰ:Ll/ᩳ᩶۠;

    sget-object v1, Ll/ܽ᩶۠;->۬:Ll/ܽ᩶۠;

    const-string v2, "module-info"

    .line 1552
    invoke-interface {v0, v2, v1}, Ll/ᩳ᩶۠;->֫(Ljava/lang/String;Ll/ܽ᩶۠;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 1609
    iget-object v0, p1, Ll/֨᩵۠;->ۛ:Ll/֡֡֨;

    .line 1089
    iput-object v1, v0, Ll/֡֡֨;->ۨ:Ll/ۖܶ۠;

    .line 1090
    iput-object v1, v0, Ll/֡֡֨;->᩻֫:Ll/ۖܶ۠;

    .line 1091
    iput-object v1, v0, Ll/֡֡֨;->ܰ:Ll/ۖܶ۠;

    .line 1092
    iput-object v1, v0, Ll/֡֡֨;->ܿ֫:Ll/ۖܶ۠;

    .line 1093
    iput-object v1, v0, Ll/֡֡֨;->ۡ֫:Ll/ۖܶ۠;

    .line 1094
    iput-object v1, v0, Ll/֡֡֨;->ۘ֫:Ljava/util/Map;

    .line 1610
    new-instance v2, Ll/ܳᩴ۠;

    invoke-direct {v2, p0, p1}, Ll/ܳᩴ۠;-><init>(Ll/ۜᩴ۠;Ll/֨᩵۠;)V

    iput-object v2, v0, Ll/ۛ֡֨;->᩸:Ll/ۜ֡֨;

    .line 1611
    iget-object v0, v0, Ll/֡֡֨;->֫֫:Ll/ܳ֡֨;

    invoke-virtual {v0}, Ll/ܳ֡֨;->᩺֫()V

    .line 1612
    iget-object v0, p1, Ll/֨᩵۠;->ۛ:Ll/֡֡֨;

    iget-object v0, v0, Ll/֡֡֨;->֫֫:Ll/ܳ֡֨;

    invoke-static {v0}, Ll/ܰ᩵֨;->ۜ(Ll/ۛ֡֨;)Ll/ܰ᩵֨;

    move-result-object v2

    iput-object v2, v0, Ll/ܳ֡֨;->֫֫:Ll/ܰ᩵֨;

    .line 1614
    :cond_2
    iput-object v1, p1, Ll/֨᩵۠;->᩺:Ll/۠֡֨;

    .line 1615
    iput-object p1, p0, Ll/ۜᩴ۠;->ۧ:Ll/֨᩵۠;

    .line 66
    :try_start_0
    iget-object p1, p1, Ll/֨᩵۠;->ۗ:Ll/ۖܶ۠;

    invoke-virtual {p0, p1}, Ll/ܳ֨۠;->֫(Ll/ۖܶ۠;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1619
    iput-object v1, p0, Ll/ۜᩴ۠;->ۧ:Ll/֨᩵۠;

    return-void

    :catchall_0
    move-exception p1

    iput-object v1, p0, Ll/ۜᩴ۠;->ۧ:Ll/֨᩵۠;

    .line 1620
    throw p1
.end method

.method public final ֫(Ll/ۚ᩵۠;)V
    .locals 7

    .line 1623
    invoke-super {p0, p1}, Ll/ܳ֨۠;->֫(Ll/ۚ᩵۠;)V

    .line 1625
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v0

    .line 1626
    iget-object v1, p1, Ll/ۚ᩵۠;->ۗ:Ll/ۖܶ۠;

    .line 1627
    :goto_0
    invoke-virtual {v1}, Ll/ۖܶ۠;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v2, Ll/ۚۚ۠;

    sget-object v3, Ll/ᩴۚ۠;->۟֫:Ll/ᩴۚ۠;

    invoke-virtual {v2, v3}, Ll/ۚۚ۠;->֫(Ll/ᩴۚ۠;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 1628
    iget-object v2, v1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v2, Ll/ۚۚ۠;

    invoke-virtual {v0, v2}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v0

    .line 1629
    iget-object v1, v1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_0

    .line 1631
    :cond_0
    invoke-virtual {v1}, Ll/ۖܶ۠;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, v1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v2, Ll/ۡ֡۠;

    iget-object v2, v2, Ll/ۡ֡۠;->ۤ:Ll/ۖ֡۠;

    iget-wide v2, v2, Ll/ۖ֡۠;->۬:J

    const-wide v4, 0x1000000000L

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-eqz v6, :cond_2

    .line 1633
    iget-object v1, v1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    .line 1634
    :goto_1
    invoke-virtual {v0}, Ll/ۖܶ۠;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1635
    iget-object v2, v0, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v2, Ll/ۚۚ۠;

    invoke-virtual {v1, v2}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v1

    .line 1636
    iget-object v0, v0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_1

    .line 1638
    :cond_1
    iput-object v1, p1, Ll/ۚ᩵۠;->ۗ:Ll/ۖܶ۠;

    .line 1640
    :cond_2
    iget-object v0, p1, Ll/ۚ᩵۠;->᩺:Ll/ܳ֡֨;

    if-eqz v0, :cond_4

    .line 1641
    new-instance v1, Ll/ۖᩴ۠;

    iget-object v2, p0, Ll/ۜᩴ۠;->֫:Ll/֨ᩴ۠;

    iget-object v3, p0, Ll/ۜᩴ۠;->ۧ:Ll/֨᩵۠;

    invoke-direct {v1, v2, v3}, Ll/ۖᩴ۠;-><init>(Ll/֨ᩴ۠;Ll/֨᩵۠;)V

    iput-object v1, v0, Ll/ۛ֡֨;->᩸:Ll/ۜ֡֨;

    .line 1642
    invoke-virtual {v0}, Ll/ܳ֡֨;->۫֫()Ll/ۖܶ۠;

    move-result-object v0

    .line 1643
    invoke-virtual {v0}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸֡֨;

    .line 1644
    invoke-virtual {v1}, Ll/᩸֡֨;->۬֫()Ll/ۖܶ۠;

    move-result-object v1

    .line 1645
    invoke-static {v1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v1

    new-instance v2, Ll/᩻ᩴ۠;

    invoke-direct {v2, p0}, Ll/᩻ᩴ۠;-><init>(Ll/ۜᩴ۠;)V

    invoke-interface {v1, v2}, Ll/ܿ᩺ᩴ;->forEach(Ljava/util/function/Consumer;)V

    goto :goto_2

    .line 1648
    :cond_3
    iget-object v0, p1, Ll/ۚ᩵۠;->᩺:Ll/ܳ֡֨;

    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v1

    iput-object v1, v0, Ll/ܳ֡֨;->ۧ֫:Ll/ۖܶ۠;

    :cond_4
    const/4 v0, 0x0

    .line 1650
    iput-object v0, p1, Ll/ۚ᩵۠;->᩺:Ll/ܳ֡֨;

    return-void
.end method

.method public final ֫(Ll/ۛ᩵۠;)V
    .locals 1

    const/4 v0, 0x0

    .line 1683
    iput-object v0, p1, Ll/ۛ᩵۠;->۫:Ll/ۛ֡֨;

    .line 331
    iget-object p1, p1, Ll/ۛ᩵۠;->۬:Ll/۫᩵۠;

    invoke-virtual {p0, p1}, Ll/ۜᩴ۠;->ۧ(Ll/ۚۚ۠;)V

    return-void
.end method

.method public final ֫(Ll/ۜۚ۠;)V
    .locals 1

    const/4 v0, 0x0

    .line 1675
    iput-object v0, p1, Ll/֨֡۠;->۬:Ll/֨֡֨;

    .line 288
    iget-object p1, p1, Ll/ۜۚ۠;->۫:Ll/۫᩵۠;

    invoke-virtual {p0, p1}, Ll/ۜᩴ۠;->ۧ(Ll/ۚۚ۠;)V

    return-void
.end method

.method public final ֫(Ll/۟᩵۠;)V
    .locals 1

    const/4 v0, 0x0

    .line 1687
    iput-object v0, p1, Ll/۟᩵۠;->۬:Ll/ۛ֡֨;

    return-void
.end method

.method public final ֫(Ll/ۡ֡۠;)V
    .locals 4

    .line 1654
    invoke-static {p1}, Ll/۟ۚ۠;->ܺ(Ll/ۚۚ۠;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Ll/ۡ֡۠;->۟:Ll/ۘ֡֨;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    invoke-virtual {v0}, Ll/ۛ֡֨;->ܺ֫()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Ll/ۡ֡۠;->ۗ:Ll/ۖ᩵۠;

    iget-object v0, v0, Ll/ۖ᩵۠;->۫:Ll/ۖܶ۠;

    .line 1655
    invoke-virtual {v0}, Ll/ۖܶ۠;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Ll/ۡ֡۠;->ۗ:Ll/ۖ᩵۠;

    iget-object v0, v0, Ll/ۖ᩵۠;->۫:Ll/ۖܶ۠;

    iget-object v0, v0, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ۚۚ۠;

    invoke-static {v0}, Ll/۟ۚ۠;->ۚ(Ll/ۚۚ۠;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Ll/ۡ֡۠;->ۗ:Ll/ۖ᩵۠;

    iget-object v1, v0, Ll/ۖ᩵۠;->۫:Ll/ۖܶ۠;

    iget-object v2, v1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v2, Ll/ۨ֡۠;

    iget v2, v2, Ll/ۚۚ۠;->᩸:I

    iget v3, v0, Ll/ۚۚ۠;->᩸:I

    if-ne v2, v3, :cond_0

    .line 1657
    iget-object v1, v1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    iput-object v1, v0, Ll/ۖ᩵۠;->۫:Ll/ۖܶ۠;

    :cond_0
    const/4 v0, 0x0

    .line 1659
    iput-object v0, p1, Ll/ۡ֡۠;->۟:Ll/ۘ֡֨;

    .line 1660
    invoke-super {p0, p1}, Ll/ܳ֨۠;->֫(Ll/ۡ֡۠;)V

    return-void
.end method

.method public final ֫(Ll/ۡ᩵۠;)V
    .locals 1

    const/4 v0, 0x0

    .line 1679
    iput-object v0, p1, Ll/֨֡۠;->۬:Ll/֨֡֨;

    .line 1680
    invoke-super {p0, p1}, Ll/ܳ֨۠;->֫(Ll/ۡ᩵۠;)V

    return-void
.end method

.method public final ֫(Ll/ۢۚ۠;)V
    .locals 1

    const/4 v0, 0x0

    .line 1663
    iput-object v0, p1, Ll/ۢۚ۠;->᩺:Ll/۫֡֨;

    .line 1664
    invoke-super {p0, p1}, Ll/ܳ֨۠;->֫(Ll/ۢۚ۠;)V

    return-void
.end method

.method public final ֫(Ll/ۢ᩵۠;)V
    .locals 1

    const/4 v0, 0x0

    .line 1671
    iput-object v0, p1, Ll/֨֡۠;->۬:Ll/֨֡֨;

    .line 1672
    invoke-super {p0, p1}, Ll/ܳ֨۠;->֫(Ll/ۢ᩵۠;)V

    return-void
.end method

.method public final ֫(Ll/ܿ᩵۠;)V
    .locals 1

    const/4 v0, 0x0

    .line 1691
    iput-object v0, p1, Ll/ܿ᩵۠;->۫:Ll/ܽۘ֨;

    .line 1692
    invoke-super {p0, p1}, Ll/ܳ֨۠;->֫(Ll/ܿ᩵۠;)V

    return-void
.end method

.method public final ֫(Ll/᩵֡۠;)V
    .locals 1

    const/4 v0, 0x0

    .line 1667
    iput-object v0, p1, Ll/᩵֡۠;->ۤ:Ll/ۛ֡֨;

    .line 1668
    invoke-super {p0, p1}, Ll/ܳ֨۠;->֫(Ll/᩵֡۠;)V

    return-void
.end method

.method public final ۧ(Ll/ۚۚ۠;)V
    .locals 1

    .line 1596
    invoke-super {p0, p1}, Ll/ܳ֨۠;->ۧ(Ll/ۚۚ۠;)V

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 1598
    iput-object v0, p1, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    :cond_0
    return-void
.end method
