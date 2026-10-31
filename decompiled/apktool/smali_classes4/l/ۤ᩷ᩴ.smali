.class public final Ll/ۤ᩷ᩴ;
.super Ll/۫᩷ᩴ;
.source "X5U"

# interfaces
.implements Ll/ܶۡᩴ;
.implements Ll/۫۬ᩴ;


# virtual methods
.method public final synthetic add(I)V
    .locals 0

    .line 0
    invoke-static {}, Ll/۠ۡᩴ;->֫()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final bridge synthetic add(Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۡᩴ;->֫(Ll/ܶۡᩴ;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܿ۫ᩴ;->$default$forEachRemaining(Ll/ܳ۫ᩴ;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۡᩴ;->֫(Ll/ۜۡᩴ;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public synthetic forEachRemaining(Ljava/util/function/IntConsumer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܿ۫ᩴ;->$default$forEachRemaining(Ll/ܳ۫ᩴ;Ljava/util/function/IntConsumer;)V

    return-void
.end method

.method public final next()Ljava/lang/Integer;
    .locals 1

    .line 103
    invoke-static {p0}, Ll/᩻ۡᩴ;->֫(Ll/ۜۡᩴ;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 31
    invoke-virtual {p0}, Ll/ۤ᩷ᩴ;->next()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final nextInt()I
    .locals 1

    .line 1656
    invoke-virtual {p0}, Ll/᩺᩷ᩴ;->֫()Ll/۠᩷ᩴ;

    move-result-object v0

    iget v0, v0, Ll/ۚܿᩴ;->᩸:I

    return v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 1

    .line 44
    invoke-virtual {p0}, Ll/ۤ᩷ᩴ;->ۖ֫()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic set(Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۡᩴ;->ۧ(Ll/ܶۡᩴ;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic ֫(I)V
    .locals 0

    .line 0
    invoke-static {}, Ll/۠ۡᩴ;->ۧ()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final synthetic ֫(Ljava/lang/Integer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۡᩴ;->֫(Ll/ܶۡᩴ;Ljava/lang/Integer;)V

    return-void
.end method

.method public final ۖ֫()I
    .locals 1

    .line 1661
    invoke-virtual {p0}, Ll/᩺᩷ᩴ;->ۧ()Ll/۠᩷ᩴ;

    move-result-object v0

    iget v0, v0, Ll/ۚܿᩴ;->᩸:I

    return v0
.end method

.method public final synthetic ۧ(Ljava/lang/Integer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۡᩴ;->ۧ(Ll/ܶۡᩴ;Ljava/lang/Integer;)V

    return-void
.end method
