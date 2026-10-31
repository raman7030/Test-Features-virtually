.class public final Ll/ۛ᩵ۖ;
.super Ljava/lang/Object;
.source "89PP"

# interfaces
.implements Ljava/util/Set;


# instance fields
.field public final ᩸:Ljava/util/Set;

.field public final ᩹:Ll/ܰ᩵ۖ;


# direct methods
.method public constructor <init>(Ll/ܰ᩵ۖ;Ljava/util/Set;)V
    .locals 0

    .line 457
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 458
    iput-object p1, p0, Ll/ۛ᩵ۖ;->᩹:Ll/ܰ᩵ۖ;

    .line 459
    iput-object p2, p0, Ll/ۛ᩵ۖ;->᩸:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 1

    .line 494
    iget-object v0, p0, Ll/ۛ᩵ۖ;->᩹:Ll/ܰ᩵ۖ;

    invoke-virtual {v0}, Ll/ܰ᩵ۖ;->ܿ()V

    .line 495
    iget-object v0, p0, Ll/ۛ᩵ۖ;->᩸:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 1

    .line 511
    iget-object v0, p0, Ll/ۛ᩵ۖ;->᩹:Ll/ܰ᩵ۖ;

    invoke-virtual {v0}, Ll/ܰ᩵ۖ;->ܿ()V

    .line 512
    iget-object v0, p0, Ll/ۛ᩵ۖ;->᩸:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final clear()V
    .locals 1

    .line 529
    iget-object v0, p0, Ll/ۛ᩵ۖ;->᩹:Ll/ܰ᩵ۖ;

    invoke-virtual {v0}, Ll/ܰ᩵ۖ;->ܿ()V

    .line 530
    iget-object v0, p0, Ll/ۛ᩵ۖ;->᩸:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 474
    iget-object v0, p0, Ll/ۛ᩵ۖ;->᩸:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 1

    .line 506
    iget-object v0, p0, Ll/ۛ᩵ۖ;->᩸:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 535
    iget-object v0, p0, Ll/ۛ᩵ۖ;->᩸:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 540
    iget-object v0, p0, Ll/ۛ᩵ۖ;->᩸:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->hashCode()I

    move-result v0

    return v0
.end method

.method public final isEmpty()Z
    .locals 1

    .line 469
    iget-object v0, p0, Ll/ۛ᩵ۖ;->᩸:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    .line 479
    new-instance v0, Ll/ۤ᩵ۖ;

    iget-object v1, p0, Ll/ۛ᩵ۖ;->᩸:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    iget-object v2, p0, Ll/ۛ᩵ۖ;->᩹:Ll/ܰ᩵ۖ;

    invoke-direct {v0, v2, v1}, Ll/ۤ᩵ۖ;-><init>(Ll/ܰ᩵ۖ;Ljava/util/Iterator;)V

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    .line 500
    iget-object v0, p0, Ll/ۛ᩵ۖ;->᩹:Ll/ܰ᩵ۖ;

    invoke-virtual {v0}, Ll/ܰ᩵ۖ;->ܿ()V

    .line 501
    iget-object v0, p0, Ll/ۛ᩵ۖ;->᩸:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 1

    .line 523
    iget-object v0, p0, Ll/ۛ᩵ۖ;->᩹:Ll/ܰ᩵ۖ;

    invoke-virtual {v0}, Ll/ܰ᩵ۖ;->ܿ()V

    .line 524
    iget-object v0, p0, Ll/ۛ᩵ۖ;->᩸:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 1

    .line 517
    iget-object v0, p0, Ll/ۛ᩵ۖ;->᩹:Ll/ܰ᩵ۖ;

    invoke-virtual {v0}, Ll/ܰ᩵ۖ;->ܿ()V

    .line 518
    iget-object v0, p0, Ll/ۛ᩵ۖ;->᩸:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->retainAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final size()I
    .locals 1

    .line 464
    iget-object v0, p0, Ll/ۛ᩵ۖ;->᩸:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    return v0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 1

    .line 484
    iget-object v0, p0, Ll/ۛ᩵ۖ;->᩸:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->toArray()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1

    .line 489
    iget-object v0, p0, Ll/ۛ᩵ۖ;->᩸:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 545
    iget-object v0, p0, Ll/ۛ᩵ۖ;->᩸:Ljava/util/Set;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
