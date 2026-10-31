.class public final Ll/᩺᩵֨;
.super Ll/ۚ᩵֨;
.source "R450"


# virtual methods
.method public final ֫(Ll/ۛ᩸֨;Ll/ܰ᩵֨;Ll/᩵᩵֨;Ll/ۧ֡۠;Ll/ۙᩳ۠;)V
    .locals 10

    .line 888
    iget-object v0, p0, Ll/ܿ᩵֨;->ᩳ:Ll/ᩴܶ۠;

    invoke-virtual {v0}, Ll/ᩴܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۟᩵֨;

    .line 889
    instance-of v2, v1, Ll/ᩴ᩵֨;

    invoke-static {v2}, Ll/۫ۙ;->֫(Z)V

    .line 890
    check-cast v1, Ll/ᩴ᩵֨;

    .line 891
    invoke-static {v1}, Ll/ᩴ᩵֨;->ܽ(Ll/ᩴ᩵֨;)Ll/۟᩵֨;

    move-result-object v2

    if-ne v2, p2, :cond_0

    invoke-static {v1}, Ll/ᩴ᩵֨;->֫(Ll/ᩴ᩵֨;)Ll/᩵᩵֨;

    move-result-object v2

    if-ne v2, p3, :cond_0

    invoke-static {v1}, Ll/ᩴ᩵֨;->ۧ(Ll/ᩴ᩵֨;)Ll/ۧ֡۠;

    move-result-object v1

    iget-boolean v1, v1, Ll/ۧ֡۠;->۫:Z

    iget-boolean v2, p4, Ll/ۧ֡۠;->۫:Z

    if-ne v1, v2, :cond_0

    return-void

    .line 895
    :cond_1
    new-instance v0, Ll/ᩴ᩵֨;

    const/4 v6, 0x0

    move-object v3, v0

    move-object v4, p1

    move-object v5, p2

    move-object v7, p3

    move-object v8, p4

    move-object v9, p5

    invoke-direct/range {v3 .. v9}, Ll/ᩴ᩵֨;-><init>(Ll/ۛ᩸֨;Ll/۟᩵֨;Ll/ۤܶ۠;Ll/᩵᩵֨;Ll/ۧ֡۠;Ljava/util/function/BiConsumer;)V

    invoke-virtual {p0, v0}, Ll/ܿ᩵֨;->ۧ(Ll/۟᩵֨;)V

    return-void
.end method

.method public final ᩳ()Z
    .locals 1

    .line 899
    iget-object v0, p0, Ll/ܿ᩵֨;->ᩳ:Ll/ᩴܶ۠;

    invoke-virtual {v0}, Ll/ᩴܶ۠;->ᩳ()Z

    move-result v0

    return v0
.end method
