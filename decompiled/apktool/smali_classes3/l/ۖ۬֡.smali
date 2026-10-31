.class public abstract Ll/ۖ۬֡;
.super Ll/᩵۬֡;
.source "069J"

# interfaces
.implements Ll/᩵ܽۚ;


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 43
    check-cast p1, Ll/᩵ܽۚ;

    invoke-virtual {p0, p1}, Ll/ۖ۬֡;->֫(Ll/᩵ܽۚ;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-eqz p1, :cond_0

    .line 53
    instance-of v0, p1, Ll/᩵ܽۚ;

    if-eqz v0, :cond_0

    .line 54
    check-cast p1, Ll/᩵ܽۚ;

    .line 55
    invoke-interface {p0}, Ll/᩵ܽۚ;->֫ۧ()I

    move-result v0

    invoke-interface {p1}, Ll/᩵ܽۚ;->֫ۧ()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 56
    invoke-interface {p0}, Ll/᩵ܽۚ;->᩻ۧ()Ll/۠ܽۚ;

    move-result-object v0

    invoke-interface {p1}, Ll/᩵ܽۚ;->᩻ۧ()Ll/۠ܽۚ;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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

    .line 46
    invoke-interface {p0}, Ll/᩵ܽۚ;->֫ۧ()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 47
    invoke-interface {p0}, Ll/᩵ܽۚ;->᩻ۧ()Ll/۠ܽۚ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final ֫(Ll/᩵ܽۚ;)I
    .locals 2

    .line 63
    invoke-interface {p0}, Ll/᩵ܽۚ;->֫ۧ()I

    move-result v0

    invoke-interface {p1}, Ll/᩵ܽۚ;->֫ۧ()I

    move-result v1

    .line 133
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 66
    :cond_0
    invoke-interface {p0}, Ll/᩵ܽۚ;->᩻ۧ()Ll/۠ܽۚ;

    move-result-object v0

    .line 67
    instance-of v1, v0, Ll/ᩴܽۚ;

    if-eqz v1, :cond_2

    .line 70
    invoke-interface {p1}, Ll/᩵ܽۚ;->᩻ۧ()Ll/۠ܽۚ;

    move-result-object v1

    instance-of v1, v1, Ll/ᩴܽۚ;

    if-nez v1, :cond_1

    const/4 p1, -0x1

    return p1

    .line 73
    :cond_1
    check-cast v0, Ll/ᩴܽۚ;

    invoke-interface {p1}, Ll/᩵ܽۚ;->᩻ۧ()Ll/۠ܽۚ;

    move-result-object p1

    check-cast p1, Ll/ᩴܽۚ;

    invoke-interface {v0, p1}, Ll/ᩴܽۚ;->֫(Ll/ᩴܽۚ;)I

    move-result p1

    return p1

    .line 75
    :cond_2
    invoke-interface {p1}, Ll/᩵ܽۚ;->᩻ۧ()Ll/۠ܽۚ;

    move-result-object v1

    instance-of v1, v1, Ll/ۚܽۚ;

    if-nez v1, :cond_3

    const/4 p1, 0x1

    return p1

    .line 78
    :cond_3
    check-cast v0, Ll/ۚܽۚ;

    invoke-interface {p1}, Ll/᩵ܽۚ;->᩻ۧ()Ll/۠ܽۚ;

    move-result-object p1

    check-cast p1, Ll/ۚܽۚ;

    invoke-interface {v0, p1}, Ll/ۚܽۚ;->֫(Ll/ۚܽۚ;)I

    move-result p1

    return p1
.end method
