.class public final Ll/ۗܶ;
.super Ljava/lang/Object;
.source "B1CI"


# instance fields
.field public ֫:[F

.field public ۧ:F

.field public ܳ:Landroid/graphics/ColorMatrix;

.field public ܽ:Landroid/graphics/ColorMatrix;

.field public ܿ:F

.field public ᩳ:F

.field public ᩻:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x14

    new-array v0, v0, [F

    .line 87
    iput-object v0, p0, Ll/ۗܶ;->֫:[F

    .line 88
    new-instance v0, Landroid/graphics/ColorMatrix;

    invoke-direct {v0}, Landroid/graphics/ColorMatrix;-><init>()V

    iput-object v0, p0, Ll/ۗܶ;->ܽ:Landroid/graphics/ColorMatrix;

    .line 89
    new-instance v0, Landroid/graphics/ColorMatrix;

    invoke-direct {v0}, Landroid/graphics/ColorMatrix;-><init>()V

    iput-object v0, p0, Ll/ۗܶ;->ܳ:Landroid/graphics/ColorMatrix;

    const/high16 v0, 0x3f800000    # 1.0f

    .line 90
    iput v0, p0, Ll/ۗܶ;->ۧ:F

    .line 91
    iput v0, p0, Ll/ۗܶ;->ܿ:F

    .line 92
    iput v0, p0, Ll/ۗܶ;->ᩳ:F

    .line 93
    iput v0, p0, Ll/ۗܶ;->᩻:F

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/widget/ImageView;)V
    .locals 30

    move-object/from16 v0, p0

    .line 251
    iget-object v1, v0, Ll/ۗܶ;->ܽ:Landroid/graphics/ColorMatrix;

    invoke-virtual {v1}, Landroid/graphics/ColorMatrix;->reset()V

    .line 253
    iget v2, v0, Ll/ۗܶ;->ܿ:F

    const/16 v6, 0xd

    const/16 v7, 0xc

    const/16 v8, 0xb

    const/16 v9, 0xa

    const/16 v10, 0x9

    const/16 v11, 0x8

    const/4 v12, 0x7

    const/4 v13, 0x6

    const/4 v14, 0x5

    const/4 v15, 0x4

    const/16 v16, 0x13

    const/4 v3, 0x0

    const/16 v17, 0x3

    const/16 v18, 0x2

    const/16 v19, 0x12

    iget-object v4, v0, Ll/ۗܶ;->֫:[F

    const/16 v21, 0x1

    const/16 v22, 0x0

    const/16 v23, 0x11

    const/high16 v5, 0x3f800000    # 1.0f

    cmpl-float v25, v2, v5

    if-eqz v25, :cond_0

    sub-float v25, v5, v2

    const v26, 0x3e998c7e    # 0.2999f

    mul-float v26, v26, v25

    const v27, 0x3f1645a2    # 0.587f

    mul-float v27, v27, v25

    const v28, 0x3de978d5    # 0.114f

    mul-float v25, v25, v28

    add-float v28, v26, v2

    .line 106
    aput v28, v4, v22

    .line 107
    aput v27, v4, v21

    .line 108
    aput v25, v4, v18

    .line 109
    aput v3, v4, v17

    .line 110
    aput v3, v4, v15

    .line 112
    aput v26, v4, v14

    add-float v28, v27, v2

    .line 113
    aput v28, v4, v13

    .line 114
    aput v25, v4, v12

    .line 115
    aput v3, v4, v11

    .line 116
    aput v3, v4, v10

    .line 118
    aput v26, v4, v9

    .line 119
    aput v27, v4, v8

    add-float v25, v25, v2

    .line 120
    aput v25, v4, v7

    .line 121
    aput v3, v4, v6

    const/16 v2, 0xe

    .line 122
    aput v3, v4, v2

    const/16 v2, 0xf

    .line 124
    aput v3, v4, v2

    const/16 v2, 0x10

    .line 125
    aput v3, v4, v2

    .line 126
    aput v3, v4, v23

    .line 127
    aput v5, v4, v19

    .line 128
    aput v3, v4, v16

    .line 255
    invoke-virtual {v1, v4}, Landroid/graphics/ColorMatrix;->set([F)V

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 258
    :goto_0
    iget v7, v0, Ll/ۗܶ;->ᩳ:F

    iget-object v9, v0, Ll/ۗܶ;->ܳ:Landroid/graphics/ColorMatrix;

    cmpl-float v10, v7, v5

    if-eqz v10, :cond_1

    .line 259
    invoke-virtual {v9, v7, v7, v7, v5}, Landroid/graphics/ColorMatrix;->setScale(FFFF)V

    .line 260
    invoke-virtual {v1, v9}, Landroid/graphics/ColorMatrix;->postConcat(Landroid/graphics/ColorMatrix;)V

    const/4 v2, 0x1

    .line 263
    :cond_1
    iget v7, v0, Ll/ۗܶ;->᩻:F

    cmpl-float v5, v7, v5

    if-eqz v5, :cond_6

    cmpg-float v2, v7, v3

    if-gtz v2, :cond_2

    const v7, 0x3c23d70a    # 0.01f

    :cond_2
    const v2, 0x459c4000    # 5000.0f

    div-float/2addr v2, v7

    const/high16 v5, 0x42c80000    # 100.0f

    div-float/2addr v2, v5

    const v5, 0x42c6f10d

    const/high16 v7, 0x42840000    # 66.0f

    const/high16 v10, 0x437f0000    # 255.0f

    cmpl-float v20, v2, v7

    if-lez v20, :cond_3

    const/high16 v20, 0x42700000    # 60.0f

    const v24, 0x43211e9c

    sub-float v6, v2, v20

    const/16 v20, 0xe

    const/16 v26, 0xd

    move-object/from16 v28, v9

    float-to-double v8, v6

    const/16 v6, 0xc

    const/16 v29, 0xb

    const-wide v11, -0x403ef32580000000L    # -0.13320475816726685

    .line 144
    invoke-static {v8, v9, v11, v12}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v11

    double-to-float v11, v11

    const v12, 0x43a4d970

    mul-float v11, v11, v12

    const-wide v12, 0x3fb354f0e0000000L

    .line 145
    invoke-static {v8, v9, v12, v13}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v8

    double-to-float v8, v8

    const v9, 0x43900fa3

    mul-float v8, v8, v9

    const/16 v12, 0x9

    goto :goto_1

    :cond_3
    move-object/from16 v28, v9

    const/16 v6, 0xc

    const/16 v20, 0xe

    const v24, 0x43211e9c

    const/16 v26, 0xd

    const/16 v29, 0xb

    const/16 v12, 0x9

    float-to-double v8, v2

    .line 148
    invoke-static {v8, v9}, Ljava/lang/Math;->log(D)D

    move-result-wide v8

    double-to-float v8, v8

    mul-float v8, v8, v5

    sub-float v8, v8, v24

    const/high16 v11, 0x437f0000    # 255.0f

    :goto_1
    const v9, 0x439885bc

    cmpg-float v7, v2, v7

    if-gez v7, :cond_5

    const/high16 v7, 0x41980000    # 19.0f

    cmpl-float v7, v2, v7

    if-lez v7, :cond_4

    const/high16 v7, 0x41200000    # 10.0f

    sub-float/2addr v2, v7

    const/16 v7, 0xa

    const v13, 0x430a848a

    float-to-double v14, v2

    .line 153
    invoke-static {v14, v15}, Ljava/lang/Math;->log(D)D

    move-result-wide v14

    double-to-float v2, v14

    mul-float v2, v2, v13

    sub-float/2addr v2, v9

    goto :goto_2

    :cond_4
    const/16 v7, 0xa

    const v13, 0x430a848a

    const/4 v2, 0x0

    goto :goto_2

    :cond_5
    const/16 v7, 0xa

    const v13, 0x430a848a

    const/high16 v2, 0x437f0000    # 255.0f

    .line 160
    :goto_2
    invoke-static {v11, v3}, Ljava/lang/Math;->max(FF)F

    move-result v9

    invoke-static {v10, v9}, Ljava/lang/Math;->min(FF)F

    move-result v9

    .line 161
    invoke-static {v8, v3}, Ljava/lang/Math;->max(FF)F

    move-result v8

    invoke-static {v10, v8}, Ljava/lang/Math;->min(FF)F

    move-result v8

    .line 162
    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    move-result v2

    invoke-static {v10, v2}, Ljava/lang/Math;->min(FF)F

    move-result v2

    const/high16 v11, 0x42480000    # 50.0f

    float-to-double v14, v11

    .line 178
    invoke-static {v14, v15}, Ljava/lang/Math;->log(D)D

    move-result-wide v14

    double-to-float v11, v14

    mul-float v11, v11, v5

    sub-float v11, v11, v24

    const/high16 v5, 0x42200000    # 40.0f

    const v14, 0x439885bc

    move-object/from16 v24, v4

    float-to-double v3, v5

    .line 183
    invoke-static {v3, v4}, Ljava/lang/Math;->log(D)D

    move-result-wide v3

    double-to-float v3, v3

    mul-float v3, v3, v13

    sub-float/2addr v3, v14

    const/4 v4, 0x0

    .line 190
    invoke-static {v10, v4}, Ljava/lang/Math;->max(FF)F

    move-result v5

    invoke-static {v10, v5}, Ljava/lang/Math;->min(FF)F

    move-result v5

    .line 191
    invoke-static {v11, v4}, Ljava/lang/Math;->max(FF)F

    move-result v11

    invoke-static {v10, v11}, Ljava/lang/Math;->min(FF)F

    move-result v11

    .line 192
    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    move-result v3

    invoke-static {v10, v3}, Ljava/lang/Math;->min(FF)F

    move-result v3

    div-float/2addr v9, v5

    div-float/2addr v8, v11

    div-float/2addr v2, v3

    .line 198
    aput v9, v24, v22

    .line 199
    aput v4, v24, v21

    .line 200
    aput v4, v24, v18

    .line 201
    aput v4, v24, v17

    const/4 v3, 0x4

    .line 202
    aput v4, v24, v3

    const/4 v3, 0x5

    .line 204
    aput v4, v24, v3

    const/4 v3, 0x6

    .line 205
    aput v8, v24, v3

    const/4 v3, 0x7

    .line 206
    aput v4, v24, v3

    const/16 v3, 0x8

    .line 207
    aput v4, v24, v3

    .line 208
    aput v4, v24, v12

    .line 210
    aput v4, v24, v7

    .line 211
    aput v4, v24, v29

    .line 212
    aput v2, v24, v6

    .line 213
    aput v4, v24, v26

    .line 214
    aput v4, v24, v20

    const/16 v2, 0xf

    .line 216
    aput v4, v24, v2

    const/16 v2, 0x10

    .line 217
    aput v4, v24, v2

    .line 218
    aput v4, v24, v23

    const/high16 v2, 0x3f800000    # 1.0f

    .line 219
    aput v2, v24, v19

    .line 220
    aput v4, v24, v16

    move-object/from16 v3, v24

    move-object/from16 v4, v28

    .line 265
    invoke-virtual {v4, v3}, Landroid/graphics/ColorMatrix;->set([F)V

    .line 266
    invoke-virtual {v1, v4}, Landroid/graphics/ColorMatrix;->postConcat(Landroid/graphics/ColorMatrix;)V

    const/4 v5, 0x1

    const/4 v2, 0x1

    const/high16 v10, 0x3f800000    # 1.0f

    goto :goto_3

    :cond_6
    move-object v3, v4

    move-object v4, v9

    const/16 v6, 0xc

    const/16 v7, 0xa

    const/high16 v10, 0x3f800000    # 1.0f

    const/16 v20, 0xe

    const/16 v26, 0xd

    const/16 v29, 0xb

    const/16 v12, 0x9

    .line 269
    :goto_3
    iget v5, v0, Ll/ۗܶ;->ۧ:F

    cmpl-float v8, v5, v10

    if-eqz v8, :cond_7

    .line 225
    aput v5, v3, v22

    const/4 v2, 0x0

    .line 226
    aput v2, v3, v21

    .line 227
    aput v2, v3, v18

    .line 228
    aput v2, v3, v17

    const/4 v8, 0x4

    .line 229
    aput v2, v3, v8

    const/4 v8, 0x5

    .line 231
    aput v2, v3, v8

    const/4 v8, 0x6

    .line 232
    aput v5, v3, v8

    const/4 v8, 0x7

    .line 233
    aput v2, v3, v8

    const/16 v8, 0x8

    .line 234
    aput v2, v3, v8

    .line 235
    aput v2, v3, v12

    .line 237
    aput v2, v3, v7

    .line 238
    aput v2, v3, v29

    .line 239
    aput v5, v3, v6

    .line 240
    aput v2, v3, v26

    .line 241
    aput v2, v3, v20

    const/16 v5, 0xf

    .line 243
    aput v2, v3, v5

    const/16 v5, 0x10

    .line 244
    aput v2, v3, v5

    .line 245
    aput v2, v3, v23

    .line 246
    aput v10, v3, v19

    .line 247
    aput v2, v3, v16

    .line 271
    invoke-virtual {v4, v3}, Landroid/graphics/ColorMatrix;->set([F)V

    .line 272
    invoke-virtual {v1, v4}, Landroid/graphics/ColorMatrix;->postConcat(Landroid/graphics/ColorMatrix;)V

    goto :goto_4

    :cond_7
    move/from16 v21, v2

    :goto_4
    if-eqz v21, :cond_8

    .line 277
    new-instance v2, Landroid/graphics/ColorMatrixColorFilter;

    invoke-direct {v2, v1}, Landroid/graphics/ColorMatrixColorFilter;-><init>(Landroid/graphics/ColorMatrix;)V

    move-object/from16 v1, p1

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void

    :cond_8
    move-object/from16 v1, p1

    .line 279
    invoke-virtual/range {p1 .. p1}, Landroid/widget/ImageView;->clearColorFilter()V

    return-void
.end method
