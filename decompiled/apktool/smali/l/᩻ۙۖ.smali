.class public final Ll/᩻ۙۖ;
.super Ll/᩺᩶ۖ;
.source "05TK"


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 35
    sget-object v0, Ll/ܳۙۖ;->֫:[I

    iget-object v1, p0, Ll/֫ۙۖ;->᩷:Ll/۟᩶ۖ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    .line 48
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 45
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/᩺᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " ::END"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 43
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "return "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩺᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 41
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "throw "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩺᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 39
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "unlock "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩺᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 37
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "lock "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩺᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֨᩹ۖ;)Ll/֫ۙۖ;
    .locals 2

    .line 30
    new-instance v0, Ll/᩻ۙۖ;

    iget-object v1, p0, Ll/᩺᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    invoke-virtual {v1, p1}, Ll/۠᩶ۖ;->֫(Ll/֨᩹ۖ;)Ll/۠᩶ۖ;

    move-result-object p1

    .line 25
    iget-object v1, p0, Ll/֫ۙۖ;->᩷:Ll/۟᩶ۖ;

    invoke-direct {v0, v1, p1}, Ll/᩺᩶ۖ;-><init>(Ll/۟᩶ۖ;Ll/۠᩶ۖ;)V

    return-object v0
.end method
