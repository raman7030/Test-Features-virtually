.class public final synthetic Ll/ۛ۠֫;
.super Ljava/lang/Object;
.source "C8NR"

# interfaces
.implements Ll/ᩴܶܺ;


# virtual methods
.method public final apply(Ljava/lang/Object;)Z
    .locals 0

    .line 2
    check-cast p1, Ljava/util/Map$Entry;

    .line 870
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
