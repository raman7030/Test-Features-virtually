.class public final Ll/ۗ۟֫;
.super Ljava/lang/Object;
.source "R8QD"

# interfaces
.implements Ll/ۧ۟֫;


# instance fields
.field public final ֫:Landroid/media/MediaCodec;

.field public final ۧ:Ll/ۨܰ֫;


# direct methods
.method public constructor <init>(Landroid/media/MediaCodec;Ll/ۨܰ֫;)V
    .locals 2

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    iput-object p1, p0, Ll/ۗ۟֫;->֫:Landroid/media/MediaCodec;

    .line 92
    iput-object p2, p0, Ll/ۗ۟֫;->ۧ:Ll/ۨܰ֫;

    .line 93
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x23

    if-lt v0, v1, :cond_0

    if-eqz p2, :cond_0

    .line 94
    invoke-virtual {p2, p1}, Ll/ۨܰ֫;->֫(Landroid/media/MediaCodec;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final flush()V
    .locals 1

    .line 160
    iget-object v0, p0, Ll/ۗ۟֫;->֫:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->flush()V

    return-void
.end method

.method public final ֫(Landroid/media/MediaCodec$BufferInfo;)I
    .locals 3

    .line 112
    :cond_0
    iget-object v0, p0, Ll/ۗ۟֫;->֫:Landroid/media/MediaCodec;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, p1, v1, v2}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    move-result v0

    const/4 v1, -0x3

    if-eq v0, v1, :cond_0

    return v0
.end method

.method public final ֫()V
    .locals 5

    .line 166
    iget-object v0, p0, Ll/ۗ۟֫;->ۧ:Ll/ۨܰ֫;

    iget-object v1, p0, Ll/ۗ۟֫;->֫:Landroid/media/MediaCodec;

    const/16 v2, 0x23

    :try_start_0
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1e

    if-lt v3, v4, :cond_0

    const/16 v4, 0x21

    if-ge v3, v4, :cond_0

    .line 171
    invoke-virtual {v1}, Landroid/media/MediaCodec;->stop()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    if-lt v3, v2, :cond_1

    if-eqz v0, :cond_1

    .line 175
    invoke-virtual {v0, v1}, Ll/ۨܰ֫;->ۧ(Landroid/media/MediaCodec;)V

    .line 177
    :cond_1
    invoke-virtual {v1}, Landroid/media/MediaCodec;->release()V

    return-void

    :catchall_0
    move-exception v3

    .line 174
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v4, v2, :cond_2

    if-eqz v0, :cond_2

    .line 175
    invoke-virtual {v0, v1}, Ll/ۨܰ֫;->ۧ(Landroid/media/MediaCodec;)V

    .line 177
    :cond_2
    invoke-virtual {v1}, Landroid/media/MediaCodec;->release()V

    .line 178
    throw v3
.end method

.method public final ֫(I)V
    .locals 1

    .line 210
    iget-object v0, p0, Ll/ۗ۟֫;->֫:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setVideoScalingMode(I)V

    return-void
.end method

.method public final ֫(IIIJ)V
    .locals 7

    const/4 v2, 0x0

    .line 138
    iget-object v0, p0, Ll/ۗ۟֫;->֫:Landroid/media/MediaCodec;

    move v1, p1

    move v3, p2

    move-wide v4, p4

    move v6, p3

    invoke-virtual/range {v0 .. v6}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    return-void
.end method

.method public final ֫(IJ)V
    .locals 1

    .line 155
    iget-object v0, p0, Ll/ۗ۟֫;->֫:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1, p2, p3}, Landroid/media/MediaCodec;->releaseOutputBuffer(IJ)V

    return-void
.end method

.method public final ֫(ILl/ۚ᩸֫;JI)V
    .locals 7

    .line 144
    iget-object v0, p0, Ll/ۗ۟֫;->֫:Landroid/media/MediaCodec;

    .line 145
    invoke-virtual {p2}, Ll/ۚ᩸֫;->֫()Landroid/media/MediaCodec$CryptoInfo;

    move-result-object v3

    const/4 v2, 0x0

    move v1, p1

    move-wide v4, p3

    move v6, p5

    .line 144
    invoke-virtual/range {v0 .. v6}, Landroid/media/MediaCodec;->queueSecureInputBuffer(IILandroid/media/MediaCodec$CryptoInfo;JI)V

    return-void
.end method

.method public final ֫(Landroid/os/Bundle;)V
    .locals 1

    .line 205
    iget-object v0, p0, Ll/ۗ۟֫;->֫:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setParameters(Landroid/os/Bundle;)V

    return-void
.end method

.method public final ֫(Landroid/view/Surface;)V
    .locals 1

    .line 194
    iget-object v0, p0, Ll/ۗ۟֫;->֫:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setOutputSurface(Landroid/view/Surface;)V

    return-void
.end method

.method public final ֫(Ll/֫۟֫;Landroid/os/Handler;)V
    .locals 1

    .line 184
    new-instance v0, Ll/᩶۟֫;

    invoke-direct {v0, p0, p1}, Ll/᩶۟֫;-><init>(Ll/ۗ۟֫;Ll/֫۟֫;)V

    iget-object p1, p0, Ll/ۗ۟֫;->֫:Landroid/media/MediaCodec;

    invoke-virtual {p1, v0, p2}, Landroid/media/MediaCodec;->setOnFrameRenderedListener(Landroid/media/MediaCodec$OnFrameRenderedListener;Landroid/os/Handler;)V

    return-void
.end method

.method public final synthetic ֫(Ll/۟ܰ֫;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()Landroid/media/MediaFormat;
    .locals 1

    .line 120
    iget-object v0, p0, Ll/ۗ۟֫;->֫:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(I)Ljava/nio/ByteBuffer;
    .locals 1

    .line 126
    iget-object v0, p0, Ll/ۗ۟֫;->֫:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->getInputBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1
.end method

.method public final ܽ()V
    .locals 1

    .line 200
    iget-object v0, p0, Ll/ۗ۟֫;->֫:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->detachOutputSurface()V

    return-void
.end method

.method public final ܽ(I)V
    .locals 2

    const/4 v0, 0x0

    .line 150
    iget-object v1, p0, Ll/ۗ۟֫;->֫:Landroid/media/MediaCodec;

    invoke-virtual {v1, p1, v0}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    return-void
.end method

.method public final ᩳ()I
    .locals 3

    .line 105
    iget-object v0, p0, Ll/ۗ۟֫;->֫:Landroid/media/MediaCodec;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    move-result v0

    return v0
.end method

.method public final ᩳ(I)Ljava/nio/ByteBuffer;
    .locals 1

    .line 132
    iget-object v0, p0, Ll/ۗ۟֫;->֫:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->getOutputBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1
.end method
