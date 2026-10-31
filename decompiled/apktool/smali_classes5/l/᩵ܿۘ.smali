.class public final synthetic Ll/᩵ܿۘ;
.super Ljava/lang/Object;
.source "D1LP"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ۗ:Z

.field public final synthetic ۙ:Ll/ۚܿۘ;

.field public final synthetic ᩶:Ljava/lang/CharSequence;

.field public final synthetic ᩸:Ljava/util/ArrayList;

.field public final synthetic ᩹:Ljava/lang/CharSequence;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ll/ۚܿۘ;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵ܿۘ;->᩸:Ljava/util/ArrayList;

    iput-object p2, p0, Ll/᩵ܿۘ;->᩹:Ljava/lang/CharSequence;

    iput-object p3, p0, Ll/᩵ܿۘ;->᩶:Ljava/lang/CharSequence;

    iput-object p4, p0, Ll/᩵ܿۘ;->ۙ:Ll/ۚܿۘ;

    iput-boolean p5, p0, Ll/᩵ܿۘ;->ۗ:Z

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 14

    .line 2
    check-cast p1, Ljava/util/List;

    .line 446
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    .line 449
    iget-boolean v1, p0, Ll/᩵ܿۘ;->ۗ:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    sget-object v1, Ll/ۚܿۘ;->᩶:Ll/ۚܿۘ;

    iget-object v3, p0, Ll/᩵ܿۘ;->ۙ:Ll/ۚܿۘ;

    if-ne v3, v1, :cond_5

    const/4 v1, 0x0

    .line 450
    :goto_0
    iget-object v3, p0, Ll/᩵ܿۘ;->᩹:Ljava/lang/CharSequence;

    iget-object v4, p0, Ll/᩵ܿۘ;->᩶:Ljava/lang/CharSequence;

    if-ge v1, v0, :cond_2

    .line 451
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֡ܳۘ;

    .line 452
    new-instance v6, Ll/ܿ᩻ۘ;

    invoke-interface {v5}, Ll/ᩴܳۘ;->ᩳ()I

    move-result v7

    invoke-interface {v5}, Ll/ᩴܳۘ;->֫()I

    move-result v8

    invoke-direct {v6, v7, v8, v3}, Ll/ܿ᩻ۘ;-><init>(IILjava/lang/CharSequence;)V

    .line 453
    new-instance v7, Ll/ܿ᩻ۘ;

    invoke-interface {v5}, Ll/ᩴܳۘ;->ܿ()I

    move-result v8

    invoke-interface {v5}, Ll/ᩴܳۘ;->᩻()I

    move-result v9

    invoke-direct {v7, v8, v9, v4}, Ll/ܿ᩻ۘ;-><init>(IILjava/lang/CharSequence;)V

    .line 455
    invoke-interface {v5}, Ll/֡ܳۘ;->ܳ()Ljava/util/List;

    move-result-object v8

    if-eqz v8, :cond_0

    invoke-interface {v5}, Ll/֡ܳۘ;->ܳ()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_1

    .line 456
    :cond_0
    invoke-static {v6, v7}, Ll/ۧ᩷ܽ;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    if-ge v1, v0, :cond_6

    add-int/lit8 v5, v0, -0x1

    .line 462
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֡ܳۘ;

    .line 463
    new-instance v6, Ll/ܿ᩻ۘ;

    invoke-interface {v5}, Ll/ᩴܳۘ;->ᩳ()I

    move-result v7

    invoke-interface {v5}, Ll/ᩴܳۘ;->֫()I

    move-result v8

    invoke-direct {v6, v7, v8, v3}, Ll/ܿ᩻ۘ;-><init>(IILjava/lang/CharSequence;)V

    .line 464
    new-instance v7, Ll/ܿ᩻ۘ;

    invoke-interface {v5}, Ll/ᩴܳۘ;->ܿ()I

    move-result v8

    invoke-interface {v5}, Ll/ᩴܳۘ;->᩻()I

    move-result v9

    invoke-direct {v7, v8, v9, v4}, Ll/ܿ᩻ۘ;-><init>(IILjava/lang/CharSequence;)V

    .line 466
    invoke-interface {v5}, Ll/֡ܳۘ;->ܳ()Ljava/util/List;

    move-result-object v8

    if-eqz v8, :cond_3

    invoke-interface {v5}, Ll/֡ܳۘ;->ܳ()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_4

    .line 467
    :cond_3
    invoke-static {v6, v7}, Ll/ۧ᩷ܽ;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_5
    const/4 v1, 0x0

    :cond_6
    :goto_2
    if-ne v1, v0, :cond_7

    .line 474
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto/16 :goto_7

    .line 476
    :cond_7
    invoke-interface {p1, v1, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    .line 484
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_8

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֡ܳۘ;

    goto/16 :goto_6

    .line 486
    :cond_8
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡ܳۘ;

    .line 0
    invoke-static {v1, p1}, Ll/۟֫ᩴ;->֫(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v3

    .line 487
    check-cast v3, Ll/֡ܳۘ;

    .line 489
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 490
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֡ܳۘ;

    .line 529
    invoke-interface {v4}, Ll/֡ܳۘ;->ܳ()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_a

    invoke-interface {v4}, Ll/֡ܳۘ;->ܳ()Ljava/util/List;

    move-result-object v5

    goto :goto_3

    .line 531
    :cond_a
    invoke-interface {v4}, Ll/ᩴܳۘ;->֫()I

    move-result v5

    invoke-interface {v4}, Ll/ᩴܳۘ;->ᩳ()I

    move-result v6

    sub-int/2addr v5, v6

    .line 532
    invoke-interface {v4}, Ll/ᩴܳۘ;->᩻()I

    move-result v6

    invoke-interface {v4}, Ll/ᩴܳۘ;->ܿ()I

    move-result v7

    sub-int/2addr v6, v7

    .line 533
    new-instance v7, Ll/᩵ܳۘ;

    invoke-direct {v7, v2, v5, v2, v6}, Ll/᩵ܳۘ;-><init>(IIII)V

    invoke-static {v7}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    .line 491
    :goto_3
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ᩴܳۘ;

    .line 492
    invoke-interface {v4}, Ll/ᩴܳۘ;->ᩳ()I

    move-result v7

    invoke-interface {v0}, Ll/ᩴܳۘ;->ᩳ()I

    move-result v8

    sub-int/2addr v7, v8

    .line 493
    invoke-interface {v4}, Ll/ᩴܳۘ;->ܿ()I

    move-result v8

    invoke-interface {v0}, Ll/ᩴܳۘ;->ܿ()I

    move-result v9

    sub-int/2addr v8, v9

    .line 43
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_b

    const/4 v9, 0x0

    goto :goto_5

    .line 0
    :cond_b
    invoke-static {v13, v1}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v9

    .line 495
    :goto_5
    check-cast v9, Ll/ᩴܳۘ;

    if-eqz v9, :cond_c

    .line 523
    invoke-interface {v9}, Ll/ᩴܳۘ;->֫()I

    move-result v10

    invoke-interface {v6}, Ll/ᩴܳۘ;->ᩳ()I

    move-result v11

    add-int/2addr v11, v7

    if-ne v10, v11, :cond_c

    .line 524
    invoke-interface {v9}, Ll/ᩴܳۘ;->᩻()I

    move-result v10

    invoke-interface {v6}, Ll/ᩴܳۘ;->ܿ()I

    move-result v11

    add-int/2addr v11, v8

    if-ne v10, v11, :cond_c

    .line 500
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v10

    sub-int/2addr v10, v1

    invoke-virtual {v13, v10}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 501
    new-instance v10, Ll/᩵ܳۘ;

    invoke-interface {v9}, Ll/ᩴܳۘ;->ᩳ()I

    move-result v11

    invoke-interface {v6}, Ll/ᩴܳۘ;->֫()I

    move-result v12

    add-int/2addr v12, v7

    .line 502
    invoke-interface {v9}, Ll/ᩴܳۘ;->ܿ()I

    move-result v7

    invoke-interface {v6}, Ll/ᩴܳۘ;->᩻()I

    move-result v6

    add-int/2addr v6, v8

    invoke-direct {v10, v11, v12, v7, v6}, Ll/᩵ܳۘ;-><init>(IIII)V

    .line 501
    invoke-virtual {v13, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 497
    :cond_c
    new-instance v9, Ll/᩵ܳۘ;

    invoke-interface {v6}, Ll/ᩴܳۘ;->ᩳ()I

    move-result v10

    add-int/2addr v10, v7

    invoke-interface {v6}, Ll/ᩴܳۘ;->֫()I

    move-result v11

    add-int/2addr v11, v7

    .line 498
    invoke-interface {v6}, Ll/ᩴܳۘ;->ܿ()I

    move-result v7

    add-int/2addr v7, v8

    invoke-interface {v6}, Ll/ᩴܳۘ;->᩻()I

    move-result v6

    add-int/2addr v6, v8

    invoke-direct {v9, v10, v11, v7, v6}, Ll/᩵ܳۘ;-><init>(IIII)V

    .line 497
    invoke-virtual {v13, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_4

    .line 507
    :cond_d
    new-instance p1, Ll/ۚܳۘ;

    invoke-interface {v0}, Ll/֡ܳۘ;->ۧ()I

    move-result v5

    invoke-interface {v3}, Ll/֡ܳۘ;->ۜ()I

    move-result v6

    .line 508
    invoke-interface {v0}, Ll/֡ܳۘ;->ܽ()I

    move-result v7

    invoke-interface {v3}, Ll/֡ܳۘ;->᩷()I

    move-result v8

    .line 509
    invoke-interface {v0}, Ll/ᩴܳۘ;->ᩳ()I

    move-result v9

    invoke-interface {v3}, Ll/ᩴܳۘ;->֫()I

    move-result v10

    .line 510
    invoke-interface {v0}, Ll/ᩴܳۘ;->ܿ()I

    move-result v11

    invoke-interface {v3}, Ll/ᩴܳۘ;->᩻()I

    move-result v12

    move-object v4, p1

    invoke-direct/range {v4 .. v13}, Ll/ۚܳۘ;-><init>(IIIIIIIILjava/util/List;)V

    .line 476
    :goto_6
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 206
    :goto_7
    iget-object v0, p0, Ll/᩵ܿۘ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
