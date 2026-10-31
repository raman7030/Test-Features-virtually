.class public final Ll/۬᩷ۡ;
.super Ljava/lang/Object;
.source "N933"


# instance fields
.field public ֫:Landroid/graphics/Bitmap;

.field public ۧ:Landroid/graphics/Rect;


# virtual methods
.method public final ֫(Landroid/graphics/Canvas;)V
    .locals 3

    .line 627
    iget-object v0, p0, Ll/۬᩷ۡ;->֫:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    iget-object v2, p0, Ll/۬᩷ۡ;->ۧ:Landroid/graphics/Rect;

    invoke-virtual {p1, v0, v1, v2, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    return-void
.end method

.method public final ֫(Landroid/graphics/Rect;)V
    .locals 11

    .line 602
    iget-object v0, p0, Ll/۬᩷ۡ;->ۧ:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 605
    :cond_0
    iput-object p1, p0, Ll/۬᩷ۡ;->ۧ:Landroid/graphics/Rect;

    .line 606
    iget-object v0, p0, Ll/۬᩷ۡ;->֫:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    .line 607
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 609
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Ll/۬᩷ۡ;->֫:Landroid/graphics/Bitmap;

    .line 611
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    new-array v1, v0, [I

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    int-to-float v4, v3

    const/high16 v5, 0x43b40000    # 360.0f

    mul-float v4, v4, v5

    int-to-float v5, v0

    div-float/2addr v4, v5

    const/4 v5, 0x3

    new-array v5, v5, [F

    aput v4, v5, v2

    const/4 v4, 0x1

    const/high16 v6, 0x3f800000    # 1.0f

    aput v6, v5, v4

    const/4 v4, 0x2

    aput v6, v5, v4

    .line 614
    invoke-static {v5}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result v4

    aput v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 616
    :cond_2
    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    const/4 v4, 0x0

    .line 617
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 618
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    .line 619
    new-instance v10, Landroid/graphics/Canvas;

    iget-object v4, p0, Ll/۬᩷ۡ;->֫:Landroid/graphics/Bitmap;

    invoke-direct {v10, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    :goto_1
    if-ge v2, v0, :cond_3

    .line 621
    aget v4, v1, v2

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v7, v2

    const/4 v6, 0x0

    int-to-float v8, p1

    move-object v4, v10

    move v5, v7

    move-object v9, v3

    .line 622
    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    return-void
.end method
