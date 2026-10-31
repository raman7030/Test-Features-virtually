.class public abstract Ll/ܺ۬ܺ;
.super Ll/ۛ۬ܺ;
.source "V656"


# direct methods
.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 125
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Use EntrySetSerializedForm"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 2

    .line 91
    instance-of v0, p1, Ljava/util/Map$Entry;

    if-eqz v0, :cond_0

    .line 92
    check-cast p1, Ljava/util/Map$Entry;

    .line 93
    invoke-virtual {p0}, Ll/ܺ۬ܺ;->ۢ()Ll/ᩳ۫ܺ;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ᩳ۫ܺ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 94
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 112
    invoke-virtual {p0}, Ll/ܺ۬ܺ;->ۢ()Ll/ᩳ۫ܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢ۬ܺ;->hashCode()I

    move-result v0

    return v0
.end method

.method public final size()I
    .locals 1

    .line 86
    invoke-virtual {p0}, Ll/ܺ۬ܺ;->ۢ()Ll/ᩳ۫ܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩳ۫ܺ;->size()I

    move-result v0

    return v0
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 2

    .line 119
    new-instance v0, Ll/ۡ۬ܺ;

    invoke-virtual {p0}, Ll/ܺ۬ܺ;->ۢ()Ll/ᩳ۫ܺ;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۡ۬ܺ;-><init>(Ll/ۢ۬ܺ;)V

    return-object v0
.end method

.method public final ۜ()Z
    .locals 1

    .line 107
    invoke-virtual {p0}, Ll/ܺ۬ܺ;->ۢ()Ll/ᩳ۫ܺ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    return v0
.end method

.method public abstract ۢ()Ll/ᩳ۫ܺ;
.end method

.method public final ܳ()Z
    .locals 1

    .line 101
    invoke-virtual {p0}, Ll/ܺ۬ܺ;->ۢ()Ll/ᩳ۫ܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩳ۫ܺ;->ܿ()Z

    move-result v0

    return v0
.end method
