.class public final Ll/᩵֡ۖ;
.super Ljava/lang/Object;
.source "59PG"

# interfaces
.implements Ll/֨֡ۖ;


# instance fields
.field public final ֫:Ll/᩷ۜۖ;

.field public ۧ:Z


# direct methods
.method public constructor <init>(Ll/᩷ۜۖ;)V
    .locals 1

    .line 365
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 358
    iput-boolean v0, p0, Ll/᩵֡ۖ;->ۧ:Z

    .line 366
    iput-object p1, p0, Ll/᩵֡ۖ;->֫:Ll/᩷ۜۖ;

    return-void
.end method

.method private ֫(Ll/֡ۖۖ;Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;
    .locals 0

    if-eqz p2, :cond_0

    .line 596
    invoke-interface {p2}, Ll/᩻֡ۖ;->newBuilderForType()Ll/ܳ֡ۖ;

    move-result-object p1

    return-object p1

    .line 598
    :cond_0
    iget-object p2, p0, Ll/᩵֡ۖ;->֫:Ll/᩷ۜۖ;

    invoke-interface {p2, p1}, Ll/ܳ֡ۖ;->newBuilderForField(Ll/֡ۖۖ;)Ll/ܳ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method private ۧ(Ll/֡ۖۖ;)Ll/ܳ֡ۖ;
    .locals 1

    .line 375
    iget-boolean v0, p0, Ll/᩵֡ۖ;->ۧ:Z

    if-eqz v0, :cond_0

    .line 377
    :try_start_0
    iget-object v0, p0, Ll/᩵֡ۖ;->֫:Ll/᩷ۜۖ;

    invoke-interface {v0, p1}, Ll/ܳ֡ۖ;->getFieldBuilder(Ll/֡ۖۖ;)Ll/ܳ֡ۖ;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    .line 379
    iput-boolean p1, p0, Ll/᩵֡ۖ;->ۧ:Z

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public final addRepeatedField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/֨֡ۖ;
    .locals 1

    .line 420
    instance-of v0, p2, Ll/ۢ֡ۖ;

    if-eqz v0, :cond_0

    .line 421
    check-cast p2, Ll/ۢ֡ۖ;

    invoke-interface {p2}, Ll/ۢ֡ۖ;->buildPartial()Ll/ۡ֡ۖ;

    move-result-object p2

    .line 423
    :cond_0
    iget-object v0, p0, Ll/᩵֡ۖ;->֫:Ll/᩷ۜۖ;

    invoke-interface {v0, p1, p2}, Ll/ܳ֡ۖ;->addRepeatedField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/ܳ֡ۖ;

    return-object p0
.end method

.method public final hasField(Ll/֡ۖۖ;)Z
    .locals 1

    .line 387
    iget-object v0, p0, Ll/᩵֡ۖ;->֫:Ll/᩷ۜۖ;

    invoke-interface {v0, p1}, Ll/ۘ֡ۖ;->hasField(Ll/֡ۖۖ;)Z

    move-result p1

    return p1
.end method

.method public final setField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/֨֡ۖ;
    .locals 2

    .line 392
    invoke-virtual {p1}, Ll/֡ۖۖ;->۟֫()Z

    move-result v0

    iget-object v1, p0, Ll/᩵֡ۖ;->֫:Ll/᩷ۜۖ;

    if-nez v0, :cond_1

    instance-of v0, p2, Ll/ۢ֡ۖ;

    if-eqz v0, :cond_1

    .line 393
    invoke-direct {p0, p1}, Ll/᩵֡ۖ;->ۧ(Ll/֡ۖۖ;)Ll/ܳ֡ۖ;

    move-result-object v0

    if-eq p2, v0, :cond_0

    .line 394
    check-cast p2, Ll/ۢ֡ۖ;

    invoke-interface {p2}, Ll/ۢ֡ۖ;->buildPartial()Ll/ۡ֡ۖ;

    move-result-object p2

    invoke-interface {v1, p1, p2}, Ll/ܳ֡ۖ;->setField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/ܳ֡ۖ;

    :cond_0
    return-object p0

    .line 398
    :cond_1
    invoke-interface {v1, p1, p2}, Ll/ܳ֡ۖ;->setField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/ܳ֡ۖ;

    return-object p0
.end method

.method public final ֫()Ll/ۚ֡ۖ;
    .locals 1

    .line 445
    sget-object v0, Ll/ۚ֡ۖ;->᩶:Ll/ۚ֡ۖ;

    return-object v0
.end method

.method public final ֫(Ll/֫ۘۖ;Ll/ᩳۖۖ;I)Ll/۟ۖۖ;
    .locals 0

    .line 457
    invoke-virtual {p1, p2, p3}, Ll/֫ۘۖ;->֫(Ll/ᩳۖۖ;I)Ll/۟ۖۖ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/֡ۖۖ;)Ll/ܿ۠ۖ;
    .locals 1

    .line 637
    invoke-virtual {p1}, Ll/֡ۖۖ;->᩺()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 638
    sget-object p1, Ll/ܿ۠ۖ;->ۙ:Ll/ܿ۠ۖ;

    return-object p1

    .line 641
    :cond_0
    invoke-virtual {p1}, Ll/֡ۖۖ;->۟֫()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Ll/᩵֡ۖ;->֫:Ll/᩷ۜۖ;

    instance-of p1, p1, Ll/᩶ۘۖ;

    if-eqz p1, :cond_1

    .line 642
    sget-object p1, Ll/ܿ۠ۖ;->᩹:Ll/ܿ۠ۖ;

    return-object p1

    .line 644
    :cond_1
    sget-object p1, Ll/ܿ۠ۖ;->᩶:Ll/ܿ۠ۖ;

    return-object p1
.end method

.method public final ֫(Ll/ۛۜۖ;Ll/ᩳۘۖ;Ll/֡ۖۖ;Ll/᩻֡ۖ;)Ll/᩻֡ۖ;
    .locals 2

    .line 517
    iget-object v0, p0, Ll/᩵֡ۖ;->֫:Ll/᩷ۜۖ;

    if-eqz p4, :cond_0

    .line 518
    invoke-interface {p4}, Ll/᩻֡ۖ;->newBuilderForType()Ll/ܳ֡ۖ;

    move-result-object p4

    goto :goto_0

    .line 520
    :cond_0
    invoke-interface {v0, p3}, Ll/ܳ֡ۖ;->newBuilderForField(Ll/֡ۖۖ;)Ll/ܳ֡ۖ;

    move-result-object p4

    .line 522
    :goto_0
    invoke-virtual {p3}, Ll/֡ۖۖ;->۟֫()Z

    move-result v1

    if-nez v1, :cond_1

    .line 371
    invoke-interface {v0, p3}, Ll/ۘ֡ۖ;->getField(Ll/֡ۖۖ;)Ljava/lang/Object;

    move-result-object p3

    .line 523
    check-cast p3, Ll/᩻֡ۖ;

    if-eqz p3, :cond_1

    .line 525
    invoke-interface {p4, p3}, Ll/ܳ֡ۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;

    .line 528
    :cond_1
    invoke-interface {p4, p1, p2}, Ll/ܳ֡ۖ;->mergeFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ll/ܳ֡ۖ;

    .line 529
    invoke-interface {p4}, Ll/ܳ֡ۖ;->buildPartial()Ll/᩻֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;Ll/֡ۖۖ;Ll/᩻֡ۖ;)V
    .locals 2

    .line 569
    invoke-virtual {p3}, Ll/֡ۖۖ;->۟֫()Z

    move-result v0

    if-nez v0, :cond_2

    .line 387
    iget-object v0, p0, Ll/᩵֡ۖ;->֫:Ll/᩷ۜۖ;

    invoke-interface {v0, p3}, Ll/ۘ֡ۖ;->hasField(Ll/֡ۖۖ;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 572
    invoke-direct {p0, p3}, Ll/᩵֡ۖ;->ۧ(Ll/֡ۖۖ;)Ll/ܳ֡ۖ;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 574
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/ۢ֡ۖ;Ll/ᩳۘۖ;)V

    return-void

    .line 577
    :cond_0
    invoke-direct {p0, p3, p4}, Ll/᩵֡ۖ;->֫(Ll/֡ۖۖ;Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;

    move-result-object p4

    .line 371
    invoke-interface {v0, p3}, Ll/ۘ֡ۖ;->getField(Ll/֡ۖۖ;)Ljava/lang/Object;

    move-result-object v0

    .line 578
    check-cast v0, Ll/᩻֡ۖ;

    invoke-interface {p4, v0}, Ll/ܳ֡ۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;

    goto :goto_0

    .line 581
    :cond_1
    invoke-direct {p0, p3, p4}, Ll/᩵֡ۖ;->֫(Ll/֡ۖۖ;Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;

    move-result-object p4

    .line 583
    :goto_0
    invoke-virtual {p1, p4, p2}, Ll/۟ۜۖ;->֫(Ll/ۢ֡ۖ;Ll/ᩳۘۖ;)V

    .line 584
    invoke-interface {p4}, Ll/ܳ֡ۖ;->buildPartial()Ll/᩻֡ۖ;

    move-result-object p1

    invoke-virtual {p0, p3, p1}, Ll/᩵֡ۖ;->setField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/֨֡ۖ;

    return-void

    .line 586
    :cond_2
    invoke-direct {p0, p3, p4}, Ll/᩵֡ۖ;->֫(Ll/֡ۖۖ;Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;

    move-result-object p4

    .line 587
    invoke-virtual {p1, p4, p2}, Ll/۟ۜۖ;->֫(Ll/ۢ֡ۖ;Ll/ᩳۘۖ;)V

    .line 588
    invoke-interface {p4}, Ll/ܳ֡ۖ;->buildPartial()Ll/᩻֡ۖ;

    move-result-object p1

    invoke-virtual {p0, p3, p1}, Ll/᩵֡ۖ;->addRepeatedField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/֨֡ۖ;

    return-void
.end method

.method public final ۧ(Ll/۟ۜۖ;Ll/ᩳۘۖ;Ll/֡ۖۖ;Ll/᩻֡ۖ;)V
    .locals 2

    .line 539
    invoke-virtual {p3}, Ll/֡ۖۖ;->۟֫()Z

    move-result v0

    if-nez v0, :cond_2

    .line 387
    iget-object v0, p0, Ll/᩵֡ۖ;->֫:Ll/᩷ۜۖ;

    invoke-interface {v0, p3}, Ll/ۘ֡ۖ;->hasField(Ll/֡ۖۖ;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 542
    invoke-direct {p0, p3}, Ll/᩵֡ۖ;->ۧ(Ll/֡ۖۖ;)Ll/ܳ֡ۖ;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 544
    invoke-virtual {p3}, Ll/֡ۖۖ;->getNumber()I

    move-result p3

    invoke-virtual {p1, p3, v1, p2}, Ll/۟ۜۖ;->֫(ILl/ۢ֡ۖ;Ll/ᩳۘۖ;)V

    return-void

    .line 547
    :cond_0
    invoke-direct {p0, p3, p4}, Ll/᩵֡ۖ;->֫(Ll/֡ۖۖ;Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;

    move-result-object p4

    .line 371
    invoke-interface {v0, p3}, Ll/ۘ֡ۖ;->getField(Ll/֡ۖۖ;)Ljava/lang/Object;

    move-result-object v0

    .line 548
    check-cast v0, Ll/᩻֡ۖ;

    invoke-interface {p4, v0}, Ll/ܳ֡ۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;

    goto :goto_0

    .line 551
    :cond_1
    invoke-direct {p0, p3, p4}, Ll/᩵֡ۖ;->֫(Ll/֡ۖۖ;Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;

    move-result-object p4

    .line 553
    :goto_0
    invoke-virtual {p3}, Ll/֡ۖۖ;->getNumber()I

    move-result v0

    invoke-virtual {p1, v0, p4, p2}, Ll/۟ۜۖ;->֫(ILl/ۢ֡ۖ;Ll/ᩳۘۖ;)V

    .line 554
    invoke-interface {p4}, Ll/ܳ֡ۖ;->buildPartial()Ll/᩻֡ۖ;

    move-result-object p1

    invoke-virtual {p0, p3, p1}, Ll/᩵֡ۖ;->setField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/֨֡ۖ;

    return-void

    .line 556
    :cond_2
    invoke-direct {p0, p3, p4}, Ll/᩵֡ۖ;->֫(Ll/֡ۖۖ;Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;

    move-result-object p4

    .line 557
    invoke-virtual {p3}, Ll/֡ۖۖ;->getNumber()I

    move-result v0

    invoke-virtual {p1, v0, p4, p2}, Ll/۟ۜۖ;->֫(ILl/ۢ֡ۖ;Ll/ᩳۘۖ;)V

    .line 558
    invoke-interface {p4}, Ll/ܳ֡ۖ;->buildPartial()Ll/᩻֡ۖ;

    move-result-object p1

    invoke-virtual {p0, p3, p1}, Ll/᩵֡ۖ;->addRepeatedField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/֨֡ۖ;

    return-void
.end method
