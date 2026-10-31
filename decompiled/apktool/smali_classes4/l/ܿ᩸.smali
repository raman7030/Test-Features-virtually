.class public Ll/ܿ᩸;
.super Landroid/view/ViewGroup;
.source "Z1JV"


# static fields
.field public static final DEBUG:Z = false

.field public static final DEBUG_DRAW_CONSTRAINTS:Z = false

.field public static final DESIGN_INFO_ID:I = 0x0

.field public static final MEASURE:Z = false

.field public static final TAG:Ljava/lang/String; = "ConstraintLayout"

.field public static final USE_CONSTRAINTS_HELPER:Z = true

.field public static final VERSION:Ljava/lang/String; = "ConstraintLayout-2.0.4"


# instance fields
.field public mChildrenByIds:Landroid/util/SparseArray;

.field public mConstraintHelpers:Ljava/util/ArrayList;

.field public mConstraintLayoutSpec:Ll/ۜ᩸;

.field public mConstraintSet:Ll/ۘ᩸;

.field public mConstraintSetId:I

.field public mConstraintsChangedListener:Ll/֡᩸;

.field public mDesignIds:Ljava/util/HashMap;

.field public mDirtyHierarchy:Z

.field public mLastMeasureHeight:I

.field public mLastMeasureHeightMode:I

.field public mLastMeasureHeightSize:I

.field public mLastMeasureWidth:I

.field public mLastMeasureWidthMode:I

.field public mLastMeasureWidthSize:I

.field public mLayoutWidget:Ll/᩸۠;

.field public mMaxHeight:I

.field public mMaxWidth:I

.field public mMeasurer:Ll/ᩳ᩸;

.field public mMetrics:Ll/ܳ۠;

.field public mMinHeight:I

.field public mMinWidth:I

.field public mOnMeasureHeightMeasureSpec:I

.field public mOnMeasureWidthMeasureSpec:I

.field public mOptimizationLevel:I

.field public mTempMapIdToWidget:Landroid/util/SparseArray;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 563
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 494
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Ll/ܿ᩸;->mChildrenByIds:Landroid/util/SparseArray;

    .line 497
    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Ll/ܿ᩸;->mConstraintHelpers:Ljava/util/ArrayList;

    .line 499
    new-instance p1, Ll/᩸۠;

    invoke-direct {p1}, Ll/᩸۠;-><init>()V

    iput-object p1, p0, Ll/ܿ᩸;->mLayoutWidget:Ll/᩸۠;

    const/4 p1, 0x0

    .line 501
    iput p1, p0, Ll/ܿ᩸;->mMinWidth:I

    .line 502
    iput p1, p0, Ll/ܿ᩸;->mMinHeight:I

    const v0, 0x7fffffff

    .line 503
    iput v0, p0, Ll/ܿ᩸;->mMaxWidth:I

    .line 504
    iput v0, p0, Ll/ܿ᩸;->mMaxHeight:I

    const/4 v0, 0x1

    .line 506
    iput-boolean v0, p0, Ll/ܿ᩸;->mDirtyHierarchy:Z

    const/16 v0, 0x101

    .line 507
    iput v0, p0, Ll/ܿ᩸;->mOptimizationLevel:I

    const/4 v0, 0x0

    .line 508
    iput-object v0, p0, Ll/ܿ᩸;->mConstraintSet:Ll/ۘ᩸;

    .line 509
    iput-object v0, p0, Ll/ܿ᩸;->mConstraintLayoutSpec:Ll/ۜ᩸;

    const/4 v1, -0x1

    .line 511
    iput v1, p0, Ll/ܿ᩸;->mConstraintSetId:I

    .line 513
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Ll/ܿ᩸;->mDesignIds:Ljava/util/HashMap;

    .line 516
    iput v1, p0, Ll/ܿ᩸;->mLastMeasureWidth:I

    .line 517
    iput v1, p0, Ll/ܿ᩸;->mLastMeasureHeight:I

    .line 518
    iput v1, p0, Ll/ܿ᩸;->mLastMeasureWidthSize:I

    .line 519
    iput v1, p0, Ll/ܿ᩸;->mLastMeasureHeightSize:I

    .line 520
    iput p1, p0, Ll/ܿ᩸;->mLastMeasureWidthMode:I

    .line 521
    iput p1, p0, Ll/ܿ᩸;->mLastMeasureHeightMode:I

    .line 522
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    iput-object v1, p0, Ll/ܿ᩸;->mTempMapIdToWidget:Landroid/util/SparseArray;

    .line 921
    new-instance v1, Ll/ᩳ᩸;

    invoke-direct {v1, p0, p0}, Ll/ᩳ᩸;-><init>(Ll/ܿ᩸;Ll/ܿ᩸;)V

    iput-object v1, p0, Ll/ܿ᩸;->mMeasurer:Ll/ᩳ᩸;

    .line 1533
    iput p1, p0, Ll/ܿ᩸;->mOnMeasureWidthMeasureSpec:I

    .line 1534
    iput p1, p0, Ll/ܿ᩸;->mOnMeasureHeightMeasureSpec:I

    .line 564
    invoke-direct {p0, v0, p1, p1}, Ll/ܿ᩸;->֫(Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 568
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 494
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Ll/ܿ᩸;->mChildrenByIds:Landroid/util/SparseArray;

    .line 497
    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Ll/ܿ᩸;->mConstraintHelpers:Ljava/util/ArrayList;

    .line 499
    new-instance p1, Ll/᩸۠;

    invoke-direct {p1}, Ll/᩸۠;-><init>()V

    iput-object p1, p0, Ll/ܿ᩸;->mLayoutWidget:Ll/᩸۠;

    const/4 p1, 0x0

    .line 501
    iput p1, p0, Ll/ܿ᩸;->mMinWidth:I

    .line 502
    iput p1, p0, Ll/ܿ᩸;->mMinHeight:I

    const v0, 0x7fffffff

    .line 503
    iput v0, p0, Ll/ܿ᩸;->mMaxWidth:I

    .line 504
    iput v0, p0, Ll/ܿ᩸;->mMaxHeight:I

    const/4 v0, 0x1

    .line 506
    iput-boolean v0, p0, Ll/ܿ᩸;->mDirtyHierarchy:Z

    const/16 v0, 0x101

    .line 507
    iput v0, p0, Ll/ܿ᩸;->mOptimizationLevel:I

    const/4 v0, 0x0

    .line 508
    iput-object v0, p0, Ll/ܿ᩸;->mConstraintSet:Ll/ۘ᩸;

    .line 509
    iput-object v0, p0, Ll/ܿ᩸;->mConstraintLayoutSpec:Ll/ۜ᩸;

    const/4 v0, -0x1

    .line 511
    iput v0, p0, Ll/ܿ᩸;->mConstraintSetId:I

    .line 513
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Ll/ܿ᩸;->mDesignIds:Ljava/util/HashMap;

    .line 516
    iput v0, p0, Ll/ܿ᩸;->mLastMeasureWidth:I

    .line 517
    iput v0, p0, Ll/ܿ᩸;->mLastMeasureHeight:I

    .line 518
    iput v0, p0, Ll/ܿ᩸;->mLastMeasureWidthSize:I

    .line 519
    iput v0, p0, Ll/ܿ᩸;->mLastMeasureHeightSize:I

    .line 520
    iput p1, p0, Ll/ܿ᩸;->mLastMeasureWidthMode:I

    .line 521
    iput p1, p0, Ll/ܿ᩸;->mLastMeasureHeightMode:I

    .line 522
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Ll/ܿ᩸;->mTempMapIdToWidget:Landroid/util/SparseArray;

    .line 921
    new-instance v0, Ll/ᩳ᩸;

    invoke-direct {v0, p0, p0}, Ll/ᩳ᩸;-><init>(Ll/ܿ᩸;Ll/ܿ᩸;)V

    iput-object v0, p0, Ll/ܿ᩸;->mMeasurer:Ll/ᩳ᩸;

    .line 1533
    iput p1, p0, Ll/ܿ᩸;->mOnMeasureWidthMeasureSpec:I

    .line 1534
    iput p1, p0, Ll/ܿ᩸;->mOnMeasureHeightMeasureSpec:I

    .line 569
    invoke-direct {p0, p2, p1, p1}, Ll/ܿ᩸;->֫(Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 573
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 494
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Ll/ܿ᩸;->mChildrenByIds:Landroid/util/SparseArray;

    .line 497
    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Ll/ܿ᩸;->mConstraintHelpers:Ljava/util/ArrayList;

    .line 499
    new-instance p1, Ll/᩸۠;

    invoke-direct {p1}, Ll/᩸۠;-><init>()V

    iput-object p1, p0, Ll/ܿ᩸;->mLayoutWidget:Ll/᩸۠;

    const/4 p1, 0x0

    .line 501
    iput p1, p0, Ll/ܿ᩸;->mMinWidth:I

    .line 502
    iput p1, p0, Ll/ܿ᩸;->mMinHeight:I

    const v0, 0x7fffffff

    .line 503
    iput v0, p0, Ll/ܿ᩸;->mMaxWidth:I

    .line 504
    iput v0, p0, Ll/ܿ᩸;->mMaxHeight:I

    const/4 v0, 0x1

    .line 506
    iput-boolean v0, p0, Ll/ܿ᩸;->mDirtyHierarchy:Z

    const/16 v0, 0x101

    .line 507
    iput v0, p0, Ll/ܿ᩸;->mOptimizationLevel:I

    const/4 v0, 0x0

    .line 508
    iput-object v0, p0, Ll/ܿ᩸;->mConstraintSet:Ll/ۘ᩸;

    .line 509
    iput-object v0, p0, Ll/ܿ᩸;->mConstraintLayoutSpec:Ll/ۜ᩸;

    const/4 v0, -0x1

    .line 511
    iput v0, p0, Ll/ܿ᩸;->mConstraintSetId:I

    .line 513
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Ll/ܿ᩸;->mDesignIds:Ljava/util/HashMap;

    .line 516
    iput v0, p0, Ll/ܿ᩸;->mLastMeasureWidth:I

    .line 517
    iput v0, p0, Ll/ܿ᩸;->mLastMeasureHeight:I

    .line 518
    iput v0, p0, Ll/ܿ᩸;->mLastMeasureWidthSize:I

    .line 519
    iput v0, p0, Ll/ܿ᩸;->mLastMeasureHeightSize:I

    .line 520
    iput p1, p0, Ll/ܿ᩸;->mLastMeasureWidthMode:I

    .line 521
    iput p1, p0, Ll/ܿ᩸;->mLastMeasureHeightMode:I

    .line 522
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Ll/ܿ᩸;->mTempMapIdToWidget:Landroid/util/SparseArray;

    .line 921
    new-instance v0, Ll/ᩳ᩸;

    invoke-direct {v0, p0, p0}, Ll/ᩳ᩸;-><init>(Ll/ܿ᩸;Ll/ܿ᩸;)V

    iput-object v0, p0, Ll/ܿ᩸;->mMeasurer:Ll/ᩳ᩸;

    .line 1533
    iput p1, p0, Ll/ܿ᩸;->mOnMeasureWidthMeasureSpec:I

    .line 1534
    iput p1, p0, Ll/ܿ᩸;->mOnMeasureHeightMeasureSpec:I

    .line 574
    invoke-direct {p0, p2, p3, p1}, Ll/ܿ᩸;->֫(Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 579
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 494
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Ll/ܿ᩸;->mChildrenByIds:Landroid/util/SparseArray;

    .line 497
    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Ll/ܿ᩸;->mConstraintHelpers:Ljava/util/ArrayList;

    .line 499
    new-instance p1, Ll/᩸۠;

    invoke-direct {p1}, Ll/᩸۠;-><init>()V

    iput-object p1, p0, Ll/ܿ᩸;->mLayoutWidget:Ll/᩸۠;

    const/4 p1, 0x0

    .line 501
    iput p1, p0, Ll/ܿ᩸;->mMinWidth:I

    .line 502
    iput p1, p0, Ll/ܿ᩸;->mMinHeight:I

    const v0, 0x7fffffff

    .line 503
    iput v0, p0, Ll/ܿ᩸;->mMaxWidth:I

    .line 504
    iput v0, p0, Ll/ܿ᩸;->mMaxHeight:I

    const/4 v0, 0x1

    .line 506
    iput-boolean v0, p0, Ll/ܿ᩸;->mDirtyHierarchy:Z

    const/16 v0, 0x101

    .line 507
    iput v0, p0, Ll/ܿ᩸;->mOptimizationLevel:I

    const/4 v0, 0x0

    .line 508
    iput-object v0, p0, Ll/ܿ᩸;->mConstraintSet:Ll/ۘ᩸;

    .line 509
    iput-object v0, p0, Ll/ܿ᩸;->mConstraintLayoutSpec:Ll/ۜ᩸;

    const/4 v0, -0x1

    .line 511
    iput v0, p0, Ll/ܿ᩸;->mConstraintSetId:I

    .line 513
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Ll/ܿ᩸;->mDesignIds:Ljava/util/HashMap;

    .line 516
    iput v0, p0, Ll/ܿ᩸;->mLastMeasureWidth:I

    .line 517
    iput v0, p0, Ll/ܿ᩸;->mLastMeasureHeight:I

    .line 518
    iput v0, p0, Ll/ܿ᩸;->mLastMeasureWidthSize:I

    .line 519
    iput v0, p0, Ll/ܿ᩸;->mLastMeasureHeightSize:I

    .line 520
    iput p1, p0, Ll/ܿ᩸;->mLastMeasureWidthMode:I

    .line 521
    iput p1, p0, Ll/ܿ᩸;->mLastMeasureHeightMode:I

    .line 522
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Ll/ܿ᩸;->mTempMapIdToWidget:Landroid/util/SparseArray;

    .line 921
    new-instance v0, Ll/ᩳ᩸;

    invoke-direct {v0, p0, p0}, Ll/ᩳ᩸;-><init>(Ll/ܿ᩸;Ll/ܿ᩸;)V

    iput-object v0, p0, Ll/ܿ᩸;->mMeasurer:Ll/ᩳ᩸;

    .line 1533
    iput p1, p0, Ll/ܿ᩸;->mOnMeasureWidthMeasureSpec:I

    .line 1534
    iput p1, p0, Ll/ܿ᩸;->mOnMeasureHeightMeasureSpec:I

    .line 580
    invoke-direct {p0, p2, p3, p4}, Ll/ܿ᩸;->֫(Landroid/util/AttributeSet;II)V

    return-void
.end method

.method private ֫()I
    .locals 4

    .line 1716
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    add-int/2addr v2, v0

    .line 1720
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int/2addr v1, v0

    if-lez v1, :cond_0

    return v1

    :cond_0
    return v2
.end method

.method public static synthetic ֫(Ll/ܿ᩸;)I
    .locals 0

    .line 482
    iget p0, p0, Ll/ܿ᩸;->mOptimizationLevel:I

    return p0
.end method

.method private final ֫(I)Ll/ܶ۠;
    .locals 1

    if-nez p1, :cond_0

    .line 1496
    iget-object p1, p0, Ll/ܿ᩸;->mLayoutWidget:Ll/᩸۠;

    return-object p1

    .line 1498
    :cond_0
    iget-object v0, p0, Ll/ܿ᩸;->mChildrenByIds:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    .line 1500
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    if-eq v0, p0, :cond_1

    .line 1501
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-ne p1, p0, :cond_1

    .line 1502
    invoke-virtual {p0, v0}, Ll/ܿ᩸;->onViewAdded(Landroid/view/View;)V

    :cond_1
    if-ne v0, p0, :cond_2

    .line 1506
    iget-object p1, p0, Ll/ܿ᩸;->mLayoutWidget:Ll/᩸۠;

    return-object p1

    :cond_2
    if-nez v0, :cond_3

    const/4 p1, 0x0

    return-object p1

    .line 1508
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Ll/ܽ᩸;

    iget-object p1, p1, Ll/ܽ᩸;->ۛ֫:Ll/ܶ۠;

    return-object p1
.end method

.method private ֫(Landroid/util/AttributeSet;II)V
    .locals 5

    .line 924
    iget-object v0, p0, Ll/ܿ᩸;->mLayoutWidget:Ll/᩸۠;

    invoke-virtual {v0, p0}, Ll/ܶ۠;->֫(Landroid/view/View;)V

    .line 925
    iget-object v0, p0, Ll/ܿ᩸;->mLayoutWidget:Ll/᩸۠;

    iget-object v1, p0, Ll/ܿ᩸;->mMeasurer:Ll/ᩳ᩸;

    invoke-virtual {v0, v1}, Ll/᩸۠;->֫(Ll/ܰ۠;)V

    .line 926
    iget-object v0, p0, Ll/ܿ᩸;->mChildrenByIds:Landroid/util/SparseArray;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v1

    invoke-virtual {v0, v1, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/4 v0, 0x0

    .line 927
    iput-object v0, p0, Ll/ܿ᩸;->mConstraintSet:Ll/ۘ᩸;

    if-eqz p1, :cond_8

    .line 929
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Ll/᩸᩸;->ۧ:[I

    invoke-virtual {v1, p1, v2, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 930
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result p2

    const/4 p3, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_7

    .line 932
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    const/16 v3, 0x9

    if-ne v2, v3, :cond_0

    .line 934
    iget v3, p0, Ll/ܿ᩸;->mMinWidth:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    iput v2, p0, Ll/ܿ᩸;->mMinWidth:I

    goto :goto_2

    :cond_0
    const/16 v3, 0xa

    if-ne v2, v3, :cond_1

    .line 936
    iget v3, p0, Ll/ܿ᩸;->mMinHeight:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    iput v2, p0, Ll/ܿ᩸;->mMinHeight:I

    goto :goto_2

    :cond_1
    const/4 v3, 0x7

    if-ne v2, v3, :cond_2

    .line 938
    iget v3, p0, Ll/ܿ᩸;->mMaxWidth:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    iput v2, p0, Ll/ܿ᩸;->mMaxWidth:I

    goto :goto_2

    :cond_2
    const/16 v3, 0x8

    if-ne v2, v3, :cond_3

    .line 940
    iget v3, p0, Ll/ܿ᩸;->mMaxHeight:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    iput v2, p0, Ll/ܿ᩸;->mMaxHeight:I

    goto :goto_2

    :cond_3
    const/16 v3, 0x5a

    if-ne v2, v3, :cond_4

    .line 942
    iget v3, p0, Ll/ܿ᩸;->mOptimizationLevel:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Ll/ܿ᩸;->mOptimizationLevel:I

    goto :goto_2

    :cond_4
    const/16 v3, 0x27

    if-ne v2, v3, :cond_5

    .line 944
    invoke-virtual {p1, v2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    if-eqz v2, :cond_6

    .line 947
    :try_start_0
    invoke-virtual {p0, v2}, Ll/ܿ᩸;->parseLayoutDescription(I)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 949
    :catch_0
    iput-object v0, p0, Ll/ܿ᩸;->mConstraintLayoutSpec:Ll/ۜ᩸;

    goto :goto_2

    :cond_5
    const/16 v3, 0x12

    if-ne v2, v3, :cond_6

    .line 953
    invoke-virtual {p1, v2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    .line 955
    :try_start_1
    new-instance v3, Ll/ۘ᩸;

    invoke-direct {v3}, Ll/ۘ᩸;-><init>()V

    iput-object v3, p0, Ll/ܿ᩸;->mConstraintSet:Ll/ۘ᩸;

    .line 956
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Ll/ۘ᩸;->֫(Landroid/content/Context;I)V
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    .line 958
    :catch_1
    iput-object v0, p0, Ll/ܿ᩸;->mConstraintSet:Ll/ۘ᩸;

    .line 960
    :goto_1
    iput v2, p0, Ll/ܿ᩸;->mConstraintSetId:I

    :cond_6
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 963
    :cond_7
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 965
    :cond_8
    iget-object p1, p0, Ll/ܿ᩸;->mLayoutWidget:Ll/᩸۠;

    iget p2, p0, Ll/ܿ᩸;->mOptimizationLevel:I

    invoke-virtual {p1, p2}, Ll/᩸۠;->۠(I)V

    return-void
.end method

.method public static synthetic ۧ(Ll/ܿ᩸;)Ljava/util/ArrayList;
    .locals 0

    .line 482
    iget-object p0, p0, Ll/ܿ᩸;->mConstraintHelpers:Ljava/util/ArrayList;

    return-object p0
.end method

.method private ۧ()V
    .locals 1

    const/4 v0, 0x1

    .line 3249
    iput-boolean v0, p0, Ll/ܿ᩸;->mDirtyHierarchy:Z

    const/4 v0, -0x1

    .line 3251
    iput v0, p0, Ll/ܿ᩸;->mLastMeasureWidth:I

    .line 3252
    iput v0, p0, Ll/ܿ᩸;->mLastMeasureHeight:I

    .line 3253
    iput v0, p0, Ll/ܿ᩸;->mLastMeasureWidthSize:I

    .line 3254
    iput v0, p0, Ll/ܿ᩸;->mLastMeasureHeightSize:I

    const/4 v0, 0x0

    .line 3255
    iput v0, p0, Ll/ܿ᩸;->mLastMeasureWidthMode:I

    .line 3256
    iput v0, p0, Ll/ܿ᩸;->mLastMeasureHeightMode:I

    return-void
.end method

.method private ܽ()V
    .locals 9

    .line 1155
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v6

    .line 1157
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v7

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v7, :cond_1

    .line 1161
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 1162
    invoke-virtual {p0, v2}, Ll/ܿ᩸;->getViewWidget(Landroid/view/View;)Ll/ܶ۠;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_1

    .line 1166
    :cond_0
    invoke-virtual {v2}, Ll/ܶ۠;->᩺()V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, -0x1

    if-eqz v6, :cond_3

    const/4 v2, 0x0

    :goto_2
    if-ge v2, v7, :cond_3

    .line 1174
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 1176
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v4

    .line 1177
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {p0, v0, v4, v5}, Ll/ܿ᩸;->setDesignInformation(ILjava/lang/Object;Ljava/lang/Object;)V

    const/16 v5, 0x2f

    .line 1178
    invoke-virtual {v4, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    if-eq v5, v1, :cond_2

    add-int/lit8 v5, v5, 0x1

    .line 1180
    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    .line 1182
    :cond_2
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v3

    invoke-direct {p0, v3}, Ll/ܿ᩸;->֫(I)Ll/ܶ۠;

    move-result-object v3

    invoke-virtual {v3, v4}, Ll/ܶ۠;->֫(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 1205
    :cond_3
    iget v2, p0, Ll/ܿ᩸;->mConstraintSetId:I

    if-eq v2, v1, :cond_6

    const/4 v1, 0x0

    :goto_3
    if-ge v1, v7, :cond_6

    .line 1207
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 1208
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v3

    iget v4, p0, Ll/ܿ᩸;->mConstraintSetId:I

    if-ne v3, v4, :cond_5

    instance-of v3, v2, Ll/᩵᩸;

    if-eqz v3, :cond_5

    .line 1209
    check-cast v2, Ll/᩵᩸;

    .line 152
    iget-object v3, v2, Ll/᩵᩸;->᩸:Ll/ۘ᩸;

    if-nez v3, :cond_4

    .line 153
    new-instance v3, Ll/ۘ᩸;

    invoke-direct {v3}, Ll/ۘ᩸;-><init>()V

    iput-object v3, v2, Ll/᩵᩸;->᩸:Ll/ۘ᩸;

    .line 156
    :cond_4
    iget-object v3, v2, Ll/᩵᩸;->᩸:Ll/ۘ᩸;

    invoke-virtual {v3, v2}, Ll/ۘ᩸;->֫(Ll/᩵᩸;)V

    .line 157
    iget-object v2, v2, Ll/᩵᩸;->᩸:Ll/ۘ᩸;

    .line 1209
    iput-object v2, p0, Ll/ܿ᩸;->mConstraintSet:Ll/ۘ᩸;

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 1214
    :cond_6
    iget-object v1, p0, Ll/ܿ᩸;->mConstraintSet:Ll/ۘ᩸;

    if-eqz v1, :cond_7

    .line 1215
    invoke-virtual {v1, p0}, Ll/ۘ᩸;->ۧ(Ll/ܿ᩸;)V

    .line 1218
    :cond_7
    iget-object v1, p0, Ll/ܿ᩸;->mLayoutWidget:Ll/᩸۠;

    .line 181
    iget-object v1, v1, Ll/ۛ۠;->᩺֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 1220
    iget-object v1, p0, Ll/ܿ᩸;->mConstraintHelpers:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_8

    const/4 v2, 0x0

    :goto_4
    if-ge v2, v1, :cond_8

    .line 1223
    iget-object v3, p0, Ll/ܿ᩸;->mConstraintHelpers:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۟ܶ;

    .line 1224
    invoke-virtual {v3, p0}, Ll/۟ܶ;->ᩳ(Ll/ܿ᩸;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_8
    const/4 v1, 0x0

    :goto_5
    if-ge v1, v7, :cond_a

    .line 1230
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 1231
    instance-of v3, v2, Ll/۠᩸;

    if-eqz v3, :cond_9

    .line 1232
    check-cast v2, Ll/۠᩸;

    invoke-virtual {v2, p0}, Ll/۠᩸;->֫(Ll/ܿ᩸;)V

    :cond_9
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    .line 1236
    :cond_a
    iget-object v1, p0, Ll/ܿ᩸;->mTempMapIdToWidget:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->clear()V

    .line 1237
    iget-object v1, p0, Ll/ܿ᩸;->mTempMapIdToWidget:Landroid/util/SparseArray;

    iget-object v2, p0, Ll/ܿ᩸;->mLayoutWidget:Ll/᩸۠;

    invoke-virtual {v1, v0, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 1238
    iget-object v0, p0, Ll/ܿ᩸;->mTempMapIdToWidget:Landroid/util/SparseArray;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v1

    iget-object v2, p0, Ll/ܿ᩸;->mLayoutWidget:Ll/᩸۠;

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/4 v0, 0x0

    :goto_6
    if-ge v0, v7, :cond_b

    .line 1240
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 1241
    invoke-virtual {p0, v1}, Ll/ܿ᩸;->getViewWidget(Landroid/view/View;)Ll/ܶ۠;

    move-result-object v2

    .line 1242
    iget-object v3, p0, Ll/ܿ᩸;->mTempMapIdToWidget:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v1

    invoke-virtual {v3, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_b
    const/4 v0, 0x0

    const/4 v8, 0x0

    :goto_7
    if-ge v8, v7, :cond_e

    .line 1246
    invoke-virtual {p0, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 1247
    invoke-virtual {p0, v2}, Ll/ܿ᩸;->getViewWidget(Landroid/view/View;)Ll/ܶ۠;

    move-result-object v3

    if-nez v3, :cond_c

    goto :goto_8

    .line 1251
    :cond_c
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ll/ܽ᩸;

    .line 1252
    iget-object v0, p0, Ll/ܿ᩸;->mLayoutWidget:Ll/᩸۠;

    .line 72
    iget-object v1, v0, Ll/ۛ۠;->᩺֫:Ljava/util/ArrayList;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 620
    iget-object v1, v3, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    if-eqz v1, :cond_d

    .line 74
    check-cast v1, Ll/ۛ۠;

    .line 98
    iget-object v1, v1, Ll/ۛ۠;->᩺֫:Ljava/util/ArrayList;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 99
    invoke-virtual {v3}, Ll/ܶ۠;->᩺()V

    .line 629
    :cond_d
    iput-object v0, v3, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    .line 1253
    iget-object v5, p0, Ll/ܿ᩸;->mTempMapIdToWidget:Landroid/util/SparseArray;

    move-object v0, p0

    move v1, v6

    invoke-virtual/range {v0 .. v5}, Ll/ܿ᩸;->applyConstraintsFromLayoutParams(ZLandroid/view/View;Ll/ܶ۠;Ll/ܽ᩸;Landroid/util/SparseArray;)V

    :goto_8
    add-int/lit8 v8, v8, 0x1

    goto :goto_7

    :cond_e
    return-void
.end method

.method private ᩳ()Z
    .locals 4

    .line 1138
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 1142
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 1143
    invoke-virtual {v3}, Landroid/view/View;->isLayoutRequested()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v1, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz v1, :cond_2

    .line 1149
    invoke-direct {p0}, Ll/ܿ᩸;->ܽ()V

    :cond_2
    return v1
.end method


# virtual methods
.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 982
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public applyConstraintsFromLayoutParams(ZLandroid/view/View;Ll/ܶ۠;Ll/ܽ᩸;Landroid/util/SparseArray;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v7, p3

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    .line 1263
    invoke-virtual/range {p4 .. p4}, Ll/ܽ᩸;->ۧ()V

    .line 1266
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getVisibility()I

    move-result v2

    invoke-virtual {v7, v2}, Ll/ܶ۠;->ᩴ(I)V

    .line 1267
    iget-boolean v2, v8, Ll/ܽ᩸;->ۨ:Z

    if-eqz v2, :cond_0

    .line 1268
    invoke-virtual/range {p3 .. p3}, Ll/ܶ۠;->ܽ֫()V

    const/16 v2, 0x8

    .line 1269
    invoke-virtual {v7, v2}, Ll/ܶ۠;->ᩴ(I)V

    .line 1271
    :cond_0
    invoke-virtual {v7, v1}, Ll/ܶ۠;->֫(Landroid/view/View;)V

    .line 1273
    instance-of v2, v1, Ll/۟ܶ;

    if-eqz v2, :cond_1

    .line 1274
    check-cast v1, Ll/۟ܶ;

    .line 1275
    iget-object v2, v0, Ll/ܿ᩸;->mLayoutWidget:Ll/᩸۠;

    invoke-virtual {v2}, Ll/᩸۠;->ܺ֫()Z

    move-result v2

    invoke-virtual {v1, v7, v2}, Ll/۟ܶ;->֫(Ll/ܶ۠;Z)V

    .line 1277
    :cond_1
    iget-boolean v1, v8, Ll/ܽ᩸;->ۤ:Z

    const/4 v10, -0x1

    if-eqz v1, :cond_4

    .line 1278
    move-object v1, v7

    check-cast v1, Ll/ۗ۠;

    .line 1279
    iget v2, v8, Ll/ܽ᩸;->ܺ֫:I

    .line 1280
    iget v3, v8, Ll/ܽ᩸;->ۖ֫:I

    .line 1281
    iget v4, v8, Ll/ܽ᩸;->ۘ֫:F

    const/high16 v5, -0x40800000    # -1.0f

    cmpl-float v5, v4, v5

    if-eqz v5, :cond_2

    .line 1288
    invoke-virtual {v1, v4}, Ll/ۗ۠;->ܽ(F)V

    return-void

    :cond_2
    if-eq v2, v10, :cond_3

    .line 1290
    invoke-virtual {v1, v2}, Ll/ۗ۠;->۠(I)V

    return-void

    :cond_3
    if-eq v3, v10, :cond_21

    .line 1292
    invoke-virtual {v1, v3}, Ll/ۗ۠;->ܶ(I)V

    return-void

    .line 1296
    :cond_4
    iget v1, v8, Ll/ܽ᩸;->᩵֫:I

    .line 1297
    iget v2, v8, Ll/ܽ᩸;->֡֫:I

    .line 1298
    iget v11, v8, Ll/ܽ᩸;->ۚ֫:I

    .line 1299
    iget v12, v8, Ll/ܽ᩸;->֨֫:I

    .line 1300
    iget v6, v8, Ll/ܽ᩸;->ۢ֫:I

    .line 1301
    iget v13, v8, Ll/ܽ᩸;->ۡ֫:I

    .line 1302
    iget v14, v8, Ll/ܽ᩸;->ᩴ֫:F

    .line 1332
    iget v3, v8, Ll/ܽ᩸;->ܿ:I

    const/4 v15, 0x0

    if-eq v3, v10, :cond_6

    .line 1333
    invoke-virtual {v9, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶ۠;

    if-eqz v1, :cond_5

    .line 1335
    iget v2, v8, Ll/ܽ᩸;->ᩳ:F

    iget v3, v8, Ll/ܽ᩸;->ܳ:I

    invoke-virtual {v7, v1, v2, v3}, Ll/ܶ۠;->֫(Ll/ܶ۠;FI)V

    :cond_5
    const/4 v1, 0x0

    const/4 v2, 0x1

    goto/16 :goto_5

    :cond_6
    if-eq v1, v10, :cond_8

    .line 1340
    invoke-virtual {v9, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ll/ܶ۠;

    if-eqz v3, :cond_7

    .line 1342
    sget-object v4, Ll/֡۠;->۫:Ll/֡۠;

    iget v5, v8, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    const/16 v16, 0x0

    const/16 v17, 0x1

    move-object/from16 v1, p3

    move-object v2, v4

    invoke-virtual/range {v1 .. v6}, Ll/ܶ۠;->֫(Ll/֡۠;Ll/ܶ۠;Ll/֡۠;II)V

    goto :goto_0

    :cond_7
    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v6, 0x1

    const/16 v16, 0x0

    goto :goto_1

    :cond_8
    const/16 v16, 0x0

    const/16 v17, 0x1

    if-eq v2, v10, :cond_9

    .line 1347
    invoke-virtual {v9, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ll/ܶ۠;

    if-eqz v3, :cond_9

    .line 1349
    sget-object v2, Ll/֡۠;->۫:Ll/֡۠;

    sget-object v4, Ll/֡۠;->ۛ:Ll/֡۠;

    iget v5, v8, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    move-object/from16 v1, p3

    invoke-virtual/range {v1 .. v6}, Ll/ܶ۠;->֫(Ll/֡۠;Ll/ܶ۠;Ll/֡۠;II)V

    :cond_9
    :goto_0
    const/4 v6, 0x1

    :goto_1
    if-eq v11, v10, :cond_b

    .line 1357
    invoke-virtual {v9, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ll/ܶ۠;

    if-eqz v3, :cond_a

    .line 1359
    sget-object v2, Ll/֡۠;->ۛ:Ll/֡۠;

    sget-object v4, Ll/֡۠;->۫:Ll/֡۠;

    iget v5, v8, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    move-object/from16 v1, p3

    move v11, v6

    move v6, v13

    invoke-virtual/range {v1 .. v6}, Ll/ܶ۠;->֫(Ll/֡۠;Ll/ܶ۠;Ll/֡۠;II)V

    goto :goto_2

    :cond_a
    move v11, v6

    goto :goto_2

    :cond_b
    move v11, v6

    if-eq v12, v10, :cond_c

    .line 1364
    invoke-virtual {v9, v12}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ll/ܶ۠;

    if-eqz v3, :cond_c

    .line 1366
    sget-object v4, Ll/֡۠;->ۛ:Ll/֡۠;

    iget v5, v8, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    move-object/from16 v1, p3

    move-object v2, v4

    move v6, v13

    invoke-virtual/range {v1 .. v6}, Ll/ܶ۠;->֫(Ll/֡۠;Ll/ܶ۠;Ll/֡۠;II)V

    .line 1373
    :cond_c
    :goto_2
    iget v1, v8, Ll/ܽ᩸;->ۙ֫:I

    if-eq v1, v10, :cond_d

    .line 1374
    invoke-virtual {v9, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ll/ܶ۠;

    if-eqz v3, :cond_e

    .line 1376
    sget-object v4, Ll/֡۠;->ۨ:Ll/֡۠;

    iget v5, v8, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v6, v8, Ll/ܽ᩸;->ܶ:I

    move-object/from16 v1, p3

    move-object v2, v4

    invoke-virtual/range {v1 .. v6}, Ll/ܶ۠;->֫(Ll/֡۠;Ll/ܶ۠;Ll/֡۠;II)V

    goto :goto_3

    .line 1380
    :cond_d
    iget v1, v8, Ll/ܽ᩸;->᩶֫:I

    if-eq v1, v10, :cond_e

    .line 1381
    invoke-virtual {v9, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ll/ܶ۠;

    if-eqz v3, :cond_e

    .line 1383
    sget-object v2, Ll/֡۠;->ۨ:Ll/֡۠;

    sget-object v4, Ll/֡۠;->᩶:Ll/֡۠;

    iget v5, v8, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v6, v8, Ll/ܽ᩸;->ܶ:I

    move-object/from16 v1, p3

    invoke-virtual/range {v1 .. v6}, Ll/ܶ۠;->֫(Ll/֡۠;Ll/ܶ۠;Ll/֡۠;II)V

    .line 1390
    :cond_e
    :goto_3
    iget v1, v8, Ll/ܽ᩸;->ܽ:I

    if-eq v1, v10, :cond_f

    .line 1391
    invoke-virtual {v9, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ll/ܶ۠;

    if-eqz v3, :cond_10

    .line 1393
    sget-object v2, Ll/֡۠;->᩶:Ll/֡۠;

    sget-object v4, Ll/֡۠;->ۨ:Ll/֡۠;

    iget v5, v8, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v6, v8, Ll/ܽ᩸;->᩵:I

    move-object/from16 v1, p3

    invoke-virtual/range {v1 .. v6}, Ll/ܶ۠;->֫(Ll/֡۠;Ll/ܶ۠;Ll/֡۠;II)V

    goto :goto_4

    .line 1397
    :cond_f
    iget v1, v8, Ll/ܽ᩸;->ۧ:I

    if-eq v1, v10, :cond_10

    .line 1398
    invoke-virtual {v9, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ll/ܶ۠;

    if-eqz v3, :cond_10

    .line 1400
    sget-object v4, Ll/֡۠;->᩶:Ll/֡۠;

    iget v5, v8, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v6, v8, Ll/ܽ᩸;->᩵:I

    move-object/from16 v1, p3

    move-object v2, v4

    invoke-virtual/range {v1 .. v6}, Ll/ܶ۠;->֫(Ll/֡۠;Ll/ܶ۠;Ll/֡۠;II)V

    .line 1407
    :cond_10
    :goto_4
    iget v1, v8, Ll/ܽ᩸;->֫:I

    if-eq v1, v10, :cond_11

    .line 1408
    iget-object v2, v0, Ll/ܿ᩸;->mChildrenByIds:Landroid/util/SparseArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    .line 1409
    iget v2, v8, Ll/ܽ᩸;->֫:I

    invoke-virtual {v9, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶ۠;

    if-eqz v2, :cond_11

    if-eqz v1, :cond_11

    .line 1410
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    instance-of v3, v3, Ll/ܽ᩸;

    if-eqz v3, :cond_11

    .line 1411
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Ll/ܽ᩸;

    .line 1412
    iput-boolean v11, v8, Ll/ܽ᩸;->ۜ֫:Z

    .line 1413
    iput-boolean v11, v1, Ll/ܽ᩸;->ۜ֫:Z

    .line 1414
    sget-object v3, Ll/֡۠;->᩹:Ll/֡۠;

    invoke-virtual {v7, v3}, Ll/ܶ۠;->֫(Ll/֡۠;)Ll/ۚ۠;

    move-result-object v4

    .line 1416
    invoke-virtual {v2, v3}, Ll/ܶ۠;->֫(Ll/֡۠;)Ll/ۚ۠;

    move-result-object v2

    .line 1417
    invoke-virtual {v4, v2, v15, v10, v11}, Ll/ۚ۠;->֫(Ll/ۚ۠;IIZ)Z

    .line 1418
    invoke-virtual {v7, v11}, Ll/ܶ۠;->֫(Z)V

    .line 1419
    iget-object v1, v1, Ll/ܽ᩸;->ۛ֫:Ll/ܶ۠;

    invoke-virtual {v1, v11}, Ll/ܶ۠;->֫(Z)V

    .line 1420
    sget-object v1, Ll/֡۠;->ۨ:Ll/֡۠;

    invoke-virtual {v7, v1}, Ll/ܶ۠;->֫(Ll/֡۠;)Ll/ۚ۠;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۚ۠;->ۢ()V

    .line 1421
    sget-object v1, Ll/֡۠;->᩶:Ll/֡۠;

    invoke-virtual {v7, v1}, Ll/ܶ۠;->֫(Ll/֡۠;)Ll/ۚ۠;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۚ۠;->ۢ()V

    :cond_11
    cmpl-float v1, v14, v16

    if-ltz v1, :cond_12

    .line 1426
    invoke-virtual {v7, v14}, Ll/ܶ۠;->֫(F)V

    .line 1428
    :cond_12
    iget v1, v8, Ll/ܽ᩸;->ۗ֫:F

    cmpl-float v2, v1, v16

    if-ltz v2, :cond_13

    .line 1429
    invoke-virtual {v7, v1}, Ll/ܶ۠;->ۧ(F)V

    :cond_13
    move v2, v11

    move/from16 v1, v16

    :goto_5
    if-eqz p1, :cond_15

    .line 1433
    iget v3, v8, Ll/ܽ᩸;->ܺ:I

    if-ne v3, v10, :cond_14

    iget v4, v8, Ll/ܽ᩸;->ۖ:I

    if-eq v4, v10, :cond_15

    .line 1435
    :cond_14
    iget v4, v8, Ll/ܽ᩸;->ۖ:I

    invoke-virtual {v7, v3, v4}, Ll/ܶ۠;->ᩳ(II)V

    .line 1439
    :cond_15
    iget-boolean v3, v8, Ll/ܽ᩸;->۬:Z

    const/4 v4, -0x2

    if-nez v3, :cond_18

    .line 1440
    iget v3, v8, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    if-ne v3, v10, :cond_17

    .line 1441
    iget-boolean v3, v8, Ll/ܽ᩸;->ۜ:Z

    if-eqz v3, :cond_16

    .line 1442
    sget-object v3, Ll/۠۠;->᩶:Ll/۠۠;

    invoke-virtual {v7, v3}, Ll/ܶ۠;->֫(Ll/۠۠;)V

    goto :goto_6

    .line 1444
    :cond_16
    sget-object v3, Ll/۠۠;->ۙ:Ll/۠۠;

    invoke-virtual {v7, v3}, Ll/ܶ۠;->֫(Ll/۠۠;)V

    .line 1446
    :goto_6
    sget-object v3, Ll/֡۠;->۫:Ll/֡۠;

    invoke-virtual {v7, v3}, Ll/ܶ۠;->֫(Ll/֡۠;)Ll/ۚ۠;

    move-result-object v3

    iget v5, v8, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v5, v3, Ll/ۚ۠;->ܿ:I

    .line 1447
    sget-object v3, Ll/֡۠;->ۛ:Ll/֡۠;

    invoke-virtual {v7, v3}, Ll/ܶ۠;->֫(Ll/֡۠;)Ll/ۚ۠;

    move-result-object v3

    iget v5, v8, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iput v5, v3, Ll/ۚ۠;->ܿ:I

    goto :goto_7

    .line 1449
    :cond_17
    sget-object v3, Ll/۠۠;->᩶:Ll/۠۠;

    invoke-virtual {v7, v3}, Ll/ܶ۠;->֫(Ll/۠۠;)V

    .line 1450
    invoke-virtual {v7, v15}, Ll/ܶ۠;->᩵(I)V

    goto :goto_7

    .line 1453
    :cond_18
    sget-object v3, Ll/۠۠;->᩹:Ll/۠۠;

    invoke-virtual {v7, v3}, Ll/ܶ۠;->֫(Ll/۠۠;)V

    .line 1454
    iget v3, v8, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-virtual {v7, v3}, Ll/ܶ۠;->᩵(I)V

    .line 1455
    iget v3, v8, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    if-ne v3, v4, :cond_19

    .line 1456
    sget-object v3, Ll/۠۠;->ۗ:Ll/۠۠;

    invoke-virtual {v7, v3}, Ll/ܶ۠;->֫(Ll/۠۠;)V

    .line 1459
    :cond_19
    :goto_7
    iget-boolean v3, v8, Ll/ܽ᩸;->۫֫:Z

    if-nez v3, :cond_1c

    .line 1460
    iget v3, v8, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    if-ne v3, v10, :cond_1b

    .line 1461
    iget-boolean v3, v8, Ll/ܽ᩸;->᩻:Z

    if-eqz v3, :cond_1a

    .line 1462
    sget-object v3, Ll/۠۠;->᩶:Ll/۠۠;

    invoke-virtual {v7, v3}, Ll/ܶ۠;->ۧ(Ll/۠۠;)V

    goto :goto_8

    .line 1464
    :cond_1a
    sget-object v3, Ll/۠۠;->ۙ:Ll/۠۠;

    invoke-virtual {v7, v3}, Ll/ܶ۠;->ۧ(Ll/۠۠;)V

    .line 1466
    :goto_8
    sget-object v3, Ll/֡۠;->ۨ:Ll/֡۠;

    invoke-virtual {v7, v3}, Ll/ܶ۠;->֫(Ll/֡۠;)Ll/ۚ۠;

    move-result-object v3

    iget v4, v8, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput v4, v3, Ll/ۚ۠;->ܿ:I

    .line 1467
    sget-object v3, Ll/֡۠;->᩶:Ll/֡۠;

    invoke-virtual {v7, v3}, Ll/ܶ۠;->֫(Ll/֡۠;)Ll/ۚ۠;

    move-result-object v3

    iget v4, v8, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iput v4, v3, Ll/ۚ۠;->ܿ:I

    goto :goto_9

    .line 1469
    :cond_1b
    sget-object v3, Ll/۠۠;->᩶:Ll/۠۠;

    invoke-virtual {v7, v3}, Ll/ܶ۠;->ۧ(Ll/۠۠;)V

    .line 1470
    invoke-virtual {v7, v15}, Ll/ܶ۠;->ۜ(I)V

    goto :goto_9

    .line 1473
    :cond_1c
    sget-object v3, Ll/۠۠;->᩹:Ll/۠۠;

    invoke-virtual {v7, v3}, Ll/ܶ۠;->ۧ(Ll/۠۠;)V

    .line 1474
    iget v3, v8, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-virtual {v7, v3}, Ll/ܶ۠;->ۜ(I)V

    .line 1475
    iget v3, v8, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    if-ne v3, v4, :cond_1d

    .line 1476
    sget-object v3, Ll/۠۠;->ۗ:Ll/۠۠;

    invoke-virtual {v7, v3}, Ll/ܶ۠;->ۧ(Ll/۠۠;)V

    .line 1480
    :cond_1d
    :goto_9
    iget-object v3, v8, Ll/ܽ᩸;->ۢ:Ljava/lang/String;

    invoke-virtual {v7, v3}, Ll/ܶ۠;->ۧ(Ljava/lang/String;)V

    .line 1481
    iget v3, v8, Ll/ܽ᩸;->۫:F

    .line 1545
    iget-object v4, v7, Ll/ܶ۠;->᩸֫:[F

    aput v3, v4, v15

    .line 1482
    iget v3, v8, Ll/ܽ᩸;->ۤ֫:F

    .line 1554
    aput v3, v4, v2

    .line 1483
    iget v2, v8, Ll/ܽ᩸;->ۗ:I

    invoke-virtual {v7, v2}, Ll/ܶ۠;->᩷(I)V

    .line 1484
    iget v2, v8, Ll/ܽ᩸;->۬֫:I

    invoke-virtual {v7, v2}, Ll/ܶ۠;->ۘ(I)V

    .line 1485
    iget v2, v8, Ll/ܽ᩸;->֫֫:I

    iget v3, v8, Ll/ܽ᩸;->ܿ֫:I

    iget v4, v8, Ll/ܽ᩸;->ܽ֫:I

    iget v5, v8, Ll/ܽ᩸;->᩻֫:F

    .line 1197
    iput v2, v7, Ll/ܶ۠;->ܰ:I

    .line 1198
    iput v3, v7, Ll/ܶ۠;->ܽ֫:I

    const v3, 0x7fffffff

    if-ne v4, v3, :cond_1e

    const/4 v4, 0x0

    .line 1199
    :cond_1e
    iput v4, v7, Ll/ܶ۠;->֫֫:I

    .line 1200
    iput v5, v7, Ll/ܶ۠;->ܿ֫:F

    const/4 v4, 0x2

    const/high16 v6, 0x3f800000    # 1.0f

    cmpl-float v9, v5, v1

    if-lez v9, :cond_1f

    cmpg-float v5, v5, v6

    if-gez v5, :cond_1f

    if-nez v2, :cond_1f

    .line 1202
    iput v4, v7, Ll/ܶ۠;->ܰ:I

    .line 1488
    :cond_1f
    iget v2, v8, Ll/ܽ᩸;->۟:I

    iget v5, v8, Ll/ܽ᩸;->ᩳ֫:I

    iget v9, v8, Ll/ܽ᩸;->ۧ֫:I

    iget v8, v8, Ll/ܽ᩸;->ܳ֫:F

    .line 1215
    iput v2, v7, Ll/ܶ۠;->᩺:I

    .line 1216
    iput v5, v7, Ll/ܶ۠;->ۧ֫:I

    if-ne v9, v3, :cond_20

    goto :goto_a

    :cond_20
    move v15, v9

    .line 1217
    :goto_a
    iput v15, v7, Ll/ܶ۠;->۟:I

    .line 1218
    iput v8, v7, Ll/ܶ۠;->ᩳ֫:F

    cmpl-float v1, v8, v1

    if-lez v1, :cond_21

    cmpg-float v1, v8, v6

    if-gez v1, :cond_21

    if-nez v2, :cond_21

    .line 1220
    iput v4, v7, Ll/ܶ۠;->᩺:I

    :cond_21
    return-void
.end method

.method public checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    .line 1940
    instance-of p1, p1, Ll/ܽ᩸;

    return p1
.end method

.method public dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 18

    move-object/from16 v0, p0

    .line 1966
    iget-object v1, v0, Ll/ܿ᩸;->mConstraintHelpers:Ljava/util/ArrayList;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 1967
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    .line 1970
    iget-object v4, v0, Ll/ܿ᩸;->mConstraintHelpers:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۟ܶ;

    .line 1971
    invoke-virtual {v4, v0}, Ll/۟ܶ;->ܽ(Ll/ܿ᩸;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1975
    :cond_0
    invoke-super/range {p0 .. p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 1976
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->isInEditMode()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 1977
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    .line 1978
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    .line 1979
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v4

    int-to-float v4, v4

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v1, :cond_3

    .line 1983
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 1984
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v7

    const/16 v8, 0x8

    if-ne v7, v8, :cond_1

    goto/16 :goto_2

    .line 1987
    :cond_1
    invoke-virtual {v6}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_2

    .line 1988
    instance-of v7, v6, Ljava/lang/String;

    if-eqz v7, :cond_2

    .line 1989
    check-cast v6, Ljava/lang/String;

    const-string v7, ","

    .line 1990
    invoke-virtual {v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 1991
    array-length v7, v6

    const/4 v8, 0x4

    if-ne v7, v8, :cond_2

    .line 1992
    aget-object v7, v6, v2

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    const/4 v8, 0x1

    .line 1993
    aget-object v8, v6, v8

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    const/4 v9, 0x2

    .line 1994
    aget-object v9, v6, v9

    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    const/4 v10, 0x3

    .line 1995
    aget-object v6, v6, v10

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    int-to-float v7, v7

    const/high16 v10, 0x44870000    # 1080.0f

    div-float/2addr v7, v10

    mul-float v7, v7, v3

    float-to-int v7, v7

    int-to-float v8, v8

    const/high16 v11, 0x44f00000    # 1920.0f

    div-float/2addr v8, v11

    mul-float v8, v8, v4

    float-to-int v8, v8

    int-to-float v9, v9

    div-float/2addr v9, v10

    mul-float v9, v9, v3

    float-to-int v9, v9

    int-to-float v6, v6

    div-float/2addr v6, v11

    mul-float v6, v6, v4

    float-to-int v6, v6

    .line 2000
    new-instance v15, Landroid/graphics/Paint;

    invoke-direct {v15}, Landroid/graphics/Paint;-><init>()V

    const/high16 v10, -0x10000

    .line 2001
    invoke-virtual {v15, v10}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v14, v7

    int-to-float v13, v8

    add-int/2addr v7, v9

    int-to-float v7, v7

    move-object/from16 v10, p1

    move v11, v14

    move v12, v13

    move v9, v13

    move v13, v7

    move/from16 v16, v14

    move v14, v9

    move-object/from16 v17, v15

    .line 2002
    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    add-int/2addr v8, v6

    int-to-float v6, v8

    move v11, v7

    move v12, v9

    move v14, v6

    .line 2003
    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move v12, v6

    move/from16 v13, v16

    .line 2004
    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move/from16 v11, v16

    move v14, v9

    .line 2005
    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    const v8, -0xff0100

    .line 2006
    invoke-virtual {v15, v8}, Landroid/graphics/Paint;->setColor(I)V

    move v12, v9

    move v13, v7

    move v14, v6

    move-object v8, v15

    .line 2007
    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move v12, v6

    move v14, v9

    .line 2008
    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_2
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_1

    :cond_3
    return-void
.end method

.method public fillMetrics(Ll/ܳ۠;)V
    .locals 0

    .line 1530
    iget-object p1, p0, Ll/ܿ᩸;->mLayoutWidget:Ll/᩸۠;

    invoke-virtual {p1}, Ll/᩸۠;->᩻֫()V

    return-void
.end method

.method public forceLayout()V
    .locals 0

    .line 3244
    invoke-direct {p0}, Ll/ܿ᩸;->ۧ()V

    .line 3245
    invoke-super {p0}, Landroid/view/ViewGroup;->forceLayout()V

    return-void
.end method

.method public bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 482
    invoke-virtual {p0}, Ll/ܿ᩸;->generateDefaultLayoutParams()Ll/ܽ᩸;

    move-result-object v0

    return-object v0
.end method

.method public generateDefaultLayoutParams()Ll/ܽ᩸;
    .locals 2

    .line 1924
    new-instance v0, Ll/ܽ᩸;

    const/4 v1, -0x2

    invoke-direct {v0, v1}, Ll/ܽ᩸;-><init>(I)V

    return-object v0
.end method

.method public bridge synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 482
    invoke-virtual {p0, p1}, Ll/ܿ᩸;->generateLayoutParams(Landroid/util/AttributeSet;)Ll/ܽ᩸;

    move-result-object p1

    return-object p1
.end method

.method public generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 1932
    new-instance v0, Ll/ܽ᩸;

    invoke-direct {v0, p1}, Ll/ܽ᩸;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Ll/ܽ᩸;
    .locals 2

    .line 1916
    new-instance v0, Ll/ܽ᩸;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ll/ܽ᩸;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public getDesignInformation(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p1, :cond_0

    .line 553
    instance-of p1, p2, Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 554
    check-cast p2, Ljava/lang/String;

    .line 555
    iget-object p1, p0, Ll/ܿ᩸;->mDesignIds:Ljava/util/HashMap;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 556
    iget-object p1, p0, Ll/ܿ᩸;->mDesignIds:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getMaxHeight()I
    .locals 1

    .line 1134
    iget v0, p0, Ll/ܿ᩸;->mMaxHeight:I

    return v0
.end method

.method public getMaxWidth()I
    .locals 1

    .line 1124
    iget v0, p0, Ll/ܿ᩸;->mMaxWidth:I

    return v0
.end method

.method public getMinHeight()I
    .locals 1

    .line 1087
    iget v0, p0, Ll/ܿ᩸;->mMinHeight:I

    return v0
.end method

.method public getMinWidth()I
    .locals 1

    .line 1077
    iget v0, p0, Ll/ܿ᩸;->mMinWidth:I

    return v0
.end method

.method public getOptimizationLevel()I
    .locals 1

    .line 1908
    iget-object v0, p0, Ll/ܿ᩸;->mLayoutWidget:Ll/᩸۠;

    invoke-virtual {v0}, Ll/᩸۠;->᩷֫()I

    move-result v0

    return v0
.end method

.method public getViewById(I)Landroid/view/View;
    .locals 1

    .line 1958
    iget-object v0, p0, Ll/ܿ᩸;->mChildrenByIds:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    return-object p1
.end method

.method public final getViewWidget(Landroid/view/View;)Ll/ܶ۠;
    .locals 0

    if-ne p1, p0, :cond_0

    .line 1519
    iget-object p1, p0, Ll/ܿ᩸;->mLayoutWidget:Ll/᩸۠;

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    return-object p1

    .line 1521
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Ll/ܽ᩸;

    iget-object p1, p1, Ll/ܽ᩸;->ۛ֫:Ll/ܶ۠;

    return-object p1
.end method

.method public isRtl()Z
    .locals 2

    .line 1705
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    const/high16 v1, 0x400000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    .line 1706
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public loadLayoutDescription(I)V
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 2072
    :try_start_0
    new-instance v1, Ll/ۜ᩸;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2, p0, p1}, Ll/ۜ᩸;-><init>(Landroid/content/Context;Ll/ܿ᩸;I)V

    iput-object v1, p0, Ll/ܿ᩸;->mConstraintLayoutSpec:Ll/ۜ᩸;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 2074
    :catch_0
    iput-object v0, p0, Ll/ܿ᩸;->mConstraintLayoutSpec:Ll/ۜ᩸;

    return-void

    .line 2077
    :cond_0
    iput-object v0, p0, Ll/ܿ᩸;->mConstraintLayoutSpec:Ll/ۜ᩸;

    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 5

    .line 1821
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    .line 1822
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result p2

    const/4 p3, 0x0

    const/4 p4, 0x0

    :goto_0
    if-ge p4, p1, :cond_3

    .line 1824
    invoke-virtual {p0, p4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p5

    .line 1825
    invoke-virtual {p5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܽ᩸;

    .line 1826
    iget-object v1, v0, Ll/ܽ᩸;->ۛ֫:Ll/ܶ۠;

    .line 1828
    invoke-virtual {p5}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v3, 0x8

    if-ne v2, v3, :cond_0

    iget-boolean v2, v0, Ll/ܽ᩸;->ۤ:Z

    if-nez v2, :cond_0

    iget-boolean v2, v0, Ll/ܽ᩸;->ۛ:Z

    if-nez v2, :cond_0

    if-nez p2, :cond_0

    goto :goto_1

    .line 1833
    :cond_0
    iget-boolean v0, v0, Ll/ܽ᩸;->ۨ:Z

    if-eqz v0, :cond_1

    goto :goto_1

    .line 1836
    :cond_1
    invoke-virtual {v1}, Ll/ܶ۠;->᩸()I

    move-result v0

    .line 1837
    invoke-virtual {v1}, Ll/ܶ۠;->᩹()I

    move-result v2

    .line 1838
    invoke-virtual {v1}, Ll/ܶ۠;->ܶ()I

    move-result v3

    add-int/2addr v3, v0

    .line 1839
    invoke-virtual {v1}, Ll/ܶ۠;->ۜ()I

    move-result v1

    add-int/2addr v1, v2

    .line 1855
    invoke-virtual {p5, v0, v2, v3, v1}, Landroid/view/View;->layout(IIII)V

    .line 1856
    instance-of v4, p5, Ll/۠᩸;

    if-eqz v4, :cond_2

    .line 1857
    check-cast p5, Ll/۠᩸;

    .line 1858
    invoke-virtual {p5}, Ll/۠᩸;->֫()Landroid/view/View;

    move-result-object p5

    if-eqz p5, :cond_2

    .line 1860
    invoke-virtual {p5, p3}, Landroid/view/View;->setVisibility(I)V

    .line 1861
    invoke-virtual {p5, v0, v2, v3, v1}, Landroid/view/View;->layout(IIII)V

    :cond_2
    :goto_1
    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    .line 1865
    :cond_3
    iget-object p1, p0, Ll/ܿ᩸;->mConstraintHelpers:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_4

    :goto_2
    if-ge p3, p1, :cond_4

    .line 1868
    iget-object p2, p0, Ll/ܿ᩸;->mConstraintHelpers:Ljava/util/ArrayList;

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/۟ܶ;

    .line 1869
    invoke-virtual {p2}, Ll/۟ܶ;->ۧ()V

    add-int/lit8 p3, p3, 0x1

    goto :goto_2

    :cond_4
    return-void
.end method

.method public onMeasure(II)V
    .locals 8

    .line 1636
    iget-boolean v0, p0, Ll/ܿ᩸;->mDirtyHierarchy:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 1640
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 1642
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 1643
    invoke-virtual {v3}, Landroid/view/View;->isLayoutRequested()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v0, 0x1

    .line 1644
    iput-boolean v0, p0, Ll/ܿ᩸;->mDirtyHierarchy:Z

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1650
    :cond_1
    :goto_1
    iget-boolean v0, p0, Ll/ܿ᩸;->mDirtyHierarchy:Z

    if-nez v0, :cond_3

    .line 1651
    iget v0, p0, Ll/ܿ᩸;->mOnMeasureWidthMeasureSpec:I

    if-ne v0, p1, :cond_2

    iget v2, p0, Ll/ܿ᩸;->mOnMeasureHeightMeasureSpec:I

    if-ne v2, p2, :cond_2

    .line 1652
    iget-object v0, p0, Ll/ܿ᩸;->mLayoutWidget:Ll/᩸۠;

    invoke-virtual {v0}, Ll/ܶ۠;->ܶ()I

    move-result v4

    iget-object v0, p0, Ll/ܿ᩸;->mLayoutWidget:Ll/᩸۠;

    invoke-virtual {v0}, Ll/ܶ۠;->ۜ()I

    move-result v5

    iget-object v0, p0, Ll/ܿ᩸;->mLayoutWidget:Ll/᩸۠;

    .line 1653
    invoke-virtual {v0}, Ll/᩸۠;->ۖ֫()Z

    move-result v6

    iget-object v0, p0, Ll/ܿ᩸;->mLayoutWidget:Ll/᩸۠;

    invoke-virtual {v0}, Ll/᩸۠;->ۡ֫()Z

    move-result v7

    move-object v1, p0

    move v2, p1

    move v3, p2

    .line 1652
    invoke-virtual/range {v1 .. v7}, Ll/ܿ᩸;->resolveMeasuredDimension(IIIIZZ)V

    return-void

    :cond_2
    if-ne v0, p1, :cond_3

    .line 1657
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v2, 0x40000000    # 2.0f

    if-ne v0, v2, :cond_3

    .line 1658
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v2, -0x80000000

    if-ne v0, v2, :cond_3

    iget v0, p0, Ll/ܿ᩸;->mOnMeasureHeightMeasureSpec:I

    .line 1659
    invoke-static {v0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    if-ne v0, v2, :cond_3

    .line 1660
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 1664
    iget-object v2, p0, Ll/ܿ᩸;->mLayoutWidget:Ll/᩸۠;

    invoke-virtual {v2}, Ll/ܶ۠;->ۜ()I

    move-result v2

    if-lt v0, v2, :cond_3

    .line 1665
    iput p1, p0, Ll/ܿ᩸;->mOnMeasureWidthMeasureSpec:I

    .line 1666
    iput p2, p0, Ll/ܿ᩸;->mOnMeasureHeightMeasureSpec:I

    .line 1667
    iget-object v0, p0, Ll/ܿ᩸;->mLayoutWidget:Ll/᩸۠;

    invoke-virtual {v0}, Ll/ܶ۠;->ܶ()I

    move-result v4

    iget-object v0, p0, Ll/ܿ᩸;->mLayoutWidget:Ll/᩸۠;

    invoke-virtual {v0}, Ll/ܶ۠;->ۜ()I

    move-result v5

    iget-object v0, p0, Ll/ܿ᩸;->mLayoutWidget:Ll/᩸۠;

    .line 1668
    invoke-virtual {v0}, Ll/᩸۠;->ۖ֫()Z

    move-result v6

    iget-object v0, p0, Ll/ܿ᩸;->mLayoutWidget:Ll/᩸۠;

    invoke-virtual {v0}, Ll/᩸۠;->ۡ֫()Z

    move-result v7

    move-object v1, p0

    move v2, p1

    move v3, p2

    .line 1667
    invoke-virtual/range {v1 .. v7}, Ll/ܿ᩸;->resolveMeasuredDimension(IIIIZZ)V

    return-void

    .line 1673
    :cond_3
    iput p1, p0, Ll/ܿ᩸;->mOnMeasureWidthMeasureSpec:I

    .line 1674
    iput p2, p0, Ll/ܿ᩸;->mOnMeasureHeightMeasureSpec:I

    .line 1681
    iget-object v0, p0, Ll/ܿ᩸;->mLayoutWidget:Ll/᩸۠;

    invoke-virtual {p0}, Ll/ܿ᩸;->isRtl()Z

    move-result v2

    invoke-virtual {v0, v2}, Ll/᩸۠;->ۧ(Z)V

    .line 1683
    iget-boolean v0, p0, Ll/ܿ᩸;->mDirtyHierarchy:Z

    if-eqz v0, :cond_4

    .line 1684
    iput-boolean v1, p0, Ll/ܿ᩸;->mDirtyHierarchy:Z

    .line 1685
    invoke-direct {p0}, Ll/ܿ᩸;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1686
    iget-object v0, p0, Ll/ܿ᩸;->mLayoutWidget:Ll/᩸۠;

    invoke-virtual {v0}, Ll/᩸۠;->ۘ֫()V

    .line 1690
    :cond_4
    iget-object v0, p0, Ll/ܿ᩸;->mLayoutWidget:Ll/᩸۠;

    iget v1, p0, Ll/ܿ᩸;->mOptimizationLevel:I

    invoke-virtual {p0, v0, v1, p1, p2}, Ll/ܿ᩸;->resolveSystem(Ll/᩸۠;III)V

    .line 1691
    iget-object v0, p0, Ll/ܿ᩸;->mLayoutWidget:Ll/᩸۠;

    invoke-virtual {v0}, Ll/ܶ۠;->ܶ()I

    move-result v4

    iget-object v0, p0, Ll/ܿ᩸;->mLayoutWidget:Ll/᩸۠;

    invoke-virtual {v0}, Ll/ܶ۠;->ۜ()I

    move-result v5

    iget-object v0, p0, Ll/ܿ᩸;->mLayoutWidget:Ll/᩸۠;

    .line 1692
    invoke-virtual {v0}, Ll/᩸۠;->ۖ֫()Z

    move-result v6

    iget-object v0, p0, Ll/ܿ᩸;->mLayoutWidget:Ll/᩸۠;

    invoke-virtual {v0}, Ll/᩸۠;->ۡ֫()Z

    move-result v7

    move-object v1, p0

    move v2, p1

    move v3, p2

    .line 1691
    invoke-virtual/range {v1 .. v7}, Ll/ܿ᩸;->resolveMeasuredDimension(IIIIZZ)V

    return-void
.end method

.method public onViewAdded(Landroid/view/View;)V
    .locals 3

    .line 1005
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewAdded(Landroid/view/View;)V

    .line 1007
    invoke-virtual {p0, p1}, Ll/ܿ᩸;->getViewWidget(Landroid/view/View;)Ll/ܶ۠;

    move-result-object v0

    .line 1008
    instance-of v1, p1, Ll/֨᩸;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 1009
    instance-of v0, v0, Ll/ۗ۠;

    if-nez v0, :cond_0

    .line 1010
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܽ᩸;

    .line 1011
    new-instance v1, Ll/ۗ۠;

    invoke-direct {v1}, Ll/ۗ۠;-><init>()V

    iput-object v1, v0, Ll/ܽ᩸;->ۛ֫:Ll/ܶ۠;

    .line 1012
    iput-boolean v2, v0, Ll/ܽ᩸;->ۤ:Z

    .line 1013
    iget v0, v0, Ll/ܽ᩸;->᩷֫:I

    invoke-virtual {v1, v0}, Ll/ۗ۠;->᩸(I)V

    .line 1016
    :cond_0
    instance-of v0, p1, Ll/۟ܶ;

    if-eqz v0, :cond_1

    .line 1017
    move-object v0, p1

    check-cast v0, Ll/۟ܶ;

    .line 1018
    invoke-virtual {v0}, Ll/۟ܶ;->ܽ()V

    .line 1019
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Ll/ܽ᩸;

    .line 1020
    iput-boolean v2, v1, Ll/ܽ᩸;->ۛ:Z

    .line 1021
    iget-object v1, p0, Ll/ܿ᩸;->mConstraintHelpers:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1022
    iget-object v1, p0, Ll/ܿ᩸;->mConstraintHelpers:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1025
    :cond_1
    iget-object v0, p0, Ll/ܿ᩸;->mChildrenByIds:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    invoke-virtual {v0, v1, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 1026
    iput-boolean v2, p0, Ll/ܿ᩸;->mDirtyHierarchy:Z

    return-void
.end method

.method public onViewRemoved(Landroid/view/View;)V
    .locals 2

    .line 1035
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewRemoved(Landroid/view/View;)V

    .line 1037
    iget-object v0, p0, Ll/ܿ᩸;->mChildrenByIds:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->remove(I)V

    .line 1038
    invoke-virtual {p0, p1}, Ll/ܿ᩸;->getViewWidget(Landroid/view/View;)Ll/ܶ۠;

    move-result-object v0

    .line 1039
    iget-object v1, p0, Ll/ܿ᩸;->mLayoutWidget:Ll/᩸۠;

    .line 98
    iget-object v1, v1, Ll/ۛ۠;->᩺֫:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 99
    invoke-virtual {v0}, Ll/ܶ۠;->᩺()V

    .line 1040
    iget-object v0, p0, Ll/ܿ᩸;->mConstraintHelpers:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    .line 1041
    iput-boolean p1, p0, Ll/ܿ᩸;->mDirtyHierarchy:Z

    return-void
.end method

.method public parseLayoutDescription(I)V
    .locals 2

    .line 974
    new-instance v0, Ll/ۜ᩸;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p0, p1}, Ll/ۜ᩸;-><init>(Landroid/content/Context;Ll/ܿ᩸;I)V

    iput-object v0, p0, Ll/ܿ᩸;->mConstraintLayoutSpec:Ll/ۜ᩸;

    return-void
.end method

.method public removeView(Landroid/view/View;)V
    .locals 0

    .line 993
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public requestLayout()V
    .locals 0

    .line 3238
    invoke-direct {p0}, Ll/ܿ᩸;->ۧ()V

    .line 3239
    invoke-super {p0}, Landroid/view/ViewGroup;->requestLayout()V

    return-void
.end method

.method public resolveMeasuredDimension(IIIIZZ)V
    .locals 2

    .line 1596
    iget-object v0, p0, Ll/ܿ᩸;->mMeasurer:Ll/ᩳ᩸;

    iget v1, v0, Ll/ᩳ᩸;->ܿ:I

    .line 1597
    iget v0, v0, Ll/ᩳ᩸;->᩻:I

    add-int/2addr p3, v0

    add-int/2addr p4, v1

    const/4 v0, 0x0

    .line 1603
    invoke-static {p3, p1, v0}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result p1

    .line 1604
    invoke-static {p4, p2, v0}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result p2

    const p3, 0xffffff

    and-int/2addr p1, p3

    and-int/2addr p2, p3

    .line 1608
    iget p3, p0, Ll/ܿ᩸;->mMaxWidth:I

    invoke-static {p3, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 1609
    iget p3, p0, Ll/ܿ᩸;->mMaxHeight:I

    invoke-static {p3, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    const/high16 p3, 0x1000000

    if-eqz p5, :cond_0

    or-int/2addr p1, p3

    :cond_0
    if-eqz p6, :cond_1

    or-int/2addr p2, p3

    .line 1616
    :cond_1
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 1617
    iput p1, p0, Ll/ܿ᩸;->mLastMeasureWidth:I

    .line 1618
    iput p2, p0, Ll/ܿ᩸;->mLastMeasureHeight:I

    return-void
.end method

.method public resolveSystem(Ll/᩸۠;III)V
    .locals 10

    .line 1546
    invoke-static {p3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v6

    .line 1547
    invoke-static {p3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 1548
    invoke-static {p4}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v7

    .line 1549
    invoke-static {p4}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    .line 1551
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    const/4 v3, 0x0

    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v8

    .line 1552
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    add-int v4, v8, v2

    .line 1554
    invoke-direct {p0}, Ll/ܿ᩸;->֫()I

    move-result v5

    .line 1556
    iget-object v9, p0, Ll/ܿ᩸;->mMeasurer:Ll/ᩳ᩸;

    .line 610
    iput v8, v9, Ll/ᩳ᩸;->ܳ:I

    .line 611
    iput v2, v9, Ll/ᩳ᩸;->ᩳ:I

    .line 612
    iput v5, v9, Ll/ᩳ᩸;->᩻:I

    .line 613
    iput v4, v9, Ll/ᩳ᩸;->ܿ:I

    .line 614
    iput p3, v9, Ll/ᩳ᩸;->ܽ:I

    .line 615
    iput p4, v9, Ll/ᩳ᩸;->ۧ:I

    .line 1559
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    move-result p3

    invoke-static {v3, p3}, Ljava/lang/Math;->max(II)I

    move-result p3

    .line 1560
    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    move-result p4

    invoke-static {v3, p4}, Ljava/lang/Math;->max(II)I

    move-result p4

    if-gtz p3, :cond_1

    if-lez p4, :cond_0

    goto :goto_0

    .line 1568
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p3

    invoke-static {v3, p3}, Ljava/lang/Math;->max(II)I

    move-result p3

    goto :goto_1

    .line 1562
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ll/ܿ᩸;->isRtl()Z

    move-result v2

    if-eqz v2, :cond_2

    move p3, p4

    :cond_2
    :goto_1
    sub-int p4, v0, v5

    sub-int v9, v1, v4

    move-object v0, p0

    move-object v1, p1

    move v2, v6

    move v3, p4

    move v4, v7

    move v5, v9

    .line 1577
    invoke-virtual/range {v0 .. v5}, Ll/ܿ᩸;->setSelfDimensionBehaviour(Ll/᩸۠;IIII)V

    move-object v0, p1

    move v1, p2

    move v6, p3

    move v7, v8

    .line 1578
    invoke-virtual/range {v0 .. v7}, Ll/᩸۠;->֫(IIIIIII)V

    return-void
.end method

.method public setConstraintSet(Ll/ۘ᩸;)V
    .locals 0

    .line 1949
    iput-object p1, p0, Ll/ܿ᩸;->mConstraintSet:Ll/ۘ᩸;

    return-void
.end method

.method public setDesignInformation(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    if-nez p1, :cond_2

    .line 535
    instance-of p1, p2, Ljava/lang/String;

    if-eqz p1, :cond_2

    instance-of p1, p3, Ljava/lang/Integer;

    if-eqz p1, :cond_2

    .line 536
    iget-object p1, p0, Ll/ܿ᩸;->mDesignIds:Ljava/util/HashMap;

    if-nez p1, :cond_0

    .line 537
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/ܿ᩸;->mDesignIds:Ljava/util/HashMap;

    .line 539
    :cond_0
    check-cast p2, Ljava/lang/String;

    const-string p1, "/"

    .line 540
    invoke-virtual {p2, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    add-int/lit8 p1, p1, 0x1

    .line 542
    invoke-virtual {p2, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    .line 544
    :cond_1
    check-cast p3, Ljava/lang/Integer;

    .line 545
    iget-object p1, p0, Ll/ܿ᩸;->mDesignIds:Ljava/util/HashMap;

    invoke-virtual {p1, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method public setId(I)V
    .locals 2

    .line 588
    iget-object v0, p0, Ll/ܿ᩸;->mChildrenByIds:Landroid/util/SparseArray;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->remove(I)V

    .line 589
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setId(I)V

    .line 590
    iget-object p1, p0, Ll/ܿ᩸;->mChildrenByIds:Landroid/util/SparseArray;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v0

    invoke-virtual {p1, v0, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method

.method public setMaxHeight(I)V
    .locals 1

    .line 1109
    iget v0, p0, Ll/ܿ᩸;->mMaxHeight:I

    if-ne p1, v0, :cond_0

    return-void

    .line 1112
    :cond_0
    iput p1, p0, Ll/ܿ᩸;->mMaxHeight:I

    .line 1113
    invoke-virtual {p0}, Ll/ܿ᩸;->requestLayout()V

    return-void
.end method

.method public setMaxWidth(I)V
    .locals 1

    .line 1096
    iget v0, p0, Ll/ܿ᩸;->mMaxWidth:I

    if-ne p1, v0, :cond_0

    return-void

    .line 1099
    :cond_0
    iput p1, p0, Ll/ܿ᩸;->mMaxWidth:I

    .line 1100
    invoke-virtual {p0}, Ll/ܿ᩸;->requestLayout()V

    return-void
.end method

.method public setMinHeight(I)V
    .locals 1

    .line 1063
    iget v0, p0, Ll/ܿ᩸;->mMinHeight:I

    if-ne p1, v0, :cond_0

    return-void

    .line 1066
    :cond_0
    iput p1, p0, Ll/ܿ᩸;->mMinHeight:I

    .line 1067
    invoke-virtual {p0}, Ll/ܿ᩸;->requestLayout()V

    return-void
.end method

.method public setMinWidth(I)V
    .locals 1

    .line 1050
    iget v0, p0, Ll/ܿ᩸;->mMinWidth:I

    if-ne p1, v0, :cond_0

    return-void

    .line 1053
    :cond_0
    iput p1, p0, Ll/ܿ᩸;->mMinWidth:I

    .line 1054
    invoke-virtual {p0}, Ll/ܿ᩸;->requestLayout()V

    return-void
.end method

.method public setOnConstraintsChanged(Ll/֡᩸;)V
    .locals 0

    .line 2059
    iget-object p1, p0, Ll/ܿ᩸;->mConstraintLayoutSpec:Ll/ۜ᩸;

    if-eqz p1, :cond_0

    .line 2060
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    return-void
.end method

.method public setOptimizationLevel(I)V
    .locals 1

    .line 1897
    iput p1, p0, Ll/ܿ᩸;->mOptimizationLevel:I

    .line 1898
    iget-object v0, p0, Ll/ܿ᩸;->mLayoutWidget:Ll/᩸۠;

    invoke-virtual {v0, p1}, Ll/᩸۠;->۠(I)V

    return-void
.end method

.method public setSelfDimensionBehaviour(Ll/᩸۠;IIII)V
    .locals 7

    .line 1730
    iget-object v0, p0, Ll/ܿ᩸;->mMeasurer:Ll/ᩳ᩸;

    iget v1, v0, Ll/ᩳ᩸;->ܿ:I

    .line 1731
    iget v0, v0, Ll/ᩳ᩸;->᩻:I

    .line 1733
    sget-object v2, Ll/۠۠;->᩹:Ll/۠۠;

    .line 1738
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    const/high16 v4, 0x40000000    # 2.0f

    const/4 v5, 0x0

    const/high16 v6, -0x80000000

    if-eq p2, v6, :cond_3

    if-eqz p2, :cond_1

    if-eq p2, v4, :cond_0

    move-object p2, v2

    goto :goto_0

    .line 1757
    :cond_0
    iget p2, p0, Ll/ܿ᩸;->mMaxWidth:I

    sub-int/2addr p2, v0

    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    move-result p3

    move-object p2, v2

    goto :goto_1

    .line 1750
    :cond_1
    sget-object p2, Ll/۠۠;->ۗ:Ll/۠۠;

    if-nez v3, :cond_2

    .line 1752
    iget p3, p0, Ll/ܿ᩸;->mMinWidth:I

    invoke-static {v5, p3}, Ljava/lang/Math;->max(II)I

    move-result p3

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p3, 0x0

    goto :goto_1

    .line 1742
    :cond_3
    sget-object p2, Ll/۠۠;->ۗ:Ll/۠۠;

    if-nez v3, :cond_4

    .line 1745
    iget p3, p0, Ll/ܿ᩸;->mMinWidth:I

    invoke-static {v5, p3}, Ljava/lang/Math;->max(II)I

    move-result p3

    :cond_4
    :goto_1
    if-eq p4, v6, :cond_8

    if-eqz p4, :cond_6

    if-eq p4, v4, :cond_5

    goto :goto_2

    .line 1777
    :cond_5
    iget p4, p0, Ll/ܿ᩸;->mMaxHeight:I

    sub-int/2addr p4, v1

    invoke-static {p4, p5}, Ljava/lang/Math;->min(II)I

    move-result p5

    goto :goto_3

    .line 1770
    :cond_6
    sget-object v2, Ll/۠۠;->ۗ:Ll/۠۠;

    if-nez v3, :cond_7

    .line 1772
    iget p4, p0, Ll/ܿ᩸;->mMinHeight:I

    invoke-static {v5, p4}, Ljava/lang/Math;->max(II)I

    move-result p5

    goto :goto_3

    :cond_7
    :goto_2
    const/4 p5, 0x0

    goto :goto_3

    .line 1762
    :cond_8
    sget-object v2, Ll/۠۠;->ۗ:Ll/۠۠;

    if-nez v3, :cond_9

    .line 1765
    iget p4, p0, Ll/ܿ᩸;->mMinHeight:I

    invoke-static {v5, p4}, Ljava/lang/Math;->max(II)I

    move-result p5

    .line 1781
    :cond_9
    :goto_3
    invoke-virtual {p1}, Ll/ܶ۠;->ܶ()I

    move-result p4

    if-ne p3, p4, :cond_a

    invoke-virtual {p1}, Ll/ܶ۠;->ۜ()I

    move-result p4

    if-eq p5, p4, :cond_b

    .line 67
    :cond_a
    iget-object p4, p1, Ll/᩸۠;->ۧۧ:Ll/ܽܶ;

    invoke-virtual {p4}, Ll/ܽܶ;->ᩳ()V

    .line 1784
    :cond_b
    invoke-virtual {p1, v5}, Ll/ܶ۠;->֡(I)V

    .line 1785
    invoke-virtual {p1, v5}, Ll/ܶ۠;->ۚ(I)V

    .line 1786
    iget p4, p0, Ll/ܿ᩸;->mMaxWidth:I

    sub-int/2addr p4, v0

    invoke-virtual {p1, p4}, Ll/ܶ۠;->ۡ(I)V

    .line 1787
    iget p4, p0, Ll/ܿ᩸;->mMaxHeight:I

    sub-int/2addr p4, v1

    invoke-virtual {p1, p4}, Ll/ܶ۠;->ۢ(I)V

    .line 1788
    invoke-virtual {p1, v5}, Ll/ܶ۠;->ۖ(I)V

    .line 1789
    invoke-virtual {p1, v5}, Ll/ܶ۠;->ܺ(I)V

    .line 1790
    invoke-virtual {p1, p2}, Ll/ܶ۠;->֫(Ll/۠۠;)V

    .line 1791
    invoke-virtual {p1, p3}, Ll/ܶ۠;->᩵(I)V

    .line 1792
    invoke-virtual {p1, v2}, Ll/ܶ۠;->ۧ(Ll/۠۠;)V

    .line 1793
    invoke-virtual {p1, p5}, Ll/ܶ۠;->ۜ(I)V

    .line 1794
    iget p2, p0, Ll/ܿ᩸;->mMinWidth:I

    sub-int/2addr p2, v0

    invoke-virtual {p1, p2}, Ll/ܶ۠;->ۖ(I)V

    .line 1795
    iget p2, p0, Ll/ܿ᩸;->mMinHeight:I

    sub-int/2addr p2, v1

    invoke-virtual {p1, p2}, Ll/ܶ۠;->ܺ(I)V

    return-void
.end method

.method public setState(III)V
    .locals 1

    .line 1807
    iget-object v0, p0, Ll/ܿ᩸;->mConstraintLayoutSpec:Ll/ۜ᩸;

    if-eqz v0, :cond_0

    int-to-float p2, p2

    int-to-float p3, p3

    .line 1808
    invoke-virtual {v0, p2, p3, p1}, Ll/ۜ᩸;->֫(FFI)V

    :cond_0
    return-void
.end method

.method public shouldDelayChildPressedState()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
