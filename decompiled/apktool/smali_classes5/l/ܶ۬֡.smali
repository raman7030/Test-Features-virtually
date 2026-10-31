.class public abstract Ll/ܶ۬֡;
.super Ljava/lang/Object;
.source "75KT"

# interfaces
.implements Ll/ۙܽۚ;


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 44
    check-cast p1, Ll/ۤܽۚ;

    const/16 v0, 0x1f

    .line 60
    invoke-interface {p1}, Ll/ۤܽۚ;->ۖ()I

    move-result v1

    .line 133
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 62
    :cond_0
    invoke-interface {p0}, Ll/ۙܽۚ;->getValue()Z

    move-result v0

    check-cast p1, Ll/ۙܽۚ;

    invoke-interface {p1}, Ll/ۙܽۚ;->getValue()Z

    move-result p1

    .line 128
    invoke-static {v0, p1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 52
    instance-of v0, p1, Ll/ۙܽۚ;

    if-eqz v0, :cond_0

    .line 53
    invoke-interface {p0}, Ll/ۙܽۚ;->getValue()Z

    move-result v0

    check-cast p1, Ll/ۙܽۚ;

    invoke-interface {p1}, Ll/ۙܽۚ;->getValue()Z

    move-result p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 47
    invoke-interface {p0}, Ll/ۙܽۚ;->getValue()Z

    move-result v0

    return v0
.end method

.method public final ۖ()I
    .locals 1

    const/16 v0, 0x1f

    return v0
.end method
