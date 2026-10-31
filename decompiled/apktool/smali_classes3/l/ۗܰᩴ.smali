.class public final Ll/ۗܰᩴ;
.super Ll/۫۟ᩴ;
.source "N673"

# interfaces
.implements Ll/ۖ֫᩵;


# instance fields
.field public final synthetic s:Ljava/util/function/LongPredicate;


# direct methods
.method public constructor <init>(Ll/᩵֫᩵;ILjava/util/function/LongPredicate;)V
    .locals 0

    .line 485
    iput-object p3, p0, Ll/ۗܰᩴ;->s:Ljava/util/function/LongPredicate;

    .line 91
    invoke-direct {p0, p1, p2}, Ll/۫᩺ᩴ;-><init>(Ll/۫᩺ᩴ;I)V

    return-void
.end method


# virtual methods
.method public final d(Ll/ۡܳ᩵;Z)Ll/᩶֫᩵;
    .locals 1

    .line 544
    new-instance v0, Ll/ᩴܰᩴ;

    invoke-direct {v0, p0, p1, p2}, Ll/ᩴܰᩴ;-><init>(Ll/ۗܰᩴ;Ll/֡ᩳ᩵;Z)V

    return-object v0
.end method

.method public final n0(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Ljava/util/function/IntFunction;)Ll/ۚ۟ᩴ;
    .locals 1

    .line 506
    new-instance v0, Ll/֫ۧ᩵;

    invoke-direct {v0, p0, p1, p2, p3}, Ll/֫ۧ᩵;-><init>(Ll/۫᩺ᩴ;Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Ljava/util/function/IntFunction;)V

    .line 507
    invoke-virtual {v0}, Ljava/util/concurrent/CountedCompleter;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚ۟ᩴ;

    return-object p1
.end method

.method public final o0(Ll/۫᩺ᩴ;Ll/ܶ۫ᩴ;)Ll/ܶ۫ᩴ;
    .locals 2

    .line 492
    sget-object v0, Ll/۟۟ᩴ;->ORDERED:Ll/۟۟ᩴ;

    .line 509
    iget v1, p1, Ll/۫᩺ᩴ;->m:I

    .line 492
    invoke-virtual {v0, v1}, Ll/۟۟ᩴ;->s(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 493
    new-instance v0, Ll/᩻ܰᩴ;

    const/16 v1, 0x1c

    .line 0
    invoke-direct {v0, v1}, Ll/᩻ܰᩴ;-><init>(I)V

    .line 493
    invoke-virtual {p0, p1, p2, v0}, Ll/ۗܰᩴ;->n0(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Ljava/util/function/IntFunction;)Ll/ۚ۟ᩴ;

    move-result-object p1

    .line 494
    invoke-interface {p1}, Ll/ۚ۟ᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object p1

    return-object p1

    .line 497
    :cond_0
    new-instance v0, Ll/ܶᩳ᩵;

    .line 498
    invoke-virtual {p1, p2}, Ll/۫᩺ᩴ;->h0(Ll/ܶ۫ᩴ;)Ll/ܶ۫ᩴ;

    move-result-object p1

    check-cast p1, Ll/֡۫ᩴ;

    iget-object p2, p0, Ll/ۗܰᩴ;->s:Ljava/util/function/LongPredicate;

    .line 992
    invoke-direct {v0, p1, p2}, Ll/᩷ܿ᩵;-><init>(Ll/֡۫ᩴ;Ljava/util/function/LongPredicate;)V

    return-object v0
.end method

.method public final q0(ILl/֡ᩳ᩵;)Ll/֡ᩳ᩵;
    .locals 1

    .line 544
    new-instance p1, Ll/ᩴܰᩴ;

    const/4 v0, 0x0

    invoke-direct {p1, p0, p2, v0}, Ll/ᩴܰᩴ;-><init>(Ll/ۗܰᩴ;Ll/֡ᩳ᩵;Z)V

    return-object p1
.end method
