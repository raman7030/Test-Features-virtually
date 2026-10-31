.class public final Ll/ۘ۟ᩴ;
.super Ll/֨ܳ᩵;
.source "N673"

# interfaces
.implements Ll/ۖ֫᩵;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Ljava/util/function/DoublePredicate;


# direct methods
.method public synthetic constructor <init>(Ll/ۚ᩺ᩴ;ILjava/util/function/DoublePredicate;I)V
    .locals 0

    iput p4, p0, Ll/ۘ۟ᩴ;->s:I

    iput-object p3, p0, Ll/ۘ۟ᩴ;->t:Ljava/util/function/DoublePredicate;

    invoke-direct {p0, p1, p2}, Ll/۫᩺ᩴ;-><init>(Ll/۫᩺ᩴ;I)V

    return-void
.end method


# virtual methods
.method public d(Ll/ۡܳ᩵;Z)Ll/᩶֫᩵;
    .locals 1

    .line 619
    new-instance v0, Ll/ۧ֫᩵;

    invoke-direct {v0, p0, p1, p2}, Ll/ۧ֫᩵;-><init>(Ll/ۘ۟ᩴ;Ll/֡ᩳ᩵;Z)V

    return-object v0
.end method

.method public final n0(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Ljava/util/function/IntFunction;)Ll/ۚ۟ᩴ;
    .locals 1

    iget v0, p0, Ll/ۘ۟ᩴ;->s:I

    packed-switch v0, :pswitch_data_0

    .line 581
    new-instance v0, Ll/֫ۧ᩵;

    invoke-direct {v0, p0, p1, p2, p3}, Ll/֫ۧ᩵;-><init>(Ll/۫᩺ᩴ;Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Ljava/util/function/IntFunction;)V

    .line 582
    invoke-virtual {v0}, Ljava/util/concurrent/CountedCompleter;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚ۟ᩴ;

    return-object p1

    .line 253
    :pswitch_0
    new-instance v0, Ll/ܺۧ᩵;

    invoke-direct {v0, p0, p1, p2, p3}, Ll/ܺۧ᩵;-><init>(Ll/۫᩺ᩴ;Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Ljava/util/function/IntFunction;)V

    .line 254
    invoke-virtual {v0}, Ljava/util/concurrent/CountedCompleter;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚ۟ᩴ;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final o0(Ll/۫᩺ᩴ;Ll/ܶ۫ᩴ;)Ll/ܶ۫ᩴ;
    .locals 2

    iget v0, p0, Ll/ۘ۟ᩴ;->s:I

    packed-switch v0, :pswitch_data_0

    .line 567
    sget-object v0, Ll/۟۟ᩴ;->ORDERED:Ll/۟۟ᩴ;

    .line 509
    iget v1, p1, Ll/۫᩺ᩴ;->m:I

    .line 567
    invoke-virtual {v0, v1}, Ll/۟۟ᩴ;->s(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 568
    new-instance v0, Ll/ۙ۟ᩴ;

    .line 0
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 568
    invoke-virtual {p0, p1, p2, v0}, Ll/ۘ۟ᩴ;->n0(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Ljava/util/function/IntFunction;)Ll/ۚ۟ᩴ;

    move-result-object p1

    .line 569
    invoke-interface {p1}, Ll/ۚ۟ᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object p1

    goto :goto_1

    .line 239
    :pswitch_0
    sget-object v0, Ll/۟۟ᩴ;->ORDERED:Ll/۟۟ᩴ;

    .line 509
    iget v1, p1, Ll/۫᩺ᩴ;->m:I

    .line 239
    invoke-virtual {v0, v1}, Ll/۟۟ᩴ;->s(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 240
    new-instance v0, Ll/᩻ܰᩴ;

    const/16 v1, 0x1d

    .line 0
    invoke-direct {v0, v1}, Ll/᩻ܰᩴ;-><init>(I)V

    .line 240
    invoke-virtual {p0, p1, p2, v0}, Ll/ۘ۟ᩴ;->n0(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Ljava/util/function/IntFunction;)Ll/ۚ۟ᩴ;

    move-result-object p1

    .line 241
    invoke-interface {p1}, Ll/ۚ۟ᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object p1

    goto :goto_0

    .line 244
    :cond_0
    new-instance v0, Ll/۟ۧ᩵;

    .line 245
    invoke-virtual {p1, p2}, Ll/۫᩺ᩴ;->h0(Ll/ܶ۫ᩴ;)Ll/ܶ۫ᩴ;

    move-result-object p1

    check-cast p1, Ll/۠ۨᩴ;

    iget-object p2, p0, Ll/ۘ۟ᩴ;->t:Ljava/util/function/DoublePredicate;

    .line 1055
    invoke-direct {v0, p1, p2}, Ll/ۡܽ᩵;-><init>(Ll/۠ۨᩴ;Ljava/util/function/DoublePredicate;)V

    move-object p1, v0

    :goto_0
    return-object p1

    .line 572
    :cond_1
    new-instance v0, Ll/᩹ۧ᩵;

    .line 573
    invoke-virtual {p1, p2}, Ll/۫᩺ᩴ;->h0(Ll/ܶ۫ᩴ;)Ll/ܶ۫ᩴ;

    move-result-object p1

    check-cast p1, Ll/۠ۨᩴ;

    iget-object p2, p0, Ll/ۘ۟ᩴ;->t:Ljava/util/function/DoublePredicate;

    .line 1097
    invoke-direct {v0, p1, p2}, Ll/ۡܽ᩵;-><init>(Ll/۠ۨᩴ;Ljava/util/function/DoublePredicate;)V

    move-object p1, v0

    :goto_1
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q0(ILl/֡ᩳ᩵;)Ll/֡ᩳ᩵;
    .locals 1

    iget p1, p0, Ll/ۘ۟ᩴ;->s:I

    packed-switch p1, :pswitch_data_0

    .line 619
    new-instance p1, Ll/ۧ֫᩵;

    const/4 v0, 0x0

    invoke-direct {p1, p0, p2, v0}, Ll/ۧ֫᩵;-><init>(Ll/ۘ۟ᩴ;Ll/֡ᩳ᩵;Z)V

    return-object p1

    .line 259
    :pswitch_0
    new-instance p1, Ll/ܽ۟ᩴ;

    invoke-direct {p1, p0, p2}, Ll/ܽ۟ᩴ;-><init>(Ll/ۘ۟ᩴ;Ll/֡ᩳ᩵;)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
