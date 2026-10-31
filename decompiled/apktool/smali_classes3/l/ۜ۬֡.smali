.class public abstract Ll/ۜ۬֡;
.super Ljava/lang/Object;
.source "K593"

# interfaces
.implements Ll/ۖ֫ۚ;


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 46
    check-cast p1, Ll/ۖ֫ۚ;

    .line 103
    invoke-interface {p0}, Ll/ۖ֫ۚ;->ܽۧ()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 105
    invoke-interface {p1}, Ll/ۖ֫ۚ;->ܽۧ()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    const/4 p1, 0x1

    return p1

    .line 109
    :cond_0
    invoke-interface {p1}, Ll/ۖ֫ۚ;->ܽۧ()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    const/4 p1, -0x1

    return p1

    .line 113
    :cond_1
    invoke-interface {p1}, Ll/ۖ֫ۚ;->ܽۧ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_2

    return v0

    .line 116
    :cond_2
    invoke-interface {p0}, Ll/ۖ֫ۚ;->۟()I

    move-result v0

    invoke-interface {p1}, Ll/ۖ֫ۚ;->۟()I

    move-result p1

    .line 133
    invoke-static {v0, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 92
    instance-of v0, p1, Ll/ۖ֫ۚ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 93
    check-cast p1, Ll/ۖ֫ۚ;

    .line 94
    invoke-interface {p0}, Ll/ۖ֫ۚ;->ܽۧ()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ll/ۖ֫ۚ;->ܽۧ()Ljava/lang/String;

    move-result-object v2

    .line 52
    invoke-static {v0, v2}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 95
    invoke-interface {p0}, Ll/ۖ֫ۚ;->۟()I

    move-result v0

    invoke-interface {p1}, Ll/ۖ֫ۚ;->۟()I

    move-result p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 85
    invoke-interface {p0}, Ll/ۖ֫ۚ;->ܽۧ()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 86
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 87
    invoke-interface {p0}, Ll/ۖ֫ۚ;->۟()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public ۫ۧ()Ll/᩸ܽۚ;
    .locals 2

    .line 69
    invoke-interface {p0}, Ll/ۖ֫ۚ;->ܽۧ()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 74
    :cond_0
    new-instance v1, Ll/᩻۬֡;

    invoke-direct {v1, v0}, Ll/᩻۬֡;-><init>(Ljava/lang/String;)V

    return-object v1
.end method
