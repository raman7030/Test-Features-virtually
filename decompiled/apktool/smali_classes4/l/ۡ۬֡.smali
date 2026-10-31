.class public abstract Ll/ۡ۬֡;
.super Ll/᩵۬֡;
.source "6628"

# interfaces
.implements Ll/ۘܽۚ;


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 49
    instance-of v1, p1, Ll/ۘܽۚ;

    if-eqz v1, :cond_0

    .line 50
    check-cast p1, Ll/ۘܽۚ;

    .line 51
    invoke-interface {p0}, Ll/ۘܽۚ;->᩷()Ll/᩵ܽۚ;

    move-result-object v1

    invoke-interface {p1}, Ll/ۘܽۚ;->᩷()Ll/᩵ܽۚ;

    move-result-object v2

    invoke-interface {v1, v2}, Ll/᩵ܽۚ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 52
    invoke-interface {p0}, Ll/ۘܽۚ;->ܺ()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Ll/ۘܽۚ;->ܺ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 53
    invoke-interface {p0}, Ll/ۘܽۚ;->ۧ()Ll/֡ܽۚ;

    move-result-object v1

    invoke-interface {p1}, Ll/ۘܽۚ;->ۧ()Ll/֡ܽۚ;

    move-result-object v2

    invoke-interface {v1, v2}, Ll/֡ܽۚ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 54
    invoke-interface {p0}, Ll/ۘܽۚ;->ۢ()Ljava/util/List;

    move-result-object v1

    invoke-interface {p1}, Ll/ۘܽۚ;->ۢ()Ljava/util/List;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 39
    invoke-interface {p0}, Ll/ۘܽۚ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 40
    invoke-interface {p0}, Ll/ۘܽۚ;->᩷()Ll/᩵ܽۚ;

    move-result-object v1

    invoke-interface {v1}, Ll/᩵ܽۚ;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 41
    invoke-interface {p0}, Ll/ۘܽۚ;->ܺ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 42
    invoke-interface {p0}, Ll/ۘܽۚ;->ۧ()Ll/֡ܽۚ;

    move-result-object v1

    invoke-interface {v1}, Ll/֡ܽۚ;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 43
    invoke-interface {p0}, Ll/ۘܽۚ;->ۢ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method
