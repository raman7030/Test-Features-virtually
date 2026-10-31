.class public final Ll/ۡۢᩴ;
.super Ll/ۙܿᩴ;
.source "N1QM"


# static fields
.field public static final serialVersionUID:J = -0x2c34327c29b70228L


# instance fields
.field public final synthetic ۙ:Ll/ܺۢᩴ;


# direct methods
.method public constructor <init>(Ll/ܺۢᩴ;II)V
    .locals 0

    .line 445
    iput-object p1, p0, Ll/ۡۢᩴ;->ۙ:Ll/ܺۢᩴ;

    .line 836
    invoke-direct {p0, p1, p2, p3}, Ll/۫ܿᩴ;-><init>(Ll/ۤܿᩴ;II)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 442
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Ll/ۡۢᩴ;->֫(Ljava/util/List;)I

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

    .line 587
    :cond_1
    instance-of v1, p1, Ljava/util/List;

    if-nez v1, :cond_2

    return v0

    .line 588
    :cond_2
    instance-of v1, p1, Ll/ܺۢᩴ;

    if-eqz v1, :cond_3

    .line 590
    check-cast p1, Ll/ܺۢᩴ;

    .line 591
    iget-object v1, p1, Ll/ܺۢᩴ;->᩸:[I

    .line 395
    iget p1, p1, Ll/ܺۢᩴ;->᩹:I

    .line 591
    invoke-virtual {p0, v0, p1, v1}, Ll/ۡۢᩴ;->ᩳ(II[I)Z

    move-result p1

    return p1

    .line 593
    :cond_3
    instance-of v0, p1, Ll/ۡۢᩴ;

    if-eqz v0, :cond_4

    .line 595
    check-cast p1, Ll/ۡۢᩴ;

    .line 453
    iget-object v0, p1, Ll/ۡۢᩴ;->ۙ:Ll/ܺۢᩴ;

    iget-object v0, v0, Ll/ܺۢᩴ;->᩸:[I

    .line 596
    iget v1, p1, Ll/۫ܿᩴ;->᩸:I

    iget p1, p1, Ll/۫ܿᩴ;->᩶:I

    invoke-virtual {p0, v1, p1, v0}, Ll/ۡۢᩴ;->ᩳ(II[I)Z

    move-result p1

    return p1

    .line 598
    :cond_4
    invoke-super {p0, p1}, Ll/ۤܿᩴ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final getInt(I)I
    .locals 2

    .line 458
    invoke-virtual {p0, p1}, Ll/ۤܿᩴ;->ᩳ(I)V

    .line 459
    iget-object v0, p0, Ll/ۡۢᩴ;->ۙ:Ll/ܺۢᩴ;

    iget-object v0, v0, Ll/ܺۢᩴ;->᩸:[I

    iget v1, p0, Ll/۫ܿᩴ;->᩸:I

    add-int/2addr p1, v1

    aget p1, v0, p1

    return p1
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 1

    .line 518
    new-instance v0, Ll/᩷ۢᩴ;

    invoke-direct {v0, p0, p1}, Ll/᩷ۢᩴ;-><init>(Ll/ۡۢᩴ;I)V

    return-object v0
.end method

.method public final listIterator(I)Ll/ܶۡᩴ;
    .locals 1

    .line 518
    new-instance v0, Ll/᩷ۢᩴ;

    invoke-direct {v0, p0, p1}, Ll/᩷ۢᩴ;-><init>(Ll/ۡۢᩴ;I)V

    return-object v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/ۡۢᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 565
    new-instance v0, Ll/ۢۢᩴ;

    invoke-direct {v0, p0}, Ll/ۢۢᩴ;-><init>(Ll/ۡۢᩴ;)V

    return-object v0
.end method

.method public final spliterator()Ll/ܽܺᩴ;
    .locals 1

    .line 565
    new-instance v0, Ll/ۢۢᩴ;

    invoke-direct {v0, p0}, Ll/ۢۢᩴ;-><init>(Ll/ۡۢᩴ;)V

    return-object v0
.end method

.method public final ֫(Ljava/util/List;)I
    .locals 2

    .line 616
    instance-of v0, p1, Ll/ܺۢᩴ;

    if-eqz v0, :cond_0

    .line 618
    check-cast p1, Ll/ܺۢᩴ;

    .line 619
    iget-object v0, p1, Ll/ܺۢᩴ;->᩸:[I

    const/4 v1, 0x0

    .line 395
    iget p1, p1, Ll/ܺۢᩴ;->᩹:I

    .line 619
    invoke-virtual {p0, v1, p1, v0}, Ll/ۡۢᩴ;->ܽ(II[I)I

    move-result p1

    return p1

    .line 621
    :cond_0
    instance-of v0, p1, Ll/ۡۢᩴ;

    if-eqz v0, :cond_1

    .line 623
    check-cast p1, Ll/ۡۢᩴ;

    .line 453
    iget-object v0, p1, Ll/ۡۢᩴ;->ۙ:Ll/ܺۢᩴ;

    iget-object v0, v0, Ll/ܺۢᩴ;->᩸:[I

    .line 624
    iget v1, p1, Ll/۫ܿᩴ;->᩸:I

    iget p1, p1, Ll/۫ܿᩴ;->᩶:I

    invoke-virtual {p0, v1, p1, v0}, Ll/ۡۢᩴ;->ܽ(II[I)I

    move-result p1

    return p1

    .line 626
    :cond_1
    invoke-super {p0, p1}, Ll/ۤܿᩴ;->֫(Ljava/util/List;)I

    move-result p1

    return p1
.end method

.method public final ܽ(II[I)I
    .locals 5

    .line 602
    iget-object v0, p0, Ll/ۡۢᩴ;->ۙ:Ll/ܺۢᩴ;

    iget-object v1, v0, Ll/ܺۢᩴ;->᩸:[I

    const/4 v2, 0x0

    iget v3, p0, Ll/۫ܿᩴ;->᩸:I

    if-ne v1, p3, :cond_0

    if-ne v3, p1, :cond_0

    iget v1, p0, Ll/۫ܿᩴ;->᩶:I

    if-ne v1, p2, :cond_0

    return v2

    .line 606
    :cond_0
    :goto_0
    iget v1, p0, Ll/۫ܿᩴ;->᩶:I

    if-ge v3, v1, :cond_2

    if-ge v3, p2, :cond_2

    .line 607
    iget-object v1, v0, Ll/ܺۢᩴ;->᩸:[I

    aget v1, v1, v3

    .line 608
    aget v4, p3, p1

    .line 609
    invoke-static {v1, v4}, Ljava/lang/Integer;->compare(II)I

    move-result v1

    if-eqz v1, :cond_1

    return v1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    if-ge v3, p2, :cond_3

    const/4 p1, -0x1

    return p1

    :cond_3
    if-ge v3, v1, :cond_4

    const/4 p1, 0x1

    return p1

    :cond_4
    return v2
.end method

.method public final ᩳ(II[I)Z
    .locals 5

    .line 569
    iget-object v0, p0, Ll/ۡۢᩴ;->ۙ:Ll/ܺۢᩴ;

    iget-object v1, v0, Ll/ܺۢᩴ;->᩸:[I

    iget v2, p0, Ll/۫ܿᩴ;->᩸:I

    const/4 v3, 0x1

    if-ne v1, p3, :cond_0

    if-ne v2, p1, :cond_0

    iget v1, p0, Ll/۫ܿᩴ;->᩶:I

    if-ne v1, p2, :cond_0

    return v3

    :cond_0
    sub-int/2addr p2, p1

    .line 570
    invoke-virtual {p0}, Ll/۫ܿᩴ;->size()I

    move-result v1

    const/4 v4, 0x0

    if-eq p2, v1, :cond_1

    return v4

    .line 579
    :cond_1
    :goto_0
    iget p2, p0, Ll/۫ܿᩴ;->᩶:I

    if-ge v2, p2, :cond_3

    iget-object p2, v0, Ll/ܺۢᩴ;->᩸:[I

    add-int/lit8 v1, v2, 0x1

    aget p2, p2, v2

    add-int/lit8 v2, p1, 0x1

    aget p1, p3, p1

    if-eq p2, p1, :cond_2

    return v4

    :cond_2
    move p1, v2

    move v2, v1

    goto :goto_0

    :cond_3
    return v3
.end method
