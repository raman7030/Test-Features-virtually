.class public final Ll/ۙܰܿ;
.super Ljava/lang/Object;
.source "U4IR"


# static fields
.field public static final ֨:[Ljava/lang/String;

.field public static final ۚ:[C


# instance fields
.field public final ֡:I

.field public final ֫:[C

.field public ۖ:Z

.field public final ۘ:Landroid/graphics/RectF;

.field public final ۜ:Ll/ܳ᩸ۡ;

.field public ۡ:Z

.field public final ۢ:[C

.field public final ۧ:[C

.field public ܳ:[B

.field public ܺ:Z

.field public ܽ:[Z

.field public ܿ:Z

.field public ᩳ:Z

.field public final ᩴ:Landroid/graphics/RectF;

.field public final ᩵:Landroid/graphics/RectF;

.field public ᩷:Z

.field public final ᩻:Ll/ۜܰܿ;


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    const-string v14, "E"

    const-string v15, "F"

    const-string v0, "0"

    const-string v1, "1"

    const-string v2, "2"

    const-string v3, "3"

    const-string v4, "4"

    const-string v5, "5"

    const-string v6, "6"

    const-string v7, "7"

    const-string v8, "8"

    const-string v9, "9"

    const-string v10, "A"

    const-string v11, "B"

    const-string v12, "C"

    const-string v13, "D"

    .line 16
    filled-new-array/range {v0 .. v15}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ۙܰܿ;->֨:[Ljava/lang/String;

    const-string v0, "0123456789ABCDEF"

    .line 17
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Ll/ۙܰܿ;->ۚ:[C

    return-void
.end method

.method public constructor <init>(Ll/ۜܰܿ;)V
    .locals 3

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Ll/ۙܰܿ;->ۘ:Landroid/graphics/RectF;

    .line 20
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Ll/ۙܰܿ;->ᩴ:Landroid/graphics/RectF;

    .line 21
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Ll/ۙܰܿ;->᩵:Landroid/graphics/RectF;

    .line 22
    new-instance v0, Ll/ܳ᩸ۡ;

    const/4 v1, 0x3

    .line 20
    invoke-direct {v0, v1}, Ll/ܳ᩸ۡ;-><init>(I)V

    .line 22
    iput-object v0, p0, Ll/ۙܰܿ;->ۜ:Ll/ܳ᩸ۡ;

    .line 31
    sget-object v0, Ll/ۚ᩺ۘ;->֫:[B

    iput-object v0, p0, Ll/ۙܰܿ;->ܳ:[B

    .line 32
    sget-object v0, Ll/᩵᩺ۘ;->֫:[Z

    iput-object v0, p0, Ll/ۙܰܿ;->ܽ:[Z

    const/4 v0, 0x2

    new-array v1, v0, [C

    .line 33
    iput-object v1, p0, Ll/ۙܰܿ;->ۧ:[C

    const/4 v1, 0x1

    new-array v1, v1, [C

    .line 34
    iput-object v1, p0, Ll/ۙܰܿ;->֫:[C

    const/16 v1, 0xd

    new-array v1, v1, [C

    .line 35
    iput-object v1, p0, Ll/ۙܰܿ;->ۢ:[C

    .line 38
    iput-object p1, p0, Ll/ۙܰܿ;->᩻:Ll/ۜܰܿ;

    .line 39
    iget-object p1, p1, Ll/ۜܰܿ;->ۙ:Ll/ۤ᩺ܿ;

    .line 40
    iget-object v1, p1, Ll/ۤ᩺ܿ;->۬:Landroid/graphics/drawable/Drawable;

    .line 41
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    iget-object v2, p1, Ll/ۤ᩺ܿ;->۫:Landroid/graphics/drawable/Drawable;

    .line 42
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    .line 40
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    iget-object p1, p1, Ll/ۤ᩺ܿ;->ۗ:Landroid/graphics/drawable/Drawable;

    .line 43
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p1

    .line 40
    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    mul-int/lit8 p1, p1, 0x3

    div-int/2addr p1, v0

    iput p1, p0, Ll/ۙܰܿ;->֡:I

    return-void
.end method

.method private ֫(J)I
    .locals 7

    .line 484
    iget-object v0, p0, Ll/ۙܰܿ;->᩻:Ll/ۜܰܿ;

    iget-object v1, v0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    .line 485
    iget-object v0, v0, Ll/ۜܰܿ;->ۙ:Ll/ۤ᩺ܿ;

    .line 486
    invoke-virtual {v1}, Ll/ۧܰܿ;->ᩳ()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v2, :cond_0

    .line 487
    iput-boolean v4, p0, Ll/ۙܰܿ;->ۡ:Z

    return v3

    .line 490
    :cond_0
    invoke-virtual {p0}, Ll/ۙܰܿ;->᩻()I

    move-result v2

    int-to-long v5, v2

    sub-long/2addr p1, v5

    .line 491
    iget v0, v0, Ll/ۤ᩺ܿ;->ۡ:I

    int-to-long v5, v0

    div-long/2addr p1, v5

    long-to-int v0, p1

    int-to-long v5, v0

    cmp-long v2, p1, v5

    if-nez v2, :cond_4

    if-gez v0, :cond_1

    .line 494
    iput-boolean v4, p0, Ll/ۙܰܿ;->ۡ:Z

    return v3

    .line 497
    :cond_1
    invoke-virtual {v1}, Ll/ۧܰܿ;->ᩳ()I

    move-result p1

    invoke-virtual {v1}, Ll/ۧܰܿ;->ܽ()I

    move-result p2

    rem-int/2addr p1, p2

    if-nez p1, :cond_2

    invoke-virtual {v1}, Ll/ۧܰܿ;->ܳ()I

    move-result p1

    goto :goto_0

    .line 117
    :cond_2
    invoke-virtual {v1}, Ll/ۧܰܿ;->ܳ()I

    move-result p1

    sub-int/2addr p1, v4

    :goto_0
    if-le v0, p1, :cond_3

    .line 500
    iput-boolean v4, p0, Ll/ۙܰܿ;->ۡ:Z

    return p1

    :cond_3
    return v0

    .line 0
    :cond_4
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
.end method

.method private ᩴ()F
    .locals 5

    .line 467
    iget-object v0, p0, Ll/ۙܰܿ;->᩻:Ll/ۜܰܿ;

    iget-object v1, v0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    .line 468
    iget-object v0, v0, Ll/ۜܰܿ;->ۙ:Ll/ۤ᩺ܿ;

    .line 469
    invoke-virtual {v1}, Ll/ۧܰܿ;->᩻()I

    move-result v2

    const/4 v3, 0x1

    add-int/2addr v2, v3

    .line 470
    invoke-virtual {v1}, Ll/ۧܰܿ;->ܽ()I

    move-result v1

    const/4 v4, 0x3

    invoke-static {v1, v4, v2, v3}, Ll/᩺᩵ܿ;->֫(IIII)I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x3f000000    # 0.5f

    add-float/2addr v1, v2

    const/high16 v2, 0x3f800000    # 1.0f

    add-float/2addr v1, v2

    iget v0, v0, Ll/ۤ᩺ܿ;->ۧ:F

    mul-float v1, v1, v0

    return v1
.end method


# virtual methods
.method public final ֫()F
    .locals 2

    .line 511
    iget-object v0, p0, Ll/ۙܰܿ;->᩻:Ll/ۜܰܿ;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    iget v1, p0, Ll/ۙܰܿ;->֡:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    return v0
.end method

.method public final ֫(FJZ)I
    .locals 8

    const/4 v0, 0x0

    .line 569
    iput-boolean v0, p0, Ll/ۙܰܿ;->ۡ:Z

    .line 570
    invoke-direct {p0, p2, p3}, Ll/ۙܰܿ;->֫(J)I

    move-result p2

    .line 517
    iget-object p3, p0, Ll/ۙܰܿ;->᩻:Ll/ۜܰܿ;

    iget-object v1, p3, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    .line 518
    iget-object v2, p3, Ll/ۜܰܿ;->ۙ:Ll/ۤ᩺ܿ;

    .line 519
    iget v2, v2, Ll/ۤ᩺ܿ;->ۧ:F

    .line 520
    invoke-virtual {v1}, Ll/ۧܰܿ;->᩻()I

    move-result v3

    const/4 v4, 0x1

    add-int/2addr v3, v4

    int-to-float v3, v3

    mul-float v3, v3, v2

    const/high16 v5, 0x40000000    # 2.0f

    div-float v6, v2, v5

    add-float/2addr v6, v3

    cmpg-float v3, p1, v6

    if-gtz v3, :cond_0

    .line 522
    iput-boolean v4, p0, Ll/ۙܰܿ;->ۡ:Z

    .line 523
    iput-boolean v4, p0, Ll/ۙܰܿ;->ۖ:Z

    goto :goto_5

    .line 526
    :cond_0
    invoke-virtual {v1}, Ll/ۧܰܿ;->ܽ()I

    move-result v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_3

    add-float/2addr v6, v2

    cmpg-float v7, p1, v6

    if-gtz v7, :cond_1

    .line 530
    iput-boolean v4, p0, Ll/ۙܰܿ;->ۖ:Z

    goto :goto_1

    :cond_1
    mul-float v7, v2, v5

    add-float/2addr v6, v7

    cmpg-float v7, p1, v6

    if-gtz v7, :cond_2

    .line 535
    iput-boolean v0, p0, Ll/ۙܰܿ;->ۖ:Z

    :goto_1
    move v0, v3

    goto :goto_5

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    if-nez p4, :cond_8

    add-float/2addr v6, v2

    cmpg-float p4, p1, v6

    if-gtz p4, :cond_4

    goto :goto_3

    .line 545
    :cond_4
    iput-boolean v4, p0, Ll/ۙܰܿ;->ۖ:Z

    .line 546
    invoke-direct {p0}, Ll/ۙܰܿ;->ᩴ()F

    move-result p4

    cmpg-float v3, p1, p4

    if-gtz v3, :cond_5

    .line 548
    iput-boolean v4, p0, Ll/ۙܰܿ;->ۡ:Z

    goto :goto_5

    :cond_5
    :goto_2
    if-ge v0, v1, :cond_7

    add-float/2addr p4, v2

    cmpg-float v3, p1, p4

    if-gtz v3, :cond_6

    goto :goto_5

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 556
    :cond_7
    iput-boolean v4, p0, Ll/ۙܰܿ;->ۡ:Z

    goto :goto_4

    .line 540
    :cond_8
    :goto_3
    iput-boolean v4, p0, Ll/ۙܰܿ;->ۡ:Z

    .line 541
    iput-boolean v0, p0, Ll/ۙܰܿ;->ۖ:Z

    :goto_4
    add-int/lit8 v0, v1, -0x1

    .line 572
    :goto_5
    iget-object p1, p3, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {p1, p2, v0}, Ll/ۧܰܿ;->֫(II)I

    move-result p1

    return p1
.end method

.method public final ֫(I)J
    .locals 8

    .line 452
    iget-object v0, p0, Ll/ۙܰܿ;->᩻:Ll/ۜܰܿ;

    iget-object v1, v0, Ll/ۜܰܿ;->ۙ:Ll/ۤ᩺ܿ;

    .line 453
    invoke-virtual {p0}, Ll/ۙܰܿ;->᩻()I

    move-result v2

    int-to-long v2, v2

    int-to-long v4, p1

    const-wide/16 v6, 0x1

    add-long/2addr v4, v6

    iget p1, v1, Ll/ۤ᩺ܿ;->ۡ:I

    int-to-long v6, p1

    mul-long v4, v4, v6

    add-long/2addr v4, v2

    iget p1, p0, Ll/ۙܰܿ;->֡:I

    int-to-long v1, p1

    add-long/2addr v4, v1

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-long v0, p1

    sub-long/2addr v4, v0

    const-wide/16 v0, 0x0

    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ֫(ILl/ۨ۟ܿ;Z)V
    .locals 9

    .line 372
    iget-object v0, p0, Ll/ۙܰܿ;->᩻:Ll/ۜܰܿ;

    iget-object v1, v0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v1}, Ll/ۧܰܿ;->ܽ()I

    move-result v1

    .line 373
    iget-object v2, v0, Ll/ۜܰܿ;->ۙ:Ll/ۤ᩺ܿ;

    iget v3, v2, Ll/ۤ᩺ܿ;->ۡ:I

    .line 374
    iget v2, v2, Ll/ۤ᩺ܿ;->ۧ:F

    .line 375
    iget-object v0, v0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v0}, Ll/ۧܰܿ;->᩻()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    int-to-float v0, v0

    mul-float v0, v0, v2

    float-to-int v0, v0

    .line 376
    div-int v4, p1, v1

    .line 377
    invoke-virtual {p0}, Ll/ۙܰܿ;->᩻()I

    move-result v5

    int-to-long v5, v5

    int-to-long v7, v3

    int-to-long v3, v4

    mul-long v3, v3, v7

    add-long/2addr v3, v5

    add-long/2addr v7, v3

    .line 379
    rem-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x3

    add-int/lit8 v1, p1, 0x1

    if-eqz p3, :cond_0

    add-int/lit8 v1, p1, 0x3

    :cond_0
    int-to-float p1, v0

    int-to-float p3, v1

    mul-float p3, p3, v2

    add-float/2addr p3, p1

    float-to-int p1, p3

    .line 10
    iput p1, p2, Ll/ۨ۟ܿ;->ۧ:I

    .line 11
    iput-wide v3, p2, Ll/ۨ۟ܿ;->ᩳ:J

    .line 12
    iput p1, p2, Ll/ۨ۟ܿ;->ܽ:I

    .line 13
    iput-wide v7, p2, Ll/ۨ۟ܿ;->֫:J

    return-void
.end method

.method public final ֫(Landroid/graphics/Canvas;ZZFZ)V
    .locals 59

    move-object/from16 v0, p0

    move-object/from16 v8, p1

    move/from16 v9, p3

    const/4 v1, 0x0

    .line 50
    iput-boolean v1, v0, Ll/ۙܰܿ;->ܺ:Z

    .line 51
    iput-boolean v1, v0, Ll/ۙܰܿ;->ܿ:Z

    .line 52
    iget-object v10, v0, Ll/ۙܰܿ;->᩻:Ll/ۜܰܿ;

    iget-object v11, v10, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    .line 53
    iget-object v12, v10, Ll/ۜܰܿ;->ۙ:Ll/ۤ᩺ܿ;

    .line 55
    invoke-virtual {v10}, Landroid/view/View;->getWidth()I

    move-result v13

    .line 56
    invoke-virtual {v10}, Landroid/view/View;->getHeight()I

    move-result v14

    .line 58
    iget v15, v12, Ll/ۤ᩺ܿ;->ۡ:I

    iget v7, v12, Ll/ۤ᩺ܿ;->᩷:F

    iget v6, v12, Ll/ۤ᩺ܿ;->ܿ:F

    .line 59
    invoke-virtual/range {p0 .. p0}, Ll/ۙܰܿ;->᩻()I

    move-result v5

    .line 60
    iget v4, v12, Ll/ۤ᩺ܿ;->ۧ:F

    .line 62
    invoke-virtual {v11}, Ll/ۧܰܿ;->᩻()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    int-to-float v1, v1

    mul-float v16, v1, v4

    .line 63
    invoke-virtual {v11}, Ll/ۧܰܿ;->ܽ()I

    move-result v3

    .line 65
    iget-object v2, v12, Ll/ۤ᩺ܿ;->۠:Ll/֫ۖܽ;

    .line 66
    iget v1, v12, Ll/ۤ᩺ܿ;->᩶:I

    .line 68
    invoke-virtual {v10}, Ll/ۜܰܿ;->ܿ()J

    move-result-wide v17

    move-object/from16 v19, v10

    int-to-long v9, v5

    move/from16 v21, v4

    move/from16 v20, v5

    add-long v4, v17, v9

    .line 70
    invoke-direct {v0, v4, v5}, Ll/ۙܰܿ;->֫(J)I

    move-result v5

    move/from16 v23, v6

    move/from16 v22, v7

    int-to-long v6, v14

    add-long v6, v17, v6

    .line 74
    invoke-direct {v0, v6, v7}, Ll/ۙܰܿ;->֫(J)I

    move-result v4

    .line 73
    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    move-result v7

    .line 75
    invoke-direct/range {p0 .. p0}, Ll/ۙܰܿ;->ᩴ()F

    move-result v24

    sub-long v29, v9, v17

    move-wide/from16 v25, v9

    int-to-long v9, v5

    move/from16 v27, v5

    int-to-long v5, v15

    mul-long v31, v9, v5

    move-wide/from16 v33, v5

    add-long v5, v31, v29

    move/from16 v35, v13

    move/from16 v36, v14

    int-to-long v13, v1

    add-long/2addr v13, v5

    long-to-int v4, v13

    move-wide/from16 v31, v5

    int-to-long v5, v4

    cmp-long v28, v13, v5

    if-nez v28, :cond_2d

    int-to-long v13, v7

    sub-long v5, v13, v9

    const-wide/16 v37, 0x1

    add-long v5, v5, v37

    move/from16 v28, v1

    long-to-int v1, v5

    move-wide/from16 v37, v13

    int-to-long v13, v1

    cmp-long v1, v5, v13

    if-nez v1, :cond_2c

    int-to-long v5, v3

    mul-long v13, v13, v5

    long-to-int v1, v13

    move/from16 v39, v3

    move/from16 v40, v4

    int-to-long v3, v1

    cmp-long v41, v13, v3

    if-nez v41, :cond_2b

    .line 82
    iget-object v3, v0, Ll/ۙܰܿ;->ܳ:[B

    array-length v3, v3

    if-ge v3, v1, :cond_0

    .line 83
    new-array v3, v1, [B

    iput-object v3, v0, Ll/ۙܰܿ;->ܳ:[B

    .line 84
    new-array v3, v1, [Z

    iput-object v3, v0, Ll/ۙܰܿ;->ܽ:[Z

    :cond_0
    mul-long v9, v9, v5

    long-to-int v3, v9

    int-to-long v13, v3

    cmp-long v4, v9, v13

    if-nez v4, :cond_2a

    .line 87
    iget-object v4, v0, Ll/ۙܰܿ;->ܳ:[B

    iget-object v9, v0, Ll/ۙܰܿ;->ܽ:[Z

    invoke-virtual {v11, v3, v1, v4, v9}, Ll/ۧܰܿ;->֫(II[B[Z)I

    move-result v9

    .line 91
    iget v1, v12, Ll/ۤ᩺ܿ;->ᩴ:I

    invoke-virtual {v8, v1}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 94
    iget v1, v12, Ll/ۤ᩺ܿ;->֡:I

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setColor(I)V

    move/from16 v10, v36

    int-to-float v13, v10

    const/4 v3, 0x0

    const/4 v4, 0x0

    move/from16 v14, v28

    move-object/from16 v1, p1

    move-object/from16 v36, v2

    move v2, v3

    move/from16 v42, v39

    move v3, v4

    move/from16 v39, v21

    move/from16 v21, v40

    move/from16 v4, v16

    move/from16 v43, v20

    move-wide/from16 v44, v31

    move-wide/from16 v31, v33

    move-wide/from16 v57, v5

    move/from16 v6, v27

    move-wide/from16 v27, v57

    move v5, v13

    move/from16 v20, v23

    move/from16 v23, v14

    move v14, v6

    move-object/from16 v6, v36

    .line 95
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 97
    iget v1, v12, Ll/ۤ᩺ܿ;->ۚ:I

    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 v33, 0x40000000    # 2.0f

    div-float v34, v39, v33

    move v4, v14

    move/from16 v5, v21

    .line 100
    :goto_0
    sget-object v36, Ll/ۙܰܿ;->ۚ:[C

    if-gt v4, v7, :cond_2

    int-to-long v2, v4

    mul-long v2, v2, v27

    .line 101
    invoke-virtual {v11}, Ll/ۧܰܿ;->᩻()I

    move-result v40

    add-int/lit8 v41, v40, -0x1

    .line 584
    :goto_1
    iget-object v1, v0, Ll/ۙܰܿ;->ۢ:[C

    if-ltz v41, :cond_1

    const-wide/16 v47, 0xf

    move-object/from16 v50, v6

    move/from16 v49, v7

    and-long v6, v2, v47

    long-to-int v7, v6

    .line 585
    aget-char v6, v36, v7

    aput-char v6, v1, v41

    const/4 v6, 0x4

    ushr-long/2addr v2, v6

    add-int/lit8 v41, v41, -0x1

    move/from16 v7, v49

    move-object/from16 v6, v50

    goto :goto_1

    :cond_1
    move-object/from16 v50, v6

    move/from16 v49, v7

    const/16 v2, 0x20

    .line 588
    aput-char v2, v1, v40

    add-int/lit8 v3, v40, 0x1

    .line 589
    aput-char v2, v1, v3

    add-int/lit8 v3, v40, 0x2

    .line 590
    aput-char v2, v1, v3

    add-int/lit8 v3, v40, 0x3

    .line 591
    aput-char v2, v1, v3

    add-int/lit8 v2, v40, 0x4

    const/16 v3, 0x2e

    .line 592
    aput-char v3, v1, v2

    add-int/lit8 v6, v40, 0x5

    const/4 v3, 0x0

    int-to-float v7, v5

    .line 102
    iget-object v2, v0, Ll/ۙܰܿ;->ۢ:[C

    move-object/from16 v1, p1

    move/from16 v36, v4

    move v4, v6

    move/from16 v40, v5

    move/from16 v5, v34

    move-object/from16 v41, v50

    move v6, v7

    move/from16 v46, v10

    move/from16 v10, v49

    move-object/from16 v7, v41

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->drawText([CIIFFLandroid/graphics/Paint;)V

    add-int v5, v40, v15

    add-int/lit8 v4, v36, 0x1

    move v7, v10

    move-object/from16 v6, v41

    move/from16 v10, v46

    goto :goto_0

    :cond_2
    move-object/from16 v41, v6

    move/from16 v46, v10

    move v10, v7

    .line 107
    invoke-virtual {v11}, Ll/ۧܰܿ;->᩷()I

    move-result v7

    .line 108
    invoke-virtual {v11}, Ll/ۧܰܿ;->ۜ()I

    move-result v6

    .line 109
    invoke-virtual {v11}, Ll/ۧܰܿ;->ۡ()Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 v2, -0x1

    move/from16 v5, v42

    const/4 v4, -0x1

    goto :goto_2

    :cond_3
    move/from16 v5, v42

    div-int v2, v7, v5

    move v4, v2

    :goto_2
    const/4 v2, 0x0

    .line 113
    iput-boolean v2, v0, Ll/ۙܰܿ;->ᩳ:Z

    move-wide/from16 v2, v44

    long-to-int v1, v2

    move/from16 v42, v5

    move/from16 v28, v6

    int-to-long v5, v1

    cmp-long v40, v2, v5

    if-nez v40, :cond_29

    move v6, v1

    move v5, v14

    const/4 v1, 0x1

    :goto_3
    if-gt v5, v10, :cond_6

    if-ne v5, v4, :cond_4

    .line 117
    iput-boolean v1, v0, Ll/ۙܰܿ;->ᩳ:Z

    .line 118
    iget v1, v12, Ll/ۤ᩺ܿ;->ܽ:I

    move-object/from16 v3, v41

    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v2, v6

    move/from16 v27, v4

    move/from16 v1, v35

    int-to-float v4, v1

    add-int v1, v6, v15

    int-to-float v1, v1

    move/from16 v8, v35

    move/from16 v35, v1

    move-object/from16 v1, p1

    move/from16 v40, v2

    move/from16 v2, v16

    move/from16 v3, v40

    move/from16 v40, v13

    move/from16 v13, v27

    move/from16 v27, v9

    move/from16 v9, v42

    move/from16 v42, v5

    move/from16 v5, v35

    move/from16 v51, v28

    move/from16 v28, v7

    move v7, v6

    move-object/from16 v6, v41

    .line 119
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_4

    :cond_4
    move/from16 v27, v9

    move/from16 v40, v13

    move/from16 v51, v28

    move/from16 v8, v35

    move/from16 v9, v42

    move v13, v4

    move/from16 v42, v5

    move/from16 v28, v7

    move v7, v6

    .line 120
    rem-int/lit8 v5, v42, 0x2

    if-eqz v5, :cond_5

    .line 121
    iget v1, v12, Ll/ۤ᩺ܿ;->᩵:I

    move-object/from16 v6, v41

    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v3, v7

    int-to-float v4, v8

    add-int v1, v7, v15

    int-to-float v5, v1

    move-object/from16 v1, p1

    move/from16 v2, v16

    .line 122
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_4

    .line 124
    :cond_5
    iget v1, v12, Ll/ۤ᩺ܿ;->ᩴ:I

    move-object/from16 v6, v41

    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v3, v7

    int-to-float v4, v8

    add-int v1, v7, v15

    int-to-float v5, v1

    move-object/from16 v1, p1

    move/from16 v2, v16

    .line 125
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :goto_4
    add-int v6, v7, v15

    add-int/lit8 v5, v42, 0x1

    const/4 v1, 0x1

    move/from16 v35, v8

    move/from16 v42, v9

    move v4, v13

    move/from16 v9, v27

    move/from16 v7, v28

    move/from16 v13, v40

    move/from16 v28, v51

    move-object/from16 v8, p1

    goto/16 :goto_3

    :cond_6
    move/from16 v27, v9

    move/from16 v40, v13

    move/from16 v51, v28

    move/from16 v8, v35

    move/from16 v9, v42

    move v13, v4

    move/from16 v28, v7

    .line 135
    invoke-virtual {v11}, Ll/ۧܰܿ;->ۡ()Z

    move-result v1

    const/4 v7, 0x0

    const/high16 v35, 0x3fc00000    # 1.5f

    const/high16 v42, 0x40400000    # 3.0f

    if-nez v1, :cond_d

    if-gt v14, v13, :cond_b

    if-gt v13, v10, :cond_b

    const/4 v1, 0x1

    .line 138
    iput-boolean v1, v0, Ll/ۙܰܿ;->ܿ:Z

    .line 139
    rem-int v1, v28, v9

    int-to-long v2, v13

    mul-long v2, v2, v31

    add-long v2, v2, v25

    sub-long v2, v2, v17

    long-to-int v13, v2

    int-to-long v4, v13

    cmp-long v6, v2, v4

    if-nez v6, :cond_a

    int-to-float v1, v1

    mul-float v17, v1, v39

    mul-float v1, v17, v42

    add-float v1, v1, v16

    .line 143
    invoke-virtual {v11}, Ll/ۧܰܿ;->ܺ()Z

    move-result v2

    if-eqz v2, :cond_7

    add-float v1, v1, v39

    goto :goto_5

    :cond_7
    add-float v4, v39, v39

    add-float/2addr v1, v4

    :goto_5
    move/from16 v18, v1

    if-eqz p2, :cond_8

    .line 150
    iget v1, v12, Ll/ۤ᩺ܿ;->ۙ:I

    move-object/from16 v6, v41

    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v3, v13

    add-float v4, v18, v42

    add-int v1, v13, v15

    int-to-float v5, v1

    move-object/from16 v1, p1

    move/from16 v2, v18

    .line 151
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_8
    move/from16 v6, p3

    .line 154
    iput-boolean v6, v0, Ll/ۙܰܿ;->ܺ:Z

    if-eqz v6, :cond_9

    .line 156
    iget-object v1, v12, Ll/ۤ᩺ܿ;->ۗ:Landroid/graphics/drawable/Drawable;

    .line 157
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    sub-float v3, v18, v2

    add-float v3, v3, v42

    add-int v4, v13, v15

    int-to-float v4, v4

    add-float v2, v18, v2

    .line 161
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v5

    int-to-float v5, v5

    add-float/2addr v5, v4

    .line 162
    iget-object v6, v0, Ll/ۙܰܿ;->ۘ:Landroid/graphics/RectF;

    invoke-virtual {v6, v3, v4, v2, v5}, Landroid/graphics/RectF;->set(FFFF)V

    float-to-int v3, v3

    float-to-int v4, v4

    float-to-int v2, v2

    float-to-int v5, v5

    .line 163
    invoke-virtual {v1, v3, v4, v2, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    move-object/from16 v18, v1

    goto :goto_6

    :cond_9
    const/high16 v6, 0x40800000    # 4.0f

    move-object/from16 v18, v7

    :goto_6
    const/high16 v20, 0x40800000    # 4.0f

    add-float v2, v24, v17

    .line 167
    iget v1, v12, Ll/ۤ᩺ܿ;->᩹:I

    move-object/from16 v6, v41

    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v3, v13

    add-float v4, v2, v39

    add-int/2addr v13, v15

    int-to-float v5, v13

    move-object/from16 v1, p1

    move-object v13, v6

    .line 168
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    move/from16 v48, v8

    move/from16 v49, v10

    move-object/from16 v47, v11

    move-object/from16 v10, v18

    move-object v8, v7

    goto/16 :goto_d

    .line 0
    :cond_a
    new-instance v1, Ljava/lang/ArithmeticException;

    invoke-direct {v1}, Ljava/lang/ArithmeticException;-><init>()V

    throw v1

    :cond_b
    move-object/from16 v13, v41

    const/high16 v1, 0x40800000    # 4.0f

    :cond_c
    move/from16 v48, v8

    move/from16 v49, v10

    move-object/from16 v47, v11

    const/high16 v20, 0x40800000    # 4.0f

    goto/16 :goto_c

    :cond_d
    move/from16 v6, p3

    move-object/from16 v13, v41

    const/high16 v41, 0x40800000    # 4.0f

    .line 171
    div-int v1, v28, v9

    move/from16 v5, v51

    .line 172
    div-int v2, v5, v9

    if-gt v14, v1, :cond_e

    if-le v1, v10, :cond_10

    :cond_e
    if-gt v14, v2, :cond_f

    if-le v2, v10, :cond_10

    :cond_f
    if-ge v1, v14, :cond_c

    if-le v2, v10, :cond_c

    .line 177
    :cond_10
    iget v1, v12, Ll/ۤ᩺ܿ;->᩹:I

    invoke-virtual {v13, v1}, Landroid/graphics/Paint;->setColor(I)V

    move-object/from16 v44, v7

    move-object/from16 v45, v44

    move v7, v14

    :goto_7
    if-gt v7, v10, :cond_1a

    int-to-long v1, v7

    mul-long v1, v1, v31

    add-long v1, v1, v25

    sub-long v1, v1, v17

    long-to-int v3, v1

    move/from16 v49, v10

    move-object/from16 v47, v11

    int-to-long v10, v3

    cmp-long v4, v1, v10

    if-nez v4, :cond_19

    mul-int v1, v7, v9

    add-int v2, v1, v9

    add-int/lit8 v2, v2, -0x1

    move/from16 v10, v28

    if-gt v1, v10, :cond_11

    if-le v10, v2, :cond_13

    :cond_11
    if-gt v1, v5, :cond_12

    if-le v5, v2, :cond_13

    :cond_12
    if-ge v10, v1, :cond_17

    if-le v5, v2, :cond_17

    :cond_13
    if-lt v10, v1, :cond_14

    .line 190
    iput-boolean v6, v0, Ll/ۙܰܿ;->ܺ:Z

    const/4 v1, 0x1

    .line 191
    iput-boolean v1, v0, Ll/ۙܰܿ;->ܿ:Z

    move v11, v6

    move v4, v10

    goto :goto_8

    :cond_14
    const/4 v4, 0x1

    const/4 v11, 0x0

    move v4, v1

    const/4 v1, 0x1

    :goto_8
    if-gt v5, v2, :cond_15

    .line 196
    iput-boolean v6, v0, Ll/ۙܰܿ;->ܺ:Z

    .line 197
    iput-boolean v1, v0, Ll/ۙܰܿ;->ܿ:Z

    move v2, v5

    move/from16 v28, v6

    goto :goto_9

    :cond_15
    const/4 v1, 0x0

    const/16 v28, 0x0

    .line 199
    :goto_9
    rem-int/2addr v4, v9

    int-to-float v1, v4

    mul-float v1, v1, v39

    mul-float v4, v1, v42

    add-float v4, v4, v16

    add-float v48, v4, v39

    .line 200
    rem-int/2addr v2, v9

    int-to-float v2, v2

    mul-float v2, v2, v39

    mul-float v4, v2, v42

    add-float v4, v4, v16

    mul-float v50, v39, v42

    add-float v50, v50, v4

    add-float v51, v24, v1

    add-float v2, v24, v2

    add-float v52, v2, v39

    int-to-float v4, v3

    add-int/2addr v3, v15

    int-to-float v3, v3

    move-object/from16 v1, p1

    move/from16 v2, v48

    move/from16 p2, v3

    move v3, v4

    move/from16 v53, v4

    move/from16 v4, v50

    move/from16 v54, v5

    move/from16 v5, p2

    move-object v6, v13

    .line 203
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    move/from16 v2, v51

    move/from16 v3, v53

    move/from16 v4, v52

    .line 204
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    if-eqz v11, :cond_16

    .line 206
    iget-object v1, v12, Ll/ۤ᩺ܿ;->۬:Landroid/graphics/drawable/Drawable;

    .line 207
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    mul-int/lit8 v2, v2, 0x3

    div-int/lit8 v2, v2, 0x4

    int-to-float v2, v2

    sub-float v48, v48, v2

    mul-float v6, v20, v35

    sub-float v2, v48, v6

    .line 209
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v3, v2

    .line 210
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    int-to-float v4, v4

    move/from16 v5, p2

    add-float/2addr v4, v5

    float-to-int v6, v2

    float-to-int v11, v5

    move/from16 v48, v8

    float-to-int v8, v3

    move/from16 v51, v10

    float-to-int v10, v4

    .line 211
    invoke-virtual {v1, v6, v11, v8, v10}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 212
    iget-object v6, v0, Ll/ۙܰܿ;->ᩴ:Landroid/graphics/RectF;

    invoke-virtual {v6, v2, v5, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    move-object/from16 v45, v1

    goto :goto_a

    :cond_16
    move/from16 v5, p2

    move/from16 v48, v8

    move/from16 v51, v10

    :goto_a
    if-eqz v28, :cond_18

    .line 215
    iget-object v1, v12, Ll/ۤ᩺ܿ;->۫:Landroid/graphics/drawable/Drawable;

    .line 216
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    int-to-float v2, v2

    div-float v2, v2, v41

    sub-float v50, v50, v2

    mul-float v6, v20, v35

    add-float v6, v6, v50

    .line 218
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v2, v6

    .line 219
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v3, v5

    float-to-int v4, v6

    float-to-int v8, v5

    float-to-int v10, v2

    float-to-int v11, v3

    .line 220
    invoke-virtual {v1, v4, v8, v10, v11}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 221
    iget-object v4, v0, Ll/ۙܰܿ;->᩵:Landroid/graphics/RectF;

    invoke-virtual {v4, v6, v5, v2, v3}, Landroid/graphics/RectF;->set(FFFF)V

    move-object/from16 v44, v1

    goto :goto_b

    :cond_17
    move/from16 v54, v5

    move/from16 v48, v8

    move/from16 v51, v10

    :cond_18
    :goto_b
    add-int/lit8 v7, v7, 0x1

    move/from16 v6, p3

    move-object/from16 v11, v47

    move/from16 v8, v48

    move/from16 v10, v49

    move/from16 v28, v51

    move/from16 v5, v54

    goto/16 :goto_7

    .line 0
    :cond_19
    new-instance v1, Ljava/lang/ArithmeticException;

    invoke-direct {v1}, Ljava/lang/ArithmeticException;-><init>()V

    throw v1

    :cond_1a
    move/from16 v48, v8

    move/from16 v49, v10

    move-object/from16 v47, v11

    move-object/from16 v8, v44

    move-object/from16 v10, v45

    const/high16 v20, 0x40800000    # 4.0f

    goto :goto_d

    :goto_c
    move-object v8, v7

    move-object v10, v8

    :goto_d
    move v7, v14

    move/from16 v11, v21

    move/from16 v6, v49

    :goto_e
    if-gt v7, v6, :cond_1d

    add-float v4, v16, v39

    sub-int v1, v7, v14

    mul-int v1, v1, v9

    add-int v3, v1, v9

    move/from16 v5, v27

    .line 235
    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    move/from16 v17, v4

    move/from16 v18, v24

    move v4, v1

    :goto_f
    if-ge v4, v3, :cond_1c

    .line 237
    iget-object v1, v0, Ll/ۙܰܿ;->ܽ:[Z

    aget-boolean v1, v1, v4

    if-eqz v1, :cond_1b

    iget v1, v12, Ll/ۤ᩺ܿ;->֫:I

    goto :goto_10

    :cond_1b
    iget v1, v12, Ll/ۤ᩺ܿ;->ۙ:I

    :goto_10
    invoke-virtual {v13, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 238
    iget-object v1, v0, Ll/ۙܰܿ;->ܳ:[B

    aget-byte v1, v1, v4

    and-int/lit16 v2, v1, 0xff

    ushr-int/lit8 v21, v2, 0x4

    .line 239
    aget-char v21, v36, v21

    move/from16 p2, v3

    iget-object v3, v0, Ll/ۙܰܿ;->ۧ:[C

    const/16 v25, 0x0

    aput-char v21, v3, v25

    and-int/lit8 v1, v1, 0xf

    .line 240
    aget-char v1, v36, v1

    const/16 v21, 0x1

    aput-char v1, v3, v21

    .line 241
    iget-object v1, v0, Ll/ۙܰܿ;->֫:[C

    int-to-char v2, v2

    aput-char v2, v1, v25

    int-to-float v2, v11

    const/16 v21, 0x0

    const/16 v25, 0x2

    move-object/from16 v1, p1

    move/from16 v26, v2

    move-object v2, v3

    move/from16 v27, p2

    move/from16 v3, v21

    move/from16 v28, v4

    move/from16 v4, v25

    move/from16 v25, v5

    move/from16 v5, v17

    move/from16 v41, v6

    move/from16 v6, v26

    move/from16 v44, v7

    move-object v7, v13

    .line 242
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->drawText([CIIFFLandroid/graphics/Paint;)V

    const/4 v4, 0x1

    .line 243
    iget-object v2, v0, Ll/ۙܰܿ;->֫:[C

    move/from16 v5, v18

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->drawText([CIIFFLandroid/graphics/Paint;)V

    mul-float v4, v39, v42

    add-float v17, v4, v17

    add-float v18, v18, v39

    add-int/lit8 v4, v28, 0x1

    move/from16 v5, v25

    move/from16 v3, v27

    move/from16 v6, v41

    move/from16 v7, v44

    goto :goto_f

    :cond_1c
    move/from16 v25, v5

    move/from16 v41, v6

    move/from16 v44, v7

    add-int/2addr v11, v15

    add-int/lit8 v7, v44, 0x1

    move/from16 v27, v25

    goto/16 :goto_e

    .line 253
    :cond_1d
    iget v1, v12, Ll/ۤ᩺ܿ;->֨:I

    invoke-virtual {v13, v1}, Landroid/graphics/Paint;->setColor(I)V

    mul-float v4, v39, v42

    mul-float v7, v4, v20

    move-wide/from16 v25, v37

    move-wide/from16 v27, v31

    .line 255
    invoke-static/range {v25 .. v32}, Ll/۠ۢ֡;->֫(JJJJ)J

    move-result-wide v1

    long-to-int v11, v1

    int-to-long v3, v11

    cmp-long v5, v1, v3

    if-nez v5, :cond_28

    .line 258
    invoke-virtual/range {v47 .. v47}, Ll/ۧܰܿ;->ܽ()I

    move-result v1

    int-to-long v1, v1

    mul-long v1, v1, v37

    .line 259
    invoke-virtual/range {v47 .. v47}, Ll/ۧܰܿ;->ᩳ()I

    move-result v14

    const/4 v3, 0x0

    move/from16 v17, v16

    const/4 v6, 0x0

    :goto_11
    if-ge v6, v9, :cond_21

    if-nez v6, :cond_1e

    move/from16 v5, v40

    goto :goto_13

    :cond_1e
    int-to-long v3, v14

    cmp-long v5, v1, v3

    if-gtz v5, :cond_1f

    int-to-float v3, v11

    goto :goto_12

    :cond_1f
    sub-int v3, v11, v15

    int-to-float v3, v3

    :goto_12
    move v5, v3

    :goto_13
    const-wide/16 v3, 0x4

    add-long v20, v1, v3

    move/from16 v4, v43

    int-to-float v3, v4

    move-object/from16 v1, p1

    move/from16 v2, v17

    move/from16 v18, v11

    move v11, v4

    move/from16 v4, v17

    move/from16 v25, v6

    move-object v6, v13

    .line 271
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    if-nez v25, :cond_20

    add-float v17, v17, v34

    :cond_20
    add-float v17, v17, v7

    add-int/lit8 v6, v25, 0x4

    move/from16 v43, v11

    move/from16 v11, v18

    move-wide/from16 v1, v20

    goto :goto_11

    :cond_21
    move/from16 v11, v43

    add-float v7, v17, v39

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float v4, v39, v1

    .line 281
    iget v1, v12, Ll/ۤ᩺ܿ;->֡:I

    invoke-virtual {v13, v1}, Landroid/graphics/Paint;->setColor(I)V

    sub-float v14, v7, v4

    int-to-float v6, v11

    move-object/from16 v1, p1

    move v2, v14

    move v3, v6

    move v4, v7

    move/from16 v5, v40

    move/from16 v17, v6

    move-object v6, v13

    .line 282
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 283
    iget v1, v12, Ll/ۤ᩺ܿ;->֨:I

    invoke-virtual {v13, v1}, Landroid/graphics/Paint;->setColor(I)V

    move-object/from16 v1, p1

    move/from16 v3, v17

    move v4, v14

    .line 284
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move v2, v7

    move v4, v7

    .line 285
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move-object/from16 v7, p1

    move/from16 v14, v48

    if-eqz v10, :cond_22

    .line 290
    invoke-virtual {v10, v7}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_22
    if-eqz v8, :cond_23

    .line 292
    invoke-virtual {v8, v7}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_23
    const/4 v1, 0x0

    cmpl-float v1, p4, v1

    if-lez v1, :cond_26

    .line 297
    invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getHeight()I

    move-result v1

    sub-int/2addr v1, v11

    .line 298
    invoke-virtual/range {p0 .. p0}, Ll/ۙܰܿ;->ܽ()J

    move-result-wide v2

    int-to-long v4, v1

    add-long v20, v2, v4

    const-wide/16 v25, 0x0

    cmp-long v1, v2, v25

    if-lez v1, :cond_26

    .line 302
    invoke-virtual/range {v19 .. v19}, Ll/ۜܰܿ;->ܿ()J

    move-result-wide v18

    const-wide/16 v25, 0x2710

    mul-long v18, v18, v25

    .line 304
    div-long v1, v18, v2

    long-to-float v1, v1

    const v2, 0x461c4000    # 10000.0f

    div-float v8, v1, v2

    .line 305
    div-long v1, v20, v4

    const-wide/16 v18, 0x3

    const v10, 0xffffff

    cmp-long v3, v1, v18

    if-lez v3, :cond_25

    .line 308
    iget v1, v12, Ll/ۤ᩺ܿ;->ۢ:I

    and-int v2, v1, v10

    ushr-int/lit8 v1, v1, 0x18

    and-int/lit16 v1, v1, 0xff

    int-to-float v1, v1

    mul-float v1, v1, p4

    float-to-int v1, v1

    shl-int/lit8 v1, v1, 0x18

    or-int/2addr v1, v2

    .line 312
    invoke-virtual {v13, v1}, Landroid/graphics/Paint;->setColor(I)V

    mul-float v1, v22, p4

    .line 314
    iget v6, v12, Ll/ۤ᩺ܿ;->ۜ:F

    int-to-float v5, v14

    sub-float v18, v5, v1

    move-object/from16 v1, p1

    move/from16 v2, v18

    move/from16 v3, v17

    move v4, v5

    move/from16 v55, v5

    move/from16 v5, v40

    move/from16 v56, v6

    move-object v6, v13

    .line 315
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    if-eqz p5, :cond_24

    .line 317
    iget v1, v12, Ll/ۤ᩺ܿ;->᩻:I

    goto :goto_14

    :cond_24
    iget v1, v12, Ll/ۤ᩺ܿ;->ܳ:I

    :goto_14
    and-int v2, v1, v10

    ushr-int/lit8 v1, v1, 0x18

    and-int/lit16 v1, v1, 0xff

    int-to-float v1, v1

    mul-float v1, v1, p4

    float-to-int v1, v1

    shl-int/lit8 v1, v1, 0x18

    or-int/2addr v1, v2

    .line 321
    invoke-virtual {v13, v1}, Landroid/graphics/Paint;->setColor(I)V

    move/from16 v1, v46

    int-to-double v1, v1

    int-to-double v3, v11

    sub-double/2addr v1, v3

    move/from16 v3, v56

    float-to-double v4, v3

    sub-double/2addr v1, v4

    float-to-double v4, v8

    mul-double v1, v1, v4

    double-to-int v1, v1

    add-int v5, v11, v1

    mul-float v1, v22, v35

    move/from16 v4, v55

    sub-float v1, v4, v1

    int-to-float v5, v5

    add-float v6, v5, v3

    .line 325
    iget-object v2, v0, Ll/ۙܰܿ;->ۜ:Ll/ܳ᩸ۡ;

    invoke-virtual {v2, v1, v5, v4, v6}, Ll/ܳ᩸ۡ;->֫(FFFF)V

    move-object/from16 v1, p1

    move/from16 v2, v18

    move v3, v5

    move v5, v6

    move-object v6, v13

    .line 326
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    const/4 v1, 0x1

    goto :goto_15

    :cond_25
    move/from16 v1, v46

    .line 328
    iget v2, v12, Ll/ۤ᩺ܿ;->ܶ:I

    and-int v3, v2, v10

    ushr-int/lit8 v2, v2, 0x18

    and-int/lit16 v2, v2, 0xff

    int-to-float v2, v2

    mul-float v2, v2, p4

    float-to-int v2, v2

    shl-int/lit8 v2, v2, 0x18

    or-int/2addr v2, v3

    .line 331
    invoke-virtual {v13, v2}, Landroid/graphics/Paint;->setColor(I)V

    mul-long v4, v4, v4

    .line 332
    div-long v4, v4, v20

    long-to-float v2, v4

    sub-int/2addr v1, v11

    int-to-float v1, v1

    sub-float/2addr v1, v2

    mul-float v1, v1, v8

    float-to-int v1, v1

    add-int v5, v11, v1

    int-to-float v4, v14

    .line 334
    iget v1, v12, Ll/ۤ᩺ܿ;->᩸:F

    sub-float v3, v4, v1

    int-to-float v5, v5

    add-float v6, v5, v2

    move-object/from16 v1, p1

    move v2, v3

    move v3, v5

    move v5, v6

    move-object v6, v13

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_26
    const/4 v1, 0x0

    .line 338
    :goto_15
    iput-boolean v1, v0, Ll/ۙܰܿ;->᩷:Z

    .line 342
    iget v1, v12, Ll/ۤ᩺ܿ;->֡:I

    invoke-virtual {v13, v1}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v8, v14

    const/4 v10, 0x0

    const/4 v3, 0x0

    move-object/from16 v1, p1

    move v2, v10

    move v4, v8

    move/from16 v5, v17

    move-object v6, v13

    .line 343
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 344
    iget v1, v12, Ll/ۤ᩺ܿ;->ۨ:I

    invoke-virtual {v13, v1}, Landroid/graphics/Paint;->setColor(I)V

    add-int/lit8 v5, v11, -0x1

    int-to-float v3, v5

    add-int/lit8 v5, v11, 0x1

    int-to-float v5, v5

    move-object/from16 v1, p1

    .line 345
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 347
    iget v1, v12, Ll/ۤ᩺ܿ;->ۛ:F

    div-float v8, v1, v33

    .line 348
    iget v1, v12, Ll/ۤ᩺ܿ;->ۤ:I

    sub-int v10, v11, v1

    .line 349
    div-int/lit8 v11, v1, 0x4

    const/4 v1, 0x0

    move/from16 v14, v24

    const/4 v12, 0x0

    :goto_16
    if-ge v12, v9, :cond_27

    mul-int/lit8 v1, v12, 0x3

    add-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    mul-float v1, v1, v39

    add-float v1, v1, v16

    sub-float v18, v1, v8

    add-float v4, v1, v8

    int-to-float v6, v10

    move-object/from16 v1, p1

    move/from16 v2, v18

    move v3, v6

    move/from16 v5, v17

    move/from16 v19, v6

    move-object v6, v13

    .line 357
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 358
    sget-object v20, Ll/ۙܰܿ;->֨:[Ljava/lang/String;

    aget-object v1, v20, v12

    sub-float v2, v18, v34

    sub-int v3, v10, v15

    add-int v3, v3, v23

    add-int/2addr v3, v11

    int-to-float v6, v3

    invoke-virtual {v7, v1, v2, v6, v13}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    add-float v1, v14, v34

    sub-float v2, v1, v8

    add-float v4, v1, v8

    move-object/from16 v1, p1

    move/from16 v3, v19

    move v0, v6

    move-object v6, v13

    .line 363
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 364
    aget-object v1, v20, v12

    invoke-virtual {v7, v1, v14, v0, v13}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    add-float v14, v14, v39

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v0, p0

    goto :goto_16

    :cond_27
    return-void

    .line 0
    :cond_28
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0

    :cond_29
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0

    :cond_2a
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0

    :cond_2b
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0

    :cond_2c
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0

    :cond_2d
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0
.end method

.method public final ֫(Ll/ۨ۟ܿ;)Z
    .locals 14

    .line 922
    iget-object v0, p0, Ll/ۙܰܿ;->᩻:Ll/ۜܰܿ;

    iget-object v1, v0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v1}, Ll/ۧܰܿ;->᩷()I

    move-result v1

    .line 926
    iget-object v2, v0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v2}, Ll/ۧܰܿ;->ۜ()I

    move-result v3

    .line 389
    invoke-virtual {v2}, Ll/ۧܰܿ;->ܽ()I

    move-result v4

    .line 390
    iget-object v0, v0, Ll/ۜܰܿ;->ۙ:Ll/ۤ᩺ܿ;

    iget v5, v0, Ll/ۤ᩺ܿ;->ۡ:I

    .line 391
    iget v0, v0, Ll/ۤ᩺ܿ;->ۧ:F

    .line 392
    invoke-virtual {v2}, Ll/ۧܰܿ;->᩻()I

    move-result v6

    add-int/lit8 v6, v6, 0x1

    int-to-float v6, v6

    mul-float v6, v6, v0

    float-to-int v6, v6

    .line 393
    div-int v7, v1, v4

    if-ne v1, v3, :cond_1

    .line 396
    invoke-virtual {p0}, Ll/ۙܰܿ;->᩻()I

    move-result v3

    int-to-long v8, v3

    int-to-long v10, v5

    const/4 v3, 0x1

    int-to-long v12, v7

    mul-long v12, v12, v10

    add-long/2addr v12, v8

    add-long/2addr v10, v12

    .line 398
    rem-int/2addr v1, v4

    mul-int/lit8 v1, v1, 0x3

    add-int/lit8 v4, v1, 0x1

    .line 399
    invoke-virtual {v2}, Ll/ۧܰܿ;->ܺ()Z

    move-result v2

    if-nez v2, :cond_0

    add-int/lit8 v4, v1, 0x2

    :cond_0
    int-to-float v1, v6

    int-to-float v2, v4

    mul-float v2, v2, v0

    add-float/2addr v2, v1

    float-to-int v0, v2

    .line 10
    iput v0, p1, Ll/ۨ۟ܿ;->ۧ:I

    .line 11
    iput-wide v12, p1, Ll/ۨ۟ܿ;->ᩳ:J

    .line 12
    iput v0, p1, Ll/ۨ۟ܿ;->ܽ:I

    .line 13
    iput-wide v10, p1, Ll/ۨ۟ܿ;->֫:J

    return v3

    :cond_1
    const/4 v2, 0x1

    sub-int v8, v3, v1

    if-lt v8, v4, :cond_2

    goto :goto_0

    .line 409
    :cond_2
    div-int v8, v3, v4

    if-eq v7, v8, :cond_3

    :goto_0
    const/4 p1, 0x0

    return p1

    .line 414
    :cond_3
    invoke-virtual {p0}, Ll/ۙܰܿ;->᩻()I

    move-result v8

    int-to-long v8, v8

    int-to-long v10, v5

    int-to-long v12, v7

    mul-long v12, v12, v10

    add-long/2addr v12, v8

    add-long/2addr v10, v12

    .line 416
    rem-int/2addr v1, v4

    mul-int/lit8 v1, v1, 0x3

    add-int/2addr v1, v2

    int-to-float v1, v1

    mul-float v1, v1, v0

    float-to-int v1, v1

    add-int/2addr v1, v6

    .line 417
    rem-int/2addr v3, v4

    mul-int/lit8 v3, v3, 0x3

    add-int/lit8 v3, v3, 0x3

    int-to-float v3, v3

    mul-float v3, v3, v0

    float-to-int v0, v3

    add-int/2addr v6, v0

    .line 10
    iput v1, p1, Ll/ۨ۟ܿ;->ۧ:I

    .line 11
    iput-wide v12, p1, Ll/ۨ۟ܿ;->ᩳ:J

    .line 12
    iput v6, p1, Ll/ۨ۟ܿ;->ܽ:I

    .line 13
    iput-wide v10, p1, Ll/ۨ۟ܿ;->֫:J

    return v2
.end method

.method public final ۖ()Z
    .locals 1

    .line 578
    iget-boolean v0, p0, Ll/ۙܰܿ;->ۖ:Z

    return v0
.end method

.method public final ۘ()Z
    .locals 1

    .line 476
    iget-boolean v0, p0, Ll/ۙܰܿ;->ܺ:Z

    return v0
.end method

.method public final ۜ()F
    .locals 2

    .line 507
    invoke-virtual {p0}, Ll/ۙܰܿ;->᩻()I

    move-result v0

    iget v1, p0, Ll/ۙܰܿ;->֡:I

    add-int/2addr v0, v1

    int-to-float v0, v0

    return v0
.end method

.method public final ۡ()Z
    .locals 1

    .line 480
    iget-boolean v0, p0, Ll/ۙܰܿ;->᩷:Z

    return v0
.end method

.method public final ۢ()Z
    .locals 1

    .line 427
    iget-boolean v0, p0, Ll/ۙܰܿ;->ܿ:Z

    return v0
.end method

.method public final ۧ(I)J
    .locals 5

    .line 447
    iget-object v0, p0, Ll/ۙܰܿ;->᩻:Ll/ۜܰܿ;

    iget-object v0, v0, Ll/ۜܰܿ;->ۙ:Ll/ۤ᩺ܿ;

    int-to-long v1, p1

    .line 448
    iget p1, v0, Ll/ۤ᩺ܿ;->ۡ:I

    int-to-long v3, p1

    mul-long v1, v1, v3

    return-wide v1
.end method

.method public final ۧ()Ll/ܳ᩸ۡ;
    .locals 1

    .line 443
    iget-object v0, p0, Ll/ۙܰܿ;->ۜ:Ll/ܳ᩸ۡ;

    return-object v0
.end method

.method public final ܳ()Landroid/graphics/RectF;
    .locals 1

    .line 439
    iget-object v0, p0, Ll/ۙܰܿ;->᩵:Landroid/graphics/RectF;

    return-object v0
.end method

.method public final ܺ()Z
    .locals 1

    .line 561
    iget-boolean v0, p0, Ll/ۙܰܿ;->ۡ:Z

    return v0
.end method

.method public final ܽ()J
    .locals 2

    .line 457
    iget-object v0, p0, Ll/ۙܰܿ;->᩻:Ll/ۜܰܿ;

    iget-object v0, v0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    .line 458
    invoke-virtual {v0}, Ll/ۧܰܿ;->ܳ()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/ۙܰܿ;->֫(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ܿ()Landroid/graphics/RectF;
    .locals 1

    .line 435
    iget-object v0, p0, Ll/ۙܰܿ;->ᩴ:Landroid/graphics/RectF;

    return-object v0
.end method

.method public final ᩳ()Landroid/graphics/RectF;
    .locals 1

    .line 431
    iget-object v0, p0, Ll/ۙܰܿ;->ۘ:Landroid/graphics/RectF;

    return-object v0
.end method

.method public final ᩷()Z
    .locals 1

    .line 423
    iget-boolean v0, p0, Ll/ۙܰܿ;->ᩳ:Z

    return v0
.end method

.method public final ᩻()I
    .locals 2

    .line 462
    iget-object v0, p0, Ll/ۙܰܿ;->᩻:Ll/ۜܰܿ;

    iget-object v0, v0, Ll/ۜܰܿ;->ۙ:Ll/ۤ᩺ܿ;

    .line 463
    iget v1, v0, Ll/ۤ᩺ܿ;->ۡ:I

    iget v0, v0, Ll/ۤ᩺ܿ;->ۤ:I

    add-int/2addr v1, v0

    add-int/lit8 v1, v1, 0x1

    return v1
.end method
