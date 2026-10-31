.class public final Ll/᩺ۛۡ;
.super Ljava/lang/Object;
.source "86JZ"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final ۗ:J

.field public final ۙ:[I

.field public final ۫:[J

.field public final ۬:[J

.field public final ᩶:Ll/۫ۛۡ;

.field public ᩸:Z

.field public final ᩹:Ll/ۤۛۡ;


# direct methods
.method public constructor <init>(Ll/ۤۛۡ;Ll/۫ۛۡ;Z)V
    .locals 6

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 101
    iput-object p1, p0, Ll/᩺ۛۡ;->᩹:Ll/ۤۛۡ;

    .line 102
    iput-object p2, p0, Ll/᩺ۛۡ;->᩶:Ll/۫ۛۡ;

    .line 103
    invoke-static {p1}, Ll/ۤۛۡ;->ܽ(Ll/ۤۛۡ;)I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x0

    :goto_0
    cmp-long v4, v2, v0

    if-gez v4, :cond_0

    .line 327
    invoke-virtual {p2}, Ll/۫ۛۡ;->֫()I

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    goto :goto_0

    .line 104
    :cond_0
    invoke-static {p1}, Ll/ۤۛۡ;->ܿ(Ll/ۤۛۡ;)I

    move-result v0

    new-array v0, v0, [I

    iput-object v0, p0, Ll/᩺ۛۡ;->ۙ:[I

    const/4 v0, 0x0

    .line 105
    :goto_1
    iget-object v1, p0, Ll/᩺ۛۡ;->ۙ:[I

    array-length v2, v1

    if-ge v0, v2, :cond_2

    invoke-static {p1}, Ll/ۤۛۡ;->ᩳ(Ll/ۤۛۡ;)I

    move-result v2

    add-int/lit8 v2, v2, 0x7

    div-int/lit8 v2, v2, 0x8

    invoke-static {p1}, Ll/ۤۛۡ;->ᩳ(Ll/ۤۛۡ;)I

    move-result v3

    const/16 v4, 0x20

    if-ne v3, v4, :cond_1

    const/4 v3, 0x1

    goto :goto_2

    :cond_1
    const/4 v3, 0x0

    :goto_2
    invoke-static {p2, v2, v3}, Ll/᩺ۛۡ;->֫(Ll/۫ۛۡ;IZ)I

    move-result v2

    aput v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 310
    :cond_2
    iget-wide v0, p2, Ll/۫ۛۡ;->ܽ:J

    .line 106
    iput-wide v0, p0, Ll/᩺ۛۡ;->ۗ:J

    const/4 p2, 0x0

    if-eqz p3, :cond_3

    .line 107
    invoke-static {p1}, Ll/ۤۛۡ;->ܺ(Ll/ۤۛۡ;)Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-static {p1}, Ll/ۤۛۡ;->᩻(Ll/ۤۛۡ;)I

    move-result p3

    new-array p3, p3, [J

    goto :goto_3

    :cond_3
    move-object p3, p2

    :goto_3
    iput-object p3, p0, Ll/᩺ۛۡ;->۬:[J

    if-nez p3, :cond_4

    goto :goto_4

    .line 108
    :cond_4
    invoke-static {p1}, Ll/ۤۛۡ;->᩻(Ll/ۤۛۡ;)I

    move-result p1

    new-array p2, p1, [J

    :goto_4
    iput-object p2, p0, Ll/᩺ۛۡ;->۫:[J

    return-void
.end method

.method private ֫()I
    .locals 6

    .line 229
    iget-object v0, p0, Ll/᩺ۛۡ;->᩹:Ll/ۤۛۡ;

    invoke-static {v0}, Ll/ۤۛۡ;->᩷(Ll/ۤۛۡ;)I

    move-result v1

    const/16 v2, 0x10

    iget-object v3, p0, Ll/᩺ۛۡ;->᩶:Ll/۫ۛۡ;

    const/4 v4, 0x1

    if-eq v1, v4, :cond_7

    invoke-static {v0}, Ll/ۤۛۡ;->᩷(Ll/ۤۛۡ;)I

    move-result v1

    const/16 v5, 0x9

    if-ne v1, v5, :cond_0

    goto :goto_4

    .line 235
    :cond_0
    invoke-static {v0}, Ll/ۤۛۡ;->᩷(Ll/ۤۛۡ;)I

    move-result v1

    const/4 v5, 0x3

    if-eq v1, v5, :cond_4

    invoke-static {v0}, Ll/ۤۛۡ;->᩷(Ll/ۤۛۡ;)I

    move-result v1

    const/16 v5, 0xb

    if-ne v1, v5, :cond_1

    goto :goto_1

    .line 240
    :cond_1
    invoke-static {v0}, Ll/ۤۛۡ;->ۡ(Ll/ۤۛۡ;)I

    move-result v1

    invoke-static {v0}, Ll/ۤۛۡ;->ۧ(Ll/ۤۛۡ;)I

    move-result v2

    const/16 v5, 0x20

    if-eq v2, v5, :cond_3

    invoke-static {v0}, Ll/ۤۛۡ;->ۢ(Ll/ۤۛۡ;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    :cond_3
    :goto_0
    invoke-static {v3, v1, v4}, Ll/᩺ۛۡ;->֫(Ll/۫ۛۡ;IZ)I

    move-result v0

    return v0

    .line 236
    :cond_4
    :goto_1
    invoke-virtual {v3}, Ll/۫ۛۡ;->֫()I

    move-result v1

    invoke-static {v0}, Ll/ۤۛۡ;->ۧ(Ll/ۤۛۡ;)I

    move-result v4

    const/16 v5, 0xff

    if-ne v4, v2, :cond_5

    invoke-virtual {v3}, Ll/۫ۛۡ;->֫()I

    move-result v2

    goto :goto_2

    :cond_5
    const/16 v2, 0xff

    .line 237
    :goto_2
    invoke-static {v0}, Ll/ۤۛۡ;->ۢ(Ll/ۤۛۡ;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_3

    :cond_6
    move v5, v2

    :goto_3
    shl-int/lit8 v0, v5, 0x18

    shl-int/lit8 v2, v1, 0x10

    or-int/2addr v0, v2

    shl-int/lit8 v2, v1, 0x8

    or-int/2addr v0, v2

    or-int/2addr v0, v1

    return v0

    .line 230
    :cond_7
    :goto_4
    invoke-virtual {v3}, Ll/۫ۛۡ;->֫()I

    move-result v1

    .line 231
    invoke-static {v0}, Ll/ۤۛۡ;->ۧ(Ll/ۤۛۡ;)I

    move-result v4

    if-ne v4, v2, :cond_8

    invoke-virtual {v3}, Ll/۫ۛۡ;->֫()I

    move-result v2

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v1, v2

    .line 232
    :cond_8
    invoke-static {v0}, Ll/ۤۛۡ;->ܳ(Ll/ۤۛۡ;)I

    move-result v0

    sub-int/2addr v1, v0

    if-ltz v1, :cond_9

    .line 233
    iget-object v0, p0, Ll/᩺ۛۡ;->ۙ:[I

    array-length v2, v0

    if-ge v1, v2, :cond_9

    aget v0, v0, v1

    return v0

    :cond_9
    const/high16 v0, -0x1000000

    return v0
.end method

.method public static ֫(II)I
    .locals 4

    int-to-long v0, p0

    int-to-long p0, p1

    add-long/2addr v0, p0

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    .line 294
    div-long/2addr v0, p0

    long-to-int p0, v0

    return p0
.end method

.method public static ֫(I[B)I
    .locals 1

    .line 295
    aget-byte v0, p1, p0

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 p0, p0, 0x1

    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p0, p0, 0x8

    or-int/2addr p0, v0

    return p0
.end method

.method public static ֫(Ll/۫ۛۡ;IZ)I
    .locals 5

    .line 244
    invoke-virtual {p0}, Ll/۫ۛۡ;->֫()I

    move-result v0

    invoke-virtual {p0}, Ll/۫ۛۡ;->֫()I

    move-result v1

    const/4 v2, 0x2

    if-ne p1, v2, :cond_1

    shl-int/lit8 p0, v1, 0x8

    or-int/2addr p0, v0

    shr-int/lit8 p1, p0, 0xa

    and-int/lit8 p1, p1, 0x1f

    shr-int/lit8 v0, p0, 0x5

    and-int/lit8 v0, v0, 0x1f

    and-int/lit8 v1, p0, 0x1f

    if-eqz p2, :cond_0

    const p2, 0x8000

    and-int/2addr p0, p2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    const/high16 p0, -0x1000000

    :goto_0
    shl-int/lit8 p2, p1, 0x3

    shr-int/2addr p1, v2

    or-int/2addr p1, p2

    shl-int/lit8 p1, p1, 0x10

    or-int/2addr p0, p1

    shl-int/lit8 p1, v0, 0x3

    shr-int/lit8 p2, v0, 0x2

    or-int/2addr p1, p2

    shl-int/lit8 p1, p1, 0x8

    or-int/2addr p0, p1

    shl-int/lit8 p1, v1, 0x3

    or-int/2addr p0, p1

    shr-int/lit8 p1, v1, 0x2

    or-int/2addr p0, p1

    return p0

    .line 251
    :cond_1
    invoke-virtual {p0}, Ll/۫ۛۡ;->֫()I

    move-result v2

    const/4 v3, 0x4

    const/16 v4, 0xff

    if-ne p1, v3, :cond_2

    invoke-virtual {p0}, Ll/۫ۛۡ;->֫()I

    move-result p0

    goto :goto_1

    :cond_2
    const/16 p0, 0xff

    :goto_1
    if-eqz p2, :cond_3

    move v4, p0

    :cond_3
    shl-int/lit8 p0, v4, 0x18

    shl-int/lit8 p1, v2, 0x10

    or-int/2addr p0, p1

    shl-int/lit8 p1, v1, 0x8

    or-int/2addr p0, p1

    or-int/2addr p0, v0

    return p0
.end method

.method public static ֫(Ljava/io/InputStream;Ll/ۤۛۡ;Landroid/graphics/Rect;ILl/ܿۖ᩷;)Landroid/graphics/Bitmap;
    .locals 7

    .line 114
    invoke-static {p1, p2, p3}, Ll/᩺ۛۡ;->֫(Ll/ۤۛۡ;Landroid/graphics/Rect;I)V

    .line 115
    invoke-static {p4}, Ll/᩺ۛۡ;->֫(Ll/ܿۖ᩷;)V

    .line 116
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-static {v0, p3}, Ll/᩺ۛۡ;->֫(II)I

    move-result v0

    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result v1

    invoke-static {v1, p3}, Ll/᩺ۛۡ;->֫(II)I

    move-result v1

    mul-int v2, v0, v1

    .line 117
    new-array v2, v2, [I

    .line 118
    new-instance v3, Ll/᩺ۛۡ;

    new-instance v4, Ll/۫ۛۡ;

    invoke-direct {v4, p0}, Ll/۫ۛۡ;-><init>(Ljava/io/InputStream;)V

    const/4 p0, 0x0

    invoke-direct {v3, p1, v4, p0}, Ll/᩺ۛۡ;-><init>(Ll/ۤۛۡ;Ll/۫ۛۡ;Z)V

    .line 119
    invoke-direct {v3, v2, p2, p3, p4}, Ll/᩺ۛۡ;->֫([ILandroid/graphics/Rect;ILl/ܿۖ᩷;)V

    .line 120
    iget-boolean p0, v3, Ll/᩺ۛۡ;->᩸:Z

    if-eqz p0, :cond_3

    const/4 p0, 0x0

    :goto_0
    if-ge p0, v1, :cond_3

    .line 123
    invoke-static {p4}, Ll/᩺ۛۡ;->֫(Ll/ܿۖ᩷;)V

    .line 124
    iget v3, p2, Landroid/graphics/Rect;->top:I

    mul-int v4, p0, p3

    add-int/2addr v4, v3

    invoke-static {p1, v4}, Ll/ۤۛۡ;->ۧ(Ll/ۤۛۡ;I)I

    move-result v3

    if-ltz v3, :cond_2

    .line 125
    invoke-static {p1}, Ll/ۤۛۡ;->᩻(Ll/ۤۛۡ;)I

    move-result v4

    if-lt v3, v4, :cond_0

    goto :goto_2

    :cond_0
    const/4 v3, 0x0

    :goto_1
    if-ge v3, v0, :cond_2

    .line 127
    iget v4, p2, Landroid/graphics/Rect;->left:I

    mul-int v5, v3, p3

    add-int/2addr v5, v4

    invoke-static {p1, v5}, Ll/ۤۛۡ;->֫(Ll/ۤۛۡ;I)I

    move-result v4

    if-ltz v4, :cond_1

    .line 128
    invoke-static {p1}, Ll/ۤۛۡ;->ۜ(Ll/ۤۛۡ;)I

    move-result v5

    if-ge v4, v5, :cond_1

    mul-int v4, p0, v0

    add-int/2addr v4, v3

    aget v5, v2, v4

    const/high16 v6, -0x1000000

    or-int/2addr v5, v6

    aput v5, v2, v4

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    .line 132
    :cond_3
    invoke-static {p4}, Ll/᩺ۛۡ;->֫(Ll/ܿۖ᩷;)V

    .line 133
    sget-object p0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v2, v0, v1, p0}, Landroid/graphics/Bitmap;->createBitmap([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/io/InputStream;)Ll/ۤۛۡ;
    .locals 4

    const/16 v0, 0x12

    new-array v1, v0, [B

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 78
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v3

    if-ltz v3, :cond_0

    int-to-byte v3, v3

    .line 80
    aput-byte v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 79
    :cond_0
    new-instance p0, Ljava/io/EOFException;

    const-string v0, "Truncated TGA header"

    invoke-direct {p0, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 82
    :cond_1
    new-instance p0, Ll/ۤۛۡ;

    invoke-direct {p0, v1}, Ll/ۤۛۡ;-><init>([B)V

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/᩺ۛۡ;)Ll/ۤۛۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩺ۛۡ;->᩹:Ll/ۤۛۡ;

    return-object p0
.end method

.method public static ֫(Ljava/io/File;Ll/ۤۛۡ;Ll/ܿۖ᩷;)Ll/᩺ۛۡ;
    .locals 5

    .line 87
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 89
    :try_start_0
    invoke-static {v0}, Ll/᩶ᩴᩳ;->֫(Ljava/io/FileInputStream;)Ljava/nio/channels/FileChannel;

    move-result-object p0

    invoke-virtual {p0}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v1

    const-wide/32 v3, 0x10000000

    cmp-long p0, v1, v3

    if-gtz p0, :cond_0

    .line 90
    invoke-static {v0}, Ll/᩺ۛۡ;->֫(Ljava/io/InputStream;)Ll/ۤۛۡ;

    move-result-object p0

    invoke-virtual {p1, p0}, Ll/ۤۛۡ;->֫(Ll/ۤۛۡ;)V

    .line 91
    new-instance p0, Ll/᩺ۛۡ;

    new-instance v1, Ll/۫ۛۡ;

    invoke-direct {v1, v0}, Ll/۫ۛۡ;-><init>(Ljava/io/InputStream;)V

    const/4 v2, 0x1

    invoke-direct {p0, p1, v1, v2}, Ll/᩺ۛۡ;-><init>(Ll/ۤۛۡ;Ll/۫ۛۡ;Z)V

    const/4 p1, 0x0

    .line 92
    invoke-direct {p0, p1, p1, v2, p2}, Ll/᩺ۛۡ;->֫([ILandroid/graphics/Rect;ILl/ܿۖ᩷;)V

    return-object p0

    .line 89
    :cond_0
    new-instance p0, Ll/ۛۛۡ;

    const-string p1, "TGA input exceeds byte limit"

    .line 291
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 89
    throw p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    goto :goto_0

    :catch_2
    move-exception p0

    .line 95
    :goto_0
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V

    .line 96
    throw p0
.end method

.method public static ֫(Ll/ۤۛۡ;Landroid/graphics/Rect;I)V
    .locals 2

    .line 284
    invoke-virtual {p1}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p1, Landroid/graphics/Rect;->left:I

    if-ltz v0, :cond_0

    iget v0, p1, Landroid/graphics/Rect;->top:I

    if-ltz v0, :cond_0

    iget v0, p1, Landroid/graphics/Rect;->right:I

    iget v1, p0, Ll/ۤۛۡ;->ܺ:I

    if-gt v0, v1, :cond_0

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    iget p0, p0, Ll/ۤۛۡ;->ᩳ:I

    if-gt p1, p0, :cond_0

    if-lez p2, :cond_0

    return-void

    .line 286
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid TGA region or sample"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/ܿۖ᩷;)V
    .locals 1

    .line 297
    invoke-interface {p0}, Ll/ܿۖ᩷;->᩻()Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/io/InterruptedIOException;

    const-string v0, "TGA decoding canceled"

    invoke-direct {p0, v0}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private ֫([ILandroid/graphics/Rect;ILl/ܿۖ᩷;)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p3

    .line 183
    iget-object v3, v0, Ll/᩺ۛۡ;->᩹:Ll/ۤۛۡ;

    invoke-static {v3}, Ll/ۤۛۡ;->ۜ(Ll/ۤۛۡ;)I

    move-result v4

    int-to-long v4, v4

    invoke-static {v3}, Ll/ۤۛۡ;->᩻(Ll/ۤۛۡ;)I

    move-result v6

    int-to-long v6, v6

    mul-long v4, v4, v6

    if-nez v1, :cond_0

    const/4 v6, 0x0

    goto :goto_0

    .line 187
    :cond_0
    invoke-virtual/range {p2 .. p2}, Landroid/graphics/Rect;->width()I

    move-result v6

    invoke-static {v6, v2}, Ll/᩺ۛۡ;->֫(II)I

    move-result v6

    :goto_0
    const-wide/16 v7, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x1

    const/4 v11, 0x0

    :goto_1
    cmp-long v12, v7, v4

    if-gez v12, :cond_12

    .line 189
    invoke-static/range {p4 .. p4}, Ll/᩺ۛۡ;->֫(Ll/ܿۖ᩷;)V

    .line 310
    iget-object v12, v0, Ll/᩺ۛۡ;->᩶:Ll/۫ۛۡ;

    iget-wide v13, v12, Ll/۫ۛۡ;->ܽ:J

    .line 191
    invoke-static {v3}, Ll/ۤۛۡ;->ܺ(Ll/ۤۛۡ;)Z

    move-result v15

    if-eqz v15, :cond_1

    invoke-virtual {v12}, Ll/۫ۛۡ;->֫()I

    move-result v12

    goto :goto_2

    :cond_1
    const/4 v12, 0x0

    .line 192
    :goto_2
    invoke-static {v3}, Ll/ۤۛۡ;->ܺ(Ll/ۤۛۡ;)Z

    move-result v15

    if-eqz v15, :cond_2

    and-int/lit8 v15, v12, 0x7f

    add-int/lit8 v15, v15, 0x1

    move/from16 v16, v11

    move v2, v15

    move v15, v10

    goto :goto_3

    :cond_2
    const-wide/16 v1, 0x80

    move v15, v10

    move/from16 v16, v11

    sub-long v10, v4, v7

    invoke-static {v1, v2, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v2, v1

    :goto_3
    int-to-long v10, v2

    sub-long v17, v4, v7

    cmp-long v1, v10, v17

    if-gtz v1, :cond_11

    .line 194
    iget-object v1, v0, Ll/᩺ۛۡ;->۬:[J

    if-eqz v1, :cond_5

    move-wide/from16 v17, v4

    move/from16 v4, v16

    .line 195
    :goto_4
    invoke-static {v3}, Ll/ۤۛۡ;->᩻(Ll/ۤۛۡ;)I

    move-result v5

    if-ge v4, v5, :cond_3

    move/from16 v19, v6

    int-to-long v5, v4

    move/from16 v20, v2

    invoke-static {v3}, Ll/ۤۛۡ;->ۜ(Ll/ۤۛۡ;)I

    move-result v2

    move-object/from16 v21, v3

    int-to-long v2, v2

    mul-long v2, v2, v5

    add-long v5, v7, v10

    cmp-long v16, v2, v5

    if-gez v16, :cond_4

    .line 196
    aput-wide v13, v1, v4

    add-int/lit8 v2, v4, 0x1

    .line 197
    iget-object v3, v0, Ll/᩺ۛۡ;->۫:[J

    aput-wide v7, v3, v4

    move v4, v2

    move/from16 v6, v19

    move/from16 v2, v20

    move-object/from16 v3, v21

    goto :goto_4

    :cond_3
    move/from16 v20, v2

    move-object/from16 v21, v3

    move/from16 v19, v6

    :cond_4
    move/from16 v16, v4

    goto :goto_5

    :cond_5
    move/from16 v20, v2

    move-object/from16 v21, v3

    move-wide/from16 v17, v4

    move/from16 v19, v6

    .line 200
    :goto_5
    invoke-static/range {v21 .. v21}, Ll/ۤۛۡ;->ܺ(Ll/ۤۛۡ;)Z

    move-result v1

    if-eqz v1, :cond_6

    and-int/lit16 v1, v12, 0x80

    if-eqz v1, :cond_6

    const/4 v1, 0x1

    goto :goto_6

    :cond_6
    const/4 v1, 0x0

    :goto_6
    if-eqz v1, :cond_7

    .line 201
    invoke-direct/range {p0 .. p0}, Ll/᩺ۛۡ;->֫()I

    move-result v2

    goto :goto_7

    :cond_7
    const/4 v2, 0x0

    :goto_7
    const/16 v3, 0xff

    if-eqz v1, :cond_a

    if-nez p1, :cond_a

    ushr-int/lit8 v1, v2, 0x18

    if-nez v1, :cond_8

    const/4 v2, 0x1

    goto :goto_8

    :cond_8
    const/4 v2, 0x0

    :goto_8
    and-int/2addr v2, v9

    if-ne v1, v3, :cond_9

    const/4 v1, 0x1

    goto :goto_9

    :cond_9
    const/4 v1, 0x0

    :goto_9
    and-int/2addr v1, v15

    add-long/2addr v7, v10

    move-object/from16 v6, p2

    move v10, v1

    move v9, v2

    move-object/from16 v1, v21

    goto/16 :goto_f

    :cond_a
    const/4 v3, 0x0

    move/from16 v4, v20

    :goto_a
    if-ge v3, v4, :cond_10

    if-eqz v1, :cond_b

    move v5, v2

    goto :goto_b

    .line 209
    :cond_b
    invoke-direct/range {p0 .. p0}, Ll/᩺ۛۡ;->֫()I

    move-result v5

    :goto_b
    ushr-int/lit8 v6, v5, 0x18

    if-nez v6, :cond_c

    const/4 v12, 0x1

    goto :goto_c

    :cond_c
    const/4 v12, 0x0

    :goto_c
    and-int/2addr v9, v12

    const/16 v12, 0xff

    if-ne v6, v12, :cond_d

    const/4 v6, 0x1

    goto :goto_d

    :cond_d
    const/4 v6, 0x0

    :goto_d
    and-int/2addr v15, v6

    if-eqz p1, :cond_e

    int-to-long v12, v3

    add-long/2addr v12, v7

    .line 215
    invoke-static/range {v21 .. v21}, Ll/ۤۛۡ;->ۜ(Ll/ۤۛۡ;)I

    move-result v6

    move v14, v1

    move/from16 v20, v2

    int-to-long v1, v6

    rem-long v1, v12, v1

    long-to-int v2, v1

    move-object/from16 v1, v21

    invoke-static {v1, v2}, Ll/ۤۛۡ;->ܽ(Ll/ۤۛۡ;I)I

    move-result v2

    move-object/from16 v6, p2

    move/from16 v21, v4

    iget v4, v6, Landroid/graphics/Rect;->left:I

    sub-int/2addr v2, v4

    .line 216
    invoke-static {v1}, Ll/ۤۛۡ;->ۜ(Ll/ۤۛۡ;)I

    move-result v4

    move/from16 v23, v14

    move/from16 v22, v15

    int-to-long v14, v4

    div-long/2addr v12, v14

    long-to-int v4, v12

    invoke-static {v1, v4}, Ll/ۤۛۡ;->ᩳ(Ll/ۤۛۡ;I)I

    move-result v4

    iget v12, v6, Landroid/graphics/Rect;->top:I

    sub-int/2addr v4, v12

    if-ltz v2, :cond_f

    if-ltz v4, :cond_f

    .line 217
    invoke-virtual/range {p2 .. p2}, Landroid/graphics/Rect;->width()I

    move-result v12

    if-ge v2, v12, :cond_f

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/Rect;->height()I

    move-result v12

    if-ge v4, v12, :cond_f

    rem-int v12, v2, p3

    if-nez v12, :cond_f

    rem-int v12, v4, p3

    if-nez v12, :cond_f

    .line 219
    div-int v4, v4, p3

    mul-int v4, v4, v19

    div-int v2, v2, p3

    add-int/2addr v2, v4

    aput v5, p1, v2

    goto :goto_e

    :cond_e
    move-object/from16 v6, p2

    move/from16 v23, v1

    move/from16 v20, v2

    move/from16 v22, v15

    move-object/from16 v1, v21

    move/from16 v21, v4

    :cond_f
    :goto_e
    add-int/lit8 v3, v3, 0x1

    move/from16 v2, v20

    move/from16 v4, v21

    move/from16 v15, v22

    move-object/from16 v21, v1

    move/from16 v1, v23

    goto/16 :goto_a

    :cond_10
    move-object/from16 v6, p2

    move-object/from16 v1, v21

    add-long/2addr v7, v10

    move v10, v15

    :goto_f
    move/from16 v2, p3

    move-object v3, v1

    move-object v1, v6

    move/from16 v11, v16

    move-wide/from16 v4, v17

    move/from16 v6, v19

    goto/16 :goto_1

    .line 193
    :cond_11
    new-instance v1, Ljava/io/IOException;

    const-string v2, "TGA packet exceeds frame bounds"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_12
    move-object v1, v3

    move v15, v10

    .line 224
    invoke-static {v1}, Ll/ۤۛۡ;->ۖ(Ll/ۤۛۡ;)Z

    move-result v2

    if-eqz v2, :cond_16

    invoke-static {v1}, Ll/ۤۛۡ;->ۡ(Ll/ۤۛۡ;)I

    move-result v2

    const/4 v3, 0x2

    if-eq v2, v3, :cond_13

    invoke-static {v1}, Ll/ۤۛۡ;->ۡ(Ll/ۤۛۡ;)I

    move-result v2

    const/4 v3, 0x4

    if-ne v2, v3, :cond_16

    .line 225
    :cond_13
    invoke-static {v1}, Ll/ۤۛۡ;->ۢ(Ll/ۤۛۡ;)Z

    move-result v1

    if-eqz v1, :cond_14

    if-eqz v9, :cond_16

    goto :goto_10

    :cond_14
    if-nez v9, :cond_15

    if-eqz v15, :cond_16

    :cond_15
    :goto_10
    const/4 v1, 0x1

    goto :goto_11

    :cond_16
    const/4 v1, 0x0

    :goto_11
    iput-boolean v1, v0, Ll/᩺ۛۡ;->᩸:Z

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/᩺ۛۡ;)Ll/۫ۛۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩺ۛۡ;->᩶:Ll/۫ۛۡ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/᩺ۛۡ;)I
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩺ۛۡ;->֫()I

    move-result p0

    return p0
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 300
    iget-object v0, p0, Ll/᩺ۛۡ;->᩶:Ll/۫ۛۡ;

    iget-object v0, v0, Ll/۫ۛۡ;->ܿ:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-void
.end method

.method public final ֫(Landroid/graphics/Rect;ILl/ܿۖ᩷;)Landroid/graphics/Bitmap;
    .locals 22

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v2, p2

    .line 138
    iget-object v3, v1, Ll/᩺ۛۡ;->᩹:Ll/ۤۛۡ;

    invoke-static {v3, v0, v2}, Ll/᩺ۛۡ;->֫(Ll/ۤۛۡ;Landroid/graphics/Rect;I)V

    .line 139
    invoke-static/range {p3 .. p3}, Ll/᩺ۛۡ;->֫(Ll/ܿۖ᩷;)V

    .line 140
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Rect;->width()I

    move-result v4

    invoke-static {v4, v2}, Ll/᩺ۛۡ;->֫(II)I

    move-result v4

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Rect;->height()I

    move-result v5

    invoke-static {v5, v2}, Ll/᩺ۛۡ;->֫(II)I

    move-result v13

    .line 141
    new-array v14, v4, [I

    .line 142
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v4, v13, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v15

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v12, 0x0

    :goto_0
    if-ge v12, v13, :cond_8

    .line 145
    :try_start_0
    invoke-static/range {p3 .. p3}, Ll/᩺ۛۡ;->֫(Ll/ܿۖ᩷;)V

    .line 146
    invoke-static {v14, v5}, Ljava/util/Arrays;->fill([II)V

    .line 147
    iget v6, v0, Landroid/graphics/Rect;->top:I

    mul-int v7, v12, v2

    add-int/2addr v7, v6

    invoke-static {v3, v7}, Ll/ۤۛۡ;->ۧ(Ll/ۤۛۡ;I)I

    move-result v6

    if-ltz v6, :cond_6

    .line 148
    invoke-static {v3}, Ll/ۤۛۡ;->᩻(Ll/ۤۛۡ;)I

    move-result v7

    if-ge v6, v7, :cond_6

    .line 149
    iget v7, v0, Landroid/graphics/Rect;->left:I

    invoke-static {v3, v7}, Ll/ۤۛۡ;->֫(Ll/ۤۛۡ;I)I

    move-result v7

    .line 150
    iget v8, v0, Landroid/graphics/Rect;->left:I

    add-int/lit8 v9, v4, -0x1

    mul-int v9, v9, v2

    add-int/2addr v9, v8

    invoke-static {v3, v9}, Ll/ۤۛۡ;->֫(Ll/ۤۛۡ;I)I

    move-result v8

    .line 151
    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    move-result v9

    invoke-static {v5, v9}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 152
    invoke-static {v3}, Ll/ۤۛۡ;->ۜ(Ll/ۤۛۡ;)I

    move-result v9

    add-int/lit8 v9, v9, -0x1

    invoke-static {v7, v8}, Ljava/lang/Math;->max(II)I

    move-result v7

    invoke-static {v9, v7}, Ljava/lang/Math;->min(II)I

    move-result v7

    if-gt v5, v7, :cond_6

    int-to-long v8, v6

    .line 155
    invoke-static {v3}, Ll/ۤۛۡ;->ۜ(Ll/ۤۛۡ;)I

    move-result v10

    int-to-long v10, v10

    mul-long v8, v8, v10

    .line 156
    invoke-static {v3}, Ll/ۤۛۡ;->ܺ(Ll/ۤۛۡ;)Z

    move-result v10
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v11, v1, Ll/᩺ۛۡ;->᩶:Ll/۫ۛۡ;

    if-eqz v10, :cond_1

    .line 157
    :try_start_1
    iget-object v10, v1, Ll/᩺ۛۡ;->۬:[J

    move/from16 v17, v12

    move/from16 v16, v13

    aget-wide v12, v10, v6

    invoke-virtual {v11, v12, v13}, Ll/۫ۛۡ;->֫(J)V

    .line 158
    new-instance v10, Ll/ۨۛۡ;

    iget-object v11, v1, Ll/᩺ۛۡ;->۫:[J

    aget-wide v12, v11, v6

    invoke-direct {v10, v1, v12, v13}, Ll/ۨۛۡ;-><init>(Ll/᩺ۛۡ;J)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0

    move-object/from16 v18, v14

    move-object/from16 v19, v15

    int-to-long v14, v5

    add-long/2addr v8, v14

    sub-long/2addr v8, v12

    const-wide/16 v11, 0x0

    move-wide v13, v11

    :goto_1
    cmp-long v6, v13, v8

    if-gez v6, :cond_2

    const-wide/16 v20, 0x3ff

    and-long v20, v13, v20

    cmp-long v6, v20, v11

    if-nez v6, :cond_0

    .line 277
    :try_start_2
    invoke-static/range {p3 .. p3}, Ll/᩺ۛۡ;->֫(Ll/ܿۖ᩷;)V

    .line 278
    :cond_0
    invoke-virtual {v10}, Ll/ۨۛۡ;->֫()I

    const-wide/16 v20, 0x1

    add-long v13, v13, v20

    goto :goto_1

    :catch_0
    move-exception v0

    :goto_2
    move-object/from16 v19, v15

    goto/16 :goto_4

    :catch_1
    move-exception v0

    goto :goto_2

    :catch_2
    move-exception v0

    goto :goto_2

    :cond_1
    move/from16 v17, v12

    move/from16 v16, v13

    move-object/from16 v18, v14

    move-object/from16 v19, v15

    .line 161
    iget-wide v12, v1, Ll/᩺ۛۡ;->ۗ:J

    int-to-long v14, v5

    add-long/2addr v8, v14

    invoke-static {v3}, Ll/ۤۛۡ;->ۡ(Ll/ۤۛۡ;)I

    move-result v6

    int-to-long v14, v6

    mul-long v14, v14, v8

    add-long/2addr v14, v12

    invoke-virtual {v11, v14, v15}, Ll/۫ۛۡ;->֫(J)V

    .line 162
    new-instance v10, Ll/ۨۛۡ;

    invoke-direct {v10, v1, v8, v9}, Ll/ۨۛۡ;-><init>(Ll/᩺ۛۡ;J)V

    :cond_2
    :goto_3
    if-gt v5, v7, :cond_7

    and-int/lit16 v6, v5, 0x3ff

    if-nez v6, :cond_3

    .line 165
    invoke-static/range {p3 .. p3}, Ll/᩺ۛۡ;->֫(Ll/ܿۖ᩷;)V

    .line 166
    :cond_3
    invoke-virtual {v10}, Ll/ۨۛۡ;->֫()I

    move-result v6

    .line 167
    invoke-static {v3, v5}, Ll/ۤۛۡ;->ܽ(Ll/ۤۛۡ;I)I

    move-result v8

    iget v9, v0, Landroid/graphics/Rect;->left:I

    sub-int/2addr v8, v9

    if-ltz v8, :cond_5

    .line 168
    rem-int v9, v8, v2

    if-nez v9, :cond_5

    div-int v9, v8, v2

    if-ge v9, v4, :cond_5

    .line 169
    div-int/2addr v8, v2

    iget-boolean v9, v1, Ll/᩺ۛۡ;->᩸:Z

    if-eqz v9, :cond_4

    const/high16 v9, -0x1000000

    or-int/2addr v6, v9

    :cond_4
    aput v6, v18, v8

    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :catch_3
    move-exception v0

    goto :goto_4

    :catch_4
    move-exception v0

    goto :goto_4

    :catch_5
    move-exception v0

    goto :goto_4

    :cond_6
    move/from16 v17, v12

    move/from16 v16, v13

    move-object/from16 v18, v14

    move-object/from16 v19, v15

    :cond_7
    const/4 v9, 0x0

    const/4 v12, 0x1

    const/4 v7, 0x0

    move-object/from16 v5, v19

    move-object/from16 v6, v18

    move v8, v4

    move/from16 v10, v17

    move v11, v4

    move/from16 v13, v17

    .line 173
    invoke-virtual/range {v5 .. v12}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_3

    add-int/lit8 v12, v13, 0x1

    const/4 v5, 0x0

    move/from16 v13, v16

    move-object/from16 v14, v18

    move-object/from16 v15, v19

    goto/16 :goto_0

    .line 177
    :goto_4
    invoke-virtual/range {v19 .. v19}, Landroid/graphics/Bitmap;->recycle()V

    .line 178
    throw v0

    :cond_8
    move-object/from16 v19, v15

    return-object v19
.end method
