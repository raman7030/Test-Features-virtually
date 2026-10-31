.class public final Ll/ۗܿᩴ;
.super Ljava/lang/Object;
.source "21QH"

# interfaces
.implements Ll/ܶۡᩴ;
.implements Ll/۫۬ᩴ;


# instance fields
.field public ᩸:Ll/ܶۡᩴ;

.field public final synthetic ᩹:Ll/۫ܿᩴ;


# direct methods
.method public constructor <init>(Ll/۫ܿᩴ;Ll/ܶۡᩴ;)V
    .locals 0

    .line 709
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗܿᩴ;->᩹:Ll/۫ܿᩴ;

    .line 710
    iput-object p2, p0, Ll/ۗܿᩴ;->᩸:Ll/ܶۡᩴ;

    return-void
.end method


# virtual methods
.method public final add(I)V
    .locals 1

    .line 747
    iget-object v0, p0, Ll/ۗܿᩴ;->᩸:Ll/ܶۡᩴ;

    invoke-interface {v0, p1}, Ll/ܶۡᩴ;->add(I)V

    return-void
.end method

.method public final bridge synthetic add(Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۡᩴ;->֫(Ll/ܶۡᩴ;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܿ۫ᩴ;->$default$forEachRemaining(Ll/ܳ۫ᩴ;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۡᩴ;->֫(Ll/ۜۡᩴ;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public synthetic forEachRemaining(Ljava/util/function/IntConsumer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܿ۫ᩴ;->$default$forEachRemaining(Ll/ܳ۫ᩴ;Ljava/util/function/IntConsumer;)V

    return-void
.end method

.method public final hasNext()Z
    .locals 2

    .line 725
    iget-object v0, p0, Ll/ۗܿᩴ;->᩸:Ll/ܶۡᩴ;

    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    move-result v0

    iget-object v1, p0, Ll/ۗܿᩴ;->᩹:Ll/۫ܿᩴ;

    iget v1, v1, Ll/۫ܿᩴ;->᩶:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final hasPrevious()Z
    .locals 2

    .line 730
    iget-object v0, p0, Ll/ۗܿᩴ;->᩸:Ll/ܶۡᩴ;

    invoke-interface {v0}, Ljava/util/ListIterator;->previousIndex()I

    move-result v0

    iget-object v1, p0, Ll/ۗܿᩴ;->᩹:Ll/۫ܿᩴ;

    iget v1, v1, Ll/۫ܿᩴ;->᩸:I

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Integer;
    .locals 1

    .line 103
    invoke-static {p0}, Ll/᩻ۡᩴ;->֫(Ll/ۜۡᩴ;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 31
    invoke-virtual {p0}, Ll/ۗܿᩴ;->next()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final nextIndex()I
    .locals 2

    .line 715
    iget-object v0, p0, Ll/ۗܿᩴ;->᩸:Ll/ܶۡᩴ;

    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    move-result v0

    iget-object v1, p0, Ll/ۗܿᩴ;->᩹:Ll/۫ܿᩴ;

    iget v1, v1, Ll/۫ܿᩴ;->᩸:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final nextInt()I
    .locals 1

    .line 735
    invoke-virtual {p0}, Ll/ۗܿᩴ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 736
    iget-object v0, p0, Ll/ۗܿᩴ;->᩸:Ll/ܶۡᩴ;

    invoke-interface {v0}, Ll/ܳ۫ᩴ;->nextInt()I

    move-result v0

    return v0

    .line 735
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 1

    .line 44
    invoke-virtual {p0}, Ll/ۗܿᩴ;->ۖ֫()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final previousIndex()I
    .locals 2

    .line 720
    iget-object v0, p0, Ll/ۗܿᩴ;->᩸:Ll/ܶۡᩴ;

    invoke-interface {v0}, Ljava/util/ListIterator;->previousIndex()I

    move-result v0

    iget-object v1, p0, Ll/ۗܿᩴ;->᩹:Ll/۫ܿᩴ;

    iget v1, v1, Ll/۫ܿᩴ;->᩸:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final remove()V
    .locals 1

    .line 757
    iget-object v0, p0, Ll/ۗܿᩴ;->᩸:Ll/ܶۡᩴ;

    invoke-interface {v0}, Ll/ܶۡᩴ;->remove()V

    return-void
.end method

.method public final bridge synthetic set(Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۡᩴ;->ۧ(Ll/ܶۡᩴ;Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(I)V
    .locals 1

    .line 752
    iget-object v0, p0, Ll/ۗܿᩴ;->᩸:Ll/ܶۡᩴ;

    invoke-interface {v0, p1}, Ll/ܶۡᩴ;->֫(I)V

    return-void
.end method

.method public final synthetic ֫(Ljava/lang/Integer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۡᩴ;->֫(Ll/ܶۡᩴ;Ljava/lang/Integer;)V

    return-void
.end method

.method public final ۖ֫()I
    .locals 1

    .line 741
    invoke-virtual {p0}, Ll/ۗܿᩴ;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 742
    iget-object v0, p0, Ll/ۗܿᩴ;->᩸:Ll/ܶۡᩴ;

    invoke-interface {v0}, Ll/ܶۡᩴ;->ۖ֫()I

    move-result v0

    return v0

    .line 741
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final synthetic ۧ(Ljava/lang/Integer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۡᩴ;->ۧ(Ll/ܶۡᩴ;Ljava/lang/Integer;)V

    return-void
.end method
