.class public final Ll/ۚ᩷ۚ;
.super Ljava/lang/Object;
.source "H5GB"

# interfaces
.implements Ll/ᩴܶܺ;


# virtual methods
.method public final apply(Ljava/lang/Object;)Z
    .locals 0

    .line 103
    check-cast p1, Ll/᩹ۢۚ;

    .line 70
    iget-object p1, p1, Ll/᩹ۢۚ;->᩸:Ll/ۜ᩷ۚ;

    .line 64
    iget-object p1, p1, Ll/ۜ᩷ۚ;->᩸:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
