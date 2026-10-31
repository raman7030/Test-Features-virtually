.class public final Ll/۠᩵ܺ;
.super Ljava/lang/Object;
.source "UB7S"

# interfaces
.implements Ll/ۚ᩵ܺ;


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "empty"

    return-object v0
.end method

.method public final ֫(Ll/᩵ۚܺ;)Z
    .locals 1

    .line 1644
    instance-of v0, p1, Ll/ۘۚܺ;

    if-eqz v0, :cond_1

    .line 1645
    check-cast p1, Ll/ۘۚܺ;

    invoke-interface {p1}, Ll/ۘۚܺ;->getChildren()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
