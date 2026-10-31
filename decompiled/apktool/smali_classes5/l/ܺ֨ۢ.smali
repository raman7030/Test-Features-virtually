.class public Ll/ܺ֨ۢ;
.super Ll/ܰۚۢ;
.source "D98Y"


# direct methods
.method public constructor <init>()V
    .locals 1
    .annotation build Ll/ۙᩳ;
    .end annotation

    .line 34
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    const-string v0, "bin.mt.shell.IShizukuCommand"

    .line 35
    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(Ljava/lang/String;ILjava/lang/String;Z)Landroid/os/Bundle;
    .locals 2

    .line 216
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "status"

    .line 217
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "output"

    const-string v1, "output_gzip"

    .line 218
    invoke-static {v0, p1, v1, p0, p3}, Ll/ܺ֨ۢ;->֫(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string p0, "error"

    const-string p1, "error_gzip"

    .line 219
    invoke-static {v0, p0, p1, p2, p3}, Ll/ܺ֨ۢ;->֫(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0
.end method

.method public static ֫(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2

    if-nez p3, :cond_0

    const-string p3, ""

    :cond_0
    if-eqz p4, :cond_2

    .line 230
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p4

    if-nez p4, :cond_1

    goto :goto_1

    .line 245
    :cond_1
    :try_start_0
    new-instance p4, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p4}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 246
    new-instance v0, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v0, p4}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 247
    :try_start_1
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p3, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p3

    invoke-virtual {v0, p3}, Ljava/io/OutputStream;->write([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 248
    :try_start_2
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 249
    invoke-virtual {p4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p3

    .line 235
    invoke-virtual {p0, p2, p3}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catchall_0
    move-exception p2

    .line 246
    :try_start_3
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p3

    :try_start_4
    invoke-virtual {p2, p3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p2
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    const-string p2, "Command output too large after compression"

    .line 237
    invoke-virtual {p0, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 231
    :cond_2
    :goto_1
    invoke-virtual {p0, p1, p3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(Ljava/io/Closeable;)V
    .locals 0

    if-nez p0, :cond_0

    return-void

    .line 84
    :cond_0
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static ֫(Ljava/lang/Process;)V
    .locals 2

    if-nez p0, :cond_0

    goto :goto_0

    .line 97
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Process;->destroy()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 101
    :catch_0
    :try_start_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Process;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 102
    invoke-virtual {p0}, Ljava/lang/Process;->destroyForcibly()Ljava/lang/Process;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_1
    :goto_0
    return-void
.end method

.method public static ۧ(ILjava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 10

    const/4 v0, 0x0

    .line 201
    invoke-static {p1, p0, p2, v0}, Ll/ܺ֨ۢ;->֫(Ljava/lang/String;ILjava/lang/String;Z)Landroid/os/Bundle;

    move-result-object v1

    const-wide/16 v2, 0x2

    const-wide/16 v4, 0x10

    if-eqz p1, :cond_1

    .line 266
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_0

    goto :goto_0

    .line 269
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v6

    int-to-long v6, v6

    mul-long v6, v6, v2

    add-long/2addr v6, v4

    goto :goto_1

    :cond_1
    :goto_0
    move-wide v6, v4

    :goto_1
    const-wide/16 v8, 0x400

    add-long/2addr v6, v8

    if-eqz p2, :cond_3

    .line 266
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_2

    goto :goto_2

    .line 269
    :cond_2
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v8

    int-to-long v8, v8

    mul-long v8, v8, v2

    add-long/2addr v4, v8

    :cond_3
    :goto_2
    add-long/2addr v6, v4

    const v2, 0x3c000

    .line 259
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    int-to-long v2, v2

    cmp-long v4, v6, v2

    if-gtz v4, :cond_4

    goto :goto_3

    .line 276
    :cond_4
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v2

    .line 278
    :try_start_0
    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    .line 279
    invoke-virtual {v2}, Landroid/os/Parcel;->dataSize()I

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 281
    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    const/high16 v2, 0x40000

    if-gt v3, v2, :cond_5

    :goto_3
    return-object v1

    :cond_5
    const/4 v1, 0x1

    .line 205
    invoke-static {p1, p0, p2, v1}, Ll/ܺ֨ۢ;->֫(Ljava/lang/String;ILjava/lang/String;Z)Landroid/os/Bundle;

    move-result-object p0

    .line 276
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object p1

    .line 278
    :try_start_1
    invoke-virtual {p0, p1, v0}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    .line 279
    invoke-virtual {p1}, Landroid/os/Parcel;->dataSize()I

    move-result p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 281
    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    if-gt p2, v2, :cond_6

    return-object p0

    :cond_6
    const-string p0, ""

    const-string p1, "Command output too large after compression"

    const/4 p2, 0x2

    .line 209
    invoke-static {p0, p2, p1, v0}, Ll/ܺ֨ۢ;->֫(Ljava/lang/String;ILjava/lang/String;Z)Landroid/os/Bundle;

    move-result-object p0

    return-object p0

    :catchall_0
    move-exception p0

    .line 281
    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    .line 282
    throw p0

    :catchall_1
    move-exception p0

    .line 281
    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    .line 282
    throw p0
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 64
    invoke-static {}, Landroid/system/Os;->getuid()I

    move-result v0

    return v0
.end method

.method public final ֫(ILjava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 17

    move/from16 v0, p1

    move-object/from16 v1, p3

    const-string v2, ""

    const/4 v3, 0x2

    const/4 v4, 0x0

    .line 161
    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v5

    move-object/from16 v6, p2

    invoke-virtual {v5, v6}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    const-string v6, "UTF-8"

    if-eqz v1, :cond_0

    .line 162
    :try_start_1
    invoke-virtual/range {p3 .. p3}, Ljava/lang/String;->length()I

    move-result v7

    if-lez v7, :cond_0

    .line 163
    invoke-virtual {v5}, Ljava/lang/Process;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v7
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 164
    :try_start_2
    invoke-virtual {v1, v6}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v7, v1}, Ljava/io/OutputStream;->write([B)V

    .line 165
    invoke-virtual {v7}, Ljava/io/OutputStream;->flush()V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v1, v4

    move-object v6, v1

    goto/16 :goto_4

    :catch_0
    move-exception v0

    move-object v1, v4

    move-object v7, v1

    goto/16 :goto_5

    :cond_0
    move-object v7, v4

    .line 167
    :goto_0
    invoke-virtual {v5}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v1
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 168
    :try_start_3
    invoke-virtual {v5}, Ljava/lang/Process;->getErrorStream()Ljava/io/InputStream;

    move-result-object v4

    .line 169
    new-instance v8, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v8}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 170
    new-instance v9, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v9}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const-string v10, "ShizukuCommand-stdout"

    .line 112
    new-instance v11, Ljava/lang/Thread;

    new-instance v12, Ll/ۡ֨ۢ;

    invoke-direct {v12, v1, v8}, Ll/ۡ֨ۢ;-><init>(Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;)V

    invoke-direct {v11, v12}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    const/4 v12, 0x1

    .line 113
    invoke-virtual {v11, v12}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 114
    invoke-virtual {v11, v10}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 115
    invoke-virtual {v11}, Ljava/lang/Thread;->start()V

    const-string v10, "ShizukuCommand-stderr"

    .line 112
    new-instance v13, Ljava/lang/Thread;

    new-instance v14, Ll/ۡ֨ۢ;

    invoke-direct {v14, v4, v9}, Ll/ۡ֨ۢ;-><init>(Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;)V

    invoke-direct {v13, v14}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 113
    invoke-virtual {v13, v12}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 114
    invoke-virtual {v13, v10}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 115
    invoke-virtual {v13}, Ljava/lang/Thread;->start()V

    if-lez v0, :cond_1

    int-to-long v14, v0

    .line 175
    invoke-static {v5, v14, v15}, Ll/᩻ۛۡ;->֫(Ljava/lang/Process;J)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "Process timeout"

    .line 176
    invoke-static {v12, v2, v0}, Ll/ܺ֨ۢ;->ۧ(ILjava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 190
    :goto_1
    invoke-static {v7}, Ll/ܺ֨ۢ;->֫(Ljava/io/Closeable;)V

    .line 191
    invoke-static {v1}, Ll/ܺ֨ۢ;->֫(Ljava/io/Closeable;)V

    .line 192
    invoke-static {v4}, Ll/ܺ֨ۢ;->֫(Ljava/io/Closeable;)V

    .line 193
    :goto_2
    invoke-static {v5}, Ll/ܺ֨ۢ;->֫(Ljava/lang/Process;)V

    return-object v0

    .line 179
    :cond_1
    :try_start_4
    invoke-virtual {v5}, Ljava/lang/Process;->waitFor()I

    .line 148
    :cond_2
    invoke-virtual {v11}, Ljava/lang/Thread;->join()V

    invoke-virtual {v13}, Ljava/lang/Thread;->join()V

    .line 183
    invoke-virtual {v8, v6}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v6}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x0

    invoke-static {v8, v0, v6}, Ll/ܺ֨ۢ;->ۧ(ILjava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v6, v4

    goto :goto_3

    :catch_1
    move-exception v0

    move-object/from16 v16, v4

    move-object v4, v1

    move-object/from16 v1, v16

    goto :goto_5

    :catchall_2
    move-exception v0

    move-object v1, v4

    move-object v6, v1

    :goto_3
    move-object v4, v7

    goto :goto_4

    :catch_2
    move-exception v0

    move-object v1, v4

    goto :goto_5

    :catchall_3
    move-exception v0

    move-object v1, v4

    move-object v5, v1

    move-object v6, v5

    .line 188
    :goto_4
    :try_start_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v2, v0}, Ll/ܺ֨ۢ;->ۧ(ILjava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 190
    invoke-static {v4}, Ll/ܺ֨ۢ;->֫(Ljava/io/Closeable;)V

    .line 191
    invoke-static {v1}, Ll/ܺ֨ۢ;->֫(Ljava/io/Closeable;)V

    .line 192
    invoke-static {v6}, Ll/ܺ֨ۢ;->֫(Ljava/io/Closeable;)V

    goto :goto_2

    :catchall_4
    move-exception v0

    goto :goto_6

    :catch_3
    move-exception v0

    move-object v1, v4

    move-object v5, v1

    move-object v7, v5

    .line 185
    :goto_5
    :try_start_6
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Thread;->interrupt()V

    .line 186
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v2, v0}, Ll/ܺ֨ۢ;->ۧ(ILjava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 190
    invoke-static {v7}, Ll/ܺ֨ۢ;->֫(Ljava/io/Closeable;)V

    .line 191
    invoke-static {v4}, Ll/ܺ֨ۢ;->֫(Ljava/io/Closeable;)V

    .line 192
    invoke-static {v1}, Ll/ܺ֨ۢ;->֫(Ljava/io/Closeable;)V

    goto :goto_2

    :catchall_5
    move-exception v0

    move-object v6, v1

    move-object v1, v4

    move-object v4, v7

    .line 190
    :goto_6
    invoke-static {v4}, Ll/ܺ֨ۢ;->֫(Ljava/io/Closeable;)V

    .line 191
    invoke-static {v1}, Ll/ܺ֨ۢ;->֫(Ljava/io/Closeable;)V

    .line 192
    invoke-static {v6}, Ll/ܺ֨ۢ;->֫(Ljava/io/Closeable;)V

    .line 193
    invoke-static {v5}, Ll/ܺ֨ۢ;->֫(Ljava/lang/Process;)V

    .line 194
    throw v0
.end method
