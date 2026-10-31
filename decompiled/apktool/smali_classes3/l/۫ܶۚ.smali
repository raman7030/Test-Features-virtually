.class public final Ll/۫ܶۚ;
.super Ljava/lang/Object;
.source "I6LL"


# instance fields
.field public final ֫:Ljava/util/HashMap;

.field public final ۧ:Ljava/util/HashMap;

.field public ܽ:Z

.field public final ܿ:Ljava/util/HashSet;

.field public final ᩳ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 191
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 192
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/۫ܶۚ;->ܿ:Ljava/util/HashSet;

    .line 193
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/۫ܶۚ;->֫:Ljava/util/HashMap;

    .line 194
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/۫ܶۚ;->ۧ:Ljava/util/HashMap;

    .line 195
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/۫ܶۚ;->ᩳ:Ljava/util/HashMap;

    const/4 v0, 0x0

    .line 196
    iput-boolean v0, p0, Ll/۫ܶۚ;->ܽ:Z

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ll/ܺ֡ۚ;
    .locals 3

    .line 579
    new-instance v0, Ll/ܺ֡ۚ;

    invoke-direct {v0}, Ll/ܺ֡ۚ;-><init>()V

    .line 598
    new-instance v1, Ll/ۗܶۚ;

    .line 594
    invoke-direct {v1, p1}, Ll/۬ܶۚ;-><init>(Ljava/lang/String;)V

    .line 581
    iget-object p1, p0, Ll/۫ܶۚ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {p1, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 582
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    .line 583
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 584
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹ܶۚ;

    invoke-virtual {v2}, Ll/۬ܶۚ;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩶ܶۚ;

    invoke-virtual {v1}, Ll/۬ܶۚ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ll/ܺ֡ۚ;->put(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final ֫()V
    .locals 1

    const/4 v0, 0x1

    .line 412
    iput-boolean v0, p0, Ll/۫ܶۚ;->ܽ:Z

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const-string v0, "input"

    .line 354
    invoke-static {v0}, Ll/ܿ֡ۚ;->֫(Ljava/lang/String;)V

    .line 355
    invoke-static {p1}, Ll/ܿ֡ۚ;->֫(Ljava/lang/String;)V

    .line 356
    invoke-static {p2}, Ll/ܿ֡ۚ;->֫(Ljava/lang/String;)V

    .line 598
    new-instance v1, Ll/ۗܶۚ;

    .line 594
    invoke-direct {v1, v0}, Ll/۬ܶۚ;-><init>(Ljava/lang/String;)V

    .line 359
    iget-object v0, p0, Ll/۫ܶۚ;->ܿ:Ljava/util/HashSet;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 608
    new-instance v0, Ll/᩹ܶۚ;

    .line 604
    invoke-direct {v0, p1}, Ll/۬ܶۚ;-><init>(Ljava/lang/String;)V

    .line 618
    new-instance p1, Ll/᩶ܶۚ;

    .line 614
    invoke-direct {p1, p2}, Ll/۬ܶۚ;-><init>(Ljava/lang/String;)V

    .line 363
    iget-object p2, p0, Ll/۫ܶۚ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {p2, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 364
    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map;

    invoke-interface {p2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 366
    :cond_0
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 367
    invoke-virtual {v2, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 368
    invoke-virtual {p2, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final varargs ֫(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 3

    .line 433
    invoke-static {p1}, Ll/ܿ֡ۚ;->֫(Ljava/lang/String;)V

    .line 434
    invoke-static {p2}, Ll/ܿ֡ۚ;->֫(Ljava/lang/String;)V

    .line 598
    new-instance v0, Ll/ۗܶۚ;

    .line 594
    invoke-direct {v0, p1}, Ll/۬ܶۚ;-><init>(Ljava/lang/String;)V

    .line 608
    new-instance p1, Ll/᩹ܶۚ;

    .line 604
    invoke-direct {p1, p2}, Ll/۬ܶۚ;-><init>(Ljava/lang/String;)V

    .line 442
    iget-object p2, p0, Ll/۫ܶۚ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {p2, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 443
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map;

    goto :goto_0

    .line 445
    :cond_0
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 446
    invoke-virtual {p2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object p2, v1

    .line 448
    :goto_0
    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 449
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    goto :goto_1

    .line 451
    :cond_1
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 452
    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object p1, v0

    .line 454
    :goto_1
    array-length p2, p3

    const/4 v0, 0x0

    :goto_2
    if-ge v0, p2, :cond_2

    aget-object v1, p3, v0

    .line 455
    invoke-static {v1}, Ll/ܿ֡ۚ;->֫(Ljava/lang/String;)V

    .line 628
    new-instance v2, Ll/ۙܶۚ;

    .line 624
    invoke-direct {v2, v1}, Ll/۬ܶۚ;-><init>(Ljava/lang/String;)V

    .line 457
    invoke-interface {p1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final varargs ֫(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 5

    .line 276
    invoke-static {p1}, Ll/ܿ֡ۚ;->֫(Ljava/lang/String;)V

    .line 278
    array-length v0, p2

    const/4 v1, 0x0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_3

    .line 598
    new-instance v0, Ll/ۗܶۚ;

    .line 594
    invoke-direct {v0, p1}, Ll/۬ܶۚ;-><init>(Ljava/lang/String;)V

    .line 281
    iget-object p1, p0, Ll/۫ܶۚ;->ܿ:Ljava/util/HashSet;

    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 282
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 283
    array-length v2, p2

    :goto_1
    if-ge v1, v2, :cond_1

    aget-object v3, p2, v1

    .line 284
    invoke-static {v3}, Ll/ܿ֡ۚ;->֫(Ljava/lang/String;)V

    .line 608
    new-instance v4, Ll/᩹ܶۚ;

    .line 604
    invoke-direct {v4, v3}, Ll/۬ܶۚ;-><init>(Ljava/lang/String;)V

    .line 285
    invoke-virtual {p1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 287
    :cond_1
    iget-object p2, p0, Ll/۫ܶۚ;->֫:Ljava/util/HashMap;

    invoke-virtual {p2, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 288
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Set;

    .line 289
    invoke-interface {p2, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-void

    .line 291
    :cond_2
    invoke-virtual {p2, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 91
    :cond_3
    new-instance p1, Ll/ܳ֡ۚ;

    const-string p2, "No attribute names supplied."

    .line 14
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 91
    throw p1
.end method

.method public final varargs ֫([Ljava/lang/String;)V
    .locals 4

    .line 231
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    .line 232
    invoke-static {v2}, Ll/ܿ֡ۚ;->֫(Ljava/lang/String;)V

    .line 598
    new-instance v3, Ll/ۗܶۚ;

    .line 594
    invoke-direct {v3, v2}, Ll/۬ܶۚ;-><init>(Ljava/lang/String;)V

    .line 233
    iget-object v2, p0, Ll/۫ܶۚ;->ܿ:Ljava/util/HashSet;

    invoke-virtual {v2, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/String;Ll/᩶֡ۚ;Ll/ۢ֡ۚ;)Z
    .locals 3

    .line 598
    new-instance v0, Ll/ۗܶۚ;

    .line 594
    invoke-direct {v0, p1}, Ll/۬ܶۚ;-><init>(Ljava/lang/String;)V

    .line 520
    invoke-virtual {p3}, Ll/ۢ֡ۚ;->getKey()Ljava/lang/String;

    move-result-object v1

    .line 608
    new-instance v2, Ll/᩹ܶۚ;

    .line 604
    invoke-direct {v2, v1}, Ll/۬ܶۚ;-><init>(Ljava/lang/String;)V

    .line 522
    iget-object v1, p0, Ll/۫ܶۚ;->֫:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    if-eqz v1, :cond_4

    .line 523
    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 524
    iget-object p1, p0, Ll/۫ܶۚ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 525
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    .line 527
    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    .line 548
    invoke-virtual {p3}, Ll/ۢ֡ۚ;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ll/ۨ֡ۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 549
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    .line 550
    invoke-virtual {p3}, Ll/ۢ֡ۚ;->getValue()Ljava/lang/String;

    move-result-object p2

    .line 551
    :cond_0
    iget-boolean v0, p0, Ll/۫ܶۚ;->ܽ:Z

    if-nez v0, :cond_1

    .line 552
    invoke-virtual {p3, p2}, Ll/ۢ֡ۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    .line 554
    :cond_1
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ۙܶۚ;

    .line 555
    invoke-virtual {p3}, Ll/۬ܶۚ;->toString()Ljava/lang/String;

    move-result-object p3

    const-string v0, "#"

    .line 557
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 575
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_2

    const-string p3, ".*\\s.*"

    invoke-virtual {p2, p3}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result p3

    if-nez p3, :cond_2

    goto :goto_0

    :cond_3
    const-string v0, ":"

    .line 565
    invoke-virtual {p3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 567
    invoke-static {p2}, Ll/᩻֡ۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_2

    goto :goto_0

    .line 533
    :cond_4
    iget-object v1, p0, Ll/۫ܶۚ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_5

    .line 535
    invoke-virtual {p0, p1}, Ll/۫ܶۚ;->֫(Ljava/lang/String;)Ll/ܺ֡ۚ;

    move-result-object v0

    .line 536
    invoke-virtual {p3}, Ll/ۢ֡ۚ;->getKey()Ljava/lang/String;

    move-result-object v1

    .line 537
    invoke-virtual {v0, v1}, Ll/ܺ֡ۚ;->ᩳ(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 538
    invoke-virtual {v0, v1}, Ll/ܺ֡ۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3}, Ll/ۢ֡ۚ;->getValue()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_5
    const-string v0, ":all"

    .line 542
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    invoke-virtual {p0, v0, p2, p3}, Ll/۫ܶۚ;->֫(Ljava/lang/String;Ll/᩶֡ۚ;Ll/ۢ֡ۚ;)Z

    move-result p1

    if-eqz p1, :cond_7

    :cond_6
    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_7
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(Ljava/lang/String;)Z
    .locals 1

    .line 598
    new-instance v0, Ll/ۗܶۚ;

    .line 594
    invoke-direct {v0, p1}, Ll/۬ܶۚ;-><init>(Ljava/lang/String;)V

    .line 508
    iget-object p1, p0, Ll/۫ܶۚ;->ܿ:Ljava/util/HashSet;

    invoke-virtual {p1, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
