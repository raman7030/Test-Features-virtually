.class public final Ll/ۜܿ᩵;
.super Ll/᩷֫᩵;
.source "N673"

# interfaces
.implements Ll/ۖ֫᩵;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Ljava/util/function/Predicate;


# direct methods
.method public synthetic constructor <init>(Ll/ۨ֫᩵;ILjava/util/function/Predicate;I)V
    .locals 0

    iput p4, p0, Ll/ۜܿ᩵;->s:I

    iput-object p3, p0, Ll/ۜܿ᩵;->t:Ljava/util/function/Predicate;

    invoke-direct {p0, p1, p2}, Ll/۫᩺ᩴ;-><init>(Ll/۫᩺ᩴ;I)V

    return-void
.end method


# virtual methods
.method public d(Ll/ۡܳ᩵;Z)Ll/᩶֫᩵;
    .locals 1

    .line 394
    new-instance v0, Ll/֨ܿ᩵;

    invoke-direct {v0, p0, p1, p2}, Ll/֨ܿ᩵;-><init>(Ll/ۜܿ᩵;Ll/֡ᩳ᩵;Z)V

    return-object v0
.end method

.method public final n0(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Ljava/util/function/IntFunction;)Ll/ۚ۟ᩴ;
    .locals 1

    iget v0, p0, Ll/ۜܿ᩵;->s:I

    packed-switch v0, :pswitch_data_0

    .line 356
    new-instance v0, Ll/֫ۧ᩵;

    invoke-direct {v0, p0, p1, p2, p3}, Ll/֫ۧ᩵;-><init>(Ll/۫᩺ᩴ;Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Ljava/util/function/IntFunction;)V

    .line 357
    invoke-virtual {v0}, Ljava/util/concurrent/CountedCompleter;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚ۟ᩴ;

    return-object p1

    .line 82
    :pswitch_0
    new-instance v0, Ll/ܺۧ᩵;

    invoke-direct {v0, p0, p1, p2, p3}, Ll/ܺۧ᩵;-><init>(Ll/۫᩺ᩴ;Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Ljava/util/function/IntFunction;)V

    .line 83
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

    iget v0, p0, Ll/ۜܿ᩵;->s:I

    packed-switch v0, :pswitch_data_0

    .line 342
    sget-object v0, Ll/۟۟ᩴ;->ORDERED:Ll/۟۟ᩴ;

    .line 509
    iget v1, p1, Ll/۫᩺ᩴ;->m:I

    .line 342
    invoke-virtual {v0, v1}, Ll/۟۟ᩴ;->s(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 77
    new-instance v0, Ll/᩻ܰᩴ;

    const/16 v1, 0xb

    .line 0
    invoke-direct {v0, v1}, Ll/᩻ܰᩴ;-><init>(I)V

    .line 343
    invoke-virtual {p0, p1, p2, v0}, Ll/ۜܿ᩵;->n0(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Ljava/util/function/IntFunction;)Ll/ۚ۟ᩴ;

    move-result-object p1

    .line 344
    invoke-interface {p1}, Ll/ۚ۟ᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object p1

    goto :goto_1

    .line 68
    :pswitch_0
    sget-object v0, Ll/۟۟ᩴ;->ORDERED:Ll/۟۟ᩴ;

    .line 509
    iget v1, p1, Ll/۫᩺ᩴ;->m:I

    .line 68
    invoke-virtual {v0, v1}, Ll/۟۟ᩴ;->s(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 77
    new-instance v0, Ll/᩻ܰᩴ;

    const/16 v1, 0xb

    .line 0
    invoke-direct {v0, v1}, Ll/᩻ܰᩴ;-><init>(I)V

    .line 69
    invoke-virtual {p0, p1, p2, v0}, Ll/ۜܿ᩵;->n0(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Ljava/util/function/IntFunction;)Ll/ۚ۟ᩴ;

    move-result-object p1

    .line 70
    invoke-interface {p1}, Ll/ۚ۟ᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object p1

    goto :goto_0

    .line 73
    :cond_0
    new-instance v0, Ll/۠ܿ᩵;

    .line 74
    invoke-virtual {p1, p2}, Ll/۫᩺ᩴ;->h0(Ll/ܶ۫ᩴ;)Ll/ܶ۫ᩴ;

    move-result-object p1

    iget-object p2, p0, Ll/ۜܿ᩵;->t:Ljava/util/function/Predicate;

    const/4 v1, 0x1

    .line 740
    invoke-direct {v0, p1, p2, v1}, Ll/۠ܿ᩵;-><init>(Ll/ܶ۫ᩴ;Ljava/util/function/Predicate;I)V

    move-object p1, v0

    :goto_0
    return-object p1

    .line 347
    :cond_1
    new-instance v0, Ll/۠ܿ᩵;

    .line 348
    invoke-virtual {p1, p2}, Ll/۫᩺ᩴ;->h0(Ll/ܶ۫ᩴ;)Ll/ܶ۫ᩴ;

    move-result-object p1

    iget-object p2, p0, Ll/ۜܿ᩵;->t:Ljava/util/function/Predicate;

    const/4 v1, 0x0

    .line 782
    invoke-direct {v0, p1, p2, v1}, Ll/۠ܿ᩵;-><init>(Ll/ܶ۫ᩴ;Ljava/util/function/Predicate;I)V

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

    iget p1, p0, Ll/ۜܿ᩵;->s:I

    packed-switch p1, :pswitch_data_0

    .line 394
    new-instance p1, Ll/֨ܿ᩵;

    const/4 v0, 0x0

    invoke-direct {p1, p0, p2, v0}, Ll/֨ܿ᩵;-><init>(Ll/ۜܿ᩵;Ll/֡ᩳ᩵;Z)V

    return-object p1

    .line 88
    :pswitch_0
    new-instance p1, Ll/᩶ۧ᩵;

    invoke-direct {p1, p0, p2}, Ll/᩶ۧ᩵;-><init>(Ll/ۜܿ᩵;Ll/֡ᩳ᩵;)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
