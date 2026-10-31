.class public final Ll/ܿܺۡ;
.super Ljava/lang/Object;
.source "53XL"


# static fields
.field public static final ֫:Landroid/graphics/Paint;

.field public static final ۧ:I

.field public static ܽ:Ljava/lang/ref/WeakReference;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 58
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    sput-object v0, Ll/ܿܺۡ;->֫:Landroid/graphics/Paint;

    const/high16 v0, 0x42000000    # 32.0f

    .line 59
    invoke-static {v0}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v0

    sput v0, Ll/ܿܺۡ;->ۧ:I

    return-void
.end method

.method public static ֫(Landroid/graphics/Bitmap;III)Landroid/graphics/Bitmap;
    .locals 0

    .line 390
    invoke-static {p0, p1, p2, p3}, Ll/ܿܺۡ;->ۧ(Landroid/graphics/Bitmap;III)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    .locals 10

    .line 258
    :try_start_0
    invoke-static {p0}, Ll/ܽ֨ܺ;->ۧ(Ljava/io/InputStream;)Ll/ܽ֨ܺ;

    move-result-object p0

    .line 259
    invoke-virtual {p0}, Ll/ܽ֨ܺ;->ܽ()Landroid/graphics/RectF;

    move-result-object v0

    .line 260
    invoke-virtual {p0}, Ll/ܽ֨ܺ;->ᩳ()F

    move-result v1

    float-to-int v1, v1

    .line 261
    invoke-virtual {p0}, Ll/ܽ֨ܺ;->ۧ()F

    move-result v2

    float-to-int v2, v2

    const/4 v3, -0x1

    if-ne v1, v3, :cond_0

    if-ne v2, v3, :cond_0

    .line 263
    iget v1, v0, Landroid/graphics/RectF;->right:F

    iget v2, v0, Landroid/graphics/RectF;->left:F

    sub-float/2addr v1, v2

    float-to-int v1, v1

    .line 264
    iget v2, v0, Landroid/graphics/RectF;->bottom:F

    iget v0, v0, Landroid/graphics/RectF;->top:F

    sub-float/2addr v2, v0

    float-to-int v2, v2

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    int-to-float v0, v1

    int-to-float v3, v2

    .line 266
    invoke-virtual {p0, v0, v3}, Ll/ܽ֨ܺ;->֫(FF)V

    :cond_1
    :goto_0
    if-lez v1, :cond_4

    if-gtz v2, :cond_2

    goto :goto_2

    .line 271
    :cond_2
    sget v0, Ll/ܿܺۡ;->ۧ:I

    .line 272
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v0, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 273
    new-instance v4, Landroid/graphics/Canvas;

    invoke-direct {v4, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 274
    new-instance v5, Landroid/graphics/RectF;

    invoke-direct {v5}, Landroid/graphics/RectF;-><init>()V

    const/4 v6, 0x0

    if-le v1, v2, :cond_3

    int-to-float v2, v2

    int-to-float v7, v0

    int-to-float v1, v1

    div-float v1, v7, v1

    mul-float v1, v1, v2

    float-to-int v1, v1

    sub-int v2, v0, v1

    .line 280
    div-int/lit8 v2, v2, 0x2

    int-to-float v8, v2

    add-int/2addr v2, v1

    int-to-float v2, v2

    .line 281
    invoke-virtual {v5, v6, v8, v7, v2}, Landroid/graphics/RectF;->set(FFFF)V

    goto :goto_1

    :cond_3
    int-to-float v1, v1

    int-to-float v7, v0

    int-to-float v2, v2

    div-float v2, v7, v2

    mul-float v2, v2, v1

    float-to-int v1, v2

    sub-int v2, v0, v1

    .line 285
    div-int/lit8 v2, v2, 0x2

    int-to-float v8, v2

    add-int/2addr v2, v1

    int-to-float v2, v2

    .line 286
    invoke-virtual {v5, v8, v6, v2, v7}, Landroid/graphics/RectF;->set(FFFF)V

    move v9, v1

    move v1, v0

    move v0, v9

    :goto_1
    int-to-float v0, v0

    .line 288
    invoke-virtual {p0, v0}, Ll/ܽ֨ܺ;->ۧ(F)V

    int-to-float v0, v1

    .line 289
    invoke-virtual {p0, v0}, Ll/ܽ֨ܺ;->֫(F)V

    .line 290
    invoke-virtual {p0, v4, v5}, Ll/ܽ֨ܺ;->֫(Landroid/graphics/Canvas;Landroid/graphics/RectF;)V

    .line 291
    invoke-static {v3}, Ll/ܿܺۡ;->ۧ(Landroid/graphics/Bitmap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v3

    :catch_0
    :cond_4
    :goto_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ll/ۧܺۡ;)Landroid/graphics/Bitmap;
    .locals 14

    const/4 v0, 0x0

    if-nez p0, :cond_0

    goto/16 :goto_6

    .line 69
    :cond_0
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 70
    :try_start_0
    new-instance v2, Ll/ᩳܺۡ;

    invoke-direct {v2, p0}, Ll/ᩳܺۡ;-><init>(Ll/ۧܺۡ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v3, 0x1

    .line 71
    :try_start_1
    iput-boolean v3, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 72
    invoke-static {v2}, Ll/ᩳܺۡ;->֫(Ll/ᩳܺۡ;)Ljava/io/InputStream;

    move-result-object v4

    new-instance v5, Ll/ۨۡۡ;

    invoke-direct {v5, v2, v1}, Ll/ۨۡۡ;-><init>(Ll/ᩳܺۡ;Landroid/graphics/BitmapFactory$Options;)V

    invoke-static {v4, v5}, Ll/ۛ۠ۜ;->֫(Ljava/io/InputStream;Ll/۬۠ۜ;)Ll/ۤ۠ۜ;

    move-result-object v4

    .line 76
    iget-object v5, v4, Ll/ۤ۠ۜ;->ۧ:Ll/۫۠ۜ;

    sget-object v6, Ll/۫۠ۜ;->۫:Ll/۫۠ۜ;

    if-ne v5, v6, :cond_1

    goto/16 :goto_4

    .line 77
    :cond_1
    sget-object v6, Ll/۫۠ۜ;->ۗ:Ll/۫۠ۜ;

    const/4 v7, 0x0

    if-ne v5, v6, :cond_2

    invoke-virtual {v2, v7}, Ll/ᩳܺۡ;->֫(Z)Ljava/io/InputStream;

    move-result-object p0

    invoke-static {p0}, Ll/ܿܺۡ;->֫(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object p0

    goto :goto_0

    .line 78
    :cond_2
    sget-object v6, Ll/۫۠ۜ;->۬:Ll/۫۠ۜ;

    if-ne v5, v6, :cond_4

    .line 79
    invoke-interface {p0}, Ll/ۧܺۡ;->length()J

    move-result-wide v3

    const-wide/32 v5, 0x10000000

    cmp-long p0, v3, v5

    if-lez p0, :cond_3

    goto/16 :goto_4

    .line 80
    :cond_3
    invoke-virtual {v2, v7}, Ll/ᩳܺۡ;->֫(Z)Ljava/io/InputStream;

    move-result-object p0

    invoke-static {p0}, Ll/ܿܺۡ;->ۧ(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object p0

    .line 81
    invoke-static {p0}, Ll/ܿܺۡ;->ۧ(Landroid/graphics/Bitmap;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 134
    :goto_0
    :try_start_2
    invoke-virtual {v2}, Ll/ᩳܺۡ;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    return-object p0

    .line 85
    :cond_4
    :try_start_3
    iget-object p0, v4, Ll/ۤ۠ۜ;->֫:Landroid/graphics/BitmapFactory$Options;

    if-nez p0, :cond_5

    invoke-virtual {v2, v3}, Ll/ᩳܺۡ;->֫(Z)Ljava/io/InputStream;

    move-result-object p0

    invoke-static {p0, v0, v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 86
    :cond_5
    iget p0, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 87
    iget v4, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-lez p0, :cond_e

    if-gtz v4, :cond_6

    goto/16 :goto_4

    .line 93
    :cond_6
    :try_start_4
    new-instance v5, Ll/۟ܿ֫;

    invoke-virtual {v2, v3}, Ll/ᩳܺۡ;->֫(Z)Ljava/io/InputStream;

    move-result-object v6

    .line 4166
    invoke-direct {v5, v6, v7}, Ll/۟ܿ֫;-><init>(Ljava/io/InputStream;I)V

    .line 94
    invoke-virtual {v5}, Ll/۟ܿ֫;->֫()I

    move-result v5
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const/4 v6, 0x3

    if-eq v5, v6, :cond_9

    const/4 v6, 0x6

    if-eq v5, v6, :cond_8

    const/16 v6, 0x8

    if-eq v5, v6, :cond_7

    goto :goto_1

    :cond_7
    const/16 v5, 0x10e

    goto :goto_2

    :cond_8
    const/16 v5, 0x5a

    goto :goto_2

    :cond_9
    const/16 v5, 0xb4

    goto :goto_2

    :catch_0
    :goto_1
    const/4 v5, 0x0

    .line 110
    :goto_2
    :try_start_5
    sget v6, Ll/ܿܺۡ;->ۧ:I

    if-gt p0, v4, :cond_a

    if-le p0, v6, :cond_a

    .line 113
    div-int v8, p0, v6

    invoke-static {v3, v8}, Ljava/lang/Math;->max(II)I

    move-result v3

    goto :goto_3

    :cond_a
    if-lt p0, v4, :cond_b

    if-le v4, v6, :cond_b

    .line 115
    div-int v8, v4, v6

    invoke-static {v3, v8}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 116
    :cond_b
    :goto_3
    iput-boolean v7, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 117
    iput v3, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 118
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_4444:Landroid/graphics/Bitmap$Config;

    iput-object v3, v1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 120
    invoke-virtual {v2, v7}, Ll/ᩳܺۡ;->֫(Z)Ljava/io/InputStream;

    move-result-object v3

    invoke-static {v3, v0, v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-nez v1, :cond_c

    .line 134
    :try_start_6
    invoke-virtual {v2}, Ll/ᩳܺۡ;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1

    goto :goto_6

    .line 124
    :cond_c
    :try_start_7
    invoke-static {v1, v6, p0, v4}, Ll/ܿܺۡ;->ۧ(Landroid/graphics/Bitmap;III)Landroid/graphics/Bitmap;

    move-result-object v7

    if-eqz v5, :cond_d

    .line 127
    new-instance v12, Landroid/graphics/Matrix;

    invoke-direct {v12}, Landroid/graphics/Matrix;-><init>()V

    int-to-float p0, v5

    .line 128
    invoke-virtual {v12, p0}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 129
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v10

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v11

    const/4 v13, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v7 .. v13}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v7

    .line 132
    :cond_d
    invoke-static {v7}, Ll/ܿܺۡ;->ۧ(Landroid/graphics/Bitmap;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 134
    :try_start_8
    invoke-virtual {v2}, Ll/ᩳܺۡ;->close()V

    return-object v7

    :cond_e
    :goto_4
    invoke-virtual {v2}, Ll/ᩳܺۡ;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_1

    return-object v0

    :catchall_0
    move-exception p0

    .line 70
    :try_start_9
    invoke-virtual {v2}, Ll/ᩳܺۡ;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception v1

    :try_start_a
    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw p0
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_1

    :catch_1
    :goto_6
    return-object v0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;)Landroid/graphics/Bitmap;
    .locals 7

    .line 427
    invoke-static {p0}, Ll/ᩴܶۡ;->ܽ(Ll/ܶ᩵ܿ;)Ll/ۘܶۡ;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 431
    :cond_0
    invoke-virtual {p0}, Ll/ۘܶۡ;->֫()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    .line 433
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    sget v1, Ll/ܿܺۡ;->ۧ:I

    invoke-static {v1, v1, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 434
    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 435
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->copyBounds()Landroid/graphics/Rect;

    move-result-object v3

    .line 436
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    .line 437
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v5

    if-lez v4, :cond_1

    if-gtz v5, :cond_2

    :cond_1
    move v4, v1

    move v5, v4

    :cond_2
    const/4 v6, 0x0

    .line 443
    :try_start_0
    invoke-virtual {p0, v6, v6, v4, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    int-to-float v1, v1

    int-to-float v4, v4

    div-float v4, v1, v4

    int-to-float v5, v5

    div-float/2addr v1, v5

    .line 444
    invoke-virtual {v2, v4, v1}, Landroid/graphics/Canvas;->scale(FF)V

    .line 445
    invoke-virtual {p0, v2}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 447
    invoke-virtual {p0, v3}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 449
    invoke-static {v0}, Ll/ܿܺۡ;->֫(Landroid/graphics/Bitmap;)V

    return-object v0

    :catchall_0
    move-exception v0

    .line 447
    invoke-virtual {p0, v3}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 448
    throw v0
.end method

.method public static ֫(Landroid/media/MediaDataSource;)Ll/ۢ᩸ۜ;
    .locals 1

    .line 381
    sget v0, Ll/ܿܺۡ;->ۧ:I

    invoke-static {p0, v0}, Ll/ᩴ᩸ۜ;->֫(Landroid/media/MediaDataSource;I)Ll/ۢ᩸ۜ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/graphics/Bitmap;)V
    .locals 3

    .line 549
    invoke-static {p0}, Ll/ۤ۫ۡ;->֫(Landroid/graphics/Bitmap;)F

    move-result v0

    const v1, 0x3f666666    # 0.9f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    goto :goto_0

    .line 552
    :cond_0
    invoke-static {p0}, Ll/۟۫ۡ;->֫(Landroid/graphics/Bitmap;)I

    move-result v0

    if-eqz v0, :cond_2

    const v1, -0x50506

    .line 556
    invoke-static {v0, v1}, Ll/۟۫ۡ;->ܽ(II)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    const/high16 v0, 0x3f800000    # 1.0f

    const v1, -0x557f7f80

    .line 557
    invoke-static {p0, v0, v2, v2, v1}, Ll/ۤ۫ۡ;->֫(Landroid/graphics/Bitmap;FIII)V

    return-void

    :cond_1
    const v1, -0xcfcfd0

    .line 558
    invoke-static {v0, v1}, Ll/۟۫ۡ;->ܽ(II)Z

    move-result v0

    if-eqz v0, :cond_2

    const/high16 v0, 0x40000000    # 2.0f

    const v1, -0x555f5f60

    .line 559
    invoke-static {p0, v0, v2, v2, v1}, Ll/ۤ۫ۡ;->֫(Landroid/graphics/Bitmap;FIII)V

    :cond_2
    :goto_0
    return-void
.end method

.method public static ۧ(Landroid/graphics/Bitmap;III)Landroid/graphics/Bitmap;
    .locals 7

    .line 565
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    .line 566
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    if-le v3, v4, :cond_0

    int-to-float v0, v3

    int-to-float v1, v4

    goto :goto_0

    :cond_0
    int-to-float v0, v4

    int-to-float v1, v3

    .line 576
    :goto_0
    invoke-static {p2, p3}, Ljava/lang/Math;->max(II)I

    move-result p2

    const/16 p3, 0x1f4

    const/high16 v2, 0x3f800000    # 1.0f

    if-le p2, p3, :cond_1

    int-to-float p2, p1

    goto :goto_2

    :cond_1
    int-to-float p2, p1

    cmpg-float p3, v0, p2

    if-gez p3, :cond_2

    goto :goto_1

    :cond_2
    cmpl-float p3, v0, p2

    if-lez p3, :cond_4

    div-float p3, v0, v1

    const/high16 v5, 0x40400000    # 3.0f

    cmpg-float p3, p3, v5

    if-gtz p3, :cond_3

    :goto_1
    div-float/2addr p2, v0

    goto :goto_3

    :cond_3
    div-float/2addr p2, v5

    :goto_2
    div-float/2addr p2, v1

    goto :goto_3

    :cond_4
    const/high16 p2, 0x3f800000    # 1.0f

    :goto_3
    cmpl-float p3, p2, v2

    if-eqz p3, :cond_5

    .line 593
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 594
    invoke-virtual {v5, p2, p2}, Landroid/graphics/Matrix;->postScale(FF)Z

    const/4 v2, 0x0

    const/4 v6, 0x1

    const/4 v1, 0x0

    move-object v0, p0

    .line 595
    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object p2

    .line 596
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    .line 598
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    .line 599
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    move-object p0, p2

    .line 603
    :cond_5
    sget-object p2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p1, p1, p2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p2

    .line 604
    new-instance p3, Landroid/graphics/Canvas;

    invoke-direct {p3, p2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    sub-int v0, p1, v3

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    sub-int/2addr p1, v4

    int-to-float p1, p1

    div-float/2addr p1, v1

    .line 607
    sget-object v1, Ll/ܿܺۡ;->֫:Landroid/graphics/Paint;

    invoke-virtual {p3, p0, v0, p1, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 608
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    return-object p2
.end method

.method public static ۧ(Landroid/media/MediaDataSource;)Landroid/graphics/Bitmap;
    .locals 4

    .line 353
    new-instance v0, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v0}, Landroid/media/MediaMetadataRetriever;-><init>()V

    const/4 v1, 0x0

    .line 355
    :try_start_0
    invoke-virtual {v0, p0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/media/MediaDataSource;)V

    const-wide/16 v2, -0x1

    .line 356
    invoke-virtual {v0, v2, v3}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime(J)Landroid/graphics/Bitmap;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 361
    :try_start_1
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    nop

    goto :goto_0

    :catchall_0
    :try_start_2
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    move-object p0, v1

    :goto_0
    if-nez p0, :cond_0

    goto :goto_1

    .line 367
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    .line 390
    sget v2, Ll/ܿܺۡ;->ۧ:I

    invoke-static {p0, v2, v0, v1}, Ll/ܿܺۡ;->ۧ(Landroid/graphics/Bitmap;III)Landroid/graphics/Bitmap;

    move-result-object v1

    :goto_1
    return-object v1
.end method

.method public static ۧ(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    .locals 12

    .line 142
    invoke-static {p0}, Ll/᩺ۛۡ;->֫(Ljava/io/InputStream;)Ll/ۤۛۡ;

    move-result-object v0

    .line 144
    iget v1, v0, Ll/ۤۛۡ;->ܺ:I

    iget v2, v0, Ll/ۤۛۡ;->ᩳ:I

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v4

    const/16 v5, 0x1f4

    .line 146
    sget v6, Ll/ܿܺۡ;->ۧ:I

    if-le v3, v5, :cond_0

    int-to-float v3, v6

    int-to-float v4, v4

    goto :goto_0

    :cond_0
    if-le v3, v6, :cond_1

    int-to-float v5, v3

    int-to-float v4, v4

    div-float/2addr v5, v4

    const/high16 v7, 0x40400000    # 3.0f

    cmpl-float v5, v5, v7

    if-lez v5, :cond_1

    int-to-float v3, v6

    div-float/2addr v3, v7

    :goto_0
    div-float/2addr v3, v4

    goto :goto_1

    :cond_1
    int-to-float v4, v6

    int-to-float v3, v3

    div-float v3, v4, v3

    :goto_1
    int-to-float v4, v6

    div-float v5, v4, v3

    float-to-double v7, v5

    .line 149
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v9

    double-to-int v5, v9

    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 150
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v7

    double-to-int v7, v7

    invoke-static {v2, v7}, Ljava/lang/Math;->min(II)I

    move-result v7

    sub-int/2addr v1, v5

    .line 151
    div-int/lit8 v1, v1, 0x2

    sub-int/2addr v2, v7

    div-int/lit8 v2, v2, 0x2

    .line 152
    new-instance v8, Landroid/graphics/Rect;

    add-int v9, v1, v5

    add-int v10, v2, v7

    invoke-direct {v8, v1, v2, v9, v10}, Landroid/graphics/Rect;-><init>(IIII)V

    const/4 v1, 0x1

    :goto_2
    int-to-float v2, v1

    const/high16 v9, 0x40000000    # 2.0f

    mul-float v2, v2, v9

    mul-float v2, v2, v3

    const/high16 v10, 0x3f800000    # 1.0f

    cmpg-float v2, v2, v10

    if-gtz v2, :cond_2

    mul-int/lit8 v1, v1, 0x2

    goto :goto_2

    .line 155
    :cond_2
    new-instance v2, Ll/᩺ۡۡ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-static {p0, v0, v8, v1, v2}, Ll/᩺ۛۡ;->֫(Ljava/io/InputStream;Ll/ۤۛۡ;Landroid/graphics/Rect;ILl/ܿۖ᩷;)Landroid/graphics/Bitmap;

    move-result-object p0

    const/4 v0, 0x0

    .line 159
    :try_start_0
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v6, v6, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    int-to-float v2, v5

    mul-float v2, v2, v3

    int-to-float v5, v7

    mul-float v5, v5, v3

    .line 161
    :try_start_1
    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    const/4 v6, 0x0

    .line 162
    invoke-virtual {v3, v6}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 163
    new-instance v6, Landroid/graphics/Canvas;

    invoke-direct {v6, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    new-instance v7, Landroid/graphics/RectF;

    sub-float v8, v4, v2

    div-float/2addr v8, v9

    sub-float v10, v4, v5

    div-float/2addr v10, v9

    add-float/2addr v2, v4

    div-float/2addr v2, v9

    add-float/2addr v4, v5

    div-float/2addr v4, v9

    invoke-direct {v7, v8, v10, v2, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {v6, p0, v0, v7, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 169
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    return-object v1

    :catchall_0
    move-exception v0

    move-object v11, v1

    move-object v1, v0

    move-object v0, v11

    goto :goto_3

    :catchall_1
    move-exception v1

    :goto_3
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    if-eqz v0, :cond_3

    .line 170
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 171
    :cond_3
    throw v1
.end method

.method public static ۧ(Ll/ۧܺۡ;)Landroid/graphics/Bitmap;
    .locals 9

    const/4 v0, 0x0

    if-nez p0, :cond_0

    goto/16 :goto_5

    .line 213
    :cond_0
    :try_start_0
    invoke-interface {p0}, Ll/ۧܺۡ;->length()J

    move-result-wide v1

    const-wide/32 v3, 0x25800

    cmp-long v5, v1, v3

    if-lez v5, :cond_1

    goto/16 :goto_5

    .line 216
    :cond_1
    invoke-interface {p0}, Ll/ۧܺۡ;->֫()Ljava/io/InputStream;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/4 v2, 0x4

    .line 217
    :try_start_1
    invoke-virtual {v1, v2}, Ljava/io/InputStream;->mark(I)V

    .line 218
    invoke-virtual {v1}, Ljava/io/InputStream;->read()I

    move-result v2

    and-int/lit16 v2, v2, 0xff

    const/4 v3, 0x3

    if-ne v2, v3, :cond_6

    invoke-virtual {v1}, Ljava/io/InputStream;->read()I

    move-result v2

    and-int/lit16 v2, v2, 0xff

    if-eqz v2, :cond_2

    goto/16 :goto_3

    .line 221
    :cond_2
    invoke-virtual {v1}, Ljava/io/InputStream;->reset()V

    .line 222
    instance-of v2, p0, Ll/ܰۡۡ;

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    check-cast p0, Ll/ܰۡۡ;

    .line 223
    invoke-interface {p0}, Ll/ܰۡۡ;->ۧ()Ll/۫ܽܽ;

    move-result-object p0

    sget v2, Ll/ܶ᩹ۡ;->ۛ:I

    .line 342
    invoke-static {v1}, Ll/ܶۨۡ;->֫(Ljava/io/InputStream;)Ll/ܶۨۡ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܶۨۡ;->᩻()Ll/ۤۨۡ;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 353
    :goto_0
    :try_start_2
    invoke-static {v2, p0, v3}, Ll/ܶ᩹ۡ;->֫(Ll/ۤۨۡ;Ll/۫ܽܽ;Z)Ll/ܶ᩹ۡ;

    move-result-object p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    .line 225
    :cond_3
    :try_start_3
    new-instance p0, Ll/۫ܽܽ;

    invoke-direct {p0}, Ll/۫ܽܽ;-><init>()V

    sget v2, Ll/ܶ᩹ۡ;->ۛ:I

    .line 342
    invoke-static {v1}, Ll/ܶۨۡ;->֫(Ljava/io/InputStream;)Ll/ܶۨۡ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܶۨۡ;->᩻()Ll/ۤۨۡ;

    move-result-object v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catch_0
    move-object p0, v0

    .line 227
    :goto_1
    :try_start_4
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    if-nez p0, :cond_4

    goto :goto_5

    .line 230
    :cond_4
    sget v1, Ll/ܿܺۡ;->ۧ:I

    .line 231
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 232
    new-instance v4, Landroid/graphics/Canvas;

    invoke-direct {v4, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 233
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->copyBounds()Landroid/graphics/Rect;

    move-result-object v5

    .line 234
    invoke-virtual {p0}, Ll/ܶ᩹ۡ;->getIntrinsicWidth()I

    move-result v6

    .line 235
    invoke-virtual {p0}, Ll/ܶ᩹ۡ;->getIntrinsicHeight()I

    move-result v7

    if-le v6, v7, :cond_5

    int-to-float v7, v7

    int-to-float v8, v1

    int-to-float v6, v6

    div-float/2addr v8, v6

    mul-float v8, v8, v7

    float-to-int v6, v8

    sub-int v7, v1, v6

    .line 238
    div-int/lit8 v7, v7, 0x2

    add-int/2addr v6, v7

    .line 239
    invoke-virtual {p0, v3, v7, v1, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    goto :goto_2

    :cond_5
    int-to-float v6, v6

    int-to-float v8, v1

    int-to-float v7, v7

    div-float/2addr v8, v7

    mul-float v8, v8, v6

    float-to-int v6, v8

    sub-int v7, v1, v6

    .line 242
    div-int/lit8 v7, v7, 0x2

    add-int/2addr v6, v7

    .line 243
    invoke-virtual {p0, v7, v3, v6, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 245
    :goto_2
    invoke-virtual {p0, v4}, Ll/ܶ᩹ۡ;->draw(Landroid/graphics/Canvas;)V

    .line 246
    invoke-virtual {p0, v5}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 247
    invoke-static {v2}, Ll/ܿܺۡ;->ۧ(Landroid/graphics/Bitmap;)V

    return-object v2

    .line 227
    :cond_6
    :goto_3
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    return-object v0

    :catchall_0
    move-exception p0

    .line 216
    :try_start_5
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v1

    :try_start_6
    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    :goto_5
    return-object v0
.end method

.method public static ۧ(Ll/ܶ᩵ܿ;)Landroid/graphics/Bitmap;
    .locals 11

    const-string v0, "base.apk"

    const-string v1, "id"

    const-string v2, "split_apks"

    const-string v3, "icon"

    const/4 v4, 0x0

    .line 455
    :try_start_0
    new-instance v5, Ll/ᩳܰۡ;

    invoke-direct {v5, p0}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 458
    :try_start_1
    new-instance p0, Ljava/lang/String;

    const-string v6, "manifest.json"

    invoke-virtual {v5, v6}, Ll/ᩳܰۡ;->᩷(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v6

    .line 1757
    invoke-virtual {v5, v6, v4}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;Ll/᩵ۛۡ;)[B

    move-result-object v6

    .line 458
    sget-object v7, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {p0, v6, v7}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 459
    new-instance v6, Lbin/mt/json/JSONObject;

    invoke-direct {v6, p0}, Lbin/mt/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto/16 :goto_4

    :catch_0
    move-object v6, v4

    :goto_0
    const/4 p0, 0x0

    if-eqz v6, :cond_0

    .line 463
    :try_start_2
    invoke-virtual {v6, v3}, Lbin/mt/json/JSONObject;->contains(Ljava/lang/String;)Z

    move-result v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v7, :cond_0

    .line 465
    :try_start_3
    invoke-virtual {v6, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ll/ᩳܰۡ;->getEntry(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v3

    .line 1757
    invoke-virtual {v5, v3, v4}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;Ll/᩵ۛۡ;)[B

    move-result-object v3

    .line 467
    new-instance v7, Landroid/graphics/drawable/BitmapDrawable;

    invoke-static {}, Ll/ۙ᩸᩷;->᩵()Landroid/content/res/Resources;

    move-result-object v8

    array-length v9, v3

    invoke-static {v3, p0, v9}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-direct {v7, v8, v3}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 468
    sget v3, Ll/ܿܺۡ;->ۧ:I

    .line 469
    sget-object v8, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v3, v8}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v8

    .line 470
    new-instance v9, Landroid/graphics/Canvas;

    invoke-direct {v9, v8}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 471
    invoke-virtual {v7}, Landroid/graphics/drawable/Drawable;->copyBounds()Landroid/graphics/Rect;

    move-result-object v10

    .line 472
    invoke-virtual {v7, p0, p0, v3, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 473
    invoke-virtual {v7, v9}, Landroid/graphics/drawable/BitmapDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 474
    invoke-virtual {v7, v10}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 475
    invoke-static {v8}, Ll/ܿܺۡ;->֫(Landroid/graphics/Bitmap;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 518
    :try_start_4
    invoke-virtual {v5}, Ll/ᩳܰۡ;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    return-object v8

    :catch_1
    nop

    :cond_0
    if-eqz v6, :cond_2

    .line 482
    :try_start_5
    invoke-virtual {v6, v2}, Lbin/mt/json/JSONObject;->contains(Ljava/lang/String;)Z

    move-result v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-eqz v3, :cond_2

    .line 484
    :try_start_6
    invoke-virtual {v6, v2}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v2

    .line 485
    invoke-virtual {v2}, Lbin/mt/json/JSONArray;->size()I

    move-result v3

    :goto_1
    if-ge p0, v3, :cond_2

    .line 486
    invoke-virtual {v2, p0}, Lbin/mt/json/JSONArray;->getJSONObject(I)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 487
    invoke-virtual {v6, v1}, Lbin/mt/json/JSONObject;->contains(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual {v6, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "base"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const-string p0, "file"

    .line 488
    invoke-virtual {v6, p0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_2

    :cond_1
    add-int/lit8 p0, p0, 0x1

    goto :goto_1

    :catch_2
    :cond_2
    move-object p0, v4

    :goto_2
    if-nez p0, :cond_3

    .line 497
    :try_start_7
    invoke-virtual {v5, v0}, Ll/ᩳܰۡ;->getEntry(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v1

    if-eqz v1, :cond_3

    goto :goto_3

    :cond_3
    move-object v0, p0

    :goto_3
    if-nez v0, :cond_4

    .line 502
    invoke-virtual {v5}, Ll/ᩳܰۡ;->᩶ۧ()Ljava/util/Collection;

    move-result-object p0

    invoke-static {p0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    new-instance v1, Ll/ۜ۠ۢ;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Ll/ۜ۠ۢ;-><init>(I)V

    .line 503
    invoke-interface {p0, v1}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    new-instance v1, Ll/֡֡ܿ;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Ll/֡֡ܿ;-><init>(I)V

    .line 504
    invoke-interface {p0, v1}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    new-instance v1, Ll/ܶܶ᩷;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 505
    invoke-static {v1}, Ll/۠۬ᩴ;->comparingInt(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;

    move-result-object v1

    invoke-interface {p0, v1}, Ll/ܿ᩺ᩴ;->min(Ljava/util/Comparator;)Ll/ܽ۫ᩴ;

    move-result-object p0

    .line 506
    invoke-virtual {p0}, Ll/ܽ۫ᩴ;->isPresent()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 507
    invoke-virtual {p0}, Ll/ܽ۫ᩴ;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Ljava/lang/String;

    :cond_4
    if-eqz v0, :cond_5

    .line 511
    invoke-virtual {v5, v0}, Ll/ᩳܰۡ;->getEntry(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object p0

    if-eqz p0, :cond_5

    .line 513
    sget-object v0, Ll/ܽ֡ܿ;->ۢ:Ll/ܶ᩵ܿ;

    const-string v1, ".apk"

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->᩻(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 514
    :try_start_8
    invoke-virtual {v5, p0}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/ܶ᩵ܿ;->֫(Ljava/io/InputStream;)V

    .line 515
    invoke-static {v0}, Ll/ܿܺۡ;->֫(Ll/ܶ᩵ܿ;)Landroid/graphics/Bitmap;

    move-result-object p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 518
    :try_start_9
    invoke-virtual {v5}, Ll/ᩳܰۡ;->close()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_3
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 522
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    return-object p0

    :catchall_1
    move-exception p0

    goto :goto_5

    :goto_4
    move-object v0, v4

    .line 455
    :goto_5
    :try_start_a
    invoke-virtual {v5}, Ll/ᩳܰۡ;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    goto :goto_6

    :catchall_2
    move-exception v1

    :try_start_b
    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw p0
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_3
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    :catchall_3
    move-exception p0

    move-object v4, v0

    goto :goto_7

    :catch_3
    nop

    goto :goto_8

    .line 518
    :cond_5
    :try_start_c
    invoke-virtual {v5}, Ll/ᩳܰۡ;->close()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_4
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    goto :goto_9

    :catchall_4
    move-exception p0

    :goto_7
    if-eqz v4, :cond_6

    .line 522
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->۬()Z

    .line 524
    :cond_6
    throw p0

    :catch_4
    move-object v0, v4

    :goto_8
    if-eqz v0, :cond_7

    .line 522
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    :cond_7
    :goto_9
    return-object v4
.end method

.method public static ۧ(Landroid/graphics/Bitmap;)V
    .locals 3

    .line 533
    invoke-static {p0}, Ll/ۤ۫ۡ;->֫(Landroid/graphics/Bitmap;)F

    move-result v0

    const v1, 0x3f666666    # 0.9f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    goto :goto_0

    .line 536
    :cond_0
    invoke-static {p0}, Ll/۟۫ۡ;->֫(Landroid/graphics/Bitmap;)I

    move-result v0

    if-eqz v0, :cond_2

    const v1, -0x50506

    .line 540
    invoke-static {v0, v1}, Ll/۟۫ۡ;->ܽ(II)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    const/high16 v0, 0x40200000    # 2.5f

    const/high16 v1, -0x56000000

    .line 541
    invoke-static {p0, v0, v2, v2, v1}, Ll/ۤ۫ۡ;->֫(Landroid/graphics/Bitmap;FIII)V

    return-void

    :cond_1
    const v1, -0xcfcfd0

    .line 542
    invoke-static {v0, v1}, Ll/۟۫ۡ;->ܽ(II)Z

    move-result v0

    if-eqz v0, :cond_2

    const/high16 v0, 0x40600000    # 3.5f

    const/4 v1, -0x1

    .line 543
    invoke-static {p0, v0, v2, v2, v1}, Ll/ۤ۫ۡ;->֫(Landroid/graphics/Bitmap;FIII)V

    :cond_2
    :goto_0
    return-void
.end method

.method public static ܽ(Ll/ܶ᩵ܿ;)Ll/ۢ᩸ۜ;
    .locals 1

    .line 347
    sget v0, Ll/ܿܺۡ;->ۧ:I

    invoke-static {p0, v0}, Ll/ᩴ᩸ۜ;->֫(Ll/ܶ᩵ܿ;I)Ll/ۢ᩸ۜ;

    move-result-object p0

    return-object p0
.end method

.method public static ܿ(Ll/ܶ᩵ܿ;)Landroid/graphics/Bitmap;
    .locals 8

    .line 300
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ᩴ᩸ۜ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    sget v1, Ll/ܿܺۡ;->ۧ:I

    if-eqz v0, :cond_0

    .line 347
    invoke-static {p0, v1}, Ll/ᩴ᩸ۜ;->֫(Ll/ܶ᩵ܿ;I)Ll/ۢ᩸ۜ;

    move-result-object p0

    .line 341
    invoke-virtual {p0}, Ll/ۢ᩸ۜ;->֫()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    .line 305
    :cond_0
    new-instance v0, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v0}, Landroid/media/MediaMetadataRetriever;-><init>()V

    const/4 v2, 0x0

    .line 307
    :try_start_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->֡()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 308
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->֫֫()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    goto :goto_0

    .line 309
    :cond_1
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩵֫()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 310
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v3

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {v0, v3, p0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    goto :goto_0

    .line 311
    :cond_2
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x17

    if-lt v3, v4, :cond_3

    .line 312
    new-instance v3, Ll/᩺ۢۡ;

    invoke-direct {v3, p0}, Ll/᩺ۢۡ;-><init>(Ll/ܶ᩵ܿ;)V

    invoke-virtual {v0, v3}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/media/MediaDataSource;)V

    goto :goto_0

    .line 313
    :cond_3
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v3

    const-wide/32 v5, 0x80000

    cmp-long v7, v3, v5

    if-gtz v7, :cond_4

    .line 315
    sget-object v3, Ll/ܽ֡ܿ;->ۜ:Ll/ܶ᩵ܿ;

    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ᩴ֫()Ll/ܶ᩵ܿ;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 516
    :try_start_1
    invoke-virtual {p0, v3, v2, v2}, Ll/ܶ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ll/ܿ᩵ܿ;Ll/ۚ᩸ܿ;)V

    .line 317
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    .line 320
    :cond_4
    :try_start_2
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    move-object v3, v2

    :goto_1
    const-wide/16 v4, -0x1

    .line 322
    :try_start_3
    invoke-virtual {v0, v4, v5}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime(J)Landroid/graphics/Bitmap;

    move-result-object p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 327
    :try_start_4
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_2

    :catch_0
    nop

    :goto_2
    if-eqz v3, :cond_6

    .line 332
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->۬()Z

    goto :goto_4

    :catchall_0
    move-object v3, v2

    .line 327
    :catchall_1
    :try_start_5
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_3

    :catch_1
    nop

    :goto_3
    if-eqz v3, :cond_5

    .line 332
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->۬()Z

    :cond_5
    move-object p0, v2

    :cond_6
    :goto_4
    if-nez p0, :cond_7

    goto :goto_5

    .line 336
    :cond_7
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    .line 390
    invoke-static {p0, v1, v0, v2}, Ll/ܿܺۡ;->ۧ(Landroid/graphics/Bitmap;III)Landroid/graphics/Bitmap;

    move-result-object v2

    :goto_5
    return-object v2
.end method

.method public static ᩳ(Ll/ܶ᩵ܿ;)Landroid/graphics/Bitmap;
    .locals 5

    const/4 v0, 0x0

    .line 396
    :try_start_0
    new-instance v1, Ll/ᩳܰۡ;

    invoke-direct {v1, p0}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 397
    :try_start_1
    invoke-static {v1}, Ll/ܽܳ᩷;->ۧ(Ll/ᩳܰۡ;)Landroid/graphics/Bitmap;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 399
    invoke-static {p0}, Ll/ܿܺۡ;->֫(Landroid/graphics/Bitmap;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 405
    invoke-static {v1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-object p0

    :catchall_0
    move-exception p0

    move-object v0, v1

    goto :goto_0

    :catchall_1
    move-exception p0

    :goto_0
    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 406
    throw p0

    :catch_0
    move-object v1, v0

    .line 405
    :catch_1
    :cond_0
    invoke-static {v1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 409
    sget-object p0, Ll/ܿܺۡ;->ܽ:Ljava/lang/ref/WeakReference;

    if-eqz p0, :cond_1

    .line 410
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Landroid/graphics/Bitmap;

    :cond_1
    if-eqz v0, :cond_2

    return-object v0

    :cond_2
    const p0, 0x7f08029b

    .line 415
    invoke-static {p0}, Ll/ۙ᩸᩷;->֫(I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    .line 416
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    sget v1, Ll/ܿܺۡ;->ۧ:I

    invoke-static {v1, v1, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 417
    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 418
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->copyBounds()Landroid/graphics/Rect;

    move-result-object v3

    const/4 v4, 0x0

    .line 419
    invoke-virtual {p0, v4, v4, v1, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 420
    invoke-virtual {p0, v2}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 421
    invoke-virtual {p0, v3}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 422
    new-instance p0, Ljava/lang/ref/WeakReference;

    invoke-direct {p0, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object p0, Ll/ܿܺۡ;->ܽ:Ljava/lang/ref/WeakReference;

    return-object v0
.end method
