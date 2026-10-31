.class public final Ll/ܰ۬᩵;
.super Ljava/lang/Object;


# direct methods
.method public static final ֫(Ll/ܳ᩸᩵;)V
    .locals 1

    .line 589
    sget-object v0, Ll/ۤ۬᩵;->֨:Ll/۫۬᩵;

    sget-object v0, Ll/۫۬᩵;->᩸:Ll/۫۬᩵;

    invoke-interface {p0, v0}, Ll/ܳ᩸᩵;->֫(Ll/ܿ᩸᩵;)Ll/ᩳ᩸᩵;

    move-result-object p0

    check-cast p0, Ll/ۤ۬᩵;

    if-eqz p0, :cond_1

    .line 571
    invoke-interface {p0}, Ll/ۤ۬᩵;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Ll/ۤ۬᩵;->ᩳ()Ljava/util/concurrent/CancellationException;

    move-result-object p0

    throw p0

    :cond_1
    :goto_0
    return-void
.end method

.method public static final ֫(Ll/ܳ᩸᩵;Ljava/util/concurrent/CancellationException;)V
    .locals 1

    .line 549
    sget-object v0, Ll/ۤ۬᩵;->֨:Ll/۫۬᩵;

    sget-object v0, Ll/۫۬᩵;->᩸:Ll/۫۬᩵;

    invoke-interface {p0, v0}, Ll/ܳ᩸᩵;->֫(Ll/ܿ᩸᩵;)Ll/ᩳ᩸᩵;

    move-result-object p0

    check-cast p0, Ll/ۤ۬᩵;

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Ll/ۤ۬᩵;->֫(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    return-void
.end method
