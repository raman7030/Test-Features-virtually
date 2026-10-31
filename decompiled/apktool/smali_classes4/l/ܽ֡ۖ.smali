.class public Ll/ܽ֡ۖ;
.super Ljava/lang/Object;
.source "89PU"

# interfaces
.implements Ll/ۧ֡ۖ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 52
    check-cast p1, Ll/ܰ᩵ۖ;

    .line 53
    check-cast p2, Ll/ܰ᩵ۖ;

    .line 54
    invoke-virtual {p1}, Ll/ܰ᩵ۖ;->ۜ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 55
    invoke-virtual {p1}, Ll/ܰ᩵ۖ;->ᩳ()V

    .line 176
    :cond_0
    invoke-virtual {p1}, Ll/ܰ᩵ۖ;->᩻()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p2}, Ll/ܰ᩵ۖ;->ܳ()Ljava/util/Map;

    move-result-object p2

    invoke-static {p2}, Ll/۟᩵ۖ;->ۧ(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p2

    check-cast v0, Ll/ۨ᩵ۖ;

    invoke-virtual {v0, p2}, Ll/ۨ᩵ۖ;->putAll(Ljava/util/Map;)V

    return-object p1
.end method

.method public final ֫(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    if-nez p2, :cond_0

    goto :goto_0

    .line 74
    :cond_0
    check-cast p2, Ll/ܰ᩵ۖ;

    invoke-virtual {p2}, Ll/ܰ᩵ۖ;->ܳ()Ljava/util/Map;

    move-result-object p2

    .line 75
    check-cast p3, Ll/᩶᩵ۖ;

    .line 76
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 80
    :cond_1
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    :goto_0
    return-void

    :cond_2
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    .line 82
    invoke-static {p1}, Ll/ܳ᩷ۖ;->ܳ(I)I

    .line 85
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    const/4 p1, 0x0

    .line 91
    throw p1
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 0

    .line 42
    check-cast p1, Ll/᩶᩵ۖ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final ۧ(Ljava/lang/Object;)Ljava/util/Map;
    .locals 0

    .line 16
    check-cast p1, Ll/ܰ᩵ۖ;

    invoke-virtual {p1}, Ll/ܰ᩵ۖ;->᩻()Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public final ܳ(Ljava/lang/Object;)Z
    .locals 0

    .line 26
    check-cast p1, Ll/ܰ᩵ۖ;

    invoke-virtual {p1}, Ll/ܰ᩵ۖ;->ۜ()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public final ܽ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 37
    check-cast p1, Ll/᩶᩵ۖ;

    invoke-static {p1}, Ll/ܰ᩵ۖ;->֫(Ll/᩶᩵ۖ;)Ll/ܰ᩵ۖ;

    move-result-object p1

    return-object p1
.end method

.method public final ܿ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 31
    move-object v0, p1

    check-cast v0, Ll/ܰ᩵ۖ;

    invoke-virtual {v0}, Ll/ܰ᩵ۖ;->᩷()V

    return-object p1
.end method

.method public final ᩳ(Ljava/lang/Object;)Ljava/util/Map;
    .locals 0

    .line 21
    check-cast p1, Ll/ܰ᩵ۖ;

    invoke-virtual {p1}, Ll/ܰ᩵ۖ;->ܳ()Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method
