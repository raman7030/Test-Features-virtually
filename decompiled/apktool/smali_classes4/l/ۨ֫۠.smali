.class public final Ll/ۨ֫۠;
.super Ll/ۚܽ۠;
.source "A451"


# instance fields
.field public final synthetic ܰ:Ll/᩹ܽ۠;

.field public ᩺:Ll/ۖܶ۠;


# direct methods
.method public constructor <init>(Ll/᩹ܽ۠;Ll/ۛ֡֨;Ll/ۛ֡֨;)V
    .locals 2

    .line 4558
    iput-object p1, p0, Ll/ۨ֫۠;->ܰ:Ll/᩹ܽ۠;

    .line 4559
    sget-object v0, Ll/֨ᩴ֨;->ۛ:Ll/֨ᩴ֨;

    const-string v1, "ambiguity error"

    invoke-direct {p0, p1, v0, v1}, Ll/ۚܽ۠;-><init>(Ll/᩹ܽ۠;Ll/֨ᩴ֨;Ljava/lang/String;)V

    .line 4551
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ֫۠;->᩺:Ll/ۖܶ۠;

    .line 4564
    iget-object p1, p3, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    if-ne p1, v0, :cond_0

    .line 4565
    invoke-virtual {p3}, Ll/ۛ֡֨;->᩹()Ll/ۛ֡֨;

    move-result-object p1

    check-cast p1, Ll/ۨ֫۠;

    iget-object p1, p1, Ll/ۨ֫۠;->᩺:Ll/ۖܶ۠;

    goto :goto_0

    .line 4567
    :cond_0
    invoke-static {p3}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p1

    .line 4564
    :goto_0
    iget-object p3, p2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    if-ne p3, v0, :cond_1

    .line 4565
    invoke-virtual {p2}, Ll/ۛ֡֨;->᩹()Ll/ۛ֡֨;

    move-result-object p2

    check-cast p2, Ll/ۨ֫۠;

    iget-object p2, p2, Ll/ۨ֫۠;->᩺:Ll/ۖܶ۠;

    goto :goto_1

    .line 4567
    :cond_1
    invoke-static {p2}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p2

    .line 4560
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    invoke-virtual {p2, p1}, Ll/ۖܶ۠;->ܽ(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p1

    .line 4560
    iput-object p1, p0, Ll/ۨ֫۠;->᩺:Ll/ۖܶ۠;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۤܶ۠;Ll/᩶֡֨;)Ll/ۛ֡֨;
    .locals 3

    .line 4610
    iget-object v0, p0, Ll/ۨ֫۠;->᩺:Ll/ۖܶ۠;

    invoke-virtual {v0}, Ll/ۖܶ۠;->last()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛ֡֨;

    .line 4611
    iget-object v1, v0, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v2, Ll/֨ᩴ֨;->᩻֫:Ll/֨ᩴ֨;

    if-ne v1, v2, :cond_0

    .line 4612
    iget-object v1, p0, Ll/ۨ֫۠;->ܰ:Ll/᩹ܽ۠;

    iget-object v1, v1, Ll/᩹ܽ۠;->ܳ֫:Ll/ۛ᩸֨;

    iget-object v0, v0, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, p2, v0}, Ll/ۛ᩸֨;->֫(Ll/ۤܶ۠;Ll/᩶֡֨;Ll/ۙ֨֨;)Ll/۫ۚ֨;

    move-result-object p1

    iget-object p1, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    return-object p1

    :cond_0
    return-object v0
.end method

.method public final ֫(Ll/۬۠۠;Ll/ۗ۠۠;Ll/ۛ֡֨;Ll/ۙ֨֨;Ll/ۤܶ۠;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ܽܶ۠;
    .locals 6

    .line 4584
    iget-object p3, p0, Ll/ۨ֫۠;->᩺:Ll/ۖܶ۠;

    invoke-virtual {p3}, Ll/ۖܶ۠;->ᩳ()Ll/ۖܶ۠;

    move-result-object p3

    .line 4585
    iget-object p5, p3, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast p5, Ll/ۛ֡֨;

    .line 4586
    iget-object p3, p3, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    iget-object p3, p3, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast p3, Ll/ۛ֡֨;

    .line 4587
    iget-object p6, p5, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    .line 4588
    iget-object p7, p0, Ll/ۨ֫۠;->ܰ:Ll/᩹ܽ۠;

    iget-object v0, p7, Ll/᩹ܽ۠;->۬:Ll/ۛܶ۠;

    iget-object v0, v0, Ll/ۛܶ۠;->ᩴۧ:Ll/ۤܶ۠;

    if-ne p6, v0, :cond_0

    iget-object p6, p5, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object p6, p6, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    .line 4589
    :cond_0
    iget-object v0, p7, Ll/᩹ܽ۠;->᩵:Ll/ۛ۠۠;

    iget-object v1, p7, Ll/᩹ܽ۠;->ܶ:Ll/᩹ܶ۠;

    invoke-virtual {v1}, Ll/ۖ֨۠;->֫()Ll/ܳ۠۠;

    move-result-object v2

    .line 4591
    invoke-static {p5}, Ll/᩸ᩴ֨;->֫(Ll/ۛ֡֨;)Ll/۠ᩴ֨;

    move-result-object v1

    iget-object v3, p7, Ll/᩹ܽ۠;->ܳ֫:Ll/ۛ᩸֨;

    .line 4593
    invoke-virtual {p5, p4, v3}, Ll/ۛ֡֨;->ۧ(Ll/ۙ֨֨;Ll/ۛ᩸֨;)Ll/ۛ֡֨;

    move-result-object v3

    .line 4594
    invoke-static {p3}, Ll/᩸ᩴ֨;->֫(Ll/ۛ֡֨;)Ll/۠ᩴ֨;

    move-result-object v4

    iget-object p7, p7, Ll/᩹ܽ۠;->ܳ֫:Ll/ۛ᩸֨;

    .line 4596
    invoke-virtual {p3, p4, p7}, Ll/ۛ֡֨;->ۧ(Ll/ۙ֨֨;Ll/ۛ᩸֨;)Ll/ۛ֡֨;

    move-result-object p4

    const/4 p7, 0x7

    new-array v5, p7, [Ljava/lang/Object;

    const/4 p7, 0x0

    aput-object p6, v5, p7

    const/4 p6, 0x1

    aput-object v1, v5, p6

    const/4 p6, 0x2

    aput-object p5, v5, p6

    const/4 p5, 0x3

    aput-object v3, v5, p5

    const/4 p5, 0x4

    aput-object v4, v5, p5

    const/4 p5, 0x5

    aput-object p3, v5, p5

    const/4 p3, 0x6

    aput-object p4, v5, p3

    const-string v4, "ref.ambiguous"

    move-object v1, p1

    move-object v3, p2

    .line 4589
    invoke-virtual/range {v0 .. v5}, Ll/ۛ۠۠;->֫(Ll/۬۠۠;Ll/ܳ۠۠;Ll/ۗ۠۠;Ljava/lang/String;[Ljava/lang/Object;)Ll/ܽܶ۠;

    move-result-object p1

    return-object p1
.end method
