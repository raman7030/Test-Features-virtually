.class public final Ll/ܿۗ֨;
.super Ll/֨۬֨;
.source "F416"


# instance fields
.field public final synthetic ۧ:Ll/ۜ۫֨;

.field public final synthetic ܽ:Ll/ۙ֨֨;

.field public final synthetic ᩳ:Ll/ۢۗ֨;


# direct methods
.method public constructor <init>(Ll/ۘ۬֨;Ll/ۢۗ֨;Ll/ۜ۫֨;Ll/ۙ֨֨;)V
    .locals 0

    .line 605
    iput-object p2, p0, Ll/ܿۗ֨;->ᩳ:Ll/ۢۗ֨;

    iput-object p3, p0, Ll/ܿۗ֨;->ۧ:Ll/ۜ۫֨;

    iput-object p4, p0, Ll/ܿۗ֨;->ܽ:Ll/ۙ֨֨;

    invoke-direct {p0, p1}, Ll/֨۬֨;-><init>(Ll/ۘ۬֨;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗ۠۠;Ll/ܽܶ۠;)V
    .locals 2

    .line 616
    iget-object v0, p0, Ll/ܿۗ֨;->ܽ:Ll/ۙ֨֨;

    sget-object v1, Ll/ۙ֨֨;->ۗ:Ll/ۨۚ֨;

    if-eq v0, v1, :cond_1

    .line 617
    invoke-virtual {p2}, Ll/ܽܶ۠;->ᩳ()Ll/ۗ۠۠;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 618
    invoke-virtual {p2}, Ll/ܽܶ۠;->ᩳ()Ll/ۗ۠۠;

    move-result-object v0

    invoke-interface {v0}, Ll/ۗ۠۠;->۟()Ll/ۚۚ۠;

    move-result-object v0

    sget-object v1, Ll/ᩴۚ۠;->ۤ֫:Ll/ᩴۚ۠;

    invoke-virtual {v0, v1}, Ll/ۚۚ۠;->֫(Ll/ᩴۚ۠;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 620
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ܿۗ֨;->ᩳ:Ll/ۢۗ֨;

    iget-object v0, v0, Ll/ۢۗ֨;->ۖ:Ll/ܶ۬֨;

    iget-object v0, v0, Ll/ܶ۬֨;->ᩳ:Ll/ۘ۬֨;

    invoke-interface {v0, p1, p2}, Ll/ۘ۬֨;->֫(Ll/ۗ۠۠;Ll/ܽܶ۠;)V

    return-void
.end method

.method public final ֫(Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/֨᩸۠;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final ۧ()Ll/ۜ۫֨;
    .locals 1

    .line 608
    iget-object v0, p0, Ll/ܿۗ֨;->ۧ:Ll/ۜ۫֨;

    return-object v0
.end method
