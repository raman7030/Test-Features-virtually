.class public abstract Ll/ᩳᩴᩴ;
.super Ll/ۨۘᩴ;
.source "J1MI"

# interfaces
.implements Ll/֫ۚᩴ;
.implements Ll/ۨ۬ᩴ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method public final addAll(Ljava/util/Collection;)Z
    .locals 1

    .line 131
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-interface {p0, v0, p1}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public clear()V
    .locals 2

    const/4 v0, 0x0

    .line 382
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    invoke-interface {p0, v0, v1}, Ll/֫ۚᩴ;->֫(II)V

    return-void
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 59
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Ll/ᩳᩴᩴ;->֫(Ljava/util/List;)I

    move-result p1

    return p1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 0

    .line 227
    invoke-virtual {p0, p1}, Ll/ᩳᩴᩴ;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    if-ne p1, p0, :cond_0

    goto :goto_2

    .line 423
    :cond_0
    instance-of v0, p1, Ljava/util/List;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    goto :goto_1

    .line 424
    :cond_1
    check-cast p1, Ljava/util/List;

    .line 425
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    .line 426
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-eq v0, v2, :cond_2

    goto :goto_1

    .line 151
    :cond_2
    invoke-interface {p0, v1}, Ll/֫ۚᩴ;->listIterator(I)Ll/ۧۚᩴ;

    move-result-object v2

    .line 427
    invoke-interface {p1}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object p1

    :goto_0
    add-int/lit8 v3, v0, -0x1

    if-eqz v0, :cond_4

    .line 428
    invoke-interface {v2}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v0, v4}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    :goto_1
    return v1

    :cond_3
    move v0, v3

    goto :goto_0

    :cond_4
    :goto_2
    const/4 p1, 0x1

    return p1
.end method

.method public forEach(Ljava/util/function/Consumer;)V
    .locals 3

    .line 276
    instance-of v0, p0, Ljava/util/RandomAccess;

    if-eqz v0, :cond_1

    .line 277
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 278
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void

    .line 281
    :cond_1
    invoke-static {p0, p1}, Ll/᩹֨ᩴ;->$default$forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final hashCode()I
    .locals 4

    const/4 v0, 0x0

    .line 151
    invoke-interface {p0, v0}, Ll/֫ۚᩴ;->listIterator(I)Ll/ۧۚᩴ;

    move-result-object v0

    .line 412
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    const/4 v2, 0x1

    :goto_0
    add-int/lit8 v3, v1, -0x1

    if-eqz v1, :cond_1

    .line 414
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    mul-int/lit8 v2, v2, 0x1f

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_1

    .line 415
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v2, v1

    move v1, v3

    goto :goto_0

    :cond_1
    return v2
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 2

    const/4 v0, 0x0

    .line 151
    invoke-interface {p0, v0}, Ll/֫ۚᩴ;->listIterator(I)Ll/ۧۚᩴ;

    move-result-object v0

    .line 234
    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 235
    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 236
    invoke-static {p1, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/ListIterator;->previousIndex()I

    move-result p1

    return p1

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    const/4 v0, 0x0

    .line 151
    invoke-interface {p0, v0}, Ll/֫ۚᩴ;->listIterator(I)Ll/ۧۚᩴ;

    move-result-object v0

    return-object v0
.end method

.method public iterator()Ll/۫֡ᩴ;
    .locals 1

    const/4 v0, 0x0

    .line 151
    invoke-interface {p0, v0}, Ll/֫ۚᩴ;->listIterator(I)Ll/ۧۚᩴ;

    move-result-object v0

    return-object v0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 2

    .line 243
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-interface {p0, v0}, Ll/֫ۚᩴ;->listIterator(I)Ll/ۧۚᩴ;

    move-result-object v0

    .line 245
    :cond_0
    invoke-interface {v0}, Ll/ܶ֡ᩴ;->hasPrevious()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 246
    invoke-interface {v0}, Ll/ܶ֡ᩴ;->previous()Ljava/lang/Object;

    move-result-object v1

    .line 247
    invoke-static {p1, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    move-result p1

    return p1

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public listIterator()Ljava/util/ListIterator;
    .locals 1

    const/4 v0, 0x0

    .line 151
    invoke-interface {p0, v0}, Ll/֫ۚᩴ;->listIterator(I)Ll/ۧۚᩴ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 0

    .line 507
    invoke-interface {p0, p1}, Ll/֫ۚᩴ;->listIterator(I)Ll/ۧۚᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final listIterator()Ll/ۧۚᩴ;
    .locals 1

    const/4 v0, 0x0

    .line 151
    invoke-interface {p0, v0}, Ll/֫ۚᩴ;->listIterator(I)Ll/ۧۚᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final pop()Ljava/lang/Object;
    .locals 1

    .line 472
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 473
    move-object v0, p0

    check-cast v0, Ll/᩵֡ᩴ;

    .line 438
    iget v0, v0, Ll/᩵֡ᩴ;->᩹:I

    add-int/lit8 v0, v0, -0x1

    .line 473
    invoke-interface {p0, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 472
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public synthetic replaceAll(Ljava/util/function/UnaryOperator;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۤ۬ᩴ;->$default$replaceAll(Ljava/util/List;Ljava/util/function/UnaryOperator;)V

    return-void
.end method

.method public sort(Ljava/util/Comparator;)V
    .locals 3

    .line 356
    invoke-interface {p0}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-nez p1, :cond_0

    .line 1602
    array-length p1, v0

    .line 1585
    invoke-static {v0, v1, p1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;II)V

    goto :goto_0

    .line 1641
    :cond_0
    array-length v2, v0

    .line 1623
    invoke-static {v0, v1, v2, p1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    .line 204
    :goto_0
    array-length p1, v0

    invoke-interface {p0, v1, p1, v0}, Ll/֫ۚᩴ;->֫(II[Ljava/lang/Object;)V

    return-void
.end method

.method public spliterator()Ll/۠ۚᩴ;
    .locals 5

    .line 105
    instance-of v0, p0, Ljava/util/RandomAccess;

    if-eqz v0, :cond_0

    .line 106
    new-instance v0, Ll/ܰۘᩴ;

    invoke-direct {v0, p0}, Ll/ܰۘᩴ;-><init>(Ll/ᩳᩴᩴ;)V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    .line 151
    invoke-interface {p0, v0}, Ll/֫ۚᩴ;->listIterator(I)Ll/ۧۚᩴ;

    move-result-object v0

    .line 108
    invoke-static {p0}, Ll/ۘ᩺ۘ;->֫(Ljava/util/Collection;)J

    move-result-wide v1

    .line 1278
    new-instance v3, Ll/۬ۚᩴ;

    const/16 v4, 0x4050

    invoke-direct {v3, v0, v1, v2, v4}, Ll/۬ۚᩴ;-><init>(Ll/۫֡ᩴ;JI)V

    return-object v3
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 3

    .line 387
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 389
    sget-object v0, Ll/۠֡ᩴ;->ۧ:[Ljava/lang/Object;

    return-object v0

    .line 390
    :cond_0
    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    .line 391
    invoke-interface {p0, v2, v2, v0, v1}, Ll/֫ۚᩴ;->֫(III[Ljava/lang/Object;)V

    return-object v1
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 2

    .line 397
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    .line 398
    array-length v1, p1

    if-ge v1, v0, :cond_0

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    :cond_0
    const/4 v1, 0x0

    .line 399
    invoke-interface {p0, v1, v1, v0, p1}, Ll/֫ۚᩴ;->֫(III[Ljava/lang/Object;)V

    .line 400
    array-length v1, p1

    if-le v1, v0, :cond_1

    const/4 v1, 0x0

    aput-object v1, p1, v0

    :cond_1
    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 489
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 151
    invoke-interface {p0, v1}, Ll/֫ۚᩴ;->listIterator(I)Ll/ۧۚᩴ;

    move-result-object v1

    .line 491
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    const/4 v3, 0x1

    :goto_0
    add-int/lit8 v4, v2, -0x1

    if-eqz v2, :cond_2

    if-eqz v3, :cond_0

    const/4 v2, 0x0

    const/4 v3, 0x0

    goto :goto_1

    :cond_0
    const-string v2, ", "

    .line 497
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 498
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    if-ne p0, v2, :cond_1

    const-string v2, "(this list)"

    .line 499
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 500
    :cond_1
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_2
    move v2, v4

    goto :goto_0

    :cond_2
    const-string v1, "]"

    .line 502
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 503
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ֫(Ljava/util/List;)I
    .locals 4

    const/4 v0, 0x0

    if-ne p1, p0, :cond_0

    goto/16 :goto_2

    .line 446
    :cond_0
    instance-of v1, p1, Ll/֫ۚᩴ;

    if-eqz v1, :cond_4

    .line 151
    invoke-interface {p0, v0}, Ll/֫ۚᩴ;->listIterator(I)Ll/ۧۚᩴ;

    move-result-object v1

    .line 447
    check-cast p1, Ll/֫ۚᩴ;

    invoke-interface {p1}, Ll/֫ۚᩴ;->listIterator()Ll/ۧۚᩴ;

    move-result-object p1

    .line 450
    :cond_1
    invoke-interface {v1}, Ljava/util/ListIterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/ListIterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 451
    invoke-interface {v1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 452
    invoke-interface {p1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 453
    check-cast v2, Ljava/lang/Comparable;

    invoke-interface {v2, v3}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v2

    if-eqz v2, :cond_1

    return v2

    .line 455
    :cond_2
    invoke-interface {p1}, Ljava/util/ListIterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-interface {v1}, Ljava/util/ListIterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_8

    goto :goto_1

    .line 151
    :cond_4
    invoke-interface {p0, v0}, Ll/֫ۚᩴ;->listIterator(I)Ll/ۧۚᩴ;

    move-result-object v1

    .line 457
    invoke-interface {p1}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object p1

    .line 459
    :cond_5
    invoke-interface {v1}, Ljava/util/ListIterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p1}, Ljava/util/ListIterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 460
    invoke-interface {v1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Comparable;

    invoke-interface {p1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v2

    if-eqz v2, :cond_5

    return v2

    .line 462
    :cond_6
    invoke-interface {p1}, Ljava/util/ListIterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_7

    :goto_0
    const/4 p1, -0x1

    return p1

    :cond_7
    invoke-interface {v1}, Ljava/util/ListIterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_8

    :goto_1
    const/4 p1, 0x1

    return p1

    :cond_8
    :goto_2
    return v0
.end method

.method public final ֫(I)V
    .locals 3

    const-string v0, "Index ("

    if-ltz p1, :cond_1

    .line 55
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-gt p1, v1, :cond_0

    return-void

    :cond_0
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, ") is greater than list size ("

    .line 0
    invoke-static {p1, v0, v2}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 55
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 54
    :cond_1
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, ") is negative"

    .line 0
    invoke-static {p1, v0, v2}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 54
    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final ܿ()Ljava/lang/Object;
    .locals 1

    .line 478
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 479
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 478
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final ᩳ(I)V
    .locals 3

    const-string v0, "Index ("

    if-ltz p1, :cond_1

    .line 68
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    return-void

    :cond_0
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, ") is greater than or equal to list size ("

    .line 0
    invoke-static {p1, v0, v2}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 68
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 67
    :cond_1
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, ") is negative"

    .line 0
    invoke-static {p1, v0, v2}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 67
    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
