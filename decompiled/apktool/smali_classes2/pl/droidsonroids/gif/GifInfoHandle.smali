.class public final Lpl/droidsonroids/gif/GifInfoHandle;
.super Ljava/lang/Object;
.source "GifInfoHandle.java"


# static fields
.field public static final synthetic ۧ:I


# instance fields
.field public volatile ֫:J


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    .line 25
    invoke-static {}, Ll/۬ۢ֨;->֫()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/res/AssetFileDescriptor;)V
    .locals 5

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    :try_start_0
    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    move-result-wide v1

    .line 74
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/16 v4, 0x1b

    if-le v3, v4, :cond_0

    .line 88
    :try_start_1
    invoke-static {}, Lpl/droidsonroids/gif/GifInfoHandle;->createTempNativeFileDescriptor()I

    move-result v3

    .line 89
    invoke-static {v0, v3}, Landroid/system/Os;->dup2(Ljava/io/FileDescriptor;I)Ljava/io/FileDescriptor;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 95
    :try_start_2
    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catch_0
    move-exception v0

    .line 78
    :try_start_3
    new-instance v1, Lpl/droidsonroids/gif/GifIOException;

    sget-object v2, Ll/ᩳۢ֨;->᩻֫:Ll/ᩳۢ֨;

    iget v2, v2, Ll/ᩳۢ֨;->᩹:I

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lpl/droidsonroids/gif/GifIOException;-><init>(ILjava/lang/String;)V

    throw v1

    :cond_0
    const/4 v3, 0x0

    .line 81
    invoke-static {v0, v3}, Lpl/droidsonroids/gif/GifInfoHandle;->extractNativeFileDescriptor(Ljava/io/FileDescriptor;Z)I

    move-result v3

    .line 83
    :goto_0
    invoke-static {v3, v1, v2}, Lpl/droidsonroids/gif/GifInfoHandle;->openNativeFileDescriptor(IJ)J

    move-result-wide v0

    .line 62
    iput-wide v0, p0, Lpl/droidsonroids/gif/GifInfoHandle;->֫:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 65
    :try_start_4
    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    :catch_1
    return-void

    :catchall_1
    move-exception v0

    :try_start_5
    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    .line 69
    :catch_2
    throw v0
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 2

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    invoke-static {p1}, Lpl/droidsonroids/gif/GifInfoHandle;->openStream(Ljava/io/InputStream;)J

    move-result-wide v0

    iput-wide v0, p0, Lpl/droidsonroids/gif/GifInfoHandle;->֫:J

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    invoke-static {p1}, Lpl/droidsonroids/gif/GifInfoHandle;->openFile(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lpl/droidsonroids/gif/GifInfoHandle;->֫:J

    return-void
.end method

.method public constructor <init>([B)V
    .locals 2

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    invoke-static {p1}, Lpl/droidsonroids/gif/GifInfoHandle;->openByteArray([B)J

    move-result-wide v0

    iput-wide v0, p0, Lpl/droidsonroids/gif/GifInfoHandle;->֫:J

    return-void
.end method

.method public static native bindSurface(JLandroid/view/Surface;[J)V
.end method

.method public static native createTempNativeFileDescriptor()I
.end method

.method public static native extractNativeFileDescriptor(Ljava/io/FileDescriptor;Z)I
.end method

.method public static native free(J)V
.end method

.method public static native getAllocationByteCount(J)J
.end method

.method public static native getComment(J)Ljava/lang/String;
.end method

.method public static native getCurrentFrameIndex(J)I
.end method

.method public static native getCurrentLoop(J)I
.end method

.method public static native getCurrentPosition(J)I
.end method

.method public static native getDuration(J)I
.end method

.method public static native getFrameDuration(JI)I
.end method

.method public static native getHeight(J)I
.end method

.method public static native getLoopCount(J)I
.end method

.method public static native getMetadataByteCount(J)J
.end method

.method public static native getNativeErrorCode(J)I
.end method

.method public static native getNumberOfFrames(J)I
.end method

.method public static native getSavedState(J)[J
.end method

.method public static native getSourceLength(J)J
.end method

.method public static native getWidth(J)I
.end method

.method public static native glTexImage2D(JII)V
.end method

.method public static native glTexSubImage2D(JII)V
.end method

.method public static native initTexImageDescriptor(J)V
.end method

.method public static native isAnimationCompleted(J)Z
.end method

.method public static native isOpaque(J)Z
.end method

.method public static native openByteArray([B)J
.end method

.method public static native openDirectByteBuffer(Ljava/nio/ByteBuffer;)J
.end method

.method public static native openFile(Ljava/lang/String;)J
.end method

.method public static native openNativeFileDescriptor(IJ)J
.end method

.method public static native openStream(Ljava/io/InputStream;)J
.end method

.method public static native postUnbindSurface(J)V
.end method

.method public static native renderFrame(JLandroid/graphics/Bitmap;)J
.end method

.method public static native reset(J)Z
.end method

.method public static native restoreRemainder(J)J
.end method

.method public static native restoreSavedState(J[JLandroid/graphics/Bitmap;)I
.end method

.method public static native saveRemainder(J)V
.end method

.method public static native seekToFrame(JILandroid/graphics/Bitmap;)V
.end method

.method public static native seekToFrameGL(JI)V
.end method

.method public static native seekToTime(JILandroid/graphics/Bitmap;)V
.end method

.method public static native setLoopCount(JC)V
.end method

.method public static native setOptions(JCZ)V
.end method

.method public static native setSpeedFactor(JF)V
.end method

.method public static native startDecoderThread(J)V
.end method

.method public static native stopDecoderThread(J)V
.end method


# virtual methods
.method public final finalize()V
    .locals 1

    .line 297
    :try_start_0
    invoke-virtual {p0}, Lpl/droidsonroids/gif/GifInfoHandle;->֡()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 299
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    return-void

    :catchall_0
    move-exception v0

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 300
    throw v0
.end method

.method public final declared-synchronized ֡()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 204
    :try_start_0
    iget-wide v1, p0, Lpl/droidsonroids/gif/GifInfoHandle;->֫:J

    invoke-static {v1, v2}, Lpl/droidsonroids/gif/GifInfoHandle;->free(J)V

    const-wide/16 v1, 0x0

    .line 205
    iput-wide v1, p0, Lpl/droidsonroids/gif/GifInfoHandle;->֫:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 206
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ֨()J
    .locals 3

    move-object v0, p0

    monitor-enter v0

    .line 209
    :try_start_0
    iget-wide v1, p0, Lpl/droidsonroids/gif/GifInfoHandle;->֫:J

    invoke-static {v1, v2}, Lpl/droidsonroids/gif/GifInfoHandle;->restoreRemainder(J)J

    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ֫([JLandroid/graphics/Bitmap;)I
    .locals 3

    move-object v0, p0

    monitor-enter v0

    .line 316
    :try_start_0
    iget-wide v1, p0, Lpl/droidsonroids/gif/GifInfoHandle;->֫:J

    invoke-static {v1, v2, p1, p2}, Lpl/droidsonroids/gif/GifInfoHandle;->restoreSavedState(J[JLandroid/graphics/Bitmap;)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫()J
    .locals 3

    move-object v0, p0

    monitor-enter v0

    .line 283
    :try_start_0
    iget-wide v1, p0, Lpl/droidsonroids/gif/GifInfoHandle;->֫:J

    invoke-static {v1, v2}, Lpl/droidsonroids/gif/GifInfoHandle;->getAllocationByteCount(J)J

    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ֫(Landroid/graphics/Bitmap;)J
    .locals 3

    move-object v0, p0

    monitor-enter v0

    .line 196
    :try_start_0
    iget-wide v1, p0, Lpl/droidsonroids/gif/GifInfoHandle;->֫:J

    invoke-static {v1, v2, p1}, Lpl/droidsonroids/gif/GifInfoHandle;->renderFrame(JLandroid/graphics/Bitmap;)J

    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(F)V
    .locals 3

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-lez v0, :cond_1

    .line 246
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_1

    const/high16 v0, 0x30000000

    cmpg-float v0, p1, v0

    if-gez v0, :cond_0

    const/high16 p1, 0x30000000

    :cond_0
    move-object v0, p0

    .line 252
    monitor-enter v0

    .line 253
    :try_start_0
    iget-wide v1, p0, Lpl/droidsonroids/gif/GifInfoHandle;->֫:J

    invoke-static {v1, v2, p1}, Lpl/droidsonroids/gif/GifInfoHandle;->setSpeedFactor(JF)V

    .line 254
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 247
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Speed factor is not positive"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(I)V
    .locals 3

    if-ltz p1, :cond_0

    const v0, 0xffff

    if-gt p1, v0, :cond_0

    move-object v0, p0

    .line 232
    monitor-enter v0

    .line 233
    :try_start_0
    iget-wide v1, p0, Lpl/droidsonroids/gif/GifInfoHandle;->֫:J

    int-to-char p1, p1

    invoke-static {v1, v2, p1}, Lpl/droidsonroids/gif/GifInfoHandle;->setLoopCount(JC)V

    .line 234
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 230
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Loop count of range <0, 65535>"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final declared-synchronized ֫(ILandroid/graphics/Bitmap;)V
    .locals 3

    move-object v0, p0

    monitor-enter v0

    .line 274
    :try_start_0
    iget-wide v1, p0, Lpl/droidsonroids/gif/GifInfoHandle;->֫:J

    invoke-static {v1, v2, p1, p2}, Lpl/droidsonroids/gif/GifInfoHandle;->seekToTime(JILandroid/graphics/Bitmap;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 275
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(Landroid/view/Surface;[J)V
    .locals 2

    .line 200
    iget-wide v0, p0, Lpl/droidsonroids/gif/GifInfoHandle;->֫:J

    invoke-static {v0, v1, p1, p2}, Lpl/droidsonroids/gif/GifInfoHandle;->bindSurface(JLandroid/view/Surface;[J)V

    return-void
.end method

.method public final ֫(ZC)V
    .locals 2

    .line 325
    iget-wide v0, p0, Lpl/droidsonroids/gif/GifInfoHandle;->֫:J

    invoke-static {v0, v1, p2, p1}, Lpl/droidsonroids/gif/GifInfoHandle;->setOptions(JCZ)V

    return-void
.end method

.method public final declared-synchronized ۖ()Z
    .locals 3

    move-object v0, p0

    monitor-enter v0

    .line 308
    :try_start_0
    iget-wide v1, p0, Lpl/droidsonroids/gif/GifInfoHandle;->֫:J

    invoke-static {v1, v2}, Lpl/droidsonroids/gif/GifInfoHandle;->isAnimationCompleted(J)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ۘ()Z
    .locals 3

    move-object v0, p0

    monitor-enter v0

    .line 341
    :try_start_0
    iget-wide v1, p0, Lpl/droidsonroids/gif/GifInfoHandle;->֫:J

    invoke-static {v1, v2}, Lpl/droidsonroids/gif/GifInfoHandle;->isOpaque(J)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ۚ()Z
    .locals 3

    move-object v0, p0

    monitor-enter v0

    .line 213
    :try_start_0
    iget-wide v1, p0, Lpl/droidsonroids/gif/GifInfoHandle;->֫:J

    invoke-static {v1, v2}, Lpl/droidsonroids/gif/GifInfoHandle;->reset(J)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ۜ()J
    .locals 3

    move-object v0, p0

    monitor-enter v0

    .line 287
    :try_start_0
    iget-wide v1, p0, Lpl/droidsonroids/gif/GifInfoHandle;->֫:J

    invoke-static {v1, v2}, Lpl/droidsonroids/gif/GifInfoHandle;->getMetadataByteCount(J)J

    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ۠()V
    .locals 3

    move-object v0, p0

    monitor-enter v0

    .line 217
    :try_start_0
    iget-wide v1, p0, Lpl/droidsonroids/gif/GifInfoHandle;->֫:J

    invoke-static {v1, v2}, Lpl/droidsonroids/gif/GifInfoHandle;->saveRemainder(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 218
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ۡ()[J
    .locals 3

    move-object v0, p0

    monitor-enter v0

    .line 312
    :try_start_0
    iget-wide v1, p0, Lpl/droidsonroids/gif/GifInfoHandle;->֫:J

    invoke-static {v1, v2}, Lpl/droidsonroids/gif/GifInfoHandle;->getSavedState(J)[J

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ۢ()I
    .locals 3

    move-object v0, p0

    monitor-enter v0

    .line 337
    :try_start_0
    iget-wide v1, p0, Lpl/droidsonroids/gif/GifInfoHandle;->֫:J

    invoke-static {v1, v2}, Lpl/droidsonroids/gif/GifInfoHandle;->getNumberOfFrames(J)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ۧ()I
    .locals 3

    move-object v0, p0

    monitor-enter v0

    .line 266
    :try_start_0
    iget-wide v1, p0, Lpl/droidsonroids/gif/GifInfoHandle;->֫:J

    invoke-static {v1, v2}, Lpl/droidsonroids/gif/GifInfoHandle;->getCurrentFrameIndex(J)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ܳ()I
    .locals 3

    move-object v0, p0

    monitor-enter v0

    .line 333
    :try_start_0
    iget-wide v1, p0, Lpl/droidsonroids/gif/GifInfoHandle;->֫:J

    invoke-static {v1, v2}, Lpl/droidsonroids/gif/GifInfoHandle;->getHeight(J)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ܺ()I
    .locals 3

    move-object v0, p0

    monitor-enter v0

    .line 329
    :try_start_0
    iget-wide v1, p0, Lpl/droidsonroids/gif/GifInfoHandle;->֫:J

    invoke-static {v1, v2}, Lpl/droidsonroids/gif/GifInfoHandle;->getWidth(J)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ܽ()I
    .locals 3

    move-object v0, p0

    monitor-enter v0

    .line 270
    :try_start_0
    iget-wide v1, p0, Lpl/droidsonroids/gif/GifInfoHandle;->֫:J

    invoke-static {v1, v2}, Lpl/droidsonroids/gif/GifInfoHandle;->getCurrentLoop(J)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ܿ()I
    .locals 3

    move-object v0, p0

    monitor-enter v0

    .line 258
    :try_start_0
    iget-wide v1, p0, Lpl/droidsonroids/gif/GifInfoHandle;->֫:J

    invoke-static {v1, v2}, Lpl/droidsonroids/gif/GifInfoHandle;->getDuration(J)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ᩳ()I
    .locals 3

    move-object v0, p0

    monitor-enter v0

    .line 262
    :try_start_0
    iget-wide v1, p0, Lpl/droidsonroids/gif/GifInfoHandle;->֫:J

    invoke-static {v1, v2}, Lpl/droidsonroids/gif/GifInfoHandle;->getCurrentPosition(J)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ᩴ()Z
    .locals 6

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 291
    :try_start_0
    iget-wide v1, p0, Lpl/droidsonroids/gif/GifInfoHandle;->֫:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ᩵()V
    .locals 3

    move-object v0, p0

    monitor-enter v0

    .line 304
    :try_start_0
    iget-wide v1, p0, Lpl/droidsonroids/gif/GifInfoHandle;->֫:J

    invoke-static {v1, v2}, Lpl/droidsonroids/gif/GifInfoHandle;->postUnbindSurface(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 305
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ᩷()I
    .locals 3

    move-object v0, p0

    monitor-enter v0

    .line 242
    :try_start_0
    iget-wide v1, p0, Lpl/droidsonroids/gif/GifInfoHandle;->֫:J

    invoke-static {v1, v2}, Lpl/droidsonroids/gif/GifInfoHandle;->getNativeErrorCode(J)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ᩻()I
    .locals 3

    move-object v0, p0

    monitor-enter v0

    .line 225
    :try_start_0
    iget-wide v1, p0, Lpl/droidsonroids/gif/GifInfoHandle;->֫:J

    invoke-static {v1, v2}, Lpl/droidsonroids/gif/GifInfoHandle;->getLoopCount(J)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
