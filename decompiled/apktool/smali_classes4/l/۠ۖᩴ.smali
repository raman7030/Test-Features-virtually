.class public final Ll/۠ۖᩴ;
.super Ljava/lang/Object;
.source "QCDS"

# interfaces
.implements Ll/ۘۘᩴ;
.implements Ll/۫۬ᩴ;


# instance fields
.field public final synthetic ᩶:Ll/ۙۖᩴ;

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/ۙۖᩴ;I)V
    .locals 0

    .line 772
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠ۖᩴ;->᩶:Ll/ۙۖᩴ;

    .line 773
    iput p2, p0, Ll/۠ۖᩴ;->᩹:I

    const/4 p1, -0x1

    iput p1, p0, Ll/۠ۖᩴ;->᩸:I

    return-void
.end method


# virtual methods
.method public final add(J)V
    .locals 2

    .line 809
    iget v0, p0, Ll/۠ۖᩴ;->᩹:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/۠ۖᩴ;->᩹:I

    iget-object v1, p0, Ll/۠ۖᩴ;->᩶:Ll/ۙۖᩴ;

    invoke-virtual {v1, v0, p1, p2}, Ll/ۙۖᩴ;->֫(IJ)V

    const/4 p1, -0x1

    .line 810
    iput p1, p0, Ll/۠ۖᩴ;->᩸:I

    return-void
.end method

.method public final add(Ljava/lang/Object;)V
    .locals 2

    .line 31
    check-cast p1, Ljava/lang/Long;

    .line 92
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ll/۠ۖᩴ;->add(J)V

    return-void
.end method

.method public final bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 772
    check-cast p1, Ljava/util/function/LongConsumer;

    invoke-virtual {p0, p1}, Ll/۠ۖᩴ;->forEachRemaining(Ljava/util/function/LongConsumer;)V

    return-void
.end method

.method public final synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܳۘᩴ;->֫(Ll/᩻ۘᩴ;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final forEachRemaining(Ljava/util/function/LongConsumer;)V
    .locals 4

    .line 830
    iget-object v0, p0, Ll/۠ۖᩴ;->᩶:Ll/ۙۖᩴ;

    iget-object v1, v0, Ll/ۙۖᩴ;->᩸:[J

    .line 831
    :goto_0
    iget v2, p0, Ll/۠ۖᩴ;->᩹:I

    iget v3, v0, Ll/ۙۖᩴ;->᩹:I

    if-ge v2, v3, :cond_0

    add-int/lit8 v3, v2, 0x1

    .line 832
    iput v3, p0, Ll/۠ۖᩴ;->᩹:I

    iput v2, p0, Ll/۠ۖᩴ;->᩸:I

    aget-wide v2, v1, v2

    invoke-interface {p1, v2, v3}, Ljava/util/function/LongConsumer;->accept(J)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final hasNext()Z
    .locals 2

    .line 777
    iget v0, p0, Ll/۠ۖᩴ;->᩹:I

    iget-object v1, p0, Ll/۠ۖᩴ;->᩶:Ll/ۙۖᩴ;

    iget v1, v1, Ll/ۙۖᩴ;->᩹:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final hasPrevious()Z
    .locals 1

    .line 782
    iget v0, p0, Ll/۠ۖᩴ;->᩹:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Long;
    .locals 2

    .line 46
    invoke-interface {p0}, Ll/ۜ۫ᩴ;->nextLong()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 31
    invoke-virtual {p0}, Ll/۠ۖᩴ;->next()Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public final nextIndex()I
    .locals 1

    .line 799
    iget v0, p0, Ll/۠ۖᩴ;->᩹:I

    return v0
.end method

.method public final nextLong()J
    .locals 3

    .line 787
    invoke-virtual {p0}, Ll/۠ۖᩴ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 788
    iget-object v0, p0, Ll/۠ۖᩴ;->᩶:Ll/ۙۖᩴ;

    iget-object v0, v0, Ll/ۙۖᩴ;->᩸:[J

    iget v1, p0, Ll/۠ۖᩴ;->᩹:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/۠ۖᩴ;->᩹:I

    iput v1, p0, Ll/۠ۖᩴ;->᩸:I

    aget-wide v1, v0, v1

    return-wide v1

    .line 787
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 2

    .line 44
    invoke-virtual {p0}, Ll/۠ۖᩴ;->ܿ֫()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public final previousIndex()I
    .locals 1

    .line 804
    iget v0, p0, Ll/۠ۖᩴ;->᩹:I

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public final remove()V
    .locals 3

    .line 821
    iget v0, p0, Ll/۠ۖᩴ;->᩸:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 822
    iget-object v2, p0, Ll/۠ۖᩴ;->᩶:Ll/ۙۖᩴ;

    invoke-virtual {v2, v0}, Ll/ۙۖᩴ;->ܽ(I)J

    .line 824
    iget v0, p0, Ll/۠ۖᩴ;->᩸:I

    iget v2, p0, Ll/۠ۖᩴ;->᩹:I

    if-ge v0, v2, :cond_0

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/۠ۖᩴ;->᩹:I

    .line 825
    :cond_0
    iput v1, p0, Ll/۠ۖᩴ;->᩸:I

    return-void

    .line 821
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public final set(Ljava/lang/Object;)V
    .locals 2

    .line 31
    check-cast p1, Ljava/lang/Long;

    .line 81
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ll/۠ۖᩴ;->ᩳ(J)V

    return-void
.end method

.method public final ܿ֫()J
    .locals 3

    .line 793
    invoke-virtual {p0}, Ll/۠ۖᩴ;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 794
    iget-object v0, p0, Ll/۠ۖᩴ;->᩶:Ll/ۙۖᩴ;

    iget-object v0, v0, Ll/ۙۖᩴ;->᩸:[J

    iget v1, p0, Ll/۠ۖᩴ;->᩹:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Ll/۠ۖᩴ;->᩹:I

    iput v1, p0, Ll/۠ۖᩴ;->᩸:I

    aget-wide v1, v0, v1

    return-wide v1

    .line 793
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final ᩳ(J)V
    .locals 2

    .line 815
    iget v0, p0, Ll/۠ۖᩴ;->᩸:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 816
    iget-object v1, p0, Ll/۠ۖᩴ;->᩶:Ll/ۙۖᩴ;

    invoke-virtual {v1, v0, p1, p2}, Ll/ۙۖᩴ;->set(IJ)J

    return-void

    .line 815
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method
