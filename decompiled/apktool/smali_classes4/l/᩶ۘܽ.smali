.class public final Ll/᩶ۘܽ;
.super Ljava/lang/Object;
.source "Z5ED"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:Ljava/util/concurrent/LinkedBlockingQueue;

.field public static ܽ:Ljava/io/File;

.field public static final ܿ:Ll/ܿ۠᩵;

.field public static ᩳ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 20
    new-instance v0, Ll/᩸ۘܽ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Ll/ܳ۠᩵;->֫(Ll/֫᩹᩵;)Ll/ܿ۠᩵;

    move-result-object v0

    sput-object v0, Ll/᩶ۘܽ;->ܿ:Ll/ܿ۠᩵;

    .line 21
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    sput-object v0, Ll/᩶ۘܽ;->ۧ:Ljava/util/concurrent/LinkedBlockingQueue;

    return-void
.end method

.method public static ֫()Ll/۠۠᩵;
    .locals 8

    .line 96
    sget-object v0, Ll/᩶ۘܽ;->ۧ:Ljava/util/concurrent/LinkedBlockingQueue;

    const/4 v1, 0x0

    .line 97
    :try_start_0
    sget-object v2, Ll/᩶ۘܽ;->ܽ:Ljava/io/File;

    if-eqz v2, :cond_2

    new-instance v3, Ljava/io/FileOutputStream;

    invoke-direct {v3, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    new-instance v2, Ljava/io/BufferedOutputStream;

    const/16 v4, 0x2000

    invoke-direct {v2, v3, v4}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V

    .line 99
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v3

    :goto_0
    const/4 v4, 0x0

    .line 101
    :cond_0
    :goto_1
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v6, 0x1

    invoke-virtual {v0, v6, v7, v5}, Ljava/util/concurrent/LinkedBlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-nez v5, :cond_1

    if-eqz v4, :cond_0

    .line 104
    invoke-virtual {v2}, Ljava/io/BufferedOutputStream;->flush()V

    goto :goto_0

    .line 108
    :cond_1
    invoke-static {v3}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-virtual {v5, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v4

    const-string v5, "getBytes(...)"

    invoke-static {v4, v5}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/io/OutputStream;->write([B)V

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    const-string v2, "currentFile"

    .line 97
    invoke-static {v2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    const/4 v2, 0x0

    throw v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v2

    .line 109
    invoke-static {v2}, Ll/ᩴ۠᩵;->֫(Ljava/lang/Throwable;)Ll/ۖ۠᩵;

    move-result-object v2

    .line 112
    invoke-static {v2}, Ll/ۘ۠᩵;->֫(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 113
    sput-boolean v1, Ll/᩶ۘܽ;->ᩳ:Z

    .line 114
    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->clear()V

    .line 116
    :cond_3
    sget-object v0, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    return-object v0
.end method

.method public static final ֫(Ljava/lang/String;)V
    .locals 1

    const-string v0, "content"

    .line 5
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mtio "

    .line 142
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    invoke-static {p0, v0}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final ֫(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "content"

    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "start-up "

    .line 136
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, p1}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final ֫(Ll/᩶ۡ᩷;)V
    .locals 5

    .line 72
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p0

    const-string v1, "log"

    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 73
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result p0

    if-nez p0, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    .line 77
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/32 v3, 0xf731400

    sub-long/2addr v1, v3

    .line 78
    sget-object p0, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v3, Ll/۠ۘܽ;

    invoke-direct {v3, v0, v1, v2}, Ll/۠ۘܽ;-><init>(Ljava/io/File;J)V

    invoke-interface {p0, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const/4 p0, 0x1

    .line 92
    sput-boolean p0, Ll/᩶ۘܽ;->ᩳ:Z

    .line 93
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result p0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "init: pid="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    .line 126
    invoke-static {p0, v1}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 94
    new-instance p0, Ljava/io/File;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ".log"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    sput-object p0, Ll/᩶ۘܽ;->ܽ:Ljava/io/File;

    .line 28
    new-instance p0, Ll/᩹ܶ᩵;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 v0, 0x1

    .line 34
    invoke-virtual {p0, v0}, Ljava/lang/Thread;->setDaemon(Z)V

    const-string v0, "MLog"

    .line 38
    invoke-virtual {p0, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 42
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public static final ۧ()V
    .locals 7

    .line 159
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 160
    :goto_0
    sget-object v2, Ll/᩶ۘܽ;->ۧ:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    const-wide/16 v4, 0x3e8

    cmp-long v6, v2, v4

    if-gez v6, :cond_0

    const-wide/16 v2, 0x64

    .line 161
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final ۧ(Ljava/lang/String;)V
    .locals 1

    const-string v0, "content"

    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 135
    invoke-static {p0, v0}, Ll/᩶ۘܽ;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 6

    const-string v0, "content"

    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "\n"

    const-string v1, ""

    if-nez p1, :cond_0

    goto :goto_2

    .line 128
    :cond_0
    invoke-static {p1}, Ll/ۘ۫ۡ;->֫(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "getStackTraceString(...)"

    invoke-static {p1, v2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ltz v2, :cond_3

    :goto_0
    add-int/lit8 v3, v2, -0x1

    .line 130
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0xa

    if-ne v4, v5, :cond_2

    if-gez v3, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    goto :goto_0

    :cond_2
    add-int/lit8 v2, v2, 0x1

    const/4 v1, 0x0

    .line 131
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v1

    .line 140
    :cond_3
    :goto_1
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 0
    invoke-static {v0, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 129
    :goto_2
    sget-boolean p1, Ll/᩶ۘܽ;->ᩳ:Z

    if-eqz p1, :cond_4

    .line 20
    sget-object p1, Ll/᩶ۘܽ;->ܿ:Ll/ܿ۠᩵;

    invoke-interface {p1}, Ll/ܿ۠᩵;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩹ۘܽ;

    .line 129
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Ll/᩹ۘܽ;->֫(J)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " ["

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "] "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    sget-object p1, Ll/᩶ۘܽ;->ۧ:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/LinkedBlockingQueue;->offer(Ljava/lang/Object;)Z

    :cond_4
    return-void
.end method

.method public static final ܽ(Ljava/lang/String;)V
    .locals 1

    const-string v0, "content"

    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 126
    invoke-static {p0, v0}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
