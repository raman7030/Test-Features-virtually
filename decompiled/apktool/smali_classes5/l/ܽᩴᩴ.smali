.class public Ll/ܽᩴᩴ;
.super Ll/ᩳᩴᩴ;
.source "J1MI"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = -0x61c8864680b583e9L


# instance fields
.field public ᩶:I

.field public final ᩸:I

.field public final ᩹:Ll/ᩳᩴᩴ;


# direct methods
.method public constructor <init>(Ll/ᩳᩴᩴ;II)V
    .locals 0

    .line 516
    invoke-direct {p0}, Ll/ᩳᩴᩴ;-><init>()V

    .line 517
    iput-object p1, p0, Ll/ܽᩴᩴ;->᩹:Ll/ᩳᩴᩴ;

    .line 518
    iput p2, p0, Ll/ܽᩴᩴ;->᩸:I

    .line 519
    iput p3, p0, Ll/ܽᩴᩴ;->᩶:I

    return-void
.end method


# virtual methods
.method public final add(ILjava/lang/Object;)V
    .locals 1

    .line 539
    invoke-virtual {p0, p1}, Ll/ᩳᩴᩴ;->֫(I)V

    .line 540
    iget v0, p0, Ll/ܽᩴᩴ;->᩸:I

    add-int/2addr v0, p1

    iget-object p1, p0, Ll/ܽᩴᩴ;->᩹:Ll/ᩳᩴᩴ;

    invoke-interface {p1, v0, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 541
    iget p1, p0, Ll/ܽᩴᩴ;->᩶:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ܽᩴᩴ;->᩶:I

    return-void
.end method

.method public final add(Ljava/lang/Object;)Z
    .locals 2

    .line 531
    iget-object v0, p0, Ll/ܽᩴᩴ;->᩹:Ll/ᩳᩴᩴ;

    iget v1, p0, Ll/ܽᩴᩴ;->᩶:I

    invoke-interface {v0, v1, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 532
    iget p1, p0, Ll/ܽᩴᩴ;->᩶:I

    const/4 v0, 0x1

    add-int/2addr p1, v0

    iput p1, p0, Ll/ܽᩴᩴ;->᩶:I

    return v0
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 2

    .line 547
    invoke-virtual {p0, p1}, Ll/ᩳᩴᩴ;->֫(I)V

    .line 548
    iget v0, p0, Ll/ܽᩴᩴ;->᩶:I

    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Ll/ܽᩴᩴ;->᩶:I

    .line 549
    iget v0, p0, Ll/ܽᩴᩴ;->᩸:I

    add-int/2addr v0, p1

    iget-object p1, p0, Ll/ܽᩴᩴ;->᩹:Ll/ᩳᩴᩴ;

    invoke-interface {p1, v0, p2}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 507
    check-cast p1, Ljava/util/List;

    invoke-super {p0, p1}, Ll/ᩳᩴᩴ;->֫(Ljava/util/List;)I

    move-result p1

    return p1
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1

    .line 554
    invoke-virtual {p0, p1}, Ll/ᩳᩴᩴ;->ᩳ(I)V

    .line 555
    iget v0, p0, Ll/ܽᩴᩴ;->᩸:I

    add-int/2addr v0, p1

    iget-object p1, p0, Ll/ܽᩴᩴ;->᩹:Ll/ᩳᩴᩴ;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    const/4 v0, 0x0

    .line 151
    invoke-virtual {p0, v0}, Ll/ܽᩴᩴ;->listIterator(I)Ll/ۧۚᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final iterator()Ll/۫֡ᩴ;
    .locals 1

    const/4 v0, 0x0

    .line 151
    invoke-virtual {p0, v0}, Ll/ܽᩴᩴ;->listIterator(I)Ll/ۧۚᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final listIterator()Ljava/util/ListIterator;
    .locals 1

    const/4 v0, 0x0

    .line 151
    invoke-virtual {p0, v0}, Ll/ܽᩴᩴ;->listIterator(I)Ll/ۧۚᩴ;

    move-result-object v0

    return-object v0
.end method

.method public listIterator(I)Ll/ۧۚᩴ;
    .locals 3

    .line 735
    invoke-virtual {p0, p1}, Ll/ᩳᩴᩴ;->֫(I)V

    .line 740
    iget-object v0, p0, Ll/ܽᩴᩴ;->᩹:Ll/ᩳᩴᩴ;

    instance-of v1, v0, Ljava/util/RandomAccess;

    if-eqz v1, :cond_0

    new-instance v0, Ll/ۧᩴᩴ;

    invoke-direct {v0, p0, p1}, Ll/ۧᩴᩴ;-><init>(Ll/ܽᩴᩴ;I)V

    return-object v0

    :cond_0
    new-instance v1, Ll/֫ᩴᩴ;

    iget v2, p0, Ll/ܽᩴᩴ;->᩸:I

    add-int/2addr p1, v2

    invoke-interface {v0, p1}, Ll/֫ۚᩴ;->listIterator(I)Ll/ۧۚᩴ;

    move-result-object p1

    invoke-direct {v1, p0, p1}, Ll/֫ᩴᩴ;-><init>(Ll/ܽᩴᩴ;Ll/ۧۚᩴ;)V

    return-object v1
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 1

    .line 560
    invoke-virtual {p0, p1}, Ll/ᩳᩴᩴ;->ᩳ(I)V

    .line 561
    iget v0, p0, Ll/ܽᩴᩴ;->᩶:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ܽᩴᩴ;->᩶:I

    .line 562
    iget v0, p0, Ll/ܽᩴᩴ;->᩸:I

    add-int/2addr v0, p1

    iget-object p1, p0, Ll/ܽᩴᩴ;->᩹:Ll/ᩳᩴᩴ;

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 567
    invoke-virtual {p0, p1}, Ll/ᩳᩴᩴ;->ᩳ(I)V

    .line 568
    iget v0, p0, Ll/ܽᩴᩴ;->᩸:I

    add-int/2addr v0, p1

    iget-object p1, p0, Ll/ܽᩴᩴ;->᩹:Ll/ᩳᩴᩴ;

    invoke-interface {p1, v0, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 2

    .line 573
    iget v0, p0, Ll/ܽᩴᩴ;->᩶:I

    iget v1, p0, Ll/ܽᩴᩴ;->᩸:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/ܽᩴᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public spliterator()Ll/۠ۚᩴ;
    .locals 4

    .line 745
    iget-object v0, p0, Ll/ܽᩴᩴ;->᩹:Ll/ᩳᩴᩴ;

    instance-of v1, v0, Ljava/util/RandomAccess;

    if-eqz v1, :cond_0

    new-instance v1, Ll/ܰۘᩴ;

    iget v2, p0, Ll/ܽᩴᩴ;->᩸:I

    iget v3, p0, Ll/ܽᩴᩴ;->᩶:I

    invoke-direct {v1, v0, v2, v3}, Ll/ܰۘᩴ;-><init>(Ll/֫ۚᩴ;II)V

    return-object v1

    :cond_0
    invoke-super {p0}, Ll/ᩳᩴᩴ;->spliterator()Ll/۠ۚᩴ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 507
    invoke-virtual {p0}, Ll/ܽᩴᩴ;->spliterator()Ll/۠ۚᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(II)V
    .locals 3

    .line 585
    invoke-virtual {p0, p1}, Ll/ᩳᩴᩴ;->֫(I)V

    .line 586
    invoke-virtual {p0, p2}, Ll/ᩳᩴᩴ;->֫(I)V

    .line 587
    iget v0, p0, Ll/ܽᩴᩴ;->᩸:I

    add-int v1, v0, p1

    add-int/2addr v0, p2

    iget-object v2, p0, Ll/ܽᩴᩴ;->᩹:Ll/ᩳᩴᩴ;

    invoke-interface {v2, v1, v0}, Ll/֫ۚᩴ;->֫(II)V

    .line 588
    iget v0, p0, Ll/ܽᩴᩴ;->᩶:I

    sub-int/2addr p2, p1

    sub-int/2addr v0, p2

    iput v0, p0, Ll/ܽᩴᩴ;->᩶:I

    return-void
.end method

.method public final ֫(III[Ljava/lang/Object;)V
    .locals 2

    .line 578
    invoke-virtual {p0, p1}, Ll/ᩳᩴᩴ;->֫(I)V

    add-int v0, p1, p3

    .line 579
    invoke-virtual {p0}, Ll/ܽᩴᩴ;->size()I

    move-result v1

    if-gt v0, v1, :cond_0

    .line 580
    iget v0, p0, Ll/ܽᩴᩴ;->᩸:I

    add-int/2addr v0, p1

    iget-object p1, p0, Ll/ܽᩴᩴ;->᩹:Ll/ᩳᩴᩴ;

    invoke-interface {p1, v0, p2, p3, p4}, Ll/֫ۚᩴ;->֫(III[Ljava/lang/Object;)V

    return-void

    .line 579
    :cond_0
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance p4, Ljava/lang/StringBuilder;

    const-string v0, "End index ("

    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") is greater than list size ("

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ܽᩴᩴ;->size()I

    move-result p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final ֫(II[Ljava/lang/Object;)V
    .locals 1

    .line 602
    invoke-virtual {p0, p1}, Ll/ᩳᩴᩴ;->֫(I)V

    .line 603
    iget v0, p0, Ll/ܽᩴᩴ;->᩸:I

    add-int/2addr v0, p1

    iget-object p1, p0, Ll/ܽᩴᩴ;->᩹:Ll/ᩳᩴᩴ;

    invoke-interface {p1, v0, p2, p3}, Ll/֫ۚᩴ;->֫(II[Ljava/lang/Object;)V

    return-void
.end method
