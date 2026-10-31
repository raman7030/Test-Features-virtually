.class public final Ll/ᩴ᩸ۜ;
.super Ljava/lang/Object;
.source "H74N"


# static fields
.field public static final ֫:Ll/֨᩵;

.field public static final ۧ:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 34
    new-instance v0, Ll/֨᩵;

    const/16 v1, 0x1f4

    invoke-direct {v0, v1}, Ll/֨᩵;-><init>(I)V

    sput-object v0, Ll/ᩴ᩸ۜ;->֫:Ll/֨᩵;

    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ᩴ᩸ۜ;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ll/ᩳۜܳ;J)Ljava/lang/String;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-lez v2, :cond_0

    return-object p0

    .line 0
    :cond_0
    invoke-static {p0}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    .line 119
    sget-object p2, Ll/ᩴ᩸ۜ;->ۧ:Ljava/lang/String;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 121
    invoke-static {p0}, Ll/ܳۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/media/MediaDataSource;I)Ll/ۢ᩸ۜ;
    .locals 6

    const-string v0, "ts-thumbnail:"

    .line 218
    :try_start_0
    invoke-virtual {p0}, Landroid/media/MediaDataSource;->getSize()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-gez v5, :cond_0

    .line 220
    invoke-static {}, Ll/ۢ᩸ۜ;->ܽ()Ll/ۢ᩸ۜ;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 238
    invoke-static {p0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-object p1

    .line 222
    :cond_0
    :try_start_1
    new-instance v3, Ll/ۡ᩸ۜ;

    .line 424
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 223
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 224
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 225
    new-instance v4, Ll/ۜ᩸ۜ;

    invoke-direct {v4, p0, v1, v2, v3}, Ll/ۜ᩸ۜ;-><init>(Landroid/media/MediaDataSource;JLl/ۡ᩸ۜ;)V

    const/4 v1, 0x1

    .line 226
    invoke-static {v0, v4, v1}, Ll/۫֡ۜ;->֫(Ljava/lang/String;Ll/ۛ֡ۜ;Z)Ll/۫֡ۜ;

    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 258
    :try_start_2
    new-instance v1, Ll/᩻᩸ۜ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, p1, v1}, Ll/᩺ܶۜ;->֫(Ll/۫֡ۜ;ILl/᩶ۗۜ;)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 263
    new-instance v0, Ll/ۢ᩸ۜ;

    invoke-direct {v0, p1}, Ll/ۢ᩸ۜ;-><init>(Landroid/graphics/Bitmap;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 269
    :goto_0
    :try_start_3
    invoke-static {v3}, Ll/ۡ᩸ۜ;->֫(Ll/ۡ᩸ۜ;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 270
    invoke-static {}, Ll/ۢ᩸ۜ;->ܽ()Ll/ۢ᩸ۜ;

    move-result-object v0

    goto :goto_1

    .line 272
    :cond_1
    invoke-static {p1}, Ll/ᩴ᩸ۜ;->֫(Ljava/lang/Exception;)Ll/ۢ᩸ۜ;

    move-result-object v0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 238
    :goto_1
    invoke-static {p0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-object v0

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_2
    move-exception p1

    .line 236
    :try_start_4
    invoke-static {p1}, Ll/ᩴ᩸ۜ;->֫(Ljava/lang/Exception;)Ll/ۢ᩸ۜ;

    move-result-object p1

    goto :goto_2

    .line 234
    :catch_3
    invoke-static {}, Ll/ۢ᩸ۜ;->ܽ()Ll/ۢ᩸ۜ;

    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 238
    :goto_2
    invoke-static {p0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-object p1

    :goto_3
    invoke-static {p0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 239
    throw p1
.end method

.method public static ֫(Ljava/lang/Exception;)Ll/ۢ᩸ۜ;
    .locals 2

    .line 285
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    if-eqz p0, :cond_4

    .line 290
    instance-of v0, p0, Ljava/io/InterruptedIOException;

    if-nez v0, :cond_3

    instance-of v0, p0, Ll/ܺ᩸ۜ;

    if-nez v0, :cond_3

    .line 292
    sget v0, Ll/᩺ܶۜ;->᩷:I

    .line 272
    instance-of v0, p0, Ll/ۗܶۜ;

    if-eqz v0, :cond_1

    goto :goto_1

    .line 275
    :cond_1
    instance-of v0, p0, Landroid/media/MediaCodec$CodecException;

    if-eqz v0, :cond_2

    move-object v0, p0

    check-cast v0, Landroid/media/MediaCodec$CodecException;

    .line 276
    invoke-virtual {v0}, Landroid/media/MediaCodec$CodecException;->isTransient()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v0}, Landroid/media/MediaCodec$CodecException;->isRecoverable()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    .line 295
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    goto :goto_0

    .line 280
    :cond_3
    :goto_1
    invoke-static {}, Ll/ۢ᩸ۜ;->ܽ()Ll/ۢ᩸ۜ;

    move-result-object p0

    return-object p0

    :cond_4
    invoke-static {}, Ll/ۢ᩸ۜ;->ᩳ()Ll/ۢ᩸ۜ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;I)Ll/ۢ᩸ۜ;
    .locals 5

    .line 177
    new-instance v0, Ll/ۡ᩸ۜ;

    .line 424
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x1

    .line 179
    invoke-static {p0, v1}, Ll/۫֡ۜ;->֫(Ll/ܶ᩵ܿ;Z)Ll/۫֡ۜ;

    move-result-object v2

    .line 180
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "ts-thumbnail-local:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 183
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v3, Ll/ܳ᩸ۜ;

    invoke-direct {v3, v2, v0}, Ll/ܳ᩸ۜ;-><init>(Ll/۫֡ۜ;Ll/ۡ᩸ۜ;)V

    .line 181
    invoke-static {p0, v3, v1}, Ll/۫֡ۜ;->֫(Ljava/lang/String;Ll/ۛ֡ۜ;Z)Ll/۫֡ۜ;

    move-result-object p0

    .line 258
    :try_start_0
    new-instance v1, Ll/᩻᩸ۜ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {p0, p1, v1}, Ll/᩺ܶۜ;->֫(Ll/۫֡ۜ;ILl/᩶ۗۜ;)Landroid/graphics/Bitmap;

    move-result-object p0

    .line 263
    new-instance p1, Ll/ۢ᩸ۜ;

    invoke-direct {p1, p0}, Ll/ۢ᩸ۜ;-><init>(Landroid/graphics/Bitmap;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    .line 269
    :goto_0
    invoke-static {v0}, Ll/ۡ᩸ۜ;->֫(Ll/ۡ᩸ۜ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 270
    invoke-static {}, Ll/ۢ᩸ۜ;->ܽ()Ll/ۢ᩸ۜ;

    move-result-object p1

    goto :goto_1

    .line 272
    :cond_0
    invoke-static {p0}, Ll/ᩴ᩸ۜ;->֫(Ljava/lang/Exception;)Ll/ۢ᩸ۜ;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public static ֫(Landroid/media/MediaDataSource;)Ll/᩷᩸ۜ;
    .locals 9

    const/16 v0, 0x3ac

    new-array v7, v0, [B

    const/4 v1, 0x0

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v0, :cond_1

    .line 143
    invoke-static {}, Ll/ᩴ᩸ۜ;->ܽ()V

    int-to-long v2, v8

    rsub-int v6, v8, 0x3ac

    move-object v1, p0

    move-object v4, v7

    move v5, v8

    .line 144
    invoke-virtual/range {v1 .. v6}, Landroid/media/MediaDataSource;->readAt(J[BII)I

    move-result v1

    if-lez v1, :cond_0

    add-int/2addr v8, v1

    goto :goto_0

    .line 146
    :cond_0
    new-instance p0, Ljava/io/EOFException;

    const-string v0, "Unexpected end of MPEG-TS probe source"

    invoke-direct {p0, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 150
    :cond_1
    invoke-static {v7}, Ll/ᩴ᩸ۜ;->֫([B)Ll/᩷᩸ۜ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/io/InputStream;)Ll/᩷᩸ۜ;
    .locals 2

    .line 128
    invoke-static {}, Ll/ᩴ᩸ۜ;->ܽ()V

    const/16 v0, 0x3ac

    new-array v1, v0, [B

    .line 2020
    invoke-static {p0, v1, v0}, Ll/᩹ۢ֡;->ۧ(Ljava/io/InputStream;[BI)V

    .line 131
    invoke-static {}, Ll/ᩴ᩸ۜ;->ܽ()V

    .line 132
    invoke-static {v1}, Ll/ᩴ᩸ۜ;->֫([B)Ll/᩷᩸ۜ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Ll/᩷᩸ۜ;
    .locals 2

    .line 99
    sget-object v1, Ll/ᩴ᩸ۜ;->֫:Ll/֨᩵;

    move-object v0, v1

    monitor-enter v0

    .line 100
    :try_start_0
    invoke-virtual {v1, p0}, Ll/֨᩵;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩷᩸ۜ;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    .line 101
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ֫([B)Ll/᩷᩸ۜ;
    .locals 4

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0xbc

    if-ge v0, v1, :cond_2

    const/4 v1, 0x0

    :goto_1
    const/4 v2, 0x5

    if-ge v1, v2, :cond_1

    mul-int/lit16 v2, v1, 0xbc

    add-int/2addr v2, v0

    .line 159
    aget-byte v2, p0, v2

    and-int/lit16 v2, v2, 0xff

    const/16 v3, 0x47

    if-eq v2, v3, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 165
    :cond_1
    sget-object p0, Ll/᩷᩸ۜ;->᩹:Ll/᩷᩸ۜ;

    return-object p0

    .line 168
    :cond_2
    sget-object p0, Ll/᩷᩸ۜ;->ۙ:Ll/᩷᩸ۜ;

    return-object p0
.end method

.method public static synthetic ֫()V
    .locals 0

    .line 0
    invoke-static {}, Ll/ᩴ᩸ۜ;->ܽ()V

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ll/᩷᩸ۜ;)V
    .locals 2

    .line 107
    sget-object v1, Ll/ᩴ᩸ۜ;->֫:Ll/֨᩵;

    move-object v0, v1

    monitor-enter v0

    .line 108
    :try_start_0
    invoke-virtual {v1, p0, p1}, Ll/֨᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ֫(JLjava/lang/String;)Z
    .locals 2

    .line 86
    invoke-static {p2}, Ll/۫֡ۜ;->֫(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    const-wide/32 v0, 0xbc00

    cmp-long p2, p0, v0

    if-ltz p2, :cond_0

    const-wide/16 v0, 0xbc

    .line 91
    rem-long/2addr p0, v0

    const-wide/16 v0, 0x0

    cmp-long p2, p0, v0

    if-nez p2, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static bridge synthetic ۧ()V
    .locals 0

    .line 0
    invoke-static {}, Ll/ᩴ᩸ۜ;->ܽ()V

    return-void
.end method

.method public static ۧ(Ljava/lang/String;)Z
    .locals 0

    .line 86
    invoke-static {p0}, Ll/۫֡ۜ;->֫(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static ܽ()V
    .locals 2

    .line 320
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 321
    :cond_0
    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "MPEG-TS thumbnail decode was canceled"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
