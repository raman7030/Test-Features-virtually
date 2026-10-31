.class public final Ll/۬֫ᩴ;
.super Ljava/lang/Object;
.source "21EM"


# static fields
.field public static final ֫:[C

.field public static final ۧ:[C


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v1, v0, [C

    .line 105
    sput-object v1, Ll/۬֫ᩴ;->ۧ:[C

    new-array v0, v0, [C

    .line 113
    sput-object v0, Ll/۬֫ᩴ;->֫:[C

    return-void
.end method

.method public static ֫(II[CI)I
    .locals 3

    .line 626
    aget-char v0, p2, p0

    aget-char v1, p2, p1

    invoke-static {v0, v1}, Ljava/lang/Character;->compare(CC)I

    move-result v0

    .line 627
    aget-char v1, p2, p0

    aget-char v2, p2, p3

    invoke-static {v1, v2}, Ljava/lang/Character;->compare(CC)I

    move-result v1

    .line 628
    aget-char v2, p2, p1

    aget-char p2, p2, p3

    invoke-static {v2, p2}, Ljava/lang/Character;->compare(CC)I

    move-result p2

    if-gez v0, :cond_1

    if-gez p2, :cond_0

    goto :goto_0

    :cond_0
    if-gez v1, :cond_3

    goto :goto_1

    :cond_1
    if-lez p2, :cond_2

    :goto_0
    return p1

    :cond_2
    if-lez v1, :cond_3

    :goto_1
    return p3

    :cond_3
    return p0
.end method

.method public static ֫([CIIILl/֫ۧᩴ;)I
    .locals 3

    .line 408
    aget-char v0, p0, p1

    aget-char v1, p0, p2

    invoke-interface {p4, v0, v1}, Ll/֫ۧᩴ;->֫(CC)I

    move-result v0

    .line 409
    aget-char v1, p0, p1

    aget-char v2, p0, p3

    invoke-interface {p4, v1, v2}, Ll/֫ۧᩴ;->֫(CC)I

    move-result v1

    .line 410
    aget-char v2, p0, p2

    aget-char p0, p0, p3

    invoke-interface {p4, v2, p0}, Ll/֫ۧᩴ;->֫(CC)I

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

.method public static ֫([CI)V
    .locals 20

    move-object/from16 v0, p0

    move/from16 v1, p1

    const/16 v2, 0x7d0

    const/4 v3, 0x0

    if-lt v1, v2, :cond_a

    const/16 v2, 0x400

    if-ge v1, v2, :cond_0

    .line 1796
    invoke-static {v0, v3, v1}, Ll/۬֫ᩴ;->֫([CII)V

    return-void

    :cond_0
    const/16 v4, 0x100

    new-array v5, v4, [I

    new-array v6, v4, [I

    new-array v7, v4, [I

    aput v3, v5, v3

    aput v1, v6, v3

    aput v3, v7, v3

    new-array v1, v4, [I

    new-array v8, v4, [I

    const/4 v9, 0x1

    const/4 v10, 0x1

    :goto_0
    if-lez v10, :cond_9

    add-int/lit8 v10, v10, -0x1

    .line 1811
    aget v11, v5, v10

    .line 1812
    aget v12, v6, v10

    .line 1813
    aget v13, v7, v10

    .line 1815
    rem-int/lit8 v14, v13, 0x2

    rsub-int/lit8 v14, v14, 0x1

    mul-int/lit8 v14, v14, 0x8

    add-int/2addr v12, v11

    move v15, v12

    :goto_1
    add-int/lit8 v16, v15, -0x1

    if-eq v15, v11, :cond_1

    .line 1820
    aget-char v15, v0, v16

    ushr-int/2addr v15, v14

    and-int/lit16 v15, v15, 0xff

    aget v17, v1, v15

    add-int/lit8 v17, v17, 0x1

    aput v17, v1, v15

    move/from16 v15, v16

    goto :goto_1

    :cond_1
    const/4 v15, -0x1

    const/16 v16, 0x0

    move/from16 v17, v11

    :goto_2
    if-ge v3, v4, :cond_3

    .line 1824
    aget v18, v1, v3

    if-eqz v18, :cond_2

    move v15, v3

    :cond_2
    add-int v17, v17, v18

    .line 1825
    aput v17, v8, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 1827
    :cond_3
    aget v3, v1, v15

    sub-int/2addr v12, v3

    :goto_3
    if-gt v11, v12, :cond_8

    .line 1830
    aget-char v3, v0, v11

    ushr-int v4, v3, v14

    and-int/lit16 v4, v4, 0xff

    if-ge v11, v12, :cond_5

    .line 1833
    :goto_4
    aget v15, v8, v4

    add-int/lit8 v15, v15, -0x1

    aput v15, v8, v4

    if-le v15, v11, :cond_4

    .line 1835
    aget-char v4, v0, v15

    .line 1836
    aput-char v3, v0, v15

    ushr-int v3, v4, v14

    and-int/lit16 v3, v3, 0xff

    move/from16 v19, v4

    move v4, v3

    move/from16 v3, v19

    goto :goto_4

    .line 1839
    :cond_4
    aput-char v3, v0, v11

    :cond_5
    if-ge v13, v9, :cond_7

    .line 1841
    aget v3, v1, v4

    if-le v3, v9, :cond_7

    if-ge v3, v2, :cond_6

    add-int/2addr v3, v11

    .line 1842
    invoke-static {v0, v11, v3}, Ll/۬֫ᩴ;->֫([CII)V

    goto :goto_5

    .line 1844
    :cond_6
    aput v11, v5, v10

    .line 1845
    aget v3, v1, v4

    aput v3, v6, v10

    add-int/lit8 v3, v10, 0x1

    add-int/lit8 v15, v13, 0x1

    .line 1846
    aput v15, v7, v10

    move v10, v3

    .line 1829
    :cond_7
    :goto_5
    aget v3, v1, v4

    add-int/2addr v11, v3

    aput v16, v1, v4

    const/16 v4, 0x100

    goto :goto_3

    :cond_8
    const/4 v3, 0x0

    goto :goto_0

    :cond_9
    return-void

    :cond_a
    const/4 v2, 0x0

    .line 1378
    invoke-static {v0, v2, v1}, Ll/۬֫ᩴ;->֫([CII)V

    return-void
.end method

.method public static ֫([CII)V
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

    .line 635
    aget-char v3, p0, v1

    aget-char v4, p0, v2

    if-ge v3, v4, :cond_0

    move v2, v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    if-eq v2, p1, :cond_2

    .line 637
    aget-char v1, p0, p1

    .line 638
    aget-char v3, p0, v2

    aput-char v3, p0, p1

    .line 639
    aput-char v1, p0, v2

    :cond_2
    move p1, v0

    goto :goto_0

    .line 684
    :cond_3
    div-int/lit8 v1, v0, 0x2

    add-int/2addr v1, p1

    add-int/lit8 v2, p2, -0x1

    const/16 v3, 0x80

    if-le v0, v3, :cond_4

    .line 688
    div-int/lit8 v0, v0, 0x8

    add-int v3, p1, v0

    mul-int/lit8 v4, v0, 0x2

    add-int v5, p1, v4

    .line 689
    invoke-static {p1, v3, p0, v5}, Ll/۬֫ᩴ;->֫(II[CI)I

    move-result v3

    sub-int v5, v1, v0

    add-int v6, v1, v0

    .line 690
    invoke-static {v5, v1, p0, v6}, Ll/۬֫ᩴ;->֫(II[CI)I

    move-result v1

    sub-int v4, v2, v4

    sub-int v0, v2, v0

    .line 691
    invoke-static {v4, v0, p0, v2}, Ll/۬֫ᩴ;->֫(II[CI)I

    move-result v0

    goto :goto_2

    :cond_4
    move v3, p1

    move v0, v2

    .line 693
    :goto_2
    invoke-static {v3, v1, p0, v0}, Ll/۬֫ᩴ;->֫(II[CI)I

    move-result v0

    .line 694
    aget-char v0, p0, v0

    move v3, p1

    move v4, v3

    move v1, v2

    :goto_3
    if-gt v3, v2, :cond_6

    .line 699
    aget-char v5, p0, v3

    invoke-static {v5, v0}, Ljava/lang/Character;->compare(CC)I

    move-result v5

    if-gtz v5, :cond_6

    if-nez v5, :cond_5

    add-int/lit8 v5, v4, 0x1

    .line 390
    aget-char v6, p0, v4

    .line 391
    aget-char v7, p0, v3

    aput-char v7, p0, v4

    .line 392
    aput-char v6, p0, v3

    move v4, v5

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_6
    :goto_4
    if-lt v2, v3, :cond_8

    .line 703
    aget-char v5, p0, v2

    invoke-static {v5, v0}, Ljava/lang/Character;->compare(CC)I

    move-result v5

    if-ltz v5, :cond_8

    if-nez v5, :cond_7

    add-int/lit8 v5, v1, -0x1

    .line 390
    aget-char v6, p0, v2

    .line 391
    aget-char v7, p0, v1

    aput-char v7, p0, v2

    .line 392
    aput-char v6, p0, v1

    move v1, v5

    :cond_7
    add-int/lit8 v2, v2, -0x1

    goto :goto_4

    :cond_8
    if-le v3, v2, :cond_b

    sub-int v0, v4, p1

    sub-int v4, v3, v4

    .line 712
    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int v5, v3, v0

    .line 713
    invoke-static {p1, v5, p0, v0}, Ll/۬֫ᩴ;->ۧ(II[CI)V

    sub-int v0, v1, v2

    sub-int v1, p2, v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    .line 714
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    sub-int v5, p2, v1

    .line 715
    invoke-static {v3, v5, p0, v1}, Ll/۬֫ᩴ;->ۧ(II[CI)V

    if-le v4, v2, :cond_9

    add-int/2addr v4, p1

    .line 717
    invoke-static {p0, p1, v4}, Ll/۬֫ᩴ;->֫([CII)V

    :cond_9
    if-le v0, v2, :cond_a

    sub-int p1, p2, v0

    .line 718
    invoke-static {p0, p1, p2}, Ll/۬֫ᩴ;->֫([CII)V

    :cond_a
    return-void

    :cond_b
    add-int/lit8 v5, v3, 0x1

    add-int/lit8 v6, v2, -0x1

    .line 390
    aget-char v7, p0, v3

    .line 391
    aget-char v8, p0, v2

    aput-char v8, p0, v3

    .line 392
    aput-char v7, p0, v2

    move v3, v5

    move v2, v6

    goto :goto_3
.end method

.method public static ֫([CIILl/֫ۧᩴ;)V
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

    .line 417
    aget-char v3, p0, v1

    aget-char v4, p0, v2

    invoke-interface {p3, v3, v4}, Ll/֫ۧᩴ;->֫(CC)I

    move-result v3

    if-gez v3, :cond_0

    move v2, v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    if-eq v2, p1, :cond_2

    .line 419
    aget-char v1, p0, p1

    .line 420
    aget-char v3, p0, v2

    aput-char v3, p0, p1

    .line 421
    aput-char v1, p0, v2

    :cond_2
    move p1, v0

    goto :goto_0

    .line 468
    :cond_3
    div-int/lit8 v1, v0, 0x2

    add-int/2addr v1, p1

    add-int/lit8 v2, p2, -0x1

    const/16 v3, 0x80

    if-le v0, v3, :cond_4

    .line 472
    div-int/lit8 v0, v0, 0x8

    add-int v3, p1, v0

    mul-int/lit8 v4, v0, 0x2

    add-int v5, p1, v4

    .line 473
    invoke-static {p0, p1, v3, v5, p3}, Ll/۬֫ᩴ;->֫([CIIILl/֫ۧᩴ;)I

    move-result v3

    sub-int v5, v1, v0

    add-int v6, v1, v0

    .line 474
    invoke-static {p0, v5, v1, v6, p3}, Ll/۬֫ᩴ;->֫([CIIILl/֫ۧᩴ;)I

    move-result v1

    sub-int v4, v2, v4

    sub-int v0, v2, v0

    .line 475
    invoke-static {p0, v4, v0, v2, p3}, Ll/۬֫ᩴ;->֫([CIIILl/֫ۧᩴ;)I

    move-result v0

    goto :goto_2

    :cond_4
    move v3, p1

    move v0, v2

    .line 477
    :goto_2
    invoke-static {p0, v3, v1, v0, p3}, Ll/۬֫ᩴ;->֫([CIIILl/֫ۧᩴ;)I

    move-result v0

    .line 478
    aget-char v0, p0, v0

    move v3, p1

    move v4, v3

    move v1, v2

    :goto_3
    if-gt v3, v2, :cond_6

    .line 483
    aget-char v5, p0, v3

    invoke-interface {p3, v5, v0}, Ll/֫ۧᩴ;->֫(CC)I

    move-result v5

    if-gtz v5, :cond_6

    if-nez v5, :cond_5

    add-int/lit8 v5, v4, 0x1

    .line 390
    aget-char v6, p0, v4

    .line 391
    aget-char v7, p0, v3

    aput-char v7, p0, v4

    .line 392
    aput-char v6, p0, v3

    move v4, v5

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_6
    :goto_4
    if-lt v2, v3, :cond_8

    .line 487
    aget-char v5, p0, v2

    invoke-interface {p3, v5, v0}, Ll/֫ۧᩴ;->֫(CC)I

    move-result v5

    if-ltz v5, :cond_8

    if-nez v5, :cond_7

    add-int/lit8 v5, v1, -0x1

    .line 390
    aget-char v6, p0, v2

    .line 391
    aget-char v7, p0, v1

    aput-char v7, p0, v2

    .line 392
    aput-char v6, p0, v1

    move v1, v5

    :cond_7
    add-int/lit8 v2, v2, -0x1

    goto :goto_4

    :cond_8
    if-le v3, v2, :cond_b

    sub-int v0, v4, p1

    sub-int v4, v3, v4

    .line 496
    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int v5, v3, v0

    .line 497
    invoke-static {p1, v5, p0, v0}, Ll/۬֫ᩴ;->ۧ(II[CI)V

    sub-int v0, v1, v2

    sub-int v1, p2, v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    .line 498
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    sub-int v5, p2, v1

    .line 499
    invoke-static {v3, v5, p0, v1}, Ll/۬֫ᩴ;->ۧ(II[CI)V

    if-le v4, v2, :cond_9

    add-int/2addr v4, p1

    .line 501
    invoke-static {p0, p1, v4, p3}, Ll/۬֫ᩴ;->֫([CIILl/֫ۧᩴ;)V

    :cond_9
    if-le v0, v2, :cond_a

    sub-int p1, p2, v0

    .line 502
    invoke-static {p0, p1, p2, p3}, Ll/۬֫ᩴ;->֫([CIILl/֫ۧᩴ;)V

    :cond_a
    return-void

    :cond_b
    add-int/lit8 v5, v3, 0x1

    add-int/lit8 v6, v2, -0x1

    .line 390
    aget-char v7, p0, v3

    .line 391
    aget-char v8, p0, v2

    aput-char v8, p0, v3

    .line 392
    aput-char v7, p0, v2

    move v3, v5

    move v2, v6

    goto :goto_3
.end method

.method public static ֫([CIILl/֫ۧᩴ;[C)V
    .locals 6

    sub-int v0, p2, p1

    const/16 v1, 0x10

    if-ge v0, v1, :cond_2

    move p4, p1

    :goto_0
    add-int/lit8 v0, p4, 0x1

    if-ge v0, p2, :cond_7

    .line 428
    aget-char v1, p0, v0

    .line 430
    aget-char p4, p0, p4

    move v2, v0

    :goto_1
    invoke-interface {p3, v1, p4}, Ll/֫ۧᩴ;->֫(CC)I

    move-result v3

    if-gez v3, :cond_1

    .line 431
    aput-char p4, p0, v2

    add-int/lit8 p4, v2, -0x1

    if-ne p1, p4, :cond_0

    add-int/lit8 v2, v2, -0x1

    goto :goto_2

    :cond_0
    add-int/lit8 p4, v2, -0x1

    add-int/lit8 v2, v2, -0x2

    .line 430
    aget-char v2, p0, v2

    move v5, v2

    move v2, p4

    move p4, v5

    goto :goto_1

    .line 437
    :cond_1
    :goto_2
    aput-char v1, p0, v2

    move p4, v0

    goto :goto_0

    :cond_2
    if-nez p4, :cond_3

    .line 1514
    invoke-static {p0, p2}, Ljava/util/Arrays;->copyOf([CI)[C

    move-result-object p4

    :cond_3
    add-int v1, p1, p2

    ushr-int/lit8 v1, v1, 0x1

    .line 1517
    invoke-static {p4, p1, v1, p3, p0}, Ll/۬֫ᩴ;->֫([CIILl/֫ۧᩴ;[C)V

    .line 1518
    invoke-static {p4, v1, p2, p3, p0}, Ll/۬֫ᩴ;->֫([CIILl/֫ۧᩴ;[C)V

    add-int/lit8 v2, v1, -0x1

    .line 1521
    aget-char v2, p4, v2

    aget-char v3, p4, v1

    invoke-interface {p3, v2, v3}, Ll/֫ۧᩴ;->֫(CC)I

    move-result v2

    if-gtz v2, :cond_4

    .line 1522
    invoke-static {p4, p1, p0, p1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    :cond_4
    move v0, p1

    move v2, v1

    :goto_3
    if-ge p1, p2, :cond_7

    if-ge v2, p2, :cond_6

    if-ge v0, v1, :cond_5

    .line 1527
    aget-char v3, p4, v0

    aget-char v4, p4, v2

    invoke-interface {p3, v3, v4}, Ll/֫ۧᩴ;->֫(CC)I

    move-result v3

    if-gtz v3, :cond_5

    goto :goto_4

    :cond_5
    add-int/lit8 v3, v2, 0x1

    .line 1528
    aget-char v2, p4, v2

    aput-char v2, p0, p1

    move v2, v3

    goto :goto_5

    :cond_6
    :goto_4
    add-int/lit8 v3, v0, 0x1

    .line 1527
    aget-char v0, p4, v0

    aput-char v0, p0, p1

    move v0, v3

    :goto_5
    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_7
    return-void
.end method

.method public static ۧ(II[CI)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_0

    .line 390
    aget-char v1, p2, p0

    .line 391
    aget-char v2, p2, p1

    aput-char v2, p2, p0

    .line 392
    aput-char v1, p2, p1

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 p0, p0, 0x1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
