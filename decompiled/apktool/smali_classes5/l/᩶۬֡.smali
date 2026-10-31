.class public abstract Ll/᩶۬֡;
.super Ljava/lang/Object;
.source "V57G"

# interfaces
.implements Ll/֫ᩳۚ;


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 43
    check-cast p1, Ll/ۤܽۚ;

    const/16 v0, 0x1a

    .line 59
    invoke-interface {p1}, Ll/ۤܽۚ;->ۖ()I

    move-result v1

    .line 133
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 61
    :cond_0
    invoke-interface {p0}, Ll/֫ᩳۚ;->getValue()Ll/ۚܽۚ;

    move-result-object v0

    check-cast p1, Ll/֫ᩳۚ;

    invoke-interface {p1}, Ll/֫ᩳۚ;->getValue()Ll/ۚܽۚ;

    move-result-object p1

    invoke-interface {v0, p1}, Ll/ۚܽۚ;->֫(Ll/ۚܽۚ;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 51
    instance-of v0, p1, Ll/֫ᩳۚ;

    if-eqz v0, :cond_0

    .line 52
    invoke-interface {p0}, Ll/֫ᩳۚ;->getValue()Ll/ۚܽۚ;

    move-result-object v0

    check-cast p1, Ll/֫ᩳۚ;

    invoke-interface {p1}, Ll/֫ᩳۚ;->getValue()Ll/ۚܽۚ;

    move-result-object p1

    invoke-interface {v0, p1}, Ll/ۚܽۚ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 46
    invoke-interface {p0}, Ll/֫ᩳۚ;->getValue()Ll/ۚܽۚ;

    move-result-object v0

    invoke-interface {v0}, Ll/ۚܽۚ;->hashCode()I

    move-result v0

    return v0
.end method

.method public final ۖ()I
    .locals 1

    const/16 v0, 0x1a

    return v0
.end method
