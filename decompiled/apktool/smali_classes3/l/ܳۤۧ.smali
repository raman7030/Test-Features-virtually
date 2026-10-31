.class public Ll/ܳۤۧ;
.super Landroid/view/ViewGroup;
.source "U6BG"


# static fields
.field public static ᩳ֫:Z


# instance fields
.field public ֫֫:I

.field public ۗ:Ll/ۛ۫ۧ;

.field public ۙ:Ll/ܳۧܽ;

.field public ۛ:I

.field public ۟:F

.field public ۤ:Z

.field public ۧ֫:Landroid/view/View;

.field public final ۨ:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public ۫:F

.field public ۬:F

.field public ܰ:Z

.field public final ܽ֫:Landroid/graphics/Rect;

.field public ᩶:Z

.field public ᩸:Z

.field public final ᩹:Ll/ܺۧ֫;

.field public final ᩺:Ljava/util/ArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 232
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Ll/ܳۤۧ;->ᩳ֫:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 319
    invoke-direct {p0, p1, p2, v0}, Ll/ܳۤۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 324
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/high16 p2, 0x3f800000    # 1.0f

    .line 154
    iput p2, p0, Ll/ܳۤۧ;->۟:F

    .line 181
    new-instance p2, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p2, p0, Ll/ܳۤۧ;->ۨ:Ljava/util/concurrent/CopyOnWriteArrayList;

    const/4 p2, 0x1

    .line 192
    iput-boolean p2, p0, Ll/ܳۤۧ;->᩶:Z

    .line 194
    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    iput-object p3, p0, Ll/ܳۤۧ;->ܽ֫:Landroid/graphics/Rect;

    .line 196
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Ll/ܳۤۧ;->᩺:Ljava/util/ArrayList;

    .line 298
    new-instance p3, Ll/ۨ۫ۧ;

    invoke-direct {p3, p0}, Ll/ۨ۫ۧ;-><init>(Ll/ܳۤۧ;)V

    .line 326
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    const/4 v1, 0x0

    .line 328
    invoke-virtual {p0, v1}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 330
    new-instance v1, Ll/᩺۫ۧ;

    invoke-direct {v1, p0}, Ll/᩺۫ۧ;-><init>(Ll/ܳۤۧ;)V

    invoke-static {p0, v1}, Ll/ܿ᩺;->֫(Landroid/view/View;Ll/ܽۛ;)V

    .line 1427
    invoke-virtual {p0, p2}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 333
    new-instance p2, Ll/۟۫ۧ;

    invoke-direct {p2, p0}, Ll/۟۫ۧ;-><init>(Ll/ܳۤۧ;)V

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-static {p0, v1, p2}, Ll/ܺۧ֫;->֫(Landroid/view/ViewGroup;FLl/ۡۧ֫;)Ll/ܺۧ֫;

    move-result-object p2

    iput-object p2, p0, Ll/ܳۤۧ;->᩹:Ll/ܺۧ֫;

    const/high16 v1, 0x43c80000    # 400.0f

    mul-float v0, v0, v1

    .line 334
    invoke-virtual {p2, v0}, Ll/ܺۧ֫;->֫(F)V

    .line 336
    sget p2, Ll/᩺ۧܽ;->֫:I

    .line 0
    sget-object p2, Ll/۟ۧܽ;->֫:Ll/ܰۧܽ;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Ll/ܰۧܽ;->֫(Landroid/content/Context;)Ll/ᩳܽܽ;

    move-result-object p2

    .line 337
    invoke-static {p1}, Ll/֨ۙ;->֫(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object p1

    .line 338
    new-instance v0, Ll/ۛ۫ۧ;

    invoke-direct {v0, p2, p1}, Ll/ۛ۫ۧ;-><init>(Ll/ᩳܽܽ;Ljava/util/concurrent/Executor;)V

    .line 345
    iput-object v0, p0, Ll/ܳۤۧ;->ۗ:Ll/ۛ۫ۧ;

    .line 346
    invoke-virtual {v0, p3}, Ll/ۛ۫ۧ;->֫(Ll/᩶۫ۧ;)V

    return-void
.end method

.method private ֫()Z
    .locals 2

    .line 1017
    iget-boolean v0, p0, Ll/ܳۤۧ;->᩸:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 1018
    iput-boolean v1, p0, Ll/ܳۤۧ;->ܰ:Z

    .line 1020
    :cond_0
    iget-boolean v0, p0, Ll/ܳۤۧ;->᩶:Z

    if-nez v0, :cond_2

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0}, Ll/ܳۤۧ;->֫(F)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    return v1

    .line 1021
    :cond_2
    :goto_0
    iput-boolean v1, p0, Ll/ܳۤۧ;->ܰ:Z

    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public final addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .line 560
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 562
    new-instance v0, Ll/ܿۤۧ;

    .line 1818
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 1819
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 563
    invoke-super {p0, v0, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void

    .line 566
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 1

    .line 1474
    instance-of v0, p1, Ll/֫ۤۧ;

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final computeScroll()V
    .locals 2

    .line 1292
    iget-object v0, p0, Ll/ܳۤۧ;->᩹:Ll/ܺۧ֫;

    invoke-virtual {v0}, Ll/ܺۧ֫;->ᩳ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1293
    iget-boolean v1, p0, Ll/ܳۤۧ;->᩸:Z

    if-nez v1, :cond_0

    .line 1294
    invoke-virtual {v0}, Ll/ܺۧ֫;->֫()V

    return-void

    .line 1298
    :cond_0
    sget v0, Ll/ܿ᩺;->֫:I

    .line 1323
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    :cond_1
    return-void
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1369
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V

    .line 1370
    invoke-virtual {p0}, Ll/ܳۤۧ;->ܽ()Z

    .line 1378
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    const/4 v0, 0x1

    if-le p1, v0, :cond_0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    :cond_0
    return-void
.end method

.method public final drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
    .locals 4

    .line 1152
    invoke-virtual {p0}, Ll/ܳۤۧ;->ܽ()Z

    move-result v0

    .line 1153
    invoke-virtual {p0}, Ll/ܳۤۧ;->ᩳ()Z

    move-result v1

    xor-int/2addr v0, v1

    .line 1154
    sget-boolean v1, Ll/ܳۤۧ;->ᩳ֫:Z

    const/4 v2, 0x0

    iget-object v3, p0, Ll/ܳۤۧ;->᩹:Ll/ܺۧ֫;

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 1155
    invoke-virtual {v3, v0}, Ll/ܺۧ֫;->ܽ(I)V

    if-eqz v1, :cond_0

    .line 1197
    invoke-static {p0}, Ll/ܿ᩺;->᩷(Landroid/view/View;)Ll/᩸ܰ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1199
    invoke-virtual {v0}, Ll/᩸ܰ;->ܳ()Ll/ۧ۬;

    move-result-object v2

    :cond_0
    if-eqz v2, :cond_3

    .line 1159
    invoke-virtual {v3}, Ll/ܺۧ֫;->ܳ()I

    move-result v0

    iget v1, v2, Ll/ۧ۬;->ۧ:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {v3, v0}, Ll/ܺۧ֫;->ۧ(I)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    .line 1163
    invoke-virtual {v3, v0}, Ll/ܺۧ֫;->ܽ(I)V

    if-eqz v1, :cond_2

    .line 1197
    invoke-static {p0}, Ll/ܿ᩺;->᩷(Landroid/view/View;)Ll/᩸ܰ;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 1199
    invoke-virtual {v0}, Ll/᩸ܰ;->ܳ()Ll/ۧ۬;

    move-result-object v2

    :cond_2
    if-eqz v2, :cond_3

    .line 1167
    invoke-virtual {v3}, Ll/ܺۧ֫;->ܳ()I

    move-result v0

    iget v1, v2, Ll/ۧ۬;->ܽ:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {v3, v0}, Ll/ܺۧ֫;->ۧ(I)V

    .line 1171
    :cond_3
    :goto_0
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/֫ۤۧ;

    .line 1173
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v1

    .line 1175
    iget-boolean v2, p0, Ll/ܳۤۧ;->᩸:Z

    if-eqz v2, :cond_5

    iget-boolean v0, v0, Ll/֫ۤۧ;->ۧ:Z

    if-nez v0, :cond_5

    iget-object v0, p0, Ll/ܳۤۧ;->ۧ֫:Landroid/view/View;

    if-eqz v0, :cond_5

    .line 1177
    iget-object v0, p0, Ll/ܳۤۧ;->ܽ֫:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z

    .line 1178
    invoke-virtual {p0}, Ll/ܳۤۧ;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 1179
    iget v2, v0, Landroid/graphics/Rect;->left:I

    iget-object v3, p0, Ll/ܳۤۧ;->ۧ֫:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    iput v2, v0, Landroid/graphics/Rect;->left:I

    goto :goto_1

    .line 1181
    :cond_4
    iget v2, v0, Landroid/graphics/Rect;->right:I

    iget-object v3, p0, Ll/ܳۤۧ;->ۧ֫:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    iput v2, v0, Landroid/graphics/Rect;->right:I

    .line 1183
    :goto_1
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/Rect;)Z

    .line 1186
    :cond_5
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    move-result p2

    .line 1188
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return p2
.end method

.method public final generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 1462
    new-instance v0, Ll/֫ۤۧ;

    invoke-direct {v0}, Ll/֫ۤۧ;-><init>()V

    return-object v0
.end method

.method public final generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 1479
    new-instance v0, Ll/֫ۤۧ;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ll/֫ۤۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public final generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 1467
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 1468
    new-instance v0, Ll/֫ۤۧ;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 1675
    invoke-direct {v0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    .line 1647
    :goto_0
    iput v1, v0, Ll/֫ۤۧ;->ܽ:F

    return-object v0

    .line 1469
    :cond_0
    new-instance v0, Ll/֫ۤۧ;

    .line 1671
    invoke-direct {v0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0
.end method

.method public final onAttachedToWindow()V
    .locals 2

    .line 580
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    const/4 v0, 0x1

    .line 581
    iput-boolean v0, p0, Ll/ܳۤۧ;->᩶:Z

    .line 582
    iget-object v0, p0, Ll/ܳۤۧ;->ۗ:Ll/ۛ۫ۧ;

    if-eqz v0, :cond_2

    .line 583
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 1905
    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_1

    .line 1906
    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_0

    .line 1907
    check-cast v0, Landroid/app/Activity;

    goto :goto_1

    .line 1909
    :cond_0
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_2

    .line 585
    iget-object v1, p0, Ll/ܳۤۧ;->ۗ:Ll/ۛ۫ۧ;

    invoke-virtual {v1, v0}, Ll/ۛ۫ۧ;->֫(Landroid/app/Activity;)V

    :cond_2
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 592
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    const/4 v0, 0x1

    .line 593
    iput-boolean v0, p0, Ll/ܳۤۧ;->᩶:Z

    .line 594
    iget-object v0, p0, Ll/ܳۤۧ;->ۗ:Ll/ۛ۫ۧ;

    if-eqz v0, :cond_0

    .line 595
    invoke-virtual {v0}, Ll/ۛ۫ۧ;->֫()V

    .line 597
    :cond_0
    iget-object v0, p0, Ll/ܳۤۧ;->᩺:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-gtz v1, :cond_1

    .line 601
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void

    :cond_1
    const/4 v1, 0x0

    .line 598
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܰ۫ۧ;

    .line 599
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 1842
    throw v0
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 918
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    .line 921
    iget-boolean v1, p0, Ll/ܳۤۧ;->᩸:Z

    const/4 v2, 0x1

    iget-object v3, p0, Ll/ܳۤۧ;->᩹:Ll/ܺۧ֫;

    if-nez v1, :cond_0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-le v1, v2, :cond_0

    .line 923
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 926
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    float-to-int v5, v5

    .line 925
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v4, v5}, Ll/ܺۧ֫;->ۧ(Landroid/view/View;II)Z

    move-result v1

    iput-boolean v1, p0, Ll/ܳۤۧ;->ܰ:Z

    .line 930
    :cond_0
    iget-boolean v1, p0, Ll/ܳۤۧ;->᩸:Z

    if-eqz v1, :cond_9

    iget-boolean v1, p0, Ll/ܳۤۧ;->ۤ:Z

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    goto/16 :goto_4

    :cond_1
    const/4 v1, 0x3

    const/4 v4, 0x0

    if-eq v0, v1, :cond_8

    if-ne v0, v2, :cond_2

    goto :goto_3

    :cond_2
    if-eqz v0, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    goto :goto_0

    .line 958
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 959
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    .line 960
    iget v5, p0, Ll/ܳۤۧ;->۬:F

    sub-float/2addr v0, v5

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    .line 961
    iget v5, p0, Ll/ܳۤۧ;->۫:F

    sub-float/2addr v1, v5

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    .line 962
    invoke-virtual {v3}, Ll/ܺۧ֫;->ۜ()I

    move-result v5

    int-to-float v5, v5

    cmpl-float v5, v0, v5

    if-lez v5, :cond_5

    cmpl-float v0, v1, v0

    if-lez v0, :cond_5

    .line 964
    invoke-virtual {v3}, Ll/ܺۧ֫;->ۧ()V

    .line 965
    iput-boolean v2, p0, Ll/ܳۤۧ;->ۤ:Z

    return v4

    .line 944
    :cond_4
    iput-boolean v4, p0, Ll/ܳۤۧ;->ۤ:Z

    .line 945
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 946
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    .line 947
    iput v0, p0, Ll/ܳۤۧ;->۬:F

    .line 948
    iput v1, p0, Ll/ܳۤۧ;->۫:F

    .line 950
    iget-object v5, p0, Ll/ܳۤۧ;->ۧ֫:Landroid/view/View;

    float-to-int v0, v0

    float-to-int v1, v1

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v0, v1}, Ll/ܺۧ֫;->ۧ(Landroid/view/View;II)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Ll/ܳۤۧ;->ۧ֫:Landroid/view/View;

    .line 951
    invoke-virtual {p0, v0}, Ll/ܳۤۧ;->ܽ(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x1

    goto :goto_1

    :cond_5
    :goto_0
    const/4 v0, 0x0

    .line 971
    :goto_1
    invoke-virtual {v3, p1}, Ll/ܺۧ֫;->ۧ(Landroid/view/MotionEvent;)Z

    move-result p1

    if-nez p1, :cond_7

    if-eqz v0, :cond_6

    goto :goto_2

    :cond_6
    return v4

    :cond_7
    :goto_2
    return v2

    .line 936
    :cond_8
    :goto_3
    invoke-virtual {v3}, Ll/ܺۧ֫;->ۧ()V

    return v4

    .line 931
    :cond_9
    :goto_4
    invoke-virtual {v3}, Ll/ܺۧ֫;->ۧ()V

    .line 932
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public final onLayout(ZIIII)V
    .locals 17

    move-object/from16 v0, p0

    .line 820
    invoke-virtual/range {p0 .. p0}, Ll/ܳۤۧ;->ܽ()Z

    move-result v1

    sub-int v2, p4, p2

    if-eqz v1, :cond_0

    .line 822
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    :goto_0
    if-eqz v1, :cond_1

    .line 823
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    goto :goto_1

    :cond_1
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    .line 824
    :goto_1
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    .line 826
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v6

    .line 830
    iget-boolean v7, v0, Ll/ܳۤۧ;->᩶:Z

    if-eqz v7, :cond_3

    .line 831
    iget-boolean v7, v0, Ll/ܳۤۧ;->᩸:Z

    if-eqz v7, :cond_2

    iget-boolean v7, v0, Ll/ܳۤۧ;->ܰ:Z

    if-eqz v7, :cond_2

    const/4 v7, 0x0

    goto :goto_2

    :cond_2
    const/high16 v7, 0x3f800000    # 1.0f

    :goto_2
    iput v7, v0, Ll/ܳۤۧ;->۟:F

    :cond_3
    const/4 v7, 0x0

    move v7, v3

    const/4 v8, 0x0

    :goto_3
    if-ge v8, v6, :cond_a

    .line 835
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v9

    .line 837
    invoke-virtual {v9}, Landroid/view/View;->getVisibility()I

    move-result v10

    const/16 v11, 0x8

    if-ne v10, v11, :cond_4

    goto/16 :goto_9

    .line 841
    :cond_4
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v10

    check-cast v10, Ll/֫ۤۧ;

    .line 843
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredWidth()I

    move-result v11

    .line 846
    iget-boolean v12, v10, Ll/֫ۤۧ;->ۧ:Z

    if-eqz v12, :cond_7

    .line 847
    iget v12, v10, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v13, v10, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v12, v13

    sub-int v13, v2, v4

    .line 848
    invoke-static {v3, v13}, Ljava/lang/Math;->min(II)I

    move-result v14

    sub-int/2addr v14, v7

    sub-int/2addr v14, v12

    .line 849
    iput v14, v0, Ll/ܳۤۧ;->֫֫:I

    if-eqz v1, :cond_5

    .line 850
    iget v12, v10, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    goto :goto_4

    :cond_5
    iget v12, v10, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    :goto_4
    add-int v15, v7, v12

    add-int/2addr v15, v14

    .line 851
    div-int/lit8 v16, v11, 0x2

    add-int v15, v16, v15

    if-le v15, v13, :cond_6

    const/4 v13, 0x1

    goto :goto_5

    :cond_6
    const/4 v13, 0x0

    :goto_5
    iput-boolean v13, v10, Ll/֫ۤۧ;->֫:Z

    int-to-float v10, v14

    .line 852
    iget v13, v0, Ll/ܳۤۧ;->۟:F

    mul-float v13, v13, v10

    float-to-int v13, v13

    add-int/2addr v12, v13

    add-int/2addr v12, v7

    int-to-float v7, v13

    div-float/2addr v7, v10

    .line 854
    iput v7, v0, Ll/ܳۤۧ;->۟:F

    goto :goto_6

    :cond_7
    move v12, v3

    :goto_6
    if-eqz v1, :cond_8

    sub-int v7, v2, v12

    sub-int v10, v7, v11

    goto :goto_7

    :cond_8
    add-int v7, v12, v11

    move v10, v12

    .line 873
    :goto_7
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredHeight()I

    move-result v11

    add-int/2addr v11, v5

    .line 874
    invoke-virtual {v9, v10, v5, v7, v11}, Landroid/view/View;->layout(IIII)V

    .line 879
    iget-object v7, v0, Ll/ܳۤۧ;->ۙ:Ll/ܳۧܽ;

    if-eqz v7, :cond_9

    .line 880
    invoke-interface {v7}, Ll/ܳۧܽ;->ܽ()Ll/ᩳۧܽ;

    move-result-object v7

    sget-object v10, Ll/ᩳۧܽ;->ܽ:Ll/ᩳۧܽ;

    if-ne v7, v10, :cond_9

    iget-object v7, v0, Ll/ܳۤۧ;->ۙ:Ll/ܳۧܽ;

    .line 881
    invoke-interface {v7}, Ll/ܳۧܽ;->ۧ()Z

    move-result v7

    if-eqz v7, :cond_9

    .line 882
    iget-object v7, v0, Ll/ܳۤۧ;->ۙ:Ll/ܳۧܽ;

    invoke-interface {v7}, Ll/ۨ֫ܽ;->֫()Landroid/graphics/Rect;

    move-result-object v7

    invoke-virtual {v7}, Landroid/graphics/Rect;->width()I

    move-result v7

    goto :goto_8

    :cond_9
    const/4 v7, 0x0

    .line 884
    :goto_8
    invoke-virtual {v9}, Landroid/view/View;->getWidth()I

    move-result v9

    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    move-result v7

    add-int/2addr v7, v9

    add-int/2addr v7, v3

    move v3, v7

    move v7, v12

    :goto_9
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_3

    .line 887
    :cond_a
    iget-boolean v1, v0, Ll/ܳۤۧ;->᩶:Z

    if-eqz v1, :cond_b

    .line 893
    iget-object v1, v0, Ll/ܳۤۧ;->ۧ֫:Landroid/view/View;

    invoke-virtual {v0, v1}, Ll/ܳۤۧ;->ᩳ(Landroid/view/View;)V

    :cond_b
    const/4 v1, 0x0

    .line 896
    iput-boolean v1, v0, Ll/ܳۤۧ;->᩶:Z

    return-void
.end method

.method public final onMeasure(II)V
    .locals 20

    move-object/from16 v0, p0

    move/from16 v1, p2

    .line 606
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    .line 607
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    .line 608
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v4

    .line 609
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v5

    const/high16 v6, 0x40000000    # 2.0f

    const/4 v7, 0x0

    const/high16 v8, -0x80000000

    if-eq v4, v8, :cond_1

    if-eq v4, v6, :cond_0

    const/4 v5, 0x0

    const/4 v6, 0x0

    goto :goto_0

    .line 615
    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v6

    sub-int/2addr v5, v6

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v6

    sub-int/2addr v5, v6

    move v6, v5

    goto :goto_0

    .line 618
    :cond_1
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v6

    sub-int/2addr v5, v6

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v6

    sub-int v6, v5, v6

    const/4 v5, 0x0

    .line 624
    :goto_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v8

    sub-int v8, v3, v8

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v9

    sub-int/2addr v8, v9

    invoke-static {v8, v7}, Ljava/lang/Math;->max(II)I

    move-result v8

    .line 626
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v9

    const/4 v10, 0x0

    .line 633
    iput-object v10, v0, Ll/ܳۤۧ;->ۧ֫:Landroid/view/View;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move v14, v8

    :goto_1
    const/16 v15, 0x8

    if-ge v10, v9, :cond_c

    .line 638
    invoke-virtual {v0, v10}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v13

    .line 639
    invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v16

    move/from16 v17, v3

    move-object/from16 v3, v16

    check-cast v3, Ll/֫ۤۧ;

    move/from16 v16, v9

    .line 641
    invoke-virtual {v13}, Landroid/view/View;->getVisibility()I

    move-result v9

    if-ne v9, v15, :cond_2

    .line 642
    iput-boolean v7, v3, Ll/֫ۤۧ;->֫:Z

    goto/16 :goto_6

    .line 646
    :cond_2
    iget v9, v3, Ll/֫ۤۧ;->ܽ:F

    const/4 v15, 0x0

    cmpl-float v18, v9, v15

    if-lez v18, :cond_3

    add-float/2addr v12, v9

    .line 651
    iget v9, v3, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    if-nez v9, :cond_3

    goto/16 :goto_6

    .line 655
    :cond_3
    iget v9, v3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v15, v3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v9, v15

    sub-int v9, v8, v9

    .line 657
    invoke-static {v9, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    .line 660
    iget v9, v3, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    const/4 v15, -0x2

    if-ne v9, v15, :cond_5

    if-nez v2, :cond_4

    move v9, v2

    goto :goto_2

    :cond_4
    const/high16 v9, -0x80000000

    .line 661
    :goto_2
    invoke-static {v7, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    goto :goto_3

    :cond_5
    const/4 v15, -0x1

    if-ne v9, v15, :cond_6

    .line 664
    invoke-static {v7, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    goto :goto_3

    :cond_6
    const/high16 v7, 0x40000000    # 2.0f

    .line 666
    invoke-static {v9, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    .line 670
    :goto_3
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v9

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v15

    add-int/2addr v15, v9

    iget v9, v3, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 669
    invoke-static {v1, v15, v9}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v9

    .line 671
    invoke-virtual {v13, v7, v9}, Landroid/view/View;->measure(II)V

    .line 672
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    .line 673
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v9

    if-le v9, v5, :cond_8

    const/high16 v15, -0x80000000

    if-ne v4, v15, :cond_7

    .line 677
    invoke-static {v9, v6}, Ljava/lang/Math;->min(II)I

    move-result v5

    goto :goto_4

    :cond_7
    if-nez v4, :cond_8

    move v5, v9

    :cond_8
    :goto_4
    sub-int/2addr v14, v7

    if-nez v10, :cond_9

    goto :goto_6

    :cond_9
    if-gez v14, :cond_a

    const/4 v7, 0x1

    goto :goto_5

    :cond_a
    const/4 v7, 0x0

    .line 688
    :goto_5
    iput-boolean v7, v3, Ll/֫ۤۧ;->ۧ:Z

    or-int v3, v11, v7

    if-eqz v7, :cond_b

    .line 690
    iput-object v13, v0, Ll/ܳۤۧ;->ۧ֫:Landroid/view/View;

    :cond_b
    move v11, v3

    :goto_6
    add-int/lit8 v10, v10, 0x1

    const/4 v7, 0x0

    move/from16 v9, v16

    move/from16 v3, v17

    goto/16 :goto_1

    :cond_c
    move/from16 v17, v3

    move/from16 v16, v9

    if-nez v11, :cond_e

    const/4 v3, 0x0

    cmpl-float v7, v12, v3

    if-lez v7, :cond_d

    goto :goto_7

    :cond_d
    move/from16 v7, v16

    goto/16 :goto_e

    :cond_e
    :goto_7
    const/4 v3, 0x0

    move/from16 v7, v16

    :goto_8
    if-ge v3, v7, :cond_17

    .line 699
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v9

    .line 700
    invoke-virtual {v9}, Landroid/view/View;->getVisibility()I

    move-result v10

    if-ne v10, v15, :cond_f

    move/from16 v18, v12

    move/from16 v16, v14

    const/16 v19, 0x0

    goto/16 :goto_d

    .line 704
    :cond_f
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v10

    check-cast v10, Ll/֫ۤۧ;

    .line 705
    iget v13, v10, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    if-nez v13, :cond_10

    iget v13, v10, Ll/֫ۤۧ;->ܽ:F

    const/4 v15, 0x0

    cmpl-float v13, v13, v15

    if-lez v13, :cond_10

    const/4 v13, 0x0

    goto :goto_9

    .line 706
    :cond_10
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredWidth()I

    move-result v13

    :goto_9
    if-eqz v11, :cond_11

    .line 712
    iget v15, v10, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v10, v10, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v15, v10

    sub-int v10, v8, v15

    const/high16 v15, 0x40000000    # 2.0f

    .line 714
    invoke-static {v10, v15}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v15

    goto :goto_a

    .line 717
    :cond_11
    iget v15, v10, Ll/֫ۤۧ;->ܽ:F

    const/16 v16, 0x0

    cmpl-float v15, v15, v16

    if-lez v15, :cond_12

    const/4 v15, 0x0

    .line 719
    invoke-static {v15, v14}, Ljava/lang/Math;->max(II)I

    move-result v15

    .line 720
    iget v10, v10, Ll/֫ۤۧ;->ܽ:F

    int-to-float v15, v15

    mul-float v10, v10, v15

    div-float/2addr v10, v12

    float-to-int v10, v10

    add-int/2addr v10, v13

    const/high16 v15, 0x40000000    # 2.0f

    .line 722
    invoke-static {v10, v15}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v15

    goto :goto_a

    :cond_12
    const/4 v15, 0x0

    move v10, v13

    .line 725
    :goto_a
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v16

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v18

    add-int v2, v18, v16

    .line 804
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v16

    move/from16 v18, v12

    move-object/from16 v12, v16

    check-cast v12, Ll/֫ۤۧ;

    move/from16 v16, v14

    .line 806
    iget v14, v12, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    if-nez v14, :cond_13

    iget v14, v12, Ll/֫ۤۧ;->ܽ:F

    const/16 v19, 0x0

    cmpl-float v14, v14, v19

    if-lez v14, :cond_14

    .line 809
    iget v12, v12, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-static {v1, v2, v12}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v2

    goto :goto_b

    :cond_13
    const/16 v19, 0x0

    .line 813
    :cond_14
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    const/high16 v12, 0x40000000    # 2.0f

    .line 812
    invoke-static {v2, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    :goto_b
    if-eq v13, v10, :cond_16

    .line 727
    invoke-virtual {v9, v15, v2}, Landroid/view/View;->measure(II)V

    .line 728
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    if-le v2, v5, :cond_16

    const/high16 v9, -0x80000000

    if-ne v4, v9, :cond_15

    .line 731
    invoke-static {v2, v6}, Ljava/lang/Math;->min(II)I

    move-result v2

    goto :goto_c

    :cond_15
    if-nez v4, :cond_16

    :goto_c
    move v5, v2

    :cond_16
    :goto_d
    add-int/lit8 v3, v3, 0x1

    const/16 v15, 0x8

    move/from16 v14, v16

    move/from16 v12, v18

    goto/16 :goto_8

    .line 1858
    :cond_17
    :goto_e
    iget-object v1, v0, Ll/ܳۤۧ;->ۙ:Ll/ܳۧܽ;

    if-eqz v1, :cond_1e

    invoke-interface {v1}, Ll/ܳۧܽ;->ۧ()Z

    move-result v1

    if-nez v1, :cond_18

    goto/16 :goto_10

    .line 1863
    :cond_18
    iget-object v1, v0, Ll/ܳۤۧ;->ۙ:Ll/ܳۧܽ;

    invoke-interface {v1}, Ll/ۨ֫ܽ;->֫()Landroid/graphics/Rect;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Rect;->left:I

    if-nez v1, :cond_19

    goto/16 :goto_10

    .line 1867
    :cond_19
    iget-object v1, v0, Ll/ܳۤۧ;->ۙ:Ll/ܳۧܽ;

    invoke-interface {v1}, Ll/ۨ֫ܽ;->֫()Landroid/graphics/Rect;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Rect;->top:I

    if-nez v1, :cond_1e

    .line 1868
    iget-object v1, v0, Ll/ܳۤۧ;->ۙ:Ll/ܳۧܽ;

    const/4 v2, 0x2

    new-array v3, v2, [I

    .line 1885
    invoke-virtual {v0, v3}, Landroid/view/View;->getLocationInWindow([I)V

    .line 1887
    new-instance v4, Landroid/graphics/Rect;

    const/4 v6, 0x0

    aget v6, v3, v6

    const/4 v9, 0x1

    aget v10, v3, v9

    .line 1888
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v12

    add-int/2addr v12, v6

    aget v13, v3, v9

    .line 1889
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v9

    add-int/2addr v9, v13

    invoke-direct {v4, v6, v10, v12, v9}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 1890
    new-instance v6, Landroid/graphics/Rect;

    invoke-interface {v1}, Ll/ۨ֫ܽ;->֫()Landroid/graphics/Rect;

    move-result-object v1

    invoke-direct {v6, v1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 1893
    invoke-virtual {v6, v4}, Landroid/graphics/Rect;->intersect(Landroid/graphics/Rect;)Z

    move-result v1

    .line 1895
    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    move-result v4

    if-nez v4, :cond_1a

    invoke-virtual {v6}, Landroid/graphics/Rect;->height()I

    move-result v4

    if-eqz v4, :cond_1b

    :cond_1a
    if-nez v1, :cond_1c

    :cond_1b
    const/4 v6, 0x0

    goto :goto_f

    :cond_1c
    const/4 v1, 0x0

    .line 1898
    aget v1, v3, v1

    neg-int v1, v1

    const/4 v4, 0x1

    aget v3, v3, v4

    neg-int v3, v3

    invoke-virtual {v6, v1, v3}, Landroid/graphics/Rect;->offset(II)V

    :goto_f
    if-nez v6, :cond_1d

    goto :goto_10

    .line 1872
    :cond_1d
    new-instance v1, Landroid/graphics/Rect;

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    .line 1873
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v9

    iget v10, v6, Landroid/graphics/Rect;->left:I

    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    move-result v9

    .line 1874
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v10

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v12

    sub-int/2addr v10, v12

    invoke-direct {v1, v3, v4, v9, v10}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 1875
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    sub-int/2addr v3, v4

    .line 1876
    new-instance v4, Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->right:I

    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    .line 1877
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v9

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v10

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v12

    sub-int/2addr v10, v12

    invoke-direct {v4, v6, v9, v3, v10}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 1878
    new-instance v3, Ljava/util/ArrayList;

    new-array v2, v2, [Landroid/graphics/Rect;

    const/4 v6, 0x0

    aput-object v1, v2, v6

    const/4 v1, 0x1

    aput-object v4, v2, v1

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_11

    :cond_1e
    :goto_10
    const/4 v3, 0x0

    :goto_11
    if-eqz v3, :cond_25

    if-nez v11, :cond_25

    const/4 v1, 0x0

    :goto_12
    if-ge v1, v7, :cond_25

    .line 746
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 748
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v4

    const/16 v6, 0x8

    if-ne v4, v6, :cond_1f

    goto/16 :goto_16

    .line 752
    :cond_1f
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/Rect;

    .line 753
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Ll/֫ۤۧ;

    .line 757
    iget v9, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v10, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v9, v10

    .line 758
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v10

    const/high16 v12, 0x40000000    # 2.0f

    invoke-static {v10, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v10

    .line 760
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v12

    const/high16 v13, -0x80000000

    invoke-static {v12, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v12

    .line 762
    invoke-virtual {v2, v12, v10}, Landroid/view/View;->measure(II)V

    .line 763
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidthAndState()I

    move-result v12

    const/high16 v13, 0x1000000

    and-int/2addr v12, v13

    const/4 v13, 0x1

    if-eq v12, v13, :cond_23

    .line 796
    instance-of v12, v2, Ll/ܿۤۧ;

    if-eqz v12, :cond_20

    .line 797
    move-object v13, v2

    check-cast v13, Ll/ܿۤۧ;

    const/4 v14, 0x0

    invoke-virtual {v13, v14}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v13

    sget v15, Ll/ܿ᩺;->֫:I

    .line 2378
    invoke-virtual {v13}, Landroid/view/View;->getMinimumWidth()I

    move-result v13

    goto :goto_13

    :cond_20
    const/4 v14, 0x0

    .line 799
    sget v13, Ll/ܿ᩺;->֫:I

    .line 2378
    invoke-virtual {v2}, Landroid/view/View;->getMinimumWidth()I

    move-result v13

    :goto_13
    if-eqz v13, :cond_22

    .line 765
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v13

    if-eqz v12, :cond_21

    .line 797
    move-object v12, v2

    check-cast v12, Ll/ܿۤۧ;

    invoke-virtual {v12, v14}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v12

    .line 2378
    invoke-virtual {v12}, Landroid/view/View;->getMinimumWidth()I

    move-result v12

    goto :goto_14

    :cond_21
    invoke-virtual {v2}, Landroid/view/View;->getMinimumWidth()I

    move-result v12

    :goto_14
    if-ge v13, v12, :cond_22

    goto :goto_15

    .line 776
    :cond_22
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v4

    const/high16 v6, 0x40000000    # 2.0f

    invoke-static {v4, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    .line 778
    invoke-virtual {v2, v4, v10}, Landroid/view/View;->measure(II)V

    goto :goto_16

    :cond_23
    :goto_15
    const/high16 v4, 0x40000000    # 2.0f

    sub-int v9, v8, v9

    .line 766
    invoke-static {v9, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    .line 768
    invoke-virtual {v2, v4, v10}, Landroid/view/View;->measure(II)V

    if-nez v1, :cond_24

    goto :goto_16

    :cond_24
    const/4 v4, 0x1

    .line 773
    iput-boolean v4, v6, Ll/֫ۤۧ;->ۧ:Z

    .line 774
    iput-object v2, v0, Ll/ܳۤۧ;->ۧ֫:Landroid/view/View;

    const/4 v11, 0x1

    :goto_16
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_12

    .line 784
    :cond_25
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    add-int/2addr v1, v5

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    add-int/2addr v2, v1

    move/from16 v1, v17

    .line 786
    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 787
    iput-boolean v11, v0, Ll/ܳۤۧ;->᩸:Z

    .line 789
    iget-object v1, v0, Ll/ܳۤۧ;->᩹:Ll/ܺۧ֫;

    invoke-virtual {v1}, Ll/ܺۧ֫;->᩷()I

    move-result v2

    if-eqz v2, :cond_26

    if-nez v11, :cond_26

    .line 791
    invoke-virtual {v1}, Ll/ܺۧ֫;->֫()V

    :cond_26
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1495
    instance-of v0, p1, Ll/ᩳۤۧ;

    if-nez v0, :cond_0

    .line 1496
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    .line 1500
    :cond_0
    check-cast p1, Ll/ᩳۤۧ;

    .line 1501
    invoke-virtual {p1}, Ll/۟֫֫;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 1503
    iget-boolean v0, p1, Ll/ᩳۤۧ;->᩸:Z

    if-eqz v0, :cond_1

    .line 1504
    invoke-virtual {p0}, Ll/ܳۤۧ;->ܳ()V

    goto :goto_0

    .line 1089
    :cond_1
    invoke-direct {p0}, Ll/ܳۤۧ;->֫()Z

    .line 1508
    :goto_0
    iget-boolean v0, p1, Ll/ᩳۤۧ;->᩸:Z

    iput-boolean v0, p0, Ll/ܳۤۧ;->ܰ:Z

    .line 1510
    iget p1, p1, Ll/ᩳۤۧ;->᩹:I

    .line 240
    iput p1, p0, Ll/ܳۤۧ;->ۛ:I

    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1484
    invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 1486
    new-instance v1, Ll/ᩳۤۧ;

    invoke-direct {v1, v0}, Ll/ᩳۤۧ;-><init>(Landroid/os/Parcelable;)V

    .line 1122
    iget-boolean v0, p0, Ll/ܳۤۧ;->᩸:Z

    if-eqz v0, :cond_0

    .line 1487
    invoke-virtual {p0}, Ll/ܳۤۧ;->ᩳ()Z

    move-result v0

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Ll/ܳۤۧ;->ܰ:Z

    :goto_0
    iput-boolean v0, v1, Ll/ᩳۤۧ;->᩸:Z

    .line 1488
    iget v0, p0, Ll/ܳۤۧ;->ۛ:I

    iput v0, v1, Ll/ᩳۤۧ;->᩹:I

    return-object v1
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 901
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->onSizeChanged(IIII)V

    if-eq p1, p3, :cond_0

    const/4 p1, 0x1

    .line 904
    iput-boolean p1, p0, Ll/ܳۤۧ;->᩶:Z

    :cond_0
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 978
    iget-boolean v0, p0, Ll/ܳۤۧ;->᩸:Z

    if-nez v0, :cond_0

    .line 979
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    .line 982
    :cond_0
    iget-object v0, p0, Ll/ܳۤۧ;->᩹:Ll/ܺۧ֫;

    invoke-virtual {v0, p1}, Ll/ܺۧ֫;->֫(Landroid/view/MotionEvent;)V

    .line 986
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v2, :cond_1

    goto :goto_0

    .line 996
    :cond_1
    iget-object v1, p0, Ll/ܳۤۧ;->ۧ֫:Landroid/view/View;

    invoke-virtual {p0, v1}, Ll/ܳۤۧ;->ܽ(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 997
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    .line 998
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    .line 999
    iget v3, p0, Ll/ܳۤۧ;->۬:F

    sub-float v3, v1, v3

    .line 1000
    iget v4, p0, Ll/ܳۤۧ;->۫:F

    sub-float v4, p1, v4

    .line 1001
    invoke-virtual {v0}, Ll/ܺۧ֫;->ۜ()I

    move-result v0

    mul-float v3, v3, v3

    mul-float v4, v4, v4

    add-float/2addr v4, v3

    mul-int v0, v0, v0

    int-to-float v0, v0

    cmpg-float v0, v4, v0

    if-gez v0, :cond_2

    .line 1002
    iget-object v0, p0, Ll/ܳۤۧ;->ۧ֫:Landroid/view/View;

    float-to-int v1, v1

    float-to-int p1, p1

    .line 1003
    invoke-static {v0, v1, p1}, Ll/ܺۧ֫;->ۧ(Landroid/view/View;II)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 1005
    invoke-direct {p0}, Ll/ܳۤۧ;->֫()Z

    :cond_2
    :goto_0
    return v2

    .line 988
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 989
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    .line 990
    iput v0, p0, Ll/ܳۤۧ;->۬:F

    .line 991
    iput p1, p0, Ll/ܳۤۧ;->۫:F

    return v2
.end method

.method public final removeView(Landroid/view/View;)V
    .locals 1

    .line 571
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Ll/ܿۤۧ;

    if-eqz v0, :cond_0

    .line 572
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    return-void

    .line 575
    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public final requestChildFocus(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 910
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->requestChildFocus(Landroid/view/View;Landroid/view/View;)V

    .line 911
    invoke-virtual {p0}, Landroid/view/View;->isInTouchMode()Z

    move-result p2

    if-nez p2, :cond_1

    iget-boolean p2, p0, Ll/ܳۤۧ;->᩸:Z

    if-nez p2, :cond_1

    .line 912
    iget-object p2, p0, Ll/ܳۤۧ;->ۧ֫:Landroid/view/View;

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Ll/ܳۤۧ;->ܰ:Z

    :cond_1
    return-void
.end method

.method public final ֫()V
    .locals 0

    .line 1089
    invoke-direct {p0}, Ll/ܳۤۧ;->֫()Z

    return-void
.end method

.method public final ֫(I)V
    .locals 4

    .line 1126
    iget-object v0, p0, Ll/ܳۤۧ;->ۧ֫:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    .line 1128
    iput p1, p0, Ll/ܳۤۧ;->۟:F

    return-void

    .line 1131
    :cond_0
    invoke-virtual {p0}, Ll/ܳۤۧ;->ܽ()Z

    move-result v0

    .line 1132
    iget-object v1, p0, Ll/ܳۤۧ;->ۧ֫:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Ll/֫ۤۧ;

    .line 1134
    iget-object v2, p0, Ll/ܳۤۧ;->ۧ֫:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    if-eqz v0, :cond_1

    .line 1135
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    sub-int/2addr v3, p1

    sub-int p1, v3, v2

    :cond_1
    if-eqz v0, :cond_2

    .line 1137
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    :goto_0
    if-eqz v0, :cond_3

    .line 1138
    iget v0, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    goto :goto_1

    :cond_3
    iget v0, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    :goto_1
    add-int/2addr v2, v0

    sub-int/2addr p1, v2

    int-to-float p1, p1

    .line 1141
    iget v0, p0, Ll/ܳۤۧ;->֫֫:I

    int-to-float v0, v0

    div-float/2addr p1, v0

    iput p1, p0, Ll/ܳۤۧ;->۟:F

    .line 1147
    iget-object p1, p0, Ll/ܳۤۧ;->ۧ֫:Landroid/view/View;

    .line 463
    iget-object v0, p0, Ll/ܳۤۧ;->ۨ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧۤۧ;

    .line 464
    invoke-interface {v1, p1}, Ll/ۧۤۧ;->֫(Landroid/view/View;)V

    goto :goto_2

    :cond_4
    return-void
.end method

.method public final ֫(Landroid/view/View;)V
    .locals 2

    .line 476
    iget-object v0, p0, Ll/ܳۤۧ;->ۨ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧۤۧ;

    .line 477
    invoke-interface {v1, p1}, Ll/ۧۤۧ;->ܽ(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    const/16 p1, 0x20

    .line 479
    invoke-virtual {p0, p1}, Landroid/view/View;->sendAccessibilityEvent(I)V

    return-void
.end method

.method public final ֫(Ll/ۧۤۧ;)V
    .locals 1

    .line 448
    iget-object v0, p0, Ll/ܳۤۧ;->ۨ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(F)Z
    .locals 5

    .line 1264
    iget-boolean v0, p0, Ll/ܳۤۧ;->᩸:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_2

    .line 1269
    :cond_0
    invoke-virtual {p0}, Ll/ܳۤۧ;->ܽ()Z

    move-result v0

    .line 1270
    iget-object v2, p0, Ll/ܳۤۧ;->ۧ֫:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Ll/֫ۤۧ;

    if-eqz v0, :cond_1

    .line 1274
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    iget v2, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v0, v2

    .line 1275
    iget-object v2, p0, Ll/ܳۤۧ;->ۧ֫:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    .line 1276
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    int-to-float v0, v0

    iget v4, p0, Ll/ܳۤۧ;->֫֫:I

    int-to-float v4, v4

    mul-float p1, p1, v4

    add-float/2addr p1, v0

    int-to-float v0, v2

    add-float/2addr p1, v0

    sub-float/2addr v3, p1

    float-to-int p1, v3

    goto :goto_0

    .line 1278
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    iget v2, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v0, v2

    int-to-float v0, v0

    .line 1279
    iget v2, p0, Ll/ܳۤۧ;->֫֫:I

    int-to-float v2, v2

    mul-float p1, p1, v2

    add-float/2addr p1, v0

    float-to-int p1, p1

    .line 1282
    :goto_0
    iget-object v0, p0, Ll/ܳۤۧ;->ۧ֫:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v2

    iget-object v3, p0, Ll/ܳۤۧ;->᩹:Ll/ܺۧ֫;

    invoke-virtual {v3, v0, p1, v2}, Ll/ܺۧ֫;->֫(Landroid/view/View;II)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 529
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    const/4 v0, 0x0

    :goto_1
    if-ge v0, p1, :cond_3

    .line 530
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 531
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v3

    const/4 v4, 0x4

    if-ne v3, v4, :cond_2

    .line 532
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 1284
    :cond_3
    sget p1, Ll/ܿ᩺;->֫:I

    .line 1323
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    const/4 p1, 0x1

    return p1

    :cond_4
    :goto_2
    return v1
.end method

.method public final ۧ()I
    .locals 1

    .line 250
    iget v0, p0, Ll/ܳۤۧ;->ۛ:I

    return v0
.end method

.method public final ۧ(Landroid/view/View;)V
    .locals 2

    .line 469
    iget-object v0, p0, Ll/ܳۤۧ;->ۨ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧۤۧ;

    .line 470
    invoke-interface {v1, p1}, Ll/ۧۤۧ;->ۧ(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    const/16 p1, 0x20

    .line 472
    invoke-virtual {p0, p1}, Landroid/view/View;->sendAccessibilityEvent(I)V

    return-void
.end method

.method public final ܳ()V
    .locals 2

    .line 1028
    iget-boolean v0, p0, Ll/ܳۤۧ;->᩸:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 1029
    iput-boolean v1, p0, Ll/ܳۤۧ;->ܰ:Z

    .line 1031
    :cond_0
    iget-boolean v0, p0, Ll/ܳۤۧ;->᩶:Z

    if-nez v0, :cond_2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ll/ܳۤۧ;->֫(F)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    return-void

    .line 1032
    :cond_2
    :goto_0
    iput-boolean v1, p0, Ll/ܳۤۧ;->ܰ:Z

    return-void
.end method

.method public final ܽ()Z
    .locals 2

    .line 1851
    sget v0, Ll/ܿ᩺;->֫:I

    .line 1977
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ(Landroid/view/View;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 1456
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Ll/֫ۤۧ;

    .line 1457
    iget-boolean v1, p0, Ll/ܳۤۧ;->᩸:Z

    if-eqz v1, :cond_1

    iget-boolean p1, p1, Ll/֫ۤۧ;->֫:Z

    if-eqz p1, :cond_1

    iget p1, p0, Ll/ܳۤۧ;->۟:F

    const/4 v1, 0x0

    cmpl-float p1, p1, v1

    if-lez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 1122
    iget-boolean v0, p0, Ll/ܳۤۧ;->᩸:Z

    return v0
.end method

.method public final ᩳ(Landroid/view/View;)V
    .locals 17

    move-object/from16 v0, p1

    .line 483
    invoke-virtual/range {p0 .. p0}, Ll/ܳۤۧ;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 484
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    sub-int/2addr v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    :goto_0
    if-eqz v1, :cond_1

    .line 485
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    goto :goto_1

    :cond_1
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    sub-int/2addr v3, v4

    .line 486
    :goto_1
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    .line 487
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v6

    sub-int/2addr v5, v6

    if-eqz v0, :cond_2

    .line 540
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->isOpaque()Z

    move-result v6

    if-eqz v6, :cond_2

    .line 493
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getLeft()I

    move-result v6

    .line 494
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getRight()I

    move-result v7

    .line 495
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getTop()I

    move-result v8

    .line 496
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getBottom()I

    move-result v9

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 501
    :goto_2
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v10

    const/4 v11, 0x0

    :goto_3
    move-object/from16 v12, p0

    if-ge v11, v10, :cond_8

    .line 502
    invoke-virtual {v12, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v13

    if-ne v13, v0, :cond_3

    goto :goto_8

    .line 507
    :cond_3
    invoke-virtual {v13}, Landroid/view/View;->getVisibility()I

    move-result v14

    const/16 v15, 0x8

    if-ne v14, v15, :cond_4

    move/from16 v16, v1

    goto :goto_7

    :cond_4
    if-eqz v1, :cond_5

    move v14, v3

    goto :goto_4

    :cond_5
    move v14, v2

    .line 512
    :goto_4
    invoke-virtual {v13}, Landroid/view/View;->getLeft()I

    move-result v15

    .line 511
    invoke-static {v14, v15}, Ljava/lang/Math;->max(II)I

    move-result v14

    .line 513
    invoke-virtual {v13}, Landroid/view/View;->getTop()I

    move-result v15

    invoke-static {v4, v15}, Ljava/lang/Math;->max(II)I

    move-result v15

    if-eqz v1, :cond_6

    move v0, v2

    goto :goto_5

    :cond_6
    move v0, v3

    :goto_5
    move/from16 v16, v1

    .line 515
    invoke-virtual {v13}, Landroid/view/View;->getRight()I

    move-result v1

    .line 514
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 516
    invoke-virtual {v13}, Landroid/view/View;->getBottom()I

    move-result v1

    invoke-static {v5, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    if-lt v14, v6, :cond_7

    if-lt v15, v8, :cond_7

    if-gt v0, v7, :cond_7

    if-gt v1, v9, :cond_7

    const/4 v0, 0x4

    goto :goto_6

    :cond_7
    const/4 v0, 0x0

    .line 524
    :goto_6
    invoke-virtual {v13, v0}, Landroid/view/View;->setVisibility(I)V

    :goto_7
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v0, p1

    move/from16 v1, v16

    goto :goto_3

    :cond_8
    :goto_8
    return-void
.end method

.method public final ᩳ()Z
    .locals 2

    .line 1100
    iget-boolean v0, p0, Ll/ܳۤۧ;->᩸:Z

    if-eqz v0, :cond_1

    iget v0, p0, Ll/ܳۤۧ;->۟:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ᩻()V
    .locals 1

    const/4 v0, 0x3

    .line 240
    iput v0, p0, Ll/ܳۤۧ;->ۛ:I

    return-void
.end method
