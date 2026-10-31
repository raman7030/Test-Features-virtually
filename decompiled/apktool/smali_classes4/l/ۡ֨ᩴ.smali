.class public final synthetic Ll/ۡ֨ᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ljava/util/function/Predicate;
.implements Ll/ۗۗᩴ;
.implements Ljava/util/function/Function;
.implements Ljava/util/function/UnaryOperator;
.implements Ljava/util/function/IntFunction;
.implements Ljava/util/function/BinaryOperator;
.implements Ljava/util/function/BiConsumer;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ll/ۡ֨ᩴ;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Ll/ۡ֨ᩴ;->a:I

    sparse-switch v0, :sswitch_data_0

    .line 0
    check-cast p1, Ll/᩶۫ᩴ;

    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {p1, p2}, Ll/᩶۫ᩴ;->add(Ljava/lang/CharSequence;)Ll/᩶۫ᩴ;

    return-void

    :sswitch_0
    check-cast p1, Ljava/util/Set;

    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void

    :sswitch_1
    check-cast p1, Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :sswitch_2
    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xf -> :sswitch_2
        0x11 -> :sswitch_1
        0x14 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic and(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    invoke-static {p0, p1}, Ll/᩵ۛᩴ;->$default$and(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public synthetic andThen(Ljava/util/function/BiConsumer;)Ljava/util/function/BiConsumer;
    .locals 1

    iget v0, p0, Ll/ۡ֨ᩴ;->a:I

    sparse-switch v0, :sswitch_data_0

    .line 0
    invoke-static {p0, p1}, Ll/ᩳۛᩴ;->$default$andThen(Ljava/util/function/BiConsumer;Ljava/util/function/BiConsumer;)Ljava/util/function/BiConsumer;

    move-result-object p1

    return-object p1

    :sswitch_0
    invoke-static {p0, p1}, Ll/ᩳۛᩴ;->$default$andThen(Ljava/util/function/BiConsumer;Ljava/util/function/BiConsumer;)Ljava/util/function/BiConsumer;

    move-result-object p1

    return-object p1

    :sswitch_1
    invoke-static {p0, p1}, Ll/ᩳۛᩴ;->$default$andThen(Ljava/util/function/BiConsumer;Ljava/util/function/BiConsumer;)Ljava/util/function/BiConsumer;

    move-result-object p1

    return-object p1

    :sswitch_2
    invoke-static {p0, p1}, Ll/ᩳۛᩴ;->$default$andThen(Ljava/util/function/BiConsumer;Ljava/util/function/BiConsumer;)Ljava/util/function/BiConsumer;

    move-result-object p1

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        0xf -> :sswitch_2
        0x11 -> :sswitch_1
        0x14 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/BiFunction;
    .locals 1

    iget v0, p0, Ll/ۡ֨ᩴ;->a:I

    sparse-switch v0, :sswitch_data_0

    .line 0
    invoke-static {p0, p1}, Ll/ܿۛᩴ;->$default$andThen(Ljava/util/function/BiFunction;Ljava/util/function/Function;)Ljava/util/function/BiFunction;

    move-result-object p1

    return-object p1

    :sswitch_0
    invoke-static {p0, p1}, Ll/ܿۛᩴ;->$default$andThen(Ljava/util/function/BiFunction;Ljava/util/function/Function;)Ljava/util/function/BiFunction;

    move-result-object p1

    return-object p1

    :sswitch_1
    invoke-static {p0, p1}, Ll/ܿۛᩴ;->$default$andThen(Ljava/util/function/BiFunction;Ljava/util/function/Function;)Ljava/util/function/BiFunction;

    move-result-object p1

    return-object p1

    :sswitch_2
    invoke-static {p0, p1}, Ll/ܿۛᩴ;->$default$andThen(Ljava/util/function/BiFunction;Ljava/util/function/Function;)Ljava/util/function/BiFunction;

    move-result-object p1

    return-object p1

    :sswitch_3
    invoke-static {p0, p1}, Ll/ܿۛᩴ;->$default$andThen(Ljava/util/function/BiFunction;Ljava/util/function/Function;)Ljava/util/function/BiFunction;

    move-result-object p1

    return-object p1

    :sswitch_4
    invoke-static {p0, p1}, Ll/ܿۛᩴ;->$default$andThen(Ljava/util/function/BiFunction;Ljava/util/function/Function;)Ljava/util/function/BiFunction;

    move-result-object p1

    return-object p1

    :sswitch_5
    invoke-static {p0, p1}, Ll/ܿۛᩴ;->$default$andThen(Ljava/util/function/BiFunction;Ljava/util/function/Function;)Ljava/util/function/BiFunction;

    move-result-object p1

    return-object p1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_5
        0x10 -> :sswitch_4
        0x12 -> :sswitch_3
        0x15 -> :sswitch_2
        0x17 -> :sswitch_1
        0x1a -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 1

    iget v0, p0, Ll/ۡ֨ᩴ;->a:I

    sparse-switch v0, :sswitch_data_0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1

    :sswitch_0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1

    :sswitch_1
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1

    :sswitch_2
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1

    :sswitch_3
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1

    :sswitch_4
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        0xb -> :sswitch_4
        0xc -> :sswitch_3
        0x13 -> :sswitch_2
        0x16 -> :sswitch_1
        0x18 -> :sswitch_0
    .end sparse-switch
.end method

.method public apply(I)Ljava/lang/Object;
    .locals 0

    .line 710
    new-array p1, p1, [Ljava/lang/Object;

    return-object p1
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ll/ۡ֨ᩴ;->a:I

    sparse-switch v0, :sswitch_data_0

    .line 0
    check-cast p1, Ll/᩶۫ᩴ;

    invoke-virtual {p1}, Ll/᩶۫ᩴ;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :sswitch_0
    sget-object v0, Ll/᩺ۨᩴ;->a:Ljava/util/Set;

    return-object p1

    :sswitch_1
    check-cast p1, Ljava/util/Set;

    sget-object v0, Ll/᩺ۨᩴ;->a:Ljava/util/Set;

    .line 356
    invoke-interface {p1}, Ljava/util/Set;->toArray()[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ll/᩺ۚᩴ;->D([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    return-object p1

    .line 0
    :sswitch_2
    check-cast p1, Ljava/util/List;

    sget-object v0, Ll/᩺ۨᩴ;->a:Ljava/util/Set;

    .line 299
    invoke-interface {p1}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ll/᩺ۚᩴ;->B([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    :sswitch_3
    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        0xb -> :sswitch_3
        0xc -> :sswitch_3
        0x13 -> :sswitch_2
        0x16 -> :sswitch_1
        0x18 -> :sswitch_0
    .end sparse-switch
.end method

.method public apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Ll/ۡ֨ᩴ;->a:I

    const/4 v1, 0x0

    sparse-switch v0, :sswitch_data_0

    check-cast p1, Ljava/util/Set;

    check-cast p2, Ljava/util/Set;

    sget-object v0, Ll/᩺ۨᩴ;->a:Ljava/util/Set;

    .line 321
    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Set;->size()I

    move-result v1

    if-ge v0, v1, :cond_4

    .line 322
    invoke-interface {p2, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    move-object p1, p2

    goto/16 :goto_3

    .line 0
    :sswitch_0
    check-cast p1, Ll/᩶۫ᩴ;

    check-cast p2, Ll/᩶۫ᩴ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    iget-object v0, p2, Ll/᩶۫ᩴ;->d:[Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_0

    .line 236
    :cond_0
    invoke-virtual {p2}, Ll/᩶۫ᩴ;->a()V

    .line 237
    iget-object p2, p2, Ll/᩶۫ᩴ;->d:[Ljava/lang/String;

    aget-object p2, p2, v1

    invoke-virtual {p1, p2}, Ll/᩶۫ᩴ;->add(Ljava/lang/CharSequence;)Ll/᩶۫ᩴ;

    move-result-object p1

    :goto_0
    return-object p1

    .line 0
    :sswitch_1
    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/List;

    sget-object v0, Ll/᩺ۨᩴ;->a:Ljava/util/Set;

    .line 279
    invoke-interface {p1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object p1

    .line 0
    :sswitch_2
    check-cast p1, Ljava/util/Set;

    check-cast p2, Ljava/util/Set;

    sget-object v0, Ll/᩺ۨᩴ;->a:Ljava/util/Set;

    .line 350
    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Set;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 351
    invoke-interface {p2, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    move-object p1, p2

    goto :goto_1

    .line 353
    :cond_1
    invoke-interface {p1, p2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :goto_1
    return-object p1

    .line 0
    :sswitch_3
    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/List;

    sget-object v0, Ll/᩺ۨᩴ;->a:Ljava/util/Set;

    .line 298
    invoke-interface {p1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object p1

    .line 0
    :sswitch_4
    check-cast p1, Ljava/util/Collection;

    check-cast p2, Ljava/util/Collection;

    sget-object v0, Ll/᩺ۨᩴ;->a:Ljava/util/Set;

    .line 262
    invoke-interface {p1, p2}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    return-object p1

    .line 0
    :sswitch_5
    check-cast p1, Ljava/util/Map;

    check-cast p2, Ljava/util/Map;

    sget-object v0, Ll/᩺ۨᩴ;->a:Ljava/util/Set;

    .line 151
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 152
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    .line 153
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 154
    invoke-static {p1, v2, v0}, Ll/ܰ۬ᩴ;->putIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_2

    goto :goto_2

    .line 133
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const/4 p2, 0x3

    new-array p2, p2, [Ljava/lang/Object;

    aput-object v2, p2, v1

    const/4 v1, 0x1

    aput-object v3, p2, v1

    const/4 v1, 0x2

    aput-object v0, p2, v1

    const-string v0, "Duplicate key %s (attempted merging values %s and %s)"

    invoke-static {v0, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 155
    throw p1

    :cond_3
    return-object p1

    .line 324
    :cond_4
    invoke-interface {p1, p2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :goto_3
    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_5
        0x10 -> :sswitch_4
        0x12 -> :sswitch_3
        0x15 -> :sswitch_2
        0x17 -> :sswitch_1
        0x1a -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 1

    iget v0, p0, Ll/ۡ֨ᩴ;->a:I

    sparse-switch v0, :sswitch_data_0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1

    :sswitch_0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1

    :sswitch_1
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1

    :sswitch_2
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1

    :sswitch_3
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1

    :sswitch_4
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        0xb -> :sswitch_4
        0xc -> :sswitch_3
        0x13 -> :sswitch_2
        0x16 -> :sswitch_1
        0x18 -> :sswitch_0
    .end sparse-switch
.end method

.method public h(Ll/ۖۗᩴ;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ll/ۡ֨ᩴ;->a:I

    packed-switch v0, :pswitch_data_0

    .line 446
    :pswitch_0
    sget-object v0, Ll/ᩴۗᩴ;->NANO_OF_DAY:Ll/ᩴۗᩴ;

    invoke-interface {p1, v0}, Ll/ۖۗᩴ;->e(Ll/ۤۗᩴ;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 447
    invoke-interface {p1, v0}, Ll/ۖۗᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ll/۟ۙᩴ;->a0(J)Ll/۟ۙᩴ;

    move-result-object p1

    goto :goto_4

    .line 428
    :pswitch_1
    sget-object v0, Ll/ᩴۗᩴ;->EPOCH_DAY:Ll/ᩴۗᩴ;

    invoke-interface {p1, v0}, Ll/ۖۗᩴ;->e(Ll/ۤۗᩴ;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 429
    invoke-interface {p1, v0}, Ll/ۖۗᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ll/ᩴ᩹ᩴ;->i0(J)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1

    .line 412
    :pswitch_2
    sget-object v0, Ll/ۛۗᩴ;->a:Ll/ۡ֨ᩴ;

    invoke-interface {p1, v0}, Ll/ۖۗᩴ;->T(Ll/ۡ֨ᩴ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚ᩹ᩴ;

    if-eqz v0, :cond_1

    goto :goto_1

    .line 413
    :cond_1
    sget-object v0, Ll/ۛۗᩴ;->d:Ll/ۡ֨ᩴ;

    invoke-interface {p1, v0}, Ll/ۖۗᩴ;->T(Ll/ۡ֨ᩴ;)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ll/ۚ᩹ᩴ;

    :goto_1
    return-object v0

    .line 394
    :pswitch_3
    sget-object v0, Ll/ᩴۗᩴ;->OFFSET_SECONDS:Ll/ᩴۗᩴ;

    invoke-interface {p1, v0}, Ll/ۖۗᩴ;->e(Ll/ۤۗᩴ;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 395
    invoke-interface {p1, v0}, Ll/ۖۗᩴ;->l(Ll/ۤۗᩴ;)I

    move-result p1

    invoke-static {p1}, Ll/ᩳ۬ᩴ;->e0(I)Ll/ᩳ۬ᩴ;

    move-result-object p1

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_2
    return-object p1

    .line 378
    :pswitch_4
    sget-object v0, Ll/ۛۗᩴ;->c:Ll/ۡ֨ᩴ;

    invoke-interface {p1, v0}, Ll/ۖۗᩴ;->T(Ll/ۡ֨ᩴ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۘۗᩴ;

    return-object p1

    .line 362
    :pswitch_5
    sget-object v0, Ll/ۛۗᩴ;->b:Ll/ۡ֨ᩴ;

    invoke-interface {p1, v0}, Ll/ۖۗᩴ;->T(Ll/ۡ֨ᩴ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۖ᩶ᩴ;

    return-object p1

    .line 347
    :pswitch_6
    sget-object v0, Ll/ۛۗᩴ;->a:Ll/ۡ֨ᩴ;

    invoke-interface {p1, v0}, Ll/ۖۗᩴ;->T(Ll/ۡ֨ᩴ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚ᩹ᩴ;

    return-object p1

    .line 159
    :pswitch_7
    sget-object v0, Ll/ۛۗᩴ;->a:Ll/ۡ֨ᩴ;

    invoke-interface {p1, v0}, Ll/ۖۗᩴ;->T(Ll/ۡ֨ᩴ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚ᩹ᩴ;

    if-eqz p1, :cond_3

    .line 160
    instance-of v0, p1, Ll/ᩳ۬ᩴ;

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    const/4 p1, 0x0

    :goto_3
    return-object p1

    .line 0
    :pswitch_8
    invoke-static {p1}, Ll/᩵᩹ᩴ;->V(Ll/ۖۗᩴ;)Ll/᩵᩹ᩴ;

    move-result-object p1

    return-object p1

    :cond_4
    const/4 p1, 0x0

    :goto_4
    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public synthetic negate()Ljava/util/function/Predicate;
    .locals 1

    invoke-static {p0}, Ll/᩵ۛᩴ;->$default$negate(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object v0

    return-object v0
.end method

.method public synthetic or(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    invoke-static {p0, p1}, Ll/᩵ۛᩴ;->$default$or(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public s(Ll/ܺۗᩴ;)Ll/ܺۗᩴ;
    .locals 3

    .line 189
    sget-object v0, Ll/ᩴۗᩴ;->DAY_OF_MONTH:Ll/ᩴۗᩴ;

    invoke-interface {p1, v0}, Ll/ۖۗᩴ;->n(Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object v1

    .line 253
    iget-wide v1, v1, Ll/᩺ۗᩴ;->d:J

    .line 189
    invoke-interface {p1, v1, v2, v0}, Ll/ܺۗᩴ;->c(JLl/ۤۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    return-object p1
.end method

.method public test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/lang/String;

    .line 89
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Ll/ۡ֨ᩴ;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    const-string v0, "LocalTime"

    return-object v0

    :pswitch_1
    const-string v0, "LocalDate"

    return-object v0

    :pswitch_2
    const-string v0, "Zone"

    return-object v0

    :pswitch_3
    const-string v0, "ZoneOffset"

    return-object v0

    :pswitch_4
    const-string v0, "Precision"

    return-object v0

    :pswitch_5
    const-string v0, "Chronology"

    return-object v0

    :pswitch_6
    const-string v0, "ZoneId"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
