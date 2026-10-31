.class public final Ll/ۘۢܿ;
.super Ljava/lang/Object;
.source "V702"

# interfaces
.implements Ll/ۛ᩷ܿ;


# instance fields
.field public ֡:I

.field public ֨:I

.field public ֫:I

.field public final ֫֫:I

.field public ۖ:Ll/᩵ۢܿ;

.field public final ۗ:I

.field public ۘ:I

.field public ۙ:[I

.field public ۚ:I

.field public ۛ:Z

.field public ۜ:I

.field public ۜ֫:I

.field public ۟:J

.field public ۠:Ll/᩶ۘܿ;

.field public ۡ:I

.field public ۡ֫:I

.field public ۢ:Ll/᩶ۘܿ;

.field public ۢ֫:I

.field public ۤ:I

.field public ۧ:[I

.field public ۧ֫:I

.field public ۨ:I

.field public ۫:Z

.field public ۬:Ll/ᩴۢܿ;

.field public ܰ:Z

.field public ܳ:I

.field public ܳ֫:I

.field public ܶ:I

.field public ܺ:I

.field public ܺ֫:I

.field public ܽ:I

.field public final ܽ֫:Ll/ۤ᩷ܿ;

.field public ܿ:I

.field public ܿ֫:Ll/ܽۢܿ;

.field public ᩳ:I

.field public ᩳ֫:Z

.field public ᩴ:I

.field public ᩵:I

.field public ᩶:[Ll/᩶ۘܿ;

.field public ᩷:I

.field public ᩷֫:I

.field public ᩸:I

.field public ᩹:[I

.field public ᩺:[I

.field public final ᩻:Ll/ܶۘܿ;

.field public final synthetic ᩻֫:Ll/ۗۢܿ;


# direct methods
.method public constructor <init>(Ll/ۗۢܿ;Ll/ۤ᩷ܿ;Ll/ܶۘܿ;II)V
    .locals 2

    .line 1332
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘۢܿ;->᩻֫:Ll/ۗۢܿ;

    const/4 p1, -0x1

    .line 1314
    iput p1, p0, Ll/ۘۢܿ;->ܳ֫:I

    .line 1315
    iput p1, p0, Ll/ۘۢܿ;->ܺ֫:I

    const-wide/16 v0, -0x1

    .line 1317
    iput-wide v0, p0, Ll/ۘۢܿ;->۟:J

    .line 1323
    iput p1, p0, Ll/ۘۢܿ;->᩷:I

    .line 1324
    iput p1, p0, Ll/ۘۢܿ;->ۡ:I

    .line 1333
    iput-object p2, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    .line 1334
    iput-object p3, p0, Ll/ۘۢܿ;->᩻:Ll/ܶۘܿ;

    .line 1335
    iput p4, p0, Ll/ۘۢܿ;->ۗ:I

    .line 1336
    iput p5, p0, Ll/ۘۢܿ;->֫֫:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۘۢܿ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/ۘۢܿ;->۫:Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۘۢܿ;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۘۢܿ;->ܺ֫:I

    return-void
.end method

.method private ֫(Z)V
    .locals 2

    .line 1771
    iput-boolean p1, p0, Ll/ۘۢܿ;->ۛ:Z

    .line 1772
    iget p1, p0, Ll/ۘۢܿ;->ۧ֫:I

    if-nez p1, :cond_0

    .line 1773
    iget-object p1, p0, Ll/ۘۢܿ;->ۧ:[I

    .line 1774
    iget-object v0, p0, Ll/ۘۢܿ;->ۙ:[I

    iput-object v0, p0, Ll/ۘۢܿ;->ۧ:[I

    .line 1775
    iput-object p1, p0, Ll/ۘۢܿ;->ۙ:[I

    .line 1776
    invoke-direct {p0}, Ll/ۘۢܿ;->ۢ()V

    return-void

    .line 1779
    :cond_0
    iget-object p1, p0, Ll/ۘۢܿ;->ۧ:[I

    if-eqz p1, :cond_1

    array-length v0, p1

    iget v1, p0, Ll/ۘۢܿ;->᩵:I

    if-ge v0, v1, :cond_4

    :cond_1
    if-nez p1, :cond_2

    const/16 p1, 0x10

    .line 1780
    iget v0, p0, Ll/ۘۢܿ;->᩵:I

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    goto :goto_0

    .line 1781
    :cond_2
    iget v0, p0, Ll/ۘۢܿ;->᩵:I

    array-length p1, p1

    shl-int/lit8 p1, p1, 0x1

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 1782
    :goto_0
    iget-object v0, p0, Ll/ۘۢܿ;->ۧ:[I

    if-nez v0, :cond_3

    new-array p1, p1, [I

    goto :goto_1

    .line 1783
    :cond_3
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    :goto_1
    iput-object p1, p0, Ll/ۘۢܿ;->ۧ:[I

    .line 1785
    :cond_4
    iget p1, p0, Ll/ۘۢܿ;->ۧ֫:I

    iput p1, p0, Ll/ۘۢܿ;->ۤ:I

    const/4 p1, 0x4

    .line 1786
    iput p1, p0, Ll/ۘۢܿ;->ᩳ:I

    return-void
.end method

.method private ֫(II)Z
    .locals 1

    const/4 v0, 0x0

    if-ltz p1, :cond_1

    if-le p1, p2, :cond_0

    goto :goto_0

    .line 1996
    :cond_0
    :try_start_0
    invoke-direct {p0, p1}, Ll/ۘۢܿ;->ۨ(I)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    if-ltz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :catch_0
    :cond_1
    :goto_0
    return v0
.end method

.method private ֫(Ll/ۤܺܿ;II)Z
    .locals 11

    .line 1969
    iget-object v0, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    invoke-virtual {v0, p2}, Ll/ۤ᩷ܿ;->֡(I)I

    move-result v1

    .line 1970
    invoke-virtual {v0, p2}, Ll/ۤ᩷ܿ;->ᩴ(I)I

    move-result v2

    .line 1971
    invoke-virtual {v0, p2}, Ll/ۤ᩷ܿ;->᩵(I)I

    move-result v3

    .line 1972
    invoke-virtual {v0, p2}, Ll/ۤ᩷ܿ;->۫(I)I

    move-result v4

    .line 1973
    invoke-virtual {v0, p2}, Ll/ۤ᩷ܿ;->ۛ(I)I

    move-result v5

    .line 1974
    invoke-virtual {v0, p2}, Ll/ۤ᩷ܿ;->ۘ(I)I

    move-result v6

    .line 1975
    invoke-virtual {v0, p2}, Ll/ۤ᩷ܿ;->ۙ(I)I

    move-result v7

    const/4 v8, 0x1

    and-int/2addr v6, v8

    const/4 v9, 0x0

    if-eqz v6, :cond_0

    .line 1978
    invoke-virtual {v0, p2}, Ll/ۤ᩷ܿ;->᩸(I)I

    move-result v6

    if-ne v6, v5, :cond_1

    .line 1979
    invoke-virtual {v0, p2}, Ll/ۤ᩷ܿ;->֨(I)I

    move-result v6

    if-lt v6, v5, :cond_1

    .line 1980
    invoke-virtual {v0, p2}, Ll/ۤ᩷ܿ;->֨(I)I

    move-result v6

    if-gt v6, v7, :cond_1

    .line 1981
    invoke-virtual {v0, p2}, Ll/ۤ᩷ܿ;->ۚ(I)I

    move-result v6

    if-lt v6, v4, :cond_1

    .line 1982
    invoke-virtual {v0, p2}, Ll/ۤ᩷ܿ;->ۚ(I)I

    move-result v6

    if-gt v6, v5, :cond_1

    goto :goto_0

    .line 1983
    :cond_0
    iget-boolean v6, p1, Ll/ۤܺܿ;->ۢ:Z

    if-nez v6, :cond_1

    if-ne v5, v7, :cond_1

    :goto_0
    const/4 v6, 0x1

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    :goto_1
    if-ltz v1, :cond_2

    .line 1984
    iget-object p1, p1, Ll/ۤܺܿ;->ܿ:Ll/۠ܺܿ;

    iget-object p1, p1, Ll/۠ܺܿ;->ܳ:[I

    array-length v10, p1

    if-ge v1, v10, :cond_2

    aget p1, p1, v1

    if-ne v2, p1, :cond_2

    if-ltz v2, :cond_2

    .line 1986
    invoke-virtual {v0, p2}, Ll/ۤ᩷ܿ;->ۗ(I)I

    move-result p1

    if-lt v4, p1, :cond_2

    if-gt v4, v5, :cond_2

    if-gt v5, v7, :cond_2

    if-lt v3, v4, :cond_2

    if-gt v3, v5, :cond_2

    if-gt v3, p3, :cond_2

    if-eqz v6, :cond_2

    return v8

    :cond_2
    return v9
.end method

.method private ֫֫(I)Z
    .locals 1

    .line 2028
    invoke-direct {p0, p1}, Ll/ۘۢܿ;->ۛ(I)Ll/᩶ܺܿ;

    move-result-object v0

    instance-of v0, v0, Ll/ۤܺܿ;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    .line 2029
    invoke-direct {p0, p1}, Ll/ۘۢܿ;->᩺(I)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤ᩷ܿ;->֫֫(I)I

    move-result p1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private ۛ(I)Ll/᩶ܺܿ;
    .locals 2

    .line 2024
    iget-object v0, p0, Ll/ۘۢܿ;->᩻֫:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ܿ(Ll/ۗۢܿ;)Ll/᩺ܺܿ;

    move-result-object v0

    iget-object v0, v0, Ll/᩺ܺܿ;->᩷:[Ll/᩶ܺܿ;

    iget-object v1, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->᩺(I)I

    move-result p1

    invoke-virtual {v1, p1}, Ll/ۤ᩷ܿ;->۬(I)I

    move-result p1

    aget-object p1, v0, p1

    return-object p1
.end method

.method private ۜ()V
    .locals 15

    .line 1624
    iget v0, p0, Ll/ۘۢܿ;->ᩳ:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, -0x1

    iget-object v4, p0, Ll/ۘۢܿ;->᩻֫:Ll/ۗۢܿ;

    iget-object v5, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    const/4 v6, 0x1

    if-ne v0, v6, :cond_f

    .line 1625
    iget v0, p0, Ll/ۘۢܿ;->ۜ֫:I

    if-gez v0, :cond_8

    .line 1626
    iget v0, p0, Ll/ۘۢܿ;->᩷֫:I

    if-eq v0, v3, :cond_0

    .line 1627
    invoke-direct {p0}, Ll/ۘۢܿ;->ۡ()V

    return-void

    .line 1630
    :cond_0
    iget v0, p0, Ll/ۘۢܿ;->ܳ:I

    if-ne v0, v6, :cond_5

    .line 1752
    iget-object v0, p0, Ll/ۘۢܿ;->۬:Ll/ᩴۢܿ;

    if-eqz v0, :cond_4

    .line 1753
    invoke-direct {p0, v2}, Ll/ۘۢܿ;->᩺(I)I

    move-result v0

    invoke-virtual {v5, v0}, Ll/ۤ᩷ܿ;->᩹(I)I

    move-result v0

    .line 1754
    iget-object v7, p0, Ll/ۘۢܿ;->۬:Ll/ᩴۢܿ;

    iget v7, v7, Ll/ᩴۢܿ;->ܰ:I

    if-ge v0, v7, :cond_1

    iget v7, p0, Ll/ۘۢܿ;->ۘ:I

    .line 1756
    invoke-virtual {v5, v7}, Ll/ۤ᩷ܿ;->᩻(I)I

    move-result v5

    iget-object v7, p0, Ll/ۘۢܿ;->۬:Ll/ᩴۢܿ;

    iget v7, v7, Ll/ᩴۢܿ;->ܰ:I

    if-gt v5, v7, :cond_1

    .line 1757
    iget-boolean v0, p0, Ll/ۘۢܿ;->ܰ:Z

    xor-int/lit8 v2, v0, 0x1

    goto :goto_0

    .line 1760
    :cond_1
    iget-object v5, p0, Ll/ۘۢܿ;->۬:Ll/ᩴۢܿ;

    iget v5, v5, Ll/ᩴۢܿ;->ܰ:I

    if-ne v0, v5, :cond_3

    invoke-static {v4}, Ll/ۗۢܿ;->ܿ(Ll/ۗۢܿ;)Ll/᩺ܺܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩺ܺܿ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 1761
    :cond_2
    iget-object v0, p0, Ll/ۘۢܿ;->۬:Ll/ᩴۢܿ;

    invoke-direct {p0, v0}, Ll/ۘۢܿ;->ܽ(Ll/ᩴۢܿ;)V

    const/4 v2, 0x1

    :cond_3
    :goto_0
    if-nez v2, :cond_5

    .line 1632
    invoke-direct {p0}, Ll/ۘۢܿ;->ۡ()V

    return-void

    .line 1752
    :cond_4
    sget-object v0, Ll/֡ۢܿ;->᩶:Ll/֡ۢܿ;

    .line 5099
    new-instance v1, Ll/۠ۢܿ;

    invoke-direct {v1, v0}, Ll/۠ۢܿ;-><init>(Ll/֡ۢܿ;)V

    .line 1752
    throw v1

    .line 1636
    :cond_5
    iget-object v0, p0, Ll/ۘۢܿ;->᩹:[I

    if-eqz v0, :cond_6

    .line 1637
    iget v2, p0, Ll/ۘۢܿ;->ۧ֫:I

    iget v4, p0, Ll/ۘۢܿ;->᩵:I

    invoke-static {v0, v2, v4, v3}, Ljava/util/Arrays;->fill([IIII)V

    .line 1638
    iget-object v0, p0, Ll/ۘۢܿ;->᩶:[Ll/᩶ۘܿ;

    iget v2, p0, Ll/ۘۢܿ;->ۧ֫:I

    iget v4, p0, Ll/ۘۢܿ;->᩵:I

    const/4 v5, 0x0

    invoke-static {v0, v2, v4, v5}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 1641
    :cond_6
    iget v0, p0, Ll/ۘۢܿ;->ۧ֫:I

    iget v2, p0, Ll/ۘۢܿ;->᩵:I

    sub-int/2addr v2, v6

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Ll/ۘۢܿ;->ۢ֫:I

    if-nez v0, :cond_7

    goto :goto_1

    :cond_7
    sub-int/2addr v0, v6

    .line 1642
    invoke-direct {p0, v0}, Ll/ۘۢܿ;->᩺(I)I

    move-result v3

    :goto_1
    iput v3, p0, Ll/ۘۢܿ;->ۡ֫:I

    .line 1643
    iput v1, p0, Ll/ۘۢܿ;->ᩳ:I

    return-void

    .line 1646
    :cond_8
    iget v0, p0, Ll/ۘۢܿ;->᩷֫:I

    if-ltz v0, :cond_e

    invoke-virtual {v5}, Ll/ۤ᩷ܿ;->ܿ()I

    move-result v1

    if-lt v0, v1, :cond_9

    goto :goto_3

    .line 1650
    :cond_9
    iget v0, p0, Ll/ۘۢܿ;->ۜ֫:I

    iget v1, p0, Ll/ۘۢܿ;->ۨ:I

    if-ge v0, v1, :cond_a

    iget v1, p0, Ll/ۘۢܿ;->᩷֫:I

    iget-object v2, p0, Ll/ۘۢܿ;->᩺:[I

    aget v2, v2, v0

    if-ne v1, v2, :cond_a

    add-int/lit8 v1, v0, 0x1

    .line 1652
    iput v1, p0, Ll/ۘۢܿ;->ܿ:I

    .line 1654
    :cond_a
    iget v1, p0, Ll/ۘۢܿ;->֫:I

    if-ge v0, v1, :cond_b

    iget v1, p0, Ll/ۘۢܿ;->᩷֫:I

    iget-object v2, p0, Ll/ۘۢܿ;->ۧ:[I

    aget v2, v2, v0

    if-ne v1, v2, :cond_b

    add-int/2addr v0, v6

    .line 1656
    iput v0, p0, Ll/ۘۢܿ;->ۧ֫:I

    .line 1657
    iget v1, p0, Ll/ۘۢܿ;->ܿ:I

    iget v2, p0, Ll/ۘۢܿ;->ܽ:I

    .line 1658
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 1657
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Ll/ۘۢܿ;->ܿ:I

    .line 1659
    iput v3, p0, Ll/ۘۢܿ;->ۜ֫:I

    .line 1660
    iput v3, p0, Ll/ۘۢܿ;->᩷֫:I

    return-void

    .line 1663
    :cond_b
    iget-object v1, p0, Ll/ۘۢܿ;->ۙ:[I

    add-int/lit8 v2, v0, -0x1

    iput v2, p0, Ll/ۘۢܿ;->ۜ֫:I

    iget v2, p0, Ll/ۘۢܿ;->᩷֫:I

    aput v2, v1, v0

    .line 1664
    invoke-virtual {v5, v2}, Ll/ۤ᩷ܿ;->ܰ(I)I

    move-result v0

    if-lt v0, v3, :cond_d

    .line 1665
    iget v1, p0, Ll/ۘۢܿ;->᩷֫:I

    if-lt v0, v1, :cond_c

    goto :goto_2

    .line 1669
    :cond_c
    iput v0, p0, Ll/ۘۢܿ;->᩷֫:I

    return-void

    .line 1666
    :cond_d
    :goto_2
    invoke-direct {p0}, Ll/ۘۢܿ;->ۡ()V

    return-void

    .line 1647
    :cond_e
    :goto_3
    invoke-direct {p0}, Ll/ۘۢܿ;->ۡ()V

    return-void

    :cond_f
    const/4 v7, 0x3

    if-ne v0, v1, :cond_38

    .line 1673
    iget v0, p0, Ll/ۘۢܿ;->ۢ֫:I

    iget v1, p0, Ll/ۘۢܿ;->᩵:I

    if-ne v0, v1, :cond_11

    .line 1674
    invoke-static {v4}, Ll/ۗۢܿ;->ۧ(Ll/ۗۢܿ;)Ll/ۨ᩷ܿ;

    move-result-object v8

    iget v9, p0, Ll/ۘۢܿ;->᩸:I

    iget v10, p0, Ll/ۘۢܿ;->ܶ:I

    iget v11, p0, Ll/ۘۢܿ;->֨:I

    iget-object v12, p0, Ll/ۘۢܿ;->۠:Ll/᩶ۘܿ;

    iget v14, p0, Ll/ۘۢܿ;->ܿ:I

    move-object v13, p0

    invoke-virtual/range {v8 .. v14}, Ll/ۨ᩷ܿ;->֫(IIILl/᩶ۘܿ;Ll/ۛ᩷ܿ;I)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 1676
    iput v7, p0, Ll/ۘۢܿ;->ᩳ:I

    return-void

    .line 1679
    :cond_10
    invoke-direct {p0, v2}, Ll/ۘۢܿ;->֫(Z)V

    return-void

    .line 1684
    :cond_11
    invoke-direct {p0, v0}, Ll/ۘۢܿ;->᩺(I)I

    move-result v1

    .line 1685
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->۬(I)I

    move-result v2

    .line 1686
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->۟(I)I

    move-result v7

    .line 1687
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->ۤ(I)I

    move-result v8

    if-ltz v2, :cond_37

    .line 1688
    invoke-static {v4}, Ll/ۗۢܿ;->ܿ(Ll/ۗۢܿ;)Ll/᩺ܺܿ;

    move-result-object v9

    iget-object v9, v9, Ll/᩺ܺܿ;->᩷:[Ll/᩶ܺܿ;

    array-length v9, v9

    if-ge v2, v9, :cond_37

    .line 1689
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->ܰ(I)I

    move-result v9

    iget v10, p0, Ll/ۘۢܿ;->ۡ֫:I

    if-eq v9, v10, :cond_12

    goto/16 :goto_12

    .line 1693
    :cond_12
    invoke-static {v4}, Ll/ۗۢܿ;->ܿ(Ll/ۗۢܿ;)Ll/᩺ܺܿ;

    move-result-object v9

    iget-object v9, v9, Ll/᩺ܺܿ;->᩷:[Ll/᩶ܺܿ;

    aget-object v9, v9, v2

    if-nez v0, :cond_14

    if-nez v2, :cond_13

    if-ne v7, v3, :cond_13

    if-eqz v8, :cond_15

    .line 1696
    :cond_13
    invoke-direct {p0}, Ll/ۘۢܿ;->ۡ()V

    return-void

    :cond_14
    add-int/lit8 v10, v0, -0x1

    .line 1700
    invoke-direct {p0, v10}, Ll/ۘۢܿ;->᩺(I)I

    move-result v10

    .line 1701
    invoke-static {v4}, Ll/ۗۢܿ;->ܿ(Ll/ۗۢܿ;)Ll/᩺ܺܿ;

    move-result-object v11

    iget-object v11, v11, Ll/᩺ܺܿ;->᩷:[Ll/᩶ܺܿ;

    .line 1702
    invoke-virtual {v5, v10}, Ll/ۤ᩷ܿ;->۬(I)I

    move-result v12

    aget-object v11, v11, v12

    .line 1703
    invoke-static {v11, v7}, Ll/ۗۢܿ;->֫(Ll/᩶ܺܿ;I)I

    move-result v12

    if-ne v12, v2, :cond_36

    .line 1704
    invoke-virtual {v5, v10}, Ll/ۤ᩷ܿ;->ۤ(I)I

    move-result v2

    invoke-static {v11, v2, v7}, Ll/ۗۢܿ;->֫(Ll/᩶ܺܿ;II)I

    move-result v2

    if-ne v2, v8, :cond_36

    .line 1705
    invoke-static {v5, v10, v7}, Ll/ۗۢܿ;->֫(Ll/ۤ᩷ܿ;II)Z

    move-result v2

    if-nez v2, :cond_15

    goto/16 :goto_11

    .line 1710
    :cond_15
    iget v2, p0, Ll/ۘۢܿ;->᩵:I

    sub-int/2addr v2, v6

    if-ne v0, v2, :cond_16

    const/4 v2, 0x1

    goto :goto_4

    :cond_16
    const/4 v2, 0x0

    .line 1826
    :goto_4
    iget v7, p0, Ll/ۘۢܿ;->ۘ:I

    invoke-virtual {v5, v7}, Ll/ۤ᩷ܿ;->᩻(I)I

    move-result v7

    .line 1827
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->᩹(I)I

    move-result v8

    .line 1828
    invoke-direct {p0, v8, v7}, Ll/ۘۢܿ;->֫(II)Z

    move-result v8

    if-eqz v8, :cond_34

    instance-of v8, v9, Ll/۫ܺܿ;

    if-nez v8, :cond_34

    instance-of v8, v9, Ll/ۗܺܿ;

    if-nez v8, :cond_34

    invoke-static {v4}, Ll/ۗۢܿ;->ܿ(Ll/ۗۢܿ;)Ll/᩺ܺܿ;

    move-result-object v8

    .line 1830
    invoke-virtual {v8}, Ll/᩺ܺܿ;->ۧ()Z

    move-result v8

    const/16 v10, 0xc

    if-eqz v8, :cond_21

    .line 1922
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->ۗ(I)I

    move-result v8

    .line 1923
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->ۙ(I)I

    move-result v11

    if-ltz v8, :cond_34

    if-lt v11, v8, :cond_34

    .line 1924
    invoke-virtual {v5}, Ll/ۤ᩷ܿ;->ۜ()I

    move-result v12

    if-le v11, v12, :cond_17

    goto/16 :goto_f

    :cond_17
    if-nez v0, :cond_18

    if-nez v8, :cond_34

    .line 1925
    invoke-virtual {v5}, Ll/ۤ᩷ܿ;->ۜ()I

    move-result v8

    if-ne v11, v8, :cond_34

    goto :goto_5

    :cond_18
    add-int/lit8 v12, v0, -0x1

    .line 1926
    invoke-direct {p0, v12}, Ll/ۘۢܿ;->᩺(I)I

    move-result v12

    .line 1927
    invoke-static {v5, v12}, Ll/ۗۢܿ;->֫(Ll/ۤ᩷ܿ;I)Z

    move-result v13

    if-nez v13, :cond_19

    .line 1928
    invoke-virtual {v5, v12}, Ll/ۤ᩷ܿ;->ۗ(I)I

    move-result v13

    if-ne v8, v13, :cond_34

    .line 1929
    invoke-virtual {v5, v12}, Ll/ۤ᩷ܿ;->ۙ(I)I

    move-result v8

    if-ne v11, v8, :cond_34

    goto :goto_5

    .line 1931
    :cond_19
    invoke-static {v4}, Ll/ۗۢܿ;->ܿ(Ll/ۗۢܿ;)Ll/᩺ܺܿ;

    move-result-object v13

    iget-object v13, v13, Ll/᩺ܺܿ;->᩷:[Ll/᩶ܺܿ;

    .line 1932
    invoke-virtual {v5, v12}, Ll/ۤ᩷ܿ;->۬(I)I

    move-result v14

    aget-object v13, v13, v14

    .line 1935
    instance-of v14, v13, Ll/ۤܺܿ;

    if-eqz v14, :cond_34

    .line 1933
    check-cast v13, Ll/ۤܺܿ;

    iget-object v13, v13, Ll/ۤܺܿ;->ܿ:Ll/۠ܺܿ;

    if-eqz v13, :cond_34

    .line 1934
    invoke-virtual {v5, v12}, Ll/ۤ᩷ܿ;->۫(I)I

    move-result v13

    if-ne v8, v13, :cond_34

    .line 1935
    invoke-virtual {v5, v12}, Ll/ۤ᩷ܿ;->ۛ(I)I

    move-result v8

    if-ne v11, v8, :cond_34

    .line 1941
    :goto_5
    iget v8, p0, Ll/ۘۢܿ;->ۘ:I

    invoke-virtual {v5, v8}, Ll/ۤ᩷ܿ;->֫(I)I

    move-result v8

    .line 1942
    iget v11, p0, Ll/ۘۢܿ;->ۘ:I

    invoke-virtual {v5, v11}, Ll/ۤ᩷ܿ;->ۧ(I)I

    move-result v11

    .line 1943
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->ۢ(I)I

    move-result v12

    .line 1944
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->ۡ(I)I

    move-result v13

    .line 1945
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->ۖ(I)I

    move-result v14

    if-lt v11, v6, :cond_34

    if-ltz v8, :cond_34

    if-ltz v12, :cond_34

    if-gt v12, v8, :cond_34

    if-lt v13, v3, :cond_34

    if-ge v13, v8, :cond_34

    if-lt v14, v3, :cond_34

    if-lt v14, v8, :cond_1a

    goto/16 :goto_f

    :cond_1a
    if-nez v0, :cond_1b

    if-eq v13, v3, :cond_1d

    goto/16 :goto_f

    :cond_1b
    add-int/lit8 v8, v0, -0x1

    .line 1953
    invoke-direct {p0, v8}, Ll/ۘۢܿ;->᩺(I)I

    move-result v8

    .line 1954
    invoke-static {v5, v8}, Ll/ۗۢܿ;->֫(Ll/ۤ᩷ܿ;I)Z

    move-result v11

    if-nez v11, :cond_1c

    .line 1955
    invoke-virtual {v5, v8}, Ll/ۤ᩷ܿ;->ۡ(I)I

    move-result v8

    goto :goto_6

    .line 1956
    :cond_1c
    invoke-virtual {v5, v8}, Ll/ۤ᩷ܿ;->ۖ(I)I

    move-result v8

    :goto_6
    if-eq v13, v8, :cond_1d

    goto/16 :goto_f

    .line 1959
    :cond_1d
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->֫֫(I)I

    move-result v8

    .line 1961
    instance-of v11, v9, Ll/ۤܺܿ;

    if-eqz v11, :cond_1f

    .line 1960
    move-object v11, v9

    check-cast v11, Ll/ۤܺܿ;

    iget-object v11, v11, Ll/ۤܺܿ;->ܿ:Ll/۠ܺܿ;

    if-eqz v11, :cond_1f

    if-eq v8, v10, :cond_1e

    const/16 v11, 0xd

    if-eq v8, v11, :cond_1e

    const/16 v11, 0xf

    if-ne v8, v11, :cond_1f

    :cond_1e
    const/4 v8, 0x1

    goto :goto_7

    :cond_1f
    const/4 v8, 0x0

    :goto_7
    if-ltz v14, :cond_20

    const/4 v11, 0x1

    goto :goto_8

    :cond_20
    const/4 v11, 0x0

    :goto_8
    if-ne v8, v11, :cond_34

    .line 1834
    :cond_21
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->֫֫(I)I

    move-result v8

    .line 1835
    instance-of v11, v9, Ll/ۚܺܿ;

    if-eqz v11, :cond_22

    check-cast v9, Ll/ۚܺܿ;

    if-nez v2, :cond_34

    if-ne v8, v6, :cond_34

    .line 1836
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->ۨ(I)I

    move-result v0

    if-ltz v0, :cond_34

    .line 1837
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->ۨ(I)I

    move-result v0

    iget-object v2, v9, Ll/ۚܺܿ;->ۧ:[I

    array-length v2, v2

    if-gt v0, v2, :cond_34

    .line 1838
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->᩷(I)I

    move-result v0

    if-lt v0, v3, :cond_34

    goto/16 :goto_9

    .line 1840
    :cond_22
    instance-of v3, v9, Ll/᩹ܺܿ;

    if-eqz v3, :cond_23

    check-cast v9, Ll/᩹ܺܿ;

    .line 1841
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->ۨ(I)I

    move-result v0

    if-nez v2, :cond_34

    if-ne v8, v6, :cond_34

    if-lez v0, :cond_34

    .line 1842
    iget-object v2, v9, Ll/᩹ܺܿ;->ۧ:[I

    array-length v2, v2

    if-gt v0, v2, :cond_34

    .line 1843
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->ܽ֫(I)I

    move-result v0

    invoke-direct {p0, v0, v7}, Ll/ۘۢܿ;->֫(II)Z

    move-result v0

    if-eqz v0, :cond_34

    .line 1844
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->ۧ֫(I)I

    move-result v0

    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->ܽ֫(I)I

    move-result v2

    if-lt v0, v2, :cond_34

    .line 1845
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->ۧ֫(I)I

    move-result v0

    invoke-direct {p0, v0, v7}, Ll/ۘۢܿ;->֫(II)Z

    move-result v0

    if-eqz v0, :cond_34

    goto/16 :goto_9

    .line 1847
    :cond_23
    instance-of v3, v9, Ll/۬ܺܿ;

    if-eqz v3, :cond_24

    if-nez v2, :cond_34

    if-ne v8, v6, :cond_34

    goto :goto_9

    .line 1849
    :cond_24
    check-cast v9, Ll/ۤܺܿ;

    .line 1850
    iget-object v3, v9, Ll/ۤܺܿ;->᩷:Ljava/util/BitSet;

    iget-object v6, v9, Ll/ۤܺܿ;->ܿ:Ll/۠ܺܿ;

    iget-boolean v11, v9, Ll/ۤܺܿ;->᩻:Z

    invoke-virtual {v3}, Ljava/util/BitSet;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_25

    goto/16 :goto_f

    :cond_25
    const/4 v3, 0x2

    if-eq v8, v3, :cond_26

    .line 1852
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->ܽ֫(I)I

    move-result v3

    invoke-direct {p0, v3, v7}, Ll/ۘۢܿ;->֫(II)Z

    move-result v3

    if-eqz v3, :cond_34

    iget-object v3, v9, Ll/ۤܺܿ;->ۧ:Ll/ۛܺܿ;

    if-eqz v3, :cond_26

    .line 1854
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->ۧ֫(I)I

    move-result v3

    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->ܽ֫(I)I

    move-result v12

    if-lt v3, v12, :cond_34

    .line 1855
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->ۧ֫(I)I

    move-result v3

    invoke-direct {p0, v3, v7}, Ll/ۘۢܿ;->֫(II)Z

    move-result v3

    if-nez v3, :cond_26

    goto/16 :goto_f

    :cond_26
    const/16 v3, 0xf

    if-ne v8, v3, :cond_27

    if-eqz v2, :cond_34

    if-eqz v6, :cond_34

    if-nez v11, :cond_34

    .line 1862
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->ۘ(I)I

    move-result v0

    const/16 v2, 0x18

    and-int/2addr v0, v2

    if-ne v0, v2, :cond_34

    .line 1863
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->ᩳ֫(I)I

    move-result v0

    if-ne v0, v7, :cond_34

    .line 1864
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->᩵(I)I

    move-result v0

    if-ne v0, v7, :cond_34

    .line 1865
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->۫(I)I

    move-result v0

    invoke-direct {p0, v0, v7}, Ll/ۘۢܿ;->֫(II)Z

    move-result v0

    if-eqz v0, :cond_34

    .line 1866
    invoke-direct {p0, v9, v1, v7}, Ll/ۘۢܿ;->֫(Ll/ۤܺܿ;II)Z

    move-result v0

    if-eqz v0, :cond_34

    :goto_9
    goto/16 :goto_e

    :cond_27
    if-eqz v11, :cond_2a

    .line 1869
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->ܶ(I)Ll/᩶ۘܿ;

    move-result-object v3

    .line 1870
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->۠(I)I

    move-result v12

    if-eqz v3, :cond_34

    if-le v12, v7, :cond_28

    goto/16 :goto_f

    .line 1875
    :cond_28
    :try_start_0
    iget-object v13, p0, Ll/ۘۢܿ;->᩹:[I

    invoke-direct {p0, v12}, Ll/ۘۢܿ;->ۨ(I)I

    move-result v12

    aput v12, v13, v0

    .line 1876
    iget-object v12, p0, Ll/ۘۢܿ;->᩶:[Ll/᩶ۘܿ;

    iget-boolean v13, p0, Ll/ۘۢܿ;->ᩳ֫:Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v14, p0, Ll/ۘۢܿ;->᩻:Ll/ܶۘܿ;

    if-eqz v13, :cond_29

    .line 1877
    :try_start_1
    iget v13, p0, Ll/ۘۢܿ;->ۘ:I

    .line 1878
    invoke-virtual {v5, v13}, Ll/ۤ᩷ܿ;->ܿ(I)I

    move-result v13

    .line 1877
    invoke-virtual {v3, v14, v13}, Ll/᩶ۘܿ;->֫(Ll/ܶۘܿ;I)Ll/᩶ۘܿ;

    move-result-object v3

    goto :goto_a

    .line 1879
    :cond_29
    invoke-virtual {v3, v14}, Ll/᩶ۘܿ;->ۧ(Ll/ܶۘܿ;)Ll/᩶ۘܿ;

    move-result-object v3

    :goto_a
    aput-object v3, v12, v0
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_b

    .line 1883
    :cond_2a
    iget-boolean v0, v9, Ll/ۤܺܿ;->ۢ:Z

    if-eqz v0, :cond_2b

    goto/16 :goto_f

    :cond_2b
    :goto_b
    if-eqz v6, :cond_2c

    const/4 v0, 0x2

    if-eq v8, v0, :cond_2c

    .line 1887
    invoke-direct {p0, v9, v1, v7}, Ll/ۘۢܿ;->֫(Ll/ۤܺܿ;II)Z

    move-result v0

    if-nez v0, :cond_2c

    goto/16 :goto_f

    :cond_2c
    if-eqz v2, :cond_2f

    if-ne v8, v10, :cond_2d

    .line 1892
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->᩵(I)I

    move-result v0

    if-ne v0, v7, :cond_34

    goto/16 :goto_e

    :cond_2d
    const/4 v0, 0x5

    if-ne v8, v0, :cond_34

    .line 1894
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->ᩳ֫(I)I

    move-result v0

    if-ne v0, v7, :cond_34

    .line 1895
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->۫(I)I

    move-result v0

    invoke-direct {p0, v0, v7}, Ll/ۘۢܿ;->֫(II)Z

    move-result v0

    if-eqz v0, :cond_34

    .line 1896
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->۫(I)I

    move-result v0

    if-gt v0, v7, :cond_34

    if-nez v11, :cond_33

    .line 1898
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->ۛ(I)I

    move-result v0

    .line 1916
    invoke-static {v4}, Ll/ۗۢܿ;->ܿ(Ll/ۗۢܿ;)Ll/᩺ܺܿ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩺ܺܿ;->ۧ()Z

    move-result v2

    if-eqz v2, :cond_2e

    .line 1917
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->ۙ(I)I

    move-result v2

    goto :goto_c

    :cond_2e
    invoke-virtual {v5}, Ll/ۤ᩷ܿ;->ۜ()I

    move-result v2

    :goto_c
    if-ne v0, v2, :cond_34

    goto :goto_e

    :cond_2f
    const/4 v0, 0x2

    if-ne v8, v0, :cond_30

    goto :goto_e

    :cond_30
    const/16 v0, 0xd

    if-ne v8, v0, :cond_31

    if-eqz v6, :cond_34

    .line 1902
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->᩵(I)I

    move-result v0

    if-gt v0, v7, :cond_34

    goto :goto_e

    :cond_31
    const/4 v0, 0x7

    if-ne v8, v0, :cond_34

    .line 1904
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->ܿ֫(I)I

    move-result v0

    if-ltz v0, :cond_34

    .line 1905
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->ܿ֫(I)I

    move-result v0

    iget-object v2, v9, Ll/ۤܺܿ;->ܽ:Ll/ۚܺܿ;

    iget-object v2, v2, Ll/ۚܺܿ;->ۧ:[I

    array-length v2, v2

    if-ge v0, v2, :cond_34

    .line 1906
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->۫(I)I

    move-result v0

    invoke-direct {p0, v0, v7}, Ll/ۘۢܿ;->֫(II)Z

    move-result v0

    if-eqz v0, :cond_34

    .line 1907
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->۫(I)I

    move-result v0

    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->ᩳ֫(I)I

    move-result v2

    if-gt v0, v2, :cond_34

    .line 1908
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->ᩳ֫(I)I

    move-result v0

    invoke-direct {p0, v0, v7}, Ll/ۘۢܿ;->֫(II)Z

    move-result v0

    if-eqz v0, :cond_34

    .line 1909
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->ᩳ֫(I)I

    move-result v0

    if-gt v0, v7, :cond_34

    if-nez v11, :cond_33

    .line 1911
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->ۛ(I)I

    move-result v0

    .line 1916
    invoke-static {v4}, Ll/ۗۢܿ;->ܿ(Ll/ۗۢܿ;)Ll/᩺ܺܿ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩺ܺܿ;->ۧ()Z

    move-result v2

    if-eqz v2, :cond_32

    .line 1917
    invoke-virtual {v5, v1}, Ll/ۤ᩷ܿ;->ۙ(I)I

    move-result v2

    goto :goto_d

    :cond_32
    invoke-virtual {v5}, Ll/ۤ᩷ܿ;->ۜ()I

    move-result v2

    :goto_d
    if-ne v0, v2, :cond_34

    :cond_33
    :goto_e
    const/4 v0, 0x1

    goto :goto_10

    :catch_0
    :cond_34
    :goto_f
    const/4 v0, 0x0

    :goto_10
    if-nez v0, :cond_35

    .line 1711
    invoke-direct {p0}, Ll/ۘۢܿ;->ۡ()V

    return-void

    .line 1714
    :cond_35
    iput v1, p0, Ll/ۘۢܿ;->ۡ֫:I

    .line 1715
    iget v0, p0, Ll/ۘۢܿ;->ۢ֫:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۘۢܿ;->ۢ֫:I

    return-void

    .line 1706
    :cond_36
    :goto_11
    invoke-direct {p0}, Ll/ۘۢܿ;->ۡ()V

    return-void

    .line 1690
    :cond_37
    :goto_12
    invoke-direct {p0}, Ll/ۘۢܿ;->ۡ()V

    return-void

    :cond_38
    if-ne v0, v7, :cond_3b

    .line 1719
    invoke-static {v4}, Ll/ۗۢܿ;->ۧ(Ll/ۗۢܿ;)Ll/ۨ᩷ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۨ᩷ܿ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_3a

    .line 1720
    invoke-static {v4}, Ll/ۗۢܿ;->ۧ(Ll/ۗۢܿ;)Ll/ۨ᩷ܿ;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/ۨ᩷ܿ;->֫(Ll/ۛ᩷ܿ;)V

    .line 1721
    invoke-static {v4}, Ll/ۗۢܿ;->ۧ(Ll/ۗۢܿ;)Ll/ۨ᩷ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۨ᩷ܿ;->ᩳ()Z

    move-result v0

    if-nez v0, :cond_39

    .line 1722
    invoke-static {v4}, Ll/ۗۢܿ;->ۧ(Ll/ۗۢܿ;)Ll/ۨ᩷ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۨ᩷ܿ;->ܿ()Z

    move-result v0

    invoke-direct {p0, v0}, Ll/ۘۢܿ;->֫(Z)V

    :cond_39
    return-void

    .line 1719
    :cond_3a
    sget-object v0, Ll/֡ۢܿ;->᩶:Ll/֡ۢܿ;

    .line 5099
    new-instance v1, Ll/۠ۢܿ;

    invoke-direct {v1, v0}, Ll/۠ۢܿ;-><init>(Ll/֡ۢܿ;)V

    .line 1719
    throw v1

    :cond_3b
    const/4 v1, 0x4

    if-ne v0, v1, :cond_3d

    .line 1727
    iget v0, p0, Ll/ۘۢܿ;->ۤ:I

    iget v1, p0, Ll/ۘۢܿ;->᩵:I

    if-ge v0, v1, :cond_3c

    .line 1728
    iget-object v1, p0, Ll/ۘۢܿ;->ۧ:[I

    iget-object v2, p0, Ll/ۘۢܿ;->ۙ:[I

    aget v2, v2, v0

    aput v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    .line 1729
    iput v0, p0, Ll/ۘۢܿ;->ۤ:I

    return-void

    .line 1732
    :cond_3c
    invoke-direct {p0}, Ll/ۘۢܿ;->ۢ()V

    return-void

    :cond_3d
    const/4 v1, 0x5

    if-ne v0, v1, :cond_3f

    .line 1738
    iget v0, p0, Ll/ۘۢܿ;->ۤ:I

    iget v1, p0, Ll/ۘۢܿ;->᩵:I

    if-ge v0, v1, :cond_3e

    .line 1739
    iget-object v1, p0, Ll/ۘۢܿ;->᩺:[I

    iget-object v2, p0, Ll/ۘۢܿ;->ۧ:[I

    aget v2, v2, v0

    aput v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    .line 1740
    iput v0, p0, Ll/ۘۢܿ;->ۤ:I

    return-void

    .line 1743
    :cond_3e
    iput v1, p0, Ll/ۘۢܿ;->ۨ:I

    .line 1744
    iput v1, p0, Ll/ۘۢܿ;->ܽ:I

    .line 1745
    invoke-direct {p0}, Ll/ۘۢܿ;->ۡ()V

    return-void

    .line 1736
    :cond_3f
    sget-object v0, Ll/֡ۢܿ;->᩶:Ll/֡ۢܿ;

    .line 5099
    new-instance v1, Ll/۠ۢܿ;

    invoke-direct {v1, v0}, Ll/۠ۢܿ;-><init>(Ll/֡ۢܿ;)V

    .line 1736
    throw v1
.end method

.method private ۟(I)Z
    .locals 1

    .line 2211
    invoke-direct {p0, p1}, Ll/ۘۢܿ;->ܰ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->᩺(I)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤ᩷ܿ;->ۘ(I)I

    move-result p1

    const/4 v0, 0x1

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private ۡ()V
    .locals 2

    const/4 v0, 0x0

    .line 1818
    iput v0, p0, Ll/ۘۢܿ;->ᩳ:I

    const/4 v1, 0x0

    .line 1819
    iput-object v1, p0, Ll/ۘۢܿ;->۠:Ll/᩶ۘܿ;

    .line 1820
    iput-boolean v0, p0, Ll/ۘۢܿ;->ۛ:Z

    return-void
.end method

.method private ۢ()V
    .locals 3

    .line 1791
    iget v0, p0, Ll/ۘۢܿ;->᩵:I

    iput v0, p0, Ll/ۘۢܿ;->֫:I

    .line 1792
    iget-boolean v1, p0, Ll/ۘۢܿ;->ۛ:Z

    if-nez v1, :cond_0

    .line 1793
    iget v0, p0, Ll/ۘۢܿ;->ܿ:I

    iput v0, p0, Ll/ۘۢܿ;->ܽ:I

    .line 1794
    invoke-direct {p0}, Ll/ۘۢܿ;->ۡ()V

    return-void

    .line 1797
    :cond_0
    iget-object v1, p0, Ll/ۘۢܿ;->᩺:[I

    if-eqz v1, :cond_1

    array-length v2, v1

    if-ge v2, v0, :cond_4

    :cond_1
    if-nez v1, :cond_2

    const/16 v1, 0x10

    .line 1798
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_0

    .line 1799
    :cond_2
    array-length v1, v1

    shl-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 1800
    :goto_0
    iget-object v1, p0, Ll/ۘۢܿ;->᩺:[I

    if-nez v1, :cond_3

    new-array v0, v0, [I

    goto :goto_1

    .line 1801
    :cond_3
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    :goto_1
    iput-object v0, p0, Ll/ۘۢܿ;->᩺:[I

    .line 1803
    :cond_4
    iget v0, p0, Ll/ۘۢܿ;->ܿ:I

    iput v0, p0, Ll/ۘۢܿ;->ۤ:I

    const/4 v0, 0x5

    .line 1804
    iput v0, p0, Ll/ۘۢܿ;->ᩳ:I

    return-void
.end method

.method private ۧ(II)V
    .locals 7

    .line 1552
    invoke-direct {p0}, Ll/ۘۢܿ;->᩷()Z

    move-result v0

    if-nez v0, :cond_12

    iget-object v0, p0, Ll/ۘۢܿ;->᩻֫:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ۧ(Ll/ۗۢܿ;)Ll/ۨ᩷ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۨ᩷ܿ;->ᩳ()Z

    move-result v1

    if-nez v1, :cond_12

    if-ltz p1, :cond_11

    .line 1555
    iget-object v1, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    invoke-virtual {v1}, Ll/ۤ᩷ܿ;->ᩳ()I

    move-result v2

    if-lt p1, v2, :cond_0

    goto/16 :goto_9

    .line 1556
    :cond_0
    invoke-virtual {v1}, Ll/ۤ᩷ܿ;->ۧ()Z

    move-result v2

    if-eqz v2, :cond_1

    iget v2, p0, Ll/ۘۢܿ;->ܺ֫:I

    if-gez v2, :cond_1

    goto/16 :goto_9

    .line 1557
    :cond_1
    iput p2, p0, Ll/ۘۢܿ;->ܳ:I

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne p2, v2, :cond_2

    const/4 p2, 0x1

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    .line 1558
    :goto_0
    iput-boolean p2, p0, Ll/ۘۢܿ;->ᩳ֫:Z

    .line 1559
    iput p1, p0, Ll/ۘۢܿ;->ۘ:I

    .line 1560
    invoke-virtual {v1, p1}, Ll/ۤ᩷ܿ;->ۧ(I)I

    move-result p2

    iput p2, p0, Ll/ۘۢܿ;->ۚ:I

    .line 1561
    invoke-virtual {v1, p1}, Ll/ۤ᩷ܿ;->֫(I)I

    move-result p2

    iput p2, p0, Ll/ۘۢܿ;->֡:I

    .line 1562
    invoke-static {v0}, Ll/ۗۢܿ;->ܿ(Ll/ۗۢܿ;)Ll/᩺ܺܿ;

    move-result-object p2

    invoke-virtual {p2}, Ll/᩺ܺܿ;->ۧ()Z

    move-result p2

    const/4 v2, 0x0

    if-eqz p2, :cond_4

    iget-boolean p2, p0, Ll/ۘۢܿ;->ᩳ֫:Z

    if-eqz p2, :cond_4

    .line 1564
    iget-object p2, p0, Ll/ۘۢܿ;->ܿ֫:Ll/ܽۢܿ;

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ll/ܽۢܿ;->֫()Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p2, p0, Ll/ۘۢܿ;->ܿ֫:Ll/ܽۢܿ;

    .line 1565
    invoke-virtual {p2}, Ll/ܽۢܿ;->ۧ()Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p2, p0, Ll/ۘۢܿ;->ܿ֫:Ll/ܽۢܿ;

    iget v5, p0, Ll/ۘۢܿ;->ۚ:I

    .line 1566
    invoke-virtual {p2, v5}, Ll/ܽۢܿ;->֫(I)I

    move-result p2

    iput p2, p0, Ll/ۘۢܿ;->ۚ:I

    if-ltz p2, :cond_3

    iget-object p2, p0, Ll/ۘۢܿ;->ܿ֫:Ll/ܽۢܿ;

    .line 1569
    invoke-virtual {v1, p1}, Ll/ۤ᩷ܿ;->ۧ(I)I

    move-result v5

    iget v6, p0, Ll/ۘۢܿ;->֡:I

    add-int/2addr v5, v6

    .line 1568
    invoke-virtual {p2, v5}, Ll/ܽۢܿ;->֫(I)I

    move-result p2

    if-ltz p2, :cond_3

    iget v5, p0, Ll/ۘۢܿ;->ۚ:I

    sub-int/2addr p2, v5

    iget v5, p0, Ll/ۘۢܿ;->֡:I

    if-eq p2, v5, :cond_4

    .line 1571
    :cond_3
    iput-object v2, p0, Ll/ۘۢܿ;->۠:Ll/᩶ۘܿ;

    return-void

    .line 1576
    :cond_4
    :try_start_0
    invoke-virtual {v1, p1}, Ll/ۤ᩷ܿ;->᩻(I)I

    move-result p2

    invoke-direct {p0, p2}, Ll/ۘۢܿ;->ۨ(I)I

    move-result p2

    iput p2, p0, Ll/ۘۢܿ;->᩸:I

    .line 1577
    invoke-virtual {v1, p1}, Ll/ۤ᩷ܿ;->ܿ(I)I

    move-result p2

    invoke-direct {p0, p2}, Ll/ۘۢܿ;->ۨ(I)I

    move-result p2

    iput p2, p0, Ll/ۘۢܿ;->ܶ:I

    .line 1579
    iget-boolean p2, p0, Ll/ۘۢܿ;->ᩳ֫:Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v5, p0, Ll/ۘۢܿ;->᩻:Ll/ܶۘܿ;

    if-eqz p2, :cond_5

    .line 1580
    :try_start_1
    invoke-virtual {v1, p1}, Ll/ۤ᩷ܿ;->ܽ(I)I

    move-result p2

    sget-object v6, Ll/֨ۘܿ;->᩶:Ll/֨ۘܿ;

    invoke-virtual {v5, p2, v6}, Ll/ܶۘܿ;->ۧ(ILl/֨ۘܿ;)I

    move-result p2

    goto :goto_1

    .line 1581
    :cond_5
    invoke-virtual {v1, p1}, Ll/ۤ᩷ܿ;->ܽ(I)I

    move-result p2

    invoke-direct {p0, p2}, Ll/ۘۢܿ;->ۨ(I)I

    move-result p2

    :goto_1
    iput p2, p0, Ll/ۘۢܿ;->֨:I

    .line 1582
    iget-boolean p2, p0, Ll/ۘۢܿ;->ᩳ֫:Z

    if-eqz p2, :cond_6

    .line 1583
    invoke-virtual {v1, p1}, Ll/ۤ᩷ܿ;->ᩳ(I)Ll/᩶ۘܿ;

    move-result-object p2

    .line 1584
    invoke-virtual {v1, p1}, Ll/ۤ᩷ܿ;->ܿ(I)I

    move-result p1

    .line 1583
    invoke-virtual {p2, v5, p1}, Ll/᩶ۘܿ;->֫(Ll/ܶۘܿ;I)Ll/᩶ۘܿ;

    move-result-object p1

    goto :goto_2

    .line 1585
    :cond_6
    invoke-virtual {v1, p1}, Ll/ۤ᩷ܿ;->ᩳ(I)Ll/᩶ۘܿ;

    move-result-object p1

    invoke-virtual {p1, v5}, Ll/᩶ۘܿ;->ۧ(Ll/ܶۘܿ;)Ll/᩶ۘܿ;

    move-result-object p1

    :goto_2
    iput-object p1, p0, Ll/ۘۢܿ;->۠:Ll/᩶ۘܿ;
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    .line 1590
    iget p1, p0, Ll/ۘۢܿ;->᩸:I

    if-ltz p1, :cond_10

    invoke-static {v0}, Ll/ۗۢܿ;->ᩳ(Ll/ۗۢܿ;)I

    move-result p2

    if-ge p1, p2, :cond_10

    iget p1, p0, Ll/ۘۢܿ;->ܶ:I

    if-ltz p1, :cond_10

    iget p2, p0, Ll/ۘۢܿ;->᩸:I

    if-gt p1, p2, :cond_10

    iget p1, p0, Ll/ۘۢܿ;->֨:I

    if-ltz p1, :cond_10

    if-le p1, p2, :cond_7

    goto/16 :goto_8

    .line 1596
    :cond_7
    iget p1, p0, Ll/ۘۢܿ;->ۘ:I

    invoke-virtual {v1, p1}, Ll/ۤ᩷ܿ;->ܺ(I)I

    move-result p1

    iput p1, p0, Ll/ۘۢܿ;->᩵:I

    if-lez p1, :cond_f

    .line 1597
    invoke-virtual {v1}, Ll/ۤ᩷ܿ;->ܿ()I

    move-result p2

    if-gt p1, p2, :cond_f

    iget p1, p0, Ll/ۘۢܿ;->᩵:I

    const/high16 p2, 0x40000

    .line 1599
    invoke-virtual {v1}, Ll/ۤ᩷ܿ;->᩻()I

    move-result v5

    div-int/2addr p2, v5

    if-le p1, p2, :cond_8

    goto :goto_7

    .line 1603
    :cond_8
    iget-object p1, p0, Ll/ۘۢܿ;->ۙ:[I

    if-eqz p1, :cond_9

    array-length p2, p1

    iget v2, p0, Ll/ۘۢܿ;->᩵:I

    if-ge p2, v2, :cond_e

    :cond_9
    if-nez p1, :cond_a

    const/16 p1, 0x10

    .line 1604
    iget p2, p0, Ll/ۘۢܿ;->᩵:I

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    goto :goto_3

    .line 1605
    :cond_a
    iget p2, p0, Ll/ۘۢܿ;->᩵:I

    array-length p1, p1

    shl-int/2addr p1, v4

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 1606
    :goto_3
    iget-object p2, p0, Ll/ۘۢܿ;->ۙ:[I

    if-nez p2, :cond_b

    new-array p2, p1, [I

    goto :goto_4

    :cond_b
    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p2

    :goto_4
    iput-object p2, p0, Ll/ۘۢܿ;->ۙ:[I

    .line 1607
    invoke-static {v0}, Ll/ۗۢܿ;->ܿ(Ll/ۗۢܿ;)Ll/᩺ܺܿ;

    move-result-object p2

    invoke-virtual {p2}, Ll/᩺ܺܿ;->ܿ()Z

    move-result p2

    if-eqz p2, :cond_e

    .line 1608
    iget-object p2, p0, Ll/ۘۢܿ;->᩹:[I

    if-nez p2, :cond_c

    new-array p2, p1, [I

    goto :goto_5

    .line 1609
    :cond_c
    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p2

    :goto_5
    iput-object p2, p0, Ll/ۘۢܿ;->᩹:[I

    .line 1610
    iget-object p2, p0, Ll/ۘۢܿ;->᩶:[Ll/᩶ۘܿ;

    if-nez p2, :cond_d

    .line 1611
    new-array p1, p1, [Ll/᩶ۘܿ;

    goto :goto_6

    .line 1612
    :cond_d
    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ll/᩶ۘܿ;

    :goto_6
    iput-object p1, p0, Ll/ۘۢܿ;->᩶:[Ll/᩶ۘܿ;

    .line 1615
    :cond_e
    iput v3, p0, Ll/ۘۢܿ;->ۧ֫:I

    .line 1616
    iput v3, p0, Ll/ۘۢܿ;->ܿ:I

    .line 1617
    iget p1, p0, Ll/ۘۢܿ;->᩵:I

    sub-int/2addr p1, v4

    iput p1, p0, Ll/ۘۢܿ;->ۜ֫:I

    .line 1618
    iget p1, p0, Ll/ۘۢܿ;->ۘ:I

    invoke-virtual {v1, p1}, Ll/ۤ᩷ܿ;->᩶(I)I

    move-result p1

    iput p1, p0, Ll/ۘۢܿ;->᩷֫:I

    .line 1619
    iput v4, p0, Ll/ۘۢܿ;->ᩳ:I

    return-void

    .line 1600
    :cond_f
    :goto_7
    iput-object v2, p0, Ll/ۘۢܿ;->۠:Ll/᩶ۘܿ;

    return-void

    .line 1593
    :cond_10
    :goto_8
    iput-object v2, p0, Ll/ۘۢܿ;->۠:Ll/᩶ۘܿ;

    return-void

    .line 1587
    :catch_0
    iput-object v2, p0, Ll/ۘۢܿ;->۠:Ll/᩶ۘܿ;

    :cond_11
    :goto_9
    return-void

    .line 1553
    :cond_12
    sget-object p1, Ll/֡ۢܿ;->᩶:Ll/֡ۢܿ;

    .line 5099
    new-instance p2, Ll/۠ۢܿ;

    invoke-direct {p2, p1}, Ll/۠ۢܿ;-><init>(Ll/֡ۢܿ;)V

    .line 1553
    throw p2
.end method

.method private ۧ֫(I)Z
    .locals 3

    .line 2153
    iget-object v0, p0, Ll/ۘۢܿ;->᩻֫:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ܿ(Ll/ۗۢܿ;)Ll/᩺ܺܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩺ܺܿ;->ۧ()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    .line 2154
    :cond_0
    invoke-direct {p0, p1}, Ll/ۘۢܿ;->᩺(I)I

    move-result p1

    .line 2155
    iget-object v0, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    invoke-virtual {v0, p1}, Ll/ۤ᩷ܿ;->ۗ(I)I

    move-result v2

    if-nez v2, :cond_1

    .line 2156
    invoke-virtual {v0, p1}, Ll/ۤ᩷ܿ;->ۙ(I)I

    move-result p1

    invoke-virtual {v0}, Ll/ۤ᩷ܿ;->ۜ()I

    move-result v0

    if-ne p1, v0, :cond_1

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private ۨ(I)I
    .locals 8

    if-gez p1, :cond_0

    return p1

    .line 2005
    :cond_0
    iget-boolean v0, p0, Ll/ۘۢܿ;->ᩳ֫:Z

    iget-object v1, p0, Ll/ۘۢܿ;->᩻:Ll/ܶۘܿ;

    if-nez v0, :cond_2

    .line 2006
    invoke-static {v1, p1}, Ll/ۗۢܿ;->֫(Ll/ܶۘܿ;I)I

    move-result p1

    if-ltz p1, :cond_1

    return p1

    .line 2007
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Ambiguous checkpoint offset"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 2010
    :cond_2
    sget-object v0, Ll/֨ۘܿ;->᩹:Ll/֨ۘܿ;

    invoke-virtual {v1, p1, v0}, Ll/ܶۘܿ;->ۧ(ILl/֨ۘܿ;)I

    move-result v0

    .line 2011
    invoke-virtual {v1}, Ll/ܶۘܿ;->ᩳ()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v1}, Ll/ܶۘܿ;->ܿ()I

    move-result v1

    int-to-long v4, v1

    sub-long/2addr v2, v4

    if-ltz v0, :cond_3

    int-to-long v4, v0

    int-to-long v6, p1

    sub-long/2addr v4, v6

    cmp-long p1, v4, v2

    if-nez p1, :cond_3

    return v0

    .line 2013
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Checkpoint offset does not move with suffix"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ܰ(I)Z
    .locals 2

    .line 2203
    invoke-direct {p0, p1}, Ll/ۘۢܿ;->ۛ(I)Ll/᩶ܺܿ;

    move-result-object v0

    .line 2204
    iget-object v1, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->᩺(I)I

    move-result p1

    invoke-virtual {v1, p1}, Ll/ۤ᩷ܿ;->֫֫(I)I

    move-result p1

    .line 2206
    instance-of v1, v0, Ll/ۤܺܿ;

    if-eqz v1, :cond_1

    .line 2205
    check-cast v0, Ll/ۤܺܿ;

    iget-object v0, v0, Ll/ۤܺܿ;->ܿ:Ll/۠ܺܿ;

    if-eqz v0, :cond_1

    const/16 v0, 0xc

    if-eq p1, v0, :cond_0

    const/16 v0, 0xd

    if-eq p1, v0, :cond_0

    const/16 v0, 0xf

    if-ne p1, v0, :cond_1

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private ܽ(Ll/ᩴۢܿ;)V
    .locals 5

    .line 1488
    iget-boolean v0, p0, Ll/ۘۢܿ;->ܰ:Z

    if-eqz v0, :cond_0

    return-void

    .line 1489
    :cond_0
    iget-object v0, p0, Ll/ۘۢܿ;->᩻֫:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ۧ(Ll/ۗۢܿ;)Ll/ۨ᩷ܿ;

    move-result-object v1

    iget v2, p1, Ll/ᩴۢܿ;->᩶:I

    iget v3, p1, Ll/ᩴۢܿ;->ۗ:I

    iget v4, p1, Ll/ᩴۢܿ;->᩹:I

    invoke-virtual {v1, v2, v3, v4}, Ll/ۨ᩷ܿ;->֫(III)V

    const/4 v1, 0x0

    .line 1492
    iput v1, p0, Ll/ۘۢܿ;->ۨ:I

    .line 1493
    iput v1, p0, Ll/ۘۢܿ;->ܽ:I

    .line 1494
    iput v1, p0, Ll/ۘۢܿ;->ܿ:I

    .line 1495
    invoke-static {v0}, Ll/ۗۢܿ;->ۧ(Ll/ۗۢܿ;)Ll/ۨ᩷ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۨ᩷ܿ;->ۜ()J

    move-result-wide v1

    iput-wide v1, p0, Ll/ۘۢܿ;->۟:J

    .line 1496
    invoke-static {v0}, Ll/ۗۢܿ;->ۧ(Ll/ۗۢܿ;)Ll/ۨ᩷ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۨ᩷ܿ;->ܳ()J

    move-result-wide v0

    iput-wide v0, p1, Ll/ᩴۢܿ;->᩻:J

    .line 1497
    iget-wide v0, p0, Ll/ۘۢܿ;->۟:J

    iput-wide v0, p1, Ll/ᩴۢܿ;->ۜ:J

    const/4 p1, 0x1

    .line 1498
    iput-boolean p1, p0, Ll/ۘۢܿ;->ܰ:Z

    return-void
.end method

.method private ᩷()Z
    .locals 1

    .line 1766
    iget v0, p0, Ll/ۘۢܿ;->ᩳ:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private ᩺(I)I
    .locals 1

    .line 2019
    iget v0, p0, Ll/ۘۢܿ;->᩵:I

    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    .line 2020
    iget v0, p0, Ll/ۘۢܿ;->ۧ֫:I

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Ll/ۘۢܿ;->ۧ:[I

    aget p1, v0, p1

    return p1

    :cond_0
    iget-object v0, p0, Ll/ۘۢܿ;->ۙ:[I

    aget p1, v0, p1

    return p1
.end method


# virtual methods
.method public final ֡(I)I
    .locals 1

    .line 2050
    iget-object v0, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->᩺(I)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤ᩷ܿ;->۟(I)I

    move-result p1

    return p1
.end method

.method public final ֨(I)I
    .locals 1

    .line 2173
    invoke-direct {p0, p1}, Ll/ۘۢܿ;->۟(I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    .line 2174
    :cond_0
    iget-object v0, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->᩺(I)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤ᩷ܿ;->ۚ(I)I

    move-result p1

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->ۨ(I)I

    move-result p1

    return p1
.end method

.method public final ֫()I
    .locals 1

    .line 2217
    iget v0, p0, Ll/ۘۢܿ;->ۚ:I

    return v0
.end method

.method public final ֫(I)I
    .locals 1

    .line 2070
    invoke-direct {p0, p1}, Ll/ۘۢܿ;->ۛ(I)Ll/᩶ܺܿ;

    move-result-object v0

    .line 2071
    instance-of v0, v0, Ll/᩹ܺܿ;

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->֫֫(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    .line 2072
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->᩺(I)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤ᩷ܿ;->ܽ֫(I)I

    move-result p1

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->ۨ(I)I

    move-result p1

    return p1
.end method

.method public final ֫(ILl/ܽۢܿ;)V
    .locals 0

    .line 1527
    iput p1, p0, Ll/ۘۢܿ;->ܳ֫:I

    .line 1528
    iput-object p2, p0, Ll/ۘۢܿ;->ܿ֫:Ll/ܽۢܿ;

    const/4 p1, 0x0

    .line 1809
    iput p1, p0, Ll/ۘۢܿ;->֫:I

    .line 1810
    iput p1, p0, Ll/ۘۢܿ;->ۨ:I

    .line 1811
    iput p1, p0, Ll/ۘۢܿ;->ۧ֫:I

    .line 1812
    iput p1, p0, Ll/ۘۢܿ;->ܽ:I

    .line 1813
    iput p1, p0, Ll/ۘۢܿ;->ܿ:I

    return-void
.end method

.method public final ֫(Ll/ᩴۢܿ;)Z
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1383
    iget v2, v0, Ll/ۘۢܿ;->᩷:I

    const/4 v3, 0x0

    if-ltz v2, :cond_14

    iget-boolean v2, v1, Ll/ᩴۢܿ;->ܿ֫:Z

    iget v4, v1, Ll/ᩴۢܿ;->֡:I

    if-nez v2, :cond_14

    iget-object v2, v0, Ll/ۘۢܿ;->᩻֫:Ll/ۗۢܿ;

    invoke-static {v2}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v5

    add-int/lit8 v6, v4, -0x1

    aget-object v5, v5, v6

    iget v5, v5, Ll/֨ۢܿ;->ܶ֫:I

    const/16 v7, 0xf

    if-eq v5, v7, :cond_0

    goto/16 :goto_5

    .line 1385
    :cond_0
    invoke-static {v2}, Ll/ۗۢܿ;->ۧ(Ll/ۗۢܿ;)Ll/ۨ᩷ܿ;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۨ᩷ܿ;->ᩳ()Z

    move-result v5

    const/4 v7, 0x1

    if-eqz v5, :cond_1

    .line 1386
    invoke-static {v2}, Ll/ۗۢܿ;->ۧ(Ll/ۗۢܿ;)Ll/ۨ᩷ܿ;

    move-result-object v1

    iget-object v2, v0, Ll/ۘۢܿ;->ۖ:Ll/᩵ۢܿ;

    invoke-virtual {v1, v2}, Ll/ۨ᩷ܿ;->֫(Ll/ۛ᩷ܿ;)V

    return v7

    .line 1389
    :cond_1
    iget v5, v0, Ll/ۘۢܿ;->ۡ:I

    iget-object v8, v0, Ll/ۘۢܿ;->᩻:Ll/ܶۘܿ;

    const/4 v9, -0x1

    iget-object v10, v0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    if-ltz v5, :cond_d

    .line 1390
    invoke-static {v2}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v4

    iget v5, v0, Ll/ۘۢܿ;->ۡ:I

    aget-object v4, v4, v5

    iget v4, v4, Ll/֨ۢܿ;->ۖ:I

    if-ne v5, v6, :cond_2

    const/4 v3, 0x1

    .line 1392
    :cond_2
    iget v5, v0, Ll/ۘۢܿ;->ܺ:I

    if-ltz v5, :cond_c

    invoke-virtual {v10}, Ll/ۤ᩷ܿ;->ܿ()I

    move-result v6

    if-ge v5, v6, :cond_c

    iget v5, v0, Ll/ۘۢܿ;->ܺ:I

    .line 1456
    invoke-virtual {v10, v5}, Ll/ۤ᩷ܿ;->۬(I)I

    move-result v6

    invoke-virtual {v10, v4}, Ll/ۤ᩷ܿ;->۬(I)I

    move-result v11

    if-ne v6, v11, :cond_c

    .line 1457
    invoke-virtual {v10, v5}, Ll/ۤ᩷ܿ;->᩹(I)I

    move-result v6

    invoke-virtual {v10, v4}, Ll/ۤ᩷ܿ;->᩹(I)I

    move-result v11

    if-ne v6, v11, :cond_c

    .line 1458
    invoke-virtual {v10, v5}, Ll/ۤ᩷ܿ;->֫֫(I)I

    move-result v6

    invoke-virtual {v10, v4}, Ll/ۤ᩷ܿ;->֫֫(I)I

    move-result v11

    if-ne v6, v11, :cond_c

    .line 1459
    invoke-virtual {v10, v5}, Ll/ۤ᩷ܿ;->ۤ(I)I

    move-result v6

    invoke-virtual {v10, v4}, Ll/ۤ᩷ܿ;->ۤ(I)I

    move-result v11

    if-ne v6, v11, :cond_c

    .line 1460
    invoke-virtual {v10, v5}, Ll/ۤ᩷ܿ;->۟(I)I

    move-result v6

    invoke-virtual {v10, v4}, Ll/ۤ᩷ܿ;->۟(I)I

    move-result v11

    if-ne v6, v11, :cond_c

    .line 1461
    invoke-virtual {v10, v5}, Ll/ۤ᩷ܿ;->ۗ(I)I

    move-result v6

    invoke-virtual {v10, v4}, Ll/ۤ᩷ܿ;->ۗ(I)I

    move-result v11

    if-ne v6, v11, :cond_c

    .line 1462
    invoke-virtual {v10, v5}, Ll/ۤ᩷ܿ;->ۙ(I)I

    move-result v6

    invoke-virtual {v10, v4}, Ll/ۤ᩷ܿ;->ۙ(I)I

    move-result v11

    if-ne v6, v11, :cond_c

    .line 1463
    invoke-virtual {v10, v5}, Ll/ۤ᩷ܿ;->ۢ(I)I

    move-result v6

    invoke-virtual {v10, v4}, Ll/ۤ᩷ܿ;->ۢ(I)I

    move-result v11

    if-ne v6, v11, :cond_c

    .line 1464
    invoke-virtual {v10, v5}, Ll/ۤ᩷ܿ;->ۡ(I)I

    move-result v6

    invoke-virtual {v10, v4}, Ll/ۤ᩷ܿ;->ۡ(I)I

    move-result v11

    if-ne v6, v11, :cond_c

    .line 1465
    invoke-virtual {v10, v5}, Ll/ۤ᩷ܿ;->ۖ(I)I

    move-result v6

    invoke-virtual {v10, v4}, Ll/ۤ᩷ܿ;->ۖ(I)I

    move-result v11

    if-eq v6, v11, :cond_3

    goto/16 :goto_2

    .line 1466
    :cond_3
    invoke-static {v2}, Ll/ۗۢܿ;->ܿ(Ll/ۗۢܿ;)Ll/᩺ܺܿ;

    move-result-object v6

    iget-object v6, v6, Ll/᩺ܺܿ;->᩷:[Ll/᩶ܺܿ;

    invoke-virtual {v10, v5}, Ll/ۤ᩷ܿ;->۬(I)I

    move-result v11

    aget-object v6, v6, v11

    .line 1467
    instance-of v11, v6, Ll/᩹ܺܿ;

    if-nez v11, :cond_4

    instance-of v11, v6, Ll/ۤܺܿ;

    if-eqz v11, :cond_5

    .line 1468
    :cond_4
    invoke-virtual {v10, v5}, Ll/ۤ᩷ܿ;->ܽ֫(I)I

    move-result v11

    invoke-virtual {v10, v4}, Ll/ۤ᩷ܿ;->ܽ֫(I)I

    move-result v12

    if-ne v11, v12, :cond_c

    .line 1469
    invoke-virtual {v10, v5}, Ll/ۤ᩷ܿ;->ۧ֫(I)I

    move-result v11

    invoke-virtual {v10, v4}, Ll/ۤ᩷ܿ;->ۧ֫(I)I

    move-result v12

    if-eq v11, v12, :cond_5

    goto/16 :goto_2

    .line 1471
    :cond_5
    instance-of v6, v6, Ll/ۤܺܿ;

    if-eqz v6, :cond_6

    .line 1472
    invoke-virtual {v10, v5}, Ll/ۤ᩷ܿ;->۫(I)I

    move-result v6

    invoke-virtual {v10, v4}, Ll/ۤ᩷ܿ;->۫(I)I

    move-result v11

    if-ne v6, v11, :cond_c

    .line 1473
    invoke-virtual {v10, v5}, Ll/ۤ᩷ܿ;->ۛ(I)I

    move-result v6

    invoke-virtual {v10, v4}, Ll/ۤ᩷ܿ;->ۛ(I)I

    move-result v11

    if-ne v6, v11, :cond_c

    .line 1474
    invoke-virtual {v10, v5}, Ll/ۤ᩷ܿ;->֡(I)I

    move-result v6

    invoke-virtual {v10, v4}, Ll/ۤ᩷ܿ;->֡(I)I

    move-result v11

    if-ne v6, v11, :cond_c

    .line 1475
    invoke-virtual {v10, v5}, Ll/ۤ᩷ܿ;->ᩴ(I)I

    move-result v6

    invoke-virtual {v10, v4}, Ll/ۤ᩷ܿ;->ᩴ(I)I

    move-result v11

    if-eq v6, v11, :cond_6

    goto/16 :goto_2

    :cond_6
    if-nez v3, :cond_7

    .line 1477
    invoke-virtual {v10, v5}, Ll/ۤ᩷ܿ;->ᩳ֫(I)I

    move-result v3

    invoke-virtual {v10, v4}, Ll/ۤ᩷ܿ;->ᩳ֫(I)I

    move-result v6

    if-ne v3, v6, :cond_c

    .line 1478
    invoke-virtual {v10, v5}, Ll/ۤ᩷ܿ;->᩵(I)I

    move-result v3

    invoke-virtual {v10, v4}, Ll/ۤ᩷ܿ;->᩵(I)I

    move-result v6

    if-ne v3, v6, :cond_c

    .line 1479
    invoke-virtual {v10, v5}, Ll/ۤ᩷ܿ;->ۨ(I)I

    move-result v3

    invoke-virtual {v10, v4}, Ll/ۤ᩷ܿ;->ۨ(I)I

    move-result v6

    if-ne v3, v6, :cond_c

    .line 1480
    invoke-virtual {v10, v5}, Ll/ۤ᩷ܿ;->ܿ֫(I)I

    move-result v3

    invoke-virtual {v10, v4}, Ll/ۤ᩷ܿ;->ܿ֫(I)I

    move-result v6

    if-ne v3, v6, :cond_c

    .line 1481
    invoke-virtual {v10, v5}, Ll/ۤ᩷ܿ;->᩷(I)I

    move-result v3

    invoke-virtual {v10, v4}, Ll/ۤ᩷ܿ;->᩷(I)I

    move-result v6

    if-ne v3, v6, :cond_c

    .line 1482
    invoke-virtual {v10, v5}, Ll/ۤ᩷ܿ;->᩺(I)I

    move-result v3

    invoke-virtual {v10, v4}, Ll/ۤ᩷ܿ;->᩺(I)I

    move-result v6

    if-ne v3, v6, :cond_c

    .line 1483
    invoke-virtual {v10, v5}, Ll/ۤ᩷ܿ;->ۜ(I)J

    move-result-wide v5

    invoke-virtual {v10, v4}, Ll/ۤ᩷ܿ;->ۜ(I)J

    move-result-wide v3

    cmp-long v11, v5, v3

    if-nez v11, :cond_c

    .line 1397
    :cond_7
    iget v3, v0, Ll/ۘۢܿ;->ܺ:I

    invoke-virtual {v10, v3}, Ll/ۤ᩷ܿ;->ܶ(I)Ll/᩶ۘܿ;

    move-result-object v3

    .line 1398
    iget v4, v0, Ll/ۘۢܿ;->ܺ:I

    invoke-virtual {v10, v4}, Ll/ۤ᩷ܿ;->۠(I)I

    move-result v4

    if-eqz v3, :cond_8

    .line 1400
    :try_start_0
    iget v5, v0, Ll/ۘۢܿ;->ۜ:I

    invoke-virtual {v10, v5}, Ll/ۤ᩷ܿ;->᩻(I)I

    move-result v5

    if-le v4, v5, :cond_8

    .line 1401
    iput v9, v0, Ll/ۘۢܿ;->ۡ:I

    return v7

    .line 1404
    :cond_8
    iget-object v5, v0, Ll/ۘۢܿ;->ۖ:Ll/᩵ۢܿ;

    iget-object v5, v5, Ll/᩵ۢܿ;->ܿ:[Ll/᩶ۘܿ;

    iget v6, v0, Ll/ۘۢܿ;->ۡ:I

    if-nez v3, :cond_9

    const/4 v11, 0x0

    goto :goto_0

    .line 1405
    :cond_9
    invoke-virtual {v3, v8}, Ll/᩶ۘܿ;->ۧ(Ll/ܶۘܿ;)Ll/᩶ۘܿ;

    move-result-object v11

    :goto_0
    aput-object v11, v5, v6

    .line 1406
    iget-object v5, v0, Ll/ۘۢܿ;->ۖ:Ll/᩵ۢܿ;

    iget-object v5, v5, Ll/᩵ۢܿ;->ᩳ:[I

    iget v6, v0, Ll/ۘۢܿ;->ۡ:I

    if-nez v3, :cond_a

    const/4 v4, -0x1

    goto :goto_1

    .line 1407
    :cond_a
    invoke-static {v8, v4}, Ll/ۗۢܿ;->֫(Ll/ܶۘܿ;I)I

    move-result v4

    :goto_1
    aput v4, v5, v6

    if-eqz v3, :cond_b

    .line 1408
    iget-object v3, v0, Ll/ۘۢܿ;->ۖ:Ll/᩵ۢܿ;

    iget-object v3, v3, Ll/᩵ۢܿ;->ᩳ:[I

    iget v4, v0, Ll/ۘۢܿ;->ۡ:I

    aget v3, v3, v4

    if-gez v3, :cond_b

    .line 1409
    iput v9, v0, Ll/ۘۢܿ;->ۡ:I
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return v7

    .line 1416
    :cond_b
    iget v3, v0, Ll/ۘۢܿ;->ܺ:I

    invoke-virtual {v10, v3}, Ll/ۤ᩷ܿ;->ܰ(I)I

    move-result v3

    iput v3, v0, Ll/ۘۢܿ;->ܺ:I

    .line 1417
    iget v4, v0, Ll/ۘۢܿ;->ۡ:I

    sub-int/2addr v4, v7

    iput v4, v0, Ll/ۘۢܿ;->ۡ:I

    if-gez v4, :cond_12

    if-ne v3, v9, :cond_12

    .line 1418
    invoke-static {v2}, Ll/ۗۢܿ;->ۧ(Ll/ۗۢܿ;)Ll/ۨ᩷ܿ;

    move-result-object v10

    iget-object v15, v0, Ll/ۘۢܿ;->ۖ:Ll/᩵ۢܿ;

    iget v11, v15, Ll/᩵ۢܿ;->ܽ:I

    iget v12, v1, Ll/ᩴۢܿ;->᩶:I

    iget v13, v1, Ll/ᩴۢܿ;->᩹:I

    iget-object v14, v0, Ll/ۘۢܿ;->ۢ:Ll/᩶ۘܿ;

    const/16 v16, 0x0

    .line 266
    invoke-virtual/range {v10 .. v16}, Ll/ۨ᩷ܿ;->֫(IIILl/᩶ۘܿ;Ll/ۛ᩷ܿ;I)Z

    return v7

    .line 1413
    :catch_0
    iput v9, v0, Ll/ۘۢܿ;->ۡ:I

    return v7

    .line 1394
    :cond_c
    :goto_2
    iput v9, v0, Ll/ۘۢܿ;->ۡ:I

    return v7

    .line 1424
    :cond_d
    iget v5, v0, Ll/ۘۢܿ;->᩷:I

    iget v11, v0, Ll/ۘۢܿ;->֫֫:I

    if-gt v5, v11, :cond_13

    invoke-static {v2}, Ll/ۗۢܿ;->ۧ(Ll/ۗۢܿ;)Ll/ۨ᩷ܿ;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۨ᩷ܿ;->ܽ()Z

    move-result v5

    if-nez v5, :cond_e

    goto :goto_4

    .line 1428
    :cond_e
    iget v3, v0, Ll/ۘۢܿ;->᩷:I

    add-int/lit8 v5, v3, 0x1

    iput v5, v0, Ll/ۘۢܿ;->᩷:I

    .line 1429
    invoke-virtual {v10, v3}, Ll/ۤ᩷ܿ;->ܳ(I)Z

    move-result v5

    if-eqz v5, :cond_12

    .line 1430
    invoke-virtual {v10, v3}, Ll/ۤ᩷ܿ;->ܺ(I)I

    move-result v5

    if-ne v5, v4, :cond_12

    .line 1431
    invoke-virtual {v10, v3}, Ll/ۤ᩷ܿ;->ۧ(I)I

    move-result v5

    invoke-virtual {v10, v11}, Ll/ۤ᩷ܿ;->ۧ(I)I

    move-result v9

    if-ne v5, v9, :cond_12

    .line 1432
    invoke-virtual {v10, v3}, Ll/ۤ᩷ܿ;->֫(I)I

    move-result v5

    invoke-virtual {v10, v11}, Ll/ۤ᩷ܿ;->֫(I)I

    move-result v9

    if-le v5, v9, :cond_f

    goto :goto_3

    .line 1433
    :cond_f
    invoke-virtual {v10, v3}, Ll/ۤ᩷ܿ;->᩻(I)I

    move-result v5

    invoke-static {v8, v5}, Ll/ۗۢܿ;->֫(Ll/ܶۘܿ;I)I

    move-result v5

    if-ltz v5, :cond_12

    .line 1434
    iget v1, v1, Ll/ᩴۢܿ;->ۙ:I

    if-le v5, v1, :cond_10

    goto :goto_3

    .line 1436
    :cond_10
    :try_start_1
    invoke-virtual {v10, v3}, Ll/ۤ᩷ܿ;->ᩳ(I)Ll/᩶ۘܿ;

    move-result-object v1

    invoke-virtual {v1, v8}, Ll/᩶ۘܿ;->ۧ(Ll/ܶۘܿ;)Ll/᩶ۘܿ;

    move-result-object v1

    iput-object v1, v0, Ll/ۘۢܿ;->ۢ:Ll/᩶ۘܿ;
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1440
    iget-object v1, v0, Ll/ۘۢܿ;->ۖ:Ll/᩵ۢܿ;

    if-nez v1, :cond_11

    .line 1441
    new-instance v1, Ll/᩵ۢܿ;

    invoke-direct {v1, v2}, Ll/᩵ۢܿ;-><init>(Ll/ۗۢܿ;)V

    iput-object v1, v0, Ll/ۘۢܿ;->ۖ:Ll/᩵ۢܿ;

    .line 1442
    iput v4, v1, Ll/᩵ۢܿ;->ۧ:I

    .line 1443
    new-array v2, v4, [Ll/᩶ۘܿ;

    iput-object v2, v1, Ll/᩵ۢܿ;->ܿ:[Ll/᩶ۘܿ;

    .line 1444
    new-array v2, v4, [I

    iput-object v2, v1, Ll/᩵ۢܿ;->ᩳ:[I

    .line 1446
    :cond_11
    iget-object v1, v0, Ll/ۘۢܿ;->ۖ:Ll/᩵ۢܿ;

    iput v5, v1, Ll/᩵ۢܿ;->ܽ:I

    .line 1447
    invoke-virtual {v10, v3}, Ll/ۤ᩷ܿ;->֫(I)I

    move-result v2

    iput v2, v1, Ll/᩵ۢܿ;->֫:I

    .line 1448
    iput v3, v0, Ll/ۘۢܿ;->ۜ:I

    .line 1449
    iput v6, v0, Ll/ۘۢܿ;->ۡ:I

    .line 1450
    invoke-virtual {v10, v3}, Ll/ۤ᩷ܿ;->᩶(I)I

    move-result v1

    iput v1, v0, Ll/ۘۢܿ;->ܺ:I

    :catch_1
    :cond_12
    :goto_3
    return v7

    .line 1425
    :cond_13
    :goto_4
    iput v9, v0, Ll/ۘۢܿ;->᩷:I

    :cond_14
    :goto_5
    return v3
.end method

.method public final ۖ(I)I
    .locals 1

    .line 2161
    invoke-direct {p0, p1}, Ll/ۘۢܿ;->۟(I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    .line 2162
    :cond_0
    iget-object v0, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->᩺(I)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤ᩷ܿ;->᩸(I)I

    move-result p1

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->ۨ(I)I

    move-result p1

    return p1
.end method

.method public final ۗ(I)I
    .locals 1

    .line 2197
    invoke-direct {p0, p1}, Ll/ۘۢܿ;->ܰ(I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2198
    :cond_0
    iget-object v0, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->᩺(I)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤ᩷ܿ;->ۘ(I)I

    move-result p1

    return p1
.end method

.method public final ۘ(I)I
    .locals 1

    .line 2179
    invoke-direct {p0, p1}, Ll/ۘۢܿ;->ܰ(I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    .line 2180
    :cond_0
    iget-object v0, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->᩺(I)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤ᩷ܿ;->֡(I)I

    move-result p1

    return p1
.end method

.method public final ۙ(I)I
    .locals 1

    .line 2115
    iget-object v0, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->᩺(I)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤ᩷ܿ;->ۨ(I)I

    move-result p1

    return p1
.end method

.method public final ۚ(I)Ll/᩶ۘܿ;
    .locals 1

    .line 2135
    iget-object v0, p0, Ll/ۘۢܿ;->᩶:[Ll/᩶ۘܿ;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ۜ(I)I
    .locals 1

    .line 2185
    invoke-direct {p0, p1}, Ll/ۘۢܿ;->ܰ(I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    .line 2186
    :cond_0
    iget-object v0, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->᩺(I)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤ᩷ܿ;->ᩴ(I)I

    move-result p1

    return p1
.end method

.method public final ۠(I)I
    .locals 1

    .line 2105
    iget-object v0, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->᩺(I)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤ᩷ܿ;->ܿ֫(I)I

    move-result p1

    return p1
.end method

.method public final ۡ(I)I
    .locals 1

    .line 2227
    iget-object v0, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->᩺(I)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤ᩷ܿ;->ۢ(I)I

    move-result p1

    return p1
.end method

.method public final ۢ(I)I
    .locals 1

    .line 2191
    invoke-direct {p0, p1}, Ll/ۘۢܿ;->ܰ(I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    .line 2192
    :cond_0
    iget-object v0, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->᩺(I)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤ᩷ܿ;->᩵(I)I

    move-result p1

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->ۨ(I)I

    move-result p1

    return p1
.end method

.method public final ۤ(I)I
    .locals 1

    .line 2140
    invoke-direct {p0, p1}, Ll/ۘۢܿ;->ۧ֫(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2141
    :cond_0
    iget-object v0, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->᩺(I)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤ᩷ܿ;->ۗ(I)I

    move-result p1

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->ۨ(I)I

    move-result p1

    return p1
.end method

.method public final ۧ()I
    .locals 1

    .line 2040
    iget v0, p0, Ll/ۘۢܿ;->᩵:I

    return v0
.end method

.method public final ۧ(I)I
    .locals 1

    .line 2060
    iget-object v0, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->᩺(I)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤ᩷ܿ;->֫֫(I)I

    move-result p1

    return p1
.end method

.method public final ۧ(Ll/ᩴۢܿ;)Z
    .locals 3

    .line 1359
    iget-object v0, p0, Ll/ۘۢܿ;->۬:Ll/ᩴۢܿ;

    if-nez v0, :cond_0

    .line 1360
    iput-object p1, p0, Ll/ۘۢܿ;->۬:Ll/ᩴۢܿ;

    goto :goto_0

    :cond_0
    if-ne v0, p1, :cond_4

    .line 1364
    :goto_0
    invoke-direct {p0}, Ll/ۘۢܿ;->᩷()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    .line 1365
    invoke-direct {p0}, Ll/ۘۢܿ;->ۜ()V

    return v1

    .line 1368
    :cond_1
    iget-object v0, p0, Ll/ۘۢܿ;->᩻֫:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ܿ(Ll/ۗۢܿ;)Ll/᩺ܺܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩺ܺܿ;->ۧ()Z

    move-result v0

    iget v2, p0, Ll/ۘۢܿ;->֫֫:I

    if-eqz v0, :cond_2

    iget v0, p0, Ll/ۘۢܿ;->᩷:I

    if-gez v0, :cond_2

    iget v0, p0, Ll/ۘۢܿ;->ᩴ:I

    if-gt v0, v2, :cond_2

    .line 1370
    iput v0, p0, Ll/ۘۢܿ;->᩷:I

    .line 1372
    :cond_2
    iget v0, p0, Ll/ۘۢܿ;->ᩴ:I

    if-gt v0, v2, :cond_3

    add-int/lit8 p1, v0, 0x1

    .line 1373
    iput p1, p0, Ll/ۘۢܿ;->ᩴ:I

    invoke-direct {p0, v0, v1}, Ll/ۘۢܿ;->ۧ(II)V

    return v1

    .line 1376
    :cond_3
    invoke-direct {p0, p1}, Ll/ۘۢܿ;->ܽ(Ll/ᩴۢܿ;)V

    const/4 p1, 0x0

    .line 1377
    iput-object p1, p0, Ll/ۘۢܿ;->۬:Ll/ᩴۢܿ;

    const/4 p1, 0x0

    return p1

    .line 1362
    :cond_4
    sget-object p1, Ll/֡ۢܿ;->᩶:Ll/֡ۢܿ;

    .line 5099
    new-instance v0, Ll/۠ۢܿ;

    invoke-direct {v0, p1}, Ll/۠ۢܿ;-><init>(Ll/֡ۢܿ;)V

    .line 1362
    throw v0
.end method

.method public final ۫(I)I
    .locals 1

    .line 2099
    invoke-direct {p0, p1}, Ll/ۘۢܿ;->֫֫(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2100
    iget-object v0, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->᩺(I)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤ᩷ܿ;->ᩳ֫(I)I

    move-result p1

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->ۨ(I)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۬(I)I
    .locals 1

    .line 2045
    iget-object v0, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->᩺(I)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤ᩷ܿ;->۬(I)I

    move-result p1

    return p1
.end method

.method public final ܳ(I)I
    .locals 1

    .line 2065
    iget-object v0, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->᩺(I)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤ᩷ܿ;->᩹(I)I

    move-result p1

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->ۨ(I)I

    move-result p1

    return p1
.end method

.method public final ܳ()Z
    .locals 5

    .line 1535
    invoke-direct {p0}, Ll/ۘۢܿ;->᩷()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 1536
    invoke-direct {p0}, Ll/ۘۢܿ;->ۜ()V

    return v1

    .line 1539
    :cond_0
    iget v0, p0, Ll/ۘۢܿ;->ܳ֫:I

    const/4 v2, 0x0

    if-gez v0, :cond_1

    return v2

    .line 1540
    :cond_1
    iget v0, p0, Ll/ۘۢܿ;->ᩴ:I

    iget-object v3, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    invoke-virtual {v3}, Ll/ۤ᩷ܿ;->ᩳ()I

    move-result v4

    if-lt v0, v4, :cond_2

    return v2

    .line 1541
    :cond_2
    iget v0, p0, Ll/ۘۢܿ;->ᩴ:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Ll/ۘۢܿ;->ᩴ:I

    .line 1542
    invoke-virtual {v3, v0}, Ll/ۤ᩷ܿ;->᩻(I)I

    move-result v2

    iget v4, p0, Ll/ۘۢܿ;->ܳ֫:I

    if-lt v2, v4, :cond_4

    .line 1543
    invoke-virtual {v3, v0}, Ll/ۤ᩷ܿ;->ܿ(I)I

    move-result v2

    iget v4, p0, Ll/ۘۢܿ;->ܳ֫:I

    if-lt v2, v4, :cond_4

    iget v2, p0, Ll/ۘۢܿ;->ܺ֫:I

    if-ltz v2, :cond_3

    .line 1544
    invoke-virtual {v3, v0}, Ll/ۤ᩷ܿ;->ܿ(I)I

    move-result v2

    iget v3, p0, Ll/ۘۢܿ;->ܺ֫:I

    if-gt v2, v3, :cond_4

    :cond_3
    const/4 v2, 0x2

    .line 1545
    invoke-direct {p0, v0, v2}, Ll/ۘۢܿ;->ۧ(II)V

    :cond_4
    return v1
.end method

.method public final ܶ(I)I
    .locals 1

    .line 2146
    invoke-direct {p0, p1}, Ll/ۘۢܿ;->ۧ֫(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Ll/ۘۢܿ;->᩻֫:Ll/ۗۢܿ;

    invoke-static {p1}, Ll/ۗۢܿ;->ᩳ(Ll/ۗۢܿ;)I

    move-result p1

    return p1

    .line 2147
    :cond_0
    iget-object v0, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->᩺(I)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤ᩷ܿ;->ۙ(I)I

    move-result p1

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->ۨ(I)I

    move-result p1

    return p1
.end method

.method public final ܺ(I)I
    .locals 1

    .line 2237
    iget-object v0, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->᩺(I)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤ᩷ܿ;->ۖ(I)I

    move-result p1

    return p1
.end method

.method public final ܽ()I
    .locals 1

    .line 2222
    iget v0, p0, Ll/ۘۢܿ;->֡:I

    return v0
.end method

.method public final ܽ(I)J
    .locals 2

    .line 2125
    iget-object v0, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->᩺(I)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤ᩷ܿ;->ۜ(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ܿ(I)I
    .locals 1

    .line 2130
    iget-object v0, p0, Ll/ۘۢܿ;->᩹:[I

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    aget p1, v0, p1

    return p1
.end method

.method public final ܿ()Z
    .locals 5

    .line 1341
    invoke-direct {p0}, Ll/ۘۢܿ;->᩷()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 1342
    invoke-direct {p0}, Ll/ۘۢܿ;->ۜ()V

    return v1

    .line 1345
    :cond_0
    iget-boolean v0, p0, Ll/ۘۢܿ;->۫:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    return v2

    .line 1346
    :cond_1
    iget v0, p0, Ll/ۘۢܿ;->ᩴ:I

    iget-object v3, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    invoke-virtual {v3}, Ll/ۤ᩷ܿ;->ᩳ()I

    move-result v4

    if-ge v0, v4, :cond_3

    iget v0, p0, Ll/ۘۢܿ;->ᩴ:I

    invoke-virtual {v3, v0}, Ll/ۤ᩷ܿ;->᩻(I)I

    move-result v0

    iget v3, p0, Ll/ۘۢܿ;->ۗ:I

    if-lt v0, v3, :cond_2

    goto :goto_0

    .line 1350
    :cond_2
    iget v0, p0, Ll/ۘۢܿ;->ᩴ:I

    add-int/lit8 v3, v0, 0x1

    iput v3, p0, Ll/ۘۢܿ;->ᩴ:I

    invoke-direct {p0, v0, v2}, Ll/ۘۢܿ;->ۧ(II)V

    return v1

    .line 1347
    :cond_3
    :goto_0
    iput-boolean v1, p0, Ll/ۘۢܿ;->۫:Z

    return v2
.end method

.method public final ᩳ(I)I
    .locals 1

    .line 2084
    invoke-direct {p0, p1}, Ll/ۘۢܿ;->֫֫(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2085
    iget-object v0, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->᩺(I)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤ᩷ܿ;->۫(I)I

    move-result p1

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->ۨ(I)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩳ()V
    .locals 5

    .line 1503
    iget-boolean v0, p0, Ll/ۘۢܿ;->ܰ:Z

    if-eqz v0, :cond_0

    iget-wide v0, p0, Ll/ۘۢܿ;->۟:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    invoke-direct {p0}, Ll/ۘۢܿ;->᩷()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۘۢܿ;->᩻֫:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ۧ(Ll/ۗۢܿ;)Ll/ۨ᩷ܿ;

    move-result-object v1

    .line 1504
    invoke-virtual {v1}, Ll/ۨ᩷ܿ;->ᩳ()Z

    move-result v1

    if-nez v1, :cond_0

    .line 1507
    invoke-static {v0}, Ll/ۗۢܿ;->ۧ(Ll/ۗۢܿ;)Ll/ۨ᩷ܿ;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ll/ۨ᩷ܿ;->֫(Z)V

    const/4 v0, 0x0

    .line 1809
    iput v0, p0, Ll/ۘۢܿ;->֫:I

    .line 1810
    iput v0, p0, Ll/ۘۢܿ;->ۨ:I

    .line 1811
    iput v0, p0, Ll/ۘۢܿ;->ۧ֫:I

    .line 1812
    iput v0, p0, Ll/ۘۢܿ;->ܽ:I

    .line 1813
    iput v0, p0, Ll/ۘۢܿ;->ܿ:I

    const-wide/16 v1, -0x1

    .line 1509
    iput-wide v1, p0, Ll/ۘۢܿ;->۟:J

    .line 1510
    iput-boolean v0, p0, Ll/ۘۢܿ;->ܰ:Z

    return-void

    .line 1505
    :cond_0
    sget-object v0, Ll/֡ۢܿ;->᩶:Ll/֡ۢܿ;

    .line 5099
    new-instance v1, Ll/۠ۢܿ;

    invoke-direct {v1, v0}, Ll/۠ۢܿ;-><init>(Ll/֡ۢܿ;)V

    .line 1505
    throw v1
.end method

.method public final ᩴ(I)I
    .locals 1

    .line 2232
    iget-object v0, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->᩺(I)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤ᩷ܿ;->ۡ(I)I

    move-result p1

    return p1
.end method

.method public final ᩵(I)I
    .locals 1

    .line 2055
    iget-object v0, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->᩺(I)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤ᩷ܿ;->ۤ(I)I

    move-result p1

    return p1
.end method

.method public final ᩶(I)I
    .locals 1

    .line 2120
    iget-object v0, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->᩺(I)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤ᩷ܿ;->᩺(I)I

    move-result p1

    return p1
.end method

.method public final ᩷(I)I
    .locals 1

    .line 2090
    invoke-direct {p0, p1}, Ll/ۘۢܿ;->֫֫(I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2091
    :cond_0
    invoke-direct {p0, p1}, Ll/ۘۢܿ;->ۛ(I)Ll/᩶ܺܿ;

    move-result-object v0

    check-cast v0, Ll/ۤܺܿ;

    .line 2093
    iget-object v0, v0, Ll/ۤܺܿ;->ܿ:Ll/۠ܺܿ;

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->ۧ֫(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2094
    iget-object p1, p0, Ll/ۘۢܿ;->᩻֫:Ll/ۗۢܿ;

    invoke-static {p1}, Ll/ۗۢܿ;->ᩳ(Ll/ۗۢܿ;)I

    move-result p1

    return p1

    :cond_1
    iget-object v0, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->᩺(I)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤ᩷ܿ;->ۛ(I)I

    move-result p1

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->ۨ(I)I

    move-result p1

    return p1
.end method

.method public final ᩸(I)I
    .locals 1

    .line 2167
    invoke-direct {p0, p1}, Ll/ۘۢܿ;->۟(I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    .line 2168
    :cond_0
    iget-object v0, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->᩺(I)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤ᩷ܿ;->֨(I)I

    move-result p1

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->ۨ(I)I

    move-result p1

    return p1
.end method

.method public final ᩹(I)I
    .locals 3

    .line 2077
    invoke-direct {p0, p1}, Ll/ۘۢܿ;->ۛ(I)Ll/᩶ܺܿ;

    move-result-object v0

    .line 2078
    instance-of v0, v0, Ll/᩹ܺܿ;

    iget-object v1, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    if-nez v0, :cond_1

    .line 2034
    invoke-direct {p0, p1}, Ll/ۘۢܿ;->ۛ(I)Ll/᩶ܺܿ;

    move-result-object v0

    instance-of v2, v0, Ll/ۤܺܿ;

    if-eqz v2, :cond_0

    check-cast v0, Ll/ۤܺܿ;

    iget-object v0, v0, Ll/ۤܺܿ;->ۧ:Ll/ۛܺܿ;

    if-eqz v0, :cond_0

    .line 2035
    invoke-direct {p0, p1}, Ll/ۘۢܿ;->᩺(I)I

    move-result v0

    invoke-virtual {v1, v0}, Ll/ۤ᩷ܿ;->֫֫(I)I

    move-result v0

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    .line 2079
    :cond_1
    :goto_0
    invoke-direct {p0, p1}, Ll/ۘۢܿ;->᩺(I)I

    move-result p1

    invoke-virtual {v1, p1}, Ll/ۤ᩷ܿ;->ۧ֫(I)I

    move-result p1

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->ۨ(I)I

    move-result p1

    return p1
.end method

.method public final ᩻(I)I
    .locals 1

    .line 2110
    iget-object v0, p0, Ll/ۘۢܿ;->ܽ֫:Ll/ۤ᩷ܿ;

    invoke-direct {p0, p1}, Ll/ۘۢܿ;->᩺(I)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤ᩷ܿ;->᩷(I)I

    move-result p1

    return p1
.end method

.method public final ᩻()V
    .locals 5

    .line 1515
    iget-boolean v0, p0, Ll/ۘۢܿ;->ܰ:Z

    if-eqz v0, :cond_0

    iget-wide v0, p0, Ll/ۘۢܿ;->۟:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    invoke-direct {p0}, Ll/ۘۢܿ;->᩷()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۘۢܿ;->᩻֫:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ۧ(Ll/ۗۢܿ;)Ll/ۨ᩷ܿ;

    move-result-object v1

    .line 1516
    invoke-virtual {v1}, Ll/ۨ᩷ܿ;->ᩳ()Z

    move-result v1

    if-nez v1, :cond_0

    .line 1519
    invoke-static {v0}, Ll/ۗۢܿ;->ۧ(Ll/ۗۢܿ;)Ll/ۨ᩷ܿ;

    move-result-object v0

    iget-wide v1, p0, Ll/ۘۢܿ;->۟:J

    invoke-virtual {v0, v1, v2}, Ll/ۨ᩷ܿ;->֫(J)V

    const/4 v0, 0x0

    .line 1809
    iput v0, p0, Ll/ۘۢܿ;->֫:I

    .line 1810
    iput v0, p0, Ll/ۘۢܿ;->ۨ:I

    .line 1811
    iput v0, p0, Ll/ۘۢܿ;->ۧ֫:I

    .line 1812
    iput v0, p0, Ll/ۘۢܿ;->ܽ:I

    .line 1813
    iput v0, p0, Ll/ۘۢܿ;->ܿ:I

    const-wide/16 v1, -0x1

    .line 1521
    iput-wide v1, p0, Ll/ۘۢܿ;->۟:J

    .line 1522
    iput-boolean v0, p0, Ll/ۘۢܿ;->ܰ:Z

    return-void

    .line 1517
    :cond_0
    sget-object v0, Ll/֡ۢܿ;->᩶:Ll/֡ۢܿ;

    .line 5099
    new-instance v1, Ll/۠ۢܿ;

    invoke-direct {v1, v0}, Ll/۠ۢܿ;-><init>(Ll/֡ۢܿ;)V

    .line 1517
    throw v1
.end method
