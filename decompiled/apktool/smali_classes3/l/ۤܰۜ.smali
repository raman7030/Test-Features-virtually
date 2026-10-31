.class public final Ll/ۤܰۜ;
.super Ljava/lang/Object;
.source "I6M7"

# interfaces
.implements Ll/֨ۛۜ;


# static fields
.field public static final ֡֫:Ljava/util/concurrent/ExecutorService;


# instance fields
.field public final ֫֫:I

.field public final ۖ֫:Landroid/graphics/Paint;

.field public final ۗ:Landroid/graphics/Canvas;

.field public ۘ֫:Z

.field public ۙ:Z

.field public final ۛ:Landroid/graphics/Paint;

.field public ۜ֫:J

.field public ۟:I

.field public final ۡ֫:J

.field public ۢ֫:Landroid/graphics/Bitmap;

.field public final ۤ:Landroid/graphics/Bitmap;

.field public ۧ֫:[B

.field public ۨ:Z

.field public ۫:I

.field public volatile ۬:Z

.field public ܰ:I

.field public final ܳ֫:Ll/᩹ۛۜ;

.field public ܺ֫:J

.field public final ܽ֫:Ll/ܽۨۜ;

.field public ܿ֫:Ljava/lang/Runnable;

.field public final ᩳ֫:Ll/᩸ۛۜ;

.field public final ᩴ֫:Ll/ۙܰۜ;

.field public final ᩵֫:I

.field public final ᩶:Landroid/graphics/Paint;

.field public final ᩷֫:I

.field public ᩸:Z

.field public final ᩹:Landroid/graphics/RectF;

.field public ᩺:Landroid/graphics/Bitmap;

.field public final ᩻֫:Landroid/os/Handler;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 31
    new-instance v0, Ll/۬ܰۜ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Ll/ۤܰۜ;->֡֫:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public constructor <init>(Ll/᩸ۛۜ;Ll/ܽۨۜ;Ll/᩹ۛۜ;[BLandroid/graphics/Bitmap;IJ)V
    .locals 4

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Ll/ۤܰۜ;->᩶:Landroid/graphics/Paint;

    .line 41
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Ll/ۤܰۜ;->ۖ֫:Landroid/graphics/Paint;

    .line 42
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Ll/ۤܰۜ;->ۛ:Landroid/graphics/Paint;

    .line 43
    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    iput-object v2, p0, Ll/ۤܰۜ;->᩹:Landroid/graphics/RectF;

    .line 44
    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v2, p0, Ll/ۤܰۜ;->᩻֫:Landroid/os/Handler;

    .line 45
    new-instance v2, Ll/ۙܰۜ;

    invoke-direct {v2, p0}, Ll/ۙܰۜ;-><init>(Ll/ۤܰۜ;)V

    iput-object v2, p0, Ll/ۤܰۜ;->ᩴ֫:Ll/ۙܰۜ;

    .line 55
    iput-wide p7, p0, Ll/ۤܰۜ;->ۡ֫:J

    .line 56
    iput-object p1, p0, Ll/ۤܰۜ;->ᩳ֫:Ll/᩸ۛۜ;

    iput-object p2, p0, Ll/ۤܰۜ;->ܽ֫:Ll/ܽۨۜ;

    iput-object p3, p0, Ll/ۤܰۜ;->ܳ֫:Ll/᩹ۛۜ;

    iput-object p4, p0, Ll/ۤܰۜ;->ۧ֫:[B

    .line 57
    iput-object p5, p0, Ll/ۤܰۜ;->ۤ:Landroid/graphics/Bitmap;

    iput p6, p0, Ll/ۤܰۜ;->᩷֫:I

    .line 58
    iget p1, p2, Ll/ܽۨۜ;->ۡ:I

    iput p1, p0, Ll/ۤܰۜ;->᩵֫:I

    iget p1, p2, Ll/ܽۨۜ;->ܿ:I

    iput p1, p0, Ll/ۤܰۜ;->֫֫:I

    .line 59
    new-instance p1, Landroid/graphics/Canvas;

    invoke-direct {p1, p5}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object p1, p0, Ll/ۤܰۜ;->ۗ:Landroid/graphics/Canvas;

    .line 60
    new-instance p1, Landroid/graphics/PorterDuffXfermode;

    sget-object p3, Landroid/graphics/PorterDuff$Mode;->SRC:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {p1, p3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 61
    new-instance p1, Landroid/graphics/PorterDuffXfermode;

    invoke-direct {p1, p3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 62
    iget p1, p2, Ll/ܽۨۜ;->֫:I

    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 63
    iget-object p1, p2, Ll/ܽۨۜ;->ᩳ:Ljava/util/ArrayList;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۧۨۜ;

    iget p1, p1, Ll/ۧۨۜ;->ۧ:I

    const/16 p2, 0x14

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    int-to-long p1, p1

    iput-wide p1, p0, Ll/ۤܰۜ;->ܺ֫:J

    return-void
.end method

.method public static ֫(Ll/᩸ۛۜ;Ll/ܽۨۜ;Ll/ۡ᩺ۜ;)I
    .locals 10

    .line 110
    iget v5, p1, Ll/ܽۨۜ;->ۧ:I

    const/4 v7, 0x1

    if-nez v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v8, v5, 0x6

    .line 111
    new-array v9, v8, [B

    .line 112
    iget v0, p1, Ll/ܽۨۜ;->ܽ:I

    int-to-long v1, v0

    const/4 v4, 0x6

    move-object v0, p0

    move-object v3, v9

    move-object v6, p2

    invoke-virtual/range {v0 .. v6}, Ll/᩸ۛۜ;->֫(J[BIILl/ܿۖ᩷;)V

    const-string p0, "Exif\u0000\u0000"

    const/4 p2, 0x6

    .line 114
    invoke-static {p0, p2, v9}, Ll/ᩳۨۜ;->֫(Ljava/lang/String;I[B)Z

    move-result v0

    const/4 v1, 0x0

    .line 115
    invoke-static {p0, v1, v9}, Ll/ᩳۨۜ;->ۧ(Ljava/lang/String;I[B)V

    .line 117
    :try_start_0
    new-instance p0, Ll/۟ܿ֫;

    new-instance v1, Ljava/io/ByteArrayInputStream;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    if-eqz v0, :cond_2

    .line 118
    iget v8, p1, Ll/ܽۨۜ;->ۧ:I

    :cond_2
    invoke-direct {v1, v9, p2, v8}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    invoke-direct {p0, v1, v7}, Ll/۟ܿ֫;-><init>(Ljava/io/InputStream;I)V

    .line 119
    invoke-virtual {p0}, Ll/۟ܿ֫;->֫()I

    move-result p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-lt p0, v7, :cond_3

    const/16 p1, 0x8

    if-gt p0, p1, :cond_3

    return p0

    :catch_0
    :cond_3
    :goto_1
    return v7
.end method

.method private ֫(ILl/ܿۖ᩷;)Landroid/graphics/Bitmap;
    .locals 16

    move-object/from16 v1, p0

    move/from16 v0, p1

    .line 126
    iget-object v2, v1, Ll/ۤܰۜ;->᩹:Landroid/graphics/RectF;

    iget-object v3, v1, Ll/ۤܰۜ;->ܽ֫:Ll/ܽۨۜ;

    iget-object v4, v3, Ll/ܽۨۜ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۧۨۜ;

    .line 127
    iget-object v5, v1, Ll/ۤܰۜ;->ۧ֫:[B

    array-length v5, v5

    const/16 v6, 0x1e

    add-int/2addr v5, v6

    iget v7, v4, Ll/ۧۨۜ;->ᩳ:I

    add-int/2addr v5, v7

    new-array v14, v5, [B

    const-string v7, "RIFF"

    const/4 v8, 0x0

    .line 128
    invoke-static {v7, v8, v14}, Ll/ᩳۨۜ;->ۧ(Ljava/lang/String;I[B)V

    const/16 v7, 0x8

    sub-int/2addr v5, v7

    const/4 v9, 0x4

    .line 235
    invoke-static {v9, v5, v14}, Ll/ᩳۨۜ;->֫(II[B)V

    const/16 v9, 0x18

    ushr-int/2addr v5, v9

    int-to-byte v5, v5

    const/4 v10, 0x7

    aput-byte v5, v14, v10

    const-string v5, "WEBP"

    .line 128
    invoke-static {v5, v7, v14}, Ll/ᩳۨۜ;->ۧ(Ljava/lang/String;I[B)V

    const/16 v5, 0xc

    const-string v7, "VP8X"

    .line 129
    invoke-static {v7, v5, v14}, Ll/ᩳۨۜ;->ۧ(Ljava/lang/String;I[B)V

    const/16 v5, 0xa

    const/16 v7, 0x10

    .line 235
    invoke-static {v7, v5, v14}, Ll/ᩳۨۜ;->֫(II[B)V

    const/16 v5, 0x13

    int-to-byte v10, v8

    aput-byte v10, v14, v5

    .line 130
    iget-object v5, v1, Ll/ۤܰۜ;->ۧ֫:[B

    array-length v5, v5

    if-nez v5, :cond_0

    const/4 v5, 0x0

    goto :goto_0

    :cond_0
    const/16 v5, 0x20

    :goto_0
    or-int/2addr v5, v7

    int-to-byte v5, v5

    const/16 v7, 0x14

    aput-byte v5, v14, v7

    .line 131
    iget v5, v4, Ll/ۧۨۜ;->᩻:I

    const/4 v15, 0x1

    sub-int/2addr v5, v15

    invoke-static {v9, v5, v14}, Ll/ᩳۨۜ;->֫(II[B)V

    iget v5, v4, Ll/ۧۨۜ;->ܽ:I

    sub-int/2addr v5, v15

    const/16 v7, 0x1b

    invoke-static {v7, v5, v14}, Ll/ᩳۨۜ;->֫(II[B)V

    .line 132
    iget-object v5, v1, Ll/ۤܰۜ;->ۧ֫:[B

    array-length v7, v5

    invoke-static {v5, v8, v14, v6, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 133
    iget v5, v4, Ll/ۧۨۜ;->ܿ:I

    int-to-long v8, v5

    iget-object v5, v1, Ll/ۤܰۜ;->ۧ֫:[B

    array-length v5, v5

    add-int/lit8 v11, v5, 0x1e

    iget v12, v4, Ll/ۧۨۜ;->ᩳ:I

    iget-object v7, v1, Ll/ۤܰۜ;->ᩳ֫:Ll/᩸ۛۜ;

    move-object v10, v14

    move-object/from16 v13, p2

    invoke-virtual/range {v7 .. v13}, Ll/᩸ۛۜ;->֫(J[BIILl/ܿۖ᩷;)V

    .line 134
    invoke-static/range {p2 .. p2}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    .line 135
    iget v5, v4, Ll/ۧۨۜ;->᩻:I

    int-to-double v5, v5

    iget-object v7, v1, Ll/ۤܰۜ;->ۤ:Landroid/graphics/Bitmap;

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    int-to-double v8, v8

    mul-double v5, v5, v8

    iget v8, v1, Ll/ۤܰۜ;->᩵֫:I

    int-to-double v9, v8

    div-double/2addr v5, v9

    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v5

    double-to-int v5, v5

    invoke-static {v15, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 136
    iget v6, v4, Ll/ۧۨۜ;->ܽ:I

    int-to-double v9, v6

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    int-to-double v11, v6

    mul-double v9, v9, v11

    iget v6, v1, Ll/ۤܰۜ;->֫֫:I

    int-to-double v11, v6

    div-double/2addr v9, v11

    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v9

    double-to-int v9, v9

    const/4 v10, 0x1

    invoke-static {v10, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    .line 137
    invoke-static {v14}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v10

    invoke-static {v10}, Landroid/graphics/ImageDecoder;->createSource(Ljava/nio/ByteBuffer;)Landroid/graphics/ImageDecoder$Source;

    move-result-object v10

    new-instance v11, Ll/ۗܰۜ;

    invoke-direct {v11, v5, v9}, Ll/ۗܰۜ;-><init>(II)V

    invoke-static {v10, v11}, Landroid/graphics/ImageDecoder;->decodeBitmap(Landroid/graphics/ImageDecoder$Source;Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 143
    :try_start_0
    invoke-static/range {p2 .. p2}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    .line 144
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    move-result v9

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    move-result v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-gt v9, v10, :cond_5

    .line 146
    iget-object v9, v1, Ll/ۤܰۜ;->ۗ:Landroid/graphics/Canvas;

    if-nez v0, :cond_1

    :try_start_1
    iget v0, v3, Ll/ܽۨۜ;->֫:I

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v9, v0, v3}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 147
    :cond_1
    iget v0, v4, Ll/ۧۨۜ;->ۜ:I

    int-to-float v0, v0

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    int-to-float v3, v3

    mul-float v0, v0, v3

    int-to-float v3, v8

    div-float/2addr v0, v3

    iget v8, v4, Ll/ۧۨۜ;->᩷:I

    int-to-float v8, v8

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v10

    int-to-float v10, v10

    mul-float v8, v8, v10

    int-to-float v6, v6

    div-float/2addr v8, v6

    iget v10, v4, Ll/ۧۨۜ;->ۜ:I

    iget v11, v4, Ll/ۧۨۜ;->᩻:I

    add-int/2addr v10, v11

    int-to-float v10, v10

    .line 148
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v11

    int-to-float v11, v11

    mul-float v10, v10, v11

    div-float/2addr v10, v3

    iget v3, v4, Ll/ۧۨۜ;->᩷:I

    iget v11, v4, Ll/ۧۨۜ;->ܽ:I

    add-int/2addr v3, v11

    int-to-float v3, v3

    .line 149
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v11

    int-to-float v11, v11

    mul-float v3, v3, v11

    div-float/2addr v3, v6

    .line 147
    invoke-virtual {v2, v0, v8, v10, v3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 150
    iget-boolean v0, v4, Ll/ۧۨۜ;->ܳ:Z

    if-eqz v0, :cond_2

    iget-object v0, v1, Ll/ۤܰۜ;->ۖ֫:Landroid/graphics/Paint;

    goto :goto_1

    :cond_2
    iget-object v0, v1, Ll/ۤܰۜ;->᩶:Landroid/graphics/Paint;

    :goto_1
    const/4 v3, 0x0

    invoke-virtual {v9, v5, v3, v2, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 151
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const/4 v3, 0x0

    invoke-virtual {v7, v0, v3}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 153
    iget-boolean v3, v4, Ll/ۧۨۜ;->֫:Z

    if-eqz v3, :cond_3

    iget-object v3, v1, Ll/ۤܰۜ;->ۛ:Landroid/graphics/Paint;

    invoke-virtual {v9, v2, v3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 155
    :cond_3
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->recycle()V

    return-object v0

    .line 152
    :cond_4
    :try_start_2
    new-instance v0, Ljava/io/IOException;

    const-string v2, "WebP frame could not be copied"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 145
    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v2, "WebP subframe allocation exceeds reservation"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v0

    .line 155
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->recycle()V

    throw v0
.end method

.method public static ֫(Ll/᩺ۨۜ;Ll/ۨۨۜ;Ll/᩶ۛۜ;JLl/ۡ᩺ۜ;)Ll/ۤܰۜ;
    .locals 28

    move-wide/from16 v8, p3

    move-object/from16 v0, p5

    const-wide/32 v1, 0x10000

    move-object/from16 v10, p2

    .line 68
    invoke-virtual {v10, v1, v2}, Ll/᩶ۛۜ;->֫(J)Ll/᩹ۛۜ;

    move-result-object v12

    if-eqz v12, :cond_5

    .line 74
    :try_start_0
    new-instance v13, Ll/᩸ۛۜ;

    move-object/from16 v14, p0

    invoke-direct {v13, v14}, Ll/᩸ۛۜ;-><init>(Ll/᩺ۨۜ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_14
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_13
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_12

    .line 75
    :try_start_1
    invoke-static {v13, v8, v9, v12, v0}, Ll/ۤܰۜ;->֫(Ll/᩸ۛۜ;JLl/᩹ۛۜ;Ll/ۡ᩺ۜ;)Ll/ܽۨۜ;

    move-result-object v11

    iget-object v3, v11, Ll/ܽۨۜ;->ᩳ:Ljava/util/ArrayList;

    .line 77
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    int-to-long v4, v4

    const-wide/16 v6, 0x80

    mul-long v4, v4, v6

    add-long/2addr v4, v1

    iget v15, v11, Ll/ܽۨۜ;->ܳ:I

    int-to-long v1, v15

    const-wide/16 v18, 0x2

    mul-long v1, v1, v18

    add-long/2addr v1, v4

    iget v4, v11, Ll/ܽۨۜ;->ۜ:I

    int-to-long v4, v4

    add-long/2addr v1, v4

    const-wide/16 v4, 0x1e

    add-long/2addr v1, v4

    iget-wide v4, v11, Ll/ܽۨۜ;->᩷:J

    const-wide/16 v18, 0x4

    mul-long v4, v4, v18

    add-long/2addr v4, v1

    .line 79
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v1

    int-to-long v1, v1

    mul-long v1, v1, v6

    const-wide/32 v6, 0x10000

    add-long/2addr v1, v6

    iget v3, v11, Ll/ܽۨۜ;->ܳ:I

    int-to-long v6, v3

    add-long/2addr v1, v6

    iget v3, v11, Ll/ܽۨۜ;->ۧ:I

    int-to-long v6, v3

    mul-long v6, v6, v18

    add-long/2addr v6, v1

    .line 81
    iget v3, v11, Ll/ܽۨۜ;->ۡ:I

    iget v15, v11, Ll/ܽۨۜ;->ܿ:I

    .line 82
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_11
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_10
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_f

    const/16 v16, 0x4

    move-object/from16 v17, v13

    move-wide v13, v4

    move v4, v15

    move/from16 v5, v16

    move-wide v15, v13

    move-wide v13, v6

    move-wide/from16 v6, p3

    .line 81
    :try_start_2
    invoke-static/range {v1 .. v7}, Ll/ܶۛۜ;->֫(JIIIJ)Ll/۠ۛۜ;

    move-result-object v1

    iget-wide v6, v1, Ll/۠ۛۜ;->֫:J

    .line 83
    invoke-virtual/range {p2 .. p2}, Ll/᩶ۛۜ;->֫()J

    move-result-wide v1

    invoke-virtual/range {p2 .. p2}, Ll/᩶ۛۜ;->ۧ()J

    move-result-wide v3

    sub-long/2addr v1, v3

    invoke-virtual {v12}, Ll/᩹ۛۜ;->֫()J

    move-result-wide v3

    add-long/2addr v1, v3

    invoke-static {v8, v9, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v25

    .line 84
    iget v1, v11, Ll/ܽۨۜ;->ۡ:I

    iget v2, v11, Ll/ܽۨۜ;->ܿ:I

    move-wide v8, v15

    .line 85
    invoke-static {v8, v9, v13, v14}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v20

    const/16 v24, 0x4

    move/from16 v22, v1

    move/from16 v23, v2

    .line 84
    invoke-static/range {v20 .. v26}, Ll/ܶۛۜ;->֫(JIIIJ)Ll/۠ۛۜ;

    move-result-object v1

    iget v10, v1, Ll/۠ۛۜ;->ۧ:I

    .line 86
    iget-wide v1, v1, Ll/۠ۛۜ;->֫:J

    invoke-virtual {v12, v1, v2}, Ll/᩹ۛۜ;->ۧ(J)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 87
    iget v15, v11, Ll/ܽۨۜ;->ܳ:I

    new-array v5, v15, [B

    .line 88
    iget v1, v11, Ll/ܽۨۜ;->᩻:I
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_e
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_d
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_c

    int-to-long v2, v1

    const/16 v16, 0x0

    move-object/from16 v1, v17

    move-object v4, v5

    move-object/from16 v20, v5

    move/from16 v5, v16

    move-wide/from16 v21, v6

    move v6, v15

    move-object/from16 v7, p5

    :try_start_3
    invoke-virtual/range {v1 .. v7}, Ll/᩸ۛۜ;->֫(J[BIILl/ܿۖ᩷;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_b
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_a
    .catch Ljava/lang/Error; {:try_start_3 .. :try_end_3} :catch_9

    .line 89
    :try_start_4
    invoke-static {v1, v11, v0}, Ll/ۤܰۜ;->֫(Ll/᩸ۛۜ;Ll/ܽۨۜ;Ll/ۡ᩺ۜ;)I

    move-result v2

    .line 90
    iget v3, v11, Ll/ܽۨۜ;->ۡ:I

    invoke-static {v3, v10}, Ll/ۙۨۜ;->֫(II)J

    move-result-wide v3

    long-to-int v4, v3

    .line 91
    iget v3, v11, Ll/ܽۨۜ;->ܿ:I

    invoke-static {v3, v10}, Ll/ۙۨۜ;->֫(II)J

    move-result-wide v5

    long-to-int v3, v5

    .line 92
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v4, v3, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v15
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_8
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_7
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_6

    .line 93
    :try_start_5
    invoke-static {v8, v9, v13, v14}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    invoke-virtual {v15}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    move-result v5

    int-to-long v5, v5

    mul-long v5, v5, v18

    add-long/2addr v5, v3

    invoke-virtual {v12}, Ll/᩹ۛۜ;->֫()J

    move-result-wide v3

    cmp-long v7, v5, v3

    if-gtz v7, :cond_0

    .line 95
    new-instance v13, Ll/ۤܰۜ;

    move-object v3, v13

    move-object v4, v1

    move-object v5, v11

    move-object v6, v12

    move-object/from16 v7, v20

    move-object v8, v15

    move v9, v2

    move-wide/from16 v10, v21

    invoke-direct/range {v3 .. v11}, Ll/ۤܰۜ;-><init>(Ll/᩸ۛۜ;Ll/ܽۨۜ;Ll/᩹ۛۜ;[BLandroid/graphics/Bitmap;IJ)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/lang/Error; {:try_start_5 .. :try_end_5} :catch_3

    const/4 v2, 0x0

    .line 96
    :try_start_6
    invoke-direct {v13, v2, v0}, Ll/ۤܰۜ;->֫(ILl/ܿۖ᩷;)Landroid/graphics/Bitmap;

    move-result-object v2

    iput-object v2, v13, Ll/ۤܰۜ;->᩺:Landroid/graphics/Bitmap;

    .line 97
    invoke-virtual/range {p0 .. p1}, Ll/᩺ۨۜ;->֫(Ll/ۨۨۜ;)V

    .line 98
    invoke-static/range {p5 .. p5}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/Error; {:try_start_6 .. :try_end_6} :catch_0

    return-object v13

    :catch_0
    move-exception v0

    goto :goto_6

    :catch_1
    move-exception v0

    goto :goto_6

    :catch_2
    move-exception v0

    goto :goto_6

    :catch_3
    move-exception v0

    goto :goto_0

    :catch_4
    move-exception v0

    goto :goto_0

    :catch_5
    move-exception v0

    goto :goto_0

    .line 94
    :cond_0
    :try_start_7
    new-instance v0, Ll/֨ۨۜ;

    const-string v2, "WebP canvas allocation exceeds reservation"

    .line 330
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 94
    throw v0
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_4
    .catch Ljava/lang/Error; {:try_start_7 .. :try_end_7} :catch_3

    :goto_0
    const/4 v13, 0x0

    goto :goto_6

    :catch_6
    move-exception v0

    goto :goto_3

    :catch_7
    move-exception v0

    goto :goto_3

    :catch_8
    move-exception v0

    goto :goto_3

    :catch_9
    move-exception v0

    goto :goto_1

    :catch_a
    move-exception v0

    goto :goto_1

    :catch_b
    move-exception v0

    goto :goto_1

    :cond_1
    move-object/from16 v1, v17

    .line 86
    :try_start_8
    new-instance v0, Ll/֨ۨۜ;

    const-string v2, "WebP allocation exceeds budget"

    .line 330
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 86
    throw v0
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_8
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_7
    .catch Ljava/lang/Error; {:try_start_8 .. :try_end_8} :catch_6

    :catch_c
    move-exception v0

    :goto_1
    move-object/from16 v1, v17

    goto :goto_3

    :catch_d
    move-exception v0

    goto :goto_1

    :catch_e
    move-exception v0

    goto :goto_1

    :catch_f
    move-exception v0

    :goto_2
    move-object v1, v13

    goto :goto_3

    :catch_10
    move-exception v0

    goto :goto_2

    :catch_11
    move-exception v0

    goto :goto_2

    :goto_3
    move-object v13, v1

    goto :goto_5

    :catch_12
    move-exception v0

    goto :goto_4

    :catch_13
    move-exception v0

    goto :goto_4

    :catch_14
    move-exception v0

    :goto_4
    const/4 v13, 0x0

    :goto_5
    const/4 v1, 0x0

    const/4 v15, 0x0

    move-object/from16 v27, v13

    move-object v13, v1

    move-object/from16 v1, v27

    :goto_6
    if-eqz v13, :cond_2

    .line 101
    iget-object v2, v13, Ll/ۤܰۜ;->᩺:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    :cond_2
    if-eqz v15, :cond_3

    .line 102
    invoke-virtual {v15}, Landroid/graphics/Bitmap;->recycle()V

    :cond_3
    if-eqz v1, :cond_4

    .line 103
    :try_start_9
    invoke-virtual {v1}, Ll/᩸ۛۜ;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_15

    .line 104
    :catch_15
    :cond_4
    invoke-virtual {v12}, Ll/᩹ۛۜ;->close()V

    .line 105
    throw v0

    .line 69
    :cond_5
    new-instance v0, Ll/֨ۨۜ;

    const-string v1, "WebP scan exceeds budget"

    .line 330
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 69
    throw v0
.end method

.method public static ֫(Ll/᩸ۛۜ;JLl/᩹ۛۜ;Ll/ۡ᩺ۜ;)Ll/ܽۨۜ;
    .locals 34

    move-wide/from16 v0, p1

    move-object/from16 v2, p3

    const/16 v8, 0x1e

    new-array v15, v8, [B

    const-wide/16 v4, 0x0

    const/4 v7, 0x0

    move-object/from16 v3, p0

    move-object v6, v15

    move-object/from16 v9, p4

    .line 253
    invoke-virtual/range {v3 .. v9}, Ll/᩸ۛۜ;->֫(J[BIILl/ܿۖ᩷;)V

    const-string v3, "RIFF"

    const/4 v4, 0x0

    .line 254
    invoke-static {v3, v4, v15}, Ll/ᩳۨۜ;->֫(Ljava/lang/String;I[B)Z

    move-result v3

    if-eqz v3, :cond_1b

    const-string v3, "WEBP"

    const/16 v5, 0x8

    invoke-static {v3, v5, v15}, Ll/ᩳۨۜ;->֫(Ljava/lang/String;I[B)Z

    move-result v3

    if-eqz v3, :cond_1b

    const-string v3, "VP8X"

    const/16 v5, 0xc

    invoke-static {v3, v5, v15}, Ll/ᩳۨۜ;->֫(Ljava/lang/String;I[B)Z

    move-result v3

    if-eqz v3, :cond_1b

    const/16 v3, 0x10

    .line 255
    invoke-static {v3, v15}, Ll/ᩳۨۜ;->ܽ(I[B)J

    move-result-wide v5

    const-wide/16 v7, 0xa

    cmp-long v3, v5, v7

    if-nez v3, :cond_1b

    const/16 v3, 0x14

    aget-byte v3, v15, v3

    and-int/lit8 v3, v3, 0x2

    if-eqz v3, :cond_1b

    const/4 v3, 0x4

    .line 256
    invoke-static {v3, v15}, Ll/ᩳۨۜ;->ܽ(I[B)J

    move-result-wide v5

    const-wide/16 v7, 0x8

    add-long/2addr v5, v7

    const-wide/32 v9, 0x10000000

    cmp-long v11, v5, v9

    if-gtz v11, :cond_1a

    .line 258
    new-instance v14, Ll/ܽۨۜ;

    const/16 v9, 0x18

    invoke-static {v9, v15}, Ll/ᩳۨۜ;->ۧ(I[B)I

    move-result v9

    add-int/lit8 v9, v9, 0x1

    const/16 v10, 0x1b

    invoke-static {v10, v15}, Ll/ᩳۨۜ;->ۧ(I[B)I

    move-result v10

    add-int/lit8 v10, v10, 0x1

    invoke-direct {v14, v9, v10}, Ll/ܽۨۜ;-><init>(II)V

    .line 259
    sget-object v9, Ll/᩶ۨۜ;->֫:Ll/᩶ۨۜ;

    iget v13, v14, Ll/ܽۨۜ;->ۡ:I

    iget v12, v14, Ll/ܽۨۜ;->ܿ:I

    invoke-virtual {v9, v13, v12}, Ll/᩶ۨۜ;->֫(II)V

    const-wide/16 v9, 0x1e

    const/4 v11, 0x0

    move-wide v10, v9

    const/16 v16, 0x0

    .line 261
    :goto_0
    iget-object v9, v14, Ll/ܽۨۜ;->ᩳ:Ljava/util/ArrayList;

    cmp-long v17, v10, v5

    if-gez v17, :cond_18

    sub-long v17, v5, v10

    cmp-long v19, v17, v7

    if-ltz v19, :cond_17

    const/16 v17, 0x0

    const/16 v18, 0x8

    const/16 v19, 0x8

    move-object/from16 v20, v9

    move-object/from16 v9, p0

    move-wide/from16 v21, v10

    move/from16 v23, v12

    move-object v12, v15

    move/from16 v24, v13

    move/from16 v13, v17

    move-object/from16 v25, v14

    move/from16 v14, v18

    move-object v7, v15

    move-object/from16 v15, p4

    .line 263
    invoke-virtual/range {v9 .. v15}, Ll/᩸ۛۜ;->֫(J[BIILl/ܿۖ᩷;)V

    .line 264
    invoke-static {v3, v7}, Ll/ᩳۨۜ;->ܽ(I[B)J

    move-result-wide v14

    const-wide/16 v8, 0x8

    add-long v12, v10, v8

    add-long v21, v12, v14

    const-wide/16 v26, 0x1

    and-long v8, v14, v26

    add-long v28, v21, v8

    cmp-long v8, v28, v5

    if-gtz v8, :cond_16

    const-string v8, "ANIM"

    .line 266
    invoke-static {v8, v4, v7}, Ll/ᩳۨۜ;->֫(Ljava/lang/String;I[B)Z

    move-result v8

    if-eqz v8, :cond_2

    const-wide/16 v8, 0x6

    cmp-long v10, v14, v8

    if-nez v10, :cond_1

    if-nez v16, :cond_1

    .line 267
    invoke-virtual/range {v20 .. v20}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_1

    const/4 v8, 0x0

    const/4 v14, 0x6

    move-object/from16 v9, p0

    move-wide v10, v12

    move-object v12, v7

    move v13, v8

    move-object/from16 v15, p4

    .line 268
    invoke-virtual/range {v9 .. v15}, Ll/᩸ۛۜ;->֫(J[BIILl/ܿۖ᩷;)V

    .line 269
    invoke-static {v4, v7}, Ll/ᩳۨۜ;->ܽ(I[B)J

    move-result-wide v8

    long-to-int v4, v8

    move-object/from16 v8, v25

    iput v4, v8, Ll/ܽۨۜ;->֫:I

    invoke-static {v3, v7}, Ll/ᩳۨۜ;->֫(I[B)I

    move-result v3

    iput v3, v8, Ll/ܽۨۜ;->ۢ:I

    const/16 v16, 0x1

    :cond_0
    :goto_1
    move-wide/from16 v32, v5

    move/from16 v25, v23

    const-wide/16 v17, 0x8

    goto/16 :goto_8

    .line 267
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid WebP animation header"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    move-object/from16 v8, v25

    const-string v3, "ICCP"

    .line 270
    invoke-static {v3, v4, v7}, Ll/ᩳۨۜ;->֫(Ljava/lang/String;I[B)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 271
    iget v3, v8, Ll/ܽۨۜ;->ܳ:I

    if-nez v3, :cond_3

    long-to-int v3, v10

    .line 272
    iput v3, v8, Ll/ܽۨۜ;->᩻:I

    sub-long v3, v28, v10

    long-to-int v4, v3

    iput v4, v8, Ll/ܽۨۜ;->ܳ:I

    goto :goto_1

    .line 271
    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Duplicate WebP color profile"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    const-string v3, "EXIF"

    .line 273
    invoke-static {v3, v4, v7}, Ll/ᩳۨۜ;->֫(Ljava/lang/String;I[B)Z

    move-result v3

    if-eqz v3, :cond_5

    long-to-int v3, v12

    .line 274
    iput v3, v8, Ll/ܽۨۜ;->ܽ:I

    long-to-int v3, v14

    iput v3, v8, Ll/ܽۨۜ;->ۧ:I

    goto :goto_1

    :cond_5
    const-string v3, "ANMF"

    .line 275
    invoke-static {v3, v4, v7}, Ll/ᩳۨۜ;->֫(Ljava/lang/String;I[B)Z

    move-result v3

    if-eqz v3, :cond_0

    if-eqz v16, :cond_15

    const-wide/16 v9, 0x18

    cmp-long v3, v14, v9

    if-ltz v3, :cond_15

    .line 277
    invoke-static {v8, v0, v1, v2}, Ll/ۤܰۜ;->֫(Ll/ܽۨۜ;JLl/᩹ۛۜ;)V

    const/4 v3, 0x0

    const/16 v25, 0x10

    move-object/from16 v9, p0

    move-wide v10, v12

    move-wide/from16 v30, v12

    move-object v12, v7

    move v13, v3

    move-wide/from16 v32, v5

    move-wide v5, v14

    move/from16 v14, v25

    move-object/from16 v15, p4

    .line 278
    invoke-virtual/range {v9 .. v15}, Ll/᩸ۛۜ;->֫(J[BIILl/ܿۖ᩷;)V

    .line 279
    new-instance v3, Ll/ۧۨۜ;

    invoke-direct {v3}, Ll/ۧۨۜ;-><init>()V

    .line 280
    invoke-static {v4, v7}, Ll/ᩳۨۜ;->ۧ(I[B)I

    move-result v9

    mul-int/lit8 v9, v9, 0x2

    iput v9, v3, Ll/ۧۨۜ;->ۜ:I

    const/4 v9, 0x3

    invoke-static {v9, v7}, Ll/ᩳۨۜ;->ۧ(I[B)I

    move-result v9

    mul-int/lit8 v9, v9, 0x2

    iput v9, v3, Ll/ۧۨۜ;->᩷:I

    const/4 v9, 0x6

    .line 281
    invoke-static {v9, v7}, Ll/ᩳۨۜ;->ۧ(I[B)I

    move-result v9

    add-int/lit8 v9, v9, 0x1

    iput v9, v3, Ll/ۧۨۜ;->᩻:I

    const/16 v9, 0x9

    invoke-static {v9, v7}, Ll/ᩳۨۜ;->ۧ(I[B)I

    move-result v9

    add-int/lit8 v9, v9, 0x1

    iput v9, v3, Ll/ۧۨۜ;->ܽ:I

    const/16 v9, 0xc

    .line 282
    invoke-static {v9, v7}, Ll/ᩳۨۜ;->ۧ(I[B)I

    move-result v9

    iput v9, v3, Ll/ۧۨۜ;->ۧ:I

    const/16 v9, 0xf

    aget-byte v9, v7, v9

    and-int/lit8 v10, v9, 0x2

    if-eqz v10, :cond_6

    const/4 v10, 0x1

    goto :goto_2

    :cond_6
    const/4 v10, 0x0

    :goto_2
    iput-boolean v10, v3, Ll/ۧۨۜ;->ܳ:Z

    and-int/lit8 v9, v9, 0x1

    if-eqz v9, :cond_7

    const/4 v9, 0x1

    goto :goto_3

    :cond_7
    const/4 v9, 0x0

    :goto_3
    iput-boolean v9, v3, Ll/ۧۨۜ;->֫:Z

    move-wide/from16 v10, v30

    long-to-int v9, v10

    add-int/lit8 v9, v9, 0x10

    .line 283
    iput v9, v3, Ll/ۧۨۜ;->ܿ:I

    long-to-int v6, v5

    add-int/lit8 v6, v6, -0x10

    iput v6, v3, Ll/ۧۨۜ;->ᩳ:I

    .line 284
    iget v5, v3, Ll/ۧۨۜ;->ۜ:I

    int-to-long v5, v5

    iget v10, v3, Ll/ۧۨۜ;->᩻:I

    int-to-long v10, v10

    add-long/2addr v5, v10

    move/from16 v15, v24

    int-to-long v10, v15

    cmp-long v12, v5, v10

    if-gtz v12, :cond_14

    iget v5, v3, Ll/ۧۨۜ;->᩷:I

    int-to-long v5, v5

    iget v10, v3, Ll/ۧۨۜ;->ܽ:I

    int-to-long v10, v10

    add-long/2addr v5, v10

    move/from16 v14, v23

    int-to-long v10, v14

    cmp-long v12, v5, v10

    if-gtz v12, :cond_14

    int-to-long v5, v9

    const/4 v9, 0x0

    const/16 v23, 0x0

    :goto_4
    cmp-long v9, v5, v21

    if-gez v9, :cond_12

    sub-long v9, v21, v5

    const-wide/16 v11, 0x8

    cmp-long v13, v9, v11

    if-ltz v13, :cond_11

    const/4 v13, 0x0

    const/16 v24, 0x8

    move-object/from16 v9, p0

    move-wide v10, v5

    move-object v12, v7

    move/from16 v25, v14

    move/from16 v14, v24

    move/from16 v24, v15

    move-object/from16 v15, p4

    .line 289
    invoke-virtual/range {v9 .. v15}, Ll/᩸ۛۜ;->֫(J[BIILl/ܿۖ᩷;)V

    const/4 v9, 0x4

    .line 290
    invoke-static {v9, v7}, Ll/ᩳۨۜ;->ܽ(I[B)J

    move-result-wide v14

    const-wide/16 v17, 0x8

    add-long v10, v5, v17

    add-long v5, v10, v14

    and-long v12, v14, v26

    add-long/2addr v5, v12

    cmp-long v9, v5, v21

    if-gtz v9, :cond_10

    const-string v9, "VP8 "

    .line 292
    invoke-static {v9, v4, v7}, Ll/ᩳۨۜ;->֫(Ljava/lang/String;I[B)Z

    move-result v9

    const-string v13, "VP8L"

    if-nez v9, :cond_a

    invoke-static {v13, v4, v7}, Ll/ᩳۨۜ;->֫(Ljava/lang/String;I[B)Z

    move-result v9

    if-eqz v9, :cond_8

    goto :goto_5

    :cond_8
    const-string v9, "ALPH"

    .line 297
    invoke-static {v9, v4, v7}, Ll/ᩳۨۜ;->֫(Ljava/lang/String;I[B)Z

    move-result v4

    if-eqz v4, :cond_9

    move-wide/from16 v30, v5

    goto/16 :goto_7

    :cond_9
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unsupported WebP frame chunk"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    :goto_5
    if-nez v23, :cond_f

    move-wide/from16 v30, v5

    const-wide/16 v4, 0xa

    .line 294
    invoke-static {v4, v5, v14, v15}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    long-to-int v5, v4

    const/16 v4, 0x8

    move-object/from16 v9, p0

    move-object v12, v7

    move-object v6, v13

    move v13, v4

    move-wide v0, v14

    move v14, v5

    move-object/from16 v15, p4

    invoke-virtual/range {v9 .. v15}, Ll/᩸ۛۜ;->֫(J[BIILl/ܿۖ᩷;)V

    long-to-int v1, v0

    .line 295
    iget v0, v3, Ll/ۧۨۜ;->᩻:I

    iget v4, v3, Ll/ۧۨۜ;->ܽ:I

    const/4 v5, 0x0

    .line 197
    invoke-static {v6, v5, v7}, Ll/ᩳۨۜ;->֫(Ljava/lang/String;I[B)Z

    move-result v5

    const/16 v6, 0xe

    if-eqz v5, :cond_c

    const/4 v5, 0x5

    if-lt v1, v5, :cond_b

    .line 198
    aget-byte v1, v7, v19

    const/16 v5, 0x2f

    if-ne v1, v5, :cond_b

    const/16 v1, 0x9

    .line 199
    invoke-static {v1, v7}, Ll/ᩳۨۜ;->ܽ(I[B)J

    move-result-wide v9

    const-wide/16 v11, 0x3fff

    and-long v13, v9, v11

    long-to-int v1, v13

    add-int/lit8 v1, v1, 0x1

    shr-long v5, v9, v6

    and-long/2addr v5, v11

    long-to-int v6, v5

    add-int/lit8 v6, v6, 0x1

    goto :goto_6

    .line 198
    :cond_b
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid lossless WebP frame header"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    const/16 v5, 0xa

    if-lt v1, v5, :cond_e

    .line 203
    aget-byte v1, v7, v19

    and-int/lit8 v1, v1, 0x1

    if-nez v1, :cond_e

    const/16 v1, 0xb

    aget-byte v1, v7, v1

    and-int/lit16 v1, v1, 0xff

    const/16 v5, 0x9d

    if-ne v1, v5, :cond_e

    const/16 v1, 0xc

    aget-byte v1, v7, v1

    const/4 v5, 0x1

    if-ne v1, v5, :cond_e

    const/16 v1, 0xd

    aget-byte v1, v7, v1

    const/16 v5, 0x2a

    if-ne v1, v5, :cond_e

    .line 206
    invoke-static {v6, v7}, Ll/ᩳۨۜ;->֫(I[B)I

    move-result v1

    and-int/lit16 v1, v1, 0x3fff

    const/16 v5, 0x10

    .line 207
    invoke-static {v5, v7}, Ll/ᩳۨۜ;->֫(I[B)I

    move-result v5

    and-int/lit16 v6, v5, 0x3fff

    :goto_6
    if-ne v1, v0, :cond_d

    if-ne v6, v4, :cond_d

    const/4 v0, 0x1

    const/16 v23, 0x1

    :goto_7
    const/4 v4, 0x0

    move-wide/from16 v0, p1

    move/from16 v15, v24

    move/from16 v14, v25

    move-wide/from16 v5, v30

    goto/16 :goto_4

    .line 209
    :cond_d
    new-instance v0, Ljava/io/IOException;

    const-string v1, "WebP frame dimensions disagree with container"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 205
    :cond_e
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid lossy WebP frame header"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 293
    :cond_f
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Duplicate WebP frame image"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 291
    :cond_10
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Truncated WebP frame payload"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 288
    :cond_11
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Truncated WebP frame chunk"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    move/from16 v25, v14

    move/from16 v24, v15

    const-wide/16 v17, 0x8

    if-eqz v23, :cond_13

    move-object/from16 v0, v20

    .line 301
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 302
    iget-wide v0, v8, Ll/ܽۨۜ;->᩷:J

    iget v4, v3, Ll/ۧۨۜ;->᩻:I

    int-to-long v4, v4

    iget v6, v3, Ll/ۧۨۜ;->ܽ:I

    int-to-long v9, v6

    mul-long v4, v4, v9

    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iput-wide v0, v8, Ll/ܽۨۜ;->᩷:J

    .line 303
    iget v0, v8, Ll/ܽۨۜ;->ۜ:I

    iget v1, v3, Ll/ۧۨۜ;->ᩳ:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, v8, Ll/ܽۨۜ;->ۜ:I

    goto :goto_8

    .line 300
    :cond_13
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Missing WebP frame image"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 285
    :cond_14
    new-instance v0, Ljava/io/IOException;

    const-string v1, "WebP frame exceeds canvas"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 276
    :cond_15
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid WebP animation frame"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_8
    move-wide/from16 v0, p1

    .line 305
    invoke-static {v8, v0, v1, v2}, Ll/ۤܰۜ;->֫(Ll/ܽۨۜ;JLl/᩹ۛۜ;)V

    sub-long v10, v28, v26

    const/4 v13, 0x0

    const/4 v14, 0x1

    move-object/from16 v9, p0

    move-object v12, v7

    move-object/from16 v15, p4

    .line 307
    invoke-virtual/range {v9 .. v15}, Ll/᩸ۛۜ;->֫(J[BIILl/ܿۖ᩷;)V

    const/4 v4, 0x0

    const/4 v3, 0x4

    move-object v15, v7

    move-object v14, v8

    move-wide/from16 v7, v17

    move/from16 v13, v24

    move/from16 v12, v25

    move-wide/from16 v10, v28

    move-wide/from16 v5, v32

    goto/16 :goto_0

    .line 265
    :cond_16
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Truncated WebP chunk data"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 262
    :cond_17
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Truncated WebP chunk"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_18
    move-object v0, v9

    move-object v8, v14

    if-eqz v16, :cond_19

    .line 310
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_19

    return-object v8

    :cond_19
    new-instance v0, Ljava/io/IOException;

    const-string v1, "WebP contains no animation frames"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 257
    :cond_1a
    new-instance v0, Ljava/io/IOException;

    const-string v1, "WebP input exceeds byte limit"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 255
    :cond_1b
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid animated WebP header"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic ֫(IILandroid/graphics/ImageDecoder;)V
    .locals 1

    const/4 v0, 0x1

    .line 138
    invoke-virtual {p2, v0}, Landroid/graphics/ImageDecoder;->setAllocator(I)V

    .line 139
    invoke-virtual {p2, p0, p1}, Landroid/graphics/ImageDecoder;->setTargetSize(II)V

    .line 140
    sget-object p0, Landroid/graphics/ColorSpace$Named;->SRGB:Landroid/graphics/ColorSpace$Named;

    invoke-static {p0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object p0

    invoke-virtual {p2, p0}, Landroid/graphics/ImageDecoder;->setTargetColorSpace(Landroid/graphics/ColorSpace;)V

    return-void
.end method

.method private ֫(Landroid/graphics/Bitmap;II)V
    .locals 4

    const/4 v0, 0x0

    .line 207
    iput-boolean v0, p0, Ll/ۤܰۜ;->ۙ:Z

    .line 208
    iget-boolean v1, p0, Ll/ۤܰۜ;->۬:Z

    if-eqz v1, :cond_0

    if-eqz p1, :cond_6

    .line 209
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    return-void

    .line 212
    :cond_0
    iget-boolean v1, p0, Ll/ۤܰۜ;->᩸:Z

    if-eqz v1, :cond_5

    iget v2, p0, Ll/ۤܰۜ;->۟:I

    if-eq v2, p3, :cond_1

    goto :goto_0

    :cond_1
    if-nez p1, :cond_2

    .line 218
    iput-boolean v0, p0, Ll/ۤܰۜ;->᩸:Z

    return-void

    .line 219
    :cond_2
    iget-object p3, p0, Ll/ۤܰۜ;->᩺:Landroid/graphics/Bitmap;

    .line 220
    iput-object p1, p0, Ll/ۤܰۜ;->᩺:Landroid/graphics/Bitmap;

    iput p2, p0, Ll/ۤܰۜ;->ܰ:I

    .line 221
    invoke-virtual {p3}, Landroid/graphics/Bitmap;->recycle()V

    if-nez p2, :cond_3

    .line 222
    iget-boolean p1, p0, Ll/ۤܰۜ;->ۨ:Z

    if-nez p1, :cond_3

    iget p1, p0, Ll/ۤܰۜ;->۫:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ۤܰۜ;->۫:I

    .line 223
    :cond_3
    iput-boolean v0, p0, Ll/ۤܰۜ;->ۨ:Z

    .line 224
    iget-object p1, p0, Ll/ۤܰۜ;->ܽ֫:Ll/ܽۨۜ;

    iget-object p1, p1, Ll/ܽۨۜ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۧۨۜ;

    iget p1, p1, Ll/ۧۨۜ;->ۧ:I

    const/16 p2, 0x14

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    int-to-long p1, p1

    iput-wide p1, p0, Ll/ۤܰۜ;->ܺ֫:J

    .line 225
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide p1

    iget-wide v0, p0, Ll/ۤܰۜ;->ۜ֫:J

    iget-wide v2, p0, Ll/ۤܰۜ;->ܺ֫:J

    add-long/2addr v0, v2

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    iput-wide p1, p0, Ll/ۤܰۜ;->ۜ֫:J

    .line 226
    iget-object p1, p0, Ll/ۤܰۜ;->ܿ֫:Ljava/lang/Runnable;

    if-eqz p1, :cond_4

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 227
    :cond_4
    iget-boolean p1, p0, Ll/ۤܰۜ;->᩸:Z

    if-eqz p1, :cond_6

    iget-boolean p1, p0, Ll/ۤܰۜ;->۬:Z

    if-nez p1, :cond_6

    iget-object p1, p0, Ll/ۤܰۜ;->᩻֫:Landroid/os/Handler;

    iget-object p2, p0, Ll/ۤܰۜ;->ᩴ֫:Ll/ۙܰۜ;

    iget-wide v0, p0, Ll/ۤܰۜ;->ۜ֫:J

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;J)Z

    return-void

    .line 214
    :cond_5
    :goto_0
    iput-object p1, p0, Ll/ۤܰۜ;->ۢ֫:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_6

    .line 215
    iget-object p1, p0, Ll/ۤܰۜ;->᩻֫:Landroid/os/Handler;

    iget-object p2, p0, Ll/ۤܰۜ;->ᩴ֫:Ll/ۙܰۜ;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_6
    return-void
.end method

.method public static synthetic ֫(Ll/ۤܰۜ;II)V
    .locals 3

    const/4 v0, 0x0

    .line 197
    :try_start_0
    iget-boolean v1, p0, Ll/ۤܰۜ;->۬:Z

    if-nez v1, :cond_0

    .line 198
    new-instance v1, Ll/ܶܰۜ;

    invoke-direct {v1, p0}, Ll/ܶܰۜ;-><init>(Ll/ۤܰۜ;)V

    invoke-direct {p0, p1, v1}, Ll/ۤܰۜ;->֫(ILl/ܿۖ᩷;)Landroid/graphics/Bitmap;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 202
    :catch_0
    :cond_0
    iget-object v1, p0, Ll/ۤܰۜ;->᩻֫:Landroid/os/Handler;

    new-instance v2, Ll/᩸ܰۜ;

    invoke-direct {v2, p0, v0, p1, p2}, Ll/᩸ܰۜ;-><init>(Ll/ۤܰۜ;Landroid/graphics/Bitmap;II)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static synthetic ֫(Ll/ۤܰۜ;Landroid/graphics/Bitmap;II)V
    .locals 0

    .line 202
    invoke-direct {p0, p1, p2, p3}, Ll/ۤܰۜ;->֫(Landroid/graphics/Bitmap;II)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۤܰۜ;Ll/᩹ۛۜ;)V
    .locals 0

    .line 243
    iget-object p0, p0, Ll/ۤܰۜ;->ܳ֫:Ll/᩹ۛۜ;

    invoke-virtual {p0}, Ll/᩹ۛۜ;->close()V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ll/᩹ۛۜ;->close()V

    :cond_0
    return-void
.end method

.method public static ֫(Ll/ܽۨۜ;JLl/᩹ۛۜ;)V
    .locals 8

    .line 315
    iget-object v0, p0, Ll/ܽۨۜ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    int-to-long v0, v0

    const-wide/16 v2, 0x80

    mul-long v0, v0, v2

    const-wide/32 v2, 0x10000

    add-long/2addr v0, v2

    .line 316
    iget v2, p0, Ll/ܽۨۜ;->ܳ:I

    int-to-long v2, v2

    const-wide/16 v4, 0x2

    mul-long v2, v2, v4

    add-long/2addr v2, v0

    iget p0, p0, Ll/ܽۨۜ;->ۧ:I

    int-to-long v4, p0

    const-wide/16 v6, 0x4

    mul-long v4, v4, v6

    add-long/2addr v4, v2

    cmp-long p0, v4, p1

    if-gtz p0, :cond_0

    invoke-virtual {p3, v0, v1}, Ll/᩹ۛۜ;->ۧ(J)Z

    move-result p0

    if-eqz p0, :cond_0

    return-void

    .line 317
    :cond_0
    new-instance p0, Ll/֨ۨۜ;

    const-string p1, "WebP index exceeds allocation limit"

    .line 330
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 317
    throw p0
.end method

.method public static synthetic ֫(Ll/ۤܰۜ;)Z
    .locals 0

    .line 198
    iget-boolean p0, p0, Ll/ۤܰۜ;->۬:Z

    return p0
.end method

.method public static ۧ(Ll/ۤܰۜ;)V
    .locals 4

    .line 181
    iget-boolean v0, p0, Ll/ۤܰۜ;->۬:Z

    if-nez v0, :cond_4

    iget-boolean v0, p0, Ll/ۤܰۜ;->᩸:Z

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Ll/ۤܰۜ;->ۙ:Z

    if-eqz v0, :cond_0

    goto :goto_1

    .line 182
    :cond_0
    iget-boolean v0, p0, Ll/ۤܰۜ;->ۨ:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    iget v0, p0, Ll/ۤܰۜ;->ܰ:I

    iget-object v3, p0, Ll/ۤܰۜ;->ܽ֫:Ll/ܽۨۜ;

    iget-object v3, v3, Ll/ܽۨۜ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v2

    if-ne v0, v3, :cond_1

    iget-object v0, p0, Ll/ۤܰۜ;->ܽ֫:Ll/ܽۨۜ;

    iget v0, v0, Ll/ܽۨۜ;->ۢ:I

    if-lez v0, :cond_1

    iget v3, p0, Ll/ۤܰۜ;->۫:I

    add-int/2addr v3, v2

    if-lt v3, v0, :cond_1

    .line 183
    iput-boolean v1, p0, Ll/ۤܰۜ;->᩸:Z

    iput-boolean v2, p0, Ll/ۤܰۜ;->ۨ:Z

    return-void

    .line 185
    :cond_1
    iget-boolean v0, p0, Ll/ۤܰۜ;->ۨ:Z

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    iget v0, p0, Ll/ۤܰۜ;->ܰ:I

    add-int/2addr v0, v2

    iget-object v1, p0, Ll/ۤܰۜ;->ܽ֫:Ll/ܽۨۜ;

    iget-object v1, v1, Ll/ܽۨۜ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    rem-int v1, v0, v1

    .line 186
    :goto_0
    iget v0, p0, Ll/ۤܰۜ;->۟:I

    .line 187
    iget-object v3, p0, Ll/ۤܰۜ;->ۢ֫:Landroid/graphics/Bitmap;

    if-eqz v3, :cond_3

    const/4 v2, 0x0

    .line 189
    iput-object v2, p0, Ll/ۤܰۜ;->ۢ֫:Landroid/graphics/Bitmap;

    .line 190
    invoke-direct {p0, v3, v1, v0}, Ll/ۤܰۜ;->֫(Landroid/graphics/Bitmap;II)V

    return-void

    .line 193
    :cond_3
    iput-boolean v2, p0, Ll/ۤܰۜ;->ۙ:Z

    .line 194
    sget-object v2, Ll/ۤܰۜ;->֡֫:Ljava/util/concurrent/ExecutorService;

    new-instance v3, Ll/۫ܰۜ;

    invoke-direct {v3, p0, v1, v0}, Ll/۫ܰۜ;-><init>(Ll/ۤܰۜ;II)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public static synthetic ۧ(Ll/ۤܰۜ;Ll/᩹ۛۜ;)V
    .locals 3

    const/4 v0, 0x0

    .line 236
    iput-boolean v0, p0, Ll/ۤܰۜ;->ۘ֫:Z

    iput-boolean v0, p0, Ll/ۤܰۜ;->᩸:Z

    const/4 v0, 0x0

    iput-object v0, p0, Ll/ۤܰۜ;->ܿ֫:Ljava/lang/Runnable;

    iget-object v1, p0, Ll/ۤܰۜ;->᩻֫:Landroid/os/Handler;

    iget-object v2, p0, Ll/ۤܰۜ;->ᩴ֫:Ll/ۙܰۜ;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v1, p0, Ll/ۤܰۜ;->᩺:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 237
    iget-object v1, p0, Ll/ۤܰۜ;->ۢ֫:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    iput-object v0, p0, Ll/ۤܰۜ;->ۢ֫:Landroid/graphics/Bitmap;

    .line 238
    :cond_0
    new-instance v0, Ll/ۢۨۜ;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Ll/ۢۨۜ;-><init>(Ll/֨ۛۜ;Ll/᩹ۛۜ;I)V

    sget-object p0, Ll/ۤܰۜ;->֡֫:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic ܽ(Ll/ۤܰۜ;Ll/᩹ۛۜ;)V
    .locals 2

    .line 239
    iget-object v0, p0, Ll/ۤܰۜ;->ۤ:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    const/4 v0, 0x0

    .line 240
    iput-object v0, p0, Ll/ۤܰۜ;->ۧ֫:[B

    .line 241
    iget-object v0, p0, Ll/ۤܰۜ;->ܽ֫:Ll/ܽۨۜ;

    iget-object v0, v0, Ll/ܽۨۜ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 242
    :try_start_0
    iget-object v0, p0, Ll/ۤܰۜ;->ᩳ֫:Ll/᩸ۛۜ;

    invoke-virtual {v0}, Ll/᩸ۛۜ;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 243
    :catch_0
    iget-object v0, p0, Ll/ۤܰۜ;->᩻֫:Landroid/os/Handler;

    new-instance v1, Ll/᩹ܰۜ;

    invoke-direct {v1, p0, p1}, Ll/᩹ܰۜ;-><init>(Ll/ۤܰۜ;Ll/᩹ۛۜ;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public final ֫()J
    .locals 2

    .line 159
    iget-object v0, p0, Ll/ۤܰۜ;->ܳ֫:Ll/᩹ۛۜ;

    invoke-virtual {v0}, Ll/᩹ۛۜ;->֫()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ֫(Landroid/graphics/Canvas;Landroid/graphics/RectF;Landroid/graphics/Paint;)V
    .locals 2

    .line 163
    iget-boolean v0, p0, Ll/ۤܰۜ;->۬:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۤܰۜ;->᩺:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, p2, p3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/᩹ۛۜ;)V
    .locals 2

    move-object v0, p0

    .line 231
    monitor-enter v0

    .line 232
    :try_start_0
    iget-boolean v1, p0, Ll/ۤܰۜ;->۬:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 233
    iput-boolean v1, p0, Ll/ۤܰۜ;->۬:Z

    .line 234
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 235
    new-instance v0, Ll/᩶ܰۜ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0, p1}, Ll/᩶ܰۜ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 246
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne p1, v1, :cond_1

    invoke-virtual {v0}, Ll/᩶ܰۜ;->run()V

    return-void

    .line 247
    :cond_1
    iget-object p1, p0, Ll/ۤܰۜ;->᩻֫:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :catchall_0
    move-exception p1

    .line 234
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(ZLl/۠᩺ۜ;)V
    .locals 5

    .line 166
    iget-boolean v0, p0, Ll/ۤܰۜ;->۬:Z

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    .line 167
    :goto_0
    iput-object p2, p0, Ll/ۤܰۜ;->ܿ֫:Ljava/lang/Runnable;

    .line 160
    iget-object p2, p0, Ll/ۤܰۜ;->ܽ֫:Ll/ܽۨۜ;

    iget-object p2, p2, Ll/ܽۨۜ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-le p2, v1, :cond_2

    const/4 p2, 0x1

    goto :goto_1

    :cond_2
    const/4 p2, 0x0

    :goto_1
    and-int/2addr p1, p2

    .line 169
    iget-boolean p2, p0, Ll/ۤܰۜ;->ۘ֫:Z

    if-ne p1, p2, :cond_3

    :goto_2
    return-void

    .line 170
    :cond_3
    iput-boolean p1, p0, Ll/ۤܰۜ;->ۘ֫:Z

    iput-boolean p1, p0, Ll/ۤܰۜ;->᩸:Z

    .line 171
    iget p2, p0, Ll/ۤܰۜ;->۟:I

    add-int/2addr p2, v1

    iput p2, p0, Ll/ۤܰۜ;->۟:I

    .line 172
    iget-object p2, p0, Ll/ۤܰۜ;->᩻֫:Landroid/os/Handler;

    iget-object v1, p0, Ll/ۤܰۜ;->ᩴ֫:Ll/ۙܰۜ;

    invoke-virtual {p2, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const-wide/16 v1, 0x1

    if-eqz p1, :cond_5

    .line 174
    iget-boolean p1, p0, Ll/ۤܰۜ;->ۨ:Z

    if-eqz p1, :cond_4

    iput v0, p0, Ll/ۤܰۜ;->۫:I

    iput-wide v1, p0, Ll/ۤܰۜ;->ܺ֫:J

    .line 175
    :cond_4
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide p1

    iget-wide v3, p0, Ll/ۤܰۜ;->ܺ֫:J

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    add-long/2addr v0, p1

    iput-wide v0, p0, Ll/ۤܰۜ;->ۜ֫:J

    .line 176
    iget-object p1, p0, Ll/ۤܰۜ;->᩻֫:Landroid/os/Handler;

    iget-object p2, p0, Ll/ۤܰۜ;->ᩴ֫:Ll/ۙܰۜ;

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;J)Z

    return-void

    .line 177
    :cond_5
    iget-wide p1, p0, Ll/ۤܰۜ;->ۜ֫:J

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    sub-long/2addr p1, v3

    invoke-static {v1, v2, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    iput-wide p1, p0, Ll/ۤܰۜ;->ܺ֫:J

    return-void
.end method

.method public final ܽ()J
    .locals 5

    .line 158
    iget-object v0, p0, Ll/ۤܰۜ;->ܳ֫:Ll/᩹ۛۜ;

    invoke-virtual {v0}, Ll/᩹ۛۜ;->֫()J

    move-result-wide v0

    iget-wide v2, p0, Ll/ۤܰۜ;->ۡ֫:J

    cmp-long v4, v2, v0

    if-lez v4, :cond_0

    return-wide v2

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method
