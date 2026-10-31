.class public final Ll/ܳ᩻ۜ;
.super Ljava/lang/Object;
.source "777R"


# instance fields
.field public final ֡:Ljava/lang/String;

.field public final ֨:Ll/᩵ᩳۜ;

.field public ֫:Ll/᩹ۨ᩻;

.field public final ۖ:Ll/᩶ۨ᩻;

.field public final ۗ:Ll/۠᩷ۜ;

.field public final ۘ:Ljava/lang/String;

.field public final ۙ:Z

.field public final ۚ:Ll/ᩴᩳۜ;

.field public final ۜ:Ll/ܶ᩵ܿ;

.field public ۠:Z

.field public final ۡ:Ljava/lang/String;

.field public final ۢ:Z

.field public ۧ:Ljava/util/HashMap;

.field public final ܳ:Ljava/util/HashMap;

.field public ܶ:Ll/ۗۛ᩻;

.field public ܺ:J

.field public ܽ:Ljava/util/HashMap;

.field public final ܿ:Ljava/util/ArrayList;

.field public ᩳ:Ljava/util/ArrayList;

.field public ᩴ:Ll/ۡᩳۜ;

.field public ᩵:Ll/ۗۛ᩻;

.field public final ᩶:Ljava/lang/String;

.field public final ᩷:Ljava/util/ArrayList;

.field public final ᩸:Ll/ᩴ᩺᩻;

.field public ᩹:Ljava/util/ArrayList;

.field public final ᩻:Ll/۟ۨ᩻;


# direct methods
.method public constructor <init>(Ll/۠᩷ۜ;Ljava/lang/String;ZLl/ܶ᩵ܿ;Ljava/lang/String;JJLjava/util/ArrayList;Ljava/util/ArrayList;ZLjava/lang/String;Ljava/lang/String;Ll/᩶ۨ᩻;Ll/۟ۨ᩻;Ll/ᩴᩳۜ;Ll/᩵ᩳۜ;)V
    .locals 4

    move-object v0, p0

    move-object v1, p4

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, Ll/ܳ᩻ۜ;->ᩳ:Ljava/util/ArrayList;

    .line 53
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, Ll/ܳ᩻ۜ;->᩹:Ljava/util/ArrayList;

    .line 54
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, v0, Ll/ܳ᩻ۜ;->ۧ:Ljava/util/HashMap;

    .line 56
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, v0, Ll/ܳ᩻ۜ;->ܽ:Ljava/util/HashMap;

    .line 57
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, v0, Ll/ܳ᩻ۜ;->ܳ:Ljava/util/HashMap;

    move-object v2, p1

    .line 93
    iput-object v2, v0, Ll/ܳ᩻ۜ;->ۗ:Ll/۠᩷ۜ;

    move-object v2, p2

    .line 94
    iput-object v2, v0, Ll/ܳ᩻ۜ;->ۡ:Ljava/lang/String;

    move v2, p3

    .line 95
    iput-boolean v2, v0, Ll/ܳ᩻ۜ;->ۙ:Z

    .line 96
    iput-object v1, v0, Ll/ܳ᩻ۜ;->ۜ:Ll/ܶ᩵ܿ;

    move-object v2, p5

    .line 97
    iput-object v2, v0, Ll/ܳ᩻ۜ;->᩶:Ljava/lang/String;

    move-object v2, p10

    .line 100
    iput-object v2, v0, Ll/ܳ᩻ۜ;->᩷:Ljava/util/ArrayList;

    move-object v2, p11

    .line 101
    iput-object v2, v0, Ll/ܳ᩻ۜ;->ܿ:Ljava/util/ArrayList;

    move/from16 v2, p12

    .line 103
    iput-boolean v2, v0, Ll/ܳ᩻ۜ;->ۢ:Z

    move-object/from16 v2, p13

    .line 104
    iput-object v2, v0, Ll/ܳ᩻ۜ;->֡:Ljava/lang/String;

    move-object/from16 v2, p14

    .line 105
    iput-object v2, v0, Ll/ܳ᩻ۜ;->ۘ:Ljava/lang/String;

    move-object/from16 v2, p15

    .line 106
    iput-object v2, v0, Ll/ܳ᩻ۜ;->ۖ:Ll/᩶ۨ᩻;

    move-object/from16 v2, p16

    .line 107
    iput-object v2, v0, Ll/ܳ᩻ۜ;->᩻:Ll/۟ۨ᩻;

    move-object/from16 v2, p17

    .line 108
    iput-object v2, v0, Ll/ܳ᩻ۜ;->ۚ:Ll/ᩴᩳۜ;

    move-object/from16 v2, p18

    .line 109
    iput-object v2, v0, Ll/ܳ᩻ۜ;->֨:Ll/᩵ᩳۜ;

    .line 110
    new-instance v2, Ll/ᩴ᩺᩻;

    const-string v3, "cache"

    .line 405
    invoke-virtual {p4, v3}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    const-string v3, "smali"

    .line 110
    invoke-virtual {v1, v3}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-direct {v2, v1}, Ll/ᩴ᩺᩻;-><init>(Ll/ܶ᩵ܿ;)V

    iput-object v2, v0, Ll/ܳ᩻ۜ;->᩸:Ll/ᩴ᩺᩻;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;
    .locals 2

    .line 141
    iget-object v0, p0, Ll/ܳ᩻ۜ;->ۗ:Ll/۠᩷ۜ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "entries"

    .line 401
    iget-object v1, p0, Ll/ܳ᩻ۜ;->ۜ:Ll/ܶ᩵ܿ;

    invoke-virtual {v1, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 417
    invoke-virtual {v0, p1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    return-object p1
.end method

.method public final declared-synchronized ֫()Ll/᩹ۨ᩻;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 131
    :try_start_0
    iget-object v1, p0, Ll/ܳ᩻ۜ;->֫:Ll/᩹ۨ᩻;

    if-nez v1, :cond_0

    .line 132
    iget-object v1, p0, Ll/ܳ᩻ۜ;->ۗ:Ll/۠᩷ۜ;

    iget-object v2, p0, Ll/ܳ᩻ۜ;->ۜ:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "cache"

    .line 405
    invoke-virtual {v2, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 132
    iget-object v2, p0, Ll/ܳ᩻ۜ;->᩷:Ljava/util/ArrayList;

    invoke-static {v1, v2}, Ll/᩹ۨ᩻;->֫(Ll/ܶ᩵ܿ;Ljava/util/ArrayList;)Ll/᩹ۨ᩻;

    move-result-object v1

    iput-object v1, p0, Ll/ܳ᩻ۜ;->֫:Ll/᩹ۨ᩻;

    .line 134
    :cond_0
    iget-object v1, p0, Ll/ܳ᩻ۜ;->֫:Ll/᩹ۨ᩻;
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

.method public final ۧ(Ljava/lang/String;)Ll/۬ۛ֡;
    .locals 10

    const-string v1, "MT MCP dex load out of memory: workspaceId="

    .line 148
    iget-object v0, p0, Ll/ܳ᩻ۜ;->ܳ:Ljava/util/HashMap;

    monitor-enter v0

    const-wide/16 v2, -0x1

    .line 152
    :try_start_0
    iget-object v4, p0, Ll/ܳ᩻ۜ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {v4, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/ref/Reference;

    if-eqz v4, :cond_0

    .line 154
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۬ۛ֡;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v4, :cond_0

    .line 156
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object v4

    .line 159
    :cond_0
    :try_start_2
    invoke-virtual {p0, p1}, Ll/ܳ᩻ۜ;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    .line 160
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v2

    .line 161
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ۘۧ()[B

    move-result-object v4

    invoke-static {v4}, Ll/۬ۛ֡;->֫([B)Ll/۬ۛ֡;

    move-result-object v4

    .line 162
    iget-object v5, p0, Ll/ܳ᩻ۜ;->ܳ:Ljava/util/HashMap;

    new-instance v6, Ljava/lang/ref/SoftReference;

    invoke-direct {v6, v4}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v5, p1, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 163
    :try_start_3
    monitor-exit v0

    return-object v4

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 187
    :catch_0
    iget-object p1, p0, Ll/ܳ᩻ۜ;->᩶:Ljava/lang/String;

    iget-boolean v1, p0, Ll/ܳ᩻ۜ;->ۙ:Z

    invoke-static {p1, v1}, Ll/ᩳ۬᩻;->֫(Ljava/lang/String;Z)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catch_1
    move-exception v4

    const-wide/16 v5, 0x0

    cmp-long v7, v2, v5

    if-gez v7, :cond_1

    .line 168
    :try_start_4
    invoke-virtual {p0, p1}, Ll/ܳ᩻ۜ;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v5

    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v2
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 174
    :catch_2
    :cond_1
    :try_start_5
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v5

    .line 175
    invoke-virtual {v5}, Ljava/lang/Runtime;->totalMemory()J

    move-result-wide v6

    invoke-virtual {v5}, Ljava/lang/Runtime;->freeMemory()J

    move-result-wide v8

    sub-long/2addr v6, v8

    .line 176
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ܳ᩻ۜ;->ۡ:Ljava/lang/String;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", dexEntryName="

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", fileLength="

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ", heapUsed="

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ", heapMax="

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    invoke-virtual {v5}, Ljava/lang/Runtime;->maxMemory()J

    move-result-wide v1

    invoke-virtual {v8, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ", error="

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 176
    invoke-static {p1}, Ll/᩶ۘܽ;->ܽ(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/OutOfMemoryError; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 185
    :catch_3
    :try_start_6
    throw v4

    .line 189
    :goto_0
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw p1
.end method

.method public final ۧ()Ll/ܶ᩵ܿ;
    .locals 2

    .line 124
    iget-object v0, p0, Ll/ܳ᩻ۜ;->ۗ:Ll/۠᩷ۜ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "original.apk"

    .line 393
    iget-object v1, p0, Ll/ܳ᩻ۜ;->ۜ:Ll/ܶ᩵ܿ;

    invoke-virtual {v1, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    return-object v0
.end method
