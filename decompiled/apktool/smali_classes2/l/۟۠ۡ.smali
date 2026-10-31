.class public final Ll/۟۠ۡ;
.super Ljava/lang/Object;
.source "U6WD"


# instance fields
.field public final ֫:F

.field public final ۧ:F

.field public final ܽ:F

.field public final ᩳ:F


# direct methods
.method public constructor <init>([F)V
    .locals 22

    move-object/from16 v0, p0

    .line 7
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    .line 9
    aget v1, p1, v1

    const/4 v2, 0x5

    aget v2, p1, v2

    add-float v3, v1, v2

    const/16 v4, 0xa

    aget v4, p1, v4

    add-float/2addr v3, v4

    float-to-double v5, v3

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v7, 0x4

    const/4 v8, 0x1

    const/4 v9, 0x2

    const/16 v10, 0x8

    const/16 v11, 0x9

    const/4 v12, 0x6

    const-wide/high16 v13, 0x4010000000000000L    # 4.0

    const-wide/high16 v15, 0x4000000000000000L    # 2.0

    const-wide/16 v17, 0x0

    cmpl-double v19, v5, v17

    if-lez v19, :cond_0

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    add-double/2addr v5, v1

    .line 11
    invoke-static {v5, v6}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v1

    mul-double v1, v1, v15

    div-double v4, v1, v13

    .line 12
    aget v6, p1, v12

    aget v11, p1, v11

    sub-float/2addr v6, v11

    float-to-double v11, v6

    div-double/2addr v11, v1

    .line 13
    aget v6, p1, v10

    aget v9, p1, v9

    sub-float/2addr v6, v9

    float-to-double v9, v6

    div-double/2addr v9, v1

    aget v6, p1, v8

    aget v7, p1, v7

    sub-float/2addr v6, v7

    float-to-double v6, v6

    div-double/2addr v6, v1

    goto/16 :goto_1

    :cond_0
    cmpl-float v5, v1, v2

    if-lez v5, :cond_1

    cmpl-float v5, v1, v4

    if-lez v5, :cond_1

    add-float/2addr v1, v3

    sub-float/2addr v1, v2

    sub-float/2addr v1, v4

    float-to-double v1, v1

    .line 15
    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v1

    mul-double v1, v1, v15

    .line 16
    aget v4, p1, v12

    aget v5, p1, v11

    sub-float/2addr v4, v5

    float-to-double v4, v4

    div-double/2addr v4, v1

    div-double v11, v1, v13

    .line 17
    aget v6, p1, v7

    aget v7, p1, v8

    add-float/2addr v6, v7

    float-to-double v6, v6

    div-double/2addr v6, v1

    aget v8, p1, v10

    aget v9, p1, v9

    add-float/2addr v8, v9

    float-to-double v8, v8

    div-double/2addr v8, v1

    move-wide/from16 v20, v6

    move-wide v6, v8

    move-wide/from16 v9, v20

    goto :goto_1

    :cond_1
    cmpl-float v5, v2, v4

    if-lez v5, :cond_2

    add-float/2addr v2, v3

    sub-float/2addr v2, v1

    sub-float/2addr v2, v4

    float-to-double v1, v2

    .line 19
    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v1

    mul-double v1, v1, v15

    .line 20
    aget v4, p1, v10

    aget v5, p1, v9

    sub-float/2addr v4, v5

    float-to-double v4, v4

    div-double/2addr v4, v1

    aget v6, p1, v7

    aget v7, p1, v8

    add-float/2addr v6, v7

    float-to-double v6, v6

    div-double/2addr v6, v1

    div-double v8, v1, v13

    .line 21
    aget v10, p1, v11

    aget v11, p1, v12

    add-float/2addr v10, v11

    float-to-double v10, v10

    div-double/2addr v10, v1

    goto :goto_0

    :cond_2
    add-float/2addr v4, v3

    sub-float/2addr v4, v1

    sub-float/2addr v4, v2

    float-to-double v1, v4

    .line 23
    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v1

    mul-double v1, v1, v15

    .line 24
    aget v4, p1, v8

    aget v5, p1, v7

    sub-float/2addr v4, v5

    float-to-double v4, v4

    div-double/2addr v4, v1

    aget v6, p1, v10

    aget v7, p1, v9

    add-float/2addr v6, v7

    float-to-double v6, v6

    div-double/2addr v6, v1

    .line 25
    aget v8, p1, v11

    aget v9, p1, v12

    add-float/2addr v8, v9

    float-to-double v8, v8

    div-double/2addr v8, v1

    div-double v10, v1, v13

    :goto_0
    move-wide/from16 v20, v6

    move-wide v6, v10

    move-wide/from16 v11, v20

    move-wide v9, v8

    :goto_1
    cmpg-double v1, v4, v17

    if-gez v1, :cond_3

    neg-double v4, v4

    neg-double v11, v11

    neg-double v9, v9

    neg-double v6, v6

    :cond_3
    mul-double v1, v11, v11

    mul-double v13, v9, v9

    add-double/2addr v13, v1

    mul-double v1, v6, v6

    add-double/2addr v1, v13

    .line 28
    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v1

    const-wide v13, 0x3e45798ee2308c3aL    # 1.0E-8

    cmpg-double v8, v1, v13

    if-gez v8, :cond_4

    const/4 v1, 0x0

    .line 29
    iput v1, v0, Ll/۟۠ۡ;->ۧ:F

    iput v3, v0, Ll/۟۠ۡ;->ܽ:F

    iput v1, v0, Ll/۟۠ۡ;->ᩳ:F

    iput v1, v0, Ll/۟۠ۡ;->֫:F

    return-void

    :cond_4
    div-double/2addr v11, v1

    double-to-float v3, v11

    .line 31
    iput v3, v0, Ll/۟۠ۡ;->ۧ:F

    div-double/2addr v9, v1

    double-to-float v3, v9

    iput v3, v0, Ll/۟۠ۡ;->ܽ:F

    div-double/2addr v6, v1

    double-to-float v3, v6

    iput v3, v0, Ll/۟۠ۡ;->ᩳ:F

    .line 32
    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v1

    mul-double v1, v1, v15

    invoke-static {v1, v2}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v1

    double-to-float v1, v1

    iput v1, v0, Ll/۟۠ۡ;->֫:F

    return-void
.end method
