.class public final Ll/ܰۙ֨;
.super Ll/۟ۙ֨;
.source "F416"


# instance fields
.field public ܽ:Z

.field public final synthetic ܿ:Ll/ۢۗ֨;

.field public ᩳ:Ll/۫᩵۠;


# direct methods
.method public constructor <init>(Ll/ۢۗ֨;Ll/۫᩵۠;Ll/ۘ۬֨;)V
    .locals 0

    .line 3412
    iput-object p1, p0, Ll/ܰۙ֨;->ܿ:Ll/ۢۗ֨;

    .line 3413
    invoke-direct {p0, p1, p3}, Ll/۟ۙ֨;-><init>(Ll/ۢۗ֨;Ll/ۘ۬֨;)V

    .line 3414
    iput-object p2, p0, Ll/ܰۙ֨;->ᩳ:Ll/۫᩵۠;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗ۠۠;Ll/ܽܶ۠;)V
    .locals 1

    .line 3419
    iget-boolean v0, p0, Ll/ܰۙ֨;->ܽ:Z

    if-eqz v0, :cond_0

    .line 3420
    iget-object p2, p0, Ll/ܰۙ֨;->ܿ:Ll/ۢۗ֨;

    iget-object p2, p2, Ll/ۢۗ֨;->֡:Ll/ۛ۠۠;

    sget-object v0, Ll/ۨᩴ۠;->ۨ֫:Ll/ۨ۠۠;

    invoke-virtual {p2, v0}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object p2

    iget-object v0, p0, Ll/֨۬֨;->֫:Ll/ۘ۬֨;

    invoke-interface {v0, p1, p2}, Ll/ۘ۬֨;->֫(Ll/ۗ۠۠;Ll/ܽܶ۠;)V

    return-void

    .line 3422
    :cond_0
    invoke-super {p0, p1, p2}, Ll/۟ۙ֨;->֫(Ll/ۗ۠۠;Ll/ܽܶ۠;)V

    return-void
.end method

.method public final ֫(Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/֨᩸۠;)Z
    .locals 1

    .line 3429
    sget-object v0, Ll/ۢ۠֨;->ᩴ֫:Ll/ۢ۠֨;

    invoke-virtual {p2, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    .line 3430
    iput-boolean p1, p0, Ll/ܰۙ֨;->ܽ:Z

    .line 3431
    iget-object p1, p0, Ll/ܰۙ֨;->ᩳ:Ll/۫᩵۠;

    invoke-static {p1}, Ll/۟ۚ۠;->֫(Ll/۫᩵۠;)Z

    move-result p1

    return p1

    .line 3433
    :cond_0
    invoke-super {p0, p1, p2, p3}, Ll/۟ۙ֨;->֫(Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/֨᩸۠;)Z

    move-result p1

    return p1
.end method
