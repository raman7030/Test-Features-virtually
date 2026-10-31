.class public final Ll/۬ۤᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/ᩴ۫ᩴ;


# instance fields
.field public a:J

.field public final b:J

.field public final c:I

.field public final d:I


# direct methods
.method public constructor <init>(JJII)V
    .locals 0

    .line 793
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 794
    iput-wide p1, p0, Ll/۬ۤᩴ;->a:J

    iput-wide p3, p0, Ll/۬ۤᩴ;->b:J

    .line 795
    iput p5, p0, Ll/۬ۤᩴ;->c:I

    iput p6, p0, Ll/۬ۤᩴ;->d:I

    return-void
.end method


# virtual methods
.method public final a()Ll/۬ۤᩴ;
    .locals 8

    .line 799
    iget-wide v1, p0, Ll/۬ۤᩴ;->a:J

    iget-wide v3, p0, Ll/۬ۤᩴ;->b:J

    add-long/2addr v3, v1

    const/4 v0, 0x1

    ushr-long/2addr v3, v0

    cmp-long v0, v3, v1

    if-gtz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 801
    :cond_0
    new-instance v7, Ll/۬ۤᩴ;

    iput-wide v3, p0, Ll/۬ۤᩴ;->a:J

    iget v5, p0, Ll/۬ۤᩴ;->c:I

    iget v6, p0, Ll/۬ۤᩴ;->d:I

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Ll/۬ۤᩴ;-><init>(JJII)V

    return-object v7
.end method

.method public final characteristics()I
    .locals 1

    const/16 v0, 0x4540

    return v0
.end method

.method public final estimateSize()J
    .locals 4

    .line 805
    iget-wide v0, p0, Ll/۬ۤᩴ;->b:J

    iget-wide v2, p0, Ll/۬ۤᩴ;->a:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public final bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 786
    check-cast p1, Ljava/util/function/IntConsumer;

    invoke-virtual {p0, p1}, Ll/۬ۤᩴ;->forEachRemaining(Ljava/util/function/IntConsumer;)V

    return-void
.end method

.method public final synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    invoke-static {p0, p1}, Ll/ۘ۫ᩴ;->a(Ll/ᩴ۫ᩴ;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final forEachRemaining(Ljava/util/function/IntConsumer;)V
    .locals 7

    .line 825
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 826
    iget-wide v0, p0, Ll/۬ۤᩴ;->a:J

    .line 827
    iget-wide v2, p0, Ll/۬ۤᩴ;->b:J

    cmp-long v4, v0, v2

    if-gez v4, :cond_1

    .line 828
    iput-wide v2, p0, Ll/۬ۤᩴ;->a:J

    .line 830
    invoke-static {}, Ll/ܳۤᩴ;->current()Ll/ܳۤᩴ;

    move-result-object v4

    .line 832
    :cond_0
    iget v5, p0, Ll/۬ۤᩴ;->c:I

    iget v6, p0, Ll/۬ۤᩴ;->d:I

    invoke-virtual {v4, v5, v6}, Ll/ܳۤᩴ;->b(II)I

    move-result v5

    invoke-interface {p1, v5}, Ljava/util/function/IntConsumer;->accept(I)V

    const-wide/16 v5, 0x1

    add-long/2addr v0, v5

    cmp-long v5, v0, v2

    if-ltz v5, :cond_0

    :cond_1
    return-void
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

.method public final bridge synthetic tryAdvance(Ljava/lang/Object;)Z
    .locals 0

    .line 786
    check-cast p1, Ljava/util/function/IntConsumer;

    invoke-virtual {p0, p1}, Ll/۬ۤᩴ;->tryAdvance(Ljava/util/function/IntConsumer;)Z

    move-result p1

    return p1
.end method

.method public final synthetic tryAdvance(Ljava/util/function/Consumer;)Z
    .locals 0

    invoke-static {p0, p1}, Ll/ۘ۫ᩴ;->b(Ll/ᩴ۫ᩴ;Ljava/util/function/Consumer;)Z

    move-result p1

    return p1
.end method

.method public final tryAdvance(Ljava/util/function/IntConsumer;)Z
    .locals 5

    .line 814
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 815
    iget-wide v0, p0, Ll/۬ۤᩴ;->a:J

    iget-wide v2, p0, Ll/۬ۤᩴ;->b:J

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    .line 817
    invoke-static {}, Ll/ܳۤᩴ;->current()Ll/ܳۤᩴ;

    move-result-object v2

    iget v3, p0, Ll/۬ۤᩴ;->c:I

    iget v4, p0, Ll/۬ۤᩴ;->d:I

    invoke-virtual {v2, v3, v4}, Ll/ܳۤᩴ;->b(II)I

    move-result v2

    invoke-interface {p1, v2}, Ljava/util/function/IntConsumer;->accept(I)V

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    .line 818
    iput-wide v0, p0, Ll/۬ۤᩴ;->a:J

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final bridge synthetic trySplit()Ll/֨۫ᩴ;
    .locals 1

    .line 786
    invoke-virtual {p0}, Ll/۬ۤᩴ;->a()Ll/۬ۤᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic trySplit()Ll/ܶ۫ᩴ;
    .locals 1

    .line 786
    invoke-virtual {p0}, Ll/۬ۤᩴ;->a()Ll/۬ۤᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic trySplit()Ll/ᩴ۫ᩴ;
    .locals 1

    .line 786
    invoke-virtual {p0}, Ll/۬ۤᩴ;->a()Ll/۬ۤᩴ;

    move-result-object v0

    return-object v0
.end method
