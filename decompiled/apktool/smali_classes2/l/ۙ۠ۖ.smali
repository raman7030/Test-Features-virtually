.class public final Ll/ۙ۠ۖ;
.super Ljava/lang/Object;
.source "5281"


# static fields
.field public static final ֫:[I

.field public static final ۧ:Ljava/nio/charset/Charset;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x60

    new-array v0, v0, [I

    .line 44
    fill-array-data v0, :array_0

    sput-object v0, Ll/ۙ۠ۖ;->֫:[I

    .line 53
    sget-object v0, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    sput-object v0, Ll/ۙ۠ۖ;->ۧ:Ljava/nio/charset/Charset;

    return-void

    :array_0
    .array-data 4
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        0x24
        -0x1
        -0x1
        -0x1
        0x25
        0x26
        -0x1
        -0x1
        -0x1
        -0x1
        0x27
        0x28
        -0x1
        0x29
        0x2a
        0x2b
        0x0
        0x1
        0x2
        0x3
        0x4
        0x5
        0x6
        0x7
        0x8
        0x9
        0x2c
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        0xa
        0xb
        0xc
        0xd
        0xe
        0xf
        0x10
        0x11
        0x12
        0x13
        0x14
        0x15
        0x16
        0x17
        0x18
        0x19
        0x1a
        0x1b
        0x1c
        0x1d
        0x1e
        0x1f
        0x20
        0x21
        0x22
        0x23
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
    .end array-data
.end method

.method public static ֫(I)I
    .locals 1

    const/16 v0, 0x60

    if-ge p0, v0, :cond_0

    .line 238
    sget-object v0, Ll/ۙ۠ۖ;->֫:[I

    aget p0, v0, p0

    return p0

    :cond_0
    const/4 p0, -0x1

    return p0
.end method

.method public static ֫(Ljava/lang/String;Ll/֡۠ۖ;)Ll/۫۠ۖ;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 252
    sget-object v2, Ll/ۖ۠ۖ;->ۧ:Ljava/nio/charset/Charset;

    sget-object v3, Ll/ۙ۠ۖ;->ۧ:Ljava/nio/charset/Charset;

    const/4 v4, -0x1

    const/4 v6, 0x1

    if-eqz v2, :cond_5

    .line 253
    invoke-virtual {v2, v3}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 280
    sget-object v2, Ll/ۖ۠ۖ;->ۧ:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v2

    .line 281
    array-length v7, v2

    .line 282
    rem-int/lit8 v8, v7, 0x2

    const/4 v9, 0x0

    if-eqz v8, :cond_0

    goto :goto_1

    :cond_0
    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_3

    .line 286
    aget-byte v10, v2, v8

    and-int/lit16 v10, v10, 0xff

    const/16 v11, 0x81

    if-lt v10, v11, :cond_1

    const/16 v11, 0x9f

    if-le v10, v11, :cond_2

    :cond_1
    const/16 v11, 0xe0

    if-lt v10, v11, :cond_4

    const/16 v11, 0xeb

    if-le v10, v11, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v8, v8, 0x2

    goto :goto_0

    :cond_3
    const/4 v9, 0x1

    :cond_4
    :goto_1
    if-eqz v9, :cond_5

    .line 256
    sget-object v2, Ll/ۚ۠ۖ;->ۨ:Ll/ۚ۠ۖ;

    goto :goto_4

    :cond_5
    const/4 v2, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 260
    :goto_2
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v9

    if-ge v2, v9, :cond_8

    .line 261
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v9

    const/16 v10, 0x30

    if-lt v9, v10, :cond_6

    const/16 v10, 0x39

    if-gt v9, v10, :cond_6

    const/4 v8, 0x1

    goto :goto_3

    .line 264
    :cond_6
    invoke-static {v9}, Ll/ۙ۠ۖ;->֫(I)I

    move-result v7

    if-eq v7, v4, :cond_7

    const/4 v7, 0x1

    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 267
    :cond_7
    sget-object v2, Ll/ۚ۠ۖ;->ۗ:Ll/ۚ۠ۖ;

    goto :goto_4

    :cond_8
    if-eqz v7, :cond_9

    .line 271
    sget-object v2, Ll/ۚ۠ۖ;->ۙ:Ll/ۚ۠ۖ;

    goto :goto_4

    :cond_9
    if-eqz v8, :cond_a

    .line 274
    sget-object v2, Ll/ۚ۠ۖ;->᩺:Ll/ۚ۠ۖ;

    goto :goto_4

    .line 276
    :cond_a
    sget-object v2, Ll/ۚ۠ۖ;->ۗ:Ll/ۚ۠ۖ;

    .line 120
    :goto_4
    new-instance v4, Ll/ۡ۠ۖ;

    invoke-direct {v4}, Ll/ۡ۠ۖ;-><init>()V

    .line 123
    sget-object v7, Ll/ۚ۠ۖ;->ۗ:Ll/ۚ۠ۖ;

    .line 519
    invoke-virtual {v2}, Ll/ۚ۠ۖ;->֫()I

    move-result v8

    const/4 v9, 0x4

    invoke-virtual {v4, v8, v9}, Ll/ۡ۠ۖ;->֫(II)V

    .line 141
    new-instance v8, Ll/ۡ۠ۖ;

    invoke-direct {v8}, Ll/ۡ۠ۖ;-><init>()V

    .line 541
    sget-object v10, Ll/᩶۠ۖ;->֫:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aget v10, v10, v11

    const/4 v11, 0x4

    const/4 v12, 0x1

    if-eq v10, v12, :cond_16

    const/4 v13, -0x1

    const/4 v14, 0x2

    if-eq v10, v14, :cond_12

    const/16 v14, 0x8

    const/4 v15, 0x3

    if-eq v10, v15, :cond_11

    if-ne v10, v11, :cond_10

    .line 615
    sget-object v3, Ll/ۖ۠ۖ;->ۧ:Ljava/nio/charset/Charset;

    if-eqz v3, :cond_f

    .line 619
    invoke-virtual {v0, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    .line 620
    array-length v10, v3

    rem-int/lit8 v10, v10, 0x2

    if-nez v10, :cond_e

    .line 623
    array-length v10, v3

    sub-int/2addr v10, v12

    const/4 v11, 0x0

    :goto_5
    if-ge v11, v10, :cond_19

    .line 625
    aget-byte v12, v3, v11

    and-int/lit16 v12, v12, 0xff

    add-int/lit8 v15, v11, 0x1

    .line 626
    aget-byte v15, v3, v15

    and-int/lit16 v15, v15, 0xff

    shl-int/2addr v12, v14

    or-int/2addr v12, v15

    const v15, 0x8140

    if-lt v12, v15, :cond_b

    const v15, 0x8140

    const v5, 0x9ffc

    if-gt v12, v5, :cond_b

    sub-int/2addr v12, v15

    goto :goto_6

    :cond_b
    const v5, 0xe040

    if-lt v12, v5, :cond_c

    const v5, 0xebbf

    if-gt v12, v5, :cond_c

    const v5, 0xc140

    sub-int/2addr v12, v5

    goto :goto_6

    :cond_c
    const/4 v12, -0x1

    :goto_6
    if-eq v12, v13, :cond_d

    shr-int/lit8 v5, v12, 0x8

    mul-int/lit16 v5, v5, 0xc0

    and-int/lit16 v12, v12, 0xff

    add-int/2addr v5, v12

    const/16 v12, 0xd

    .line 638
    invoke-virtual {v8, v5, v12}, Ll/ۡ۠ۖ;->֫(II)V

    add-int/lit8 v11, v11, 0x2

    goto :goto_5

    .line 635
    :cond_d
    new-instance v0, Ll/ۢ۠ۖ;

    const-string v1, "Invalid byte sequence"

    .line 31
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 635
    throw v0

    .line 621
    :cond_e
    new-instance v0, Ll/ۢ۠ۖ;

    const-string v1, "Kanji byte size not even"

    .line 31
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 621
    throw v0

    .line 617
    :cond_f
    new-instance v0, Ll/ۢ۠ۖ;

    const-string v1, "SJIS Charset not supported on this platform"

    .line 31
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 617
    throw v0

    .line 555
    :cond_10
    new-instance v0, Ll/ۢ۠ۖ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Invalid mode: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 31
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 555
    throw v0

    .line 608
    :cond_11
    invoke-virtual {v0, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    .line 609
    array-length v5, v3

    const/4 v10, 0x0

    :goto_7
    if-ge v10, v5, :cond_19

    aget-byte v11, v3, v10

    .line 610
    invoke-virtual {v8, v11, v14}, Ll/ۡ۠ۖ;->֫(II)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_7

    .line 584
    :cond_12
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v5, 0x0

    :goto_8
    if-ge v5, v3, :cond_19

    .line 587
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v10

    invoke-static {v10}, Ll/ۙ۠ۖ;->֫(I)I

    move-result v10

    if-eq v10, v13, :cond_15

    add-int/lit8 v11, v5, 0x1

    if-ge v11, v3, :cond_14

    .line 592
    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    invoke-static {v11}, Ll/ۙ۠ۖ;->֫(I)I

    move-result v11

    if-eq v11, v13, :cond_13

    mul-int/lit8 v10, v10, 0x2d

    add-int/2addr v10, v11

    const/16 v11, 0xb

    .line 597
    invoke-virtual {v8, v10, v11}, Ll/ۡ۠ۖ;->֫(II)V

    add-int/lit8 v5, v5, 0x2

    goto :goto_8

    .line 594
    :cond_13
    new-instance v0, Ll/ۢ۠ۖ;

    .line 27
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 594
    throw v0

    :cond_14
    const/4 v5, 0x6

    .line 601
    invoke-virtual {v8, v10, v5}, Ll/ۡ۠ۖ;->֫(II)V

    move v5, v11

    goto :goto_8

    .line 589
    :cond_15
    new-instance v0, Ll/ۢ۠ۖ;

    .line 27
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 589
    throw v0

    .line 560
    :cond_16
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v5, 0x0

    :goto_9
    if-ge v5, v3, :cond_19

    .line 563
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v10

    add-int/lit8 v10, v10, -0x30

    add-int/lit8 v12, v5, 0x2

    if-ge v12, v3, :cond_17

    add-int/lit8 v13, v5, 0x1

    .line 566
    invoke-virtual {v0, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    add-int/lit8 v13, v13, -0x30

    .line 567
    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    add-int/lit8 v12, v12, -0x30

    mul-int/lit8 v10, v10, 0x64

    const/16 v14, 0xa

    .line 568
    invoke-static {v13, v14, v10, v12}, Ll/᩺᩵ܿ;->֫(IIII)I

    move-result v10

    invoke-virtual {v8, v10, v14}, Ll/ۡ۠ۖ;->֫(II)V

    add-int/lit8 v5, v5, 0x3

    goto :goto_9

    :cond_17
    add-int/lit8 v5, v5, 0x1

    if-ge v5, v3, :cond_18

    .line 572
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    add-int/lit8 v5, v5, -0x30

    mul-int/lit8 v10, v10, 0xa

    add-int/2addr v10, v5

    const/4 v5, 0x7

    .line 573
    invoke-virtual {v8, v10, v5}, Ll/ۡ۠ۖ;->֫(II)V

    move v5, v12

    goto :goto_9

    .line 577
    :cond_18
    invoke-virtual {v8, v10, v11}, Ll/ۡ۠ۖ;->֫(II)V

    goto :goto_9

    .line 217
    :cond_19
    invoke-static {v6}, Ll/ܶ۠ۖ;->֫(I)Ll/ܶ۠ۖ;

    move-result-object v3

    .line 229
    invoke-virtual {v4}, Ll/ۡ۠ۖ;->getSize()I

    move-result v5

    invoke-virtual {v2, v3}, Ll/ۚ۠ۖ;->֫(Ll/ܶ۠ۖ;)I

    move-result v3

    add-int/2addr v3, v5

    invoke-virtual {v8}, Ll/ۡ۠ۖ;->getSize()I

    move-result v5

    add-int/2addr v5, v3

    const/4 v3, 0x1

    const/16 v16, 0x0

    :goto_a
    const-string v10, "Data too big"

    const/16 v11, 0x28

    if-gt v3, v11, :cond_52

    .line 315
    invoke-static {v3}, Ll/ܶ۠ۖ;->֫(I)Ll/ܶ۠ۖ;

    move-result-object v12

    .line 316
    invoke-static {v5, v12, v1}, Ll/ۙ۠ۖ;->֫(ILl/ܶ۠ۖ;Ll/֡۠ۖ;)Z

    move-result v13

    if-eqz v13, :cond_51

    .line 229
    invoke-virtual {v4}, Ll/ۡ۠ۖ;->getSize()I

    move-result v3

    invoke-virtual {v2, v12}, Ll/ۚ۠ۖ;->֫(Ll/ܶ۠ۖ;)I

    move-result v5

    add-int/2addr v5, v3

    invoke-virtual {v8}, Ll/ۡ۠ۖ;->getSize()I

    move-result v3

    add-int/2addr v3, v5

    const/4 v5, 0x1

    move/from16 v12, v16

    :goto_b
    if-gt v5, v11, :cond_50

    .line 315
    invoke-static {v5}, Ll/ܶ۠ۖ;->֫(I)Ll/ܶ۠ۖ;

    move-result-object v13

    .line 316
    invoke-static {v3, v13, v1}, Ll/ۙ۠ۖ;->֫(ILl/ܶ۠ۖ;Ll/֡۠ۖ;)Z

    move-result v14

    if-eqz v14, :cond_4f

    .line 155
    new-instance v3, Ll/ۡ۠ۖ;

    invoke-direct {v3}, Ll/ۡ۠ۖ;-><init>()V

    .line 156
    invoke-virtual {v3, v4}, Ll/ۡ۠ۖ;->֫(Ll/ۡ۠ۖ;)V

    if-ne v2, v7, :cond_1a

    .line 158
    invoke-virtual {v8}, Ll/ۡ۠ۖ;->֫()I

    move-result v0

    goto :goto_c

    :cond_1a
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v0

    .line 527
    :goto_c
    invoke-virtual {v2, v13}, Ll/ۚ۠ۖ;->֫(Ll/ܶ۠ۖ;)I

    move-result v4

    shl-int v5, v6, v4

    if-ge v0, v5, :cond_4e

    .line 531
    invoke-virtual {v3, v0, v4}, Ll/ۡ۠ۖ;->֫(II)V

    .line 161
    invoke-virtual {v3, v8}, Ll/ۡ۠ۖ;->֫(Ll/ۡ۠ۖ;)V

    .line 164
    invoke-virtual {v13, v1}, Ll/ܶ۠ۖ;->֫(Ll/֡۠ۖ;)Ll/۠۠ۖ;

    move-result-object v0

    .line 165
    invoke-virtual {v13}, Ll/ܶ۠ۖ;->ۧ()I

    move-result v4

    invoke-virtual {v0}, Ll/۠۠ۖ;->ᩳ()I

    move-result v5

    sub-int/2addr v4, v5

    mul-int/lit8 v5, v4, 0x8

    .line 345
    invoke-virtual {v3}, Ll/ۡ۠ۖ;->getSize()I

    move-result v7

    if-gt v7, v5, :cond_4d

    const/4 v7, 0x0

    :goto_d
    if-ge v7, v9, :cond_1b

    .line 350
    invoke-virtual {v3}, Ll/ۡ۠ۖ;->getSize()I

    move-result v8

    if-ge v8, v5, :cond_1b

    .line 351
    invoke-virtual {v3, v12}, Ll/ۡ۠ۖ;->֫(Z)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_d

    .line 355
    :cond_1b
    invoke-virtual {v3}, Ll/ۡ۠ۖ;->getSize()I

    move-result v7

    and-int/lit8 v7, v7, 0x7

    const/16 v8, 0x8

    if-lez v7, :cond_1c

    :goto_e
    if-ge v7, v8, :cond_1c

    .line 358
    invoke-virtual {v3, v12}, Ll/ۡ۠ۖ;->֫(Z)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_e

    .line 362
    :cond_1c
    invoke-virtual {v3}, Ll/ۡ۠ۖ;->֫()I

    move-result v7

    sub-int v7, v4, v7

    const/4 v9, 0x0

    :goto_f
    if-ge v9, v7, :cond_1e

    and-int/lit8 v10, v9, 0x1

    if-nez v10, :cond_1d

    const/16 v10, 0xec

    goto :goto_10

    :cond_1d
    const/16 v10, 0x11

    .line 364
    :goto_10
    invoke-virtual {v3, v10, v8}, Ll/ۡ۠ۖ;->֫(II)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_f

    .line 366
    :cond_1e
    invoke-virtual {v3}, Ll/ۡ۠ۖ;->getSize()I

    move-result v7

    if-ne v7, v5, :cond_4c

    .line 172
    invoke-virtual {v13}, Ll/ܶ۠ۖ;->ۧ()I

    move-result v5

    .line 174
    invoke-virtual {v0}, Ll/۠۠ۖ;->ܽ()I

    move-result v0

    .line 438
    invoke-virtual {v3}, Ll/ۡ۠ۖ;->֫()I

    move-result v7

    if-ne v7, v4, :cond_4b

    .line 449
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_11
    if-ge v8, v0, :cond_29

    .line 452
    new-array v12, v6, [I

    .line 453
    new-array v6, v6, [I

    if-ge v8, v0, :cond_28

    .line 386
    rem-int v15, v5, v0

    sub-int v14, v0, v15

    .line 390
    div-int v17, v5, v0

    add-int/lit8 v18, v17, 0x1

    .line 394
    div-int v19, v4, v0

    move-object/from16 v20, v13

    add-int/lit8 v13, v19, 0x1

    move-object/from16 v21, v2

    sub-int v2, v17, v19

    sub-int v1, v18, v13

    if-ne v2, v1, :cond_27

    move/from16 v17, v4

    add-int v4, v14, v15

    if-ne v0, v4, :cond_26

    add-int v4, v19, v2

    mul-int v4, v4, v14

    .line 411
    invoke-static {v13, v1, v15, v4}, Ll/᩶ۢᩴ;->֫(IIII)I

    move-result v4

    if-ne v5, v4, :cond_25

    if-ge v8, v14, :cond_1f

    const/4 v4, 0x0

    .line 420
    aput v19, v12, v4

    .line 421
    aput v2, v6, v4

    goto :goto_12

    :cond_1f
    const/4 v4, 0x0

    .line 423
    aput v13, v12, v4

    .line 424
    aput v1, v6, v4

    .line 458
    :goto_12
    aget v1, v12, v4

    .line 459
    new-array v2, v1, [B

    mul-int/lit8 v4, v9, 0x8

    const/4 v13, 0x0

    :goto_13
    if-ge v13, v1, :cond_22

    const/4 v14, 0x0

    const/4 v15, 0x0

    move/from16 v18, v0

    :goto_14
    const/16 v0, 0x8

    if-ge v15, v0, :cond_21

    .line 281
    invoke-virtual {v3, v4}, Ll/ۡ۠ۖ;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_20

    rsub-int/lit8 v0, v15, 0x7

    const/16 v19, 0x1

    shl-int v0, v19, v0

    or-int/2addr v0, v14

    move v14, v0

    goto :goto_15

    :cond_20
    const/16 v19, 0x1

    :goto_15
    add-int/lit8 v4, v4, 0x1

    add-int/lit8 v15, v15, 0x1

    goto :goto_14

    :cond_21
    const/16 v19, 0x1

    int-to-byte v0, v14

    .line 286
    aput-byte v0, v2, v13

    add-int/lit8 v13, v13, 0x1

    move/from16 v0, v18

    goto :goto_13

    :cond_22
    move/from16 v18, v0

    const/4 v0, 0x0

    .line 461
    aget v4, v6, v0

    add-int v0, v1, v4

    .line 502
    new-array v0, v0, [I

    const/4 v6, 0x0

    :goto_16
    if-ge v6, v1, :cond_23

    .line 504
    aget-byte v13, v2, v6

    and-int/lit16 v13, v13, 0xff

    aput v13, v0, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_16

    .line 506
    :cond_23
    new-instance v6, Ll/᩵۠ۖ;

    sget-object v13, Ll/ۘ۠ۖ;->᩻:Ll/ۘ۠ۖ;

    invoke-direct {v6, v13}, Ll/᩵۠ۖ;-><init>(Ll/ۘ۠ۖ;)V

    invoke-virtual {v6, v4, v0}, Ll/᩵۠ۖ;->֫(I[I)V

    .line 508
    new-array v6, v4, [B

    const/4 v13, 0x0

    :goto_17
    if-ge v13, v4, :cond_24

    add-int v14, v1, v13

    .line 510
    aget v14, v0, v14

    int-to-byte v14, v14

    aput-byte v14, v6, v13

    add-int/lit8 v13, v13, 0x1

    goto :goto_17

    .line 462
    :cond_24
    new-instance v0, Ll/᩸۠ۖ;

    invoke-direct {v0, v2, v6}, Ll/᩸۠ۖ;-><init>([B[B)V

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 464
    invoke-static {v10, v1}, Ljava/lang/Math;->max(II)I

    move-result v10

    .line 465
    invoke-static {v11, v4}, Ljava/lang/Math;->max(II)I

    move-result v11

    const/4 v0, 0x0

    .line 466
    aget v0, v12, v0

    add-int/2addr v9, v0

    add-int/lit8 v8, v8, 0x1

    const/4 v6, 0x1

    move-object/from16 v1, p1

    move/from16 v4, v17

    move/from16 v0, v18

    move-object/from16 v13, v20

    move-object/from16 v2, v21

    goto/16 :goto_11

    .line 416
    :cond_25
    new-instance v0, Ll/ۢ۠ۖ;

    const-string v1, "Total bytes mismatch"

    .line 31
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 416
    throw v0

    .line 408
    :cond_26
    new-instance v0, Ll/ۢ۠ۖ;

    const-string v1, "RS blocks mismatch"

    .line 31
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 408
    throw v0

    .line 404
    :cond_27
    new-instance v0, Ll/ۢ۠ۖ;

    const-string v1, "EC bytes mismatch"

    .line 31
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 404
    throw v0

    .line 383
    :cond_28
    new-instance v0, Ll/ۢ۠ۖ;

    const-string v1, "Block ID too large"

    .line 31
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 383
    throw v0

    :cond_29
    move-object/from16 v21, v2

    move-object/from16 v20, v13

    if-ne v4, v9, :cond_4a

    .line 472
    new-instance v0, Ll/ۡ۠ۖ;

    invoke-direct {v0}, Ll/ۡ۠ۖ;-><init>()V

    const/4 v1, 0x0

    :goto_18
    if-ge v1, v10, :cond_2c

    .line 476
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2a
    :goto_19
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩸۠ۖ;

    .line 477
    invoke-virtual {v3}, Ll/᩸۠ۖ;->֫()[B

    move-result-object v3

    .line 478
    array-length v4, v3

    if-ge v1, v4, :cond_2a

    .line 479
    aget-byte v3, v3, v1

    const/16 v4, 0x8

    invoke-virtual {v0, v3, v4}, Ll/ۡ۠ۖ;->֫(II)V

    goto :goto_19

    :cond_2b
    add-int/lit8 v1, v1, 0x1

    goto :goto_18

    :cond_2c
    const/4 v1, 0x0

    :goto_1a
    if-ge v1, v11, :cond_2f

    .line 485
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2d
    :goto_1b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩸۠ۖ;

    .line 486
    invoke-virtual {v3}, Ll/᩸۠ۖ;->ۧ()[B

    move-result-object v3

    .line 487
    array-length v4, v3

    if-ge v1, v4, :cond_2d

    .line 488
    aget-byte v3, v3, v1

    const/16 v4, 0x8

    invoke-virtual {v0, v3, v4}, Ll/ۡ۠ۖ;->֫(II)V

    goto :goto_1b

    :cond_2e
    add-int/lit8 v1, v1, 0x1

    goto :goto_1a

    .line 492
    :cond_2f
    invoke-virtual {v0}, Ll/ۡ۠ۖ;->֫()I

    move-result v1

    if-ne v5, v1, :cond_49

    .line 176
    new-instance v1, Ll/۫۠ۖ;

    invoke-direct {v1}, Ll/۫۠ۖ;-><init>()V

    move-object/from16 v2, p1

    .line 178
    invoke-virtual {v1, v2}, Ll/۫۠ۖ;->֫(Ll/֡۠ۖ;)V

    move-object/from16 v6, v21

    .line 179
    invoke-virtual {v1, v6}, Ll/۫۠ۖ;->֫(Ll/ۚ۠ۖ;)V

    move-object/from16 v3, v20

    .line 180
    invoke-virtual {v1, v3}, Ll/۫۠ۖ;->֫(Ll/ܶ۠ۖ;)V

    .line 183
    invoke-virtual {v3}, Ll/ܶ۠ۖ;->֫()I

    move-result v4

    .line 184
    new-instance v5, Ll/᩹۠ۖ;

    invoke-direct {v5, v4, v4}, Ll/᩹۠ۖ;-><init>(II)V

    const/4 v4, -0x1

    const v6, 0x7fffffff

    const/4 v7, 0x0

    :goto_1c
    const/16 v8, 0x8

    if-ge v7, v8, :cond_48

    .line 303
    invoke-static {v0, v2, v3, v7, v5}, Ll/۬۠ۖ;->֫(Ll/ۡ۠ۖ;Ll/֡۠ۖ;Ll/ܶ۠ۖ;ILl/᩹۠ۖ;)V

    .line 61
    invoke-static {v5}, Ll/ۗ۠ۖ;->֫(Ll/᩹۠ۖ;)I

    move-result v8

    .line 51
    invoke-virtual {v5}, Ll/᩹۠ۖ;->ۧ()[[B

    move-result-object v9

    .line 52
    invoke-virtual {v5}, Ll/᩹۠ۖ;->ᩳ()I

    move-result v10

    .line 53
    invoke-virtual {v5}, Ll/᩹۠ۖ;->ܽ()I

    move-result v11

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_1d
    add-int/lit8 v14, v11, -0x1

    if-ge v12, v14, :cond_32

    .line 55
    aget-object v14, v9, v12

    const/4 v15, 0x0

    :goto_1e
    move/from16 p0, v11

    add-int/lit8 v11, v10, -0x1

    if-ge v15, v11, :cond_31

    .line 57
    aget-byte v11, v14, v15

    add-int/lit8 v16, v15, 0x1

    move/from16 v17, v10

    .line 58
    aget-byte v10, v14, v16

    if-ne v11, v10, :cond_30

    add-int/lit8 v10, v12, 0x1

    aget-object v10, v9, v10

    aget-byte v15, v10, v15

    if-ne v11, v15, :cond_30

    aget-byte v10, v10, v16

    if-ne v11, v10, :cond_30

    add-int/lit8 v13, v13, 0x1

    :cond_30
    move/from16 v11, p0

    move/from16 v15, v16

    move/from16 v10, v17

    goto :goto_1e

    :cond_31
    move/from16 v17, v10

    add-int/lit8 v12, v12, 0x1

    move/from16 v11, p0

    goto :goto_1d

    :cond_32
    mul-int/lit8 v13, v13, 0x3

    add-int/2addr v13, v8

    .line 73
    invoke-virtual {v5}, Ll/᩹۠ۖ;->ۧ()[[B

    move-result-object v8

    .line 74
    invoke-virtual {v5}, Ll/᩹۠ۖ;->ᩳ()I

    move-result v9

    .line 75
    invoke-virtual {v5}, Ll/᩹۠ۖ;->ܽ()I

    move-result v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_1f
    if-ge v11, v10, :cond_43

    const/4 v14, 0x0

    :goto_20
    if-ge v14, v9, :cond_42

    .line 78
    aget-object v15, v8, v11

    move-object/from16 p0, v0

    add-int/lit8 v0, v14, 0x6

    if-ge v0, v9, :cond_39

    move/from16 v16, v9

    .line 79
    aget-byte v9, v15, v14

    const/4 v2, 0x1

    if-ne v9, v2, :cond_3a

    add-int/lit8 v9, v14, 0x1

    aget-byte v9, v15, v9

    if-nez v9, :cond_3a

    add-int/lit8 v9, v14, 0x2

    aget-byte v9, v15, v9

    if-ne v9, v2, :cond_3a

    add-int/lit8 v9, v14, 0x3

    aget-byte v9, v15, v9

    if-ne v9, v2, :cond_3a

    add-int/lit8 v9, v14, 0x4

    aget-byte v9, v15, v9

    if-ne v9, v2, :cond_3a

    add-int/lit8 v9, v14, 0x5

    aget-byte v9, v15, v9

    if-nez v9, :cond_3a

    aget-byte v0, v15, v0

    if-ne v0, v2, :cond_3a

    add-int/lit8 v0, v14, -0x4

    if-ltz v0, :cond_35

    .line 107
    array-length v9, v15

    if-ge v9, v14, :cond_33

    goto :goto_22

    :cond_33
    :goto_21
    if-ge v0, v14, :cond_38

    .line 111
    aget-byte v9, v15, v0

    if-ne v9, v2, :cond_34

    goto :goto_22

    :cond_34
    add-int/lit8 v0, v0, 0x1

    const/4 v2, 0x1

    goto :goto_21

    :cond_35
    :goto_22
    add-int/lit8 v0, v14, 0x7

    add-int/lit8 v2, v14, 0xb

    if-ltz v0, :cond_3a

    .line 107
    array-length v9, v15

    if-ge v9, v2, :cond_36

    goto :goto_24

    :cond_36
    :goto_23
    if-ge v0, v2, :cond_38

    .line 111
    aget-byte v9, v15, v0

    move/from16 v17, v2

    const/4 v2, 0x1

    if-ne v9, v2, :cond_37

    goto :goto_24

    :cond_37
    add-int/lit8 v0, v0, 0x1

    move/from16 v2, v17

    goto :goto_23

    :cond_38
    add-int/lit8 v12, v12, 0x1

    goto :goto_24

    :cond_39
    move/from16 v16, v9

    :cond_3a
    :goto_24
    add-int/lit8 v0, v11, 0x6

    if-ge v0, v10, :cond_41

    .line 90
    aget-object v2, v8, v11

    aget-byte v2, v2, v14

    const/4 v9, 0x1

    if-ne v2, v9, :cond_41

    add-int/lit8 v2, v11, 0x1

    aget-object v2, v8, v2

    aget-byte v2, v2, v14

    if-nez v2, :cond_41

    add-int/lit8 v2, v11, 0x2

    aget-object v2, v8, v2

    aget-byte v2, v2, v14

    if-ne v2, v9, :cond_41

    add-int/lit8 v2, v11, 0x3

    aget-object v2, v8, v2

    aget-byte v2, v2, v14

    if-ne v2, v9, :cond_41

    add-int/lit8 v2, v11, 0x4

    aget-object v2, v8, v2

    aget-byte v2, v2, v14

    if-ne v2, v9, :cond_41

    add-int/lit8 v2, v11, 0x5

    aget-object v2, v8, v2

    aget-byte v2, v2, v14

    if-nez v2, :cond_41

    aget-object v0, v8, v0

    aget-byte v0, v0, v14

    if-ne v0, v9, :cond_41

    add-int/lit8 v0, v11, -0x4

    if-ltz v0, :cond_3d

    .line 119
    array-length v2, v8

    if-ge v2, v11, :cond_3b

    goto :goto_26

    :cond_3b
    :goto_25
    if-ge v0, v11, :cond_40

    .line 123
    aget-object v2, v8, v0

    aget-byte v2, v2, v14

    if-ne v2, v9, :cond_3c

    goto :goto_26

    :cond_3c
    add-int/lit8 v0, v0, 0x1

    const/4 v9, 0x1

    goto :goto_25

    :cond_3d
    :goto_26
    add-int/lit8 v0, v11, 0x7

    add-int/lit8 v2, v11, 0xb

    if-ltz v0, :cond_41

    .line 119
    array-length v9, v8

    if-ge v9, v2, :cond_3e

    goto :goto_28

    :cond_3e
    :goto_27
    if-ge v0, v2, :cond_40

    .line 123
    aget-object v9, v8, v0

    aget-byte v9, v9, v14

    const/4 v15, 0x1

    if-ne v9, v15, :cond_3f

    goto :goto_28

    :cond_3f
    add-int/lit8 v0, v0, 0x1

    goto :goto_27

    :cond_40
    add-int/lit8 v12, v12, 0x1

    :cond_41
    :goto_28
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move/from16 v9, v16

    goto/16 :goto_20

    :cond_42
    move-object/from16 p0, v0

    move/from16 v16, v9

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v2, p1

    goto/16 :goto_1f

    :cond_43
    move-object/from16 p0, v0

    mul-int/lit8 v12, v12, 0x28

    add-int/2addr v12, v13

    .line 136
    invoke-virtual {v5}, Ll/᩹۠ۖ;->ۧ()[[B

    move-result-object v0

    .line 137
    invoke-virtual {v5}, Ll/᩹۠ۖ;->ᩳ()I

    move-result v2

    .line 138
    invoke-virtual {v5}, Ll/᩹۠ۖ;->ܽ()I

    move-result v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_29
    if-ge v9, v8, :cond_46

    .line 140
    aget-object v11, v0, v9

    const/4 v13, 0x0

    :goto_2a
    if-ge v13, v2, :cond_45

    .line 142
    aget-byte v14, v11, v13

    const/4 v15, 0x1

    if-ne v14, v15, :cond_44

    add-int/lit8 v10, v10, 0x1

    :cond_44
    add-int/lit8 v13, v13, 0x1

    goto :goto_2a

    :cond_45
    add-int/lit8 v9, v9, 0x1

    goto :goto_29

    .line 147
    :cond_46
    invoke-virtual {v5}, Ll/᩹۠ۖ;->ܽ()I

    move-result v0

    invoke-virtual {v5}, Ll/᩹۠ۖ;->ᩳ()I

    move-result v2

    mul-int v2, v2, v0

    mul-int/lit8 v10, v10, 0x2

    sub-int/2addr v10, v2

    .line 148
    invoke-static {v10}, Ljava/lang/Math;->abs(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0xa

    div-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0xa

    add-int/2addr v0, v12

    if-ge v0, v6, :cond_47

    move v6, v0

    move v4, v7

    :cond_47
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    goto/16 :goto_1c

    :cond_48
    move-object/from16 p0, v0

    .line 196
    invoke-virtual {v1, v4}, Ll/۫۠ۖ;->֫(I)V

    move-object/from16 v2, p1

    .line 199
    invoke-static {v0, v2, v3, v4, v5}, Ll/۬۠ۖ;->֫(Ll/ۡ۠ۖ;Ll/֡۠ۖ;Ll/ܶ۠ۖ;ILl/᩹۠ۖ;)V

    .line 200
    invoke-virtual {v1, v5}, Ll/۫۠ۖ;->֫(Ll/᩹۠ۖ;)V

    return-object v1

    .line 493
    :cond_49
    new-instance v1, Ll/ۢ۠ۖ;

    const-string v2, "Interleaving error: "

    const-string v3, " and "

    .line 0
    invoke-static {v5, v2, v3}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 494
    invoke-virtual {v0}, Ll/ۡ۠ۖ;->֫()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " differ."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 31
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 494
    throw v1

    .line 469
    :cond_4a
    new-instance v0, Ll/ۢ۠ۖ;

    const-string v1, "Data bytes does not match offset"

    .line 31
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 469
    throw v0

    .line 439
    :cond_4b
    new-instance v0, Ll/ۢ۠ۖ;

    const-string v1, "Number of bits and data bytes does not match"

    .line 31
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 439
    throw v0

    .line 367
    :cond_4c
    new-instance v0, Ll/ۢ۠ۖ;

    const-string v1, "Bits size does not equal capacity"

    .line 31
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 367
    throw v0

    .line 346
    :cond_4d
    new-instance v0, Ll/ۢ۠ۖ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "data bits cannot fit in the QR Code"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ll/ۡ۠ۖ;->getSize()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " > "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 31
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 346
    throw v0

    .line 529
    :cond_4e
    new-instance v1, Ll/ۢ۠ۖ;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " is bigger than "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v5, v5, -0x1

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 31
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 529
    throw v1

    :cond_4f
    move-object v6, v2

    move-object v2, v1

    add-int/lit8 v5, v5, 0x1

    const/4 v12, 0x0

    const/4 v1, 0x1

    move-object v1, v2

    move-object v2, v6

    const/4 v6, 0x1

    goto/16 :goto_b

    .line 320
    :cond_50
    new-instance v0, Ll/ۢ۠ۖ;

    .line 31
    invoke-direct {v0, v10}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 320
    throw v0

    :cond_51
    move-object v6, v2

    move-object v2, v1

    add-int/lit8 v3, v3, 0x1

    const/16 v16, 0x0

    const/4 v1, 0x1

    move-object v1, v2

    move-object v2, v6

    const/4 v6, 0x1

    goto/16 :goto_a

    :cond_52
    new-instance v0, Ll/ۢ۠ۖ;

    .line 31
    invoke-direct {v0, v10}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 320
    throw v0
.end method

.method public static ֫(ILl/ܶ۠ۖ;Ll/֡۠ۖ;)Z
    .locals 1

    .line 330
    invoke-virtual {p1}, Ll/ܶ۠ۖ;->ۧ()I

    move-result v0

    .line 332
    invoke-virtual {p1, p2}, Ll/ܶ۠ۖ;->֫(Ll/֡۠ۖ;)Ll/۠۠ۖ;

    move-result-object p1

    .line 333
    invoke-virtual {p1}, Ll/۠۠ۖ;->ᩳ()I

    move-result p1

    sub-int/2addr v0, p1

    add-int/lit8 p0, p0, 0x7

    .line 336
    div-int/lit8 p0, p0, 0x8

    if-lt v0, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
