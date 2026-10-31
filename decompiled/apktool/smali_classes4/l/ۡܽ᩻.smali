.class public Ll/ۡܽ᩻;
.super Ll/ۡ᩺ܳ;
.source "I7BK"


# instance fields
.field public ۜۧ:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ll/ۡ᩺ܳ;-><init>()V

    return-void
.end method

.method private ۛ֫()Ljava/util/List;
    .locals 6

    .line 166
    iget-object v0, p0, Ll/ۡ᩺ܳ;->۫֫:Ll/ܶ۬ܳ;

    if-nez v0, :cond_0

    .line 167
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0

    :cond_0
    const-string v0, "targetPath"

    .line 169
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ᩴ᩵ۢ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 170
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    const-string v2, "ARG_PATHS"

    .line 141
    invoke-virtual {p0, v2}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 171
    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v2, v4

    .line 172
    invoke-interface {v1, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 174
    :cond_1
    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 175
    iget-object v3, p0, Ll/ۡ᩺ܳ;->۫֫:Ll/ܶ۬ܳ;

    invoke-virtual {v3}, Ll/ܶ۬ܳ;->ܺ()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֨۬ܳ;

    .line 176
    invoke-virtual {v4}, Ll/֨۬ܳ;->᩷()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v4}, Ll/֨۬ܳ;->ۢ()Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_3

    goto :goto_1

    .line 179
    :cond_3
    invoke-virtual {v4}, Ll/֨۬ܳ;->ۢ()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 180
    invoke-static {v0, v5}, Ll/ۢۤۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 181
    invoke-virtual {v4}, Ll/֨۬ܳ;->ۘ()Z

    move-result v4

    if-eqz v4, :cond_4

    const-string v4, "/"

    .line 0
    invoke-static {v5, v4}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 184
    :cond_4
    invoke-virtual {v2, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 186
    :cond_5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method private declared-synchronized ᩳ(Ll/ܿ۠ۢ;)V
    .locals 10

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 193
    :try_start_0
    iget-boolean v1, p0, Ll/ۡܽ᩻;->ۜۧ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 194
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 196
    :try_start_1
    iput-boolean v1, p0, Ll/ۡܽ᩻;->ۜۧ:Z

    const-string v1, "remoteTaskId"

    .line 197
    invoke-virtual {p0, v1}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 198
    invoke-static {}, Ll/۠᩵ۢ;->֫()Ll/۠᩵ۢ;

    move-result-object v2

    .line 145
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    const-string v4, "sourcePath"

    .line 146
    invoke-virtual {p0, v4}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/ᩴ᩵ۢ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    const-string v4, "targetPath"

    .line 147
    invoke-virtual {p0, v4}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/ᩴ᩵ۢ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 148
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 155
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 156
    invoke-direct {p0}, Ll/ۡܽ᩻;->ۛ֫()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 157
    invoke-static {v5}, Ll/ᩴ᩵ۢ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 159
    :cond_1
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 204
    sget-object v8, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 205
    invoke-virtual {p1}, Ll/ܿ۠ۢ;->ᩳ()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-direct {p0}, Ll/ۡܽ᩻;->ۛ֫()Ljava/util/List;

    move-result-object v1

    move-object v9, v1

    goto :goto_1

    :cond_2
    move-object v9, v8

    :goto_1
    move-object v4, p0

    move-object v5, p1

    .line 198
    invoke-virtual/range {v2 .. v9}, Ll/۠᩵ۢ;->֫(Ljava/lang/String;Ll/᩶ܶۢ;Ll/ܿ۠ۢ;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 207
    monitor-exit v0

    return-void

    :goto_2
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method


# virtual methods
.method public final ֫(Ljava/lang/Exception;)Ll/ܿ۠ۢ;
    .locals 0

    .line 350
    invoke-static {p1}, Ll/ܿ۠ۢ;->֫(Ljava/lang/Exception;)Ll/ܿ۠ۢ;

    move-result-object p1

    .line 83
    invoke-direct {p0, p1}, Ll/ۡܽ᩻;->ᩳ(Ll/ܿ۠ۢ;)V

    return-object p1
.end method

.method public final ֫(J)V
    .locals 0

    .line 128
    invoke-super {p0, p1, p2}, Ll/᩶ܶۢ;->֫(J)V

    .line 129
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

    .line 72
    invoke-super {p0}, Ll/ۡ᩺ܳ;->ۢ()Ll/ܿ۠ۢ;

    move-result-object v0

    .line 73
    invoke-direct {p0, v0}, Ll/ۡܽ᩻;->ᩳ(Ll/ܿ۠ۢ;)V

    return-object v0
.end method

.method public final ۢ(I)V
    .locals 1

    .line 110
    invoke-super {p0, p1}, Ll/ۘ۠ۢ;->ۢ(I)V

    .line 111
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

    .line 101
    invoke-super {p0, p1}, Ll/᩶ܶۢ;->ۧ(Ljava/lang/CharSequence;)V

    .line 102
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

    .line 137
    invoke-super {p0, p1}, Ll/ۡ᩺ܳ;->ۧ(Ll/ܿ۠ۢ;)V

    .line 138
    invoke-direct {p0, p1}, Ll/ۡܽ᩻;->ᩳ(Ll/ܿ۠ۢ;)V

    return-void
.end method

.method public final ۧ(Ll/᩷۫ܳ;)V
    .locals 1

    .line 119
    invoke-super {p0, p1}, Ll/᩶ܶۢ;->ۧ(Ll/᩷۫ܳ;)V

    .line 120
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

    .line 92
    invoke-super {p0, p1}, Ll/ۘ۠ۢ;->ܶ(Ljava/lang/String;)V

    .line 93
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

    .line 49
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 50
    invoke-static {}, Ll/۠᩵ۢ;->֫()Ll/۠᩵ۢ;

    move-result-object v1

    .line 52
    new-instance v2, Ll/ᩴܽ᩻;

    const-string v3, "replacedName"

    invoke-virtual {p0, v3}, Ll/ۘ۠ۢ;->۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-direct {v2, v0, v1, v3}, Ll/ᩴܽ᩻;-><init>(Ljava/lang/String;Ll/۠᩵ۢ;Z)V

    iput-object v2, p0, Ll/ۡ᩺ܳ;->ۤ֫:Ll/ۙۤܳ;

    .line 53
    invoke-virtual {v1, v0, p0, v2}, Ll/۠᩵ۢ;->֫(Ljava/lang/String;Ll/᩶ܶۢ;Ll/ᩴܽ᩻;)V

    .line 54
    invoke-super {p0}, Ll/ۡ᩺ܳ;->᩷()V

    .line 55
    invoke-virtual {v1, v0, p0}, Ll/۠᩵ۢ;->֫(Ljava/lang/String;Ll/᩶ܶۢ;)V

    return-void
.end method
