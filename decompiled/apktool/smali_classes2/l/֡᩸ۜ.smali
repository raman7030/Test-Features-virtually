.class public final Ll/֡᩸ۜ;
.super Landroid/graphics/drawable/LayerDrawable;
.source "Z7NG"


# instance fields
.field public final ۗ:Landroid/graphics/drawable/Drawable;

.field public final ۙ:Landroid/graphics/Path;

.field public final ۬:Landroid/graphics/Paint;

.field public final ᩶:F

.field public final ᩸:Landroid/graphics/drawable/BitmapDrawable;

.field public final ᩹:Landroid/graphics/drawable/BitmapDrawable;


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/BitmapDrawable;Landroid/graphics/drawable/BitmapDrawable;F)V
    .locals 2

    const/4 v0, 0x2

    new-array v0, v0, [Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 v1, 0x1

    aput-object p2, v0, v1

    .line 39
    invoke-direct {p0, v0}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 40
    iput-object p1, p0, Ll/֡᩸ۜ;->ۗ:Landroid/graphics/drawable/Drawable;

    .line 41
    iput-object p2, p0, Ll/֡᩸ۜ;->᩹:Landroid/graphics/drawable/BitmapDrawable;

    .line 42
    iput-object p3, p0, Ll/֡᩸ۜ;->᩸:Landroid/graphics/drawable/BitmapDrawable;

    .line 43
    iput p4, p0, Ll/֡᩸ۜ;->᩶:F

    .line 44
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Ll/֡᩸ۜ;->۬:Landroid/graphics/Paint;

    .line 45
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 46
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 47
    new-instance p2, Landroid/graphics/PorterDuffXfermode;

    sget-object p3, Landroid/graphics/PorterDuff$Mode;->OVERLAY:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {p2, p3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 48
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Ll/֡᩸ۜ;->ۙ:Landroid/graphics/Path;

    return-void
.end method

.method public static ֫(J)Ll/֡᩸ۜ;
    .locals 4

    .line 30
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0, p0, p1}, Ljava/util/Random;-><init>(J)V

    const p0, 0x7f08027b

    .line 31
    invoke-static {p0}, Ll/ۙ᩸᩷;->֫(I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    .line 32
    new-instance p1, Ll/᩵᩸ۜ;

    invoke-direct {p1, v0}, Ll/᩵᩸ۜ;-><init>(Ljava/util/Random;)V

    .line 33
    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-static {}, Ll/ۙ᩸᩷;->᩵()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {p1}, Ll/᩵᩸ۜ;->ۧ()Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 34
    new-instance v2, Landroid/graphics/drawable/BitmapDrawable;

    invoke-static {}, Ll/ۙ᩸᩷;->᩵()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {p1}, Ll/᩵᩸ۜ;->֫()Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-direct {v2, v3, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 35
    new-instance p1, Ll/֡᩸ۜ;

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    const/16 v3, 0x168

    invoke-virtual {v0, v3}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    int-to-float v0, v0

    invoke-direct {p1, p0, v1, v2, v0}, Ll/֡᩸ۜ;-><init>(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/BitmapDrawable;Landroid/graphics/drawable/BitmapDrawable;F)V

    return-object p1
.end method

.method private ֫(Landroid/graphics/Canvas;Landroid/graphics/drawable/Drawable;IIIIZ)V
    .locals 6

    sub-int/2addr p5, p3

    .line 88
    div-int/lit8 p5, p5, 0x2

    sub-int/2addr p6, p4

    .line 89
    div-int/lit8 p6, p6, 0x2

    add-int/2addr p3, p5

    add-int/2addr p4, p6

    if-eqz p7, :cond_0

    int-to-float v1, p5

    int-to-float v2, p6

    int-to-float v3, p3

    int-to-float v4, p4

    .line 93
    iget-object v5, p0, Ll/֡᩸ۜ;->۬:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;)I

    move-result p7

    .line 94
    invoke-virtual {p2, p5, p6, p3, p4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 95
    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 96
    invoke-virtual {p1, p7}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return-void

    .line 98
    :cond_0
    invoke-virtual {p2, p5, p6, p3, p4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 99
    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 8

    .line 53
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getDirtyBounds()Landroid/graphics/Rect;

    move-result-object v0

    .line 54
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v3

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v4

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-virtual/range {v1 .. v7}, Ll/֡᩸ۜ;->֫(Landroid/graphics/Canvas;IIFZZ)V

    return-void
.end method

.method public final ֫(Landroid/graphics/Canvas;IIFZZ)V
    .locals 14

    move-object v8, p0

    move-object v9, p1

    move/from16 v10, p2

    move/from16 v11, p3

    const/high16 v0, 0x40000000    # 2.0f

    if-eqz p5, :cond_0

    int-to-float v1, v10

    div-float/2addr v1, v0

    int-to-float v2, v11

    div-float/2addr v2, v0

    .line 62
    invoke-static/range {p2 .. p3}, Ljava/lang/Math;->min(II)I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v3, v0

    .line 63
    iget-object v4, v8, Ll/֡᩸ۜ;->ۙ:Landroid/graphics/Path;

    invoke-virtual {v4}, Landroid/graphics/Path;->reset()V

    .line 64
    sget-object v5, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v4, v1, v2, v3, v5}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 66
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v1

    .line 67
    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 68
    iget v2, v8, Ll/֡᩸ۜ;->᩶:F

    add-float v2, p4, v2

    move v12, v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    move/from16 v2, p4

    const/4 v12, 0x0

    :goto_0
    const/4 v1, 0x0

    .line 70
    iget-object v3, v8, Ll/֡᩸ۜ;->᩹:Landroid/graphics/drawable/BitmapDrawable;

    iget-object v4, v8, Ll/֡᩸ۜ;->᩸:Landroid/graphics/drawable/BitmapDrawable;

    cmpl-float v1, v2, v1

    if-eqz v1, :cond_2

    .line 71
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v13

    int-to-float v1, v10

    div-float/2addr v1, v0

    int-to-float v5, v11

    div-float/2addr v5, v0

    .line 72
    invoke-virtual {p1, v2, v1, v5}, Landroid/graphics/Canvas;->rotate(FFF)V

    if-eqz p6, :cond_1

    move-object v2, v4

    goto :goto_1

    :cond_1
    move-object v2, v3

    :goto_1
    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p2

    move/from16 v6, p3

    .line 73
    invoke-direct/range {v0 .. v7}, Ll/֡᩸ۜ;->֫(Landroid/graphics/Canvas;Landroid/graphics/drawable/Drawable;IIIIZ)V

    .line 74
    invoke-virtual {p1, v13}, Landroid/graphics/Canvas;->restoreToCount(I)V

    goto :goto_3

    :cond_2
    if-eqz p6, :cond_3

    move-object v2, v4

    goto :goto_2

    :cond_3
    move-object v2, v3

    :goto_2
    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p2

    move/from16 v6, p3

    .line 76
    invoke-direct/range {v0 .. v7}, Ll/֡᩸ۜ;->֫(Landroid/graphics/Canvas;Landroid/graphics/drawable/Drawable;IIIIZ)V

    :goto_3
    if-eqz p6, :cond_4

    const v0, -0xaaaaab

    goto :goto_4

    :cond_4
    const v0, -0xeeeeef

    .line 78
    :goto_4
    iget-object v1, v8, Ll/֡᩸ۜ;->ۗ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    mul-int/lit8 v0, v10, 0x2

    .line 79
    div-int/lit8 v3, v0, 0x5

    mul-int/lit8 v0, v11, 0x2

    div-int/lit8 v4, v0, 0x5

    const/4 v7, 0x1

    iget-object v2, v8, Ll/֡᩸ۜ;->ۗ:Landroid/graphics/drawable/Drawable;

    move-object v0, p0

    move-object v1, p1

    move/from16 v5, p2

    move/from16 v6, p3

    invoke-direct/range {v0 .. v7}, Ll/֡᩸ۜ;->֫(Landroid/graphics/Canvas;Landroid/graphics/drawable/Drawable;IIIIZ)V

    if-eqz p5, :cond_5

    .line 82
    invoke-virtual {p1, v12}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_5
    return-void
.end method
