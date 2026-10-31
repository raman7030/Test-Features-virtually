.class public final Ll/ܳ۠֡;
.super Ljava/lang/Object;
.source "M7S7"


# static fields
.field public static final ᩳ:[I


# instance fields
.field public final ֫:[I

.field public final ۧ:[B

.field public final ܽ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x100

    new-array v0, v0, [I

    .line 58
    fill-array-data v0, :array_0

    sput-object v0, Ll/ܳ۠֡;->ᩳ:[I

    return-void

    :array_0
    .array-data 4
        -0x1
        0x0
        0x1
        0x1
        0x2
        0x2
        0x2
        0x2
        0x3
        0x3
        0x3
        0x3
        0x3
        0x3
        0x3
        0x3
        0x4
        0x4
        0x4
        0x4
        0x4
        0x4
        0x4
        0x4
        0x4
        0x4
        0x4
        0x4
        0x4
        0x4
        0x4
        0x4
        0x5
        0x5
        0x5
        0x5
        0x5
        0x5
        0x5
        0x5
        0x5
        0x5
        0x5
        0x5
        0x5
        0x5
        0x5
        0x5
        0x5
        0x5
        0x5
        0x5
        0x5
        0x5
        0x5
        0x5
        0x5
        0x5
        0x5
        0x5
        0x5
        0x5
        0x5
        0x5
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x6
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
        0x7
    .end array-data
.end method

.method public constructor <init>([BI[I)V
    .locals 0

    .line 2526
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2528
    iput-object p1, p0, Ll/ܳ۠֡;->ۧ:[B

    .line 2529
    iput-object p3, p0, Ll/ܳ۠֡;->֫:[I

    .line 2530
    iput p2, p0, Ll/ܳ۠֡;->ܽ:I

    return-void
.end method

.method public static ֫(I)I
    .locals 2

    const v0, 0xff00

    and-int/2addr v0, p0

    .line 423
    sget-object v1, Ll/ܳ۠֡;->ᩳ:[I

    if-eqz v0, :cond_0

    shr-int/lit8 p0, p0, 0x8

    and-int/lit16 p0, p0, 0xff

    aget p0, v1, p0

    add-int/lit8 p0, p0, 0x8

    return p0

    :cond_0
    and-int/lit16 p0, p0, 0xff

    aget p0, v1, p0

    return p0
.end method

.method public static final ֫(II)I
    .locals 0

    shl-int/lit8 p1, p1, 0x8

    or-int/2addr p0, p1

    return p0
.end method

.method private ֫(IIII)I
    .locals 5

    add-int/lit8 v0, p2, -0x1

    :goto_0
    add-int/lit8 v0, v0, 0x1

    .line 445
    iget-object v1, p0, Ll/ܳ۠֡;->֫:[I

    if-ge v0, p3, :cond_0

    aget v2, v1, v0

    add-int v3, p1, v2

    aget v3, v1, v3

    add-int/2addr v3, p4

    add-int v4, p1, v2

    add-int/lit8 v4, v4, 0x1

    aget v4, v1, v4

    add-int/lit8 v4, v4, 0x1

    if-lt v3, v4, :cond_0

    not-int v2, v2

    .line 446
    aput v2, v1, v0

    goto :goto_0

    :cond_0
    :goto_1
    add-int/lit8 p3, p3, -0x1

    if-ge v0, p3, :cond_1

    .line 448
    aget v2, v1, p3

    add-int v3, p1, v2

    aget v3, v1, v3

    add-int/2addr v3, p4

    add-int/2addr v2, p1

    add-int/lit8 v2, v2, 0x1

    aget v2, v1, v2

    add-int/lit8 v2, v2, 0x1

    if-ge v3, v2, :cond_1

    goto :goto_1

    :cond_1
    if-gt p3, v0, :cond_3

    if-ge p2, v0, :cond_2

    .line 457
    aget p1, v1, p2

    not-int p1, p1

    aput p1, v1, p2

    :cond_2
    return v0

    .line 452
    :cond_3
    aget v2, v1, p3

    not-int v2, v2

    .line 453
    aget v3, v1, v0

    aput v3, v1, p3

    .line 454
    aput v2, v1, v0

    goto :goto_0
.end method

.method private ֫(III)V
    .locals 4

    :goto_0
    if-ge p2, p3, :cond_6

    .line 1434
    iget-object v0, p0, Ll/ܳ۠֡;->֫:[I

    aget v1, v0, p2

    if-ltz v1, :cond_3

    move v1, p2

    .line 1437
    :cond_0
    aget v2, v0, v1

    add-int/2addr v2, p1

    aput v1, v0, v2

    add-int/lit8 v1, v1, 0x1

    if-ge v1, p3, :cond_1

    .line 1438
    aget v2, v0, v1

    if-gez v2, :cond_0

    :cond_1
    sub-int v2, p2, v1

    .line 1439
    aput v2, v0, p2

    if-gt p3, v1, :cond_2

    goto :goto_2

    :cond_2
    move p2, v1

    :cond_3
    move v1, p2

    .line 1446
    :goto_1
    aget v2, v0, v1

    not-int v2, v2

    aput v2, v0, v1

    add-int/lit8 v2, v1, 0x1

    .line 1447
    aget v3, v0, v2

    if-ltz v3, :cond_5

    .line 1450
    :cond_4
    aget v3, v0, p2

    add-int/2addr v3, p1

    aput v2, v0, v3

    add-int/lit8 p2, p2, 0x1

    if-le p2, v2, :cond_4

    add-int/lit8 p2, v1, 0x2

    goto :goto_0

    :cond_5
    move v1, v2

    goto :goto_1

    :cond_6
    :goto_2
    return-void
.end method

.method private ֫(IIIII)V
    .locals 8

    add-int v0, p3, p4

    .line 212
    iget-object v1, p0, Ll/ܳ۠֡;->֫:[I

    aget v0, v1, v0

    add-int v2, p2, v0

    aget v2, v1, v2

    add-int/2addr v2, p1

    iget-object v3, p0, Ll/ܳ۠֡;->ۧ:[B

    aget-byte v2, v3, v2

    and-int/lit16 v2, v2, 0xff

    :goto_0
    mul-int/lit8 v4, p4, 0x2

    add-int/lit8 v5, v4, 0x1

    if-ge v5, p5, :cond_2

    add-int/lit8 v4, v4, 0x2

    add-int v6, p3, v5

    .line 213
    aget v6, v1, v6

    add-int/2addr v6, p2

    aget v6, v1, v6

    add-int/2addr v6, p1

    aget-byte v6, v3, v6

    and-int/lit16 v6, v6, 0xff

    add-int v7, p3, v4

    .line 214
    aget v7, v1, v7

    add-int/2addr v7, p2

    aget v7, v1, v7

    add-int/2addr v7, p1

    aget-byte v7, v3, v7

    and-int/lit16 v7, v7, 0xff

    if-ge v6, v7, :cond_0

    move v6, v7

    goto :goto_1

    :cond_0
    move v4, v5

    :goto_1
    if-gt v6, v2, :cond_1

    goto :goto_2

    :cond_1
    add-int/2addr p4, p3

    add-int v5, p3, v4

    .line 212
    aget v5, v1, v5

    aput v5, v1, p4

    move p4, v4

    goto :goto_0

    :cond_2
    :goto_2
    add-int/2addr p3, p4

    .line 220
    aput v0, v1, p3

    return-void
.end method

.method private ֫(IIIIII)V
    .locals 7

    add-int v0, p4, p5

    .line 1157
    iget-object v1, p0, Ll/ܳ۠֡;->֫:[I

    aget v0, v1, v0

    invoke-direct {p0, p1, p2, p3, v0}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v2

    :goto_0
    mul-int/lit8 v3, p5, 0x2

    add-int/lit8 v4, v3, 0x1

    if-ge v4, p6, :cond_2

    add-int/lit8 v3, v3, 0x2

    add-int v5, p4, v4

    .line 1159
    aget v5, v1, v5

    invoke-direct {p0, p1, p2, p3, v5}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v5

    add-int v6, p4, v3

    .line 1160
    aget v6, v1, v6

    invoke-direct {p0, p1, p2, p3, v6}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v6

    if-ge v5, v6, :cond_0

    move v5, v6

    goto :goto_1

    :cond_0
    move v3, v4

    :goto_1
    if-gt v5, v2, :cond_1

    goto :goto_2

    :cond_1
    add-int/2addr p5, p4

    add-int v4, p4, v3

    .line 1157
    aget v4, v1, v4

    aput v4, v1, p5

    move p5, v3

    goto :goto_0

    :cond_2
    :goto_2
    add-int/2addr p4, p5

    .line 1168
    aput v0, v1, p4

    return-void
.end method

.method public static final ֫(II[I[I)V
    .locals 2

    .line 90
    aget v0, p2, p0

    .line 91
    aget v1, p3, p1

    aput v1, p2, p0

    .line 92
    aput v0, p3, p1

    return-void
.end method

.method public static ֫(II[I[II)V
    .locals 0

    :goto_0
    if-lez p4, :cond_0

    .line 690
    invoke-static {p0, p1, p2, p3}, Ll/ܳ۠֡;->֫(II[I[I)V

    add-int/lit8 p4, p4, -0x1

    add-int/lit8 p0, p0, 0x1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ֫([IIIIIII)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p6

    move/from16 v4, p7

    const/16 v5, 0x40

    new-array v5, v5, [Ll/ܿ۠֡;

    const/4 v6, 0x0

    const/4 v7, 0x0

    move/from16 v6, p3

    move/from16 v7, p4

    move/from16 v8, p5

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_0
    sub-int v11, v8, v7

    const/4 v13, 0x1

    .line 959
    iget-object v14, v0, Ll/ܳ۠֡;->֫:[I

    if-gt v11, v4, :cond_1a

    if-ge v6, v7, :cond_16

    if-ge v7, v8, :cond_16

    add-int v15, v3, v11

    .line 789
    invoke-static {v3, v7, v1, v14, v11}, Ll/ܳ۠֡;->֫(II[I[II)V

    add-int/lit8 v15, v15, -0x1

    .line 792
    aget v11, v1, v15

    if-gez v11, :cond_0

    not-int v11, v11

    add-int/2addr v11, v2

    goto :goto_1

    :cond_0
    add-int/2addr v11, v2

    const/4 v13, 0x0

    :goto_1
    add-int/lit8 v7, v7, -0x1

    .line 798
    aget v12, v14, v7

    if-gez v12, :cond_1

    or-int/lit8 v13, v13, 0x2

    not-int v12, v12

    :cond_1
    add-int/2addr v12, v2

    add-int/lit8 v16, v8, -0x1

    .line 804
    aget v17, v14, v16

    move/from16 v18, v16

    move/from16 v16, v15

    move v15, v13

    :goto_2
    const/4 v13, 0x2

    .line 806
    :goto_3
    invoke-direct {v0, v11, v12, v13}, Ll/ܳ۠֡;->ۧ(III)I

    move-result v19

    if-lez v19, :cond_6

    and-int/lit8 v11, v15, 0x1

    if-eqz v11, :cond_3

    :goto_4
    add-int/lit8 v11, v18, -0x1

    .line 810
    aget v19, v1, v16

    aput v19, v14, v18

    add-int/lit8 v18, v16, -0x1

    .line 811
    aget v19, v14, v11

    aput v19, v1, v16

    .line 812
    aget v16, v1, v18

    if-ltz v16, :cond_2

    xor-int/lit8 v15, v15, 0x1

    move/from16 v20, v18

    move/from16 v18, v11

    move/from16 v11, v20

    goto :goto_5

    :cond_2
    move/from16 v16, v18

    move/from16 v18, v11

    goto :goto_4

    :cond_3
    move/from16 v11, v16

    :goto_5
    add-int/lit8 v16, v18, -0x1

    .line 815
    aget v19, v1, v11

    aput v19, v14, v18

    if-gt v11, v3, :cond_4

    .line 817
    aput v17, v1, v11

    goto/16 :goto_e

    :cond_4
    add-int/lit8 v18, v11, -0x1

    .line 820
    aget v19, v14, v16

    aput v19, v1, v11

    .line 822
    aget v11, v1, v18

    if-gez v11, :cond_5

    or-int/lit8 v15, v15, 0x1

    not-int v11, v11

    :cond_5
    add-int/2addr v11, v2

    move/from16 v20, v18

    move/from16 v18, v16

    move/from16 v16, v20

    goto :goto_3

    :cond_6
    if-gez v19, :cond_c

    and-int/lit8 v12, v15, 0x2

    if-eqz v12, :cond_8

    :goto_6
    add-int/lit8 v12, v18, -0x1

    .line 831
    aget v13, v14, v7

    aput v13, v14, v18

    add-int/lit8 v13, v7, -0x1

    .line 832
    aget v18, v14, v12

    aput v18, v14, v7

    .line 833
    aget v7, v14, v13

    if-ltz v7, :cond_7

    xor-int/lit8 v15, v15, 0x2

    move/from16 v18, v12

    move v7, v13

    goto :goto_7

    :cond_7
    move/from16 v18, v12

    move v7, v13

    goto :goto_6

    :cond_8
    :goto_7
    add-int/lit8 v12, v18, -0x1

    .line 836
    aget v13, v14, v7

    aput v13, v14, v18

    add-int/lit8 v13, v7, -0x1

    .line 837
    aget v18, v14, v12

    aput v18, v14, v7

    if-ge v13, v6, :cond_a

    :goto_8
    move/from16 v7, v16

    if-ge v3, v7, :cond_9

    add-int/lit8 v11, v12, -0x1

    .line 840
    aget v13, v1, v7

    aput v13, v14, v12

    add-int/lit8 v16, v7, -0x1

    .line 841
    aget v12, v14, v11

    aput v12, v1, v7

    move v12, v11

    goto :goto_8

    .line 843
    :cond_9
    aget v11, v1, v7

    aput v11, v14, v12

    .line 844
    aput v17, v1, v7

    goto/16 :goto_e

    .line 848
    :cond_a
    aget v7, v14, v13

    if-gez v7, :cond_b

    or-int/lit8 v15, v15, 0x2

    not-int v7, v7

    :cond_b
    add-int/2addr v7, v2

    move/from16 v18, v12

    move v12, v7

    move v7, v13

    goto/16 :goto_2

    :cond_c
    and-int/lit8 v11, v15, 0x1

    if-eqz v11, :cond_e

    :goto_9
    add-int/lit8 v11, v18, -0x1

    .line 857
    aget v12, v1, v16

    aput v12, v14, v18

    add-int/lit8 v12, v16, -0x1

    .line 858
    aget v13, v14, v11

    aput v13, v1, v16

    .line 859
    aget v13, v1, v12

    if-ltz v13, :cond_d

    xor-int/lit8 v15, v15, 0x1

    move/from16 v18, v11

    goto :goto_a

    :cond_d
    move/from16 v18, v11

    move/from16 v16, v12

    goto :goto_9

    :cond_e
    move/from16 v12, v16

    :goto_a
    add-int/lit8 v11, v18, -0x1

    .line 862
    aget v13, v1, v12

    not-int v13, v13

    aput v13, v14, v18

    if-gt v12, v3, :cond_f

    .line 864
    aput v17, v1, v12

    goto/16 :goto_e

    :cond_f
    add-int/lit8 v13, v12, -0x1

    .line 867
    aget v16, v14, v11

    aput v16, v1, v12

    and-int/lit8 v12, v15, 0x2

    if-eqz v12, :cond_11

    :goto_b
    add-int/lit8 v12, v11, -0x1

    .line 871
    aget v16, v14, v7

    aput v16, v14, v11

    add-int/lit8 v11, v7, -0x1

    .line 872
    aget v16, v14, v12

    aput v16, v14, v7

    .line 873
    aget v7, v14, v11

    if-ltz v7, :cond_10

    xor-int/lit8 v15, v15, 0x2

    move v7, v11

    move v11, v12

    goto :goto_c

    :cond_10
    move v7, v11

    move v11, v12

    goto :goto_b

    :cond_11
    :goto_c
    add-int/lit8 v12, v11, -0x1

    .line 876
    aget v16, v14, v7

    aput v16, v14, v11

    add-int/lit8 v11, v7, -0x1

    .line 877
    aget v16, v14, v12

    aput v16, v14, v7

    if-ge v11, v6, :cond_13

    :goto_d
    if-ge v3, v13, :cond_12

    add-int/lit8 v7, v12, -0x1

    .line 880
    aget v11, v1, v13

    aput v11, v14, v12

    add-int/lit8 v11, v13, -0x1

    .line 881
    aget v12, v14, v7

    aput v12, v1, v13

    move v12, v7

    move v13, v11

    goto :goto_d

    .line 883
    :cond_12
    aget v7, v1, v13

    aput v7, v14, v12

    .line 884
    aput v17, v1, v13

    goto :goto_e

    .line 888
    :cond_13
    aget v7, v1, v13

    if-gez v7, :cond_14

    or-int/lit8 v15, v15, 0x1

    not-int v7, v7

    :cond_14
    add-int/2addr v7, v2

    move/from16 p3, v7

    .line 894
    aget v7, v14, v11

    if-gez v7, :cond_15

    or-int/lit8 v15, v15, 0x2

    not-int v7, v7

    :cond_15
    add-int/2addr v7, v2

    move/from16 v18, v12

    move/from16 v16, v13

    move v12, v7

    move v7, v11

    move/from16 v11, p3

    goto/16 :goto_2

    :cond_16
    :goto_e
    and-int/lit8 v7, v9, 0x1

    if-eqz v7, :cond_17

    .line 965
    invoke-direct {v0, v2, v6}, Ll/ܳ۠֡;->ܽ(II)V

    :cond_17
    and-int/lit8 v6, v9, 0x2

    if-eqz v6, :cond_18

    .line 968
    invoke-direct {v0, v2, v8}, Ll/ܳ۠֡;->ܽ(II)V

    :cond_18
    if-nez v10, :cond_19

    goto/16 :goto_23

    :cond_19
    add-int/lit8 v10, v10, -0x1

    .line 971
    aget-object v6, v5, v10

    .line 972
    iget v7, v6, Ll/ܿ۠֡;->֫:I

    .line 973
    iget v8, v6, Ll/ܿ۠֡;->ۧ:I

    .line 974
    iget v9, v6, Ll/ܿ۠֡;->ܽ:I

    .line 975
    iget v6, v6, Ll/ܿ۠֡;->ᩳ:I

    move/from16 v20, v9

    move v9, v6

    move v6, v7

    move v7, v8

    move/from16 v8, v20

    goto/16 :goto_0

    :cond_1a
    sub-int v12, v7, v6

    if-gt v12, v4, :cond_2b

    if-ge v6, v7, :cond_27

    add-int v11, v3, v12

    sub-int/2addr v11, v13

    .line 715
    invoke-static {v3, v6, v1, v14, v12}, Ll/ܳ۠֡;->֫(II[I[II)V

    .line 717
    aget v12, v14, v6

    move v13, v3

    move v15, v6

    .line 718
    :goto_f
    aget v16, v1, v13

    add-int v3, v2, v16

    aget v16, v14, v7

    add-int v4, v2, v16

    move/from16 p3, v13

    const/4 v13, 0x2

    invoke-direct {v0, v3, v4, v13}, Ll/ܳ۠֡;->ۧ(III)I

    move-result v3

    if-gez v3, :cond_1d

    move/from16 v13, p3

    :goto_10
    add-int/lit8 v3, v15, 0x1

    .line 721
    aget v4, v1, v13

    aput v4, v14, v15

    if-gt v11, v13, :cond_1b

    .line 723
    aput v12, v1, v13

    goto/16 :goto_19

    :cond_1b
    add-int/lit8 v4, v13, 0x1

    .line 726
    aget v15, v14, v3

    aput v15, v1, v13

    .line 727
    aget v13, v1, v4

    if-ltz v13, :cond_1c

    :goto_11
    move v13, v4

    goto/16 :goto_17

    :cond_1c
    move v15, v3

    move v13, v4

    goto :goto_10

    :cond_1d
    if-lez v3, :cond_21

    :goto_12
    add-int/lit8 v3, v15, 0x1

    .line 730
    aget v4, v14, v7

    aput v4, v14, v15

    add-int/lit8 v4, v7, 0x1

    .line 731
    aget v13, v14, v3

    aput v13, v14, v7

    if-gt v8, v4, :cond_1f

    move/from16 v13, p3

    :goto_13
    if-ge v13, v11, :cond_1e

    add-int/lit8 v4, v3, 0x1

    .line 733
    aget v7, v1, v13

    aput v7, v14, v3

    add-int/lit8 v3, v13, 0x1

    aget v7, v14, v4

    aput v7, v1, v13

    move v13, v3

    move v3, v4

    goto :goto_13

    .line 734
    :cond_1e
    aget v4, v1, v13

    aput v4, v14, v3

    aput v12, v1, v13

    goto/16 :goto_19

    .line 737
    :cond_1f
    aget v7, v14, v4

    if-ltz v7, :cond_20

    move/from16 v13, p3

    move v15, v3

    move v7, v4

    goto :goto_18

    :cond_20
    move v15, v3

    move v7, v4

    goto :goto_12

    .line 739
    :cond_21
    aget v3, v14, v7

    not-int v3, v3

    aput v3, v14, v7

    move/from16 v13, p3

    :goto_14
    add-int/lit8 v3, v15, 0x1

    .line 741
    aget v4, v1, v13

    aput v4, v14, v15

    if-gt v11, v13, :cond_22

    .line 743
    aput v12, v1, v13

    goto :goto_19

    :cond_22
    add-int/lit8 v4, v13, 0x1

    .line 746
    aget v15, v14, v3

    aput v15, v1, v13

    .line 747
    aget v13, v1, v4

    if-ltz v13, :cond_26

    :goto_15
    add-int/lit8 v13, v3, 0x1

    .line 750
    aget v15, v14, v7

    aput v15, v14, v3

    add-int/lit8 v3, v7, 0x1

    .line 751
    aget v15, v14, v13

    aput v15, v14, v7

    if-gt v8, v3, :cond_24

    :goto_16
    if-ge v4, v11, :cond_23

    add-int/lit8 v3, v13, 0x1

    .line 754
    aget v7, v1, v4

    aput v7, v14, v13

    add-int/lit8 v7, v4, 0x1

    .line 755
    aget v13, v14, v3

    aput v13, v1, v4

    move v13, v3

    move v4, v7

    goto :goto_16

    .line 757
    :cond_23
    aget v3, v1, v4

    aput v3, v14, v13

    aput v12, v1, v4

    goto :goto_19

    .line 760
    :cond_24
    aget v7, v14, v3

    if-ltz v7, :cond_25

    move v7, v3

    move v3, v13

    goto/16 :goto_11

    :goto_17
    move v15, v3

    :goto_18
    move/from16 v3, p6

    move/from16 v4, p7

    goto/16 :goto_f

    :cond_25
    move v7, v3

    move v3, v13

    goto :goto_15

    :cond_26
    move v15, v3

    move v13, v4

    goto :goto_14

    :cond_27
    :goto_19
    and-int/lit8 v3, v9, 0x1

    if-eqz v3, :cond_28

    .line 984
    invoke-direct {v0, v2, v6}, Ll/ܳ۠֡;->ܽ(II)V

    :cond_28
    and-int/lit8 v3, v9, 0x2

    if-eqz v3, :cond_29

    .line 987
    invoke-direct {v0, v2, v8}, Ll/ܳ۠֡;->ܽ(II)V

    :cond_29
    if-nez v10, :cond_2a

    goto/16 :goto_23

    :cond_2a
    add-int/lit8 v10, v10, -0x1

    .line 990
    aget-object v3, v5, v10

    .line 991
    iget v4, v3, Ll/ܿ۠֡;->֫:I

    .line 992
    iget v6, v3, Ll/ܿ۠֡;->ۧ:I

    .line 993
    iget v7, v3, Ll/ܿ۠֡;->ܽ:I

    .line 994
    iget v3, v3, Ll/ܿ۠֡;->ᩳ:I

    :goto_1a
    move v9, v3

    move v8, v7

    move v7, v6

    move v6, v4

    goto/16 :goto_24

    .line 999
    :cond_2b
    invoke-static {v12, v11}, Ljava/lang/Math;->min(II)I

    move-result v3

    shr-int/lit8 v4, v3, 0x1

    const/4 v11, 0x0

    :goto_1b
    if-lez v3, :cond_2f

    add-int v12, v7, v11

    add-int/2addr v12, v4

    .line 1004
    aget v12, v14, v12

    if-ltz v12, :cond_2c

    goto :goto_1c

    :cond_2c
    not-int v12, v12

    :goto_1c
    add-int/2addr v12, v2

    sub-int v15, v7, v11

    sub-int/2addr v15, v4

    sub-int/2addr v15, v13

    aget v15, v14, v15

    if-ltz v15, :cond_2d

    goto :goto_1d

    :cond_2d
    not-int v15, v15

    :goto_1d
    add-int/2addr v15, v2

    const/4 v13, 0x2

    invoke-direct {v0, v12, v15, v13}, Ll/ܳ۠֡;->ۧ(III)I

    move-result v12

    if-gez v12, :cond_2e

    add-int/lit8 v12, v4, 0x1

    add-int/2addr v11, v12

    and-int/lit8 v3, v3, 0x1

    const/4 v12, 0x1

    xor-int/2addr v3, v12

    sub-int/2addr v4, v3

    goto :goto_1e

    :cond_2e
    const/4 v12, 0x1

    :goto_1e
    move v3, v4

    shr-int/lit8 v4, v3, 0x1

    const/4 v13, 0x1

    goto :goto_1b

    :cond_2f
    if-lez v11, :cond_36

    sub-int v3, v7, v11

    .line 1012
    invoke-static {v3, v7, v14, v14, v11}, Ll/ܳ۠֡;->֫(II[I[II)V

    add-int v4, v7, v11

    if-ge v4, v8, :cond_33

    .line 1016
    aget v11, v14, v4

    if-gez v11, :cond_31

    move v11, v7

    :goto_1f
    add-int/lit8 v12, v11, -0x1

    .line 1017
    aget v12, v14, v12

    if-gez v12, :cond_30

    add-int/lit8 v11, v11, -0x1

    goto :goto_1f

    .line 1018
    :cond_30
    aget v12, v14, v4

    not-int v12, v12

    aput v12, v14, v4

    goto :goto_20

    :cond_31
    move v11, v7

    :goto_20
    move v12, v7

    .line 1020
    :goto_21
    aget v13, v14, v12

    if-gez v13, :cond_32

    add-int/lit8 v12, v12, 0x1

    goto :goto_21

    :cond_32
    const/4 v13, 0x1

    goto :goto_22

    :cond_33
    const/4 v13, 0x0

    move v11, v7

    move v12, v11

    :goto_22
    sub-int v14, v11, v6

    sub-int v15, v8, v12

    if-gt v14, v15, :cond_34

    add-int/lit8 v7, v10, 0x1

    .line 1024
    new-instance v14, Ll/ܿ۠֡;

    and-int/lit8 v15, v9, 0x2

    or-int/2addr v13, v15

    invoke-direct {v14, v12, v4, v8, v13}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v14, v5, v10

    and-int/lit8 v9, v9, 0x1

    move/from16 v4, p7

    move v10, v7

    move v8, v11

    move v7, v3

    move/from16 v3, p6

    goto/16 :goto_0

    :cond_34
    if-ne v11, v7, :cond_35

    if-ne v7, v12, :cond_35

    shl-int/lit8 v13, v13, 0x1

    :cond_35
    add-int/lit8 v7, v10, 0x1

    .line 1032
    new-instance v14, Ll/ܿ۠֡;

    and-int/lit8 v15, v9, 0x1

    and-int/lit8 v16, v13, 0x2

    or-int v15, v15, v16

    invoke-direct {v14, v6, v3, v11, v15}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v14, v5, v10

    and-int/lit8 v3, v9, 0x2

    and-int/lit8 v6, v13, 0x1

    or-int v9, v3, v6

    move/from16 v3, p6

    move v10, v7

    move v6, v12

    move v7, v4

    goto :goto_25

    :cond_36
    and-int/lit8 v3, v9, 0x1

    if-eqz v3, :cond_37

    .line 1039
    invoke-direct {v0, v2, v6}, Ll/ܳ۠֡;->ܽ(II)V

    .line 1041
    :cond_37
    invoke-direct {v0, v2, v7}, Ll/ܳ۠֡;->ܽ(II)V

    and-int/lit8 v3, v9, 0x2

    if-eqz v3, :cond_38

    .line 1043
    invoke-direct {v0, v2, v8}, Ll/ܳ۠֡;->ܽ(II)V

    :cond_38
    if-nez v10, :cond_39

    :goto_23
    return-void

    :cond_39
    add-int/lit8 v10, v10, -0x1

    .line 1046
    aget-object v3, v5, v10

    .line 1047
    iget v4, v3, Ll/ܿ۠֡;->֫:I

    .line 1048
    iget v6, v3, Ll/ܿ۠֡;->ۧ:I

    .line 1049
    iget v7, v3, Ll/ܿ۠֡;->ܽ:I

    .line 1050
    iget v3, v3, Ll/ܿ۠֡;->ᩳ:I

    goto/16 :goto_1a

    :goto_24
    move/from16 v3, p6

    :goto_25
    move/from16 v4, p7

    goto/16 :goto_0
.end method

.method public static ۧ(I)I
    .locals 2

    const/high16 v0, -0x10000

    and-int/2addr v0, p0

    .line 1252
    sget-object v1, Ll/ܳ۠֡;->ᩳ:[I

    if-eqz v0, :cond_1

    const/high16 v0, -0x1000000

    and-int/2addr v0, p0

    if-eqz v0, :cond_0

    shr-int/lit8 p0, p0, 0x18

    and-int/lit16 p0, p0, 0xff

    aget p0, v1, p0

    add-int/lit8 p0, p0, 0x18

    return p0

    :cond_0
    shr-int/lit8 p0, p0, 0x10

    and-int/lit16 p0, p0, 0xff

    aget p0, v1, p0

    add-int/lit8 p0, p0, 0x10

    return p0

    :cond_1
    const v0, 0xff00

    and-int/2addr v0, p0

    if-eqz v0, :cond_2

    shr-int/lit8 p0, p0, 0x8

    and-int/lit16 p0, p0, 0xff

    aget p0, v1, p0

    add-int/lit8 p0, p0, 0x8

    return p0

    :cond_2
    and-int/lit16 p0, p0, 0xff

    aget p0, v1, p0

    return p0
.end method

.method public static final ۧ(II)I
    .locals 0

    shl-int/lit8 p0, p0, 0x8

    or-int/2addr p0, p1

    return p0
.end method

.method private ۧ(III)I
    .locals 5

    .line 112
    iget-object v0, p0, Ll/ܳ۠֡;->֫:[I

    aget v1, v0, p1

    add-int/2addr v1, p3

    aget v2, v0, p2

    add-int/2addr p3, v2

    const/4 v2, 0x1

    add-int/2addr p1, v2

    aget p1, v0, p1

    add-int/lit8 p1, p1, 0x2

    add-int/2addr p2, v2

    aget p2, v0, p2

    add-int/lit8 p2, p2, 0x2

    .line 113
    :goto_0
    iget-object v0, p0, Ll/ܳ۠֡;->ۧ:[B

    if-ge v1, p1, :cond_0

    if-ge p3, p2, :cond_0

    aget-byte v3, v0, v1

    aget-byte v4, v0, p3

    if-ne v3, v4, :cond_0

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_0
    if-ge v1, p1, :cond_2

    if-ge p3, p2, :cond_1

    .line 117
    aget-byte p1, v0, v1

    and-int/lit16 p1, p1, 0xff

    aget-byte p2, v0, p3

    and-int/lit16 p2, p2, 0xff

    sub-int/2addr p1, p2

    return p1

    :cond_1
    return v2

    :cond_2
    if-ge p3, p2, :cond_3

    const/4 p1, -0x1

    return p1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method private ۧ(IIII)I
    .locals 2

    add-int v0, p2, p4

    .line 1136
    iget-object v1, p0, Ll/ܳ۠֡;->֫:[I

    if-ge v0, p3, :cond_0

    aget p1, v1, v0

    return p1

    :cond_0
    sub-int/2addr p2, p1

    add-int/2addr p2, p4

    sub-int/2addr p3, p1

    rem-int/2addr p2, p3

    add-int/2addr p2, p1

    aget p1, v1, p2

    return p1
.end method

.method private ۧ(IIIII)I
    .locals 7

    .line 278
    iget-object v0, p0, Ll/ܳ۠֡;->֫:[I

    aget v1, v0, p3

    add-int/2addr v1, p2

    aget v1, v0, v1

    add-int/2addr v1, p1

    iget-object v2, p0, Ll/ܳ۠֡;->ۧ:[B

    aget-byte v1, v2, v1

    and-int/lit16 v1, v1, 0xff

    .line 279
    aget v3, v0, p4

    add-int/2addr v3, p2

    aget v3, v0, v3

    add-int/2addr v3, p1

    aget-byte v3, v2, v3

    and-int/lit16 v3, v3, 0xff

    .line 280
    aget v4, v0, p5

    add-int/2addr p2, v4

    aget p2, v0, p2

    add-int/2addr p1, p2

    aget-byte p1, v2, p1

    and-int/lit16 p1, p1, 0xff

    if-le v1, v3, :cond_0

    goto :goto_0

    :cond_0
    move v5, p4

    move p4, p3

    move p3, v5

    move v6, v3

    move v3, v1

    move v1, v6

    :goto_0
    if-le v1, p1, :cond_2

    if-le v3, p1, :cond_1

    return p4

    :cond_1
    return p5

    :cond_2
    return p3
.end method

.method private ۧ(IIIIII)I
    .locals 5

    .line 1272
    iget-object v0, p0, Ll/ܳ۠֡;->֫:[I

    aget v1, v0, p4

    invoke-direct {p0, p1, p2, p3, v1}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v1

    .line 1273
    aget v2, v0, p5

    invoke-direct {p0, p1, p2, p3, v2}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v2

    .line 1274
    aget v0, v0, p6

    invoke-direct {p0, p1, p2, p3, v0}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result p1

    if-le v1, v2, :cond_0

    goto :goto_0

    :cond_0
    move v3, p5

    move p5, p4

    move p4, v3

    move v4, v2

    move v2, v1

    move v1, v4

    :goto_0
    if-le v1, p1, :cond_2

    if-le v2, p1, :cond_1

    return p5

    :cond_1
    return p6

    :cond_2
    return p4
.end method

.method private ܽ(II)V
    .locals 3

    .line 925
    iget-object v0, p0, Ll/ܳ۠֡;->֫:[I

    aget v1, v0, p2

    if-ltz v1, :cond_1

    add-int/lit8 v2, p2, -0x1

    aget v2, v0, v2

    if-ltz v2, :cond_0

    goto :goto_0

    :cond_0
    not-int v2, v2

    :goto_0
    add-int/2addr v2, p1

    add-int/2addr p1, v1

    const/4 v1, 0x2

    invoke-direct {p0, v2, p1, v1}, Ll/ܳ۠֡;->ۧ(III)I

    move-result p1

    if-nez p1, :cond_1

    .line 930
    aget p1, v0, p2

    not-int p1, p1

    aput p1, v0, p2

    :cond_1
    return-void
.end method

.method private ܽ(III)V
    .locals 23

    move-object/from16 v6, p0

    move/from16 v7, p1

    const/16 v0, 0x40

    new-array v8, v0, [Ll/ܿ۠֡;

    sub-int v0, p3, p2

    .line 520
    invoke-static {v0}, Ll/ܳ۠֡;->֫(I)I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    move/from16 v9, p2

    move/from16 v10, p3

    move v11, v0

    move-object v0, v6

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_0
    sub-int v15, v10, v9

    const/16 v1, 0x8

    const/4 v2, 0x1

    .line 521
    iget-object v5, v0, Ll/ܳ۠֡;->֫:[I

    if-gt v15, v1, :cond_7

    if-ge v2, v15, :cond_5

    add-int/lit8 v1, v10, -0x2

    :goto_1
    if-gt v9, v1, :cond_5

    .line 179
    aget v3, v5, v1

    add-int/lit8 v4, v1, 0x1

    :cond_0
    add-int v11, v7, v3

    aget v15, v5, v4

    add-int/2addr v15, v7

    invoke-direct {v0, v11, v15, v12}, Ll/ܳ۠֡;->ۧ(III)I

    move-result v11

    if-lez v11, :cond_3

    :cond_1
    add-int/lit8 v15, v4, -0x1

    .line 181
    aget v16, v5, v4

    aput v16, v5, v15

    add-int/2addr v4, v2

    if-ge v4, v10, :cond_2

    .line 182
    aget v15, v5, v4

    if-ltz v15, :cond_1

    :cond_2
    if-gt v10, v4, :cond_0

    :cond_3
    if-nez v11, :cond_4

    .line 188
    aget v11, v5, v4

    not-int v11, v11

    aput v11, v5, v4

    :cond_4
    add-int/lit8 v4, v4, -0x1

    .line 190
    aput v3, v5, v4

    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    :cond_5
    if-nez v13, :cond_6

    return-void

    :cond_6
    add-int/lit8 v13, v13, -0x1

    .line 526
    aget-object v1, v8, v13

    .line 527
    iget v9, v1, Ll/ܿ۠֡;->֫:I

    .line 528
    iget v10, v1, Ll/ܿ۠֡;->ۧ:I

    .line 529
    iget v12, v1, Ll/ܿ۠֡;->ܽ:I

    .line 530
    iget v11, v1, Ll/ܿ۠֡;->ᩳ:I

    goto :goto_0

    :cond_7
    add-int/lit8 v4, v11, -0x1

    .line 535
    iget-object v3, v0, Ll/ܳ۠֡;->ۧ:[B

    if-nez v11, :cond_d

    .line 239
    rem-int/lit8 v16, v15, 0x2

    if-nez v16, :cond_9

    add-int/lit8 v0, v15, -0x1

    .line 241
    div-int/lit8 v1, v0, 0x2

    add-int/2addr v1, v9

    aget v2, v5, v1

    add-int v17, v7, v2

    aget v17, v5, v17

    add-int v17, v12, v17

    move/from16 p2, v4

    aget-byte v4, v3, v17

    and-int/lit16 v4, v4, 0xff

    add-int v17, v9, v0

    aget v18, v5, v17

    add-int v19, v7, v18

    aget v19, v5, v19

    add-int v19, v12, v19

    move/from16 p3, v0

    aget-byte v0, v3, v19

    and-int/lit16 v0, v0, 0xff

    if-ge v4, v0, :cond_8

    .line 91
    aput v2, v5, v17

    .line 92
    aput v18, v5, v1

    :cond_8
    move/from16 v17, p3

    goto :goto_2

    :cond_9
    move/from16 p2, v4

    move/from16 v17, v15

    .line 246
    :goto_2
    div-int/lit8 v0, v17, 0x2

    add-int/lit8 v0, v0, -0x1

    move/from16 v18, v0

    :goto_3
    if-ltz v18, :cond_a

    move-object/from16 v0, p0

    move v1, v12

    move/from16 v2, p1

    move-object/from16 v19, v3

    move v3, v9

    move/from16 p3, v11

    move/from16 v11, p2

    move/from16 v4, v18

    move-object/from16 v20, v5

    move/from16 v5, v17

    .line 247
    invoke-direct/range {v0 .. v5}, Ll/ܳ۠֡;->֫(IIIII)V

    add-int/lit8 v18, v18, -0x1

    move-object/from16 v3, v19

    move-object/from16 v5, v20

    move/from16 v11, p3

    goto :goto_3

    :cond_a
    move-object/from16 v19, v3

    move-object/from16 v20, v5

    move/from16 p3, v11

    move/from16 v11, p2

    if-nez v16, :cond_b

    add-int v0, v9, v17

    .line 90
    aget v1, v20, v9

    .line 91
    aget v2, v20, v0

    aput v2, v20, v9

    .line 92
    aput v1, v20, v0

    const/4 v4, 0x0

    move-object/from16 v0, p0

    move v1, v12

    move/from16 v2, p1

    move v3, v9

    move/from16 v5, v17

    .line 252
    invoke-direct/range {v0 .. v5}, Ll/ܳ۠֡;->֫(IIIII)V

    :cond_b
    :goto_4
    add-int/lit8 v17, v17, -0x1

    if-lez v17, :cond_c

    .line 256
    aget v16, v20, v9

    add-int v18, v9, v17

    .line 257
    aget v0, v20, v18

    aput v0, v20, v9

    const/4 v4, 0x0

    move-object/from16 v0, p0

    move v1, v12

    move/from16 v2, p1

    move v3, v9

    move/from16 v5, v17

    .line 258
    invoke-direct/range {v0 .. v5}, Ll/ܳ۠֡;->֫(IIIII)V

    .line 259
    aput v16, v20, v18

    goto :goto_4

    :cond_c
    move-object v0, v6

    goto :goto_5

    :cond_d
    move-object/from16 v19, v3

    move-object/from16 v20, v5

    move/from16 p3, v11

    move v11, v4

    :goto_5
    const/4 v1, -0x1

    if-gez v11, :cond_15

    add-int/lit8 v2, v9, 0x1

    .line 539
    aget v3, v20, v9

    add-int/2addr v3, v7

    aget v3, v20, v3

    add-int/2addr v3, v12

    aget-byte v3, v19, v3

    and-int/lit16 v3, v3, 0xff

    move/from16 v21, v9

    move v9, v2

    move/from16 v2, v21

    :goto_6
    if-ge v9, v10, :cond_10

    .line 540
    aget v4, v20, v9

    add-int/2addr v4, v7

    aget v4, v20, v4

    add-int/2addr v4, v12

    aget-byte v4, v19, v4

    and-int/lit16 v14, v4, 0xff

    if-eq v14, v3, :cond_f

    sub-int v4, v9, v2

    const/4 v5, 0x1

    if-ge v5, v4, :cond_e

    goto :goto_7

    :cond_e
    move v2, v9

    move v3, v14

    :cond_f
    add-int/lit8 v9, v9, 0x1

    goto :goto_6

    .line 546
    :cond_10
    :goto_7
    aget v4, v20, v2

    add-int/2addr v4, v7

    aget v4, v20, v4

    add-int/2addr v4, v12

    const/4 v5, 0x1

    sub-int/2addr v4, v5

    aget-byte v4, v19, v4

    and-int/lit16 v4, v4, 0xff

    if-ge v4, v3, :cond_11

    .line 547
    invoke-direct {v0, v7, v2, v9, v12}, Ll/ܳ۠֡;->֫(IIII)I

    move-result v2

    :cond_11
    sub-int v3, v9, v2

    sub-int v4, v10, v9

    if-gt v3, v4, :cond_12

    if-ge v5, v3, :cond_13

    add-int/lit8 v4, v13, 0x1

    .line 551
    new-instance v5, Ll/ܿ۠֡;

    invoke-direct {v5, v9, v10, v12, v1}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v5, v8, v13

    add-int/lit8 v12, v12, 0x1

    .line 554
    invoke-static {v3}, Ll/ܳ۠֡;->֫(I)I

    move-result v11

    move v13, v4

    goto :goto_8

    :cond_12
    if-ge v5, v4, :cond_14

    add-int/lit8 v1, v13, 0x1

    .line 561
    new-instance v4, Ll/ܿ۠֡;

    add-int/lit8 v5, v12, 0x1

    invoke-static {v3}, Ll/ܳ۠֡;->֫(I)I

    move-result v3

    invoke-direct {v4, v2, v9, v5, v3}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v4, v8, v13

    move v13, v1

    :cond_13
    const/4 v11, -0x1

    goto/16 :goto_0

    :cond_14
    add-int/lit8 v12, v12, 0x1

    .line 567
    invoke-static {v3}, Ll/ܳ۠֡;->֫(I)I

    move-result v11

    :goto_8
    move v10, v9

    move v9, v2

    goto/16 :goto_0

    .line 397
    :cond_15
    div-int/lit8 v1, v15, 0x2

    add-int v16, v1, v9

    const/16 v1, 0x200

    if-gt v15, v1, :cond_1c

    const/16 v1, 0x20

    if-gt v15, v1, :cond_16

    add-int/lit8 v5, v10, -0x1

    move v1, v12

    move/from16 v2, p1

    move v3, v9

    move/from16 v4, v16

    .line 401
    invoke-direct/range {v0 .. v5}, Ll/ܳ۠֡;->ۧ(IIIII)I

    move-result v0

    goto/16 :goto_d

    :cond_16
    shr-int/lit8 v0, v15, 0x2

    add-int v1, v9, v0

    add-int/lit8 v2, v10, -0x1

    sub-int v0, v2, v0

    .line 316
    aget v3, v20, v9

    add-int/2addr v3, v7

    aget v3, v20, v3

    add-int/2addr v3, v12

    aget-byte v3, v19, v3

    and-int/lit16 v3, v3, 0xff

    .line 317
    aget v4, v20, v1

    add-int/2addr v4, v7

    aget v4, v20, v4

    add-int/2addr v4, v12

    aget-byte v4, v19, v4

    and-int/lit16 v4, v4, 0xff

    .line 318
    aget v5, v20, v16

    add-int/2addr v5, v7

    aget v5, v20, v5

    add-int/2addr v5, v12

    aget-byte v5, v19, v5

    and-int/lit16 v5, v5, 0xff

    .line 319
    aget v15, v20, v0

    add-int/2addr v15, v7

    aget v15, v20, v15

    add-int/2addr v15, v12

    aget-byte v15, v19, v15

    and-int/lit16 v15, v15, 0xff

    .line 320
    aget v17, v20, v2

    add-int v17, v7, v17

    aget v17, v20, v17

    add-int v17, v12, v17

    move/from16 p2, v0

    aget-byte v0, v19, v17

    and-int/lit16 v0, v0, 0xff

    if-le v4, v5, :cond_17

    move/from16 v21, v16

    move/from16 v16, v1

    move/from16 v1, v21

    move/from16 v22, v5

    move v5, v4

    move/from16 v4, v22

    :cond_17
    if-le v15, v0, :cond_18

    move/from16 v17, v15

    move v15, v0

    move/from16 v0, p2

    goto :goto_9

    :cond_18
    move/from16 v17, v0

    move v0, v2

    move/from16 v2, p2

    :goto_9
    if-le v4, v15, :cond_19

    move/from16 v21, v16

    move/from16 v16, v0

    move/from16 v0, v21

    move/from16 v22, v17

    move/from16 v17, v5

    move/from16 v5, v22

    goto :goto_a

    :cond_19
    move v1, v2

    move v4, v15

    :goto_a
    if-le v3, v5, :cond_1a

    move/from16 v2, v16

    move/from16 v16, v9

    move/from16 v21, v5

    move v5, v3

    move/from16 v3, v21

    goto :goto_b

    :cond_1a
    move v2, v9

    :goto_b
    if-le v3, v4, :cond_1b

    move v1, v2

    move v4, v3

    move/from16 v5, v17

    goto :goto_c

    :cond_1b
    move/from16 v0, v16

    :goto_c
    if-le v5, v4, :cond_1d

    move v0, v1

    goto :goto_d

    :cond_1c
    shr-int/lit8 v15, v15, 0x3

    add-int v4, v9, v15

    shl-int/lit8 v17, v15, 0x1

    add-int v5, v9, v17

    move-object/from16 v0, p0

    move v1, v12

    move/from16 v2, p1

    move v3, v9

    .line 407
    invoke-direct/range {v0 .. v5}, Ll/ܳ۠֡;->ۧ(IIIII)I

    move-result v18

    sub-int v3, v16, v15

    add-int v5, v16, v15

    move/from16 v4, v16

    invoke-direct/range {v0 .. v5}, Ll/ܳ۠֡;->ۧ(IIIII)I

    move-result v16

    add-int/lit8 v5, v10, -0x1

    sub-int v3, v5, v17

    sub-int v4, v5, v15

    invoke-direct/range {v0 .. v5}, Ll/ܳ۠֡;->ۧ(IIIII)I

    move-result v5

    move/from16 v3, v18

    move/from16 v4, v16

    invoke-direct/range {v0 .. v5}, Ll/ܳ۠֡;->ۧ(IIIII)I

    move-result v0

    .line 574
    :cond_1d
    :goto_d
    aget v1, v20, v0

    add-int v2, v7, v1

    aget v2, v20, v2

    add-int/2addr v2, v12

    aget-byte v2, v19, v2

    and-int/lit16 v2, v2, 0xff

    .line 90
    aget v3, v20, v9

    .line 91
    aput v1, v20, v9

    .line 92
    aput v3, v20, v0

    move v0, v9

    :goto_e
    add-int/lit8 v0, v0, 0x1

    if-ge v0, v10, :cond_1e

    .line 577
    aget v1, v20, v0

    add-int/2addr v1, v7

    aget v1, v20, v1

    add-int/2addr v1, v12

    aget-byte v1, v19, v1

    and-int/lit16 v14, v1, 0xff

    if-ne v14, v2, :cond_1e

    goto :goto_e

    :cond_1e
    if-ge v0, v10, :cond_20

    if-ge v14, v2, :cond_20

    move v1, v0

    :cond_1f
    :goto_f
    add-int/lit8 v0, v0, 0x1

    if-ge v0, v10, :cond_21

    .line 579
    aget v3, v20, v0

    add-int v4, v7, v3

    aget v4, v20, v4

    add-int/2addr v4, v12

    aget-byte v4, v19, v4

    and-int/lit16 v14, v4, 0xff

    if-gt v14, v2, :cond_21

    if-ne v14, v2, :cond_1f

    .line 91
    aget v4, v20, v1

    aput v4, v20, v0

    .line 92
    aput v3, v20, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_f

    :cond_20
    move v1, v0

    :cond_21
    move v3, v10

    :goto_10
    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_22

    .line 586
    aget v4, v20, v3

    add-int/2addr v4, v7

    aget v4, v20, v4

    add-int/2addr v4, v12

    aget-byte v4, v19, v4

    and-int/lit16 v14, v4, 0xff

    if-ne v14, v2, :cond_22

    goto :goto_10

    :cond_22
    if-ge v0, v3, :cond_24

    if-le v14, v2, :cond_24

    move v4, v3

    :cond_23
    :goto_11
    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_25

    .line 588
    aget v5, v20, v3

    add-int v14, v7, v5

    aget v14, v20, v14

    add-int/2addr v14, v12

    aget-byte v14, v19, v14

    and-int/lit16 v14, v14, 0xff

    if-lt v14, v2, :cond_25

    if-ne v14, v2, :cond_23

    .line 91
    aget v15, v20, v4

    aput v15, v20, v3

    .line 92
    aput v5, v20, v4

    add-int/lit8 v4, v4, -0x1

    goto :goto_11

    :cond_24
    move v4, v3

    :cond_25
    if-ge v0, v3, :cond_28

    .line 90
    aget v5, v20, v0

    .line 91
    aget v15, v20, v3

    aput v15, v20, v0

    .line 92
    aput v5, v20, v3

    :cond_26
    :goto_12
    add-int/lit8 v0, v0, 0x1

    if-ge v0, v3, :cond_27

    .line 597
    aget v5, v20, v0

    add-int v14, v7, v5

    aget v14, v20, v14

    add-int/2addr v14, v12

    aget-byte v14, v19, v14

    and-int/lit16 v14, v14, 0xff

    if-gt v14, v2, :cond_27

    if-ne v14, v2, :cond_26

    .line 91
    aget v15, v20, v1

    aput v15, v20, v0

    .line 92
    aput v5, v20, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_12

    :cond_27
    :goto_13
    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_25

    .line 603
    aget v5, v20, v3

    add-int v14, v7, v5

    aget v14, v20, v14

    add-int/2addr v14, v12

    aget-byte v14, v19, v14

    and-int/lit16 v14, v14, 0xff

    if-lt v14, v2, :cond_25

    if-ne v14, v2, :cond_27

    .line 91
    aget v15, v20, v4

    aput v15, v20, v3

    .line 92
    aput v5, v20, v4

    add-int/lit8 v4, v4, -0x1

    goto :goto_13

    :cond_28
    if-gt v1, v4, :cond_33

    add-int/lit8 v3, v0, -0x1

    sub-int v5, v1, v9

    sub-int v1, v0, v1

    if-le v5, v1, :cond_29

    move v5, v1

    :cond_29
    sub-int v15, v0, v5

    move/from16 v16, v9

    :goto_14
    if-lez v5, :cond_2a

    .line 90
    aget v17, v20, v16

    .line 91
    aget v18, v20, v15

    aput v18, v20, v16

    .line 92
    aput v17, v20, v15

    add-int/lit8 v5, v5, -0x1

    add-int/lit8 v16, v16, 0x1

    add-int/lit8 v15, v15, 0x1

    goto :goto_14

    :cond_2a
    sub-int v3, v4, v3

    sub-int v4, v10, v4

    add-int/lit8 v4, v4, -0x1

    if-le v3, v4, :cond_2b

    goto :goto_15

    :cond_2b
    move v4, v3

    :goto_15
    sub-int v5, v10, v4

    :goto_16
    if-lez v4, :cond_2c

    .line 90
    aget v15, v20, v0

    .line 91
    aget v16, v20, v5

    aput v16, v20, v0

    .line 92
    aput v15, v20, v5

    add-int/lit8 v4, v4, -0x1

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v5, v5, 0x1

    goto :goto_16

    :cond_2c
    add-int/2addr v1, v9

    sub-int v0, v10, v3

    .line 629
    aget v3, v20, v1

    add-int/2addr v3, v7

    aget v3, v20, v3

    add-int/2addr v3, v12

    add-int/lit8 v3, v3, -0x1

    aget-byte v3, v19, v3

    and-int/lit16 v3, v3, 0xff

    if-gt v2, v3, :cond_2d

    move v2, v1

    goto :goto_17

    :cond_2d
    invoke-direct {v6, v7, v1, v0, v12}, Ll/ܳ۠֡;->֫(IIII)I

    move-result v2

    :goto_17
    sub-int v3, v1, v9

    sub-int v4, v10, v0

    if-gt v3, v4, :cond_30

    sub-int v5, v0, v2

    if-gt v4, v5, :cond_2e

    add-int/lit8 v3, v13, 0x1

    .line 633
    new-instance v4, Ll/ܿ۠֡;

    add-int/lit8 v15, v12, 0x1

    invoke-static {v5}, Ll/ܳ۠֡;->֫(I)I

    move-result v5

    invoke-direct {v4, v2, v0, v15, v5}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v4, v8, v13

    add-int/lit8 v13, v13, 0x2

    .line 634
    new-instance v2, Ll/ܿ۠֡;

    invoke-direct {v2, v0, v10, v12, v11}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v2, v8, v3

    goto :goto_18

    :cond_2e
    if-gt v3, v5, :cond_2f

    add-int/lit8 v3, v13, 0x1

    .line 637
    new-instance v4, Ll/ܿ۠֡;

    invoke-direct {v4, v0, v10, v12, v11}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v4, v8, v13

    add-int/lit8 v13, v13, 0x2

    .line 638
    new-instance v4, Ll/ܿ۠֡;

    add-int/lit8 v10, v12, 0x1

    invoke-static {v5}, Ll/ܳ۠֡;->֫(I)I

    move-result v5

    invoke-direct {v4, v2, v0, v10, v5}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v4, v8, v3

    :goto_18
    move v10, v1

    goto/16 :goto_1c

    :cond_2f
    add-int/lit8 v3, v13, 0x1

    .line 641
    new-instance v4, Ll/ܿ۠֡;

    invoke-direct {v4, v0, v10, v12, v11}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v4, v8, v13

    add-int/lit8 v13, v13, 0x2

    .line 642
    new-instance v4, Ll/ܿ۠֡;

    invoke-direct {v4, v9, v1, v12, v11}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v4, v8, v3

    add-int/lit8 v12, v12, 0x1

    .line 646
    invoke-static {v5}, Ll/ܳ۠֡;->֫(I)I

    move-result v1

    goto :goto_1a

    :cond_30
    sub-int v5, v0, v2

    if-gt v3, v5, :cond_31

    add-int/lit8 v3, v13, 0x1

    .line 650
    new-instance v4, Ll/ܿ۠֡;

    add-int/lit8 v15, v12, 0x1

    invoke-static {v5}, Ll/ܳ۠֡;->֫(I)I

    move-result v5

    invoke-direct {v4, v2, v0, v15, v5}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v4, v8, v13

    add-int/lit8 v13, v13, 0x2

    .line 651
    new-instance v2, Ll/ܿ۠֡;

    invoke-direct {v2, v9, v1, v12, v11}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v2, v8, v3

    goto :goto_19

    :cond_31
    if-gt v4, v5, :cond_32

    add-int/lit8 v3, v13, 0x1

    .line 654
    new-instance v4, Ll/ܿ۠֡;

    invoke-direct {v4, v9, v1, v12, v11}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v4, v8, v13

    add-int/lit8 v13, v13, 0x2

    .line 655
    new-instance v1, Ll/ܿ۠֡;

    add-int/lit8 v4, v12, 0x1

    invoke-static {v5}, Ll/ܳ۠֡;->֫(I)I

    move-result v5

    invoke-direct {v1, v2, v0, v4, v5}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v1, v8, v3

    :goto_19
    move v9, v0

    goto :goto_1c

    :cond_32
    add-int/lit8 v3, v13, 0x1

    .line 658
    new-instance v4, Ll/ܿ۠֡;

    invoke-direct {v4, v9, v1, v12, v11}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v4, v8, v13

    add-int/lit8 v13, v13, 0x2

    .line 659
    new-instance v1, Ll/ܿ۠֡;

    invoke-direct {v1, v0, v10, v12, v11}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v1, v8, v3

    add-int/lit8 v12, v12, 0x1

    .line 663
    invoke-static {v5}, Ll/ܳ۠֡;->֫(I)I

    move-result v1

    :goto_1a
    move v10, v0

    move v11, v1

    move v9, v2

    goto :goto_1c

    .line 668
    :cond_33
    aget v0, v20, v9

    add-int/2addr v0, v7

    aget v0, v20, v0

    add-int/2addr v0, v12

    add-int/lit8 v0, v0, -0x1

    aget-byte v0, v19, v0

    and-int/lit16 v0, v0, 0xff

    if-ge v0, v2, :cond_34

    .line 669
    invoke-direct {v6, v7, v9, v10, v12}, Ll/ܳ۠֡;->֫(IIII)I

    move-result v9

    sub-int v0, v10, v9

    .line 670
    invoke-static {v0}, Ll/ܳ۠֡;->֫(I)I

    move-result v11

    goto :goto_1b

    :cond_34
    move/from16 v11, p3

    :goto_1b
    add-int/lit8 v12, v12, 0x1

    :goto_1c
    move-object v0, v6

    goto/16 :goto_0
.end method

.method private ܽ(IIIII)V
    .locals 16

    move-object/from16 v7, p0

    move/from16 v8, p1

    move/from16 v9, p2

    move/from16 v10, p3

    move/from16 v11, p4

    .line 1188
    rem-int/lit8 v12, p5, 0x2

    iget-object v13, v7, Ll/ܳ۠֡;->֫:[I

    if-nez v12, :cond_1

    add-int/lit8 v0, p5, -0x1

    .line 1190
    div-int/lit8 v1, v0, 0x2

    add-int/2addr v1, v11

    aget v2, v13, v1

    invoke-direct {v7, v8, v9, v10, v2}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v2

    add-int v3, v11, v0

    aget v4, v13, v3

    invoke-direct {v7, v8, v9, v10, v4}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v4

    if-ge v2, v4, :cond_0

    .line 90
    aget v2, v13, v3

    .line 91
    aget v4, v13, v1

    aput v4, v13, v3

    .line 92
    aput v2, v13, v1

    :cond_0
    move v14, v0

    goto :goto_0

    :cond_1
    move/from16 v14, p5

    .line 1195
    :goto_0
    div-int/lit8 v0, v14, 0x2

    add-int/lit8 v0, v0, -0x1

    move v15, v0

    :goto_1
    if-ltz v15, :cond_2

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move v5, v15

    move v6, v14

    .line 1196
    invoke-direct/range {v0 .. v6}, Ll/ܳ۠֡;->֫(IIIIII)V

    add-int/lit8 v15, v15, -0x1

    goto :goto_1

    :cond_2
    if-nez v12, :cond_3

    add-int v0, v11, v14

    .line 1200
    invoke-static {v11, v0, v13, v13}, Ll/ܳ۠֡;->֫(II[I[I)V

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move v6, v14

    .line 1201
    invoke-direct/range {v0 .. v6}, Ll/ܳ۠֡;->֫(IIIIII)V

    :cond_3
    :goto_2
    add-int/lit8 v14, v14, -0x1

    if-lez v14, :cond_4

    .line 1205
    aget v12, v13, v11

    add-int v15, v11, v14

    .line 1206
    aget v0, v13, v15

    aput v0, v13, v11

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move v6, v14

    .line 1207
    invoke-direct/range {v0 .. v6}, Ll/ܳ۠֡;->֫(IIIIII)V

    .line 1208
    aput v12, v13, v15

    goto :goto_2

    :cond_4
    return-void
.end method

.method private ܿ(IIIII)I
    .locals 17

    move-object/from16 v7, p0

    move/from16 v8, p1

    move/from16 v9, p2

    move/from16 v10, p3

    sub-int v0, p5, p4

    .line 1393
    div-int/lit8 v1, v0, 0x2

    add-int v11, v1, p4

    const/16 v1, 0x200

    if-gt v0, v1, :cond_7

    const/16 v1, 0x20

    if-gt v0, v1, :cond_0

    add-int/lit8 v6, p5, -0x1

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move v5, v11

    .line 1397
    invoke-direct/range {v0 .. v6}, Ll/ܳ۠֡;->ۧ(IIIIII)I

    move-result v0

    return v0

    :cond_0
    shr-int/lit8 v0, v0, 0x2

    add-int v1, p4, v0

    add-int/lit8 v2, p5, -0x1

    sub-int v0, v2, v0

    .line 1311
    iget-object v3, v7, Ll/ܳ۠֡;->֫:[I

    aget v4, v3, p4

    invoke-direct {v7, v8, v9, v10, v4}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v4

    .line 1312
    aget v5, v3, v1

    invoke-direct {v7, v8, v9, v10, v5}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v5

    .line 1313
    aget v6, v3, v11

    invoke-direct {v7, v8, v9, v10, v6}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v6

    .line 1314
    aget v12, v3, v0

    invoke-direct {v7, v8, v9, v10, v12}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v12

    .line 1315
    aget v3, v3, v2

    invoke-direct {v7, v8, v9, v10, v3}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v3

    if-le v5, v6, :cond_1

    move v15, v11

    move v11, v1

    move v1, v15

    move/from16 v16, v6

    move v6, v5

    move/from16 v5, v16

    :cond_1
    if-le v12, v3, :cond_2

    move v15, v12

    move v12, v3

    move v3, v15

    goto :goto_0

    :cond_2
    move v15, v2

    move v2, v0

    move v0, v15

    :goto_0
    if-le v5, v12, :cond_3

    move v15, v11

    move v11, v0

    move v0, v15

    move/from16 v16, v6

    move v6, v3

    move/from16 v3, v16

    goto :goto_1

    :cond_3
    move v1, v2

    move v5, v12

    :goto_1
    if-le v4, v6, :cond_4

    move v2, v11

    move/from16 v11, p4

    move v15, v6

    move v6, v4

    move v4, v15

    goto :goto_2

    :cond_4
    move/from16 v2, p4

    :goto_2
    if-le v4, v5, :cond_5

    move v1, v2

    move v5, v4

    goto :goto_3

    :cond_5
    move v3, v6

    move v0, v11

    :goto_3
    if-le v3, v5, :cond_6

    return v1

    :cond_6
    return v0

    :cond_7
    shr-int/lit8 v12, v0, 0x3

    add-int v5, p4, v12

    shl-int/lit8 v13, v12, 0x1

    add-int v6, p4, v13

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    .line 1408
    invoke-direct/range {v0 .. v6}, Ll/ܳ۠֡;->ۧ(IIIIII)I

    move-result v14

    sub-int v4, v11, v12

    add-int v6, v11, v12

    move v5, v11

    invoke-direct/range {v0 .. v6}, Ll/ܳ۠֡;->ۧ(IIIIII)I

    move-result v11

    add-int/lit8 v6, p5, -0x1

    sub-int v4, v6, v13

    sub-int v5, v6, v12

    invoke-direct/range {v0 .. v6}, Ll/ܳ۠֡;->ۧ(IIIIII)I

    move-result v6

    move v4, v14

    move v5, v11

    invoke-direct/range {v0 .. v6}, Ll/ܳ۠֡;->ۧ(IIIIII)I

    move-result v0

    return v0
.end method

.method private ᩳ(II)V
    .locals 32

    move/from16 v0, p2

    neg-int v1, v0

    move-object/from16 v2, p0

    .line 2192
    iget-object v3, v2, Ll/ܳ۠֡;->֫:[I

    const/4 v4, 0x0

    aget v4, v3, v4

    if-ge v1, v4, :cond_a0

    .line 2193
    invoke-static/range {p2 .. p2}, Ll/ܳ۠֡;->ۧ(I)I

    move-result v4

    const/4 v5, 0x2

    const/4 v6, 0x3

    const/4 v7, 0x1

    invoke-static {v4, v5, v6, v7}, Ll/᩻ᩳᩴ;->֫(IIII)I

    move-result v4

    const/4 v5, 0x0

    move v5, v0

    move v6, v1

    move-object v11, v2

    move-object v12, v11

    move-object v7, v3

    move v8, v4

    const/4 v9, 0x0

    const/4 v10, 0x1

    move/from16 v0, p1

    move v1, v0

    move v3, v5

    move v4, v3

    .line 2195
    :goto_0
    aget v13, v7, v9

    if-gez v13, :cond_0

    sub-int/2addr v9, v13

    goto/16 :goto_5f

    :cond_0
    add-int/2addr v13, v0

    .line 2199
    aget v13, v7, v13

    add-int/lit8 v13, v13, 0x1

    sub-int v14, v13, v9

    if-ge v10, v14, :cond_9e

    add-int/lit8 v10, v0, 0x1

    add-int v15, v0, v4

    move/from16 p1, v0

    const/16 v0, 0x40

    new-array v0, v0, [Ll/ܿ۠֡;

    .line 1821
    invoke-static {v14}, Ll/ܳ۠֡;->ۧ(I)I

    move-result v14

    const/16 v16, 0x0

    const/16 v17, 0x0

    move/from16 v16, v9

    move/from16 v17, v10

    move/from16 v18, v13

    move v2, v15

    const/16 v19, 0x0

    const/16 v20, 0x0

    move v9, v3

    move/from16 v15, v16

    move/from16 v3, p1

    move v10, v4

    move-object v4, v12

    move v12, v6

    move-object v13, v7

    move-object v7, v11

    move/from16 v6, v18

    move v11, v5

    move v5, v14

    move v14, v8

    move/from16 v8, v17

    :goto_1
    if-gez v5, :cond_36

    move/from16 p1, v11

    const/4 v11, -0x1

    if-ne v5, v11, :cond_24

    sub-int v5, v6, v15

    sub-int/2addr v9, v5

    if-gtz v9, :cond_2

    add-int/lit8 v14, v14, -0x1

    if-nez v14, :cond_1

    const/4 v5, 0x0

    goto :goto_2

    :cond_1
    add-int/2addr v9, v10

    :cond_2
    const/4 v5, 0x1

    :goto_2
    if-nez v5, :cond_3

    move/from16 v11, p1

    move/from16 v26, v2

    move/from16 v23, v18

    move v2, v1

    move v1, v3

    move-object/from16 v18, v13

    move/from16 v3, v19

    move-object v13, v7

    move-object v7, v4

    goto/16 :goto_3e

    :cond_3
    add-int/lit8 v5, v8, -0x1

    add-int/lit8 v11, v6, -0x1

    add-int/lit8 v21, v15, -0x1

    const/16 v22, 0x0

    :goto_3
    move/from16 p2, v9

    add-int/lit8 v9, v21, 0x1

    if-ge v9, v6, :cond_4

    move/from16 v21, v12

    .line 1707
    aget v12, v13, v9

    invoke-direct {v4, v3, v5, v2, v12}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v12

    if-ne v12, v11, :cond_5

    move/from16 v22, v12

    move/from16 v12, v21

    move/from16 v21, v9

    move/from16 v9, p2

    goto :goto_3

    :cond_4
    move/from16 v21, v12

    move/from16 v12, v22

    :cond_5
    if-ge v9, v6, :cond_9

    if-ge v12, v11, :cond_9

    move/from16 v22, v12

    move v12, v9

    :goto_4
    add-int/lit8 v9, v9, 0x1

    move/from16 v23, v14

    if-ge v9, v6, :cond_7

    .line 1709
    aget v14, v13, v9

    invoke-direct {v4, v3, v5, v2, v14}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v14

    if-gt v14, v11, :cond_8

    if-ne v14, v11, :cond_6

    .line 90
    aget v22, v13, v9

    .line 91
    aget v24, v13, v12

    aput v24, v13, v9

    .line 92
    aput v22, v13, v12

    add-int/lit8 v12, v12, 0x1

    :cond_6
    move/from16 v22, v14

    move/from16 v14, v23

    goto :goto_4

    :cond_7
    move/from16 v14, v22

    :cond_8
    move/from16 v29, v12

    move v12, v9

    move/from16 v9, v29

    goto :goto_5

    :cond_9
    move/from16 v23, v14

    move v14, v12

    move v12, v9

    :goto_5
    move/from16 v22, v6

    :goto_6
    move/from16 v24, v9

    add-int/lit8 v9, v22, -0x1

    if-ge v12, v9, :cond_a

    .line 1715
    aget v14, v13, v9

    invoke-direct {v4, v3, v5, v2, v14}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v14

    if-ne v14, v11, :cond_a

    move/from16 v22, v9

    move/from16 v9, v24

    goto :goto_6

    :cond_a
    if-ge v12, v9, :cond_c

    if-le v14, v11, :cond_c

    move v14, v9

    :goto_7
    add-int/lit8 v9, v9, -0x1

    move/from16 v22, v12

    if-ge v12, v9, :cond_d

    .line 1717
    aget v12, v13, v9

    invoke-direct {v4, v3, v5, v2, v12}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v12

    if-lt v12, v11, :cond_d

    if-ne v12, v11, :cond_b

    .line 90
    aget v12, v13, v9

    .line 91
    aget v25, v13, v14

    aput v25, v13, v9

    .line 92
    aput v12, v13, v14

    add-int/lit8 v14, v14, -0x1

    :cond_b
    move/from16 v12, v22

    goto :goto_7

    :cond_c
    move/from16 v22, v12

    move v14, v9

    :cond_d
    move/from16 v12, v24

    move/from16 v29, v22

    move-object/from16 v22, v7

    move/from16 v7, v29

    :goto_8
    if-ge v7, v9, :cond_12

    .line 90
    aget v24, v13, v7

    .line 91
    aget v25, v13, v9

    aput v25, v13, v7

    .line 92
    aput v24, v13, v9

    :goto_9
    add-int/lit8 v7, v7, 0x1

    move/from16 v24, v9

    if-ge v7, v9, :cond_f

    .line 1725
    aget v9, v13, v7

    invoke-direct {v4, v3, v5, v2, v9}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v9

    if-gt v9, v11, :cond_f

    if-ne v9, v11, :cond_e

    .line 90
    aget v9, v13, v7

    .line 91
    aget v25, v13, v12

    aput v25, v13, v7

    .line 92
    aput v9, v13, v12

    add-int/lit8 v12, v12, 0x1

    :cond_e
    move/from16 v9, v24

    goto :goto_9

    :cond_f
    move/from16 v9, v24

    :goto_a
    add-int/lit8 v9, v9, -0x1

    move/from16 v24, v7

    if-ge v7, v9, :cond_11

    .line 1730
    aget v7, v13, v9

    invoke-direct {v4, v3, v5, v2, v7}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v7

    if-lt v7, v11, :cond_11

    if-ne v7, v11, :cond_10

    .line 90
    aget v7, v13, v9

    .line 91
    aget v25, v13, v14

    aput v25, v13, v9

    .line 92
    aput v7, v13, v14

    add-int/lit8 v14, v14, -0x1

    :cond_10
    move/from16 v7, v24

    goto :goto_a

    :cond_11
    move/from16 v7, v24

    goto :goto_8

    :cond_12
    if-gt v12, v14, :cond_17

    add-int/lit8 v9, v7, -0x1

    sub-int v11, v12, v15

    sub-int v12, v7, v12

    if-le v11, v12, :cond_13

    move v11, v12

    :cond_13
    sub-int v24, v7, v11

    move/from16 v25, v15

    :goto_b
    if-lez v11, :cond_14

    .line 90
    aget v26, v13, v25

    .line 91
    aget v27, v13, v24

    aput v27, v13, v25

    .line 92
    aput v26, v13, v24

    add-int/lit8 v11, v11, -0x1

    add-int/lit8 v25, v25, 0x1

    add-int/lit8 v24, v24, 0x1

    goto :goto_b

    :cond_14
    sub-int v9, v14, v9

    sub-int v11, v6, v14

    add-int/lit8 v11, v11, -0x1

    if-le v9, v11, :cond_15

    goto :goto_c

    :cond_15
    move v11, v9

    :goto_c
    sub-int v14, v6, v11

    :goto_d
    if-lez v11, :cond_16

    .line 90
    aget v24, v13, v7

    .line 91
    aget v25, v13, v14

    aput v25, v13, v7

    .line 92
    aput v24, v13, v14

    add-int/lit8 v11, v11, -0x1

    add-int/lit8 v7, v7, 0x1

    add-int/lit8 v14, v14, 0x1

    goto :goto_d

    :cond_16
    add-int/2addr v12, v15

    sub-int v7, v6, v9

    goto :goto_e

    :cond_17
    move v7, v6

    move v12, v15

    :goto_e
    if-lt v15, v12, :cond_1b

    if-ge v7, v6, :cond_18

    goto :goto_11

    :cond_18
    :goto_f
    if-ge v15, v6, :cond_19

    .line 1875
    aget v5, v13, v15

    add-int/2addr v5, v3

    aput v15, v13, v5

    add-int/lit8 v15, v15, 0x1

    goto :goto_f

    :cond_19
    if-nez v19, :cond_1a

    move/from16 v9, p2

    move/from16 v14, v23

    goto/16 :goto_20

    :cond_1a
    add-int/lit8 v19, v19, -0x1

    .line 1878
    aget-object v3, v0, v19

    .line 1879
    iget v8, v3, Ll/ܿ۠֡;->֫:I

    .line 1880
    iget v15, v3, Ll/ܿ۠֡;->ۧ:I

    .line 1881
    iget v6, v3, Ll/ܿ۠֡;->ܽ:I

    .line 1882
    iget v3, v3, Ll/ܿ۠֡;->ᩳ:I

    move/from16 v9, p2

    :goto_10
    move/from16 v14, v23

    goto/16 :goto_21

    :cond_1b
    :goto_11
    if-ge v12, v6, :cond_1c

    add-int/lit8 v4, v12, -0x1

    move v9, v15

    :goto_12
    if-ge v9, v12, :cond_1c

    .line 1831
    aget v11, v13, v9

    add-int/2addr v11, v3

    aput v4, v13, v11

    add-int/lit8 v9, v9, 0x1

    goto :goto_12

    :cond_1c
    if-ge v7, v6, :cond_1d

    add-int/lit8 v4, v7, -0x1

    move v9, v12

    :goto_13
    if-ge v9, v7, :cond_1d

    .line 1836
    aget v11, v13, v9

    add-int/2addr v11, v3

    aput v4, v13, v11

    add-int/lit8 v9, v9, 0x1

    goto :goto_13

    :cond_1d
    add-int/lit8 v3, v19, 0x1

    .line 1840
    new-instance v4, Ll/ܿ۠֡;

    const/4 v9, 0x0

    invoke-direct {v4, v9, v12, v7, v9}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v4, v0, v19

    add-int/lit8 v4, v19, 0x2

    .line 1841
    new-instance v9, Ll/ܿ۠֡;

    const/4 v11, -0x2

    invoke-direct {v9, v5, v15, v6, v11}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v9, v0, v3

    sub-int v9, v12, v15

    sub-int v11, v6, v7

    if-gt v9, v11, :cond_20

    const/4 v14, 0x1

    if-ge v14, v9, :cond_1e

    add-int/lit8 v19, v19, 0x3

    .line 1844
    new-instance v3, Ll/ܿ۠֡;

    invoke-static {v11}, Ll/ܳ۠֡;->ۧ(I)I

    move-result v5

    invoke-direct {v3, v8, v7, v6, v5}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v3, v0, v4

    .line 1845
    invoke-static {v9}, Ll/ܳ۠֡;->ۧ(I)I

    move-result v3

    goto :goto_15

    :cond_1e
    if-ge v14, v11, :cond_1f

    .line 1847
    invoke-static {v11}, Ll/ܳ۠֡;->ۧ(I)I

    move-result v3

    move/from16 v9, p2

    move/from16 v19, v4

    goto :goto_14

    :cond_1f
    if-nez v4, :cond_23

    goto :goto_16

    :cond_20
    const/4 v14, 0x1

    if-ge v14, v11, :cond_21

    add-int/lit8 v19, v19, 0x3

    .line 1858
    new-instance v3, Ll/ܿ۠֡;

    invoke-static {v9}, Ll/ܳ۠֡;->ۧ(I)I

    move-result v5

    invoke-direct {v3, v8, v15, v12, v5}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v3, v0, v4

    .line 1860
    invoke-static {v11}, Ll/ܳ۠֡;->ۧ(I)I

    move-result v3

    move/from16 v9, p2

    :goto_14
    move v15, v7

    goto :goto_10

    :cond_21
    if-ge v14, v9, :cond_22

    .line 1863
    invoke-static {v9}, Ll/ܳ۠֡;->ۧ(I)I

    move-result v3

    move/from16 v19, v4

    :goto_15
    move/from16 v9, p2

    move v6, v12

    goto/16 :goto_10

    :cond_22
    if-nez v4, :cond_23

    :goto_16
    move/from16 v9, p2

    move/from16 v14, v23

    goto/16 :goto_1f

    :cond_23
    const/4 v4, -0x2

    move/from16 v9, p2

    move/from16 v19, v3

    move v8, v5

    move/from16 v14, v23

    const/4 v3, -0x2

    goto/16 :goto_21

    :cond_24
    move-object/from16 v22, v7

    move/from16 v21, v12

    const/4 v3, -0x2

    if-ne v5, v3, :cond_2c

    add-int/lit8 v3, v19, -0x1

    .line 1885
    aget-object v4, v0, v3

    iget v5, v4, Ll/ܿ۠֡;->ۧ:I

    .line 1886
    iget v4, v4, Ll/ܿ۠֡;->ܽ:I

    sub-int/2addr v8, v1

    add-int/lit8 v7, v4, -0x1

    add-int/lit8 v5, v5, -0x1

    :goto_17
    if-gt v15, v5, :cond_27

    .line 1779
    aget v11, v13, v15

    sub-int/2addr v11, v8

    if-gez v11, :cond_25

    sub-int v12, v2, v1

    add-int/2addr v11, v12

    :cond_25
    add-int v12, v1, v11

    move/from16 v23, v4

    .line 1782
    aget v4, v13, v12

    if-ne v4, v7, :cond_26

    add-int/lit8 v5, v5, 0x1

    .line 1783
    aput v11, v13, v5

    .line 1784
    aput v5, v13, v12

    :cond_26
    add-int/lit8 v15, v15, 0x1

    move/from16 v4, v23

    goto :goto_17

    :cond_27
    move/from16 v23, v4

    add-int/lit8 v6, v6, -0x1

    add-int/lit8 v5, v5, 0x1

    :goto_18
    if-ge v5, v4, :cond_2a

    .line 1788
    aget v11, v13, v6

    sub-int/2addr v11, v8

    if-gez v11, :cond_28

    sub-int v12, v2, v1

    add-int/2addr v11, v12

    :cond_28
    add-int v12, v1, v11

    .line 1791
    aget v15, v13, v12

    if-ne v15, v7, :cond_29

    add-int/lit8 v4, v4, -0x1

    .line 1792
    aput v11, v13, v4

    .line 1793
    aput v4, v13, v12

    :cond_29
    add-int/lit8 v6, v6, -0x1

    goto :goto_18

    :cond_2a
    if-nez v3, :cond_2b

    goto/16 :goto_1f

    :cond_2b
    add-int/lit8 v19, v19, -0x2

    .line 1889
    aget-object v3, v0, v19

    .line 1890
    iget v8, v3, Ll/ܿ۠֡;->֫:I

    .line 1891
    iget v15, v3, Ll/ܿ۠֡;->ۧ:I

    .line 1892
    iget v6, v3, Ll/ܿ۠֡;->ܽ:I

    .line 1893
    iget v3, v3, Ll/ܿ۠֡;->ᩳ:I

    goto/16 :goto_21

    .line 1895
    :cond_2c
    aget v3, v13, v15

    if-ltz v3, :cond_2e

    .line 1898
    :cond_2d
    aget v3, v13, v15

    add-int/2addr v3, v1

    aput v15, v13, v3

    add-int/lit8 v15, v15, 0x1

    if-ge v15, v6, :cond_2e

    .line 1899
    aget v3, v13, v15

    if-gez v3, :cond_2d

    :cond_2e
    if-ge v15, v6, :cond_34

    move v3, v15

    .line 1905
    :goto_19
    aget v4, v13, v3

    not-int v4, v4

    aput v4, v13, v3

    add-int/lit8 v4, v3, 0x1

    .line 1906
    aget v5, v13, v4

    if-ltz v5, :cond_33

    add-int v7, v1, v5

    .line 1907
    aget v7, v13, v7

    add-int/2addr v5, v8

    aget v5, v13, v5

    if-eq v7, v5, :cond_2f

    sub-int v5, v4, v15

    add-int/lit8 v5, v5, 0x1

    invoke-static {v5}, Ll/ܳ۠֡;->ۧ(I)I

    move-result v5

    goto :goto_1a

    :cond_2f
    const/4 v5, -0x1

    :goto_1a
    add-int/lit8 v3, v3, 0x2

    if-ge v3, v6, :cond_30

    move v7, v15

    :goto_1b
    if-ge v7, v3, :cond_30

    .line 1910
    aget v11, v13, v7

    add-int/2addr v11, v1

    aput v4, v13, v11

    add-int/lit8 v7, v7, 0x1

    goto :goto_1b

    :cond_30
    sub-int v4, v3, v15

    sub-int v7, v6, v3

    if-gt v4, v7, :cond_31

    add-int/lit8 v4, v19, 0x1

    .line 1915
    new-instance v7, Ll/ܿ۠֡;

    const/4 v11, -0x3

    invoke-direct {v7, v8, v3, v6, v11}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v7, v0, v19

    add-int/lit8 v8, v8, 0x1

    move v6, v3

    :goto_1c
    move/from16 v19, v4

    goto :goto_1d

    :cond_31
    const/4 v4, 0x1

    if-ge v4, v7, :cond_32

    add-int/lit8 v4, v19, 0x1

    .line 1919
    new-instance v7, Ll/ܿ۠֡;

    add-int/lit8 v11, v8, 0x1

    invoke-direct {v7, v11, v15, v3, v5}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v7, v0, v19

    const/4 v5, -0x3

    move v15, v3

    goto :goto_1c

    :goto_1d
    move/from16 v11, p1

    move v3, v1

    move/from16 v12, v21

    move-object/from16 v4, v22

    move-object v7, v4

    goto/16 :goto_1

    :cond_32
    add-int/lit8 v8, v8, 0x1

    move/from16 v11, p1

    move v6, v3

    :goto_1e
    move/from16 v12, v21

    move-object/from16 v4, v22

    move-object v7, v4

    move v3, v1

    goto/16 :goto_1

    :cond_33
    move v3, v4

    goto :goto_19

    :cond_34
    if-nez v19, :cond_35

    :goto_1f
    move v3, v1

    move-object/from16 v4, v22

    :goto_20
    move v0, v3

    move-object v12, v4

    move v3, v9

    move-object v7, v13

    move v8, v14

    move/from16 v5, v16

    move/from16 v13, v18

    move/from16 v6, v21

    move-object/from16 v11, v22

    move/from16 v4, p1

    goto/16 :goto_40

    :cond_35
    add-int/lit8 v19, v19, -0x1

    .line 1927
    aget-object v3, v0, v19

    .line 1928
    iget v8, v3, Ll/ܿ۠֡;->֫:I

    .line 1929
    iget v15, v3, Ll/ܿ۠֡;->ۧ:I

    .line 1930
    iget v6, v3, Ll/ܿ۠֡;->ܽ:I

    .line 1931
    iget v3, v3, Ll/ܿ۠֡;->ᩳ:I

    :goto_21
    move/from16 v11, p1

    move v5, v3

    goto :goto_1e

    :cond_36
    move-object/from16 v22, v7

    move/from16 p1, v11

    move/from16 v21, v12

    sub-int v11, v6, v15

    const/16 v3, 0x8

    if-gt v11, v3, :cond_3a

    sub-int/2addr v9, v11

    if-gtz v9, :cond_38

    add-int/lit8 v14, v14, -0x1

    if-nez v14, :cond_37

    const/4 v3, 0x0

    goto :goto_22

    :cond_37
    add-int/2addr v9, v10

    :cond_38
    const/4 v3, 0x1

    :goto_22
    if-nez v3, :cond_39

    move-object/from16 v8, v22

    goto :goto_24

    :cond_39
    move-object/from16 v3, v22

    move v4, v1

    move v5, v8

    move v12, v6

    move v6, v2

    move-object/from16 v11, v22

    move v7, v15

    move/from16 p2, v8

    move v8, v12

    .line 1939
    invoke-direct/range {v3 .. v8}, Ll/ܳ۠֡;->ᩳ(IIIII)V

    move/from16 v8, p2

    move-object/from16 v23, v0

    move-object v0, v11

    goto/16 :goto_27

    :cond_3a
    move v12, v6

    move/from16 p2, v8

    move-object/from16 v8, v22

    add-int/lit8 v22, v5, -0x1

    if-nez v5, :cond_40

    sub-int/2addr v9, v11

    if-gtz v9, :cond_3c

    add-int/lit8 v14, v14, -0x1

    if-nez v14, :cond_3b

    const/4 v3, 0x0

    goto :goto_23

    :cond_3b
    add-int/2addr v9, v10

    :cond_3c
    const/4 v3, 0x1

    :goto_23
    if-nez v3, :cond_3d

    :goto_24
    move/from16 v11, p1

    move/from16 v26, v2

    move-object v7, v8

    move/from16 v23, v18

    move/from16 v3, v19

    move/from16 v12, v21

    move v2, v1

    move-object/from16 v18, v13

    move-object v13, v7

    goto/16 :goto_3e

    :cond_3d
    move-object v3, v8

    move v4, v1

    move/from16 v5, p2

    move v6, v2

    move v7, v15

    move-object/from16 v23, v0

    move-object v0, v8

    move v8, v11

    .line 1946
    invoke-direct/range {v3 .. v8}, Ll/ܳ۠֡;->ܽ(IIIII)V

    add-int/lit8 v6, v12, -0x1

    :goto_25
    if-ge v15, v6, :cond_3f

    .line 1949
    aget v3, v13, v6

    move/from16 v8, p2

    invoke-direct {v0, v1, v8, v2, v3}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v3

    :goto_26
    add-int/lit8 v6, v6, -0x1

    if-gt v15, v6, :cond_3e

    .line 1950
    aget v4, v13, v6

    invoke-direct {v0, v1, v8, v2, v4}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v4

    if-ne v4, v3, :cond_3e

    .line 1954
    aget v4, v13, v6

    not-int v4, v4

    aput v4, v13, v6

    goto :goto_26

    :cond_3e
    move/from16 v20, v3

    move/from16 p2, v8

    goto :goto_25

    :cond_3f
    move/from16 v8, p2

    :goto_27
    const/4 v3, -0x3

    move/from16 v11, p1

    move-object v4, v0

    move-object v7, v4

    move v3, v1

    move v6, v12

    move/from16 v12, v21

    move-object/from16 v0, v23

    const/4 v5, -0x3

    goto/16 :goto_1

    :cond_40
    move-object/from16 v23, v0

    move-object v0, v8

    move/from16 v8, p2

    move-object v3, v0

    move v4, v1

    move v10, v5

    move v5, v8

    move v6, v2

    move v7, v15

    move/from16 p2, v9

    move v9, v8

    move v8, v12

    .line 1961
    invoke-direct/range {v3 .. v8}, Ll/ܳ۠֡;->ܿ(IIIII)I

    move-result v3

    .line 90
    aget v4, v13, v15

    .line 91
    aget v5, v13, v3

    aput v5, v13, v15

    .line 92
    aput v4, v13, v3

    .line 1964
    aget v3, v13, v15

    invoke-direct {v0, v1, v9, v2, v3}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v3

    move v4, v15

    :goto_28
    add-int/lit8 v4, v4, 0x1

    if-ge v4, v12, :cond_41

    .line 1965
    aget v5, v13, v4

    invoke-direct {v0, v1, v9, v2, v5}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v5

    if-ne v5, v3, :cond_42

    move/from16 v20, v5

    goto :goto_28

    :cond_41
    move/from16 v5, v20

    :cond_42
    if-ge v4, v12, :cond_44

    if-ge v5, v3, :cond_44

    move v6, v5

    move v5, v4

    :cond_43
    :goto_29
    add-int/lit8 v4, v4, 0x1

    if-ge v4, v12, :cond_45

    .line 1967
    aget v6, v13, v4

    invoke-direct {v0, v1, v9, v2, v6}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v6

    if-gt v6, v3, :cond_45

    if-ne v6, v3, :cond_43

    .line 90
    aget v7, v13, v4

    .line 91
    aget v8, v13, v5

    aput v8, v13, v4

    .line 92
    aput v7, v13, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_29

    :cond_44
    move v6, v5

    move v5, v4

    :cond_45
    move v7, v6

    move v6, v12

    :goto_2a
    add-int/lit8 v6, v6, -0x1

    if-ge v4, v6, :cond_46

    .line 1973
    aget v7, v13, v6

    invoke-direct {v0, v1, v9, v2, v7}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v7

    if-ne v7, v3, :cond_46

    goto :goto_2a

    :cond_46
    if-ge v4, v6, :cond_49

    if-le v7, v3, :cond_49

    move v8, v7

    move v7, v6

    :cond_47
    :goto_2b
    add-int/lit8 v6, v6, -0x1

    if-ge v4, v6, :cond_48

    .line 1975
    aget v8, v13, v6

    invoke-direct {v0, v1, v9, v2, v8}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v8

    if-lt v8, v3, :cond_48

    if-ne v8, v3, :cond_47

    .line 90
    aget v20, v13, v6

    .line 91
    aget v24, v13, v7

    aput v24, v13, v6

    .line 92
    aput v20, v13, v7

    add-int/lit8 v7, v7, -0x1

    goto :goto_2b

    :cond_48
    move/from16 v26, v8

    move/from16 v20, v14

    move/from16 v24, v18

    move/from16 v25, v19

    move/from16 v8, v22

    move/from16 v18, p1

    move v14, v9

    move-object/from16 v19, v13

    move/from16 v22, v21

    move-object v13, v0

    move v9, v6

    move/from16 v21, v16

    move/from16 v16, p2

    move-object v6, v13

    move-object/from16 v0, v23

    move/from16 v23, v17

    move/from16 v17, v11

    move v11, v7

    move v7, v5

    move v5, v4

    move v4, v3

    move v3, v1

    goto/16 :goto_2f

    :cond_49
    move/from16 v25, v7

    move/from16 v20, v16

    move/from16 v24, v19

    move/from16 v8, v22

    move v7, v5

    move/from16 v16, v11

    move/from16 v19, v14

    move/from16 v22, v17

    move/from16 v17, p1

    move/from16 p1, v1

    move v5, v4

    move v11, v6

    move v14, v9

    move v4, v3

    move v9, v11

    move-object v6, v0

    move/from16 v3, p1

    move v1, v15

    move/from16 v15, p2

    move-object/from16 v0, v23

    move/from16 v23, v18

    move-object/from16 v18, v13

    move-object v13, v6

    :goto_2c
    if-ge v5, v9, :cond_50

    .line 90
    aget v26, v18, v5

    .line 91
    aget v27, v18, v9

    aput v27, v18, v5

    .line 92
    aput v26, v18, v9

    :goto_2d
    add-int/lit8 v5, v5, 0x1

    move/from16 v26, v9

    if-ge v5, v9, :cond_4c

    .line 1984
    aget v9, v18, v5

    invoke-direct {v6, v3, v14, v2, v9}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v9

    if-gt v9, v4, :cond_4b

    if-ne v9, v4, :cond_4a

    .line 90
    aget v25, v18, v5

    .line 91
    aget v27, v18, v7

    aput v27, v18, v5

    .line 92
    aput v25, v18, v7

    add-int/lit8 v7, v7, 0x1

    :cond_4a
    move/from16 v25, v9

    move/from16 v9, v26

    goto :goto_2d

    :cond_4b
    move/from16 v25, v9

    move/from16 v9, v26

    :cond_4c
    move/from16 v26, v8

    move-object v8, v6

    move v6, v12

    move v12, v11

    move/from16 v11, v17

    move/from16 v17, v16

    move/from16 v16, v1

    move v1, v3

    move v3, v2

    move/from16 v2, p1

    :goto_2e
    add-int/lit8 v9, v9, -0x1

    move-object/from16 p1, v0

    if-ge v5, v9, :cond_4f

    .line 1990
    aget v0, v18, v9

    invoke-direct {v8, v1, v14, v3, v0}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v0

    if-lt v0, v4, :cond_4e

    if-ne v0, v4, :cond_4d

    .line 90
    aget v25, v18, v9

    .line 91
    aget v27, v18, v12

    aput v27, v18, v9

    .line 92
    aput v25, v18, v12

    add-int/lit8 v12, v12, -0x1

    :cond_4d
    move/from16 v25, v0

    move-object/from16 v0, p1

    goto :goto_2e

    :cond_4e
    move/from16 v25, v24

    move/from16 v24, v23

    move/from16 v23, v22

    move/from16 v22, v21

    move/from16 v21, v20

    move/from16 v20, v19

    move-object/from16 v19, v18

    move/from16 v18, v11

    move v11, v12

    move v12, v6

    move-object v6, v8

    move/from16 v8, v26

    move/from16 v26, v0

    move-object/from16 v0, p1

    move/from16 v29, v3

    move v3, v1

    move v1, v2

    move/from16 v2, v29

    move/from16 v30, v16

    move/from16 v16, v15

    move/from16 v15, v30

    goto :goto_2f

    :cond_4f
    move/from16 v29, v3

    move v3, v1

    move v1, v2

    move/from16 v2, v29

    move/from16 v30, v12

    move v12, v6

    move-object v6, v8

    move/from16 v8, v26

    move/from16 v26, v25

    move/from16 v25, v24

    move/from16 v24, v23

    move/from16 v23, v22

    move/from16 v22, v21

    move/from16 v21, v20

    move/from16 v20, v19

    move-object/from16 v19, v18

    move/from16 v18, v11

    move/from16 v11, v30

    move/from16 v31, v16

    move/from16 v16, v15

    move/from16 v15, v31

    :goto_2f
    move/from16 p1, v1

    move v1, v15

    move/from16 v15, v16

    move/from16 v16, v17

    move/from16 v17, v18

    move-object/from16 v18, v19

    move/from16 v19, v20

    move/from16 v20, v21

    move/from16 v21, v22

    move/from16 v22, v23

    move/from16 v23, v24

    move/from16 v24, v25

    move/from16 v25, v26

    goto/16 :goto_2c

    :cond_50
    if-gt v7, v11, :cond_6a

    add-int/lit8 v9, v5, -0x1

    sub-int v10, v7, v1

    sub-int v7, v5, v7

    if-le v10, v7, :cond_51

    move v10, v7

    :cond_51
    sub-int v16, v5, v10

    move/from16 v26, v1

    :goto_30
    if-lez v10, :cond_52

    .line 90
    aget v27, v18, v26

    .line 91
    aget v28, v18, v16

    aput v28, v18, v26

    .line 92
    aput v27, v18, v16

    add-int/lit8 v10, v10, -0x1

    add-int/lit8 v26, v26, 0x1

    add-int/lit8 v16, v16, 0x1

    goto :goto_30

    :cond_52
    sub-int v9, v11, v9

    sub-int v10, v12, v11

    add-int/lit8 v10, v10, -0x1

    if-le v9, v10, :cond_53

    goto :goto_31

    :cond_53
    move v10, v9

    :goto_31
    sub-int v11, v12, v10

    :goto_32
    if-lez v10, :cond_54

    .line 90
    aget v16, v18, v5

    .line 91
    aget v26, v18, v11

    aput v26, v18, v5

    .line 92
    aput v16, v18, v11

    add-int/lit8 v10, v10, -0x1

    add-int/lit8 v5, v5, 0x1

    add-int/lit8 v11, v11, 0x1

    goto :goto_32

    :cond_54
    add-int/2addr v7, v1

    sub-int v5, v12, v9

    .line 2016
    aget v9, v18, v7

    add-int/2addr v9, v3

    aget v9, v18, v9

    if-eq v9, v4, :cond_55

    sub-int v4, v5, v7

    invoke-static {v4}, Ll/ܳ۠֡;->ۧ(I)I

    move-result v4

    goto :goto_33

    :cond_55
    const/4 v4, -0x1

    :goto_33
    add-int/lit8 v9, v7, -0x1

    move v10, v1

    :goto_34
    if-ge v10, v7, :cond_56

    .line 2019
    aget v11, v18, v10

    add-int/2addr v11, v3

    aput v9, v18, v11

    add-int/lit8 v10, v10, 0x1

    goto :goto_34

    :cond_56
    if-ge v5, v12, :cond_57

    add-int/lit8 v9, v5, -0x1

    move v10, v7

    :goto_35
    if-ge v10, v5, :cond_57

    .line 2023
    aget v11, v18, v10

    add-int/2addr v11, v3

    aput v9, v18, v11

    add-int/lit8 v10, v10, 0x1

    goto :goto_35

    :cond_57
    sub-int v9, v7, v1

    sub-int v10, v12, v5

    if-gt v9, v10, :cond_60

    sub-int v11, v5, v7

    if-gt v10, v11, :cond_5c

    move/from16 v26, v2

    const/4 v2, 0x1

    if-ge v2, v9, :cond_58

    add-int/lit8 v2, v24, 0x1

    .line 2029
    new-instance v9, Ll/ܿ۠֡;

    add-int/lit8 v10, v14, 0x1

    invoke-direct {v9, v10, v7, v5, v4}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v9, v0, v24

    add-int/lit8 v24, v24, 0x2

    .line 2030
    new-instance v4, Ll/ܿ۠֡;

    invoke-direct {v4, v14, v5, v12, v8}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v4, v0, v2

    goto/16 :goto_38

    :cond_58
    if-ge v2, v10, :cond_59

    add-int/lit8 v1, v24, 0x1

    .line 2033
    new-instance v2, Ll/ܿ۠֡;

    add-int/lit8 v9, v14, 0x1

    invoke-direct {v2, v9, v7, v5, v4}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v2, v0, v24

    move v7, v5

    move v5, v8

    move v8, v14

    goto/16 :goto_37

    :cond_59
    if-ge v2, v11, :cond_5a

    goto/16 :goto_39

    :cond_5a
    if-nez v24, :cond_5b

    move/from16 v1, p1

    move v0, v3

    move-object v12, v6

    move-object v11, v13

    move v3, v15

    move/from16 v4, v17

    move-object/from16 v7, v18

    move/from16 v8, v19

    move/from16 v5, v20

    move/from16 v6, v21

    move/from16 v17, v22

    move/from16 v13, v23

    move/from16 v2, v26

    goto/16 :goto_40

    :cond_5b
    add-int/lit8 v24, v24, -0x1

    .line 2042
    aget-object v1, v0, v24

    .line 2043
    iget v14, v1, Ll/ܿ۠֡;->֫:I

    .line 2044
    iget v2, v1, Ll/ܿ۠֡;->ۧ:I

    .line 2045
    iget v12, v1, Ll/ܿ۠֡;->ܽ:I

    .line 2046
    iget v8, v1, Ll/ܿ۠֡;->ᩳ:I

    move v1, v2

    goto/16 :goto_3b

    :cond_5c
    move/from16 v26, v2

    if-gt v9, v11, :cond_5e

    const/4 v2, 0x1

    if-ge v2, v9, :cond_5d

    add-int/lit8 v2, v24, 0x1

    .line 2050
    new-instance v9, Ll/ܿ۠֡;

    invoke-direct {v9, v14, v5, v12, v8}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v9, v0, v24

    add-int/lit8 v24, v24, 0x2

    .line 2051
    new-instance v9, Ll/ܿ۠֡;

    add-int/lit8 v10, v14, 0x1

    invoke-direct {v9, v10, v7, v5, v4}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v9, v0, v2

    goto/16 :goto_38

    :cond_5d
    if-ge v2, v11, :cond_65

    add-int/lit8 v1, v24, 0x1

    .line 2054
    new-instance v2, Ll/ܿ۠֡;

    invoke-direct {v2, v14, v5, v12, v8}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v2, v0, v24

    add-int/lit8 v14, v14, 0x1

    move/from16 v24, v1

    goto/16 :goto_3a

    :cond_5e
    const/4 v2, 0x1

    if-ge v2, v11, :cond_5f

    add-int/lit8 v2, v24, 0x1

    .line 2064
    new-instance v9, Ll/ܿ۠֡;

    invoke-direct {v9, v14, v5, v12, v8}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v9, v0, v24

    add-int/lit8 v24, v24, 0x2

    .line 2065
    new-instance v9, Ll/ܿ۠֡;

    invoke-direct {v9, v14, v1, v7, v8}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v9, v0, v2

    goto/16 :goto_39

    :cond_5f
    add-int/lit8 v2, v24, 0x1

    .line 2071
    new-instance v4, Ll/ܿ۠֡;

    invoke-direct {v4, v14, v5, v12, v8}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v4, v0, v24

    goto/16 :goto_3c

    :cond_60
    move/from16 v26, v2

    sub-int v2, v5, v7

    if-gt v9, v2, :cond_64

    const/4 v11, 0x1

    if-ge v11, v10, :cond_61

    add-int/lit8 v2, v24, 0x1

    .line 2078
    new-instance v9, Ll/ܿ۠֡;

    add-int/lit8 v10, v14, 0x1

    invoke-direct {v9, v10, v7, v5, v4}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v9, v0, v24

    add-int/lit8 v24, v24, 0x2

    .line 2079
    new-instance v4, Ll/ܿ۠֡;

    invoke-direct {v4, v14, v1, v7, v8}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v4, v0, v2

    goto :goto_36

    :cond_61
    if-ge v11, v9, :cond_62

    add-int/lit8 v2, v24, 0x1

    .line 2082
    new-instance v9, Ll/ܿ۠֡;

    add-int/lit8 v10, v14, 0x1

    invoke-direct {v9, v10, v7, v5, v4}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v9, v0, v24

    move/from16 v24, v2

    goto/16 :goto_38

    :cond_62
    if-ge v11, v2, :cond_63

    goto/16 :goto_39

    :cond_63
    add-int/lit8 v2, v24, 0x1

    .line 2090
    new-instance v4, Ll/ܿ۠֡;

    invoke-direct {v4, v14, v1, v12, v8}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v4, v0, v24

    move/from16 v24, v2

    goto/16 :goto_3b

    :cond_64
    const/4 v9, 0x1

    if-gt v10, v2, :cond_68

    if-ge v9, v10, :cond_66

    add-int/lit8 v2, v24, 0x1

    .line 2094
    new-instance v9, Ll/ܿ۠֡;

    invoke-direct {v9, v14, v1, v7, v8}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v9, v0, v24

    add-int/lit8 v24, v24, 0x2

    .line 2095
    new-instance v1, Ll/ܿ۠֡;

    add-int/lit8 v9, v14, 0x1

    invoke-direct {v1, v9, v7, v5, v4}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v1, v0, v2

    :cond_65
    :goto_36
    move v1, v5

    goto :goto_3b

    :cond_66
    if-ge v9, v2, :cond_67

    add-int/lit8 v2, v24, 0x1

    .line 2098
    new-instance v9, Ll/ܿ۠֡;

    invoke-direct {v9, v14, v1, v7, v8}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v9, v0, v24

    add-int/lit8 v14, v14, 0x1

    move v1, v2

    move v12, v5

    move v8, v14

    move v5, v4

    :goto_37
    move-object v4, v6

    move v6, v12

    move v9, v15

    move/from16 v10, v17

    move v11, v10

    move/from16 v14, v19

    move/from16 v16, v20

    move/from16 v12, v21

    move/from16 v17, v22

    move/from16 v20, v25

    move/from16 v2, v26

    move/from16 v19, v1

    move v15, v7

    move-object v7, v13

    move-object/from16 v13, v18

    move/from16 v18, v23

    goto/16 :goto_5d

    :cond_67
    :goto_38
    move v12, v7

    goto :goto_3b

    :cond_68
    if-ge v9, v2, :cond_69

    add-int/lit8 v2, v24, 0x1

    .line 2108
    new-instance v9, Ll/ܿ۠֡;

    invoke-direct {v9, v14, v1, v7, v8}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v9, v0, v24

    add-int/lit8 v24, v24, 0x2

    .line 2109
    new-instance v1, Ll/ܿ۠֡;

    invoke-direct {v1, v14, v5, v12, v8}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v1, v0, v2

    :goto_39
    add-int/lit8 v14, v14, 0x1

    :goto_3a
    move v8, v4

    move v12, v5

    move v1, v7

    :goto_3b
    move-object v4, v6

    move v5, v8

    move v6, v12

    move-object v7, v13

    move v8, v14

    move v9, v15

    move/from16 v10, v17

    move v11, v10

    move-object/from16 v13, v18

    move/from16 v14, v19

    move/from16 v16, v20

    move/from16 v12, v21

    move/from16 v17, v22

    move/from16 v18, v23

    move/from16 v19, v24

    move/from16 v20, v25

    move/from16 v2, v26

    move v15, v1

    goto/16 :goto_5d

    :cond_69
    add-int/lit8 v2, v24, 0x1

    .line 2115
    new-instance v4, Ll/ܿ۠֡;

    invoke-direct {v4, v14, v1, v7, v8}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v4, v0, v24

    move v1, v5

    move v7, v12

    :goto_3c
    move-object v4, v6

    move v6, v7

    move v5, v8

    move-object v7, v13

    move v8, v14

    move v9, v15

    move/from16 v10, v17

    move v11, v10

    move-object/from16 v13, v18

    move/from16 v14, v19

    move/from16 v16, v20

    move/from16 v12, v21

    move/from16 v17, v22

    move/from16 v18, v23

    move/from16 v20, v25

    move v15, v1

    move/from16 v19, v2

    goto/16 :goto_5c

    :cond_6a
    move/from16 v26, v2

    sub-int v15, v15, v16

    if-gtz v15, :cond_6c

    add-int/lit8 v19, v19, -0x1

    if-nez v19, :cond_6b

    const/4 v2, 0x0

    goto :goto_3d

    :cond_6b
    add-int v15, v15, v17

    :cond_6c
    const/4 v2, 0x1

    :goto_3d
    move v9, v15

    if-nez v2, :cond_9d

    move/from16 v2, p1

    move v1, v3

    move-object v7, v6

    move/from16 v11, v17

    move/from16 v14, v19

    move/from16 v16, v20

    move/from16 v12, v21

    move/from16 v17, v22

    move/from16 v3, v24

    :goto_3e
    const/4 v4, 0x0

    :goto_3f
    if-ge v4, v3, :cond_6e

    .line 2127
    aget-object v5, v0, v4

    iget v6, v5, Ll/ܿ۠֡;->ᩳ:I

    const/4 v8, -0x3

    if-ne v6, v8, :cond_6d

    .line 2128
    iget v6, v5, Ll/ܿ۠֡;->ۧ:I

    iget v5, v5, Ll/ܿ۠֡;->ܽ:I

    invoke-direct {v7, v1, v6, v5}, Ll/ܳ۠֡;->֫(III)V

    :cond_6d
    add-int/lit8 v4, v4, 0x1

    goto :goto_3f

    :cond_6e
    move v0, v1

    move v1, v2

    move v3, v9

    move v4, v11

    move v6, v12

    move-object v11, v13

    move v8, v14

    move/from16 v5, v16

    move/from16 v13, v23

    move/from16 v2, v26

    move-object v12, v7

    move-object/from16 v7, v18

    :goto_40
    if-nez v8, :cond_9c

    if-lez v5, :cond_9a

    neg-int v1, v5

    const/4 v3, 0x0

    .line 2205
    aput v1, v7, v3

    .line 1623
    :goto_41
    aget v1, v7, v3

    if-ge v6, v1, :cond_a0

    const/4 v1, 0x0

    const/4 v3, 0x0

    .line 1627
    :cond_6f
    aget v5, v7, v3

    if-gez v5, :cond_70

    sub-int/2addr v3, v5

    add-int/2addr v1, v5

    goto/16 :goto_58

    :cond_70
    if-eqz v1, :cond_71

    add-int v8, v3, v1

    .line 1632
    aput v1, v7, v8

    const/4 v1, 0x0

    :cond_71
    add-int/2addr v5, v0

    .line 1635
    aget v5, v7, v5

    const/4 v8, 0x1

    add-int/lit8 v5, v5, 0x1

    const/16 v9, 0x40

    new-array v9, v9, [Ll/ܿ۠֡;

    sub-int v10, v5, v3

    .line 1477
    invoke-static {v10}, Ll/ܳ۠֡;->ۧ(I)I

    move-result v10

    const/4 v11, 0x0

    const/4 v13, 0x0

    move/from16 p1, v1

    move-object v8, v7

    move v11, v10

    move-object v13, v12

    move/from16 v15, v17

    const/4 v12, 0x0

    const/4 v14, 0x0

    move v7, v6

    move-object v10, v9

    const/4 v9, 0x1

    move v6, v5

    :goto_42
    sub-int v1, v5, v3

    move/from16 p2, v4

    const/16 v4, 0x8

    if-gt v1, v4, :cond_75

    if-ge v9, v1, :cond_72

    move-object/from16 v18, v13

    move/from16 v19, v0

    move/from16 v20, v15

    move/from16 v21, v2

    move/from16 v22, v3

    move/from16 v23, v5

    .line 1481
    invoke-direct/range {v18 .. v23}, Ll/ܳ۠֡;->ᩳ(IIIII)V

    .line 1482
    invoke-direct {v13, v0, v3, v5}, Ll/ܳ۠֡;->֫(III)V

    goto :goto_43

    :cond_72
    if-ne v1, v9, :cond_73

    const/4 v1, -0x1

    .line 1484
    aput v1, v8, v3

    :cond_73
    :goto_43
    if-nez v14, :cond_74

    goto :goto_46

    :cond_74
    add-int/lit8 v14, v14, -0x1

    .line 1487
    aget-object v1, v10, v14

    .line 1488
    iget v3, v1, Ll/ܿ۠֡;->֫:I

    .line 1489
    iget v4, v1, Ll/ܿ۠֡;->ۧ:I

    .line 1490
    iget v1, v1, Ll/ܿ۠֡;->ܽ:I

    :goto_44
    move v11, v1

    move v5, v4

    goto :goto_47

    :cond_75
    add-int/lit8 v4, v11, -0x1

    if-nez v11, :cond_79

    move-object/from16 v18, v13

    move/from16 v19, v0

    move/from16 v20, v15

    move/from16 v21, v2

    move/from16 v22, v3

    move/from16 v23, v1

    .line 1495
    invoke-direct/range {v18 .. v23}, Ll/ܳ۠֡;->ܽ(IIIII)V

    add-int/lit8 v1, v5, -0x1

    :cond_76
    if-ge v3, v1, :cond_77

    .line 1498
    aget v4, v8, v1

    invoke-direct {v13, v0, v15, v2, v4}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v12

    :goto_45
    add-int/lit8 v1, v1, -0x1

    if-gt v3, v1, :cond_76

    .line 1499
    aget v4, v8, v1

    invoke-direct {v13, v0, v15, v2, v4}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v4

    if-ne v4, v12, :cond_76

    .line 1503
    aget v4, v8, v1

    not-int v4, v4

    aput v4, v8, v1

    goto :goto_45

    .line 1506
    :cond_77
    invoke-direct {v13, v0, v3, v5}, Ll/ܳ۠֡;->֫(III)V

    if-nez v14, :cond_78

    :goto_46
    move/from16 v1, p1

    move/from16 v4, p2

    goto/16 :goto_57

    :cond_78
    add-int/lit8 v14, v14, -0x1

    .line 1508
    aget-object v1, v10, v14

    .line 1509
    iget v3, v1, Ll/ܿ۠֡;->֫:I

    .line 1510
    iget v4, v1, Ll/ܿ۠֡;->ۧ:I

    .line 1511
    iget v1, v1, Ll/ܿ۠֡;->ܽ:I

    goto :goto_44

    :goto_47
    const/4 v9, 0x1

    move/from16 v4, p2

    goto :goto_42

    :cond_79
    move-object/from16 v18, v13

    move/from16 v19, v0

    move/from16 v20, v15

    move/from16 v21, v2

    move/from16 v22, v3

    move/from16 v23, v5

    .line 1515
    invoke-direct/range {v18 .. v23}, Ll/ܳ۠֡;->ܿ(IIIII)I

    move-result v1

    .line 90
    aget v9, v8, v3

    .line 91
    aget v11, v8, v1

    aput v11, v8, v3

    .line 92
    aput v9, v8, v1

    .line 1517
    aget v1, v8, v3

    invoke-direct {v13, v0, v15, v2, v1}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v1

    move v9, v3

    :goto_48
    add-int/lit8 v9, v9, 0x1

    if-ge v9, v5, :cond_7a

    .line 1519
    aget v11, v8, v9

    invoke-direct {v13, v0, v15, v2, v11}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v12

    if-ne v12, v1, :cond_7a

    goto :goto_48

    :cond_7a
    if-ge v9, v5, :cond_7c

    if-ge v12, v1, :cond_7c

    move v11, v9

    :cond_7b
    :goto_49
    add-int/lit8 v9, v9, 0x1

    if-ge v9, v5, :cond_7d

    .line 1521
    aget v12, v8, v9

    invoke-direct {v13, v0, v15, v2, v12}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v12

    if-gt v12, v1, :cond_7d

    if-ne v12, v1, :cond_7b

    .line 90
    aget v16, v8, v9

    .line 91
    aget v17, v8, v11

    aput v17, v8, v9

    .line 92
    aput v16, v8, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_49

    :cond_7c
    move v11, v9

    :cond_7d
    move/from16 v16, v5

    :goto_4a
    move/from16 v17, v3

    add-int/lit8 v3, v16, -0x1

    if-ge v9, v3, :cond_7e

    .line 1528
    aget v12, v8, v3

    invoke-direct {v13, v0, v15, v2, v12}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v12

    if-ne v12, v1, :cond_7e

    move/from16 v16, v3

    move/from16 v3, v17

    goto :goto_4a

    :cond_7e
    if-ge v9, v3, :cond_82

    if-le v12, v1, :cond_82

    move/from16 v16, v12

    move v12, v3

    :goto_4b
    add-int/lit8 v3, v3, -0x1

    move/from16 v18, v4

    if-ge v9, v3, :cond_81

    .line 1530
    aget v4, v8, v3

    invoke-direct {v13, v0, v15, v2, v4}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v4

    if-lt v4, v1, :cond_80

    if-ne v4, v1, :cond_7f

    .line 90
    aget v16, v8, v3

    .line 91
    aget v19, v8, v12

    aput v19, v8, v3

    .line 92
    aput v16, v8, v12

    add-int/lit8 v12, v12, -0x1

    :cond_7f
    move/from16 v16, v4

    move/from16 v4, v18

    goto :goto_4b

    :cond_80
    move/from16 v16, v4

    :cond_81
    move v4, v3

    move v3, v2

    goto :goto_4c

    :cond_82
    move/from16 v18, v4

    move v4, v3

    move/from16 v16, v12

    move v3, v2

    move v12, v4

    :goto_4c
    move v2, v1

    move v1, v0

    move-object v0, v13

    move v13, v9

    move v9, v6

    move v6, v15

    move v15, v11

    move-object v11, v8

    move v8, v5

    move/from16 v5, v17

    move/from16 v17, v14

    move-object v14, v10

    move v10, v7

    move/from16 v7, v18

    :goto_4d
    if-ge v13, v4, :cond_89

    .line 90
    aget v18, v11, v13

    .line 91
    aget v19, v11, v4

    aput v19, v11, v13

    .line 92
    aput v18, v11, v4

    :goto_4e
    add-int/lit8 v13, v13, 0x1

    move/from16 v18, v4

    if-ge v13, v4, :cond_85

    .line 1539
    aget v4, v11, v13

    invoke-direct {v0, v1, v6, v3, v4}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v4

    if-gt v4, v2, :cond_84

    if-ne v4, v2, :cond_83

    .line 90
    aget v16, v11, v13

    .line 91
    aget v19, v11, v15

    aput v19, v11, v13

    .line 92
    aput v16, v11, v15

    add-int/lit8 v15, v15, 0x1

    :cond_83
    move/from16 v16, v4

    move/from16 v4, v18

    goto :goto_4e

    :cond_84
    move/from16 v16, v15

    move/from16 v19, v17

    move/from16 v17, v4

    move-object v15, v14

    move v4, v2

    move v14, v13

    move-object v2, v0

    move v13, v12

    move/from16 v0, p1

    goto :goto_4f

    :cond_85
    move v4, v2

    move/from16 v19, v17

    move-object v2, v0

    move/from16 v17, v16

    move/from16 v0, p1

    move/from16 v16, v15

    move-object v15, v14

    move v14, v13

    move v13, v12

    :goto_4f
    move-object v12, v11

    move v11, v10

    move v10, v9

    move v9, v8

    move v8, v7

    move v7, v6

    move v6, v5

    move v5, v3

    move v3, v1

    :goto_50
    move/from16 v1, p2

    move/from16 p1, v0

    add-int/lit8 v0, v18, -0x1

    move/from16 p2, v1

    if-ge v14, v0, :cond_88

    .line 1545
    aget v1, v12, v0

    invoke-direct {v2, v3, v7, v5, v1}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v1

    if-lt v1, v4, :cond_87

    if-ne v1, v4, :cond_86

    .line 90
    aget v17, v12, v0

    .line 91
    aget v18, v12, v13

    aput v18, v12, v0

    .line 92
    aput v17, v12, v13

    add-int/lit8 v13, v13, -0x1

    :cond_86
    move/from16 v18, v0

    move/from16 v17, v1

    move/from16 v0, p1

    goto :goto_50

    :cond_87
    move/from16 v17, v1

    :cond_88
    move v1, v3

    move v3, v5

    move v5, v6

    move v6, v7

    move v7, v8

    move v8, v9

    move v9, v10

    move v10, v11

    move-object v11, v12

    move v12, v13

    move v13, v14

    move-object v14, v15

    move/from16 v15, v16

    move/from16 v16, v17

    move/from16 v17, v19

    move/from16 v29, v4

    move v4, v0

    move-object v0, v2

    move/from16 v2, v29

    goto/16 :goto_4d

    :cond_89
    if-gt v15, v12, :cond_94

    add-int/lit8 v2, v13, -0x1

    sub-int v4, v15, v5

    sub-int v15, v13, v15

    if-le v4, v15, :cond_8a

    move v4, v15

    :cond_8a
    sub-int v18, v13, v4

    move/from16 v19, v5

    :goto_51
    if-lez v4, :cond_8b

    .line 90
    aget v20, v11, v19

    .line 91
    aget v21, v11, v18

    aput v21, v11, v19

    .line 92
    aput v20, v11, v18

    add-int/lit8 v4, v4, -0x1

    add-int/lit8 v19, v19, 0x1

    add-int/lit8 v18, v18, 0x1

    goto :goto_51

    :cond_8b
    sub-int v2, v12, v2

    sub-int v4, v8, v12

    add-int/lit8 v4, v4, -0x1

    if-le v2, v4, :cond_8c

    goto :goto_52

    :cond_8c
    move v4, v2

    :goto_52
    sub-int v12, v8, v4

    :goto_53
    if-lez v4, :cond_8d

    .line 90
    aget v18, v11, v13

    .line 91
    aget v19, v11, v12

    aput v19, v11, v13

    .line 92
    aput v18, v11, v12

    add-int/lit8 v4, v4, -0x1

    add-int/lit8 v13, v13, 0x1

    add-int/lit8 v12, v12, 0x1

    goto :goto_53

    :cond_8d
    add-int/2addr v15, v5

    sub-int v2, v8, v2

    add-int/lit8 v4, v15, -0x1

    move v12, v5

    :goto_54
    if-ge v12, v15, :cond_8e

    .line 1573
    aget v13, v11, v12

    add-int/2addr v13, v1

    aput v4, v11, v13

    add-int/lit8 v12, v12, 0x1

    goto :goto_54

    :cond_8e
    if-ge v2, v8, :cond_8f

    add-int/lit8 v4, v2, -0x1

    move v12, v15

    :goto_55
    if-ge v12, v2, :cond_8f

    .line 1577
    aget v13, v11, v12

    add-int/2addr v13, v1

    aput v4, v11, v13

    add-int/lit8 v12, v12, 0x1

    goto :goto_55

    :cond_8f
    sub-int v4, v2, v15

    const/4 v12, 0x1

    const/4 v13, -0x1

    if-ne v4, v12, :cond_90

    .line 1581
    aput v13, v11, v15

    :cond_90
    sub-int v4, v15, v5

    sub-int v12, v8, v2

    if-gt v4, v12, :cond_92

    if-ge v5, v15, :cond_91

    add-int/lit8 v4, v17, 0x1

    .line 1586
    new-instance v12, Ll/ܿ۠֡;

    const/4 v13, 0x0

    invoke-direct {v12, v2, v8, v7, v13}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v12, v14, v17

    move v8, v15

    goto :goto_56

    :cond_91
    move v5, v2

    goto/16 :goto_5b

    :cond_92
    const/4 v4, 0x0

    if-ge v2, v8, :cond_93

    add-int/lit8 v12, v17, 0x1

    .line 1593
    new-instance v13, Ll/ܿ۠֡;

    invoke-direct {v13, v5, v15, v7, v4}, Ll/ܿ۠֡;-><init>(IIII)V

    aput-object v13, v14, v17

    move v5, v2

    move v4, v12

    :goto_56
    move/from16 v17, v4

    goto/16 :goto_5b

    :cond_93
    move v8, v15

    goto :goto_5b

    :cond_94
    if-nez v17, :cond_9b

    move/from16 v4, p2

    move-object v13, v0

    move v0, v1

    move v2, v3

    move v15, v6

    move v6, v9

    move v7, v10

    move-object v8, v11

    move/from16 v1, p1

    :goto_57
    move v3, v6

    move v6, v7

    move-object v7, v8

    move-object v12, v13

    move/from16 v17, v15

    :goto_58
    if-lt v3, v4, :cond_6f

    if-eqz v1, :cond_95

    add-int/2addr v3, v1

    .line 1641
    aput v1, v7, v3

    :cond_95
    sub-int v1, v17, v0

    if-ge v4, v1, :cond_99

    const/4 v1, 0x0

    .line 1646
    :cond_96
    aget v2, v7, v1

    if-gez v2, :cond_97

    sub-int/2addr v1, v2

    goto :goto_5a

    :cond_97
    add-int/2addr v2, v0

    .line 1650
    aget v2, v7, v2

    add-int/lit8 v2, v2, 0x1

    :goto_59
    if-ge v1, v2, :cond_98

    .line 1652
    aget v3, v7, v1

    add-int/2addr v3, v0

    aput v1, v7, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_59

    :cond_98
    move v1, v2

    :goto_5a
    if-lt v1, v4, :cond_96

    goto/16 :goto_60

    :cond_99
    add-int v17, v17, v1

    :cond_9a
    const/4 v3, 0x0

    goto/16 :goto_41

    :cond_9b
    add-int/lit8 v17, v17, -0x1

    .line 1601
    aget-object v2, v14, v17

    .line 1602
    iget v4, v2, Ll/ܿ۠֡;->֫:I

    .line 1603
    iget v5, v2, Ll/ܿ۠֡;->ۧ:I

    .line 1604
    iget v2, v2, Ll/ܿ۠֡;->ܽ:I

    move v7, v2

    move v8, v5

    move v5, v4

    :goto_5b
    const/4 v2, 0x1

    move/from16 v4, p2

    move-object v13, v0

    move v0, v1

    move v2, v3

    move v3, v5

    move v15, v6

    move v5, v8

    move v6, v9

    move-object v8, v11

    move/from16 v12, v16

    const/4 v9, 0x1

    move v11, v7

    move v7, v10

    move-object v10, v14

    move/from16 v14, v17

    goto/16 :goto_42

    :cond_9c
    move v5, v4

    goto :goto_5e

    :cond_9d
    add-int/lit8 v8, v14, 0x1

    move v15, v1

    move-object v4, v6

    move v5, v10

    move v6, v12

    move-object v7, v13

    move/from16 v10, v17

    move v11, v10

    move-object/from16 v13, v18

    move/from16 v14, v19

    move/from16 v16, v20

    move/from16 v12, v21

    move/from16 v17, v22

    move/from16 v18, v23

    move/from16 v19, v24

    move/from16 v20, v25

    :goto_5c
    move/from16 v2, v26

    :goto_5d
    move/from16 v1, p1

    goto/16 :goto_1

    :cond_9e
    move/from16 p1, v0

    :goto_5e
    move v9, v13

    :goto_5f
    if-lt v9, v4, :cond_9f

    goto :goto_60

    :cond_9f
    const/4 v10, 0x1

    move-object/from16 v2, p0

    goto/16 :goto_0

    :cond_a0
    :goto_60
    return-void
.end method

.method private ᩳ(IIIII)V
    .locals 7

    add-int/lit8 v0, p4, 0x1

    :goto_0
    if-ge v0, p5, :cond_5

    .line 1229
    iget-object v1, p0, Ll/ܳ۠֡;->֫:[I

    aget v2, v1, v0

    add-int/lit8 v3, v0, -0x1

    :cond_0
    invoke-direct {p0, p1, p2, p3, v2}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v4

    aget v5, v1, v3

    invoke-direct {p0, p1, p2, p3, v5}, Ll/ܳ۠֡;->ۧ(IIII)I

    move-result v5

    sub-int/2addr v4, v5

    if-gez v4, :cond_3

    :cond_1
    add-int/lit8 v5, v3, 0x1

    .line 1231
    aget v6, v1, v3

    aput v6, v1, v5

    add-int/lit8 v3, v3, -0x1

    if-gt p4, v3, :cond_2

    .line 1232
    aget v5, v1, v3

    if-ltz v5, :cond_1

    :cond_2
    if-ge v3, p4, :cond_0

    :cond_3
    if-nez v4, :cond_4

    .line 1238
    aget v4, v1, v3

    not-int v4, v4

    aput v4, v1, v3

    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 1240
    aput v2, v1, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 37

    move-object/from16 v8, p0

    const/16 v0, 0x100

    new-array v9, v0, [I

    const/high16 v1, 0x10000

    new-array v10, v1, [I

    const/4 v1, 0x0

    .line 2504
    iget v11, v8, Ll/ܳ۠֡;->ܽ:I

    if-nez v11, :cond_0

    const/4 v0, 0x0

    goto/16 :goto_32

    :cond_0
    const/4 v2, 0x1

    .line 2506
    iget-object v12, v8, Ll/ܳ۠֡;->֫:[I

    iget-object v13, v8, Ll/ܳ۠֡;->ۧ:[B

    if-ne v11, v2, :cond_1

    .line 2507
    aget-byte v0, v13, v1

    aput v0, v12, v1

    return v1

    :cond_1
    new-array v3, v0, [I

    const/4 v4, 0x1

    :goto_0
    if-ge v4, v11, :cond_3

    add-int/lit8 v5, v4, -0x1

    .line 2267
    aget-byte v5, v13, v5

    aget-byte v6, v13, v4

    if-eq v5, v6, :cond_2

    and-int/lit16 v4, v5, 0xff

    and-int/lit16 v5, v6, 0xff

    if-le v4, v5, :cond_3

    const/4 v4, 0x0

    const/4 v14, 0x0

    goto :goto_1

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    const/4 v4, 0x1

    const/4 v14, 0x1

    :goto_1
    add-int/lit8 v15, v11, -0x1

    .line 2278
    aget-byte v4, v13, v15

    and-int/lit16 v5, v4, 0xff

    aget-byte v1, v13, v1

    and-int/lit16 v6, v1, 0xff

    if-lt v5, v6, :cond_5

    if-ne v4, v1, :cond_4

    if-eqz v14, :cond_4

    goto :goto_2

    :cond_4
    move v1, v11

    move v4, v15

    goto :goto_5

    :cond_5
    :goto_2
    if-nez v14, :cond_6

    .line 2280
    invoke-static {v5, v6}, Ll/ܳ۠֡;->ۧ(II)I

    move-result v1

    aget v4, v10, v1

    add-int/2addr v4, v2

    aput v4, v10, v1

    add-int/lit8 v1, v11, -0x1

    .line 2281
    aput v15, v12, v1

    goto :goto_3

    .line 2283
    :cond_6
    invoke-static {v5, v6}, Ll/ܳ۠֡;->֫(II)I

    move-result v1

    aget v4, v10, v1

    add-int/2addr v4, v2

    aput v4, v10, v1

    move v1, v11

    :goto_3
    add-int/lit8 v4, v11, -0x2

    :goto_4
    if-ltz v4, :cond_7

    .line 2285
    aget-byte v5, v13, v4

    and-int/lit16 v5, v5, 0xff

    add-int/lit8 v6, v4, 0x1

    aget-byte v6, v13, v6

    and-int/lit16 v6, v6, 0xff

    if-gt v5, v6, :cond_7

    .line 2286
    invoke-static {v5, v6}, Ll/ܳ۠֡;->֫(II)I

    move-result v5

    aget v6, v10, v5

    add-int/2addr v6, v2

    aput v6, v10, v5

    add-int/lit8 v4, v4, -0x1

    goto :goto_4

    :cond_7
    :goto_5
    if-ltz v4, :cond_b

    .line 2292
    :goto_6
    aget-byte v5, v13, v4

    and-int/lit16 v5, v5, 0xff

    aget v6, v9, v5

    add-int/2addr v6, v2

    aput v6, v9, v5

    add-int/lit8 v6, v4, -0x1

    if-ltz v6, :cond_9

    .line 2293
    aget-byte v7, v13, v6

    and-int/lit16 v7, v7, 0xff

    if-ge v7, v5, :cond_8

    goto :goto_7

    :cond_8
    move v4, v6

    goto :goto_6

    :cond_9
    :goto_7
    if-ltz v6, :cond_a

    .line 2295
    aget-byte v7, v13, v6

    and-int/lit16 v7, v7, 0xff

    invoke-static {v7, v5}, Ll/ܳ۠֡;->ۧ(II)I

    move-result v5

    aget v7, v10, v5

    add-int/2addr v7, v2

    aput v7, v10, v5

    add-int/lit8 v1, v1, -0x1

    .line 2296
    aput v6, v12, v1

    add-int/lit8 v4, v4, -0x2

    :goto_8
    if-ltz v4, :cond_7

    .line 2297
    aget-byte v5, v13, v4

    and-int/lit16 v5, v5, 0xff

    add-int/lit8 v6, v4, 0x1

    aget-byte v6, v13, v6

    and-int/lit16 v6, v6, 0xff

    if-gt v5, v6, :cond_7

    .line 2298
    invoke-static {v5, v6}, Ll/ܳ۠֡;->֫(II)I

    move-result v5

    aget v6, v10, v5

    add-int/2addr v6, v2

    aput v6, v10, v5

    add-int/lit8 v4, v4, -0x1

    goto :goto_8

    :cond_a
    move v4, v6

    goto :goto_5

    :cond_b
    sub-int v7, v11, v1

    if-nez v7, :cond_d

    const/4 v0, 0x0

    :goto_9
    if-ge v0, v11, :cond_c

    .line 2305
    aput v0, v12, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_9

    :cond_c
    const/4 v7, 0x0

    const/4 v0, 0x0

    move-object/from16 v29, v9

    move-object/from16 v30, v10

    goto/16 :goto_2b

    :cond_d
    const/4 v1, 0x0

    const/4 v4, -0x1

    const/4 v5, 0x0

    :goto_a
    if-ge v1, v0, :cond_f

    .line 2311
    aget v6, v9, v1

    add-int/2addr v6, v4

    add-int/2addr v4, v5

    .line 2312
    aput v4, v9, v1

    .line 2313
    invoke-static {v1, v1}, Ll/ܳ۠֡;->֫(II)I

    move-result v4

    aget v4, v10, v4

    add-int/2addr v6, v4

    add-int/lit8 v4, v1, 0x1

    move v2, v4

    :goto_b
    if-ge v2, v0, :cond_e

    .line 2315
    invoke-static {v1, v2}, Ll/ܳ۠֡;->ۧ(II)I

    move-result v17

    aget v17, v10, v17

    add-int v5, v5, v17

    shl-int/lit8 v17, v1, 0x8

    or-int v17, v17, v2

    .line 2316
    aput v5, v10, v17

    .line 2317
    invoke-static {v1, v2}, Ll/ܳ۠֡;->֫(II)I

    move-result v17

    aget v17, v10, v17

    add-int v6, v6, v17

    add-int/lit8 v2, v2, 0x1

    goto :goto_b

    :cond_e
    move v1, v4

    move v4, v6

    const/4 v2, 0x1

    goto :goto_a

    :cond_f
    sub-int v6, v11, v7

    add-int/lit8 v1, v7, -0x2

    :goto_c
    if-ltz v1, :cond_10

    add-int v2, v6, v1

    .line 2324
    aget v2, v12, v2

    .line 2325
    aget-byte v4, v13, v2

    and-int/lit16 v4, v4, 0xff

    const/4 v5, 0x1

    add-int/2addr v2, v5

    .line 2326
    aget-byte v2, v13, v2

    and-int/lit16 v2, v2, 0xff

    .line 2327
    invoke-static {v4, v2}, Ll/ܳ۠֡;->ۧ(II)I

    move-result v2

    aget v4, v10, v2

    sub-int/2addr v4, v5

    aput v4, v10, v2

    aput v1, v12, v4

    add-int/lit8 v1, v1, -0x1

    goto :goto_c

    :cond_10
    const/4 v5, 0x1

    add-int v1, v6, v7

    sub-int/2addr v1, v5

    .line 2329
    aget v1, v12, v1

    .line 2330
    aget-byte v2, v13, v1

    and-int/lit16 v2, v2, 0xff

    add-int/2addr v1, v5

    .line 2331
    aget-byte v1, v13, v1

    and-int/lit16 v1, v1, 0xff

    .line 2332
    invoke-static {v2, v1}, Ll/ܳ۠֡;->ۧ(II)I

    move-result v1

    aget v2, v10, v1

    sub-int/2addr v2, v5

    aput v2, v10, v1

    add-int/lit8 v4, v7, -0x1

    aput v4, v12, v2

    mul-int/lit8 v1, v7, 0x2

    sub-int v1, v11, v1

    if-gt v1, v0, :cond_11

    const/4 v1, 0x0

    move-object/from16 v25, v3

    const/16 v3, 0x100

    const/16 v16, 0x0

    goto :goto_d

    :cond_11
    move v3, v1

    move/from16 v16, v7

    move-object/from16 v25, v12

    :goto_d
    const/16 v0, 0xff

    move v0, v7

    move-object v1, v8

    const/4 v2, 0x1

    const/16 v5, 0xff

    :goto_e
    if-lez v0, :cond_29

    const/16 v17, 0xff

    const/16 v8, 0xff

    move/from16 v36, v2

    move v2, v0

    move/from16 v0, v36

    :goto_f
    if-ge v5, v8, :cond_28

    .line 2345
    invoke-static {v5, v8}, Ll/ܳ۠֡;->ۧ(II)I

    move-result v17

    aget v26, v10, v17

    move-object/from16 v17, v1

    sub-int v1, v2, v26

    if-ge v0, v1, :cond_27

    .line 2347
    aget v0, v12, v26

    if-ne v0, v4, :cond_12

    const/4 v0, 0x1

    const/16 v27, 0x1

    goto :goto_10

    :cond_12
    const/4 v0, 0x0

    const/16 v27, 0x0

    :goto_10
    if-eqz v27, :cond_13

    add-int/lit8 v0, v26, 0x1

    move/from16 v28, v0

    goto :goto_11

    :cond_13
    move/from16 v28, v26

    :goto_11
    const/4 v0, 0x0

    move-object/from16 v1, v17

    move/from16 v0, v28

    const/16 v17, 0x0

    :goto_12
    move-object/from16 v29, v9

    add-int/lit16 v9, v0, 0x400

    const/16 v18, 0x400

    if-ge v9, v2, :cond_16

    .line 1083
    invoke-direct {v1, v6, v0, v9}, Ll/ܳ۠֡;->ܽ(III)V

    sub-int v1, v2, v9

    if-gt v1, v3, :cond_14

    move/from16 v19, v3

    move/from16 v21, v16

    move-object/from16 v20, v25

    goto :goto_13

    :cond_14
    move/from16 v19, v1

    move/from16 v21, v9

    move-object/from16 v20, v12

    :goto_13
    move/from16 v18, v0

    move/from16 v23, v17

    const/16 v22, 0x400

    :goto_14
    and-int/lit8 v0, v23, 0x1

    if-eqz v0, :cond_15

    sub-int v24, v18, v22

    add-int v30, v18, v22

    move-object/from16 v0, p0

    move-object/from16 v1, v20

    move/from16 v31, v9

    move v9, v2

    move v2, v6

    move/from16 v32, v3

    move/from16 v3, v24

    move/from16 v33, v4

    move/from16 v4, v18

    move/from16 v34, v5

    move/from16 v5, v30

    move-object/from16 v30, v10

    move v10, v6

    move/from16 v6, v21

    move/from16 v35, v14

    move v14, v7

    move/from16 v7, v19

    .line 1093
    invoke-direct/range {v0 .. v7}, Ll/ܳ۠֡;->֫([IIIIIII)V

    shl-int/lit8 v22, v22, 0x1

    ushr-int/lit8 v23, v23, 0x1

    move v2, v9

    move v6, v10

    move v7, v14

    move/from16 v18, v24

    move-object/from16 v10, v30

    move/from16 v9, v31

    move/from16 v3, v32

    move/from16 v4, v33

    move/from16 v5, v34

    move/from16 v14, v35

    goto :goto_14

    :cond_15
    move/from16 v32, v3

    move/from16 v33, v4

    move/from16 v34, v5

    move/from16 v31, v9

    move-object/from16 v30, v10

    move/from16 v35, v14

    move v9, v2

    move v10, v6

    move v14, v7

    add-int/lit8 v17, v17, 0x1

    move-object/from16 v1, p0

    move-object/from16 v9, v29

    move-object/from16 v10, v30

    move/from16 v0, v31

    move/from16 v14, v35

    goto :goto_12

    :cond_16
    move v9, v2

    move/from16 v32, v3

    move/from16 v33, v4

    move/from16 v34, v5

    move-object/from16 v30, v10

    move/from16 v35, v14

    move v10, v6

    move v14, v7

    .line 1097
    invoke-direct {v1, v10, v0, v9}, Ll/ܳ۠֡;->ܽ(III)V

    move/from16 v21, v0

    move/from16 v0, v17

    const/16 v2, 0x400

    :goto_15
    if-eqz v0, :cond_18

    and-int/lit8 v3, v0, 0x1

    if-eqz v3, :cond_17

    sub-int v3, v21, v2

    move-object/from16 v17, v1

    move-object/from16 v18, v25

    move/from16 v19, v10

    move/from16 v20, v3

    move/from16 v22, v9

    move/from16 v23, v16

    move/from16 v24, v32

    .line 1101
    invoke-direct/range {v17 .. v24}, Ll/ܳ۠֡;->֫([IIIIIII)V

    move/from16 v21, v3

    :cond_17
    shl-int/lit8 v2, v2, 0x1

    shr-int/lit8 v0, v0, 0x1

    goto :goto_15

    :cond_18
    if-eqz v27, :cond_26

    add-int/lit8 v0, v28, -0x1

    .line 1109
    aget v0, v12, v0

    const/4 v2, 0x1

    move/from16 v3, v28

    :goto_16
    if-ge v3, v9, :cond_23

    .line 1110
    aget v4, v12, v3

    if-ltz v4, :cond_22

    add-int v6, v10, v0

    add-int/2addr v4, v10

    .line 140
    aget v2, v12, v6

    add-int/lit8 v2, v2, 0x2

    aget v5, v12, v4

    add-int/lit8 v5, v5, 0x2

    add-int/lit8 v4, v4, 0x1

    aget v4, v12, v4

    add-int/lit8 v4, v4, 0x2

    :goto_17
    if-ge v2, v11, :cond_19

    if-ge v5, v4, :cond_19

    .line 141
    aget-byte v6, v13, v2

    aget-byte v7, v13, v5

    if-ne v6, v7, :cond_19

    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v5, v5, 0x1

    goto :goto_17

    :cond_19
    if-ge v2, v11, :cond_1a

    if-ge v5, v4, :cond_1b

    .line 146
    aget-byte v2, v13, v2

    and-int/lit16 v2, v2, 0xff

    aget-byte v4, v13, v5

    and-int/lit16 v4, v4, 0xff

    sub-int/2addr v2, v4

    move-object/from16 v17, v1

    goto :goto_1a

    :cond_1a
    if-ne v5, v4, :cond_1c

    :cond_1b
    move-object/from16 v17, v1

    goto :goto_19

    .line 152
    :cond_1c
    rem-int/2addr v2, v11

    aget v6, v12, v10

    add-int/lit8 v6, v6, 0x2

    :goto_18
    if-ge v2, v6, :cond_1d

    if-ge v5, v4, :cond_1d

    .line 153
    aget-byte v7, v13, v2

    move-object/from16 v17, v1

    aget-byte v1, v13, v5

    if-ne v7, v1, :cond_1e

    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v5, v5, 0x1

    move-object/from16 v1, v17

    goto :goto_18

    :cond_1d
    move-object/from16 v17, v1

    :cond_1e
    if-ge v2, v6, :cond_20

    if-ge v5, v4, :cond_1f

    .line 157
    aget-byte v1, v13, v2

    and-int/lit16 v1, v1, 0xff

    aget-byte v2, v13, v5

    and-int/lit16 v2, v2, 0xff

    sub-int/2addr v1, v2

    move v2, v1

    goto :goto_1a

    :cond_1f
    :goto_19
    const/4 v1, 0x1

    const/4 v2, 0x1

    goto :goto_1a

    :cond_20
    if-ge v5, v4, :cond_21

    const/4 v1, -0x1

    const/4 v2, -0x1

    goto :goto_1a

    :cond_21
    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_1a
    if-lez v2, :cond_24

    goto :goto_1b

    :cond_22
    move-object/from16 v17, v1

    :goto_1b
    add-int/lit8 v1, v3, -0x1

    .line 1114
    aget v4, v12, v3

    aput v4, v12, v1

    add-int/lit8 v3, v3, 0x1

    move-object/from16 v1, v17

    goto :goto_16

    :cond_23
    move-object/from16 v17, v1

    :cond_24
    if-nez v2, :cond_25

    .line 1117
    aget v1, v12, v3

    not-int v1, v1

    aput v1, v12, v3

    :cond_25
    add-int/lit8 v3, v3, -0x1

    .line 1119
    aput v0, v12, v3

    goto :goto_1c

    :cond_26
    move-object/from16 v17, v1

    goto :goto_1c

    :cond_27
    move/from16 v32, v3

    move/from16 v33, v4

    move/from16 v34, v5

    move-object/from16 v29, v9

    move-object/from16 v30, v10

    move/from16 v35, v14

    move v10, v6

    move v14, v7

    :goto_1c
    move-object/from16 v1, v17

    add-int/lit8 v8, v8, -0x1

    const/4 v0, 0x1

    move v6, v10

    move v7, v14

    move/from16 v2, v26

    move-object/from16 v9, v29

    move-object/from16 v10, v30

    move/from16 v3, v32

    move/from16 v4, v33

    move/from16 v5, v34

    move/from16 v14, v35

    goto/16 :goto_f

    :cond_28
    move-object/from16 v17, v1

    move/from16 v32, v3

    move/from16 v33, v4

    move/from16 v34, v5

    move-object/from16 v29, v9

    move-object/from16 v30, v10

    move/from16 v35, v14

    move v9, v2

    move v10, v6

    move v14, v7

    add-int/lit8 v5, v34, -0x1

    const/4 v2, 0x1

    move-object/from16 v8, p0

    move v0, v9

    move-object/from16 v9, v29

    move-object/from16 v10, v30

    move/from16 v14, v35

    goto/16 :goto_e

    :cond_29
    move/from16 v33, v4

    move-object/from16 v29, v9

    move-object/from16 v30, v10

    move/from16 v35, v14

    move v14, v7

    const/4 v0, 0x0

    :goto_1d
    if-ltz v4, :cond_2f

    .line 2353
    aget v2, v12, v4

    if-ltz v2, :cond_2d

    move v2, v4

    .line 2356
    :goto_1e
    aget v3, v12, v2

    add-int v7, v14, v3

    aput v2, v12, v7

    add-int/lit8 v3, v2, -0x1

    if-ltz v3, :cond_2b

    .line 2357
    aget v5, v12, v3

    if-gez v5, :cond_2a

    goto :goto_1f

    :cond_2a
    move v2, v3

    goto :goto_1e

    :cond_2b
    :goto_1f
    sub-int v4, v3, v4

    .line 2358
    aput v4, v12, v2

    if-gtz v3, :cond_2c

    goto :goto_21

    :cond_2c
    move v4, v3

    :cond_2d
    move v2, v4

    .line 2365
    :goto_20
    aget v3, v12, v2

    not-int v3, v3

    aput v3, v12, v2

    add-int v7, v14, v3

    aput v4, v12, v7

    add-int/lit8 v3, v2, -0x1

    .line 2366
    aget v5, v12, v3

    if-ltz v5, :cond_2e

    add-int/2addr v5, v14

    .line 2367
    aput v4, v12, v5

    add-int/lit8 v4, v2, -0x2

    goto :goto_1d

    :cond_2e
    move v2, v3

    goto :goto_20

    .line 2370
    :cond_2f
    :goto_21
    invoke-direct {v1, v14, v14}, Ll/ܳ۠֡;->ᩳ(II)V

    .line 2373
    aget-byte v1, v13, v15

    and-int/lit16 v2, v1, 0xff

    aget-byte v3, v13, v0

    and-int/lit16 v4, v3, 0xff

    if-lt v2, v4, :cond_31

    if-ne v1, v3, :cond_30

    if-eqz v35, :cond_30

    goto :goto_22

    :cond_30
    move v7, v14

    move v1, v15

    goto :goto_25

    :cond_31
    :goto_22
    if-nez v35, :cond_32

    add-int/lit8 v7, v14, -0x1

    add-int v1, v14, v7

    .line 2375
    aget v1, v12, v1

    aput v15, v12, v1

    goto :goto_23

    :cond_32
    move v7, v14

    :goto_23
    add-int/lit8 v1, v11, -0x2

    :goto_24
    if-ltz v1, :cond_33

    .line 2377
    aget-byte v2, v13, v1

    and-int/lit16 v2, v2, 0xff

    add-int/lit8 v3, v1, 0x1

    aget-byte v3, v13, v3

    and-int/lit16 v3, v3, 0xff

    if-gt v2, v3, :cond_33

    add-int/lit8 v1, v1, -0x1

    goto :goto_24

    :cond_33
    :goto_25
    if-ltz v1, :cond_35

    :goto_26
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_34

    .line 2380
    aget-byte v2, v13, v1

    and-int/lit16 v2, v2, 0xff

    add-int/lit8 v3, v1, 0x1

    aget-byte v3, v13, v3

    and-int/lit16 v3, v3, 0xff

    if-lt v2, v3, :cond_34

    goto :goto_26

    :cond_34
    if-ltz v1, :cond_33

    add-int/lit8 v7, v7, -0x1

    add-int v2, v14, v7

    .line 2382
    aget v2, v12, v2

    aput v1, v12, v2

    :goto_27
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_33

    .line 2383
    aget-byte v2, v13, v1

    and-int/lit16 v2, v2, 0xff

    add-int/lit8 v3, v1, 0x1

    aget-byte v3, v13, v3

    and-int/lit16 v3, v3, 0xff

    if-gt v2, v3, :cond_33

    goto :goto_27

    :cond_35
    const/16 v1, 0xff

    move v2, v15

    move/from16 v4, v33

    :goto_28
    if-ltz v1, :cond_39

    const/16 v3, 0xff

    :goto_29
    if-ge v1, v3, :cond_37

    .line 2389
    invoke-static {v1, v3}, Ll/ܳ۠֡;->֫(II)I

    move-result v5

    aget v5, v30, v5

    sub-int v5, v2, v5

    .line 2390
    invoke-static {v1, v3}, Ll/ܳ۠֡;->֫(II)I

    move-result v6

    add-int/lit8 v2, v2, 0x1

    aput v2, v30, v6

    .line 2392
    invoke-static {v1, v3}, Ll/ܳ۠֡;->ۧ(II)I

    move-result v2

    aget v2, v30, v2

    :goto_2a
    if-gt v2, v4, :cond_36

    .line 2393
    aget v6, v12, v4

    aput v6, v12, v5

    add-int/lit8 v5, v5, -0x1

    add-int/lit8 v4, v4, -0x1

    goto :goto_2a

    :cond_36
    add-int/lit8 v3, v3, -0x1

    move v2, v5

    goto :goto_29

    .line 2396
    :cond_37
    invoke-static {v1, v1}, Ll/ܳ۠֡;->֫(II)I

    move-result v3

    aget v3, v30, v3

    sub-int v3, v2, v3

    .line 2397
    invoke-static {v1, v1}, Ll/ܳ۠֡;->֫(II)I

    move-result v5

    add-int/lit8 v2, v2, 0x1

    aput v2, v30, v5

    const/16 v2, 0xff

    if-ge v1, v2, :cond_38

    add-int/lit8 v2, v1, 0x1

    .line 2399
    invoke-static {v1, v2}, Ll/ܳ۠֡;->ۧ(II)I

    move-result v2

    add-int/lit8 v3, v3, 0x1

    aput v3, v30, v2

    .line 2401
    :cond_38
    aget v2, v29, v1

    add-int/lit8 v1, v1, -0x1

    goto :goto_28

    :cond_39
    move v7, v14

    :goto_2b
    if-lez v7, :cond_49

    const/16 v0, 0xfe

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_2c
    if-ltz v0, :cond_41

    add-int/lit8 v1, v0, 0x1

    .line 2427
    invoke-static {v0, v1}, Ll/ܳ۠֡;->ۧ(II)I

    move-result v2

    aget v2, v30, v2

    aget v1, v29, v1

    const/4 v3, 0x0

    const/4 v4, -0x1

    :goto_2d
    if-gt v2, v1, :cond_40

    .line 2432
    aget v5, v12, v1

    if-ltz v5, :cond_3e

    add-int/lit8 v6, v5, -0x1

    if-gez v6, :cond_3a

    move v6, v15

    .line 2436
    :cond_3a
    aget-byte v7, v13, v6

    and-int/lit16 v7, v7, 0xff

    if-gt v7, v0, :cond_3f

    not-int v5, v5

    .line 2437
    aput v5, v12, v1

    if-lez v6, :cond_3b

    add-int/lit8 v5, v6, -0x1

    .line 2438
    aget-byte v5, v13, v5

    and-int/lit16 v5, v5, 0xff

    if-le v5, v7, :cond_3b

    not-int v6, v6

    :cond_3b
    if-ne v4, v7, :cond_3c

    add-int/lit8 v3, v3, -0x1

    .line 2442
    aput v6, v12, v3

    goto :goto_2e

    :cond_3c
    if-ltz v4, :cond_3d

    .line 2445
    invoke-static {v4, v0}, Ll/ܳ۠֡;->֫(II)I

    move-result v4

    aput v3, v30, v4

    .line 2447
    :cond_3d
    invoke-static {v7, v0}, Ll/ܳ۠֡;->֫(II)I

    move-result v3

    aget v3, v30, v3

    add-int/lit8 v3, v3, -0x1

    aput v6, v12, v3

    move v4, v7

    goto :goto_2e

    :cond_3e
    not-int v5, v5

    .line 2451
    aput v5, v12, v1

    :cond_3f
    :goto_2e
    add-int/lit8 v1, v1, -0x1

    goto :goto_2d

    :cond_40
    add-int/lit8 v0, v0, -0x1

    move v1, v3

    move v2, v4

    goto :goto_2c

    :cond_41
    const/4 v0, -0x1

    const/4 v3, 0x0

    :goto_2f
    if-ge v3, v11, :cond_49

    .line 2457
    aget v4, v12, v3

    if-ltz v4, :cond_46

    add-int/lit8 v5, v4, -0x1

    if-gez v5, :cond_42

    move v5, v15

    .line 2461
    :cond_42
    aget-byte v6, v13, v5

    and-int/lit16 v6, v6, 0xff

    add-int/lit8 v7, v5, 0x1

    aget-byte v7, v13, v7

    and-int/lit16 v7, v7, 0xff

    if-lt v6, v7, :cond_47

    if-lez v5, :cond_43

    add-int/lit8 v7, v5, -0x1

    .line 2462
    aget-byte v7, v13, v7

    and-int/lit16 v7, v7, 0xff

    if-ge v7, v6, :cond_43

    not-int v5, v5

    :cond_43
    if-ne v6, v2, :cond_44

    add-int/lit8 v1, v1, 0x1

    .line 2466
    aput v5, v12, v1

    goto :goto_30

    :cond_44
    const/4 v7, -0x1

    if-eq v2, v7, :cond_45

    .line 2469
    aput v1, v29, v2

    .line 2470
    :cond_45
    aget v1, v29, v6

    add-int/lit8 v1, v1, 0x1

    aput v5, v12, v1

    move v2, v6

    goto :goto_30

    :cond_46
    not-int v4, v4

    :cond_47
    :goto_30
    if-nez v4, :cond_48

    .line 2479
    aget-byte v0, v13, v15

    aput v0, v12, v3

    move v0, v3

    goto :goto_31

    :cond_48
    add-int/lit8 v4, v4, -0x1

    .line 2482
    aget-byte v4, v13, v4

    aput v4, v12, v3

    :goto_31
    add-int/lit8 v3, v3, 0x1

    goto :goto_2f

    :cond_49
    :goto_32
    return v0
.end method
