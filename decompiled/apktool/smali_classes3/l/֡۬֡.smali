.class public abstract Ll/֡۬֡;
.super Ll/᩵۬֡;
.source "P61I"

# interfaces
.implements Ll/ܶܽۚ;


# virtual methods
.method public final charAt(I)C
    .locals 1

    .line 65
    invoke-interface {p0}, Ll/ܶܽۚ;->getString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    return p1
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 39
    check-cast p1, Ljava/lang/CharSequence;

    .line 55
    invoke-interface {p0}, Ll/ܶܽۚ;->getString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-eqz p1, :cond_0

    .line 47
    instance-of v0, p1, Ll/ܶܽۚ;

    if-eqz v0, :cond_0

    .line 48
    invoke-interface {p0}, Ll/ܶܽۚ;->getString()Ljava/lang/String;

    move-result-object v0

    check-cast p1, Ll/ܶܽۚ;

    invoke-interface {p1}, Ll/ܶܽۚ;->getString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 42
    invoke-interface {p0}, Ll/ܶܽۚ;->getString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final length()I
    .locals 1

    .line 60
    invoke-interface {p0}, Ll/ܶܽۚ;->getString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    return v0
.end method

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 1

    .line 70
    invoke-interface {p0}, Ll/ܶܽۚ;->getString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 76
    invoke-interface {p0}, Ll/ܶܽۚ;->getString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
