.class public Ll/᩹ۨܺ;
.super Ll/᩷ۙܺ;
.source "O5F3"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public transient ᩸:Ljava/util/Set;

.field public final ᩹:Ljava/util/AbstractMap;


# direct methods
.method public constructor <init>(Ljava/util/NavigableMap;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    check-cast p1, Ljava/util/AbstractMap;

    iput-object p1, p0, Ll/᩹ۨܺ;->᩹:Ljava/util/AbstractMap;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/NavigableMap;I)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Ll/᩹ۨܺ;-><init>(Ljava/util/NavigableMap;)V

    return-void
.end method

.method public static ۧ()Ll/᩹ۨܺ;
    .locals 2

    .line 51
    new-instance v0, Ll/᩹ۨܺ;

    new-instance v1, Ljava/util/TreeMap;

    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    invoke-direct {v0, v1}, Ll/᩹ۨܺ;-><init>(Ljava/util/NavigableMap;)V

    return-object v0
.end method


# virtual methods
.method public final ֫()Ljava/util/Set;
    .locals 2

    .line 85
    iget-object v0, p0, Ll/᩹ۨܺ;->᩸:Ljava/util/Set;

    if-nez v0, :cond_0

    .line 86
    new-instance v0, Ll/ᩴۨܺ;

    iget-object v1, p0, Ll/᩹ۨܺ;->᩹:Ljava/util/AbstractMap;

    invoke-interface {v1}, Ljava/util/SortedMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ᩴۨܺ;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ll/᩹ۨܺ;->᩸:Ljava/util/Set;

    :cond_0
    return-object v0
.end method

.method public ֫(Ljava/lang/Integer;)Ll/ܰۤܺ;
    .locals 2

    .line 310
    new-instance v0, Ll/ۖۗܺ;

    .line 315
    invoke-direct {v0, p1}, Ll/ۘۗܺ;-><init>(Ljava/lang/Comparable;)V

    .line 124
    iget-object v1, p0, Ll/᩹ۨܺ;->᩹:Ljava/util/AbstractMap;

    invoke-interface {v1, v0}, Ljava/util/NavigableMap;->floorEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 125
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰۤܺ;

    invoke-virtual {v1, p1}, Ll/ܰۤܺ;->֫(Ljava/lang/Comparable;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 126
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܰۤܺ;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public ֫(Ll/ܰۤܺ;)V
    .locals 5

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    invoke-virtual {p1}, Ll/ܰۤܺ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 187
    :cond_0
    iget-object v0, p1, Ll/ܰۤܺ;->᩸:Ll/ۘۗܺ;

    .line 188
    iget-object p1, p1, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    .line 190
    iget-object v1, p0, Ll/᩹ۨܺ;->᩹:Ljava/util/AbstractMap;

    invoke-interface {v1, v0}, Ljava/util/NavigableMap;->lowerEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 193
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰۤܺ;

    .line 194
    iget-object v3, v2, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    invoke-virtual {v3, v0}, Ll/ۘۗܺ;->֫(Ll/ۘۗܺ;)I

    move-result v4

    if-ltz v4, :cond_2

    .line 196
    invoke-virtual {v3, p1}, Ll/ۘۗܺ;->֫(Ll/ۘۗܺ;)I

    move-result v0

    if-ltz v0, :cond_1

    move-object p1, v3

    .line 204
    :cond_1
    iget-object v0, v2, Ll/ܰۤܺ;->᩸:Ll/ۘۗܺ;

    .line 208
    :cond_2
    invoke-interface {v1, p1}, Ljava/util/NavigableMap;->floorEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 211
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰۤܺ;

    .line 212
    iget-object v3, v2, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    invoke-virtual {v3, p1}, Ll/ۘۗܺ;->֫(Ll/ۘۗܺ;)I

    move-result v3

    if-ltz v3, :cond_3

    .line 214
    iget-object p1, v2, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    .line 219
    :cond_3
    invoke-interface {v1, v0, p1}, Ljava/util/NavigableMap;->subMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedMap;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->clear()V

    .line 221
    invoke-static {v0, p1}, Ll/ܰۤܺ;->֫(Ll/ۘۗܺ;Ll/ۘۗܺ;)Ll/ܰۤܺ;

    move-result-object p1

    .line 268
    invoke-virtual {p1}, Ll/ܰۤܺ;->֫()Z

    move-result v0

    iget-object v2, p1, Ll/ܰۤܺ;->᩸:Ll/ۘۗܺ;

    if-eqz v0, :cond_4

    .line 269
    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 271
    :cond_4
    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public ۧ(Ll/ܰۤܺ;)Ll/֫ۛܺ;
    .locals 1

    .line 859
    invoke-static {}, Ll/ܰۤܺ;->ᩳ()Ll/ܰۤܺ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ܰۤܺ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Ll/֨ۨܺ;

    invoke-direct {v0, p0, p1}, Ll/֨ۨܺ;-><init>(Ll/᩹ۨܺ;Ll/ܰۤܺ;)V

    return-object v0
.end method

.method public ۧ(Ljava/lang/Integer;)Z
    .locals 0

    .line 32
    invoke-interface {p0, p1}, Ll/֫ۛܺ;->֫(Ljava/lang/Integer;)Ll/ܰۤܺ;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
