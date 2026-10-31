.class public final Ll/ܰܺᩳ;
.super Ljava/lang/Object;
.source "A1XZ"


# instance fields
.field public ֫:Ll/۟۬֡;

.field public ۧ:I


# virtual methods
.method public final ֫()I
    .locals 1

    .line 26
    iget v0, p0, Ll/ܰܺᩳ;->ۧ:I

    return v0
.end method

.method public final ֫(Ll/ܶۢᩳ;)V
    .locals 1

    .line 30
    iget-object p1, p1, Ll/ܶۢᩳ;->֫:Ll/֨۫֡;

    iget-object v0, p0, Ll/ܰܺᩳ;->֫:Ll/۟۬֡;

    invoke-virtual {p1, v0}, Ll/֨۫֡;->ۧ(Ll/۟۬֡;)V

    return-void
.end method

.method public final ֫(ILjava/util/List;)Z
    .locals 0

    .line 17
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۟۬֡;

    .line 18
    invoke-static {p1}, Ll/ۙۢᩳ;->ᩳ(Ll/۟۬֡;)Z

    move-result p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return p1

    .line 20
    :cond_0
    iput-object p1, p0, Ll/ܰܺᩳ;->֫:Ll/۟۬֡;

    .line 21
    check-cast p1, Ll/֫ۧۚ;

    invoke-interface {p1}, Ll/֫ۧۚ;->֫()I

    move-result p1

    iput p1, p0, Ll/ܰܺᩳ;->ۧ:I

    const/4 p1, 0x1

    return p1
.end method
