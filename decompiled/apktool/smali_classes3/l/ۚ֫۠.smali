.class public final Ll/ۚ֫۠;
.super Ll/ۤ֫۠;
.source "A451"


# instance fields
.field public final synthetic ܽ:Ll/᩹ܽ۠;


# direct methods
.method public constructor <init>(Ll/᩹ܽ۠;)V
    .locals 0

    .line 898
    iput-object p1, p0, Ll/ۚ֫۠;->ܽ:Ll/᩹ܽ۠;

    invoke-direct {p0, p1}, Ll/ۤ֫۠;-><init>(Ll/᩹ܽ۠;)V

    return-void
.end method

.method private ֫(Ll/֫ۤ֨;Ll/ۙ֨֨;Ll/֡ۨ֨;)V
    .locals 5

    .line 165
    iget-object v0, p3, Ll/֡ۨ֨;->ᩳ:Ll/ۖܶ۠;

    invoke-virtual {p2, v0}, Ll/ۙ֨֨;->ۧ(Ll/ۖܶ۠;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 928
    invoke-static {p2}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v0

    new-instance v1, Ll/᩵֫۠;

    invoke-direct {v1, p0, p1, p2}, Ll/᩵֫۠;-><init>(Ll/ۚ֫۠;Ll/֫ۤ֨;Ll/ۙ֨֨;)V

    invoke-virtual {p3, v0, v1}, Ll/֡ۨ֨;->֫(Ll/ۖܶ۠;Ll/ۘۛ֨;)V

    return-void

    .line 931
    :cond_0
    iget-object v0, p0, Ll/ۚ֫۠;->ܽ:Ll/᩹ܽ۠;

    iget-object v1, v0, Ll/᩹ܽ۠;->ܳ֫:Ll/ۛ᩸֨;

    invoke-virtual {v1, p2}, Ll/ۛ᩸֨;->ۢ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v1

    const/4 v2, 0x0

    .line 384
    invoke-virtual {v0, p1, v1, v2}, Ll/᩹ܽ۠;->֫(Ll/֫ۤ֨;Ll/ۙ֨֨;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 932
    :cond_1
    iget-object v0, p1, Ll/֫ۤ֨;->᩹:Ll/ۚ᩵۠;

    iget-object v0, v0, Ll/ۚ᩵۠;->᩺:Ll/ܳ֡֨;

    .line 933
    iget-object p1, p1, Ll/֫ۤ֨;->ۤ:Ll/ۚۚ۠;

    sget-object v1, Ll/᩸ۧ۠;->۬:Ll/᩸ۧ۠;

    invoke-static {v0}, Ll/᩸ᩴ֨;->֫(Ll/ۛ֡֨;)Ll/۠ᩴ֨;

    move-result-object v3

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    aput-object p2, v4, v2

    const/4 p2, 0x1

    aput-object v3, v4, p2

    const/4 p2, 0x2

    aput-object v0, v4, p2

    invoke-virtual {p0, p1, v1, p3, v4}, Ll/ۤ֫۠;->֫(Ll/ۗ۠۠;Ll/᩸ۧ۠;Ll/֡ۨ֨;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public static synthetic ֫(Ll/ۚ֫۠;Ll/֫ۤ֨;Ll/ۙ֨֨;Ll/֡ۨ֨;)V
    .locals 0

    .line 929
    invoke-virtual {p3, p2}, Ll/֡ۨ֨;->֫(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3}, Ll/ۚ֫۠;->֫(Ll/֫ۤ֨;Ll/ۙ֨֨;Ll/֡ۨ֨;)V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "resolveMethodCheck"

    return-object v0
.end method

.method public final ֫(Ll/ۖܶ۠;)Ll/۠ۧ۠;
    .locals 2

    .line 954
    new-instance v0, Ll/ۜܽ۠;

    iget-object v1, p0, Ll/ۚ֫۠;->ܽ:Ll/᩹ܽ۠;

    invoke-direct {v0, v1, p1}, Ll/ۜܽ۠;-><init>(Ll/᩹ܽ۠;Ll/ۖܶ۠;)V

    return-object v0
.end method

.method public final ֫(Ll/֫ۤ֨;Ll/ۜ۫֨;Ll/ۖܶ۠;Ll/ۖܶ۠;Ll/֨᩸۠;)V
    .locals 1

    .line 912
    invoke-super/range {p0 .. p5}, Ll/ۤ֫۠;->֫(Ll/֫ۤ֨;Ll/ۜ۫֨;Ll/ۖܶ۠;Ll/ۖܶ۠;Ll/֨᩸۠;)V

    .line 914
    iget-object p3, p2, Ll/ۜ۫֨;->ܳ:Ll/ܽܽ۠;

    invoke-virtual {p3}, Ll/ܽܽ۠;->ۧ()Z

    move-result p3

    if-eqz p3, :cond_1

    .line 915
    iget-object p3, p2, Ll/ۜ۫֨;->ܽ:Ll/ܰ۬֨;

    sget-object p5, Ll/ܰ۬֨;->᩹:Ll/ܰ۬֨;

    iget-object v0, p0, Ll/ۚ֫۠;->ܽ:Ll/᩹ܽ۠;

    if-eq p3, p5, :cond_0

    iget-boolean p3, v0, Ll/᩹ܽ۠;->ۡ:Z

    if-nez p3, :cond_1

    .line 916
    :cond_0
    iget-object p3, v0, Ll/᩹ܽ۠;->ܳ֫:Ll/ۛ᩸֨;

    invoke-virtual {p4}, Ll/ۖܶ۠;->last()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ll/ۙ֨֨;

    invoke-virtual {p3, p4}, Ll/ۛ᩸֨;->ۜ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p3

    iget-object p2, p2, Ll/ۜ۫֨;->ۧ:Ll/֡ۨ֨;

    invoke-direct {p0, p1, p3, p2}, Ll/ۚ֫۠;->֫(Ll/֫ۤ֨;Ll/ۙ֨֨;Ll/֡ۨ֨;)V

    :cond_1
    return-void
.end method

.method public final ֫(Ll/ۗ۠۠;ZLl/ۙ֨֨;Ll/ۙ֨֨;Ll/ۜ۫֨;Ll/֨᩸۠;)V
    .locals 7

    .line 940
    new-instance v6, Ll/֡֫۠;

    iget-object v0, p5, Ll/ۜ۫֨;->ܳ:Ll/ܽܽ۠;

    invoke-virtual {v0}, Ll/ܽܽ۠;->֫()Z

    move-result v0

    xor-int/lit8 v2, v0, 0x1

    move-object v0, v6

    move-object v1, p0

    move-object v3, p5

    move-object v4, p6

    move v5, p2

    invoke-direct/range {v0 .. v5}, Ll/֡֫۠;-><init>(Ll/ۚ֫۠;ZLl/ۜ۫֨;Ll/֨᩸۠;Z)V

    .line 949
    new-instance p2, Ll/ᩳܽ۠;

    iget-object p5, p0, Ll/ۚ֫۠;->ܽ:Ll/᩹ܽ۠;

    invoke-direct {p2, p5, p4, v6}, Ll/ᩳܽ۠;-><init>(Ll/᩹ܽ۠;Ll/ۙ֨֨;Ll/ۘ۬֨;)V

    .line 903
    invoke-virtual {p2, p1, p3}, Ll/ᩳܽ۠;->֫(Ll/ۗ۠۠;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    return-void
.end method
