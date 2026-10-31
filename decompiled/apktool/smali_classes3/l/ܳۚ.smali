.class public abstract Ll/ܳۚ;
.super Ljava/lang/Object;
.source "71DP"


# instance fields
.field public ֫:Ll/ܰܶ;

.field public ۧ:Ll/۬֡;

.field public ܳ:I

.field public ܽ:Ljava/lang/String;

.field public ܿ:Ljava/util/ArrayList;

.field public ᩳ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 46
    iput v0, p0, Ll/ܳۚ;->ܳ:I

    .line 47
    iput v0, p0, Ll/ܳۚ;->ᩳ:I

    .line 48
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܳۚ;->ܿ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 70
    iget-object v0, p0, Ll/ܳۚ;->ܽ:Ljava/lang/String;

    .line 71
    new-instance v1, Ljava/text/DecimalFormat;

    const-string v2, "##.##"

    invoke-direct {v1, v2}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 72
    iget-object v2, p0, Ll/ܳۚ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܿۚ;

    const-string v4, "["

    .line 0
    invoke-static {v0, v4}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 73
    iget v4, v3, Ll/ܿۚ;->ܽ:I

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " , "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v3, Ll/ܿۚ;->ᩳ:F

    float-to-double v3, v3

    invoke-virtual {v1, v3, v4}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "] "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final ֫(F)F
    .locals 7

    .line 85
    iget-object v0, p0, Ll/ܳۚ;->ۧ:Ll/۬֡;

    .line 437
    iget-object v1, v0, Ll/۬֡;->֫:Ll/᩷֡;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    float-to-double v4, p1

    .line 438
    iget-object v6, v0, Ll/۬֡;->᩻:[D

    invoke-virtual {v1, v4, v5, v6}, Ll/᩷֡;->֫(D[D)V

    goto :goto_0

    .line 440
    :cond_0
    iget-object v1, v0, Ll/۬֡;->᩻:[D

    iget-object v4, v0, Ll/۬֡;->ۧ:[F

    aget v4, v4, v3

    float-to-double v4, v4

    aput-wide v4, v1, v3

    .line 441
    iget-object v4, v0, Ll/۬֡;->ۜ:[F

    aget v4, v4, v3

    float-to-double v4, v4

    aput-wide v4, v1, v2

    .line 443
    :goto_0
    iget-object v1, v0, Ll/۬֡;->᩻:[D

    aget-wide v3, v1, v3

    .line 444
    iget-object v1, v0, Ll/۬֡;->ܽ:Ll/ۘ֡;

    float-to-double v5, p1

    invoke-virtual {v1, v5, v6}, Ll/ۘ֡;->ᩳ(D)D

    move-result-wide v5

    .line 445
    iget-object p1, v0, Ll/۬֡;->᩻:[D

    aget-wide v0, p1, v2

    mul-double v5, v5, v0

    add-double/2addr v5, v3

    double-to-float p1, v5

    return p1
.end method

.method public final ֫()V
    .locals 17
    .annotation build Landroid/annotation/TargetApi;
        value = 0x13
    .end annotation

    move-object/from16 v0, p0

    .line 173
    iget-object v1, v0, Ll/ܳۚ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-nez v2, :cond_0

    return-void

    .line 177
    :cond_0
    new-instance v3, Ll/᩶֡;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-static {v1, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 183
    new-array v3, v2, [D

    const/4 v4, 0x2

    new-array v5, v4, [I

    const/4 v6, 0x1

    aput v4, v5, v6

    const/4 v7, 0x0

    aput v2, v5, v7

    .line 184
    sget-object v8, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v8, v5}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [[D

    .line 185
    new-instance v9, Ll/۬֡;

    iget v10, v0, Ll/ܳۚ;->ܳ:I

    .line 425
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 413
    new-instance v11, Ll/ۘ֡;

    invoke-direct {v11}, Ll/ۘ֡;-><init>()V

    iput-object v11, v9, Ll/۬֡;->ܽ:Ll/ۘ֡;

    .line 461
    new-instance v12, Ljava/util/HashMap;

    invoke-direct {v12}, Ljava/util/HashMap;-><init>()V

    .line 428
    invoke-virtual {v11, v10}, Ll/ۘ֡;->֫(I)V

    .line 429
    new-array v10, v2, [F

    iput-object v10, v9, Ll/۬֡;->ۜ:[F

    .line 430
    new-array v10, v2, [D

    iput-object v10, v9, Ll/۬֡;->ܿ:[D

    .line 431
    new-array v10, v2, [F

    iput-object v10, v9, Ll/۬֡;->ᩳ:[F

    .line 432
    new-array v10, v2, [F

    iput-object v10, v9, Ll/۬֡;->ۧ:[F

    .line 433
    new-array v2, v2, [F

    .line 185
    iput-object v9, v0, Ll/ܳۚ;->ۧ:Ll/۬֡;

    .line 187
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ܿۚ;

    .line 188
    iget v10, v9, Ll/ܿۚ;->ۧ:F

    float-to-double v11, v10

    const-wide v13, 0x3f847ae147ae147bL    # 0.01

    mul-double v11, v11, v13

    aput-wide v11, v3, v2

    .line 189
    aget-object v11, v5, v2

    iget v12, v9, Ll/ܿۚ;->ᩳ:F

    float-to-double v13, v12

    aput-wide v13, v11, v7

    .line 190
    iget v7, v9, Ll/ܿۚ;->֫:F

    float-to-double v13, v7

    aput-wide v13, v11, v6

    .line 191
    iget-object v6, v0, Ll/ܳۚ;->ۧ:Ll/۬֡;

    iget v9, v9, Ll/ܿۚ;->ܽ:I

    .line 486
    iget-object v11, v6, Ll/۬֡;->ܿ:[D

    int-to-double v13, v9

    const-wide/high16 v15, 0x4059000000000000L    # 100.0

    div-double/2addr v13, v15

    aput-wide v13, v11, v2

    .line 487
    iget-object v9, v6, Ll/۬֡;->ᩳ:[F

    aput v10, v9, v2

    .line 488
    iget-object v9, v6, Ll/۬֡;->ۧ:[F

    aput v7, v9, v2

    .line 489
    iget-object v6, v6, Ll/۬֡;->ۜ:[F

    aput v12, v6, v2

    add-int/lit8 v2, v2, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x0

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 194
    iget-object v6, v0, Ll/ܳۚ;->ۧ:Ll/۬֡;

    .line 493
    iget-object v7, v6, Ll/۬֡;->ᩳ:[F

    iget-object v9, v6, Ll/۬֡;->ܽ:Ll/ۘ֡;

    .line 494
    iget-object v10, v6, Ll/۬֡;->ܿ:[D

    array-length v11, v10

    new-array v12, v4, [I

    aput v4, v12, v1

    aput v11, v12, v2

    invoke-static {v8, v12}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [[D

    .line 495
    iget-object v8, v6, Ll/۬֡;->ۜ:[F

    array-length v11, v8

    add-int/2addr v11, v1

    new-array v11, v11, [D

    iput-object v11, v6, Ll/۬֡;->᩻:[D

    .line 496
    array-length v11, v8

    add-int/2addr v11, v1

    new-array v11, v11, [D

    iput-object v11, v6, Ll/۬֡;->ܳ:[D

    .line 497
    aget-wide v11, v10, v2

    const-wide/16 v13, 0x0

    cmpl-double v15, v11, v13

    if-lez v15, :cond_2

    .line 498
    aget v11, v7, v2

    invoke-virtual {v9, v13, v14, v11}, Ll/ۘ֡;->֫(DF)V

    .line 500
    :cond_2
    array-length v11, v10

    sub-int/2addr v11, v1

    .line 501
    aget-wide v12, v10, v11

    const-wide/high16 v14, 0x3ff0000000000000L    # 1.0

    cmpg-double v16, v12, v14

    if-gez v16, :cond_3

    .line 502
    aget v11, v7, v11

    invoke-virtual {v9, v14, v15, v11}, Ll/ۘ֡;->֫(DF)V

    :cond_3
    const/4 v11, 0x0

    .line 504
    :goto_1
    array-length v12, v4

    if-ge v11, v12, :cond_5

    .line 505
    aget-object v12, v4, v11

    iget-object v13, v6, Ll/۬֡;->ۧ:[F

    aget v13, v13, v11

    float-to-double v13, v13

    aput-wide v13, v12, v2

    const/4 v12, 0x0

    .line 506
    :goto_2
    array-length v13, v8

    if-ge v12, v13, :cond_4

    .line 507
    aget-object v13, v4, v12

    aget v14, v8, v12

    float-to-double v14, v14

    aput-wide v14, v13, v1

    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    .line 509
    :cond_4
    aget-wide v12, v10, v11

    aget v14, v7, v11

    invoke-virtual {v9, v12, v13, v14}, Ll/ۘ֡;->֫(DF)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 512
    :cond_5
    invoke-virtual {v9}, Ll/ۘ֡;->֫()V

    .line 513
    array-length v2, v10

    if-le v2, v1, :cond_6

    const/4 v1, 0x0

    .line 514
    invoke-static {v1, v10, v4}, Ll/᩷֡;->֫(I[D[[D)Ll/᩷֡;

    move-result-object v2

    iput-object v2, v6, Ll/۬֡;->֫:Ll/᩷֡;

    goto :goto_3

    :cond_6
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 516
    iput-object v2, v6, Ll/۬֡;->֫:Ll/᩷֡;

    .line 195
    :goto_3
    invoke-static {v1, v3, v5}, Ll/᩷֡;->֫(I[D[[D)Ll/᩷֡;

    return-void
.end method

.method public abstract ֫(FLandroid/view/View;)V
.end method

.method public final ֫(IIIFFF)V
    .locals 1

    .line 164
    new-instance v0, Ll/ܿۚ;

    invoke-direct {v0, p1, p4, p5, p6}, Ll/ܿۚ;-><init>(IFFF)V

    iget-object p1, p0, Ll/ܳۚ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, -0x1

    if-eq p3, p1, :cond_0

    .line 166
    iput p3, p0, Ll/ܳۚ;->ᩳ:I

    .line 168
    :cond_0
    iput p2, p0, Ll/ܳۚ;->ܳ:I

    return-void
.end method

.method public final ֫(IIIFFFLl/ܰܶ;)V
    .locals 1

    .line 146
    new-instance v0, Ll/ܿۚ;

    invoke-direct {v0, p1, p4, p5, p6}, Ll/ܿۚ;-><init>(IFFF)V

    iget-object p1, p0, Ll/ܳۚ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, -0x1

    if-eq p3, p1, :cond_0

    .line 148
    iput p3, p0, Ll/ܳۚ;->ᩳ:I

    .line 150
    :cond_0
    iput p2, p0, Ll/ܳۚ;->ܳ:I

    .line 151
    iput-object p7, p0, Ll/ܳۚ;->֫:Ll/ܰܶ;

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 79
    iput-object p1, p0, Ll/ܳۚ;->ܽ:Ljava/lang/String;

    return-void
.end method

.method public final ۧ(F)F
    .locals 11

    .line 89
    iget-object v0, p0, Ll/ܳۚ;->ۧ:Ll/۬֡;

    .line 449
    iget-object v1, v0, Ll/۬֡;->ܽ:Ll/ۘ֡;

    iget-object v2, v0, Ll/۬֡;->֫:Ll/᩷֡;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_0

    float-to-double v5, p1

    .line 450
    iget-object v7, v0, Ll/۬֡;->ܳ:[D

    invoke-virtual {v2, v5, v6, v7}, Ll/᩷֡;->ۧ(D[D)V

    .line 451
    iget-object v2, v0, Ll/۬֡;->֫:Ll/᩷֡;

    iget-object v7, v0, Ll/۬֡;->᩻:[D

    invoke-virtual {v2, v5, v6, v7}, Ll/᩷֡;->֫(D[D)V

    goto :goto_0

    .line 453
    :cond_0
    iget-object v2, v0, Ll/۬֡;->ܳ:[D

    const-wide/16 v5, 0x0

    aput-wide v5, v2, v3

    .line 454
    aput-wide v5, v2, v4

    :goto_0
    float-to-double v5, p1

    .line 456
    invoke-virtual {v1, v5, v6}, Ll/ۘ֡;->ᩳ(D)D

    move-result-wide v7

    .line 457
    invoke-virtual {v1, v5, v6}, Ll/ۘ֡;->ܽ(D)D

    move-result-wide v1

    .line 458
    iget-object p1, v0, Ll/۬֡;->ܳ:[D

    aget-wide v5, p1, v3

    aget-wide v9, p1, v4

    mul-double v7, v7, v9

    add-double/2addr v7, v5

    iget-object p1, v0, Ll/۬֡;->᩻:[D

    aget-wide v3, p1, v4

    mul-double v1, v1, v3

    add-double/2addr v1, v7

    double-to-float p1, v1

    return p1
.end method
