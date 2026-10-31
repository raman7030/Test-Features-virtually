.class public final Ll/᩹ᩳ᩵;
.super Ll/֨ۧ᩵;
.source "N673"


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ll/۫᩺ᩴ;


# direct methods
.method public synthetic constructor <init>(Ll/۫᩺ᩴ;Ll/֡ᩳ᩵;I)V
    .locals 0

    iput p3, p0, Ll/᩹ᩳ᩵;->b:I

    iput-object p1, p0, Ll/᩹ᩳ᩵;->c:Ll/۫᩺ᩴ;

    invoke-direct {p0, p2}, Ll/֨ۧ᩵;-><init>(Ll/֡ᩳ᩵;)V

    return-void
.end method


# virtual methods
.method public final accept(I)V
    .locals 2

    iget v0, p0, Ll/᩹ᩳ᩵;->b:I

    packed-switch v0, :pswitch_data_0

    .line 368
    iget-object v0, p0, Ll/᩹ᩳ᩵;->c:Ll/۫᩺ᩴ;

    check-cast v0, Ll/۟ᩳ᩵;

    iget-object v0, v0, Ll/۟ᩳ᩵;->t:Ljava/lang/Object;

    check-cast v0, Ljava/util/function/IntPredicate;

    invoke-interface {v0, p1}, Ljava/util/function/IntPredicate;->test(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 369
    iget-object v0, p0, Ll/֨ۧ᩵;->a:Ll/֡ᩳ᩵;

    invoke-interface {v0, p1}, Ll/֡ᩳ᩵;->accept(I)V

    goto :goto_0

    .line 286
    :pswitch_0
    iget-object v0, p0, Ll/᩹ᩳ᩵;->c:Ll/۫᩺ᩴ;

    check-cast v0, Ll/᩸ᩳ᩵;

    iget-object v0, v0, Ll/᩸ᩳ᩵;->t:Ljava/lang/Object;

    check-cast v0, Ljava/util/function/IntToDoubleFunction;

    invoke-interface {v0, p1}, Ljava/util/function/IntToDoubleFunction;->applyAsDouble(I)D

    move-result-wide v0

    iget-object p1, p0, Ll/֨ۧ᩵;->a:Ll/֡ᩳ᩵;

    invoke-interface {p1, v0, v1}, Ll/֡ᩳ᩵;->accept(D)V

    return-void

    .line 269
    :pswitch_1
    iget-object v0, p0, Ll/᩹ᩳ᩵;->c:Ll/۫᩺ᩴ;

    check-cast v0, Ll/᩸ܿ᩵;

    iget-object v0, v0, Ll/᩸ܿ᩵;->t:Ljava/lang/Object;

    check-cast v0, Ljava/util/function/IntToLongFunction;

    invoke-interface {v0, p1}, Ljava/util/function/IntToLongFunction;->applyAsLong(I)J

    move-result-wide v0

    iget-object p1, p0, Ll/֨ۧ᩵;->a:Ll/֡ᩳ᩵;

    invoke-interface {p1, v0, v1}, Ll/֡ᩳ᩵;->accept(J)V

    return-void

    .line 246
    :pswitch_2
    iget-object v0, p0, Ll/᩹ᩳ᩵;->c:Ll/۫᩺ᩴ;

    check-cast v0, Ll/۟ᩳ᩵;

    iget-object v0, v0, Ll/۟ᩳ᩵;->t:Ljava/lang/Object;

    check-cast v0, Ljava/util/function/IntUnaryOperator;

    invoke-interface {v0, p1}, Ljava/util/function/IntUnaryOperator;->applyAsInt(I)I

    move-result p1

    iget-object v0, p0, Ll/֨ۧ᩵;->a:Ll/֡ᩳ᩵;

    invoke-interface {v0, p1}, Ll/֡ᩳ᩵;->accept(I)V

    return-void

    .line 386
    :pswitch_3
    iget-object v0, p0, Ll/᩹ᩳ᩵;->c:Ll/۫᩺ᩴ;

    check-cast v0, Ll/۟ᩳ᩵;

    iget-object v0, v0, Ll/۟ᩳ᩵;->t:Ljava/lang/Object;

    check-cast v0, Ljava/util/function/IntConsumer;

    invoke-interface {v0, p1}, Ljava/util/function/IntConsumer;->accept(I)V

    .line 387
    iget-object v0, p0, Ll/֨ۧ᩵;->a:Ll/֡ᩳ᩵;

    invoke-interface {v0, p1}, Ll/֡ᩳ᩵;->accept(I)V

    return-void

    .line 180
    :pswitch_4
    iget-object v0, p0, Ll/᩹ᩳ᩵;->c:Ll/۫᩺ᩴ;

    check-cast v0, Ll/ۡᩳ᩵;

    iget-object v0, v0, Ll/ۡᩳ᩵;->t:Ljava/lang/Object;

    check-cast v0, Ljava/util/function/IntFunction;

    invoke-interface {v0, p1}, Ljava/util/function/IntFunction;->apply(I)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Ll/֨ۧ᩵;->a:Ll/֡ᩳ᩵;

    invoke-interface {v0, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    :cond_0
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public c(J)V
    .locals 2

    iget v0, p0, Ll/᩹ᩳ᩵;->b:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2}, Ll/֨ۧ᩵;->c(J)V

    return-void

    .line 363
    :pswitch_0
    iget-object p1, p0, Ll/֨ۧ᩵;->a:Ll/֡ᩳ᩵;

    const-wide/16 v0, -0x1

    invoke-interface {p1, v0, v1}, Ll/֡ᩳ᩵;->c(J)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method
