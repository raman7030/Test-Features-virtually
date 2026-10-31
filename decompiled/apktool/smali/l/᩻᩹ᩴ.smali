.class public final Ll/᩻᩹ᩴ;
.super Ljava/nio/charset/CharsetEncoder;
.source "N673"


# instance fields
.field public a:Ll/ܿ֨ᩴ;


# direct methods
.method public constructor <init>(Ll/ۜ᩹ᩴ;)V
    .locals 2

    const v0, 0x3f8ccccd    # 1.1f

    const/high16 v1, 0x40400000    # 3.0f

    .line 431
    invoke-direct {p0, p1, v0, v1}, Ljava/nio/charset/CharsetEncoder;-><init>(Ljava/nio/charset/Charset;FF)V

    return-void
.end method


# virtual methods
.method public final canEncode(C)Z
    .locals 0

    .line 435
    invoke-static {p1}, Ljava/lang/Character;->isSurrogate(C)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public final encodeLoop(Ljava/nio/CharBuffer;Ljava/nio/ByteBuffer;)Ljava/nio/charset/CoderResult;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 563
    invoke-virtual/range {p1 .. p1}, Ljava/nio/CharBuffer;->hasArray()Z

    move-result v3

    const/4 v4, 0x0

    const/16 v6, 0x80

    const/4 v7, 0x2

    const/4 v8, 0x4

    if-eqz v3, :cond_f

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v3

    if-eqz v3, :cond_f

    .line 458
    invoke-virtual/range {p1 .. p1}, Ljava/nio/CharBuffer;->array()[C

    move-result-object v3

    .line 459
    invoke-virtual/range {p1 .. p1}, Ljava/nio/CharBuffer;->arrayOffset()I

    move-result v9

    invoke-virtual/range {p1 .. p1}, Ljava/nio/CharBuffer;->position()I

    move-result v10

    add-int/2addr v10, v9

    .line 460
    invoke-virtual/range {p1 .. p1}, Ljava/nio/CharBuffer;->arrayOffset()I

    move-result v9

    invoke-virtual/range {p1 .. p1}, Ljava/nio/CharBuffer;->limit()I

    move-result v11

    add-int/2addr v11, v9

    .line 462
    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v9

    .line 463
    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v12

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->position()I

    move-result v13

    add-int/2addr v13, v12

    .line 464
    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v12

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->limit()I

    move-result v14

    add-int/2addr v14, v12

    sub-int v12, v11, v10

    const/4 v15, 0x1

    sub-int v5, v14, v13

    .line 465
    invoke-static {v12, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    add-int/2addr v5, v13

    :goto_0
    if-ge v13, v5, :cond_0

    .line 468
    aget-char v12, v3, v10

    if-ge v12, v6, :cond_0

    add-int/lit8 v17, v13, 0x1

    add-int/lit8 v10, v10, 0x1

    int-to-byte v12, v12

    .line 469
    aput-byte v12, v9, v13

    move/from16 v13, v17

    goto :goto_0

    :cond_0
    const/16 v5, 0x800

    :goto_1
    if-ge v10, v11, :cond_e

    .line 471
    aget-char v12, v3, v10

    if-ge v12, v6, :cond_2

    if-lt v13, v14, :cond_1

    .line 445
    invoke-static {v1, v10, v2, v13}, Ll/ۜ᩹ᩴ;->l(Ljava/nio/Buffer;ILjava/nio/Buffer;I)V

    .line 446
    sget-object v1, Ljava/nio/charset/CoderResult;->OVERFLOW:Ljava/nio/charset/CoderResult;

    return-object v1

    :cond_1
    add-int/lit8 v5, v13, 0x1

    int-to-byte v8, v12

    .line 476
    aput-byte v8, v9, v13

    move v13, v5

    goto/16 :goto_4

    :cond_2
    if-ge v12, v5, :cond_4

    sub-int v5, v14, v13

    if-ge v5, v7, :cond_3

    .line 445
    invoke-static {v1, v10, v2, v13}, Ll/ۜ᩹ᩴ;->l(Ljava/nio/Buffer;ILjava/nio/Buffer;I)V

    .line 446
    sget-object v1, Ljava/nio/charset/CoderResult;->OVERFLOW:Ljava/nio/charset/CoderResult;

    return-object v1

    :cond_3
    add-int/lit8 v5, v13, 0x1

    shr-int/lit8 v8, v12, 0x6

    or-int/lit16 v8, v8, 0xc0

    int-to-byte v8, v8

    .line 481
    aput-byte v8, v9, v13

    add-int/lit8 v13, v13, 0x2

    and-int/lit8 v8, v12, 0x3f

    or-int/2addr v8, v6

    int-to-byte v8, v8

    .line 482
    aput-byte v8, v9, v5

    goto/16 :goto_4

    .line 483
    :cond_4
    invoke-static {v12}, Ljava/lang/Character;->isSurrogate(C)Z

    move-result v5

    if-eqz v5, :cond_c

    .line 485
    iget-object v5, v0, Ll/᩻᩹ᩴ;->a:Ll/ܿ֨ᩴ;

    if-nez v5, :cond_5

    .line 486
    new-instance v5, Ll/ܿ֨ᩴ;

    invoke-direct {v5}, Ll/ܿ֨ᩴ;-><init>()V

    iput-object v5, v0, Ll/᩻᩹ᩴ;->a:Ll/ܿ֨ᩴ;

    .line 487
    :cond_5
    iget-object v5, v0, Ll/᩻᩹ᩴ;->a:Ll/ܿ֨ᩴ;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    invoke-static {v12}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v16

    if-eqz v16, :cond_8

    sub-int v6, v11, v10

    if-ge v6, v7, :cond_6

    .line 228
    sget-object v6, Ljava/nio/charset/CoderResult;->UNDERFLOW:Ljava/nio/charset/CoderResult;

    iput-object v6, v5, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    goto :goto_2

    :cond_6
    add-int/lit8 v6, v10, 0x1

    .line 231
    aget-char v6, v3, v6

    .line 232
    invoke-static {v6}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v17

    if-eqz v17, :cond_7

    .line 233
    invoke-static {v12, v6}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v12

    .line 235
    iput-object v4, v5, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    goto :goto_3

    .line 238
    :cond_7
    invoke-static {v15}, Ljava/nio/charset/CoderResult;->malformedForLength(I)Ljava/nio/charset/CoderResult;

    move-result-object v6

    iput-object v6, v5, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    goto :goto_2

    .line 241
    :cond_8
    invoke-static {v12}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v6

    if-eqz v6, :cond_9

    .line 242
    invoke-static {v15}, Ljava/nio/charset/CoderResult;->malformedForLength(I)Ljava/nio/charset/CoderResult;

    move-result-object v6

    iput-object v6, v5, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    :goto_2
    const/4 v12, -0x1

    goto :goto_3

    .line 247
    :cond_9
    iput-object v4, v5, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    :goto_3
    if-gez v12, :cond_a

    .line 489
    invoke-static {v1, v10, v2, v13}, Ll/ۜ᩹ᩴ;->l(Ljava/nio/Buffer;ILjava/nio/Buffer;I)V

    .line 490
    iget-object v1, v0, Ll/᩻᩹ᩴ;->a:Ll/ܿ֨ᩴ;

    .line 158
    iget-object v1, v1, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    check-cast v1, Ljava/nio/charset/CoderResult;

    return-object v1

    :cond_a
    sub-int v5, v14, v13

    if-ge v5, v8, :cond_b

    .line 445
    invoke-static {v1, v10, v2, v13}, Ll/ۜ᩹ᩴ;->l(Ljava/nio/Buffer;ILjava/nio/Buffer;I)V

    .line 446
    sget-object v1, Ljava/nio/charset/CoderResult;->OVERFLOW:Ljava/nio/charset/CoderResult;

    return-object v1

    :cond_b
    add-int/lit8 v5, v13, 0x1

    shr-int/lit8 v6, v12, 0x12

    or-int/lit16 v6, v6, 0xf0

    int-to-byte v6, v6

    .line 494
    aput-byte v6, v9, v13

    add-int/lit8 v6, v13, 0x2

    shr-int/lit8 v8, v12, 0xc

    and-int/lit8 v8, v8, 0x3f

    const/16 v15, 0x80

    or-int/2addr v8, v15

    int-to-byte v8, v8

    .line 495
    aput-byte v8, v9, v5

    add-int/lit8 v5, v13, 0x3

    shr-int/lit8 v8, v12, 0x6

    and-int/lit8 v8, v8, 0x3f

    or-int/2addr v8, v15

    int-to-byte v8, v8

    .line 496
    aput-byte v8, v9, v6

    add-int/lit8 v13, v13, 0x4

    and-int/lit8 v6, v12, 0x3f

    or-int/2addr v6, v15

    int-to-byte v6, v6

    .line 497
    aput-byte v6, v9, v5

    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    :cond_c
    sub-int v5, v14, v13

    const/4 v6, 0x3

    if-ge v5, v6, :cond_d

    .line 445
    invoke-static {v1, v10, v2, v13}, Ll/ۜ᩹ᩴ;->l(Ljava/nio/Buffer;ILjava/nio/Buffer;I)V

    .line 446
    sget-object v1, Ljava/nio/charset/CoderResult;->OVERFLOW:Ljava/nio/charset/CoderResult;

    return-object v1

    :cond_d
    add-int/lit8 v5, v13, 0x1

    shr-int/lit8 v6, v12, 0xc

    or-int/lit16 v6, v6, 0xe0

    int-to-byte v6, v6

    .line 503
    aput-byte v6, v9, v13

    add-int/lit8 v6, v13, 0x2

    shr-int/lit8 v8, v12, 0x6

    and-int/lit8 v8, v8, 0x3f

    const/16 v15, 0x80

    or-int/2addr v8, v15

    int-to-byte v8, v8

    .line 504
    aput-byte v8, v9, v5

    add-int/lit8 v13, v13, 0x3

    and-int/lit8 v5, v12, 0x3f

    or-int/2addr v5, v15

    int-to-byte v5, v5

    .line 505
    aput-byte v5, v9, v6

    :goto_4
    add-int/lit8 v10, v10, 0x1

    const/16 v5, 0x800

    const/4 v8, 0x4

    const/16 v6, 0x80

    const/4 v15, 0x1

    goto/16 :goto_1

    .line 509
    :cond_e
    invoke-static {v1, v10, v2, v13}, Ll/ۜ᩹ᩴ;->l(Ljava/nio/Buffer;ILjava/nio/Buffer;I)V

    .line 510
    sget-object v1, Ljava/nio/charset/CoderResult;->UNDERFLOW:Ljava/nio/charset/CoderResult;

    return-object v1

    :cond_f
    const/4 v3, 0x1

    .line 516
    invoke-virtual/range {p1 .. p1}, Ljava/nio/CharBuffer;->position()I

    move-result v5

    .line 517
    :goto_5
    invoke-virtual/range {p1 .. p1}, Ljava/nio/CharBuffer;->hasRemaining()Z

    move-result v6

    if-eqz v6, :cond_1d

    .line 518
    invoke-virtual/range {p1 .. p1}, Ljava/nio/CharBuffer;->get()C

    move-result v6

    const/16 v8, 0x80

    if-ge v6, v8, :cond_11

    .line 521
    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v8

    if-nez v8, :cond_10

    .line 450
    invoke-virtual {v1, v5}, Ljava/nio/CharBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v1

    check-cast v1, Ljava/nio/CharBuffer;

    .line 451
    sget-object v1, Ljava/nio/charset/CoderResult;->OVERFLOW:Ljava/nio/charset/CoderResult;

    return-object v1

    :cond_10
    int-to-byte v6, v6

    .line 523
    invoke-virtual {v2, v6}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto/16 :goto_8

    :cond_11
    const/16 v8, 0x800

    if-ge v6, v8, :cond_13

    .line 526
    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v8

    if-ge v8, v7, :cond_12

    .line 450
    invoke-virtual {v1, v5}, Ljava/nio/CharBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v1

    check-cast v1, Ljava/nio/CharBuffer;

    .line 451
    sget-object v1, Ljava/nio/charset/CoderResult;->OVERFLOW:Ljava/nio/charset/CoderResult;

    return-object v1

    :cond_12
    shr-int/lit8 v8, v6, 0x6

    or-int/lit16 v8, v8, 0xc0

    int-to-byte v8, v8

    .line 528
    invoke-virtual {v2, v8}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    and-int/lit8 v6, v6, 0x3f

    const/16 v8, 0x80

    or-int/2addr v6, v8

    int-to-byte v6, v6

    .line 529
    invoke-virtual {v2, v6}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto/16 :goto_8

    .line 530
    :cond_13
    invoke-static {v6}, Ljava/lang/Character;->isSurrogate(C)Z

    move-result v8

    if-eqz v8, :cond_1b

    .line 532
    iget-object v8, v0, Ll/᩻᩹ᩴ;->a:Ll/ܿ֨ᩴ;

    if-nez v8, :cond_14

    .line 533
    new-instance v8, Ll/ܿ֨ᩴ;

    invoke-direct {v8}, Ll/ܿ֨ᩴ;-><init>()V

    iput-object v8, v0, Ll/᩻᩹ᩴ;->a:Ll/ܿ֨ᩴ;

    .line 534
    :cond_14
    iget-object v8, v0, Ll/᩻᩹ᩴ;->a:Ll/ܿ֨ᩴ;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    invoke-static {v6}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v9

    if-eqz v9, :cond_17

    .line 185
    invoke-virtual/range {p1 .. p1}, Ljava/nio/CharBuffer;->hasRemaining()Z

    move-result v9

    if-nez v9, :cond_15

    .line 186
    sget-object v6, Ljava/nio/charset/CoderResult;->UNDERFLOW:Ljava/nio/charset/CoderResult;

    iput-object v6, v8, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    goto :goto_6

    .line 189
    :cond_15
    invoke-virtual/range {p1 .. p1}, Ljava/nio/CharBuffer;->get()C

    move-result v9

    .line 190
    invoke-static {v9}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v10

    if-eqz v10, :cond_16

    .line 191
    invoke-static {v6, v9}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v6

    .line 193
    iput-object v4, v8, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    goto :goto_7

    .line 196
    :cond_16
    invoke-static {v3}, Ljava/nio/charset/CoderResult;->malformedForLength(I)Ljava/nio/charset/CoderResult;

    move-result-object v6

    iput-object v6, v8, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    goto :goto_6

    .line 199
    :cond_17
    invoke-static {v6}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v9

    if-eqz v9, :cond_18

    .line 200
    invoke-static {v3}, Ljava/nio/charset/CoderResult;->malformedForLength(I)Ljava/nio/charset/CoderResult;

    move-result-object v6

    iput-object v6, v8, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    :goto_6
    const/4 v6, -0x1

    goto :goto_7

    .line 205
    :cond_18
    iput-object v4, v8, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    :goto_7
    if-gez v6, :cond_19

    .line 536
    invoke-virtual {v1, v5}, Ljava/nio/CharBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v1

    check-cast v1, Ljava/nio/CharBuffer;

    .line 537
    iget-object v1, v0, Ll/᩻᩹ᩴ;->a:Ll/ܿ֨ᩴ;

    .line 158
    iget-object v1, v1, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    check-cast v1, Ljava/nio/charset/CoderResult;

    return-object v1

    .line 539
    :cond_19
    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v8

    const/4 v9, 0x4

    if-ge v8, v9, :cond_1a

    .line 450
    invoke-virtual {v1, v5}, Ljava/nio/CharBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v1

    check-cast v1, Ljava/nio/CharBuffer;

    .line 451
    sget-object v1, Ljava/nio/charset/CoderResult;->OVERFLOW:Ljava/nio/charset/CoderResult;

    return-object v1

    :cond_1a
    shr-int/lit8 v8, v6, 0x12

    or-int/lit16 v8, v8, 0xf0

    int-to-byte v8, v8

    .line 541
    invoke-virtual {v2, v8}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    shr-int/lit8 v8, v6, 0xc

    and-int/lit8 v8, v8, 0x3f

    const/16 v9, 0x80

    or-int/2addr v8, v9

    int-to-byte v8, v8

    .line 542
    invoke-virtual {v2, v8}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    shr-int/lit8 v8, v6, 0x6

    and-int/lit8 v8, v8, 0x3f

    or-int/2addr v8, v9

    int-to-byte v8, v8

    .line 543
    invoke-virtual {v2, v8}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    and-int/lit8 v6, v6, 0x3f

    or-int/2addr v6, v9

    int-to-byte v6, v6

    .line 544
    invoke-virtual {v2, v6}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    add-int/lit8 v5, v5, 0x1

    :goto_8
    const/16 v9, 0x80

    goto :goto_9

    .line 548
    :cond_1b
    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v8

    const/4 v9, 0x3

    if-ge v8, v9, :cond_1c

    .line 450
    invoke-virtual {v1, v5}, Ljava/nio/CharBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v1

    check-cast v1, Ljava/nio/CharBuffer;

    .line 451
    sget-object v1, Ljava/nio/charset/CoderResult;->OVERFLOW:Ljava/nio/charset/CoderResult;

    return-object v1

    :cond_1c
    shr-int/lit8 v8, v6, 0xc

    or-int/lit16 v8, v8, 0xe0

    int-to-byte v8, v8

    .line 550
    invoke-virtual {v2, v8}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    shr-int/lit8 v8, v6, 0x6

    and-int/lit8 v8, v8, 0x3f

    const/16 v9, 0x80

    or-int/2addr v8, v9

    int-to-byte v8, v8

    .line 551
    invoke-virtual {v2, v8}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    and-int/lit8 v6, v6, 0x3f

    or-int/2addr v6, v9

    int-to-byte v6, v6

    .line 552
    invoke-virtual {v2, v6}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    :goto_9
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_5

    .line 556
    :cond_1d
    invoke-virtual {v1, v5}, Ljava/nio/CharBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v1

    check-cast v1, Ljava/nio/CharBuffer;

    .line 557
    sget-object v1, Ljava/nio/charset/CoderResult;->UNDERFLOW:Ljava/nio/charset/CoderResult;

    return-object v1
.end method

.method public final isLegalReplacement([B)Z
    .locals 3

    .line 439
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    aget-byte v0, p1, v1

    if-gez v0, :cond_1

    .line 440
    :cond_0
    invoke-super {p0, p1}, Ljava/nio/charset/CharsetEncoder;->isLegalReplacement([B)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    return v2

    :cond_2
    return v1
.end method
