.class public final Ll/ۨ۬ܺ;
.super Ll/ۘ۬ܺ;
.source "C3A0"


# virtual methods
.method public final ֫()Ll/ܰ۬ܺ;
    .locals 6

    .line 398
    iget-object v0, p0, Ll/ۘ۬ܺ;->֫:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 158
    sget-object v0, Ll/֡ۗܺ;->۫:Ll/֡ۗܺ;

    return-object v0

    .line 401
    :cond_0
    check-cast v0, Ll/ܽۗܺ;

    invoke-virtual {v0}, Ll/ܽۗܺ;->entrySet()Ljava/util/Set;

    move-result-object v0

    .line 487
    move-object v1, v0

    check-cast v1, Ljava/util/AbstractCollection;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 158
    sget-object v0, Ll/֡ۗܺ;->۫:Ll/֡ۗܺ;

    return-object v0

    .line 490
    :cond_1
    new-instance v1, Ll/ۜ۬ܺ;

    .line 491
    check-cast v0, Ll/᩺ۙܺ;

    .line 739
    iget-object v2, v0, Ll/᩺ۙܺ;->᩸:Ll/ܽۗܺ;

    invoke-virtual {v2}, Ll/ܽۗܺ;->size()I

    move-result v2

    .line 491
    invoke-direct {v1, v2}, Ll/ۜ۬ܺ;-><init>(I)V

    .line 494
    invoke-virtual {v0}, Ll/᩺ۙܺ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 495
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    .line 496
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۫۬ܺ;

    .line 499
    invoke-virtual {v3}, Ll/۫۬ܺ;->֫()Ll/ۛ۬ܺ;

    move-result-object v3

    .line 646
    invoke-static {v3}, Ll/ۛ۬ܺ;->copyOf(Ljava/util/Collection;)Ll/ۛ۬ܺ;

    move-result-object v3

    .line 500
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_2

    .line 501
    invoke-virtual {v1, v4, v3}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    .line 502
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    move-result v3

    add-int/2addr v2, v3

    goto :goto_0

    .line 506
    :cond_3
    new-instance v0, Ll/ܰ۬ܺ;

    invoke-virtual {v1}, Ll/ۜ۬ܺ;->ۧ()Ll/ۢ۬ܺ;

    move-result-object v1

    invoke-direct {v0, v1, v2}, Ll/ܰ۬ܺ;-><init>(Ll/ۢ۬ܺ;I)V

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 238
    invoke-static {p1, p2}, Ll/᩹ۙܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 185
    iget-object v0, p0, Ll/ۘ۬ܺ;->֫:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 67
    invoke-static {}, Ll/ܽۗܺ;->᩻()Ll/ܽۗܺ;

    move-result-object v0

    .line 188
    iput-object v0, p0, Ll/ۘ۬ܺ;->֫:Ljava/util/Map;

    .line 239
    :cond_0
    check-cast v0, Ll/ܽۗܺ;

    invoke-virtual {v0, p1}, Ll/ܽۗܺ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨۗܺ;

    if-nez v0, :cond_2

    .line 273
    sget v0, Ll/ۛ۬ܺ;->᩶:I

    const-string v0, "expectedSize"

    const/4 v1, 0x4

    .line 438
    invoke-static {v1, v0}, Ll/᩹ۙܺ;->֫(ILjava/lang/String;)V

    .line 439
    new-instance v0, Ll/۫۬ܺ;

    .line 473
    invoke-direct {v0, v1}, Ll/ۛۗܺ;-><init>(I)V

    .line 475
    invoke-static {v1}, Ll/ۛ۬ܺ;->֫(I)I

    move-result v1

    new-array v1, v1, [Ljava/lang/Object;

    iput-object v1, v0, Ll/۫۬ܺ;->ܿ:[Ljava/lang/Object;

    .line 185
    iget-object v1, p0, Ll/ۘ۬ܺ;->֫:Ljava/util/Map;

    if-nez v1, :cond_1

    .line 67
    invoke-static {}, Ll/ܽۗܺ;->᩻()Ll/ܽۗܺ;

    move-result-object v1

    .line 188
    iput-object v1, p0, Ll/ۘ۬ܺ;->֫:Ljava/util/Map;

    .line 242
    :cond_1
    check-cast v1, Ll/ܽۗܺ;

    invoke-virtual {v1, p1, v0}, Ll/ܽۗܺ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    :cond_2
    invoke-virtual {v0, p2}, Ll/ۨۗܺ;->֫(Ljava/lang/Object;)Ll/ۨۗܺ;

    return-void
.end method
