.class public final Ll/֡᩹ۚ;
.super Ll/᩸᩹ۚ;
.source "0BJO"


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 153
    iget-object v0, p0, Ll/᩸᩹ۚ;->֫:Ll/᩷᩹ۚ;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-string v0, "%s + "

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩶֡ۚ;Ll/᩶֡ۚ;)Z
    .locals 1

    if-ne p1, p2, :cond_0

    goto :goto_0

    .line 147
    :cond_0
    invoke-virtual {p2}, Ll/᩶֡ۚ;->ܳ֫()Ll/᩶֡ۚ;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 148
    iget-object v0, p0, Ll/᩸᩹ۚ;->֫:Ll/᩷᩹ۚ;

    invoke-virtual {v0, p1, p2}, Ll/᩷᩹ۚ;->֫(Ll/᩶֡ۚ;Ll/᩶֡ۚ;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
