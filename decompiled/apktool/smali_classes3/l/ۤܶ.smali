.class public Ll/ۤܶ;
.super Ll/۫ܶ;
.source "C19N"


# instance fields
.field public ֫֫:Landroid/graphics/Paint;

.field public ۟:Ll/ۤۚ;

.field public ۧ֫:I

.field public ܰ:Landroid/graphics/Matrix;

.field public ܽ֫:F

.field public ܿ֫:[F

.field public ᩳ֫:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 60
    invoke-direct {p0, p1, p2}, Ll/۫ܶ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 47
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Ll/ۤܶ;->֫֫:Landroid/graphics/Paint;

    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 49
    iput-object v0, p0, Ll/ۤܶ;->ܿ֫:[F

    .line 50
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Ll/ۤܶ;->ܰ:Landroid/graphics/Matrix;

    const/4 v0, 0x0

    .line 51
    iput v0, p0, Ll/ۤܶ;->ᩳ֫:I

    const v0, -0xff01

    .line 52
    iput v0, p0, Ll/ۤܶ;->ۧ֫:I

    const/high16 v0, 0x3e800000    # 0.25f

    .line 53
    iput v0, p0, Ll/ۤܶ;->ܽ֫:F

    .line 61
    invoke-direct {p0, p1, p2}, Ll/ۤܶ;->֫(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 65
    invoke-direct {p0, p1, p2, p3}, Ll/۫ܶ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 47
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Ll/ۤܶ;->֫֫:Landroid/graphics/Paint;

    const/4 p3, 0x2

    new-array p3, p3, [F

    .line 49
    iput-object p3, p0, Ll/ۤܶ;->ܿ֫:[F

    .line 50
    new-instance p3, Landroid/graphics/Matrix;

    invoke-direct {p3}, Landroid/graphics/Matrix;-><init>()V

    iput-object p3, p0, Ll/ۤܶ;->ܰ:Landroid/graphics/Matrix;

    const/4 p3, 0x0

    .line 51
    iput p3, p0, Ll/ۤܶ;->ᩳ֫:I

    const p3, -0xff01

    .line 52
    iput p3, p0, Ll/ۤܶ;->ۧ֫:I

    const/high16 p3, 0x3e800000    # 0.25f

    .line 53
    iput p3, p0, Ll/ۤܶ;->ܽ֫:F

    .line 66
    invoke-direct {p0, p1, p2}, Ll/ۤܶ;->֫(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private ֫(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    if-eqz p2, :cond_4

    .line 71
    sget-object v0, Ll/᩸᩸;->ۚ:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 72
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result p2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_3

    .line 74
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v1

    if-nez v1, :cond_0

    .line 76
    iget v2, p0, Ll/ۤܶ;->ۧ֫:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Ll/ۤܶ;->ۧ֫:I

    goto :goto_1

    :cond_0
    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    .line 78
    iget v2, p0, Ll/ۤܶ;->ᩳ֫:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Ll/ۤܶ;->ᩳ֫:I

    goto :goto_1

    :cond_1
    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    .line 80
    iget v2, p0, Ll/ۤܶ;->ܽ֫:F

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    iput v1, p0, Ll/ۤܶ;->ܽ֫:F

    :cond_2
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 83
    :cond_3
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 85
    :cond_4
    iget p1, p0, Ll/ۤܶ;->ۧ֫:I

    iget-object p2, p0, Ll/ۤܶ;->֫֫:Landroid/graphics/Paint;

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 p1, 0x40a00000    # 5.0f

    .line 86
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void
.end method


# virtual methods
.method public final onAttachedToWindow()V
    .locals 0

    .line 91
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 23

    move-object/from16 v6, p0

    .line 107
    invoke-super/range {p0 .. p1}, Ll/۫ܶ;->onDraw(Landroid/graphics/Canvas;)V

    .line 108
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v0

    .line 109
    iget-object v7, v6, Ll/ۤܶ;->ܰ:Landroid/graphics/Matrix;

    invoke-virtual {v0, v7}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 110
    iget-object v0, v6, Ll/ۤܶ;->۟:Ll/ۤۚ;

    if-nez v0, :cond_0

    .line 111
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 112
    instance-of v1, v0, Ll/ۤۚ;

    if-eqz v1, :cond_2

    .line 113
    check-cast v0, Ll/ۤۚ;

    iput-object v0, v6, Ll/ۤܶ;->۟:Ll/ۤۚ;

    return-void

    .line 117
    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v8

    .line 118
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v9

    const/4 v10, 0x5

    new-array v11, v10, [F

    .line 119
    fill-array-data v11, :array_0

    const/4 v12, 0x0

    const/4 v0, 0x0

    const/4 v13, 0x0

    :goto_0
    if-ge v13, v10, :cond_2

    .line 121
    aget v14, v11, v13

    const/4 v0, 0x0

    const/4 v15, 0x0

    :goto_1
    if-ge v15, v10, :cond_1

    .line 123
    aget v16, v11, v15

    .line 124
    iget-object v0, v6, Ll/ۤܶ;->۟:Ll/ۤۚ;

    iget-object v4, v6, Ll/ۤܶ;->ܿ֫:[F

    iget v5, v6, Ll/ۤܶ;->ᩳ֫:I

    move-object/from16 v1, p0

    move/from16 v2, v16

    move v3, v14

    invoke-virtual/range {v0 .. v5}, Ll/ۤۚ;->֫(Ll/ۤܶ;FF[FI)V

    .line 125
    iget-object v0, v6, Ll/ۤܶ;->ܿ֫:[F

    invoke-virtual {v7, v0}, Landroid/graphics/Matrix;->mapVectors([F)V

    int-to-float v1, v8

    mul-float v18, v1, v16

    int-to-float v1, v9

    mul-float v19, v1, v14

    .line 129
    aget v1, v0, v12

    iget v2, v6, Ll/ۤܶ;->ܽ֫:F

    mul-float v1, v1, v2

    sub-float v20, v18, v1

    const/4 v1, 0x1

    .line 130
    aget v1, v0, v1

    mul-float v1, v1, v2

    sub-float v21, v19, v1

    .line 131
    invoke-virtual {v7, v0}, Landroid/graphics/Matrix;->mapVectors([F)V

    .line 132
    iget-object v0, v6, Ll/ۤܶ;->֫֫:Landroid/graphics/Paint;

    move-object/from16 v17, p1

    move-object/from16 v22, v0

    invoke-virtual/range {v17 .. v22}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    add-int/lit8 v15, v15, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    :cond_2
    return-void

    nop

    :array_0
    .array-data 4
        0x3dcccccd    # 0.1f
        0x3e800000    # 0.25f
        0x3f000000    # 0.5f
        0x3f400000    # 0.75f
        0x3f666666    # 0.9f
    .end array-data
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 101
    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    .line 102
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    return-void
.end method
