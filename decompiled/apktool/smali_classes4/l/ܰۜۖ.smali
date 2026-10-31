.class public final Ll/ܰۜۖ;
.super Ll/۟ۜۖ;
.source "J9OT"


# instance fields
.field public ۜ:I

.field public ۡ:J

.field public ۢ:J

.field public final ܳ:Ljava/nio/ByteBuffer;

.field public ܺ:J

.field public final ܿ:J

.field public ᩷:I

.field public ᩻:I


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;Z)V
    .locals 4

    const/4 p2, 0x0

    .line 1300
    invoke-direct {p0, p2}, Ll/۟ۜۖ;-><init>(I)V

    const p2, 0x7fffffff

    .line 1294
    iput p2, p0, Ll/ܰۜۖ;->ۜ:I

    .line 1301
    iput-object p1, p0, Ll/ܰۜۖ;->ܳ:Ljava/nio/ByteBuffer;

    .line 1302
    invoke-static {p1}, Ll/᩸֨ۖ;->֫(Ljava/nio/ByteBuffer;)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ܰۜۖ;->ܿ:J

    .line 1303
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result p2

    int-to-long v2, p2

    add-long/2addr v2, v0

    iput-wide v2, p0, Ll/ܰۜۖ;->ۢ:J

    .line 1304
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result p1

    int-to-long p1, p1

    add-long/2addr v0, p1

    iput-wide v0, p0, Ll/ܰۜۖ;->ۡ:J

    .line 1305
    iput-wide v0, p0, Ll/ܰۜۖ;->ܺ:J

    return-void
.end method

.method private ۫()V
    .locals 4

    .line 1963
    iget-wide v0, p0, Ll/ܰۜۖ;->ۢ:J

    iget v2, p0, Ll/ܰۜۖ;->᩻:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ܰۜۖ;->ۢ:J

    .line 1964
    iget-wide v2, p0, Ll/ܰۜۖ;->ܺ:J

    sub-long v2, v0, v2

    long-to-int v3, v2

    .line 1965
    iget v2, p0, Ll/ܰۜۖ;->ۜ:I

    if-le v3, v2, :cond_0

    sub-int/2addr v3, v2

    .line 1967
    iput v3, p0, Ll/ܰۜۖ;->᩻:I

    int-to-long v2, v3

    sub-long/2addr v0, v2

    .line 1968
    iput-wide v0, p0, Ll/ܰۜۖ;->ۢ:J

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 1970
    iput v0, p0, Ll/ܰۜۖ;->᩻:I

    return-void
.end method


# virtual methods
.method public final ֡()I
    .locals 1

    .line 1671
    invoke-virtual {p0}, Ll/ܰۜۖ;->ۘ()I

    move-result v0

    invoke-static {v0}, Ll/۟ۜۖ;->ܿ(I)I

    move-result v0

    return v0
.end method

.method public final ֨()Ljava/lang/String;
    .locals 12

    .line 1479
    invoke-virtual {p0}, Ll/ܰۜۖ;->ۘ()I

    move-result v0

    if-lez v0, :cond_0

    .line 1975
    iget-wide v1, p0, Ll/ܰۜۖ;->ۢ:J

    iget-wide v3, p0, Ll/ܰۜۖ;->ۡ:J

    sub-long/2addr v1, v3

    long-to-int v2, v1

    if-gt v0, v2, :cond_0

    .line 1485
    new-array v1, v0, [B

    int-to-long v10, v0

    const-wide/16 v6, 0x0

    move-object v5, v1

    move-wide v8, v10

    .line 1486
    invoke-static/range {v3 .. v9}, Ll/᩸֨ۖ;->֫(J[BJJ)V

    .line 1487
    new-instance v0, Ljava/lang/String;

    sget-object v2, Ll/ܰᩴۖ;->ܽ:Ljava/nio/charset/Charset;

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 1488
    iget-wide v1, p0, Ll/ܰۜۖ;->ۡ:J

    add-long/2addr v1, v10

    iput-wide v1, p0, Ll/ܰۜۖ;->ۡ:J

    return-object v0

    :cond_0
    if-nez v0, :cond_1

    const-string v0, ""

    return-object v0

    :cond_1
    if-gez v0, :cond_2

    .line 1496
    invoke-static {}, Ll/֫᩵ۖ;->᩻()Ll/֫᩵ۖ;

    move-result-object v0

    throw v0

    .line 1498
    :cond_2
    invoke-static {}, Ll/֫᩵ۖ;->᩷()Ll/֫᩵ۖ;

    move-result-object v0

    throw v0
.end method

.method public final ֫(Ll/۫֡ۖ;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;
    .locals 2

    .line 1574
    invoke-virtual {p0}, Ll/ܰۜۖ;->ۘ()I

    move-result v0

    .line 1575
    invoke-virtual {p0}, Ll/۟ۜۖ;->֫()V

    .line 1576
    invoke-virtual {p0, v0}, Ll/ܰۜۖ;->ܽ(I)I

    move-result v0

    .line 1577
    iget v1, p0, Ll/۟ۜۖ;->֫:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/۟ۜۖ;->֫:I

    .line 1578
    invoke-interface {p1, p0, p2}, Ll/۫֡ۖ;->parsePartialFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۡ֡ۖ;

    const/4 p2, 0x0

    .line 1579
    invoke-virtual {p0, p2}, Ll/ܰۜۖ;->֫(I)V

    .line 1580
    iget p2, p0, Ll/۟ۜۖ;->֫:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p0, Ll/۟ۜۖ;->֫:I

    .line 1581
    invoke-virtual {p0}, Ll/ܰۜۖ;->ۧ()I

    move-result p2

    if-nez p2, :cond_0

    .line 1584
    invoke-virtual {p0, v0}, Ll/ܰۜۖ;->ۧ(I)V

    return-object p1

    .line 1582
    :cond_0
    invoke-static {}, Ll/֫᩵ۖ;->᩷()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1
.end method

.method public final ֫(I)V
    .locals 1

    .line 1327
    iget v0, p0, Ll/ܰۜۖ;->᩷:I

    if-ne v0, p1, :cond_0

    return-void

    .line 1328
    :cond_0
    invoke-static {}, Ll/֫᩵ۖ;->ۧ()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1
.end method

.method public final ֫(ILl/ۢ֡ۖ;Ll/ᩳۘۖ;)V
    .locals 1

    .line 1526
    invoke-virtual {p0}, Ll/۟ۜۖ;->֫()V

    .line 1527
    iget v0, p0, Ll/۟ۜۖ;->֫:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/۟ۜۖ;->֫:I

    .line 1528
    invoke-interface {p2, p0, p3}, Ll/ۢ֡ۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x4

    .line 1529
    invoke-virtual {p0, p1}, Ll/ܰۜۖ;->֫(I)V

    .line 1530
    iget p1, p0, Ll/۟ۜۖ;->֫:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/۟ۜۖ;->֫:I

    return-void
.end method

.method public final ֫(Ll/ۢ֡ۖ;Ll/ᩳۘۖ;)V
    .locals 2

    .line 1558
    invoke-virtual {p0}, Ll/ܰۜۖ;->ۘ()I

    move-result v0

    .line 1559
    invoke-virtual {p0}, Ll/۟ۜۖ;->֫()V

    .line 1560
    invoke-virtual {p0, v0}, Ll/ܰۜۖ;->ܽ(I)I

    move-result v0

    .line 1561
    iget v1, p0, Ll/۟ۜۖ;->֫:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/۟ۜۖ;->֫:I

    .line 1562
    invoke-interface {p1, p0, p2}, Ll/ۢ֡ۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;

    const/4 p1, 0x0

    .line 1563
    invoke-virtual {p0, p1}, Ll/ܰۜۖ;->֫(I)V

    .line 1564
    iget p1, p0, Ll/۟ۜۖ;->֫:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/۟ۜۖ;->֫:I

    .line 1565
    invoke-virtual {p0}, Ll/ܰۜۖ;->ۧ()I

    move-result p1

    if-nez p1, :cond_0

    .line 1568
    invoke-virtual {p0, v0}, Ll/ܰۜۖ;->ۧ(I)V

    return-void

    .line 1566
    :cond_0
    invoke-static {}, Ll/֫᩵ۖ;->᩷()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1
.end method

.method public final ۖ()J
    .locals 2

    .line 1454
    invoke-virtual {p0}, Ll/ܰۜۖ;->ۗ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۗ()J
    .locals 15

    .line 1764
    iget-wide v0, p0, Ll/ܰۜۖ;->ۡ:J

    .line 1766
    iget-wide v2, p0, Ll/ܰۜۖ;->ۢ:J

    cmp-long v4, v2, v0

    if-nez v4, :cond_0

    goto/16 :goto_3

    :cond_0
    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    .line 1772
    invoke-static {v0, v1}, Ll/᩸֨ۖ;->֫(J)B

    move-result v4

    if-ltz v4, :cond_1

    .line 1773
    iput-wide v2, p0, Ll/ܰۜۖ;->ۡ:J

    int-to-long v0, v4

    return-wide v0

    .line 1775
    :cond_1
    iget-wide v5, p0, Ll/ܰۜۖ;->ۢ:J

    sub-long/2addr v5, v2

    const-wide/16 v7, 0x9

    cmp-long v9, v5, v7

    if-gez v9, :cond_2

    goto/16 :goto_3

    :cond_2
    const-wide/16 v5, 0x2

    add-long/2addr v5, v0

    .line 1777
    invoke-static {v2, v3}, Ll/᩸֨ۖ;->֫(J)B

    move-result v2

    shl-int/lit8 v2, v2, 0x7

    xor-int/2addr v2, v4

    if-gez v2, :cond_3

    xor-int/lit8 v0, v2, -0x80

    goto :goto_0

    :cond_3
    const-wide/16 v3, 0x3

    add-long/2addr v3, v0

    .line 1779
    invoke-static {v5, v6}, Ll/᩸֨ۖ;->֫(J)B

    move-result v5

    shl-int/lit8 v5, v5, 0xe

    xor-int/2addr v2, v5

    if-ltz v2, :cond_4

    xor-int/lit16 v0, v2, 0x3f80

    int-to-long v0, v0

    goto/16 :goto_4

    :cond_4
    const-wide/16 v5, 0x4

    add-long/2addr v5, v0

    .line 1781
    invoke-static {v3, v4}, Ll/᩸֨ۖ;->֫(J)B

    move-result v3

    shl-int/lit8 v3, v3, 0x15

    xor-int/2addr v2, v3

    if-gez v2, :cond_5

    const v0, -0x1fc080

    xor-int/2addr v0, v2

    :goto_0
    int-to-long v0, v0

    move-wide v3, v5

    goto/16 :goto_4

    :cond_5
    int-to-long v2, v2

    const-wide/16 v9, 0x5

    add-long/2addr v9, v0

    .line 1783
    invoke-static {v5, v6}, Ll/᩸֨ۖ;->֫(J)B

    move-result v4

    int-to-long v4, v4

    const/16 v6, 0x1c

    shl-long/2addr v4, v6

    xor-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-ltz v6, :cond_6

    const-wide/32 v0, 0xfe03f80

    goto :goto_1

    :cond_6
    const-wide/16 v11, 0x6

    add-long/2addr v11, v0

    .line 1785
    invoke-static {v9, v10}, Ll/᩸֨ۖ;->֫(J)B

    move-result v6

    int-to-long v9, v6

    const/16 v6, 0x23

    shl-long/2addr v9, v6

    xor-long/2addr v2, v9

    cmp-long v6, v2, v4

    if-gez v6, :cond_7

    const-wide v0, -0x7f01fc080L

    goto :goto_2

    :cond_7
    const-wide/16 v9, 0x7

    add-long/2addr v9, v0

    .line 1787
    invoke-static {v11, v12}, Ll/᩸֨ۖ;->֫(J)B

    move-result v6

    int-to-long v11, v6

    const/16 v6, 0x2a

    shl-long/2addr v11, v6

    xor-long/2addr v2, v11

    cmp-long v6, v2, v4

    if-ltz v6, :cond_8

    const-wide v0, 0x3f80fe03f80L

    :goto_1
    xor-long/2addr v0, v2

    move-wide v3, v9

    goto :goto_4

    :cond_8
    const-wide/16 v11, 0x8

    add-long/2addr v11, v0

    .line 1789
    invoke-static {v9, v10}, Ll/᩸֨ۖ;->֫(J)B

    move-result v6

    int-to-long v9, v6

    const/16 v6, 0x31

    shl-long/2addr v9, v6

    xor-long/2addr v2, v9

    cmp-long v6, v2, v4

    if-gez v6, :cond_9

    const-wide v0, -0x1fc07f01fc080L

    :goto_2
    xor-long/2addr v0, v2

    move-wide v3, v11

    goto :goto_4

    :cond_9
    add-long v6, v0, v7

    .line 1799
    invoke-static {v11, v12}, Ll/᩸֨ۖ;->֫(J)B

    move-result v8

    int-to-long v8, v8

    const/16 v10, 0x38

    shl-long/2addr v8, v10

    xor-long/2addr v2, v8

    const-wide v8, 0xfe03f80fe03f80L

    xor-long/2addr v2, v8

    cmp-long v8, v2, v4

    if-gez v8, :cond_b

    const-wide/16 v8, 0xa

    add-long/2addr v0, v8

    .line 1810
    invoke-static {v6, v7}, Ll/᩸֨ۖ;->֫(J)B

    move-result v6

    int-to-long v6, v6

    cmp-long v8, v6, v4

    if-gez v8, :cond_a

    .line 1818
    :goto_3
    invoke-virtual {p0}, Ll/ܰۜۖ;->۬()J

    move-result-wide v0

    return-wide v0

    :cond_a
    move-wide v13, v0

    move-wide v0, v2

    move-wide v3, v13

    goto :goto_4

    :cond_b
    move-wide v0, v2

    move-wide v3, v6

    .line 1815
    :goto_4
    iput-wide v3, p0, Ll/ܰۜۖ;->ۡ:J

    return-wide v0
.end method

.method public final ۘ()I
    .locals 10

    .line 1686
    iget-wide v0, p0, Ll/ܰۜۖ;->ۡ:J

    .line 1688
    iget-wide v2, p0, Ll/ܰۜۖ;->ۢ:J

    cmp-long v4, v2, v0

    if-nez v4, :cond_0

    goto/16 :goto_1

    :cond_0
    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    .line 1693
    invoke-static {v0, v1}, Ll/᩸֨ۖ;->֫(J)B

    move-result v4

    if-ltz v4, :cond_1

    .line 1694
    iput-wide v2, p0, Ll/ܰۜۖ;->ۡ:J

    return v4

    .line 1696
    :cond_1
    iget-wide v5, p0, Ll/ܰۜۖ;->ۢ:J

    sub-long/2addr v5, v2

    const-wide/16 v7, 0x9

    cmp-long v9, v5, v7

    if-gez v9, :cond_2

    goto/16 :goto_1

    :cond_2
    const-wide/16 v5, 0x2

    add-long/2addr v5, v0

    .line 1698
    invoke-static {v2, v3}, Ll/᩸֨ۖ;->֫(J)B

    move-result v2

    shl-int/lit8 v2, v2, 0x7

    xor-int/2addr v2, v4

    if-gez v2, :cond_3

    xor-int/lit8 v0, v2, -0x80

    goto/16 :goto_2

    :cond_3
    const-wide/16 v3, 0x3

    add-long/2addr v3, v0

    .line 1700
    invoke-static {v5, v6}, Ll/᩸֨ۖ;->֫(J)B

    move-result v5

    shl-int/lit8 v5, v5, 0xe

    xor-int/2addr v2, v5

    if-ltz v2, :cond_4

    xor-int/lit16 v0, v2, 0x3f80

    :goto_0
    move-wide v5, v3

    goto :goto_2

    :cond_4
    const-wide/16 v5, 0x4

    add-long/2addr v5, v0

    .line 1702
    invoke-static {v3, v4}, Ll/᩸֨ۖ;->֫(J)B

    move-result v3

    shl-int/lit8 v3, v3, 0x15

    xor-int/2addr v2, v3

    if-gez v2, :cond_5

    const v0, -0x1fc080

    xor-int/2addr v0, v2

    goto :goto_2

    :cond_5
    const-wide/16 v3, 0x5

    add-long/2addr v3, v0

    .line 1705
    invoke-static {v5, v6}, Ll/᩸֨ۖ;->֫(J)B

    move-result v5

    shl-int/lit8 v6, v5, 0x1c

    xor-int/2addr v2, v6

    const v6, 0xfe03f80

    xor-int/2addr v2, v6

    if-gez v5, :cond_8

    const-wide/16 v5, 0x6

    add-long/2addr v5, v0

    .line 1709
    invoke-static {v3, v4}, Ll/᩸֨ۖ;->֫(J)B

    move-result v3

    if-gez v3, :cond_7

    const-wide/16 v3, 0x7

    add-long/2addr v3, v0

    .line 1710
    invoke-static {v5, v6}, Ll/᩸֨ۖ;->֫(J)B

    move-result v5

    if-gez v5, :cond_8

    const-wide/16 v5, 0x8

    add-long/2addr v5, v0

    .line 1711
    invoke-static {v3, v4}, Ll/᩸֨ۖ;->֫(J)B

    move-result v3

    if-gez v3, :cond_7

    add-long v3, v0, v7

    .line 1712
    invoke-static {v5, v6}, Ll/᩸֨ۖ;->֫(J)B

    move-result v5

    if-gez v5, :cond_8

    const-wide/16 v5, 0xa

    add-long/2addr v0, v5

    .line 1713
    invoke-static {v3, v4}, Ll/᩸֨ۖ;->֫(J)B

    move-result v3

    if-gez v3, :cond_6

    .line 1720
    :goto_1
    invoke-virtual {p0}, Ll/ܰۜۖ;->۬()J

    move-result-wide v0

    long-to-int v1, v0

    return v1

    :cond_6
    move-wide v5, v0

    :cond_7
    move v0, v2

    goto :goto_2

    :cond_8
    move v0, v2

    goto :goto_0

    .line 1717
    :goto_2
    iput-wide v5, p0, Ll/ܰۜۖ;->ۡ:J

    return v0
.end method

.method public final ۙ()J
    .locals 9

    .line 1851
    iget-wide v0, p0, Ll/ܰۜۖ;->ۡ:J

    .line 1853
    iget-wide v2, p0, Ll/ܰۜۖ;->ۢ:J

    sub-long/2addr v2, v0

    const-wide/16 v4, 0x8

    cmp-long v6, v2, v4

    if-ltz v6, :cond_0

    add-long/2addr v4, v0

    .line 1857
    iput-wide v4, p0, Ll/ܰۜۖ;->ۡ:J

    .line 1858
    invoke-static {v0, v1}, Ll/᩸֨ۖ;->֫(J)B

    move-result v2

    int-to-long v2, v2

    const-wide/16 v4, 0xff

    and-long/2addr v2, v4

    const-wide/16 v6, 0x1

    add-long/2addr v6, v0

    .line 1859
    invoke-static {v6, v7}, Ll/᩸֨ۖ;->֫(J)B

    move-result v6

    int-to-long v6, v6

    and-long/2addr v6, v4

    const/16 v8, 0x8

    shl-long/2addr v6, v8

    or-long/2addr v2, v6

    const-wide/16 v6, 0x2

    add-long/2addr v6, v0

    .line 1860
    invoke-static {v6, v7}, Ll/᩸֨ۖ;->֫(J)B

    move-result v6

    int-to-long v6, v6

    and-long/2addr v6, v4

    const/16 v8, 0x10

    shl-long/2addr v6, v8

    or-long/2addr v2, v6

    const-wide/16 v6, 0x3

    add-long/2addr v6, v0

    .line 1861
    invoke-static {v6, v7}, Ll/᩸֨ۖ;->֫(J)B

    move-result v6

    int-to-long v6, v6

    and-long/2addr v6, v4

    const/16 v8, 0x18

    shl-long/2addr v6, v8

    or-long/2addr v2, v6

    const-wide/16 v6, 0x4

    add-long/2addr v6, v0

    .line 1862
    invoke-static {v6, v7}, Ll/᩸֨ۖ;->֫(J)B

    move-result v6

    int-to-long v6, v6

    and-long/2addr v6, v4

    const/16 v8, 0x20

    shl-long/2addr v6, v8

    or-long/2addr v2, v6

    const-wide/16 v6, 0x5

    add-long/2addr v6, v0

    .line 1863
    invoke-static {v6, v7}, Ll/᩸֨ۖ;->֫(J)B

    move-result v6

    int-to-long v6, v6

    and-long/2addr v6, v4

    const/16 v8, 0x28

    shl-long/2addr v6, v8

    or-long/2addr v2, v6

    const-wide/16 v6, 0x6

    add-long/2addr v6, v0

    .line 1864
    invoke-static {v6, v7}, Ll/᩸֨ۖ;->֫(J)B

    move-result v6

    int-to-long v6, v6

    and-long/2addr v6, v4

    const/16 v8, 0x30

    shl-long/2addr v6, v8

    or-long/2addr v2, v6

    const-wide/16 v6, 0x7

    add-long/2addr v0, v6

    .line 1865
    invoke-static {v0, v1}, Ll/᩸֨ۖ;->֫(J)B

    move-result v0

    int-to-long v0, v0

    and-long/2addr v0, v4

    const/16 v4, 0x38

    shl-long/2addr v0, v4

    or-long/2addr v0, v2

    return-wide v0

    .line 1854
    :cond_0
    invoke-static {}, Ll/֫᩵ۖ;->᩷()Ll/֫᩵ۖ;

    move-result-object v0

    throw v0
.end method

.method public final ۚ()J
    .locals 2

    .line 1676
    invoke-virtual {p0}, Ll/ܰۜۖ;->ۗ()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll/۟ۜۖ;->֫(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۜ()I
    .locals 1

    .line 1656
    invoke-virtual {p0}, Ll/ܰۜۖ;->ۘ()I

    move-result v0

    return v0
.end method

.method public final ۠()Ljava/lang/String;
    .locals 6

    .line 1503
    invoke-virtual {p0}, Ll/ܰۜۖ;->ۘ()I

    move-result v0

    if-lez v0, :cond_0

    .line 1975
    iget-wide v1, p0, Ll/ܰۜۖ;->ۢ:J

    iget-wide v3, p0, Ll/ܰۜۖ;->ۡ:J

    sub-long/2addr v1, v3

    long-to-int v2, v1

    if-gt v0, v2, :cond_0

    .line 1979
    iget-wide v1, p0, Ll/ܰۜۖ;->ܿ:J

    sub-long/2addr v3, v1

    long-to-int v1, v3

    .line 1506
    iget-object v2, p0, Ll/ܰۜۖ;->ܳ:Ljava/nio/ByteBuffer;

    invoke-static {v2, v1, v0}, Ll/۫֨ۖ;->֫(Ljava/nio/ByteBuffer;II)Ljava/lang/String;

    move-result-object v1

    .line 1507
    iget-wide v2, p0, Ll/ܰۜۖ;->ۡ:J

    int-to-long v4, v0

    add-long/2addr v2, v4

    iput-wide v2, p0, Ll/ܰۜۖ;->ۡ:J

    return-object v1

    :cond_0
    if-nez v0, :cond_1

    const-string v0, ""

    return-object v0

    :cond_1
    if-gtz v0, :cond_2

    .line 1515
    invoke-static {}, Ll/֫᩵ۖ;->᩻()Ll/֫᩵ۖ;

    move-result-object v0

    throw v0

    .line 1517
    :cond_2
    invoke-static {}, Ll/֫᩵ۖ;->᩷()Ll/֫᩵ۖ;

    move-result-object v0

    throw v0
.end method

.method public final ۡ()F
    .locals 1

    .line 1444
    invoke-virtual {p0}, Ll/ܰۜۖ;->᩶()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    return v0
.end method

.method public final ۢ()J
    .locals 2

    .line 1464
    invoke-virtual {p0}, Ll/ܰۜۖ;->ۙ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۧ()I
    .locals 2

    .line 1903
    iget v0, p0, Ll/ܰۜۖ;->ۜ:I

    const v1, 0x7fffffff

    if-ne v0, v1, :cond_0

    const/4 v0, -0x1

    return v0

    .line 1907
    :cond_0
    invoke-virtual {p0}, Ll/ܰۜۖ;->ܽ()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public final ۧ(I)V
    .locals 0

    .line 1897
    iput p1, p0, Ll/ܰۜۖ;->ۜ:I

    .line 1898
    invoke-direct {p0}, Ll/ܰۜۖ;->۫()V

    return-void
.end method

.method public final ۬()J
    .locals 8

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x40

    if-ge v2, v3, :cond_2

    .line 1922
    iget-wide v3, p0, Ll/ܰۜۖ;->ۡ:J

    iget-wide v5, p0, Ll/ܰۜۖ;->ۢ:J

    cmp-long v7, v3, v5

    if-eqz v7, :cond_1

    const-wide/16 v5, 0x1

    add-long/2addr v5, v3

    .line 1925
    iput-wide v5, p0, Ll/ܰۜۖ;->ۡ:J

    invoke-static {v3, v4}, Ll/᩸֨ۖ;->֫(J)B

    move-result v3

    and-int/lit8 v4, v3, 0x7f

    int-to-long v4, v4

    shl-long/2addr v4, v2

    or-long/2addr v0, v4

    and-int/lit16 v3, v3, 0x80

    if-nez v3, :cond_0

    return-wide v0

    :cond_0
    add-int/lit8 v2, v2, 0x7

    goto :goto_0

    .line 1923
    :cond_1
    invoke-static {}, Ll/֫᩵ۖ;->᩷()Ll/֫᩵ۖ;

    move-result-object v0

    throw v0

    .line 1831
    :cond_2
    invoke-static {}, Ll/֫᩵ۖ;->ܳ()Ll/֫᩵ۖ;

    move-result-object v0

    throw v0
.end method

.method public final ܳ()Ll/ۛۜۖ;
    .locals 12

    .line 1590
    invoke-virtual {p0}, Ll/ܰۜۖ;->ۘ()I

    move-result v0

    if-lez v0, :cond_0

    .line 1975
    iget-wide v1, p0, Ll/ܰۜۖ;->ۢ:J

    iget-wide v3, p0, Ll/ܰۜۖ;->ۡ:J

    sub-long/2addr v1, v3

    long-to-int v2, v1

    if-gt v0, v2, :cond_0

    .line 1598
    new-array v1, v0, [B

    int-to-long v10, v0

    const-wide/16 v6, 0x0

    move-object v5, v1

    move-wide v8, v10

    .line 1599
    invoke-static/range {v3 .. v9}, Ll/᩸֨ۖ;->֫(J[BJJ)V

    .line 1600
    iget-wide v2, p0, Ll/ܰۜۖ;->ۡ:J

    add-long/2addr v2, v10

    iput-wide v2, p0, Ll/ܰۜۖ;->ۡ:J

    .line 1601
    sget-object v0, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    .line 439
    new-instance v0, Ll/۫ۜۖ;

    invoke-direct {v0, v1}, Ll/۫ۜۖ;-><init>([B)V

    return-object v0

    :cond_0
    if-nez v0, :cond_1

    .line 1606
    sget-object v0, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    return-object v0

    :cond_1
    if-gez v0, :cond_2

    .line 1609
    invoke-static {}, Ll/֫᩵ۖ;->᩻()Ll/֫᩵ۖ;

    move-result-object v0

    throw v0

    .line 1611
    :cond_2
    invoke-static {}, Ll/֫᩵ۖ;->᩷()Ll/֫᩵ۖ;

    move-result-object v0

    throw v0
.end method

.method public final ܳ(I)V
    .locals 4

    if-ltz p1, :cond_0

    .line 1975
    iget-wide v0, p0, Ll/ܰۜۖ;->ۢ:J

    iget-wide v2, p0, Ll/ܰۜۖ;->ۡ:J

    sub-long/2addr v0, v2

    long-to-int v1, v0

    if-gt p1, v1, :cond_0

    int-to-long v0, p1

    add-long/2addr v2, v0

    .line 1952
    iput-wide v2, p0, Ll/ܰۜۖ;->ۡ:J

    return-void

    :cond_0
    if-gez p1, :cond_1

    .line 1957
    invoke-static {}, Ll/֫᩵ۖ;->᩻()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1

    .line 1959
    :cond_1
    invoke-static {}, Ll/֫᩵ۖ;->᩷()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1
.end method

.method public final ܶ()I
    .locals 2

    .line 1311
    invoke-virtual {p0}, Ll/ܰۜۖ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 1312
    iput v0, p0, Ll/ܰۜۖ;->᩷:I

    return v0

    .line 1316
    :cond_0
    invoke-virtual {p0}, Ll/ܰۜۖ;->ۘ()I

    move-result v0

    iput v0, p0, Ll/ܰۜۖ;->᩷:I

    ushr-int/lit8 v1, v0, 0x3

    if-eqz v1, :cond_1

    return v0

    .line 1320
    :cond_1
    invoke-static {}, Ll/֫᩵ۖ;->ܽ()Ll/֫᩵ۖ;

    move-result-object v0

    throw v0
.end method

.method public final ܺ()I
    .locals 1

    .line 1459
    invoke-virtual {p0}, Ll/ܰۜۖ;->ۘ()I

    move-result v0

    return v0
.end method

.method public final ܽ()I
    .locals 4

    .line 1917
    iget-wide v0, p0, Ll/ܰۜۖ;->ۡ:J

    iget-wide v2, p0, Ll/ܰۜۖ;->ܺ:J

    sub-long/2addr v0, v2

    long-to-int v1, v0

    return v1
.end method

.method public final ܽ(I)I
    .locals 1

    if-ltz p1, :cond_1

    .line 1883
    invoke-virtual {p0}, Ll/ܰۜۖ;->ܽ()I

    move-result v0

    add-int/2addr p1, v0

    .line 1884
    iget v0, p0, Ll/ܰۜۖ;->ۜ:I

    if-gt p1, v0, :cond_0

    .line 1888
    iput p1, p0, Ll/ܰۜۖ;->ۜ:I

    .line 1890
    invoke-direct {p0}, Ll/ܰۜۖ;->۫()V

    return v0

    .line 1886
    :cond_0
    invoke-static {}, Ll/֫᩵ۖ;->᩷()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1

    .line 1881
    :cond_1
    invoke-static {}, Ll/֫᩵ۖ;->᩻()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1
.end method

.method public final ܿ()Z
    .locals 5

    .line 1474
    invoke-virtual {p0}, Ll/ܰۜۖ;->ۗ()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()Z
    .locals 5

    .line 1912
    iget-wide v0, p0, Ll/ܰۜۖ;->ۡ:J

    iget-wide v2, p0, Ll/ܰۜۖ;->ۢ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ(I)Z
    .locals 9

    and-int/lit8 v0, p1, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_6

    if-eq v0, v2, :cond_5

    const/4 v3, 0x2

    if-eq v0, v3, :cond_4

    const/4 v3, 0x4

    const/4 v4, 0x3

    if-eq v0, v4, :cond_2

    if-eq v0, v3, :cond_1

    const/4 p1, 0x5

    if-ne v0, p1, :cond_0

    .line 1357
    invoke-virtual {p0, v3}, Ll/ܰۜۖ;->ܳ(I)V

    return v2

    .line 1360
    :cond_0
    invoke-static {}, Ll/֫᩵ۖ;->ܿ()Ll/۟ᩴۖ;

    move-result-object p1

    throw p1

    :cond_1
    return v1

    .line 1418
    :cond_2
    invoke-virtual {p0}, Ll/ܰۜۖ;->ܶ()I

    move-result v0

    if-eqz v0, :cond_3

    .line 1419
    invoke-virtual {p0, v0}, Ll/ܰۜۖ;->ᩳ(I)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_3
    ushr-int/2addr p1, v4

    shl-int/2addr p1, v4

    or-int/2addr p1, v3

    .line 1351
    invoke-virtual {p0, p1}, Ll/ܰۜۖ;->֫(I)V

    return v2

    .line 1347
    :cond_4
    invoke-virtual {p0}, Ll/ܰۜۖ;->ۘ()I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ܰۜۖ;->ܳ(I)V

    return v2

    :cond_5
    const/16 p1, 0x8

    .line 1344
    invoke-virtual {p0, p1}, Ll/ܰۜۖ;->ܳ(I)V

    return v2

    .line 1975
    :cond_6
    iget-wide v3, p0, Ll/ܰۜۖ;->ۢ:J

    iget-wide v5, p0, Ll/ܰۜۖ;->ۡ:J

    sub-long/2addr v3, v5

    long-to-int p1, v3

    const-wide/16 v3, 0x1

    const/16 v0, 0xa

    if-lt p1, v0, :cond_9

    :goto_0
    if-ge v1, v0, :cond_8

    .line 1733
    iget-wide v5, p0, Ll/ܰۜۖ;->ۡ:J

    add-long v7, v5, v3

    iput-wide v7, p0, Ll/ܰۜۖ;->ۡ:J

    invoke-static {v5, v6}, Ll/᩸֨ۖ;->֫(J)B

    move-result p1

    if-ltz p1, :cond_7

    goto :goto_2

    :cond_7
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1737
    :cond_8
    invoke-static {}, Ll/֫᩵ۖ;->ܳ()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1

    :cond_9
    :goto_1
    if-ge v1, v0, :cond_c

    .line 1922
    iget-wide v5, p0, Ll/ܰۜۖ;->ۡ:J

    iget-wide v7, p0, Ll/ܰۜۖ;->ۢ:J

    cmp-long p1, v5, v7

    if-eqz p1, :cond_b

    add-long v7, v5, v3

    .line 1925
    iput-wide v7, p0, Ll/ܰۜۖ;->ۡ:J

    invoke-static {v5, v6}, Ll/᩸֨ۖ;->֫(J)B

    move-result p1

    if-ltz p1, :cond_a

    :goto_2
    return v2

    :cond_a
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 1923
    :cond_b
    invoke-static {}, Ll/֫᩵ۖ;->᩷()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1

    .line 1746
    :cond_c
    invoke-static {}, Ll/֫᩵ۖ;->ܳ()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1
.end method

.method public final ᩴ()I
    .locals 1

    .line 1661
    invoke-virtual {p0}, Ll/ܰۜۖ;->᩶()I

    move-result v0

    return v0
.end method

.method public final ᩵()J
    .locals 2

    .line 1666
    invoke-virtual {p0}, Ll/ܰۜۖ;->ۙ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ᩶()I
    .locals 7

    .line 1836
    iget-wide v0, p0, Ll/ܰۜۖ;->ۡ:J

    .line 1838
    iget-wide v2, p0, Ll/ܰۜۖ;->ۢ:J

    sub-long/2addr v2, v0

    const-wide/16 v4, 0x4

    cmp-long v6, v2, v4

    if-ltz v6, :cond_0

    add-long/2addr v4, v0

    .line 1842
    iput-wide v4, p0, Ll/ܰۜۖ;->ۡ:J

    .line 1843
    invoke-static {v0, v1}, Ll/᩸֨ۖ;->֫(J)B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    const-wide/16 v3, 0x1

    add-long/2addr v3, v0

    .line 1844
    invoke-static {v3, v4}, Ll/᩸֨ۖ;->֫(J)B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x8

    or-int/2addr v2, v3

    const-wide/16 v3, 0x2

    add-long/2addr v3, v0

    .line 1845
    invoke-static {v3, v4}, Ll/᩸֨ۖ;->֫(J)B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x10

    or-int/2addr v2, v3

    const-wide/16 v3, 0x3

    add-long/2addr v0, v3

    .line 1846
    invoke-static {v0, v1}, Ll/᩸֨ۖ;->֫(J)B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    or-int/2addr v0, v2

    return v0

    .line 1839
    :cond_0
    invoke-static {}, Ll/֫᩵ۖ;->᩷()Ll/֫᩵ۖ;

    move-result-object v0

    throw v0
.end method

.method public final ᩷()I
    .locals 1

    .line 1469
    invoke-virtual {p0}, Ll/ܰۜۖ;->᩶()I

    move-result v0

    return v0
.end method

.method public final ᩸()I
    .locals 1

    .line 1651
    invoke-virtual {p0}, Ll/ܰۜۖ;->ۘ()I

    move-result v0

    return v0
.end method

.method public final ᩹()J
    .locals 2

    .line 1449
    invoke-virtual {p0}, Ll/ܰۜۖ;->ۗ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ᩻()D
    .locals 2

    .line 1439
    invoke-virtual {p0}, Ll/ܰۜۖ;->ۙ()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    return-wide v0
.end method
