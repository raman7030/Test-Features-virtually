.class public final Ll/ۘۜ᩻;
.super Ljava/lang/Object;
.source "5AHS"


# instance fields
.field public final ֫:Ll/ۧۤᩴ;

.field public final ۧ:Ll/ܺۜ᩻;

.field public ܽ:Z

.field public final ᩳ:Ll/ۧۤᩴ;


# direct methods
.method public constructor <init>(Ll/ܺۜ᩻;Z)V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    iput-object v0, p0, Ll/ۘۜ᩻;->֫:Ll/ۧۤᩴ;

    .line 17
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    iput-object v0, p0, Ll/ۘۜ᩻;->ᩳ:Ll/ۧۤᩴ;

    .line 29
    iput-object p1, p0, Ll/ۘۜ᩻;->ۧ:Ll/ܺۜ᩻;

    .line 30
    iput-boolean p2, p0, Ll/ۘۜ᩻;->ܽ:Z

    return-void
.end method

.method private ֫(Ljava/lang/String;Ljava/util/List;Z)Ljava/util/LinkedHashMap;
    .locals 4

    .line 108
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 109
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 110
    iget-object v2, p0, Ll/ۘۜ᩻;->ۧ:Ll/ܺۜ᩻;

    invoke-interface {v2, v1}, Ll/ܺۜ᩻;->ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    if-eqz p3, :cond_1

    .line 112
    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    :cond_1
    const-string v3, "."

    .line 114
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, ".."

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 115
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 118
    :cond_2
    iget-object p2, p0, Ll/ۘۜ᩻;->֫:Ll/ۧۤᩴ;

    invoke-virtual {p2, p1, v0}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method private ܿ(Ljava/lang/String;)Ljava/lang/Object;
    .locals 6

    .line 57
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x64

    .line 81
    rem-long/2addr v0, v2

    const-wide/16 v2, 0x0

    iget-object v4, p0, Ll/ۘۜ᩻;->ᩳ:Ll/ۧۤᩴ;

    cmp-long v5, v0, v2

    if-nez v5, :cond_0

    .line 82
    invoke-virtual {v4}, Ll/ۧۤᩴ;->entrySet()Ljava/util/Set;

    move-result-object v0

    new-instance v1, Ll/ۡۜ᩻;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, v1}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 62
    :cond_0
    new-instance v0, Ll/ۢۜ᩻;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v4, p1, v0}, Ll/ᩳۤᩴ;->compute(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۖۜ᩻;

    .line 73
    iget-object p1, p1, Ll/ۖۜ᩻;->ۧ:Ljava/lang/Object;

    return-object p1
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 127
    iget-boolean v0, p0, Ll/ۘۜ᩻;->ܽ:Z

    if-eqz v0, :cond_0

    .line 128
    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p2

    .line 130
    :cond_0
    invoke-virtual {p0, p1}, Ll/ۘۜ᩻;->ᩳ(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()V
    .locals 2

    move-object v0, p0

    .line 167
    monitor-enter v0

    .line 168
    :try_start_0
    iget-object v1, p0, Ll/ۘۜ᩻;->֫:Ll/ۧۤᩴ;

    invoke-virtual {v1}, Ll/ۧۤᩴ;->clear()V

    .line 169
    iget-object v1, p0, Ll/ۘۜ᩻;->ᩳ:Ll/ۧۤᩴ;

    invoke-virtual {v1}, Ll/ۧۤᩴ;->clear()V

    .line 170
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    .line 157
    invoke-static {p1}, Ll/ܽ᩷ܳ;->᩻(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 158
    iget-boolean v0, p0, Ll/ۘۜ᩻;->ܽ:Z

    if-eqz v0, :cond_0

    .line 159
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    .line 161
    :cond_0
    invoke-direct {p0, p1}, Ll/ۘۜ᩻;->ܿ(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 162
    :try_start_0
    iget-object v1, p0, Ll/ۘۜ᩻;->֫:Ll/ۧۤᩴ;

    invoke-virtual {v1, p1}, Ll/ۧۤᩴ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫(Z)V
    .locals 1

    .line 188
    iget-boolean v0, p0, Ll/ۘۜ᩻;->ܽ:Z

    if-eq v0, p1, :cond_0

    .line 189
    iput-boolean p1, p0, Ll/ۘۜ᩻;->ܽ:Z

    .line 190
    invoke-virtual {p0}, Ll/ۘۜ᩻;->֫()V

    :cond_0
    return-void
.end method

.method public final ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 195
    invoke-static {p1}, Ll/ۢۤۡ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 196
    invoke-static {p1}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v0, :cond_0

    return-object p1

    .line 200
    :cond_0
    invoke-virtual {p0, v0}, Ll/ۘۜ᩻;->֫(Ljava/lang/String;)V

    .line 138
    invoke-virtual {p0, v0, v1}, Ll/ۘۜ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_4

    const/16 p1, 0x2e

    .line 202
    invoke-virtual {v1, p1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result p1

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-ne p1, v2, :cond_1

    const-string p1, ""

    goto :goto_0

    .line 209
    :cond_1
    invoke-virtual {v1, v3, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 210
    invoke-virtual {v1, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    move-object v1, v2

    .line 213
    :goto_0
    sget-object v2, Ll/ܶ᩵ܿ;->᩹:Ljava/util/regex/Pattern;

    invoke-virtual {v2, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    .line 214
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    const/4 v4, 0x2

    .line 217
    :try_start_0
    invoke-virtual {v2, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    .line 218
    invoke-virtual {v2, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    const-string v2, " ("

    .line 0
    invoke-static {v1, v2}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, ")"

    invoke-static {v2, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_1
    add-int/2addr v3, v5

    .line 227
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 138
    invoke-virtual {p0, v0, v2}, Ll/ۘۜ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_3

    goto :goto_1

    :cond_3
    move-object v1, v2

    .line 0
    :cond_4
    invoke-static {v0, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ܽ(Ljava/lang/String;)Z
    .locals 1

    .line 123
    invoke-static {p1}, Ll/ۢۤۡ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Ll/ۘۜ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 143
    iget-object v0, p0, Ll/ۘۜ᩻;->ۧ:Ll/ܺۜ᩻;

    invoke-interface {v0, p1}, Ll/ܺۜ᩻;->֫(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩳ(Ljava/lang/String;)Ljava/util/Map;
    .locals 5

    .line 87
    iget-boolean v1, p0, Ll/ۘۜ᩻;->ܽ:Z

    .line 88
    invoke-static {p1}, Ll/ܽ᩷ܳ;->᩻(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz v1, :cond_0

    .line 89
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    goto :goto_0

    :cond_0
    move-object v2, p1

    .line 92
    :goto_0
    invoke-direct {p0, v2}, Ll/ۘۜ᩻;->ܿ(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 93
    :try_start_0
    iget-object v3, p0, Ll/ۘۜ᩻;->֫:Ll/ۧۤᩴ;

    invoke-virtual {v3, v2}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    if-eqz v3, :cond_1

    .line 95
    monitor-exit v0

    return-object v3

    .line 97
    :cond_1
    iget-object v3, p0, Ll/ۘۜ᩻;->ۧ:Ll/ܺۜ᩻;

    invoke-interface {v3, p1}, Ll/ܺۜ᩻;->֫(Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    .line 98
    iget-boolean v4, p0, Ll/ۘۜ᩻;->ܽ:Z

    if-eq v4, v1, :cond_3

    if-eqz v4, :cond_2

    .line 100
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    :cond_2
    move-object v2, p1

    move v1, v4

    .line 102
    :cond_3
    invoke-direct {p0, v2, v3, v1}, Ll/ۘۜ᩻;->֫(Ljava/lang/String;Ljava/util/List;Z)Ljava/util/LinkedHashMap;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 103
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
