.class public abstract Ll/ܿ۬ۧ;
.super Ljava/lang/Object;
.source "Y6A7"


# instance fields
.field public mAutoMeasure:Z

.field public mChildHelper:Ll/᩹᩶ۧ;

.field public mHeight:I

.field public mHeightMode:I

.field public mHorizontalBoundCheck:Ll/ۖ۫ۧ;

.field public final mHorizontalBoundCheckCallback:Ll/ܺ۫ۧ;

.field public mIsAttachedToWindow:Z

.field public mItemPrefetchEnabled:Z

.field public mMeasurementCacheEnabled:Z

.field public mPrefetchMaxCountObserved:I

.field public mPrefetchMaxObservedInInitialPrefetch:Z

.field public mRecyclerView:Ll/۬۬ۧ;

.field public mRequestedSimpleAnimations:Z

.field public mSmoothScroller:Ll/ܶ۬ۧ;

.field public mVerticalBoundCheck:Ll/ۖ۫ۧ;

.field public final mVerticalBoundCheckCallback:Ll/ܺ۫ۧ;

.field public mWidth:I

.field public mWidthMode:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 8402
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8410
    new-instance v0, Ll/֫۬ۧ;

    invoke-direct {v0, p0}, Ll/֫۬ۧ;-><init>(Ll/ܿ۬ۧ;)V

    iput-object v0, p0, Ll/ܿ۬ۧ;->mHorizontalBoundCheckCallback:Ll/ܺ۫ۧ;

    .line 8446
    new-instance v1, Ll/ۧ۬ۧ;

    invoke-direct {v1, p0}, Ll/ۧ۬ۧ;-><init>(Ll/ܿ۬ۧ;)V

    iput-object v1, p0, Ll/ܿ۬ۧ;->mVerticalBoundCheckCallback:Ll/ܺ۫ۧ;

    .line 8487
    new-instance v2, Ll/ۖ۫ۧ;

    invoke-direct {v2, v0}, Ll/ۖ۫ۧ;-><init>(Ll/ܺ۫ۧ;)V

    iput-object v2, p0, Ll/ܿ۬ۧ;->mHorizontalBoundCheck:Ll/ۖ۫ۧ;

    .line 8488
    new-instance v0, Ll/ۖ۫ۧ;

    invoke-direct {v0, v1}, Ll/ۖ۫ۧ;-><init>(Ll/ܺ۫ۧ;)V

    iput-object v0, p0, Ll/ܿ۬ۧ;->mVerticalBoundCheck:Ll/ۖ۫ۧ;

    const/4 v0, 0x0

    .line 8493
    iput-boolean v0, p0, Ll/ܿ۬ۧ;->mRequestedSimpleAnimations:Z

    .line 8495
    iput-boolean v0, p0, Ll/ܿ۬ۧ;->mIsAttachedToWindow:Z

    .line 8501
    iput-boolean v0, p0, Ll/ܿ۬ۧ;->mAutoMeasure:Z

    const/4 v0, 0x1

    .line 8507
    iput-boolean v0, p0, Ll/ܿ۬ۧ;->mMeasurementCacheEnabled:Z

    .line 8509
    iput-boolean v0, p0, Ll/ܿ۬ۧ;->mItemPrefetchEnabled:Z

    return-void
.end method

.method public static ֫(III)I
    .locals 2

    .line 8695
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 8696
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p0

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_1

    const/high16 v1, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_0

    .line 8704
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p0

    :cond_0
    return p0

    .line 8701
    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    move-result p0

    return p0
.end method

.method public static ֫(IIIIZ)I
    .locals 3

    sub-int/2addr p0, p2

    const/4 p2, 0x0

    .line 10270
    invoke-static {p2, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    const/4 p2, -0x2

    const/4 v0, -0x1

    const/high16 v1, -0x80000000

    const/high16 v2, 0x40000000    # 2.0f

    if-eqz p4, :cond_1

    if-ltz p3, :cond_0

    goto :goto_0

    :cond_0
    if-ne p3, v0, :cond_7

    if-eq p1, v1, :cond_6

    if-eqz p1, :cond_7

    if-eq p1, v2, :cond_6

    goto :goto_3

    :cond_1
    if-ltz p3, :cond_2

    :goto_0
    const/high16 p0, 0x40000000    # 2.0f

    goto :goto_4

    :cond_2
    if-ne p3, v0, :cond_3

    goto :goto_2

    :cond_3
    if-ne p3, p2, :cond_7

    if-eq p1, v1, :cond_5

    if-ne p1, v2, :cond_4

    goto :goto_1

    :cond_4
    const/4 p1, 0x0

    goto :goto_2

    :cond_5
    :goto_1
    const/high16 p1, -0x80000000

    :cond_6
    :goto_2
    move p3, p0

    move p0, p1

    goto :goto_4

    :cond_7
    :goto_3
    const/4 p0, 0x0

    const/4 p3, 0x0

    .line 10311
    :goto_4
    invoke-static {p3, p0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p0

    return p0
.end method

.method public static ֫(IIIZ)I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sub-int/2addr p0, p1

    const/4 p1, 0x0

    .line 10228
    invoke-static {p1, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    if-eqz p3, :cond_0

    if-ltz p2, :cond_3

    goto :goto_0

    :cond_0
    if-ltz p2, :cond_1

    :goto_0
    const/high16 p1, 0x40000000    # 2.0f

    goto :goto_2

    :cond_1
    const/4 p3, -0x1

    if-ne p2, p3, :cond_2

    const/high16 p1, 0x40000000    # 2.0f

    goto :goto_1

    :cond_2
    const/4 p3, -0x2

    if-ne p2, p3, :cond_3

    const/high16 p1, -0x80000000

    :goto_1
    move p2, p0

    goto :goto_2

    :cond_3
    const/4 p2, 0x0

    .line 10254
    :goto_2
    invoke-static {p2, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p0

    return p0
.end method

.method public static ֫(Landroid/content/Context;Landroid/util/AttributeSet;II)Ll/ᩳ۬ۧ;
    .locals 2

    .line 11445
    new-instance v0, Ll/ᩳ۬ۧ;

    .line 11493
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11446
    sget-object v1, Ll/֡᩶ۧ;->֫:[I

    invoke-virtual {p0, p1, v1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p0

    const/4 p1, 0x0

    const/4 p2, 0x1

    .line 11448
    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p3

    iput p3, v0, Ll/ᩳ۬ۧ;->֫:I

    const/16 p3, 0xa

    .line 11450
    invoke-virtual {p0, p3, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, v0, Ll/ᩳ۬ۧ;->ܽ:I

    const/16 p2, 0x9

    .line 11451
    invoke-virtual {p0, p2, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, v0, Ll/ᩳ۬ۧ;->ۧ:Z

    const/16 p2, 0xb

    .line 11452
    invoke-virtual {p0, p2, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, v0, Ll/ᩳ۬ۧ;->ᩳ:Z

    .line 11453
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    return-object v0
.end method

.method private ֫(ILandroid/view/View;)V
    .locals 0

    .line 9619
    iget-object p2, p0, Ll/ܿ۬ۧ;->mChildHelper:Ll/᩹᩶ۧ;

    invoke-virtual {p2, p1}, Ll/᩹᩶ۧ;->֫(I)V

    return-void
.end method

.method private ֫(Landroid/view/View;IZ)V
    .locals 5

    .line 9392
    invoke-static {p1}, Ll/۬۬ۧ;->ۧ(Landroid/view/View;)Ll/ۗ۬ۧ;

    move-result-object v0

    const/4 v1, 0x1

    if-nez p3, :cond_1

    .line 9393
    invoke-virtual {v0}, Ll/ۗ۬ۧ;->isRemoved()Z

    move-result p3

    if-eqz p3, :cond_0

    goto :goto_0

    .line 9402
    :cond_0
    iget-object p3, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    iget-object p3, p3, Ll/۬۬ۧ;->mViewInfoStore:Ll/᩵۫ۧ;

    invoke-virtual {p3, v0}, Ll/᩵۫ۧ;->ܽ(Ll/ۗ۬ۧ;)V

    goto :goto_1

    .line 9395
    :cond_1
    :goto_0
    iget-object p3, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    iget-object p3, p3, Ll/۬۬ۧ;->mViewInfoStore:Ll/᩵۫ۧ;

    .line 198
    iget-object p3, p3, Ll/᩵۫ۧ;->֫:Ll/ۗ᩵;

    const/4 v2, 0x0

    .line 369
    invoke-virtual {p3, v0, v2}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 198
    check-cast v2, Ll/ۘ۫ۧ;

    if-nez v2, :cond_2

    .line 200
    invoke-static {}, Ll/ۘ۫ۧ;->֫()Ll/ۘ۫ۧ;

    move-result-object v2

    .line 201
    invoke-virtual {p3, v0, v2}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    :cond_2
    iget p3, v2, Ll/ۘ۫ۧ;->֫:I

    or-int/2addr p3, v1

    iput p3, v2, Ll/ۘ۫ۧ;->֫:I

    .line 9404
    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    check-cast p3, Ll/ܳ۬ۧ;

    .line 9405
    invoke-virtual {v0}, Ll/ۗ۬ۧ;->wasReturnedFromScrap()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_7

    invoke-virtual {v0}, Ll/ۗ۬ۧ;->isScrap()Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_2

    .line 9415
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    iget-object v4, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    if-ne v2, v4, :cond_6

    .line 9417
    iget-object v1, p0, Ll/ܿ۬ۧ;->mChildHelper:Ll/᩹᩶ۧ;

    invoke-virtual {v1, p1}, Ll/᩹᩶ۧ;->ۧ(Landroid/view/View;)I

    move-result v1

    const/4 v2, -0x1

    if-ne p2, v2, :cond_4

    .line 9419
    iget-object p2, p0, Ll/ܿ۬ۧ;->mChildHelper:Ll/᩹᩶ۧ;

    invoke-virtual {p2}, Ll/᩹᩶ۧ;->֫()I

    move-result p2

    :cond_4
    if-eq v1, v2, :cond_5

    if-eq v1, p2, :cond_9

    .line 9427
    iget-object p1, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    iget-object p1, p1, Ll/۬۬ۧ;->mLayout:Ll/ܿ۬ۧ;

    invoke-virtual {p1, v1, p2}, Ll/ܿ۬ۧ;->moveView(II)V

    goto :goto_4

    .line 9422
    :cond_5
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:"

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    .line 9424
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object p1, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    invoke-virtual {p1}, Ll/۬۬ۧ;->exceptionLabel()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 9430
    :cond_6
    iget-object v2, p0, Ll/ܿ۬ۧ;->mChildHelper:Ll/᩹᩶ۧ;

    invoke-virtual {v2, p1, p2, v3}, Ll/᩹᩶ۧ;->֫(Landroid/view/View;IZ)V

    .line 9431
    iput-boolean v1, p3, Ll/ܳ۬ۧ;->ۧ:Z

    .line 9432
    iget-object p2, p0, Ll/ܿ۬ۧ;->mSmoothScroller:Ll/ܶ۬ۧ;

    if-eqz p2, :cond_9

    invoke-virtual {p2}, Ll/ܶ۬ۧ;->isRunning()Z

    move-result p2

    if-eqz p2, :cond_9

    .line 9433
    iget-object p2, p0, Ll/ܿ۬ۧ;->mSmoothScroller:Ll/ܶ۬ۧ;

    invoke-virtual {p2, p1}, Ll/ܶ۬ۧ;->onChildAttachedToWindow(Landroid/view/View;)V

    goto :goto_4

    .line 9406
    :cond_7
    :goto_2
    invoke-virtual {v0}, Ll/ۗ۬ۧ;->isScrap()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 9407
    invoke-virtual {v0}, Ll/ۗ۬ۧ;->unScrap()V

    goto :goto_3

    .line 9409
    :cond_8
    invoke-virtual {v0}, Ll/ۗ۬ۧ;->clearReturnedFromScrapFlag()V

    .line 9411
    :goto_3
    iget-object v1, p0, Ll/ܿ۬ۧ;->mChildHelper:Ll/᩹᩶ۧ;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    invoke-virtual {v1, p1, p2, v2, v3}, Ll/᩹᩶ۧ;->֫(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V

    .line 9436
    :cond_9
    :goto_4
    iget-boolean p1, p3, Ll/ܳ۬ۧ;->ܽ:Z

    if-eqz p1, :cond_b

    .line 9437
    sget-boolean p1, Ll/۬۬ۧ;->sVerboseLoggingEnabled:Z

    if-eqz p1, :cond_a

    .line 9438
    iget-object p1, p3, Ll/ܳ۬ۧ;->ᩳ:Ll/ۗ۬ۧ;

    invoke-static {p1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 9440
    :cond_a
    iget-object p1, v0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 9441
    iput-boolean v3, p3, Ll/ܳ۬ۧ;->ܽ:Z

    :cond_b
    return-void
.end method

.method private ֫(Ll/ۖ۬ۧ;ILandroid/view/View;)V
    .locals 2

    .line 10027
    invoke-static {p3}, Ll/۬۬ۧ;->ۧ(Landroid/view/View;)Ll/ۗ۬ۧ;

    move-result-object v0

    .line 10028
    invoke-virtual {v0}, Ll/ۗ۬ۧ;->shouldIgnore()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 10029
    sget-boolean p1, Ll/۬۬ۧ;->sVerboseLoggingEnabled:Z

    if-eqz p1, :cond_0

    .line 10030
    invoke-virtual {v0}, Ll/ۗ۬ۧ;->toString()Ljava/lang/String;

    :cond_0
    return-void

    .line 10034
    :cond_1
    invoke-virtual {v0}, Ll/ۗ۬ۧ;->isInvalid()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ll/ۗ۬ۧ;->isRemoved()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    iget-object v1, v1, Ll/۬۬ۧ;->mAdapter:Ll/᩶ۗۧ;

    .line 10035
    invoke-virtual {v1}, Ll/᩶ۗۧ;->hasStableIds()Z

    move-result v1

    if-nez v1, :cond_2

    .line 10036
    invoke-virtual {p0, p2}, Ll/ܿ۬ۧ;->removeViewAt(I)V

    .line 10037
    invoke-virtual {p1, v0}, Ll/ۖ۬ۧ;->֫(Ll/ۗ۬ۧ;)V

    return-void

    .line 10039
    :cond_2
    invoke-virtual {p0, p2}, Ll/ܿ۬ۧ;->detachViewAt(I)V

    .line 10040
    invoke-virtual {p1, p3}, Ll/ۖ۬ۧ;->ۧ(Landroid/view/View;)V

    .line 10041
    iget-object p1, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    iget-object p1, p1, Ll/۬۬ۧ;->mViewInfoStore:Ll/᩵۫ۧ;

    .line 277
    invoke-virtual {p1, v0}, Ll/᩵۫ۧ;->ܽ(Ll/ۗ۬ۧ;)V

    return-void
.end method

.method private ֫(Ll/۬۬ۧ;II)Z
    .locals 6

    .line 10794
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 10798
    :cond_0
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getPaddingLeft()I

    move-result v1

    .line 10799
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getPaddingTop()I

    move-result v2

    .line 10800
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getPaddingRight()I

    move-result v4

    sub-int/2addr v3, v4

    .line 10801
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getHeight()I

    move-result v4

    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getPaddingBottom()I

    move-result v5

    sub-int/2addr v4, v5

    .line 10802
    iget-object v5, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    iget-object v5, v5, Ll/۬۬ۧ;->mTempRect:Landroid/graphics/Rect;

    .line 10803
    invoke-virtual {p0, p1, v5}, Ll/ܿ۬ۧ;->getDecoratedBoundsWithMargins(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 10805
    iget p1, v5, Landroid/graphics/Rect;->left:I

    sub-int/2addr p1, p2

    if-ge p1, v3, :cond_2

    iget p1, v5, Landroid/graphics/Rect;->right:I

    sub-int/2addr p1, p2

    if-le p1, v1, :cond_2

    iget p1, v5, Landroid/graphics/Rect;->top:I

    sub-int/2addr p1, p3

    if-ge p1, v4, :cond_2

    iget p1, v5, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p1, p3

    if-gt p1, v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    return v0
.end method

.method private ֫(Landroid/view/View;Landroid/graphics/Rect;)[I
    .locals 7

    .line 10656
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getPaddingLeft()I

    move-result v0

    .line 10657
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getPaddingTop()I

    move-result v1

    .line 10658
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getPaddingRight()I

    move-result v3

    sub-int/2addr v2, v3

    .line 10659
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getHeight()I

    move-result v3

    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    .line 10660
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v4

    iget v5, p2, Landroid/graphics/Rect;->left:I

    add-int/2addr v4, v5

    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result v5

    sub-int/2addr v4, v5

    .line 10661
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v5

    iget v6, p2, Landroid/graphics/Rect;->top:I

    add-int/2addr v5, v6

    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result p1

    sub-int/2addr v5, p1

    .line 10662
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result p1

    add-int/2addr p1, v4

    .line 10663
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result p2

    add-int/2addr p2, v5

    sub-int/2addr v4, v0

    const/4 v0, 0x0

    .line 10665
    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    move-result v6

    sub-int/2addr v5, v1

    .line 10666
    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    move-result v1

    sub-int/2addr p1, v2

    .line 10667
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result v2

    sub-int/2addr p2, v3

    .line 10668
    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 10674
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getLayoutDirection()I

    move-result v0

    const/4 v3, 0x1

    if-ne v0, v3, :cond_1

    if-eqz v2, :cond_0

    goto :goto_1

    .line 10676
    :cond_0
    invoke-static {v6, p1}, Ljava/lang/Math;->max(II)I

    move-result v2

    goto :goto_1

    :cond_1
    if-eqz v6, :cond_2

    goto :goto_0

    .line 10679
    :cond_2
    invoke-static {v4, v2}, Ljava/lang/Math;->min(II)I

    move-result v6

    :goto_0
    move v2, v6

    :goto_1
    if-eqz v1, :cond_3

    goto :goto_2

    .line 10685
    :cond_3
    invoke-static {v5, p2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 10687
    :goto_2
    filled-new-array {v2, v1}, [I

    move-result-object p1

    return-object p1
.end method

.method public static ۧ(III)Z
    .locals 3

    .line 10166
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 10167
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    const/4 v1, 0x0

    if-lez p2, :cond_0

    if-eq p0, p2, :cond_0

    return v1

    :cond_0
    const/high16 p2, -0x80000000

    const/4 v2, 0x1

    if-eq v0, p2, :cond_4

    if-eqz v0, :cond_3

    const/high16 p2, 0x40000000    # 2.0f

    if-eq v0, p2, :cond_1

    return v1

    :cond_1
    if-ne p1, p0, :cond_2

    return v2

    :cond_2
    return v1

    :cond_3
    return v2

    :cond_4
    if-lt p1, p0, :cond_5

    return v2

    :cond_5
    return v1
.end method


# virtual methods
.method public addDisappearingView(Landroid/view/View;)V
    .locals 1

    const/4 v0, -0x1

    .line 9344
    invoke-virtual {p0, p1, v0}, Ll/ܿ۬ۧ;->addDisappearingView(Landroid/view/View;I)V

    return-void
.end method

.method public addDisappearingView(Landroid/view/View;I)V
    .locals 1

    const/4 v0, 0x1

    .line 9363
    invoke-direct {p0, p1, p2, v0}, Ll/ܿ۬ۧ;->֫(Landroid/view/View;IZ)V

    return-void
.end method

.method public addView(Landroid/view/View;)V
    .locals 1

    const/4 v0, -0x1

    .line 9375
    invoke-virtual {p0, p1, v0}, Ll/ܿ۬ۧ;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public addView(Landroid/view/View;I)V
    .locals 1

    const/4 v0, 0x0

    .line 9388
    invoke-direct {p0, p1, p2, v0}, Ll/ܿ۬ۧ;->֫(Landroid/view/View;IZ)V

    return-void
.end method

.method public assertInLayoutOrScroll(Ljava/lang/String;)V
    .locals 1

    .line 8680
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    if-eqz v0, :cond_0

    .line 8681
    invoke-virtual {v0, p1}, Ll/۬۬ۧ;->assertInLayoutOrScroll(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public assertNotInLayoutOrScroll(Ljava/lang/String;)V
    .locals 1

    .line 8717
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    if-eqz v0, :cond_0

    .line 8718
    invoke-virtual {v0, p1}, Ll/۬۬ۧ;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public attachView(Landroid/view/View;)V
    .locals 1

    const/4 v0, -0x1

    .line 9664
    invoke-virtual {p0, p1, v0}, Ll/ܿ۬ۧ;->attachView(Landroid/view/View;I)V

    return-void
.end method

.method public attachView(Landroid/view/View;I)V
    .locals 1

    .line 9653
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܳ۬ۧ;

    invoke-virtual {p0, p1, p2, v0}, Ll/ܿ۬ۧ;->attachView(Landroid/view/View;ILl/ܳ۬ۧ;)V

    return-void
.end method

.method public attachView(Landroid/view/View;ILl/ܳ۬ۧ;)V
    .locals 3

    .line 9632
    invoke-static {p1}, Ll/۬۬ۧ;->ۧ(Landroid/view/View;)Ll/ۗ۬ۧ;

    move-result-object v0

    .line 9633
    invoke-virtual {v0}, Ll/ۗ۬ۧ;->isRemoved()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 9634
    iget-object v1, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    iget-object v1, v1, Ll/۬۬ۧ;->mViewInfoStore:Ll/᩵۫ۧ;

    .line 198
    iget-object v1, v1, Ll/᩵۫ۧ;->֫:Ll/ۗ᩵;

    const/4 v2, 0x0

    .line 369
    invoke-virtual {v1, v0, v2}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 198
    check-cast v2, Ll/ۘ۫ۧ;

    if-nez v2, :cond_0

    .line 200
    invoke-static {}, Ll/ۘ۫ۧ;->֫()Ll/ۘ۫ۧ;

    move-result-object v2

    .line 201
    invoke-virtual {v1, v0, v2}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    :cond_0
    iget v1, v2, Ll/ۘ۫ۧ;->֫:I

    or-int/lit8 v1, v1, 0x1

    iput v1, v2, Ll/ۘ۫ۧ;->֫:I

    goto :goto_0

    .line 9636
    :cond_1
    iget-object v1, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    iget-object v1, v1, Ll/۬۬ۧ;->mViewInfoStore:Ll/᩵۫ۧ;

    invoke-virtual {v1, v0}, Ll/᩵۫ۧ;->ܽ(Ll/ۗ۬ۧ;)V

    .line 9638
    :goto_0
    iget-object v1, p0, Ll/ܿ۬ۧ;->mChildHelper:Ll/᩹᩶ۧ;

    invoke-virtual {v0}, Ll/ۗ۬ۧ;->isRemoved()Z

    move-result v0

    invoke-virtual {v1, p1, p2, p3, v0}, Ll/᩹᩶ۧ;->֫(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V

    return-void
.end method

.method public calculateItemDecorationsForChild(Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 1

    .line 10527
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    .line 10528
    invoke-virtual {p2, p1, p1, p1, p1}, Landroid/graphics/Rect;->set(IIII)V

    return-void

    .line 10531
    :cond_0
    invoke-virtual {v0, p1}, Ll/۬۬ۧ;->getItemDecorInsetsForChild(Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object p1

    .line 10532
    invoke-virtual {p2, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    return-void
.end method

.method public canScrollHorizontally()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public canScrollVertically()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public checkLayoutParams(Ll/ܳ۬ۧ;)Z
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public collectAdjacentPrefetchPositions(IILl/᩸۬ۧ;Ll/ܽ۬ۧ;)V
    .locals 0

    return-void
.end method

.method public collectInitialPrefetchPositions(ILl/ܽ۬ۧ;)V
    .locals 0

    return-void
.end method

.method public computeHorizontalScrollExtent(Ll/᩸۬ۧ;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public computeHorizontalScrollOffset(Ll/᩸۬ۧ;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public computeHorizontalScrollRange(Ll/᩸۬ۧ;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public computeVerticalScrollExtent(Ll/᩸۬ۧ;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public computeVerticalScrollOffset(Ll/᩸۬ۧ;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public computeVerticalScrollRange(Ll/᩸۬ۧ;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public detachAndScrapAttachedViews(Ll/ۖ۬ۧ;)V
    .locals 2

    .line 10019
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v0

    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_0

    .line 10021
    invoke-virtual {p0, v0}, Ll/ܿ۬ۧ;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 10022
    invoke-direct {p0, p1, v0, v1}, Ll/ܿ۬ۧ;->֫(Ll/ۖ۬ۧ;ILandroid/view/View;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public detachAndScrapView(Landroid/view/View;Ll/ۖ۬ۧ;)V
    .locals 1

    .line 9703
    iget-object v0, p0, Ll/ܿ۬ۧ;->mChildHelper:Ll/᩹᩶ۧ;

    invoke-virtual {v0, p1}, Ll/᩹᩶ۧ;->ۧ(Landroid/view/View;)I

    move-result v0

    .line 9704
    invoke-direct {p0, p2, v0, p1}, Ll/ܿ۬ۧ;->֫(Ll/ۖ۬ۧ;ILandroid/view/View;)V

    return-void
.end method

.method public detachAndScrapViewAt(ILl/ۖ۬ۧ;)V
    .locals 1

    .line 9717
    invoke-virtual {p0, p1}, Ll/ܿ۬ۧ;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 9718
    invoke-direct {p0, p2, p1, v0}, Ll/ܿ۬ۧ;->֫(Ll/ۖ۬ۧ;ILandroid/view/View;)V

    return-void
.end method

.method public detachView(Landroid/view/View;)V
    .locals 1

    .line 9590
    iget-object v0, p0, Ll/ܿ۬ۧ;->mChildHelper:Ll/᩹᩶ۧ;

    invoke-virtual {v0, p1}, Ll/᩹᩶ۧ;->ۧ(Landroid/view/View;)I

    move-result v0

    if-ltz v0, :cond_0

    .line 9592
    invoke-direct {p0, v0, p1}, Ll/ܿ۬ۧ;->֫(ILandroid/view/View;)V

    :cond_0
    return-void
.end method

.method public detachViewAt(I)V
    .locals 1

    .line 9612
    invoke-virtual {p0, p1}, Ll/ܿ۬ۧ;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Ll/ܿ۬ۧ;->֫(ILandroid/view/View;)V

    return-void
.end method

.method public dispatchAttachedToWindow(Ll/۬۬ۧ;)V
    .locals 1

    const/4 v0, 0x1

    .line 8930
    iput-boolean v0, p0, Ll/ܿ۬ۧ;->mIsAttachedToWindow:Z

    .line 8931
    invoke-virtual {p0, p1}, Ll/ܿ۬ۧ;->onAttachedToWindow(Ll/۬۬ۧ;)V

    return-void
.end method

.method public dispatchDetachedFromWindow(Ll/۬۬ۧ;Ll/ۖ۬ۧ;)V
    .locals 1

    const/4 v0, 0x0

    .line 8935
    iput-boolean v0, p0, Ll/ܿ۬ۧ;->mIsAttachedToWindow:Z

    .line 8936
    invoke-virtual {p0, p1, p2}, Ll/ܿ۬ۧ;->onDetachedFromWindow(Ll/۬۬ۧ;Ll/ۖ۬ۧ;)V

    return-void
.end method

.method public endAnimation(Landroid/view/View;)V
    .locals 1

    .line 9324
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    iget-object v0, v0, Ll/۬۬ۧ;->mItemAnimator:Ll/᩺ۗۧ;

    if-eqz v0, :cond_0

    .line 9325
    invoke-static {p1}, Ll/۬۬ۧ;->ۧ(Landroid/view/View;)Ll/ۗ۬ۧ;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/᩺ۗۧ;->ۧ(Ll/ۗ۬ۧ;)V

    :cond_0
    return-void
.end method

.method public findContainingItemView(Landroid/view/View;)Landroid/view/View;
    .locals 1

    .line 9531
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 9534
    :cond_0
    invoke-virtual {v0, p1}, Ll/۬۬ۧ;->findContainingItemView(Landroid/view/View;)Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    .line 9538
    :cond_1
    iget-object v0, p0, Ll/ܿ۬ۧ;->mChildHelper:Ll/᩹᩶ۧ;

    .line 367
    iget-object v0, v0, Ll/᩹᩶ۧ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_0
    const/4 p1, 0x0

    :cond_2
    return-object p1
.end method

.method public findViewByPosition(I)Landroid/view/View;
    .locals 5

    .line 9559
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    .line 9561
    invoke-virtual {p0, v1}, Ll/ܿ۬ۧ;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 9562
    invoke-static {v2}, Ll/۬۬ۧ;->ۧ(Landroid/view/View;)Ll/ۗ۬ۧ;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_1

    .line 9566
    :cond_0
    invoke-virtual {v3}, Ll/ۗ۬ۧ;->getLayoutPosition()I

    move-result v4

    if-ne v4, p1, :cond_2

    invoke-virtual {v3}, Ll/ۗ۬ۧ;->shouldIgnore()Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v4, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    iget-object v4, v4, Ll/۬۬ۧ;->mState:Ll/᩸۬ۧ;

    .line 13444
    iget-boolean v4, v4, Ll/᩸۬ۧ;->ܿ:Z

    if-nez v4, :cond_1

    .line 9567
    invoke-virtual {v3}, Ll/ۗ۬ۧ;->isRemoved()Z

    move-result v3

    if-nez v3, :cond_2

    :cond_1
    return-object v2

    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public abstract generateDefaultLayoutParams()Ll/ܳ۬ۧ;
.end method

.method public generateLayoutParams(Landroid/content/Context;Landroid/util/AttributeSet;)Ll/ܳ۬ۧ;
    .locals 1

    .line 9189
    new-instance v0, Ll/ܳ۬ۧ;

    invoke-direct {v0, p1, p2}, Ll/ܳ۬ۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Ll/ܳ۬ۧ;
    .locals 1

    .line 9164
    instance-of v0, p1, Ll/ܳ۬ۧ;

    if-eqz v0, :cond_0

    .line 9165
    new-instance v0, Ll/ܳ۬ۧ;

    check-cast p1, Ll/ܳ۬ۧ;

    invoke-direct {v0, p1}, Ll/ܳ۬ۧ;-><init>(Ll/ܳ۬ۧ;)V

    return-object v0

    .line 9166
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_1

    .line 9167
    new-instance v0, Ll/ܳ۬ۧ;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, Ll/ܳ۬ۧ;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-object v0

    .line 9169
    :cond_1
    new-instance v0, Ll/ܳ۬ۧ;

    invoke-direct {v0, p1}, Ll/ܳ۬ۧ;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public getBaseline()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public getBottomDecorationHeight(Landroid/view/View;)I
    .locals 0

    .line 10562
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Ll/ܳ۬ۧ;

    iget-object p1, p1, Ll/ܳ۬ۧ;->֫:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    return p1
.end method

.method public getChildAt(I)Landroid/view/View;
    .locals 1

    .line 9762
    iget-object v0, p0, Ll/ܿ۬ۧ;->mChildHelper:Ll/᩹᩶ۧ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ll/᩹᩶ۧ;->ۧ(I)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getChildCount()I
    .locals 1

    .line 9751
    iget-object v0, p0, Ll/ܿ۬ۧ;->mChildHelper:Ll/᩹᩶ۧ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/᩹᩶ۧ;->֫()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getClipToPadding()Z
    .locals 1

    .line 9043
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    if-eqz v0, :cond_0

    iget-boolean v0, v0, Ll/۬۬ۧ;->mClipToPadding:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getColumnCountForAccessibility(Ll/ۖ۬ۧ;Ll/᩸۬ۧ;)I
    .locals 0

    const/4 p1, -0x1

    return p1
.end method

.method public getDecoratedBottom(Landroid/view/View;)I
    .locals 1

    .line 10506
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result v0

    invoke-virtual {p0, p1}, Ll/ܿ۬ۧ;->getBottomDecorationHeight(Landroid/view/View;)I

    move-result p1

    add-int/2addr p1, v0

    return p1
.end method

.method public getDecoratedBoundsWithMargins(Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 0

    .line 10458
    invoke-static {p1, p2}, Ll/۬۬ۧ;->֫(Landroid/view/View;Landroid/graphics/Rect;)V

    return-void
.end method

.method public getDecoratedLeft(Landroid/view/View;)I
    .locals 1

    .line 10470
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    invoke-virtual {p0, p1}, Ll/ܿ۬ۧ;->getLeftDecorationWidth(Landroid/view/View;)I

    move-result p1

    sub-int/2addr v0, p1

    return v0
.end method

.method public getDecoratedMeasuredHeight(Landroid/view/View;)I
    .locals 2

    .line 10336
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܳ۬ۧ;

    iget-object v0, v0, Ll/ܳ۬ۧ;->֫:Landroid/graphics/Rect;

    .line 10337
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    iget v1, v0, Landroid/graphics/Rect;->top:I

    add-int/2addr p1, v1

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr p1, v0

    return p1
.end method

.method public getDecoratedMeasuredWidth(Landroid/view/View;)I
    .locals 2

    .line 10323
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܳ۬ۧ;

    iget-object v0, v0, Ll/ܳ۬ۧ;->֫:Landroid/graphics/Rect;

    .line 10324
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    iget v1, v0, Landroid/graphics/Rect;->left:I

    add-int/2addr p1, v1

    iget v0, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr p1, v0

    return p1
.end method

.method public getDecoratedRight(Landroid/view/View;)I
    .locals 1

    .line 10494
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v0

    invoke-virtual {p0, p1}, Ll/ܿ۬ۧ;->getRightDecorationWidth(Landroid/view/View;)I

    move-result p1

    add-int/2addr p1, v0

    return p1
.end method

.method public getDecoratedTop(Landroid/view/View;)I
    .locals 1

    .line 10482
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v0

    invoke-virtual {p0, p1}, Ll/ܿ۬ۧ;->getTopDecorationHeight(Landroid/view/View;)I

    move-result p1

    sub-int/2addr v0, p1

    return v0
.end method

.method public getFocusedChild()Landroid/view/View;
    .locals 2

    .line 9916
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 9919
    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 9920
    iget-object v1, p0, Ll/ܿ۬ۧ;->mChildHelper:Ll/᩹᩶ۧ;

    .line 367
    iget-object v1, v1, Ll/᩹᩶ۧ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    return-object v0

    :cond_2
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getHeight()I
    .locals 1

    .line 9826
    iget v0, p0, Ll/ܿ۬ۧ;->mHeight:I

    return v0
.end method

.method public getHeightMode()I
    .locals 1

    .line 9794
    iget v0, p0, Ll/ܿ۬ۧ;->mHeightMode:I

    return v0
.end method

.method public getItemCount()I
    .locals 1

    .line 9939
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/۬۬ۧ;->getAdapter()Ll/᩶ۗۧ;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 9940
    invoke-virtual {v0}, Ll/᩶ۗۧ;->getItemCount()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public getItemViewType(Landroid/view/View;)I
    .locals 0

    .line 9513
    invoke-static {p1}, Ll/۬۬ۧ;->ۧ(Landroid/view/View;)Ll/ۗ۬ۧ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۗ۬ۧ;->getItemViewType()I

    move-result p1

    return p1
.end method

.method public getLayoutDirection()I
    .locals 2

    .line 9313
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    sget v1, Ll/ܿ᩺;->֫:I

    .line 1977
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    move-result v0

    return v0
.end method

.method public getLeftDecorationWidth(Landroid/view/View;)I
    .locals 0

    .line 10577
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Ll/ܳ۬ۧ;

    iget-object p1, p1, Ll/ܳ۬ۧ;->֫:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->left:I

    return p1
.end method

.method public getMinimumHeight()I
    .locals 2

    .line 11085
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    sget v1, Ll/ܿ᩺;->֫:I

    .line 2393
    invoke-virtual {v0}, Landroid/view/View;->getMinimumHeight()I

    move-result v0

    return v0
.end method

.method public getMinimumWidth()I
    .locals 2

    .line 11077
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    sget v1, Ll/ܿ᩺;->֫:I

    .line 2378
    invoke-virtual {v0}, Landroid/view/View;->getMinimumWidth()I

    move-result v0

    return v0
.end method

.method public getPaddingBottom()I
    .locals 1

    .line 9866
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getPaddingEnd()I
    .locals 2

    .line 9886
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    if-eqz v0, :cond_0

    sget v1, Ll/ܿ᩺;->֫:I

    .line 2235
    invoke-virtual {v0}, Landroid/view/View;->getPaddingEnd()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getPaddingLeft()I
    .locals 1

    .line 9836
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getPaddingRight()I
    .locals 1

    .line 9856
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getPaddingStart()I
    .locals 2

    .line 9876
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    if-eqz v0, :cond_0

    sget v1, Ll/ܿ᩺;->֫:I

    .line 2220
    invoke-virtual {v0}, Landroid/view/View;->getPaddingStart()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getPaddingTop()I
    .locals 1

    .line 9846
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getPosition(Landroid/view/View;)I
    .locals 0

    .line 9503
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Ll/ܳ۬ۧ;

    .line 12605
    iget-object p1, p1, Ll/ܳ۬ۧ;->ᩳ:Ll/ۗ۬ۧ;

    invoke-virtual {p1}, Ll/ۗ۬ۧ;->getLayoutPosition()I

    move-result p1

    return p1
.end method

.method public getRightDecorationWidth(Landroid/view/View;)I
    .locals 0

    .line 10592
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Ll/ܳ۬ۧ;

    iget-object p1, p1, Ll/ܳ۬ۧ;->֫:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->right:I

    return p1
.end method

.method public getRowCountForAccessibility(Ll/ۖ۬ۧ;Ll/᩸۬ۧ;)I
    .locals 0

    const/4 p1, -0x1

    return p1
.end method

.method public getSelectionModeForAccessibility(Ll/ۖ۬ۧ;Ll/᩸۬ۧ;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public getTopDecorationHeight(Landroid/view/View;)I
    .locals 0

    .line 10547
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Ll/ܳ۬ۧ;

    iget-object p1, p1, Ll/ܳ۬ۧ;->֫:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->top:I

    return p1
.end method

.method public getTransformedBoundingBox(Landroid/view/View;ZLandroid/graphics/Rect;)V
    .locals 5

    if-eqz p2, :cond_0

    .line 10426
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Ll/ܳ۬ۧ;

    iget-object p2, p2, Ll/ܳ۬ۧ;->֫:Landroid/graphics/Rect;

    .line 10427
    iget v0, p2, Landroid/graphics/Rect;->left:I

    neg-int v0, v0

    iget v1, p2, Landroid/graphics/Rect;->top:I

    neg-int v1, v1

    .line 10428
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v2

    iget v3, p2, Landroid/graphics/Rect;->right:I

    add-int/2addr v2, v3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v3

    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v3, p2

    .line 10427
    invoke-virtual {p3, v0, v1, v2, v3}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_0

    .line 10430
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p3, v1, v1, p2, v0}, Landroid/graphics/Rect;->set(IIII)V

    .line 10433
    :goto_0
    iget-object p2, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    if-eqz p2, :cond_1

    .line 10434
    invoke-virtual {p1}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 10435
    invoke-virtual {p2}, Landroid/graphics/Matrix;->isIdentity()Z

    move-result v0

    if-nez v0, :cond_1

    .line 10436
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    iget-object v0, v0, Ll/۬۬ۧ;->mTempRectF:Landroid/graphics/RectF;

    .line 10437
    invoke-virtual {v0, p3}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 10438
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 10439
    iget p2, v0, Landroid/graphics/RectF;->left:F

    float-to-double v1, p2

    .line 10440
    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    move-result-wide v1

    double-to-int p2, v1

    iget v1, v0, Landroid/graphics/RectF;->top:F

    float-to-double v1, v1

    .line 10441
    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    move-result-wide v1

    double-to-int v1, v1

    iget v2, v0, Landroid/graphics/RectF;->right:F

    float-to-double v2, v2

    .line 10442
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    float-to-double v3, v0

    .line 10443
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-int v0, v3

    .line 10439
    invoke-virtual {p3, p2, v1, v2, v0}, Landroid/graphics/Rect;->set(IIII)V

    .line 10447
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    invoke-virtual {p3, p2, p1}, Landroid/graphics/Rect;->offset(II)V

    return-void
.end method

.method public getWidth()I
    .locals 1

    .line 9810
    iget v0, p0, Ll/ܿ۬ۧ;->mWidth:I

    return v0
.end method

.method public getWidthMode()I
    .locals 1

    .line 9778
    iget v0, p0, Ll/ܿ۬ۧ;->mWidthMode:I

    return v0
.end method

.method public hasFlexibleChildInBothOrientations()Z
    .locals 5

    .line 11479
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 11481
    invoke-virtual {p0, v2}, Ll/ܿ۬ۧ;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 11482
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    .line 11483
    iget v4, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    if-gez v4, :cond_0

    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-gez v3, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public hasFocus()Z
    .locals 1

    .line 9906
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ignoreView(Landroid/view/View;)V
    .locals 2

    .line 9984
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v1, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    if-ne v0, v1, :cond_0

    invoke-virtual {v1, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 9990
    invoke-static {p1}, Ll/۬۬ۧ;->ۧ(Landroid/view/View;)Ll/ۗ۬ۧ;

    move-result-object p1

    const/16 v0, 0x80

    .line 9991
    invoke-virtual {p1, v0}, Ll/ۗ۬ۧ;->addFlags(I)V

    .line 9992
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    iget-object v0, v0, Ll/۬۬ۧ;->mViewInfoStore:Ll/᩵۫ۧ;

    invoke-virtual {v0, p1}, Ll/᩵۫ۧ;->ᩳ(Ll/ۗ۬ۧ;)V

    return-void

    .line 9987
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "View should be fully attached to be ignored"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    .line 9988
    invoke-virtual {v1}, Ll/۬۬ۧ;->exceptionLabel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public isAttachedToWindow()Z
    .locals 1

    .line 8947
    iget-boolean v0, p0, Ll/ܿ۬ۧ;->mIsAttachedToWindow:Z

    return v0
.end method

.method public isAutoMeasureEnabled()Z
    .locals 1

    .line 8808
    iget-boolean v0, p0, Ll/ܿ۬ۧ;->mAutoMeasure:Z

    return v0
.end method

.method public isFocused()Z
    .locals 1

    .line 9896
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isItemPrefetchEnabled()Z
    .locals 1

    .line 8873
    iget-boolean v0, p0, Ll/ܿ۬ۧ;->mItemPrefetchEnabled:Z

    return v0
.end method

.method public isLayoutHierarchical(Ll/ۖ۬ۧ;Ll/᩸۬ۧ;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public isMeasurementCacheEnabled()Z
    .locals 1

    .line 10151
    iget-boolean v0, p0, Ll/ܿ۬ۧ;->mMeasurementCacheEnabled:Z

    return v0
.end method

.method public isSmoothScrolling()Z
    .locals 1

    .line 9301
    iget-object v0, p0, Ll/ܿ۬ۧ;->mSmoothScroller:Ll/ܶ۬ۧ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ܶ۬ۧ;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isViewPartiallyVisible(Landroid/view/View;ZZ)Z
    .locals 0

    .line 10773
    iget-object p3, p0, Ll/ܿ۬ۧ;->mHorizontalBoundCheck:Ll/ۖ۫ۧ;

    invoke-virtual {p3, p1}, Ll/ۖ۫ۧ;->֫(Landroid/view/View;)Z

    move-result p3

    if-eqz p3, :cond_0

    iget-object p3, p0, Ll/ܿ۬ۧ;->mVerticalBoundCheck:Ll/ۖ۫ۧ;

    .line 10775
    invoke-virtual {p3, p1}, Ll/ۖ۫ۧ;->֫(Landroid/view/View;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p2, :cond_1

    return p1

    :cond_1
    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public layoutDecorated(Landroid/view/View;IIII)V
    .locals 2

    .line 10370
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܳ۬ۧ;

    iget-object v0, v0, Ll/ܳ۬ۧ;->֫:Landroid/graphics/Rect;

    .line 10371
    iget v1, v0, Landroid/graphics/Rect;->left:I

    add-int/2addr p2, v1

    iget v1, v0, Landroid/graphics/Rect;->top:I

    add-int/2addr p3, v1

    iget v1, v0, Landroid/graphics/Rect;->right:I

    sub-int/2addr p4, v1

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p5, v0

    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method public layoutDecoratedWithMargins(Landroid/view/View;IIII)V
    .locals 3

    .line 10405
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܳ۬ۧ;

    .line 10406
    iget-object v1, v0, Ll/ܳ۬ۧ;->֫:Landroid/graphics/Rect;

    .line 10407
    iget v2, v1, Landroid/graphics/Rect;->left:I

    add-int/2addr p2, v2

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr p2, v2

    iget v2, v1, Landroid/graphics/Rect;->top:I

    add-int/2addr p3, v2

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr p3, v2

    iget v2, v1, Landroid/graphics/Rect;->right:I

    sub-int/2addr p4, v2

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int/2addr p4, v2

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p5, v1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr p5, v0

    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method public measureChild(Landroid/view/View;II)V
    .locals 5

    .line 10097
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܳ۬ۧ;

    .line 10099
    iget-object v1, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    invoke-virtual {v1, p1}, Ll/۬۬ۧ;->getItemDecorInsetsForChild(Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v1

    .line 10100
    iget v2, v1, Landroid/graphics/Rect;->left:I

    iget v3, v1, Landroid/graphics/Rect;->right:I

    add-int/2addr v2, v3

    add-int/2addr v2, p2

    .line 10101
    iget p2, v1, Landroid/graphics/Rect;->top:I

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr p2, v1

    add-int/2addr p2, p3

    .line 10102
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getWidth()I

    move-result p3

    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getWidthMode()I

    move-result v1

    .line 10103
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getPaddingLeft()I

    move-result v3

    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getPaddingRight()I

    move-result v4

    add-int/2addr v4, v3

    add-int/2addr v4, v2

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 10104
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->canScrollHorizontally()Z

    move-result v3

    .line 10102
    invoke-static {p3, v1, v4, v2, v3}, Ll/ܿ۬ۧ;->֫(IIIIZ)I

    move-result p3

    .line 10105
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getHeightMode()I

    move-result v2

    .line 10106
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getPaddingTop()I

    move-result v3

    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getPaddingBottom()I

    move-result v4

    add-int/2addr v4, v3

    add-int/2addr v4, p2

    iget p2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 10107
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->canScrollVertically()Z

    move-result v3

    .line 10105
    invoke-static {v1, v2, v4, p2, v3}, Ll/ܿ۬ۧ;->֫(IIIIZ)I

    move-result p2

    .line 10108
    invoke-virtual {p0, p1, p3, p2, v0}, Ll/ܿ۬ۧ;->shouldMeasureChild(Landroid/view/View;IILl/ܳ۬ۧ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 10109
    invoke-virtual {p1, p3, p2}, Landroid/view/View;->measure(II)V

    :cond_0
    return-void
.end method

.method public measureChildWithMargins(Landroid/view/View;II)V
    .locals 5

    .line 10195
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܳ۬ۧ;

    .line 10197
    iget-object v1, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    invoke-virtual {v1, p1}, Ll/۬۬ۧ;->getItemDecorInsetsForChild(Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v1

    .line 10198
    iget v2, v1, Landroid/graphics/Rect;->left:I

    iget v3, v1, Landroid/graphics/Rect;->right:I

    add-int/2addr v2, v3

    add-int/2addr v2, p2

    .line 10199
    iget p2, v1, Landroid/graphics/Rect;->top:I

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr p2, v1

    add-int/2addr p2, p3

    .line 10201
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getWidth()I

    move-result p3

    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getWidthMode()I

    move-result v1

    .line 10202
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getPaddingLeft()I

    move-result v3

    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getPaddingRight()I

    move-result v4

    add-int/2addr v4, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v4, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v4, v3

    add-int/2addr v4, v2

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 10204
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->canScrollHorizontally()Z

    move-result v3

    .line 10201
    invoke-static {p3, v1, v4, v2, v3}, Ll/ܿ۬ۧ;->֫(IIIIZ)I

    move-result p3

    .line 10205
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getHeightMode()I

    move-result v2

    .line 10206
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getPaddingTop()I

    move-result v3

    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getPaddingBottom()I

    move-result v4

    add-int/2addr v4, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v4, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v4, v3

    add-int/2addr v4, p2

    iget p2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 10208
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->canScrollVertically()Z

    move-result v3

    .line 10205
    invoke-static {v1, v2, v4, p2, v3}, Ll/ܿ۬ۧ;->֫(IIIIZ)I

    move-result p2

    .line 10209
    invoke-virtual {p0, p1, p3, p2, v0}, Ll/ܿ۬ۧ;->shouldMeasureChild(Landroid/view/View;IILl/ܳ۬ۧ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 10210
    invoke-virtual {p1, p3, p2}, Landroid/view/View;->measure(II)V

    :cond_0
    return-void
.end method

.method public moveView(II)V
    .locals 2

    .line 9684
    invoke-virtual {p0, p1}, Ll/ܿ۬ۧ;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 9689
    invoke-virtual {p0, p1}, Ll/ܿ۬ۧ;->detachViewAt(I)V

    .line 9690
    invoke-virtual {p0, v0, p2}, Ll/ܿ۬ۧ;->attachView(Landroid/view/View;I)V

    return-void

    .line 9686
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot move a child from non-existing index:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object p1, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    .line 9687
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public offsetChildrenHorizontal(I)V
    .locals 1

    .line 9950
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    if-eqz v0, :cond_0

    .line 9951
    invoke-virtual {v0, p1}, Ll/۬۬ۧ;->offsetChildrenHorizontal(I)V

    :cond_0
    return-void
.end method

.method public offsetChildrenVertical(I)V
    .locals 1

    .line 9962
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    if-eqz v0, :cond_0

    .line 9963
    invoke-virtual {v0, p1}, Ll/۬۬ۧ;->offsetChildrenVertical(I)V

    :cond_0
    return-void
.end method

.method public onAdapterChanged(Ll/᩶ۗۧ;Ll/᩶ۗۧ;)V
    .locals 0

    return-void
.end method

.method public onAddFocusables(Ll/۬۬ۧ;Ljava/util/ArrayList;II)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onAttachedToWindow(Ll/۬۬ۧ;)V
    .locals 0

    return-void
.end method

.method public onDetachedFromWindow(Ll/۬۬ۧ;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onDetachedFromWindow(Ll/۬۬ۧ;Ll/ۖ۬ۧ;)V
    .locals 0

    .line 9034
    invoke-virtual {p0, p1}, Ll/ܿ۬ۧ;->onDetachedFromWindow(Ll/۬۬ۧ;)V

    return-void
.end method

.method public onFocusSearchFailed(Landroid/view/View;ILl/ۖ۬ۧ;Ll/᩸۬ۧ;)Landroid/view/View;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 2

    .line 11210
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    iget-object v1, v0, Ll/۬۬ۧ;->mRecycler:Ll/ۖ۬ۧ;

    iget-object v0, v0, Ll/۬۬ۧ;->mState:Ll/᩸۬ۧ;

    invoke-virtual {p0, v1, v0, p1}, Ll/ܿ۬ۧ;->onInitializeAccessibilityEvent(Ll/ۖ۬ۧ;Ll/᩸۬ۧ;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public onInitializeAccessibilityEvent(Ll/ۖ۬ۧ;Ll/᩸۬ۧ;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 11226
    iget-object p1, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    if-eqz p1, :cond_3

    if-nez p3, :cond_0

    goto :goto_1

    :cond_0
    const/4 p2, 0x1

    .line 11229
    invoke-virtual {p1, p2}, Landroid/view/View;->canScrollVertically(I)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    const/4 v0, -0x1

    .line 11230
    invoke-virtual {p1, v0}, Landroid/view/View;->canScrollVertically(I)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    .line 11231
    invoke-virtual {p1, v0}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    .line 11232
    invoke-virtual {p1, p2}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    .line 11229
    :cond_2
    :goto_0
    invoke-virtual {p3, p2}, Landroid/view/accessibility/AccessibilityRecord;->setScrollable(Z)V

    .line 11234
    iget-object p1, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    iget-object p1, p1, Ll/۬۬ۧ;->mAdapter:Ll/᩶ۗۧ;

    if-eqz p1, :cond_3

    .line 11235
    invoke-virtual {p1}, Ll/᩶ۗۧ;->getItemCount()I

    move-result p1

    invoke-virtual {p3, p1}, Landroid/view/accessibility/AccessibilityRecord;->setItemCount(I)V

    :cond_3
    :goto_1
    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Ll/ۖ۬ۧ;Ll/᩸۬ۧ;Ll/ܳ۟;)V
    .locals 3

    .line 11191
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    invoke-virtual {v0, v1}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/16 v0, 0x2000

    .line 11192
    invoke-virtual {p3, v0}, Ll/ܳ۟;->֫(I)V

    .line 11193
    invoke-virtual {p3, v2}, Ll/ܳ۟;->ܺ(Z)V

    .line 11195
    :cond_1
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    invoke-virtual {v0, v2}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    invoke-virtual {v0, v2}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    const/16 v0, 0x1000

    .line 11196
    invoke-virtual {p3, v0}, Ll/ܳ۟;->֫(I)V

    .line 11197
    invoke-virtual {p3, v2}, Ll/ܳ۟;->ܺ(Z)V

    .line 11201
    :cond_3
    invoke-virtual {p0, p1, p2}, Ll/ܿ۬ۧ;->getRowCountForAccessibility(Ll/ۖ۬ۧ;Ll/᩸۬ۧ;)I

    move-result v0

    .line 11202
    invoke-virtual {p0, p1, p2}, Ll/ܿ۬ۧ;->getColumnCountForAccessibility(Ll/ۖ۬ۧ;Ll/᩸۬ۧ;)I

    move-result v1

    .line 11203
    invoke-virtual {p0, p1, p2}, Ll/ܿ۬ۧ;->isLayoutHierarchical(Ll/ۖ۬ۧ;Ll/᩸۬ۧ;)Z

    move-result v2

    .line 11204
    invoke-virtual {p0, p1, p2}, Ll/ܿ۬ۧ;->getSelectionModeForAccessibility(Ll/ۖ۬ۧ;Ll/᩸۬ۧ;)I

    move-result p1

    .line 11201
    invoke-static {v0, v1, p1, v2}, Ll/ܽ۟;->֫(IIIZ)Ll/ܽ۟;

    move-result-object p1

    .line 11205
    invoke-virtual {p3, p1}, Ll/ܳ۟;->֫(Ll/ܽ۟;)V

    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Ll/ܳ۟;)V
    .locals 2

    .line 11161
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    iget-object v1, v0, Ll/۬۬ۧ;->mRecycler:Ll/ۖ۬ۧ;

    iget-object v0, v0, Ll/۬۬ۧ;->mState:Ll/᩸۬ۧ;

    invoke-virtual {p0, v1, v0, p1}, Ll/ܿ۬ۧ;->onInitializeAccessibilityNodeInfo(Ll/ۖ۬ۧ;Ll/᩸۬ۧ;Ll/ܳ۟;)V

    return-void
.end method

.method public onInitializeAccessibilityNodeInfoForItem(Landroid/view/View;Ll/ܳ۟;)V
    .locals 2

    .line 11241
    invoke-static {p1}, Ll/۬۬ۧ;->ۧ(Landroid/view/View;)Ll/ۗ۬ۧ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 11243
    invoke-virtual {v0}, Ll/ۗ۬ۧ;->isRemoved()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/ܿ۬ۧ;->mChildHelper:Ll/᩹᩶ۧ;

    iget-object v0, v0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    .line 367
    iget-object v1, v1, Ll/᩹᩶ۧ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 11244
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    iget-object v1, v0, Ll/۬۬ۧ;->mRecycler:Ll/ۖ۬ۧ;

    iget-object v0, v0, Ll/۬۬ۧ;->mState:Ll/᩸۬ۧ;

    invoke-virtual {p0, v1, v0, p1, p2}, Ll/ܿ۬ۧ;->onInitializeAccessibilityNodeInfoForItem(Ll/ۖ۬ۧ;Ll/᩸۬ۧ;Landroid/view/View;Ll/ܳ۟;)V

    :cond_0
    return-void
.end method

.method public onInitializeAccessibilityNodeInfoForItem(Ll/ۖ۬ۧ;Ll/᩸۬ۧ;Landroid/view/View;Ll/ܳ۟;)V
    .locals 0

    return-void
.end method

.method public onInterceptFocusSearch(Landroid/view/View;I)Landroid/view/View;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onItemsAdded(Ll/۬۬ۧ;II)V
    .locals 0

    return-void
.end method

.method public onItemsChanged(Ll/۬۬ۧ;)V
    .locals 0

    return-void
.end method

.method public onItemsMoved(Ll/۬۬ۧ;III)V
    .locals 0

    return-void
.end method

.method public onItemsRemoved(Ll/۬۬ۧ;II)V
    .locals 0

    return-void
.end method

.method public onItemsUpdated(Ll/۬۬ۧ;II)V
    .locals 0

    return-void
.end method

.method public onItemsUpdated(Ll/۬۬ۧ;IILjava/lang/Object;)V
    .locals 0

    .line 10928
    invoke-virtual {p0, p1, p2, p3}, Ll/ܿ۬ۧ;->onItemsUpdated(Ll/۬۬ۧ;II)V

    return-void
.end method

.method public onLayoutChildren(Ll/ۖ۬ۧ;Ll/᩸۬ۧ;)V
    .locals 0

    return-void
.end method

.method public onLayoutCompleted(Ll/᩸۬ۧ;)V
    .locals 0

    return-void
.end method

.method public onMeasure(Ll/ۖ۬ۧ;Ll/᩸۬ۧ;II)V
    .locals 0

    .line 11058
    iget-object p1, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    invoke-virtual {p1, p3, p4}, Ll/۬۬ۧ;->defaultOnMeasure(II)V

    return-void
.end method

.method public onRequestChildFocus(Ll/۬۬ۧ;Landroid/view/View;Landroid/view/View;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 10819
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->isSmoothScrolling()Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p1}, Ll/۬۬ۧ;->isComputingLayout()Z

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

.method public onRequestChildFocus(Ll/۬۬ۧ;Ll/᩸۬ۧ;Landroid/view/View;Landroid/view/View;)Z
    .locals 0

    .line 10841
    invoke-virtual {p0, p1, p3, p4}, Ll/ܿ۬ۧ;->onRequestChildFocus(Ll/۬۬ۧ;Landroid/view/View;Landroid/view/View;)Z

    move-result p1

    return p1
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 0

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public onScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onSmoothScrollerStopped(Ll/ܶ۬ۧ;)V
    .locals 1

    .line 11125
    iget-object v0, p0, Ll/ܿ۬ۧ;->mSmoothScroller:Ll/ܶ۬ۧ;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    .line 11126
    iput-object p1, p0, Ll/ܿ۬ۧ;->mSmoothScroller:Ll/ܶ۬ۧ;

    :cond_0
    return-void
.end method

.method public performAccessibilityAction(ILandroid/os/Bundle;)Z
    .locals 2

    .line 11350
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    iget-object v1, v0, Ll/۬۬ۧ;->mRecycler:Ll/ۖ۬ۧ;

    iget-object v0, v0, Ll/۬۬ۧ;->mState:Ll/᩸۬ۧ;

    invoke-virtual {p0, v1, v0, p1, p2}, Ll/ܿ۬ۧ;->performAccessibilityAction(Ll/ۖ۬ۧ;Ll/᩸۬ۧ;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public performAccessibilityAction(Ll/ۖ۬ۧ;Ll/᩸۬ۧ;ILandroid/os/Bundle;)Z
    .locals 9

    .line 11366
    iget-object p1, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    const/4 p2, 0x0

    if-nez p1, :cond_0

    return p2

    .line 11370
    :cond_0
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getHeight()I

    move-result p1

    .line 11371
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getWidth()I

    move-result p4

    .line 11372
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 11375
    iget-object v1, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    invoke-virtual {v1}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Matrix;->isIdentity()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    invoke-virtual {v1, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 11377
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result p1

    .line 11378
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result p4

    :cond_1
    const/16 v0, 0x1000

    const/4 v1, 0x1

    if-eq p3, v0, :cond_4

    const/16 v0, 0x2000

    if-eq p3, v0, :cond_2

    const/4 p1, 0x0

    const/4 p3, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    goto :goto_3

    .line 11382
    :cond_2
    iget-object p3, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    const/4 v0, -0x1

    invoke-virtual {p3, v0}, Landroid/view/View;->canScrollVertically(I)Z

    move-result p3

    if-eqz p3, :cond_3

    .line 11383
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getPaddingTop()I

    move-result p3

    sub-int/2addr p1, p3

    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getPaddingBottom()I

    move-result p3

    sub-int/2addr p1, p3

    neg-int p1, p1

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    .line 11385
    :goto_0
    iget-object p3, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    invoke-virtual {p3, v0}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result p3

    if-eqz p3, :cond_6

    .line 11386
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getPaddingLeft()I

    move-result p3

    sub-int/2addr p4, p3

    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getPaddingRight()I

    move-result p3

    sub-int/2addr p4, p3

    neg-int p3, p4

    move v8, p3

    move p3, p1

    move p1, v8

    goto :goto_2

    .line 11390
    :cond_4
    iget-object p3, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    invoke-virtual {p3, v1}, Landroid/view/View;->canScrollVertically(I)Z

    move-result p3

    if-eqz p3, :cond_5

    .line 11391
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getPaddingTop()I

    move-result p3

    sub-int/2addr p1, p3

    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getPaddingBottom()I

    move-result p3

    sub-int/2addr p1, p3

    goto :goto_1

    :cond_5
    const/4 p1, 0x0

    .line 11393
    :goto_1
    iget-object p3, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    invoke-virtual {p3, v1}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result p3

    if-eqz p3, :cond_6

    .line 11394
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getPaddingLeft()I

    move-result p3

    sub-int/2addr p4, p3

    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getPaddingRight()I

    move-result p3

    sub-int/2addr p4, p3

    move p3, p1

    move p1, p4

    :goto_2
    move v3, p1

    move v4, p3

    goto :goto_3

    :cond_6
    move p3, p1

    const/4 p1, 0x0

    move v4, p3

    const/4 v3, 0x0

    :goto_3
    if-nez v4, :cond_7

    if-nez v3, :cond_7

    return p2

    .line 11401
    :cond_7
    iget-object v2, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    const/high16 v6, -0x80000000

    const/4 v7, 0x1

    const/4 v5, 0x0

    invoke-virtual/range {v2 .. v7}, Ll/۬۬ۧ;->smoothScrollBy(IILandroid/view/animation/Interpolator;IZ)V

    return v1
.end method

.method public performAccessibilityActionForItem(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 7

    .line 11408
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    iget-object v2, v0, Ll/۬۬ۧ;->mRecycler:Ll/ۖ۬ۧ;

    iget-object v3, v0, Ll/۬۬ۧ;->mState:Ll/᩸۬ۧ;

    move-object v1, p0

    move-object v4, p1

    move v5, p2

    move-object v6, p3

    invoke-virtual/range {v1 .. v6}, Ll/ܿ۬ۧ;->performAccessibilityActionForItem(Ll/ۖ۬ۧ;Ll/᩸۬ۧ;Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public performAccessibilityActionForItem(Ll/ۖ۬ۧ;Ll/᩸۬ۧ;Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public postOnAnimation(Ljava/lang/Runnable;)V
    .locals 2

    .line 8960
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    if-eqz v0, :cond_0

    .line 8961
    sget v1, Ll/ܿ᩺;->֫:I

    .line 1359
    invoke-virtual {v0, p1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public removeAllViews()V
    .locals 2

    .line 9479
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v0

    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_0

    .line 9481
    iget-object v1, p0, Ll/ܿ۬ۧ;->mChildHelper:Ll/᩹᩶ۧ;

    invoke-virtual {v1, v0}, Ll/᩹᩶ۧ;->ᩳ(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public removeAndRecycleAllViews(Ll/ۖ۬ۧ;)V
    .locals 2

    .line 11151
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v0

    :cond_0
    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_1

    .line 11152
    invoke-virtual {p0, v0}, Ll/ܿ۬ۧ;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 11153
    invoke-static {v1}, Ll/۬۬ۧ;->ۧ(Landroid/view/View;)Ll/ۗ۬ۧ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۗ۬ۧ;->shouldIgnore()Z

    move-result v1

    if-nez v1, :cond_0

    .line 11154
    invoke-virtual {p0, v0, p1}, Ll/ܿ۬ۧ;->removeAndRecycleViewAt(ILl/ۖ۬ۧ;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public removeAndRecycleScrapInt(Ll/ۖ۬ۧ;)V
    .locals 7

    .line 7244
    iget-object v0, p1, Ll/ۖ۬ۧ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v2, v1, -0x1

    :goto_0
    if-ltz v2, :cond_3

    .line 7248
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۗ۬ۧ;

    iget-object v3, v3, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    .line 10059
    invoke-static {v3}, Ll/۬۬ۧ;->ۧ(Landroid/view/View;)Ll/ۗ۬ۧ;

    move-result-object v4

    .line 10060
    invoke-virtual {v4}, Ll/ۗ۬ۧ;->shouldIgnore()Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    .line 10068
    invoke-virtual {v4, v5}, Ll/ۗ۬ۧ;->setIsRecyclable(Z)V

    .line 10069
    invoke-virtual {v4}, Ll/ۗ۬ۧ;->isTmpDetached()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 10070
    iget-object v6, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    invoke-virtual {v6, v3, v5}, Ll/۬۬ۧ;->removeDetachedView(Landroid/view/View;Z)V

    .line 10072
    :cond_1
    iget-object v6, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    iget-object v6, v6, Ll/۬۬ۧ;->mItemAnimator:Ll/᩺ۗۧ;

    if-eqz v6, :cond_2

    .line 10073
    invoke-virtual {v6, v4}, Ll/᩺ۗۧ;->ۧ(Ll/ۗ۬ۧ;)V

    :cond_2
    const/4 v6, 0x1

    .line 10075
    invoke-virtual {v4, v6}, Ll/ۗ۬ۧ;->setIsRecyclable(Z)V

    .line 7190
    invoke-static {v3}, Ll/۬۬ۧ;->ۧ(Landroid/view/View;)Ll/ۗ۬ۧ;

    move-result-object v3

    const/4 v4, 0x0

    .line 7191
    iput-object v4, v3, Ll/ۗ۬ۧ;->mScrapContainer:Ll/ۖ۬ۧ;

    .line 7192
    iput-boolean v5, v3, Ll/ۗ۬ۧ;->mInChangeScrap:Z

    .line 7193
    invoke-virtual {v3}, Ll/ۗ۬ۧ;->clearReturnedFromScrapFlag()V

    .line 7194
    invoke-virtual {p1, v3}, Ll/ۖ۬ۧ;->֫(Ll/ۗ۬ۧ;)V

    :goto_1
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    .line 7252
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 7253
    iget-object p1, p1, Ll/ۖ۬ۧ;->ܽ:Ljava/util/ArrayList;

    if-eqz p1, :cond_4

    .line 7254
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    :cond_4
    if-lez v1, :cond_5

    .line 10080
    iget-object p1, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_5
    return-void
.end method

.method public removeAndRecycleView(Landroid/view/View;Ll/ۖ۬ۧ;)V
    .locals 0

    .line 9728
    invoke-virtual {p0, p1}, Ll/ܿ۬ۧ;->removeView(Landroid/view/View;)V

    .line 9729
    invoke-virtual {p2, p1}, Ll/ۖ۬ۧ;->֫(Landroid/view/View;)V

    return-void
.end method

.method public removeAndRecycleViewAt(ILl/ۖ۬ۧ;)V
    .locals 1

    .line 9739
    invoke-virtual {p0, p1}, Ll/ܿ۬ۧ;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 9740
    invoke-virtual {p0, p1}, Ll/ܿ۬ۧ;->removeViewAt(I)V

    .line 9741
    invoke-virtual {p2, v0}, Ll/ۖ۬ۧ;->֫(Landroid/view/View;)V

    return-void
.end method

.method public removeCallbacks(Ljava/lang/Runnable;)Z
    .locals 1

    .line 8978
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    if-eqz v0, :cond_0

    .line 8979
    invoke-virtual {v0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public removeDetachedView(Landroid/view/View;)V
    .locals 2

    .line 9674
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ll/۬۬ۧ;->removeDetachedView(Landroid/view/View;Z)V

    return-void
.end method

.method public removeView(Landroid/view/View;)V
    .locals 1

    .line 9455
    iget-object v0, p0, Ll/ܿ۬ۧ;->mChildHelper:Ll/᩹᩶ۧ;

    invoke-virtual {v0, p1}, Ll/᩹᩶ۧ;->ܽ(Landroid/view/View;)V

    return-void
.end method

.method public removeViewAt(I)V
    .locals 1

    .line 9467
    invoke-virtual {p0, p1}, Ll/ܿ۬ۧ;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 9469
    iget-object v0, p0, Ll/ܿ۬ۧ;->mChildHelper:Ll/᩹᩶ۧ;

    invoke-virtual {v0, p1}, Ll/᩹᩶ۧ;->ᩳ(I)V

    :cond_0
    return-void
.end method

.method public requestChildRectangleOnScreen(Ll/۬۬ۧ;Landroid/view/View;Landroid/graphics/Rect;Z)Z
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    .line 10708
    invoke-virtual/range {v0 .. v5}, Ll/ܿ۬ۧ;->requestChildRectangleOnScreen(Ll/۬۬ۧ;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z

    move-result p1

    return p1
.end method

.method public requestChildRectangleOnScreen(Ll/۬۬ۧ;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z
    .locals 2

    .line 10729
    invoke-direct {p0, p2, p3}, Ll/ܿ۬ۧ;->֫(Landroid/view/View;Landroid/graphics/Rect;)[I

    move-result-object p2

    const/4 p3, 0x0

    .line 10731
    aget v0, p2, p3

    const/4 v1, 0x1

    .line 10732
    aget p2, p2, v1

    if-eqz p5, :cond_0

    .line 10733
    invoke-direct {p0, p1, v0, p2}, Ll/ܿ۬ۧ;->֫(Ll/۬۬ۧ;II)Z

    move-result p5

    if-eqz p5, :cond_1

    :cond_0
    if-nez v0, :cond_2

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    return p3

    :cond_2
    :goto_0
    if-eqz p4, :cond_3

    .line 10736
    invoke-virtual {p1, v0, p2}, Ll/۬۬ۧ;->scrollBy(II)V

    goto :goto_1

    .line 10738
    :cond_3
    invoke-virtual {p1, v0, p2}, Ll/۬۬ۧ;->smoothScrollBy(II)V

    :goto_1
    return v1
.end method

.method public requestLayout()V
    .locals 1

    .line 8667
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    if-eqz v0, :cond_0

    .line 8668
    invoke-virtual {v0}, Ll/۬۬ۧ;->requestLayout()V

    :cond_0
    return-void
.end method

.method public requestSimpleAnimationsInNextLayout()V
    .locals 1

    const/4 v0, 0x1

    .line 11278
    iput-boolean v0, p0, Ll/ܿ۬ۧ;->mRequestedSimpleAnimations:Z

    return-void
.end method

.method public scrollHorizontallyBy(ILl/ۖ۬ۧ;Ll/᩸۬ۧ;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public scrollToPosition(I)V
    .locals 0

    .line 9256
    sget p1, Ll/۬۬ۧ;->HORIZONTAL:I

    return-void
.end method

.method public scrollVerticallyBy(ILl/ۖ۬ۧ;Ll/᩸۬ۧ;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public setAutoMeasureEnabled(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 8736
    iput-boolean p1, p0, Ll/ܿ۬ۧ;->mAutoMeasure:Z

    return-void
.end method

.method public setExactMeasureSpecsFrom(Ll/۬۬ۧ;)V
    .locals 2

    .line 11459
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 11460
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    invoke-static {p1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    .line 11458
    invoke-virtual {p0, v0, p1}, Ll/ܿ۬ۧ;->setMeasureSpecs(II)V

    return-void
.end method

.method public final setItemPrefetchEnabled(Z)V
    .locals 1

    .line 8856
    iget-boolean v0, p0, Ll/ܿ۬ۧ;->mItemPrefetchEnabled:Z

    if-eq p1, v0, :cond_0

    .line 8857
    iput-boolean p1, p0, Ll/ܿ۬ۧ;->mItemPrefetchEnabled:Z

    const/4 p1, 0x0

    .line 8858
    iput p1, p0, Ll/ܿ۬ۧ;->mPrefetchMaxCountObserved:I

    .line 8859
    iget-object p1, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    if-eqz p1, :cond_0

    .line 8860
    iget-object p1, p1, Ll/۬۬ۧ;->mRecycler:Ll/ۖ۬ۧ;

    invoke-virtual {p1}, Ll/ۖ۬ۧ;->ܳ()V

    :cond_0
    return-void
.end method

.method public setMeasureSpecs(II)V
    .locals 1

    .line 8578
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    iput v0, p0, Ll/ܿ۬ۧ;->mWidth:I

    .line 8579
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p1

    iput p1, p0, Ll/ܿ۬ۧ;->mWidthMode:I

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 8580
    sget-boolean p1, Ll/۬۬ۧ;->ALLOW_SIZE_IN_UNSPECIFIED_SPEC:Z

    if-nez p1, :cond_0

    .line 8581
    iput v0, p0, Ll/ܿ۬ۧ;->mWidth:I

    .line 8584
    :cond_0
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    iput p1, p0, Ll/ܿ۬ۧ;->mHeight:I

    .line 8585
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p1

    iput p1, p0, Ll/ܿ۬ۧ;->mHeightMode:I

    if-nez p1, :cond_1

    .line 8586
    sget-boolean p1, Ll/۬۬ۧ;->ALLOW_SIZE_IN_UNSPECIFIED_SPEC:Z

    if-nez p1, :cond_1

    .line 8587
    iput v0, p0, Ll/ܿ۬ۧ;->mHeight:I

    :cond_1
    return-void
.end method

.method public setMeasuredDimension(II)V
    .locals 1

    .line 11069
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    invoke-static {v0, p1, p2}, Ll/۬۬ۧ;->֫(Ll/۬۬ۧ;II)V

    return-void
.end method

.method public setMeasuredDimension(Landroid/graphics/Rect;II)V
    .locals 2

    .line 8656
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getPaddingLeft()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getPaddingRight()I

    move-result v0

    add-int/2addr v0, v1

    .line 8657
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getPaddingTop()I

    move-result v1

    add-int/2addr v1, p1

    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getPaddingBottom()I

    move-result p1

    add-int/2addr p1, v1

    .line 8658
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getMinimumWidth()I

    move-result v1

    invoke-static {p2, v0, v1}, Ll/ܿ۬ۧ;->֫(III)I

    move-result p2

    .line 8659
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getMinimumHeight()I

    move-result v0

    invoke-static {p3, p1, v0}, Ll/ܿ۬ۧ;->֫(III)I

    move-result p1

    .line 8660
    invoke-virtual {p0, p2, p1}, Ll/ܿ۬ۧ;->setMeasuredDimension(II)V

    return-void
.end method

.method public setMeasuredDimensionFromChildren(II)V
    .locals 8

    .line 8605
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    .line 8607
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    invoke-virtual {v0, p1, p2}, Ll/۬۬ۧ;->defaultOnMeasure(II)V

    return-void

    :cond_0
    const/high16 v1, -0x80000000

    const/high16 v2, -0x80000000

    const v3, 0x7fffffff

    const v4, 0x7fffffff

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v0, :cond_5

    .line 8616
    invoke-virtual {p0, v5}, Ll/ܿ۬ۧ;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 8617
    iget-object v7, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    iget-object v7, v7, Ll/۬۬ۧ;->mTempRect:Landroid/graphics/Rect;

    .line 8618
    invoke-virtual {p0, v6, v7}, Ll/ܿ۬ۧ;->getDecoratedBoundsWithMargins(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 8619
    iget v6, v7, Landroid/graphics/Rect;->left:I

    if-ge v6, v3, :cond_1

    move v3, v6

    .line 8622
    :cond_1
    iget v6, v7, Landroid/graphics/Rect;->right:I

    if-le v6, v1, :cond_2

    move v1, v6

    .line 8625
    :cond_2
    iget v6, v7, Landroid/graphics/Rect;->top:I

    if-ge v6, v4, :cond_3

    move v4, v6

    .line 8628
    :cond_3
    iget v6, v7, Landroid/graphics/Rect;->bottom:I

    if-le v6, v2, :cond_4

    move v2, v6

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 8632
    :cond_5
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    iget-object v0, v0, Ll/۬۬ۧ;->mTempRect:Landroid/graphics/Rect;

    invoke-virtual {v0, v3, v4, v1, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 8633
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    iget-object v0, v0, Ll/۬۬ۧ;->mTempRect:Landroid/graphics/Rect;

    invoke-virtual {p0, v0, p1, p2}, Ll/ܿ۬ۧ;->setMeasuredDimension(Landroid/graphics/Rect;II)V

    return-void
.end method

.method public setMeasurementCacheEnabled(Z)V
    .locals 0

    .line 10162
    iput-boolean p1, p0, Ll/ܿ۬ۧ;->mMeasurementCacheEnabled:Z

    return-void
.end method

.method public setRecyclerView(Ll/۬۬ۧ;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 8563
    iput-object p1, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    .line 8564
    iput-object p1, p0, Ll/ܿ۬ۧ;->mChildHelper:Ll/᩹᩶ۧ;

    const/4 p1, 0x0

    .line 8565
    iput p1, p0, Ll/ܿ۬ۧ;->mWidth:I

    .line 8566
    iput p1, p0, Ll/ܿ۬ۧ;->mHeight:I

    goto :goto_0

    .line 8568
    :cond_0
    iput-object p1, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    .line 8569
    iget-object v0, p1, Ll/۬۬ۧ;->mChildHelper:Ll/᩹᩶ۧ;

    iput-object v0, p0, Ll/ܿ۬ۧ;->mChildHelper:Ll/᩹᩶ۧ;

    .line 8570
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    iput v0, p0, Ll/ܿ۬ۧ;->mWidth:I

    .line 8571
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    iput p1, p0, Ll/ܿ۬ۧ;->mHeight:I

    :goto_0
    const/high16 p1, 0x40000000    # 2.0f

    .line 8573
    iput p1, p0, Ll/ܿ۬ۧ;->mWidthMode:I

    .line 8574
    iput p1, p0, Ll/ܿ۬ۧ;->mHeightMode:I

    return-void
.end method

.method public shouldMeasureChild(Landroid/view/View;IILl/ܳ۬ۧ;)Z
    .locals 2

    .line 10135
    invoke-virtual {p1}, Landroid/view/View;->isLayoutRequested()Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/ܿ۬ۧ;->mMeasurementCacheEnabled:Z

    if-eqz v0, :cond_1

    .line 10137
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    iget v1, p4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-static {v0, p2, v1}, Ll/ܿ۬ۧ;->ۧ(III)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 10138
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    iget p2, p4, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-static {p1, p3, p2}, Ll/ܿ۬ۧ;->ۧ(III)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public shouldMeasureTwice()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public shouldReMeasureChild(Landroid/view/View;IILl/ܳ۬ۧ;)Z
    .locals 2

    .line 10120
    iget-boolean v0, p0, Ll/ܿ۬ۧ;->mMeasurementCacheEnabled:Z

    if-eqz v0, :cond_1

    .line 10121
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iget v1, p4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-static {v0, p2, v1}, Ll/ܿ۬ۧ;->ۧ(III)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 10122
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    iget p2, p4, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-static {p1, p3, p2}, Ll/ܿ۬ۧ;->ۧ(III)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public smoothScrollToPosition(Ll/۬۬ۧ;Ll/᩸۬ۧ;I)V
    .locals 0

    return-void
.end method

.method public startSmoothScroll(Ll/ܶ۬ۧ;)V
    .locals 1

    .line 9289
    iget-object v0, p0, Ll/ܿ۬ۧ;->mSmoothScroller:Ll/ܶ۬ۧ;

    if-eqz v0, :cond_0

    if-eq p1, v0, :cond_0

    .line 9290
    invoke-virtual {v0}, Ll/ܶ۬ۧ;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 9291
    iget-object v0, p0, Ll/ܿ۬ۧ;->mSmoothScroller:Ll/ܶ۬ۧ;

    invoke-virtual {v0}, Ll/ܶ۬ۧ;->stop()V

    .line 9293
    :cond_0
    iput-object p1, p0, Ll/ܿ۬ۧ;->mSmoothScroller:Ll/ܶ۬ۧ;

    .line 9294
    iget-object v0, p0, Ll/ܿ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    invoke-virtual {p1, v0, p0}, Ll/ܶ۬ۧ;->start(Ll/۬۬ۧ;Ll/ܿ۬ۧ;)V

    return-void
.end method

.method public stopIgnoringView(Landroid/view/View;)V
    .locals 1

    .line 10005
    invoke-static {p1}, Ll/۬۬ۧ;->ۧ(Landroid/view/View;)Ll/ۗ۬ۧ;

    move-result-object p1

    .line 10006
    invoke-virtual {p1}, Ll/ۗ۬ۧ;->stopIgnoring()V

    .line 10007
    invoke-virtual {p1}, Ll/ۗ۬ۧ;->resetInternal()V

    const/4 v0, 0x4

    .line 10008
    invoke-virtual {p1, v0}, Ll/ۗ۬ۧ;->addFlags(I)V

    return-void
.end method

.method public stopSmoothScroller()V
    .locals 1

    .line 11119
    iget-object v0, p0, Ll/ܿ۬ۧ;->mSmoothScroller:Ll/ܶ۬ۧ;

    if-eqz v0, :cond_0

    .line 11120
    invoke-virtual {v0}, Ll/ܶ۬ۧ;->stop()V

    :cond_0
    return-void
.end method

.method public supportsPredictiveItemAnimations()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
