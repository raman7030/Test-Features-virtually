.class public final Ll/۫ۤᩳ;
.super Landroid/graphics/drawable/Drawable;
.source "R98O"


# instance fields
.field public ֫:Z

.field public final ۖ:I

.field public final ۜ:F

.field public final ۡ:Landroid/graphics/Rect;

.field public final ۢ:I

.field public final ۧ:I

.field public ܳ:Landroid/graphics/ColorFilter;

.field public final ܺ:Landroid/graphics/Paint;

.field public ܽ:I

.field public final ܿ:F

.field public final ᩳ:F

.field public final ᩷:I

.field public ᩻:I


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 6

    .line 562
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 545
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Ll/۫ۤᩳ;->ܺ:Landroid/graphics/Paint;

    const/16 v2, 0xff

    .line 556
    iput v2, p0, Ll/۫ۤᩳ;->ܽ:I

    .line 563
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    .line 564
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 566
    iput p2, p0, Ll/۫ۤᩳ;->ۖ:I

    .line 567
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    iput v3, p0, Ll/۫ۤᩳ;->ۜ:F

    const/high16 v4, 0x40000000    # 2.0f

    const/high16 v5, 0x3f000000    # 0.5f

    if-eqz p2, :cond_1

    if-ne p2, v1, :cond_0

    const v1, 0x7f060051

    .line 577
    invoke-static {p1, v1, v2}, Ll/ۙۗ;->֫(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)I

    move-result p1

    iput p1, p0, Ll/۫ۤᩳ;->ۢ:I

    const/4 p1, 0x0

    .line 578
    iput p1, p0, Ll/۫ۤᩳ;->᩷:I

    goto :goto_0

    .line 581
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_1
    const p1, 0x1010036

    .line 126
    invoke-static {v2, p1}, Ll/᩸֡᩷;->֫(Landroid/content/res/Resources$Theme;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    .line 573
    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result p1

    iput p1, p0, Ll/۫ۤᩳ;->ۢ:I

    mul-float p1, v3, v4

    add-float/2addr p1, v5

    float-to-int p1, p1

    .line 574
    iput p1, p0, Ll/۫ۤᩳ;->᩷:I

    .line 587
    :goto_0
    sget p1, Ll/᩹֡᩷;->֫:I

    iput p1, p0, Ll/۫ۤᩳ;->ۧ:I

    .line 590
    iget p1, p0, Ll/۫ۤᩳ;->ۢ:I

    iput p1, p0, Ll/۫ۤᩳ;->᩻:I

    const/high16 p1, 0x40800000    # 4.0f

    if-nez p2, :cond_2

    mul-float p1, p1, v3

    add-float/2addr p1, v5

    float-to-int p1, p1

    const/high16 p2, 0x41200000    # 10.0f

    mul-float v3, v3, p2

    add-float/2addr v3, v5

    float-to-int p2, v3

    .line 594
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1, p1, p2, p1, p2}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v1, p0, Ll/۫ۤᩳ;->ۡ:Landroid/graphics/Rect;

    .line 595
    sget-object p1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/4 p1, 0x0

    .line 596
    iput p1, p0, Ll/۫ۤᩳ;->ܿ:F

    .line 597
    iput p1, p0, Ll/۫ۤᩳ;->ᩳ:F

    return-void

    :cond_2
    const/high16 p2, 0x40a00000    # 5.0f

    mul-float p2, p2, v3

    add-float/2addr p2, v5

    float-to-int p2, p2

    .line 600
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1, p2, p2, p2, p2}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v1, p0, Ll/۫ۤᩳ;->ۡ:Landroid/graphics/Rect;

    .line 601
    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    mul-float v4, v4, v3

    .line 602
    iput v4, p0, Ll/۫ۤᩳ;->ܿ:F

    mul-float v3, v3, p1

    .line 603
    iput v3, p0, Ll/۫ۤᩳ;->ᩳ:F

    .line 604
    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۫ۤᩳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/۫ۤᩳ;->᩷:I

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/۫ۤᩳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/۫ۤᩳ;->ۖ:I

    return p0
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 10

    .line 610
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    .line 611
    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 614
    :cond_0
    iget v1, p0, Ll/۫ۤᩳ;->᩻:I

    iget v2, p0, Ll/۫ۤᩳ;->ܽ:I

    .line 677
    invoke-static {v1}, Landroid/graphics/Color;->alpha(I)I

    move-result v3

    mul-int v3, v3, v2

    .line 678
    div-int/lit16 v3, v3, 0xff

    const v2, 0xffffff

    and-int/2addr v1, v2

    shl-int/lit8 v2, v3, 0x18

    or-int/2addr v1, v2

    .line 614
    iget-object v9, p0, Ll/۫ۤᩳ;->ܺ:Landroid/graphics/Paint;

    invoke-virtual {v9, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 615
    iget-object v1, p0, Ll/۫ۤᩳ;->ܳ:Landroid/graphics/ColorFilter;

    invoke-virtual {v9, v1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 616
    iget v1, p0, Ll/۫ۤᩳ;->ۖ:I

    if-nez v1, :cond_2

    .line 617
    iget v1, v0, Landroid/graphics/Rect;->bottom:I

    int-to-float v1, v1

    iget v2, p0, Ll/۫ۤᩳ;->ۜ:F

    const/high16 v3, 0x40e00000    # 7.0f

    mul-float v3, v3, v2

    sub-float v4, v1, v3

    .line 618
    iget-boolean v1, p0, Ll/۫ۤᩳ;->֫:Z

    if-eqz v1, :cond_1

    const/high16 v1, 0x40000000    # 2.0f

    mul-float v2, v2, v1

    .line 619
    :cond_1
    iget v1, v0, Landroid/graphics/Rect;->left:I

    int-to-float v3, v1

    iget v0, v0, Landroid/graphics/Rect;->right:I

    int-to-float v5, v0

    add-float v6, v4, v2

    move-object v2, p1

    move-object v7, v9

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    return-void

    .line 621
    :cond_2
    iget v1, v0, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    iget v2, p0, Ll/۫ۤᩳ;->ܿ:F

    add-float v3, v1, v2

    iget v1, v0, Landroid/graphics/Rect;->top:I

    int-to-float v1, v1

    add-float v4, v1, v2

    iget v1, v0, Landroid/graphics/Rect;->right:I

    int-to-float v1, v1

    sub-float v5, v1, v2

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    int-to-float v0, v0

    sub-float v6, v0, v2

    iget v8, p0, Ll/۫ۤᩳ;->ᩳ:F

    move-object v2, p1

    move v7, v8

    invoke-virtual/range {v2 .. v9}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public final getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method public final getPadding(Landroid/graphics/Rect;)Z
    .locals 1

    .line 632
    iget-object v0, p0, Ll/۫ۤᩳ;->ۡ:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final isStateful()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final onStateChange([I)Z
    .locals 8

    .line 663
    array-length v0, p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    :goto_0
    if-ge v3, v0, :cond_3

    aget v6, p1, v3

    const v7, -0x101009e

    if-ne v6, v7, :cond_0

    const/4 v4, 0x0

    goto :goto_1

    :cond_0
    const v7, 0x101009c

    if-eq v6, v7, :cond_1

    const v7, 0x10100a7

    if-ne v6, v7, :cond_2

    :cond_1
    const/4 v5, 0x1

    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    if-eqz v4, :cond_4

    if-eqz v5, :cond_4

    const/4 p1, 0x1

    goto :goto_2

    :cond_4
    const/4 p1, 0x0

    :goto_2
    if-eqz p1, :cond_5

    .line 647
    iget v0, p0, Ll/۫ۤᩳ;->ۧ:I

    goto :goto_3

    :cond_5
    iget v0, p0, Ll/۫ۤᩳ;->ۢ:I

    .line 648
    :goto_3
    iget v3, p0, Ll/۫ۤᩳ;->᩻:I

    if-ne v3, v0, :cond_6

    iget-boolean v3, p0, Ll/۫ۤᩳ;->֫:Z

    if-ne v3, p1, :cond_6

    return v2

    .line 651
    :cond_6
    iput v0, p0, Ll/۫ۤᩳ;->᩻:I

    .line 652
    iput-boolean p1, p0, Ll/۫ۤᩳ;->֫:Z

    .line 653
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return v1
.end method

.method public final setAlpha(I)V
    .locals 1

    .line 684
    iget v0, p0, Ll/۫ۤᩳ;->ܽ:I

    if-ne v0, p1, :cond_0

    return-void

    .line 687
    :cond_0
    iput p1, p0, Ll/۫ۤᩳ;->ܽ:I

    .line 688
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 693
    iget-object v0, p0, Ll/۫ۤᩳ;->ܳ:Landroid/graphics/ColorFilter;

    if-ne v0, p1, :cond_0

    return-void

    .line 696
    :cond_0
    iput-object p1, p0, Ll/۫ۤᩳ;->ܳ:Landroid/graphics/ColorFilter;

    .line 697
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method
