.class public final Ll/ۚܺۜ;
.super Ljava/lang/Object;
.source "P6V4"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final ۟:J


# instance fields
.field public ۗ:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field public final ۙ:I

.field public final ۛ:Ljava/util/concurrent/Semaphore;

.field public ۤ:Z

.field public final ۨ:J

.field public final ۫:Ll/ۨۗᩳ;

.field public ۬:Z

.field public final ܰ:Ll/ᩳۖۜ;

.field public final ᩶:J

.field public final ᩸:Ljava/util/HashSet;

.field public final ᩹:Ljava/util/LinkedHashMap;

.field public final ᩺:J


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 27
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x2

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Ll/ۚܺۜ;->۟:J

    return-void
.end method

.method public constructor <init>(Ll/ᩳۖۜ;)V
    .locals 7

    .line 43
    new-instance v0, Ll/ۨۗᩳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v1

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v3, Ljava/util/concurrent/Semaphore;

    const/4 v4, 0x4

    const/4 v5, 0x1

    invoke-direct {v3, v4, v5}, Ljava/util/concurrent/Semaphore;-><init>(IZ)V

    iput-object v3, p0, Ll/ۚܺۜ;->ۛ:Ljava/util/concurrent/Semaphore;

    .line 35
    new-instance v3, Ljava/util/LinkedHashMap;

    const/16 v4, 0x10

    const/high16 v6, 0x3f400000    # 0.75f

    invoke-direct {v3, v4, v6, v5}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    iput-object v3, p0, Ll/ۚܺۜ;->᩹:Ljava/util/LinkedHashMap;

    .line 36
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    iput-object v3, p0, Ll/ۚܺۜ;->᩸:Ljava/util/HashSet;

    .line 48
    iput-object p1, p0, Ll/ۚܺۜ;->ܰ:Ll/ᩳۖۜ;

    .line 49
    iput-object v0, p0, Ll/ۚܺۜ;->۫:Ll/ۨۗᩳ;

    const-wide/32 v3, 0x800000

    .line 50
    iput-wide v3, p0, Ll/ۚܺۜ;->ۨ:J

    .line 51
    iput-wide v1, p0, Ll/ۚܺۜ;->᩺:J

    const/16 p1, 0x8

    .line 52
    iput p1, p0, Ll/ۚܺۜ;->ۙ:I

    const-wide/32 v0, 0x1000000

    .line 53
    iput-wide v0, p0, Ll/ۚܺۜ;->᩶:J

    return-void
.end method

.method private declared-synchronized ֫(Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 170
    :try_start_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "path"

    if-nez p1, :cond_0

    sget-object p1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    :goto_0
    invoke-virtual {v1, v2, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 171
    iget-boolean v1, p0, Ll/ۚܺۜ;->ۤ:Z

    if-eqz v1, :cond_1

    const-string v1, "FILE_SEARCH_CANCELED"

    const-string v2, "Text search service is closed. Restore the MCP service before retrying. After an application process restart, start a new search with cursor=\"\"."

    const-string v3, "warning"

    const/4 v4, 0x0

    .line 172
    invoke-static {v1, v2, v3, v4, p1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    .line 177
    :cond_1
    :try_start_1
    invoke-static {p1}, Ll/ۗۛ᩻;->֫(Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public static ֫(Ll/᩵ܺۜ;)Ll/ۨۘܽ;
    .locals 4

    .line 183
    invoke-static {p0}, Ll/᩵ܺۜ;->ᩳ(Ll/᩵ܺۜ;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/16 v0, 0x10

    .line 184
    :goto_0
    invoke-static {p0}, Ll/᩵ܺۜ;->֫(Ll/᩵ܺۜ;)Z

    move-result v1

    if-nez v1, :cond_1

    or-int/lit8 v0, v0, 0x42

    .line 186
    :cond_1
    :try_start_0
    invoke-static {p0}, Ll/᩵ܺۜ;->ܽ(Ll/᩵ܺۜ;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۨۘܽ;->֫(ILjava/lang/String;)Ll/ۨۘܽ;

    move-result-object p0
    :try_end_0
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    .line 188
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid regular expression: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/util/regex/PatternSyntaxException;->getDescription()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Ll/᩵ܺۜ;->ܽ(Ll/᩵ܺۜ;)Ljava/lang/String;

    move-result-object p0

    .line 189
    invoke-static {p0}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "pattern"

    .line 188
    invoke-static {v0, v3, p0, v1, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method private declared-synchronized ֫(Ljava/lang/String;Ll/֨ۘۜ;)Ll/᩸ۘۜ;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 227
    :try_start_0
    invoke-direct {p0}, Ll/ۚܺۜ;->֫()V

    .line 228
    iget-object v1, p0, Ll/ۚܺۜ;->᩹:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩴܺۜ;

    if-eqz p1, :cond_0

    .line 229
    invoke-static {p1}, Ll/ᩴܺۜ;->֫(Ll/ᩴܺۜ;)Ll/᩸ۘۜ;

    move-result-object v1

    invoke-virtual {p2, v1}, Ll/֨ۘۜ;->֫(Ljava/io/Closeable;)Ll/ۚۘۜ;

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    .line 230
    :cond_1
    invoke-static {p1}, Ll/ᩴܺۜ;->֫(Ll/ᩴܺۜ;)Ll/᩸ۘۜ;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
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

.method private ֫()V
    .locals 9

    .line 257
    iget-object v0, p0, Ll/ۚܺۜ;->۫:Ll/ۨۗᩳ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    .line 258
    iget-object v2, p0, Ll/ۚܺۜ;->᩹:Ljava/util/LinkedHashMap;

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 259
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 260
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩴܺۜ;

    .line 261
    invoke-static {v3}, Ll/ᩴܺۜ;->ۧ(Ll/ᩴܺۜ;)J

    move-result-wide v4

    sub-long v4, v0, v4

    sget-wide v6, Ll/ۚܺۜ;->۟:J

    cmp-long v8, v4, v6

    if-ltz v8, :cond_0

    .line 262
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 263
    invoke-static {v3}, Ll/ᩴܺۜ;->֫(Ll/ᩴܺۜ;)Ll/᩸ۘۜ;

    move-result-object v3

    .line 311
    :try_start_0
    invoke-virtual {v3}, Ll/᩸ۘۜ;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    goto :goto_0

    :cond_1
    return-void
.end method

.method private declared-synchronized ֫(Ljava/lang/String;Ll/᩸ۘۜ;Ll/֨ۘۜ;)V
    .locals 6

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 239
    :try_start_0
    iget-boolean v1, p0, Ll/ۚܺۜ;->ۤ:Z

    if-nez v1, :cond_4

    iget v1, p0, Ll/ۚܺۜ;->ۙ:I

    if-eqz v1, :cond_4

    invoke-virtual {p2}, Ll/᩸ۘۜ;->֫()J

    move-result-wide v1

    iget-wide v3, p0, Ll/ۚܺۜ;->᩶:J

    cmp-long v5, v1, v3

    if-lez v5, :cond_0

    goto :goto_3

    .line 240
    :cond_0
    invoke-direct {p0}, Ll/ۚܺۜ;->֫()V

    .line 241
    invoke-direct {p0, p1}, Ll/ۚܺۜ;->ᩳ(Ljava/lang/String;)V

    .line 242
    invoke-virtual {p3}, Ll/֨ۘۜ;->ᩳ()V

    .line 243
    iget-object p3, p0, Ll/ۚܺۜ;->᩹:Ljava/util/LinkedHashMap;

    new-instance v1, Ll/ᩴܺۜ;

    iget-object v2, p0, Ll/ۚܺۜ;->۫:Ll/ۨۗᩳ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    invoke-direct {v1, p2, v2, v3}, Ll/ᩴܺۜ;-><init>(Ll/᩸ۘۜ;J)V

    invoke-virtual {p3, p1, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    :goto_0
    iget-object p1, p0, Ll/ۚܺۜ;->᩹:Ljava/util/LinkedHashMap;

    invoke-virtual {p1}, Ljava/util/AbstractMap;->size()I

    move-result p1

    iget p2, p0, Ll/ۚܺۜ;->ۙ:I

    if-gt p1, p2, :cond_3

    .line 252
    iget-object p1, p0, Ll/ۚܺۜ;->᩹:Ljava/util/LinkedHashMap;

    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const-wide/16 p2, 0x0

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩴܺۜ;

    invoke-static {v1}, Ll/ᩴܺۜ;->֫(Ll/ᩴܺۜ;)Ll/᩸ۘۜ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩸ۘۜ;->֫()J

    move-result-wide v1

    add-long/2addr p2, v1

    goto :goto_1

    .line 244
    :cond_1
    iget-wide v1, p0, Ll/ۚܺۜ;->᩶:J

    cmp-long p1, p2, v1

    if-lez p1, :cond_2

    goto :goto_2

    .line 247
    :cond_2
    invoke-direct {p0}, Ll/ۚܺۜ;->ܽ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 248
    monitor-exit v0

    return-void

    .line 245
    :cond_3
    :goto_2
    :try_start_1
    iget-object p1, p0, Ll/ۚܺۜ;->᩹:Ljava/util/LinkedHashMap;

    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {p0, p1}, Ll/ۚܺۜ;->ᩳ(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 239
    :cond_4
    :goto_3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public static synthetic ֫(Ll/ۚܺۜ;)V
    .locals 2

    move-object v0, p0

    .line 285
    monitor-enter v0

    const/4 v1, 0x0

    .line 286
    :try_start_0
    iput-boolean v1, p0, Ll/ۚܺۜ;->۬:Z

    .line 287
    invoke-direct {p0}, Ll/ۚܺۜ;->֫()V

    .line 288
    invoke-direct {p0}, Ll/ۚܺۜ;->ܽ()V

    .line 289
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ۧ(Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 4

    .line 222
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "path"

    invoke-virtual {v0, v1, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v0, "FILE_CHANGED_DURING_READ"

    const-string v1, "The file changed. Restart text search with cursor=\"\"."

    const-string v2, "warning"

    const/4 v3, 0x0

    .line 220
    invoke-static {v0, v1, v2, v3, p0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method private ܽ()V
    .locals 9

    .line 270
    iget-boolean v0, p0, Ll/ۚܺۜ;->۬:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Ll/ۚܺۜ;->᩹:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    iget-boolean v1, p0, Ll/ۚܺۜ;->ۤ:Z

    if-eqz v1, :cond_0

    goto :goto_1

    .line 271
    :cond_0
    iget-object v1, p0, Ll/ۚܺۜ;->ۗ:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    const-wide/16 v2, 0x1

    const/4 v4, 0x1

    if-nez v1, :cond_1

    .line 272
    new-instance v1, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-instance v5, Ll/ۘܺۜ;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    invoke-direct {v1, v4, v5}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    iput-object v1, p0, Ll/ۚܺۜ;->ۗ:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 277
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v2, v3, v5}, Ljava/util/concurrent/ThreadPoolExecutor;->setKeepAliveTime(JLjava/util/concurrent/TimeUnit;)V

    .line 278
    iget-object v1, p0, Ll/ۚܺۜ;->ۗ:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    invoke-virtual {v1, v4}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 279
    iget-object v1, p0, Ll/ۚܺۜ;->ۗ:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    invoke-virtual {v1, v4}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->setRemoveOnCancelPolicy(Z)V

    .line 282
    :cond_1
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide v5, 0x7fffffffffffffffL

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩴܺۜ;

    invoke-static {v1}, Ll/ᩴܺۜ;->ۧ(Ll/ᩴܺۜ;)J

    move-result-wide v7

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    goto :goto_0

    .line 283
    :cond_2
    iput-boolean v4, p0, Ll/ۚܺۜ;->۬:Z

    .line 284
    iget-object v0, p0, Ll/ۚܺۜ;->ۗ:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-instance v1, Ll/᩻ۛ᩻;

    const/4 v4, 0x1

    invoke-direct {v1, v4, p0}, Ll/᩻ۛ᩻;-><init>(ILjava/lang/Object;)V

    iget-object v4, p0, Ll/ۚܺۜ;->۫:Ll/ۨۗᩳ;

    .line 290
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v7

    sub-long/2addr v7, v5

    sget-wide v4, Ll/ۚܺۜ;->۟:J

    sub-long/2addr v4, v7

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 284
    invoke-virtual {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    :cond_3
    :goto_1
    return-void
.end method

.method private declared-synchronized ᩳ(Ljava/lang/String;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 234
    :try_start_0
    iget-object v1, p0, Ll/ۚܺۜ;->᩹:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩴܺۜ;

    if-eqz p1, :cond_0

    .line 235
    invoke-static {p1}, Ll/ᩴܺۜ;->֫(Ll/ᩴܺۜ;)Ll/᩸ۘۜ;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 311
    :try_start_1
    invoke-virtual {p1}, Ll/᩸ۘۜ;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 236
    :catch_0
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method


# virtual methods
.method public final close()V
    .locals 5

    move-object v0, p0

    .line 297
    monitor-enter v0

    const/4 v1, 0x1

    .line 298
    :try_start_0
    iput-boolean v1, p0, Ll/ۚܺۜ;->ۤ:Z

    .line 299
    iget-object v1, p0, Ll/ۚܺۜ;->ۗ:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->shutdownNow()Ljava/util/List;

    .line 300
    :cond_0
    iget-object v1, p0, Ll/ۚܺۜ;->᩹:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Ll/ᩴܺۜ;

    invoke-interface {v1, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ll/ᩴܺۜ;

    .line 301
    iget-object v3, p0, Ll/ۚܺۜ;->᩹:Ljava/util/LinkedHashMap;

    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->clear()V

    .line 302
    new-instance v3, Ljava/util/HashSet;

    iget-object v4, p0, Ll/ۚܺۜ;->᩸:Ljava/util/HashSet;

    invoke-direct {v3, v4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 303
    iget-object v4, p0, Ll/ۚܺۜ;->᩸:Ljava/util/HashSet;

    invoke-virtual {v4}, Ljava/util/HashSet;->clear()V

    .line 304
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 306
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֨ۘۜ;

    invoke-virtual {v3}, Ll/֨ۘۜ;->֫()V

    goto :goto_0

    .line 307
    :cond_1
    array-length v0, v1

    :goto_1
    if-ge v2, v0, :cond_2

    aget-object v3, v1, v2

    invoke-static {v3}, Ll/ᩴܺۜ;->֫(Ll/ᩴܺۜ;)Ll/᩸ۘۜ;

    move-result-object v3

    .line 311
    :try_start_1
    invoke-virtual {v3}, Ll/᩸ۘۜ;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    return-void

    :catchall_0
    move-exception v1

    .line 304
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final ֫(Ljava/lang/String;Ll/᩵ܺۜ;Ljava/lang/String;)Ll/֡ܺۜ;
    .locals 22

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    move-object/from16 v9, p3

    .line 72
    new-instance v10, Ll/֨ۘۜ;

    invoke-direct {v10}, Ll/֨ۘۜ;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object/from16 v16, p0

    .line 76
    :try_start_0
    monitor-enter v16
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_10
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_f
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_e
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_d
    .catchall {:try_start_0 .. :try_end_0} :catchall_b

    .line 77
    :try_start_1
    iget-boolean v4, v1, Ll/ۚܺۜ;->ۤ:Z

    if-nez v4, :cond_18

    .line 78
    iget-object v4, v1, Ll/ۚܺۜ;->᩸:Ljava/util/HashSet;

    invoke-virtual {v4, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 79
    monitor-exit v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_a

    .line 81
    :try_start_2
    iget-object v4, v1, Ll/ۚܺۜ;->ۛ:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v4}, Ljava/util/concurrent/Semaphore;->acquire()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_c
    .catch Ll/ۗۛ᩻; {:try_start_2 .. :try_end_2} :catch_10
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_f
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_e
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_d
    .catchall {:try_start_2 .. :try_end_2} :catchall_b

    move-object/from16 v16, p0

    .line 87
    :try_start_3
    monitor-enter v16
    :try_end_3
    .catch Ll/ۗۛ᩻; {:try_start_3 .. :try_end_3} :catch_b
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_a
    .catch Ljava/lang/SecurityException; {:try_start_3 .. :try_end_3} :catch_9
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_8
    .catchall {:try_start_3 .. :try_end_3} :catchall_9

    .line 88
    :try_start_4
    iget-boolean v4, v1, Ll/ۚܺۜ;->ۤ:Z

    if-nez v4, :cond_17

    .line 89
    monitor-exit v16
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_8

    .line 90
    :try_start_5
    invoke-static {}, Ll/֡ۘۜ;->֫()V

    .line 91
    iget-object v4, v1, Ll/ۚܺۜ;->ܰ:Ll/ᩳۖۜ;

    invoke-virtual {v4}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v4

    .line 92
    iget-object v5, v1, Ll/ۚܺۜ;->ܰ:Ll/ᩳۖۜ;

    const-string v6, "path"

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v5, p1

    invoke-static {v5, v4, v6}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;Ll/۟ۢۜ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8
    :try_end_5
    .catch Ll/ۗۛ᩻; {:try_start_5 .. :try_end_5} :catch_b
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_a
    .catch Ljava/lang/SecurityException; {:try_start_5 .. :try_end_5} :catch_9
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_8
    .catchall {:try_start_5 .. :try_end_5} :catchall_9

    .line 93
    :try_start_6
    invoke-virtual/range {p3 .. p3}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    move-object v4, v2

    goto :goto_0

    :cond_0
    invoke-static {v9, v8}, Ll/ܺۘۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ܺۘۜ;

    move-result-object v4

    :goto_0
    if-eqz v4, :cond_2

    .line 94
    invoke-static/range {p2 .. p2}, Ll/᩵ܺۜ;->ۧ(Ll/᩵ܺۜ;)Ljava/lang/String;

    move-result-object v5

    iget-object v6, v4, Ll/ܺۘۜ;->ܿ:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    iget-object v5, v4, Ll/ܺۘۜ;->ܿ:Ljava/lang/String;

    .line 95
    invoke-virtual {v0, v5}, Ll/᩵ܺۜ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget-object v6, v4, Ll/ܺۘۜ;->ܺ:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    const-string v0, "FILE_INVALID_CURSOR"

    const-string v3, "The text search cursor is invalid or does not match this request. Restart with cursor=\"\"."

    const-string v4, "warning"

    .line 92
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "path"

    invoke-virtual {v5, v6, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 90
    invoke-static {v0, v3, v4, v2, v5}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 96
    throw v0

    .line 98
    :cond_2
    :goto_1
    invoke-virtual/range {p3 .. p3}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-static/range {p2 .. p2}, Ll/ۚܺۜ;->֫(Ll/᩵ܺۜ;)Ll/ۨۘܽ;

    move-result-object v5

    goto :goto_2

    :cond_3
    move-object v5, v2

    .line 99
    :goto_2
    iget-object v6, v1, Ll/ۚܺۜ;->ܰ:Ll/ᩳۖۜ;

    invoke-virtual {v6, v8}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;)Ll/ۤۖۜ;

    move-result-object v20
    :try_end_6
    .catch Ll/ۗۛ᩻; {:try_start_6 .. :try_end_6} :catch_7
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_6
    .catch Ljava/lang/SecurityException; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_6 .. :try_end_6} :catch_4
    .catchall {:try_start_6 .. :try_end_6} :catchall_9

    .line 100
    :try_start_7
    iget-object v6, v1, Ll/ۚܺۜ;->ܰ:Ll/ᩳۖۜ;

    invoke-virtual {v6, v8}, Ll/ᩳۖۜ;->ᩳ(Ljava/lang/String;)Ll/۫᩵ܿ;

    move-result-object v21

    .line 213
    iget-object v6, v1, Ll/ۚܺۜ;->ܰ:Ll/ᩳۖۜ;

    invoke-virtual/range {v21 .. v21}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v7

    sget-object v11, Ll/ۗ᩵ܿ;->ۙ:Ll/ۗ᩵ܿ;

    if-eq v7, v11, :cond_16

    .line 214
    invoke-virtual/range {v21 .. v21}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v7

    sget-object v11, Ll/ۗ᩵ܿ;->۬:Ll/ۗ᩵ܿ;

    if-ne v7, v11, :cond_15

    .line 102
    invoke-virtual/range {v21 .. v21}, Ll/۫᩵ܿ;->ܽ()J

    move-result-wide v6

    const-wide v11, 0x1fffffffffffffL

    cmp-long v13, v6, v11

    if-gtz v13, :cond_14

    const v2, 0x8000

    new-array v6, v2, [B

    .line 196
    invoke-virtual/range {v21 .. v21}, Ll/۫᩵ܿ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v7

    invoke-virtual {v7}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v7

    .line 197
    invoke-virtual {v10, v7}, Ll/֨ۘۜ;->֫(Ljava/io/Closeable;)Ll/ۚۘۜ;

    move-result-object v11
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    :goto_3
    if-ge v3, v2, :cond_7

    .line 199
    :try_start_8
    invoke-static {}, Ll/֡ۘۜ;->֫()V

    sub-int v12, v2, v3

    .line 200
    invoke-virtual {v7, v6, v3, v12}, Ljava/io/InputStream;->read([BII)I

    move-result v12

    if-gez v12, :cond_4

    goto :goto_5

    :cond_4
    if-nez v12, :cond_6

    .line 203
    invoke-virtual {v7}, Ljava/io/InputStream;->read()I

    move-result v12

    if-gez v12, :cond_5

    goto :goto_5

    :cond_5
    add-int/lit8 v13, v3, 0x1

    int-to-byte v12, v12

    .line 205
    aput-byte v12, v6, v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    move v3, v13

    goto :goto_3

    :cond_6
    add-int/2addr v3, v12

    goto :goto_3

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 197
    :try_start_9
    invoke-virtual {v11}, Ll/ۚۘۜ;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object v3, v0

    :try_start_a
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    :catchall_2
    move-exception v0

    move-object v2, v0

    move-object v13, v8

    goto/16 :goto_f

    .line 208
    :cond_7
    :goto_5
    :try_start_b
    invoke-virtual {v11}, Ll/ۚۘۜ;->close()V

    if-ne v3, v2, :cond_8

    goto :goto_6

    .line 209
    :cond_8
    invoke-static {v6, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v6

    .line 108
    :goto_6
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v2

    invoke-static {v2}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v2

    .line 109
    invoke-static/range {p2 .. p2}, Ll/᩵ܺۜ;->ۧ(Ll/᩵ܺۜ;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v6}, Ll/ܳۘۜ;->֫(Ljava/lang/String;[B)Ll/ܿۘۜ;

    move-result-object v6
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    if-nez v4, :cond_9

    .line 111
    :try_start_c
    new-instance v4, Ll/ܺۘۜ;

    iget-object v3, v6, Ll/ܿۘۜ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ll/᩵ܺۜ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    iget-object v14, v6, Ll/ܿۘۜ;->ᩳ:Ljava/lang/String;

    .line 112
    invoke-virtual/range {v21 .. v21}, Ll/۫᩵ܿ;->ܽ()J

    move-result-wide v15

    invoke-virtual/range {v21 .. v21}, Ll/۫᩵ܿ;->ۧ()J

    move-result-wide v17

    move-object v11, v4

    move-object v12, v8

    move-object/from16 v19, v2

    invoke-direct/range {v11 .. v19}, Ll/ܺۘۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;)V

    .line 113
    iget v2, v6, Ll/ܿۘۜ;->ۧ:I

    int-to-long v2, v2

    iput-wide v2, v4, Ll/ܺۘۜ;->ۧ:J

    .line 114
    iput-wide v2, v4, Ll/ܺۘۜ;->ۘ:J
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    :goto_7
    move-object v11, v4

    goto :goto_8

    .line 115
    :cond_9
    :try_start_d
    iget-wide v11, v4, Ll/ܺۘۜ;->ᩴ:J

    invoke-virtual/range {v21 .. v21}, Ll/۫᩵ܿ;->ܽ()J

    move-result-wide v13

    cmp-long v3, v11, v13

    if-nez v3, :cond_13

    iget-wide v11, v4, Ll/ܺۘۜ;->᩻:J

    invoke-virtual/range {v21 .. v21}, Ll/۫᩵ܿ;->ۧ()J

    move-result-wide v13

    cmp-long v3, v11, v13

    if-nez v3, :cond_13

    iget-object v3, v4, Ll/ܺۘۜ;->ۖ:Ljava/lang/String;

    .line 116
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_13

    iget-object v2, v4, Ll/ܺۘۜ;->ܿ:Ljava/lang/String;

    iget-object v3, v6, Ll/ܿۘۜ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_13

    goto :goto_7

    .line 119
    :goto_8
    invoke-direct {v1, v9, v10}, Ll/ۚܺۜ;->֫(Ljava/lang/String;Ll/֨ۘۜ;)Ll/᩸ۘۜ;

    move-result-object v2

    if-nez v2, :cond_b

    .line 121
    new-instance v12, Ll/᩸ۘۜ;

    invoke-virtual/range {v21 .. v21}, Ll/۫᩵ܿ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v3
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    if-nez v5, :cond_a

    .line 122
    :try_start_e
    invoke-static/range {p2 .. p2}, Ll/ۚܺۜ;->֫(Ll/᩵ܺۜ;)Ll/ۨۘܽ;

    move-result-object v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    move-object v7, v2

    goto :goto_9

    :cond_a
    move-object v7, v5

    :goto_9
    move-object v2, v12

    move-object v4, v6

    move-object v5, v11

    move-object/from16 v6, p2

    move-object v13, v8

    move-object v8, v10

    :try_start_f
    invoke-direct/range {v2 .. v8}, Ll/᩸ۘۜ;-><init>(Ll/ܶ᩵ܿ;Ll/ܿۘۜ;Ll/ܺۘۜ;Ll/᩵ܺۜ;Ll/ۨۘܽ;Ll/֨ۘۜ;)V

    .line 123
    invoke-virtual {v10, v12}, Ll/֨ۘۜ;->֫(Ljava/io/Closeable;)Ll/ۚۘۜ;

    move-object v2, v12

    goto :goto_a

    :cond_b
    move-object v13, v8

    .line 125
    iget-object v11, v2, Ll/᩸ۘۜ;->᩶:Ll/ܺۘۜ;

    .line 127
    :goto_a
    iget-wide v4, v1, Ll/ۚܺۜ;->ۨ:J

    iget-wide v6, v1, Ll/ۚܺۜ;->᩺:J

    iget-object v8, v1, Ll/ۚܺۜ;->۫:Ll/ۨۗᩳ;

    move-object v3, v2

    invoke-virtual/range {v3 .. v8}, Ll/᩸ۘۜ;->֫(JJLl/ۨۗᩳ;)Ll/ܶۘۜ;

    move-result-object v0

    move-object/from16 v16, p0

    .line 128
    monitor-enter v16
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    .line 129
    :try_start_10
    iget-boolean v3, v1, Ll/ۚܺۜ;->ۤ:Z

    if-nez v3, :cond_12

    .line 130
    monitor-exit v16
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    .line 131
    :try_start_11
    iget-object v3, v1, Ll/ۚܺۜ;->ܰ:Ll/ᩳۖۜ;

    invoke-virtual {v3, v13}, Ll/ᩳۖۜ;->ᩳ(Ljava/lang/String;)Ll/۫᩵ܿ;

    move-result-object v3

    .line 132
    iget-object v4, v0, Ll/ܶۘۜ;->ܿ:Ljava/lang/String;

    const-string v5, "eof"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const-wide/16 v5, 0x0

    if-eqz v4, :cond_d

    iget-wide v7, v11, Ll/ܺۘۜ;->ᩴ:J

    cmp-long v4, v7, v5

    if-ltz v4, :cond_d

    iget-wide v14, v11, Ll/ܺۘۜ;->ۘ:J

    cmp-long v4, v14, v7

    if-nez v4, :cond_c

    goto :goto_b

    :cond_c
    invoke-static {v13}, Ll/ۚܺۜ;->ۧ(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 133
    :cond_d
    :goto_b
    invoke-virtual {v3}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v4

    sget-object v7, Ll/ۗ᩵ܿ;->۬:Ll/ۗ᩵ܿ;

    if-ne v4, v7, :cond_11

    invoke-virtual {v3}, Ll/۫᩵ܿ;->ܽ()J

    move-result-wide v7

    invoke-virtual/range {v21 .. v21}, Ll/۫᩵ܿ;->ܽ()J

    move-result-wide v14

    cmp-long v4, v7, v14

    if-nez v4, :cond_11

    .line 134
    invoke-virtual {v3}, Ll/۫᩵ܿ;->ۧ()J

    move-result-wide v3

    invoke-virtual/range {v21 .. v21}, Ll/۫᩵ܿ;->ۧ()J

    move-result-wide v7

    cmp-long v12, v3, v7

    if-nez v12, :cond_11

    .line 136
    iget-object v3, v1, Ll/ۚܺۜ;->ܰ:Ll/ᩳۖۜ;

    invoke-virtual {v3}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v3

    invoke-virtual {v3, v13}, Ll/۟ۢۜ;->ܽ(Ljava/lang/String;)V

    .line 137
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "path"

    invoke-virtual {v3, v4, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "encoding"

    iget-object v7, v11, Ll/ܺۘۜ;->ܿ:Ljava/lang/String;

    invoke-virtual {v3, v4, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "matchedLines"

    iget-object v7, v0, Ll/ܶۘۜ;->ᩳ:Lbin/mt/json/JSONArray;

    .line 138
    invoke-virtual {v3, v4, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "blocks"

    invoke-virtual {v0}, Ll/ܶۘۜ;->֫()Lbin/mt/json/JSONArray;

    move-result-object v7

    invoke-virtual {v3, v4, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "searchedThroughByteOffset"

    iget-wide v7, v11, Ll/ܺۘۜ;->ۘ:J

    .line 139
    invoke-virtual {v3, v4, v7, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "scanSize"

    .line 140
    iget-wide v7, v11, Ll/ܺۘۜ;->ᩴ:J

    cmp-long v12, v7, v5

    if-gez v12, :cond_e

    sget-object v5, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_c

    :cond_e
    invoke-static {v7, v8}, Lbin/mt/json/JSON;->value(J)Lbin/mt/json/JSONValue;

    move-result-object v5

    :goto_c
    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "stopReason"

    iget-object v5, v0, Ll/ܶۘۜ;->ܿ:Ljava/lang/String;

    .line 141
    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "warnings"

    iget-object v5, v0, Ll/ܶۘۜ;->᩻:Lbin/mt/json/JSONArray;

    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 267
    iget-object v4, v0, Ll/ܶۘۜ;->ܿ:Ljava/lang/String;

    const-string v5, "eof"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_f

    iget-object v4, v0, Ll/ܶۘۜ;->ܿ:Ljava/lang/String;

    const-string v5, "resource_limit"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_f

    iget-object v0, v0, Ll/ܶۘۜ;->ܿ:Ljava/lang/String;

    const-string v4, "decode_error"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    .line 142
    invoke-virtual {v11}, Ll/ܺۘۜ;->֫()Ljava/lang/String;

    move-result-object v0

    goto :goto_d

    :cond_f
    const-string v0, ""

    .line 143
    :goto_d
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_10

    invoke-direct {v1, v0, v2, v10}, Ll/ۚܺۜ;->֫(Ljava/lang/String;Ll/᩸ۘۜ;Ll/֨ۘۜ;)V

    .line 144
    :cond_10
    new-instance v2, Ll/֡ܺۜ;

    invoke-direct {v2, v3, v0}, Ll/֡ܺۜ;-><init>(Lbin/mt/json/JSONObject;Ljava/lang/String;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_5

    .line 145
    :try_start_12
    invoke-virtual/range {v20 .. v20}, Ll/ۤۖۜ;->close()V
    :try_end_12
    .catch Ll/ۗۛ᩻; {:try_start_12 .. :try_end_12} :catch_3
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_12 .. :try_end_12} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_12 .. :try_end_12} :catch_0
    .catchall {:try_start_12 .. :try_end_12} :catchall_9

    .line 160
    invoke-virtual {v10}, Ll/֨ۘۜ;->ۧ()V

    move-object/from16 v16, p0

    .line 161
    monitor-enter v16

    :try_start_13
    iget-object v0, v1, Ll/ۚܺۜ;->᩸:Ljava/util/HashSet;

    invoke-virtual {v0, v10}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    monitor-exit v16
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_3

    .line 163
    invoke-direct {v1, v9}, Ll/ۚܺۜ;->ᩳ(Ljava/lang/String;)V

    .line 164
    iget-object v0, v1, Ll/ۚܺۜ;->ۛ:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    return-object v2

    :catchall_3
    move-exception v0

    .line 161
    :try_start_14
    monitor-exit v16
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_3

    throw v0

    .line 134
    :cond_11
    :try_start_15
    invoke-static {v13}, Ll/ۚܺۜ;->ۧ(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_5

    .line 129
    :cond_12
    :try_start_16
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Text search service is closed."

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_4
    move-exception v0

    .line 130
    monitor-exit v16
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_4

    :try_start_17
    throw v0

    :cond_13
    move-object v13, v8

    .line 117
    invoke-static {v13}, Ll/ۚܺۜ;->ۧ(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_14
    move-object v13, v8

    const-string v0, "FILE_STORAGE_ERROR"

    const-string v3, "File size exceeds the supported JSON integer range."

    const-string v4, "warning"

    .line 105
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "path"

    invoke-virtual {v5, v6, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 103
    invoke-static {v0, v3, v4, v2, v5}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_15
    move-object v13, v8

    const-string v0, "FILE_NOT_REGULAR"

    const-string v2, "Text search requires a regular file."

    .line 215
    invoke-virtual/range {v21 .. v21}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v3

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v2, v13, v3}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ۗ᩵ܿ;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_16
    move-object v13, v8

    .line 213
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v13}, Ll/ᩳۖۜ;->ܿ(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_5

    :catchall_5
    move-exception v0

    goto :goto_e

    :catchall_6
    move-exception v0

    move-object v13, v8

    :goto_e
    move-object v2, v0

    .line 99
    :goto_f
    :try_start_18
    invoke-virtual/range {v20 .. v20}, Ll/ۤۖۜ;->close()V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_7

    goto :goto_10

    :catchall_7
    move-exception v0

    move-object v3, v0

    :try_start_19
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_10
    throw v2
    :try_end_19
    .catch Ll/ۗۛ᩻; {:try_start_19 .. :try_end_19} :catch_3
    .catch Ljava/io/IOException; {:try_start_19 .. :try_end_19} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_19 .. :try_end_19} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_19 .. :try_end_19} :catch_0
    .catchall {:try_start_19 .. :try_end_19} :catchall_9

    :catch_0
    move-exception v0

    goto :goto_12

    :catch_1
    move-exception v0

    goto :goto_12

    :catch_2
    move-exception v0

    goto :goto_13

    :catch_3
    move-exception v0

    goto :goto_14

    :catch_4
    move-exception v0

    :goto_11
    move-object v13, v8

    goto :goto_12

    :catch_5
    move-exception v0

    goto :goto_11

    :goto_12
    move-object v2, v13

    goto :goto_15

    :catch_6
    move-exception v0

    move-object v13, v8

    :goto_13
    move-object v2, v13

    goto :goto_16

    :catch_7
    move-exception v0

    move-object v13, v8

    :goto_14
    move-object v2, v13

    goto :goto_17

    .line 88
    :cond_17
    :try_start_1a
    new-instance v0, Ljava/io/IOException;

    const-string v3, "Text search service is closed."

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_8
    move-exception v0

    .line 89
    monitor-exit v16
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_8

    :try_start_1b
    throw v0
    :try_end_1b
    .catch Ll/ۗۛ᩻; {:try_start_1b .. :try_end_1b} :catch_b
    .catch Ljava/io/IOException; {:try_start_1b .. :try_end_1b} :catch_a
    .catch Ljava/lang/SecurityException; {:try_start_1b .. :try_end_1b} :catch_9
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1b .. :try_end_1b} :catch_8
    .catchall {:try_start_1b .. :try_end_1b} :catchall_9

    :catchall_9
    move-exception v0

    const/4 v2, 0x1

    goto/16 :goto_1d

    :catch_8
    move-exception v0

    goto :goto_15

    :catch_9
    move-exception v0

    :goto_15
    const/4 v3, 0x1

    goto :goto_18

    :catch_a
    move-exception v0

    :goto_16
    const/4 v3, 0x1

    goto :goto_19

    :catch_b
    move-exception v0

    :goto_17
    const/4 v3, 0x1

    goto :goto_1b

    .line 84
    :catch_c
    :try_start_1c
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 85
    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v4, "Text search canceled while waiting."

    invoke-direct {v0, v4}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1c
    .catch Ll/ۗۛ᩻; {:try_start_1c .. :try_end_1c} :catch_10
    .catch Ljava/io/IOException; {:try_start_1c .. :try_end_1c} :catch_f
    .catch Ljava/lang/SecurityException; {:try_start_1c .. :try_end_1c} :catch_e
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1c .. :try_end_1c} :catch_d
    .catchall {:try_start_1c .. :try_end_1c} :catchall_b

    .line 77
    :cond_18
    :try_start_1d
    new-instance v0, Ljava/io/IOException;

    const-string v4, "Text search service is closed."

    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_a
    move-exception v0

    .line 79
    monitor-exit v16
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_a

    :try_start_1e
    throw v0
    :try_end_1e
    .catch Ll/ۗۛ᩻; {:try_start_1e .. :try_end_1e} :catch_10
    .catch Ljava/io/IOException; {:try_start_1e .. :try_end_1e} :catch_f
    .catch Ljava/lang/SecurityException; {:try_start_1e .. :try_end_1e} :catch_e
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1e .. :try_end_1e} :catch_d
    .catchall {:try_start_1e .. :try_end_1e} :catchall_b

    :catchall_b
    move-exception v0

    goto :goto_1c

    :catch_d
    move-exception v0

    goto :goto_18

    :catch_e
    move-exception v0

    .line 158
    :goto_18
    :try_start_1f
    iget-object v4, v1, Ll/ۚܺۜ;->ܰ:Ll/ᩳۖۜ;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v2}, Ll/ᩳۖۜ;->֫(Ljava/lang/RuntimeException;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :catch_f
    move-exception v0

    :goto_19
    move-object/from16 v16, p0

    .line 153
    monitor-enter v16
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_b

    .line 154
    :try_start_20
    iget-boolean v4, v1, Ll/ۚܺۜ;->ۤ:Z

    if-nez v4, :cond_1a

    invoke-virtual {v10}, Ll/֨ۘۜ;->ܽ()Z

    move-result v4

    if-nez v4, :cond_1a

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v4

    if-eqz v4, :cond_19

    goto :goto_1a

    .line 155
    :cond_19
    monitor-exit v16
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_c

    .line 156
    :try_start_21
    iget-object v4, v1, Ll/ۚܺۜ;->ܰ:Ll/ᩳۖۜ;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v0}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;Ljava/io/IOException;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_b

    .line 154
    :cond_1a
    :goto_1a
    :try_start_22
    invoke-direct {v1, v2}, Ll/ۚܺۜ;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :catchall_c
    move-exception v0

    .line 155
    monitor-exit v16
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_c

    :try_start_23
    throw v0

    :catch_10
    move-exception v0

    .line 148
    :goto_1b
    iget-object v4, v0, Ll/ۗۛ᩻;->᩸:Ljava/lang/String;

    const-string v5, "FILE_OPERATION_INTERRUPTED"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1b

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v4

    if-eqz v4, :cond_1b

    .line 149
    invoke-direct {v1, v2}, Ll/ۚܺۜ;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 151
    :cond_1b
    throw v0
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_b

    :goto_1c
    move v2, v3

    .line 160
    :goto_1d
    invoke-virtual {v10}, Ll/֨ۘۜ;->ۧ()V

    move-object/from16 v16, p0

    .line 161
    monitor-enter v16

    :try_start_24
    iget-object v3, v1, Ll/ۚܺۜ;->᩸:Ljava/util/HashSet;

    invoke-virtual {v3, v10}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    monitor-exit v16
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_d

    .line 163
    invoke-direct {v1, v9}, Ll/ۚܺۜ;->ᩳ(Ljava/lang/String;)V

    if-eqz v2, :cond_1c

    .line 164
    iget-object v2, v1, Ll/ۚܺۜ;->ۛ:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v2}, Ljava/util/concurrent/Semaphore;->release()V

    .line 165
    :cond_1c
    throw v0

    :catchall_d
    move-exception v0

    .line 161
    :try_start_25
    monitor-exit v16
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_d

    throw v0
.end method
