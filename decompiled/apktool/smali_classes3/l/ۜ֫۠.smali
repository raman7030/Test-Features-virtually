.class public final Ll/ۜ֫۠;
.super Ll/ᩳۧ۠;
.source "A451"


# instance fields
.field public final synthetic ۜ:Ll/᩵֡۠;

.field public final synthetic ᩻:Ll/᩹ܽ۠;


# direct methods
.method public constructor <init>(Ll/᩹ܽ۠;Ll/ۤܶ۠;Ll/᩶ۚ֨;Ll/ۖܶ۠;Ll/ۖܶ۠;Ll/᩵֡۠;)V
    .locals 0

    .line 2917
    iput-object p1, p0, Ll/ۜ֫۠;->᩻:Ll/᩹ܽ۠;

    iput-object p6, p0, Ll/ۜ֫۠;->ۜ:Ll/᩵֡۠;

    invoke-direct/range {p0 .. p5}, Ll/ᩳۧ۠;-><init>(Ll/᩹ܽ۠;Ll/ۤܶ۠;Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/ۖܶ۠;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֫ۤ֨;Ll/ۗ۠۠;Ll/ۛ֡֨;Ll/ۛ֡֨;)Ll/ۛ֡֨;
    .locals 10

    .line 2926
    iget-object v0, p4, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    invoke-virtual {v0}, Ll/֨ᩴ֨;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2927
    iget-object v0, p4, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v1, Ll/֨ᩴ֨;->᩷֫:Ll/֨ᩴ֨;

    if-eq v0, v1, :cond_0

    sget-object v2, Ll/֨ᩴ֨;->ۢ֫:Ll/֨ᩴ֨;

    if-eq v0, v2, :cond_0

    .line 2929
    invoke-super {p0, p1, p2, p3, p4}, Ll/ᩳۧ۠;->֫(Ll/֫ۤ֨;Ll/ۗ۠۠;Ll/ۛ֡֨;Ll/ۛ֡֨;)Ll/ۛ֡֨;

    move-result-object p1

    return-object p1

    :cond_0
    if-ne v0, v1, :cond_1

    .line 2932
    invoke-virtual {p4}, Ll/ۛ֡֨;->᩹()Ll/ۛ֡֨;

    move-result-object p3

    check-cast p3, Ll/ۜۧ۠;

    invoke-virtual {p3}, Ll/ۜۧ۠;->᩹֫()Ll/᩺ܶ۠;

    move-result-object p3

    iget-object p3, p3, Ll/᩺ܶ۠;->ۧ:Ljava/lang/Object;

    check-cast p3, Ll/ܽܶ۠;

    .line 2934
    :cond_1
    new-instance v1, Ll/ܳۧ۠;

    iget-object p3, p0, Ll/ۜ֫۠;->᩻:Ll/᩹ܽ۠;

    iget-object v0, p3, Ll/᩹ܽ۠;->ۘ:Ll/۫ۧ۠;

    invoke-direct {v1, p3, p4, v0}, Ll/ܳۧ۠;-><init>(Ll/᩹ܽ۠;Ll/ۛ֡֨;Ll/۫ۧ۠;)V

    .line 2935
    iget-object v4, p0, Ll/֨ۧ۠;->ᩳ:Ll/ۙ֨֨;

    iget-object p4, p3, Ll/᩹ܽ۠;->۬:Ll/ۛܶ۠;

    iget-object v5, p4, Ll/ۛܶ۠;->ᩴۧ:Ll/ۤܶ۠;

    .line 2579
    iget-object v3, v4, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    .line 2567
    iget-object v9, p3, Ll/᩹ܽ۠;->᩸:Ll/۬֫۠;

    const/4 v6, 0x1

    iget-object v7, p0, Ll/֨ۧ۠;->֫:Ll/ۖܶ۠;

    iget-object v8, p0, Ll/֨ۧ۠;->ܿ:Ll/ۖܶ۠;

    move-object v0, p3

    move-object v2, p2

    invoke-virtual/range {v0 .. v9}, Ll/᩹ܽ۠;->֫(Ll/ۛ֡֨;Ll/ۗ۠۠;Ll/ۛ֡֨;Ll/ۙ֨֨;Ll/ۤܶ۠;ZLl/ۖܶ۠;Ll/ۖܶ۠;Ll/֡ۧ۠;)Ll/ۛ֡֨;

    move-result-object p2

    .line 2936
    iget-object p1, p1, Ll/֫ۤ֨;->ۙ:Ljava/lang/Object;

    check-cast p1, Ll/ۡۗ֨;

    iget-object p3, p3, Ll/᩹ܽ۠;->ۘ:Ll/۫ۧ۠;

    iget-object p3, p3, Ll/۫ۧ۠;->ܿ:Ll/ܽܽ۠;

    iput-object p3, p1, Ll/ۡۗ֨;->ۡ:Ll/ܽܽ۠;

    return-object p2

    :cond_2
    return-object p4
.end method

.method public final ۧ(Ll/֫ۤ֨;Ll/ܽܽ۠;)Ll/ۛ֡֨;
    .locals 7

    .line 2920
    iget-object v3, p0, Ll/֨ۧ۠;->ᩳ:Ll/ۙ֨֨;

    .line 2921
    invoke-virtual {p2}, Ll/ܽܽ۠;->֫()Z

    .line 2922
    invoke-virtual {p2}, Ll/ܽܽ۠;->ۧ()Z

    move-result v6

    .line 2920
    iget-object v0, p0, Ll/ۜ֫۠;->᩻:Ll/᩹ܽ۠;

    iget-object v1, p0, Ll/ۜ֫۠;->ۜ:Ll/᩵֡۠;

    iget-object v4, p0, Ll/֨ۧ۠;->֫:Ll/ۖܶ۠;

    iget-object v5, p0, Ll/֨ۧ۠;->ܿ:Ll/ۖܶ۠;

    move-object v2, p1

    invoke-static/range {v0 .. v6}, Ll/᩹ܽ۠;->֫(Ll/᩹ܽ۠;Ll/᩵֡۠;Ll/֫ۤ֨;Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/ۖܶ۠;Z)Ll/ۛ֡֨;

    move-result-object p1

    return-object p1
.end method
