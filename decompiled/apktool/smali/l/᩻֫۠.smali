.class public final Ll/᩻֫۠;
.super Ll/ᩳۧ۠;
.source "A451"


# instance fields
.field public final synthetic ۜ:Ll/ۗ۠۠;

.field public final synthetic ᩻:Ll/᩹ܽ۠;


# direct methods
.method public constructor <init>(Ll/᩹ܽ۠;Ll/ۤܶ۠;Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/ۖܶ۠;Ll/ۗ۠۠;)V
    .locals 0

    .line 2858
    iput-object p1, p0, Ll/᩻֫۠;->᩻:Ll/᩹ܽ۠;

    iput-object p6, p0, Ll/᩻֫۠;->ۜ:Ll/ۗ۠۠;

    invoke-direct/range {p0 .. p5}, Ll/ᩳۧ۠;-><init>(Ll/᩹ܽ۠;Ll/ۤܶ۠;Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/ۖܶ۠;)V

    return-void
.end method


# virtual methods
.method public final ۧ(Ll/֫ۤ֨;Ll/ܽܽ۠;)Ll/ۛ֡֨;
    .locals 7

    .line 2861
    iget-object v2, p0, Ll/֨ۧ۠;->ᩳ:Ll/ۙ֨֨;

    .line 2862
    invoke-virtual {p2}, Ll/ܽܽ۠;->֫()Z

    .line 2863
    invoke-virtual {p2}, Ll/ܽܽ۠;->ۧ()Z

    move-result v6

    .line 2892
    iget-object p2, p0, Ll/᩻֫۠;->᩻:Ll/᩹ܽ۠;

    iget-object v0, p2, Ll/᩹ܽ۠;->۬:Ll/ۛܶ۠;

    iget-object v3, v0, Ll/ۛܶ۠;->ᩴۧ:Ll/ۤܶ۠;

    iget-object v4, p0, Ll/֨ۧ۠;->֫:Ll/ۖܶ۠;

    iget-object v5, p0, Ll/֨ۧ۠;->ܿ:Ll/ۖܶ۠;

    move-object v0, p2

    move-object v1, p1

    invoke-virtual/range {v0 .. v6}, Ll/᩹ܽ۠;->֫(Ll/֫ۤ֨;Ll/ۙ֨֨;Ll/ۤܶ۠;Ll/ۖܶ۠;Ll/ۖܶ۠;Z)Ll/ۛ֡֨;

    move-result-object v0

    .line 2896
    iget-object p2, p2, Ll/᩹ܽ۠;->ܺ:Ll/ܶ۬֨;

    iget-object v1, p1, Ll/֫ۤ֨;->ۙ:Ljava/lang/Object;

    check-cast v1, Ll/ۡۗ֨;

    iget-object v1, v1, Ll/ۡۗ֨;->ۘ:Ll/ܰ᩵֨;

    iget-object v1, v1, Ll/۟᩵֨;->ۧ:Ll/ۛ֡֨;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3554
    new-instance v2, Ll/ᩳ۬֨;

    iget-object v3, p0, Ll/᩻֫۠;->ۜ:Ll/ۗ۠۠;

    invoke-direct {v2, v3}, Ll/ᩳ۬֨;-><init>(Ll/ۗ۠۠;)V

    invoke-virtual {p2, v2, v1, v0}, Ll/ܶ۬֨;->֫(Ljava/util/function/Supplier;Ll/ۛ֡֨;Ll/ۛ֡֨;)V

    .line 2897
    iget-object p1, p1, Ll/֫ۤ֨;->ۙ:Ljava/lang/Object;

    check-cast p1, Ll/ۡۗ֨;

    iget-object p1, p1, Ll/ۡۗ֨;->ۘ:Ll/ܰ᩵֨;

    iget-object p1, p1, Ll/۟᩵֨;->ۧ:Ll/ۛ֡֨;

    invoke-virtual {p2, v3, p1, v0}, Ll/ܶ۬֨;->֫(Ll/ۗ۠۠;Ll/ۛ֡֨;Ll/ۛ֡֨;)V

    return-object v0
.end method
