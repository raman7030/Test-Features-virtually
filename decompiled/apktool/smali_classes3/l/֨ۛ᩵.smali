.class public Ll/֨ۛ᩵;
.super Ll/ۧۗ᩵;
.source "JAW9"

# interfaces
.implements Ll/᩵᩸᩵;


# virtual methods
.method public final ۡ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ۧ()Ll/᩵᩸᩵;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public ܽ(Ljava/lang/Object;)V
    .locals 2

    const/4 v0, 0x0

    .line 28
    invoke-static {v0}, Ll/᩹ܽܽ;->֫(Ll/ۨܶ᩵;)Ll/ۨܶ᩵;

    move-result-object v0

    .line 26
    instance-of v1, p1, Ll/ᩴۗ᩵;

    if-eqz v1, :cond_0

    .line 27
    check-cast p1, Ll/ᩴۗ᩵;

    iget-object p1, p1, Ll/ᩴۗ᩵;->֫:Ljava/lang/Throwable;

    invoke-static {p1}, Ll/ᩴ۠᩵;->֫(Ljava/lang/Throwable;)Ll/ۖ۠᩵;

    move-result-object p1

    .line 278
    :cond_0
    invoke-static {p1, v0}, Ll/ܽۛ᩵;->֫(Ljava/lang/Object;Ll/ۨܶ᩵;)V

    return-void
.end method

.method public ᩳ(Ljava/lang/Object;)V
    .locals 1

    .line 26
    instance-of v0, p1, Ll/ᩴۗ᩵;

    if-eqz v0, :cond_0

    .line 27
    check-cast p1, Ll/ᩴۗ᩵;

    iget-object p1, p1, Ll/ᩴۗ᩵;->֫:Ljava/lang/Throwable;

    invoke-static {p1}, Ll/ᩴ۠᩵;->֫(Ljava/lang/Throwable;)Ll/ۖ۠᩵;

    :cond_0
    const/4 p1, 0x0

    .line 33
    throw p1
.end method
