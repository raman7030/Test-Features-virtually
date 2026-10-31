.class public Ll/᩶ۢۡ;
.super Landroid/widget/FrameLayout;
.source "M5S8"


# instance fields
.field public ֫֫:I

.field public ۗ:Z

.field public ۙ:Z

.field public ۛ:I

.field public final ۟:Landroid/graphics/Rect;

.field public ۤ:J

.field public ۧ֫:Landroid/view/VelocityTracker;

.field public ۨ:I

.field public ۫:F

.field public ۬:F

.field public ܰ:Z

.field public ᩶:Z

.field public ᩸:I

.field public ᩹:Landroid/view/View;

.field public ᩺:Landroid/widget/OverScroller;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 104
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 29
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Ll/᩶ۢۡ;->۟:Landroid/graphics/Rect;

    const/4 p1, 0x1

    .line 49
    iput-boolean p1, p0, Ll/᩶ۢۡ;->ۗ:Z

    const/4 p2, 0x0

    .line 56
    iput-object p2, p0, Ll/᩶ۢۡ;->᩹:Landroid/view/View;

    const/4 p2, 0x0

    .line 63
    iput-boolean p2, p0, Ll/᩶ۢۡ;->ۙ:Z

    .line 79
    iput-boolean p1, p0, Ll/᩶ۢۡ;->ܰ:Z

    const/4 v0, -0x1

    .line 89
    iput v0, p0, Ll/᩶ۢۡ;->᩸:I

    .line 97
    iput-boolean p1, p0, Ll/᩶ۢۡ;->᩶:Z

    .line 173
    new-instance v0, Landroid/widget/OverScroller;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Ll/᩶ۢۡ;->᩺:Landroid/widget/OverScroller;

    .line 174
    invoke-virtual {p0, p1}, Landroid/view/View;->setFocusable(Z)V

    const/high16 p1, 0x40000

    .line 175
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 176
    invoke-virtual {p0, p2}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 178
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    .line 179
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p2

    iput p2, p0, Ll/᩶ۢۡ;->֫֫:I

    .line 180
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result p2

    iput p2, p0, Ll/᩶ۢۡ;->ۨ:I

    .line 181
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result p1

    iput p1, p0, Ll/᩶ۢۡ;->ۛ:I

    return-void
.end method

.method public static ֫(III)I
    .locals 1

    if-ge p1, p2, :cond_2

    if-gez p0, :cond_0

    goto :goto_0

    :cond_0
    add-int v0, p1, p0

    if-le v0, p2, :cond_1

    sub-int/2addr p2, p1

    return p2

    :cond_1
    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method private ֫(Landroid/view/MotionEvent;)V
    .locals 3

    .line 570
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const v1, 0xff00

    and-int/2addr v0, v1

    shr-int/lit8 v0, v0, 0x8

    .line 571
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    .line 572
    iget v2, p0, Ll/᩶ۢۡ;->᩸:I

    if-ne v1, v2, :cond_1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 576
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    iput v1, p0, Ll/᩶ۢۡ;->۬:F

    .line 577
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    iput v1, p0, Ll/᩶ۢۡ;->۫:F

    .line 578
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Ll/᩶ۢۡ;->᩸:I

    .line 579
    iget-object p1, p0, Ll/᩶ۢۡ;->ۧ֫:Landroid/view/VelocityTracker;

    if-eqz p1, :cond_1

    .line 580
    invoke-virtual {p1}, Landroid/view/VelocityTracker;->clear()V

    :cond_1
    return-void
.end method

.method private ֫(ILandroid/view/View;)Z
    .locals 2

    .line 993
    iget-object v0, p0, Ll/᩶ۢۡ;->۟:Landroid/graphics/Rect;

    invoke-virtual {p2, v0}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 994
    invoke-virtual {p0, p2, v0}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 996
    iget p2, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr p2, p1

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v1

    if-lt p2, v1, :cond_0

    iget p2, v0, Landroid/graphics/Rect;->left:I

    sub-int/2addr p2, p1

    .line 997
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    add-int/2addr v0, p1

    if-gt p2, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private ֫(Landroid/view/View;II)Z
    .locals 2

    .line 985
    iget-object v0, p0, Ll/᩶ۢۡ;->۟:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 986
    invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 988
    iget p1, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr p1, p2

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v1

    if-lt p1, v1, :cond_0

    iget p1, v0, Landroid/graphics/Rect;->top:I

    sub-int/2addr p1, p2

    .line 989
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p2

    add-int/2addr p2, p3

    if-gt p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static ֫(Landroid/view/View;Ll/᩶ۢۡ;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    goto :goto_0

    .line 1452
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    .line 1453
    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    check-cast p0, Landroid/view/View;

    .line 1454
    invoke-static {p0, p1}, Ll/᩶ۢۡ;->֫(Landroid/view/View;Ll/᩶ۢۡ;)Z

    move-result p0

    if-eqz p0, :cond_1

    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method private ܳ(I)V
    .locals 2

    if-eqz p1, :cond_1

    .line 1007
    iget-boolean v0, p0, Ll/᩶ۢۡ;->ܰ:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 1008
    invoke-virtual {p0, v1, p1}, Ll/᩶ۢۡ;->֫(II)V

    return-void

    .line 1010
    :cond_0
    invoke-virtual {p0, v1, p1}, Landroid/view/View;->scrollBy(II)V

    :cond_1
    return-void
.end method

.method private ܿ(I)V
    .locals 2

    if-eqz p1, :cond_1

    .line 1015
    iget-boolean v0, p0, Ll/᩶ۢۡ;->ܰ:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 1016
    invoke-virtual {p0, p1, v1}, Ll/᩶ۢۡ;->֫(II)V

    return-void

    .line 1018
    :cond_0
    invoke-virtual {p0, p1, v1}, Landroid/view/View;->scrollBy(II)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final addView(Landroid/view/View;)V
    .locals 1

    .line 186
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-gtz v0, :cond_0

    .line 190
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    return-void

    .line 187
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "ScrollView can host only one direct child"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final addView(Landroid/view/View;I)V
    .locals 1

    .line 195
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-gtz v0, :cond_0

    .line 199
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;I)V

    return-void

    .line 196
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "ScrollView can host only one direct child"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 213
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-gtz v0, :cond_0

    .line 217
    invoke-super {p0, p1, p2, p3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void

    .line 214
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "ScrollView can host only one direct child"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 204
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-gtz v0, :cond_0

    .line 208
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    .line 205
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "ScrollView can host only one direct child"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final computeHorizontalScrollOffset()I
    .locals 2

    const/4 v0, 0x0

    .line 1102
    invoke-super {p0}, Landroid/widget/FrameLayout;->computeHorizontalScrollOffset()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public final computeHorizontalScrollRange()I
    .locals 3

    .line 1086
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    .line 1087
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    sub-int/2addr v1, v2

    .line 1088
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    .line 1092
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v0

    return v0
.end method

.method public final computeScroll()V
    .locals 5

    .line 1137
    iget-object v0, p0, Ll/᩶ۢۡ;->᩺:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1158
    iget-object v0, p0, Ll/᩶ۢۡ;->᩺:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrX()I

    move-result v0

    .line 1159
    iget-object v1, p0, Ll/᩶ۢۡ;->᩺:Landroid/widget/OverScroller;

    invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v1

    .line 1161
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-lez v2, :cond_0

    const/4 v2, 0x0

    .line 1162
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 1163
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    sub-int/2addr v3, v4

    .line 1164
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v4

    .line 1163
    invoke-static {v0, v3, v4}, Ll/᩶ۢۡ;->֫(III)I

    move-result v0

    .line 1166
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    sub-int/2addr v3, v4

    .line 1167
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    .line 1165
    invoke-static {v1, v3, v2}, Ll/᩶ۢۡ;->֫(III)I

    move-result v1

    .line 1168
    invoke-super {p0, v0, v1}, Landroid/widget/FrameLayout;->scrollTo(II)V

    .line 1170
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->awakenScrollBars()Z

    .line 1173
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    :cond_1
    return-void
.end method

.method public final computeVerticalScrollOffset()I
    .locals 2

    const/4 v0, 0x0

    .line 1097
    invoke-super {p0}, Landroid/widget/FrameLayout;->computeVerticalScrollOffset()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public final computeVerticalScrollRange()I
    .locals 3

    .line 1075
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    .line 1076
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    .line 1077
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    .line 1081
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    return v0
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 4

    .line 320
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 332
    iget-object v0, p0, Ll/᩶ۢۡ;->۟:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    .line 336
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_4

    .line 337
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 234
    :pswitch_0
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 236
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    .line 237
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    add-int/2addr v3, v0

    .line 238
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    add-int/2addr v0, v3

    if-ge v2, v0, :cond_4

    .line 347
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isAltPressed()Z

    move-result p1

    const/16 v0, 0x42

    if-nez p1, :cond_0

    .line 348
    invoke-virtual {p0, v0}, Ll/᩶ۢۡ;->֫(I)Z

    move-result p1

    goto/16 :goto_1

    .line 350
    :cond_0
    invoke-virtual {p0, v0}, Ll/᩶ۢۡ;->ܽ(I)Z

    move-result p1

    goto/16 :goto_1

    .line 234
    :pswitch_1
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 236
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    .line 237
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    add-int/2addr v3, v0

    .line 238
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    add-int/2addr v0, v3

    if-ge v2, v0, :cond_4

    .line 340
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isAltPressed()Z

    move-result p1

    const/16 v0, 0x11

    if-nez p1, :cond_1

    .line 341
    invoke-virtual {p0, v0}, Ll/᩶ۢۡ;->֫(I)Z

    move-result p1

    goto :goto_1

    .line 343
    :cond_1
    invoke-virtual {p0, v0}, Ll/᩶ۢۡ;->ܽ(I)Z

    move-result p1

    goto :goto_1

    .line 224
    :pswitch_2
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 226
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    .line 227
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    add-int/2addr v3, v0

    .line 228
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    add-int/2addr v0, v3

    if-ge v2, v0, :cond_4

    .line 361
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isAltPressed()Z

    move-result p1

    const/16 v0, 0x82

    if-nez p1, :cond_2

    .line 362
    invoke-virtual {p0, v0}, Ll/᩶ۢۡ;->ۧ(I)Z

    move-result p1

    goto :goto_1

    .line 364
    :cond_2
    invoke-virtual {p0, v0}, Ll/᩶ۢۡ;->ᩳ(I)Z

    move-result p1

    goto :goto_1

    .line 224
    :pswitch_3
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 226
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    .line 227
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    add-int/2addr v3, v0

    .line 228
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    add-int/2addr v0, v3

    if-ge v2, v0, :cond_4

    .line 354
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isAltPressed()Z

    move-result p1

    const/16 v0, 0x21

    if-nez p1, :cond_3

    .line 355
    invoke-virtual {p0, v0}, Ll/᩶ۢۡ;->ۧ(I)Z

    move-result p1

    goto :goto_1

    .line 357
    :cond_3
    invoke-virtual {p0, v0}, Ll/᩶ۢۡ;->ᩳ(I)Z

    move-result p1

    goto :goto_1

    :cond_4
    :goto_0
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_5

    goto :goto_2

    :cond_5
    return v1

    :cond_6
    :goto_2
    const/4 p1, 0x1

    return p1

    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getBottomFadingEdgeStrength()F
    .locals 4

    .line 148
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 151
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getVerticalFadingEdgeLength()I

    move-result v0

    .line 152
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    const/4 v2, 0x0

    .line 153
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v3

    sub-int/2addr v2, v3

    sub-int/2addr v2, v1

    if-ge v2, v0, :cond_1

    int-to-float v1, v2

    int-to-float v0, v0

    div-float/2addr v1, v0

    return v1

    :cond_1
    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public final getLeftFadingEdgeStrength()F
    .locals 2

    .line 122
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 125
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getHorizontalFadingEdgeLength()I

    move-result v0

    .line 126
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v1

    if-ge v1, v0, :cond_1

    .line 127
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v1

    int-to-float v1, v1

    int-to-float v0, v0

    div-float/2addr v1, v0

    return v1

    :cond_1
    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public final getRightFadingEdgeStrength()F
    .locals 4

    .line 134
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 137
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getHorizontalFadingEdgeLength()I

    move-result v0

    .line 138
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    const/4 v2, 0x0

    .line 139
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v3

    sub-int/2addr v2, v3

    sub-int/2addr v2, v1

    if-ge v2, v0, :cond_1

    int-to-float v1, v2

    int-to-float v0, v0

    div-float/2addr v1, v0

    return v1

    :cond_1
    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public final getTopFadingEdgeStrength()F
    .locals 2

    .line 110
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 113
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getVerticalFadingEdgeLength()I

    move-result v0

    .line 114
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v1

    if-ge v1, v0, :cond_1

    .line 115
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v1

    int-to-float v1, v1

    int-to-float v0, v0

    div-float/2addr v1, v0

    return v1

    :cond_1
    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public final measureChild(Landroid/view/View;II)V
    .locals 0

    const/4 p2, 0x0

    .line 1111
    invoke-static {p2, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p3

    .line 1114
    invoke-static {p2, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 1117
    invoke-virtual {p1, p3, p2}, Landroid/view/View;->measure(II)V

    return-void
.end method

.method public final measureChildWithMargins(Landroid/view/View;IIII)V
    .locals 0

    .line 1125
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 1127
    iget p3, p2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget p4, p2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr p3, p4

    const/4 p4, 0x0

    invoke-static {p3, p4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p3

    .line 1129
    iget p5, p2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget p2, p2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr p5, p2

    invoke-static {p5, p4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 1132
    invoke-virtual {p1, p3, p2}, Landroid/view/View;->measure(II)V

    return-void
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 395
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    .line 396
    iget-boolean v3, p0, Ll/᩶ۢۡ;->ۙ:Z

    if-eqz v3, :cond_0

    return v1

    :cond_0
    and-int/lit16 v0, v0, 0xff

    const/4 v3, 0x0

    if-eqz v0, :cond_6

    const/4 v4, -0x1

    if-eq v0, v1, :cond_5

    if-eq v0, v2, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_5

    const/4 v1, 0x6

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 465
    :cond_1
    invoke-direct {p0, p1}, Ll/᩶ۢۡ;->֫(Landroid/view/MotionEvent;)V

    goto :goto_0

    .line 411
    :cond_2
    iget v0, p0, Ll/᩶ۢۡ;->᩸:I

    if-ne v0, v4, :cond_3

    goto :goto_0

    .line 417
    :cond_3
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    .line 418
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v2

    .line 419
    iget v3, p0, Ll/᩶ۢۡ;->۫:F

    sub-float v3, v2, v3

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    float-to-int v3, v3

    .line 420
    iget v4, p0, Ll/᩶ۢۡ;->֫֫:I

    if-le v3, v4, :cond_4

    .line 421
    iput-boolean v1, p0, Ll/᩶ۢۡ;->ۙ:Z

    .line 422
    iput v2, p0, Ll/᩶ۢۡ;->۫:F

    .line 424
    :cond_4
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result p1

    .line 425
    iget v0, p0, Ll/᩶ۢۡ;->۬:F

    sub-float v0, p1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-int v0, v0

    .line 426
    iget v2, p0, Ll/᩶ۢۡ;->֫֫:I

    if-le v0, v2, :cond_7

    .line 427
    iput-boolean v1, p0, Ll/᩶ۢۡ;->ۙ:Z

    .line 428
    iput p1, p0, Ll/᩶ۢۡ;->۬:F

    goto :goto_0

    .line 461
    :cond_5
    iput-boolean v3, p0, Ll/᩶ۢۡ;->ۙ:Z

    .line 462
    iput v4, p0, Ll/᩶ۢۡ;->᩸:I

    goto :goto_0

    .line 434
    :cond_6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 435
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    .line 445
    iput v2, p0, Ll/᩶ۢۡ;->۫:F

    .line 446
    iput v0, p0, Ll/᩶ۢۡ;->۬:F

    .line 447
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Ll/᩶ۢۡ;->᩸:I

    .line 454
    iget-object p1, p0, Ll/᩶ۢۡ;->᩺:Landroid/widget/OverScroller;

    invoke-virtual {p1}, Landroid/widget/OverScroller;->isFinished()Z

    move-result p1

    xor-int/2addr p1, v1

    iput-boolean p1, p0, Ll/᩶ۢۡ;->ۙ:Z

    .line 473
    :cond_7
    :goto_0
    iget-boolean p1, p0, Ll/᩶ۢۡ;->ۙ:Z

    return p1
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1405
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    const/4 p1, 0x0

    .line 1406
    iput-boolean p1, p0, Ll/᩶ۢۡ;->ۗ:Z

    .line 1408
    iget-object p1, p0, Ll/᩶ۢۡ;->᩹:Landroid/view/View;

    if-eqz p1, :cond_1

    .line 1409
    invoke-static {p1, p0}, Ll/᩶ۢۡ;->֫(Landroid/view/View;Ll/᩶ۢۡ;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 1410
    iget-object p1, p0, Ll/᩶ۢۡ;->᩹:Landroid/view/View;

    .line 1183
    iget-object p2, p0, Ll/᩶ۢۡ;->۟:Landroid/graphics/Rect;

    invoke-virtual {p1, p2}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 1186
    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 1188
    invoke-virtual {p0, p2}, Ll/᩶ۢۡ;->ۧ(Landroid/graphics/Rect;)I

    move-result p1

    .line 1189
    invoke-virtual {p0, p2}, Ll/᩶ۢۡ;->֫(Landroid/graphics/Rect;)I

    move-result p2

    if-nez p2, :cond_0

    if-eqz p1, :cond_1

    .line 1192
    :cond_0
    invoke-virtual {p0, p2, p1}, Landroid/view/View;->scrollBy(II)V

    :cond_1
    const/4 p1, 0x0

    .line 1411
    iput-object p1, p0, Ll/᩶ۢۡ;->᩹:Landroid/view/View;

    .line 1414
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Ll/᩶ۢۡ;->scrollTo(II)V

    return-void
.end method

.method public final onMeasure(II)V
    .locals 0

    .line 285
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    return-void
.end method

.method public final onRequestFocusInDescendants(ILandroid/graphics/Rect;)Z
    .locals 3

    const/16 v0, 0x21

    const/4 v1, 0x0

    if-eq p1, v0, :cond_0

    const/16 v0, 0x82

    if-eq p1, v0, :cond_0

    const/16 v0, 0x11

    if-eq p1, v0, :cond_0

    const/16 v0, 0x42

    if-eq p1, v0, :cond_0

    return v1

    :cond_0
    if-nez p2, :cond_1

    .line 1373
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v2, p1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 1374
    :cond_1
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v0

    invoke-virtual {v0, p0, p2, p1}, Landroid/view/FocusFinder;->findNextFocusFromRect(Landroid/view/ViewGroup;Landroid/graphics/Rect;I)Landroid/view/View;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_2

    return v1

    .line 1384
    :cond_2
    invoke-virtual {v0, p1, p2}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result p1

    return p1
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 1419
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->onSizeChanged(IIII)V

    .line 1421
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_2

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 1428
    invoke-direct {p0, p1, p2, p4}, Ll/᩶ۢۡ;->֫(Landroid/view/View;II)Z

    move-result p2

    iget-object p3, p0, Ll/᩶ۢۡ;->۟:Landroid/graphics/Rect;

    if-eqz p2, :cond_1

    .line 1429
    invoke-virtual {p1, p3}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 1430
    invoke-virtual {p0, p1, p3}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 1431
    invoke-virtual {p0, p3}, Ll/᩶ۢۡ;->ۧ(Landroid/graphics/Rect;)I

    move-result p2

    .line 1432
    invoke-direct {p0, p2}, Ll/᩶ۢۡ;->ܳ(I)V

    .line 1435
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result p4

    sub-int/2addr p2, p4

    .line 1436
    invoke-direct {p0, p2, p1}, Ll/᩶ۢۡ;->֫(ILandroid/view/View;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 1437
    invoke-virtual {p1, p3}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 1438
    invoke-virtual {p0, p1, p3}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 1439
    invoke-virtual {p0, p3}, Ll/᩶ۢۡ;->֫(Landroid/graphics/Rect;)I

    move-result p1

    .line 1440
    invoke-direct {p0, p1}, Ll/᩶ۢۡ;->ܿ(I)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 480
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEdgeFlags()I

    move-result v2

    if-eqz v2, :cond_0

    return v3

    .line 486
    :cond_0
    iget-object v2, v0, Ll/᩶ۢۡ;->ۧ֫:Landroid/view/VelocityTracker;

    if-nez v2, :cond_1

    .line 487
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v2

    iput-object v2, v0, Ll/᩶ۢۡ;->ۧ֫:Landroid/view/VelocityTracker;

    .line 488
    :cond_1
    iget-object v2, v0, Ll/᩶ۢۡ;->ۧ֫:Landroid/view/VelocityTracker;

    invoke-virtual {v2, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 490
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    and-int/lit16 v2, v2, 0xff

    const/4 v4, 0x1

    if-eqz v2, :cond_9

    const/4 v5, 0x0

    const/4 v6, -0x1

    if-eq v2, v4, :cond_5

    const/4 v7, 0x2

    if-eq v2, v7, :cond_4

    const/4 v7, 0x3

    if-eq v2, v7, :cond_3

    const/4 v3, 0x6

    if-eq v2, v3, :cond_2

    goto/16 :goto_0

    .line 563
    :cond_2
    invoke-direct/range {p0 .. p1}, Ll/᩶ۢۡ;->֫(Landroid/view/MotionEvent;)V

    return v4

    .line 553
    :cond_3
    iget-boolean v1, v0, Ll/᩶ۢۡ;->ۙ:Z

    if-eqz v1, :cond_8

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-lez v1, :cond_8

    .line 554
    iput v6, v0, Ll/᩶ۢۡ;->᩸:I

    .line 555
    iput-boolean v3, v0, Ll/᩶ۢۡ;->ۙ:Z

    .line 556
    iget-object v1, v0, Ll/᩶ۢۡ;->ۧ֫:Landroid/view/VelocityTracker;

    if-eqz v1, :cond_8

    .line 557
    invoke-virtual {v1}, Landroid/view/VelocityTracker;->recycle()V

    .line 558
    iput-object v5, v0, Ll/᩶ۢۡ;->ۧ֫:Landroid/view/VelocityTracker;

    return v4

    .line 514
    :cond_4
    iget-boolean v2, v0, Ll/᩶ۢۡ;->ۙ:Z

    if-eqz v2, :cond_8

    .line 516
    iget v2, v0, Ll/᩶ۢۡ;->᩸:I

    .line 517
    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v2

    .line 518
    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result v3

    .line 519
    iget v5, v0, Ll/᩶ۢۡ;->۫:F

    sub-float/2addr v5, v3

    float-to-int v5, v5

    .line 520
    iput v3, v0, Ll/᩶ۢۡ;->۫:F

    .line 522
    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    .line 523
    iget v2, v0, Ll/᩶ۢۡ;->۬:F

    sub-float/2addr v2, v1

    float-to-int v2, v2

    .line 524
    iput v1, v0, Ll/᩶ۢۡ;->۬:F

    .line 525
    invoke-virtual {v0, v2, v5}, Landroid/view/View;->scrollBy(II)V

    return v4

    .line 529
    :cond_5
    iget-boolean v1, v0, Ll/᩶ۢۡ;->ۙ:Z

    if-eqz v1, :cond_8

    .line 530
    iget-boolean v1, v0, Ll/᩶ۢۡ;->᩶:Z

    if-eqz v1, :cond_7

    .line 531
    iget-object v1, v0, Ll/᩶ۢۡ;->ۧ֫:Landroid/view/VelocityTracker;

    .line 532
    iget v2, v0, Ll/᩶ۢۡ;->ۛ:I

    int-to-float v2, v2

    const/16 v7, 0x3e8

    invoke-virtual {v1, v7, v2}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 534
    invoke-virtual {v1}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result v2

    float-to-int v2, v2

    .line 535
    invoke-virtual {v1}, Landroid/view/VelocityTracker;->getYVelocity()F

    move-result v1

    float-to-int v1, v1

    .line 537
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v7

    if-lez v7, :cond_7

    .line 538
    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v7

    if-gt v7, v2, :cond_6

    .line 539
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v7

    iget v8, v0, Ll/᩶ۢۡ;->ۨ:I

    if-le v7, v8, :cond_7

    :cond_6
    neg-int v12, v2

    neg-int v13, v1

    .line 1465
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-lez v1, :cond_7

    .line 1466
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    sub-int/2addr v1, v2

    .line 1467
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    .line 1469
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v8

    sub-int/2addr v7, v8

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v8

    sub-int/2addr v7, v8

    .line 1470
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v8}, Landroid/view/View;->getHeight()I

    move-result v8

    .line 1472
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollX()I

    move-result v10

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollY()I

    move-result v11

    sub-int/2addr v2, v1

    .line 1473
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v15

    sub-int/2addr v8, v7

    .line 1474
    invoke-static {v3, v8}, Ljava/lang/Math;->max(II)I

    move-result v17

    .line 1472
    iget-object v9, v0, Ll/᩶ۢۡ;->᩺:Landroid/widget/OverScroller;

    const/4 v14, 0x0

    const/16 v16, 0x0

    invoke-virtual/range {v9 .. v17}, Landroid/widget/OverScroller;->fling(IIIIIIII)V

    .line 1492
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->invalidate()V

    .line 543
    :cond_7
    iput v6, v0, Ll/᩶ۢۡ;->᩸:I

    .line 544
    iput-boolean v3, v0, Ll/᩶ۢۡ;->ۙ:Z

    .line 546
    iget-object v1, v0, Ll/᩶ۢۡ;->ۧ֫:Landroid/view/VelocityTracker;

    if-eqz v1, :cond_8

    .line 547
    invoke-virtual {v1}, Landroid/view/VelocityTracker;->recycle()V

    .line 548
    iput-object v5, v0, Ll/᩶ۢۡ;->ۧ֫:Landroid/view/VelocityTracker;

    :cond_8
    :goto_0
    return v4

    .line 494
    :cond_9
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    .line 495
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    .line 496
    iput-boolean v4, v0, Ll/᩶ۢۡ;->ۙ:Z

    .line 504
    iget-object v6, v0, Ll/᩶ۢۡ;->᩺:Landroid/widget/OverScroller;

    invoke-virtual {v6}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v6

    if-nez v6, :cond_a

    .line 505
    iget-object v6, v0, Ll/᩶ۢۡ;->᩺:Landroid/widget/OverScroller;

    invoke-virtual {v6}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 508
    :cond_a
    iput v5, v0, Ll/᩶ۢۡ;->۫:F

    .line 509
    iput v2, v0, Ll/᩶ۢۡ;->۬:F

    .line 510
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    iput v1, v0, Ll/᩶ۢۡ;->᩸:I

    return v4
.end method

.method public final requestChildFocus(Landroid/view/View;Landroid/view/View;)V
    .locals 2

    .line 1340
    iget-boolean v0, p0, Ll/᩶ۢۡ;->ۗ:Z

    if-nez v0, :cond_1

    .line 1183
    iget-object v0, p0, Ll/᩶ۢۡ;->۟:Landroid/graphics/Rect;

    invoke-virtual {p2, v0}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 1186
    invoke-virtual {p0, p2, v0}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 1188
    invoke-virtual {p0, v0}, Ll/᩶ۢۡ;->ۧ(Landroid/graphics/Rect;)I

    move-result v1

    .line 1189
    invoke-virtual {p0, v0}, Ll/᩶ۢۡ;->֫(Landroid/graphics/Rect;)I

    move-result v0

    if-nez v0, :cond_0

    if-eqz v1, :cond_2

    .line 1192
    :cond_0
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->scrollBy(II)V

    goto :goto_0

    .line 1345
    :cond_1
    iput-object p2, p0, Ll/᩶ۢۡ;->᩹:Landroid/view/View;

    .line 1346
    :cond_2
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->requestChildFocus(Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method public final requestChildRectangleOnScreen(Landroid/view/View;Landroid/graphics/Rect;Z)Z
    .locals 2

    .line 1391
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v1

    .line 1392
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result p1

    sub-int/2addr v1, p1

    .line 1391
    invoke-virtual {p2, v0, v1}, Landroid/graphics/Rect;->offset(II)V

    .line 1204
    invoke-virtual {p0, p2}, Ll/᩶ۢۡ;->ۧ(Landroid/graphics/Rect;)I

    move-result p1

    .line 1205
    invoke-virtual {p0, p2}, Ll/᩶ۢۡ;->֫(Landroid/graphics/Rect;)I

    move-result p2

    if-nez p2, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_3

    if-eqz p3, :cond_2

    .line 1209
    invoke-virtual {p0, p2, p1}, Landroid/view/View;->scrollBy(II)V

    return v0

    .line 1211
    :cond_2
    invoke-virtual {p0, p2, p1}, Ll/᩶ۢۡ;->֫(II)V

    :cond_3
    return v0
.end method

.method public final requestLayout()V
    .locals 1

    const/4 v0, 0x1

    .line 1399
    iput-boolean v0, p0, Ll/᩶ۢۡ;->ۗ:Z

    .line 1400
    invoke-super {p0}, Landroid/widget/FrameLayout;->requestLayout()V

    return-void
.end method

.method public final scrollTo(II)V
    .locals 3

    .line 1505
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-lez v0, :cond_1

    const/4 v0, 0x0

    .line 1506
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 1507
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    sub-int/2addr v1, v2

    .line 1508
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v2

    .line 1507
    invoke-static {p1, v1, v2}, Ll/᩶ۢۡ;->֫(III)I

    move-result p1

    .line 1509
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    .line 1510
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    .line 1509
    invoke-static {p2, v1, v0}, Ll/᩶ۢۡ;->֫(III)I

    move-result p2

    .line 1511
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v0

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v0

    if-eq p2, v0, :cond_1

    .line 1512
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->scrollTo(II)V

    :cond_1
    return-void
.end method

.method public final ֫(Landroid/graphics/Rect;)I
    .locals 7

    .line 1281
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 1284
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    .line 1285
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v2

    add-int v3, v2, v0

    .line 1288
    invoke-virtual {p0}, Landroid/view/View;->getHorizontalFadingEdgeLength()I

    move-result v4

    .line 1291
    iget v5, p1, Landroid/graphics/Rect;->left:I

    if-lez v5, :cond_1

    add-int/2addr v2, v4

    .line 1295
    :cond_1
    iget v5, p1, Landroid/graphics/Rect;->right:I

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    move-result v6

    if-ge v5, v6, :cond_2

    sub-int/2addr v3, v4

    .line 1300
    :cond_2
    iget v4, p1, Landroid/graphics/Rect;->right:I

    if-le v4, v3, :cond_4

    iget v5, p1, Landroid/graphics/Rect;->left:I

    if-le v5, v2, :cond_4

    .line 1305
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v4

    if-le v4, v0, :cond_3

    .line 1307
    iget p1, p1, Landroid/graphics/Rect;->left:I

    sub-int/2addr p1, v2

    goto :goto_0

    .line 1310
    :cond_3
    iget p1, p1, Landroid/graphics/Rect;->right:I

    sub-int/2addr p1, v3

    .line 1313
    :goto_0
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v0

    sub-int/2addr v0, v3

    .line 1315
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1

    .line 1317
    :cond_4
    iget v5, p1, Landroid/graphics/Rect;->left:I

    if-ge v5, v2, :cond_6

    if-ge v4, v3, :cond_6

    .line 1323
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v4

    if-le v4, v0, :cond_5

    .line 1325
    iget p1, p1, Landroid/graphics/Rect;->right:I

    sub-int/2addr v3, p1

    sub-int/2addr v1, v3

    goto :goto_1

    .line 1328
    :cond_5
    iget p1, p1, Landroid/graphics/Rect;->left:I

    sub-int/2addr v2, p1

    sub-int/2addr v1, v2

    .line 1332
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result p1

    neg-int p1, p1

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1

    :cond_6
    return v1
.end method

.method public final ֫(II)V
    .locals 5

    .line 1028
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 1031
    :cond_0
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Ll/᩶ۢۡ;->ۤ:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0xfa

    cmp-long v4, v0, v2

    if-lez v4, :cond_1

    .line 1034
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    sub-int/2addr v0, v1

    .line 1035
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    .line 1036
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    sub-int/2addr v2, v0

    .line 1037
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 1038
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v2

    add-int/2addr p2, v2

    .line 1039
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    sub-int/2addr p2, v2

    .line 1041
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    sub-int/2addr v0, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    sub-int/2addr v0, v3

    .line 1042
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v3

    sub-int/2addr v3, v0

    .line 1043
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 1044
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v3

    add-int/2addr p1, v3

    .line 1045
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    sub-int/2addr p1, v3

    .line 1047
    iget-object v0, p0, Ll/᩶ۢۡ;->᩺:Landroid/widget/OverScroller;

    invoke-virtual {v0, v3, v2, p1, p2}, Landroid/widget/OverScroller;->startScroll(IIII)V

    .line 1048
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    goto :goto_0

    .line 1050
    :cond_1
    iget-object v0, p0, Ll/᩶ۢۡ;->᩺:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1051
    iget-object v0, p0, Ll/᩶ۢۡ;->᩺:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 1052
    :cond_2
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->scrollBy(II)V

    .line 1054
    :goto_0
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Ll/᩶ۢۡ;->ۤ:J

    return-void
.end method

.method public final ֫(I)Z
    .locals 7

    .line 915
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v0

    if-ne v0, p0, :cond_0

    const/4 v0, 0x0

    .line 919
    :cond_0
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v1

    invoke-virtual {v1, p0, v0, p1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    .line 169
    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result v3

    sub-int/2addr v2, v3

    int-to-float v2, v2

    const/high16 v3, 0x3f000000    # 0.5f

    mul-float v2, v2, v3

    float-to-int v2, v2

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    .line 924
    invoke-direct {p0, v2, v1}, Ll/᩶ۢۡ;->֫(ILandroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 925
    iget-object v2, p0, Ll/᩶ۢۡ;->۟:Landroid/graphics/Rect;

    invoke-virtual {v1, v2}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 926
    invoke-virtual {p0, v1, v2}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 927
    invoke-virtual {p0, v2}, Ll/᩶ۢۡ;->֫(Landroid/graphics/Rect;)I

    move-result v2

    .line 928
    invoke-direct {p0, v2}, Ll/᩶ۢۡ;->ܿ(I)V

    .line 929
    invoke-virtual {v1, p1}, Landroid/view/View;->requestFocus(I)Z

    goto :goto_2

    :cond_1
    const/16 v1, 0x11

    const/16 v4, 0x42

    if-ne p1, v1, :cond_2

    .line 934
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v1

    if-ge v1, v2, :cond_2

    .line 935
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v2

    goto :goto_0

    :cond_2
    if-ne p1, v4, :cond_3

    .line 936
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-lez v1, :cond_3

    .line 938
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    move-result v1

    .line 940
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v5

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v6

    add-int/2addr v6, v5

    sub-int/2addr v1, v6

    if-ge v1, v2, :cond_3

    move v2, v1

    :cond_3
    :goto_0
    if-nez v2, :cond_4

    return v3

    :cond_4
    if-ne p1, v4, :cond_5

    goto :goto_1

    :cond_5
    neg-int v2, v2

    .line 947
    :goto_1
    invoke-direct {p0, v2}, Ll/᩶ۢۡ;->ܿ(I)V

    :goto_2
    if-eqz v0, :cond_6

    .line 951
    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 976
    invoke-direct {p0, v3, v0}, Ll/᩶ۢۡ;->֫(ILandroid/view/View;)Z

    move-result p1

    if-nez p1, :cond_6

    .line 959
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getDescendantFocusability()I

    move-result p1

    const/high16 v0, 0x20000

    .line 960
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 961
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 962
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    :cond_6
    const/4 p1, 0x1

    return p1
.end method

.method public final ۧ(Landroid/graphics/Rect;)I
    .locals 7

    .line 1224
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 1227
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    .line 1228
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v2

    add-int v3, v2, v0

    .line 1231
    invoke-virtual {p0}, Landroid/view/View;->getVerticalFadingEdgeLength()I

    move-result v4

    .line 1234
    iget v5, p1, Landroid/graphics/Rect;->top:I

    if-lez v5, :cond_1

    add-int/2addr v2, v4

    .line 1239
    :cond_1
    iget v5, p1, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getHeight()I

    move-result v6

    if-ge v5, v6, :cond_2

    sub-int/2addr v3, v4

    .line 1244
    :cond_2
    iget v4, p1, Landroid/graphics/Rect;->bottom:I

    if-le v4, v3, :cond_4

    iget v5, p1, Landroid/graphics/Rect;->top:I

    if-le v5, v2, :cond_4

    .line 1249
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result v4

    if-le v4, v0, :cond_3

    .line 1251
    iget p1, p1, Landroid/graphics/Rect;->top:I

    sub-int/2addr p1, v2

    goto :goto_0

    .line 1254
    :cond_3
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p1, v3

    .line 1257
    :goto_0
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    sub-int/2addr v0, v3

    .line 1259
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1

    .line 1261
    :cond_4
    iget v5, p1, Landroid/graphics/Rect;->top:I

    if-ge v5, v2, :cond_6

    if-ge v4, v3, :cond_6

    .line 1266
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result v4

    if-le v4, v0, :cond_5

    .line 1268
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v3, p1

    sub-int/2addr v1, v3

    goto :goto_1

    .line 1271
    :cond_5
    iget p1, p1, Landroid/graphics/Rect;->top:I

    sub-int/2addr v2, p1

    sub-int/2addr v1, v2

    .line 1275
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p1

    neg-int p1, p1

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1

    :cond_6
    return v1
.end method

.method public final ۧ(I)Z
    .locals 7

    .line 861
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v0

    if-ne v0, p0, :cond_0

    const/4 v0, 0x0

    .line 865
    :cond_0
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v1

    invoke-virtual {v1, p0, v0, p1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    .line 165
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result v3

    sub-int/2addr v2, v3

    int-to-float v2, v2

    const/high16 v3, 0x3f000000    # 0.5f

    mul-float v2, v2, v3

    float-to-int v2, v2

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    .line 871
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    invoke-direct {p0, v1, v2, v4}, Ll/᩶ۢۡ;->֫(Landroid/view/View;II)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 872
    iget-object v2, p0, Ll/᩶ۢۡ;->۟:Landroid/graphics/Rect;

    invoke-virtual {v1, v2}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 873
    invoke-virtual {p0, v1, v2}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 874
    invoke-virtual {p0, v2}, Ll/᩶ۢۡ;->ۧ(Landroid/graphics/Rect;)I

    move-result v2

    .line 875
    invoke-direct {p0, v2}, Ll/᩶ۢۡ;->ܳ(I)V

    .line 876
    invoke-virtual {v1, p1}, Landroid/view/View;->requestFocus(I)Z

    goto :goto_2

    :cond_1
    const/16 v1, 0x21

    const/16 v4, 0x82

    if-ne p1, v1, :cond_2

    .line 881
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v1

    if-ge v1, v2, :cond_2

    .line 882
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v2

    goto :goto_0

    :cond_2
    if-ne p1, v4, :cond_3

    .line 884
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-lez v1, :cond_3

    .line 885
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v1

    .line 887
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v5

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v6

    add-int/2addr v6, v5

    sub-int/2addr v1, v6

    if-ge v1, v2, :cond_3

    move v2, v1

    :cond_3
    :goto_0
    if-nez v2, :cond_4

    return v3

    :cond_4
    if-ne p1, v4, :cond_5

    goto :goto_1

    :cond_5
    neg-int v2, v2

    .line 894
    :goto_1
    invoke-direct {p0, v2}, Ll/᩶ۢۡ;->ܳ(I)V

    :goto_2
    if-eqz v0, :cond_6

    .line 897
    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 972
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p1

    invoke-direct {p0, v0, v3, p1}, Ll/᩶ۢۡ;->֫(Landroid/view/View;II)Z

    move-result p1

    if-nez p1, :cond_6

    .line 905
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getDescendantFocusability()I

    move-result p1

    const/high16 v0, 0x20000

    .line 906
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 907
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 908
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    :cond_6
    const/4 p1, 0x1

    return p1
.end method

.method public final ܽ(I)Z
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p1

    const/16 v2, 0x42

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 768
    :goto_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v4

    .line 770
    iget-object v5, v0, Ll/᩶ۢۡ;->۟:Landroid/graphics/Rect;

    iput v3, v5, Landroid/graphics/Rect;->left:I

    .line 771
    iput v4, v5, Landroid/graphics/Rect;->right:I

    if-eqz v2, :cond_1

    .line 774
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-lez v2, :cond_1

    .line 776
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 777
    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    move-result v2

    iput v2, v5, Landroid/graphics/Rect;->right:I

    sub-int/2addr v2, v4

    .line 778
    iput v2, v5, Landroid/graphics/Rect;->left:I

    .line 782
    :cond_1
    iget v2, v5, Landroid/graphics/Rect;->left:I

    iget v3, v5, Landroid/graphics/Rect;->right:I

    .line 829
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v4

    .line 830
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollX()I

    move-result v5

    add-int/2addr v4, v5

    const/16 v6, 0x11

    if-ne v1, v6, :cond_2

    const/4 v6, 0x1

    goto :goto_1

    :cond_2
    const/4 v6, 0x0

    :goto_1
    const/4 v7, 0x2

    .line 669
    invoke-virtual {v0, v7}, Landroid/view/View;->getFocusables(I)Ljava/util/ArrayList;

    move-result-object v7

    .line 681
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_2
    if-ge v10, v8, :cond_c

    .line 683
    invoke-interface {v7, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/view/View;

    .line 684
    invoke-virtual {v12}, Landroid/view/View;->getLeft()I

    move-result v13

    .line 685
    invoke-virtual {v12}, Landroid/view/View;->getRight()I

    move-result v14

    if-ge v2, v14, :cond_a

    if-ge v13, v3, :cond_a

    if-ge v2, v13, :cond_3

    if-ge v14, v3, :cond_3

    const/4 v15, 0x1

    goto :goto_3

    :cond_3
    const/4 v15, 0x0

    :goto_3
    move-object/from16 v16, v7

    if-nez v9, :cond_4

    move-object v9, v12

    move v11, v15

    goto :goto_6

    :cond_4
    if-eqz v6, :cond_5

    .line 702
    invoke-virtual {v9}, Landroid/view/View;->getLeft()I

    move-result v7

    if-lt v13, v7, :cond_6

    :cond_5
    if-nez v6, :cond_7

    .line 704
    invoke-virtual {v9}, Landroid/view/View;->getRight()I

    move-result v7

    if-le v14, v7, :cond_7

    :cond_6
    const/4 v7, 0x1

    goto :goto_4

    :cond_7
    const/4 v7, 0x0

    :goto_4
    if-eqz v11, :cond_8

    if-eqz v15, :cond_b

    if-eqz v7, :cond_b

    goto :goto_5

    :cond_8
    if-eqz v15, :cond_9

    const/4 v7, 0x1

    move-object v9, v12

    const/4 v11, 0x1

    goto :goto_6

    :cond_9
    if-eqz v7, :cond_b

    :goto_5
    move-object v9, v12

    goto :goto_6

    :cond_a
    move-object/from16 v16, v7

    :cond_b
    :goto_6
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v7, v16

    goto :goto_2

    :cond_c
    if-nez v9, :cond_d

    move-object v9, v0

    :cond_d
    if-lt v2, v5, :cond_e

    if-gt v3, v4, :cond_e

    const/4 v2, 0x0

    goto :goto_8

    :cond_e
    if-eqz v6, :cond_f

    sub-int/2addr v2, v5

    goto :goto_7

    :cond_f
    sub-int v2, v3, v4

    .line 842
    :goto_7
    invoke-direct {v0, v2}, Ll/᩶ۢۡ;->ܿ(I)V

    const/4 v2, 0x1

    .line 845
    :goto_8
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v3

    if-eq v9, v3, :cond_10

    invoke-virtual {v9, v1}, Landroid/view/View;->requestFocus(I)Z

    :cond_10
    return v2
.end method

.method public final ᩳ(I)Z
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p1

    const/16 v2, 0x82

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 749
    :goto_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v4

    .line 751
    iget-object v5, v0, Ll/᩶ۢۡ;->۟:Landroid/graphics/Rect;

    iput v3, v5, Landroid/graphics/Rect;->top:I

    .line 752
    iput v4, v5, Landroid/graphics/Rect;->bottom:I

    if-eqz v2, :cond_1

    .line 755
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-lez v2, :cond_1

    add-int/lit8 v2, v2, -0x1

    .line 757
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 758
    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    move-result v2

    iput v2, v5, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v2, v4

    .line 759
    iput v2, v5, Landroid/graphics/Rect;->top:I

    .line 763
    :cond_1
    iget v2, v5, Landroid/graphics/Rect;->top:I

    iget v3, v5, Landroid/graphics/Rect;->bottom:I

    .line 802
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v4

    .line 803
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollY()I

    move-result v5

    add-int/2addr v4, v5

    const/16 v6, 0x21

    if-ne v1, v6, :cond_2

    const/4 v6, 0x1

    goto :goto_1

    :cond_2
    const/4 v6, 0x0

    :goto_1
    const/4 v7, 0x2

    .line 602
    invoke-virtual {v0, v7}, Landroid/view/View;->getFocusables(I)Ljava/util/ArrayList;

    move-result-object v7

    .line 614
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_2
    if-ge v10, v8, :cond_c

    .line 616
    invoke-interface {v7, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/view/View;

    .line 617
    invoke-virtual {v12}, Landroid/view/View;->getTop()I

    move-result v13

    .line 618
    invoke-virtual {v12}, Landroid/view/View;->getBottom()I

    move-result v14

    if-ge v2, v14, :cond_a

    if-ge v13, v3, :cond_a

    if-ge v2, v13, :cond_3

    if-ge v14, v3, :cond_3

    const/4 v15, 0x1

    goto :goto_3

    :cond_3
    const/4 v15, 0x0

    :goto_3
    move-object/from16 v16, v7

    if-nez v9, :cond_4

    move-object v9, v12

    move v11, v15

    goto :goto_6

    :cond_4
    if-eqz v6, :cond_5

    .line 635
    invoke-virtual {v9}, Landroid/view/View;->getTop()I

    move-result v7

    if-lt v13, v7, :cond_6

    :cond_5
    if-nez v6, :cond_7

    .line 636
    invoke-virtual {v9}, Landroid/view/View;->getBottom()I

    move-result v7

    if-le v14, v7, :cond_7

    :cond_6
    const/4 v7, 0x1

    goto :goto_4

    :cond_7
    const/4 v7, 0x0

    :goto_4
    if-eqz v11, :cond_8

    if-eqz v15, :cond_b

    if-eqz v7, :cond_b

    goto :goto_5

    :cond_8
    if-eqz v15, :cond_9

    const/4 v7, 0x1

    move-object v9, v12

    const/4 v11, 0x1

    goto :goto_6

    :cond_9
    if-eqz v7, :cond_b

    :goto_5
    move-object v9, v12

    goto :goto_6

    :cond_a
    move-object/from16 v16, v7

    :cond_b
    :goto_6
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v7, v16

    goto :goto_2

    :cond_c
    if-nez v9, :cond_d

    move-object v9, v0

    :cond_d
    if-lt v2, v5, :cond_e

    if-gt v3, v4, :cond_e

    const/4 v2, 0x0

    goto :goto_8

    :cond_e
    if-eqz v6, :cond_f

    sub-int/2addr v2, v5

    goto :goto_7

    :cond_f
    sub-int v2, v3, v4

    .line 815
    :goto_7
    invoke-direct {v0, v2}, Ll/᩶ۢۡ;->ܳ(I)V

    const/4 v2, 0x1

    .line 818
    :goto_8
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v3

    if-eq v9, v3, :cond_10

    invoke-virtual {v9, v1}, Landroid/view/View;->requestFocus(I)Z

    :cond_10
    return v2
.end method
