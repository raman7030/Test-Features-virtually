.class public final Ll/᩵ۢᩴ;
.super Ljava/lang/Object;
.source "M1PH"


# static fields
.field public static final ֫:[I

.field public static final ۧ:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v1, v0, [I

    .line 104
    sput-object v1, Ll/᩵ۢᩴ;->ۧ:[I

    new-array v0, v0, [I

    .line 112
    sput-object v0, Ll/᩵ۢᩴ;->֫:[I

    return-void
.end method

.method public static ֫(III[I)I
    .locals 3

    .line 625
    aget v0, p3, p0

    aget v1, p3, p1

    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    .line 626
    aget v1, p3, p0

    aget v2, p3, p2

    invoke-static {v1, v2}, Ljava/lang/Integer;->compare(II)I

    move-result v1

    .line 627
    aget v2, p3, p1

    aget p3, p3, p2

    invoke-static {v2, p3}, Ljava/lang/Integer;->compare(II)I

    move-result p3

    if-gez v0, :cond_1

    if-gez p3, :cond_0

    goto :goto_0

    :cond_0
    if-gez v1, :cond_3

    goto :goto_1

    :cond_1
    if-lez p3, :cond_2

    :goto_0
    return p1

    :cond_2
    if-lez v1, :cond_3

    :goto_1
    return p2

    :cond_3
    return p0
.end method

.method public static ֫([IIIILl/ۙۢᩴ;)I
    .locals 3

    .line 407
    aget v0, p0, p1

    aget v1, p0, p2

    invoke-interface {p4, v0, v1}, Ll/ۙۢᩴ;->ۧ(II)I

    move-result v0

    .line 408
    aget v1, p0, p1

    aget v2, p0, p3

    invoke-interface {p4, v1, v2}, Ll/ۙۢᩴ;->ۧ(II)I

    move-result v1

    .line 409
    aget v2, p0, p2

    aget p0, p0, p3

    invoke-interface {p4, v2, p0}, Ll/ۙۢᩴ;->ۧ(II)I

    move-result p0

    if-gez v0, :cond_1

    if-gez p0, :cond_0

    goto :goto_0

    :cond_0
    if-gez v1, :cond_3

    goto :goto_1

    :cond_1
    if-lez p0, :cond_2

    :goto_0
    return p2

    :cond_2
    if-lez v1, :cond_3

    :goto_1
    return p3

    :cond_3
    return p1
.end method

.method public static ֫(II[I)V
    .locals 9

    sub-int v0, p1, p0

    const/16 v1, 0x10

    if-ge v0, v1, :cond_3

    :goto_0
    add-int/lit8 v0, p1, -0x1

    if-ge p0, v0, :cond_a

    add-int/lit8 v0, p0, 0x1

    move v2, p0

    move v1, v0

    :goto_1
    if-ge v1, p1, :cond_1

    .line 634
    aget v3, p2, v1

    aget v4, p2, v2

    if-ge v3, v4, :cond_0

    move v2, v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    if-eq v2, p0, :cond_2

    .line 636
    aget v1, p2, p0

    .line 637
    aget v3, p2, v2

    aput v3, p2, p0

    .line 638
    aput v1, p2, v2

    :cond_2
    move p0, v0

    goto :goto_0

    .line 683
    :cond_3
    div-int/lit8 v1, v0, 0x2

    add-int/2addr v1, p0

    add-int/lit8 v2, p1, -0x1

    const/16 v3, 0x80

    if-le v0, v3, :cond_4

    .line 687
    div-int/lit8 v0, v0, 0x8

    add-int v3, p0, v0

    mul-int/lit8 v4, v0, 0x2

    add-int v5, p0, v4

    .line 688
    invoke-static {p0, v3, v5, p2}, Ll/᩵ۢᩴ;->֫(III[I)I

    move-result v3

    sub-int v5, v1, v0

    add-int v6, v1, v0

    .line 689
    invoke-static {v5, v1, v6, p2}, Ll/᩵ۢᩴ;->֫(III[I)I

    move-result v1

    sub-int v4, v2, v4

    sub-int v0, v2, v0

    .line 690
    invoke-static {v4, v0, v2, p2}, Ll/᩵ۢᩴ;->֫(III[I)I

    move-result v0

    goto :goto_2

    :cond_4
    move v3, p0

    move v0, v2

    .line 692
    :goto_2
    invoke-static {v3, v1, v0, p2}, Ll/᩵ۢᩴ;->֫(III[I)I

    move-result v0

    .line 693
    aget v0, p2, v0

    move v3, p0

    move v4, v3

    move v1, v2

    :goto_3
    if-gt v3, v2, :cond_6

    .line 698
    aget v5, p2, v3

    invoke-static {v5, v0}, Ljava/lang/Integer;->compare(II)I

    move-result v5

    if-gtz v5, :cond_6

    if-nez v5, :cond_5

    add-int/lit8 v5, v4, 0x1

    .line 389
    aget v6, p2, v4

    .line 390
    aget v7, p2, v3

    aput v7, p2, v4

    .line 391
    aput v6, p2, v3

    move v4, v5

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_6
    :goto_4
    if-lt v2, v3, :cond_8

    .line 702
    aget v5, p2, v2

    invoke-static {v5, v0}, Ljava/lang/Integer;->compare(II)I

    move-result v5

    if-ltz v5, :cond_8

    if-nez v5, :cond_7

    add-int/lit8 v5, v1, -0x1

    .line 389
    aget v6, p2, v2

    .line 390
    aget v7, p2, v1

    aput v7, p2, v2

    .line 391
    aput v6, p2, v1

    move v1, v5

    :cond_7
    add-int/lit8 v2, v2, -0x1

    goto :goto_4

    :cond_8
    if-le v3, v2, :cond_b

    sub-int v0, v4, p0

    sub-int v4, v3, v4

    .line 711
    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int v5, v3, v0

    .line 712
    invoke-static {p0, v5, v0, p2}, Ll/᩵ۢᩴ;->ۧ(III[I)V

    sub-int v0, v1, v2

    sub-int v1, p1, v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    .line 713
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    sub-int v5, p1, v1

    .line 714
    invoke-static {v3, v5, v1, p2}, Ll/᩵ۢᩴ;->ۧ(III[I)V

    if-le v4, v2, :cond_9

    add-int/2addr v4, p0

    .line 716
    invoke-static {p0, v4, p2}, Ll/᩵ۢᩴ;->֫(II[I)V

    :cond_9
    if-le v0, v2, :cond_a

    sub-int p0, p1, v0

    .line 717
    invoke-static {p0, p1, p2}, Ll/᩵ۢᩴ;->֫(II[I)V

    :cond_a
    return-void

    :cond_b
    add-int/lit8 v5, v3, 0x1

    add-int/lit8 v6, v2, -0x1

    .line 389
    aget v7, p2, v3

    .line 390
    aget v8, p2, v2

    aput v8, p2, v3

    .line 391
    aput v7, p2, v2

    move v3, v5

    move v2, v6

    goto :goto_3
.end method

.method public static ֫(I[I)V
    .locals 19

    move/from16 v0, p0

    move-object/from16 v1, p1

    const/16 v2, 0x7d0

    const/4 v3, 0x0

    if-lt v0, v2, :cond_b

    const/16 v2, 0x400

    if-ge v0, v2, :cond_0

    .line 1795
    invoke-static {v3, v0, v1}, Ll/᩵ۢᩴ;->֫(II[I)V

    return-void

    :cond_0
    const/16 v2, 0x2fe

    new-array v4, v2, [I

    new-array v5, v2, [I

    new-array v2, v2, [I

    aput v3, v4, v3

    aput v0, v5, v3

    aput v3, v2, v3

    const/16 v0, 0x100

    new-array v3, v0, [I

    new-array v6, v0, [I

    const/4 v7, 0x1

    const/4 v8, 0x1

    :cond_1
    if-lez v8, :cond_a

    add-int/lit8 v8, v8, -0x1

    .line 1810
    aget v9, v4, v8

    .line 1811
    aget v10, v5, v8

    .line 1812
    aget v11, v2, v8

    .line 1813
    rem-int/lit8 v12, v11, 0x4

    if-nez v12, :cond_2

    const/16 v13, 0x80

    goto :goto_0

    :cond_2
    const/4 v13, 0x0

    :goto_0
    rsub-int/lit8 v12, v12, 0x3

    mul-int/lit8 v12, v12, 0x8

    add-int/2addr v10, v9

    move v15, v10

    :goto_1
    add-int/lit8 v16, v15, -0x1

    if-eq v15, v9, :cond_3

    .line 1819
    aget v15, v1, v16

    ushr-int/2addr v15, v12

    and-int/lit16 v15, v15, 0xff

    xor-int/2addr v15, v13

    aget v17, v3, v15

    add-int/lit8 v17, v17, 0x1

    aput v17, v3, v15

    move/from16 v15, v16

    goto :goto_1

    :cond_3
    const/4 v15, -0x1

    const/16 v16, 0x0

    move/from16 v16, v9

    const/4 v14, 0x0

    :goto_2
    if-ge v14, v0, :cond_5

    .line 1823
    aget v17, v3, v14

    if-eqz v17, :cond_4

    move v15, v14

    :cond_4
    add-int v16, v16, v17

    .line 1824
    aput v16, v6, v14

    add-int/lit8 v14, v14, 0x1

    goto :goto_2

    .line 1826
    :cond_5
    aget v14, v3, v15

    sub-int/2addr v10, v14

    :goto_3
    if-gt v9, v10, :cond_1

    .line 1829
    aget v0, v1, v9

    ushr-int v14, v0, v12

    and-int/lit16 v14, v14, 0xff

    xor-int/2addr v14, v13

    if-ge v9, v10, :cond_7

    .line 1832
    :goto_4
    aget v15, v6, v14

    add-int/lit8 v15, v15, -0x1

    aput v15, v6, v14

    if-le v15, v9, :cond_6

    .line 1834
    aget v14, v1, v15

    .line 1835
    aput v0, v1, v15

    ushr-int v0, v14, v12

    and-int/lit16 v0, v0, 0xff

    xor-int/2addr v0, v13

    move/from16 v18, v14

    move v14, v0

    move/from16 v0, v18

    goto :goto_4

    .line 1838
    :cond_6
    aput v0, v1, v9

    :cond_7
    const/4 v0, 0x3

    if-ge v11, v0, :cond_9

    .line 1840
    aget v0, v3, v14

    if-le v0, v7, :cond_9

    const/16 v15, 0x400

    if-ge v0, v15, :cond_8

    add-int/2addr v0, v9

    .line 1841
    invoke-static {v9, v0, v1}, Ll/᩵ۢᩴ;->֫(II[I)V

    goto :goto_5

    .line 1843
    :cond_8
    aput v9, v4, v8

    .line 1844
    aget v0, v3, v14

    aput v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    add-int/lit8 v15, v11, 0x1

    .line 1845
    aput v15, v2, v8

    move v8, v0

    .line 1828
    :cond_9
    :goto_5
    aget v0, v3, v14

    add-int/2addr v9, v0

    const/4 v15, 0x0

    aput v15, v3, v14

    const/16 v0, 0x100

    goto :goto_3

    :cond_a
    return-void

    :cond_b
    const/4 v2, 0x0

    .line 1377
    invoke-static {v2, v0, v1}, Ll/᩵ۢᩴ;->֫(II[I)V

    return-void
.end method

.method public static ֫([IIILl/ۙۢᩴ;)V
    .locals 9

    sub-int v0, p2, p1

    const/16 v1, 0x10

    if-ge v0, v1, :cond_3

    :goto_0
    add-int/lit8 v0, p2, -0x1

    if-ge p1, v0, :cond_a

    add-int/lit8 v0, p1, 0x1

    move v2, p1

    move v1, v0

    :goto_1
    if-ge v1, p2, :cond_1

    .line 416
    aget v3, p0, v1

    aget v4, p0, v2

    invoke-interface {p3, v3, v4}, Ll/ۙۢᩴ;->ۧ(II)I

    move-result v3

    if-gez v3, :cond_0

    move v2, v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    if-eq v2, p1, :cond_2

    .line 418
    aget v1, p0, p1

    .line 419
    aget v3, p0, v2

    aput v3, p0, p1

    .line 420
    aput v1, p0, v2

    :cond_2
    move p1, v0

    goto :goto_0

    .line 467
    :cond_3
    div-int/lit8 v1, v0, 0x2

    add-int/2addr v1, p1

    add-int/lit8 v2, p2, -0x1

    const/16 v3, 0x80

    if-le v0, v3, :cond_4

    .line 471
    div-int/lit8 v0, v0, 0x8

    add-int v3, p1, v0

    mul-int/lit8 v4, v0, 0x2

    add-int v5, p1, v4

    .line 472
    invoke-static {p0, p1, v3, v5, p3}, Ll/᩵ۢᩴ;->֫([IIIILl/ۙۢᩴ;)I

    move-result v3

    sub-int v5, v1, v0

    add-int v6, v1, v0

    .line 473
    invoke-static {p0, v5, v1, v6, p3}, Ll/᩵ۢᩴ;->֫([IIIILl/ۙۢᩴ;)I

    move-result v1

    sub-int v4, v2, v4

    sub-int v0, v2, v0

    .line 474
    invoke-static {p0, v4, v0, v2, p3}, Ll/᩵ۢᩴ;->֫([IIIILl/ۙۢᩴ;)I

    move-result v0

    goto :goto_2

    :cond_4
    move v3, p1

    move v0, v2

    .line 476
    :goto_2
    invoke-static {p0, v3, v1, v0, p3}, Ll/᩵ۢᩴ;->֫([IIIILl/ۙۢᩴ;)I

    move-result v0

    .line 477
    aget v0, p0, v0

    move v3, p1

    move v4, v3

    move v1, v2

    :goto_3
    if-gt v3, v2, :cond_6

    .line 482
    aget v5, p0, v3

    invoke-interface {p3, v5, v0}, Ll/ۙۢᩴ;->ۧ(II)I

    move-result v5

    if-gtz v5, :cond_6

    if-nez v5, :cond_5

    add-int/lit8 v5, v4, 0x1

    .line 389
    aget v6, p0, v4

    .line 390
    aget v7, p0, v3

    aput v7, p0, v4

    .line 391
    aput v6, p0, v3

    move v4, v5

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_6
    :goto_4
    if-lt v2, v3, :cond_8

    .line 486
    aget v5, p0, v2

    invoke-interface {p3, v5, v0}, Ll/ۙۢᩴ;->ۧ(II)I

    move-result v5

    if-ltz v5, :cond_8

    if-nez v5, :cond_7

    add-int/lit8 v5, v1, -0x1

    .line 389
    aget v6, p0, v2

    .line 390
    aget v7, p0, v1

    aput v7, p0, v2

    .line 391
    aput v6, p0, v1

    move v1, v5

    :cond_7
    add-int/lit8 v2, v2, -0x1

    goto :goto_4

    :cond_8
    if-le v3, v2, :cond_b

    sub-int v0, v4, p1

    sub-int v4, v3, v4

    .line 495
    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int v5, v3, v0

    .line 496
    invoke-static {p1, v5, v0, p0}, Ll/᩵ۢᩴ;->ۧ(III[I)V

    sub-int v0, v1, v2

    sub-int v1, p2, v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    .line 497
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    sub-int v5, p2, v1

    .line 498
    invoke-static {v3, v5, v1, p0}, Ll/᩵ۢᩴ;->ۧ(III[I)V

    if-le v4, v2, :cond_9

    add-int/2addr v4, p1

    .line 500
    invoke-static {p0, p1, v4, p3}, Ll/᩵ۢᩴ;->֫([IIILl/ۙۢᩴ;)V

    :cond_9
    if-le v0, v2, :cond_a

    sub-int p1, p2, v0

    .line 501
    invoke-static {p0, p1, p2, p3}, Ll/᩵ۢᩴ;->֫([IIILl/ۙۢᩴ;)V

    :cond_a
    return-void

    :cond_b
    add-int/lit8 v5, v3, 0x1

    add-int/lit8 v6, v2, -0x1

    .line 389
    aget v7, p0, v3

    .line 390
    aget v8, p0, v2

    aput v8, p0, v3

    .line 391
    aput v7, p0, v2

    move v3, v5

    move v2, v6

    goto :goto_3
.end method

.method public static ֫([IIILl/ۙۢᩴ;[I)V
    .locals 6

    sub-int v0, p2, p1

    const/16 v1, 0x10

    if-ge v0, v1, :cond_2

    move p4, p1

    :goto_0
    add-int/lit8 v0, p4, 0x1

    if-ge v0, p2, :cond_7

    .line 427
    aget v1, p0, v0

    .line 429
    aget p4, p0, p4

    move v2, v0

    :goto_1
    invoke-interface {p3, v1, p4}, Ll/ۙۢᩴ;->ۧ(II)I

    move-result v3

    if-gez v3, :cond_1

    .line 430
    aput p4, p0, v2

    add-int/lit8 p4, v2, -0x1

    if-ne p1, p4, :cond_0

    add-int/lit8 v2, v2, -0x1

    goto :goto_2

    :cond_0
    add-int/lit8 p4, v2, -0x1

    add-int/lit8 v2, v2, -0x2

    .line 429
    aget v2, p0, v2

    move v5, v2

    move v2, p4

    move p4, v5

    goto :goto_1

    .line 436
    :cond_1
    :goto_2
    aput v1, p0, v2

    move p4, v0

    goto :goto_0

    :cond_2
    if-nez p4, :cond_3

    .line 1513
    invoke-static {p0, p2}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p4

    :cond_3
    add-int v1, p1, p2

    ushr-int/lit8 v1, v1, 0x1

    .line 1516
    invoke-static {p4, p1, v1, p3, p0}, Ll/᩵ۢᩴ;->֫([IIILl/ۙۢᩴ;[I)V

    .line 1517
    invoke-static {p4, v1, p2, p3, p0}, Ll/᩵ۢᩴ;->֫([IIILl/ۙۢᩴ;[I)V

    add-int/lit8 v2, v1, -0x1

    .line 1520
    aget v2, p4, v2

    aget v3, p4, v1

    invoke-interface {p3, v2, v3}, Ll/ۙۢᩴ;->ۧ(II)I

    move-result v2

    if-gtz v2, :cond_4

    .line 1521
    invoke-static {p4, p1, p0, p1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    :cond_4
    move v0, p1

    move v2, v1

    :goto_3
    if-ge p1, p2, :cond_7

    if-ge v2, p2, :cond_6

    if-ge v0, v1, :cond_5

    .line 1526
    aget v3, p4, v0

    aget v4, p4, v2

    invoke-interface {p3, v3, v4}, Ll/ۙۢᩴ;->ۧ(II)I

    move-result v3

    if-gtz v3, :cond_5

    goto :goto_4

    :cond_5
    add-int/lit8 v3, v2, 0x1

    .line 1527
    aget v2, p4, v2

    aput v2, p0, p1

    move v2, v3

    goto :goto_5

    :cond_6
    :goto_4
    add-int/lit8 v3, v0, 0x1

    .line 1526
    aget v0, p4, v0

    aput v0, p0, p1

    move v0, v3

    :goto_5
    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_7
    return-void
.end method

.method public static ۧ(III[I)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    .line 389
    aget v1, p3, p0

    .line 390
    aget v2, p3, p1

    aput v2, p3, p0

    .line 391
    aput v1, p3, p1

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 p0, p0, 0x1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
