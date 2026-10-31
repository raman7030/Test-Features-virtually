.class public final Ll/۬֨ۖ;
.super Ll/᩶֨ۖ;
.source "Y3NK"


# direct methods
.method public static ֫(J[BII)I
    .locals 2

    if-eqz p4, :cond_2

    const/4 v0, 0x1

    if-eq p4, v0, :cond_1

    const/4 v0, 0x2

    if-ne p4, v0, :cond_0

    .line 1805
    invoke-static {p0, p1, p2}, Ll/᩸֨ۖ;->֫(J[B)B

    move-result p4

    const-wide/16 v0, 0x1

    add-long/2addr p0, v0

    invoke-static {p0, p1, p2}, Ll/᩸֨ۖ;->֫(J[B)B

    move-result p0

    .line 1804
    invoke-static {p3, p4, p0}, Ll/۫֨ۖ;->֫(III)I

    move-result p0

    return p0

    .line 1807
    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0

    .line 1802
    :cond_1
    invoke-static {p0, p1, p2}, Ll/᩸֨ۖ;->֫(J[B)B

    move-result p0

    invoke-static {p3, p0}, Ll/۫֨ۖ;->֫(II)I

    move-result p0

    return p0

    .line 1800
    :cond_2
    invoke-static {p3}, Ll/۫֨ۖ;->֫(I)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final ֫(IILjava/lang/String;[B)I
    .locals 21

    move/from16 v0, p1

    move/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    int-to-long v4, v0

    int-to-long v6, v1

    add-long/2addr v6, v4

    .line 1448
    invoke-virtual/range {p3 .. p3}, Ljava/lang/String;->length()I

    move-result v8

    const-string v9, " at index "

    const-string v10, "Failed writing "

    if-gt v8, v1, :cond_c

    .line 1449
    array-length v11, v3

    sub-int/2addr v11, v1

    if-lt v11, v0, :cond_c

    const/4 v0, 0x0

    :goto_0
    const-wide/16 v11, 0x1

    const/16 v1, 0x80

    if-ge v0, v8, :cond_0

    .line 1458
    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-ge v13, v1, :cond_0

    add-long/2addr v11, v4

    int-to-byte v1, v13

    .line 1459
    invoke-static {v3, v4, v5, v1}, Ll/᩸֨ۖ;->֫([BJB)V

    add-int/lit8 v0, v0, 0x1

    move-wide v4, v11

    goto :goto_0

    :cond_0
    if-ne v0, v8, :cond_1

    long-to-int v0, v4

    return v0

    :cond_1
    move-object v13, v2

    :goto_1
    if-ge v0, v8, :cond_b

    .line 1467
    invoke-virtual {v13, v0}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-ge v14, v1, :cond_2

    cmp-long v15, v4, v6

    if-gez v15, :cond_2

    add-long v15, v4, v11

    int-to-byte v1, v14

    .line 1469
    invoke-static {v3, v4, v5, v1}, Ll/᩸֨ۖ;->֫([BJB)V

    move-object/from16 v18, v10

    move-wide v4, v15

    move-object v15, v9

    goto/16 :goto_3

    :cond_2
    const/16 v15, 0x800

    const-wide/16 v16, 0x2

    if-ge v14, v15, :cond_3

    sub-long v18, v6, v16

    cmp-long v15, v4, v18

    if-gtz v15, :cond_3

    move-object v15, v9

    move-object/from16 v18, v10

    add-long v9, v4, v11

    ushr-int/lit8 v11, v14, 0x6

    or-int/lit16 v11, v11, 0x3c0

    int-to-byte v11, v11

    .line 1471
    invoke-static {v3, v4, v5, v11}, Ll/᩸֨ۖ;->֫([BJB)V

    add-long v4, v4, v16

    and-int/lit8 v11, v14, 0x3f

    or-int/2addr v1, v11

    int-to-byte v1, v1

    .line 1472
    invoke-static {v3, v9, v10, v1}, Ll/᩸֨ۖ;->֫([BJB)V

    goto/16 :goto_3

    :cond_3
    move-object v15, v9

    move-object/from16 v18, v10

    const v1, 0xdfff

    const v9, 0xd800

    const-wide/16 v10, 0x3

    if-lt v14, v9, :cond_4

    if-ge v1, v14, :cond_5

    :cond_4
    sub-long v12, v6, v10

    cmp-long v19, v4, v12

    if-gtz v19, :cond_5

    const-wide/16 v12, 0x1

    add-long v10, v4, v12

    ushr-int/lit8 v1, v14, 0xc

    or-int/lit16 v1, v1, 0x1e0

    int-to-byte v1, v1

    .line 1475
    invoke-static {v3, v4, v5, v1}, Ll/᩸֨ۖ;->֫([BJB)V

    add-long v12, v4, v16

    ushr-int/lit8 v1, v14, 0x6

    and-int/lit8 v1, v1, 0x3f

    or-int/lit16 v1, v1, 0x80

    int-to-byte v1, v1

    .line 1476
    invoke-static {v3, v10, v11, v1}, Ll/᩸֨ۖ;->֫([BJB)V

    const-wide/16 v9, 0x3

    add-long/2addr v4, v9

    and-int/lit8 v1, v14, 0x3f

    or-int/lit16 v1, v1, 0x80

    int-to-byte v1, v1

    .line 1477
    invoke-static {v3, v12, v13, v1}, Ll/᩸֨ۖ;->֫([BJB)V

    goto :goto_2

    :cond_5
    const-wide/16 v10, 0x4

    sub-long v12, v6, v10

    cmp-long v20, v4, v12

    if-gtz v20, :cond_8

    add-int/lit8 v1, v0, 0x1

    if-eq v1, v8, :cond_7

    .line 1482
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v14, v0}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v9

    if-eqz v9, :cond_6

    .line 1485
    invoke-static {v14, v0}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v0

    const-wide/16 v12, 0x1

    add-long v10, v4, v12

    ushr-int/lit8 v9, v0, 0x12

    or-int/lit16 v9, v9, 0xf0

    int-to-byte v9, v9

    .line 1486
    invoke-static {v3, v4, v5, v9}, Ll/᩸֨ۖ;->֫([BJB)V

    add-long v12, v4, v16

    ushr-int/lit8 v9, v0, 0xc

    and-int/lit8 v9, v9, 0x3f

    or-int/lit16 v9, v9, 0x80

    int-to-byte v9, v9

    .line 1487
    invoke-static {v3, v10, v11, v9}, Ll/᩸֨ۖ;->֫([BJB)V

    const-wide/16 v9, 0x3

    add-long v10, v4, v9

    ushr-int/lit8 v9, v0, 0x6

    and-int/lit8 v9, v9, 0x3f

    or-int/lit16 v9, v9, 0x80

    int-to-byte v9, v9

    .line 1488
    invoke-static {v3, v12, v13, v9}, Ll/᩸֨ۖ;->֫([BJB)V

    const-wide/16 v12, 0x4

    add-long/2addr v4, v12

    and-int/lit8 v0, v0, 0x3f

    or-int/lit16 v0, v0, 0x80

    int-to-byte v0, v0

    .line 1489
    invoke-static {v3, v10, v11, v0}, Ll/᩸֨ۖ;->֫([BJB)V

    move v0, v1

    :goto_2
    move-object v13, v2

    :goto_3
    add-int/lit8 v0, v0, 0x1

    const/16 v1, 0x80

    move-object v9, v15

    move-object/from16 v10, v18

    const-wide/16 v11, 0x1

    goto/16 :goto_1

    :cond_6
    move v0, v1

    .line 1483
    :cond_7
    new-instance v1, Ll/ۗ֨ۖ;

    add-int/lit8 v0, v0, -0x1

    invoke-direct {v1, v0, v8}, Ll/ۗ֨ۖ;-><init>(II)V

    throw v1

    :cond_8
    if-gt v9, v14, :cond_a

    if-gt v14, v1, :cond_a

    add-int/lit8 v1, v0, 0x1

    if-eq v1, v8, :cond_9

    .line 1492
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v14, v1}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v1

    if-nez v1, :cond_a

    .line 1494
    :cond_9
    new-instance v1, Ll/ۗ֨ۖ;

    invoke-direct {v1, v0, v8}, Ll/ۗ֨ۖ;-><init>(II)V

    throw v1

    .line 1497
    :cond_a
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    move-object/from16 v3, v18

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-object v6, v15

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    long-to-int v0, v4

    return v0

    :cond_c
    move-object v6, v9

    move-object v3, v10

    .line 1451
    new-instance v4, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 v8, v8, -0x1

    .line 1452
    invoke-virtual {v2, v8}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/2addr v0, v1

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v4
.end method

.method public final ֫(I[BII)I
    .locals 23

    move/from16 v0, p1

    move-object/from16 v1, p2

    move/from16 v2, p3

    move/from16 v3, p4

    or-int v4, v2, v3

    .line 1156
    array-length v5, v1

    sub-int/2addr v5, v3

    or-int/2addr v4, v5

    if-ltz v4, :cond_25

    int-to-long v6, v2

    int-to-long v2, v3

    const/16 v4, 0x10

    const/16 v8, -0x13

    const/16 v9, -0x10

    const/16 v10, -0x3e

    const/16 v11, -0x60

    const/16 v12, -0x20

    const/4 v13, 0x0

    const/16 v14, -0x41

    const-wide/16 v15, 0x1

    if-eqz v0, :cond_f

    cmp-long v17, v6, v2

    if-ltz v17, :cond_0

    return v0

    :cond_0
    const/16 v17, -0x1

    int-to-byte v5, v0

    if-ge v5, v12, :cond_3

    if-lt v5, v10, :cond_2

    add-long v8, v6, v15

    .line 1182
    invoke-static {v6, v7, v1}, Ll/᩸֨ۖ;->֫(J[B)B

    move-result v0

    if-le v0, v14, :cond_1

    goto :goto_0

    :cond_1
    move-wide v6, v8

    goto/16 :goto_2

    :cond_2
    :goto_0
    return v17

    :cond_3
    if-ge v5, v9, :cond_9

    shr-int/lit8 v0, v0, 0x8

    not-int v0, v0

    int-to-byte v0, v0

    if-nez v0, :cond_5

    add-long v18, v6, v15

    .line 1191
    invoke-static {v6, v7, v1}, Ll/᩸֨ۖ;->֫(J[B)B

    move-result v0

    cmp-long v6, v18, v2

    if-ltz v6, :cond_4

    .line 1193
    invoke-static {v5, v0}, Ll/۫֨ۖ;->֫(II)I

    move-result v0

    return v0

    :cond_4
    move-wide/from16 v6, v18

    :cond_5
    if-gt v0, v14, :cond_8

    if-ne v5, v12, :cond_6

    if-lt v0, v11, :cond_8

    :cond_6
    if-ne v5, v8, :cond_7

    if-ge v0, v11, :cond_8

    :cond_7
    add-long v8, v6, v15

    .line 1202
    invoke-static {v6, v7, v1}, Ll/᩸֨ۖ;->֫(J[B)B

    move-result v0

    if-le v0, v14, :cond_1

    :cond_8
    return v17

    :cond_9
    shr-int/lit8 v8, v0, 0x8

    not-int v8, v8

    int-to-byte v8, v8

    if-nez v8, :cond_b

    add-long v8, v6, v15

    .line 1212
    invoke-static {v6, v7, v1}, Ll/᩸֨ۖ;->֫(J[B)B

    move-result v0

    cmp-long v6, v8, v2

    if-ltz v6, :cond_a

    .line 1214
    invoke-static {v5, v0}, Ll/۫֨ۖ;->֫(II)I

    move-result v0

    return v0

    :cond_a
    const/4 v6, 0x0

    goto :goto_1

    :cond_b
    shr-int/2addr v0, v4

    int-to-byte v0, v0

    move-wide/from16 v21, v6

    move v6, v0

    move v0, v8

    move-wide/from16 v8, v21

    :goto_1
    if-nez v6, :cond_d

    add-long v6, v8, v15

    .line 1220
    invoke-static {v8, v9, v1}, Ll/᩸֨ۖ;->֫(J[B)B

    move-result v8

    cmp-long v9, v6, v2

    if-ltz v9, :cond_c

    .line 1222
    invoke-static {v5, v0, v8}, Ll/۫֨ۖ;->֫(III)I

    move-result v0

    return v0

    :cond_c
    move-wide/from16 v21, v6

    move v6, v8

    move-wide/from16 v8, v21

    :cond_d
    if-gt v0, v14, :cond_e

    shl-int/lit8 v5, v5, 0x1c

    add-int/lit8 v0, v0, 0x70

    add-int/2addr v0, v5

    shr-int/lit8 v0, v0, 0x1e

    if-nez v0, :cond_e

    if-gt v6, v14, :cond_e

    add-long v6, v8, v15

    .line 1239
    invoke-static {v8, v9, v1}, Ll/᩸֨ۖ;->֫(J[B)B

    move-result v0

    if-le v0, v14, :cond_10

    :cond_e
    return v17

    :cond_f
    const/16 v17, -0x1

    :cond_10
    :goto_2
    sub-long/2addr v2, v6

    long-to-int v0, v2

    if-ge v0, v4, :cond_11

    const/4 v2, 0x0

    goto :goto_7

    :cond_11
    long-to-int v2, v6

    and-int/lit8 v2, v2, 0x7

    rsub-int/lit8 v2, v2, 0x8

    const/4 v3, 0x0

    move-wide v4, v6

    :goto_3
    if-ge v3, v2, :cond_13

    add-long v8, v4, v15

    .line 1593
    invoke-static {v4, v5, v1}, Ll/᩸֨ۖ;->֫(J[B)B

    move-result v4

    if-gez v4, :cond_12

    move v2, v3

    goto :goto_7

    :cond_12
    add-int/lit8 v3, v3, 0x1

    move-wide v4, v8

    goto :goto_3

    :cond_13
    :goto_4
    add-int/lit8 v2, v3, 0x8

    if-gt v2, v0, :cond_15

    .line 1599
    sget-wide v8, Ll/᩸֨ۖ;->ۧ:J

    add-long/2addr v8, v4

    invoke-static {v8, v9, v1}, Ll/᩸֨ۖ;->᩷(JLjava/lang/Object;)J

    move-result-wide v8

    const-wide v18, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v8, v8, v18

    const-wide/16 v18, 0x0

    cmp-long v20, v8, v18

    if-eqz v20, :cond_14

    goto :goto_5

    :cond_14
    const-wide/16 v8, 0x8

    add-long/2addr v4, v8

    move v3, v2

    goto :goto_4

    :cond_15
    :goto_5
    move v2, v3

    :goto_6
    if-ge v2, v0, :cond_17

    add-long v8, v4, v15

    .line 1608
    invoke-static {v4, v5, v1}, Ll/᩸֨ۖ;->֫(J[B)B

    move-result v3

    if-gez v3, :cond_16

    goto :goto_7

    :cond_16
    add-int/lit8 v2, v2, 0x1

    move-wide v4, v8

    goto :goto_6

    :cond_17
    move v2, v0

    :goto_7
    sub-int/2addr v0, v2

    int-to-long v2, v2

    add-long/2addr v6, v2

    :cond_18
    :goto_8
    const/4 v2, 0x0

    :goto_9
    if-lez v0, :cond_1a

    add-long v2, v6, v15

    .line 1657
    invoke-static {v6, v7, v1}, Ll/᩸֨ۖ;->֫(J[B)B

    move-result v4

    if-ltz v4, :cond_19

    add-int/lit8 v0, v0, -0x1

    move-wide v6, v2

    move v2, v4

    goto :goto_9

    :cond_19
    move-wide v6, v2

    move v2, v4

    :cond_1a
    if-nez v0, :cond_1b

    return v13

    :cond_1b
    add-int/lit8 v3, v0, -0x1

    if-ge v2, v12, :cond_1e

    if-nez v3, :cond_1c

    return v2

    :cond_1c
    add-int/lit8 v0, v0, -0x2

    if-lt v2, v10, :cond_24

    add-long v2, v6, v15

    .line 1674
    invoke-static {v6, v7, v1}, Ll/᩸֨ۖ;->֫(J[B)B

    move-result v4

    if-le v4, v14, :cond_1d

    goto :goto_a

    :cond_1d
    move-wide v6, v2

    goto :goto_8

    :cond_1e
    const/16 v4, -0x10

    if-ge v2, v4, :cond_22

    const/4 v4, 0x2

    if-ge v3, v4, :cond_1f

    .line 1681
    invoke-static {v6, v7, v1, v2, v3}, Ll/۬֨ۖ;->֫(J[BII)I

    move-result v0

    return v0

    :cond_1f
    add-int/lit8 v0, v0, -0x3

    add-long v3, v6, v15

    .line 1686
    invoke-static {v6, v7, v1}, Ll/᩸֨ۖ;->֫(J[B)B

    move-result v5

    if-gt v5, v14, :cond_24

    if-ne v2, v12, :cond_20

    if-lt v5, v11, :cond_24

    :cond_20
    const/16 v8, -0x13

    const-wide/16 v18, 0x2

    if-ne v2, v8, :cond_21

    if-ge v5, v11, :cond_24

    :cond_21
    add-long v6, v6, v18

    .line 1692
    invoke-static {v3, v4, v1}, Ll/᩸֨ۖ;->֫(J[B)B

    move-result v2

    if-le v2, v14, :cond_18

    goto :goto_a

    :cond_22
    const/4 v4, 0x3

    const-wide/16 v8, 0x2

    if-ge v3, v4, :cond_23

    .line 1699
    invoke-static {v6, v7, v1, v2, v3}, Ll/۬֨ۖ;->֫(J[BII)I

    move-result v0

    return v0

    :cond_23
    add-int/lit8 v0, v0, -0x4

    add-long v3, v6, v15

    .line 1704
    invoke-static {v6, v7, v1}, Ll/᩸֨ۖ;->֫(J[B)B

    move-result v5

    if-gt v5, v14, :cond_24

    shl-int/lit8 v2, v2, 0x1c

    add-int/lit8 v5, v5, 0x70

    add-int/2addr v5, v2

    shr-int/lit8 v2, v5, 0x1e

    if-nez v2, :cond_24

    add-long/2addr v8, v6

    .line 1711
    invoke-static {v3, v4, v1}, Ll/᩸֨ۖ;->֫(J[B)B

    move-result v2

    if-gt v2, v14, :cond_24

    const-wide/16 v2, 0x3

    add-long/2addr v6, v2

    .line 1713
    invoke-static {v8, v9, v1}, Ll/᩸֨ۖ;->֫(J[B)B

    move-result v2

    if-le v2, v14, :cond_18

    :cond_24
    :goto_a
    return v17

    :cond_25
    const/4 v0, 0x0

    .line 1157
    new-instance v4, Ljava/lang/ArrayIndexOutOfBoundsException;

    array-length v1, v1

    .line 1158
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v1, v5, v0

    const/4 v0, 0x1

    aput-object v2, v5, v0

    const/4 v0, 0x2

    aput-object v3, v5, v0

    const-string v0, "Array length=%d, index=%d, limit=%d"

    invoke-static {v0, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v4
.end method

.method public final ֫(II[B)Ljava/lang/String;
    .locals 3

    .line 1347
    new-instance v0, Ljava/lang/String;

    sget-object v1, Ll/ܰᩴۖ;->ܽ:Ljava/nio/charset/Charset;

    invoke-direct {v0, p3, p1, p2, v1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    const v2, 0xfffd

    .line 1351
    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    if-gez v2, :cond_0

    goto :goto_0

    .line 1361
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    add-int/2addr p2, p1

    invoke-static {p3, p1, p2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    .line 1360
    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    return-object v0

    .line 1365
    :cond_1
    invoke-static {}, Ll/֫᩵ۖ;->ᩳ()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1
.end method

.method public final ֫(Ljava/nio/ByteBuffer;II)Ljava/lang/String;
    .locals 20

    move/from16 v0, p2

    move/from16 v1, p3

    or-int v2, v0, v1

    .line 1372
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->limit()I

    move-result v3

    sub-int/2addr v3, v0

    sub-int/2addr v3, v1

    or-int/2addr v2, v3

    const/4 v3, 0x0

    if-ltz v2, :cond_8

    .line 1376
    invoke-static/range {p1 .. p1}, Ll/᩸֨ۖ;->֫(Ljava/nio/ByteBuffer;)J

    move-result-wide v4

    int-to-long v6, v0

    add-long/2addr v4, v6

    int-to-long v6, v1

    add-long/2addr v6, v4

    .line 1381
    new-array v0, v1, [C

    const/4 v1, 0x0

    :goto_0
    const-wide/16 v14, 0x1

    cmp-long v2, v4, v6

    if-gez v2, :cond_0

    .line 1387
    invoke-static {v4, v5}, Ll/᩸֨ۖ;->֫(J)B

    move-result v2

    if-ltz v2, :cond_0

    add-long/2addr v4, v14

    add-int/lit8 v8, v1, 0x1

    int-to-char v2, v2

    .line 1861
    aput-char v2, v0, v1

    move v1, v8

    goto :goto_0

    :cond_0
    :goto_1
    cmp-long v2, v4, v6

    if-gez v2, :cond_7

    add-long v8, v4, v14

    .line 1396
    invoke-static {v4, v5}, Ll/᩸֨ۖ;->֫(J)B

    move-result v2

    if-ltz v2, :cond_1

    add-int/lit8 v4, v1, 0x1

    int-to-char v2, v2

    .line 1861
    aput-char v2, v0, v1

    move v1, v4

    move-wide v4, v8

    :goto_2
    cmp-long v2, v4, v6

    if-gez v2, :cond_0

    .line 1402
    invoke-static {v4, v5}, Ll/᩸֨ۖ;->֫(J)B

    move-result v2

    if-ltz v2, :cond_0

    add-long/2addr v4, v14

    add-int/lit8 v8, v1, 0x1

    int-to-char v2, v2

    .line 1861
    aput-char v2, v0, v1

    move v1, v8

    goto :goto_2

    :cond_1
    const/16 v10, -0x20

    const-wide/16 v11, 0x2

    if-ge v2, v10, :cond_3

    cmp-long v10, v8, v6

    if-gez v10, :cond_2

    add-long/2addr v4, v11

    .line 1414
    invoke-static {v8, v9}, Ll/᩸֨ۖ;->֫(J)B

    move-result v8

    add-int/lit8 v9, v1, 0x1

    .line 1413
    invoke-static {v2, v8, v0, v1}, Ll/᩹֨ۖ;->֫(BB[CI)V

    move v1, v9

    goto :goto_1

    .line 1411
    :cond_2
    invoke-static {}, Ll/֫᩵ۖ;->ᩳ()Ll/֫᩵ۖ;

    move-result-object v0

    throw v0

    :cond_3
    const/16 v10, -0x10

    const-wide/16 v16, 0x3

    if-ge v2, v10, :cond_5

    sub-long v18, v6, v14

    cmp-long v10, v8, v18

    if-gez v10, :cond_4

    add-long/2addr v11, v4

    .line 1421
    invoke-static {v8, v9}, Ll/᩸֨ۖ;->֫(J)B

    move-result v8

    add-long v4, v4, v16

    .line 1422
    invoke-static {v11, v12}, Ll/᩸֨ۖ;->֫(J)B

    move-result v9

    add-int/lit8 v10, v1, 0x1

    .line 1419
    invoke-static {v2, v8, v9, v0, v1}, Ll/᩹֨ۖ;->֫(BBB[CI)V

    move v1, v10

    goto :goto_1

    .line 1417
    :cond_4
    invoke-static {}, Ll/֫᩵ۖ;->ᩳ()Ll/֫᩵ۖ;

    move-result-object v0

    throw v0

    :cond_5
    sub-long v18, v6, v11

    cmp-long v10, v8, v18

    if-gez v10, :cond_6

    add-long/2addr v11, v4

    .line 1431
    invoke-static {v8, v9}, Ll/᩸֨ۖ;->֫(J)B

    move-result v9

    add-long v16, v4, v16

    .line 1432
    invoke-static {v11, v12}, Ll/᩸֨ۖ;->֫(J)B

    move-result v10

    const-wide/16 v11, 0x4

    add-long/2addr v4, v11

    .line 1433
    invoke-static/range {v16 .. v17}, Ll/᩸֨ۖ;->֫(J)B

    move-result v11

    move v8, v2

    move-object v12, v0

    move v13, v1

    .line 1429
    invoke-static/range {v8 .. v13}, Ll/᩹֨ۖ;->֫(BBBB[CI)V

    add-int/lit8 v1, v1, 0x2

    goto/16 :goto_1

    .line 1427
    :cond_6
    invoke-static {}, Ll/֫᩵ۖ;->ᩳ()Ll/֫᩵ۖ;

    move-result-object v0

    throw v0

    .line 1441
    :cond_7
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v0, v3, v1}, Ljava/lang/String;-><init>([CII)V

    return-object v2

    .line 1373
    :cond_8
    new-instance v2, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 1374
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->limit()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v4, v5, v3

    const/4 v3, 0x1

    aput-object v0, v5, v3

    const/4 v0, 0x2

    aput-object v1, v5, v0

    const-string v0, "buffer limit=%d, index=%d, limit=%d"

    invoke-static {v0, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v2
.end method
