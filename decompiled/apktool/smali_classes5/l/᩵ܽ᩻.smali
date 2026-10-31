.class public Ll/᩵ܽ᩻;
.super Ll/ܽ۟ܳ;
.source "G7BL"


# instance fields
.field public ᩻ۧ:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ll/ܽ۟ܳ;-><init>()V

    return-void
.end method

.method private ۛ֫()Ljava/util/ArrayList;
    .locals 5

    .line 153
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    const-string v1, "ARG_PATHS"

    .line 141
    invoke-virtual {p0, v1}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 154
    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    .line 155
    invoke-static {v4}, Ll/ᩴ᩵ۢ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 157
    :cond_0
    invoke-direct {p0}, Ll/᩵ܽ᩻;->ۨ֫()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 158
    invoke-static {v2}, Ll/ᩴ᩵ۢ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 160
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v1
.end method

.method private ۨ֫()Ljava/util/ArrayList;
    .locals 8

    .line 167
    invoke-direct {p0}, Ll/᩵ܽ᩻;->ܰ֫()Ljava/util/Map;

    move-result-object v0

    .line 168
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    const-string v2, "ARG_PATHS"

    .line 141
    invoke-virtual {p0, v2}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 169
    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    aget-object v5, v2, v4

    .line 170
    invoke-static {v5}, Ll/ᩴ᩵ۢ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֨۬ܳ;

    if-nez v5, :cond_0

    goto :goto_1

    .line 174
    :cond_0
    invoke-virtual {v5}, Ll/֨۬ܳ;->ܺ()Ljava/lang/String;

    move-result-object v6

    .line 175
    invoke-virtual {v5}, Ll/֨۬ܳ;->ۘ()Z

    move-result v5

    if-eqz v5, :cond_1

    const-string v5, "/"

    invoke-virtual {v6, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_1

    .line 176
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 178
    :cond_1
    invoke-virtual {v1, v6}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 180
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method private ܰ֫()Ljava/util/Map;
    .locals 6

    .line 207
    iget-object v0, p0, Ll/ܽ۟ܳ;->۫֫:Ll/ܶ۬ܳ;

    if-nez v0, :cond_0

    .line 208
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    return-object v0

    .line 210
    :cond_0
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v1, "ARG_PATHS"

    .line 141
    invoke-virtual {p0, v1}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 211
    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    .line 212
    invoke-static {v4}, Ll/ᩴ᩵ۢ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 214
    :cond_1
    iget-object v1, p0, Ll/ܽ۟ܳ;->۫֫:Ll/ܶ۬ܳ;

    invoke-virtual {v1}, Ll/ܶ۬ܳ;->ܺ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨۬ܳ;

    .line 215
    invoke-virtual {v2}, Ll/֨۬ܳ;->᩷()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/ᩴ᩵ۢ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 216
    invoke-interface {v0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 217
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 220
    :cond_3
    iget-object v1, p0, Ll/ܽ۟ܳ;->۫֫:Ll/ܶ۬ܳ;

    invoke-virtual {v1}, Ll/ܶ۬ܳ;->ۖ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨۬ܳ;

    .line 221
    invoke-virtual {v2}, Ll/֨۬ܳ;->᩷()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/ᩴ᩵ۢ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 222
    invoke-interface {v0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {v0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_4

    .line 223
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_5
    return-object v0
.end method

.method private declared-synchronized ᩳ(Ll/ܿ۠ۢ;)V
    .locals 10

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 233
    :try_start_0
    iget-boolean v1, p0, Ll/᩵ܽ᩻;->᩻ۧ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 234
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 236
    :try_start_1
    iput-boolean v1, p0, Ll/᩵ܽ᩻;->᩻ۧ:Z

    const-string v1, "remoteTaskId"

    .line 237
    invoke-virtual {p0, v1}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 238
    invoke-static {}, Ll/۠᩵ۢ;->֫()Ll/۠᩵ۢ;

    move-result-object v2

    .line 143
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    const-string v4, "sourcePath"

    .line 144
    invoke-virtual {p0, v4}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/ᩴ᩵ۢ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    const-string v4, "targetPath"

    .line 145
    invoke-virtual {p0, v4}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/ᩴ᩵ۢ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 146
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 243
    invoke-direct {p0}, Ll/᩵ܽ᩻;->ۛ֫()Ljava/util/ArrayList;

    move-result-object v7

    .line 244
    invoke-virtual {p1}, Ll/ܿ۠ۢ;->ᩳ()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-direct {p0}, Ll/᩵ܽ᩻;->᩺֫()Ljava/util/ArrayList;

    move-result-object v1

    :goto_0
    move-object v8, v1

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_1
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_0

    .line 245
    :goto_1
    invoke-virtual {p1}, Ll/ܿ۠ۢ;->ᩳ()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-direct {p0}, Ll/᩵ܽ᩻;->ۨ֫()Ljava/util/ArrayList;

    move-result-object v1

    :goto_2
    move-object v9, v1

    goto :goto_3

    :cond_2
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_2

    :goto_3
    move-object v4, p0

    move-object v5, p1

    .line 238
    invoke-virtual/range {v2 .. v9}, Ll/۠᩵ۢ;->֫(Ljava/lang/String;Ll/᩶ܶۢ;Ll/ܿ۠ۢ;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 247
    monitor-exit v0

    return-void

    :goto_4
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method private ᩺֫()Ljava/util/ArrayList;
    .locals 9

    .line 187
    invoke-direct {p0}, Ll/᩵ܽ᩻;->ܰ֫()Ljava/util/Map;

    move-result-object v0

    .line 188
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const-string v2, "ARG_PATHS"

    .line 141
    invoke-virtual {p0, v2}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 189
    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v2, v4

    .line 190
    invoke-static {v5}, Ll/ᩴ᩵ۢ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 191
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/֨۬ܳ;

    if-nez v6, :cond_0

    goto :goto_1

    .line 195
    :cond_0
    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v8, "from"

    .line 196
    invoke-interface {v7, v8, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    invoke-virtual {v6}, Ll/֨۬ܳ;->ܺ()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ll/ᩴ᩵ۢ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "to"

    invoke-interface {v7, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method


# virtual methods
.method public final ֫(Ljava/lang/Exception;)Ll/ܿ۠ۢ;
    .locals 0

    .line 350
    invoke-static {p1}, Ll/ܿ۠ۢ;->֫(Ljava/lang/Exception;)Ll/ܿ۠ۢ;

    move-result-object p1

    .line 81
    invoke-direct {p0, p1}, Ll/᩵ܽ᩻;->ᩳ(Ll/ܿ۠ۢ;)V

    return-object p1
.end method

.method public final ֫(J)V
    .locals 0

    .line 126
    invoke-super {p0, p1, p2}, Ll/᩶ܶۢ;->֫(J)V

    .line 127
    invoke-static {}, Ll/۠᩵ۢ;->֫()Ll/۠᩵ۢ;

    move-result-object p1

    const-string p2, "remoteTaskId"

    invoke-virtual {p0, p2}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, p0}, Ll/۠᩵ۢ;->֫(Ljava/lang/String;Ll/᩶ܶۢ;)V

    return-void
.end method

.method public final ֫(Lbin/mt/plus/Main;Ll/ܽۢܳ;Ll/ܽۢܳ;Ll/ܿ۠ۢ;)V
    .locals 0

    return-void
.end method

.method public final ۢ()Ll/ܿ۠ۢ;
    .locals 1

    .line 70
    invoke-super {p0}, Ll/ܽ۟ܳ;->ۢ()Ll/ܿ۠ۢ;

    move-result-object v0

    .line 71
    invoke-direct {p0, v0}, Ll/᩵ܽ᩻;->ᩳ(Ll/ܿ۠ۢ;)V

    return-object v0
.end method

.method public final ۢ(I)V
    .locals 1

    .line 108
    invoke-super {p0, p1}, Ll/ۘ۠ۢ;->ۢ(I)V

    .line 109
    invoke-static {}, Ll/۠᩵ۢ;->֫()Ll/۠᩵ۢ;

    move-result-object p1

    const-string v0, "remoteTaskId"

    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p0}, Ll/۠᩵ۢ;->֫(Ljava/lang/String;Ll/᩶ܶۢ;)V

    return-void
.end method

.method public final ۧ(Ljava/lang/CharSequence;)V
    .locals 1

    .line 99
    invoke-super {p0, p1}, Ll/᩶ܶۢ;->ۧ(Ljava/lang/CharSequence;)V

    .line 100
    invoke-static {}, Ll/۠᩵ۢ;->֫()Ll/۠᩵ۢ;

    move-result-object p1

    const-string v0, "remoteTaskId"

    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p0}, Ll/۠᩵ۢ;->֫(Ljava/lang/String;Ll/᩶ܶۢ;)V

    return-void
.end method

.method public final ۧ(Ll/ܿ۠ۢ;)V
    .locals 0

    .line 135
    invoke-super {p0, p1}, Ll/ܽ۟ܳ;->ۧ(Ll/ܿ۠ۢ;)V

    .line 136
    invoke-direct {p0, p1}, Ll/᩵ܽ᩻;->ᩳ(Ll/ܿ۠ۢ;)V

    return-void
.end method

.method public final ۧ(Ll/᩷۫ܳ;)V
    .locals 1

    .line 117
    invoke-super {p0, p1}, Ll/᩶ܶۢ;->ۧ(Ll/᩷۫ܳ;)V

    .line 118
    invoke-static {}, Ll/۠᩵ۢ;->֫()Ll/۠᩵ۢ;

    move-result-object p1

    const-string v0, "remoteTaskId"

    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p0}, Ll/۠᩵ۢ;->֫(Ljava/lang/String;Ll/᩶ܶۢ;)V

    return-void
.end method

.method public final ܶ(Ljava/lang/String;)V
    .locals 1

    .line 90
    invoke-super {p0, p1}, Ll/ۘ۠ۢ;->ܶ(Ljava/lang/String;)V

    .line 91
    invoke-static {}, Ll/۠᩵ۢ;->֫()Ll/۠᩵ۢ;

    move-result-object p1

    const-string v0, "remoteTaskId"

    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p0}, Ll/۠᩵ۢ;->֫(Ljava/lang/String;Ll/᩶ܶۢ;)V

    return-void
.end method

.method public final ܺ()Ll/ۗܺ᩷;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ᩷()V
    .locals 4

    const-string v0, "remoteTaskId"

    .line 47
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 48
    invoke-static {}, Ll/۠᩵ۢ;->֫()Ll/۠᩵ۢ;

    move-result-object v1

    .line 49
    new-instance v2, Ll/ᩴܽ᩻;

    const/4 v3, 0x0

    .line 39
    invoke-direct {v2, v0, v1, v3}, Ll/ᩴܽ᩻;-><init>(Ljava/lang/String;Ll/۠᩵ۢ;Z)V

    .line 49
    iput-object v2, p0, Ll/ܽ۟ܳ;->ۤ֫:Ll/ۙۤܳ;

    .line 50
    invoke-virtual {v2}, Ll/ᩴܽ᩻;->ܿ֫()V

    .line 51
    iget-object v2, p0, Ll/ܽ۟ܳ;->ۤ֫:Ll/ۙۤܳ;

    check-cast v2, Ll/ᩴܽ᩻;

    invoke-virtual {v1, v0, p0, v2}, Ll/۠᩵ۢ;->֫(Ljava/lang/String;Ll/᩶ܶۢ;Ll/ᩴܽ᩻;)V

    .line 52
    invoke-super {p0}, Ll/ܽ۟ܳ;->᩷()V

    .line 53
    invoke-virtual {v1, v0, p0}, Ll/۠᩵ۢ;->֫(Ljava/lang/String;Ll/᩶ܶۢ;)V

    return-void
.end method

.method public final ᩹֫()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
