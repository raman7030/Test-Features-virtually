.class public final Ll/᩸ۛۖ;
.super Ll/ᩳۨۖ;
.source "H9IV"


# virtual methods
.method public final ܿ()Ll/ᩳۨۖ;
    .locals 2

    .line 77
    invoke-virtual {p0}, Ll/۠֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v0

    check-cast v0, Ll/᩻ۨۖ;

    invoke-virtual {v0}, Ll/᩻ۨۖ;->᩷()I

    move-result v0

    if-eqz v0, :cond_0

    .line 37
    new-instance v0, Ll/᩸ۛۖ;

    iget-object v1, p0, Ll/۠֫ۘ;->֫:Ll/֡֫ۘ;

    .line 31
    invoke-direct {v0, v1}, Ll/ᩳۨۖ;-><init>(Ll/֡֫ۘ;)V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
