.class public final Ll/ܳۧ۠;
.super Ll/ۜۧ۠;
.source "A451"


# instance fields
.field public final synthetic ֫֫:Ll/᩹ܽ۠;

.field public ۟:Ll/ۛ֡֨;


# direct methods
.method public constructor <init>(Ll/᩹ܽ۠;Ll/ۛ֡֨;Ll/۫ۧ۠;)V
    .locals 2

    .line 4317
    iput-object p1, p0, Ll/ܳۧ۠;->֫֫:Ll/᩹ܽ۠;

    .line 4318
    iget-object v0, p2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    const-string v1, "diamondError"

    invoke-direct {p0, p1, v0, v1, p3}, Ll/ۜۧ۠;-><init>(Ll/᩹ܽ۠;Ll/֨ᩴ֨;Ljava/lang/String;Ll/۫ۧ۠;)V

    .line 4319
    iput-object p2, p0, Ll/ܳۧ۠;->۟:Ll/ۛ֡֨;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۬۠۠;Ll/ۗ۠۠;Ll/ۛ֡֨;Ll/ۙ֨֨;Ll/ۤܶ۠;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ܽܶ۠;
    .locals 6

    .line 4323
    iget-object p3, p0, Ll/ܳۧ۠;->۟:Ll/ۛ֡֨;

    iget-object p5, p3, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object p6, Ll/֨ᩴ֨;->᩷֫:Ll/֨ᩴ֨;

    if-ne p5, p6, :cond_0

    .line 4324
    invoke-virtual {p3}, Ll/ۛ֡֨;->᩹()Ll/ۛ֡֨;

    move-result-object p3

    check-cast p3, Ll/ۜۧ۠;

    invoke-virtual {p3}, Ll/ۜۧ۠;->᩹֫()Ll/᩺ܶ۠;

    move-result-object p3

    iget-object p3, p3, Ll/᩺ܶ۠;->ۧ:Ljava/lang/Object;

    check-cast p3, Ll/ܽܶ۠;

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    .line 4332
    :goto_0
    iget-object p5, p0, Ll/ܳۧ۠;->֫֫:Ll/᩹ܽ۠;

    if-eqz p3, :cond_1

    invoke-static {p5}, Ll/᩹ܽ۠;->֫(Ll/᩹ܽ۠;)Z

    move-result p6

    if-eqz p6, :cond_1

    .line 4333
    iget-object p6, p5, Ll/᩹ܽ۠;->᩵:Ll/ۛ۠۠;

    iget-object p7, p5, Ll/᩹ܽ۠;->ܶ:Ll/᩹ܶ۠;

    .line 4334
    invoke-virtual {p7}, Ll/ۖ֨۠;->֫()Ll/ܳ۠۠;

    move-result-object p7

    invoke-static {p6, p2, p7, p1, p3}, Ll/֫ܽ۠;->֫(Ll/ۛ۠۠;Ll/ۗ۠۠;Ll/ܳ۠۠;Ll/۬۠۠;Ll/ܽܶ۠;)Ll/ܽܶ۠;

    move-result-object p6

    if-eqz p6, :cond_1

    return-object p6

    :cond_1
    if-nez p3, :cond_2

    const-string p6, "cant.apply.diamond"

    goto :goto_1

    :cond_2
    const-string p6, "cant.apply.diamond.1"

    :goto_1
    move-object v4, p6

    .line 4342
    iget-object v0, p5, Ll/᩹ܽ۠;->᩵:Ll/ۛ۠۠;

    iget-object p5, p5, Ll/᩹ܽ۠;->ܶ:Ll/᩹ܶ۠;

    invoke-virtual {p5}, Ll/ۖ֨۠;->֫()Ll/ܳ۠۠;

    move-result-object v2

    iget-object p4, p4, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    .line 4343
    sget-object p5, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 6735
    new-instance p5, Ll/ۨ۠۠;

    const/4 p6, 0x1

    new-array p7, p6, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p4, p7, v1

    const-string p4, "compiler"

    const-string v3, "diamond"

    invoke-direct {p5, p4, v3, p7}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p4, 0x2

    new-array v5, p4, [Ljava/lang/Object;

    aput-object p5, v5, v1

    aput-object p3, v5, p6

    move-object v1, p1

    move-object v3, p2

    .line 4342
    invoke-virtual/range {v0 .. v5}, Ll/ۛ۠۠;->֫(Ll/۬۠۠;Ll/ܳ۠۠;Ll/ۗ۠۠;Ljava/lang/String;[Ljava/lang/Object;)Ll/ܽܶ۠;

    move-result-object p1

    return-object p1
.end method
