.class public final Ll/۬ۗ;
.super Ljava/lang/Object;
.source "YAYY"


# static fields
.field public static final ۡ:Ll/۬ۗ;


# instance fields
.field public final ֫:F

.field public final ۜ:F

.field public final ۢ:F

.field public final ۧ:F

.field public final ܳ:F

.field public final ܽ:F

.field public final ܿ:F

.field public final ᩳ:F

.field public final ᩷:[F

.field public final ᩻:F


# direct methods
.method public static constructor <clinit>()V
    .locals 24

    .line 56
    invoke-static {}, Ll/ܿۗ;->֫()F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x404fd4bbab8b494cL    # 63.66197723675813

    mul-double v0, v0, v2

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    div-double/2addr v0, v2

    double-to-float v0, v0

    .line 132
    sget-object v1, Ll/ܿۗ;->ܽ:[F

    const/4 v4, 0x0

    aget v5, v1, v4

    sget-object v6, Ll/ܿۗ;->ᩳ:[[F

    aget-object v7, v6, v4

    aget v8, v7, v4

    mul-float v8, v8, v5

    const/4 v9, 0x1

    aget v10, v1, v9

    aget v11, v7, v9

    mul-float v11, v11, v10

    add-float/2addr v11, v8

    const/4 v8, 0x2

    aget v12, v1, v8

    aget v7, v7, v8

    mul-float v7, v7, v12

    add-float/2addr v7, v11

    .line 133
    aget-object v11, v6, v9

    aget v13, v11, v4

    mul-float v13, v13, v5

    aget v14, v11, v9

    mul-float v14, v14, v10

    add-float/2addr v14, v13

    aget v11, v11, v8

    mul-float v11, v11, v12

    add-float/2addr v11, v14

    .line 134
    aget-object v6, v6, v8

    aget v13, v6, v4

    mul-float v5, v5, v13

    aget v13, v6, v9

    mul-float v10, v10, v13

    add-float/2addr v10, v5

    aget v5, v6, v8

    mul-float v12, v12, v5

    add-float/2addr v12, v10

    const/high16 v5, 0x3f800000    # 1.0f

    float-to-double v13, v5

    const-wide v15, 0x3feccccccccccccdL    # 0.9

    cmpl-double v6, v13, v15

    if-ltz v6, :cond_0

    const v6, 0x3f30a3d7    # 0.69f

    const v18, 0x3f30a3d7    # 0.69f

    goto :goto_0

    :cond_0
    const v6, 0x3f27ae14    # 0.655f

    const v18, 0x3f27ae14    # 0.655f

    :goto_0
    neg-float v6, v0

    const/high16 v10, 0x42280000    # 42.0f

    sub-float/2addr v6, v10

    const/high16 v10, 0x42b80000    # 92.0f

    div-float/2addr v6, v10

    float-to-double v13, v6

    .line 142
    invoke-static {v13, v14}, Ljava/lang/Math;->exp(D)D

    move-result-wide v13

    double-to-float v6, v13

    const v10, 0x3e8e38e4

    mul-float v6, v6, v10

    const/high16 v10, 0x3f800000    # 1.0f

    sub-float v6, v10, v6

    mul-float v6, v6, v5

    float-to-double v13, v6

    const-wide/high16 v15, 0x3ff0000000000000L    # 1.0

    cmpl-double v5, v13, v15

    if-lez v5, :cond_1

    const/high16 v6, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_1
    const-wide/16 v15, 0x0

    cmpg-double v5, v13, v15

    if-gez v5, :cond_2

    const/4 v6, 0x0

    :cond_2
    :goto_1
    const/high16 v5, 0x42c80000    # 100.0f

    div-float v13, v5, v7

    mul-float v13, v13, v6

    add-float/2addr v13, v10

    sub-float/2addr v13, v6

    div-float v14, v5, v11

    mul-float v14, v14, v6

    add-float/2addr v14, v10

    sub-float/2addr v14, v6

    div-float/2addr v5, v12

    mul-float v5, v5, v6

    add-float/2addr v5, v10

    sub-float/2addr v5, v6

    const/4 v6, 0x3

    new-array v15, v6, [F

    aput v13, v15, v4

    aput v14, v15, v9

    aput v5, v15, v8

    const/high16 v4, 0x40a00000    # 5.0f

    mul-float v4, v4, v0

    add-float/2addr v4, v10

    div-float v4, v10, v4

    mul-float v5, v4, v4

    mul-float v5, v5, v4

    mul-float v5, v5, v4

    sub-float/2addr v10, v5

    mul-float v5, v5, v0

    const v4, 0x3dcccccd    # 0.1f

    mul-float v4, v4, v10

    mul-float v4, v4, v10

    const-wide/high16 v13, 0x4014000000000000L    # 5.0

    const/4 v8, 0x0

    float-to-double v2, v0

    mul-double v2, v2, v13

    .line 165
    invoke-static {v2, v3}, Ljava/lang/Math;->cbrt(D)D

    move-result-wide v2

    double-to-float v0, v2

    mul-float v4, v4, v0

    add-float v0, v4, v5

    .line 169
    invoke-static {}, Ll/ܿۗ;->֫()F

    move-result v2

    aget v1, v1, v9

    div-float v14, v2, v1

    float-to-double v1, v14

    .line 173
    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v3

    double-to-float v3, v3

    const v4, 0x3fbd70a4    # 1.48f

    add-float v23, v3, v4

    const-wide v3, 0x3fc999999999999aL    # 0.2

    .line 176
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    double-to-float v1, v1

    const v2, 0x3f39999a    # 0.725f

    div-float v1, v2, v1

    .line 181
    aget v2, v15, v8

    mul-float v2, v2, v0

    mul-float v2, v2, v7

    float-to-double v2, v2

    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    div-double/2addr v2, v4

    const/4 v7, 0x1

    const/4 v8, 0x2

    const-wide v9, 0x3fdae147ae147ae1L    # 0.42

    invoke-static {v2, v3, v9, v10}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    double-to-float v2, v2

    aget v3, v15, v7

    mul-float v3, v3, v0

    mul-float v3, v3, v11

    float-to-double v6, v3

    div-double/2addr v6, v4

    .line 182
    invoke-static {v6, v7, v9, v10}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v6

    double-to-float v3, v6

    aget v6, v15, v8

    mul-float v6, v6, v0

    mul-float v6, v6, v12

    const/4 v7, 0x0

    float-to-double v11, v6

    div-double/2addr v11, v4

    invoke-static {v11, v12, v9, v10}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v4

    double-to-float v4, v4

    const/4 v5, 0x3

    new-array v6, v5, [F

    aput v2, v6, v7

    const/4 v2, 0x1

    aput v3, v6, v2

    aput v4, v6, v8

    .line 185
    aget v3, v6, v7

    const/high16 v4, 0x43c80000    # 400.0f

    mul-float v5, v3, v4

    const v9, 0x41d90a3d    # 27.13f

    add-float/2addr v3, v9

    div-float/2addr v5, v3

    aget v3, v6, v2

    mul-float v10, v3, v4

    add-float/2addr v3, v9

    div-float/2addr v10, v3

    aget v3, v6, v8

    mul-float v4, v4, v3

    add-float/2addr v3, v9

    div-float/2addr v4, v3

    const/4 v3, 0x3

    new-array v3, v3, [F

    aput v5, v3, v7

    aput v10, v3, v2

    aput v4, v3, v8

    const/high16 v4, 0x40000000    # 2.0f

    .line 189
    aget v5, v3, v7

    mul-float v5, v5, v4

    aget v2, v3, v2

    add-float/2addr v5, v2

    const v2, 0x3d4ccccd    # 0.05f

    aget v3, v3, v8

    mul-float v3, v3, v2

    add-float/2addr v3, v5

    mul-float v2, v3, v1

    .line 191
    new-instance v3, Ll/۬ۗ;

    float-to-double v4, v0

    const-wide/high16 v6, 0x3fd0000000000000L    # 0.25

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v4

    double-to-float v4, v4

    const/high16 v19, 0x3f800000    # 1.0f

    move-object v13, v3

    move-object v5, v15

    move v15, v2

    move/from16 v16, v1

    move/from16 v17, v1

    move-object/from16 v20, v5

    move/from16 v21, v0

    move/from16 v22, v4

    invoke-direct/range {v13 .. v23}, Ll/۬ۗ;-><init>(FFFFFF[FFFF)V

    .line 54
    sput-object v3, Ll/۬ۗ;->ۡ:Ll/۬ۗ;

    return-void
.end method

.method public constructor <init>(FFFFFF[FFFF)V
    .locals 0

    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 113
    iput p1, p0, Ll/۬ۗ;->ܿ:F

    .line 114
    iput p2, p0, Ll/۬ۗ;->֫:F

    .line 115
    iput p3, p0, Ll/۬ۗ;->ܳ:F

    .line 116
    iput p4, p0, Ll/۬ۗ;->ۜ:F

    .line 117
    iput p5, p0, Ll/۬ۗ;->ۧ:F

    .line 118
    iput p6, p0, Ll/۬ۗ;->᩻:F

    .line 119
    iput-object p7, p0, Ll/۬ۗ;->᩷:[F

    .line 120
    iput p8, p0, Ll/۬ۗ;->ܽ:F

    .line 121
    iput p9, p0, Ll/۬ۗ;->ᩳ:F

    .line 122
    iput p10, p0, Ll/۬ۗ;->ۢ:F

    return-void
.end method


# virtual methods
.method public final ֫()F
    .locals 1

    .line 71
    iget v0, p0, Ll/۬ۗ;->֫:F

    return v0
.end method

.method public final ۜ()F
    .locals 1

    .line 83
    iget v0, p0, Ll/۬ۗ;->ۜ:F

    return v0
.end method

.method public final ۢ()F
    .locals 1

    .line 108
    iget v0, p0, Ll/۬ۗ;->ۢ:F

    return v0
.end method

.method public final ۧ()F
    .locals 1

    .line 87
    iget v0, p0, Ll/۬ۗ;->ۧ:F

    return v0
.end method

.method public final ܳ()F
    .locals 1

    .line 79
    iget v0, p0, Ll/۬ۗ;->ܳ:F

    return v0
.end method

.method public final ܽ()F
    .locals 1

    .line 100
    iget v0, p0, Ll/۬ۗ;->ܽ:F

    return v0
.end method

.method public final ܿ()F
    .locals 1

    .line 75
    iget v0, p0, Ll/۬ۗ;->ܿ:F

    return v0
.end method

.method public final ᩳ()F
    .locals 1

    .line 104
    iget v0, p0, Ll/۬ۗ;->ᩳ:F

    return v0
.end method

.method public final ᩷()[F
    .locals 1

    .line 96
    iget-object v0, p0, Ll/۬ۗ;->᩷:[F

    return-object v0
.end method

.method public final ᩻()F
    .locals 1

    .line 91
    iget v0, p0, Ll/۬ۗ;->᩻:F

    return v0
.end method
