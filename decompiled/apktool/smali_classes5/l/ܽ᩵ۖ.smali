.class public final Ll/ܽ᩵ۖ;
.super Ll/᩶ۘۖ;
.source "U940"

# interfaces
.implements Ll/ۘ֡ۖ;


# instance fields
.field public ᩶:I

.field public ᩸:I

.field public ᩹:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 444
    invoke-direct {p0}, Ll/᩶ۘۖ;-><init>()V

    const/4 v0, 0x0

    .line 622
    iput v0, p0, Ll/ܽ᩵ۖ;->᩶:I

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 426
    invoke-direct {p0}, Ll/ܽ᩵ۖ;-><init>()V

    return-void
.end method

.method public constructor <init>(Ll/ۢۜۖ;I)V
    .locals 0

    .line 450
    invoke-direct {p0, p1}, Ll/᩶ۘۖ;-><init>(Ll/ۢۜۖ;)V

    const/4 p1, 0x0

    .line 622
    iput p1, p0, Ll/ܽ᩵ۖ;->᩶:I

    return-void
.end method


# virtual methods
.method public final build()Ll/ۡ֡ۖ;
    .locals 2

    .line 475
    invoke-virtual {p0}, Ll/ܽ᩵ۖ;->buildPartial()Ll/ܳ᩵ۖ;

    move-result-object v0

    .line 476
    invoke-virtual {v0}, Ll/ܳ᩵ۖ;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 477
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public final build()Ll/᩻֡ۖ;
    .locals 2

    .line 475
    invoke-virtual {p0}, Ll/ܽ᩵ۖ;->buildPartial()Ll/ܳ᩵ۖ;

    move-result-object v0

    .line 476
    invoke-virtual {v0}, Ll/ܳ᩵ۖ;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 477
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public final bridge synthetic buildPartial()Ll/ۡ֡ۖ;
    .locals 1

    .line 426
    invoke-virtual {p0}, Ll/ܽ᩵ۖ;->buildPartial()Ll/ܳ᩵ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final buildPartial()Ll/ܳ᩵ۖ;
    .locals 4

    .line 484
    new-instance v0, Ll/ܳ᩵ۖ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll/ܳ᩵ۖ;-><init>(Ll/ܽ᩵ۖ;I)V

    .line 485
    iget v2, p0, Ll/ܽ᩵ۖ;->᩸:I

    if-eqz v2, :cond_2

    and-int/lit8 v3, v2, 0x1

    if-eqz v3, :cond_0

    .line 494
    iget-boolean v1, p0, Ll/ܽ᩵ۖ;->᩹:Z

    invoke-static {v0, v1}, Ll/ܳ᩵ۖ;->֫(Ll/ܳ᩵ۖ;Z)V

    const/4 v1, 0x1

    :cond_0
    and-int/lit8 v2, v2, 0x2

    if-eqz v2, :cond_1

    .line 498
    iget v2, p0, Ll/ܽ᩵ۖ;->᩶:I

    invoke-static {v0, v2}, Ll/ܳ᩵ۖ;->֫(Ll/ܳ᩵ۖ;I)V

    or-int/lit8 v1, v1, 0x2

    .line 501
    :cond_1
    invoke-static {v0, v1}, Ll/ܳ᩵ۖ;->ۧ(Ll/ܳ᩵ۖ;I)V

    .line 486
    :cond_2
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onBuilt()V

    return-object v0
.end method

.method public final bridge synthetic buildPartial()Ll/᩻֡ۖ;
    .locals 1

    .line 426
    invoke-virtual {p0}, Ll/ܽ᩵ۖ;->buildPartial()Ll/ܳ᩵ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final clear()Ll/ۢ֡ۖ;
    .locals 1

    .line 455
    invoke-super {p0}, Ll/᩶ۘۖ;->clear()Ll/᩶ۘۖ;

    const/4 v0, 0x0

    .line 456
    iput v0, p0, Ll/ܽ᩵ۖ;->᩸:I

    .line 457
    iput-boolean v0, p0, Ll/ܽ᩵ۖ;->᩹:Z

    .line 458
    iput v0, p0, Ll/ܽ᩵ۖ;->᩶:I

    return-object p0
.end method

.method public final clear()Ll/ܳ֡ۖ;
    .locals 1

    .line 455
    invoke-super {p0}, Ll/᩶ۘۖ;->clear()Ll/᩶ۘۖ;

    const/4 v0, 0x0

    .line 456
    iput v0, p0, Ll/ܽ᩵ۖ;->᩸:I

    .line 457
    iput-boolean v0, p0, Ll/ܽ᩵ۖ;->᩹:Z

    .line 458
    iput v0, p0, Ll/ܽ᩵ۖ;->᩶:I

    return-object p0
.end method

.method public final clear()Ll/᩶ۘۖ;
    .locals 1

    .line 455
    invoke-super {p0}, Ll/᩶ۘۖ;->clear()Ll/᩶ۘۖ;

    const/4 v0, 0x0

    .line 456
    iput v0, p0, Ll/ܽ᩵ۖ;->᩸:I

    .line 457
    iput-boolean v0, p0, Ll/ܽ᩵ۖ;->᩹:Z

    .line 458
    iput v0, p0, Ll/ܽ᩵ۖ;->᩶:I

    return-object p0
.end method

.method public final clear()Ll/᩷ۜۖ;
    .locals 1

    .line 455
    invoke-super {p0}, Ll/᩶ۘۖ;->clear()Ll/᩶ۘۖ;

    const/4 v0, 0x0

    .line 456
    iput v0, p0, Ll/ܽ᩵ۖ;->᩸:I

    .line 457
    iput-boolean v0, p0, Ll/ܽ᩵ۖ;->᩹:Z

    .line 458
    iput v0, p0, Ll/ܽ᩵ۖ;->᩶:I

    return-object p0
.end method

.method public final getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 470
    invoke-static {}, Ll/ܳ᩵ۖ;->getDefaultInstance()Ll/ܳ᩵ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 470
    invoke-static {}, Ll/ܳ᩵ۖ;->getDefaultInstance()Ll/ܳ᩵ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final getDescriptorForType()Ll/ᩳۖۖ;
    .locals 1

    .line 465
    invoke-static {}, Ll/᩻᩵ۖ;->֫()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public final internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 438
    invoke-static {}, Ll/᩻᩵ۖ;->ۧ()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/ܳ᩵ۖ;

    const-class v2, Ll/ܽ᩵ۖ;

    .line 439
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۖۜۖ;
    .locals 0

    .line 426
    invoke-virtual {p0, p1, p2}, Ll/ܽ᩵ۖ;->֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;)V

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 426
    invoke-virtual {p0, p1, p2}, Ll/ܽ᩵ۖ;->֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;)V

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 426
    invoke-virtual {p0, p1, p2}, Ll/ܽ᩵ۖ;->֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;)V

    return-object p0
.end method

.method public final mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;
    .locals 1

    .line 506
    instance-of v0, p1, Ll/ܳ᩵ۖ;

    if-eqz v0, :cond_0

    .line 507
    check-cast p1, Ll/ܳ᩵ۖ;

    invoke-virtual {p0, p1}, Ll/ܽ᩵ۖ;->֫(Ll/ܳ᩵ۖ;)V

    return-object p0

    .line 509
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 426
    invoke-virtual {p0, p1, p2}, Ll/ܽ᩵ۖ;->֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;)V

    return-object p0
.end method

.method public final mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;
    .locals 1

    .line 506
    instance-of v0, p1, Ll/ܳ᩵ۖ;

    if-eqz v0, :cond_0

    .line 507
    check-cast p1, Ll/ܳ᩵ۖ;

    invoke-virtual {p0, p1}, Ll/ܽ᩵ۖ;->֫(Ll/ܳ᩵ۖ;)V

    return-object p0

    .line 509
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public final ֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;)V
    .locals 4

    .line 538
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :cond_0
    :goto_0
    if-nez v0, :cond_5

    .line 543
    :try_start_0
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܶ()I

    move-result v1

    if-eqz v1, :cond_4

    const/16 v2, 0x8

    if-eq v1, v2, :cond_3

    const/16 v2, 0x10

    if-eq v1, v2, :cond_1

    .line 566
    invoke-super {p0, p1, p2, v1}, Ll/᩶ۘۖ;->parseUnknownField(Ll/۟ۜۖ;Ll/ᩳۘۖ;I)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 554
    :cond_1
    invoke-virtual {p1}, Ll/۟ۜۖ;->ۜ()I

    move-result v1

    .line 556
    invoke-static {v1}, Ll/ܿ᩵ۖ;->֫(I)Ll/ܿ᩵ۖ;

    move-result-object v2

    const/4 v3, 0x2

    if-nez v2, :cond_2

    .line 558
    invoke-virtual {p0, v3, v1}, Ll/᩶ۘۖ;->mergeUnknownVarintField(II)V

    goto :goto_0

    .line 560
    :cond_2
    iput v1, p0, Ll/ܽ᩵ۖ;->᩶:I

    .line 561
    iget v1, p0, Ll/ܽ᩵ۖ;->᩸:I

    or-int/2addr v1, v3

    iput v1, p0, Ll/ܽ᩵ۖ;->᩸:I

    goto :goto_0

    .line 549
    :cond_3
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܿ()Z

    move-result v1

    iput-boolean v1, p0, Ll/ܽ᩵ۖ;->᩹:Z

    .line 550
    iget v1, p0, Ll/ܽ᩵ۖ;->᩸:I

    or-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ܽ᩵ۖ;->᩸:I
    :try_end_0
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_4
    :goto_1
    const/4 v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 574
    :try_start_1
    invoke-virtual {p1}, Ll/֫᩵ۖ;->֫()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 576
    :goto_2
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 577
    throw p1

    .line 576
    :cond_5
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-void
.end method

.method public final ֫(Ll/ܳ᩵ۖ;)V
    .locals 1

    .line 515
    invoke-static {}, Ll/ܳ᩵ۖ;->getDefaultInstance()Ll/ܳ᩵ۖ;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-void

    .line 516
    :cond_0
    invoke-virtual {p1}, Ll/ܳ᩵ۖ;->ۢ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 517
    invoke-virtual {p1}, Ll/ܳ᩵ۖ;->ۜ()Z

    move-result v0

    .line 606
    iput-boolean v0, p0, Ll/ܽ᩵ۖ;->᩹:Z

    .line 607
    iget v0, p0, Ll/ܽ᩵ۖ;->᩸:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܽ᩵ۖ;->᩸:I

    .line 608
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 519
    :cond_1
    invoke-virtual {p1}, Ll/ܳ᩵ۖ;->ۡ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 520
    invoke-virtual {p1}, Ll/ܳ᩵ۖ;->᩷()Ll/ܿ᩵ۖ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ܽ᩵ۖ;->֫(Ll/ܿ᩵ۖ;)V

    .line 522
    :cond_2
    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩶ۘۖ;->mergeUnknownFields(Ll/ۢ֨ۖ;)Ll/᩶ۘۖ;

    .line 523
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-void
.end method

.method public final ֫(Ll/ܿ᩵ۖ;)V
    .locals 1

    .line 646
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 648
    iget v0, p0, Ll/ܽ᩵ۖ;->᩸:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Ll/ܽ᩵ۖ;->᩸:I

    .line 649
    invoke-virtual {p1}, Ll/ܿ᩵ۖ;->getNumber()I

    move-result p1

    iput p1, p0, Ll/ܽ᩵ۖ;->᩶:I

    .line 650
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-void
.end method
