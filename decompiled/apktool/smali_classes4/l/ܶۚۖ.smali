.class public Ll/ܶۚۖ;
.super Ljava/util/AbstractSet;
.source "V9PU"


# instance fields
.field public final synthetic ᩸:Ll/᩸ۚۖ;


# direct methods
.method public constructor <init>(Ll/᩸ۚۖ;)V
    .locals 0

    .line 441
    iput-object p1, p0, Ll/ܶۚۖ;->᩸:Ll/᩸ۚۖ;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 2

    .line 441
    check-cast p1, Ljava/util/Map$Entry;

    .line 469
    invoke-virtual {p0, p1}, Ll/ܶۚۖ;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 470
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Comparable;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    iget-object v1, p0, Ll/ܶۚۖ;->᩸:Ll/᩸ۚۖ;

    invoke-virtual {v1, v0, p1}, Ll/᩸ۚۖ;->֫(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final clear()V
    .locals 1

    .line 494
    iget-object v0, p0, Ll/ܶۚۖ;->᩸:Ll/᩸ۚۖ;

    invoke-virtual {v0}, Ll/᩸ۚۖ;->clear()V

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 2

    .line 461
    check-cast p1, Ljava/util/Map$Entry;

    .line 462
    iget-object v0, p0, Ll/ܶۚۖ;->᩸:Ll/᩸ۚۖ;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/᩸ۚۖ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 463
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eq v0, p1, :cond_1

    if-eqz v0, :cond_0

    .line 464
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2

    .line 445
    new-instance v0, Ll/۠ۚۖ;

    iget-object v1, p0, Ll/ܶۚۖ;->᩸:Ll/᩸ۚۖ;

    invoke-direct {v0, v1}, Ll/۠ۚۖ;-><init>(Ll/᩸ۚۖ;)V

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    .line 484
    check-cast p1, Ljava/util/Map$Entry;

    .line 485
    invoke-virtual {p0, p1}, Ll/ܶۚۖ;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 486
    iget-object v0, p0, Ll/ܶۚۖ;->᩸:Ll/᩸ۚۖ;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/᩸ۚۖ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final size()I
    .locals 1

    .line 450
    iget-object v0, p0, Ll/ܶۚۖ;->᩸:Ll/᩸ۚۖ;

    invoke-virtual {v0}, Ll/᩸ۚۖ;->size()I

    move-result v0

    return v0
.end method
