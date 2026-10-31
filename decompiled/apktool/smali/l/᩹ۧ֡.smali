.class public final Ll/᩹ۧ֡;
.super Ljava/lang/Object;
.source "I4F9"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final ܺ֫:Ljava/util/concurrent/ThreadPoolExecutor;


# instance fields
.field public ֫֫:Ll/֫ܽ֡;

.field public ۗ:J

.field public final ۙ:Ljava/util/LinkedHashSet;

.field public ۛ:J

.field public final ۜ֫:Ljava/util/LinkedHashMap;

.field public ۟:I

.field public final ۡ֫:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field public final ۢ֫:Ll/ۛۧ֡;

.field public final ۤ:Ljava/lang/String;

.field public final ۧ֫:Ll/֫ܽ֡;

.field public ۨ:J

.field public ۫:J

.field public ۬:J

.field public final ܰ:Ll/֡ۧ֡;

.field public ܳ֫:Z

.field public final ܽ֫:Ljava/util/concurrent/ThreadPoolExecutor;

.field public final ܿ֫:Ll/᩸ۧ֡;

.field public final ᩳ֫:Ll/۟ۧ֡;

.field public final ᩶:Z

.field public ᩷֫:J

.field public ᩸:J

.field public ᩹:J

.field public ᩺:I

.field public final ᩻֫:Ljava/net/Socket;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    .line 86
    new-instance v8, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/SynchronousQueue;

    invoke-direct {v6}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    const-string v0, "OkHttp Http2Connection"

    const/4 v1, 0x1

    .line 88
    invoke-static {v0, v1}, Ll/᩶۟᩵;->֫(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;

    move-result-object v7

    const/4 v1, 0x0

    const v2, 0x7fffffff

    const-wide/16 v3, 0x3c

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    sput-object v8, Ll/᩹ۧ֡;->ܺ֫:Ljava/util/concurrent/ThreadPoolExecutor;

    return-void
.end method

.method public constructor <init>(Ll/ۘۧ֡;)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 150
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 98
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v2, v0, Ll/᩹ۧ֡;->ۜ֫:Ljava/util/LinkedHashMap;

    const-wide/16 v2, 0x0

    .line 114
    iput-wide v2, v0, Ll/᩹ۧ֡;->ۛ:J

    .line 115
    iput-wide v2, v0, Ll/᩹ۧ֡;->ۨ:J

    .line 116
    iput-wide v2, v0, Ll/᩹ۧ֡;->ۗ:J

    .line 117
    iput-wide v2, v0, Ll/᩹ۧ֡;->۫:J

    .line 119
    iput-wide v2, v0, Ll/᩹ۧ֡;->᩸:J

    .line 122
    iput-wide v2, v0, Ll/᩹ۧ֡;->۬:J

    .line 129
    iput-wide v2, v0, Ll/᩹ۧ֡;->᩷֫:J

    .line 138
    new-instance v2, Ll/֫ܽ֡;

    invoke-direct {v2}, Ll/֫ܽ֡;-><init>()V

    iput-object v2, v0, Ll/᩹ۧ֡;->֫֫:Ll/֫ܽ֡;

    .line 142
    new-instance v3, Ll/֫ܽ֡;

    invoke-direct {v3}, Ll/֫ܽ֡;-><init>()V

    iput-object v3, v0, Ll/᩹ۧ֡;->ۧ֫:Ll/֫ܽ֡;

    .line 904
    new-instance v4, Ljava/util/LinkedHashSet;

    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v4, v0, Ll/᩹ۧ֡;->ۙ:Ljava/util/LinkedHashSet;

    .line 151
    sget-object v4, Ll/۟ۧ֡;->֫:Ll/۟ۧ֡;

    iput-object v4, v0, Ll/᩹ۧ֡;->ᩳ֫:Ll/۟ۧ֡;

    const/4 v4, 0x1

    .line 152
    iput-boolean v4, v0, Ll/᩹ۧ֡;->᩶:Z

    .line 153
    iget-object v5, v1, Ll/ۘۧ֡;->ۧ:Ll/֡ۧ֡;

    iput-object v5, v0, Ll/᩹ۧ֡;->ܰ:Ll/֡ۧ֡;

    const/4 v5, 0x3

    .line 157
    iput v5, v0, Ll/᩹ۧ֡;->۟:I

    const/high16 v5, 0x1000000

    const/4 v6, 0x7

    .line 165
    invoke-virtual {v2, v6, v5}, Ll/֫ܽ֡;->֫(II)V

    .line 168
    iget-object v2, v1, Ll/ۘۧ֡;->֫:Ljava/lang/String;

    iput-object v2, v0, Ll/᩹ۧ֡;->ۤ:Ljava/lang/String;

    .line 170
    new-instance v7, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 472
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v14, "OkHttp "

    invoke-direct {v5, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, " Writer"

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x0

    .line 171
    invoke-static {v5, v8}, Ll/᩶۟᩵;->֫(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;

    move-result-object v5

    invoke-direct {v7, v4, v5}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    iput-object v7, v0, Ll/᩹ۧ֡;->ۡ֫:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 172
    iget v5, v1, Ll/ۘۧ֡;->ܽ:I

    if-eqz v5, :cond_0

    .line 173
    new-instance v8, Ll/ᩴۧ֡;

    invoke-direct {v8, v0}, Ll/ᩴۧ֡;-><init>(Ll/᩹ۧ֡;)V

    iget v5, v1, Ll/ۘۧ֡;->ܽ:I

    int-to-long v11, v5

    sget-object v13, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    move-wide v9, v11

    invoke-virtual/range {v7 .. v13}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 178
    :cond_0
    new-instance v5, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v20, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v21, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct/range {v21 .. v21}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 472
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " Push Observer"

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 180
    invoke-static {v2, v4}, Ll/᩶۟᩵;->֫(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;

    move-result-object v22

    const/16 v16, 0x0

    const/16 v17, 0x1

    const-wide/16 v18, 0x3c

    move-object v15, v5

    invoke-direct/range {v15 .. v22}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v5, v0, Ll/᩹ۧ֡;->ܽ֫:Ljava/util/concurrent/ThreadPoolExecutor;

    const v2, 0xffff

    .line 181
    invoke-virtual {v3, v6, v2}, Ll/֫ܽ֡;->֫(II)V

    const/4 v2, 0x5

    const/16 v4, 0x4000

    .line 182
    invoke-virtual {v3, v2, v4}, Ll/֫ܽ֡;->֫(II)V

    .line 183
    invoke-virtual {v3}, Ll/֫ܽ֡;->ۧ()I

    move-result v2

    int-to-long v2, v2

    iput-wide v2, v0, Ll/᩹ۧ֡;->᩹:J

    .line 184
    iget-object v2, v1, Ll/ۘۧ֡;->ܿ:Ljava/net/Socket;

    iput-object v2, v0, Ll/᩹ۧ֡;->᩻֫:Ljava/net/Socket;

    .line 185
    new-instance v2, Ll/ۛۧ֡;

    iget-object v3, v1, Ll/ۘۧ֡;->ᩳ:Ll/ۤܽ֡;

    invoke-direct {v2, v3}, Ll/ۛۧ֡;-><init>(Ll/ۤܽ֡;)V

    iput-object v2, v0, Ll/᩹ۧ֡;->ۢ֫:Ll/ۛۧ֡;

    .line 187
    new-instance v2, Ll/᩸ۧ֡;

    new-instance v3, Ll/ۙۧ֡;

    iget-object v1, v1, Ll/ۘۧ֡;->ܳ:Ll/ۛܽ֡;

    invoke-direct {v3, v1}, Ll/ۙۧ֡;-><init>(Ll/ۛܽ֡;)V

    invoke-direct {v2, v0, v3}, Ll/᩸ۧ֡;-><init>(Ll/᩹ۧ֡;Ll/ۙۧ֡;)V

    iput-object v2, v0, Ll/᩹ۧ֡;->ܿ֫:Ll/᩸ۧ֡;

    return-void
.end method

.method private declared-synchronized ֫(Ll/ܶ۟᩵;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 994
    :try_start_0
    iget-boolean v1, p0, Ll/᩹ۧ֡;->ܳ֫:Z

    if-nez v1, :cond_0

    .line 995
    iget-object v1, p0, Ll/᩹ۧ֡;->ܽ֫:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 997
    :cond_0
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

.method public static ֫(Ll/᩹ۧ֡;)V
    .locals 1

    .line 526
    :try_start_0
    sget-object v0, Ll/ܰ֫֡;->ܰ:Ll/ܰ֫֡;

    invoke-virtual {p0, v0, v0}, Ll/᩹ۧ֡;->֫(Ll/ܰ֫֡;Ll/ܰ֫֡;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static synthetic ۜ(Ll/᩹ۧ֡;)Ljava/util/concurrent/ScheduledThreadPoolExecutor;
    .locals 0

    .line 61
    iget-object p0, p0, Ll/᩹ۧ֡;->ۡ֫:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    return-object p0
.end method

.method public static synthetic ۢ(Ll/᩹ۧ֡;)V
    .locals 4

    .line 61
    iget-wide v0, p0, Ll/᩹ۧ֡;->᩸:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/᩹ۧ֡;->᩸:J

    return-void
.end method

.method public static synthetic ۧ(Ll/᩹ۧ֡;)J
    .locals 2

    .line 61
    iget-wide v0, p0, Ll/᩹ۧ֡;->ۨ:J

    return-wide v0
.end method

.method public static synthetic ܳ()Ljava/util/concurrent/ThreadPoolExecutor;
    .locals 1

    .line 61
    sget-object v0, Ll/᩹ۧ֡;->ܺ֫:Ljava/util/concurrent/ThreadPoolExecutor;

    return-object v0
.end method

.method public static synthetic ܳ(Ll/᩹ۧ֡;)Z
    .locals 0

    .line 61
    iget-boolean p0, p0, Ll/᩹ۧ֡;->ܳ֫:Z

    return p0
.end method

.method public static synthetic ܽ(Ll/᩹ۧ֡;)V
    .locals 4

    .line 61
    iget-wide v0, p0, Ll/᩹ۧ֡;->ۨ:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/᩹ۧ֡;->ۨ:J

    return-void
.end method

.method public static synthetic ܿ(Ll/᩹ۧ֡;)V
    .locals 4

    .line 61
    iget-wide v0, p0, Ll/᩹ۧ֡;->ۛ:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/᩹ۧ֡;->ۛ:J

    return-void
.end method

.method public static synthetic ᩳ(Ll/᩹ۧ֡;)J
    .locals 2

    .line 61
    iget-wide v0, p0, Ll/᩹ۧ֡;->ۛ:J

    return-wide v0
.end method

.method public static synthetic ᩷(Ll/᩹ۧ֡;)V
    .locals 4

    .line 61
    iget-wide v0, p0, Ll/᩹ۧ֡;->۫:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/᩹ۧ֡;->۫:J

    return-void
.end method

.method public static synthetic ᩻(Ll/᩹ۧ֡;)V
    .locals 1

    const/4 v0, 0x1

    .line 61
    iput-boolean v0, p0, Ll/᩹ۧ֡;->ܳ֫:Z

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 473
    sget-object v0, Ll/ܰ֫֡;->᩺:Ll/ܰ֫֡;

    sget-object v1, Ll/ܰ֫֡;->᩶:Ll/ܰ֫֡;

    invoke-virtual {p0, v0, v1}, Ll/᩹ۧ֡;->֫(Ll/ܰ֫֡;Ll/ܰ֫֡;)V

    return-void
.end method

.method public final declared-synchronized ֫()I
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 213
    :try_start_0
    iget-object v1, p0, Ll/᩹ۧ֡;->ۧ֫:Ll/֫ܽ֡;

    invoke-virtual {v1}, Ll/֫ܽ֡;->ܽ()I

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

.method public final declared-synchronized ֫(I)Ll/ۤۧ֡;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 203
    :try_start_0
    iget-object v1, p0, Ll/᩹ۧ֡;->ۜ֫:Ljava/util/LinkedHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۤۧ֡;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(Ljava/util/ArrayList;Z)Ll/ۤۧ֡;
    .locals 11

    xor-int/lit8 v8, p2, 0x1

    .line 254
    iget-object v0, p0, Ll/᩹ۧ֡;->ۢ֫:Ll/ۛۧ֡;

    monitor-enter v0

    move-object v1, p0

    .line 255
    :try_start_0
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 256
    :try_start_1
    iget v2, p0, Ll/᩹ۧ֡;->۟:I

    const v3, 0x3fffffff    # 1.9999999f

    if-le v2, v3, :cond_0

    .line 257
    sget-object v2, Ll/ܰ֫֡;->۟:Ll/ܰ֫֡;

    invoke-virtual {p0, v2}, Ll/᩹ۧ֡;->֫(Ll/ܰ֫֡;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    .line 259
    :cond_0
    :goto_0
    iget-boolean v2, p0, Ll/᩹ۧ֡;->ܳ֫:Z

    if-nez v2, :cond_5

    .line 262
    iget v9, p0, Ll/᩹ۧ֡;->۟:I

    add-int/lit8 v2, v9, 0x2

    .line 263
    iput v2, p0, Ll/᩹ۧ֡;->۟:I

    .line 264
    new-instance v10, Ll/ۤۧ֡;

    const/4 v7, 0x0

    const/4 v6, 0x0

    move-object v2, v10

    move v3, v9

    move-object v4, p0

    move v5, v8

    invoke-direct/range {v2 .. v7}, Ll/ۤۧ֡;-><init>(ILl/᩹ۧ֡;ZZLl/ۤܰ᩵;)V

    if-eqz p2, :cond_2

    .line 265
    iget-wide v2, p0, Ll/᩹ۧ֡;->᩹:J

    const-wide/16 v4, 0x0

    cmp-long p2, v2, v4

    if-eqz p2, :cond_2

    iget-wide v2, v10, Ll/ۤۧ֡;->֫:J

    cmp-long p2, v2, v4

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 p2, 0x1

    .line 266
    :goto_2
    invoke-virtual {v10}, Ll/ۤۧ֡;->ܳ()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 267
    iget-object v2, p0, Ll/᩹ۧ֡;->ۜ֫:Ljava/util/LinkedHashMap;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    :cond_3
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 271
    :try_start_2
    iget-object v1, p0, Ll/᩹ۧ֡;->ۢ֫:Ll/ۛۧ֡;

    invoke-virtual {v1, p1, v9, v8}, Ll/ۛۧ֡;->ۧ(Ljava/util/ArrayList;IZ)V

    .line 277
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz p2, :cond_4

    .line 280
    iget-object p1, p0, Ll/᩹ۧ֡;->ۢ֫:Ll/ۛۧ֡;

    invoke-virtual {p1}, Ll/ۛۧ֡;->flush()V

    :cond_4
    return-object v10

    .line 260
    :cond_5
    :try_start_3
    new-instance p1, Ll/᩺֫֡;

    .line 24
    invoke-direct {p1}, Ljava/io/IOException;-><init>()V

    .line 260
    throw p1

    .line 269
    :goto_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p1

    :catchall_1
    move-exception p1

    .line 277
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1
.end method

.method public final ֫(IIZ)V
    .locals 1

    .line 416
    :try_start_0
    iget-object v0, p0, Ll/᩹ۧ֡;->ۢ֫:Ll/ۛۧ֡;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۛۧ֡;->֫(IIZ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 526
    :catch_0
    :try_start_1
    sget-object p1, Ll/ܰ֫֡;->ܰ:Ll/ܰ֫֡;

    invoke-virtual {p0, p1, p1}, Ll/᩹ۧ֡;->֫(Ll/ܰ֫֡;Ll/ܰ֫֡;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-void
.end method

.method public final ֫(IJ)V
    .locals 8

    .line 359
    :try_start_0
    iget-object v0, p0, Ll/᩹ۧ֡;->ۡ֫:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-instance v7, Ll/ۜۧ֡;

    iget-object v1, p0, Ll/᩹ۧ֡;->ۤ:Ljava/lang/String;

    .line 360
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v1, 0x1

    aput-object v2, v3, v1

    move-object v1, v7

    move-object v2, p0

    move v4, p1

    move-wide v5, p2

    invoke-direct/range {v1 .. v6}, Ll/ۜۧ֡;-><init>(Ll/᩹ۧ֡;[Ljava/lang/Object;IJ)V

    .line 359
    invoke-virtual {v0, v7}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public final ֫(ILl/ۛܽ֡;IZ)V
    .locals 7

    .line 962
    new-instance v4, Ll/۫ܽ֡;

    invoke-direct {v4}, Ll/۫ܽ֡;-><init>()V

    int-to-long v0, p3

    .line 963
    invoke-interface {p2, v0, v1}, Ll/ۛܽ֡;->ܿ(J)V

    .line 964
    invoke-interface {p2, v4, v0, v1}, Ll/֨ᩳ֡;->ۧ(Ll/۫ܽ֡;J)J

    .line 965
    invoke-virtual {v4}, Ll/۫ܽ֡;->size()J

    move-result-wide v2

    cmp-long p2, v2, v0

    if-nez p2, :cond_0

    .line 966
    new-instance p2, Ll/ܺۧ֡;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x2

    new-array v2, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v3, p0, Ll/᩹ۧ֡;->ۤ:Ljava/lang/String;

    aput-object v3, v2, v1

    const/4 v1, 0x1

    aput-object v0, v2, v1

    move-object v0, p2

    move-object v1, p0

    move v3, p1

    move v5, p3

    move v6, p4

    invoke-direct/range {v0 .. v6}, Ll/ܺۧ֡;-><init>(Ll/᩹ۧ֡;[Ljava/lang/Object;ILl/۫ܽ֡;IZ)V

    invoke-direct {p0, p2}, Ll/᩹ۧ֡;->֫(Ll/ܶ۟᩵;)V

    return-void

    .line 965
    :cond_0
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Ll/۫ܽ֡;->size()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p4, " != "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(ILl/ܰ֫֡;)V
    .locals 5

    .line 983
    new-instance v0, Ll/ۖۧ֡;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Ll/᩹ۧ֡;->ۤ:Ljava/lang/String;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    invoke-direct {v0, p0, v2, p1, p2}, Ll/ۖۧ֡;-><init>(Ll/᩹ۧ֡;[Ljava/lang/Object;ILl/ܰ֫֡;)V

    invoke-direct {p0, v0}, Ll/᩹ۧ֡;->֫(Ll/ܶ۟᩵;)V

    return-void
.end method

.method public final ֫(IZLl/۫ܽ֡;J)V
    .locals 8

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    cmp-long v3, p4, v1

    if-nez v3, :cond_0

    .line 306
    iget-object p4, p0, Ll/᩹ۧ֡;->ۢ֫:Ll/ۛۧ֡;

    invoke-virtual {p4, p2, p1, p3, v0}, Ll/ۛۧ֡;->֫(ZILl/۫ܽ֡;I)V

    return-void

    :cond_0
    :goto_0
    cmp-long v0, p4, v1

    if-lez v0, :cond_4

    move-object v0, p0

    .line 312
    monitor-enter v0

    .line 314
    :goto_1
    :try_start_0
    iget-wide v3, p0, Ll/᩹ۧ֡;->᩹:J

    cmp-long v5, v3, v1

    if-gtz v5, :cond_2

    .line 317
    iget-object v3, p0, Ll/᩹ۧ֡;->ۜ֫:Ljava/util/LinkedHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 320
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V

    goto :goto_1

    .line 318
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "stream closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 327
    :cond_2
    :try_start_1
    invoke-static {p4, p5, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    long-to-int v4, v3

    .line 328
    iget-object v3, p0, Ll/᩹ۧ֡;->ۢ֫:Ll/ۛۧ֡;

    invoke-virtual {v3}, Ll/ۛۧ֡;->ܽ()I

    move-result v3

    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 329
    iget-wide v4, p0, Ll/᩹ۧ֡;->᩹:J

    int-to-long v6, v3

    sub-long/2addr v4, v6

    iput-wide v4, p0, Ll/᩹ۧ֡;->᩹:J

    .line 330
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sub-long/2addr p4, v6

    .line 333
    iget-object v0, p0, Ll/᩹ۧ֡;->ۢ֫:Ll/ۛۧ֡;

    if-eqz p2, :cond_3

    cmp-long v4, p4, v1

    if-nez v4, :cond_3

    const/4 v4, 0x1

    goto :goto_2

    :cond_3
    const/4 v4, 0x0

    :goto_2
    invoke-virtual {v0, v4, p1, p3, v3}, Ll/ۛۧ֡;->֫(ZILl/۫ܽ֡;I)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    .line 323
    :catch_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 324
    new-instance p1, Ljava/io/InterruptedIOException;

    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    throw p1

    .line 330
    :goto_3
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :cond_4
    return-void
.end method

.method public final ֫(Ljava/util/ArrayList;I)V
    .locals 5

    move-object v0, p0

    .line 907
    monitor-enter v0

    .line 908
    :try_start_0
    iget-object v1, p0, Ll/᩹ۧ֡;->ۙ:Ljava/util/LinkedHashSet;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 909
    sget-object p1, Ll/ܰ֫֡;->ܰ:Ll/ܰ֫֡;

    invoke-virtual {p0, p2, p1}, Ll/᩹ۧ֡;->ۧ(ILl/ܰ֫֡;)V

    .line 910
    monitor-exit v0

    return-void

    .line 912
    :cond_0
    iget-object v1, p0, Ll/᩹ۧ֡;->ۙ:Ljava/util/LinkedHashSet;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 913
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 915
    :try_start_1
    new-instance v0, Ll/ۢۧ֡;

    iget-object v1, p0, Ll/᩹ۧ֡;->ۤ:Ljava/lang/String;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v1, 0x1

    aput-object v2, v3, v1

    invoke-direct {v0, p0, v3, p2, p1}, Ll/ۢۧ֡;-><init>(Ll/᩹ۧ֡;[Ljava/lang/Object;ILjava/util/ArrayList;)V

    invoke-direct {p0, v0}, Ll/᩹ۧ֡;->֫(Ll/ܶ۟᩵;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void

    :catchall_0
    move-exception p1

    .line 913
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final ֫(Ljava/util/ArrayList;IZ)V
    .locals 7

    .line 937
    :try_start_0
    new-instance v6, Ll/ۡۧ֡;

    iget-object v0, p0, Ll/᩹ۧ֡;->ۤ:Ljava/lang/String;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    move-object v0, v6

    move-object v1, p0

    move v3, p2

    move-object v4, p1

    move v5, p3

    invoke-direct/range {v0 .. v5}, Ll/ۡۧ֡;-><init>(Ll/᩹ۧ֡;[Ljava/lang/Object;ILjava/util/ArrayList;Z)V

    invoke-direct {p0, v6}, Ll/᩹ۧ֡;->֫(Ll/ܶ۟᩵;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public final ֫(Ll/ܰ֫֡;)V
    .locals 4

    .line 453
    iget-object v0, p0, Ll/᩹ۧ֡;->ۢ֫:Ll/ۛۧ֡;

    monitor-enter v0

    move-object v1, p0

    .line 455
    :try_start_0
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 456
    :try_start_1
    iget-boolean v2, p0, Ll/᩹ۧ֡;->ܳ֫:Z

    if-eqz v2, :cond_0

    .line 457
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-void

    :cond_0
    const/4 v2, 0x1

    .line 459
    :try_start_3
    iput-boolean v2, p0, Ll/᩹ۧ֡;->ܳ֫:Z

    .line 460
    iget v2, p0, Ll/᩹ۧ֡;->᩺:I

    .line 461
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 464
    :try_start_4
    iget-object v1, p0, Ll/᩹ۧ֡;->ۢ֫:Ll/ۛۧ֡;

    sget-object v3, Ll/᩶۟᩵;->֫:[B

    invoke-virtual {v1, v2, p1, v3}, Ll/ۛۧ֡;->֫(ILl/ܰ֫֡;[B)V

    .line 465
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    return-void

    :catchall_0
    move-exception p1

    .line 461
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    throw p1

    :catchall_1
    move-exception p1

    .line 465
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw p1
.end method

.method public final ֫(Ll/ܰ֫֡;Ll/ܰ֫֡;)V
    .locals 4

    const/4 v1, 0x0

    .line 480
    :try_start_0
    invoke-virtual {p0, p1}, Ll/᩹ۧ֡;->֫(Ll/ܰ֫֡;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-object p1, v1

    goto :goto_0

    :catch_0
    move-exception p1

    :goto_0
    move-object v0, p0

    .line 486
    monitor-enter v0

    .line 487
    :try_start_1
    iget-object v2, p0, Ll/᩹ۧ֡;->ۜ֫:Ljava/util/LinkedHashMap;

    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 488
    iget-object v1, p0, Ll/᩹ۧ֡;->ۜ֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    iget-object v2, p0, Ll/᩹ۧ֡;->ۜ֫:Ljava/util/LinkedHashMap;

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v2

    new-array v2, v2, [Ll/ۤۧ֡;

    invoke-interface {v1, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ll/ۤۧ֡;

    .line 489
    iget-object v2, p0, Ll/᩹ۧ֡;->ۜ֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->clear()V

    .line 491
    :cond_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_2

    .line 494
    array-length v0, v1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v0, :cond_2

    aget-object v3, v1, v2

    .line 496
    :try_start_2
    invoke-virtual {v3, p2}, Ll/ۤۧ֡;->֫(Ll/ܰ֫֡;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    :catch_1
    move-exception v3

    if-eqz p1, :cond_1

    move-object p1, v3

    :cond_1
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 505
    :cond_2
    :try_start_3
    iget-object p2, p0, Ll/᩹ۧ֡;->ۢ֫:Ll/ۛۧ֡;

    invoke-virtual {p2}, Ll/ۛۧ֡;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_3

    :catch_2
    move-exception p2

    if-nez p1, :cond_3

    move-object p1, p2

    .line 512
    :cond_3
    :goto_3
    :try_start_4
    iget-object p2, p0, Ll/᩹ۧ֡;->᩻֫:Ljava/net/Socket;

    invoke-virtual {p2}, Ljava/net/Socket;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_4

    :catch_3
    move-exception p1

    .line 518
    :goto_4
    iget-object p2, p0, Ll/᩹ۧ֡;->ۡ֫:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    invoke-virtual {p2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->shutdown()V

    .line 519
    iget-object p2, p0, Ll/᩹ۧ֡;->ܽ֫:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {p2}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    if-nez p1, :cond_4

    return-void

    .line 521
    :cond_4
    throw p1

    :catchall_0
    move-exception p1

    .line 491
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۧ(I)Ll/ۤۧ֡;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 207
    :try_start_0
    iget-object v1, p0, Ll/᩹ۧ֡;->ۜ֫:Ljava/util/LinkedHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۤۧ֡;

    .line 208
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 209
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۧ(ILl/ܰ֫֡;)V
    .locals 6

    .line 339
    :try_start_0
    iget-object v0, p0, Ll/᩹ۧ֡;->ۡ֫:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-instance v1, Ll/᩻ۧ֡;

    iget-object v2, p0, Ll/᩹ۧ֡;->ۤ:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    const/4 v2, 0x1

    aput-object v3, v4, v2

    invoke-direct {v1, p0, v4, p1, p2}, Ll/᩻ۧ֡;-><init>(Ll/᩹ۧ֡;[Ljava/lang/Object;ILl/ܰ֫֡;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public final declared-synchronized ۧ(J)Z
    .locals 7

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 569
    :try_start_0
    iget-boolean v1, p0, Ll/᩹ۧ֡;->ܳ֫:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    monitor-exit v0

    return v2

    .line 572
    :cond_0
    :try_start_1
    iget-wide v3, p0, Ll/᩹ۧ֡;->۫:J

    iget-wide v5, p0, Ll/᩹ۧ֡;->ۗ:J

    cmp-long v1, v3, v5

    if-gez v1, :cond_1

    iget-wide v3, p0, Ll/᩹ۧ֡;->۬:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmp-long v1, p1, v3

    if-ltz v1, :cond_1

    monitor-exit v0

    return v2

    .line 574
    :cond_1
    monitor-exit v0

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final ܽ()V
    .locals 6

    move-object v0, p0

    .line 593
    monitor-enter v0

    .line 594
    :try_start_0
    iget-wide v1, p0, Ll/᩹ۧ֡;->۫:J

    iget-wide v3, p0, Ll/᩹ۧ֡;->ۗ:J

    cmp-long v5, v1, v3

    if-gez v5, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const-wide/16 v1, 0x1

    add-long/2addr v3, v1

    .line 595
    iput-wide v3, p0, Ll/᩹ۧ֡;->ۗ:J

    .line 596
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    const-wide/32 v3, 0x3b9aca00

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/᩹ۧ֡;->۬:J

    .line 597
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 599
    :try_start_1
    iget-object v0, p0, Ll/᩹ۧ֡;->ۡ֫:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-instance v1, Ll/᩷ۧ֡;

    iget-object v2, p0, Ll/᩹ۧ֡;->ۤ:Ljava/lang/String;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    invoke-direct {v1, p0, v3}, Ll/᩷ۧ֡;-><init>(Ll/᩹ۧ֡;[Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void

    :catchall_0
    move-exception v1

    .line 597
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final ᩳ()V
    .locals 4

    .line 545
    iget-object v0, p0, Ll/᩹ۧ֡;->ۢ֫:Ll/ۛۧ֡;

    invoke-virtual {v0}, Ll/ۛۧ֡;->֫()V

    .line 546
    iget-object v1, p0, Ll/᩹ۧ֡;->֫֫:Ll/֫ܽ֡;

    invoke-virtual {v0, v1}, Ll/ۛۧ֡;->ۧ(Ll/֫ܽ֡;)V

    .line 547
    invoke-virtual {v1}, Ll/֫ܽ֡;->ۧ()I

    move-result v1

    const v2, 0xffff

    if-eq v1, v2, :cond_0

    sub-int/2addr v1, v2

    int-to-long v1, v1

    const/4 v3, 0x0

    .line 549
    invoke-virtual {v0, v3, v1, v2}, Ll/ۛۧ֡;->֫(IJ)V

    .line 552
    :cond_0
    new-instance v0, Ljava/lang/Thread;

    iget-object v1, p0, Ll/᩹ۧ֡;->ܿ֫:Ll/᩸ۧ֡;

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public final declared-synchronized ᩳ(J)V
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 217
    :try_start_0
    iget-wide v1, p0, Ll/᩹ۧ֡;->᩷֫:J

    add-long/2addr v1, p1

    iput-wide v1, p0, Ll/᩹ۧ֡;->᩷֫:J

    .line 218
    iget-object p1, p0, Ll/᩹ۧ֡;->֫֫:Ll/֫ܽ֡;

    invoke-virtual {p1}, Ll/֫ܽ֡;->ۧ()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    int-to-long p1, p1

    cmp-long v3, v1, p1

    if-ltz v3, :cond_0

    .line 219
    iget-wide p1, p0, Ll/᩹ۧ֡;->᩷֫:J

    const/4 v1, 0x0

    invoke-virtual {p0, v1, p1, p2}, Ll/᩹ۧ֡;->֫(IJ)V

    const-wide/16 p1, 0x0

    .line 220
    iput-wide p1, p0, Ll/᩹ۧ֡;->᩷֫:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 222
    :cond_0
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
