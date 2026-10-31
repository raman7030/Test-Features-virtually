.class public Ll/᩹᩷;
.super Ll/֨᩷;
.source "165A"


# instance fields
.field public ֫֫:I

.field public ۛ:Landroid/view/View;

.field public ۟:Ljava/lang/CharSequence;

.field public ۧ֫:Landroid/widget/TextView;

.field public ۨ:Landroid/view/View;

.field public ܰ:Landroid/view/View;

.field public ܳ֫:I

.field public ܽ֫:Ljava/lang/CharSequence;

.field public ܿ֫:Z

.field public ᩳ֫:Landroid/widget/LinearLayout;

.field public ᩺:I

.field public ᩻֫:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f04001c

    .line 61
    invoke-direct {p0, p1, p2, v0}, Ll/᩹᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 66
    invoke-direct {p0, p1, p2, p3}, Ll/֨᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 68
    sget-object v0, Ll/ۗᩳ;->ᩳ:[I

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, p3, v1}, Ll/᩺ۘ;->֫(Landroid/content/Context;Landroid/util/AttributeSet;[III)Ll/᩺ۘ;

    move-result-object p1

    .line 70
    invoke-virtual {p1, v1}, Ll/᩺ۘ;->ᩳ(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/4 p2, 0x5

    .line 71
    invoke-virtual {p1, p2, v1}, Ll/᩺ۘ;->ܳ(II)I

    move-result p2

    iput p2, p0, Ll/᩹᩷;->ܳ֫:I

    const/4 p2, 0x4

    .line 73
    invoke-virtual {p1, p2, v1}, Ll/᩺ۘ;->ܳ(II)I

    move-result p2

    iput p2, p0, Ll/᩹᩷;->֫֫:I

    const/4 p2, 0x3

    .line 76
    invoke-virtual {p1, p2, v1}, Ll/᩺ۘ;->ܿ(II)I

    move-result p2

    iput p2, p0, Ll/֨᩷;->᩹:I

    const/4 p2, 0x2

    const p3, 0x7f0d0005

    .line 79
    invoke-virtual {p1, p2, p3}, Ll/᩺ۘ;->ܳ(II)I

    move-result p2

    iput p2, p0, Ll/᩹᩷;->᩺:I

    .line 83
    invoke-virtual {p1}, Ll/᩺ۘ;->ܿ()V

    return-void
.end method

.method private ᩻()V
    .locals 5

    .line 135
    iget-object v0, p0, Ll/᩹᩷;->ᩳ֫:Landroid/widget/LinearLayout;

    if-nez v0, :cond_1

    .line 136
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/high16 v1, 0x7f0d0000

    .line 137
    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 138
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Ll/᩹᩷;->ᩳ֫:Landroid/widget/LinearLayout;

    const v1, 0x7f0a0048

    .line 139
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ll/᩹᩷;->᩻֫:Landroid/widget/TextView;

    .line 140
    iget-object v0, p0, Ll/᩹᩷;->ᩳ֫:Landroid/widget/LinearLayout;

    const v1, 0x7f0a0047

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ll/᩹᩷;->ۧ֫:Landroid/widget/TextView;

    .line 141
    iget v0, p0, Ll/᩹᩷;->ܳ֫:I

    if-eqz v0, :cond_0

    .line 142
    iget-object v1, p0, Ll/᩹᩷;->᩻֫:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 144
    :cond_0
    iget v0, p0, Ll/᩹᩷;->֫֫:I

    if-eqz v0, :cond_1

    .line 145
    iget-object v1, p0, Ll/᩹᩷;->ۧ֫:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 149
    :cond_1
    iget-object v0, p0, Ll/᩹᩷;->᩻֫:Landroid/widget/TextView;

    iget-object v1, p0, Ll/᩹᩷;->ܽ֫:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 150
    iget-object v0, p0, Ll/᩹᩷;->ۧ֫:Landroid/widget/TextView;

    iget-object v1, p0, Ll/᩹᩷;->۟:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 152
    iget-object v0, p0, Ll/᩹᩷;->ܽ֫:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    .line 153
    iget-object v1, p0, Ll/᩹᩷;->۟:Ljava/lang/CharSequence;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    .line 154
    iget-object v2, p0, Ll/᩹᩷;->ۧ֫:Landroid/widget/TextView;

    const/16 v3, 0x8

    if-nez v1, :cond_2

    const/4 v4, 0x0

    goto :goto_0

    :cond_2
    const/16 v4, 0x8

    :goto_0
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 155
    iget-object v2, p0, Ll/᩹᩷;->ᩳ֫:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_3

    if-nez v1, :cond_4

    :cond_3
    const/4 v3, 0x0

    :cond_4
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 156
    iget-object v0, p0, Ll/᩹᩷;->ᩳ֫:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_5

    .line 157
    iget-object v0, p0, Ll/᩹᩷;->ᩳ֫:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_5
    return-void
.end method


# virtual methods
.method public final generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 3

    .line 238
    new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    return-object v0
.end method

.method public final generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 243
    new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 88
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 89
    iget-object v0, p0, Ll/֨᩷;->᩸:Ll/ܿۢ;

    if-eqz v0, :cond_0

    .line 90
    invoke-virtual {v0}, Ll/ܿۢ;->ܽ()Z

    .line 91
    iget-object v0, p0, Ll/֨᩷;->᩸:Ll/ܿۢ;

    .line 384
    iget-object v0, v0, Ll/ܿۢ;->᩺:Ll/ۛ᩷;

    if-eqz v0, :cond_0

    .line 385
    invoke-virtual {v0}, Ll/ᩳ᩷;->֫()V

    :cond_0
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 5

    .line 328
    sget p1, Ll/᩹ᩴ;->֫:I

    .line 57
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    sub-int v1, p4, p2

    .line 329
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    .line 330
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    sub-int/2addr p5, p3

    .line 331
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p3

    sub-int/2addr p5, p3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p3

    sub-int/2addr p5, p3

    .line 333
    iget-object p3, p0, Ll/᩹᩷;->ۛ:Landroid/view/View;

    const/16 v3, 0x8

    if-eqz p3, :cond_6

    invoke-virtual {p3}, Landroid/view/View;->getVisibility()I

    move-result p3

    if-eq p3, v3, :cond_6

    .line 334
    iget-object p3, p0, Ll/᩹᩷;->ۛ:Landroid/view/View;

    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    check-cast p3, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz p1, :cond_2

    .line 335
    iget v4, p3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    goto :goto_2

    :cond_2
    iget v4, p3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    :goto_2
    if-eqz p1, :cond_3

    .line 336
    iget p3, p3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    goto :goto_3

    :cond_3
    iget p3, p3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    :goto_3
    if-eqz p1, :cond_4

    sub-int/2addr v1, v4

    goto :goto_4

    :cond_4
    add-int/2addr v1, v4

    .line 338
    :goto_4
    iget-object v4, p0, Ll/᩹᩷;->ۛ:Landroid/view/View;

    invoke-static {v1, v2, p5, v4, p1}, Ll/֨᩷;->֫(IIILandroid/view/View;Z)I

    move-result v4

    add-int/2addr v1, v4

    if-eqz p1, :cond_5

    sub-int/2addr v1, p3

    goto :goto_5

    :cond_5
    add-int/2addr v1, p3

    .line 342
    :cond_6
    :goto_5
    iget-object p3, p0, Ll/᩹᩷;->ᩳ֫:Landroid/widget/LinearLayout;

    if-eqz p3, :cond_7

    iget-object v4, p0, Ll/᩹᩷;->ܰ:Landroid/view/View;

    if-nez v4, :cond_7

    invoke-virtual {p3}, Landroid/view/View;->getVisibility()I

    move-result p3

    if-eq p3, v3, :cond_7

    .line 343
    iget-object p3, p0, Ll/᩹᩷;->ᩳ֫:Landroid/widget/LinearLayout;

    invoke-static {v1, v2, p5, p3, p1}, Ll/֨᩷;->֫(IIILandroid/view/View;Z)I

    move-result p3

    add-int/2addr v1, p3

    .line 346
    :cond_7
    iget-object p3, p0, Ll/᩹᩷;->ܰ:Landroid/view/View;

    if-eqz p3, :cond_8

    .line 347
    invoke-static {v1, v2, p5, p3, p1}, Ll/֨᩷;->֫(IIILandroid/view/View;Z)I

    :cond_8
    if-eqz p1, :cond_9

    .line 350
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p2

    goto :goto_6

    :cond_9
    sub-int/2addr p4, p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p2

    sub-int p2, p4, p2

    .line 352
    :goto_6
    iget-object p3, p0, Ll/֨᩷;->ۗ:Ll/ۡۢ;

    if-eqz p3, :cond_a

    xor-int/2addr p1, v0

    .line 353
    invoke-static {p2, v2, p5, p3, p1}, Ll/֨᩷;->֫(IIILandroid/view/View;Z)I

    :cond_a
    return-void
.end method

.method public final onMeasure(II)V
    .locals 9

    .line 248
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    if-ne v0, v1, :cond_11

    .line 254
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    if-eqz v0, :cond_10

    .line 260
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 262
    iget v0, p0, Ll/֨᩷;->᩹:I

    if-lez v0, :cond_0

    goto :goto_0

    .line 263
    :cond_0
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 265
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    add-int/2addr v2, p2

    .line 266
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p2

    sub-int p2, p1, p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    sub-int/2addr p2, v3

    sub-int v3, v0, v2

    const/high16 v4, -0x80000000

    .line 268
    invoke-static {v3, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    .line 270
    iget-object v5, p0, Ll/᩹᩷;->ۛ:Landroid/view/View;

    if-eqz v5, :cond_1

    .line 271
    invoke-static {v5, p2, v4}, Ll/֨᩷;->֫(Landroid/view/View;II)I

    move-result p2

    .line 272
    iget-object v5, p0, Ll/᩹᩷;->ۛ:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 273
    iget v6, v5, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v5, v5, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v6, v5

    sub-int/2addr p2, v6

    .line 276
    :cond_1
    iget-object v5, p0, Ll/֨᩷;->ۗ:Ll/ۡۢ;

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v5

    if-ne v5, p0, :cond_2

    .line 277
    iget-object v5, p0, Ll/֨᩷;->ۗ:Ll/ۡۢ;

    invoke-static {v5, p2, v4}, Ll/֨᩷;->֫(Landroid/view/View;II)I

    move-result p2

    .line 281
    :cond_2
    iget-object v5, p0, Ll/᩹᩷;->ᩳ֫:Landroid/widget/LinearLayout;

    const/4 v6, 0x0

    if-eqz v5, :cond_7

    iget-object v7, p0, Ll/᩹᩷;->ܰ:Landroid/view/View;

    if-nez v7, :cond_7

    .line 282
    iget-boolean v7, p0, Ll/᩹᩷;->ܿ֫:Z

    if-eqz v7, :cond_6

    .line 283
    invoke-static {v6, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    .line 284
    iget-object v7, p0, Ll/᩹᩷;->ᩳ֫:Landroid/widget/LinearLayout;

    invoke-virtual {v7, v5, v4}, Landroid/view/View;->measure(II)V

    .line 285
    iget-object v4, p0, Ll/᩹᩷;->ᩳ֫:Landroid/widget/LinearLayout;

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    if-gt v4, p2, :cond_3

    const/4 v5, 0x1

    goto :goto_1

    :cond_3
    const/4 v5, 0x0

    :goto_1
    if-eqz v5, :cond_4

    sub-int/2addr p2, v4

    .line 290
    :cond_4
    iget-object v4, p0, Ll/᩹᩷;->ᩳ֫:Landroid/widget/LinearLayout;

    if-eqz v5, :cond_5

    const/4 v5, 0x0

    goto :goto_2

    :cond_5
    const/16 v5, 0x8

    :goto_2
    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    goto :goto_3

    .line 292
    :cond_6
    invoke-static {v5, p2, v4}, Ll/֨᩷;->֫(Landroid/view/View;II)I

    move-result p2

    .line 296
    :cond_7
    :goto_3
    iget-object v4, p0, Ll/᩹᩷;->ܰ:Landroid/view/View;

    if-eqz v4, :cond_c

    .line 297
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    .line 298
    iget v5, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    const/4 v7, -0x2

    if-eq v5, v7, :cond_8

    const/high16 v8, 0x40000000    # 2.0f

    goto :goto_4

    :cond_8
    const/high16 v8, -0x80000000

    :goto_4
    if-ltz v5, :cond_9

    .line 301
    invoke-static {v5, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 302
    :cond_9
    iget v4, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-eq v4, v7, :cond_a

    goto :goto_5

    :cond_a
    const/high16 v1, -0x80000000

    :goto_5
    if-ltz v4, :cond_b

    .line 305
    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 306
    :cond_b
    iget-object v4, p0, Ll/᩹᩷;->ܰ:Landroid/view/View;

    invoke-static {p2, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 307
    invoke-static {v3, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 306
    invoke-virtual {v4, p2, v1}, Landroid/view/View;->measure(II)V

    .line 310
    :cond_c
    iget p2, p0, Ll/֨᩷;->᩹:I

    if-gtz p2, :cond_f

    .line 312
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    const/4 v0, 0x0

    :goto_6
    if-ge v6, p2, :cond_e

    .line 314
    invoke-virtual {p0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 315
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    add-int/2addr v1, v2

    if-le v1, v0, :cond_d

    move v0, v1

    :cond_d
    add-int/lit8 v6, v6, 0x1

    goto :goto_6

    .line 320
    :cond_e
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void

    .line 322
    :cond_f
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void

    .line 256
    :cond_10
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    const-string v0, " can only be used with android:layout_height=\"wrap_content\""

    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 250
    :cond_11
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    const-string v0, " can only be used with android:layout_width=\"match_parent\" (or fill_parent)"

    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final shouldDelayChildPressedState()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ֫(IJ)Ll/ܶ᩺;
    .locals 3

    .line 160
    iget-object v0, p0, Ll/֨᩷;->ۤ:Ll/ܶ᩺;

    if-eqz v0, :cond_0

    .line 161
    invoke-virtual {v0}, Ll/ܶ᩺;->֫()V

    .line 164
    :cond_0
    iget-object v0, p0, Ll/֨᩷;->۫:Ll/ۚ᩷;

    const/4 v1, 0x0

    if-nez p1, :cond_2

    .line 165
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-eqz v2, :cond_1

    .line 166
    invoke-virtual {p0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 168
    :cond_1
    invoke-static {p0}, Ll/ܿ᩺;->֫(Landroid/view/View;)Ll/ܶ᩺;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v1, v2}, Ll/ܶ᩺;->֫(F)V

    .line 169
    invoke-virtual {v1, p2, p3}, Ll/ܶ᩺;->֫(J)V

    .line 281
    iget-object p2, v0, Ll/ۚ᩷;->ܽ:Ll/֨᩷;

    iput-object v1, p2, Ll/֨᩷;->ۤ:Ll/ܶ᩺;

    .line 282
    iput p1, v0, Ll/ۚ᩷;->ۧ:I

    .line 170
    invoke-virtual {v1, v0}, Ll/ܶ᩺;->֫(Ll/᩸᩺;)V

    return-object v1

    .line 173
    :cond_2
    invoke-static {p0}, Ll/ܿ᩺;->֫(Landroid/view/View;)Ll/ܶ᩺;

    move-result-object v2

    invoke-virtual {v2, v1}, Ll/ܶ᩺;->֫(F)V

    .line 174
    invoke-virtual {v2, p2, p3}, Ll/ܶ᩺;->֫(J)V

    .line 281
    iget-object p2, v0, Ll/ۚ᩷;->ܽ:Ll/֨᩷;

    iput-object v2, p2, Ll/֨᩷;->ۤ:Ll/ܶ᩺;

    .line 282
    iput p1, v0, Ll/ۚ᩷;->ۧ:I

    .line 175
    invoke-virtual {v2, v0}, Ll/ܶ᩺;->֫(Ll/᩸᩺;)V

    return-object v2
.end method

.method public final ֫()V
    .locals 1

    .line 194
    iget-object v0, p0, Ll/᩹᩷;->ۛ:Landroid/view/View;

    if-nez v0, :cond_0

    .line 195
    invoke-virtual {p0}, Ll/᩹᩷;->ܿ()V

    :cond_0
    return-void
.end method

.method public final ֫(I)V
    .locals 0

    .line 97
    iput p1, p0, Ll/֨᩷;->᩹:I

    return-void
.end method

.method public final ֫(Landroid/view/View;)V
    .locals 1

    .line 101
    iget-object v0, p0, Ll/᩹᩷;->ܰ:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 102
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 104
    :cond_0
    iput-object p1, p0, Ll/᩹᩷;->ܰ:Landroid/view/View;

    if-eqz p1, :cond_1

    .line 105
    iget-object v0, p0, Ll/᩹᩷;->ᩳ֫:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    .line 106
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    const/4 v0, 0x0

    .line 107
    iput-object v0, p0, Ll/᩹᩷;->ᩳ֫:Landroid/widget/LinearLayout;

    :cond_1
    if-eqz p1, :cond_2

    .line 110
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 112
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public final ֫(Ljava/lang/CharSequence;)V
    .locals 0

    .line 122
    iput-object p1, p0, Ll/᩹᩷;->۟:Ljava/lang/CharSequence;

    .line 123
    invoke-direct {p0}, Ll/᩹᩷;->᩻()V

    return-void
.end method

.method public final ֫(Ll/ۗ᩻;)V
    .locals 3

    .line 162
    iget-object v0, p0, Ll/᩹᩷;->ۛ:Landroid/view/View;

    if-nez v0, :cond_0

    .line 163
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 164
    iget v1, p0, Ll/᩹᩷;->᩺:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Ll/᩹᩷;->ۛ:Landroid/view/View;

    .line 165
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_0

    .line 166
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_1

    .line 167
    iget-object v0, p0, Ll/᩹᩷;->ۛ:Landroid/view/View;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 170
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/᩹᩷;->ۛ:Landroid/view/View;

    const v1, 0x7f0a0051

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Ll/᩹᩷;->ۨ:Landroid/view/View;

    .line 171
    new-instance v1, Ll/᩸᩷;

    invoke-direct {v1, p1}, Ll/᩸᩷;-><init>(Ll/ۗ᩻;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 178
    invoke-virtual {p1}, Ll/ۗ᩻;->ܽ()Ll/ۗۜ;

    move-result-object p1

    .line 179
    iget-object v0, p0, Ll/֨᩷;->᩸:Ll/ܿۢ;

    if-eqz v0, :cond_2

    .line 373
    invoke-virtual {v0}, Ll/ܿۢ;->ܽ()Z

    .line 384
    iget-object v0, v0, Ll/ܿۢ;->᩺:Ll/ۛ᩷;

    if-eqz v0, :cond_2

    .line 385
    invoke-virtual {v0}, Ll/ᩳ᩷;->֫()V

    .line 182
    :cond_2
    new-instance v0, Ll/ܿۢ;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ܿۢ;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Ll/֨᩷;->᩸:Ll/ܿۢ;

    .line 183
    invoke-virtual {v0}, Ll/ܿۢ;->᩻()V

    .line 185
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x1

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 187
    iget-object v1, p0, Ll/֨᩷;->᩸:Ll/ܿۢ;

    iget-object v2, p0, Ll/֨᩷;->۬:Landroid/content/Context;

    invoke-virtual {p1, v1, v2}, Ll/ۗۜ;->addMenuPresenter(Ll/ܳ᩷;Landroid/content/Context;)V

    .line 188
    iget-object p1, p0, Ll/֨᩷;->᩸:Ll/ܿۢ;

    invoke-virtual {p1, p0}, Ll/ܿۢ;->֫(Landroid/view/ViewGroup;)Ll/ۜ᩷;

    move-result-object p1

    check-cast p1, Ll/ۡۢ;

    iput-object p1, p0, Ll/֨᩷;->ۗ:Ll/ۡۢ;

    const/4 v1, 0x0

    .line 189
    invoke-virtual {p1, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 190
    iget-object p1, p0, Ll/֨᩷;->ۗ:Ll/ۡۢ;

    invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 363
    iget-boolean v0, p0, Ll/᩹᩷;->ܿ֫:Z

    if-eq p1, v0, :cond_0

    .line 364
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 366
    :cond_0
    iput-boolean p1, p0, Ll/᩹᩷;->ܿ֫:Z

    return-void
.end method

.method public final ۧ()Ljava/lang/CharSequence;
    .locals 1

    .line 131
    iget-object v0, p0, Ll/᩹᩷;->۟:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final ۧ(Ljava/lang/CharSequence;)V
    .locals 0

    .line 116
    iput-object p1, p0, Ll/᩹᩷;->ܽ֫:Ljava/lang/CharSequence;

    .line 117
    invoke-direct {p0}, Ll/᩹᩷;->᩻()V

    .line 118
    invoke-static {p0, p1}, Ll/ܿ᩺;->֫(Landroid/view/View;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ܳ()V
    .locals 1

    .line 212
    iget-object v0, p0, Ll/֨᩷;->᩸:Ll/ܿۢ;

    if-eqz v0, :cond_0

    .line 213
    invoke-virtual {v0}, Ll/ܿۢ;->ۜ()Z

    :cond_0
    return-void
.end method

.method public final ܽ()Ljava/lang/CharSequence;
    .locals 1

    .line 127
    iget-object v0, p0, Ll/᩹᩷;->ܽ֫:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final ܿ()V
    .locals 2

    .line 201
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    const/4 v0, 0x0

    .line 202
    iput-object v0, p0, Ll/᩹᩷;->ܰ:Landroid/view/View;

    .line 203
    iput-object v0, p0, Ll/֨᩷;->ۗ:Ll/ۡۢ;

    .line 204
    iput-object v0, p0, Ll/֨᩷;->᩸:Ll/ܿۢ;

    .line 205
    iget-object v1, p0, Ll/᩹᩷;->ۨ:Landroid/view/View;

    if-eqz v1, :cond_0

    .line 206
    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-void
.end method

.method public final ᩳ()Z
    .locals 1

    .line 370
    iget-boolean v0, p0, Ll/᩹᩷;->ܿ֫:Z

    return v0
.end method
