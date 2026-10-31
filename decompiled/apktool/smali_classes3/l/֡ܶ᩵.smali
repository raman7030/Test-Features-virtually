.class public final Ll/֡ܶ᩵;
.super Ll/᩸ܶ᩵;


# direct methods
.method public static ֫(I)I
    .locals 1

    if-gez p0, :cond_0

    return p0

    :cond_0
    const/4 v0, 0x3

    if-ge p0, v0, :cond_1

    add-int/lit8 p0, p0, 0x1

    return p0

    :cond_1
    const/high16 v0, 0x40000000    # 2.0f

    if-ge p0, v0, :cond_2

    int-to-float p0, p0

    const/high16 v0, 0x3f400000    # 0.75f

    div-float/2addr p0, v0

    const/high16 v0, 0x3f800000    # 1.0f

    add-float/2addr p0, v0

    float-to-int p0, p0

    return p0

    :cond_2
    const p0, 0x7fffffff

    return p0
.end method

.method public static bridge synthetic ֫()Ljava/util/Map;
    .locals 1

    .line 0
    sget-object v0, Ll/ܺܶ᩵;->᩸:Ll/ܺܶ᩵;

    return-object v0
.end method

.method public static ֫(Ljava/util/ArrayList;)Ljava/util/Map;
    .locals 3

    .line 577
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    .line 580
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-static {v1}, Ll/֡ܶ᩵;->֫(I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 443
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܺ۠᩵;

    invoke-virtual {v1}, Ll/ܺ۠᩵;->֫()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1}, Ll/ܺ۠᩵;->ۧ()Ljava/lang/Object;

    move-result-object v1

    .line 444
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    .line 579
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܺ۠᩵;

    const-string v0, "pair"

    .line 0
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-virtual {p0}, Ll/ܺ۠᩵;->ܽ()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, Ll/ܺ۠᩵;->ᩳ()Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0, p0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p0

    const-string v0, "singletonMap(...)"

    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    .line 0
    :cond_2
    sget-object p0, Ll/ܺܶ᩵;->᩸:Ll/ܺܶ᩵;

    return-object p0
.end method

.method public static ֫(Ljava/util/LinkedHashMap;)Ljava/util/Map;
    .locals 2

    const-string v0, "<this>"

    .line 0
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 633
    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 645
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0, p0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    return-object v0

    :cond_0
    const-string v0, "<this>"

    .line 0
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Map$Entry;

    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0, p0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p0

    const-string v0, "with(...)"

    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    .line 634
    :cond_1
    sget-object p0, Ll/ܺܶ᩵;->᩸:Ll/ܺܶ᩵;

    return-object p0
.end method
