.class public final Ll/ܽ۬ܺ;
.super Ll/ܳ۬ܺ;
.source "Y4VB"


# instance fields
.field public final transient ۙ:Ll/ܳ۬ܺ;


# direct methods
.method public constructor <init>(Ll/ܳ۬ܺ;)V
    .locals 0

    .line 606
    invoke-direct {p0}, Ll/ܳ۬ܺ;-><init>()V

    .line 607
    iput-object p1, p0, Ll/ܽ۬ܺ;->ۙ:Ll/ܳ۬ܺ;

    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 625
    iget-object v0, p0, Ll/ܽ۬ܺ;->ۙ:Ll/ܳ۬ܺ;

    invoke-virtual {v0, p1}, Ll/ܳ۬ܺ;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    .line 654
    iget-object v0, p0, Ll/ܽ۬ܺ;->ۙ:Ll/ܳ۬ܺ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    .line 648
    invoke-static {p1, v1}, Ll/ۘܶܺ;->֫(II)V

    .line 654
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    sub-int/2addr v1, p1

    .line 649
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final indexOf(Ljava/lang/Object;)I
    .locals 1

    .line 630
    iget-object v0, p0, Ll/ܽ۬ܺ;->ۙ:Ll/ܳ۬ܺ;

    invoke-virtual {v0, p1}, Ll/ܳ۬ܺ;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    .line 654
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    sub-int/2addr v0, p1

    return v0

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    const/4 v0, 0x0

    .line 375
    invoke-virtual {p0, v0}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object v0

    return-object v0
.end method

.method public final lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    .line 636
    iget-object v0, p0, Ll/ܽ۬ܺ;->ۙ:Ll/ܳ۬ܺ;

    invoke-virtual {v0, p1}, Ll/ܳ۬ܺ;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    .line 654
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    sub-int/2addr v0, p1

    return v0

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final listIterator()Ljava/util/ListIterator;
    .locals 1

    const/4 v0, 0x0

    .line 375
    invoke-virtual {p0, v0}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 0

    .line 603
    invoke-virtual {p0, p1}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 654
    iget-object v0, p0, Ll/ܽ۬ܺ;->ۙ:Ll/ܳ۬ܺ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    return v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    .line 603
    invoke-virtual {p0, p1, p2}, Ll/ܽ۬ܺ;->subList(II)Ll/ܳ۬ܺ;

    move-result-object p1

    return-object p1
.end method

.method public final subList(II)Ll/ܳ۬ܺ;
    .locals 2

    .line 654
    iget-object v0, p0, Ll/ܽ۬ܺ;->ۙ:Ll/ܳ۬ܺ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    .line 642
    invoke-static {p1, p2, v1}, Ll/ۘܶܺ;->֫(III)V

    .line 654
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    sub-int/2addr v1, p2

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result p2

    sub-int/2addr p2, p1

    .line 643
    invoke-virtual {v0, v1, p2}, Ll/ܳ۬ܺ;->subList(II)Ll/ܳ۬ܺ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܳ۬ܺ;->᩻()Ll/ܳ۬ܺ;

    move-result-object p1

    return-object p1
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 1

    .line 668
    invoke-super {p0}, Ll/ܳ۬ܺ;->writeReplace()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()Z
    .locals 1

    .line 659
    iget-object v0, p0, Ll/ܽ۬ܺ;->ۙ:Ll/ܳ۬ܺ;

    invoke-virtual {v0}, Ll/᩺ۗܺ;->ܳ()Z

    move-result v0

    return v0
.end method

.method public final ᩻()Ll/ܳ۬ܺ;
    .locals 1

    .line 620
    iget-object v0, p0, Ll/ܽ۬ܺ;->ۙ:Ll/ܳ۬ܺ;

    return-object v0
.end method
