.class public final Ll/᩷ۡܿ;
.super Ljava/lang/Object;
.source "O700"


# instance fields
.field public volatile ֫:Ll/᩺ۢܿ;

.field public final ۧ:Ll/ܿۡܿ;

.field public final ܳ:Ll/ܽܺܿ;

.field public final ܽ:Ll/ܳۡܿ;

.field public final ܿ:Ll/ۜۡܿ;

.field public final ᩳ:Ll/۫ۨᩳ;

.field public final ᩻:Ll/᩻ܺܿ;


# direct methods
.method public constructor <init>(Ll/۫ۨᩳ;Ll/᩶۫᩷;)V
    .locals 1

    .line 182
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance p2, Ll/ܳۡܿ;

    .line 41
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p2, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    .line 35
    new-instance p2, Ll/ۜۡܿ;

    .line 104
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 116
    iput v0, p2, Ll/ۜۡܿ;->ۖ:I

    .line 117
    iput v0, p2, Ll/ۜۡܿ;->ۢ:I

    .line 130
    iput v0, p2, Ll/ۜۡܿ;->᩹:I

    .line 131
    iput v0, p2, Ll/ۜۡܿ;->ܶ:I

    .line 137
    iput v0, p2, Ll/ۜۡܿ;->ܳ:I

    .line 138
    iput v0, p2, Ll/ۜۡܿ;->ᩳ:I

    .line 35
    iput-object p2, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    .line 36
    new-instance p2, Ll/ܿۡܿ;

    .line 148
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 151
    sget-object v0, Ll/᩺ۖܿ;->ۧ:Ll/᩺ۖܿ;

    iput-object v0, p2, Ll/ܿۡܿ;->ۡ:Ll/᩺ۖܿ;

    .line 160
    iput-object v0, p2, Ll/ܿۡܿ;->ܽ:Ll/᩺ۖܿ;

    .line 36
    iput-object p2, p0, Ll/᩷ۡܿ;->ۧ:Ll/ܿۡܿ;

    .line 2055
    new-instance p2, Ll/᩻ܺܿ;

    .line 547
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 2055
    iput-object p2, p0, Ll/᩷ۡܿ;->᩻:Ll/᩻ܺܿ;

    .line 183
    iput-object p1, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    .line 184
    new-instance p2, Ll/֫ۡܿ;

    invoke-direct {p2, p1}, Ll/֫ۡܿ;-><init>(Ll/۫ۨᩳ;)V

    new-instance v0, Ll/ۧۡܿ;

    invoke-direct {v0, p0, p1}, Ll/ۧۡܿ;-><init>(Ll/᩷ۡܿ;Ll/۫ۨᩳ;)V

    new-instance p1, Ll/ܽܺܿ;

    invoke-direct {p1, p2, v0}, Ll/ܽܺܿ;-><init>(Ll/֫ۡܿ;Ll/۫ۡܿ;)V

    iput-object p1, p0, Ll/᩷ۡܿ;->ܳ:Ll/ܽܺܿ;

    const/4 p1, 0x0

    .line 212
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->֫(Ll/ܶۜܿ;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩷ۡܿ;)Ll/ܿۡܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷ۡܿ;->ۧ:Ll/ܿۡܿ;

    return-object p0
.end method

.method private ֫(Ll/᩶᩸ᩳ;ILl/᩺ۖܿ;)Ll/ᩳۡܿ;
    .locals 10

    .line 1798
    iget-object v0, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v7, v0, Ll/ܳۡܿ;->᩷:Ll/ۢۖܿ;

    if-eqz v7, :cond_0

    .line 1802
    new-instance v0, Ll/ᩳۡܿ;

    .line 2184
    iget-object v1, p0, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    invoke-virtual {v1}, Ll/᩺ۢܿ;->֫()Ll/ܶۜܿ;

    move-result-object v4

    .line 1802
    iget-object v1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v6, v1, Ll/ܳۡܿ;->ۡ:Ll/۟ۖܿ;

    iget v8, v1, Ll/ܳۡܿ;->ᩳ:I

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move v5, p2

    move-object v9, p3

    invoke-direct/range {v1 .. v9}, Ll/ᩳۡܿ;-><init>(Ll/᩷ۡܿ;Ll/᩶᩸ᩳ;Ll/ܶۜܿ;ILl/۟ۖܿ;Ll/ۢۖܿ;ILl/᩺ۖܿ;)V

    return-object v0

    .line 1800
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Syntax display is not initialized"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ֫(Ll/᩶᩸ᩳ;IIIILl/ܶۜܿ;)Ll/᩺ۖܿ;
    .locals 5

    .line 1236
    sget-object v0, Ll/᩺ۖܿ;->ۧ:Ll/᩺ۖܿ;

    iget-object v1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v2, v1, Ll/ܳۡܿ;->ۡ:Ll/۟ۖܿ;

    const/4 v3, -0x1

    if-eqz v2, :cond_1

    .line 1238
    invoke-interface {p1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result p6

    .line 1239
    iget-object v1, p0, Ll/᩷ۡܿ;->ۧ:Ll/ܿۡܿ;

    iget-object v4, v1, Ll/ܿۡܿ;->ܺ:Ll/᩶᩸ᩳ;

    if-ne v4, p1, :cond_0

    iget p1, v1, Ll/ܿۡܿ;->᩷:I

    add-int/lit8 p1, p1, 0x1

    if-ne p1, p6, :cond_0

    iget p1, v1, Ll/ܿۡܿ;->ۖ:I

    if-ne p1, p2, :cond_0

    .line 1242
    iget-object v0, v1, Ll/ܿۡܿ;->ۡ:Ll/᩺ۖܿ;

    goto :goto_1

    .line 1243
    :cond_0
    invoke-virtual {v2}, Ll/۟ۖܿ;->᩻()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 1246
    invoke-virtual {v2}, Ll/۟ۖܿ;->ۧ()I

    move-result p1

    invoke-virtual {v2}, Ll/۟ۖܿ;->֫()I

    move-result p6

    .line 1245
    invoke-static {v3, v3, p1, p6}, Ll/᩺ۖܿ;->ۧ(IIII)Ll/᩺ۖܿ;

    move-result-object v0

    goto :goto_1

    .line 1251
    :cond_1
    iget-object p1, v1, Ll/ܳۡܿ;->᩷:Ll/ۢۖܿ;

    const/4 v1, 0x0

    if-eqz p1, :cond_4

    .line 1252
    invoke-virtual {p1}, Ll/ۢۖܿ;->֫()I

    move-result v2

    if-ne v2, p2, :cond_4

    .line 1254
    invoke-virtual {p6}, Ll/ܶۜܿ;->ܳ()Ll/᩸᩷ܿ;

    move-result-object p6

    if-nez p2, :cond_2

    .line 1917
    invoke-static {}, Ll/ۢۖܿ;->ܽ()Ll/ۢۖܿ;

    move-result-object p6

    goto :goto_0

    .line 1919
    :cond_2
    invoke-static {p2, p6, v1}, Ll/ۢۖܿ;->֫(ILl/᩸᩷ܿ;Z)Ll/ۢۖܿ;

    move-result-object p6

    .line 1253
    :goto_0
    invoke-virtual {p1, p6}, Ll/ۢۖܿ;->ۧ(Ll/ۢۖܿ;)Ll/ܳۖܿ;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_1

    .line 1258
    :cond_3
    invoke-virtual {p1}, Ll/ܳۖܿ;->ܽ()I

    move-result p6

    invoke-virtual {p1}, Ll/ܳۖܿ;->֫()I

    move-result p1

    .line 1257
    invoke-static {v3, v3, p6, p1}, Ll/᩺ۖܿ;->ۧ(IIII)Ll/᩺ۖܿ;

    move-result-object v0

    goto :goto_1

    .line 1261
    :cond_4
    invoke-static {v3, v3, v1, p2}, Ll/᩺ۖܿ;->ۧ(IIII)Ll/᩺ۖܿ;

    move-result-object v0

    .line 1265
    :cond_5
    :goto_1
    invoke-virtual {v0, p2, p3, p4, p5}, Ll/᩺ۖܿ;->֫(IIII)Ll/᩺ۖܿ;

    move-result-object p1

    return-object p1
.end method

.method private ֫(Ll/᩶᩸ᩳ;ILl/᩺ۖܿ;Ll/ܽۡܿ;)Ll/᩺ۖܿ;
    .locals 3

    .line 1035
    invoke-direct {p0, p1, p2}, Ll/᩷ۡܿ;->֫(Ll/᩶᩸ᩳ;I)Z

    move-result v0

    .line 1036
    iget-object v1, p0, Ll/᩷ۡܿ;->ۧ:Ll/ܿۡܿ;

    if-nez v0, :cond_0

    const/4 v2, 0x0

    .line 1037
    iput-boolean v2, v1, Ll/ܿۡܿ;->֫:Z

    .line 1038
    iput-boolean v2, v1, Ll/ܿۡܿ;->ۜ:Z

    .line 1040
    :cond_0
    sget-object v2, Ll/ܽۡܿ;->᩶:Ll/ܽۡܿ;

    if-ne p4, v2, :cond_1

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    .line 1043
    iget-object p4, v1, Ll/ܿۡܿ;->ܽ:Ll/᩺ۖܿ;

    invoke-virtual {p4, p3}, Ll/᩺ۖܿ;->֫(Ll/᩺ۖܿ;)Ll/᩺ۖܿ;

    move-result-object p3

    .line 1044
    :cond_2
    :goto_0
    iput-object p3, v1, Ll/ܿۡܿ;->ܽ:Ll/᩺ۖܿ;

    const/4 p4, 0x1

    .line 1045
    iput-boolean p4, v1, Ll/ܿۡܿ;->᩻:Z

    .line 1046
    iput p2, v1, Ll/ܿۡܿ;->ᩳ:I

    .line 1047
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p2

    iput p2, v1, Ll/ܿۡܿ;->ܳ:I

    .line 1048
    iput-object p1, v1, Ll/ܿۡܿ;->ܿ:Ll/᩶᩸ᩳ;

    return-object p3
.end method

.method private ֫(Ll/ۙۡܿ;)V
    .locals 8

    .line 1687
    iget-object v1, p0, Ll/᩷ۡܿ;->ܳ:Ll/ܽܺܿ;

    .line 1688
    invoke-virtual {v1, p1}, Ll/ܽܺܿ;->֫(Ll/ۙۡܿ;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    :cond_0
    move-object v0, p0

    .line 1695
    monitor-enter v0

    .line 1696
    :try_start_0
    iget-object v2, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget-object v2, v2, Ll/ۜۡܿ;->۠:Ll/᩶᩸ᩳ;

    .line 1697
    invoke-virtual {p1}, Ll/ۙۡܿ;->ܿ()I

    move-result v3

    .line 1698
    invoke-virtual {p1}, Ll/ۙۡܿ;->ᩳ()I

    move-result v4

    .line 1699
    invoke-virtual {v1, p1}, Ll/ܽܺܿ;->֫(Ll/ۙۡܿ;)Z

    move-result v1

    if-eqz v1, :cond_5

    if-eqz v2, :cond_5

    iget-object v1, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    if-ne v1, v2, :cond_5

    .line 1700
    invoke-virtual {p1}, Ll/ۙۡܿ;->ۧ()I

    move-result v1

    invoke-interface {v2}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v5

    if-ne v1, v5, :cond_5

    .line 1701
    invoke-virtual {p1}, Ll/ۙۡܿ;->ܽ()I

    move-result v1

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-ne v1, v5, :cond_5

    iget-object v1, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget v5, v1, Ll/ۜۡܿ;->ۖ:I

    if-ne v3, v5, :cond_5

    iget v5, v1, Ll/ۜۡܿ;->ۢ:I

    if-ne v4, v5, :cond_5

    iget v1, v1, Ll/ۜۡܿ;->ۡ:I

    .line 1703
    invoke-virtual {p1}, Ll/ۙۡܿ;->ۧ()I

    move-result v5

    if-ne v1, v5, :cond_5

    iget-object v1, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget v1, v1, Ll/ۜۡܿ;->ۘ:I

    .line 1704
    invoke-virtual {p1}, Ll/ۙۡܿ;->ܽ()I

    move-result v5

    if-eq v1, v5, :cond_1

    goto :goto_2

    .line 1707
    :cond_1
    invoke-virtual {p1}, Ll/ۙۡܿ;->֫()Ll/ۗۡܿ;

    move-result-object v1

    .line 1708
    sget-object v5, Ll/ۗۡܿ;->۬:Ll/ۗۡܿ;

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-ne v1, v5, :cond_2

    .line 1710
    iget-object p1, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iput-boolean v7, p1, Ll/ۜۡܿ;->ܺ:Z

    .line 1711
    iget-object v1, p1, Ll/ۜۡܿ;->֡:Ll/᩶᩸ᩳ;

    if-ne v1, v2, :cond_3

    iget-boolean p1, p1, Ll/ۜۡܿ;->ᩴ:Z

    if-eqz p1, :cond_3

    .line 1713
    invoke-direct {p0}, Ll/᩷ۡܿ;->ۗ()V

    const/4 v6, 0x1

    goto :goto_0

    .line 1717
    :cond_2
    invoke-direct {p0}, Ll/᩷ۡܿ;->ۙ()V

    .line 1718
    iget-object v1, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iput v3, v1, Ll/ۜۡܿ;->ܳ:I

    .line 1719
    iput v4, v1, Ll/ۜۡܿ;->ᩳ:I

    .line 1720
    invoke-virtual {p1}, Ll/ۙۡܿ;->ۧ()I

    move-result v3

    iput v3, v1, Ll/ۜۡܿ;->ܿ:I

    .line 1721
    iget-object v1, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    invoke-virtual {p1}, Ll/ۙۡܿ;->ܽ()I

    move-result p1

    iput p1, v1, Ll/ۜۡܿ;->ۜ:I

    .line 1722
    iget-object p1, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iput-object v2, p1, Ll/ۜۡܿ;->᩻:Ll/᩶᩸ᩳ;

    .line 1725
    iget-object p1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    const/4 v1, 0x0

    iput-object v1, p1, Ll/ܳۡܿ;->ۜ:Ll/ۘܺܿ;

    .line 1726
    invoke-direct {p0, v6, v7, v7}, Ll/᩷ۡܿ;->֫(ZZZ)V

    .line 1728
    :cond_3
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v6, :cond_4

    .line 1730
    invoke-direct {p0, v2}, Ll/᩷ۡܿ;->ۘ(Ll/᩶᩸ᩳ;)Z

    :cond_4
    :goto_1
    return-void

    .line 1705
    :cond_5
    :goto_2
    :try_start_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 1728
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private ֫(Ll/ۛۡܿ;)V
    .locals 13

    .line 1515
    iget-object v1, p0, Ll/᩷ۡܿ;->ܳ:Ll/ܽܺܿ;

    .line 1516
    invoke-virtual {v1, p1}, Ll/ܽܺܿ;->֫(Ll/ۛۡܿ;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    .line 1521
    :cond_0
    invoke-virtual {p1}, Ll/ۛۡܿ;->ᩳ()Ll/ܺۖܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܺۖܿ;->ܽ()Ll/ۢۖܿ;

    move-result-object v3

    move-object v0, p0

    .line 1524
    monitor-enter v0

    .line 1525
    :try_start_0
    iget-object v2, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget-object v10, v2, Ll/ۜۡܿ;->۠:Ll/᩶᩸ᩳ;

    .line 2190
    iget-object v2, p0, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    invoke-virtual {v2}, Ll/᩺ۢܿ;->ۧ()Ll/᩺ܺܿ;

    move-result-object v2

    .line 1527
    invoke-virtual {v1, p1}, Ll/ܽܺܿ;->֫(Ll/ۛۡܿ;)Z

    move-result v1

    if-eqz v1, :cond_a

    if-eqz v10, :cond_a

    .line 1528
    invoke-virtual {p1}, Ll/ۛۡܿ;->ᩳ()Ll/ܺۖܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺۖܿ;->ۧ()Ll/᩺ܺܿ;

    move-result-object v1

    if-ne v1, v2, :cond_a

    iget-object v1, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    .line 1529
    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    if-ne v1, v10, :cond_a

    .line 1530
    invoke-virtual {p1}, Ll/ۛۡܿ;->ܽ()I

    move-result v1

    invoke-interface {v10}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v4

    if-ne v1, v4, :cond_a

    .line 1531
    invoke-virtual {p1}, Ll/ۛۡܿ;->ܿ()I

    move-result v1

    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-ne v1, v4, :cond_a

    .line 1532
    invoke-virtual {v3}, Ll/ۢۖܿ;->֫()I

    move-result v1

    invoke-virtual {p1}, Ll/ۛۡܿ;->ܿ()I

    move-result v4

    if-ne v1, v4, :cond_a

    iget-object v1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget v1, v1, Ll/ܳۡܿ;->ᩳ:I

    .line 1533
    invoke-virtual {p1}, Ll/ۛۡܿ;->ۧ()I

    move-result v4

    if-eq v1, v4, :cond_1

    goto/16 :goto_5

    .line 1536
    :cond_1
    iget-object v1, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget-object v4, v1, Ll/ۜۡܿ;->֡:Ll/᩶᩸ᩳ;

    if-ne v4, v10, :cond_3

    .line 1537
    iget-boolean v4, v1, Ll/ۜۡܿ;->ᩴ:Z

    if-nez v4, :cond_2

    .line 1539
    iput-object p1, v1, Ll/ۜۡܿ;->᩵:Ll/ۛۡܿ;

    .line 1540
    monitor-exit v0

    return-void

    .line 1542
    :cond_2
    invoke-direct {p0}, Ll/᩷ۡܿ;->ۗ()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_6

    .line 1544
    :cond_3
    :goto_0
    iget-object v1, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object v1, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ܽܽ()Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object v1, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    .line 1545
    invoke-virtual {v1}, Ll/۫ۨᩳ;->᩹ۧ()Z

    move-result v1

    if-eqz v1, :cond_4

    goto/16 :goto_4

    .line 1550
    :cond_4
    iget-object v1, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    const/4 v11, 0x0

    iput-boolean v11, v1, Ll/ۜۡܿ;->֨:Z

    .line 1551
    invoke-virtual {p1}, Ll/ۛۡܿ;->ܳ()Z

    move-result v1

    const/4 v12, 0x0

    if-nez v1, :cond_6

    .line 1552
    invoke-virtual {v3}, Ll/ۢۖܿ;->֫()I

    move-result v1

    if-nez v1, :cond_5

    move-object v1, v12

    goto :goto_1

    .line 1553
    :cond_5
    new-instance v1, Ll/ܳۖܿ;

    invoke-virtual {v3}, Ll/ۢۖܿ;->֫()I

    move-result v4

    invoke-direct {v1, v11, v4}, Ll/ܳۖܿ;-><init>(II)V

    goto :goto_1

    .line 1554
    :cond_6
    invoke-virtual {p1}, Ll/ۛۡܿ;->֫()Ll/ܳۖܿ;

    move-result-object v1

    .line 1555
    :goto_1
    invoke-virtual {p1}, Ll/ۛۡܿ;->ᩳ()Ll/ܺۖܿ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ܺۖܿ;->֫()Ll/ᩳۢܿ;

    move-result-object v4

    .line 1556
    invoke-virtual {v2}, Ll/᩺ܺܿ;->ᩳ()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/4 v9, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v2, p0

    .line 1555
    invoke-direct/range {v2 .. v9}, Ll/᩷ۡܿ;->֫(Ll/ۢۖܿ;Ll/ᩳۢܿ;ZLl/۟ۖܿ;ZLjava/lang/Integer;Z)V

    .line 1557
    invoke-direct {p0}, Ll/᩷ۡܿ;->᩸()V

    .line 954
    iget-object v2, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    const/4 v3, -0x1

    iput v3, v2, Ll/ۜۡܿ;->᩹:I

    .line 955
    iput v3, v2, Ll/ۜۡܿ;->ܶ:I

    .line 956
    iput v11, v2, Ll/ۜۡܿ;->᩸:I

    .line 957
    iput v11, v2, Ll/ۜۡܿ;->ۙ:I

    .line 958
    iput-object v12, v2, Ll/ۜۡܿ;->᩶:Ll/᩶᩸ᩳ;

    .line 1559
    invoke-direct {p0}, Ll/᩷ۡܿ;->ۙ()V

    .line 1560
    invoke-direct {p0}, Ll/᩷ۡܿ;->᩹()V

    .line 1561
    invoke-direct {p0}, Ll/᩷ۡܿ;->᩶()V

    if-nez v1, :cond_7

    .line 1563
    sget-object v1, Ll/᩺ۖܿ;->ۧ:Ll/᩺ۖܿ;

    goto :goto_2

    .line 1565
    :cond_7
    invoke-virtual {v1}, Ll/ܳۖܿ;->ܽ()I

    move-result v2

    invoke-virtual {v1}, Ll/ܳۖܿ;->֫()I

    move-result v1

    .line 1564
    invoke-static {v3, v3, v2, v1}, Ll/᩺ۖܿ;->ۧ(IIII)Ll/᩺ۖܿ;

    move-result-object v1

    .line 1566
    :goto_2
    invoke-virtual {p1}, Ll/ۛۡܿ;->ܽ()I

    move-result p1

    sget-object v2, Ll/ܽۡܿ;->᩹:Ll/ܽۡܿ;

    invoke-direct {p0, v10, p1, v1, v2}, Ll/᩷ۡܿ;->ۧ(Ll/᩶᩸ᩳ;ILl/᩺ۖܿ;Ll/ܽۡܿ;)Ll/ᩳۡܿ;

    move-result-object p1

    .line 1568
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1757
    iget-object v0, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    if-nez p1, :cond_8

    :goto_3
    return-void

    .line 1760
    :cond_8
    invoke-virtual {v0}, Landroid/view/View;->postInvalidate()V

    .line 1761
    invoke-virtual {v0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 1547
    :cond_9
    :goto_4
    :try_start_1
    iget-object p1, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    const/4 v1, 0x1

    iput-boolean v1, p1, Ll/ۜۡܿ;->֨:Z

    .line 1548
    monitor-exit v0

    return-void

    .line 1534
    :cond_a
    :goto_5
    monitor-exit v0

    return-void

    .line 1568
    :goto_6
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private ֫(Ll/۟ۡܿ;)V
    .locals 15

    move-object v9, p0

    move-object/from16 v0, p1

    .line 1574
    iget-object v1, v9, Ll/᩷ۡܿ;->ܳ:Ll/ܽܺܿ;

    .line 1575
    invoke-virtual {v1, v0}, Ll/ܽܺܿ;->֫(Ll/۟ۡܿ;)Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_2

    .line 1578
    :cond_0
    invoke-virtual/range {p1 .. p1}, Ll/۟ۡܿ;->ܽ()Ll/ܳۘܿ;

    move-result-object v10

    const-string v2, "result"

    .line 53
    invoke-static {v10, v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 54
    invoke-virtual {v10}, Ll/ܳۘܿ;->ۜ()I

    move-result v2

    invoke-virtual {v10}, Ll/ܳۘܿ;->ܳ()I

    move-result v3

    invoke-virtual {v10}, Ll/ܳۘܿ;->᩻()Ll/ۢۖܿ;

    move-result-object v4

    .line 55
    invoke-virtual {v10}, Ll/ܳۘܿ;->ۧ()Ll/ᩳۢܿ;

    move-result-object v5

    invoke-virtual {v10}, Ll/ܳۘܿ;->ᩳ()Ll/᩺ܺܿ;

    move-result-object v6

    iget-object v6, v6, Ll/᩺ܺܿ;->ܿ:Ll/᩸᩷ܿ;

    .line 54
    invoke-static {v2, v3, v4, v5, v6}, Ll/۟ۖܿ;->֫(IILl/ۢۖܿ;Ll/ᩳۢܿ;Ll/᩸᩷ܿ;)Ll/۟ۖܿ;

    move-result-object v5

    move-object v14, p0

    .line 1584
    monitor-enter v14

    .line 1585
    :try_start_0
    iget-object v2, v9, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget-object v11, v2, Ll/ۜۡܿ;->۠:Ll/᩶᩸ᩳ;

    .line 2190
    iget-object v2, v9, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    invoke-virtual {v2}, Ll/᩺ۢܿ;->ۧ()Ll/᩺ܺܿ;

    move-result-object v2

    .line 1587
    invoke-virtual {v1, v0}, Ll/ܽܺܿ;->֫(Ll/۟ۡܿ;)Z

    move-result v1

    if-eqz v1, :cond_a

    if-eqz v11, :cond_a

    .line 1588
    invoke-virtual {v10}, Ll/ܳۘܿ;->ᩳ()Ll/᩺ܺܿ;

    move-result-object v1

    if-ne v1, v2, :cond_a

    iget-object v1, v9, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    if-ne v1, v11, :cond_a

    .line 1589
    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const v3, 0xf4240

    if-le v1, v3, :cond_a

    .line 1590
    invoke-virtual/range {p1 .. p1}, Ll/۟ۡܿ;->ۧ()I

    move-result v1

    invoke-interface {v11}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v3

    if-ne v1, v3, :cond_a

    .line 1591
    invoke-virtual/range {p1 .. p1}, Ll/۟ۡܿ;->ᩳ()I

    move-result v1

    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-ne v1, v3, :cond_a

    .line 1592
    invoke-virtual {v10}, Ll/ܳۘܿ;->᩷()J

    move-result-wide v3

    invoke-virtual/range {p1 .. p1}, Ll/۟ۡܿ;->ۧ()I

    move-result v1

    int-to-long v6, v1

    cmp-long v1, v3, v6

    if-nez v1, :cond_a

    .line 1593
    invoke-virtual {v10}, Ll/ܳۘܿ;->ۜ()I

    move-result v1

    invoke-virtual/range {p1 .. p1}, Ll/۟ۡܿ;->ᩳ()I

    move-result v3

    if-ne v1, v3, :cond_a

    .line 1594
    invoke-virtual {v10}, Ll/ܳۘܿ;->ܳ()I

    move-result v1

    iget-object v3, v9, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget v3, v3, Ll/ۜۡܿ;->ۖ:I

    if-ne v1, v3, :cond_a

    .line 1595
    invoke-virtual {v10}, Ll/ܳۘܿ;->ܽ()I

    move-result v1

    iget-object v3, v9, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget v4, v3, Ll/ۜۡܿ;->ۢ:I

    if-ne v1, v4, :cond_a

    iget v1, v3, Ll/ۜۡܿ;->ۡ:I

    .line 1596
    invoke-virtual/range {p1 .. p1}, Ll/۟ۡܿ;->ۧ()I

    move-result v3

    if-ne v1, v3, :cond_a

    iget-object v1, v9, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget v1, v1, Ll/ۜۡܿ;->ۘ:I

    .line 1597
    invoke-virtual/range {p1 .. p1}, Ll/۟ۡܿ;->ᩳ()I

    move-result v3

    if-ne v1, v3, :cond_a

    iget-object v1, v9, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget v1, v1, Ll/ۜۡܿ;->᩷:I

    .line 1598
    invoke-virtual/range {p1 .. p1}, Ll/۟ۡܿ;->֫()I

    move-result v3

    if-ne v1, v3, :cond_a

    iget-object v1, v9, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget v1, v1, Ll/ܳۡܿ;->ᩳ:I

    .line 1599
    invoke-virtual/range {p1 .. p1}, Ll/۟ۡܿ;->֫()I

    move-result v3

    if-eq v1, v3, :cond_1

    goto/16 :goto_4

    .line 1602
    :cond_1
    iget-object v1, v9, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget-object v3, v1, Ll/ۜۡܿ;->֡:Ll/᩶᩸ᩳ;

    if-ne v3, v11, :cond_3

    .line 1603
    iget-boolean v3, v1, Ll/ۜۡܿ;->ᩴ:Z

    if-nez v3, :cond_2

    .line 1604
    iput-object v0, v1, Ll/ۜۡܿ;->ۚ:Ll/۟ۡܿ;

    .line 1605
    monitor-exit v14

    return-void

    .line 1607
    :cond_2
    invoke-direct {p0}, Ll/᩷ۡܿ;->ۗ()V

    .line 1609
    :cond_3
    iget-object v1, v9, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object v1, v9, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ܽܽ()Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object v1, v9, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    .line 1610
    invoke-virtual {v1}, Ll/۫ۨᩳ;->᩹ۧ()Z

    move-result v1

    if-eqz v1, :cond_4

    goto/16 :goto_3

    .line 1615
    :cond_4
    iget-object v1, v9, Ll/᩷ۡܿ;->ۧ:Ll/ܿۡܿ;

    iget-object v1, v1, Ll/ܿۡܿ;->ۢ:Ll/۟ۖܿ;

    if-eqz v1, :cond_5

    .line 1617
    invoke-virtual {v1}, Ll/۟ۖܿ;->ܽ()Ll/ۢۖܿ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۢۖܿ;->֫()I

    move-result v3

    invoke-virtual {v5}, Ll/۟ۖܿ;->ܽ()Ll/ۢۖܿ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۢۖܿ;->֫()I

    move-result v4

    if-ne v3, v4, :cond_5

    .line 1618
    invoke-virtual {v5, v1}, Ll/۟ۖܿ;->֫(Ll/۟ۖܿ;)Ll/᩺ۖܿ;

    move-result-object v1

    :goto_0
    move-object v12, v1

    goto :goto_1

    .line 1099
    :cond_5
    iget-object v1, v9, Ll/᩷ۡܿ;->ۧ:Ll/ܿۡܿ;

    iget-object v3, v1, Ll/ܿۡܿ;->ܺ:Ll/᩶᩸ᩳ;

    if-ne v3, v11, :cond_6

    iget v3, v1, Ll/ܿۡܿ;->᩷:I

    .line 1100
    invoke-interface {v11}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v4

    if-ne v3, v4, :cond_6

    iget v1, v1, Ll/ܿۡܿ;->ۖ:I

    .line 1101
    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-ne v1, v3, :cond_6

    .line 1620
    iget-object v1, v9, Ll/᩷ۡܿ;->ۧ:Ll/ܿۡܿ;

    iget-object v1, v1, Ll/ܿۡܿ;->ۡ:Ll/᩺ۖܿ;

    .line 1621
    invoke-virtual {v10}, Ll/ܳۘܿ;->ܳ()I

    move-result v3

    invoke-virtual {v10}, Ll/ܳۘܿ;->ܽ()I

    move-result v4

    .line 1620
    invoke-static {v1, v3, v4}, Ll/᩺ۖܿ;->֫(Ll/᩺ۖܿ;II)Ll/᩺ۖܿ;

    move-result-object v1

    goto :goto_0

    .line 1624
    :cond_6
    invoke-virtual {v10}, Ll/ܳۘܿ;->ܳ()I

    move-result v1

    invoke-virtual {v10}, Ll/ܳۘܿ;->ܽ()I

    move-result v3

    const/4 v4, -0x1

    .line 1623
    invoke-static {v4, v4, v1, v3}, Ll/᩺ۖܿ;->ۧ(IIII)Ll/᩺ۖܿ;

    move-result-object v1

    goto :goto_0

    .line 1626
    :goto_1
    invoke-virtual {v5}, Ll/۟ۖܿ;->ܽ()Ll/ۢۖܿ;

    move-result-object v3

    .line 1627
    invoke-virtual {v2}, Ll/᩺ܺܿ;->ᩳ()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v8, 0x1

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v13, 0x1

    move-object v1, p0

    move-object v2, v3

    move-object v3, v4

    move v4, v6

    move v6, v13

    .line 1626
    invoke-direct/range {v1 .. v8}, Ll/᩷ۡܿ;->֫(Ll/ۢۖܿ;Ll/ᩳۢܿ;ZLl/۟ۖܿ;ZLjava/lang/Integer;Z)V

    .line 1628
    invoke-direct {p0, v11}, Ll/᩷ۡܿ;->ۖ(Ll/᩶᩸ᩳ;)Z

    move-result v1

    if-nez v1, :cond_7

    .line 1629
    invoke-virtual {v10}, Ll/ܳۘܿ;->ܳ()I

    move-result v1

    invoke-virtual {v10}, Ll/ܳۘܿ;->ܽ()I

    move-result v2

    invoke-direct {p0, v11, v1, v2}, Ll/᩷ۡܿ;->᩻(Ll/᩶᩸ᩳ;II)V

    .line 1631
    :cond_7
    invoke-direct {p0}, Ll/᩷ۡܿ;->ۙ()V

    .line 1632
    invoke-direct {p0}, Ll/᩷ۡܿ;->᩶()V

    .line 1634
    invoke-virtual/range {p1 .. p1}, Ll/۟ۡܿ;->ۧ()I

    move-result v0

    sget-object v1, Ll/ܽۡܿ;->᩶:Ll/ܽۡܿ;

    invoke-direct {p0, v11, v0, v12, v1}, Ll/᩷ۡܿ;->ۧ(Ll/᩶᩸ᩳ;ILl/᩺ۖܿ;Ll/ܽۡܿ;)Ll/ᩳۡܿ;

    move-result-object v0

    .line 1636
    monitor-exit v14
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1757
    iget-object v1, v9, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    if-nez v0, :cond_8

    :goto_2
    return-void

    .line 1760
    :cond_8
    invoke-virtual {v1}, Landroid/view/View;->postInvalidate()V

    .line 1761
    invoke-virtual {v1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 1612
    :cond_9
    :goto_3
    :try_start_1
    iget-object v0, v9, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    const/4 v1, 0x1

    iput-boolean v1, v0, Ll/ۜۡܿ;->ܺ:Z

    .line 1613
    monitor-exit v14

    return-void

    .line 1600
    :cond_a
    :goto_4
    monitor-exit v14

    return-void

    :catchall_0
    move-exception v0

    .line 1636
    monitor-exit v14
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private ֫(Ll/ۢۖܿ;Ll/ᩳۢܿ;ZLl/۟ۖܿ;Z)V
    .locals 10

    .line 1417
    iget-object v0, p0, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    .line 1418
    :cond_0
    invoke-virtual {v0}, Ll/᩺ۢܿ;->ۧ()Ll/᩺ܺܿ;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    :goto_1
    move-object v8, v1

    goto :goto_2

    .line 1420
    :cond_1
    invoke-virtual {v0}, Ll/᩺ܺܿ;->ᩳ()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_1

    :goto_2
    const/4 v9, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move-object v6, p4

    move v7, p5

    .line 1430
    invoke-direct/range {v2 .. v9}, Ll/᩷ۡܿ;->֫(Ll/ۢۖܿ;Ll/ᩳۢܿ;ZLl/۟ۖܿ;ZLjava/lang/Integer;Z)V

    return-void
.end method

.method private ֫(Ll/ۢۖܿ;Ll/ᩳۢܿ;ZLl/۟ۖܿ;ZLjava/lang/Integer;Z)V
    .locals 8

    if-eqz p4, :cond_1

    .line 1442
    invoke-virtual {p4}, Ll/۟ۖܿ;->ܽ()Ll/ۢۖܿ;

    move-result-object v0

    if-ne v0, p1, :cond_0

    goto :goto_0

    .line 1443
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Window projection does not own visible store"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-eqz p3, :cond_3

    if-eqz p1, :cond_2

    if-eqz p2, :cond_2

    if-nez p4, :cond_2

    .line 1446
    invoke-virtual {p2}, Ll/ᩳۢܿ;->ۧ()I

    move-result v0

    invoke-virtual {p1}, Ll/ۢۖܿ;->֫()I

    move-result v1

    if-ne v0, v1, :cond_2

    goto :goto_1

    .line 1447
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid complete syntax display"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    if-nez p3, :cond_5

    if-nez p2, :cond_4

    goto :goto_2

    .line 1450
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Incomplete syntax display cannot expose full contexts"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_2
    if-eqz p5, :cond_6

    .line 1453
    invoke-direct {p0}, Ll/᩷ۡܿ;->۠()V

    goto :goto_3

    .line 1455
    :cond_6
    invoke-direct {p0}, Ll/᩷ۡܿ;->ܶ()V

    .line 1461
    :goto_3
    iget-object p5, p0, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    const/4 v0, 0x0

    if-nez p5, :cond_7

    move-object p5, v0

    goto :goto_4

    .line 1462
    :cond_7
    invoke-virtual {p5}, Ll/᩺ۢܿ;->ۧ()Ll/᩺ܺܿ;

    move-result-object p5

    .line 1463
    :goto_4
    iget-object v1, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v7

    .line 1464
    iget-object v1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v1, v1, Ll/ܳۡܿ;->ۜ:Ll/ۘܺܿ;

    if-eqz v1, :cond_a

    .line 1466
    iget-object v2, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    if-nez p3, :cond_9

    if-eqz p1, :cond_9

    .line 1467
    invoke-interface {v7}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v3

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v4

    invoke-virtual {v1, v7, p5, v3, v4}, Ll/ۘܺܿ;->֫(Ljava/lang/Object;Ll/᩺ܺܿ;II)Z

    move-result v3

    if-nez v3, :cond_8

    goto :goto_5

    .line 1468
    :cond_8
    invoke-virtual {v1, p4}, Ll/ۘܺܿ;->֫(Ll/۟ۖܿ;)Ll/ۘܺܿ;

    move-result-object v1

    goto :goto_6

    :cond_9
    :goto_5
    move-object v1, v0

    :goto_6
    iput-object v1, v2, Ll/ܳۡܿ;->ۜ:Ll/ۘܺܿ;

    :cond_a
    if-eqz p5, :cond_e

    if-eqz p1, :cond_e

    if-eqz p3, :cond_b

    .line 1473
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1472
    invoke-static {v7, p5, p1, p2}, Ll/ۜۢܿ;->֫(Ll/۟᩺ᩳ;Ll/᩺ܺܿ;Ll/ۢۖܿ;Ll/ᩳۢܿ;)Ll/ۜۢܿ;

    move-result-object v1

    goto :goto_7

    :cond_b
    if-eqz p4, :cond_c

    .line 1474
    invoke-virtual {p4}, Ll/۟ۖܿ;->ܳ()Z

    move-result v1

    if-eqz v1, :cond_c

    .line 1476
    invoke-virtual {p4}, Ll/۟ۖܿ;->ᩳ()Ll/ᩳۢܿ;

    move-result-object v4

    invoke-static {v4}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1477
    invoke-virtual {p4}, Ll/۟ۖܿ;->ۧ()I

    move-result v5

    invoke-virtual {p4}, Ll/۟ۖܿ;->֫()I

    move-result v6

    move-object v1, v7

    move-object v2, p5

    move-object v3, p1

    .line 1475
    invoke-static/range {v1 .. v6}, Ll/ۜۢܿ;->֫(Ll/۟᩺ᩳ;Ll/᩺ܺܿ;Ll/ۢۖܿ;Ll/ᩳۢܿ;II)Ll/ۜۢܿ;

    move-result-object v1

    goto :goto_7

    :cond_c
    move-object v1, v0

    :goto_7
    if-eqz p6, :cond_d

    .line 1479
    invoke-virtual {p6}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p5}, Ll/᩺ܺܿ;->ᩳ()I

    move-result v3

    if-ne v2, v3, :cond_d

    .line 1480
    invoke-virtual {p1}, Ll/ۢۖܿ;->֫()I

    move-result v2

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-ne v2, v3, :cond_d

    .line 1482
    new-instance v2, Ll/᩻ۡܿ;

    invoke-direct {v2, v7, p5, p1}, Ll/᩻ۡܿ;-><init>(Ll/۟᩺ᩳ;Ll/᩺ܺܿ;Ll/ۢۖܿ;)V

    if-nez v1, :cond_f

    .line 1484
    invoke-virtual {p5}, Ll/᩺ܺܿ;->ۧ()Z

    move-result v3

    if-nez v3, :cond_f

    .line 1487
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v3

    iget-object v4, p5, Ll/᩺ܺܿ;->ۡ:Ll/ܶۜܿ;

    invoke-static {v3, v4}, Ll/ᩳۢܿ;->ۧ(ILl/ܶۜܿ;)Ll/ᩳۢܿ;

    move-result-object v3

    .line 1486
    invoke-static {v7, p5, p1, v3}, Ll/ۜۢܿ;->֫(Ll/۟᩺ᩳ;Ll/᩺ܺܿ;Ll/ۢۖܿ;Ll/ᩳۢܿ;)Ll/ۜۢܿ;

    move-result-object p5

    goto :goto_8

    :cond_d
    move-object p5, v0

    move-object v2, p5

    goto :goto_8

    :cond_e
    move-object v1, v0

    move-object v2, v1

    :cond_f
    move-object p5, v1

    .line 1492
    :goto_8
    iget-object v3, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iput-object v0, v3, Ll/ܳۡܿ;->ۧ:Ll/ۜۢܿ;

    .line 1493
    iget-object v3, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iput-object v0, v3, Ll/ܳۡܿ;->ܳ:Ll/ۜۢܿ;

    .line 1494
    iget-object v3, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iput-object v0, v3, Ll/ܳۡܿ;->᩻:Ll/᩻ۡܿ;

    .line 1495
    iget-object v3, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iput-boolean p3, v3, Ll/ܳۡܿ;->֫:Z

    .line 1496
    iput-object p2, v3, Ll/ܳۡܿ;->ܽ:Ll/ᩳۢܿ;

    .line 1497
    iput-object p4, v3, Ll/ܳۡܿ;->ۡ:Ll/۟ۖܿ;

    if-nez p1, :cond_10

    move-object p6, v0

    .line 1498
    :cond_10
    iput-object p6, v3, Ll/ܳۡܿ;->ۢ:Ljava/lang/Integer;

    .line 1499
    iget p2, v3, Ll/ܳۡܿ;->ᩳ:I

    add-int/lit8 p2, p2, 0x1

    iput p2, v3, Ll/ܳۡܿ;->ᩳ:I

    .line 1501
    iput-object p1, v3, Ll/ܳۡܿ;->᩷:Ll/ۢۖܿ;

    .line 1502
    iget-object p1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iput-object v2, p1, Ll/ܳۡܿ;->᩻:Ll/᩻ۡܿ;

    .line 1503
    iget-object p1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iput-object p5, p1, Ll/ܳۡܿ;->ܳ:Ll/ۜۢܿ;

    .line 1504
    iget-object p1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iput-object v1, p1, Ll/ܳۡܿ;->ۧ:Ll/ۜۢܿ;

    if-eqz p7, :cond_11

    .line 1507
    iget-object p1, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۖܽ()V

    return-void

    .line 1509
    :cond_11
    iget-object p1, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Ll/۫ۨᩳ;->᩵ۧ()V

    return-void
.end method

.method private declared-synchronized ֫(Ll/ܶۜܿ;)V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 879
    :try_start_0
    invoke-direct {p0, v2, v1, v1}, Ll/᩷ۡܿ;->֫(ZZZ)V

    .line 2169
    iget-object v2, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iput-boolean v1, v2, Ll/ܳۡܿ;->ܿ:Z

    .line 2170
    invoke-static {p1}, Ll/᩺ۢܿ;->֫(Ll/ܶۜܿ;)Ll/᩺ۢܿ;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2171
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

.method private ֫(Ll/᩶᩸ᩳ;IIILl/ܶۜܿ;Z)V
    .locals 17

    move-object/from16 v8, p0

    move-object/from16 v9, p1

    move/from16 v10, p2

    move/from16 v11, p3

    move/from16 v12, p4

    .line 1149
    sget-object v7, Ll/᩺ۖܿ;->ۧ:Ll/᩺ۖܿ;

    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    int-to-long v0, v0

    int-to-long v2, v12

    sub-long/2addr v0, v2

    int-to-long v4, v11

    add-long/2addr v0, v4

    const-wide/16 v13, 0x0

    cmp-long v6, v0, v13

    if-ltz v6, :cond_1f

    const-wide/32 v15, 0x7fffffff

    cmp-long v6, v0, v15

    if-gtz v6, :cond_1f

    if-ltz v10, :cond_1f

    if-ltz v11, :cond_1f

    if-ltz v12, :cond_1f

    int-to-long v13, v10

    add-long/2addr v13, v4

    cmp-long v6, v13, v0

    if-gtz v6, :cond_1f

    long-to-int v6, v0

    .line 1162
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const v1, 0xf4240

    if-le v0, v1, :cond_e

    if-le v6, v1, :cond_c

    .line 1289
    invoke-direct/range {p0 .. p1}, Ll/᩷ۡܿ;->ܳ(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_7

    .line 1292
    :cond_0
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    int-to-long v0, v0

    sub-long/2addr v0, v2

    add-long/2addr v0, v4

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_c

    cmp-long v2, v0, v15

    if-gtz v2, :cond_c

    if-ltz v10, :cond_c

    if-ltz v11, :cond_c

    if-ltz v12, :cond_c

    cmp-long v2, v13, v0

    if-lez v2, :cond_1

    goto/16 :goto_7

    :cond_1
    long-to-int v13, v0

    .line 1299
    invoke-interface/range {p1 .. p1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v14

    .line 1378
    iget-object v0, v8, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget-object v1, v0, Ll/ۜۡܿ;->᩶:Ll/᩶᩸ᩳ;

    const/4 v2, -0x1

    if-ne v1, v9, :cond_2

    iget v1, v0, Ll/ۜۡܿ;->᩹:I

    if-eq v1, v2, :cond_2

    iget v3, v0, Ll/ۜۡܿ;->ۙ:I

    if-ne v3, v13, :cond_2

    iget v3, v0, Ll/ۜۡܿ;->᩸:I

    add-int/lit8 v3, v3, 0x1

    if-ne v3, v14, :cond_2

    .line 1304
    iget v0, v0, Ll/ۜۡܿ;->ܶ:I

    :goto_0
    move v5, v0

    move v4, v1

    goto :goto_1

    .line 1305
    :cond_2
    iget-object v1, v0, Ll/ۜۡܿ;->۠:Ll/᩶᩸ᩳ;

    if-ne v1, v9, :cond_3

    iget v1, v0, Ll/ۜۡܿ;->ۖ:I

    if-eq v1, v2, :cond_3

    iget v3, v0, Ll/ۜۡܿ;->ۘ:I

    if-ne v3, v13, :cond_3

    iget v3, v0, Ll/ۜۡܿ;->ۡ:I

    add-int/lit8 v3, v3, 0x1

    if-ne v3, v14, :cond_3

    .line 1309
    iget v0, v0, Ll/ۜۡܿ;->ۢ:I

    goto :goto_0

    .line 1310
    :cond_3
    iget-object v1, v0, Ll/ۜۡܿ;->᩻:Ll/᩶᩸ᩳ;

    if-ne v1, v9, :cond_c

    iget v1, v0, Ll/ۜۡܿ;->ܳ:I

    if-eq v1, v2, :cond_c

    iget v2, v0, Ll/ۜۡܿ;->ۜ:I

    if-ne v2, v13, :cond_c

    iget v2, v0, Ll/ۜۡܿ;->ܿ:I

    add-int/lit8 v2, v2, 0x1

    if-ne v2, v14, :cond_c

    .line 1314
    iget v0, v0, Ll/ۜۡܿ;->ᩳ:I

    goto :goto_0

    .line 1321
    :goto_1
    iget-object v0, v8, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v0, v0, Ll/ܳۡܿ;->᩷:Ll/ۢۖܿ;

    const/16 v15, 0x20

    if-eqz v0, :cond_6

    .line 1323
    iget-object v1, v8, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v1, v1, Ll/ܳۡܿ;->ۡ:Ll/۟ۖܿ;

    if-eqz v1, :cond_c

    invoke-virtual {v0}, Ll/ۢۖܿ;->֫()I

    move-result v1

    if-ne v1, v13, :cond_c

    iget-object v1, v8, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v1, v1, Ll/ܳۡܿ;->ۡ:Ll/۟ۖܿ;

    .line 1324
    invoke-virtual {v1}, Ll/۟ۖܿ;->ܽ()Ll/ۢۖܿ;

    move-result-object v1

    if-eq v1, v0, :cond_4

    goto/16 :goto_7

    .line 1327
    :cond_4
    invoke-direct/range {p0 .. p1}, Ll/᩷ۡܿ;->ܺ(Ll/᩶᩸ᩳ;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1328
    iget-object v0, v8, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v0, v0, Ll/ܳۡܿ;->ۡ:Ll/۟ۖܿ;

    .line 1330
    invoke-virtual/range {p5 .. p5}, Ll/ܶۜܿ;->ܳ()Ll/᩸᩷ܿ;

    move-result-object v6

    move/from16 v1, p2

    move/from16 v2, p3

    move/from16 v3, p4

    .line 1328
    invoke-virtual/range {v0 .. v6}, Ll/۟ۖܿ;->֫(IIIIILl/᩸᩷ܿ;)Ll/ܰۖܿ;

    move-result-object v0

    .line 1331
    invoke-virtual {v0}, Ll/ܰۖܿ;->֫()Ll/۟ۖܿ;

    move-result-object v1

    .line 1332
    invoke-virtual {v0}, Ll/ܰۖܿ;->ܽ()I

    move-result v2

    .line 1333
    invoke-virtual {v0}, Ll/ܰۖܿ;->ۧ()I

    move-result v0

    goto :goto_2

    :cond_5
    move v0, v13

    move/from16 v1, p2

    move/from16 v2, p3

    move/from16 v3, p4

    .line 1336
    invoke-static/range {v0 .. v5}, Ll/۟ۖܿ;->֫(IIIIII)J

    move-result-wide v0

    ushr-long v2, v0, v15

    long-to-int v2, v2

    long-to-int v0, v0

    .line 1341
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-virtual/range {p5 .. p5}, Ll/ܶۜܿ;->ܳ()Ll/᩸᩷ܿ;

    move-result-object v3

    .line 1340
    invoke-static {v1, v3}, Ll/۟ۖܿ;->ۧ(ILl/᩸᩷ܿ;)Ll/۟ۖܿ;

    move-result-object v1

    goto :goto_2

    :cond_6
    move v0, v13

    move/from16 v1, p2

    move/from16 v2, p3

    move/from16 v3, p4

    .line 1344
    invoke-static/range {v0 .. v5}, Ll/۟ۖܿ;->֫(IIIIII)J

    move-result-wide v0

    ushr-long v2, v0, v15

    long-to-int v2, v2

    long-to-int v0, v0

    .line 1350
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-virtual/range {p5 .. p5}, Ll/ܶۜܿ;->ܳ()Ll/᩸᩷ܿ;

    move-result-object v3

    .line 1349
    invoke-static {v1, v3}, Ll/۟ۖܿ;->ۧ(ILl/᩸᩷ܿ;)Ll/۟ۖܿ;

    move-result-object v1

    :goto_2
    move v6, v0

    move-object/from16 v16, v1

    move v15, v2

    .line 1353
    iget-object v0, v8, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    .line 1355
    invoke-virtual {v0}, Ll/۫ۨᩳ;->᩹ۧ()Z

    move-result v0

    .line 1389
    iget-object v1, v8, Ll/᩷ۡܿ;->ۧ:Ll/ܿۡܿ;

    iget-object v2, v1, Ll/ܿۡܿ;->ܺ:Ll/᩶᩸ᩳ;

    const/4 v3, 0x0

    if-ne v2, v9, :cond_7

    iget v2, v1, Ll/ܿۡܿ;->ۖ:I

    if-ne v2, v13, :cond_7

    iget v2, v1, Ll/ܿۡܿ;->᩷:I

    add-int/lit8 v2, v2, 0x1

    if-ne v2, v14, :cond_7

    .line 1392
    iget-object v2, v1, Ll/ܿۡܿ;->ۡ:Ll/᩺ۖܿ;

    goto :goto_3

    :cond_7
    move-object v2, v3

    .line 1394
    :goto_3
    iput-object v3, v1, Ll/ܿۡܿ;->ۢ:Ll/۟ۖܿ;

    if-nez v2, :cond_8

    .line 1396
    invoke-direct/range {p0 .. p0}, Ll/᩷ۡܿ;->᩸()V

    goto :goto_5

    :cond_8
    if-eqz v0, :cond_9

    goto :goto_4

    .line 1402
    :cond_9
    invoke-virtual {v2, v13, v10, v11, v12}, Ll/᩺ۖܿ;->֫(IIII)Ll/᩺ۖܿ;

    move-result-object v7

    :goto_4
    iput-object v7, v1, Ll/ܿۡܿ;->ۡ:Ll/᩺ۖܿ;

    .line 1403
    iput v14, v1, Ll/ܿۡܿ;->᩷:I

    .line 1404
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    iput v0, v1, Ll/ܿۡܿ;->ۖ:I

    .line 1405
    iput-object v9, v1, Ll/ܿۡܿ;->ܺ:Ll/᩶᩸ᩳ;

    .line 1356
    :goto_5
    iget-object v0, v8, Ll/᩷ۡܿ;->ܳ:Ll/ܽܺܿ;

    .line 2190
    iget-object v1, v8, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    invoke-virtual {v1}, Ll/᩺ۢܿ;->ۧ()Ll/᩺ܺܿ;

    move-result-object v1

    move-object/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    .line 1356
    invoke-virtual/range {v0 .. v5}, Ll/ܽܺܿ;->֫(Ll/᩺ܺܿ;Ll/᩶᩸ᩳ;III)V

    .line 1358
    iget-object v0, v8, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iput-object v9, v0, Ll/ۜۡܿ;->۠:Ll/᩶᩸ᩳ;

    .line 1359
    invoke-direct/range {p0 .. p0}, Ll/᩷ۡܿ;->ۙ()V

    .line 1360
    invoke-direct/range {p0 .. p0}, Ll/᩷ۡܿ;->᩶()V

    if-eqz v16, :cond_a

    .line 1362
    invoke-virtual/range {v16 .. v16}, Ll/۟ۖܿ;->ܽ()Ll/ۢۖܿ;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v5, 0x1

    const/4 v2, 0x0

    move-object/from16 v0, p0

    move-object/from16 v4, v16

    invoke-direct/range {v0 .. v5}, Ll/᩷ۡܿ;->֫(Ll/ۢۖܿ;Ll/ᩳۢܿ;ZLl/۟ۖܿ;Z)V

    .line 1365
    :cond_a
    invoke-direct {v8, v9, v15, v6}, Ll/᩷ۡܿ;->᩻(Ll/᩶᩸ᩳ;II)V

    .line 1366
    invoke-direct/range {p0 .. p1}, Ll/᩷ۡܿ;->ܺ(Ll/᩶᩸ᩳ;)Z

    move-result v0

    if-eqz v0, :cond_b

    const/4 v0, 0x0

    .line 822
    invoke-direct {v8, v9, v15, v6, v0}, Ll/᩷ۡܿ;->֫(Ll/᩶᩸ᩳ;IIZ)V

    goto :goto_6

    :cond_b
    const/4 v0, 0x0

    .line 1369
    :goto_6
    iget-object v1, v8, Ll/᩷ۡܿ;->᩻:Ll/᩻ܺܿ;

    iput-boolean v0, v1, Ll/᩻ܺܿ;->ܽ:Z

    .line 1370
    iput v10, v1, Ll/᩻ܺܿ;->ۧ:I

    add-int v0, v10, v12

    .line 1371
    iput v0, v1, Ll/᩻ܺܿ;->֫:I

    return-void

    :cond_c
    :goto_7
    if-eqz p6, :cond_d

    const/4 v0, 0x0

    .line 1169
    invoke-direct {v8, v9, v0}, Ll/᩷ۡܿ;->֫(Ll/᩶᩸ᩳ;Z)V

    goto :goto_8

    :cond_d
    const/4 v7, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v6

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    .line 1172
    invoke-direct/range {v0 .. v6}, Ll/᩷ۡܿ;->֫(Ll/᩶᩸ᩳ;IIIILl/ܶۜܿ;)Ll/᩺ۖܿ;

    move-result-object v0

    const/4 v1, 0x1

    .line 1174
    invoke-direct {v8, v9, v1}, Ll/᩷ۡܿ;->֫(Ll/᩶᩸ᩳ;Z)V

    .line 1175
    invoke-direct {v8, v9, v0}, Ll/᩷ۡܿ;->֫(Ll/᩶᩸ᩳ;Ll/᩺ۖܿ;)V

    const/4 v0, 0x0

    .line 1177
    :goto_8
    iget-object v1, v8, Ll/᩷ۡܿ;->᩻:Ll/᩻ܺܿ;

    iput-boolean v0, v1, Ll/᩻ܺܿ;->ܽ:Z

    .line 1178
    iput v10, v1, Ll/᩻ܺܿ;->ۧ:I

    add-int v0, v10, v12

    .line 1179
    iput v0, v1, Ll/᩻ܺܿ;->֫:I

    return-void

    .line 1183
    :cond_e
    iget-object v0, v8, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v0, v0, Ll/ܳۡܿ;->᩷:Ll/ۢۖܿ;

    .line 1184
    iget-object v1, v8, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v13, v1, Ll/ܳۡܿ;->ۢ:Ljava/lang/Integer;

    .line 1185
    iget-object v1, v1, Ll/ܳۡܿ;->ۡ:Ll/۟ۖܿ;

    if-nez v1, :cond_f

    if-eqz v0, :cond_f

    .line 1186
    invoke-virtual {v0}, Ll/ۢۖܿ;->֫()I

    move-result v1

    if-ne v1, v6, :cond_f

    const/4 v1, 0x1

    goto :goto_9

    :cond_f
    const/4 v1, 0x0

    :goto_9
    if-nez p6, :cond_1b

    if-nez v1, :cond_10

    goto/16 :goto_e

    :cond_10
    if-lez v10, :cond_11

    if-lez v12, :cond_11

    add-int/lit8 v1, v10, -0x1

    .line 1209
    :try_start_0
    invoke-virtual {v0, v1}, Ll/ۢۖܿ;->֫(I)Ll/᩸᩷ܿ;

    move-result-object v1

    goto :goto_a

    :cond_11
    invoke-virtual/range {p5 .. p5}, Ll/ܶۜܿ;->ܳ()Ll/᩸᩷ܿ;

    move-result-object v1

    :goto_a
    add-int v2, v10, v11

    if-nez v12, :cond_12

    .line 1917
    invoke-static {}, Ll/ۢۖܿ;->ܽ()Ll/ۢۖܿ;

    move-result-object v1

    goto :goto_b

    :cond_12
    const/4 v3, 0x0

    .line 1919
    invoke-static {v12, v1, v3}, Ll/ۢۖܿ;->֫(ILl/᩸᩷ܿ;Z)Ll/ۢۖܿ;

    move-result-object v1

    .line 1210
    :goto_b
    invoke-virtual {v0, v10, v2, v1}, Ll/ۢۖܿ;->֫(IILl/ۢۖܿ;)Ll/ۢۖܿ;

    move-result-object v1

    const/4 v5, 0x1

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v0, p0

    move-object v6, v13

    .line 1430
    invoke-direct/range {v0 .. v7}, Ll/᩷ۡܿ;->֫(Ll/ۢۖܿ;Ll/ᩳۢܿ;ZLl/۟ۖܿ;ZLjava/lang/Integer;Z)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1221
    iget-object v0, v8, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    const/4 v1, 0x1

    iput-boolean v1, v0, Ll/ܳۡܿ;->ܿ:Z

    .line 1222
    iget-object v0, v8, Ll/᩷ۡܿ;->᩻:Ll/᩻ܺܿ;

    const/4 v1, 0x0

    iput-boolean v1, v0, Ll/᩻ܺܿ;->ܽ:Z

    .line 1223
    iput v10, v0, Ll/᩻ܺܿ;->ۧ:I

    add-int v1, v10, v12

    .line 1224
    iput v1, v0, Ll/᩻ܺܿ;->֫:I

    .line 790
    invoke-direct/range {p0 .. p0}, Ll/᩷ۡܿ;->ۗ()V

    .line 791
    invoke-direct/range {p0 .. p1}, Ll/᩷ۡܿ;->ᩴ(Ll/᩶᩸ᩳ;)Z

    move-result v0

    if-eqz v0, :cond_13

    goto :goto_d

    .line 794
    :cond_13
    invoke-direct/range {p0 .. p1}, Ll/᩷ۡܿ;->᩷(Ll/᩶᩸ᩳ;)Z

    move-result v0

    if-eqz v0, :cond_14

    goto :goto_d

    .line 797
    :cond_14
    iget-object v0, v8, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget-object v0, v0, Ll/ۜۡܿ;->ۧ:Ll/᩶᩸ᩳ;

    if-eqz v0, :cond_15

    .line 799
    invoke-direct/range {p0 .. p0}, Ll/᩷ۡܿ;->᩹()V

    .line 801
    :cond_15
    iget-object v0, v8, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۛۧ()Z

    move-result v0

    if-eqz v0, :cond_16

    iget-object v0, v8, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    .line 802
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_16

    iget-object v0, v8, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->᩹ۧ()Z

    move-result v0

    if-nez v0, :cond_16

    const/4 v0, 0x1

    goto :goto_c

    :cond_16
    const/4 v0, 0x0

    :goto_c
    if-nez v0, :cond_18

    .line 803
    invoke-direct/range {p0 .. p1}, Ll/᩷ۡܿ;->ۡ(Ll/᩶᩸ᩳ;)Z

    move-result v1

    if-nez v1, :cond_18

    .line 804
    iget-object v0, v8, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->᩹ۧ()Z

    move-result v0

    if-eqz v0, :cond_17

    const/4 v0, 0x0

    .line 879
    invoke-direct {v8, v0, v0, v0}, Ll/᩷ۡܿ;->֫(ZZZ)V

    :cond_17
    :goto_d
    return-void

    :cond_18
    const/4 v1, 0x0

    .line 810
    iget-object v2, v8, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget-object v3, v2, Ll/ۜۡܿ;->۠:Ll/᩶᩸ᩳ;

    if-eq v3, v9, :cond_19

    .line 763
    invoke-direct {v8, v9, v1}, Ll/᩷ۡܿ;->ۧ(Ll/᩶᩸ᩳ;Z)V

    return-void

    .line 813
    :cond_19
    iput-boolean v1, v2, Ll/ۜۡܿ;->֨:Z

    if-eqz v0, :cond_1a

    .line 814
    iput-object v9, v2, Ll/ۜۡܿ;->֡:Ll/᩶᩸ᩳ;

    .line 815
    :cond_1a
    iget-object v0, v8, Ll/᩷ۡܿ;->ܳ:Ll/ܽܺܿ;

    .line 2190
    iget-object v1, v8, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    invoke-virtual {v1}, Ll/᩺ۢܿ;->ۧ()Ll/᩺ܺܿ;

    move-result-object v1

    .line 815
    iget-object v2, v8, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v6, v2, Ll/ܳۡܿ;->᩷:Ll/ۢۖܿ;

    iget-object v2, v8, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget v7, v2, Ll/ܳۡܿ;->ᩳ:I

    move-object/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    invoke-virtual/range {v0 .. v7}, Ll/ܽܺܿ;->֫(Ll/᩺ܺܿ;Ll/᩶᩸ᩳ;IIILl/ۢۖܿ;I)V

    return-void

    .line 1215
    :catch_0
    invoke-direct/range {p0 .. p1}, Ll/᩷ۡܿ;->ۜ(Ll/᩶᩸ᩳ;)V

    .line 1216
    iget-object v0, v8, Ll/᩷ۡܿ;->᩻:Ll/᩻ܺܿ;

    const/4 v1, 0x1

    iput-boolean v1, v0, Ll/᩻ܺܿ;->ܽ:Z

    const/4 v1, 0x0

    .line 1217
    iput v1, v0, Ll/᩻ܺܿ;->ۧ:I

    .line 1218
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    iput v1, v0, Ll/᩻ܺܿ;->֫:I

    return-void

    :cond_1b
    :goto_e
    const/4 v13, 0x0

    if-eqz p6, :cond_1c

    goto :goto_f

    :cond_1c
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v6

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    .line 1191
    invoke-direct/range {v0 .. v6}, Ll/᩷ۡܿ;->֫(Ll/᩶᩸ᩳ;IIIILl/ܶۜܿ;)Ll/᩺ۖܿ;

    move-result-object v7

    .line 879
    :goto_f
    invoke-direct {v8, v13, v13, v13}, Ll/᩷ۡܿ;->֫(ZZZ)V

    .line 1194
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-virtual/range {p5 .. p5}, Ll/ܶۜܿ;->ܳ()Ll/᩸᩷ܿ;

    move-result-object v1

    if-nez v0, :cond_1d

    .line 1917
    invoke-static {}, Ll/ۢۖܿ;->ܽ()Ll/ۢۖܿ;

    move-result-object v0

    goto :goto_10

    .line 1919
    :cond_1d
    invoke-static {v0, v1, v13}, Ll/ۢۖܿ;->֫(ILl/᩸᩷ܿ;Z)Ll/ۢۖܿ;

    move-result-object v0

    :goto_10
    move-object v1, v0

    xor-int/lit8 v5, p6, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v0, p0

    .line 1194
    invoke-direct/range {v0 .. v5}, Ll/᩷ۡܿ;->֫(Ll/ۢۖܿ;Ll/ᩳۢܿ;ZLl/۟ۖܿ;Z)V

    .line 1196
    iget-object v0, v8, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    const/4 v1, 0x1

    iput-boolean v1, v0, Ll/ܳۡܿ;->ܿ:Z

    if-nez p6, :cond_1e

    .line 1198
    invoke-direct {v8, v9, v7}, Ll/᩷ۡܿ;->֫(Ll/᩶᩸ᩳ;Ll/᩺ۖܿ;)V

    .line 1200
    :cond_1e
    iget-object v0, v8, Ll/᩷ۡܿ;->᩻:Ll/᩻ܺܿ;

    const/4 v1, 0x0

    iput-boolean v1, v0, Ll/᩻ܺܿ;->ܽ:Z

    .line 1201
    iput v10, v0, Ll/᩻ܺܿ;->ۧ:I

    add-int v1, v10, v12

    .line 1202
    iput v1, v0, Ll/᩻ܺܿ;->֫:I

    return-void

    .line 1154
    :cond_1f
    invoke-direct/range {p0 .. p1}, Ll/᩷ۡܿ;->ۜ(Ll/᩶᩸ᩳ;)V

    .line 1155
    iget-object v0, v8, Ll/᩷ۡܿ;->᩻:Ll/᩻ܺܿ;

    const/4 v1, 0x1

    iput-boolean v1, v0, Ll/᩻ܺܿ;->ܽ:Z

    const/4 v1, 0x0

    .line 1156
    iput v1, v0, Ll/᩻ܺܿ;->ۧ:I

    .line 1157
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    iput v1, v0, Ll/᩻ܺܿ;->֫:I

    return-void
.end method

.method private ֫(Ll/᩶᩸ᩳ;IIIZ)V
    .locals 6

    .line 1070
    invoke-direct {p0}, Ll/᩷ۡܿ;->۠()V

    .line 1071
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    int-to-long v0, v0

    int-to-long v2, p4

    sub-long/2addr v0, v2

    int-to-long v2, p3

    add-long/2addr v0, v2

    .line 1072
    invoke-interface {p1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v2

    const-wide/16 v3, 0x0

    cmp-long v5, v0, v3

    if-ltz v5, :cond_4

    const-wide/32 v3, 0x7fffffff

    cmp-long v5, v0, v3

    if-gtz v5, :cond_4

    .line 1073
    iget-object v3, p0, Ll/᩷ۡܿ;->ۧ:Ll/ܿۡܿ;

    iget-boolean v4, v3, Ll/ܿۡܿ;->᩻:Z

    if-eqz v4, :cond_4

    iget-object v4, v3, Ll/ܿۡܿ;->ܿ:Ll/᩶᩸ᩳ;

    if-ne v4, p1, :cond_4

    iget v4, v3, Ll/ܿۡܿ;->ܳ:I

    long-to-int v1, v0

    if-ne v4, v1, :cond_4

    iget v0, v3, Ll/ܿۡܿ;->ᩳ:I

    add-int/lit8 v0, v0, 0x1

    if-eq v0, v2, :cond_0

    goto :goto_1

    .line 1080
    :cond_0
    iget-object v0, v3, Ll/ܿۡܿ;->ܽ:Ll/᩺ۖܿ;

    invoke-virtual {v0}, Ll/᩺ۖܿ;->ۧ()Ll/ܳۖܿ;

    move-result-object v0

    if-eqz v0, :cond_3

    if-eqz p5, :cond_1

    goto :goto_0

    .line 1085
    :cond_1
    iget-object p5, v3, Ll/ܿۡܿ;->ܽ:Ll/᩺ۖܿ;

    invoke-virtual {p5, v1, p2, p3, p4}, Ll/᩺ۖܿ;->֫(IIII)Ll/᩺ۖܿ;

    move-result-object p2

    .line 1087
    invoke-virtual {p2}, Ll/᩺ۖܿ;->ۧ()Ll/ܳۖܿ;

    move-result-object p3

    if-nez p3, :cond_2

    .line 1088
    invoke-direct {p0}, Ll/᩷ۡܿ;->ܶ()V

    return-void

    .line 1091
    :cond_2
    iput-object p2, v3, Ll/ܿۡܿ;->ܽ:Ll/᩺ۖܿ;

    .line 1092
    iput v2, v3, Ll/ܿۡܿ;->ᩳ:I

    .line 1093
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p2

    iput p2, v3, Ll/ܿۡܿ;->ܳ:I

    .line 1094
    iput-object p1, v3, Ll/ܿۡܿ;->ܿ:Ll/᩶᩸ᩳ;

    return-void

    .line 1082
    :cond_3
    :goto_0
    invoke-direct {p0}, Ll/᩷ۡܿ;->ܶ()V

    return-void

    .line 1077
    :cond_4
    :goto_1
    invoke-direct {p0}, Ll/᩷ۡܿ;->ܶ()V

    return-void
.end method

.method private ֫(Ll/᩶᩸ᩳ;IIZ)V
    .locals 7

    if-nez p4, :cond_0

    .line 827
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ܺ(Ll/᩶᩸ᩳ;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 830
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Ll/᩷ۡܿ;->᩻(Ll/᩶᩸ᩳ;II)V

    .line 831
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ᩴ(Ll/᩶᩸ᩳ;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 834
    :cond_1
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ۢ(Ll/᩶᩸ᩳ;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget v1, v0, Ll/ۜۡܿ;->ۖ:I

    if-gt v1, p2, :cond_2

    iget v0, v0, Ll/ۜۡܿ;->ۢ:I

    if-gt p3, v0, :cond_2

    goto :goto_0

    .line 839
    :cond_2
    invoke-direct {p0}, Ll/᩷ۡܿ;->۬()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget v1, v0, Ll/ۜۡܿ;->ܳ:I

    if-gt v1, p2, :cond_3

    iget v0, v0, Ll/ۜۡܿ;->ᩳ:I

    if-gt p3, v0, :cond_3

    :goto_0
    return-void

    .line 844
    :cond_3
    invoke-direct {p0}, Ll/᩷ۡܿ;->᩶()V

    .line 845
    invoke-direct {p0}, Ll/᩷ۡܿ;->ۗ()V

    if-eqz p4, :cond_4

    .line 847
    iget-object p4, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iput-object p1, p4, Ll/ۜۡܿ;->֡:Ll/᩶᩸ᩳ;

    .line 849
    :cond_4
    iget-object p4, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iput-object p1, p4, Ll/ۜۡܿ;->۠:Ll/᩶᩸ᩳ;

    .line 850
    iput p2, p4, Ll/ۜۡܿ;->ۖ:I

    .line 851
    iput p3, p4, Ll/ۜۡܿ;->ۢ:I

    .line 852
    invoke-interface {p1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v0

    iput v0, p4, Ll/ۜۡܿ;->ۡ:I

    .line 853
    iget-object p4, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    iput v0, p4, Ll/ۜۡܿ;->ۘ:I

    .line 854
    iget-object p4, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget-object v0, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget v0, v0, Ll/ܳۡܿ;->ᩳ:I

    iput v0, p4, Ll/ۜۡܿ;->᩷:I

    const/4 v0, 0x0

    .line 855
    iput-boolean v0, p4, Ll/ۜۡܿ;->ܺ:Z

    .line 856
    iget-object v1, p0, Ll/᩷ۡܿ;->ܳ:Ll/ܽܺܿ;

    .line 2190
    iget-object p4, p0, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    invoke-virtual {p4}, Ll/᩺ۢܿ;->ۧ()Ll/᩺ܺܿ;

    move-result-object v2

    .line 856
    iget-object p4, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget v6, p4, Ll/ܳۡܿ;->ᩳ:I

    move-object v3, p1

    move v4, p2

    move v5, p3

    invoke-virtual/range {v1 .. v6}, Ll/ܽܺܿ;->ۧ(Ll/᩺ܺܿ;Ll/᩶᩸ᩳ;III)V

    return-void
.end method

.method private ֫(Ll/᩶᩸ᩳ;Ll/۟ۖܿ;)V
    .locals 3

    .line 975
    iget-object v0, p0, Ll/᩷ۡܿ;->ۧ:Ll/ܿۡܿ;

    iput-object p2, v0, Ll/ܿۡܿ;->ۢ:Ll/۟ۖܿ;

    .line 977
    invoke-virtual {p2}, Ll/۟ۖܿ;->ۧ()I

    move-result v1

    invoke-virtual {p2}, Ll/۟ۖܿ;->֫()I

    move-result p2

    const/4 v2, -0x1

    .line 976
    invoke-static {v2, v2, v1, p2}, Ll/᩺ۖܿ;->ۧ(IIII)Ll/᩺ۖܿ;

    move-result-object p2

    iput-object p2, v0, Ll/ܿۡܿ;->ۡ:Ll/᩺ۖܿ;

    .line 978
    invoke-interface {p1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result p2

    iput p2, v0, Ll/ܿۡܿ;->᩷:I

    .line 979
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p2

    iput p2, v0, Ll/ܿۡܿ;->ۖ:I

    .line 980
    iput-object p1, v0, Ll/ܿۡܿ;->ܺ:Ll/᩶᩸ᩳ;

    return-void
.end method

.method private ֫(Ll/᩶᩸ᩳ;Ll/᩺ۖܿ;)V
    .locals 2

    .line 1272
    invoke-interface {p1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v0

    sget-object v1, Ll/ܽۡܿ;->᩹:Ll/ܽۡܿ;

    .line 1271
    invoke-direct {p0, p1, v0, p2, v1}, Ll/᩷ۡܿ;->ۧ(Ll/᩶᩸ᩳ;ILl/᩺ۖܿ;Ll/ܽۡܿ;)Ll/ᩳۡܿ;

    move-result-object p2

    if-nez p2, :cond_0

    .line 1274
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ۘ(Ll/᩶᩸ᩳ;)Z

    return-void

    .line 1277
    :cond_0
    iget-object p1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object p1, p1, Ll/ܳۡܿ;->ۡ:Ll/۟ۖܿ;

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iget-object v1, p0, Ll/᩷ۡܿ;->ۧ:Ll/ܿۡܿ;

    iput-boolean p1, v1, Ll/ܿۡܿ;->֫:Z

    .line 1278
    iput-boolean v0, v1, Ll/ܿۡܿ;->ۜ:Z

    .line 1760
    iget-object p1, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Landroid/view/View;->postInvalidate()V

    .line 1761
    invoke-virtual {p1, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private ֫(Ll/᩶᩸ᩳ;Z)V
    .locals 9

    const/4 v0, 0x0

    .line 879
    invoke-direct {p0, v0, v0, v0}, Ll/᩷ۡܿ;->֫(ZZZ)V

    .line 2093
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    .line 2184
    iget-object v2, p0, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    invoke-virtual {v2}, Ll/᩺ۢܿ;->֫()Ll/ܶۜܿ;

    move-result-object v2

    .line 2093
    invoke-virtual {v2}, Ll/ܶۜܿ;->ܳ()Ll/᩸᩷ܿ;

    move-result-object v2

    .line 2092
    invoke-static {v1, v2}, Ll/۟ۖܿ;->ۧ(ILl/᩸᩷ܿ;)Ll/۟ۖܿ;

    move-result-object v7

    .line 2094
    invoke-virtual {v7}, Ll/۟ۖܿ;->ܽ()Ll/ۢۖܿ;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, p0

    move v8, p2

    invoke-direct/range {v3 .. v8}, Ll/᩷ۡܿ;->֫(Ll/ۢۖܿ;Ll/ᩳۢܿ;ZLl/۟ۖܿ;Z)V

    .line 2096
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p2

    const/16 v1, 0x2710

    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 2097
    invoke-direct {p0, p1, v0, p2}, Ll/᩷ۡܿ;->᩻(Ll/᩶᩸ᩳ;II)V

    .line 2098
    iget-object p1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    const/4 p2, 0x1

    iput-boolean p2, p1, Ll/ܳۡܿ;->ܿ:Z

    return-void
.end method

.method public static ֫(Ll/᩷ۡܿ;Ll/ۙۡܿ;)V
    .locals 6

    .line 1642
    invoke-virtual {p1}, Ll/ۙۡܿ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1643
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->֫(Ll/ۙۡܿ;)V

    return-void

    .line 1646
    :cond_0
    iget-object v1, p0, Ll/᩷ۡܿ;->ܳ:Ll/ܽܺܿ;

    .line 1647
    invoke-virtual {v1, p1}, Ll/ܽܺܿ;->֫(Ll/ۙۡܿ;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object v0, p0

    .line 1652
    monitor-enter v0

    .line 1653
    :try_start_0
    iget-object v2, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget-object v2, v2, Ll/ۜۡܿ;->۠:Ll/᩶᩸ᩳ;

    .line 1654
    invoke-virtual {v1, p1}, Ll/ܽܺܿ;->֫(Ll/ۙۡܿ;)Z

    move-result v1

    if-eqz v1, :cond_6

    if-eqz v2, :cond_6

    iget-object v1, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    if-ne v1, v2, :cond_6

    .line 1655
    invoke-virtual {p1}, Ll/ۙۡܿ;->ۧ()I

    move-result v1

    invoke-interface {v2}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v3

    if-ne v1, v3, :cond_6

    .line 1656
    invoke-virtual {p1}, Ll/ۙۡܿ;->ܽ()I

    move-result v1

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-eq v1, v3, :cond_2

    goto :goto_2

    .line 1659
    :cond_2
    invoke-virtual {p1}, Ll/ۙۡܿ;->֫()Ll/ۗۡܿ;

    move-result-object v1

    .line 1660
    sget-object v3, Ll/ۗۡܿ;->۬:Ll/ۗۡܿ;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-ne v1, v3, :cond_3

    .line 1662
    iget-object p1, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iput-boolean v4, p1, Ll/ۜۡܿ;->֨:Z

    .line 1663
    iget-object v1, p1, Ll/ۜۡܿ;->֡:Ll/᩶᩸ᩳ;

    if-ne v1, v2, :cond_4

    iget-boolean p1, p1, Ll/ۜۡܿ;->ᩴ:Z

    if-eqz p1, :cond_4

    .line 1666
    invoke-direct {p0}, Ll/᩷ۡܿ;->ۗ()V

    goto :goto_0

    .line 1670
    :cond_3
    iget-object v1, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iput-boolean v5, v1, Ll/ۜۡܿ;->֨:Z

    .line 1672
    invoke-virtual {p1}, Ll/ۙۡܿ;->ۧ()I

    move-result v3

    iput v3, v1, Ll/ۜۡܿ;->֫:I

    .line 1673
    iget-object v1, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    invoke-virtual {p1}, Ll/ۙۡܿ;->ܽ()I

    move-result p1

    iput p1, v1, Ll/ۜۡܿ;->ܽ:I

    .line 1674
    iget-object p1, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iput-object v2, p1, Ll/ۜۡܿ;->ۧ:Ll/᩶᩸ᩳ;

    .line 1677
    invoke-direct {p0, v5, v4, v5}, Ll/᩷ۡܿ;->֫(ZZZ)V

    :cond_4
    const/4 v4, 0x0

    .line 1679
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v4, :cond_5

    .line 1681
    invoke-direct {p0, v2}, Ll/᩷ۡܿ;->ۘ(Ll/᩶᩸ᩳ;)Z

    :cond_5
    :goto_1
    return-void

    .line 1657
    :cond_6
    :goto_2
    :try_start_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    .line 1679
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static bridge synthetic ֫(Ll/᩷ۡܿ;Ll/ۛۡܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->֫(Ll/ۛۡܿ;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩷ۡܿ;Ll/۟ۡܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->֫(Ll/۟ۡܿ;)V

    return-void
.end method

.method public static ֫(Ll/᩷ۡܿ;Ll/ۤۡܿ;)V
    .locals 0

    .line 223
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->֫(Ll/ۤۡܿ;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 224
    :cond_0
    iget-object p0, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩷ۡܿ;Ll/᩶᩸ᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ۘ(Ll/᩶᩸ᩳ;)Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩷ۡܿ;Ll/᩶᩸ᩳ;Ll/۟ۖܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Ll/᩷ۡܿ;->֫(Ll/᩶᩸ᩳ;Ll/۟ۖܿ;)V

    return-void
.end method

.method public static ֫(Ll/᩷ۡܿ;Ll/᩶᩸ᩳ;Ll/᩺ۖܿ;)V
    .locals 1

    .line 986
    iget-object p0, p0, Ll/᩷ۡܿ;->ۧ:Ll/ܿۡܿ;

    const/4 v0, 0x0

    iput-object v0, p0, Ll/ܿۡܿ;->ۢ:Ll/۟ۖܿ;

    .line 987
    iput-object p2, p0, Ll/ܿۡܿ;->ۡ:Ll/᩺ۖܿ;

    .line 988
    invoke-interface {p1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result p2

    iput p2, p0, Ll/ܿۡܿ;->᩷:I

    .line 989
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p2

    iput p2, p0, Ll/ܿۡܿ;->ۖ:I

    .line 990
    iput-object p1, p0, Ll/ܿۡܿ;->ܺ:Ll/᩶᩸ᩳ;

    return-void
.end method

.method private ֫(ZZZ)V
    .locals 9

    const/4 v0, 0x0

    if-nez p1, :cond_0

    if-nez p3, :cond_1

    .line 885
    :cond_0
    iget-object v1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iput-object v0, v1, Ll/ܳۡܿ;->ۜ:Ll/ۘܺܿ;

    .line 886
    :cond_1
    iget-object v1, p0, Ll/᩷ۡܿ;->ܳ:Ll/ܽܺܿ;

    invoke-virtual {v1}, Ll/ܽܺܿ;->֫()V

    .line 887
    iget-object v1, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    const/4 v2, 0x0

    iput-boolean v2, v1, Ll/ۜۡܿ;->֨:Z

    .line 888
    iput-object v0, v1, Ll/ۜۡܿ;->۠:Ll/᩶᩸ᩳ;

    .line 889
    invoke-direct {p0}, Ll/᩷ۡܿ;->ۗ()V

    .line 890
    invoke-direct {p0}, Ll/᩷ۡܿ;->ۙ()V

    if-nez p2, :cond_2

    .line 892
    invoke-direct {p0}, Ll/᩷ۡܿ;->᩹()V

    .line 893
    invoke-direct {p0}, Ll/᩷ۡܿ;->᩶()V

    :cond_2
    if-nez p3, :cond_3

    .line 954
    iget-object p2, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    const/4 p3, -0x1

    iput p3, p2, Ll/ۜۡܿ;->᩹:I

    .line 955
    iput p3, p2, Ll/ۜۡܿ;->ܶ:I

    .line 956
    iput v2, p2, Ll/ۜۡܿ;->᩸:I

    .line 957
    iput v2, p2, Ll/ۜۡܿ;->ۙ:I

    .line 958
    iput-object v0, p2, Ll/ۜۡܿ;->᩶:Ll/᩶᩸ᩳ;

    .line 897
    invoke-direct {p0}, Ll/᩷ۡܿ;->᩸()V

    :cond_3
    if-eqz p1, :cond_4

    .line 901
    iget-object p1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iput-boolean v2, p1, Ll/ܳۡܿ;->ܿ:Z

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, p0

    .line 902
    invoke-direct/range {v3 .. v8}, Ll/᩷ۡܿ;->֫(Ll/ۢۖܿ;Ll/ᩳۢܿ;ZLl/۟ۖܿ;Z)V

    :cond_4
    return-void
.end method

.method public static ֫(IIII)Z
    .locals 0

    if-ltz p0, :cond_0

    if-gt p0, p2, :cond_0

    if-gt p3, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private declared-synchronized ֫(Ll/ۤۡܿ;)Z
    .locals 10

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 229
    :try_start_0
    iget-object v1, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v3

    .line 2190
    iget-object v1, p0, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    invoke-virtual {v1}, Ll/᩺ۢܿ;->ۧ()Ll/᩺ܺܿ;

    move-result-object v4

    .line 231
    invoke-virtual {p1}, Ll/ۤۡܿ;->֫()Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p1, Ll/ۤۡܿ;->ۧ:Ll/᩷ۢܿ;

    iget-object v2, v1, Ll/᩷ۢܿ;->ᩳ:Ll/᩶᩸ᩳ;

    if-ne v2, v3, :cond_4

    iget-object v1, v1, Ll/᩷ۢܿ;->ܽ:Ll/᩺ܺܿ;

    if-ne v1, v4, :cond_4

    .line 232
    invoke-virtual {v4}, Ll/᩺ܺܿ;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_4

    iget v1, p1, Ll/ۤۡܿ;->֫:I

    iget-object v2, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget v5, v2, Ll/ܳۡܿ;->ᩳ:I

    if-ne v1, v5, :cond_4

    iget-boolean v1, v2, Ll/ܳۡܿ;->֫:Z

    if-eqz v1, :cond_0

    goto :goto_2

    .line 234
    :cond_0
    iget-object v1, v2, Ll/ܳۡܿ;->ۜ:Ll/ۘܺܿ;

    const/4 v9, 0x1

    if-eqz v1, :cond_3

    .line 235
    invoke-interface {v3}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v2

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v5

    invoke-virtual {v1, v3, v4, v2, v5}, Ll/ۘܺܿ;->֫(Ljava/lang/Object;Ll/᩺ܺܿ;II)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 238
    :cond_1
    iget-object v2, v1, Ll/ۘܺܿ;->֫:Ll/۬ۢܿ;

    iget-object p1, p1, Ll/ۤۡܿ;->ܽ:Ll/۬ۢܿ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v2, p1, :cond_2

    .line 239
    monitor-exit v0

    return v9

    .line 241
    :cond_2
    :try_start_1
    invoke-virtual {v1, p1}, Ll/ۘܺܿ;->֫(Ll/۬ۢܿ;)Ll/ۘܺܿ;

    move-result-object p1

    goto :goto_1

    .line 236
    :cond_3
    :goto_0
    new-instance v1, Ll/ۘܺܿ;

    invoke-interface {v3}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v5

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v6

    iget-object v8, p1, Ll/ۤۡܿ;->ܽ:Ll/۬ۢܿ;

    move-object v2, v1

    move-object v7, v8

    invoke-direct/range {v2 .. v8}, Ll/ۘܺܿ;-><init>(Ll/۟᩺ᩳ;Ll/᩺ܺܿ;IILl/۬ۢܿ;Ll/۬ۢܿ;)V

    move-object p1, v1

    .line 243
    :goto_1
    iget-object v1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v2, v1, Ll/ܳۡܿ;->ۡ:Ll/۟ۖܿ;

    invoke-virtual {p1, v2}, Ll/ۘܺܿ;->֫(Ll/۟ۖܿ;)Ll/ۘܺܿ;

    move-result-object p1

    iput-object p1, v1, Ll/ܳۡܿ;->ۜ:Ll/ۘܺܿ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 244
    monitor-exit v0

    return v9

    .line 233
    :cond_4
    :goto_2
    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method private ֫(Ll/᩶᩸ᩳ;I)Z
    .locals 2

    .line 1025
    iget-object v0, p0, Ll/᩷ۡܿ;->ۧ:Ll/ܿۡܿ;

    iget-boolean v1, v0, Ll/ܿۡܿ;->᩻:Z

    if-eqz v1, :cond_0

    iget-object v1, v0, Ll/ܿۡܿ;->ܿ:Ll/᩶᩸ᩳ;

    if-ne v1, p1, :cond_0

    iget v1, v0, Ll/ܿۡܿ;->ᩳ:I

    if-ne v1, p2, :cond_0

    iget p2, v0, Ll/ܿۡܿ;->ܳ:I

    .line 1027
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static bridge synthetic ֫(Ll/᩷ۡܿ;Ll/᩶᩸ᩳ;I)Z
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Ll/᩷ۡܿ;->֫(Ll/᩶᩸ᩳ;I)Z

    move-result p0

    return p0
.end method

.method private ۖ(Ll/᩶᩸ᩳ;)Z
    .locals 3

    .line 963
    iget-object v0, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget-object v1, v0, Ll/ۜۡܿ;->᩶:Ll/᩶᩸ᩳ;

    if-ne v1, p1, :cond_0

    iget v1, v0, Ll/ۜۡܿ;->᩹:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    iget v1, v0, Ll/ۜۡܿ;->᩸:I

    .line 964
    invoke-interface {p1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v2

    if-ne v1, v2, :cond_0

    iget v0, v0, Ll/ۜۡܿ;->ۙ:I

    .line 965
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private ۗ()V
    .locals 2

    .line 936
    iget-object v0, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    const/4 v1, 0x0

    iput-object v1, v0, Ll/ۜۡܿ;->֡:Ll/᩶᩸ᩳ;

    .line 937
    iput-object v1, v0, Ll/ۜۡܿ;->᩵:Ll/ۛۡܿ;

    .line 938
    iput-object v1, v0, Ll/ۜۡܿ;->ۚ:Ll/۟ۡܿ;

    const/4 v1, 0x0

    .line 939
    iput-boolean v1, v0, Ll/ۜۡܿ;->ᩴ:Z

    return-void
.end method

.method private declared-synchronized ۘ(Ll/᩶᩸ᩳ;)Z
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 672
    :try_start_0
    invoke-direct {p0}, Ll/᩷ۡܿ;->۫()Z

    .line 673
    iget-object v1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-boolean v1, v1, Ll/ܳۡܿ;->ܿ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 674
    monitor-exit v0

    return v2

    .line 1781
    :cond_0
    :try_start_1
    invoke-interface {p1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v1

    invoke-direct {p0, p1, v1}, Ll/᩷ۡܿ;->֫(Ll/᩶᩸ᩳ;I)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 2184
    iget-object v1, p0, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    invoke-virtual {v1}, Ll/᩺ۢܿ;->֫()Ll/ܶۜܿ;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 1785
    :cond_1
    invoke-direct {p0}, Ll/᩷ۡܿ;->۠()V

    .line 1787
    invoke-interface {p1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v1

    iget-object v2, p0, Ll/᩷ۡܿ;->ۧ:Ll/ܿۡܿ;

    iget-object v2, v2, Ll/ܿۡܿ;->ܽ:Ll/᩺ۖܿ;

    .line 1786
    invoke-direct {p0, p1, v1, v2}, Ll/᩷ۡܿ;->֫(Ll/᩶᩸ᩳ;ILl/᩺ۖܿ;)Ll/ᩳۡܿ;

    move-result-object p1

    .line 1788
    iget-object v1, p0, Ll/᩷ۡܿ;->ۧ:Ll/ܿۡܿ;

    const/4 v2, 0x1

    iput-boolean v2, v1, Ll/ܿۡܿ;->ۜ:Z

    .line 1789
    iput-object p1, v1, Ll/ܿۡܿ;->ۧ:Ll/ᩳۡܿ;

    .line 1790
    iget-object v1, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v1, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 677
    monitor-exit v0

    return v2

    .line 679
    :cond_2
    :goto_0
    :try_start_2
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->᩷(Ll/᩶᩸ᩳ;)Z

    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v1, :cond_3

    .line 680
    monitor-exit v0

    return v2

    .line 682
    :cond_3
    :try_start_3
    iget-object v1, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget-object v1, v1, Ll/ۜۡܿ;->ۧ:Ll/᩶᩸ᩳ;

    if-eqz v1, :cond_4

    .line 684
    invoke-direct {p0}, Ll/᩷ۡܿ;->᩹()V

    .line 686
    :cond_4
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ۡ(Ll/᩶᩸ᩳ;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 763
    invoke-direct {p0, p1, v2}, Ll/᩷ۡܿ;->ۧ(Ll/᩶᩸ᩳ;Z)V

    goto/16 :goto_3

    .line 688
    :cond_5
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ᩳ(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 689
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ܺ(Ll/᩶᩸ᩳ;)Z

    move-result v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez v1, :cond_6

    .line 690
    monitor-exit v0

    return v2

    .line 692
    :cond_6
    :try_start_4
    iget-object v1, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget-boolean v1, v1, Ll/ۜۡܿ;->ܺ:Z

    if-eqz v1, :cond_9

    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ۢ(Ll/᩶᩸ᩳ;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 694
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ۖ(Ll/᩶᩸ᩳ;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 695
    iget-object v1, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget v1, v1, Ll/ۜۡܿ;->᩹:I

    goto :goto_1

    :cond_7
    iget-object v1, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget v1, v1, Ll/ۜۡܿ;->ۖ:I

    .line 696
    :goto_1
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ۖ(Ll/᩶᩸ᩳ;)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 697
    iget-object v3, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget v3, v3, Ll/ۜۡܿ;->ܶ:I

    goto :goto_2

    :cond_8
    iget-object v3, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget v3, v3, Ll/ۜۡܿ;->ۢ:I

    .line 698
    :goto_2
    invoke-direct {p0}, Ll/᩷ۡܿ;->ۙ()V

    .line 822
    invoke-direct {p0, p1, v1, v3, v2}, Ll/᩷ۡܿ;->֫(Ll/᩶᩸ᩳ;IIZ)V

    goto :goto_3

    .line 700
    :cond_9
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ۢ(Ll/᩶᩸ᩳ;)Z

    move-result v1

    if-nez v1, :cond_c

    invoke-direct {p0}, Ll/᩷ۡܿ;->۬()Z

    move-result v1

    if-nez v1, :cond_c

    .line 701
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ۖ(Ll/᩶᩸ᩳ;)Z

    move-result v1

    if-eqz v1, :cond_b

    iget-object v1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v1, v1, Ll/ܳۡܿ;->ۡ:Ll/۟ۖܿ;

    if-eqz v1, :cond_a

    iget-object v3, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget v4, v3, Ll/ۜۡܿ;->᩹:I

    iget v3, v3, Ll/ۜۡܿ;->ܶ:I

    .line 703
    invoke-virtual {v1, v4, v3}, Ll/۟ۖܿ;->֫(II)Z

    move-result v1

    if-nez v1, :cond_b

    .line 705
    :cond_a
    iget-object v1, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget v3, v1, Ll/ۜۡܿ;->᩹:I

    iget v1, v1, Ll/ۜۡܿ;->ܶ:I

    .line 822
    invoke-direct {p0, p1, v3, v1, v2}, Ll/᩷ۡܿ;->֫(Ll/᩶᩸ᩳ;IIZ)V

    goto :goto_3

    .line 706
    :cond_b
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ۖ(Ll/᩶᩸ᩳ;)Z

    move-result v1

    if-nez v1, :cond_c

    .line 954
    iget-object v1, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    const/4 v3, -0x1

    iput v3, v1, Ll/ۜۡܿ;->᩹:I

    .line 955
    iput v3, v1, Ll/ۜۡܿ;->ܶ:I

    .line 956
    iput v2, v1, Ll/ۜۡܿ;->᩸:I

    .line 957
    iput v2, v1, Ll/ۜۡܿ;->ۙ:I

    const/4 v3, 0x0

    .line 958
    iput-object v3, v1, Ll/ۜۡܿ;->᩶:Ll/᩶᩸ᩳ;

    .line 708
    iget-object v1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v1, v1, Ll/ܳۡܿ;->ۡ:Ll/۟ۖܿ;

    if-eqz v1, :cond_c

    .line 709
    invoke-virtual {v1}, Ll/۟ۖܿ;->᩻()Z

    move-result v1

    if-eqz v1, :cond_c

    .line 710
    iget-object v1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v1, v1, Ll/ܳۡܿ;->ۡ:Ll/۟ۖܿ;

    invoke-virtual {v1}, Ll/۟ۖܿ;->ۧ()I

    move-result v1

    iget-object v3, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v3, v3, Ll/ܳۡܿ;->ۡ:Ll/۟ۖܿ;

    .line 711
    invoke-virtual {v3}, Ll/۟ۖܿ;->֫()I

    move-result v3

    .line 710
    invoke-direct {p0, p1, v1, v3}, Ll/᩷ۡܿ;->᩻(Ll/᩶᩸ᩳ;II)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 716
    :cond_c
    :goto_3
    monitor-exit v0

    return v2

    :catchall_0
    move-exception p1

    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p1
.end method

.method private ۙ()V
    .locals 2

    .line 908
    iget-object v0, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    const/4 v1, -0x1

    iput v1, v0, Ll/ۜۡܿ;->ۖ:I

    .line 909
    iput v1, v0, Ll/ۜۡܿ;->ۢ:I

    const/4 v1, 0x0

    .line 910
    iput v1, v0, Ll/ۜۡܿ;->ۡ:I

    .line 911
    iput v1, v0, Ll/ۜۡܿ;->ۘ:I

    .line 912
    iput v1, v0, Ll/ۜۡܿ;->᩷:I

    .line 913
    iput-boolean v1, v0, Ll/ۜۡܿ;->ܺ:Z

    return-void
.end method

.method private ۜ(Ll/᩶᩸ᩳ;)V
    .locals 9

    .line 2014
    invoke-direct {p0}, Ll/᩷ۡܿ;->۫()Z

    .line 2015
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->᩷(Ll/᩶᩸ᩳ;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Ll/᩷ۡܿ;->۬()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v0, v0, Ll/ܳۡܿ;->᩷:Ll/ۢۖܿ;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v0, v0, Ll/ܳۡܿ;->᩷:Ll/ۢۖܿ;

    .line 2016
    invoke-virtual {v0}, Ll/ۢۖܿ;->֫()I

    move-result v0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ne v0, v1, :cond_1

    goto :goto_1

    .line 2020
    :cond_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const v1, 0xf4240

    const/4 v2, 0x0

    if-le v0, v1, :cond_2

    .line 2021
    invoke-direct {p0, p1, v2}, Ll/᩷ۡܿ;->֫(Ll/᩶᩸ᩳ;Z)V

    .line 2022
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ܺ(Ll/᩶᩸ᩳ;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2023
    iget-object v0, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget v1, v0, Ll/ۜۡܿ;->᩹:I

    iget v0, v0, Ll/ۜۡܿ;->ܶ:I

    .line 822
    invoke-direct {p0, p1, v1, v0, v2}, Ll/᩷ۡܿ;->֫(Ll/᩶᩸ᩳ;IIZ)V

    return-void

    .line 879
    :cond_2
    invoke-direct {p0, v2, v2, v2}, Ll/᩷ۡܿ;->֫(ZZZ)V

    .line 2184
    iget-object v0, p0, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    invoke-virtual {v0}, Ll/᩺ۢܿ;->֫()Ll/ܶۜܿ;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_1

    .line 2032
    :cond_3
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-virtual {v0}, Ll/ܶۜܿ;->ܳ()Ll/᩸᩷ܿ;

    move-result-object v0

    if-nez v1, :cond_4

    .line 1917
    invoke-static {}, Ll/ۢۖܿ;->ܽ()Ll/ۢۖܿ;

    move-result-object v0

    goto :goto_0

    .line 1919
    :cond_4
    invoke-static {v1, v0, v2}, Ll/ۢۖܿ;->֫(ILl/᩸᩷ܿ;Z)Ll/ۢۖܿ;

    move-result-object v0

    :goto_0
    move-object v4, v0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, p0

    .line 2032
    invoke-direct/range {v3 .. v8}, Ll/᩷ۡܿ;->֫(Ll/ۢۖܿ;Ll/ᩳۢܿ;ZLl/۟ۖܿ;Z)V

    .line 2035
    iget-object v0, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    const/4 v1, 0x1

    iput-boolean v1, v0, Ll/ܳۡܿ;->ܿ:Z

    .line 2036
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ۡ(Ll/᩶᩸ᩳ;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 763
    invoke-direct {p0, p1, v2}, Ll/᩷ۡܿ;->ۧ(Ll/᩶᩸ᩳ;Z)V

    :cond_5
    :goto_1
    return-void
.end method

.method private ۠()V
    .locals 3

    .line 1016
    iget-object v0, p0, Ll/᩷ۡܿ;->ۧ:Ll/ܿۡܿ;

    iget-object v1, v0, Ll/ܿۡܿ;->ۧ:Ll/ᩳۡܿ;

    const/4 v2, 0x0

    .line 1017
    iput-object v2, v0, Ll/ܿۡܿ;->ۧ:Ll/ᩳۡܿ;

    if-eqz v1, :cond_0

    .line 1019
    iget-object v0, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method private ۡ(Ll/᩶᩸ᩳ;)Z
    .locals 1

    .line 749
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ܽ(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 750
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ܽܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 751
    invoke-virtual {p1}, Ll/۫ۨᩳ;->᩹ۧ()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private ۢ(Ll/᩶᩸ᩳ;)Z
    .locals 3

    .line 1113
    iget-object v0, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget-object v1, v0, Ll/ۜۡܿ;->۠:Ll/᩶᩸ᩳ;

    if-ne v1, p1, :cond_0

    iget v1, v0, Ll/ۜۡܿ;->ۖ:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    iget v1, v0, Ll/ۜۡܿ;->ۡ:I

    .line 1114
    invoke-interface {p1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v2

    if-ne v1, v2, :cond_0

    iget v0, v0, Ll/ۜۡܿ;->ۘ:I

    .line 1115
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static bridge synthetic ۧ(Ll/᩷ۡܿ;)Ll/ܳۡܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    return-object p0
.end method

.method private ۧ(Ll/᩶᩸ᩳ;ILl/᩺ۖܿ;Ll/ܽۡܿ;)Ll/ᩳۡܿ;
    .locals 1

    .line 1743
    iget-object v0, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v0

    if-ne v0, p1, :cond_1

    .line 1744
    invoke-interface {p1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v0

    if-ne v0, p2, :cond_1

    .line 2184
    iget-object v0, p0, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    invoke-virtual {v0}, Ll/᩺ۢܿ;->֫()Ll/ܶۜܿ;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 1748
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Ll/᩷ۡܿ;->֫(Ll/᩶᩸ᩳ;ILl/᩺ۖܿ;Ll/ܽۡܿ;)Ll/᩺ۖܿ;

    move-result-object p3

    .line 1749
    invoke-direct {p0}, Ll/᩷ۡܿ;->۠()V

    .line 1750
    invoke-direct {p0, p1, p2, p3}, Ll/᩷ۡܿ;->֫(Ll/᩶᩸ᩳ;ILl/᩺ۖܿ;)Ll/ᩳۡܿ;

    move-result-object p1

    .line 1751
    iget-object p2, p0, Ll/᩷ۡܿ;->ۧ:Ll/ܿۡܿ;

    iput-object p1, p2, Ll/ܿۡܿ;->ۧ:Ll/ᩳۡܿ;

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private ۧ(Ll/᩶᩸ᩳ;Z)V
    .locals 3

    .line 768
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ᩴ(Ll/᩶᩸ᩳ;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 771
    :cond_0
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->᩷(Ll/᩶᩸ᩳ;)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    return-void

    .line 775
    :cond_1
    iget-object v0, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget-object v0, v0, Ll/ۜۡܿ;->ۧ:Ll/᩶᩸ᩳ;

    if-eqz v0, :cond_2

    .line 776
    invoke-direct {p0}, Ll/᩷ۡܿ;->᩹()V

    .line 778
    :cond_2
    invoke-direct {p0}, Ll/᩷ۡܿ;->ۗ()V

    .line 779
    iget-object v0, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    const/4 v1, 0x0

    iput-boolean v1, v0, Ll/ۜۡܿ;->֨:Z

    .line 780
    iput-object p1, v0, Ll/ۜۡܿ;->۠:Ll/᩶᩸ᩳ;

    if-eqz p2, :cond_3

    .line 782
    iput-object p1, v0, Ll/ۜۡܿ;->֡:Ll/᩶᩸ᩳ;

    .line 784
    :cond_3
    iget-object p2, p0, Ll/᩷ۡܿ;->ܳ:Ll/ܽܺܿ;

    .line 2190
    iget-object v0, p0, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    invoke-virtual {v0}, Ll/᩺ۢܿ;->ۧ()Ll/᩺ܺܿ;

    move-result-object v0

    .line 784
    iget-object v1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v1, v1, Ll/ܳۡܿ;->᩷:Ll/ۢۖܿ;

    iget-object v2, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget v2, v2, Ll/ܳۡܿ;->ᩳ:I

    invoke-virtual {p2, v0, p1, v1, v2}, Ll/ܽܺܿ;->֫(Ll/᩺ܺܿ;Ll/᩶᩸ᩳ;Ll/ۢۖܿ;I)V

    return-void
.end method

.method private ۫()Z
    .locals 12

    .line 2190
    iget-object v0, p0, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    invoke-virtual {v0}, Ll/᩺ۢܿ;->ۧ()Ll/᩺ܺܿ;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 2199
    invoke-virtual {v0}, Ll/᩺ܺܿ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 2184
    :cond_0
    iget-object v0, p0, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    invoke-virtual {v0}, Ll/᩺ۢܿ;->֫()Ll/ܶۜܿ;

    move-result-object v0

    .line 2203
    iget-object v2, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v4, v2, Ll/ܳۡܿ;->᩷:Ll/ۢۖܿ;

    .line 2204
    iget-object v2, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v9, v2, Ll/ܳۡܿ;->ۢ:Ljava/lang/Integer;

    .line 2205
    iget-boolean v2, v2, Ll/ܳۡܿ;->ܿ:Z

    const/4 v11, 0x1

    if-eqz v2, :cond_1

    if-eqz v4, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 2206
    :goto_0
    invoke-static {v0}, Ll/᩺ۢܿ;->֫(Ll/ܶۜܿ;)Ll/᩺ۢܿ;

    move-result-object v0

    .line 879
    invoke-direct {p0, v1, v1, v1}, Ll/᩷ۡܿ;->֫(ZZZ)V

    .line 2209
    iput-object v0, p0, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    .line 2210
    invoke-virtual {v0}, Ll/᩺ۢܿ;->ۧ()Ll/᩺ܺܿ;

    move-result-object v0

    if-nez v0, :cond_2

    .line 2211
    iget-object v0, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iput-boolean v1, v0, Ll/ܳۡܿ;->ܿ:Z

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    .line 2212
    invoke-direct/range {v2 .. v7}, Ll/᩷ۡܿ;->֫(Ll/ۢۖܿ;Ll/ᩳۢܿ;ZLl/۟ۖܿ;Z)V

    goto :goto_1

    :cond_2
    const/4 v8, 0x1

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, p0

    .line 1430
    invoke-direct/range {v3 .. v10}, Ll/᩷ۡܿ;->֫(Ll/ۢۖܿ;Ll/ᩳۢܿ;ZLl/۟ۖܿ;ZLjava/lang/Integer;Z)V

    .line 2216
    iget-object v0, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iput-boolean v2, v0, Ll/ܳۡܿ;->ܿ:Z

    :goto_1
    return v11

    :cond_3
    :goto_2
    return v1
.end method

.method private ۬()Z
    .locals 4

    .line 1126
    iget-object v0, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget v1, v0, Ll/ۜۡܿ;->ܳ:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    goto :goto_0

    .line 1129
    :cond_0
    iget-object v1, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    .line 1130
    iget-object v2, v0, Ll/ۜۡܿ;->᩻:Ll/᩶᩸ᩳ;

    if-ne v2, v1, :cond_1

    iget v2, v0, Ll/ۜۡܿ;->ܿ:I

    .line 1131
    invoke-interface {v1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v3

    if-ne v2, v3, :cond_1

    iget v0, v0, Ll/ۜۡܿ;->ۜ:I

    .line 1132
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public static ܳ(Ll/᩷ۡܿ;)Ll/ܶۜܿ;
    .locals 0

    .line 2184
    iget-object p0, p0, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    invoke-virtual {p0}, Ll/᩺ۢܿ;->֫()Ll/ܶۜܿ;

    move-result-object p0

    return-object p0
.end method

.method private ܳ(Ll/᩶᩸ᩳ;II)V
    .locals 4

    .line 864
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ۢ(Ll/᩶᩸ᩳ;)Z

    move-result v0

    const/4 v1, -0x1

    iget-object v2, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    if-eqz v0, :cond_0

    iget v0, v2, Ll/ۜۡܿ;->ۖ:I

    iget v3, v2, Ll/ۜۡܿ;->ۢ:I

    .line 865
    invoke-static {v0, v3, p2, p3}, Ll/᩷ۡܿ;->֫(IIII)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 866
    :cond_0
    iget v0, v2, Ll/ۜۡܿ;->ۖ:I

    if-eq v0, v1, :cond_1

    .line 867
    iget-object v0, p0, Ll/᩷ۡܿ;->ܳ:Ll/ܽܺܿ;

    invoke-virtual {v0}, Ll/ܽܺܿ;->ܿ()V

    .line 868
    invoke-direct {p0}, Ll/᩷ۡܿ;->ۙ()V

    .line 870
    :cond_1
    :goto_0
    iget v0, v2, Ll/ۜۡܿ;->ܳ:I

    if-eq v0, v1, :cond_3

    invoke-direct {p0}, Ll/᩷ۡܿ;->۬()Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, v2, Ll/ۜۡܿ;->ܳ:I

    iget v1, v2, Ll/ۜۡܿ;->ᩳ:I

    .line 871
    invoke-static {v0, v1, p2, p3}, Ll/᩷ۡܿ;->֫(IIII)Z

    move-result p2

    if-nez p2, :cond_3

    .line 872
    :cond_2
    invoke-direct {p0}, Ll/᩷ۡܿ;->᩶()V

    .line 874
    :cond_3
    iput-object p1, v2, Ll/ۜۡܿ;->۠:Ll/᩶᩸ᩳ;

    return-void
.end method

.method private ܳ(Ljava/lang/CharSequence;)Z
    .locals 1

    .line 737
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ܿ(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    const v0, 0xf4240

    if-le p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private ܶ()V
    .locals 3

    .line 1004
    invoke-direct {p0}, Ll/᩷ۡܿ;->۠()V

    .line 1005
    sget-object v0, Ll/᩺ۖܿ;->ۧ:Ll/᩺ۖܿ;

    iget-object v1, p0, Ll/᩷ۡܿ;->ۧ:Ll/ܿۡܿ;

    iput-object v0, v1, Ll/ܿۡܿ;->ܽ:Ll/᩺ۖܿ;

    const/4 v0, 0x0

    .line 1006
    iput-boolean v0, v1, Ll/ܿۡܿ;->᩻:Z

    .line 1007
    iput v0, v1, Ll/ܿۡܿ;->ᩳ:I

    .line 1008
    iput v0, v1, Ll/ܿۡܿ;->ܳ:I

    const/4 v2, 0x0

    .line 1009
    iput-object v2, v1, Ll/ܿۡܿ;->ܿ:Ll/᩶᩸ᩳ;

    .line 1010
    iput-boolean v0, v1, Ll/ܿۡܿ;->֫:Z

    .line 1011
    iput-boolean v0, v1, Ll/ܿۡܿ;->ۜ:Z

    return-void
.end method

.method private ܺ(Ll/᩶᩸ᩳ;)Z
    .locals 1

    .line 756
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ᩳ(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 757
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ܽܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 758
    invoke-virtual {p1}, Ll/۫ۨᩳ;->᩹ۧ()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static bridge synthetic ܽ(Ll/᩷ۡܿ;)Ll/۫ۨᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    return-object p0
.end method

.method private ܽ(Ljava/lang/CharSequence;)Z
    .locals 1

    .line 732
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ܿ(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    const v0, 0xf4240

    if-gt p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private ܿ(Ll/᩶᩸ᩳ;II)V
    .locals 4

    .line 2281
    iget-object v0, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget v1, v0, Ll/ۜۡܿ;->ۖ:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    .line 2282
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ۢ(Ll/᩶᩸ᩳ;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, v0, Ll/ۜۡܿ;->ۖ:I

    iget v3, v0, Ll/ۜۡܿ;->ۢ:I

    .line 2283
    invoke-static {v1, v3, p2, p3}, Ll/᩷ۡܿ;->֫(IIII)Z

    move-result v1

    if-nez v1, :cond_1

    .line 2284
    :cond_0
    iget-object v1, p0, Ll/᩷ۡܿ;->ܳ:Ll/ܽܺܿ;

    invoke-virtual {v1}, Ll/ܽܺܿ;->ܿ()V

    .line 2285
    iput-object p1, v0, Ll/ۜۡܿ;->۠:Ll/᩶᩸ᩳ;

    .line 2286
    invoke-direct {p0}, Ll/᩷ۡܿ;->ۙ()V

    .line 2288
    :cond_1
    iget p1, v0, Ll/ۜۡܿ;->ܳ:I

    if-eq p1, v2, :cond_3

    .line 2289
    invoke-direct {p0}, Ll/᩷ۡܿ;->۬()Z

    move-result p1

    if-eqz p1, :cond_2

    iget p1, v0, Ll/ۜۡܿ;->ܳ:I

    iget v0, v0, Ll/ۜۡܿ;->ᩳ:I

    .line 2290
    invoke-static {p1, v0, p2, p3}, Ll/᩷ۡܿ;->֫(IIII)Z

    move-result p1

    if-nez p1, :cond_3

    .line 2291
    :cond_2
    invoke-direct {p0}, Ll/᩷ۡܿ;->᩶()V

    :cond_3
    return-void
.end method

.method public static bridge synthetic ܿ(Ll/᩷ۡܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩷ۡܿ;->᩸()V

    return-void
.end method

.method private ܿ(Ljava/lang/CharSequence;)Z
    .locals 1

    if-eqz p1, :cond_0

    .line 2190
    iget-object v0, p0, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    invoke-virtual {v0}, Ll/᩺ۢܿ;->ۧ()Ll/᩺ܺܿ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2184
    iget-object v0, p0, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    invoke-virtual {v0}, Ll/᩺ۢܿ;->֫()Ll/ܶۜܿ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 726
    instance-of v0, p1, Ll/᩶᩸ᩳ;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    .line 727
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v0

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static bridge synthetic ᩳ(Ll/᩷ۡܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩷ۡܿ;->ܶ()V

    return-void
.end method

.method private ᩳ(Ljava/lang/CharSequence;)Z
    .locals 1

    .line 2190
    iget-object v0, p0, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    invoke-virtual {v0}, Ll/᩺ۢܿ;->ۧ()Ll/᩺ܺܿ;

    move-result-object v0

    .line 743
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ܳ(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private ᩴ(Ll/᩶᩸ᩳ;)Z
    .locals 1

    .line 1107
    iget-object v0, p0, Ll/᩷ۡܿ;->ۧ:Ll/ܿۡܿ;

    iget-boolean v0, v0, Ll/ܿۡܿ;->ۜ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۛۧ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1108
    invoke-interface {p1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v0

    invoke-direct {p0, p1, v0}, Ll/᩷ۡܿ;->֫(Ll/᩶᩸ᩳ;I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private ᩶()V
    .locals 2

    .line 918
    iget-object v0, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    const/4 v1, -0x1

    iput v1, v0, Ll/ۜۡܿ;->ܳ:I

    .line 919
    iput v1, v0, Ll/ۜۡܿ;->ᩳ:I

    const/4 v1, 0x0

    .line 920
    iput v1, v0, Ll/ۜۡܿ;->ܿ:I

    .line 921
    iput v1, v0, Ll/ۜۡܿ;->ۜ:I

    const/4 v1, 0x0

    .line 922
    iput-object v1, v0, Ll/ۜۡܿ;->᩻:Ll/᩶᩸ᩳ;

    .line 923
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method private ᩷(Ll/᩶᩸ᩳ;)Z
    .locals 3

    .line 1137
    iget-object v0, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget-object v1, v0, Ll/ۜۡܿ;->ۧ:Ll/᩶᩸ᩳ;

    if-ne v1, p1, :cond_0

    iget v1, v0, Ll/ۜۡܿ;->֫:I

    .line 1138
    invoke-interface {p1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v2

    if-ne v1, v2, :cond_0

    iget v0, v0, Ll/ۜۡܿ;->ܽ:I

    .line 1139
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private ᩸()V
    .locals 3

    .line 995
    iget-object v0, p0, Ll/᩷ۡܿ;->ۧ:Ll/ܿۡܿ;

    const/4 v1, 0x0

    iput-object v1, v0, Ll/ܿۡܿ;->ۢ:Ll/۟ۖܿ;

    .line 996
    sget-object v2, Ll/᩺ۖܿ;->ۧ:Ll/᩺ۖܿ;

    iput-object v2, v0, Ll/ܿۡܿ;->ۡ:Ll/᩺ۖܿ;

    const/4 v2, 0x0

    .line 997
    iput v2, v0, Ll/ܿۡܿ;->᩷:I

    .line 998
    iput v2, v0, Ll/ܿۡܿ;->ۖ:I

    .line 999
    iput-object v1, v0, Ll/ܿۡܿ;->ܺ:Ll/᩶᩸ᩳ;

    return-void
.end method

.method private ᩹()V
    .locals 2

    .line 928
    iget-object v0, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    const/4 v1, 0x0

    iput v1, v0, Ll/ۜۡܿ;->֫:I

    .line 929
    iput v1, v0, Ll/ۜۡܿ;->ܽ:I

    const/4 v1, 0x0

    .line 930
    iput-object v1, v0, Ll/ۜۡܿ;->ۧ:Ll/᩶᩸ᩳ;

    .line 931
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method private ᩻(Ll/᩶᩸ᩳ;II)V
    .locals 1

    .line 944
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-static {p2, p3, v0}, Ll/ۧ۫ᩴ;->checkFromToIndex(III)I

    .line 945
    iget-object v0, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iput p2, v0, Ll/ۜۡܿ;->᩹:I

    .line 946
    iput p3, v0, Ll/ۜۡܿ;->ܶ:I

    .line 947
    invoke-interface {p1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result p2

    iput p2, v0, Ll/ۜۡܿ;->᩸:I

    .line 948
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p2

    iput p2, v0, Ll/ۜۡܿ;->ۙ:I

    .line 949
    iput-object p1, v0, Ll/ۜۡܿ;->᩶:Ll/᩶᩸ᩳ;

    return-void
.end method


# virtual methods
.method public final ֡()V
    .locals 1

    .line 522
    iget-object v0, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->᩵ۧ()V

    return-void
.end method

.method public final declared-synchronized ֨()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, 0x0

    .line 2145
    :try_start_0
    invoke-direct {p0, v1}, Ll/᩷ۡܿ;->֫(Ll/ܶۜܿ;)V

    .line 2146
    iget-object v1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    const/4 v2, 0x0

    iput-boolean v2, v1, Ll/ܳۡܿ;->ܿ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2147
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ֫()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 636
    :try_start_0
    iget-object v1, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget-object v1, v1, Ll/ۜۡܿ;->֡:Ll/᩶᩸ᩳ;

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 879
    invoke-direct {p0, v1, v1, v1}, Ll/᩷ۡܿ;->֫(ZZZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 639
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ֫(IIILjava/lang/CharSequence;)V
    .locals 21

    move-object/from16 v8, p0

    move/from16 v0, p1

    move-object/from16 v1, p4

    move-object/from16 v11, p0

    .line 3
    monitor-enter v11

    const/4 v2, 0x0

    if-nez p2, :cond_0

    if-nez p3, :cond_0

    .line 2108
    :try_start_0
    iget-object v0, v8, Ll/᩷ۡܿ;->᩻:Ll/᩻ܺܿ;

    iput-boolean v2, v0, Ll/᩻ܺܿ;->ܽ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2109
    monitor-exit v11

    return-void

    .line 2111
    :cond_0
    :try_start_1
    invoke-direct/range {p0 .. p0}, Ll/᩷ۡܿ;->۫()Z

    .line 2184
    iget-object v3, v8, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    invoke-virtual {v3}, Ll/᩺ۢܿ;->֫()Ll/ܶۜܿ;

    move-result-object v7

    if-eqz v7, :cond_5

    .line 2113
    iget-object v3, v8, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-boolean v3, v3, Ll/ܳۡܿ;->ܿ:Z

    if-eqz v3, :cond_5

    instance-of v3, v1, Ll/᩶᩸ᩳ;

    if-eqz v3, :cond_5

    move-object v9, v1

    check-cast v9, Ll/᩶᩸ᩳ;

    .line 2114
    invoke-direct {v8, v9}, Ll/᩷ۡܿ;->ܿ(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    goto/16 :goto_2

    .line 2118
    :cond_1
    iget-object v1, v8, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->᩹ۧ()Z

    move-result v10

    .line 2119
    iget-object v1, v8, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v1, v1, Ll/ܳۡܿ;->ۜ:Ll/ۘܺܿ;

    if-eqz v1, :cond_4

    if-lez v0, :cond_2

    .line 2122
    iget-object v2, v8, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v2, v2, Ll/ܳۡܿ;->᩷:Ll/ۢۖܿ;

    if-eqz v2, :cond_2

    iget-object v2, v8, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v2, v2, Ll/ܳۡܿ;->᩷:Ll/ۢۖܿ;

    invoke-virtual {v2}, Ll/ۢۖܿ;->֫()I

    move-result v2

    if-gt v0, v2, :cond_2

    .line 2123
    iget-object v2, v8, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v2, v2, Ll/ܳۡܿ;->᩷:Ll/ۢۖܿ;

    add-int/lit8 v3, v0, -0x1

    invoke-virtual {v2, v3}, Ll/ۢۖܿ;->֫(I)Ll/᩸᩷ܿ;

    move-result-object v2

    goto :goto_0

    :cond_2
    invoke-virtual {v7}, Ll/ܶۜܿ;->ܳ()Ll/᩸᩷ܿ;

    move-result-object v2

    :goto_0
    move-object/from16 v20, v2

    .line 2124
    iget-object v2, v8, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    if-eqz v10, :cond_3

    const/4 v1, 0x0

    goto :goto_1

    .line 2190
    :cond_3
    iget-object v3, v8, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    invoke-virtual {v3}, Ll/᩺ۢܿ;->ۧ()Ll/᩺ܺܿ;

    move-result-object v14

    .line 2125
    invoke-interface {v9}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v15

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v16

    move-object v12, v1

    move-object v13, v9

    move/from16 v17, p1

    move/from16 v18, p2

    move/from16 v19, p3

    .line 2124
    invoke-virtual/range {v12 .. v20}, Ll/ۘܺܿ;->֫(Ll/᩶᩸ᩳ;Ll/᩺ܺܿ;IIIIILl/᩸᩷ܿ;)Ll/ۘܺܿ;

    move-result-object v1

    :goto_1
    iput-object v1, v2, Ll/ܳۡܿ;->ۜ:Ll/ۘܺܿ;

    :cond_4
    move-object/from16 v1, p0

    move-object v2, v9

    move/from16 v3, p1

    move/from16 v4, p2

    move/from16 v5, p3

    move v6, v10

    .line 2128
    invoke-direct/range {v1 .. v6}, Ll/᩷ۡܿ;->֫(Ll/᩶᩸ᩳ;IIIZ)V

    move-object/from16 v1, p0

    move-object v2, v9

    move/from16 v3, p1

    move/from16 v4, p2

    move/from16 v5, p3

    move-object v6, v7

    move v7, v10

    .line 2130
    invoke-direct/range {v1 .. v7}, Ll/᩷ۡܿ;->֫(Ll/᩶᩸ᩳ;IIILl/ܶۜܿ;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2132
    monitor-exit v11

    return-void

    .line 2115
    :cond_5
    :goto_2
    :try_start_2
    iget-object v0, v8, Ll/᩷ۡܿ;->᩻:Ll/᩻ܺܿ;

    iput-boolean v2, v0, Ll/᩻ܺܿ;->ܽ:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 2116
    monitor-exit v11

    return-void

    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v11
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method public final ֫(Ll/۟ۢܿ;II)V
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, -0x1

    .line 249
    invoke-virtual {p1, v1, v2, v2, v0}, Ll/۟ۢܿ;->֫(Ll/۬ۢܿ;III)V

    .line 250
    iget-object v0, p0, Ll/᩷ۡܿ;->ܳ:Ll/ܽܺܿ;

    invoke-virtual {v0}, Ll/ܽܺܿ;->ۧ()Ll/ۤۡܿ;

    move-result-object v0

    .line 251
    iget-object v1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v1, v1, Ll/ܳۡܿ;->ۜ:Ll/ۘܺܿ;

    if-nez v0, :cond_0

    if-nez v1, :cond_0

    goto/16 :goto_0

    .line 2190
    :cond_0
    iget-object v3, p0, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    invoke-virtual {v3}, Ll/᩺ۢܿ;->ۧ()Ll/᩺ܺܿ;

    move-result-object v3

    .line 254
    iget-object v4, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v4}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v4

    .line 255
    iget-object v5, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-boolean v5, v5, Ll/ܳۡܿ;->ܿ:Z

    if-eqz v5, :cond_8

    if-eqz v3, :cond_8

    invoke-virtual {v3}, Ll/᩺ܺܿ;->ܽ()Z

    move-result v5

    if-eqz v5, :cond_8

    iget-object v5, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    .line 256
    invoke-virtual {v5}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v5

    if-eqz v5, :cond_8

    iget-object v5, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v5}, Ll/۫ۨᩳ;->ܽܽ()Z

    move-result v5

    if-eqz v5, :cond_8

    iget-object v5, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    .line 257
    invoke-virtual {v5}, Ll/۫ۨᩳ;->᩹ۧ()Z

    move-result v5

    if-nez v5, :cond_8

    iget-object v5, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-boolean v5, v5, Ll/ܳۡܿ;->֫:Z

    if-eqz v5, :cond_1

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_3

    if-eqz v1, :cond_2

    .line 259
    iget-object v5, v1, Ll/ۘܺܿ;->֫:Ll/۬ۢܿ;

    iget-object v6, v0, Ll/ۤۡܿ;->ܽ:Ll/۬ۢܿ;

    if-eq v5, v6, :cond_3

    .line 260
    :cond_2
    invoke-direct {p0, v0}, Ll/᩷ۡܿ;->֫(Ll/ۤۡܿ;)Z

    .line 261
    iget-object v0, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v1, v0, Ll/ܳۡܿ;->ۜ:Ll/ۘܺܿ;

    :cond_3
    if-eqz v1, :cond_8

    .line 263
    invoke-interface {v4}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v0

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v5

    invoke-virtual {v1, v4, v3, v0, v5}, Ll/ۘܺܿ;->֫(Ljava/lang/Object;Ll/᩺ܺܿ;II)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    .line 264
    :cond_4
    iget-object v0, v1, Ll/ۘܺܿ;->ܽ:Ll/۬ۢܿ;

    .line 265
    iget v1, v0, Ll/۬ۢܿ;->ۧ:I

    if-le v1, p2, :cond_8

    iget v1, v0, Ll/۬ۢܿ;->ܽ:I

    if-lt v1, p3, :cond_5

    goto :goto_0

    .line 266
    :cond_5
    iget-object v1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v1, v1, Ll/ܳۡܿ;->ۡ:Ll/۟ۖܿ;

    if-eqz v1, :cond_6

    .line 268
    invoke-virtual {v1}, Ll/۟ۖܿ;->᩻()Z

    move-result v4

    if-eqz v4, :cond_6

    .line 269
    invoke-virtual {v1}, Ll/۟ۖܿ;->ۧ()I

    move-result v2

    .line 270
    invoke-virtual {v1}, Ll/۟ۖܿ;->֫()I

    move-result v1

    .line 271
    iget v4, v0, Ll/۬ۢܿ;->ܽ:I

    invoke-static {p2, v4}, Ljava/lang/Math;->max(II)I

    move-result p2

    if-gt v2, p2, :cond_7

    iget p2, v0, Ll/۬ۢܿ;->ۧ:I

    .line 272
    invoke-static {p3, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    if-gt p2, v1, :cond_7

    goto :goto_0

    :cond_6
    const/4 v1, -0x1

    .line 274
    :cond_7
    iget-object p2, v3, Ll/᩺ܺܿ;->ܿ:Ll/᩸᩷ܿ;

    .line 275
    invoke-virtual {p2}, Ll/᩸᩷ܿ;->ۖ()I

    move-result p2

    .line 274
    invoke-virtual {p1, v0, v2, v1, p2}, Ll/۟ۢܿ;->֫(Ll/۬ۢܿ;III)V

    :cond_8
    :goto_0
    return-void
.end method

.method public final declared-synchronized ֫(Ll/ۤۜܽ;)V
    .locals 10

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 1970
    :try_start_0
    iget-object v1, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    .line 1972
    invoke-interface {v1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v2

    invoke-direct {p0, v1, v2}, Ll/᩷ۡܿ;->֫(Ll/᩶᩸ᩳ;I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1973
    iget-object v1, p0, Ll/᩷ۡܿ;->ۧ:Ll/ܿۡܿ;

    iget-object v1, v1, Ll/ܿۡܿ;->ܽ:Ll/᩺ۖܿ;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    move-object v9, v1

    .line 1974
    iget-object v3, p0, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    iget-object v1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v4, v1, Ll/ܳۡܿ;->᩷:Ll/ۢۖܿ;

    iget-object v1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v5, v1, Ll/ܳۡܿ;->ܽ:Ll/ᩳۢܿ;

    iget-boolean v6, v1, Ll/ܳۡܿ;->ܿ:Z

    iget-object v1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-boolean v7, v1, Ll/ܳۡܿ;->֫:Z

    iget-object v8, v1, Ll/ܳۡܿ;->ۡ:Ll/۟ۖܿ;

    move-object v2, p1

    invoke-static/range {v2 .. v9}, Ll/ᩴۡܿ;->֫(Ll/ۤۜܽ;Ll/᩺ۢܿ;Ll/ۢۖܿ;Ll/ᩳۢܿ;ZZLl/۟ۖܿ;Ll/᩺ۖܿ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1976
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

.method public final ֫(Ll/᩶᩸ᩳ;)V
    .locals 0

    .line 665
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ۘ(Ll/᩶᩸ᩳ;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 666
    iget-object p1, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۡ()V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/᩶᩸ᩳ;II)V
    .locals 3

    .line 646
    iget-object v0, p0, Ll/᩷ۡܿ;->ܳ:Ll/ܽܺܿ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ܽܺܿ;->֫(Ll/᩶᩸ᩳ;II)V

    move-object v0, p0

    .line 647
    monitor-enter v0

    .line 648
    :try_start_0
    iget-object v1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-boolean v1, v1, Ll/ܳۡܿ;->ܿ:Z

    if-eqz v1, :cond_5

    iget-object v1, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    .line 649
    invoke-virtual {v1}, Ll/۫ۨᩳ;->᩹ۧ()Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget-object v1, v1, Ll/ۜۡܿ;->۠:Ll/᩶᩸ᩳ;

    if-eq v1, p1, :cond_0

    goto :goto_0

    .line 650
    :cond_0
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ܽ(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-boolean v1, v1, Ll/ܳۡܿ;->֫:Z

    if-eqz v1, :cond_1

    monitor-exit v0

    return-void

    :cond_1
    if-le p3, p2, :cond_2

    .line 651
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ᩳ(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v1, v1, Ll/ܳۡܿ;->ۡ:Ll/۟ۖܿ;

    if-eqz v1, :cond_2

    .line 652
    invoke-virtual {v1, p2, p3}, Ll/۟ۖܿ;->֫(II)Z

    move-result v1

    if-eqz v1, :cond_2

    monitor-exit v0

    return-void

    :cond_2
    if-le p3, p2, :cond_4

    .line 653
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ᩳ(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v1, v1, Ll/ܳۡܿ;->ۡ:Ll/۟ۖܿ;

    if-eqz v1, :cond_3

    .line 654
    invoke-virtual {v1, p2, p3}, Ll/۟ۖܿ;->֫(II)Z

    move-result v1

    if-nez v1, :cond_4

    .line 655
    :cond_3
    iget-object v1, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۛۧ()Z

    move-result v1

    invoke-direct {p0, p1, p2, p3, v1}, Ll/᩷ۡܿ;->֫(Ll/᩶᩸ᩳ;IIZ)V

    .line 657
    :cond_4
    iget-object p2, p0, Ll/᩷ۡܿ;->ܳ:Ll/ܽܺܿ;

    .line 658
    invoke-virtual {p2, p1}, Ll/ܽܺܿ;->֫(Ll/᩶᩸ᩳ;)J

    move-result-wide v1

    .line 659
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 660
    invoke-virtual {p2, v1, v2}, Ll/ܽܺܿ;->֫(J)V

    return-void

    .line 649
    :cond_5
    :goto_0
    :try_start_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 659
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(II)Z
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 417
    :try_start_0
    iget-object v1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-boolean v2, v1, Ll/ܳۡܿ;->֫:Z

    if-nez v2, :cond_1

    iget-object v1, v1, Ll/ܳۡܿ;->ۡ:Ll/۟ۖܿ;

    if-eqz v1, :cond_0

    .line 418
    invoke-virtual {v1, p1, p2}, Ll/۟ۖܿ;->֫(II)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 417
    :goto_1
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(Ljava/lang/CharSequence;)Z
    .locals 2

    .line 2002
    iget-object v0, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-boolean v0, v0, Ll/ܳۡܿ;->ܿ:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2005
    :cond_0
    iget-object v0, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v0, v0, Ll/ܳۡܿ;->᩷:Ll/ۢۖܿ;

    if-eqz v0, :cond_1

    .line 2006
    invoke-virtual {v0}, Ll/ۢۖܿ;->֫()I

    move-result v0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final ֫(Ljava/lang/String;)Z
    .locals 0

    .line 2135
    invoke-static {p1}, Ll/ۜ᩷ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶۜܿ;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->֫(Ll/ܶۜܿ;)V

    .line 2184
    iget-object p1, p0, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    invoke-virtual {p1}, Ll/᩺ۢܿ;->֫()Ll/ܶۜܿ;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final declared-synchronized ֫(Ll/۬ۜܽ;I)Z
    .locals 9

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 879
    :try_start_0
    invoke-direct {p0, v2, v1, v1}, Ll/᩷ۡܿ;->֫(ZZZ)V

    .line 1983
    iget-object v3, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iput-boolean v1, v3, Ll/ܳۡܿ;->ܿ:Z

    .line 1984
    iget-object v3, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    .line 1985
    invoke-virtual {v3}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    .line 1984
    invoke-static {p2, v3, p1}, Ll/ᩴۡܿ;->֫(IILl/۬ۜܽ;)Ll/ܺۡܿ;

    move-result-object p1

    .line 1986
    invoke-virtual {p1}, Ll/ܺۡܿ;->ۧ()Ll/᩺ۢܿ;

    move-result-object p2

    iput-object p2, p0, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    .line 1987
    invoke-virtual {p1}, Ll/ܺۡܿ;->ᩳ()Ll/ۢۖܿ;

    move-result-object v4

    invoke-virtual {p1}, Ll/ܺۡܿ;->֫()Ll/ᩳۢܿ;

    move-result-object v5

    invoke-virtual {p1}, Ll/ܺۡܿ;->ܳ()Z

    move-result v6

    .line 1988
    invoke-virtual {p1}, Ll/ܺۡܿ;->ܿ()Ll/۟ۖܿ;

    move-result-object v7

    const/4 v8, 0x0

    move-object v3, p0

    .line 1987
    invoke-direct/range {v3 .. v8}, Ll/᩷ۡܿ;->֫(Ll/ۢۖܿ;Ll/ᩳۢܿ;ZLl/۟ۖܿ;Z)V

    .line 1989
    iget-object p2, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    invoke-virtual {p1}, Ll/ܺۡܿ;->᩻()Z

    move-result v3

    iput-boolean v3, p2, Ll/ܳۡܿ;->ܿ:Z

    .line 1990
    invoke-virtual {p1}, Ll/ܺۡܿ;->ܽ()Ll/᩺ۖܿ;

    move-result-object p2

    .line 1991
    iget-object v3, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-boolean v3, v3, Ll/ܳۡܿ;->ܿ:Z

    if-eqz v3, :cond_0

    if-eqz p2, :cond_0

    .line 1992
    iget-object p1, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object p1

    .line 1055
    invoke-direct {p0}, Ll/᩷ۡܿ;->۠()V

    .line 1056
    invoke-direct {p0}, Ll/᩷ۡܿ;->᩸()V

    .line 1057
    iget-object v3, p0, Ll/᩷ۡܿ;->ۧ:Ll/ܿۡܿ;

    iput-object p2, v3, Ll/ܿۡܿ;->ܽ:Ll/᩺ۖܿ;

    .line 1058
    iput-boolean v2, v3, Ll/ܿۡܿ;->᩻:Z

    .line 1059
    invoke-interface {p1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result p2

    iput p2, v3, Ll/ܿۡܿ;->ᩳ:I

    .line 1060
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p2

    iput p2, v3, Ll/ܿۡܿ;->ܳ:I

    .line 1061
    iput-object p1, v3, Ll/ܿۡܿ;->ܿ:Ll/᩶᩸ᩳ;

    .line 1062
    iput-boolean v1, v3, Ll/ܿۡܿ;->֫:Z

    .line 1063
    iput-boolean v1, v3, Ll/ܿۡܿ;->ۜ:Z

    goto :goto_0

    .line 1993
    :cond_0
    iget-object p2, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-boolean p2, p2, Ll/ܳۡܿ;->ܿ:Z

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Ll/ܺۡܿ;->ܿ()Ll/۟ۖܿ;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 1995
    iget-object p2, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {p2}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object p2

    invoke-virtual {p1}, Ll/ܺۡܿ;->ܿ()Ll/۟ۖܿ;

    move-result-object p1

    invoke-direct {p0, p2, p1}, Ll/᩷ۡܿ;->֫(Ll/᩶᩸ᩳ;Ll/۟ۖܿ;)V

    .line 1997
    :cond_1
    :goto_0
    iget-object p1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-boolean p1, p1, Ll/ܳۡܿ;->ܿ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۖ()Z
    .locals 1

    .line 1927
    iget-object v0, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-boolean v0, v0, Ll/ܳۡܿ;->ܿ:Z

    return v0
.end method

.method public final ۘ()Z
    .locals 1

    .line 2184
    iget-object v0, p0, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    invoke-virtual {v0}, Ll/᩺ۢܿ;->֫()Ll/ܶۜܿ;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final declared-synchronized ۚ()V
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 879
    :try_start_0
    invoke-direct {p0, v2, v1, v1}, Ll/᩷ۡܿ;->֫(ZZZ)V

    .line 557
    iget-object v2, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    const/4 v3, 0x0

    iput-object v3, v2, Ll/ܳۡܿ;->ۧ:Ll/ۜۢܿ;

    .line 558
    iget-object v2, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iput-object v3, v2, Ll/ܳۡܿ;->ܳ:Ll/ۜۢܿ;

    .line 559
    iget-object v2, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iput-object v3, v2, Ll/ܳۡܿ;->᩻:Ll/᩻ۡܿ;

    .line 560
    iget-object v2, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iput-boolean v1, v2, Ll/ܳۡܿ;->ܿ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 561
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ۜ()Ll/ܶۜܿ;
    .locals 1

    .line 2184
    iget-object v0, p0, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    invoke-virtual {v0}, Ll/᩺ۢܿ;->֫()Ll/ܶۜܿ;

    move-result-object v0

    return-object v0
.end method

.method public final ۡ()Ll/ۢۖܿ;
    .locals 1

    .line 218
    iget-object v0, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v0, v0, Ll/ܳۡܿ;->᩷:Ll/ۢۖܿ;

    return-object v0
.end method

.method public final ۢ()Ljava/lang/String;
    .locals 1

    .line 2184
    iget-object v0, p0, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    invoke-virtual {v0}, Ll/᩺ۢܿ;->֫()Ll/ܶۜܿ;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "Text"

    return-object v0

    .line 1932
    :cond_0
    invoke-virtual {v0}, Ll/ܶۜܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized ۧ()J
    .locals 7

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 432
    :try_start_0
    iget-object v1, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ܽܽ()Z

    move-result v1

    const-wide/16 v2, -0x1

    if-eqz v1, :cond_9

    iget-object v1, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    .line 433
    invoke-virtual {v1}, Ll/۫ۨᩳ;->᩹ۧ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_2

    .line 437
    :cond_0
    iget-object v1, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    .line 438
    invoke-interface {v1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v4

    invoke-direct {p0, v1, v4}, Ll/᩷ۡܿ;->֫(Ll/᩶᩸ᩳ;I)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 440
    monitor-exit v0

    return-wide v2

    .line 2184
    :cond_1
    :try_start_1
    iget-object v1, p0, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    invoke-virtual {v1}, Ll/᩺ۢܿ;->֫()Ll/ܶۜܿ;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 442
    invoke-virtual {p0}, Ll/᩷ۡܿ;->ܳ()Ll/ۜۢܿ;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v1, :cond_2

    .line 444
    monitor-exit v0

    return-wide v2

    .line 446
    :cond_2
    :try_start_2
    iget-object v1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v4, v1, Ll/ܳۡܿ;->ۡ:Ll/۟ۖܿ;

    if-eqz v4, :cond_5

    .line 970
    iget-object v1, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    invoke-direct {p0, v1}, Ll/᩷ۡܿ;->ۖ(Ll/᩶᩸ᩳ;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 449
    invoke-virtual {v4}, Ll/۟ۖܿ;->᩻()Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    .line 452
    :cond_3
    invoke-virtual {v4}, Ll/۟ۖܿ;->ۧ()I

    move-result v1

    int-to-long v1, v1

    const/16 v3, 0x20

    shl-long/2addr v1, v3

    .line 453
    invoke-virtual {v4}, Ll/۟ۖܿ;->֫()I

    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    int-to-long v3, v3

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    or-long/2addr v1, v3

    .line 452
    monitor-exit v0

    return-wide v1

    .line 450
    :cond_4
    :goto_0
    monitor-exit v0

    return-wide v2

    .line 455
    :cond_5
    :try_start_3
    iget-object v1, v1, Ll/ܳۡܿ;->᩷:Ll/ۢۖܿ;

    if-eqz v1, :cond_6

    iget-object v1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-boolean v1, v1, Ll/ܳۡܿ;->֫:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez v1, :cond_6

    .line 457
    monitor-exit v0

    return-wide v2

    .line 459
    :cond_6
    :try_start_4
    iget-object v1, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget v4, v1, Ll/ۜۡܿ;->ۖ:I

    const/4 v5, -0x1

    if-ne v4, v5, :cond_8

    iget v1, v1, Ll/ۜۡܿ;->ܳ:I

    if-ne v1, v5, :cond_8

    .line 970
    iget-object v1, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    invoke-direct {p0, v1}, Ll/᩷ۡܿ;->ۖ(Ll/᩶᩸ᩳ;)Z

    move-result v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v1, :cond_7

    goto :goto_1

    .line 463
    :cond_7
    monitor-exit v0

    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0

    .line 461
    :cond_8
    :goto_1
    monitor-exit v0

    return-wide v2

    .line 435
    :cond_9
    :goto_2
    monitor-exit v0

    return-wide v2

    :catchall_0
    move-exception v1

    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ۧ(Ljava/lang/CharSequence;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 2045
    :try_start_0
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ܿ(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 2046
    iget-object v1, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    if-ne v1, p1, :cond_0

    const/4 p1, 0x1

    const/4 v1, 0x0

    .line 879
    invoke-direct {p0, p1, v1, v1}, Ll/᩷ۡܿ;->֫(ZZZ)V

    .line 2048
    iget-object p1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iput-boolean v1, p1, Ll/ܳۡܿ;->ܿ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2050
    :cond_0
    monitor-exit v0

    return-void

    .line 2052
    :cond_1
    :try_start_1
    check-cast p1, Ll/᩶᩸ᩳ;

    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ۜ(Ll/᩶᩸ᩳ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2053
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۧ(Ll/᩶᩸ᩳ;II)V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 610
    :try_start_0
    iget-object v1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-boolean v1, v1, Ll/ܳۡܿ;->ܿ:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget-object v1, v1, Ll/ۜۡܿ;->۠:Ll/᩶᩸ᩳ;

    if-ne v1, p1, :cond_1

    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ܽ(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    if-ge p2, p3, :cond_1

    .line 611
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-le p3, v1, :cond_0

    goto :goto_0

    .line 612
    :cond_0
    invoke-interface {p1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v1

    const/4 v2, -0x1

    .line 613
    invoke-static {v2, v2, p2, p3}, Ll/᩺ۖܿ;->ۧ(IIII)Ll/᩺ۖܿ;

    move-result-object p2

    sget-object p3, Ll/ܽۡܿ;->᩹:Ll/ܽۡܿ;

    .line 612
    invoke-direct {p0, p1, v1, p2, p3}, Ll/᩷ۡܿ;->֫(Ll/᩶᩸ᩳ;ILl/᩺ۖܿ;Ll/ܽۡܿ;)Ll/᩺ۖܿ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 614
    monitor-exit v0

    return-void

    .line 611
    :cond_1
    :goto_0
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

.method public final declared-synchronized ۧ(II)Z
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 2228
    :try_start_0
    iget-object v1, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    .line 2229
    invoke-direct {p0, v1}, Ll/᩷ۡܿ;->ܳ(Ljava/lang/CharSequence;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v3, 0x0

    if-nez v2, :cond_0

    .line 2230
    monitor-exit v0

    return v3

    :cond_0
    const/4 v2, 0x1

    if-ltz p1, :cond_7

    if-gt p1, p2, :cond_7

    .line 2232
    :try_start_1
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-le p2, v4, :cond_1

    goto :goto_0

    .line 2235
    :cond_1
    invoke-direct {p0, v1}, Ll/᩷ۡܿ;->ۢ(Ll/᩶᩸ᩳ;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 2236
    iget-object v1, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget v3, v1, Ll/ۜۡܿ;->ۖ:I

    iget v1, v1, Ll/ۜۡܿ;->ۢ:I

    invoke-static {v3, v1, p1, p2}, Ll/᩷ۡܿ;->֫(IIII)Z

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    xor-int/2addr p1, v2

    monitor-exit v0

    return p1

    .line 2239
    :cond_2
    :try_start_2
    invoke-direct {p0}, Ll/᩷ۡܿ;->۬()Z

    move-result v4

    if-eqz v4, :cond_3

    .line 2240
    iget-object v1, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget v3, v1, Ll/ۜۡܿ;->ܳ:I

    iget v1, v1, Ll/ۜۡܿ;->ᩳ:I

    invoke-static {v3, v1, p1, p2}, Ll/᩷ۡܿ;->֫(IIII)Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    xor-int/2addr p1, v2

    monitor-exit v0

    return p1

    .line 2243
    :cond_3
    :try_start_3
    iget-object v2, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v2, v2, Ll/ܳۡܿ;->ۡ:Ll/۟ۖܿ;

    if-eqz v2, :cond_4

    .line 2244
    invoke-virtual {v2, p1, p2}, Ll/۟ۖܿ;->֫(II)Z

    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v2, :cond_4

    .line 2245
    monitor-exit v0

    return v3

    .line 2247
    :cond_4
    :try_start_4
    invoke-direct {p0, v1}, Ll/᩷ۡܿ;->ۖ(Ll/᩶᩸ᩳ;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget v2, v1, Ll/ۜۡܿ;->᩹:I

    iget v1, v1, Ll/ۜۡܿ;->ܶ:I

    .line 2248
    invoke-static {v2, v1, p1, p2}, Ll/᩷ۡܿ;->֫(IIII)Z

    move-result p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez p1, :cond_6

    :cond_5
    const/4 v3, 0x1

    .line 2247
    :cond_6
    monitor-exit v0

    return v3

    .line 2233
    :cond_7
    :goto_0
    monitor-exit v0

    return v2

    :catchall_0
    move-exception p1

    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p1
.end method

.method public final ۧ(Ljava/lang/String;)Z
    .locals 0

    .line 2140
    invoke-static {p1}, Ll/ۜ᩷ܿ;->ܿ(Ljava/lang/String;)Ll/ܶۜܿ;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->֫(Ll/ܶۜܿ;)V

    .line 2184
    iget-object p1, p0, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    invoke-virtual {p1}, Ll/᩺ۢܿ;->֫()Ll/ܶۜܿ;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final declared-synchronized ۧ(Ll/᩶᩸ᩳ;)Z
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 2061
    :try_start_0
    invoke-direct {p0}, Ll/᩷ۡܿ;->۫()Z

    .line 2062
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ܳ(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 2063
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ۖ(Ll/᩶᩸ᩳ;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ۢ(Ll/᩶᩸ᩳ;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 2064
    invoke-direct {p0}, Ll/᩷ۡܿ;->۬()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v1, v1, Ll/ܳۡܿ;->ۡ:Ll/۟ۖܿ;

    if-eqz v1, :cond_0

    .line 2066
    invoke-virtual {v1}, Ll/۟ۖܿ;->ܽ()Ll/ۢۖܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢۖܿ;->֫()I

    move-result v1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-eq v1, v3, :cond_1

    .line 2067
    :cond_0
    invoke-direct {p0, p1, v2}, Ll/᩷ۡܿ;->֫(Ll/᩶᩸ᩳ;Z)V

    .line 2069
    :cond_1
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ۘ(Ll/᩶᩸ᩳ;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2070
    monitor-exit v0

    return v2

    .line 2072
    :cond_2
    :try_start_1
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ܽ(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 2073
    iget-object v1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v1, v1, Ll/ܳۡܿ;->᩷:Ll/ۢۖܿ;

    .line 2074
    iget-object v3, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v3, v3, Ll/ܳۡܿ;->ۡ:Ll/۟ۖܿ;

    if-nez v3, :cond_4

    if-eqz v1, :cond_4

    .line 2075
    invoke-virtual {v1}, Ll/ۢۖܿ;->֫()I

    move-result v1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-eq v1, v3, :cond_3

    goto :goto_0

    .line 2077
    :cond_3
    iget-object v1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-boolean v1, v1, Ll/ܳۡܿ;->֫:Z

    if-nez v1, :cond_5

    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ۡ(Ll/᩶᩸ᩳ;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 763
    invoke-direct {p0, p1, v2}, Ll/᩷ۡܿ;->ۧ(Ll/᩶᩸ᩳ;Z)V

    goto :goto_1

    .line 2076
    :cond_4
    :goto_0
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ۜ(Ll/᩶᩸ᩳ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2080
    :cond_5
    :goto_1
    monitor-exit v0

    return v2

    .line 2082
    :cond_6
    monitor-exit v0

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final ܳ()Ll/ۜۢܿ;
    .locals 4

    .line 301
    iget-object v0, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-boolean v0, v0, Ll/ܳۡܿ;->ܿ:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 304
    :cond_0
    iget-object v0, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v0, v0, Ll/ܳۡܿ;->ۧ:Ll/ۜۢܿ;

    .line 2190
    iget-object v1, p0, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    invoke-virtual {v1}, Ll/᩺ۢܿ;->ۧ()Ll/᩺ܺܿ;

    move-result-object v1

    .line 306
    iget-object v2, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v2}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v2

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    .line 307
    invoke-virtual {v1}, Ll/᩺ܺܿ;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 308
    invoke-virtual {v0, v2, v1}, Ll/ۜۢܿ;->֫(Ll/۟᩺ᩳ;Ll/᩺ܺܿ;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final declared-synchronized ܳ(Ll/᩶᩸ᩳ;)V
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 618
    :try_start_0
    iget-object v1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-boolean v1, v1, Ll/ܳۡܿ;->ܿ:Z

    if-eqz v1, :cond_4

    iget-object v1, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget-object v1, v1, Ll/ۜۡܿ;->۠:Ll/᩶᩸ᩳ;

    if-ne v1, p1, :cond_4

    iget-object v1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v1, v1, Ll/ܳۡܿ;->᩷:Ll/ۢۖܿ;

    if-eqz v1, :cond_4

    iget-object v1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v1, v1, Ll/ܳۡܿ;->᩷:Ll/ۢۖܿ;

    .line 619
    invoke-virtual {v1}, Ll/ۢۖܿ;->֫()I

    move-result v1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-ne v1, v2, :cond_4

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_2

    .line 620
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    .line 621
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ܽ(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 623
    iget-object v1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v1, v1, Ll/ܳۡܿ;->ۡ:Ll/۟ۖܿ;

    .line 624
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ᩳ(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ll/۟ۖܿ;->᩻()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 625
    :cond_1
    invoke-virtual {v1}, Ll/۟ۖܿ;->ۧ()I

    move-result v2

    .line 626
    invoke-virtual {v1}, Ll/۟ۖܿ;->֫()I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 624
    :cond_2
    :goto_0
    monitor-exit v0

    return-void

    :cond_3
    const/4 v2, 0x0

    .line 629
    :goto_1
    :try_start_1
    invoke-direct {p0}, Ll/᩷ۡܿ;->۠()V

    .line 630
    invoke-interface {p1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v3

    const/4 v4, -0x1

    .line 631
    invoke-static {v4, v4, v2, v1}, Ll/᩺ۖܿ;->ۧ(IIII)Ll/᩺ۖܿ;

    move-result-object v1

    sget-object v2, Ll/ܽۡܿ;->᩹:Ll/ܽۡܿ;

    .line 630
    invoke-direct {p0, p1, v3, v1, v2}, Ll/᩷ۡܿ;->֫(Ll/᩶᩸ᩳ;ILl/᩺ۖܿ;Ll/ܽۡܿ;)Ll/᩺ۖܿ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 632
    monitor-exit v0

    return-void

    .line 619
    :cond_4
    :goto_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ܺ()Z
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 412
    :try_start_0
    iget-object v1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-boolean v1, v1, Ll/ܳۡܿ;->֫:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ܽ()Ljava/util/List;
    .locals 1

    .line 2184
    iget-object v0, p0, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    invoke-virtual {v0}, Ll/᩺ۢܿ;->֫()Ll/ܶۜܿ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2152
    invoke-virtual {v0}, Ll/ܶۜܿ;->ܽ()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ܽ(Ll/᩶᩸ᩳ;)V
    .locals 8

    move-object v0, p0

    .line 529
    monitor-enter v0

    .line 530
    :try_start_0
    invoke-interface {p1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v1

    invoke-direct {p0, p1, v1}, Ll/᩷ۡܿ;->֫(Ll/᩶᩸ᩳ;I)Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_3

    .line 2184
    iget-object v1, p0, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    invoke-virtual {v1}, Ll/᩺ۢܿ;->֫()Ll/ܶۜܿ;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 532
    invoke-direct {p0}, Ll/᩷ۡܿ;->۠()V

    .line 533
    invoke-interface {p1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v1

    iget-object v4, p0, Ll/᩷ۡܿ;->ۧ:Ll/ܿۡܿ;

    iget-object v4, v4, Ll/ܿۡܿ;->ܽ:Ll/᩺ۖܿ;

    invoke-direct {p0, p1, v1, v4}, Ll/᩷ۡܿ;->֫(Ll/᩶᩸ᩳ;ILl/᩺ۖܿ;)Ll/ᩳۡܿ;

    move-result-object v1

    .line 534
    iget-object v4, p0, Ll/᩷ۡܿ;->ۧ:Ll/ܿۡܿ;

    iget-boolean v5, v4, Ll/ܿۡܿ;->ۜ:Z

    .line 1120
    iget-object v6, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget-boolean v7, v6, Ll/ۜۡܿ;->֨:Z

    if-eqz v7, :cond_0

    iget-object v7, v6, Ll/ۜۡܿ;->۠:Ll/᩶᩸ᩳ;

    if-eq v7, p1, :cond_2

    :cond_0
    iget-boolean v6, v6, Ll/ۜۡܿ;->ܺ:Z

    if-eqz v6, :cond_1

    .line 1121
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ۢ(Ll/᩶᩸ᩳ;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :cond_2
    :goto_0
    or-int/2addr v2, v5

    .line 534
    iput-boolean v2, v4, Ll/ܿۡܿ;->ۜ:Z

    .line 535
    iget-object v2, p0, Ll/᩷ۡܿ;->ۧ:Ll/ܿۡܿ;

    iput-object v1, v2, Ll/ܿۡܿ;->ۧ:Ll/ᩳۡܿ;

    goto :goto_2

    .line 1120
    :cond_3
    iget-object v1, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget-boolean v3, v1, Ll/ۜۡܿ;->֨:Z

    if-eqz v3, :cond_4

    iget-object v3, v1, Ll/ۜۡܿ;->۠:Ll/᩶᩸ᩳ;

    if-eq v3, p1, :cond_6

    :cond_4
    iget-boolean v1, v1, Ll/ۜۡܿ;->ܺ:Z

    if-eqz v1, :cond_5

    .line 1121
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ۢ(Ll/᩶᩸ᩳ;)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_1

    :cond_5
    const/4 v2, 0x0

    :cond_6
    :goto_1
    const/4 v1, 0x0

    move v3, v2

    .line 539
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_7

    .line 1757
    iget-object p1, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    .line 1760
    invoke-virtual {p1}, Landroid/view/View;->postInvalidate()V

    .line 1761
    invoke-virtual {p1, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_7
    if-eqz v3, :cond_8

    .line 545
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ۘ(Ll/᩶᩸ᩳ;)Z

    .line 547
    :cond_8
    iget-object p1, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۡ()V

    return-void

    :catchall_0
    move-exception p1

    .line 539
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ܽ(Ll/᩶᩸ᩳ;II)V
    .locals 2

    .line 2254
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ܳ(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    if-ltz p2, :cond_3

    if-gez p3, :cond_0

    goto :goto_1

    .line 2257
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-static {p2, p3, v0}, Ll/ۧ۫ᩴ;->checkFromToIndex(III)I

    move-object v0, p0

    .line 2258
    monitor-enter v0

    .line 2259
    :try_start_0
    invoke-direct {p0}, Ll/᩷ۡܿ;->۫()Z

    .line 2260
    invoke-direct {p0, p1, p2, p3}, Ll/᩷ۡܿ;->᩻(Ll/᩶᩸ᩳ;II)V

    .line 2261
    iget-object v1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v1, v1, Ll/ܳۡܿ;->ۡ:Ll/۟ۖܿ;

    if-eqz v1, :cond_1

    .line 2262
    invoke-virtual {v1, p2, p3}, Ll/۟ۖܿ;->֫(II)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 2263
    invoke-direct {p0, p1, p2, p3}, Ll/᩷ۡܿ;->ܿ(Ll/᩶᩸ᩳ;II)V

    .line 2264
    monitor-exit v0

    return-void

    .line 2266
    :cond_1
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ܺ(Ll/᩶᩸ᩳ;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    .line 822
    invoke-direct {p0, p1, p2, p3, v1}, Ll/᩷ۡܿ;->֫(Ll/᩶᩸ᩳ;IIZ)V

    goto :goto_0

    .line 2269
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Ll/᩷ۡܿ;->ܳ(Ll/᩶᩸ᩳ;II)V

    .line 2271
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_3
    :goto_1
    return-void
.end method

.method public final ܿ()Ll/ۜۜܿ;
    .locals 1

    .line 2184
    iget-object v0, p0, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    invoke-virtual {v0}, Ll/᩺ۢܿ;->֫()Ll/ܶۜܿ;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2164
    :cond_0
    invoke-virtual {v0}, Ll/ܶۜܿ;->ܿ()Ll/ۜۜܿ;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ(Ll/᩶᩸ᩳ;)V
    .locals 3

    move-object v0, p0

    .line 1767
    monitor-enter v0

    .line 1768
    :try_start_0
    invoke-interface {p1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v1

    invoke-direct {p0, p1, v1}, Ll/᩷ۡܿ;->֫(Ll/᩶᩸ᩳ;I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 2184
    iget-object v1, p0, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    invoke-virtual {v1}, Ll/᩺ۢܿ;->֫()Ll/ܶۜܿ;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 1772
    :cond_0
    invoke-direct {p0}, Ll/᩷ۡܿ;->۠()V

    .line 1773
    invoke-interface {p1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v1

    iget-object v2, p0, Ll/᩷ۡܿ;->ۧ:Ll/ܿۡܿ;

    iget-object v2, v2, Ll/ܿۡܿ;->ܽ:Ll/᩺ۖܿ;

    invoke-direct {p0, p1, v1, v2}, Ll/᩷ۡܿ;->֫(Ll/᩶᩸ᩳ;ILl/᩺ۖܿ;)Ll/ᩳۡܿ;

    move-result-object p1

    .line 1774
    iget-object v1, p0, Ll/᩷ۡܿ;->ۧ:Ll/ܿۡܿ;

    iput-object p1, v1, Ll/ܿۡܿ;->ۧ:Ll/ᩳۡܿ;

    .line 1775
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1776
    iget-object v0, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 1770
    :cond_1
    :goto_0
    :try_start_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 1775
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ᩳ()Ll/ܿۜܿ;
    .locals 1

    .line 2184
    iget-object v0, p0, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    invoke-virtual {v0}, Ll/᩺ۢܿ;->֫()Ll/ܶۜܿ;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2159
    :cond_0
    invoke-virtual {v0}, Ll/ܶۜܿ;->ᩳ()Ll/ܿۜܿ;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ(Ll/᩶᩸ᩳ;)V
    .locals 6

    move-object v0, p0

    .line 471
    monitor-enter v0

    .line 473
    :try_start_0
    iget-object v1, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget-object v1, v1, Ll/ۜۡܿ;->֡:Ll/᩶᩸ᩳ;

    const/4 v2, 0x0

    if-ne v1, p1, :cond_6

    .line 474
    invoke-direct {p0}, Ll/᩷ۡܿ;->۫()Z

    move-result v1

    if-nez v1, :cond_6

    .line 475
    iget-object v1, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    const/4 v3, 0x1

    iput-boolean v3, v1, Ll/ۜۡܿ;->ᩴ:Z

    .line 476
    iget-object v3, v1, Ll/ۜۡܿ;->᩵:Ll/ۛۡܿ;

    .line 477
    iget-object v1, v1, Ll/ۜۡܿ;->ۚ:Ll/۟ۡܿ;

    if-nez v3, :cond_0

    .line 480
    iget-object v4, p0, Ll/᩷ۡܿ;->ܳ:Ll/ܽܺܿ;

    invoke-virtual {v4}, Ll/ܽܺܿ;->ܽ()Ll/ۛۡܿ;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 481
    iget-object v5, p0, Ll/᩷ۡܿ;->ܳ:Ll/ܽܺܿ;

    invoke-virtual {v5, v4}, Ll/ܽܺܿ;->֫(Ll/ۛۡܿ;)Z

    move-result v5

    if-eqz v5, :cond_0

    move-object v3, v4

    :cond_0
    if-nez v1, :cond_1

    .line 486
    iget-object v4, p0, Ll/᩷ۡܿ;->ܳ:Ll/ܽܺܿ;

    invoke-virtual {v4}, Ll/ܽܺܿ;->ᩳ()Ll/۟ۡܿ;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 487
    iget-object v5, p0, Ll/᩷ۡܿ;->ܳ:Ll/ܽܺܿ;

    invoke-virtual {v5, v4}, Ll/ܽܺܿ;->֫(Ll/۟ۡܿ;)Z

    move-result v5

    if-eqz v5, :cond_1

    move-object v1, v4

    :cond_1
    if-nez v3, :cond_5

    if-eqz v1, :cond_2

    goto :goto_1

    .line 493
    :cond_2
    iget-object v4, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget-boolean v5, v4, Ll/ۜۡܿ;->֨:Z

    if-nez v5, :cond_4

    iget-boolean v4, v4, Ll/ۜۡܿ;->ܺ:Z

    if-eqz v4, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x1

    goto :goto_2

    .line 495
    :cond_4
    :goto_0
    invoke-direct {p0}, Ll/᩷ۡܿ;->ۗ()V

    goto :goto_2

    .line 492
    :cond_5
    :goto_1
    invoke-direct {p0}, Ll/᩷ۡܿ;->ۗ()V

    goto :goto_2

    :cond_6
    const/4 v3, 0x0

    move-object v1, v3

    .line 500
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_7

    .line 502
    invoke-direct {p0, v3}, Ll/᩷ۡܿ;->֫(Ll/ۛۡܿ;)V

    return-void

    :cond_7
    if-eqz v1, :cond_8

    .line 506
    invoke-direct {p0, v1}, Ll/᩷ۡܿ;->֫(Ll/۟ۡܿ;)V

    return-void

    :cond_8
    if-eqz v2, :cond_9

    .line 511
    iget-object p1, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۡ()V

    return-void

    .line 514
    :cond_9
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ۘ(Ll/᩶᩸ᩳ;)Z

    move-result p1

    if-nez p1, :cond_a

    .line 516
    iget-object p1, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۡ()V

    :cond_a
    return-void

    :catchall_0
    move-exception p1

    .line 500
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ᩳ(Ll/᩶᩸ᩳ;II)V
    .locals 1

    .line 2223
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ܿ(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩷ۡܿ;->ܳ:Ll/ܽܺܿ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ܽܺܿ;->֫(Ll/᩶᩸ᩳ;II)V

    :cond_0
    return-void
.end method

.method public final declared-synchronized ᩴ()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 721
    :try_start_0
    invoke-direct {p0, v1, v2, v2}, Ll/᩷ۡܿ;->֫(ZZZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 722
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ᩵()V
    .locals 1

    .line 280
    iget-object v0, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۢܽ()V

    return-void
.end method

.method public final ᩷()Ll/ۜۢܿ;
    .locals 4

    .line 314
    iget-object v0, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-boolean v0, v0, Ll/ܳۡܿ;->ܿ:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 317
    :cond_0
    iget-object v0, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v0, v0, Ll/ܳۡܿ;->ܳ:Ll/ۜۢܿ;

    .line 2190
    iget-object v1, p0, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    invoke-virtual {v1}, Ll/᩺ۢܿ;->ۧ()Ll/᩺ܺܿ;

    move-result-object v1

    .line 319
    iget-object v2, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v2}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v2

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    .line 320
    invoke-virtual {v1}, Ll/᩺ܺܿ;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 321
    invoke-virtual {v0, v2, v1}, Ll/ۜۢܿ;->֫(Ll/۟᩺ᩳ;Ll/᩺ܺܿ;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ᩻()Ll/ۢۖܿ;
    .locals 4

    .line 286
    iget-object v0, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-boolean v0, v0, Ll/ܳۡܿ;->ܿ:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 2190
    :cond_0
    iget-object v0, p0, Ll/᩷ۡܿ;->֫:Ll/᩺ۢܿ;

    invoke-virtual {v0}, Ll/᩺ۢܿ;->ۧ()Ll/᩺ܺܿ;

    move-result-object v0

    .line 290
    iget-object v1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-object v1, v1, Ll/ܳۡܿ;->᩻:Ll/᩻ۡܿ;

    .line 291
    iget-object v2, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v2}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v2

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    .line 292
    invoke-virtual {v0}, Ll/᩺ܺܿ;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 97
    iget-object v3, v1, Ll/᩻ۡܿ;->ܿ:Ll/۟᩺ᩳ;

    if-ne v3, v2, :cond_1

    iget-object v3, v1, Ll/᩻ۡܿ;->ۧ:Ll/᩺ܺܿ;

    if-ne v3, v0, :cond_1

    iget v0, v1, Ll/᩻ۡܿ;->֫:I

    .line 98
    invoke-interface {v2}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v3

    if-ne v0, v3, :cond_1

    iget v0, v1, Ll/᩻ۡܿ;->ᩳ:I

    .line 99
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-ne v0, v2, :cond_1

    .line 293
    iget-object v0, v1, Ll/᩻ۡܿ;->ܽ:Ll/ۢۖܿ;

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final declared-synchronized ᩻(Ll/᩶᩸ᩳ;)V
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 565
    :try_start_0
    iget-object v1, p0, Ll/᩷ۡܿ;->ܽ:Ll/ܳۡܿ;

    iget-boolean v1, v1, Ll/ܳۡܿ;->ܿ:Z

    if-eqz v1, :cond_3

    iget-object v1, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    .line 566
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    .line 567
    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۛۧ()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Ll/᩷ۡܿ;->ᩳ:Ll/۫ۨᩳ;

    .line 568
    invoke-virtual {v1}, Ll/۫ۨᩳ;->᩹ۧ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 571
    :cond_0
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ܽ(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    .line 573
    iget-object v1, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget-object v1, v1, Ll/ۜۡܿ;->֡:Ll/᩶᩸ᩳ;

    if-eq v1, p1, :cond_2

    invoke-direct {p0, p1, v2}, Ll/᩷ۡܿ;->ۧ(Ll/᩶᩸ᩳ;Z)V

    goto :goto_0

    .line 574
    :cond_1
    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ᩳ(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-direct {p0, p1}, Ll/᩷ۡܿ;->ۖ(Ll/᩶᩸ᩳ;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 575
    iget-object v1, p0, Ll/᩷ۡܿ;->ܿ:Ll/ۜۡܿ;

    iget v3, v1, Ll/ۜۡܿ;->᩹:I

    iget v1, v1, Ll/ۜۡܿ;->ܶ:I

    invoke-direct {p0, p1, v3, v1, v2}, Ll/᩷ۡܿ;->֫(Ll/᩶᩸ᩳ;IIZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 578
    :cond_2
    :goto_0
    monitor-exit v0

    return-void

    .line 569
    :cond_3
    :goto_1
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
