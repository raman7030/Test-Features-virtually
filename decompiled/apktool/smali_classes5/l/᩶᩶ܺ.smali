.class public Ll/᩶᩶ܺ;
.super Ll/ᩴۤܺ;
.source "O3K3"


# instance fields
.field public final synthetic ۙ:Ll/ܽۙܺ;

.field public final transient ᩶:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ll/ܽۙܺ;Ljava/util/Map;)V
    .locals 0

    .line 1297
    iput-object p1, p0, Ll/᩶᩶ܺ;->ۙ:Ll/ܽۙܺ;

    .line 3544
    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    .line 1298
    iput-object p2, p0, Ll/᩶᩶ܺ;->᩶:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 5

    .line 1365
    iget-object v0, p0, Ll/᩶᩶ܺ;->ۙ:Ll/ܽۙܺ;

    invoke-static {v0}, Ll/ܽۙܺ;->֫(Ll/ܽۙܺ;)Ljava/util/Map;

    move-result-object v1

    iget-object v2, p0, Ll/᩶᩶ܺ;->᩶:Ljava/util/Map;

    if-ne v2, v1, :cond_0

    .line 1366
    invoke-virtual {v0}, Ll/ܽۙܺ;->clear()V

    return-void

    .line 1410
    :cond_0
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 1415
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1420
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 1421
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    .line 1422
    invoke-virtual {p0, v2}, Ll/᩶᩶ܺ;->֫(Ljava/util/Map$Entry;)Ljava/util/AbstractMap$SimpleImmutableEntry;

    if-eqz v3, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    const-string v4, "no calls to next() since the last call to remove()"

    .line 1427
    invoke-static {v4, v2}, Ll/ۘܶܺ;->ۧ(Ljava/lang/String;Z)V

    .line 1428
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 1429
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v2

    invoke-static {v0, v2}, Ll/ܽۙܺ;->ۧ(Ll/ܽۙܺ;I)V

    .line 1430
    invoke-interface {v3}, Ljava/util/Collection;->clear()V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 1

    .line 902
    iget-object v0, p0, Ll/᩶᩶ܺ;->᩶:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3635
    :try_start_0
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p0, p1, :cond_1

    .line 1350
    iget-object v0, p0, Ll/᩶᩶ܺ;->᩶:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 902
    iget-object v0, p0, Ll/᩶᩶ܺ;->᩶:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    .line 3622
    :try_start_0
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v0, v1

    .line 1315
    :goto_0
    check-cast v0, Ljava/util/Collection;

    if-nez v0, :cond_0

    goto :goto_2

    .line 1321
    :cond_0
    iget-object v2, p0, Ll/᩶᩶ܺ;->ۙ:Ll/ܽۙܺ;

    check-cast v2, Ll/۠᩶ܺ;

    .line 68
    check-cast v0, Ljava/util/List;

    .line 309
    instance-of v3, v0, Ljava/util/RandomAccess;

    if-eqz v3, :cond_1

    .line 310
    new-instance v3, Ll/ۛ᩶ܺ;

    .line 912
    invoke-direct {v3, v2, p1, v0, v1}, Ll/ۧۙܺ;-><init>(Ll/ܽۙܺ;Ljava/lang/Object;Ljava/util/List;Ll/۟᩶ܺ;)V

    goto :goto_1

    .line 311
    :cond_1
    new-instance v3, Ll/ۧۙܺ;

    invoke-direct {v3, v2, p1, v0, v1}, Ll/ۧۙܺ;-><init>(Ll/ܽۙܺ;Ljava/lang/Object;Ljava/util/List;Ll/۟᩶ܺ;)V

    :goto_1
    move-object v1, v3

    :goto_2
    return-object v1
.end method

.method public final hashCode()I
    .locals 1

    .line 1355
    iget-object v0, p0, Ll/᩶᩶ܺ;->᩶:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->hashCode()I

    move-result v0

    return v0
.end method

.method public keySet()Ljava/util/Set;
    .locals 1

    .line 1326
    iget-object v0, p0, Ll/᩶᩶ܺ;->ۙ:Ll/ܽۙܺ;

    invoke-virtual {v0}, Ll/ܳۙܺ;->ܿ()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1336
    iget-object v0, p0, Ll/᩶᩶ܺ;->᩶:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1341
    :cond_0
    iget-object v0, p0, Ll/᩶᩶ܺ;->ۙ:Ll/ܽۙܺ;

    invoke-virtual {v0}, Ll/ܽۙܺ;->᩻()Ljava/util/Collection;

    move-result-object v1

    .line 1342
    invoke-interface {v1, p1}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    .line 1343
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v2

    invoke-static {v0, v2}, Ll/ܽۙܺ;->ۧ(Ll/ܽۙܺ;I)V

    .line 1344
    invoke-interface {p1}, Ljava/util/Collection;->clear()V

    return-object v1
.end method

.method public final size()I
    .locals 1

    .line 1331
    iget-object v0, p0, Ll/᩶᩶ܺ;->᩶:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1360
    iget-object v0, p0, Ll/᩶᩶ܺ;->᩶:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/util/Map$Entry;)Ljava/util/AbstractMap$SimpleImmutableEntry;
    .locals 4

    .line 1373
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    .line 1374
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    iget-object v1, p0, Ll/᩶᩶ܺ;->ۙ:Ll/ܽۙܺ;

    check-cast v1, Ll/۠᩶ܺ;

    .line 68
    check-cast p1, Ljava/util/List;

    .line 309
    instance-of v2, p1, Ljava/util/RandomAccess;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    .line 310
    new-instance v2, Ll/ۛ᩶ܺ;

    .line 912
    invoke-direct {v2, v1, v0, p1, v3}, Ll/ۧۙܺ;-><init>(Ll/ܽۙܺ;Ljava/lang/Object;Ljava/util/List;Ll/۟᩶ܺ;)V

    goto :goto_0

    .line 311
    :cond_0
    new-instance v2, Ll/ۧۙܺ;

    invoke-direct {v2, v1, v0, p1, v3}, Ll/ۧۙܺ;-><init>(Ll/ܽۙܺ;Ljava/lang/Object;Ljava/util/List;Ll/۟᩶ܺ;)V

    .line 1442
    :goto_0
    new-instance p1, Ljava/util/AbstractMap$SimpleImmutableEntry;

    invoke-direct {p1, v0, v2}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method
