.class public final synthetic Ll/ᩳۧ᩵;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ljava/util/stream/LongStream;


# instance fields
.field public final synthetic a:Ll/ᩴۧ᩵;


# direct methods
.method public synthetic constructor <init>(Ll/ᩴۧ᩵;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    return-void
.end method

.method public static synthetic b(Ll/ᩴۧ᩵;)Ljava/util/stream/LongStream;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    instance-of v0, p0, Ll/۬֫᩵;

    if-eqz v0, :cond_1

    check-cast p0, Ll/۬֫᩵;

    iget-object p0, p0, Ll/۬֫᩵;->a:Ljava/util/stream/LongStream;

    return-object p0

    :cond_1
    new-instance v0, Ll/ᩳۧ᩵;

    invoke-direct {v0, p0}, Ll/ᩳۧ᩵;-><init>(Ll/ᩴۧ᩵;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic allMatch(Ljava/util/function/LongPredicate;)Z
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0, p1}, Ll/ᩴۧ᩵;->allMatch(Ljava/util/function/LongPredicate;)Z

    move-result p1

    return p1
.end method

.method public final synthetic anyMatch(Ljava/util/function/LongPredicate;)Z
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0, p1}, Ll/ᩴۧ᩵;->anyMatch(Ljava/util/function/LongPredicate;)Z

    move-result p1

    return p1
.end method

.method public final synthetic asDoubleStream()Ljava/util/stream/DoubleStream;
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0}, Ll/ᩴۧ᩵;->asDoubleStream()Ll/֡ܰᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ܳܰᩴ;->b(Ll/֡ܰᩴ;)Ljava/util/stream/DoubleStream;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic average()Ljava/util/OptionalDouble;
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0}, Ll/ᩴۧ᩵;->average()Ll/ۙ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ܺ᩶ᩴ;->o(Ll/ۙ۫ᩴ;)Ljava/util/OptionalDouble;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic boxed()Ljava/util/stream/Stream;
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0}, Ll/ᩴۧ᩵;->boxed()Ll/ܿ᩺ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ᩺ᩴ;->convert(Ll/ܿ᩺ᩴ;)Ljava/util/stream/Stream;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic close()V
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0}, Ll/۫ۨᩴ;->close()V

    return-void
.end method

.method public final synthetic collect(Ljava/util/function/Supplier;Ljava/util/function/ObjLongConsumer;Ljava/util/function/BiConsumer;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0, p1, p2, p3}, Ll/ᩴۧ᩵;->collect(Ljava/util/function/Supplier;Ljava/util/function/ObjLongConsumer;Ljava/util/function/BiConsumer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic count()J
    .locals 2

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0}, Ll/ᩴۧ᩵;->count()J

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic distinct()Ljava/util/stream/LongStream;
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0}, Ll/ᩴۧ᩵;->distinct()Ll/ᩴۧ᩵;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳۧ᩵;->b(Ll/ᩴۧ᩵;)Ljava/util/stream/LongStream;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic dropWhile(Ljava/util/function/LongPredicate;)Ljava/util/stream/LongStream;
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0, p1}, Ll/ᩴۧ᩵;->dropWhile(Ljava/util/function/LongPredicate;)Ll/ᩴۧ᩵;

    move-result-object p1

    invoke-static {p1}, Ll/ᩳۧ᩵;->b(Ll/ᩴۧ᩵;)Ljava/util/stream/LongStream;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic equals(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    instance-of v1, p1, Ll/ᩳۧ᩵;

    if-eqz v1, :cond_0

    check-cast p1, Ll/ᩳۧ᩵;

    iget-object p1, p1, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic filter(Ljava/util/function/LongPredicate;)Ljava/util/stream/LongStream;
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0, p1}, Ll/ᩴۧ᩵;->filter(Ljava/util/function/LongPredicate;)Ll/ᩴۧ᩵;

    move-result-object p1

    invoke-static {p1}, Ll/ᩳۧ᩵;->b(Ll/ᩴۧ᩵;)Ljava/util/stream/LongStream;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic findAny()Ljava/util/OptionalLong;
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0}, Ll/ᩴۧ᩵;->findAny()Ll/۫۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ܺ᩶ᩴ;->q(Ll/۫۫ᩴ;)Ljava/util/OptionalLong;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic findFirst()Ljava/util/OptionalLong;
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0}, Ll/ᩴۧ᩵;->findFirst()Ll/۫۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ܺ᩶ᩴ;->q(Ll/۫۫ᩴ;)Ljava/util/OptionalLong;

    move-result-object v0

    return-object v0
.end method

.method public final flatMap(Ljava/util/function/LongFunction;)Ljava/util/stream/LongStream;
    .locals 3

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    .line 29
    new-instance v1, Ll/ܿ֨ᩴ;

    const/16 v2, 0xc

    .line 145
    invoke-direct {v1, v2}, Ll/ܿ֨ᩴ;-><init>(I)V

    .line 146
    iput-object p1, v1, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    .line 0
    invoke-interface {v0, v1}, Ll/ᩴۧ᩵;->a(Ll/ܿ֨ᩴ;)Ll/ᩴۧ᩵;

    move-result-object p1

    invoke-static {p1}, Ll/ᩳۧ᩵;->b(Ll/ᩴۧ᩵;)Ljava/util/stream/LongStream;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic forEach(Ljava/util/function/LongConsumer;)V
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0, p1}, Ll/ᩴۧ᩵;->forEach(Ljava/util/function/LongConsumer;)V

    return-void
.end method

.method public final synthetic forEachOrdered(Ljava/util/function/LongConsumer;)V
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0, p1}, Ll/ᩴۧ᩵;->forEachOrdered(Ljava/util/function/LongConsumer;)V

    return-void
.end method

.method public final synthetic hashCode()I
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final synthetic isParallel()Z
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0}, Ll/۫ۨᩴ;->isParallel()Z

    move-result v0

    return v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0}, Ll/۫ۨᩴ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic iterator()Ljava/util/PrimitiveIterator$OfLong;
    .locals 2

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0}, Ll/ᩴۧ᩵;->iterator()Ll/ۜ۫ᩴ;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 0
    :cond_0
    instance-of v1, v0, Ll/ۜۨᩴ;

    if-eqz v1, :cond_1

    check-cast v0, Ll/ۜۨᩴ;

    iget-object v0, v0, Ll/ۜۨᩴ;->a:Ljava/util/PrimitiveIterator$OfLong;

    return-object v0

    :cond_1
    new-instance v1, Ll/ۡۨᩴ;

    invoke-direct {v1, v0}, Ll/ۡۨᩴ;-><init>(Ll/ۜ۫ᩴ;)V

    return-object v1
.end method

.method public final synthetic limit(J)Ljava/util/stream/LongStream;
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0, p1, p2}, Ll/ᩴۧ᩵;->limit(J)Ll/ᩴۧ᩵;

    move-result-object p1

    invoke-static {p1}, Ll/ᩳۧ᩵;->b(Ll/ᩴۧ᩵;)Ljava/util/stream/LongStream;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic map(Ljava/util/function/LongUnaryOperator;)Ljava/util/stream/LongStream;
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0, p1}, Ll/ᩴۧ᩵;->map(Ljava/util/function/LongUnaryOperator;)Ll/ᩴۧ᩵;

    move-result-object p1

    invoke-static {p1}, Ll/ᩳۧ᩵;->b(Ll/ᩴۧ᩵;)Ljava/util/stream/LongStream;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic mapToDouble(Ljava/util/function/LongToDoubleFunction;)Ljava/util/stream/DoubleStream;
    .locals 0

    iget-object p1, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {p1}, Ll/ᩴۧ᩵;->c()Ll/֡ܰᩴ;

    move-result-object p1

    invoke-static {p1}, Ll/ܳܰᩴ;->b(Ll/֡ܰᩴ;)Ljava/util/stream/DoubleStream;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic mapToInt(Ljava/util/function/LongToIntFunction;)Ljava/util/stream/IntStream;
    .locals 0

    iget-object p1, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {p1}, Ll/ᩴۧ᩵;->k()Ll/ۧ᩺ᩴ;

    move-result-object p1

    invoke-static {p1}, Ll/֫᩺ᩴ;->convert(Ll/ۧ᩺ᩴ;)Ljava/util/stream/IntStream;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic mapToObj(Ljava/util/function/LongFunction;)Ljava/util/stream/Stream;
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0, p1}, Ll/ᩴۧ᩵;->mapToObj(Ljava/util/function/LongFunction;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    invoke-static {p1}, Ll/ᩳ᩺ᩴ;->convert(Ll/ܿ᩺ᩴ;)Ljava/util/stream/Stream;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic max()Ljava/util/OptionalLong;
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0}, Ll/ᩴۧ᩵;->max()Ll/۫۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ܺ᩶ᩴ;->q(Ll/۫۫ᩴ;)Ljava/util/OptionalLong;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic min()Ljava/util/OptionalLong;
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0}, Ll/ᩴۧ᩵;->min()Ll/۫۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ܺ᩶ᩴ;->q(Ll/۫۫ᩴ;)Ljava/util/OptionalLong;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic noneMatch(Ljava/util/function/LongPredicate;)Z
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0, p1}, Ll/ᩴۧ᩵;->noneMatch(Ljava/util/function/LongPredicate;)Z

    move-result p1

    return p1
.end method

.method public final synthetic onClose(Ljava/lang/Runnable;)Ljava/util/stream/BaseStream;
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0, p1}, Ll/۫ۨᩴ;->onClose(Ljava/lang/Runnable;)Ll/۫ۨᩴ;

    move-result-object p1

    invoke-static {p1}, Ll/ᩴ۟ᩴ;->b(Ll/۫ۨᩴ;)Ljava/util/stream/BaseStream;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic parallel()Ljava/util/stream/BaseStream;
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0}, Ll/۫ۨᩴ;->parallel()Ll/۫ۨᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ᩴ۟ᩴ;->b(Ll/۫ۨᩴ;)Ljava/util/stream/BaseStream;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic parallel()Ljava/util/stream/LongStream;
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0}, Ll/ᩴۧ᩵;->parallel()Ll/ᩴۧ᩵;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳۧ᩵;->b(Ll/ᩴۧ᩵;)Ljava/util/stream/LongStream;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic peek(Ljava/util/function/LongConsumer;)Ljava/util/stream/LongStream;
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0, p1}, Ll/ᩴۧ᩵;->peek(Ljava/util/function/LongConsumer;)Ll/ᩴۧ᩵;

    move-result-object p1

    invoke-static {p1}, Ll/ᩳۧ᩵;->b(Ll/ᩴۧ᩵;)Ljava/util/stream/LongStream;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic reduce(JLjava/util/function/LongBinaryOperator;)J
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0, p1, p2, p3}, Ll/ᩴۧ᩵;->reduce(JLjava/util/function/LongBinaryOperator;)J

    move-result-wide p1

    return-wide p1
.end method

.method public final synthetic reduce(Ljava/util/function/LongBinaryOperator;)Ljava/util/OptionalLong;
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0, p1}, Ll/ᩴۧ᩵;->reduce(Ljava/util/function/LongBinaryOperator;)Ll/۫۫ᩴ;

    move-result-object p1

    invoke-static {p1}, Ll/ܺ᩶ᩴ;->q(Ll/۫۫ᩴ;)Ljava/util/OptionalLong;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic sequential()Ljava/util/stream/BaseStream;
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0}, Ll/۫ۨᩴ;->sequential()Ll/۫ۨᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ᩴ۟ᩴ;->b(Ll/۫ۨᩴ;)Ljava/util/stream/BaseStream;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic sequential()Ljava/util/stream/LongStream;
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0}, Ll/ᩴۧ᩵;->sequential()Ll/ᩴۧ᩵;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳۧ᩵;->b(Ll/ᩴۧ᩵;)Ljava/util/stream/LongStream;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic skip(J)Ljava/util/stream/LongStream;
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0, p1, p2}, Ll/ᩴۧ᩵;->skip(J)Ll/ᩴۧ᩵;

    move-result-object p1

    invoke-static {p1}, Ll/ᩳۧ᩵;->b(Ll/ᩴۧ᩵;)Ljava/util/stream/LongStream;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic sorted()Ljava/util/stream/LongStream;
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0}, Ll/ᩴۧ᩵;->sorted()Ll/ᩴۧ᩵;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳۧ᩵;->b(Ll/ᩴۧ᩵;)Ljava/util/stream/LongStream;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic spliterator()Ljava/util/Spliterator$OfLong;
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0}, Ll/ᩴۧ᩵;->spliterator()Ll/֡۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠ܳ᩵;->a(Ll/֡۫ᩴ;)Ljava/util/Spliterator$OfLong;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0}, Ll/۫ۨᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic sum()J
    .locals 2

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0}, Ll/ᩴۧ᩵;->sum()J

    move-result-wide v0

    return-wide v0
.end method

.method public final summaryStatistics()Ljava/util/LongSummaryStatistics;
    .locals 2

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0}, Ll/ᩴۧ᩵;->summaryStatistics()Ll/ۨܳ᩵;

    .line 12
    new-instance v0, Ljava/lang/Error;

    const-string v1, "Java 8+ API desugaring (library desugaring) cannot convert to java.util.LongSummaryStatistics"

    invoke-direct {v0, v1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final synthetic takeWhile(Ljava/util/function/LongPredicate;)Ljava/util/stream/LongStream;
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0, p1}, Ll/ᩴۧ᩵;->takeWhile(Ljava/util/function/LongPredicate;)Ll/ᩴۧ᩵;

    move-result-object p1

    invoke-static {p1}, Ll/ᩳۧ᩵;->b(Ll/ᩴۧ᩵;)Ljava/util/stream/LongStream;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic toArray()[J
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0}, Ll/ᩴۧ᩵;->toArray()[J

    move-result-object v0

    return-object v0
.end method

.method public final synthetic unordered()Ljava/util/stream/BaseStream;
    .locals 1

    iget-object v0, p0, Ll/ᩳۧ᩵;->a:Ll/ᩴۧ᩵;

    invoke-interface {v0}, Ll/۫ۨᩴ;->unordered()Ll/۫ۨᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ᩴ۟ᩴ;->b(Ll/۫ۨᩴ;)Ljava/util/stream/BaseStream;

    move-result-object v0

    return-object v0
.end method
