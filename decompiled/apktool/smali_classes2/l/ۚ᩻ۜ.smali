.class public final Ll/ۚ᩻ۜ;
.super Ljava/lang/Object;
.source "3791"


# instance fields
.field public final ֫:Ll/ۢ᩻ۜ;

.field public final ۧ:Ll/ۤۧۜ;

.field public final ܳ:Ljava/util/LinkedHashMap;

.field public final ܽ:Ll/۠᩺᩻;

.field public final ܿ:Ll/۠᩷ۜ;

.field public final ᩳ:Ll/ۜ᩻ۜ;


# direct methods
.method public constructor <init>(Ll/۠᩷ۜ;Ll/ۢ᩻ۜ;Ll/ۜ᩻ۜ;Ll/۠᩺᩻;Ll/ۤۧۜ;)V
    .locals 1

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ll/ۚ᩻ۜ;->ܳ:Ljava/util/LinkedHashMap;

    .line 38
    iput-object p1, p0, Ll/ۚ᩻ۜ;->ܿ:Ll/۠᩷ۜ;

    .line 39
    iput-object p2, p0, Ll/ۚ᩻ۜ;->֫:Ll/ۢ᩻ۜ;

    .line 40
    iput-object p3, p0, Ll/ۚ᩻ۜ;->ᩳ:Ll/ۜ᩻ۜ;

    .line 41
    iput-object p4, p0, Ll/ۚ᩻ۜ;->ܽ:Ll/۠᩺᩻;

    .line 42
    iput-object p5, p0, Ll/ۚ᩻ۜ;->ۧ:Ll/ۤۧۜ;

    return-void
.end method

.method private ֫(J)V
    .locals 9

    .line 240
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 241
    iget-object v1, p0, Ll/ۚ᩻ۜ;->ܳ:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 242
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܳ᩻ۜ;

    .line 243
    iget-boolean v4, v3, Ll/ܳ᩻ۜ;->ۙ:Z

    if-eqz v4, :cond_0

    iget-wide v4, v3, Ll/ܳ᩻ۜ;->ܺ:J

    sub-long v4, p1, v4

    const-wide/32 v6, 0x927c0

    cmp-long v8, v4, v6

    if-lez v8, :cond_0

    .line 245
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    iget-object v5, p0, Ll/ۚ᩻ۜ;->ܽ:Ll/۠᩺᩻;

    invoke-virtual {v5, v4}, Ll/۠᩺᩻;->֫(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    .line 248
    :cond_1
    invoke-direct {p0, v3}, Ll/ۚ᩻ۜ;->ܽ(Ll/ܳ᩻ۜ;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 249
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 252
    :cond_2
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 253
    invoke-direct {p0, p2}, Ll/ۚ᩻ۜ;->᩻(Ljava/lang/String;)Ll/ܳ᩻ۜ;

    goto :goto_1

    :cond_3
    return-void
.end method

.method private ֫(Z)V
    .locals 12

    .line 202
    iget-object v0, p0, Ll/ۚ᩻ۜ;->ܳ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܳ᩻ۜ;

    .line 203
    iget-boolean v3, v3, Ll/ܳ᩻ۜ;->ۙ:Z

    if-ne v3, p1, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 207
    :cond_1
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    :goto_1
    const/4 v3, 0x2

    if-le v2, v3, :cond_7

    .line 212
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    const-wide v5, 0x7fffffffffffffffL

    move-wide v6, v5

    move-object v5, v4

    :cond_2
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map$Entry;

    .line 213
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ܳ᩻ۜ;

    iget-boolean v9, v9, Ll/ܳ᩻ۜ;->ۙ:Z

    if-ne v9, p1, :cond_2

    .line 214
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v1, v9}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2

    .line 215
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    iget-object v10, p0, Ll/ۚ᩻ۜ;->ܽ:Ll/۠᩺᩻;

    invoke-virtual {v10, v9}, Ll/۠᩺᩻;->֫(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_3

    goto :goto_2

    .line 218
    :cond_3
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ܳ᩻ۜ;

    iget-wide v9, v9, Ll/ܳ᩻ۜ;->ܺ:J

    cmp-long v11, v9, v6

    if-gez v11, :cond_2

    .line 219
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܳ᩻ۜ;

    iget-wide v6, v4, Ll/ܳ᩻ۜ;->ܺ:J

    .line 220
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 221
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܳ᩻ۜ;

    goto :goto_2

    :cond_4
    if-nez v4, :cond_5

    goto :goto_3

    :cond_5
    if-eqz p1, :cond_6

    .line 227
    invoke-direct {p0, v5}, Ll/ۚ᩻ۜ;->ܽ(Ll/ܳ᩻ۜ;)Z

    move-result v3

    if-nez v3, :cond_6

    .line 228
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 231
    :cond_6
    invoke-direct {p0, v4}, Ll/ۚ᩻ۜ;->᩻(Ljava/lang/String;)Ll/ܳ᩻ۜ;

    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    :cond_7
    :goto_3
    return-void
.end method

.method private ܽ(Ll/ܳ᩻ۜ;)Z
    .locals 3

    .line 262
    :try_start_0
    iget-object v0, p0, Ll/ۚ᩻ۜ;->ܿ:Ll/۠᩷ۜ;

    iget-object v1, p1, Ll/ܳ᩻ۜ;->ۜ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Ll/۠᩷ۜ;->ܽ(Ll/ܶ᩵ܿ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    .line 268
    iput-boolean v0, p1, Ll/ܳ᩻ۜ;->۠:Z

    .line 269
    iget-object v1, p0, Ll/ۚ᩻ۜ;->ܽ:Ll/۠᩺᩻;

    invoke-virtual {v1, p1}, Ll/۠᩺᩻;->ۧ(Ll/ܳ᩻ۜ;)V

    .line 270
    invoke-static {}, Ll/ܺܰۡ;->ۢ()V

    return v0

    :catch_0
    move-exception v0

    .line 265
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "MT MCP temporary workspace eviction delete failed, workspaceId="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p1, p1, Ll/ܳ᩻ۜ;->ۡ:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return p1
.end method

.method private ᩳ(Ll/ܳ᩻ۜ;)V
    .locals 3

    .line 159
    iget-boolean v0, p1, Ll/ܳ᩻ۜ;->۠:Z

    iget-object v1, p1, Ll/ܳ᩻ۜ;->ۡ:Ljava/lang/String;

    if-nez v0, :cond_2

    .line 164
    :try_start_0
    iget-object v0, p0, Ll/ۚ᩻ۜ;->ܿ:Ll/۠᩷ۜ;

    invoke-virtual {v0, v1}, Ll/۠᩷ۜ;->ۧ(Ljava/lang/String;)Ll/֡᩷ۜ;
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_0

    .line 169
    iget-boolean v0, p1, Ll/ܳ᩻ۜ;->۠:Z

    if-nez v0, :cond_0

    return-void

    .line 170
    :cond_0
    iget-object p1, p1, Ll/ܳ᩻ۜ;->ܶ:Ll/ۗۛ᩻;

    throw p1

    :catch_0
    move-exception v0

    const/4 v2, 0x1

    .line 178
    iput-boolean v2, p1, Ll/ܳ᩻ۜ;->۠:Z

    .line 179
    iput-object v0, p1, Ll/ܳ᩻ۜ;->ܶ:Ll/ۗۛ᩻;

    .line 180
    iget-object v2, p0, Ll/ۚ᩻ۜ;->ۧ:Ll/ۤۧۜ;

    invoke-virtual {v2, v1}, Ll/ۤۧۜ;->֫(Ljava/lang/String;)V

    .line 181
    iget-object v2, p0, Ll/ۚ᩻ۜ;->ܽ:Ll/۠᩺᩻;

    invoke-virtual {v2, p1}, Ll/۠᩺᩻;->ۧ(Ll/ܳ᩻ۜ;)V

    .line 182
    invoke-virtual {v2, v1}, Ll/۠᩺᩻;->֫(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Ll/ۚ᩻ۜ;->ܳ:Ljava/util/LinkedHashMap;

    .line 183
    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, p1, :cond_1

    .line 184
    invoke-direct {p0, v1}, Ll/ۚ᩻ۜ;->᩻(Ljava/lang/String;)Ll/ܳ᩻ۜ;

    .line 167
    :cond_1
    throw v0

    .line 160
    :cond_2
    iget-object p1, p1, Ll/ܳ᩻ۜ;->ܶ:Ll/ۗۛ᩻;

    throw p1
.end method

.method private ᩻(Ljava/lang/String;)Ll/ܳ᩻ۜ;
    .locals 1

    .line 139
    iget-object v0, p0, Ll/ۚ᩻ۜ;->ۧ:Ll/ۤۧۜ;

    invoke-virtual {v0, p1}, Ll/ۤۧۜ;->֫(Ljava/lang/String;)V

    .line 140
    iget-object v0, p0, Ll/ۚ᩻ۜ;->ܳ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܳ᩻ۜ;

    return-object p1
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ll/ܳ᩻ۜ;
    .locals 1

    .line 104
    iget-object v0, p0, Ll/ۚ᩻ۜ;->ܳ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܳ᩻ۜ;

    if-eqz p1, :cond_1

    .line 105
    iget-boolean v0, p1, Ll/ܳ᩻ۜ;->۠:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/ܳ᩻ۜ;)V
    .locals 2

    .line 81
    iget-object v0, p0, Ll/ۚ᩻ۜ;->ܳ:Ljava/util/LinkedHashMap;

    iget-object v1, p1, Ll/ܳ᩻ۜ;->ۡ:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    iget-object p1, p0, Ll/ۚ᩻ۜ;->֫:Ll/ۢ᩻ۜ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Ll/ۚ᩻ۜ;->֫(J)V

    const/4 p1, 0x0

    .line 193
    invoke-direct {p0, p1}, Ll/ۚ᩻ۜ;->֫(Z)V

    const/4 p1, 0x1

    .line 194
    invoke-direct {p0, p1}, Ll/ۚ᩻ۜ;->֫(Z)V

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)Ll/ܳ᩻ۜ;
    .locals 6

    .line 49
    iget-object v0, p0, Ll/ۚ᩻ۜ;->֫:Ll/ۢ᩻ۜ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-direct {p0, v1, v2}, Ll/ۚ᩻ۜ;->֫(J)V

    .line 50
    iget-object v1, p0, Ll/ۚ᩻ۜ;->ܳ:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳ᩻ۜ;

    .line 51
    iget-object v3, p0, Ll/ۚ᩻ۜ;->ܿ:Ll/۠᩷ۜ;

    if-eqz v2, :cond_0

    .line 52
    invoke-direct {p0, v2}, Ll/ۚ᩻ۜ;->ᩳ(Ll/ܳ᩻ۜ;)V

    .line 53
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 117
    iput-wide v0, v2, Ll/ܳ᩻ۜ;->ܺ:J

    .line 149
    :try_start_0
    iget-object p1, v2, Ll/ܳ᩻ۜ;->ۜ:Ll/ܶ᩵ܿ;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, v0, v1}, Ll/۠᩷ۜ;->֫(Ll/ܶ᩵ܿ;J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v2

    .line 61
    :cond_0
    :try_start_1
    invoke-virtual {v3, p1}, Ll/۠᩷ۜ;->֫(Ljava/lang/String;)Ll/֡᩷ۜ;

    move-result-object p1

    .line 62
    iget-boolean v2, p1, Ll/֡᩷ۜ;->ۘ:Z

    if-nez v2, :cond_1

    .line 65
    iget-object p1, p1, Ll/֡᩷ۜ;->ᩴ:Ljava/lang/String;

    invoke-virtual {v3, p1}, Ll/۠᩷ۜ;->ۧ(Ljava/lang/String;)Ll/֡᩷ۜ;

    move-result-object p1

    .line 66
    iget-object v2, p0, Ll/ۚ᩻ۜ;->ᩳ:Ll/ۜ᩻ۜ;

    invoke-virtual {v2, p1}, Ll/ۜ᩻ۜ;->֫(Ll/֡᩷ۜ;)Ll/ܳ᩻ۜ;

    move-result-object p1

    .line 67
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 117
    iput-wide v4, p1, Ll/ܳ᩻ۜ;->ܺ:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 149
    :try_start_2
    iget-object v2, p1, Ll/ܳ᩻ۜ;->ۜ:Ll/ܶ᩵ܿ;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v4, v5}, Ll/۠᩷ۜ;->֫(Ll/ܶ᩵ܿ;J)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 68
    :catch_1
    :try_start_3
    iget-object v2, p1, Ll/ܳ᩻ۜ;->ۡ:Ljava/lang/String;

    invoke-virtual {v1, v2, p1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Ll/ۚ᩻ۜ;->֫(J)V

    const/4 v0, 0x0

    .line 193
    invoke-direct {p0, v0}, Ll/ۚ᩻ۜ;->֫(Z)V

    const/4 v0, 0x1

    .line 194
    invoke-direct {p0, v0}, Ll/ۚ᩻ۜ;->֫(Z)V

    .line 70
    sget v0, Ll/ۡۨ᩻;->֫:I

    return-object p1

    :cond_1
    const-string p1, "TEMPORARY_WORKSPACE_REOPEN_UNSUPPORTED"

    const-string v0, "Temporary workspaces cannot be reopened. Open the APK path again instead."

    const-string v1, "fatal"

    .line 80
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    .line 78
    invoke-static {v2, p1, v0, v1}, Ll/ۗۛ᩻;->ۧ(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 63
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p1

    .line 73
    sget v0, Ll/ۡۨ᩻;->֫:I

    .line 74
    throw p1
.end method

.method public final ۧ(Ll/ܳ᩻ۜ;)V
    .locals 2

    .line 294
    iget-boolean v0, p1, Ll/ܳ᩻ۜ;->۠:Z

    iget-object v1, p1, Ll/ܳ᩻ۜ;->ۡ:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۚ᩻ۜ;->ܳ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p1, :cond_0

    iget-object p1, p0, Ll/ۚ᩻ۜ;->ܽ:Ll/۠᩺᩻;

    .line 295
    invoke-virtual {p1, v1}, Ll/۠᩺᩻;->֫(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 296
    invoke-direct {p0, v1}, Ll/ۚ᩻ۜ;->᩻(Ljava/lang/String;)Ll/ܳ᩻ۜ;

    :cond_0
    return-void
.end method

.method public final ܳ(Ljava/lang/String;)V
    .locals 4

    .line 279
    :try_start_0
    new-instance v0, Ll/ۢۨ᩻;

    iget-object v1, p0, Ll/ۚ᩻ۜ;->ܿ:Ll/۠᩷ۜ;

    new-instance v2, Ll/᩸ۢۢ;

    const/4 v3, 0x1

    invoke-direct {v2, v3, p0}, Ll/᩸ۢۢ;-><init>(ILjava/lang/Object;)V

    invoke-direct {v0, v1, v2}, Ll/ۢۨ᩻;-><init>(Ll/۠᩷ۜ;Ljava/util/function/Consumer;)V

    .line 281
    invoke-static {}, Ll/ᩳ۬᩻;->֫()Ll/ᩳ۬᩻;

    .line 16
    invoke-static {}, Ll/᩶ۗ᩻;->֫()I

    move-result v1

    .line 281
    iget-object v2, p0, Ll/ۚ᩻ۜ;->֫:Ll/ۢ᩻ۜ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, p1, v1, v2, v3}, Ll/ۢۨ᩻;->֫(Ljava/lang/String;IJ)Ljava/util/ArrayList;

    move-result-object p1

    .line 282
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 283
    invoke-direct {p0, v0}, Ll/ۚ᩻ۜ;->᩻(Ljava/lang/String;)Ll/ܳ᩻ۜ;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    const-string v0, "MT MCP session cleanup failed"

    .line 286
    invoke-static {v0, p1}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 1

    .line 129
    invoke-direct {p0, p1}, Ll/ۚ᩻ۜ;->᩻(Ljava/lang/String;)Ll/ܳ᩻ۜ;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 133
    iput-boolean v0, p1, Ll/ܳ᩻ۜ;->۠:Z

    .line 134
    iget-object v0, p0, Ll/ۚ᩻ۜ;->ܽ:Ll/۠᩺᩻;

    invoke-virtual {v0, p1}, Ll/۠᩺᩻;->ۧ(Ll/ܳ᩻ۜ;)V

    return-void
.end method

.method public final ܿ(Ljava/lang/String;)V
    .locals 1

    .line 119
    iget-object v0, p0, Ll/ۚ᩻ۜ;->ܳ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܳ᩻ۜ;

    if-eqz p1, :cond_0

    .line 121
    iget-object v0, p0, Ll/ۚ᩻ۜ;->ܽ:Ll/۠᩺᩻;

    invoke-virtual {v0, p1}, Ll/۠᩺᩻;->ܽ(Ll/ܳ᩻ۜ;)V

    :cond_0
    return-void
.end method

.method public final ᩳ(Ljava/lang/String;)Ll/ܳ᩻ۜ;
    .locals 4

    .line 89
    iget-object v0, p0, Ll/ۚ᩻ۜ;->֫:Ll/ۢ᩻ۜ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 90
    invoke-direct {p0, v0, v1}, Ll/ۚ᩻ۜ;->֫(J)V

    .line 91
    iget-object v2, p0, Ll/ۚ᩻ۜ;->ܳ:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳ᩻ۜ;

    if-nez v2, :cond_0

    .line 93
    invoke-virtual {p0, p1}, Ll/ۚ᩻ۜ;->ۧ(Ljava/lang/String;)Ll/ܳ᩻ۜ;

    move-result-object p1

    return-object p1

    .line 95
    :cond_0
    invoke-direct {p0, v2}, Ll/ۚ᩻ۜ;->ᩳ(Ll/ܳ᩻ۜ;)V

    .line 117
    iput-wide v0, v2, Ll/ܳ᩻ۜ;->ܺ:J

    .line 149
    :try_start_0
    iget-object p1, p0, Ll/ۚ᩻ۜ;->ܿ:Ll/۠᩷ۜ;

    iget-object v3, v2, Ll/ܳ᩻ۜ;->ۜ:Ll/ܶ᩵ܿ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v0, v1}, Ll/۠᩷ۜ;->֫(Ll/ܶ᩵ܿ;J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v2
.end method
