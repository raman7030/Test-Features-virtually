.class public abstract Ll/ᩴ۬֡;
.super Ll/᩵۬֡;
.source "Y68W"

# interfaces
.implements Ll/ۚܽۚ;


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 44
    check-cast p1, Ll/ۚܽۚ;

    invoke-virtual {p0, p1}, Ll/ᩴ۬֡;->֫(Ll/ۚܽۚ;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 55
    instance-of v1, p1, Ll/ۚܽۚ;

    if-eqz v1, :cond_0

    .line 56
    check-cast p1, Ll/ۚܽۚ;

    .line 57
    invoke-interface {p0}, Ll/ۚܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Ll/ۚܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 58
    invoke-interface {p0}, Ll/ۚܽۚ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Ll/ۚܽۚ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 59
    invoke-interface {p0}, Ll/ۚܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Ll/ۚܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 60
    invoke-interface {p0}, Ll/ۚܽۚ;->ۘ()Ljava/util/List;

    move-result-object v1

    invoke-interface {p1}, Ll/ۚܽۚ;->ۘ()Ljava/util/List;

    move-result-object p1

    invoke-static {v1, p1}, Ll/֨᩵ۚ;->֫(Ljava/util/List;Ljava/util/List;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 47
    invoke-interface {p0}, Ll/ۚܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 48
    invoke-interface {p0}, Ll/ۚܽۚ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 49
    invoke-interface {p0}, Ll/ۚܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 50
    invoke-interface {p0}, Ll/ۚܽۚ;->ۘ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 64
    invoke-static {p0, v0}, Ll/ܳۜۚ;->֫(Ll/ۚܽۚ;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۚܽۚ;)I
    .locals 2

    .line 67
    invoke-interface {p0}, Ll/ۚܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ll/ۚܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 69
    :cond_0
    invoke-interface {p0}, Ll/ۚܽۚ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ll/ۚܽۚ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    return v0

    .line 71
    :cond_1
    invoke-interface {p0}, Ll/ۚܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ll/ۚܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_2

    return v0

    .line 73
    :cond_2
    invoke-static {}, Ll/ۤۤܺ;->ܽ()Ll/ۤۤܺ;

    move-result-object v0

    invoke-interface {p0}, Ll/ۚܽۚ;->ۘ()Ljava/util/List;

    move-result-object v1

    invoke-interface {p1}, Ll/ۚܽۚ;->ۘ()Ljava/util/List;

    move-result-object p1

    invoke-static {v0, v1, p1}, Ll/۠᩵ۚ;->֫(Ljava/util/Comparator;Ljava/util/List;Ljava/util/List;)I

    move-result p1

    return p1
.end method
