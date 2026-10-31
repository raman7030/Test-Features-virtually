.class public final Ll/ۗۙ֨;
.super Ll/֨۬֨;
.source "F416"


# instance fields
.field public final synthetic ۧ:Ll/ۢۗ֨;

.field public final synthetic ܽ:Ll/᩵֡۠;

.field public final synthetic ᩳ:Ll/᩶֡֨;


# direct methods
.method public constructor <init>(Ll/ۢۗ֨;Ll/ۘ۬֨;Ll/᩵֡۠;Ll/᩶֡֨;)V
    .locals 0

    .line 3008
    iput-object p1, p0, Ll/ۗۙ֨;->ۧ:Ll/ۢۗ֨;

    iput-object p3, p0, Ll/ۗۙ֨;->ܽ:Ll/᩵֡۠;

    iput-object p4, p0, Ll/ۗۙ֨;->ᩳ:Ll/᩶֡֨;

    invoke-direct {p0, p2}, Ll/֨۬֨;-><init>(Ll/ۘ۬֨;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗ۠۠;Ll/ܽܶ۠;)V
    .locals 7

    .line 3011
    iget-object p1, p0, Ll/ۗۙ֨;->ܽ:Ll/᩵֡۠;

    iget-object p1, p1, Ll/᩵֡۠;->۫:Ll/۫᩵۠;

    iget-object v0, p0, Ll/ۗۙ֨;->ۧ:Ll/ۢۗ֨;

    iget-object v0, v0, Ll/ۢۗ֨;->֡:Ll/ۛ۠۠;

    .line 3012
    sget-object v1, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 6735
    new-instance v1, Ll/ۨ۠۠;

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Ll/ۗۙ֨;->ᩳ:Ll/᩶֡֨;

    aput-object v5, v3, v4

    const-string v5, "compiler"

    const-string v6, "diamond"

    invoke-direct {v1, v5, v6, v3}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6299
    new-instance v3, Ll/ۨ۠۠;

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v1, v6, v4

    aput-object p2, v6, v2

    const-string p2, "cant.apply.diamond.1"

    invoke-direct {v3, v5, p2, v6}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3012
    invoke-virtual {v0, v3}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object p2

    .line 3011
    iget-object v0, p0, Ll/֨۬֨;->֫:Ll/ۘ۬֨;

    invoke-interface {v0, p1, p2}, Ll/ۘ۬֨;->֫(Ll/ۗ۠۠;Ll/ܽܶ۠;)V

    return-void
.end method
