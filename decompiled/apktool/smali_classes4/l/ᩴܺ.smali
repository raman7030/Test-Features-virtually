.class public Ll/ᩴܺ;
.super Landroid/widget/FrameLayout;
.source "N518"


# instance fields
.field public ۗ:Landroid/util/TypedValue;

.field public ۙ:Landroid/util/TypedValue;

.field public ۤ:Landroid/util/TypedValue;

.field public ۫:Landroid/util/TypedValue;

.field public ۬:Landroid/util/TypedValue;

.field public ᩶:Landroid/util/TypedValue;

.field public ᩸:Ll/ۘܺ;

.field public final ᩹:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 62
    invoke-direct {p0, p1, p2, v0}, Ll/ᩴܺ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 67
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 68
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Ll/ᩴܺ;->᩹:Landroid/graphics/Rect;

    return-void
.end method


# virtual methods
.method public final onAttachedToWindow()V
    .locals 1

    .line 204
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    .line 205
    iget-object v0, p0, Ll/ᩴܺ;->᩸:Ll/ۘܺ;

    if-eqz v0, :cond_0

    .line 206
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 212
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    .line 213
    iget-object v0, p0, Ll/ᩴܺ;->᩸:Ll/ۘܺ;

    if-eqz v0, :cond_0

    .line 214
    invoke-interface {v0}, Ll/ۘܺ;->onDetachedFromWindow()V

    :cond_0
    return-void
.end method

.method public final onMeasure(II)V
    .locals 13

    .line 97
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 98
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v2, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    const/4 v3, 0x1

    if-ge v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 100
    :goto_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    .line 101
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v4

    .line 104
    iget-object v5, p0, Ll/ᩴܺ;->᩹:Landroid/graphics/Rect;

    const/4 v6, 0x6

    const/4 v7, 0x5

    const/high16 v8, -0x80000000

    const/high16 v9, 0x40000000    # 2.0f

    if-ne v2, v8, :cond_4

    if-eqz v1, :cond_1

    .line 105
    iget-object v10, p0, Ll/ᩴܺ;->۬:Landroid/util/TypedValue;

    goto :goto_1

    :cond_1
    iget-object v10, p0, Ll/ᩴܺ;->ۗ:Landroid/util/TypedValue;

    :goto_1
    if-eqz v10, :cond_4

    .line 106
    iget v11, v10, Landroid/util/TypedValue;->type:I

    if-eqz v11, :cond_4

    if-ne v11, v7, :cond_2

    .line 109
    invoke-virtual {v10, v0}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F

    move-result v10

    goto :goto_2

    :cond_2
    if-ne v11, v6, :cond_3

    .line 111
    iget v11, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v12, v11

    int-to-float v11, v11

    invoke-virtual {v10, v12, v11}, Landroid/util/TypedValue;->getFraction(FF)F

    move-result v10

    :goto_2
    float-to-int v10, v10

    goto :goto_3

    :cond_3
    const/4 v10, 0x0

    :goto_3
    if-lez v10, :cond_4

    .line 114
    iget v11, v5, Landroid/graphics/Rect;->left:I

    iget v12, v5, Landroid/graphics/Rect;->right:I

    add-int/2addr v11, v12

    sub-int/2addr v10, v11

    .line 115
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 117
    invoke-static {v10, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 116
    invoke-static {p1, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    const/4 v10, 0x1

    goto :goto_4

    :cond_4
    const/4 v10, 0x0

    :goto_4
    if-ne v4, v8, :cond_8

    if-eqz v1, :cond_5

    .line 124
    iget-object v4, p0, Ll/ᩴܺ;->᩶:Landroid/util/TypedValue;

    goto :goto_5

    :cond_5
    iget-object v4, p0, Ll/ᩴܺ;->ۙ:Landroid/util/TypedValue;

    :goto_5
    if-eqz v4, :cond_8

    .line 125
    iget v11, v4, Landroid/util/TypedValue;->type:I

    if-eqz v11, :cond_8

    if-ne v11, v7, :cond_6

    .line 128
    invoke-virtual {v4, v0}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F

    move-result v4

    goto :goto_6

    :cond_6
    if-ne v11, v6, :cond_7

    .line 130
    iget v11, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-float v12, v11

    int-to-float v11, v11

    invoke-virtual {v4, v12, v11}, Landroid/util/TypedValue;->getFraction(FF)F

    move-result v4

    :goto_6
    float-to-int v4, v4

    goto :goto_7

    :cond_7
    const/4 v4, 0x0

    :goto_7
    if-lez v4, :cond_8

    .line 133
    iget v11, v5, Landroid/graphics/Rect;->top:I

    iget v12, v5, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v11, v12

    sub-int/2addr v4, v11

    .line 134
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    .line 136
    invoke-static {v4, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 135
    invoke-static {p2, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 141
    :cond_8
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 143
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    .line 146
    invoke-static {p1, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    if-nez v10, :cond_d

    if-ne v2, v8, :cond_d

    if-eqz v1, :cond_9

    .line 149
    iget-object v1, p0, Ll/ᩴܺ;->ۤ:Landroid/util/TypedValue;

    goto :goto_8

    :cond_9
    iget-object v1, p0, Ll/ᩴܺ;->۫:Landroid/util/TypedValue;

    :goto_8
    if-eqz v1, :cond_d

    .line 150
    iget v2, v1, Landroid/util/TypedValue;->type:I

    if-eqz v2, :cond_d

    if-ne v2, v7, :cond_a

    .line 153
    invoke-virtual {v1, v0}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F

    move-result v0

    goto :goto_9

    :cond_a
    if-ne v2, v6, :cond_b

    .line 155
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v2, v0

    int-to-float v0, v0

    invoke-virtual {v1, v2, v0}, Landroid/util/TypedValue;->getFraction(FF)F

    move-result v0

    :goto_9
    float-to-int v0, v0

    goto :goto_a

    :cond_b
    const/4 v0, 0x0

    :goto_a
    if-lez v0, :cond_c

    .line 158
    iget v1, v5, Landroid/graphics/Rect;->left:I

    iget v2, v5, Landroid/graphics/Rect;->right:I

    add-int/2addr v1, v2

    sub-int/2addr v0, v1

    :cond_c
    if-ge p1, v0, :cond_d

    .line 161
    invoke-static {v0, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    goto :goto_b

    :cond_d
    const/4 v3, 0x0

    :goto_b
    if-eqz v3, :cond_e

    .line 168
    invoke-super {p0, v4, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    :cond_e
    return-void
.end method

.method public final ֫()Landroid/util/TypedValue;
    .locals 1

    .line 193
    iget-object v0, p0, Ll/ᩴܺ;->᩶:Landroid/util/TypedValue;

    if-nez v0, :cond_0

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iput-object v0, p0, Ll/ᩴܺ;->᩶:Landroid/util/TypedValue;

    .line 194
    :cond_0
    iget-object v0, p0, Ll/ᩴܺ;->᩶:Landroid/util/TypedValue;

    return-object v0
.end method

.method public final ֫(IIII)V
    .locals 1

    .line 89
    iget-object v0, p0, Ll/ᩴܺ;->᩹:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    .line 90
    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 91
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۘܺ;)V
    .locals 0

    .line 79
    iput-object p1, p0, Ll/ᩴܺ;->᩸:Ll/ۘܺ;

    return-void
.end method

.method public final ۧ()Landroid/util/TypedValue;
    .locals 1

    .line 198
    iget-object v0, p0, Ll/ᩴܺ;->ۙ:Landroid/util/TypedValue;

    if-nez v0, :cond_0

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iput-object v0, p0, Ll/ᩴܺ;->ۙ:Landroid/util/TypedValue;

    .line 199
    :cond_0
    iget-object v0, p0, Ll/ᩴܺ;->ۙ:Landroid/util/TypedValue;

    return-object v0
.end method

.method public final ܳ()Landroid/util/TypedValue;
    .locals 1

    .line 178
    iget-object v0, p0, Ll/ᩴܺ;->ۤ:Landroid/util/TypedValue;

    if-nez v0, :cond_0

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iput-object v0, p0, Ll/ᩴܺ;->ۤ:Landroid/util/TypedValue;

    .line 179
    :cond_0
    iget-object v0, p0, Ll/ᩴܺ;->ۤ:Landroid/util/TypedValue;

    return-object v0
.end method

.method public final ܽ()Landroid/util/TypedValue;
    .locals 1

    .line 183
    iget-object v0, p0, Ll/ᩴܺ;->ۗ:Landroid/util/TypedValue;

    if-nez v0, :cond_0

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iput-object v0, p0, Ll/ᩴܺ;->ۗ:Landroid/util/TypedValue;

    .line 184
    :cond_0
    iget-object v0, p0, Ll/ᩴܺ;->ۗ:Landroid/util/TypedValue;

    return-object v0
.end method

.method public final ܿ()Landroid/util/TypedValue;
    .locals 1

    .line 173
    iget-object v0, p0, Ll/ᩴܺ;->۫:Landroid/util/TypedValue;

    if-nez v0, :cond_0

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iput-object v0, p0, Ll/ᩴܺ;->۫:Landroid/util/TypedValue;

    .line 174
    :cond_0
    iget-object v0, p0, Ll/ᩴܺ;->۫:Landroid/util/TypedValue;

    return-object v0
.end method

.method public final ᩳ()Landroid/util/TypedValue;
    .locals 1

    .line 188
    iget-object v0, p0, Ll/ᩴܺ;->۬:Landroid/util/TypedValue;

    if-nez v0, :cond_0

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iput-object v0, p0, Ll/ᩴܺ;->۬:Landroid/util/TypedValue;

    .line 189
    :cond_0
    iget-object v0, p0, Ll/ᩴܺ;->۬:Landroid/util/TypedValue;

    return-object v0
.end method
