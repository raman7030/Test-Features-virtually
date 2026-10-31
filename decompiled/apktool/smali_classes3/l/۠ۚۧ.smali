.class public final Ll/۠ۚۧ;
.super Ljava/lang/Object;
.source "P8OA"

# interfaces
.implements Ll/ܶۚۧ;


# static fields
.field public static final ۖ:[I

.field public static final ۘ:[I


# instance fields
.field public final ֫:Ll/ᩳ֨֫;

.field public ۜ:I

.field public final ۡ:Ll/᩵ۢۧ;

.field public final ۢ:I

.field public final ۧ:Ll/᩸᩷ۧ;

.field public ܳ:J

.field public final ܺ:Ll/᩶ۚۧ;

.field public final ܽ:Ll/۠ᩴ֫;

.field public final ܿ:[B

.field public final ᩳ:I

.field public ᩷:J

.field public ᩻:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [I

    .line 388
    fill-array-data v0, :array_0

    sput-object v0, Ll/۠ۚۧ;->ۖ:[I

    const/16 v0, 0x59

    new-array v0, v0, [I

    .line 392
    fill-array-data v0, :array_1

    sput-object v0, Ll/۠ۚۧ;->ۘ:[I

    return-void

    nop

    :array_0
    .array-data 4
        -0x1
        -0x1
        -0x1
        -0x1
        0x2
        0x4
        0x6
        0x8
        -0x1
        -0x1
        -0x1
        -0x1
        0x2
        0x4
        0x6
        0x8
    .end array-data

    :array_1
    .array-data 4
        0x7
        0x8
        0x9
        0xa
        0xb
        0xc
        0xd
        0xe
        0x10
        0x11
        0x13
        0x15
        0x17
        0x19
        0x1c
        0x1f
        0x22
        0x25
        0x29
        0x2d
        0x32
        0x37
        0x3c
        0x42
        0x49
        0x50
        0x58
        0x61
        0x6b
        0x76
        0x82
        0x8f
        0x9d
        0xad
        0xbe
        0xd1
        0xe6
        0xfd
        0x117
        0x133
        0x151
        0x173
        0x198
        0x1c1
        0x1ee
        0x220
        0x256
        0x292
        0x2d4
        0x31c
        0x36c
        0x3c3
        0x424
        0x48e
        0x502
        0x583
        0x610
        0x6ab
        0x756
        0x812
        0x8e0
        0x9c3
        0xabd
        0xbd0
        0xcff
        0xe4c
        0xfba
        0x114c
        0x1307
        0x14ee
        0x1706
        0x1954
        0x1bdc
        0x1ea5
        0x21b6
        0x2515
        0x28ca
        0x2cdf
        0x315b
        0x364b
        0x3bb9
        0x41b2
        0x4844
        0x4f7e
        0x5771
        0x602f
        0x69ce
        0x7462
        0x7fff
    .end array-data
.end method

.method public constructor <init>(Ll/᩸᩷ۧ;Ll/᩵ۢۧ;Ll/᩶ۚۧ;)V
    .locals 6

    .line 441
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 442
    iput-object p1, p0, Ll/۠ۚۧ;->ۧ:Ll/᩸᩷ۧ;

    .line 443
    iput-object p2, p0, Ll/۠ۚۧ;->ۡ:Ll/᩵ۢۧ;

    .line 444
    iput-object p3, p0, Ll/۠ۚۧ;->ܺ:Ll/᩶ۚۧ;

    .line 445
    iget p1, p3, Ll/᩶ۚۧ;->ܿ:I

    div-int/lit8 p2, p1, 0xa

    const/4 v0, 0x1

    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    iput p2, p0, Ll/۠ۚۧ;->ۢ:I

    .line 447
    new-instance v1, Ll/ᩳ֨֫;

    iget-object v2, p3, Ll/᩶ۚۧ;->ܽ:[B

    invoke-direct {v1, v2}, Ll/ᩳ֨֫;-><init>([B)V

    .line 448
    invoke-virtual {v1}, Ll/ᩳ֨֫;->ۘ()I

    .line 449
    invoke-virtual {v1}, Ll/ᩳ֨֫;->ۘ()I

    move-result v1

    iput v1, p0, Ll/۠ۚۧ;->ᩳ:I

    .line 451
    iget v2, p3, Ll/᩶ۚۧ;->ܳ:I

    .line 456
    iget v3, p3, Ll/᩶ۚۧ;->ۧ:I

    const/4 v4, 0x4

    const/16 v5, 0x8

    invoke-static {v2, v4, v3, v5}, Ll/᩸ܳۡ;->֫(IIII)I

    move-result v4

    iget p3, p3, Ll/᩶ۚۧ;->֫:I

    mul-int p3, p3, v2

    div-int/2addr v4, p3

    add-int/2addr v4, v0

    if-ne v1, v4, :cond_0

    .line 468
    invoke-static {p2, v1}, Ll/ۘ֨֫;->֫(II)I

    move-result p3

    mul-int v0, p3, v3

    .line 469
    new-array v0, v0, [B

    iput-object v0, p0, Ll/۠ۚۧ;->ܿ:[B

    .line 470
    new-instance v0, Ll/ᩳ֨֫;

    mul-int/lit8 v4, v1, 0x2

    mul-int v4, v4, v2

    mul-int v4, v4, p3

    .line 472
    invoke-direct {v0, v4}, Ll/ᩳ֨֫;-><init>(I)V

    iput-object v0, p0, Ll/۠ۚۧ;->֫:Ll/ᩳ֨֫;

    mul-int v3, v3, p1

    mul-int/lit8 v3, v3, 0x8

    .line 476
    div-int/2addr v3, v1

    .line 477
    new-instance p3, Ll/֨ᩴ֫;

    invoke-direct {p3}, Ll/֨ᩴ֫;-><init>()V

    const-string v0, "audio/raw"

    .line 479
    invoke-virtual {p3, v0}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    .line 480
    invoke-virtual {p3, v3}, Ll/֨ᩴ֫;->ܽ(I)V

    .line 481
    invoke-virtual {p3, v3}, Ll/֨ᩴ֫;->֡(I)V

    const/4 v0, 0x2

    mul-int/lit8 p2, p2, 0x2

    mul-int p2, p2, v2

    .line 482
    invoke-virtual {p3, p2}, Ll/֨ᩴ֫;->ۖ(I)V

    .line 483
    invoke-virtual {p3, v2}, Ll/֨ᩴ֫;->ᩳ(I)V

    .line 484
    invoke-virtual {p3, p1}, Ll/֨ᩴ֫;->۠(I)V

    .line 485
    invoke-virtual {p3, v0}, Ll/֨ᩴ֫;->᩵(I)V

    .line 486
    invoke-virtual {p3}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object p1

    iput-object p1, p0, Ll/۠ۚۧ;->ܽ:Ll/۠ᩴ֫;

    return-void

    .line 461
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Expected frames per block: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "; got: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p1, p2}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p1

    throw p1
.end method

.method private ֫(I)V
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p1

    .line 558
    iget-wide v2, v0, Ll/۠ۚۧ;->᩷:J

    iget-wide v4, v0, Ll/۠ۚۧ;->ܳ:J

    iget-object v11, v0, Ll/۠ۚۧ;->ܺ:Ll/᩶ۚۧ;

    iget v6, v11, Ll/᩶ۚۧ;->ܿ:I

    int-to-long v8, v6

    .line 560
    sget-object v6, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1955
    sget-object v10, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v6, 0xf4240

    invoke-static/range {v4 .. v10}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v4

    add-long v13, v2, v4

    .line 656
    iget v2, v11, Ll/᩶ۚۧ;->ܳ:I

    mul-int/lit8 v3, v1, 0x2

    mul-int v3, v3, v2

    .line 563
    iget v2, v0, Ll/۠ۚۧ;->ۜ:I

    sub-int v17, v2, v3

    const/4 v15, 0x1

    const/16 v18, 0x0

    .line 564
    iget-object v12, v0, Ll/۠ۚۧ;->ۡ:Ll/᩵ۢۧ;

    move/from16 v16, v3

    invoke-interface/range {v12 .. v18}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    .line 566
    iget-wide v4, v0, Ll/۠ۚۧ;->ܳ:J

    int-to-long v1, v1

    add-long/2addr v4, v1

    iput-wide v4, v0, Ll/۠ۚۧ;->ܳ:J

    .line 567
    iget v1, v0, Ll/۠ۚۧ;->ۜ:I

    sub-int/2addr v1, v3

    iput v1, v0, Ll/۠ۚۧ;->ۜ:I

    return-void
.end method


# virtual methods
.method public final ֫(IJ)V
    .locals 8

    .line 499
    new-instance v7, Ll/۬ۚۧ;

    iget v2, p0, Ll/۠ۚۧ;->ᩳ:I

    int-to-long v3, p1

    iget-object v1, p0, Ll/۠ۚۧ;->ܺ:Ll/᩶ۚۧ;

    move-object v0, v7

    move-wide v5, p2

    invoke-direct/range {v0 .. v6}, Ll/۬ۚۧ;-><init>(Ll/᩶ۚۧ;IJJ)V

    .line 501
    iget-object p1, p0, Ll/۠ۚۧ;->ۧ:Ll/᩸᩷ۧ;

    invoke-interface {p1, v7}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    .line 502
    iget-object p1, p0, Ll/۠ۚۧ;->ܽ:Ll/۠ᩴ֫;

    iget-object p2, p0, Ll/۠ۚۧ;->ۡ:Ll/᩵ۢۧ;

    invoke-interface {p2, p1}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    .line 503
    invoke-virtual {v7}, Ll/۬ۚۧ;->ۜ()J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, Ll/᩵ۢۧ;->֫(J)V

    return-void
.end method

.method public final ֫(J)V
    .locals 1

    const/4 v0, 0x0

    .line 491
    iput v0, p0, Ll/۠ۚۧ;->᩻:I

    .line 492
    iput-wide p1, p0, Ll/۠ۚۧ;->᩷:J

    .line 493
    iput v0, p0, Ll/۠ۚۧ;->ۜ:I

    const-wide/16 p1, 0x0

    .line 494
    iput-wide p1, p0, Ll/۠ۚۧ;->ܳ:J

    return-void
.end method

.method public final ֫(Ll/۠᩷ۧ;J)Z
    .locals 22

    move-object/from16 v0, p0

    .line 510
    iget v1, v0, Ll/۠ۚۧ;->ۜ:I

    .line 652
    iget-object v2, v0, Ll/۠ۚۧ;->ܺ:Ll/᩶ۚۧ;

    iget v3, v2, Ll/᩶ۚۧ;->ܳ:I

    mul-int/lit8 v3, v3, 0x2

    div-int/2addr v1, v3

    .line 511
    iget v3, v0, Ll/۠ۚۧ;->ۢ:I

    sub-int v1, v3, v1

    .line 513
    iget v4, v0, Ll/۠ۚۧ;->ᩳ:I

    invoke-static {v1, v4}, Ll/ۘ֨֫;->֫(II)I

    move-result v1

    .line 514
    iget v5, v2, Ll/᩶ۚۧ;->ܳ:I

    iget v6, v2, Ll/᩶ۚۧ;->ۧ:I

    mul-int v1, v1, v6

    const-wide/16 v7, 0x0

    cmp-long v9, p2, v7

    if-nez v9, :cond_0

    move-object v11, v0

    move v7, v4

    move v8, v5

    move v9, v6

    move v4, v1

    move-object v5, v2

    move v6, v3

    move-object/from16 v1, p1

    move-wide/from16 v2, p2

    goto :goto_1

    :cond_0
    const/4 v7, 0x0

    move-object v11, v0

    move v7, v4

    move v8, v5

    move v9, v6

    const/4 v10, 0x0

    move v4, v1

    move-object v5, v2

    move v6, v3

    move-object/from16 v1, p1

    move-wide/from16 v2, p2

    .line 518
    :goto_0
    iget-object v12, v11, Ll/۠ۚۧ;->ܿ:[B

    if-nez v10, :cond_2

    iget v13, v11, Ll/۠ۚۧ;->᩻:I

    if-ge v13, v4, :cond_2

    sub-int v13, v4, v13

    int-to-long v13, v13

    .line 519
    invoke-static {v13, v14, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v13

    long-to-int v14, v13

    .line 520
    iget v13, v11, Ll/۠ۚۧ;->᩻:I

    invoke-interface {v1, v12, v13, v14}, Ll/ۢᩴ֫;->read([BII)I

    move-result v12

    const/4 v13, -0x1

    if-ne v12, v13, :cond_1

    :goto_1
    const/4 v10, 0x1

    goto :goto_0

    .line 524
    :cond_1
    iget v13, v11, Ll/۠ۚۧ;->᩻:I

    add-int/2addr v13, v12

    iput v13, v11, Ll/۠ۚۧ;->᩻:I

    goto :goto_0

    .line 528
    :cond_2
    iget v1, v11, Ll/۠ۚۧ;->᩻:I

    div-int/2addr v1, v9

    if-lez v1, :cond_8

    const/4 v2, 0x0

    .line 578
    :goto_2
    iget-object v3, v11, Ll/۠ۚۧ;->֫:Ll/ᩳ֨֫;

    if-ge v2, v1, :cond_7

    const/4 v4, 0x0

    :goto_3
    if-ge v4, v8, :cond_6

    .line 580
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v13

    mul-int v14, v2, v9

    mul-int/lit8 v15, v4, 0x4

    add-int/2addr v15, v14

    mul-int/lit8 v14, v8, 0x4

    add-int/2addr v14, v15

    .line 603
    div-int v16, v9, v8

    add-int/lit8 v16, v16, -0x4

    add-int/lit8 v17, v15, 0x1

    .line 607
    aget-byte v0, v12, v17

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    move/from16 p1, v10

    aget-byte v10, v12, v15

    and-int/lit16 v10, v10, 0xff

    or-int/2addr v0, v10

    int-to-short v0, v0

    add-int/lit8 v15, v15, 0x2

    .line 609
    aget-byte v10, v12, v15

    and-int/lit16 v10, v10, 0xff

    const/16 v15, 0x58

    invoke-static {v10, v15}, Ljava/lang/Math;->min(II)I

    move-result v10

    .line 610
    sget-object v15, Ll/۠ۚۧ;->ۘ:[I

    aget v17, v15, v10

    mul-int v18, v2, v7

    mul-int v18, v18, v8

    add-int v18, v18, v4

    mul-int/lit8 v18, v18, 0x2

    move/from16 p2, v10

    and-int/lit16 v10, v0, 0xff

    int-to-byte v10, v10

    .line 614
    aput-byte v10, v13, v18

    add-int/lit8 v10, v18, 0x1

    move/from16 p3, v6

    shr-int/lit8 v6, v0, 0x8

    int-to-byte v6, v6

    .line 615
    aput-byte v6, v13, v10

    const/4 v6, 0x0

    move/from16 v10, p2

    move/from16 p2, v9

    move/from16 v9, v17

    :goto_4
    move-object/from16 v17, v11

    mul-int/lit8 v11, v16, 0x2

    if-ge v6, v11, :cond_5

    .line 619
    div-int/lit8 v11, v6, 0x8

    .line 620
    div-int/lit8 v19, v6, 0x2

    rem-int/lit8 v19, v19, 0x4

    mul-int v11, v11, v8

    mul-int/lit8 v11, v11, 0x4

    add-int/2addr v11, v14

    add-int v11, v11, v19

    .line 623
    aget-byte v11, v12, v11

    move-object/from16 v19, v12

    and-int/lit16 v12, v11, 0xff

    .line 624
    rem-int/lit8 v20, v6, 0x2

    if-nez v20, :cond_3

    and-int/lit8 v11, v11, 0xf

    goto :goto_5

    :cond_3
    shr-int/lit8 v11, v12, 0x4

    :goto_5
    and-int/lit8 v12, v11, 0x7

    move/from16 v20, v14

    const/4 v14, 0x1

    move-object/from16 v21, v3

    const/4 v3, 0x2

    .line 630
    invoke-static {v12, v3, v14, v9}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v3

    shr-int/lit8 v3, v3, 0x3

    and-int/lit8 v9, v11, 0x8

    if-eqz v9, :cond_4

    neg-int v3, v3

    :cond_4
    add-int/2addr v0, v3

    const/16 v3, -0x8000

    const/16 v9, 0x7fff

    .line 638
    invoke-static {v0, v3, v9}, Ll/ۘ֨֫;->֫(III)I

    move-result v0

    mul-int/lit8 v3, v8, 0x2

    add-int v18, v3, v18

    and-int/lit16 v3, v0, 0xff

    int-to-byte v3, v3

    .line 642
    aput-byte v3, v13, v18

    add-int/lit8 v3, v18, 0x1

    shr-int/lit8 v9, v0, 0x8

    int-to-byte v9, v9

    .line 643
    aput-byte v9, v13, v3

    .line 645
    sget-object v3, Ll/۠ۚۧ;->ۖ:[I

    aget v3, v3, v11

    add-int/2addr v10, v3

    const/4 v3, 0x0

    const/16 v9, 0x58

    .line 646
    invoke-static {v10, v3, v9}, Ll/ۘ֨֫;->֫(III)I

    move-result v10

    .line 647
    aget v9, v15, v10

    add-int/lit8 v6, v6, 0x1

    move-object/from16 v11, v17

    move-object/from16 v12, v19

    move/from16 v14, v20

    move-object/from16 v3, v21

    goto :goto_4

    :cond_5
    move-object/from16 v21, v3

    move-object/from16 v19, v12

    add-int/lit8 v4, v4, 0x1

    move-object/from16 v0, p0

    move/from16 v10, p1

    move/from16 v9, p2

    move/from16 v6, p3

    move-object/from16 v11, v17

    goto/16 :goto_3

    :cond_6
    move/from16 p3, v6

    move/from16 p2, v9

    move/from16 p1, v10

    move-object/from16 v17, v11

    move-object/from16 v19, v12

    add-int/lit8 v2, v2, 0x1

    move-object/from16 v0, p0

    goto/16 :goto_2

    :cond_7
    move-object/from16 v21, v3

    move/from16 p3, v6

    move/from16 p2, v9

    move/from16 p1, v10

    move-object/from16 v17, v11

    mul-int v7, v7, v1

    .line 656
    iget v0, v5, Ll/᩶ۚۧ;->ܳ:I

    mul-int/lit8 v7, v7, 0x2

    mul-int v7, v7, v0

    const/4 v0, 0x0

    move-object/from16 v2, v21

    .line 584
    invoke-virtual {v2, v0}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 585
    invoke-virtual {v2, v7}, Ll/ᩳ֨֫;->ᩳ(I)V

    .line 532
    iget v0, v11, Ll/۠ۚۧ;->᩻:I

    mul-int v1, v1, p2

    sub-int/2addr v0, v1

    iput v0, v11, Ll/۠ۚۧ;->᩻:I

    .line 535
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܿ()I

    move-result v0

    .line 536
    iget-object v1, v11, Ll/۠ۚۧ;->ۡ:Ll/᩵ۢۧ;

    invoke-interface {v1, v0, v2}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 537
    iget v1, v11, Ll/۠ۚۧ;->ۜ:I

    add-int/2addr v1, v0

    iput v1, v11, Ll/۠ۚۧ;->ۜ:I

    .line 652
    iget v0, v5, Ll/᩶ۚۧ;->ܳ:I

    mul-int/lit8 v0, v0, 0x2

    div-int/2addr v1, v0

    if-lt v1, v6, :cond_9

    .line 542
    invoke-direct {v11, v6}, Ll/۠ۚۧ;->֫(I)V

    goto :goto_6

    :cond_8
    move/from16 p1, v10

    :cond_9
    :goto_6
    if-eqz p1, :cond_a

    .line 548
    iget v0, v11, Ll/۠ۚۧ;->ۜ:I

    .line 652
    iget v1, v5, Ll/᩶ۚۧ;->ܳ:I

    mul-int/lit8 v1, v1, 0x2

    div-int/2addr v0, v1

    if-lez v0, :cond_a

    .line 550
    invoke-direct {v11, v0}, Ll/۠ۚۧ;->֫(I)V

    :cond_a
    return p1
.end method
