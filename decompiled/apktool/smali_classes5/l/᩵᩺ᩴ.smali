.class public final Ll/᩵᩺ᩴ;
.super Ll/ۜ᩺ᩴ;
.source "N673"

# interfaces
.implements Ll/ۖ֫᩵;


# instance fields
.field public final synthetic s:Ljava/util/function/IntPredicate;


# direct methods
.method public constructor <init>(Ll/ۛ᩺ᩴ;ILjava/util/function/IntPredicate;)V
    .locals 0

    .line 410
    iput-object p3, p0, Ll/᩵᩺ᩴ;->s:Ljava/util/function/IntPredicate;

    .line 91
    invoke-direct {p0, p1, p2}, Ll/۫᩺ᩴ;-><init>(Ll/۫᩺ᩴ;I)V

    return-void
.end method


# virtual methods
.method public final d(Ll/ۡܳ᩵;Z)Ll/᩶֫᩵;
    .locals 1

    .line 469
    new-instance v0, Ll/ۚܳ᩵;

    invoke-direct {v0, p0, p1, p2}, Ll/ۚܳ᩵;-><init>(Ll/᩵᩺ᩴ;Ll/֡ᩳ᩵;Z)V

    return-object v0
.end method

.method public final n0(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Ljava/util/function/IntFunction;)Ll/ۚ۟ᩴ;
    .locals 1

    .line 431
    new-instance v0, Ll/֫ۧ᩵;

    invoke-direct {v0, p0, p1, p2, p3}, Ll/֫ۧ᩵;-><init>(Ll/۫᩺ᩴ;Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Ljava/util/function/IntFunction;)V

    .line 432
    invoke-virtual {v0}, Ljava/util/concurrent/CountedCompleter;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚ۟ᩴ;

    return-object p1
.end method

.method public final o0(Ll/۫᩺ᩴ;Ll/ܶ۫ᩴ;)Ll/ܶ۫ᩴ;
    .locals 2

    .line 417
    sget-object v0, Ll/۟۟ᩴ;->ORDERED:Ll/۟۟ᩴ;

    .line 509
    iget v1, p1, Ll/۫᩺ᩴ;->m:I

    .line 417
    invoke-virtual {v0, v1}, Ll/۟۟ᩴ;->s(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 418
    new-instance v0, Ll/᩻ܰᩴ;

    const/16 v1, 0x1a

    .line 0
    invoke-direct {v0, v1}, Ll/᩻ܰᩴ;-><init>(I)V

    .line 418
    invoke-virtual {p0, p1, p2, v0}, Ll/᩵᩺ᩴ;->n0(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Ljava/util/function/IntFunction;)Ll/ۚ۟ᩴ;

    move-result-object p1

    .line 419
    invoke-interface {p1}, Ll/ۚ۟ᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object p1

    return-object p1

    .line 422
    :cond_0
    new-instance v0, Ll/᩸ܽ᩵;

    .line 423
    invoke-virtual {p1, p2}, Ll/۫᩺ᩴ;->h0(Ll/ܶ۫ᩴ;)Ll/ܶ۫ᩴ;

    move-result-object p1

    check-cast p1, Ll/ᩴ۫ᩴ;

    iget-object p2, p0, Ll/᩵᩺ᩴ;->s:Ljava/util/function/IntPredicate;

    .line 887
    invoke-direct {v0, p1, p2}, Ll/ۢᩳ᩵;-><init>(Ll/ᩴ۫ᩴ;Ljava/util/function/IntPredicate;)V

    return-object v0
.end method

.method public final q0(ILl/֡ᩳ᩵;)Ll/֡ᩳ᩵;
    .locals 1

    .line 469
    new-instance p1, Ll/ۚܳ᩵;

    const/4 v0, 0x0

    invoke-direct {p1, p0, p2, v0}, Ll/ۚܳ᩵;-><init>(Ll/᩵᩺ᩴ;Ll/֡ᩳ᩵;Z)V

    return-object p1
.end method
