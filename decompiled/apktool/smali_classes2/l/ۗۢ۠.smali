.class public final Ll/ۗۢ۠;
.super Ll/ۖ᩸֨;
.source "07LE"


# instance fields
.field public ۧ:Ll/ܶ֨۠;

.field public final synthetic ܽ:Ll/۫ۢ۠;


# direct methods
.method public constructor <init>(Ll/۫ۢ۠;Ll/ۛ᩸֨;)V
    .locals 0

    .line 280
    iput-object p1, p0, Ll/ۗۢ۠;->ܽ:Ll/۫ۢ۠;

    .line 281
    invoke-direct {p0, p2}, Ll/ۖ᩸֨;-><init>(Ll/ۛ᩸֨;)V

    .line 278
    new-instance p1, Ll/ܶ֨۠;

    const/16 p2, 0x40

    .line 52
    invoke-direct {p1, p2}, Ll/ܶ֨۠;-><init>(I)V

    .line 278
    iput-object p1, p0, Ll/ۗۢ۠;->ۧ:Ll/ܶ֨۠;

    return-void
.end method


# virtual methods
.method public final ֫(C)V
    .locals 1

    .line 304
    iget-object v0, p0, Ll/ۗۢ۠;->ۧ:Ll/ܶ֨۠;

    invoke-virtual {v0, p1}, Ll/ܶ֨۠;->֫(I)V

    return-void
.end method

.method public final ֫(Ll/ۤܶ۠;)V
    .locals 3

    .line 147
    invoke-virtual {p1}, Ll/ۤܶ۠;->֫()[B

    move-result-object v0

    invoke-virtual {p1}, Ll/ۤܶ۠;->ᩳ()I

    move-result v1

    invoke-virtual {p1}, Ll/ۤܶ۠;->ۧ()I

    move-result p1

    iget-object v2, p0, Ll/ۗۢ۠;->ۧ:Ll/ܶ֨۠;

    invoke-virtual {v2, v1, p1, v0}, Ll/ܶ֨۠;->֫(II[B)V

    return-void
.end method

.method public final ֫(Ll/ܳ֡֨;)V
    .locals 1

    .line 319
    iget-object v0, p0, Ll/ۗۢ۠;->ܽ:Ll/۫ۢ۠;

    invoke-virtual {v0, p1}, Ll/۫ۢ۠;->֫(Ll/ܳ֡֨;)V

    return-void
.end method

.method public final ֫([B)V
    .locals 3

    const/4 v0, 0x0

    .line 82
    array-length v1, p1

    iget-object v2, p0, Ll/ۗۢ۠;->ۧ:Ll/ܶ֨۠;

    invoke-virtual {v2, v0, v1, p1}, Ll/ܶ֨۠;->֫(II[B)V

    return-void
.end method

.method public final ۧ(Ll/ۙ֨֨;)V
    .locals 2

    .line 290
    sget-object v0, Ll/ۙۢ۠;->֫:[I

    invoke-virtual {p1}, Ll/ۙ֨֨;->֫֫()Ll/ۢ۠֨;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 298
    invoke-super {p0, p1}, Ll/ۖ᩸֨;->ۧ(Ll/ۙ֨֨;)V

    return-void

    .line 295
    :cond_0
    iget-object v0, p0, Ll/ۗۢ۠;->ܽ:Ll/۫ۢ۠;

    invoke-static {v0}, Ll/۫ۢ۠;->ۧ(Ll/۫ۢ۠;)Ll/ۛ᩸֨;

    move-result-object v0

    check-cast p1, Ll/ܽۡ۠;

    iget-object p1, p1, Ll/ۙۚ֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v0, p1}, Ll/ۛ᩸֨;->ۢ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۗۢ۠;->ۧ(Ll/ۙ֨֨;)V

    return-void
.end method
