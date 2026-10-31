.class public Ll/ᩳۗ᩻;
.super Ll/ܿۗ᩻;
.source "S98Z"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x88

    invoke-static {v0}, Ll/۫ܺ᩷;->ۜۤܳ(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public native constructor <init>(I[I)V
.end method

.method public native constructor <init>([II)V
.end method

.method public static ֫(III[I)I
    .locals 8

    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    move-result v0

    if-ltz v0, :cond_0

    goto :goto_2

    .line 410
    :cond_0
    sget v0, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v0, :cond_1

    goto :goto_3

    .line 1540
    :cond_1
    sget-boolean v0, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v0, :cond_2

    goto :goto_3

    .line 1737
    :cond_2
    sget v0, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v0, :cond_3

    goto :goto_1

    .line 1158
    :cond_3
    sget v0, Ll/֡۬;->۠֡᩶:I

    if-gtz v0, :cond_4

    goto :goto_0

    .line 1771
    :cond_4
    array-length v0, p3

    const/4 v1, 0x1

    .line 1240
    sget v2, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v2, :cond_5

    goto :goto_2

    :cond_5
    sub-int/2addr v0, v1

    sub-int/2addr v0, p1

    sub-int/2addr v0, p0

    .line 1570
    sget-boolean p0, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez p0, :cond_6

    goto :goto_1

    .line 1772
    :cond_6
    aget p0, p3, v0

    int-to-long v2, p0

    .line 1217
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result p0

    if-gtz p0, :cond_7

    goto :goto_0

    :cond_7
    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    int-to-long v6, p2

    and-long/2addr v4, v6

    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result p0

    if-gtz p0, :cond_8

    goto :goto_1

    :cond_8
    add-long/2addr v2, v4

    long-to-int p0, v2

    .line 1773
    sget-boolean p2, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez p2, :cond_c

    .line 1539
    :goto_0
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result p0

    if-nez p0, :cond_9

    goto :goto_2

    .line 1520
    :cond_9
    :goto_1
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    sget p0, Ll/֨᩺;->ۨ֨۬:I

    if-gtz p0, :cond_a

    goto :goto_3

    :cond_a
    :goto_2
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    sget p0, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz p0, :cond_b

    goto :goto_4

    .line 1445
    :cond_b
    :goto_3
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    .line 1666
    :goto_4
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    const/4 p0, 0x0

    return p0

    .line 1774
    :cond_c
    aput p0, p3, v0

    const/16 p0, 0x20

    ushr-long/2addr v2, p0

    const-wide/16 v4, 0x0

    cmp-long p0, v2, v4

    if-nez p0, :cond_d

    goto :goto_5

    :cond_d
    add-int/lit8 p1, p1, -0x1

    if-ltz p1, :cond_f

    add-int/lit8 v0, v0, -0x1

    if-gez v0, :cond_e

    goto :goto_6

    .line 1781
    :cond_e
    aget p0, p3, v0

    add-int/2addr p0, v1

    aput p0, p3, v0

    if-eqz p0, :cond_d

    :goto_5
    const/4 p0, 0x0

    return p0

    :cond_f
    :goto_6
    return v1
.end method

.method public static ֫(II[I[II)I
    .locals 10

    sget v0, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v0, :cond_0

    goto/16 :goto_4

    .line 1377
    :cond_0
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_4

    :cond_1
    sget v0, Ll/ۛ;->᩺᩻֫:I

    if-ltz v0, :cond_2

    goto :goto_1

    .line 1512
    :cond_2
    sget-boolean v0, Ll/֨۫;->۬᩷᩶:Z

    if-nez v0, :cond_3

    goto/16 :goto_4

    :cond_3
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_1

    .line 331
    :cond_4
    sget v0, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v0, :cond_5

    goto :goto_2

    .line 1735
    :cond_5
    array-length v0, p3

    if-gt p1, v0, :cond_11

    if-ltz p0, :cond_10

    .line 1741
    array-length v0, p2

    add-int/lit8 v0, v0, -0x1

    if-gt p0, v0, :cond_f

    .line 1744
    array-length v0, p2

    sub-int/2addr v0, p0

    if-gt p1, v0, :cond_e

    int-to-long v0, p4

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    .line 1756
    array-length p4, p2

    sub-int/2addr p4, p0

    sget p0, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz p0, :cond_6

    goto :goto_3

    :cond_6
    add-int/lit8 p4, p4, -0x1

    add-int/lit8 p1, p1, -0x1

    const-wide/16 v4, 0x0

    :goto_0
    if-ltz p1, :cond_d

    .line 1758
    aget p0, p3, p1

    int-to-long v6, p0

    and-long/2addr v6, v2

    mul-long v6, v6, v0

    aget p0, p2, p4

    .line 412
    sget v8, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v8, :cond_7

    goto :goto_3

    :cond_7
    int-to-long v8, p0

    and-long/2addr v8, v2

    add-long/2addr v6, v8

    add-long/2addr v6, v4

    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    move-result p0

    if-eqz p0, :cond_a

    .line 769
    :goto_1
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    sget p0, Ll/ۗ᩺;->ۡ᩺֡:I

    if-gez p0, :cond_8

    goto :goto_3

    .line 1707
    :cond_8
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result p0

    if-eqz p0, :cond_9

    goto :goto_4

    .line 431
    :cond_9
    :goto_2
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    sget p0, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz p0, :cond_b

    goto :goto_4

    :cond_a
    add-int/lit8 p0, p4, -0x1

    long-to-int v4, v6

    .line 1760
    aput v4, p2, p4

    .line 1036
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result p4

    if-gtz p4, :cond_c

    .line 100
    :cond_b
    :goto_3
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    :goto_4
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    const/4 p0, 0x0

    return p0

    :cond_c
    const/16 p4, 0x20

    ushr-long v4, v6, p4

    add-int/lit8 p1, p1, -0x1

    move p4, p0

    goto :goto_0

    :cond_d
    long-to-int p0, v4

    return p0

    .line 1745
    :cond_e
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    .line 1742
    :cond_f
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    .line 1739
    :cond_10
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    .line 1736
    :cond_11
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static ֫(I[I)I
    .locals 2

    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget v0, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v0, :cond_1

    goto :goto_4

    .line 989
    :cond_1
    sget v0, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v0, :cond_2

    goto :goto_2

    .line 248
    :cond_2
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_3

    :cond_3
    sget v0, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v0, :cond_4

    goto :goto_1

    :cond_4
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_3

    :cond_5
    const/4 v0, 0x0

    if-nez p0, :cond_6

    return v0

    :cond_6
    add-int/lit8 p0, p0, -0x1

    .line 844
    sget v1, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v1, :cond_7

    goto :goto_3

    :cond_7
    sget v1, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v1, :cond_8

    goto :goto_2

    :cond_8
    shl-int/lit8 p0, p0, 0x5

    .line 1197
    aget p1, p1, v0

    .line 942
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    move-result v0

    if-gtz v0, :cond_9

    goto :goto_0

    .line 1134
    :cond_9
    invoke-static {p1}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result p1

    .line 1029
    sget v0, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v0, :cond_d

    .line 610
    :goto_0
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    sget p0, Ll/֡᩶;->ܳܶ۠:I

    if-lez p0, :cond_a

    goto :goto_2

    :cond_a
    :goto_1
    sget p0, Ll/ۗۚ;->ܶۛᩴ:I

    if-gez p0, :cond_b

    goto :goto_3

    .line 952
    :cond_b
    :goto_2
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result p0

    if-nez p0, :cond_c

    goto :goto_4

    .line 875
    :cond_c
    :goto_3
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    .line 1041
    :goto_4
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    const/4 p0, 0x0

    return p0

    :cond_d
    rsub-int/lit8 p1, p1, 0x20

    add-int/2addr p1, p0

    return p1
.end method

.method private ֫(IIII)Ll/ᩳۗ᩻;
    .locals 4

    sget v0, Ll/֡֡;->֫ۤܳ:I

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-boolean v0, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v0, :cond_1

    goto :goto_4

    .line 808
    :cond_1
    sget v0, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v0, :cond_2

    goto :goto_2

    :cond_2
    sget v0, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v0, :cond_3

    goto :goto_1

    :cond_3
    sget v0, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v0, :cond_4

    goto :goto_3

    .line 1104
    :cond_4
    sget v0, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v0, :cond_5

    goto :goto_3

    .line 1013
    :cond_5
    sget v0, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v0, :cond_6

    goto :goto_2

    .line 1125
    :cond_6
    sget v0, Ll/۟;->ۗۤۛ:I

    if-eqz v0, :cond_7

    goto :goto_2

    .line 995
    :cond_7
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_1

    :cond_8
    sget v0, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v0, :cond_d

    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    sget p1, Ll/ۗ۬;->ۘܳ᩻:I

    if-lez p1, :cond_9

    goto :goto_1

    .line 106
    :cond_9
    :goto_0
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    sget-boolean p1, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz p1, :cond_a

    goto :goto_4

    .line 656
    :cond_a
    :goto_1
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    sget-boolean p1, Ll/֫֫;->ۢ᩸᩶:Z

    if-nez p1, :cond_b

    goto :goto_3

    .line 206
    :cond_b
    :goto_2
    sget p1, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz p1, :cond_c

    goto :goto_4

    .line 579
    :cond_c
    :goto_3
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    .line 378
    :goto_4
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    const/4 p1, 0x0

    return-object p1

    .line 748
    :cond_d
    iget-object v0, p0, Ll/ܿۗ᩻;->ᩳ:[I

    array-length v1, v0

    sub-int/2addr p4, v1

    const/4 v2, 0x1

    if-nez p3, :cond_e

    neg-int p1, p4

    sub-int/2addr p2, v2

    sub-int/2addr p2, p4

    goto :goto_5

    :cond_e
    sub-int/2addr p3, v2

    mul-int p3, p3, p1

    add-int/2addr p3, p2

    sub-int p2, p3, p4

    add-int/2addr p1, p2

    sub-int/2addr p1, v2

    move v3, p2

    move p2, p1

    move p1, v3

    :goto_5
    const/4 p3, 0x0

    if-gez p1, :cond_f

    const/4 p1, 0x0

    :cond_f
    if-gez p2, :cond_10

    .line 763
    sget-object p1, Ll/ܳۗ᩻;->ۡ:Ll/ᩳۗ᩻;

    return-object p1

    :cond_10
    sub-int/2addr p2, p1

    add-int/2addr p2, v2

    if-gtz p2, :cond_11

    .line 769
    sget-object p1, Ll/ܳۗ᩻;->ۡ:Ll/ᩳۗ᩻;

    return-object p1

    :cond_11
    if-nez p1, :cond_13

    if-lt p2, v1, :cond_13

    .line 1207
    iget p1, p0, Ll/ܿۗ᩻;->ܿ:I

    if-ltz p1, :cond_12

    return-object p0

    :cond_12
    invoke-virtual {p0}, Ll/ᩳۗ᩻;->ܳ()Ll/ᩳۗ᩻;

    move-result-object p1

    return-object p1

    .line 778
    :cond_13
    new-array p4, p2, [I

    .line 779
    invoke-static {v0, p1, p4, p3, p2}, Ll/ۗ᩷;->ۢۚܺ(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 781
    new-instance p1, Ll/ᩳۗ᩻;

    invoke-static {p4}, Ll/ᩳۗ᩻;->֫([I)[I

    move-result-object p2

    invoke-direct {p1, p2, v2}, Ll/ᩳۗ᩻;-><init>([II)V

    return-object p1
.end method

.method public static ֫(II[I)Ll/ᩳۗ᩻;
    .locals 17

    move/from16 v0, p1

    move-object/from16 v1, p2

    .line 219
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    move-result v2

    if-ltz v2, :cond_1

    goto/16 :goto_2

    .line 547
    :cond_1
    invoke-static/range {p0 .. p0}, Ljava/lang/Integer;->bitCount(I)I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_2

    .line 548
    new-instance v2, Ll/ᩳۗ᩻;

    invoke-static/range {p0 .. p0}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    move-result v3

    invoke-static {v3, v1}, Ll/ᩳۗ᩻;->ۧ(I[I)[I

    move-result-object v1

    invoke-direct {v2, v1, v0}, Ll/ᩳۗ᩻;-><init>([II)V

    return-object v2

    .line 550
    :cond_2
    array-length v2, v1

    add-int/lit8 v3, v2, 0x1

    .line 446
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_1

    .line 551
    :cond_3
    new-array v4, v3, [I

    move/from16 v5, p0

    int-to-long v5, v5

    .line 455
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    move-result v7

    if-eqz v7, :cond_4

    goto :goto_1

    :cond_4
    const-wide v7, 0xffffffffL

    and-long/2addr v5, v7

    .line 367
    sget-boolean v9, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v9, :cond_5

    goto :goto_2

    :cond_5
    add-int/lit8 v9, v2, -0x1

    const-wide/16 v10, 0x0

    move-wide v12, v10

    :goto_0
    if-ltz v9, :cond_e

    .line 556
    aget v14, v1, v9

    int-to-long v14, v14

    and-long/2addr v14, v7

    sget-boolean v16, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v16, :cond_6

    goto :goto_1

    :cond_6
    mul-long v14, v14, v5

    .line 227
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    move-result v16

    if-eqz v16, :cond_7

    goto :goto_2

    :cond_7
    add-long/2addr v14, v12

    add-int/lit8 v12, v2, -0x1

    sget-boolean v13, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v13, :cond_a

    .line 277
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    sget v0, Ll/֨ۤ;->ܿۖ᩵:I

    if-gez v0, :cond_8

    goto :goto_3

    .line 34
    :cond_8
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    sget v0, Ll/֨۟;->᩹֫᩷:I

    if-nez v0, :cond_9

    goto :goto_3

    .line 115
    :cond_9
    :goto_1
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    sget v0, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-lez v0, :cond_b

    goto :goto_3

    :cond_a
    long-to-int v13, v14

    .line 557
    aput v13, v4, v2

    const/16 v2, 0x20

    sget-boolean v13, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v13, :cond_c

    .line 59
    :cond_b
    :goto_2
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    invoke-static {}, Ll/۠;->ܿ۠۠()I

    goto :goto_3

    :cond_c
    ushr-long v13, v14, v2

    sget-boolean v2, Ll/֨۫;->۬᩷᩶:Z

    if-nez v2, :cond_d

    .line 13
    :goto_3
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    const/4 v0, 0x0

    return-object v0

    :cond_d
    add-int/lit8 v9, v9, -0x1

    move v2, v12

    move-wide v12, v13

    goto :goto_0

    :cond_e
    cmp-long v1, v12, v10

    if-nez v1, :cond_f

    const/4 v1, 0x1

    .line 561
    invoke-static {v4, v1, v3}, Ljava/util/Arrays;->copyOfRange([III)[I

    move-result-object v4

    goto :goto_4

    :cond_f
    long-to-int v1, v12

    .line 563
    aput v1, v4, v2

    .line 565
    :goto_4
    new-instance v1, Ll/ᩳۗ᩻;

    invoke-direct {v1, v4, v0}, Ll/ᩳۗ᩻;-><init>([II)V

    return-object v1
.end method

.method public static ֫(J)Ll/ᩳۗ᩻;
    .locals 6

    const-wide/16 v0, 0x0

    .line 195
    sget-boolean v2, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v2, :cond_0

    goto/16 :goto_4

    .line 85
    :cond_0
    sget-boolean v2, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v2, :cond_1

    goto/16 :goto_3

    :cond_1
    sget v2, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v2, :cond_2

    goto/16 :goto_3

    .line 42
    :cond_2
    sget-boolean v2, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v2, :cond_3

    goto/16 :goto_3

    .line 3
    :cond_3
    sget v2, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v2, :cond_4

    goto/16 :goto_1

    :cond_4
    cmp-long v2, p0, v0

    if-nez v2, :cond_5

    .line 277
    sget-object p0, Ll/ܳۗ᩻;->ۡ:Ll/ᩳۗ᩻;

    return-object p0

    :cond_5
    if-lez v2, :cond_6

    const-wide/16 v0, 0x10

    cmp-long v3, p0, v0

    if-gtz v3, :cond_6

    .line 279
    sget-object v0, Ll/ܳۗ᩻;->ۘ:[Ll/ᩳۗ᩻;

    long-to-int p1, p0

    aget-object p0, v0, p1

    return-object p0

    :cond_6
    if-gez v2, :cond_8

    const-wide/16 v0, -0x10

    cmp-long v3, p0, v0

    if-ltz v3, :cond_8

    .line 281
    sget-object v0, Ll/ܳۗ᩻;->ۖ:[Ll/ᩳۗ᩻;

    neg-long p0, p0

    .line 275
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_1

    :cond_7
    long-to-int p1, p0

    .line 281
    aget-object p0, v0, p1

    return-object p0

    .line 283
    :cond_8
    new-instance v0, Ll/ᩳۗ᩻;

    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x1

    if-gez v2, :cond_9

    neg-long p0, p0

    const/4 v2, -0x1

    .line 292
    iput v2, v0, Ll/ܿۗ᩻;->ܿ:I

    goto :goto_0

    .line 294
    :cond_9
    iput v1, v0, Ll/ܿۗ᩻;->ܿ:I

    :goto_0
    const/16 v2, 0x20

    ushr-long v2, p0, v2

    .line 122
    sget v4, Ll/֡֡;->֫ۤܳ:I

    if-ltz v4, :cond_a

    goto :goto_3

    :cond_a
    long-to-int v3, v2

    const/4 v2, 0x0

    if-nez v3, :cond_c

    new-array v1, v1, [I

    .line 299
    iput-object v1, v0, Ll/ܿۗ᩻;->ᩳ:[I

    .line 204
    sget v3, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v3, :cond_b

    goto :goto_3

    :cond_b
    long-to-int p1, p0

    aput p1, v1, v2

    return-object v0

    :cond_c
    const/4 v4, 0x2

    new-array v4, v4, [I

    sget v5, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v5, :cond_d

    goto :goto_2

    .line 302
    :cond_d
    iput-object v4, v0, Ll/ܿۗ᩻;->ᩳ:[I

    .line 168
    sget v5, Ll/۟;->ۗۤۛ:I

    if-eqz v5, :cond_12

    .line 195
    sget p0, Ll/֡֡;->֫ۤܳ:I

    if-ltz p0, :cond_e

    goto :goto_2

    .line 259
    :cond_e
    :goto_1
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    sget p0, Ll/ۖ۫;->ۖ֫ܿ:I

    if-gez p0, :cond_f

    goto :goto_2

    .line 231
    :cond_f
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    sget p0, Ll/֫ۧ;->ۙ۟ۧ:I

    if-lez p0, :cond_10

    goto :goto_3

    .line 104
    :cond_10
    :goto_2
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    move-result p0

    if-nez p0, :cond_11

    goto :goto_4

    :cond_11
    :goto_3
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    :goto_4
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    const/4 p0, 0x0

    return-object p0

    :cond_12
    aput v3, v4, v2

    long-to-int p1, p0

    aput p1, v4, v1

    return-object v0
.end method

.method private ֫(Ll/ᩳۗ᩻;Z)Ll/ᩳۗ᩻;
    .locals 12

    .line 457
    iget v0, p1, Ll/ܿۗ᩻;->ܿ:I

    if-eqz v0, :cond_1e

    iget v1, p0, Ll/ܿۗ᩻;->ܿ:I

    if-nez v1, :cond_0

    goto/16 :goto_a

    .line 460
    :cond_0
    iget-object v2, p0, Ll/ܿۗ᩻;->ᩳ:[I

    array-length v3, v2

    const/4 v4, 0x0

    if-ne p1, p0, :cond_1

    const/16 v5, 0x14

    if-le v3, v5, :cond_1

    .line 868
    invoke-direct {p0, v4}, Ll/ᩳۗ᩻;->֫(Z)Ll/ᩳۗ᩻;

    move-result-object p1

    return-object p1

    .line 466
    :cond_1
    iget-object v5, p1, Ll/ܿۗ᩻;->ᩳ:[I

    array-length v6, v5

    const/16 v7, 0x50

    const/4 v8, 0x1

    if-lt v3, v7, :cond_1a

    if-ge v6, v7, :cond_2

    goto/16 :goto_8

    :cond_2
    const/4 v0, 0x2

    const/16 v1, 0xf0

    if-ge v3, v1, :cond_7

    if-ge v6, v1, :cond_7

    .line 616
    array-length p2, v2

    .line 617
    array-length v1, v5

    .line 620
    invoke-static {p2, v1}, Ll/֡ۜ;->۟᩻۠(II)I

    move-result p2

    add-int/2addr p2, v8

    div-int/2addr p2, v0

    .line 624
    invoke-direct {p0, p2}, Ll/ᩳۗ᩻;->᩻(I)Ll/ᩳۗ᩻;

    move-result-object v0

    .line 625
    invoke-direct {p0, p2}, Ll/ᩳۗ᩻;->ۜ(I)Ll/ᩳۗ᩻;

    move-result-object v1

    sget v2, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v2, :cond_3

    goto/16 :goto_3

    .line 626
    :cond_3
    invoke-direct {p1, p2}, Ll/ᩳۗ᩻;->᩻(I)Ll/ᩳۗ᩻;

    move-result-object v2

    .line 627
    invoke-direct {p1, p2}, Ll/ᩳۗ᩻;->ۜ(I)Ll/ᩳۗ᩻;

    move-result-object v3

    .line 445
    invoke-direct {v1, v3, v4}, Ll/ᩳۗ᩻;->֫(Ll/ᩳۗ᩻;Z)Ll/ᩳۗ᩻;

    move-result-object v5

    invoke-direct {v0, v2, v4}, Ll/ᩳۗ᩻;->֫(Ll/ᩳۗ᩻;Z)Ll/ᩳۗ᩻;

    move-result-object v6

    .line 633
    invoke-static {v1, v0}, Ll/֨۫;->֫ۨᩳ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object v0

    .line 322
    sget-boolean v1, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v1, :cond_4

    goto/16 :goto_2

    .line 633
    :cond_4
    invoke-static {v3, v2}, Ll/֨۫;->֫ۨᩳ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object v1

    .line 445
    invoke-direct {v0, v1, v4}, Ll/ᩳۗ᩻;->֫(Ll/ᩳۗ᩻;Z)Ll/ᩳۗ᩻;

    move-result-object v0

    mul-int/lit8 p2, p2, 0x20

    .line 636
    invoke-virtual {v5, p2}, Ll/ᩳۗ᩻;->ᩳ(I)Ll/ᩳۗ᩻;

    move-result-object v1

    invoke-static {v0, v5}, Ll/ۨ;->֡ᩴ۠(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object v0

    .line 637
    sget v2, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v2, :cond_5

    goto/16 :goto_1

    .line 636
    :cond_5
    invoke-static {v0, v6}, Ll/֨ۡ;->᩵ܿܽ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object v0

    invoke-static {v1, v0}, Ll/֨۫;->֫ۨᩳ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object v0

    invoke-virtual {v0, p2}, Ll/ᩳۗ᩻;->ᩳ(I)Ll/ᩳۗ᩻;

    move-result-object p2

    invoke-static {p2, v6}, Ll/֨۫;->֫ۨᩳ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object p2

    .line 638
    iget v0, p0, Ll/ܿۗ᩻;->ܿ:I

    iget p1, p1, Ll/ܿۗ᩻;->ܿ:I

    if-eq v0, p1, :cond_6

    .line 639
    invoke-virtual {p2}, Ll/ᩳۗ᩻;->ܳ()Ll/ᩳۗ᩻;

    move-result-object p1

    return-object p1

    :cond_6
    return-object p2

    :cond_7
    if-nez p2, :cond_9

    .line 534
    array-length p2, v2

    invoke-static {p2, v2}, Ll/ᩳۗ᩻;->֫(I[I)I

    move-result p2

    iget-object v1, p1, Ll/ܿۗ᩻;->ᩳ:[I

    array-length v2, v1

    .line 535
    invoke-static {v2, v1}, Ll/ᩳۗ᩻;->֫(I[I)I

    move-result v1

    add-int/2addr p2, v1

    int-to-long v1, p2

    const-wide v5, 0x80000000L

    cmp-long p2, v1, v5

    if-gtz p2, :cond_8

    goto :goto_0

    .line 260
    :cond_8
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 670
    :cond_9
    :goto_0
    iget-object p2, p0, Ll/ܿۗ᩻;->ᩳ:[I

    array-length p2, p2

    .line 671
    iget-object v1, p1, Ll/ܿۗ᩻;->ᩳ:[I

    array-length v1, v1

    .line 673
    invoke-static {p2, v1}, Ll/֡ۜ;->۟᩻۠(II)I

    move-result p2

    .line 203
    sget v1, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v1, :cond_a

    goto/16 :goto_7

    :cond_a
    add-int/lit8 v1, p2, 0x2

    .line 676
    div-int/lit8 v1, v1, 0x3

    .line 430
    sget v2, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v2, :cond_b

    goto/16 :goto_7

    :cond_b
    mul-int/lit8 v2, v1, 0x2

    sub-int v2, p2, v2

    .line 684
    invoke-direct {p0, v1, v2, v4, p2}, Ll/ᩳۗ᩻;->֫(IIII)Ll/ᩳۗ᩻;

    move-result-object v3

    .line 685
    invoke-direct {p0, v1, v2, v8, p2}, Ll/ᩳۗ᩻;->֫(IIII)Ll/ᩳۗ᩻;

    move-result-object v5

    .line 686
    invoke-direct {p0, v1, v2, v0, p2}, Ll/ᩳۗ᩻;->֫(IIII)Ll/ᩳۗ᩻;

    move-result-object v6

    .line 687
    invoke-direct {p1, v1, v2, v4, p2}, Ll/ᩳۗ᩻;->֫(IIII)Ll/ᩳۗ᩻;

    move-result-object v4

    .line 688
    invoke-direct {p1, v1, v2, v8, p2}, Ll/ᩳۗ᩻;->֫(IIII)Ll/ᩳۗ᩻;

    move-result-object v7

    .line 57
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v9

    if-eqz v9, :cond_c

    .line 306
    :goto_1
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    sget p1, Ll/֨ۤ;->ܿۖ᩵:I

    if-gez p1, :cond_10

    goto/16 :goto_4

    .line 689
    :cond_c
    invoke-direct {p1, v1, v2, v0, p2}, Ll/ᩳۗ᩻;->֫(IIII)Ll/ᩳۗ᩻;

    move-result-object p2

    .line 693
    invoke-direct {v6, p2, v8}, Ll/ᩳۗ᩻;->֫(Ll/ᩳۗ᩻;Z)Ll/ᩳۗ᩻;

    move-result-object v0

    .line 694
    invoke-static {v3, v6}, Ll/֨۫;->֫ۨᩳ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object v2

    .line 695
    invoke-static {v4, p2}, Ll/ۖۘ;->۫۬ۙ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object v9

    .line 696
    invoke-static {v2, v5}, Ll/֨ۡ;->᩵ܿܽ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object v10

    invoke-static {v9, v7}, Ll/ۨ;->֡ᩴ۠(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object v11

    invoke-direct {v10, v11, v8}, Ll/ᩳۗ᩻;->֫(Ll/ᩳۗ᩻;Z)Ll/ᩳۗ᩻;

    move-result-object v10

    .line 697
    invoke-static {v2, v5}, Ll/ۖۘ;->۫۬ۙ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object v2

    .line 698
    invoke-static {v9, v7}, Ll/ۖۘ;->۫۬ۙ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object v5

    .line 112
    sget v7, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v7, :cond_d

    goto/16 :goto_3

    .line 699
    :cond_d
    invoke-direct {v2, v5, v8}, Ll/ᩳۗ᩻;->֫(Ll/ᩳۗ᩻;Z)Ll/ᩳۗ᩻;

    move-result-object v7

    .line 700
    invoke-static {v2, v3}, Ll/֨۫;->֫ۨᩳ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object v2

    invoke-virtual {v2, v8}, Ll/ᩳۗ᩻;->ᩳ(I)Ll/ᩳۗ᩻;

    move-result-object v2

    invoke-static {v2, v6}, Ll/֨ۡ;->᩵ܿܽ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object v2

    .line 701
    invoke-static {v5, v4}, Ll/֨۫;->֫ۨᩳ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object v5

    invoke-virtual {v5, v8}, Ll/ᩳۗ᩻;->ᩳ(I)Ll/ᩳۗ᩻;

    move-result-object v5

    invoke-static {v5, p2}, Ll/ۨ;->֡ᩴ۠(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object p2

    .line 700
    invoke-direct {v2, p2, v8}, Ll/ᩳۗ᩻;->֫(Ll/ᩳۗ᩻;Z)Ll/ᩳۗ᩻;

    move-result-object p2

    .line 702
    :try_start_0
    invoke-direct {v3, v4, v8}, Ll/ᩳۗ᩻;->֫(Ll/ᩳۗ᩻;Z)Ll/ᩳۗ᩻;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 710
    invoke-static {p2, v10}, Ll/ۨ;->֡ᩴ۠(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object p2

    invoke-direct {p2}, Ll/ᩳۗ᩻;->ۡ()Ll/ᩳۗ᩻;

    move-result-object p2

    .line 711
    invoke-static {v7, v10}, Ll/֨ۡ;->᩵ܿܽ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object v3

    invoke-virtual {v3, v8}, Ll/ᩳۗ᩻;->ܿ(I)Ll/ᩳۗ᩻;

    move-result-object v3

    .line 712
    invoke-static {v7, v0}, Ll/֨ۡ;->᩵ܿܽ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object v4

    .line 713
    invoke-static {p2, v4}, Ll/ۨ;->֡ᩴ۠(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object p2

    invoke-virtual {p2, v8}, Ll/ᩳۗ᩻;->ܿ(I)Ll/ᩳۗ᩻;

    move-result-object p2

    .line 158
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    move-result v5

    if-eqz v5, :cond_e

    goto :goto_4

    .line 714
    :cond_e
    invoke-static {v4, v3}, Ll/֨ۡ;->᩵ܿܽ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object v4

    invoke-static {v4, v2}, Ll/ۨ;->֡ᩴ۠(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object v4

    .line 715
    invoke-virtual {v2, v8}, Ll/ᩳۗ᩻;->ᩳ(I)Ll/ᩳۗ᩻;

    move-result-object v5

    invoke-static {p2, v5}, Ll/ۨ;->֡ᩴ۠(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object p2

    .line 716
    invoke-static {v3, p2}, Ll/ۨ;->֡ᩴ۠(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object v3

    .line 40
    sget-boolean v5, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v5, :cond_f

    goto :goto_2

    :cond_f
    mul-int/lit8 v1, v1, 0x20

    .line 721
    invoke-virtual {v2, v1}, Ll/ᩳۗ᩻;->ᩳ(I)Ll/ᩳۗ᩻;

    move-result-object v2

    invoke-static {v2, p2}, Ll/֨۫;->֫ۨᩳ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object p2

    invoke-virtual {p2, v1}, Ll/ᩳۗ᩻;->ᩳ(I)Ll/ᩳۗ᩻;

    move-result-object p2

    invoke-static {p2, v4}, Ll/֨۫;->֫ۨᩳ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object p2

    .line 467
    sget v2, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v2, :cond_18

    .line 94
    :cond_10
    sget p1, Ll/ۗ᩵;->֫۠۟:I

    if-gez p1, :cond_11

    goto :goto_7

    .line 343
    :cond_11
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    sget p1, Ll/ۖ;->᩹۟ۘ:I

    if-gez p1, :cond_12

    goto :goto_5

    :cond_12
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    sget p1, Ll/ۘۨ;->۫᩸۠:I

    if-ltz p1, :cond_13

    goto :goto_3

    .line 284
    :cond_13
    :goto_2
    sget p1, Ll/۠;->ܺܺܶ:I

    if-gez p1, :cond_14

    goto :goto_7

    .line 21
    :cond_14
    :goto_3
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    sget p1, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-gez p1, :cond_15

    goto :goto_5

    .line 654
    :cond_15
    :goto_4
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    sget p1, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-lez p1, :cond_16

    goto :goto_6

    .line 89
    :cond_16
    :goto_5
    sget-boolean p1, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz p1, :cond_17

    goto :goto_7

    .line 163
    :cond_17
    :goto_6
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    :goto_7
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    const/4 p1, 0x0

    return-object p1

    .line 721
    :cond_18
    invoke-virtual {p2, v1}, Ll/ᩳۗ᩻;->ᩳ(I)Ll/ᩳۗ᩻;

    move-result-object p2

    invoke-static {p2, v3}, Ll/֨۫;->֫ۨᩳ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object p2

    invoke-virtual {p2, v1}, Ll/ᩳۗ᩻;->ᩳ(I)Ll/ᩳۗ᩻;

    move-result-object p2

    invoke-static {p2, v0}, Ll/ۖۘ;->۫۬ۙ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object p2

    .line 723
    iget v0, p0, Ll/ܿۗ᩻;->ܿ:I

    iget p1, p1, Ll/ܿۗ᩻;->ܿ:I

    if-eq v0, p1, :cond_19

    .line 724
    invoke-virtual {p2}, Ll/ᩳۗ᩻;->ܳ()Ll/ᩳۗ᩻;

    move-result-object p1

    return-object p1

    :cond_19
    return-object p2

    :catchall_0
    move-exception p1

    .line 702
    throw p1

    :cond_1a
    :goto_8
    if-ne v1, v0, :cond_1b

    const/4 p1, 0x1

    goto :goto_9

    :cond_1b
    const/4 p1, -0x1

    .line 470
    :goto_9
    array-length p2, v5

    if-ne p2, v8, :cond_1c

    .line 471
    aget p2, v5, v4

    invoke-static {p2, p1, v2}, Ll/ᩳۗ᩻;->֫(II[I)Ll/ᩳۗ᩻;

    move-result-object p1

    return-object p1

    .line 473
    :cond_1c
    array-length p2, v2

    if-ne p2, v8, :cond_1d

    .line 474
    aget p2, v2, v4

    invoke-static {p2, p1, v5}, Ll/ᩳۗ᩻;->֫(II[I)Ll/ᩳۗ᩻;

    move-result-object p1

    return-object p1

    :cond_1d
    const/4 p2, 0x0

    .line 476
    invoke-static {v3, v6, v2, v5, p2}, Ll/ᩳۗ᩻;->֫(II[I[I[I)[I

    move-result-object p2

    .line 478
    invoke-static {p2}, Ll/ᩳۗ᩻;->֫([I)[I

    move-result-object p2

    .line 479
    new-instance v0, Ll/ᩳۗ᩻;

    invoke-direct {v0, p2, p1}, Ll/ᩳۗ᩻;-><init>([II)V

    return-object v0

    .line 458
    :cond_1e
    :goto_a
    sget-object p1, Ll/ܳۗ᩻;->ۡ:Ll/ᩳۗ᩻;

    return-object p1
.end method

.method private ֫(Z)Ll/ᩳۗ᩻;
    .locals 8

    .line 879
    iget v0, p0, Ll/ܿۗ᩻;->ܿ:I

    if-nez v0, :cond_0

    .line 880
    sget-object p1, Ll/ܳۗ᩻;->ۡ:Ll/ᩳۗ᩻;

    return-object p1

    .line 882
    :cond_0
    iget-object v0, p0, Ll/ܿۗ᩻;->ᩳ:[I

    array-length v1, v0

    const/16 v2, 0x80

    const/4 v3, 0x1

    if-ge v1, v2, :cond_1

    const/4 p1, 0x0

    .line 885
    invoke-static {v1, v0, p1}, Ll/ᩳۗ᩻;->֫(I[I[I)[I

    move-result-object p1

    .line 886
    new-instance v0, Ll/ᩳۗ᩻;

    invoke-static {p1}, Ll/ᩳۗ᩻;->֫([I)[I

    move-result-object p1

    invoke-direct {v0, p1, v3}, Ll/ᩳۗ᩻;-><init>([II)V

    return-object v0

    :cond_1
    const/16 v2, 0xd8

    const/4 v4, 0x0

    const/4 v5, 0x2

    if-ge v1, v2, :cond_5

    .line 1011
    array-length p1, v0

    add-int/2addr p1, v3

    div-int/2addr p1, v5

    .line 1013
    invoke-direct {p0, p1}, Ll/ᩳۗ᩻;->᩻(I)Ll/ᩳۗ᩻;

    move-result-object v0

    .line 1014
    invoke-direct {p0, p1}, Ll/ᩳۗ᩻;->ۜ(I)Ll/ᩳۗ᩻;

    move-result-object v1

    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    move-result v2

    if-eqz v2, :cond_2

    goto/16 :goto_1

    .line 868
    :cond_2
    invoke-direct {v1, v4}, Ll/ᩳۗ᩻;->֫(Z)Ll/ᩳۗ᩻;

    move-result-object v2

    invoke-direct {v0, v4}, Ll/ᩳۗ᩻;->֫(Z)Ll/ᩳۗ᩻;

    move-result-object v3

    mul-int/lit8 p1, p1, 0x20

    .line 333
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result v5

    if-eqz v5, :cond_3

    goto/16 :goto_2

    .line 1020
    :cond_3
    invoke-virtual {v2, p1}, Ll/ᩳۗ᩻;->ᩳ(I)Ll/ᩳۗ᩻;

    move-result-object v5

    invoke-static {v0, v1}, Ll/ۖۘ;->۫۬ۙ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object v0

    .line 868
    invoke-direct {v0, v4}, Ll/ᩳۗ᩻;->֫(Z)Ll/ᩳۗ᩻;

    move-result-object v0

    .line 1020
    invoke-static {v2, v3}, Ll/ۖۘ;->۫۬ۙ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object v1

    .line 547
    sget-boolean v2, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v2, :cond_4

    goto/16 :goto_4

    .line 1020
    :cond_4
    invoke-static {v0, v1}, Ll/֨ۡ;->᩵ܿܽ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object v0

    invoke-static {v5, v0}, Ll/֨۫;->֫ۨᩳ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ᩳۗ᩻;->ᩳ(I)Ll/ᩳۗ᩻;

    move-result-object p1

    invoke-static {p1, v3}, Ll/֨۫;->֫ۨᩳ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object p1

    return-object p1

    :cond_5
    if-nez p1, :cond_7

    .line 895
    array-length p1, v0

    invoke-static {p1, v0}, Ll/ᩳۗ᩻;->֫(I[I)I

    move-result p1

    int-to-long v0, p1

    const-wide/32 v6, 0x40000000

    cmp-long p1, v0, v6

    if-gtz p1, :cond_6

    goto :goto_0

    .line 260
    :cond_6
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 1031
    :cond_7
    :goto_0
    iget-object p1, p0, Ll/ܿۗ᩻;->ᩳ:[I

    array-length p1, p1

    add-int/lit8 v0, p1, 0x2

    .line 841
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v1

    if-ltz v1, :cond_8

    goto/16 :goto_3

    .line 1034
    :cond_8
    div-int/lit8 v0, v0, 0x3

    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    move-result v1

    if-gtz v1, :cond_9

    goto/16 :goto_2

    :cond_9
    mul-int/lit8 v1, v0, 0x2

    sub-int v1, p1, v1

    .line 1042
    invoke-direct {p0, v0, v1, v4, p1}, Ll/ᩳۗ᩻;->֫(IIII)Ll/ᩳۗ᩻;

    move-result-object v2

    .line 1043
    invoke-direct {p0, v0, v1, v3, p1}, Ll/ᩳۗ᩻;->֫(IIII)Ll/ᩳۗ᩻;

    move-result-object v4

    .line 388
    sget v6, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v6, :cond_a

    goto :goto_1

    .line 1044
    :cond_a
    invoke-direct {p0, v0, v1, v5, p1}, Ll/ᩳۗ᩻;->֫(IIII)Ll/ᩳۗ᩻;

    move-result-object p1

    .line 1047
    invoke-direct {p1, v3}, Ll/ᩳۗ᩻;->֫(Z)Ll/ᩳۗ᩻;

    move-result-object v1

    .line 1048
    invoke-static {v2, p1}, Ll/ۖۘ;->۫۬ۙ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object v5

    .line 1049
    invoke-static {v5, v4}, Ll/ۨ;->֡ᩴ۠(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object v6

    invoke-direct {v6, v3}, Ll/ᩳۗ᩻;->֫(Z)Ll/ᩳۗ᩻;

    move-result-object v6

    .line 1050
    invoke-static {v5, v4}, Ll/֨۫;->֫ۨᩳ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object v4

    .line 1020
    sget-boolean v5, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v5, :cond_b

    goto/16 :goto_3

    .line 1051
    :cond_b
    invoke-direct {v4, v3}, Ll/ᩳۗ᩻;->֫(Z)Ll/ᩳۗ᩻;

    move-result-object v5

    .line 1052
    invoke-direct {v2, v3}, Ll/ᩳۗ᩻;->֫(Z)Ll/ᩳۗ᩻;

    move-result-object v7

    .line 1053
    invoke-static {v4, v2}, Ll/֨۫;->֫ۨᩳ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object v2

    invoke-virtual {v2, v3}, Ll/ᩳۗ᩻;->ᩳ(I)Ll/ᩳۗ᩻;

    move-result-object v2

    invoke-static {v2, p1}, Ll/ۨ;->֡ᩴ۠(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object p1

    :try_start_0
    invoke-direct {p1, v3}, Ll/ᩳۗ᩻;->֫(Z)Ll/ᩳۗ᩻;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1061
    invoke-static {p1, v6}, Ll/֨ۡ;->᩵ܿܽ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object p1

    invoke-direct {p1}, Ll/ᩳۗ᩻;->ۡ()Ll/ᩳۗ᩻;

    move-result-object p1

    .line 1062
    invoke-static {v5, v6}, Ll/ۨ;->֡ᩴ۠(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object v2

    invoke-virtual {v2, v3}, Ll/ᩳۗ᩻;->ܿ(I)Ll/ᩳۗ᩻;

    move-result-object v2

    .line 1063
    invoke-static {v5, v1}, Ll/ۨ;->֡ᩴ۠(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object v4

    .line 1064
    invoke-static {p1, v4}, Ll/ۨ;->֡ᩴ۠(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object p1

    .line 356
    sget v5, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v5, :cond_c

    :goto_1
    sget p1, Ll/ۖ;->᩹۟ۘ:I

    if-ltz p1, :cond_e

    goto :goto_2

    .line 1064
    :cond_c
    invoke-virtual {p1, v3}, Ll/ᩳۗ᩻;->ܿ(I)Ll/ᩳۗ᩻;

    move-result-object p1

    .line 1065
    invoke-static {v4, v2}, Ll/֨ۡ;->᩵ܿܽ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object v4

    invoke-static {v4, v7}, Ll/ۨ;->֡ᩴ۠(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object v4

    .line 1066
    invoke-virtual {v7, v3}, Ll/ᩳۗ᩻;->ᩳ(I)Ll/ᩳۗ᩻;

    move-result-object v3

    invoke-static {p1, v3}, Ll/ۨ;->֡ᩴ۠(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object p1

    .line 446
    sget v3, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v3, :cond_d

    goto :goto_2

    .line 1067
    :cond_d
    invoke-static {v2, p1}, Ll/֨ۡ;->᩵ܿܽ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object v2

    mul-int/lit8 v0, v0, 0x20

    .line 1072
    invoke-virtual {v7, v0}, Ll/ᩳۗ᩻;->ᩳ(I)Ll/ᩳۗ᩻;

    move-result-object v3

    invoke-static {v3, p1}, Ll/ۖۘ;->۫۬ۙ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object p1

    invoke-virtual {p1, v0}, Ll/ᩳۗ᩻;->ᩳ(I)Ll/ᩳۗ᩻;

    move-result-object p1

    .line 55
    sget v3, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v3, :cond_11

    .line 361
    :cond_e
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    sget p1, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz p1, :cond_f

    goto :goto_4

    .line 947
    :cond_f
    :goto_2
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    sget p1, Ll/֨۟;->᩹֫᩷:I

    if-nez p1, :cond_10

    goto :goto_4

    :cond_10
    :goto_3
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    .line 572
    :goto_4
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    const/4 p1, 0x0

    return-object p1

    .line 1072
    :cond_11
    invoke-static {p1, v4}, Ll/֨۫;->֫ۨᩳ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object p1

    invoke-virtual {p1, v0}, Ll/ᩳۗ᩻;->ᩳ(I)Ll/ᩳۗ᩻;

    move-result-object p1

    invoke-static {p1, v2}, Ll/ۖۘ;->۫۬ۙ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object p1

    invoke-virtual {p1, v0}, Ll/ᩳۗ᩻;->ᩳ(I)Ll/ᩳۗ᩻;

    move-result-object p1

    invoke-static {p1, v1}, Ll/֨۫;->֫ۨᩳ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    .line 1053
    throw p1
.end method

.method public static ֫([I[I[I[II)V
    .locals 1

    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_4

    :cond_0
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    move-result v0

    if-gtz v0, :cond_1

    goto :goto_4

    .line 448
    :cond_1
    sget v0, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v0, :cond_2

    goto :goto_1

    .line 296
    :cond_2
    sget v0, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v0, :cond_3

    goto :goto_4

    .line 911
    :cond_3
    sget-boolean v0, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    sget v0, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v0, :cond_5

    goto :goto_3

    .line 190
    :cond_5
    sget v0, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v0, :cond_6

    goto :goto_3

    :cond_6
    sget v0, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v0, :cond_7

    goto :goto_0

    :cond_7
    sget-boolean v0, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v0, :cond_8

    goto :goto_4

    .line 1383
    :cond_8
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v0

    if-nez v0, :cond_c

    .line 897
    :goto_0
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    sget p0, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-gez p0, :cond_9

    goto :goto_4

    .line 1379
    :cond_9
    :goto_1
    sget p0, Ll/ۖ;->᩹۟ۘ:I

    if-ltz p0, :cond_a

    goto :goto_3

    .line 738
    :cond_a
    :goto_2
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    sget p0, Ll/֫ܽ;->ۚ᩷᩹:I

    if-gez p0, :cond_b

    goto :goto_4

    :cond_b
    :goto_3
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    .line 1050
    :goto_4
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    return-void

    .line 1383
    :cond_c
    rem-int/lit8 v0, p4, 0x2

    if-nez v0, :cond_10

    const/4 v0, 0x1

    if-lt p4, v0, :cond_f

    .line 1391
    array-length p0, p0

    if-gt p4, p0, :cond_e

    array-length p0, p1

    if-gt p4, p0, :cond_e

    array-length p0, p2

    if-gt p4, p0, :cond_e

    if-eqz p3, :cond_d

    array-length p0, p3

    if-gt p4, p0, :cond_e

    :cond_d
    return-void

    .line 1395
    :cond_e
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    .line 1388
    :cond_f
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    .line 1384
    :cond_10
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static ֫(II[I[I[I)[I
    .locals 17

    move-object/from16 v0, p4

    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_4

    :cond_0
    sget v1, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v1, :cond_1

    goto/16 :goto_6

    .line 434
    :cond_1
    sget-boolean v1, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v1, :cond_2

    goto/16 :goto_6

    :cond_2
    add-int/lit8 v1, p0, -0x1

    add-int/lit8 v2, p1, -0x1

    if-eqz v0, :cond_3

    .line 576
    array-length v3, v0

    add-int v4, p0, p1

    if-ge v3, v4, :cond_4

    :cond_3
    add-int v0, p0, p1

    .line 577
    new-array v0, v0, [I

    :cond_4
    add-int v3, p1, v1

    const-wide/16 v4, 0x0

    move v6, v2

    move-wide v7, v4

    :goto_0
    const/16 v9, 0x20

    const-wide v10, 0xffffffffL

    if-ltz v6, :cond_8

    .line 581
    aget v12, p3, v6

    int-to-long v12, v12

    and-long/2addr v12, v10

    aget v14, p2, v1

    int-to-long v14, v14

    .line 113
    sget v16, Ll/ۛ;->᩺᩻֫:I

    if-ltz v16, :cond_5

    goto :goto_5

    :cond_5
    and-long/2addr v10, v14

    mul-long v12, v12, v10

    add-long/2addr v12, v7

    .line 386
    sget-boolean v7, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v7, :cond_6

    goto :goto_3

    :cond_6
    long-to-int v7, v12

    .line 583
    aput v7, v0, v3

    ushr-long v7, v12, v9

    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result v9

    if-eqz v9, :cond_7

    goto :goto_4

    :cond_7
    add-int/lit8 v6, v6, -0x1

    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    :cond_8
    long-to-int v3, v7

    .line 586
    aput v3, v0, v1

    add-int/lit8 v1, p0, -0x2

    :goto_1
    if-ltz v1, :cond_11

    add-int v3, p1, v1

    move v6, v2

    move-wide v7, v4

    :goto_2
    if-ltz v6, :cond_10

    .line 591
    aget v12, p3, v6

    int-to-long v12, v12

    and-long/2addr v12, v10

    aget v14, p2, v1

    .line 302
    sget v15, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v15, :cond_9

    goto :goto_6

    :cond_9
    int-to-long v14, v14

    and-long/2addr v14, v10

    .line 588
    sget-boolean v16, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v16, :cond_a

    goto :goto_5

    :cond_a
    mul-long v12, v12, v14

    .line 591
    aget v14, v0, v3

    int-to-long v14, v14

    and-long/2addr v14, v10

    .line 311
    sget v16, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v16, :cond_b

    .line 184
    :goto_3
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    sget v0, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v0, :cond_c

    goto :goto_5

    :cond_b
    add-long/2addr v12, v14

    add-long/2addr v12, v7

    long-to-int v7, v12

    .line 594
    aput v7, v0, v3

    ushr-long v7, v12, v9

    .line 104
    sget v12, Ll/ۛ;->᩺᩻֫:I

    if-ltz v12, :cond_f

    :cond_c
    :goto_4
    sget v0, Ll/᩹;->ۤܿܳ:I

    if-eqz v0, :cond_d

    goto :goto_7

    :cond_d
    :goto_5
    sget v0, Ll/ۗ᩵;->֫۠۟:I

    if-gez v0, :cond_e

    goto :goto_7

    .line 562
    :cond_e
    :goto_6
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    .line 320
    :goto_7
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    const/4 v0, 0x0

    return-object v0

    :cond_f
    add-int/lit8 v6, v6, -0x1

    add-int/lit8 v3, v3, -0x1

    goto :goto_2

    :cond_10
    long-to-int v3, v7

    .line 597
    aput v3, v0, v1

    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    :cond_11
    return-object v0
.end method

.method public static ֫(I[I[I)[I
    .locals 11

    .line 918
    sget v0, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v0, :cond_0

    goto/16 :goto_2

    :cond_0
    shl-int/lit8 v0, p0, 0x1

    if-eqz p2, :cond_1

    .line 911
    array-length v1, p2

    if-ge v1, v0, :cond_2

    .line 912
    :cond_1
    new-array p2, v0, [I

    :cond_2
    const/4 v1, 0x1

    if-lt p0, v1, :cond_17

    .line 926
    array-length v2, p1

    if-gt p0, v2, :cond_16

    mul-int/lit8 v2, p0, 0x2

    .line 929
    array-length v3, p2

    if-gt v2, v3, :cond_15

    if-lt v0, v1, :cond_14

    .line 935
    array-length v2, p2

    if-gt v0, v2, :cond_13

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v2, p0, :cond_9

    .line 982
    aget v5, p1, v2

    int-to-long v5, v5

    const-wide v7, 0xffffffffL

    and-long/2addr v5, v7

    .line 450
    sget v7, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v7, :cond_3

    goto/16 :goto_6

    :cond_3
    mul-long v5, v5, v5

    sget v7, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v7, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 v7, v3, 0x1

    shl-int/lit8 v4, v4, 0x1f

    sget v8, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v8, :cond_5

    goto/16 :goto_5

    :cond_5
    const/16 v8, 0x21

    ushr-long v8, v5, v8

    .line 647
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    move-result v10

    if-gtz v10, :cond_6

    goto :goto_2

    :cond_6
    long-to-int v9, v8

    or-int/2addr v4, v9

    .line 984
    aput v4, p2, v3

    .line 49
    sget v4, Ll/֡۬;->۠֡᩶:I

    if-gtz v4, :cond_7

    goto :goto_4

    :cond_7
    add-int/lit8 v3, v3, 0x2

    ushr-long v8, v5, v1

    .line 944
    sget v4, Ll/᩹;->ۤܿܳ:I

    if-eqz v4, :cond_8

    goto :goto_3

    :cond_8
    long-to-int v4, v8

    .line 985
    aput v4, p2, v7

    long-to-int v4, v5

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_9
    const/4 v2, 0x1

    move v3, p0

    :goto_1
    if-lez v3, :cond_f

    add-int/lit8 v4, v3, -0x1

    .line 991
    aget v5, p1, v4

    .line 992
    invoke-static {v2, v4, p2, p1, v5}, Ll/ᩳۗ᩻;->֫(II[I[II)I

    move-result v4

    .line 6
    sget v5, Ll/᩹;->ۤܿܳ:I

    if-eqz v5, :cond_a

    goto :goto_7

    :cond_a
    add-int/lit8 v5, v2, -0x1

    .line 518
    sget-boolean v6, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v6, :cond_e

    .line 826
    :goto_2
    sget-boolean p0, Ll/֫᩺;->֫ܰۨ:Z

    if-nez p0, :cond_b

    goto :goto_6

    :cond_b
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    sget-boolean p0, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez p0, :cond_c

    goto :goto_4

    .line 457
    :cond_c
    :goto_3
    sget p0, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz p0, :cond_d

    goto :goto_5

    .line 931
    :cond_d
    :goto_4
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    move-result p0

    if-gtz p0, :cond_10

    goto :goto_7

    .line 993
    :cond_e
    invoke-static {v5, v3, v4, p2}, Ll/ᩳۗ᩻;->֫(III[I)I

    add-int/lit8 v3, v3, -0x1

    add-int/lit8 v2, v2, 0x2

    goto :goto_1

    .line 997
    :cond_f
    invoke-static {v0, v1, p2}, Ll/ᩳۗ᩻;->ۧ(II[I)V

    sub-int/2addr v0, v1

    .line 998
    aget v2, p2, v0

    sub-int/2addr p0, v1

    .line 361
    sget v3, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v3, :cond_12

    .line 217
    :cond_10
    :goto_5
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    sget p0, Ll/֡۬;->۠֡᩶:I

    if-gtz p0, :cond_11

    goto :goto_7

    .line 31
    :cond_11
    :goto_6
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    :goto_7
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    const/4 p0, 0x0

    return-object p0

    .line 998
    :cond_12
    aget p0, p1, p0

    and-int/2addr p0, v1

    or-int/2addr p0, v2

    aput p0, p2, v0

    return-object p2

    .line 936
    :cond_13
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    .line 933
    :cond_14
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    .line 930
    :cond_15
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    .line 927
    :cond_16
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    .line 924
    :cond_17
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static ֫([I)[I
    .locals 3

    .line 2209
    array-length v0, p0

    .line 34
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_4

    .line 727
    :cond_0
    sget-boolean v1, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v1, :cond_1

    goto :goto_1

    .line 207
    :cond_1
    sget v1, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v1, :cond_2

    goto :goto_2

    .line 1338
    :cond_2
    sget v1, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v1, :cond_3

    goto :goto_1

    :cond_3
    sget v1, Ll/᩺;->ۙۛܶ:I

    if-gtz v1, :cond_4

    goto :goto_0

    :cond_4
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    move-result v1

    if-ltz v1, :cond_5

    goto :goto_3

    .line 2170
    :cond_5
    sget v1, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v1, :cond_6

    goto :goto_4

    .line 1672
    :cond_6
    sget-boolean v1, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v1, :cond_7

    goto :goto_4

    .line 2138
    :cond_7
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_4

    .line 1252
    :cond_8
    sget v1, Ll/֡֡;->֫ۤܳ:I

    if-ltz v1, :cond_c

    :goto_0
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result p0

    if-eqz p0, :cond_9

    goto :goto_4

    .line 579
    :cond_9
    :goto_1
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result p0

    if-lez p0, :cond_a

    goto :goto_3

    .line 1102
    :cond_a
    :goto_2
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    move-result p0

    if-lez p0, :cond_b

    goto :goto_4

    :cond_b
    :goto_3
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    .line 1389
    :goto_4
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    const/4 p0, 0x0

    return-object p0

    :cond_c
    const/4 v1, 0x0

    :goto_5
    if-ge v1, v0, :cond_d

    .line 2213
    aget v2, p0, v1

    if-nez v2, :cond_d

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_d
    if-nez v1, :cond_e

    return-object p0

    .line 2215
    :cond_e
    invoke-static {p0, v1, v0}, Ljava/util/Arrays;->copyOfRange([III)[I

    move-result-object p0

    return-object p0
.end method

.method public static ֫([I[I)[I
    .locals 17

    move-object/from16 v0, p0

    .line 341
    array-length v1, v0

    move-object/from16 v2, p1

    array-length v3, v2

    if-ge v1, v3, :cond_0

    move-object/from16 v16, v2

    move-object v2, v0

    move-object/from16 v0, v16

    .line 347
    :cond_0
    array-length v1, v0

    .line 348
    array-length v3, v2

    .line 349
    new-array v4, v1, [I

    .line 166
    sget v5, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v5, :cond_1

    goto/16 :goto_4

    :cond_1
    const-wide v5, 0xffffffffL

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-ne v3, v8, :cond_5

    add-int/lit8 v3, v1, -0x1

    .line 352
    aget v8, v0, v3

    sget-boolean v9, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v9, :cond_2

    goto/16 :goto_5

    :cond_2
    int-to-long v8, v8

    .line 49
    sget v10, Ll/᩹;->ۤܿܳ:I

    if-eqz v10, :cond_3

    goto :goto_3

    :cond_3
    and-long/2addr v8, v5

    .line 352
    aget v2, v2, v7

    .line 110
    sget v7, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v7, :cond_4

    goto :goto_1

    :cond_4
    int-to-long v10, v2

    and-long/2addr v5, v10

    add-long/2addr v8, v5

    long-to-int v2, v8

    .line 353
    aput v2, v4, v3

    goto/16 :goto_6

    :cond_5
    const-wide/16 v7, 0x0

    move-wide v8, v7

    move v7, v1

    :goto_0
    if-lez v3, :cond_11

    add-int/lit8 v7, v7, -0x1

    .line 357
    aget v10, v0, v7

    .line 139
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    move-result v11

    if-eqz v11, :cond_6

    goto/16 :goto_7

    :cond_6
    const/16 v11, 0x20

    int-to-long v12, v10

    sget v10, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v10, :cond_7

    goto :goto_4

    :cond_7
    and-long/2addr v12, v5

    add-int/lit8 v3, v3, -0x1

    .line 357
    aget v10, v2, v3

    .line 362
    sget v14, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v14, :cond_8

    goto :goto_1

    :cond_8
    int-to-long v14, v10

    and-long/2addr v14, v5

    add-long/2addr v12, v14

    .line 331
    sget-boolean v10, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v10, :cond_9

    goto :goto_2

    :cond_9
    ushr-long/2addr v8, v11

    add-long/2addr v8, v12

    .line 243
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    move-result v10

    if-nez v10, :cond_10

    .line 327
    :goto_1
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_5

    .line 269
    :cond_a
    :goto_2
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    sget v0, Ll/֡۬;->۠֡᩶:I

    if-gtz v0, :cond_b

    goto :goto_5

    .line 334
    :cond_b
    :goto_3
    sget v0, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v0, :cond_c

    goto :goto_5

    .line 371
    :cond_c
    :goto_4
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    sget v0, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v0, :cond_d

    goto :goto_7

    :cond_d
    sget v0, Ll/֡֡;->֫ۤܳ:I

    if-gez v0, :cond_e

    goto :goto_5

    .line 55
    :cond_e
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    sget v0, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v0, :cond_f

    goto :goto_8

    .line 238
    :cond_f
    :goto_5
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    sget v0, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-gez v0, :cond_12

    goto :goto_8

    :cond_10
    long-to-int v10, v8

    .line 359
    aput v10, v4, v7

    goto :goto_0

    :cond_11
    move v3, v7

    :goto_6
    const/16 v2, 0x20

    const-wide/16 v5, 0x0

    ushr-long v7, v8, v2

    sget v2, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v2, :cond_13

    :cond_12
    :goto_7
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    .line 224
    :goto_8
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    const/4 v0, 0x0

    return-object v0

    :cond_13
    cmp-long v2, v7, v5

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v2, :cond_14

    goto :goto_a

    :cond_14
    const/4 v2, 0x0

    :goto_9
    if-lez v3, :cond_15

    if-eqz v2, :cond_15

    add-int/lit8 v3, v3, -0x1

    .line 365
    aget v2, v0, v3

    add-int/2addr v2, v6

    aput v2, v4, v3

    if-nez v2, :cond_14

    :goto_a
    const/4 v2, 0x1

    goto :goto_9

    :cond_15
    :goto_b
    if-lez v3, :cond_16

    add-int/lit8 v3, v3, -0x1

    .line 369
    aget v7, v0, v3

    aput v7, v4, v3

    goto :goto_b

    :cond_16
    if-eqz v2, :cond_17

    add-int/lit8 v0, v1, 0x1

    .line 373
    new-array v0, v0, [I

    .line 374
    invoke-static {v4, v5, v0, v6, v1}, Ll/֫᩵;->ܳ۟ۖ(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 375
    aput v6, v0, v5

    return-object v0

    :cond_17
    return-object v4
.end method

.method public static native ֫([I[III)[I
.end method

.method public static native ֫([I[IIJ[I)[I
.end method

.method public static native ֫([I[I[IIJ[I)[I
.end method

.method private ۜ(I)Ll/ᩳۗ᩻;
    .locals 4

    .line 275
    sget v0, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v0, :cond_0

    goto :goto_1

    .line 52
    :cond_0
    sget v0, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v0, :cond_1

    goto :goto_4

    .line 89
    :cond_1
    sget-boolean v0, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v0, :cond_2

    goto :goto_0

    .line 224
    :cond_2
    sget v0, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v0, :cond_3

    goto :goto_0

    :cond_3
    sget v0, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v0, :cond_4

    goto :goto_1

    :cond_4
    sget v0, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v0, :cond_5

    goto :goto_0

    .line 847
    :cond_5
    iget-object v0, p0, Ll/ܿۗ᩻;->ᩳ:[I

    array-length v1, v0

    if-gt v1, p1, :cond_6

    .line 850
    sget-object p1, Ll/ܳۗ᩻;->ۡ:Ll/ᩳۗ᩻;

    return-object p1

    :cond_6
    sub-int/2addr v1, p1

    .line 854
    new-array p1, v1, [I

    sget v2, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v2, :cond_7

    goto :goto_4

    :cond_7
    const/4 v2, 0x0

    .line 328
    sget v3, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v3, :cond_8

    goto :goto_3

    .line 855
    :cond_8
    invoke-static {v0, v2, p1, v2, v1}, Ll/֫᩵;->ܳ۟ۖ(Ljava/lang/Object;ILjava/lang/Object;II)V

    sget v0, Ll/֨۟;->᩹֫᩷:I

    if-eqz v0, :cond_c

    .line 318
    :goto_0
    sget-boolean p1, Ll/֨۫;->۬᩷᩶:Z

    if-nez p1, :cond_9

    goto :goto_2

    .line 561
    :cond_9
    :goto_1
    sget p1, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-lez p1, :cond_a

    goto :goto_4

    .line 712
    :cond_a
    :goto_2
    sget p1, Ll/۟;->ۗۤۛ:I

    if-eqz p1, :cond_b

    goto :goto_4

    .line 560
    :cond_b
    :goto_3
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    goto :goto_4

    .line 857
    :cond_c
    new-instance v0, Ll/ᩳۗ᩻;

    invoke-static {p1}, Ll/ᩳۗ᩻;->֫([I)[I

    move-result-object p1

    .line 386
    sget v1, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v1, :cond_d

    .line 123
    :goto_4
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    const/4 p1, 0x0

    return-object p1

    :cond_d
    const/4 v1, 0x1

    .line 857
    invoke-direct {v0, p1, v1}, Ll/ᩳۗ᩻;-><init>([II)V

    return-object v0
.end method

.method private ۡ()Ll/ᩳۗ᩻;
    .locals 15

    .line 793
    iget-object v0, p0, Ll/ܿۗ᩻;->ᩳ:[I

    sget v1, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v1, :cond_0

    goto :goto_1

    :cond_0
    array-length v0, v0

    sget v1, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v1, :cond_1

    goto/16 :goto_5

    .line 794
    :cond_1
    new-array v1, v0, [I

    .line 435
    sget v2, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v2, :cond_2

    goto :goto_4

    :cond_2
    add-int/lit8 v0, v0, -0x1

    const-wide/16 v2, 0x0

    move-wide v4, v2

    :goto_0
    if-ltz v0, :cond_f

    .line 798
    iget-object v6, p0, Ll/ܿۗ᩻;->ᩳ:[I

    aget v6, v6, v0

    sget v7, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v7, :cond_3

    goto :goto_3

    :cond_3
    int-to-long v6, v6

    .line 200
    sget v8, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v8, :cond_4

    goto :goto_1

    :cond_4
    const-wide v8, 0xffffffffL

    .line 93
    sget v10, Ll/֨۟;->᩹֫᩷:I

    if-eqz v10, :cond_5

    .line 301
    :goto_1
    sget v0, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v0, :cond_9

    goto :goto_5

    :cond_5
    and-long/2addr v6, v8

    sub-long v10, v6, v4

    .line 676
    sget v12, Ll/ۛ;->᩺᩻֫:I

    if-ltz v12, :cond_6

    goto :goto_4

    :cond_6
    const-wide/16 v12, 0x1

    cmp-long v14, v4, v6

    if-lez v14, :cond_7

    move-wide v4, v12

    goto :goto_2

    :cond_7
    move-wide v4, v2

    :goto_2
    const-wide v6, 0xaaaaaaabL

    mul-long v10, v10, v6

    and-long/2addr v8, v10

    .line 571
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result v10

    if-eqz v10, :cond_8

    goto :goto_4

    :cond_8
    long-to-int v10, v8

    .line 401
    sget v11, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v11, :cond_c

    :cond_9
    :goto_3
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    sget v0, Ll/֫ܽ;->ۚ᩷᩹:I

    if-gez v0, :cond_a

    goto :goto_5

    :cond_a
    :goto_4
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    sget v0, Ll/֨۟;->᩹֫᩷:I

    if-eqz v0, :cond_b

    goto :goto_7

    .line 523
    :cond_b
    :goto_5
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    goto :goto_7

    .line 810
    :cond_c
    aput v10, v1, v0

    const-wide/32 v10, 0x55555556

    cmp-long v14, v8, v10

    if-ltz v14, :cond_e

    add-long/2addr v12, v4

    cmp-long v10, v8, v6

    if-ltz v10, :cond_d

    const-wide/16 v6, 0x2

    add-long/2addr v4, v6

    goto :goto_6

    :cond_d
    move-wide v4, v12

    :cond_e
    :goto_6
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 820
    :cond_f
    invoke-static {v1}, Ll/ᩳۗ᩻;->֫([I)[I

    move-result-object v0

    .line 821
    new-instance v1, Ll/ᩳۗ᩻;

    sget v2, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v2, :cond_10

    :goto_7
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    const/4 v0, 0x0

    return-object v0

    :cond_10
    iget v2, p0, Ll/ܿۗ᩻;->ܿ:I

    invoke-direct {v1, v0, v2}, Ll/ᩳۗ᩻;-><init>([II)V

    return-object v1
.end method

.method private ۢ(I)Ll/ᩳۗ᩻;
    .locals 12

    sget v0, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v0, :cond_0

    goto/16 :goto_e

    .line 751
    :cond_0
    sget-boolean v0, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v0, :cond_1

    goto/16 :goto_d

    :cond_1
    ushr-int/lit8 v0, p1, 0x5

    .line 153
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    move-result v1

    if-nez v1, :cond_2

    goto/16 :goto_a

    :cond_2
    and-int/lit8 p1, p1, 0x1f

    .line 1981
    iget-object v1, p0, Ll/ܿۗ᩻;->ᩳ:[I

    array-length v2, v1

    const/4 v3, 0x1

    if-lt v0, v2, :cond_4

    .line 1986
    iget p1, p0, Ll/ܿۗ᩻;->ܿ:I

    if-ltz p1, :cond_3

    sget-object p1, Ll/ܳۗ᩻;->ۡ:Ll/ᩳۗ᩻;

    return-object p1

    :cond_3
    sget-object p1, Ll/ܳۗ᩻;->ۖ:[Ll/ᩳۗ᩻;

    aget-object p1, p1, v3

    return-object p1

    :cond_4
    const/4 v4, 0x0

    if-nez p1, :cond_5

    sub-int v5, v2, v0

    .line 1990
    invoke-static {v1, v5}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    goto/16 :goto_4

    .line 1993
    :cond_5
    aget v1, v1, v4

    ushr-int/2addr v1, p1

    if-eqz v1, :cond_7

    sub-int v5, v2, v0

    .line 1995
    new-array v5, v5, [I

    .line 1996
    aput v1, v5, v4

    sget-boolean v1, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v1, :cond_6

    goto :goto_3

    :cond_6
    const/4 v1, 0x1

    move-object v1, v5

    const/4 v5, 0x1

    goto :goto_0

    :cond_7
    sub-int v1, v2, v0

    sub-int/2addr v1, v3

    .line 1998
    new-array v1, v1, [I

    const/4 v5, 0x0

    :goto_0
    rsub-int/lit8 v6, p1, 0x20

    const/4 v7, 0x0

    :goto_1
    sub-int v8, v2, v0

    sub-int/2addr v8, v3

    if-ge v7, v8, :cond_f

    add-int/lit8 v8, v5, 0x1

    .line 2004
    iget-object v9, p0, Ll/ܿۗ᩻;->ᩳ:[I

    .line 1482
    sget v10, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v10, :cond_8

    goto :goto_2

    :cond_8
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result v10

    if-nez v10, :cond_9

    goto/16 :goto_8

    :cond_9
    add-int/lit8 v10, v7, 0x1

    .line 2004
    aget v7, v9, v7

    .line 1596
    sget v11, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v11, :cond_a

    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result p1

    if-eqz p1, :cond_b

    goto :goto_9

    :cond_a
    shl-int/2addr v7, v6

    .line 2004
    aget v9, v9, v10

    ushr-int/2addr v9, p1

    .line 1028
    sget v11, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v11, :cond_e

    :cond_b
    :goto_2
    sget p1, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz p1, :cond_c

    goto/16 :goto_d

    .line 416
    :cond_c
    sget p1, Ll/֫᩵;->ܶ᩻᩷:I

    if-lez p1, :cond_d

    goto :goto_7

    .line 1372
    :cond_d
    :goto_3
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    move-result p1

    if-eqz p1, :cond_12

    goto :goto_a

    :cond_e
    or-int/2addr v7, v9

    .line 2004
    aput v7, v1, v5

    move v5, v8

    move v7, v10

    goto :goto_1

    .line 2007
    :cond_f
    :goto_4
    iget v5, p0, Ll/ܿۗ᩻;->ܿ:I

    if-gez v5, :cond_1c

    add-int/lit8 v5, v2, -0x1

    sub-int/2addr v2, v0

    const/4 v0, 0x0

    :goto_5
    if-lt v5, v2, :cond_11

    if-nez v0, :cond_11

    .line 2011
    iget-object v0, p0, Ll/ܿۗ᩻;->ᩳ:[I

    aget v0, v0, v5

    if-eqz v0, :cond_10

    const/4 v0, 0x1

    goto :goto_6

    :cond_10
    const/4 v0, 0x0

    :goto_6
    add-int/lit8 v5, v5, -0x1

    goto :goto_5

    :cond_11
    if-nez v0, :cond_18

    if-eqz p1, :cond_18

    .line 2013
    iget-object v0, p0, Ll/ܿۗ᩻;->ᩳ:[I

    sub-int/2addr v2, v3

    aget v0, v0, v2

    .line 44
    sget v2, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v2, :cond_16

    .line 1768
    :cond_12
    :goto_7
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result p1

    if-lez p1, :cond_13

    goto :goto_d

    .line 134
    :cond_13
    :goto_8
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result p1

    if-eqz p1, :cond_14

    goto :goto_e

    .line 713
    :cond_14
    :goto_9
    sget p1, Ll/֨᩺;->ۨ֨۬:I

    if-lez p1, :cond_15

    goto :goto_e

    .line 1573
    :cond_15
    :goto_a
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    move-result p1

    if-nez p1, :cond_19

    goto :goto_e

    :cond_16
    rsub-int/lit8 p1, p1, 0x20

    shl-int p1, v0, p1

    if-eqz p1, :cond_17

    const/4 v0, 0x1

    goto :goto_b

    :cond_17
    const/4 v0, 0x0

    :cond_18
    :goto_b
    if-eqz v0, :cond_1c

    .line 2024
    array-length p1, v1

    sub-int/2addr p1, v3

    const/4 v0, 0x0

    :goto_c
    if-ltz p1, :cond_1b

    if-nez v0, :cond_1b

    .line 2025
    aget v0, v1, p1

    add-int/2addr v0, v3

    aput v0, v1, p1

    .line 934
    sget v2, Ll/᩺;->ۙۛܶ:I

    if-gtz v2, :cond_1a

    .line 1800
    :cond_19
    :goto_d
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    .line 773
    :goto_e
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    const/4 p1, 0x0

    return-object p1

    :cond_1a
    add-int/lit8 p1, p1, -0x1

    goto :goto_c

    :cond_1b
    if-nez v0, :cond_1c

    .line 2027
    array-length p1, v1

    add-int/2addr p1, v3

    new-array v1, p1, [I

    .line 2028
    aput v3, v1, v4

    .line 2019
    :cond_1c
    new-instance p1, Ll/ᩳۗ᩻;

    iget v0, p0, Ll/ܿۗ᩻;->ܿ:I

    invoke-direct {p1, v1, v0}, Ll/ᩳۗ᩻;-><init>([II)V

    return-object p1
.end method

.method public static ۧ(I[I[I)I
    .locals 10

    sget v0, Ll/֡֡;->֫ۤܳ:I

    if-ltz v0, :cond_0

    goto :goto_3

    :cond_0
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    move-result v0

    if-gtz v0, :cond_1

    goto :goto_5

    .line 293
    :cond_1
    sget-boolean v0, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v0, :cond_2

    goto :goto_2

    .line 25
    :cond_2
    sget v0, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v0, :cond_3

    goto :goto_4

    .line 1546
    :cond_3
    sget v0, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v0, :cond_4

    goto :goto_2

    .line 1460
    :cond_4
    sget v0, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v0, :cond_5

    goto :goto_3

    :cond_5
    const-wide/16 v0, 0x0

    :goto_0
    add-int/lit8 p0, p0, -0x1

    const/16 v2, 0x20

    if-ltz p0, :cond_d

    .line 1715
    aget v3, p1, p0

    int-to-long v3, v3

    const-wide v5, 0xffffffffL

    sget-boolean v7, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v7, :cond_6

    goto :goto_1

    :cond_6
    and-long/2addr v3, v5

    .line 1195
    sget v7, Ll/᩺;->ۙۛܶ:I

    if-gtz v7, :cond_7

    goto :goto_4

    .line 1715
    :cond_7
    aget v7, p2, p0

    int-to-long v7, v7

    .line 658
    sget v9, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v9, :cond_8

    :goto_1
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    move-result p0

    if-nez p0, :cond_9

    goto :goto_5

    :cond_8
    and-long/2addr v5, v7

    sub-long/2addr v3, v5

    shr-long/2addr v0, v2

    .line 916
    sget v2, Ll/᩹;->ۤܿܳ:I

    if-eqz v2, :cond_c

    .line 1540
    :cond_9
    :goto_2
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    sget-boolean p0, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-eqz p0, :cond_a

    goto :goto_5

    :cond_a
    :goto_3
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    move-result p0

    if-eqz p0, :cond_b

    goto :goto_5

    :cond_b
    :goto_4
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    .line 280
    :goto_5
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    const/4 p0, 0x0

    return p0

    :cond_c
    add-long/2addr v0, v3

    long-to-int v2, v0

    .line 1717
    aput v2, p1, p0

    goto :goto_0

    :cond_d
    shr-long p0, v0, v2

    long-to-int p1, p0

    return p1
.end method

.method private native ۧ(Ll/ᩳۗ᩻;Ll/ᩳۗ᩻;)Ll/ᩳۗ᩻;
.end method

.method public static ۧ(II[I)V
    .locals 6

    .line 388
    sget v0, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v0, :cond_0

    goto :goto_2

    :cond_0
    sget v0, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v0, :cond_1

    goto :goto_2

    :cond_1
    sget v0, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v0, :cond_2

    goto :goto_3

    .line 721
    :cond_2
    sget v0, Ll/۠;->ܺܺܶ:I

    if-ltz v0, :cond_3

    goto :goto_1

    .line 406
    :cond_3
    sget v0, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v0, :cond_4

    goto :goto_2

    :cond_4
    if-eqz p0, :cond_f

    if-nez p1, :cond_5

    goto :goto_5

    :cond_5
    rsub-int/lit8 v0, p1, 0x20

    .line 392
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_1

    :cond_6
    const/4 v1, 0x0

    .line 461
    sget v2, Ll/ۛ;->᩺᩻֫:I

    if-ltz v2, :cond_7

    goto :goto_4

    .line 1182
    :cond_7
    aget v2, p2, v1

    add-int/lit8 p0, p0, -0x1

    :goto_0
    if-ge v1, p0, :cond_e

    add-int/lit8 v3, v1, 0x1

    .line 654
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    move-result v4

    if-ltz v4, :cond_8

    goto :goto_3

    .line 1184
    :cond_8
    aget v4, p2, v3

    .line 985
    sget v5, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v5, :cond_9

    goto :goto_3

    :cond_9
    shl-int/2addr v2, p1

    .line 1025
    sget v5, Ll/۟;->ۗۤۛ:I

    if-eqz v5, :cond_d

    :goto_1
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    sget p0, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz p0, :cond_a

    goto :goto_3

    .line 722
    :cond_a
    :goto_2
    sget p0, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz p0, :cond_b

    goto :goto_4

    .line 839
    :cond_b
    :goto_3
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result p0

    if-gtz p0, :cond_c

    goto :goto_4

    :cond_c
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    .line 734
    :goto_4
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    return-void

    :cond_d
    ushr-int v5, v4, v0

    or-int/2addr v2, v5

    .line 1185
    aput v2, p2, v1

    move v1, v3

    move v2, v4

    goto :goto_0

    .line 1187
    :cond_e
    aget v0, p2, p0

    shl-int p1, v0, p1

    aput p1, p2, p0

    :cond_f
    :goto_5
    return-void
.end method

.method public static ۧ(I[I)[I
    .locals 9

    .line 699
    sget v0, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v0, :cond_0

    goto/16 :goto_4

    :cond_0
    sget-boolean v0, Ll/֨۫;->۬᩷᩶:Z

    if-nez v0, :cond_1

    goto :goto_3

    :cond_1
    ushr-int/lit8 v0, p0, 0x5

    .line 1928
    sget-boolean v1, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v1, :cond_2

    goto :goto_3

    :cond_2
    and-int/lit8 p0, p0, 0x1f

    .line 505
    sget v1, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v1, :cond_3

    goto :goto_4

    .line 1922
    :cond_3
    array-length v1, p1

    const/4 v2, 0x0

    if-nez p0, :cond_4

    add-int/2addr v0, v1

    .line 1926
    new-array p0, v0, [I

    .line 1927
    invoke-static {p1, v2, p0, v2, v1}, Ll/ۗ᩷;->ۢۚܺ(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p0

    :cond_4
    rsub-int/lit8 v3, p0, 0x20

    .line 1671
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_4

    .line 1931
    :cond_5
    aget v4, p1, v2

    ushr-int/2addr v4, v3

    if-eqz v4, :cond_8

    add-int/2addr v0, v1

    .line 1040
    sget v5, Ll/᩹;->ۤܿܳ:I

    if-eqz v5, :cond_6

    goto :goto_5

    :cond_6
    add-int/lit8 v0, v0, 0x1

    .line 156
    sget v5, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v5, :cond_7

    goto :goto_2

    .line 1933
    :cond_7
    new-array v0, v0, [I

    .line 1934
    aput v4, v0, v2

    const/4 v4, 0x1

    goto :goto_0

    :cond_8
    add-int/2addr v0, v1

    .line 1936
    new-array v0, v0, [I

    const/4 v4, 0x0

    :goto_0
    add-int/lit8 v5, v1, -0x1

    if-ge v2, v5, :cond_f

    add-int/lit8 v5, v4, 0x1

    sget v6, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v6, :cond_9

    goto :goto_1

    :cond_9
    add-int/lit8 v6, v2, 0x1

    .line 1940
    aget v2, p1, v2

    .line 1786
    sget v7, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v7, :cond_c

    .line 874
    :goto_1
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result p0

    if-eqz p0, :cond_a

    goto :goto_4

    :cond_a
    :goto_2
    sget p0, Ll/ۛ;->᩺᩻֫:I

    if-gez p0, :cond_b

    goto :goto_4

    .line 1647
    :cond_b
    :goto_3
    sget p0, Ll/֡᩶;->ܳܶ۠:I

    if-gtz p0, :cond_d

    goto :goto_5

    :cond_c
    shl-int/2addr v2, p0

    .line 1940
    aget v7, p1, v6

    ushr-int/2addr v7, v3

    .line 1085
    sget-boolean v8, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v8, :cond_e

    .line 1414
    :cond_d
    :goto_4
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    .line 360
    :goto_5
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    const/4 p0, 0x0

    return-object p0

    :cond_e
    or-int/2addr v2, v7

    .line 1940
    aput v2, v0, v4

    move v4, v5

    move v2, v6

    goto :goto_0

    .line 1941
    :cond_f
    aget p1, p1, v2

    shl-int p0, p1, p0

    aput p0, v0, v4

    return-object v0
.end method

.method public static ۧ([I[I)[I
    .locals 14

    sget-boolean v0, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v0, :cond_0

    goto :goto_2

    .line 411
    :cond_0
    array-length v0, p0

    .line 100
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_2

    .line 412
    :cond_1
    new-array v1, v0, [I

    .line 413
    array-length v2, p1

    const-wide/16 v3, 0x0

    move-wide v5, v3

    :goto_0
    const/16 v7, 0x20

    if-lez v2, :cond_b

    add-int/lit8 v0, v0, -0x1

    .line 79
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    move-result v8

    if-nez v8, :cond_2

    goto/16 :goto_6

    .line 418
    :cond_2
    aget v8, p0, v0

    .line 155
    sget-boolean v9, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v9, :cond_3

    goto :goto_5

    :cond_3
    int-to-long v8, v8

    const-wide v10, 0xffffffffL

    .line 94
    sget-boolean v12, Ll/֨۫;->۬᩷᩶:Z

    if-nez v12, :cond_4

    goto :goto_6

    :cond_4
    and-long/2addr v8, v10

    .line 219
    sget v12, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v12, :cond_5

    goto :goto_2

    :cond_5
    add-int/lit8 v2, v2, -0x1

    .line 175
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v12

    if-nez v12, :cond_6

    goto :goto_1

    .line 418
    :cond_6
    aget v12, p1, v2

    int-to-long v12, v12

    and-long/2addr v10, v12

    sget v12, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v12, :cond_9

    .line 183
    :goto_1
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    sget p0, Ll/ۗۚ;->ܶۛᩴ:I

    if-gez p0, :cond_7

    goto :goto_3

    .line 120
    :cond_7
    :goto_2
    sget p0, Ll/֡۬;->۠֡᩶:I

    if-gtz p0, :cond_8

    goto :goto_6

    :cond_8
    :goto_3
    sget p0, Ll/᩹;->ۤܿܳ:I

    if-eqz p0, :cond_d

    goto :goto_6

    :cond_9
    sub-long/2addr v8, v10

    .line 153
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    move-result v10

    if-ltz v10, :cond_a

    goto :goto_7

    :cond_a
    shr-long/2addr v5, v7

    add-long/2addr v5, v8

    long-to-int v7, v5

    .line 421
    aput v7, v1, v0

    goto :goto_0

    :cond_b
    shr-long/2addr v5, v7

    const/4 p1, 0x1

    cmp-long v2, v5, v3

    if-eqz v2, :cond_c

    goto :goto_8

    :cond_c
    const/4 v2, 0x0

    :goto_4
    if-lez v0, :cond_10

    if-eqz v2, :cond_10

    add-int/lit8 v0, v0, -0x1

    .line 427
    aget v2, p0, v0

    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    move-result v3

    if-eqz v3, :cond_f

    .line 67
    :cond_d
    :goto_5
    sget p0, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz p0, :cond_e

    goto :goto_7

    .line 105
    :cond_e
    :goto_6
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    :goto_7
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    const/4 p0, 0x0

    return-object p0

    :cond_f
    sub-int/2addr v2, p1

    .line 427
    aput v2, v1, v0

    const/4 v3, -0x1

    if-ne v2, v3, :cond_c

    :goto_8
    const/4 v2, 0x1

    goto :goto_4

    :cond_10
    :goto_9
    if-lez v0, :cond_11

    add-int/lit8 v0, v0, -0x1

    .line 431
    aget p1, p0, v0

    aput p1, v1, v0

    goto :goto_9

    :cond_11
    return-object v1
.end method

.method public static native ۧ([I[IIJ[I)[I
.end method

.method public static native ۧ([I[I[IIJ[I)[I
.end method

.method private ᩷(I)Ll/ᩳۗ᩻;
    .locals 9

    .line 123
    invoke-super {p0}, Ll/ܿۗ᩻;->֫()I

    move-result v0

    if-gt v0, p1, :cond_0

    return-object p0

    :cond_0
    add-int/lit8 v0, p1, 0x1f

    .line 1607
    sget v1, Ll/᩺;->ۙۛܶ:I

    if-gtz v1, :cond_1

    goto/16 :goto_3

    .line 635
    :cond_1
    sget v1, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v1, :cond_2

    goto :goto_3

    :cond_2
    ushr-int/lit8 v0, v0, 0x5

    .line 107
    sget-boolean v1, Ll/֨۫;->۬᩷᩶:Z

    if-nez v1, :cond_3

    goto :goto_0

    .line 1842
    :cond_3
    new-array v1, v0, [I

    .line 1843
    iget-object v2, p0, Ll/ܿۗ᩻;->ᩳ:[I

    array-length v3, v2

    .line 1425
    sget-boolean v4, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v4, :cond_4

    goto :goto_2

    :cond_4
    sub-int/2addr v3, v0

    const/4 v4, 0x0

    .line 1843
    invoke-static {v2, v3, v1, v4, v0}, Ll/֫᩵;->ܳ۟ۖ(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1531
    sget v2, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v2, :cond_5

    goto :goto_1

    :cond_5
    shl-int/lit8 v0, v0, 0x5

    sget v2, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v2, :cond_6

    .line 204
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    sget p1, Ll/ۘܿ;->ۘܰ۫:I

    if-gez p1, :cond_9

    goto :goto_3

    :cond_6
    sub-int/2addr v0, p1

    .line 1847
    aget p1, v1, v4

    int-to-long v2, p1

    .line 720
    sget-boolean p1, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez p1, :cond_7

    goto :goto_1

    :cond_7
    sget p1, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz p1, :cond_8

    goto :goto_3

    :cond_8
    rsub-int/lit8 p1, v0, 0x20

    const-wide/16 v5, 0x1

    .line 648
    sget v0, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v0, :cond_c

    :cond_9
    :goto_0
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    sget p1, Ll/֡ᩴ;->ܳۤ֫:I

    if-gez p1, :cond_a

    goto :goto_2

    .line 347
    :cond_a
    :goto_1
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    sget p1, Ll/֫᩵;->ܶ᩻᩷:I

    if-lez p1, :cond_b

    goto :goto_3

    .line 869
    :cond_b
    :goto_2
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    goto :goto_3

    :cond_c
    shl-long v7, v5, p1

    sub-long/2addr v7, v5

    and-long/2addr v2, v7

    .line 919
    sget p1, Ll/۟;->ۗۤۛ:I

    if-eqz p1, :cond_d

    .line 505
    :goto_3
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    const/4 p1, 0x0

    return-object p1

    :cond_d
    long-to-int p1, v2

    .line 1847
    aput p1, v1, v4

    const/4 v0, 0x1

    if-nez p1, :cond_e

    .line 1849
    new-instance p1, Ll/ᩳۗ᩻;

    invoke-direct {p1, v0, v1}, Ll/ᩳۗ᩻;-><init>(I[I)V

    return-object p1

    :cond_e
    new-instance p1, Ll/ᩳۗ᩻;

    invoke-direct {p1, v1, v0}, Ll/ᩳۗ᩻;-><init>([II)V

    return-object p1
.end method

.method private ᩻(I)Ll/ᩳۗ᩻;
    .locals 5

    sget v0, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v0, :cond_0

    goto :goto_1

    .line 213
    :cond_0
    sget v0, Ll/ۛ;->᩺᩻֫:I

    if-ltz v0, :cond_1

    goto :goto_2

    :cond_1
    sget-boolean v0, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v0, :cond_2

    goto :goto_4

    .line 806
    :cond_2
    sget v0, Ll/֡۬;->۠֡᩶:I

    if-gtz v0, :cond_3

    goto :goto_3

    .line 836
    :cond_3
    sget v0, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v0, :cond_4

    goto :goto_2

    :cond_4
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_0

    .line 829
    :cond_5
    iget-object v0, p0, Ll/ܿۗ᩻;->ᩳ:[I

    array-length v1, v0

    if-gt v1, p1, :cond_7

    .line 1207
    iget p1, p0, Ll/ܿۗ᩻;->ܿ:I

    if-ltz p1, :cond_6

    return-object p0

    :cond_6
    invoke-virtual {p0}, Ll/ᩳۗ᩻;->ܳ()Ll/ᩳۗ᩻;

    move-result-object p1

    return-object p1

    .line 835
    :cond_7
    new-array v2, p1, [I

    sub-int/2addr v1, p1

    .line 927
    sget v3, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v3, :cond_8

    goto :goto_0

    :cond_8
    const/4 v3, 0x0

    sget v4, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v4, :cond_9

    goto :goto_3

    .line 836
    :cond_9
    invoke-static {v0, v1, v2, v3, p1}, Ll/֫᩵;->ܳ۟ۖ(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 299
    sget-boolean p1, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz p1, :cond_a

    .line 586
    :goto_0
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result p1

    if-lez p1, :cond_b

    goto :goto_3

    .line 838
    :cond_a
    new-instance p1, Ll/ᩳۗ᩻;

    invoke-static {v2}, Ll/ᩳۗ᩻;->֫([I)[I

    move-result-object v0

    .line 848
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v1

    if-eqz v1, :cond_e

    .line 63
    :cond_b
    :goto_1
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    sget-boolean p1, Ll/֨֫;->᩺ܺ᩸:Z

    if-nez p1, :cond_c

    goto :goto_4

    .line 602
    :cond_c
    :goto_2
    sget p1, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz p1, :cond_d

    goto :goto_4

    :cond_d
    :goto_3
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    .line 1065
    :goto_4
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    const/4 p1, 0x0

    return-object p1

    :cond_e
    const/4 v1, 0x1

    .line 838
    invoke-direct {p1, v0, v1}, Ll/ᩳۗ᩻;-><init>([II)V

    return-object p1
.end method


# virtual methods
.method public final ֫(Ll/ᩳۗ᩻;)Ll/ᩳۗ᩻;
    .locals 3

    sget v0, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v0, :cond_0

    goto :goto_3

    .line 74
    :cond_0
    sget v0, Ll/۠;->ܺܺܶ:I

    if-ltz v0, :cond_1

    goto :goto_3

    .line 146
    :cond_1
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_4

    .line 250
    :cond_3
    sget v0, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v0, :cond_4

    goto :goto_1

    :cond_4
    sget v0, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v0, :cond_5

    goto :goto_3

    .line 14
    :cond_5
    sget-boolean v0, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v0, :cond_6

    goto :goto_2

    :cond_6
    sget v0, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v0, :cond_7

    goto :goto_1

    .line 317
    :cond_7
    iget v0, p1, Ll/ܿۗ᩻;->ܿ:I

    if-nez v0, :cond_8

    return-object p0

    .line 319
    :cond_8
    iget v1, p0, Ll/ܿۗ᩻;->ܿ:I

    if-nez v1, :cond_9

    return-object p1

    :cond_9
    if-ne v0, v1, :cond_f

    .line 322
    new-instance v0, Ll/ᩳۗ᩻;

    iget-object v1, p0, Ll/ܿۗ᩻;->ᩳ:[I

    sget v2, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v2, :cond_a

    goto :goto_0

    :cond_a
    iget-object p1, p1, Ll/ܿۗ᩻;->ᩳ:[I

    .line 198
    sget-boolean v2, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v2, :cond_e

    :goto_0
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    sget p1, Ll/֡۬;->۠֡᩶:I

    if-lez p1, :cond_b

    goto :goto_3

    .line 286
    :cond_b
    :goto_1
    sget p1, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-nez p1, :cond_c

    goto :goto_3

    :cond_c
    :goto_2
    sget p1, Ll/ۗۗ;->ۨ۬ۖ:I

    if-gez p1, :cond_d

    goto :goto_4

    .line 194
    :cond_d
    :goto_3
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    :goto_4
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    const/4 p1, 0x0

    return-object p1

    .line 322
    :cond_e
    invoke-static {v1, p1}, Ll/ᩳۗ᩻;->֫([I[I)[I

    move-result-object p1

    iget v1, p0, Ll/ܿۗ᩻;->ܿ:I

    invoke-direct {v0, p1, v1}, Ll/ᩳۗ᩻;-><init>([II)V

    return-object v0

    .line 324
    :cond_f
    invoke-virtual {p0, p1}, Ll/ᩳۗ᩻;->ۧ(Ll/ᩳۗ᩻;)I

    move-result v0

    if-nez v0, :cond_10

    .line 326
    sget-object p1, Ll/ܳۗ᩻;->ۡ:Ll/ᩳۗ᩻;

    return-object p1

    :cond_10
    if-lez v0, :cond_11

    .line 327
    iget-object v1, p0, Ll/ܿۗ᩻;->ᩳ:[I

    iget-object p1, p1, Ll/ܿۗ᩻;->ᩳ:[I

    invoke-static {v1, p1}, Ll/ᩳۗ᩻;->ۧ([I[I)[I

    move-result-object p1

    goto :goto_5

    .line 328
    :cond_11
    iget-object p1, p1, Ll/ܿۗ᩻;->ᩳ:[I

    iget-object v1, p0, Ll/ܿۗ᩻;->ᩳ:[I

    invoke-static {p1, v1}, Ll/ᩳۗ᩻;->ۧ([I[I)[I

    move-result-object p1

    .line 329
    :goto_5
    invoke-static {p1}, Ll/ᩳۗ᩻;->֫([I)[I

    move-result-object p1

    .line 331
    new-instance v1, Ll/ᩳۗ᩻;

    iget v2, p0, Ll/ܿۗ᩻;->ܿ:I

    if-ne v0, v2, :cond_12

    const/4 v0, 0x1

    goto :goto_6

    :cond_12
    const/4 v0, -0x1

    :goto_6
    invoke-direct {v1, p1, v0}, Ll/ᩳۗ᩻;-><init>([II)V

    return-object v1
.end method

.method public native ֫(Ll/ᩳۗ᩻;Ll/ᩳۗ᩻;)Ll/ᩳۗ᩻;
.end method

.method public bridge native synthetic ֫(Ll/ܿۗ᩻;)Z
.end method

.method public native ۜ()Ll/ᩳۗ᩻;
.end method

.method public final ۜ(Ll/ᩳۗ᩻;)Ll/ᩳۗ᩻;
    .locals 1

    const/4 v0, 0x0

    .line 445
    invoke-direct {p0, p1, v0}, Ll/ᩳۗ᩻;->֫(Ll/ᩳۗ᩻;Z)Ll/ᩳۗ᩻;

    move-result-object p1

    return-object p1
.end method

.method public native ۢ()Ll/ᩳۗ᩻;
.end method

.method public final ۢ(Ll/ᩳۗ᩻;)Ll/ᩳۗ᩻;
    .locals 12

    .line 315
    sget v0, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v0, :cond_0

    goto :goto_0

    .line 123
    :cond_0
    invoke-super {p0}, Ll/ܿۗ᩻;->֫()I

    move-result v0

    .line 30
    sget v1, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v1, :cond_1

    goto :goto_0

    :cond_1
    ushr-int/lit8 v0, v0, 0x5

    sget v1, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x1

    add-int/2addr v0, v1

    .line 123
    invoke-super {p1}, Ll/ܿۗ᩻;->֫()I

    move-result v2

    .line 136
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    move-result v3

    if-ltz v3, :cond_3

    goto :goto_0

    :cond_3
    ushr-int/lit8 v2, v2, 0x5

    add-int/2addr v2, v1

    .line 1234
    sget v3, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v3, :cond_7

    :goto_0
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result p1

    if-eqz p1, :cond_4

    goto/16 :goto_8

    .line 737
    :cond_4
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    move-result p1

    if-gtz p1, :cond_5

    goto/16 :goto_6

    .line 1981
    :cond_5
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    sget-boolean p1, Ll/֨۫;->۬᩷᩶:Z

    if-eqz p1, :cond_6

    goto/16 :goto_7

    .line 1877
    :cond_6
    :goto_1
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    move-result p1

    if-gez p1, :cond_10

    goto/16 :goto_a

    .line 1818
    :cond_7
    invoke-static {v0, v2}, Ll/ۘۨ;->᩺۬֨(II)I

    move-result v0

    .line 560
    sget v2, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v2, :cond_8

    goto/16 :goto_7

    .line 1818
    :cond_8
    new-array v2, v0, [I

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v0, :cond_b

    sub-int v5, v0, v4

    sub-int/2addr v5, v1

    .line 1820
    invoke-virtual {p0, v5}, Ll/ܿۗ᩻;->֫(I)I

    move-result v6

    sget v7, Ll/᩺;->ۙۛܶ:I

    if-gtz v7, :cond_9

    goto :goto_7

    .line 1821
    :cond_9
    invoke-virtual {p1, v5}, Ll/ܿۗ᩻;->֫(I)I

    move-result v5

    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v7

    if-gtz v7, :cond_a

    goto/16 :goto_9

    :cond_a
    xor-int/2addr v5, v6

    aput v5, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 1822
    :cond_b
    aget p1, v2, v3

    if-lez p1, :cond_c

    .line 1823
    new-instance p1, Ll/ᩳۗ᩻;

    invoke-direct {p1, v2, v1}, Ll/ᩳۗ᩻;-><init>([II)V

    return-object p1

    :cond_c
    if-gez p1, :cond_19

    .line 1825
    new-instance p1, Ll/ᩳۗ᩻;

    const/4 v4, 0x0

    :goto_3
    const/4 v5, -0x1

    if-ge v4, v0, :cond_d

    .line 2222
    aget v6, v2, v4

    if-ne v6, v5, :cond_d

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_d
    move v6, v4

    :goto_4
    if-ge v6, v0, :cond_e

    .line 2227
    aget v7, v2, v6

    if-nez v7, :cond_e

    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_e
    if-ne v6, v0, :cond_f

    const/4 v3, 0x1

    :cond_f
    sub-int v6, v0, v4

    add-int/2addr v6, v3

    .line 2230
    new-array v7, v6, [I

    move v8, v4

    :goto_5
    if-ge v8, v0, :cond_17

    sub-int v9, v8, v4

    add-int/2addr v9, v3

    .line 2235
    aget v10, v2, v8

    sget-boolean v11, Ll/֨۫;->۬᩷᩶:Z

    if-nez v11, :cond_14

    .line 235
    :cond_10
    :goto_6
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result p1

    if-gez p1, :cond_11

    goto :goto_8

    :cond_11
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    sget-boolean p1, Ll/ۘ᩶;->ܶۗۡ:Z

    if-eqz p1, :cond_12

    goto :goto_8

    .line 118
    :cond_12
    :goto_7
    sget-boolean p1, Ll/֫᩺;->֫ܰۨ:Z

    if-nez p1, :cond_13

    goto :goto_9

    .line 1044
    :cond_13
    :goto_8
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    sget-boolean p1, Ll/֡ۨ;->ܽܶۖ:Z

    if-eqz p1, :cond_15

    goto :goto_a

    :cond_14
    not-int v10, v10

    .line 1910
    sget v11, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v11, :cond_16

    .line 1494
    :cond_15
    :goto_9
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    .line 1681
    :goto_a
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    const/4 p1, 0x0

    return-object p1

    .line 2235
    :cond_16
    aput v10, v7, v9

    add-int/lit8 v8, v8, 0x1

    goto :goto_5

    :cond_17
    sub-int/2addr v6, v1

    .line 2238
    :goto_b
    aget v0, v7, v6

    add-int/2addr v0, v1

    aput v0, v7, v6

    if-nez v0, :cond_18

    add-int/lit8 v6, v6, -0x1

    goto :goto_b

    .line 1825
    :cond_18
    invoke-direct {p1, v7, v5}, Ll/ᩳۗ᩻;-><init>([II)V

    return-object p1

    .line 1827
    :cond_19
    invoke-static {v2}, Ll/ᩳۗ᩻;->֫([I)[I

    move-result-object p1

    .line 1828
    new-instance v0, Ll/ᩳۗ᩻;

    array-length v2, p1

    if-nez v2, :cond_1a

    const/4 v1, 0x0

    :cond_1a
    invoke-direct {v0, p1, v1}, Ll/ᩳۗ᩻;-><init>([II)V

    return-object v0
.end method

.method public final ۧ(Ll/ᩳۗ᩻;)I
    .locals 9

    .line 541
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    move-result v0

    if-gtz v0, :cond_0

    goto :goto_2

    .line 301
    :cond_0
    sget v0, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v0, :cond_1

    goto/16 :goto_5

    .line 383
    :cond_1
    sget v0, Ll/۠;->ܺܺܶ:I

    if-ltz v0, :cond_2

    goto :goto_0

    .line 1155
    :cond_2
    sget v0, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v0, :cond_3

    goto :goto_3

    .line 1676
    :cond_3
    sget-boolean v0, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_4

    .line 2103
    :cond_5
    iget-object v0, p0, Ll/ܿۗ᩻;->ᩳ:[I

    sget-boolean v1, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v1, :cond_6

    goto :goto_5

    .line 2104
    :cond_6
    array-length v1, v0

    .line 1738
    sget v2, Ll/֡۬;->۠֡᩶:I

    if-gtz v2, :cond_7

    :goto_0
    sget p1, Ll/۠;->ܺܺܶ:I

    if-ltz p1, :cond_b

    goto :goto_4

    .line 2105
    :cond_7
    iget-object p1, p1, Ll/ܿۗ᩻;->ᩳ:[I

    .line 2106
    array-length v2, p1

    const/4 v3, -0x1

    if-ge v1, v2, :cond_8

    return v3

    :cond_8
    const/4 v4, 0x1

    if-le v1, v2, :cond_9

    return v4

    :cond_9
    const/4 v2, 0x0

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v1, :cond_11

    .line 2112
    aget v6, v0, v5

    .line 2113
    aget v7, p1, v5

    if-eq v6, v7, :cond_10

    int-to-long v0, v6

    const-wide v5, 0xffffffffL

    sget p1, Ll/֨᩺;->ۨ֨۬:I

    if-gtz p1, :cond_a

    goto :goto_4

    :cond_a
    and-long/2addr v0, v5

    .line 1418
    sget p1, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz p1, :cond_e

    :cond_b
    :goto_2
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    sget p1, Ll/֨۟;->᩹֫᩷:I

    if-nez p1, :cond_c

    goto :goto_4

    .line 852
    :cond_c
    :goto_3
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    move-result p1

    if-eqz p1, :cond_d

    goto :goto_5

    :cond_d
    :goto_4
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    :goto_5
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    const/4 p1, 0x0

    return p1

    :cond_e
    int-to-long v7, v7

    and-long/2addr v5, v7

    cmp-long p1, v0, v5

    if-gez p1, :cond_f

    return v3

    :cond_f
    return v4

    :cond_10
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_11
    return v2
.end method

.method public final ܳ()Ll/ᩳۗ᩻;
    .locals 3

    .line 1216
    new-instance v0, Ll/ᩳۗ᩻;

    sget-boolean v1, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v1, :cond_0

    goto :goto_4

    .line 397
    :cond_0
    sget v1, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v1, :cond_1

    goto :goto_1

    .line 979
    :cond_1
    sget v1, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v1, :cond_2

    goto :goto_4

    :cond_2
    sget-boolean v1, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    sget v1, Ll/֡֡;->֫ۤܳ:I

    if-ltz v1, :cond_4

    goto :goto_1

    .line 533
    :cond_4
    sget v1, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v1, :cond_5

    goto :goto_3

    .line 842
    :cond_5
    sget v1, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v1, :cond_6

    goto :goto_4

    .line 1066
    :cond_6
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    move-result v1

    if-ltz v1, :cond_7

    goto :goto_4

    :cond_7
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    move-result v1

    if-ltz v1, :cond_8

    goto :goto_0

    .line 1216
    :cond_8
    iget-object v1, p0, Ll/ܿۗ᩻;->ᩳ:[I

    .line 348
    sget v2, Ll/۟;->ۗۤۛ:I

    if-eqz v2, :cond_c

    .line 425
    :goto_0
    sget v0, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v0, :cond_9

    goto :goto_2

    .line 71
    :cond_9
    :goto_1
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    sget-boolean v0, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v0, :cond_a

    goto :goto_3

    .line 70
    :cond_a
    :goto_2
    sget v0, Ll/ۛ;->᩺᩻֫:I

    if-gez v0, :cond_b

    goto :goto_4

    .line 1120
    :cond_b
    :goto_3
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    .line 1208
    :goto_4
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    const/4 v0, 0x0

    return-object v0

    .line 1216
    :cond_c
    iget v2, p0, Ll/ܿۗ᩻;->ܿ:I

    neg-int v2, v2

    invoke-direct {v0, v1, v2}, Ll/ᩳۗ᩻;-><init>([II)V

    return-object v0
.end method

.method public final ܳ(Ll/ᩳۗ᩻;)Ll/ᩳۗ᩻;
    .locals 5

    .line 1232
    iget v0, p1, Ll/ܿۗ᩻;->ܿ:I

    if-lez v0, :cond_12

    .line 1086
    iget-object v0, p1, Ll/ܿۗ᩻;->ᩳ:[I

    array-length v1, v0

    const/16 v2, 0x50

    if-lt v1, v2, :cond_8

    iget-object v1, p0, Ll/ܿۗ᩻;->ᩳ:[I

    array-length v1, v1

    array-length v0, v0

    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    move-result v2

    if-ltz v2, :cond_0

    goto/16 :goto_5

    :cond_0
    sub-int/2addr v1, v0

    const/16 v0, 0x28

    if-ge v1, v0, :cond_1

    goto :goto_2

    .line 1123
    :cond_1
    new-instance v0, Ll/ܺۗ᩻;

    invoke-direct {v0}, Ll/ܺۗ᩻;-><init>()V

    .line 1124
    new-instance v1, Ll/ܺۗ᩻;

    .line 502
    sget-boolean v2, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v2, :cond_2

    goto/16 :goto_4

    .line 1124
    :cond_2
    invoke-direct {v1, p0}, Ll/ܺۗ᩻;-><init>(Ll/ᩳۗ᩻;)V

    .line 720
    sget v2, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v2, :cond_3

    goto/16 :goto_3

    .line 1124
    :cond_3
    new-instance v2, Ll/ܺۗ᩻;

    invoke-direct {v2, p1}, Ll/ܺۗ᩻;-><init>(Ll/ᩳۗ᩻;)V

    invoke-virtual {v1, v2, v0}, Ll/ܺۗ᩻;->ۧ(Ll/ܺۗ᩻;Ll/ܺۗ᩻;)Ll/ܺۗ᩻;

    move-result-object v1

    .line 1125
    invoke-virtual {v0}, Ll/ܺۗ᩻;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_4

    sget-object v0, Ll/ܳۗ᩻;->ۡ:Ll/ᩳۗ᩻;

    goto :goto_0

    :cond_4
    iget v2, p0, Ll/ܿۗ᩻;->ܿ:I

    iget v3, p1, Ll/ܿۗ᩻;->ܿ:I

    mul-int v2, v2, v3

    invoke-virtual {v0, v2}, Ll/ܺۗ᩻;->ᩳ(I)Ll/ᩳۗ᩻;

    move-result-object v0

    .line 1126
    :goto_0
    invoke-virtual {v1}, Ll/ܺۗ᩻;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_5

    sget-object v1, Ll/ܳۗ᩻;->ۡ:Ll/ᩳۗ᩻;

    goto :goto_1

    :cond_5
    iget v2, p0, Ll/ܿۗ᩻;->ܿ:I

    invoke-virtual {v1, v2}, Ll/ܺۗ᩻;->ᩳ(I)Ll/ᩳۗ᩻;

    move-result-object v1

    :goto_1
    const/4 v2, 0x2

    new-array v2, v2, [Ll/ᩳۗ᩻;

    const/4 v3, 0x0

    .line 476
    sget-boolean v4, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v4, :cond_6

    goto :goto_6

    :cond_6
    aput-object v0, v2, v3

    .line 211
    sget v0, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v0, :cond_7

    goto :goto_3

    :cond_7
    const/4 v0, 0x1

    aput-object v1, v2, v0

    .line 1112
    aget-object v0, v2, v0

    goto :goto_7

    .line 1098
    :cond_8
    :goto_2
    new-instance v0, Ll/ܺۗ᩻;

    invoke-direct {v0}, Ll/ܺۗ᩻;-><init>()V

    .line 3
    sget-boolean v1, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v1, :cond_9

    goto :goto_5

    .line 1099
    :cond_9
    new-instance v1, Ll/ܺۗ᩻;

    .line 413
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    move-result v2

    if-ltz v2, :cond_a

    goto :goto_6

    .line 1099
    :cond_a
    iget-object v2, p0, Ll/ܿۗ᩻;->ᩳ:[I

    sget-boolean v3, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v3, :cond_b

    goto :goto_3

    :cond_b
    invoke-direct {v1, v2}, Ll/ܺۗ᩻;-><init>([I)V

    .line 1100
    new-instance v2, Ll/ܺۗ᩻;

    .line 57
    sget v3, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v3, :cond_f

    .line 334
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result p1

    if-eqz p1, :cond_c

    goto :goto_4

    .line 778
    :cond_c
    :goto_3
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    sget-boolean p1, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz p1, :cond_d

    goto :goto_6

    :cond_d
    :goto_4
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    move-result p1

    if-ltz p1, :cond_e

    goto :goto_6

    .line 560
    :cond_e
    :goto_5
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    goto :goto_6

    .line 1100
    :cond_f
    iget-object v3, p1, Ll/ܿۗ᩻;->ᩳ:[I

    invoke-direct {v2, v3}, Ll/ܺۗ᩻;-><init>([I)V

    .line 1116
    invoke-virtual {v1, v2, v0}, Ll/ܺۗ᩻;->ܽ(Ll/ܺۗ᩻;Ll/ܺۗ᩻;)Ll/ܺۗ᩻;

    move-result-object v0

    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    move-result v1

    if-gtz v1, :cond_10

    :goto_6
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    const/4 p1, 0x0

    return-object p1

    .line 1102
    :cond_10
    iget v1, p0, Ll/ܿۗ᩻;->ܿ:I

    invoke-virtual {v0, v1}, Ll/ܺۗ᩻;->ᩳ(I)Ll/ᩳۗ᩻;

    move-result-object v0

    .line 1236
    :goto_7
    iget v1, v0, Ll/ܿۗ᩻;->ܿ:I

    if-ltz v1, :cond_11

    return-object v0

    :cond_11
    invoke-static {v0, p1}, Ll/֨۫;->֫ۨᩳ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳۗ᩻;

    move-result-object p1

    return-object p1

    .line 1233
    :cond_12
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method

.method public final ܳ(I)Z
    .locals 3

    if-ltz p1, :cond_e

    ushr-int/lit8 v0, p1, 0x5

    sget v1, Ll/֡۬;->۠֡᩶:I

    if-gtz v1, :cond_0

    goto :goto_0

    .line 1356
    :cond_0
    sget v1, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v1, :cond_1

    goto :goto_0

    .line 1394
    :cond_1
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    move-result v1

    if-gtz v1, :cond_2

    goto :goto_1

    .line 1700
    :cond_2
    sget v1, Ll/᩺;->ۙۛܶ:I

    if-gtz v1, :cond_3

    goto :goto_2

    .line 1854
    :cond_3
    sget v1, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v1, :cond_4

    goto :goto_2

    .line 372
    :cond_4
    sget v1, Ll/֡۬;->۠֡᩶:I

    if-gtz v1, :cond_5

    goto :goto_1

    .line 25
    :cond_5
    sget v1, Ll/۠;->ܺܺܶ:I

    if-ltz v1, :cond_6

    goto :goto_2

    .line 2050
    :cond_6
    invoke-virtual {p0, v0}, Ll/ܿۗ᩻;->֫(I)I

    move-result v0

    .line 364
    sget v1, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v1, :cond_7

    goto :goto_1

    .line 42
    :cond_7
    sget v1, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v1, :cond_9

    .line 137
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    move-result p1

    if-gez p1, :cond_8

    goto :goto_0

    .line 1421
    :cond_8
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    sget p1, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz p1, :cond_a

    goto :goto_1

    :cond_9
    and-int/lit8 p1, p1, 0x1f

    const/4 v1, 0x1

    .line 391
    sget v2, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v2, :cond_c

    :cond_a
    :goto_0
    sget p1, Ll/۟;->ۗۤۛ:I

    if-nez p1, :cond_b

    goto :goto_2

    .line 257
    :cond_b
    :goto_1
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    :goto_2
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    const/4 p1, 0x0

    return p1

    :cond_c
    shl-int p1, v1, p1

    and-int/2addr p1, v0

    if-eqz p1, :cond_d

    return v1

    :cond_d
    const/4 p1, 0x0

    return p1

    .line 2048
    :cond_e
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method

.method public native ܽ(I)B
.end method

.method public final ܽ(Ll/ᩳۗ᩻;)I
    .locals 4

    sget-boolean v0, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v0, :cond_0

    goto :goto_3

    .line 2044
    :cond_0
    sget v0, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v0, :cond_1

    goto :goto_3

    :cond_1
    sget-boolean v0, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    sget v0, Ll/֨۟;->᩹֫᩷:I

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    sget v0, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v0, :cond_5

    goto :goto_2

    :cond_5
    sget v0, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v0, :cond_6

    goto :goto_2

    .line 190
    :cond_6
    sget v0, Ll/֡֡;->֫ۤܳ:I

    if-ltz v0, :cond_7

    goto :goto_2

    .line 2040
    :cond_7
    sget v0, Ll/۟;->ۗۤۛ:I

    if-eqz v0, :cond_8

    goto :goto_0

    .line 2071
    :cond_8
    iget v0, p0, Ll/ܿۗ᩻;->ܿ:I

    sget v1, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v1, :cond_c

    :goto_0
    sget p1, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz p1, :cond_9

    goto :goto_3

    .line 1754
    :cond_9
    :goto_1
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result p1

    if-ltz p1, :cond_a

    goto :goto_4

    .line 1447
    :cond_a
    :goto_2
    sget p1, Ll/ۘ᩻;->᩵ۜ֨:I

    if-lez p1, :cond_b

    goto :goto_4

    :cond_b
    :goto_3
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    :goto_4
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    const/4 p1, 0x0

    return p1

    .line 2071
    :cond_c
    iget v1, p1, Ll/ܿۗ᩻;->ܿ:I

    const/4 v2, 0x1

    const/4 v3, -0x1

    if-ne v0, v1, :cond_f

    if-eq v0, v3, :cond_e

    if-eq v0, v2, :cond_d

    const/4 p1, 0x0

    return p1

    .line 2074
    :cond_d
    invoke-virtual {p0, p1}, Ll/ᩳۗ᩻;->ۧ(Ll/ᩳۗ᩻;)I

    move-result p1

    return p1

    .line 2076
    :cond_e
    invoke-virtual {p1, p0}, Ll/ᩳۗ᩻;->ۧ(Ll/ᩳۗ᩻;)I

    move-result p1

    return p1

    :cond_f
    if-le v0, v1, :cond_10

    return v2

    :cond_10
    return v3
.end method

.method public native ܽ()Ll/ۜۗ᩻;
.end method

.method public final ܿ(I)Ll/ᩳۗ᩻;
    .locals 3

    .line 1037
    sget-boolean v0, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v0, :cond_0

    goto/16 :goto_4

    :cond_0
    sget v0, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v0, :cond_1

    goto :goto_1

    .line 277
    :cond_1
    sget v0, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v0, :cond_2

    goto :goto_1

    .line 1219
    :cond_2
    sget v0, Ll/֡֡;->֫ۤܳ:I

    if-ltz v0, :cond_3

    goto :goto_2

    .line 1036
    :cond_3
    sget v0, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v0, :cond_4

    goto :goto_0

    :cond_4
    sget v0, Ll/֡۬;->۠֡᩶:I

    if-gtz v0, :cond_5

    goto :goto_4

    :cond_5
    sget-boolean v0, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v0, :cond_6

    goto :goto_4

    .line 1908
    :cond_6
    sget v0, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v0, :cond_7

    goto :goto_4

    .line 1957
    :cond_7
    iget v0, p0, Ll/ܿۗ᩻;->ܿ:I

    if-nez v0, :cond_8

    .line 1958
    sget-object p1, Ll/ܳۗ᩻;->ۡ:Ll/ᩳۗ᩻;

    return-object p1

    :cond_8
    if-lez p1, :cond_9

    .line 1960
    invoke-direct {p0, p1}, Ll/ᩳۗ᩻;->ۢ(I)Ll/ᩳۗ᩻;

    move-result-object p1

    return-object p1

    :cond_9
    if-nez p1, :cond_a

    return-object p0

    .line 1966
    :cond_a
    new-instance v0, Ll/ᩳۗ᩻;

    iget-object v1, p0, Ll/ܿۗ᩻;->ᩳ:[I

    .line 1351
    sget v2, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v2, :cond_b

    goto :goto_2

    :cond_b
    neg-int p1, p1

    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result v2

    if-eqz v2, :cond_f

    .line 352
    :goto_0
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    sget p1, Ll/֡۬;->۠֡᩶:I

    if-gtz p1, :cond_c

    goto :goto_3

    .line 1817
    :cond_c
    :goto_1
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    sget p1, Ll/֡ܶ;->ᩴܿ᩸:I

    if-gez p1, :cond_d

    goto :goto_4

    .line 1744
    :cond_d
    :goto_2
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    sget p1, Ll/۠;->ܺܺܶ:I

    if-gez p1, :cond_e

    goto :goto_4

    :cond_e
    :goto_3
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    :goto_4
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    const/4 p1, 0x0

    return-object p1

    .line 1966
    :cond_f
    invoke-static {p1, v1}, Ll/ᩳۗ᩻;->ۧ(I[I)[I

    move-result-object p1

    iget v1, p0, Ll/ܿۗ᩻;->ܿ:I

    invoke-direct {v0, p1, v1}, Ll/ᩳۗ᩻;-><init>([II)V

    return-object v0
.end method

.method public native ܿ(Ll/ᩳۗ᩻;)Ll/ᩳۗ᩻;
.end method

.method public final ܿ()V
    .locals 3

    .line 254
    iget-object v0, p0, Ll/ܿۗ᩻;->ᩳ:[I

    .line 102
    sget v1, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v1, :cond_0

    goto :goto_2

    .line 234
    :cond_0
    sget-boolean v1, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v1, :cond_1

    goto :goto_2

    .line 30
    :cond_1
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    move-result v1

    if-gtz v1, :cond_2

    goto :goto_3

    :cond_2
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    move-result v1

    if-ltz v1, :cond_3

    goto :goto_0

    :cond_3
    sget-boolean v1, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v1, :cond_4

    goto :goto_2

    .line 248
    :cond_4
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_4

    .line 182
    :cond_5
    sget v1, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v1, :cond_6

    goto :goto_2

    .line 98
    :cond_6
    sget-boolean v1, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v1, :cond_7

    goto :goto_1

    .line 162
    :cond_7
    sget v1, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v1, :cond_8

    goto :goto_0

    .line 73
    :cond_8
    sget v1, Ll/ۛ;->᩺᩻֫:I

    if-ltz v1, :cond_c

    .line 130
    :goto_0
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    sget v0, Ll/֫᩵;->ܶ᩻᩷:I

    if-lez v0, :cond_9

    goto :goto_4

    .line 28
    :cond_9
    :goto_1
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    move-result v0

    if-ltz v0, :cond_a

    goto :goto_3

    :cond_a
    :goto_2
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    sget v0, Ll/֨᩺;->ۨ֨۬:I

    if-lez v0, :cond_b

    goto :goto_4

    .line 52
    :cond_b
    :goto_3
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    :goto_4
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    return-void

    .line 254
    :cond_c
    array-length v1, v0

    const/high16 v2, 0x4000000

    if-gt v1, v2, :cond_e

    array-length v1, v0

    if-ne v1, v2, :cond_d

    const/4 v1, 0x0

    aget v0, v0, v1

    if-ltz v0, :cond_e

    :cond_d
    return-void

    .line 260
    :cond_e
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0
.end method

.method public final ᩳ()I
    .locals 2

    .line 123
    invoke-super {p0}, Ll/ܿۗ᩻;->֫()I

    move-result v0

    .line 507
    sget v1, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v1, :cond_0

    goto :goto_2

    .line 1
    :cond_0
    sget v1, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v1, :cond_1

    goto :goto_4

    .line 245
    :cond_1
    sget v1, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    sget v1, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v1, :cond_4

    goto :goto_2

    .line 532
    :cond_4
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_4

    .line 1757
    :cond_5
    sget v1, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v1, :cond_6

    goto :goto_3

    :cond_6
    sget-boolean v1, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v1, :cond_7

    goto :goto_3

    :cond_7
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_1

    .line 1629
    :cond_8
    sget v1, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v1, :cond_c

    :goto_0
    sget-boolean v0, Ll/ۘۗ;->֡ܽ۫:Z

    if-nez v0, :cond_9

    goto :goto_3

    :cond_9
    :goto_1
    sget v0, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-lez v0, :cond_a

    goto :goto_3

    :cond_a
    :goto_2
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result v0

    if-gtz v0, :cond_b

    goto :goto_4

    .line 33
    :cond_b
    :goto_3
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    .line 2062
    :goto_4
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    const/4 v0, 0x0

    return v0

    .line 2168
    :cond_c
    div-int/lit8 v0, v0, 0x8

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final ᩳ(I)Ll/ᩳۗ᩻;
    .locals 3

    sget-boolean v0, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v0, :cond_0

    goto :goto_1

    .line 1786
    :cond_0
    sget v0, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v0, :cond_1

    goto :goto_3

    .line 1738
    :cond_1
    sget v0, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v0, :cond_2

    goto :goto_0

    .line 1830
    :cond_2
    sget v0, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v0, :cond_3

    goto :goto_4

    :cond_3
    sget v0, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v0, :cond_4

    goto :goto_1

    .line 485
    :cond_4
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result v0

    if-ltz v0, :cond_5

    goto :goto_3

    .line 1244
    :cond_5
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    move-result v0

    if-ltz v0, :cond_6

    goto :goto_2

    .line 440
    :cond_6
    sget-boolean v0, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v0, :cond_7

    goto :goto_4

    .line 1897
    :cond_7
    iget v0, p0, Ll/ܿۗ᩻;->ܿ:I

    if-nez v0, :cond_8

    .line 1898
    sget-object p1, Ll/ܳۗ᩻;->ۡ:Ll/ᩳۗ᩻;

    return-object p1

    :cond_8
    if-lez p1, :cond_e

    .line 1900
    new-instance v0, Ll/ᩳۗ᩻;

    iget-object v1, p0, Ll/ܿۗ᩻;->ᩳ:[I

    .line 460
    sget v2, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v2, :cond_9

    goto :goto_3

    .line 1900
    :cond_9
    invoke-static {p1, v1}, Ll/ᩳۗ᩻;->ۧ(I[I)[I

    move-result-object p1

    .line 514
    sget v1, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v1, :cond_d

    :goto_0
    sget p1, Ll/֨۟;->᩹֫᩷:I

    if-nez p1, :cond_a

    goto :goto_4

    .line 234
    :cond_a
    :goto_1
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    sget p1, Ll/֫ۧ;->ۙ۟ۧ:I

    if-lez p1, :cond_b

    goto :goto_3

    .line 1646
    :cond_b
    :goto_2
    sget p1, Ll/ۛ;->᩺᩻֫:I

    if-ltz p1, :cond_c

    goto :goto_4

    :cond_c
    :goto_3
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    .line 1744
    :goto_4
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    const/4 p1, 0x0

    return-object p1

    .line 1900
    :cond_d
    iget v1, p0, Ll/ܿۗ᩻;->ܿ:I

    invoke-direct {v0, p1, v1}, Ll/ᩳۗ᩻;-><init>([II)V

    return-object v0

    :cond_e
    if-nez p1, :cond_f

    return-object p0

    :cond_f
    neg-int p1, p1

    .line 1906
    invoke-direct {p0, p1}, Ll/ᩳۗ᩻;->ۢ(I)Ll/ᩳۗ᩻;

    move-result-object p1

    return-object p1
.end method

.method public native ᩳ(Ll/ᩳۗ᩻;)Ll/ᩳۗ᩻;
.end method

.method public native ᩷()Ll/ᩳۗ᩻;
.end method

.method public final ᩷(Ll/ᩳۗ᩻;)Ll/ᩳۗ᩻;
    .locals 3

    sget v0, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v0, :cond_0

    goto :goto_2

    :cond_0
    sget-boolean v0, Ll/֨۫;->۬᩷᩶:Z

    if-nez v0, :cond_1

    goto :goto_1

    .line 168
    :cond_1
    sget v0, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v0, :cond_2

    goto :goto_2

    .line 177
    :cond_2
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v0

    if-ltz v0, :cond_4

    goto :goto_4

    .line 391
    :cond_4
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_3

    :cond_5
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    move-result v0

    if-ltz v0, :cond_6

    goto :goto_0

    .line 259
    :cond_6
    sget v0, Ll/ۛ;->᩺᩻֫:I

    if-ltz v0, :cond_7

    goto :goto_2

    .line 388
    :cond_7
    iget v0, p1, Ll/ܿۗ᩻;->ܿ:I

    if-nez v0, :cond_8

    return-object p0

    .line 390
    :cond_8
    iget v1, p0, Ll/ܿۗ᩻;->ܿ:I

    if-nez v1, :cond_9

    .line 391
    invoke-virtual {p1}, Ll/ᩳۗ᩻;->ܳ()Ll/ᩳۗ᩻;

    move-result-object p1

    return-object p1

    :cond_9
    if-eq v0, v1, :cond_f

    .line 393
    new-instance v0, Ll/ᩳۗ᩻;

    iget-object v1, p0, Ll/ܿۗ᩻;->ᩳ:[I

    sget v2, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v2, :cond_a

    goto :goto_4

    :cond_a
    iget-object p1, p1, Ll/ܿۗ᩻;->ᩳ:[I

    .line 105
    sget-boolean v2, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v2, :cond_e

    .line 277
    :goto_0
    sget p1, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz p1, :cond_b

    goto :goto_2

    :cond_b
    :goto_1
    sget-boolean p1, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz p1, :cond_c

    goto :goto_3

    .line 323
    :cond_c
    :goto_2
    sget p1, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz p1, :cond_d

    goto :goto_4

    .line 283
    :cond_d
    :goto_3
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    .line 277
    :goto_4
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    const/4 p1, 0x0

    return-object p1

    .line 393
    :cond_e
    invoke-static {v1, p1}, Ll/ᩳۗ᩻;->֫([I[I)[I

    move-result-object p1

    iget v1, p0, Ll/ܿۗ᩻;->ܿ:I

    invoke-direct {v0, p1, v1}, Ll/ᩳۗ᩻;-><init>([II)V

    return-object v0

    .line 395
    :cond_f
    invoke-virtual {p0, p1}, Ll/ᩳۗ᩻;->ۧ(Ll/ᩳۗ᩻;)I

    move-result v0

    if-nez v0, :cond_10

    .line 397
    sget-object p1, Ll/ܳۗ᩻;->ۡ:Ll/ᩳۗ᩻;

    return-object p1

    :cond_10
    if-lez v0, :cond_11

    .line 398
    iget-object v1, p0, Ll/ܿۗ᩻;->ᩳ:[I

    iget-object p1, p1, Ll/ܿۗ᩻;->ᩳ:[I

    invoke-static {v1, p1}, Ll/ᩳۗ᩻;->ۧ([I[I)[I

    move-result-object p1

    goto :goto_5

    .line 399
    :cond_11
    iget-object p1, p1, Ll/ܿۗ᩻;->ᩳ:[I

    iget-object v1, p0, Ll/ܿۗ᩻;->ᩳ:[I

    invoke-static {p1, v1}, Ll/ᩳۗ᩻;->ۧ([I[I)[I

    move-result-object p1

    .line 400
    :goto_5
    invoke-static {p1}, Ll/ᩳۗ᩻;->֫([I)[I

    move-result-object p1

    .line 401
    new-instance v1, Ll/ᩳۗ᩻;

    iget v2, p0, Ll/ܿۗ᩻;->ܿ:I

    if-ne v0, v2, :cond_12

    const/4 v0, 0x1

    goto :goto_6

    :cond_12
    const/4 v0, -0x1

    :goto_6
    invoke-direct {v1, p1, v0}, Ll/ᩳۗ᩻;-><init>([II)V

    return-object v1
.end method

.method public native ᩻()Ll/ᩳۗ᩻;
.end method

.method public native ᩻(Ll/ᩳۗ᩻;)Ll/ᩳۗ᩻;
.end method
