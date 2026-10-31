.class public final Ll/ۘ᩵ᩴ;
.super Ll/ܿᩴᩴ;
.source "S24"

# interfaces
.implements Ll/۬᩵ᩴ;
.implements Ll/ۡ۫ᩴ;


# instance fields
.field public final synthetic ᩸:Ll/᩸᩵ᩴ;


# direct methods
.method public constructor <init>(Ll/᩸᩵ᩴ;)V
    .locals 0

    .line 205
    iput-object p1, p0, Ll/ۘ᩵ᩴ;->᩸:Ll/᩸᩵ᩴ;

    .line 34
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 4

    .line 366
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 367
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 368
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    .line 369
    iget-object v2, p0, Ll/ۘ᩵ᩴ;->᩸:Ll/᩸᩵ᩴ;

    invoke-virtual {v2, v0}, Ll/᩸᩵ᩴ;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2, v0}, Ll/᩸᩵ᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final forEach(Ljava/util/function/Consumer;)V
    .locals 4

    .line 342
    iget-object v0, p0, Ll/ۘ᩵ᩴ;->᩸:Ll/᩸᩵ᩴ;

    iget v1, v0, Ll/᩸᩵ᩴ;->ۙ:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 343
    new-instance v3, Ll/ۚ᩵ᩴ;

    invoke-direct {v3, v0, v2}, Ll/ۚ᩵ᩴ;-><init>(Ll/᩸᩵ᩴ;I)V

    invoke-interface {p1, v3}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 208
    new-instance v0, Ll/ۡ᩵ᩴ;

    invoke-direct {v0, p0}, Ll/ۡ᩵ᩴ;-><init>(Ll/ۘ᩵ᩴ;)V

    return-object v0
.end method

.method public final iterator()Ll/۫֡ᩴ;
    .locals 1

    .line 208
    new-instance v0, Ll/ۡ᩵ᩴ;

    invoke-direct {v0, p0}, Ll/ۡ᩵ᩴ;-><init>(Ll/ۘ᩵ᩴ;)V

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 5

    .line 375
    instance-of v0, p1, Ljava/util/Map$Entry;

    if-nez v0, :cond_0

    goto :goto_0

    .line 376
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 377
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    .line 378
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    .line 379
    iget-object v1, p0, Ll/ۘ᩵ᩴ;->᩸:Ll/᩸᩵ᩴ;

    invoke-static {v1, v0}, Ll/᩸᩵ᩴ;->֫(Ll/᩸᩵ᩴ;Ljava/lang/Object;)I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_2

    .line 380
    iget-object v2, v1, Ll/᩸᩵ᩴ;->ۗ:[Ljava/lang/Object;

    aget-object v2, v2, v0

    invoke-static {p1, v2}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    .line 381
    :cond_1
    iget p1, v1, Ll/᩸᩵ᩴ;->ۙ:I

    sub-int/2addr p1, v0

    const/4 v2, 0x1

    sub-int/2addr p1, v2

    .line 382
    iget-object v3, v1, Ll/᩸᩵ᩴ;->᩹:[Ljava/lang/Object;

    add-int/lit8 v4, v0, 0x1

    invoke-static {v3, v4, v3, v0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 383
    iget-object v3, v1, Ll/᩸᩵ᩴ;->ۗ:[Ljava/lang/Object;

    invoke-static {v3, v4, v3, v0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 384
    iget p1, v1, Ll/᩸᩵ᩴ;->ۙ:I

    sub-int/2addr p1, v2

    iput p1, v1, Ll/᩸᩵ᩴ;->ۙ:I

    .line 385
    iget-object v0, v1, Ll/᩸᩵ᩴ;->᩹:[Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v3, v0, p1

    .line 386
    iget-object v0, v1, Ll/᩸᩵ᩴ;->ۗ:[Ljava/lang/Object;

    aput-object v3, v0, p1

    return v2

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final size()I
    .locals 1

    .line 360
    iget-object v0, p0, Ll/ۘ᩵ᩴ;->᩸:Ll/᩸᩵ᩴ;

    iget v0, v0, Ll/᩸᩵ᩴ;->ۙ:I

    return v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/ۘ᩵ᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/۠ۚᩴ;
    .locals 3

    .line 335
    new-instance v0, Ll/ۖ᩵ᩴ;

    iget-object v1, p0, Ll/ۘ᩵ᩴ;->᩸:Ll/᩸᩵ᩴ;

    iget v1, v1, Ll/᩸᩵ᩴ;->ۙ:I

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2, v1}, Ll/ۖ᩵ᩴ;-><init>(Ll/ۘ᩵ᩴ;II)V

    return-object v0
.end method

.method public final bridge synthetic spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 205
    invoke-virtual {p0}, Ll/ۘ᩵ᩴ;->spliterator()Ll/۠ۚᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/۫֡ᩴ;
    .locals 1

    .line 259
    new-instance v0, Ll/ܺ᩵ᩴ;

    invoke-direct {v0, p0}, Ll/ܺ᩵ᩴ;-><init>(Ll/ۘ᩵ᩴ;)V

    return-object v0
.end method
