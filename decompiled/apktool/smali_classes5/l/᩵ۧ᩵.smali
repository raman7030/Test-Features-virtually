.class public Ll/᩵ۧ᩵;
.super Ll/۬ܰᩴ;
.source "N673"


# instance fields
.field public final h:Ll/ۡ᩺ᩴ;

.field public final i:Ljava/util/function/LongFunction;

.field public final j:Ljava/util/function/BinaryOperator;


# direct methods
.method public constructor <init>(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Ljava/util/function/LongFunction;Ljava/util/function/BinaryOperator;)V
    .locals 0

    .line 2168
    invoke-direct {p0, p1, p2}, Ll/۬ܰᩴ;-><init>(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;)V

    .line 2169
    iput-object p1, p0, Ll/᩵ۧ᩵;->h:Ll/ۡ᩺ᩴ;

    .line 2170
    iput-object p3, p0, Ll/᩵ۧ᩵;->i:Ljava/util/function/LongFunction;

    .line 2171
    iput-object p4, p0, Ll/᩵ۧ᩵;->j:Ljava/util/function/BinaryOperator;

    return-void
.end method

.method public constructor <init>(Ll/᩵ۧ᩵;Ll/ܶ۫ᩴ;)V
    .locals 0

    .line 2176
    invoke-direct {p0, p1, p2}, Ll/۬ܰᩴ;-><init>(Ll/۬ܰᩴ;Ll/ܶ۫ᩴ;)V

    .line 2177
    iget-object p2, p1, Ll/᩵ۧ᩵;->h:Ll/ۡ᩺ᩴ;

    iput-object p2, p0, Ll/᩵ۧ᩵;->h:Ll/ۡ᩺ᩴ;

    .line 2178
    iget-object p2, p1, Ll/᩵ۧ᩵;->i:Ljava/util/function/LongFunction;

    iput-object p2, p0, Ll/᩵ۧ᩵;->i:Ljava/util/function/LongFunction;

    .line 2179
    iget-object p1, p1, Ll/᩵ۧ᩵;->j:Ljava/util/function/BinaryOperator;

    iput-object p1, p0, Ll/᩵ۧ᩵;->j:Ljava/util/function/BinaryOperator;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    .line 2157
    invoke-virtual {p0}, Ll/᩵ۧ᩵;->f()Ll/ۚ۟ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public c(Ll/ܶ۫ᩴ;)Ll/۬ܰᩴ;
    .locals 1

    .line 2184
    new-instance v0, Ll/᩵ۧ᩵;

    invoke-direct {v0, p0, p1}, Ll/᩵ۧ᩵;-><init>(Ll/᩵ۧ᩵;Ll/ܶ۫ᩴ;)V

    return-object v0
.end method

.method public final f()Ll/ۚ۟ᩴ;
    .locals 3

    .line 2190
    iget-object v0, p0, Ll/᩵ۧ᩵;->i:Ljava/util/function/LongFunction;

    iget-object v1, p0, Ll/᩵ۧ᩵;->h:Ll/ۡ᩺ᩴ;

    iget-object v2, p0, Ll/۬ܰᩴ;->b:Ll/ܶ۫ᩴ;

    invoke-virtual {v1, v2}, Ll/ۡ᩺ᩴ;->R(Ll/ܶ۫ᩴ;)J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Ljava/util/function/LongFunction;->apply(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۡܳ᩵;

    .line 2191
    iget-object v1, p0, Ll/᩵ۧ᩵;->h:Ll/ۡ᩺ᩴ;

    iget-object v2, p0, Ll/۬ܰᩴ;->b:Ll/ܶ۫ᩴ;

    invoke-virtual {v1, v2, v0}, Ll/ۡ᩺ᩴ;->f0(Ll/ܶ۫ᩴ;Ll/֡ᩳ᩵;)Ll/֡ᩳ᩵;

    invoke-interface {v0}, Ll/ۡܳ᩵;->build()Ll/ۚ۟ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final onCompletion(Ljava/util/concurrent/CountedCompleter;)V
    .locals 3

    .line 267
    iget-object v0, p0, Ll/۬ܰᩴ;->d:Ll/۬ܰᩴ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 2197
    :cond_0
    iget-object v1, p0, Ll/᩵ۧ᩵;->j:Ljava/util/function/BinaryOperator;

    check-cast v0, Ll/᩵ۧ᩵;

    .line 245
    iget-object v0, v0, Ll/۬ܰᩴ;->f:Ljava/lang/Object;

    .line 2197
    check-cast v0, Ll/ۚ۟ᩴ;

    iget-object v2, p0, Ll/۬ܰᩴ;->e:Ll/۬ܰᩴ;

    check-cast v2, Ll/᩵ۧ᩵;

    .line 245
    iget-object v2, v2, Ll/۬ܰᩴ;->f:Ljava/lang/Object;

    .line 2197
    check-cast v2, Ll/ۚ۟ᩴ;

    invoke-interface {v1, v0, v2}, Ljava/util/function/BinaryOperator;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚ۟ᩴ;

    .line 255
    iput-object v0, p0, Ll/۬ܰᩴ;->f:Ljava/lang/Object;

    .line 2198
    :goto_0
    invoke-super {p0, p1}, Ll/۬ܰᩴ;->onCompletion(Ljava/util/concurrent/CountedCompleter;)V

    return-void
.end method
