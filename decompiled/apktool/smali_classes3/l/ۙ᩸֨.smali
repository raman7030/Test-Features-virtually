.class public final Ll/ۙ᩸֨;
.super Ll/֨᩸֨;
.source "X43L"


# instance fields
.field public final synthetic ᩶:Ll/ۗ᩸֨;

.field public ᩸:Ll/ۙ֨֨;

.field public ᩹:Ll/᩶ۚ֨;


# direct methods
.method public constructor <init>(Ll/ۗ᩸֨;Ll/᩶ۚ֨;Ll/ۙ֨֨;)V
    .locals 0

    .line 4899
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 346
    iput-object p1, p0, Ll/ۙ᩸֨;->᩶:Ll/ۗ᩸֨;

    .line 347
    iput-object p2, p0, Ll/ۙ᩸֨;->᩹:Ll/᩶ۚ֨;

    .line 348
    iput-object p3, p0, Ll/ۙ᩸֨;->᩸:Ll/ۙ֨֨;

    return-void
.end method


# virtual methods
.method public final bridge synthetic ֫(Ljava/lang/Object;Ll/ۙ֨֨;)Ljava/lang/Object;
    .locals 0

    .line 341
    check-cast p1, Ll/ۢ᩸֨;

    invoke-virtual {p0, p2, p1}, Ll/ۙ᩸֨;->֫(Ll/ۙ֨֨;Ll/ۢ᩸֨;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/᩶֨֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 341
    check-cast p2, Ll/ۢ᩸֨;

    .line 381
    iget-object v0, p0, Ll/ۙ᩸֨;->᩶:Ll/ۗ᩸֨;

    iget-object v1, v0, Ll/ۗ᩸֨;->᩹:Ll/ۛ᩸֨;

    iget-object v2, v1, Ll/ۛ᩸֨;->᩻֫:Ll/᩷ۚ֨;

    iget-object v1, v1, Ll/ۛ᩸֨;->᩻֫:Ll/᩷ۚ֨;

    iget-object v1, v1, Ll/᩷ۚ֨;->᩷:Ll/ۙ֨֨;

    .line 382
    iget-object v3, p1, Ll/᩶֨֨;->ۨ:Ll/ܺۘ֨;

    .line 383
    sget-object v4, Ll/ۧܶ֨;->֫:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v4, v4, v5

    const/4 v5, 0x1

    if-eq v4, v5, :cond_1

    const/4 v5, 0x2

    if-eq v4, v5, :cond_0

    goto :goto_0

    .line 391
    :cond_0
    iget-object p1, p1, Ll/᩶֨֨;->᩺:Ll/ۙ֨֨;

    invoke-virtual {p2}, Ll/ۢ᩸֨;->֫()Ll/ۢ᩸֨;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4900
    invoke-virtual {p1, v0, p2}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 318
    move-object v1, p1

    check-cast v1, Ll/ۙ֨֨;

    .line 392
    sget-object p1, Ll/ۢ۠֨;->۫:Ll/ۢ۠֨;

    invoke-virtual {v1, p1}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 393
    iget-object v1, v2, Ll/᩷ۚ֨;->᩸֫:Ll/ۙ֨֨;

    .line 394
    sget-object v3, Ll/ܺۘ֨;->ۗ:Ll/ܺۘ֨;

    goto :goto_0

    .line 385
    :cond_1
    iget-object p1, p1, Ll/᩶֨֨;->᩺:Ll/ۙ֨֨;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4900
    invoke-virtual {p1, v0, p2}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 318
    move-object v1, p1

    check-cast v1, Ll/ۙ֨֨;

    .line 386
    sget-object p1, Ll/ۢ۠֨;->۫:Ll/ۢ۠֨;

    invoke-virtual {v1, p1}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 387
    iget-object p1, v2, Ll/᩷ۚ֨;->᩷:Ll/ۙ֨֨;

    return-object p1

    .line 402
    :cond_2
    :goto_0
    new-instance p1, Ll/᩶᩸֨;

    iget-object p2, v0, Ll/ۗ᩸֨;->᩹:Ll/ۛ᩸֨;

    iget-object p2, p2, Ll/ۛ᩸֨;->᩻֫:Ll/᩷ۚ֨;

    iget-object p2, p2, Ll/᩷ۚ֨;->ۢ:Ll/ܳ֡֨;

    invoke-direct {p1, v1, v3, p2}, Ll/᩶֨֨;-><init>(Ll/ۙ֨֨;Ll/ܺۘ֨;Ll/᩶֡֨;)V

    return-object p1
.end method

.method public final bridge synthetic ֫(Ljava/lang/Object;Ll/ۙ֨֨;)Ll/ۙ֨֨;
    .locals 0

    .line 341
    check-cast p1, Ll/ۢ᩸֨;

    invoke-virtual {p0, p2, p1}, Ll/ۙ᩸֨;->֫(Ll/ۙ֨֨;Ll/ۢ᩸֨;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۙ֨֨;Ll/ۢ᩸֨;)Ll/ۙ֨֨;
    .locals 5

    .line 354
    iget-object v0, p0, Ll/ۙ᩸֨;->᩶:Ll/ۗ᩸֨;

    iget-object v1, v0, Ll/ۗ᩸֨;->᩹:Ll/ۛ᩸֨;

    sget-object v2, Ll/ۢ᩸֨;->᩹:Ll/ۢ᩸֨;

    if-ne p2, v2, :cond_0

    .line 356
    iget-object p1, v1, Ll/ۛ᩸֨;->᩻֫:Ll/᩷ۚ֨;

    iget-object p1, p1, Ll/᩷ۚ֨;->᩷:Ll/ۙ֨֨;

    return-object p1

    .line 358
    :cond_0
    sget-object p2, Ll/ۢ᩸֨;->᩶:Ll/ۢ᩸֨;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4900
    invoke-virtual {p1, v0, p2}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 318
    check-cast p2, Ll/ۙ֨֨;

    .line 4900
    invoke-virtual {p1, v0, v2}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 318
    check-cast p1, Ll/ۙ֨֨;

    .line 360
    iget-object v2, p0, Ll/ۙ᩸֨;->᩹:Ll/᩶ۚ֨;

    iget-object v2, v2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v2, v2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v2}, Ll/ۙ֨֨;->ܽ֫()Ll/ۖܶ۠;

    move-result-object v2

    .line 363
    iget-object v3, v1, Ll/ۛ᩸֨;->᩻֫:Ll/᩷ۚ֨;

    iget-object v3, v3, Ll/᩷ۚ֨;->᩸֫:Ll/ۙ֨֨;

    invoke-virtual {v1, p2, v3}, Ll/ۛ᩸֨;->ܿ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 364
    iget-object v3, p0, Ll/ۙ᩸֨;->᩸:Ll/ۙ֨֨;

    invoke-virtual {v3, v2}, Ll/ۙ֨֨;->ۧ(Ll/ۖܶ۠;)Z

    move-result v2

    if-nez v2, :cond_1

    const/4 v2, 0x1

    .line 1071
    invoke-virtual {v1, v3, p2, v2}, Ll/ۛ᩸֨;->ܽ(Ll/ۙ֨֨;Ll/ۙ֨֨;Z)Z

    move-result v2

    if-nez v2, :cond_2

    .line 367
    :cond_1
    sget-object p1, Ll/ܺۘ֨;->᩶:Ll/ܺۘ֨;

    goto :goto_0

    .line 368
    :cond_2
    sget-object p2, Ll/ۢ۠֨;->۫:Ll/ۢ۠֨;

    invoke-virtual {p1, p2}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result p2

    if-nez p2, :cond_3

    .line 370
    sget-object p2, Ll/ܺۘ֨;->ۙ:Ll/ܺۘ֨;

    move-object v4, p2

    move-object p2, p1

    move-object p1, v4

    goto :goto_0

    .line 372
    :cond_3
    iget-object p1, v1, Ll/ۛ᩸֨;->᩻֫:Ll/᩷ۚ֨;

    iget-object p2, p1, Ll/᩷ۚ֨;->᩸֫:Ll/ۙ֨֨;

    .line 373
    sget-object p1, Ll/ܺۘ֨;->ۗ:Ll/ܺۘ֨;

    .line 402
    :goto_0
    new-instance v1, Ll/᩶᩸֨;

    iget-object v0, v0, Ll/ۗ᩸֨;->᩹:Ll/ۛ᩸֨;

    iget-object v0, v0, Ll/ۛ᩸֨;->᩻֫:Ll/᩷ۚ֨;

    iget-object v0, v0, Ll/᩷ۚ֨;->ۢ:Ll/ܳ֡֨;

    invoke-direct {v1, p2, p1, v0}, Ll/᩶֨֨;-><init>(Ll/ۙ֨֨;Ll/ܺۘ֨;Ll/᩶֡֨;)V

    return-object v1
.end method
