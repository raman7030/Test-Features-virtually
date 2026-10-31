.class public Ll/ܶۖ֨;
.super Ll/ܳۖ֨;
.source "Z7SD"


# instance fields
.field public ֫:Ll/ۗ֨۠;


# direct methods
.method public static ֫(Ll/ۗ֨۠;)Ll/ܳۖ֨;
    .locals 2

    .line 83
    const-class v0, Ll/ܳۖ֨;

    invoke-virtual {p0, v0}, Ll/ۗ֨۠;->֫(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳۖ֨;

    if-nez v1, :cond_0

    .line 85
    new-instance v1, Ll/ܶۖ֨;

    .line 89
    invoke-direct {v1}, Ll/ܳۖ֨;-><init>()V

    .line 90
    iput-object p0, v1, Ll/ܶۖ֨;->֫:Ll/ۗ֨۠;

    .line 91
    invoke-static {p0}, Ll/ۨܶ۠;->֫(Ll/ۗ֨۠;)Ll/ۨܶ۠;

    .line 93
    iget-object p0, v1, Ll/ܶۖ֨;->֫:Ll/ۗ֨۠;

    invoke-virtual {p0, v0, v1}, Ll/ۗ֨۠;->֫(Ljava/lang/Class;Ljava/lang/Object;)V

    :cond_0
    return-object v1
.end method


# virtual methods
.method public call()Ljava/lang/Boolean;
    .locals 1

    .line 187
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    .line 77
    invoke-virtual {p0}, Ll/ܶۖ֨;->call()Ljava/lang/Boolean;

    const/4 v0, 0x0

    throw v0
.end method

.method public final ֫(Ljava/util/Set;)V
    .locals 8

    .line 200
    iget-object v0, p0, Ll/ܶۖ֨;->֫:Ll/ۗ֨۠;

    const-class v1, Ll/ۛۘ۠;

    invoke-virtual {v0, v1}, Ll/ۗ֨۠;->֫(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛۘ۠;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 203
    invoke-interface {v0}, Ll/ۛۘ۠;->֫֫()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۤۘ۠;

    .line 205
    invoke-interface {p1}, Ll/ۤۘ۠;->֫()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v2, Ll/۠ܶ᩷;

    const/4 v3, 0x5

    invoke-direct {v2, v3}, Ll/۠ܶ᩷;-><init>(I)V

    .line 206
    invoke-interface {v0, v2}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    .line 207
    invoke-interface {v0}, Ll/ܿ᩺ᩴ;->toList()Ljava/util/List;

    move-result-object v0

    .line 209
    :try_start_0
    invoke-interface {p1}, Ll/ۤۘ۠;->ۧ()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩻ۖ֨;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 255
    invoke-interface {p1}, Ll/᩻ۖ֨;->init()V

    throw v1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    .line 211
    new-instance v0, Ll/ܽ᩸۠;

    .line 43
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 211
    throw v0

    .line 216
    :cond_1
    :goto_0
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0, p1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 217
    iget-object p1, p0, Ll/ܶۖ֨;->֫:Ll/ۗ֨۠;

    invoke-static {p1}, Ll/֨ᩴ۠;->֫(Ll/ۗ֨۠;)Ll/֨ᩴ۠;

    move-result-object p1

    .line 218
    invoke-virtual {p1}, Ll/֨ᩴ۠;->ۜ()Ljava/util/ServiceLoader;

    move-result-object p1

    .line 219
    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 220
    invoke-virtual {p1}, Ljava/util/ServiceLoader;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩻ۖ֨;

    .line 221
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۖܶ۠;

    const-string v6, "doclint-not-available"

    .line 225
    iget-object v7, v5, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_1

    .line 226
    :cond_3
    invoke-interface {v0, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 227
    invoke-interface {v2, v3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 229
    :try_start_1
    iget-object p1, v5, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    .line 218
    invoke-virtual {p1}, Ll/ۖܶ۠;->ۧ()I

    move-result v0

    .line 229
    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {p1, v0}, Ll/ۖܶ۠;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    .line 255
    invoke-interface {v3}, Ll/᩻ۖ֨;->init()V

    throw v1
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    move-exception p1

    .line 231
    new-instance v0, Ll/ܽ᩸۠;

    .line 43
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 231
    throw v0

    .line 237
    :cond_4
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖܶ۠;

    .line 238
    iget-object v3, p0, Ll/ܶۖ֨;->֫:Ll/ۗ֨۠;

    invoke-static {v3}, Ll/᩹ܶ۠;->֫(Ll/ۗ֨۠;)Ll/᩹ܶ۠;

    move-result-object v3

    iget-object v0, v0, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    sget-object v4, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 3114
    new-instance v4, Ll/۫۠۠;

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v0, v5, v6

    const-string v0, "compiler"

    const-string v6, "plugin.not.found"

    invoke-direct {v4, v0, v6, v5}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    invoke-virtual {v3, v4}, Ll/ۖ֨۠;->֫(Ll/۫۠۠;)V

    goto :goto_2

    .line 240
    :cond_5
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_6

    return-void

    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩻ۖ֨;

    .line 255
    :try_start_2
    invoke-interface {p1}, Ll/᩻ۖ֨;->init()V

    throw v1
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    move-exception p1

    .line 244
    new-instance v0, Ll/ܽ᩸۠;

    .line 43
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 244
    throw v0
.end method

.method public final ֫(Ll/ۖܶ۠;)V
    .locals 2

    .line 259
    invoke-virtual {p1}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 262
    :cond_0
    :try_start_0
    invoke-static {}, Ll/֨ۖ֨;->֫()Ll/֨ۖ֨;

    move-result-object v0

    .line 218
    invoke-virtual {p1}, Ll/ۖܶ۠;->ۧ()I

    move-result v1

    .line 262
    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {p1, v1}, Ll/ۖܶ۠;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    invoke-interface {v0}, Ll/᩻ۖ֨;->init()V

    const/4 p1, 0x0

    throw p1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 265
    :catch_0
    iget-object p1, p0, Ll/ܶۖ֨;->֫:Ll/ۗ֨۠;

    invoke-static {p1}, Ll/᩹ܶ۠;->֫(Ll/ۗ֨۠;)Ll/᩹ܶ۠;

    move-result-object p1

    sget-object v0, Ll/ܰᩴ۠;->ܿ:Ll/ۧܶ۠;

    invoke-virtual {p1, v0}, Ll/ۖ֨۠;->֫(Ll/ۧܶ۠;)V

    return-void
.end method
