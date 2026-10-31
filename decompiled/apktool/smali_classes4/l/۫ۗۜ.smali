.class public final Ll/۫ۗۜ;
.super Ljava/lang/Object;
.source "M799"

# interfaces
.implements Ll/۬ۗۜ;


# instance fields
.field public final ֫:Ljava/io/Closeable;

.field public final ۧ:Landroid/media/MediaMetadataRetriever;


# direct methods
.method public constructor <init>(Landroid/media/MediaMetadataRetriever;Ljava/io/Closeable;)V
    .locals 0

    .line 743
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 744
    iput-object p1, p0, Ll/۫ۗۜ;->ۧ:Landroid/media/MediaMetadataRetriever;

    .line 745
    iput-object p2, p0, Ll/۫ۗۜ;->֫:Ljava/io/Closeable;

    return-void
.end method

.method public static bridge synthetic ֫(Landroid/media/MediaMetadataRetriever;JII)Landroid/graphics/Bitmap;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2, p3, p4}, Ll/۫ۗۜ;->ۧ(Landroid/media/MediaMetadataRetriever;JII)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/content/Context;Ll/۫֡ۜ;)Ll/۬ۗۜ;
    .locals 6

    .line 754
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 756
    :try_start_0
    invoke-static {p1}, Ll/ۗۗۜ;->֫(Ll/۫֡ۜ;)Ll/ۗۗۜ;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_0

    return-object v0

    .line 764
    :catch_0
    :cond_0
    new-instance v0, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v0}, Landroid/media/MediaMetadataRetriever;-><init>()V

    const/4 v2, 0x0

    .line 767
    :try_start_1
    invoke-virtual {p1}, Ll/۫֡ۜ;->ᩳ()Z

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const-string v4, "Unsupported video preview data source"

    if-eqz v3, :cond_5

    .line 768
    :try_start_2
    invoke-virtual {p1}, Ll/۫֡ۜ;->֫()Ll/ܶ᩵ܿ;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 772
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->֡()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 773
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->֫֫()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    goto :goto_0

    .line 774
    :cond_1
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩵֫()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 775
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    goto :goto_0

    .line 776
    :cond_2
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p0, v1, :cond_3

    .line 777
    new-instance p0, Ll/᩺ۢۡ;

    invoke-direct {p0, p1}, Ll/᩺ۢۡ;-><init>(Ll/ܶ᩵ܿ;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 779
    :try_start_3
    invoke-virtual {v0, p0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/media/MediaDataSource;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object v2, p0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 781
    :cond_3
    :try_start_4
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 770
    :cond_4
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Missing local preview file"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 783
    :cond_5
    invoke-virtual {p1}, Ll/۫֡ۜ;->ܳ()Z

    move-result p0

    if-eqz p0, :cond_7

    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p0, v1, :cond_7

    .line 784
    invoke-virtual {p1}, Ll/۫֡ۜ;->ۢ()Ll/᩺֡ۜ;

    move-result-object p0

    if-eqz p0, :cond_6

    .line 788
    invoke-virtual {p0}, Ll/᩺֡ۜ;->ۧ()Ll/ܰ֡ۜ;

    move-result-object v2

    .line 790
    invoke-virtual {v2, v0}, Ll/ܰ֡ۜ;->֫(Landroid/media/MediaMetadataRetriever;)V

    goto :goto_0

    .line 786
    :cond_6
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Missing network preview descriptor"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 791
    :cond_7
    invoke-virtual {p1}, Ll/۫֡ۜ;->᩻()Z

    move-result p0

    if-eqz p0, :cond_9

    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p0, v1, :cond_9

    .line 792
    invoke-virtual {p1}, Ll/۫֡ۜ;->ۡ()Ll/۟ܰۜ;

    move-result-object p0

    if-eqz p0, :cond_8

    .line 796
    new-instance p1, Ll/ۛ᩶ۜ;

    invoke-direct {p1, p0}, Ll/ۛ᩶ۜ;-><init>(Ll/۟ܰۜ;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 798
    :try_start_5
    invoke-virtual {v0, p1}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/media/MediaDataSource;)V

    .line 799
    invoke-virtual {p1}, Ll/ۛ᩶ۜ;->֫()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    move-object v2, p1

    .line 803
    :goto_0
    :try_start_6
    new-instance p0, Ll/۫ۗۜ;

    invoke-direct {p0, v0, v2}, Ll/۫ۗۜ;-><init>(Landroid/media/MediaMetadataRetriever;Ljava/io/Closeable;)V

    return-object p0

    :catchall_1
    move-exception p0

    move-object v5, p1

    move-object p1, p0

    move-object p0, v5

    goto :goto_1

    .line 794
    :cond_8
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Missing paged preview handle"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 801
    :cond_9
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception p0

    move-object p1, p0

    move-object p0, v2

    .line 806
    :goto_1
    :try_start_7
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_2

    :catchall_3
    nop

    .line 809
    :goto_2
    invoke-static {p0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 810
    instance-of p0, p1, Ljava/io/IOException;

    if-eqz p0, :cond_a

    check-cast p1, Ljava/io/IOException;

    .line 811
    throw p1

    .line 813
    :cond_a
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Failed to open video preview data source"

    invoke-direct {p0, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p0
.end method

.method public static bridge synthetic ֫(Landroid/media/MediaMetadataRetriever;)Ll/ܰۗۜ;
    .locals 0

    .line 0
    invoke-static {p0}, Ll/۫ۗۜ;->ۧ(Landroid/media/MediaMetadataRetriever;)Ll/ܰۗۜ;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Landroid/media/MediaMetadataRetriever;JII)Landroid/graphics/Bitmap;
    .locals 9

    .line 828
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    const/4 v2, 0x1

    if-lt v0, v1, :cond_0

    .line 832
    invoke-static {v2, p3}, Ljava/lang/Math;->max(II)I

    move-result v7

    .line 833
    invoke-static {v2, p4}, Ljava/lang/Math;->max(II)I

    move-result v8

    const/4 v6, 0x2

    move-object v3, p0

    move-wide v4, p1

    .line 829
    invoke-virtual/range {v3 .. v8}, Landroid/media/MediaMetadataRetriever;->getScaledFrameAtTime(JIII)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 v0, 0x2

    .line 836
    invoke-virtual {p0, p1, p2, v0}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime(JI)Landroid/graphics/Bitmap;

    move-result-object p0

    if-nez p0, :cond_1

    const/4 p0, 0x0

    return-object p0

    .line 873
    :cond_1
    invoke-static {v2, p3}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 874
    invoke-static {v2, p4}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 875
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p3

    if-gt p3, p1, :cond_2

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p3

    if-gt p3, p2, :cond_2

    return-object p0

    :cond_2
    int-to-float p1, p1

    .line 878
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p3

    int-to-float p3, p3

    div-float/2addr p1, p3

    int-to-float p2, p2

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p3

    int-to-float p3, p3

    div-float/2addr p2, p3

    invoke-static {p1, p2}, Ljava/lang/Math;->min(FF)F

    move-result p1

    .line 879
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p2

    int-to-float p2, p2

    mul-float p2, p2, p1

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    invoke-static {v2, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 880
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p3

    int-to-float p3, p3

    mul-float p3, p3, p1

    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    move-result p1

    invoke-static {v2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 881
    invoke-static {p0, p2, p1, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Landroid/media/MediaMetadataRetriever;)Ll/ܰۗۜ;
    .locals 4

    const/16 v0, 0x12

    .line 853
    invoke-virtual {p0, v0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 895
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 899
    :cond_0
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 888
    :goto_1
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    const/16 v2, 0x13

    .line 854
    invoke-virtual {p0, v2}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 895
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_2

    .line 899
    :cond_2
    :try_start_1
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    :cond_3
    :goto_2
    const/4 v2, 0x0

    .line 888
    :goto_3
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    const/16 v3, 0x18

    .line 855
    invoke-virtual {p0, v3}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_5

    .line 895
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_4

    .line 899
    :cond_4
    :try_start_2
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :cond_5
    :goto_4
    const/high16 p0, 0x3f800000    # 1.0f

    .line 79
    invoke-static {v0, v2, v1, p0}, Ll/֫۬ۜ;->֫(IIIF)Ll/ܰۗۜ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫(JIILl/᩶ۗۜ;)Landroid/graphics/Bitmap;
    .locals 0

    .line 523
    invoke-interface {p5}, Ll/᩶ۗۜ;->֫()V

    .line 820
    iget-object p5, p0, Ll/۫ۗۜ;->ۧ:Landroid/media/MediaMetadataRetriever;

    invoke-static {p5, p1, p2, p3, p4}, Ll/۫ۗۜ;->ۧ(Landroid/media/MediaMetadataRetriever;JII)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()V
    .locals 1

    .line 862
    :try_start_0
    iget-object v0, p0, Ll/۫ۗۜ;->ۧ:Landroid/media/MediaMetadataRetriever;

    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 865
    :catchall_0
    iget-object v0, p0, Ll/۫ۗۜ;->֫:Ljava/io/Closeable;

    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-void
.end method

.method public final synthetic ۧ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final synthetic ܽ()V
    .locals 0

    return-void
.end method

.method public final ᩳ()Ll/ܰۗۜ;
    .locals 1

    .line 846
    iget-object v0, p0, Ll/۫ۗۜ;->ۧ:Landroid/media/MediaMetadataRetriever;

    invoke-static {v0}, Ll/۫ۗۜ;->ۧ(Landroid/media/MediaMetadataRetriever;)Ll/ܰۗۜ;

    move-result-object v0

    return-object v0
.end method
