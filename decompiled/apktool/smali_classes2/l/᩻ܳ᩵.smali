.class public final Ll/᩻ܳ᩵;
.super Ll/ۜ᩺ᩴ;
.source "N673"


# instance fields
.field public final synthetic s:Ljava/util/function/IntPredicate;


# direct methods
.method public constructor <init>(Ll/ۛ᩺ᩴ;ILjava/util/function/IntPredicate;)V
    .locals 0

    .line 121
    iput-object p3, p0, Ll/᩻ܳ᩵;->s:Ljava/util/function/IntPredicate;

    .line 91
    invoke-direct {p0, p1, p2}, Ll/۫᩺ᩴ;-><init>(Ll/۫᩺ᩴ;I)V

    return-void
.end method


# virtual methods
.method public final n0(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Ljava/util/function/IntFunction;)Ll/ۚ۟ᩴ;
    .locals 1

    .line 139
    new-instance v0, Ll/ܺۧ᩵;

    invoke-direct {v0, p0, p1, p2, p3}, Ll/ܺۧ᩵;-><init>(Ll/۫᩺ᩴ;Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Ljava/util/function/IntFunction;)V

    .line 140
    invoke-virtual {v0}, Ljava/util/concurrent/CountedCompleter;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚ۟ᩴ;

    return-object p1
.end method

.method public final o0(Ll/۫᩺ᩴ;Ll/ܶ۫ᩴ;)Ll/ܶ۫ᩴ;
    .locals 2

    .line 125
    sget-object v0, Ll/۟۟ᩴ;->ORDERED:Ll/۟۟ᩴ;

    .line 509
    iget v1, p1, Ll/۫᩺ᩴ;->m:I

    .line 125
    invoke-virtual {v0, v1}, Ll/۟۟ᩴ;->s(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 126
    new-instance v0, Ll/᩻ܰᩴ;

    const/16 v1, 0x19

    .line 0
    invoke-direct {v0, v1}, Ll/᩻ܰᩴ;-><init>(I)V

    .line 126
    invoke-virtual {p0, p1, p2, v0}, Ll/᩻ܳ᩵;->n0(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Ljava/util/function/IntFunction;)Ll/ۚ۟ᩴ;

    move-result-object p1

    .line 127
    invoke-interface {p1}, Ll/ۚ۟ᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object p1

    return-object p1

    .line 130
    :cond_0
    new-instance v0, Ll/ܰܽ᩵;

    .line 131
    invoke-virtual {p1, p2}, Ll/۫᩺ᩴ;->h0(Ll/ܶ۫ᩴ;)Ll/ܶ۫ᩴ;

    move-result-object p1

    check-cast p1, Ll/ᩴ۫ᩴ;

    iget-object p2, p0, Ll/᩻ܳ᩵;->s:Ljava/util/function/IntPredicate;

    .line 845
    invoke-direct {v0, p1, p2}, Ll/ۢᩳ᩵;-><init>(Ll/ᩴ۫ᩴ;Ljava/util/function/IntPredicate;)V

    return-object v0
.end method

.method public final q0(ILl/֡ᩳ᩵;)Ll/֡ᩳ᩵;
    .locals 0

    .line 145
    new-instance p1, Ll/ۛܿ᩵;

    invoke-direct {p1, p0, p2}, Ll/ۛܿ᩵;-><init>(Ll/᩻ܳ᩵;Ll/֡ᩳ᩵;)V

    return-object p1
.end method
