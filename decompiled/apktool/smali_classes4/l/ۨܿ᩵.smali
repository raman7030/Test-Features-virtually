.class public abstract Ll/ۨܿ᩵;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/ܶ۫ᩴ;


# instance fields
.field public final a:Ll/ܶ۫ᩴ;

.field public final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public c:Z

.field public d:I


# direct methods
.method public constructor <init>(Ll/ܶ۫ᩴ;)V
    .locals 1

    .line 672
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 668
    iput-boolean v0, p0, Ll/ۨܿ᩵;->c:Z

    .line 673
    iput-object p1, p0, Ll/ۨܿ᩵;->a:Ll/ܶ۫ᩴ;

    .line 675
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p1, p0, Ll/ۨܿ᩵;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public constructor <init>(Ll/ܶ۫ᩴ;Ll/ۨܿ᩵;)V
    .locals 1

    .line 678
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 668
    iput-boolean v0, p0, Ll/ۨܿ᩵;->c:Z

    .line 679
    iput-object p1, p0, Ll/ۨܿ᩵;->a:Ll/ܶ۫ᩴ;

    .line 681
    iget-object p1, p2, Ll/ۨܿ᩵;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Ll/ۨܿ᩵;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 713
    iget v0, p0, Ll/ۨܿ᩵;->d:I

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ۨܿ᩵;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public abstract b(Ll/ܶ۫ᩴ;)Ll/ܶ۫ᩴ;
.end method

.method public final characteristics()I
    .locals 1

    .line 692
    iget-object v0, p0, Ll/ۨܿ᩵;->a:Ll/ܶ۫ᩴ;

    invoke-interface {v0}, Ll/ܶ۫ᩴ;->characteristics()I

    move-result v0

    and-int/lit16 v0, v0, -0x4041

    return v0
.end method

.method public final estimateSize()J
    .locals 2

    .line 686
    iget-object v0, p0, Ll/ۨܿ᩵;->a:Ll/ܶ۫ᩴ;

    invoke-interface {v0}, Ll/ܶ۫ᩴ;->estimateSize()J

    move-result-wide v0

    return-wide v0
.end method

.method public synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    invoke-static {p0, p1}, Ll/ۖ۫ᩴ;->$default$forEachRemaining(Ll/ܶ۫ᩴ;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final getComparator()Ljava/util/Comparator;
    .locals 1

    .line 702
    iget-object v0, p0, Ll/ۨܿ᩵;->a:Ll/ܶ۫ᩴ;

    invoke-interface {v0}, Ll/ܶ۫ᩴ;->getComparator()Ljava/util/Comparator;

    move-result-object v0

    return-object v0
.end method

.method public final getExactSizeIfKnown()J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public final synthetic hasCharacteristics(I)Z
    .locals 0

    invoke-static {p0, p1}, Ll/ۖ۫ᩴ;->$default$hasCharacteristics(Ll/ܶ۫ᩴ;I)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic trySplit()Ll/֡۫ᩴ;
    .locals 1

    .line 990
    invoke-virtual {p0}, Ll/ۨܿ᩵;->trySplit()Ll/ܶ۫ᩴ;

    move-result-object v0

    check-cast v0, Ll/֡۫ᩴ;

    return-object v0
.end method

.method public bridge synthetic trySplit()Ll/֨۫ᩴ;
    .locals 1

    .line 1095
    invoke-virtual {p0}, Ll/ۨܿ᩵;->trySplit()Ll/ܶ۫ᩴ;

    move-result-object v0

    check-cast v0, Ll/֨۫ᩴ;

    return-object v0
.end method

.method public bridge synthetic trySplit()Ll/۠ۨᩴ;
    .locals 1

    .line 1095
    invoke-virtual {p0}, Ll/ۨܿ᩵;->trySplit()Ll/ܶ۫ᩴ;

    move-result-object v0

    check-cast v0, Ll/۠ۨᩴ;

    return-object v0
.end method

.method public trySplit()Ll/ܶ۫ᩴ;
    .locals 1

    .line 708
    iget-object v0, p0, Ll/ۨܿ᩵;->a:Ll/ܶ۫ᩴ;

    invoke-interface {v0}, Ll/ܶ۫ᩴ;->trySplit()Ll/ܶ۫ᩴ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 709
    invoke-virtual {p0, v0}, Ll/ۨܿ᩵;->b(Ll/ܶ۫ᩴ;)Ll/ܶ۫ᩴ;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic trySplit()Ll/ᩴ۫ᩴ;
    .locals 1

    .line 885
    invoke-virtual {p0}, Ll/ۨܿ᩵;->trySplit()Ll/ܶ۫ᩴ;

    move-result-object v0

    check-cast v0, Ll/ᩴ۫ᩴ;

    return-object v0
.end method
