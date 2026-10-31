.class public final Ll/᩶ۧ۠;
.super Ll/ۤ֫۠;
.source "A451"


# instance fields
.field public ܽ:Ll/֡ۨ֨;

.field public final synthetic ᩳ:Ll/᩹ܽ۠;


# direct methods
.method public constructor <init>(Ll/᩹ܽ۠;Ll/֡ۨ֨;)V
    .locals 0

    .line 973
    iput-object p1, p0, Ll/᩶ۧ۠;->ᩳ:Ll/᩹ܽ۠;

    invoke-direct {p0, p1}, Ll/ۤ֫۠;-><init>(Ll/᩹ܽ۠;)V

    .line 974
    iput-object p2, p0, Ll/᩶ۧ۠;->ܽ:Ll/֡ۨ֨;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "MethodReferenceCheck"

    return-object v0
.end method

.method public final ֫(Ll/ۖܶ۠;)Ll/۠ۧ۠;
    .locals 2

    .line 1008
    new-instance v0, Ll/ۜܽ۠;

    iget-object v1, p0, Ll/᩶ۧ۠;->ᩳ:Ll/᩹ܽ۠;

    invoke-direct {v0, v1, p1}, Ll/ۜܽ۠;-><init>(Ll/᩹ܽ۠;Ll/ۖܶ۠;)V

    return-object v0
.end method

.method public final ֫(Ll/ۗ۠۠;ZLl/ۙ֨֨;Ll/ۙ֨֨;Ll/ۜ۫֨;Ll/֨᩸۠;)V
    .locals 7

    .line 985
    new-instance v6, Ll/᩹ۧ۠;

    iget-object v0, p5, Ll/ۜ۫֨;->ܳ:Ll/ܽܽ۠;

    invoke-virtual {v0}, Ll/ܽܽ۠;->֫()Z

    move-result v0

    xor-int/lit8 v2, v0, 0x1

    move-object v0, v6

    move-object v1, p0

    move-object v3, p5

    move-object v4, p6

    move v5, p2

    invoke-direct/range {v0 .. v5}, Ll/᩹ۧ۠;-><init>(Ll/᩶ۧ۠;ZLl/ۜ۫֨;Ll/֨᩸۠;Z)V

    .line 1003
    new-instance p2, Ll/ᩳܽ۠;

    iget-object p5, p0, Ll/᩶ۧ۠;->ᩳ:Ll/᩹ܽ۠;

    invoke-direct {p2, p5, p4, v6}, Ll/ᩳܽ۠;-><init>(Ll/᩹ܽ۠;Ll/ۙ֨֨;Ll/ۘ۬֨;)V

    .line 980
    invoke-virtual {p2, p1, p3}, Ll/ᩳܽ۠;->֫(Ll/ۗ۠۠;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    return-void
.end method
