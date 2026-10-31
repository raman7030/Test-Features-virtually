.class public Ll/֨ܽᩴ;
.super Ll/ܶܽᩴ;
.source "H32"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = -0x61c8864680b583e9L


# instance fields
.field public ᩶:I

.field public final ᩸:I

.field public final ᩹:Ll/ܶܽᩴ;


# direct methods
.method public constructor <init>(Ll/ܶܽᩴ;II)V
    .locals 0

    .line 556
    invoke-direct {p0}, Ll/ܶܽᩴ;-><init>()V

    .line 557
    iput-object p1, p0, Ll/֨ܽᩴ;->᩹:Ll/ܶܽᩴ;

    .line 558
    iput p2, p0, Ll/֨ܽᩴ;->᩸:I

    .line 559
    iput p3, p0, Ll/֨ܽᩴ;->᩶:I

    return-void
.end method


# virtual methods
.method public final add(F)Z
    .locals 2

    .line 571
    iget-object v0, p0, Ll/֨ܽᩴ;->᩹:Ll/ܶܽᩴ;

    iget v1, p0, Ll/֨ܽᩴ;->᩶:I

    invoke-interface {v0, p1, v1}, Ll/ۙᩳᩴ;->ۧ(FI)V

    .line 572
    iget p1, p0, Ll/֨ܽᩴ;->᩶:I

    const/4 v0, 0x1

    add-int/2addr p1, v0

    iput p1, p0, Ll/֨ܽᩴ;->᩶:I

    return v0
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 2

    .line 587
    invoke-virtual {p0, p1}, Ll/ܶܽᩴ;->֫(I)V

    .line 588
    iget v0, p0, Ll/֨ܽᩴ;->᩶:I

    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Ll/֨ܽᩴ;->᩶:I

    .line 589
    iget v0, p0, Ll/֨ܽᩴ;->᩸:I

    add-int/2addr v0, p1

    iget-object p1, p0, Ll/֨ܽᩴ;->᩹:Ll/ܶܽᩴ;

    invoke-interface {p1, v0, p2}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 547
    check-cast p1, Ljava/util/List;

    invoke-super {p0, p1}, Ll/ܶܽᩴ;->֫(Ljava/util/List;)I

    move-result p1

    return p1
.end method

.method public getFloat(I)F
    .locals 1

    .line 594
    invoke-virtual {p0, p1}, Ll/ܶܽᩴ;->ᩳ(I)V

    .line 595
    iget v0, p0, Ll/֨ܽᩴ;->᩸:I

    add-int/2addr v0, p1

    iget-object p1, p0, Ll/֨ܽᩴ;->᩹:Ll/ܶܽᩴ;

    invoke-interface {p1, v0}, Ll/ۙᩳᩴ;->getFloat(I)F

    move-result p1

    return p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    const/4 v0, 0x0

    .line 152
    invoke-virtual {p0, v0}, Ll/֨ܽᩴ;->listIterator(I)Ll/ۗᩳᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final iterator()Ll/֨ᩳᩴ;
    .locals 1

    const/4 v0, 0x0

    .line 152
    invoke-virtual {p0, v0}, Ll/֨ܽᩴ;->listIterator(I)Ll/ۗᩳᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final listIterator()Ljava/util/ListIterator;
    .locals 1

    const/4 v0, 0x0

    .line 152
    invoke-virtual {p0, v0}, Ll/֨ܽᩴ;->listIterator(I)Ll/ۗᩳᩴ;

    move-result-object v0

    return-object v0
.end method

.method public listIterator(I)Ll/ۗᩳᩴ;
    .locals 3

    .line 775
    invoke-virtual {p0, p1}, Ll/ܶܽᩴ;->֫(I)V

    .line 780
    iget-object v0, p0, Ll/֨ܽᩴ;->᩹:Ll/ܶܽᩴ;

    instance-of v1, v0, Ljava/util/RandomAccess;

    if-eqz v1, :cond_0

    new-instance v0, Ll/ۚܽᩴ;

    invoke-direct {v0, p0, p1}, Ll/ۚܽᩴ;-><init>(Ll/֨ܽᩴ;I)V

    return-object v0

    :cond_0
    new-instance v1, Ll/֡ܽᩴ;

    iget v2, p0, Ll/֨ܽᩴ;->᩸:I

    add-int/2addr p1, v2

    invoke-interface {v0, p1}, Ll/ۙᩳᩴ;->listIterator(I)Ll/ۗᩳᩴ;

    move-result-object p1

    invoke-direct {v1, p0, p1}, Ll/֡ܽᩴ;-><init>(Ll/֨ܽᩴ;Ll/ۗᩳᩴ;)V

    return-object v1
.end method

.method public final size()I
    .locals 2

    .line 613
    iget v0, p0, Ll/֨ܽᩴ;->᩶:I

    iget v1, p0, Ll/֨ܽᩴ;->᩸:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/֨ܽᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 547
    invoke-virtual {p0}, Ll/֨ܽᩴ;->spliterator()Ll/ܽܿᩴ;

    move-result-object v0

    return-object v0
.end method

.method public spliterator()Ll/ܽܿᩴ;
    .locals 4

    .line 785
    iget-object v0, p0, Ll/֨ܽᩴ;->᩹:Ll/ܶܽᩴ;

    instance-of v1, v0, Ljava/util/RandomAccess;

    if-eqz v1, :cond_0

    new-instance v1, Ll/۠ܽᩴ;

    iget v2, p0, Ll/֨ܽᩴ;->᩸:I

    iget v3, p0, Ll/֨ܽᩴ;->᩶:I

    invoke-direct {v1, v0, v2, v3}, Ll/۠ܽᩴ;-><init>(Ll/ۙᩳᩴ;II)V

    return-object v1

    :cond_0
    invoke-super {p0}, Ll/ܶܽᩴ;->spliterator()Ll/ܽܿᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(FI)F
    .locals 1

    .line 607
    invoke-virtual {p0, p2}, Ll/ܶܽᩴ;->ᩳ(I)V

    .line 608
    iget v0, p0, Ll/֨ܽᩴ;->᩸:I

    add-int/2addr v0, p2

    iget-object p2, p0, Ll/֨ܽᩴ;->᩹:Ll/ܶܽᩴ;

    invoke-interface {p2, p1, v0}, Ll/ۙᩳᩴ;->֫(FI)F

    move-result p1

    return p1
.end method

.method public final ֫(II)V
    .locals 3

    .line 625
    invoke-virtual {p0, p1}, Ll/ܶܽᩴ;->֫(I)V

    .line 626
    invoke-virtual {p0, p2}, Ll/ܶܽᩴ;->֫(I)V

    .line 627
    iget v0, p0, Ll/֨ܽᩴ;->᩸:I

    add-int v1, v0, p1

    add-int/2addr v0, p2

    iget-object v2, p0, Ll/֨ܽᩴ;->᩹:Ll/ܶܽᩴ;

    invoke-interface {v2, v1, v0}, Ll/ۙᩳᩴ;->֫(II)V

    .line 628
    iget v0, p0, Ll/֨ܽᩴ;->᩶:I

    sub-int/2addr p2, p1

    sub-int/2addr v0, p2

    iput v0, p0, Ll/֨ܽᩴ;->᩶:I

    return-void
.end method

.method public final ֫(III[F)V
    .locals 2

    .line 618
    invoke-virtual {p0, p1}, Ll/ܶܽᩴ;->֫(I)V

    add-int v0, p1, p3

    .line 619
    invoke-virtual {p0}, Ll/֨ܽᩴ;->size()I

    move-result v1

    if-gt v0, v1, :cond_0

    .line 620
    iget v0, p0, Ll/֨ܽᩴ;->᩸:I

    add-int/2addr v0, p1

    iget-object p1, p0, Ll/֨ܽᩴ;->᩹:Ll/ܶܽᩴ;

    invoke-interface {p1, v0, p2, p3, p4}, Ll/ۙᩳᩴ;->֫(III[F)V

    return-void

    .line 619
    :cond_0
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance p4, Ljava/lang/StringBuilder;

    const-string v0, "End index ("

    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") is greater than list size ("

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/֨ܽᩴ;->size()I

    move-result p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final ֫(II[F)V
    .locals 1

    .line 642
    invoke-virtual {p0, p1}, Ll/ܶܽᩴ;->֫(I)V

    .line 643
    iget v0, p0, Ll/֨ܽᩴ;->᩸:I

    add-int/2addr v0, p1

    iget-object p1, p0, Ll/֨ܽᩴ;->᩹:Ll/ܶܽᩴ;

    invoke-interface {p1, v0, p2, p3}, Ll/ۙᩳᩴ;->֫(II[F)V

    return-void
.end method

.method public final ֫(ILl/ۧᩳᩴ;)Z
    .locals 0

    .line 810
    invoke-virtual {p0, p1}, Ll/ܶܽᩴ;->֫(I)V

    .line 811
    invoke-super {p0, p1, p2}, Ll/ܶܽᩴ;->֫(ILl/ۧᩳᩴ;)Z

    move-result p1

    return p1
.end method

.method public final ۧ(FI)V
    .locals 1

    .line 579
    invoke-virtual {p0, p2}, Ll/ܶܽᩴ;->֫(I)V

    .line 580
    iget v0, p0, Ll/֨ܽᩴ;->᩸:I

    add-int/2addr v0, p2

    iget-object p2, p0, Ll/֨ܽᩴ;->᩹:Ll/ܶܽᩴ;

    invoke-interface {p2, p1, v0}, Ll/ۙᩳᩴ;->ۧ(FI)V

    .line 581
    iget p1, p0, Ll/֨ܽᩴ;->᩶:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/֨ܽᩴ;->᩶:I

    return-void
.end method

.method public final ܺ(I)F
    .locals 1

    .line 600
    invoke-virtual {p0, p1}, Ll/ܶܽᩴ;->ᩳ(I)V

    .line 601
    iget v0, p0, Ll/֨ܽᩴ;->᩶:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/֨ܽᩴ;->᩶:I

    .line 602
    iget v0, p0, Ll/֨ܽᩴ;->᩸:I

    add-int/2addr v0, p1

    iget-object p1, p0, Ll/֨ܽᩴ;->᩹:Ll/ܶܽᩴ;

    invoke-interface {p1, v0}, Ll/ۙᩳᩴ;->ܺ(I)F

    move-result p1

    return p1
.end method

.method public final ܿ(F)Z
    .locals 2

    .line 800
    invoke-virtual {p0, p1}, Ll/ܶܽᩴ;->ᩳ(F)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 802
    :cond_0
    iget v0, p0, Ll/֨ܽᩴ;->᩶:I

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iput v0, p0, Ll/֨ܽᩴ;->᩶:I

    .line 803
    iget v0, p0, Ll/֨ܽᩴ;->᩸:I

    add-int/2addr v0, p1

    iget-object p1, p0, Ll/֨ܽᩴ;->᩹:Ll/ܶܽᩴ;

    invoke-interface {p1, v0}, Ll/ۙᩳᩴ;->ܺ(I)F

    return v1
.end method
