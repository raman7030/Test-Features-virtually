.class public final Ll/ۗᩴܳ;
.super Ll/۬ۗܿ;
.source "715M"


# virtual methods
.method public final ᩴ()V
    .locals 2

    .line 615
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    .line 616
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 617
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void

    .line 620
    :cond_0
    invoke-static {v0}, Ll/ۡᩴܳ;->ۧ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const v0, 0x7f12042c

    .line 621
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->ۧ(I)V

    return-void

    .line 624
    :cond_1
    invoke-static {v0}, Ll/ۡᩴܳ;->֫(Ljava/lang/String;)V

    .line 625
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void
.end method
