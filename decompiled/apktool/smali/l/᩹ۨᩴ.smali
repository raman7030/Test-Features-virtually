.class public final Ll/᩹ۨᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/ܶ۫ᩴ;


# instance fields
.field public final a:Ll/ܶ۫ᩴ;


# direct methods
.method public constructor <init>(Ll/ܶ۫ᩴ;)V
    .locals 0

    .line 684
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 685
    iput-object p1, p0, Ll/᩹ۨᩴ;->a:Ll/ܶ۫ᩴ;

    return-void
.end method


# virtual methods
.method public final characteristics()I
    .locals 1

    .line 718
    iget-object v0, p0, Ll/᩹ۨᩴ;->a:Ll/ܶ۫ᩴ;

    invoke-interface {v0}, Ll/ܶ۫ᩴ;->characteristics()I

    move-result v0

    return v0
.end method

.method public final estimateSize()J
    .locals 2

    .line 708
    iget-object v0, p0, Ll/᩹ۨᩴ;->a:Ll/ܶ۫ᩴ;

    invoke-interface {v0}, Ll/ܶ۫ᩴ;->estimateSize()J

    move-result-wide v0

    return-wide v0
.end method

.method public final forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 2

    .line 696
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 673
    new-instance v0, Ll/֫᩹ᩴ;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, Ll/֫᩹ᩴ;-><init>(Ljava/util/function/Consumer;I)V

    .line 697
    iget-object p1, p0, Ll/᩹ۨᩴ;->a:Ll/ܶ۫ᩴ;

    invoke-interface {p1, v0}, Ll/ܶ۫ᩴ;->forEachRemaining(Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final getComparator()Ljava/util/Comparator;
    .locals 1

    .line 728
    iget-object v0, p0, Ll/᩹ۨᩴ;->a:Ll/ܶ۫ᩴ;

    invoke-interface {v0}, Ll/ܶ۫ᩴ;->getComparator()Ljava/util/Comparator;

    move-result-object v0

    return-object v0
.end method

.method public final getExactSizeIfKnown()J
    .locals 2

    .line 713
    iget-object v0, p0, Ll/᩹ۨᩴ;->a:Ll/ܶ۫ᩴ;

    invoke-interface {v0}, Ll/ܶ۫ᩴ;->getExactSizeIfKnown()J

    move-result-wide v0

    return-wide v0
.end method

.method public final hasCharacteristics(I)Z
    .locals 1

    .line 723
    iget-object v0, p0, Ll/᩹ۨᩴ;->a:Ll/ܶ۫ᩴ;

    invoke-interface {v0, p1}, Ll/ܶ۫ᩴ;->hasCharacteristics(I)Z

    move-result p1

    return p1
.end method

.method public final tryAdvance(Ljava/util/function/Consumer;)Z
    .locals 2

    .line 690
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 673
    new-instance v0, Ll/֫᩹ᩴ;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, Ll/֫᩹ᩴ;-><init>(Ljava/util/function/Consumer;I)V

    .line 691
    iget-object p1, p0, Ll/᩹ۨᩴ;->a:Ll/ܶ۫ᩴ;

    invoke-interface {p1, v0}, Ll/ܶ۫ᩴ;->tryAdvance(Ljava/util/function/Consumer;)Z

    move-result p1

    return p1
.end method

.method public final trySplit()Ll/ܶ۫ᩴ;
    .locals 2

    .line 702
    iget-object v0, p0, Ll/᩹ۨᩴ;->a:Ll/ܶ۫ᩴ;

    invoke-interface {v0}, Ll/ܶ۫ᩴ;->trySplit()Ll/ܶ۫ᩴ;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 703
    :cond_0
    new-instance v1, Ll/᩹ۨᩴ;

    invoke-direct {v1, v0}, Ll/᩹ۨᩴ;-><init>(Ll/ܶ۫ᩴ;)V

    return-object v1
.end method
