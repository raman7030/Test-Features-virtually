.class public final Ll/۟ۛۚ;
.super Ll/ۜ۫ۚ;
.source "T7DJ"

# interfaces
.implements Ljava/util/Collection;
.implements Ll/֨۬ᩴ;


# instance fields
.field public final ۙ:Ljava/util/ArrayList;

.field public ᩶:Z


# direct methods
.method public constructor <init>(Ll/ۗۛۚ;Ll/ۙ۬ۚ;)V
    .locals 2

    .line 64
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v1, v0}, Ll/۟ۛۚ;-><init>(Ll/ۗۛۚ;Ll/ۙ۬ۚ;ZLjava/util/ArrayList;)V

    return-void
.end method

.method public constructor <init>(Ll/ۗۛۚ;Ll/ۙ۬ۚ;I)V
    .locals 1

    .line 69
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0, p3}, Ll/۟ۛۚ;-><init>(Ll/ۗۛۚ;Ll/ۙ۬ۚ;ZLjava/util/ArrayList;)V

    return-void
.end method

.method public constructor <init>(Ll/ۗۛۚ;Ll/ۙ۬ۚ;Ljava/util/ArrayList;)V
    .locals 1

    const/4 v0, 0x0

    .line 60
    invoke-direct {p0, p1, p2, v0, p3}, Ll/۟ۛۚ;-><init>(Ll/ۗۛۚ;Ll/ۙ۬ۚ;ZLjava/util/ArrayList;)V

    return-void
.end method

.method public constructor <init>(Ll/ۗۛۚ;Ll/ۙ۬ۚ;ZLjava/util/ArrayList;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2}, Ll/ۜ۫ۚ;-><init>(Ll/ۗۛۚ;Ll/ۙ۬ۚ;)V

    .line 55
    iput-object p4, p0, Ll/۟ۛۚ;->ۙ:Ljava/util/ArrayList;

    .line 56
    iput-boolean p3, p0, Ll/۟ۛۚ;->᩶:Z

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 1

    .line 40
    check-cast p1, Ll/֫ۨۚ;

    .line 82
    iget-object v0, p0, Ll/۟ۛۚ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 1

    .line 97
    iget-object v0, p0, Ll/۟ۛۚ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final clear()V
    .locals 1

    .line 112
    iget-object v0, p0, Ll/۟ۛۚ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 1

    .line 92
    iget-object v0, p0, Ll/۟ۛۚ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public synthetic forEach(Ljava/util/function/Consumer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩹֨ᩴ;->$default$forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final get(I)Ll/֫ۨۚ;
    .locals 1

    .line 73
    iget-object v0, p0, Ll/۟ۛۚ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֫ۨۚ;

    return-object p1
.end method

.method public final getElements()Ljava/util/ArrayList;
    .locals 1

    .line 142
    iget-object v0, p0, Ll/۟ۛۚ;->ۙ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final isEmpty()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 147
    iget-object v0, p0, Ll/۟ۛۚ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public synthetic parallelStream()Ljava/util/stream/Stream;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/۟ۛۚ;->parallelStream()Ll/ܿ᩺ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ᩺ᩴ;->convert(Ll/ܿ᩺ᩴ;)Ljava/util/stream/Stream;

    move-result-object v0

    return-object v0
.end method

.method public synthetic parallelStream()Ll/ܿ᩺ᩴ;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/֡۬ᩴ;->$default$parallelStream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    .line 87
    iget-object v0, p0, Ll/۟ۛۚ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 1

    .line 102
    iget-object v0, p0, Ll/۟ۛۚ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public synthetic removeIf(Ljava/util/function/Predicate;)Z
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/֡۬ᩴ;->$default$removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    move-result p1

    return p1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 1

    .line 107
    iget-object v0, p0, Ll/۟ۛۚ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->retainAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final size()I
    .locals 1

    .line 124
    iget-object v0, p0, Ll/۟ۛۚ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/۟ۛۚ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public synthetic spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/֡۬ᩴ;->$default$spliterator(Ljava/util/Collection;)Ll/ܶ۫ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public synthetic stream()Ljava/util/stream/Stream;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/۟ۛۚ;->stream()Ll/ܿ᩺ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ᩺ᩴ;->convert(Ll/ܿ᩺ᩴ;)Ljava/util/stream/Stream;

    move-result-object v0

    return-object v0
.end method

.method public final stream()Ll/ܿ᩺ᩴ;
    .locals 1

    .line 160
    iget-object v0, p0, Ll/۟ۛۚ;->ۙ:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 1

    .line 152
    iget-object v0, p0, Ll/۟ۛۚ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public synthetic toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/֡۬ᩴ;->$default$toArray(Ljava/util/Collection;Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1

    .line 157
    iget-object v0, p0, Ll/۟ۛۚ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ܳۤۚ;)Ll/ܽ۫ᩴ;
    .locals 1

    .line 77
    iget-object v0, p0, Ll/۟ۛۚ;->ۙ:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    invoke-interface {v0, p1}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    invoke-interface {p1}, Ll/ܿ᩺ᩴ;->findFirst()Ll/ܽ۫ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(ILl/ۛۨۚ;)V
    .locals 1

    .line 121
    iget-object v0, p0, Ll/۟ۛۚ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֫ۨۚ;

    return-void
.end method

.method public final ֫(Ljava/util/ArrayList;)V
    .locals 1

    .line 137
    iget-object v0, p0, Ll/۟ۛۚ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 138
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public final ֫(Ll/֡۫ۚ;)V
    .locals 3

    .line 173
    invoke-super {p0, p1}, Ll/ۜ۫ۚ;->֫(Ll/֡۫ۚ;)V

    .line 174
    iget-object v0, p0, Ll/۟ۛۚ;->ۙ:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v1

    new-instance v2, Ll/ۨۛۚ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-interface {v1, v2}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v1

    invoke-interface {v1}, Ll/ܿ᩺ᩴ;->count()J

    move-result-wide v1

    long-to-int v2, v1

    .line 175
    iget-boolean v1, p0, Ll/۟ۛۚ;->᩶:Z

    if-eqz v1, :cond_0

    .line 176
    move-object v1, p1

    check-cast v1, Ll/ۛ۫ۚ;

    invoke-virtual {v1, v2}, Ll/ۛ۫ۚ;->֫(I)V

    goto :goto_0

    .line 178
    :cond_0
    move-object v1, p1

    check-cast v1, Ll/ۛ۫ۚ;

    invoke-virtual {v1, v2}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 180
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫ۨۚ;

    .line 181
    invoke-interface {v1, p1}, Ll/֫ۨۚ;->֫(Ll/֡۫ۚ;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final ֫(Ll/֫ۨۚ;)V
    .locals 1

    .line 82
    iget-object v0, p0, Ll/۟ۛۚ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/ܿ᩺ᩴ;)V
    .locals 3

    .line 116
    new-instance v0, Ll/ܰۛۚ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    iget-object v0, p0, Ll/۟ۛۚ;->ۙ:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ll/ܶܰۚ;

    const/4 v2, 0x1

    invoke-direct {v1, v2, v0}, Ll/ܶܰۚ;-><init>(ILjava/lang/Object;)V

    invoke-interface {p1, v1}, Ll/ܿ᩺ᩴ;->forEach(Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final ܽ()I
    .locals 2

    .line 165
    iget-object v0, p0, Ll/۟ۛۚ;->ۙ:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/᩺ۛۚ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->mapToInt(Ljava/util/function/ToIntFunction;)Ll/ۧ᩺ᩴ;

    move-result-object v0

    invoke-interface {v0}, Ll/ۧ᩺ᩴ;->sum()I

    move-result v0

    .line 167
    iget-boolean v1, p0, Ll/۟ۛۚ;->᩶:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method
