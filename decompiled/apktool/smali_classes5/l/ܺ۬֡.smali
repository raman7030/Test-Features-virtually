.class public abstract Ll/ܺ۬֡;
.super Ll/᩵۬֡;
.source "862H"

# interfaces
.implements Ll/ᩴܽۚ;


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 40
    check-cast p1, Ll/ᩴܽۚ;

    invoke-virtual {p0, p1}, Ll/ܺ۬֡;->֫(Ll/ᩴܽۚ;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 50
    instance-of v0, p1, Ll/ᩴܽۚ;

    if-eqz v0, :cond_0

    .line 51
    check-cast p1, Ll/ᩴܽۚ;

    .line 52
    invoke-interface {p0}, Ll/ᩴܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ll/ᩴܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 53
    invoke-interface {p0}, Ll/ᩴܽۚ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ll/ᩴܽۚ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 54
    invoke-interface {p0}, Ll/ᩴܽۚ;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ll/ᩴܽۚ;->getType()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 43
    invoke-interface {p0}, Ll/ᩴܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 44
    invoke-interface {p0}, Ll/ᩴܽۚ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 45
    invoke-interface {p0}, Ll/ᩴܽۚ;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 156
    invoke-static {p0, v0}, Ll/ܳۜۚ;->֫(Ll/ᩴܽۚ;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ᩴܽۚ;)I
    .locals 2

    .line 62
    invoke-interface {p0}, Ll/ᩴܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ll/ᩴܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 64
    :cond_0
    invoke-interface {p0}, Ll/ᩴܽۚ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ll/ᩴܽۚ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    return v0

    .line 66
    :cond_1
    invoke-interface {p0}, Ll/ᩴܽۚ;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ll/ᩴܽۚ;->getType()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method
