.class public final Ll/᩶ۡᩴ;
.super Ll/ۤܿᩴ;
.source "PCGG"

# interfaces
.implements Ljava/util/RandomAccess;
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# static fields
.field public static final serialVersionUID:J = -0x61c8864680b583e9L


# instance fields
.field public final ᩸:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 362
    invoke-direct {p0}, Ll/ۤܿᩴ;-><init>()V

    .line 363
    iput p1, p0, Ll/᩶ۡᩴ;->᩸:I

    return-void
.end method


# virtual methods
.method public final addAll(ILjava/util/Collection;)Z
    .locals 0

    .line 439
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 0

    .line 444
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final clear()V
    .locals 1

    .line 592
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 0

    return-object p0
.end method

.method public final contains(I)Z
    .locals 1

    .line 384
    iget v0, p0, Ll/᩶ۡᩴ;->᩸:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final forEach(Ljava/util/function/Consumer;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 434
    iget v0, p0, Ll/᩶ۡᩴ;->᩸:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public final forEach(Ljava/util/function/IntConsumer;)V
    .locals 1

    .line 476
    iget v0, p0, Ll/᩶ۡᩴ;->᩸:I

    invoke-interface {p1, v0}, Ljava/util/function/IntConsumer;->accept(I)V

    return-void
.end method

.method public final getInt(I)I
    .locals 0

    if-nez p1, :cond_0

    .line 368
    iget p1, p0, Ll/᩶ۡᩴ;->᩸:I

    return p1

    .line 369
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final indexOf(I)I
    .locals 1

    .line 389
    iget v0, p0, Ll/᩶ۡᩴ;->᩸:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 405
    invoke-virtual {p0}, Ll/᩶ۡᩴ;->listIterator()Ll/ܶۡᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final iterator()Ll/ۜۡᩴ;
    .locals 1

    .line 405
    invoke-virtual {p0}, Ll/᩶ۡᩴ;->listIterator()Ll/ܶۡᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final iterator()Ll/ܶۡᩴ;
    .locals 1

    .line 405
    invoke-virtual {p0}, Ll/᩶ۡᩴ;->listIterator()Ll/ܶۡᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic listIterator()Ljava/util/ListIterator;
    .locals 1

    .line 358
    invoke-virtual {p0}, Ll/᩶ۡᩴ;->listIterator()Ll/ܶۡᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final listIterator()Ll/ܶۡᩴ;
    .locals 2

    .line 195
    new-instance v0, Ll/ܺۡᩴ;

    iget v1, p0, Ll/᩶ۡᩴ;->᩸:I

    invoke-direct {v0, v1}, Ll/ܺۡᩴ;-><init>(I)V

    return-object v0
.end method

.method public final listIterator(I)Ll/ܶۡᩴ;
    .locals 2

    const/4 v0, 0x1

    if-gt p1, v0, :cond_1

    if-ltz p1, :cond_1

    .line 416
    invoke-virtual {p0}, Ll/᩶ۡᩴ;->listIterator()Ll/ܶۡᩴ;

    move-result-object v1

    if-ne p1, v0, :cond_0

    .line 417
    move-object p1, v1

    check-cast p1, Ll/ܺۡᩴ;

    invoke-virtual {p1}, Ll/ܺۡᩴ;->nextInt()I

    :cond_0
    return-object v1

    .line 415
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 0

    .line 449
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final removeIf(Ljava/util/function/Predicate;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 460
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final replaceAll(Ljava/util/function/UnaryOperator;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 466
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 0

    .line 454
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final size()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final sort(Ljava/util/Comparator;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/᩶ۡᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 358
    invoke-virtual {p0}, Ll/᩶ۡᩴ;->spliterator()Ll/ܽܺᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/ܽܺᩴ;
    .locals 2

    .line 183
    new-instance v0, Ll/ۢܺᩴ;

    iget v1, p0, Ll/᩶ۡᩴ;->᩸:I

    invoke-direct {v0, v1}, Ll/ۢܺᩴ;-><init>(I)V

    return-object v0
.end method

.method public final subList(II)Ll/֨ۡᩴ;
    .locals 4

    .line 424
    invoke-virtual {p0, p1}, Ll/ۤܿᩴ;->֫(I)V

    .line 425
    invoke-virtual {p0, p2}, Ll/ۤܿᩴ;->֫(I)V

    if-gt p1, p2, :cond_2

    if-nez p1, :cond_1

    const/4 p1, 0x1

    if-eq p2, p1, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    .line 427
    :cond_1
    :goto_0
    sget-object p1, Ll/۬ۡᩴ;->֫:Ll/᩸ۡᩴ;

    return-object p1

    .line 426
    :cond_2
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, ") is greater than end index ("

    const-string v2, ")"

    const-string v3, "Start index ("

    .line 0
    invoke-static {v3, p1, v1, v2, p2}, Ll/᩵ۢ֡;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    .line 426
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 517
    iget v0, p0, Ll/᩶ۡᩴ;->᩸:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    return-object v1
.end method

.method public final ֫(II)V
    .locals 0

    .line 552
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ֫(III[I)V
    .locals 3

    if-ltz p2, :cond_3

    add-int v0, p2, p3

    .line 543
    array-length v1, p4

    const-string v2, "End index ("

    if-gt v0, v1, :cond_2

    add-int/2addr p1, p3

    const/4 v0, 0x1

    if-gt p1, v0, :cond_1

    if-gtz p3, :cond_0

    return-void

    .line 547
    :cond_0
    iget p1, p0, Ll/᩶ۡᩴ;->᩸:I

    aput p1, p4, p2

    return-void

    .line 544
    :cond_1
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    const-string p3, ") is greater than list size (1)"

    .line 0
    invoke-static {p1, v2, p3}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 544
    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 543
    :cond_2
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string p2, ") is greater than array length ("

    .line 0
    invoke-static {v0, v2, p2}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    .line 543
    array-length p3, p4

    const-string p4, ")"

    .line 0
    invoke-static {p3, p4, p2}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p2

    .line 543
    invoke-direct {p1, p2}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 542
    :cond_3
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string p3, "Offset ("

    const-string p4, ") is negative"

    .line 0
    invoke-static {p2, p3, p4}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 542
    invoke-direct {p1, p2}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(II[I)V
    .locals 0

    .line 577
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ֫(Ljava/util/function/IntUnaryOperator;)V
    .locals 0

    .line 471
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ֫(ILl/֨ۢᩴ;)Z
    .locals 0

    .line 491
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ֫(Ljava/util/function/IntPredicate;)Z
    .locals 0

    .line 511
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ֫(Ll/֨ۡᩴ;)Z
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public final ֫(Ll/֨ۢᩴ;)Z
    .locals 0

    .line 496
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ۖ(I)Z
    .locals 0

    .line 374
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ۘ(I)I
    .locals 0

    .line 379
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ۧ(II[I)V
    .locals 0

    .line 562
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ۧ(Ll/ۙۢᩴ;)V
    .locals 0

    return-void
.end method

.method public final ۧ([I)V
    .locals 0

    .line 567
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ܶ()[I
    .locals 1

    .line 395
    iget v0, p0, Ll/᩶ۡᩴ;->᩸:I

    filled-new-array {v0}, [I

    move-result-object v0

    return-object v0
.end method

.method public final ܽ(Ll/ۙۢᩴ;)V
    .locals 0

    return-void
.end method

.method public final ܽ([I)V
    .locals 0

    .line 572
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ܽ(Ll/֨ۢᩴ;)Z
    .locals 0

    .line 501
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ᩳ(Ll/֨ۢᩴ;)Z
    .locals 0

    .line 506
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method
