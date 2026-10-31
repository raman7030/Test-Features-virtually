.class public final Ll/۠۟ۘ;
.super Ll/֨۟ۘ;
.source "5SO"

# interfaces
.implements Ll/ܶۧᩴ;
.implements Ll/۫۬ᩴ;


# virtual methods
.method public final bridge synthetic add(Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۧᩴ;->֫(Ll/ܶۧᩴ;Ljava/lang/Object;)V

    return-void
.end method

.method public final bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 29
    check-cast p1, Ll/᩻ۧᩴ;

    invoke-virtual {p0, p1}, Ll/۠۟ۘ;->ۧ(Ll/᩻ۧᩴ;)V

    return-void
.end method

.method public final synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۡۧᩴ;->֫(Ll/ܺۧᩴ;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 103
    invoke-static {p0}, Ll/ۡۧᩴ;->֫(Ll/ܶۧᩴ;)Ljava/lang/Character;

    move-result-object v0

    return-object v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 1

    .line 44
    invoke-virtual {p0}, Ll/۠۟ۘ;->᩺֫()C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic set(Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۧᩴ;->ۧ(Ll/ܶۧᩴ;Ljava/lang/Object;)V

    return-void
.end method

.method public final ֡ۧ()C
    .locals 1

    .line 1713
    invoke-virtual {p0}, Ll/᩹۟ۘ;->֫()Ll/ۡ۟ۘ;

    move-result-object v0

    iget-char v0, v0, Ll/ܿܰۘ;->᩸:C

    return v0
.end method

.method public final synthetic ֫(Ljava/lang/Character;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۧᩴ;->֫(Ll/ܶۧᩴ;Ljava/lang/Character;)V

    return-void
.end method

.method public final ۧ(C)V
    .locals 0

    .line 56
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final synthetic ۧ(Ll/᩻ۧᩴ;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۡۧᩴ;->֫(Ll/ܺۧᩴ;Ll/᩻ۧᩴ;)V

    return-void
.end method

.method public final synthetic ܽ(Ljava/lang/Character;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۧᩴ;->ۧ(Ll/ܶۧᩴ;Ljava/lang/Character;)V

    return-void
.end method

.method public final ᩳ(C)V
    .locals 0

    .line 43
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ᩺֫()C
    .locals 1

    .line 1718
    invoke-virtual {p0}, Ll/᩹۟ۘ;->ۧ()Ll/ۡ۟ۘ;

    move-result-object v0

    iget-char v0, v0, Ll/ܿܰۘ;->᩸:C

    return v0
.end method
