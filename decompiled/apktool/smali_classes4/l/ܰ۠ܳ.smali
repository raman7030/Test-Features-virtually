.class public final Ll/ܰ۠ܳ;
.super Ll/۬ۗܿ;
.source "37CJ"


# virtual methods
.method public final ᩴ()V
    .locals 2

    .line 159
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 160
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 161
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void

    :cond_0
    const/4 v1, -0x1

    .line 104
    invoke-static {v1, v0}, Ll/֫᩸ܳ;->֫(ILjava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const v0, 0x7f12042c

    .line 165
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->ۧ(I)V

    return-void

    .line 168
    :cond_1
    invoke-static {v0}, Ll/֫᩸ܳ;->֫(Ljava/lang/String;)V

    .line 169
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void
.end method
