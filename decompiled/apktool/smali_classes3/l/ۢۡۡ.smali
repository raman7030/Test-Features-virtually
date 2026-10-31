.class public Ll/ۢۡۡ;
.super Landroid/view/ViewGroup;
.source "XA43"


# instance fields
.field public final ᩶:Landroid/graphics/Paint;

.field public final ᩸:I

.field public final ᩹:Ll/᩷ۡۡ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 34
    invoke-direct {p0, p1, p2, v0}, Ll/ۢۡۡ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 9

    .line 38
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 25
    new-instance p1, Ll/᩷ۡۡ;

    invoke-direct {p1, p0}, Ll/᩷ۡۡ;-><init>(Ll/ۢۡۡ;)V

    iput-object p1, p0, Ll/ۢۡۡ;->᩹:Ll/᩷ۡۡ;

    .line 26
    new-instance p1, Landroid/graphics/Paint;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Ll/ۢۡۡ;->᩶:Landroid/graphics/Paint;

    .line 27
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result p2

    if-eqz p2, :cond_0

    const/16 p2, 0x14

    goto :goto_0

    :cond_0
    const/high16 p2, 0x41a00000    # 20.0f

    invoke-static {p2}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p2

    :goto_0
    iput p2, p0, Ll/ۢۡۡ;->᩸:I

    const/4 p3, -0x1

    const/4 v0, 0x0

    .line 39
    filled-new-array {p3, v0}, [I

    move-result-object v6

    const/4 p3, 0x2

    new-array v7, p3, [F

    .line 40
    fill-array-data v7, :array_0

    .line 41
    sget-object p3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 42
    new-instance p3, Landroid/graphics/PorterDuffXfermode;

    sget-object v0, Landroid/graphics/PorterDuff$Mode;->DST_OUT:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {p3, v0}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 43
    new-instance p3, Landroid/graphics/LinearGradient;

    int-to-float v4, p2

    const/4 v5, 0x0

    sget-object v8, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p3

    invoke-direct/range {v1 .. v8}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method


# virtual methods
.method public final drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v8, p1

    .line 101
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v1

    .line 102
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v2

    .line 103
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getWidth()I

    move-result v3

    if-ge v3, v1, :cond_0

    .line 104
    invoke-super/range {p0 .. p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    move-result v1

    return v1

    :cond_0
    int-to-float v9, v1

    int-to-float v10, v2

    const/4 v6, 0x0

    const/16 v7, 0x1f

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object/from16 v1, p1

    move v4, v9

    move v5, v10

    .line 106
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;I)I

    move-result v7

    .line 107
    invoke-super/range {p0 .. p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    move-result v11

    const/4 v12, 0x0

    .line 109
    iget v13, v0, Ll/ۢۡۡ;->᩸:I

    int-to-float v4, v13

    const/4 v14, 0x0

    iget-object v15, v0, Ll/ۢۡۡ;->᩶:Landroid/graphics/Paint;

    move v2, v14

    move v3, v12

    move-object v6, v15

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v9, v1

    div-float v1, v10, v1

    const/high16 v2, 0x43340000    # 180.0f

    .line 110
    invoke-virtual {v8, v2, v9, v1}, Landroid/graphics/Canvas;->rotate(FFF)V

    int-to-float v4, v13

    move-object/from16 v1, p1

    move v2, v14

    .line 111
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 113
    invoke-virtual {v8, v7}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return v11
.end method

.method public final getBaseline()I
    .locals 1

    .line 48
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    .line 49
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 50
    invoke-virtual {v0}, Landroid/view/View;->getBaseline()I

    move-result v0

    return v0

    .line 52
    :cond_0
    invoke-super {p0}, Landroid/view/ViewGroup;->getBaseline()I

    move-result v0

    return v0
.end method

.method public final onAttachedToWindow()V
    .locals 2

    .line 88
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 89
    iget-object v0, p0, Ll/ۢۡۡ;->᩹:Ll/᩷ۡۡ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 90
    invoke-virtual {v0, v1, v1, v1}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 95
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 96
    iget-object v0, p0, Ll/ۢۡۡ;->᩹:Ll/᩷ۡۡ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 68
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 71
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    .line 72
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    move-result p3

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    move-result p4

    invoke-virtual {p2, p1, p1, p3, p4}, Landroid/view/View;->layout(IIII)V

    .line 73
    iget-object p2, p0, Ll/ۢۡۡ;->᩹:Ll/᩷ۡۡ;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeMessages(I)V

    .line 74
    invoke-virtual {p2, p1, p1, p1}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public final onMeasure(II)V
    .locals 2

    .line 57
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    .line 58
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onMeasure(II)V

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 61
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 62
    invoke-virtual {v1, v0, p2}, Landroid/view/View;->measure(II)V

    .line 63
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    invoke-static {p2, p1}, Landroid/view/View;->getDefaultSize(II)I

    move-result p1

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public final setVisibility(I)V
    .locals 2

    .line 79
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 80
    iget-object v0, p0, Ll/ۢۡۡ;->᩹:Ll/᩷ۡۡ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    if-nez p1, :cond_0

    .line 82
    invoke-virtual {v0, v1, v1, v1}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_0
    return-void
.end method
