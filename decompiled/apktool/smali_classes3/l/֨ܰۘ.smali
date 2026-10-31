.class public abstract Ll/֨ܰۘ;
.super Ljava/lang/Object;
.source "TAPP"

# interfaces
.implements Ll/ܽܽᩴ;


# virtual methods
.method public synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۚ۫ᩴ;->$default$forEachRemaining(Ll/֨۫ᩴ;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۧܽᩴ;->֫(Ll/ܽܽᩴ;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final bridge synthetic getComparator()Ljava/util/Comparator;
    .locals 1

    .line 29
    invoke-virtual {p0}, Ll/֨ܰۘ;->getComparator()Ll/֫ۧᩴ;

    const/4 v0, 0x0

    throw v0
.end method

.method public final getComparator()Ll/֫ۧᩴ;
    .locals 1

    .line 103
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public synthetic getExactSizeIfKnown()J
    .locals 2

    .line 0
    invoke-static {p0}, Ll/ۖ۫ᩴ;->$default$getExactSizeIfKnown(Ll/ܶ۫ᩴ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public synthetic hasCharacteristics(I)Z
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۖ۫ᩴ;->$default$hasCharacteristics(Ll/ܶ۫ᩴ;I)Z

    move-result p1

    return p1
.end method

.method public final synthetic tryAdvance(Ljava/util/function/Consumer;)Z
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۧܽᩴ;->ۧ(Ll/ܽܽᩴ;Ljava/util/function/Consumer;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic trySplit()Ll/ܶ۫ᩴ;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/ۚ۫ᩴ;->$default$trySplit(Ll/֨۫ᩴ;)Ll/ܶ۫ᩴ;

    move-result-object v0

    return-object v0
.end method
