.class public final Ll/֫ܿ᩵;
.super Ll/ܿܰᩴ;
.source "N673"


# instance fields
.field public final j:Ll/ۤܶᩴ;


# direct methods
.method public constructor <init>(Ll/֫ܿ᩵;Ll/ܶ۫ᩴ;)V
    .locals 0

    .line 295
    invoke-direct {p0, p1, p2}, Ll/ܿܰᩴ;-><init>(Ll/ܿܰᩴ;Ll/ܶ۫ᩴ;)V

    .line 296
    iget-object p1, p1, Ll/֫ܿ᩵;->j:Ll/ۤܶᩴ;

    iput-object p1, p0, Ll/֫ܿ᩵;->j:Ll/ۤܶᩴ;

    return-void
.end method

.method public constructor <init>(Ll/ۤܶᩴ;Ll/۫᩺ᩴ;Ll/ܶ۫ᩴ;)V
    .locals 0

    .line 287
    invoke-direct {p0, p2, p3}, Ll/ܿܰᩴ;-><init>(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;)V

    .line 288
    iput-object p1, p0, Ll/֫ܿ᩵;->j:Ll/ۤܶᩴ;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 4

    .line 306
    iget-object v0, p0, Ll/۬ܰᩴ;->a:Ll/ۡ᩺ᩴ;

    iget-object v1, p0, Ll/֫ܿ᩵;->j:Ll/ۤܶᩴ;

    iget-object v1, v1, Ll/ۤܶᩴ;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/function/Supplier;

    invoke-interface {v1}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖᩳ᩵;

    iget-object v2, p0, Ll/۬ܰᩴ;->b:Ll/ܶ۫ᩴ;

    invoke-virtual {v0, v2, v1}, Ll/ۡ᩺ᩴ;->f0(Ll/ܶ۫ᩴ;Ll/֡ᩳ᩵;)Ll/֡ᩳ᩵;

    .line 261
    iget-boolean v0, v1, Ll/ۖᩳ᩵;->b:Z

    .line 307
    iget-object v1, p0, Ll/֫ܿ᩵;->j:Ll/ۤܶᩴ;

    iget-object v1, v1, Ll/ۤܶᩴ;->b:Ljava/lang/Object;

    check-cast v1, Ll/᩶ᩳ᩵;

    .line 0
    iget-boolean v1, v1, Ll/᩶ᩳ᩵;->b:Z

    const/4 v2, 0x0

    if-ne v0, v1, :cond_2

    .line 308
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 152
    iget-object v1, p0, Ll/ܿܰᩴ;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 0
    :cond_0
    invoke-virtual {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    :cond_2
    :goto_0
    return-object v2
.end method

.method public final c(Ll/ܶ۫ᩴ;)Ll/۬ܰᩴ;
    .locals 1

    .line 301
    new-instance v0, Ll/֫ܿ᩵;

    invoke-direct {v0, p0, p1}, Ll/֫ܿ᩵;-><init>(Ll/֫ܿ᩵;Ll/ܶ۫ᩴ;)V

    return-object v0
.end method

.method public final h()Ljava/lang/Object;
    .locals 1

    .line 314
    iget-object v0, p0, Ll/֫ܿ᩵;->j:Ll/ۤܶᩴ;

    iget-object v0, v0, Ll/ۤܶᩴ;->b:Ljava/lang/Object;

    check-cast v0, Ll/᩶ᩳ᩵;

    .line 0
    iget-boolean v0, v0, Ll/᩶ᩳ᩵;->b:Z

    xor-int/lit8 v0, v0, 0x1

    .line 314
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
