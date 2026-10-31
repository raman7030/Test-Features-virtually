.class public final Ll/۠ۤ֫;
.super Ljava/lang/Object;
.source "68UW"

# interfaces
.implements Ll/ۙ۫֫;


# static fields
.field public static ֫ۧ:Ljava/util/concurrent/ScheduledExecutorService;

.field public static ۟֫:I

.field public static final ۧۧ:Ljava/lang/Object;


# instance fields
.field public ֡:I

.field public ֡֫:Landroid/os/Handler;

.field public ֨:Ll/ۢۤ֫;

.field public ֨֫:J

.field public ֫:J

.field public ֫֫:Ll/᩸۫֫;

.field public final ۖ:Ll/᩸ۤ֫;

.field public ۖ֫:Ll/ܰ۬֫;

.field public ۗ:I

.field public final ۗ֫:Ll/۫ۤ֫;

.field public ۘ:Ll/ܿᩴ֫;

.field public ۘ֫:Z

.field public ۙ:Z

.field public ۙ֫:J

.field public final ۚ:Ll/ۛ۫֫;

.field public ۚ֫:Z

.field public ۛ:Ljava/nio/ByteBuffer;

.field public ۛ֫:F

.field public final ۜ:Ll/ۚ֡֫;

.field public ۜ֫:Ljava/nio/ByteBuffer;

.field public ۟:J

.field public final ۠:Landroid/content/Context;

.field public ۠֫:J

.field public final ۡ:Ll/ܶۤ֫;

.field public ۡ֫:Landroid/os/Looper;

.field public ۢ:Landroid/media/AudioTrack;

.field public ۢ֫:Ll/ۢۤ֫;

.field public final ۤ:Ll/ᩴۤ֫;

.field public ۤ֫:Z

.field public ۧ:Ll/ܺۤ֫;

.field public ۧ֫:Ll/ܺۤ֫;

.field public ۨ:I

.field public final ۨ֫:Ll/ᩴۤ֫;

.field public ۫:Z

.field public final ۫֫:Ll/ۤۤ֫;

.field public ۬:Z

.field public final ۬֫:Ll/᩸֡֫;

.field public ܰ:J

.field public ܰ֫:J

.field public final ܳ:Ll/ܳۤ֫;

.field public ܳ֫:Ll/֨ۤ֫;

.field public final ܶ:I

.field public ܶ֫:Z

.field public final ܺ:Ll/ۤ۫֫;

.field public ܺ֫:Ll/ۖ᩵֫;

.field public ܽ:Ll/ᩳᩴ֫;

.field public final ܽ֫:Ljava/util/ArrayDeque;

.field public ܿ:Ll/᩷۫֫;

.field public ܿ֫:I

.field public ᩳ:Ll/ᩳ۫֫;

.field public ᩳ֫:Z

.field public ᩴ:Ljava/nio/ByteBuffer;

.field public final ᩴ֫:Z

.field public final ᩵:Ll/ܳ۬ܺ;

.field public ᩵֫:Ll/ۢ۫֫;

.field public ᩶:Z

.field public ᩶֫:J

.field public ᩷:I

.field public ᩷֫:Z

.field public ᩸:Landroid/content/Context;

.field public ᩸֫:Z

.field public final ᩹:Z

.field public ᩹֫:Z

.field public ᩺:Z

.field public ᩺֫:J

.field public ᩻:Ll/ۘ֡֫;

.field public ᩻֫:Ll/ۘۤ֫;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 540
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/۠ۤ֫;->ۧۧ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ll/᩷ۤ֫;)V
    .locals 10

    .line 627
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 628
    invoke-static {p1}, Ll/᩷ۤ֫;->ܳ(Ll/᩷ۤ֫;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Ll/۠ۤ֫;->۠:Landroid/content/Context;

    .line 629
    sget-object v1, Ll/ᩳᩴ֫;->ۧ:Ll/ᩳᩴ֫;

    iput-object v1, p0, Ll/۠ۤ֫;->ܽ:Ll/ᩳᩴ֫;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 630
    :cond_0
    invoke-static {p1}, Ll/᩷ۤ֫;->֫(Ll/᩷ۤ֫;)Ll/ᩳ۫֫;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Ll/۠ۤ֫;->ᩳ:Ll/ᩳ۫֫;

    .line 631
    invoke-static {p1}, Ll/᩷ۤ֫;->ܽ(Ll/᩷ۤ֫;)Ll/ۚ֡֫;

    move-result-object v0

    iput-object v0, p0, Ll/۠ۤ֫;->ۜ:Ll/ۚ֡֫;

    const/4 v0, 0x0

    .line 632
    iput-boolean v0, p0, Ll/۠ۤ֫;->᩹:Z

    .line 633
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    iput-boolean v0, p0, Ll/۠ۤ֫;->ᩴ֫:Z

    .line 634
    iput v0, p0, Ll/۠ۤ֫;->ܿ֫:I

    .line 635
    invoke-static {p1}, Ll/᩷ۤ֫;->ᩳ(Ll/᩷ۤ֫;)Ll/ܶۤ֫;

    move-result-object v2

    iput-object v2, p0, Ll/۠ۤ֫;->ۡ:Ll/ܶۤ֫;

    .line 636
    invoke-static {p1}, Ll/᩷ۤ֫;->ۧ(Ll/᩷ۤ֫;)Ll/ܳۤ֫;

    move-result-object v2

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 636
    iput-object v2, p0, Ll/۠ۤ֫;->ܳ:Ll/ܳۤ֫;

    .line 637
    new-instance v2, Ll/ۤ۫֫;

    new-instance v3, Ll/᩵ۤ֫;

    invoke-direct {v3, p0}, Ll/᩵ۤ֫;-><init>(Ll/۠ۤ֫;)V

    invoke-direct {v2, v3}, Ll/ۤ۫֫;-><init>(Ll/۫۫֫;)V

    iput-object v2, p0, Ll/۠ۤ֫;->ܺ:Ll/ۤ۫֫;

    .line 638
    new-instance v2, Ll/ۛ۫֫;

    .line 38
    invoke-direct {v2}, Ll/֨֡֫;-><init>()V

    .line 638
    iput-object v2, p0, Ll/۠ۤ֫;->ۚ:Ll/ۛ۫֫;

    .line 639
    new-instance v3, Ll/ۤۤ֫;

    invoke-direct {v3}, Ll/ۤۤ֫;-><init>()V

    iput-object v3, p0, Ll/۠ۤ֫;->۫֫:Ll/ۤۤ֫;

    .line 640
    new-instance v4, Ll/᩸֡֫;

    .line 40
    invoke-direct {v4}, Ll/֨֡֫;-><init>()V

    .line 640
    iput-object v4, p0, Ll/۠ۤ֫;->۬֫:Ll/᩸֡֫;

    .line 641
    new-instance v4, Ll/۫ۤ֫;

    .line 39
    invoke-direct {v4}, Ll/֨֡֫;-><init>()V

    .line 641
    iput-object v4, p0, Ll/۠ۤ֫;->ۗ֫:Ll/۫ۤ֫;

    .line 643
    invoke-static {v3, v2}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v2

    iput-object v2, p0, Ll/۠ۤ֫;->᩵:Ll/ܳ۬ܺ;

    const/high16 v2, 0x3f800000    # 1.0f

    .line 644
    iput v2, p0, Ll/۠ۤ֫;->ۛ֫:F

    .line 645
    iput v0, p0, Ll/۠ۤ֫;->᩷:I

    .line 646
    new-instance v2, Ll/ܿᩴ֫;

    .line 63
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 646
    iput-object v2, p0, Ll/۠ۤ֫;->ۘ:Ll/ܿᩴ֫;

    .line 647
    new-instance v2, Ll/ܺۤ֫;

    sget-object v9, Ll/ۖ᩵֫;->ᩳ:Ll/ۖ᩵֫;

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    move-object v3, v2

    move-object v4, v9

    invoke-direct/range {v3 .. v8}, Ll/ܺۤ֫;-><init>(Ll/ۖ᩵֫;JJ)V

    iput-object v2, p0, Ll/۠ۤ֫;->ۧ֫:Ll/ܺۤ֫;

    .line 650
    iput-object v9, p0, Ll/۠ۤ֫;->ܺ֫:Ll/ۖ᩵֫;

    .line 651
    iput-boolean v0, p0, Ll/۠ۤ֫;->ۚ֫:Z

    .line 652
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Ll/۠ۤ֫;->ܽ֫:Ljava/util/ArrayDeque;

    .line 653
    new-instance v0, Ll/ᩴۤ֫;

    invoke-direct {v0}, Ll/ᩴۤ֫;-><init>()V

    iput-object v0, p0, Ll/۠ۤ֫;->ۤ:Ll/ᩴۤ֫;

    .line 654
    new-instance v0, Ll/ᩴۤ֫;

    invoke-direct {v0}, Ll/ᩴۤ֫;-><init>()V

    iput-object v0, p0, Ll/۠ۤ֫;->ۨ֫:Ll/ᩴۤ֫;

    .line 656
    invoke-static {p1}, Ll/᩷ۤ֫;->ܿ(Ll/᩷ۤ֫;)Ll/᩸ۤ֫;

    move-result-object v0

    iput-object v0, p0, Ll/۠ۤ֫;->ۖ:Ll/᩸ۤ֫;

    const/16 v0, 0x22

    const/4 v2, -0x1

    if-lt v1, v0, :cond_1

    .line 660
    invoke-static {p1}, Ll/᩷ۤ֫;->ܳ(Ll/᩷ۤ֫;)Landroid/content/Context;

    move-result-object p1

    .line 2092
    invoke-virtual {p1}, Landroid/content/Context;->getDeviceId()I

    move-result p1

    if-eqz p1, :cond_1

    if-eq p1, v2, :cond_1

    move v2, p1

    .line 660
    :cond_1
    iput v2, p0, Ll/۠ۤ֫;->ܶ:I

    const/4 p1, 0x1

    .line 661
    iput-boolean p1, p0, Ll/۠ۤ֫;->᩶:Z

    return-void
.end method

.method private ֡()V
    .locals 5
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
        value = {
            "audioCapabilities"
        }
    .end annotation

    .line 1891
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    .line 1892
    iget-object v1, p0, Ll/۠ۤ֫;->ܿ:Ll/᩷۫֫;

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/۠ۤ֫;->ۡ֫:Landroid/os/Looper;

    if-ne v1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "DefaultAudioSink accessed on multiple threads: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Ll/۠ۤ֫;->ۡ֫:Landroid/os/Looper;

    const-string v4, "null"

    if-nez v3, :cond_2

    move-object v3, v4

    goto :goto_2

    .line 2472
    :cond_2
    invoke-virtual {v3}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v3

    .line 1895
    :goto_2
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " and "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v0, :cond_3

    goto :goto_3

    .line 2472
    :cond_3
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v4

    .line 1897
    :goto_3
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 1892
    invoke-static {v2, v1}, Ll/᩺֡֫;->ۧ(Ljava/lang/String;Z)V

    .line 1898
    iget-object v1, p0, Ll/۠ۤ֫;->ܿ:Ll/᩷۫֫;

    if-nez v1, :cond_4

    iget-object v1, p0, Ll/۠ۤ֫;->۠:Landroid/content/Context;

    if-eqz v1, :cond_4

    .line 1901
    iput-object v0, p0, Ll/۠ۤ֫;->ۡ֫:Landroid/os/Looper;

    .line 1902
    new-instance v0, Ll/᩷۫֫;

    new-instance v2, Lcom/alipay/sdk/app/H5PayActivity$$ExternalSyntheticLambda0;

    invoke-direct {v2, p0}, Lcom/alipay/sdk/app/H5PayActivity$$ExternalSyntheticLambda0;-><init>(Ljava/lang/Object;)V

    iget-object v3, p0, Ll/۠ۤ֫;->ܽ:Ll/ᩳᩴ֫;

    iget-object v4, p0, Ll/۠ۤ֫;->᩵֫:Ll/ۢ۫֫;

    invoke-direct {v0, v1, v2, v3, v4}, Ll/᩷۫֫;-><init>(Landroid/content/Context;Lcom/alipay/sdk/app/H5PayActivity$$ExternalSyntheticLambda0;Ll/ᩳᩴ֫;Ll/ۢ۫֫;)V

    iput-object v0, p0, Ll/۠ۤ֫;->ܿ:Ll/᩷۫֫;

    .line 1905
    invoke-virtual {v0}, Ll/᩷۫֫;->֫()Ll/ᩳ۫֫;

    move-result-object v0

    iput-object v0, p0, Ll/۠ۤ֫;->ᩳ:Ll/ᩳ۫֫;

    .line 1907
    :cond_4
    iget-object v0, p0, Ll/۠ۤ֫;->ᩳ:Ll/ᩳ۫֫;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method private ֨()V
    .locals 3

    .line 1719
    invoke-direct {p0}, Ll/۠ۤ֫;->᩵()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1720
    new-instance v0, Landroid/media/PlaybackParams;

    invoke-direct {v0}, Landroid/media/PlaybackParams;-><init>()V

    .line 1722
    invoke-virtual {v0}, Landroid/media/PlaybackParams;->allowDefaults()Landroid/media/PlaybackParams;

    move-result-object v0

    iget-object v1, p0, Ll/۠ۤ֫;->ܺ֫:Ll/ۖ᩵֫;

    iget v1, v1, Ll/ۖ᩵֫;->ܽ:F

    .line 1723
    invoke-virtual {v0, v1}, Landroid/media/PlaybackParams;->setSpeed(F)Landroid/media/PlaybackParams;

    move-result-object v0

    iget-object v1, p0, Ll/۠ۤ֫;->ܺ֫:Ll/ۖ᩵֫;

    iget v1, v1, Ll/ۖ᩵֫;->֫:F

    .line 1724
    invoke-virtual {v0, v1}, Landroid/media/PlaybackParams;->setPitch(F)Landroid/media/PlaybackParams;

    move-result-object v0

    const/4 v1, 0x2

    .line 1725
    invoke-virtual {v0, v1}, Landroid/media/PlaybackParams;->setAudioFallbackMode(I)Landroid/media/PlaybackParams;

    move-result-object v0

    .line 1727
    :try_start_0
    iget-object v1, p0, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    invoke-virtual {v1, v0}, Landroid/media/AudioTrack;->setPlaybackParams(Landroid/media/PlaybackParams;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to set playback params"

    .line 1729
    invoke-static {v1, v0}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1732
    :goto_0
    new-instance v0, Ll/ۖ᩵֫;

    iget-object v1, p0, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    .line 1734
    invoke-virtual {v1}, Landroid/media/AudioTrack;->getPlaybackParams()Landroid/media/PlaybackParams;

    move-result-object v1

    invoke-virtual {v1}, Landroid/media/PlaybackParams;->getSpeed()F

    move-result v1

    iget-object v2, p0, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    invoke-virtual {v2}, Landroid/media/AudioTrack;->getPlaybackParams()Landroid/media/PlaybackParams;

    move-result-object v2

    invoke-virtual {v2}, Landroid/media/PlaybackParams;->getPitch()F

    move-result v2

    invoke-direct {v0, v1, v2}, Ll/ۖ᩵֫;-><init>(FF)V

    iput-object v0, p0, Ll/۠ۤ֫;->ܺ֫:Ll/ۖ᩵֫;

    .line 1735
    iget-object v1, p0, Ll/۠ۤ֫;->ܺ:Ll/ۤ۫֫;

    iget v0, v0, Ll/ۖ᩵֫;->ܽ:F

    invoke-virtual {v1, v0}, Ll/ۤ۫֫;->֫(F)V

    :cond_0
    return-void
.end method

.method private ֫(Ll/֨۫֫;Ll/ᩳᩴ֫;ILl/۠ᩴ֫;Landroid/content/Context;)Landroid/media/AudioTrack;
    .locals 9

    .line 1171
    :try_start_0
    iget-object v0, p0, Ll/۠ۤ֫;->ۖ:Ll/᩸ۤ֫;

    .line 1172
    invoke-virtual {v0, p1, p2, p3, p5}, Ll/᩸ۤ֫;->֫(Ll/֨۫֫;Ll/ᩳᩴ֫;ILandroid/content/Context;)Landroid/media/AudioTrack;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 1186
    invoke-virtual {p2}, Landroid/media/AudioTrack;->getState()I

    move-result v1

    const/4 p3, 0x1

    if-ne v1, p3, :cond_0

    return-object p2

    .line 1189
    :cond_0
    :try_start_1
    invoke-virtual {p2}, Landroid/media/AudioTrack;->release()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 1194
    :catch_0
    new-instance p2, Ll/ܶ۫֫;

    iget v2, p1, Ll/֨۫֫;->ܿ:I

    iget v3, p1, Ll/֨۫֫;->ۧ:I

    iget v4, p1, Ll/֨۫֫;->ܽ:I

    iget v5, p1, Ll/֨۫֫;->֫:I

    iget-boolean v7, p1, Ll/֨۫֫;->ᩳ:Z

    const/4 v8, 0x0

    move-object v0, p2

    move-object v6, p4

    invoke-direct/range {v0 .. v8}, Ll/ܶ۫֫;-><init>(IIIIILl/۠ᩴ֫;ZLjava/lang/RuntimeException;)V

    throw p2

    :catch_1
    move-exception p2

    goto :goto_0

    :catch_2
    move-exception p2

    :goto_0
    move-object v8, p2

    .line 1175
    new-instance p2, Ll/ܶ۫֫;

    iget v2, p1, Ll/֨۫֫;->ܿ:I

    iget v3, p1, Ll/֨۫֫;->ۧ:I

    iget v4, p1, Ll/֨۫֫;->ܽ:I

    iget v5, p1, Ll/֨۫֫;->֫:I

    iget-boolean v7, p1, Ll/֨۫֫;->ᩳ:Z

    const/4 v1, 0x0

    move-object v0, p2

    move-object v6, p4

    invoke-direct/range {v0 .. v8}, Ll/ܶ۫֫;-><init>(IIIIILl/۠ᩴ֫;ZLjava/lang/RuntimeException;)V

    throw p2
.end method

.method private ֫(Ll/ۢۤ֫;)Landroid/media/AudioTrack;
    .locals 8

    .line 1135
    :try_start_0
    iget v0, p0, Ll/۠ۤ֫;->᩷:I

    .line 1136
    iget v1, p0, Ll/۠ۤ֫;->ܶ:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    iget-object v2, p0, Ll/۠ۤ֫;->۠:Landroid/content/Context;

    if-eqz v2, :cond_1

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x22

    if-lt v3, v4, :cond_1

    .line 1137
    iget-object v0, p0, Ll/۠ۤ֫;->᩸:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 1138
    invoke-virtual {v2, v1}, Landroid/content/Context;->createDeviceContext(I)Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Ll/۠ۤ֫;->᩸:Landroid/content/Context;

    .line 1140
    :cond_0
    iget-object v0, p0, Ll/۠ۤ֫;->᩸:Landroid/content/Context;

    const/4 v1, 0x0

    move-object v7, v0

    const/4 v5, 0x0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    move v5, v0

    move-object v7, v1

    .line 1145
    :goto_0
    invoke-virtual {p1}, Ll/ۢۤ֫;->֫()Ll/֨۫֫;

    move-result-object v3

    iget-object v4, p0, Ll/۠ۤ֫;->ܽ:Ll/ᩳᩴ֫;

    iget-object v6, p1, Ll/ۢۤ֫;->ܿ:Ll/۠ᩴ֫;

    move-object v2, p0

    .line 1144
    invoke-direct/range {v2 .. v7}, Ll/۠ۤ֫;->֫(Ll/֨۫֫;Ll/ᩳᩴ֫;ILl/۠ᩴ֫;Landroid/content/Context;)Landroid/media/AudioTrack;

    move-result-object p1
    :try_end_0
    .catch Ll/ܶ۫֫; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 1155
    :goto_1
    iget-object v0, p0, Ll/۠ۤ֫;->֫֫:Ll/᩸۫֫;

    if-eqz v0, :cond_2

    .line 1156
    invoke-interface {v0, p1}, Ll/᩸۫֫;->֫(Ljava/lang/Exception;)V

    .line 1158
    :cond_2
    throw p1
.end method

.method private ֫(J)V
    .locals 15

    move-object v0, p0

    .line 1758
    invoke-direct {p0}, Ll/۠ۤ֫;->۠()Z

    move-result v1

    const/4 v2, 0x4

    const/high16 v3, 0x60000000

    const/16 v4, 0x16

    const/high16 v5, 0x50000000

    const/16 v6, 0x15

    iget-boolean v7, v0, Ll/۠ۤ֫;->᩹:Z

    iget-object v8, v0, Ll/۠ۤ֫;->ۜ:Ll/ۚ֡֫;

    if-nez v1, :cond_2

    .line 1794
    iget-boolean v1, v0, Ll/۠ۤ֫;->ۤ֫:Z

    if-nez v1, :cond_1

    iget-object v1, v0, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    iget v9, v1, Ll/ۢۤ֫;->᩷:I

    if-nez v9, :cond_1

    iget-object v1, v1, Ll/ۢۤ֫;->ܿ:Ll/۠ᩴ֫;

    iget v1, v1, Ll/۠ᩴ֫;->ۛ:I

    if-eqz v7, :cond_0

    .line 1808
    sget-object v9, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    if-eq v1, v6, :cond_1

    if-eq v1, v5, :cond_1

    if-eq v1, v4, :cond_1

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    .line 1761
    :cond_0
    iget-object v1, v0, Ll/۠ۤ֫;->ܺ֫:Ll/ۖ᩵֫;

    move-object v9, v8

    check-cast v9, Ll/ۡۤ֫;

    invoke-virtual {v9, v1}, Ll/ۡۤ֫;->֫(Ll/ۖ᩵֫;)Ll/ۖ᩵֫;

    goto :goto_1

    .line 1762
    :cond_1
    :goto_0
    sget-object v1, Ll/ۖ᩵֫;->ᩳ:Ll/ۖ᩵֫;

    :goto_1
    iput-object v1, v0, Ll/۠ۤ֫;->ܺ֫:Ll/ۖ᩵֫;

    goto :goto_2

    .line 1765
    :cond_2
    sget-object v1, Ll/ۖ᩵֫;->ᩳ:Ll/ۖ᩵֫;

    :goto_2
    move-object v10, v1

    .line 1794
    iget-boolean v1, v0, Ll/۠ۤ֫;->ۤ֫:Z

    if-nez v1, :cond_4

    iget-object v1, v0, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    iget v9, v1, Ll/ۢۤ֫;->᩷:I

    if-nez v9, :cond_4

    iget-object v1, v1, Ll/ۢۤ֫;->ܿ:Ll/۠ᩴ֫;

    iget v1, v1, Ll/۠ᩴ֫;->ۛ:I

    if-eqz v7, :cond_3

    .line 1808
    sget-object v7, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    if-eq v1, v6, :cond_4

    if-eq v1, v5, :cond_4

    if-eq v1, v4, :cond_4

    if-eq v1, v3, :cond_4

    if-ne v1, v2, :cond_3

    goto :goto_3

    .line 1769
    :cond_3
    iget-boolean v1, v0, Ll/۠ۤ֫;->ۚ֫:Z

    check-cast v8, Ll/ۡۤ֫;

    invoke-virtual {v8, v1}, Ll/ۡۤ֫;->֫(Z)Z

    goto :goto_4

    :cond_4
    :goto_3
    const/4 v1, 0x0

    .line 1770
    :goto_4
    iput-boolean v1, v0, Ll/۠ۤ֫;->ۚ֫:Z

    .line 1771
    new-instance v1, Ll/ܺۤ֫;

    const-wide/16 v2, 0x0

    move-wide/from16 v4, p1

    .line 1774
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v11

    iget-object v2, v0, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    .line 1775
    invoke-direct {p0}, Ll/۠ۤ֫;->ۘ()J

    move-result-wide v3

    .line 2374
    iget v2, v2, Ll/ۢۤ֫;->ۡ:I

    invoke-static {v2, v3, v4}, Ll/ۘ֨֫;->֫(IJ)J

    move-result-wide v13

    move-object v9, v1

    .line 1775
    invoke-direct/range {v9 .. v14}, Ll/ܺۤ֫;-><init>(Ll/ۖ᩵֫;JJ)V

    .line 1771
    iget-object v2, v0, Ll/۠ۤ֫;->ܽ֫:Ljava/util/ArrayDeque;

    invoke-virtual {v2, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 873
    iget-object v1, v0, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    iget-object v1, v1, Ll/ۢۤ֫;->֫:Ll/ۘ֡֫;

    iput-object v1, v0, Ll/۠ۤ֫;->᩻:Ll/ۘ֡֫;

    .line 874
    invoke-virtual {v1}, Ll/ۘ֡֫;->֫()V

    .line 1777
    iget-object v1, v0, Ll/۠ۤ֫;->֫֫:Ll/᩸۫֫;

    if-eqz v1, :cond_5

    .line 1778
    iget-boolean v2, v0, Ll/۠ۤ֫;->ۚ֫:Z

    invoke-interface {v1, v2}, Ll/᩸۫֫;->֫(Z)V

    :cond_5
    return-void
.end method

.method public static synthetic ֫(Landroid/media/AudioTrack;Ll/᩸۫֫;Landroid/os/Handler;Ll/֨۫֫;)V
    .locals 3

    const/4 v1, 0x0

    .line 2060
    :try_start_0
    invoke-virtual {p0}, Landroid/media/AudioTrack;->flush()V

    .line 2061
    invoke-virtual {p0}, Landroid/media/AudioTrack;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz p1, :cond_0

    .line 2064
    invoke-virtual {p2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object p0

    invoke-virtual {p0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Thread;->isAlive()Z

    move-result p0

    if-eqz p0, :cond_0

    .line 2065
    new-instance p0, Ll/ܶ֨ۡ;

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1, p3}, Ll/ܶ֨ۡ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p2, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 2068
    :cond_0
    sget-object p0, Ll/۠ۤ֫;->ۧۧ:Ljava/lang/Object;

    move-object v0, p0

    monitor-enter v0

    .line 2069
    :try_start_1
    sget p0, Ll/۠ۤ֫;->۟֫:I

    add-int/lit8 p0, p0, -0x1

    sput p0, Ll/۠ۤ֫;->۟֫:I

    if-nez p0, :cond_1

    .line 2071
    sget-object p0, Ll/۠ۤ֫;->֫ۧ:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 2072
    sput-object v1, Ll/۠ۤ֫;->֫ۧ:Ljava/util/concurrent/ScheduledExecutorService;

    .line 2074
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    :catchall_1
    move-exception p0

    if-eqz p1, :cond_2

    .line 2064
    invoke-virtual {p2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2065
    new-instance v0, Ll/ܶ֨ۡ;

    const/4 v2, 0x1

    invoke-direct {v0, v2, p1, p3}, Ll/ܶ֨ۡ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 2068
    :cond_2
    sget-object p1, Ll/۠ۤ֫;->ۧۧ:Ljava/lang/Object;

    move-object v0, p1

    monitor-enter v0

    .line 2069
    :try_start_2
    sget p1, Ll/۠ۤ֫;->۟֫:I

    add-int/lit8 p1, p1, -0x1

    sput p1, Ll/۠ۤ֫;->۟֫:I

    if-nez p1, :cond_3

    .line 2071
    sget-object p1, Ll/۠ۤ֫;->֫ۧ:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 2072
    sput-object v1, Ll/۠ۤ֫;->֫ۧ:Ljava/util/concurrent/ScheduledExecutorService;

    .line 2074
    :cond_3
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 2075
    throw p0

    :catchall_2
    move-exception p0

    .line 2074
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw p0
.end method

.method private ֫(Ljava/nio/ByteBuffer;)V
    .locals 16

    move-object/from16 v0, p0

    .line 1289
    iget-object v1, v0, Ll/۠ۤ֫;->ۜ֫:Ljava/nio/ByteBuffer;

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 1290
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v1

    if-nez v1, :cond_1

    return-void

    .line 2024
    :cond_1
    iget-object v1, v0, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    iget v1, v1, Ll/ۢۤ֫;->᩷:I

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    const-wide/16 v1, 0x14

    .line 2027
    invoke-static {v1, v2}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v3

    .line 2028
    iget-object v1, v0, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    iget v1, v1, Ll/ۢۤ֫;->ۡ:I

    int-to-long v5, v1

    const-wide/32 v7, 0xf4240

    .line 1659
    sget-object v9, Ljava/math/RoundingMode;->UP:Ljava/math/RoundingMode;

    invoke-static/range {v3 .. v9}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v1

    long-to-int v2, v1

    .line 2030
    invoke-direct/range {p0 .. p0}, Ll/۠ۤ֫;->ۘ()J

    move-result-wide v3

    int-to-long v5, v2

    cmp-long v1, v3, v5

    if-ltz v1, :cond_3

    :goto_1
    move-object/from16 v3, p1

    goto/16 :goto_8

    .line 2034
    :cond_3
    iget-object v1, v0, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    iget v7, v1, Ll/ۢۤ֫;->ۜ:I

    iget v1, v1, Ll/ۢۤ֫;->ۢ:I

    long-to-int v4, v3

    .line 47
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->remaining()I

    move-result v3

    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v8

    invoke-virtual {v3, v8}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v3

    .line 49
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->position()I

    move-result v8

    .line 50
    :cond_4
    :goto_2
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v9

    if-eqz v9, :cond_17

    if-ge v4, v2, :cond_17

    const/high16 v9, 0x50000000

    const/high16 v10, 0x10000000

    const/16 v11, 0x16

    const/16 v12, 0x15

    const/4 v14, 0x4

    const/4 v13, 0x3

    const/4 v15, 0x2

    if-eq v7, v15, :cond_d

    if-eq v7, v13, :cond_c

    if-eq v7, v14, :cond_a

    if-eq v7, v12, :cond_9

    if-eq v7, v11, :cond_8

    if-eq v7, v10, :cond_7

    if-eq v7, v9, :cond_6

    const/high16 v9, 0x60000000

    if-ne v7, v9, :cond_5

    .line 93
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v9

    and-int/lit16 v9, v9, 0xff

    shl-int/lit8 v9, v9, 0x18

    .line 94
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v10

    and-int/lit16 v10, v10, 0xff

    shl-int/lit8 v10, v10, 0x10

    or-int/2addr v9, v10

    .line 95
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v10

    and-int/lit16 v10, v10, 0xff

    shl-int/lit8 v10, v10, 0x8

    or-int/2addr v9, v10

    .line 96
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v10

    and-int/lit16 v10, v10, 0xff

    goto/16 :goto_5

    .line 105
    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    .line 84
    :cond_6
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v9

    and-int/lit16 v9, v9, 0xff

    shl-int/lit8 v9, v9, 0x18

    .line 85
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v10

    and-int/lit16 v10, v10, 0xff

    shl-int/lit8 v10, v10, 0x10

    or-int/2addr v9, v10

    .line 86
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v10

    and-int/lit16 v10, v10, 0xff

    shl-int/lit8 v10, v10, 0x8

    goto/16 :goto_5

    .line 78
    :cond_7
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v9

    and-int/lit16 v9, v9, 0xff

    shl-int/lit8 v9, v9, 0x18

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v10

    and-int/lit16 v10, v10, 0xff

    shl-int/lit8 v10, v10, 0x10

    goto :goto_5

    .line 88
    :cond_8
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v9

    and-int/lit16 v9, v9, 0xff

    .line 89
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v10

    and-int/lit16 v10, v10, 0xff

    shl-int/lit8 v10, v10, 0x8

    or-int/2addr v9, v10

    .line 90
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v10

    and-int/lit16 v10, v10, 0xff

    shl-int/lit8 v10, v10, 0x10

    or-int/2addr v9, v10

    .line 91
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v10

    goto :goto_4

    .line 80
    :cond_9
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v9

    and-int/lit16 v9, v9, 0xff

    shl-int/lit8 v9, v9, 0x8

    .line 81
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v10

    and-int/lit16 v10, v10, 0xff

    shl-int/lit8 v10, v10, 0x10

    or-int/2addr v9, v10

    .line 82
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v10

    goto :goto_4

    .line 98
    :cond_a
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->getFloat()F

    move-result v9

    const/high16 v10, -0x40800000    # -1.0f

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v9, v10, v11}, Ll/ۘ֨֫;->֫(FFF)F

    move-result v9

    const/4 v10, 0x0

    cmpg-float v10, v9, v10

    if-gez v10, :cond_b

    neg-float v9, v9

    const/high16 v10, -0x31000000

    goto :goto_3

    :cond_b
    const/high16 v10, 0x4f000000

    :goto_3
    mul-float v9, v9, v10

    float-to-int v9, v9

    goto :goto_6

    .line 74
    :cond_c
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v9

    and-int/lit16 v9, v9, 0xff

    shl-int/lit8 v9, v9, 0x18

    goto :goto_6

    .line 76
    :cond_d
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v9

    and-int/lit16 v9, v9, 0xff

    shl-int/lit8 v9, v9, 0x10

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v10

    :goto_4
    and-int/lit16 v10, v10, 0xff

    shl-int/lit8 v10, v10, 0x18

    :goto_5
    or-int/2addr v9, v10

    :goto_6
    int-to-long v9, v9

    int-to-long v13, v4

    mul-long v9, v9, v13

    .line 52
    div-long/2addr v9, v5

    long-to-int v10, v9

    if-eq v7, v15, :cond_16

    const/4 v9, 0x3

    if-eq v7, v9, :cond_15

    const/4 v9, 0x4

    if-eq v7, v9, :cond_13

    if-eq v7, v12, :cond_12

    const/16 v9, 0x16

    if-eq v7, v9, :cond_11

    const/high16 v9, 0x10000000

    if-eq v7, v9, :cond_10

    const/high16 v9, 0x50000000

    if-eq v7, v9, :cond_f

    const/high16 v9, 0x60000000

    if-ne v7, v9, :cond_e

    shr-int/lit8 v9, v10, 0x18

    int-to-byte v9, v9

    .line 138
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    shr-int/lit8 v9, v10, 0x10

    int-to-byte v9, v9

    .line 139
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    shr-int/lit8 v9, v10, 0x8

    int-to-byte v9, v9

    .line 140
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    int-to-byte v9, v10

    .line 141
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto/16 :goto_7

    .line 160
    :cond_e
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :cond_f
    shr-int/lit8 v9, v10, 0x18

    int-to-byte v9, v9

    .line 144
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    shr-int/lit8 v9, v10, 0x10

    int-to-byte v9, v9

    .line 145
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    shr-int/lit8 v9, v10, 0x8

    int-to-byte v9, v9

    .line 146
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_7

    :cond_10
    shr-int/lit8 v9, v10, 0x18

    int-to-byte v9, v9

    .line 149
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    shr-int/lit8 v9, v10, 0x10

    int-to-byte v9, v9

    .line 150
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_7

    :cond_11
    int-to-byte v9, v10

    .line 120
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    shr-int/lit8 v9, v10, 0x8

    int-to-byte v9, v9

    .line 121
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    shr-int/lit8 v9, v10, 0x10

    int-to-byte v9, v9

    .line 122
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    shr-int/lit8 v9, v10, 0x18

    int-to-byte v9, v9

    .line 123
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_7

    :cond_12
    shr-int/lit8 v9, v10, 0x8

    int-to-byte v9, v9

    .line 126
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    shr-int/lit8 v9, v10, 0x10

    int-to-byte v9, v9

    .line 127
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    shr-int/lit8 v9, v10, 0x18

    int-to-byte v9, v9

    .line 128
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_7

    :cond_13
    if-gez v10, :cond_14

    int-to-float v9, v10

    neg-float v9, v9

    const/high16 v10, -0x31000000

    div-float/2addr v9, v10

    .line 154
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    goto :goto_7

    :cond_14
    int-to-float v9, v10

    const/high16 v10, 0x4f000000

    div-float/2addr v9, v10

    .line 156
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    goto :goto_7

    :cond_15
    shr-int/lit8 v9, v10, 0x18

    int-to-byte v9, v9

    .line 135
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_7

    :cond_16
    shr-int/lit8 v9, v10, 0x10

    int-to-byte v9, v9

    .line 131
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    shr-int/lit8 v9, v10, 0x18

    int-to-byte v9, v9

    .line 132
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 54
    :goto_7
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->position()I

    move-result v9

    add-int v10, v8, v1

    if-ne v9, v10, :cond_4

    add-int/lit8 v4, v4, 0x1

    .line 56
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->position()I

    move-result v8

    goto/16 :goto_2

    :cond_17
    move-object/from16 v1, p1

    .line 59
    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 60
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 1293
    :goto_8
    iput-object v3, v0, Ll/۠ۤ֫;->ۜ֫:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public static ֫(Ll/۠ۤ֫;)V
    .locals 5

    .line 2458
    iget-wide v0, p0, Ll/۠ۤ֫;->֫:J

    const-wide/32 v2, 0x493e0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    .line 2460
    iget-object v0, p0, Ll/۠ۤ֫;->֫֫:Ll/᩸۫֫;

    invoke-interface {v0}, Ll/᩸۫֫;->֫()V

    const-wide/16 v0, 0x0

    .line 2461
    iput-wide v0, p0, Ll/۠ۤ֫;->֫:J

    :cond_0
    return-void
.end method

.method public static ֫(Landroid/media/AudioTrack;)Z
    .locals 2

    .line 1911
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/media/AudioTrack;->isOffloadedPlayback()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private ۖ()Z
    .locals 3

    .line 1269
    iget-object v0, p0, Ll/۠ۤ֫;->᩻:Ll/ۘ֡֫;

    invoke-virtual {v0}, Ll/ۘ֡֫;->ᩳ()Z

    move-result v0

    const-wide/high16 v1, -0x8000000000000000L

    if-nez v0, :cond_0

    .line 1270
    invoke-direct {p0, v1, v2}, Ll/۠ۤ֫;->ۧ(J)V

    .line 1271
    iget-object v0, p0, Ll/۠ۤ֫;->ۜ֫:Ljava/nio/ByteBuffer;

    if-nez v0, :cond_2

    goto :goto_0

    .line 1274
    :cond_0
    iget-object v0, p0, Ll/۠ۤ֫;->᩻:Ll/ۘ֡֫;

    invoke-virtual {v0}, Ll/ۘ֡֫;->ܿ()V

    .line 1275
    invoke-direct {p0, v1, v2}, Ll/۠ۤ֫;->ܽ(J)V

    .line 1276
    iget-object v0, p0, Ll/۠ۤ֫;->᩻:Ll/ۘ֡֫;

    invoke-virtual {v0}, Ll/ۘ֡֫;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/۠ۤ֫;->ۜ֫:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_1

    .line 1277
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private ۘ()J
    .locals 7

    .line 1884
    iget-object v0, p0, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    iget v1, v0, Ll/ۢۤ֫;->᩷:I

    if-nez v1, :cond_0

    .line 1885
    iget-wide v1, p0, Ll/۠ۤ֫;->ܰ֫:J

    iget v0, v0, Ll/ۢۤ֫;->ۢ:I

    int-to-long v3, v0

    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    add-long/2addr v1, v3

    const-wide/16 v5, 0x1

    sub-long/2addr v1, v5

    .line 1150
    div-long/2addr v1, v3

    return-wide v1

    .line 1886
    :cond_0
    iget-wide v0, p0, Ll/۠ۤ֫;->᩺֫:J

    return-wide v0
.end method

.method private ۚ()V
    .locals 3

    .line 2010
    iget-boolean v0, p0, Ll/۠ۤ֫;->᩹֫:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 2011
    iput-boolean v0, p0, Ll/۠ۤ֫;->᩹֫:Z

    .line 2012
    iget-object v0, p0, Ll/۠ۤ֫;->ܺ:Ll/ۤ۫֫;

    invoke-direct {p0}, Ll/۠ۤ֫;->ۘ()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ۤ۫֫;->֫(J)V

    .line 2013
    iget-object v0, p0, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    invoke-static {v0}, Ll/۠ۤ֫;->֫(Landroid/media/AudioTrack;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2016
    iput-boolean v1, p0, Ll/۠ۤ֫;->۫:Z

    .line 2018
    :cond_0
    iget-object v0, p0, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V

    .line 2019
    iput v1, p0, Ll/۠ۤ֫;->֡:I

    :cond_1
    return-void
.end method

.method public static bridge synthetic ۜ(Ll/۠ۤ֫;)J
    .locals 2

    .line 0
    invoke-direct {p0}, Ll/۠ۤ֫;->ۘ()J

    move-result-wide v0

    return-wide v0
.end method

.method private ۠()Z
    .locals 2

    .line 1800
    iget-object v0, p0, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    if-eqz v0, :cond_0

    iget-boolean v0, v0, Ll/ۢۤ֫;->ܽ:Z

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static bridge synthetic ۧ(Ll/۠ۤ֫;)Landroid/media/AudioTrack;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    return-object p0
.end method

.method private ۧ(J)V
    .locals 10

    .line 1306
    iget-object v0, p0, Ll/۠ۤ֫;->ۜ֫:Ljava/nio/ByteBuffer;

    if-nez v0, :cond_0

    goto/16 :goto_5

    .line 1309
    :cond_0
    iget-object v0, p0, Ll/۠ۤ֫;->ۨ֫:Ll/ᩴۤ֫;

    invoke-virtual {v0}, Ll/ᩴۤ֫;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_1

    goto/16 :goto_5

    .line 1312
    :cond_1
    iget-object v1, p0, Ll/۠ۤ֫;->ۜ֫:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    .line 1314
    iget-boolean v2, p0, Ll/۠ۤ֫;->ۤ֫:Z

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eqz v2, :cond_a

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, p1, v2

    if-eqz v4, :cond_2

    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    .line 1315
    :goto_0
    invoke-static {v2}, Ll/᩺֡֫;->ۧ(Z)V

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, p1, v2

    if-nez v4, :cond_3

    .line 1320
    iget-wide p1, p0, Ll/۠ۤ֫;->۟:J

    goto :goto_1

    .line 1322
    :cond_3
    iput-wide p1, p0, Ll/۠ۤ֫;->۟:J

    .line 1324
    :goto_1
    iget-object v2, p0, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    iget-object v3, p0, Ll/۠ۤ֫;->ۜ֫:Ljava/nio/ByteBuffer;

    .line 1972
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1a

    const-wide/16 v6, 0x3e8

    if-lt v4, v5, :cond_4

    const/4 v5, 0x1

    mul-long v6, v6, p1

    move v4, v1

    .line 1974
    invoke-virtual/range {v2 .. v7}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;IIJ)I

    move-result p1

    goto :goto_2

    .line 1977
    :cond_4
    iget-object v4, p0, Ll/۠ۤ֫;->ᩴ:Ljava/nio/ByteBuffer;

    if-nez v4, :cond_5

    const/16 v4, 0x10

    .line 1978
    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v4

    iput-object v4, p0, Ll/۠ۤ֫;->ᩴ:Ljava/nio/ByteBuffer;

    .line 1979
    sget-object v5, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 1980
    iget-object v4, p0, Ll/۠ۤ֫;->ᩴ:Ljava/nio/ByteBuffer;

    const v5, 0x55550001

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 1982
    :cond_5
    iget v4, p0, Ll/۠ۤ֫;->֡:I

    if-nez v4, :cond_6

    .line 1983
    iget-object v4, p0, Ll/۠ۤ֫;->ᩴ:Ljava/nio/ByteBuffer;

    const/4 v5, 0x4

    invoke-virtual {v4, v5, v1}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 1984
    iget-object v4, p0, Ll/۠ۤ֫;->ᩴ:Ljava/nio/ByteBuffer;

    const/16 v5, 0x8

    mul-long p1, p1, v6

    invoke-virtual {v4, v5, p1, p2}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 1985
    iget-object p1, p0, Ll/۠ۤ֫;->ᩴ:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v8}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 1986
    iput v1, p0, Ll/۠ۤ֫;->֡:I

    .line 1988
    :cond_6
    iget-object p1, p0, Ll/۠ۤ֫;->ᩴ:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result p1

    if-lez p1, :cond_8

    .line 1990
    iget-object p2, p0, Ll/۠ۤ֫;->ᩴ:Ljava/nio/ByteBuffer;

    .line 1991
    invoke-virtual {v2, p2, p1, v9}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    move-result p2

    if-gez p2, :cond_7

    .line 1993
    iput v8, p0, Ll/۠ۤ֫;->֡:I

    move p1, p2

    goto :goto_2

    :cond_7
    if-ge p2, p1, :cond_8

    const/4 p1, 0x0

    goto :goto_2

    .line 1967
    :cond_8
    invoke-virtual {v2, v3, v1, v9}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    move-result p1

    if-gez p1, :cond_9

    .line 2002
    iput v8, p0, Ll/۠ۤ֫;->֡:I

    goto :goto_2

    .line 2005
    :cond_9
    iget p2, p0, Ll/۠ۤ֫;->֡:I

    sub-int/2addr p2, p1

    iput p2, p0, Ll/۠ۤ֫;->֡:I

    goto :goto_2

    .line 1328
    :cond_a
    iget-object p1, p0, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    iget-object p2, p0, Ll/۠ۤ֫;->ۜ֫:Ljava/nio/ByteBuffer;

    .line 1967
    invoke-virtual {p1, p2, v1, v9}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    move-result p1

    .line 1331
    :goto_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iput-wide v2, p0, Ll/۠ۤ֫;->ܰ:J

    const-wide/16 v2, 0x0

    if-gez p1, :cond_13

    .line 1420
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt p2, v1, :cond_b

    const/4 p2, -0x6

    if-eq p1, p2, :cond_c

    :cond_b
    const/16 p2, -0x20

    if-ne p1, p2, :cond_f

    .line 1341
    :cond_c
    invoke-direct {p0}, Ll/۠ۤ֫;->ۘ()J

    move-result-wide v4

    cmp-long p2, v4, v2

    if-lez p2, :cond_d

    goto :goto_3

    .line 1343
    :cond_d
    iget-object p2, p0, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    invoke-static {p2}, Ll/۠ۤ֫;->֫(Landroid/media/AudioTrack;)Z

    move-result p2

    if-eqz p2, :cond_f

    .line 1410
    iget-object p2, p0, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    .line 2388
    iget p2, p2, Ll/ۢۤ֫;->᩷:I

    if-ne p2, v9, :cond_e

    .line 1416
    iput-boolean v9, p0, Ll/۠ۤ֫;->ᩳ֫:Z

    :cond_e
    :goto_3
    const/4 v8, 0x1

    .line 1349
    :cond_f
    new-instance p2, Ll/᩶۫֫;

    iget-object v1, p0, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    iget-object v1, v1, Ll/ۢۤ֫;->ܿ:Ll/۠ᩴ֫;

    invoke-direct {p2, p1, v1, v8}, Ll/᩶۫֫;-><init>(ILl/۠ᩴ֫;Z)V

    .line 1350
    iget-object p1, p0, Ll/۠ۤ֫;->֫֫:Ll/᩸۫֫;

    if-eqz p1, :cond_10

    .line 1351
    invoke-interface {p1, p2}, Ll/᩸۫֫;->֫(Ljava/lang/Exception;)V

    .line 1353
    :cond_10
    iget-boolean p1, p2, Ll/᩶۫֫;->᩶:Z

    if-eqz p1, :cond_12

    iget-object p1, p0, Ll/۠ۤ֫;->۠:Landroid/content/Context;

    if-nez p1, :cond_11

    goto :goto_4

    .line 1356
    :cond_11
    sget-object p1, Ll/ᩳ۫֫;->ᩳ:Ll/ᩳ۫֫;

    iput-object p1, p0, Ll/۠ۤ֫;->ᩳ:Ll/ᩳ۫֫;

    .line 1357
    iget-object v0, p0, Ll/۠ۤ֫;->ܿ:Ll/᩷۫֫;

    invoke-virtual {v0, p1}, Ll/᩷۫֫;->֫(Ll/ᩳ۫֫;)V

    .line 1358
    throw p2

    .line 1360
    :cond_12
    :goto_4
    invoke-virtual {v0, p2}, Ll/ᩴۤ֫;->֫(Ljava/lang/Exception;)V

    return-void

    .line 1363
    :cond_13
    invoke-virtual {v0}, Ll/ᩴۤ֫;->֫()V

    .line 1367
    iget-object p2, p0, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    invoke-static {p2}, Ll/۠ۤ֫;->֫(Landroid/media/AudioTrack;)Z

    move-result p2

    if-eqz p2, :cond_15

    .line 1372
    iget-wide v4, p0, Ll/۠ۤ֫;->᩺֫:J

    cmp-long p2, v4, v2

    if-lez p2, :cond_14

    .line 1373
    iput-boolean v8, p0, Ll/۠ۤ֫;->᩺:Z

    .line 1379
    :cond_14
    iget-boolean p2, p0, Ll/۠ۤ֫;->ۘ֫:Z

    if-eqz p2, :cond_15

    iget-object p2, p0, Ll/۠ۤ֫;->֫֫:Ll/᩸۫֫;

    if-eqz p2, :cond_15

    if-ge p1, v1, :cond_15

    iget-boolean v0, p0, Ll/۠ۤ֫;->᩺:Z

    if-nez v0, :cond_15

    .line 1383
    invoke-interface {p2}, Ll/᩸۫֫;->ۧ()V

    .line 1387
    :cond_15
    iget-object p2, p0, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    iget p2, p2, Ll/ۢۤ֫;->᩷:I

    if-nez p2, :cond_16

    .line 1388
    iget-wide v2, p0, Ll/۠ۤ֫;->ܰ֫:J

    int-to-long v4, p1

    add-long/2addr v2, v4

    iput-wide v2, p0, Ll/۠ۤ֫;->ܰ֫:J

    :cond_16
    if-ne p1, v1, :cond_19

    if-eqz p2, :cond_18

    .line 1394
    iget-object p1, p0, Ll/۠ۤ֫;->ۜ֫:Ljava/nio/ByteBuffer;

    iget-object p2, p0, Ll/۠ۤ֫;->ۛ:Ljava/nio/ByteBuffer;

    if-ne p1, p2, :cond_17

    const/4 v8, 0x1

    :cond_17
    invoke-static {v8}, Ll/᩺֡֫;->ۧ(Z)V

    .line 1395
    iget-wide p1, p0, Ll/۠ۤ֫;->᩺֫:J

    iget v0, p0, Ll/۠ۤ֫;->ۗ:I

    int-to-long v0, v0

    iget v2, p0, Ll/۠ۤ֫;->ۨ:I

    int-to-long v2, v2

    mul-long v0, v0, v2

    add-long/2addr v0, p1

    iput-wide v0, p0, Ll/۠ۤ֫;->᩺֫:J

    :cond_18
    const/4 p1, 0x0

    .line 1397
    iput-object p1, p0, Ll/۠ۤ֫;->ۜ֫:Ljava/nio/ByteBuffer;

    :cond_19
    :goto_5
    return-void
.end method

.method public static bridge synthetic ܳ(Ll/۠ۤ֫;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/۠ۤ֫;->۫:Z

    return-void
.end method

.method public static ܺ()Z
    .locals 2

    .line 2085
    sget-object v0, Ll/۠ۤ֫;->ۧۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 2086
    :try_start_0
    sget v1, Ll/۠ۤ֫;->۟֫:I

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 2087
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static bridge synthetic ܽ(Ll/۠ۤ֫;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/۠ۤ֫;->ܰ:J

    return-wide v0
.end method

.method private ܽ(J)V
    .locals 2

    .line 1231
    invoke-direct {p0, p1, p2}, Ll/۠ۤ֫;->ۧ(J)V

    .line 1232
    iget-object v0, p0, Ll/۠ۤ֫;->ۜ֫:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_0

    goto :goto_1

    .line 1238
    :cond_0
    iget-object v0, p0, Ll/۠ۤ֫;->᩻:Ll/ۘ֡֫;

    invoke-virtual {v0}, Ll/ۘ֡֫;->ᩳ()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1239
    iget-object v0, p0, Ll/۠ۤ֫;->ۛ:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_5

    .line 1240
    invoke-direct {p0, v0}, Ll/۠ۤ֫;->֫(Ljava/nio/ByteBuffer;)V

    .line 1241
    invoke-direct {p0, p1, p2}, Ll/۠ۤ֫;->ۧ(J)V

    return-void

    .line 1246
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/۠ۤ֫;->᩻:Ll/ۘ֡֫;

    invoke-virtual {v0}, Ll/ۘ֡֫;->ܽ()Z

    move-result v0

    if-nez v0, :cond_5

    .line 1248
    :cond_2
    iget-object v0, p0, Ll/۠ۤ֫;->᩻:Ll/ۘ֡֫;

    invoke-virtual {v0}, Ll/ۘ֡֫;->ۧ()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 1249
    invoke-direct {p0, v0}, Ll/۠ۤ֫;->֫(Ljava/nio/ByteBuffer;)V

    .line 1250
    invoke-direct {p0, p1, p2}, Ll/۠ۤ֫;->ۧ(J)V

    .line 1251
    iget-object v0, p0, Ll/۠ۤ֫;->ۜ֫:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_2

    goto :goto_1

    .line 1256
    :cond_3
    iget-object v0, p0, Ll/۠ۤ֫;->ۛ:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_1

    .line 1259
    :cond_4
    iget-object v0, p0, Ll/۠ۤ֫;->᩻:Ll/ۘ֡֫;

    iget-object v1, p0, Ll/۠ۤ֫;->ۛ:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v1}, Ll/ۘ֡֫;->֫(Ljava/nio/ByteBuffer;)V

    goto :goto_0

    :cond_5
    :goto_1
    return-void
.end method

.method public static bridge synthetic ܿ(Ll/۠ۤ֫;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/۠ۤ֫;->ۘ֫:Z

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/۠ۤ֫;)Ll/᩸۫֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۠ۤ֫;->֫֫:Ll/᩸۫֫;

    return-object p0
.end method

.method private ᩴ()Z
    .locals 20

    move-object/from16 v1, p0

    .line 878
    iget-object v0, v1, Ll/۠ۤ֫;->ۤ:Ll/ᩴۤ֫;

    invoke-virtual {v0}, Ll/ᩴۤ֫;->ۧ()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    return v2

    :cond_0
    const/4 v3, 0x1

    .line 1113
    :try_start_0
    iget-object v0, v1, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1113
    invoke-direct {v1, v0}, Ll/۠ۤ֫;->֫(Ll/ۢۤ֫;)Landroid/media/AudioTrack;

    move-result-object v0
    :try_end_0
    .catch Ll/ܶ۫֫; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v4, v0

    .line 1116
    iget-object v0, v1, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    iget v5, v0, Ll/ۢۤ֫;->ۧ:I

    const v6, 0xf4240

    if-le v5, v6, :cond_a

    .line 2343
    new-instance v5, Ll/ۢۤ֫;

    iget-object v8, v0, Ll/ۢۤ֫;->ܿ:Ll/۠ᩴ֫;

    iget v9, v0, Ll/ۢۤ֫;->ܳ:I

    iget v10, v0, Ll/ۢۤ֫;->᩷:I

    iget v11, v0, Ll/ۢۤ֫;->ۢ:I

    iget v12, v0, Ll/ۢۤ֫;->ۡ:I

    iget v13, v0, Ll/ۢۤ֫;->᩻:I

    iget v14, v0, Ll/ۢۤ֫;->ۜ:I

    iget-object v6, v0, Ll/ۢۤ֫;->֫:Ll/ۘ֡֫;

    iget-boolean v15, v0, Ll/ۢۤ֫;->ܽ:Z

    iget-boolean v7, v0, Ll/ۢۤ֫;->ᩳ:Z

    iget-boolean v0, v0, Ll/ۢۤ֫;->ܺ:Z

    const v16, 0xf4240

    move/from16 v18, v7

    move-object v7, v5

    move/from16 v17, v15

    move/from16 v15, v16

    move-object/from16 v16, v6

    move/from16 v19, v0

    invoke-direct/range {v7 .. v19}, Ll/ۢۤ֫;-><init>(Ll/۠ᩴ֫;IIIIIIILl/ۘ֡֫;ZZZ)V

    .line 1120
    :try_start_1
    invoke-direct {v1, v5}, Ll/۠ۤ֫;->֫(Ll/ۢۤ֫;)Landroid/media/AudioTrack;

    move-result-object v0

    .line 1121
    iput-object v5, v1, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;
    :try_end_1
    .catch Ll/ܶ۫֫; {:try_start_1 .. :try_end_1} :catch_1

    .line 882
    :goto_0
    iput-object v0, v1, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    .line 883
    invoke-static {v0}, Ll/۠ۤ֫;->֫(Landroid/media/AudioTrack;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 884
    iget-object v0, v1, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    .line 1209
    iget-object v4, v1, Ll/۠ۤ֫;->ܳ֫:Ll/֨ۤ֫;

    if-nez v4, :cond_1

    .line 1212
    new-instance v4, Ll/֨ۤ֫;

    invoke-direct {v4, v1}, Ll/֨ۤ֫;-><init>(Ll/۠ۤ֫;)V

    iput-object v4, v1, Ll/۠ۤ֫;->ܳ֫:Ll/֨ۤ֫;

    .line 1214
    :cond_1
    iget-object v4, v1, Ll/۠ۤ֫;->ܳ֫:Ll/֨ۤ֫;

    invoke-virtual {v4, v0}, Ll/֨ۤ֫;->֫(Landroid/media/AudioTrack;)V

    .line 885
    iget-object v0, v1, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    iget-boolean v4, v0, Ll/ۢۤ֫;->ᩳ:Z

    if-eqz v4, :cond_2

    .line 886
    iget-object v4, v1, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    iget-object v0, v0, Ll/ۢۤ֫;->ܿ:Ll/۠ᩴ֫;

    iget v5, v0, Ll/۠ᩴ֫;->ᩴ:I

    iget v0, v0, Ll/۠ᩴ֫;->᩵:I

    invoke-virtual {v4, v5, v0}, Landroid/media/AudioTrack;->setOffloadDelayPadding(II)V

    .line 890
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1f

    if-lt v0, v4, :cond_3

    iget-object v4, v1, Ll/۠ۤ֫;->ۖ֫:Ll/ܰ۬֫;

    if-eqz v4, :cond_3

    .line 891
    iget-object v5, v1, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    invoke-static {v5, v4}, Ll/ܿۤ֫;->֫(Landroid/media/AudioTrack;Ll/ܰ۬֫;)V

    .line 893
    :cond_3
    iget-object v7, v1, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    iget-object v4, v1, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    iget v5, v4, Ll/ۢۤ֫;->᩷:I

    const/4 v6, 0x2

    if-ne v5, v6, :cond_4

    const/4 v5, 0x1

    const/4 v8, 0x1

    goto :goto_1

    :cond_4
    const/4 v5, 0x0

    const/4 v8, 0x0

    :goto_1
    iget v9, v4, Ll/ۢۤ֫;->ۜ:I

    iget v10, v4, Ll/ۢۤ֫;->ۢ:I

    iget v11, v4, Ll/ۢۤ֫;->ۧ:I

    iget-boolean v12, v1, Ll/۠ۤ֫;->᩶:Z

    iget-object v6, v1, Ll/۠ۤ֫;->ܺ:Ll/ۤ۫֫;

    invoke-virtual/range {v6 .. v12}, Ll/ۤ۫֫;->֫(Landroid/media/AudioTrack;ZIIIZ)V

    .line 1596
    invoke-direct/range {p0 .. p0}, Ll/۠ۤ֫;->᩵()Z

    move-result v4

    if-eqz v4, :cond_5

    .line 1597
    iget-object v4, v1, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    iget v5, v1, Ll/۠ۤ֫;->ۛ֫:F

    invoke-virtual {v4, v5}, Landroid/media/AudioTrack;->setVolume(F)I

    .line 902
    :cond_5
    iget-object v4, v1, Ll/۠ۤ֫;->ۘ:Ll/ܿᩴ֫;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 906
    iget-object v4, v1, Ll/۠ۤ֫;->᩵֫:Ll/ۢ۫֫;

    if-eqz v4, :cond_6

    const/16 v5, 0x17

    if-lt v0, v5, :cond_6

    .line 907
    iget-object v5, v1, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    invoke-static {v5, v4}, Ll/ᩳۤ֫;->֫(Landroid/media/AudioTrack;Ll/ۢ۫֫;)V

    .line 908
    iget-object v4, v1, Ll/۠ۤ֫;->ܿ:Ll/᩷۫֫;

    if-eqz v4, :cond_6

    .line 909
    iget-object v5, v1, Ll/۠ۤ֫;->᩵֫:Ll/ۢ۫֫;

    iget-object v5, v5, Ll/ۢ۫֫;->֫:Landroid/media/AudioDeviceInfo;

    invoke-virtual {v4, v5}, Ll/᩷۫֫;->֫(Landroid/media/AudioDeviceInfo;)V

    :cond_6
    const/16 v4, 0x18

    if-lt v0, v4, :cond_7

    .line 912
    iget-object v0, v1, Ll/۠ۤ֫;->ܿ:Ll/᩷۫֫;

    if-eqz v0, :cond_7

    .line 913
    new-instance v4, Ll/ۘۤ֫;

    iget-object v5, v1, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    invoke-direct {v4, v5, v0}, Ll/ۘۤ֫;-><init>(Landroid/media/AudioTrack;Ll/᩷۫֫;)V

    iput-object v4, v1, Ll/۠ۤ֫;->᩻֫:Ll/ۘۤ֫;

    .line 916
    :cond_7
    iput-boolean v3, v1, Ll/۠ۤ֫;->ܶ֫:Z

    .line 918
    iget-object v0, v1, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getAudioSessionId()I

    move-result v0

    .line 919
    iget v4, v1, Ll/۠ۤ֫;->᩷:I

    if-eq v0, v4, :cond_8

    const/4 v2, 0x1

    .line 920
    :cond_8
    iput v0, v1, Ll/۠ۤ֫;->᩷:I

    .line 922
    iget-object v0, v1, Ll/۠ۤ֫;->֫֫:Ll/᩸۫֫;

    if-eqz v0, :cond_9

    .line 923
    iget-object v4, v1, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    invoke-virtual {v4}, Ll/ۢۤ֫;->֫()Ll/֨۫֫;

    move-result-object v4

    invoke-interface {v0, v4}, Ll/᩸۫֫;->֫(Ll/֨۫֫;)V

    if-eqz v2, :cond_9

    .line 925
    iput-boolean v3, v1, Ll/۠ۤ֫;->᩷֫:Z

    .line 926
    iget-object v0, v1, Ll/۠ۤ֫;->֫֫:Ll/᩸۫֫;

    iget v2, v1, Ll/۠ۤ֫;->᩷:I

    invoke-interface {v0, v2}, Ll/᩸۫֫;->֫(I)V

    :cond_9
    return v3

    :catch_1
    move-exception v0

    .line 1124
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 1410
    :cond_a
    iget-object v0, v1, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    .line 2388
    iget v0, v0, Ll/ۢۤ֫;->᩷:I

    if-ne v0, v3, :cond_b

    .line 1416
    iput-boolean v3, v1, Ll/۠ۤ֫;->ᩳ֫:Z

    .line 1128
    :cond_b
    throw v4
.end method

.method private ᩵()Z
    .locals 1

    .line 1874
    iget-object v0, p0, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static ᩻(Ll/۠ۤ֫;)J
    .locals 5

    .line 1878
    iget-object v0, p0, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    iget v1, v0, Ll/ۢۤ֫;->᩷:I

    if-nez v1, :cond_0

    .line 1879
    iget-wide v1, p0, Ll/۠ۤ֫;->ۙ֫:J

    iget p0, v0, Ll/ۢۤ֫;->ܳ:I

    int-to-long v3, p0

    div-long/2addr v1, v3

    return-wide v1

    .line 1880
    :cond_0
    iget-wide v0, p0, Ll/۠ۤ֫;->᩶֫:J

    return-wide v0
.end method


# virtual methods
.method public final flush()V
    .locals 11

    .line 1614
    invoke-direct {p0}, Ll/۠ۤ֫;->᩵()Z

    move-result v0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_5

    .line 1693
    iput-wide v1, p0, Ll/۠ۤ֫;->ۙ֫:J

    .line 1694
    iput-wide v1, p0, Ll/۠ۤ֫;->᩶֫:J

    .line 1695
    iput-wide v1, p0, Ll/۠ۤ֫;->ܰ֫:J

    .line 1696
    iput-wide v1, p0, Ll/۠ۤ֫;->᩺֫:J

    const/4 v0, 0x0

    .line 1697
    iput-boolean v0, p0, Ll/۠ۤ֫;->᩺:Z

    .line 1698
    iput v0, p0, Ll/۠ۤ֫;->ۗ:I

    .line 1699
    new-instance v10, Ll/ܺۤ֫;

    iget-object v5, p0, Ll/۠ۤ֫;->ܺ֫:Ll/ۖ᩵֫;

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    move-object v4, v10

    invoke-direct/range {v4 .. v9}, Ll/ܺۤ֫;-><init>(Ll/ۖ᩵֫;JJ)V

    iput-object v10, p0, Ll/۠ۤ֫;->ۧ֫:Ll/ܺۤ֫;

    .line 1702
    iput-wide v1, p0, Ll/۠ۤ֫;->۠֫:J

    .line 1703
    iput-object v3, p0, Ll/۠ۤ֫;->ۧ:Ll/ܺۤ֫;

    .line 1704
    iget-object v4, p0, Ll/۠ۤ֫;->ܽ֫:Ljava/util/ArrayDeque;

    invoke-virtual {v4}, Ljava/util/ArrayDeque;->clear()V

    .line 1705
    iput-object v3, p0, Ll/۠ۤ֫;->ۛ:Ljava/nio/ByteBuffer;

    .line 1706
    iput v0, p0, Ll/۠ۤ֫;->ۨ:I

    .line 1707
    iput-object v3, p0, Ll/۠ۤ֫;->ۜ֫:Ljava/nio/ByteBuffer;

    .line 1708
    iput-boolean v0, p0, Ll/۠ۤ֫;->᩹֫:Z

    .line 1709
    iput-boolean v0, p0, Ll/۠ۤ֫;->۬:Z

    .line 1710
    iput-boolean v0, p0, Ll/۠ۤ֫;->۫:Z

    .line 1711
    iput-object v3, p0, Ll/۠ۤ֫;->ᩴ:Ljava/nio/ByteBuffer;

    .line 1712
    iput v0, p0, Ll/۠ۤ֫;->֡:I

    .line 1713
    iget-object v0, p0, Ll/۠ۤ֫;->۫֫:Ll/ۤۤ֫;

    invoke-virtual {v0}, Ll/ۤۤ֫;->ۢ()V

    .line 873
    iget-object v0, p0, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    iget-object v0, v0, Ll/ۢۤ֫;->֫:Ll/ۘ֡֫;

    iput-object v0, p0, Ll/۠ۤ֫;->᩻:Ll/ۘ֡֫;

    .line 874
    invoke-virtual {v0}, Ll/ۘ֡֫;->֫()V

    .line 1617
    iget-object v0, p0, Ll/۠ۤ֫;->ܺ:Ll/ۤ۫֫;

    invoke-virtual {v0}, Ll/ۤ۫֫;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1618
    iget-object v0, p0, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    .line 1620
    :cond_0
    iget-object v0, p0, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    invoke-static {v0}, Ll/۠ۤ֫;->֫(Landroid/media/AudioTrack;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1621
    iget-object v0, p0, Ll/۠ۤ֫;->ܳ֫:Ll/֨ۤ֫;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1621
    iget-object v4, p0, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    invoke-virtual {v0, v4}, Ll/֨ۤ֫;->ۧ(Landroid/media/AudioTrack;)V

    .line 1623
    :cond_1
    iget-object v0, p0, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    invoke-virtual {v0}, Ll/ۢۤ֫;->֫()Ll/֨۫֫;

    move-result-object v4

    .line 1624
    iget-object v0, p0, Ll/۠ۤ֫;->ۢ֫:Ll/ۢۤ֫;

    if-eqz v0, :cond_2

    .line 1625
    iput-object v0, p0, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    .line 1626
    iput-object v3, p0, Ll/۠ۤ֫;->ۢ֫:Ll/ۢۤ֫;

    .line 1628
    :cond_2
    iget-object v0, p0, Ll/۠ۤ֫;->ܺ:Ll/ۤ۫֫;

    invoke-virtual {v0}, Ll/ۤ۫֫;->ܿ()V

    .line 1629
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x18

    if-lt v0, v5, :cond_3

    iget-object v0, p0, Ll/۠ۤ֫;->᩻֫:Ll/ۘۤ֫;

    if-eqz v0, :cond_3

    .line 1630
    invoke-virtual {v0}, Ll/ۘۤ֫;->֫()V

    .line 1631
    iput-object v3, p0, Ll/۠ۤ֫;->᩻֫:Ll/ۘۤ֫;

    .line 1636
    :cond_3
    iget-object v5, p0, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    iget-object v6, p0, Ll/۠ۤ֫;->֫֫:Ll/᩸۫֫;

    .line 2047
    new-instance v7, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v7, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 2048
    sget-object v0, Ll/۠ۤ֫;->ۧۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 2049
    :try_start_0
    sget-object v8, Ll/۠ۤ֫;->֫ۧ:Ljava/util/concurrent/ScheduledExecutorService;

    if-nez v8, :cond_4

    .line 2051
    sget-object v8, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 926
    new-instance v8, Ll/ۖ֨֫;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    invoke-static {v8}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v8

    .line 2051
    sput-object v8, Ll/۠ۤ֫;->֫ۧ:Ljava/util/concurrent/ScheduledExecutorService;

    .line 2053
    :cond_4
    sget v8, Ll/۠ۤ֫;->۟֫:I

    add-int/lit8 v8, v8, 0x1

    sput v8, Ll/۠ۤ֫;->۟֫:I

    .line 2054
    sget-object v8, Ll/۠ۤ֫;->֫ۧ:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v9, Ll/ܽۤ֫;

    invoke-direct {v9, v5, v6, v7, v4}, Ll/ܽۤ֫;-><init>(Landroid/media/AudioTrack;Ll/᩸۫֫;Landroid/os/Handler;Ll/֨۫֫;)V

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v5, 0x14

    .line 2055
    invoke-interface {v8, v9, v5, v6, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 2081
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1637
    iput-object v3, p0, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 2081
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    .line 1639
    :cond_5
    :goto_0
    iget-object v0, p0, Ll/۠ۤ֫;->ۨ֫:Ll/ᩴۤ֫;

    invoke-virtual {v0}, Ll/ᩴۤ֫;->֫()V

    .line 1640
    iget-object v0, p0, Ll/۠ۤ֫;->ۤ:Ll/ᩴۤ֫;

    invoke-virtual {v0}, Ll/ᩴۤ֫;->֫()V

    .line 1641
    iput-wide v1, p0, Ll/۠ۤ֫;->֨֫:J

    .line 1642
    iput-wide v1, p0, Ll/۠ۤ֫;->֫:J

    .line 1643
    iget-object v0, p0, Ll/۠ۤ֫;->֡֫:Landroid/os/Handler;

    if-eqz v0, :cond_6

    .line 1644
    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    :cond_6
    return-void
.end method

.method public final pause()V
    .locals 1

    const/4 v0, 0x0

    .line 1603
    iput-boolean v0, p0, Ll/۠ۤ֫;->ۘ֫:Z

    .line 1604
    invoke-direct {p0}, Ll/۠ۤ֫;->᩵()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1605
    iget-object v0, p0, Ll/۠ۤ֫;->ܺ:Ll/ۤ۫֫;

    invoke-virtual {v0}, Ll/ۤ۫֫;->ᩳ()V

    .line 1606
    iget-boolean v0, p0, Ll/۠ۤ֫;->᩹֫:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    invoke-static {v0}, Ll/۠ۤ֫;->֫(Landroid/media/AudioTrack;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1607
    :cond_0
    iget-object v0, p0, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    :cond_1
    return-void
.end method

.method public final reset()V
    .locals 3

    .line 1650
    invoke-virtual {p0}, Ll/۠ۤ֫;->flush()V

    .line 375
    iget-object v0, p0, Ll/۠ۤ֫;->᩵:Ll/ܳ۬ܺ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object v0

    .line 1651
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡֡֫;

    .line 1652
    invoke-interface {v2}, Ll/֡֡֫;->reset()V

    goto :goto_0

    .line 1654
    :cond_0
    iget-object v0, p0, Ll/۠ۤ֫;->۬֫:Ll/᩸֡֫;

    invoke-virtual {v0}, Ll/֨֡֫;->reset()V

    .line 1655
    iget-object v0, p0, Ll/۠ۤ֫;->ۗ֫:Ll/۫ۤ֫;

    invoke-virtual {v0}, Ll/֨֡֫;->reset()V

    .line 1657
    iget-object v0, p0, Ll/۠ۤ֫;->᩻:Ll/ۘ֡֫;

    if-eqz v0, :cond_1

    .line 1658
    invoke-virtual {v0}, Ll/ۘ֡֫;->ܳ()V

    .line 1660
    :cond_1
    iput-boolean v1, p0, Ll/۠ۤ֫;->ۘ֫:Z

    .line 1661
    iput-boolean v1, p0, Ll/۠ۤ֫;->ᩳ֫:Z

    return-void
.end method

.method public final ֫(F)V
    .locals 1

    .line 1589
    iget v0, p0, Ll/۠ۤ֫;->ۛ֫:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    .line 1590
    iput p1, p0, Ll/۠ۤ֫;->ۛ֫:F

    .line 1596
    invoke-direct {p0}, Ll/۠ۤ֫;->᩵()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 1597
    iget-object p1, p0, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    iget v0, p0, Ll/۠ۤ֫;->ۛ֫:F

    invoke-virtual {p1, v0}, Landroid/media/AudioTrack;->setVolume(F)I

    :cond_0
    return-void
.end method

.method public final ֫(I)V
    .locals 2

    .line 1491
    iget-boolean v0, p0, Ll/۠ۤ֫;->᩷֫:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 1492
    iget v0, p0, Ll/۠ۤ֫;->᩷:I

    if-ne v0, p1, :cond_2

    .line 1493
    iput-boolean v1, p0, Ll/۠ۤ֫;->᩷֫:Z

    .line 1498
    :cond_0
    iget v0, p0, Ll/۠ۤ֫;->᩷:I

    if-eq v0, p1, :cond_2

    .line 1499
    iput p1, p0, Ll/۠ۤ֫;->᩷:I

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    .line 1500
    :cond_1
    iput-boolean v1, p0, Ll/۠ۤ֫;->ۙ:Z

    .line 1501
    invoke-virtual {p0}, Ll/۠ۤ֫;->flush()V

    :cond_2
    return-void
.end method

.method public final ֫(II)V
    .locals 1

    .line 1579
    iget-object v0, p0, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    .line 1580
    invoke-static {v0}, Ll/۠ۤ֫;->֫(Landroid/media/AudioTrack;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    if-eqz v0, :cond_0

    iget-boolean v0, v0, Ll/ۢۤ֫;->ᩳ:Z

    if-eqz v0, :cond_0

    .line 1583
    iget-object v0, p0, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    invoke-virtual {v0, p1, p2}, Landroid/media/AudioTrack;->setOffloadDelayPadding(II)V

    :cond_0
    return-void
.end method

.method public final ֫(Landroid/media/AudioDeviceInfo;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 1527
    :cond_0
    new-instance v0, Ll/ۢ۫֫;

    invoke-direct {v0, p1}, Ll/ۢ۫֫;-><init>(Landroid/media/AudioDeviceInfo;)V

    :goto_0
    iput-object v0, p0, Ll/۠ۤ֫;->᩵֫:Ll/ۢ۫֫;

    .line 1528
    iget-object v0, p0, Ll/۠ۤ֫;->ܿ:Ll/᩷۫֫;

    if-eqz v0, :cond_1

    .line 1529
    invoke-virtual {v0, p1}, Ll/᩷۫֫;->֫(Landroid/media/AudioDeviceInfo;)V

    .line 1531
    :cond_1
    iget-object p1, p0, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    if-eqz p1, :cond_2

    .line 1532
    iget-object v0, p0, Ll/۠ۤ֫;->᩵֫:Ll/ۢ۫֫;

    invoke-static {p1, v0}, Ll/ᩳۤ֫;->֫(Landroid/media/AudioTrack;Ll/ۢ۫֫;)V

    :cond_2
    return-void
.end method

.method public final ֫(Ll/ۖ᩵֫;)V
    .locals 7

    .line 1438
    new-instance v0, Ll/ۖ᩵֫;

    iget v1, p1, Ll/ۖ᩵֫;->ܽ:F

    const v2, 0x3dcccccd    # 0.1f

    const/high16 v3, 0x41000000    # 8.0f

    .line 1440
    invoke-static {v1, v2, v3}, Ll/ۘ֨֫;->֫(FFF)F

    move-result v1

    iget v4, p1, Ll/ۖ᩵֫;->֫:F

    .line 1441
    invoke-static {v4, v2, v3}, Ll/ۘ֨֫;->֫(FFF)F

    move-result v2

    invoke-direct {v0, v1, v2}, Ll/ۖ᩵֫;-><init>(FF)V

    iput-object v0, p0, Ll/۠ۤ֫;->ܺ֫:Ll/ۖ᩵֫;

    .line 1442
    invoke-direct {p0}, Ll/۠ۤ֫;->۠()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1443
    invoke-direct {p0}, Ll/۠ۤ֫;->֨()V

    return-void

    .line 1740
    :cond_0
    new-instance v0, Ll/ܺۤ֫;

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    move-object v1, v0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Ll/ܺۤ֫;-><init>(Ll/ۖ᩵֫;JJ)V

    .line 1745
    invoke-direct {p0}, Ll/۠ۤ֫;->᩵()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 1748
    iput-object v0, p0, Ll/۠ۤ֫;->ۧ:Ll/ܺۤ֫;

    return-void

    .line 1752
    :cond_1
    iput-object v0, p0, Ll/۠ۤ֫;->ۧ֫:Ll/ܺۤ֫;

    return-void
.end method

.method public final ֫(Ll/۠ᩴ֫;[I)V
    .locals 23

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    .line 739
    invoke-direct/range {p0 .. p0}, Ll/۠ۤ֫;->֡()V

    .line 740
    iget-object v0, v3, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    iget v2, v3, Ll/۠ᩴ֫;->ܽ֫:I

    iget v4, v3, Ll/۠ᩴ֫;->ܿ:I

    iget v5, v3, Ll/۠ᩴ֫;->ۛ:I

    const-string v6, "audio/raw"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    iget-boolean v7, v1, Ll/۠ۤ֫;->ᩴ֫:Z

    iget-object v8, v1, Ll/۠ۤ֫;->ۖ:Ll/᩸ۤ֫;

    const/4 v10, -0x1

    if-eqz v6, :cond_3

    .line 741
    invoke-static {v5}, Ll/ۘ֨֫;->ۜ(I)Z

    move-result v6

    invoke-static {v6}, Ll/᩺֡֫;->֫(Z)V

    .line 2423
    invoke-static {v5}, Ll/ۘ֨֫;->ܽ(I)I

    move-result v6

    mul-int v6, v6, v4

    .line 745
    new-instance v11, Ll/֫۬ܺ;

    invoke-direct {v11}, Ll/֫۬ܺ;-><init>()V

    .line 746
    iget-object v12, v1, Ll/۠ۤ֫;->᩵:Ll/ܳ۬ܺ;

    invoke-virtual {v11, v12}, Ll/ۛۗܺ;->֫(Ljava/util/List;)V

    .line 1808
    iget-boolean v12, v1, Ll/۠ۤ֫;->᩹:Z

    if-eqz v12, :cond_1

    const/16 v12, 0x15

    if-eq v5, v12, :cond_0

    const/high16 v12, 0x50000000

    if-eq v5, v12, :cond_0

    const/16 v12, 0x16

    if-eq v5, v12, :cond_0

    const/high16 v12, 0x60000000

    if-eq v5, v12, :cond_0

    const/4 v12, 0x4

    if-ne v5, v12, :cond_1

    .line 748
    :cond_0
    iget-object v12, v1, Ll/۠ۤ֫;->ۗ֫:Ll/۫ۤ֫;

    invoke-virtual {v11, v12}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    goto :goto_0

    .line 750
    :cond_1
    iget-object v12, v1, Ll/۠ۤ֫;->۬֫:Ll/᩸֡֫;

    invoke-virtual {v11, v12}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    .line 751
    iget-object v12, v1, Ll/۠ۤ֫;->ۜ:Ll/ۚ֡֫;

    check-cast v12, Ll/ۡۤ֫;

    invoke-virtual {v12}, Ll/ۡۤ֫;->֫()[Ll/֡֡֫;

    move-result-object v12

    invoke-virtual {v11, v12}, Ll/֫۬ܺ;->֫([Ljava/lang/Object;)V

    .line 753
    :goto_0
    new-instance v12, Ll/ۘ֡֫;

    invoke-virtual {v11}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object v11

    invoke-direct {v12, v11}, Ll/ۘ֡֫;-><init>(Ll/ܳ۬ܺ;)V

    .line 757
    iget-object v11, v1, Ll/۠ۤ֫;->᩻:Ll/ۘ֡֫;

    invoke-virtual {v12, v11}, Ll/ۘ֡֫;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2

    .line 758
    iget-object v12, v1, Ll/۠ۤ֫;->᩻:Ll/ۘ֡֫;

    .line 761
    :cond_2
    iget v11, v3, Ll/۠ᩴ֫;->ᩴ:I

    iget v13, v3, Ll/۠ᩴ֫;->᩵:I

    iget-object v14, v1, Ll/۠ۤ֫;->۫֫:Ll/ۤۤ֫;

    invoke-virtual {v14, v11, v13}, Ll/ۤۤ֫;->֫(II)V

    .line 764
    iget-object v11, v1, Ll/۠ۤ֫;->ۚ:Ll/ۛ۫֫;

    move-object/from16 v13, p2

    invoke-virtual {v11, v13}, Ll/ۛ۫֫;->֫([I)V

    .line 766
    new-instance v11, Ll/ᩴ֡֫;

    .line 69
    invoke-direct {v11, v2, v4, v5}, Ll/ᩴ֡֫;-><init>(III)V

    .line 768
    :try_start_0
    invoke-virtual {v12, v11}, Ll/ۘ֡֫;->֫(Ll/ᩴ֡֫;)Ll/ᩴ֡֫;

    move-result-object v2
    :try_end_0
    .catch Ll/᩵֡֫; {:try_start_0 .. :try_end_0} :catch_0

    iget v4, v2, Ll/ᩴ֡֫;->ۧ:I

    .line 774
    iget v5, v2, Ll/ᩴ֡֫;->ܽ:I

    .line 775
    iget v2, v2, Ll/ᩴ֡֫;->ᩳ:I

    .line 778
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    invoke-static {v4}, Ll/ۘ֨֫;->ۧ(I)I

    move-result v8

    .line 2423
    invoke-static {v5}, Ll/ۘ֨֫;->ܽ(I)I

    move-result v11

    mul-int v11, v11, v4

    const/4 v4, 0x0

    const/4 v13, 0x0

    move v4, v6

    move v13, v7

    move v6, v11

    const/4 v14, 0x0

    move v7, v2

    move v11, v5

    const/4 v5, 0x0

    goto/16 :goto_3

    :catch_0
    move-exception v0

    move-object v2, v0

    .line 770
    new-instance v0, Ll/۠۫֫;

    invoke-direct {v0, v2, v3}, Ll/۠۫֫;-><init>(Ll/᩵֡֫;Ll/۠ᩴ֫;)V

    throw v0

    .line 784
    :cond_3
    new-instance v5, Ll/ۘ֡֫;

    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v6

    invoke-direct {v5, v6}, Ll/ۘ֡֫;-><init>(Ll/ܳ۬ܺ;)V

    .line 789
    iget v6, v1, Ll/۠ۤ֫;->ܿ֫:I

    if-eqz v6, :cond_4

    .line 790
    invoke-virtual/range {p0 .. p1}, Ll/۠ۤ֫;->ܽ(Ll/۠ᩴ֫;)Ll/ܺ۫֫;

    move-result-object v6

    goto :goto_1

    .line 791
    :cond_4
    sget-object v6, Ll/ܺ۫֫;->ᩳ:Ll/ܺ۫֫;

    .line 792
    :goto_1
    iget v11, v1, Ll/۠ۤ֫;->ܿ֫:I

    if-eqz v11, :cond_5

    iget-boolean v11, v6, Ll/ܺ۫֫;->֫:Z

    if-eqz v11, :cond_5

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 795
    iget-object v7, v3, Ll/۠ᩴ֫;->ܳ:Ljava/lang/String;

    invoke-static {v0, v7}, Ll/ۢ᩵֫;->ܽ(Ljava/lang/String;Ljava/lang/String;)I

    move-result v7

    .line 798
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    invoke-static {v4}, Ll/ۘ֨֫;->ۧ(I)I

    move-result v4

    .line 802
    iget-boolean v6, v6, Ll/ܺ۫֫;->ۧ:Z

    const/4 v8, -0x1

    const/4 v11, 0x1

    const/4 v12, 0x1

    const/4 v13, -0x1

    move v8, v4

    move-object v12, v5

    move v14, v6

    move v11, v7

    const/4 v4, -0x1

    const/4 v5, 0x1

    const/4 v6, -0x1

    const/4 v13, 0x1

    goto :goto_2

    .line 806
    :cond_5
    iget-object v4, v1, Ll/۠ۤ֫;->ᩳ:Ll/ᩳ۫֫;

    iget-object v6, v1, Ll/۠ۤ֫;->ܽ:Ll/ᩳᩴ֫;

    .line 807
    invoke-virtual {v4, v6, v3}, Ll/ᩳ۫֫;->֫(Ll/ᩳᩴ֫;Ll/۠ᩴ֫;)Landroid/util/Pair;

    move-result-object v4

    if-eqz v4, :cond_15

    .line 813
    iget-object v6, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 814
    iget-object v4, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v8, -0x1

    const/4 v11, -0x1

    const/4 v12, 0x0

    const/4 v13, 0x2

    move v8, v4

    move-object v12, v5

    move v11, v6

    move v13, v7

    const/4 v4, -0x1

    const/4 v5, 0x2

    const/4 v6, -0x1

    const/4 v14, 0x0

    :goto_2
    move v7, v2

    :goto_3
    const-string v2, ") for: "

    if-eqz v11, :cond_14

    if-eqz v8, :cond_13

    .line 833
    iget v2, v3, Ll/۠ᩴ֫;->ᩳ:I

    const-string v15, "audio/vnd.dts.hd;profile=lbr"

    .line 834
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    if-ne v2, v10, :cond_6

    const v2, 0xbb800

    .line 2221
    :cond_6
    invoke-static {v7, v8, v11}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    move-result v0

    const/4 v15, -0x2

    if-eq v0, v15, :cond_7

    const/4 v15, 0x1

    goto :goto_4

    :cond_7
    const/4 v15, 0x0

    .line 2222
    :goto_4
    invoke-static {v15}, Ll/᩺֡֫;->ۧ(Z)V

    if-eq v6, v10, :cond_8

    move v10, v6

    goto :goto_5

    :cond_8
    const/4 v10, 0x1

    :goto_5
    if-eqz v13, :cond_9

    const-wide/high16 v15, 0x4020000000000000L    # 8.0

    goto :goto_6

    :cond_9
    const-wide/high16 v15, 0x3ff0000000000000L    # 1.0

    .line 842
    :goto_6
    iget-object v9, v1, Ll/۠ۤ֫;->ۡ:Ll/ܶۤ֫;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/32 v18, 0xf4240

    if-eqz v5, :cond_11

    const/4 v9, 0x1

    if-eq v5, v9, :cond_f

    const/4 v9, 0x2

    if-ne v5, v9, :cond_e

    const/4 v9, 0x5

    const/16 v3, 0x8

    if-ne v11, v9, :cond_a

    const v3, 0x7a120

    goto :goto_7

    :cond_a
    if-ne v11, v3, :cond_b

    const v3, 0xf4240

    goto :goto_7

    :cond_b
    const v3, 0x3d090

    :goto_7
    const/4 v9, -0x1

    if-eq v2, v9, :cond_c

    .line 264
    sget-object v9, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    const/16 v9, 0x8

    invoke-static {v2, v9}, Ll/ۚ᩺ܺ;->֫(II)I

    move-result v2

    goto :goto_9

    .line 280
    :cond_c
    invoke-static {v11}, Ll/᩹᩷ۧ;->֫(I)I

    move-result v2

    const v9, -0x7fffffff

    if-eq v2, v9, :cond_d

    const/4 v9, 0x1

    goto :goto_8

    :cond_d
    const/4 v9, 0x0

    .line 281
    :goto_8
    invoke-static {v9}, Ll/᩺֡֫;->ۧ(Z)V

    :goto_9
    move/from16 p2, v13

    move/from16 v17, v14

    int-to-long v13, v3

    int-to-long v2, v2

    mul-long v13, v13, v2

    .line 266
    div-long v13, v13, v18

    invoke-static {v13, v14}, Ll/۬᩺ܺ;->֫(J)I

    move-result v2

    goto :goto_b

    .line 238
    :cond_e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_f
    move/from16 p2, v13

    move/from16 v17, v14

    .line 280
    invoke-static {v11}, Ll/᩹᩷ۧ;->֫(I)I

    move-result v2

    const v3, -0x7fffffff

    if-eq v2, v3, :cond_10

    const/4 v3, 0x1

    goto :goto_a

    :cond_10
    const/4 v3, 0x0

    .line 281
    :goto_a
    invoke-static {v3}, Ll/᩺֡֫;->ۧ(Z)V

    const v3, 0x2faf080

    int-to-long v13, v3

    int-to-long v2, v2

    mul-long v13, v13, v2

    .line 272
    div-long v13, v13, v18

    invoke-static {v13, v14}, Ll/۬᩺ܺ;->֫(J)I

    move-result v2

    :goto_b
    move/from16 v21, v8

    move/from16 v22, v11

    move-object/from16 v20, v12

    goto :goto_c

    :cond_11
    move/from16 p2, v13

    move/from16 v17, v14

    mul-int/lit8 v2, v0, 0x4

    const v3, 0x3d090

    int-to-long v13, v3

    move v9, v11

    move-object/from16 v20, v12

    int-to-long v11, v7

    mul-long v13, v13, v11

    move/from16 v21, v8

    move/from16 v22, v9

    int-to-long v8, v10

    mul-long v13, v13, v8

    .line 276
    div-long v13, v13, v18

    invoke-static {v13, v14}, Ll/۬᩺ܺ;->֫(J)I

    move-result v3

    const v13, 0xb71b0

    int-to-long v13, v13

    mul-long v13, v13, v11

    mul-long v13, v13, v8

    div-long v13, v13, v18

    invoke-static {v13, v14}, Ll/۬᩺ܺ;->֫(J)I

    move-result v8

    .line 247
    invoke-static {v2, v3, v8}, Ll/ۘ֨֫;->֫(III)I

    move-result v2

    :goto_c
    int-to-double v2, v2

    mul-double v2, v2, v15

    double-to-int v2, v2

    .line 217
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/2addr v0, v10

    add-int/lit8 v0, v0, -0x1

    .line 219
    div-int/2addr v0, v10

    mul-int v10, v10, v0

    const/4 v0, 0x0

    .line 850
    iput-boolean v0, v1, Ll/۠ۤ֫;->ᩳ֫:Z

    .line 851
    new-instance v0, Ll/ۢۤ֫;

    iget-boolean v14, v1, Ll/۠ۤ֫;->ۤ֫:Z

    move-object v2, v0

    move-object/from16 v3, p1

    move/from16 v8, v21

    move/from16 v9, v22

    move-object/from16 v11, v20

    move/from16 v12, p2

    move/from16 v13, v17

    invoke-direct/range {v2 .. v14}, Ll/ۢۤ֫;-><init>(Ll/۠ᩴ֫;IIIIIIILl/ۘ֡֫;ZZZ)V

    .line 865
    invoke-direct/range {p0 .. p0}, Ll/۠ۤ֫;->᩵()Z

    move-result v2

    if-eqz v2, :cond_12

    .line 866
    iput-object v0, v1, Ll/۠ۤ֫;->ۢ֫:Ll/ۢۤ֫;

    return-void

    .line 868
    :cond_12
    iput-object v0, v1, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    return-void

    .line 826
    :cond_13
    new-instance v0, Ll/۠۫֫;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Invalid output channel config (mode="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v4, p1

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v4}, Ll/۠۫֫;-><init>(Ljava/lang/String;Ll/۠ᩴ֫;)V

    throw v0

    :cond_14
    move-object v4, v3

    .line 822
    new-instance v0, Ll/۠۫֫;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "Invalid output encoding (mode="

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v4}, Ll/۠۫֫;-><init>(Ljava/lang/String;Ll/۠ᩴ֫;)V

    throw v0

    :cond_15
    move-object v4, v3

    .line 810
    new-instance v0, Ll/۠۫֫;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unable to configure passthrough for: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v4}, Ll/۠۫֫;-><init>(Ljava/lang/String;Ll/۠ᩴ֫;)V

    throw v0
.end method

.method public final ֫(Ll/ܰ۬֫;)V
    .locals 0

    .line 673
    iput-object p1, p0, Ll/۠ۤ֫;->ۖ֫:Ll/ܰ۬֫;

    return-void
.end method

.method public final ֫(Ll/ܽۚ֫;)V
    .locals 1

    .line 678
    iget-object v0, p0, Ll/۠ۤ֫;->ܺ:Ll/ۤ۫֫;

    invoke-virtual {v0, p1}, Ll/ۤ۫֫;->֫(Ll/ܽۚ֫;)V

    return-void
.end method

.method public final ֫(Ll/ܿᩴ֫;)V
    .locals 1

    .line 1507
    iget-object v0, p0, Ll/۠ۤ֫;->ۘ:Ll/ܿᩴ֫;

    invoke-virtual {v0, p1}, Ll/ܿᩴ֫;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 1510
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1512
    iget-object v0, p0, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    if-eqz v0, :cond_1

    .line 1513
    iget-object v0, p0, Ll/۠ۤ֫;->ۘ:Ll/ܿᩴ֫;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1520
    :cond_1
    iput-object p1, p0, Ll/۠ۤ֫;->ۘ:Ll/ܿᩴ֫;

    return-void
.end method

.method public final ֫(Ll/ᩳ۫֫;)V
    .locals 4

    .line 1674
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    .line 1675
    iget-object v1, p0, Ll/۠ۤ֫;->ۡ֫:Landroid/os/Looper;

    if-ne v1, v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Current looper ("

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, "null"

    if-nez v0, :cond_1

    move-object v0, v3

    goto :goto_1

    .line 2472
    :cond_1
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    .line 1678
    :goto_1
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ") is not the playback looper ("

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ll/۠ۤ֫;->ۡ֫:Landroid/os/Looper;

    if-nez v0, :cond_2

    goto :goto_2

    .line 2472
    :cond_2
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v3

    .line 1680
    :goto_2
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1675
    invoke-static {v0, v1}, Ll/᩺֡֫;->ۧ(Ljava/lang/String;Z)V

    .line 1682
    iget-object v0, p0, Ll/۠ۤ֫;->ᩳ:Ll/ᩳ۫֫;

    if-eqz v0, :cond_3

    invoke-virtual {p1, v0}, Ll/ᩳ۫֫;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1683
    iput-object p1, p0, Ll/۠ۤ֫;->ᩳ:Ll/ᩳ۫֫;

    .line 1684
    iget-object p1, p0, Ll/۠ۤ֫;->֫֫:Ll/᩸۫֫;

    if-eqz p1, :cond_3

    .line 1685
    invoke-interface {p1}, Ll/᩸۫֫;->ܽ()V

    :cond_3
    return-void
.end method

.method public final ֫(Ll/ᩳᩴ֫;)V
    .locals 1

    .line 1470
    iget-object v0, p0, Ll/۠ۤ֫;->ܽ:Ll/ᩳᩴ֫;

    invoke-virtual {v0, p1}, Ll/ᩳᩴ֫;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1473
    :cond_0
    iput-object p1, p0, Ll/۠ۤ֫;->ܽ:Ll/ᩳᩴ֫;

    .line 1474
    iget-boolean v0, p0, Ll/۠ۤ֫;->ۤ֫:Z

    if-eqz v0, :cond_1

    :goto_0
    return-void

    .line 1478
    :cond_1
    iget-object v0, p0, Ll/۠ۤ֫;->ܿ:Ll/᩷۫֫;

    if-eqz v0, :cond_2

    .line 1479
    invoke-virtual {v0, p1}, Ll/᩷۫֫;->֫(Ll/ᩳᩴ֫;)V

    .line 1481
    :cond_2
    invoke-virtual {p0}, Ll/۠ۤ֫;->flush()V

    return-void
.end method

.method public final ֫(Ll/᩸۫֫;)V
    .locals 0

    .line 668
    iput-object p1, p0, Ll/۠ۤ֫;->֫֫:Ll/᩸۫֫;

    return-void
.end method

.method public final ֫(Z)V
    .locals 6

    .line 1456
    iput-boolean p1, p0, Ll/۠ۤ֫;->ۚ֫:Z

    .line 1460
    invoke-direct {p0}, Ll/۠ۤ֫;->۠()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Ll/ۖ᩵֫;->ᩳ:Ll/ۖ᩵֫;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ll/۠ۤ֫;->ܺ֫:Ll/ۖ᩵֫;

    :goto_0
    move-object v1, p1

    .line 1740
    new-instance p1, Ll/ܺۤ֫;

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Ll/ܺۤ֫;-><init>(Ll/ۖ᩵֫;JJ)V

    .line 1745
    invoke-direct {p0}, Ll/۠ۤ֫;->᩵()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1748
    iput-object p1, p0, Ll/۠ۤ֫;->ۧ:Ll/ܺۤ֫;

    return-void

    .line 1752
    :cond_1
    iput-object p1, p0, Ll/۠ۤ֫;->ۧ֫:Ll/ܺۤ֫;

    return-void
.end method

.method public final ֫()Z
    .locals 3

    .line 1431
    invoke-direct {p0}, Ll/۠ۤ֫;->᩵()Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    .line 1432
    invoke-virtual {v0}, Landroid/media/AudioTrack;->isOffloadedPlayback()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/۠ۤ֫;->۫:Z

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Ll/۠ۤ֫;->ܺ:Ll/ۤ۫֫;

    .line 1433
    invoke-direct {p0}, Ll/۠ۤ֫;->ۘ()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ۤ۫֫;->ۧ(J)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final ֫(IJLjava/nio/ByteBuffer;)Z
    .locals 17

    move-object/from16 v1, p0

    move/from16 v0, p1

    move-wide/from16 v2, p2

    move-object/from16 v4, p4

    .line 954
    iget-object v5, v1, Ll/۠ۤ֫;->ۛ:Ljava/nio/ByteBuffer;

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v5, :cond_1

    if-ne v4, v5, :cond_0

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v5, 0x1

    :goto_1
    invoke-static {v5}, Ll/᩺֡֫;->֫(Z)V

    .line 956
    iget-object v5, v1, Ll/۠ۤ֫;->ۢ֫:Ll/ۢۤ֫;

    const/4 v8, 0x3

    iget-object v9, v1, Ll/۠ۤ֫;->ܺ:Ll/ۤ۫֫;

    const/4 v10, 0x0

    if-eqz v5, :cond_7

    .line 957
    invoke-direct/range {p0 .. p0}, Ll/۠ۤ֫;->ۖ()Z

    move-result v5

    if-nez v5, :cond_2

    goto/16 :goto_15

    .line 960
    :cond_2
    iget-object v5, v1, Ll/۠ۤ֫;->ۢ֫:Ll/ۢۤ֫;

    iget-object v11, v1, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2360
    iget v12, v11, Ll/ۢۤ֫;->᩷:I

    iget v13, v5, Ll/ۢۤ֫;->᩷:I

    if-ne v12, v13, :cond_4

    iget v12, v11, Ll/ۢۤ֫;->ۜ:I

    iget v13, v5, Ll/ۢۤ֫;->ۜ:I

    if-ne v12, v13, :cond_4

    iget v12, v11, Ll/ۢۤ֫;->ۡ:I

    iget v13, v5, Ll/ۢۤ֫;->ۡ:I

    if-ne v12, v13, :cond_4

    iget v12, v11, Ll/ۢۤ֫;->᩻:I

    iget v13, v5, Ll/ۢۤ֫;->᩻:I

    if-ne v12, v13, :cond_4

    iget v12, v11, Ll/ۢۤ֫;->ۢ:I

    iget v13, v5, Ll/ۢۤ֫;->ۢ:I

    if-ne v12, v13, :cond_4

    iget-boolean v12, v11, Ll/ۢۤ֫;->ܽ:Z

    iget-boolean v13, v5, Ll/ۢۤ֫;->ܽ:Z

    if-ne v12, v13, :cond_4

    iget-boolean v11, v11, Ll/ۢۤ֫;->ᩳ:Z

    iget-boolean v5, v5, Ll/ۢۤ֫;->ᩳ:Z

    if-ne v11, v5, :cond_4

    .line 969
    iget-object v5, v1, Ll/۠ۤ֫;->ۢ֫:Ll/ۢۤ֫;

    iput-object v5, v1, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    .line 970
    iput-object v10, v1, Ll/۠ۤ֫;->ۢ֫:Ll/ۢۤ֫;

    .line 971
    iget-object v5, v1, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    if-eqz v5, :cond_6

    .line 972
    invoke-static {v5}, Ll/۠ۤ֫;->֫(Landroid/media/AudioTrack;)Z

    move-result v5

    if-eqz v5, :cond_6

    iget-object v5, v1, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    iget-boolean v5, v5, Ll/ۢۤ֫;->ᩳ:Z

    if-eqz v5, :cond_6

    .line 976
    iget-object v5, v1, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    invoke-virtual {v5}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v5

    if-ne v5, v8, :cond_3

    .line 977
    iget-object v5, v1, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    invoke-virtual {v5}, Landroid/media/AudioTrack;->setOffloadEndOfStream()V

    .line 978
    invoke-virtual {v9}, Ll/ۤ۫֫;->֫()V

    .line 980
    :cond_3
    iget-object v5, v1, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    iget-object v10, v1, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    iget-object v10, v10, Ll/ۢۤ֫;->ܿ:Ll/۠ᩴ֫;

    iget v11, v10, Ll/۠ᩴ֫;->ᩴ:I

    iget v10, v10, Ll/۠ᩴ֫;->᩵:I

    invoke-virtual {v5, v11, v10}, Landroid/media/AudioTrack;->setOffloadDelayPadding(II)V

    .line 982
    iput-boolean v6, v1, Ll/۠ۤ֫;->᩺:Z

    goto :goto_2

    .line 961
    :cond_4
    invoke-direct/range {p0 .. p0}, Ll/۠ۤ֫;->ۚ()V

    .line 962
    invoke-virtual/range {p0 .. p0}, Ll/۠ۤ֫;->֫()Z

    move-result v5

    if-eqz v5, :cond_5

    goto/16 :goto_15

    .line 966
    :cond_5
    invoke-virtual/range {p0 .. p0}, Ll/۠ۤ֫;->flush()V

    .line 986
    :cond_6
    :goto_2
    invoke-direct {v1, v2, v3}, Ll/۠ۤ֫;->֫(J)V

    .line 989
    :cond_7
    invoke-direct/range {p0 .. p0}, Ll/۠ۤ֫;->᩵()Z

    move-result v5

    iget-object v10, v1, Ll/۠ۤ֫;->ۤ:Ll/ᩴۤ֫;

    if-nez v5, :cond_9

    .line 991
    :try_start_0
    invoke-direct/range {p0 .. p0}, Ll/۠ۤ֫;->ᩴ()Z

    move-result v5
    :try_end_0
    .catch Ll/ܶ۫֫; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v5, :cond_9

    goto/16 :goto_15

    :catch_0
    move-exception v0

    move-object v2, v0

    .line 996
    iget-boolean v0, v2, Ll/ܶ۫֫;->᩶:Z

    if-nez v0, :cond_8

    .line 999
    invoke-virtual {v10, v2}, Ll/ᩴۤ֫;->֫(Ljava/lang/Exception;)V

    return v7

    .line 997
    :cond_8
    throw v2

    .line 1003
    :cond_9
    invoke-virtual {v10}, Ll/ᩴۤ֫;->֫()V

    .line 1005
    iget-boolean v5, v1, Ll/۠ۤ֫;->ܶ֫:Z

    const-wide/16 v10, 0x0

    if-eqz v5, :cond_b

    .line 1006
    invoke-static {v10, v11, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v12

    iput-wide v12, v1, Ll/۠ۤ֫;->۠֫:J

    .line 1007
    iput-boolean v7, v1, Ll/۠ۤ֫;->᩸֫:Z

    .line 1008
    iput-boolean v7, v1, Ll/۠ۤ֫;->ܶ֫:Z

    .line 1010
    invoke-direct/range {p0 .. p0}, Ll/۠ۤ֫;->۠()Z

    move-result v5

    if-eqz v5, :cond_a

    .line 1011
    invoke-direct/range {p0 .. p0}, Ll/۠ۤ֫;->֨()V

    .line 1013
    :cond_a
    invoke-direct {v1, v2, v3}, Ll/۠ۤ֫;->֫(J)V

    .line 1015
    iget-boolean v5, v1, Ll/۠ۤ֫;->ۘ֫:Z

    if-eqz v5, :cond_b

    .line 1016
    invoke-virtual/range {p0 .. p0}, Ll/۠ۤ֫;->ܿ()V

    .line 1020
    :cond_b
    invoke-direct/range {p0 .. p0}, Ll/۠ۤ֫;->ۘ()J

    move-result-wide v12

    invoke-virtual {v9, v12, v13}, Ll/ۤ۫֫;->ᩳ(J)Z

    move-result v5

    if-nez v5, :cond_c

    goto/16 :goto_15

    .line 1024
    :cond_c
    iget-object v5, v1, Ll/۠ۤ֫;->ۛ:Ljava/nio/ByteBuffer;

    if-nez v5, :cond_30

    .line 1026
    invoke-virtual/range {p4 .. p4}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    move-result-object v5

    sget-object v12, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    if-ne v5, v12, :cond_d

    const/4 v5, 0x1

    goto :goto_3

    :cond_d
    const/4 v5, 0x0

    :goto_3
    invoke-static {v5}, Ll/᩺֡֫;->֫(Z)V

    .line 1027
    invoke-virtual/range {p4 .. p4}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v5

    if-nez v5, :cond_e

    goto/16 :goto_12

    .line 1032
    :cond_e
    iget-object v5, v1, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    iget v12, v5, Ll/ۢۤ֫;->᩷:I

    if-eqz v12, :cond_27

    iget v12, v1, Ll/۠ۤ֫;->ۗ:I

    if-nez v12, :cond_27

    .line 1034
    iget v5, v5, Ll/ۢۤ֫;->ۜ:I

    const/16 v12, 0x14

    if-eq v5, v12, :cond_26

    const/16 v12, 0x1e

    const/4 v13, 0x2

    const/4 v14, -0x1

    const/4 v15, -0x2

    const/16 v16, 0x400

    if-eq v5, v12, :cond_1f

    packed-switch v5, :pswitch_data_0

    const/16 v8, 0x10

    packed-switch v5, :pswitch_data_1

    .line 1962
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Unexpected audio encoding: "

    .line 0
    invoke-static {v5, v2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1962
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const/16 v16, 0x800

    const/16 v5, 0x800

    goto/16 :goto_11

    .line 1917
    :pswitch_1
    invoke-virtual/range {p4 .. p4}, Ljava/nio/Buffer;->position()I

    move-result v5

    sget-object v12, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 3050
    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v5

    .line 3051
    invoke-virtual/range {p4 .. p4}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    move-result-object v12

    sget-object v15, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    if-ne v12, v15, :cond_f

    goto :goto_4

    :cond_f
    invoke-static {v5}, Ljava/lang/Integer;->reverseBytes(I)I

    move-result v5

    :goto_4
    const/high16 v12, -0x200000

    and-int v15, v5, v12

    if-ne v15, v12, :cond_17

    ushr-int/lit8 v12, v5, 0x13

    and-int/2addr v12, v8

    if-ne v12, v6, :cond_10

    goto :goto_5

    :cond_10
    ushr-int/lit8 v15, v5, 0x11

    and-int/2addr v15, v8

    if-nez v15, :cond_11

    goto :goto_5

    :cond_11
    ushr-int/lit8 v16, v5, 0xc

    const/16 v10, 0xf

    and-int/lit8 v11, v16, 0xf

    ushr-int/lit8 v5, v5, 0xa

    and-int/2addr v5, v8

    if-eqz v11, :cond_17

    if-eq v11, v10, :cond_17

    if-ne v5, v8, :cond_12

    goto :goto_5

    :cond_12
    if-eq v15, v6, :cond_14

    if-eq v15, v13, :cond_15

    if-ne v15, v8, :cond_13

    const/16 v5, 0x180

    goto :goto_6

    .line 284
    :cond_13
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_14
    if-ne v12, v8, :cond_16

    :cond_15
    const/16 v5, 0x480

    goto :goto_6

    :cond_16
    const/16 v5, 0x240

    goto :goto_6

    :cond_17
    :goto_5
    const/4 v5, -0x1

    :goto_6
    if-eq v5, v14, :cond_18

    goto/16 :goto_11

    .line 1920
    :cond_18
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 1939
    :pswitch_2
    invoke-static/range {p4 .. p4}, Ll/ۛۜۧ;->֫(Ljava/nio/ByteBuffer;)I

    move-result v16

    goto/16 :goto_10

    :pswitch_3
    new-array v5, v8, [B

    .line 786
    invoke-virtual/range {p4 .. p4}, Ljava/nio/Buffer;->position()I

    move-result v10

    .line 787
    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 788
    invoke-virtual {v4, v10}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 789
    new-instance v10, Ll/ܽ֨֫;

    .line 48
    invoke-direct {v10, v5, v8}, Ll/ܽ֨֫;-><init>([BI)V

    .line 789
    invoke-static {v10}, Ll/ܰۜۧ;->֫(Ll/ܽ֨֫;)Ll/᩺ۜۧ;

    move-result-object v5

    iget v5, v5, Ll/᩺ۜۧ;->ۧ:I

    goto/16 :goto_11

    :pswitch_4
    const/16 v16, 0x200

    const/16 v5, 0x200

    goto/16 :goto_11

    .line 557
    :pswitch_5
    invoke-virtual/range {p4 .. p4}, Ljava/nio/Buffer;->position()I

    move-result v5

    .line 558
    invoke-virtual/range {p4 .. p4}, Ljava/nio/Buffer;->limit()I

    move-result v8

    add-int/lit8 v8, v8, -0xa

    move v10, v5

    :goto_7
    if-gt v10, v8, :cond_1b

    add-int/lit8 v11, v10, 0x4

    .line 561
    sget-object v12, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 3050
    invoke-virtual {v4, v11}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v11

    .line 3051
    invoke-virtual/range {p4 .. p4}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    move-result-object v12

    sget-object v13, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    if-ne v12, v13, :cond_19

    goto :goto_8

    :cond_19
    invoke-static {v11}, Ljava/lang/Integer;->reverseBytes(I)I

    move-result v11

    :goto_8
    and-int/lit8 v11, v11, -0x2

    const v12, -0x78d9046

    if-ne v11, v12, :cond_1a

    sub-int/2addr v10, v5

    goto :goto_9

    :cond_1a
    add-int/lit8 v10, v10, 0x1

    goto :goto_7

    :cond_1b
    const/4 v10, -0x1

    :goto_9
    if-ne v10, v14, :cond_1c

    const/16 v16, 0x0

    const/4 v5, 0x0

    goto/16 :goto_11

    .line 600
    :cond_1c
    invoke-virtual/range {p4 .. p4}, Ljava/nio/Buffer;->position()I

    move-result v5

    add-int/2addr v5, v10

    add-int/lit8 v5, v5, 0x7

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    and-int/lit16 v5, v5, 0xff

    const/16 v8, 0xbb

    if-ne v5, v8, :cond_1d

    const/4 v5, 0x1

    goto :goto_a

    :cond_1d
    const/4 v5, 0x0

    .line 601
    :goto_a
    invoke-virtual/range {p4 .. p4}, Ljava/nio/Buffer;->position()I

    move-result v8

    add-int/2addr v8, v10

    if-eqz v5, :cond_1e

    const/16 v5, 0x9

    goto :goto_b

    :cond_1e
    const/16 v5, 0x8

    :goto_b
    add-int/2addr v8, v5

    invoke-virtual {v4, v8}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    shr-int/lit8 v5, v5, 0x4

    and-int/lit8 v5, v5, 0x7

    const/16 v8, 0x28

    shl-int v5, v8, v5

    mul-int/lit8 v16, v5, 0x10

    goto/16 :goto_10

    .line 335
    :cond_1f
    :pswitch_6
    invoke-virtual {v4, v7}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v5

    const v8, -0xde4bec0

    if-eq v5, v8, :cond_25

    .line 336
    invoke-virtual {v4, v7}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v5

    const v8, -0x17bd3b8f

    if-ne v5, v8, :cond_20

    goto :goto_f

    .line 340
    :cond_20
    invoke-virtual {v4, v7}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v5

    const v8, 0x25205864

    if-ne v5, v8, :cond_21

    const/16 v16, 0x1000

    const/16 v5, 0x1000

    goto :goto_11

    .line 347
    :cond_21
    invoke-virtual/range {p4 .. p4}, Ljava/nio/Buffer;->position()I

    move-result v5

    .line 349
    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v8

    if-eq v8, v15, :cond_24

    if-eq v8, v14, :cond_23

    const/16 v10, 0x1f

    if-eq v8, v10, :cond_22

    add-int/lit8 v8, v5, 0x4

    .line 361
    invoke-virtual {v4, v8}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v8

    and-int/2addr v8, v6

    shl-int/lit8 v8, v8, 0x6

    add-int/lit8 v5, v5, 0x5

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    goto :goto_d

    :cond_22
    add-int/lit8 v8, v5, 0x5

    .line 357
    invoke-virtual {v4, v8}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v8

    and-int/lit8 v8, v8, 0x7

    shl-int/lit8 v8, v8, 0x4

    add-int/lit8 v5, v5, 0x6

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    goto :goto_c

    :cond_23
    add-int/lit8 v8, v5, 0x4

    .line 354
    invoke-virtual {v4, v8}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v8

    and-int/lit8 v8, v8, 0x7

    shl-int/lit8 v8, v8, 0x4

    add-int/lit8 v5, v5, 0x7

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    :goto_c
    and-int/lit8 v5, v5, 0x3c

    goto :goto_e

    :cond_24
    add-int/lit8 v8, v5, 0x5

    .line 351
    invoke-virtual {v4, v8}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v8

    and-int/2addr v8, v6

    shl-int/lit8 v8, v8, 0x6

    add-int/lit8 v5, v5, 0x4

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    :goto_d
    and-int/lit16 v5, v5, 0xfc

    :goto_e
    shr-int/2addr v5, v13

    or-int/2addr v5, v8

    add-int/2addr v5, v6

    mul-int/lit8 v16, v5, 0x20

    goto :goto_10

    :cond_25
    :goto_f
    :pswitch_7
    const/16 v5, 0x400

    goto :goto_11

    .line 1949
    :cond_26
    invoke-static/range {p4 .. p4}, Ll/ۘ۫ۡ;->֫(Ljava/nio/ByteBuffer;)I

    move-result v16

    :goto_10
    move/from16 v5, v16

    .line 1034
    :goto_11
    iput v5, v1, Ll/۠ۤ֫;->ۗ:I

    if-nez v5, :cond_27

    :goto_12
    return v6

    .line 1044
    :cond_27
    iget-object v5, v1, Ll/۠ۤ֫;->ۧ:Ll/ܺۤ֫;

    if-eqz v5, :cond_29

    .line 1045
    invoke-direct/range {p0 .. p0}, Ll/۠ۤ֫;->ۖ()Z

    move-result v5

    if-nez v5, :cond_28

    goto/16 :goto_15

    .line 1049
    :cond_28
    invoke-direct {v1, v2, v3}, Ll/۠ۤ֫;->֫(J)V

    const/4 v5, 0x0

    .line 1050
    iput-object v5, v1, Ll/۠ۤ֫;->ۧ:Ll/ܺۤ֫;

    .line 1054
    :cond_29
    iget-wide v10, v1, Ll/۠ۤ֫;->۠֫:J

    iget-object v5, v1, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    .line 1878
    iget v8, v5, Ll/ۢۤ֫;->᩷:I

    if-nez v8, :cond_2a

    .line 1879
    iget-wide v12, v1, Ll/۠ۤ֫;->ۙ֫:J

    iget v8, v5, Ll/ۢۤ֫;->ܳ:I

    int-to-long v14, v8

    div-long/2addr v12, v14

    goto :goto_13

    .line 1880
    :cond_2a
    iget-wide v12, v1, Ll/۠ۤ֫;->᩶֫:J

    .line 1057
    :goto_13
    iget-object v8, v1, Ll/۠ۤ֫;->۫֫:Ll/ۤۤ֫;

    invoke-virtual {v8}, Ll/ۤۤ֫;->᩷()J

    move-result-wide v14

    sub-long/2addr v12, v14

    .line 2370
    iget-object v5, v5, Ll/ۢۤ֫;->ܿ:Ll/۠ᩴ֫;

    iget v5, v5, Ll/۠ᩴ֫;->ܽ֫:I

    invoke-static {v5, v12, v13}, Ll/ۘ֨֫;->֫(IJ)J

    move-result-wide v12

    add-long/2addr v12, v10

    .line 1058
    iget-boolean v5, v1, Ll/۠ۤ֫;->᩸֫:Z

    if-nez v5, :cond_2c

    sub-long v10, v12, v2

    .line 1059
    invoke-static {v10, v11}, Ljava/lang/Math;->abs(J)J

    move-result-wide v10

    const-wide/32 v14, 0x30d40

    cmp-long v5, v10, v14

    if-lez v5, :cond_2c

    .line 1060
    iget-object v5, v1, Ll/۠ۤ֫;->֫֫:Ll/᩸۫֫;

    if-eqz v5, :cond_2b

    .line 1061
    new-instance v8, Ll/᩹۫֫;

    const-string v10, "Unexpected audio track timestamp discontinuity: expected "

    const-string v11, ", got "

    .line 0
    invoke-static {v10, v11, v12, v13}, Ll/۬֫ۢ;->֫(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    move-result-object v10

    .line 363
    invoke-virtual {v10, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v8, v10}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1061
    invoke-interface {v5, v8}, Ll/᩸۫֫;->֫(Ljava/lang/Exception;)V

    .line 1065
    :cond_2b
    iput-boolean v6, v1, Ll/۠ۤ֫;->᩸֫:Z

    .line 1067
    :cond_2c
    iget-boolean v5, v1, Ll/۠ۤ֫;->᩸֫:Z

    if-eqz v5, :cond_2e

    .line 1068
    invoke-direct/range {p0 .. p0}, Ll/۠ۤ֫;->ۖ()Z

    move-result v5

    if-nez v5, :cond_2d

    goto :goto_15

    :cond_2d
    sub-long v10, v2, v12

    .line 1075
    iget-wide v12, v1, Ll/۠ۤ֫;->۠֫:J

    add-long/2addr v12, v10

    iput-wide v12, v1, Ll/۠ۤ֫;->۠֫:J

    .line 1076
    iput-boolean v7, v1, Ll/۠ۤ֫;->᩸֫:Z

    .line 1078
    invoke-direct {v1, v2, v3}, Ll/۠ۤ֫;->֫(J)V

    .line 1079
    iget-object v5, v1, Ll/۠ۤ֫;->֫֫:Ll/᩸۫֫;

    if-eqz v5, :cond_2e

    const-wide/16 v12, 0x0

    cmp-long v8, v10, v12

    if-eqz v8, :cond_2e

    .line 1080
    invoke-interface {v5}, Ll/᩸۫֫;->ᩳ()V

    .line 1084
    :cond_2e
    iget-object v5, v1, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    iget v5, v5, Ll/ۢۤ֫;->᩷:I

    if-nez v5, :cond_2f

    .line 1085
    iget-wide v10, v1, Ll/۠ۤ֫;->ۙ֫:J

    invoke-virtual/range {p4 .. p4}, Ljava/nio/Buffer;->remaining()I

    move-result v5

    int-to-long v12, v5

    add-long/2addr v10, v12

    iput-wide v10, v1, Ll/۠ۤ֫;->ۙ֫:J

    goto :goto_14

    .line 1087
    :cond_2f
    iget-wide v10, v1, Ll/۠ۤ֫;->᩶֫:J

    iget v5, v1, Ll/۠ۤ֫;->ۗ:I

    int-to-long v12, v5

    int-to-long v14, v0

    mul-long v12, v12, v14

    add-long/2addr v12, v10

    iput-wide v12, v1, Ll/۠ۤ֫;->᩶֫:J

    .line 1090
    :goto_14
    iput-object v4, v1, Ll/۠ۤ֫;->ۛ:Ljava/nio/ByteBuffer;

    .line 1091
    iput v0, v1, Ll/۠ۤ֫;->ۨ:I

    .line 1094
    :cond_30
    invoke-direct {v1, v2, v3}, Ll/۠ۤ֫;->ܽ(J)V

    .line 1096
    iget-object v0, v1, Ll/۠ۤ֫;->ۛ:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_31

    const/4 v0, 0x0

    .line 1097
    iput-object v0, v1, Ll/۠ۤ֫;->ۛ:Ljava/nio/ByteBuffer;

    .line 1098
    iput v7, v1, Ll/۠ۤ֫;->ۨ:I

    return v6

    .line 1102
    :cond_31
    invoke-direct/range {p0 .. p0}, Ll/۠ۤ֫;->ۘ()J

    move-result-wide v2

    invoke-virtual {v9, v2, v3}, Ll/ۤ۫֫;->ܽ(J)Z

    move-result v0

    if-eqz v0, :cond_32

    const-string v0, "Resetting stalled audio track"

    .line 1103
    invoke-static {v0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    .line 1104
    invoke-virtual/range {p0 .. p0}, Ll/۠ۤ֫;->flush()V

    return v6

    :cond_32
    :goto_15
    return v7

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_2
        :pswitch_2
        :pswitch_6
        :pswitch_6
        :pswitch_1
        :pswitch_7
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xe
        :pswitch_5
        :pswitch_4
        :pswitch_7
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public final ֫(Ll/۠ᩴ֫;)Z
    .locals 0

    .line 683
    invoke-virtual {p0, p1}, Ll/۠ۤ֫;->ۧ(Ll/۠ᩴ֫;)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۜ()V
    .locals 1

    .line 1403
    iget-boolean v0, p0, Ll/۠ۤ֫;->۬:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Ll/۠ۤ֫;->᩵()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Ll/۠ۤ֫;->ۖ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1404
    invoke-direct {p0}, Ll/۠ۤ֫;->ۚ()V

    const/4 v0, 0x1

    .line 1405
    iput-boolean v0, p0, Ll/۠ۤ֫;->۬:Z

    :cond_0
    return-void
.end method

.method public final ۡ()V
    .locals 1

    .line 1666
    iget-object v0, p0, Ll/۠ۤ֫;->ܿ:Ll/᩷۫֫;

    if-eqz v0, :cond_0

    .line 1667
    invoke-virtual {v0}, Ll/᩷۫֫;->ۧ()V

    :cond_0
    return-void
.end method

.method public final ۢ()V
    .locals 1

    .line 1554
    iget-boolean v0, p0, Ll/۠ۤ֫;->ۙ:Z

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 1555
    iget-boolean v0, p0, Ll/۠ۤ֫;->ۤ֫:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 1556
    iput-boolean v0, p0, Ll/۠ۤ֫;->ۤ֫:Z

    .line 1557
    invoke-virtual {p0}, Ll/۠ۤ֫;->flush()V

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/۠ᩴ֫;)I
    .locals 4

    .line 688
    invoke-direct {p0}, Ll/۠ۤ֫;->֡()V

    .line 689
    iget-object v0, p1, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    iget v1, p1, Ll/۠ᩴ֫;->ۛ:I

    const-string v2, "audio/raw"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eqz v0, :cond_2

    .line 690
    invoke-static {v1}, Ll/ۘ֨֫;->ۜ(I)Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "Invalid PCM encoding: "

    .line 0
    invoke-static {v1, p1}, Ll/۠ۢ֡;->֫(ILjava/lang/String;)V

    return v2

    :cond_0
    if-eq v1, v3, :cond_3

    .line 694
    iget-boolean p1, p0, Ll/۠ۤ֫;->᩹:Z

    if-eqz p1, :cond_1

    const/4 p1, 0x4

    if-ne v1, p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1

    .line 702
    :cond_2
    iget-object v0, p0, Ll/۠ۤ֫;->ᩳ:Ll/ᩳ۫֫;

    iget-object v1, p0, Ll/۠ۤ֫;->ܽ:Ll/ᩳᩴ֫;

    .line 270
    invoke-virtual {v0, v1, p1}, Ll/ᩳ۫֫;->֫(Ll/ᩳᩴ֫;Ll/۠ᩴ֫;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_4

    :cond_3
    :goto_0
    return v3

    :cond_4
    return v2
.end method

.method public final ۧ(I)V
    .locals 2

    .line 1572
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 1573
    iput p1, p0, Ll/۠ۤ֫;->ܿ֫:I

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 1426
    invoke-direct {p0}, Ll/۠ۤ֫;->᩵()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Ll/۠ۤ֫;->۬:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/۠ۤ֫;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ܳ()V
    .locals 1

    .line 1563
    iget-boolean v0, p0, Ll/۠ۤ֫;->ۤ֫:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 1564
    iput-boolean v0, p0, Ll/۠ۤ֫;->ۤ֫:Z

    .line 1565
    invoke-virtual {p0}, Ll/۠ۤ֫;->flush()V

    :cond_0
    return-void
.end method

.method public final ܽ()Ll/ۖ᩵֫;
    .locals 1

    .line 1451
    iget-object v0, p0, Ll/۠ۤ֫;->ܺ֫:Ll/ۖ᩵֫;

    return-object v0
.end method

.method public final ܽ(Ll/۠ᩴ֫;)Ll/ܺ۫֫;
    .locals 2

    .line 710
    iget-boolean v0, p0, Ll/۠ۤ֫;->ᩳ֫:Z

    if-eqz v0, :cond_0

    .line 711
    sget-object p1, Ll/ܺ۫֫;->ᩳ:Ll/ܺ۫֫;

    return-object p1

    .line 713
    :cond_0
    iget-object v0, p0, Ll/۠ۤ֫;->ܳ:Ll/ܳۤ֫;

    iget-object v1, p0, Ll/۠ۤ֫;->ܽ:Ll/ᩳᩴ֫;

    invoke-interface {v0, v1, p1}, Ll/ܳۤ֫;->֫(Ll/ᩳᩴ֫;Ll/۠ᩴ֫;)Ll/ܺ۫֫;

    move-result-object p1

    return-object p1
.end method

.method public final ܿ()V
    .locals 1

    const/4 v0, 0x1

    .line 935
    iput-boolean v0, p0, Ll/۠ۤ֫;->ۘ֫:Z

    .line 936
    invoke-direct {p0}, Ll/۠ۤ֫;->᩵()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 937
    iget-object v0, p0, Ll/۠ۤ֫;->ܺ:Ll/ۤ۫֫;

    invoke-virtual {v0}, Ll/ۤ۫֫;->ܳ()V

    .line 938
    iget-boolean v0, p0, Ll/۠ۤ֫;->᩹֫:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    invoke-static {v0}, Ll/۠ۤ֫;->֫(Landroid/media/AudioTrack;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 939
    :cond_0
    iget-object v0, p0, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V

    :cond_1
    return-void
.end method

.method public final ᩳ()J
    .locals 10

    .line 1538
    invoke-direct {p0}, Ll/۠ۤ֫;->᩵()Z

    move-result v0

    if-nez v0, :cond_0

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0

    .line 1541
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_1

    .line 1542
    iget-object v0, p0, Ll/۠ۤ֫;->ۢ:Landroid/media/AudioTrack;

    iget-object v1, p0, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    invoke-static {v0, v1}, Ll/ᩳۤ֫;->֫(Landroid/media/AudioTrack;Ll/ۢۤ֫;)J

    move-result-wide v0

    return-wide v0

    .line 1545
    :cond_1
    iget-object v0, p0, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    iget v1, v0, Ll/ۢۤ֫;->᩷:I

    if-nez v1, :cond_2

    .line 1546
    iget v1, v0, Ll/ۢۤ֫;->ۡ:I

    int-to-long v1, v1

    iget v0, v0, Ll/ۢۤ֫;->ۢ:I

    int-to-long v3, v0

    mul-long v1, v1, v3

    :goto_0
    move-wide v7, v1

    goto :goto_2

    .line 1547
    :cond_2
    iget v0, v0, Ll/ۢۤ֫;->ۜ:I

    .line 2466
    invoke-static {v0}, Ll/᩹᩷ۧ;->֫(I)I

    move-result v0

    const v1, -0x7fffffff

    if-eq v0, v1, :cond_3

    const/4 v1, 0x1

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    .line 2467
    :goto_1
    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    int-to-long v1, v0

    goto :goto_0

    .line 1548
    :goto_2
    iget-object v0, p0, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    iget v0, v0, Ll/ۢۤ֫;->ۧ:I

    int-to-long v3, v0

    const-wide/32 v5, 0xf4240

    sget-object v9, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    invoke-static/range {v3 .. v9}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ᩷()V
    .locals 1

    const/4 v0, 0x1

    .line 946
    iput-boolean v0, p0, Ll/۠ۤ֫;->᩸֫:Z

    return-void
.end method

.method public final ᩻()J
    .locals 8

    .line 718
    invoke-direct {p0}, Ll/۠ۤ֫;->᩵()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-boolean v0, p0, Ll/۠ۤ֫;->ܶ֫:Z

    if-eqz v0, :cond_0

    goto/16 :goto_2

    .line 721
    :cond_0
    iget-object v0, p0, Ll/۠ۤ֫;->ܺ:Ll/ۤ۫֫;

    invoke-virtual {v0}, Ll/ۤ۫֫;->ۧ()J

    move-result-wide v0

    .line 722
    iget-object v2, p0, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    invoke-direct {p0}, Ll/۠ۤ֫;->ۘ()J

    move-result-wide v3

    .line 2374
    iget v2, v2, Ll/ۢۤ֫;->ۡ:I

    invoke-static {v2, v3, v4}, Ll/ۘ֨֫;->֫(IJ)J

    move-result-wide v2

    .line 722
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    .line 1818
    :goto_0
    iget-object v2, p0, Ll/۠ۤ֫;->ܽ֫:Ljava/util/ArrayDeque;

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    .line 1819
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܺۤ֫;

    iget-wide v3, v3, Ll/ܺۤ֫;->֫:J

    cmp-long v5, v0, v3

    if-ltz v5, :cond_1

    .line 1821
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܺۤ֫;

    iput-object v2, p0, Ll/۠ۤ֫;->ۧ֫:Ll/ܺۤ֫;

    goto :goto_0

    .line 1824
    :cond_1
    iget-object v3, p0, Ll/۠ۤ֫;->ۧ֫:Ll/ܺۤ֫;

    iget-wide v4, v3, Ll/ܺۤ֫;->֫:J

    sub-long/2addr v0, v4

    .line 1826
    iget-object v3, v3, Ll/ܺۤ֫;->ᩳ:Ll/ۖ᩵֫;

    iget v3, v3, Ll/ۖ᩵֫;->ܽ:F

    .line 1827
    invoke-static {v0, v1, v3}, Ll/ۘ֨֫;->֫(JF)J

    move-result-wide v3

    .line 1829
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    iget-object v5, p0, Ll/۠ۤ֫;->ۜ:Ll/ۚ֡֫;

    if-eqz v2, :cond_2

    .line 1831
    move-object v2, v5

    check-cast v2, Ll/ۡۤ֫;

    invoke-virtual {v2, v0, v1}, Ll/ۡۤ֫;->֫(J)J

    move-result-wide v0

    .line 1832
    iget-object v2, p0, Ll/۠ۤ֫;->ۧ֫:Ll/ܺۤ֫;

    iget-wide v6, v2, Ll/ܺۤ֫;->ܽ:J

    add-long/2addr v6, v0

    sub-long/2addr v0, v3

    .line 1834
    iput-wide v0, v2, Ll/ܺۤ֫;->ۧ:J

    goto :goto_1

    .line 1842
    :cond_2
    iget-object v0, p0, Ll/۠ۤ֫;->ۧ֫:Ll/ܺۤ֫;

    iget-wide v1, v0, Ll/ܺۤ֫;->ܽ:J

    add-long/2addr v1, v3

    iget-wide v3, v0, Ll/ܺۤ֫;->ۧ:J

    add-long v6, v1, v3

    .line 1850
    :goto_1
    check-cast v5, Ll/ۡۤ֫;

    invoke-virtual {v5}, Ll/ۡۤ֫;->ۧ()J

    move-result-wide v0

    .line 1851
    iget-object v2, p0, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    .line 2374
    iget v2, v2, Ll/ۢۤ֫;->ۡ:I

    invoke-static {v2, v0, v1}, Ll/ۘ֨֫;->֫(IJ)J

    move-result-wide v2

    add-long/2addr v2, v6

    .line 1853
    iget-wide v4, p0, Ll/۠ۤ֫;->֨֫:J

    cmp-long v6, v0, v4

    if-lez v6, :cond_4

    .line 1854
    iget-object v6, p0, Ll/۠ۤ֫;->֨:Ll/ۢۤ֫;

    sub-long v4, v0, v4

    .line 2374
    iget v6, v6, Ll/ۢۤ֫;->ۡ:I

    invoke-static {v6, v4, v5}, Ll/ۘ֨֫;->֫(IJ)J

    move-result-wide v4

    .line 1857
    iput-wide v0, p0, Ll/۠ۤ֫;->֨֫:J

    .line 1864
    iget-wide v0, p0, Ll/۠ۤ֫;->֫:J

    add-long/2addr v0, v4

    iput-wide v0, p0, Ll/۠ۤ֫;->֫:J

    .line 1865
    iget-object v0, p0, Ll/۠ۤ֫;->֡֫:Landroid/os/Handler;

    if-nez v0, :cond_3

    .line 1866
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Ll/۠ۤ֫;->֡֫:Landroid/os/Handler;

    .line 1868
    :cond_3
    iget-object v0, p0, Ll/۠ۤ֫;->֡֫:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 1869
    iget-object v0, p0, Ll/۠ۤ֫;->֡֫:Landroid/os/Handler;

    new-instance v1, Ll/۠ۛᩳ;

    const/4 v4, 0x1

    invoke-direct {v1, v4, p0}, Ll/۠ۛᩳ;-><init>(ILjava/lang/Object;)V

    const-wide/16 v4, 0x64

    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_4
    return-wide v2

    :cond_5
    :goto_2
    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0
.end method
