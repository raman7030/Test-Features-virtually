.class public final Ll/᩻ۖܺ;
.super Ljava/lang/Object;
.source "VBFX"

# interfaces
.implements Ll/ܿۘܺ;


# instance fields
.field public ֫:Ljava/util/BitSet;


# virtual methods
.method public final ֫(Ll/۫ۖܺ;)V
    .locals 1

    .line 230
    invoke-virtual {p1}, Ll/۫ۖܺ;->᩵()Z

    move-result v0

    if-nez v0, :cond_0

    .line 258
    iget-object v0, p0, Ll/᩻ۖܺ;->֫:Ljava/util/BitSet;

    invoke-virtual {p1}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->set(I)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ܰۖܺ;)V
    .locals 1

    .line 230
    invoke-virtual {p1}, Ll/ܰۖܺ;->᩵()Z

    move-result v0

    if-nez v0, :cond_0

    .line 269
    iget-object v0, p0, Ll/᩻ۖܺ;->֫:Ljava/util/BitSet;

    invoke-virtual {p1}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->set(I)V

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/۫ۖܺ;)V
    .locals 1

    .line 278
    invoke-virtual {p1}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v0

    .line 230
    invoke-virtual {p1}, Ll/۫ۖܺ;->᩵()Z

    move-result p1

    if-nez p1, :cond_0

    if-eqz v0, :cond_0

    .line 280
    iget-object p1, p0, Ll/᩻ۖܺ;->֫:Ljava/util/BitSet;

    invoke-virtual {v0}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/util/BitSet;->set(I)V

    :cond_0
    return-void
.end method
