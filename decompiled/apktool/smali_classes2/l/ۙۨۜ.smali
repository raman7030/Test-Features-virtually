.class public final Ll/ۙۨۜ;
.super Ljava/lang/Object;
.source "Q6MT"


# instance fields
.field public final ֫:Ll/᩶ۨۜ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    sget-object v0, Ll/᩶ۨۜ;->֫:Ll/᩶ۨۜ;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v0, p0, Ll/ۙۨۜ;->֫:Ll/᩶ۨۜ;

    return-void
.end method

.method public static ֫(II)J
    .locals 4

    int-to-long v0, p0

    int-to-long p0, p1

    add-long/2addr v0, p0

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    .line 176
    div-long/2addr v0, p0

    return-wide v0
.end method

.method public static ֫(III)J
    .locals 2

    .line 180
    invoke-static {p0, p2}, Ll/ۙۨۜ;->֫(II)J

    move-result-wide v0

    invoke-static {p1, p2}, Ll/ۙۨۜ;->֫(II)J

    move-result-wide p0

    mul-long v0, v0, p0

    const-wide/16 p0, 0x4

    mul-long v0, v0, p0

    return-wide v0
.end method

.method public static ֫(Ll/᩺ۨۜ;Landroid/graphics/BitmapFactory$Options;Ll/᩶ۨۜ;)Landroid/graphics/Bitmap;
    .locals 2

    .line 148
    invoke-virtual {p0}, Ll/᩺ۨۜ;->ۜ()Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 150
    :try_start_0
    invoke-virtual {p0}, Ll/᩺ۨۜ;->ᩴ()Ljava/io/InputStream;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    .line 151
    :try_start_1
    instance-of p2, p0, Ljava/io/FileInputStream;

    if-eqz p2, :cond_0

    .line 152
    move-object p2, p0

    check-cast p2, Ljava/io/FileInputStream;

    invoke-virtual {p2}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object p2

    invoke-static {p2, v1, p1}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 154
    :try_start_2
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0

    return-object v1

    .line 151
    :cond_0
    :try_start_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Local source requires a file stream"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p1

    if-eqz p0, :cond_1

    .line 150
    :try_start_4
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    :try_start_5
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw p1
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Error; {:try_start_5 .. :try_end_5} :catch_0

    :catch_0
    move-exception p0

    goto :goto_1

    :catch_1
    move-exception p0

    goto :goto_1

    :catch_2
    move-exception p0

    :goto_1
    if-eqz v1, :cond_2

    .line 156
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 157
    :cond_2
    throw p0

    .line 161
    :cond_3
    :try_start_6
    invoke-static {p0, p2}, Ll/ۙۨۜ;->֫(Ll/᩺ۨۜ;Ll/᩶ۨۜ;)Ll/۠ۨۜ;

    move-result-object p0
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/lang/Error; {:try_start_6 .. :try_end_6} :catch_3

    .line 162
    :try_start_7
    invoke-static {p0, v1, p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 163
    invoke-virtual {p0}, Ll/۠ۨۜ;->֫()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 165
    :try_start_8
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_4
    .catch Ljava/lang/Error; {:try_start_8 .. :try_end_8} :catch_3

    return-object v1

    :catchall_2
    move-exception p1

    .line 161
    :try_start_9
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception p0

    :try_start_a
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_a .. :try_end_a} :catch_4
    .catch Ljava/lang/Error; {:try_start_a .. :try_end_a} :catch_3

    :catch_3
    move-exception p0

    goto :goto_3

    :catch_4
    move-exception p0

    goto :goto_3

    :catch_5
    move-exception p0

    :goto_3
    if-eqz v1, :cond_4

    .line 166
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 167
    :cond_4
    throw p0
.end method

.method public static ֫(I)Landroid/graphics/BitmapFactory$Options;
    .locals 2

    .line 137
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 138
    iput p0, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 139
    sget-object p0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    iput-object p0, v0, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    const/4 p0, 0x0

    .line 140
    iput-boolean p0, v0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 141
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt p0, v1, :cond_0

    sget-object p0, Landroid/graphics/ColorSpace$Named;->SRGB:Landroid/graphics/ColorSpace$Named;

    invoke-static {p0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object p0

    iput-object p0, v0, Landroid/graphics/BitmapFactory$Options;->inPreferredColorSpace:Landroid/graphics/ColorSpace;

    :cond_0
    return-object v0
.end method

.method public static ֫(Ll/᩺ۨۜ;Ll/᩶ۨۜ;)Ll/۠ۨۜ;
    .locals 1

    .line 172
    new-instance v0, Ll/۠ۨۜ;

    invoke-virtual {p0}, Ll/᩺ۨۜ;->ᩴ()Ljava/io/InputStream;

    move-result-object p0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v0, p0}, Ll/۠ۨۜ;-><init>(Ljava/io/InputStream;)V

    return-object v0
.end method

.method public static ֫(Ll/᩹ۨۜ;Ll/᩹ۛۜ;J)Ll/᩹ۨۜ;
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x1

    .line 266
    :goto_0
    iget-object v2, p0, Ll/᩹ۨۜ;->᩸:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    invoke-static {v3, v4, v1}, Ll/ۙۨۜ;->֫(III)J

    move-result-wide v3

    cmp-long v5, v3, p2

    if-lez v5, :cond_0

    mul-int/lit8 v1, v1, 0x2

    goto :goto_0

    :cond_0
    if-ne v1, v0, :cond_1

    .line 267
    invoke-virtual {p1}, Ll/᩹ۛۜ;->close()V

    invoke-virtual {p0}, Ll/᩹ۨۜ;->᩺ۧ()Ll/᩹ۨۜ;

    move-result-object p0

    return-object p0

    .line 268
    :cond_1
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p2

    invoke-static {p2, v1}, Ll/ۙۨۜ;->֫(II)J

    move-result-wide p2

    long-to-int p3, p2

    .line 269
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p2

    invoke-static {p2, v1}, Ll/ۙۨۜ;->֫(II)J

    move-result-wide v3

    long-to-int p2, v3

    .line 272
    :try_start_0
    invoke-static {v2, p3, p2, v0}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 273
    :try_start_1
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    move-result p3

    int-to-long v2, p3

    invoke-virtual {p1, v2, v3}, Ll/᩹ۛۜ;->ۧ(J)Z

    move-result p3

    if-eqz p3, :cond_2

    .line 274
    new-instance p3, Ll/᩹ۨۜ;

    iget p0, p0, Ll/᩹ۨۜ;->ۗ:I

    mul-int p0, p0, v1

    invoke-direct {p3, p2, p1, p0}, Ll/᩹ۨۜ;-><init>(Landroid/graphics/Bitmap;Ll/᩹ۛۜ;I)V

    return-object p3

    .line 273
    :cond_2
    new-instance p0, Ll/֨ۨۜ;

    const-string p3, "Scaled preview exceeded its budget"

    .line 330
    invoke-direct {p0, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 273
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :catchall_1
    move-exception p0

    const/4 p2, 0x0

    :goto_1
    if-eqz p2, :cond_3

    .line 278
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->recycle()V

    .line 279
    :cond_3
    invoke-virtual {p1}, Ll/᩹ۛۜ;->close()V

    .line 280
    throw p0
.end method

.method public static ֫(Ll/ۨۨۜ;Ll/᩶ۨۜ;)V
    .locals 3

    .line 133
    iget-wide v0, p0, Ll/ۨۨۜ;->ܽ:J

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/32 p0, 0x10000000

    cmp-long v2, v0, p0

    if-gtz v2, :cond_0

    return-void

    :cond_0
    new-instance p0, Ll/֨ۨۜ;

    const-string p1, "Image input exceeds byte limit"

    .line 330
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 133
    throw p0
.end method

.method public static ֫(Ll/᩺ۨۜ;Ll/ܶۨۜ;Ll/᩶ۨۜ;)V
    .locals 3

    .line 125
    invoke-virtual {p0}, Ll/᩺ۨۜ;->᩻()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Ll/ܶۨۜ;->ܿ:Ljava/lang/String;

    iget-object v2, p1, Ll/ܶۨۜ;->᩻:Ll/ۨۨۜ;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 127
    iget v0, p1, Ll/ܶۨۜ;->ۜ:I

    iget p1, p1, Ll/ܶۨۜ;->ۧ:I

    invoke-virtual {p2, v0, p1}, Ll/᩶ۨۜ;->֫(II)V

    .line 128
    invoke-static {v2, p2}, Ll/ۙۨۜ;->֫(Ll/ۨۨۜ;Ll/᩶ۨۜ;)V

    .line 129
    invoke-virtual {p0, v2}, Ll/᩺ۨۜ;->֫(Ll/ۨۨۜ;)V

    return-void

    .line 126
    :cond_0
    new-instance p0, Ll/ۛۨۜ;

    const-string p1, "Metadata belongs to another image source"

    .line 175
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 126
    throw p0
.end method

.method public static ۧ(Ll/᩺ۨۜ;Ll/᩶ۨۜ;)Landroid/graphics/BitmapFactory$Options;
    .locals 2

    .line 192
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v1, 0x1

    .line 193
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 194
    invoke-static {p0, v0, p1}, Ll/ۙۨۜ;->֫(Ll/᩺ۨۜ;Landroid/graphics/BitmapFactory$Options;Ll/᩶ۨۜ;)Landroid/graphics/Bitmap;

    return-object v0
.end method


# virtual methods
.method public final ֫(Ll/᩺ۨۜ;Ll/ۨۨۜ;Landroid/graphics/BitmapFactory$Options;)Ll/ܶۨۜ;
    .locals 11

    .line 39
    invoke-virtual {p1, p2}, Ll/᩺ۨۜ;->֫(Ll/ۨۨۜ;)V

    .line 40
    iget-object v1, p0, Ll/ۙۨۜ;->֫:Ll/᩶ۨۜ;

    invoke-static {p2, v1}, Ll/ۙۨۜ;->֫(Ll/ۨۨۜ;Ll/᩶ۨۜ;)V

    if-nez p3, :cond_0

    .line 41
    invoke-static {p1, v1}, Ll/ۙۨۜ;->ۧ(Ll/᩺ۨۜ;Ll/᩶ۨۜ;)Landroid/graphics/BitmapFactory$Options;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, p3

    .line 42
    :goto_0
    invoke-virtual {p1, p2}, Ll/᩺ۨۜ;->֫(Ll/ۨۨۜ;)V

    .line 43
    iget v3, v2, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    if-lez v3, :cond_6

    iget v4, v2, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    if-gtz v4, :cond_1

    goto/16 :goto_6

    .line 52
    :cond_1
    invoke-virtual {v1, v3, v4}, Ll/᩶ۨۜ;->֫(II)V

    .line 55
    iget-object v3, v2, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    const-string v4, "image/jpeg"

    .line 188
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x1

    const-wide/16 v6, -0x1

    if-nez v4, :cond_3

    const-string v4, "image/png"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    const-string v4, "image/webp"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    move-wide v9, v6

    const/4 v6, 0x1

    goto :goto_3

    .line 56
    :cond_3
    :goto_1
    invoke-static {p1, v1}, Ll/ۙۨۜ;->֫(Ll/᩺ۨۜ;Ll/᩶ۨۜ;)Ll/۠ۨۜ;

    move-result-object v1

    .line 58
    :try_start_0
    new-instance v3, Ll/۟ܿ֫;

    const/4 v4, 0x0

    .line 4166
    invoke-direct {v3, v1, v4}, Ll/۟ܿ֫;-><init>(Ljava/io/InputStream;I)V

    .line 59
    invoke-virtual {v3}, Ll/۟ܿ֫;->֫()I

    move-result v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lt v4, v5, :cond_4

    const/16 v9, 0x8

    if-gt v4, v9, :cond_4

    move v5, v4

    .line 62
    :cond_4
    :try_start_1
    invoke-static {v3}, Ll/ܿۨۡ;->֫(Ll/۟ܿ֫;)Ljava/lang/Long;

    move-result-object v3

    if-eqz v3, :cond_5

    .line 63
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v6
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object v2, v0

    goto :goto_4

    .line 70
    :catch_0
    :cond_5
    :goto_2
    :try_start_2
    invoke-virtual {v1}, Ll/۠ۨۜ;->֫()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 71
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 72
    invoke-virtual {p1, p2}, Ll/᩺ۨۜ;->֫(Ll/ۨۨۜ;)V

    move-wide v9, v6

    move v6, v5

    .line 74
    :goto_3
    new-instance v1, Ll/ܶۨۜ;

    invoke-virtual {p1}, Ll/᩺ۨۜ;->᩻()Ljava/lang/String;

    move-result-object v3

    iget v4, v2, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v5, v2, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    iget-object v7, v2, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    move-object v2, v1

    move-object v8, p2

    invoke-direct/range {v2 .. v10}, Ll/ܶۨۜ;-><init>(Ljava/lang/String;IIILjava/lang/String;Ll/ۨۨۜ;J)V

    return-object v1

    .line 56
    :goto_4
    :try_start_3
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception v0

    move-object v1, v0

    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw v2

    .line 44
    :cond_6
    :goto_6
    invoke-static {p1, v1}, Ll/ۙۨۜ;->֫(Ll/᩺ۨۜ;Ll/᩶ۨۜ;)Ll/۠ۨۜ;

    move-result-object v9

    .line 45
    :try_start_4
    invoke-static {v9}, Ll/᩺ۛۡ;->֫(Ljava/io/InputStream;)Ll/ۤۛۡ;

    move-result-object v7

    .line 46
    invoke-virtual {v9}, Ll/۠ۨۜ;->֫()V

    .line 47
    iget v2, v7, Ll/ۤۛۡ;->ܺ:I

    iget v3, v7, Ll/ۤۛۡ;->ᩳ:I

    invoke-virtual {v1, v2, v3}, Ll/᩶ۨۜ;->֫(II)V

    .line 48
    invoke-virtual {p1, p2}, Ll/᩺ۨۜ;->֫(Ll/ۨۨۜ;)V

    .line 49
    new-instance v1, Ll/ܶۨۜ;

    invoke-virtual {p1}, Ll/᩺ۨۜ;->᩻()Ljava/lang/String;

    move-result-object v3

    iget v4, v7, Ll/ۤۛۡ;->ܺ:I

    iget v5, v7, Ll/ۤۛۡ;->ᩳ:I

    move-object v2, v1

    move-object v6, p2

    invoke-direct/range {v2 .. v7}, Ll/ܶۨۜ;-><init>(Ljava/lang/String;IILl/ۨۨۜ;Ll/ۤۛۡ;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 50
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V

    return-object v1

    :catchall_2
    move-exception v0

    move-object v1, v0

    .line 44
    :try_start_5
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_7

    :catchall_3
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_7
    throw v1
.end method

.method public final ֫(Ll/᩺ۨۜ;Ll/ܶۨۜ;Ll/᩶ۛۜ;J)Ll/᩹ۨۜ;
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v3, p2

    move-wide/from16 v5, p4

    const-wide/16 v7, 0x0

    cmp-long v2, v5, v7

    if-lez v2, :cond_b

    .line 82
    iget-object v2, v1, Ll/ۙۨۜ;->֫:Ll/᩶ۨۜ;

    invoke-static {v0, v3, v2}, Ll/ۙۨۜ;->֫(Ll/᩺ۨۜ;Ll/ܶۨۜ;Ll/᩶ۨۜ;)V

    iget-object v4, v3, Ll/ܶۨۜ;->᩻:Ll/ۨۨۜ;

    iget v7, v3, Ll/ܶۨۜ;->ۧ:I

    iget v8, v3, Ll/ܶۨۜ;->ۜ:I

    .line 83
    iget-object v9, v3, Ll/ܶۨۜ;->ܳ:Ll/ۤۛۡ;

    if-eqz v9, :cond_0

    new-instance v8, Ll/ۨۘᩳ;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    iget-object v9, v1, Ll/ۙۨۜ;->֫:Ll/᩶ۨۜ;

    const/4 v7, 0x0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-wide/from16 v5, p4

    invoke-static/range {v2 .. v9}, Ll/᩷ܰۜ;->֫(Ll/᩺ۨۜ;Ll/ܶۨۜ;Ll/᩶ۛۜ;JLl/ܰܰۜ;Ll/ܿۖ᩷;Ll/᩶ۨۜ;)Ll/᩹ۨۜ;

    move-result-object v0

    return-object v0

    .line 84
    :cond_0
    invoke-virtual/range {p3 .. p3}, Ll/᩶ۛۜ;->֫()J

    move-result-wide v9

    invoke-static {v5, v6, v9, v10}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    const/4 v3, 0x1

    :goto_0
    if-lez v3, :cond_a

    .line 87
    invoke-static {v8, v3}, Ll/ۙۨۜ;->֫(II)J

    move-result-wide v9

    .line 88
    invoke-static {v7, v3}, Ll/ۙۨۜ;->֫(II)J

    move-result-wide v11

    .line 89
    invoke-static {v8, v7, v3}, Ll/ۙۨۜ;->֫(III)J

    move-result-wide v13

    const/16 v15, 0x800

    move-object/from16 v16, v2

    int-to-long v1, v15

    const/high16 v15, 0x40000000    # 2.0f

    cmp-long v17, v9, v1

    if-gtz v17, :cond_7

    cmp-long v17, v11, v1

    if-gtz v17, :cond_7

    mul-long v9, v9, v11

    const-wide/32 v1, 0x400000

    cmp-long v11, v9, v1

    if-gtz v11, :cond_7

    cmp-long v9, v13, v5

    if-lez v9, :cond_1

    goto/16 :goto_1

    :cond_1
    move-object/from16 v9, p3

    .line 95
    invoke-virtual {v9, v13, v14}, Ll/᩶ۛۜ;->֫(J)Ll/᩹ۛۜ;

    move-result-object v10

    if-nez v10, :cond_2

    .line 184
    invoke-static {v8, v7}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-ge v3, v1, :cond_9

    if-lt v3, v15, :cond_8

    goto/16 :goto_2

    :cond_2
    const/4 v11, 0x0

    .line 102
    :try_start_0
    invoke-virtual {v0, v4}, Ll/᩺ۨۜ;->֫(Ll/ۨۨۜ;)V

    .line 103
    invoke-static {v3}, Ll/ۙۨۜ;->֫(I)Landroid/graphics/BitmapFactory$Options;

    move-result-object v12

    move-object/from16 v13, v16

    invoke-static {v0, v12, v13}, Ll/ۙۨۜ;->֫(Ll/᩺ۨۜ;Landroid/graphics/BitmapFactory$Options;Ll/᩶ۨۜ;)Landroid/graphics/Bitmap;

    move-result-object v11

    .line 104
    invoke-virtual {v0, v4}, Ll/᩺ۨۜ;->֫(Ll/ۨۨۜ;)V

    if-eqz v11, :cond_5

    .line 106
    invoke-virtual {v11}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    move-result v12

    int-to-long v1, v12

    .line 107
    invoke-virtual {v11}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v12

    const/16 v14, 0x800

    if-gt v12, v14, :cond_3

    invoke-virtual {v11}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v12

    if-gt v12, v14, :cond_3

    .line 108
    invoke-virtual {v11}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v12

    move-object/from16 v16, v13

    int-to-long v12, v12

    invoke-virtual {v11}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v14

    int-to-long v14, v14

    mul-long v12, v12, v14

    const-wide/32 v14, 0x400000

    cmp-long v17, v12, v14

    if-gtz v17, :cond_4

    cmp-long v12, v1, v5

    if-gtz v12, :cond_4

    .line 109
    invoke-virtual {v10, v1, v2}, Ll/᩹ۛۜ;->ۧ(J)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 110
    new-instance v0, Ll/᩹ۨۜ;

    invoke-direct {v0, v11, v10, v3}, Ll/᩹ۨۜ;-><init>(Landroid/graphics/Bitmap;Ll/᩹ۛۜ;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :cond_3
    move-object/from16 v16, v13

    .line 116
    :cond_4
    invoke-virtual {v11}, Landroid/graphics/Bitmap;->recycle()V

    .line 117
    invoke-virtual {v10}, Ll/᩹ۛۜ;->close()V

    .line 184
    invoke-static {v8, v7}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-ge v3, v1, :cond_9

    const/high16 v1, 0x40000000    # 2.0f

    if-lt v3, v1, :cond_8

    goto :goto_2

    .line 105
    :cond_5
    :try_start_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Image preview could not be decoded"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    if-eqz v11, :cond_6

    .line 116
    invoke-virtual {v11}, Landroid/graphics/Bitmap;->recycle()V

    .line 117
    :cond_6
    invoke-virtual {v10}, Ll/᩹ۛۜ;->close()V

    .line 118
    throw v0

    :cond_7
    :goto_1
    move-object/from16 v9, p3

    .line 184
    invoke-static {v8, v7}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-ge v3, v1, :cond_9

    const/high16 v1, 0x40000000    # 2.0f

    if-lt v3, v1, :cond_8

    goto :goto_2

    :cond_8
    mul-int/lit8 v3, v3, 0x2

    goto :goto_3

    :cond_9
    :goto_2
    const/4 v1, 0x0

    const/4 v3, 0x0

    :goto_3
    move-object/from16 v1, p0

    move-object/from16 v2, v16

    goto/16 :goto_0

    .line 121
    :cond_a
    new-instance v0, Ll/֨ۨۜ;

    const-string v1, "No safe preview allocation fits the bitmap budget"

    .line 330
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 121
    throw v0

    .line 81
    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Preview byte limit must be positive"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
