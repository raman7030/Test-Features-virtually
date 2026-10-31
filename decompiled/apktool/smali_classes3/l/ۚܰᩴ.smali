.class public final Ll/ۚܰᩴ;
.super Ll/ۛۧ᩵;
.source "N673"


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ll/۫᩺ᩴ;


# direct methods
.method public synthetic constructor <init>(Ll/۫᩺ᩴ;Ll/֡ᩳ᩵;I)V
    .locals 0

    iput p3, p0, Ll/ۚܰᩴ;->b:I

    iput-object p1, p0, Ll/ۚܰᩴ;->c:Ll/۫᩺ᩴ;

    invoke-direct {p0, p2}, Ll/ۛۧ᩵;-><init>(Ll/֡ᩳ᩵;)V

    return-void
.end method


# virtual methods
.method public final accept(J)V
    .locals 1

    iget v0, p0, Ll/ۚܰᩴ;->b:I

    packed-switch v0, :pswitch_data_0

    .line 368
    iget-object v0, p0, Ll/ۚܰᩴ;->c:Ll/۫᩺ᩴ;

    check-cast v0, Ll/᩸ܿ᩵;

    iget-object v0, v0, Ll/᩸ܿ᩵;->t:Ljava/lang/Object;

    check-cast v0, Ljava/util/function/LongConsumer;

    invoke-interface {v0, p1, p2}, Ljava/util/function/LongConsumer;->accept(J)V

    .line 369
    iget-object v0, p0, Ll/ۛۧ᩵;->a:Ll/֡ᩳ᩵;

    invoke-interface {v0, p1, p2}, Ll/֡ᩳ᩵;->accept(J)V

    return-void

    .line 350
    :pswitch_0
    iget-object v0, p0, Ll/ۚܰᩴ;->c:Ll/۫᩺ᩴ;

    check-cast v0, Ll/᩸ܿ᩵;

    iget-object v0, v0, Ll/᩸ܿ᩵;->t:Ljava/lang/Object;

    check-cast v0, Ljava/util/function/LongPredicate;

    invoke-interface {v0, p1, p2}, Ljava/util/function/LongPredicate;->test(J)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 351
    iget-object v0, p0, Ll/ۛۧ᩵;->a:Ll/֡ᩳ᩵;

    invoke-interface {v0, p1, p2}, Ll/֡ᩳ᩵;->accept(J)V

    :cond_0
    return-void

    .line 268
    :pswitch_1
    iget-object v0, p0, Ll/ۚܰᩴ;->c:Ll/۫᩺ᩴ;

    check-cast v0, Ll/᩺ܿ᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    invoke-interface {v0, p1, p2}, Ljava/util/function/LongToDoubleFunction;->applyAsDouble(J)D

    throw v0

    .line 251
    :pswitch_2
    iget-object v0, p0, Ll/ۚܰᩴ;->c:Ll/۫᩺ᩴ;

    check-cast v0, Ll/ܰᩳ᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    invoke-interface {v0, p1, p2}, Ljava/util/function/LongToIntFunction;->applyAsInt(J)I

    throw v0

    .line 228
    :pswitch_3
    iget-object v0, p0, Ll/ۚܰᩴ;->c:Ll/۫᩺ᩴ;

    check-cast v0, Ll/᩸ܿ᩵;

    iget-object v0, v0, Ll/᩸ܿ᩵;->t:Ljava/lang/Object;

    check-cast v0, Ljava/util/function/LongUnaryOperator;

    invoke-interface {v0, p1, p2}, Ljava/util/function/LongUnaryOperator;->applyAsLong(J)J

    move-result-wide p1

    iget-object v0, p0, Ll/ۛۧ᩵;->a:Ll/֡ᩳ᩵;

    invoke-interface {v0, p1, p2}, Ll/֡ᩳ᩵;->accept(J)V

    return-void

    .line 177
    :pswitch_4
    iget-object v0, p0, Ll/ۚܰᩴ;->c:Ll/۫᩺ᩴ;

    check-cast v0, Ll/ۡᩳ᩵;

    iget-object v0, v0, Ll/ۡᩳ᩵;->t:Ljava/lang/Object;

    check-cast v0, Ljava/util/function/LongFunction;

    invoke-interface {v0, p1, p2}, Ljava/util/function/LongFunction;->apply(J)Ljava/lang/Object;

    move-result-object p1

    iget-object p2, p0, Ll/ۛۧ᩵;->a:Ll/֡ᩳ᩵;

    invoke-interface {p2, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

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

    iget v0, p0, Ll/ۚܰᩴ;->b:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2}, Ll/ۛۧ᩵;->c(J)V

    return-void

    .line 345
    :pswitch_0
    iget-object p1, p0, Ll/ۛۧ᩵;->a:Ll/֡ᩳ᩵;

    const-wide/16 v0, -0x1

    invoke-interface {p1, v0, v1}, Ll/֡ᩳ᩵;->c(J)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method
