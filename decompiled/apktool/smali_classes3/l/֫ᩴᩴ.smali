.class public final Ll/֫ᩴᩴ;
.super Ljava/lang/Object;
.source "J1MI"

# interfaces
.implements Ll/ۧۚᩴ;


# instance fields
.field public ᩸:Ll/ۧۚᩴ;

.field public final synthetic ᩹:Ll/ܽᩴᩴ;


# direct methods
.method public constructor <init>(Ll/ܽᩴᩴ;Ll/ۧۚᩴ;)V
    .locals 0

    .line 658
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫ᩴᩴ;->᩹:Ll/ܽᩴᩴ;

    .line 659
    iput-object p2, p0, Ll/֫ᩴᩴ;->᩸:Ll/ۧۚᩴ;

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)V
    .locals 1

    .line 696
    iget-object v0, p0, Ll/֫ᩴᩴ;->᩸:Ll/ۧۚᩴ;

    invoke-interface {v0, p1}, Ll/ۧۚᩴ;->add(Ljava/lang/Object;)V

    return-void
.end method

.method public final hasNext()Z
    .locals 2

    .line 674
    iget-object v0, p0, Ll/֫ᩴᩴ;->᩸:Ll/ۧۚᩴ;

    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    move-result v0

    iget-object v1, p0, Ll/֫ᩴᩴ;->᩹:Ll/ܽᩴᩴ;

    iget v1, v1, Ll/ܽᩴᩴ;->᩶:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final hasPrevious()Z
    .locals 2

    .line 679
    iget-object v0, p0, Ll/֫ᩴᩴ;->᩸:Ll/ۧۚᩴ;

    invoke-interface {v0}, Ljava/util/ListIterator;->previousIndex()I

    move-result v0

    iget-object v1, p0, Ll/֫ᩴᩴ;->᩹:Ll/ܽᩴᩴ;

    iget v1, v1, Ll/ܽᩴᩴ;->᩸:I

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 684
    invoke-virtual {p0}, Ll/֫ᩴᩴ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 685
    iget-object v0, p0, Ll/֫ᩴᩴ;->᩸:Ll/ۧۚᩴ;

    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 684
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final nextIndex()I
    .locals 2

    .line 664
    iget-object v0, p0, Ll/֫ᩴᩴ;->᩸:Ll/ۧۚᩴ;

    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    move-result v0

    iget-object v1, p0, Ll/֫ᩴᩴ;->᩹:Ll/ܽᩴᩴ;

    iget v1, v1, Ll/ܽᩴᩴ;->᩸:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 1

    .line 690
    invoke-virtual {p0}, Ll/֫ᩴᩴ;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 691
    iget-object v0, p0, Ll/֫ᩴᩴ;->᩸:Ll/ۧۚᩴ;

    invoke-interface {v0}, Ll/ܶ֡ᩴ;->previous()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 690
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final previousIndex()I
    .locals 2

    .line 669
    iget-object v0, p0, Ll/֫ᩴᩴ;->᩸:Ll/ۧۚᩴ;

    invoke-interface {v0}, Ljava/util/ListIterator;->previousIndex()I

    move-result v0

    iget-object v1, p0, Ll/֫ᩴᩴ;->᩹:Ll/ܽᩴᩴ;

    iget v1, v1, Ll/ܽᩴᩴ;->᩸:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final remove()V
    .locals 1

    .line 706
    iget-object v0, p0, Ll/֫ᩴᩴ;->᩸:Ll/ۧۚᩴ;

    invoke-interface {v0}, Ll/ۧۚᩴ;->remove()V

    return-void
.end method

.method public final set(Ljava/lang/Object;)V
    .locals 1

    .line 701
    iget-object v0, p0, Ll/֫ᩴᩴ;->᩸:Ll/ۧۚᩴ;

    invoke-interface {v0, p1}, Ll/ۧۚᩴ;->set(Ljava/lang/Object;)V

    return-void
.end method
