.class public final Ll/ۗܰۘ;
.super Ll/֡ܰۘ;
.source "YCK3"


# instance fields
.field public final synthetic ᩸:Ll/ۨܰۘ;


# direct methods
.method public constructor <init>(Ll/ۨܰۘ;)V
    .locals 0

    .line 511
    iput-object p1, p0, Ll/ۗܰۘ;->᩸:Ll/ۨܰۘ;

    .line 35
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 2

    .line 621
    iget-object v0, p0, Ll/ۗܰۘ;->᩸:Ll/ۨܰۘ;

    const/4 v1, 0x0

    .line 453
    iput v1, v0, Ll/ۨܰۘ;->ۙ:I

    return-void
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 530
    new-instance v0, Ll/᩶ܰۘ;

    invoke-direct {v0, p0}, Ll/᩶ܰۘ;-><init>(Ll/ۗܰۘ;)V

    return-object v0
.end method

.method public final iterator()Ll/ܺۧᩴ;
    .locals 1

    .line 530
    new-instance v0, Ll/᩶ܰۘ;

    invoke-direct {v0, p0}, Ll/᩶ܰۘ;-><init>(Ll/ۗܰۘ;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 616
    iget-object v0, p0, Ll/ۗܰۘ;->᩸:Ll/ۨܰۘ;

    iget v0, v0, Ll/ۨܰۘ;->ۙ:I

    return v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/ۗܰۘ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 511
    invoke-virtual {p0}, Ll/ۗܰۘ;->spliterator()Ll/ܽܽᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/ܽܽᩴ;
    .locals 3

    .line 602
    new-instance v0, Ll/ۙܰۘ;

    iget-object v1, p0, Ll/ۗܰۘ;->᩸:Ll/ۨܰۘ;

    iget v1, v1, Ll/ۨܰۘ;->ۙ:I

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2, v1}, Ll/ۙܰۘ;-><init>(Ll/ۗܰۘ;II)V

    return-object v0
.end method

.method public final ֫(Ll/᩻ۧᩴ;)V
    .locals 4

    .line 608
    iget-object v0, p0, Ll/ۗܰۘ;->᩸:Ll/ۨܰۘ;

    iget-object v1, v0, Ll/ۨܰۘ;->᩹:[C

    .line 609
    iget v0, v0, Ll/ۨܰۘ;->ۙ:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 610
    aget-char v3, v1, v2

    invoke-interface {p1, v3}, Ll/᩻ۧᩴ;->ܽ(C)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(C)Z
    .locals 5

    .line 519
    iget-object v0, p0, Ll/ۗܰۘ;->᩸:Ll/ۨܰۘ;

    invoke-static {v0, p1}, Ll/ۨܰۘ;->֫(Ll/ۨܰۘ;C)I

    move-result p1

    const/4 v1, -0x1

    if-ne p1, v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 521
    :cond_0
    iget v1, v0, Ll/ۨܰۘ;->ۙ:I

    sub-int/2addr v1, p1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    .line 522
    iget-object v3, v0, Ll/ۨܰۘ;->᩹:[C

    add-int/lit8 v4, p1, 0x1

    invoke-static {v3, v4, v3, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 523
    iget-object v3, v0, Ll/ۨܰۘ;->ۗ:[C

    invoke-static {v3, v4, v3, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 524
    iget p1, v0, Ll/ۨܰۘ;->ۙ:I

    sub-int/2addr p1, v2

    iput p1, v0, Ll/ۨܰۘ;->ۙ:I

    return v2
.end method

.method public final ᩻(C)Z
    .locals 1

    .line 514
    iget-object v0, p0, Ll/ۗܰۘ;->᩸:Ll/ۨܰۘ;

    invoke-static {v0, p1}, Ll/ۨܰۘ;->֫(Ll/ۨܰۘ;C)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
