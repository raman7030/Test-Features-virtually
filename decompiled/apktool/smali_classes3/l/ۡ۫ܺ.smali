.class public final Ll/ۡ۫ܺ;
.super Ljava/lang/Object;
.source "F5KS"


# direct methods
.method public static ֫(Ljava/lang/Iterable;)Ljava/lang/Iterable;
    .locals 1

    .line 279
    new-instance v0, Ll/֨ۗܺ;

    invoke-direct {v0, p0}, Ll/֨ۗܺ;-><init>(Ljava/lang/Iterable;)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/lang/Iterable;
    .locals 3

    const/4 v0, 0x2

    new-array v1, v0, [Ljava/lang/Iterable;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x1

    aput-object p1, v1, p0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 290
    aget-object p0, v1, v2

    .line 902
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 293
    :cond_0
    new-instance p0, Ll/ܶۗܺ;

    invoke-direct {p0, v1}, Ll/ܶۗܺ;-><init>([Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public static ֫(Ljava/lang/Iterable;Ll/ܽܶܺ;)Ljava/lang/Iterable;
    .locals 1

    .line 902
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 757
    new-instance v0, Ll/᩷۫ܺ;

    invoke-direct {v0, p0, p1}, Ll/᩷۫ܺ;-><init>(Ljava/lang/Iterable;Ll/ܽܶܺ;)V

    return-object v0
.end method

.method public static ֫(Ljava/util/Collection;)Ljava/lang/Object;
    .locals 3

    .line 305
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 312
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 313
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    .line 317
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "expected one element but was: <"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    :goto_0
    const/4 v2, 0x4

    if-ge v0, v2, :cond_1

    .line 318
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, ", "

    .line 319
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 321
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p0

    if-eqz p0, :cond_2

    const-string p0, ", ..."

    .line 322
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    const/16 p0, 0x3e

    .line 324
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 326
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/util/List;Ll/ᩴܶܺ;II)V
    .locals 2

    .line 240
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    :cond_0
    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-le v0, p3, :cond_1

    .line 241
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ll/ᩴܶܺ;->apply(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 242
    invoke-interface {p0, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    :goto_1
    add-int/lit8 p3, p3, -0x1

    if-lt p3, p2, :cond_2

    .line 247
    invoke-interface {p0, p3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    return-void
.end method

.method public static ֫(Ljava/lang/Iterable;Ll/ᩴܶܺ;)Z
    .locals 4

    .line 651
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const-string v0, "predicate"

    .line 803
    invoke-static {p1, v0}, Ll/ۘܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 804
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, -0x1

    if-eqz v2, :cond_1

    .line 805
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 806
    invoke-interface {p1, v2}, Ll/ᩴܶܺ;->apply(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, -0x1

    :goto_1
    if-eq v1, v3, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    return v0
.end method

.method public static ֫(Ljava/lang/Iterable;Ljava/lang/Class;)[Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    .line 52
    invoke-static {p1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    .line 358
    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_0

    .line 359
    check-cast p0, Ljava/util/Collection;

    goto :goto_0

    .line 360
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-static {p0}, Ll/۟۫ܺ;->֫(Ljava/util/Iterator;)Ljava/util/ArrayList;

    move-result-object p0

    .line 338
    :goto_0
    invoke-interface {p0, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ljava/lang/Iterable;Ll/ᩴܶܺ;)Ljava/lang/Iterable;
    .locals 1

    .line 902
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 614
    new-instance v0, Ll/ۜ۫ܺ;

    invoke-direct {v0, p0, p1}, Ll/ۜ۫ܺ;-><init>(Ljava/lang/Iterable;Ll/ᩴܶܺ;)V

    return-object v0
.end method

.method public static ۧ(Ljava/lang/Iterable;)Ljava/lang/Object;
    .locals 2

    .line 857
    instance-of v0, p0, Ljava/util/List;

    if-eqz v0, :cond_1

    .line 858
    check-cast p0, Ljava/util/List;

    .line 859
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 0
    invoke-static {v0, p0}, Ll/۟֫ᩴ;->֫(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 860
    :cond_0
    new-instance p0, Ljava/util/NoSuchElementException;

    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    throw p0

    .line 863
    :cond_1
    instance-of v0, p0, Ljava/util/SortedSet;

    if-eqz v0, :cond_2

    .line 864
    check-cast p0, Ljava/util/SortedSet;

    invoke-interface {p0}, Ljava/util/SortedSet;->last()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 867
    :cond_2
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 906
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 907
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_3

    return-object v0
.end method

.method public static ܽ(Ljava/lang/Iterable;Ll/ᩴܶܺ;)V
    .locals 4

    .line 190
    instance-of v0, p0, Ljava/util/RandomAccess;

    if-eqz v0, :cond_3

    instance-of v0, p0, Ljava/util/List;

    if-eqz v0, :cond_3

    .line 191
    check-cast p0, Ljava/util/List;

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 205
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_2

    .line 206
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    .line 207
    invoke-interface {p1, v2}, Ll/ᩴܶܺ;->apply(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    if-le v0, v1, :cond_0

    .line 210
    :try_start_0
    invoke-interface {p0, v1, v2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 215
    :catch_0
    invoke-static {p0, p1, v1, v0}, Ll/ۡ۫ܺ;->֫(Ljava/util/List;Ll/ᩴܶܺ;II)V

    goto :goto_3

    .line 212
    :catch_1
    invoke-static {p0, p1, v1, v0}, Ll/ۡ۫ܺ;->֫(Ljava/util/List;Ll/ᩴܶܺ;II)V

    goto :goto_3

    :cond_0
    :goto_1
    add-int/lit8 v1, v1, 0x1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 224
    :cond_2
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p1

    invoke-interface {p0, v1, p1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->clear()V

    return-void

    .line 193
    :cond_3
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    :cond_4
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 233
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Ll/ᩴܶܺ;->apply(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 234
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    goto :goto_2

    :cond_5
    :goto_3
    return-void
.end method

.method public static ܽ(Ljava/lang/Iterable;)Z
    .locals 1

    .line 1051
    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_0

    .line 1052
    check-cast p0, Ljava/util/Collection;

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    return p0

    .line 1054
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static ܿ(Ljava/lang/Iterable;)[Ljava/lang/Object;
    .locals 1

    .line 358
    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_0

    .line 359
    check-cast p0, Ljava/util/Collection;

    goto :goto_0

    .line 360
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-static {p0}, Ll/۟۫ܺ;->֫(Ljava/util/Iterator;)Ljava/util/ArrayList;

    move-result-object p0

    .line 348
    :goto_0
    invoke-interface {p0}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static ᩳ(Ljava/lang/Iterable;)I
    .locals 1

    .line 118
    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_0

    .line 119
    check-cast p0, Ljava/util/Collection;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result p0

    return p0

    .line 120
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-static {p0}, Ll/ۙ۫ܺ;->ܽ(Ljava/util/Iterator;)I

    move-result p0

    return p0
.end method
