.class public final Ll/ۖ᩺ۡ;
.super Ljava/lang/Object;
.source "07T7"

# interfaces
.implements Ll/ۡ᩺ۘ;


# virtual methods
.method public final ֫(Ljava/lang/Object;)I
    .locals 2

    .line 23
    check-cast p1, Ljava/lang/CharSequence;

    .line 26
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/16 v1, 0x64

    if-ge v0, v1, :cond_0

    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    return p1

    :cond_0
    shl-int/lit8 v1, v0, 0x10

    .line 30
    div-int/lit8 v0, v0, 0x2

    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    or-int/2addr p1, v1

    return p1
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 23
    check-cast p1, Ljava/lang/CharSequence;

    check-cast p2, Ljava/lang/CharSequence;

    .line 35
    instance-of v0, p1, Ll/᩸ۛۡ;

    if-eqz v0, :cond_1

    check-cast p1, Ll/᩸ۛۡ;

    .line 36
    instance-of v0, p2, Ll/᩸ۛۡ;

    if-eqz v0, :cond_0

    check-cast p2, Ll/᩸ۛۡ;

    .line 37
    invoke-virtual {p1, p2}, Ll/᩸ۛۡ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 39
    :cond_0
    invoke-virtual {p1, p2}, Ll/᩸ۛۡ;->֫(Ljava/lang/CharSequence;)Z

    move-result p1

    return p1

    .line 41
    :cond_1
    instance-of v0, p2, Ll/᩸ۛۡ;

    if-eqz v0, :cond_2

    check-cast p2, Ll/᩸ۛۡ;

    .line 42
    invoke-virtual {p2, p1}, Ll/᩸ۛۡ;->֫(Ljava/lang/CharSequence;)Z

    move-result p1

    return p1

    .line 44
    :cond_2
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
