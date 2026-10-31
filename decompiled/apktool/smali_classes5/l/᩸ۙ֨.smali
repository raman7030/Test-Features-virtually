.class public final Ll/᩸ۙ֨;
.super Ll/֨۬֨;
.source "F416"


# instance fields
.field public final synthetic ۧ:Ll/ۢۗ֨;


# direct methods
.method public constructor <init>(Ll/ۢۗ֨;Ll/ۘ۬֨;)V
    .locals 0

    .line 1897
    iput-object p1, p0, Ll/᩸ۙ֨;->ۧ:Ll/ۢۗ֨;

    invoke-direct {p0, p2}, Ll/֨۬֨;-><init>(Ll/ۘ۬֨;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗ۠۠;Ll/ܽܶ۠;)V
    .locals 5

    .line 1900
    iget-object v0, p0, Ll/᩸ۙ֨;->ۧ:Ll/ۢۗ֨;

    iget-object v1, v0, Ll/ۢۗ֨;->ۖ:Ll/ܶ۬֨;

    iget-object v1, v1, Ll/ܶ۬֨;->ᩳ:Ll/ۘ۬֨;

    iget-object v0, v0, Ll/ۢۗ֨;->֡:Ll/ۛ۠۠;

    sget-object v2, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 8157
    new-instance v2, Ll/ۨ۠۠;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p2, v3, v4

    const-string p2, "compiler"

    const-string v4, "try.not.applicable.to.type"

    invoke-direct {v2, p2, v4, v3}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1900
    invoke-virtual {v0, v2}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object p2

    check-cast v1, Ll/᩻۬֨;

    invoke-virtual {v1, p1, p2}, Ll/᩻۬֨;->֫(Ll/ۗ۠۠;Ll/ܽܶ۠;)V

    return-void
.end method
