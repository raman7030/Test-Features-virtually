.class public final synthetic Ll/᩸ܳ᩵;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/֨۫ᩴ;


# instance fields
.field public final synthetic a:Ljava/util/Spliterator$OfPrimitive;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Spliterator$OfPrimitive;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸ܳ᩵;->a:Ljava/util/Spliterator$OfPrimitive;

    return-void
.end method

.method public static synthetic a(Ljava/util/Spliterator$OfPrimitive;)Ll/֨۫ᩴ;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    instance-of v0, p0, Ll/᩶ܳ᩵;

    if-eqz v0, :cond_1

    check-cast p0, Ll/᩶ܳ᩵;

    iget-object p0, p0, Ll/᩶ܳ᩵;->a:Ll/֨۫ᩴ;

    return-object p0

    :cond_1
    instance-of v0, p0, Ljava/util/Spliterator$OfDouble;

    if-eqz v0, :cond_2

    check-cast p0, Ljava/util/Spliterator$OfDouble;

    invoke-static {p0}, Ll/᩵ۨᩴ;->a(Ljava/util/Spliterator$OfDouble;)Ll/۠ۨᩴ;

    move-result-object p0

    return-object p0

    :cond_2
    instance-of v0, p0, Ljava/util/Spliterator$OfInt;

    if-eqz v0, :cond_3

    check-cast p0, Ljava/util/Spliterator$OfInt;

    invoke-static {p0}, Ll/᩸ۨᩴ;->a(Ljava/util/Spliterator$OfInt;)Ll/ᩴ۫ᩴ;

    move-result-object p0

    return-object p0

    :cond_3
    instance-of v0, p0, Ljava/util/Spliterator$OfLong;

    if-eqz v0, :cond_4

    check-cast p0, Ljava/util/Spliterator$OfLong;

    invoke-static {p0}, Ll/ۗۨᩴ;->a(Ljava/util/Spliterator$OfLong;)Ll/֡۫ᩴ;

    move-result-object p0

    return-object p0

    :cond_4
    new-instance v0, Ll/᩸ܳ᩵;

    invoke-direct {v0, p0}, Ll/᩸ܳ᩵;-><init>(Ljava/util/Spliterator$OfPrimitive;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic characteristics()I
    .locals 1

    iget-object v0, p0, Ll/᩸ܳ᩵;->a:Ljava/util/Spliterator$OfPrimitive;

    invoke-interface {v0}, Ljava/util/Spliterator;->characteristics()I

    move-result v0

    return v0
.end method

.method public final synthetic equals(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Ll/᩸ܳ᩵;->a:Ljava/util/Spliterator$OfPrimitive;

    instance-of v1, p1, Ll/᩸ܳ᩵;

    if-eqz v1, :cond_0

    check-cast p1, Ll/᩸ܳ᩵;

    iget-object p1, p1, Ll/᩸ܳ᩵;->a:Ljava/util/Spliterator$OfPrimitive;

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic estimateSize()J
    .locals 2

    iget-object v0, p0, Ll/᩸ܳ᩵;->a:Ljava/util/Spliterator$OfPrimitive;

    invoke-interface {v0}, Ljava/util/Spliterator;->estimateSize()J

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Ll/᩸ܳ᩵;->a:Ljava/util/Spliterator$OfPrimitive;

    invoke-interface {v0, p1}, Ljava/util/Spliterator$OfPrimitive;->forEachRemaining(Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 1

    iget-object v0, p0, Ll/᩸ܳ᩵;->a:Ljava/util/Spliterator$OfPrimitive;

    invoke-interface {v0, p1}, Ljava/util/Spliterator;->forEachRemaining(Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final synthetic getComparator()Ljava/util/Comparator;
    .locals 1

    iget-object v0, p0, Ll/᩸ܳ᩵;->a:Ljava/util/Spliterator$OfPrimitive;

    invoke-interface {v0}, Ljava/util/Spliterator;->getComparator()Ljava/util/Comparator;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic getExactSizeIfKnown()J
    .locals 2

    iget-object v0, p0, Ll/᩸ܳ᩵;->a:Ljava/util/Spliterator$OfPrimitive;

    invoke-interface {v0}, Ljava/util/Spliterator;->getExactSizeIfKnown()J

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic hasCharacteristics(I)Z
    .locals 1

    iget-object v0, p0, Ll/᩸ܳ᩵;->a:Ljava/util/Spliterator$OfPrimitive;

    invoke-interface {v0, p1}, Ljava/util/Spliterator;->hasCharacteristics(I)Z

    move-result p1

    return p1
.end method

.method public final synthetic hashCode()I
    .locals 1

    iget-object v0, p0, Ll/᩸ܳ᩵;->a:Ljava/util/Spliterator$OfPrimitive;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final synthetic tryAdvance(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Ll/᩸ܳ᩵;->a:Ljava/util/Spliterator$OfPrimitive;

    invoke-interface {v0, p1}, Ljava/util/Spliterator$OfPrimitive;->tryAdvance(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic tryAdvance(Ljava/util/function/Consumer;)Z
    .locals 1

    iget-object v0, p0, Ll/᩸ܳ᩵;->a:Ljava/util/Spliterator$OfPrimitive;

    invoke-interface {v0, p1}, Ljava/util/Spliterator;->tryAdvance(Ljava/util/function/Consumer;)Z

    move-result p1

    return p1
.end method

.method public final synthetic trySplit()Ll/֨۫ᩴ;
    .locals 1

    iget-object v0, p0, Ll/᩸ܳ᩵;->a:Ljava/util/Spliterator$OfPrimitive;

    invoke-interface {v0}, Ljava/util/Spliterator$OfPrimitive;->trySplit()Ljava/util/Spliterator$OfPrimitive;

    move-result-object v0

    invoke-static {v0}, Ll/᩸ܳ᩵;->a(Ljava/util/Spliterator$OfPrimitive;)Ll/֨۫ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic trySplit()Ll/ܶ۫ᩴ;
    .locals 1

    iget-object v0, p0, Ll/᩸ܳ᩵;->a:Ljava/util/Spliterator$OfPrimitive;

    invoke-interface {v0}, Ljava/util/Spliterator$OfPrimitive;->trySplit()Ljava/util/Spliterator;

    move-result-object v0

    invoke-static {v0}, Ll/ۗܳ᩵;->a(Ljava/util/Spliterator;)Ll/ܶ۫ᩴ;

    move-result-object v0

    return-object v0
.end method
