.class public final synthetic Ll/᩵ۡ֡;
.super Ljava/lang/Object;
.source "H7IS"


# direct methods
.method public static varargs ֫(Ll/֡ۡ֡;[Ljava/lang/Object;)V
    .locals 4
    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    .line 79
    invoke-static {p1}, Ll/ܽ᩺ᩴ;->of([Ljava/lang/Object;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    .line 63
    invoke-static {p1}, Ll/᩸ۡ֡;->֫(Ll/ܿ᩺ᩴ;)Ll/ܶۡ֡;

    move-result-object p1

    .line 42
    new-instance v0, Ll/᩹ۡ֡;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    check-cast p1, Ll/᩸ۡ֡;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 341
    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 343
    invoke-virtual {p1}, Ll/᩸ۡ֡;->ۧ()Ll/۫ۨᩴ;

    move-result-object p1

    check-cast p1, Ll/ܿ᩺ᩴ;

    new-instance v3, Ll/۠ۡ֡;

    invoke-direct {v3, p0, v1, v0, v2}, Ll/۠ۡ֡;-><init>(Ll/֡ۡ֡;Ljava/util/concurrent/atomic/AtomicReference;Ll/᩹ۡ֡;Ljava/util/concurrent/atomic/AtomicInteger;)V

    invoke-interface {p1, v3}, Ll/ܿ᩺ᩴ;->forEach(Ljava/util/function/Consumer;)V

    .line 357
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    sget p1, Ll/ۘۢ֡;->᩹:I

    const/4 p1, 0x0

    if-eqz p0, :cond_0

    .line 59
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const/4 p1, 0x1

    :cond_1
    if-eqz p1, :cond_2

    return-void

    .line 50
    :cond_2
    new-instance p1, Ll/ۘۢ֡;

    const/4 v0, 0x0

    invoke-direct {p1, v0, p0}, Ll/ۘۢ֡;-><init>(Ljava/lang/String;Ljava/util/List;)V

    throw p1
.end method
