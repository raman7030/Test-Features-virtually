.class public Ll/۠᩸;
.super Landroid/view/View;
.source "31IJ"


# instance fields
.field public ᩶:I

.field public ᩸:Landroid/view/View;

.field public ᩹:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 55
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, -0x1

    .line 45
    iput p1, p0, Ll/۠᩸;->᩹:I

    const/4 p1, 0x0

    .line 46
    iput-object p1, p0, Ll/۠᩸;->᩸:Landroid/view/View;

    const/4 p1, 0x4

    .line 47
    iput p1, p0, Ll/۠᩸;->᩶:I

    .line 56
    invoke-direct {p0, p2}, Ll/۠᩸;->֫(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 60
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, -0x1

    .line 45
    iput p1, p0, Ll/۠᩸;->᩹:I

    const/4 p1, 0x0

    .line 46
    iput-object p1, p0, Ll/۠᩸;->᩸:Landroid/view/View;

    const/4 p1, 0x4

    .line 47
    iput p1, p0, Ll/۠᩸;->᩶:I

    .line 61
    invoke-direct {p0, p2}, Ll/۠᩸;->֫(Landroid/util/AttributeSet;)V

    return-void
.end method

.method private ֫(Landroid/util/AttributeSet;)V
    .locals 4

    .line 70
    iget v0, p0, Ll/۠᩸;->᩶:I

    invoke-super {p0, v0}, Landroid/view/View;->setVisibility(I)V

    const/4 v0, -0x1

    .line 71
    iput v0, p0, Ll/۠᩸;->᩹:I

    if-eqz p1, :cond_3

    .line 73
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Ll/᩸᩸;->ܽ:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 74
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 76
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    if-nez v2, :cond_0

    .line 78
    iget v3, p0, Ll/۠᩸;->᩹:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    iput v2, p0, Ll/۠᩸;->᩹:I

    goto :goto_1

    :cond_0
    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    .line 81
    iget v3, p0, Ll/۠᩸;->᩶:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Ll/۠᩸;->᩶:I

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 85
    :cond_2
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_3
    return-void
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 7

    .line 121
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0xdf

    .line 122
    invoke-virtual {p1, v0, v0, v0}, Landroid/graphics/Canvas;->drawRGB(III)V

    .line 123
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    const/16 v1, 0xff

    const/16 v2, 0xd2

    .line 124
    invoke-virtual {v0, v1, v2, v2, v2}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 125
    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 126
    sget-object v1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 128
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 129
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z

    .line 130
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 131
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v3

    .line 132
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v4

    .line 133
    sget-object v5, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    const/4 v5, 0x1

    const-string v6, "?"

    .line 135
    invoke-virtual {v0, v6, v2, v5, v1}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    int-to-float v2, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v2, v4

    .line 136
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v5, v4

    sub-float/2addr v2, v5

    iget v5, v1, Landroid/graphics/Rect;->left:I

    int-to-float v5, v5

    sub-float/2addr v2, v5

    int-to-float v3, v3

    div-float/2addr v3, v4

    .line 137
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v5, v4

    add-float/2addr v5, v3

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    int-to-float v1, v1

    sub-float/2addr v5, v1

    .line 138
    invoke-virtual {p1, v6, v2, v5, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_0
    return-void
.end method

.method public final ֫()Landroid/view/View;
    .locals 1

    .line 113
    iget-object v0, p0, Ll/۠᩸;->᩸:Landroid/view/View;

    return-object v0
.end method

.method public final ֫(Ll/ܿ᩸;)V
    .locals 2

    .line 147
    iget v0, p0, Ll/۠᩸;->᩹:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 148
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_0

    .line 149
    iget v0, p0, Ll/۠᩸;->᩶:I

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 153
    :cond_0
    iget v0, p0, Ll/۠᩸;->᩹:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Ll/۠᩸;->᩸:Landroid/view/View;

    if-eqz p1, :cond_1

    .line 156
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Ll/ܽ᩸;

    const/4 v0, 0x1

    .line 157
    iput-boolean v0, p1, Ll/ܽ᩸;->ۨ:Z

    .line 158
    iget-object p1, p0, Ll/۠᩸;->᩸:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 159
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method public final ۧ()V
    .locals 5

    .line 194
    iget-object v0, p0, Ll/۠᩸;->᩸:Landroid/view/View;

    if-nez v0, :cond_0

    return-void

    .line 197
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܽ᩸;

    .line 198
    iget-object v1, p0, Ll/۠᩸;->᩸:Landroid/view/View;

    .line 199
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Ll/ܽ᩸;

    .line 200
    iget-object v2, v1, Ll/ܽ᩸;->ۛ֫:Ll/ܶ۠;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ll/ܶ۠;->ᩴ(I)V

    .line 201
    iget-object v2, v0, Ll/ܽ᩸;->ۛ֫:Ll/ܶ۠;

    .line 1966
    iget-object v4, v2, Ll/ܶ۠;->ۛ:[Ll/۠۠;

    aget-object v3, v4, v3

    .line 201
    sget-object v4, Ll/۠۠;->᩹:Ll/۠۠;

    if-eq v3, v4, :cond_1

    .line 202
    iget-object v3, v1, Ll/ܽ᩸;->ۛ֫:Ll/ܶ۠;

    invoke-virtual {v3}, Ll/ܶ۠;->ܶ()I

    move-result v3

    invoke-virtual {v2, v3}, Ll/ܶ۠;->᩵(I)V

    .line 204
    :cond_1
    iget-object v0, v0, Ll/ܽ᩸;->ۛ֫:Ll/ܶ۠;

    .line 1975
    iget-object v2, v0, Ll/ܶ۠;->ۛ:[Ll/۠۠;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    if-eq v2, v4, :cond_2

    .line 205
    iget-object v2, v1, Ll/ܽ᩸;->ۛ֫:Ll/ܶ۠;

    invoke-virtual {v2}, Ll/ܶ۠;->ۜ()I

    move-result v2

    invoke-virtual {v0, v2}, Ll/ܶ۠;->ۜ(I)V

    .line 207
    :cond_2
    iget-object v0, v1, Ll/ܽ᩸;->ۛ֫:Ll/ܶ۠;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Ll/ܶ۠;->ᩴ(I)V

    return-void
.end method
