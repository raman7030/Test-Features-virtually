.class public final Ll/ۘܽܺ;
.super Ll/ܿᩴܺ;
.source "QB8X"


# virtual methods
.method public final ֫(ILl/ܰۡܺ;)V
    .locals 2

    .line 61
    instance-of v0, p2, Ll/۬ܺܺ;

    if-nez v0, :cond_1

    instance-of v0, p2, Ll/۫ܺܺ;

    if-nez v0, :cond_1

    instance-of v0, p2, Ll/ۖܺܺ;

    if-nez v0, :cond_1

    instance-of v0, p2, Ll/۠ܺܺ;

    if-nez v0, :cond_1

    instance-of v0, p2, Ll/ܺܺܺ;

    if-nez v0, :cond_1

    instance-of v0, p2, Ll/᩷ܺܺ;

    if-nez v0, :cond_1

    instance-of v0, p2, Ll/᩸ܺܺ;

    if-nez v0, :cond_1

    instance-of v0, p2, Ll/ۙܺܺ;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 71
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    .line 72
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "bad type for bootstrap argument: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 69
    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2}, Ll/ܿᩴܺ;->֫(ILjava/lang/Object;)V

    return-void
.end method
