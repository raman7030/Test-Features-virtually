.class public final Ll/۠ᩳۘ;
.super Ll/ܶᩳۘ;
.source "L9HO"


# virtual methods
.method public final ֫(Ll/᩻۫ۖ;)V
    .locals 3

    .line 80
    invoke-virtual {p1}, Ll/᩻۫ۖ;->ᩳ()Ll/ۚ۬ۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۚ۬ۖ;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "not_defined_in_RFC4178@please_ignore"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 84
    :cond_0
    invoke-virtual {p1}, Ll/᩻۫ۖ;->ܿ()I

    move-result v0

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_3

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    goto :goto_0

    .line 101
    :cond_1
    new-instance v0, Ll/᩶ᩳۘ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown Object Tag "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/᩻۫ۖ;->ܿ()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " encountered."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 23
    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 101
    throw v0

    .line 92
    :cond_2
    invoke-virtual {p1}, Ll/᩻۫ۖ;->ᩳ()Ll/ۚ۬ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܶᩳۘ;->ۧ(Ll/ۚ۬ۖ;)V

    :cond_3
    :goto_0
    return-void

    .line 86
    :cond_4
    invoke-virtual {p1}, Ll/᩻۫ۖ;->ᩳ()Ll/ۚ۬ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܶᩳۘ;->ܽ(Ll/ۚ۬ۖ;)V

    return-void
.end method
