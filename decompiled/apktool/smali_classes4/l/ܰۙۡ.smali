.class public final Ll/ܰۙۡ;
.super Ll/ܰۗۡ;
.source "51V0"


# instance fields
.field public final synthetic ܽ:Ll/ۢۗۡ;


# direct methods
.method public constructor <init>(Ll/ۢۗۡ;Ll/ܽܳۚ;Ll/᩵֫ۚ;)V
    .locals 0

    .line 406
    iput-object p1, p0, Ll/ܰۙۡ;->ܽ:Ll/ۢۗۡ;

    invoke-direct {p0, p2, p3}, Ll/ܰۗۡ;-><init>(Ll/ܽܳۚ;Ll/᩵֫ۚ;)V

    return-void
.end method


# virtual methods
.method public final ᩷()Ljava/lang/Iterable;
    .locals 14

    .line 410
    iget-object v0, p0, Ll/ܰۗۡ;->֫:Ll/᩵֫ۚ;

    invoke-interface {v0}, Ll/᩵֫ۚ;->᩷()Ljava/lang/Iterable;

    move-result-object v0

    const-class v1, Ll/᩺֫ۚ;

    invoke-static {v0, v1}, Ll/ۡ۫ܺ;->֫(Ljava/lang/Iterable;Ljava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩺֫ۚ;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 411
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v10, 0x0

    .line 412
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    iget-object v3, p0, Ll/ܰۙۡ;->ܽ:Ll/ۢۗۡ;

    if-ge v10, v1, :cond_a

    .line 413
    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺֫ۚ;

    .line 414
    invoke-interface {v1}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v4

    sget-object v5, Ll/֨ۗ֡;->֨ᩳ:Ll/֨ۗ֡;

    if-ne v4, v5, :cond_0

    .line 415
    check-cast v1, Ll/ۧܽۚ;

    .line 416
    invoke-interface {v1}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object v2

    check-cast v2, Ll/ۚܽۚ;

    .line 418
    invoke-static {v2}, Ll/ۢۗۡ;->֫(Ll/ۚܽۚ;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 419
    invoke-interface {v1}, Ll/ۤ֫ۚ;->ᩳ()I

    move-result v2

    invoke-static {v10, v2, v0}, Ll/ۢۗۡ;->ۧ(IILjava/util/List;)I

    move-result v2

    .line 420
    invoke-interface {v1}, Ll/ۤ֫ۚ;->ᩳ()I

    move-result v1

    invoke-static {v3, v0, v8, v2, v1}, Ll/ۢۗۡ;->֫(Ll/ۢۗۡ;Ljava/util/List;Ljava/util/HashMap;II)V

    goto/16 :goto_6

    .line 422
    :cond_0
    invoke-interface {v1}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v4

    sget-object v5, Ll/֨ۗ֡;->ۙᩳ:Ll/֨ۗ֡;

    if-ne v4, v5, :cond_9

    .line 423
    check-cast v1, Ll/ۧܽۚ;

    .line 424
    invoke-interface {v1}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object v4

    check-cast v4, Ll/ۚܽۚ;

    .line 705
    invoke-interface {v4}, Ll/ۚܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v5

    .line 706
    invoke-interface {v4}, Ll/ۚܽۚ;->getName()Ljava/lang/String;

    move-result-object v6

    .line 707
    invoke-interface {v4}, Ll/ۚܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object v7

    .line 708
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v11

    const-string v12, "Ljava/lang/Class;"

    const-string v13, "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;"

    sparse-switch v11, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x3

    goto :goto_2

    :sswitch_1
    const-string v2, "Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v2, 0x2

    goto :goto_2

    :sswitch_2
    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_4

    goto :goto_1

    :sswitch_3
    const-string v2, "Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    goto :goto_2

    :goto_1
    const/4 v2, -0x1

    :cond_4
    :goto_2
    packed-switch v2, :pswitch_data_0

    goto :goto_5

    :pswitch_0
    const-string v2, "Ljava/lang/reflect/Field;"

    .line 710
    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    const-string v2, "getField"

    .line 711
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    const-string v2, "getDeclaredField"

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_3

    :pswitch_1
    const-string v2, "newUpdater"

    .line 718
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 430
    :cond_5
    :goto_3
    invoke-interface {v1}, Ll/ۤ֫ۚ;->ᩳ()I

    move-result v2

    .line 432
    invoke-interface {v4}, Ll/ۚܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 433
    invoke-interface {v1}, Ll/ۤ֫ۚ;->ܳ()I

    move-result v1

    goto :goto_4

    :cond_6
    invoke-interface {v1}, Ll/ۤ֫ۚ;->ܽ()I

    move-result v1

    :goto_4
    move v6, v1

    .line 434
    invoke-static {v10, v2, v0}, Ll/ۢۗۡ;->֫(IILjava/util/List;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_9

    .line 435
    invoke-static {v3}, Ll/ۢۗۡ;->ۧ(Ll/ۢۗۡ;)Ll/ۘۗۡ;

    move-result-object v2

    invoke-virtual {v2, v1}, Ll/ۘۗۡ;->֫(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 436
    invoke-static {v3}, Ll/ۢۗۡ;->ۧ(Ll/ۢۗۡ;)Ll/ۘۗۡ;

    move-result-object v2

    invoke-virtual {v2, v1}, Ll/ۘۗۡ;->ۧ(Ljava/lang/String;)Ll/ۖۗۡ;

    move-result-object v4

    move-object v1, v3

    move-object v2, v0

    move-object v3, v8

    move v5, v10

    invoke-static/range {v1 .. v6}, Ll/ۢۗۡ;->֫(Ll/ۢۗۡ;Ljava/util/List;Ljava/util/HashMap;Ll/ۖۗۡ;II)V

    goto :goto_6

    .line 696
    :cond_7
    :goto_5
    invoke-interface {v4}, Ll/ۚܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v2

    .line 697
    invoke-interface {v4}, Ll/ۚܽۚ;->getName()Ljava/lang/String;

    move-result-object v5

    .line 698
    invoke-interface {v4}, Ll/ۚܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object v4

    .line 699
    invoke-virtual {v2, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    const-string v2, "getMethod"

    .line 700
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    const-string v2, "getDeclaredMethod"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    :cond_8
    const-string v2, "Ljava/lang/reflect/Method;"

    .line 701
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 441
    invoke-interface {v1}, Ll/ۤ֫ۚ;->ᩳ()I

    move-result v2

    .line 442
    invoke-interface {v1}, Ll/ۤ֫ۚ;->ܽ()I

    move-result v6

    .line 443
    invoke-interface {v1}, Ll/ۤ֫ۚ;->ܳ()I

    move-result v7

    .line 444
    invoke-static {v10, v2, v0}, Ll/ۢۗۡ;->֫(IILjava/util/List;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_9

    .line 445
    invoke-static {v3}, Ll/ۢۗۡ;->ۧ(Ll/ۢۗۡ;)Ll/ۘۗۡ;

    move-result-object v2

    invoke-virtual {v2, v1}, Ll/ۘۗۡ;->֫(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 446
    invoke-static {v3}, Ll/ۢۗۡ;->ۧ(Ll/ۢۗۡ;)Ll/ۘۗۡ;

    move-result-object v2

    invoke-virtual {v2, v1}, Ll/ۘۗۡ;->ۧ(Ljava/lang/String;)Ll/ۖۗۡ;

    move-result-object v4

    move-object v1, v3

    move-object v2, v0

    move-object v3, v8

    move v5, v10

    invoke-static/range {v1 .. v7}, Ll/ۢۗۡ;->֫(Ll/ۢۗۡ;Ljava/util/List;Ljava/util/HashMap;Ll/ۖۗۡ;III)V

    :cond_9
    :goto_6
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    .line 451
    :cond_a
    invoke-virtual {v8}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 452
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩺֫ۚ;

    invoke-interface {v0, v5, v4}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    .line 455
    :cond_b
    :goto_8
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-ge v9, v1, :cond_e

    .line 456
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺֫ۚ;

    .line 457
    invoke-static {v1}, Ll/ۢۗۡ;->֫(Ll/᩺֫ۚ;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_d

    .line 458
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_d

    .line 459
    invoke-static {v4}, Ll/ۢۗۡ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 0
    invoke-static {v2, v4}, Ll/۟ۤ᩻;->֫(ILjava/lang/String;)C

    move-result v5

    const/16 v6, 0x3b

    if-eq v5, v6, :cond_c

    goto :goto_9

    .line 464
    :cond_c
    invoke-static {v3, v4}, Ll/ۢۗۡ;->ܽ(Ll/ۢۗۡ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 465
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d

    .line 466
    check-cast v1, Ll/֫ۧۚ;

    invoke-interface {v1}, Ll/֫ۧۚ;->֫()I

    move-result v1

    .line 467
    new-instance v4, Ll/ۧ۬ۡ;

    invoke-static {v5}, Ll/ۢۗۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v1, v5}, Ll/ۧ۬ۡ;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v9, v4}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_d
    :goto_9
    add-int/lit8 v9, v9, 0x1

    goto :goto_8

    .line 472
    :cond_e
    iget-object v1, p0, Ll/ܰۗۡ;->ۧ:Ll/ܽܳۚ;

    invoke-virtual {v1}, Ll/ܽܳۚ;->ۢ()Ll/ᩳ᩻ۚ;

    move-result-object v1

    invoke-static {v0, v1}, Ll/᩸᩻ۚ;->֫(Ljava/lang/Iterable;Ll/ᩳ᩻ۚ;)Ljava/lang/Iterable;

    move-result-object v0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x73f2a713 -> :sswitch_3
        -0x4aafea1c -> :sswitch_2
        0x26e4eb91 -> :sswitch_1
        0x5a7e2503 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
