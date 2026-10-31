.class public final Ll/᩹ۛۡ;
.super Ljava/lang/Object;
.source "OAHP"

# interfaces
.implements Ll/ۡ᩺ۘ;


# virtual methods
.method public final ֫(Ljava/lang/Object;)I
    .locals 0

    .line 35
    check-cast p1, Ljava/lang/String;

    .line 38
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    return p1
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 35
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    .line 43
    invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
