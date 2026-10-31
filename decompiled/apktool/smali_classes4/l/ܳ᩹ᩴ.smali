.class public final Ll/ܳ᩹ᩴ;
.super Ljava/nio/charset/CharsetDecoder;
.source "N673"


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 83
    const-class v0, Ll/ۜ᩹ᩴ;

    return-void
.end method

.method public constructor <init>(Ll/ۜ᩹ᩴ;)V
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    .line 86
    invoke-direct {p0, p1, v0, v0}, Ljava/nio/charset/CharsetDecoder;-><init>(Ljava/nio/charset/Charset;FF)V

    return-void
.end method

.method public static a(III)Z
    .locals 2

    const/16 v0, -0x20

    const/16 v1, 0x80

    if-ne p0, v0, :cond_0

    and-int/lit16 p0, p1, 0xe0

    if-eq p0, v1, :cond_2

    :cond_0
    and-int/lit16 p0, p1, 0xc0

    if-ne p0, v1, :cond_2

    and-int/lit16 p0, p2, 0xc0

    if-eq p0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static b(II)Z
    .locals 2

    const/16 v0, 0xf0

    if-ne p0, v0, :cond_0

    const/16 v0, 0x90

    if-lt p1, v0, :cond_2

    const/16 v0, 0xbf

    if-gt p1, v0, :cond_2

    :cond_0
    const/16 v0, 0xf4

    const/16 v1, 0x80

    if-ne p0, v0, :cond_1

    and-int/lit16 p0, p1, 0xf0

    if-ne p0, v1, :cond_2

    :cond_1
    and-int/lit16 p0, p1, 0xc0

    if-eq p0, v1, :cond_3

    :cond_2
    const/4 p0, 0x1

    return p0

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method public static c(I)Z
    .locals 1

    and-int/lit16 p0, p0, 0xc0

    const/16 v0, 0x80

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static d(Ljava/nio/ByteBuffer;ILjava/nio/CharBuffer;II)Ljava/nio/charset/CoderResult;
    .locals 1

    .line 173
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v0

    sub-int v0, p1, v0

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    .line 174
    invoke-static {p0, p4}, Ll/ܳ᩹ᩴ;->e(Ljava/nio/ByteBuffer;I)Ljava/nio/charset/CoderResult;

    move-result-object p4

    .line 175
    invoke-static {p0, p1, p2, p3}, Ll/ۜ᩹ᩴ;->l(Ljava/nio/Buffer;ILjava/nio/Buffer;I)V

    return-object p4
.end method

.method public static e(Ljava/nio/ByteBuffer;I)Ljava/nio/charset/CoderResult;
    .locals 8

    const/4 v0, 0x1

    if-eq p1, v0, :cond_a

    const/4 v1, 0x2

    if-eq p1, v1, :cond_a

    const/16 v2, 0x80

    const/4 v3, 0x3

    if-eq p1, v3, :cond_6

    const/4 v4, 0x4

    if-eq p1, v4, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 153
    :cond_0
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    and-int/lit16 p1, p1, 0xff

    .line 154
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v4

    and-int/lit16 v5, v4, 0xff

    const/16 v6, 0xf4

    if-gt p1, v6, :cond_5

    const/16 v7, 0xf0

    if-ne p1, v7, :cond_1

    const/16 v7, 0x90

    if-lt v5, v7, :cond_5

    const/16 v7, 0xbf

    if-gt v5, v7, :cond_5

    :cond_1
    if-ne p1, v6, :cond_2

    and-int/lit16 p1, v4, 0xf0

    if-ne p1, v2, :cond_5

    .line 158
    :cond_2
    invoke-static {v5}, Ll/ܳ᩹ᩴ;->c(I)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    .line 160
    :cond_3
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result p0

    invoke-static {p0}, Ll/ܳ᩹ᩴ;->c(I)Z

    move-result p0

    if-eqz p0, :cond_4

    .line 161
    invoke-static {v1}, Ljava/nio/charset/CoderResult;->malformedForLength(I)Ljava/nio/charset/CoderResult;

    move-result-object p0

    return-object p0

    .line 162
    :cond_4
    invoke-static {v3}, Ljava/nio/charset/CoderResult;->malformedForLength(I)Ljava/nio/charset/CoderResult;

    move-result-object p0

    return-object p0

    .line 159
    :cond_5
    :goto_0
    invoke-static {v0}, Ljava/nio/charset/CoderResult;->malformedForLength(I)Ljava/nio/charset/CoderResult;

    move-result-object p0

    return-object p0

    .line 147
    :cond_6
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    .line 148
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result p0

    const/16 v1, -0x20

    if-ne p1, v1, :cond_7

    and-int/lit16 p1, p0, 0xe0

    if-eq p1, v2, :cond_9

    .line 151
    :cond_7
    invoke-static {p0}, Ll/ܳ᩹ᩴ;->c(I)Z

    move-result p0

    if-eqz p0, :cond_8

    goto :goto_1

    :cond_8
    const/4 v0, 0x2

    .line 149
    :cond_9
    :goto_1
    invoke-static {v0}, Ljava/nio/charset/CoderResult;->malformedForLength(I)Ljava/nio/charset/CoderResult;

    move-result-object p0

    return-object p0

    .line 145
    :cond_a
    invoke-static {v0}, Ljava/nio/charset/CoderResult;->malformedForLength(I)Ljava/nio/charset/CoderResult;

    move-result-object p0

    return-object p0
.end method

.method public static f(Ljava/nio/Buffer;II)Ljava/nio/charset/CoderResult;
    .locals 0

    .line 216
    invoke-virtual {p0, p1}, Ljava/nio/Buffer;->position(I)Ljava/nio/Buffer;

    if-eqz p2, :cond_1

    .line 217
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    move-result p0

    if-ge p0, p2, :cond_0

    goto :goto_0

    .line 218
    :cond_0
    sget-object p0, Ljava/nio/charset/CoderResult;->OVERFLOW:Ljava/nio/charset/CoderResult;

    return-object p0

    :cond_1
    :goto_0
    sget-object p0, Ljava/nio/charset/CoderResult;->UNDERFLOW:Ljava/nio/charset/CoderResult;

    return-object p0
.end method

.method public static g(Ljava/nio/Buffer;IILjava/nio/Buffer;II)Ljava/nio/charset/CoderResult;
    .locals 0

    .line 210
    invoke-static {p0, p1, p3, p4}, Ll/ۜ᩹ᩴ;->l(Ljava/nio/Buffer;ILjava/nio/Buffer;I)V

    if-eqz p5, :cond_1

    sub-int/2addr p2, p1

    if-ge p2, p5, :cond_0

    goto :goto_0

    .line 212
    :cond_0
    sget-object p0, Ljava/nio/charset/CoderResult;->OVERFLOW:Ljava/nio/charset/CoderResult;

    return-object p0

    :cond_1
    :goto_0
    sget-object p0, Ljava/nio/charset/CoderResult;->UNDERFLOW:Ljava/nio/charset/CoderResult;

    return-object p0
.end method


# virtual methods
.method public final decodeLoop(Ljava/nio/ByteBuffer;Ljava/nio/CharBuffer;)Ljava/nio/charset/CoderResult;
    .locals 19

    move-object/from16 v0, p1

    move-object/from16 v3, p2

    .line 413
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v1

    const/4 v4, 0x1

    const/4 v6, 0x3

    const/4 v7, -0x2

    if-eqz v1, :cond_19

    invoke-virtual/range {p2 .. p2}, Ljava/nio/CharBuffer;->hasArray()Z

    move-result v1

    if-eqz v1, :cond_19

    .line 225
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    .line 226
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v8

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v9

    add-int/2addr v9, v8

    .line 227
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v8

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result v10

    add-int/2addr v8, v10

    .line 229
    invoke-virtual/range {p2 .. p2}, Ljava/nio/CharBuffer;->array()[C

    move-result-object v10

    .line 230
    invoke-virtual/range {p2 .. p2}, Ljava/nio/CharBuffer;->arrayOffset()I

    move-result v11

    invoke-virtual/range {p2 .. p2}, Ljava/nio/CharBuffer;->position()I

    move-result v12

    add-int/2addr v12, v11

    .line 231
    invoke-virtual/range {p2 .. p2}, Ljava/nio/CharBuffer;->arrayOffset()I

    move-result v11

    invoke-virtual/range {p2 .. p2}, Ljava/nio/CharBuffer;->limit()I

    move-result v13

    add-int/2addr v13, v11

    sub-int v14, v8, v9

    const v15, -0x1e080

    sub-int v5, v13, v12

    .line 232
    invoke-static {v14, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    add-int/2addr v5, v12

    :goto_0
    if-ge v12, v5, :cond_0

    .line 235
    aget-byte v14, v1, v9

    if-ltz v14, :cond_0

    add-int/lit8 v17, v12, 0x1

    add-int/lit8 v9, v9, 0x1

    int-to-char v14, v14

    .line 236
    aput-char v14, v10, v12

    move/from16 v12, v17

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_1
    if-ge v9, v8, :cond_18

    .line 238
    aget-byte v14, v1, v9

    if-ltz v14, :cond_2

    if-lt v12, v13, :cond_1

    const/4 v5, 0x1

    move-object/from16 v0, p1

    move v1, v9

    move v2, v8

    move-object/from16 v3, p2

    move v4, v12

    .line 242
    invoke-static/range {v0 .. v5}, Ll/ܳ᩹ᩴ;->g(Ljava/nio/Buffer;IILjava/nio/Buffer;II)Ljava/nio/charset/CoderResult;

    move-result-object v0

    return-object v0

    :cond_1
    add-int/lit8 v5, v12, 0x1

    int-to-char v14, v14

    .line 243
    aput-char v14, v10, v12

    add-int/lit8 v9, v9, 0x1

    :goto_2
    move v12, v5

    const v16, 0x381f80

    goto/16 :goto_6

    :cond_2
    const/16 v11, -0x20

    shr-int/lit8 v2, v14, 0x5

    if-ne v2, v7, :cond_6

    and-int/lit8 v2, v14, 0x1e

    if-eqz v2, :cond_6

    sub-int v2, v8, v9

    if-lt v2, v5, :cond_5

    if-lt v12, v13, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 v2, v9, 0x1

    .line 250
    aget-byte v2, v1, v2

    .line 257
    invoke-static {v2}, Ll/ܳ᩹ᩴ;->c(I)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 195
    invoke-static {v0, v9, v3, v12}, Ll/ۜ᩹ᩴ;->l(Ljava/nio/Buffer;ILjava/nio/Buffer;I)V

    .line 196
    invoke-static {v4}, Ljava/nio/charset/CoderResult;->malformedForLength(I)Ljava/nio/charset/CoderResult;

    move-result-object v0

    return-object v0

    :cond_4
    add-int/lit8 v5, v12, 0x1

    shl-int/lit8 v11, v14, 0x6

    xor-int/2addr v2, v11

    xor-int/lit16 v2, v2, 0xf80

    int-to-char v2, v2

    .line 259
    aput-char v2, v10, v12

    add-int/lit8 v9, v9, 0x2

    goto :goto_2

    :cond_5
    :goto_3
    const/4 v5, 0x2

    move-object/from16 v0, p1

    move v1, v9

    move v2, v8

    move-object/from16 v3, p2

    move v4, v12

    .line 249
    invoke-static/range {v0 .. v5}, Ll/ܳ᩹ᩴ;->g(Ljava/nio/Buffer;IILjava/nio/Buffer;II)Ljava/nio/charset/CoderResult;

    move-result-object v0

    return-object v0

    :cond_6
    shr-int/lit8 v2, v14, 0x4

    if-ne v2, v7, :cond_e

    sub-int v2, v8, v9

    if-lt v2, v6, :cond_a

    if-lt v12, v13, :cond_7

    goto :goto_4

    :cond_7
    add-int/lit8 v2, v9, 0x1

    .line 272
    aget-byte v2, v1, v2

    add-int/lit8 v5, v9, 0x2

    .line 273
    aget-byte v5, v1, v5

    .line 274
    invoke-static {v14, v2, v5}, Ll/ܳ᩹ᩴ;->a(III)Z

    move-result v11

    if-eqz v11, :cond_8

    .line 275
    invoke-static {v0, v9, v3, v12, v6}, Ll/ܳ᩹ᩴ;->d(Ljava/nio/ByteBuffer;ILjava/nio/CharBuffer;II)Ljava/nio/charset/CoderResult;

    move-result-object v0

    return-object v0

    :cond_8
    shl-int/lit8 v11, v14, 0xc

    shl-int/lit8 v2, v2, 0x6

    xor-int/2addr v2, v11

    xor-int/2addr v5, v15

    xor-int/2addr v2, v5

    int-to-char v2, v2

    .line 283
    invoke-static {v2}, Ljava/lang/Character;->isSurrogate(C)Z

    move-result v5

    if-eqz v5, :cond_9

    .line 195
    invoke-static {v0, v9, v3, v12}, Ll/ۜ᩹ᩴ;->l(Ljava/nio/Buffer;ILjava/nio/Buffer;I)V

    .line 196
    invoke-static {v6}, Ljava/nio/charset/CoderResult;->malformedForLength(I)Ljava/nio/charset/CoderResult;

    move-result-object v0

    return-object v0

    :cond_9
    add-int/lit8 v5, v12, 0x1

    .line 285
    aput-char v2, v10, v12

    add-int/lit8 v9, v9, 0x3

    goto :goto_2

    :cond_a
    :goto_4
    if-le v2, v4, :cond_d

    add-int/lit8 v2, v9, 0x1

    .line 268
    aget-byte v1, v1, v2

    if-ne v14, v11, :cond_b

    and-int/lit16 v2, v1, 0xe0

    const/16 v5, 0x80

    if-eq v2, v5, :cond_c

    goto :goto_5

    :cond_b
    const/16 v5, 0x80

    :goto_5
    and-int/lit16 v1, v1, 0xc0

    if-eq v1, v5, :cond_d

    .line 195
    :cond_c
    invoke-static {v0, v9, v3, v12}, Ll/ۜ᩹ᩴ;->l(Ljava/nio/Buffer;ILjava/nio/Buffer;I)V

    .line 196
    invoke-static {v4}, Ljava/nio/charset/CoderResult;->malformedForLength(I)Ljava/nio/charset/CoderResult;

    move-result-object v0

    return-object v0

    :cond_d
    const/4 v5, 0x3

    move-object/from16 v0, p1

    move v1, v9

    move v2, v8

    move-object/from16 v3, p2

    move v4, v12

    .line 270
    invoke-static/range {v0 .. v5}, Ll/ܳ᩹ᩴ;->g(Ljava/nio/Buffer;IILjava/nio/Buffer;II)Ljava/nio/charset/CoderResult;

    move-result-object v0

    return-object v0

    :cond_e
    shr-int/lit8 v2, v14, 0x3

    if-ne v2, v7, :cond_17

    sub-int v2, v8, v9

    const/4 v5, 0x4

    if-lt v2, v5, :cond_13

    sub-int v5, v13, v12

    const/4 v11, 0x2

    if-ge v5, v11, :cond_f

    goto :goto_8

    :cond_f
    add-int/lit8 v2, v9, 0x1

    .line 299
    aget-byte v2, v1, v2

    add-int/lit8 v5, v9, 0x2

    .line 300
    aget-byte v5, v1, v5

    add-int/lit8 v11, v9, 0x3

    .line 301
    aget-byte v11, v1, v11

    shl-int/lit8 v14, v14, 0x12

    shl-int/lit8 v18, v2, 0xc

    xor-int v14, v14, v18

    shl-int/lit8 v18, v5, 0x6

    xor-int v14, v14, v18

    const v16, 0x381f80

    xor-int v18, v11, v16

    xor-int v14, v14, v18

    and-int/lit16 v2, v2, 0xc0

    const/16 v15, 0x80

    if-ne v2, v15, :cond_12

    and-int/lit16 v2, v5, 0xc0

    if-ne v2, v15, :cond_12

    and-int/lit16 v2, v11, 0xc0

    if-eq v2, v15, :cond_10

    goto :goto_7

    .line 312
    :cond_10
    invoke-static {v14}, Ljava/lang/Character;->isSupplementaryCodePoint(I)Z

    move-result v2

    if-nez v2, :cond_11

    goto :goto_7

    :cond_11
    add-int/lit8 v2, v12, 0x1

    .line 315
    invoke-static {v14}, Ljava/lang/Character;->highSurrogate(I)C

    move-result v5

    aput-char v5, v10, v12

    add-int/lit8 v12, v12, 0x2

    .line 316
    invoke-static {v14}, Ljava/lang/Character;->lowSurrogate(I)C

    move-result v5

    aput-char v5, v10, v2

    add-int/lit8 v9, v9, 0x4

    :goto_6
    const/4 v5, 0x2

    const v15, -0x1e080

    goto/16 :goto_1

    :cond_12
    :goto_7
    const/4 v1, 0x4

    .line 313
    invoke-static {v0, v9, v3, v12, v1}, Ll/ܳ᩹ᩴ;->d(Ljava/nio/ByteBuffer;ILjava/nio/CharBuffer;II)Ljava/nio/charset/CoderResult;

    move-result-object v0

    return-object v0

    :cond_13
    :goto_8
    and-int/lit16 v5, v14, 0xff

    const/16 v6, 0xf4

    if-gt v5, v6, :cond_16

    if-le v2, v4, :cond_14

    add-int/lit8 v6, v9, 0x1

    .line 292
    aget-byte v6, v1, v6

    and-int/lit16 v6, v6, 0xff

    .line 293
    invoke-static {v5, v6}, Ll/ܳ᩹ᩴ;->b(II)Z

    move-result v5

    if-eqz v5, :cond_14

    goto :goto_9

    :cond_14
    const/4 v4, 0x2

    if-le v2, v4, :cond_15

    add-int/lit8 v2, v9, 0x2

    .line 295
    aget-byte v1, v1, v2

    and-int/lit16 v1, v1, 0xc0

    const/16 v2, 0x80

    if-eq v1, v2, :cond_15

    .line 195
    invoke-static {v0, v9, v3, v12}, Ll/ۜ᩹ᩴ;->l(Ljava/nio/Buffer;ILjava/nio/Buffer;I)V

    .line 196
    invoke-static {v4}, Ljava/nio/charset/CoderResult;->malformedForLength(I)Ljava/nio/charset/CoderResult;

    move-result-object v0

    return-object v0

    :cond_15
    const/4 v5, 0x4

    move-object/from16 v0, p1

    move v1, v9

    move v2, v8

    move-object/from16 v3, p2

    move v4, v12

    .line 297
    invoke-static/range {v0 .. v5}, Ll/ܳ᩹ᩴ;->g(Ljava/nio/Buffer;IILjava/nio/Buffer;II)Ljava/nio/charset/CoderResult;

    move-result-object v0

    return-object v0

    .line 195
    :cond_16
    :goto_9
    invoke-static {v0, v9, v3, v12}, Ll/ۜ᩹ᩴ;->l(Ljava/nio/Buffer;ILjava/nio/Buffer;I)V

    .line 196
    invoke-static {v4}, Ljava/nio/charset/CoderResult;->malformedForLength(I)Ljava/nio/charset/CoderResult;

    move-result-object v0

    return-object v0

    .line 319
    :cond_17
    invoke-static {v0, v9, v3, v12, v4}, Ll/ܳ᩹ᩴ;->d(Ljava/nio/ByteBuffer;ILjava/nio/CharBuffer;II)Ljava/nio/charset/CoderResult;

    move-result-object v0

    return-object v0

    :cond_18
    const/4 v5, 0x0

    move-object/from16 v0, p1

    move v1, v9

    move v2, v8

    move-object/from16 v3, p2

    move v4, v12

    .line 321
    invoke-static/range {v0 .. v5}, Ll/ܳ᩹ᩴ;->g(Ljava/nio/Buffer;IILjava/nio/Buffer;II)Ljava/nio/charset/CoderResult;

    move-result-object v0

    return-object v0

    :cond_19
    const/16 v1, 0xf4

    const v2, 0x381f80

    const v5, -0x1e080

    .line 327
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v8

    .line 328
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result v9

    :goto_a
    if-ge v8, v9, :cond_31

    .line 330
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v10

    if-ltz v10, :cond_1b

    .line 333
    invoke-virtual/range {p2 .. p2}, Ljava/nio/CharBuffer;->remaining()I

    move-result v11

    if-ge v11, v4, :cond_1a

    .line 334
    invoke-static {v0, v8, v4}, Ll/ܳ᩹ᩴ;->f(Ljava/nio/Buffer;II)Ljava/nio/charset/CoderResult;

    move-result-object v0

    return-object v0

    :cond_1a
    int-to-char v10, v10

    .line 335
    invoke-virtual {v3, v10}, Ljava/nio/CharBuffer;->put(C)Ljava/nio/CharBuffer;

    add-int/lit8 v8, v8, 0x1

    goto :goto_a

    :cond_1b
    shr-int/lit8 v11, v10, 0x5

    if-ne v11, v7, :cond_1f

    and-int/lit8 v11, v10, 0x1e

    if-eqz v11, :cond_1f

    sub-int v11, v9, v8

    const/4 v12, 0x2

    if-lt v11, v12, :cond_1e

    .line 339
    invoke-virtual/range {p2 .. p2}, Ljava/nio/CharBuffer;->remaining()I

    move-result v11

    if-ge v11, v4, :cond_1c

    const/4 v12, 0x2

    goto :goto_b

    .line 341
    :cond_1c
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v11

    .line 342
    invoke-static {v11}, Ll/ܳ᩹ᩴ;->c(I)Z

    move-result v12

    if-eqz v12, :cond_1d

    .line 203
    invoke-virtual {v0, v8}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    .line 204
    invoke-static {v4}, Ljava/nio/charset/CoderResult;->malformedForLength(I)Ljava/nio/charset/CoderResult;

    move-result-object v0

    return-object v0

    :cond_1d
    shl-int/lit8 v10, v10, 0x6

    xor-int/2addr v10, v11

    xor-int/lit16 v10, v10, 0xf80

    int-to-char v10, v10

    .line 344
    invoke-virtual {v3, v10}, Ljava/nio/CharBuffer;->put(C)Ljava/nio/CharBuffer;

    add-int/lit8 v8, v8, 0x2

    goto :goto_a

    .line 340
    :cond_1e
    :goto_b
    invoke-static {v0, v8, v12}, Ll/ܳ᩹ᩴ;->f(Ljava/nio/Buffer;II)Ljava/nio/charset/CoderResult;

    move-result-object v0

    return-object v0

    :cond_1f
    shr-int/lit8 v11, v10, 0x4

    if-ne v11, v7, :cond_27

    sub-int v11, v9, v8

    if-lt v11, v6, :cond_23

    .line 352
    invoke-virtual/range {p2 .. p2}, Ljava/nio/CharBuffer;->remaining()I

    move-result v12

    if-ge v12, v4, :cond_20

    goto :goto_d

    .line 357
    :cond_20
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v11

    .line 358
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v12

    .line 359
    invoke-static {v10, v11, v12}, Ll/ܳ᩹ᩴ;->a(III)Z

    move-result v13

    if-eqz v13, :cond_21

    .line 183
    invoke-virtual {v0, v8}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v1

    check-cast v1, Ljava/nio/ByteBuffer;

    .line 184
    invoke-static {v0, v6}, Ll/ܳ᩹ᩴ;->e(Ljava/nio/ByteBuffer;I)Ljava/nio/charset/CoderResult;

    move-result-object v1

    .line 185
    :goto_c
    invoke-virtual {v0, v8}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    return-object v1

    :cond_21
    shl-int/lit8 v10, v10, 0xc

    shl-int/lit8 v11, v11, 0x6

    xor-int/2addr v10, v11

    xor-int v11, v12, v5

    xor-int/2addr v10, v11

    int-to-char v10, v10

    .line 368
    invoke-static {v10}, Ljava/lang/Character;->isSurrogate(C)Z

    move-result v11

    if-eqz v11, :cond_22

    .line 203
    invoke-virtual {v0, v8}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    .line 204
    invoke-static {v6}, Ljava/nio/charset/CoderResult;->malformedForLength(I)Ljava/nio/charset/CoderResult;

    move-result-object v0

    return-object v0

    .line 370
    :cond_22
    invoke-virtual {v3, v10}, Ljava/nio/CharBuffer;->put(C)Ljava/nio/CharBuffer;

    add-int/lit8 v8, v8, 0x3

    goto/16 :goto_a

    :cond_23
    :goto_d
    if-le v11, v4, :cond_26

    .line 353
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    const/16 v2, -0x20

    if-ne v10, v2, :cond_24

    and-int/lit16 v2, v1, 0xe0

    const/16 v3, 0x80

    if-eq v2, v3, :cond_25

    goto :goto_e

    :cond_24
    const/16 v3, 0x80

    :goto_e
    and-int/lit16 v1, v1, 0xc0

    if-eq v1, v3, :cond_26

    .line 203
    :cond_25
    invoke-virtual {v0, v8}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    .line 204
    invoke-static {v4}, Ljava/nio/charset/CoderResult;->malformedForLength(I)Ljava/nio/charset/CoderResult;

    move-result-object v0

    return-object v0

    .line 355
    :cond_26
    invoke-static {v0, v8, v6}, Ll/ܳ᩹ᩴ;->f(Ljava/nio/Buffer;II)Ljava/nio/charset/CoderResult;

    move-result-object v0

    return-object v0

    :cond_27
    shr-int/lit8 v11, v10, 0x3

    if-ne v11, v7, :cond_30

    sub-int v11, v9, v8

    const/4 v12, 0x4

    if-lt v11, v12, :cond_2c

    .line 375
    invoke-virtual/range {p2 .. p2}, Ljava/nio/CharBuffer;->remaining()I

    move-result v12

    const/4 v13, 0x2

    if-ge v12, v13, :cond_28

    goto :goto_10

    .line 384
    :cond_28
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v11

    .line 385
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v12

    .line 386
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v13

    shl-int/lit8 v10, v10, 0x12

    shl-int/lit8 v14, v11, 0xc

    xor-int/2addr v10, v14

    shl-int/lit8 v14, v12, 0x6

    xor-int/2addr v10, v14

    xor-int v14, v13, v2

    xor-int/2addr v10, v14

    and-int/lit16 v11, v11, 0xc0

    const/16 v14, 0x80

    if-ne v11, v14, :cond_2b

    and-int/lit16 v11, v12, 0xc0

    if-ne v11, v14, :cond_2b

    and-int/lit16 v11, v13, 0xc0

    if-eq v11, v14, :cond_29

    goto :goto_f

    .line 397
    :cond_29
    invoke-static {v10}, Ljava/lang/Character;->isSupplementaryCodePoint(I)Z

    move-result v11

    if-nez v11, :cond_2a

    goto :goto_f

    .line 400
    :cond_2a
    invoke-static {v10}, Ljava/lang/Character;->highSurrogate(I)C

    move-result v11

    invoke-virtual {v3, v11}, Ljava/nio/CharBuffer;->put(C)Ljava/nio/CharBuffer;

    .line 401
    invoke-static {v10}, Ljava/lang/Character;->lowSurrogate(I)C

    move-result v10

    invoke-virtual {v3, v10}, Ljava/nio/CharBuffer;->put(C)Ljava/nio/CharBuffer;

    add-int/lit8 v8, v8, 0x4

    goto/16 :goto_a

    .line 183
    :cond_2b
    :goto_f
    invoke-virtual {v0, v8}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v1

    check-cast v1, Ljava/nio/ByteBuffer;

    const/4 v1, 0x4

    .line 184
    invoke-static {v0, v1}, Ll/ܳ᩹ᩴ;->e(Ljava/nio/ByteBuffer;I)Ljava/nio/charset/CoderResult;

    move-result-object v1

    goto/16 :goto_c

    :cond_2c
    :goto_10
    and-int/lit16 v2, v10, 0xff

    if-gt v2, v1, :cond_2f

    if-le v11, v4, :cond_2d

    .line 378
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    invoke-static {v2, v1}, Ll/ܳ᩹ᩴ;->b(II)Z

    move-result v1

    if-eqz v1, :cond_2d

    goto :goto_11

    :cond_2d
    const/4 v1, 0x2

    if-le v11, v1, :cond_2e

    .line 380
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    and-int/lit16 v2, v2, 0xc0

    const/16 v3, 0x80

    if-eq v2, v3, :cond_2e

    .line 203
    invoke-virtual {v0, v8}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    .line 204
    invoke-static {v1}, Ljava/nio/charset/CoderResult;->malformedForLength(I)Ljava/nio/charset/CoderResult;

    move-result-object v0

    return-object v0

    :cond_2e
    const/4 v1, 0x4

    .line 382
    invoke-static {v0, v8, v1}, Ll/ܳ᩹ᩴ;->f(Ljava/nio/Buffer;II)Ljava/nio/charset/CoderResult;

    move-result-object v0

    return-object v0

    .line 203
    :cond_2f
    :goto_11
    invoke-virtual {v0, v8}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    .line 204
    invoke-static {v4}, Ljava/nio/charset/CoderResult;->malformedForLength(I)Ljava/nio/charset/CoderResult;

    move-result-object v0

    return-object v0

    .line 183
    :cond_30
    invoke-virtual {v0, v8}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v1

    check-cast v1, Ljava/nio/ByteBuffer;

    .line 184
    invoke-static {v0, v4}, Ll/ܳ᩹ᩴ;->e(Ljava/nio/ByteBuffer;I)Ljava/nio/charset/CoderResult;

    move-result-object v1

    goto/16 :goto_c

    :cond_31
    const/4 v1, 0x0

    .line 407
    invoke-static {v0, v8, v1}, Ll/ܳ᩹ᩴ;->f(Ljava/nio/Buffer;II)Ljava/nio/charset/CoderResult;

    move-result-object v0

    return-object v0
.end method
