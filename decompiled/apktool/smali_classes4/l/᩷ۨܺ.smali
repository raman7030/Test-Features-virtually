.class public final Ll/᩷ۨܺ;
.super Ljava/lang/Object;
.source "TUG"


# direct methods
.method public static ֫(Ll/ܿ᩺ᩴ;)Ll/ܽ۫ᩴ;
    .locals 8

    .line 898
    new-instance v0, Ll/ܿۨܺ;

    .line 880
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    .line 881
    iput-boolean v1, v0, Ll/ܿۨܺ;->֫:Z

    const/4 v1, 0x0

    .line 882
    iput-object v1, v0, Ll/ܿۨܺ;->ۧ:Ljava/lang/Object;

    .line 900
    new-instance v1, Ljava/util/ArrayDeque;

    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    .line 901
    invoke-interface {p0}, Ll/۫ۨᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 903
    :cond_0
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_8

    .line 904
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܶ۫ᩴ;

    .line 906
    invoke-interface {p0}, Ll/ܶ۫ᩴ;->getExactSizeIfKnown()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-nez v6, :cond_1

    goto :goto_0

    :cond_1
    const/16 v2, 0x4000

    .line 912
    invoke-interface {p0, v2}, Ll/ܶ۫ᩴ;->hasCharacteristics(I)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 915
    :cond_2
    invoke-interface {p0}, Ll/ܶ۫ᩴ;->trySplit()Ll/ܶ۫ᩴ;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 916
    invoke-interface {v1}, Ll/ܶ۫ᩴ;->getExactSizeIfKnown()J

    move-result-wide v2

    cmp-long v6, v2, v4

    if-nez v6, :cond_3

    goto :goto_1

    .line 918
    :cond_3
    invoke-interface {p0}, Ll/ܶ۫ᩴ;->getExactSizeIfKnown()J

    move-result-wide v2

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    move-object p0, v1

    .line 925
    :cond_4
    :goto_1
    new-instance v1, Ll/ᩳۨܺ;

    invoke-direct {v1, v0}, Ll/ᩳۨܺ;-><init>(Ll/ܿۨܺ;)V

    invoke-interface {p0, v1}, Ll/ܶ۫ᩴ;->forEachRemaining(Ljava/util/function/Consumer;)V

    .line 895
    iget-object p0, v0, Ll/ܿۨܺ;->ۧ:Ljava/lang/Object;

    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 926
    invoke-static {p0}, Ll/ܽ۫ᩴ;->of(Ljava/lang/Object;)Ll/ܽ۫ᩴ;

    move-result-object p0

    return-object p0

    .line 929
    :cond_5
    invoke-interface {p0}, Ll/ܶ۫ᩴ;->trySplit()Ll/ܶ۫ᩴ;

    move-result-object v2

    if-eqz v2, :cond_7

    .line 930
    invoke-interface {v2}, Ll/ܶ۫ᩴ;->getExactSizeIfKnown()J

    move-result-wide v6

    cmp-long v3, v6, v4

    if-nez v3, :cond_6

    goto :goto_2

    .line 939
    :cond_6
    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 940
    invoke-virtual {v1, p0}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    goto :goto_0

    .line 932
    :cond_7
    :goto_2
    new-instance v2, Ll/ᩳۨܺ;

    invoke-direct {v2, v0}, Ll/ᩳۨܺ;-><init>(Ll/ܿۨܺ;)V

    invoke-interface {p0, v2}, Ll/ܶ۫ᩴ;->forEachRemaining(Ljava/util/function/Consumer;)V

    .line 933
    iget-boolean p0, v0, Ll/ܿۨܺ;->֫:Z

    if-eqz p0, :cond_0

    .line 895
    iget-object p0, v0, Ll/ܿۨܺ;->ۧ:Ljava/lang/Object;

    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 934
    invoke-static {p0}, Ll/ܽ۫ᩴ;->of(Ljava/lang/Object;)Ll/ܽ۫ᩴ;

    move-result-object p0

    return-object p0

    .line 942
    :cond_8
    invoke-static {}, Ll/ܽ۫ᩴ;->empty()Ll/ܽ۫ᩴ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ܿ᩺ᩴ;Ll/֫᩺᩷;)Ll/ܿ᩺ᩴ;
    .locals 9

    .line 902
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 454
    invoke-interface {p0}, Ll/۫ۨᩴ;->isParallel()Z

    move-result v0

    .line 455
    invoke-interface {p0}, Ll/۫ۨᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v1

    const/16 v2, 0x4000

    .line 457
    invoke-interface {v1, v2}, Ll/ܶ۫ᩴ;->hasCharacteristics(I)Z

    move-result v2

    if-nez v2, :cond_0

    .line 458
    invoke-static {v1}, Ll/᩹۫ᩴ;->iterator(Ll/ܶ۫ᩴ;)Ljava/util/Iterator;

    move-result-object v7

    .line 459
    new-instance v2, Ll/᩻ۨܺ;

    .line 461
    invoke-interface {v1}, Ll/ܶ۫ᩴ;->estimateSize()J

    move-result-wide v4

    .line 462
    invoke-interface {v1}, Ll/ܶ۫ᩴ;->characteristics()I

    move-result v1

    and-int/lit8 v6, v1, 0x50

    move-object v3, v2

    move-object v8, p1

    invoke-direct/range {v3 .. v8}, Ll/᩻ۨܺ;-><init>(JILjava/util/Iterator;Ll/֫᩺᩷;)V

    .line 459
    invoke-static {v2, v0}, Ll/ܳ᩺ᩴ;->stream(Ll/ܶ۫ᩴ;Z)Ll/ܿ᩺ᩴ;

    move-result-object p1

    .line 475
    new-instance v0, Ll/ۚ᩸ۢ;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p0}, Ll/ۚ᩸ۢ;-><init>(ILjava/lang/Object;)V

    invoke-interface {p1, v0}, Ll/۫ۨᩴ;->onClose(Ljava/lang/Runnable;)Ll/۫ۨᩴ;

    move-result-object p0

    check-cast p0, Ll/ܿ᩺ᩴ;

    return-object p0

    .line 509
    :cond_0
    new-instance v2, Ll/ܳۨܺ;

    const-wide/16 v3, 0x0

    invoke-direct {v2, v1, v3, v4, p1}, Ll/ܳۨܺ;-><init>(Ll/ܶ۫ᩴ;JLl/֫᩺᩷;)V

    invoke-static {v2, v0}, Ll/ܳ᩺ᩴ;->stream(Ll/ܶ۫ᩴ;Z)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance v0, Ll/ۚ᩸ۢ;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p0}, Ll/ۚ᩸ۢ;-><init>(ILjava/lang/Object;)V

    invoke-interface {p1, v0}, Ll/۫ۨᩴ;->onClose(Ljava/lang/Runnable;)Ll/۫ۨᩴ;

    move-result-object p0

    check-cast p0, Ll/ܿ᩺ᩴ;

    return-object p0
.end method

.method public static varargs ֫([Ll/ܿ᩺ᩴ;)Ll/ܿ᩺ᩴ;
    .locals 15
    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    .line 198
    new-instance v0, Ll/֫۬ܺ;

    array-length v1, p0

    .line 776
    invoke-direct {v0, v1}, Ll/ۛۗܺ;-><init>(I)V

    .line 200
    array-length v1, p0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/16 v5, 0x150

    const/4 v6, 0x0

    move-wide v10, v2

    const/16 v9, 0x150

    const/4 v12, 0x0

    :goto_0
    if-ge v4, v1, :cond_3

    aget-object v5, p0, v4

    .line 201
    invoke-interface {v5}, Ll/۫ۨᩴ;->isParallel()Z

    move-result v6

    or-int/2addr v12, v6

    .line 202
    invoke-interface {v5}, Ll/۫ۨᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v5

    .line 789
    invoke-virtual {v0, v5}, Ll/ۛۗܺ;->֫(Ljava/lang/Object;)V

    .line 204
    invoke-interface {v5}, Ll/ܶ۫ᩴ;->characteristics()I

    move-result v6

    and-int/2addr v9, v6

    .line 205
    invoke-interface {v5}, Ll/ܶ۫ᩴ;->estimateSize()J

    move-result-wide v5

    add-long v7, v10, v5

    xor-long/2addr v5, v10

    const/4 v13, 0x1

    cmp-long v14, v5, v2

    if-gez v14, :cond_0

    const/4 v5, 0x1

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    :goto_1
    xor-long/2addr v10, v7

    cmp-long v6, v10, v2

    if-ltz v6, :cond_1

    goto :goto_2

    :cond_1
    const/4 v13, 0x0

    :goto_2
    or-int/2addr v5, v13

    if-eqz v5, :cond_2

    move-wide v10, v7

    goto :goto_3

    :cond_2
    const/16 v5, 0x3f

    ushr-long v5, v7, v5

    const-wide/16 v7, 0x1

    xor-long/2addr v5, v7

    const-wide v7, 0x7fffffffffffffffL

    add-long/2addr v5, v7

    move-wide v10, v5

    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 209
    :cond_3
    invoke-virtual {v0}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v1, 0x510

    .line 194
    invoke-static {v0, v1}, Ll/᩹۫ᩴ;->spliterator(Ljava/util/Collection;I)Ll/ܶ۫ᩴ;

    move-result-object v7

    .line 209
    new-instance v8, Ll/ۜ᩸ۢ;

    const/4 v0, 0x4

    invoke-direct {v8, v0}, Ll/ۜ᩸ۢ;-><init>(I)V

    .line 902
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    new-instance v0, Ll/۬ۙܺ;

    const/4 v6, 0x0

    move-object v5, v0

    invoke-direct/range {v5 .. v11}, Ll/۬ۙܺ;-><init>(Ll/ܶ۫ᩴ;Ll/ܶ۫ᩴ;Ll/ۜ᩸ۢ;IJ)V

    .line 207
    invoke-static {v0, v12}, Ll/ܳ᩺ᩴ;->stream(Ll/ܶ۫ᩴ;Z)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ܽۨܺ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p0}, Ll/ܽۨܺ;-><init>(ILjava/lang/Object;)V

    .line 214
    invoke-interface {v0, v1}, Ll/۫ۨᩴ;->onClose(Ljava/lang/Runnable;)Ll/۫ۨᩴ;

    move-result-object p0

    check-cast p0, Ll/ܿ᩺ᩴ;

    return-object p0
.end method
