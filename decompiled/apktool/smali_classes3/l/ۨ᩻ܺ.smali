.class public final Ll/ۨ᩻ܺ;
.super Ljava/lang/Object;
.source "RBI4"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 579
    check-cast p1, Ll/ܰܿܺ;

    check-cast p2, Ll/ܰܿܺ;

    .line 582
    invoke-virtual {p1}, Ll/ܰܿܺ;->ܿ()I

    move-result p1

    invoke-virtual {p2}, Ll/ܰܿܺ;->ܿ()I

    move-result p2

    sub-int/2addr p1, p2

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
