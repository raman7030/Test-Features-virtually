.class public final Ll/ܿ᩹ۢ;
.super Ljava/lang/Object;
.source "01T6"


# instance fields
.field public ֡:Z

.field public ֨:I

.field public ֫:Z

.field public ֫֫:Z

.field public ۖ:I

.field public final ۗ:Ll/ᩳ᩹ۢ;

.field public ۘ:I

.field public final ۙ:Ll/ᩳ᩹ۢ;

.field public ۚ:I

.field public ۛ:[Z

.field public ۜ:I

.field public ۟:Z

.field public final ۠:Ll/֫᩹ۢ;

.field public ۡ:I

.field public ۢ:I

.field public final ۤ:Ll/ۖ᩹ۢ;

.field public final ۧ:Ll/֫᩹ۢ;

.field public ۧ֫:Z

.field public ۨ:Ljava/lang/String;

.field public ۫:I

.field public ۬:Ll/֫᩹ۢ;

.field public ܰ:I

.field public ܳ:I

.field public final ܶ:Ljava/lang/StringBuilder;

.field public ܺ:I

.field public ܽ:I

.field public ܽ֫:B

.field public ܿ:I

.field public ܿ֫:B

.field public final ᩳ:[I

.field public final ᩳ֫:[B

.field public ᩴ:I

.field public ᩵:I

.field public ᩶:I

.field public ᩷:Z

.field public ᩸:I

.field public ᩹:I

.field public final ᩺:Ljava/util/Stack;

.field public final ᩻:Ll/ܽ᩹ۢ;


# direct methods
.method public constructor <init>(Ll/ܿ᩶ۢ;II)V
    .locals 2

    .line 372
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 197
    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    iput-object v0, p0, Ll/ܿ᩹ۢ;->᩺:Ljava/util/Stack;

    const/4 v0, 0x0

    .line 204
    iput v0, p0, Ll/ܿ᩹ۢ;->ۖ:I

    const/16 v1, 0x10

    new-array v1, v1, [I

    .line 239
    iput-object v1, p0, Ll/ܿ᩹ۢ;->ᩳ:[I

    .line 244
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v1, p0, Ll/ܿ᩹ۢ;->ܶ:Ljava/lang/StringBuilder;

    .line 257
    new-instance v1, Ll/ᩳ᩹ۢ;

    invoke-direct {v1}, Ll/ᩳ᩹ۢ;-><init>()V

    iput-object v1, p0, Ll/ܿ᩹ۢ;->ۗ:Ll/ᩳ᩹ۢ;

    .line 258
    new-instance v1, Ll/ᩳ᩹ۢ;

    invoke-direct {v1}, Ll/ᩳ᩹ۢ;-><init>()V

    iput-object v1, p0, Ll/ܿ᩹ۢ;->ۙ:Ll/ᩳ᩹ۢ;

    const/4 v1, 0x1

    .line 263
    iput-boolean v1, p0, Ll/ܿ᩹ۢ;->ۧ֫:Z

    .line 312
    iput v0, p0, Ll/ܿ᩹ۢ;->۫:I

    const/4 v0, 0x4

    new-array v0, v0, [B

    .line 315
    iput-object v0, p0, Ll/ܿ᩹ۢ;->ᩳ֫:[B

    const/4 v0, -0x1

    .line 316
    iput v0, p0, Ll/ܿ᩹ۢ;->ۚ:I

    .line 318
    new-instance v0, Ll/ܽ᩹ۢ;

    invoke-direct {v0}, Ll/ܽ᩹ۢ;-><init>()V

    iput-object v0, p0, Ll/ܿ᩹ۢ;->᩻:Ll/ܽ᩹ۢ;

    .line 373
    iput-object p1, p0, Ll/ܿ᩹ۢ;->ۤ:Ll/ۖ᩹ۢ;

    .line 374
    new-instance p1, Ll/֫᩹ۢ;

    const/16 v0, 0x7d0

    invoke-direct {p1, p2, v0, p3}, Ll/֫᩹ۢ;-><init>(III)V

    iput-object p1, p0, Ll/ܿ᩹ۢ;->۠:Ll/֫᩹ۢ;

    iput-object p1, p0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    .line 375
    new-instance p1, Ll/֫᩹ۢ;

    invoke-direct {p1, p2, p3, p3}, Ll/֫᩹ۢ;-><init>(III)V

    iput-object p1, p0, Ll/ܿ᩹ۢ;->ۧ:Ll/֫᩹ۢ;

    .line 376
    iput p3, p0, Ll/ܿ᩹ۢ;->᩹:I

    .line 377
    iput p2, p0, Ll/ܿ᩹ۢ;->ۜ:I

    .line 378
    new-array p1, p2, [Z

    iput-object p1, p0, Ll/ܿ᩹ۢ;->ۛ:[Z

    .line 379
    invoke-virtual {p0}, Ll/ܿ᩹ۢ;->ܺ()V

    return-void
.end method

.method private ֡()V
    .locals 2

    .line 1433
    iget-object v0, p0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    iget-object v1, p0, Ll/ܿ᩹ۢ;->۠:Ll/֫᩹ۢ;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/ܿ᩹ۢ;->ۗ:Ll/ᩳ᩹ۢ;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ll/ܿ᩹ۢ;->ۙ:Ll/ᩳ᩹ۢ;

    .line 1434
    :goto_0
    iget v1, p0, Ll/ܿ᩹ۢ;->ܺ:I

    iput v1, v0, Ll/ᩳ᩹ۢ;->ܽ:I

    .line 1435
    iget v1, p0, Ll/ܿ᩹ۢ;->ۡ:I

    iput v1, v0, Ll/ᩳ᩹ۢ;->ۧ:I

    .line 1436
    iget v1, p0, Ll/ܿ᩹ۢ;->ۘ:I

    iput v1, v0, Ll/ᩳ᩹ۢ;->ܿ:I

    .line 1437
    iget v1, p0, Ll/ܿ᩹ۢ;->᩵:I

    iput v1, v0, Ll/ᩳ᩹ۢ;->ܳ:I

    .line 1438
    iget v1, p0, Ll/ܿ᩹ۢ;->ܿ:I

    iput v1, v0, Ll/ᩳ᩹ۢ;->֫:I

    .line 1439
    iget v1, p0, Ll/ܿ᩹ۢ;->ۢ:I

    iput v1, v0, Ll/ᩳ᩹ۢ;->ᩳ:I

    .line 1440
    iget-boolean v1, p0, Ll/ܿ᩹ۢ;->۟:Z

    iput-boolean v1, v0, Ll/ᩳ᩹ۢ;->᩻:Z

    .line 1441
    iget-boolean v1, p0, Ll/ܿ᩹ۢ;->֫֫:Z

    iput-boolean v1, v0, Ll/ᩳ᩹ۢ;->ۜ:Z

    .line 1442
    iget-boolean v1, p0, Ll/ܿ᩹ۢ;->ۧ֫:Z

    iput-boolean v1, v0, Ll/ᩳ᩹ۢ;->᩷:Z

    return-void
.end method

.method private ֫(IIZ)I
    .locals 1

    .line 2166
    iget-object v0, p0, Ll/ܿ᩹ۢ;->ᩳ:[I

    aget p1, v0, p1

    if-ltz p1, :cond_1

    if-nez p1, :cond_0

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    return p1

    :cond_1
    :goto_0
    return p2
.end method

.method private ֫(B)V
    .locals 10

    .line 504
    iget-byte v0, p0, Ll/ܿ᩹ۢ;->ܿ֫:B

    const/4 v1, 0x3

    const/4 v2, 0x2

    iget-object v3, p0, Ll/ܿ᩹ۢ;->ᩳ֫:[B

    const v4, 0xfffd

    const/4 v5, 0x1

    if-lez v0, :cond_b

    and-int/lit16 v6, p1, 0xc0

    const/4 v7, 0x0

    const/16 v8, 0x80

    if-ne v6, v8, :cond_a

    .line 507
    iget-byte v6, p0, Ll/ܿ᩹ۢ;->ܽ֫:B

    add-int/lit8 v9, v6, 0x1

    int-to-byte v9, v9

    iput-byte v9, p0, Ll/ܿ᩹ۢ;->ܽ֫:B

    aput-byte p1, v3, v6

    sub-int/2addr v0, v5

    int-to-byte p1, v0

    .line 508
    iput-byte p1, p0, Ll/ܿ᩹ۢ;->ܿ֫:B

    if-nez p1, :cond_9

    if-ne v9, v2, :cond_0

    const/16 p1, 0x1f

    goto :goto_0

    :cond_0
    if-ne v9, v1, :cond_1

    const/16 p1, 0xf

    goto :goto_0

    :cond_1
    const/4 p1, 0x7

    :goto_0
    int-to-byte p1, p1

    .line 510
    aget-byte v0, v3, v7

    and-int/2addr p1, v0

    const/4 v0, 0x1

    .line 511
    :goto_1
    iget-byte v6, p0, Ll/ܿ᩹ۢ;->ܽ֫:B

    if-ge v0, v6, :cond_2

    shl-int/lit8 p1, p1, 0x6

    .line 512
    aget-byte v6, v3, v0

    and-int/lit8 v6, v6, 0x3f

    or-int/2addr p1, v6

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    const/16 v0, 0x7f

    if-gt p1, v0, :cond_3

    if-gt v6, v5, :cond_5

    :cond_3
    const/16 v0, 0x7ff

    if-ge p1, v0, :cond_4

    if-gt v6, v2, :cond_5

    :cond_4
    const v0, 0xffff

    if-ge p1, v0, :cond_6

    if-le v6, v1, :cond_6

    :cond_5
    const p1, 0xfffd

    .line 519
    :cond_6
    iput-byte v7, p0, Ll/ܿ᩹ۢ;->ܿ֫:B

    iput-byte v7, p0, Ll/ܿ᩹ۢ;->ܽ֫:B

    if-lt p1, v8, :cond_7

    const/16 v0, 0x9f

    if-gt p1, v0, :cond_7

    goto :goto_2

    .line 533
    :cond_7
    invoke-static {p1}, Ljava/lang/Character;->getType(I)I

    move-result v0

    if-eqz v0, :cond_8

    const/16 v1, 0x13

    if-eq v0, v1, :cond_8

    move v4, p1

    .line 538
    :cond_8
    invoke-virtual {p0, v4}, Ll/ܿ᩹ۢ;->֫(I)V

    :cond_9
    :goto_2
    return-void

    .line 543
    :cond_a
    iput-byte v7, p0, Ll/ܿ᩹ۢ;->ܿ֫:B

    iput-byte v7, p0, Ll/ܿ᩹ۢ;->ܽ֫:B

    .line 544
    invoke-direct {p0, v4}, Ll/ܿ᩹ۢ;->ܳ(I)V

    .line 552
    invoke-direct {p0, p1}, Ll/ܿ᩹ۢ;->֫(B)V

    return-void

    :cond_b
    and-int/lit16 v0, p1, 0x80

    if-nez v0, :cond_c

    .line 556
    invoke-virtual {p0, p1}, Ll/ܿ᩹ۢ;->֫(I)V

    return-void

    :cond_c
    and-int/lit16 v0, p1, 0xe0

    const/16 v6, 0xc0

    if-ne v0, v6, :cond_d

    .line 559
    iput-byte v5, p0, Ll/ܿ᩹ۢ;->ܿ֫:B

    goto :goto_3

    :cond_d
    and-int/lit16 v0, p1, 0xf0

    const/16 v5, 0xe0

    if-ne v0, v5, :cond_e

    .line 561
    iput-byte v2, p0, Ll/ܿ᩹ۢ;->ܿ֫:B

    goto :goto_3

    :cond_e
    and-int/lit16 v0, p1, 0xf8

    const/16 v2, 0xf0

    if-ne v0, v2, :cond_f

    .line 563
    iput-byte v1, p0, Ll/ܿ᩹ۢ;->ܿ֫:B

    .line 569
    :goto_3
    iget-byte v0, p0, Ll/ܿ᩹ۢ;->ܽ֫:B

    add-int/lit8 v1, v0, 0x1

    int-to-byte v1, v1

    iput-byte v1, p0, Ll/ܿ᩹ۢ;->ܽ֫:B

    aput-byte p1, v3, v0

    return-void

    .line 566
    :cond_f
    invoke-virtual {p0, v4}, Ll/ܿ᩹ۢ;->֫(I)V

    return-void
.end method

.method private ۖ()V
    .locals 5

    .line 1305
    iget v0, p0, Ll/ܿ᩹ۢ;->ܺ:I

    iget v1, p0, Ll/ܿ᩹ۢ;->ܳ:I

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    add-int/lit8 v4, v0, 0x1

    if-eqz v3, :cond_2

    .line 1309
    iget v1, p0, Ll/ܿ᩹ۢ;->᩹:I

    add-int/lit8 v1, v1, -0x1

    if-eq v0, v1, :cond_1

    .line 2380
    iput v4, p0, Ll/ܿ᩹ۢ;->ܺ:I

    .line 2381
    iput-boolean v2, p0, Ll/ܿ᩹ۢ;->֫:Z

    :cond_1
    return-void

    :cond_2
    if-ne v4, v1, :cond_3

    .line 1314
    invoke-direct {p0}, Ll/ܿ᩹ۢ;->ۚ()V

    .line 1315
    iget v0, p0, Ll/ܿ᩹ۢ;->ܳ:I

    add-int/lit8 v4, v0, -0x1

    .line 2380
    :cond_3
    iput v4, p0, Ll/ܿ᩹ۢ;->ܺ:I

    .line 2381
    iput-boolean v2, p0, Ll/ܿ᩹ۢ;->֫:Z

    return-void
.end method

.method private ۘ()J
    .locals 3

    .line 2077
    iget v0, p0, Ll/ܿ᩹ۢ;->᩵:I

    iget v1, p0, Ll/ܿ᩹ۢ;->ܿ:I

    iget v2, p0, Ll/ܿ᩹ۢ;->ۘ:I

    invoke-static {v0, v1, v2}, Ll/᩻᩶ۢ;->֫(III)J

    move-result-wide v0

    return-wide v0
.end method

.method private ۚ()V
    .locals 17

    move-object/from16 v0, p0

    .line 2119
    iget v1, v0, Ll/ܿ᩹ۢ;->۫:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Ll/ܿ᩹ۢ;->۫:I

    .line 2120
    iget v7, v0, Ll/ܿ᩹ۢ;->֨:I

    if-nez v7, :cond_1

    iget v1, v0, Ll/ܿ᩹ۢ;->᩸:I

    iget v2, v0, Ll/ܿ᩹ۢ;->ۜ:I

    if-eq v1, v2, :cond_0

    goto :goto_0

    .line 2126
    :cond_0
    iget-object v1, v0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    iget v2, v0, Ll/ܿ᩹ۢ;->ܰ:I

    iget v3, v0, Ll/ܿ᩹ۢ;->ܳ:I

    invoke-direct/range {p0 .. p0}, Ll/ܿ᩹ۢ;->ۘ()J

    move-result-wide v4

    invoke-virtual {v1, v2, v3, v4, v5}, Ll/֫᩹ۢ;->֫(IIJ)V

    return-void

    .line 2122
    :cond_1
    :goto_0
    iget-object v2, v0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    iget v8, v0, Ll/ܿ᩹ۢ;->ܰ:I

    add-int/lit8 v4, v8, 0x1

    iget v1, v0, Ll/ܿ᩹ۢ;->᩸:I

    sub-int v5, v1, v7

    iget v1, v0, Ll/ܿ᩹ۢ;->ܳ:I

    sub-int/2addr v1, v8

    add-int/lit8 v6, v1, -0x1

    move v3, v7

    invoke-virtual/range {v2 .. v8}, Ll/֫᩹ۢ;->֫(IIIIII)V

    .line 2124
    iget-object v9, v0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    iget v10, v0, Ll/ܿ᩹ۢ;->֨:I

    iget v1, v0, Ll/ܿ᩹ۢ;->ܳ:I

    add-int/lit8 v11, v1, -0x1

    iget v1, v0, Ll/ܿ᩹ۢ;->᩸:I

    sub-int v12, v1, v10

    iget v1, v0, Ll/ܿ᩹ۢ;->ۘ:I

    int-to-long v1, v1

    const/4 v13, 0x1

    const/16 v14, 0x20

    move-wide v15, v1

    invoke-virtual/range {v9 .. v16}, Ll/֫᩹ۢ;->֫(IIIIIJ)V

    return-void
.end method

.method public static ۜ(I)I
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_b

    const/16 v0, 0x19

    if-eq p0, v0, :cond_a

    const/16 v0, 0x42

    if-eq p0, v0, :cond_9

    const/16 v0, 0x45

    if-eq p0, v0, :cond_8

    const/16 v0, 0x3e8

    if-eq p0, v0, :cond_7

    const/16 v0, 0x3ea

    if-eq p0, v0, :cond_6

    const/16 v0, 0x3ec

    if-eq p0, v0, :cond_5

    const/16 v0, 0x3ee

    if-eq p0, v0, :cond_4

    const/16 v0, 0x7d4

    if-eq p0, v0, :cond_3

    const/4 v0, 0x5

    if-eq p0, v0, :cond_2

    const/4 v0, 0x6

    if-eq p0, v0, :cond_1

    const/4 v0, 0x7

    if-eq p0, v0, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    const/16 p0, 0x8

    return p0

    :cond_1
    const/4 p0, 0x4

    return p0

    :cond_2
    const/4 p0, 0x2

    return p0

    :cond_3
    const/16 p0, 0x400

    return p0

    :cond_4
    const/16 p0, 0x200

    return p0

    :cond_5
    const/16 p0, 0x100

    return p0

    :cond_6
    const/16 p0, 0x80

    return p0

    :cond_7
    const/16 p0, 0x40

    return p0

    :cond_8
    const/16 p0, 0x800

    return p0

    :cond_9
    const/16 p0, 0x20

    return p0

    :cond_a
    const/16 p0, 0x10

    return p0

    :cond_b
    return v0
.end method

.method private ۡ(I)V
    .locals 0

    .line 2385
    iput p1, p0, Ll/ܿ᩹ۢ;->ۡ:I

    const/4 p1, 0x0

    .line 2386
    iput-boolean p1, p0, Ll/ܿ᩹ۢ;->֫:Z

    return-void
.end method

.method private ۢ(I)V
    .locals 4

    .line 2134
    iget-object v0, p0, Ll/ܿ᩹ۢ;->ᩳ:[I

    const/16 v1, 0x30

    if-lt p1, v1, :cond_2

    const/16 v2, 0x39

    if-gt p1, v2, :cond_2

    .line 2135
    iget v2, p0, Ll/ܿ᩹ۢ;->ܽ:I

    array-length v3, v0

    if-ge v2, v3, :cond_1

    .line 2136
    aget v3, v0, v2

    sub-int/2addr p1, v1

    if-ltz v3, :cond_0

    mul-int/lit8 v3, v3, 0xa

    add-int/2addr p1, v3

    .line 2144
    :cond_0
    aput p1, v0, v2

    .line 2146
    :cond_1
    iget p1, p0, Ll/ܿ᩹ۢ;->ᩴ:I

    invoke-direct {p0, p1}, Ll/ܿ᩹ۢ;->ܽ(I)V

    return-void

    :cond_2
    const/16 v1, 0x3b

    if-ne p1, v1, :cond_4

    .line 2148
    iget p1, p0, Ll/ܿ᩹ۢ;->ܽ:I

    array-length v0, v0

    if-ge p1, v0, :cond_3

    add-int/lit8 p1, p1, 0x1

    .line 2149
    iput p1, p0, Ll/ܿ᩹ۢ;->ܽ:I

    .line 2151
    :cond_3
    iget p1, p0, Ll/ܿ᩹ۢ;->ᩴ:I

    invoke-direct {p0, p1}, Ll/ܿ᩹ۢ;->ܽ(I)V

    return-void

    :cond_4
    const/4 p1, 0x0

    .line 2228
    iput p1, p0, Ll/ܿ᩹ۢ;->ᩴ:I

    return-void
.end method

.method private ۧ(I)V
    .locals 3

    .line 2174
    iget-object v0, p0, Ll/ܿ᩹ۢ;->ܶ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    const/16 v2, 0x2000

    if-ge v1, v2, :cond_0

    .line 2175
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 2176
    iget p1, p0, Ll/ܿ᩹ۢ;->ᩴ:I

    invoke-direct {p0, p1}, Ll/ܿ᩹ۢ;->ܽ(I)V

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 2228
    iput p1, p0, Ll/ܿ᩹ۢ;->ᩴ:I

    return-void
.end method

.method private ۧ(II)V
    .locals 4

    const/4 v0, 0x4

    .line 2108
    invoke-direct {p0, v0}, Ll/ܿ᩹ۢ;->᩻(I)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2109
    iget v2, p0, Ll/ܿ᩹ۢ;->ܰ:I

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 2110
    iget v3, p0, Ll/ܿ᩹ۢ;->ܳ:I

    goto :goto_1

    :cond_1
    iget v3, p0, Ll/ܿ᩹ۢ;->᩹:I

    :goto_1
    if-eqz v0, :cond_2

    .line 2111
    iget v1, p0, Ll/ܿ᩹ۢ;->֨:I

    :cond_2
    if-eqz v0, :cond_3

    .line 2112
    iget v0, p0, Ll/ܿ᩹ۢ;->᩸:I

    goto :goto_2

    :cond_3
    iget v0, p0, Ll/ܿ᩹ۢ;->ۜ:I

    :goto_2
    add-int/2addr p2, v2

    add-int/lit8 v3, v3, -0x1

    .line 2113
    invoke-static {p2, v3}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-static {v2, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    add-int/2addr p1, v1

    add-int/lit8 v0, v0, -0x1

    .line 2114
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 2115
    invoke-direct {p0, p2, p1}, Ll/ܿ᩹ۢ;->ܽ(II)V

    return-void
.end method

.method private ۧ(IIII)V
    .locals 8

    .line 2073
    iget-object v0, p0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    const/16 v5, 0x20

    invoke-direct {p0}, Ll/ܿ᩹ۢ;->ۘ()J

    move-result-wide v6

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-virtual/range {v0 .. v7}, Ll/֫᩹ۢ;->֫(IIIIIJ)V

    return-void
.end method

.method private ۧ(IZ)V
    .locals 3

    if-eqz p2, :cond_1

    const/4 v0, 0x0

    const/16 v1, 0x80

    const/16 v2, 0x40

    if-ne p1, v2, :cond_0

    .line 328
    invoke-direct {p0, v1, v0}, Ll/ܿ᩹ۢ;->ۧ(IZ)V

    goto :goto_0

    :cond_0
    if-ne p1, v1, :cond_1

    .line 330
    invoke-direct {p0, v2, v0}, Ll/ܿ᩹ۢ;->ۧ(IZ)V

    :cond_1
    :goto_0
    if-eqz p2, :cond_2

    .line 334
    iget p2, p0, Ll/ܿ᩹ۢ;->ۢ:I

    or-int/2addr p1, p2

    iput p1, p0, Ll/ܿ᩹ۢ;->ۢ:I

    return-void

    .line 336
    :cond_2
    iget p2, p0, Ll/ܿ᩹ۢ;->ۢ:I

    not-int p1, p1

    and-int/2addr p1, p2

    iput p1, p0, Ll/ܿ᩹ۢ;->ۢ:I

    return-void
.end method

.method private ۧ(Ljava/lang/String;)V
    .locals 18

    move-object/from16 v0, p0

    const-string v1, "/"

    const-string v2, "%04x"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, -0x1

    .line 1928
    :goto_0
    iget-object v6, v0, Ll/ܿ᩹ۢ;->ܶ:Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->length()I

    move-result v7

    const/16 v8, 0x39

    const/16 v9, 0x30

    const/16 v10, 0x3b

    const/4 v11, 0x1

    if-ge v4, v7, :cond_3

    .line 1929
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v7

    if-ne v7, v10, :cond_0

    add-int/2addr v4, v11

    .line 1931
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->substring(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :cond_0
    if-lt v7, v9, :cond_2

    if-gt v7, v8, :cond_2

    if-gez v5, :cond_1

    const/4 v5, 0x0

    goto :goto_1

    :cond_1
    mul-int/lit8 v5, v5, 0xa

    :goto_1
    add-int/lit8 v7, v7, -0x30

    add-int/2addr v5, v7

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 2228
    :cond_2
    iput v3, v0, Ll/ܿ᩹ۢ;->ᩴ:I

    return-void

    :cond_3
    const-string v4, ""

    .line 1941
    :goto_2
    iget-object v6, v0, Ll/ܿ᩹ۢ;->ۤ:Ll/ۖ᩹ۢ;

    if-eqz v5, :cond_1b

    if-eq v5, v11, :cond_1b

    const/4 v7, 0x2

    if-eq v5, v7, :cond_1b

    const/4 v7, 0x4

    const/16 v11, 0xff

    iget-object v12, v0, Ll/ܿ᩹ۢ;->᩻:Ll/ܽ᩹ۢ;

    if-eq v5, v7, :cond_10

    const/16 v7, 0x34

    if-eq v5, v7, :cond_f

    const/16 v7, 0x68

    if-eq v5, v7, :cond_9

    const/16 v7, 0x77

    if-eq v5, v7, :cond_1c

    packed-switch v5, :pswitch_data_0

    packed-switch v5, :pswitch_data_1

    .line 2228
    iput v3, v0, Ll/ܿ᩹ۢ;->ᩴ:I

    goto/16 :goto_f

    :pswitch_0
    add-int/lit16 v3, v5, 0xf6

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 1991
    :goto_3
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v9

    if-ne v7, v9, :cond_4

    const/4 v9, 0x1

    goto :goto_4

    :cond_4
    const/4 v9, 0x0

    :goto_4
    if-nez v9, :cond_5

    .line 1992
    invoke-virtual {v4, v7}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-ne v13, v10, :cond_6

    .line 1994
    :cond_5
    :try_start_0
    invoke-virtual {v4, v8, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    const-string v14, "?"

    .line 1995
    invoke-virtual {v14, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_7

    .line 1997
    iget-object v10, v12, Ll/ܽ᩹ۢ;->֫:[I

    aget v10, v10, v3

    const/high16 v14, 0xff0000

    and-int/2addr v14, v10

    shr-int/lit8 v14, v14, 0x10

    const v15, 0xffff

    mul-int v14, v14, v15

    .line 1998
    div-int/2addr v14, v11

    const v16, 0xff00

    and-int v16, v10, v16

    shr-int/lit8 v16, v16, 0x8

    mul-int v16, v16, v15

    .line 1999
    div-int v16, v16, v11

    and-int/lit16 v10, v10, 0xff

    mul-int v10, v10, v15

    .line 2000
    div-int/2addr v10, v11

    .line 2001
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "\u001b]"

    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v15, ";rgb:"

    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v15, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const/4 v13, 0x1

    new-array v13, v13, [Ljava/lang/Object;

    const/16 v17, 0x0

    aput-object v14, v13, v17

    invoke-static {v15, v2, v13}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/4 v14, 0x1

    new-array v14, v14, [Ljava/lang/Object;

    const/16 v16, 0x0

    aput-object v13, v14, v16

    invoke-static {v15, v2, v14}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2002
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/4 v13, 0x1

    new-array v13, v13, [Ljava/lang/Object;

    const/4 v14, 0x0

    aput-object v10, v13, v14

    invoke-static {v15, v2, v13}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v13, p1

    :try_start_1
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 2001
    invoke-virtual {v6, v10}, Ll/ۖ᩹ۢ;->ۧ(Ljava/lang/String;)V

    goto :goto_5

    :catch_0
    :cond_6
    move-object/from16 v13, p1

    goto :goto_6

    :cond_7
    move-object/from16 v13, p1

    .line 2004
    invoke-virtual {v12, v3, v10}, Ll/ܽ᩹ۢ;->֫(ILjava/lang/String;)V

    .line 2005
    invoke-virtual {v6}, Ll/ۖ᩹ۢ;->ᩳ()V

    :goto_5
    add-int/lit8 v3, v3, 0x1

    if-nez v9, :cond_1c

    const/16 v9, 0x102

    if-gt v3, v9, :cond_1c

    add-int/lit8 v7, v7, 0x1

    .line 2008
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v8
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    if-lt v7, v8, :cond_8

    goto/16 :goto_f

    :cond_8
    move v8, v7

    :catch_1
    :goto_6
    add-int/lit8 v7, v7, 0x1

    const/16 v10, 0x3b

    const/16 v11, 0xff

    goto/16 :goto_3

    :pswitch_1
    add-int/lit16 v5, v5, 0x92

    .line 30
    iget-object v1, v12, Ll/ܽ᩹ۢ;->֫:[I

    sget-object v2, Ll/ܽ᩹ۢ;->ۧ:Ll/ۧ᩹ۢ;

    iget-object v2, v2, Ll/ۧ᩹ۢ;->֫:[I

    aget v2, v2, v5

    aput v2, v1, v5

    .line 2057
    invoke-virtual {v6}, Ll/ۖ᩹ۢ;->ᩳ()V

    goto/16 :goto_f

    .line 2031
    :cond_9
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_a

    .line 2032
    invoke-virtual {v12}, Ll/ܽ᩹ۢ;->֫()V

    .line 2033
    invoke-virtual {v6}, Ll/ۖ᩹ۢ;->ᩳ()V

    goto/16 :goto_f

    :cond_a
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 2037
    :goto_7
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v3

    if-ne v1, v3, :cond_b

    const/4 v3, 0x1

    goto :goto_8

    :cond_b
    const/4 v3, 0x0

    :goto_8
    if-nez v3, :cond_c

    .line 2038
    invoke-virtual {v4, v1}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v7, 0x3b

    if-ne v5, v7, :cond_e

    .line 2040
    :cond_c
    :try_start_2
    invoke-virtual {v4, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 30
    iget-object v7, v12, Ll/ܽ᩹ۢ;->֫:[I

    sget-object v8, Ll/ܽ᩹ۢ;->ۧ:Ll/ۧ᩹ۢ;

    iget-object v8, v8, Ll/ۧ᩹ۢ;->֫:[I

    aget v8, v8, v5

    aput v8, v7, v5

    .line 2042
    invoke-virtual {v6}, Ll/ۖ᩹ۢ;->ᩳ()V
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    if-eqz v3, :cond_d

    goto/16 :goto_f

    :cond_d
    add-int/lit8 v1, v1, 0x1

    move v2, v1

    :catch_2
    :cond_e
    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_f
    const-string v1, ";"

    .line 2018
    invoke-virtual {v4, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    .line 2020
    :try_start_3
    new-instance v2, Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    invoke-static {v1, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v1

    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v2, v1, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 2021
    invoke-virtual {v6, v2}, Ll/ۖ᩹ۢ;->֫(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto/16 :goto_f

    :cond_10
    const/4 v1, 0x0

    const/4 v2, -0x1

    const/4 v3, -0x1

    .line 1958
    :goto_9
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-ne v1, v5, :cond_11

    const/4 v5, 0x1

    goto :goto_a

    :cond_11
    const/4 v5, 0x0

    :goto_a
    if-eqz v5, :cond_12

    const/16 v7, 0x3b

    goto :goto_b

    .line 1959
    :cond_12
    invoke-virtual {v4, v1}, Ljava/lang/String;->charAt(I)C

    move-result v7

    :goto_b
    const/16 v10, 0x3b

    if-ne v7, v10, :cond_16

    if-gez v2, :cond_13

    add-int/lit8 v2, v1, 0x1

    goto :goto_e

    :cond_13
    if-ltz v3, :cond_15

    const/16 v7, 0xff

    if-le v3, v7, :cond_14

    goto :goto_c

    .line 1968
    :cond_14
    invoke-virtual {v4, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v12, v3, v2}, Ll/ܽ᩹ۢ;->֫(ILjava/lang/String;)V

    .line 1969
    invoke-virtual {v6}, Ll/ۖ᩹ۢ;->ᩳ()V

    const/4 v2, -0x1

    const/4 v3, -0x1

    goto :goto_e

    :cond_15
    :goto_c
    const/4 v1, 0x0

    .line 2228
    iput v1, v0, Ll/ܿ᩹ۢ;->ᩴ:I

    return-void

    :cond_16
    if-ltz v2, :cond_17

    goto :goto_e

    :cond_17
    if-gez v2, :cond_1a

    if-lt v7, v9, :cond_1a

    if-gt v7, v8, :cond_1a

    if-gez v3, :cond_18

    const/4 v3, 0x0

    goto :goto_d

    :cond_18
    mul-int/lit8 v3, v3, 0xa

    :goto_d
    add-int/lit8 v7, v7, -0x30

    add-int/2addr v3, v7

    :goto_e
    if-eqz v5, :cond_19

    goto :goto_f

    :cond_19
    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    :cond_1a
    const/4 v1, 0x0

    iput v1, v0, Ll/ܿ᩹ۢ;->ᩴ:I

    return-void

    .line 2468
    :cond_1b
    iget-object v1, v0, Ll/ܿ᩹ۢ;->ۨ:Ljava/lang/String;

    .line 2469
    iput-object v4, v0, Ll/ܿ᩹ۢ;->ۨ:Ljava/lang/String;

    .line 50
    invoke-static {v1, v4}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    .line 2471
    invoke-virtual {v6}, Ll/ۖ᩹ۢ;->ܿ()V

    :catch_3
    :cond_1c
    :goto_f
    const/4 v1, 0x0

    .line 2228
    iput v1, v0, Ll/ܿ᩹ۢ;->ᩴ:I

    return-void

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x6e
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private ܳ(I)V
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p1

    .line 2237
    iput v1, v0, Ll/ܿ᩹ۢ;->ۚ:I

    .line 2238
    iget-boolean v2, v0, Ll/ܿ᩹ۢ;->ۧ֫:Z

    if-eqz v2, :cond_0

    iget-boolean v2, v0, Ll/ܿ᩹ۢ;->۟:Z

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_0
    iget-boolean v2, v0, Ll/ܿ᩹ۢ;->֫֫:Z

    if-eqz v2, :cond_2

    :goto_0
    const/16 v2, 0x30

    if-eq v1, v2, :cond_1

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_1

    :pswitch_0
    const/16 v1, 0xb7

    const/16 v5, 0xb7

    goto/16 :goto_2

    :pswitch_1
    const/16 v1, 0xa3

    const/16 v5, 0xa3

    goto/16 :goto_2

    :pswitch_2
    const/16 v1, 0x2260

    const/16 v5, 0x2260

    goto/16 :goto_2

    :pswitch_3
    const/16 v1, 0x3c0

    const/16 v5, 0x3c0

    goto/16 :goto_2

    :pswitch_4
    const/16 v1, 0x2265

    const/16 v5, 0x2265

    goto/16 :goto_2

    :pswitch_5
    const/16 v1, 0x2264

    const/16 v5, 0x2264

    goto/16 :goto_2

    :pswitch_6
    const/16 v1, 0x2502

    const/16 v5, 0x2502

    goto/16 :goto_2

    :pswitch_7
    const/16 v1, 0x252c

    const/16 v5, 0x252c

    goto/16 :goto_2

    :pswitch_8
    const/16 v1, 0x2534

    const/16 v5, 0x2534

    goto/16 :goto_2

    :pswitch_9
    const/16 v1, 0x2524

    const/16 v5, 0x2524

    goto/16 :goto_2

    :pswitch_a
    const/16 v1, 0x251c

    const/16 v5, 0x251c

    goto/16 :goto_2

    :pswitch_b
    const/16 v1, 0x23bd

    const/16 v5, 0x23bd

    goto/16 :goto_2

    :pswitch_c
    const/16 v1, 0x23bc

    const/16 v5, 0x23bc

    goto/16 :goto_2

    :pswitch_d
    const/16 v1, 0x2500

    const/16 v5, 0x2500

    goto/16 :goto_2

    :pswitch_e
    const/16 v1, 0x23bb

    const/16 v5, 0x23bb

    goto/16 :goto_2

    :pswitch_f
    const/16 v1, 0x23ba

    const/16 v5, 0x23ba

    goto :goto_2

    :pswitch_10
    const/16 v1, 0x253c

    const/16 v5, 0x253c

    goto :goto_2

    :pswitch_11
    const/16 v1, 0x2514

    const/16 v5, 0x2514

    goto :goto_2

    :pswitch_12
    const/16 v1, 0x250c

    const/16 v5, 0x250c

    goto :goto_2

    :pswitch_13
    const/16 v1, 0x2510

    const/16 v5, 0x2510

    goto :goto_2

    :pswitch_14
    const/16 v1, 0x2518

    const/16 v5, 0x2518

    goto :goto_2

    :pswitch_15
    const/16 v1, 0x240b

    const/16 v5, 0x240b

    goto :goto_2

    :pswitch_16
    const/16 v1, 0xa

    const/16 v5, 0xa

    goto :goto_2

    :pswitch_17
    const/16 v1, 0xb1

    const/16 v5, 0xb1

    goto :goto_2

    :pswitch_18
    const/16 v1, 0xb0

    const/16 v5, 0xb0

    goto :goto_2

    :pswitch_19
    const/16 v1, 0x240a

    const/16 v5, 0x240a

    goto :goto_2

    :pswitch_1a
    const/16 v1, 0xd

    const/16 v5, 0xd

    goto :goto_2

    :pswitch_1b
    const/16 v1, 0x240c

    const/16 v5, 0x240c

    goto :goto_2

    :pswitch_1c
    const/16 v1, 0x2409

    const/16 v5, 0x2409

    goto :goto_2

    :pswitch_1d
    const/16 v1, 0x2592

    const/16 v5, 0x2592

    goto :goto_2

    :pswitch_1e
    const/16 v1, 0x25c6

    const/16 v5, 0x25c6

    goto :goto_2

    :pswitch_1f
    const/16 v1, 0x20

    const/16 v5, 0x20

    goto :goto_2

    :cond_1
    const/16 v1, 0x2588

    const/16 v5, 0x2588

    goto :goto_2

    :cond_2
    :goto_1
    move v5, v1

    :goto_2
    const/16 v1, 0x8

    .line 2343
    invoke-direct {v0, v1}, Ll/ܿ᩹ۢ;->᩻(I)Z

    move-result v1

    .line 2344
    invoke-static {v5}, Ll/ۜ᩶ۢ;->֫(I)I

    move-result v8

    .line 2345
    iget v2, v0, Ll/ܿ᩹ۢ;->ۡ:I

    iget v3, v0, Ll/ܿ᩹ۢ;->᩸:I

    const/4 v9, 0x1

    sub-int/2addr v3, v9

    const/4 v10, 0x0

    if-ne v2, v3, :cond_3

    const/4 v2, 0x1

    goto :goto_3

    :cond_3
    const/4 v2, 0x0

    :goto_3
    const/4 v3, 0x2

    if-eqz v1, :cond_7

    if-eqz v2, :cond_8

    .line 2348
    iget-boolean v2, v0, Ll/ܿ᩹ۢ;->֫:Z

    if-eqz v2, :cond_4

    if-eq v8, v9, :cond_5

    :cond_4
    if-ne v8, v3, :cond_8

    .line 2349
    :cond_5
    iget-object v2, v0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    iget v3, v0, Ll/ܿ᩹ۢ;->ܺ:I

    .line 131
    iget-object v4, v2, Ll/֫᩹ۢ;->ܽ:[Ll/ᩴ᩹ۢ;

    invoke-virtual {v2, v3}, Ll/֫᩹ۢ;->ۧ(I)I

    move-result v2

    aget-object v2, v4, v2

    iput-boolean v9, v2, Ll/ᩴ᩹ۢ;->ܽ:Z

    .line 2350
    iget v2, v0, Ll/ܿ᩹ۢ;->֨:I

    iput v2, v0, Ll/ܿ᩹ۢ;->ۡ:I

    .line 2351
    iget v2, v0, Ll/ܿ᩹ۢ;->ܺ:I

    add-int/2addr v2, v9

    iget v3, v0, Ll/ܿ᩹ۢ;->ܳ:I

    if-ge v2, v3, :cond_6

    .line 2352
    iput v2, v0, Ll/ܿ᩹ۢ;->ܺ:I

    goto :goto_4

    .line 2354
    :cond_6
    invoke-direct/range {p0 .. p0}, Ll/ܿ᩹ۢ;->ۚ()V

    goto :goto_4

    :cond_7
    if-eqz v2, :cond_8

    if-ne v8, v3, :cond_8

    return-void

    .line 2363
    :cond_8
    :goto_4
    iget-boolean v2, v0, Ll/ܿ᩹ۢ;->֡:Z

    if-eqz v2, :cond_9

    if-lez v8, :cond_9

    .line 2365
    iget v12, v0, Ll/ܿ᩹ۢ;->ۡ:I

    add-int v2, v12, v8

    .line 2366
    iget v3, v0, Ll/ܿ᩹ۢ;->᩸:I

    if-ge v2, v3, :cond_9

    .line 2367
    iget-object v11, v0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    iget v4, v0, Ll/ܿ᩹ۢ;->ܺ:I

    sub-int v14, v3, v2

    const/4 v15, 0x1

    move v13, v4

    move/from16 v16, v2

    move/from16 v17, v4

    invoke-virtual/range {v11 .. v17}, Ll/֫᩹ۢ;->֫(IIIIII)V

    :cond_9
    if-gtz v8, :cond_a

    .line 2370
    iget v2, v0, Ll/ܿ᩹ۢ;->ۡ:I

    if-lez v2, :cond_a

    iget-boolean v2, v0, Ll/ܿ᩹ۢ;->֫:Z

    if-nez v2, :cond_a

    const/4 v2, 0x1

    goto :goto_5

    :cond_a
    const/4 v2, 0x0

    .line 2371
    :goto_5
    iget-object v3, v0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    iget v4, v0, Ll/ܿ᩹ۢ;->ۡ:I

    sub-int/2addr v4, v2

    iget v6, v0, Ll/ܿ᩹ۢ;->ܺ:I

    invoke-direct/range {p0 .. p0}, Ll/ܿ᩹ۢ;->ۘ()J

    move-result-wide v11

    move-object v2, v3

    move v3, v4

    move v4, v6

    move-wide v6, v11

    invoke-virtual/range {v2 .. v7}, Ll/֫᩹ۢ;->֫(IIIJ)V

    if-eqz v1, :cond_c

    if-lez v8, :cond_c

    .line 2374
    iget v1, v0, Ll/ܿ᩹ۢ;->ۡ:I

    iget v2, v0, Ll/ܿ᩹ۢ;->᩸:I

    sub-int/2addr v2, v8

    if-ne v1, v2, :cond_b

    const/4 v10, 0x1

    :cond_b
    iput-boolean v10, v0, Ll/ܿ᩹ۢ;->֫:Z

    .line 2376
    :cond_c
    iget v1, v0, Ll/ܿ᩹ۢ;->ۡ:I

    add-int/2addr v1, v8

    iget v2, v0, Ll/ܿ᩹ۢ;->᩸:I

    sub-int/2addr v2, v9

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    iput v1, v0, Ll/ܿ᩹ۢ;->ۡ:I

    return-void

    :pswitch_data_0
    .packed-switch 0x5f
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private ܽ(I)V
    .locals 0

    .line 1322
    iput p1, p0, Ll/ܿ᩹ۢ;->ᩴ:I

    const/4 p1, 0x1

    .line 1323
    iput-boolean p1, p0, Ll/ܿ᩹ۢ;->᩷:Z

    return-void
.end method

.method private ܽ(II)V
    .locals 1

    .line 2400
    iget v0, p0, Ll/ܿ᩹ۢ;->᩹:I

    add-int/lit8 v0, v0, -0x1

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Ll/ܿ᩹ۢ;->ܺ:I

    .line 2401
    iget p1, p0, Ll/ܿ᩹ۢ;->ۜ:I

    add-int/lit8 p1, p1, -0x1

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Ll/ܿ᩹ۢ;->ۡ:I

    .line 2402
    iput-boolean v0, p0, Ll/ܿ᩹ۢ;->֫:Z

    return-void
.end method

.method private ܿ(I)V
    .locals 1

    const/4 v0, 0x7

    if-eq p1, v0, :cond_1

    const/16 v0, 0x1b

    if-eq p1, v0, :cond_0

    .line 1901
    invoke-direct {p0, p1}, Ll/ܿ᩹ۢ;->ۧ(I)V

    return-void

    :cond_0
    const/16 p1, 0xb

    .line 1898
    invoke-direct {p0, p1}, Ll/ܿ᩹ۢ;->ܽ(I)V

    return-void

    :cond_1
    const-string p1, "\u0007"

    .line 1895
    invoke-direct {p0, p1}, Ll/ܿ᩹ۢ;->ۧ(Ljava/lang/String;)V

    return-void
.end method

.method private ᩳ(I)V
    .locals 14

    const/16 v0, 0x24

    const/16 v1, 0x8

    if-eq p1, v0, :cond_44

    const/16 v0, 0x27

    if-eq p1, v0, :cond_43

    const/16 v0, 0x2a

    if-eq p1, v0, :cond_42

    const/16 v0, 0x50

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq p1, v0, :cond_41

    const/16 v0, 0x58

    if-eq p1, v0, :cond_40

    const/16 v0, 0x5a

    if-eq p1, v0, :cond_3d

    const/16 v0, 0x53

    if-eq p1, v0, :cond_3b

    const/16 v0, 0x54

    if-eq p1, v0, :cond_39

    packed-switch p1, :pswitch_data_0

    const/4 v0, 0x7

    const/4 v4, 0x2

    packed-switch p1, :pswitch_data_1

    const/16 v5, 0x14

    const/4 v6, 0x3

    const/4 v7, 0x4

    .line 1465
    iget-object v8, p0, Ll/ܿ᩹ۢ;->ۤ:Ll/ۖ᩹ۢ;

    packed-switch p1, :pswitch_data_2

    const/4 v9, 0x5

    const/16 v10, 0xb

    const-string v11, ";"

    packed-switch p1, :pswitch_data_3

    packed-switch p1, :pswitch_data_4

    .line 1775
    invoke-direct {p0, p1}, Ll/ܿ᩹ۢ;->ۢ(I)V

    return-void

    :pswitch_0
    const/16 p1, 0x11

    .line 1470
    invoke-direct {p0, p1}, Ll/ܿ᩹ۢ;->ܽ(I)V

    return-void

    :pswitch_1
    const/16 p1, 0x13

    .line 1467
    invoke-direct {p0, p1}, Ll/ܿ᩹ۢ;->ܽ(I)V

    return-void

    :pswitch_2
    const/16 p1, 0xf

    .line 1772
    invoke-direct {p0, p1}, Ll/ܿ᩹ۢ;->ܽ(I)V

    return-void

    .line 1569
    :pswitch_3
    iput-boolean v2, p0, Ll/ܿ᩹ۢ;->֫:Z

    .line 1570
    iget p1, p0, Ll/ܿ᩹ۢ;->ܳ:I

    iget v0, p0, Ll/ܿ᩹ۢ;->ܺ:I

    sub-int/2addr p1, v0

    .line 2158
    invoke-direct {p0, v2, v3, v3}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v0

    .line 1571
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int/2addr p1, v0

    .line 1573
    iget-object v3, p0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    iget v9, p0, Ll/ܿ᩹ۢ;->ܺ:I

    add-int v5, v9, v0

    iget v6, p0, Ll/ܿ᩹ۢ;->ۜ:I

    const/4 v8, 0x0

    const/4 v4, 0x0

    move v7, p1

    invoke-virtual/range {v3 .. v9}, Ll/֫᩹ۢ;->֫(IIIIII)V

    .line 1574
    iget v1, p0, Ll/ܿ᩹ۢ;->ܺ:I

    add-int/2addr v1, p1

    iget p1, p0, Ll/ܿ᩹ۢ;->ۜ:I

    invoke-direct {p0, v2, v1, p1, v0}, Ll/ܿ᩹ۢ;->ۧ(IIII)V

    return-void

    .line 1560
    :pswitch_4
    iget p1, p0, Ll/ܿ᩹ۢ;->ܳ:I

    iget v0, p0, Ll/ܿ᩹ۢ;->ܺ:I

    sub-int/2addr p1, v0

    .line 2158
    invoke-direct {p0, v2, v3, v3}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v0

    .line 1561
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int v7, p1, v0

    .line 1563
    iget-object v3, p0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    iget v5, p0, Ll/ܿ᩹ۢ;->ܺ:I

    iget v6, p0, Ll/ܿ᩹ۢ;->ۜ:I

    const/4 v8, 0x0

    add-int v9, v5, v0

    const/4 v4, 0x0

    invoke-virtual/range {v3 .. v9}, Ll/֫᩹ۢ;->֫(IIIIII)V

    .line 1564
    iget p1, p0, Ll/ܿ᩹ۢ;->ܺ:I

    iget v1, p0, Ll/ܿ᩹ۢ;->ۜ:I

    invoke-direct {p0, v2, p1, v1, v0}, Ll/ܿ᩹ۢ;->ۧ(IIII)V

    return-void

    .line 2158
    :pswitch_5
    invoke-direct {p0, v2, v2, v3}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result p1

    if-eqz p1, :cond_2

    if-eq p1, v3, :cond_1

    if-eq p1, v4, :cond_0

    .line 2228
    iput v2, p0, Ll/ܿ᩹ۢ;->ᩴ:I

    return-void

    .line 1550
    :cond_0
    iget p1, p0, Ll/ܿ᩹ۢ;->ܺ:I

    iget v0, p0, Ll/ܿ᩹ۢ;->ۜ:I

    goto :goto_0

    .line 1547
    :cond_1
    iget p1, p0, Ll/ܿ᩹ۢ;->ܺ:I

    iget v0, p0, Ll/ܿ᩹ۢ;->ۡ:I

    add-int/2addr v0, v3

    .line 2069
    :goto_0
    invoke-direct {p0, v2, p1, v0, v3}, Ll/ܿ᩹ۢ;->ۧ(IIII)V

    goto :goto_1

    .line 1544
    :cond_2
    iget p1, p0, Ll/ܿ᩹ۢ;->ۡ:I

    iget v0, p0, Ll/ܿ᩹ۢ;->ܺ:I

    iget v1, p0, Ll/ܿ᩹ۢ;->ۜ:I

    sub-int/2addr v1, p1

    .line 2069
    invoke-direct {p0, p1, v0, v1, v3}, Ll/ܿ᩹ۢ;->ۧ(IIII)V

    .line 1556
    :goto_1
    iput-boolean v2, p0, Ll/ܿ᩹ۢ;->֫:Z

    return-void

    .line 2158
    :pswitch_6
    invoke-direct {p0, v2, v2, v3}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result p1

    if-eqz p1, :cond_5

    if-eq p1, v3, :cond_4

    if-eq p1, v4, :cond_3

    .line 2228
    iput v2, p0, Ll/ܿ᩹ۢ;->ᩴ:I

    return-void

    .line 1533
    :cond_3
    iget p1, p0, Ll/ܿ᩹ۢ;->ۜ:I

    iget v0, p0, Ll/ܿ᩹ۢ;->᩹:I

    invoke-direct {p0, v2, v2, p1, v0}, Ll/ܿ᩹ۢ;->ۧ(IIII)V

    goto :goto_2

    .line 1528
    :cond_4
    iget p1, p0, Ll/ܿ᩹ۢ;->ۜ:I

    iget v0, p0, Ll/ܿ᩹ۢ;->ܺ:I

    invoke-direct {p0, v2, v2, p1, v0}, Ll/ܿ᩹ۢ;->ۧ(IIII)V

    .line 1529
    iget p1, p0, Ll/ܿ᩹ۢ;->ܺ:I

    iget v0, p0, Ll/ܿ᩹ۢ;->ۡ:I

    add-int/2addr v0, v3

    .line 2069
    invoke-direct {p0, v2, p1, v0, v3}, Ll/ܿ᩹ۢ;->ۧ(IIII)V

    goto :goto_2

    .line 1524
    :cond_5
    iget p1, p0, Ll/ܿ᩹ۢ;->ۡ:I

    iget v0, p0, Ll/ܿ᩹ۢ;->ܺ:I

    iget v1, p0, Ll/ܿ᩹ۢ;->ۜ:I

    sub-int/2addr v1, p1

    .line 2069
    invoke-direct {p0, p1, v0, v1, v3}, Ll/ܿ᩹ۢ;->ۧ(IIII)V

    .line 1525
    iget p1, p0, Ll/ܿ᩹ۢ;->ܺ:I

    add-int/2addr p1, v3

    iget v0, p0, Ll/ܿ᩹ۢ;->ۜ:I

    iget v1, p0, Ll/ܿ᩹ۢ;->᩹:I

    sub-int/2addr v1, p1

    invoke-direct {p0, v2, p1, v0, v1}, Ll/ܿ᩹ۢ;->ۧ(IIII)V

    .line 1539
    :goto_2
    iput-boolean v2, p0, Ll/ܿ᩹ۢ;->֫:Z

    return-void

    .line 2158
    :pswitch_7
    invoke-direct {p0, v2, v3, v3}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result p1

    .line 1518
    invoke-direct {p0, p1}, Ll/ܿ᩹ۢ;->᩷(I)I

    move-result p1

    invoke-direct {p0, p1}, Ll/ܿ᩹ۢ;->ۡ(I)V

    return-void

    .line 2158
    :pswitch_8
    invoke-direct {p0, v2, v3, v3}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result p1

    .line 1511
    invoke-static {v3, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iget v0, p0, Ll/ܿ᩹ۢ;->ۜ:I

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    sub-int/2addr p1, v3

    invoke-direct {p0, p1}, Ll/ܿ᩹ۢ;->ۡ(I)V

    return-void

    .line 1508
    :pswitch_9
    iget p1, p0, Ll/ܿ᩹ۢ;->ܺ:I

    .line 2158
    invoke-direct {p0, v2, v3, v3}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v0

    sub-int/2addr p1, v0

    .line 1508
    invoke-direct {p0, v2, p1}, Ll/ܿ᩹ۢ;->ۧ(II)V

    return-void

    .line 1505
    :pswitch_a
    iget p1, p0, Ll/ܿ᩹ۢ;->ܺ:I

    .line 2158
    invoke-direct {p0, v2, v3, v3}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v0

    add-int/2addr p1, v0

    .line 1505
    invoke-direct {p0, v2, p1}, Ll/ܿ᩹ۢ;->ۧ(II)V

    return-void

    .line 1502
    :pswitch_b
    iget p1, p0, Ll/ܿ᩹ۢ;->֨:I

    iget v0, p0, Ll/ܿ᩹ۢ;->ۡ:I

    .line 2158
    invoke-direct {p0, v2, v3, v3}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v1

    sub-int/2addr v0, v1

    .line 1502
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-direct {p0, p1}, Ll/ܿ᩹ۢ;->ۡ(I)V

    return-void

    .line 1495
    :pswitch_c
    iget p1, p0, Ll/ܿ᩹ۢ;->ܳ:I

    sub-int/2addr p1, v3

    iget v0, p0, Ll/ܿ᩹ۢ;->ܺ:I

    .line 2158
    invoke-direct {p0, v2, v3, v3}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v1

    add-int/2addr v0, v1

    .line 1495
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 2380
    iput p1, p0, Ll/ܿ᩹ۢ;->ܺ:I

    .line 2381
    iput-boolean v2, p0, Ll/ܿ᩹ۢ;->֫:Z

    return-void

    .line 1492
    :pswitch_d
    iget p1, p0, Ll/ܿ᩹ۢ;->ܰ:I

    iget v0, p0, Ll/ܿ᩹ۢ;->ܺ:I

    .line 2158
    invoke-direct {p0, v2, v3, v3}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v1

    sub-int/2addr v0, v1

    .line 1492
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 2380
    iput p1, p0, Ll/ܿ᩹ۢ;->ܺ:I

    .line 2381
    iput-boolean v2, p0, Ll/ܿ᩹ۢ;->֫:Z

    return-void

    .line 1483
    :pswitch_e
    iput-boolean v2, p0, Ll/ܿ᩹ۢ;->֫:Z

    .line 1484
    iget p1, p0, Ll/ܿ᩹ۢ;->ۜ:I

    iget v0, p0, Ll/ܿ᩹ۢ;->ۡ:I

    sub-int/2addr p1, v0

    .line 2158
    invoke-direct {p0, v2, v3, v3}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v0

    .line 1485
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int v7, p1, v0

    .line 1487
    iget-object v4, p0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    iget v5, p0, Ll/ܿ᩹ۢ;->ۡ:I

    iget v10, p0, Ll/ܿ᩹ۢ;->ܺ:I

    const/4 v8, 0x1

    add-int v9, v5, v0

    move v6, v10

    invoke-virtual/range {v4 .. v10}, Ll/֫᩹ۢ;->֫(IIIIII)V

    .line 1488
    iget p1, p0, Ll/ܿ᩹ۢ;->ۡ:I

    iget v1, p0, Ll/ܿ᩹ۢ;->ܺ:I

    .line 2069
    invoke-direct {p0, p1, v1, v0, v3}, Ll/ܿ᩹ۢ;->ۧ(IIII)V

    return-void

    .line 1631
    :pswitch_f
    invoke-direct {p0, v0}, Ll/ܿ᩹ۢ;->ܽ(I)V

    return-void

    :pswitch_10
    const/16 p1, 0xc

    .line 1634
    invoke-direct {p0, p1}, Ll/ܿ᩹ۢ;->ܽ(I)V

    return-void

    :pswitch_11
    const/16 p1, 0x22

    .line 2158
    invoke-direct {p0, v2, v2, v3}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v0

    if-eq v0, v7, :cond_7

    if-eq v0, v5, :cond_6

    if-eq v0, p1, :cond_3c

    .line 2228
    iput v2, p0, Ll/ܿ᩹ۢ;->ᩴ:I

    return-void

    :cond_6
    iput v2, p0, Ll/ܿ᩹ۢ;->ᩴ:I

    return-void

    .line 2087
    :cond_7
    iput-boolean v3, p0, Ll/ܿ᩹ۢ;->֡:Z

    return-void

    .line 2158
    :pswitch_12
    invoke-direct {p0, v2, v2, v3}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result p1

    if-eqz p1, :cond_9

    if-eq p1, v6, :cond_8

    goto/16 :goto_c

    :cond_8
    const/4 p1, 0x0

    .line 1663
    :goto_3
    iget v0, p0, Ll/ܿ᩹ۢ;->ۜ:I

    if-ge p1, v0, :cond_3c

    .line 1664
    iget-object v0, p0, Ll/ܿ᩹ۢ;->ۛ:[Z

    aput-boolean v2, v0, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    .line 1660
    :cond_9
    iget-object p1, p0, Ll/ܿ᩹ۢ;->ۛ:[Z

    iget v0, p0, Ll/ܿ᩹ۢ;->ۡ:I

    aput-boolean v2, p1, v0

    return-void

    .line 2162
    :pswitch_13
    invoke-direct {p0, v3, v3, v3}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result p1

    sub-int/2addr p1, v3

    .line 2158
    invoke-direct {p0, v2, v3, v3}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v0

    sub-int/2addr v0, v3

    .line 1515
    invoke-direct {p0, p1, v0}, Ll/ܿ᩹ۢ;->ۧ(II)V

    return-void

    .line 1654
    :pswitch_14
    iget p1, p0, Ll/ܿ᩹ۢ;->ۡ:I

    iget v0, p0, Ll/ܿ᩹ۢ;->ܺ:I

    .line 2158
    invoke-direct {p0, v2, v3, v3}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v1

    add-int/2addr v0, v1

    .line 1654
    invoke-direct {p0, p1, v0}, Ll/ܿ᩹ۢ;->ۧ(II)V

    return-void

    .line 2158
    :pswitch_15
    invoke-direct {p0, v2, v3, v3}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result p1

    .line 1651
    invoke-static {v3, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iget v0, p0, Ll/ܿ᩹ۢ;->᩹:I

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    sub-int/2addr p1, v3

    .line 2380
    iput p1, p0, Ll/ܿ᩹ۢ;->ܺ:I

    .line 2381
    iput-boolean v2, p0, Ll/ܿ᩹ۢ;->֫:Z

    return-void

    .line 2158
    :pswitch_16
    invoke-direct {p0, v2, v2, v3}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result p1

    if-nez p1, :cond_3c

    const-string p1, "\u001b[?64;1;2;6;9;15;18;21;22c"

    .line 1648
    invoke-virtual {v8, p1}, Ll/ۖ᩹ۢ;->ۧ(Ljava/lang/String;)V

    return-void

    .line 1640
    :pswitch_17
    iget p1, p0, Ll/ܿ᩹ۢ;->ۚ:I

    const/4 v0, -0x1

    if-ne p1, v0, :cond_a

    goto/16 :goto_c

    .line 2158
    :cond_a
    invoke-direct {p0, v2, v3, v3}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result p1

    :goto_4
    if-ge v2, p1, :cond_3c

    .line 1642
    iget v0, p0, Ll/ܿ᩹ۢ;->ۚ:I

    invoke-direct {p0, v0}, Ll/ܿ᩹ۢ;->ܳ(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 1499
    :pswitch_18
    iget p1, p0, Ll/ܿ᩹ۢ;->᩸:I

    sub-int/2addr p1, v3

    iget v0, p0, Ll/ܿ᩹ۢ;->ۡ:I

    .line 2158
    invoke-direct {p0, v2, v3, v3}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v1

    add-int/2addr v0, v1

    .line 1499
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-direct {p0, p1}, Ll/ܿ᩹ۢ;->ۡ(I)V

    return-void

    .line 2158
    :pswitch_19
    invoke-direct {p0, v2, v3, v3}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result p1

    sub-int/2addr p1, v3

    .line 2393
    iget v0, p0, Ll/ܿ᩹ۢ;->ܺ:I

    invoke-direct {p0, p1, v0}, Ll/ܿ᩹ۢ;->ۧ(II)V

    return-void

    .line 2158
    :pswitch_1a
    invoke-direct {p0, v2, v2, v3}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result p1

    if-eq p1, v9, :cond_c

    const/4 v0, 0x6

    if-eq p1, v0, :cond_b

    goto/16 :goto_c

    .line 1692
    :cond_b
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    iget p1, p0, Ll/ܿ᩹ۢ;->ܺ:I

    add-int/2addr p1, v3

    iget v0, p0, Ll/ܿ᩹ۢ;->ۡ:I

    add-int/2addr v0, v3

    const-string v1, "\u001b["

    const-string v2, "R"

    .line 0
    invoke-static {v1, p1, v11, v2, v0}, Ll/᩵ۢ֡;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    .line 1692
    invoke-virtual {v8, p1}, Ll/ۖ᩹ۢ;->ۧ(Ljava/lang/String;)V

    return-void

    :cond_c
    new-array p1, v7, [B

    .line 1686
    fill-array-data p1, :array_0

    .line 1687
    invoke-virtual {v8, v7, p1}, Ll/ۖ᩹ۢ;->֫(I[B)V

    return-void

    .line 1784
    :pswitch_1b
    iget p1, p0, Ll/ܿ᩹ۢ;->ܽ:I

    iget-object v5, p0, Ll/ܿ᩹ۢ;->ᩳ:[I

    array-length v8, v5

    if-lt p1, v8, :cond_d

    array-length p1, v5

    sub-int/2addr p1, v3

    iput p1, p0, Ll/ܿ᩹ۢ;->ܽ:I

    :cond_d
    const/4 p1, 0x0

    .line 1785
    :goto_5
    iget v8, p0, Ll/ܿ᩹ۢ;->ܽ:I

    if-gt p1, v8, :cond_3c

    .line 1786
    aget v11, v5, p1

    if-gez v11, :cond_f

    if-lez v8, :cond_e

    goto/16 :goto_a

    :cond_e
    const/4 v11, 0x0

    :cond_f
    const/16 v12, 0x101

    const/16 v13, 0x100

    if-nez v11, :cond_10

    .line 1795
    iput v13, p0, Ll/ܿ᩹ۢ;->᩵:I

    .line 1796
    iput v12, p0, Ll/ܿ᩹ۢ;->ܿ:I

    .line 1797
    iput v2, p0, Ll/ܿ᩹ۢ;->ۘ:I

    goto/16 :goto_a

    :cond_10
    if-ne v11, v3, :cond_11

    .line 1799
    iget v1, p0, Ll/ܿ᩹ۢ;->ۘ:I

    or-int/2addr v1, v3

    iput v1, p0, Ll/ܿ᩹ۢ;->ۘ:I

    goto/16 :goto_a

    :cond_11
    if-ne v11, v4, :cond_12

    .line 1801
    iget v1, p0, Ll/ܿ᩹ۢ;->ۘ:I

    or-int/2addr v1, v13

    iput v1, p0, Ll/ܿ᩹ۢ;->ۘ:I

    goto/16 :goto_a

    :cond_12
    if-ne v11, v6, :cond_13

    .line 1803
    iget v1, p0, Ll/ܿ᩹ۢ;->ۘ:I

    or-int/2addr v1, v4

    iput v1, p0, Ll/ܿ᩹ۢ;->ۘ:I

    goto/16 :goto_a

    :cond_13
    if-ne v11, v7, :cond_14

    .line 1805
    iget v1, p0, Ll/ܿ᩹ۢ;->ۘ:I

    or-int/2addr v1, v7

    iput v1, p0, Ll/ܿ᩹ۢ;->ۘ:I

    goto/16 :goto_a

    :cond_14
    if-ne v11, v9, :cond_15

    .line 1807
    iget v8, p0, Ll/ܿ᩹ۢ;->ۘ:I

    or-int/2addr v1, v8

    iput v1, p0, Ll/ܿ᩹ۢ;->ۘ:I

    goto/16 :goto_a

    :cond_15
    if-ne v11, v0, :cond_16

    .line 1809
    iget v1, p0, Ll/ܿ᩹ۢ;->ۘ:I

    or-int/lit8 v1, v1, 0x10

    iput v1, p0, Ll/ܿ᩹ۢ;->ۘ:I

    goto/16 :goto_a

    :cond_16
    if-ne v11, v1, :cond_17

    .line 1811
    iget v1, p0, Ll/ܿ᩹ۢ;->ۘ:I

    or-int/lit8 v1, v1, 0x20

    iput v1, p0, Ll/ܿ᩹ۢ;->ۘ:I

    goto/16 :goto_a

    :cond_17
    const/16 v1, 0x9

    if-ne v11, v1, :cond_18

    .line 1813
    iget v1, p0, Ll/ܿ᩹ۢ;->ۘ:I

    or-int/lit8 v1, v1, 0x40

    iput v1, p0, Ll/ܿ᩹ۢ;->ۘ:I

    goto/16 :goto_a

    :cond_18
    const/16 v1, 0xa

    if-ne v11, v1, :cond_19

    goto/16 :goto_a

    :cond_19
    if-ne v11, v10, :cond_1a

    goto/16 :goto_a

    :cond_1a
    const/16 v1, 0x16

    if-ne v11, v1, :cond_1b

    .line 1819
    iget v1, p0, Ll/ܿ᩹ۢ;->ۘ:I

    and-int/lit16 v1, v1, -0x102

    iput v1, p0, Ll/ܿ᩹ۢ;->ۘ:I

    goto/16 :goto_a

    :cond_1b
    const/16 v1, 0x17

    if-ne v11, v1, :cond_1c

    .line 1821
    iget v1, p0, Ll/ܿ᩹ۢ;->ۘ:I

    and-int/lit8 v1, v1, -0x3

    iput v1, p0, Ll/ܿ᩹ۢ;->ۘ:I

    goto/16 :goto_a

    :cond_1c
    const/16 v1, 0x18

    if-ne v11, v1, :cond_1d

    .line 1823
    iget v1, p0, Ll/ܿ᩹ۢ;->ۘ:I

    and-int/lit8 v1, v1, -0x5

    iput v1, p0, Ll/ܿ᩹ۢ;->ۘ:I

    goto/16 :goto_a

    :cond_1d
    const/16 v1, 0x19

    if-ne v11, v1, :cond_1e

    .line 1825
    iget v1, p0, Ll/ܿ᩹ۢ;->ۘ:I

    and-int/lit8 v1, v1, -0x9

    iput v1, p0, Ll/ܿ᩹ۢ;->ۘ:I

    goto/16 :goto_a

    :cond_1e
    const/16 v1, 0x1b

    if-ne v11, v1, :cond_1f

    .line 1827
    iget v1, p0, Ll/ܿ᩹ۢ;->ۘ:I

    and-int/lit8 v1, v1, -0x11

    iput v1, p0, Ll/ܿ᩹ۢ;->ۘ:I

    goto/16 :goto_a

    :cond_1f
    const/16 v1, 0x1c

    if-ne v11, v1, :cond_20

    .line 1829
    iget v1, p0, Ll/ܿ᩹ۢ;->ۘ:I

    and-int/lit8 v1, v1, -0x21

    iput v1, p0, Ll/ܿ᩹ۢ;->ۘ:I

    goto/16 :goto_a

    :cond_20
    const/16 v1, 0x1d

    if-ne v11, v1, :cond_21

    .line 1831
    iget v1, p0, Ll/ܿ᩹ۢ;->ۘ:I

    and-int/lit8 v1, v1, -0x41

    iput v1, p0, Ll/ܿ᩹ۢ;->ۘ:I

    goto/16 :goto_a

    :cond_21
    const/16 v1, 0x1e

    if-lt v11, v1, :cond_22

    const/16 v1, 0x25

    if-gt v11, v1, :cond_22

    add-int/lit8 v11, v11, -0x1e

    .line 1833
    iput v11, p0, Ll/ܿ᩹ۢ;->᩵:I

    goto/16 :goto_a

    :cond_22
    const/16 v1, 0x26

    if-eq v11, v1, :cond_28

    const/16 v10, 0x30

    if-ne v11, v10, :cond_23

    goto :goto_6

    :cond_23
    const/16 v1, 0x27

    if-ne v11, v1, :cond_24

    .line 1876
    iput v13, p0, Ll/ܿ᩹ۢ;->᩵:I

    goto/16 :goto_a

    :cond_24
    const/16 v1, 0x28

    if-lt v11, v1, :cond_25

    const/16 v1, 0x2f

    if-gt v11, v1, :cond_25

    add-int/lit8 v11, v11, -0x28

    .line 1878
    iput v11, p0, Ll/ܿ᩹ۢ;->ܿ:I

    goto/16 :goto_a

    :cond_25
    const/16 v1, 0x31

    if-ne v11, v1, :cond_26

    .line 1880
    iput v12, p0, Ll/ܿ᩹ۢ;->ܿ:I

    goto/16 :goto_a

    :cond_26
    const/16 v1, 0x5a

    if-lt v11, v1, :cond_27

    const/16 v1, 0x61

    if-gt v11, v1, :cond_27

    add-int/lit8 v11, v11, -0x52

    .line 1882
    iput v11, p0, Ll/ܿ᩹ۢ;->᩵:I

    goto/16 :goto_a

    :cond_27
    const/16 v1, 0x64

    if-lt v11, v1, :cond_32

    const/16 v1, 0x6b

    if-gt v11, v1, :cond_32

    add-int/lit8 v11, v11, -0x5c

    .line 1884
    iput v11, p0, Ll/ܿ᩹ۢ;->ܿ:I

    goto :goto_a

    :cond_28
    :goto_6
    add-int/lit8 v10, p1, 0x2

    if-le v10, v8, :cond_29

    goto :goto_a

    :cond_29
    add-int/lit8 v12, p1, 0x1

    .line 1839
    aget v12, v5, v12

    if-ne v12, v4, :cond_2e

    add-int/lit8 v12, p1, 0x4

    if-le v12, v8, :cond_2a

    goto :goto_a

    .line 1844
    :cond_2a
    aget v8, v5, v10

    add-int/lit8 p1, p1, 0x3

    aget p1, v5, p1

    aget v10, v5, v12

    if-ltz v8, :cond_2d

    if-ltz p1, :cond_2d

    if-ltz v10, :cond_2d

    const/16 v13, 0xff

    if-gt v8, v13, :cond_2d

    if-gt p1, v13, :cond_2d

    if-le v10, v13, :cond_2b

    goto :goto_7

    :cond_2b
    shl-int/lit8 v8, v8, 0x10

    const/high16 v13, -0x1000000

    or-int/2addr v8, v13

    shl-int/lit8 p1, p1, 0x8

    or-int/2addr p1, v8

    or-int/2addr p1, v10

    if-ne v11, v1, :cond_2c

    .line 1851
    iput p1, p0, Ll/ܿ᩹ۢ;->᩵:I

    goto :goto_8

    .line 1853
    :cond_2c
    iput p1, p0, Ll/ܿ᩹ۢ;->ܿ:I

    goto :goto_8

    .line 2228
    :cond_2d
    :goto_7
    iput v2, p0, Ll/ܿ᩹ۢ;->ᩴ:I

    :goto_8
    move p1, v12

    goto :goto_a

    :cond_2e
    if-ne v12, v9, :cond_31

    .line 1859
    aget p1, v5, v10

    if-ltz p1, :cond_30

    const/16 v8, 0x105

    if-ge p1, v8, :cond_30

    if-ne v11, v1, :cond_2f

    .line 1863
    iput p1, p0, Ll/ܿ᩹ۢ;->᩵:I

    goto :goto_9

    .line 1865
    :cond_2f
    iput p1, p0, Ll/ܿ᩹ۢ;->ܿ:I

    :cond_30
    :goto_9
    move p1, v10

    goto :goto_a

    .line 2228
    :cond_31
    iput v2, p0, Ll/ܿ᩹ۢ;->ᩴ:I

    :cond_32
    :goto_a
    add-int/2addr p1, v3

    const/16 v1, 0x8

    const/16 v10, 0xb

    goto/16 :goto_5

    .line 2158
    :pswitch_1c
    invoke-direct {p0, v2, v2, v3}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result p1

    if-eq p1, v7, :cond_34

    if-eq p1, v5, :cond_33

    const/16 v0, 0x22

    if-eq p1, v0, :cond_3c

    .line 2228
    iput v2, p0, Ll/ܿ᩹ۢ;->ᩴ:I

    return-void

    :cond_33
    iput v2, p0, Ll/ܿ᩹ۢ;->ᩴ:I

    return-void

    .line 2087
    :cond_34
    iput-boolean v2, p0, Ll/ܿ᩹ۢ;->֡:Z

    return-void

    .line 1769
    :pswitch_1d
    invoke-direct {p0}, Ll/ܿ᩹ۢ;->᩵()V

    return-void

    .line 2158
    :pswitch_1e
    invoke-direct {p0, v2, v2, v3}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result p1

    if-eq p1, v10, :cond_37

    const/16 v0, 0xd

    if-eq p1, v0, :cond_36

    const/16 v0, 0xe

    const-string v1, "t"

    if-eq p1, v0, :cond_35

    .line 1726
    iget-object v0, p0, Ll/ܿ᩹ۢ;->᩺:Ljava/util/Stack;

    packed-switch p1, :pswitch_data_5

    goto/16 :goto_c

    .line 1761
    :pswitch_1f
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_3c

    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 2468
    iget-object v0, p0, Ll/ܿ᩹ۢ;->ۨ:Ljava/lang/String;

    .line 2469
    iput-object p1, p0, Ll/ܿ᩹ۢ;->ۨ:Ljava/lang/String;

    .line 50
    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3c

    .line 2471
    invoke-virtual {v8}, Ll/ۖ᩹ۢ;->ܿ()V

    return-void

    .line 1754
    :pswitch_20
    iget-object p1, p0, Ll/ܿ᩹ۢ;->ۨ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1755
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result p1

    if-le p1, v5, :cond_3c

    .line 1757
    invoke-virtual {v0, v2}, Ljava/util/AbstractList;->remove(I)Ljava/lang/Object;

    return-void

    :pswitch_21
    const-string p1, "\u001b]l\u001b\\"

    .line 1748
    invoke-virtual {v8, p1}, Ll/ۖ᩹ۢ;->ۧ(Ljava/lang/String;)V

    return-void

    :pswitch_22
    const-string p1, "\u001b]LIconLabel\u001b\\"

    .line 1745
    invoke-virtual {v8, p1}, Ll/ۖ᩹ۢ;->ۧ(Ljava/lang/String;)V

    return-void

    .line 1742
    :pswitch_23
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    iget p1, p0, Ll/ܿ᩹ۢ;->᩹:I

    iget v0, p0, Ll/ܿ᩹ۢ;->ۜ:I

    const-string v2, "\u001b[9;"

    .line 0
    invoke-static {v2, p1, v11, v1, v0}, Ll/᩵ۢ֡;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    .line 1742
    invoke-virtual {v8, p1}, Ll/ۖ᩹ۢ;->ۧ(Ljava/lang/String;)V

    return-void

    .line 1738
    :pswitch_24
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    iget p1, p0, Ll/ܿ᩹ۢ;->᩹:I

    iget v0, p0, Ll/ܿ᩹ۢ;->ۜ:I

    const-string v2, "\u001b[8;"

    .line 0
    invoke-static {v2, p1, v11, v1, v0}, Ll/᩵ۢ֡;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    .line 1738
    invoke-virtual {v8, p1}, Ll/ۖ᩹ۢ;->ۧ(Ljava/lang/String;)V

    return-void

    .line 1735
    :cond_35
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    iget p1, p0, Ll/ܿ᩹ۢ;->᩹:I

    mul-int/lit8 p1, p1, 0xc

    iget v0, p0, Ll/ܿ᩹ۢ;->ۜ:I

    mul-int/lit8 v0, v0, 0xc

    const-string v2, "\u001b[4;"

    .line 0
    invoke-static {v2, p1, v11, v1, v0}, Ll/᩵ۢ֡;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    .line 1735
    invoke-virtual {v8, p1}, Ll/ۖ᩹ۢ;->ۧ(Ljava/lang/String;)V

    return-void

    :cond_36
    const-string p1, "\u001b[3;0;0t"

    .line 1731
    invoke-virtual {v8, p1}, Ll/ۖ᩹ۢ;->ۧ(Ljava/lang/String;)V

    return-void

    :cond_37
    const-string p1, "\u001b[1t"

    .line 1728
    invoke-virtual {v8, p1}, Ll/ۖ᩹ۢ;->ۧ(Ljava/lang/String;)V

    return-void

    :pswitch_25
    const/16 p1, 0x800

    .line 1714
    invoke-direct {p0, p1}, Ll/ܿ᩹ۢ;->᩻(I)Z

    move-result p1

    if-eqz p1, :cond_38

    .line 2158
    invoke-direct {p0, v2, v3, v3}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result p1

    sub-int/2addr p1, v3

    .line 1716
    iget v0, p0, Ll/ܿ᩹ۢ;->ۜ:I

    sub-int/2addr v0, v4

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Ll/ܿ᩹ۢ;->֨:I

    add-int/2addr p1, v3

    .line 1717
    iget v0, p0, Ll/ܿ᩹ۢ;->ۜ:I

    .line 2162
    invoke-direct {p0, v3, v0, v3}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v0

    .line 1717
    iget v1, p0, Ll/ܿ᩹ۢ;->ۜ:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Ll/ܿ᩹ۢ;->᩸:I

    .line 1719
    invoke-direct {p0, v2, v2}, Ll/ܿ᩹ۢ;->ۧ(II)V

    return-void

    .line 1722
    :cond_38
    invoke-direct {p0}, Ll/ܿ᩹ۢ;->֡()V

    return-void

    .line 2158
    :pswitch_26
    invoke-direct {p0, v2, v3, v3}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result p1

    sub-int/2addr p1, v3

    .line 1707
    iget v0, p0, Ll/ܿ᩹ۢ;->᩹:I

    sub-int/2addr v0, v4

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {v2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Ll/ܿ᩹ۢ;->ܰ:I

    add-int/2addr p1, v4

    .line 1708
    iget v0, p0, Ll/ܿ᩹ۢ;->᩹:I

    .line 2162
    invoke-direct {p0, v3, v0, v3}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v0

    .line 1708
    iget v1, p0, Ll/ܿ᩹ۢ;->᩹:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Ll/ܿ᩹ۢ;->ܳ:I

    .line 1710
    invoke-direct {p0, v2, v2}, Ll/ܿ᩹ۢ;->ۧ(II)V

    return-void

    .line 1599
    :cond_39
    iget p1, p0, Ll/ܿ᩹ۢ;->ܽ:I

    if-nez p1, :cond_3a

    .line 2158
    invoke-direct {p0, v2, v3, v3}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result p1

    .line 1605
    iget v0, p0, Ll/ܿ᩹ۢ;->ܳ:I

    iget v1, p0, Ll/ܿ᩹ۢ;->ܰ:I

    sub-int/2addr v0, v1

    .line 1606
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 1607
    iget-object v3, p0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    iget v5, p0, Ll/ܿ᩹ۢ;->ܰ:I

    iget v6, p0, Ll/ܿ᩹ۢ;->ۜ:I

    sub-int v7, v0, p1

    const/4 v8, 0x0

    add-int v9, v5, p1

    const/4 v4, 0x0

    invoke-virtual/range {v3 .. v9}, Ll/֫᩹ۢ;->֫(IIIIII)V

    .line 1608
    iget v0, p0, Ll/ܿ᩹ۢ;->ܰ:I

    iget v1, p0, Ll/ܿ᩹ۢ;->ۜ:I

    invoke-direct {p0, v2, v0, v1, p1}, Ll/ܿ᩹ۢ;->ۧ(IIII)V

    return-void

    .line 2228
    :cond_3a
    iput v2, p0, Ll/ܿ᩹ۢ;->ᩴ:I

    return-void

    .line 2158
    :cond_3b
    invoke-direct {p0, v2, v3, v3}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result p1

    :goto_b
    if-ge v2, p1, :cond_3c

    .line 1595
    invoke-direct {p0}, Ll/ܿ᩹ۢ;->ۚ()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_b

    :cond_3c
    :goto_c
    return-void

    .line 2158
    :cond_3d
    invoke-direct {p0, v2, v3, v3}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result p1

    .line 1620
    iget v0, p0, Ll/ܿ᩹ۢ;->֨:I

    .line 1621
    iget v1, p0, Ll/ܿ᩹ۢ;->ۡ:I

    sub-int/2addr v1, v3

    :goto_d
    if-ltz v1, :cond_3f

    .line 1622
    iget-object v2, p0, Ll/ܿ᩹ۢ;->ۛ:[Z

    aget-boolean v2, v2, v1

    if-eqz v2, :cond_3e

    add-int/lit8 p1, p1, -0x1

    if-nez p1, :cond_3e

    .line 1624
    iget p1, p0, Ll/ܿ᩹ۢ;->֨:I

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_e

    :cond_3e
    add-int/lit8 v1, v1, -0x1

    goto :goto_d

    .line 1628
    :cond_3f
    :goto_e
    iput v0, p0, Ll/ܿ᩹ۢ;->ۡ:I

    return-void

    .line 1615
    :cond_40
    iput-boolean v2, p0, Ll/ܿ᩹ۢ;->֫:Z

    .line 1616
    iget-object v1, p0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    iget p1, p0, Ll/ܿ᩹ۢ;->ۡ:I

    iget v0, p0, Ll/ܿ᩹ۢ;->ܺ:I

    .line 2158
    invoke-direct {p0, v2, v3, v3}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v2

    .line 1616
    iget v3, p0, Ll/ܿ᩹ۢ;->ۜ:I

    iget v4, p0, Ll/ܿ᩹ۢ;->ۡ:I

    sub-int/2addr v3, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v4

    const/16 v6, 0x20

    invoke-direct {p0}, Ll/ܿ᩹ۢ;->ۘ()J

    move-result-wide v7

    const/4 v5, 0x1

    move v2, p1

    move v3, v0

    invoke-virtual/range {v1 .. v8}, Ll/֫᩹ۢ;->֫(IIIIIJ)V

    return-void

    .line 1584
    :cond_41
    iput-boolean v2, p0, Ll/ܿ᩹ۢ;->֫:Z

    .line 1585
    iget p1, p0, Ll/ܿ᩹ۢ;->ۜ:I

    iget v0, p0, Ll/ܿ᩹ۢ;->ۡ:I

    sub-int/2addr p1, v0

    .line 2158
    invoke-direct {p0, v2, v3, v3}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v0

    .line 1586
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int/2addr p1, v0

    .line 1588
    iget-object v4, p0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    iget v9, p0, Ll/ܿ᩹ۢ;->ۡ:I

    add-int v5, v9, v0

    iget v10, p0, Ll/ܿ᩹ۢ;->ܺ:I

    const/4 v8, 0x1

    move v6, v10

    move v7, p1

    invoke-virtual/range {v4 .. v10}, Ll/֫᩹ۢ;->֫(IIIIII)V

    .line 1589
    iget v1, p0, Ll/ܿ᩹ۢ;->ۡ:I

    add-int/2addr v1, p1

    iget p1, p0, Ll/ܿ᩹ۢ;->ܺ:I

    .line 2069
    invoke-direct {p0, v1, p1, v0, v3}, Ll/ܿ᩹ۢ;->ۧ(IIII)V

    return-void

    :cond_42
    const/16 p1, 0x10

    .line 1479
    invoke-direct {p0, p1}, Ll/ܿ᩹ۢ;->ܽ(I)V

    return-void

    :cond_43
    const/16 p1, 0x12

    .line 1473
    invoke-direct {p0, p1}, Ll/ܿ᩹ۢ;->ܽ(I)V

    return-void

    :cond_44
    const/16 p1, 0x8

    .line 1476
    invoke-direct {p0, p1}, Ll/ܿ᩹ۢ;->ܽ(I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x20
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x3e
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_18
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_13
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x60
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x6c
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x72
        :pswitch_26
        :pswitch_25
        :pswitch_1e
        :pswitch_1d
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x12
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
    .end packed-switch

    :array_0
    .array-data 1
        0x1bt
        0x5bt
        0x30t
        0x6et
    .end array-data
.end method

.method private ᩴ()V
    .locals 10

    .line 442
    iget v0, p0, Ll/ܿ᩹ۢ;->ۡ:I

    iget v1, p0, Ll/ܿ᩹ۢ;->ܺ:I

    filled-new-array {v0, v1}, [I

    move-result-object v0

    .line 443
    iget-object v2, p0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    iget-object v1, p0, Ll/ܿ᩹ۢ;->ۧ:Ll/֫᩹ۢ;

    if-ne v2, v1, :cond_0

    iget v1, p0, Ll/ܿ᩹ۢ;->᩹:I

    goto :goto_0

    :cond_0
    iget-object v1, p0, Ll/ܿ᩹ۢ;->۠:Ll/֫᩹ۢ;

    iget v1, v1, Ll/֫᩹ۢ;->ܳ:I

    :goto_0
    move v5, v1

    .line 444
    iget v3, p0, Ll/ܿ᩹ۢ;->ۜ:I

    iget v4, p0, Ll/ܿ᩹ۢ;->᩹:I

    invoke-direct {p0}, Ll/ܿ᩹ۢ;->ۘ()J

    move-result-wide v7

    invoke-virtual {p0}, Ll/ܿ᩹ۢ;->᩻()Z

    move-result v9

    move-object v6, v0

    invoke-virtual/range {v2 .. v9}, Ll/֫᩹ۢ;->֫(III[IJZ)V

    const/4 v1, 0x0

    .line 445
    aget v1, v0, v1

    iput v1, p0, Ll/ܿ᩹ۢ;->ۡ:I

    const/4 v1, 0x1

    .line 446
    aget v0, v0, v1

    iput v0, p0, Ll/ܿ᩹ۢ;->ܺ:I

    return-void
.end method

.method private ᩵()V
    .locals 3

    .line 1449
    iget-object v0, p0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    iget-object v1, p0, Ll/ܿ᩹ۢ;->۠:Ll/֫᩹ۢ;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/ܿ᩹ۢ;->ۗ:Ll/ᩳ᩹ۢ;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ll/ܿ᩹ۢ;->ۙ:Ll/ᩳ᩹ۢ;

    .line 1450
    :goto_0
    iget v1, v0, Ll/ᩳ᩹ۢ;->ܽ:I

    iget v2, v0, Ll/ᩳ᩹ۢ;->ۧ:I

    invoke-direct {p0, v1, v2}, Ll/ܿ᩹ۢ;->ܽ(II)V

    .line 1451
    iget v1, v0, Ll/ᩳ᩹ۢ;->ܿ:I

    iput v1, p0, Ll/ܿ᩹ۢ;->ۘ:I

    .line 1452
    iget v1, v0, Ll/ᩳ᩹ۢ;->ܳ:I

    iput v1, p0, Ll/ܿ᩹ۢ;->᩵:I

    .line 1453
    iget v1, v0, Ll/ᩳ᩹ۢ;->֫:I

    iput v1, p0, Ll/ܿ᩹ۢ;->ܿ:I

    .line 1455
    iget v1, p0, Ll/ܿ᩹ۢ;->ۢ:I

    and-int/lit8 v1, v1, -0xd

    iget v2, v0, Ll/ᩳ᩹ۢ;->ᩳ:I

    and-int/lit8 v2, v2, 0xc

    or-int/2addr v1, v2

    iput v1, p0, Ll/ܿ᩹ۢ;->ۢ:I

    .line 1456
    iget-boolean v1, v0, Ll/ᩳ᩹ۢ;->᩻:Z

    iput-boolean v1, p0, Ll/ܿ᩹ۢ;->۟:Z

    .line 1457
    iget-boolean v1, v0, Ll/ᩳ᩹ۢ;->ۜ:Z

    iput-boolean v1, p0, Ll/ܿ᩹ۢ;->֫֫:Z

    .line 1458
    iget-boolean v0, v0, Ll/ᩳ᩹ۢ;->᩷:Z

    iput-boolean v0, p0, Ll/ܿ᩹ۢ;->ۧ֫:Z

    return-void
.end method

.method private ᩷(I)I
    .locals 2

    .line 1029
    iget v0, p0, Ll/ܿ᩹ۢ;->ۡ:I

    :cond_0
    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Ll/ܿ᩹ۢ;->ۜ:I

    if-ge v0, v1, :cond_1

    .line 1030
    iget-object v1, p0, Ll/ܿ᩹ۢ;->ۛ:[Z

    aget-boolean v1, v1, v0

    if-eqz v1, :cond_0

    add-int/lit8 p1, p1, -0x1

    if-nez p1, :cond_0

    iget p1, p0, Ll/ܿ᩹ۢ;->᩸:I

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1

    .line 1031
    :cond_1
    iget p1, p0, Ll/ܿ᩹ۢ;->᩸:I

    add-int/lit8 p1, p1, -0x1

    return p1
.end method

.method private ᩻(I)Z
    .locals 1

    .line 321
    iget v0, p0, Ll/ܿ᩹ۢ;->ۢ:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final ֫(IIII)Ljava/lang/String;
    .locals 1

    .line 2454
    iget-object v0, p0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/֫᩹ۢ;->֫(IIII)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 2410
    iput v0, p0, Ll/ܿ᩹ۢ;->۫:I

    return-void
.end method

.method public final ֫(I)V
    .locals 25

    move-object/from16 v0, p0

    move/from16 v1, p1

    if-eqz v1, :cond_6e

    const/16 v2, 0x18

    const/4 v3, 0x0

    if-eq v1, v2, :cond_6d

    const/16 v2, 0x1a

    if-eq v1, v2, :cond_6d

    .line 574
    iget-object v2, v0, Ll/ܿ᩹ۢ;->ᩳ:[I

    const/16 v4, 0x1b

    const/4 v5, 0x1

    if-eq v1, v4, :cond_6a

    iget-object v4, v0, Ll/ܿ᩹ۢ;->ۤ:Ll/ۖ᩹ۢ;

    packed-switch v1, :pswitch_data_0

    .line 639
    iput-boolean v3, v0, Ll/ܿ᩹ۢ;->᩷:Z

    .line 640
    iget v6, v0, Ll/ܿ᩹ۢ;->ᩴ:I

    iget-object v7, v0, Ll/ܿ᩹ۢ;->ܶ:Ljava/lang/StringBuilder;

    const-string v8, "\u001b\\"

    const-string v9, "\u001b[?"

    const/16 v10, 0x71

    const/16 v11, 0x7e

    const/16 v12, 0x70

    const-string v15, ";"

    const/16 v13, 0x78

    const/4 v14, 0x2

    packed-switch v6, :pswitch_data_1

    .line 2228
    :cond_0
    :goto_0
    :pswitch_0
    iput v3, v0, Ll/ܿ᩹ۢ;->ᩴ:I

    goto/16 :goto_38

    :pswitch_1
    const/4 v1, 0x1

    .line 617
    iput-boolean v1, v0, Ll/ܿ᩹ۢ;->ۧ֫:Z

    return-void

    :pswitch_2
    const/4 v1, 0x0

    .line 614
    iput-boolean v1, v0, Ll/ܿ᩹ۢ;->ۧ֫:Z

    return-void

    .line 611
    :pswitch_3
    iget v1, v0, Ll/ܿ᩹ۢ;->֨:I

    invoke-direct {v0, v1}, Ll/ܿ᩹ۢ;->ۡ(I)V

    return-void

    .line 608
    :pswitch_4
    invoke-direct/range {p0 .. p0}, Ll/ܿ᩹ۢ;->ۖ()V

    return-void

    :pswitch_5
    const/4 v1, 0x1

    .line 603
    invoke-direct {v0, v1}, Ll/ܿ᩹ۢ;->᩷(I)I

    move-result v1

    iput v1, v0, Ll/ܿ᩹ۢ;->ۡ:I

    return-void

    .line 584
    :pswitch_6
    iget v1, v0, Ll/ܿ᩹ۢ;->֨:I

    iget v2, v0, Ll/ܿ᩹ۢ;->ۡ:I

    if-ne v1, v2, :cond_1

    .line 586
    iget v1, v0, Ll/ܿ᩹ۢ;->ܺ:I

    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_6e

    .line 587
    iget-object v2, v0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    .line 135
    iget-object v3, v2, Ll/֫᩹ۢ;->ܽ:[Ll/ᩴ᩹ۢ;

    invoke-virtual {v2, v1}, Ll/֫᩹ۢ;->ۧ(I)I

    move-result v2

    aget-object v2, v3, v2

    iget-boolean v2, v2, Ll/ᩴ᩹ۢ;->ܽ:Z

    if-eqz v2, :cond_6e

    .line 588
    iget-object v2, v0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    .line 139
    iget-object v3, v2, Ll/֫᩹ۢ;->ܽ:[Ll/ᩴ᩹ۢ;

    invoke-virtual {v2, v1}, Ll/֫᩹ۢ;->ۧ(I)I

    move-result v2

    aget-object v2, v3, v2

    const/4 v3, 0x0

    iput-boolean v3, v2, Ll/ᩴ᩹ۢ;->ܽ:Z

    .line 589
    iget v2, v0, Ll/ܿ᩹ۢ;->᩸:I

    add-int/lit8 v2, v2, -0x1

    invoke-direct {v0, v1, v2}, Ll/ܿ᩹ۢ;->ܽ(II)V

    return-void

    :cond_1
    add-int/lit8 v2, v2, -0x1

    .line 592
    invoke-direct {v0, v2}, Ll/ܿ᩹ۢ;->ۡ(I)V

    return-void

    .line 578
    :pswitch_7
    iget v2, v0, Ll/ܿ᩹ۢ;->ᩴ:I

    const/16 v3, 0xa

    if-ne v2, v3, :cond_2

    .line 579
    invoke-direct/range {p0 .. p1}, Ll/ܿ᩹ۢ;->ܿ(I)V

    return-void

    .line 581
    :cond_2
    invoke-virtual {v4}, Ll/ۖ᩹ۢ;->ܽ()V

    return-void

    :pswitch_8
    if-ne v1, v12, :cond_0

    .line 661
    invoke-virtual/range {p0 .. p0}, Ll/ܿ᩹ۢ;->ܺ()V

    goto/16 :goto_38

    :pswitch_9
    const/16 v2, 0x7d

    if-ne v1, v2, :cond_3

    .line 814
    iget v1, v0, Ll/ܿ᩹ۢ;->᩸:I

    iget v2, v0, Ll/ܿ᩹ۢ;->ۡ:I

    sub-int/2addr v1, v2

    .line 2158
    invoke-direct {v0, v3, v5, v5}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v2

    .line 815
    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    sub-int v7, v1, v2

    .line 817
    iget-object v4, v0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    iget v5, v0, Ll/ܿ᩹ۢ;->ۡ:I

    iget v8, v0, Ll/ܿ᩹ۢ;->᩹:I

    add-int v9, v5, v2

    const/4 v10, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v4 .. v10}, Ll/֫᩹ۢ;->֫(IIIIII)V

    .line 818
    iget v1, v0, Ll/ܿ᩹ۢ;->ۡ:I

    iget v4, v0, Ll/ܿ᩹ۢ;->᩹:I

    invoke-direct {v0, v1, v3, v2, v4}, Ll/ܿ᩹ۢ;->ۧ(IIII)V

    goto/16 :goto_38

    :cond_3
    if-ne v1, v11, :cond_0

    .line 820
    iget v1, v0, Ll/ܿ᩹ۢ;->᩸:I

    iget v2, v0, Ll/ܿ᩹ۢ;->ۡ:I

    sub-int/2addr v1, v2

    .line 2158
    invoke-direct {v0, v3, v5, v5}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v2

    .line 821
    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    sub-int/2addr v1, v2

    .line 823
    iget-object v4, v0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    iget v9, v0, Ll/ܿ᩹ۢ;->ۡ:I

    add-int v5, v9, v2

    iget v8, v0, Ll/ܿ᩹ۢ;->᩹:I

    const/4 v10, 0x0

    const/4 v6, 0x0

    move v7, v1

    invoke-virtual/range {v4 .. v10}, Ll/֫᩹ۢ;->֫(IIIIII)V

    .line 824
    iget v4, v0, Ll/ܿ᩹ۢ;->ܺ:I

    add-int/2addr v4, v1

    iget v1, v0, Ll/ܿ᩹ۢ;->᩹:I

    invoke-direct {v0, v4, v3, v2, v1}, Ll/ܿ᩹ۢ;->ۧ(IIII)V

    goto/16 :goto_38

    :pswitch_a
    if-ne v1, v10, :cond_0

    .line 2158
    invoke-direct {v0, v3, v3, v5}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v1

    if-eqz v1, :cond_5

    if-ne v1, v14, :cond_4

    goto :goto_1

    :cond_4
    if-ne v1, v5, :cond_0

    .line 804
    iget v1, v0, Ll/ܿ᩹ۢ;->ۘ:I

    or-int/lit16 v1, v1, 0x80

    iput v1, v0, Ll/ܿ᩹ۢ;->ۘ:I

    goto/16 :goto_38

    .line 801
    :cond_5
    :goto_1
    iget v1, v0, Ll/ܿ᩹ۢ;->ۘ:I

    and-int/lit16 v1, v1, -0x81

    iput v1, v0, Ll/ܿ᩹ۢ;->ۘ:I

    goto/16 :goto_38

    .line 2158
    :pswitch_b
    invoke-direct {v0, v3, v3, v5}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v2

    if-ne v1, v13, :cond_0

    if-ltz v2, :cond_0

    if-gt v2, v14, :cond_0

    if-ne v2, v14, :cond_6

    goto :goto_2

    :cond_6
    const/4 v5, 0x0

    :goto_2
    const/16 v1, 0x1000

    .line 894
    invoke-direct {v0, v1, v5}, Ll/ܿ᩹ۢ;->ۧ(IZ)V

    goto/16 :goto_38

    .line 2158
    :pswitch_c
    invoke-direct {v0, v3, v3, v5}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v2

    if-eq v1, v10, :cond_7

    const/16 v2, 0x74

    if-eq v1, v2, :cond_69

    const/16 v2, 0x75

    if-eq v1, v2, :cond_69

    goto/16 :goto_0

    :cond_7
    packed-switch v2, :pswitch_data_2

    goto/16 :goto_38

    .line 878
    :pswitch_d
    iput v14, v0, Ll/ܿ᩹ۢ;->ۖ:I

    goto/16 :goto_38

    .line 874
    :pswitch_e
    iput v5, v0, Ll/ܿ᩹ۢ;->ۖ:I

    goto/16 :goto_38

    .line 870
    :pswitch_f
    iput v3, v0, Ll/ܿ᩹ۢ;->ۖ:I

    goto/16 :goto_38

    :pswitch_10
    if-ne v1, v12, :cond_0

    .line 2158
    invoke-direct {v0, v3, v3, v5}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v1

    const/16 v2, 0x2f

    if-eq v1, v2, :cond_a

    const/16 v2, 0x417

    if-eq v1, v2, :cond_a

    const/16 v2, 0x419

    if-ne v1, v2, :cond_8

    goto :goto_3

    .line 849
    :cond_8
    invoke-static {v1}, Ll/ܿ᩹ۢ;->ۜ(I)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_9

    .line 851
    invoke-direct {v0, v2}, Ll/ܿ᩹ۢ;->᩻(I)Z

    move-result v2

    if-eqz v2, :cond_b

    goto :goto_4

    :cond_9
    const/4 v5, 0x0

    goto :goto_4

    .line 847
    :cond_a
    :goto_3
    iget-object v2, v0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    iget-object v3, v0, Ll/ܿ᩹ۢ;->ۧ:Ll/֫᩹ۢ;

    if-ne v2, v3, :cond_b

    goto :goto_4

    :cond_b
    const/4 v5, 0x2

    .line 857
    :goto_4
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "$y"

    .line 0
    invoke-static {v9, v1, v15, v2, v5}, Ll/᩵ۢ֡;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    .line 857
    invoke-virtual {v4, v1}, Ll/ۖ᩹ۢ;->ۧ(Ljava/lang/String;)V

    goto/16 :goto_38

    :pswitch_11
    const/16 v2, 0x5c

    if-eq v1, v2, :cond_d

    .line 1017
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    const/16 v4, 0x2000

    if-le v2, v4, :cond_c

    .line 1019
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    goto/16 :goto_0

    .line 1022
    :cond_c
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 1023
    iget v1, v0, Ll/ܿ᩹ۢ;->ᩴ:I

    invoke-direct {v0, v1}, Ll/ܿ᩹ۢ;->ܽ(I)V

    goto/16 :goto_38

    .line 915
    :cond_d
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "$q"

    .line 917
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_f

    const-string v2, "$q\"p"

    .line 918
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    const-string v1, "\u001bP1$r64;1\"p\u001b\\"

    .line 921
    invoke-virtual {v4, v1}, Ll/ۖ᩹ۢ;->ۧ(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 2228
    :cond_e
    iput v3, v0, Ll/ܿ᩹ۢ;->ᩴ:I

    goto/16 :goto_0

    :cond_f
    const-string v2, "+q"

    .line 926
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 964
    invoke-virtual {v1, v14}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v15}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    array-length v2, v1

    const/4 v6, 0x0

    :goto_5
    if-ge v6, v2, :cond_0

    aget-object v7, v1, v6

    .line 965
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v9

    rem-int/2addr v9, v14

    if-nez v9, :cond_17

    .line 966
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v10, 0x0

    .line 967
    :goto_6
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v11

    if-ge v10, v11, :cond_10

    .line 968
    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "0x"

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v10}, Ljava/lang/String;->charAt(I)C

    move-result v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v12, ""

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v12, v10, 0x1

    invoke-virtual {v7, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    long-to-int v12, v11

    int-to-char v11, v12

    .line 969
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v10, v10, 0x2

    goto :goto_6

    .line 971
    :cond_10
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 973
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    move-result v10

    sparse-switch v10, :sswitch_data_0

    goto :goto_7

    :sswitch_0
    const-string v10, "name"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_11

    goto :goto_7

    :cond_11
    const/4 v10, 0x3

    goto :goto_8

    :sswitch_1
    const-string v10, "TN"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_12

    goto :goto_7

    :cond_12
    const/4 v10, 0x2

    goto :goto_8

    :sswitch_2
    const-string v10, "Co"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_13

    goto :goto_7

    :cond_13
    const/4 v10, 0x1

    goto :goto_8

    :sswitch_3
    const-string v10, "colors"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_14

    goto :goto_7

    :cond_14
    const/4 v10, 0x0

    goto :goto_8

    :goto_7
    const/4 v10, -0x1

    :goto_8
    packed-switch v10, :pswitch_data_3

    .line 983
    invoke-direct {v0, v5}, Ll/ܿ᩹ۢ;->᩻(I)Z

    move-result v10

    const/16 v11, 0x20

    .line 984
    invoke-direct {v0, v11}, Ll/ܿ᩹ۢ;->᩻(I)Z

    move-result v11

    .line 983
    invoke-static {v9, v10, v11}, Ll/᩺ܶۢ;->֫(Ljava/lang/String;ZZ)Ljava/lang/String;

    move-result-object v9

    goto :goto_9

    :pswitch_12
    const-string v9, "xterm"

    goto :goto_9

    :pswitch_13
    const-string v9, "256"

    :goto_9
    if-nez v9, :cond_15

    .line 997
    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "\u001bP0+r"

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ll/ۖ᩹ۢ;->ۧ(Ljava/lang/String;)V

    goto :goto_b

    .line 999
    :cond_15
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v11, 0x0

    .line 1000
    :goto_a
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v12

    if-ge v11, v12, :cond_16

    .line 1001
    invoke-virtual {v9, v11}, Ljava/lang/String;->charAt(I)C

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    new-array v13, v5, [Ljava/lang/Object;

    aput-object v12, v13, v3

    const-string v12, "%02X"

    invoke-static {v12, v13}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v11, v11, 0x1

    goto :goto_a

    .line 1003
    :cond_16
    new-instance v9, Ljava/lang/StringBuilder;

    const-string v11, "\u001bP1+r"

    invoke-direct {v9, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "="

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ll/ۖ᩹ۢ;->ۧ(Ljava/lang/String;)V

    :cond_17
    :goto_b
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_5

    :pswitch_14
    const/16 v2, 0x63

    if-eq v1, v2, :cond_18

    const/16 v2, 0x6d

    if-eq v1, v2, :cond_69

    .line 1293
    invoke-direct/range {p0 .. p1}, Ll/ܿ᩹ۢ;->ۢ(I)V

    goto/16 :goto_38

    :cond_18
    const-string v1, "\u001b[>41;320;0c"

    .line 1231
    invoke-virtual {v4, v1}, Ll/ۖ᩹ۢ;->ۧ(Ljava/lang/String;)V

    goto/16 :goto_38

    :pswitch_15
    const/16 v2, 0x5c

    if-eq v1, v2, :cond_19

    const/16 v2, 0x1b

    .line 1914
    invoke-direct {v0, v2}, Ll/ܿ᩹ۢ;->ۧ(I)V

    .line 1915
    invoke-direct/range {p0 .. p1}, Ll/ܿ᩹ۢ;->ۧ(I)V

    const/16 v1, 0xa

    .line 1916
    invoke-direct {v0, v1}, Ll/ܿ᩹ۢ;->ܽ(I)V

    goto/16 :goto_38

    .line 1909
    :cond_19
    invoke-direct {v0, v8}, Ll/ܿ᩹ۢ;->ۧ(Ljava/lang/String;)V

    goto/16 :goto_38

    .line 832
    :pswitch_16
    invoke-direct/range {p0 .. p1}, Ll/ܿ᩹ۢ;->ܿ(I)V

    goto/16 :goto_38

    :pswitch_17
    const/4 v4, 0x4

    .line 673
    invoke-direct {v0, v4}, Ll/ܿ᩹ۢ;->᩻(I)Z

    move-result v4

    if-eqz v4, :cond_1a

    .line 674
    iget v6, v0, Ll/ܿ᩹ۢ;->ܰ:I

    goto :goto_c

    :cond_1a
    const/4 v6, 0x0

    :goto_c
    if-eqz v4, :cond_1b

    .line 675
    iget v7, v0, Ll/ܿ᩹ۢ;->ܳ:I

    goto :goto_d

    :cond_1b
    iget v7, v0, Ll/ܿ᩹ۢ;->᩹:I

    :goto_d
    if-eqz v4, :cond_1c

    .line 676
    iget v8, v0, Ll/ܿ᩹ۢ;->֨:I

    goto :goto_e

    :cond_1c
    const/4 v8, 0x0

    :goto_e
    if-eqz v4, :cond_1d

    .line 677
    iget v4, v0, Ll/ܿ᩹ۢ;->᩸:I

    goto :goto_f

    :cond_1d
    iget v4, v0, Ll/ܿ᩹ۢ;->ۜ:I

    :goto_f
    const/4 v9, 0x5

    const/16 v10, 0x72

    if-eq v1, v10, :cond_2a

    const/16 v10, 0x74

    if-eq v1, v10, :cond_2b

    const/16 v2, 0x76

    if-eq v1, v2, :cond_29

    const/16 v2, 0x7b

    if-eq v1, v13, :cond_1e

    const/16 v9, 0x7a

    if-eq v1, v9, :cond_1e

    if-eq v1, v2, :cond_1e

    goto/16 :goto_0

    :cond_1e
    if-eq v1, v13, :cond_1f

    const/4 v9, 0x1

    goto :goto_10

    :cond_1f
    const/4 v9, 0x0

    :goto_10
    if-ne v1, v2, :cond_20

    const/4 v1, 0x1

    goto :goto_11

    :cond_20
    const/4 v1, 0x0

    :goto_11
    if-eqz v9, :cond_21

    if-eqz v1, :cond_21

    const/4 v2, 0x1

    goto :goto_12

    :cond_21
    const/4 v2, 0x0

    :goto_12
    if-eqz v9, :cond_22

    const/4 v3, 0x0

    const/16 v9, 0x20

    goto :goto_13

    :cond_22
    const/4 v9, -0x1

    .line 713
    invoke-direct {v0, v3, v9, v5}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v9

    const/4 v3, 0x1

    :goto_13
    const/16 v10, 0x20

    if-lt v9, v10, :cond_23

    if-le v9, v11, :cond_24

    :cond_23
    const/16 v10, 0xa0

    if-lt v9, v10, :cond_69

    const/16 v10, 0xff

    if-gt v9, v10, :cond_69

    :cond_24
    add-int/lit8 v10, v3, 0x1

    .line 719
    invoke-direct {v0, v3, v5, v5}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v11

    add-int/2addr v11, v6

    add-int/lit8 v12, v7, 0x1

    invoke-static {v11, v12}, Ljava/lang/Math;->min(II)I

    move-result v11

    add-int/lit8 v12, v3, 0x2

    .line 720
    invoke-direct {v0, v10, v5, v5}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v10

    add-int/2addr v10, v8

    add-int/lit8 v13, v4, 0x1

    invoke-static {v10, v13}, Ljava/lang/Math;->min(II)I

    move-result v10

    add-int/lit8 v3, v3, 0x3

    .line 721
    iget v13, v0, Ll/ܿ᩹ۢ;->᩹:I

    invoke-direct {v0, v12, v13, v5}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v12

    add-int/2addr v12, v6

    invoke-static {v12, v7}, Ljava/lang/Math;->min(II)I

    move-result v6

    .line 722
    iget v7, v0, Ll/ܿ᩹ۢ;->ۜ:I

    invoke-direct {v0, v3, v7, v5}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v3

    add-int/2addr v3, v8

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 723
    invoke-direct/range {p0 .. p0}, Ll/ܿ᩹ۢ;->ۘ()J

    move-result-wide v7

    sub-int/2addr v11, v5

    :goto_14
    if-ge v11, v6, :cond_69

    add-int/lit8 v4, v10, -0x1

    :goto_15
    if-ge v4, v3, :cond_28

    if-eqz v1, :cond_25

    .line 726
    iget-object v5, v0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    .line 409
    invoke-virtual {v5, v11}, Ll/֫᩹ۢ;->ۧ(I)I

    move-result v12

    invoke-virtual {v5, v12}, Ll/֫᩹ۢ;->֫(I)Ll/ᩴ᩹ۢ;

    move-result-object v5

    .line 263
    iget-object v5, v5, Ll/ᩴ᩹ۢ;->ܿ:[J

    aget-wide v12, v5, v4

    const-wide/16 v14, 0x7ff

    and-long/2addr v12, v14

    long-to-int v5, v12

    and-int/lit16 v5, v5, 0x80

    if-nez v5, :cond_27

    .line 727
    :cond_25
    iget-object v5, v0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    if-eqz v2, :cond_26

    .line 409
    invoke-virtual {v5, v11}, Ll/֫᩹ۢ;->ۧ(I)I

    move-result v12

    invoke-virtual {v5, v12}, Ll/֫᩹ۢ;->֫(I)Ll/ᩴ᩹ۢ;

    move-result-object v12

    .line 263
    iget-object v12, v12, Ll/ᩴ᩹ۢ;->ܿ:[J

    aget-wide v13, v12, v4

    move-wide/from16 v22, v13

    goto :goto_16

    :cond_26
    move-wide/from16 v22, v7

    :goto_16
    move-object/from16 v18, v5

    move/from16 v19, v4

    move/from16 v20, v11

    move/from16 v21, v9

    .line 727
    invoke-virtual/range {v18 .. v23}, Ll/֫᩹ۢ;->֫(IIIJ)V

    :cond_27
    add-int/lit8 v4, v4, 0x1

    goto :goto_15

    :cond_28
    add-int/lit8 v11, v11, 0x1

    goto :goto_14

    .line 689
    :cond_29
    invoke-direct {v0, v3, v5, v5}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v1

    sub-int/2addr v1, v5

    add-int/2addr v1, v6

    iget v2, v0, Ll/ܿ᩹ۢ;->᩹:I

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 690
    invoke-direct {v0, v5, v5, v5}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v2

    sub-int/2addr v2, v5

    add-int/2addr v2, v8

    iget v3, v0, Ll/ܿ᩹ۢ;->ۜ:I

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 692
    iget v3, v0, Ll/ܿ᩹ۢ;->᩹:I

    invoke-direct {v0, v14, v3, v5}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v3

    add-int/2addr v3, v6

    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v3

    iget v4, v0, Ll/ܿ᩹ۢ;->᩹:I

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 693
    iget v4, v0, Ll/ܿ᩹ۢ;->ۜ:I

    const/4 v7, 0x3

    invoke-direct {v0, v7, v4, v5}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v4

    add-int/2addr v4, v8

    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    move-result v4

    iget v7, v0, Ll/ܿ᩹ۢ;->ۜ:I

    invoke-static {v4, v7}, Ljava/lang/Math;->min(II)I

    move-result v4

    .line 695
    invoke-direct {v0, v9, v5, v5}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v7

    sub-int/2addr v7, v5

    add-int/2addr v7, v6

    iget v6, v0, Ll/ܿ᩹ۢ;->᩹:I

    invoke-static {v7, v6}, Ljava/lang/Math;->min(II)I

    move-result v21

    const/4 v6, 0x6

    .line 696
    invoke-direct {v0, v6, v5, v5}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v6

    sub-int/2addr v6, v5

    add-int/2addr v6, v8

    iget v5, v0, Ll/ܿ᩹ۢ;->ۜ:I

    invoke-static {v6, v5}, Ljava/lang/Math;->min(II)I

    move-result v20

    .line 698
    iget v5, v0, Ll/ܿ᩹ۢ;->᩹:I

    sub-int v5, v5, v21

    sub-int/2addr v3, v1

    invoke-static {v5, v3}, Ljava/lang/Math;->min(II)I

    move-result v19

    .line 699
    iget v3, v0, Ll/ܿ᩹ۢ;->ۜ:I

    sub-int v3, v3, v20

    sub-int/2addr v4, v2

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v18

    .line 700
    iget-object v15, v0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    move/from16 v16, v2

    move/from16 v17, v1

    invoke-virtual/range {v15 .. v21}, Ll/֫᩹ۢ;->֫(IIIIII)V

    goto/16 :goto_38

    :cond_2a
    const/16 v10, 0x74

    :cond_2b
    if-ne v1, v10, :cond_2c

    const/4 v1, 0x1

    goto :goto_17

    :cond_2c
    const/4 v1, 0x0

    .line 736
    :goto_17
    invoke-direct {v0, v3, v5, v5}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v10

    sub-int/2addr v10, v5

    invoke-static {v10, v7}, Ljava/lang/Math;->min(II)I

    move-result v10

    add-int/2addr v10, v6

    .line 737
    invoke-direct {v0, v5, v5, v5}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v11

    sub-int/2addr v11, v5

    invoke-static {v11, v4}, Ljava/lang/Math;->min(II)I

    move-result v11

    add-int/2addr v11, v8

    .line 738
    iget v12, v0, Ll/ܿ᩹ۢ;->᩹:I

    invoke-direct {v0, v14, v12, v5}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v12

    add-int/2addr v12, v5

    sub-int/2addr v7, v5

    invoke-static {v12, v7}, Ljava/lang/Math;->min(II)I

    move-result v7

    add-int/2addr v7, v6

    .line 739
    iget v6, v0, Ll/ܿ᩹ۢ;->ۜ:I

    const/4 v12, 0x3

    invoke-direct {v0, v12, v6, v5}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v6

    add-int/2addr v6, v5

    add-int/lit8 v12, v4, -0x1

    invoke-static {v6, v12}, Ljava/lang/Math;->min(II)I

    move-result v6

    add-int/2addr v6, v8

    .line 740
    iget v12, v0, Ll/ܿ᩹ۢ;->ܽ:I

    const/4 v13, 0x4

    if-lt v12, v13, :cond_69

    .line 741
    array-length v13, v2

    if-lt v12, v13, :cond_2d

    array-length v2, v2

    sub-int/2addr v2, v5

    iput v2, v0, Ll/ܿ᩹ۢ;->ܽ:I

    :cond_2d
    const/4 v2, 0x4

    .line 742
    :goto_18
    iget v12, v0, Ll/ܿ᩹ۢ;->ܽ:I

    if-gt v2, v12, :cond_69

    .line 745
    invoke-direct {v0, v2, v3, v3}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v3

    if-eqz v3, :cond_36

    if-eq v3, v5, :cond_35

    const/4 v5, 0x4

    if-eq v3, v5, :cond_34

    if-eq v3, v9, :cond_33

    const/4 v5, 0x7

    const/16 v9, 0x10

    if-eq v3, v5, :cond_32

    const/16 v5, 0x16

    if-eq v3, v5, :cond_31

    const/16 v5, 0x1b

    if-eq v3, v5, :cond_30

    const/16 v5, 0x18

    if-eq v3, v5, :cond_2f

    const/16 v5, 0x19

    if-eq v3, v5, :cond_2e

    const/4 v3, 0x1

    const/4 v9, 0x0

    goto :goto_1d

    :cond_2e
    const/4 v3, 0x0

    goto :goto_19

    :cond_2f
    const/4 v3, 0x0

    goto :goto_1a

    :cond_30
    const/4 v3, 0x0

    goto :goto_1d

    :cond_31
    const/4 v3, 0x0

    goto :goto_1b

    :cond_32
    const/4 v3, 0x1

    goto :goto_1d

    :cond_33
    const/4 v3, 0x1

    :goto_19
    const/16 v9, 0x8

    goto :goto_1d

    :cond_34
    const/4 v3, 0x1

    :goto_1a
    const/4 v9, 0x4

    goto :goto_1d

    :cond_35
    const/4 v3, 0x1

    :goto_1b
    const/4 v9, 0x1

    goto :goto_1d

    :cond_36
    if-nez v1, :cond_37

    const/4 v3, 0x0

    goto :goto_1c

    :cond_37
    const/4 v3, 0x1

    :goto_1c
    const/16 v9, 0x1d

    :goto_1d
    if-eqz v1, :cond_38

    if-nez v3, :cond_38

    move/from16 v18, v4

    move/from16 p1, v6

    move/from16 v23, v7

    move/from16 v22, v8

    goto/16 :goto_24

    .line 783
    :cond_38
    iget-object v5, v0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    const/16 v12, 0x1000

    invoke-direct {v0, v12}, Ll/ܿ᩹ۢ;->᩻(I)Z

    move-result v12

    move v13, v10

    :goto_1e
    if-ge v13, v7, :cond_40

    .line 418
    iget-object v14, v5, Ll/֫᩹ۢ;->ܽ:[Ll/ᩴ᩹ۢ;

    invoke-virtual {v5, v13}, Ll/֫᩹ۢ;->ۧ(I)I

    move-result v15

    aget-object v14, v14, v15

    if-nez v12, :cond_3a

    if-ne v13, v10, :cond_39

    goto :goto_1f

    :cond_39
    move v15, v8

    goto :goto_20

    :cond_3a
    :goto_1f
    move v15, v11

    :goto_20
    if-nez v12, :cond_3c

    move/from16 v18, v4

    add-int/lit8 v4, v13, 0x1

    if-ne v4, v7, :cond_3b

    goto :goto_21

    :cond_3b
    move/from16 v4, v18

    goto :goto_22

    :cond_3c
    move/from16 v18, v4

    :goto_21
    move v4, v6

    :goto_22
    if-ge v15, v4, :cond_3f

    move/from16 v19, v4

    .line 263
    iget-object v4, v14, Ll/ᩴ᩹ۢ;->ܿ:[J

    aget-wide v20, v4, v15

    .line 423
    invoke-static/range {v20 .. v21}, Ll/᩻᩶ۢ;->ۧ(J)I

    move-result v4

    move/from16 p1, v6

    .line 424
    invoke-static/range {v20 .. v21}, Ll/᩻᩶ۢ;->֫(J)I

    move-result v6

    move/from16 v23, v7

    move/from16 v22, v8

    const-wide/16 v16, 0x7ff

    and-long v7, v20, v16

    long-to-int v8, v7

    if-eqz v1, :cond_3d

    not-int v7, v9

    and-int/2addr v7, v8

    not-int v8, v8

    and-int/2addr v8, v9

    or-int/2addr v7, v8

    goto :goto_23

    :cond_3d
    if-eqz v3, :cond_3e

    or-int v7, v8, v9

    goto :goto_23

    :cond_3e
    not-int v7, v9

    and-int/2addr v7, v8

    .line 434
    :goto_23
    iget-object v8, v14, Ll/ᩴ᩹ۢ;->ܿ:[J

    invoke-static {v4, v6, v7}, Ll/᩻᩶ۢ;->֫(III)J

    move-result-wide v6

    aput-wide v6, v8, v15

    add-int/lit8 v15, v15, 0x1

    move/from16 v6, p1

    move/from16 v4, v19

    move/from16 v8, v22

    move/from16 v7, v23

    goto :goto_22

    :cond_3f
    move/from16 p1, v6

    move/from16 v23, v7

    move/from16 v22, v8

    add-int/lit8 v13, v13, 0x1

    move/from16 v4, v18

    goto :goto_1e

    :cond_40
    move/from16 v18, v4

    move/from16 p1, v6

    move/from16 v23, v7

    move/from16 v22, v8

    .line 783
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_24
    add-int/lit8 v2, v2, 0x1

    const/4 v3, 0x0

    const/4 v5, 0x1

    const/4 v9, 0x5

    move/from16 v6, p1

    move/from16 v4, v18

    move/from16 v8, v22

    move/from16 v7, v23

    goto/16 :goto_18

    :pswitch_18
    const/4 v3, 0x1

    const/16 v5, 0x24

    if-eq v1, v5, :cond_56

    const/16 v5, 0x68

    if-eq v1, v5, :cond_53

    const/16 v6, 0x6c

    if-eq v1, v6, :cond_53

    const/16 v5, 0x6e

    if-eq v1, v5, :cond_51

    const/16 v4, 0x4a

    const/16 v5, 0x4b

    if-eq v1, v4, :cond_46

    if-eq v1, v5, :cond_46

    const/16 v3, 0x73

    const/16 v4, 0x72

    if-eq v1, v4, :cond_41

    if-eq v1, v3, :cond_41

    .line 1117
    invoke-direct/range {p0 .. p1}, Ll/ܿ᩹ۢ;->ۢ(I)V

    goto/16 :goto_38

    .line 1098
    :cond_41
    iget v4, v0, Ll/ܿ᩹ۢ;->ܽ:I

    array-length v5, v2

    if-lt v4, v5, :cond_42

    array-length v4, v2

    add-int/lit8 v4, v4, -0x1

    iput v4, v0, Ll/ܿ᩹ۢ;->ܽ:I

    :cond_42
    const/4 v4, 0x0

    .line 1099
    :goto_25
    iget v5, v0, Ll/ܿ᩹ۢ;->ܽ:I

    if-gt v4, v5, :cond_69

    .line 1100
    aget v5, v2, v4

    .line 1101
    invoke-static {v5}, Ll/ܿ᩹ۢ;->ۜ(I)I

    move-result v6

    const/4 v7, -0x1

    if-ne v6, v7, :cond_43

    goto :goto_27

    :cond_43
    if-ne v1, v3, :cond_44

    .line 1106
    iget v5, v0, Ll/ܿ᩹ۢ;->᩶:I

    or-int/2addr v5, v6

    iput v5, v0, Ll/ܿ᩹ۢ;->᩶:I

    goto :goto_27

    .line 1108
    :cond_44
    iget v7, v0, Ll/ܿ᩹ۢ;->᩶:I

    and-int/2addr v6, v7

    if-eqz v6, :cond_45

    const/4 v6, 0x1

    goto :goto_26

    :cond_45
    const/4 v6, 0x0

    :goto_26
    invoke-virtual {v0, v5, v6}, Ll/ܿ᩹ۢ;->֫(IZ)V

    :goto_27
    add-int/lit8 v4, v4, 0x1

    goto :goto_25

    :cond_46
    const/4 v2, 0x0

    .line 1041
    iput-boolean v2, v0, Ll/ܿ᩹ۢ;->֫:Z

    if-ne v1, v5, :cond_47

    goto :goto_28

    :cond_47
    const/4 v3, 0x0

    :goto_28
    const/4 v1, 0x1

    .line 2158
    invoke-direct {v0, v2, v2, v1}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v4

    if-eqz v4, :cond_4d

    if-eq v4, v1, :cond_4b

    if-eq v4, v14, :cond_48

    .line 2228
    iput v2, v0, Ll/ܿ᩹ۢ;->ᩴ:I

    const/4 v1, -0x1

    const/4 v2, -0x1

    const/4 v3, -0x1

    const/4 v4, -0x1

    goto :goto_2e

    :cond_48
    if-eqz v3, :cond_49

    .line 1063
    iget v2, v0, Ll/ܿ᩹ۢ;->ܺ:I

    goto :goto_29

    :cond_49
    const/4 v2, 0x0

    .line 1064
    :goto_29
    iget v4, v0, Ll/ܿ᩹ۢ;->ۜ:I

    if-eqz v3, :cond_4a

    .line 1065
    iget v3, v0, Ll/ܿ᩹ۢ;->ܺ:I

    add-int/2addr v3, v1

    move v1, v3

    goto :goto_2a

    :cond_4a
    iget v1, v0, Ll/ܿ᩹ۢ;->᩹:I

    :goto_2a
    move v3, v2

    move v2, v4

    goto :goto_2c

    :cond_4b
    if-eqz v3, :cond_4c

    .line 1057
    iget v2, v0, Ll/ܿ᩹ۢ;->ܺ:I

    goto :goto_2b

    :cond_4c
    const/4 v2, 0x0

    .line 1058
    :goto_2b
    iget v3, v0, Ll/ܿ᩹ۢ;->ۡ:I

    add-int/2addr v3, v1

    .line 1059
    iget v4, v0, Ll/ܿ᩹ۢ;->ܺ:I

    add-int/2addr v4, v1

    move v1, v4

    move/from16 v24, v3

    move v3, v2

    move/from16 v2, v24

    :goto_2c
    const/4 v4, 0x0

    goto :goto_2e

    .line 1050
    :cond_4d
    iget v4, v0, Ll/ܿ᩹ۢ;->ۡ:I

    .line 1051
    iget v1, v0, Ll/ܿ᩹ۢ;->ܺ:I

    .line 1052
    iget v2, v0, Ll/ܿ᩹ۢ;->ۜ:I

    if-eqz v3, :cond_4e

    add-int/lit8 v3, v1, 0x1

    goto :goto_2d

    .line 1053
    :cond_4e
    iget v3, v0, Ll/ܿ᩹ۢ;->᩹:I

    :goto_2d
    move/from16 v24, v3

    move v3, v1

    move/from16 v1, v24

    .line 1071
    :goto_2e
    invoke-direct/range {p0 .. p0}, Ll/ܿ᩹ۢ;->ۘ()J

    move-result-wide v11

    :goto_2f
    if-ge v3, v1, :cond_69

    move v13, v4

    :goto_30
    if-ge v13, v2, :cond_50

    .line 1074
    iget-object v5, v0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    .line 409
    invoke-virtual {v5, v3}, Ll/֫᩹ۢ;->ۧ(I)I

    move-result v6

    invoke-virtual {v5, v6}, Ll/֫᩹ۢ;->֫(I)Ll/ᩴ᩹ۢ;

    move-result-object v5

    .line 263
    iget-object v5, v5, Ll/ᩴ᩹ۢ;->ܿ:[J

    aget-wide v6, v5, v13

    const-wide/16 v14, 0x7ff

    and-long v5, v6, v14

    long-to-int v6, v5

    and-int/lit16 v5, v6, 0x80

    if-nez v5, :cond_4f

    .line 1075
    iget-object v5, v0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    const/16 v8, 0x20

    move v6, v13

    move v7, v3

    move-wide v9, v11

    invoke-virtual/range {v5 .. v10}, Ll/֫᩹ۢ;->֫(IIIJ)V

    :cond_4f
    add-int/lit8 v13, v13, 0x1

    goto :goto_30

    :cond_50
    const-wide/16 v14, 0x7ff

    add-int/lit8 v3, v3, 0x1

    goto :goto_2f

    :cond_51
    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, -0x1

    .line 2158
    invoke-direct {v0, v1, v3, v2}, Ll/ܿ᩹ۢ;->֫(IIZ)I

    move-result v3

    const/4 v5, 0x6

    if-eq v3, v5, :cond_52

    goto :goto_36

    .line 1089
    :cond_52
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    iget v1, v0, Ll/ܿ᩹ۢ;->ܺ:I

    add-int/2addr v1, v2

    iget v3, v0, Ll/ܿ᩹ۢ;->ۡ:I

    add-int/2addr v3, v2

    const-string v2, ";1R"

    .line 0
    invoke-static {v9, v1, v15, v2, v3}, Ll/᩵ۢ֡;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    .line 1089
    invoke-virtual {v4, v1}, Ll/ۖ᩹ۢ;->ۧ(Ljava/lang/String;)V

    goto/16 :goto_38

    .line 1081
    :cond_53
    iget v3, v0, Ll/ܿ᩹ۢ;->ܽ:I

    array-length v4, v2

    if-lt v3, v4, :cond_54

    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    iput v3, v0, Ll/ܿ᩹ۢ;->ܽ:I

    :cond_54
    const/4 v3, 0x0

    .line 1082
    :goto_31
    iget v4, v0, Ll/ܿ᩹ۢ;->ܽ:I

    if-gt v3, v4, :cond_69

    if-ne v1, v5, :cond_55

    const/4 v4, 0x1

    goto :goto_32

    :cond_55
    const/4 v4, 0x0

    .line 1083
    :goto_32
    aget v6, v2, v3

    invoke-virtual {v0, v6, v4}, Ll/ܿ᩹ۢ;->֫(IZ)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_31

    :cond_56
    const/16 v1, 0xe

    .line 1114
    invoke-direct {v0, v1}, Ll/ܿ᩹ۢ;->ܽ(I)V

    goto/16 :goto_38

    .line 657
    :pswitch_19
    invoke-direct/range {p0 .. p1}, Ll/ܿ᩹ۢ;->ᩳ(I)V

    goto/16 :goto_38

    :pswitch_1a
    const/16 v2, 0x30

    if-ne v1, v2, :cond_57

    const/4 v1, 0x1

    goto :goto_33

    :cond_57
    const/4 v1, 0x0

    .line 654
    :goto_33
    iput-boolean v1, v0, Ll/ܿ᩹ۢ;->֫֫:Z

    goto/16 :goto_38

    :pswitch_1b
    const/16 v2, 0x30

    if-ne v1, v2, :cond_58

    const/4 v1, 0x1

    goto :goto_34

    :cond_58
    const/4 v1, 0x0

    .line 651
    :goto_34
    iput-boolean v1, v0, Ll/ܿ᩹ۢ;->۟:Z

    goto/16 :goto_38

    :pswitch_1c
    const/16 v2, 0x38

    if-eq v1, v2, :cond_59

    :goto_35
    const/4 v1, 0x0

    .line 2228
    :goto_36
    iput v1, v0, Ll/ܿ᩹ۢ;->ᩴ:I

    goto/16 :goto_38

    .line 1329
    :cond_59
    iget-object v2, v0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    iget v5, v0, Ll/ܿ᩹ۢ;->ۜ:I

    iget v6, v0, Ll/ܿ᩹ۢ;->᩹:I

    const/16 v7, 0x45

    invoke-direct/range {p0 .. p0}, Ll/ܿ᩹ۢ;->ۘ()J

    move-result-wide v8

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v2 .. v9}, Ll/֫᩹ۢ;->֫(IIIIIJ)V

    goto/16 :goto_38

    :pswitch_1d
    const/16 v2, 0x23

    if-eq v1, v2, :cond_68

    const/16 v2, 0x30

    if-eq v1, v2, :cond_69

    const/16 v2, 0x48

    if-eq v1, v2, :cond_67

    const/16 v2, 0x50

    if-eq v1, v2, :cond_66

    const/16 v2, 0x5b

    if-eq v1, v2, :cond_65

    const/16 v2, 0x5d

    if-eq v1, v2, :cond_64

    const/16 v2, 0x63

    if-eq v1, v2, :cond_63

    const/16 v2, 0x28

    if-eq v1, v2, :cond_62

    const/16 v2, 0x29

    if-eq v1, v2, :cond_61

    const/16 v2, 0x3d

    if-eq v1, v2, :cond_60

    const/16 v2, 0x3e

    if-eq v1, v2, :cond_5f

    const/16 v2, 0x4d

    if-eq v1, v2, :cond_5d

    const/16 v2, 0x4e

    if-eq v1, v2, :cond_69

    packed-switch v1, :pswitch_data_4

    packed-switch v1, :pswitch_data_5

    goto :goto_35

    .line 1367
    :pswitch_1e
    iget v1, v0, Ll/ܿ᩹ۢ;->ۡ:I

    iget v2, v0, Ll/ܿ᩹ۢ;->᩸:I

    add-int/lit8 v3, v2, -0x1

    if-ge v1, v3, :cond_5a

    add-int/lit8 v1, v1, 0x1

    .line 1368
    iput v1, v0, Ll/ܿ᩹ۢ;->ۡ:I

    goto/16 :goto_38

    .line 1370
    :cond_5a
    iget v1, v0, Ll/ܿ᩹ۢ;->ܳ:I

    iget v9, v0, Ll/ܿ᩹ۢ;->ܰ:I

    sub-int v14, v1, v9

    .line 1371
    iget-object v3, v0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    iget v8, v0, Ll/ܿ᩹ۢ;->֨:I

    add-int/lit8 v4, v8, 0x1

    sub-int/2addr v2, v8

    add-int/lit8 v6, v2, -0x1

    move v5, v9

    move v7, v14

    invoke-virtual/range {v3 .. v9}, Ll/֫᩹ۢ;->֫(IIIIII)V

    .line 1372
    iget-object v10, v0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    iget v1, v0, Ll/ܿ᩹ۢ;->᩸:I

    add-int/lit8 v11, v1, -0x1

    iget v12, v0, Ll/ܿ᩹ۢ;->ܰ:I

    iget v1, v0, Ll/ܿ᩹ۢ;->᩵:I

    iget v2, v0, Ll/ܿ᩹ۢ;->ܿ:I

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Ll/᩻᩶ۢ;->֫(III)J

    move-result-wide v16

    const/4 v13, 0x1

    const/16 v15, 0x20

    invoke-virtual/range {v10 .. v17}, Ll/֫᩹ۢ;->֫(IIIIIJ)V

    goto/16 :goto_38

    .line 1364
    :pswitch_1f
    invoke-direct/range {p0 .. p0}, Ll/ܿ᩹ۢ;->᩵()V

    goto/16 :goto_38

    .line 1361
    :pswitch_20
    invoke-direct/range {p0 .. p0}, Ll/ܿ᩹ۢ;->֡()V

    goto/16 :goto_38

    .line 1352
    :pswitch_21
    iget v1, v0, Ll/ܿ᩹ۢ;->ۡ:I

    iget v3, v0, Ll/ܿ᩹ۢ;->֨:I

    if-le v1, v3, :cond_5b

    add-int/lit8 v1, v1, -0x1

    .line 1353
    iput v1, v0, Ll/ܿ᩹ۢ;->ۡ:I

    goto/16 :goto_38

    .line 1355
    :cond_5b
    iget v1, v0, Ll/ܿ᩹ۢ;->ܳ:I

    iget v8, v0, Ll/ܿ᩹ۢ;->ܰ:I

    sub-int v13, v1, v8

    .line 1356
    iget-object v2, v0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    iget v1, v0, Ll/ܿ᩹ۢ;->᩸:I

    sub-int/2addr v1, v3

    add-int/lit8 v5, v1, -0x1

    add-int/lit8 v7, v3, 0x1

    move v4, v8

    move v6, v13

    invoke-virtual/range {v2 .. v8}, Ll/֫᩹ۢ;->֫(IIIIII)V

    .line 1357
    iget-object v9, v0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    iget v10, v0, Ll/ܿ᩹ۢ;->֨:I

    iget v11, v0, Ll/ܿ᩹ۢ;->ܰ:I

    iget v1, v0, Ll/ܿ᩹ۢ;->᩵:I

    iget v2, v0, Ll/ܿ᩹ۢ;->ܿ:I

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Ll/᩻᩶ۢ;->֫(III)J

    move-result-wide v15

    const/4 v12, 0x1

    const/16 v14, 0x20

    invoke-virtual/range {v9 .. v16}, Ll/֫᩹ۢ;->֫(IIIIIJ)V

    goto/16 :goto_38

    :pswitch_22
    const/4 v1, 0x0

    .line 1388
    iget v2, v0, Ll/ܿ᩹ۢ;->ܳ:I

    add-int/lit8 v2, v2, -0x1

    invoke-direct {v0, v1, v2}, Ll/ܿ᩹ۢ;->ܽ(II)V

    goto/16 :goto_38

    :pswitch_23
    const/4 v1, 0x4

    .line 1384
    invoke-direct {v0, v1}, Ll/ܿ᩹ۢ;->᩻(I)Z

    move-result v1

    if-eqz v1, :cond_5c

    iget v1, v0, Ll/ܿ᩹ۢ;->֨:I

    goto :goto_37

    :cond_5c
    const/4 v1, 0x0

    :goto_37
    invoke-direct {v0, v1}, Ll/ܿ᩹ۢ;->ۡ(I)V

    .line 1385
    invoke-direct/range {p0 .. p0}, Ll/ܿ᩹ۢ;->ۖ()V

    goto/16 :goto_38

    .line 1381
    :pswitch_24
    invoke-direct/range {p0 .. p0}, Ll/ܿ᩹ۢ;->ۖ()V

    goto/16 :goto_38

    .line 1396
    :cond_5d
    iget v1, v0, Ll/ܿ᩹ۢ;->ܺ:I

    iget v4, v0, Ll/ܿ᩹ۢ;->ܰ:I

    if-gt v1, v4, :cond_5e

    .line 1397
    iget-object v2, v0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    iget v5, v0, Ll/ܿ᩹ۢ;->ۜ:I

    iget v1, v0, Ll/ܿ᩹ۢ;->ܳ:I

    add-int/lit8 v8, v4, 0x1

    sub-int v6, v1, v8

    const/4 v7, 0x0

    const/4 v3, 0x0

    invoke-virtual/range {v2 .. v8}, Ll/֫᩹ۢ;->֫(IIIIII)V

    .line 1398
    iget v1, v0, Ll/ܿ᩹ۢ;->ܰ:I

    iget v2, v0, Ll/ܿ᩹ۢ;->ۜ:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 2069
    invoke-direct {v0, v4, v1, v2, v3}, Ll/ܿ᩹ۢ;->ۧ(IIII)V

    goto :goto_38

    :cond_5e
    add-int/lit8 v1, v1, -0x1

    .line 1400
    iput v1, v0, Ll/ܿ᩹ۢ;->ܺ:I

    goto :goto_38

    :cond_5f
    const/4 v1, 0x0

    const/16 v2, 0x20

    .line 1421
    invoke-direct {v0, v2, v1}, Ll/ܿ᩹ۢ;->ۧ(IZ)V

    goto :goto_38

    :cond_60
    const/4 v1, 0x1

    const/16 v2, 0x20

    .line 1414
    invoke-direct {v0, v2, v1}, Ll/ܿ᩹ۢ;->ۧ(IZ)V

    goto :goto_38

    :cond_61
    const/4 v1, 0x4

    .line 1349
    invoke-direct {v0, v1}, Ll/ܿ᩹ۢ;->ܽ(I)V

    goto :goto_38

    :cond_62
    const/4 v1, 0x3

    .line 1346
    invoke-direct {v0, v1}, Ll/ܿ᩹ۢ;->ܽ(I)V

    goto :goto_38

    :cond_63
    const/4 v1, 0x0

    .line 1376
    invoke-virtual/range {p0 .. p0}, Ll/ܿ᩹ۢ;->ܺ()V

    .line 1377
    iget v2, v0, Ll/ܿ᩹ۢ;->ۜ:I

    iget v3, v0, Ll/ܿ᩹ۢ;->᩹:I

    invoke-direct {v0, v1, v1, v2, v3}, Ll/ܿ᩹ۢ;->ۧ(IIII)V

    .line 1378
    invoke-direct {v0, v1, v1}, Ll/ܿ᩹ۢ;->ۧ(II)V

    goto :goto_38

    :cond_64
    const/4 v1, 0x0

    .line 1417
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    const/16 v1, 0xa

    .line 1418
    invoke-direct {v0, v1}, Ll/ܿ᩹ۢ;->ܽ(I)V

    goto :goto_38

    :cond_65
    const/4 v1, 0x6

    .line 1411
    invoke-direct {v0, v1}, Ll/ܿ᩹ۢ;->ܽ(I)V

    goto :goto_38

    :cond_66
    const/4 v1, 0x0

    .line 1407
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    const/16 v1, 0xd

    .line 1408
    invoke-direct {v0, v1}, Ll/ܿ᩹ۢ;->ܽ(I)V

    goto :goto_38

    .line 1391
    :cond_67
    iget-object v1, v0, Ll/ܿ᩹ۢ;->ۛ:[Z

    iget v2, v0, Ll/ܿ᩹ۢ;->ۡ:I

    const/4 v3, 0x1

    aput-boolean v3, v1, v2

    goto :goto_38

    .line 1343
    :cond_68
    invoke-direct {v0, v14}, Ll/ܿ᩹ۢ;->ܽ(I)V

    goto :goto_38

    :pswitch_25
    const/16 v2, 0x20

    if-lt v1, v2, :cond_69

    .line 642
    invoke-direct/range {p0 .. p1}, Ll/ܿ᩹ۢ;->ܳ(I)V

    .line 903
    :cond_69
    :goto_38
    :pswitch_26
    iget-boolean v1, v0, Ll/ܿ᩹ۢ;->᩷:Z

    if-nez v1, :cond_6e

    const/4 v1, 0x0

    iput v1, v0, Ll/ܿ᩹ۢ;->ᩴ:I

    return-void

    :cond_6a
    const/16 v3, 0xa

    .line 629
    iget v4, v0, Ll/ܿ᩹ۢ;->ᩴ:I

    const/16 v5, 0xd

    if-ne v4, v5, :cond_6b

    goto :goto_39

    :cond_6b
    if-eq v4, v3, :cond_6c

    const/4 v1, 0x1

    .line 1299
    iput v1, v0, Ll/ܿ᩹ۢ;->ᩴ:I

    const/4 v1, 0x0

    .line 1300
    iput v1, v0, Ll/ܿ᩹ۢ;->ܽ:I

    const/4 v1, -0x1

    .line 1301
    invoke-static {v2, v1}, Ljava/util/Arrays;->fill([II)V

    return-void

    .line 635
    :cond_6c
    invoke-direct/range {p0 .. p1}, Ll/ܿ᩹ۢ;->ܿ(I)V

    return-void

    :cond_6d
    const/4 v1, 0x0

    .line 621
    iget v2, v0, Ll/ܿ᩹ۢ;->ᩴ:I

    if-eqz v2, :cond_6e

    .line 623
    iput v1, v0, Ll/ܿ᩹ۢ;->ᩴ:I

    const/16 v1, 0x7f

    .line 624
    invoke-direct {v0, v1}, Ll/ܿ᩹ۢ;->ܳ(I)V

    :cond_6e
    :goto_39
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_25
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_0
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_26
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_11
        :pswitch_10
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_e
        :pswitch_e
        :pswitch_d
        :pswitch_d
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        -0x50c14290 -> :sswitch_3
        0x88c -> :sswitch_2
        0xa7a -> :sswitch_1
        0x337a8b -> :sswitch_0
    .end sparse-switch

    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_13
        :pswitch_13
        :pswitch_12
        :pswitch_12
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x36
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x44
        :pswitch_24
        :pswitch_23
        :pswitch_22
    .end packed-switch
.end method

.method public final ֫(II)V
    .locals 5

    .line 415
    iget v0, p0, Ll/ܿ᩹ۢ;->᩹:I

    if-ne v0, p2, :cond_0

    iget v1, p0, Ll/ܿ᩹ۢ;->ۜ:I

    if-ne v1, p1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x2

    if-lt p1, v1, :cond_5

    if-lt p2, v1, :cond_5

    const/4 v1, 0x0

    if-eq v0, p2, :cond_1

    .line 422
    iput p2, p0, Ll/ܿ᩹ۢ;->᩹:I

    .line 423
    iput v1, p0, Ll/ܿ᩹ۢ;->ܰ:I

    .line 424
    iput p2, p0, Ll/ܿ᩹ۢ;->ܳ:I

    .line 426
    :cond_1
    iget p2, p0, Ll/ܿ᩹ۢ;->ۜ:I

    if-eq p2, p1, :cond_4

    .line 428
    iput p1, p0, Ll/ܿ᩹ۢ;->ۜ:I

    .line 429
    iget-object v0, p0, Ll/ܿ᩹ۢ;->ۛ:[Z

    .line 430
    new-array v2, p1, [Z

    iput-object v2, p0, Ll/ܿ᩹ۢ;->ۛ:[Z

    const/4 v2, 0x0

    .line 488
    :goto_0
    iget v3, p0, Ll/ܿ᩹ۢ;->ۜ:I

    if-ge v2, v3, :cond_3

    .line 489
    iget-object v3, p0, Ll/ܿ᩹ۢ;->ۛ:[Z

    and-int/lit8 v4, v2, 0x7

    if-nez v4, :cond_2

    if-eqz v2, :cond_2

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    aput-boolean v4, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 432
    :cond_3
    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 433
    iget-object p2, p0, Ll/ܿ᩹ۢ;->ۛ:[Z

    invoke-static {v0, v1, p2, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 434
    iput v1, p0, Ll/ܿ᩹ۢ;->֨:I

    .line 435
    iget p1, p0, Ll/ܿ᩹ۢ;->ۜ:I

    iput p1, p0, Ll/ܿ᩹ۢ;->᩸:I

    .line 438
    :cond_4
    invoke-direct {p0}, Ll/ܿ᩹ۢ;->ᩴ()V

    return-void

    .line 418
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "rows="

    const-string v2, ", columns="

    .line 0
    invoke-static {v1, p2, p1, v2}, Ll/ᩳ᩷ᩳ;->֫(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 418
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(IZ)V
    .locals 10

    .line 1122
    invoke-static {p1}, Ll/ܿ᩹ۢ;->ۜ(I)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 1124
    invoke-direct {p0, v0, p2}, Ll/ܿ᩹ۢ;->ۧ(IZ)V

    :cond_0
    const/4 v0, 0x0

    sparse-switch p1, :sswitch_data_0

    packed-switch p1, :pswitch_data_0

    packed-switch p1, :pswitch_data_1

    packed-switch p1, :pswitch_data_2

    .line 2228
    iput v0, p0, Ll/ܿ᩹ۢ;->ᩴ:I

    return-void

    :sswitch_0
    if-nez p2, :cond_8

    .line 1161
    iput v0, p0, Ll/ܿ᩹ۢ;->֨:I

    .line 1162
    iget p1, p0, Ll/ܿ᩹ۢ;->ۜ:I

    iput p1, p0, Ll/ܿ᩹ۢ;->᩸:I

    return-void

    :pswitch_0
    if-eqz p2, :cond_8

    .line 1148
    invoke-direct {p0, v0, v0}, Ll/ܿ᩹ۢ;->ۧ(II)V

    return-void

    .line 1134
    :pswitch_1
    iput v0, p0, Ll/ܿ᩹ۢ;->ܰ:I

    iput v0, p0, Ll/ܿ᩹ۢ;->֨:I

    .line 1135
    iget p1, p0, Ll/ܿ᩹ۢ;->᩹:I

    iput p1, p0, Ll/ܿ᩹ۢ;->ܳ:I

    .line 1136
    iget p1, p0, Ll/ܿ᩹ۢ;->ۜ:I

    iput p1, p0, Ll/ܿ᩹ۢ;->᩸:I

    const/16 p1, 0x800

    .line 1138
    invoke-direct {p0, p1, v0}, Ll/ܿ᩹ۢ;->ۧ(IZ)V

    .line 1140
    iget p1, p0, Ll/ܿ᩹ۢ;->ۜ:I

    iget p2, p0, Ll/ܿ᩹ۢ;->᩹:I

    invoke-direct {p0, v0, v0, p1, p2}, Ll/ܿ᩹ۢ;->ۧ(IIII)V

    .line 1141
    invoke-direct {p0, v0, v0}, Ll/ܿ᩹ۢ;->ܽ(II)V

    return-void

    :pswitch_2
    if-eqz p2, :cond_1

    .line 1177
    invoke-direct {p0}, Ll/ܿ᩹ۢ;->֡()V

    return-void

    .line 1179
    :cond_1
    invoke-direct {p0}, Ll/ܿ᩹ۢ;->᩵()V

    return-void

    .line 1186
    :pswitch_3
    :sswitch_1
    iget-object p1, p0, Ll/ܿ᩹ۢ;->ۧ:Ll/֫᩹ۢ;

    if-eqz p2, :cond_2

    move-object v2, p1

    goto :goto_0

    :cond_2
    iget-object v1, p0, Ll/ܿ᩹ۢ;->۠:Ll/֫᩹ۢ;

    move-object v2, v1

    .line 1187
    :goto_0
    iget-object v1, p0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    if-eq v2, v1, :cond_8

    .line 1188
    iget v1, v2, Ll/֫᩹ۢ;->ۧ:I

    iget v3, p0, Ll/ܿ᩹ۢ;->ۜ:I

    if-ne v1, v3, :cond_3

    iget v1, v2, Ll/֫᩹ۢ;->ܿ:I

    iget v3, p0, Ll/ܿ᩹ۢ;->᩹:I

    if-eq v1, v3, :cond_4

    :cond_3
    const/4 v0, 0x1

    :cond_4
    if-eqz p2, :cond_5

    .line 1189
    invoke-direct {p0}, Ll/ܿ᩹ۢ;->֡()V

    .line 1190
    :cond_5
    iput-object v2, p0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    if-nez p2, :cond_6

    .line 1192
    iget-object p2, p0, Ll/ܿ᩹ۢ;->ۗ:Ll/ᩳ᩹ۢ;

    iget v1, p2, Ll/ᩳ᩹ۢ;->ۧ:I

    .line 1193
    iget p2, p2, Ll/ᩳ᩹ۢ;->ܽ:I

    .line 1194
    invoke-direct {p0}, Ll/ܿ᩹ۢ;->᩵()V

    if-eqz v0, :cond_6

    .line 1197
    iput v1, p0, Ll/ܿ᩹ۢ;->ۡ:I

    .line 1198
    iput p2, p0, Ll/ܿ᩹ۢ;->ܺ:I

    :cond_6
    if-eqz v0, :cond_7

    .line 1202
    invoke-direct {p0}, Ll/ܿ᩹ۢ;->ᩴ()V

    :cond_7
    if-ne v2, p1, :cond_8

    .line 1205
    iget v5, p0, Ll/ܿ᩹ۢ;->ۜ:I

    iget v6, p0, Ll/ܿ᩹ۢ;->᩹:I

    const/16 v7, 0x20

    invoke-direct {p0}, Ll/ܿ᩹ۢ;->ۘ()J

    move-result-wide v8

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v2 .. v9}, Ll/֫᩹ۢ;->֫(IIIIIJ)V

    :cond_8
    :pswitch_4
    :sswitch_2
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_2
        0xc -> :sswitch_2
        0x19 -> :sswitch_2
        0x28 -> :sswitch_2
        0x2d -> :sswitch_2
        0x2f -> :sswitch_1
        0x42 -> :sswitch_2
        0x45 -> :sswitch_0
        0x3f7 -> :sswitch_2
        0x40a -> :sswitch_2
        0x7d4 -> :sswitch_2
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_1
        :pswitch_4
        :pswitch_4
        :pswitch_0
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x3e8
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x417
        :pswitch_3
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public final ֫(I[B)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    .line 500
    aget-byte v1, p2, v0

    invoke-direct {p0, v1}, Ll/ܿ᩹ۢ;->֫(B)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 3

    const-string v0, "(\u001b|[\u0080-\u009f])"

    const-string v1, ""

    .line 2480
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "\r?\n"

    const-string v1, "\r"

    .line 2482
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2483
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x400

    .line 2488
    invoke-direct {p0, v0}, Ll/ܿ᩹ۢ;->᩻(I)Z

    move-result v0

    .line 2489
    iget-object v1, p0, Ll/ܿ᩹ۢ;->ۤ:Ll/ۖ᩹ۢ;

    if-eqz v0, :cond_1

    const-string v2, "\u001b[200~"

    invoke-virtual {v1, v2}, Ll/ۖ᩹ۢ;->ۧ(Ljava/lang/String;)V

    .line 2490
    :cond_1
    invoke-virtual {v1, p1}, Ll/ۖ᩹ۢ;->ۧ(Ljava/lang/String;)V

    if-eqz v0, :cond_2

    const-string p1, "\u001b[201~"

    .line 2491
    invoke-virtual {v1, p1}, Ll/ۖ᩹ۢ;->ۧ(Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final ۜ()Z
    .locals 1

    const/4 v0, 0x1

    .line 477
    invoke-direct {p0, v0}, Ll/ܿ᩹ۢ;->᩻(I)Z

    move-result v0

    return v0
.end method

.method public final ۡ()Z
    .locals 1

    const/16 v0, 0x10

    .line 469
    invoke-direct {p0, v0}, Ll/ܿ᩹ۢ;->᩻(I)Z

    move-result v0

    return v0
.end method

.method public final ۢ()Z
    .locals 1

    const/4 v0, 0x2

    .line 465
    invoke-direct {p0, v0}, Ll/ܿ᩹ۢ;->᩻(I)Z

    move-result v0

    return v0
.end method

.method public final ۧ()I
    .locals 1

    .line 454
    iget v0, p0, Ll/ܿ᩹ۢ;->ۡ:I

    return v0
.end method

.method public final ܳ()I
    .locals 1

    .line 2406
    iget v0, p0, Ll/ܿ᩹ۢ;->۫:I

    return v0
.end method

.method public final ܺ()V
    .locals 7

    const/4 v0, 0x0

    .line 2417
    iput v0, p0, Ll/ܿ᩹ۢ;->ۖ:I

    .line 2418
    iput v0, p0, Ll/ܿ᩹ۢ;->ܽ:I

    .line 2419
    iput-boolean v0, p0, Ll/ܿ᩹ۢ;->᩷:Z

    .line 2420
    iput v0, p0, Ll/ܿ᩹ۢ;->ᩴ:I

    .line 2421
    iput-boolean v0, p0, Ll/ܿ᩹ۢ;->֡:Z

    .line 2422
    iput v0, p0, Ll/ܿ᩹ۢ;->֨:I

    iput v0, p0, Ll/ܿ᩹ۢ;->ܰ:I

    .line 2423
    iget v1, p0, Ll/ܿ᩹ۢ;->᩹:I

    iput v1, p0, Ll/ܿ᩹ۢ;->ܳ:I

    .line 2424
    iget v1, p0, Ll/ܿ᩹ۢ;->ۜ:I

    iput v1, p0, Ll/ܿ᩹ۢ;->᩸:I

    .line 2425
    iput-boolean v0, p0, Ll/ܿ᩹ۢ;->֫:Z

    .line 2426
    iget-object v1, p0, Ll/ܿ᩹ۢ;->ۙ:Ll/ᩳ᩹ۢ;

    const/16 v2, 0x100

    iput v2, v1, Ll/ᩳ᩹ۢ;->ܳ:I

    iget-object v3, p0, Ll/ܿ᩹ۢ;->ۗ:Ll/ᩳ᩹ۢ;

    iput v2, v3, Ll/ᩳ᩹ۢ;->ܳ:I

    iput v2, p0, Ll/ܿ᩹ۢ;->᩵:I

    const/16 v2, 0x101

    .line 2427
    iput v2, v1, Ll/ᩳ᩹ۢ;->֫:I

    iput v2, v3, Ll/ᩳ᩹ۢ;->֫:I

    iput v2, p0, Ll/ܿ᩹ۢ;->ܿ:I

    const/4 v2, 0x0

    .line 488
    :goto_0
    iget v4, p0, Ll/ܿ᩹ۢ;->ۜ:I

    const/4 v5, 0x1

    if-ge v2, v4, :cond_1

    .line 489
    iget-object v4, p0, Ll/ܿ᩹ۢ;->ۛ:[Z

    and-int/lit8 v6, v2, 0x7

    if-nez v6, :cond_0

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    :goto_1
    aput-boolean v5, v4, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 2430
    :cond_1
    iput-boolean v0, p0, Ll/ܿ᩹ۢ;->֫֫:Z

    iput-boolean v0, p0, Ll/ܿ᩹ۢ;->۟:Z

    .line 2431
    iput-boolean v5, p0, Ll/ܿ᩹ۢ;->ۧ֫:Z

    .line 2433
    iput v0, v3, Ll/ᩳ᩹ۢ;->ᩳ:I

    iput v0, v3, Ll/ᩳ᩹ۢ;->ܿ:I

    iput v0, v3, Ll/ᩳ᩹ۢ;->ۧ:I

    iput v0, v3, Ll/ᩳ᩹ۢ;->ܽ:I

    .line 2434
    iput v0, v1, Ll/ᩳ᩹ۢ;->ᩳ:I

    iput v0, v1, Ll/ᩳ᩹ۢ;->ܿ:I

    iput v0, v1, Ll/ᩳ᩹ۢ;->ۧ:I

    iput v0, v1, Ll/ᩳ᩹ۢ;->ܽ:I

    .line 2435
    iput v0, p0, Ll/ܿ᩹ۢ;->ۢ:I

    const/16 v2, 0x8

    .line 2437
    invoke-direct {p0, v2, v5}, Ll/ܿ᩹ۢ;->ۧ(IZ)V

    const/16 v2, 0x10

    .line 2438
    invoke-direct {p0, v2, v5}, Ll/ܿ᩹ۢ;->ۧ(IZ)V

    .line 2439
    iget v2, p0, Ll/ܿ᩹ۢ;->ۢ:I

    iput v2, v1, Ll/ᩳ᩹ۢ;->ᩳ:I

    iput v2, v3, Ll/ᩳ᩹ۢ;->ᩳ:I

    iput v2, p0, Ll/ܿ᩹ۢ;->᩶:I

    .line 2442
    iput-byte v0, p0, Ll/ܿ᩹ۢ;->ܿ֫:B

    iput-byte v0, p0, Ll/ܿ᩹ۢ;->ܽ֫:B

    .line 2444
    iget-object v0, p0, Ll/ܿ᩹ۢ;->᩻:Ll/ܽ᩹ۢ;

    invoke-virtual {v0}, Ll/ܽ᩹ۢ;->֫()V

    .line 2445
    iget-object v0, p0, Ll/ܿ᩹ۢ;->ۤ:Ll/ۖ᩹ۢ;

    invoke-virtual {v0}, Ll/ۖ᩹ۢ;->ᩳ()V

    return-void
.end method

.method public final ܽ()I
    .locals 1

    .line 450
    iget v0, p0, Ll/ܿ᩹ۢ;->ܺ:I

    return v0
.end method

.method public final ܿ()Ll/֫᩹ۢ;
    .locals 1

    .line 383
    iget-object v0, p0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    return-object v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 461
    iget v0, p0, Ll/ܿ᩹ۢ;->ۖ:I

    return v0
.end method

.method public final ᩷()Z
    .locals 1

    const/16 v0, 0x20

    .line 473
    invoke-direct {p0, v0}, Ll/ܿ᩹ۢ;->᩻(I)Z

    move-result v0

    return v0
.end method

.method public final ᩻()Z
    .locals 2

    .line 387
    iget-object v0, p0, Ll/ܿ᩹ۢ;->۬:Ll/֫᩹ۢ;

    iget-object v1, p0, Ll/ܿ᩹ۢ;->ۧ:Ll/֫᩹ۢ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
