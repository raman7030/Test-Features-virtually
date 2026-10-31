.class public final Ll/ۤۢۡ;
.super Ljava/lang/Object;
.source "M5T2"

# interfaces
.implements Ll/֫ۛ;


# instance fields
.field public final ֫:Landroid/graphics/Bitmap;

.field public final ۧ:Ll/᩶ۖܳ;


# direct methods
.method public constructor <init>(Ll/᩶ۖܳ;Landroid/graphics/drawable/Drawable;)V
    .locals 6

    .line 449
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 450
    iput-object p1, p0, Ll/ۤۢۡ;->ۧ:Ll/᩶ۖܳ;

    .line 451
    invoke-static {}, Ll/ۛۢۡ;->ܽ()I

    move-result p1

    invoke-static {}, Ll/ۛۢۡ;->ܽ()I

    move-result v0

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p1, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 452
    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0, p1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 453
    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->copyBounds()Landroid/graphics/Rect;

    move-result-object v1

    .line 454
    invoke-static {}, Ll/ۛۢۡ;->ۧ()I

    move-result v2

    invoke-static {}, Ll/ۛۢۡ;->ۧ()I

    move-result v3

    invoke-static {}, Ll/ۛۢۡ;->ܽ()I

    move-result v4

    invoke-static {}, Ll/ۛۢۡ;->ܽ()I

    move-result v5

    invoke-virtual {p2, v2, v3, v4, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 455
    invoke-virtual {p2, v0}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 456
    invoke-virtual {p2, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 457
    iput-object p1, p0, Ll/ۤۢۡ;->֫:Landroid/graphics/Bitmap;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 6

    .line 462
    invoke-static {}, Ll/ۛۢۡ;->ܽ()I

    move-result v0

    invoke-static {}, Ll/ۛۢۡ;->ܽ()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 463
    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 464
    invoke-static {}, Ll/ۛۢۡ;->֫()Landroid/graphics/Paint;

    move-result-object v0

    monitor-enter v0

    .line 465
    :try_start_0
    iget-object v3, p0, Ll/ۤۢۡ;->ۧ:Ll/᩶ۖܳ;

    .line 244
    iget-object v3, v3, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    .line 465
    invoke-virtual {v3}, Ll/ۨܺ᩷;->֫()Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-static {}, Ll/ۛۢۡ;->֫()Landroid/graphics/Paint;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v2, v3, v5, v5, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 466
    invoke-static {}, Ll/᩹֡᩷;->ۧ()Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Ll/ۤۢۡ;->֫:Landroid/graphics/Bitmap;

    invoke-static {v3}, Ll/ᩳ᩸ۡ;->֫(Landroid/graphics/Bitmap;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 467
    invoke-static {}, Ll/ۛۢۡ;->֫()Landroid/graphics/Paint;

    move-result-object v3

    sget-object v4, Ll/ۛۢۡ;->᩹:Landroid/graphics/ColorMatrixColorFilter;

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 468
    iget-object v3, p0, Ll/ۤۢۡ;->֫:Landroid/graphics/Bitmap;

    invoke-static {}, Ll/ۛۢۡ;->֫()Landroid/graphics/Paint;

    move-result-object v4

    invoke-virtual {v2, v3, v5, v5, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 469
    invoke-static {}, Ll/ۛۢۡ;->֫()Landroid/graphics/Paint;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    goto :goto_0

    .line 471
    :cond_0
    iget-object v3, p0, Ll/ۤۢۡ;->֫:Landroid/graphics/Bitmap;

    invoke-static {}, Ll/ۛۢۡ;->֫()Landroid/graphics/Paint;

    move-result-object v4

    invoke-virtual {v2, v3, v5, v5, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 473
    :goto_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
