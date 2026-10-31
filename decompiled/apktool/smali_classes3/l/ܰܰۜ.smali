.class public final Ll/ܰܰۜ;
.super Ljava/lang/Object;
.source "06MC"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ۗ:Ljava/lang/Thread;

.field public final ۙ:Ll/ܶۨۜ;

.field public ۤ:Ll/᩹ۛۜ;

.field public ۫:Ll/᩺ۛۡ;

.field public final ۬:Ll/᩺ۨۜ;

.field public final ᩶:Ljava/io/InputStream;

.field public ᩸:Z

.field public final ᩹:Landroid/graphics/BitmapRegionDecoder;


# direct methods
.method public constructor <init>(Ll/᩺ۨۜ;Ll/ܶۨۜ;Ljava/io/InputStream;Landroid/graphics/BitmapRegionDecoder;)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Ll/ܰܰۜ;->ۗ:Ljava/lang/Thread;

    .line 29
    iput-object p1, p0, Ll/ܰܰۜ;->۬:Ll/᩺ۨۜ;

    .line 30
    iput-object p2, p0, Ll/ܰܰۜ;->ۙ:Ll/ܶۨۜ;

    .line 31
    iput-object p3, p0, Ll/ܰܰۜ;->᩶:Ljava/io/InputStream;

    .line 32
    iput-object p4, p0, Ll/ܰܰۜ;->᩹:Landroid/graphics/BitmapRegionDecoder;

    return-void
.end method

.method public static ֫(Ll/᩺ۨۜ;Ll/ܶۨۜ;)Ll/ܰܰۜ;
    .locals 5

    .line 44
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_9

    .line 46
    sget-object v0, Ll/᩶ۨۜ;->֫:Ll/᩶ۨۜ;

    invoke-static {p0, p1, v0}, Ll/ۙۨۜ;->֫(Ll/᩺ۨۜ;Ll/ܶۨۜ;Ll/᩶ۨۜ;)V

    iget-object v1, p1, Ll/ܶۨۜ;->᩻:Ll/ۨۨۜ;

    .line 47
    iget-object v2, p1, Ll/ܶۨۜ;->ܽ:Ljava/lang/String;

    invoke-static {v2}, Ll/ܰܰۜ;->֫(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    const/4 v2, 0x0

    .line 52
    :try_start_0
    invoke-virtual {p0}, Ll/᩺ۨۜ;->ۜ()Ljava/io/File;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    .line 53
    invoke-virtual {p0}, Ll/᩺ۨۜ;->ᩴ()Ljava/io/InputStream;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 54
    :try_start_1
    instance-of v3, v0, Ljava/io/FileInputStream;

    if-eqz v3, :cond_0

    .line 55
    move-object v3, v0

    check-cast v3, Ljava/io/FileInputStream;

    invoke-virtual {v3}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object v3

    invoke-static {v3, v4}, Landroid/graphics/BitmapRegionDecoder;->newInstance(Ljava/io/FileDescriptor;Z)Landroid/graphics/BitmapRegionDecoder;

    move-result-object v2

    goto :goto_0

    .line 54
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v3, "Local source requires a file stream"

    invoke-direct {p1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    :cond_1
    :try_start_2
    invoke-static {p0, v0}, Ll/ۙۨۜ;->֫(Ll/᩺ۨۜ;Ll/᩶ۨۜ;)Ll/۠ۨۜ;

    move-result-object v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 58
    :try_start_3
    invoke-static {v0, v4}, Landroid/graphics/BitmapRegionDecoder;->newInstance(Ljava/io/InputStream;Z)Landroid/graphics/BitmapRegionDecoder;

    move-result-object v2

    .line 59
    invoke-virtual {v0}, Ll/۠ۨۜ;->֫()V

    .line 61
    :goto_0
    invoke-virtual {p0, v1}, Ll/᩺ۨۜ;->֫(Ll/ۨۨۜ;)V

    if-eqz v2, :cond_3

    .line 63
    invoke-virtual {v2}, Landroid/graphics/BitmapRegionDecoder;->getWidth()I

    move-result v3

    iget v4, p1, Ll/ܶۨۜ;->ۜ:I

    if-ne v3, v4, :cond_2

    invoke-virtual {v2}, Landroid/graphics/BitmapRegionDecoder;->getHeight()I

    move-result v3

    iget v4, p1, Ll/ܶۨۜ;->ۧ:I

    if-ne v3, v4, :cond_2

    .line 65
    new-instance v3, Ll/ܰܰۜ;

    invoke-direct {v3, p0, p1, v0, v2}, Ll/ܰܰۜ;-><init>(Ll/᩺ۨۜ;Ll/ܶۨۜ;Ljava/io/InputStream;Landroid/graphics/BitmapRegionDecoder;)V

    return-object v3

    .line 64
    :cond_2
    new-instance p1, Ll/ۛۨۜ;

    const-string v3, "Region decoder dimensions changed"

    .line 175
    invoke-direct {p1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 64
    throw p1

    .line 62
    :cond_3
    new-instance p1, Ll/᩺ܰۜ;

    const-string v3, "Platform rejected region decoding"

    .line 177
    invoke-direct {p1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 62
    throw p1
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p0

    move-object p1, v2

    move-object v2, v0

    move-object v0, v2

    move-object v2, p1

    goto :goto_3

    :catch_0
    move-exception p1

    goto :goto_1

    :catchall_1
    move-exception p0

    move-object v0, v2

    goto :goto_3

    :catch_1
    move-exception p1

    move-object v0, v2

    .line 71
    :goto_1
    :try_start_4
    invoke-virtual {p0, v1}, Ll/᩺ۨۜ;->֫(Ll/ۨۨۜ;)V

    .line 72
    instance-of p0, p1, Ll/ۛۨۜ;

    if-nez p0, :cond_5

    instance-of p0, p1, Ll/᩺ܰۜ;

    if-eqz p0, :cond_4

    goto :goto_2

    .line 74
    :cond_4
    new-instance p0, Ll/᩺ܰۜ;

    const-string v1, "Platform could not open a region decoder"

    .line 178
    invoke-direct {p0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 74
    throw p0

    .line 73
    :cond_5
    :goto_2
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p0

    :goto_3
    if-eqz v2, :cond_6

    .line 76
    invoke-virtual {v2}, Landroid/graphics/BitmapRegionDecoder;->recycle()V

    :cond_6
    if-eqz v0, :cond_7

    .line 77
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 78
    :cond_7
    throw p0

    .line 48
    :cond_8
    new-instance p0, Ll/᩺ܰۜ;

    const-string p1, "Image format does not support region decoding"

    .line 177
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 48
    throw p0

    .line 45
    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Tile decoder must be opened on a worker thread"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/᩺ۨۜ;Ll/ܶۨۜ;Ll/᩶ۛۜ;Ll/ܿۖ᩷;)Ll/ܰܰۜ;
    .locals 3

    .line 84
    sget-object v0, Ll/᩶ۨۜ;->֫:Ll/᩶ۨۜ;

    invoke-static {p0, p1, v0}, Ll/ۙۨۜ;->֫(Ll/᩺ۨۜ;Ll/ܶۨۜ;Ll/᩶ۨۜ;)V

    iget-object v0, p1, Ll/ܶۨۜ;->ܳ:Ll/ۤۛۡ;

    .line 85
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    if-eq v1, v2, :cond_3

    .line 86
    invoke-virtual {p0}, Ll/᩺ۨۜ;->ۜ()Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    .line 87
    invoke-virtual {v0, v1}, Ll/ۤۛۡ;->֫(Z)J

    move-result-wide v1

    invoke-virtual {p2, v1, v2}, Ll/᩶ۛۜ;->֫(J)Ll/᩹ۛۜ;

    move-result-object p2

    if-eqz p2, :cond_1

    const/4 v1, 0x0

    .line 91
    :try_start_0
    invoke-virtual {p0}, Ll/᩺ۨۜ;->ۜ()Ljava/io/File;

    move-result-object v2

    invoke-static {v2, v0, p3}, Ll/᩺ۛۡ;->֫(Ljava/io/File;Ll/ۤۛۡ;Ll/ܿۖ᩷;)Ll/᩺ۛۡ;

    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 93
    :try_start_1
    iget-object v0, p1, Ll/ܶۨۜ;->᩻:Ll/ۨۨۜ;

    invoke-virtual {p0, v0}, Ll/᩺ۨۜ;->֫(Ll/ۨۨۜ;)V

    .line 94
    new-instance v0, Ll/ܰܰۜ;

    invoke-direct {v0, p0, p1, v1, v1}, Ll/ܰܰۜ;-><init>(Ll/᩺ۨۜ;Ll/ܶۨۜ;Ljava/io/InputStream;Landroid/graphics/BitmapRegionDecoder;)V

    .line 95
    iput-object p3, v0, Ll/ܰܰۜ;->۫:Ll/᩺ۛۡ;

    .line 96
    iput-object p2, v0, Ll/ܰܰۜ;->ۤ:Ll/᩹ۛۜ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object v0

    :catchall_0
    move-exception p0

    move-object v1, p3

    goto :goto_0

    :catchall_1
    move-exception p0

    :goto_0
    if-eqz v1, :cond_0

    .line 101
    :try_start_2
    invoke-virtual {v1}, Ll/᩺ۛۡ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception p0

    .line 102
    invoke-virtual {p2}, Ll/᩹ۛۜ;->close()V

    throw p0

    :cond_0
    :goto_1
    invoke-virtual {p2}, Ll/᩹ۛۜ;->close()V

    .line 103
    throw p0

    .line 88
    :cond_1
    new-instance p0, Ll/֨ۨۜ;

    const-string p1, "TGA index exceeds bitmap budget"

    .line 330
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 88
    throw p0

    .line 86
    :cond_2
    new-instance p0, Ll/᩺ܰۜ;

    const-string p1, "TGA regions require a prepared local file"

    .line 177
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 86
    throw p0

    .line 85
    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "TGA decoder requires a worker"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "image/x-tga"

    .line 172
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "image/jpeg"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "image/png"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "image/webp"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 158
    iget-object v0, p0, Ll/ܰܰۜ;->᩶:Ljava/io/InputStream;

    .line 152
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    iget-object v2, p0, Ll/ܰܰۜ;->ۗ:Ljava/lang/Thread;

    if-ne v1, v2, :cond_7

    .line 159
    iget-boolean v1, p0, Ll/ܰܰۜ;->᩸:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    .line 160
    iput-boolean v1, p0, Ll/ܰܰۜ;->᩸:Z

    .line 162
    :try_start_0
    iget-object v1, p0, Ll/ܰܰۜ;->᩹:Landroid/graphics/BitmapRegionDecoder;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/graphics/BitmapRegionDecoder;->recycle()V

    .line 163
    :cond_1
    iget-object v1, p0, Ll/ܰܰۜ;->۫:Ll/᩺ۛۡ;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ll/᩺ۛۡ;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 165
    :cond_2
    iget-object v1, p0, Ll/ܰܰۜ;->ۤ:Ll/᩹ۛۜ;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ll/᩹ۛۜ;->close()V

    :cond_3
    if-eqz v0, :cond_4

    .line 166
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    :cond_4
    :goto_0
    return-void

    :catchall_0
    move-exception v1

    .line 165
    iget-object v2, p0, Ll/ܰܰۜ;->ۤ:Ll/᩹ۛۜ;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ll/᩹ۛۜ;->close()V

    :cond_5
    if-eqz v0, :cond_6

    .line 166
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 167
    :cond_6
    throw v1

    .line 153
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Tile decoder must stay on its opening worker thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Landroid/graphics/Rect;ILl/᩶ۛۜ;Ll/ܿۖ᩷;)Ll/᩹ۨۜ;
    .locals 8

    .line 152
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Ll/ܰܰۜ;->ۗ:Ljava/lang/Thread;

    if-ne v0, v1, :cond_c

    .line 115
    iget-boolean v0, p0, Ll/ܰܰۜ;->᩸:Z

    if-nez v0, :cond_b

    .line 116
    invoke-virtual {p1}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a

    iget v0, p1, Landroid/graphics/Rect;->left:I

    if-ltz v0, :cond_a

    iget v0, p1, Landroid/graphics/Rect;->top:I

    if-ltz v0, :cond_a

    iget v0, p1, Landroid/graphics/Rect;->right:I

    iget-object v1, p0, Ll/ܰܰۜ;->ۙ:Ll/ܶۨۜ;

    iget v2, v1, Ll/ܶۨۜ;->ۜ:I

    iget-object v3, v1, Ll/ܶۨۜ;->᩻:Ll/ۨۨۜ;

    if-gt v0, v2, :cond_a

    iget v0, p1, Landroid/graphics/Rect;->bottom:I

    iget v1, v1, Ll/ܶۨۜ;->ۧ:I

    if-gt v0, v1, :cond_a

    if-lez p2, :cond_a

    add-int/lit8 v0, p2, -0x1

    and-int/2addr v0, p2

    if-nez v0, :cond_a

    .line 120
    iget-object v0, p0, Ll/ܰܰۜ;->۬:Ll/᩺ۨۜ;

    invoke-virtual {v0, v3}, Ll/᩺ۨۜ;->֫(Ll/ۨۨۜ;)V

    .line 121
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v1

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result v2

    invoke-static {v1, v2, p2}, Ll/ۙۨۜ;->֫(III)J

    move-result-wide v1

    .line 122
    invoke-virtual {p3, v1, v2}, Ll/᩶ۛۜ;->֫(J)Ll/᩹ۛۜ;

    move-result-object v1

    if-eqz v1, :cond_9

    const/4 v2, 0x0

    .line 127
    :try_start_0
    iget-object v4, p0, Ll/ܰܰۜ;->۫:Ll/᩺ۛۡ;

    if-eqz v4, :cond_1

    .line 128
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v4

    invoke-static {v4, p2}, Ll/ۙۨۜ;->֫(II)J

    move-result-wide v4

    const-wide/16 v6, 0x4

    mul-long v4, v4, v6

    invoke-virtual {p3, v4, v5}, Ll/᩶ۛۜ;->֫(J)Ll/᩹ۛۜ;

    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-eqz p3, :cond_0

    goto :goto_0

    .line 129
    :cond_0
    :try_start_1
    new-instance p1, Ll/֨ۨۜ;

    const-string p2, "TGA row exceeds bitmap budget"

    .line 330
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 129
    throw p1

    :cond_1
    move-object p3, v2

    .line 131
    :goto_0
    iget-object v4, p0, Ll/ܰܰۜ;->۫:Ll/᩺ۛۡ;

    if-nez v4, :cond_2

    iget-object v4, p0, Ll/ܰܰۜ;->᩹:Landroid/graphics/BitmapRegionDecoder;

    invoke-static {p2}, Ll/ۙۨۜ;->֫(I)Landroid/graphics/BitmapFactory$Options;

    move-result-object v5

    invoke-virtual {v4, p1, v5}, Landroid/graphics/BitmapRegionDecoder;->decodeRegion(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p1

    goto :goto_1

    .line 132
    :cond_2
    invoke-virtual {v4, p1, p2, p4}, Ll/᩺ۛۡ;->֫(Landroid/graphics/Rect;ILl/ܿۖ᩷;)Landroid/graphics/Bitmap;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 133
    :goto_1
    :try_start_2
    invoke-static {p4}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    .line 134
    iget-object p4, p0, Ll/ܰܰۜ;->᩶:Ljava/io/InputStream;

    instance-of v2, p4, Ll/۠ۨۜ;

    if-eqz v2, :cond_3

    .line 135
    check-cast p4, Ll/۠ۨۜ;

    invoke-virtual {p4}, Ll/۠ۨۜ;->֫()V

    .line 136
    :cond_3
    invoke-virtual {v0, v3}, Ll/᩺ۨۜ;->֫(Ll/ۨۨۜ;)V

    if-eqz p1, :cond_6

    .line 138
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    move-result p4

    int-to-long v2, p4

    invoke-virtual {v1, v2, v3}, Ll/᩹ۛۜ;->ۧ(J)Z

    move-result p4

    if-eqz p4, :cond_5

    .line 140
    new-instance p4, Ll/᩹ۨۜ;

    invoke-direct {p4, p1, v1, p2}, Ll/᩹ۨۜ;-><init>(Landroid/graphics/Bitmap;Ll/᩹ۛۜ;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p3, :cond_4

    .line 147
    invoke-virtual {p3}, Ll/᩹ۛۜ;->close()V

    :cond_4
    return-object p4

    .line 139
    :cond_5
    :try_start_3
    new-instance p2, Ll/֨ۨۜ;

    const-string p4, "Tile allocation exceeds bitmap budget"

    .line 330
    invoke-direct {p2, p4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 139
    throw p2

    .line 137
    :cond_6
    new-instance p2, Ljava/io/IOException;

    const-string p4, "Image region could not be decoded"

    invoke-direct {p2, p4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p2

    move-object v2, p1

    move-object p1, p2

    goto :goto_2

    :catchall_1
    move-exception p1

    goto :goto_2

    :catchall_2
    move-exception p1

    move-object p3, v2

    :goto_2
    if-eqz v2, :cond_7

    .line 145
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 146
    :cond_7
    invoke-virtual {v1}, Ll/᩹ۛۜ;->close()V

    if-eqz p3, :cond_8

    .line 147
    invoke-virtual {p3}, Ll/᩹ۛۜ;->close()V

    .line 148
    :cond_8
    throw p1

    .line 123
    :cond_9
    new-instance p1, Ll/֨ۨۜ;

    const-string p2, "Tile reservation exceeds bitmap budget"

    .line 330
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 123
    throw p1

    .line 119
    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid region or sample size"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 115
    :cond_b
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Tile decoder is closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 153
    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Tile decoder must stay on its opening worker thread"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
