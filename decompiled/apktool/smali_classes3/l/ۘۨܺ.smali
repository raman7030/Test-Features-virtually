.class public final Ll/ۘۨܺ;
.super Ljava/lang/Object;
.source "I5J5"

# interfaces
.implements Ll/۟ۤܺ;


# instance fields
.field public final ᩸:Ljava/util/TreeMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 389
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 89
    iput-object v0, p0, Ll/ۘۨܺ;->᩸:Ljava/util/TreeMap;

    return-void
.end method

.method public static synthetic ֫(Ll/ۘۨܺ;)Ljava/util/TreeMap;
    .locals 0

    .line 57
    iget-object p0, p0, Ll/ۘۨܺ;->᩸:Ljava/util/TreeMap;

    return-object p0
.end method

.method public static ܽ()Ll/ۘۨܺ;
    .locals 1

    .line 63
    new-instance v0, Ll/ۘۨܺ;

    invoke-direct {v0}, Ll/ۘۨܺ;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 711
    instance-of v0, p1, Ll/۟ۤܺ;

    if-eqz v0, :cond_0

    .line 712
    check-cast p1, Ll/۟ۤܺ;

    .line 713
    invoke-virtual {p0}, Ll/ۘۨܺ;->֫()Ljava/util/Map;

    move-result-object v0

    invoke-interface {p1}, Ll/۟ۤܺ;->֫()Ljava/util/Map;

    move-result-object p1

    check-cast v0, Ljava/util/AbstractMap;

    invoke-virtual {v0, p1}, Ljava/util/AbstractMap;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 720
    invoke-virtual {p0}, Ll/ۘۨܺ;->֫()Ljava/util/Map;

    move-result-object v0

    check-cast v0, Ljava/util/AbstractMap;

    invoke-virtual {v0}, Ljava/util/AbstractMap;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 725
    iget-object v0, p0, Ll/ۘۨܺ;->᩸:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/Integer;)Ljava/lang/Object;
    .locals 3

    .line 310
    new-instance v0, Ll/ۖۗܺ;

    .line 315
    invoke-direct {v0, p1}, Ll/ۘۗܺ;-><init>(Ljava/lang/Comparable;)V

    .line 128
    iget-object v1, p0, Ll/ۘۨܺ;->᩸:Ljava/util/TreeMap;

    invoke-virtual {v1, v0}, Ljava/util/TreeMap;->floorEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 129
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖۨܺ;

    .line 107
    invoke-virtual {v2}, Ljava/util/AbstractMap$SimpleImmutableEntry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰۤܺ;

    invoke-virtual {v2, p1}, Ll/ܰۤܺ;->֫(Ljava/lang/Comparable;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 130
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_1

    return-object v1

    .line 122
    :cond_1
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ljava/util/Map;
    .locals 2

    .line 262
    new-instance v0, Ll/ܺۨܺ;

    iget-object v1, p0, Ll/ۘۨܺ;->᩸:Ljava/util/TreeMap;

    invoke-virtual {v1}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ll/ܺۨܺ;-><init>(Ll/ۘۨܺ;Ljava/util/Collection;)V

    return-object v0
.end method

.method public final ֫(Ll/ܰۤܺ;Ljava/lang/String;)V
    .locals 8

    .line 138
    invoke-virtual {p1}, Ll/ܰۤܺ;->֫()Z

    move-result v0

    iget-object v1, p1, Ll/ܰۤܺ;->᩸:Ll/ۘۗܺ;

    if-nez v0, :cond_4

    .line 902
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    invoke-virtual {p1}, Ll/ܰۤܺ;->֫()Z

    move-result v0

    iget-object v2, p1, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    iget-object v3, p0, Ll/ۘۨܺ;->᩸:Ljava/util/TreeMap;

    if-eqz v0, :cond_0

    goto/16 :goto_0

    .line 221
    :cond_0
    invoke-virtual {v3, v1}, Ljava/util/TreeMap;->lowerEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 224
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۖۨܺ;

    .line 115
    invoke-virtual {v4}, Ljava/util/AbstractMap$SimpleImmutableEntry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܰۤܺ;

    iget-object v5, v5, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    .line 225
    invoke-virtual {v5, v1}, Ll/ۘۗܺ;->֫(Ll/ۘۗܺ;)I

    move-result v5

    if-lez v5, :cond_2

    .line 115
    invoke-virtual {v4}, Ljava/util/AbstractMap$SimpleImmutableEntry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܰۤܺ;

    iget-object v5, v5, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    .line 227
    invoke-virtual {v5, v2}, Ll/ۘۗܺ;->֫(Ll/ۘۗܺ;)I

    move-result v5

    if-lez v5, :cond_1

    .line 115
    invoke-virtual {v4}, Ljava/util/AbstractMap$SimpleImmutableEntry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܰۤܺ;

    iget-object v5, v5, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    .line 233
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۖۨܺ;

    invoke-virtual {v6}, Ljava/util/AbstractMap$SimpleImmutableEntry;->getValue()Ljava/lang/Object;

    move-result-object v6

    .line 207
    new-instance v7, Ll/ۖۨܺ;

    .line 99
    invoke-static {v2, v5}, Ll/ܰۤܺ;->֫(Ll/ۘۗܺ;Ll/ۘۗܺ;)Ll/ܰۤܺ;

    move-result-object v5

    .line 103
    invoke-direct {v7, v5, v6}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 207
    invoke-virtual {v3, v2, v7}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    :cond_1
    invoke-virtual {v4}, Ljava/util/AbstractMap$SimpleImmutableEntry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܰۤܺ;

    iget-object v4, v4, Ll/ܰۤܺ;->᩸:Ll/ۘۗܺ;

    .line 239
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖۨܺ;

    invoke-virtual {v0}, Ljava/util/AbstractMap$SimpleImmutableEntry;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 207
    new-instance v5, Ll/ۖۨܺ;

    .line 99
    invoke-static {v4, v1}, Ll/ܰۤܺ;->֫(Ll/ۘۗܺ;Ll/ۘۗܺ;)Ll/ܰۤܺ;

    move-result-object v6

    .line 103
    invoke-direct {v5, v6, v0}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 207
    invoke-virtual {v3, v4, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    :cond_2
    invoke-virtual {v3, v2}, Ljava/util/TreeMap;->lowerEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 247
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۖۨܺ;

    .line 115
    invoke-virtual {v4}, Ljava/util/AbstractMap$SimpleImmutableEntry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܰۤܺ;

    iget-object v5, v5, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    .line 248
    invoke-virtual {v5, v2}, Ll/ۘۗܺ;->֫(Ll/ۘۗܺ;)I

    move-result v5

    if-lez v5, :cond_3

    .line 115
    invoke-virtual {v4}, Ljava/util/AbstractMap$SimpleImmutableEntry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܰۤܺ;

    iget-object v4, v4, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    .line 254
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖۨܺ;

    invoke-virtual {v0}, Ljava/util/AbstractMap$SimpleImmutableEntry;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 207
    new-instance v5, Ll/ۖۨܺ;

    .line 99
    invoke-static {v2, v4}, Ll/ܰۤܺ;->֫(Ll/ۘۗܺ;Ll/ۘۗܺ;)Ll/ܰۤܺ;

    move-result-object v4

    .line 103
    invoke-direct {v5, v4, v0}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 207
    invoke-virtual {v3, v2, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    :cond_3
    invoke-virtual {v3, v1, v2}, Ljava/util/TreeMap;->subMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedMap;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 141
    :goto_0
    new-instance v0, Ll/ۖۨܺ;

    .line 103
    invoke-direct {v0, p1, p2}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 141
    invoke-virtual {v3, v1, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    return-void
.end method

.method public final ۧ()Ljava/util/Map;
    .locals 2

    .line 267
    new-instance v0, Ll/ܺۨܺ;

    iget-object v1, p0, Ll/ۘۨܺ;->᩸:Ljava/util/TreeMap;

    invoke-virtual {v1}, Ljava/util/TreeMap;->descendingMap()Ljava/util/NavigableMap;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/SortedMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ll/ܺۨܺ;-><init>(Ll/ۘۨܺ;Ljava/util/Collection;)V

    return-object v0
.end method
