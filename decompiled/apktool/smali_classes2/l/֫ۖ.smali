.class public Ll/֫ۖ;
.super Landroid/view/ViewGroup;
.source "O5DB"


# static fields
.field public static final ACCESSIBILITY_CLASS_NAME:Ljava/lang/String; = "androidx.appcompat.widget.LinearLayoutCompat"

.field public static final HORIZONTAL:I = 0x0

.field public static final INDEX_BOTTOM:I = 0x2

.field public static final INDEX_CENTER_VERTICAL:I = 0x0

.field public static final INDEX_FILL:I = 0x3

.field public static final INDEX_TOP:I = 0x1

.field public static final SHOW_DIVIDER_BEGINNING:I = 0x1

.field public static final SHOW_DIVIDER_END:I = 0x4

.field public static final SHOW_DIVIDER_MIDDLE:I = 0x2

.field public static final SHOW_DIVIDER_NONE:I = 0x0

.field public static final VERTICAL:I = 0x1

.field public static final VERTICAL_GRAVITY_COUNT:I = 0x4


# instance fields
.field public mBaselineAligned:Z

.field public mBaselineAlignedChildIndex:I

.field public mBaselineChildTop:I

.field public mDivider:Landroid/graphics/drawable/Drawable;

.field public mDividerHeight:I

.field public mDividerPadding:I

.field public mDividerWidth:I

.field public mGravity:I

.field public mMaxAscent:[I

.field public mMaxDescent:[I

.field public mOrientation:I

.field public mShowDividers:I

.field public mTotalLength:I

.field public mUseLargestChild:Z

.field public mWeightSum:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 151
    invoke-direct {p0, p1, v0}, Ll/֫ۖ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 155
    invoke-direct {p0, p1, p2, v0}, Ll/֫ۖ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 10

    .line 160
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x1

    .line 102
    iput-boolean v0, p0, Ll/֫ۖ;->mBaselineAligned:Z

    const/4 v1, -0x1

    .line 111
    iput v1, p0, Ll/֫ۖ;->mBaselineAlignedChildIndex:I

    const/4 v2, 0x0

    .line 118
    iput v2, p0, Ll/֫ۖ;->mBaselineChildTop:I

    const v3, 0x800033

    .line 122
    iput v3, p0, Ll/֫ۖ;->mGravity:I

    .line 162
    sget-object v6, Ll/ۗᩳ;->᩵:[I

    invoke-static {p1, p2, v6, p3, v2}, Ll/᩺ۘ;->֫(Landroid/content/Context;Landroid/util/AttributeSet;[III)Ll/᩺ۘ;

    move-result-object v3

    .line 166
    invoke-virtual {v3}, Ll/᩺ۘ;->ܽ()Landroid/content/res/TypedArray;

    move-result-object v8

    move-object v4, p0

    move-object v5, p1

    move-object v7, p2

    move v9, p3

    .line 164
    invoke-static/range {v4 .. v9}, Ll/ܿ᩺;->֫(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    .line 168
    invoke-virtual {v3, v0, v1}, Ll/᩺ۘ;->ܽ(II)I

    move-result p1

    if-ltz p1, :cond_0

    .line 170
    invoke-virtual {p0, p1}, Ll/֫ۖ;->setOrientation(I)V

    .line 173
    :cond_0
    invoke-virtual {v3, v2, v1}, Ll/᩺ۘ;->ܽ(II)I

    move-result p1

    if-ltz p1, :cond_1

    .line 175
    invoke-virtual {p0, p1}, Ll/֫ۖ;->setGravity(I)V

    :cond_1
    const/4 p1, 0x2

    .line 178
    invoke-virtual {v3, p1, v0}, Ll/᩺ۘ;->֫(IZ)Z

    move-result p1

    if-nez p1, :cond_2

    .line 180
    invoke-virtual {p0, p1}, Ll/֫ۖ;->setBaselineAligned(Z)V

    .line 183
    :cond_2
    invoke-virtual {v3}, Ll/᩺ۘ;->֫()F

    move-result p1

    iput p1, p0, Ll/֫ۖ;->mWeightSum:F

    const/4 p1, 0x3

    .line 186
    invoke-virtual {v3, p1, v1}, Ll/᩺ۘ;->ܽ(II)I

    move-result p1

    iput p1, p0, Ll/֫ۖ;->mBaselineAlignedChildIndex:I

    const/4 p1, 0x7

    .line 188
    invoke-virtual {v3, p1, v2}, Ll/᩺ۘ;->֫(IZ)Z

    move-result p1

    iput-boolean p1, p0, Ll/֫ۖ;->mUseLargestChild:Z

    const/4 p1, 0x5

    .line 190
    invoke-virtual {v3, p1}, Ll/᩺ۘ;->ᩳ(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/֫ۖ;->setDividerDrawable(Landroid/graphics/drawable/Drawable;)V

    const/16 p1, 0x8

    .line 191
    invoke-virtual {v3, p1, v2}, Ll/᩺ۘ;->ܽ(II)I

    move-result p1

    iput p1, p0, Ll/֫ۖ;->mShowDividers:I

    const/4 p1, 0x6

    .line 192
    invoke-virtual {v3, p1, v2}, Ll/᩺ۘ;->ۧ(II)I

    move-result p1

    iput p1, p0, Ll/֫ۖ;->mDividerPadding:I

    .line 194
    invoke-virtual {v3}, Ll/᩺ۘ;->ܿ()V

    return-void
.end method

.method private ֫(II)V
    .locals 10

    .line 1337
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_1

    .line 1340
    invoke-virtual {p0, v1}, Ll/֫ۖ;->getVirtualChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 1341
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v4, 0x8

    if-eq v2, v4, :cond_0

    .line 1342
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Ll/۟ܺ;

    .line 1344
    iget v2, v8, Landroid/widget/LinearLayout$LayoutParams;->height:I

    const/4 v4, -0x1

    if-ne v2, v4, :cond_0

    .line 1347
    iget v9, v8, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 1348
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    iput v2, v8, Landroid/widget/LinearLayout$LayoutParams;->width:I

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v2, p0

    move v4, p2

    move v6, v0

    .line 1351
    invoke-virtual/range {v2 .. v7}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 1352
    iput v9, v8, Landroid/widget/LinearLayout$LayoutParams;->width:I

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private ֫(Landroid/view/View;IIII)V
    .locals 0

    add-int/2addr p4, p2

    add-int/2addr p5, p3

    .line 1665
    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method private ۧ(II)V
    .locals 10

    .line 915
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_1

    .line 918
    invoke-virtual {p0, v1}, Ll/֫ۖ;->getVirtualChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 919
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v4, 0x8

    if-eq v2, v4, :cond_0

    .line 920
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Ll/۟ܺ;

    .line 922
    iget v2, v8, Landroid/widget/LinearLayout$LayoutParams;->width:I

    const/4 v4, -0x1

    if-ne v2, v4, :cond_0

    .line 925
    iget v9, v8, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 926
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    iput v2, v8, Landroid/widget/LinearLayout$LayoutParams;->height:I

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v2, p0

    move v4, v0

    move v6, p2

    .line 929
    invoke-virtual/range {v2 .. v7}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 930
    iput v9, v8, Landroid/widget/LinearLayout$LayoutParams;->height:I

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    .line 1783
    instance-of p1, p1, Ll/۟ܺ;

    return p1
.end method

.method public drawDividersHorizontal(Landroid/graphics/Canvas;)V
    .locals 7

    .line 339
    invoke-virtual {p0}, Ll/֫ۖ;->getVirtualChildCount()I

    move-result v0

    .line 340
    sget v1, Ll/᩹ᩴ;->֫:I

    .line 57
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    .line 342
    invoke-virtual {p0, v2}, Ll/֫ۖ;->getVirtualChildAt(I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 344
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v5

    const/16 v6, 0x8

    if-eq v5, v6, :cond_2

    .line 345
    invoke-virtual {p0, v2}, Ll/֫ۖ;->hasDividerBeforeChildAt(I)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 346
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Ll/۟ܺ;

    if-eqz v1, :cond_1

    .line 349
    invoke-virtual {v4}, Landroid/view/View;->getRight()I

    move-result v4

    iget v5, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v4, v5

    goto :goto_1

    .line 351
    :cond_1
    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    move-result v4

    iget v5, v5, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    sub-int/2addr v4, v5

    iget v5, p0, Ll/֫ۖ;->mDividerWidth:I

    sub-int/2addr v4, v5

    .line 353
    :goto_1
    invoke-virtual {p0, p1, v4}, Ll/֫ۖ;->drawVerticalDivider(Landroid/graphics/Canvas;I)V

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 358
    :cond_3
    invoke-virtual {p0, v0}, Ll/֫ۖ;->hasDividerBeforeChildAt(I)Z

    move-result v2

    if-eqz v2, :cond_7

    sub-int/2addr v0, v3

    .line 359
    invoke-virtual {p0, v0}, Ll/֫ۖ;->getVirtualChildAt(I)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_5

    if-eqz v1, :cond_4

    .line 363
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    goto :goto_3

    .line 365
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    iget v1, p0, Ll/֫ۖ;->mDividerWidth:I

    goto :goto_2

    .line 368
    :cond_5
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Ll/۟ܺ;

    if-eqz v1, :cond_6

    .line 370
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    iget v1, v2, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    sub-int/2addr v0, v1

    iget v1, p0, Ll/֫ۖ;->mDividerWidth:I

    :goto_2
    sub-int/2addr v0, v1

    goto :goto_3

    .line 372
    :cond_6
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v0

    iget v1, v2, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v0, v1

    .line 375
    :goto_3
    invoke-virtual {p0, p1, v0}, Ll/֫ۖ;->drawVerticalDivider(Landroid/graphics/Canvas;I)V

    :cond_7
    return-void
.end method

.method public drawDividersVertical(Landroid/graphics/Canvas;)V
    .locals 5

    .line 312
    invoke-virtual {p0}, Ll/֫ۖ;->getVirtualChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 314
    invoke-virtual {p0, v1}, Ll/֫ۖ;->getVirtualChildAt(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 316
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v3

    const/16 v4, 0x8

    if-eq v3, v4, :cond_0

    .line 317
    invoke-virtual {p0, v1}, Ll/֫ۖ;->hasDividerBeforeChildAt(I)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 318
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Ll/۟ܺ;

    .line 319
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v2

    iget v3, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    sub-int/2addr v2, v3

    iget v3, p0, Ll/֫ۖ;->mDividerHeight:I

    sub-int/2addr v2, v3

    .line 320
    invoke-virtual {p0, p1, v2}, Ll/֫ۖ;->drawHorizontalDivider(Landroid/graphics/Canvas;I)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 325
    :cond_1
    invoke-virtual {p0, v0}, Ll/֫ۖ;->hasDividerBeforeChildAt(I)Z

    move-result v1

    if-eqz v1, :cond_3

    add-int/lit8 v0, v0, -0x1

    .line 326
    invoke-virtual {p0, v0}, Ll/֫ۖ;->getVirtualChildAt(I)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_2

    .line 329
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    sub-int/2addr v0, v1

    iget v1, p0, Ll/֫ۖ;->mDividerHeight:I

    sub-int/2addr v0, v1

    goto :goto_1

    .line 331
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Ll/۟ܺ;

    .line 332
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    iget v1, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v0, v1

    .line 334
    :goto_1
    invoke-virtual {p0, p1, v0}, Ll/֫ۖ;->drawHorizontalDivider(Landroid/graphics/Canvas;I)V

    :cond_3
    return-void
.end method

.method public drawHorizontalDivider(Landroid/graphics/Canvas;I)V
    .locals 4

    .line 380
    iget-object v0, p0, Ll/֫ۖ;->mDivider:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    iget v2, p0, Ll/֫ۖ;->mDividerPadding:I

    add-int/2addr v1, v2

    .line 381
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    sub-int/2addr v2, v3

    iget v3, p0, Ll/֫ۖ;->mDividerPadding:I

    sub-int/2addr v2, v3

    iget v3, p0, Ll/֫ۖ;->mDividerHeight:I

    add-int/2addr v3, p2

    .line 380
    invoke-virtual {v0, v1, p2, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 382
    iget-object p2, p0, Ll/֫ۖ;->mDivider:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public drawVerticalDivider(Landroid/graphics/Canvas;I)V
    .locals 5

    .line 386
    iget-object v0, p0, Ll/֫ۖ;->mDivider:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    iget v2, p0, Ll/֫ۖ;->mDividerPadding:I

    add-int/2addr v1, v2

    iget v2, p0, Ll/֫ۖ;->mDividerWidth:I

    add-int/2addr v2, p2

    .line 387
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    iget v4, p0, Ll/֫ۖ;->mDividerPadding:I

    sub-int/2addr v3, v4

    .line 386
    invoke-virtual {v0, p2, v1, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 388
    iget-object p2, p0, Ll/֫ۖ;->mDivider:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 61
    invoke-virtual {p0}, Ll/֫ۖ;->generateDefaultLayoutParams()Ll/۟ܺ;

    move-result-object v0

    return-object v0
.end method

.method public generateDefaultLayoutParams()Ll/۟ܺ;
    .locals 3

    .line 1760
    iget v0, p0, Ll/֫ۖ;->mOrientation:I

    const/4 v1, -0x2

    if-nez v0, :cond_0

    .line 1761
    new-instance v0, Ll/۟ܺ;

    .line 1814
    invoke-direct {v0, v1, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    return-object v0

    :cond_0
    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    .line 1763
    new-instance v0, Ll/۟ܺ;

    const/4 v2, -0x1

    .line 1814
    invoke-direct {v0, v2, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 61
    invoke-virtual {p0, p1}, Ll/֫ۖ;->generateLayoutParams(Landroid/util/AttributeSet;)Ll/۟ܺ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 61
    invoke-virtual {p0, p1}, Ll/֫ۖ;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Ll/۟ܺ;

    move-result-object p1

    return-object p1
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Ll/۟ܺ;
    .locals 2

    .line 1747
    new-instance v0, Ll/۟ܺ;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ll/۟ܺ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Ll/۟ܺ;
    .locals 1

    .line 1770
    instance-of v0, p1, Ll/۟ܺ;

    if-eqz v0, :cond_0

    .line 1771
    new-instance v0, Ll/۟ܺ;

    check-cast p1, Ll/۟ܺ;

    .line 1842
    invoke-direct {v0, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-object v0

    .line 1772
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_1

    .line 1773
    new-instance v0, Ll/۟ܺ;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 1842
    invoke-direct {v0, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-object v0

    .line 1775
    :cond_1
    new-instance v0, Ll/۟ܺ;

    .line 1835
    invoke-direct {v0, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public getBaseline()I
    .locals 6

    .line 442
    iget v0, p0, Ll/֫ۖ;->mBaselineAlignedChildIndex:I

    if-gez v0, :cond_0

    .line 443
    invoke-super {p0}, Landroid/view/ViewGroup;->getBaseline()I

    move-result v0

    return v0

    .line 446
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    iget v1, p0, Ll/֫ۖ;->mBaselineAlignedChildIndex:I

    if-le v0, v1, :cond_6

    .line 451
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 452
    invoke-virtual {v0}, Landroid/view/View;->getBaseline()I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_2

    .line 455
    iget v0, p0, Ll/֫ۖ;->mBaselineAlignedChildIndex:I

    if-nez v0, :cond_1

    return v2

    .line 461
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "mBaselineAlignedChildIndex of LinearLayout points to a View that doesn\'t know how to get its baseline."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 471
    :cond_2
    iget v2, p0, Ll/֫ۖ;->mBaselineChildTop:I

    .line 473
    iget v3, p0, Ll/֫ۖ;->mOrientation:I

    const/4 v4, 0x1

    if-ne v3, v4, :cond_5

    .line 474
    iget v3, p0, Ll/֫ۖ;->mGravity:I

    and-int/lit8 v3, v3, 0x70

    const/16 v4, 0x30

    if-eq v3, v4, :cond_5

    const/16 v4, 0x10

    if-eq v3, v4, :cond_4

    const/16 v4, 0x50

    if-eq v3, v4, :cond_3

    goto :goto_0

    .line 478
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    iget v3, p0, Ll/֫ۖ;->mTotalLength:I

    sub-int/2addr v2, v3

    goto :goto_0

    .line 482
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    iget v4, p0, Ll/֫ۖ;->mTotalLength:I

    const/4 v5, 0x2

    invoke-static {v3, v4, v5, v2}, Ll/۟ۤ᩻;->֫(IIII)I

    move-result v2

    .line 489
    :cond_5
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/۟ܺ;

    .line 490
    iget v0, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int/2addr v2, v0

    add-int/2addr v2, v1

    return v2

    .line 447
    :cond_6
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getBaselineAlignedChildIndex()I
    .locals 1

    .line 500
    iget v0, p0, Ll/֫ۖ;->mBaselineAlignedChildIndex:I

    return v0
.end method

.method public getChildrenSkipCount(Landroid/view/View;I)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public getDividerDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 238
    iget-object v0, p0, Ll/֫ۖ;->mDivider:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getDividerPadding()I
    .locals 1

    .line 286
    iget v0, p0, Ll/֫ۖ;->mDividerPadding:I

    return v0
.end method

.method public getDividerWidth()I
    .locals 1

    .line 295
    iget v0, p0, Ll/֫ۖ;->mDividerWidth:I

    return v0
.end method

.method public getGravity()I
    .locals 1

    .line 1726
    iget v0, p0, Ll/֫ۖ;->mGravity:I

    return v0
.end method

.method public getLocationOffset(Landroid/view/View;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public getNextLocationOffset(Landroid/view/View;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public getOrientation()I
    .locals 1

    .line 1691
    iget v0, p0, Ll/֫ۖ;->mOrientation:I

    return v0
.end method

.method public getShowDividers()I
    .locals 1

    .line 228
    iget v0, p0, Ll/֫ۖ;->mShowDividers:I

    return v0
.end method

.method public getVirtualChildAt(I)Landroid/view/View;
    .locals 0

    .line 525
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public getVirtualChildCount()I
    .locals 1

    .line 538
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    return v0
.end method

.method public getWeightSum()F
    .locals 1

    .line 550
    iget v0, p0, Ll/֫ۖ;->mWeightSum:F

    return v0
.end method

.method public hasDividerBeforeChildAt(I)Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p1, :cond_1

    .line 587
    iget p1, p0, Ll/֫ۖ;->mShowDividers:I

    and-int/2addr p1, v1

    if-eqz p1, :cond_0

    return v1

    :cond_0
    return v0

    .line 588
    :cond_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-ne p1, v2, :cond_3

    .line 589
    iget p1, p0, Ll/֫ۖ;->mShowDividers:I

    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_2

    return v1

    :cond_2
    return v0

    .line 590
    :cond_3
    iget v2, p0, Ll/֫ۖ;->mShowDividers:I

    and-int/lit8 v2, v2, 0x2

    if-eqz v2, :cond_5

    sub-int/2addr p1, v1

    :goto_0
    if-ltz p1, :cond_5

    .line 593
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v3, 0x8

    if-eq v2, v3, :cond_4

    return v1

    :cond_4
    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_5
    return v0
.end method

.method public isBaselineAligned()Z
    .locals 1

    .line 399
    iget-boolean v0, p0, Ll/֫ۖ;->mBaselineAligned:Z

    return v0
.end method

.method public isMeasureWithLargestChildEnabled()Z
    .locals 1

    .line 423
    iget-boolean v0, p0, Ll/֫ۖ;->mUseLargestChild:Z

    return v0
.end method

.method public layoutHorizontal(IIII)V
    .locals 22

    move-object/from16 v6, p0

    .line 1541
    sget v0, Ll/᩹ᩴ;->֫:I

    .line 57
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 1542
    :goto_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v7

    sub-int v2, p4, p2

    .line 1549
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    sub-int v8, v2, v3

    sub-int/2addr v2, v7

    .line 1552
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    sub-int v9, v2, v3

    .line 1554
    invoke-virtual/range {p0 .. p0}, Ll/֫ۖ;->getVirtualChildCount()I

    move-result v10

    .line 1556
    iget v2, v6, Ll/֫ۖ;->mGravity:I

    const v3, 0x800007

    and-int/2addr v3, v2

    and-int/lit8 v11, v2, 0x70

    .line 1559
    iget-boolean v12, v6, Ll/֫ۖ;->mBaselineAligned:Z

    .line 1561
    iget-object v13, v6, Ll/֫ۖ;->mMaxAscent:[I

    .line 1562
    iget-object v14, v6, Ll/֫ۖ;->mMaxDescent:[I

    .line 1564
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v2

    .line 134
    invoke-static {v3, v2}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v2

    const/4 v3, 0x2

    if-eq v2, v1, :cond_2

    const/4 v1, 0x5

    if-eq v2, v1, :cond_1

    .line 1578
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    goto :goto_1

    .line 1568
    :cond_1
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    add-int v1, v1, p3

    sub-int v1, v1, p1

    iget v2, v6, Ll/֫ۖ;->mTotalLength:I

    sub-int/2addr v1, v2

    goto :goto_1

    .line 1573
    :cond_2
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    sub-int v2, p3, p1

    iget v4, v6, Ll/֫ۖ;->mTotalLength:I

    invoke-static {v2, v4, v3, v1}, Ll/۟ۤ᩻;->֫(IIII)I

    move-result v1

    :goto_1
    if-eqz v0, :cond_3

    add-int/lit8 v0, v10, -0x1

    const/4 v2, -0x1

    move v15, v0

    const/16 v16, -0x1

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    const/4 v2, 0x1

    const/4 v15, 0x0

    const/16 v16, 0x1

    :goto_2
    const/4 v0, 0x0

    const/4 v5, 0x0

    :goto_3
    if-ge v5, v10, :cond_f

    mul-int v0, v16, v5

    add-int v4, v0, v15

    .line 1592
    invoke-virtual {v6, v4}, Ll/֫ۖ;->getVirtualChildAt(I)Landroid/view/View;

    move-result-object v3

    if-nez v3, :cond_4

    .line 1595
    invoke-virtual {v6, v4}, Ll/֫ۖ;->measureNullChild(I)I

    move-result v0

    add-int/2addr v1, v0

    :goto_4
    move/from16 v17, v7

    move/from16 p2, v8

    move/from16 p4, v10

    move/from16 v19, v11

    goto/16 :goto_8

    .line 1596
    :cond_4
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v17, 0x2

    const/16 v0, 0x8

    if-eq v2, v0, :cond_e

    .line 1597
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v18

    .line 1598
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    .line 1602
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/۟ܺ;

    if-eqz v12, :cond_5

    move/from16 p2, v5

    .line 1604
    iget v5, v0, Landroid/widget/LinearLayout$LayoutParams;->height:I

    move/from16 p4, v10

    const/4 v10, -0x1

    if-eq v5, v10, :cond_6

    .line 1605
    invoke-virtual {v3}, Landroid/view/View;->getBaseline()I

    move-result v5

    goto :goto_5

    :cond_5
    move/from16 p2, v5

    move/from16 p4, v10

    :cond_6
    const/4 v5, -0x1

    .line 1608
    :goto_5
    iget v10, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    if-gez v10, :cond_7

    move v10, v11

    :cond_7
    and-int/lit8 v10, v10, 0x70

    move/from16 v19, v11

    const/16 v11, 0x10

    if-eq v10, v11, :cond_c

    const/16 v11, 0x30

    if-eq v10, v11, :cond_9

    const/16 v11, 0x50

    if-eq v10, v11, :cond_8

    move v10, v7

    goto :goto_6

    :cond_8
    sub-int v10, v8, v2

    .line 1638
    iget v11, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    sub-int/2addr v10, v11

    const/4 v11, -0x1

    if-eq v5, v11, :cond_b

    .line 1640
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v11

    sub-int/2addr v11, v5

    .line 1641
    aget v5, v14, v17

    sub-int/2addr v5, v11

    sub-int/2addr v10, v5

    goto :goto_6

    :cond_9
    const/4 v10, -0x1

    .line 1615
    iget v11, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int/2addr v11, v7

    if-eq v5, v10, :cond_a

    const/4 v10, 0x1

    .line 1617
    aget v10, v13, v10

    sub-int/2addr v10, v5

    add-int/2addr v10, v11

    goto :goto_6

    :cond_a
    move v10, v11

    :cond_b
    :goto_6
    move v5, v10

    goto :goto_7

    :cond_c
    const/4 v5, 0x2

    .line 1616
    invoke-static {v9, v2, v5, v7}, Ll/۟ۤ᩻;->֫(IIII)I

    move-result v5

    .line 1633
    iget v10, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int/2addr v5, v10

    iget v10, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    sub-int/2addr v5, v10

    .line 1649
    :goto_7
    invoke-virtual {v6, v4}, Ll/֫ۖ;->hasDividerBeforeChildAt(I)Z

    move-result v10

    if-eqz v10, :cond_d

    .line 1650
    iget v10, v6, Ll/֫ۖ;->mDividerWidth:I

    add-int/2addr v1, v10

    .line 1653
    :cond_d
    iget v10, v0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v10, v1

    .line 1654
    invoke-virtual {v6, v3}, Ll/֫ۖ;->getLocationOffset(Landroid/view/View;)I

    move-result v1

    add-int v11, v1, v10

    move-object v1, v0

    move-object/from16 v0, p0

    move/from16 v17, v7

    move-object v7, v1

    move-object v1, v3

    move/from16 v20, v2

    move v2, v11

    move-object v11, v3

    move v3, v5

    move v5, v4

    move/from16 v4, v18

    move/from16 v21, p2

    move/from16 p2, v8

    move v8, v5

    move/from16 v5, v20

    invoke-direct/range {v0 .. v5}, Ll/֫ۖ;->֫(Landroid/view/View;IIII)V

    .line 1656
    iget v0, v7, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int v0, v0, v18

    .line 1657
    invoke-virtual {v6, v11}, Ll/֫ۖ;->getNextLocationOffset(Landroid/view/View;)I

    move-result v1

    add-int/2addr v0, v1

    add-int/2addr v0, v10

    .line 1659
    invoke-virtual {v6, v11, v8}, Ll/֫ۖ;->getChildrenSkipCount(Landroid/view/View;I)I

    move-result v1

    add-int v5, v1, v21

    move v1, v0

    goto :goto_8

    :cond_e
    move/from16 v21, v5

    goto/16 :goto_4

    :goto_8
    add-int/lit8 v5, v5, 0x1

    move/from16 v8, p2

    move/from16 v10, p4

    move/from16 v7, v17

    move/from16 v11, v19

    goto/16 :goto_3

    :cond_f
    return-void
.end method

.method public layoutVertical(IIII)V
    .locals 18

    move-object/from16 v6, p0

    .line 1446
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v7

    sub-int v0, p3, p1

    .line 1453
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    sub-int v8, v0, v1

    sub-int/2addr v0, v7

    .line 1456
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    sub-int v9, v0, v1

    .line 1458
    invoke-virtual/range {p0 .. p0}, Ll/֫ۖ;->getVirtualChildCount()I

    move-result v10

    .line 1460
    iget v0, v6, Ll/֫ۖ;->mGravity:I

    and-int/lit8 v1, v0, 0x70

    const v2, 0x800007

    and-int v11, v0, v2

    const/16 v0, 0x10

    const/4 v12, 0x2

    if-eq v1, v0, :cond_1

    const/16 v0, 0x50

    if-eq v1, v0, :cond_0

    .line 1476
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    goto :goto_0

    .line 1466
    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    add-int v0, v0, p4

    sub-int v0, v0, p2

    iget v1, v6, Ll/֫ۖ;->mTotalLength:I

    sub-int/2addr v0, v1

    goto :goto_0

    .line 1471
    :cond_1
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    sub-int v1, p4, p2

    iget v2, v6, Ll/֫ۖ;->mTotalLength:I

    invoke-static {v1, v2, v12, v0}, Ll/۟ۤ᩻;->֫(IIII)I

    move-result v0

    :goto_0
    const/4 v1, 0x0

    const/4 v13, 0x0

    :goto_1
    if-ge v13, v10, :cond_8

    .line 1481
    invoke-virtual {v6, v13}, Ll/֫ۖ;->getVirtualChildAt(I)Landroid/view/View;

    move-result-object v14

    const/4 v15, 0x1

    if-nez v14, :cond_2

    .line 1483
    invoke-virtual {v6, v13}, Ll/֫ۖ;->measureNullChild(I)I

    move-result v1

    add-int/2addr v1, v0

    move v0, v1

    goto/16 :goto_4

    .line 1484
    :cond_2
    invoke-virtual {v14}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/16 v2, 0x8

    if-eq v1, v2, :cond_7

    .line 1485
    invoke-virtual {v14}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    .line 1486
    invoke-virtual {v14}, Landroid/view/View;->getMeasuredHeight()I

    move-result v16

    .line 1489
    invoke-virtual {v14}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Ll/۟ܺ;

    .line 1491
    iget v1, v5, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    if-gez v1, :cond_3

    move v1, v11

    .line 1495
    :cond_3
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v2

    .line 134
    invoke-static {v1, v2}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v1

    and-int/lit8 v1, v1, 0x7

    if-eq v1, v15, :cond_5

    const/4 v2, 0x5

    if-eq v1, v2, :cond_4

    .line 1510
    iget v1, v5, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v1, v7

    goto :goto_3

    :cond_4
    sub-int v1, v8, v4

    .line 1505
    iget v2, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    goto :goto_2

    .line 1506
    :cond_5
    invoke-static {v9, v4, v12, v7}, Ll/۟ۤ᩻;->֫(IIII)I

    move-result v1

    .line 1500
    iget v2, v5, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v1, v2

    iget v2, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    :goto_2
    sub-int/2addr v1, v2

    :goto_3
    move v2, v1

    .line 1514
    invoke-virtual {v6, v13}, Ll/֫ۖ;->hasDividerBeforeChildAt(I)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 1515
    iget v1, v6, Ll/֫ۖ;->mDividerHeight:I

    add-int/2addr v0, v1

    .line 1518
    :cond_6
    iget v1, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int v17, v1, v0

    .line 1519
    invoke-virtual {v6, v14}, Ll/֫ۖ;->getLocationOffset(Landroid/view/View;)I

    move-result v0

    add-int v3, v0, v17

    move-object/from16 v0, p0

    move-object v1, v14

    move-object v12, v5

    move/from16 v5, v16

    invoke-direct/range {v0 .. v5}, Ll/֫ۖ;->֫(Landroid/view/View;IIII)V

    .line 1521
    iget v0, v12, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int v16, v16, v0

    invoke-virtual {v6, v14}, Ll/֫ۖ;->getNextLocationOffset(Landroid/view/View;)I

    move-result v0

    add-int v16, v16, v0

    add-int v16, v16, v17

    .line 1523
    invoke-virtual {v6, v14, v13}, Ll/֫ۖ;->getChildrenSkipCount(Landroid/view/View;I)I

    move-result v0

    add-int/2addr v13, v0

    move/from16 v0, v16

    :cond_7
    :goto_4
    add-int/2addr v13, v15

    const/4 v12, 0x2

    goto/16 :goto_1

    :cond_8
    return-void
.end method

.method public measureChildBeforeLayout(Landroid/view/View;IIIII)V
    .locals 6

    move-object v0, p0

    move-object v1, p1

    move v2, p3

    move v3, p4

    move v4, p5

    move v5, p6

    .line 1397
    invoke-virtual/range {v0 .. v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    return-void
.end method

.method public measureHorizontal(II)V
    .locals 35

    move-object/from16 v7, p0

    move/from16 v8, p1

    move/from16 v9, p2

    const/4 v0, 0x0

    .line 948
    iput v0, v7, Ll/֫ۖ;->mTotalLength:I

    .line 956
    invoke-virtual/range {p0 .. p0}, Ll/֫ۖ;->getVirtualChildCount()I

    move-result v10

    .line 958
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v11

    .line 959
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v12

    .line 964
    iget-object v1, v7, Ll/֫ۖ;->mMaxAscent:[I

    const/4 v2, 0x4

    if-eqz v1, :cond_0

    iget-object v1, v7, Ll/֫ۖ;->mMaxDescent:[I

    if-nez v1, :cond_1

    :cond_0
    new-array v1, v2, [I

    .line 965
    iput-object v1, v7, Ll/֫ۖ;->mMaxAscent:[I

    new-array v1, v2, [I

    .line 966
    iput-object v1, v7, Ll/֫ۖ;->mMaxDescent:[I

    .line 969
    :cond_1
    iget-object v13, v7, Ll/֫ۖ;->mMaxAscent:[I

    .line 970
    iget-object v14, v7, Ll/֫ۖ;->mMaxDescent:[I

    const/4 v1, 0x3

    const/4 v2, -0x1

    .line 972
    aput v2, v13, v1

    const/4 v15, 0x2

    aput v2, v13, v15

    const/16 v16, 0x1

    aput v2, v13, v16

    aput v2, v13, v0

    .line 973
    aput v2, v14, v1

    aput v2, v14, v15

    aput v2, v14, v16

    aput v2, v14, v0

    .line 975
    iget-boolean v6, v7, Ll/֫ۖ;->mBaselineAligned:Z

    .line 976
    iget-boolean v5, v7, Ll/֫ۖ;->mUseLargestChild:Z

    const/high16 v0, 0x40000000    # 2.0f

    if-ne v11, v0, :cond_2

    const/4 v1, 0x1

    const/16 v17, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    const/16 v17, 0x0

    :goto_0
    const/16 v18, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x3

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x1

    const/16 v25, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v15, 0x0

    const/16 v20, 0x0

    :goto_1
    if-ge v4, v10, :cond_15

    .line 984
    invoke-virtual {v7, v4}, Ll/֫ۖ;->getVirtualChildAt(I)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_3

    .line 987
    iget v0, v7, Ll/֫ۖ;->mTotalLength:I

    invoke-virtual {v7, v4}, Ll/֫ۖ;->measureNullChild(I)I

    move-result v1

    add-int/2addr v0, v1

    iput v0, v7, Ll/֫ۖ;->mTotalLength:I

    move/from16 v26, v3

    move/from16 v27, v5

    goto :goto_2

    :cond_3
    move/from16 v26, v3

    .line 991
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v3

    move/from16 v27, v5

    const/16 v5, 0x8

    if-ne v3, v5, :cond_4

    .line 992
    invoke-virtual {v7, v1, v4}, Ll/֫ۖ;->getChildrenSkipCount(Landroid/view/View;I)I

    move-result v0

    add-int/2addr v4, v0

    :goto_2
    move/from16 v28, v6

    move/from16 v3, v26

    move/from16 v26, v27

    move/from16 v27, v11

    goto/16 :goto_e

    .line 996
    :cond_4
    invoke-virtual {v7, v4}, Ll/֫ۖ;->hasDividerBeforeChildAt(I)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 997
    iget v3, v7, Ll/֫ۖ;->mTotalLength:I

    iget v5, v7, Ll/֫ۖ;->mDividerWidth:I

    add-int/2addr v3, v5

    iput v3, v7, Ll/֫ۖ;->mTotalLength:I

    .line 1001
    :cond_5
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ll/۟ܺ;

    .line 1003
    iget v3, v5, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    add-float v23, v2, v3

    if-ne v11, v0, :cond_8

    .line 1005
    iget v0, v5, Landroid/widget/LinearLayout$LayoutParams;->width:I

    if-nez v0, :cond_8

    cmpl-float v0, v3, v18

    if-lez v0, :cond_8

    if-eqz v17, :cond_6

    .line 1010
    iget v0, v7, Ll/֫ۖ;->mTotalLength:I

    iget v2, v5, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    iget v3, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v2, v3

    add-int/2addr v2, v0

    iput v2, v7, Ll/֫ۖ;->mTotalLength:I

    goto :goto_3

    .line 1012
    :cond_6
    iget v0, v7, Ll/֫ۖ;->mTotalLength:I

    .line 1013
    iget v2, v5, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v2, v0

    iget v3, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v2, v3

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, v7, Ll/֫ۖ;->mTotalLength:I

    :goto_3
    if-eqz v6, :cond_7

    const/4 v0, 0x0

    .line 1023
    invoke-static {v0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 1024
    invoke-virtual {v1, v0, v0}, Landroid/view/View;->measure(II)V

    const/high16 v0, 0x40000000    # 2.0f

    goto :goto_4

    :cond_7
    const/high16 v0, 0x40000000    # 2.0f

    const/16 v22, 0x1

    :goto_4
    move-object v3, v1

    move/from16 v34, v4

    move/from16 v28, v6

    move/from16 v31, v20

    move/from16 v32, v26

    move/from16 v26, v27

    move/from16 v27, v11

    move-object v11, v5

    goto/16 :goto_8

    .line 1031
    :cond_8
    iget v0, v5, Landroid/widget/LinearLayout$LayoutParams;->width:I

    if-nez v0, :cond_9

    cmpl-float v0, v3, v18

    if-lez v0, :cond_9

    const/4 v0, -0x2

    .line 1037
    iput v0, v5, Landroid/widget/LinearLayout$LayoutParams;->width:I

    const/4 v0, 0x0

    const/4 v3, 0x0

    goto :goto_5

    :cond_9
    const/high16 v0, -0x80000000

    const/high16 v3, -0x80000000

    :goto_5
    cmpl-float v0, v23, v18

    if-nez v0, :cond_a

    .line 1045
    iget v0, v7, Ll/֫ۖ;->mTotalLength:I

    move/from16 v28, v0

    goto :goto_6

    :cond_a
    const/4 v0, 0x0

    const/16 v28, 0x0

    :goto_6
    const/high16 v29, 0x40000000    # 2.0f

    const/high16 v2, -0x80000000

    const/16 v30, 0x0

    move-object/from16 v0, p0

    move/from16 v31, v20

    move-object/from16 v20, v1

    move v2, v4

    move/from16 v33, v3

    move/from16 v32, v26

    move/from16 v3, p1

    move/from16 v34, v4

    move/from16 v4, v28

    move/from16 v26, v27

    move/from16 v27, v11

    move-object v11, v5

    move/from16 v5, p2

    move/from16 v28, v6

    move/from16 v6, v30

    .line 1044
    invoke-virtual/range {v0 .. v6}, Ll/֫ۖ;->measureChildBeforeLayout(Landroid/view/View;IIIII)V

    move/from16 v1, v33

    const/high16 v0, -0x80000000

    if-eq v1, v0, :cond_b

    .line 1049
    iput v1, v11, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 1052
    :cond_b
    invoke-virtual/range {v20 .. v20}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    if-eqz v17, :cond_c

    .line 1054
    iget v1, v7, Ll/֫ۖ;->mTotalLength:I

    iget v2, v11, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v2, v0

    iget v3, v11, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v2, v3

    move-object/from16 v3, v20

    .line 1055
    invoke-virtual {v7, v3}, Ll/֫ۖ;->getNextLocationOffset(Landroid/view/View;)I

    move-result v4

    add-int/2addr v2, v4

    add-int/2addr v2, v1

    iput v2, v7, Ll/֫ۖ;->mTotalLength:I

    goto :goto_7

    :cond_c
    move-object/from16 v3, v20

    .line 1057
    iget v1, v7, Ll/֫ۖ;->mTotalLength:I

    add-int v2, v1, v0

    .line 1058
    iget v4, v11, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v2, v4

    iget v4, v11, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v2, v4

    .line 1059
    invoke-virtual {v7, v3}, Ll/֫ۖ;->getNextLocationOffset(Landroid/view/View;)I

    move-result v4

    add-int/2addr v2, v4

    .line 1058
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v7, Ll/֫ۖ;->mTotalLength:I

    :goto_7
    if-eqz v26, :cond_d

    .line 1063
    invoke-static {v0, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    :cond_d
    const/high16 v0, 0x40000000    # 2.0f

    :goto_8
    if-eq v12, v0, :cond_e

    .line 1068
    iget v0, v11, Landroid/widget/LinearLayout$LayoutParams;->height:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_e

    const/4 v0, 0x1

    const/16 v25, 0x1

    goto :goto_9

    :cond_e
    const/4 v0, 0x0

    .line 1076
    :goto_9
    iget v1, v11, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    iget v2, v11, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v1, v2

    .line 1077
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    add-int/2addr v2, v1

    .line 1078
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredState()I

    move-result v4

    invoke-static {v8, v4}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v4

    if-eqz v28, :cond_10

    .line 1081
    invoke-virtual {v3}, Landroid/view/View;->getBaseline()I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_10

    .line 1085
    iget v6, v11, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    if-gez v6, :cond_f

    iget v6, v7, Ll/֫ۖ;->mGravity:I

    :cond_f
    and-int/lit8 v6, v6, 0x70

    shr-int/lit8 v6, v6, 0x4

    and-int/lit8 v6, v6, -0x2

    shr-int/lit8 v6, v6, 0x1

    .line 1090
    aget v8, v13, v6

    invoke-static {v8, v5}, Ljava/lang/Math;->max(II)I

    move-result v8

    aput v8, v13, v6

    .line 1091
    aget v8, v14, v6

    sub-int v5, v2, v5

    invoke-static {v8, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    aput v5, v14, v6

    :cond_10
    move/from16 v5, v32

    .line 1095
    invoke-static {v5, v2}, Ljava/lang/Math;->max(II)I

    move-result v5

    if-eqz v24, :cond_11

    .line 1097
    iget v6, v11, Landroid/widget/LinearLayout$LayoutParams;->height:I

    const/4 v8, -0x1

    if-ne v6, v8, :cond_11

    const/4 v6, 0x1

    goto :goto_a

    :cond_11
    const/4 v6, 0x0

    .line 1098
    :goto_a
    iget v8, v11, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    cmpl-float v8, v8, v18

    if-lez v8, :cond_13

    if-eqz v0, :cond_12

    goto :goto_b

    :cond_12
    move v1, v2

    .line 1103
    :goto_b
    invoke-static {v15, v1}, Ljava/lang/Math;->max(II)I

    move-result v15

    move/from16 v1, v31

    goto :goto_d

    :cond_13
    if-eqz v0, :cond_14

    goto :goto_c

    :cond_14
    move v1, v2

    :goto_c
    move/from16 v0, v31

    .line 1106
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    :goto_d
    move/from16 v0, v34

    .line 1110
    invoke-virtual {v7, v3, v0}, Ll/֫ۖ;->getChildrenSkipCount(Landroid/view/View;I)I

    move-result v2

    add-int/2addr v0, v2

    move/from16 v20, v1

    move v8, v4

    move v3, v5

    move/from16 v24, v6

    move/from16 v2, v23

    move v4, v0

    :goto_e
    add-int/lit8 v4, v4, 0x1

    const/high16 v0, 0x40000000    # 2.0f

    move/from16 v5, v26

    move/from16 v11, v27

    move/from16 v6, v28

    goto/16 :goto_1

    :cond_15
    move/from16 v26, v5

    move/from16 v28, v6

    move/from16 v27, v11

    move/from16 v0, v20

    move v5, v3

    .line 1113
    iget v1, v7, Ll/֫ۖ;->mTotalLength:I

    if-lez v1, :cond_16

    invoke-virtual {v7, v10}, Ll/֫ۖ;->hasDividerBeforeChildAt(I)Z

    move-result v1

    if-eqz v1, :cond_16

    .line 1114
    iget v1, v7, Ll/֫ۖ;->mTotalLength:I

    iget v3, v7, Ll/֫ۖ;->mDividerWidth:I

    add-int/2addr v1, v3

    iput v1, v7, Ll/֫ۖ;->mTotalLength:I

    .line 1119
    :cond_16
    aget v1, v13, v16

    const/4 v3, -0x1

    if-ne v1, v3, :cond_18

    const/4 v4, 0x0

    aget v4, v13, v4

    if-ne v4, v3, :cond_18

    const/4 v4, 0x2

    aget v6, v13, v4

    if-ne v6, v3, :cond_18

    aget v4, v13, v21

    if-eq v4, v3, :cond_17

    goto :goto_f

    :cond_17
    move v3, v5

    move/from16 v20, v8

    goto :goto_10

    .line 1123
    :cond_18
    :goto_f
    aget v3, v13, v21

    const/4 v4, 0x0

    aget v6, v13, v4

    const/4 v11, 0x2

    aget v4, v13, v11

    .line 1125
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 1124
    invoke-static {v6, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 1123
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 1126
    aget v3, v14, v21

    const/4 v4, 0x0

    aget v4, v14, v4

    aget v6, v14, v16

    move/from16 v20, v8

    aget v8, v14, v11

    .line 1128
    invoke-static {v6, v8}, Ljava/lang/Math;->max(II)I

    move-result v6

    .line 1127
    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 1126
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    add-int/2addr v3, v1

    .line 1129
    invoke-static {v5, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    :goto_10
    if-eqz v26, :cond_1d

    const/high16 v1, -0x80000000

    move/from16 v4, v27

    if-eq v4, v1, :cond_19

    if-nez v4, :cond_1e

    :cond_19
    const/4 v1, 0x0

    .line 1134
    iput v1, v7, Ll/֫ۖ;->mTotalLength:I

    const/4 v1, 0x0

    :goto_11
    if-ge v1, v10, :cond_1e

    .line 1137
    invoke-virtual {v7, v1}, Ll/֫ۖ;->getVirtualChildAt(I)Landroid/view/View;

    move-result-object v5

    if-nez v5, :cond_1a

    .line 1140
    iget v5, v7, Ll/֫ۖ;->mTotalLength:I

    invoke-virtual {v7, v1}, Ll/֫ۖ;->measureNullChild(I)I

    move-result v6

    add-int/2addr v5, v6

    iput v5, v7, Ll/֫ۖ;->mTotalLength:I

    goto :goto_12

    .line 1144
    :cond_1a
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v6

    const/16 v8, 0x8

    if-ne v6, v8, :cond_1b

    .line 1145
    invoke-virtual {v7, v5, v1}, Ll/֫ۖ;->getChildrenSkipCount(Landroid/view/View;I)I

    move-result v5

    add-int/2addr v1, v5

    goto :goto_12

    .line 1150
    :cond_1b
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Ll/۟ܺ;

    if-eqz v17, :cond_1c

    .line 1152
    iget v8, v7, Ll/֫ۖ;->mTotalLength:I

    iget v11, v6, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v11, v9

    iget v6, v6, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v11, v6

    .line 1153
    invoke-virtual {v7, v5}, Ll/֫ۖ;->getNextLocationOffset(Landroid/view/View;)I

    move-result v5

    add-int/2addr v11, v5

    add-int/2addr v11, v8

    iput v11, v7, Ll/֫ۖ;->mTotalLength:I

    goto :goto_12

    .line 1155
    :cond_1c
    iget v8, v7, Ll/֫ۖ;->mTotalLength:I

    add-int v11, v8, v9

    move/from16 v23, v1

    .line 1156
    iget v1, v6, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v11, v1

    iget v1, v6, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v11, v1

    .line 1157
    invoke-virtual {v7, v5}, Ll/֫ۖ;->getNextLocationOffset(Landroid/view/View;)I

    move-result v1

    add-int/2addr v11, v1

    .line 1156
    invoke-static {v8, v11}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v7, Ll/֫ۖ;->mTotalLength:I

    move/from16 v1, v23

    :goto_12
    add-int/lit8 v1, v1, 0x1

    goto :goto_11

    :cond_1d
    move/from16 v4, v27

    .line 1163
    :cond_1e
    iget v1, v7, Ll/֫ۖ;->mTotalLength:I

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v6

    add-int/2addr v6, v5

    add-int/2addr v6, v1

    iput v6, v7, Ll/֫ۖ;->mTotalLength:I

    .line 1168
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    move-result v1

    invoke-static {v6, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    const/4 v5, 0x0

    move/from16 v6, p1

    move/from16 v8, v20

    .line 1171
    invoke-static {v1, v6, v5}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v1

    const v5, 0xffffff

    and-int/2addr v5, v1

    .line 1177
    iget v11, v7, Ll/֫ۖ;->mTotalLength:I

    sub-int/2addr v5, v11

    if-nez v22, :cond_23

    if-eqz v5, :cond_1f

    cmpl-float v11, v2, v18

    if-lez v11, :cond_1f

    goto :goto_15

    .line 1289
    :cond_1f
    invoke-static {v0, v15}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-eqz v26, :cond_22

    const/high16 v2, 0x40000000    # 2.0f

    if-eq v4, v2, :cond_22

    const/4 v2, 0x0

    :goto_13
    if-ge v2, v10, :cond_22

    .line 1295
    invoke-virtual {v7, v2}, Ll/֫ۖ;->getVirtualChildAt(I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_21

    .line 1297
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v5

    const/16 v11, 0x8

    if-ne v5, v11, :cond_20

    goto :goto_14

    .line 1302
    :cond_20
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Ll/۟ܺ;

    .line 1304
    iget v5, v5, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    cmpl-float v5, v5, v18

    if-lez v5, :cond_21

    const/high16 v5, 0x40000000    # 2.0f

    .line 1307
    invoke-static {v9, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v11

    .line 1308
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v13

    invoke-static {v13, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    .line 1306
    invoke-virtual {v4, v11, v5}, Landroid/view/View;->measure(II)V

    :cond_21
    :goto_14
    add-int/lit8 v2, v2, 0x1

    goto :goto_13

    :cond_22
    const/high16 v2, -0x1000000

    move/from16 v5, p2

    move/from16 v22, v10

    goto/16 :goto_22

    .line 1179
    :cond_23
    :goto_15
    iget v3, v7, Ll/֫ۖ;->mWeightSum:F

    cmpl-float v9, v3, v18

    if-lez v9, :cond_24

    move v2, v3

    :cond_24
    const/4 v3, -0x1

    .line 1181
    aput v3, v13, v21

    const/4 v9, 0x2

    aput v3, v13, v9

    aput v3, v13, v16

    const/4 v11, 0x0

    aput v3, v13, v11

    .line 1182
    aput v3, v14, v21

    aput v3, v14, v9

    aput v3, v14, v16

    aput v3, v14, v11

    .line 1185
    iput v11, v7, Ll/֫ۖ;->mTotalLength:I

    const/4 v9, 0x0

    :goto_16
    if-ge v9, v10, :cond_33

    .line 1188
    invoke-virtual {v7, v9}, Ll/֫ۖ;->getVirtualChildAt(I)Landroid/view/View;

    move-result-object v11

    if-eqz v11, :cond_32

    .line 1190
    invoke-virtual {v11}, Landroid/view/View;->getVisibility()I

    move-result v15

    const/16 v6, 0x8

    if-ne v15, v6, :cond_25

    goto/16 :goto_20

    .line 1195
    :cond_25
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Ll/۟ܺ;

    .line 1197
    iget v15, v6, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    cmpl-float v22, v15, v18

    if-lez v22, :cond_2a

    move/from16 v22, v10

    int-to-float v10, v5

    mul-float v10, v10, v15

    div-float/2addr v10, v2

    float-to-int v10, v10

    sub-float/2addr v2, v15

    sub-int/2addr v5, v10

    .line 1206
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v15

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v23

    add-int v23, v23, v15

    iget v15, v6, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int v23, v23, v15

    iget v15, v6, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int v15, v23, v15

    move/from16 v23, v2

    iget v2, v6, Landroid/widget/LinearLayout$LayoutParams;->height:I

    move/from16 v26, v5

    move/from16 v5, p2

    .line 1204
    invoke-static {v5, v15, v2}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v2

    .line 1211
    iget v15, v6, Landroid/widget/LinearLayout$LayoutParams;->width:I

    if-nez v15, :cond_28

    const/high16 v15, 0x40000000    # 2.0f

    if-eq v4, v15, :cond_26

    goto :goto_18

    :cond_26
    if-lez v10, :cond_27

    goto :goto_17

    :cond_27
    const/4 v10, 0x0

    .line 1224
    :goto_17
    invoke-static {v10, v15}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v10

    invoke-virtual {v11, v10, v2}, Landroid/view/View;->measure(II)V

    goto :goto_1a

    :cond_28
    const/high16 v15, 0x40000000    # 2.0f

    .line 1214
    :goto_18
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    move-result v27

    add-int v27, v27, v10

    if-gez v27, :cond_29

    const/16 v27, 0x0

    const/4 v10, 0x0

    goto :goto_19

    :cond_29
    move/from16 v10, v27

    .line 1220
    :goto_19
    invoke-static {v10, v15}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v10

    .line 1219
    invoke-virtual {v11, v10, v2}, Landroid/view/View;->measure(II)V

    .line 1231
    :goto_1a
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredState()I

    move-result v2

    const/high16 v10, -0x1000000

    and-int/2addr v2, v10

    .line 1230
    invoke-static {v8, v2}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v8

    move/from16 v2, v23

    move/from16 v10, v26

    goto :goto_1b

    :cond_2a
    move/from16 v22, v10

    move v10, v5

    move/from16 v5, p2

    :goto_1b
    if-eqz v17, :cond_2b

    .line 1235
    iget v15, v7, Ll/֫ۖ;->mTotalLength:I

    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    move-result v20

    move/from16 v23, v2

    iget v2, v6, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int v20, v20, v2

    iget v2, v6, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int v20, v20, v2

    .line 1236
    invoke-virtual {v7, v11}, Ll/֫ۖ;->getNextLocationOffset(Landroid/view/View;)I

    move-result v2

    add-int v20, v20, v2

    add-int v2, v20, v15

    iput v2, v7, Ll/֫ۖ;->mTotalLength:I

    move/from16 v27, v4

    goto :goto_1c

    :cond_2b
    move/from16 v23, v2

    .line 1238
    iget v2, v7, Ll/֫ۖ;->mTotalLength:I

    .line 1239
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    move-result v15

    add-int/2addr v15, v2

    move/from16 v27, v4

    iget v4, v6, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v15, v4

    iget v4, v6, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v15, v4

    .line 1240
    invoke-virtual {v7, v11}, Ll/֫ۖ;->getNextLocationOffset(Landroid/view/View;)I

    move-result v4

    add-int/2addr v15, v4

    .line 1239
    invoke-static {v2, v15}, Ljava/lang/Math;->max(II)I

    move-result v2

    iput v2, v7, Ll/֫ۖ;->mTotalLength:I

    :goto_1c
    const/high16 v2, 0x40000000    # 2.0f

    if-eq v12, v2, :cond_2c

    .line 1243
    iget v2, v6, Landroid/widget/LinearLayout$LayoutParams;->height:I

    const/4 v4, -0x1

    if-ne v2, v4, :cond_2c

    const/4 v2, 0x1

    goto :goto_1d

    :cond_2c
    const/4 v2, 0x0

    .line 1246
    :goto_1d
    iget v4, v6, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    iget v15, v6, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v4, v15

    .line 1247
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    move-result v15

    add-int/2addr v15, v4

    .line 1248
    invoke-static {v3, v15}, Ljava/lang/Math;->max(II)I

    move-result v3

    if-eqz v2, :cond_2d

    goto :goto_1e

    :cond_2d
    move v4, v15

    .line 1249
    :goto_1e
    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-eqz v24, :cond_2e

    .line 1252
    iget v2, v6, Landroid/widget/LinearLayout$LayoutParams;->height:I

    const/4 v4, -0x1

    if-ne v2, v4, :cond_2f

    const/4 v2, 0x1

    goto :goto_1f

    :cond_2e
    const/4 v4, -0x1

    :cond_2f
    const/4 v2, 0x0

    :goto_1f
    if-eqz v28, :cond_31

    .line 1255
    invoke-virtual {v11}, Landroid/view/View;->getBaseline()I

    move-result v11

    if-eq v11, v4, :cond_31

    .line 1258
    iget v4, v6, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    if-gez v4, :cond_30

    iget v4, v7, Ll/֫ۖ;->mGravity:I

    :cond_30
    and-int/lit8 v4, v4, 0x70

    shr-int/lit8 v4, v4, 0x4

    and-int/lit8 v4, v4, -0x2

    shr-int/lit8 v4, v4, 0x1

    .line 1263
    aget v6, v13, v4

    invoke-static {v6, v11}, Ljava/lang/Math;->max(II)I

    move-result v6

    aput v6, v13, v4

    .line 1264
    aget v6, v14, v4

    sub-int/2addr v15, v11

    invoke-static {v6, v15}, Ljava/lang/Math;->max(II)I

    move-result v6

    aput v6, v14, v4

    :cond_31
    move/from16 v24, v2

    move/from16 v2, v23

    goto :goto_21

    :cond_32
    :goto_20
    move/from16 v27, v4

    move/from16 v22, v10

    move v10, v5

    move/from16 v5, p2

    :goto_21
    add-int/lit8 v9, v9, 0x1

    move/from16 v6, p1

    move v5, v10

    move/from16 v10, v22

    move/from16 v4, v27

    goto/16 :goto_16

    :cond_33
    move/from16 v5, p2

    move/from16 v22, v10

    const/high16 v2, -0x1000000

    .line 1271
    iget v4, v7, Ll/֫ۖ;->mTotalLength:I

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v6

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v9

    add-int/2addr v9, v6

    add-int/2addr v9, v4

    iput v9, v7, Ll/֫ۖ;->mTotalLength:I

    .line 1276
    aget v4, v13, v16

    const/4 v6, -0x1

    if-ne v4, v6, :cond_34

    const/4 v9, 0x0

    aget v9, v13, v9

    if-ne v9, v6, :cond_34

    const/4 v9, 0x2

    aget v10, v13, v9

    if-ne v10, v6, :cond_34

    aget v9, v13, v21

    if-eq v9, v6, :cond_35

    .line 1280
    :cond_34
    aget v6, v13, v21

    const/4 v9, 0x0

    aget v10, v13, v9

    const/4 v11, 0x2

    aget v13, v13, v11

    .line 1282
    invoke-static {v4, v13}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 1281
    invoke-static {v10, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 1280
    invoke-static {v6, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 1283
    aget v6, v14, v21

    aget v9, v14, v9

    aget v10, v14, v16

    aget v11, v14, v11

    .line 1285
    invoke-static {v10, v11}, Ljava/lang/Math;->max(II)I

    move-result v10

    .line 1284
    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    move-result v9

    .line 1283
    invoke-static {v6, v9}, Ljava/lang/Math;->max(II)I

    move-result v6

    add-int/2addr v6, v4

    .line 1286
    invoke-static {v3, v6}, Ljava/lang/Math;->max(II)I

    move-result v3

    :cond_35
    :goto_22
    if-nez v24, :cond_36

    const/high16 v4, 0x40000000    # 2.0f

    if-eq v12, v4, :cond_36

    goto :goto_23

    :cond_36
    move v0, v3

    .line 1319
    :goto_23
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    add-int/2addr v4, v3

    add-int/2addr v4, v0

    .line 1322
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    move-result v0

    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    and-int/2addr v2, v8

    or-int/2addr v1, v2

    shl-int/lit8 v2, v8, 0x10

    .line 1325
    invoke-static {v0, v5, v2}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v0

    .line 1324
    invoke-virtual {v7, v1, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    if-eqz v25, :cond_37

    move/from16 v0, p1

    move/from16 v1, v22

    .line 1329
    invoke-direct {v7, v1, v0}, Ll/֫ۖ;->֫(II)V

    :cond_37
    return-void
.end method

.method public measureNullChild(I)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public measureVertical(II)V
    .locals 29

    move-object/from16 v7, p0

    move/from16 v8, p1

    move/from16 v9, p2

    const/4 v0, 0x0

    .line 615
    iput v0, v7, Ll/֫ۖ;->mTotalLength:I

    .line 623
    invoke-virtual/range {p0 .. p0}, Ll/֫ۖ;->getVirtualChildCount()I

    move-result v10

    .line 625
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v11

    .line 626
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v12

    .line 631
    iget v13, v7, Ll/֫ۖ;->mBaselineAlignedChildIndex:I

    .line 632
    iget-boolean v14, v7, Ll/֫ۖ;->mUseLargestChild:Z

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x1

    const/16 v17, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x1

    const/16 v18, 0x0

    :goto_0
    const/16 v19, 0x0

    if-ge v15, v10, :cond_10

    move/from16 v21, v4

    .line 638
    invoke-virtual {v7, v15}, Ll/֫ۖ;->getVirtualChildAt(I)Landroid/view/View;

    move-result-object v4

    if-nez v4, :cond_0

    .line 641
    iget v1, v7, Ll/֫ۖ;->mTotalLength:I

    invoke-virtual {v7, v15}, Ll/֫ۖ;->measureNullChild(I)I

    move-result v4

    add-int/2addr v1, v4

    iput v1, v7, Ll/֫ۖ;->mTotalLength:I

    move/from16 v23, v2

    goto :goto_1

    .line 645
    :cond_0
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v1

    move/from16 v23, v2

    const/16 v2, 0x8

    if-ne v1, v2, :cond_1

    .line 646
    invoke-virtual {v7, v4, v15}, Ll/֫ۖ;->getChildrenSkipCount(Landroid/view/View;I)I

    move-result v1

    add-int/2addr v15, v1

    :goto_1
    move/from16 v22, v12

    move/from16 v4, v21

    move/from16 v2, v23

    move/from16 v23, v10

    goto/16 :goto_b

    .line 650
    :cond_1
    invoke-virtual {v7, v15}, Ll/֫ۖ;->hasDividerBeforeChildAt(I)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 651
    iget v1, v7, Ll/֫ۖ;->mTotalLength:I

    iget v2, v7, Ll/֫ۖ;->mDividerHeight:I

    add-int/2addr v1, v2

    iput v1, v7, Ll/֫ۖ;->mTotalLength:I

    .line 654
    :cond_2
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ll/۟ܺ;

    .line 656
    iget v1, v2, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    add-float v20, v0, v1

    const/high16 v0, 0x40000000    # 2.0f

    if-ne v12, v0, :cond_3

    .line 658
    iget v0, v2, Landroid/widget/LinearLayout$LayoutParams;->height:I

    if-nez v0, :cond_3

    cmpl-float v0, v1, v19

    if-lez v0, :cond_3

    .line 662
    iget v0, v7, Ll/֫ۖ;->mTotalLength:I

    .line 663
    iget v1, v2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int/2addr v1, v0

    move/from16 v22, v3

    iget v3, v2, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v1, v3

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, v7, Ll/֫ۖ;->mTotalLength:I

    const/16 v16, 0x1

    move-object v1, v2

    move/from16 v8, v22

    move/from16 v26, v23

    move/from16 v23, v10

    move/from16 v22, v12

    move/from16 v12, v21

    move v10, v6

    goto/16 :goto_4

    :cond_3
    move/from16 v22, v3

    .line 668
    iget v0, v2, Landroid/widget/LinearLayout$LayoutParams;->height:I

    if-nez v0, :cond_4

    cmpl-float v0, v1, v19

    if-lez v0, :cond_4

    const/4 v0, -0x2

    .line 674
    iput v0, v2, Landroid/widget/LinearLayout$LayoutParams;->height:I

    const/4 v0, 0x0

    const/4 v3, 0x0

    goto :goto_2

    :cond_4
    const/high16 v0, -0x80000000

    const/high16 v3, -0x80000000

    :goto_2
    cmpl-float v0, v20, v19

    if-nez v0, :cond_5

    .line 683
    iget v0, v7, Ll/֫ۖ;->mTotalLength:I

    move/from16 v24, v0

    goto :goto_3

    :cond_5
    const/4 v0, 0x0

    const/16 v24, 0x0

    :goto_3
    const/16 v25, 0x0

    move-object/from16 v0, p0

    move-object v1, v4

    move-object/from16 v27, v2

    move/from16 v26, v23

    move v2, v15

    move v9, v3

    move/from16 v8, v22

    move/from16 v3, p1

    move/from16 v22, v12

    move/from16 v12, v21

    move-object/from16 v21, v4

    move/from16 v4, v25

    move/from16 v28, v5

    move/from16 v5, p2

    move/from16 v23, v10

    move v10, v6

    move/from16 v6, v24

    .line 681
    invoke-virtual/range {v0 .. v6}, Ll/֫ۖ;->measureChildBeforeLayout(Landroid/view/View;IIIII)V

    const/high16 v0, -0x80000000

    move-object/from16 v1, v27

    if-eq v9, v0, :cond_6

    .line 686
    iput v9, v1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 689
    :cond_6
    invoke-virtual/range {v21 .. v21}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    .line 690
    iget v2, v7, Ll/֫ۖ;->mTotalLength:I

    add-int v3, v2, v0

    .line 691
    iget v4, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int/2addr v3, v4

    iget v4, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v3, v4

    move-object/from16 v4, v21

    .line 692
    invoke-virtual {v7, v4}, Ll/֫ۖ;->getNextLocationOffset(Landroid/view/View;)I

    move-result v5

    add-int/2addr v3, v5

    .line 691
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    iput v2, v7, Ll/֫ۖ;->mTotalLength:I

    if-eqz v14, :cond_7

    move/from16 v3, v28

    .line 695
    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v5

    goto :goto_4

    :cond_7
    move/from16 v3, v28

    move v5, v3

    :goto_4
    if-ltz v13, :cond_8

    add-int/lit8 v0, v15, 0x1

    if-ne v13, v0, :cond_8

    .line 704
    iget v0, v7, Ll/֫ۖ;->mTotalLength:I

    iput v0, v7, Ll/֫ۖ;->mBaselineChildTop:I

    :cond_8
    if-ge v15, v13, :cond_a

    .line 710
    iget v0, v1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    cmpl-float v0, v0, v19

    if-gtz v0, :cond_9

    goto :goto_5

    .line 711
    :cond_9
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won\'t work.  Either remove the weight, or don\'t set mBaselineAlignedChildIndex."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    :goto_5
    const/high16 v0, 0x40000000    # 2.0f

    if-eq v11, v0, :cond_b

    .line 718
    iget v0, v1, Landroid/widget/LinearLayout$LayoutParams;->width:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_b

    const/4 v0, 0x1

    const/16 v18, 0x1

    goto :goto_6

    :cond_b
    const/4 v0, 0x0

    .line 727
    :goto_6
    iget v2, v1, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    iget v3, v1, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v2, v3

    .line 728
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    add-int/2addr v3, v2

    .line 729
    invoke-static {v12, v3}, Ljava/lang/Math;->max(II)I

    move-result v6

    .line 731
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredState()I

    move-result v9

    .line 730
    invoke-static {v8, v9}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v8

    if-eqz v17, :cond_c

    .line 733
    iget v9, v1, Landroid/widget/LinearLayout$LayoutParams;->width:I

    const/4 v12, -0x1

    if-ne v9, v12, :cond_c

    const/4 v9, 0x1

    goto :goto_7

    :cond_c
    const/4 v9, 0x0

    .line 734
    :goto_7
    iget v1, v1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    cmpl-float v1, v1, v19

    if-lez v1, :cond_e

    if-eqz v0, :cond_d

    goto :goto_8

    :cond_d
    move v2, v3

    .line 739
    :goto_8
    invoke-static {v10, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    move/from16 v2, v26

    goto :goto_a

    :cond_e
    if-eqz v0, :cond_f

    goto :goto_9

    :cond_f
    move v2, v3

    :goto_9
    move/from16 v1, v26

    .line 742
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    move v0, v10

    .line 746
    :goto_a
    invoke-virtual {v7, v4, v15}, Ll/֫ۖ;->getChildrenSkipCount(Landroid/view/View;I)I

    move-result v1

    add-int/2addr v15, v1

    move v4, v6

    move v3, v8

    move/from16 v17, v9

    move v6, v0

    move/from16 v0, v20

    :goto_b
    add-int/lit8 v15, v15, 0x1

    move/from16 v8, p1

    move/from16 v9, p2

    move/from16 v12, v22

    move/from16 v10, v23

    goto/16 :goto_0

    :cond_10
    move v1, v2

    move v8, v3

    move v3, v5

    move/from16 v23, v10

    move/from16 v22, v12

    const/16 v2, 0x8

    move v12, v4

    move v10, v6

    .line 749
    iget v4, v7, Ll/֫ۖ;->mTotalLength:I

    if-lez v4, :cond_11

    move/from16 v4, v23

    invoke-virtual {v7, v4}, Ll/֫ۖ;->hasDividerBeforeChildAt(I)Z

    move-result v5

    if-eqz v5, :cond_12

    .line 750
    iget v5, v7, Ll/֫ۖ;->mTotalLength:I

    iget v6, v7, Ll/֫ۖ;->mDividerHeight:I

    add-int/2addr v5, v6

    iput v5, v7, Ll/֫ۖ;->mTotalLength:I

    goto :goto_c

    :cond_11
    move/from16 v4, v23

    :cond_12
    :goto_c
    if-eqz v14, :cond_16

    const/high16 v5, -0x80000000

    move/from16 v6, v22

    if-eq v6, v5, :cond_13

    if-nez v6, :cond_17

    :cond_13
    const/4 v5, 0x0

    .line 755
    iput v5, v7, Ll/֫ۖ;->mTotalLength:I

    :goto_d
    if-ge v5, v4, :cond_17

    .line 758
    invoke-virtual {v7, v5}, Ll/֫ۖ;->getVirtualChildAt(I)Landroid/view/View;

    move-result-object v9

    if-nez v9, :cond_14

    .line 761
    iget v2, v7, Ll/֫ۖ;->mTotalLength:I

    invoke-virtual {v7, v5}, Ll/֫ۖ;->measureNullChild(I)I

    move-result v9

    add-int/2addr v2, v9

    iput v2, v7, Ll/֫ۖ;->mTotalLength:I

    move/from16 v20, v5

    goto :goto_e

    .line 765
    :cond_14
    invoke-virtual {v9}, Landroid/view/View;->getVisibility()I

    move-result v13

    if-ne v13, v2, :cond_15

    .line 766
    invoke-virtual {v7, v9, v5}, Ll/֫ۖ;->getChildrenSkipCount(Landroid/view/View;I)I

    move-result v2

    add-int/2addr v5, v2

    goto :goto_f

    .line 771
    :cond_15
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Ll/۟ܺ;

    .line 773
    iget v13, v7, Ll/֫ۖ;->mTotalLength:I

    add-int v15, v13, v3

    move/from16 v20, v5

    .line 774
    iget v5, v2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int/2addr v15, v5

    iget v2, v2, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v15, v2

    .line 775
    invoke-virtual {v7, v9}, Ll/֫ۖ;->getNextLocationOffset(Landroid/view/View;)I

    move-result v2

    add-int/2addr v15, v2

    .line 774
    invoke-static {v13, v15}, Ljava/lang/Math;->max(II)I

    move-result v2

    iput v2, v7, Ll/֫ۖ;->mTotalLength:I

    :goto_e
    move/from16 v5, v20

    :goto_f
    add-int/lit8 v5, v5, 0x1

    const/16 v2, 0x8

    goto :goto_d

    :cond_16
    move/from16 v6, v22

    .line 780
    :cond_17
    iget v2, v7, Ll/֫ۖ;->mTotalLength:I

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v9

    add-int/2addr v9, v5

    add-int/2addr v9, v2

    iput v9, v7, Ll/֫ۖ;->mTotalLength:I

    .line 785
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    move-result v2

    invoke-static {v9, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    const/4 v5, 0x0

    move/from16 v9, p2

    .line 788
    invoke-static {v2, v9, v5}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v2

    const v5, 0xffffff

    and-int/2addr v5, v2

    .line 794
    iget v13, v7, Ll/֫ۖ;->mTotalLength:I

    sub-int/2addr v5, v13

    if-nez v16, :cond_1c

    if-eqz v5, :cond_18

    cmpl-float v13, v0, v19

    if-lez v13, :cond_18

    goto :goto_13

    .line 867
    :cond_18
    invoke-static {v1, v10}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-eqz v14, :cond_1b

    const/high16 v1, 0x40000000    # 2.0f

    if-eq v6, v1, :cond_1b

    const/4 v1, 0x0

    :goto_10
    if-ge v1, v4, :cond_1b

    .line 875
    invoke-virtual {v7, v1}, Ll/֫ۖ;->getVirtualChildAt(I)Landroid/view/View;

    move-result-object v5

    if-eqz v5, :cond_1a

    .line 877
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v6

    const/16 v10, 0x8

    if-ne v6, v10, :cond_19

    goto :goto_11

    .line 882
    :cond_19
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Ll/۟ܺ;

    .line 884
    iget v6, v6, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    cmpl-float v6, v6, v19

    if-lez v6, :cond_1a

    .line 887
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v6

    const/high16 v10, 0x40000000    # 2.0f

    invoke-static {v6, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    .line 889
    invoke-static {v3, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v10

    .line 886
    invoke-virtual {v5, v6, v10}, Landroid/view/View;->measure(II)V

    :cond_1a
    :goto_11
    add-int/lit8 v1, v1, 0x1

    goto :goto_10

    :cond_1b
    move/from16 v5, p1

    :goto_12
    move v3, v8

    goto/16 :goto_1d

    .line 796
    :cond_1c
    :goto_13
    iget v3, v7, Ll/֫ۖ;->mWeightSum:F

    cmpl-float v10, v3, v19

    if-lez v10, :cond_1d

    move v0, v3

    :cond_1d
    const/4 v3, 0x0

    .line 798
    iput v3, v7, Ll/֫ۖ;->mTotalLength:I

    const/4 v3, 0x0

    :goto_14
    if-ge v3, v4, :cond_27

    .line 801
    invoke-virtual {v7, v3}, Ll/֫ۖ;->getVirtualChildAt(I)Landroid/view/View;

    move-result-object v10

    .line 803
    invoke-virtual {v10}, Landroid/view/View;->getVisibility()I

    move-result v13

    const/16 v14, 0x8

    if-ne v13, v14, :cond_1e

    move v14, v5

    move/from16 v22, v6

    move/from16 v5, p1

    goto/16 :goto_1c

    .line 807
    :cond_1e
    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v13

    check-cast v13, Ll/۟ܺ;

    .line 809
    iget v14, v13, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    cmpl-float v15, v14, v19

    if-lez v15, :cond_23

    int-to-float v15, v5

    mul-float v15, v15, v14

    div-float/2addr v15, v0

    float-to-int v15, v15

    sub-float/2addr v0, v14

    sub-int/2addr v5, v15

    .line 817
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v14

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v16

    add-int v16, v16, v14

    iget v14, v13, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int v16, v16, v14

    iget v14, v13, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int v14, v16, v14

    move/from16 v16, v0

    iget v0, v13, Landroid/widget/LinearLayout$LayoutParams;->width:I

    move/from16 v20, v5

    move/from16 v5, p1

    .line 816
    invoke-static {v5, v14, v0}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v0

    .line 822
    iget v14, v13, Landroid/widget/LinearLayout$LayoutParams;->height:I

    if-nez v14, :cond_21

    const/high16 v14, 0x40000000    # 2.0f

    if-eq v6, v14, :cond_1f

    goto :goto_16

    :cond_1f
    if-lez v15, :cond_20

    goto :goto_15

    :cond_20
    const/4 v15, 0x0

    .line 836
    :goto_15
    invoke-static {v15, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v14

    .line 835
    invoke-virtual {v10, v0, v14}, Landroid/view/View;->measure(II)V

    goto :goto_18

    :cond_21
    const/high16 v14, 0x40000000    # 2.0f

    .line 825
    :goto_16
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    move-result v21

    add-int v21, v21, v15

    if-gez v21, :cond_22

    const/16 v21, 0x0

    const/4 v15, 0x0

    goto :goto_17

    :cond_22
    move/from16 v15, v21

    .line 831
    :goto_17
    invoke-static {v15, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v14

    .line 830
    invoke-virtual {v10, v0, v14}, Landroid/view/View;->measure(II)V

    .line 842
    :goto_18
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredState()I

    move-result v0

    and-int/lit16 v0, v0, -0x100

    .line 841
    invoke-static {v8, v0}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v8

    move/from16 v0, v16

    move/from16 v14, v20

    goto :goto_19

    :cond_23
    move v14, v5

    move/from16 v5, p1

    .line 846
    :goto_19
    iget v15, v13, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    move/from16 v16, v0

    iget v0, v13, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v15, v0

    .line 847
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    add-int/2addr v0, v15

    .line 848
    invoke-static {v12, v0}, Ljava/lang/Math;->max(II)I

    move-result v12

    move/from16 v20, v0

    const/high16 v0, 0x40000000    # 2.0f

    if-eq v11, v0, :cond_24

    .line 850
    iget v0, v13, Landroid/widget/LinearLayout$LayoutParams;->width:I

    move/from16 v22, v6

    const/4 v6, -0x1

    if-ne v0, v6, :cond_25

    goto :goto_1a

    :cond_24
    move/from16 v22, v6

    const/4 v6, -0x1

    :cond_25
    move/from16 v15, v20

    .line 853
    :goto_1a
    invoke-static {v1, v15}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-eqz v17, :cond_26

    .line 856
    iget v1, v13, Landroid/widget/LinearLayout$LayoutParams;->width:I

    if-ne v1, v6, :cond_26

    const/4 v1, 0x1

    goto :goto_1b

    :cond_26
    const/4 v1, 0x0

    .line 858
    :goto_1b
    iget v6, v7, Ll/֫ۖ;->mTotalLength:I

    .line 859
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    move-result v15

    add-int/2addr v15, v6

    move/from16 v20, v0

    iget v0, v13, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int/2addr v15, v0

    iget v0, v13, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v15, v0

    .line 860
    invoke-virtual {v7, v10}, Ll/֫ۖ;->getNextLocationOffset(Landroid/view/View;)I

    move-result v0

    add-int/2addr v15, v0

    .line 859
    invoke-static {v6, v15}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, v7, Ll/֫ۖ;->mTotalLength:I

    move/from16 v17, v1

    move/from16 v0, v16

    move/from16 v1, v20

    :goto_1c
    add-int/lit8 v3, v3, 0x1

    move v5, v14

    move/from16 v6, v22

    goto/16 :goto_14

    :cond_27
    move/from16 v5, p1

    .line 864
    iget v0, v7, Ll/֫ۖ;->mTotalLength:I

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v6

    add-int/2addr v6, v3

    add-int/2addr v6, v0

    iput v6, v7, Ll/֫ۖ;->mTotalLength:I

    move v0, v1

    goto/16 :goto_12

    :goto_1d
    if-nez v17, :cond_28

    const/high16 v1, 0x40000000    # 2.0f

    if-eq v11, v1, :cond_28

    goto :goto_1e

    :cond_28
    move v0, v12

    .line 900
    :goto_1e
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v6

    add-int/2addr v6, v1

    add-int/2addr v6, v0

    .line 903
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    move-result v0

    invoke-static {v6, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 905
    invoke-static {v0, v5, v3}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v0

    invoke-virtual {v7, v0, v2}, Landroid/view/View;->setMeasuredDimension(II)V

    if-eqz v18, :cond_29

    .line 909
    invoke-direct {v7, v4, v9}, Ll/֫ۖ;->ۧ(II)V

    :cond_29
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 300
    iget-object v0, p0, Ll/֫ۖ;->mDivider:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    return-void

    .line 304
    :cond_0
    iget v0, p0, Ll/֫ۖ;->mOrientation:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 305
    invoke-virtual {p0, p1}, Ll/֫ۖ;->drawDividersVertical(Landroid/graphics/Canvas;)V

    return-void

    .line 307
    :cond_1
    invoke-virtual {p0, p1}, Ll/֫ۖ;->drawDividersHorizontal(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1788
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    const-string v0, "androidx.appcompat.widget.LinearLayoutCompat"

    .line 1789
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 1

    .line 1794
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    const-string v0, "androidx.appcompat.widget.LinearLayoutCompat"

    .line 1795
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 1

    .line 1426
    iget p1, p0, Ll/֫ۖ;->mOrientation:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 1427
    invoke-virtual {p0, p2, p3, p4, p5}, Ll/֫ۖ;->layoutVertical(IIII)V

    return-void

    .line 1429
    :cond_0
    invoke-virtual {p0, p2, p3, p4, p5}, Ll/֫ۖ;->layoutHorizontal(IIII)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 2

    .line 571
    iget v0, p0, Ll/֫ۖ;->mOrientation:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 572
    invoke-virtual {p0, p1, p2}, Ll/֫ۖ;->measureVertical(II)V

    return-void

    .line 574
    :cond_0
    invoke-virtual {p0, p1, p2}, Ll/֫ۖ;->measureHorizontal(II)V

    return-void
.end method

.method public setBaselineAligned(Z)V
    .locals 0

    .line 410
    iput-boolean p1, p0, Ll/֫ۖ;->mBaselineAligned:Z

    return-void
.end method

.method public setBaselineAlignedChildIndex(I)V
    .locals 2

    if-ltz p1, :cond_0

    .line 508
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 512
    iput p1, p0, Ll/֫ۖ;->mBaselineAlignedChildIndex:I

    return-void

    .line 509
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "base aligned child index out of range (0, "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 510
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setDividerDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 249
    iget-object v0, p0, Ll/֫ۖ;->mDivider:Landroid/graphics/drawable/Drawable;

    if-ne p1, v0, :cond_0

    return-void

    .line 252
    :cond_0
    iput-object p1, p0, Ll/֫ۖ;->mDivider:Landroid/graphics/drawable/Drawable;

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 254
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    iput v1, p0, Ll/֫ۖ;->mDividerWidth:I

    .line 255
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    iput v1, p0, Ll/֫ۖ;->mDividerHeight:I

    goto :goto_0

    .line 257
    :cond_1
    iput v0, p0, Ll/֫ۖ;->mDividerWidth:I

    .line 258
    iput v0, p0, Ll/֫ۖ;->mDividerHeight:I

    :goto_0
    if-nez p1, :cond_2

    const/4 v0, 0x1

    .line 260
    :cond_2
    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 261
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setDividerPadding(I)V
    .locals 0

    .line 274
    iput p1, p0, Ll/֫ۖ;->mDividerPadding:I

    return-void
.end method

.method public setGravity(I)V
    .locals 1

    .line 1703
    iget v0, p0, Ll/֫ۖ;->mGravity:I

    if-eq v0, p1, :cond_2

    const v0, 0x800007

    and-int/2addr v0, p1

    if-nez v0, :cond_0

    const v0, 0x800003

    or-int/2addr p1, v0

    :cond_0
    and-int/lit8 v0, p1, 0x70

    if-nez v0, :cond_1

    or-int/lit8 p1, p1, 0x30

    .line 1712
    :cond_1
    iput p1, p0, Ll/֫ۖ;->mGravity:I

    .line 1713
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_2
    return-void
.end method

.method public setHorizontalGravity(I)V
    .locals 2

    const v0, 0x800007

    and-int/2addr p1, v0

    .line 1731
    iget v1, p0, Ll/֫ۖ;->mGravity:I

    and-int/2addr v0, v1

    if-eq v0, p1, :cond_0

    const v0, -0x800008

    and-int/2addr v0, v1

    or-int/2addr p1, v0

    .line 1732
    iput p1, p0, Ll/֫ۖ;->mGravity:I

    .line 1733
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method

.method public setMeasureWithLargestChildEnabled(Z)V
    .locals 0

    .line 437
    iput-boolean p1, p0, Ll/֫ۖ;->mUseLargestChild:Z

    return-void
.end method

.method public setOrientation(I)V
    .locals 1

    .line 1674
    iget v0, p0, Ll/֫ۖ;->mOrientation:I

    if-eq v0, p1, :cond_0

    .line 1675
    iput p1, p0, Ll/֫ۖ;->mOrientation:I

    .line 1676
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method

.method public setShowDividers(I)V
    .locals 1

    .line 205
    iget v0, p0, Ll/֫ۖ;->mShowDividers:I

    if-eq p1, v0, :cond_0

    .line 206
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 208
    :cond_0
    iput p1, p0, Ll/֫ۖ;->mShowDividers:I

    return-void
.end method

.method public setVerticalGravity(I)V
    .locals 2

    and-int/lit8 p1, p1, 0x70

    .line 1739
    iget v0, p0, Ll/֫ۖ;->mGravity:I

    and-int/lit8 v1, v0, 0x70

    if-eq v1, p1, :cond_0

    and-int/lit8 v0, v0, -0x71

    or-int/2addr p1, v0

    .line 1740
    iput p1, p0, Ll/֫ۖ;->mGravity:I

    .line 1741
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method

.method public setWeightSum(F)V
    .locals 1

    const/4 v0, 0x0

    .line 566
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iput p1, p0, Ll/֫ۖ;->mWeightSum:F

    return-void
.end method

.method public shouldDelayChildPressedState()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
