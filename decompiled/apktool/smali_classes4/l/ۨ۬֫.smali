.class public final Ll/ۨ۬֫;
.super Ljava/lang/Object;
.source "48U6"

# interfaces
.implements Ll/֨۬֫;


# instance fields
.field public ֡:Landroid/media/metrics/PlaybackMetrics$Builder;

.field public ֨:Ll/ܺ᩵֫;

.field public ֫:Ljava/lang/String;

.field public ۖ:I

.field public final ۗ:Ll/۬۬֫;

.field public ۘ:Z

.field public ۙ:Z

.field public ۚ:Ll/ۛ۬֫;

.field public ۜ:I

.field public ۠:Ll/ۛ۬֫;

.field public ۡ:Ll/۠ᩴ֫;

.field public ۢ:Ll/۠ᩴ֫;

.field public ۧ:I

.field public final ۫:Ll/᩶᩵֫;

.field public final ۬:J

.field public final ܳ:Landroid/content/Context;

.field public ܶ:Ll/ۛ۬֫;

.field public ܺ:I

.field public final ܽ:Ljava/util/concurrent/Executor;

.field public final ܿ:Ljava/util/HashMap;

.field public final ᩳ:Ljava/util/HashMap;

.field public ᩴ:I

.field public ᩵:Z

.field public ᩶:I

.field public ᩷:I

.field public final ᩸:Ll/᩹᩵֫;

.field public final ᩹:Landroid/media/metrics/PlaybackSession;

.field public ᩻:Ll/۠ᩴ֫;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/media/metrics/PlaybackSession;)V
    .locals 0

    .line 148
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 149
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    .line 150
    iput-object p1, p0, Ll/ۨ۬֫;->ܳ:Landroid/content/Context;

    .line 151
    iput-object p2, p0, Ll/ۨ۬֫;->᩹:Landroid/media/metrics/PlaybackSession;

    .line 152
    invoke-static {}, Ll/ۧ۠᩵;->֫()Ljava/util/concurrent/Executor;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ۬֫;->ܽ:Ljava/util/concurrent/Executor;

    .line 153
    new-instance p1, Ll/᩶᩵֫;

    invoke-direct {p1}, Ll/᩶᩵֫;-><init>()V

    iput-object p1, p0, Ll/ۨ۬֫;->۫:Ll/᩶᩵֫;

    .line 154
    new-instance p1, Ll/᩹᩵֫;

    invoke-direct {p1}, Ll/᩹᩵֫;-><init>()V

    iput-object p1, p0, Ll/ۨ۬֫;->᩸:Ll/᩹᩵֫;

    .line 155
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/ۨ۬֫;->ᩳ:Ljava/util/HashMap;

    .line 156
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/ۨ۬֫;->ܿ:Ljava/util/HashMap;

    .line 157
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    iput-wide p1, p0, Ll/ۨ۬֫;->۬:J

    const/4 p1, 0x0

    .line 158
    iput p1, p0, Ll/ۨ۬֫;->᩷:I

    .line 159
    iput p1, p0, Ll/ۨ۬֫;->ۜ:I

    .line 160
    new-instance p1, Ll/۬۬֫;

    invoke-direct {p1}, Ll/۬۬֫;-><init>()V

    iput-object p1, p0, Ll/ۨ۬֫;->ۗ:Ll/۬۬֫;

    .line 161
    invoke-virtual {p1, p0}, Ll/۬۬֫;->֫(Ll/ۨ۬֫;)V

    return-void
.end method

.method public static ֫(Landroid/content/Context;)Ll/ۨ۬֫;
    .locals 2

    const-string v0, "media_metrics"

    .line 107
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/metrics/MediaMetricsManager;

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 110
    :cond_0
    new-instance v1, Ll/ۨ۬֫;

    invoke-virtual {v0}, Landroid/media/metrics/MediaMetricsManager;->createPlaybackSession()Landroid/media/metrics/PlaybackSession;

    move-result-object v0

    invoke-direct {v1, p0, v0}, Ll/ۨ۬֫;-><init>(Landroid/content/Context;Landroid/media/metrics/PlaybackSession;)V

    return-object v1
.end method

.method private ֫(IJLl/۠ᩴ֫;I)V
    .locals 3

    .line 537
    new-instance v0, Landroid/media/metrics/TrackChangeEvent$Builder;

    invoke-direct {v0, p1}, Landroid/media/metrics/TrackChangeEvent$Builder;-><init>(I)V

    iget-wide v1, p0, Ll/ۨ۬֫;->۬:J

    sub-long/2addr p2, v1

    .line 538
    invoke-virtual {v0, p2, p3}, Landroid/media/metrics/TrackChangeEvent$Builder;->setTimeSinceCreatedMillis(J)Landroid/media/metrics/TrackChangeEvent$Builder;

    move-result-object p1

    const/4 p2, 0x0

    const/4 p3, 0x1

    if-eqz p4, :cond_d

    .line 540
    invoke-virtual {p1, p3}, Landroid/media/metrics/TrackChangeEvent$Builder;->setTrackState(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    const/4 v0, 0x2

    if-eq p5, p3, :cond_1

    const/4 v1, 0x3

    if-eq p5, v0, :cond_2

    if-eq p5, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    .line 541
    :cond_2
    :goto_0
    invoke-virtual {p1, v1}, Landroid/media/metrics/TrackChangeEvent$Builder;->setTrackChangeReason(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 542
    iget-object p5, p4, Ll/۠ᩴ֫;->ۜ:Ljava/lang/String;

    if-eqz p5, :cond_3

    .line 544
    invoke-virtual {p1, p5}, Landroid/media/metrics/TrackChangeEvent$Builder;->setContainerMimeType(Ljava/lang/String;)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 546
    :cond_3
    iget-object p5, p4, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    if-eqz p5, :cond_4

    .line 547
    invoke-virtual {p1, p5}, Landroid/media/metrics/TrackChangeEvent$Builder;->setSampleMimeType(Ljava/lang/String;)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 549
    :cond_4
    iget-object p5, p4, Ll/۠ᩴ֫;->ܳ:Ljava/lang/String;

    if-eqz p5, :cond_5

    .line 550
    invoke-virtual {p1, p5}, Landroid/media/metrics/TrackChangeEvent$Builder;->setCodecName(Ljava/lang/String;)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 552
    :cond_5
    iget p5, p4, Ll/۠ᩴ֫;->ᩳ:I

    const/4 v1, -0x1

    if-eq p5, v1, :cond_6

    .line 553
    invoke-virtual {p1, p5}, Landroid/media/metrics/TrackChangeEvent$Builder;->setBitrate(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 555
    :cond_6
    iget p5, p4, Ll/۠ᩴ֫;->᩷֫:I

    if-eq p5, v1, :cond_7

    .line 556
    invoke-virtual {p1, p5}, Landroid/media/metrics/TrackChangeEvent$Builder;->setWidth(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 558
    :cond_7
    iget p5, p4, Ll/۠ᩴ֫;->۠:I

    if-eq p5, v1, :cond_8

    .line 559
    invoke-virtual {p1, p5}, Landroid/media/metrics/TrackChangeEvent$Builder;->setHeight(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 561
    :cond_8
    iget p5, p4, Ll/۠ᩴ֫;->ܿ:I

    if-eq p5, v1, :cond_9

    .line 562
    invoke-virtual {p1, p5}, Landroid/media/metrics/TrackChangeEvent$Builder;->setChannelCount(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 564
    :cond_9
    iget p5, p4, Ll/۠ᩴ֫;->ܽ֫:I

    if-eq p5, v1, :cond_a

    .line 565
    invoke-virtual {p1, p5}, Landroid/media/metrics/TrackChangeEvent$Builder;->setAudioSampleRate(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 567
    :cond_a
    iget-object p5, p4, Ll/۠ᩴ֫;->ۙ:Ljava/lang/String;

    if-eqz p5, :cond_c

    .line 656
    sget-object v2, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const-string v2, "-"

    .line 1090
    invoke-virtual {p5, v2, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p5

    .line 657
    aget-object p2, p5, p2

    array-length v1, p5

    if-lt v1, v0, :cond_b

    aget-object p5, p5, p3

    goto :goto_1

    :cond_b
    const/4 p5, 0x0

    :goto_1
    invoke-static {p2, p5}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p2

    .line 570
    iget-object p5, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p5, Ljava/lang/String;

    invoke-virtual {p1, p5}, Landroid/media/metrics/TrackChangeEvent$Builder;->setLanguage(Ljava/lang/String;)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 571
    iget-object p2, p2, Landroid/util/Pair;->second:Ljava/lang/Object;

    if-eqz p2, :cond_c

    .line 572
    check-cast p2, Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/media/metrics/TrackChangeEvent$Builder;->setLanguageRegion(Ljava/lang/String;)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 575
    :cond_c
    iget p2, p4, Ll/۠ᩴ֫;->֡:F

    const/high16 p4, -0x40800000    # -1.0f

    cmpl-float p4, p2, p4

    if-eqz p4, :cond_e

    .line 576
    invoke-virtual {p1, p2}, Landroid/media/metrics/TrackChangeEvent$Builder;->setVideoFrameRate(F)Landroid/media/metrics/TrackChangeEvent$Builder;

    goto :goto_2

    .line 579
    :cond_d
    invoke-virtual {p1, p2}, Landroid/media/metrics/TrackChangeEvent$Builder;->setTrackState(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 581
    :cond_e
    :goto_2
    iput-boolean p3, p0, Ll/ۨ۬֫;->ۙ:Z

    .line 582
    invoke-virtual {p1}, Landroid/media/metrics/TrackChangeEvent$Builder;->build()Landroid/media/metrics/TrackChangeEvent;

    move-result-object p1

    .line 583
    new-instance p2, Ll/ܰ۫ܿ;

    invoke-direct {p2, p3, p0, p1}, Ll/ܰ۫ܿ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Ll/ۨ۬֫;->ܽ:Ljava/util/concurrent/Executor;

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private ֫(Ll/ۙ᩵֫;Ll/ܺۧۧ;)V
    .locals 8
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "metricsBuilder"
        }
    .end annotation

    .line 589
    iget-object v0, p0, Ll/ۨ۬֫;->֡:Landroid/media/metrics/PlaybackMetrics$Builder;

    if-nez p2, :cond_0

    goto :goto_0

    .line 593
    :cond_0
    iget-object p2, p2, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    invoke-virtual {p1, p2}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;)I

    move-result p2

    const/4 v1, -0x1

    if-ne p2, v1, :cond_1

    :goto_0
    return-void

    .line 1275
    :cond_1
    iget-object v1, p0, Ll/ۨ۬֫;->᩸:Ll/᩹᩵֫;

    const/4 v2, 0x0

    invoke-virtual {p1, p2, v1, v2}, Ll/ۙ᩵֫;->֫(ILl/᩹᩵֫;Z)Ll/᩹᩵֫;

    .line 598
    iget p2, v1, Ll/᩹᩵֫;->᩻:I

    iget-object v1, p0, Ll/ۨ۬֫;->۫:Ll/᩶᩵֫;

    invoke-virtual {p1, p2, v1}, Ll/ۙ᩵֫;->֫(ILl/᩶᩵֫;)V

    .line 599
    iget-object p1, v1, Ll/᩶᩵֫;->ۡ:Ll/ۧ᩵֫;

    .line 686
    iget-object p1, p1, Ll/ۧ᩵֫;->ܽ:Ll/ۨᩴ֫;

    const/4 p2, 0x2

    const/4 v3, 0x1

    if-nez p1, :cond_2

    goto :goto_1

    .line 690
    :cond_2
    iget-object v2, p1, Ll/ۨᩴ֫;->᩻:Landroid/net/Uri;

    iget-object p1, p1, Ll/ۨᩴ֫;->ܽ:Ljava/lang/String;

    .line 691
    invoke-static {v2, p1}, Ll/ۘ֨֫;->֫(Landroid/net/Uri;Ljava/lang/String;)I

    move-result p1

    if-eqz p1, :cond_5

    if-eq p1, v3, :cond_4

    if-eq p1, p2, :cond_3

    const/4 v2, 0x1

    goto :goto_1

    :cond_3
    const/4 v2, 0x4

    goto :goto_1

    :cond_4
    const/4 v2, 0x5

    goto :goto_1

    :cond_5
    const/4 v2, 0x3

    .line 599
    :goto_1
    invoke-virtual {v0, v2}, Landroid/media/metrics/PlaybackMetrics$Builder;->setStreamType(I)Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 600
    iget-wide v4, v1, Ll/᩶᩵֫;->ۧ:J

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v4, v6

    if-eqz p1, :cond_6

    iget-boolean p1, v1, Ll/᩶᩵֫;->ܳ:Z

    if-nez p1, :cond_6

    iget-boolean p1, v1, Ll/᩶᩵֫;->ܿ:Z

    if-nez p1, :cond_6

    .line 603
    invoke-virtual {v1}, Ll/᩶᩵֫;->֫()Z

    move-result p1

    if-nez p1, :cond_6

    .line 335
    iget-wide v4, v1, Ll/᩶᩵֫;->ۧ:J

    invoke-static {v4, v5}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v4

    .line 604
    invoke-virtual {v0, v4, v5}, Landroid/media/metrics/PlaybackMetrics$Builder;->setMediaDurationMillis(J)Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 607
    :cond_6
    invoke-virtual {v1}, Ll/᩶᩵֫;->֫()Z

    move-result p1

    if-eqz p1, :cond_7

    goto :goto_2

    :cond_7
    const/4 p2, 0x1

    .line 606
    :goto_2
    invoke-virtual {v0, p2}, Landroid/media/metrics/PlaybackMetrics$Builder;->setPlaybackType(I)Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 608
    iput-boolean v3, p0, Ll/ۨ۬֫;->ۙ:Z

    return-void
.end method

.method public static synthetic ֫(Ll/ۨ۬֫;Landroid/media/metrics/NetworkEvent;)V
    .locals 0

    .line 429
    iget-object p0, p0, Ll/ۨ۬֫;->᩹:Landroid/media/metrics/PlaybackSession;

    invoke-virtual {p0, p1}, Landroid/media/metrics/PlaybackSession;->reportNetworkEvent(Landroid/media/metrics/NetworkEvent;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۨ۬֫;Landroid/media/metrics/PlaybackErrorEvent;)V
    .locals 0

    .line 372
    iget-object p0, p0, Ll/ۨ۬֫;->᩹:Landroid/media/metrics/PlaybackSession;

    invoke-virtual {p0, p1}, Landroid/media/metrics/PlaybackSession;->reportPlaybackErrorEvent(Landroid/media/metrics/PlaybackErrorEvent;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۨ۬֫;Landroid/media/metrics/PlaybackMetrics;)V
    .locals 0

    .line 627
    iget-object p0, p0, Ll/ۨ۬֫;->᩹:Landroid/media/metrics/PlaybackSession;

    invoke-virtual {p0, p1}, Landroid/media/metrics/PlaybackSession;->reportPlaybackMetrics(Landroid/media/metrics/PlaybackMetrics;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۨ۬֫;Landroid/media/metrics/PlaybackStateEvent;)V
    .locals 0

    .line 452
    iget-object p0, p0, Ll/ۨ۬֫;->᩹:Landroid/media/metrics/PlaybackSession;

    invoke-virtual {p0, p1}, Landroid/media/metrics/PlaybackSession;->reportPlaybackStateEvent(Landroid/media/metrics/PlaybackStateEvent;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۨ۬֫;Landroid/media/metrics/TrackChangeEvent;)V
    .locals 0

    .line 583
    iget-object p0, p0, Ll/ۨ۬֫;->᩹:Landroid/media/metrics/PlaybackSession;

    invoke-virtual {p0, p1}, Landroid/media/metrics/PlaybackSession;->reportTrackChangeEvent(Landroid/media/metrics/TrackChangeEvent;)V

    return-void
.end method

.method private ֫(Ll/ۛ۬֫;)Z
    .locals 1
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNullIf;
        expression = {
            "#1"
        }
        result = true
    .end annotation

    if-eqz p1, :cond_0

    .line 416
    iget-object p1, p1, Ll/ۛ۬֫;->ܽ:Ljava/lang/String;

    iget-object v0, p0, Ll/ۨ۬֫;->ۗ:Ll/۬۬֫;

    .line 417
    invoke-virtual {v0}, Ll/۬۬֫;->֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private ۧ()V
    .locals 7

    .line 612
    iget-object v0, p0, Ll/ۨ۬֫;->֡:Landroid/media/metrics/PlaybackMetrics$Builder;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-boolean v2, p0, Ll/ۨ۬֫;->ۙ:Z

    if-eqz v2, :cond_3

    .line 613
    iget v2, p0, Ll/ۨ۬֫;->ۧ:I

    invoke-virtual {v0, v2}, Landroid/media/metrics/PlaybackMetrics$Builder;->setAudioUnderrunCount(I)Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 614
    iget-object v0, p0, Ll/ۨ۬֫;->֡:Landroid/media/metrics/PlaybackMetrics$Builder;

    iget v2, p0, Ll/ۨ۬֫;->ۖ:I

    invoke-virtual {v0, v2}, Landroid/media/metrics/PlaybackMetrics$Builder;->setVideoFramesDropped(I)Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 615
    iget-object v0, p0, Ll/ۨ۬֫;->֡:Landroid/media/metrics/PlaybackMetrics$Builder;

    iget v2, p0, Ll/ۨ۬֫;->᩶:I

    invoke-virtual {v0, v2}, Landroid/media/metrics/PlaybackMetrics$Builder;->setVideoFramesPlayed(I)Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 616
    iget-object v0, p0, Ll/ۨ۬֫;->ܿ:Ljava/util/HashMap;

    iget-object v2, p0, Ll/ۨ۬֫;->֫:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    .line 617
    iget-object v2, p0, Ll/ۨ۬֫;->֡:Landroid/media/metrics/PlaybackMetrics$Builder;

    const-wide/16 v3, 0x0

    if-nez v0, :cond_0

    move-wide v5, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    :goto_0
    invoke-virtual {v2, v5, v6}, Landroid/media/metrics/PlaybackMetrics$Builder;->setNetworkTransferDurationMillis(J)Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 619
    iget-object v0, p0, Ll/ۨ۬֫;->ᩳ:Ljava/util/HashMap;

    iget-object v2, p0, Ll/ۨ۬֫;->֫:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    .line 620
    iget-object v2, p0, Ll/ۨ۬֫;->֡:Landroid/media/metrics/PlaybackMetrics$Builder;

    if-nez v0, :cond_1

    move-wide v5, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    :goto_1
    invoke-virtual {v2, v5, v6}, Landroid/media/metrics/PlaybackMetrics$Builder;->setNetworkBytesRead(J)Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 622
    iget-object v2, p0, Ll/ۨ۬֫;->֡:Landroid/media/metrics/PlaybackMetrics$Builder;

    if-eqz v0, :cond_2

    .line 623
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    cmp-long v0, v5, v3

    if-lez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    .line 622
    :goto_2
    invoke-virtual {v2, v0}, Landroid/media/metrics/PlaybackMetrics$Builder;->setStreamSource(I)Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 626
    iget-object v0, p0, Ll/ۨ۬֫;->֡:Landroid/media/metrics/PlaybackMetrics$Builder;

    invoke-virtual {v0}, Landroid/media/metrics/PlaybackMetrics$Builder;->build()Landroid/media/metrics/PlaybackMetrics;

    move-result-object v0

    .line 627
    new-instance v2, Ll/ۖ֡ܳ;

    const/4 v3, 0x1

    invoke-direct {v2, v3, p0, v0}, Ll/ۖ֡ܳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Ll/ۨ۬֫;->ܽ:Ljava/util/concurrent/Executor;

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_3
    const/4 v0, 0x0

    .line 629
    iput-object v0, p0, Ll/ۨ۬֫;->֡:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 630
    iput-object v0, p0, Ll/ۨ۬֫;->֫:Ljava/lang/String;

    .line 631
    iput v1, p0, Ll/ۨ۬֫;->ۧ:I

    .line 632
    iput v1, p0, Ll/ۨ۬֫;->ۖ:I

    .line 633
    iput v1, p0, Ll/ۨ۬֫;->᩶:I

    .line 634
    iput-object v0, p0, Ll/ۨ۬֫;->ۡ:Ll/۠ᩴ֫;

    .line 635
    iput-object v0, p0, Ll/ۨ۬֫;->᩻:Ll/۠ᩴ֫;

    .line 636
    iput-object v0, p0, Ll/ۨ۬֫;->ۢ:Ll/۠ᩴ֫;

    .line 637
    iput-boolean v1, p0, Ll/ۨ۬֫;->ۙ:Z

    return-void
.end method


# virtual methods
.method public final ֫()Landroid/media/metrics/LogSessionId;
    .locals 1

    .line 166
    iget-object v0, p0, Ll/ۨ۬֫;->᩹:Landroid/media/metrics/PlaybackSession;

    invoke-virtual {v0}, Landroid/media/metrics/PlaybackSession;->getSessionId()Landroid/media/metrics/LogSessionId;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I)V
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 215
    iput-boolean v0, p0, Ll/ۨ۬֫;->᩵:Z

    .line 217
    :cond_0
    iput p1, p0, Ll/ۨ۬֫;->ܺ:I

    return-void
.end method

.method public final ֫(Ll/֡۬֫;IJ)V
    .locals 8

    .line 230
    iget-object v0, p1, Ll/֡۬֫;->ܳ:Ll/ܺۧۧ;

    if-eqz v0, :cond_2

    .line 231
    iget-object v1, p0, Ll/ۨ۬֫;->ۗ:Ll/۬۬֫;

    iget-object p1, p1, Ll/֡۬֫;->ۜ:Ll/ۙ᩵֫;

    .line 232
    invoke-virtual {v1, p1, v0}, Ll/۬۬֫;->֫(Ll/ۙ᩵֫;Ll/ܺۧۧ;)Ljava/lang/String;

    move-result-object p1

    .line 234
    iget-object v0, p0, Ll/ۨ۬֫;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    .line 235
    iget-object v2, p0, Ll/ۨ۬֫;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    const-wide/16 v4, 0x0

    if-nez v1, :cond_0

    move-wide v6, v4

    goto :goto_0

    .line 237
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    :goto_0
    add-long/2addr v6, p3

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    .line 236
    invoke-virtual {v0, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-nez v3, :cond_1

    goto :goto_1

    .line 239
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    :goto_1
    int-to-long p2, p2

    add-long/2addr v4, p2

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    .line 238
    invoke-virtual {v2, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method public final ֫(Ll/֡۬֫;Ljava/lang/String;)V
    .locals 2

    .line 176
    iget-object v0, p1, Ll/֡۬֫;->ܳ:Ll/ܺۧۧ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ܺۧۧ;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 180
    :cond_0
    invoke-direct {p0}, Ll/ۨ۬֫;->ۧ()V

    .line 181
    iput-object p2, p0, Ll/ۨ۬֫;->֫:Ljava/lang/String;

    .line 182
    new-instance p2, Landroid/media/metrics/PlaybackMetrics$Builder;

    invoke-direct {p2}, Landroid/media/metrics/PlaybackMetrics$Builder;-><init>()V

    const-string v1, "AndroidXMedia3"

    .line 184
    invoke-virtual {p2, v1}, Landroid/media/metrics/PlaybackMetrics$Builder;->setPlayerName(Ljava/lang/String;)Landroid/media/metrics/PlaybackMetrics$Builder;

    move-result-object p2

    const-string v1, "1.8.0"

    .line 185
    invoke-virtual {p2, v1}, Landroid/media/metrics/PlaybackMetrics$Builder;->setPlayerVersion(Ljava/lang/String;)Landroid/media/metrics/PlaybackMetrics$Builder;

    move-result-object p2

    iput-object p2, p0, Ll/ۨ۬֫;->֡:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 186
    iget-object p1, p1, Ll/֡۬֫;->ۜ:Ll/ۙ᩵֫;

    invoke-direct {p0, p1, v0}, Ll/ۨ۬֫;->֫(Ll/ۙ᩵֫;Ll/ܺۧۧ;)V

    return-void
.end method

.method public final ֫(Ll/֡۬֫;Ll/ۜۧۧ;)V
    .locals 5

    .line 245
    iget-object v0, p1, Ll/֡۬֫;->ܳ:Ll/ܺۧۧ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 250
    :cond_0
    new-instance v1, Ll/ۛ۬֫;

    iget-object v2, p2, Ll/ۜۧۧ;->ᩳ:Ll/۠ᩴ֫;

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    iget v3, p2, Ll/ۜۧۧ;->ܳ:I

    iget-object p1, p1, Ll/֡۬֫;->ۜ:Ll/ۙ᩵֫;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    iget-object v4, p0, Ll/ۨ۬֫;->ۗ:Ll/۬۬֫;

    invoke-virtual {v4, p1, v0}, Ll/۬۬֫;->֫(Ll/ۙ᩵֫;Ll/ܺۧۧ;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, v3, p1}, Ll/ۛ۬֫;-><init>(Ll/۠ᩴ֫;ILjava/lang/String;)V

    .line 256
    iget p1, p2, Ll/ۜۧۧ;->᩻:I

    if-eqz p1, :cond_3

    const/4 p2, 0x1

    if-eq p1, p2, :cond_2

    const/4 p2, 0x2

    if-eq p1, p2, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_1

    :goto_0
    return-void

    .line 265
    :cond_1
    iput-object v1, p0, Ll/ۨ۬֫;->۠:Ll/ۛ۬֫;

    return-void

    .line 262
    :cond_2
    iput-object v1, p0, Ll/ۨ۬֫;->ۚ:Ll/ۛ۬֫;

    return-void

    .line 259
    :cond_3
    iput-object v1, p0, Ll/ۨ۬֫;->ܶ:Ll/ۛ۬֫;

    return-void
.end method

.method public final ֫(Ll/֨᩵֫;Ll/ۚ۬֫;)V
    .locals 20

    move-object/from16 v6, p0

    move-object/from16 v7, p2

    .line 308
    invoke-virtual/range {p2 .. p2}, Ll/ۚ۬֫;->֫()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_27

    :cond_0
    const/4 v8, 0x0

    const/4 v0, 0x0

    .line 326
    :goto_0
    invoke-virtual/range {p2 .. p2}, Ll/ۚ۬֫;->֫()I

    move-result v1

    iget-object v9, v6, Ll/ۨ۬֫;->ۗ:Ll/۬۬֫;

    const/16 v2, 0xb

    if-ge v0, v1, :cond_3

    .line 327
    invoke-virtual {v7, v0}, Ll/ۚ۬֫;->ۧ(I)I

    move-result v1

    .line 328
    invoke-virtual {v7, v1}, Ll/ۚ۬֫;->ܽ(I)Ll/֡۬֫;

    move-result-object v3

    if-nez v1, :cond_1

    .line 330
    invoke-virtual {v9, v3}, Ll/۬۬֫;->ܽ(Ll/֡۬֫;)V

    goto :goto_1

    :cond_1
    if-ne v1, v2, :cond_2

    .line 332
    iget v1, v6, Ll/ۨ۬֫;->ܺ:I

    invoke-virtual {v9, v3, v1}, Ll/۬۬֫;->֫(Ll/֡۬֫;I)V

    goto :goto_1

    .line 334
    :cond_2
    invoke-virtual {v9, v3}, Ll/۬۬֫;->ۧ(Ll/֡۬֫;)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 313
    :cond_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v10

    .line 340
    invoke-virtual {v7, v8}, Ll/ۚ۬֫;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 341
    invoke-virtual {v7, v8}, Ll/ۚ۬֫;->ܽ(I)Ll/֡۬֫;

    move-result-object v0

    .line 342
    iget-object v1, v6, Ll/ۨ۬֫;->֡:Landroid/media/metrics/PlaybackMetrics$Builder;

    if-eqz v1, :cond_4

    .line 343
    iget-object v1, v0, Ll/֡۬֫;->ۜ:Ll/ۙ᩵֫;

    iget-object v0, v0, Ll/֡۬֫;->ܳ:Ll/ܺۧۧ;

    invoke-direct {v6, v1, v0}, Ll/ۨ۬֫;->֫(Ll/ۙ᩵֫;Ll/ܺۧۧ;)V

    :cond_4
    const/4 v0, 0x2

    .line 346
    invoke-virtual {v7, v0}, Ll/ۚ۬֫;->֫(I)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_c

    iget-object v0, v6, Ll/ۨ۬֫;->֡:Landroid/media/metrics/PlaybackMetrics$Builder;

    if-eqz v0, :cond_c

    .line 347
    invoke-interface/range {p1 .. p1}, Ll/֨᩵֫;->ۘ()Ll/ܰ᩵֫;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܰ᩵֫;->֫()Ll/ܳ۬ܺ;

    move-result-object v0

    .line 375
    invoke-virtual {v0, v8}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object v0

    .line 834
    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩺᩵֫;

    const/4 v3, 0x0

    .line 835
    :goto_2
    iget v4, v2, Ll/᩺᩵֫;->ۧ:I

    if-ge v3, v4, :cond_5

    .line 836
    invoke-virtual {v2, v3}, Ll/᩺᩵֫;->ۧ(I)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 837
    invoke-virtual {v2, v3}, Ll/᩺᩵֫;->֫(I)Ll/۠ᩴ֫;

    move-result-object v4

    iget-object v4, v4, Ll/۠ᩴ֫;->ۘ:Ll/᩵ᩴ֫;

    if-eqz v4, :cond_6

    goto :goto_3

    :cond_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_7
    const/4 v4, 0x0

    :goto_3
    if-eqz v4, :cond_c

    .line 349
    iget-object v0, v6, Ll/ۨ۬֫;->֡:Landroid/media/metrics/PlaybackMetrics$Builder;

    const/4 v2, 0x0

    .line 848
    :goto_4
    iget v3, v4, Ll/᩵ᩴ֫;->᩹:I

    if-ge v2, v3, :cond_b

    .line 849
    invoke-virtual {v4, v2}, Ll/᩵ᩴ֫;->֫(I)Ll/ᩴᩴ֫;

    move-result-object v3

    iget-object v3, v3, Ll/ᩴᩴ֫;->ۗ:Ljava/util/UUID;

    .line 850
    sget-object v5, Ll/᩻ᩴ֫;->ܿ:Ljava/util/UUID;

    invoke-virtual {v3, v5}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    const/4 v2, 0x3

    goto :goto_5

    .line 855
    :cond_8
    sget-object v5, Ll/᩻ᩴ֫;->ܽ:Ljava/util/UUID;

    invoke-virtual {v3, v5}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    const/4 v2, 0x2

    goto :goto_5

    .line 858
    :cond_9
    sget-object v5, Ll/᩻ᩴ֫;->֫:Ljava/util/UUID;

    invoke-virtual {v3, v5}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    const/4 v2, 0x6

    goto :goto_5

    :cond_a
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_b
    const/4 v2, 0x1

    .line 349
    :goto_5
    invoke-virtual {v0, v2}, Landroid/media/metrics/PlaybackMetrics$Builder;->setDrmType(I)Landroid/media/metrics/PlaybackMetrics$Builder;

    :cond_c
    const/16 v0, 0x3f3

    .line 352
    invoke-virtual {v7, v0}, Ll/ۚ۬֫;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 353
    iget v0, v6, Ll/ۨ۬֫;->ۧ:I

    add-int/2addr v0, v1

    iput v0, v6, Ll/ۨ۬֫;->ۧ:I

    .line 358
    :cond_d
    iget-object v0, v6, Ll/ۨ۬֫;->֨:Ll/ܺ᩵֫;

    .line 359
    iget-object v12, v6, Ll/ۨ۬֫;->ܳ:Landroid/content/Context;

    iget-object v13, v6, Ll/ۨ۬֫;->ܽ:Ljava/util/concurrent/Executor;

    iget-wide v14, v6, Ll/ۨ۬֫;->۬:J

    const/4 v2, 0x4

    if-nez v0, :cond_e

    const/4 v0, 0x1

    move-object/from16 v17, v9

    const/4 v5, 0x5

    goto/16 :goto_11

    :cond_e
    iget v3, v0, Ll/ܺ᩵֫;->᩸:I

    .line 362
    iget v4, v6, Ll/ۨ۬֫;->ᩴ:I

    if-ne v4, v2, :cond_f

    const/4 v2, 0x1

    goto :goto_6

    :cond_f
    const/4 v2, 0x0

    :goto_6
    const/16 v4, 0x3e9

    if-ne v3, v4, :cond_10

    .line 709
    new-instance v1, Ll/ۤ۬֫;

    const/16 v2, 0x14

    invoke-direct {v1, v2, v8}, Ll/ۤ۬֫;-><init>(II)V

    move-object/from16 v17, v9

    const/4 v5, 0x5

    goto/16 :goto_10

    .line 715
    :cond_10
    instance-of v4, v0, Ll/ᩳ᩶֫;

    if-eqz v4, :cond_12

    .line 716
    move-object v4, v0

    check-cast v4, Ll/ᩳ᩶֫;

    .line 717
    iget v8, v4, Ll/ᩳ᩶֫;->ۛ:I

    if-ne v8, v1, :cond_11

    const/4 v1, 0x1

    goto :goto_7

    :cond_11
    const/4 v1, 0x0

    .line 719
    :goto_7
    iget v4, v4, Ll/ᩳ᩶֫;->۬:I

    goto :goto_8

    :cond_12
    const/4 v4, 0x0

    const/4 v1, 0x0

    .line 721
    :goto_8
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v8

    .line 155
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 722
    instance-of v5, v8, Ljava/io/IOException;

    move-object/from16 v17, v9

    const/16 v9, 0x17

    if-eqz v5, :cond_27

    .line 723
    instance-of v1, v8, Ll/᩻ܶ֫;

    if-eqz v1, :cond_13

    .line 724
    check-cast v8, Ll/᩻ܶ֫;

    iget v1, v8, Ll/᩻ܶ֫;->۬:I

    .line 725
    new-instance v2, Ll/ۤ۬֫;

    const/4 v5, 0x5

    invoke-direct {v2, v5, v1}, Ll/ۤ۬֫;-><init>(II)V

    :goto_9
    move-object v1, v2

    goto/16 :goto_10

    :cond_13
    const/4 v5, 0x5

    .line 727
    instance-of v1, v8, Ll/ܳܶ֫;

    if-nez v1, :cond_25

    instance-of v1, v8, Ll/ۡ᩵֫;

    if-eqz v1, :cond_14

    goto/16 :goto_c

    .line 734
    :cond_14
    instance-of v1, v8, Ll/ܿܶ֫;

    if-nez v1, :cond_20

    instance-of v2, v8, Ll/ۚܶ֫;

    if-eqz v2, :cond_15

    goto/16 :goto_b

    :cond_15
    const/16 v1, 0x3ea

    if-ne v3, v1, :cond_16

    .line 757
    new-instance v1, Ll/ۤ۬֫;

    const/16 v2, 0x15

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Ll/ۤ۬֫;-><init>(II)V

    goto/16 :goto_10

    .line 759
    :cond_16
    instance-of v1, v8, Ll/᩵ۛ֫;

    if-eqz v1, :cond_1d

    .line 761
    invoke-virtual {v8}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 762
    instance-of v2, v1, Landroid/media/MediaDrm$MediaDrmStateException;

    if-eqz v2, :cond_17

    .line 763
    check-cast v1, Landroid/media/MediaDrm$MediaDrmStateException;

    invoke-virtual {v1}, Landroid/media/MediaDrm$MediaDrmStateException;->getDiagnosticInfo()Ljava/lang/String;

    move-result-object v1

    .line 764
    invoke-static {v1}, Ll/ۘ֨֫;->֫(Ljava/lang/String;)I

    move-result v1

    .line 867
    invoke-static {v1}, Ll/ۘ֨֫;->ᩳ(I)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    const/16 v2, 0x1b

    goto :goto_a

    :pswitch_0
    const/16 v2, 0x1a

    goto :goto_a

    :pswitch_1
    const/16 v2, 0x19

    goto :goto_a

    :pswitch_2
    const/16 v2, 0x1c

    goto :goto_a

    :pswitch_3
    const/16 v2, 0x18

    .line 766
    :goto_a
    new-instance v3, Ll/ۤ۬֫;

    invoke-direct {v3, v2, v1}, Ll/ۤ۬֫;-><init>(II)V

    goto/16 :goto_e

    .line 767
    :cond_17
    invoke-static {v1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_18

    .line 768
    new-instance v1, Ll/ۤ۬֫;

    const/16 v2, 0x1b

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Ll/ۤ۬֫;-><init>(II)V

    goto/16 :goto_10

    :cond_18
    const/4 v3, 0x0

    .line 769
    instance-of v2, v1, Landroid/media/NotProvisionedException;

    if-eqz v2, :cond_19

    .line 770
    new-instance v1, Ll/ۤ۬֫;

    const/16 v2, 0x18

    invoke-direct {v1, v2, v3}, Ll/ۤ۬֫;-><init>(II)V

    goto/16 :goto_10

    .line 772
    :cond_19
    instance-of v2, v1, Landroid/media/DeniedByServerException;

    if-eqz v2, :cond_1a

    .line 773
    new-instance v1, Ll/ۤ۬֫;

    const/16 v2, 0x1d

    invoke-direct {v1, v2, v3}, Ll/ۤ۬֫;-><init>(II)V

    goto/16 :goto_10

    .line 774
    :cond_1a
    instance-of v2, v1, Ll/᩷ۨ֫;

    if-eqz v2, :cond_1b

    .line 775
    new-instance v1, Ll/ۤ۬֫;

    invoke-direct {v1, v9, v3}, Ll/ۤ۬֫;-><init>(II)V

    goto/16 :goto_10

    .line 777
    :cond_1b
    instance-of v1, v1, Ll/ܳۛ֫;

    if-eqz v1, :cond_1c

    .line 778
    new-instance v1, Ll/ۤ۬֫;

    const/16 v2, 0x1c

    invoke-direct {v1, v2, v3}, Ll/ۤ۬֫;-><init>(II)V

    goto/16 :goto_10

    .line 780
    :cond_1c
    new-instance v1, Ll/ۤ۬֫;

    const/16 v2, 0x1e

    invoke-direct {v1, v2, v3}, Ll/ۤ۬֫;-><init>(II)V

    goto/16 :goto_10

    .line 782
    :cond_1d
    instance-of v1, v8, Ll/ۧܶ֫;

    if-eqz v1, :cond_1f

    .line 783
    invoke-virtual {v8}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Ljava/io/FileNotFoundException;

    if-eqz v1, :cond_1f

    .line 784
    invoke-virtual {v8}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 784
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    .line 785
    instance-of v2, v1, Landroid/system/ErrnoException;

    if-eqz v2, :cond_1e

    check-cast v1, Landroid/system/ErrnoException;

    iget v1, v1, Landroid/system/ErrnoException;->errno:I

    sget v2, Landroid/system/OsConstants;->EACCES:I

    if-ne v1, v2, :cond_1e

    .line 787
    new-instance v1, Ll/ۤ۬֫;

    const/16 v2, 0x20

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Ll/ۤ۬֫;-><init>(II)V

    goto/16 :goto_10

    :cond_1e
    const/4 v3, 0x0

    .line 789
    new-instance v1, Ll/ۤ۬֫;

    const/16 v2, 0x1f

    invoke-direct {v1, v2, v3}, Ll/ۤ۬֫;-><init>(II)V

    goto/16 :goto_10

    :cond_1f
    const/4 v3, 0x0

    .line 792
    new-instance v1, Ll/ۤ۬֫;

    const/16 v2, 0x9

    invoke-direct {v1, v2, v3}, Ll/ۤ۬֫;-><init>(II)V

    goto/16 :goto_10

    :cond_20
    :goto_b
    const/4 v3, 0x0

    .line 736
    invoke-static {v12}, Ll/ۧ֨֫;->֫(Landroid/content/Context;)Ll/ۧ֨֫;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۧ֨֫;->֫()I

    move-result v2

    const/4 v4, 0x1

    if-ne v2, v4, :cond_21

    .line 737
    new-instance v1, Ll/ۤ۬֫;

    const/4 v2, 0x3

    invoke-direct {v1, v2, v3}, Ll/ۤ۬֫;-><init>(II)V

    goto/16 :goto_10

    .line 740
    :cond_21
    invoke-virtual {v8}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    .line 741
    instance-of v4, v2, Ljava/net/UnknownHostException;

    if-eqz v4, :cond_22

    .line 742
    new-instance v1, Ll/ۤ۬֫;

    const/4 v2, 0x6

    invoke-direct {v1, v2, v3}, Ll/ۤ۬֫;-><init>(II)V

    goto/16 :goto_10

    .line 743
    :cond_22
    instance-of v2, v2, Ljava/net/SocketTimeoutException;

    if-eqz v2, :cond_23

    .line 744
    new-instance v1, Ll/ۤ۬֫;

    const/4 v2, 0x7

    invoke-direct {v1, v2, v3}, Ll/ۤ۬֫;-><init>(II)V

    goto/16 :goto_10

    :cond_23
    if-eqz v1, :cond_24

    .line 746
    check-cast v8, Ll/ܿܶ֫;

    iget v1, v8, Ll/ܿܶ֫;->᩶:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_24

    .line 749
    new-instance v1, Ll/ۤ۬֫;

    const/4 v2, 0x4

    invoke-direct {v1, v2, v3}, Ll/ۤ۬֫;-><init>(II)V

    goto/16 :goto_10

    .line 752
    :cond_24
    new-instance v1, Ll/ۤ۬֫;

    const/16 v2, 0x8

    invoke-direct {v1, v2, v3}, Ll/ۤ۬֫;-><init>(II)V

    goto/16 :goto_10

    :cond_25
    :goto_c
    const/4 v3, 0x0

    .line 729
    new-instance v1, Ll/ۤ۬֫;

    if-eqz v2, :cond_26

    const/16 v2, 0xa

    goto :goto_d

    :cond_26
    const/16 v2, 0xb

    .line 732
    :goto_d
    invoke-direct {v1, v2, v3}, Ll/ۤ۬֫;-><init>(II)V

    goto/16 :goto_10

    :cond_27
    const/4 v5, 0x5

    if-eqz v1, :cond_29

    if-eqz v4, :cond_28

    const/4 v3, 0x1

    if-ne v4, v3, :cond_29

    .line 797
    :cond_28
    new-instance v1, Ll/ۤ۬֫;

    const/16 v2, 0x23

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Ll/ۤ۬֫;-><init>(II)V

    goto/16 :goto_10

    :cond_29
    const/4 v3, 0x0

    if-eqz v1, :cond_2a

    const/4 v2, 0x3

    if-ne v4, v2, :cond_2a

    .line 801
    new-instance v1, Ll/ۤ۬֫;

    const/16 v2, 0xf

    invoke-direct {v1, v2, v3}, Ll/ۤ۬֫;-><init>(II)V

    goto/16 :goto_10

    :cond_2a
    if-eqz v1, :cond_2b

    const/4 v1, 0x2

    if-ne v4, v1, :cond_2b

    .line 805
    new-instance v1, Ll/ۤ۬֫;

    invoke-direct {v1, v9, v3}, Ll/ۤ۬֫;-><init>(II)V

    goto/16 :goto_10

    .line 806
    :cond_2b
    instance-of v1, v8, Ll/᩷۟֫;

    if-eqz v1, :cond_2c

    .line 808
    check-cast v8, Ll/᩷۟֫;

    iget-object v1, v8, Ll/᩷۟֫;->᩹:Ljava/lang/String;

    .line 810
    invoke-static {v1}, Ll/ۘ֨֫;->֫(Ljava/lang/String;)I

    move-result v1

    .line 811
    new-instance v2, Ll/ۤ۬֫;

    const/16 v3, 0xd

    invoke-direct {v2, v3, v1}, Ll/ۤ۬֫;-><init>(II)V

    goto/16 :goto_9

    .line 812
    :cond_2c
    instance-of v1, v8, Ll/ᩳ۟֫;

    const/16 v2, 0xe

    if-eqz v1, :cond_2d

    .line 813
    check-cast v8, Ll/ᩳ۟֫;

    iget v1, v8, Ll/ᩳ۟֫;->᩸:I

    .line 814
    new-instance v3, Ll/ۤ۬֫;

    invoke-direct {v3, v2, v1}, Ll/ۤ۬֫;-><init>(II)V

    :goto_e
    move-object v1, v3

    goto :goto_10

    .line 815
    :cond_2d
    instance-of v1, v8, Ljava/lang/OutOfMemoryError;

    if-eqz v1, :cond_2e

    .line 816
    new-instance v1, Ll/ۤ۬֫;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Ll/ۤ۬֫;-><init>(II)V

    goto :goto_10

    .line 817
    :cond_2e
    instance-of v1, v8, Ll/ܶ۫֫;

    if-eqz v1, :cond_2f

    .line 818
    check-cast v8, Ll/ܶ۫֫;

    iget v1, v8, Ll/ܶ۫֫;->᩸:I

    .line 819
    new-instance v2, Ll/ۤ۬֫;

    const/16 v3, 0x11

    invoke-direct {v2, v3, v1}, Ll/ۤ۬֫;-><init>(II)V

    goto/16 :goto_9

    .line 820
    :cond_2f
    instance-of v1, v8, Ll/᩶۫֫;

    if-eqz v1, :cond_30

    .line 821
    check-cast v8, Ll/᩶۫֫;

    iget v1, v8, Ll/᩶۫֫;->᩸:I

    .line 822
    new-instance v2, Ll/ۤ۬֫;

    const/16 v3, 0x12

    invoke-direct {v2, v3, v1}, Ll/ۤ۬֫;-><init>(II)V

    goto/16 :goto_9

    .line 823
    :cond_30
    instance-of v1, v8, Landroid/media/MediaCodec$CryptoException;

    if-eqz v1, :cond_31

    .line 824
    check-cast v8, Landroid/media/MediaCodec$CryptoException;

    invoke-virtual {v8}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    move-result v1

    .line 867
    invoke-static {v1}, Ll/ۘ֨֫;->ᩳ(I)I

    move-result v2

    packed-switch v2, :pswitch_data_1

    const/16 v2, 0x1b

    goto :goto_f

    :pswitch_4
    const/16 v2, 0x1a

    goto :goto_f

    :pswitch_5
    const/16 v2, 0x19

    goto :goto_f

    :pswitch_6
    const/16 v2, 0x1c

    goto :goto_f

    :pswitch_7
    const/16 v2, 0x18

    .line 826
    :goto_f
    new-instance v3, Ll/ۤ۬֫;

    invoke-direct {v3, v2, v1}, Ll/ۤ۬֫;-><init>(II)V

    goto :goto_e

    .line 828
    :cond_31
    new-instance v1, Ll/ۤ۬֫;

    const/16 v2, 0x16

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Ll/ۤ۬֫;-><init>(II)V

    .line 365
    :goto_10
    new-instance v2, Landroid/media/metrics/PlaybackErrorEvent$Builder;

    invoke-direct {v2}, Landroid/media/metrics/PlaybackErrorEvent$Builder;-><init>()V

    sub-long v3, v10, v14

    .line 367
    invoke-virtual {v2, v3, v4}, Landroid/media/metrics/PlaybackErrorEvent$Builder;->setTimeSinceCreatedMillis(J)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    move-result-object v2

    iget v3, v1, Ll/ۤ۬֫;->֫:I

    .line 368
    invoke-virtual {v2, v3}, Landroid/media/metrics/PlaybackErrorEvent$Builder;->setErrorCode(I)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    move-result-object v2

    iget v1, v1, Ll/ۤ۬֫;->ۧ:I

    .line 369
    invoke-virtual {v2, v1}, Landroid/media/metrics/PlaybackErrorEvent$Builder;->setSubErrorCode(I)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    move-result-object v1

    .line 370
    invoke-virtual {v1, v0}, Landroid/media/metrics/PlaybackErrorEvent$Builder;->setException(Ljava/lang/Exception;)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    move-result-object v0

    .line 371
    invoke-virtual {v0}, Landroid/media/metrics/PlaybackErrorEvent$Builder;->build()Landroid/media/metrics/PlaybackErrorEvent;

    move-result-object v0

    .line 372
    new-instance v1, Ll/۫۬֫;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v6, v0}, Ll/۫۬֫;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v13, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const/4 v0, 0x1

    .line 373
    iput-boolean v0, v6, Ll/ۨ۬֫;->ۙ:Z

    const/4 v1, 0x0

    .line 374
    iput-object v1, v6, Ll/ۨ۬֫;->֨:Ll/ܺ᩵֫;

    :goto_11
    const/4 v1, 0x2

    .line 378
    invoke-virtual {v7, v1}, Ll/ۚ۬֫;->֫(I)Z

    move-result v2

    if-eqz v2, :cond_3b

    .line 379
    invoke-interface/range {p1 .. p1}, Ll/֨᩵֫;->ۘ()Ll/ܰ᩵֫;

    move-result-object v2

    .line 380
    invoke-virtual {v2, v1}, Ll/ܰ᩵֫;->ۧ(I)Z

    move-result v1

    .line 381
    invoke-virtual {v2, v0}, Ll/ܰ᩵֫;->ۧ(I)Z

    move-result v8

    const/4 v0, 0x3

    .line 382
    invoke-virtual {v2, v0}, Ll/ܰ᩵֫;->ۧ(I)Z

    move-result v9

    if-nez v1, :cond_32

    if-nez v8, :cond_32

    if-eqz v9, :cond_3b

    :cond_32
    if-nez v1, :cond_35

    .line 495
    iget-object v0, v6, Ll/ۨ۬֫;->ۡ:Ll/۠ᩴ֫;

    const/4 v4, 0x0

    invoke-static {v0, v4}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_33

    move-object/from16 v18, v4

    const/16 v19, 0x5

    goto :goto_13

    .line 498
    :cond_33
    iget-object v0, v6, Ll/ۨ۬֫;->ۡ:Ll/۠ᩴ֫;

    if-nez v0, :cond_34

    const/4 v0, 0x1

    const/16 v16, 0x1

    goto :goto_12

    :cond_34
    const/4 v0, 0x0

    const/16 v16, 0x0

    .line 501
    :goto_12
    iput-object v4, v6, Ll/ۨ۬֫;->ۡ:Ll/۠ᩴ֫;

    const/4 v1, 0x1

    move-object/from16 v0, p0

    move-wide v2, v10

    move-object/from16 v18, v4

    const/16 v19, 0x5

    move/from16 v5, v16

    .line 502
    invoke-direct/range {v0 .. v5}, Ll/ۨ۬֫;->֫(IJLl/۠ᩴ֫;I)V

    :goto_13
    move-object/from16 v5, v18

    goto :goto_14

    :cond_35
    const/16 v19, 0x5

    const/4 v4, 0x0

    move-object v5, v4

    :goto_14
    if-nez v8, :cond_38

    .line 508
    iget-object v0, v6, Ll/ۨ۬֫;->᩻:Ll/۠ᩴ֫;

    invoke-static {v0, v5}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_36

    goto :goto_16

    .line 511
    :cond_36
    iget-object v0, v6, Ll/ۨ۬֫;->᩻:Ll/۠ᩴ֫;

    if-nez v0, :cond_37

    const/4 v0, 0x1

    const/4 v8, 0x1

    goto :goto_15

    :cond_37
    const/4 v0, 0x0

    const/4 v8, 0x0

    .line 514
    :goto_15
    iput-object v5, v6, Ll/ۨ۬֫;->᩻:Ll/۠ᩴ֫;

    const/4 v1, 0x0

    move-object/from16 v0, p0

    move-wide v2, v10

    move-object v4, v5

    move-object v7, v5

    move v5, v8

    .line 515
    invoke-direct/range {v0 .. v5}, Ll/ۨ۬֫;->֫(IJLl/۠ᩴ֫;I)V

    goto :goto_17

    :cond_38
    :goto_16
    move-object v7, v5

    :goto_17
    if-nez v9, :cond_3c

    .line 521
    iget-object v0, v6, Ll/ۨ۬֫;->ۢ:Ll/۠ᩴ֫;

    invoke-static {v0, v7}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_39

    goto :goto_19

    .line 524
    :cond_39
    iget-object v0, v6, Ll/ۨ۬֫;->ۢ:Ll/۠ᩴ֫;

    if-nez v0, :cond_3a

    const/4 v0, 0x1

    const/4 v5, 0x1

    goto :goto_18

    :cond_3a
    const/4 v0, 0x0

    const/4 v5, 0x0

    .line 527
    :goto_18
    iput-object v7, v6, Ll/ۨ۬֫;->ۢ:Ll/۠ᩴ֫;

    const/4 v1, 0x2

    move-object/from16 v0, p0

    move-wide v2, v10

    move-object v4, v7

    .line 528
    invoke-direct/range {v0 .. v5}, Ll/ۨ۬֫;->֫(IJLl/۠ᩴ֫;I)V

    goto :goto_19

    :cond_3b
    const/16 v19, 0x5

    const/4 v5, 0x0

    move-object v7, v5

    .line 396
    :cond_3c
    :goto_19
    iget-object v0, v6, Ll/ۨ۬֫;->ܶ:Ll/ۛ۬֫;

    invoke-direct {v6, v0}, Ll/ۨ۬֫;->֫(Ll/ۛ۬֫;)Z

    move-result v0

    if-eqz v0, :cond_3f

    iget-object v0, v6, Ll/ۨ۬֫;->ܶ:Ll/ۛ۬֫;

    iget-object v4, v0, Ll/ۛ۬֫;->֫:Ll/۠ᩴ֫;

    iget v1, v4, Ll/۠ᩴ֫;->۠:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_3f

    .line 398
    iget v0, v0, Ll/ۛ۬֫;->ۧ:I

    .line 495
    iget-object v1, v6, Ll/ۨ۬֫;->ۡ:Ll/۠ᩴ֫;

    invoke-static {v1, v4}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    goto :goto_1b

    .line 498
    :cond_3d
    iget-object v1, v6, Ll/ۨ۬֫;->ۡ:Ll/۠ᩴ֫;

    if-nez v1, :cond_3e

    if-nez v0, :cond_3e

    const/4 v0, 0x1

    const/4 v5, 0x1

    goto :goto_1a

    :cond_3e
    move v5, v0

    .line 501
    :goto_1a
    iput-object v4, v6, Ll/ۨ۬֫;->ۡ:Ll/۠ᩴ֫;

    const/4 v1, 0x1

    move-object/from16 v0, p0

    move-wide v2, v10

    .line 502
    invoke-direct/range {v0 .. v5}, Ll/ۨ۬֫;->֫(IJLl/۠ᩴ֫;I)V

    .line 400
    :goto_1b
    iput-object v7, v6, Ll/ۨ۬֫;->ܶ:Ll/ۛ۬֫;

    .line 402
    :cond_3f
    iget-object v0, v6, Ll/ۨ۬֫;->ۚ:Ll/ۛ۬֫;

    invoke-direct {v6, v0}, Ll/ۨ۬֫;->֫(Ll/ۛ۬֫;)Z

    move-result v0

    if-eqz v0, :cond_42

    .line 403
    iget-object v0, v6, Ll/ۨ۬֫;->ۚ:Ll/ۛ۬֫;

    iget-object v4, v0, Ll/ۛ۬֫;->֫:Ll/۠ᩴ֫;

    iget v0, v0, Ll/ۛ۬֫;->ۧ:I

    .line 508
    iget-object v1, v6, Ll/ۨ۬֫;->᩻:Ll/۠ᩴ֫;

    invoke-static {v1, v4}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_40

    goto :goto_1d

    .line 511
    :cond_40
    iget-object v1, v6, Ll/ۨ۬֫;->᩻:Ll/۠ᩴ֫;

    if-nez v1, :cond_41

    if-nez v0, :cond_41

    const/4 v0, 0x1

    const/4 v5, 0x1

    goto :goto_1c

    :cond_41
    move v5, v0

    .line 514
    :goto_1c
    iput-object v4, v6, Ll/ۨ۬֫;->᩻:Ll/۠ᩴ֫;

    const/4 v1, 0x0

    move-object/from16 v0, p0

    move-wide v2, v10

    .line 515
    invoke-direct/range {v0 .. v5}, Ll/ۨ۬֫;->֫(IJLl/۠ᩴ֫;I)V

    .line 405
    :goto_1d
    iput-object v7, v6, Ll/ۨ۬֫;->ۚ:Ll/ۛ۬֫;

    .line 407
    :cond_42
    iget-object v0, v6, Ll/ۨ۬֫;->۠:Ll/ۛ۬֫;

    invoke-direct {v6, v0}, Ll/ۨ۬֫;->֫(Ll/ۛ۬֫;)Z

    move-result v0

    if-eqz v0, :cond_45

    .line 408
    iget-object v0, v6, Ll/ۨ۬֫;->۠:Ll/ۛ۬֫;

    iget-object v4, v0, Ll/ۛ۬֫;->֫:Ll/۠ᩴ֫;

    iget v0, v0, Ll/ۛ۬֫;->ۧ:I

    .line 521
    iget-object v1, v6, Ll/ۨ۬֫;->ۢ:Ll/۠ᩴ֫;

    invoke-static {v1, v4}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_43

    goto :goto_1f

    .line 524
    :cond_43
    iget-object v1, v6, Ll/ۨ۬֫;->ۢ:Ll/۠ᩴ֫;

    if-nez v1, :cond_44

    if-nez v0, :cond_44

    const/4 v0, 0x1

    const/4 v5, 0x1

    goto :goto_1e

    :cond_44
    move v5, v0

    .line 527
    :goto_1e
    iput-object v4, v6, Ll/ۨ۬֫;->ۢ:Ll/۠ᩴ֫;

    const/4 v1, 0x2

    move-object/from16 v0, p0

    move-wide v2, v10

    .line 528
    invoke-direct/range {v0 .. v5}, Ll/ۨ۬֫;->֫(IJLl/۠ᩴ֫;I)V

    .line 410
    :goto_1f
    iput-object v7, v6, Ll/ۨ۬֫;->۠:Ll/ۛ۬֫;

    .line 661
    :cond_45
    invoke-static {v12}, Ll/ۧ֨֫;->֫(Landroid/content/Context;)Ll/ۧ֨֫;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۧ֨֫;->֫()I

    move-result v0

    packed-switch v0, :pswitch_data_2

    :pswitch_8
    const/4 v0, 0x1

    goto :goto_20

    :pswitch_9
    const/4 v0, 0x7

    goto :goto_20

    :pswitch_a
    const/16 v0, 0x8

    goto :goto_20

    :pswitch_b
    const/4 v0, 0x3

    goto :goto_20

    :pswitch_c
    const/4 v0, 0x6

    goto :goto_20

    :pswitch_d
    const/4 v0, 0x5

    goto :goto_20

    :pswitch_e
    const/4 v0, 0x4

    goto :goto_20

    :pswitch_f
    const/4 v0, 0x2

    goto :goto_20

    :pswitch_10
    const/16 v0, 0x9

    goto :goto_20

    :pswitch_11
    const/4 v0, 0x0

    .line 422
    :goto_20
    iget v1, v6, Ll/ۨ۬֫;->ۜ:I

    if-eq v0, v1, :cond_46

    .line 423
    iput v0, v6, Ll/ۨ۬֫;->ۜ:I

    .line 424
    new-instance v1, Landroid/media/metrics/NetworkEvent$Builder;

    invoke-direct {v1}, Landroid/media/metrics/NetworkEvent$Builder;-><init>()V

    .line 426
    invoke-virtual {v1, v0}, Landroid/media/metrics/NetworkEvent$Builder;->setNetworkType(I)Landroid/media/metrics/NetworkEvent$Builder;

    move-result-object v0

    sub-long v1, v10, v14

    .line 427
    invoke-virtual {v0, v1, v2}, Landroid/media/metrics/NetworkEvent$Builder;->setTimeSinceCreatedMillis(J)Landroid/media/metrics/NetworkEvent$Builder;

    move-result-object v0

    .line 428
    invoke-virtual {v0}, Landroid/media/metrics/NetworkEvent$Builder;->build()Landroid/media/metrics/NetworkEvent;

    move-result-object v0

    .line 429
    new-instance v1, Ll/᩷֨᩷;

    const/4 v2, 0x1

    invoke-direct {v1, v2, v6, v0}, Ll/᩷֨᩷;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v13, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 434
    :cond_46
    invoke-interface/range {p1 .. p1}, Ll/֨᩵֫;->ᩳ()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_47

    const/4 v0, 0x0

    .line 435
    iput-boolean v0, v6, Ll/ۨ۬֫;->᩵:Z

    goto :goto_21

    :cond_47
    const/4 v0, 0x0

    .line 437
    :goto_21
    invoke-interface/range {p1 .. p1}, Ll/֨᩵֫;->ۖ()Ll/ᩳ᩶֫;

    move-result-object v1

    if-nez v1, :cond_48

    .line 438
    iput-boolean v0, v6, Ll/ۨ۬֫;->ۘ:Z

    move-object/from16 v1, p2

    goto :goto_22

    :cond_48
    const/16 v0, 0xa

    move-object/from16 v1, p2

    .line 439
    invoke-virtual {v1, v0}, Ll/ۚ۬֫;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_49

    const/4 v0, 0x1

    .line 440
    iput-boolean v0, v6, Ll/ۨ۬֫;->ۘ:Z

    .line 457
    :cond_49
    :goto_22
    invoke-interface/range {p1 .. p1}, Ll/֨᩵֫;->ᩳ()I

    move-result v0

    .line 458
    iget-boolean v2, v6, Ll/ۨ۬֫;->᩵:Z

    if-eqz v2, :cond_4a

    const/4 v5, 0x5

    goto :goto_24

    .line 461
    :cond_4a
    iget-boolean v2, v6, Ll/ۨ۬֫;->ۘ:Z

    if-eqz v2, :cond_4b

    const/16 v5, 0xd

    goto :goto_24

    :cond_4b
    const/4 v2, 0x4

    if-ne v0, v2, :cond_4c

    const/16 v5, 0xb

    goto :goto_24

    :cond_4c
    const/16 v2, 0xc

    const/4 v3, 0x2

    if-ne v0, v3, :cond_51

    .line 466
    iget v0, v6, Ll/ۨ۬֫;->᩷:I

    if-eqz v0, :cond_50

    if-eq v0, v3, :cond_50

    if-ne v0, v2, :cond_4d

    goto :goto_23

    .line 471
    :cond_4d
    invoke-interface/range {p1 .. p1}, Ll/֨᩵֫;->᩶()Z

    move-result v0

    if-nez v0, :cond_4e

    const/4 v5, 0x7

    goto :goto_24

    .line 474
    :cond_4e
    invoke-interface/range {p1 .. p1}, Ll/֨᩵֫;->֡()I

    move-result v0

    if-eqz v0, :cond_4f

    const/16 v5, 0xa

    goto :goto_24

    :cond_4f
    const/4 v5, 0x6

    goto :goto_24

    :cond_50
    :goto_23
    const/4 v5, 0x2

    goto :goto_24

    :cond_51
    const/4 v3, 0x3

    if-ne v0, v3, :cond_54

    .line 478
    invoke-interface/range {p1 .. p1}, Ll/֨᩵֫;->᩶()Z

    move-result v0

    if-nez v0, :cond_52

    const/4 v5, 0x4

    goto :goto_24

    .line 481
    :cond_52
    invoke-interface/range {p1 .. p1}, Ll/֨᩵֫;->֡()I

    move-result v0

    if-eqz v0, :cond_53

    const/16 v5, 0x9

    goto :goto_24

    :cond_53
    const/4 v5, 0x3

    :goto_24
    const/4 v0, 0x1

    move v2, v5

    goto :goto_26

    :cond_54
    const/4 v3, 0x1

    if-ne v0, v3, :cond_55

    .line 484
    iget v0, v6, Ll/ۨ۬֫;->᩷:I

    if-eqz v0, :cond_55

    goto :goto_25

    .line 490
    :cond_55
    iget v2, v6, Ll/ۨ۬֫;->᩷:I

    :goto_25
    const/4 v0, 0x1

    .line 443
    :goto_26
    iget v3, v6, Ll/ۨ۬֫;->᩷:I

    if-eq v3, v2, :cond_56

    .line 444
    iput v2, v6, Ll/ۨ۬֫;->᩷:I

    .line 445
    iput-boolean v0, v6, Ll/ۨ۬֫;->ۙ:Z

    .line 446
    new-instance v0, Landroid/media/metrics/PlaybackStateEvent$Builder;

    invoke-direct {v0}, Landroid/media/metrics/PlaybackStateEvent$Builder;-><init>()V

    iget v2, v6, Ll/ۨ۬֫;->᩷:I

    .line 448
    invoke-virtual {v0, v2}, Landroid/media/metrics/PlaybackStateEvent$Builder;->setState(I)Landroid/media/metrics/PlaybackStateEvent$Builder;

    move-result-object v0

    sub-long/2addr v10, v14

    .line 449
    invoke-virtual {v0, v10, v11}, Landroid/media/metrics/PlaybackStateEvent$Builder;->setTimeSinceCreatedMillis(J)Landroid/media/metrics/PlaybackStateEvent$Builder;

    move-result-object v0

    .line 450
    invoke-virtual {v0}, Landroid/media/metrics/PlaybackStateEvent$Builder;->build()Landroid/media/metrics/PlaybackStateEvent;

    move-result-object v0

    .line 451
    new-instance v2, Ll/᩵۫᩻;

    const/4 v3, 0x1

    invoke-direct {v2, v3, v6, v0}, Ll/᩵۫᩻;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v13, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_56
    const/16 v0, 0x404

    .line 320
    invoke-virtual {v1, v0}, Ll/ۚ۬֫;->֫(I)Z

    move-result v2

    if-eqz v2, :cond_57

    .line 321
    invoke-virtual {v1, v0}, Ll/ۚ۬֫;->ܽ(I)Ll/֡۬֫;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Ll/۬۬֫;->֫(Ll/֡۬֫;)V

    :cond_57
    :goto_27
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1772
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1772
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_8
        :pswitch_b
        :pswitch_8
        :pswitch_a
        :pswitch_9
    .end packed-switch
.end method

.method public final ֫(Ll/ۗ᩹֫;)V
    .locals 2

    .line 223
    iget v0, p0, Ll/ۨ۬֫;->ۖ:I

    iget v1, p1, Ll/ۗ᩹֫;->ܽ:I

    add-int/2addr v0, v1

    iput v0, p0, Ll/ۨ۬֫;->ۖ:I

    .line 224
    iget v0, p0, Ll/ۨ۬֫;->᩶:I

    iget p1, p1, Ll/ۗ᩹֫;->ۜ:I

    add-int/2addr v0, p1

    iput v0, p0, Ll/ۨ۬֫;->᩶:I

    return-void
.end method

.method public final ֫(Ll/ۜ֡֫;)V
    .locals 4

    .line 274
    iget-object v0, p0, Ll/ۨ۬֫;->ܶ:Ll/ۛ۬֫;

    if-eqz v0, :cond_0

    .line 275
    iget-object v1, v0, Ll/ۛ۬֫;->֫:Ll/۠ᩴ֫;

    iget v2, v1, Ll/۠ᩴ֫;->۠:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    .line 279
    invoke-virtual {v1}, Ll/۠ᩴ֫;->֫()Ll/֨ᩴ֫;

    move-result-object v1

    iget v2, p1, Ll/ۜ֡֫;->ܽ:I

    .line 280
    invoke-virtual {v1, v2}, Ll/֨ᩴ֫;->ۙ(I)V

    iget p1, p1, Ll/ۜ֡֫;->֫:I

    .line 281
    invoke-virtual {v1, p1}, Ll/֨ᩴ֫;->ۡ(I)V

    .line 282
    invoke-virtual {v1}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object p1

    .line 283
    new-instance v1, Ll/ۛ۬֫;

    iget v2, v0, Ll/ۛ۬֫;->ۧ:I

    iget-object v0, v0, Ll/ۛ۬֫;->ܽ:Ljava/lang/String;

    invoke-direct {v1, p1, v2, v0}, Ll/ۛ۬֫;-><init>(Ll/۠ᩴ֫;ILjava/lang/String;)V

    iput-object v1, p0, Ll/ۨ۬֫;->ܶ:Ll/ۛ۬֫;

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۜۧۧ;)V
    .locals 0

    .line 298
    iget p1, p1, Ll/ۜۧۧ;->֫:I

    iput p1, p0, Ll/ۨ۬֫;->ᩴ:I

    return-void
.end method

.method public final ֫(Ll/ܺ᩵֫;)V
    .locals 0

    .line 303
    iput-object p1, p0, Ll/ۨ۬֫;->֨:Ll/ܺ᩵֫;

    return-void
.end method

.method public final ۧ(Ll/֡۬֫;Ljava/lang/String;)V
    .locals 0

    .line 196
    iget-object p1, p1, Ll/֡۬֫;->ܳ:Ll/ܺۧۧ;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ll/ܺۧۧ;->֫()Z

    move-result p1

    if-nez p1, :cond_2

    :cond_0
    iget-object p1, p0, Ll/ۨ۬֫;->֫:Ljava/lang/String;

    .line 197
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    .line 200
    :cond_1
    invoke-direct {p0}, Ll/ۨ۬֫;->ۧ()V

    .line 202
    :cond_2
    :goto_0
    iget-object p1, p0, Ll/ۨ۬֫;->ܿ:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    iget-object p1, p0, Ll/ۨ۬֫;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
