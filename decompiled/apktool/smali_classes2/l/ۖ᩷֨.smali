.class public abstract Ll/ۖ᩷֨;
.super Ll/ܿ᩷֨;
.source "P1SF"


# instance fields
.field public final ֡:[[I

.field public final ֨:[[I

.field public ۖ:I

.field public final ۗ:Ll/ۢ᩷֨;

.field public final ۘ:[I

.field public ۙ:I

.field public final ۚ:I

.field public final ۠:Ll/ܺ᩷֨;

.field public ۬:I

.field public final ܶ:Ll/ܰۜ֨;

.field public ᩴ:I

.field public ᩵:I

.field public final ᩶:Ll/ܶ᩷֨;

.field public final ᩸:Ll/ۢ᩷֨;

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ll/ܶ᩷֨;Ll/ܰۜ֨;IIII)V
    .locals 6

    .line 147
    invoke-direct {p0, p4}, Ll/ܿ᩷֨;-><init>(I)V

    const/4 v0, 0x0

    .line 52
    iput v0, p0, Ll/ۖ᩷֨;->᩵:I

    .line 53
    iput v0, p0, Ll/ۖ᩷֨;->ۖ:I

    const/4 v1, 0x2

    new-array v2, v1, [I

    const/4 v3, 0x1

    const/16 v4, 0x80

    aput v4, v2, v3

    const/4 v4, 0x4

    aput v4, v2, v0

    .line 57
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v5, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [[I

    iput-object v2, p0, Ll/ۖ᩷֨;->֨:[[I

    const/16 v2, 0x10

    new-array v2, v2, [I

    .line 59
    iput-object v2, p0, Ll/ۖ᩷֨;->ۘ:[I

    .line 61
    iput v0, p0, Ll/ۖ᩷֨;->ᩴ:I

    const/4 v2, -0x1

    .line 62
    iput v2, p0, Ll/ۖ᩷֨;->ۙ:I

    .line 63
    iput v0, p0, Ll/ۖ᩷֨;->۬:I

    .line 148
    iput-object p1, p0, Ll/ۖ᩷֨;->᩶:Ll/ܶ᩷֨;

    .line 149
    iput-object p2, p0, Ll/ۖ᩷֨;->ܶ:Ll/ܰۜ֨;

    .line 150
    iput p6, p0, Ll/ۖ᩷֨;->᩹:I

    .line 152
    new-instance p1, Ll/ܺ᩷֨;

    invoke-direct {p1, p0, p3}, Ll/ܺ᩷֨;-><init>(Ll/ۖ᩷֨;I)V

    iput-object p1, p0, Ll/ۖ᩷֨;->۠:Ll/ܺ᩷֨;

    .line 153
    new-instance p1, Ll/ۢ᩷֨;

    invoke-direct {p1, p0, p4, p6}, Ll/ۢ᩷֨;-><init>(Ll/ۖ᩷֨;II)V

    iput-object p1, p0, Ll/ۖ᩷֨;->᩸:Ll/ۢ᩷֨;

    .line 154
    new-instance p1, Ll/ۢ᩷֨;

    invoke-direct {p1, p0, p4, p6}, Ll/ۢ᩷֨;-><init>(Ll/ۖ᩷֨;II)V

    iput-object p1, p0, Ll/ۖ᩷֨;->ۗ:Ll/ۢ᩷֨;

    sub-int/2addr p5, v3

    .line 156
    invoke-static {p5}, Ll/ۖ᩷֨;->ۧ(I)I

    move-result p1

    add-int/2addr p1, v3

    iput p1, p0, Ll/ۖ᩷֨;->ۚ:I

    new-array p2, v1, [I

    aput p1, p2, v3

    aput v4, p2, v0

    .line 157
    invoke-static {v5, p2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [[I

    iput-object p1, p0, Ll/ۖ᩷֨;->֡:[[I

    .line 159
    invoke-virtual {p0}, Ll/ۖ᩷֨;->֫()V

    return-void
.end method

.method public static ֫(Ll/ܶ᩷֨;IIIIIIIILl/ۘ᩻֨;)Ll/ۖ᩷֨;
    .locals 12

    move v0, p3

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 100
    new-instance v0, Ll/ᩴ᩷֨;

    move-object v2, v0

    move-object v3, p0

    move v4, p1

    move v5, p2

    move/from16 v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move/from16 v9, p7

    move/from16 v10, p8

    move-object/from16 v11, p9

    invoke-direct/range {v2 .. v11}, Ll/ᩴ᩷֨;-><init>(Ll/ܶ᩷֨;IIIIIIILl/ۘ᩻֨;)V

    return-object v0

    .line 106
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 94
    :cond_1
    new-instance v0, Ll/ۘ᩷֨;

    move-object v1, v0

    move-object v2, p0

    move v3, p1

    move v4, p2

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Ll/ۘ᩷֨;-><init>(Ll/ܶ᩷֨;IIIIIIILl/ۘ᩻֨;)V

    return-object v0
.end method

.method public static synthetic ֫(Ll/ۖ᩷֨;)Ll/ܶ᩷֨;
    .locals 0

    .line 14
    iget-object p0, p0, Ll/ۖ᩷֨;->᩶:Ll/ܶ᩷֨;

    return-object p0
.end method

.method private ۢ()Z
    .locals 14

    .line 254
    iget v0, p0, Ll/ۖ᩷֨;->ۙ:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget-object v2, p0, Ll/ۖ᩷֨;->ܶ:Ll/ܰۜ֨;

    invoke-virtual {v2, v0}, Ll/ܰۜ֨;->ۧ(I)Z

    move-result v0

    const/4 v3, 0x0

    if-nez v0, :cond_0

    return v3

    .line 257
    :cond_0
    invoke-virtual {p0}, Ll/ۖ᩷֨;->ܿ()I

    move-result v0

    .line 260
    invoke-virtual {v2}, Ll/ܰۜ֨;->ܽ()I

    move-result v2

    iget v4, p0, Ll/ۖ᩷֨;->ۙ:I

    sub-int/2addr v2, v4

    iget v4, p0, Ll/ܿ᩷֨;->ۢ:I

    and-int/2addr v2, v4

    .line 262
    iget v4, p0, Ll/ۖ᩷֨;->ᩴ:I

    const/4 v5, -0x1

    iget-object v6, p0, Ll/ܿ᩷֨;->ᩳ:[[S

    iget-object v7, p0, Ll/ܿ᩷֨;->ܺ:Ll/֡᩷֨;

    iget-object v8, p0, Ll/ۖ᩷֨;->᩶:Ll/ܶ᩷֨;

    if-ne v4, v5, :cond_1

    .line 265
    invoke-virtual {v7}, Ll/֡᩷֨;->֫()I

    move-result v4

    aget-object v4, v6, v4

    invoke-virtual {v8, v4, v2, v3}, Ll/ܶ᩷֨;->֫([SII)V

    .line 266
    iget-object v2, p0, Ll/ۖ᩷֨;->۠:Ll/ܺ᩷֨;

    invoke-virtual {v2}, Ll/ܺ᩷֨;->֫()V

    goto/16 :goto_5

    .line 269
    :cond_1
    invoke-virtual {v7}, Ll/֡᩷֨;->֫()I

    move-result v4

    aget-object v4, v6, v4

    invoke-virtual {v8, v4, v2, v1}, Ll/ܶ᩷֨;->֫([SII)V

    .line 270
    iget v4, p0, Ll/ۖ᩷֨;->ᩴ:I

    iget-object v5, p0, Ll/ܿ᩷֨;->ۡ:[I

    const/4 v6, 0x2

    const/4 v9, 0x3

    iget-object v10, p0, Ll/ܿ᩷֨;->ܿ:[S

    const/4 v11, 0x4

    if-ge v4, v11, :cond_7

    .line 274
    invoke-virtual {v7}, Ll/֡᩷֨;->֫()I

    move-result v4

    invoke-virtual {v8, v10, v4, v1}, Ll/ܶ᩷֨;->֫([SII)V

    .line 275
    iget v4, p0, Ll/ۖ᩷֨;->ᩴ:I

    .line 325
    iget-object v10, p0, Ll/ܿ᩷֨;->ܳ:[S

    if-nez v4, :cond_3

    .line 326
    invoke-virtual {v7}, Ll/֡᩷֨;->֫()I

    move-result v4

    invoke-virtual {v8, v10, v4, v3}, Ll/ܶ᩷֨;->֫([SII)V

    .line 327
    iget-object v4, p0, Ll/ܿ᩷֨;->᩻:[[S

    invoke-virtual {v7}, Ll/֡᩷֨;->֫()I

    move-result v5

    aget-object v4, v4, v5

    if-ne v0, v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x1

    :goto_0
    invoke-virtual {v8, v4, v2, v3}, Ll/ܶ᩷֨;->֫([SII)V

    goto :goto_2

    .line 329
    :cond_3
    aget v11, v5, v4

    .line 330
    invoke-virtual {v7}, Ll/֡᩷֨;->֫()I

    move-result v12

    invoke-virtual {v8, v10, v12, v1}, Ll/ܶ᩷֨;->֫([SII)V

    .line 332
    iget-object v10, p0, Ll/ܿ᩷֨;->ۜ:[S

    if-ne v4, v1, :cond_4

    .line 333
    invoke-virtual {v7}, Ll/֡᩷֨;->֫()I

    move-result v4

    invoke-virtual {v8, v10, v4, v3}, Ll/ܶ᩷֨;->֫([SII)V

    goto :goto_1

    .line 335
    :cond_4
    invoke-virtual {v7}, Ll/֡᩷֨;->֫()I

    move-result v12

    invoke-virtual {v8, v10, v12, v1}, Ll/ܶ᩷֨;->֫([SII)V

    .line 336
    invoke-virtual {v7}, Ll/֡᩷֨;->֫()I

    move-result v10

    add-int/lit8 v12, v4, -0x2

    iget-object v13, p0, Ll/ܿ᩷֨;->᩷:[S

    invoke-virtual {v8, v13, v10, v12}, Ll/ܶ᩷֨;->֫([SII)V

    if-ne v4, v9, :cond_5

    .line 339
    aget v4, v5, v6

    aput v4, v5, v9

    .line 341
    :cond_5
    aget v4, v5, v1

    aput v4, v5, v6

    .line 344
    :goto_1
    aget v4, v5, v3

    aput v4, v5, v1

    .line 345
    aput v11, v5, v3

    :goto_2
    if-ne v0, v1, :cond_6

    .line 349
    invoke-virtual {v7}, Ll/֡᩷֨;->᩻()V

    goto/16 :goto_5

    .line 351
    :cond_6
    iget-object v3, p0, Ll/ۖ᩷֨;->ۗ:Ll/ۢ᩷֨;

    invoke-virtual {v3, v0, v2}, Ll/ۢ᩷֨;->֫(II)V

    .line 352
    invoke-virtual {v7}, Ll/֡᩷֨;->ܿ()V

    goto/16 :goto_5

    .line 279
    :cond_7
    invoke-virtual {v7}, Ll/֡᩷֨;->֫()I

    move-result v4

    invoke-virtual {v8, v10, v4, v3}, Ll/ܶ᩷֨;->֫([SII)V

    .line 280
    iget v4, p0, Ll/ۖ᩷֨;->ᩴ:I

    sub-int/2addr v4, v11

    .line 292
    invoke-virtual {v7}, Ll/֡᩷֨;->ܳ()V

    .line 293
    iget-object v7, p0, Ll/ۖ᩷֨;->᩸:Ll/ۢ᩷֨;

    invoke-virtual {v7, v0, v2}, Ll/ۢ᩷֨;->֫(II)V

    .line 295
    invoke-static {v4}, Ll/ۖ᩷֨;->ۧ(I)I

    move-result v2

    const/4 v7, 0x6

    if-ge v0, v7, :cond_8

    add-int/lit8 v7, v0, -0x2

    goto :goto_3

    :cond_8
    const/4 v7, 0x3

    .line 296
    :goto_3
    iget-object v10, p0, Ll/ܿ᩷֨;->ۧ:[[S

    aget-object v7, v10, v7

    invoke-virtual {v8, v7, v2}, Ll/ܶ᩷֨;->֫([SI)V

    if-lt v2, v11, :cond_c

    ushr-int/lit8 v7, v2, 0x1

    add-int/lit8 v10, v7, -0x1

    and-int/lit8 v12, v2, 0x1

    or-int/2addr v12, v6

    shl-int v10, v12, v10

    sub-int v10, v4, v10

    const/16 v12, 0xe

    if-ge v2, v12, :cond_a

    .line 304
    iget-object v7, p0, Ll/ܿ᩷֨;->ܽ:[[S

    sub-int/2addr v2, v11

    aget-object v2, v7, v2

    .line 155
    array-length v7, v2

    or-int/2addr v7, v10

    const/4 v10, 0x1

    :cond_9
    and-int/lit8 v11, v7, 0x1

    ushr-int/2addr v7, v1

    .line 160
    invoke-virtual {v8, v2, v10, v11}, Ll/ܶ᩷֨;->֫([SII)V

    shl-int/2addr v10, v1

    or-int/2addr v10, v11

    if-ne v7, v1, :cond_9

    goto :goto_4

    :cond_a
    ushr-int/lit8 v2, v10, 0x4

    add-int/lit8 v7, v7, -0x5

    .line 308
    invoke-virtual {v8, v2, v7}, Ll/ܶ᩷֨;->ۧ(II)V

    and-int/lit8 v2, v10, 0xf

    .line 155
    iget-object v7, p0, Ll/ܿ᩷֨;->֫:[S

    array-length v10, v7

    or-int/2addr v2, v10

    const/4 v10, 0x1

    :cond_b
    and-int/lit8 v11, v2, 0x1

    ushr-int/2addr v2, v1

    .line 160
    invoke-virtual {v8, v7, v10, v11}, Ll/ܶ᩷֨;->֫([SII)V

    shl-int/2addr v10, v1

    or-int/2addr v10, v11

    if-ne v2, v1, :cond_b

    .line 311
    iget v2, p0, Ll/ۖ᩷֨;->ۖ:I

    sub-int/2addr v2, v1

    iput v2, p0, Ll/ۖ᩷֨;->ۖ:I

    .line 315
    :cond_c
    :goto_4
    aget v2, v5, v6

    aput v2, v5, v9

    .line 316
    aget v2, v5, v1

    aput v2, v5, v6

    .line 317
    aget v2, v5, v3

    aput v2, v5, v1

    .line 318
    aput v4, v5, v3

    .line 320
    iget v2, p0, Ll/ۖ᩷֨;->᩵:I

    sub-int/2addr v2, v1

    iput v2, p0, Ll/ۖ᩷֨;->᩵:I

    .line 284
    :goto_5
    iget v2, p0, Ll/ۖ᩷֨;->ۙ:I

    sub-int/2addr v2, v0

    iput v2, p0, Ll/ۖ᩷֨;->ۙ:I

    .line 285
    iget v2, p0, Ll/ۖ᩷֨;->۬:I

    add-int/2addr v2, v0

    iput v2, p0, Ll/ۖ᩷֨;->۬:I

    return v1
.end method

.method public static ۧ(I)I
    .locals 2

    const/4 v0, 0x4

    if-gt p0, v0, :cond_0

    if-ltz p0, :cond_0

    return p0

    .line 122
    :cond_0
    invoke-static {p0}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result v0

    rsub-int/lit8 v1, v0, 0x1f

    shl-int/lit8 v1, v1, 0x1

    rsub-int/lit8 v0, v0, 0x1e

    ushr-int/2addr p0, v0

    and-int/lit8 p0, p0, 0x1

    add-int/2addr v1, p0

    return v1
.end method

.method private ᩷()Z
    .locals 4

    .line 234
    iget-object v0, p0, Ll/ۖ᩷֨;->ܶ:Ll/ܰۜ֨;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ܰۜ֨;->ۧ(I)Z

    move-result v0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    .line 240
    invoke-virtual {p0, v0}, Ll/ۖ᩷֨;->֫(I)V

    .line 241
    iget-object v2, p0, Ll/ܿ᩷֨;->ܺ:Ll/֡᩷֨;

    invoke-virtual {v2}, Ll/֡᩷֨;->֫()I

    move-result v2

    iget-object v3, p0, Ll/ܿ᩷֨;->ᩳ:[[S

    aget-object v2, v3, v2

    iget-object v3, p0, Ll/ۖ᩷֨;->᩶:Ll/ܶ᩷֨;

    invoke-virtual {v3, v2, v1, v1}, Ll/ܶ᩷֨;->֫([SII)V

    .line 242
    iget-object v1, p0, Ll/ۖ᩷֨;->۠:Ll/ܺ᩷֨;

    invoke-virtual {v1}, Ll/ܺ᩷֨;->ۧ()V

    .line 244
    iget v1, p0, Ll/ۖ᩷֨;->ۙ:I

    sub-int/2addr v1, v0

    iput v1, p0, Ll/ۖ᩷֨;->ۙ:I

    .line 247
    iget v1, p0, Ll/ۖ᩷֨;->۬:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/ۖ᩷֨;->۬:I

    return v0
.end method


# virtual methods
.method public final ֫(IIII)I
    .locals 1

    .line 419
    iget-object v0, p0, Ll/ۖ᩷֨;->᩸:Ll/ۢ᩷֨;

    .line 420
    invoke-virtual {v0, p3, p4}, Ll/ۢ᩷֨;->ۧ(II)I

    move-result p4

    add-int/2addr p1, p4

    const/4 p4, 0x6

    if-ge p3, p4, :cond_0

    add-int/lit8 p3, p3, -0x2

    goto :goto_0

    :cond_0
    const/4 p3, 0x3

    :goto_0
    const/16 p4, 0x80

    if-ge p2, p4, :cond_1

    .line 424
    iget-object p4, p0, Ll/ۖ᩷֨;->֨:[[I

    aget-object p3, p4, p3

    aget p2, p3, p2

    add-int/2addr p1, p2

    return p1

    .line 428
    :cond_1
    invoke-static {p2}, Ll/ۖ᩷֨;->ۧ(I)I

    move-result p4

    .line 429
    iget-object v0, p0, Ll/ۖ᩷֨;->֡:[[I

    aget-object p3, v0, p3

    aget p3, p3, p4

    and-int/lit8 p2, p2, 0xf

    iget-object p4, p0, Ll/ۖ᩷֨;->ۘ:[I

    aget p2, p4, p2

    add-int/2addr p3, p2

    add-int/2addr p3, p1

    return p3
.end method

.method public final ֫(IILl/֡᩷֨;I)I
    .locals 3

    const/4 v0, 0x0

    .line 392
    iget-object v1, p0, Ll/ܿ᩷֨;->ܳ:[S

    const/4 v2, 0x1

    if-nez p2, :cond_0

    .line 393
    invoke-virtual {p3}, Ll/֡᩷֨;->֫()I

    move-result p2

    aget-short p2, v1, p2

    invoke-static {p2, v0}, Ll/ܶ᩷֨;->ܽ(II)I

    move-result p2

    iget-object v0, p0, Ll/ܿ᩷֨;->᩻:[[S

    .line 395
    invoke-virtual {p3}, Ll/֡᩷֨;->֫()I

    move-result p3

    aget-object p3, v0, p3

    aget-short p3, p3, p4

    .line 394
    invoke-static {p3, v2}, Ll/ܶ᩷֨;->ܽ(II)I

    move-result p3

    add-int/2addr p3, p2

    add-int/2addr p3, p1

    return p3

    .line 397
    :cond_0
    invoke-virtual {p3}, Ll/֡᩷֨;->֫()I

    move-result p4

    aget-short p4, v1, p4

    invoke-static {p4, v2}, Ll/ܶ᩷֨;->ܽ(II)I

    move-result p4

    add-int/2addr p4, p1

    .line 399
    iget-object p1, p0, Ll/ܿ᩷֨;->ۜ:[S

    if-ne p2, v2, :cond_1

    .line 400
    invoke-virtual {p3}, Ll/֡᩷֨;->֫()I

    move-result p2

    aget-short p1, p1, p2

    invoke-static {p1, v0}, Ll/ܶ᩷֨;->ܽ(II)I

    move-result p1

    add-int/2addr p1, p4

    return p1

    .line 402
    :cond_1
    invoke-virtual {p3}, Ll/֡᩷֨;->֫()I

    move-result v0

    aget-short p1, p1, v0

    invoke-static {p1, v2}, Ll/ܶ᩷֨;->ܽ(II)I

    move-result p1

    iget-object v0, p0, Ll/ܿ᩷֨;->᩷:[S

    .line 403
    invoke-virtual {p3}, Ll/֡᩷֨;->֫()I

    move-result p3

    aget-short p3, v0, p3

    add-int/lit8 p2, p2, -0x2

    invoke-static {p3, p2}, Ll/ܶ᩷֨;->ܽ(II)I

    move-result p2

    add-int/2addr p2, p1

    add-int/2addr p2, p4

    return p2
.end method

.method public final ֫(ILl/֡᩷֨;I)I
    .locals 4

    .line 369
    iget-object v0, p0, Ll/ܿ᩷֨;->ᩳ:[[S

    invoke-virtual {p2}, Ll/֡᩷֨;->֫()I

    move-result v1

    aget-object v0, v0, v1

    aget-short v0, v0, p3

    const/4 v1, 0x1

    invoke-static {v0, v1}, Ll/ܶ᩷֨;->ܽ(II)I

    move-result v0

    .line 378
    iget-object v2, p0, Ll/ܿ᩷֨;->ܿ:[S

    .line 379
    invoke-virtual {p2}, Ll/֡᩷֨;->֫()I

    move-result v3

    aget-short v2, v2, v3

    invoke-static {v2, v1}, Ll/ܶ᩷֨;->ܽ(II)I

    move-result v1

    add-int/2addr v1, v0

    const/4 v0, 0x0

    .line 413
    invoke-virtual {p0, v1, v0, p2, p3}, Ll/ۖ᩷֨;->֫(IILl/֡᩷֨;I)I

    move-result p2

    .line 414
    iget-object v0, p0, Ll/ۖ᩷֨;->ۗ:Ll/ۢ᩷֨;

    invoke-virtual {v0, p1, p3}, Ll/ۢ᩷֨;->ۧ(II)I

    move-result p1

    add-int/2addr p2, p1

    return p2
.end method

.method public ֫()V
    .locals 2

    .line 168
    invoke-super {p0}, Ll/ܿ᩷֨;->֫()V

    .line 169
    iget-object v0, p0, Ll/ۖ᩷֨;->۠:Ll/ܺ᩷֨;

    invoke-virtual {v0}, Ll/ܺ᩷֨;->ܽ()V

    .line 170
    iget-object v0, p0, Ll/ۖ᩷֨;->᩸:Ll/ۢ᩷֨;

    invoke-virtual {v0}, Ll/ۢ᩷֨;->֫()V

    .line 171
    iget-object v0, p0, Ll/ۖ᩷֨;->ۗ:Ll/ۢ᩷֨;

    invoke-virtual {v0}, Ll/ۢ᩷֨;->֫()V

    const/4 v0, 0x0

    .line 172
    iput v0, p0, Ll/ۖ᩷֨;->᩵:I

    .line 173
    iput v0, p0, Ll/ۖ᩷֨;->ۖ:I

    .line 175
    iget v0, p0, Ll/ۖ᩷֨;->۬:I

    iget v1, p0, Ll/ۖ᩷֨;->ۙ:I

    add-int/lit8 v1, v1, 0x1

    add-int/2addr v1, v0

    iput v1, p0, Ll/ۖ᩷֨;->۬:I

    const/4 v0, -0x1

    .line 176
    iput v0, p0, Ll/ۖ᩷֨;->ۙ:I

    return-void
.end method

.method public final ֫(I)V
    .locals 1

    .line 364
    iget v0, p0, Ll/ۖ᩷֨;->ۙ:I

    add-int/2addr v0, p1

    iput v0, p0, Ll/ۖ᩷֨;->ۙ:I

    .line 365
    iget-object v0, p0, Ll/ۖ᩷֨;->ܶ:Ll/ܰۜ֨;

    invoke-virtual {v0, p1}, Ll/ܰۜ֨;->ᩳ(I)V

    return-void
.end method

.method public final ֫(Ll/ۘ᩻֨;)V
    .locals 1

    .line 110
    iget-object v0, p0, Ll/ۖ᩷֨;->ܶ:Ll/ܰۜ֨;

    invoke-virtual {v0, p1}, Ll/ܰۜ֨;->֫(Ll/ۘ᩻֨;)V

    return-void
.end method

.method public final ۜ()V
    .locals 16

    move-object/from16 v0, p0

    .line 495
    iget v1, v0, Ll/ۖ᩷֨;->᩵:I

    const/4 v2, 0x1

    if-gtz v1, :cond_7

    const/16 v1, 0x80

    .line 437
    iput v1, v0, Ll/ۖ᩷֨;->᩵:I

    const/4 v1, 0x0

    .line 439
    :goto_0
    iget-object v3, v0, Ll/ۖ᩷֨;->֨:[[I

    const/16 v4, 0xe

    iget-object v5, v0, Ll/ۖ᩷֨;->֡:[[I

    const/4 v6, 0x4

    if-ge v1, v6, :cond_3

    const/4 v7, 0x0

    .line 440
    :goto_1
    iget v8, v0, Ll/ۖ᩷֨;->ۚ:I

    if-ge v7, v8, :cond_0

    .line 441
    aget-object v8, v5, v1

    iget-object v9, v0, Ll/ܿ᩷֨;->ۧ:[[S

    aget-object v9, v9, v1

    .line 442
    invoke-static {v9, v7}, Ll/ܶ᩷֨;->ۧ([SI)I

    move-result v9

    aput v9, v8, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_0
    :goto_2
    if-ge v4, v8, :cond_1

    ushr-int/lit8 v7, v4, 0x1

    add-int/lit8 v7, v7, -0x5

    .line 448
    aget-object v9, v5, v1

    aget v10, v9, v4

    .line 449
    sget v11, Ll/ܶ᩷֨;->᩻:I

    shl-int/2addr v7, v6

    add-int/2addr v10, v7

    aput v10, v9, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_1
    const/4 v4, 0x0

    :goto_3
    if-ge v4, v6, :cond_2

    .line 453
    aget-object v7, v3, v1

    aget-object v8, v5, v1

    aget v8, v8, v4

    aput v8, v7, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    const/4 v1, 0x4

    const/4 v6, 0x4

    :goto_4
    if-ge v1, v4, :cond_7

    ushr-int/lit8 v4, v1, 0x1

    sub-int/2addr v4, v2

    and-int/lit8 v7, v1, 0x1

    or-int/lit8 v7, v7, 0x2

    shl-int v4, v7, v4

    add-int/lit8 v7, v1, -0x4

    .line 463
    iget-object v8, v0, Ll/ܿ᩷֨;->ܽ:[[S

    aget-object v9, v8, v7

    array-length v9, v9

    const/4 v10, 0x0

    :goto_5
    if-ge v10, v9, :cond_6

    sub-int v11, v6, v4

    .line 466
    aget-object v12, v8, v7

    sget v13, Ll/ܶ᩷֨;->᩻:I

    .line 168
    array-length v13, v12

    or-int/2addr v11, v13

    const/4 v13, 0x0

    const/4 v14, 0x1

    :cond_4
    and-int/lit8 v15, v11, 0x1

    ushr-int/2addr v11, v2

    .line 173
    aget-short v2, v12, v14

    invoke-static {v2, v15}, Ll/ܶ᩷֨;->ܽ(II)I

    move-result v2

    add-int/2addr v13, v2

    shl-int/lit8 v2, v14, 0x1

    or-int v14, v2, v15

    const/4 v2, 0x1

    if-ne v11, v2, :cond_4

    const/4 v2, 0x0

    const/4 v11, 0x4

    :goto_6
    if-ge v2, v11, :cond_5

    .line 471
    aget-object v12, v3, v2

    aget-object v14, v5, v2

    aget v14, v14, v1

    add-int/2addr v14, v13

    aput v14, v12, v6

    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_5
    add-int/lit8 v6, v6, 0x1

    add-int/lit8 v10, v10, 0x1

    const/4 v2, 0x1

    goto :goto_5

    :cond_6
    add-int/lit8 v1, v1, 0x1

    const/16 v4, 0xe

    const/4 v2, 0x1

    goto :goto_4

    .line 498
    :cond_7
    iget v1, v0, Ll/ۖ᩷֨;->ۖ:I

    if-gtz v1, :cond_9

    const/16 v1, 0x10

    .line 482
    iput v1, v0, Ll/ۖ᩷֨;->ۖ:I

    const/4 v2, 0x0

    :goto_7
    if-ge v2, v1, :cond_9

    .line 485
    sget v3, Ll/ܶ᩷֨;->᩻:I

    .line 168
    iget-object v3, v0, Ll/ܿ᩷֨;->֫:[S

    array-length v4, v3

    or-int/2addr v4, v2

    const/4 v5, 0x0

    const/4 v6, 0x1

    :cond_8
    and-int/lit8 v7, v4, 0x1

    const/4 v8, 0x1

    ushr-int/2addr v4, v8

    .line 173
    aget-short v9, v3, v6

    invoke-static {v9, v7}, Ll/ܶ᩷֨;->ܽ(II)I

    move-result v9

    add-int/2addr v5, v9

    shl-int/2addr v6, v8

    or-int/2addr v6, v7

    if-ne v4, v8, :cond_8

    .line 485
    iget-object v3, v0, Ll/ۖ᩷֨;->ۘ:[I

    aput v5, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    .line 501
    :cond_9
    iget-object v1, v0, Ll/ۖ᩷֨;->᩸:Ll/ۢ᩷֨;

    invoke-virtual {v1}, Ll/ۢ᩷֨;->ۧ()V

    .line 502
    iget-object v1, v0, Ll/ۖ᩷֨;->ۗ:Ll/ۢ᩷֨;

    invoke-virtual {v1}, Ll/ۢ᩷֨;->ۧ()V

    return-void
.end method

.method public final ۧ()Z
    .locals 2

    .line 218
    :try_start_0
    iget-object v0, p0, Ll/ۖ᩷֨;->ܶ:Ll/ܰۜ֨;

    invoke-virtual {v0}, Ll/ܰۜ֨;->ᩳ()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Ll/ۖ᩷֨;->᩷()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 221
    :cond_0
    iget v0, p0, Ll/ۖ᩷֨;->۬:I

    const v1, 0x1ffeef

    if-gt v0, v1, :cond_1

    iget-object v0, p0, Ll/ۖ᩷֨;->᩶:Ll/ܶ᩷֨;

    .line 222
    invoke-virtual {v0}, Ll/ܶ᩷֨;->ۧ()I

    move-result v0

    const v1, 0xffe6

    if-gt v0, v1, :cond_1

    .line 223
    invoke-direct {p0}, Ll/ۖ᩷֨;->ۢ()Z

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_0

    :goto_0
    const/4 v0, 0x0

    return v0

    :cond_1
    const/4 v0, 0x1

    return v0

    .line 226
    :catch_0
    new-instance v0, Ljava/lang/Error;

    invoke-direct {v0}, Ljava/lang/Error;-><init>()V

    throw v0
.end method

.method public final ܳ()I
    .locals 1

    .line 180
    iget v0, p0, Ll/ۖ᩷֨;->۬:I

    return v0
.end method

.method public final ܽ()Ll/ܰۜ֨;
    .locals 1

    .line 163
    iget-object v0, p0, Ll/ۖ᩷֨;->ܶ:Ll/ܰۜ֨;

    return-object v0
.end method

.method public abstract ܿ()I
.end method

.method public final ᩳ()Ll/֫᩷֨;
    .locals 1

    .line 357
    iget v0, p0, Ll/ۖ᩷֨;->ۙ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۖ᩷֨;->ۙ:I

    .line 358
    iget-object v0, p0, Ll/ۖ᩷֨;->ܶ:Ll/ܰۜ֨;

    invoke-virtual {v0}, Ll/ܰۜ֨;->ۧ()Ll/֫᩷֨;

    move-result-object v0

    return-object v0
.end method

.method public final ᩻()V
    .locals 1

    const/4 v0, 0x0

    .line 184
    iput v0, p0, Ll/ۖ᩷֨;->۬:I

    return-void
.end method
