.class public final Ll/᩵ۗۜ;
.super Ljava/lang/Object;
.source "P79M"


# direct methods
.method public static ֫(Landroid/content/Context;Ll/ܶ᩵ܿ;)I
    .locals 6

    .line 40
    new-instance v0, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v0}, Landroid/media/MediaMetadataRetriever;-><init>()V

    const/4 v1, -0x1

    const/4 v2, 0x0

    .line 43
    :try_start_0
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->֡()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 44
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->֫֫()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    goto :goto_0

    .line 45
    :cond_0
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩵֫()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 46
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    goto :goto_0

    .line 47
    :cond_1
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x17

    if-lt p0, v3, :cond_8

    .line 48
    new-instance p0, Ll/᩺ۢۡ;

    invoke-direct {p0, p1}, Ll/᩺ۢۡ;-><init>(Ll/ܶ᩵ܿ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 49
    :try_start_1
    invoke-virtual {v0, p0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/media/MediaDataSource;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v2, p0

    :goto_0
    const/16 p0, 0x12

    .line 54
    :try_start_2
    invoke-virtual {v0, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p0

    const/16 p1, 0x13

    .line 55
    invoke-virtual {v0, p1}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p1

    const/16 v3, 0x18

    .line 56
    invoke-virtual {v0, v3}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz p0, :cond_3

    .line 88
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    if-eqz v5, :cond_2

    goto :goto_1

    .line 92
    :cond_2
    :try_start_3
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_2

    :catch_0
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 74
    :goto_2
    :try_start_4
    invoke-static {p0, v4}, Ljava/lang/Math;->max(II)I

    move-result p0

    if-eqz p1, :cond_5

    .line 88
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    if-eqz v5, :cond_4

    goto :goto_3

    .line 92
    :cond_4
    :try_start_5
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_4

    :catch_1
    :cond_5
    :goto_3
    const/4 p1, 0x0

    .line 74
    :goto_4
    :try_start_6
    invoke-static {p1, v4}, Ljava/lang/Math;->max(II)I

    move-result p1

    if-eqz v3, :cond_7

    .line 88
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    if-eqz v5, :cond_6

    goto :goto_5

    .line 92
    :cond_6
    :try_start_7
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4
    :try_end_7
    .catch Ljava/lang/NumberFormatException; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :catch_2
    :cond_7
    :goto_5
    const/high16 v3, 0x3f800000    # 1.0f

    .line 28
    :try_start_8
    invoke-static {p0, p1, v4, v3}, Ll/ۡ۬ۜ;->֫(IIIF)I

    move-result p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 62
    :try_start_9
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 65
    :catchall_0
    invoke-static {v2}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return p0

    :catchall_1
    move-object v2, p0

    goto :goto_6

    .line 62
    :cond_8
    :try_start_a
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    :catchall_2
    return v1

    :catchall_3
    :goto_6
    :try_start_b
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 65
    :catchall_4
    invoke-static {v2}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return v1
.end method
