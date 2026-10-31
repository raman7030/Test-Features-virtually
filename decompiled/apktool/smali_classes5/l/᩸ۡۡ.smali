.class public final Ll/᩸ۡۡ;
.super Ll/֡᩻;
.source "H7TS"


# instance fields
.field public ᩶:Landroid/graphics/Rect;

.field public ᩸:I

.field public ᩹:F


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;I)V
    .locals 0

    .line 99
    invoke-direct {p0, p1}, Ll/֡᩻;-><init>(Landroid/graphics/drawable/Drawable;)V

    const/high16 p1, 0x3f800000    # 1.0f

    .line 95
    iput p1, p0, Ll/᩸ۡۡ;->᩹:F

    .line 96
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Ll/᩸ۡۡ;->᩶:Landroid/graphics/Rect;

    .line 100
    iput p2, p0, Ll/᩸ۡۡ;->᩸:I

    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 7

    .line 105
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    .line 106
    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 115
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v1

    .line 116
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v2

    .line 120
    iget v3, p0, Ll/᩸ۡۡ;->᩸:I

    if-eqz v3, :cond_4

    const/4 v4, 0x1

    if-eq v3, v4, :cond_3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_2

    const/4 v1, 0x3

    if-eq v3, v1, :cond_1

    .line 158
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 159
    iget v2, v0, Landroid/graphics/Rect;->top:I

    .line 160
    iget v3, v0, Landroid/graphics/Rect;->right:I

    .line 161
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    goto :goto_1

    :cond_1
    int-to-float v1, v2

    .line 132
    iget v2, p0, Ll/᩸ۡۡ;->᩹:F

    mul-float v1, v1, v2

    float-to-int v1, v1

    .line 133
    iget v2, v0, Landroid/graphics/Rect;->left:I

    .line 134
    iget v3, v0, Landroid/graphics/Rect;->bottom:I

    sub-int v1, v3, v1

    .line 135
    iget v0, v0, Landroid/graphics/Rect;->right:I

    move v5, v3

    move v3, v0

    move v0, v5

    move v6, v2

    move v2, v1

    move v1, v6

    goto :goto_1

    :cond_2
    int-to-float v1, v1

    .line 150
    iget v2, p0, Ll/᩸ۡۡ;->᩹:F

    mul-float v1, v1, v2

    float-to-int v1, v1

    .line 151
    iget v3, v0, Landroid/graphics/Rect;->right:I

    sub-int v1, v3, v1

    .line 152
    iget v2, v0, Landroid/graphics/Rect;->top:I

    .line 154
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    goto :goto_1

    :cond_3
    int-to-float v1, v2

    .line 123
    iget v2, p0, Ll/᩸ۡۡ;->᩹:F

    mul-float v1, v1, v2

    float-to-int v1, v1

    .line 124
    iget v2, v0, Landroid/graphics/Rect;->left:I

    .line 125
    iget v3, v0, Landroid/graphics/Rect;->top:I

    .line 126
    iget v0, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr v1, v3

    move v5, v3

    move v3, v0

    move v0, v1

    goto :goto_0

    :cond_4
    int-to-float v1, v1

    .line 141
    iget v2, p0, Ll/᩸ۡۡ;->᩹:F

    mul-float v1, v1, v2

    float-to-int v1, v1

    .line 142
    iget v2, v0, Landroid/graphics/Rect;->left:I

    .line 143
    iget v3, v0, Landroid/graphics/Rect;->top:I

    add-int/2addr v1, v2

    .line 145
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    move v5, v3

    move v3, v1

    :goto_0
    move v1, v2

    move v2, v5

    .line 165
    :goto_1
    iget-object v4, p0, Ll/᩸ۡۡ;->᩶:Landroid/graphics/Rect;

    invoke-virtual {v4, v1, v2, v3, v0}, Landroid/graphics/Rect;->set(IIII)V

    .line 110
    invoke-virtual {p0}, Ll/֡᩻;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, v4}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 111
    invoke-super {p0, p1}, Ll/֡᩻;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public final ֫(F)V
    .locals 1

    const/4 v0, 0x0

    .line 169
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    .line 170
    iget v0, p0, Ll/᩸ۡۡ;->᩹:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    .line 171
    iput p1, p0, Ll/᩸ۡۡ;->᩹:F

    .line 172
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_0
    return-void
.end method
