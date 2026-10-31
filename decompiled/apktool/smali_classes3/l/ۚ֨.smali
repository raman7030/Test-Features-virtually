.class public final Ll/ۚ֨;
.super Ll/ۛ֨;
.source "V1D4"


# instance fields
.field public ۖ:Landroid/util/SparseArray;

.field public ۘ:[F

.field public ۡ:Ljava/lang/String;

.field public ܺ:[F

.field public ᩴ:Landroid/util/SparseArray;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method


# virtual methods
.method public final ֫(FFFII)V
    .locals 0

    .line 350
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "don\'t call for custom attribute call setPoint(pos, ConstraintAttribute,...)"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(I)V
    .locals 16

    move-object/from16 v0, p0

    .line 328
    iget-object v1, v0, Ll/ۚ֨;->ۖ:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v2

    const/4 v3, 0x0

    .line 329
    invoke-virtual {v1, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܰܶ;

    invoke-virtual {v4}, Ll/ܰܶ;->ܽ()I

    move-result v4

    .line 330
    new-array v5, v2, [D

    add-int/lit8 v6, v4, 0x2

    .line 331
    new-array v7, v6, [F

    iput-object v7, v0, Ll/ۚ֨;->ۘ:[F

    .line 332
    new-array v7, v4, [F

    iput-object v7, v0, Ll/ۚ֨;->ܺ:[F

    const/4 v7, 0x2

    new-array v7, v7, [I

    const/4 v8, 0x1

    aput v6, v7, v8

    aput v2, v7, v3

    .line 333
    sget-object v6, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v6, v7}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [[D

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v2, :cond_1

    .line 335
    invoke-virtual {v1, v7}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v9

    .line 336
    invoke-virtual {v1, v7}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ܰܶ;

    .line 337
    iget-object v11, v0, Ll/ۚ֨;->ᩴ:Landroid/util/SparseArray;

    invoke-virtual {v11, v7}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, [F

    int-to-double v12, v9

    const-wide v14, 0x3f847ae147ae147bL    # 0.01

    mul-double v12, v12, v14

    .line 338
    aput-wide v12, v5, v7

    .line 339
    iget-object v9, v0, Ll/ۚ֨;->ۘ:[F

    invoke-virtual {v10, v9}, Ll/ܰܶ;->֫([F)V

    const/4 v9, 0x0

    .line 340
    :goto_1
    iget-object v10, v0, Ll/ۚ֨;->ۘ:[F

    array-length v12, v10

    if-ge v9, v12, :cond_0

    .line 341
    aget-object v12, v6, v7

    aget v10, v10, v9

    float-to-double v13, v10

    aput-wide v13, v12, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 343
    :cond_0
    aget-object v9, v6, v7

    aget v10, v11, v3

    float-to-double v12, v10

    aput-wide v12, v9, v4

    add-int/lit8 v10, v4, 0x1

    .line 344
    aget v11, v11, v8

    float-to-double v11, v11

    aput-wide v11, v9, v10

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    move/from16 v7, p1

    .line 346
    invoke-static {v7, v5, v6}, Ll/᩷֡;->֫(I[D[[D)Ll/᩷֡;

    move-result-object v1

    iput-object v1, v0, Ll/ۛ֨;->ܳ:Ll/᩷֡;

    return-void
.end method

.method public final ۧ(FJLandroid/view/View;Ll/ܶ֡;)Z
    .locals 17

    move-object/from16 v0, p0

    move-wide/from16 v1, p2

    move-object/from16 v3, p4

    .line 361
    iget-object v4, v0, Ll/ۛ֨;->ܳ:Ll/᩷֡;

    move/from16 v5, p1

    float-to-double v5, v5

    iget-object v7, v0, Ll/ۚ֨;->ۘ:[F

    invoke-virtual {v4, v5, v6, v7}, Ll/᩷֡;->֫(D[F)V

    .line 362
    iget-object v4, v0, Ll/ۚ֨;->ۘ:[F

    array-length v5, v4

    add-int/lit8 v5, v5, -0x2

    aget v5, v4, v5

    .line 363
    array-length v6, v4

    const/4 v7, 0x1

    sub-int/2addr v6, v7

    aget v4, v4, v6

    .line 364
    iget-wide v8, v0, Ll/ۛ֨;->ܽ:J

    sub-long v8, v1, v8

    .line 366
    iget v6, v0, Ll/ۛ֨;->ۧ:F

    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    const/4 v10, 0x0

    if-eqz v6, :cond_0

    .line 367
    iget-object v6, v0, Ll/ۚ֨;->ۡ:Ljava/lang/String;

    move-object/from16 v11, p5

    invoke-virtual {v11, v3, v6}, Ll/ܶ֡;->֫(Landroid/view/View;Ljava/lang/String;)F

    move-result v6

    iput v6, v0, Ll/ۛ֨;->ۧ:F

    .line 368
    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 369
    iput v10, v0, Ll/ۛ֨;->ۧ:F

    .line 373
    :cond_0
    iget v6, v0, Ll/ۛ֨;->ۧ:F

    float-to-double v11, v6

    long-to-double v8, v8

    const-wide v13, 0x3e112e0be826d695L    # 1.0E-9

    mul-double v8, v8, v13

    float-to-double v13, v5

    mul-double v8, v8, v13

    add-double/2addr v8, v11

    const-wide/high16 v11, 0x3ff0000000000000L    # 1.0

    rem-double/2addr v8, v11

    double-to-float v6, v8

    iput v6, v0, Ll/ۛ֨;->ۧ:F

    .line 374
    iput-wide v1, v0, Ll/ۛ֨;->ܽ:J

    .line 375
    invoke-virtual {v0, v6}, Ll/ۛ֨;->֫(F)F

    move-result v1

    const/4 v2, 0x0

    .line 376
    iput-boolean v2, v0, Ll/ۛ֨;->ܿ:Z

    const/4 v6, 0x0

    .line 377
    :goto_0
    iget-object v8, v0, Ll/ۚ֨;->ܺ:[F

    array-length v9, v8

    if-ge v6, v9, :cond_2

    .line 378
    iget-boolean v9, v0, Ll/ۛ֨;->ܿ:Z

    iget-object v11, v0, Ll/ۚ֨;->ۘ:[F

    aget v11, v11, v6

    float-to-double v12, v11

    const-wide/16 v14, 0x0

    cmpl-double v16, v12, v14

    if-eqz v16, :cond_1

    const/4 v12, 0x1

    goto :goto_1

    :cond_1
    const/4 v12, 0x0

    :goto_1
    or-int/2addr v9, v12

    iput-boolean v9, v0, Ll/ۛ֨;->ܿ:Z

    mul-float v11, v11, v1

    add-float/2addr v11, v4

    .line 379
    aput v11, v8, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 381
    :cond_2
    iget-object v1, v0, Ll/ۚ֨;->ۖ:Landroid/util/SparseArray;

    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰܶ;

    iget-object v2, v0, Ll/ۚ֨;->ܺ:[F

    invoke-virtual {v1, v3, v2}, Ll/ܰܶ;->֫(Landroid/view/View;[F)V

    cmpl-float v1, v5, v10

    if-eqz v1, :cond_3

    .line 383
    iput-boolean v7, v0, Ll/ۛ֨;->ܿ:Z

    .line 385
    :cond_3
    iget-boolean v1, v0, Ll/ۛ֨;->ܿ:Z

    return v1
.end method
