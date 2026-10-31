.class public abstract Ll/֨۬֡;
.super Ljava/lang/Object;
.source "R5Q5"

# interfaces
.implements Ll/᩹ܽۚ;


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 44
    check-cast p1, Ll/ۤܽۚ;

    const/16 v0, 0x1d

    .line 63
    invoke-interface {p1}, Ll/ۤܽۚ;->ۖ()I

    move-result v1

    .line 133
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 65
    :cond_0
    check-cast p1, Ll/᩹ܽۚ;

    .line 66
    invoke-interface {p0}, Ll/᩹ܽۚ;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ll/᩹ܽۚ;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    return v0

    .line 68
    :cond_1
    invoke-interface {p0}, Ll/᩹ܽۚ;->getElements()Ljava/util/Set;

    move-result-object v0

    invoke-interface {p1}, Ll/᩹ܽۚ;->getElements()Ljava/util/Set;

    move-result-object p1

    invoke-static {v0, p1}, Ll/۠᩵ۚ;->֫(Ljava/util/Set;Ljava/util/Set;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 53
    instance-of v0, p1, Ll/᩹ܽۚ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 54
    check-cast p1, Ll/᩹ܽۚ;

    .line 55
    invoke-interface {p0}, Ll/᩹ܽۚ;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ll/᩹ܽۚ;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 56
    invoke-interface {p0}, Ll/᩹ܽۚ;->getElements()Ljava/util/Set;

    move-result-object v0

    invoke-interface {p1}, Ll/᩹ܽۚ;->getElements()Ljava/util/Set;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 47
    invoke-interface {p0}, Ll/᩹ܽۚ;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 48
    invoke-interface {p0}, Ll/᩹ܽۚ;->getElements()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final ۖ()I
    .locals 1

    const/16 v0, 0x1d

    return v0
.end method
