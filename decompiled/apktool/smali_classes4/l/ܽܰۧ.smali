.class public Ll/ܽܰۧ;
.super Landroid/view/ViewGroup;
.source "I5V7"


# annotations
.annotation runtime Ll/ۜܰۧ;
.end annotation


# static fields
.field public static final ֫֫:[I

.field public static final ۧ֫:[I


# instance fields
.field public ۗ:Landroid/widget/TextView;

.field public ۙ:F

.field public ۛ:I

.field public ۟:Ljava/lang/ref/WeakReference;

.field public ۤ:Landroid/widget/TextView;

.field public ۨ:I

.field public ۫:Ll/֡ܰۧ;

.field public final ۬:Ll/֫ܰۧ;

.field public ܰ:Z

.field public ᩶:I

.field public ᩸:Landroid/widget/TextView;

.field public ᩹:I

.field public ᩺:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const v0, 0x1010098

    const v1, 0x10100af

    const v2, 0x1010034

    const v3, 0x1010095

    .line 73
    filled-new-array {v2, v3, v0, v1}, [I

    move-result-object v0

    sput-object v0, Ll/ܽܰۧ;->֫֫:[I

    const v0, 0x101038c

    .line 80
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Ll/ܽܰۧ;->ۧ֫:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    .line 113
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, -0x1

    .line 61
    iput v0, p0, Ll/ܽܰۧ;->᩶:I

    const/high16 v0, -0x40800000    # -1.0f

    .line 62
    iput v0, p0, Ll/ܽܰۧ;->ۙ:F

    .line 69
    new-instance v0, Ll/֫ܰۧ;

    invoke-direct {v0, p0}, Ll/֫ܰۧ;-><init>(Ll/ܽܰۧ;)V

    iput-object v0, p0, Ll/ܽܰۧ;->۬:Ll/֫ܰۧ;

    .line 115
    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Ll/ܽܰۧ;->ۤ:Landroid/widget/TextView;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 116
    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Ll/ܽܰۧ;->᩸:Landroid/widget/TextView;

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 117
    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Ll/ܽܰۧ;->ۗ:Landroid/widget/TextView;

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 119
    sget-object v3, Ll/ܽܰۧ;->֫֫:[I

    invoke-virtual {p1, p2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    const/4 v3, 0x0

    .line 120
    invoke-virtual {p2, v3, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    if-eqz v4, :cond_0

    .line 122
    invoke-static {v0, v4}, Ll/ۙ֫֫;->ᩳ(Landroid/widget/TextView;I)V

    .line 123
    invoke-static {v1, v4}, Ll/ۙ֫֫;->ᩳ(Landroid/widget/TextView;I)V

    .line 124
    invoke-static {v2, v4}, Ll/ۙ֫֫;->ᩳ(Landroid/widget/TextView;I)V

    :cond_0
    const/4 v5, 0x1

    .line 126
    invoke-virtual {p2, v5, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v5

    if-eqz v5, :cond_1

    int-to-float v5, v5

    .line 221
    invoke-virtual {v0, v3, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 222
    invoke-virtual {v1, v3, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 223
    invoke-virtual {v2, v3, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_1
    const/4 v5, 0x2

    .line 130
    invoke-virtual {p2, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 131
    invoke-virtual {p2, v5, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v5

    .line 132
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 133
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 134
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_2
    const/4 v5, 0x3

    const/16 v6, 0x50

    .line 136
    invoke-virtual {p2, v5, v6}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v5

    iput v5, p0, Ll/ܽܰۧ;->᩹:I

    .line 137
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 139
    invoke-virtual {v1}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result p2

    iput p2, p0, Ll/ܽܰۧ;->ۨ:I

    const/high16 v5, 0x43190000    # 153.0f

    float-to-int v5, v5

    and-int/lit16 v5, v5, 0xff

    shl-int/lit8 v5, v5, 0x18

    const v6, 0xffffff

    and-int/2addr p2, v6

    or-int/2addr p2, v5

    .line 192
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 193
    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 142
    sget-object p2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 143
    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 144
    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    if-eqz v4, :cond_3

    .line 148
    sget-object p2, Ll/ܽܰۧ;->ۧ֫:[I

    invoke-virtual {p1, v4, p2}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 149
    invoke-virtual {p2, v3, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    .line 150
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    :cond_3
    if-eqz v3, :cond_4

    .line 105
    new-instance p2, Ll/ۧܰۧ;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {p2, v3}, Ll/ۧܰۧ;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    new-instance p2, Ll/ۧܰۧ;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p2, v0}, Ll/ۧܰۧ;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    new-instance p2, Ll/ۧܰۧ;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p2, v0}, Ll/ۧܰۧ;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    goto :goto_0

    .line 158
    :cond_4
    invoke-virtual {v0}, Landroid/widget/TextView;->setSingleLine()V

    .line 159
    invoke-virtual {v1}, Landroid/widget/TextView;->setSingleLine()V

    .line 160
    invoke-virtual {v2}, Landroid/widget/TextView;->setSingleLine()V

    .line 163
    :goto_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    const/high16 p2, 0x41800000    # 16.0f

    mul-float p1, p1, p2

    float-to-int p1, p1

    .line 164
    iput p1, p0, Ll/ܽܰۧ;->ۛ:I

    return-void
.end method


# virtual methods
.method public final onAttachedToWindow()V
    .locals 3

    .line 239
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 241
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 242
    instance-of v1, v0, Ll/֡ܰۧ;

    if-eqz v1, :cond_1

    .line 247
    check-cast v0, Ll/֡ܰۧ;

    .line 572
    iget-object v1, v0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    .line 250
    iget-object v2, p0, Ll/ܽܰۧ;->۬:Ll/֫ܰۧ;

    invoke-virtual {v0, v2}, Ll/֡ܰۧ;->ܽ(Ll/ۖܰۧ;)V

    .line 251
    invoke-virtual {v0, v2}, Ll/֡ܰۧ;->֫(Ll/ܺܰۧ;)V

    .line 252
    iput-object v0, p0, Ll/ܽܰۧ;->۫:Ll/֡ܰۧ;

    .line 253
    iget-object v0, p0, Ll/ܽܰۧ;->۟:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨ᩺ۧ;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0, v1}, Ll/ܽܰۧ;->֫(Ll/ۨ᩺ۧ;Ll/ۨ᩺ۧ;)V

    return-void

    .line 243
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "PagerTitleStrip must be a direct child of a ViewPager."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final onDetachedFromWindow()V
    .locals 3

    .line 258
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 259
    iget-object v0, p0, Ll/ܽܰۧ;->۫:Ll/֡ܰۧ;

    if-eqz v0, :cond_0

    .line 572
    iget-object v0, v0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    const/4 v1, 0x0

    .line 260
    invoke-virtual {p0, v0, v1}, Ll/ܽܰۧ;->֫(Ll/ۨ᩺ۧ;Ll/ۨ᩺ۧ;)V

    .line 261
    iget-object v0, p0, Ll/ܽܰۧ;->۫:Ll/֡ܰۧ;

    invoke-virtual {v0, v1}, Ll/֡ܰۧ;->ܽ(Ll/ۖܰۧ;)V

    .line 262
    iget-object v0, p0, Ll/ܽܰۧ;->۫:Ll/֡ܰۧ;

    iget-object v2, p0, Ll/ܽܰۧ;->۬:Ll/֫ܰۧ;

    invoke-virtual {v0, v2}, Ll/֡ܰۧ;->ۧ(Ll/ܺܰۧ;)V

    .line 263
    iput-object v1, p0, Ll/ܽܰۧ;->۫:Ll/֡ܰۧ;

    :cond_0
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 456
    iget-object p1, p0, Ll/ܽܰۧ;->۫:Ll/֡ܰۧ;

    if-eqz p1, :cond_1

    .line 457
    iget p1, p0, Ll/ܽܰۧ;->ۙ:F

    const/4 p2, 0x0

    cmpl-float p2, p1, p2

    if-ltz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 458
    :goto_0
    iget p2, p0, Ll/ܽܰۧ;->᩶:I

    const/4 p3, 0x1

    invoke-virtual {p0, p1, p3, p2}, Ll/ܽܰۧ;->֫(FZI)V

    :cond_1
    return-void
.end method

.method public final onMeasure(II)V
    .locals 7

    .line 420
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    if-ne v0, v1, :cond_1

    .line 425
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    add-int/2addr v2, v0

    const/4 v0, -0x2

    .line 426
    invoke-static {p2, v2, v0}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v3

    .line 429
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v4

    int-to-float v5, v4

    const v6, 0x3e4ccccd    # 0.2f

    mul-float v5, v5, v6

    float-to-int v5, v5

    .line 431
    invoke-static {p1, v5, v0}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result p1

    .line 434
    iget-object v0, p0, Ll/ܽܰۧ;->ۤ:Landroid/widget/TextView;

    invoke-virtual {v0, p1, v3}, Landroid/view/View;->measure(II)V

    .line 435
    iget-object v0, p0, Ll/ܽܰۧ;->᩸:Landroid/widget/TextView;

    invoke-virtual {v0, p1, v3}, Landroid/view/View;->measure(II)V

    .line 436
    iget-object v5, p0, Ll/ܽܰۧ;->ۗ:Landroid/widget/TextView;

    invoke-virtual {v5, p1, v3}, Landroid/view/View;->measure(II)V

    .line 439
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p1

    if-ne p1, v1, :cond_0

    .line 441
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    goto :goto_0

    .line 443
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    .line 444
    invoke-virtual {p0}, Ll/ܽܰۧ;->֫()I

    move-result v1

    add-int/2addr p1, v2

    .line 445
    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 448
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredState()I

    move-result v0

    shl-int/lit8 v0, v0, 0x10

    .line 449
    invoke-static {p1, p2, v0}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result p1

    .line 451
    invoke-virtual {p0, v4, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void

    .line 422
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Must measure with an exact width"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final requestLayout()V
    .locals 1

    .line 308
    iget-boolean v0, p0, Ll/ܽܰۧ;->ܰ:Z

    if-nez v0, :cond_0

    .line 309
    invoke-super {p0}, Landroid/view/ViewGroup;->requestLayout()V

    :cond_0
    return-void
.end method

.method public ֫()I
    .locals 1

    .line 464
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 466
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ֫(FZI)V
    .locals 20

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p3

    .line 331
    iget v3, v0, Ll/ܽܰۧ;->᩶:I

    if-eq v2, v3, :cond_0

    .line 332
    iget-object v3, v0, Ll/ܽܰۧ;->۫:Ll/֡ܰۧ;

    .line 572
    iget-object v3, v3, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    .line 332
    invoke-virtual {v0, v2, v3}, Ll/ܽܰۧ;->֫(ILl/ۨ᩺ۧ;)V

    goto :goto_0

    :cond_0
    if-nez p2, :cond_1

    .line 333
    iget v2, v0, Ll/ܽܰۧ;->ۙ:F

    cmpl-float v2, v1, v2

    if-nez v2, :cond_1

    return-void

    :cond_1
    :goto_0
    const/4 v2, 0x1

    .line 337
    iput-boolean v2, v0, Ll/ܽܰۧ;->᩺:Z

    .line 339
    iget-object v2, v0, Ll/ܽܰۧ;->ۤ:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    .line 340
    iget-object v4, v0, Ll/ܽܰۧ;->᩸:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    .line 341
    iget-object v6, v0, Ll/ܽܰۧ;->ۗ:Landroid/widget/TextView;

    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    .line 342
    div-int/lit8 v8, v5, 0x2

    .line 344
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v9

    .line 345
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v10

    .line 346
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v11

    .line 347
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v12

    .line 348
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v13

    .line 349
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v14

    add-int v15, v11, v8

    add-int v16, v12, v8

    sub-int v15, v9, v15

    sub-int v15, v15, v16

    const/high16 v17, 0x3f000000    # 0.5f

    add-float v17, v1, v17

    const/high16 v18, 0x3f800000    # 1.0f

    cmpl-float v19, v17, v18

    if-lez v19, :cond_2

    sub-float v17, v17, v18

    :cond_2
    sub-int v16, v9, v16

    int-to-float v15, v15

    mul-float v15, v15, v17

    float-to-int v15, v15

    sub-int v16, v16, v15

    sub-int v8, v16, v8

    add-int/2addr v5, v8

    .line 362
    invoke-virtual {v2}, Landroid/widget/TextView;->getBaseline()I

    move-result v15

    .line 363
    invoke-virtual {v4}, Landroid/widget/TextView;->getBaseline()I

    move-result v1

    move/from16 p2, v7

    .line 364
    invoke-virtual {v6}, Landroid/widget/TextView;->getBaseline()I

    move-result v7

    move/from16 p3, v9

    .line 365
    invoke-static {v15, v1}, Ljava/lang/Math;->max(II)I

    move-result v9

    invoke-static {v9, v7}, Ljava/lang/Math;->max(II)I

    move-result v9

    sub-int v15, v9, v15

    sub-int v1, v9, v1

    sub-int/2addr v9, v7

    .line 369
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v7

    add-int/2addr v7, v15

    .line 370
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v16

    move/from16 v17, v12

    add-int v12, v16, v1

    .line 371
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    move-result v16

    move-object/from16 v18, v6

    add-int v6, v16, v9

    .line 372
    invoke-static {v7, v12}, Ljava/lang/Math;->max(II)I

    move-result v7

    invoke-static {v7, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    .line 375
    iget v7, v0, Ll/ܽܰۧ;->᩹:I

    and-int/lit8 v7, v7, 0x70

    const/16 v12, 0x10

    if-eq v7, v12, :cond_4

    const/16 v12, 0x50

    if-eq v7, v12, :cond_3

    add-int/2addr v15, v13

    add-int/2addr v1, v13

    add-int/2addr v13, v9

    goto :goto_2

    :cond_3
    sub-int/2addr v10, v14

    sub-int/2addr v10, v6

    goto :goto_1

    :cond_4
    sub-int/2addr v10, v13

    sub-int/2addr v10, v14

    sub-int/2addr v10, v6

    .line 389
    div-int/lit8 v10, v10, 0x2

    :goto_1
    add-int/2addr v15, v10

    add-int/2addr v1, v10

    add-int v13, v10, v9

    .line 403
    :goto_2
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v6

    add-int/2addr v6, v1

    .line 402
    invoke-virtual {v4, v8, v1, v5, v6}, Landroid/view/View;->layout(IIII)V

    .line 405
    iget v1, v0, Ll/ܽܰۧ;->ۛ:I

    sub-int/2addr v8, v1

    sub-int/2addr v8, v3

    invoke-static {v11, v8}, Ljava/lang/Math;->min(II)I

    move-result v1

    add-int/2addr v3, v1

    .line 407
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    add-int/2addr v4, v15

    .line 406
    invoke-virtual {v2, v1, v15, v3, v4}, Landroid/view/View;->layout(IIII)V

    sub-int v9, p3, v17

    sub-int v9, v9, p2

    .line 409
    iget v1, v0, Ll/ܽܰۧ;->ۛ:I

    add-int/2addr v5, v1

    invoke-static {v9, v5}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int v7, v1, p2

    .line 412
    invoke-virtual/range {v18 .. v18}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    add-int/2addr v2, v13

    move-object/from16 v3, v18

    .line 411
    invoke-virtual {v3, v1, v13, v7, v2}, Landroid/view/View;->layout(IIII)V

    move/from16 v1, p1

    .line 414
    iput v1, v0, Ll/ܽܰۧ;->ۙ:F

    const/4 v1, 0x0

    .line 415
    iput-boolean v1, v0, Ll/ܽܰۧ;->᩺:Z

    return-void
.end method

.method public ֫(I)V
    .locals 0

    .line 173
    iput p1, p0, Ll/ܽܰۧ;->ۛ:I

    .line 174
    invoke-virtual {p0}, Ll/ܽܰۧ;->requestLayout()V

    return-void
.end method

.method public final ֫(ILl/ۨ᩺ۧ;)V
    .locals 7

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    .line 268
    invoke-virtual {p2}, Ll/ۨ᩺ۧ;->ۧ()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x1

    .line 269
    iput-boolean v2, p0, Ll/ܽܰۧ;->ܰ:Z

    const/4 v3, 0x0

    if-lt p1, v2, :cond_1

    if-eqz p2, :cond_1

    add-int/lit8 v2, p1, -0x1

    .line 273
    invoke-virtual {p2, v2}, Ll/ۨ᩺ۧ;->֫(I)Ljava/lang/CharSequence;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v3

    .line 275
    :goto_1
    iget-object v4, p0, Ll/ܽܰۧ;->ۤ:Landroid/widget/TextView;

    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz p2, :cond_2

    if-ge p1, v1, :cond_2

    .line 278
    invoke-virtual {p2, p1}, Ll/ۨ᩺ۧ;->֫(I)Ljava/lang/CharSequence;

    move-result-object v2

    goto :goto_2

    :cond_2
    move-object v2, v3

    .line 277
    :goto_2
    iget-object v5, p0, Ll/ܽܰۧ;->᩸:Landroid/widget/TextView;

    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    add-int/lit8 v2, p1, 0x1

    if-ge v2, v1, :cond_3

    if-eqz p2, :cond_3

    .line 282
    invoke-virtual {p2, v2}, Ll/ۨ᩺ۧ;->֫(I)Ljava/lang/CharSequence;

    move-result-object v3

    .line 284
    :cond_3
    iget-object p2, p0, Ll/ܽܰۧ;->ۗ:Landroid/widget/TextView;

    invoke-virtual {p2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 287
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    const v2, 0x3f4ccccd    # 0.8f

    mul-float v1, v1, v2

    float-to-int v1, v1

    .line 288
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    const/high16 v2, -0x80000000

    .line 289
    invoke-static {v1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 290
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v6

    sub-int/2addr v3, v6

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v6

    sub-int/2addr v3, v6

    .line 291
    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 292
    invoke-static {v3, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 293
    invoke-virtual {v4, v1, v2}, Landroid/view/View;->measure(II)V

    .line 294
    invoke-virtual {v5, v1, v2}, Landroid/view/View;->measure(II)V

    .line 295
    invoke-virtual {p2, v1, v2}, Landroid/view/View;->measure(II)V

    .line 297
    iput p1, p0, Ll/ܽܰۧ;->᩶:I

    .line 299
    iget-boolean p2, p0, Ll/ܽܰۧ;->᩺:Z

    if-nez p2, :cond_4

    .line 300
    iget p2, p0, Ll/ܽܰۧ;->ۙ:F

    invoke-virtual {p0, p2, v0, p1}, Ll/ܽܰۧ;->֫(FZI)V

    .line 303
    :cond_4
    iput-boolean v0, p0, Ll/ܽܰۧ;->ܰ:Z

    return-void
.end method

.method public final ֫(Ll/ۨ᩺ۧ;Ll/ۨ᩺ۧ;)V
    .locals 1

    .line 314
    iget-object v0, p0, Ll/ܽܰۧ;->۬:Ll/֫ܰۧ;

    if-eqz p1, :cond_0

    .line 315
    invoke-virtual {p1, v0}, Ll/ۨ᩺ۧ;->ܽ(Landroid/database/DataSetObserver;)V

    const/4 p1, 0x0

    .line 316
    iput-object p1, p0, Ll/ܽܰۧ;->۟:Ljava/lang/ref/WeakReference;

    :cond_0
    if-eqz p2, :cond_1

    .line 319
    invoke-virtual {p2, v0}, Ll/ۨ᩺ۧ;->֫(Landroid/database/DataSetObserver;)V

    .line 320
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Ll/ܽܰۧ;->۟:Ljava/lang/ref/WeakReference;

    .line 322
    :cond_1
    iget-object p1, p0, Ll/ܽܰۧ;->۫:Ll/֡ܰۧ;

    if-eqz p1, :cond_2

    const/4 v0, -0x1

    .line 323
    iput v0, p0, Ll/ܽܰۧ;->᩶:I

    const/high16 v0, -0x40800000    # -1.0f

    .line 324
    iput v0, p0, Ll/ܽܰۧ;->ۙ:F

    .line 627
    iget p1, p1, Ll/֡ܰۧ;->۫:I

    .line 325
    invoke-virtual {p0, p1, p2}, Ll/ܽܰۧ;->֫(ILl/ۨ᩺ۧ;)V

    .line 326
    invoke-virtual {p0}, Ll/ܽܰۧ;->requestLayout()V

    :cond_2
    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 181
    iget v0, p0, Ll/ܽܰۧ;->ۛ:I

    return v0
.end method
