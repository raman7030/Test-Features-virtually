.class public final Ll/֡ۜᩴ;
.super Ll/ܿᩴᩴ;
.source "VZ3"

# interfaces
.implements Ll/᩺ۜᩴ;
.implements Ll/ۡ۫ᩴ;


# instance fields
.field public final synthetic ᩸:Ll/ۙۜᩴ;


# direct methods
.method public constructor <init>(Ll/ۙۜᩴ;)V
    .locals 0

    .line 223
    iput-object p1, p0, Ll/֡ۜᩴ;->᩸:Ll/ۙۜᩴ;

    .line 34
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 4

    .line 382
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 383
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 384
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/Integer;

    if-nez v0, :cond_1

    goto :goto_0

    .line 385
    :cond_1
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 386
    iget-object v2, p0, Ll/֡ۜᩴ;->᩸:Ll/ۙۜᩴ;

    invoke-virtual {v2, v0}, Ll/ۙۜᩴ;->֫(I)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2, v0}, Ll/ۙۜᩴ;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    return v1
.end method

.method public final forEach(Ljava/util/function/Consumer;)V
    .locals 4

    .line 358
    iget-object v0, p0, Ll/֡ۜᩴ;->᩸:Ll/ۙۜᩴ;

    iget v1, v0, Ll/ۙۜᩴ;->ۙ:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 359
    new-instance v3, Ll/ܶۜᩴ;

    invoke-direct {v3, v0, v2}, Ll/ܶۜᩴ;-><init>(Ll/ۙۜᩴ;I)V

    invoke-interface {p1, v3}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 226
    new-instance v0, Ll/ۘۜᩴ;

    invoke-direct {v0, p0}, Ll/ۘۜᩴ;-><init>(Ll/֡ۜᩴ;)V

    return-object v0
.end method

.method public final iterator()Ll/۫֡ᩴ;
    .locals 1

    .line 226
    new-instance v0, Ll/ۘۜᩴ;

    invoke-direct {v0, p0}, Ll/ۘۜᩴ;-><init>(Ll/֡ۜᩴ;)V

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 5

    .line 392
    instance-of v0, p1, Ljava/util/Map$Entry;

    if-nez v0, :cond_0

    goto :goto_0

    .line 393
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 394
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/Integer;

    if-nez v0, :cond_1

    goto :goto_0

    .line 395
    :cond_1
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 396
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    .line 397
    iget-object v1, p0, Ll/֡ۜᩴ;->᩸:Ll/ۙۜᩴ;

    invoke-static {v1, v0}, Ll/ۙۜᩴ;->֫(Ll/ۙۜᩴ;I)I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_3

    .line 398
    iget-object v2, v1, Ll/ۙۜᩴ;->ۗ:[Ljava/lang/Object;

    aget-object v2, v2, v0

    invoke-static {p1, v2}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    .line 399
    :cond_2
    iget p1, v1, Ll/ۙۜᩴ;->ۙ:I

    sub-int/2addr p1, v0

    const/4 v2, 0x1

    sub-int/2addr p1, v2

    .line 400
    iget-object v3, v1, Ll/ۙۜᩴ;->᩹:[I

    add-int/lit8 v4, v0, 0x1

    invoke-static {v3, v4, v3, v0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 401
    iget-object v3, v1, Ll/ۙۜᩴ;->ۗ:[Ljava/lang/Object;

    invoke-static {v3, v4, v3, v0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 402
    iget p1, v1, Ll/ۙۜᩴ;->ۙ:I

    sub-int/2addr p1, v2

    iput p1, v1, Ll/ۙۜᩴ;->ۙ:I

    .line 403
    iget-object v0, v1, Ll/ۙۜᩴ;->ۗ:[Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v1, v0, p1

    return v2

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final size()I
    .locals 1

    .line 376
    iget-object v0, p0, Ll/֡ۜᩴ;->᩸:Ll/ۙۜᩴ;

    iget v0, v0, Ll/ۙۜᩴ;->ۙ:I

    return v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/֡ۜᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/۠ۚᩴ;
    .locals 3

    .line 351
    new-instance v0, Ll/᩵ۜᩴ;

    iget-object v1, p0, Ll/֡ۜᩴ;->᩸:Ll/ۙۜᩴ;

    iget v1, v1, Ll/ۙۜᩴ;->ۙ:I

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2, v1}, Ll/᩵ۜᩴ;-><init>(Ll/֡ۜᩴ;II)V

    return-object v0
.end method

.method public final bridge synthetic spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 223
    invoke-virtual {p0}, Ll/֡ۜᩴ;->spliterator()Ll/۠ۚᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/۫֡ᩴ;
    .locals 1

    .line 276
    new-instance v0, Ll/ᩴۜᩴ;

    invoke-direct {v0, p0}, Ll/ᩴۜᩴ;-><init>(Ll/֡ۜᩴ;)V

    return-object v0
.end method
