.class public final Ll/ۨ᩵ۖ;
.super Ljava/lang/Object;
.source "89PP"

# interfaces
.implements Ljava/util/Map;


# instance fields
.field public final ᩸:Ljava/util/LinkedHashMap;

.field public final ᩹:Ll/ܰ᩵ۖ;


# direct methods
.method public constructor <init>(Ll/ܰ᩵ۖ;Ljava/util/LinkedHashMap;)V
    .locals 0

    .line 265
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 266
    iput-object p1, p0, Ll/ۨ᩵ۖ;->᩹:Ll/ܰ᩵ۖ;

    .line 267
    iput-object p2, p0, Ll/ۨ᩵ۖ;->᩸:Ljava/util/LinkedHashMap;

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 321
    iget-object v0, p0, Ll/ۨ᩵ۖ;->᩹:Ll/ܰ᩵ۖ;

    invoke-virtual {v0}, Ll/ܰ᩵ۖ;->ܿ()V

    .line 322
    iget-object v0, p0, Ll/ۨ᩵ۖ;->᩸:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    return-void
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 1

    .line 282
    iget-object v0, p0, Ll/ۨ᩵ۖ;->᩸:Ljava/util/LinkedHashMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 1

    .line 287
    iget-object v0, p0, Ll/ۨ᩵ۖ;->᩸:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 3

    .line 337
    new-instance v0, Ll/ۛ᩵ۖ;

    iget-object v1, p0, Ll/ۨ᩵ۖ;->᩸:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    iget-object v2, p0, Ll/ۨ᩵ۖ;->᩹:Ll/ܰ᩵ۖ;

    invoke-direct {v0, v2, v1}, Ll/ۛ᩵ۖ;-><init>(Ll/ܰ᩵ۖ;Ljava/util/Set;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 342
    iget-object v0, p0, Ll/ۨ᩵ۖ;->᩸:Ljava/util/LinkedHashMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 292
    iget-object v0, p0, Ll/ۨ᩵ۖ;->᩸:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final hashCode()I
    .locals 1

    .line 347
    iget-object v0, p0, Ll/ۨ᩵ۖ;->᩸:Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->hashCode()I

    move-result v0

    return v0
.end method

.method public final isEmpty()Z
    .locals 1

    .line 277
    iget-object v0, p0, Ll/ۨ᩵ۖ;->᩸:Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 3

    .line 327
    new-instance v0, Ll/ۛ᩵ۖ;

    iget-object v1, p0, Ll/ۨ᩵ۖ;->᩸:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    iget-object v2, p0, Ll/ۨ᩵ۖ;->᩹:Ll/ܰ᩵ۖ;

    invoke-direct {v0, v2, v1}, Ll/ۛ᩵ۖ;-><init>(Ll/ܰ᩵ۖ;Ljava/util/Set;)V

    return-object v0
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 297
    iget-object v0, p0, Ll/ۨ᩵ۖ;->᩹:Ll/ܰ᩵ۖ;

    invoke-virtual {v0}, Ll/ܰ᩵ۖ;->ܿ()V

    .line 298
    sget-object v0, Ll/ܰᩴۖ;->֫:[B

    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    iget-object v0, p0, Ll/ۨ᩵ۖ;->᩸:Ljava/util/LinkedHashMap;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 3

    .line 311
    iget-object v0, p0, Ll/ۨ᩵ۖ;->᩹:Ll/ܰ᩵ۖ;

    invoke-virtual {v0}, Ll/ܰ᩵ۖ;->ܿ()V

    .line 312
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 313
    sget-object v2, Ll/ܰᩴۖ;->֫:[B

    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    .line 316
    :cond_0
    iget-object v0, p0, Ll/ۨ᩵ۖ;->᩸:Ljava/util/LinkedHashMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 305
    iget-object v0, p0, Ll/ۨ᩵ۖ;->᩹:Ll/ܰ᩵ۖ;

    invoke-virtual {v0}, Ll/ܰ᩵ۖ;->ܿ()V

    .line 306
    iget-object v0, p0, Ll/ۨ᩵ۖ;->᩸:Ljava/util/LinkedHashMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 272
    iget-object v0, p0, Ll/ۨ᩵ۖ;->᩸:Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 352
    iget-object v0, p0, Ll/ۨ᩵ۖ;->᩸:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final values()Ljava/util/Collection;
    .locals 3

    .line 332
    new-instance v0, Ll/۫᩵ۖ;

    iget-object v1, p0, Ll/ۨ᩵ۖ;->᩸:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    iget-object v2, p0, Ll/ۨ᩵ۖ;->᩹:Ll/ܰ᩵ۖ;

    invoke-direct {v0, v2, v1}, Ll/۫᩵ۖ;-><init>(Ll/ܰ᩵ۖ;Ljava/util/Collection;)V

    return-object v0
.end method
