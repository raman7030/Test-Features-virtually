.class public final Ll/᩸ܶۜ;
.super Ljava/lang/Object;
.source "W8GL"

# interfaces
.implements Ll/ۚ᩶ۜ;


# instance fields
.field public ۖ:Z

.field public ۘ:Ll/ܶܶۜ;

.field public ۜ:Z

.field public ۡ:Z

.field public final ۢ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public volatile ۧ:I

.field public final ܳ:Ll/᩵᩶ۜ;

.field public ܺ:Ll/ۧ᩵֫;

.field public ܽ:Ll/ܶܶۜ;

.field public ܿ:I

.field public final ᩳ:Ll/ܽۚۜ;

.field public ᩴ:Z

.field public final ᩵:Ll/ᩴܶۜ;

.field public final ᩷:Landroid/media/MediaPlayer;

.field public ᩻:I


# direct methods
.method public constructor <init>(Ll/ܽۚۜ;Ll/᩵᩶ۜ;)V
    .locals 2

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Landroid/media/MediaPlayer;

    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    iput-object v0, p0, Ll/᩸ܶۜ;->᩷:Landroid/media/MediaPlayer;

    const/4 v1, 0x1

    .line 35
    iput-boolean v1, p0, Ll/᩸ܶۜ;->ۜ:Z

    const/4 v1, -0x1

    .line 36
    iput v1, p0, Ll/᩸ܶۜ;->ܿ:I

    .line 43
    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v1, p0, Ll/᩸ܶۜ;->ۢ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 51
    iput-object p2, p0, Ll/᩸ܶۜ;->ܳ:Ll/᩵᩶ۜ;

    .line 52
    iput-object p1, p0, Ll/᩸ܶۜ;->ᩳ:Ll/ܽۚۜ;

    .line 53
    new-instance p1, Ll/ۘܶۜ;

    invoke-direct {p1, p0, p2}, Ll/ۘܶۜ;-><init>(Ll/᩸ܶۜ;Ll/᩵᩶ۜ;)V

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 60
    new-instance p1, Ll/ᩴܶۜ;

    const/4 v1, 0x0

    invoke-direct {p1, v1, p0}, Ll/ᩴܶۜ;-><init>(ILjava/lang/Object;)V

    iput-object p1, p0, Ll/᩸ܶۜ;->᩵:Ll/ᩴܶۜ;

    .line 68
    new-instance p1, Ll/᩵ܶۜ;

    invoke-direct {p1, p0, p2}, Ll/᩵ܶۜ;-><init>(Ll/᩸ܶۜ;Ll/᩵᩶ۜ;)V

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 76
    new-instance p1, Ll/֡ܶۜ;

    invoke-direct {p1, p0}, Ll/֡ܶۜ;-><init>(Ll/᩸ܶۜ;)V

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setOnSeekCompleteListener(Landroid/media/MediaPlayer$OnSeekCompleteListener;)V

    return-void
.end method

.method public static ֫(Ll/᩸ܶۜ;)V
    .locals 6

    move-object v0, p0

    .line 61
    monitor-enter v0

    .line 62
    :try_start_0
    invoke-virtual {p0}, Ll/᩸ܶۜ;->isPlaying()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 100
    iget-object v1, p0, Ll/᩸ܶۜ;->᩷:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v1

    .line 101
    iget v2, p0, Ll/᩸ܶۜ;->ܿ:I

    if-eq v1, v2, :cond_0

    iget v2, p0, Ll/᩸ܶۜ;->᩻:I

    if-lt v1, v2, :cond_0

    .line 102
    iput v1, p0, Ll/᩸ܶۜ;->᩻:I

    iput v1, p0, Ll/᩸ܶۜ;->ܿ:I

    .line 103
    iget-object v2, p0, Ll/᩸ܶۜ;->ܳ:Ll/᩵᩶ۜ;

    check-cast v2, Ll/֡᩶ۜ;

    invoke-virtual {v2, v1}, Ll/֡᩶ۜ;->ۧ(I)V

    .line 108
    :cond_0
    invoke-static {}, Ll/ۙ᩸᩷;->ۢ()Landroid/os/Handler;

    move-result-object v1

    iget-object p0, p0, Ll/᩸ܶۜ;->᩵:Ll/ᩴܶۜ;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    const-wide/16 v4, 0xa

    add-long/2addr v2, v4

    invoke-virtual {v1, p0, p0, v2, v3}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    .line 66
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ֫(Ll/᩸ܶۜ;ILl/ۧ᩵֫;)V
    .locals 12

    .line 173
    iget-object v1, p0, Ll/᩸ܶۜ;->ᩳ:Ll/ܽۚۜ;

    iget-object v2, p0, Ll/᩸ܶۜ;->᩷:Landroid/media/MediaPlayer;

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 175
    :try_start_0
    invoke-direct {p0, p1}, Ll/᩸ܶۜ;->֫(I)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    .line 178
    :cond_0
    iput-boolean v3, p0, Ll/᩸ܶۜ;->ۡ:Z

    move-object v0, p0

    .line 0
    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 349
    :try_start_1
    iput-object v4, p0, Ll/᩸ܶۜ;->ܽ:Ll/ܶܶۜ;

    .line 350
    iput-object v4, p0, Ll/᩸ܶۜ;->ۘ:Ll/ܶܶۜ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 351
    :try_start_2
    monitor-exit v0

    .line 180
    invoke-virtual {v2}, Landroid/media/MediaPlayer;->reset()V

    .line 181
    invoke-static {p2}, Ll/ᩳۚۜ;->֫(Ll/ۧ᩵֫;)Ll/ᩳۜܳ;

    move-result-object v0

    .line 182
    invoke-virtual {v1, v0}, Ll/ܽۚۜ;->ܽ(Ll/ᩳۜܳ;)V

    .line 183
    invoke-direct {p0, p1}, Ll/᩸ܶۜ;->֫(I)Z

    move-result v5

    if-nez v5, :cond_1

    goto/16 :goto_0

    .line 186
    :cond_1
    invoke-virtual {v1, v0}, Ll/ܽۚۜ;->ۧ(Ll/ᩳۜܳ;)Ll/᩻ۖܽ;

    move-result-object v4

    .line 187
    new-instance v5, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v5}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 188
    new-instance v6, Ll/۠ܶۜ;

    invoke-direct {v6, v4, v3}, Ll/۠ܶۜ;-><init>(Ll/᩻ۖܽ;Z)V

    invoke-virtual {v5, v6}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/media/MediaDataSource;)V

    .line 189
    new-instance v6, Ll/ܶ᩸ۜ;

    invoke-direct {v6, p2, v5}, Ll/ܶ᩸ۜ;-><init>(Ll/ۧ᩵֫;Landroid/media/MediaMetadataRetriever;)V

    .line 190
    invoke-static {v5}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 191
    iget-boolean v5, v6, Ll/ܶ᩸ۜ;->ܽ:Z

    if-eqz v5, :cond_2

    .line 193
    invoke-static {v4}, Ll/ۢۛۜ;->֫(Ll/᩻ۖܽ;)Ll/ۢۛۜ;

    move-result-object v5

    if-eqz v5, :cond_2

    .line 195
    new-instance v6, Ll/ܶ᩸ۜ;

    invoke-virtual {v5}, Ll/ۢۛۜ;->ᩳ()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5}, Ll/ۢۛۜ;->֫()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5}, Ll/ۢۛۜ;->ܽ()[B

    move-result-object v5

    invoke-direct {v6, p2, v7, v8, v5}, Ll/ܶ᩸ۜ;-><init>(Ll/ۧ᩵֫;Ljava/lang/CharSequence;Ljava/lang/CharSequence;[B)V

    :cond_2
    move-object v9, v6

    .line 198
    invoke-direct {p0, p1}, Ll/᩸ܶۜ;->֫(I)Z

    move-result v5

    if-nez v5, :cond_3

    .line 199
    invoke-static {v4}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-void

    .line 202
    :cond_3
    new-instance v5, Ll/۠ܶۜ;

    const/4 v6, 0x1

    invoke-direct {v5, v4, v6}, Ll/۠ܶۜ;-><init>(Ll/᩻ۖܽ;Z)V

    invoke-virtual {v2, v5}, Landroid/media/MediaPlayer;->setDataSource(Landroid/media/MediaDataSource;)V

    .line 203
    invoke-virtual {v2}, Landroid/media/MediaPlayer;->prepare()V

    .line 204
    invoke-direct {p0, p1}, Ll/᩸ܶۜ;->֫(I)Z

    move-result v5

    if-nez v5, :cond_4

    .line 205
    invoke-static {v4}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-void

    .line 208
    :cond_4
    invoke-virtual {v2, v3}, Landroid/media/MediaPlayer;->setLooping(Z)V

    const/4 v5, -0x1

    .line 209
    iput v5, p0, Ll/᩸ܶۜ;->ܿ:I

    .line 210
    iput v3, p0, Ll/᩸ܶۜ;->᩻:I

    .line 211
    iput-object p2, p0, Ll/᩸ܶۜ;->ܺ:Ll/ۧ᩵֫;

    .line 212
    iput-boolean v3, p0, Ll/᩸ܶۜ;->ۖ:Z

    .line 213
    iput-boolean v6, p0, Ll/᩸ܶۜ;->ۡ:Z

    .line 215
    invoke-virtual {v2}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v2

    int-to-long v10, v2

    .line 134
    new-instance v2, Ll/֨ܶۜ;

    move-object v5, v2

    move-object v6, p0

    move v7, p1

    move-object v8, p2

    invoke-direct/range {v5 .. v11}, Ll/֨ܶۜ;-><init>(Ll/᩸ܶۜ;ILl/ۧ᩵֫;Ll/ܶ᩸ۜ;J)V

    invoke-static {v2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    .line 217
    invoke-direct {p0, p1}, Ll/᩸ܶۜ;->֫(I)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 218
    invoke-virtual {v1, v0}, Ll/ܽۚۜ;->ᩳ(Ll/ᩳۜܳ;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catchall_0
    move-exception v1

    .line 351
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception v0

    move-object v9, v0

    if-eqz v4, :cond_5

    .line 222
    invoke-static {v4}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 224
    :cond_5
    invoke-direct {p0, p1}, Ll/᩸ܶۜ;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 225
    iput-boolean v3, p0, Ll/᩸ܶۜ;->ۖ:Z

    .line 142
    new-instance v0, Ll/ܿ᩶ۜ;

    const/4 v10, 0x1

    move-object v5, v0

    move-object v6, p0

    move v7, p1

    move-object v8, p2

    invoke-direct/range {v5 .. v10}, Ll/ܿ᩶ۜ;-><init>(Ljava/lang/Object;ILl/ۧ᩵֫;Ljava/lang/Object;I)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    :cond_6
    :goto_0
    return-void
.end method

.method public static synthetic ֫(Ll/᩸ܶۜ;ILl/ۧ᩵֫;Ljava/lang/Exception;)V
    .locals 0

    .line 143
    invoke-direct {p0, p1}, Ll/᩸ܶۜ;->֫(I)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 144
    iget-object p0, p0, Ll/᩸ܶۜ;->ܳ:Ll/᩵᩶ۜ;

    check-cast p0, Ll/ۡ֡ۜ;

    invoke-virtual {p0, p2, p3}, Ll/ۡ֡ۜ;->ۧ(Ll/ۧ᩵֫;Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/᩸ܶۜ;ILl/ۧ᩵֫;Ll/ܶ᩸ۜ;J)V
    .locals 0

    .line 135
    invoke-direct {p0, p1}, Ll/᩸ܶۜ;->֫(I)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 136
    iget-object p0, p0, Ll/᩸ܶۜ;->ܳ:Ll/᩵᩶ۜ;

    check-cast p0, Ll/ۡ֡ۜ;

    invoke-virtual {p0, p2, p3, p4, p5}, Ll/ۡ֡ۜ;->֫(Ll/ۧ᩵֫;Ll/ܶ᩸ۜ;J)V

    :cond_0
    return-void
.end method

.method public static ֫(Ll/᩸ܶۜ;Ll/᩵᩶ۜ;)V
    .locals 3

    move-object v0, p0

    .line 54
    monitor-enter v0

    .line 112
    :try_start_0
    invoke-static {}, Ll/ۙ᩸᩷;->ۢ()Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Ll/᩸ܶۜ;->᩵:Ll/ᩴܶۜ;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 100
    iget-object v1, p0, Ll/᩸ܶۜ;->᩷:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v1

    .line 101
    iget v2, p0, Ll/᩸ܶۜ;->ܿ:I

    if-eq v1, v2, :cond_0

    iget v2, p0, Ll/᩸ܶۜ;->᩻:I

    if-lt v1, v2, :cond_0

    .line 102
    iput v1, p0, Ll/᩸ܶۜ;->᩻:I

    iput v1, p0, Ll/᩸ܶۜ;->ܿ:I

    .line 103
    iget-object p0, p0, Ll/᩸ܶۜ;->ܳ:Ll/᩵᩶ۜ;

    check-cast p0, Ll/֡᩶ۜ;

    invoke-virtual {p0, v1}, Ll/֡᩶ۜ;->ۧ(I)V

    .line 57
    :cond_0
    check-cast p1, Ll/֡᩶ۜ;

    invoke-virtual {p1}, Ll/֡᩶ۜ;->֫()V

    .line 58
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method private ֫(I)Z
    .locals 1

    if-eqz p1, :cond_0

    .line 369
    iget-boolean v0, p0, Ll/᩸ܶۜ;->ᩴ:Z

    if-nez v0, :cond_0

    .line 130
    iget v0, p0, Ll/᩸ܶۜ;->ۧ:I

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Ll/᩸ܶۜ;->ۢ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static synthetic ֫(Ll/᩸ܶۜ;Ll/᩵᩶ۜ;II)Z
    .locals 3

    .line 69
    iget-boolean v0, p0, Ll/᩸ܶۜ;->ۡ:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩸ܶۜ;->ܺ:Ll/ۧ᩵֫;

    if-eqz v0, :cond_0

    .line 70
    iput-boolean v1, p0, Ll/᩸ܶۜ;->ۡ:Z

    .line 71
    new-instance p0, Ljava/lang/Exception;

    const-string v1, "MediaPlayer error: what="

    const-string v2, ", extra="

    .line 0
    invoke-static {v1, p2, p3, v2}, Ll/ᩳ᩷ᩳ;->֫(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 71
    invoke-direct {p0, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    check-cast p1, Ll/ۡ֡ۜ;

    invoke-virtual {p1, v0, p0}, Ll/ۡ֡ۜ;->֫(Ll/ۧ᩵֫;Ljava/lang/Exception;)V

    const/4 p0, 0x1

    return p0

    :cond_0
    return v1
.end method

.method public static synthetic ۧ(Ll/᩸ܶۜ;)V
    .locals 4

    move-object v0, p0

    .line 78
    monitor-enter v0

    .line 79
    :try_start_0
    iget-object v1, p0, Ll/᩸ܶۜ;->ܽ:Ll/ܶܶۜ;

    if-nez v1, :cond_0

    .line 81
    monitor-exit v0

    return-void

    .line 83
    :cond_0
    iget-object v2, p0, Ll/᩸ܶۜ;->ۘ:Ll/ܶܶۜ;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    .line 85
    iput-object v2, p0, Ll/᩸ܶۜ;->ܽ:Ll/ܶܶۜ;

    .line 86
    iput-object v3, p0, Ll/᩸ܶۜ;->ۘ:Ll/ܶܶۜ;

    .line 87
    iget-object p0, p0, Ll/᩸ܶۜ;->᩷:Landroid/media/MediaPlayer;

    invoke-virtual {v2}, Ll/ܶܶۜ;->position()I

    move-result v2

    invoke-virtual {p0, v2}, Landroid/media/MediaPlayer;->seekTo(I)V

    goto :goto_0

    .line 89
    :cond_1
    iput-object v3, p0, Ll/᩸ܶۜ;->ܽ:Ll/ܶܶۜ;

    .line 91
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    invoke-virtual {v1}, Ll/ܶܶۜ;->֫()Ljava/lang/Runnable;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 94
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    :cond_2
    return-void

    :catchall_0
    move-exception p0

    .line 91
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method


# virtual methods
.method public final getCurrentPosition()I
    .locals 3

    .line 374
    iget-boolean v0, p0, Ll/᩸ܶۜ;->ۡ:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p0

    .line 320
    monitor-enter v0

    .line 322
    :try_start_0
    iget-object v2, p0, Ll/᩸ܶۜ;->᩷:Landroid/media/MediaPlayer;

    invoke-virtual {v2}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v2

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 324
    :catch_0
    monitor-exit v0

    :goto_0
    return v1

    .line 326
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final isPlaying()Z
    .locals 1

    .line 391
    :try_start_0
    iget-boolean v0, p0, Ll/᩸ܶۜ;->ۡ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩸ܶۜ;->᩷:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :catch_0
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final pause()V
    .locals 2

    .line 369
    iget-boolean v0, p0, Ll/᩸ܶۜ;->ᩴ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 379
    :cond_0
    iget-boolean v0, p0, Ll/᩸ܶۜ;->ۖ:Z

    if-eqz v0, :cond_1

    goto :goto_0

    .line 374
    :cond_1
    iget-boolean v0, p0, Ll/᩸ܶۜ;->ۡ:Z

    if-eqz v0, :cond_3

    .line 266
    :try_start_0
    iget-boolean v0, p0, Ll/᩸ܶۜ;->ۜ:Z

    if-nez v0, :cond_2

    .line 112
    invoke-static {}, Ll/ۙ᩸᩷;->ۢ()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Ll/᩸ܶۜ;->᩵:Ll/ᩴܶۜ;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 268
    iget-object v0, p0, Ll/᩸ܶۜ;->᩷:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    const/4 v0, 0x1

    .line 269
    iput-boolean v0, p0, Ll/᩸ܶۜ;->ۜ:Z

    .line 270
    iget-object v0, p0, Ll/᩸ܶۜ;->ܳ:Ll/᩵᩶ۜ;

    check-cast v0, Ll/֡᩶ۜ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/֡᩶ۜ;->ۧ(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    :goto_0
    return-void

    .line 384
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "MusicPlayer is not prepared"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final reset()V
    .locals 3

    const/4 v1, 0x0

    .line 125
    iput v1, p0, Ll/᩸ܶۜ;->ۧ:I

    .line 126
    iget-object v0, p0, Ll/᩸ܶۜ;->ۢ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-object v0, p0

    .line 0
    monitor-enter v0

    const/4 v2, 0x0

    .line 349
    :try_start_0
    iput-object v2, p0, Ll/᩸ܶۜ;->ܽ:Ll/ܶܶۜ;

    .line 350
    iput-object v2, p0, Ll/᩸ܶۜ;->ۘ:Ll/ܶܶۜ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 351
    monitor-exit v0

    .line 281
    iput-boolean v1, p0, Ll/᩸ܶۜ;->ۖ:Z

    .line 282
    iput-boolean v1, p0, Ll/᩸ܶۜ;->ۡ:Z

    const/4 v0, 0x1

    .line 283
    iput-boolean v0, p0, Ll/᩸ܶۜ;->ۜ:Z

    .line 284
    iput-object v2, p0, Ll/᩸ܶۜ;->ܺ:Ll/ۧ᩵֫;

    .line 112
    invoke-static {}, Ll/ۙ᩸᩷;->ۢ()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Ll/᩸ܶۜ;->᩵:Ll/ᩴܶۜ;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 287
    :try_start_1
    iget-object v0, p0, Ll/᩸ܶۜ;->᩷:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void

    :catchall_0
    move-exception v1

    .line 351
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final start()V
    .locals 7

    .line 369
    iget-boolean v0, p0, Ll/᩸ܶۜ;->ᩴ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 379
    :cond_0
    iget-boolean v0, p0, Ll/᩸ܶۜ;->ۖ:Z

    if-eqz v0, :cond_1

    goto :goto_0

    .line 374
    :cond_1
    iget-boolean v0, p0, Ll/᩸ܶۜ;->ۡ:Z

    if-eqz v0, :cond_3

    .line 242
    :try_start_0
    invoke-virtual {p0}, Ll/᩸ܶۜ;->isPlaying()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_2

    .line 108
    invoke-static {}, Ll/ۙ᩸᩷;->ۢ()Landroid/os/Handler;

    move-result-object v0

    iget-object v2, p0, Ll/᩸ܶۜ;->᩵:Ll/ᩴܶۜ;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    const-wide/16 v5, 0xa

    add-long/2addr v3, v5

    invoke-virtual {v0, v2, v2, v3, v4}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    .line 244
    iget-object v0, p0, Ll/᩸ܶۜ;->᩷:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 245
    iput-boolean v1, p0, Ll/᩸ܶۜ;->ۜ:Z

    .line 246
    iget-object v0, p0, Ll/᩸ܶۜ;->ܳ:Ll/᩵᩶ۜ;

    check-cast v0, Ll/֡᩶ۜ;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ll/֡᩶ۜ;->ۧ(Z)V

    .line 247
    sget-object v0, Ll/ᩳ᩹ۜ;->ۨ:[F

    invoke-static {}, Ll/ᩳ᩹ۜ;->ܺ()I

    move-result v1

    aget v0, v0, v1

    invoke-virtual {p0, v0}, Ll/᩸ܶۜ;->֫(F)V

    return-void

    .line 249
    :cond_2
    iput-boolean v1, p0, Ll/᩸ܶۜ;->ۜ:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    return-void

    .line 384
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "MusicPlayer is not prepared"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫()V
    .locals 5

    .line 331
    iget-object v1, p0, Ll/᩸ܶۜ;->᩷:Landroid/media/MediaPlayer;

    .line 369
    iget-boolean v0, p0, Ll/᩸ܶۜ;->ᩴ:Z

    if-nez v0, :cond_1

    const/4 v2, 0x0

    .line 125
    iput v2, p0, Ll/᩸ܶۜ;->ۧ:I

    .line 126
    iget-object v0, p0, Ll/᩸ܶۜ;->ۢ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-object v0, p0

    .line 0
    monitor-enter v0

    const/4 v3, 0x0

    .line 349
    :try_start_0
    iput-object v3, p0, Ll/᩸ܶۜ;->ܽ:Ll/ܶܶۜ;

    .line 350
    iput-object v3, p0, Ll/᩸ܶۜ;->ۘ:Ll/ܶܶۜ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 351
    monitor-exit v0

    .line 112
    invoke-static {}, Ll/ۙ᩸᩷;->ۢ()Landroid/os/Handler;

    move-result-object v0

    iget-object v4, p0, Ll/᩸ܶۜ;->᩵:Ll/ᩴܶۜ;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 335
    invoke-virtual {p0}, Ll/᩸ܶۜ;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 336
    invoke-virtual {v1}, Landroid/media/MediaPlayer;->stop()V

    .line 338
    :cond_0
    iput-boolean v2, p0, Ll/᩸ܶۜ;->ۖ:Z

    .line 339
    iput-boolean v2, p0, Ll/᩸ܶۜ;->ۡ:Z

    .line 340
    iput-object v3, p0, Ll/᩸ܶۜ;->ܺ:Ll/ۧ᩵֫;

    const/4 v0, 0x1

    .line 341
    iput-boolean v0, p0, Ll/᩸ܶۜ;->ᩴ:Z

    .line 342
    sget-object v0, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ll/۟ۤᩳ;

    const/4 v3, 0x5

    invoke-direct {v2, v3, v1}, Ll/۟ۤᩳ;-><init>(ILjava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 343
    iget-object v0, p0, Ll/᩸ܶۜ;->ᩳ:Ll/ܽۚۜ;

    .line 692
    invoke-virtual {v0}, Ll/ܽۚۜ;->ܿ()V

    .line 693
    invoke-virtual {v0}, Ll/ܽۚۜ;->ܽ()V

    return-void

    :catchall_0
    move-exception v1

    .line 351
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    :cond_1
    return-void
.end method

.method public final ֫(F)V
    .locals 2

    .line 374
    iget-boolean v0, p0, Ll/᩸ܶۜ;->ۡ:Z

    if-eqz v0, :cond_0

    .line 356
    iget-boolean v0, p0, Ll/᩸ܶۜ;->ۜ:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/᩸ܶۜ;->᩷:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getPlaybackParams()Landroid/media/PlaybackParams;

    move-result-object v1

    invoke-virtual {v1}, Landroid/media/PlaybackParams;->getSpeed()F

    move-result v1

    cmpl-float v1, v1, p1

    if-eqz v1, :cond_0

    .line 357
    new-instance v1, Landroid/media/PlaybackParams;

    invoke-direct {v1}, Landroid/media/PlaybackParams;-><init>()V

    .line 358
    invoke-virtual {v1, p1}, Landroid/media/PlaybackParams;->setSpeed(F)Landroid/media/PlaybackParams;

    .line 360
    :try_start_0
    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setPlaybackParams(Landroid/media/PlaybackParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public final ֫(ILl/ܽ᩶ۜ;)V
    .locals 2

    .line 374
    iget-boolean v0, p0, Ll/᩸ܶۜ;->ۡ:Z

    if-eqz v0, :cond_2

    move-object v0, p0

    .line 296
    monitor-enter v0

    .line 297
    :try_start_0
    iput p1, p0, Ll/᩸ܶۜ;->᩻:I

    .line 298
    iget-object v1, p0, Ll/᩸ܶۜ;->ܽ:Ll/ܶܶۜ;

    if-eqz v1, :cond_1

    .line 299
    invoke-virtual {v1}, Ll/ܶܶۜ;->position()I

    move-result v1

    if-ne p1, v1, :cond_0

    .line 301
    new-instance v1, Ll/ܶܶۜ;

    invoke-direct {v1, p1, p2}, Ll/ܶܶۜ;-><init>(ILjava/lang/Runnable;)V

    iput-object v1, p0, Ll/᩸ܶۜ;->ܽ:Ll/ܶܶۜ;

    const/4 p1, 0x0

    .line 302
    iput-object p1, p0, Ll/᩸ܶۜ;->ۘ:Ll/ܶܶۜ;

    goto :goto_0

    .line 305
    :cond_0
    new-instance v1, Ll/ܶܶۜ;

    invoke-direct {v1, p1, p2}, Ll/ܶܶۜ;-><init>(ILjava/lang/Runnable;)V

    iput-object v1, p0, Ll/᩸ܶۜ;->ۘ:Ll/ܶܶۜ;

    goto :goto_0

    .line 308
    :cond_1
    new-instance v1, Ll/ܶܶۜ;

    invoke-direct {v1, p1, p2}, Ll/ܶܶۜ;-><init>(ILjava/lang/Runnable;)V

    iput-object v1, p0, Ll/᩸ܶۜ;->ܽ:Ll/ܶܶۜ;

    .line 309
    iget-object p2, p0, Ll/᩸ܶۜ;->᩷:Landroid/media/MediaPlayer;

    invoke-virtual {p2, p1}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 311
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_2
    return-void
.end method

.method public final ֫(Ll/ۧ᩵֫;)V
    .locals 3

    .line 379
    iget-boolean v0, p0, Ll/᩸ܶۜ;->ۖ:Z

    if-nez v0, :cond_0

    .line 369
    iget-boolean v0, p0, Ll/᩸ܶۜ;->ᩴ:Z

    if-nez v0, :cond_0

    .line 119
    iget-object v0, p0, Ll/᩸ܶۜ;->ۢ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    .line 120
    iput v0, p0, Ll/᩸ܶۜ;->ۧ:I

    const/4 v1, 0x0

    .line 168
    iput-object v1, p0, Ll/᩸ܶۜ;->ܺ:Ll/ۧ᩵֫;

    const/4 v1, 0x1

    .line 169
    iput-boolean v1, p0, Ll/᩸ܶۜ;->ۖ:Z

    .line 170
    iput-boolean v1, p0, Ll/᩸ܶۜ;->ۜ:Z

    .line 112
    invoke-static {}, Ll/ۙ᩸᩷;->ۢ()Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Ll/᩸ܶۜ;->᩵:Ll/ᩴܶۜ;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 172
    sget-object v1, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Ll/ۚܶۜ;

    invoke-direct {v2, p0, v0, p1}, Ll/ۚܶۜ;-><init>(Ll/᩸ܶۜ;ILl/ۧ᩵֫;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    .line 165
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final ۧ()V
    .locals 7

    move-object v0, p0

    .line 399
    monitor-enter v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 400
    :try_start_0
    invoke-virtual {p0, v1, v2}, Ll/᩸ܶۜ;->֫(ILl/ܽ᩶ۜ;)V

    .line 401
    iget-boolean v1, p0, Ll/᩸ܶۜ;->ۜ:Z

    if-eqz v1, :cond_0

    .line 402
    monitor-exit v0

    return-void

    .line 108
    :cond_0
    invoke-static {}, Ll/ۙ᩸᩷;->ۢ()Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Ll/᩸ܶۜ;->᩵:Ll/ᩴܶۜ;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    const-wide/16 v5, 0xa

    add-long/2addr v3, v5

    invoke-virtual {v1, v2, v2, v3, v4}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    .line 405
    iget-object v1, p0, Ll/᩸ܶۜ;->᩷:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->start()V

    .line 406
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ܽ()Z
    .locals 1

    .line 374
    iget-boolean v0, p0, Ll/᩸ܶۜ;->ۡ:Z

    return v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 379
    iget-boolean v0, p0, Ll/᩸ܶۜ;->ۖ:Z

    return v0
.end method

.method public final ᩳ()V
    .locals 3

    move-object v0, p0

    .line 411
    monitor-enter v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 412
    :try_start_0
    invoke-virtual {p0, v1, v2}, Ll/᩸ܶۜ;->֫(ILl/ܽ᩶ۜ;)V

    .line 413
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ᩻()Z
    .locals 1

    .line 369
    iget-boolean v0, p0, Ll/᩸ܶۜ;->ᩴ:Z

    return v0
.end method
