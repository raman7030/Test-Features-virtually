.class public final Ll/ᩳۢܿ;
.super Ljava/lang/Object;
.source "N6ZQ"


# static fields
.field public static final ۜ:[J

.field public static final ۡ:[I

.field public static final ۢ:[J

.field public static final ᩷:[I


# instance fields
.field public final ֫:[I

.field public final ۧ:[Ll/ܶۜܿ;

.field public final ܳ:[I

.field public final ܽ:[I

.field public final ܿ:I

.field public final ᩳ:[J

.field public final ᩻:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x0

    new-array v1, v0, [J

    .line 15
    sput-object v1, Ll/ᩳۢܿ;->ۜ:[J

    const/4 v1, 0x1

    new-array v1, v1, [J

    const-wide/16 v2, 0x0

    aput-wide v2, v1, v0

    .line 16
    sput-object v1, Ll/ᩳۢܿ;->ۢ:[J

    .line 17
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Ll/ᩳۢܿ;->ۡ:[I

    const/4 v0, -0x1

    .line 18
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Ll/ᩳۢܿ;->᩷:[I

    return-void
.end method

.method public constructor <init>(II[I[I[I[Ll/ܶۜܿ;)V
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    .line 33
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    if-ltz v1, :cond_1a

    if-lez v2, :cond_19

    .line 37
    array-length v7, v3

    if-gt v2, v7, :cond_19

    array-length v7, v4

    if-gt v2, v7, :cond_19

    array-length v7, v5

    if-gt v2, v7, :cond_19

    array-length v7, v6

    if-gt v2, v7, :cond_19

    .line 41
    iput v1, v0, Ll/ᩳۢܿ;->᩻:I

    .line 42
    iput v2, v0, Ll/ᩳۢܿ;->ܿ:I

    .line 43
    iput-object v3, v0, Ll/ᩳۢܿ;->ܳ:[I

    .line 44
    iput-object v4, v0, Ll/ᩳۢܿ;->֫:[I

    .line 45
    iput-object v5, v0, Ll/ᩳۢܿ;->ܽ:[I

    .line 46
    iput-object v6, v0, Ll/ᩳۢܿ;->ۧ:[Ll/ܶۜܿ;

    const/4 v7, 0x0

    .line 253
    aget v8, v3, v7

    if-nez v8, :cond_18

    aget v8, v4, v7

    if-ne v8, v1, :cond_18

    aget v8, v5, v7

    const/4 v9, -0x1

    if-ne v8, v9, :cond_18

    aget-object v6, v6, v7

    if-eqz v6, :cond_18

    const/4 v6, 0x1

    const/4 v8, 0x1

    .line 257
    :goto_0
    iget v10, v0, Ll/ᩳۢܿ;->ܿ:I

    if-ge v8, v10, :cond_1

    .line 258
    aget v10, v3, v8

    .line 259
    aget v11, v4, v8

    .line 260
    aget v12, v5, v8

    if-ltz v10, :cond_0

    if-le v11, v10, :cond_0

    if-gt v11, v1, :cond_0

    if-ltz v12, :cond_0

    if-ge v12, v8, :cond_0

    .line 261
    aget v13, v3, v12

    if-lt v10, v13, :cond_0

    aget v10, v4, v12

    if-gt v11, v10, :cond_0

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 264
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid syntax context node: "

    .line 0
    invoke-static {v8, v2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 264
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    if-nez v1, :cond_2

    .line 49
    sget-object v1, Ll/ᩳۢܿ;->ۜ:[J

    iput-object v1, v0, Ll/ᩳۢܿ;->ᩳ:[J

    return-void

    :cond_2
    if-ne v2, v6, :cond_3

    .line 51
    sget-object v1, Ll/ᩳۢܿ;->ۢ:[J

    iput-object v1, v0, Ll/ᩳۢܿ;->ᩳ:[J

    return-void

    .line 271
    :cond_3
    iget v1, v0, Ll/ᩳۢܿ;->᩻:I

    .line 280
    iget-object v2, v0, Ll/ᩳۢܿ;->ܳ:[I

    iget-object v3, v0, Ll/ᩳۢܿ;->ܽ:[I

    iget-object v4, v0, Ll/ᩳۢܿ;->֫:[I

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    :goto_1
    if-ge v5, v10, :cond_9

    .line 284
    aget v12, v3, v5

    :goto_2
    if-eq v6, v12, :cond_6

    if-eqz v6, :cond_d

    .line 286
    aget v13, v4, v6

    if-ge v13, v8, :cond_4

    goto :goto_4

    :cond_4
    if-le v13, v8, :cond_5

    .line 287
    invoke-static {v11}, Ll/ᩳۢܿ;->ܺ(I)I

    move-result v8

    move v11, v8

    .line 288
    :cond_5
    aget v8, v4, v6

    .line 289
    aget v6, v3, v6

    goto :goto_2

    .line 291
    :cond_6
    aget v6, v2, v5

    if-ge v6, v8, :cond_7

    goto :goto_4

    :cond_7
    if-le v6, v8, :cond_8

    .line 292
    invoke-static {v11}, Ll/ᩳۢܿ;->ܺ(I)I

    move-result v6

    move v11, v6

    .line 293
    :cond_8
    aget v8, v2, v5

    add-int/lit8 v6, v5, 0x1

    move/from16 v16, v6

    move v6, v5

    move/from16 v5, v16

    goto :goto_1

    :cond_9
    :goto_3
    if-ltz v6, :cond_c

    .line 297
    aget v5, v4, v6

    if-ge v5, v8, :cond_a

    goto :goto_4

    :cond_a
    if-le v5, v8, :cond_b

    .line 298
    invoke-static {v11}, Ll/ᩳۢܿ;->ܺ(I)I

    move-result v5

    move v11, v5

    .line 299
    :cond_b
    aget v8, v4, v6

    .line 300
    aget v6, v3, v6

    goto :goto_3

    :cond_c
    if-ne v8, v1, :cond_d

    move v9, v11

    :cond_d
    :goto_4
    if-ltz v9, :cond_15

    .line 307
    new-array v5, v9, [J

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    :goto_5
    if-ge v6, v10, :cond_11

    .line 312
    aget v12, v3, v6

    :goto_6
    if-eq v7, v12, :cond_f

    .line 314
    aget v13, v4, v7

    if-le v13, v8, :cond_e

    add-int/lit8 v13, v11, 0x1

    .line 315
    invoke-static {v8, v7}, Ll/ᩳۢܿ;->ᩳ(II)J

    move-result-wide v14

    aput-wide v14, v5, v11

    move v11, v13

    .line 317
    :cond_e
    aget v8, v4, v7

    .line 318
    aget v7, v3, v7

    goto :goto_6

    .line 320
    :cond_f
    aget v12, v2, v6

    if-le v12, v8, :cond_10

    add-int/lit8 v12, v11, 0x1

    .line 321
    invoke-static {v8, v7}, Ll/ᩳۢܿ;->ᩳ(II)J

    move-result-wide v7

    aput-wide v7, v5, v11

    move v11, v12

    .line 323
    :cond_10
    aget v8, v2, v6

    add-int/lit8 v7, v6, 0x1

    move/from16 v16, v7

    move v7, v6

    move/from16 v6, v16

    goto :goto_5

    :cond_11
    :goto_7
    if-ltz v7, :cond_13

    .line 327
    aget v2, v4, v7

    if-le v2, v8, :cond_12

    add-int/lit8 v2, v11, 0x1

    .line 328
    invoke-static {v8, v7}, Ll/ᩳۢܿ;->ᩳ(II)J

    move-result-wide v12

    aput-wide v12, v5, v11

    move v11, v2

    .line 330
    :cond_12
    aget v8, v4, v7

    .line 331
    aget v7, v3, v7

    goto :goto_7

    :cond_13
    if-ne v11, v9, :cond_14

    if-ne v8, v1, :cond_14

    goto :goto_9

    .line 334
    :cond_14
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Ordered syntax context run count changed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 352
    :cond_15
    new-array v1, v10, [I

    .line 353
    new-array v3, v10, [I

    const/4 v5, 0x0

    :goto_8
    if-ge v5, v10, :cond_16

    .line 355
    aput v5, v3, v5

    aput v5, v1, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_8

    .line 357
    :cond_16
    invoke-static {v1, v2}, Ll/ᩳۢܿ;->֫([I[I)V

    .line 358
    invoke-static {v3, v4}, Ll/ᩳۢܿ;->֫([I[I)V

    .line 359
    new-instance v2, Ll/ܰ᩷ܿ;

    invoke-direct {v2, v10}, Ll/ܰ᩷ܿ;-><init>(I)V

    const/4 v4, 0x0

    .line 360
    invoke-direct {v0, v1, v3, v2, v4}, Ll/ᩳۢܿ;->֫([I[ILl/ܰ᩷ܿ;[J)I

    move-result v4

    .line 361
    new-array v5, v4, [J

    .line 362
    invoke-virtual {v2}, Ll/ܰ᩷ܿ;->֫()V

    .line 363
    invoke-direct {v0, v1, v3, v2, v5}, Ll/ᩳۢܿ;->֫([I[ILl/ܰ᩷ܿ;[J)I

    move-result v1

    if-ne v1, v4, :cond_17

    if-eqz v4, :cond_17

    .line 364
    aget-wide v1, v5, v7

    const/16 v3, 0x20

    ushr-long/2addr v1, v3

    long-to-int v2, v1

    if-nez v2, :cond_17

    .line 53
    :goto_9
    iput-object v5, v0, Ll/ᩳۢܿ;->ᩳ:[J

    return-void

    .line 365
    :cond_17
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Syntax context ranges do not cover the text"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 255
    :cond_18
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid syntax context root"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 39
    :cond_19
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid syntax context column size"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 35
    :cond_1a
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Negative syntax context text length"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public constructor <init>(II[I[I[I[Ll/ܶۜܿ;[J)V
    .locals 0

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput p1, p0, Ll/ᩳۢܿ;->᩻:I

    .line 61
    iput p2, p0, Ll/ᩳۢܿ;->ܿ:I

    .line 62
    iput-object p3, p0, Ll/ᩳۢܿ;->ܳ:[I

    .line 63
    iput-object p4, p0, Ll/ᩳۢܿ;->֫:[I

    .line 64
    iput-object p5, p0, Ll/ᩳۢܿ;->ܽ:[I

    .line 65
    iput-object p6, p0, Ll/ᩳۢܿ;->ۧ:[Ll/ܶۜܿ;

    .line 66
    iput-object p7, p0, Ll/ᩳۢܿ;->ᩳ:[J

    return-void
.end method

.method public constructor <init>(ILl/ܶۜܿ;)V
    .locals 2

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p1, :cond_1

    .line 74
    iput p1, p0, Ll/ᩳۢܿ;->᩻:I

    const/4 v0, 0x1

    .line 75
    iput v0, p0, Ll/ᩳۢܿ;->ܿ:I

    .line 76
    sget-object v1, Ll/ᩳۢܿ;->ۡ:[I

    iput-object v1, p0, Ll/ᩳۢܿ;->ܳ:[I

    .line 77
    filled-new-array {p1}, [I

    move-result-object v1

    iput-object v1, p0, Ll/ᩳۢܿ;->֫:[I

    .line 78
    sget-object v1, Ll/ᩳۢܿ;->᩷:[I

    iput-object v1, p0, Ll/ᩳۢܿ;->ܽ:[I

    .line 79
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-array v0, v0, [Ll/ܶۜܿ;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    iput-object v0, p0, Ll/ᩳۢܿ;->ۧ:[Ll/ܶۜܿ;

    if-nez p1, :cond_0

    .line 81
    sget-object p1, Ll/ᩳۢܿ;->ۜ:[J

    iput-object p1, p0, Ll/ᩳۢܿ;->ᩳ:[J

    return-void

    .line 83
    :cond_0
    sget-object p1, Ll/ᩳۢܿ;->ۢ:[J

    iput-object p1, p0, Ll/ᩳۢܿ;->ᩳ:[J

    return-void

    .line 72
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Negative syntax context text length"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ֫([I[ILl/ܰ᩷ܿ;[J)I
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p3

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, -0x1

    .line 380
    :cond_0
    :goto_0
    iget v6, v0, Ll/ᩳۢܿ;->ܿ:I

    if-lt v2, v6, :cond_1

    if-ge v3, v6, :cond_6

    .line 381
    :cond_1
    iget-object v7, v0, Ll/ᩳۢܿ;->ܳ:[I

    const-wide v8, 0x7fffffffffffffffL

    if-ge v2, v6, :cond_2

    .line 382
    aget v10, p1, v2

    aget v10, v7, v10

    int-to-long v10, v10

    goto :goto_1

    :cond_2
    move-wide v10, v8

    .line 383
    :goto_1
    iget-object v12, v0, Ll/ᩳۢܿ;->֫:[I

    if-ge v3, v6, :cond_3

    aget v13, p2, v3

    aget v13, v12, v13

    int-to-long v13, v13

    goto :goto_2

    :cond_3
    move-wide v13, v8

    .line 384
    :goto_2
    invoke-static {v10, v11, v13, v14}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v10

    long-to-int v11, v10

    :goto_3
    if-ge v3, v6, :cond_4

    .line 385
    aget v10, p2, v3

    aget v13, v12, v10

    if-ne v13, v11, :cond_4

    add-int/lit8 v3, v3, 0x1

    .line 386
    invoke-virtual {v1, v10}, Ll/ܰ᩷ܿ;->ۧ(I)V

    goto :goto_3

    :cond_4
    :goto_4
    if-ge v2, v6, :cond_5

    .line 388
    aget v10, p1, v2

    aget v13, v7, v10

    if-ne v13, v11, :cond_5

    add-int/lit8 v2, v2, 0x1

    .line 389
    invoke-virtual {v1, v10}, Ll/ܰ᩷ܿ;->֫(I)V

    goto :goto_4

    :cond_5
    if-ne v2, v6, :cond_7

    if-ne v3, v6, :cond_7

    :cond_6
    return v4

    :cond_7
    if-ge v2, v6, :cond_8

    .line 393
    aget v10, p1, v2

    aget v7, v7, v10

    int-to-long v13, v7

    goto :goto_5

    :cond_8
    move-wide v13, v8

    :goto_5
    if-ge v3, v6, :cond_9

    .line 395
    aget v6, p2, v3

    aget v6, v12, v6

    int-to-long v8, v6

    .line 396
    :cond_9
    invoke-static {v13, v14, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    int-to-long v8, v11

    cmp-long v10, v6, v8

    if-gtz v10, :cond_a

    goto :goto_0

    .line 398
    :cond_a
    invoke-virtual/range {p3 .. p3}, Ll/ܰ᩷ܿ;->ۧ()I

    move-result v6

    if-ltz v6, :cond_c

    if-eq v6, v5, :cond_0

    if-eqz p4, :cond_b

    .line 403
    invoke-static {v11, v6}, Ll/ᩳۢܿ;->ᩳ(II)J

    move-result-wide v7

    aput-wide v7, p4, v4

    .line 404
    :cond_b
    invoke-static {v4}, Ll/ᩳۢܿ;->ܺ(I)I

    move-result v4

    move v5, v6

    goto :goto_0

    .line 400
    :cond_c
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Syntax context ranges do not cover the text"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static bridge synthetic ֫(II[I[I)V
    .locals 0

    .line 0
    invoke-static {p0, p1, p2, p3}, Ll/ᩳۢܿ;->ۧ(II[I[I)V

    return-void
.end method

.method public static ֫([I[I)V
    .locals 16

    const/4 v0, 0x2

    new-array v1, v0, [I

    const/4 v2, 0x1

    const/16 v3, 0x100

    aput v3, v1, v2

    const/4 v4, 0x0

    const/4 v5, 0x4

    aput v5, v1, v4

    .line 413
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v6, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v1

    move-object v13, v1

    check-cast v13, [[I

    new-array v1, v0, [I

    const/16 v7, 0x101

    aput v7, v1, v2

    aput v5, v1, v4

    .line 414
    invoke-static {v6, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, [[I

    new-array v0, v0, [I

    aput v3, v0, v2

    aput v5, v0, v4

    .line 415
    invoke-static {v6, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, [[I

    move-object/from16 v0, p0

    .line 416
    array-length v10, v0

    const/16 v11, 0x18

    const/4 v12, 0x0

    const/4 v9, 0x0

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    invoke-static/range {v7 .. v15}, Ll/ᩳۢܿ;->֫([I[IIIII[[I[[I[[I)V

    return-void
.end method

.method public static ֫([I[IIIII[[I[[I[[I)V
    .locals 16

    move-object/from16 v9, p0

    move-object/from16 v10, p1

    move/from16 v0, p2

    move/from16 v1, p3

    sub-int v2, v1, v0

    const/4 v3, 0x2

    if-ge v2, v3, :cond_0

    goto/16 :goto_5

    :cond_0
    const/16 v3, 0x40

    if-gt v2, v3, :cond_1

    .line 425
    invoke-static {v0, v1, v9, v10}, Ll/ᩳۢܿ;->ۧ(II[I[I)V

    return-void

    .line 428
    :cond_1
    aget-object v2, p6, p5

    .line 429
    aget-object v11, p7, p5

    .line 430
    aget-object v3, p8, p5

    const/4 v4, 0x0

    .line 431
    invoke-static {v2, v4}, Ljava/util/Arrays;->fill([II)V

    move v5, v0

    :goto_0
    const/4 v12, 0x1

    if-ge v5, v1, :cond_2

    .line 433
    aget v6, v9, v5

    aget v6, v10, v6

    ushr-int v6, v6, p4

    and-int/lit16 v6, v6, 0xff

    aget v7, v2, v6

    add-int/2addr v7, v12

    aput v7, v2, v6

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 435
    :cond_2
    aput v0, v11, v4

    const/4 v0, 0x0

    :goto_1
    const/16 v13, 0x100

    if-ge v0, v13, :cond_3

    add-int/lit8 v1, v0, 0x1

    .line 437
    aget v5, v11, v0

    aget v6, v2, v0

    add-int/2addr v5, v6

    aput v5, v11, v1

    .line 438
    aget v5, v11, v0

    aput v5, v3, v0

    move v0, v1

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_2
    if-ge v0, v13, :cond_6

    add-int/lit8 v1, v0, 0x1

    .line 441
    aget v2, v11, v1

    .line 442
    :goto_3
    aget v5, v3, v0

    if-ge v5, v2, :cond_5

    .line 444
    aget v6, v9, v5

    aget v6, v10, v6

    ushr-int v6, v6, p4

    and-int/lit16 v6, v6, 0xff

    if-ne v6, v0, :cond_4

    add-int/lit8 v5, v5, 0x1

    .line 446
    aput v5, v3, v0

    goto :goto_3

    .line 448
    :cond_4
    aget v7, v3, v6

    add-int/lit8 v8, v7, 0x1

    aput v8, v3, v6

    .line 449
    aget v6, v9, v5

    .line 450
    aget v8, v9, v7

    aput v8, v9, v5

    .line 451
    aput v6, v9, v7

    goto :goto_3

    :cond_5
    move v0, v1

    goto :goto_2

    :cond_6
    if-nez p4, :cond_7

    goto :goto_5

    :cond_7
    add-int/lit8 v14, p4, -0x8

    :goto_4
    if-ge v4, v13, :cond_9

    .line 458
    aget v2, v11, v4

    add-int/lit8 v15, v4, 0x1

    .line 459
    aget v3, v11, v15

    sub-int v0, v3, v2

    if-le v0, v12, :cond_8

    add-int/lit8 v5, p5, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v4, v14

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    .line 461
    invoke-static/range {v0 .. v8}, Ll/ᩳۢܿ;->֫([I[IIIII[[I[[I[[I)V

    :cond_8
    move v4, v15

    goto :goto_4

    :cond_9
    :goto_5
    return-void
.end method

.method public static bridge synthetic ֫(Ll/ᩳۢܿ;)[I
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳۢܿ;->֫:[I

    return-object p0
.end method

.method public static bridge synthetic ۡ(I)I
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ᩳۢܿ;->ܺ(I)I

    move-result p0

    return p0
.end method

.method public static ۧ(II)I
    .locals 0

    ushr-int/2addr p0, p1

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method public static ۧ(ILl/ܶۜܿ;)Ll/ᩳۢܿ;
    .locals 1

    .line 89
    new-instance v0, Ll/ᩳۢܿ;

    invoke-direct {v0, p0, p1}, Ll/ᩳۢܿ;-><init>(ILl/ܶۜܿ;)V

    return-object v0
.end method

.method public static ۧ(II[I[I)V
    .locals 6

    add-int/lit8 v0, p0, 0x1

    :goto_0
    if-ge v0, p1, :cond_1

    .line 470
    aget v1, p2, v0

    .line 471
    aget v2, p3, v1

    move v3, v0

    :goto_1
    if-le v3, p0, :cond_0

    add-int/lit8 v4, v3, -0x1

    .line 473
    aget v4, p2, v4

    aget v5, p3, v4

    if-le v5, v2, :cond_0

    .line 474
    aput v4, p2, v3

    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    .line 477
    :cond_0
    aput v1, p2, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ᩳۢܿ;)[Ll/ܶۜܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳۢܿ;->ۧ:[Ll/ܶۜܿ;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/ᩳۢܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ᩳۢܿ;->᩻:I

    return p0
.end method

.method public static ܺ(I)I
    .locals 1

    const v0, 0x7fffffff

    if-eq p0, v0, :cond_0

    add-int/lit8 p0, p0, 0x1

    return p0

    .line 342
    :cond_0
    new-instance p0, Ljava/lang/OutOfMemoryError;

    const-string v0, "Syntax context run count exceeded"

    invoke-direct {p0, v0}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static bridge synthetic ܽ(II)J
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ᩳۢܿ;->ᩳ(II)J

    move-result-wide p0

    return-wide p0
.end method

.method public static bridge synthetic ܽ(Ll/ᩳۢܿ;)[I
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳۢܿ;->ܽ:[I

    return-object p0
.end method

.method public static bridge synthetic ܽ()[J
    .locals 1

    .line 0
    sget-object v0, Ll/ᩳۢܿ;->ۜ:[J

    return-object v0
.end method

.method public static bridge synthetic ܿ(Ll/ᩳۢܿ;)[I
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳۢܿ;->ܳ:[I

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ᩳۢܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ᩳۢܿ;->ܿ:I

    return p0
.end method

.method public static ᩳ(II)J
    .locals 4

    int-to-long v0, p0

    const/16 p0, 0x20

    shl-long/2addr v0, p0

    int-to-long p0, p1

    const-wide v2, 0xffffffffL

    and-long/2addr p0, v2

    or-long/2addr p0, v0

    return-wide p0
.end method

.method public static bridge synthetic ᩳ()[J
    .locals 1

    .line 0
    sget-object v0, Ll/ᩳۢܿ;->ۢ:[J

    return-object v0
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 120
    iget v0, p0, Ll/ᩳۢܿ;->ܿ:I

    return v0
.end method

.method public final ֫(I)I
    .locals 1

    .line 132
    iget v0, p0, Ll/ᩳۢܿ;->᩻:I

    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    .line 133
    invoke-virtual {p0, p1}, Ll/ᩳۢܿ;->ۜ(I)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ᩳۢܿ;->᩷(I)I

    move-result p1

    return p1
.end method

.method public final ֫(II)I
    .locals 5

    .line 176
    iget v0, p0, Ll/ᩳۢܿ;->᩻:I

    invoke-static {p1, p2, v0}, Ll/ۧ۫ᩴ;->checkFromToIndex(III)I

    if-eq p1, p2, :cond_5

    .line 180
    invoke-virtual {p0, p1}, Ll/ᩳۢܿ;->ۜ(I)I

    move-result p1

    .line 181
    invoke-virtual {p0, p1}, Ll/ᩳۢܿ;->᩷(I)I

    move-result v0

    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 182
    iget-object v1, p0, Ll/ᩳۢܿ;->ᩳ:[J

    array-length v1, v1

    if-ge p1, v1, :cond_4

    invoke-virtual {p0, p1}, Ll/ᩳۢܿ;->ۢ(I)I

    move-result v1

    if-ge v1, p2, :cond_4

    .line 183
    invoke-virtual {p0, p1}, Ll/ᩳۢܿ;->᩷(I)I

    move-result v1

    .line 202
    invoke-virtual {p0, v0}, Ll/ᩳۢܿ;->ۧ(I)I

    move-result v2

    .line 203
    invoke-virtual {p0, v1}, Ll/ᩳۢܿ;->ۧ(I)I

    move-result v3

    .line 204
    :goto_0
    iget-object v4, p0, Ll/ᩳۢܿ;->ܽ:[I

    if-le v2, v3, :cond_1

    .line 205
    aget v0, v4, v0

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-le v3, v2, :cond_2

    .line 209
    aget v1, v4, v1

    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    :cond_2
    :goto_2
    if-eq v0, v1, :cond_3

    .line 213
    aget v0, v4, v0

    .line 214
    aget v1, v4, v1

    goto :goto_2

    :cond_3
    if-nez v0, :cond_0

    :cond_4
    return v0

    .line 178
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Empty syntax context range"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(ILl/ܶۜܿ;)Z
    .locals 2

    .line 94
    iget v0, p0, Ll/ᩳۢܿ;->᩻:I

    const/4 v1, 0x0

    if-ne v0, p1, :cond_0

    iget-object p1, p0, Ll/ᩳۢܿ;->ۧ:[Ll/ܶۜܿ;

    aget-object p1, p1, v1

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final ۜ(I)I
    .locals 7

    .line 138
    iget v0, p0, Ll/ᩳۢܿ;->᩻:I

    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    .line 140
    iget-object v0, p0, Ll/ᩳۢܿ;->ᩳ:[J

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    :goto_0
    if-gt v2, v1, :cond_1

    add-int v3, v2, v1

    ushr-int/lit8 v3, v3, 0x1

    .line 143
    aget-wide v4, v0, v3

    const/16 v6, 0x20

    ushr-long/2addr v4, v6

    long-to-int v5, v4

    if-gt v5, p1, :cond_0

    add-int/lit8 v2, v3, 0x1

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v3, -0x1

    goto :goto_0

    :cond_1
    if-ltz v1, :cond_2

    return v1

    .line 150
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Syntax context tree does not cover the offset"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۢ(I)I
    .locals 3

    .line 248
    iget-object v0, p0, Ll/ᩳۢܿ;->ᩳ:[J

    array-length v1, v0

    invoke-static {p1, v1}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    .line 157
    aget-wide v1, v0, p1

    const/16 p1, 0x20

    ushr-long v0, v1, p1

    long-to-int p1, v0

    return p1
.end method

.method public final ۧ()I
    .locals 1

    .line 125
    iget v0, p0, Ll/ᩳۢܿ;->᩻:I

    return v0
.end method

.method public final ۧ(I)I
    .locals 2

    .line 1390
    iget v0, p0, Ll/ᩳۢܿ;->ܿ:I

    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    const/4 v0, 0x0

    .line 194
    :goto_0
    iget-object v1, p0, Ll/ᩳۢܿ;->ܽ:[I

    aget p1, v1, p1

    const/4 v1, -0x1

    if-eq p1, v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public final ܳ(I)I
    .locals 1

    .line 1390
    iget v0, p0, Ll/ᩳۢܿ;->ܿ:I

    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    .line 227
    iget-object v0, p0, Ll/ᩳۢܿ;->ܳ:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ܽ(I)I
    .locals 1

    .line 1390
    iget v0, p0, Ll/ᩳۢܿ;->ܿ:I

    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    .line 232
    iget-object v0, p0, Ll/ᩳۢܿ;->֫:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ܿ(I)I
    .locals 1

    .line 1390
    iget v0, p0, Ll/ᩳۢܿ;->ܿ:I

    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    .line 237
    iget-object v0, p0, Ll/ᩳۢܿ;->ܽ:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ᩳ(I)Ll/ܶۜܿ;
    .locals 1

    .line 1390
    iget v0, p0, Ll/ᩳۢܿ;->ܿ:I

    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    .line 243
    iget-object v0, p0, Ll/ᩳۢܿ;->ۧ:[Ll/ܶۜܿ;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ᩷(I)I
    .locals 3

    .line 248
    iget-object v0, p0, Ll/ᩳۢܿ;->ᩳ:[J

    array-length v1, v0

    invoke-static {p1, v1}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    .line 168
    aget-wide v1, v0, p1

    long-to-int p1, v1

    return p1
.end method

.method public final ᩻(I)I
    .locals 3

    .line 248
    iget-object v0, p0, Ll/ᩳۢܿ;->ᩳ:[J

    array-length v1, v0

    invoke-static {p1, v1}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    .line 163
    array-length v1, v0

    if-ge p1, v1, :cond_0

    aget-wide v1, v0, p1

    const/16 p1, 0x20

    ushr-long v0, v1, p1

    long-to-int p1, v0

    return p1

    :cond_0
    iget p1, p0, Ll/ᩳۢܿ;->᩻:I

    return p1
.end method
