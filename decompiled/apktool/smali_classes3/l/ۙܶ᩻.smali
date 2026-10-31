.class public final Ll/ۙܶ᩻;
.super Ll/֫ۜܳ;
.source "O8DV"


# instance fields
.field public ۗ:Ll/ۧ᩸᩻;


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 3

    const-string v0, "tar"

    .line 19
    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->֫(Ljava/lang/String;)V

    .line 21
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v0

    .line 22
    new-instance v1, Ll/ۧ᩸᩻;

    invoke-virtual {p1}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ll/ۧ᩸᩻;-><init>(Ll/ܽۢܳ;Ljava/util/List;)V

    iput-object v1, p0, Ll/ۙܶ᩻;->ۗ:Ll/ۧ᩸᩻;

    .line 24
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    const/4 p1, 0x0

    .line 25
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩳۜܳ;

    .line 26
    invoke-interface {p1}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 27
    iget-object v0, p0, Ll/ۙܶ᩻;->ۗ:Ll/ۧ᩸᩻;

    invoke-virtual {v0, p1}, Ll/ۧ᩸᩻;->ۧ(Ll/ᩳۜܳ;)V

    return-void

    .line 29
    :cond_0
    iget-object v0, p0, Ll/ۙܶ᩻;->ۗ:Ll/ۧ᩸᩻;

    invoke-virtual {v0, p1}, Ll/ۧ᩸᩻;->֫(Ll/ᩳۜܳ;)V

    return-void

    .line 32
    :cond_1
    iget-object v0, p0, Ll/ۙܶ᩻;->ۗ:Ll/ۧ᩸᩻;

    invoke-virtual {p1}, Ll/ۖۢܳ;->᩷()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۧ᩸᩻;->֫(Ljava/lang/String;)V

    return-void
.end method
