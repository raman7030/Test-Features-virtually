.class public final Ll/ᩳܽ֨;
.super Ll/ۨ֫֨;
.source "J7E7"


# virtual methods
.method public final ֨()Ljava/lang/String;
    .locals 3

    .line 44
    iget-object v0, p0, Ll/ۨ֫֨;->᩺֫:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 45
    iget-boolean v0, p0, Ll/ۢܽ֨;->֫֫:Z

    iget-object v1, p0, Ll/ۨ֫֨;->۟֫:Ll/ۤۧ֨;

    if-eqz v0, :cond_0

    .line 46
    iget v0, p0, Ll/ۨ֫֨;->ۗ֫:I

    new-instance v2, Ll/ۧܽ֨;

    invoke-direct {v2, p0}, Ll/ۧܽ֨;-><init>(Ll/ᩳܽ֨;)V

    invoke-virtual {v1, v0, v2}, Ll/ۤۧ֨;->֫(ILjava/util/function/Function;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۨ֫֨;->᩺֫:Ljava/lang/String;

    goto :goto_0

    .line 48
    :cond_0
    iget v0, p0, Ll/ۨ֫֨;->ۗ֫:I

    new-instance v2, Ll/ܽܽ֨;

    invoke-direct {v2, p0}, Ll/ܽܽ֨;-><init>(Ll/ᩳܽ֨;)V

    .line 49
    invoke-virtual {v1, v0, v2}, Ll/ۤۧ֨;->֫(ILjava/util/function/Function;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "\""

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 51
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۨ֫֨;->᩺֫:Ljava/lang/String;

    .line 53
    :goto_0
    iget v0, p0, Ll/ۨ֫֨;->ۨ֫:I

    if-eqz v0, :cond_1

    .line 54
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ll/ۨ֫֨;->᩺֫:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۨ֫֨;->ۨ֫:I

    invoke-virtual {v1, v2}, Ll/ۤۧ֨;->ܶ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۨ֫֨;->᩺֫:Ljava/lang/String;

    .line 57
    :cond_1
    iget-object v0, p0, Ll/ۨ֫֨;->᩺֫:Ljava/lang/String;

    return-object v0
.end method
