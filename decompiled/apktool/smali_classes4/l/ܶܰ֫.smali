.class public final Ll/ܶܰ֫;
.super Ljava/lang/Object;
.source "F8QV"

# interfaces
.implements Ll/ۧ۟֫;


# instance fields
.field public final ֫:Ll/ۗܰ֫;

.field public final ۧ:Ll/ܽ۟֫;

.field public ܳ:I

.field public final ܽ:Landroid/media/MediaCodec;

.field public final ܿ:Ll/ۨܰ֫;

.field public ᩳ:Z


# direct methods
.method public constructor <init>(Landroid/media/MediaCodec;Landroid/os/HandlerThread;Ll/ܽ۟֫;Ll/ۨܰ֫;)V
    .locals 0

    .line 180
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 181
    iput-object p1, p0, Ll/ܶܰ֫;->ܽ:Landroid/media/MediaCodec;

    .line 182
    new-instance p1, Ll/ۗܰ֫;

    invoke-direct {p1, p2}, Ll/ۗܰ֫;-><init>(Landroid/os/HandlerThread;)V

    iput-object p1, p0, Ll/ܶܰ֫;->֫:Ll/ۗܰ֫;

    .line 183
    iput-object p3, p0, Ll/ܶܰ֫;->ۧ:Ll/ܽ۟֫;

    .line 184
    iput-object p4, p0, Ll/ܶܰ֫;->ܿ:Ll/ۨܰ֫;

    const/4 p1, 0x0

    .line 185
    iput p1, p0, Ll/ܶܰ֫;->ܳ:I

    return-void
.end method

.method public static ֫(ILjava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 367
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x1

    if-ne p0, p1, :cond_0

    const-string p0, "Audio"

    .line 369
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    if-ne p0, p1, :cond_1

    const-string p0, "Video"

    .line 371
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const-string p1, "Unknown("

    .line 373
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 375
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ܶܰ֫;Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    .locals 2

    .line 193
    iget-object v0, p0, Ll/ܶܰ֫;->֫:Ll/ۗܰ֫;

    iget-object v1, p0, Ll/ܶܰ֫;->ܽ:Landroid/media/MediaCodec;

    invoke-virtual {v0, v1}, Ll/ۗܰ֫;->֫(Landroid/media/MediaCodec;)V

    const-string v0, "configureCodec"

    .line 38
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 195
    invoke-virtual {v1, p1, p2, p3, p4}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 49
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 197
    iget-object p1, p0, Ll/ܶܰ֫;->ۧ:Ll/ܽ۟֫;

    invoke-interface {p1}, Ll/ܽ۟֫;->start()V

    const-string p1, "startCodec"

    .line 38
    invoke-static {p1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 199
    invoke-virtual {v1}, Landroid/media/MediaCodec;->start()V

    .line 49
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 201
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x23

    if-lt p1, p2, :cond_0

    iget-object p1, p0, Ll/ܶܰ֫;->ܿ:Ll/ۨܰ֫;

    if-eqz p1, :cond_0

    .line 202
    invoke-virtual {p1, v1}, Ll/ۨܰ֫;->֫(Landroid/media/MediaCodec;)V

    :cond_0
    const/4 p1, 0x1

    .line 204
    iput p1, p0, Ll/ܶܰ֫;->ܳ:I

    return-void
.end method

.method public static ܳ(I)Ljava/lang/String;
    .locals 1

    const-string v0, "ExoPlayer:MediaCodecQueueingThread:"

    .line 363
    invoke-static {p0, v0}, Ll/ܶܰ֫;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ܿ(I)Ljava/lang/String;
    .locals 1

    const-string v0, "ExoPlayer:MediaCodecAsyncAdapter:"

    .line 359
    invoke-static {p0, v0}, Ll/ܶܰ֫;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final flush()V
    .locals 2

    .line 271
    iget-object v0, p0, Ll/ܶܰ֫;->ۧ:Ll/ܽ۟֫;

    invoke-interface {v0}, Ll/ܽ۟֫;->flush()V

    .line 272
    iget-object v0, p0, Ll/ܶܰ֫;->ܽ:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->flush()V

    .line 273
    iget-object v1, p0, Ll/ܶܰ֫;->֫:Ll/ۗܰ֫;

    invoke-virtual {v1}, Ll/ۗܰ֫;->ۧ()V

    .line 274
    invoke-virtual {v0}, Landroid/media/MediaCodec;->start()V

    return-void
.end method

.method public final ֫(Landroid/media/MediaCodec$BufferInfo;)I
    .locals 1

    .line 242
    iget-object v0, p0, Ll/ܶܰ֫;->ۧ:Ll/ܽ۟֫;

    invoke-interface {v0}, Ll/ܽ۟֫;->֫()V

    .line 243
    iget-object v0, p0, Ll/ܶܰ֫;->֫:Ll/ۗܰ֫;

    invoke-virtual {v0, p1}, Ll/ۗܰ֫;->֫(Landroid/media/MediaCodec$BufferInfo;)I

    move-result p1

    return p1
.end method

.method public final ֫()V
    .locals 8

    .line 280
    iget-object v0, p0, Ll/ܶܰ֫;->ܿ:Ll/ۨܰ֫;

    iget-object v1, p0, Ll/ܶܰ֫;->ܽ:Landroid/media/MediaCodec;

    const/16 v2, 0x21

    const/16 v3, 0x1e

    const/16 v4, 0x23

    const/4 v5, 0x1

    :try_start_0
    iget v6, p0, Ll/ܶܰ֫;->ܳ:I

    if-ne v6, v5, :cond_0

    .line 281
    iget-object v6, p0, Ll/ܶܰ֫;->ۧ:Ll/ܽ۟֫;

    invoke-interface {v6}, Ll/ܽ۟֫;->shutdown()V

    .line 282
    iget-object v6, p0, Ll/ܶܰ֫;->֫:Ll/ۗܰ֫;

    invoke-virtual {v6}, Ll/ۗܰ֫;->ᩳ()V

    :cond_0
    const/4 v6, 0x2

    .line 284
    iput v6, p0, Ll/ܶܰ֫;->ܳ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 286
    iget-boolean v6, p0, Ll/ܶܰ֫;->ᩳ:Z

    if-nez v6, :cond_4

    .line 292
    :try_start_1
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v6, v3, :cond_1

    if-ge v6, v2, :cond_1

    .line 293
    invoke-virtual {v1}, Landroid/media/MediaCodec;->stop()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    if-lt v6, v4, :cond_2

    if-eqz v0, :cond_2

    .line 297
    invoke-virtual {v0, v1}, Ll/ۨܰ֫;->ۧ(Landroid/media/MediaCodec;)V

    .line 299
    :cond_2
    invoke-virtual {v1}, Landroid/media/MediaCodec;->release()V

    .line 300
    iput-boolean v5, p0, Ll/ܶܰ֫;->ᩳ:Z

    return-void

    :catchall_0
    move-exception v2

    .line 296
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v3, v4, :cond_3

    if-eqz v0, :cond_3

    .line 297
    invoke-virtual {v0, v1}, Ll/ۨܰ֫;->ۧ(Landroid/media/MediaCodec;)V

    .line 299
    :cond_3
    invoke-virtual {v1}, Landroid/media/MediaCodec;->release()V

    .line 300
    iput-boolean v5, p0, Ll/ܶܰ֫;->ᩳ:Z

    .line 301
    throw v2

    :cond_4
    return-void

    :catchall_1
    move-exception v6

    .line 286
    iget-boolean v7, p0, Ll/ܶܰ֫;->ᩳ:Z

    if-nez v7, :cond_8

    .line 292
    :try_start_2
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v7, v3, :cond_5

    if-ge v7, v2, :cond_5

    .line 293
    invoke-virtual {v1}, Landroid/media/MediaCodec;->stop()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :cond_5
    if-lt v7, v4, :cond_6

    if-eqz v0, :cond_6

    .line 297
    invoke-virtual {v0, v1}, Ll/ۨܰ֫;->ۧ(Landroid/media/MediaCodec;)V

    .line 299
    :cond_6
    invoke-virtual {v1}, Landroid/media/MediaCodec;->release()V

    .line 300
    iput-boolean v5, p0, Ll/ܶܰ֫;->ᩳ:Z

    goto :goto_0

    :catchall_2
    move-exception v2

    .line 296
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v3, v4, :cond_7

    if-eqz v0, :cond_7

    .line 297
    invoke-virtual {v0, v1}, Ll/ۨܰ֫;->ۧ(Landroid/media/MediaCodec;)V

    .line 299
    :cond_7
    invoke-virtual {v1}, Landroid/media/MediaCodec;->release()V

    .line 300
    iput-boolean v5, p0, Ll/ܶܰ֫;->ᩳ:Z

    .line 301
    throw v2

    .line 303
    :cond_8
    :goto_0
    throw v6
.end method

.method public final ֫(I)V
    .locals 1

    .line 339
    iget-object v0, p0, Ll/ܶܰ֫;->ܽ:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setVideoScalingMode(I)V

    return-void
.end method

.method public final ֫(IIIJ)V
    .locals 6

    .line 215
    iget-object v0, p0, Ll/ܶܰ֫;->ۧ:Ll/ܽ۟֫;

    move v1, p1

    move v2, p2

    move v3, p3

    move-wide v4, p4

    invoke-interface/range {v0 .. v5}, Ll/ܽ۟֫;->֫(IIIJ)V

    return-void
.end method

.method public final ֫(IJ)V
    .locals 1

    .line 231
    iget-object v0, p0, Ll/ܶܰ֫;->ܽ:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1, p2, p3}, Landroid/media/MediaCodec;->releaseOutputBuffer(IJ)V

    return-void
.end method

.method public final ֫(ILl/ۚ᩸֫;JI)V
    .locals 6

    .line 221
    iget-object v0, p0, Ll/ܶܰ֫;->ۧ:Ll/ܽ۟֫;

    move v1, p1

    move-object v2, p2

    move-wide v3, p3

    move v5, p5

    invoke-interface/range {v0 .. v5}, Ll/ܽ۟֫;->֫(ILl/ۚ᩸֫;JI)V

    return-void
.end method

.method public final ֫(Landroid/os/Bundle;)V
    .locals 1

    .line 334
    iget-object v0, p0, Ll/ܶܰ֫;->ۧ:Ll/ܽ۟֫;

    invoke-interface {v0, p1}, Ll/ܽ۟֫;->֫(Landroid/os/Bundle;)V

    return-void
.end method

.method public final ֫(Landroid/view/Surface;)V
    .locals 1

    .line 323
    iget-object v0, p0, Ll/ܶܰ֫;->ܽ:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setOutputSurface(Landroid/view/Surface;)V

    return-void
.end method

.method public final ֫(Ll/֫۟֫;Landroid/os/Handler;)V
    .locals 1

    .line 308
    new-instance v0, Ll/֡ܰ֫;

    invoke-direct {v0, p0, p1}, Ll/֡ܰ֫;-><init>(Ll/ܶܰ֫;Ll/֫۟֫;)V

    iget-object p1, p0, Ll/ܶܰ֫;->ܽ:Landroid/media/MediaCodec;

    invoke-virtual {p1, v0, p2}, Landroid/media/MediaCodec;->setOnFrameRenderedListener(Landroid/media/MediaCodec$OnFrameRenderedListener;Landroid/os/Handler;)V

    return-void
.end method

.method public final ֫(Ll/۟ܰ֫;)Z
    .locals 1

    .line 317
    iget-object v0, p0, Ll/ܶܰ֫;->֫:Ll/ۗܰ֫;

    invoke-virtual {v0, p1}, Ll/ۗܰ֫;->֫(Ll/۟ܰ֫;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final ۧ()Landroid/media/MediaFormat;
    .locals 1

    .line 248
    iget-object v0, p0, Ll/ܶܰ֫;->֫:Ll/ۗܰ֫;

    invoke-virtual {v0}, Ll/ۗܰ֫;->ܽ()Landroid/media/MediaFormat;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(I)Ljava/nio/ByteBuffer;
    .locals 1

    .line 254
    iget-object v0, p0, Ll/ܶܰ֫;->ܽ:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->getInputBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1
.end method

.method public final ܽ()V
    .locals 1

    .line 329
    iget-object v0, p0, Ll/ܶܰ֫;->ܽ:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->detachOutputSurface()V

    return-void
.end method

.method public final ܽ(I)V
    .locals 2

    const/4 v0, 0x0

    .line 226
    iget-object v1, p0, Ll/ܶܰ֫;->ܽ:Landroid/media/MediaCodec;

    invoke-virtual {v1, p1, v0}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    return-void
.end method

.method public final ᩳ()I
    .locals 1

    .line 236
    iget-object v0, p0, Ll/ܶܰ֫;->ۧ:Ll/ܽ۟֫;

    invoke-interface {v0}, Ll/ܽ۟֫;->֫()V

    .line 237
    iget-object v0, p0, Ll/ܶܰ֫;->֫:Ll/ۗܰ֫;

    invoke-virtual {v0}, Ll/ۗܰ֫;->֫()I

    move-result v0

    return v0
.end method

.method public final ᩳ(I)Ljava/nio/ByteBuffer;
    .locals 1

    .line 260
    iget-object v0, p0, Ll/ܶܰ֫;->ܽ:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->getOutputBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1
.end method
