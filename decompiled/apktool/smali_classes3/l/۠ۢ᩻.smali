.class public final Ll/۠ۢ᩻;
.super Ljava/lang/Object;
.source "RAHU"


# instance fields
.field public final ֫:Ll/ۗۢ᩻;


# direct methods
.method public constructor <init>(Ll/ۗۢ᩻;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Ll/۠ۢ᩻;->֫:Ll/ۗۢ᩻;

    return-void
.end method

.method public static ֫(Ljava/io/InputStream;Ljava/io/OutputStream;Ll/ᩳۜܳ;Ll/ۚ᩸ܿ;)V
    .locals 3

    const/4 v0, 0x0

    .line 243
    :try_start_0
    invoke-interface {p2}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v1

    invoke-static {p0, p1, v1, v2, p3}, Ll/ܳ֡ܿ;->֫(Ljava/io/InputStream;Ljava/io/OutputStream;JLl/ۚ᩸ܿ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 250
    :try_start_1
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    goto :goto_0

    :catch_2
    move-exception p0

    :goto_0
    move-object v0, p0

    :goto_1
    if-eqz v0, :cond_2

    .line 263
    instance-of p0, v0, Ljava/io/IOException;

    if-nez p0, :cond_1

    .line 265
    instance-of p0, v0, Ljava/lang/RuntimeException;

    if-eqz p0, :cond_0

    check-cast v0, Ljava/lang/RuntimeException;

    .line 266
    throw v0

    .line 268
    :cond_0
    check-cast v0, Ljava/lang/Error;

    throw v0

    .line 263
    :cond_1
    check-cast v0, Ljava/io/IOException;

    .line 264
    throw v0

    :cond_2
    return-void

    :catchall_0
    move-exception p0

    move-object p2, p0

    move-object p0, v0

    goto :goto_3

    :catch_3
    move-exception p0

    goto :goto_2

    :catch_4
    move-exception p0

    goto :goto_2

    :catch_5
    move-exception p0

    .line 246
    :goto_2
    :try_start_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p2

    .line 250
    :goto_3
    :try_start_3
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_8
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_7
    .catch Ljava/lang/Error; {:try_start_3 .. :try_end_3} :catch_6

    goto :goto_5

    :catch_6
    move-exception p1

    goto :goto_4

    :catch_7
    move-exception p1

    goto :goto_4

    :catch_8
    move-exception p1

    :goto_4
    move-object v0, p1

    if-eqz p0, :cond_3

    .line 255
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_5
    if-nez p0, :cond_6

    if-eqz v0, :cond_6

    .line 263
    instance-of p0, v0, Ljava/io/IOException;

    if-nez p0, :cond_5

    .line 265
    instance-of p0, v0, Ljava/lang/RuntimeException;

    if-eqz p0, :cond_4

    check-cast v0, Ljava/lang/RuntimeException;

    .line 266
    throw v0

    .line 268
    :cond_4
    check-cast v0, Ljava/lang/Error;

    throw v0

    .line 263
    :cond_5
    check-cast v0, Ljava/io/IOException;

    .line 264
    throw v0

    .line 271
    :cond_6
    throw p2
.end method

.method public static ֫(Ljava/io/InputStream;Ll/ۚᩳ֡;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 5

    .line 276
    invoke-static {p0}, Ll/᩻ᩳ֡;->֫(Ljava/io/InputStream;)Ll/֨ᩳ֡;

    move-result-object p0

    invoke-static {p0}, Ll/᩻ᩳ֡;->֫(Ll/֨ᩳ֡;)Ll/ۛܽ֡;

    move-result-object p0

    .line 277
    :try_start_0
    invoke-static {p1}, Ll/᩻ᩳ֡;->֫(Ll/ۚᩳ֡;)Ll/ۤܽ֡;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 279
    :goto_0
    :try_start_1
    invoke-interface {p0}, Ll/ۛܽ֡;->ۢۧ()Z

    move-result v0

    if-nez v0, :cond_2

    .line 281
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 284
    :cond_0
    invoke-interface {p1}, Ll/ۤܽ֡;->᩷()Ll/۫ܽ֡;

    move-result-object v0

    const-wide/16 v1, 0x2000

    invoke-interface {p0, v0, v1, v2}, Ll/֨ᩳ֡;->ۧ(Ll/۫ܽ֡;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    goto :goto_1

    .line 288
    :cond_1
    invoke-interface {p1}, Ll/ۤܽ֡;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 290
    :cond_2
    :goto_1
    :try_start_2
    invoke-interface {p1}, Ll/ۚᩳ֡;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    return-void

    :catchall_0
    move-exception p2

    .line 276
    :try_start_3
    invoke-interface {p1}, Ll/ۚᩳ֡;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p1

    :try_start_5
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1
.end method

.method public static synthetic ֫(Ljava/io/InputStream;Ll/ۢᩳ֡;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 1

    .line 135
    :try_start_0
    invoke-virtual {p1}, Ll/ۢᩳ֡;->֫()Ll/ۚᩳ֡;

    move-result-object v0

    invoke-static {p0, v0, p2}, Ll/۠ۢ᩻;->֫(Ljava/io/InputStream;Ll/ۚᩳ֡;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 141
    invoke-virtual {p1}, Ll/ۢᩳ֡;->֫()Ll/ۚᩳ֡;

    move-result-object p0

    invoke-static {p0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-void

    :catchall_0
    move-exception p0

    .line 139
    :try_start_1
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p3, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    goto :goto_0

    :catch_0
    move-exception p0

    .line 137
    invoke-virtual {p3, p0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 141
    :goto_0
    invoke-virtual {p1}, Ll/ۢᩳ֡;->֫()Ll/ۚᩳ֡;

    move-result-object p0

    invoke-static {p0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-void

    :catchall_1
    move-exception p0

    invoke-virtual {p1}, Ll/ۢᩳ֡;->֫()Ll/ۚᩳ֡;

    move-result-object p1

    invoke-static {p1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 142
    throw p0
.end method

.method public static ֫(Ll/ۗۢ᩻;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    .line 298
    :try_start_0
    invoke-virtual {p0, p1, v0}, Ll/ۗۢ᩻;->ܽ(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 299
    :try_start_1
    invoke-static {p1}, Ll/ۢۤۡ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 301
    invoke-virtual {p0, v1}, Ll/ۗۢ᩻;->ۢ(Ljava/lang/String;)V

    .line 303
    :cond_0
    invoke-virtual {p0, p1}, Ll/ۗۢ᩻;->ᩳ(Ljava/lang/String;)Z

    move-result p0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    if-nez p0, :cond_1

    return-void

    .line 337
    :cond_1
    throw v0

    :catch_1
    move-exception p0

    .line 333
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 334
    throw v0
.end method

.method public static ֫(Ll/ۗۢ᩻;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 312
    :try_start_0
    invoke-virtual {p0, p1, p2}, Ll/ۗۢ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p2

    .line 313
    :try_start_1
    invoke-static {p1}, Ll/ۢۤۡ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 315
    invoke-virtual {p0, v0}, Ll/ۗۢ᩻;->ۢ(Ljava/lang/String;)V

    .line 317
    :cond_0
    invoke-virtual {p0, p1}, Ll/ۗۢ᩻;->ᩳ(Ljava/lang/String;)Z

    move-result p0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    if-nez p0, :cond_1

    return-void

    .line 358
    :cond_1
    throw p2

    :catch_1
    move-exception p0

    .line 354
    invoke-virtual {p2, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 355
    throw p2
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Ll/ܶ᩵ܿ;Ll/ۚ᩸ܿ;)V
    .locals 1

    .line 44
    iget-object v0, p0, Ll/۠ۢ᩻;->֫:Ll/ۗۢ᩻;

    invoke-virtual {v0, p1}, Ll/ܰܺܳ;->֫(Ljava/lang/String;)Ll/ᩳۜܳ;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    .line 48
    invoke-virtual {p0, v0, p2, p1, p3}, Ll/۠ۢ᩻;->֫(Ll/ᩳۜܳ;Ll/ܶ᩵ܿ;ZLl/ۚ᩸ܿ;)V

    return-void

    .line 46
    :cond_0
    new-instance p2, Ljava/io/FileNotFoundException;

    invoke-direct {p2, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final ֫(Ll/ܰܺܳ;Ljava/lang/String;Ljava/lang/String;ZLl/ۚ᩸ܿ;)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p3

    move-object/from16 v3, p5

    .line 105
    iget-object v4, v1, Ll/۠ۢ᩻;->֫:Ll/ۗۢ᩻;

    invoke-virtual {v4, v2}, Ll/ܰܺܳ;->֫(Ljava/lang/String;)Ll/ᩳۜܳ;

    move-result-object v4

    .line 106
    invoke-virtual/range {p1 .. p2}, Ll/ܰܺܳ;->ۧ(Ljava/lang/String;)Ll/ᩳۜܳ;

    move-result-object v5

    if-eqz v4, :cond_f

    .line 108
    move-object v7, v4

    check-cast v7, Ll/ܺۘܳ;

    invoke-virtual {v7}, Ll/ܺۘܳ;->isDirectory()Z

    move-result v8

    if-nez v8, :cond_e

    .line 111
    invoke-static/range {p3 .. p3}, Ll/ۢۤۡ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 112
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    const-wide/16 v12, 0x0

    const/16 v14, 0x10

    cmp-long v15, v10, v12

    if-nez v15, :cond_0

    const-string v10, "0"

    goto :goto_1

    :cond_0
    if-lez v15, :cond_1

    .line 0
    invoke-static {v10, v11, v14}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    move-result-object v10

    goto :goto_1

    :cond_1
    const/16 v15, 0x40

    new-array v6, v15, [C

    invoke-static {v14}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    move-result v17

    :goto_0
    add-int/lit8 v15, v15, -0x1

    long-to-int v12, v10

    and-int/lit8 v12, v12, 0xf

    invoke-static {v12, v14}, Ljava/lang/Character;->forDigit(II)C

    move-result v12

    aput-char v12, v6, v15

    ushr-long v10, v10, v17

    const-wide/16 v12, 0x0

    cmp-long v16, v10, v12

    if-nez v16, :cond_d

    new-instance v10, Ljava/lang/String;

    rsub-int/lit8 v11, v15, 0x40

    invoke-direct {v10, v6, v15, v11}, Ljava/lang/String;-><init>([CII)V

    .line 112
    :goto_1
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p3 .. p3}, Ljava/lang/String;->hashCode()I

    move-result v6

    int-to-long v10, v6

    const-wide v12, 0xffffffffL

    and-long/2addr v10, v12

    .line 0
    invoke-static {v10, v11, v14}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    move-result-object v6

    .line 112
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ".tmp"

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    if-eqz v8, :cond_2

    .line 0
    invoke-static {v8, v6}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    :cond_2
    move-object/from16 v16, p0

    .line 116
    monitor-enter v16

    .line 118
    :try_start_0
    invoke-interface/range {p5 .. p5}, Ll/ܿۖ᩷;->᩻()Z

    move-result v8

    if-eqz v8, :cond_3

    .line 119
    monitor-exit v16

    return-void

    :cond_3
    const/4 v8, 0x0

    .line 180
    invoke-virtual {v0, v8, v5}, Ll/ܰܺܳ;->֫(Ll/ۗܺ᩷;Ll/ᩳۜܳ;)Ljava/io/InputStream;

    move-result-object v8

    if-nez v8, :cond_5

    .line 123
    instance-of v0, v3, Ll/ܳۖ᩷;

    if-eqz v0, :cond_4

    move-object v0, v3

    check-cast v0, Ll/ܳۖ᩷;

    .line 124
    invoke-interface {v0}, Ll/ܳۖ᩷;->cancel()V

    .line 126
    :cond_4
    monitor-exit v16

    return-void

    .line 128
    :cond_5
    monitor-exit v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 129
    instance-of v0, v0, Ll/ۗۢ᩻;

    if-eqz v0, :cond_7

    .line 130
    new-instance v9, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {v9, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 131
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 132
    new-instance v10, Ll/ۢᩳ֡;

    const-wide/32 v11, 0x500000

    invoke-direct {v10, v11, v12}, Ll/ۢᩳ֡;-><init>(J)V

    .line 133
    sget-object v11, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v12, Ll/ۚۢ᩻;

    invoke-direct {v12, v8, v10, v9, v0}, Ll/ۚۢ᩻;-><init>(Ljava/io/InputStream;Ll/ۢᩳ֡;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-interface {v11, v12}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    const/4 v8, 0x1

    .line 144
    :try_start_1
    invoke-virtual {v10}, Ll/ۢᩳ֡;->ۧ()Ll/֨ᩳ֡;

    move-result-object v10

    invoke-static {v10}, Ll/᩻ᩳ֡;->֫(Ll/֨ᩳ֡;)Ll/ۛܽ֡;

    move-result-object v10

    invoke-interface {v10}, Ll/ۛܽ֡;->ۡܽ()Ljava/io/InputStream;

    move-result-object v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 145
    :try_start_2
    iget-object v11, v1, Ll/۠ۢ᩻;->֫:Ll/ۗۢ᩻;

    move-object v12, v5

    check-cast v12, Ll/ܺۘܳ;

    invoke-virtual {v12}, Ll/ܺۘܳ;->getSize()J

    move-result-wide v12

    invoke-virtual {v11, v12, v13, v6}, Ll/ۗۢ᩻;->ۧ(JLjava/lang/String;)Ljava/io/OutputStream;

    move-result-object v11

    .line 146
    invoke-static {v10, v11, v5, v3}, Ll/۠ۢ᩻;->֫(Ljava/io/InputStream;Ljava/io/OutputStream;Ll/ᩳۜܳ;Ll/ۚ᩸ܿ;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 147
    :try_start_3
    invoke-virtual {v10}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 148
    invoke-virtual {v9, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 150
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/IOException;

    if-nez v0, :cond_6

    goto :goto_3

    .line 152
    :cond_6
    throw v0

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 144
    :try_start_4
    invoke-virtual {v10}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v3, v0

    :try_start_5
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v0

    .line 148
    invoke-virtual {v9, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 149
    throw v0

    .line 156
    :cond_7
    :try_start_6
    iget-object v0, v1, Ll/۠ۢ᩻;->֫:Ll/ۗۢ᩻;

    move-object v9, v5

    check-cast v9, Ll/ܺۘܳ;

    invoke-virtual {v9}, Ll/ܺۘܳ;->getSize()J

    move-result-wide v9

    invoke-virtual {v0, v9, v10, v6}, Ll/ۗۢ᩻;->ۧ(JLjava/lang/String;)Ljava/io/OutputStream;

    move-result-object v0

    .line 157
    invoke-static {v8, v0, v5, v3}, Ll/۠ۢ᩻;->֫(Ljava/io/InputStream;Ljava/io/OutputStream;Ll/ᩳۜܳ;Ll/ۚ᩸ܿ;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 158
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V

    .line 160
    :goto_3
    invoke-interface/range {p5 .. p5}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 161
    iget-object v0, v1, Ll/۠ۢ᩻;->֫:Ll/ۗۢ᩻;

    const/4 v4, 0x0

    invoke-virtual {v0, v6, v4}, Ll/ۗۢ᩻;->ۧ(Ljava/lang/String;Z)Z

    goto/16 :goto_6

    :cond_8
    if-eqz p4, :cond_b

    .line 163
    invoke-virtual {v7}, Ll/ܺۘܳ;->getSize()J

    move-result-wide v7

    const-wide/16 v12, 0x0

    cmp-long v0, v7, v12

    if-lez v0, :cond_b

    const-string v0, ".bak"

    .line 165
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 166
    iget-object v7, v1, Ll/۠ۢ᩻;->֫:Ll/ۗۢ᩻;

    invoke-virtual {v7, v0}, Ll/ܰܺܳ;->֫(Ljava/lang/String;)Ll/ᩳۜܳ;

    move-result-object v7

    if-nez v7, :cond_9

    .line 169
    iget-object v7, v1, Ll/۠ۢ᩻;->֫:Ll/ۗۢ᩻;

    invoke-static {v7, v2, v0}, Ll/۠ۢ᩻;->֫(Ll/ۗۢ᩻;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    .line 170
    :cond_9
    check-cast v7, Ll/ܺۘܳ;

    invoke-virtual {v7}, Ll/ܺۘܳ;->isDirectory()Z

    move-result v7

    if-nez v7, :cond_a

    .line 172
    iget-object v7, v1, Ll/۠ۢ᩻;->֫:Ll/ۗۢ᩻;

    invoke-static {v7, v0}, Ll/۠ۢ᩻;->֫(Ll/ۗۢ᩻;Ljava/lang/String;)V

    .line 173
    iget-object v7, v1, Ll/۠ۢ᩻;->֫:Ll/ۗۢ᩻;

    invoke-static {v7, v2, v0}, Ll/۠ۢ᩻;->֫(Ll/ۗۢ᩻;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    .line 176
    :cond_a
    iget-object v0, v1, Ll/۠ۢ᩻;->֫:Ll/ۗۢ᩻;

    invoke-static {v0, v2}, Ll/۠ۢ᩻;->֫(Ll/ۗۢ᩻;Ljava/lang/String;)V

    goto :goto_4

    .line 180
    :cond_b
    iget-object v0, v1, Ll/۠ۢ᩻;->֫:Ll/ۗۢ᩻;

    invoke-static {v0, v2}, Ll/۠ۢ᩻;->֫(Ll/ۗۢ᩻;Ljava/lang/String;)V

    .line 182
    :goto_4
    iget-object v0, v1, Ll/۠ۢ᩻;->֫:Ll/ۗۢ᩻;

    invoke-virtual {v0, v6, v2}, Ll/ۗۢ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    invoke-interface/range {p5 .. p5}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    if-eqz v0, :cond_c

    goto/16 :goto_7

    .line 187
    :cond_c
    invoke-interface {v4}, Ll/ᩳۜܳ;->֨ۧ()Ll/ܽۜܳ;

    move-result-object v0

    if-eqz v0, :cond_13

    .line 188
    iget-object v0, v1, Ll/۠ۢ᩻;->֫:Ll/ۗۢ᩻;

    invoke-interface {v4}, Ll/ᩳۜܳ;->֨ۧ()Ll/ܽۜܳ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ܽۜܳ;->᩻()I

    move-result v4

    .line 396
    invoke-virtual {v0}, Ll/ۗۢ᩻;->᩹()Z

    move-result v6

    if-eqz v6, :cond_13

    .line 398
    :try_start_7
    invoke-virtual {v0, v4, v2}, Ll/ۗۢ᩻;->ۧ(ILjava/lang/String;)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0

    goto :goto_6

    :catch_0
    nop

    goto :goto_6

    :catchall_3
    move-exception v0

    move-object v2, v0

    .line 155
    :try_start_8
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    goto :goto_5

    :catchall_4
    move-exception v0

    move-object v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw v2

    :catchall_5
    move-exception v0

    .line 128
    :try_start_9
    monitor-exit v16
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    throw v0

    :cond_d
    const-wide/16 v12, 0x0

    goto/16 :goto_0

    .line 109
    :cond_e
    new-instance v0, Ljava/io/IOException;

    const-string v3, "File "

    const-string v4, " is a directory"

    .line 0
    invoke-static {v3, v2, v4}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 109
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    move-object/from16 v16, p0

    .line 193
    monitor-enter v16

    .line 195
    :try_start_a
    invoke-interface/range {p5 .. p5}, Ll/ܿۖ᩷;->᩻()Z

    move-result v4

    if-eqz v4, :cond_10

    .line 196
    monitor-exit v16

    return-void

    :cond_10
    const/4 v4, 0x0

    .line 180
    invoke-virtual {v0, v4, v5}, Ll/ܰܺܳ;->֫(Ll/ۗܺ᩷;Ll/ᩳۜܳ;)Ljava/io/InputStream;

    move-result-object v4

    if-nez v4, :cond_12

    .line 200
    instance-of v0, v3, Ll/ܳۖ᩷;

    if-eqz v0, :cond_11

    move-object v0, v3

    check-cast v0, Ll/ܳۖ᩷;

    .line 201
    invoke-interface {v0}, Ll/ܳۖ᩷;->cancel()V

    .line 203
    :cond_11
    monitor-exit v16

    return-void

    .line 205
    :cond_12
    monitor-exit v16
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 207
    :try_start_b
    iget-object v0, v1, Ll/۠ۢ᩻;->֫:Ll/ۗۢ᩻;

    move-object v6, v5

    check-cast v6, Ll/ܺۘܳ;

    invoke-virtual {v6}, Ll/ܺۘܳ;->getSize()J

    move-result-wide v6

    invoke-virtual {v0, v6, v7, v2}, Ll/ۗۢ᩻;->ۧ(JLjava/lang/String;)Ljava/io/OutputStream;

    move-result-object v0

    .line 208
    invoke-static {v4, v0, v5, v3}, Ll/۠ۢ᩻;->֫(Ljava/io/InputStream;Ljava/io/OutputStream;Ll/ᩳۜܳ;Ll/ۚ᩸ܿ;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 209
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V

    .line 210
    invoke-interface/range {p5 .. p5}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    if-eqz v0, :cond_13

    .line 211
    iget-object v0, v1, Ll/۠ۢ᩻;->֫:Ll/ۗۢ᩻;

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v4}, Ll/ۗۢ᩻;->ۧ(Ljava/lang/String;Z)Z

    .line 214
    :cond_13
    :goto_6
    invoke-interface/range {p5 .. p5}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    if-nez v0, :cond_14

    invoke-static {}, Ll/ۙ᩸᩷;->ۚ()Z

    move-result v0

    if-eqz v0, :cond_14

    .line 215
    iget-object v0, v1, Ll/۠ۢ᩻;->֫:Ll/ۗۢ᩻;

    invoke-virtual {v0}, Ll/ۗۢ᩻;->ۗ()Z

    move-result v0

    if-eqz v0, :cond_14

    .line 217
    :try_start_c
    iget-object v0, v1, Ll/۠ۢ᩻;->֫:Ll/ۗۢ᩻;

    check-cast v5, Ll/ܺۘܳ;

    invoke-virtual {v5}, Ll/ܺۘܳ;->getTime()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4, v2}, Ll/ۗۢ᩻;->ܽ(JLjava/lang/String;)V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_1

    :catch_1
    :cond_14
    :goto_7
    return-void

    :catchall_6
    move-exception v0

    move-object v2, v0

    .line 206
    :try_start_d
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    goto :goto_8

    :catchall_7
    move-exception v0

    move-object v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_8
    throw v2

    :catchall_8
    move-exception v0

    .line 205
    :try_start_e
    monitor-exit v16
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    throw v0
.end method

.method public final ֫(Ll/ᩳۜܳ;Ll/ܶ᩵ܿ;ZLl/ۚ᩸ܿ;)V
    .locals 15

    .line 56
    invoke-interface/range {p1 .. p1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v3

    .line 57
    invoke-interface/range {p1 .. p1}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_5

    .line 60
    invoke-interface/range {p1 .. p1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v5

    .line 63
    new-instance v0, Ll/᩷᩻᩻;

    move-object v13, p0

    iget-object v1, v13, Ll/۠ۢ᩻;->֫:Ll/ۗۢ᩻;

    move-object/from16 v14, p4

    invoke-direct {v0, v1, v14}, Ll/᩷᩻᩻;-><init>(Ll/ۗۢ᩻;Ll/ۚ᩸ܿ;)V

    .line 64
    invoke-interface/range {p1 .. p1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface/range {p1 .. p1}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v7

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, v0

    move-object/from16 v4, p2

    .line 177
    invoke-virtual/range {v1 .. v12}, Ll/᩷᩻᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ll/ܶ᩵ܿ;JJLjava/lang/String;Ll/ܿ᩵ܿ;ZZ)V

    .line 66
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 67
    new-instance v2, Ll/֨ۢ᩻;

    invoke-direct {v2, v1}, Ll/֨ۢ᩻;-><init>(Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-virtual {v0, v2}, Ll/᩷᩻᩻;->֫(Ll/᩻᩻᩻;)V

    .line 77
    :try_start_0
    invoke-virtual {v0}, Ll/᩷᩻᩻;->ܽ()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 85
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    if-eqz v0, :cond_1

    .line 87
    instance-of v1, v0, Ljava/io/IOException;

    if-eqz v1, :cond_0

    .line 88
    check-cast v0, Ljava/io/IOException;

    throw v0

    .line 90
    :cond_0
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 93
    :cond_1
    invoke-interface/range {p4 .. p4}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 94
    invoke-virtual/range {p2 .. p2}, Ll/ܶ᩵ܿ;->۫()Z

    return-void

    :cond_2
    if-nez p3, :cond_3

    .line 95
    invoke-virtual/range {p2 .. p2}, Ll/ܶ᩵ܿ;->֨ۧ()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Ll/ۙ᩸᩷;->ۚ()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 96
    invoke-interface/range {p1 .. p1}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v0

    move-object/from16 v2, p2

    invoke-virtual {v2, v0, v1}, Ll/ܶ᩵ܿ;->֫(J)Z

    :cond_3
    return-void

    :catch_0
    move-exception v0

    move-object v1, v0

    .line 79
    nop

    instance-of v0, v1, Ljava/io/IOException;

    if-eqz v0, :cond_4

    .line 80
    move-object v0, v1

    check-cast v0, Ljava/io/IOException;

    throw v0

    .line 82
    :cond_4
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_5
    move-object v13, p0

    .line 58
    new-instance v0, Ljava/io/IOException;

    const-string v1, "File "

    const-string v2, " is a directory"

    .line 0
    invoke-static {v1, v3, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 58
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
