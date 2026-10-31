.class public final Ll/᩹۫֨;
.super Ll/ܽ۫֨;
.source "W7SR"


# instance fields
.field public ᩻:Z


# virtual methods
.method public final ֫(Ll/ۢ֡۠;)V
    .locals 1

    .line 1322
    invoke-super {p0, p1}, Ll/ܽ۫֨;->֫(Ll/ۢ֡۠;)V

    .line 1323
    invoke-virtual {p1}, Ll/ۢ֡۠;->᩷֫()Ll/ۜ֡۠;

    move-result-object p1

    sget-object v0, Ll/ۜ֡۠;->ۙ:Ll/ۜ֡۠;

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    .line 1324
    iput-boolean p1, p0, Ll/᩹۫֨;->᩻:Z

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ܳ֡۠;)V
    .locals 1

    .line 1314
    invoke-super {p0, p1}, Ll/ܽ۫֨;->֫(Ll/ܳ֡۠;)V

    .line 1315
    iget-object p1, p1, Ll/ܳ֡۠;->ۛ:Ll/ܿ֡۠;

    sget-object v0, Ll/ܿ֡۠;->᩶:Ll/ܿ֡۠;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    .line 1316
    iput-boolean p1, p0, Ll/᩹۫֨;->᩻:Z

    :cond_0
    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 1305
    invoke-super {p0}, Ll/ܽ۫֨;->֫()Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/᩹۫֨;->᩻:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
