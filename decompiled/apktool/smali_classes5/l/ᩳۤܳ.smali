.class public final Ll/ᩳۤܳ;
.super Ljava/lang/Object;
.source "3AN5"

# interfaces
.implements Ll/ۡ᩺ۘ;


# virtual methods
.method public final ֫(Ljava/lang/Object;)I
    .locals 1

    .line 31
    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 34
    :cond_0
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    return p1
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 31
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    if-eq p1, p2, :cond_1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 39
    invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
