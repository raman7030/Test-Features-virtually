.class public abstract Ll/ۡۤ᩵;
.super Ljava/lang/Object;
.source "6428"

# interfaces
.implements Ll/ᩴۤ᩵;


# virtual methods
.method public abstract ֫(Ll/۬ۤ᩵;Ll/ۨܶ᩵;)Ljava/lang/Object;
.end method

.method public final ֫(Ll/᩵ۤ᩵;Ll/ۨܶ᩵;)Ljava/lang/Object;
    .locals 5

    .line 2
    instance-of v0, p2, Ll/ۢۤ᩵;

    if-eqz v0, :cond_0

    .line 7
    move-object v0, p2

    check-cast v0, Ll/ۢۤ᩵;

    .line 9
    iget v1, v0, Ll/ۢۤ᩵;->ۗ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    .line 18
    iput v1, v0, Ll/ۢۤ᩵;->ۗ:I

    goto :goto_0

    .line 21
    :cond_0
    new-instance v0, Ll/ۢۤ᩵;

    .line 23
    check-cast p2, Ll/ᩴ᩸᩵;

    .line 26
    invoke-direct {v0, p0, p2}, Ll/ۢۤ᩵;-><init>(Ll/ۡۤ᩵;Ll/ᩴ᩸᩵;)V

    .line 28
    :goto_0
    iget-object p2, v0, Ll/ۢۤ᩵;->۬:Ljava/lang/Object;

    .line 57
    sget-object v1, Ll/ۜ᩸᩵;->᩶:Ll/ۜ᩸᩵;

    .line 227
    iget v2, v0, Ll/ۢۤ᩵;->ۗ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Ll/ۢۤ᩵;->ۙ:Ll/۬ۤ᩵;

    :try_start_0
    invoke-static {p2}, Ll/ᩴ۠᩵;->֫(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    .line 234
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 227
    :cond_2
    invoke-static {p2}, Ll/ᩴ۠᩵;->֫(Ljava/lang/Object;)V

    .line 228
    new-instance p2, Ll/۬ۤ᩵;

    invoke-virtual {v0}, Ll/ᩴ᩸᩵;->getContext()Ll/ܳ᩸᩵;

    move-result-object v2

    invoke-direct {p2, p1, v2}, Ll/۬ۤ᩵;-><init>(Ll/᩵ۤ᩵;Ll/ܳ᩸᩵;)V

    .line 230
    :try_start_1
    iput-object p2, v0, Ll/ۢۤ᩵;->ۙ:Ll/۬ۤ᩵;

    iput v3, v0, Ll/ۢۤ᩵;->ۗ:I

    invoke-virtual {p0, p2, v0}, Ll/ۡۤ᩵;->֫(Ll/۬ۤ᩵;Ll/ۨܶ᩵;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p2

    .line 232
    :goto_1
    invoke-virtual {p1}, Ll/۬ۤ᩵;->᩻()V

    .line 234
    sget-object p1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    return-object p1

    :catchall_1
    move-exception p1

    move-object v4, p2

    move-object p2, p1

    move-object p1, v4

    .line 232
    :goto_2
    invoke-virtual {p1}, Ll/۬ۤ᩵;->᩻()V

    throw p2
.end method
