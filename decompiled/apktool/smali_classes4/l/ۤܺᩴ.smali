.class public Ll/ۤܺᩴ;
.super Ll/ۛܺᩴ;
.source "UC70"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = -0x61c8864680b583e9L


# instance fields
.field public ᩶:I

.field public final ᩸:I

.field public final ᩹:Ll/ۛܺᩴ;


# direct methods
.method public constructor <init>(Ll/ۛܺᩴ;II)V
    .locals 0

    .line 567
    invoke-direct {p0}, Ll/ۛܺᩴ;-><init>()V

    .line 568
    iput-object p1, p0, Ll/ۤܺᩴ;->᩹:Ll/ۛܺᩴ;

    .line 569
    iput p2, p0, Ll/ۤܺᩴ;->᩸:I

    .line 570
    iput p3, p0, Ll/ۤܺᩴ;->᩶:I

    return-void
.end method


# virtual methods
.method public final add(J)Z
    .locals 2

    .line 582
    iget-object v0, p0, Ll/ۤܺᩴ;->᩹:Ll/ۛܺᩴ;

    iget v1, p0, Ll/ۤܺᩴ;->᩶:I

    invoke-interface {v0, v1, p1, p2}, Ll/ۖۘᩴ;->֫(IJ)V

    .line 583
    iget p1, p0, Ll/ۤܺᩴ;->᩶:I

    const/4 p2, 0x1

    add-int/2addr p1, p2

    iput p1, p0, Ll/ۤܺᩴ;->᩶:I

    return p2
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 2

    .line 598
    invoke-virtual {p0, p1}, Ll/ۛܺᩴ;->֫(I)V

    .line 599
    iget v0, p0, Ll/ۤܺᩴ;->᩶:I

    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Ll/ۤܺᩴ;->᩶:I

    .line 600
    iget v0, p0, Ll/ۤܺᩴ;->᩸:I

    add-int/2addr v0, p1

    iget-object p1, p0, Ll/ۤܺᩴ;->᩹:Ll/ۛܺᩴ;

    invoke-interface {p1, v0, p2}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 558
    check-cast p1, Ljava/util/List;

    invoke-super {p0, p1}, Ll/ۛܺᩴ;->֫(Ljava/util/List;)I

    move-result p1

    return p1
.end method

.method public getLong(I)J
    .locals 2

    .line 605
    invoke-virtual {p0, p1}, Ll/ۛܺᩴ;->ᩳ(I)V

    .line 606
    iget v0, p0, Ll/ۤܺᩴ;->᩸:I

    add-int/2addr v0, p1

    iget-object p1, p0, Ll/ۤܺᩴ;->᩹:Ll/ۛܺᩴ;

    invoke-interface {p1, v0}, Ll/ۖۘᩴ;->getLong(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    const/4 v0, 0x0

    .line 152
    invoke-virtual {p0, v0}, Ll/ۤܺᩴ;->listIterator(I)Ll/ۘۘᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final iterator()Ll/᩻ۘᩴ;
    .locals 1

    const/4 v0, 0x0

    .line 152
    invoke-virtual {p0, v0}, Ll/ۤܺᩴ;->listIterator(I)Ll/ۘۘᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final listIterator()Ljava/util/ListIterator;
    .locals 1

    const/4 v0, 0x0

    .line 152
    invoke-virtual {p0, v0}, Ll/ۤܺᩴ;->listIterator(I)Ll/ۘۘᩴ;

    move-result-object v0

    return-object v0
.end method

.method public listIterator(I)Ll/ۘۘᩴ;
    .locals 3

    .line 786
    invoke-virtual {p0, p1}, Ll/ۛܺᩴ;->֫(I)V

    .line 791
    iget-object v0, p0, Ll/ۤܺᩴ;->᩹:Ll/ۛܺᩴ;

    instance-of v1, v0, Ljava/util/RandomAccess;

    if-eqz v1, :cond_0

    new-instance v0, Ll/۫ܺᩴ;

    invoke-direct {v0, p0, p1}, Ll/۫ܺᩴ;-><init>(Ll/ۤܺᩴ;I)V

    return-object v0

    :cond_0
    new-instance v1, Ll/۬ܺᩴ;

    iget v2, p0, Ll/ۤܺᩴ;->᩸:I

    add-int/2addr p1, v2

    invoke-interface {v0, p1}, Ll/ۖۘᩴ;->listIterator(I)Ll/ۘۘᩴ;

    move-result-object p1

    invoke-direct {v1, p0, p1}, Ll/۬ܺᩴ;-><init>(Ll/ۤܺᩴ;Ll/ۘۘᩴ;)V

    return-object v1
.end method

.method public final set(IJ)J
    .locals 1

    .line 618
    invoke-virtual {p0, p1}, Ll/ۛܺᩴ;->ᩳ(I)V

    .line 619
    iget v0, p0, Ll/ۤܺᩴ;->᩸:I

    add-int/2addr v0, p1

    iget-object p1, p0, Ll/ۤܺᩴ;->᩹:Ll/ۛܺᩴ;

    invoke-interface {p1, v0, p2, p3}, Ll/ۖۘᩴ;->set(IJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final size()I
    .locals 2

    .line 624
    iget v0, p0, Ll/ۤܺᩴ;->᩶:I

    iget v1, p0, Ll/ۤܺᩴ;->᩸:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/ۤܺᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public spliterator()Ll/֨ۘᩴ;
    .locals 4

    .line 796
    iget-object v0, p0, Ll/ۤܺᩴ;->᩹:Ll/ۛܺᩴ;

    instance-of v1, v0, Ljava/util/RandomAccess;

    if-eqz v1, :cond_0

    new-instance v1, Ll/ۙܺᩴ;

    iget v2, p0, Ll/ۤܺᩴ;->᩸:I

    iget v3, p0, Ll/ۤܺᩴ;->᩶:I

    invoke-direct {v1, v0, v2, v3}, Ll/ۙܺᩴ;-><init>(Ll/ۖۘᩴ;II)V

    return-object v1

    :cond_0
    invoke-super {p0}, Ll/ۛܺᩴ;->spliterator()Ll/֨ۘᩴ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 558
    invoke-virtual {p0}, Ll/ۤܺᩴ;->spliterator()Ll/֨ۘᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(II)V
    .locals 3

    .line 636
    invoke-virtual {p0, p1}, Ll/ۛܺᩴ;->֫(I)V

    .line 637
    invoke-virtual {p0, p2}, Ll/ۛܺᩴ;->֫(I)V

    .line 638
    iget v0, p0, Ll/ۤܺᩴ;->᩸:I

    add-int v1, v0, p1

    add-int/2addr v0, p2

    iget-object v2, p0, Ll/ۤܺᩴ;->᩹:Ll/ۛܺᩴ;

    invoke-interface {v2, v1, v0}, Ll/ۖۘᩴ;->֫(II)V

    .line 639
    iget v0, p0, Ll/ۤܺᩴ;->᩶:I

    sub-int/2addr p2, p1

    sub-int/2addr v0, p2

    iput v0, p0, Ll/ۤܺᩴ;->᩶:I

    return-void
.end method

.method public final ֫(II[J)V
    .locals 1

    .line 653
    invoke-virtual {p0, p1}, Ll/ۛܺᩴ;->֫(I)V

    .line 654
    iget v0, p0, Ll/ۤܺᩴ;->᩸:I

    add-int/2addr v0, p1

    iget-object p1, p0, Ll/ۤܺᩴ;->᩹:Ll/ۛܺᩴ;

    invoke-interface {p1, v0, p2, p3}, Ll/ۖۘᩴ;->֫(II[J)V

    return-void
.end method

.method public final ֫(IJ)V
    .locals 1

    .line 590
    invoke-virtual {p0, p1}, Ll/ۛܺᩴ;->֫(I)V

    .line 591
    iget v0, p0, Ll/ۤܺᩴ;->᩸:I

    add-int/2addr v0, p1

    iget-object p1, p0, Ll/ۤܺᩴ;->᩹:Ll/ۛܺᩴ;

    invoke-interface {p1, v0, p2, p3}, Ll/ۖۘᩴ;->֫(IJ)V

    .line 592
    iget p1, p0, Ll/ۤܺᩴ;->᩶:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ۤܺᩴ;->᩶:I

    return-void
.end method

.method public final ֫([JIII)V
    .locals 2

    .line 629
    invoke-virtual {p0, p2}, Ll/ۛܺᩴ;->֫(I)V

    add-int v0, p2, p4

    .line 630
    invoke-virtual {p0}, Ll/ۤܺᩴ;->size()I

    move-result v1

    if-gt v0, v1, :cond_0

    .line 631
    iget v0, p0, Ll/ۤܺᩴ;->᩸:I

    add-int/2addr v0, p2

    iget-object p2, p0, Ll/ۤܺᩴ;->᩹:Ll/ۛܺᩴ;

    invoke-interface {p2, p1, v0, p3, p4}, Ll/ۖۘᩴ;->֫([JIII)V

    return-void

    .line 630
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "End index ("

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ") is greater than list size ("

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ۤܺᩴ;->size()I

    move-result p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ")"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(ILl/ۖۘᩴ;)Z
    .locals 0

    .line 827
    invoke-virtual {p0, p1}, Ll/ۛܺᩴ;->֫(I)V

    .line 473
    invoke-virtual {p0, p1, p2}, Ll/ۤܺᩴ;->֫(ILl/ۨۖᩴ;)Z

    move-result p1

    return p1
.end method

.method public final ֫(ILl/ۨۖᩴ;)Z
    .locals 0

    .line 821
    invoke-virtual {p0, p1}, Ll/ۛܺᩴ;->֫(I)V

    .line 822
    invoke-super {p0, p1, p2}, Ll/ۛܺᩴ;->֫(ILl/ۨۖᩴ;)Z

    move-result p1

    return p1
.end method

.method public final ܽ(I)J
    .locals 2

    .line 611
    invoke-virtual {p0, p1}, Ll/ۛܺᩴ;->ᩳ(I)V

    .line 612
    iget v0, p0, Ll/ۤܺᩴ;->᩶:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ۤܺᩴ;->᩶:I

    .line 613
    iget v0, p0, Ll/ۤܺᩴ;->᩸:I

    add-int/2addr v0, p1

    iget-object p1, p0, Ll/ۤܺᩴ;->᩹:Ll/ۛܺᩴ;

    invoke-interface {p1, v0}, Ll/ۖۘᩴ;->ܽ(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ᩷(J)Z
    .locals 1

    .line 811
    invoke-virtual {p0, p1, p2}, Ll/ۛܺᩴ;->᩻(J)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    return p1

    .line 813
    :cond_0
    iget p2, p0, Ll/ۤܺᩴ;->᩶:I

    const/4 v0, 0x1

    sub-int/2addr p2, v0

    iput p2, p0, Ll/ۤܺᩴ;->᩶:I

    .line 814
    iget p2, p0, Ll/ۤܺᩴ;->᩸:I

    add-int/2addr p2, p1

    iget-object p1, p0, Ll/ۤܺᩴ;->᩹:Ll/ۛܺᩴ;

    invoke-interface {p1, p2}, Ll/ۖۘᩴ;->ܽ(I)J

    return v0
.end method
