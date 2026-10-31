.class public final Ll/᩺ۜ᩵;
.super Ll/ۧۤᩴ;
.source "AA2F"


# static fields
.field public static final serialVersionUID:J = 0x29fa0881c54e5a5bL

.field public static ᩸:Ll/֫᩻֨;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 48
    const-class v0, Ll/᩺ۜ᩵;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/String;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/᩺ۜ᩵;->᩸:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x400

    .line 75
    invoke-direct {p0, v0}, Ll/ۧۤᩴ;-><init>(I)V

    return-void
.end method

.method private ۧ(Ljava/lang/String;)Ljava/util/Collection;
    .locals 0

    if-eqz p1, :cond_0

    .line 125
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 86
    new-instance v0, Ll/᩺ۜ᩵;

    .line 63
    invoke-virtual {p0}, Ll/ۧۤᩴ;->size()I

    move-result v1

    .line 75
    invoke-direct {v0, v1}, Ll/ۧۤᩴ;-><init>(I)V

    .line 65
    invoke-virtual {v0, p0}, Ll/ۧۤᩴ;->putAll(Ljava/util/Map;)V

    return-object v0
.end method

.method public final declared-synchronized toString()Ljava/lang/String;
    .locals 7

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 279
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v1, 0x7d0

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "\n\t---- cache ----"

    .line 280
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    invoke-virtual {p0}, Ll/ۧۤᩴ;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    const-string v4, "\n\n\t\tname \'"

    .line 282
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x27

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 283
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/util/List;

    if-eqz v4, :cond_1

    .line 284
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    move-object v1, v4

    .line 285
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 286
    :try_start_1
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܰۜ᩵;

    const-string v6, "\n\t\t\t"

    .line 287
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ll/ܰۜ᩵;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 289
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v2

    :cond_1
    const-string v1, " : no entries"

    .line 291
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 294
    :cond_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    return-object v1

    :catchall_1
    move-exception v1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v1
.end method

.method public final ֫(Ljava/lang/String;)Ljava/util/List;
    .locals 2

    .line 113
    invoke-direct {p0, p1}, Ll/᩺ۜ᩵;->ۧ(Ljava/lang/String;)Ljava/util/Collection;

    move-result-object p1

    if-eqz p1, :cond_0

    move-object v0, p1

    .line 115
    monitor-enter v0

    .line 116
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 117
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 119
    :cond_0
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;Ll/ۨۢ᩵;Ll/ۛۢ᩵;)Ll/ܰۜ᩵;
    .locals 4

    .line 162
    invoke-direct {p0, p1}, Ll/᩺ۜ᩵;->ۧ(Ljava/lang/String;)Ljava/util/Collection;

    move-result-object p1

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    move-object v0, p1

    .line 164
    monitor-enter v0

    .line 165
    :try_start_0
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰۜ᩵;

    .line 108
    invoke-virtual {v2}, Ll/ܰۜ᩵;->ᩳ()Ll/ۨۢ᩵;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 166
    invoke-virtual {v2, p3}, Ll/ܰۜ᩵;->֫(Ll/ۛۢ᩵;)Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v1, v2

    .line 171
    :cond_1
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_2
    return-object v1
.end method

.method public final ֫()V
    .locals 3

    .line 301
    sget-object v0, Ll/᩺ۜ᩵;->᩸:Ll/֫᩻֨;

    invoke-interface {v0}, Ll/֫᩻֨;->ܽ()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    const-string v1, "Cached DNSEntries: {}"

    .line 305
    invoke-virtual {p0}, Ll/᩺ۜ᩵;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Ll/֫᩻֨;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ll/᩹᩷᩵;)V
    .locals 2

    if-eqz p1, :cond_1

    .line 211
    invoke-virtual {p1}, Ll/ܰۜ᩵;->֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_0

    .line 213
    invoke-virtual {p1}, Ll/ܰۜ᩵;->֫()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, v0, v1}, Ll/ۧۤᩴ;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    invoke-virtual {p1}, Ll/ܰۜ᩵;->֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    :cond_0
    move-object v1, v0

    move-object v0, v1

    .line 216
    monitor-enter v0

    .line 217
    :try_start_0
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 218
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    return-void
.end method

.method public final ۧ(Ljava/lang/String;Ll/ۨۢ᩵;Ll/ۛۢ᩵;)Ljava/util/List;
    .locals 4

    .line 185
    invoke-direct {p0, p1}, Ll/᩺ۜ᩵;->ۧ(Ljava/lang/String;)Ljava/util/Collection;

    move-result-object p1

    if-eqz p1, :cond_3

    move-object v0, p1

    .line 187
    monitor-enter v0

    .line 188
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 189
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 190
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰۜ᩵;

    .line 108
    invoke-virtual {v2}, Ll/ܰۜ᩵;->ᩳ()Ll/ۨۢ᩵;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 191
    invoke-virtual {v2, p3}, Ll/ܰۜ᩵;->֫(Ll/ۛۢ᩵;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 192
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 195
    :cond_2
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 197
    :cond_3
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public final ۧ(Ll/᩹᩷᩵;)Ll/ܰۜ᩵;
    .locals 5

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 137
    invoke-virtual {p1}, Ll/ܰۜ᩵;->֫()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/᩺ۜ᩵;->ۧ(Ljava/lang/String;)Ljava/util/Collection;

    move-result-object v2

    if-eqz v2, :cond_2

    move-object v0, v2

    .line 139
    monitor-enter v0

    .line 140
    :try_start_0
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܰۜ᩵;

    .line 141
    invoke-virtual {v3, p1}, Ll/ܰۜ᩵;->֫(Ll/ܰۜ᩵;)Z

    move-result v4

    if-eqz v4, :cond_0

    move-object v1, v3

    .line 146
    :cond_1
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_2
    return-object v1
.end method

.method public final ܽ(Ll/᩹᩷᩵;)V
    .locals 3

    .line 234
    invoke-virtual {p1}, Ll/ܰۜ᩵;->֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_0

    move-object v0, v1

    .line 236
    monitor-enter v0

    .line 237
    :try_start_0
    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-result v2

    .line 238
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_1

    .line 241
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 242
    invoke-virtual {p1}, Ll/ܰۜ᩵;->֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۧۤᩴ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method
