.class public abstract Ll/ۛ᩸;
.super Ljava/lang/Object;
.source "S6AR"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2091
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 2102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Landroid/view/View;)Ljava/lang/Object;
    .locals 0

    .line 2385
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Ll/ܰ᩸;

    .line 2386
    iget-object p0, p0, Ll/ܰ᩸;->ۡ:Ljava/lang/Object;

    return-object p0
.end method

.method public static ֫(Landroid/view/View;Ljava/lang/Object;)V
    .locals 0

    .line 2372
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Ll/ܰ᩸;

    .line 2373
    iput-object p1, p0, Ll/ܰ᩸;->ۡ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public blocksInteractionBelow(Ll/ᩳ᩹;Landroid/view/View;)Z
    .locals 0

    .line 2229
    invoke-virtual {p0, p1, p2}, Ll/ۛ᩸;->getScrimOpacity(Ll/ᩳ᩹;Landroid/view/View;)F

    move-result p1

    const/4 p2, 0x0

    cmpl-float p1, p1, p2

    if-lez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public getInsetDodgeRect(Ll/ᩳ᩹;Landroid/view/View;Landroid/graphics/Rect;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public getScrimColor(Ll/ᩳ᩹;Landroid/view/View;)I
    .locals 0

    const/high16 p1, -0x1000000

    return p1
.end method

.method public getScrimOpacity(Ll/ᩳ᩹;Landroid/view/View;)F
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public layoutDependsOn(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/View;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onApplyWindowInsets(Ll/ᩳ᩹;Landroid/view/View;Ll/᩸ܰ;)Ll/᩸ܰ;
    .locals 0

    return-object p3
.end method

.method public onAttachedToLayoutParams(Ll/ܰ᩸;)V
    .locals 0

    return-void
.end method

.method public onDependentViewChanged(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/View;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onDependentViewRemoved(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public onDetachedFromLayoutParams()V
    .locals 0

    return-void
.end method

.method public onInterceptTouchEvent(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onLayoutChild(Ll/ᩳ᩹;Landroid/view/View;I)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onMeasureChild(Ll/ᩳ᩹;Landroid/view/View;IIII)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onNestedFling(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/View;FFZ)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onNestedPreFling(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/View;FF)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onNestedPreScroll(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/View;II[I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onNestedPreScroll(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/View;II[II)V
    .locals 0

    if-nez p7, :cond_0

    .line 2634
    invoke-virtual/range {p0 .. p6}, Ll/ۛ᩸;->onNestedPreScroll(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/View;II[I)V

    :cond_0
    return-void
.end method

.method public onNestedScroll(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/View;IIII)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onNestedScroll(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/View;IIIII)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-nez p8, :cond_0

    .line 2541
    invoke-virtual/range {p0 .. p7}, Ll/ۛ᩸;->onNestedScroll(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/View;IIII)V

    :cond_0
    return-void
.end method

.method public onNestedScroll(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/View;IIIII[I)V
    .locals 2

    const/4 v0, 0x0

    .line 2583
    aget v1, p9, v0

    add-int/2addr v1, p6

    aput v1, p9, v0

    const/4 v0, 0x1

    .line 2584
    aget v1, p9, v0

    add-int/2addr v1, p7

    aput v1, p9, v0

    .line 2585
    invoke-virtual/range {p0 .. p8}, Ll/ۛ᩸;->onNestedScroll(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/View;IIIII)V

    return-void
.end method

.method public onNestedScrollAccepted(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onNestedScrollAccepted(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/View;Landroid/view/View;II)V
    .locals 0

    if-nez p6, :cond_0

    .line 2470
    invoke-virtual/range {p0 .. p5}, Ll/ۛ᩸;->onNestedScrollAccepted(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V

    :cond_0
    return-void
.end method

.method public onRequestChildRectangleOnScreen(Ll/ᩳ᩹;Landroid/view/View;Landroid/graphics/Rect;Z)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onRestoreInstanceState(Ll/ᩳ᩹;Landroid/view/View;Landroid/os/Parcelable;)V
    .locals 0

    return-void
.end method

.method public onSaveInstanceState(Ll/ᩳ᩹;Landroid/view/View;)Landroid/os/Parcelable;
    .locals 0

    .line 2778
    sget-object p1, Landroid/view/View$BaseSavedState;->EMPTY_STATE:Landroid/view/AbsSavedState;

    return-object p1
.end method

.method public onStartNestedScroll(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/View;Landroid/view/View;I)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p1, 0x0

    return p1
.end method

.method public onStartNestedScroll(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/View;Landroid/view/View;II)Z
    .locals 0

    if-nez p6, :cond_0

    .line 2427
    invoke-virtual/range {p0 .. p5}, Ll/ۛ᩸;->onStartNestedScroll(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/View;Landroid/view/View;I)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public onStopNestedScroll(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/View;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onStopNestedScroll(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/View;I)V
    .locals 0

    if-nez p4, :cond_0

    .line 2510
    invoke-virtual {p0, p1, p2, p3}, Ll/ۛ᩸;->onStopNestedScroll(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public onTouchEvent(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
