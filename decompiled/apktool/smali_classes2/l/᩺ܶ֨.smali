.class public Ll/᩺ܶ֨;
.super Ll/۫᩸֨;
.source "X43L"


# virtual methods
.method public ֫(Ll/ۡ֨֨;)Ljava/lang/Integer;
    .locals 0

    .line 4225
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/Object;Ll/ۙ֨֨;)Ljava/lang/Object;
    .locals 0

    .line 4181
    check-cast p1, Ljava/lang/Void;

    .line 4183
    invoke-virtual {p2}, Ll/ۙ֨֨;->֫֫()Ll/ۢ۠֨;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/֨֨֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 4181
    check-cast p2, Ljava/lang/Void;

    .line 4230
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۚۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 4181
    check-cast p2, Ljava/lang/Void;

    .line 4220
    iget-object p1, p1, Ll/ۚۚ֨;->ۤ:Ll/ۙ֨֨;

    const/4 p2, 0x0

    .line 4980
    invoke-virtual {p1, p0, p2}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 4220
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    add-int/lit8 p1, p1, 0xc

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic ֫(Ll/ۡ֨֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 4181
    check-cast p2, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Ll/᩺ܶ֨;->֫(Ll/ۡ֨֨;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۧ֨֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 4181
    check-cast p2, Ljava/lang/Void;

    .line 4200
    sget-object p2, Ll/ۢ۠֨;->ܿ֫:Ll/ۢ۠֨;

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    .line 4201
    iget-object v0, p1, Ll/ۧ֨֨;->ۤ:Ll/ۖܶ۠;

    .line 4202
    :goto_0
    iget-object v1, v0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    shl-int/lit8 p2, p2, 0x5

    .line 4204
    iget-object v1, v0, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v1, Ll/ۙ֨֨;

    .line 4980
    invoke-virtual {v1, p0, v2}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 4204
    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    add-int/2addr p2, v1

    .line 4203
    iget-object v0, v0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_0

    :cond_0
    shl-int/lit8 p2, p2, 0x5

    .line 4205
    iget-object p1, p1, Ll/ۧ֨֨;->ۨ:Ll/ۙ֨֨;

    .line 4980
    invoke-virtual {p1, p0, v2}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 4205
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    add-int/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic ֫(Ll/۫ۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 4181
    check-cast p2, Ljava/lang/Void;

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/᩶֨֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 4181
    check-cast p2, Ljava/lang/Void;

    .line 4210
    iget-object p2, p1, Ll/᩶֨֨;->ۨ:Ll/ܺۘ֨;

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result p2

    .line 4211
    iget-object p1, p1, Ll/᩶֨֨;->᩺:Ll/ۙ֨֨;

    if-eqz p1, :cond_0

    mul-int/lit8 p2, p2, 0x7f

    const/4 v0, 0x0

    .line 4980
    invoke-virtual {p1, p0, v0}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 4213
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    add-int/2addr p2, p1

    .line 4215
    :cond_0
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/᩶ۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 4181
    check-cast p2, Ljava/lang/Void;

    .line 4188
    invoke-virtual {p1}, Ll/᩶ۚ֨;->۫()Ll/ۙ֨֨;

    move-result-object p2

    const/4 v0, 0x0

    .line 4980
    invoke-virtual {p2, p0, v0}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 4188
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    mul-int/lit8 p2, p2, 0x7f

    .line 4190
    iget-object v1, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v1}, Ll/ۛ֡֨;->۫()Ll/ۤܶ۠;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, p2

    .line 4191
    invoke-virtual {p1}, Ll/᩶ۚ֨;->ܽ֫()Ll/ۖܶ۠;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۙ֨֨;

    mul-int/lit8 v1, v1, 0x7f

    .line 4980
    invoke-virtual {p2, p0, v0}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 4193
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    add-int/2addr v1, p2

    goto :goto_0

    .line 4195
    :cond_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
