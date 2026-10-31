.class public final synthetic Ll/ᩴۢۢ;
.super Ljava/lang/Object;
.source "K1PX"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 2
    check-cast p1, Ll/ܺۢۢ;

    .line 4
    check-cast p2, Ll/ܺۢۢ;

    .line 224
    iget-boolean v0, p1, Ll/ܺۢۢ;->ܿ:Z

    iget-object p1, p1, Ll/ܺۢۢ;->ܳ:Ljava/lang/String;

    iget-boolean v1, p2, Ll/ܺۢۢ;->ܿ:Z

    iget-object p2, p2, Ll/ܺۢۢ;->ܳ:Ljava/lang/String;

    if-eq v0, v1, :cond_0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_0
    const-string v0, ".."

    .line 227
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :goto_0
    const/4 p1, -0x1

    return p1

    .line 230
    :cond_1
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    const/4 p1, 0x1

    return p1

    .line 232
    :cond_3
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result p1

    return p1
.end method
