.class public Ll/ۧ֫᩷;
.super Landroid/view/View;
.source "99K3"


# instance fields
.field public ֫֫:I

.field public ۗ:I

.field public ۙ:Landroid/graphics/drawable/Drawable;

.field public ۛ:F

.field public ۟:Z

.field public ۤ:F

.field public ۧ֫:F

.field public ۨ:Landroid/graphics/Rect;

.field public ۫:F

.field public ۬:F

.field public ܰ:I

.field public ܳ֫:Z

.field public ܽ֫:Landroid/widget/SeekBar;

.field public ܿ֫:Landroid/widget/SeekBar;

.field public ᩳ֫:F

.field public ᩶:Z

.field public ᩸:I

.field public ᩹:Ll/᩶۟ۜ;

.field public ᩺:Ll/֫ۖܽ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x0

    .line 25
    iput p2, p0, Ll/ۧ֫᩷;->ۧ֫:F

    .line 26
    iput p2, p0, Ll/ۧ֫᩷;->ᩳ֫:F

    .line 29
    new-instance p2, Ll/᩶۟ۜ;

    invoke-direct {p2}, Ll/᩶۟ۜ;-><init>()V

    iput-object p2, p0, Ll/ۧ֫᩷;->᩹:Ll/᩶۟ۜ;

    .line 30
    new-instance p2, Ll/֫ۖܽ;

    invoke-direct {p2}, Ll/֫ۖܽ;-><init>()V

    iput-object p2, p0, Ll/ۧ֫᩷;->᩺:Ll/֫ۖܽ;

    .line 31
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Ll/ۧ֫᩷;->ۨ:Landroid/graphics/Rect;

    .line 42
    invoke-direct {p0, p1}, Ll/ۧ֫᩷;->֫(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p2, 0x0

    .line 25
    iput p2, p0, Ll/ۧ֫᩷;->ۧ֫:F

    .line 26
    iput p2, p0, Ll/ۧ֫᩷;->ᩳ֫:F

    .line 29
    new-instance p2, Ll/᩶۟ۜ;

    invoke-direct {p2}, Ll/᩶۟ۜ;-><init>()V

    iput-object p2, p0, Ll/ۧ֫᩷;->᩹:Ll/᩶۟ۜ;

    .line 30
    new-instance p2, Ll/֫ۖܽ;

    invoke-direct {p2}, Ll/֫ۖܽ;-><init>()V

    iput-object p2, p0, Ll/ۧ֫᩷;->᩺:Ll/֫ۖܽ;

    .line 31
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Ll/ۧ֫᩷;->ۨ:Landroid/graphics/Rect;

    .line 47
    invoke-direct {p0, p1}, Ll/ۧ֫᩷;->֫(Landroid/content/Context;)V

    return-void
.end method

.method private ֫(Landroid/content/Context;)V
    .locals 2

    .line 52
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    .line 53
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    iput v0, p0, Ll/ۧ֫᩷;->֫֫:I

    .line 54
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    const/high16 v1, 0x41000000    # 8.0f

    mul-float v0, v0, v1

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    .line 55
    iput v0, p0, Ll/ۧ֫᩷;->ۗ:I

    .line 56
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    iget-object v1, p0, Ll/ۧ֫᩷;->᩺:Ll/֫ۖܽ;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/4 v0, 0x0

    .line 57
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 58
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 59
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 60
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f0802b2

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۧ֫᩷;->֫(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    .line 112
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v8

    .line 113
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v9

    .line 114
    div-int/lit8 v10, v8, 0x2

    .line 115
    div-int/lit8 v11, v9, 0x2

    .line 116
    iget v1, v0, Ll/ۧ֫᩷;->᩸:I

    iget-object v12, v0, Ll/ۧ֫᩷;->᩺:Ll/֫ۖܽ;

    const/4 v2, 0x2

    if-eqz v1, :cond_3

    const/4 v3, 0x1

    if-eq v1, v3, :cond_2

    if-eq v1, v2, :cond_1

    const/4 v2, 0x3

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const v1, -0x777778

    .line 140
    invoke-virtual {v7, v1}, Landroid/graphics/Canvas;->drawColor(I)V

    goto :goto_0

    :cond_1
    const/4 v1, -0x1

    .line 137
    invoke-virtual {v7, v1}, Landroid/graphics/Canvas;->drawColor(I)V

    goto :goto_0

    :cond_2
    const/high16 v1, -0x1000000

    .line 134
    invoke-virtual {v7, v1}, Landroid/graphics/Canvas;->drawColor(I)V

    :goto_0
    move-object v2, v7

    goto :goto_3

    .line 118
    :cond_3
    iget v13, v0, Ll/ۧ֫᩷;->ۗ:I

    .line 119
    div-int v14, v8, v13

    .line 120
    div-int v15, v9, v13

    .line 121
    iget-object v1, v0, Ll/ۧ֫᩷;->᩹:Ll/᩶۟ۜ;

    iget-object v6, v1, Ll/᩶۟ۜ;->ۧ:[I

    const/4 v1, 0x0

    move-object v1, v7

    const/4 v5, 0x0

    :goto_1
    if-gt v5, v14, :cond_5

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_2
    if-gt v4, v15, :cond_4

    add-int v1, v5, v4

    .line 124
    rem-int/2addr v1, v2

    aget v1, v6, v1

    invoke-virtual {v12, v1}, Landroid/graphics/Paint;->setColor(I)V

    mul-int v1, v5, v13

    mul-int v2, v4, v13

    add-int v3, v1, v13

    move/from16 v16, v4

    add-int v4, v2, v13

    int-to-float v1, v1

    int-to-float v2, v2

    int-to-float v3, v3

    int-to-float v4, v4

    move/from16 v17, v1

    move-object/from16 v1, p1

    move/from16 v18, v2

    move/from16 v2, v17

    move/from16 v17, v3

    move/from16 v3, v18

    move/from16 v18, v4

    move/from16 v4, v17

    move/from16 v17, v5

    move/from16 v5, v18

    move-object/from16 v18, v6

    move-object v6, v12

    .line 129
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    add-int/lit8 v4, v16, 0x1

    const/4 v2, 0x2

    move-object v1, v7

    move/from16 v5, v17

    move-object/from16 v6, v18

    goto :goto_2

    :cond_4
    move/from16 v17, v5

    move-object/from16 v18, v6

    add-int/lit8 v5, v17, 0x1

    const/4 v2, 0x2

    goto :goto_1

    :cond_5
    move-object v2, v1

    .line 144
    :goto_3
    iget-object v1, v0, Ll/ۧ֫᩷;->ۙ:Landroid/graphics/drawable/Drawable;

    if-nez v1, :cond_6

    goto :goto_4

    .line 148
    :cond_6
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    .line 149
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    int-to-float v5, v8

    int-to-float v3, v3

    div-float/2addr v5, v3

    const/high16 v6, 0x3f800000    # 1.0f

    .line 150
    invoke-static {v6, v5}, Ljava/lang/Math;->min(FF)F

    move-result v5

    int-to-float v7, v9

    int-to-float v4, v4

    div-float/2addr v7, v4

    .line 151
    invoke-static {v6, v7}, Ljava/lang/Math;->min(FF)F

    move-result v6

    .line 152
    invoke-static {v5, v6}, Ljava/lang/Math;->min(FF)F

    move-result v5

    mul-float v3, v3, v5

    float-to-int v3, v3

    mul-float v4, v4, v5

    float-to-int v4, v4

    int-to-float v6, v3

    sub-int/2addr v8, v3

    int-to-float v3, v8

    .line 155
    iget v7, v0, Ll/ۧ֫᩷;->ۧ֫:F

    mul-float v3, v3, v7

    add-float/2addr v3, v6

    float-to-int v3, v3

    int-to-float v6, v4

    sub-int/2addr v9, v4

    int-to-float v4, v9

    .line 156
    iget v7, v0, Ll/ۧ֫᩷;->ᩳ֫:F

    mul-float v4, v4, v7

    add-float/2addr v4, v6

    float-to-int v4, v4

    .line 158
    div-int/lit8 v6, v3, 0x2

    sub-int/2addr v10, v6

    .line 159
    div-int/lit8 v6, v4, 0x2

    sub-int/2addr v11, v6

    add-int/2addr v3, v10

    add-int/2addr v4, v11

    .line 162
    invoke-virtual {v1, v10, v11, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 163
    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 164
    iget-boolean v1, v0, Ll/ۧ֫᩷;->᩶:Z

    if-eqz v1, :cond_7

    const v1, -0x4f7f7f01

    .line 165
    invoke-virtual {v12, v1}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v1, v10

    .line 167
    iget-object v6, v0, Ll/ۧ֫᩷;->ۨ:Landroid/graphics/Rect;

    iget v7, v6, Landroid/graphics/Rect;->left:I

    int-to-float v7, v7

    mul-float v7, v7, v5

    add-float/2addr v1, v7

    int-to-float v7, v11

    iget v8, v6, Landroid/graphics/Rect;->top:I

    int-to-float v8, v8

    mul-float v8, v8, v5

    add-float/2addr v7, v8

    int-to-float v3, v3

    iget v8, v6, Landroid/graphics/Rect;->right:I

    int-to-float v8, v8

    mul-float v8, v8, v5

    sub-float v8, v3, v8

    int-to-float v3, v4

    iget v4, v6, Landroid/graphics/Rect;->bottom:I

    int-to-float v4, v4

    mul-float v4, v4, v5

    sub-float v6, v3, v4

    move v3, v1

    move v4, v7

    move v5, v8

    move-object v7, v12

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_7
    :goto_4
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 275
    instance-of v0, p1, Landroid/os/Bundle;

    if-eqz v0, :cond_0

    .line 276
    check-cast p1, Landroid/os/Bundle;

    const-string v0, "super"

    .line 277
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    const-string v0, "xScale"

    .line 278
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Ll/ۧ֫᩷;->ۧ֫:F

    const-string v0, "yScale"

    .line 279
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Ll/ۧ֫᩷;->ᩳ֫:F

    const-string v0, "drawContentRegion"

    .line 280
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Ll/ۧ֫᩷;->᩶:Z

    const-string v0, "backgroundMode"

    .line 281
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Ll/ۧ֫᩷;->᩸:I

    return-void

    .line 283
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 264
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "super"

    .line 265
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v1, "xScale"

    .line 266
    iget v2, p0, Ll/ۧ֫᩷;->ۧ֫:F

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    const-string v1, "yScale"

    .line 267
    iget v2, p0, Ll/ۧ֫᩷;->ᩳ֫:F

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    const-string v1, "drawContentRegion"

    .line 268
    iget-boolean v2, p0, Ll/ۧ֫᩷;->᩶:Z

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "backgroundMode"

    .line 269
    iget v2, p0, Ll/ۧ֫᩷;->᩸:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    return-object v0
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 202
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_d

    if-eq v0, v2, :cond_c

    const/4 v3, 0x2

    if-eq v0, v3, :cond_2

    const/4 v3, 0x3

    if-eq v0, v3, :cond_c

    const/4 v3, 0x5

    if-eq v0, v3, :cond_1

    const/4 p1, 0x6

    if-eq v0, p1, :cond_0

    goto/16 :goto_2

    .line 219
    :cond_0
    iget p1, p0, Ll/ۧ֫᩷;->ܰ:I

    sub-int/2addr p1, v2

    iput p1, p0, Ll/ۧ֫᩷;->ܰ:I

    return v2

    .line 208
    :cond_1
    iget v0, p0, Ll/ۧ֫᩷;->ܰ:I

    add-int/2addr v0, v2

    iput v0, p0, Ll/ۧ֫᩷;->ܰ:I

    .line 209
    iget-boolean v0, p0, Ll/ۧ֫᩷;->ܳ֫:Z

    if-nez v0, :cond_b

    .line 210
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3

    sub-float/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iput v0, p0, Ll/ۧ֫᩷;->۬:F

    .line 211
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    sub-float/2addr v0, p1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result p1

    iput p1, p0, Ll/ۧ֫᩷;->ۤ:F

    .line 212
    iget p1, p0, Ll/ۧ֫᩷;->ۧ֫:F

    iput p1, p0, Ll/ۧ֫᩷;->۫:F

    .line 213
    iget p1, p0, Ll/ۧ֫᩷;->ᩳ֫:F

    iput p1, p0, Ll/ۧ֫᩷;->ۛ:F

    .line 214
    iput-boolean v2, p0, Ll/ۧ֫᩷;->ܳ֫:Z

    .line 215
    iput-boolean v1, p0, Ll/ۧ֫᩷;->۟:Z

    return v2

    .line 222
    :cond_2
    iget v0, p0, Ll/ۧ֫᩷;->ܰ:I

    if-ne v0, v2, :cond_b

    iget-boolean v0, p0, Ll/ۧ֫᩷;->ܳ֫:Z

    if-eqz v0, :cond_b

    .line 223
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3

    sub-float/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    .line 224
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    move-result v3

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    sub-float/2addr v3, p1

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result p1

    .line 225
    iget-boolean v3, p0, Ll/ۧ֫᩷;->۟:Z

    if-nez v3, :cond_4

    .line 226
    iget v3, p0, Ll/ۧ֫᩷;->۬:F

    sub-float v3, v0, v3

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    iget v4, p0, Ll/ۧ֫᩷;->֫֫:I

    int-to-float v4, v4

    cmpl-float v3, v3, v4

    if-gtz v3, :cond_3

    iget v3, p0, Ll/ۧ֫᩷;->ۤ:F

    sub-float v3, p1, v3

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    iget v4, p0, Ll/ۧ֫᩷;->֫֫:I

    int-to-float v4, v4

    cmpl-float v3, v3, v4

    if-lez v3, :cond_b

    .line 227
    :cond_3
    iput-boolean v2, p0, Ll/ۧ֫᩷;->۟:Z

    .line 230
    :cond_4
    iget v3, p0, Ll/ۧ֫᩷;->۫:F

    iget v4, p0, Ll/ۧ֫᩷;->۬:F

    sub-float/2addr v0, v4

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v0, v4

    add-float/2addr v0, v3

    const/high16 v3, 0x42c80000    # 100.0f

    mul-float v0, v0, v3

    float-to-int v0, v0

    .line 231
    iget v4, p0, Ll/ۧ֫᩷;->ۛ:F

    iget v5, p0, Ll/ۧ֫᩷;->ۤ:F

    sub-float/2addr p1, v5

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr p1, v5

    add-float/2addr p1, v4

    mul-float p1, p1, v3

    float-to-int p1, p1

    const/16 v4, 0x64

    if-le v0, v4, :cond_5

    const/16 v0, 0x64

    goto :goto_0

    :cond_5
    if-gez v0, :cond_6

    const/4 v0, 0x0

    :cond_6
    :goto_0
    if-le p1, v4, :cond_7

    const/16 v1, 0x64

    goto :goto_1

    :cond_7
    if-gez p1, :cond_8

    goto :goto_1

    :cond_8
    move v1, p1

    :goto_1
    int-to-float p1, v0

    div-float/2addr p1, v3

    .line 242
    iput p1, p0, Ll/ۧ֫᩷;->ۧ֫:F

    int-to-float p1, v1

    div-float/2addr p1, v3

    .line 243
    iput p1, p0, Ll/ۧ֫᩷;->ᩳ֫:F

    .line 244
    iget-object p1, p0, Ll/ۧ֫᩷;->ܽ֫:Landroid/widget/SeekBar;

    if-eqz p1, :cond_9

    .line 245
    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 247
    :cond_9
    iget-object p1, p0, Ll/ۧ֫᩷;->ܿ֫:Landroid/widget/SeekBar;

    if-eqz p1, :cond_a

    .line 248
    invoke-virtual {p1, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 250
    :cond_a
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_b
    :goto_2
    return v2

    .line 255
    :cond_c
    iput-boolean v1, p0, Ll/ۧ֫᩷;->ܳ֫:Z

    return v2

    .line 204
    :cond_d
    iput v1, p0, Ll/ۧ֫᩷;->ܰ:I

    .line 205
    iput-boolean v1, p0, Ll/ۧ֫᩷;->ܳ֫:Z

    return v2
.end method

.method public final ֫()V
    .locals 1

    .line 187
    iget v0, p0, Ll/ۧ֫᩷;->᩸:I

    add-int/lit8 v0, v0, 0x1

    rem-int/lit8 v0, v0, 0x4

    iput v0, p0, Ll/ۧ֫᩷;->᩸:I

    .line 188
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ֫(F)V
    .locals 0

    .line 172
    iput p1, p0, Ll/ۧ֫᩷;->ۧ֫:F

    .line 173
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ֫(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 106
    iput-object p1, p0, Ll/ۧ֫᩷;->ۙ:Landroid/graphics/drawable/Drawable;

    .line 107
    iget-object v0, p0, Ll/ۧ֫᩷;->ۨ:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    return-void
.end method

.method public final ֫(Landroid/widget/SeekBar;Landroid/widget/SeekBar;)V
    .locals 1

    .line 65
    iput-object p1, p0, Ll/ۧ֫᩷;->ܽ֫:Landroid/widget/SeekBar;

    .line 66
    iput-object p2, p0, Ll/ۧ֫᩷;->ܿ֫:Landroid/widget/SeekBar;

    .line 67
    new-instance v0, Ll/۟۟ۜ;

    invoke-direct {v0, p0}, Ll/۟۟ۜ;-><init>(Ll/ۧ֫᩷;)V

    invoke-virtual {p1, v0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 85
    new-instance p1, Ll/֫֫᩷;

    invoke-direct {p1, p0}, Ll/֫֫᩷;-><init>(Ll/ۧ֫᩷;)V

    invoke-virtual {p2, p1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    .line 182
    iput-boolean p1, p0, Ll/ۧ֫᩷;->᩶:Z

    .line 183
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ۧ(F)V
    .locals 0

    .line 177
    iput p1, p0, Ll/ۧ֫᩷;->ᩳ֫:F

    .line 178
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
