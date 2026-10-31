.class public abstract Ll/ܿۜ᩻;
.super Ll/ܺۘܳ;
.source "BAIH"


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_3

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_0

    .line 22
    :cond_1
    invoke-super {p0, p1}, Ll/ܺۘܳ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v0

    .line 24
    :cond_2
    check-cast p1, Ll/ܿۜ᩻;

    .line 26
    invoke-virtual {p0}, Ll/ܺۘܳ;->֨ۧ()Ll/ܽۜܳ;

    move-result-object v0

    invoke-virtual {p1}, Ll/ܺۘܳ;->֨ۧ()Ll/ܽۜܳ;

    move-result-object p1

    .line 50
    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    :goto_0
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 31
    invoke-super {p0}, Ll/ܺۘܳ;->hashCode()I

    move-result v0

    .line 32
    invoke-virtual {p0}, Ll/ܺۘܳ;->֨ۧ()Ll/ܽۜܳ;

    move-result-object v1

    mul-int/lit8 v0, v0, 0x1f

    if-eqz v1, :cond_0

    .line 33
    invoke-virtual {v1}, Ll/ܽۜܳ;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public ֫(Ll/ܽۜܳ;)V
    .locals 0

    .line 14
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method
