.class public final synthetic Ll/۟ۨᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/ۧ᩺ᩴ;


# instance fields
.field public final synthetic a:Ljava/util/stream/IntStream;


# direct methods
.method public synthetic constructor <init>(Ljava/util/stream/IntStream;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    return-void
.end method

.method public static synthetic convert(Ljava/util/stream/IntStream;)Ll/ۧ᩺ᩴ;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    instance-of v0, p0, Ll/֫᩺ᩴ;

    if-eqz v0, :cond_1

    check-cast p0, Ll/֫᩺ᩴ;

    iget-object p0, p0, Ll/֫᩺ᩴ;->a:Ll/ۧ᩺ᩴ;

    return-object p0

    :cond_1
    new-instance v0, Ll/۟ۨᩴ;

    invoke-direct {v0, p0}, Ll/۟ۨᩴ;-><init>(Ljava/util/stream/IntStream;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic allMatch(Ljava/util/function/IntPredicate;)Z
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0, p1}, Ljava/util/stream/IntStream;->allMatch(Ljava/util/function/IntPredicate;)Z

    move-result p1

    return p1
.end method

.method public final synthetic anyMatch(Ljava/util/function/IntPredicate;)Z
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0, p1}, Ljava/util/stream/IntStream;->anyMatch(Ljava/util/function/IntPredicate;)Z

    move-result p1

    return p1
.end method

.method public final synthetic asDoubleStream()Ll/֡ܰᩴ;
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0}, Ljava/util/stream/IntStream;->asDoubleStream()Ljava/util/stream/DoubleStream;

    move-result-object v0

    invoke-static {v0}, Ll/ۤ᩺ᩴ;->b(Ljava/util/stream/DoubleStream;)Ll/֡ܰᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic asLongStream()Ll/ᩴۧ᩵;
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0}, Ljava/util/stream/IntStream;->asLongStream()Ljava/util/stream/LongStream;

    move-result-object v0

    invoke-static {v0}, Ll/۬֫᩵;->b(Ljava/util/stream/LongStream;)Ll/ᩴۧ᩵;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic average()Ll/ۙ۫ᩴ;
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0}, Ljava/util/stream/IntStream;->average()Ljava/util/OptionalDouble;

    move-result-object v0

    invoke-static {v0}, Ll/ܺ᩶ᩴ;->k(Ljava/util/OptionalDouble;)Ll/ۙ۫ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic boxed()Ll/ܿ᩺ᩴ;
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0}, Ljava/util/stream/IntStream;->boxed()Ljava/util/stream/Stream;

    move-result-object v0

    invoke-static {v0}, Ll/֫۟ᩴ;->b(Ljava/util/stream/Stream;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic close()V
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0}, Ljava/util/stream/BaseStream;->close()V

    return-void
.end method

.method public final synthetic collect(Ljava/util/function/Supplier;Ljava/util/function/ObjIntConsumer;Ljava/util/function/BiConsumer;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0, p1, p2, p3}, Ljava/util/stream/IntStream;->collect(Ljava/util/function/Supplier;Ljava/util/function/ObjIntConsumer;Ljava/util/function/BiConsumer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic count()J
    .locals 2

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0}, Ljava/util/stream/IntStream;->count()J

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic distinct()Ll/ۧ᩺ᩴ;
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0}, Ljava/util/stream/IntStream;->distinct()Ljava/util/stream/IntStream;

    move-result-object v0

    invoke-static {v0}, Ll/۟ۨᩴ;->convert(Ljava/util/stream/IntStream;)Ll/ۧ᩺ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic dropWhile(Ljava/util/function/IntPredicate;)Ll/ۧ᩺ᩴ;
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0, p1}, Ljava/util/stream/IntStream;->dropWhile(Ljava/util/function/IntPredicate;)Ljava/util/stream/IntStream;

    move-result-object p1

    invoke-static {p1}, Ll/۟ۨᩴ;->convert(Ljava/util/stream/IntStream;)Ll/ۧ᩺ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic equals(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    instance-of v1, p1, Ll/۟ۨᩴ;

    if-eqz v1, :cond_0

    check-cast p1, Ll/۟ۨᩴ;

    iget-object p1, p1, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic filter(Ljava/util/function/IntPredicate;)Ll/ۧ᩺ᩴ;
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0, p1}, Ljava/util/stream/IntStream;->filter(Ljava/util/function/IntPredicate;)Ljava/util/stream/IntStream;

    move-result-object p1

    invoke-static {p1}, Ll/۟ۨᩴ;->convert(Ljava/util/stream/IntStream;)Ll/ۧ᩺ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic findAny()Ll/ᩳ۫ᩴ;
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0}, Ljava/util/stream/IntStream;->findAny()Ljava/util/OptionalInt;

    move-result-object v0

    invoke-static {v0}, Ll/ܺ᩶ᩴ;->l(Ljava/util/OptionalInt;)Ll/ᩳ۫ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic findFirst()Ll/ᩳ۫ᩴ;
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0}, Ljava/util/stream/IntStream;->findFirst()Ljava/util/OptionalInt;

    move-result-object v0

    invoke-static {v0}, Ll/ܺ᩶ᩴ;->l(Ljava/util/OptionalInt;)Ll/ᩳ۫ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic forEach(Ljava/util/function/IntConsumer;)V
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0, p1}, Ljava/util/stream/IntStream;->forEach(Ljava/util/function/IntConsumer;)V

    return-void
.end method

.method public final synthetic forEachOrdered(Ljava/util/function/IntConsumer;)V
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0, p1}, Ljava/util/stream/IntStream;->forEachOrdered(Ljava/util/function/IntConsumer;)V

    return-void
.end method

.method public final g(Ll/ܽۧ᩵;)Ll/ۧ᩺ᩴ;
    .locals 2

    .line 0
    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    .line 21
    new-instance v1, Ll/ܽۧ᩵;

    .line 89
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 90
    iput-object p1, v1, Ll/ܽۧ᩵;->a:Ljava/util/function/IntFunction;

    .line 0
    invoke-interface {v0, v1}, Ljava/util/stream/IntStream;->flatMap(Ljava/util/function/IntFunction;)Ljava/util/stream/IntStream;

    move-result-object p1

    invoke-static {p1}, Ll/۟ۨᩴ;->convert(Ljava/util/stream/IntStream;)Ll/ۧ᩺ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic hashCode()I
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final synthetic isParallel()Z
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0}, Ljava/util/stream/BaseStream;->isParallel()Z

    move-result v0

    return v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0}, Ljava/util/stream/IntStream;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic iterator()Ll/ܳ۫ᩴ;
    .locals 2

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0}, Ljava/util/stream/IntStream;->iterator()Ljava/util/PrimitiveIterator$OfInt;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 0
    :cond_0
    instance-of v1, v0, Ll/ۧۨᩴ;

    if-eqz v1, :cond_1

    check-cast v0, Ll/ۧۨᩴ;

    iget-object v0, v0, Ll/ۧۨᩴ;->a:Ll/ܳ۫ᩴ;

    return-object v0

    :cond_1
    new-instance v1, Ll/ܰۛᩴ;

    invoke-direct {v1, v0}, Ll/ܰۛᩴ;-><init>(Ljava/util/PrimitiveIterator$OfInt;)V

    return-object v1
.end method

.method public final synthetic limit(J)Ll/ۧ᩺ᩴ;
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0, p1, p2}, Ljava/util/stream/IntStream;->limit(J)Ljava/util/stream/IntStream;

    move-result-object p1

    invoke-static {p1}, Ll/۟ۨᩴ;->convert(Ljava/util/stream/IntStream;)Ll/ۧ᩺ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic map(Ljava/util/function/IntUnaryOperator;)Ll/ۧ᩺ᩴ;
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0, p1}, Ljava/util/stream/IntStream;->map(Ljava/util/function/IntUnaryOperator;)Ljava/util/stream/IntStream;

    move-result-object p1

    invoke-static {p1}, Ll/۟ۨᩴ;->convert(Ljava/util/stream/IntStream;)Ll/ۧ᩺ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic mapToDouble(Ljava/util/function/IntToDoubleFunction;)Ll/֡ܰᩴ;
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0, p1}, Ljava/util/stream/IntStream;->mapToDouble(Ljava/util/function/IntToDoubleFunction;)Ljava/util/stream/DoubleStream;

    move-result-object p1

    invoke-static {p1}, Ll/ۤ᩺ᩴ;->b(Ljava/util/stream/DoubleStream;)Ll/֡ܰᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic mapToLong(Ljava/util/function/IntToLongFunction;)Ll/ᩴۧ᩵;
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0, p1}, Ljava/util/stream/IntStream;->mapToLong(Ljava/util/function/IntToLongFunction;)Ljava/util/stream/LongStream;

    move-result-object p1

    invoke-static {p1}, Ll/۬֫᩵;->b(Ljava/util/stream/LongStream;)Ll/ᩴۧ᩵;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic mapToObj(Ljava/util/function/IntFunction;)Ll/ܿ᩺ᩴ;
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0, p1}, Ljava/util/stream/IntStream;->mapToObj(Ljava/util/function/IntFunction;)Ljava/util/stream/Stream;

    move-result-object p1

    invoke-static {p1}, Ll/֫۟ᩴ;->b(Ljava/util/stream/Stream;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic max()Ll/ᩳ۫ᩴ;
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0}, Ljava/util/stream/IntStream;->max()Ljava/util/OptionalInt;

    move-result-object v0

    invoke-static {v0}, Ll/ܺ᩶ᩴ;->l(Ljava/util/OptionalInt;)Ll/ᩳ۫ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic min()Ll/ᩳ۫ᩴ;
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0}, Ljava/util/stream/IntStream;->min()Ljava/util/OptionalInt;

    move-result-object v0

    invoke-static {v0}, Ll/ܺ᩶ᩴ;->l(Ljava/util/OptionalInt;)Ll/ᩳ۫ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic noneMatch(Ljava/util/function/IntPredicate;)Z
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0, p1}, Ljava/util/stream/IntStream;->noneMatch(Ljava/util/function/IntPredicate;)Z

    move-result p1

    return p1
.end method

.method public final synthetic onClose(Ljava/lang/Runnable;)Ll/۫ۨᩴ;
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0, p1}, Ljava/util/stream/BaseStream;->onClose(Ljava/lang/Runnable;)Ljava/util/stream/BaseStream;

    move-result-object p1

    invoke-static {p1}, Ll/ᩳ۟ᩴ;->b(Ljava/util/stream/BaseStream;)Ll/۫ۨᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic parallel()Ll/ۧ᩺ᩴ;
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0}, Ljava/util/stream/IntStream;->parallel()Ljava/util/stream/IntStream;

    move-result-object v0

    invoke-static {v0}, Ll/۟ۨᩴ;->convert(Ljava/util/stream/IntStream;)Ll/ۧ᩺ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic parallel()Ll/۫ۨᩴ;
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0}, Ljava/util/stream/IntStream;->parallel()Ljava/util/stream/BaseStream;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ۟ᩴ;->b(Ljava/util/stream/BaseStream;)Ll/۫ۨᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic peek(Ljava/util/function/IntConsumer;)Ll/ۧ᩺ᩴ;
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0, p1}, Ljava/util/stream/IntStream;->peek(Ljava/util/function/IntConsumer;)Ljava/util/stream/IntStream;

    move-result-object p1

    invoke-static {p1}, Ll/۟ۨᩴ;->convert(Ljava/util/stream/IntStream;)Ll/ۧ᩺ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic reduce(ILjava/util/function/IntBinaryOperator;)I
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0, p1, p2}, Ljava/util/stream/IntStream;->reduce(ILjava/util/function/IntBinaryOperator;)I

    move-result p1

    return p1
.end method

.method public final synthetic reduce(Ljava/util/function/IntBinaryOperator;)Ll/ᩳ۫ᩴ;
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0, p1}, Ljava/util/stream/IntStream;->reduce(Ljava/util/function/IntBinaryOperator;)Ljava/util/OptionalInt;

    move-result-object p1

    invoke-static {p1}, Ll/ܺ᩶ᩴ;->l(Ljava/util/OptionalInt;)Ll/ᩳ۫ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic sequential()Ll/ۧ᩺ᩴ;
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0}, Ljava/util/stream/IntStream;->sequential()Ljava/util/stream/IntStream;

    move-result-object v0

    invoke-static {v0}, Ll/۟ۨᩴ;->convert(Ljava/util/stream/IntStream;)Ll/ۧ᩺ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic sequential()Ll/۫ۨᩴ;
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0}, Ljava/util/stream/IntStream;->sequential()Ljava/util/stream/BaseStream;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ۟ᩴ;->b(Ljava/util/stream/BaseStream;)Ll/۫ۨᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic skip(J)Ll/ۧ᩺ᩴ;
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0, p1, p2}, Ljava/util/stream/IntStream;->skip(J)Ljava/util/stream/IntStream;

    move-result-object p1

    invoke-static {p1}, Ll/۟ۨᩴ;->convert(Ljava/util/stream/IntStream;)Ll/ۧ᩺ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic sorted()Ll/ۧ᩺ᩴ;
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0}, Ljava/util/stream/IntStream;->sorted()Ljava/util/stream/IntStream;

    move-result-object v0

    invoke-static {v0}, Ll/۟ۨᩴ;->convert(Ljava/util/stream/IntStream;)Ll/ۧ᩺ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0}, Ljava/util/stream/IntStream;->spliterator()Ljava/util/Spliterator;

    move-result-object v0

    invoke-static {v0}, Ll/ۗܳ᩵;->a(Ljava/util/Spliterator;)Ll/ܶ۫ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic spliterator()Ll/ᩴ۫ᩴ;
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0}, Ljava/util/stream/IntStream;->spliterator()Ljava/util/Spliterator$OfInt;

    move-result-object v0

    invoke-static {v0}, Ll/᩸ۨᩴ;->a(Ljava/util/Spliterator$OfInt;)Ll/ᩴ۫ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic sum()I
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0}, Ljava/util/stream/IntStream;->sum()I

    move-result v0

    return v0
.end method

.method public final summaryStatistics()Ll/ۤܳ᩵;
    .locals 2

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0}, Ljava/util/stream/IntStream;->summaryStatistics()Ljava/util/IntSummaryStatistics;

    .line 18
    new-instance v0, Ljava/lang/Error;

    const-string v1, "Java 8+ API desugaring (library desugaring) cannot convert from java.util.IntSummaryStatistics"

    invoke-direct {v0, v1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final synthetic takeWhile(Ljava/util/function/IntPredicate;)Ll/ۧ᩺ᩴ;
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0, p1}, Ljava/util/stream/IntStream;->takeWhile(Ljava/util/function/IntPredicate;)Ljava/util/stream/IntStream;

    move-result-object p1

    invoke-static {p1}, Ll/۟ۨᩴ;->convert(Ljava/util/stream/IntStream;)Ll/ۧ᩺ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic toArray()[I
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0}, Ljava/util/stream/IntStream;->toArray()[I

    move-result-object v0

    return-object v0
.end method

.method public final synthetic unordered()Ll/۫ۨᩴ;
    .locals 1

    iget-object v0, p0, Ll/۟ۨᩴ;->a:Ljava/util/stream/IntStream;

    invoke-interface {v0}, Ljava/util/stream/BaseStream;->unordered()Ljava/util/stream/BaseStream;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ۟ᩴ;->b(Ljava/util/stream/BaseStream;)Ll/۫ۨᩴ;

    move-result-object v0

    return-object v0
.end method
