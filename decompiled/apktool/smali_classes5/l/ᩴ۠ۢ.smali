.class public final Ll/ᩴ۠ۢ;
.super Ljava/lang/Object;
.source "CAJ3"

# interfaces
.implements Ll/ۡ᩺ۘ;


# virtual methods
.method public final ֫(Ljava/lang/Object;)I
    .locals 0

    .line 226
    check-cast p1, Ljava/lang/CharSequence;

    if-nez p1, :cond_0

    const/4 p1, -0x1

    return p1

    .line 230
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    return p1
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 226
    check-cast p1, Ljava/lang/CharSequence;

    check-cast p2, Ljava/lang/CharSequence;

    const/4 v0, -0x1

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    .line 230
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    :goto_0
    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    :goto_1
    if-ne p1, v0, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method
