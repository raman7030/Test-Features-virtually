.class public Ll/ܳ᩵;
.super Landroid/widget/FrameLayout;
.source "B3YF"


# static fields
.field public static final COLOR_BACKGROUND_ATTR:[I

.field public static final IMPL:Ll/᩷᩵;


# instance fields
.field public final mCardViewDelegate:Ll/ۜ᩵;

.field public mCompatPadding:Z

.field public final mContentPadding:Landroid/graphics/Rect;

.field public mPreventCornerOverlap:Z

.field public final mShadowBounds:Landroid/graphics/Rect;

.field public mUserSetMinHeight:I

.field public mUserSetMinWidth:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const v0, 0x1010031

    .line 81
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Ll/ܳ᩵;->COLOR_BACKGROUND_ATTR:[I

    .line 86
    new-instance v0, Ll/᩻᩵;

    .line 26
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 86
    sput-object v0, Ll/ܳ᩵;->IMPL:Ll/᩷᩵;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 113
    invoke-direct {p0, p1, v0}, Ll/ܳ᩵;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f0400ae

    .line 117
    invoke-direct {p0, p1, p2, v0}, Ll/ܳ᩵;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 9

    .line 121
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 108
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/ܳ᩵;->mContentPadding:Landroid/graphics/Rect;

    .line 110
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Ll/ܳ᩵;->mShadowBounds:Landroid/graphics/Rect;

    .line 447
    new-instance v3, Ll/ܿ᩵;

    invoke-direct {v3, p0}, Ll/ܿ᩵;-><init>(Ll/ܳ᩵;)V

    iput-object v3, p0, Ll/ܳ᩵;->mCardViewDelegate:Ll/ۜ᩵;

    .line 123
    sget-object v1, Ll/ᩳ᩵;->֫:[I

    const v2, 0x7f130146

    invoke-virtual {p1, p2, v1, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    const/4 p3, 0x2

    .line 126
    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    const/4 v2, 0x3

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    .line 127
    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p3

    :goto_0
    move-object v5, p3

    goto :goto_2

    .line 130
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget-object v5, Ll/ܳ᩵;->COLOR_BACKGROUND_ATTR:[I

    invoke-virtual {v1, v5}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 131
    invoke-virtual {v1, v4, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v5

    .line 132
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    new-array v1, v2, [F

    .line 136
    invoke-static {v5, v1}, Landroid/graphics/Color;->colorToHSV(I[F)V

    .line 137
    aget p3, v1, p3

    const/high16 v1, 0x3f000000    # 0.5f

    cmpl-float p3, p3, v1

    if-lez p3, :cond_1

    .line 138
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const v1, 0x7f060044

    invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p3

    goto :goto_1

    .line 139
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const v1, 0x7f060043

    invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p3

    .line 137
    :goto_1
    invoke-static {p3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p3

    goto :goto_0

    :goto_2
    const/4 p3, 0x0

    .line 141
    invoke-virtual {p2, v2, p3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v6

    const/4 v1, 0x4

    .line 142
    invoke-virtual {p2, v1, p3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v7

    const/4 v1, 0x5

    .line 143
    invoke-virtual {p2, v1, p3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p3

    const/4 v1, 0x7

    .line 144
    invoke-virtual {p2, v1, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Ll/ܳ᩵;->mCompatPadding:Z

    const/4 v1, 0x6

    const/4 v2, 0x1

    .line 145
    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Ll/ܳ᩵;->mPreventCornerOverlap:Z

    const/16 v1, 0x8

    .line 146
    invoke-virtual {p2, v1, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    const/16 v8, 0xa

    .line 147
    invoke-virtual {p2, v8, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v8

    iput v8, v0, Landroid/graphics/Rect;->left:I

    const/16 v8, 0xc

    .line 149
    invoke-virtual {p2, v8, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v8

    iput v8, v0, Landroid/graphics/Rect;->top:I

    const/16 v8, 0xb

    .line 151
    invoke-virtual {p2, v8, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v8

    iput v8, v0, Landroid/graphics/Rect;->right:I

    const/16 v8, 0x9

    .line 153
    invoke-virtual {p2, v8, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    cmpl-float v0, v7, p3

    if-lez v0, :cond_2

    move v8, v7

    goto :goto_3

    :cond_2
    move v8, p3

    .line 158
    :goto_3
    invoke-virtual {p2, v4, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Ll/ܳ᩵;->mUserSetMinWidth:I

    .line 159
    invoke-virtual {p2, v2, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Ll/ܳ᩵;->mUserSetMinHeight:I

    .line 160
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 162
    sget-object v2, Ll/ܳ᩵;->IMPL:Ll/᩷᩵;

    move-object v4, p1

    invoke-interface/range {v2 .. v8}, Ll/᩷᩵;->֫(Ll/ܿ᩵;Landroid/content/Context;Landroid/content/res/ColorStateList;FFF)V

    return-void
.end method

.method public static synthetic ֫(Ll/ܳ᩵;I)V
    .locals 0

    .line 79
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setMinimumWidth(I)V

    return-void
.end method

.method public static synthetic ֫(Ll/ܳ᩵;IIII)V
    .locals 0

    .line 79
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->setPadding(IIII)V

    return-void
.end method

.method public static synthetic ۧ(Ll/ܳ᩵;I)V
    .locals 0

    .line 79
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setMinimumHeight(I)V

    return-void
.end method


# virtual methods
.method public getCardBackgroundColor()Landroid/content/res/ColorStateList;
    .locals 2

    .line 303
    sget-object v0, Ll/ܳ᩵;->IMPL:Ll/᩷᩵;

    iget-object v1, p0, Ll/ܳ᩵;->mCardViewDelegate:Ll/ۜ᩵;

    invoke-interface {v0, v1}, Ll/᩷᩵;->ܽ(Ll/ۜ᩵;)Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getCardElevation()F
    .locals 2

    .line 387
    sget-object v0, Ll/ܳ᩵;->IMPL:Ll/᩷᩵;

    iget-object v1, p0, Ll/ܳ᩵;->mCardViewDelegate:Ll/ۜ᩵;

    invoke-interface {v0, v1}, Ll/᩷᩵;->ܳ(Ll/ۜ᩵;)F

    move-result v0

    return v0
.end method

.method public getContentPaddingBottom()I
    .locals 1

    .line 343
    iget-object v0, p0, Ll/ܳ᩵;->mContentPadding:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    return v0
.end method

.method public getContentPaddingLeft()I
    .locals 1

    .line 313
    iget-object v0, p0, Ll/ܳ᩵;->mContentPadding:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    return v0
.end method

.method public getContentPaddingRight()I
    .locals 1

    .line 323
    iget-object v0, p0, Ll/ܳ᩵;->mContentPadding:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->right:I

    return v0
.end method

.method public getContentPaddingTop()I
    .locals 1

    .line 333
    iget-object v0, p0, Ll/ܳ᩵;->mContentPadding:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->top:I

    return v0
.end method

.method public getMaxCardElevation()F
    .locals 2

    .line 413
    sget-object v0, Ll/ܳ᩵;->IMPL:Ll/᩷᩵;

    iget-object v1, p0, Ll/ܳ᩵;->mCardViewDelegate:Ll/ۜ᩵;

    invoke-interface {v0, v1}, Ll/᩷᩵;->ۧ(Ll/ۜ᩵;)F

    move-result v0

    return v0
.end method

.method public getPreventCornerOverlap()Z
    .locals 1

    .line 424
    iget-boolean v0, p0, Ll/ܳ᩵;->mPreventCornerOverlap:Z

    return v0
.end method

.method public getRadius()F
    .locals 2

    .line 364
    sget-object v0, Ll/ܳ᩵;->IMPL:Ll/᩷᩵;

    iget-object v1, p0, Ll/ܳ᩵;->mCardViewDelegate:Ll/ۜ᩵;

    invoke-interface {v0, v1}, Ll/᩷᩵;->֫(Ll/ۜ᩵;)F

    move-result v0

    return v0
.end method

.method public getUseCompatPadding()Z
    .locals 1

    .line 183
    iget-boolean v0, p0, Ll/ܳ᩵;->mCompatPadding:Z

    return v0
.end method

.method public onMeasure(II)V
    .locals 6

    .line 232
    sget-object v0, Ll/ܳ᩵;->IMPL:Ll/᩷᩵;

    instance-of v1, v0, Ll/᩻᩵;

    if-nez v1, :cond_2

    .line 233
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    const/high16 v3, -0x80000000

    if-eq v1, v3, :cond_0

    if-eq v1, v2, :cond_0

    goto :goto_0

    .line 237
    :cond_0
    iget-object v4, p0, Ll/ܳ᩵;->mCardViewDelegate:Ll/ۜ᩵;

    invoke-interface {v0, v4}, Ll/᩷᩵;->᩷(Ll/ۜ᩵;)F

    move-result v4

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v4, v4

    .line 239
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 238
    invoke-static {v4, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    .line 246
    :goto_0
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    if-eq v1, v3, :cond_1

    if-eq v1, v2, :cond_1

    goto :goto_1

    .line 250
    :cond_1
    iget-object v2, p0, Ll/ܳ᩵;->mCardViewDelegate:Ll/ۜ᩵;

    invoke-interface {v0, v2}, Ll/᩷᩵;->ᩳ(Ll/ۜ᩵;)F

    move-result v0

    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v0, v2

    .line 252
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    .line 251
    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-static {p2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 258
    :goto_1
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    return-void

    .line 260
    :cond_2
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    return-void
.end method

.method public setCardBackgroundColor(I)V
    .locals 2

    .line 283
    sget-object v0, Ll/ܳ᩵;->IMPL:Ll/᩷᩵;

    iget-object v1, p0, Ll/ܳ᩵;->mCardViewDelegate:Ll/ۜ᩵;

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ll/᩷᩵;->֫(Ll/ۜ᩵;Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setCardBackgroundColor(Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 293
    sget-object v0, Ll/ܳ᩵;->IMPL:Ll/᩷᩵;

    iget-object v1, p0, Ll/ܳ᩵;->mCardViewDelegate:Ll/ۜ᩵;

    invoke-interface {v0, v1, p1}, Ll/᩷᩵;->֫(Ll/ۜ᩵;Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setCardElevation(F)V
    .locals 2

    .line 376
    sget-object v0, Ll/ܳ᩵;->IMPL:Ll/᩷᩵;

    iget-object v1, p0, Ll/ܳ᩵;->mCardViewDelegate:Ll/ۜ᩵;

    invoke-interface {v0, v1, p1}, Ll/᩷᩵;->ۧ(Ll/ۜ᩵;F)V

    return-void
.end method

.method public setContentPadding(IIII)V
    .locals 1

    .line 226
    iget-object v0, p0, Ll/ܳ᩵;->mContentPadding:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    .line 227
    sget-object p1, Ll/ܳ᩵;->IMPL:Ll/᩷᩵;

    iget-object p2, p0, Ll/ܳ᩵;->mCardViewDelegate:Ll/ۜ᩵;

    invoke-interface {p1, p2}, Ll/᩷᩵;->ۜ(Ll/ۜ᩵;)V

    return-void
.end method

.method public setMaxCardElevation(F)V
    .locals 2

    .line 402
    sget-object v0, Ll/ܳ᩵;->IMPL:Ll/᩷᩵;

    iget-object v1, p0, Ll/ܳ᩵;->mCardViewDelegate:Ll/ۜ᩵;

    invoke-interface {v0, v1, p1}, Ll/᩷᩵;->ܽ(Ll/ۜ᩵;F)V

    return-void
.end method

.method public setMinimumHeight(I)V
    .locals 0

    .line 272
    iput p1, p0, Ll/ܳ᩵;->mUserSetMinHeight:I

    .line 273
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setMinimumHeight(I)V

    return-void
.end method

.method public setMinimumWidth(I)V
    .locals 0

    .line 266
    iput p1, p0, Ll/ܳ᩵;->mUserSetMinWidth:I

    .line 267
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setMinimumWidth(I)V

    return-void
.end method

.method public setPadding(IIII)V
    .locals 0

    return-void
.end method

.method public setPaddingRelative(IIII)V
    .locals 0

    return-void
.end method

.method public setPreventCornerOverlap(Z)V
    .locals 1

    .line 441
    iget-boolean v0, p0, Ll/ܳ᩵;->mPreventCornerOverlap:Z

    if-eq p1, v0, :cond_0

    .line 442
    iput-boolean p1, p0, Ll/ܳ᩵;->mPreventCornerOverlap:Z

    .line 443
    sget-object p1, Ll/ܳ᩵;->IMPL:Ll/᩷᩵;

    iget-object v0, p0, Ll/ܳ᩵;->mCardViewDelegate:Ll/ۜ᩵;

    invoke-interface {p1, v0}, Ll/᩷᩵;->ܿ(Ll/ۜ᩵;)V

    :cond_0
    return-void
.end method

.method public setRadius(F)V
    .locals 2

    .line 354
    sget-object v0, Ll/ܳ᩵;->IMPL:Ll/᩷᩵;

    iget-object v1, p0, Ll/ܳ᩵;->mCardViewDelegate:Ll/ۜ᩵;

    invoke-interface {v0, v1, p1}, Ll/᩷᩵;->֫(Ll/ۜ᩵;F)V

    return-void
.end method

.method public setUseCompatPadding(Z)V
    .locals 1

    .line 203
    iget-boolean v0, p0, Ll/ܳ᩵;->mCompatPadding:Z

    if-eq v0, p1, :cond_0

    .line 204
    iput-boolean p1, p0, Ll/ܳ᩵;->mCompatPadding:Z

    .line 205
    sget-object p1, Ll/ܳ᩵;->IMPL:Ll/᩷᩵;

    iget-object v0, p0, Ll/ܳ᩵;->mCardViewDelegate:Ll/ۜ᩵;

    invoke-interface {p1, v0}, Ll/᩷᩵;->᩻(Ll/ۜ᩵;)V

    :cond_0
    return-void
.end method
