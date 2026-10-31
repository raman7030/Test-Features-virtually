.class public final Ll/᩶ܰ֫;
.super Ljava/lang/Object;
.source "58T1"

# interfaces
.implements Ll/ܽ۟֫;


# static fields
.field public static final ۜ:Ljava/lang/Object;

.field public static final ᩻:Ljava/util/ArrayDeque;


# instance fields
.field public final ֫:Landroid/media/MediaCodec;

.field public final ۧ:Ll/ܳۚ֫;

.field public ܳ:Z

.field public ܽ:Landroid/os/Handler;

.field public final ܿ:Ljava/util/concurrent/atomic/AtomicReference;

.field public final ᩳ:Landroid/os/HandlerThread;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 53
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    sput-object v0, Ll/᩶ܰ֫;->᩻:Ljava/util/ArrayDeque;

    .line 55
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/᩶ܰ֫;->ۜ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/media/MediaCodec;Landroid/os/HandlerThread;)V
    .locals 1

    .line 71
    new-instance v0, Ll/ܳۚ֫;

    invoke-direct {v0}, Ll/ܳۚ֫;-><init>()V

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    iput-object p1, p0, Ll/᩶ܰ֫;->֫:Landroid/media/MediaCodec;

    .line 78
    iput-object p2, p0, Ll/᩶ܰ֫;->ᩳ:Landroid/os/HandlerThread;

    .line 79
    iput-object v0, p0, Ll/᩶ܰ֫;->ۧ:Ll/ܳۚ֫;

    .line 80
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Ll/᩶ܰ֫;->ܿ:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static ֫(Ll/᩶ܰ֫;Landroid/os/Message;)V
    .locals 10

    .line 186
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_9

    const/4 v1, 0x2

    if-eq v0, v1, :cond_6

    const/4 v1, 0x3

    if-eq v0, v1, :cond_5

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    .line 209
    iget-object v0, p0, Ll/᩶ܰ֫;->ܿ:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Ljava/lang/IllegalStateException;

    iget p0, p1, Landroid/os/Message;->what:I

    .line 210
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 0
    :cond_0
    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto/16 :goto_2

    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    goto/16 :goto_2

    .line 205
    :cond_2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Landroid/os/Bundle;

    .line 242
    :try_start_0
    iget-object v0, p0, Ll/᩶ܰ֫;->֫:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setParameters(Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_2

    :catch_0
    move-exception p1

    .line 244
    iget-object v0, p0, Ll/᩶ܰ֫;->ܿ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 0
    :cond_3
    invoke-virtual {v0, v2, p1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_3

    goto :goto_2

    .line 202
    :cond_5
    iget-object p0, p0, Ll/᩶ܰ֫;->ۧ:Ll/ܳۚ֫;

    invoke-virtual {p0}, Ll/ܳۚ֫;->ܿ()Z

    goto :goto_2

    .line 193
    :cond_6
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Ll/᩹ܰ֫;

    .line 194
    iget v4, v1, Ll/᩹ܰ֫;->ܽ:I

    iget-object v6, v1, Ll/᩹ܰ֫;->֫:Landroid/media/MediaCodec$CryptoInfo;

    iget-wide v7, v1, Ll/᩹ܰ֫;->ᩳ:J

    iget v9, v1, Ll/᩹ܰ֫;->ۧ:I

    .line 232
    :try_start_1
    sget-object p1, Ll/᩶ܰ֫;->ۜ:Ljava/lang/Object;

    move-object v0, p1

    monitor-enter v0
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 233
    :try_start_2
    iget-object v3, p0, Ll/᩶ܰ֫;->֫:Landroid/media/MediaCodec;

    const/4 v5, 0x0

    invoke-virtual/range {v3 .. v9}, Landroid/media/MediaCodec;->queueSecureInputBuffer(IILandroid/media/MediaCodec$CryptoInfo;JI)V

    .line 234
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw p1
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    move-exception p1

    move-object v0, p1

    .line 236
    iget-object v3, p0, Ll/᩶ܰ֫;->ܿ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 0
    :cond_7
    invoke-virtual {v3, v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_8

    goto :goto_0

    :cond_8
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_7

    :goto_0
    move-object v2, v1

    goto :goto_2

    .line 188
    :cond_9
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ll/᩹ܰ֫;

    .line 189
    iget v4, p1, Ll/᩹ܰ֫;->ܽ:I

    iget v6, p1, Ll/᩹ܰ֫;->ܿ:I

    iget-wide v7, p1, Ll/᩹ܰ֫;->ᩳ:J

    iget v9, p1, Ll/᩹ܰ֫;->ۧ:I

    .line 220
    :try_start_4
    iget-object v3, p0, Ll/᩶ܰ֫;->֫:Landroid/media/MediaCodec;

    const/4 v5, 0x0

    invoke-virtual/range {v3 .. v9}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_1

    :catch_2
    move-exception v0

    .line 222
    iget-object p0, p0, Ll/᩶ܰ֫;->ܿ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 0
    :cond_a
    invoke-virtual {p0, v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    goto :goto_1

    :cond_b
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_a

    :goto_1
    move-object v2, p1

    :goto_2
    if-eqz v2, :cond_c

    .line 213
    invoke-static {v2}, Ll/᩶ܰ֫;->֫(Ll/᩹ܰ֫;)V

    :cond_c
    return-void
.end method

.method public static ֫(Ll/᩹ܰ֫;)V
    .locals 2

    .line 259
    sget-object v1, Ll/᩶ܰ֫;->᩻:Ljava/util/ArrayDeque;

    move-object v0, v1

    monitor-enter v0

    .line 260
    :try_start_0
    invoke-virtual {v1, p0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 261
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ۧ()Ll/᩹ܰ֫;
    .locals 3

    .line 249
    sget-object v1, Ll/᩶ܰ֫;->᩻:Ljava/util/ArrayDeque;

    move-object v0, v1

    monitor-enter v0

    .line 250
    :try_start_0
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 251
    new-instance v1, Ll/᩹ܰ֫;

    invoke-direct {v1}, Ll/᩹ܰ֫;-><init>()V

    monitor-exit v0

    return-object v1

    .line 253
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩹ܰ֫;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 255
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public final flush()V
    .locals 3

    .line 128
    iget-boolean v0, p0, Ll/᩶ܰ֫;->ܳ:Z

    if-eqz v0, :cond_0

    .line 167
    :try_start_0
    iget-object v0, p0, Ll/᩶ܰ֫;->ܽ:Landroid/os/Handler;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    .line 167
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 172
    iget-object v0, p0, Ll/᩶ܰ֫;->ۧ:Ll/ܳۚ֫;

    invoke-virtual {v0}, Ll/ܳۚ֫;->ܽ()V

    .line 173
    iget-object v1, p0, Ll/᩶ܰ֫;->ܽ:Landroid/os/Handler;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x3

    .line 173
    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    .line 174
    invoke-virtual {v0}, Ll/ܳۚ֫;->֫()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 132
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 135
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    return-void
.end method

.method public final shutdown()V
    .locals 1

    .line 142
    iget-boolean v0, p0, Ll/᩶ܰ֫;->ܳ:Z

    if-eqz v0, :cond_0

    .line 143
    invoke-virtual {p0}, Ll/᩶ܰ֫;->flush()V

    .line 144
    iget-object v0, p0, Ll/᩶ܰ֫;->ᩳ:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    :cond_0
    const/4 v0, 0x0

    .line 146
    iput-boolean v0, p0, Ll/᩶ܰ֫;->ܳ:Z

    return-void
.end method

.method public final start()V
    .locals 2

    .line 85
    iget-boolean v0, p0, Ll/᩶ܰ֫;->ܳ:Z

    if-nez v0, :cond_0

    .line 86
    iget-object v0, p0, Ll/᩶ܰ֫;->ᩳ:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 87
    new-instance v1, Ll/᩸ܰ֫;

    .line 88
    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, p0, v0}, Ll/᩸ܰ֫;-><init>(Ll/᩶ܰ֫;Landroid/os/Looper;)V

    iput-object v1, p0, Ll/᩶ܰ֫;->ܽ:Landroid/os/Handler;

    const/4 v0, 0x1

    .line 94
    iput-boolean v0, p0, Ll/᩶ܰ֫;->ܳ:Z

    :cond_0
    return-void
.end method

.method public final ֫()V
    .locals 2

    .line 156
    iget-object v0, p0, Ll/᩶ܰ֫;->ܿ:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/RuntimeException;

    if-nez v0, :cond_0

    return-void

    .line 158
    :cond_0
    throw v0
.end method

.method public final ֫(IIIJ)V
    .locals 1

    .line 101
    invoke-virtual {p0}, Ll/᩶ܰ֫;->֫()V

    .line 102
    invoke-static {}, Ll/᩶ܰ֫;->ۧ()Ll/᩹ܰ֫;

    move-result-object v0

    .line 280
    iput p1, v0, Ll/᩹ܰ֫;->ܽ:I

    .line 282
    iput p2, v0, Ll/᩹ܰ֫;->ܿ:I

    .line 283
    iput-wide p4, v0, Ll/᩹ܰ֫;->ᩳ:J

    .line 284
    iput p3, v0, Ll/᩹ܰ֫;->ۧ:I

    .line 104
    iget-object p1, p0, Ll/᩶ܰ֫;->ܽ:Landroid/os/Handler;

    sget-object p2, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const/4 p2, 0x1

    invoke-virtual {p1, p2, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    .line 105
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public final ֫(ILl/ۚ᩸֫;JI)V
    .locals 3

    .line 111
    invoke-virtual {p0}, Ll/᩶ܰ֫;->֫()V

    .line 112
    invoke-static {}, Ll/᩶ܰ֫;->ۧ()Ll/᩹ܰ֫;

    move-result-object v0

    .line 280
    iput p1, v0, Ll/᩹ܰ֫;->ܽ:I

    const/4 p1, 0x0

    .line 282
    iput p1, v0, Ll/᩹ܰ֫;->ܿ:I

    .line 283
    iput-wide p3, v0, Ll/᩹ܰ֫;->ᩳ:J

    .line 284
    iput p5, v0, Ll/᩹ܰ֫;->ۧ:I

    .line 114
    iget-object p3, v0, Ll/᩹ܰ֫;->֫:Landroid/media/MediaCodec$CryptoInfo;

    .line 293
    iget p4, p2, Ll/ۚ᩸֫;->᩷:I

    iput p4, p3, Landroid/media/MediaCodec$CryptoInfo;->numSubSamples:I

    .line 294
    iget-object p4, p2, Ll/ۚ᩸֫;->᩻:[I

    iget-object p5, p3, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfClearData:[I

    if-nez p4, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p5, :cond_2

    .line 322
    array-length v1, p5

    array-length v2, p4

    if-ge v1, v2, :cond_1

    goto :goto_0

    .line 325
    :cond_1
    array-length v1, p4

    invoke-static {p4, p1, p5, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_1

    .line 323
    :cond_2
    :goto_0
    array-length p5, p4

    invoke-static {p4, p5}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p5

    .line 295
    :goto_1
    iput-object p5, p3, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfClearData:[I

    .line 296
    iget-object p4, p2, Ll/ۚ᩸֫;->ۜ:[I

    iget-object p5, p3, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfEncryptedData:[I

    if-nez p4, :cond_3

    goto :goto_3

    :cond_3
    if-eqz p5, :cond_5

    .line 322
    array-length v1, p5

    array-length v2, p4

    if-ge v1, v2, :cond_4

    goto :goto_2

    .line 325
    :cond_4
    array-length v1, p4

    invoke-static {p4, p1, p5, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_3

    .line 323
    :cond_5
    :goto_2
    array-length p5, p4

    invoke-static {p4, p5}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p5

    .line 297
    :goto_3
    iput-object p5, p3, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfEncryptedData:[I

    .line 298
    iget-object p4, p2, Ll/ۚ᩸֫;->ܿ:[B

    iget-object p5, p3, Landroid/media/MediaCodec$CryptoInfo;->key:[B

    if-nez p4, :cond_6

    goto :goto_5

    :cond_6
    if-eqz p5, :cond_8

    .line 343
    array-length v1, p5

    array-length v2, p4

    if-ge v1, v2, :cond_7

    goto :goto_4

    .line 346
    :cond_7
    array-length v1, p4

    invoke-static {p4, p1, p5, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_5

    .line 344
    :cond_8
    :goto_4
    array-length p5, p4

    invoke-static {p4, p5}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p5

    .line 155
    :goto_5
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    iput-object p5, p3, Landroid/media/MediaCodec$CryptoInfo;->key:[B

    .line 299
    iget-object p4, p2, Ll/ۚ᩸֫;->ᩳ:[B

    iget-object p5, p3, Landroid/media/MediaCodec$CryptoInfo;->iv:[B

    if-nez p4, :cond_9

    goto :goto_7

    :cond_9
    if-eqz p5, :cond_b

    .line 343
    array-length v1, p5

    array-length v2, p4

    if-ge v1, v2, :cond_a

    goto :goto_6

    .line 346
    :cond_a
    array-length v1, p4

    invoke-static {p4, p1, p5, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_7

    .line 344
    :cond_b
    :goto_6
    array-length p1, p4

    invoke-static {p4, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p5

    .line 155
    :goto_7
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    iput-object p5, p3, Landroid/media/MediaCodec$CryptoInfo;->iv:[B

    .line 300
    iget p1, p2, Ll/ۚ᩸֫;->ܳ:I

    iput p1, p3, Landroid/media/MediaCodec$CryptoInfo;->mode:I

    .line 301
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p4, 0x18

    if-lt p1, p4, :cond_c

    .line 302
    new-instance p1, Landroid/media/MediaCodec$CryptoInfo$Pattern;

    iget p1, p2, Ll/ۚ᩸֫;->ۧ:I

    iget p2, p2, Ll/ۚ᩸֫;->֫:I

    new-instance p4, Landroid/media/MediaCodec$CryptoInfo$Pattern;

    invoke-direct {p4, p1, p2}, Landroid/media/MediaCodec$CryptoInfo$Pattern;-><init>(II)V

    .line 305
    invoke-virtual {p3, p4}, Landroid/media/MediaCodec$CryptoInfo;->setPattern(Landroid/media/MediaCodec$CryptoInfo$Pattern;)V

    .line 115
    :cond_c
    iget-object p1, p0, Ll/᩶ܰ֫;->ܽ:Landroid/os/Handler;

    .line 116
    sget-object p2, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const/4 p2, 0x2

    invoke-virtual {p1, p2, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    .line 117
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public final ֫(Landroid/os/Bundle;)V
    .locals 2

    .line 122
    invoke-virtual {p0}, Ll/᩶ܰ֫;->֫()V

    .line 123
    iget-object v0, p0, Ll/᩶ܰ֫;->ܽ:Landroid/os/Handler;

    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const/4 v1, 0x4

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method
