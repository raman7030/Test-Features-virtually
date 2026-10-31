.class public abstract Ll/ۛ֨;
.super Ljava/lang/Object;
.source "V1D4"


# instance fields
.field public ֫:I

.field public ۜ:Ljava/lang/String;

.field public ۢ:I

.field public ۧ:F

.field public ܳ:Ll/᩷֡;

.field public ܽ:J

.field public ܿ:Z

.field public ᩳ:[F

.field public ᩷:[[F

.field public ᩻:[I


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 39
    iput v0, p0, Ll/ۛ֨;->ۢ:I

    const/16 v1, 0xa

    new-array v2, v1, [I

    .line 40
    iput-object v2, p0, Ll/ۛ֨;->᩻:[I

    const/4 v2, 0x2

    new-array v2, v2, [I

    const/4 v3, 0x1

    const/4 v4, 0x3

    aput v4, v2, v3

    aput v1, v2, v0

    .line 41
    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-static {v1, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [[F

    iput-object v1, p0, Ll/ۛ֨;->᩷:[[F

    new-array v1, v4, [F

    .line 44
    iput-object v1, p0, Ll/ۛ֨;->ᩳ:[F

    .line 49
    iput-boolean v0, p0, Ll/ۛ֨;->ܿ:Z

    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 51
    iput v0, p0, Ll/ۛ֨;->ۧ:F

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 55
    iget-object v0, p0, Ll/ۛ֨;->ۜ:Ljava/lang/String;

    .line 56
    new-instance v1, Ljava/text/DecimalFormat;

    const-string v2, "##.##"

    invoke-direct {v1, v2}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 57
    :goto_0
    iget v3, p0, Ll/ۛ֨;->֫:I

    if-ge v2, v3, :cond_0

    const-string v3, "["

    .line 0
    invoke-static {v0, v3}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 58
    iget-object v3, p0, Ll/ۛ֨;->᩻:[I

    aget v3, v3, v2

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " , "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Ll/ۛ֨;->᩷:[[F

    aget-object v3, v3, v2

    invoke-virtual {v1, v3}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "] "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final ֫(F)F
    .locals 4

    .line 100
    iget v0, p0, Ll/ۛ֨;->ۢ:I

    const v1, 0x40c90fdb

    const/high16 v2, 0x40000000    # 2.0f

    const/high16 v3, 0x3f800000    # 1.0f

    packed-switch v0, :pswitch_data_0

    mul-float p1, p1, v1

    float-to-double v0, p1

    .line 103
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    double-to-float p1, v0

    return p1

    :pswitch_0
    const/high16 v0, 0x40800000    # 4.0f

    mul-float p1, p1, v0

    rem-float/2addr p1, v0

    sub-float/2addr p1, v2

    .line 115
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    sub-float p1, v3, p1

    mul-float p1, p1, p1

    goto :goto_0

    :pswitch_1
    mul-float p1, p1, v1

    float-to-double v0, p1

    .line 113
    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v0

    double-to-float p1, v0

    return p1

    :pswitch_2
    mul-float p1, p1, v2

    add-float/2addr p1, v3

    rem-float/2addr p1, v2

    goto :goto_0

    :pswitch_3
    mul-float p1, p1, v2

    add-float/2addr p1, v3

    rem-float/2addr p1, v2

    sub-float/2addr p1, v3

    return p1

    .line 107
    :pswitch_4
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    :goto_0
    sub-float/2addr v3, p1

    return v3

    :pswitch_5
    mul-float p1, p1, v1

    .line 105
    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(FJLandroid/view/View;Ll/ܶ֡;)F
    .locals 18

    move-object/from16 v0, p0

    move-wide/from16 v1, p2

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    .line 70
    iget-object v5, v0, Ll/ۛ֨;->ܳ:Ll/᩷֡;

    move/from16 v6, p1

    float-to-double v6, v6

    iget-object v8, v0, Ll/ۛ֨;->ᩳ:[F

    invoke-virtual {v5, v6, v7, v8}, Ll/᩷֡;->֫(D[F)V

    const/4 v5, 0x1

    .line 71
    aget v6, v8, v5

    const/4 v7, 0x2

    const/4 v9, 0x0

    const/4 v10, 0x0

    cmpl-float v11, v6, v10

    if-nez v11, :cond_0

    .line 73
    iput-boolean v9, v0, Ll/ۛ֨;->ܿ:Z

    .line 74
    aget v1, v8, v7

    return v1

    .line 76
    :cond_0
    iget v7, v0, Ll/ۛ֨;->ۧ:F

    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 77
    iget-object v7, v0, Ll/ۛ֨;->ۜ:Ljava/lang/String;

    invoke-virtual {v4, v3, v7}, Ll/ܶ֡;->֫(Landroid/view/View;Ljava/lang/String;)F

    move-result v7

    iput v7, v0, Ll/ۛ֨;->ۧ:F

    .line 78
    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 79
    iput v10, v0, Ll/ۛ֨;->ۧ:F

    .line 82
    :cond_1
    iget-wide v12, v0, Ll/ۛ֨;->ܽ:J

    sub-long v12, v1, v12

    .line 83
    iget v7, v0, Ll/ۛ֨;->ۧ:F

    float-to-double v14, v7

    long-to-double v12, v12

    const-wide v16, 0x3e112e0be826d695L    # 1.0E-9

    mul-double v12, v12, v16

    const/4 v7, 0x2

    move/from16 v16, v11

    float-to-double v10, v6

    mul-double v12, v12, v10

    add-double/2addr v12, v14

    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    rem-double/2addr v12, v10

    double-to-float v6, v12

    iput v6, v0, Ll/ۛ֨;->ۧ:F

    .line 84
    iget-object v10, v0, Ll/ۛ֨;->ۜ:Ljava/lang/String;

    .line 31
    iget-object v4, v4, Ll/ܶ֡;->֫:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_2

    .line 32
    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    new-array v12, v5, [F

    aput v6, v12, v9

    .line 35
    invoke-virtual {v11, v10, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    invoke-virtual {v4, v3, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 38
    :cond_2
    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/HashMap;

    .line 39
    invoke-virtual {v11, v10}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_3

    new-array v12, v5, [F

    aput v6, v12, v9

    .line 42
    invoke-virtual {v11, v10, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    invoke-virtual {v4, v3, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 45
    :cond_3
    invoke-virtual {v11, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [F

    .line 46
    array-length v4, v3

    if-gtz v4, :cond_4

    .line 47
    invoke-static {v3, v5}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v3

    .line 49
    :cond_4
    aput v6, v3, v9

    .line 50
    invoke-virtual {v11, v10, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    :goto_0
    iput-wide v1, v0, Ll/ۛ֨;->ܽ:J

    .line 86
    aget v1, v8, v9

    .line 87
    iget v2, v0, Ll/ۛ֨;->ۧ:F

    invoke-virtual {v0, v2}, Ll/ۛ֨;->֫(F)F

    move-result v2

    .line 88
    aget v3, v8, v7

    mul-float v2, v2, v1

    add-float/2addr v2, v3

    const/4 v3, 0x0

    cmpl-float v1, v1, v3

    if-nez v1, :cond_6

    if-eqz v16, :cond_5

    goto :goto_1

    :cond_5
    const/4 v5, 0x0

    .line 90
    :cond_6
    :goto_1
    iput-boolean v5, v0, Ll/ۛ֨;->ܿ:Z

    return v2
.end method

.method public ֫(FFFII)V
    .locals 2

    .line 179
    iget v0, p0, Ll/ۛ֨;->֫:I

    iget-object v1, p0, Ll/ۛ֨;->᩻:[I

    aput p4, v1, v0

    .line 180
    iget-object p4, p0, Ll/ۛ֨;->᩷:[[F

    aget-object p4, p4, v0

    const/4 v0, 0x0

    aput p1, p4, v0

    const/4 p1, 0x1

    .line 181
    aput p2, p4, p1

    const/4 p2, 0x2

    .line 182
    aput p3, p4, p2

    .line 183
    iget p2, p0, Ll/ۛ֨;->ۢ:I

    invoke-static {p2, p5}, Ljava/lang/Math;->max(II)I

    move-result p2

    iput p2, p0, Ll/ۛ֨;->ۢ:I

    .line 184
    iget p2, p0, Ll/ۛ֨;->֫:I

    add-int/2addr p2, p1

    iput p2, p0, Ll/ۛ֨;->֫:I

    return-void
.end method

.method public ֫(I)V
    .locals 17

    move-object/from16 v0, p0

    .line 188
    iget v1, v0, Ll/ۛ֨;->֫:I

    if-nez v1, :cond_0

    return-void

    :cond_0
    const/4 v2, 0x1

    sub-int/2addr v1, v2

    .line 422
    iget-object v3, v0, Ll/ۛ֨;->᩻:[I

    array-length v4, v3

    add-int/lit8 v4, v4, 0xa

    new-array v4, v4, [I

    const/4 v5, 0x0

    .line 424
    aput v1, v4, v5

    .line 425
    aput v5, v4, v2

    const/4 v1, 0x2

    const/4 v6, 0x2

    .line 426
    :goto_0
    iget-object v7, v0, Ll/ۛ֨;->᩷:[[F

    if-lez v6, :cond_4

    add-int/lit8 v8, v6, -0x1

    .line 427
    aget v9, v4, v8

    add-int/lit8 v10, v6, -0x2

    .line 428
    aget v11, v4, v10

    if-ge v9, v11, :cond_3

    .line 440
    aget v12, v3, v11

    move v13, v9

    move v14, v13

    :goto_1
    if-ge v13, v11, :cond_2

    .line 443
    aget v15, v3, v13

    if-gt v15, v12, :cond_1

    .line 453
    aget v16, v3, v14

    .line 454
    aput v15, v3, v14

    .line 455
    aput v16, v3, v13

    .line 456
    aget-object v15, v7, v14

    .line 457
    aget-object v16, v7, v13

    aput-object v16, v7, v14

    .line 458
    aput-object v15, v7, v13

    add-int/lit8 v14, v14, 0x1

    :cond_1
    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    .line 453
    :cond_2
    aget v12, v3, v14

    .line 454
    aget v13, v3, v11

    aput v13, v3, v14

    .line 455
    aput v12, v3, v11

    .line 456
    aget-object v12, v7, v14

    .line 457
    aget-object v13, v7, v11

    aput-object v13, v7, v14

    .line 458
    aput-object v12, v7, v11

    add-int/lit8 v7, v14, -0x1

    .line 431
    aput v7, v4, v10

    .line 432
    aput v9, v4, v8

    add-int/lit8 v7, v6, 0x1

    .line 433
    aput v11, v4, v6

    add-int/lit8 v6, v6, 0x2

    add-int/lit8 v14, v14, 0x1

    .line 434
    aput v14, v4, v7

    goto :goto_0

    :cond_3
    move v6, v10

    goto :goto_0

    :cond_4
    const/4 v4, 0x1

    const/4 v6, 0x0

    .line 194
    :goto_2
    array-length v8, v3

    if-ge v4, v8, :cond_6

    .line 195
    aget v8, v3, v4

    add-int/lit8 v9, v4, -0x1

    aget v9, v3, v9

    if-eq v8, v9, :cond_5

    add-int/lit8 v6, v6, 0x1

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_6
    if-nez v6, :cond_7

    const/4 v6, 0x1

    .line 202
    :cond_7
    new-array v4, v6, [D

    new-array v8, v1, [I

    const/4 v9, 0x3

    aput v9, v8, v2

    aput v6, v8, v5

    .line 203
    sget-object v6, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v6, v8}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [[D

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 206
    :goto_3
    iget v10, v0, Ll/ۛ֨;->֫:I

    if-ge v8, v10, :cond_9

    if-lez v8, :cond_8

    .line 207
    aget v10, v3, v8

    add-int/lit8 v11, v8, -0x1

    aget v11, v3, v11

    if-ne v10, v11, :cond_8

    goto :goto_4

    .line 210
    :cond_8
    aget v10, v3, v8

    int-to-double v10, v10

    const-wide v12, 0x3f847ae147ae147bL    # 0.01

    mul-double v10, v10, v12

    aput-wide v10, v4, v9

    .line 211
    aget-object v10, v6, v9

    aget-object v11, v7, v8

    aget v12, v11, v5

    float-to-double v12, v12

    aput-wide v12, v10, v5

    .line 212
    aget v12, v11, v2

    float-to-double v12, v12

    aput-wide v12, v10, v2

    .line 213
    aget v11, v11, v1

    float-to-double v11, v11

    aput-wide v11, v10, v1

    add-int/lit8 v9, v9, 0x1

    :goto_4
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_9
    move/from16 v8, p1

    .line 216
    invoke-static {v8, v4, v6}, Ll/᩷֡;->֫(I[D[[D)Ll/᩷֡;

    move-result-object v1

    iput-object v1, v0, Ll/ۛ֨;->ܳ:Ll/᩷֡;

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 64
    iput-object p1, p0, Ll/ۛ֨;->ۜ:Ljava/lang/String;

    return-void
.end method

.method public abstract ۧ(FJLandroid/view/View;Ll/ܶ֡;)Z
.end method
