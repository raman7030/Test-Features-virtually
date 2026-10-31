.class public final Ll/֫ܿۘ;
.super Ljava/lang/Object;
.source "M1ME"


# instance fields
.field public ֫:I

.field public final ۖ:Ljava/lang/CharSequence;

.field public final ۘ:Ljava/util/List;

.field public final ۜ:I

.field public final ۡ:I

.field public final ۢ:I

.field public ۧ:I

.field public final ܳ:Ll/ۜܳۘ;

.field public final ܺ:Ljava/lang/CharSequence;

.field public ܽ:I

.field public final ܿ:Ll/ᩳܳۘ;

.field public ᩳ:I

.field public final ᩴ:Ljava/util/List;

.field public final ᩷:I

.field public final ᩻:Ll/ۙܳۘ;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/util/List;Ljava/util/List;IILl/ۜܳۘ;Ll/ۙܳۘ;)V
    .locals 0

    .line 357
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 358
    iput-object p1, p0, Ll/֫ܿۘ;->ܺ:Ljava/lang/CharSequence;

    .line 359
    iput-object p2, p0, Ll/֫ܿۘ;->ۖ:Ljava/lang/CharSequence;

    .line 360
    iput-object p3, p0, Ll/֫ܿۘ;->ۘ:Ljava/util/List;

    .line 361
    iput-object p4, p0, Ll/֫ܿۘ;->ᩴ:Ljava/util/List;

    .line 362
    iput p5, p0, Ll/֫ܿۘ;->ۢ:I

    .line 363
    iput p6, p0, Ll/֫ܿۘ;->ۡ:I

    .line 365
    iput-object p7, p0, Ll/֫ܿۘ;->ܳ:Ll/ۜܳۘ;

    .line 366
    iput-object p8, p0, Ll/֫ܿۘ;->᩻:Ll/ۙܳۘ;

    .line 368
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    iput p1, p0, Ll/֫ܿۘ;->ۜ:I

    .line 369
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    iput p2, p0, Ll/֫ܿۘ;->᩷:I

    .line 371
    new-instance p3, Ll/ᩳܳۘ;

    .line 338
    invoke-direct {p3, p1, p2}, Ll/ܿܳۘ;-><init>(II)V

    .line 371
    iput-object p3, p0, Ll/֫ܿۘ;->ܿ:Ll/ᩳܳۘ;

    return-void
.end method

.method private ֫(II)V
    .locals 10

    .line 415
    iget v0, p0, Ll/֫ܿۘ;->ۢ:I

    iget-object v1, p0, Ll/֫ܿۘ;->ۘ:Ljava/util/List;

    const/4 v2, 0x0

    if-nez p1, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    add-int/lit8 v3, p1, -0x1

    .line 526
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳܿۘ;

    invoke-interface {v3}, Ll/ᩳܿۘ;->֫()I

    move-result v3

    sub-int/2addr v3, v0

    .line 416
    :goto_0
    iget v4, p0, Ll/֫ܿۘ;->ۡ:I

    iget-object v5, p0, Ll/֫ܿۘ;->ᩴ:Ljava/util/List;

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, p2, -0x1

    .line 530
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳܿۘ;

    invoke-interface {v2}, Ll/ᩳܿۘ;->֫()I

    move-result v2

    sub-int/2addr v2, v4

    .line 417
    :goto_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v6

    if-ne p1, v6, :cond_2

    iget p1, p0, Ll/֫ܿۘ;->ۜ:I

    goto :goto_2

    .line 518
    :cond_2
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩳܿۘ;

    invoke-interface {p1}, Ll/ᩳܿۘ;->ۧ()I

    move-result p1

    sub-int/2addr p1, v0

    .line 418
    :goto_2
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ne p2, v0, :cond_3

    iget p2, p0, Ll/֫ܿۘ;->᩷:I

    goto :goto_3

    .line 522
    :cond_3
    invoke-interface {v5, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ᩳܿۘ;

    invoke-interface {p2}, Ll/ᩳܿۘ;->ۧ()I

    move-result p2

    sub-int/2addr p2, v4

    .line 445
    :goto_3
    iget v0, p0, Ll/֫ܿۘ;->ܽ:I

    if-ne v0, v3, :cond_4

    iget v1, p0, Ll/֫ܿۘ;->ᩳ:I

    if-ne v1, v2, :cond_4

    .line 448
    invoke-direct {p0, v3, v2, p1, p2}, Ll/֫ܿۘ;->֫(IIII)V

    goto/16 :goto_8

    :cond_4
    if-ge v0, v3, :cond_5

    .line 451
    iget v1, p0, Ll/֫ܿۘ;->ᩳ:I

    if-ge v1, v2, :cond_5

    .line 454
    iget v4, p0, Ll/֫ܿۘ;->֫:I

    iget v5, p0, Ll/֫ܿۘ;->ۧ:I

    invoke-direct {p0, v0, v1, v4, v5}, Ll/֫ܿۘ;->֫(IIII)V

    .line 455
    invoke-direct {p0, v3, v2, p1, p2}, Ll/֫ܿۘ;->֫(IIII)V

    goto/16 :goto_8

    .line 460
    :cond_5
    iget v1, p0, Ll/֫ܿۘ;->ᩳ:I

    iget v4, p0, Ll/֫ܿۘ;->֫:I

    iget v5, p0, Ll/֫ܿۘ;->ۧ:I

    .line 477
    iget-object v6, p0, Ll/֫ܿۘ;->᩻:Ll/ۙܳۘ;

    iget-object v7, p0, Ll/֫ܿۘ;->ۖ:Ljava/lang/CharSequence;

    iget-object v8, p0, Ll/֫ܿۘ;->ܺ:Ljava/lang/CharSequence;

    iget-object v9, p0, Ll/֫ܿۘ;->ܿ:Ll/ᩳܳۘ;

    if-ne v0, v3, :cond_7

    if-ne v4, p1, :cond_7

    .line 487
    invoke-interface {v8, v0, v4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    .line 488
    invoke-interface {v7, v1, v5}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v3

    .line 489
    invoke-interface {v7, v2, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p2

    .line 491
    invoke-static {p1, v3, p2, v6}, Ll/᩷ܿۘ;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ll/ۙܳۘ;)Ll/ۗܳۘ;

    move-result-object p1

    .line 493
    iget-object p2, p1, Ll/۬ܳۘ;->֫:Ljava/lang/Object;

    check-cast p2, Ll/ۜܳۘ;

    invoke-interface {p2}, Ll/֫ܳۘ;->ۧ()Ljava/lang/Iterable;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩹ܳۘ;

    .line 494
    iget v4, v3, Ll/᩹ܳۘ;->ܽ:I

    add-int/2addr v4, v0

    iget v5, v3, Ll/᩹ܳۘ;->ᩳ:I

    add-int/2addr v5, v1

    iget v6, v3, Ll/᩹ܳۘ;->֫:I

    add-int/2addr v6, v0

    iget v3, v3, Ll/᩹ܳۘ;->ۧ:I

    add-int/2addr v3, v1

    invoke-virtual {v9, v4, v5, v6, v3}, Ll/ܿܳۘ;->ۧ(IIII)V

    goto :goto_4

    .line 496
    :cond_6
    iget-object p1, p1, Ll/۬ܳۘ;->ۧ:Ljava/lang/Object;

    check-cast p1, Ll/ۜܳۘ;

    invoke-interface {p1}, Ll/֫ܳۘ;->ۧ()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩹ܳۘ;

    .line 497
    iget v1, p2, Ll/᩹ܳۘ;->ܽ:I

    add-int/2addr v1, v0

    iget v3, p2, Ll/᩹ܳۘ;->ᩳ:I

    add-int/2addr v3, v2

    iget v4, p2, Ll/᩹ܳۘ;->֫:I

    add-int/2addr v4, v0

    iget p2, p2, Ll/᩹ܳۘ;->ۧ:I

    add-int/2addr p2, v2

    invoke-virtual {v9, v1, v3, v4, p2}, Ll/ܿܳۘ;->ۧ(IIII)V

    goto :goto_5

    :cond_7
    if-ne v1, v2, :cond_a

    if-ne v5, p2, :cond_a

    .line 502
    invoke-interface {v8, v0, v4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p2

    .line 503
    invoke-interface {v8, v3, p1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    .line 504
    invoke-interface {v7, v1, v5}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v2

    .line 506
    invoke-static {v2, p2, p1, v6}, Ll/᩷ܿۘ;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ll/ۙܳۘ;)Ll/ۗܳۘ;

    move-result-object p1

    .line 509
    iget-object p2, p1, Ll/۬ܳۘ;->֫:Ljava/lang/Object;

    check-cast p2, Ll/ۜܳۘ;

    invoke-interface {p2}, Ll/֫ܳۘ;->ۧ()Ljava/lang/Iterable;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹ܳۘ;

    .line 510
    iget v4, v2, Ll/᩹ܳۘ;->ᩳ:I

    add-int/2addr v4, v0

    iget v5, v2, Ll/᩹ܳۘ;->ܽ:I

    add-int/2addr v5, v1

    iget v6, v2, Ll/᩹ܳۘ;->ۧ:I

    add-int/2addr v6, v0

    iget v2, v2, Ll/᩹ܳۘ;->֫:I

    add-int/2addr v2, v1

    invoke-virtual {v9, v4, v5, v6, v2}, Ll/ܿܳۘ;->ۧ(IIII)V

    goto :goto_6

    .line 512
    :cond_8
    iget-object p1, p1, Ll/۬ܳۘ;->ۧ:Ljava/lang/Object;

    check-cast p1, Ll/ۜܳۘ;

    invoke-interface {p1}, Ll/֫ܳۘ;->ۧ()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩹ܳۘ;

    .line 513
    iget v0, p2, Ll/᩹ܳۘ;->ᩳ:I

    add-int/2addr v0, v3

    iget v2, p2, Ll/᩹ܳۘ;->ܽ:I

    add-int/2addr v2, v1

    iget v4, p2, Ll/᩹ܳۘ;->ۧ:I

    add-int/2addr v4, v3

    iget p2, p2, Ll/᩹ܳۘ;->֫:I

    add-int/2addr p2, v1

    invoke-virtual {v9, v0, v2, v4, p2}, Ll/ܿܳۘ;->ۧ(IIII)V

    goto :goto_7

    :cond_9
    :goto_8
    const/4 p1, -0x1

    .line 408
    iput p1, p0, Ll/֫ܿۘ;->ܽ:I

    .line 409
    iput p1, p0, Ll/֫ܿۘ;->ᩳ:I

    .line 410
    iput p1, p0, Ll/֫ܿۘ;->֫:I

    .line 411
    iput p1, p0, Ll/֫ܿۘ;->ۧ:I

    return-void

    .line 482
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method private ֫(IIII)V
    .locals 4

    if-ne p1, p3, :cond_0

    if-ne p2, p4, :cond_0

    goto :goto_1

    .line 466
    :cond_0
    iget-object v0, p0, Ll/֫ܿۘ;->ܺ:Ljava/lang/CharSequence;

    invoke-interface {v0, p1, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p3

    .line 467
    iget-object v0, p0, Ll/֫ܿۘ;->ۖ:Ljava/lang/CharSequence;

    invoke-interface {v0, p2, p4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p4

    .line 469
    iget-object v0, p0, Ll/֫ܿۘ;->᩻:Ll/ۙܳۘ;

    invoke-static {p3, p4, v0}, Ll/۫ᩳۘ;->ܽ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ll/ۙܳۘ;)Ll/ۜܳۘ;

    move-result-object p3

    .line 471
    invoke-interface {p3}, Ll/֫ܳۘ;->ۧ()Ljava/lang/Iterable;

    move-result-object p3

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ll/᩹ܳۘ;

    .line 472
    iget v0, p4, Ll/᩹ܳۘ;->ܽ:I

    add-int/2addr v0, p1

    iget v1, p4, Ll/᩹ܳۘ;->ᩳ:I

    add-int/2addr v1, p2

    iget v2, p4, Ll/᩹ܳۘ;->֫:I

    add-int/2addr v2, p1

    iget p4, p4, Ll/᩹ܳۘ;->ۧ:I

    add-int/2addr p4, p2

    iget-object v3, p0, Ll/֫ܿۘ;->ܿ:Ll/ᩳܳۘ;

    invoke-virtual {v3, v0, v1, v2, p4}, Ll/ܿܳۘ;->ۧ(IIII)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method private ۧ(II)V
    .locals 7

    .line 425
    iget v0, p0, Ll/֫ܿۘ;->ۢ:I

    iget-object v1, p0, Ll/֫ܿۘ;->ۘ:Ljava/util/List;

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-ne p1, v3, :cond_0

    const/4 v4, 0x0

    goto :goto_0

    .line 526
    :cond_0
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ᩳܿۘ;

    invoke-interface {v4}, Ll/ᩳܿۘ;->֫()I

    move-result v4

    sub-int/2addr v4, v0

    .line 426
    :goto_0
    iget v5, p0, Ll/֫ܿۘ;->ۡ:I

    iget-object v6, p0, Ll/֫ܿۘ;->ᩴ:Ljava/util/List;

    if-ne p2, v3, :cond_1

    goto :goto_1

    .line 530
    :cond_1
    invoke-interface {v6, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳܿۘ;

    invoke-interface {v2}, Ll/ᩳܿۘ;->֫()I

    move-result v2

    sub-int/2addr v2, v5

    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 427
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-ne p1, v3, :cond_2

    iget p1, p0, Ll/֫ܿۘ;->ۜ:I

    goto :goto_2

    .line 518
    :cond_2
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩳܿۘ;

    invoke-interface {p1}, Ll/ᩳܿۘ;->ۧ()I

    move-result p1

    sub-int/2addr p1, v0

    :goto_2
    add-int/lit8 p2, p2, 0x1

    .line 428
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ne p2, v0, :cond_3

    iget p2, p0, Ll/֫ܿۘ;->᩷:I

    goto :goto_3

    .line 522
    :cond_3
    invoke-interface {v6, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ᩳܿۘ;

    invoke-interface {p2}, Ll/ᩳܿۘ;->ۧ()I

    move-result p2

    sub-int/2addr p2, v5

    .line 436
    :goto_3
    iput v4, p0, Ll/֫ܿۘ;->ܽ:I

    .line 437
    iput v2, p0, Ll/֫ܿۘ;->ᩳ:I

    .line 438
    iput p1, p0, Ll/֫ܿۘ;->֫:I

    .line 439
    iput p2, p0, Ll/֫ܿۘ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۜܳۘ;
    .locals 15

    const/4 v0, -0x1

    .line 408
    iput v0, p0, Ll/֫ܿۘ;->ܽ:I

    .line 409
    iput v0, p0, Ll/֫ܿۘ;->ᩳ:I

    .line 410
    iput v0, p0, Ll/֫ܿۘ;->֫:I

    .line 411
    iput v0, p0, Ll/֫ܿۘ;->ۧ:I

    .line 383
    invoke-direct {p0, v0, v0}, Ll/֫ܿۘ;->ۧ(II)V

    .line 385
    iget-object v0, p0, Ll/֫ܿۘ;->ܳ:Ll/ۜܳۘ;

    invoke-interface {v0}, Ll/֫ܳۘ;->ۧ()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    iget-object v2, p0, Ll/֫ܿۘ;->ᩴ:Ljava/util/List;

    iget-object v3, p0, Ll/֫ܿۘ;->ۘ:Ljava/util/List;

    iget-object v4, p0, Ll/֫ܿۘ;->ܿ:Ll/ᩳܳۘ;

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩹ܳۘ;

    .line 386
    iget v5, v1, Ll/᩹ܳۘ;->֫:I

    iget v6, v1, Ll/᩹ܳۘ;->ܽ:I

    sub-int/2addr v5, v6

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v5, :cond_0

    add-int v8, v6, v7

    .line 389
    iget v9, v1, Ll/᩹ܳۘ;->ᩳ:I

    add-int/2addr v9, v7

    .line 518
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ᩳܿۘ;

    invoke-interface {v10}, Ll/ᩳܿۘ;->ۧ()I

    move-result v10

    iget v11, p0, Ll/֫ܿۘ;->ۢ:I

    sub-int/2addr v10, v11

    .line 522
    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ᩳܿۘ;

    invoke-interface {v12}, Ll/ᩳܿۘ;->ۧ()I

    move-result v12

    iget v13, p0, Ll/֫ܿۘ;->ۡ:I

    sub-int/2addr v12, v13

    .line 526
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/ᩳܿۘ;

    invoke-interface {v14}, Ll/ᩳܿۘ;->֫()I

    move-result v14

    sub-int/2addr v14, v11

    .line 530
    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ᩳܿۘ;

    invoke-interface {v11}, Ll/ᩳܿۘ;->֫()I

    move-result v11

    sub-int/2addr v11, v13

    .line 396
    invoke-direct {p0, v8, v9}, Ll/֫ܿۘ;->֫(II)V

    .line 398
    invoke-virtual {v4, v10, v12, v14, v11}, Ll/ܿܳۘ;->ۧ(IIII)V

    .line 400
    invoke-direct {p0, v8, v9}, Ll/֫ܿۘ;->ۧ(II)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 404
    :cond_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {p0, v0, v1}, Ll/֫ܿۘ;->֫(II)V

    .line 377
    invoke-virtual {v4}, Ll/ᩳܳۘ;->ܳ()Ll/֫ܳۘ;

    move-result-object v0

    invoke-static {v0}, Ll/᩻ܳۘ;->֫(Ll/֫ܳۘ;)Ll/ۜܳۘ;

    move-result-object v0

    return-object v0
.end method
