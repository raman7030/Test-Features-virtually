.class public final Ll/ۖۡܺ;
.super Ll/ܿᩴܺ;
.source "U4RU"


# virtual methods
.method public final ֨()Ll/ܺۡܺ;
    .locals 1

    .line 64
    invoke-virtual {p0}, Ll/ܿᩴܺ;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 44
    invoke-virtual {p0, v0}, Ll/ܿᩴܺ;->֫(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܺۡܺ;

    return-object v0
.end method

.method public final ֫(Ll/ۡۡܺ;)V
    .locals 3

    .line 73
    invoke-virtual {p0}, Ll/ܿᩴܺ;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 44
    invoke-virtual {p0, v1}, Ll/ܿᩴܺ;->֫(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܺۡܺ;

    .line 76
    invoke-virtual {v2, p1}, Ll/ܺۡܺ;->֫(Ll/ۡۡܺ;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۖۡܺ;)Z
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    goto :goto_1

    .line 91
    :cond_0
    invoke-virtual {p0}, Ll/ܿᩴܺ;->size()I

    move-result v1

    .line 93
    invoke-virtual {p1}, Ll/ܿᩴܺ;->size()I

    move-result v2

    if-eq v1, v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    .line 44
    invoke-virtual {p0, v2}, Ll/ܿᩴܺ;->֫(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܺۡܺ;

    invoke-virtual {p1, v2}, Ll/ܿᩴܺ;->֫(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܺۡܺ;

    .line 96
    invoke-virtual {v3, v4}, Ll/ܺۡܺ;->֫(Ll/ܺۡܺ;)Z

    move-result v3

    if-nez v3, :cond_2

    :goto_1
    return v0

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    return p1
.end method
