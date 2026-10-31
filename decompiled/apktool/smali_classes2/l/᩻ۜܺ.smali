.class public final Ll/᩻ۜܺ;
.super Ll/᩵ۜܺ;
.source "Z4GR"


# virtual methods
.method public final ֫()Ll/ۘۜܺ;
    .locals 1

    .line 39
    sget-object v0, Ll/ۘۜܺ;->ᩳ֫:Ll/ۘۜܺ;

    return-object v0
.end method

.method public final ֫(Ll/֫ۜܺ;)V
    .locals 1

    .line 47
    invoke-super {p0, p1}, Ll/᩵ۜܺ;->֫(Ll/֫ۜܺ;)V

    .line 49
    invoke-virtual {p1}, Ll/֫ۜܺ;->᩵()Ll/ܽ᩷ܺ;

    move-result-object p1

    .line 59
    invoke-virtual {p0}, Ll/᩵ۜܺ;->ۢ()Ll/ܶܺܺ;

    move-result-object v0

    check-cast v0, Ll/ۡܺܺ;

    .line 50
    invoke-virtual {v0}, Ll/ۡܺܺ;->getType()Ll/۟ܺܺ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ܽ᩷ܺ;->ۧ(Ll/۟ܺܺ;)V

    return-void
.end method

.method public final ۡ()Ljava/lang/String;
    .locals 1

    const-string v0, "type_idx"

    return-object v0
.end method

.method public final ۧ(Ll/֫ۜܺ;)I
    .locals 1

    .line 67
    invoke-virtual {p1}, Ll/֫ۜܺ;->᩵()Ll/ܽ᩷ܺ;

    move-result-object p1

    .line 59
    invoke-virtual {p0}, Ll/᩵ۜܺ;->ۢ()Ll/ܶܺܺ;

    move-result-object v0

    check-cast v0, Ll/ۡܺܺ;

    .line 68
    invoke-virtual {v0}, Ll/ۡܺܺ;->getType()Ll/۟ܺܺ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ܽ᩷ܺ;->֫(Ll/۟ܺܺ;)I

    move-result p1

    return p1
.end method
