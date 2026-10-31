.class public Ll/ۨ᩸᩵;
.super Ll/۫᩸᩵;
.source "FAXN"


# virtual methods
.method public final ֫(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 2

    const-string v0, "cause"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exception"

    .line 10
    invoke-static {p2, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    sget-object v0, Ll/ۛ᩸᩵;->֫:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    goto :goto_0

    .line 30
    :cond_0
    invoke-super {p0, p1, p2}, Ll/۫᩸᩵;->֫(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    return-void

    .line 28
    :cond_1
    :goto_0
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    return-void
.end method
