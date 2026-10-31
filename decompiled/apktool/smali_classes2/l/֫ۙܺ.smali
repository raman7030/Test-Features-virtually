.class public final Ll/֫ۙܺ;
.super Ll/ܰ᩶ܺ;
.source "O3K3"

# interfaces
.implements Ljava/util/ListIterator;


# instance fields
.field public final synthetic ۙ:Ll/ۧۙܺ;


# direct methods
.method public constructor <init>(Ll/ۧۙܺ;)V
    .locals 0

    .line 857
    iput-object p1, p0, Ll/֫ۙܺ;->ۙ:Ll/ۧۙܺ;

    invoke-direct {p0, p1}, Ll/ܰ᩶ܺ;-><init>(Ll/۟᩶ܺ;)V

    return-void
.end method

.method public constructor <init>(Ll/ۧۙܺ;I)V
    .locals 1

    .line 859
    iput-object p1, p0, Ll/֫ۙܺ;->ۙ:Ll/ۧۙܺ;

    .line 431
    iget-object v0, p1, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    .line 767
    check-cast v0, Ljava/util/List;

    .line 860
    invoke-interface {v0, p2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Ll/ܰ᩶ܺ;-><init>(Ll/ۧۙܺ;Ljava/util/ListIterator;)V

    return-void
.end method

.method private ۧ()Ljava/util/ListIterator;
    .locals 1

    .line 484
    invoke-virtual {p0}, Ll/ܰ᩶ܺ;->֫()V

    .line 485
    iget-object v0, p0, Ll/ܰ᩶ܺ;->᩸:Ljava/util/Iterator;

    .line 864
    check-cast v0, Ljava/util/ListIterator;

    return-object v0
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)V
    .locals 3

    .line 895
    iget-object v0, p0, Ll/֫ۙܺ;->ۙ:Ll/ۧۙܺ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    .line 896
    invoke-direct {p0}, Ll/֫ۙܺ;->ۧ()Ljava/util/ListIterator;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/ListIterator;->add(Ljava/lang/Object;)V

    .line 897
    iget-object p1, v0, Ll/ۧۙܺ;->۬:Ll/ܽۙܺ;

    invoke-static {p1}, Ll/ܽۙܺ;->ۧ(Ll/ܽۙܺ;)V

    if-eqz v1, :cond_0

    .line 899
    invoke-virtual {v0}, Ll/۟᩶ܺ;->ۧ()V

    :cond_0
    return-void
.end method

.method public final hasPrevious()Z
    .locals 1

    .line 869
    invoke-direct {p0}, Ll/֫ۙܺ;->ۧ()Ljava/util/ListIterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    return v0
.end method

.method public final nextIndex()I
    .locals 1

    .line 880
    invoke-direct {p0}, Ll/֫ۙܺ;->ۧ()Ljava/util/ListIterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    move-result v0

    return v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 1

    .line 875
    invoke-direct {p0}, Ll/֫ۙܺ;->ۧ()Ljava/util/ListIterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final previousIndex()I
    .locals 1

    .line 885
    invoke-direct {p0}, Ll/֫ۙܺ;->ۧ()Ljava/util/ListIterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/ListIterator;->previousIndex()I

    move-result v0

    return v0
.end method

.method public final set(Ljava/lang/Object;)V
    .locals 1

    .line 890
    invoke-direct {p0}, Ll/֫ۙܺ;->ۧ()Ljava/util/ListIterator;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/ListIterator;->set(Ljava/lang/Object;)V

    return-void
.end method
