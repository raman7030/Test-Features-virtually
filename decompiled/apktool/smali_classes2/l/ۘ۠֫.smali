.class public final Ll/ۘ۠֫;
.super Ljava/lang/Object;
.source "LBKC"


# direct methods
.method public static ֫(II[B)Landroid/graphics/Bitmap;
    .locals 10

    const/4 v0, -0x1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p1, v0, :cond_0

    .line 56
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 58
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 59
    invoke-static {p2, v2, p0, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 60
    iget v3, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v4, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 62
    iput-boolean v2, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 63
    iput v1, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    :goto_0
    if-le v3, p1, :cond_1

    .line 66
    iget v4, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    mul-int/lit8 v4, v4, 0x2

    iput v4, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 67
    div-int/lit8 v3, v3, 0x2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 71
    :cond_1
    invoke-static {p2, v2, p0, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v3

    if-eqz v0, :cond_2

    .line 73
    iput v1, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    :cond_2
    if-eqz v3, :cond_4

    .line 82
    new-instance p0, Ljava/io/ByteArrayInputStream;

    invoke-direct {p0, p2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 83
    :try_start_0
    new-instance p1, Ll/۟ܿ֫;

    .line 4166
    invoke-direct {p1, p0, v2}, Ll/۟ܿ֫;-><init>(Ljava/io/InputStream;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 4741
    invoke-virtual {p1}, Ll/۟ܿ֫;->֫()I

    move-result p0

    packed-switch p0, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    const/16 v2, 0x5a

    goto :goto_1

    :pswitch_1
    const/16 v2, 0x10e

    goto :goto_1

    :pswitch_2
    const/16 v2, 0xb4

    :goto_1
    if-eqz v2, :cond_3

    .line 87
    new-instance v8, Landroid/graphics/Matrix;

    invoke-direct {v8}, Landroid/graphics/Matrix;-><init>()V

    int-to-float p0, v2

    .line 88
    invoke-virtual {v8, p0}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 94
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    .line 95
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 90
    invoke-static/range {v3 .. v9}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_3
    return-object v3

    :catchall_0
    move-exception p1

    .line 82
    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1

    .line 76
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    const-string p1, "Could not decode image data"

    invoke-static {p1, p0}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p0

    throw p0

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
