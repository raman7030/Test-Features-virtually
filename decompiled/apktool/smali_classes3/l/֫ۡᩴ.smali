.class public final Ll/֫ۡᩴ;
.super Ljava/lang/Object;
.source "K9S0"

# interfaces
.implements Ll/ܽܺᩴ;


# instance fields
.field public final synthetic ᩶:Ll/ۧۡᩴ;

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/ۧۡᩴ;)V
    .locals 2

    .line 329
    invoke-static {p1}, Ll/ۧۡᩴ;->֫(Ll/ۧۡᩴ;)[I

    move-result-object v0

    array-length v0, v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0}, Ll/֫ۡᩴ;-><init>(Ll/ۧۡᩴ;II)V

    return-void
.end method

.method public constructor <init>(Ll/ۧۡᩴ;II)V
    .locals 0

    .line 332
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫ۡᩴ;->᩶:Ll/ۧۡᩴ;

    .line 334
    iput p2, p0, Ll/֫ۡᩴ;->᩹:I

    .line 335
    iput p3, p0, Ll/֫ۡᩴ;->᩸:I

    return-void
.end method


# virtual methods
.method public final characteristics()I
    .locals 1

    const/16 v0, 0x4550

    return v0
.end method

.method public final estimateSize()J
    .locals 2

    .line 345
    iget v0, p0, Ll/֫ۡᩴ;->᩸:I

    iget v1, p0, Ll/֫ۡᩴ;->᩹:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    return-wide v0
.end method

.method public final bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 325
    check-cast p1, Ljava/util/function/IntConsumer;

    invoke-virtual {p0, p1}, Ll/֫ۡᩴ;->forEachRemaining(Ljava/util/function/IntConsumer;)V

    return-void
.end method

.method public final synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۧܺᩴ;->֫(Ll/ܽܺᩴ;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final forEachRemaining(Ljava/util/function/IntConsumer;)V
    .locals 3

    .line 357
    iget-object v0, p0, Ll/֫ۡᩴ;->᩶:Ll/ۧۡᩴ;

    invoke-static {v0}, Ll/ۧۡᩴ;->֫(Ll/ۧۡᩴ;)[I

    move-result-object v0

    .line 358
    :goto_0
    iget v1, p0, Ll/֫ۡᩴ;->᩹:I

    iget v2, p0, Ll/֫ۡᩴ;->᩸:I

    if-ge v1, v2, :cond_0

    .line 359
    aget v1, v0, v1

    invoke-interface {p1, v1}, Ljava/util/function/IntConsumer;->accept(I)V

    .line 358
    iget v1, p0, Ll/֫ۡᩴ;->᩹:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/֫ۡᩴ;->᩹:I

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final bridge synthetic getComparator()Ljava/util/Comparator;
    .locals 1

    .line 29
    invoke-virtual {p0}, Ll/֫ۡᩴ;->getComparator()Ll/ۙۢᩴ;

    const/4 v0, 0x0

    throw v0
.end method

.method public final getComparator()Ll/ۙۢᩴ;
    .locals 1

    .line 158
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

    .line 325
    check-cast p1, Ljava/util/function/IntConsumer;

    invoke-virtual {p0, p1}, Ll/֫ۡᩴ;->tryAdvance(Ljava/util/function/IntConsumer;)Z

    move-result p1

    return p1
.end method

.method public final synthetic tryAdvance(Ljava/util/function/Consumer;)Z
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۧܺᩴ;->ۧ(Ll/ܽܺᩴ;Ljava/util/function/Consumer;)Z

    move-result p1

    return p1
.end method

.method public final tryAdvance(Ljava/util/function/IntConsumer;)Z
    .locals 3

    .line 350
    iget v0, p0, Ll/֫ۡᩴ;->᩹:I

    iget v1, p0, Ll/֫ۡᩴ;->᩸:I

    if-lt v0, v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 351
    :cond_0
    iget-object v0, p0, Ll/֫ۡᩴ;->᩶:Ll/ۧۡᩴ;

    invoke-static {v0}, Ll/ۧۡᩴ;->֫(Ll/ۧۡᩴ;)[I

    move-result-object v0

    iget v1, p0, Ll/֫ۡᩴ;->᩹:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/֫ۡᩴ;->᩹:I

    aget v0, v0, v1

    invoke-interface {p1, v0}, Ljava/util/function/IntConsumer;->accept(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public final bridge synthetic trySplit()Ll/֨۫ᩴ;
    .locals 1

    .line 325
    invoke-virtual {p0}, Ll/֫ۡᩴ;->trySplit()Ll/ܽܺᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic trySplit()Ll/ܶ۫ᩴ;
    .locals 1

    .line 325
    invoke-virtual {p0}, Ll/֫ۡᩴ;->trySplit()Ll/ܽܺᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final trySplit()Ll/ܽܺᩴ;
    .locals 4

    .line 379
    iget v0, p0, Ll/֫ۡᩴ;->᩹:I

    iget v1, p0, Ll/֫ۡᩴ;->᩸:I

    sub-int/2addr v1, v0

    const/4 v2, 0x1

    shr-int/2addr v1, v2

    if-gt v1, v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    add-int/2addr v1, v0

    .line 384
    iput v1, p0, Ll/֫ۡᩴ;->᩹:I

    .line 385
    new-instance v2, Ll/֫ۡᩴ;

    iget-object v3, p0, Ll/֫ۡᩴ;->᩶:Ll/ۧۡᩴ;

    invoke-direct {v2, v3, v0, v1}, Ll/֫ۡᩴ;-><init>(Ll/ۧۡᩴ;II)V

    return-object v2
.end method

.method public final bridge synthetic trySplit()Ll/ᩴ۫ᩴ;
    .locals 1

    .line 325
    invoke-virtual {p0}, Ll/֫ۡᩴ;->trySplit()Ll/ܽܺᩴ;

    move-result-object v0

    return-object v0
.end method
