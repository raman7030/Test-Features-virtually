.class public Ll/ܶ᩷;
.super Landroid/widget/FrameLayout;
.source "M5HH"


# instance fields
.field public ۗ:Z

.field public ۙ:I

.field public ۛ:Landroid/graphics/drawable/Drawable;

.field public ۤ:Landroid/graphics/drawable/Drawable;

.field public ۫:Z

.field public ۬:Z

.field public ᩶:Landroid/view/View;

.field public ᩸:Landroid/view/View;

.field public ᩹:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    .line 59
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 62
    new-instance v0, Ll/۠᩷;

    invoke-direct {v0, p0}, Ll/۠᩷;-><init>(Ll/ܶ᩷;)V

    .line 63
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 65
    sget-object v0, Ll/ۗᩳ;->֫:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x0

    .line 67
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Ll/ܶ᩷;->᩹:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x2

    .line 68
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, p0, Ll/ܶ᩷;->ۛ:Landroid/graphics/drawable/Drawable;

    const/16 v2, 0xd

    const/4 v3, -0x1

    .line 70
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, p0, Ll/ܶ᩷;->ۙ:I

    .line 72
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v2

    const v3, 0x7f0a055b

    const/4 v4, 0x1

    if-ne v2, v3, :cond_0

    .line 73
    iput-boolean v4, p0, Ll/ܶ᩷;->ۗ:Z

    .line 74
    invoke-virtual {p1, v4}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iput-object v2, p0, Ll/ܶ᩷;->ۤ:Landroid/graphics/drawable/Drawable;

    .line 76
    :cond_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 78
    iget-boolean p1, p0, Ll/ܶ᩷;->ۗ:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Ll/ܶ᩷;->ۤ:Landroid/graphics/drawable/Drawable;

    if-nez p1, :cond_2

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    if-nez v1, :cond_2

    :goto_0
    const/4 p2, 0x1

    :cond_2
    invoke-virtual {p0, p2}, Landroid/view/View;->setWillNotDraw(Z)V

    return-void
.end method


# virtual methods
.method public final drawableStateChanged()V
    .locals 2

    .line 168
    invoke-super {p0}, Landroid/widget/FrameLayout;->drawableStateChanged()V

    .line 169
    iget-object v0, p0, Ll/ܶ᩷;->᩹:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 170
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 172
    :cond_0
    iget-object v0, p0, Ll/ܶ᩷;->ۛ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 173
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 175
    :cond_1
    iget-object v0, p0, Ll/ܶ᩷;->ۤ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 176
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_2
    return-void
.end method

.method public final jumpDrawablesToCurrentState()V
    .locals 1

    .line 182
    invoke-super {p0}, Landroid/widget/FrameLayout;->jumpDrawablesToCurrentState()V

    .line 183
    iget-object v0, p0, Ll/ܶ᩷;->᩹:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 184
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V

    .line 186
    :cond_0
    iget-object v0, p0, Ll/ܶ᩷;->ۛ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    .line 187
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V

    .line 189
    :cond_1
    iget-object v0, p0, Ll/ܶ᩷;->ۤ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    .line 190
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V

    :cond_2
    return-void
.end method

.method public final onFinishInflate()V
    .locals 1

    .line 84
    invoke-super {p0}, Landroid/widget/FrameLayout;->onFinishInflate()V

    const v0, 0x7f0a0042

    .line 85
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Ll/ܶ᩷;->᩸:Landroid/view/View;

    const v0, 0x7f0a004a

    .line 86
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Ll/ܶ᩷;->᩶:Landroid/view/View;

    return-void
.end method

.method public final onHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 222
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onHoverEvent(Landroid/view/MotionEvent;)Z

    const/4 p1, 0x1

    return p1
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 209
    iget-boolean v0, p0, Ll/ܶ᩷;->۫:Z

    if-nez v0, :cond_1

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final onLayout(ZIIII)V
    .locals 2

    .line 303
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 317
    iget-boolean p1, p0, Ll/ܶ᩷;->ۗ:Z

    const/4 p2, 0x1

    const/4 p3, 0x0

    if-eqz p1, :cond_1

    .line 318
    iget-object p1, p0, Ll/ܶ᩷;->ۤ:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_0

    .line 319
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p4

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p5

    invoke-virtual {p1, p3, p3, p4, p5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    goto :goto_1

    :cond_0
    const/4 p2, 0x0

    goto :goto_1

    .line 323
    :cond_1
    iget-object p1, p0, Ll/ܶ᩷;->᩹:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_4

    .line 324
    iget-object p4, p0, Ll/ܶ᩷;->᩸:Landroid/view/View;

    invoke-virtual {p4}, Landroid/view/View;->getVisibility()I

    move-result p4

    if-nez p4, :cond_2

    .line 325
    iget-object p4, p0, Ll/ܶ᩷;->᩸:Landroid/view/View;

    invoke-virtual {p4}, Landroid/view/View;->getLeft()I

    move-result p4

    iget-object p5, p0, Ll/ܶ᩷;->᩸:Landroid/view/View;

    invoke-virtual {p5}, Landroid/view/View;->getTop()I

    move-result p5

    iget-object v0, p0, Ll/ܶ᩷;->᩸:Landroid/view/View;

    .line 326
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v0

    iget-object v1, p0, Ll/ܶ᩷;->᩸:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v1

    .line 325
    invoke-virtual {p1, p4, p5, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    goto :goto_0

    .line 327
    :cond_2
    iget-object p4, p0, Ll/ܶ᩷;->᩶:Landroid/view/View;

    if-eqz p4, :cond_3

    .line 328
    invoke-virtual {p4}, Landroid/view/View;->getVisibility()I

    move-result p4

    if-nez p4, :cond_3

    .line 329
    iget-object p4, p0, Ll/ܶ᩷;->᩶:Landroid/view/View;

    invoke-virtual {p4}, Landroid/view/View;->getLeft()I

    move-result p4

    iget-object p5, p0, Ll/ܶ᩷;->᩶:Landroid/view/View;

    invoke-virtual {p5}, Landroid/view/View;->getTop()I

    move-result p5

    iget-object v0, p0, Ll/ܶ᩷;->᩶:Landroid/view/View;

    .line 330
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v0

    iget-object v1, p0, Ll/ܶ᩷;->᩶:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v1

    .line 329
    invoke-virtual {p1, p4, p5, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    goto :goto_0

    .line 332
    :cond_3
    invoke-virtual {p1, p3, p3, p3, p3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    goto :goto_0

    :cond_4
    const/4 p1, 0x0

    const/4 p2, 0x0

    .line 336
    :goto_0
    iput-boolean p3, p0, Ll/ܶ᩷;->۬:Z

    :goto_1
    if-eqz p2, :cond_5

    .line 345
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_5
    return-void
.end method

.method public final onMeasure(II)V
    .locals 2

    .line 273
    iget-object v0, p0, Ll/ܶ᩷;->᩸:Landroid/view/View;

    if-nez v0, :cond_0

    .line 274
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v1, -0x80000000

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ܶ᩷;->ۙ:I

    if-ltz v0, :cond_0

    .line 276
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 275
    invoke-static {p2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 278
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 280
    iget-object p1, p0, Ll/ܶ᩷;->᩸:Landroid/view/View;

    if-nez p1, :cond_1

    return-void

    .line 282
    :cond_1
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 214
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    const/4 p1, 0x1

    return p1
.end method

.method public final setVisibility(I)V
    .locals 2

    .line 153
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 155
    :goto_0
    iget-object v1, p0, Ll/ܶ᩷;->᩹:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_1

    invoke-virtual {v1, p1, v0}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 156
    :cond_1
    iget-object v1, p0, Ll/ܶ᩷;->ۛ:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_2

    invoke-virtual {v1, p1, v0}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 157
    :cond_2
    iget-object v1, p0, Ll/ܶ᩷;->ۤ:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_3

    invoke-virtual {v1, p1, v0}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    :cond_3
    return-void
.end method

.method public final startActionModeForChild(Landroid/view/View;Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final startActionModeForChild(Landroid/view/View;Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;
    .locals 0

    if-eqz p3, :cond_0

    .line 257
    invoke-super {p0, p1, p2, p3}, Landroid/widget/FrameLayout;->startActionModeForChild(Landroid/view/View;Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .locals 2

    .line 162
    iget-object v0, p0, Ll/ܶ᩷;->᩹:Landroid/graphics/drawable/Drawable;

    iget-boolean v1, p0, Ll/ܶ᩷;->ۗ:Z

    if-ne p1, v0, :cond_0

    if-eqz v1, :cond_3

    :cond_0
    iget-object v0, p0, Ll/ܶ᩷;->ۛ:Landroid/graphics/drawable/Drawable;

    if-ne p1, v0, :cond_1

    iget-boolean v0, p0, Ll/ܶ᩷;->۬:Z

    if-nez v0, :cond_3

    :cond_1
    iget-object v0, p0, Ll/ܶ᩷;->ۤ:Landroid/graphics/drawable/Drawable;

    if-ne p1, v0, :cond_2

    if-nez v1, :cond_3

    .line 163
    :cond_2
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    const/4 p1, 0x1

    return p1

    :cond_4
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Z)V
    .locals 0

    .line 202
    iput-boolean p1, p0, Ll/ܶ᩷;->۫:Z

    if-eqz p1, :cond_0

    const/high16 p1, 0x60000

    goto :goto_0

    :cond_0
    const/high16 p1, 0x40000

    .line 203
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    return-void
.end method
