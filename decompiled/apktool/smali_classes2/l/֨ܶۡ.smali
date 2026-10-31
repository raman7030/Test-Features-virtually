.class public final synthetic Ll/֨ܶۡ;
.super Ljava/lang/Object;
.source "B7EO"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 2
    check-cast p1, Ll/۠ܶۡ;

    .line 4
    check-cast p2, Ll/۠ܶۡ;

    .line 84
    invoke-virtual {p1}, Ll/۠ܶۡ;->ܽ()Z

    move-result v0

    invoke-virtual {p2}, Ll/۠ܶۡ;->ܽ()Z

    move-result v1

    if-eq v0, v1, :cond_1

    .line 85
    invoke-virtual {p1}, Ll/۠ܶۡ;->ܽ()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1

    .line 87
    :cond_1
    invoke-virtual {p1}, Ll/۠ܶۡ;->ᩳ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ll/۠ܶۡ;->ᩳ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method
