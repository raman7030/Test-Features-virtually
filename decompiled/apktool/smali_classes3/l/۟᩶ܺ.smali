.class public Ll/۟᩶ܺ;
.super Ljava/util/AbstractCollection;
.source "O3K3"


# instance fields
.field public final synthetic ۗ:Ll/ܽۙܺ;

.field public final ۙ:Ljava/lang/Object;

.field public ᩶:Ljava/util/Collection;

.field public final ᩸:Ll/۟᩶ܺ;

.field public final ᩹:Ljava/util/Collection;


# direct methods
.method public constructor <init>(Ll/ܽۙܺ;Ljava/lang/Object;Ljava/util/List;Ll/۟᩶ܺ;)V
    .locals 0

    .line 337
    iput-object p1, p0, Ll/۟᩶ܺ;->ۗ:Ll/ܽۙܺ;

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 338
    iput-object p2, p0, Ll/۟᩶ܺ;->ۙ:Ljava/lang/Object;

    .line 339
    iput-object p3, p0, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    .line 340
    iput-object p4, p0, Ll/۟᩶ܺ;->᩸:Ll/۟᩶ܺ;

    if-nez p4, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 431
    :cond_0
    iget-object p1, p4, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    .line 341
    :goto_0
    iput-object p1, p0, Ll/۟᩶ܺ;->᩹:Ljava/util/Collection;

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 2

    .line 491
    invoke-virtual {p0}, Ll/۟᩶ܺ;->ܽ()V

    .line 492
    iget-object v0, p0, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    .line 493
    iget-object v1, p0, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 495
    iget-object v1, p0, Ll/۟᩶ܺ;->ۗ:Ll/ܽۙܺ;

    invoke-static {v1}, Ll/ܽۙܺ;->ۧ(Ll/ܽۙܺ;)V

    if-eqz v0, :cond_0

    .line 497
    invoke-virtual {p0}, Ll/۟᩶ܺ;->ۧ()V

    :cond_0
    return p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 3

    .line 511
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 514
    :cond_0
    invoke-virtual {p0}, Ll/۟᩶ܺ;->size()I

    move-result v0

    .line 515
    iget-object v1, p0, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 517
    iget-object v1, p0, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    .line 518
    iget-object v2, p0, Ll/۟᩶ܺ;->ۗ:Ll/ܽۙܺ;

    sub-int/2addr v1, v0

    invoke-static {v2, v1}, Ll/ܽۙܺ;->֫(Ll/ܽۙܺ;I)V

    if-nez v0, :cond_1

    .line 520
    invoke-virtual {p0}, Ll/۟᩶ܺ;->ۧ()V

    :cond_1
    return p1
.end method

.method public final clear()V
    .locals 2

    .line 540
    invoke-virtual {p0}, Ll/۟᩶ܺ;->size()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 544
    :cond_0
    iget-object v1, p0, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->clear()V

    .line 545
    iget-object v1, p0, Ll/۟᩶ܺ;->ۗ:Ll/ܽۙܺ;

    invoke-static {v1, v0}, Ll/ܽۙܺ;->ۧ(Ll/ܽۙܺ;I)V

    .line 546
    invoke-virtual {p0}, Ll/۟᩶ܺ;->ᩳ()V

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 528
    invoke-virtual {p0}, Ll/۟᩶ܺ;->ܽ()V

    .line 529
    iget-object v0, p0, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 1

    .line 534
    invoke-virtual {p0}, Ll/۟᩶ܺ;->ܽ()V

    .line 535
    iget-object v0, p0, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 414
    :cond_0
    invoke-virtual {p0}, Ll/۟᩶ܺ;->ܽ()V

    .line 415
    iget-object v0, p0, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 420
    invoke-virtual {p0}, Ll/۟᩶ܺ;->ܽ()V

    .line 421
    iget-object v0, p0, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->hashCode()I

    move-result v0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 436
    invoke-virtual {p0}, Ll/۟᩶ܺ;->ܽ()V

    .line 437
    new-instance v0, Ll/ܰ᩶ܺ;

    invoke-direct {v0, p0}, Ll/ܰ᩶ܺ;-><init>(Ll/۟᩶ܺ;)V

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    .line 551
    invoke-virtual {p0}, Ll/۟᩶ܺ;->ܽ()V

    .line 552
    iget-object v0, p0, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 554
    iget-object v0, p0, Ll/۟᩶ܺ;->ۗ:Ll/ܽۙܺ;

    invoke-static {v0}, Ll/ܽۙܺ;->ܽ(Ll/ܽۙܺ;)V

    .line 555
    invoke-virtual {p0}, Ll/۟᩶ܺ;->ᩳ()V

    :cond_0
    return p1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 3

    .line 562
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 565
    :cond_0
    invoke-virtual {p0}, Ll/۟᩶ܺ;->size()I

    move-result v0

    .line 566
    iget-object v1, p0, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 568
    iget-object v1, p0, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    .line 569
    iget-object v2, p0, Ll/۟᩶ܺ;->ۗ:Ll/ܽۙܺ;

    sub-int/2addr v1, v0

    invoke-static {v2, v1}, Ll/ܽۙܺ;->֫(Ll/ܽۙܺ;I)V

    .line 570
    invoke-virtual {p0}, Ll/۟᩶ܺ;->ᩳ()V

    :cond_1
    return p1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 3

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 578
    invoke-virtual {p0}, Ll/۟᩶ܺ;->size()I

    move-result v0

    .line 579
    iget-object v1, p0, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/Collection;->retainAll(Ljava/util/Collection;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 581
    iget-object v1, p0, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    .line 582
    iget-object v2, p0, Ll/۟᩶ܺ;->ۗ:Ll/ܽۙܺ;

    sub-int/2addr v1, v0

    invoke-static {v2, v1}, Ll/ܽۙܺ;->֫(Ll/ܽۙܺ;I)V

    .line 583
    invoke-virtual {p0}, Ll/۟᩶ܺ;->ᩳ()V

    :cond_0
    return p1
.end method

.method public final size()I
    .locals 1

    .line 398
    invoke-virtual {p0}, Ll/۟᩶ܺ;->ܽ()V

    .line 399
    iget-object v0, p0, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 426
    invoke-virtual {p0}, Ll/۟᩶ܺ;->ܽ()V

    .line 427
    iget-object v0, p0, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()V
    .locals 3

    .line 389
    iget-object v0, p0, Ll/۟᩶ܺ;->᩸:Ll/۟᩶ܺ;

    if-eqz v0, :cond_0

    .line 390
    invoke-virtual {v0}, Ll/۟᩶ܺ;->ۧ()V

    return-void

    .line 392
    :cond_0
    iget-object v0, p0, Ll/۟᩶ܺ;->ۗ:Ll/ܽۙܺ;

    invoke-static {v0}, Ll/ܽۙܺ;->֫(Ll/ܽۙܺ;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Ll/۟᩶ܺ;->ۙ:Ljava/lang/Object;

    iget-object v2, p0, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ܽ()V
    .locals 2

    .line 352
    iget-object v0, p0, Ll/۟᩶ܺ;->᩸:Ll/۟᩶ܺ;

    if-eqz v0, :cond_1

    .line 353
    invoke-virtual {v0}, Ll/۟᩶ܺ;->ܽ()V

    .line 431
    iget-object v0, v0, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    .line 354
    iget-object v1, p0, Ll/۟᩶ܺ;->᩹:Ljava/util/Collection;

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 355
    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0

    .line 357
    :cond_1
    iget-object v0, p0, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 358
    iget-object v0, p0, Ll/۟᩶ܺ;->ۗ:Ll/ܽۙܺ;

    invoke-static {v0}, Ll/ܽۙܺ;->֫(Ll/ܽۙܺ;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Ll/۟᩶ܺ;->ۙ:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    if-eqz v0, :cond_2

    .line 360
    iput-object v0, p0, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    :cond_2
    :goto_0
    return-void
.end method

.method public final ᩳ()V
    .locals 2

    .line 370
    iget-object v0, p0, Ll/۟᩶ܺ;->᩸:Ll/۟᩶ܺ;

    if-eqz v0, :cond_0

    .line 371
    invoke-virtual {v0}, Ll/۟᩶ܺ;->ᩳ()V

    return-void

    .line 372
    :cond_0
    iget-object v0, p0, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 373
    iget-object v0, p0, Ll/۟᩶ܺ;->ۗ:Ll/ܽۙܺ;

    invoke-static {v0}, Ll/ܽۙܺ;->֫(Ll/ܽۙܺ;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Ll/۟᩶ܺ;->ۙ:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method
