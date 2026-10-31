.class public abstract Ll/ۘ۬֡;
.super Ll/᩵۬֡;
.source "Y676"

# interfaces
.implements Ll/֡ܽۚ;


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 45
    check-cast p1, Ll/֡ܽۚ;

    invoke-virtual {p0, p1}, Ll/ۘ۬֡;->֫(Ll/֡ܽۚ;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 54
    instance-of v0, p1, Ll/֡ܽۚ;

    if-eqz v0, :cond_0

    .line 55
    check-cast p1, Ll/֡ܽۚ;

    .line 56
    invoke-interface {p0}, Ll/֡ܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ll/֡ܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 57
    invoke-interface {p0}, Ll/֡ܽۚ;->ۘ()Ljava/util/List;

    move-result-object v0

    invoke-interface {p1}, Ll/֡ܽۚ;->ۘ()Ljava/util/List;

    move-result-object p1

    invoke-static {v0, p1}, Ll/֨᩵ۚ;->֫(Ljava/util/List;Ljava/util/List;)Z

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

    .line 48
    invoke-interface {p0}, Ll/֡ܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 49
    invoke-interface {p0}, Ll/֡ܽۚ;->ۘ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 86
    invoke-interface {p0}, Ll/֡ܽۚ;->ۘ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    .line 87
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const/16 v1, 0x29

    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 90
    invoke-interface {p0}, Ll/֡ܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֡ܽۚ;)I
    .locals 2

    .line 64
    invoke-interface {p0}, Ll/֡ܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ll/֡ܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 66
    :cond_0
    invoke-static {}, Ll/ۤۤܺ;->ܽ()Ll/ۤۤܺ;

    move-result-object v0

    invoke-interface {p0}, Ll/֡ܽۚ;->ۘ()Ljava/util/List;

    move-result-object v1

    invoke-interface {p1}, Ll/֡ܽۚ;->ۘ()Ljava/util/List;

    move-result-object p1

    invoke-static {v0, v1, p1}, Ll/۠᩵ۚ;->֫(Ljava/util/Comparator;Ljava/util/List;Ljava/util/List;)I

    move-result p1

    return p1
.end method
