.class public final Ll/۬ۚۢ;
.super Ljava/lang/Object;
.source "B99D"

# interfaces
.implements Ll/ۤۚۢ;


# static fields
.field public static ᩷:Ljava/lang/String;


# instance fields
.field public ֫:Z

.field public ۜ:I

.field public ۧ:Ljava/io/BufferedReader;

.field public ܳ:Ljava/io/BufferedWriter;

.field public ܽ:Ljava/lang/String;

.field public ܿ:Ljava/io/BufferedReader;

.field public ᩳ:Z

.field public ᩻:Ljava/lang/Process;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-string v0, "echo \'"

    const-string v1, "\'"

    const-string v2, "MT - End of command"

    .line 0
    invoke-static {v0, v2, v1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 28
    sput-object v0, Ll/۬ۚۢ;->᩷:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 2

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Ll/۬ۚۢ;->ܽ:Ljava/lang/String;

    .line 43
    iput-boolean p2, p0, Ll/۬ۚۢ;->ᩳ:Z

    .line 44
    sget-object p1, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance p2, Ll/᩶ۚۢ;

    invoke-direct {p2, p0}, Ll/᩶ۚۢ;-><init>(Ll/۬ۚۢ;)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    .line 49
    :try_start_0
    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v0, 0x1388

    invoke-interface {p1, v0, v1, p2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 56
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    .line 51
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 52
    new-instance p2, Ljava/io/IOException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    .line 54
    :cond_0
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public static synthetic ֫(Ll/۬ۚۢ;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Ll/۬ۚۢ;->ܿ()V

    return-void
.end method

.method private ۧ(Ljava/lang/String;)V
    .locals 1

    .line 154
    :goto_0
    :try_start_0
    iget-object v0, p0, Ll/۬ۚۢ;->ܿ:Ljava/io/BufferedReader;

    invoke-virtual {v0}, Ljava/io/BufferedReader;->ready()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 156
    iget-object v0, p0, Ll/۬ۚۢ;->ܿ:Ljava/io/BufferedReader;

    invoke-virtual {v0}, Ljava/io/BufferedReader;->read()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 161
    :catchall_0
    :cond_0
    :goto_1
    :try_start_1
    iget-object v0, p0, Ll/۬ۚۢ;->ۧ:Ljava/io/BufferedReader;

    invoke-virtual {v0}, Ljava/io/BufferedReader;->ready()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 163
    iget-object v0, p0, Ll/۬ۚۢ;->ۧ:Ljava/io/BufferedReader;

    invoke-virtual {v0}, Ljava/io/BufferedReader;->read()I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    .line 167
    :catchall_1
    :cond_1
    iget-object v0, p0, Ll/۬ۚۢ;->ܳ:Ljava/io/BufferedWriter;

    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 168
    iget-object p1, p0, Ll/۬ۚۢ;->ܳ:Ljava/io/BufferedWriter;

    invoke-virtual {p1}, Ljava/io/BufferedWriter;->newLine()V

    .line 169
    iget-object p1, p0, Ll/۬ۚۢ;->ܳ:Ljava/io/BufferedWriter;

    sget-object v0, Ll/۬ۚۢ;->᩷:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 170
    iget-object p1, p0, Ll/۬ۚۢ;->ܳ:Ljava/io/BufferedWriter;

    invoke-virtual {p1}, Ljava/io/BufferedWriter;->newLine()V

    .line 171
    iget-object p1, p0, Ll/۬ۚۢ;->ܳ:Ljava/io/BufferedWriter;

    invoke-virtual {p1}, Ljava/io/BufferedWriter;->flush()V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/۬ۚۢ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/۬ۚۢ;->֫:Z

    return p0
.end method

.method public static bridge synthetic ܳ(Ll/۬ۚۢ;)Ljava/lang/Process;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬ۚۢ;->᩻:Ljava/lang/Process;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/۬ۚۢ;)Ljava/io/BufferedReader;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬ۚۢ;->ۧ:Ljava/io/BufferedReader;

    return-object p0
.end method

.method private ܽ(Ljava/lang/String;)V
    .locals 3

    .line 126
    iget-boolean v0, p0, Ll/۬ۚۢ;->֫:Z

    if-nez v0, :cond_2

    .line 196
    iget-object v0, p0, Ll/۬ۚۢ;->᩻:Ljava/lang/Process;

    if-eqz v0, :cond_0

    .line 198
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Process;->exitValue()I
    :try_end_0
    .catch Ljava/lang/IllegalThreadStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Ll/۬ۚۢ;->close()V

    .line 132
    invoke-direct {p0}, Ll/۬ۚۢ;->ܿ()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    .line 138
    :catch_0
    :try_start_2
    invoke-direct {p0, p1}, Ll/۬ۚۢ;->ۧ(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    .line 140
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v2, "EPIPE"

    .line 141
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 143
    invoke-virtual {p0}, Ll/۬ۚۢ;->close()V

    .line 144
    invoke-direct {p0}, Ll/۬ۚۢ;->ܿ()V

    .line 146
    invoke-direct {p0, p1}, Ll/۬ۚۢ;->ۧ(Ljava/lang/String;)V

    :goto_0
    return-void

    .line 148
    :cond_1
    throw v0

    :catch_2
    move-exception p1

    .line 134
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Shell died"

    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 127
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Closed"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static bridge synthetic ܿ(Ll/۬ۚۢ;)Ljava/io/BufferedWriter;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬ۚۢ;->ܳ:Ljava/io/BufferedWriter;

    return-object p0
.end method

.method private ܿ()V
    .locals 4

    .line 71
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    iget-object v1, p0, Ll/۬ۚۢ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v0

    iput-object v0, p0, Ll/۬ۚۢ;->᩻:Ljava/lang/Process;

    .line 72
    new-instance v0, Ljava/io/BufferedWriter;

    new-instance v1, Ljava/io/OutputStreamWriter;

    iget-object v2, p0, Ll/۬ۚۢ;->᩻:Ljava/lang/Process;

    invoke-virtual {v2}, Ljava/lang/Process;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2

    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v1, v2, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    iput-object v0, p0, Ll/۬ۚۢ;->ܳ:Ljava/io/BufferedWriter;

    .line 73
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    iget-object v2, p0, Ll/۬ۚۢ;->᩻:Ljava/lang/Process;

    invoke-virtual {v2}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    invoke-direct {v1, v2, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    iput-object v0, p0, Ll/۬ۚۢ;->ܿ:Ljava/io/BufferedReader;

    .line 74
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    iget-object v2, p0, Ll/۬ۚۢ;->᩻:Ljava/lang/Process;

    invoke-virtual {v2}, Ljava/lang/Process;->getErrorStream()Ljava/io/InputStream;

    move-result-object v2

    invoke-direct {v1, v2, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    iput-object v0, p0, Ll/۬ۚۢ;->ۧ:Ljava/io/BufferedReader;

    .line 75
    iget-boolean v0, p0, Ll/۬ۚۢ;->ᩳ:Z

    if-eqz v0, :cond_0

    .line 76
    new-instance v0, Ll/ۗۚۢ;

    invoke-direct {v0, p0}, Ll/ۗۚۢ;-><init>(Ll/۬ۚۢ;)V

    invoke-virtual {v0}, Ll/ۗۚۢ;->֫()V

    :cond_0
    const/4 v0, 0x0

    .line 78
    iput-boolean v0, p0, Ll/۬ۚۢ;->֫:Z

    const-string v1, "id -u"

    const-wide/16 v2, 0x1f40

    .line 15
    invoke-virtual {p0, v2, v3, v1}, Ll/۬ۚۢ;->֫(JLjava/lang/String;)Ll/۫ۚۢ;

    move-result-object v1

    iget-object v2, v1, Ll/۫ۚۢ;->ۧ:[Ljava/lang/String;

    .line 78
    :try_start_0
    aget-object v3, v2, v0

    .line 81
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    iput v3, p0, Ll/۬ۚۢ;->ۜ:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    :try_start_1
    const-string v3, "uid=(\\d+)"

    .line 86
    invoke-static {v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v3

    .line 78
    aget-object v0, v2, v0

    .line 86
    invoke-virtual {v3, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 87
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    .line 88
    invoke-virtual {v0, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Ll/۬ۚۢ;->ۜ:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    .line 93
    :catch_1
    :cond_1
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Get shell\'s uid failed: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static bridge synthetic ᩳ(Ll/۬ۚۢ;)Ljava/io/BufferedReader;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬ۚۢ;->ܿ:Ljava/io/BufferedReader;

    return-object p0
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, 0x1

    .line 181
    :try_start_0
    iput-boolean v1, p0, Ll/۬ۚۢ;->֫:Z

    .line 182
    iget-object v1, p0, Ll/۬ۚۢ;->᩻:Ljava/lang/Process;

    if-eqz v1, :cond_0

    .line 183
    iget-object v1, p0, Ll/۬ۚۢ;->ܿ:Ljava/io/BufferedReader;

    .line 480
    invoke-static {v1}, Ll/᩹ۢ֡;->֫(Ljava/io/Closeable;)V

    .line 184
    iget-object v1, p0, Ll/۬ۚۢ;->ۧ:Ljava/io/BufferedReader;

    .line 480
    invoke-static {v1}, Ll/᩹ۢ֡;->֫(Ljava/io/Closeable;)V

    .line 185
    iget-object v1, p0, Ll/۬ۚۢ;->ܳ:Ljava/io/BufferedWriter;

    .line 480
    invoke-static {v1}, Ll/᩹ۢ֡;->֫(Ljava/io/Closeable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 187
    :try_start_1
    iget-object v1, p0, Ll/۬ۚۢ;->᩻:Ljava/lang/Process;

    invoke-virtual {v1}, Ljava/lang/Process;->destroy()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_0
    const/4 v1, 0x0

    .line 190
    :try_start_2
    iput-object v1, p0, Ll/۬ۚۢ;->᩻:Ljava/lang/Process;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 193
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1
.end method

.method public final getUid()I
    .locals 1

    .line 176
    iget v0, p0, Ll/۬ۚۢ;->ۜ:I

    return v0
.end method

.method public final ֫(JLjava/lang/String;)Ll/۫ۚۢ;
    .locals 1

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 118
    :try_start_0
    invoke-direct {p0, p3}, Ll/۬ۚۢ;->ܽ(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    :try_start_1
    new-instance p3, Ll/ۙۚۢ;

    invoke-direct {p3, p0}, Ll/ۙۚۢ;-><init>(Ll/۬ۚۢ;)V

    invoke-virtual {p3, p1, p2}, Ll/ۙۚۢ;->֫(J)Ll/۫ۚۢ;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 120
    :try_start_2
    new-instance p2, Ll/۫ۚۢ;

    invoke-direct {p2, p1}, Ll/۫ۚۢ;-><init>(Ljava/io/IOException;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-object p2

    :goto_0
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public final ֫(Ljava/lang/String;)Ll/۫ۚۢ;
    .locals 2

    const-wide/16 v0, 0x1f40

    .line 15
    invoke-virtual {p0, v0, v1, p1}, Ll/۬ۚۢ;->֫(JLjava/lang/String;)Ll/۫ۚۢ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;Z)Ll/۫ۚۢ;
    .locals 2

    if-eqz p2, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x1f40

    .line 15
    :goto_0
    invoke-virtual {p0, v0, v1, p1}, Ll/۬ۚۢ;->֫(JLjava/lang/String;)Ll/۫ۚۢ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Z
    .locals 1

    .line 209
    iget-boolean v0, p0, Ll/۬ۚۢ;->֫:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final ۧ()Z
    .locals 2

    .line 35
    invoke-virtual {p0}, Ll/۬ۚۢ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {p0}, Ll/۬ۚۢ;->getUid()I

    move-result v0

    if-eqz v0, :cond_2

    const/16 v1, 0x7d0

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0

    :cond_2
    :goto_1
    const/4 v0, 0x1

    return v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 27
    invoke-virtual {p0}, Ll/۬ۚۢ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/۬ۚۢ;->getUid()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()Z
    .locals 2

    .line 31
    invoke-virtual {p0}, Ll/۬ۚۢ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/۬ۚۢ;->getUid()I

    move-result v0

    const/16 v1, 0x7d0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
