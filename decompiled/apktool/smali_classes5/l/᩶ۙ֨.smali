.class public final Ll/᩶ۙ֨;
.super Ll/֨۬֨;
.source "F416"


# instance fields
.field public final synthetic ۧ:Ll/ۢۗ֨;


# direct methods
.method public constructor <init>(Ll/ۢۗ֨;Ll/ۘ۬֨;)V
    .locals 0

    .line 2093
    iput-object p1, p0, Ll/᩶ۙ֨;->ۧ:Ll/ۢۗ֨;

    invoke-direct {p0, p2}, Ll/֨۬֨;-><init>(Ll/ۘ۬֨;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗ۠۠;Ll/ܽܶ۠;)V
    .locals 4

    .line 2099
    iget-object v0, p0, Ll/᩶ۙ֨;->ۧ:Ll/ۢۗ֨;

    iget-object v0, v0, Ll/ۢۗ֨;->֡:Ll/ۛ۠۠;

    sget-object v1, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 7228
    new-instance v1, Ll/ۨ۠۠;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    const-string p2, "compiler"

    const-string v3, "incompatible.type.in.conditional"

    invoke-direct {v1, p2, v3, v2}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2099
    invoke-virtual {v0, v1}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object p2

    iget-object v0, p0, Ll/֨۬֨;->֫:Ll/ۘ۬֨;

    invoke-interface {v0, p1, p2}, Ll/ۘ۬֨;->֫(Ll/ۗ۠۠;Ll/ܽܶ۠;)V

    return-void
.end method
