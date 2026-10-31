.class public Ll/ۧۙܺ;
.super Ll/۟᩶ܺ;
.source "O3K3"

# interfaces
.implements Ljava/util/List;


# instance fields
.field public final synthetic ۬:Ll/ܽۙܺ;


# direct methods
.method public constructor <init>(Ll/ܽۙܺ;Ljava/lang/Object;Ljava/util/List;Ll/۟᩶ܺ;)V
    .locals 0

    .line 762
    iput-object p1, p0, Ll/ۧۙܺ;->۬:Ll/ܽۙܺ;

    .line 763
    invoke-direct {p0, p1, p2, p3, p4}, Ll/۟᩶ܺ;-><init>(Ll/ܽۙܺ;Ljava/lang/Object;Ljava/util/List;Ll/۟᩶ܺ;)V

    return-void
.end method


# virtual methods
.method public final add(ILjava/lang/Object;)V
    .locals 2

    .line 803
    invoke-virtual {p0}, Ll/۟᩶ܺ;->ܽ()V

    .line 431
    iget-object v0, p0, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    .line 804
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    .line 431
    iget-object v1, p0, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    .line 767
    check-cast v1, Ljava/util/List;

    .line 805
    invoke-interface {v1, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 806
    iget-object p1, p0, Ll/ۧۙܺ;->۬:Ll/ܽۙܺ;

    invoke-static {p1}, Ll/ܽۙܺ;->ۧ(Ll/ܽۙܺ;)V

    if-eqz v0, :cond_0

    .line 808
    invoke-virtual {p0}, Ll/۟᩶ܺ;->ۧ()V

    :cond_0
    return-void
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 2

    .line 772
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 775
    :cond_0
    invoke-virtual {p0}, Ll/۟᩶ܺ;->size()I

    move-result v0

    .line 431
    iget-object v1, p0, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    .line 767
    check-cast v1, Ljava/util/List;

    .line 776
    invoke-interface {v1, p1, p2}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 431
    iget-object p2, p0, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    .line 778
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result p2

    .line 779
    iget-object v1, p0, Ll/ۧۙܺ;->۬:Ll/ܽۙܺ;

    sub-int/2addr p2, v0

    invoke-static {v1, p2}, Ll/ܽۙܺ;->֫(Ll/ܽۙܺ;I)V

    if-nez v0, :cond_1

    .line 781
    invoke-virtual {p0}, Ll/۟᩶ܺ;->ۧ()V

    :cond_1
    return p1
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    .line 790
    invoke-virtual {p0}, Ll/۟᩶ܺ;->ܽ()V

    .line 431
    iget-object v0, p0, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    .line 767
    check-cast v0, Ljava/util/List;

    .line 791
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final indexOf(Ljava/lang/Object;)I
    .locals 1

    .line 824
    invoke-virtual {p0}, Ll/۟᩶ܺ;->ܽ()V

    .line 431
    iget-object v0, p0, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    .line 767
    check-cast v0, Ljava/util/List;

    .line 825
    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    .line 830
    invoke-virtual {p0}, Ll/۟᩶ܺ;->ܽ()V

    .line 431
    iget-object v0, p0, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    .line 767
    check-cast v0, Ljava/util/List;

    .line 831
    invoke-interface {v0, p1}, Ljava/util/List;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final listIterator()Ljava/util/ListIterator;
    .locals 1

    .line 836
    invoke-virtual {p0}, Ll/۟᩶ܺ;->ܽ()V

    .line 837
    new-instance v0, Ll/֫ۙܺ;

    invoke-direct {v0, p0}, Ll/֫ۙܺ;-><init>(Ll/ۧۙܺ;)V

    return-object v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 1

    .line 842
    invoke-virtual {p0}, Ll/۟᩶ܺ;->ܽ()V

    .line 843
    new-instance v0, Ll/֫ۙܺ;

    invoke-direct {v0, p0, p1}, Ll/֫ۙܺ;-><init>(Ll/ۧۙܺ;I)V

    return-object v0
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 1

    .line 815
    invoke-virtual {p0}, Ll/۟᩶ܺ;->ܽ()V

    .line 431
    iget-object v0, p0, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    .line 767
    check-cast v0, Ljava/util/List;

    .line 816
    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p1

    .line 817
    iget-object v0, p0, Ll/ۧۙܺ;->۬:Ll/ܽۙܺ;

    invoke-static {v0}, Ll/ܽۙܺ;->ܽ(Ll/ܽۙܺ;)V

    .line 818
    invoke-virtual {p0}, Ll/۟᩶ܺ;->ᩳ()V

    return-object p1
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 797
    invoke-virtual {p0}, Ll/۟᩶ܺ;->ܽ()V

    .line 431
    iget-object v0, p0, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    .line 767
    check-cast v0, Ljava/util/List;

    .line 798
    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final subList(II)Ljava/util/List;
    .locals 3

    .line 848
    invoke-virtual {p0}, Ll/۟᩶ܺ;->ܽ()V

    .line 431
    iget-object v0, p0, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    .line 767
    check-cast v0, Ljava/util/List;

    .line 851
    invoke-interface {v0, p1, p2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    .line 852
    iget-object p2, p0, Ll/۟᩶ܺ;->᩸:Ll/۟᩶ܺ;

    if-nez p2, :cond_0

    move-object p2, p0

    .line 309
    :cond_0
    instance-of v0, p1, Ljava/util/RandomAccess;

    iget-object v1, p0, Ll/ۧۙܺ;->۬:Ll/ܽۙܺ;

    iget-object v2, p0, Ll/۟᩶ܺ;->ۙ:Ljava/lang/Object;

    if-eqz v0, :cond_1

    .line 310
    new-instance v0, Ll/ۛ᩶ܺ;

    .line 912
    invoke-direct {v0, v1, v2, p1, p2}, Ll/ۧۙܺ;-><init>(Ll/ܽۙܺ;Ljava/lang/Object;Ljava/util/List;Ll/۟᩶ܺ;)V

    return-object v0

    .line 311
    :cond_1
    new-instance v0, Ll/ۧۙܺ;

    invoke-direct {v0, v1, v2, p1, p2}, Ll/ۧۙܺ;-><init>(Ll/ܽۙܺ;Ljava/lang/Object;Ljava/util/List;Ll/۟᩶ܺ;)V

    return-object v0
.end method
