.class public final Ll/ᩴۢᩳ;
.super Landroid/graphics/drawable/Drawable;
.source "N3Y7"


# instance fields
.field public ֫:I

.field public ۜ:J

.field public ۢ:Landroid/view/View;

.field public ۧ:F

.field public ܳ:I

.field public ܽ:Landroid/graphics/ColorFilter;

.field public ܿ:Landroid/graphics/drawable/Drawable;

.field public ᩳ:Landroid/graphics/drawable/Drawable;

.field public ᩷:I

.field public ᩻:I


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 3

    .line 41
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0802c7

    invoke-static {v0, v1}, Ll/᩸ۗۡ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f0802c6

    invoke-static {v1, v2}, Ll/᩸ۗۡ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    const/16 v2, 0xff

    .line 35
    iput v2, p0, Ll/ᩴۢᩳ;->֫:I

    const/high16 v2, 0x3f800000    # 1.0f

    .line 36
    iput v2, p0, Ll/ᩴۢᩳ;->ۧ:F

    const/4 v2, 0x0

    .line 37
    iput v2, p0, Ll/ᩴۢᩳ;->᩷:I

    .line 46
    iput-object p1, p0, Ll/ᩴۢᩳ;->ۢ:Landroid/view/View;

    .line 47
    iput-object v0, p0, Ll/ᩴۢᩳ;->ᩳ:Landroid/graphics/drawable/Drawable;

    .line 48
    iput-object v1, p0, Ll/ᩴۢᩳ;->ܿ:Landroid/graphics/drawable/Drawable;

    .line 49
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result p1

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    invoke-static {p1, v2}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Ll/ᩴۢᩳ;->᩻:I

    .line 50
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p1

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Ll/ᩴۢᩳ;->ܳ:I

    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 13

    const/high16 v0, 0x437f0000    # 255.0f

    .line 62
    iget v1, p0, Ll/ᩴۢᩳ;->ۧ:F

    mul-float v1, v1, v0

    float-to-int v0, v1

    const v2, 0x3ecccccd    # 0.4f

    mul-float v1, v1, v2

    float-to-int v1, v1

    .line 64
    iget v2, p0, Ll/ᩴۢᩳ;->᩷:I

    iget-object v3, p0, Ll/ᩴۢᩳ;->ܿ:Landroid/graphics/drawable/Drawable;

    iget-object v4, p0, Ll/ᩴۢᩳ;->ᩳ:Landroid/graphics/drawable/Drawable;

    const/4 v5, 0x0

    if-eqz v2, :cond_7

    const/high16 v6, 0x43480000    # 200.0f

    const/16 v7, 0xc8

    const/4 v8, 0x1

    if-eq v2, v8, :cond_4

    const/4 v8, 0x2

    if-eq v2, v8, :cond_3

    const/4 v9, 0x3

    if-eq v2, v9, :cond_0

    goto :goto_3

    .line 88
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    iget-wide v11, p0, Ll/ᩴۢᩳ;->ۜ:J

    sub-long/2addr v9, v11

    long-to-int v2, v9

    if-ltz v2, :cond_2

    if-lt v2, v7, :cond_1

    goto :goto_0

    :cond_1
    sub-int v5, v0, v1

    int-to-float v5, v5

    int-to-float v2, v2

    div-float/2addr v2, v6

    mul-float v2, v2, v5

    float-to-int v2, v2

    sub-int/2addr v0, v2

    .line 96
    invoke-virtual {v4, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    add-int/2addr v1, v2

    .line 97
    invoke-virtual {v3, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    goto :goto_1

    .line 90
    :cond_2
    :goto_0
    iput v8, p0, Ll/ᩴۢᩳ;->᩷:I

    .line 91
    invoke-virtual {v4, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 92
    invoke-virtual {v3, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    goto :goto_3

    .line 84
    :cond_3
    invoke-virtual {v4, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 85
    invoke-virtual {v3, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    goto :goto_3

    .line 70
    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    iget-wide v10, p0, Ll/ᩴۢᩳ;->ۜ:J

    sub-long/2addr v8, v10

    long-to-int v2, v8

    if-ltz v2, :cond_6

    if-lt v2, v7, :cond_5

    goto :goto_2

    :cond_5
    sub-int v5, v0, v1

    int-to-float v5, v5

    int-to-float v2, v2

    div-float/2addr v2, v6

    mul-float v2, v2, v5

    float-to-int v2, v2

    add-int/2addr v1, v2

    .line 78
    invoke-virtual {v4, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    sub-int/2addr v0, v2

    .line 79
    invoke-virtual {v3, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    :goto_1
    const/4 v5, 0x1

    goto :goto_3

    .line 72
    :cond_6
    :goto_2
    iput v5, p0, Ll/ᩴۢᩳ;->᩷:I

    .line 73
    invoke-virtual {v4, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 74
    invoke-virtual {v3, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    goto :goto_3

    .line 66
    :cond_7
    invoke-virtual {v4, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 67
    invoke-virtual {v3, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 102
    :goto_3
    invoke-virtual {v4, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 103
    invoke-virtual {v3, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    if-eqz v5, :cond_8

    .line 105
    iget-object p1, p0, Ll/ᩴۢᩳ;->ۢ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_8
    return-void
.end method

.method public final getAlpha()I
    .locals 1

    .line 137
    iget v0, p0, Ll/ᩴۢᩳ;->֫:I

    return v0
.end method

.method public final getColorFilter()Landroid/graphics/ColorFilter;
    .locals 1

    .line 150
    iget-object v0, p0, Ll/ᩴۢᩳ;->ܽ:Landroid/graphics/ColorFilter;

    return-object v0
.end method

.method public final getIntrinsicHeight()I
    .locals 1

    .line 165
    iget v0, p0, Ll/ᩴۢᩳ;->ܳ:I

    return v0
.end method

.method public final getIntrinsicWidth()I
    .locals 1

    .line 160
    iget v0, p0, Ll/ᩴۢᩳ;->᩻:I

    return v0
.end method

.method public final getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method public final onBoundsChange(Landroid/graphics/Rect;)V
    .locals 1

    .line 55
    iget-object v0, p0, Ll/ᩴۢᩳ;->ᩳ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 56
    iget-object v0, p0, Ll/ᩴۢᩳ;->ܿ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    return-void
.end method

.method public final setAlpha(I)V
    .locals 1

    .line 131
    iput p1, p0, Ll/ᩴۢᩳ;->֫:I

    int-to-float p1, p1

    const/high16 v0, 0x437f0000    # 255.0f

    div-float/2addr p1, v0

    .line 132
    iput p1, p0, Ll/ᩴۢᩳ;->ۧ:F

    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 142
    iput-object p1, p0, Ll/ᩴۢᩳ;->ܽ:Landroid/graphics/ColorFilter;

    .line 143
    iget-object v0, p0, Ll/ᩴۢᩳ;->ᩳ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 144
    iget-object v0, p0, Ll/ᩴۢᩳ;->ܿ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 2

    if-eqz p1, :cond_1

    .line 110
    iget p1, p0, Ll/ᩴۢᩳ;->᩷:I

    if-eqz p1, :cond_3

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_1

    .line 112
    :cond_0
    iput v0, p0, Ll/ᩴۢᩳ;->᩷:I

    goto :goto_0

    .line 114
    :cond_1
    iget p1, p0, Ll/ᩴۢᩳ;->᩷:I

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    goto :goto_1

    .line 116
    :cond_2
    iput v0, p0, Ll/ᩴۢᩳ;->᩷:I

    .line 118
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ᩴۢᩳ;->ۜ:J

    .line 119
    iget-object p1, p0, Ll/ᩴۢᩳ;->ۢ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_3
    :goto_1
    return-void
.end method
