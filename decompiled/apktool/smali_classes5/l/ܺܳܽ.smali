.class public final Ll/ܺܳܽ;
.super Ll/᩵ܳܽ;
.source "91FI"


# virtual methods
.method public final ֫(Ll/ܰܿܽ;Ll/᩷᩻ܽ;Ll/ܳܳܽ;Ll/ᩳܳܽ;)V
    .locals 3

    .line 14
    invoke-interface {p2}, Ll/᩷᩻ܽ;->᩻֫()Z

    move-result v0

    if-nez v0, :cond_4

    .line 18
    invoke-interface {p2}, Ll/᩷᩻ܽ;->getValue()Ll/֨᩻ܽ;

    move-result-object v0

    .line 19
    invoke-interface {v0}, Ll/֨᩻ܽ;->ᩳ֫()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ll/֨᩻ܽ;->ܿۧ()Ll/ۗ᩻ܽ;

    move-result-object v1

    invoke-interface {v1}, Ll/ۗ᩻ܽ;->᩺֫()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0}, Ll/֨᩻ܽ;->ܿۧ()Ll/ۗ᩻ܽ;

    move-result-object v1

    invoke-interface {v1}, Ll/ۗ᩻ܽ;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p3, 0x1

    goto :goto_0

    .line 22
    :cond_0
    invoke-interface {v0}, Ll/֨᩻ܽ;->ۖ()I

    move-result v1

    const/16 v2, 0x12

    if-eq v1, v2, :cond_1

    .line 23
    invoke-super {p0, p1, p2, p3, p4}, Ll/᩵ܳܽ;->֫(Ll/ܰܿܽ;Ll/᩷᩻ܽ;Ll/ܳܳܽ;Ll/ᩳܳܽ;)V

    return-void

    .line 26
    :cond_1
    invoke-interface {v0}, Ll/֨᩻ܽ;->getValue()I

    move-result v0

    if-eqz v0, :cond_2

    .line 27
    invoke-super {p0, p1, p2, p3, p4}, Ll/᩵ܳܽ;->֫(Ll/ܰܿܽ;Ll/᩷᩻ܽ;Ll/ܳܳܽ;Ll/ᩳܳܽ;)V

    return-void

    :cond_2
    const/4 p3, 0x0

    :goto_0
    const-string v0, "id"

    .line 31
    invoke-interface {p1, v0}, Ll/ܰܿܽ;->ۧ(Ljava/lang/String;)V

    const-string v1, "name"

    .line 32
    invoke-interface {p2}, Ll/᩷᩻ܽ;->۟֫()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v1, v2}, Ll/ܰܿܽ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p3, :cond_3

    const-string p3, "explicit"

    const-string v1, "true"

    .line 34
    invoke-interface {p1, p3, v1}, Ll/ܰܿܽ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    :cond_3
    invoke-static {p1, p2, p4}, Ll/ۢܳܽ;->֫(Ll/ܰܿܽ;Ll/᩷᩻ܽ;Ll/ᩳܳܽ;)V

    .line 37
    invoke-interface {p1, v0}, Ll/ܰܿܽ;->֫(Ljava/lang/String;)V

    return-void

    .line 15
    :cond_4
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method
