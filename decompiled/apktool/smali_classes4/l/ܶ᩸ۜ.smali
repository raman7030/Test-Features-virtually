.class public final Ll/ܶ᩸ۜ;
.super Ljava/lang/Object;
.source "R8UV"


# instance fields
.field public final ֫:Landroid/graphics/Bitmap;

.field public final ۧ:Ljava/lang/String;

.field public final ܳ:Ljava/lang/String;

.field public final ܽ:Z

.field public final ܿ:Landroid/graphics/Bitmap;

.field public ᩳ:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Ll/ۧ᩵֫;Landroid/media/MediaMetadataRetriever;)V
    .locals 3

    const/4 v0, 0x7

    .line 118
    invoke-virtual {p2, v0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    .line 122
    invoke-virtual {p2, v1}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v1

    .line 123
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v1, 0x2

    .line 124
    invoke-virtual {p2, v1}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v1

    .line 79
    :cond_0
    invoke-virtual {p2}, Landroid/media/MediaMetadataRetriever;->getEmbeddedPicture()[B

    move-result-object p2

    invoke-direct {p0, p1, v0, v1, p2}, Ll/ܶ᩸ۜ;-><init>(Ll/ۧ᩵֫;Ljava/lang/CharSequence;Ljava/lang/CharSequence;[B)V

    return-void
.end method

.method public constructor <init>(Ll/ۧ᩵֫;Ljava/lang/CharSequence;Ljava/lang/CharSequence;[B)V
    .locals 7

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 36
    iget-object p1, p1, Ll/ۧ᩵֫;->ᩳ:Ljava/lang/String;

    invoke-static {p1}, Ll/ܶ᩸ۜ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 40
    :goto_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p3, "unknown"

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    .line 45
    :goto_1
    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܶ᩸ۜ;->ܳ:Ljava/lang/String;

    .line 46
    invoke-interface {p3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܶ᩸ۜ;->ۧ:Ljava/lang/String;

    if-eqz p4, :cond_2

    .line 48
    array-length p1, p4

    invoke-static {p4, v1, p1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 49
    new-instance p2, Ll/֨᩸ۜ;

    .line 153
    invoke-static {}, Ll/ۙ᩸᩷;->᩵()Landroid/content/res/Resources;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 49
    iput-object p2, p0, Ll/ܶ᩸ۜ;->ᩳ:Landroid/graphics/drawable/Drawable;

    const/4 p1, 0x0

    goto :goto_2

    .line 52
    :cond_2
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result p2

    int-to-long v3, p2

    const/16 p2, 0x20

    shl-long/2addr v3, p2

    invoke-virtual {p3}, Ljava/lang/Object;->hashCode()I

    move-result p2

    int-to-long p2, p2

    const-wide v5, 0xffffffffL

    and-long/2addr p2, v5

    or-long/2addr p2, v3

    .line 53
    invoke-static {p2, p3}, Ll/֡᩸ۜ;->֫(J)Ll/֡᩸ۜ;

    move-result-object p2

    iput-object p2, p0, Ll/ܶ᩸ۜ;->ᩳ:Landroid/graphics/drawable/Drawable;

    .line 55
    :goto_2
    iput-boolean p1, p0, Ll/ܶ᩸ۜ;->ܽ:Z

    .line 57
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 58
    iget-object p2, p0, Ll/ܶ᩸ۜ;->ᩳ:Landroid/graphics/drawable/Drawable;

    const/16 p3, 0x21

    if-gt p3, p1, :cond_3

    const/16 p3, 0x23

    if-gt p1, p3, :cond_3

    goto :goto_3

    :cond_3
    const/4 v2, 0x0

    :goto_3
    const/16 p1, 0x200

    invoke-static {p2, p1, p1, v2}, Ll/ܶ᩸ۜ;->֫(Landroid/graphics/drawable/Drawable;IIZ)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Ll/ܶ᩸ۜ;->֫:Landroid/graphics/Bitmap;

    .line 59
    iget-object p1, p0, Ll/ܶ᩸ۜ;->ᩳ:Landroid/graphics/drawable/Drawable;

    const/16 p2, 0x100

    invoke-static {p1, p2, p2, v1}, Ll/ܶ᩸ۜ;->֫(Landroid/graphics/drawable/Drawable;IIZ)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Ll/ܶ᩸ۜ;->ܿ:Landroid/graphics/Bitmap;

    return-void
.end method

.method public static ֫(Landroid/graphics/drawable/Drawable;IIZ)Landroid/graphics/Bitmap;
    .locals 5

    .line 64
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p1, p2, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 65
    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 67
    new-instance v2, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v3, 0x3

    const/4 v4, 0x0

    invoke-direct {v2, v4, v3}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {v1, v2}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 69
    invoke-virtual {p0, v4, v4, p1, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 70
    invoke-virtual {p0, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    if-eqz p3, :cond_0

    const/high16 p0, 0x40000000    # 2.0f

    .line 72
    invoke-virtual {v1, p0}, Landroid/graphics/Canvas;->drawColor(I)V

    :cond_0
    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/16 v0, 0x2e

    .line 143
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 145
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    :cond_0
    const/4 v1, 0x0

    .line 147
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0x32

    invoke-static {v0, p0}, Ll/ۜۚۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۧ᩵֫;Ll/ᩳۜܳ;)Ll/۠᩸ۜ;
    .locals 8

    const-string v0, "r"

    .line 86
    invoke-interface {p1}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 87
    new-instance v1, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v1}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 90
    :try_start_0
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ۜ(Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    if-eqz v2, :cond_3

    .line 94
    :try_start_1
    invoke-virtual {v2}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/io/FileDescriptor;)V

    .line 95
    new-instance v3, Ll/ܶ᩸ۜ;

    invoke-direct {v3, p0, v1}, Ll/ܶ᩸ۜ;-><init>(Ll/ۧ᩵֫;Landroid/media/MediaMetadataRetriever;)V

    const/16 v4, 0x9

    .line 131
    invoke-virtual {v1, v4}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v4

    .line 132
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const-wide/16 v6, 0x0

    if-eqz v5, :cond_0

    goto :goto_0

    .line 136
    :cond_0
    :try_start_2
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 97
    :catch_0
    :goto_0
    :try_start_3
    invoke-virtual {v2}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 99
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 101
    iget-boolean v1, v3, Ll/ܶ᩸ۜ;->ܽ:Z

    if-eqz v1, :cond_2

    .line 103
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object p1

    .line 104
    :try_start_4
    invoke-static {p1}, Ll/ۢۛۜ;->֫(Ll/᩻ۖܽ;)Ll/ۢۛۜ;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 106
    new-instance v1, Ll/ܶ᩸ۜ;

    invoke-virtual {v0}, Ll/ۢۛۜ;->ᩳ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ll/ۢۛۜ;->֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ll/ۢۛۜ;->ܽ()[B

    move-result-object v0

    invoke-direct {v1, p0, v2, v3, v0}, Ll/ܶ᩸ۜ;-><init>(Ll/ۧ᩵֫;Ljava/lang/CharSequence;Ljava/lang/CharSequence;[B)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-object v3, v1

    .line 108
    :cond_1
    invoke-virtual {p1}, Ll/᩻ۖܽ;->close()V

    goto :goto_2

    :catchall_0
    move-exception p0

    .line 103
    :try_start_5
    invoke-virtual {p1}, Ll/᩻ۖܽ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p0

    .line 110
    :cond_2
    :goto_2
    new-instance p0, Ll/۠᩸ۜ;

    invoke-direct {p0, v3, v6, v7}, Ll/۠᩸ۜ;-><init>(Ll/ܶ᩸ۜ;J)V

    return-object p0

    .line 92
    :cond_3
    :try_start_6
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Music file descriptor is unavailable"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception p0

    if-eqz v2, :cond_4

    .line 90
    :try_start_7
    invoke-virtual {v2}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception p1

    :try_start_8
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_3
    throw p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    :catchall_4
    move-exception p0

    .line 99
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 100
    throw p0
.end method
