.class public abstract Ll/ܰۧ᩵;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/ܶ۫ᩴ;


# instance fields
.field public a:I


# virtual methods
.method public final characteristics()I
    .locals 1

    const/16 v0, 0x4450

    return v0
.end method

.method public final estimateSize()J
    .locals 2

    .line 309
    iget v0, p0, Ll/ܰۧ᩵;->a:I

    neg-int v0, v0

    add-int/lit8 v0, v0, -0x1

    int-to-long v0, v0

    return-wide v0
.end method

.method public final synthetic getComparator()Ljava/util/Comparator;
    .locals 1

    invoke-static {p0}, Ll/ۖ۫ᩴ;->$default$getComparator(Ll/ܶ۫ᩴ;)Ljava/util/Comparator;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic getExactSizeIfKnown()J
    .locals 2

    invoke-static {p0}, Ll/ۖ۫ᩴ;->$default$getExactSizeIfKnown(Ll/ܶ۫ᩴ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic hasCharacteristics(I)Z
    .locals 0

    invoke-static {p0, p1}, Ll/ۖ۫ᩴ;->$default$hasCharacteristics(Ll/ܶ۫ᩴ;I)Z

    move-result p1

    return p1
.end method

.method public final trySplit()Ll/ܶ۫ᩴ;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
