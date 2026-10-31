.class public final Ll/᩸֫ᩴ;
.super Ll/ۡܰۘ;
.source "UCGS"


# static fields
.field public static final serialVersionUID:J = -0x2c34327c29b70228L


# instance fields
.field public final synthetic ۙ:Ll/᩹֫ᩴ;


# direct methods
.method public constructor <init>(Ll/᩹֫ᩴ;II)V
    .locals 0

    .line 411
    iput-object p1, p0, Ll/᩸֫ᩴ;->ۙ:Ll/᩹֫ᩴ;

    .line 825
    invoke-direct {p0, p1, p2, p3}, Ll/ۘܰۘ;-><init>(Ll/᩵ܰۘ;II)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 408
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Ll/᩸֫ᩴ;->֫(Ljava/util/List;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    .line 553
    :cond_1
    instance-of v1, p1, Ljava/util/List;

    if-nez v1, :cond_2

    return v0

    .line 554
    :cond_2
    instance-of v1, p1, Ll/᩹֫ᩴ;

    if-eqz v1, :cond_3

    .line 556
    check-cast p1, Ll/᩹֫ᩴ;

    .line 557
    iget-object v1, p1, Ll/᩹֫ᩴ;->᩸:[C

    .line 361
    iget p1, p1, Ll/᩹֫ᩴ;->᩹:I

    .line 557
    invoke-virtual {p0, v1, v0, p1}, Ll/᩸֫ᩴ;->ܽ([CII)Z

    move-result p1

    return p1

    .line 559
    :cond_3
    instance-of v0, p1, Ll/᩸֫ᩴ;

    if-eqz v0, :cond_4

    .line 561
    check-cast p1, Ll/᩸֫ᩴ;

    .line 419
    iget-object v0, p1, Ll/᩸֫ᩴ;->ۙ:Ll/᩹֫ᩴ;

    iget-object v0, v0, Ll/᩹֫ᩴ;->᩸:[C

    .line 562
    iget v1, p1, Ll/ۘܰۘ;->᩸:I

    iget p1, p1, Ll/ۘܰۘ;->᩶:I

    invoke-virtual {p0, v0, v1, p1}, Ll/᩸֫ᩴ;->ܽ([CII)Z

    move-result p1

    return p1

    .line 564
    :cond_4
    invoke-super {p0, p1}, Ll/᩵ܰۘ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final getChar(I)C
    .locals 2

    .line 424
    invoke-virtual {p0, p1}, Ll/᩵ܰۘ;->ᩳ(I)V

    .line 425
    iget-object v0, p0, Ll/᩸֫ᩴ;->ۙ:Ll/᩹֫ᩴ;

    iget-object v0, v0, Ll/᩹֫ᩴ;->᩸:[C

    iget v1, p0, Ll/ۘܰۘ;->᩸:I

    add-int/2addr p1, v1

    aget-char p1, v0, p1

    return p1
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 1

    .line 484
    new-instance v0, Ll/۠֫ᩴ;

    invoke-direct {v0, p0, p1}, Ll/۠֫ᩴ;-><init>(Ll/᩸֫ᩴ;I)V

    return-object v0
.end method

.method public final listIterator(I)Ll/ܶۧᩴ;
    .locals 1

    .line 484
    new-instance v0, Ll/۠֫ᩴ;

    invoke-direct {v0, p0, p1}, Ll/۠֫ᩴ;-><init>(Ll/᩸֫ᩴ;I)V

    return-object v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/᩸֫ᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 531
    new-instance v0, Ll/ܶ֫ᩴ;

    invoke-direct {v0, p0}, Ll/ܶ֫ᩴ;-><init>(Ll/᩸֫ᩴ;)V

    return-object v0
.end method

.method public final spliterator()Ll/ܽܽᩴ;
    .locals 1

    .line 531
    new-instance v0, Ll/ܶ֫ᩴ;

    invoke-direct {v0, p0}, Ll/ܶ֫ᩴ;-><init>(Ll/᩸֫ᩴ;)V

    return-object v0
.end method

.method public final ֫(Ljava/util/List;)I
    .locals 2

    .line 582
    instance-of v0, p1, Ll/᩹֫ᩴ;

    if-eqz v0, :cond_0

    .line 584
    check-cast p1, Ll/᩹֫ᩴ;

    .line 585
    iget-object v0, p1, Ll/᩹֫ᩴ;->᩸:[C

    const/4 v1, 0x0

    .line 361
    iget p1, p1, Ll/᩹֫ᩴ;->᩹:I

    .line 585
    invoke-virtual {p0, v0, v1, p1}, Ll/᩸֫ᩴ;->ۧ([CII)I

    move-result p1

    return p1

    .line 587
    :cond_0
    instance-of v0, p1, Ll/᩸֫ᩴ;

    if-eqz v0, :cond_1

    .line 589
    check-cast p1, Ll/᩸֫ᩴ;

    .line 419
    iget-object v0, p1, Ll/᩸֫ᩴ;->ۙ:Ll/᩹֫ᩴ;

    iget-object v0, v0, Ll/᩹֫ᩴ;->᩸:[C

    .line 590
    iget v1, p1, Ll/ۘܰۘ;->᩸:I

    iget p1, p1, Ll/ۘܰۘ;->᩶:I

    invoke-virtual {p0, v0, v1, p1}, Ll/᩸֫ᩴ;->ۧ([CII)I

    move-result p1

    return p1

    .line 592
    :cond_1
    invoke-super {p0, p1}, Ll/᩵ܰۘ;->֫(Ljava/util/List;)I

    move-result p1

    return p1
.end method

.method public final ۧ([CII)I
    .locals 5

    .line 568
    iget-object v0, p0, Ll/᩸֫ᩴ;->ۙ:Ll/᩹֫ᩴ;

    iget-object v1, v0, Ll/᩹֫ᩴ;->᩸:[C

    const/4 v2, 0x0

    iget v3, p0, Ll/ۘܰۘ;->᩸:I

    if-ne v1, p1, :cond_0

    if-ne v3, p2, :cond_0

    iget v1, p0, Ll/ۘܰۘ;->᩶:I

    if-ne v1, p3, :cond_0

    return v2

    .line 572
    :cond_0
    :goto_0
    iget v1, p0, Ll/ۘܰۘ;->᩶:I

    if-ge v3, v1, :cond_2

    if-ge v3, p3, :cond_2

    .line 573
    iget-object v1, v0, Ll/᩹֫ᩴ;->᩸:[C

    aget-char v1, v1, v3

    .line 574
    aget-char v4, p1, p2

    .line 575
    invoke-static {v1, v4}, Ljava/lang/Character;->compare(CC)I

    move-result v1

    if-eqz v1, :cond_1

    return v1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_2
    if-ge v3, p3, :cond_3

    const/4 p1, -0x1

    return p1

    :cond_3
    if-ge v3, v1, :cond_4

    const/4 p1, 0x1

    return p1

    :cond_4
    return v2
.end method

.method public final ܽ([CII)Z
    .locals 5

    .line 535
    iget-object v0, p0, Ll/᩸֫ᩴ;->ۙ:Ll/᩹֫ᩴ;

    iget-object v1, v0, Ll/᩹֫ᩴ;->᩸:[C

    iget v2, p0, Ll/ۘܰۘ;->᩸:I

    const/4 v3, 0x1

    if-ne v1, p1, :cond_0

    if-ne v2, p2, :cond_0

    iget v1, p0, Ll/ۘܰۘ;->᩶:I

    if-ne v1, p3, :cond_0

    return v3

    :cond_0
    sub-int/2addr p3, p2

    .line 536
    invoke-virtual {p0}, Ll/ۘܰۘ;->size()I

    move-result v1

    const/4 v4, 0x0

    if-eq p3, v1, :cond_1

    return v4

    .line 545
    :cond_1
    :goto_0
    iget p3, p0, Ll/ۘܰۘ;->᩶:I

    if-ge v2, p3, :cond_3

    iget-object p3, v0, Ll/᩹֫ᩴ;->᩸:[C

    add-int/lit8 v1, v2, 0x1

    aget-char p3, p3, v2

    add-int/lit8 v2, p2, 0x1

    aget-char p2, p1, p2

    if-eq p3, p2, :cond_2

    return v4

    :cond_2
    move p2, v2

    move v2, v1

    goto :goto_0

    :cond_3
    return v3
.end method
