.class public final Ll/ۜܽᩴ;
.super Ljava/lang/Object;
.source "4AQC"

# interfaces
.implements Ll/ܽܽᩴ;
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# static fields
.field public static final serialVersionUID:J = 0x744911981e291cdcL


# direct methods
.method private readResolve()Ljava/lang/Object;
    .locals 1

    .line 100
    sget-object v0, Ll/ܺܽᩴ;->֫:Ll/ۜܽᩴ;

    return-object v0
.end method


# virtual methods
.method public final characteristics()I
    .locals 1

    const/16 v0, 0x4040

    return v0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 96
    sget-object v0, Ll/ܺܽᩴ;->֫:Ll/ۜܽᩴ;

    return-object v0
.end method

.method public final estimateSize()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 52
    check-cast p1, Ll/᩻ۧᩴ;

    return-void
.end method

.method public final forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public final bridge synthetic getComparator()Ljava/util/Comparator;
    .locals 1

    .line 29
    invoke-virtual {p0}, Ll/ۜܽᩴ;->getComparator()Ll/֫ۧᩴ;

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

.method public final bridge synthetic tryAdvance(Ljava/lang/Object;)Z
    .locals 0

    .line 52
    check-cast p1, Ll/᩻ۧᩴ;

    const/4 p1, 0x0

    return p1
.end method

.method public final tryAdvance(Ljava/util/function/Consumer;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p1, 0x0

    return p1
.end method

.method public final bridge synthetic trySplit()Ll/֨۫ᩴ;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final bridge synthetic trySplit()Ll/ܶ۫ᩴ;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
