.class public final Ll/۠ܿ᩵;
.super Ll/ۨܿ᩵;
.source "N673"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final e:Ljava/util/function/Predicate;

.field public f:Ljava/lang/Object;

.field public final synthetic g:I


# direct methods
.method public constructor <init>(Ll/ܶ۫ᩴ;Ljava/util/function/Predicate;I)V
    .locals 0

    iput p3, p0, Ll/۠ܿ᩵;->g:I

    .line 723
    invoke-direct {p0, p1}, Ll/ۨܿ᩵;-><init>(Ll/ܶ۫ᩴ;)V

    .line 724
    iput-object p2, p0, Ll/۠ܿ᩵;->e:Ljava/util/function/Predicate;

    return-void
.end method

.method public constructor <init>(Ll/ܶ۫ᩴ;Ll/۠ܿ᩵;I)V
    .locals 0

    iput p3, p0, Ll/۠ܿ᩵;->g:I

    .line 728
    invoke-direct {p0, p1, p2}, Ll/ۨܿ᩵;-><init>(Ll/ܶ۫ᩴ;Ll/ۨܿ᩵;)V

    .line 729
    iget-object p1, p2, Ll/۠ܿ᩵;->e:Ljava/util/function/Predicate;

    iput-object p1, p0, Ll/۠ܿ᩵;->e:Ljava/util/function/Predicate;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 734
    iget v0, p0, Ll/ۨܿ᩵;->d:I

    add-int/lit8 v0, v0, 0x1

    and-int/lit8 v0, v0, 0x3f

    iput v0, p0, Ll/ۨܿ᩵;->d:I

    .line 735
    iput-object p1, p0, Ll/۠ܿ᩵;->f:Ljava/lang/Object;

    return-void
.end method

.method public final synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ll/ܶ۫ᩴ;)Ll/ܶ۫ᩴ;
    .locals 2

    iget v0, p0, Ll/۠ܿ᩵;->g:I

    packed-switch v0, :pswitch_data_0

    .line 776
    new-instance v0, Ll/۠ܿ᩵;

    const/4 v1, 0x1

    .line 744
    invoke-direct {v0, p1, p0, v1}, Ll/۠ܿ᩵;-><init>(Ll/ܶ۫ᩴ;Ll/۠ܿ᩵;I)V

    return-object v0

    .line 818
    :pswitch_0
    new-instance v0, Ll/۠ܿ᩵;

    const/4 v1, 0x0

    .line 786
    invoke-direct {v0, p1, p0, v1}, Ll/۠ܿ᩵;-><init>(Ll/ܶ۫ᩴ;Ll/۠ܿ᩵;I)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final tryAdvance(Ljava/util/function/Consumer;)Z
    .locals 6

    iget v0, p0, Ll/۠ܿ᩵;->g:I

    packed-switch v0, :pswitch_data_0

    .line 750
    iget-boolean v0, p0, Ll/ۨܿ᩵;->c:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_4

    .line 751
    invoke-virtual {p0}, Ll/ۨܿ᩵;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Ll/ۨܿ᩵;->a:Ll/ܶ۫ᩴ;

    .line 752
    invoke-interface {v0, p0}, Ll/ܶ۫ᩴ;->tryAdvance(Ljava/util/function/Consumer;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Ll/۠ܿ᩵;->e:Ljava/util/function/Predicate;

    iget-object v2, p0, Ll/۠ܿ᩵;->f:Ljava/lang/Object;

    .line 753
    invoke-interface {v0, v2}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 754
    iget-object v0, p0, Ll/۠ܿ᩵;->f:Ljava/lang/Object;

    invoke-interface {p1, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    goto :goto_2

    .line 791
    :pswitch_0
    iget-boolean v0, p0, Ll/ۨܿ᩵;->c:Z

    iget-object v1, p0, Ll/ۨܿ᩵;->a:Ll/ܶ۫ᩴ;

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    .line 792
    iput-boolean v0, p0, Ll/ۨܿ᩵;->c:Z

    .line 795
    :goto_0
    invoke-interface {v1, p0}, Ll/ܶ۫ᩴ;->tryAdvance(Ljava/util/function/Consumer;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    .line 796
    invoke-virtual {p0}, Ll/ۨܿ᩵;->a()Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Ll/۠ܿ᩵;->e:Ljava/util/function/Predicate;

    iget-object v5, p0, Ll/۠ܿ᩵;->f:Ljava/lang/Object;

    .line 797
    invoke-interface {v4, v5}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    if-eqz v2, :cond_3

    if-eqz v0, :cond_1

    .line 806
    iget-object v0, p0, Ll/ۨܿ᩵;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 807
    :cond_1
    iget-object v0, p0, Ll/۠ܿ᩵;->f:Ljava/lang/Object;

    invoke-interface {p1, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    goto :goto_1

    .line 812
    :cond_2
    invoke-interface {v1, p1}, Ll/ܶ۫ᩴ;->tryAdvance(Ljava/util/function/Consumer;)Z

    move-result v2

    :cond_3
    :goto_1
    return v2

    :cond_4
    const/4 v0, 0x1

    :cond_5
    const/4 p1, 0x0

    .line 759
    iput-boolean p1, p0, Ll/ۨܿ᩵;->c:Z

    if-nez v0, :cond_6

    .line 763
    iget-object p1, p0, Ll/ۨܿ᩵;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_6
    const/4 v1, 0x0

    :goto_2
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public trySplit()Ll/ܶ۫ᩴ;
    .locals 1

    iget v0, p0, Ll/۠ܿ᩵;->g:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ll/ۨܿ᩵;->trySplit()Ll/ܶ۫ᩴ;

    move-result-object v0

    return-object v0

    .line 771
    :pswitch_0
    iget-object v0, p0, Ll/ۨܿ᩵;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-super {p0}, Ll/ۨܿ᩵;->trySplit()Ll/ܶ۫ᩴ;

    move-result-object v0

    :goto_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
