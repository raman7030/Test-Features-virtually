.class public final Ll/ܰᩳܺ;
.super Ll/ܿᩴܺ;
.source "BBHG"


# virtual methods
.method public final ֨()I
    .locals 4

    .line 49
    invoke-virtual {p0}, Ll/ܿᩴܺ;->size()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 41
    invoke-virtual {p0, v2}, Ll/ܿᩴܺ;->֫(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۫ᩳܺ;

    .line 53
    invoke-interface {v3}, Ll/۫ᩳܺ;->֫()I

    move-result v3

    add-int/2addr v1, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v1
.end method

.method public final ֫(Ll/᩻ܽܺ;)Ll/۫ᩳܺ;
    .locals 4

    .line 81
    invoke-virtual {p0}, Ll/ܿᩴܺ;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 41
    invoke-virtual {p0, v1}, Ll/ܿᩴܺ;->֫(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۫ᩳܺ;

    if-ne v2, p1, :cond_1

    .line 96
    invoke-virtual {p1}, Ll/᩻ܽܺ;->getName()Ljava/lang/String;

    move-result-object p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    if-ge v1, v0, :cond_2

    .line 41
    invoke-virtual {p0, v1}, Ll/ܿᩴܺ;->֫(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۫ᩳܺ;

    .line 100
    invoke-interface {v2}, Ll/۫ᩳܺ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-object v2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۧ(Ljava/lang/String;)Ll/۫ᩳܺ;
    .locals 4

    .line 64
    invoke-virtual {p0}, Ll/ܿᩴܺ;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 41
    invoke-virtual {p0, v1}, Ll/ܿᩴܺ;->֫(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۫ᩳܺ;

    .line 68
    invoke-interface {v2}, Ll/۫ᩳܺ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
