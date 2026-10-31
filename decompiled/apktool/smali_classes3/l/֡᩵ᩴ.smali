.class public final Ll/֡᩵ᩴ;
.super Ll/ܿᩴᩴ;
.source "S24"


# instance fields
.field public final synthetic ᩸:Ll/᩸᩵ᩴ;


# direct methods
.method public constructor <init>(Ll/᩸᩵ᩴ;)V
    .locals 0

    .line 484
    iput-object p1, p0, Ll/֡᩵ᩴ;->᩸:Ll/᩸᩵ᩴ;

    .line 34
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 598
    iget-object v0, p0, Ll/֡᩵ᩴ;->᩸:Ll/᩸᩵ᩴ;

    invoke-virtual {v0}, Ll/᩸᩵ᩴ;->clear()V

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 487
    iget-object v0, p0, Ll/֡᩵ᩴ;->᩸:Ll/᩸᩵ᩴ;

    invoke-static {v0, p1}, Ll/᩸᩵ᩴ;->֫(Ll/᩸᩵ᩴ;Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final forEach(Ljava/util/function/Consumer;)V
    .locals 4

    .line 585
    iget-object v0, p0, Ll/֡᩵ᩴ;->᩸:Ll/᩸᩵ᩴ;

    iget-object v1, v0, Ll/᩸᩵ᩴ;->᩹:[Ljava/lang/Object;

    .line 586
    iget v0, v0, Ll/᩸᩵ᩴ;->ۙ:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 587
    aget-object v3, v1, v2

    invoke-interface {p1, v3}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 505
    new-instance v0, Ll/ᩴ᩵ᩴ;

    invoke-direct {v0, p0}, Ll/ᩴ᩵ᩴ;-><init>(Ll/֡᩵ᩴ;)V

    return-object v0
.end method

.method public final iterator()Ll/۫֡ᩴ;
    .locals 1

    .line 505
    new-instance v0, Ll/ᩴ᩵ᩴ;

    invoke-direct {v0, p0}, Ll/ᩴ᩵ᩴ;-><init>(Ll/֡᩵ᩴ;)V

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 5

    .line 492
    iget-object v0, p0, Ll/֡᩵ᩴ;->᩸:Ll/᩸᩵ᩴ;

    invoke-static {v0, p1}, Ll/᩸᩵ᩴ;->֫(Ll/᩸᩵ᩴ;Ljava/lang/Object;)I

    move-result p1

    const/4 v1, -0x1

    if-ne p1, v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 494
    :cond_0
    iget v1, v0, Ll/᩸᩵ᩴ;->ۙ:I

    sub-int/2addr v1, p1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    .line 495
    iget-object v3, v0, Ll/᩸᩵ᩴ;->᩹:[Ljava/lang/Object;

    add-int/lit8 v4, p1, 0x1

    invoke-static {v3, v4, v3, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 496
    iget-object v3, v0, Ll/᩸᩵ᩴ;->ۗ:[Ljava/lang/Object;

    invoke-static {v3, v4, v3, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 497
    iget p1, v0, Ll/᩸᩵ᩴ;->ۙ:I

    sub-int/2addr p1, v2

    iput p1, v0, Ll/᩸᩵ᩴ;->ۙ:I

    .line 498
    iget-object v1, v0, Ll/᩸᩵ᩴ;->᩹:[Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v3, v1, p1

    .line 499
    iget-object v0, v0, Ll/᩸᩵ᩴ;->ۗ:[Ljava/lang/Object;

    aput-object v3, v0, p1

    return v2
.end method

.method public final size()I
    .locals 1

    .line 593
    iget-object v0, p0, Ll/֡᩵ᩴ;->᩸:Ll/᩸᩵ᩴ;

    iget v0, v0, Ll/᩸᩵ᩴ;->ۙ:I

    return v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/֡᩵ᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/۠ۚᩴ;
    .locals 3

    .line 579
    new-instance v0, Ll/᩵᩵ᩴ;

    iget-object v1, p0, Ll/֡᩵ᩴ;->᩸:Ll/᩸᩵ᩴ;

    iget v1, v1, Ll/᩸᩵ᩴ;->ۙ:I

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2, v1}, Ll/᩵᩵ᩴ;-><init>(Ll/֡᩵ᩴ;II)V

    return-object v0
.end method

.method public final bridge synthetic spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 484
    invoke-virtual {p0}, Ll/֡᩵ᩴ;->spliterator()Ll/۠ۚᩴ;

    move-result-object v0

    return-object v0
.end method
