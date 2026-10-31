.class public final Ll/ܺ᩶ۢ;
.super Ljava/lang/Object;
.source "G1TQ"


# instance fields
.field public final ֫:[F

.field public final ۜ:Landroid/graphics/Typeface;

.field public final ۧ:I

.field public final ܳ:Ll/֫ۖܽ;

.field public final ܽ:I

.field public final ܿ:F

.field public final ᩳ:I

.field public final ᩻:F


# direct methods
.method public constructor <init>(FLandroid/graphics/Typeface;)V
    .locals 4

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Ll/֫ۖܽ;

    invoke-direct {v0}, Ll/֫ۖܽ;-><init>()V

    iput-object v0, p0, Ll/ܺ᩶ۢ;->ܳ:Ll/֫ۖܽ;

    const/16 v1, 0x7f

    new-array v1, v1, [F

    .line 50
    iput-object v1, p0, Ll/ܺ᩶ۢ;->֫:[F

    .line 53
    iput p1, p0, Ll/ܺ᩶ۢ;->᩻:F

    .line 54
    iput-object p2, p0, Ll/ܺ᩶ۢ;->ۜ:Landroid/graphics/Typeface;

    .line 56
    invoke-virtual {v0, p2}, Ll/֫ۖܽ;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    const/4 p2, 0x1

    .line 57
    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 58
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 60
    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontSpacing()F

    move-result p1

    float-to-double v1, p1

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int p1, v1

    iput p1, p0, Ll/ܺ᩶ۢ;->ܽ:I

    .line 61
    invoke-virtual {v0}, Landroid/graphics/Paint;->ascent()F

    move-result v1

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int v1, v1

    iput v1, p0, Ll/ܺ᩶ۢ;->ۧ:I

    add-int/2addr p1, v1

    .line 62
    iput p1, p0, Ll/ܺ᩶ۢ;->ᩳ:I

    const-string p1, "X"

    .line 63
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result p1

    iput p1, p0, Ll/ܺ᩶ۢ;->ܿ:F

    .line 65
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 66
    :goto_0
    iget-object v2, p0, Ll/ܺ᩶ۢ;->֫:[F

    array-length v2, v2

    if-ge v1, v2, :cond_0

    int-to-char v2, v1

    .line 67
    invoke-virtual {p1, v0, v2}, Ljava/lang/StringBuilder;->setCharAt(IC)V

    .line 68
    iget-object v2, p0, Ll/ܺ᩶ۢ;->֫:[F

    iget-object v3, p0, Ll/ܺ᩶ۢ;->ܳ:Ll/֫ۖܽ;

    invoke-virtual {v3, p1, v0, p2}, Landroid/graphics/Paint;->measureText(Ljava/lang/CharSequence;II)F

    move-result v3

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ֫(Landroid/graphics/Canvas;[C[IFIIIIFIIIJZ)V
    .locals 26

    move-object/from16 v0, p0

    move/from16 v7, p10

    move/from16 v8, p11

    move/from16 v9, p12

    .line 175
    invoke-static/range {p13 .. p14}, Ll/᩻᩶ۢ;->ۧ(J)I

    move-result v1

    const-wide/16 v2, 0x7ff

    and-long v2, p13, v2

    long-to-int v10, v2

    .line 177
    invoke-static/range {p13 .. p14}, Ll/᩻᩶ۢ;->֫(J)I

    move-result v2

    and-int/lit8 v3, v10, 0x9

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    const/4 v11, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    const/4 v11, 0x0

    :goto_0
    and-int/lit8 v3, v10, 0x4

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    const/4 v12, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    const/4 v12, 0x0

    :goto_1
    and-int/lit8 v3, v10, 0x2

    if-eqz v3, :cond_2

    const/4 v3, 0x1

    const/4 v13, 0x1

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    const/4 v13, 0x0

    :goto_2
    and-int/lit8 v3, v10, 0x40

    if-eqz v3, :cond_3

    const/4 v3, 0x1

    const/4 v14, 0x1

    goto :goto_3

    :cond_3
    const/4 v3, 0x0

    const/4 v14, 0x0

    :goto_3
    and-int/lit16 v3, v10, 0x100

    if-eqz v3, :cond_4

    const/4 v3, 0x1

    const/4 v15, 0x1

    goto :goto_4

    :cond_4
    const/4 v3, 0x0

    const/4 v15, 0x0

    :goto_4
    const/high16 v3, -0x1000000

    and-int v4, v1, v3

    const/16 v5, 0x8

    if-eq v4, v3, :cond_6

    if-eqz v11, :cond_5

    if-ltz v1, :cond_5

    if-ge v1, v5, :cond_5

    add-int/lit8 v1, v1, 0x8

    .line 187
    :cond_5
    aget v1, p3, v1

    :cond_6
    and-int v4, v2, v3

    if-eq v4, v3, :cond_7

    .line 191
    aget v2, p3, v2

    :cond_7
    and-int/lit8 v3, v10, 0x10

    if-eqz v3, :cond_8

    const/4 v3, 0x1

    goto :goto_5

    :cond_8
    const/4 v3, 0x0

    :goto_5
    xor-int v3, p15, v3

    if-eqz v3, :cond_9

    move v6, v2

    goto :goto_6

    :cond_9
    move v6, v1

    move v1, v2

    :goto_6
    move/from16 v2, p5

    int-to-float v2, v2

    .line 202
    iget v3, v0, Ll/ܺ᩶ۢ;->ܿ:F

    mul-float v2, v2, v3

    const/high16 v16, -0x1000000

    move/from16 v4, p6

    int-to-float v4, v4

    mul-float v5, v4, v3

    add-float/2addr v5, v2

    div-float v3, p9, v3

    sub-float v17, v3, v4

    move/from16 p13, v6

    .line 207
    invoke-static/range {v17 .. v17}, Ljava/lang/Math;->abs(F)F

    move-result v6

    move/from16 p14, v13

    move/from16 v17, v14

    float-to-double v13, v6

    const-wide v18, 0x3f847ae147ae147bL    # 0.01

    const/high16 v6, 0x3f800000    # 1.0f

    cmpl-double v20, v13, v18

    if-lez v20, :cond_a

    .line 208
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    div-float v13, v4, v3

    move-object/from16 v14, p1

    .line 209
    invoke-virtual {v14, v13, v6}, Landroid/graphics/Canvas;->scale(FF)V

    div-float/2addr v3, v4

    mul-float v2, v2, v3

    mul-float v5, v5, v3

    const/4 v3, 0x1

    move/from16 v22, v2

    move v6, v5

    const/4 v13, 0x1

    goto :goto_7

    :cond_a
    move-object/from16 v14, p1

    const/4 v3, 0x0

    move/from16 v22, v2

    move v6, v5

    const/4 v13, 0x0

    :goto_7
    const/16 v2, 0x101

    .line 215
    aget v2, p3, v2

    const/high16 v18, 0x3f800000    # 1.0f

    iget v5, v0, Ll/ܺ᩶ۢ;->ۧ:I

    const/16 v19, 0x101

    iget v4, v0, Ll/ܺ᩶ۢ;->ᩳ:I

    iget-object v3, v0, Ll/ܺ᩶ۢ;->ܳ:Ll/֫ۖܽ;

    if-eq v1, v2, :cond_b

    .line 217
    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v1, v4

    sub-float v1, p4, v1

    int-to-float v2, v5

    add-float v20, v1, v2

    move-object/from16 v1, p1

    move/from16 v2, v22

    move-object/from16 p5, v3

    move/from16 v3, v20

    move v0, v4

    move v4, v6

    move/from16 v20, v5

    move/from16 v5, p4

    move/from16 v14, p13

    move/from16 p6, v13

    move v13, v6

    move-object/from16 v6, p5

    .line 218
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_8

    :cond_b
    move/from16 v14, p13

    move-object/from16 p5, v3

    move v0, v4

    move/from16 v20, v5

    move/from16 p6, v13

    move v13, v6

    :goto_8
    if-eqz v8, :cond_c

    move-object/from16 v6, p5

    .line 222
    invoke-virtual {v6, v8}, Landroid/graphics/Paint;->setColor(I)V

    sub-int v4, v0, v20

    int-to-float v1, v4

    sub-float v3, p4, v1

    add-float v4, v13, v18

    move-object/from16 v1, p1

    move/from16 v2, v22

    move/from16 v5, p4

    .line 224
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_c
    if-eqz v7, :cond_f

    move-object/from16 v6, p5

    .line 230
    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setColor(I)V

    sub-int v4, v0, v20

    int-to-float v1, v4

    const-wide/high16 v2, 0x4010000000000000L    # 4.0

    const/4 v4, 0x1

    if-ne v9, v4, :cond_d

    float-to-double v4, v1

    div-double/2addr v4, v2

    double-to-float v1, v4

    move/from16 p5, v0

    goto :goto_9

    :cond_d
    const/4 v4, 0x2

    if-ne v9, v4, :cond_e

    float-to-double v4, v13

    sub-float v9, v13, v22

    const/high16 v13, 0x40400000    # 3.0f

    mul-float v9, v9, v13

    move/from16 p5, v0

    move/from16 v18, v1

    float-to-double v0, v9

    div-double/2addr v0, v2

    sub-double/2addr v4, v0

    double-to-float v0, v4

    move v4, v0

    move/from16 v1, v18

    goto :goto_a

    :cond_e
    move/from16 p5, v0

    move/from16 v18, v1

    :goto_9
    move v4, v13

    :goto_a
    sub-float v3, p4, v1

    move-object/from16 v1, p1

    move/from16 v2, v22

    move/from16 v5, p4

    move-object v0, v6

    .line 235
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_b

    :cond_f
    move/from16 v25, v0

    move-object/from16 v0, p5

    move/from16 p5, v25

    :goto_b
    and-int/lit8 v1, v10, 0x20

    if-nez v1, :cond_15

    if-eqz v7, :cond_10

    const/16 v1, 0x100

    .line 242
    aget v6, p3, v1

    goto :goto_d

    :cond_10
    if-eqz v8, :cond_11

    .line 244
    aget v6, p3, v19

    goto :goto_d

    :cond_11
    if-eqz v15, :cond_13

    shr-int/lit8 v1, v14, 0x10

    const/16 v2, 0xff

    and-int/2addr v1, v2

    shr-int/lit8 v3, v14, 0x8

    and-int/2addr v3, v2

    and-int/lit16 v4, v14, 0xff

    .line 251
    sget-boolean v5, Ll/ۧ᩹ۢ;->ܽ:Z

    if-eqz v5, :cond_12

    mul-int/lit8 v1, v1, 0x2

    .line 252
    div-int/lit8 v1, v1, 0x3

    mul-int/lit8 v3, v3, 0x2

    .line 253
    div-int/lit8 v3, v3, 0x3

    mul-int/lit8 v4, v4, 0x2

    .line 254
    div-int/lit8 v4, v4, 0x3

    goto :goto_c

    :cond_12
    mul-int/lit8 v1, v1, 0x4

    .line 256
    div-int/lit8 v1, v1, 0x3

    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    mul-int/lit8 v3, v3, 0x4

    .line 257
    div-int/lit8 v3, v3, 0x3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    mul-int/lit8 v4, v4, 0x4

    .line 258
    div-int/lit8 v4, v4, 0x3

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    :goto_c
    shl-int/lit8 v1, v1, 0x10

    add-int v1, v1, v16

    shl-int/lit8 v2, v3, 0x8

    add-int/2addr v1, v2

    add-int v6, v1, v4

    goto :goto_d

    :cond_13
    move v6, v14

    .line 263
    :goto_d
    invoke-virtual {v0, v11}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 264
    invoke-virtual {v0, v12}, Landroid/graphics/Paint;->setUnderlineText(Z)V

    if-eqz p14, :cond_14

    const v1, -0x414ccccd    # -0.35f

    goto :goto_e

    :cond_14
    const/4 v1, 0x0

    .line 265
    :goto_e
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSkewX(F)V

    move/from16 v3, v17

    .line 266
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrikeThruText(Z)V

    .line 267
    invoke-virtual {v0, v6}, Landroid/graphics/Paint;->setColor(I)V

    move/from16 v1, p5

    int-to-float v1, v1

    sub-float v23, p4, v1

    move-object/from16 v18, p1

    move-object/from16 v19, p2

    move/from16 v20, p7

    move/from16 v21, p8

    move-object/from16 v24, v0

    .line 270
    invoke-virtual/range {v18 .. v24}, Landroid/graphics/Canvas;->drawText([CIIFFLandroid/graphics/Paint;)V

    :cond_15
    if-eqz p6, :cond_16

    .line 273
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    :cond_16
    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܿ᩹ۢ;Landroid/graphics/Canvas;IIIII)V
    .locals 47

    move-object/from16 v15, p0

    move-object/from16 v13, p1

    move/from16 v14, p4

    move/from16 v12, p5

    .line 77
    invoke-virtual/range {p1 .. p1}, Ll/ܿ᩹ۢ;->ۢ()Z

    move-result v16

    .line 78
    iget v0, v13, Ll/ܿ᩹ۢ;->᩹:I

    add-int v11, p3, v0

    .line 79
    iget v10, v13, Ll/ܿ᩹ۢ;->ۜ:I

    .line 80
    invoke-virtual/range {p1 .. p1}, Ll/ܿ᩹ۢ;->ۧ()I

    move-result v17

    .line 81
    invoke-virtual/range {p1 .. p1}, Ll/ܿ᩹ۢ;->ܽ()I

    move-result v9

    .line 82
    invoke-virtual/range {p1 .. p1}, Ll/ܿ᩹ۢ;->ۡ()Z

    move-result v18

    .line 83
    invoke-virtual/range {p1 .. p1}, Ll/ܿ᩹ۢ;->ܿ()Ll/֫᩹ۢ;

    move-result-object v8

    .line 84
    iget-object v0, v13, Ll/ܿ᩹ۢ;->᩻:Ll/ܽ᩹ۢ;

    iget-object v7, v0, Ll/ܽ᩹ۢ;->֫:[I

    iget-object v6, v0, Ll/ܽ᩹ۢ;->֫:[I

    .line 85
    invoke-virtual/range {p1 .. p1}, Ll/ܿ᩹ۢ;->ᩳ()I

    move-result v19

    if-eqz v16, :cond_0

    const/16 v0, 0x100

    .line 88
    aget v0, v7, v0

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC:Landroid/graphics/PorterDuff$Mode;

    move-object/from16 v5, p2

    invoke-virtual {v5, v0, v1}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    goto :goto_0

    :cond_0
    move-object/from16 v5, p2

    .line 90
    :goto_0
    iget v0, v15, Ll/ܺ᩶ۢ;->ᩳ:I

    int-to-float v0, v0

    move/from16 v4, p3

    :goto_1
    if-ge v4, v11, :cond_17

    .line 92
    iget v1, v15, Ll/ܺ᩶ۢ;->ܽ:I

    int-to-float v1, v1

    add-float v20, v0, v1

    if-ne v4, v9, :cond_1

    if-eqz v18, :cond_1

    move/from16 v3, v17

    goto :goto_2

    :cond_1
    const/4 v0, -0x1

    const/4 v3, -0x1

    :goto_2
    if-lt v4, v14, :cond_4

    if-gt v4, v12, :cond_4

    if-ne v4, v14, :cond_2

    move/from16 v0, p6

    goto :goto_3

    :cond_2
    const/4 v0, -0x1

    :goto_3
    if-ne v4, v12, :cond_3

    move/from16 v1, p7

    goto :goto_4

    .line 99
    :cond_3
    iget v1, v13, Ll/ܿ᩹ۢ;->ۜ:I

    :goto_4
    move v2, v0

    goto :goto_5

    :cond_4
    const/4 v0, -0x1

    const/4 v1, -0x1

    const/4 v2, -0x1

    .line 102
    :goto_5
    invoke-virtual {v8, v4}, Ll/֫᩹ۢ;->ۧ(I)I

    move-result v0

    invoke-virtual {v8, v0}, Ll/֫᩹ۢ;->֫(I)Ll/ᩴ᩹ۢ;

    move-result-object v0

    .line 103
    iget-object v13, v0, Ll/ᩴ᩹ۢ;->ܳ:[C

    .line 104
    invoke-virtual {v0}, Ll/ᩴ᩹ۢ;->֫()I

    move-result v14

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, -0x1

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    move/from16 v23, v4

    move/from16 p3, v14

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    :goto_6
    const/16 v24, 0x103

    const/16 v25, 0x102

    if-ge v14, v10, :cond_14

    move-object/from16 v26, v8

    .line 116
    aget-char v8, v13, v12

    .line 117
    invoke-static {v8}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v31

    if-eqz v31, :cond_5

    const/16 v32, 0x2

    move/from16 v33, v11

    const/4 v11, 0x2

    goto :goto_7

    :cond_5
    const/16 v32, 0x1

    move/from16 v33, v11

    const/4 v11, 0x1

    :goto_7
    if-eqz v31, :cond_6

    add-int/lit8 v31, v12, 0x1

    move/from16 v32, v9

    .line 119
    aget-char v9, v13, v31

    invoke-static {v8, v9}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v8

    goto :goto_8

    :cond_6
    move/from16 v32, v9

    .line 120
    :goto_8
    invoke-static {v8}, Ll/ۜ᩶ۢ;->֫(I)I

    move-result v9

    move/from16 v31, v10

    if-eq v3, v14, :cond_8

    const/4 v10, 0x2

    if-ne v9, v10, :cond_7

    add-int/lit8 v10, v14, 0x1

    if-ne v3, v10, :cond_7

    goto :goto_9

    :cond_7
    const/4 v10, 0x0

    goto :goto_a

    :cond_8
    :goto_9
    const/4 v10, 0x1

    :goto_a
    if-lt v14, v2, :cond_9

    if-gt v14, v1, :cond_9

    const/16 v34, 0x1

    move/from16 v35, v3

    const/4 v3, 0x1

    goto :goto_b

    :cond_9
    const/16 v34, 0x0

    move/from16 v35, v3

    const/4 v3, 0x0

    .line 123
    :goto_b
    invoke-virtual {v0, v14}, Ll/ᩴ᩹ۢ;->ۧ(I)J

    move-result-wide v36

    move-object/from16 v34, v0

    .line 129
    iget-object v0, v15, Ll/ܺ᩶ۢ;->֫:[F

    move/from16 v38, v1

    array-length v1, v0

    if-ge v8, v1, :cond_a

    aget v0, v0, v8

    goto :goto_c

    :cond_a
    iget-object v0, v15, Ll/ܺ᩶ۢ;->ܳ:Ll/֫ۖܽ;

    invoke-virtual {v0, v13, v12, v11}, Landroid/graphics/Paint;->measureText([CII)F

    move-result v0

    :goto_c
    move/from16 v39, v0

    .line 131
    iget v0, v15, Ll/ܺ᩶ۢ;->ܿ:F

    div-float v0, v39, v0

    int-to-float v1, v9

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v40, 0x3f847ae147ae147bL    # 0.01

    cmpl-double v8, v0, v40

    if-lez v8, :cond_b

    const/4 v0, 0x1

    const/16 v40, 0x1

    goto :goto_d

    :cond_b
    const/4 v0, 0x0

    const/16 v40, 0x0

    :goto_d
    cmp-long v0, v36, v21

    if-nez v0, :cond_d

    if-ne v10, v4, :cond_d

    if-ne v3, v5, :cond_d

    if-nez v40, :cond_d

    if-eqz v30, :cond_c

    goto :goto_e

    :cond_c
    move/from16 v46, p3

    move/from16 v41, v2

    move-object/from16 v43, v6

    move-object/from16 v44, v7

    move/from16 v25, v11

    move-object/from16 v45, v13

    move/from16 v24, v14

    move/from16 v0, v27

    move/from16 v40, v30

    move/from16 v30, v32

    move/from16 v32, v33

    move/from16 v42, v35

    move/from16 v27, v9

    move/from16 v33, v12

    goto/16 :goto_12

    :cond_d
    :goto_e
    if-nez v14, :cond_e

    move/from16 v46, p3

    move/from16 v41, v2

    move-object/from16 v43, v6

    move-object/from16 v44, v7

    move/from16 v27, v9

    move/from16 v28, v10

    move/from16 v25, v11

    move-object/from16 v45, v13

    move/from16 v24, v14

    move/from16 v30, v32

    move/from16 v32, v33

    move/from16 v42, v35

    move/from16 v35, v3

    move/from16 v33, v12

    goto :goto_11

    :cond_e
    sub-int v8, v14, v27

    sub-int v30, v12, v28

    if-eqz v4, :cond_f

    .line 139
    aget v0, v6, v25

    move/from16 v25, v0

    goto :goto_f

    :cond_f
    const/4 v0, 0x0

    const/16 v25, 0x0

    :goto_f
    if-eqz v5, :cond_10

    .line 140
    aget v0, v6, v24

    move/from16 v24, v0

    goto :goto_10

    :cond_10
    const/4 v0, 0x0

    const/16 v24, 0x0

    :goto_10
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v41, v2

    move-object v2, v13

    move/from16 v42, v35

    move/from16 v35, v3

    move-object v3, v7

    move/from16 v4, v20

    move/from16 v5, v27

    move-object/from16 v43, v6

    move v6, v8

    move-object/from16 v44, v7

    move/from16 v7, v28

    move/from16 v8, v30

    move/from16 v27, v9

    move/from16 v30, v32

    move/from16 v9, v29

    move/from16 v28, v10

    move/from16 v10, v25

    move/from16 v25, v11

    move/from16 v32, v33

    move/from16 v11, v24

    move/from16 v33, v12

    move/from16 v12, v19

    move/from16 v46, p3

    move-object/from16 v45, v13

    move/from16 v24, v14

    move-wide/from16 v13, v21

    move/from16 v15, v16

    .line 141
    invoke-direct/range {v0 .. v15}, Ll/ܺ᩶ۢ;->֫(Landroid/graphics/Canvas;[C[IFIIIIFIIIJZ)V

    :goto_11
    const/16 v29, 0x0

    move/from16 v0, v24

    move/from16 v4, v28

    move/from16 v28, v33

    move/from16 v5, v35

    move-wide/from16 v21, v36

    :goto_12
    add-float v29, v29, v39

    add-int v14, v24, v27

    add-int v12, v33, v25

    move/from16 v1, v46

    :goto_13
    if-ge v12, v1, :cond_13

    .line 466
    aget-char v2, v45, v12

    .line 467
    invoke-static {v2}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v3

    if-eqz v3, :cond_11

    add-int/lit8 v3, v12, 0x1

    aget-char v3, v45, v3

    invoke-static {v2, v3}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v2

    :cond_11
    invoke-static {v2}, Ll/ۜ᩶ۢ;->֫(I)I

    move-result v2

    if-gtz v2, :cond_13

    .line 159
    aget-char v2, v45, v12

    invoke-static {v2}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v2

    if-eqz v2, :cond_12

    const/4 v2, 0x2

    goto :goto_14

    :cond_12
    const/4 v2, 0x1

    :goto_14
    add-int/2addr v12, v2

    goto :goto_13

    :cond_13
    move-object/from16 v15, p0

    move/from16 v27, v0

    move/from16 p3, v1

    move-object/from16 v8, v26

    move/from16 v9, v30

    move/from16 v10, v31

    move/from16 v11, v32

    move-object/from16 v0, v34

    move/from16 v1, v38

    move/from16 v30, v40

    move/from16 v2, v41

    move/from16 v3, v42

    move-object/from16 v6, v43

    move-object/from16 v7, v44

    move-object/from16 v13, v45

    goto/16 :goto_6

    :cond_14
    move-object/from16 v43, v6

    move-object/from16 v44, v7

    move-object/from16 v26, v8

    move/from16 v30, v9

    move/from16 v31, v10

    move/from16 v32, v11

    move/from16 v33, v12

    move-object/from16 v45, v13

    sub-int v6, v31, v27

    sub-int v8, v33, v28

    if-eqz v4, :cond_15

    .line 165
    aget v0, v43, v25

    move v10, v0

    goto :goto_15

    :cond_15
    const/4 v0, 0x0

    const/4 v10, 0x0

    :goto_15
    if-eqz v5, :cond_16

    .line 166
    aget v0, v43, v24

    move v11, v0

    goto :goto_16

    :cond_16
    const/4 v0, 0x0

    const/4 v11, 0x0

    :goto_16
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, v45

    move-object/from16 v3, v44

    move/from16 v4, v20

    move/from16 v5, v27

    move/from16 v7, v28

    move/from16 v9, v29

    move/from16 v12, v19

    move-wide/from16 v13, v21

    move/from16 v15, v16

    .line 167
    invoke-direct/range {v0 .. v15}, Ll/ܺ᩶ۢ;->֫(Landroid/graphics/Canvas;[C[IFIIIIFIIIJZ)V

    add-int/lit8 v4, v23, 0x1

    move-object/from16 v15, p0

    move-object/from16 v13, p1

    move-object/from16 v5, p2

    move/from16 v14, p4

    move/from16 v12, p5

    move/from16 v0, v20

    move-object/from16 v8, v26

    move/from16 v9, v30

    move/from16 v10, v31

    move/from16 v11, v32

    move-object/from16 v6, v43

    move-object/from16 v7, v44

    goto/16 :goto_1

    :cond_17
    return-void
.end method
