.class public final Ll/ۖ֫֨;
.super Ll/ۢ֫֨;
.source "C5BI"


# instance fields
.field public ۜۧ:I

.field public ᩷ۧ:I


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 276
    iget-object v0, p0, Ll/ۨܽ֨;->֫ۧ:Ljava/lang/String;

    invoke-virtual {p0}, Ll/ۖ֫֨;->᩹()Ljava/lang/String;

    move-result-object v1

    const-string v2, " "

    const-string v3, ">"

    const-string v4, "<"

    .line 0
    invoke-static {v4, v0, v2, v1, v3}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()V
    .locals 4

    .line 281
    invoke-virtual {p0}, Ll/ۨܽ֨;->֨()Ll/ۛܽ֨;

    move-result-object v0

    sget-object v1, Ll/ۛܽ֨;->᩶:Ll/ۛܽ֨;

    if-ne v0, v1, :cond_0

    .line 282
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ۨܽ֨;->۠()Ljava/lang/String;

    move-result-object v1

    const-string v2, "%s }"

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 282
    invoke-virtual {p0}, Ll/ۖ֫֨;->᩹()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    invoke-virtual {p0, v0, v2}, Ll/ۢܽ֨;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 284
    :cond_0
    invoke-virtual {p0}, Ll/ۖ֫֨;->᩹()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۢܽ֨;->ۧ(Ljava/lang/String;)V

    return-void
.end method

.method public final ᩹()Ljava/lang/String;
    .locals 8

    .line 255
    iget v0, p0, Ll/ۖ֫֨;->᩷ۧ:I

    iget v1, p0, Ll/ۖ֫֨;->ۜۧ:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 257
    sget-object v3, Ll/۟۫ۚ;->᩺:Ll/۟۫ۚ;

    iget-object v4, p0, Ll/ۢ֫֨;->᩻ۧ:Ll/۟۫ۚ;

    if-ne v4, v3, :cond_1

    .line 259
    iget-object v3, p0, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    invoke-virtual {v3, v1}, Ll/ۤۧ֨;->getName(I)Ljava/lang/String;

    move-result-object v3

    .line 260
    iget-object v5, p0, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    invoke-virtual {v5, v0}, Ll/ۤۧ֨;->getName(I)Ljava/lang/String;

    move-result-object v5

    .line 261
    invoke-virtual {v4}, Ll/۟۫ۚ;->֫()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x20

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 262
    iget-boolean v4, p0, Ll/ۢܽ֨;->֫֫:Z

    const-string v6, "."

    if-eqz v4, :cond_0

    .line 263
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v1, v4, v7

    const/4 v1, 0x1

    aput-object v0, v4, v1

    const-string v0, "#%d.#%d"

    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    iget-boolean v0, p0, Ll/ۢܽ֨;->ܺ֫:Z

    if-nez v0, :cond_1

    const-string v0, " /* "

    const-string v1, " */"

    .line 0
    invoke-static {v0, v3, v6, v5, v1}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 265
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 0
    :cond_0
    invoke-static {v2, v3, v6, v5}, Ll/᩶۫᩷;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    :cond_1
    :goto_0
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
