.class public final Ll/ۘܿ֡;
.super Ll/ᩴܿ֡;
.source "165B"


# instance fields
.field public ۜ:Ll/ۜܿ֡;

.field public ۢ:Ll/ܳܿ֡;

.field public ᩷:Ll/ۜܿ֡;

.field public ᩻:Ll/᩷ܿ֡;


# virtual methods
.method public final getText()Ljava/lang/String;
    .locals 5

    .line 72
    iget-object v0, p0, Ll/ۘܿ֡;->᩻:Ll/᩷ܿ֡;

    iget-object v1, p0, Ll/ۘܿ֡;->᩷:Ll/ۜܿ֡;

    iget-object v2, p0, Ll/ۘܿ֡;->ۜ:Ll/ۜܿ֡;

    if-eqz v2, :cond_1

    .line 73
    invoke-interface {v2}, Ll/ۜܿ֡;->ܽ()I

    move-result v2

    .line 74
    invoke-interface {v1}, Ll/ۜܿ֡;->ܽ()I

    move-result v3

    .line 75
    invoke-interface {v1}, Ll/ۜܿ֡;->getType()I

    move-result v1

    const/4 v4, -0x1

    if-ne v1, v4, :cond_0

    .line 76
    invoke-interface {v0}, Ll/ۨᩳ֡;->size()I

    move-result v3

    .line 78
    :cond_0
    invoke-interface {v0, v2, v3}, Ll/᩷ܿ֡;->֫(II)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 80
    :cond_1
    instance-of v1, v2, Ll/᩹ܿ֡;

    if-eqz v1, :cond_2

    .line 81
    check-cast v0, Ll/ۙܿ֡;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "n/a"

    return-object v0

    :cond_2
    const-string v0, "<unknown>"

    return-object v0
.end method

.method public final getType()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 93
    iget-object v0, p0, Ll/ۘܿ֡;->ۢ:Ll/ܳܿ֡;

    instance-of v1, v0, Ll/ۧܿ֡;

    const-string v2, ">"

    if-eqz v1, :cond_0

    .line 94
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "<missing type: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast v0, Ll/ۧܿ֡;

    .line 44
    iget v0, v0, Ll/۟ᩳ֡;->۫:I

    .line 0
    invoke-static {v0, v2, v1}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 98
    :cond_0
    instance-of v1, v0, Ll/ۢܿ֡;

    const-string v3, ", resync="

    if-eqz v1, :cond_1

    .line 99
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "<extraneous: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast v0, Ll/ۢܿ֡;

    .line 40
    iget-object v0, v0, Ll/ܳܿ֡;->۬:Ll/ۜܿ֡;

    .line 99
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ۘܿ֡;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 103
    :cond_1
    instance-of v1, v0, Ll/۟ᩳ֡;

    if-eqz v1, :cond_2

    .line 104
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "<mismatched token: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Ll/ܳܿ֡;->۬:Ll/ۜܿ֡;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ۘܿ֡;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 106
    :cond_2
    instance-of v1, v0, Ll/ܽܿ֡;

    if-eqz v1, :cond_3

    .line 107
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "<unexpected: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Ll/ܳܿ֡;->۬:Ll/ۜܿ֡;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ۘܿ֡;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 110
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "<error: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ۘܿ֡;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
