.class public final Ll/ۘ֡᩵;
.super Ll/ۡ֡᩵;
.source "G9YB"


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 66
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "NodeStatusRequest["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-super {p0}, Ll/ۡ֡᩵;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "]"

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 66
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ֫(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ᩳ(I[B)I
    .locals 4

    .line 38
    iget-object v0, p0, Ll/ۡ֡᩵;->ۚ:Ll/ܽ֡᩵;

    iget v1, v0, Ll/ܽ֡᩵;->ۧ:I

    const/4 v2, 0x0

    .line 39
    iput v2, v0, Ll/ܽ֡᩵;->ۧ:I

    .line 168
    invoke-virtual {v0, p1, p2}, Ll/ܽ֡᩵;->ۧ(I[B)I

    move-result v0

    add-int/2addr v0, p1

    .line 169
    iget v2, p0, Ll/ۡ֡᩵;->֨:I

    invoke-static {v2, v0, p2}, Ll/ۡ֡᩵;->֫(II[B)V

    add-int/lit8 v2, v0, 0x2

    .line 171
    iget v3, p0, Ll/ۡ֡᩵;->᩵:I

    invoke-static {v3, v2, p2}, Ll/ۡ֡᩵;->֫(II[B)V

    add-int/lit8 v0, v0, 0x4

    sub-int/2addr v0, p1

    .line 41
    iget-object p1, p0, Ll/ۡ֡᩵;->ۚ:Ll/ܽ֡᩵;

    iput v1, p1, Ll/ܽ֡᩵;->ۧ:I

    return v0
.end method
