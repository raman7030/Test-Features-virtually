.class public abstract Ll/۬۬֡;
.super Ljava/lang/Object;
.source "W59C"

# interfaces
.implements Ll/ۤܽۚ;


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 43
    check-cast p1, Ll/ۤܽۚ;

    const/16 v0, 0x1e

    .line 56
    invoke-interface {p1}, Ll/ۤܽۚ;->ۖ()I

    move-result p1

    .line 133
    invoke-static {v0, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 51
    instance-of p1, p1, Ll/۬۬֡;

    return p1
.end method

.method public final hashCode()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ۖ()I
    .locals 1

    const/16 v0, 0x1e

    return v0
.end method
