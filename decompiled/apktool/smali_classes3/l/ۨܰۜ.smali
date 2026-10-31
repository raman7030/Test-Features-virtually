.class public final Ll/ۨܰۜ;
.super Ljava/lang/Object;
.source "B6MI"


# instance fields
.field public ֡:F

.field public ֨:I

.field public ֫:F

.field public ۖ:F

.field public ۘ:D

.field public ۚ:I

.field public ۜ:D

.field public ۡ:D

.field public ۢ:D

.field public ۧ:D

.field public ܳ:D

.field public ܺ:D

.field public ܽ:I

.field public ܿ:F

.field public ᩳ:I

.field public ᩴ:F

.field public ᩵:F

.field public ᩷:D

.field public ᩻:D


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 17
    iput v0, p0, Ll/ۨܰۜ;->֫:F

    .line 18
    iput v0, p0, Ll/ۨܰۜ;->ᩴ:F

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    .line 22
    iput-wide v1, p0, Ll/ۨܰۜ;->ܺ:D

    .line 27
    iput v0, p0, Ll/ۨܰۜ;->ܿ:F

    return-void
.end method

.method public static ֫(DFF)F
    .locals 2

    float-to-double v0, p2

    float-to-double p2, p3

    .line 412
    invoke-static {p2, p3, p0, p1}, Ljava/lang/Math;->min(DD)D

    move-result-wide p0

    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->max(DD)D

    move-result-wide p0

    double-to-float p0, p0

    return p0
.end method

.method private ֫(IDD)F
    .locals 8

    .line 325
    invoke-virtual {p0}, Ll/ۨܰۜ;->۠()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    sub-double v0, p4, p2

    .line 327
    iget v7, p0, Ll/ۨܰۜ;->ᩴ:F

    float-to-double v2, v7

    mul-double v0, v0, v2

    int-to-double v2, p1

    cmpg-double v4, v0, v2

    if-gtz v4, :cond_1

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    .line 328
    invoke-static/range {v2 .. v7}, Ll/ۨܰۜ;->֫(IDDF)F

    move-result p1

    return p1

    :cond_1
    neg-double p1, p2

    float-to-double p3, v7

    mul-double p1, p1, p3

    double-to-float p1, p1

    return p1
.end method

.method public static ֫(IDDF)F
    .locals 4

    int-to-double v0, p0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    mul-double v0, v0, v2

    add-double/2addr p1, p3

    float-to-double p3, p5

    mul-double p1, p1, p3

    mul-double p1, p1, v2

    sub-double/2addr v0, p1

    double-to-float p0, v0

    return p0
.end method

.method private ֫(DDDDZ)V
    .locals 9

    move-object v0, p0

    .line 336
    iget-wide v1, v0, Ll/ۨܰۜ;->ܺ:D

    mul-double v3, v1, p1

    iget-wide v5, v0, Ll/ۨܰۜ;->ۘ:D

    mul-double v7, v5, p3

    sub-double/2addr v3, v7

    iget v7, v0, Ll/ۨܰۜ;->ᩴ:F

    float-to-double v7, v7

    mul-double v3, v3, v7

    sub-double v3, p5, v3

    mul-double v5, v5, p1

    mul-double v1, v1, p3

    add-double/2addr v1, v5

    mul-double v1, v1, v7

    sub-double v1, p7, v1

    move-object p1, p0

    move-wide p2, v3

    move-wide p4, v1

    move/from16 p6, p9

    invoke-direct/range {p1 .. p6}, Ll/ۨܰۜ;->֫(DDZ)V

    return-void
.end method

.method private ֫(DDZ)V
    .locals 3

    const/high16 v0, 0x3f000000    # 0.5f

    const/4 v1, 0x0

    if-eqz p5, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    .line 397
    :cond_0
    iget v2, p0, Ll/ۨܰۜ;->֨:I

    int-to-float v2, v2

    mul-float v2, v2, v0

    :goto_0
    if-eqz p5, :cond_1

    goto :goto_1

    .line 398
    :cond_1
    iget p5, p0, Ll/ۨܰۜ;->ۚ:I

    int-to-float p5, p5

    mul-float v1, p5, v0

    .line 399
    :goto_1
    invoke-virtual {p0}, Ll/ۨܰۜ;->ܺ()F

    move-result p5

    sub-float/2addr p5, v2

    invoke-virtual {p0}, Ll/ۨܰۜ;->᩷()F

    move-result v0

    add-float/2addr v0, v2

    invoke-static {p1, p2, p5, v0}, Ll/ۨܰۜ;->֫(DFF)F

    move-result p1

    iput p1, p0, Ll/ۨܰۜ;->᩵:F

    .line 400
    invoke-virtual {p0}, Ll/ۨܰۜ;->ۖ()F

    move-result p1

    sub-float/2addr p1, v1

    invoke-virtual {p0}, Ll/ۨܰۜ;->ۢ()F

    move-result p2

    add-float/2addr p2, v1

    invoke-static {p3, p4, p1, p2}, Ll/ۨܰۜ;->֫(DFF)F

    move-result p1

    iput p1, p0, Ll/ۨܰۜ;->֡:F

    return-void
.end method

.method private ֫(F)V
    .locals 9

    const/high16 v0, 0x43b40000    # 360.0f

    rem-float/2addr p1, v0

    const/high16 v1, 0x43340000    # 180.0f

    const/high16 v2, -0x3ccc0000    # -180.0f

    cmpl-float v1, p1, v1

    if-ltz v1, :cond_0

    sub-float/2addr p1, v0

    goto :goto_0

    :cond_0
    cmpg-float v1, p1, v2

    if-gez v1, :cond_1

    add-float/2addr p1, v0

    .line 356
    :cond_1
    :goto_0
    iget v0, p0, Ll/ۨܰۜ;->ۖ:F

    cmpl-float v0, p1, v0

    if-nez v0, :cond_2

    return-void

    :cond_2
    const/4 v0, 0x0

    cmpl-float v1, p1, v0

    if-nez v1, :cond_3

    const/4 p1, 0x0

    .line 358
    :cond_3
    iput p1, p0, Ll/ۨܰۜ;->ۖ:F

    const-wide/high16 v3, -0x4010000000000000L    # -1.0

    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    const-wide/16 v7, 0x0

    cmpl-float v1, p1, v0

    if-eqz v1, :cond_8

    cmpl-float v1, p1, v2

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    const/high16 v0, 0x42b40000    # 90.0f

    cmpl-float v1, p1, v0

    if-eqz v1, :cond_6

    const/high16 v1, -0x3d4c0000    # -90.0f

    cmpl-float v1, p1, v1

    if-nez v1, :cond_5

    goto :goto_1

    :cond_5
    float-to-double v0, p1

    .line 367
    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    .line 368
    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    iput-wide v2, p0, Ll/ۨܰۜ;->ܺ:D

    .line 369
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    iput-wide v0, p0, Ll/ۨܰۜ;->ۘ:D

    goto :goto_3

    .line 364
    :cond_6
    :goto_1
    iput-wide v7, p0, Ll/ۨܰۜ;->ܺ:D

    cmpl-float p1, p1, v0

    if-nez p1, :cond_7

    move-wide v3, v5

    .line 365
    :cond_7
    iput-wide v3, p0, Ll/ۨܰۜ;->ۘ:D

    goto :goto_3

    :cond_8
    :goto_2
    cmpl-float p1, p1, v0

    if-nez p1, :cond_9

    move-wide v3, v5

    .line 361
    :cond_9
    iput-wide v3, p0, Ll/ۨܰۜ;->ܺ:D

    .line 362
    iput-wide v7, p0, Ll/ۨܰۜ;->ۘ:D

    .line 371
    :goto_3
    invoke-direct {p0}, Ll/ۨܰۜ;->ۙ()V

    .line 372
    invoke-direct {p0}, Ll/ۨܰۜ;->᩶()V

    return-void
.end method

.method public static ֫(Ljava/lang/String;F)V
    .locals 1

    .line 422
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Ljava/lang/Float;->isInfinite(F)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 423
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, " must be finite"

    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ۙ()V
    .locals 17

    move-object/from16 v0, p0

    .line 377
    iget v1, v0, Ll/ۨܰۜ;->ᩳ:I

    int-to-double v2, v1

    iget-wide v4, v0, Ll/ۨܰۜ;->ܺ:D

    mul-double v2, v2, v4

    .line 378
    iget v6, v0, Ll/ۨܰۜ;->ܽ:I

    neg-int v7, v6

    int-to-double v7, v7

    iget-wide v9, v0, Ll/ۨܰۜ;->ۘ:D

    mul-double v7, v7, v9

    int-to-double v11, v1

    mul-double v11, v11, v9

    int-to-double v9, v6

    mul-double v9, v9, v4

    const-wide/16 v4, 0x0

    .line 381
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(DD)D

    move-result-wide v13

    invoke-static {v4, v5, v7, v8}, Ljava/lang/Math;->min(DD)D

    move-result-wide v15

    add-double/2addr v13, v15

    iput-wide v13, v0, Ll/ۨܰۜ;->᩷:D

    .line 382
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v1

    invoke-static {v4, v5, v7, v8}, Ljava/lang/Math;->max(DD)D

    move-result-wide v6

    add-double/2addr v6, v1

    iput-wide v6, v0, Ll/ۨܰۜ;->᩻:D

    .line 383
    invoke-static {v4, v5, v11, v12}, Ljava/lang/Math;->min(DD)D

    move-result-wide v1

    invoke-static {v4, v5, v9, v10}, Ljava/lang/Math;->min(DD)D

    move-result-wide v6

    add-double/2addr v6, v1

    iput-wide v6, v0, Ll/ۨܰۜ;->ۢ:D

    .line 384
    invoke-static {v4, v5, v11, v12}, Ljava/lang/Math;->max(DD)D

    move-result-wide v1

    invoke-static {v4, v5, v9, v10}, Ljava/lang/Math;->max(DD)D

    move-result-wide v3

    add-double/2addr v3, v1

    iput-wide v3, v0, Ll/ۨܰۜ;->ۜ:D

    .line 385
    iget-wide v1, v0, Ll/ۨܰۜ;->᩻:D

    iget-wide v5, v0, Ll/ۨܰۜ;->᩷:D

    sub-double/2addr v1, v5

    iput-wide v1, v0, Ll/ۨܰۜ;->ۡ:D

    .line 386
    iget-wide v1, v0, Ll/ۨܰۜ;->ۢ:D

    sub-double/2addr v3, v1

    iput-wide v3, v0, Ll/ۨܰۜ;->ܳ:D

    return-void
.end method

.method private ۧ(IDD)F
    .locals 8

    .line 318
    invoke-virtual {p0}, Ll/ۨܰۜ;->۠()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    sub-double v0, p4, p2

    .line 320
    iget v7, p0, Ll/ۨܰۜ;->ᩴ:F

    float-to-double v2, v7

    mul-double v0, v0, v2

    int-to-double v2, p1

    cmpg-double v4, v0, v2

    if-gtz v4, :cond_1

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    .line 321
    invoke-static/range {v2 .. v7}, Ll/ۨܰۜ;->֫(IDDF)F

    move-result p1

    return p1

    :cond_1
    float-to-double p1, v7

    mul-double p4, p4, p1

    sub-double/2addr v2, p4

    double-to-float p1, v2

    return p1
.end method

.method private ᩶()V
    .locals 10

    .line 349
    iget v0, p0, Ll/ۨܰۜ;->ᩳ:I

    const/high16 v1, 0x3f800000    # 1.0f

    const/16 v2, 0xc8

    if-gt v0, v2, :cond_0

    iget v0, p0, Ll/ۨܰۜ;->ܽ:I

    if-gt v0, v2, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const/high16 v0, 0x41000000    # 8.0f

    .line 342
    :goto_0
    invoke-virtual {p0}, Ll/ۨܰۜ;->۠()Z

    move-result v2

    if-eqz v2, :cond_1

    float-to-double v2, v0

    iget v0, p0, Ll/ۨܰۜ;->֨:I

    int-to-double v4, v0

    iget-wide v6, p0, Ll/ۨܰۜ;->ۡ:D

    div-double/2addr v4, v6

    iget v0, p0, Ll/ۨܰۜ;->ۚ:I

    int-to-double v6, v0

    iget-wide v8, p0, Ll/ۨܰۜ;->ܳ:D

    div-double/2addr v6, v8

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->min(DD)D

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(DD)D

    move-result-wide v2

    double-to-float v0, v2

    goto :goto_1

    :cond_1
    const/high16 v0, 0x3f800000    # 1.0f

    :goto_1
    iput v0, p0, Ll/ۨܰۜ;->֫:F

    .line 344
    invoke-virtual {p0}, Ll/ۨܰۜ;->۠()Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p0, Ll/ۨܰۜ;->֨:I

    iget v1, p0, Ll/ۨܰۜ;->ۚ:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    int-to-double v0, v0

    iget-wide v2, p0, Ll/ۨܰۜ;->ۧ:D

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    double-to-float v1, v0

    :cond_2
    iput v1, p0, Ll/ۨܰۜ;->ܿ:F

    return-void
.end method


# virtual methods
.method public final ֡()F
    .locals 1

    .line 144
    iget v0, p0, Ll/ۨܰۜ;->֡:F

    return v0
.end method

.method public final ֨()Z
    .locals 7

    .line 118
    invoke-virtual {p0}, Ll/ۨܰۜ;->۠()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Ll/ۨܰۜ;->ܳ:D

    iget-wide v2, p0, Ll/ۨܰۜ;->ۡ:D

    const-wide/high16 v4, 0x4008000000000000L    # 3.0

    mul-double v4, v4, v2

    cmpl-double v6, v0, v4

    if-ltz v6, :cond_0

    iget v4, p0, Ll/ۨܰۜ;->֨:I

    int-to-double v4, v4

    div-double/2addr v4, v2

    mul-double v4, v4, v0

    iget v0, p0, Ll/ۨܰۜ;->ۚ:I

    int-to-double v0, v0

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    mul-double v0, v0, v2

    cmpl-double v2, v4, v0

    if-ltz v2, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ֫()V
    .locals 9

    .line 94
    invoke-virtual {p0}, Ll/ۨܰۜ;->۠()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 95
    iget v2, p0, Ll/ۨܰۜ;->ᩴ:F

    invoke-virtual {p0}, Ll/ۨܰۜ;->ᩳ()F

    move-result v3

    iget v0, p0, Ll/ۨܰۜ;->֨:I

    int-to-float v1, v0

    const/high16 v4, 0x3f000000    # 0.5f

    mul-float v5, v1, v4

    iget v1, p0, Ll/ۨܰۜ;->ۚ:I

    int-to-float v6, v1

    mul-float v6, v6, v4

    int-to-float v0, v0

    mul-float v0, v0, v4

    int-to-float v1, v1

    mul-float v7, v1, v4

    const/4 v8, 0x1

    move-object v1, p0

    move v4, v5

    move v5, v6

    move v6, v0

    invoke-virtual/range {v1 .. v8}, Ll/ۨܰۜ;->֫(FFFFFFZ)V

    :cond_0
    return-void
.end method

.method public final ֫(FFFFF)V
    .locals 8

    const/4 v7, 0x1

    .line 284
    iget v2, p0, Ll/ۨܰۜ;->ۖ:F

    move-object v0, p0

    move v1, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-virtual/range {v0 .. v7}, Ll/ۨܰۜ;->֫(FFFFFFZ)V

    return-void
.end method

.method public final ֫(FFFFFFZ)V
    .locals 17

    move-object/from16 v10, p0

    move/from16 v0, p1

    move/from16 v1, p2

    move/from16 v2, p3

    move/from16 v3, p4

    move/from16 v4, p5

    move/from16 v5, p6

    const-string v6, "scale"

    .line 416
    invoke-static {v6, v0}, Ll/ۨܰۜ;->֫(Ljava/lang/String;F)V

    const/4 v6, 0x0

    cmpg-float v6, v0, v6

    if-lez v6, :cond_2

    const-string v6, "rotation"

    .line 294
    invoke-static {v6, v1}, Ll/ۨܰۜ;->֫(Ljava/lang/String;F)V

    const-string v6, "oldFocusX"

    .line 295
    invoke-static {v6, v2}, Ll/ۨܰۜ;->֫(Ljava/lang/String;F)V

    const-string v6, "oldFocusY"

    .line 296
    invoke-static {v6, v3}, Ll/ۨܰۜ;->֫(Ljava/lang/String;F)V

    const-string v6, "newFocusX"

    .line 297
    invoke-static {v6, v4}, Ll/ۨܰۜ;->֫(Ljava/lang/String;F)V

    const-string v6, "newFocusY"

    .line 298
    invoke-static {v6, v5}, Ll/ۨܰۜ;->֫(Ljava/lang/String;F)V

    .line 299
    invoke-virtual/range {p0 .. p0}, Ll/ۨܰۜ;->۠()Z

    move-result v6

    if-nez v6, :cond_0

    return-void

    :cond_0
    float-to-double v6, v2

    .line 301
    iget v2, v10, Ll/ۨܰۜ;->᩵:F

    float-to-double v8, v2

    sub-double/2addr v6, v8

    iget v2, v10, Ll/ۨܰۜ;->ᩴ:F

    float-to-double v8, v2

    div-double/2addr v6, v8

    float-to-double v2, v3

    .line 302
    iget v11, v10, Ll/ۨܰۜ;->֡:F

    float-to-double v11, v11

    sub-double/2addr v2, v11

    div-double/2addr v2, v8

    .line 303
    iget-wide v8, v10, Ll/ۨܰۜ;->ܺ:D

    mul-double v11, v8, v6

    iget-wide v13, v10, Ll/ۨܰۜ;->ۘ:D

    mul-double v15, v13, v2

    add-double/2addr v11, v15

    neg-double v13, v13

    mul-double v13, v13, v6

    mul-double v8, v8, v2

    add-double v6, v8, v13

    .line 305
    invoke-direct {v10, v1}, Ll/ۨܰۜ;->֫(F)V

    if-eqz p7, :cond_1

    float-to-double v0, v0

    .line 390
    invoke-virtual/range {p0 .. p0}, Ll/ۨܰۜ;->ۡ()F

    move-result v2

    const/high16 v3, 0x41000000    # 8.0f

    invoke-static {v0, v1, v2, v3}, Ll/ۨܰۜ;->֫(DFF)F

    move-result v0

    goto :goto_0

    :cond_1
    float-to-double v0, v0

    .line 391
    iget v2, v10, Ll/ۨܰۜ;->ܿ:F

    const/high16 v3, 0x3f000000    # 0.5f

    mul-float v2, v2, v3

    const/high16 v3, 0x41400000    # 12.0f

    invoke-static {v0, v1, v2, v3}, Ll/ۨܰۜ;->֫(DFF)F

    move-result v0

    .line 306
    :goto_0
    iput v0, v10, Ll/ۨܰۜ;->ᩴ:F

    float-to-double v8, v4

    float-to-double v13, v5

    move-object/from16 v0, p0

    move-wide v1, v11

    move-wide v3, v6

    move-wide v5, v8

    move-wide v7, v13

    move/from16 v9, p7

    .line 307
    invoke-direct/range {v0 .. v9}, Ll/ۨܰۜ;->֫(DDDDZ)V

    return-void

    .line 418
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Scale must be positive"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(FFFFZ)V
    .locals 6

    const-string v0, "scale"

    .line 416
    invoke-static {v0, p1}, Ll/ۨܰۜ;->֫(Ljava/lang/String;F)V

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-lez v0, :cond_2

    const-string v0, "rotation"

    .line 271
    invoke-static {v0, p2}, Ll/ۨܰۜ;->֫(Ljava/lang/String;F)V

    const-string v0, "x"

    .line 272
    invoke-static {v0, p3}, Ll/ۨܰۜ;->֫(Ljava/lang/String;F)V

    const-string v0, "y"

    .line 273
    invoke-static {v0, p4}, Ll/ۨܰۜ;->֫(Ljava/lang/String;F)V

    .line 274
    invoke-virtual {p0}, Ll/ۨܰۜ;->۠()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 276
    :cond_0
    invoke-direct {p0, p2}, Ll/ۨܰۜ;->֫(F)V

    if-eqz p5, :cond_1

    float-to-double p1, p1

    .line 390
    invoke-virtual {p0}, Ll/ۨܰۜ;->ۡ()F

    move-result v0

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {p1, p2, v0, v1}, Ll/ۨܰۜ;->֫(DFF)F

    move-result p1

    goto :goto_0

    :cond_1
    float-to-double p1, p1

    .line 391
    iget v0, p0, Ll/ۨܰۜ;->ܿ:F

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float v0, v0, v1

    const/high16 v1, 0x41400000    # 12.0f

    invoke-static {p1, p2, v0, v1}, Ll/ۨܰۜ;->֫(DFF)F

    move-result p1

    .line 277
    :goto_0
    iput p1, p0, Ll/ۨܰۜ;->ᩴ:F

    float-to-double v1, p3

    float-to-double v3, p4

    move-object v0, p0

    move v5, p5

    .line 278
    invoke-direct/range {v0 .. v5}, Ll/ۨܰۜ;->֫(DDZ)V

    return-void

    .line 418
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Scale must be positive"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(FFFZ)V
    .locals 6

    .line 265
    iget v2, p0, Ll/ۨܰۜ;->ۖ:F

    move-object v0, p0

    move v1, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Ll/ۨܰۜ;->֫(FFFFZ)V

    return-void
.end method

.method public final ֫(II)V
    .locals 2

    const/4 v0, 0x0

    .line 31
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Ll/ۨܰۜ;->ᩳ:I

    .line 32
    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Ll/ۨܰۜ;->ܽ:I

    .line 33
    iget p2, p0, Ll/ۨܰۜ;->ᩳ:I

    int-to-double v0, p2

    int-to-double p1, p1

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide p1

    iput-wide p1, p0, Ll/ۨܰۜ;->ۧ:D

    const/4 p1, 0x0

    .line 34
    iput p1, p0, Ll/ۨܰۜ;->ۖ:F

    const-wide/high16 p1, 0x3ff0000000000000L    # 1.0

    .line 35
    iput-wide p1, p0, Ll/ۨܰۜ;->ܺ:D

    const-wide/16 p1, 0x0

    .line 36
    iput-wide p1, p0, Ll/ۨܰۜ;->ۘ:D

    .line 37
    invoke-direct {p0}, Ll/ۨܰۜ;->ۙ()V

    .line 38
    invoke-virtual {p0}, Ll/ۨܰۜ;->ܶ()V

    return-void
.end method

.method public final ֫(Ll/ۛܰۜ;)V
    .locals 14

    .line 175
    invoke-virtual {p0}, Ll/ۨܰۜ;->۠()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ll/ۛܰۜ;->֫()Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Ll/ۨܰۜ;->ᩳ:I

    iget v1, p1, Ll/ۛܰۜ;->ᩳ:I

    if-ne v0, v1, :cond_1

    iget v0, p0, Ll/ۨܰۜ;->ܽ:I

    iget v1, p1, Ll/ۛܰۜ;->ܽ:I

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 177
    :cond_0
    iget v0, p1, Ll/ۛܰۜ;->ܳ:F

    invoke-direct {p0, v0}, Ll/ۨܰۜ;->֫(F)V

    .line 178
    iget-wide v0, p1, Ll/ۛܰۜ;->ܿ:D

    iget v2, p0, Ll/ۨܰۜ;->֫:F

    float-to-double v2, v2

    mul-double v0, v0, v2

    invoke-virtual {p0}, Ll/ۨܰۜ;->ۡ()F

    move-result v2

    const/high16 v3, 0x41000000    # 8.0f

    invoke-static {v0, v1, v2, v3}, Ll/ۨܰۜ;->֫(DFF)F

    move-result v0

    iput v0, p0, Ll/ۨܰۜ;->ᩴ:F

    .line 179
    iget-wide v0, p1, Ll/ۛܰۜ;->֫:D

    iget v2, p0, Ll/ۨܰۜ;->ᩳ:I

    int-to-double v2, v2

    mul-double v5, v0, v2

    iget-wide v0, p1, Ll/ۛܰۜ;->ۧ:D

    iget p1, p0, Ll/ۨܰۜ;->ܽ:I

    int-to-double v2, p1

    mul-double v7, v0, v2

    iget p1, p0, Ll/ۨܰۜ;->֨:I

    int-to-double v0, p1

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    mul-double v9, v0, v2

    iget p1, p0, Ll/ۨܰۜ;->ۚ:I

    int-to-double v0, p1

    mul-double v11, v0, v2

    const/4 v13, 0x1

    move-object v4, p0

    invoke-direct/range {v4 .. v13}, Ll/ۨܰۜ;->֫(DDDDZ)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ֫(FF)Z
    .locals 5

    const-string v0, "dx"

    .line 242
    invoke-static {v0, p1}, Ll/ۨܰۜ;->֫(Ljava/lang/String;F)V

    const-string v0, "dy"

    .line 243
    invoke-static {v0, p2}, Ll/ۨܰۜ;->֫(Ljava/lang/String;F)V

    .line 244
    invoke-virtual {p0}, Ll/ۨܰۜ;->۠()Z

    move-result v0

    if-eqz v0, :cond_3

    iget v0, p0, Ll/ۨܰۜ;->᩵:F

    invoke-virtual {p0}, Ll/ۨܰۜ;->ܺ()F

    move-result v1

    invoke-virtual {p0}, Ll/ۨܰۜ;->᩷()F

    move-result v2

    const/4 v3, 0x0

    cmpl-float v4, p1, v3

    if-lez v4, :cond_0

    cmpg-float p1, v0, v2

    if-gez p1, :cond_1

    goto :goto_0

    :cond_0
    cmpg-float p1, p1, v3

    if-gez p1, :cond_1

    cmpl-float p1, v0, v1

    if-lez p1, :cond_1

    goto :goto_0

    :cond_1
    iget p1, p0, Ll/ۨܰۜ;->֡:F

    .line 245
    invoke-virtual {p0}, Ll/ۨܰۜ;->ۖ()F

    move-result v0

    invoke-virtual {p0}, Ll/ۨܰۜ;->ۢ()F

    move-result v1

    cmpl-float v2, p2, v3

    if-lez v2, :cond_2

    cmpg-float p1, p1, v1

    if-gez p1, :cond_3

    goto :goto_0

    :cond_2
    cmpg-float p2, p2, v3

    if-gez p2, :cond_3

    cmpl-float p1, p1, v0

    if-lez p1, :cond_3

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public final ۖ()F
    .locals 6

    .line 221
    iget v1, p0, Ll/ۨܰۜ;->ۚ:I

    iget-wide v2, p0, Ll/ۨܰۜ;->ۢ:D

    iget-wide v4, p0, Ll/ۨܰۜ;->ۜ:D

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ll/ۨܰۜ;->ۧ(IDD)F

    move-result v0

    return v0
.end method

.method public final ۘ()F
    .locals 1

    .line 136
    iget v0, p0, Ll/ۨܰۜ;->ۖ:F

    return v0
.end method

.method public final ۚ()Z
    .locals 8

    .line 106
    invoke-virtual {p0}, Ll/ۨܰۜ;->۠()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Ll/ۨܰۜ;->ᩴ:F

    iget v1, p0, Ll/ۨܰۜ;->֫:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v6, p0, Ll/ۨܰۜ;->֫:F

    const v1, 0x38d1b717    # 1.0E-4f

    mul-float v1, v1, v6

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    iget v0, p0, Ll/ۨܰۜ;->᩵:F

    iget v1, p0, Ll/ۨܰۜ;->֨:I

    iget-wide v2, p0, Ll/ۨܰۜ;->᩷:D

    iget-wide v4, p0, Ll/ۨܰۜ;->᩻:D

    .line 107
    invoke-static/range {v1 .. v6}, Ll/ۨܰۜ;->֫(IDDF)F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x3c23d70a    # 0.01f

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    iget v0, p0, Ll/ۨܰۜ;->֡:F

    iget v2, p0, Ll/ۨܰۜ;->ۚ:I

    iget-wide v3, p0, Ll/ۨܰۜ;->ۢ:D

    iget-wide v5, p0, Ll/ۨܰۜ;->ۜ:D

    iget v7, p0, Ll/ۨܰۜ;->֫:F

    .line 108
    invoke-static/range {v2 .. v7}, Ll/ۨܰۜ;->֫(IDDF)F

    move-result v2

    sub-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۜ()I
    .locals 1

    .line 148
    iget v0, p0, Ll/ۨܰۜ;->ᩳ:I

    return v0
.end method

.method public final ۠()Z
    .locals 1

    .line 101
    iget v0, p0, Ll/ۨܰۜ;->ᩳ:I

    if-lez v0, :cond_0

    iget v0, p0, Ll/ۨܰۜ;->ܽ:I

    if-lez v0, :cond_0

    iget v0, p0, Ll/ۨܰۜ;->֨:I

    if-lez v0, :cond_0

    iget v0, p0, Ll/ۨܰۜ;->ۚ:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۡ()F
    .locals 2

    const/high16 v0, 0x3f800000    # 1.0f

    .line 132
    iget v1, p0, Ll/ۨܰۜ;->֫:F

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    return v0
.end method

.method public final ۢ()F
    .locals 6

    .line 225
    iget v1, p0, Ll/ۨܰۜ;->ۚ:I

    iget-wide v2, p0, Ll/ۨܰۜ;->ۢ:D

    iget-wide v4, p0, Ll/ۨܰۜ;->ۜ:D

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ll/ۨܰۜ;->֫(IDD)F

    move-result v0

    return v0
.end method

.method public final ۧ(FF)F
    .locals 11

    const-string v0, "dx"

    .line 253
    invoke-static {v0, p1}, Ll/ۨܰۜ;->֫(Ljava/lang/String;F)V

    const-string v0, "dy"

    .line 254
    invoke-static {v0, p2}, Ll/ۨܰۜ;->֫(Ljava/lang/String;F)V

    .line 255
    invoke-virtual {p0}, Ll/ۨܰۜ;->۠()Z

    move-result v0

    if-nez v0, :cond_0

    return p1

    .line 257
    :cond_0
    iget v0, p0, Ll/ۨܰۜ;->᩵:F

    .line 258
    invoke-virtual {p0}, Ll/ۨܰۜ;->ܺ()F

    move-result v1

    invoke-virtual {p0}, Ll/ۨܰۜ;->᩷()F

    move-result v2

    float-to-double v3, v0

    float-to-double v5, p1

    add-double v7, v3, v5

    .line 408
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-static {v7, v8, p1, v0}, Ll/ۨܰۜ;->֫(DFF)F

    move-result p1

    .line 258
    iput p1, p0, Ll/ۨܰۜ;->᩵:F

    .line 259
    iget p1, p0, Ll/ۨܰۜ;->֡:F

    invoke-virtual {p0}, Ll/ۨܰۜ;->ۖ()F

    move-result v0

    invoke-virtual {p0}, Ll/ۨܰۜ;->ۢ()F

    move-result v1

    float-to-double v7, p1

    float-to-double v9, p2

    add-double/2addr v7, v9

    .line 408
    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    move-result p2

    invoke-static {p1, v1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    invoke-static {v7, v8, p2, p1}, Ll/ۨܰۜ;->֫(DFF)F

    move-result p1

    .line 259
    iput p1, p0, Ll/ۨܰۜ;->֡:F

    .line 260
    iget p1, p0, Ll/ۨܰۜ;->᩵:F

    float-to-double p1, p1

    sub-double/2addr p1, v3

    sub-double/2addr v5, p1

    double-to-float p1, v5

    return p1
.end method

.method public final ۧ()V
    .locals 7

    .line 312
    invoke-virtual {p0}, Ll/ۨܰۜ;->۠()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 313
    iget v2, p0, Ll/ۨܰۜ;->ᩴ:F

    iget v0, p0, Ll/ۨܰۜ;->֨:I

    int-to-float v0, v0

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float v5, v0, v1

    iget v0, p0, Ll/ۨܰۜ;->ۚ:I

    int-to-float v0, v0

    mul-float v6, v0, v1

    move-object v1, p0

    move v3, v5

    move v4, v6

    invoke-virtual/range {v1 .. v6}, Ll/ۨܰۜ;->֫(FFFFF)V

    :cond_0
    return-void
.end method

.method public final ۧ(II)V
    .locals 19

    move-object/from16 v10, p0

    const/4 v0, 0x0

    move/from16 v1, p1

    .line 43
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    move/from16 v2, p2

    .line 44
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 45
    iget v3, v10, Ll/ۨܰۜ;->֨:I

    if-ne v3, v1, :cond_0

    iget v3, v10, Ll/ۨܰۜ;->ۚ:I

    if-ne v3, v2, :cond_0

    goto/16 :goto_1

    .line 47
    :cond_0
    invoke-virtual/range {p0 .. p0}, Ll/ۨܰۜ;->۠()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual/range {p0 .. p0}, Ll/ۨܰۜ;->ۚ()Z

    move-result v3

    if-nez v3, :cond_1

    const/4 v0, 0x1

    .line 48
    :cond_1
    iget v3, v10, Ll/ۨܰۜ;->ᩴ:F

    float-to-double v3, v3

    iget v5, v10, Ll/ۨܰۜ;->֫:F

    float-to-double v5, v5

    div-double/2addr v3, v5

    .line 50
    invoke-virtual/range {p0 .. p0}, Ll/ۨܰۜ;->۠()Z

    move-result v5

    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    if-eqz v5, :cond_2

    .line 51
    iget v5, v10, Ll/ۨܰۜ;->֨:I

    int-to-double v8, v5

    mul-double v8, v8, v6

    iget v5, v10, Ll/ۨܰۜ;->᩵:F

    float-to-double v11, v5

    sub-double/2addr v8, v11

    iget v5, v10, Ll/ۨܰۜ;->ᩴ:F

    float-to-double v11, v5

    div-double/2addr v8, v11

    .line 52
    iget v5, v10, Ll/ۨܰۜ;->ۚ:I

    int-to-double v13, v5

    mul-double v13, v13, v6

    iget v5, v10, Ll/ۨܰۜ;->֡:F

    float-to-double v6, v5

    sub-double/2addr v13, v6

    div-double/2addr v13, v11

    .line 53
    iget-wide v5, v10, Ll/ۨܰۜ;->ܺ:D

    mul-double v11, v5, v8

    move-wide v15, v3

    iget-wide v3, v10, Ll/ۨܰۜ;->ۘ:D

    mul-double v17, v3, v13

    add-double v17, v17, v11

    iget v7, v10, Ll/ۨܰۜ;->ᩳ:I

    int-to-double v11, v7

    div-double v17, v17, v11

    neg-double v3, v3

    mul-double v3, v3, v8

    mul-double v5, v5, v13

    add-double/2addr v5, v3

    .line 54
    iget v3, v10, Ll/ۨܰۜ;->ܽ:I

    int-to-double v3, v3

    div-double/2addr v5, v3

    goto :goto_0

    :cond_2
    move-wide v15, v3

    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    const-wide/high16 v17, 0x3fe0000000000000L    # 0.5

    .line 56
    :goto_0
    iput v1, v10, Ll/ۨܰۜ;->֨:I

    .line 57
    iput v2, v10, Ll/ۨܰۜ;->ۚ:I

    .line 58
    invoke-virtual/range {p0 .. p0}, Ll/ۨܰۜ;->ܶ()V

    if-eqz v0, :cond_3

    .line 59
    invoke-virtual/range {p0 .. p0}, Ll/ۨܰۜ;->۠()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 60
    iget v0, v10, Ll/ۨܰۜ;->֫:F

    float-to-double v0, v0

    mul-double v3, v15, v0

    invoke-virtual/range {p0 .. p0}, Ll/ۨܰۜ;->ۡ()F

    move-result v0

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v3, v4, v0, v1}, Ll/ۨܰۜ;->֫(DFF)F

    move-result v0

    iput v0, v10, Ll/ۨܰۜ;->ᩴ:F

    .line 61
    iget v0, v10, Ll/ۨܰۜ;->ᩳ:I

    int-to-double v0, v0

    mul-double v1, v0, v17

    iget v0, v10, Ll/ۨܰۜ;->ܽ:I

    int-to-double v3, v0

    mul-double v3, v3, v5

    iget v0, v10, Ll/ۨܰۜ;->֨:I

    int-to-double v5, v0

    const-wide/high16 v7, 0x3fe0000000000000L    # 0.5

    mul-double v5, v5, v7

    iget v0, v10, Ll/ۨܰۜ;->ۚ:I

    int-to-double v11, v0

    mul-double v7, v7, v11

    const/4 v9, 0x1

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v9}, Ll/ۨܰۜ;->֫(DDDDZ)V

    :cond_3
    :goto_1
    return-void
.end method

.method public final ܳ()F
    .locals 8

    .line 230
    invoke-virtual {p0}, Ll/ۨܰۜ;->۠()Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Ll/ۨܰۜ;->֫:F

    return v0

    .line 349
    :cond_0
    iget v0, p0, Ll/ۨܰۜ;->ᩳ:I

    const/16 v1, 0xc8

    const/high16 v2, 0x3f800000    # 1.0f

    const v3, 0x3f666666    # 0.9f

    if-gt v0, v1, :cond_1

    iget v0, p0, Ll/ۨܰۜ;->ܽ:I

    if-gt v0, v1, :cond_1

    goto :goto_0

    .line 231
    :cond_1
    iget v0, p0, Ll/ۨܰۜ;->֫:F

    const/high16 v4, 0x3fc00000    # 1.5f

    cmpl-float v4, v0, v4

    if-ltz v4, :cond_3

    .line 232
    iget v1, p0, Ll/ۨܰۜ;->ᩴ:F

    mul-float v3, v3, v0

    cmpg-float v1, v1, v3

    if-gez v1, :cond_2

    return v0

    :cond_2
    return v2

    .line 233
    :cond_3
    :goto_0
    invoke-virtual {p0}, Ll/ۨܰۜ;->֨()Z

    move-result v0

    if-eqz v0, :cond_4

    iget v0, p0, Ll/ۨܰۜ;->֨:I

    int-to-double v4, v0

    iget-wide v6, p0, Ll/ۨܰۜ;->ۡ:D

    div-double/2addr v4, v6

    double-to-float v0, v4

    goto :goto_1

    .line 234
    :cond_4
    iget v0, p0, Ll/ۨܰۜ;->֫:F

    const/high16 v4, 0x40200000    # 2.5f

    mul-float v0, v0, v4

    invoke-static {v2, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    .line 349
    :goto_1
    iget v2, p0, Ll/ۨܰۜ;->ᩳ:I

    if-gt v2, v1, :cond_5

    iget v2, p0, Ll/ۨܰۜ;->ܽ:I

    if-gt v2, v1, :cond_5

    .line 235
    iget v1, p0, Ll/ۨܰۜ;->֨:I

    int-to-double v1, v1

    iget-wide v4, p0, Ll/ۨܰۜ;->ۡ:D

    div-double/2addr v1, v4

    iget v4, p0, Ll/ۨܰۜ;->ۚ:I

    int-to-double v4, v4

    iget-wide v6, p0, Ll/ۨܰۜ;->ܳ:D

    div-double/2addr v4, v6

    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->min(DD)D

    move-result-wide v1

    double-to-float v1, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    .line 236
    :cond_5
    iget v1, p0, Ll/ۨܰۜ;->֫:F

    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {v2, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    .line 237
    iget v1, p0, Ll/ۨܰۜ;->ᩴ:F

    mul-float v3, v3, v0

    cmpg-float v1, v1, v3

    if-gez v1, :cond_6

    return v0

    :cond_6
    iget v0, p0, Ll/ۨܰۜ;->֫:F

    return v0
.end method

.method public final ܶ()V
    .locals 8

    .line 68
    invoke-direct {p0}, Ll/ۨܰۜ;->᩶()V

    .line 69
    iget v0, p0, Ll/ۨܰۜ;->֫:F

    iput v0, p0, Ll/ۨܰۜ;->ᩴ:F

    .line 70
    invoke-virtual {p0}, Ll/ۨܰۜ;->۠()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget v2, p0, Ll/ۨܰۜ;->֨:I

    iget-wide v3, p0, Ll/ۨܰۜ;->᩷:D

    iget-wide v5, p0, Ll/ۨܰۜ;->᩻:D

    iget v7, p0, Ll/ۨܰۜ;->ᩴ:F

    invoke-static/range {v2 .. v7}, Ll/ۨܰۜ;->֫(IDDF)F

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput v0, p0, Ll/ۨܰۜ;->᩵:F

    .line 71
    invoke-virtual {p0}, Ll/ۨܰۜ;->۠()Z

    move-result v0

    if-eqz v0, :cond_1

    iget v2, p0, Ll/ۨܰۜ;->ۚ:I

    iget-wide v3, p0, Ll/ۨܰۜ;->ۢ:D

    iget-wide v5, p0, Ll/ۨܰۜ;->ۜ:D

    iget v7, p0, Ll/ۨܰۜ;->ᩴ:F

    invoke-static/range {v2 .. v7}, Ll/ۨܰۜ;->֫(IDDF)F

    move-result v1

    :cond_1
    iput v1, p0, Ll/ۨܰۜ;->֡:F

    return-void
.end method

.method public final ܺ()F
    .locals 6

    .line 213
    iget v1, p0, Ll/ۨܰۜ;->֨:I

    iget-wide v2, p0, Ll/ۨܰۜ;->᩷:D

    iget-wide v4, p0, Ll/ۨܰۜ;->᩻:D

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ll/ۨܰۜ;->ۧ(IDD)F

    move-result v0

    return v0
.end method

.method public final ܽ()Z
    .locals 7

    .line 113
    invoke-virtual {p0}, Ll/ۨܰۜ;->۠()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Ll/ۨܰۜ;->ۡ:D

    iget v2, p0, Ll/ۨܰۜ;->ᩴ:F

    float-to-double v3, v2

    mul-double v0, v0, v3

    iget v3, p0, Ll/ۨܰۜ;->֨:I

    int-to-float v3, v3

    const v4, 0x3c23d70a    # 0.01f

    add-float/2addr v3, v4

    float-to-double v5, v3

    cmpg-double v3, v0, v5

    if-gtz v3, :cond_0

    iget-wide v0, p0, Ll/ۨܰۜ;->ܳ:D

    float-to-double v2, v2

    mul-double v0, v0, v2

    iget v2, p0, Ll/ۨܰۜ;->ۚ:I

    int-to-float v2, v2

    add-float/2addr v2, v4

    float-to-double v2, v2

    cmpg-double v4, v0, v2

    if-gtz v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܿ()F
    .locals 1

    .line 127
    iget v0, p0, Ll/ۨܰۜ;->֫:F

    return v0
.end method

.method public final ᩳ()F
    .locals 2

    .line 89
    iget v0, p0, Ll/ۨܰۜ;->ۖ:F

    const/high16 v1, 0x42b40000    # 90.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-float v0, v0

    mul-float v0, v0, v1

    return v0
.end method

.method public final ᩴ()F
    .locals 1

    .line 123
    iget v0, p0, Ll/ۨܰۜ;->ᩴ:F

    return v0
.end method

.method public final ᩵()F
    .locals 1

    .line 140
    iget v0, p0, Ll/ۨܰۜ;->᩵:F

    return v0
.end method

.method public final ᩷()F
    .locals 6

    .line 217
    iget v1, p0, Ll/ۨܰۜ;->֨:I

    iget-wide v2, p0, Ll/ۨܰۜ;->᩷:D

    iget-wide v4, p0, Ll/ۨܰۜ;->᩻:D

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ll/ۨܰۜ;->֫(IDD)F

    move-result v0

    return v0
.end method

.method public final ᩸()V
    .locals 10

    .line 76
    iget v0, p0, Ll/ۨܰۜ;->ۖ:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    return-void

    .line 78
    :cond_0
    invoke-virtual {p0}, Ll/ۨܰۜ;->۠()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 79
    iget v3, p0, Ll/ۨܰۜ;->ᩴ:F

    iget v0, p0, Ll/ۨܰۜ;->֨:I

    int-to-float v1, v0

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float v5, v1, v2

    iget v1, p0, Ll/ۨܰۜ;->ۚ:I

    int-to-float v4, v1

    mul-float v6, v4, v2

    int-to-float v0, v0

    mul-float v7, v0, v2

    int-to-float v0, v1

    mul-float v8, v0, v2

    const/4 v9, 0x1

    const/4 v4, 0x0

    move-object v2, p0

    invoke-virtual/range {v2 .. v9}, Ll/ۨܰۜ;->֫(FFFFFFZ)V

    return-void

    .line 82
    :cond_1
    invoke-direct {p0, v1}, Ll/ۨܰۜ;->֫(F)V

    .line 83
    invoke-virtual {p0}, Ll/ۨܰۜ;->ܶ()V

    return-void
.end method

.method public final ᩹()Ll/ۛܰۜ;
    .locals 20

    move-object/from16 v0, p0

    .line 165
    invoke-virtual/range {p0 .. p0}, Ll/ۨܰۜ;->۠()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    return-object v1

    .line 166
    :cond_0
    iget v1, v0, Ll/ۨܰۜ;->֨:I

    int-to-double v1, v1

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    mul-double v1, v1, v3

    iget v5, v0, Ll/ۨܰۜ;->᩵:F

    float-to-double v5, v5

    sub-double/2addr v1, v5

    iget v5, v0, Ll/ۨܰۜ;->ᩴ:F

    float-to-double v5, v5

    div-double/2addr v1, v5

    .line 167
    iget v7, v0, Ll/ۨܰۜ;->ۚ:I

    int-to-double v7, v7

    mul-double v7, v7, v3

    iget v3, v0, Ll/ۨܰۜ;->֡:F

    float-to-double v3, v3

    sub-double/2addr v7, v3

    div-double/2addr v7, v5

    .line 168
    new-instance v3, Ll/ۛܰۜ;

    iget v10, v0, Ll/ۨܰۜ;->ᩳ:I

    iget v11, v0, Ll/ۨܰۜ;->ܽ:I

    iget v4, v0, Ll/ۨܰۜ;->֫:F

    float-to-double v12, v4

    div-double v12, v5, v12

    iget-wide v4, v0, Ll/ۨܰۜ;->ܺ:D

    mul-double v14, v4, v1

    move-wide/from16 v16, v12

    iget-wide v12, v0, Ll/ۨܰۜ;->ۘ:D

    mul-double v18, v12, v7

    add-double v18, v18, v14

    int-to-double v14, v10

    div-double v14, v18, v14

    neg-double v12, v12

    mul-double v12, v12, v1

    mul-double v4, v4, v7

    add-double/2addr v4, v12

    int-to-double v1, v11

    div-double v1, v4, v1

    iget v4, v0, Ll/ۨܰۜ;->ۖ:F

    move-object v9, v3

    move-wide/from16 v12, v16

    move-wide/from16 v16, v1

    move/from16 v18, v4

    invoke-direct/range {v9 .. v18}, Ll/ۛܰۜ;-><init>(IIDDDF)V

    return-object v3
.end method

.method public final ᩻()I
    .locals 1

    .line 152
    iget v0, p0, Ll/ۨܰۜ;->ܽ:I

    return v0
.end method
