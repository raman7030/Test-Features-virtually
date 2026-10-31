.class public final Ll/ܺ᩹ۡ;
.super Ljava/lang/Object;
.source "CBKJ"


# instance fields
.field public ֫:Z

.field public ۧ:F

.field public ܽ:F

.field public ᩳ:F


# direct methods
.method public constructor <init>(Ll/֡᩶ۡ;FFFFFFFFF)V
    .locals 36

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p4

    move/from16 v3, p5

    .line 45
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    const/4 v4, 0x0

    cmpl-float v5, v2, v4

    if-eqz v5, :cond_b

    cmpl-float v5, v3, v4

    if-nez v5, :cond_0

    goto/16 :goto_4

    :cond_0
    cmpl-float v5, p7, v4

    if-eqz v5, :cond_1

    const/4 v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    :goto_0
    cmpl-float v4, p8, v4

    if-eqz v4, :cond_2

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    move/from16 v6, p6

    float-to-double v6, v6

    .line 217
    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    move-result-wide v8

    .line 218
    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v10

    sub-float v12, p2, p9

    const/high16 v13, 0x40000000    # 2.0f

    div-float/2addr v12, v13

    float-to-double v14, v12

    sub-float v12, p3, p10

    div-float/2addr v12, v13

    float-to-double v0, v12

    mul-double v16, v8, v14

    mul-double v18, v10, v0

    add-double v18, v18, v16

    move-wide/from16 v16, v6

    neg-double v6, v10

    mul-double v6, v6, v14

    mul-double v0, v0, v8

    add-double/2addr v0, v6

    mul-float v6, v2, v2

    float-to-double v6, v6

    mul-float v12, v3, v3

    float-to-double v14, v12

    mul-double v20, v18, v18

    mul-double v22, v0, v0

    mul-double v24, v6, v14

    mul-double v22, v22, v6

    sub-double v24, v24, v22

    mul-double v14, v14, v20

    sub-double v24, v24, v14

    add-double v22, v22, v14

    div-double v24, v24, v22

    const-wide/16 v6, 0x0

    cmpg-double v12, v24, v6

    if-gez v12, :cond_3

    move-wide/from16 v24, v6

    .line 234
    :cond_3
    invoke-static/range {v24 .. v25}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v6

    if-ne v5, v4, :cond_4

    neg-double v6, v6

    :cond_4
    float-to-double v4, v2

    mul-double v14, v6, v4

    mul-double v14, v14, v0

    float-to-double v0, v3

    div-double/2addr v14, v0

    neg-double v6, v6

    mul-double v6, v6, v0

    mul-double v6, v6, v18

    div-double/2addr v6, v4

    add-float v12, p2, p9

    div-float/2addr v12, v13

    float-to-double v2, v12

    add-float v12, p3, p10

    div-float/2addr v12, v13

    float-to-double v12, v12

    move-wide/from16 v18, v0

    .line 244
    new-instance v0, Ll/۠᩶ۡ;

    mul-double v20, v8, v14

    mul-double v22, v10, v6

    sub-double v20, v20, v22

    add-double v1, v20, v2

    mul-double v10, v10, v14

    mul-double v8, v8, v6

    add-double/2addr v8, v10

    add-double/2addr v8, v12

    invoke-direct {v0, v1, v2, v8, v9}, Ll/۠᩶ۡ;-><init>(DD)V

    .line 60
    new-instance v1, Ll/۠᩶ۡ;

    const-wide/16 v2, 0x0

    invoke-direct {v1, v4, v5, v2, v3}, Ll/۠᩶ۡ;-><init>(DD)V

    .line 61
    new-instance v6, Ll/۠᩶ۡ;

    move-wide/from16 v7, v18

    invoke-direct {v6, v2, v3, v7, v8}, Ll/۠᩶ۡ;-><init>(DD)V

    move-wide/from16 v2, v16

    .line 63
    invoke-static {v1, v2, v3}, Ll/ܺ᩹ۡ;->֫(Ll/۠᩶ۡ;D)Ll/۠᩶ۡ;

    move-result-object v1

    .line 64
    invoke-static {v6, v2, v3}, Ll/ܺ᩹ۡ;->֫(Ll/۠᩶ۡ;D)Ll/۠᩶ۡ;

    move-result-object v6

    .line 66
    iget-wide v9, v1, Ll/۠᩶ۡ;->᩸:D

    iget-wide v11, v0, Ll/۠᩶ۡ;->᩸:D

    add-double/2addr v9, v11

    iput-wide v9, v1, Ll/۠᩶ۡ;->᩸:D

    .line 67
    iget-wide v9, v1, Ll/۠᩶ۡ;->᩹:D

    iget-wide v11, v0, Ll/۠᩶ۡ;->᩹:D

    add-double/2addr v9, v11

    iput-wide v9, v1, Ll/۠᩶ۡ;->᩹:D

    .line 69
    iget-wide v9, v6, Ll/۠᩶ۡ;->᩸:D

    iget-wide v11, v0, Ll/۠᩶ۡ;->᩸:D

    add-double/2addr v9, v11

    iput-wide v9, v6, Ll/۠᩶ۡ;->᩸:D

    .line 70
    iget-wide v9, v6, Ll/۠᩶ۡ;->᩹:D

    iget-wide v11, v0, Ll/۠᩶ۡ;->᩹:D

    add-double/2addr v9, v11

    iput-wide v9, v6, Ll/۠᩶ۡ;->᩹:D

    mul-float v9, p4, p5

    float-to-double v9, v9

    const-wide v11, 0x3fe921fb54442d18L    # 0.7853981633974483

    .line 73
    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    move-result-wide v13

    mul-double v7, v7, v13

    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    move-result-wide v13

    mul-double v13, v13, v4

    invoke-static {v7, v8, v13, v14}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v4

    div-double/2addr v9, v4

    .line 75
    new-instance v4, Ll/۠᩶ۡ;

    .line 76
    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    move-result-wide v7

    mul-double v7, v7, v9

    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    move-result-wide v11

    mul-double v11, v11, v9

    invoke-direct {v4, v7, v8, v11, v12}, Ll/۠᩶ۡ;-><init>(DD)V

    .line 77
    invoke-static {v4, v2, v3}, Ll/ܺ᩹ۡ;->֫(Ll/۠᩶ۡ;D)Ll/۠᩶ۡ;

    move-result-object v2

    .line 78
    iget-wide v3, v2, Ll/۠᩶ۡ;->᩸:D

    iget-wide v7, v0, Ll/۠᩶ۡ;->᩸:D

    add-double/2addr v3, v7

    iput-wide v3, v2, Ll/۠᩶ۡ;->᩸:D

    .line 79
    iget-wide v3, v2, Ll/۠᩶ۡ;->᩹:D

    iget-wide v7, v0, Ll/۠᩶ۡ;->᩹:D

    add-double/2addr v3, v7

    iput-wide v3, v2, Ll/۠᩶ۡ;->᩹:D

    move-object/from16 v3, p1

    .line 83
    invoke-virtual {v3, v2}, Ll/֡᩶ۡ;->֫(Ll/۠᩶ۡ;)Ll/᩸᩶ۡ;

    move-result-object v4

    check-cast v4, Ll/۠᩶ۡ;

    .line 85
    invoke-virtual {v3, v1}, Ll/֡᩶ۡ;->֫(Ll/۠᩶ۡ;)Ll/᩸᩶ۡ;

    move-result-object v5

    check-cast v5, Ll/۠᩶ۡ;

    .line 87
    invoke-virtual {v3, v6}, Ll/֡᩶ۡ;->֫(Ll/۠᩶ۡ;)Ll/᩸᩶ۡ;

    move-result-object v7

    check-cast v7, Ll/۠᩶ۡ;

    .line 88
    invoke-virtual {v3, v0}, Ll/֡᩶ۡ;->֫(Ll/۠᩶ۡ;)Ll/᩸᩶ۡ;

    move-result-object v0

    .line 89
    check-cast v0, Ll/۠᩶ۡ;

    .line 202
    iget-wide v8, v0, Ll/۠᩶ۡ;->᩸:D

    .line 211
    iget-wide v10, v0, Ll/۠᩶ۡ;->᩹:D

    .line 93
    iget-wide v12, v4, Ll/۠᩶ۡ;->᩸:D

    sub-double v14, v12, v8

    .line 94
    iget-wide v3, v4, Ll/۠᩶ۡ;->᩹:D

    sub-double v16, v3, v10

    move-wide/from16 p1, v14

    .line 95
    iget-wide v14, v5, Ll/۠᩶ۡ;->᩸:D

    move-wide/from16 v18, v3

    sub-double v3, v14, v8

    move-wide/from16 p3, v3

    .line 96
    iget-wide v3, v5, Ll/۠᩶ۡ;->᩹:D

    move-wide/from16 v20, v12

    sub-double v12, v3, v10

    move-wide/from16 p5, v12

    .line 97
    iget-wide v12, v7, Ll/۠᩶ۡ;->᩸:D

    sub-double v8, v12, v8

    move-wide/from16 p7, v8

    .line 98
    iget-wide v7, v7, Ll/۠᩶ۡ;->᩹:D

    sub-double v9, v7, v10

    move-wide/from16 p9, v9

    .line 137
    iget-wide v9, v1, Ll/۠᩶ۡ;->᩸:D

    move-wide/from16 v22, v7

    iget-wide v7, v2, Ll/۠᩶ۡ;->᩸:D

    sub-double/2addr v9, v7

    .line 138
    iget-wide v0, v1, Ll/۠᩶ۡ;->᩹:D

    move-wide/from16 v24, v12

    iget-wide v11, v2, Ll/۠᩶ۡ;->᩹:D

    sub-double/2addr v0, v11

    move-wide/from16 v26, v3

    .line 140
    iget-wide v2, v6, Ll/۠᩶ۡ;->᩸:D

    sub-double/2addr v2, v7

    .line 141
    iget-wide v4, v6, Ll/۠᩶ۡ;->᩹:D

    sub-double/2addr v4, v11

    mul-double v4, v4, v9

    mul-double v0, v0, v2

    sub-double/2addr v4, v0

    sub-double v14, v14, v20

    sub-double v0, v26, v18

    sub-double v12, v24, v20

    sub-double v7, v22, v18

    mul-double v7, v7, v14

    mul-double v0, v0, v12

    sub-double/2addr v7, v0

    mul-double v7, v7, v4

    const-wide/16 v0, 0x0

    cmpg-double v2, v7, v0

    if-gez v2, :cond_5

    const/4 v0, 0x1

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    :goto_2
    move-object/from16 v1, p0

    .line 101
    iput-boolean v0, v1, Ll/ܺ᩹ۡ;->֫:Z

    mul-double v14, p1, p1

    mul-double v2, p1, v16

    mul-double v4, v16, v16

    mul-double v6, p3, p3

    mul-double v8, p3, p5

    mul-double v12, p5, p5

    mul-double v10, p7, p7

    mul-double v24, p7, p9

    mul-double v26, p9, p9

    mul-double v16, v4, v8

    mul-double v16, v16, v10

    mul-double v18, v2, v12

    mul-double v20, v18, v10

    sub-double v16, v16, v20

    mul-double v28, v4, v6

    mul-double v20, v28, v24

    sub-double v16, v16, v20

    mul-double v30, v14, v12

    mul-double v20, v30, v24

    add-double v20, v20, v16

    mul-double v32, v2, v6

    mul-double v16, v32, v26

    add-double v16, v16, v20

    mul-double v34, v14, v8

    mul-double v20, v34, v26

    sub-double v0, v16, v20

    neg-double v0, v0

    const-wide/16 v16, 0x0

    cmpl-double v20, v0, v16

    if-nez v20, :cond_6

    move-object/from16 v2, p0

    goto/16 :goto_3

    :cond_6
    move-wide/from16 p1, v6

    neg-double v6, v4

    mul-double v6, v6, v8

    add-double v6, v6, v18

    mul-double v16, v4, v24

    add-double v16, v16, v6

    mul-double v6, v12, v24

    sub-double v16, v16, v6

    mul-double v6, v2, v26

    sub-double v20, v16, v6

    move-wide/from16 v16, v8

    move-wide/from16 v18, v26

    move-wide/from16 v22, v0

    .line 172
    invoke-static/range {v16 .. v23}, Ll/ۘ᩺ۘ;->֫(DDDD)D

    move-result-wide v6

    sub-double v28, v28, v30

    mul-double v4, v4, v10

    sub-double v28, v28, v4

    mul-double v12, v12, v10

    add-double v12, v12, v28

    mul-double v4, v14, v26

    add-double/2addr v4, v12

    mul-double v26, v26, p1

    sub-double v4, v4, v26

    div-double/2addr v4, v0

    sub-double v32, v32, v34

    mul-double v2, v2, v10

    sub-double v32, v32, v2

    mul-double v8, v8, v10

    add-double v8, v8, v32

    mul-double v14, v14, v24

    add-double/2addr v14, v8

    mul-double v2, p1, v24

    sub-double/2addr v14, v2

    neg-double v0, v0

    div-double/2addr v14, v0

    sub-double v0, v6, v14

    const-wide/16 v2, 0x0

    cmpl-double v8, v0, v2

    if-nez v8, :cond_7

    move-wide/from16 v2, p3

    move-wide/from16 v8, p5

    .line 186
    invoke-static {v2, v3, v8, v9}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v0

    double-to-float v0, v0

    move-object/from16 v2, p0

    iput v0, v2, Ll/ܺ᩹ۡ;->ܽ:F

    .line 187
    iput v0, v2, Ll/ܺ᩹ۡ;->ۧ:F

    const/4 v0, 0x0

    .line 188
    iput v0, v2, Ll/ܺ᩹ۡ;->ᩳ:F

    return-void

    :cond_7
    move-object/from16 v2, p0

    div-double v0, v4, v0

    .line 192
    invoke-static {v0, v1}, Ljava/lang/Math;->atan(D)D

    move-result-wide v0

    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    div-double v10, v0, v8

    .line 194
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v12

    const-wide/high16 v16, 0x3ff0000000000000L    # 1.0

    const-wide/16 v18, 0x0

    cmpl-double v3, v12, v18

    if-nez v3, :cond_8

    div-double v0, v16, v14

    .line 195
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    iput v0, v2, Ll/ܺ᩹ۡ;->ܽ:F

    div-double v16, v16, v6

    .line 196
    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    iput v0, v2, Ll/ܺ᩹ۡ;->ۧ:F

    const/4 v0, 0x0

    .line 197
    iput v0, v2, Ll/ܺ᩹ۡ;->ᩳ:F

    return-void

    :cond_8
    add-double/2addr v6, v14

    .line 202
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    div-double/2addr v4, v0

    add-double/2addr v4, v6

    div-double/2addr v4, v8

    sub-double/2addr v6, v4

    const-wide/16 v0, 0x0

    cmpl-double v3, v4, v0

    if-eqz v3, :cond_a

    cmpl-double v3, v6, v0

    if-nez v3, :cond_9

    goto :goto_3

    :cond_9
    div-double v0, v16, v4

    .line 208
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    iput v0, v2, Ll/ܺ᩹ۡ;->ܽ:F

    div-double v16, v16, v6

    .line 209
    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    iput v0, v2, Ll/ܺ᩹ۡ;->ۧ:F

    const-wide v0, 0x3ff921fb54442d18L    # 1.5707963267948966

    add-double/2addr v10, v0

    .line 211
    invoke-static {v10, v11}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v0

    double-to-float v0, v0

    iput v0, v2, Ll/ܺ᩹ۡ;->ᩳ:F

    return-void

    :cond_a
    :goto_3
    const-string v0, "EllipseSolver"

    .line 113
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    .line 108
    sget-object v1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v3, "Early return in the ellipse transformation computation!"

    invoke-virtual {v0, v1, v3}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    goto :goto_5

    :cond_b
    :goto_4
    move-object v2, v0

    :goto_5
    return-void
.end method

.method public static ֫(Ll/۠᩶ۡ;D)Ll/۠᩶ۡ;
    .locals 11

    .line 272
    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    move-result-wide v0

    .line 273
    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    move-result-wide p1

    .line 274
    new-instance v2, Ll/۠᩶ۡ;

    iget-wide v3, p0, Ll/۠᩶ۡ;->᩸:D

    mul-double v5, v3, v0

    iget-wide v7, p0, Ll/۠᩶ۡ;->᩹:D

    mul-double v9, v7, p1

    sub-double/2addr v5, v9

    mul-double v3, v3, p1

    mul-double v7, v7, v0

    add-double/2addr v7, v3

    invoke-direct {v2, v5, v6, v7, v8}, Ll/۠᩶ۡ;-><init>(DD)V

    return-object v2
.end method


# virtual methods
.method public final ֫()Z
    .locals 1

    .line 261
    iget-boolean v0, p0, Ll/ܺ᩹ۡ;->֫:Z

    return v0
.end method

.method public final ۧ()F
    .locals 1

    .line 249
    iget v0, p0, Ll/ܺ᩹ۡ;->ۧ:F

    return v0
.end method

.method public final ܽ()F
    .locals 1

    .line 253
    iget v0, p0, Ll/ܺ᩹ۡ;->ܽ:F

    return v0
.end method

.method public final ᩳ()F
    .locals 1

    .line 257
    iget v0, p0, Ll/ܺ᩹ۡ;->ᩳ:F

    return v0
.end method
