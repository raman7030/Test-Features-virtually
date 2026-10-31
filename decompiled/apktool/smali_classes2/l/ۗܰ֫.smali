.class public final Ll/ۗܰ֫;
.super Landroid/media/MediaCodec$Callback;
.source "X8N9"


# instance fields
.field public final ֫:Ll/᩵᩵;

.field public ۖ:J

.field public ۘ:Landroid/media/MediaFormat;

.field public ۜ:Ljava/lang/IllegalStateException;

.field public ۡ:Landroid/media/MediaCodec$CodecException;

.field public ۢ:Landroid/media/MediaCodec$CryptoException;

.field public final ۧ:Ll/᩵᩵;

.field public final ܳ:Ljava/util/ArrayDeque;

.field public ܺ:Ll/۟ܰ֫;

.field public final ܽ:Ljava/util/ArrayDeque;

.field public ܿ:Landroid/media/MediaFormat;

.field public final ᩳ:Landroid/os/HandlerThread;

.field public ᩴ:Z

.field public final ᩷:Ljava/lang/Object;

.field public ᩻:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/HandlerThread;)V
    .locals 1

    .line 90
    invoke-direct {p0}, Landroid/media/MediaCodec$Callback;-><init>()V

    .line 91
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ۗܰ֫;->᩷:Ljava/lang/Object;

    .line 92
    iput-object p1, p0, Ll/ۗܰ֫;->ᩳ:Landroid/os/HandlerThread;

    .line 93
    new-instance p1, Ll/᩵᩵;

    invoke-direct {p1}, Ll/᩵᩵;-><init>()V

    iput-object p1, p0, Ll/ۗܰ֫;->֫:Ll/᩵᩵;

    .line 94
    new-instance p1, Ll/᩵᩵;

    invoke-direct {p1}, Ll/᩵᩵;-><init>()V

    iput-object p1, p0, Ll/ۗܰ֫;->ۧ:Ll/᩵᩵;

    .line 95
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Ll/ۗܰ֫;->ܽ:Ljava/util/ArrayDeque;

    .line 96
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Ll/ۗܰ֫;->ܳ:Ljava/util/ArrayDeque;

    return-void
.end method

.method private ֫(Ljava/lang/IllegalStateException;)V
    .locals 1

    .line 356
    iget-object v0, p0, Ll/ۗܰ֫;->᩷:Ljava/lang/Object;

    monitor-enter v0

    .line 357
    :try_start_0
    iput-object p1, p0, Ll/ۗܰ֫;->ۜ:Ljava/lang/IllegalStateException;

    .line 358
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public static ֫(Ll/ۗܰ֫;)V
    .locals 6

    .line 275
    iget-object v0, p0, Ll/ۗܰ֫;->᩷:Ljava/lang/Object;

    monitor-enter v0

    .line 276
    :try_start_0
    iget-boolean v1, p0, Ll/ۗܰ֫;->ᩴ:Z

    if-eqz v1, :cond_0

    .line 277
    monitor-exit v0

    return-void

    .line 280
    :cond_0
    iget-wide v1, p0, Ll/ۗܰ֫;->ۖ:J

    const-wide/16 v3, 0x1

    sub-long/2addr v1, v3

    iput-wide v1, p0, Ll/ۗܰ֫;->ۖ:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_1

    .line 283
    monitor-exit v0

    return-void

    :cond_1
    if-gez v5, :cond_2

    .line 286
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-direct {p0, v1}, Ll/ۗܰ֫;->֫(Ljava/lang/IllegalStateException;)V

    .line 287
    monitor-exit v0

    return-void

    .line 289
    :cond_2
    invoke-direct {p0}, Ll/ۗܰ֫;->ܿ()V

    .line 290
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method private ܿ()V
    .locals 2

    .line 296
    iget-object v0, p0, Ll/ۗܰ֫;->ܳ:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 297
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->getLast()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/media/MediaFormat;

    iput-object v1, p0, Ll/ۗܰ֫;->ۘ:Landroid/media/MediaFormat;

    .line 304
    :cond_0
    iget-object v1, p0, Ll/ۗܰ֫;->֫:Ll/᩵᩵;

    invoke-virtual {v1}, Ll/᩵᩵;->֫()V

    .line 305
    iget-object v1, p0, Ll/ۗܰ֫;->ۧ:Ll/᩵᩵;

    invoke-virtual {v1}, Ll/᩵᩵;->֫()V

    .line 306
    iget-object v1, p0, Ll/ۗܰ֫;->ܽ:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->clear()V

    .line 307
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    return-void
.end method


# virtual methods
.method public final onCryptoError(Landroid/media/MediaCodec;Landroid/media/MediaCodec$CryptoException;)V
    .locals 1

    .line 247
    iget-object p1, p0, Ll/ۗܰ֫;->᩷:Ljava/lang/Object;

    move-object v0, p1

    monitor-enter v0

    .line 248
    :try_start_0
    iput-object p2, p0, Ll/ۗܰ֫;->ۢ:Landroid/media/MediaCodec$CryptoException;

    .line 249
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final onError(Landroid/media/MediaCodec;Landroid/media/MediaCodec$CodecException;)V
    .locals 1

    .line 240
    iget-object p1, p0, Ll/ۗܰ֫;->᩷:Ljava/lang/Object;

    move-object v0, p1

    monitor-enter v0

    .line 241
    :try_start_0
    iput-object p2, p0, Ll/ۗܰ֫;->ۡ:Landroid/media/MediaCodec$CodecException;

    .line 242
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final onInputBufferAvailable(Landroid/media/MediaCodec;I)V
    .locals 1

    .line 215
    iget-object p1, p0, Ll/ۗܰ֫;->᩷:Ljava/lang/Object;

    move-object v0, p1

    monitor-enter v0

    .line 216
    :try_start_0
    iget-object p1, p0, Ll/ۗܰ֫;->֫:Ll/᩵᩵;

    invoke-virtual {p1, p2}, Ll/᩵᩵;->֫(I)V

    .line 217
    iget-object p1, p0, Ll/ۗܰ֫;->ܺ:Ll/۟ܰ֫;

    if-eqz p1, :cond_0

    .line 218
    check-cast p1, Ll/ۢ۟֫;

    .line 2806
    iget-object p1, p1, Ll/ۢ۟֫;->֫:Ll/ܺ۟֫;

    invoke-static {p1}, Ll/ܺ۟֫;->֫(Ll/ܺ۟֫;)Ll/۟ۗ֫;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 2807
    invoke-static {p1}, Ll/ܺ۟֫;->֫(Ll/ܺ۟֫;)Ll/۟ۗ֫;

    move-result-object p1

    invoke-interface {p1}, Ll/۟ۗ֫;->ۧ()V

    .line 220
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final onOutputBufferAvailable(Landroid/media/MediaCodec;ILandroid/media/MediaCodec$BufferInfo;)V
    .locals 3

    .line 225
    iget-object p1, p0, Ll/ۗܰ֫;->᩷:Ljava/lang/Object;

    move-object v0, p1

    monitor-enter v0

    .line 226
    :try_start_0
    iget-object p1, p0, Ll/ۗܰ֫;->ۘ:Landroid/media/MediaFormat;

    if-eqz p1, :cond_0

    .line 317
    iget-object v1, p0, Ll/ۗܰ֫;->ۧ:Ll/᩵᩵;

    const/4 v2, -0x2

    invoke-virtual {v1, v2}, Ll/᩵᩵;->֫(I)V

    .line 318
    iget-object v1, p0, Ll/ۗܰ֫;->ܳ:Ljava/util/ArrayDeque;

    invoke-virtual {v1, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    .line 228
    iput-object p1, p0, Ll/ۗܰ֫;->ۘ:Landroid/media/MediaFormat;

    .line 230
    :cond_0
    iget-object p1, p0, Ll/ۗܰ֫;->ۧ:Ll/᩵᩵;

    invoke-virtual {p1, p2}, Ll/᩵᩵;->֫(I)V

    .line 231
    iget-object p1, p0, Ll/ۗܰ֫;->ܽ:Ljava/util/ArrayDeque;

    invoke-virtual {p1, p3}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 232
    iget-object p1, p0, Ll/ۗܰ֫;->ܺ:Ll/۟ܰ֫;

    if-eqz p1, :cond_1

    .line 233
    check-cast p1, Ll/ۢ۟֫;

    .line 2813
    iget-object p1, p1, Ll/ۢ۟֫;->֫:Ll/ܺ۟֫;

    invoke-static {p1}, Ll/ܺ۟֫;->֫(Ll/ܺ۟֫;)Ll/۟ۗ֫;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 2814
    invoke-static {p1}, Ll/ܺ۟֫;->֫(Ll/ܺ۟֫;)Ll/۟ۗ֫;

    move-result-object p1

    invoke-interface {p1}, Ll/۟ۗ֫;->ۧ()V

    .line 235
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

.method public final onOutputFormatChanged(Landroid/media/MediaCodec;Landroid/media/MediaFormat;)V
    .locals 2

    .line 254
    iget-object p1, p0, Ll/ۗܰ֫;->᩷:Ljava/lang/Object;

    move-object v0, p1

    monitor-enter v0

    .line 317
    :try_start_0
    iget-object p1, p0, Ll/ۗܰ֫;->ۧ:Ll/᩵᩵;

    const/4 v1, -0x2

    invoke-virtual {p1, v1}, Ll/᩵᩵;->֫(I)V

    .line 318
    iget-object p1, p0, Ll/ۗܰ֫;->ܳ:Ljava/util/ArrayDeque;

    invoke-virtual {p1, p2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    .line 256
    iput-object p1, p0, Ll/ۗܰ֫;->ۘ:Landroid/media/MediaFormat;

    .line 257
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫()I
    .locals 6

    .line 137
    iget-object v0, p0, Ll/ۗܰ֫;->᩷:Ljava/lang/Object;

    monitor-enter v0

    .line 330
    :try_start_0
    iget-object v1, p0, Ll/ۗܰ֫;->ۜ:Ljava/lang/IllegalStateException;

    const/4 v2, 0x0

    if-nez v1, :cond_6

    .line 339
    iget-object v1, p0, Ll/ۗܰ֫;->ۡ:Landroid/media/MediaCodec$CodecException;

    if-nez v1, :cond_5

    .line 348
    iget-object v1, p0, Ll/ۗܰ֫;->ۢ:Landroid/media/MediaCodec$CryptoException;

    if-nez v1, :cond_4

    .line 312
    iget-wide v1, p0, Ll/ۗܰ֫;->ۖ:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-gtz v5, :cond_1

    iget-boolean v1, p0, Ll/ۗܰ֫;->ᩴ:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    const/4 v2, -0x1

    if-eqz v1, :cond_2

    .line 140
    monitor-exit v0

    return v2

    .line 142
    :cond_2
    iget-object v1, p0, Ll/ۗܰ֫;->֫:Ll/᩵᩵;

    invoke-virtual {v1}, Ll/᩵᩵;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_2

    .line 144
    :cond_3
    iget-object v1, p0, Ll/ۗܰ֫;->֫:Ll/᩵᩵;

    invoke-virtual {v1}, Ll/᩵᩵;->ܽ()I

    move-result v2

    :goto_2
    monitor-exit v0

    return v2

    .line 350
    :cond_4
    iput-object v2, p0, Ll/ۗܰ֫;->ۢ:Landroid/media/MediaCodec$CryptoException;

    .line 351
    throw v1

    .line 341
    :cond_5
    iput-object v2, p0, Ll/ۗܰ֫;->ۡ:Landroid/media/MediaCodec$CodecException;

    .line 342
    throw v1

    .line 332
    :cond_6
    iput-object v2, p0, Ll/ۗܰ֫;->ۜ:Ljava/lang/IllegalStateException;

    .line 333
    throw v1

    :catchall_0
    move-exception v1

    .line 146
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ֫(Landroid/media/MediaCodec$BufferInfo;)I
    .locals 9

    .line 156
    iget-object v0, p0, Ll/ۗܰ֫;->᩷:Ljava/lang/Object;

    monitor-enter v0

    .line 330
    :try_start_0
    iget-object v1, p0, Ll/ۗܰ֫;->ۜ:Ljava/lang/IllegalStateException;

    const/4 v2, 0x0

    if-nez v1, :cond_8

    .line 339
    iget-object v1, p0, Ll/ۗܰ֫;->ۡ:Landroid/media/MediaCodec$CodecException;

    if-nez v1, :cond_7

    .line 348
    iget-object v1, p0, Ll/ۗܰ֫;->ۢ:Landroid/media/MediaCodec$CryptoException;

    if-nez v1, :cond_6

    .line 312
    iget-wide v1, p0, Ll/ۗܰ֫;->ۖ:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-gtz v5, :cond_1

    iget-boolean v1, p0, Ll/ۗܰ֫;->ᩴ:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    const/4 v2, -0x1

    if-eqz v1, :cond_2

    .line 159
    monitor-exit v0

    return v2

    .line 161
    :cond_2
    iget-object v1, p0, Ll/ۗܰ֫;->ۧ:Ll/᩵᩵;

    invoke-virtual {v1}, Ll/᩵᩵;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 162
    monitor-exit v0

    return v2

    .line 164
    :cond_3
    iget-object v1, p0, Ll/ۗܰ֫;->ۧ:Ll/᩵᩵;

    invoke-virtual {v1}, Ll/᩵᩵;->ܽ()I

    move-result v1

    if-ltz v1, :cond_4

    .line 166
    iget-object v2, p0, Ll/ۗܰ֫;->ܿ:Landroid/media/MediaFormat;

    invoke-static {v2}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 167
    iget-object v2, p0, Ll/ۗܰ֫;->ܽ:Ljava/util/ArrayDeque;

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/media/MediaCodec$BufferInfo;

    .line 168
    iget v4, v2, Landroid/media/MediaCodec$BufferInfo;->offset:I

    iget v5, v2, Landroid/media/MediaCodec$BufferInfo;->size:I

    iget-wide v6, v2, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget v8, v2, Landroid/media/MediaCodec$BufferInfo;->flags:I

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Landroid/media/MediaCodec$BufferInfo;->set(IIJI)V

    goto :goto_2

    :cond_4
    const/4 p1, -0x2

    if-ne v1, p1, :cond_5

    .line 174
    iget-object p1, p0, Ll/ۗܰ֫;->ܳ:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/MediaFormat;

    iput-object p1, p0, Ll/ۗܰ֫;->ܿ:Landroid/media/MediaFormat;

    .line 176
    :cond_5
    :goto_2
    monitor-exit v0

    return v1

    .line 350
    :cond_6
    iput-object v2, p0, Ll/ۗܰ֫;->ۢ:Landroid/media/MediaCodec$CryptoException;

    .line 351
    throw v1

    .line 341
    :cond_7
    iput-object v2, p0, Ll/ۗܰ֫;->ۡ:Landroid/media/MediaCodec$CodecException;

    .line 342
    throw v1

    .line 332
    :cond_8
    iput-object v2, p0, Ll/ۗܰ֫;->ۜ:Ljava/lang/IllegalStateException;

    .line 333
    throw v1

    :catchall_0
    move-exception p1

    .line 179
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫(Landroid/media/MediaCodec;)V
    .locals 2

    .line 108
    iget-object v0, p0, Ll/ۗܰ֫;->᩻:Landroid/os/Handler;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 110
    iget-object v0, p0, Ll/ۗܰ֫;->ᩳ:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 111
    new-instance v1, Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 112
    invoke-virtual {p1, p0, v1}, Landroid/media/MediaCodec;->setCallback(Landroid/media/MediaCodec$Callback;Landroid/os/Handler;)V

    .line 115
    iput-object v1, p0, Ll/ۗܰ֫;->᩻:Landroid/os/Handler;

    return-void
.end method

.method public final ֫(Ll/۟ܰ֫;)V
    .locals 1

    .line 269
    iget-object v0, p0, Ll/ۗܰ֫;->᩷:Ljava/lang/Object;

    monitor-enter v0

    .line 270
    :try_start_0
    iput-object p1, p0, Ll/ۗܰ֫;->ܺ:Ll/۟ܰ֫;

    .line 271
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ۧ()V
    .locals 5

    .line 205
    iget-object v0, p0, Ll/ۗܰ֫;->᩷:Ljava/lang/Object;

    monitor-enter v0

    .line 206
    :try_start_0
    iget-wide v1, p0, Ll/ۗܰ֫;->ۖ:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/ۗܰ֫;->ۖ:J

    .line 207
    iget-object v1, p0, Ll/ۗܰ֫;->᩻:Landroid/os/Handler;

    sget-object v2, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    new-instance v2, Ll/ۙܰ֫;

    invoke-direct {v2, p0}, Ll/ۙܰ֫;-><init>(Ll/ۗܰ֫;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 208
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ܽ()Landroid/media/MediaFormat;
    .locals 2

    .line 192
    iget-object v0, p0, Ll/ۗܰ֫;->᩷:Ljava/lang/Object;

    monitor-enter v0

    .line 193
    :try_start_0
    iget-object v1, p0, Ll/ۗܰ֫;->ܿ:Landroid/media/MediaFormat;

    if-eqz v1, :cond_0

    .line 196
    monitor-exit v0

    return-object v1

    .line 194
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :catchall_0
    move-exception v1

    .line 197
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ᩳ()V
    .locals 2

    .line 125
    iget-object v0, p0, Ll/ۗܰ֫;->᩷:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    .line 126
    :try_start_0
    iput-boolean v1, p0, Ll/ۗܰ֫;->ᩴ:Z

    .line 127
    iget-object v1, p0, Ll/ۗܰ֫;->ᩳ:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->quit()Z

    .line 128
    invoke-direct {p0}, Ll/ۗܰ֫;->ܿ()V

    .line 129
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
