.class public final Ll/ۙۚۜ;
.super Ljava/lang/Object;
.source "B75R"


# instance fields
.field public final ֫:Ljava/util/concurrent/Executor;

.field public final ۜ:Ll/᩶۫᩷;

.field public final ۧ:Ljava/lang/Object;

.field public ܳ:Ll/᩶ۚۜ;

.field public final ܽ:Ljava/util/ArrayDeque;

.field public ܿ:Ll/᩶ۚۜ;

.field public ᩳ:Ll/᩶ۚۜ;

.field public ᩻:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 43
    sget-object v0, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ll/᩶۫᩷;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v2, Ljava/lang/Object;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v2, p0, Ll/ۙۚۜ;->ۧ:Ljava/lang/Object;

    .line 37
    new-instance v2, Ljava/util/ArrayDeque;

    invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v2, p0, Ll/ۙۚۜ;->ܽ:Ljava/util/ArrayDeque;

    .line 64
    iput-object v0, p0, Ll/ۙۚۜ;->֫:Ljava/util/concurrent/Executor;

    .line 67
    iput-object v1, p0, Ll/ۙۚۜ;->ۜ:Ll/᩶۫᩷;

    return-void
.end method

.method public static ֫(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    .locals 2

    if-eqz p0, :cond_3

    .line 598
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    if-gt v0, p1, :cond_0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    if-gt v0, p2, :cond_0

    goto :goto_0

    :cond_0
    int-to-float p1, p1

    .line 602
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p1, v0

    int-to-float p2, p2

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p2, v0

    .line 601
    invoke-static {p1, p2}, Ljava/lang/Math;->min(FF)F

    move-result p1

    .line 606
    :try_start_0
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p2

    int-to-float p2, p2

    mul-float p2, p2, p1

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    const/4 v0, 0x1

    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 607
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-float v1, v1

    mul-float v1, v1, p1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 604
    invoke-static {p0, p2, p1, v0}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p1

    if-eq p1, p0, :cond_1

    .line 610
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    return-object p1

    :catchall_0
    move-exception p1

    .line 614
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result p2

    if-nez p2, :cond_2

    .line 615
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    .line 617
    :cond_2
    throw p1

    :cond_3
    :goto_0
    return-object p0
.end method

.method public static ֫(Landroid/media/MediaMetadataRetriever;JII)Landroid/graphics/Bitmap;
    .locals 8

    .line 586
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    if-lt v0, v1, :cond_0

    const/4 v5, 0x2

    move-object v2, p0

    move-wide v3, p1

    move v6, p3

    move v7, p4

    .line 587
    invoke-virtual/range {v2 .. v7}, Landroid/media/MediaMetadataRetriever;->getScaledFrameAtTime(JIII)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 v0, 0x2

    .line 590
    invoke-virtual {p0, p1, p2, v0}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime(JI)Landroid/graphics/Bitmap;

    move-result-object p0

    .line 591
    invoke-static {p0, p3, p4}, Ll/ۙۚۜ;->֫(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ֫(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 1

    .line 0
    const-class v0, Ljava/lang/Error;

    invoke-static {p0, v0}, Ll/ۙۚۜ;->֫(Ljava/lang/Throwable;Ljava/lang/Class;)Ljava/lang/Throwable;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/Throwable;Ljava/lang/Class;)Ljava/lang/Throwable;
    .locals 1

    :goto_0
    if-eqz p0, :cond_2

    .line 709
    invoke-virtual {p1, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 710
    invoke-virtual {p1, p0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Throwable;

    return-object p0

    .line 712
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-ne v0, p0, :cond_1

    goto :goto_1

    :cond_1
    move-object p0, v0

    goto :goto_0

    :cond_2
    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private ֫(Ll/᩶ۚۜ;Ll/᩸ۚۜ;Ll/۠ۚۜ;Ll/ܰۗۜ;)Ll/֡ۚۜ;
    .locals 3

    .line 672
    iget-object v0, p0, Ll/ۙۚۜ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 673
    :try_start_0
    invoke-virtual {p2}, Ll/᩸ۚۜ;->ᩳ()I

    move-result v1

    .line 693
    iget-object v2, p0, Ll/ۙۚۜ;->ܳ:Ll/᩶ۚۜ;

    if-ne v2, p1, :cond_0

    iget-boolean v2, p1, Ll/᩶ۚۜ;->ۖ:Z

    if-nez v2, :cond_0

    iget v2, p1, Ll/᩶ۚۜ;->ᩳ:I

    if-ne v2, v1, :cond_0

    .line 674
    invoke-virtual {p3}, Ll/۠ۚۜ;->take()Landroid/graphics/Bitmap;

    move-result-object p3

    .line 675
    new-instance v1, Ll/֡ۚۜ;

    invoke-direct {v1, p3, p4}, Ll/֡ۚۜ;-><init>(Landroid/graphics/Bitmap;Ll/ܰۗۜ;)V

    .line 676
    iput-object v1, p1, Ll/᩶ۚۜ;->ۜ:Ll/֡ۚۜ;

    .line 677
    invoke-virtual {p2}, Ll/᩸ۚۜ;->᩻()I

    move-result p3

    iput p3, p1, Ll/᩶ۚۜ;->ۢ:I

    .line 678
    invoke-virtual {p2}, Ll/᩸ۚۜ;->ܳ()I

    move-result p2

    iput p2, p1, Ll/᩶ۚۜ;->᩷:I

    .line 679
    monitor-exit v0

    return-object v1

    .line 694
    :cond_0
    new-instance p1, Ljava/io/InterruptedIOException;

    const-string p2, "HLS preview read was canceled"

    invoke-direct {p1, p2}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 680
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private ֫(Ll/᩶ۚۜ;Ll/᩸ۚۜ;Ll/۟ܰۜ;Ll/۠ۚۜ;)Ll/֨ۚۜ;
    .locals 9

    .line 388
    new-instance v6, Ll/֨ۚۜ;

    invoke-direct {v6}, Ll/֨ۚۜ;-><init>()V

    const/4 v0, 0x0

    .line 392
    :try_start_0
    invoke-virtual {p2}, Ll/᩸ۚۜ;->ᩳ()I

    move-result v1

    invoke-direct {p0, p1, p3, v1}, Ll/ۙۚۜ;->֫(Ll/᩶ۚۜ;Ll/۟ܰۜ;I)V

    .line 393
    move-object v1, p3

    check-cast v1, Ll/ܿ᩸ۜ;

    invoke-virtual {v1}, Ll/ܿ᩸ۜ;->length()J

    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-gtz v5, :cond_0

    .line 423
    invoke-static {v0, v0, p3, v6}, Ll/ۙۚۜ;->֫(Ll/ۚۚۜ;Ll/ۛ᩶ۜ;Ll/۟ܰۜ;Ll/֨ۚۜ;)V

    .line 424
    invoke-direct {p0, p1}, Ll/ۙۚۜ;->֫(Ll/᩶ۚۜ;)V

    return-object v6

    .line 396
    :cond_0
    :try_start_1
    new-instance v7, Ll/ۛ᩶ۜ;

    invoke-direct {v7, p3}, Ll/ۛ᩶ۜ;-><init>(Ll/۟ܰۜ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    .line 398
    :try_start_2
    iget-object v1, p0, Ll/ۙۚۜ;->ۜ:Ll/᩶۫᩷;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ll/ۚۚۜ;

    invoke-direct {v1}, Ll/ۚۚۜ;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v8, v1

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 400
    :try_start_3
    iput-object v1, v6, Ll/֨ۚۜ;->ܽ:Ljava/lang/Throwable;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    move-object v8, v0

    .line 402
    :goto_0
    :try_start_4
    iget-object v1, v6, Ll/֨ۚۜ;->ܽ:Ljava/lang/Throwable;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    if-nez v1, :cond_4

    .line 405
    :try_start_5
    invoke-virtual {v8, v7}, Ll/ۚۚۜ;->֫(Landroid/media/MediaDataSource;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    .line 643
    :goto_1
    :try_start_6
    invoke-virtual {v7}, Ll/ۛ᩶ۜ;->֫()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 647
    :try_start_7
    const-class v1, Ljava/io/IOException;

    invoke-static {v0, v1}, Ll/ۙۚۜ;->֫(Ljava/lang/Throwable;Ljava/lang/Class;)Ljava/lang/Throwable;

    move-result-object v1

    check-cast v1, Ljava/io/IOException;

    if-eqz v1, :cond_1

    move-object v0, v1

    goto :goto_2

    :catch_0
    move-exception v0

    :cond_1
    :goto_2
    if-eqz v0, :cond_2

    .line 411
    invoke-virtual {v6, v0}, Ll/֨ۚۜ;->֫(Ljava/lang/Throwable;)V

    goto :goto_4

    .line 414
    :cond_2
    invoke-virtual {p2}, Ll/᩸ۚۜ;->ᩳ()I

    move-result v1

    .line 686
    iget-object v0, p0, Ll/ۙۚۜ;->ۧ:Ljava/lang/Object;

    monitor-enter v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 693
    :try_start_8
    iget-object v2, p0, Ll/ۙۚۜ;->ܳ:Ll/᩶ۚۜ;

    if-ne v2, p1, :cond_3

    iget-boolean v2, p1, Ll/᩶ۚۜ;->ۖ:Z

    if-nez v2, :cond_3

    iget v2, p1, Ll/᩶ۚۜ;->ᩳ:I

    if-ne v2, v1, :cond_3

    .line 688
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 417
    :try_start_9
    invoke-virtual {p2}, Ll/᩸ۚۜ;->᩻()I

    move-result v4

    invoke-virtual {p2}, Ll/᩸ۚۜ;->ܳ()I

    move-result v5

    move-object v0, v8

    move-object v1, v7

    move-object v2, p4

    move-object v3, v6

    .line 415
    invoke-static/range {v0 .. v5}, Ll/ۙۚۜ;->֫(Ll/ۚۚۜ;Ll/ۛ᩶ۜ;Ll/۠ۚۜ;Ll/֨ۚۜ;II)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_4

    .line 694
    :cond_3
    :try_start_a
    new-instance p2, Ljava/io/InterruptedIOException;

    const-string p4, "HLS preview read was canceled"

    invoke-direct {p2, p4}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p2

    :catchall_2
    move-exception p2

    .line 688
    monitor-exit v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    :try_start_b
    throw p2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    :catchall_3
    move-exception p2

    move-object v0, v8

    goto :goto_3

    :catchall_4
    move-exception p2

    goto :goto_3

    :catchall_5
    move-exception p2

    move-object v7, v0

    .line 421
    :goto_3
    :try_start_c
    invoke-virtual {v6, p2}, Ll/֨ۚۜ;->֫(Ljava/lang/Throwable;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    move-object v8, v0

    .line 423
    :cond_4
    :goto_4
    invoke-static {v8, v7, p3, v6}, Ll/ۙۚۜ;->֫(Ll/ۚۚۜ;Ll/ۛ᩶ۜ;Ll/۟ܰۜ;Ll/֨ۚۜ;)V

    .line 424
    invoke-direct {p0, p1}, Ll/ۙۚۜ;->֫(Ll/᩶ۚۜ;)V

    return-object v6

    :catchall_6
    move-exception p2

    .line 423
    invoke-static {v0, v7, p3, v6}, Ll/ۙۚۜ;->֫(Ll/ۚۚۜ;Ll/ۛ᩶ۜ;Ll/۟ܰۜ;Ll/֨ۚۜ;)V

    .line 424
    invoke-direct {p0, p1}, Ll/ۙۚۜ;->֫(Ll/᩶ۚۜ;)V

    .line 425
    throw p2
.end method

.method public static synthetic ֫(Ll/ۙۚۜ;Ll/᩶ۚۜ;)V
    .locals 0

    .line 183
    invoke-direct {p0, p1}, Ll/ۙۚۜ;->ᩳ(Ll/᩶ۚۜ;)V

    return-void
.end method

.method public static ֫(Ll/ۙۚۜ;Ll/᩶ۚۜ;Ll/᩸ۚۜ;)V
    .locals 7

    .line 198
    invoke-static {}, Ll/֡ۚۜ;->ᩳ()Ll/֡ۚۜ;

    move-result-object v0

    .line 201
    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    if-lt v1, v2, :cond_0

    .line 202
    invoke-direct {p0, p1, p2}, Ll/ۙۚۜ;->ۧ(Ll/᩶ۚۜ;Ll/᩸ۚۜ;)Ll/֡ۚۜ;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 205
    :catchall_0
    :try_start_1
    invoke-static {p1}, Ll/ۙۚۜ;->ۧ(Ll/᩶ۚۜ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 207
    :cond_0
    :goto_0
    invoke-direct {p0, p1, p2}, Ll/ۙۚۜ;->֫(Ll/᩶ۚۜ;Ll/᩸ۚۜ;)V

    .line 209
    invoke-virtual {v0}, Ll/֡ۚۜ;->ܽ()Landroid/graphics/Bitmap;

    move-result-object v5

    .line 210
    invoke-virtual {v0}, Ll/֡ۚۜ;->֫()Ll/ܰۗۜ;

    move-result-object v6

    .line 211
    new-instance v0, Ll/᩵ۚۜ;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, Ll/᩵ۚۜ;-><init>(Ll/ۙۚۜ;Ll/᩶ۚۜ;Ll/᩸ۚۜ;Landroid/graphics/Bitmap;Ll/ܰۗۜ;)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    .line 223
    invoke-direct {p0, p1}, Ll/ۙۚۜ;->ܽ(Ll/᩶ۚۜ;)V

    return-void

    :catchall_1
    move-exception v0

    .line 207
    invoke-direct {p0, p1, p2}, Ll/ۙۚۜ;->֫(Ll/᩶ۚۜ;Ll/᩸ۚۜ;)V

    .line 208
    throw v0
.end method

.method public static synthetic ֫(Ll/ۙۚۜ;Ll/᩶ۚۜ;Ll/᩸ۚۜ;Landroid/graphics/Bitmap;Ll/ܰۗۜ;)V
    .locals 2

    .line 212
    iget-object v0, p0, Ll/ۙۚۜ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 213
    :try_start_0
    iget-object p0, p0, Ll/ۙۚۜ;->ܳ:Ll/᩶ۚۜ;

    if-ne p0, p1, :cond_2

    iget p0, p1, Ll/᩶ۚۜ;->ᩳ:I

    invoke-virtual {p2}, Ll/᩸ۚۜ;->ᩳ()I

    move-result v1

    if-ne p0, v1, :cond_2

    iget-boolean p0, p1, Ll/᩶ۚۜ;->ۖ:Z

    if-eqz p0, :cond_0

    goto :goto_0

    .line 217
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 218
    invoke-virtual {p2}, Ll/᩸ۚۜ;->֫()Ll/᩹ۗۜ;

    move-result-object p0

    iget v0, p1, Ll/᩶ۚۜ;->᩻:I

    invoke-interface {p0, v0, p3}, Ll/᩹ۗۜ;->֫(ILandroid/graphics/Bitmap;)V

    if-eqz p4, :cond_1

    .line 220
    invoke-virtual {p2}, Ll/᩸ۚۜ;->֫()Ll/᩹ۗۜ;

    move-result-object p0

    iget p1, p1, Ll/᩶ۚۜ;->᩻:I

    invoke-interface {p0, p1, p4}, Ll/᩹ۗۜ;->֫(ILl/ܰۗۜ;)V

    :cond_1
    return-void

    .line 215
    :cond_2
    :goto_0
    :try_start_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    .line 217
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ֫(Ll/ۚۚۜ;Ll/ۛ᩶ۜ;Ll/۟ܰۜ;Ll/֨ۚۜ;)V
    .locals 0

    .line 481
    iget-object p3, p3, Ll/֨ۚۜ;->ۧ:Ljava/util/ArrayList;

    if-eqz p0, :cond_0

    .line 483
    :try_start_0
    invoke-virtual {p0}, Ll/ۚۚۜ;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 485
    invoke-virtual {p3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    :goto_0
    if-eqz p1, :cond_1

    .line 490
    :try_start_1
    invoke-virtual {p1}, Ll/ۛ᩶ۜ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p0

    .line 492
    invoke-virtual {p3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 496
    :cond_1
    :try_start_2
    check-cast p2, Ll/ܿ᩸ۜ;

    invoke-virtual {p2}, Ll/ܿ᩸ۜ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception p0

    .line 498
    invoke-virtual {p3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    return-void
.end method

.method public static ֫(Ll/ۚۚۜ;Ll/ۛ᩶ۜ;Ll/۠ۚۜ;Ll/֨ۚۜ;II)V
    .locals 2

    .line 438
    const-class v0, Ljava/io/IOException;

    const/4 v1, 0x0

    .line 441
    :try_start_0
    invoke-virtual {p0, p4, p5}, Ll/ۚۚۜ;->֫(II)Landroid/graphics/Bitmap;

    move-result-object p4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object p5, v1

    goto :goto_0

    :catchall_0
    move-exception p4

    move-object p5, p4

    move-object p4, v1

    :goto_0
    if-eqz p4, :cond_0

    .line 446
    invoke-virtual {p2, p4}, Ll/۠ۚۜ;->֫(Landroid/graphics/Bitmap;)V

    .line 643
    :cond_0
    :try_start_1
    invoke-virtual {p1}, Ll/ۛ᩶ۜ;->֫()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 647
    invoke-static {p5, v0}, Ll/ۙۚۜ;->֫(Ljava/lang/Throwable;Ljava/lang/Class;)Ljava/lang/Throwable;

    move-result-object p4

    check-cast p4, Ljava/io/IOException;

    if-eqz p4, :cond_1

    move-object p5, p4

    goto :goto_1

    :catch_0
    move-exception p5

    :cond_1
    :goto_1
    if-eqz p5, :cond_2

    .line 450
    invoke-virtual {p3, p5}, Ll/֨ۚۜ;->֫(Ljava/lang/Throwable;)V

    return-void

    .line 453
    :cond_2
    invoke-virtual {p2}, Ll/۠ۚۜ;->֫()Z

    move-result p2

    if-nez p2, :cond_3

    goto :goto_6

    :cond_3
    const/16 p2, 0x12

    .line 655
    :try_start_2
    invoke-virtual {p0, p2}, Ll/ۚۚۜ;->֫(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p2

    const/16 p4, 0x13

    .line 657
    invoke-virtual {p0, p4}, Ll/ۚۚۜ;->֫(I)Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p4

    const/16 p5, 0x18

    .line 659
    invoke-virtual {p0, p5}, Ll/ۚۚۜ;->֫(I)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_4

    const/4 p0, 0x0

    goto :goto_2

    .line 661
    :cond_4
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    :goto_2
    const/high16 p5, 0x3f800000    # 1.0f

    .line 79
    invoke-static {p2, p4, p0, p5}, Ll/֫۬ۜ;->֫(IIIF)Ll/ܰۗۜ;

    move-result-object p0

    .line 459
    iput-object p0, p3, Ll/֨ۚۜ;->֫:Ll/ܰۗۜ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object p0, v1

    goto :goto_3

    :catchall_1
    move-exception p0

    .line 643
    :goto_3
    :try_start_3
    invoke-virtual {p1}, Ll/ۛ᩶ۜ;->֫()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 647
    invoke-static {p0, v0}, Ll/ۙۚۜ;->֫(Ljava/lang/Throwable;Ljava/lang/Class;)Ljava/lang/Throwable;

    move-result-object p1

    check-cast p1, Ljava/io/IOException;

    if-eqz p1, :cond_5

    move-object p0, p1

    goto :goto_4

    :catch_1
    move-exception p0

    :cond_5
    :goto_4
    if-nez p0, :cond_6

    goto :goto_6

    .line 700
    :cond_6
    const-class p1, Ljava/io/InterruptedIOException;

    invoke-static {p0, p1}, Ll/ۙۚۜ;->֫(Ljava/lang/Throwable;Ljava/lang/Class;)Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_9

    const-class p1, Ll/ۘ֡ۜ;

    .line 701
    invoke-static {p0, p1}, Ll/ۙۚۜ;->֫(Ljava/lang/Throwable;Ljava/lang/Class;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_7

    goto :goto_5

    .line 467
    :cond_7
    const-class p1, Ljava/lang/Error;

    invoke-static {p0, p1}, Ll/ۙۚۜ;->֫(Ljava/lang/Throwable;Ljava/lang/Class;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_8

    goto :goto_5

    .line 471
    :cond_8
    iput-object v1, p3, Ll/֨ۚۜ;->֫:Ll/ܰۗۜ;

    goto :goto_6

    .line 468
    :cond_9
    :goto_5
    invoke-virtual {p3, p0}, Ll/֨ۚۜ;->֫(Ljava/lang/Throwable;)V

    :goto_6
    return-void
.end method

.method private ֫(Ll/᩶ۚۜ;)V
    .locals 2

    .line 534
    iget-object v0, p0, Ll/ۙۚۜ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    .line 535
    :try_start_0
    iput-object v1, p1, Ll/᩶ۚۜ;->֫:Ll/۟ܰۜ;

    .line 536
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private ֫(Ll/᩶ۚۜ;Ll/۟ܰۜ;I)V
    .locals 2

    .line 525
    iget-object v0, p0, Ll/ۙۚۜ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 526
    :try_start_0
    iget-object v1, p0, Ll/ۙۚۜ;->ܳ:Ll/᩶ۚۜ;

    if-ne v1, p1, :cond_0

    iget-boolean v1, p1, Ll/᩶ۚۜ;->ۖ:Z

    if-nez v1, :cond_0

    iget v1, p1, Ll/᩶ۚۜ;->ᩳ:I

    if-ne v1, p3, :cond_0

    .line 529
    iput-object p2, p1, Ll/᩶ۚۜ;->֫:Ll/۟ܰۜ;

    .line 530
    monitor-exit v0

    return-void

    .line 527
    :cond_0
    new-instance p1, Ljava/io/InterruptedIOException;

    const-string p2, "HLS preview read was canceled"

    invoke-direct {p1, p2}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 530
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private ֫(Ll/᩶ۚۜ;Ll/᩸ۚۜ;)V
    .locals 2

    .line 229
    iget-object v0, p0, Ll/ۙۚۜ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 230
    :try_start_0
    iget v1, p1, Ll/᩶ۚۜ;->ᩳ:I

    invoke-virtual {p2}, Ll/᩸ۚۜ;->ᩳ()I

    move-result p2

    if-ne v1, p2, :cond_0

    .line 231
    monitor-exit v0

    return-void

    .line 233
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 234
    invoke-static {p1}, Ll/ۙۚۜ;->ۧ(Ll/᩶ۚۜ;)V

    return-void

    :catchall_0
    move-exception p1

    .line 233
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private ۧ(Ll/᩶ۚۜ;Ll/᩸ۚۜ;)Ll/֡ۚۜ;
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    .line 241
    invoke-virtual/range {p2 .. p2}, Ll/᩸ۚۜ;->ܽ()Ll/ܶۚۜ;

    move-result-object v3

    .line 242
    check-cast v3, Ll/ܺ֨ۜ;

    invoke-virtual {v3}, Ll/ܺ֨ۜ;->֫()Ll/᩷֨ۜ;

    move-result-object v4

    sget-object v5, Ll/᩷֨ۜ;->᩶:Ll/᩷֨ۜ;

    const/4 v6, 0x0

    if-ne v4, v5, :cond_4

    .line 243
    iget-object v3, v2, Ll/᩶ۚۜ;->ۜ:Ll/֡ۚۜ;

    if-eqz v3, :cond_0

    .line 244
    iget v4, v2, Ll/᩶ۚۜ;->ۢ:I

    .line 245
    invoke-virtual/range {p2 .. p2}, Ll/᩸ۚۜ;->᩻()I

    move-result v5

    if-ne v4, v5, :cond_0

    iget v4, v2, Ll/᩶ۚۜ;->᩷:I

    .line 246
    invoke-virtual/range {p2 .. p2}, Ll/᩸ۚۜ;->ܳ()I

    move-result v5

    if-ne v4, v5, :cond_0

    return-object v3

    .line 364
    :cond_0
    invoke-virtual/range {p2 .. p2}, Ll/᩸ۚۜ;->ܽ()Ll/ܶۚۜ;

    move-result-object v3

    check-cast v3, Ll/ܺ֨ۜ;

    invoke-virtual {v3}, Ll/ܺ֨ۜ;->ܿ()Ll/۟ܰۜ;

    move-result-object v3

    .line 365
    new-instance v4, Ll/۠ۚۜ;

    .line 821
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 366
    :try_start_0
    invoke-direct {v1, v2, v0, v3, v4}, Ll/ۙۚۜ;->֫(Ll/᩶ۚۜ;Ll/᩸ۚۜ;Ll/۟ܰۜ;Ll/۠ۚۜ;)Ll/֨ۚۜ;

    move-result-object v3

    .line 368
    invoke-virtual {v4}, Ll/۠ۚۜ;->֫()Z

    move-result v5

    invoke-virtual {v3, v5}, Ll/֨ۚۜ;->֫(Z)Ljava/lang/Throwable;

    move-result-object v5

    if-nez v5, :cond_3

    .line 372
    invoke-virtual/range {p2 .. p2}, Ll/᩸ۚۜ;->ᩳ()I

    move-result v5

    .line 686
    iget-object v6, v1, Ll/ۙۚۜ;->ۧ:Ljava/lang/Object;

    move-object/from16 v16, v6

    monitor-enter v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 693
    :try_start_1
    iget-object v6, v1, Ll/ۙۚۜ;->ܳ:Ll/᩶ۚۜ;

    if-ne v6, v2, :cond_2

    iget-boolean v6, v2, Ll/᩶ۚۜ;->ۖ:Z

    if-nez v6, :cond_2

    iget v6, v2, Ll/᩶ۚۜ;->ᩳ:I

    if-ne v6, v5, :cond_2

    .line 688
    monitor-exit v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 373
    :try_start_2
    invoke-virtual {v4}, Ll/۠ۚۜ;->֫()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 374
    iget-object v3, v3, Ll/֨ۚۜ;->֫:Ll/ܰۗۜ;

    invoke-direct {v1, v2, v0, v4, v3}, Ll/ۙۚۜ;->֫(Ll/᩶ۚۜ;Ll/᩸ۚۜ;Ll/۠ۚۜ;Ll/ܰۗۜ;)Ll/֡ۚۜ;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 378
    invoke-virtual {v4}, Ll/۠ۚۜ;->close()V

    return-object v0

    .line 377
    :cond_1
    :try_start_3
    invoke-static {}, Ll/֡ۚۜ;->ᩳ()Ll/֡ۚۜ;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 378
    invoke-virtual {v4}, Ll/۠ۚۜ;->close()V

    return-object v0

    .line 694
    :cond_2
    :try_start_4
    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v2, "HLS preview read was canceled"

    invoke-direct {v0, v2}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    .line 688
    monitor-exit v16
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v0

    .line 370
    :cond_3
    invoke-static {v5}, Ll/ۙۚۜ;->ܽ(Ljava/lang/Throwable;)V

    throw v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception v0

    move-object v2, v0

    .line 365
    :try_start_6
    invoke-virtual {v4}, Ll/۠ۚۜ;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception v0

    move-object v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v2

    .line 275
    :cond_4
    invoke-virtual/range {p2 .. p2}, Ll/᩸ۚۜ;->ᩳ()I

    move-result v4

    .line 304
    iget-object v5, v2, Ll/᩶ۚۜ;->ܳ:Ll/ۚ۟ۜ;

    if-eqz v5, :cond_5

    goto :goto_1

    .line 307
    :cond_5
    :try_start_7
    invoke-virtual {v3}, Ll/ܺ֨ۜ;->ᩳ()Ll/ۡۚۜ;

    move-result-object v5
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_b

    .line 308
    :try_start_8
    invoke-direct {v1, v2, v5, v4}, Ll/ۙۚۜ;->֫(Ll/᩶ۚۜ;Ll/۟ܰۜ;I)V

    .line 310
    invoke-virtual {v5}, Ll/ۡۚۜ;->֫()J

    move-result-wide v7

    .line 309
    invoke-static {v5, v7, v8}, Ll/֡۟ۜ;->֫(Ll/۟ܰۜ;J)Ll/ۚ۟ۜ;

    move-result-object v4

    iput-object v4, v2, Ll/᩶ۚۜ;->ܳ:Ll/ۚ۟ۜ;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_9

    .line 311
    :try_start_9
    invoke-virtual {v5}, Ll/ۡۚۜ;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_b

    .line 312
    invoke-direct/range {p0 .. p1}, Ll/ۙۚۜ;->֫(Ll/᩶ۚۜ;)V

    .line 276
    :goto_1
    iget-object v4, v2, Ll/᩶ۚۜ;->ܳ:Ll/ۚ۟ۜ;

    if-eqz v4, :cond_b

    .line 277
    invoke-virtual {v4}, Ll/ۚ۟ۜ;->֫()I

    move-result v5

    if-nez v5, :cond_6

    goto/16 :goto_6

    .line 280
    :cond_6
    invoke-virtual {v4}, Ll/ۚ۟ۜ;->ۧ()J

    move-result-wide v7

    invoke-virtual {v3}, Ll/ܺ֨ۜ;->ܽ()J

    move-result-wide v9

    add-long/2addr v7, v9

    .line 281
    invoke-virtual {v4, v7, v8}, Ll/ۚ۟ۜ;->֫(J)I

    move-result v4

    .line 283
    invoke-virtual/range {p2 .. p2}, Ll/᩸ۚۜ;->ᩳ()I

    move-result v5

    .line 322
    iget-object v9, v2, Ll/᩶ۚۜ;->ܳ:Ll/ۚ۟ۜ;

    invoke-static {v9}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 323
    invoke-virtual {v9, v4}, Ll/ۚ۟ۜ;->֫(I)J

    move-result-wide v18

    .line 324
    iget-object v10, v2, Ll/᩶ۚۜ;->ۘ:Ll/᩹ۚۜ;

    if-eqz v10, :cond_7

    .line 325
    iget-wide v11, v10, Ll/᩹ۚۜ;->ᩳ:J

    cmp-long v13, v11, v18

    if-nez v13, :cond_7

    goto :goto_2

    .line 328
    :cond_7
    invoke-static/range {p1 .. p1}, Ll/ۙۚۜ;->ۧ(Ll/᩶ۚۜ;)V

    .line 329
    invoke-virtual {v3}, Ll/ܺ֨ۜ;->ᩳ()Ll/ۡۚۜ;

    move-result-object v3

    .line 331
    new-instance v14, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v14}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 333
    :try_start_a
    invoke-direct {v1, v2, v3, v5}, Ll/ۙۚۜ;->֫(Ll/᩶ۚۜ;Ll/۟ܰۜ;I)V

    .line 334
    new-instance v5, Ll/ܿۚۜ;

    .line 336
    invoke-virtual {v3}, Ll/ۡۚۜ;->֫()J

    move-result-wide v12

    .line 338
    invoke-virtual {v9, v4}, Ll/ۚ۟ۜ;->ۧ(I)I

    move-result v4
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    int-to-long v9, v4

    move-wide/from16 v16, v9

    move-object v10, v5

    move-object v11, v3

    move-object v4, v14

    move-wide/from16 v14, v18

    :try_start_b
    invoke-direct/range {v10 .. v17}, Ll/ܿۚۜ;-><init>(Ll/۟ܰۜ;JJJ)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 339
    :try_start_c
    invoke-virtual {v4, v5}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/media/MediaDataSource;)V

    .line 340
    new-instance v9, Ll/᩹ۚۜ;

    move-object v10, v9

    move-wide/from16 v11, v18

    move-object v13, v4

    move-object v14, v5

    move-object v15, v3

    invoke-direct/range {v10 .. v15}, Ll/᩹ۚۜ;-><init>(JLandroid/media/MediaMetadataRetriever;Landroid/media/MediaDataSource;Ll/۟ܰۜ;)V

    .line 341
    iput-object v9, v2, Ll/᩶ۚۜ;->ۘ:Ll/᩹ۚۜ;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 355
    invoke-direct/range {p0 .. p1}, Ll/ۙۚۜ;->֫(Ll/᩶ۚۜ;)V

    move-object v10, v9

    .line 289
    :goto_2
    invoke-virtual/range {p2 .. p2}, Ll/᩸ۚۜ;->᩻()I

    move-result v3

    .line 290
    invoke-virtual/range {p2 .. p2}, Ll/᩸ۚۜ;->ܳ()I

    move-result v4

    .line 291
    invoke-virtual/range {p2 .. p2}, Ll/᩸ۚۜ;->ᩳ()I

    move-result v0

    .line 511
    iget-object v5, v10, Ll/᩹ۚۜ;->ۧ:Ll/۟ܰۜ;

    iget-object v9, v10, Ll/᩹ۚۜ;->ܽ:Landroid/media/MediaMetadataRetriever;

    invoke-direct {v1, v2, v5, v0}, Ll/ۙۚۜ;->֫(Ll/᩶ۚۜ;Ll/۟ܰۜ;I)V

    .line 513
    :try_start_d
    new-instance v0, Ll/֡ۚۜ;

    .line 514
    invoke-static {v9, v7, v8, v3, v4}, Ll/ۙۚۜ;->֫(Landroid/media/MediaMetadataRetriever;JII)Landroid/graphics/Bitmap;

    move-result-object v3
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    const/16 v4, 0x12

    .line 625
    :try_start_e
    invoke-virtual {v9, v4}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    const/16 v5, 0x13

    .line 627
    invoke-virtual {v9, v5}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    const/16 v7, 0x18

    .line 629
    invoke-virtual {v9, v7}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_8

    const/4 v7, 0x0

    goto :goto_3

    .line 630
    :cond_8
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    :goto_3
    const/high16 v8, 0x3f800000    # 1.0f

    .line 79
    invoke-static {v4, v5, v7, v8}, Ll/֫۬ۜ;->֫(IIIF)Ll/ܰۗۜ;

    move-result-object v6
    :try_end_e
    .catch Ljava/lang/RuntimeException; {:try_start_e .. :try_end_e} :catch_0
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    .line 515
    :catch_0
    :try_start_f
    invoke-direct {v0, v3, v6}, Ll/֡ۚۜ;-><init>(Landroid/graphics/Bitmap;Ll/ܰۗۜ;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    .line 517
    invoke-direct/range {p0 .. p1}, Ll/ۙۚۜ;->֫(Ll/᩶ۚۜ;)V

    return-object v0

    :catchall_3
    move-exception v0

    invoke-direct/range {p0 .. p1}, Ll/ۙۚۜ;->֫(Ll/᩶ۚۜ;)V

    .line 518
    throw v0

    :catchall_4
    move-exception v0

    move-object v6, v5

    goto :goto_4

    :catchall_5
    move-exception v0

    goto :goto_4

    :catchall_6
    move-exception v0

    move-object v4, v14

    .line 345
    :goto_4
    :try_start_10
    invoke-virtual {v4}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    .line 348
    :catchall_7
    :try_start_11
    invoke-static {v6}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    if-nez v6, :cond_9

    .line 350
    invoke-static {v3}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 352
    :cond_9
    instance-of v3, v0, Ljava/io/IOException;

    if-eqz v3, :cond_a

    check-cast v0, Ljava/io/IOException;

    goto :goto_5

    .line 353
    :cond_a
    new-instance v3, Ljava/io/IOException;

    const-string v4, "Failed to open HLS preview fragment"

    invoke-direct {v3, v4, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v3

    :goto_5
    throw v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    :catchall_8
    move-exception v0

    .line 355
    invoke-direct/range {p0 .. p1}, Ll/ۙۚۜ;->֫(Ll/᩶ۚۜ;)V

    .line 356
    throw v0

    .line 278
    :cond_b
    :goto_6
    invoke-static {}, Ll/֡ۚۜ;->ᩳ()Ll/֡ۚۜ;

    move-result-object v0

    return-object v0

    :catchall_9
    move-exception v0

    move-object v3, v0

    .line 307
    :try_start_12
    invoke-virtual {v5}, Ll/ۡۚۜ;->close()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_a

    goto :goto_7

    :catchall_a
    move-exception v0

    move-object v4, v0

    :try_start_13
    invoke-virtual {v3, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_7
    throw v3
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_b

    :catchall_b
    move-exception v0

    .line 312
    invoke-direct/range {p0 .. p1}, Ll/ۙۚۜ;->֫(Ll/᩶ۚۜ;)V

    .line 313
    throw v0
.end method

.method private ۧ()V
    .locals 5

    .line 167
    iget-object v0, p0, Ll/ۙۚۜ;->ܽ:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩶ۚۜ;

    .line 168
    iget-object v1, p0, Ll/ۙۚۜ;->֫:Ljava/util/concurrent/Executor;

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 169
    iput-boolean v2, p0, Ll/ۙۚۜ;->᩻:Z

    .line 170
    iput-object v0, p0, Ll/ۙۚۜ;->ܿ:Ll/᩶ۚۜ;

    .line 171
    iput-object v0, p0, Ll/ۙۚۜ;->ᩳ:Ll/᩶ۚۜ;

    .line 172
    new-instance v2, Ll/ܺۚۜ;

    invoke-direct {v2, p0, v0}, Ll/ܺۚۜ;-><init>(Ll/ۙۚۜ;Ll/᩶ۚۜ;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    .line 175
    :cond_0
    iget-object v0, p0, Ll/ۙۚۜ;->ܳ:Ll/᩶ۚۜ;

    if-nez v0, :cond_1

    goto :goto_0

    .line 179
    :cond_1
    iget-boolean v3, v0, Ll/᩶ۚۜ;->ۖ:Z

    if-eqz v3, :cond_2

    .line 180
    iput-boolean v2, p0, Ll/ۙۚۜ;->᩻:Z

    .line 181
    iput-object v0, p0, Ll/ۙۚۜ;->ܿ:Ll/᩶ۚۜ;

    .line 182
    iput-object v0, p0, Ll/ۙۚۜ;->ᩳ:Ll/᩶ۚۜ;

    .line 183
    new-instance v2, Ll/ۖۚۜ;

    invoke-direct {v2, p0, v0}, Ll/ۖۚۜ;-><init>(Ll/ۙۚۜ;Ll/᩶ۚۜ;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    .line 186
    :cond_2
    iget-object v3, v0, Ll/᩶ۚۜ;->ۡ:Ll/᩸ۚۜ;

    if-nez v3, :cond_3

    :goto_0
    return-void

    :cond_3
    const/4 v4, 0x0

    .line 190
    iput-object v4, v0, Ll/᩶ۚۜ;->ۡ:Ll/᩸ۚۜ;

    .line 191
    iput-boolean v2, p0, Ll/ۙۚۜ;->᩻:Z

    .line 192
    iput-object v0, p0, Ll/ۙۚۜ;->ܿ:Ll/᩶ۚۜ;

    .line 193
    iput-object v4, p0, Ll/ۙۚۜ;->ᩳ:Ll/᩶ۚۜ;

    .line 194
    new-instance v2, Ll/ۘۚۜ;

    invoke-direct {v2, p0, v0, v3}, Ll/ۘۚۜ;-><init>(Ll/ۙۚۜ;Ll/᩶ۚۜ;Ll/᩸ۚۜ;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic ۧ(Ll/ۙۚۜ;Ll/᩶ۚۜ;)V
    .locals 0

    .line 172
    invoke-direct {p0, p1}, Ll/ۙۚۜ;->ᩳ(Ll/᩶ۚۜ;)V

    return-void
.end method

.method public static ۧ(Ll/᩶ۚۜ;)V
    .locals 2

    .line 573
    iget-object v0, p0, Ll/᩶ۚۜ;->ۘ:Ll/᩹ۚۜ;

    const/4 v1, 0x0

    .line 574
    iput-object v1, p0, Ll/᩶ۚۜ;->ۘ:Ll/᩹ۚۜ;

    if-eqz v0, :cond_0

    .line 903
    :try_start_0
    iget-object p0, v0, Ll/᩹ۚۜ;->ܽ:Landroid/media/MediaMetadataRetriever;

    invoke-virtual {p0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 906
    :catchall_0
    iget-object p0, v0, Ll/᩹ۚۜ;->֫:Landroid/media/MediaDataSource;

    invoke-static {p0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    :cond_0
    return-void
.end method

.method public static ۧ(Ljava/lang/Throwable;)Z
    .locals 1

    .line 700
    const-class v0, Ljava/io/InterruptedIOException;

    invoke-static {p0, v0}, Ll/ۙۚۜ;->֫(Ljava/lang/Throwable;Ljava/lang/Class;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_1

    const-class v0, Ll/ۘ֡ۜ;

    .line 701
    invoke-static {p0, v0}, Ll/ۙۚۜ;->֫(Ljava/lang/Throwable;Ljava/lang/Class;)Ljava/lang/Throwable;

    move-result-object p0

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

.method public static ܽ(Ljava/lang/Throwable;)V
    .locals 2

    .line 723
    const-class v0, Ljava/lang/Error;

    invoke-static {p0, v0}, Ll/ۙۚۜ;->֫(Ljava/lang/Throwable;Ljava/lang/Class;)Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/lang/Error;

    if-nez v0, :cond_2

    .line 727
    const-class v0, Ljava/io/IOException;

    invoke-static {p0, v0}, Ll/ۙۚۜ;->֫(Ljava/lang/Throwable;Ljava/lang/Class;)Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/io/IOException;

    if-nez v0, :cond_1

    .line 731
    instance-of v0, p0, Ljava/lang/RuntimeException;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/lang/RuntimeException;

    .line 732
    throw p0

    .line 734
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Failed to load HLS MPEG-TS preview frame"

    invoke-direct {v0, v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 729
    :cond_1
    throw v0

    .line 725
    :cond_2
    throw v0
.end method

.method private ܽ(Ll/᩶ۚۜ;)V
    .locals 3

    .line 560
    iget-object v0, p0, Ll/ۙۚۜ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 561
    :try_start_0
    iget-object v1, p0, Ll/ۙۚۜ;->ܿ:Ll/᩶ۚۜ;

    const/4 v2, 0x0

    if-ne v1, p1, :cond_0

    .line 562
    iput-object v2, p0, Ll/ۙۚۜ;->ܿ:Ll/᩶ۚۜ;

    .line 564
    :cond_0
    iget-object v1, p0, Ll/ۙۚۜ;->ᩳ:Ll/᩶ۚۜ;

    if-ne v1, p1, :cond_1

    .line 565
    iput-object v2, p0, Ll/ۙۚۜ;->ᩳ:Ll/᩶ۚۜ;

    :cond_1
    const/4 p1, 0x0

    .line 567
    iput-boolean p1, p0, Ll/ۙۚۜ;->᩻:Z

    .line 568
    invoke-direct {p0}, Ll/ۙۚۜ;->ۧ()V

    .line 569
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private ᩳ(Ll/᩶ۚۜ;)V
    .locals 3

    .line 540
    invoke-static {p1}, Ll/ۙۚۜ;->ۧ(Ll/᩶ۚۜ;)V

    .line 542
    iget-object v0, p0, Ll/ۙۚۜ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 543
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p1, Ll/᩶ۚۜ;->ܺ:Ljava/util/ArrayDeque;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 544
    iget-object v2, p1, Ll/᩶ۚۜ;->ܺ:Ljava/util/ArrayDeque;

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->clear()V

    .line 545
    iget-object v2, p0, Ll/ۙۚۜ;->ܳ:Ll/᩶ۚۜ;

    if-ne v2, p1, :cond_0

    const/4 v2, 0x0

    .line 546
    iput-object v2, p0, Ll/ۙۚۜ;->ܳ:Ll/᩶ۚۜ;

    .line 548
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 549
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    .line 551
    :try_start_1
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    nop

    goto :goto_0

    .line 556
    :cond_1
    invoke-direct {p0, p1}, Ll/ۙۚۜ;->ܽ(Ll/᩶ۚۜ;)V

    return-void

    :catchall_0
    move-exception p1

    .line 548
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 126
    iget-object v0, p0, Ll/ۙۚۜ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 127
    :try_start_0
    iget-object v1, p0, Ll/ۙۚۜ;->ܳ:Ll/᩶ۚۜ;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 128
    iput-object v2, v1, Ll/᩶ۚۜ;->ۡ:Ll/᩸ۚۜ;

    .line 129
    iget v3, v1, Ll/᩶ۚۜ;->ᩳ:I

    add-int/lit8 v3, v3, 0x1

    iput v3, v1, Ll/᩶ۚۜ;->ᩳ:I

    .line 130
    iget-object v3, v1, Ll/᩶ۚۜ;->֫:Ll/۟ܰۜ;

    .line 131
    iput-object v2, v1, Ll/᩶ۚۜ;->֫:Ll/۟ܰۜ;

    move-object v2, v3

    .line 133
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_1

    .line 162
    iget-object v0, p0, Ll/ۙۚۜ;->֫:Ljava/util/concurrent/Executor;

    new-instance v1, Ll/ᩴۚۜ;

    invoke-direct {v1, v2}, Ll/ᩴۚۜ;-><init>(Ll/۟ܰۜ;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    .line 133
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ֫(II)V
    .locals 9

    .line 107
    iget-object v0, p0, Ll/ۙۚۜ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 108
    :try_start_0
    iget-object v1, p0, Ll/ۙۚۜ;->ܳ:Ll/᩶ۚۜ;

    if-nez v1, :cond_0

    .line 110
    monitor-exit v0

    return-void

    .line 112
    :cond_0
    new-instance v8, Ll/᩸ۚۜ;

    iget-object v3, v1, Ll/᩶ۚۜ;->ܽ:Ll/ܶۚۜ;

    iget v4, v1, Ll/᩶ۚۜ;->ᩳ:I

    iget-object v5, v1, Ll/᩶ۚۜ;->ۧ:Ll/ܽۤۜ;

    const/4 v2, 0x1

    .line 116
    invoke-static {v2, p1}, Ljava/lang/Math;->max(II)I

    move-result v6

    .line 117
    invoke-static {v2, p2}, Ljava/lang/Math;->max(II)I

    move-result v7

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Ll/᩸ۚۜ;-><init>(Ll/ܶۚۜ;ILl/ܽۤۜ;II)V

    iput-object v8, v1, Ll/᩶ۚۜ;->ۡ:Ll/᩸ۚۜ;

    .line 118
    iget-boolean p1, p0, Ll/ۙۚۜ;->᩻:Z

    if-nez p1, :cond_1

    .line 119
    invoke-direct {p0}, Ll/ۙۚۜ;->ۧ()V

    .line 121
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫(Ljava/lang/Runnable;)V
    .locals 4

    .line 140
    iget-object v0, p0, Ll/ۙۚۜ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 141
    :try_start_0
    iget-object v1, p0, Ll/ۙۚۜ;->ܳ:Ll/᩶ۚۜ;

    if-nez v1, :cond_0

    .line 143
    iget-object v1, p0, Ll/ۙۚۜ;->֫:Ljava/util/concurrent/Executor;

    invoke-interface {v1, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 144
    monitor-exit v0

    return-void

    :cond_0
    const/4 v2, 0x1

    .line 146
    iput-boolean v2, v1, Ll/᩶ۚۜ;->ۖ:Z

    .line 147
    iget-object v3, v1, Ll/᩶ۚۜ;->ܺ:Ljava/util/ArrayDeque;

    invoke-virtual {v3, p1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 148
    iput-object p1, v1, Ll/᩶ۚۜ;->ۡ:Ll/᩸ۚۜ;

    .line 149
    iget v3, v1, Ll/᩶ۚۜ;->ᩳ:I

    add-int/2addr v3, v2

    iput v3, v1, Ll/᩶ۚۜ;->ᩳ:I

    .line 150
    iget-object v2, v1, Ll/᩶ۚۜ;->֫:Ll/۟ܰۜ;

    .line 151
    iput-object p1, v1, Ll/᩶ۚۜ;->֫:Ll/۟ܰۜ;

    .line 152
    iget-boolean p1, p0, Ll/ۙۚۜ;->᩻:Z

    if-nez p1, :cond_1

    .line 153
    invoke-direct {p0}, Ll/ۙۚۜ;->ۧ()V

    .line 155
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_2

    .line 162
    iget-object p1, p0, Ll/ۙۚۜ;->֫:Ljava/util/concurrent/Executor;

    new-instance v0, Ll/ᩴۚۜ;

    invoke-direct {v0, v2}, Ll/ᩴۚۜ;-><init>(Ll/۟ܰۜ;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_2
    return-void

    :catchall_0
    move-exception p1

    .line 155
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/ܺ֨ۜ;ILl/ܽۤۜ;)V
    .locals 5

    .line 75
    iget-object v0, p0, Ll/ۙۚۜ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 76
    :try_start_0
    iget-object v1, p0, Ll/ۙۚۜ;->ܳ:Ll/᩶ۚۜ;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 77
    iget v3, v1, Ll/᩶ۚۜ;->᩻:I

    if-ne v3, p2, :cond_1

    iget-object v3, v1, Ll/᩶ۚۜ;->ܿ:Ljava/lang/String;

    .line 78
    invoke-virtual {p1}, Ll/ܺ֨ۜ;->ۧ()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    .line 98
    :cond_0
    iput-object p1, v1, Ll/᩶ۚۜ;->ܽ:Ll/ܶۚۜ;

    .line 99
    iput-object p3, v1, Ll/᩶ۚۜ;->ۧ:Ll/ܽۤۜ;

    goto :goto_3

    :cond_1
    :goto_0
    if-eqz v1, :cond_6

    const/4 v3, 0x1

    .line 80
    iput-boolean v3, v1, Ll/᩶ۚۜ;->ۖ:Z

    .line 81
    iget v4, v1, Ll/᩶ۚۜ;->ᩳ:I

    add-int/2addr v4, v3

    iput v4, v1, Ll/᩶ۚۜ;->ᩳ:I

    .line 82
    iget-object v4, v1, Ll/᩶ۚۜ;->֫:Ll/۟ܰۜ;

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    .line 84
    :goto_1
    iput-object v2, v1, Ll/᩶ۚۜ;->֫:Ll/۟ܰۜ;

    .line 86
    iget-object v2, p0, Ll/ۙۚۜ;->ᩳ:Ll/᩶ۚۜ;

    if-ne v1, v2, :cond_3

    goto :goto_2

    .line 87
    :cond_3
    iget-object v2, p0, Ll/ۙۚۜ;->ܿ:Ll/᩶ۚۜ;

    if-eq v1, v2, :cond_4

    iget-object v2, v1, Ll/᩶ۚۜ;->ۘ:Ll/᩹ۚۜ;

    if-nez v2, :cond_4

    if-nez v3, :cond_4

    iget-object v2, v1, Ll/᩶ۚۜ;->ܺ:Ljava/util/ArrayDeque;

    .line 89
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_5

    .line 90
    :cond_4
    iget-object v2, p0, Ll/ۙۚۜ;->ܽ:Ljava/util/ArrayDeque;

    invoke-virtual {v2, v1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    :cond_5
    :goto_2
    move-object v2, v4

    .line 93
    :cond_6
    new-instance v1, Ll/᩶ۚۜ;

    invoke-direct {v1, p1, p2, p3}, Ll/᩶ۚۜ;-><init>(Ll/ܶۚۜ;ILl/ܽۤۜ;)V

    iput-object v1, p0, Ll/ۙۚۜ;->ܳ:Ll/᩶ۚۜ;

    .line 94
    iget-boolean p1, p0, Ll/ۙۚۜ;->᩻:Z

    if-nez p1, :cond_7

    .line 95
    invoke-direct {p0}, Ll/ۙۚۜ;->ۧ()V

    .line 101
    :cond_7
    :goto_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_8

    .line 162
    iget-object p1, p0, Ll/ۙۚۜ;->֫:Ljava/util/concurrent/Executor;

    new-instance p2, Ll/ᩴۚۜ;

    invoke-direct {p2, v2}, Ll/ᩴۚۜ;-><init>(Ll/۟ܰۜ;)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_8
    return-void

    :catchall_0
    move-exception p1

    .line 101
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
