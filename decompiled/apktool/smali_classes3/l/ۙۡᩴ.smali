.class public Ll/ۙۡᩴ;
.super Ll/᩸ۢᩴ;
.source "PCGG"

# interfaces
.implements Ll/֨ۡᩴ;
.implements Ll/ۨ۬ᩴ;


# static fields
.field public static final serialVersionUID:J = -0x61c8864680b583e9L


# instance fields
.field public final ᩹:Ll/֨ۡᩴ;


# direct methods
.method public constructor <init>(Ll/֨ۡᩴ;)V
    .locals 0

    .line 989
    invoke-direct {p0, p1}, Ll/᩸ۢᩴ;-><init>(Ll/֨ۡᩴ;)V

    .line 990
    iput-object p1, p0, Ll/ۙۡᩴ;->᩹:Ll/֨ۡᩴ;

    return-void
.end method


# virtual methods
.method public final add(II)V
    .locals 0

    .line 1005
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final bridge synthetic add(ILjava/lang/Object;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 983
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2}, Ll/ۙۡᩴ;->֫(ILjava/lang/Integer;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final add(I)Z
    .locals 0

    .line 473
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 0

    .line 1025
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 0

    .line 545
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 983
    check-cast p1, Ljava/util/List;

    .line 1107
    iget-object v0, p0, Ll/ۙۡᩴ;->᩹:Ll/֨ۡᩴ;

    invoke-interface {v0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final contains(I)Z
    .locals 1

    .line 493
    iget-object v0, p0, Ll/᩸ۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-interface {v0, p1}, Ll/֨ۢᩴ;->contains(I)Z

    move-result p1

    return p1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 572
    iget-object v0, p0, Ll/᩸ۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-interface {v0, p1}, Ll/֨ۢᩴ;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 1

    .line 540
    iget-object v0, p0, Ll/᩸ۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-interface {v0, p1}, Ljava/util/Collection;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 1097
    :cond_0
    iget-object v0, p0, Ll/᩸ۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final get(I)Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1138
    iget-object v0, p0, Ll/ۙۡᩴ;->᩹:Ll/֨ۡᩴ;

    invoke-interface {v0, p1}, Ll/֨ۡᩴ;->get(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1138
    iget-object v0, p0, Ll/ۙۡᩴ;->᩹:Ll/֨ۡᩴ;

    invoke-interface {v0, p1}, Ll/֨ۡᩴ;->get(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public final getInt(I)I
    .locals 1

    .line 995
    iget-object v0, p0, Ll/ۙۡᩴ;->᩹:Ll/֨ۡᩴ;

    invoke-interface {v0, p1}, Ll/֨ۡᩴ;->getInt(I)I

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1102
    iget-object v0, p0, Ll/᩸ۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final indexOf(I)I
    .locals 1

    .line 1015
    iget-object v0, p0, Ll/ۙۡᩴ;->᩹:Ll/֨ۡᩴ;

    invoke-interface {v0, p1}, Ll/֨ۡᩴ;->indexOf(I)I

    move-result p1

    return p1
.end method

.method public final indexOf(Ljava/lang/Object;)I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1182
    iget-object v0, p0, Ll/ۙۡᩴ;->᩹:Ll/֨ۡᩴ;

    invoke-interface {v0, p1}, Ll/֨ۡᩴ;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final isEmpty()Z
    .locals 1

    .line 488
    iget-object v0, p0, Ll/᩸ۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1081
    invoke-virtual {p0}, Ll/ۙۡᩴ;->listIterator()Ll/ܶۡᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final iterator()Ll/ۜۡᩴ;
    .locals 1

    .line 1081
    invoke-virtual {p0}, Ll/ۙۡᩴ;->listIterator()Ll/ܶۡᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final iterator()Ll/ܶۡᩴ;
    .locals 1

    .line 1081
    invoke-virtual {p0}, Ll/ۙۡᩴ;->listIterator()Ll/ܶۡᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final lastIndexOf(I)I
    .locals 1

    .line 1020
    iget-object v0, p0, Ll/ۙۡᩴ;->᩹:Ll/֨ۡᩴ;

    invoke-interface {v0, p1}, Ll/֨ۡᩴ;->lastIndexOf(I)I

    move-result p1

    return p1
.end method

.method public final lastIndexOf(Ljava/lang/Object;)I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1193
    iget-object v0, p0, Ll/ۙۡᩴ;->᩹:Ll/֨ۡᩴ;

    invoke-interface {v0, p1}, Ll/֨ۡᩴ;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final bridge synthetic listIterator()Ljava/util/ListIterator;
    .locals 1

    .line 983
    invoke-virtual {p0}, Ll/ۙۡᩴ;->listIterator()Ll/ܶۡᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 0

    .line 983
    invoke-virtual {p0, p1}, Ll/ۙۡᩴ;->listIterator(I)Ll/ܶۡᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final listIterator()Ll/ܶۡᩴ;
    .locals 2

    .line 1076
    iget-object v0, p0, Ll/ۙۡᩴ;->᩹:Ll/֨ۡᩴ;

    invoke-interface {v0}, Ll/֨ۡᩴ;->listIterator()Ll/ܶۡᩴ;

    move-result-object v0

    .line 1391
    new-instance v1, Ll/ۖۡᩴ;

    invoke-direct {v1, v0}, Ll/ۖۡᩴ;-><init>(Ll/ܶۡᩴ;)V

    return-object v1
.end method

.method public final listIterator(I)Ll/ܶۡᩴ;
    .locals 1

    .line 1086
    iget-object v0, p0, Ll/ۙۡᩴ;->᩹:Ll/֨ۡᩴ;

    invoke-interface {v0, p1}, Ll/֨ۡᩴ;->listIterator(I)Ll/ܶۡᩴ;

    move-result-object p1

    .line 1391
    new-instance v0, Ll/ۖۡᩴ;

    invoke-direct {v0, p1}, Ll/ۖۡᩴ;-><init>(Ll/ܶۡᩴ;)V

    return-object v0
.end method

.method public synthetic parallelStream()Ljava/util/stream/Stream;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/ۙۡᩴ;->parallelStream()Ll/ܿ᩺ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ᩺ᩴ;->convert(Ll/ܿ᩺ᩴ;)Ljava/util/stream/Stream;

    move-result-object v0

    return-object v0
.end method

.method public final parallelStream()Ll/ܿ᩺ᩴ;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 515
    iget-object v0, p0, Ll/᩸ۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-interface {v0}, Ll/֨ۢᩴ;->parallelStream()Ll/ܿ᩺ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final remove(I)Ljava/lang/Integer;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p1, 0x0

    throw p1
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1171
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 578
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 0

    .line 550
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final replaceAll(Ljava/util/function/UnaryOperator;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1031
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 0

    .line 555
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final set(II)I
    .locals 0

    .line 1000
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 983
    check-cast p2, Ljava/lang/Integer;

    .line 1160
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final size()I
    .locals 1

    .line 483
    iget-object v0, p0, Ll/᩸ۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    return v0
.end method

.method public final sort(Ljava/util/Comparator;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1209
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final spliterator()Ll/ܽܺᩴ;
    .locals 1

    .line 503
    iget-object v0, p0, Ll/᩸ۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-interface {v0}, Ll/֨ۢᩴ;->spliterator()Ll/ܽܺᩴ;

    move-result-object v0

    return-object v0
.end method

.method public synthetic stream()Ljava/util/stream/Stream;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/ۙۡᩴ;->stream()Ll/ܿ᩺ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ᩺ᩴ;->convert(Ll/ܿ᩺ᩴ;)Ljava/util/stream/Stream;

    move-result-object v0

    return-object v0
.end method

.method public final stream()Ll/ܿ᩺ᩴ;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 509
    iget-object v0, p0, Ll/᩸ۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-interface {v0}, Ll/֨ۢᩴ;->stream()Ll/ܿ᩺ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    .line 1220
    invoke-interface {p0, p1, p2}, Ll/֨ۡᩴ;->subList(II)Ll/֨ۡᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 1

    .line 530
    iget-object v0, p0, Ll/᩸ۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-interface {v0}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1

    .line 525
    iget-object v0, p0, Ll/᩸ۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-interface {v0, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 642
    iget-object v0, p0, Ll/᩸ۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(II)V
    .locals 0

    .line 1041
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ֫(III[I)V
    .locals 1

    .line 1036
    iget-object v0, p0, Ll/ۙۡᩴ;->᩹:Ll/֨ۡᩴ;

    invoke-interface {v0, p1, p2, p3, p4}, Ll/֨ۡᩴ;->֫(III[I)V

    return-void
.end method

.method public final ֫(II[I)V
    .locals 0

    .line 1066
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ֫(ILjava/lang/Integer;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1149
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ֫(Ljava/util/function/IntUnaryOperator;)V
    .locals 0

    .line 1127
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ֫(Ljava/lang/Integer;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 566
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ֫(Ljava/util/function/IntPredicate;)Z
    .locals 0

    .line 560
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ۖ(I)Z
    .locals 0

    .line 478
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ۘ(I)I
    .locals 0

    .line 1010
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ۧ(ILjava/lang/Integer;)Ljava/lang/Integer;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p1, 0x0

    throw p1
.end method

.method public final ۧ(II[I)V
    .locals 0

    .line 1046
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ۧ(Ll/ۙۢᩴ;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public final ۧ([I)V
    .locals 0

    .line 1056
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ܶ()[I
    .locals 1

    .line 583
    iget-object v0, p0, Ll/᩸ۢᩴ;->᩸:Ll/֨ۢᩴ;

    invoke-interface {v0}, Ll/֨ۢᩴ;->ܶ()[I

    move-result-object v0

    return-object v0
.end method

.method public final ܽ(Ll/ۙۢᩴ;)V
    .locals 0

    .line 1198
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ܽ([I)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method
