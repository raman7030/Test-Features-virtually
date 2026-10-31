.class public final Ll/ۖ۟ۧ;
.super Landroid/view/ViewGroup;
.source "F1OQ"


# instance fields
.field public final ֫֫:Landroid/graphics/Rect;

.field public ۗ:Ll/ۗܰۧ;

.field public ۙ:Ll/ۙܰۧ;

.field public ۛ:Ll/ᩴۗۧ;

.field public ۟:Ll/ۤܰۧ;

.field public ۤ:Ll/ۙܰۧ;

.field public final ۧ֫:Landroid/graphics/Rect;

.field public ۨ:Landroid/os/Parcelable;

.field public ۫:I

.field public ۬:Ll/ۜۗۧ;

.field public ܰ:Ll/۬۬ۧ;

.field public ܽ֫:Z

.field public ᩶:Z

.field public ᩸:Ll/᩻۟ۧ;

.field public ᩹:I

.field public ᩺:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 168
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 130
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/ۖ۟ۧ;->ۧ֫:Landroid/graphics/Rect;

    .line 131
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/ۖ۟ۧ;->֫֫:Landroid/graphics/Rect;

    .line 133
    new-instance v0, Ll/ۙܰۧ;

    invoke-direct {v0}, Ll/ۙܰۧ;-><init>()V

    iput-object v0, p0, Ll/ۖ۟ۧ;->ۙ:Ll/ۙܰۧ;

    const/4 v0, 0x0

    .line 137
    iput-boolean v0, p0, Ll/ۖ۟ۧ;->᩶:Z

    .line 138
    new-instance v0, Ll/ۛܰۧ;

    invoke-direct {v0, p0}, Ll/ۛܰۧ;-><init>(Ll/ۖ۟ۧ;)V

    const/4 v0, -0x1

    .line 148
    iput v0, p0, Ll/ۖ۟ۧ;->᩺:I

    const/4 v1, 0x1

    .line 158
    iput-boolean v1, p0, Ll/ۖ۟ۧ;->ܽ֫:Z

    .line 159
    iput v0, p0, Ll/ۖ۟ۧ;->۫:I

    .line 169
    invoke-direct {p0, p1, p2}, Ll/ۖ۟ۧ;->֫(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 173
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 130
    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    iput-object p3, p0, Ll/ۖ۟ۧ;->ۧ֫:Landroid/graphics/Rect;

    .line 131
    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    iput-object p3, p0, Ll/ۖ۟ۧ;->֫֫:Landroid/graphics/Rect;

    .line 133
    new-instance p3, Ll/ۙܰۧ;

    invoke-direct {p3}, Ll/ۙܰۧ;-><init>()V

    iput-object p3, p0, Ll/ۖ۟ۧ;->ۙ:Ll/ۙܰۧ;

    const/4 p3, 0x0

    .line 137
    iput-boolean p3, p0, Ll/ۖ۟ۧ;->᩶:Z

    .line 138
    new-instance p3, Ll/ۛܰۧ;

    invoke-direct {p3, p0}, Ll/ۛܰۧ;-><init>(Ll/ۖ۟ۧ;)V

    const/4 p3, -0x1

    .line 148
    iput p3, p0, Ll/ۖ۟ۧ;->᩺:I

    const/4 v0, 0x1

    .line 158
    iput-boolean v0, p0, Ll/ۖ۟ۧ;->ܽ֫:Z

    .line 159
    iput p3, p0, Ll/ۖ۟ۧ;->۫:I

    .line 174
    invoke-direct {p0, p1, p2}, Ll/ۖ۟ۧ;->֫(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private ֫(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 8

    .line 187
    new-instance v0, Ll/᩻۟ۧ;

    invoke-direct {v0, p0}, Ll/᩻۟ۧ;-><init>(Ll/ۖ۟ۧ;)V

    .line 188
    iput-object v0, p0, Ll/ۖ۟ۧ;->᩸:Ll/᩻۟ۧ;

    .line 190
    new-instance v0, Ll/᩷۟ۧ;

    invoke-direct {v0, p0, p1}, Ll/᩷۟ۧ;-><init>(Ll/ۖ۟ۧ;Landroid/content/Context;)V

    iput-object v0, p0, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    .line 191
    sget v1, Ll/ܿ᩺;->֫:I

    .line 4479
    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result v1

    .line 191
    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 192
    iget-object v0, p0, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    const/high16 v1, 0x20000

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 194
    new-instance v0, Ll/ۧ۟ۧ;

    invoke-direct {v0, p0, p1}, Ll/ۧ۟ۧ;-><init>(Ll/ۖ۟ۧ;Landroid/content/Context;)V

    iput-object v0, p0, Ll/ۖ۟ۧ;->۬:Ll/ۜۗۧ;

    .line 195
    iget-object v1, p0, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    invoke-virtual {v1, v0}, Ll/۬۬ۧ;->setLayoutManager(Ll/ܿ۬ۧ;)V

    .line 196
    iget-object v0, p0, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ll/۬۬ۧ;->setScrollingTouchSlop(I)V

    .line 299
    sget-object v4, Ll/ۚܰۧ;->֫:[I

    invoke-virtual {p1, p2, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    const/4 v7, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v5, p2

    move-object v6, v0

    .line 300
    invoke-static/range {v2 .. v7}, Ll/ܿ᩺;->֫(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    const/4 p1, 0x0

    .line 304
    :try_start_0
    invoke-virtual {v0, p1, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    .line 576
    iget-object v2, p0, Ll/ۖ۟ۧ;->۬:Ll/ۜۗۧ;

    invoke-virtual {v2, p2}, Ll/ۜۗۧ;->setOrientation(I)V

    .line 577
    iget-object p2, p0, Ll/ۖ۟ۧ;->᩸:Ll/᩻۟ۧ;

    .line 1427
    invoke-virtual {p2}, Ll/᩻۟ۧ;->֫()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 306
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 199
    iget-object p2, p0, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v0, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 201
    iget-object p2, p0, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    .line 270
    new-instance v0, Ll/ܰܰۧ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 201
    invoke-virtual {p2, v0}, Ll/۬۬ۧ;->addOnChildAttachStateChangeListener(Ll/᩻۬ۧ;)V

    .line 205
    new-instance p2, Ll/ۤܰۧ;

    invoke-direct {p2, p0}, Ll/ۤܰۧ;-><init>(Ll/ۖ۟ۧ;)V

    iput-object p2, p0, Ll/ۖ۟ۧ;->۟:Ll/ۤܰۧ;

    .line 207
    new-instance p2, Ll/ۗܰۧ;

    .line 44
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 207
    iput-object p2, p0, Ll/ۖ۟ۧ;->ۗ:Ll/ۗܰۧ;

    .line 208
    new-instance p2, Ll/ۜ۟ۧ;

    invoke-direct {p2, p0}, Ll/ۜ۟ۧ;-><init>(Ll/ۖ۟ۧ;)V

    iput-object p2, p0, Ll/ۖ۟ۧ;->ۛ:Ll/ᩴۗۧ;

    .line 209
    iget-object v0, p0, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    invoke-virtual {p2, v0}, Ll/۟۬ۧ;->attachToRecyclerView(Ll/۬۬ۧ;)V

    .line 212
    iget-object p2, p0, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    iget-object v0, p0, Ll/ۖ۟ۧ;->۟:Ll/ۤܰۧ;

    invoke-virtual {p2, v0}, Ll/۬۬ۧ;->addOnScrollListener(Ll/ۢ۬ۧ;)V

    .line 214
    new-instance p2, Ll/ۙܰۧ;

    invoke-direct {p2}, Ll/ۙܰۧ;-><init>()V

    iput-object p2, p0, Ll/ۖ۟ۧ;->ۤ:Ll/ۙܰۧ;

    .line 215
    iget-object v0, p0, Ll/ۖ۟ۧ;->۟:Ll/ۤܰۧ;

    invoke-virtual {v0, p2}, Ll/ۤܰۧ;->֫(Ll/ܽ۟ۧ;)V

    .line 219
    new-instance p2, Ll/ۨܰۧ;

    invoke-direct {p2, p0}, Ll/ۨܰۧ;-><init>(Ll/ۖ۟ۧ;)V

    .line 237
    new-instance v0, Ll/᩺ܰۧ;

    invoke-direct {v0, p0}, Ll/᩺ܰۧ;-><init>(Ll/ۖ۟ۧ;)V

    .line 249
    iget-object v2, p0, Ll/ۖ۟ۧ;->ۤ:Ll/ۙܰۧ;

    invoke-virtual {v2, p2}, Ll/ۙܰۧ;->֫(Ll/ܽ۟ۧ;)V

    .line 250
    iget-object p2, p0, Ll/ۖ۟ۧ;->ۤ:Ll/ۙܰۧ;

    invoke-virtual {p2, v0}, Ll/ۙܰۧ;->֫(Ll/ܽ۟ۧ;)V

    .line 253
    iget-object p2, p0, Ll/ۖ۟ۧ;->᩸:Ll/᩻۟ۧ;

    iget-object v0, p0, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x2

    .line 1427
    invoke-virtual {v0, v2}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 1378
    new-instance v0, Ll/ܳ۟ۧ;

    invoke-direct {v0, p2}, Ll/ܳ۟ۧ;-><init>(Ll/᩻۟ۧ;)V

    .line 1385
    iget-object p2, p2, Ll/᩻۟ۧ;->ܽ:Ll/ۖ۟ۧ;

    .line 1400
    invoke-virtual {p2}, Landroid/view/View;->getImportantForAccessibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 1427
    invoke-virtual {p2, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 254
    :cond_0
    iget-object p2, p0, Ll/ۖ۟ۧ;->ۤ:Ll/ۙܰۧ;

    iget-object v0, p0, Ll/ۖ۟ۧ;->ۙ:Ll/ۙܰۧ;

    invoke-virtual {p2, v0}, Ll/ۙܰۧ;->֫(Ll/ܽ۟ۧ;)V

    .line 258
    new-instance p2, Ll/۬ܰۧ;

    .line 36
    invoke-direct {p2}, Ll/ܽ۟ۧ;-><init>()V

    .line 259
    iget-object v0, p0, Ll/ۖ۟ۧ;->ۤ:Ll/ۙܰۧ;

    invoke-virtual {v0, p2}, Ll/ۙܰۧ;->֫(Ll/ܽ۟ۧ;)V

    .line 261
    iget-object p2, p0, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {p0, p2, p1, v0}, Landroid/view/ViewGroup;->attachViewToParent(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void

    :catchall_0
    move-exception p1

    .line 306
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 307
    throw p1
.end method


# virtual methods
.method public final canScrollHorizontally(I)Z
    .locals 1

    .line 862
    iget-object v0, p0, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    invoke-virtual {v0, p1}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result p1

    return p1
.end method

.method public final canScrollVertically(I)Z
    .locals 1

    .line 867
    iget-object v0, p0, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    invoke-virtual {v0, p1}, Landroid/view/View;->canScrollVertically(I)Z

    move-result p1

    return p1
.end method

.method public final dispatchRestoreInstanceState(Landroid/util/SparseArray;)V
    .locals 3

    .line 370
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Parcelable;

    .line 371
    instance-of v1, v0, Ll/ۡ۟ۧ;

    if-eqz v1, :cond_0

    .line 372
    check-cast v0, Ll/ۡ۟ۧ;

    iget v0, v0, Ll/ۡ۟ۧ;->᩶:I

    .line 373
    iget-object v1, p0, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v1

    .line 374
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Parcelable;

    invoke-virtual {p1, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 375
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->remove(I)V

    .line 378
    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchRestoreInstanceState(Landroid/util/SparseArray;)V

    .line 346
    iget p1, p0, Ll/ۖ۟ۧ;->᩺:I

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    goto :goto_0

    .line 490
    :cond_1
    iget-object p1, p0, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    invoke-virtual {p1}, Ll/۬۬ۧ;->getAdapter()Ll/᩶ۗۧ;

    move-result-object p1

    if-nez p1, :cond_2

    :goto_0
    return-void

    .line 354
    :cond_2
    iget-object v1, p0, Ll/ۖ۟ۧ;->ۨ:Landroid/os/Parcelable;

    if-eqz v1, :cond_4

    .line 355
    instance-of v1, p1, Ll/᩸ܰۧ;

    if-eqz v1, :cond_3

    .line 356
    move-object v1, p1

    check-cast v1, Ll/᩸ܰۧ;

    invoke-interface {v1}, Ll/᩸ܰۧ;->ۧ()V

    :cond_3
    const/4 v1, 0x0

    .line 358
    iput-object v1, p0, Ll/ۖ۟ۧ;->ۨ:Landroid/os/Parcelable;

    .line 361
    :cond_4
    iget v1, p0, Ll/ۖ۟ۧ;->᩺:I

    invoke-virtual {p1}, Ll/᩶ۗۧ;->getItemCount()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    const/4 v1, 0x0

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Ll/ۖ۟ۧ;->᩹:I

    .line 362
    iput v0, p0, Ll/ۖ۟ۧ;->᩺:I

    .line 363
    iget-object v0, p0, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    invoke-virtual {v0, p1}, Ll/۬۬ۧ;->scrollToPosition(I)V

    .line 364
    iget-object p1, p0, Ll/ۖ۟ۧ;->᩸:Ll/᩻۟ۧ;

    .line 1407
    invoke-virtual {p1}, Ll/᩻۟ۧ;->֫()V

    return-void
.end method

.method public final getAccessibilityClassName()Ljava/lang/CharSequence;
    .locals 1

    .line 292
    iget-object v0, p0, Ll/ۖ۟ۧ;->᩸:Ll/᩻۟ۧ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    iget-object v0, p0, Ll/ۖ۟ۧ;->᩸:Ll/᩻۟ۧ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "androidx.viewpager.widget.ViewPager"

    return-object v0
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 5

    .line 956
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 957
    iget-object v0, p0, Ll/ۖ۟ۧ;->᩸:Ll/᩻۟ۧ;

    .line 1450
    invoke-static {p1}, Ll/ܳ۟;->֫(Landroid/view/accessibility/AccessibilityNodeInfo;)Ll/ܳ۟;

    move-result-object p1

    .line 1565
    iget-object v0, v0, Ll/᩻۟ۧ;->ܽ:Ll/ۖ۟ۧ;

    .line 490
    iget-object v1, v0, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    invoke-virtual {v1}, Ll/۬۬ۧ;->getAdapter()Ll/᩶ۗۧ;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    .line 1566
    invoke-virtual {v0}, Ll/ۖ۟ۧ;->ᩳ()I

    move-result v1

    if-ne v1, v2, :cond_0

    .line 490
    iget-object v1, v0, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    invoke-virtual {v1}, Ll/۬۬ۧ;->getAdapter()Ll/᩶ۗۧ;

    move-result-object v1

    .line 1567
    invoke-virtual {v1}, Ll/᩶ۗۧ;->getItemCount()I

    move-result v1

    const/4 v4, 0x1

    goto :goto_0

    .line 490
    :cond_0
    iget-object v1, v0, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    invoke-virtual {v1}, Ll/۬۬ۧ;->getAdapter()Ll/᩶ۗۧ;

    move-result-object v1

    .line 1570
    invoke-virtual {v1}, Ll/᩶ۗۧ;->getItemCount()I

    move-result v4

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    const/4 v4, 0x0

    .line 1575
    :goto_0
    invoke-static {v1, v4, v3, v3}, Ll/ܽ۟;->֫(IIIZ)Ll/ܽ۟;

    move-result-object v1

    .line 1578
    invoke-virtual {p1, v1}, Ll/ܳ۟;->֫(Ll/ܽ۟;)V

    .line 490
    iget-object v1, v0, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    invoke-virtual {v1}, Ll/۬۬ۧ;->getAdapter()Ll/᩶ۗۧ;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_1

    .line 1599
    :cond_2
    invoke-virtual {v1}, Ll/᩶ۗۧ;->getItemCount()I

    move-result v1

    if-eqz v1, :cond_6

    .line 810
    iget-boolean v3, v0, Ll/ۖ۟ۧ;->ܽ֫:Z

    if-nez v3, :cond_3

    goto :goto_1

    .line 1603
    :cond_3
    iget v3, v0, Ll/ۖ۟ۧ;->᩹:I

    if-lez v3, :cond_4

    const/16 v3, 0x2000

    .line 1604
    invoke-virtual {p1, v3}, Ll/ܳ۟;->֫(I)V

    .line 1606
    :cond_4
    iget v0, v0, Ll/ۖ۟ۧ;->᩹:I

    sub-int/2addr v1, v2

    if-ge v0, v1, :cond_5

    const/16 v0, 0x1000

    .line 1607
    invoke-virtual {p1, v0}, Ll/ܳ۟;->֫(I)V

    .line 1609
    :cond_5
    invoke-virtual {p1, v2}, Ll/ܳ۟;->ܺ(Z)V

    :cond_6
    :goto_1
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 3

    .line 524
    iget-object p1, p0, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    .line 525
    iget-object v0, p0, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    .line 529
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    iget-object v2, p0, Ll/ۖ۟ۧ;->ۧ֫:Landroid/graphics/Rect;

    iput v1, v2, Landroid/graphics/Rect;->left:I

    sub-int/2addr p4, p2

    .line 530
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p2

    sub-int/2addr p4, p2

    iput p4, v2, Landroid/graphics/Rect;->right:I

    .line 531
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p2

    iput p2, v2, Landroid/graphics/Rect;->top:I

    sub-int/2addr p5, p3

    .line 532
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p2

    sub-int/2addr p5, p2

    iput p5, v2, Landroid/graphics/Rect;->bottom:I

    const p2, 0x800033

    .line 534
    iget-object p3, p0, Ll/ۖ۟ۧ;->֫֫:Landroid/graphics/Rect;

    invoke-static {p2, p1, v0, v2, p3}, Landroid/view/Gravity;->apply(IIILandroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 535
    iget-object p1, p0, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    iget p2, p3, Landroid/graphics/Rect;->left:I

    iget p4, p3, Landroid/graphics/Rect;->top:I

    iget p5, p3, Landroid/graphics/Rect;->right:I

    iget p3, p3, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p1, p2, p4, p5, p3}, Landroid/view/View;->layout(IIII)V

    .line 538
    iget-boolean p1, p0, Ll/ۖ۟ۧ;->᩶:Z

    if-eqz p1, :cond_0

    .line 539
    invoke-virtual {p0}, Ll/ۖ۟ۧ;->᩻()V

    :cond_0
    return-void
.end method

.method public final onMeasure(II)V
    .locals 5

    .line 506
    iget-object v0, p0, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    invoke-virtual {p0, v0, p1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 507
    iget-object v0, p0, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    .line 508
    iget-object v1, p0, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    .line 509
    iget-object v2, p0, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredState()I

    move-result v2

    .line 511
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    add-int/2addr v4, v3

    add-int/2addr v4, v0

    .line 512
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    add-int/2addr v3, v0

    add-int/2addr v3, v1

    .line 514
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    move-result v0

    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 515
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    move-result v1

    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 517
    invoke-static {v0, p1, v2}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result p1

    shl-int/lit8 v0, v2, 0x10

    .line 518
    invoke-static {v1, p2, v0}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result p2

    .line 517
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 334
    instance-of v0, p1, Ll/ۡ۟ۧ;

    if-nez v0, :cond_0

    .line 335
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    .line 339
    :cond_0
    check-cast p1, Ll/ۡ۟ۧ;

    .line 340
    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 341
    iget v0, p1, Ll/ۡ۟ۧ;->᩹:I

    iput v0, p0, Ll/ۖ۟ۧ;->᩺:I

    .line 342
    iget-object p1, p1, Ll/ۡ۟ۧ;->᩸:Landroid/os/Parcelable;

    iput-object p1, p0, Ll/ۖ۟ۧ;->ۨ:Landroid/os/Parcelable;

    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 314
    invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 315
    new-instance v1, Ll/ۡ۟ۧ;

    .line 402
    invoke-direct {v1, v0}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    .line 317
    iget-object v0, p0, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    iput v0, v1, Ll/ۡ۟ۧ;->᩶:I

    .line 318
    iget v0, p0, Ll/ۖ۟ۧ;->᩺:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    iget v0, p0, Ll/ۖ۟ۧ;->᩹:I

    :cond_0
    iput v0, v1, Ll/ۡ۟ۧ;->᩹:I

    .line 320
    iget-object v0, p0, Ll/ۖ۟ۧ;->ۨ:Landroid/os/Parcelable;

    if-eqz v0, :cond_1

    .line 321
    iput-object v0, v1, Ll/ۡ۟ۧ;->᩸:Landroid/os/Parcelable;

    return-object v1

    .line 323
    :cond_1
    iget-object v0, p0, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    invoke-virtual {v0}, Ll/۬۬ۧ;->getAdapter()Ll/᩶ۗۧ;

    move-result-object v0

    .line 324
    instance-of v2, v0, Ll/᩸ܰۧ;

    if-eqz v2, :cond_2

    .line 325
    check-cast v0, Ll/᩸ܰۧ;

    invoke-interface {v0}, Ll/᩸ܰۧ;->֫()Landroid/os/Parcelable;

    move-result-object v0

    iput-object v0, v1, Ll/ۡ۟ۧ;->᩸:Landroid/os/Parcelable;

    :cond_2
    return-object v1
.end method

.method public final onViewAdded(Landroid/view/View;)V
    .locals 1

    .line 496
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "ViewPager2 does not support direct child views"

    .line 497
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final performAccessibilityAction(ILandroid/os/Bundle;)Z
    .locals 2

    .line 963
    iget-object v0, p0, Ll/ۖ۟ۧ;->᩸:Ll/᩻۟ۧ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v0, 0x1000

    const/16 v1, 0x2000

    if-eq p1, v1, :cond_1

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 966
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->performAccessibilityAction(ILandroid/os/Bundle;)Z

    move-result p1

    return p1

    .line 964
    :cond_1
    :goto_0
    iget-object p2, p0, Ll/ۖ۟ۧ;->᩸:Ll/᩻۟ۧ;

    .line 1471
    iget-object p2, p2, Ll/᩻۟ۧ;->ܽ:Ll/ۖ۟ۧ;

    if-eq p1, v1, :cond_3

    if-ne p1, v0, :cond_2

    goto :goto_1

    .line 1472
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_3
    :goto_1
    const/4 v0, 0x1

    if-ne p1, v1, :cond_4

    .line 682
    iget p1, p2, Ll/ۖ۟ۧ;->᩹:I

    sub-int/2addr p1, v0

    goto :goto_2

    :cond_4
    iget p1, p2, Ll/ۖ۟ۧ;->᩹:I

    add-int/2addr p1, v0

    .line 1494
    :goto_2
    invoke-virtual {p2}, Ll/ۖ۟ۧ;->ܳ()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 1495
    invoke-virtual {p2, p1, v0}, Ll/ۖ۟ۧ;->ۧ(IZ)V

    :cond_5
    return v0
.end method

.method public final setLayoutDirection(I)V
    .locals 0

    .line 950
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setLayoutDirection(I)V

    .line 951
    iget-object p1, p0, Ll/ۖ۟ۧ;->᩸:Ll/᩻۟ۧ;

    .line 1445
    invoke-virtual {p1}, Ll/᩻۟ۧ;->֫()V

    return-void
.end method

.method public final ֫()Ll/᩶ۗۧ;
    .locals 1

    .line 490
    iget-object v0, p0, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    invoke-virtual {v0}, Ll/۬۬ۧ;->getAdapter()Ll/᩶ۗۧ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(IZ)V
    .locals 1

    .line 768
    iget-object v0, p0, Ll/ۖ۟ۧ;->ۗ:Ll/ۗܰۧ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 614
    invoke-virtual {p0, p1, p2}, Ll/ۖ۟ۧ;->ۧ(IZ)V

    return-void
.end method

.method public final ֫(Ll/ܽ۟ۧ;)V
    .locals 1

    .line 879
    iget-object v0, p0, Ll/ۖ۟ۧ;->ۙ:Ll/ۙܰۧ;

    invoke-virtual {v0, p1}, Ll/ۙܰۧ;->֫(Ll/ܽ۟ۧ;)V

    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 682
    iget v0, p0, Ll/ۖ۟ۧ;->᩹:I

    return v0
.end method

.method public final ۧ(IZ)V
    .locals 8

    .line 490
    iget-object v0, p0, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    invoke-virtual {v0}, Ll/۬۬ۧ;->getAdapter()Ll/᩶ۗۧ;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 624
    iget p2, p0, Ll/ۖ۟ۧ;->᩺:I

    const/4 v0, -0x1

    if-eq p2, v0, :cond_3

    .line 625
    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Ll/ۖ۟ۧ;->᩺:I

    return-void

    .line 629
    :cond_0
    invoke-virtual {v0}, Ll/᩶ۗۧ;->getItemCount()I

    move-result v2

    if-gtz v2, :cond_1

    goto :goto_0

    .line 633
    :cond_1
    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 634
    invoke-virtual {v0}, Ll/᩶ۗۧ;->getItemCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 636
    iget v0, p0, Ll/ۖ۟ۧ;->᩹:I

    if-ne p1, v0, :cond_2

    iget-object v0, p0, Ll/ۖ۟ۧ;->۟:Ll/ۤܰۧ;

    invoke-virtual {v0}, Ll/ۤܰۧ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 640
    :cond_2
    iget v0, p0, Ll/ۖ۟ۧ;->᩹:I

    if-ne p1, v0, :cond_4

    if-eqz p2, :cond_4

    :cond_3
    :goto_0
    return-void

    :cond_4
    int-to-double v0, v0

    .line 649
    iput p1, p0, Ll/ۖ۟ۧ;->᩹:I

    .line 650
    iget-object v2, p0, Ll/ۖ۟ۧ;->᩸:Ll/᩻۟ۧ;

    .line 1432
    invoke-virtual {v2}, Ll/᩻۟ۧ;->֫()V

    .line 652
    iget-object v2, p0, Ll/ۖ۟ۧ;->۟:Ll/ۤܰۧ;

    invoke-virtual {v2}, Ll/ۤܰۧ;->ܽ()Z

    move-result v2

    if-nez v2, :cond_5

    .line 654
    iget-object v0, p0, Ll/ۖ۟ۧ;->۟:Ll/ۤܰۧ;

    invoke-virtual {v0}, Ll/ۤܰۧ;->֫()D

    move-result-wide v0

    .line 659
    :cond_5
    iget-object v2, p0, Ll/ۖ۟ۧ;->۟:Ll/ۤܰۧ;

    invoke-virtual {v2, p1, p2}, Ll/ۤܰۧ;->֫(IZ)V

    if-nez p2, :cond_6

    .line 661
    iget-object p2, p0, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    invoke-virtual {p2, p1}, Ll/۬۬ۧ;->scrollToPosition(I)V

    return-void

    :cond_6
    int-to-double v2, p1

    sub-double v4, v2, v0

    .line 666
    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    move-result-wide v4

    const-wide/high16 v6, 0x4008000000000000L    # 3.0

    cmpl-double p2, v4, v6

    if-lez p2, :cond_8

    .line 667
    iget-object p2, p0, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    cmpl-double v4, v2, v0

    if-lez v4, :cond_7

    add-int/lit8 v0, p1, -0x3

    goto :goto_1

    :cond_7
    add-int/lit8 v0, p1, 0x3

    :goto_1
    invoke-virtual {p2, v0}, Ll/۬۬ۧ;->scrollToPosition(I)V

    .line 669
    iget-object p2, p0, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    new-instance v0, Ll/ܺ۟ۧ;

    invoke-direct {v0, p2, p1}, Ll/ܺ۟ۧ;-><init>(Ll/۬۬ۧ;I)V

    invoke-virtual {p2, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 671
    :cond_8
    iget-object p2, p0, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    invoke-virtual {p2, p1}, Ll/۬۬ۧ;->smoothScrollToPosition(I)V

    return-void
.end method

.method public final ۧ(Ll/ܽ۟ۧ;)V
    .locals 1

    .line 889
    iget-object v0, p0, Ll/ۖ۟ۧ;->ۙ:Ll/ۙܰۧ;

    invoke-virtual {v0, p1}, Ll/ۙܰۧ;->ۧ(Ll/ܽ۟ۧ;)V

    return-void
.end method

.method public final ܳ()Z
    .locals 1

    .line 810
    iget-boolean v0, p0, Ll/ۖ۟ۧ;->ܽ֫:Z

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 857
    iget v0, p0, Ll/ۖ۟ۧ;->۫:I

    return v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 768
    iget-object v0, p0, Ll/ۖ۟ۧ;->ۗ:Ll/ۗܰۧ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()I
    .locals 2

    .line 581
    iget-object v0, p0, Ll/ۖ۟ۧ;->۬:Ll/ۜۗۧ;

    invoke-virtual {v0}, Ll/ۜۗۧ;->getOrientation()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩻()V
    .locals 2

    .line 545
    iget-object v0, p0, Ll/ۖ۟ۧ;->ۛ:Ll/ᩴۗۧ;

    if-eqz v0, :cond_2

    .line 549
    iget-object v1, p0, Ll/ۖ۟ۧ;->۬:Ll/ۜۗۧ;

    invoke-virtual {v0, v1}, Ll/ᩴۗۧ;->findSnapView(Ll/ܿ۬ۧ;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 553
    :cond_0
    iget-object v1, p0, Ll/ۖ۟ۧ;->۬:Ll/ۜۗۧ;

    invoke-virtual {v1, v0}, Ll/ܿ۬ۧ;->getPosition(Landroid/view/View;)I

    move-result v0

    .line 555
    iget v1, p0, Ll/ۖ۟ۧ;->᩹:I

    if-eq v0, v1, :cond_1

    .line 694
    iget-object v1, p0, Ll/ۖ۟ۧ;->۟:Ll/ۤܰۧ;

    invoke-virtual {v1}, Ll/ۤܰۧ;->ۧ()I

    move-result v1

    if-nez v1, :cond_1

    .line 557
    iget-object v1, p0, Ll/ۖ۟ۧ;->ۤ:Ll/ۙܰۧ;

    invoke-virtual {v1, v0}, Ll/ۙܰۧ;->onPageSelected(I)V

    :cond_1
    const/4 v0, 0x0

    .line 560
    iput-boolean v0, p0, Ll/ۖ۟ۧ;->᩶:Z

    return-void

    .line 546
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Design assumption violated."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
