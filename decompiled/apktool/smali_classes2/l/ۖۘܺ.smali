.class public final Ll/ۖۘܺ;
.super Ljava/lang/Object;
.source "4BHP"

# interfaces
.implements Ll/ܿۘܺ;


# instance fields
.field public final ֫:Ll/ܽۘܺ;

.field public final ۧ:[Ll/᩸ۡܺ;

.field public final synthetic ܳ:Ll/ۘۘܺ;

.field public final ܽ:Ljava/util/HashMap;

.field public final ܿ:Ljava/util/HashSet;

.field public final ᩳ:Ll/ܺۘܺ;


# direct methods
.method public constructor <init>(Ll/ۘۘܺ;Ll/ܽۘܺ;)V
    .locals 2

    .line 326
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖۘܺ;->ܳ:Ll/ۘۘܺ;

    .line 327
    iput-object p2, p0, Ll/ۖۘܺ;->֫:Ll/ܽۘܺ;

    .line 328
    invoke-static {p1}, Ll/ۘۘܺ;->ܽ(Ll/ۘۘܺ;)[[Ll/᩸ۡܺ;

    move-result-object v0

    invoke-virtual {p2}, Ll/ܽۘܺ;->ۧ()I

    move-result v1

    aget-object v0, v0, v1

    iput-object v0, p0, Ll/ۖۘܺ;->ۧ:[Ll/᩸ۡܺ;

    .line 329
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ۖۘܺ;->ܿ:Ljava/util/HashSet;

    .line 330
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۖۘܺ;->ܽ:Ljava/util/HashMap;

    .line 331
    new-instance v0, Ll/ܺۘܺ;

    invoke-direct {v0, p0}, Ll/ܺۘܺ;-><init>(Ll/ۖۘܺ;)V

    iput-object v0, p0, Ll/ۖۘܺ;->ᩳ:Ll/ܺۘܺ;

    .line 334
    invoke-static {p1}, Ll/ۘۘܺ;->ܽ(Ll/ۘۘܺ;)[[Ll/᩸ۡܺ;

    move-result-object p1

    invoke-virtual {p2}, Ll/ܽۘܺ;->ۧ()I

    move-result p2

    const/4 v0, 0x0

    aput-object v0, p1, p2

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۖۘܺ;)Ll/ܽۘܺ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۖۘܺ;->֫:Ll/ܽۘܺ;

    return-object p0
.end method

.method private ֫(ILl/᩸ۡܺ;)V
    .locals 4

    .line 455
    invoke-virtual {p2}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    .line 456
    invoke-virtual {p2}, Ll/᩸ۡܺ;->᩻()Ll/ᩴۡܺ;

    move-result-object v1

    .line 458
    iget-object v2, p0, Ll/ۖۘܺ;->ۧ:[Ll/᩸ۡܺ;

    aput-object p2, v2, p1

    .line 463
    array-length p1, v2

    :cond_0
    :goto_0
    add-int/lit8 p1, p1, -0x1

    if-ltz p1, :cond_1

    .line 464
    aget-object v3, v2, p1

    .line 466
    invoke-virtual {v3}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v3

    if-ne v0, v3, :cond_0

    .line 467
    aput-object p2, v2, p1

    goto :goto_0

    :cond_1
    if-nez v1, :cond_2

    goto :goto_2

    .line 477
    :cond_2
    iget-object p1, p0, Ll/ۖۘܺ;->ܳ:Ll/ۘۘܺ;

    invoke-static {p1, p2}, Ll/ۘۘܺ;->֫(Ll/ۘۘܺ;Ll/᩸ۡܺ;)V

    .line 480
    array-length p1, v2

    :cond_3
    :goto_1
    add-int/lit8 p1, p1, -0x1

    if-ltz p1, :cond_4

    .line 481
    aget-object p2, v2, p1

    .line 483
    invoke-virtual {p2}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v3

    if-eq v0, v3, :cond_3

    .line 484
    invoke-virtual {p2}, Ll/᩸ۡܺ;->᩻()Ll/ᩴۡܺ;

    move-result-object v3

    invoke-virtual {v1, v3}, Ll/ᩴۡܺ;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/4 v3, 0x0

    .line 485
    invoke-virtual {p2, v3}, Ll/᩸ۡܺ;->֫(Ll/ᩴۡܺ;)Ll/᩸ۡܺ;

    move-result-object p2

    aput-object p2, v2, p1

    goto :goto_1

    :cond_4
    :goto_2
    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۖۘܺ;)[Ll/᩸ۡܺ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۖۘܺ;->ۧ:[Ll/᩸ۡܺ;

    return-object p0
.end method


# virtual methods
.method public final ֫()V
    .locals 8

    .line 394
    iget-object v0, p0, Ll/ۖۘܺ;->֫:Ll/ܽۘܺ;

    invoke-virtual {v0, p0}, Ll/ܽۘܺ;->֫(Ll/ܿۘܺ;)V

    .line 652
    new-instance v1, Ll/ۡۘܺ;

    invoke-direct {v1, p0}, Ll/ۡۘܺ;-><init>(Ll/ۖۘܺ;)V

    .line 678
    invoke-virtual {v0}, Ll/ܽۘܺ;->ۘ()Ljava/util/BitSet;

    move-result-object v2

    const/4 v3, 0x0

    .line 679
    invoke-virtual {v2, v3}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v4

    :goto_0
    iget-object v5, p0, Ll/ۖۘܺ;->ܳ:Ll/ۘۘܺ;

    if-ltz v4, :cond_0

    .line 681
    invoke-static {v5}, Ll/ۘۘܺ;->ۧ(Ll/ۘۘܺ;)Ll/᩷ۘܺ;

    move-result-object v5

    invoke-virtual {v5}, Ll/᩷ۘܺ;->ۧ()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܽۘܺ;

    .line 682
    invoke-virtual {v5, v1}, Ll/ܽۘܺ;->֫(Ll/᩺ۖܺ;)V

    add-int/lit8 v4, v4, 0x1

    .line 680
    invoke-virtual {v2, v4}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v4

    goto :goto_0

    .line 399
    :cond_0
    invoke-virtual {v0}, Ll/ܽۘܺ;->ܽ()Ljava/util/ArrayList;

    move-result-object v1

    .line 400
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v4, 0x1

    sub-int/2addr v2, v4

    :goto_1
    if-ltz v2, :cond_3

    .line 403
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܳۘܺ;

    .line 406
    iget-object v7, p0, Ll/ۖۘܺ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v7, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܳۘܺ;

    if-eqz v7, :cond_1

    .line 409
    invoke-virtual {v1, v2, v7}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 410
    :cond_1
    invoke-virtual {v6}, Ll/ܳۘܺ;->ۚ()Z

    move-result v7

    if-eqz v7, :cond_2

    iget-object v7, p0, Ll/ۖۘܺ;->ܿ:Ljava/util/HashSet;

    .line 411
    invoke-virtual {v7, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    .line 412
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_2
    :goto_2
    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    .line 418
    :cond_3
    invoke-virtual {v0}, Ll/ܽۘܺ;->֫()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽۘܺ;

    if-eq v2, v0, :cond_4

    .line 421
    iget-object v6, p0, Ll/ۖۘܺ;->ۧ:[Ll/᩸ۡܺ;

    if-eqz v4, :cond_5

    goto :goto_4

    .line 214
    :cond_5
    array-length v4, v6

    new-array v4, v4, [Ll/᩸ۡܺ;

    .line 216
    array-length v7, v6

    invoke-static {v6, v3, v4, v3, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v6, v4

    .line 424
    :goto_4
    invoke-static {v5}, Ll/ۘۘܺ;->ܽ(Ll/ۘۘܺ;)[[Ll/᩸ۡܺ;

    move-result-object v4

    invoke-virtual {v2}, Ll/ܽۘܺ;->ۧ()I

    move-result v2

    aput-object v6, v4, v2

    const/4 v4, 0x0

    goto :goto_3

    :cond_6
    return-void
.end method

.method public final ֫(Ll/۫ۖܺ;)V
    .locals 8

    .line 517
    invoke-virtual {p1}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v0

    .line 518
    invoke-virtual {v0}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v1

    .line 519
    invoke-virtual {p1}, Ll/۫ۖܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v2

    .line 521
    iget-object v4, p0, Ll/ۖۘܺ;->ᩳ:Ll/ܺۘܺ;

    invoke-virtual {p1, v4}, Ll/۫ۖܺ;->ۧ(Ll/ۗۘۢ;)V

    .line 522
    invoke-virtual {p1}, Ll/۫ۖܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object v4

    invoke-virtual {v4, v3}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v4

    .line 524
    iget-object v5, p0, Ll/ۖۘܺ;->ۧ:[Ll/᩸ۡܺ;

    aget-object v2, v5, v2

    .line 525
    invoke-virtual {v2}, Ll/᩸ۡܺ;->᩻()Ll/ᩴۡܺ;

    move-result-object v2

    .line 526
    invoke-virtual {v0}, Ll/᩸ۡܺ;->᩻()Ll/ᩴۡܺ;

    move-result-object v5

    if-nez v5, :cond_0

    move-object v5, v2

    .line 537
    :cond_0
    iget-object v6, p0, Ll/ۖۘܺ;->ܳ:Ll/ۘۘܺ;

    invoke-static {v6, v4}, Ll/ۘۘܺ;->ۧ(Ll/ۘۘܺ;I)Ll/ᩴۡܺ;

    move-result-object v7

    if-eqz v7, :cond_1

    if-eqz v5, :cond_1

    .line 545
    invoke-virtual {v5, v7}, Ll/ᩴۡܺ;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    :cond_1
    const/4 v3, 0x1

    .line 559
    :cond_2
    invoke-virtual {v0}, Ll/᩸ۡܺ;->getType()Ll/۟ܺܺ;

    move-result-object v0

    .line 558
    invoke-static {v4, v0, v5}, Ll/᩸ۡܺ;->ܽ(ILl/֫ۖܺ;Ll/ᩴۡܺ;)Ll/᩸ۡܺ;

    move-result-object v0

    .line 561
    invoke-static {}, Ll/ۛۖܺ;->ۧ()Z

    move-result v4

    if-eqz v4, :cond_6

    if-eqz v3, :cond_4

    if-eq v5, v2, :cond_3

    if-eqz v5, :cond_4

    .line 284
    invoke-virtual {v5, v2}, Ll/ᩴۡܺ;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 562
    :cond_3
    invoke-static {v6}, Ll/ۘۘܺ;->ᩳ(Ll/ۘۘܺ;)I

    move-result v4

    if-nez v4, :cond_4

    goto :goto_0

    :cond_4
    if-eqz v3, :cond_5

    if-nez v2, :cond_5

    .line 571
    invoke-static {v6}, Ll/ۘۘܺ;->ᩳ(Ll/ۘۘܺ;)I

    move-result v2

    if-nez v2, :cond_5

    .line 579
    invoke-virtual {v0}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v2

    .line 580
    invoke-virtual {v0}, Ll/᩸ۡܺ;->getType()Ll/۟ܺܺ;

    move-result-object v3

    .line 579
    invoke-static {v2, v3, v5}, Ll/᩸ۡܺ;->֫(ILl/۟ܺܺ;Ll/ᩴۡܺ;)Ll/᩸ۡܺ;

    move-result-object v2

    .line 578
    invoke-static {v2}, Ll/᩶ۡܺ;->ۧ(Ll/᩸ۡܺ;)Ll/᩶ۡܺ;

    move-result-object v2

    .line 582
    new-instance v3, Ll/֨ۡܺ;

    .line 584
    invoke-static {v0}, Ll/۫ۡܺ;->֫(Ll/᩸ۡܺ;)Ll/ۗۡܺ;

    move-result-object v4

    sget-object v5, Ll/ۤۡܺ;->ᩳ:Ll/ۤۡܺ;

    const/4 v6, 0x0

    invoke-direct {v3, v4, v5, v6, v2}, Ll/֨ۡܺ;-><init>(Ll/ۗۡܺ;Ll/ۤۡܺ;Ll/᩸ۡܺ;Ll/᩶ۡܺ;)V

    .line 64
    new-instance v2, Ll/۫ۖܺ;

    iget-object v4, p0, Ll/ۖۘܺ;->֫:Ll/ܽۘܺ;

    invoke-direct {v2, v3, v4}, Ll/۫ۖܺ;-><init>(Ll/ܺۡܺ;Ll/ܽۘܺ;)V

    .line 587
    iget-object v3, p0, Ll/ۖۘܺ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v3, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 590
    invoke-direct {p0, v1, v0}, Ll/ۖۘܺ;->֫(ILl/᩸ۡܺ;)V

    return-void

    .line 596
    :cond_5
    invoke-virtual {p0, p1}, Ll/ۖۘܺ;->֫(Ll/ܳۘܺ;)V

    .line 598
    iget-object v0, p0, Ll/ۖۘܺ;->ܿ:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void

    .line 570
    :cond_6
    :goto_0
    invoke-direct {p0, v1, v0}, Ll/ۖۘܺ;->֫(ILl/᩸ۡܺ;)V

    return-void
.end method

.method public final ֫(Ll/ܰۖܺ;)V
    .locals 0

    .line 498
    invoke-virtual {p0, p1}, Ll/ۖۘܺ;->֫(Ll/ܳۘܺ;)V

    return-void
.end method

.method public final ֫(Ll/ܳۘܺ;)V
    .locals 3

    .line 626
    invoke-virtual {p1}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 632
    :cond_0
    invoke-virtual {v0}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    .line 633
    iget-object v1, p0, Ll/ۖۘܺ;->ܳ:Ll/ۘۘܺ;

    invoke-static {v1, v0}, Ll/ۘۘܺ;->ܽ(Ll/ۘۘܺ;I)Z

    move-result v2

    if-eqz v2, :cond_1

    :goto_0
    return-void

    .line 637
    :cond_1
    invoke-static {v1}, Ll/ۘۘܺ;->֫(Ll/ۘۘܺ;)I

    move-result v2

    invoke-virtual {p1, v2}, Ll/ܳۘܺ;->֫(I)V

    .line 638
    invoke-virtual {p1}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Ll/ۖۘܺ;->֫(ILl/᩸ۡܺ;)V

    .line 644
    invoke-static {v1}, Ll/ۘۘܺ;->֫(Ll/ۘۘܺ;)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    invoke-static {v1, p1}, Ll/ۘۘܺ;->֫(Ll/ۘۘܺ;I)V

    return-void
.end method

.method public final ۧ(Ll/۫ۖܺ;)V
    .locals 1

    .line 613
    iget-object v0, p0, Ll/ۖۘܺ;->ᩳ:Ll/ܺۘܺ;

    invoke-virtual {p1, v0}, Ll/۫ۖܺ;->ۧ(Ll/ۗۘۢ;)V

    .line 615
    invoke-virtual {p0, p1}, Ll/ۖۘܺ;->֫(Ll/ܳۘܺ;)V

    return-void
.end method
