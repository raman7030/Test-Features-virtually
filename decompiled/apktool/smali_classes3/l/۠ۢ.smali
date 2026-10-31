.class public Ll/۠ۢ;
.super Landroid/view/ViewGroup;
.source "S696"


# instance fields
.field public final ۗ:Landroid/widget/FrameLayout;

.field public final ۙ:Ll/ۚۢ;

.field public final ۛ:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field public ۤ:Ll/ۢۖ;

.field public ۫:Z

.field public final ۬:Landroid/widget/FrameLayout;

.field public final ᩶:Ll/֡ۢ;

.field public final ᩸:Landroid/view/View;

.field public final ᩹:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 210
    invoke-direct {p0, p1, p2, v0}, Ll/۠ۢ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 8

    .line 222
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 134
    new-instance v0, Ll/ܺۢ;

    invoke-direct {v0, p0}, Ll/ܺۢ;-><init>(Ll/۠ۢ;)V

    .line 148
    new-instance v0, Ll/ۖۢ;

    invoke-direct {v0, p0}, Ll/ۖۢ;-><init>(Ll/۠ۢ;)V

    iput-object v0, p0, Ll/۠ۢ;->ۛ:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 224
    sget-object v3, Ll/ۗᩳ;->ܿ:[I

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v3, p3, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v7

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    move-object v5, v7

    move v6, p3

    .line 226
    invoke-static/range {v1 .. v6}, Ll/ܿ᩺;->֫(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    const/4 p2, 0x1

    const/4 p3, 0x4

    .line 229
    invoke-virtual {v7, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 233
    invoke-virtual {v7, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    .line 236
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->recycle()V

    .line 238
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d0006

    .line 239
    invoke-virtual {v0, v1, p0, p2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 241
    new-instance p2, Ll/ۚۢ;

    invoke-direct {p2, p0}, Ll/ۚۢ;-><init>(Ll/۠ۢ;)V

    iput-object p2, p0, Ll/۠ۢ;->ۙ:Ll/ۚۢ;

    const v0, 0x7f0a0055

    .line 243
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Ll/۠ۢ;->᩸:Landroid/view/View;

    .line 244
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Ll/۠ۢ;->᩹:Landroid/graphics/drawable/Drawable;

    const v0, 0x7f0a013a

    .line 246
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Ll/۠ۢ;->ۗ:Landroid/widget/FrameLayout;

    .line 247
    invoke-virtual {v0, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 248
    invoke-virtual {v0, p2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    const v1, 0x7f0a0286

    .line 249
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const v0, 0x7f0a01d6

    .line 251
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 252
    invoke-virtual {v0, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 253
    new-instance p2, Ll/ۘۢ;

    invoke-direct {p2}, Landroid/view/View$AccessibilityDelegate;-><init>()V

    invoke-virtual {v0, p2}, Landroid/view/View;->setAccessibilityDelegate(Landroid/view/View$AccessibilityDelegate;)V

    .line 260
    new-instance p2, Ll/ᩴۢ;

    invoke-direct {p2, p0, v0}, Ll/ᩴۢ;-><init>(Ll/۠ۢ;Landroid/widget/FrameLayout;)V

    invoke-virtual {v0, p2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 278
    iput-object v0, p0, Ll/۠ۢ;->۬:Landroid/widget/FrameLayout;

    .line 280
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    .line 281
    invoke-virtual {p2, p3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 283
    new-instance p2, Ll/֡ۢ;

    invoke-direct {p2, p0}, Ll/֡ۢ;-><init>(Ll/۠ۢ;)V

    iput-object p2, p0, Ll/۠ۢ;->᩶:Ll/֡ۢ;

    .line 284
    new-instance p3, Ll/᩵ۢ;

    invoke-direct {p3, p0}, Ll/᩵ۢ;-><init>(Ll/۠ۢ;)V

    invoke-virtual {p2, p3}, Landroid/widget/BaseAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 292
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 293
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 p2, p2, 0x2

    const p3, 0x7f070017

    .line 294
    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    .line 293
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    return-void
.end method


# virtual methods
.method public final onAttachedToWindow()V
    .locals 1

    .line 434
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 435
    iget-object v0, p0, Ll/۠ۢ;->᩶:Ll/֡ۢ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    .line 439
    iput-boolean v0, p0, Ll/۠ۢ;->۫:Z

    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 444
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 445
    iget-object v0, p0, Ll/۠ۢ;->᩶:Ll/֡ۢ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 450
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 451
    iget-object v1, p0, Ll/۠ۢ;->ۛ:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 429
    :cond_0
    invoke-virtual {p0}, Ll/۠ۢ;->ۧ()Ll/ۢۖ;

    move-result-object v0

    .line 859
    iget-object v0, v0, Ll/ۢۖ;->᩷֫:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 454
    invoke-virtual {p0}, Ll/۠ۢ;->֫()V

    :cond_1
    const/4 v0, 0x0

    .line 456
    iput-boolean v0, p0, Ll/۠ۢ;->۫:Z

    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    .line 475
    iget-object p1, p0, Ll/۠ۢ;->᩸:Landroid/view/View;

    const/4 p2, 0x0

    invoke-virtual {p1, p2, p2, p4, p5}, Landroid/view/View;->layout(IIII)V

    .line 429
    invoke-virtual {p0}, Ll/۠ۢ;->ۧ()Ll/ۢۖ;

    move-result-object p1

    .line 859
    iget-object p1, p1, Ll/ۢۖ;->᩷֫:Landroid/widget/PopupWindow;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result p1

    if-nez p1, :cond_0

    .line 477
    invoke-virtual {p0}, Ll/۠ۢ;->֫()V

    :cond_0
    return-void
.end method

.method public final onMeasure(II)V
    .locals 1

    .line 465
    iget-object v0, p0, Ll/۠ۢ;->ۗ:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 466
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 469
    :cond_0
    iget-object v0, p0, Ll/۠ۢ;->᩸:Landroid/view/View;

    invoke-virtual {p0, v0, p1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 470
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public final ֫()V
    .locals 2

    .line 429
    invoke-virtual {p0}, Ll/۠ۢ;->ۧ()Ll/ۢۖ;

    move-result-object v0

    .line 859
    iget-object v0, v0, Ll/ۢۖ;->᩷֫:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 414
    invoke-virtual {p0}, Ll/۠ۢ;->ۧ()Ll/ۢۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢۖ;->dismiss()V

    .line 415
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 416
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 417
    iget-object v1, p0, Ll/۠ۢ;->ۛ:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_0
    return-void
.end method

.method public final ۧ()Ll/ۢۖ;
    .locals 2

    .line 529
    iget-object v0, p0, Ll/۠ۢ;->ۤ:Ll/ۢۖ;

    if-nez v0, :cond_0

    .line 530
    new-instance v0, Ll/ۢۖ;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۢۖ;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Ll/۠ۢ;->ۤ:Ll/ۢۖ;

    .line 531
    iget-object v1, p0, Ll/۠ۢ;->᩶:Ll/֡ۢ;

    invoke-virtual {v0, v1}, Ll/ۢۖ;->֫(Landroid/widget/ListAdapter;)V

    .line 532
    iget-object v0, p0, Ll/۠ۢ;->ۤ:Ll/ۢۖ;

    invoke-virtual {v0, p0}, Ll/ۢۖ;->֫(Landroid/view/View;)V

    .line 533
    iget-object v0, p0, Ll/۠ۢ;->ۤ:Ll/ۢۖ;

    invoke-virtual {v0}, Ll/ۢۖ;->ۖ()V

    .line 534
    iget-object v0, p0, Ll/۠ۢ;->ۤ:Ll/ۢۖ;

    iget-object v1, p0, Ll/۠ۢ;->ۙ:Ll/ۚۢ;

    invoke-virtual {v0, v1}, Ll/ۢۖ;->֫(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 535
    iget-object v0, p0, Ll/۠ۢ;->ۤ:Ll/ۢۖ;

    invoke-virtual {v0, v1}, Ll/ۢۖ;->֫(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 537
    :cond_0
    iget-object v0, p0, Ll/۠ۢ;->ۤ:Ll/ۢۖ;

    return-object v0
.end method

.method public final ܽ()V
    .locals 2

    .line 429
    invoke-virtual {p0}, Ll/۠ۢ;->ۧ()Ll/ۢۖ;

    move-result-object v0

    .line 859
    iget-object v0, v0, Ll/ۢۖ;->᩷֫:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 354
    iget-boolean v0, p0, Ll/۠ۢ;->۫:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 368
    :cond_0
    iget-object v0, p0, Ll/۠ۢ;->᩶:Ll/֡ۢ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No data model. Did you call #setDataModel?"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method
