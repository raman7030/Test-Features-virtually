.class public final Ll/ۖ᩸ۘ;
.super Ll/ܺ᩸ۘ;
.source "51RR"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public ֫֫:Landroid/os/Handler;

.field public ۗ:Ljava/io/FileWriter;

.field public ۙ:Ll/ۘ᩸ۘ;

.field public volatile ۛ:Ll/֡᩸ۘ;

.field public ۟:Landroid/os/HandlerThread;

.field public volatile ۤ:Ll/֡᩸ۘ;

.field public volatile ۨ:Ll/֡᩸ۘ;

.field public ۫:[C

.field public ۬:Ljava/io/File;

.field public volatile ܰ:Z

.field public volatile ᩺:Ll/֡᩸ۘ;


# direct methods
.method public constructor <init>(Ll/ۘ᩸ۘ;)V
    .locals 2

    .line 77
    sget-object v0, Ll/ᩴ᩸ۘ;->֫:Ljava/lang/String;

    .line 94
    invoke-direct {p0}, Ll/ܺ᩸ۘ;-><init>()V

    const/4 v0, 0x0

    .line 64
    iput-boolean v0, p0, Ll/ۖ᩸ۘ;->ܰ:Z

    .line 387
    iput-object p1, p0, Ll/ۖ᩸ۘ;->ۙ:Ll/ۘ᩸ۘ;

    .line 99
    new-instance v0, Ll/֡᩸ۘ;

    invoke-direct {v0}, Ll/֡᩸ۘ;-><init>()V

    iput-object v0, p0, Ll/ۖ᩸ۘ;->ۤ:Ll/֡᩸ۘ;

    .line 100
    new-instance v0, Ll/֡᩸ۘ;

    invoke-direct {v0}, Ll/֡᩸ۘ;-><init>()V

    iput-object v0, p0, Ll/ۖ᩸ۘ;->ۛ:Ll/֡᩸ۘ;

    .line 102
    iget-object v0, p0, Ll/ۖ᩸ۘ;->ۤ:Ll/֡᩸ۘ;

    iput-object v0, p0, Ll/ۖ᩸ۘ;->ۨ:Ll/֡᩸ۘ;

    .line 103
    iget-object v0, p0, Ll/ۖ᩸ۘ;->ۛ:Ll/֡᩸ۘ;

    iput-object v0, p0, Ll/ۖ᩸ۘ;->᩺:Ll/֡᩸ۘ;

    .line 105
    invoke-virtual {p1}, Ll/ۘ᩸ۘ;->֫()I

    move-result p1

    new-array p1, p1, [C

    iput-object p1, p0, Ll/ۖ᩸ۘ;->۫:[C

    .line 107
    new-instance p1, Landroid/os/HandlerThread;

    const-string v0, "OpenSDK.Client.File.Tracer"

    const/16 v1, 0xa

    invoke-direct {p1, v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    iput-object p1, p0, Ll/ۖ᩸ۘ;->۟:Landroid/os/HandlerThread;

    .line 111
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 114
    invoke-virtual {p1}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 116
    new-instance v0, Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {v0, p1, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Ll/ۖ᩸ۘ;->֫֫:Landroid/os/Handler;

    :cond_0
    return-void
.end method

.method private ܿ()V
    .locals 3

    .line 337
    :try_start_0
    iget-object v0, p0, Ll/ۖ᩸ۘ;->ۗ:Ljava/io/FileWriter;

    if-eqz v0, :cond_0

    .line 339
    invoke-virtual {v0}, Ljava/io/Writer;->flush()V

    .line 340
    iget-object v0, p0, Ll/ۖ᩸ۘ;->ۗ:Ljava/io/FileWriter;

    invoke-virtual {v0}, Ljava/io/Writer;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "openSDK_LOG"

    const-string v2, "-->closeAppSpecificFileWriter() exception:"

    .line 345
    invoke-static {v1, v2, v0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method private ᩳ()Ljava/io/FileWriter;
    .locals 14

    .line 376
    iget-object v0, p0, Ll/ۖ᩸ۘ;->ۙ:Ll/ۘ᩸ۘ;

    .line 250
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 216
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 217
    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 218
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yy.MM.dd.HH"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 219
    invoke-virtual {v2}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "com.tencent.mobileqq_connectSdk."

    const-string v3, ".log"

    .line 0
    invoke-static {v2, v0, v3}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1254
    invoke-static {}, Ll/᩺ۤۡ;->ܽ()Ljava/io/File;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    .line 1257
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v6

    if-nez v6, :cond_0

    .line 1258
    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    .line 1260
    :cond_0
    invoke-virtual {v4}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_1
    move-object v4, v5

    .line 194
    :goto_0
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    const-string v7, "openSDK_LOG"

    if-eqz v6, :cond_2

    if-eqz v4, :cond_4

    .line 196
    :cond_2
    :try_start_0
    new-instance v6, Ljava/io/File;

    sget-object v8, Ll/ᩴ᩸ۘ;->ܽ:Ljava/lang/String;

    invoke-direct {v6, v4, v8}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v4

    if-nez v4, :cond_3

    .line 199
    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    .line 201
    :cond_3
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v6, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v4, "getWorkFile,get app specific file exception:"

    .line 204
    invoke-static {v7, v4, v0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    move-object v4, v5

    :goto_1
    if-eqz v4, :cond_d

    .line 254
    iget-object v0, p0, Ll/ۖ᩸ۘ;->۬:Ljava/io/File;

    invoke-virtual {v4, v0}, Ljava/io/File;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Ll/ۖ᩸ۘ;->ۗ:Ljava/io/FileWriter;

    if-nez v0, :cond_d

    .line 255
    :cond_5
    iput-object v4, p0, Ll/ۖ᩸ۘ;->۬:Ljava/io/File;

    .line 257
    invoke-direct {p0}, Ll/ۖ᩸ۘ;->ܿ()V

    .line 260
    :try_start_1
    new-instance v0, Ljava/io/FileWriter;

    iget-object v6, p0, Ll/ۖ᩸ۘ;->۬:Ljava/io/File;

    const/4 v8, 0x1

    invoke-direct {v0, v6, v8}, Ljava/io/FileWriter;-><init>(Ljava/io/File;Z)V

    iput-object v0, p0, Ll/ۖ᩸ۘ;->ۗ:Ljava/io/FileWriter;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    .line 262
    :catch_1
    iput-object v5, p0, Ll/ۖ᩸ۘ;->ۗ:Ljava/io/FileWriter;

    const-string v0, "-->obtainFileWriter() app specific file permission denied"

    .line 263
    invoke-static {v7, v0}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 276
    :goto_2
    invoke-virtual {v4}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_d

    .line 277
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v4

    if-nez v4, :cond_6

    goto/16 :goto_5

    .line 281
    :cond_6
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_7

    goto/16 :goto_5

    .line 286
    :cond_7
    array-length v4, v0

    const/4 v5, 0x0

    :goto_3
    if-ge v5, v4, :cond_d

    aget-object v6, v0, v5

    if-nez v6, :cond_8

    goto/16 :goto_4

    .line 313
    :cond_8
    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v7

    .line 314
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "name="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const-string v9, "FileTracer"

    invoke-static {v9, v8}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 316
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_9

    goto :goto_4

    .line 323
    :cond_9
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v8

    const/16 v10, 0x2f

    if-eq v8, v10, :cond_a

    goto :goto_4

    .line 327
    :cond_a
    invoke-virtual {v7, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-virtual {v7, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_c

    .line 291
    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v7

    const/16 v8, 0x20

    const/16 v10, 0x2b

    .line 294
    invoke-virtual {v7, v8, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    .line 296
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    const-wide/32 v12, 0xf731400

    sub-long/2addr v10, v12

    .line 216
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v12

    .line 217
    invoke-virtual {v12, v10, v11}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 218
    new-instance v10, Ljava/text/SimpleDateFormat;

    invoke-direct {v10, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 219
    invoke-virtual {v12}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v10

    .line 299
    invoke-virtual {v10, v8}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v8

    if-gtz v8, :cond_b

    goto :goto_4

    .line 303
    :cond_b
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    move-result v6

    .line 304
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v10, "delete name="

    invoke-direct {v8, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ", success="

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v9, v6}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    :cond_c
    :goto_4
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_3

    .line 269
    :cond_d
    :goto_5
    iget-object v0, p0, Ll/ۖ᩸ۘ;->ۗ:Ljava/io/FileWriter;

    return-object v0
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 3

    .line 175
    iget p1, p1, Landroid/os/Message;->what:I

    const/16 v0, 0x400

    const/4 v1, 0x1

    if-eq p1, v0, :cond_0

    goto :goto_2

    .line 208
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iget-object v0, p0, Ll/ۖ᩸ۘ;->۟:Landroid/os/HandlerThread;

    if-eq p1, v0, :cond_1

    goto :goto_2

    .line 213
    :cond_1
    iget-boolean p1, p0, Ll/ۖ᩸ۘ;->ܰ:Z

    if-eqz p1, :cond_2

    goto :goto_2

    .line 218
    :cond_2
    iput-boolean v1, p0, Ll/ۖ᩸ۘ;->ܰ:Z

    move-object v0, p0

    .line 354
    monitor-enter v0

    .line 356
    :try_start_0
    iget-object p1, p0, Ll/ۖ᩸ۘ;->ۨ:Ll/֡᩸ۘ;

    iget-object v2, p0, Ll/ۖ᩸ۘ;->ۤ:Ll/֡᩸ۘ;

    if-ne p1, v2, :cond_3

    .line 358
    iget-object p1, p0, Ll/ۖ᩸ۘ;->ۛ:Ll/֡᩸ۘ;

    iput-object p1, p0, Ll/ۖ᩸ۘ;->ۨ:Ll/֡᩸ۘ;

    .line 359
    iget-object p1, p0, Ll/ۖ᩸ۘ;->ۤ:Ll/֡᩸ۘ;

    iput-object p1, p0, Ll/ۖ᩸ۘ;->᩺:Ll/֡᩸ۘ;

    goto :goto_0

    .line 363
    :cond_3
    iget-object p1, p0, Ll/ۖ᩸ۘ;->ۤ:Ll/֡᩸ۘ;

    iput-object p1, p0, Ll/ۖ᩸ۘ;->ۨ:Ll/֡᩸ۘ;

    .line 364
    iget-object p1, p0, Ll/ۖ᩸ۘ;->ۛ:Ll/֡᩸ۘ;

    iput-object p1, p0, Ll/ۖ᩸ۘ;->᩺:Ll/֡᩸ۘ;

    .line 366
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 225
    :try_start_1
    iget-object p1, p0, Ll/ۖ᩸ۘ;->᩺:Ll/֡᩸ۘ;

    invoke-direct {p0}, Ll/ۖ᩸ۘ;->ᩳ()Ljava/io/FileWriter;

    move-result-object v0

    iget-object v2, p0, Ll/ۖ᩸ۘ;->۫:[C

    invoke-virtual {p1, v0, v2}, Ll/֡᩸ۘ;->֫(Ljava/io/FileWriter;[C)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    :try_start_2
    const-string v0, "FileTracer"

    const-string v2, "flushBuffer exception"

    .line 229
    invoke-static {v0, v2, p1}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 234
    :goto_1
    iget-object p1, p0, Ll/ۖ᩸ۘ;->᩺:Ll/֡᩸ۘ;

    invoke-virtual {p1}, Ll/֡᩸ۘ;->ܽ()V

    const/4 p1, 0x0

    .line 238
    iput-boolean p1, p0, Ll/ۖ᩸ۘ;->ܰ:Z

    :goto_2
    return v1

    .line 234
    :goto_3
    iget-object v0, p0, Ll/ۖ᩸ۘ;->᩺:Ll/֡᩸ۘ;

    invoke-virtual {v0}, Ll/֡᩸ۘ;->ܽ()V

    .line 235
    throw p1

    :catchall_1
    move-exception p1

    .line 366
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method

.method public final ۧ()V
    .locals 3

    .line 130
    iget-object v0, p0, Ll/ۖ᩸ۘ;->֫֫:Landroid/os/Handler;

    const/16 v1, 0x400

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 132
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 136
    :cond_0
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method

.method public final ۧ(ILjava/lang/Thread;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 4

    .line 156
    invoke-virtual {p0}, Ll/ܺ᩸ۘ;->֫()Ll/ۚ᩸ۘ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v0, 0x3e8

    .line 110
    rem-long v0, p3, v0

    .line 112
    new-instance v2, Landroid/text/format/Time;

    invoke-direct {v2}, Landroid/text/format/Time;-><init>()V

    .line 114
    invoke-virtual {v2, p3, p4}, Landroid/text/format/Time;->set(J)V

    .line 116
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const/4 p4, 0x1

    if-eq p1, p4, :cond_5

    const/4 p4, 0x2

    if-eq p1, p4, :cond_4

    const/4 p4, 0x4

    if-eq p1, p4, :cond_3

    const/16 p4, 0x8

    if-eq p1, p4, :cond_2

    const/16 p4, 0x10

    if-eq p1, p4, :cond_1

    const/16 p4, 0x20

    if-eq p1, p4, :cond_0

    const-string p1, "-"

    goto :goto_0

    :cond_0
    const-string p1, "A"

    goto :goto_0

    :cond_1
    const-string p1, "E"

    goto :goto_0

    :cond_2
    const-string p1, "W"

    goto :goto_0

    :cond_3
    const-string p1, "I"

    goto :goto_0

    :cond_4
    const-string p1, "D"

    goto :goto_0

    :cond_5
    const-string p1, "V"

    .line 118
    :goto_0
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2f

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string p1, "%Y-%m-%d %H:%M:%S"

    invoke-virtual {v2, p1}, Landroid/text/format/Time;->format(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-wide/16 v2, 0xa

    cmp-long p1, v0, v2

    if-gez p1, :cond_6

    const-string p1, "00"

    .line 122
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_6
    const-wide/16 v2, 0x64

    cmp-long p1, v0, v2

    if-gez p1, :cond_7

    const/16 p1, 0x30

    .line 126
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 129
    :cond_7
    :goto_1
    invoke-virtual {p3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " ["

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "]["

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p2, :cond_8

    const-string p2, "N/A"

    .line 134
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 138
    :cond_8
    invoke-virtual {p2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_2
    const-string p2, "] "

    .line 0
    invoke-static {p3, p1, p5, p2, p6}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0xa

    .line 141
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    if-eqz p7, :cond_9

    const-string p2, "* Exception : \n"

    .line 145
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p7}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 148
    :cond_9
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 163
    iget-object p2, p0, Ll/ۖ᩸ۘ;->ۨ:Ll/֡᩸ۘ;

    invoke-virtual {p2, p1}, Ll/֡᩸ۘ;->֫(Ljava/lang/String;)V

    .line 166
    iget-object p1, p0, Ll/ۖ᩸ۘ;->ۨ:Ll/֡᩸ۘ;

    invoke-virtual {p1}, Ll/֡᩸ۘ;->ۧ()I

    move-result p1

    .line 376
    iget-object p2, p0, Ll/ۖ᩸ۘ;->ۙ:Ll/ۘ᩸ۘ;

    .line 166
    invoke-virtual {p2}, Ll/ۘ᩸ۘ;->֫()I

    move-result p2

    if-lt p1, p2, :cond_a

    .line 168
    invoke-virtual {p0}, Ll/ۖ᩸ۘ;->ۧ()V

    :cond_a
    return-void
.end method

.method public final ܽ()V
    .locals 1

    .line 148
    invoke-direct {p0}, Ll/ۖ᩸ۘ;->ܿ()V

    .line 150
    iget-object v0, p0, Ll/ۖ᩸ۘ;->۟:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    return-void
.end method
