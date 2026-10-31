.class public final synthetic Ll/ᩳ᩺ᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ljava/util/stream/Stream;


# instance fields
.field public final synthetic a:Ll/ܿ᩺ᩴ;


# direct methods
.method public synthetic constructor <init>(Ll/ܿ᩺ᩴ;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    return-void
.end method

.method public static synthetic convert(Ll/ܿ᩺ᩴ;)Ljava/util/stream/Stream;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    instance-of v0, p0, Ll/֫۟ᩴ;

    if-eqz v0, :cond_1

    check-cast p0, Ll/֫۟ᩴ;

    iget-object p0, p0, Ll/֫۟ᩴ;->a:Ljava/util/stream/Stream;

    return-object p0

    :cond_1
    new-instance v0, Ll/ᩳ᩺ᩴ;

    invoke-direct {v0, p0}, Ll/ᩳ᩺ᩴ;-><init>(Ll/ܿ᩺ᩴ;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic allMatch(Ljava/util/function/Predicate;)Z
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0, p1}, Ll/ܿ᩺ᩴ;->allMatch(Ljava/util/function/Predicate;)Z

    move-result p1

    return p1
.end method

.method public final synthetic anyMatch(Ljava/util/function/Predicate;)Z
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0, p1}, Ll/ܿ᩺ᩴ;->anyMatch(Ljava/util/function/Predicate;)Z

    move-result p1

    return p1
.end method

.method public final synthetic close()V
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0}, Ll/۫ۨᩴ;->close()V

    return-void
.end method

.method public final synthetic collect(Ljava/util/function/Supplier;Ljava/util/function/BiConsumer;Ljava/util/function/BiConsumer;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0, p1, p2, p3}, Ll/ܿ᩺ᩴ;->collect(Ljava/util/function/Supplier;Ljava/util/function/BiConsumer;Ljava/util/function/BiConsumer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic collect(Ljava/util/stream/Collector;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 0
    :cond_0
    instance-of v1, p1, Ll/ܽ֫᩵;

    if-eqz v1, :cond_1

    check-cast p1, Ll/ܽ֫᩵;

    iget-object p1, p1, Ll/ܽ֫᩵;->a:Ll/ۨۨᩴ;

    goto :goto_0

    :cond_1
    new-instance v1, Ll/ۗ۟ᩴ;

    invoke-direct {v1, p1}, Ll/ۗ۟ᩴ;-><init>(Ljava/util/stream/Collector;)V

    move-object p1, v1

    :goto_0
    invoke-interface {v0, p1}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic count()J
    .locals 2

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0}, Ll/ܿ᩺ᩴ;->count()J

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic distinct()Ljava/util/stream/Stream;
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0}, Ll/ܿ᩺ᩴ;->distinct()Ll/ܿ᩺ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ᩺ᩴ;->convert(Ll/ܿ᩺ᩴ;)Ljava/util/stream/Stream;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic dropWhile(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0, p1}, Ll/ܿ᩺ᩴ;->dropWhile(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    invoke-static {p1}, Ll/ᩳ᩺ᩴ;->convert(Ll/ܿ᩺ᩴ;)Ljava/util/stream/Stream;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic equals(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    instance-of v1, p1, Ll/ᩳ᩺ᩴ;

    if-eqz v1, :cond_0

    check-cast p1, Ll/ᩳ᩺ᩴ;

    iget-object p1, p1, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0, p1}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    invoke-static {p1}, Ll/ᩳ᩺ᩴ;->convert(Ll/ܿ᩺ᩴ;)Ljava/util/stream/Stream;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic findAny()Ljava/util/Optional;
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0}, Ll/ܿ᩺ᩴ;->findAny()Ll/ܽ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ܺ᩶ᩴ;->n(Ll/ܽ۫ᩴ;)Ljava/util/Optional;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic findFirst()Ljava/util/Optional;
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0}, Ll/ܿ᩺ᩴ;->findFirst()Ll/ܽ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ܺ᩶ᩴ;->n(Ll/ܽ۫ᩴ;)Ljava/util/Optional;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic flatMap(Ljava/util/function/Function;)Ljava/util/stream/Stream;
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-static {p1}, Ll/ۡ᩺ᩴ;->W(Ljava/util/function/Function;)Ll/ܿ֨ᩴ;

    move-result-object p1

    invoke-interface {v0, p1}, Ll/ܿ᩺ᩴ;->flatMap(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    invoke-static {p1}, Ll/ᩳ᩺ᩴ;->convert(Ll/ܿ᩺ᩴ;)Ljava/util/stream/Stream;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic flatMapToDouble(Ljava/util/function/Function;)Ljava/util/stream/DoubleStream;
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-static {p1}, Ll/ۡ᩺ᩴ;->W(Ljava/util/function/Function;)Ll/ܿ֨ᩴ;

    move-result-object p1

    invoke-interface {v0, p1}, Ll/ܿ᩺ᩴ;->f(Ll/ܿ֨ᩴ;)Ll/֡ܰᩴ;

    move-result-object p1

    invoke-static {p1}, Ll/ܳܰᩴ;->b(Ll/֡ܰᩴ;)Ljava/util/stream/DoubleStream;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic flatMapToInt(Ljava/util/function/Function;)Ljava/util/stream/IntStream;
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-static {p1}, Ll/ۡ᩺ᩴ;->W(Ljava/util/function/Function;)Ll/ܿ֨ᩴ;

    move-result-object p1

    invoke-interface {v0, p1}, Ll/ܿ᩺ᩴ;->flatMapToInt(Ljava/util/function/Function;)Ll/ۧ᩺ᩴ;

    move-result-object p1

    invoke-static {p1}, Ll/֫᩺ᩴ;->convert(Ll/ۧ᩺ᩴ;)Ljava/util/stream/IntStream;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic flatMapToLong(Ljava/util/function/Function;)Ljava/util/stream/LongStream;
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-static {p1}, Ll/ۡ᩺ᩴ;->W(Ljava/util/function/Function;)Ll/ܿ֨ᩴ;

    move-result-object p1

    invoke-interface {v0, p1}, Ll/ܿ᩺ᩴ;->l(Ll/ܿ֨ᩴ;)Ll/ᩴۧ᩵;

    move-result-object p1

    invoke-static {p1}, Ll/ᩳۧ᩵;->b(Ll/ᩴۧ᩵;)Ljava/util/stream/LongStream;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic forEach(Ljava/util/function/Consumer;)V
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0, p1}, Ll/ܿ᩺ᩴ;->forEach(Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final synthetic forEachOrdered(Ljava/util/function/Consumer;)V
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0, p1}, Ll/ܿ᩺ᩴ;->forEachOrdered(Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final synthetic hashCode()I
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final synthetic isParallel()Z
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0}, Ll/۫ۨᩴ;->isParallel()Z

    move-result v0

    return v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0}, Ll/۫ۨᩴ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic limit(J)Ljava/util/stream/Stream;
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0, p1, p2}, Ll/ܿ᩺ᩴ;->limit(J)Ll/ܿ᩺ᩴ;

    move-result-object p1

    invoke-static {p1}, Ll/ᩳ᩺ᩴ;->convert(Ll/ܿ᩺ᩴ;)Ljava/util/stream/Stream;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic map(Ljava/util/function/Function;)Ljava/util/stream/Stream;
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0, p1}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    invoke-static {p1}, Ll/ᩳ᩺ᩴ;->convert(Ll/ܿ᩺ᩴ;)Ljava/util/stream/Stream;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic mapToDouble(Ljava/util/function/ToDoubleFunction;)Ljava/util/stream/DoubleStream;
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0, p1}, Ll/ܿ᩺ᩴ;->mapToDouble(Ljava/util/function/ToDoubleFunction;)Ll/֡ܰᩴ;

    move-result-object p1

    invoke-static {p1}, Ll/ܳܰᩴ;->b(Ll/֡ܰᩴ;)Ljava/util/stream/DoubleStream;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic mapToInt(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0, p1}, Ll/ܿ᩺ᩴ;->mapToInt(Ljava/util/function/ToIntFunction;)Ll/ۧ᩺ᩴ;

    move-result-object p1

    invoke-static {p1}, Ll/֫᩺ᩴ;->convert(Ll/ۧ᩺ᩴ;)Ljava/util/stream/IntStream;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic mapToLong(Ljava/util/function/ToLongFunction;)Ljava/util/stream/LongStream;
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0, p1}, Ll/ܿ᩺ᩴ;->mapToLong(Ljava/util/function/ToLongFunction;)Ll/ᩴۧ᩵;

    move-result-object p1

    invoke-static {p1}, Ll/ᩳۧ᩵;->b(Ll/ᩴۧ᩵;)Ljava/util/stream/LongStream;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic max(Ljava/util/Comparator;)Ljava/util/Optional;
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0, p1}, Ll/ܿ᩺ᩴ;->max(Ljava/util/Comparator;)Ll/ܽ۫ᩴ;

    move-result-object p1

    invoke-static {p1}, Ll/ܺ᩶ᩴ;->n(Ll/ܽ۫ᩴ;)Ljava/util/Optional;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic min(Ljava/util/Comparator;)Ljava/util/Optional;
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0, p1}, Ll/ܿ᩺ᩴ;->min(Ljava/util/Comparator;)Ll/ܽ۫ᩴ;

    move-result-object p1

    invoke-static {p1}, Ll/ܺ᩶ᩴ;->n(Ll/ܽ۫ᩴ;)Ljava/util/Optional;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic noneMatch(Ljava/util/function/Predicate;)Z
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0, p1}, Ll/ܿ᩺ᩴ;->noneMatch(Ljava/util/function/Predicate;)Z

    move-result p1

    return p1
.end method

.method public final synthetic onClose(Ljava/lang/Runnable;)Ljava/util/stream/BaseStream;
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0, p1}, Ll/۫ۨᩴ;->onClose(Ljava/lang/Runnable;)Ll/۫ۨᩴ;

    move-result-object p1

    invoke-static {p1}, Ll/ᩴ۟ᩴ;->b(Ll/۫ۨᩴ;)Ljava/util/stream/BaseStream;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic parallel()Ljava/util/stream/BaseStream;
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0}, Ll/۫ۨᩴ;->parallel()Ll/۫ۨᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ᩴ۟ᩴ;->b(Ll/۫ۨᩴ;)Ljava/util/stream/BaseStream;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic peek(Ljava/util/function/Consumer;)Ljava/util/stream/Stream;
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0, p1}, Ll/ܿ᩺ᩴ;->peek(Ljava/util/function/Consumer;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    invoke-static {p1}, Ll/ᩳ᩺ᩴ;->convert(Ll/ܿ᩺ᩴ;)Ljava/util/stream/Stream;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic reduce(Ljava/lang/Object;Ljava/util/function/BiFunction;Ljava/util/function/BinaryOperator;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0, p1, p2, p3}, Ll/ܿ᩺ᩴ;->reduce(Ljava/lang/Object;Ljava/util/function/BiFunction;Ljava/util/function/BinaryOperator;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic reduce(Ljava/lang/Object;Ljava/util/function/BinaryOperator;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0, p1, p2}, Ll/ܿ᩺ᩴ;->reduce(Ljava/lang/Object;Ljava/util/function/BinaryOperator;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic reduce(Ljava/util/function/BinaryOperator;)Ljava/util/Optional;
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0, p1}, Ll/ܿ᩺ᩴ;->reduce(Ljava/util/function/BinaryOperator;)Ll/ܽ۫ᩴ;

    move-result-object p1

    invoke-static {p1}, Ll/ܺ᩶ᩴ;->n(Ll/ܽ۫ᩴ;)Ljava/util/Optional;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic sequential()Ljava/util/stream/BaseStream;
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0}, Ll/۫ۨᩴ;->sequential()Ll/۫ۨᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ᩴ۟ᩴ;->b(Ll/۫ۨᩴ;)Ljava/util/stream/BaseStream;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic skip(J)Ljava/util/stream/Stream;
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0, p1, p2}, Ll/ܿ᩺ᩴ;->skip(J)Ll/ܿ᩺ᩴ;

    move-result-object p1

    invoke-static {p1}, Ll/ᩳ᩺ᩴ;->convert(Ll/ܿ᩺ᩴ;)Ljava/util/stream/Stream;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic sorted()Ljava/util/stream/Stream;
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0}, Ll/ܿ᩺ᩴ;->sorted()Ll/ܿ᩺ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ᩺ᩴ;->convert(Ll/ܿ᩺ᩴ;)Ljava/util/stream/Stream;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic sorted(Ljava/util/Comparator;)Ljava/util/stream/Stream;
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0, p1}, Ll/ܿ᩺ᩴ;->sorted(Ljava/util/Comparator;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    invoke-static {p1}, Ll/ᩳ᩺ᩴ;->convert(Ll/ܿ᩺ᩴ;)Ljava/util/stream/Stream;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0}, Ll/۫ۨᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic takeWhile(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0, p1}, Ll/ܿ᩺ᩴ;->takeWhile(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    invoke-static {p1}, Ll/ᩳ᩺ᩴ;->convert(Ll/ܿ᩺ᩴ;)Ljava/util/stream/Stream;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic toArray()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0}, Ll/ܿ᩺ᩴ;->toArray()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0, p1}, Ll/ܿ᩺ᩴ;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic toList()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0}, Ll/ܿ᩺ᩴ;->toList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic unordered()Ljava/util/stream/BaseStream;
    .locals 1

    iget-object v0, p0, Ll/ᩳ᩺ᩴ;->a:Ll/ܿ᩺ᩴ;

    invoke-interface {v0}, Ll/۫ۨᩴ;->unordered()Ll/۫ۨᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ᩴ۟ᩴ;->b(Ll/۫ۨᩴ;)Ljava/util/stream/BaseStream;

    move-result-object v0

    return-object v0
.end method
