.class public final Ll/ܿܶ᩻;
.super Ll/᩶ۘۖ;
.source "C9PC"

# interfaces
.implements Ll/ۜܶ᩻;


# instance fields
.field public bitField0_:I

.field public hash_:Ll/ۛۜۖ;

.field public size_:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2453
    invoke-direct {p0}, Ll/᩶ۘۖ;-><init>()V

    .line 2624
    sget-object v0, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    iput-object v0, p0, Ll/ܿܶ᩻;->hash_:Ll/ۛۜۖ;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܿܶ᩻;-><init>()V

    return-void
.end method

.method public constructor <init>(Ll/ۢۜۖ;)V
    .locals 0

    .line 2459
    invoke-direct {p0, p1}, Ll/᩶ۘۖ;-><init>(Ll/ۢۜۖ;)V

    .line 2624
    sget-object p1, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    iput-object p1, p0, Ll/ܿܶ᩻;->hash_:Ll/ۛۜۖ;

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۢۜۖ;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ܿܶ᩻;-><init>(Ll/ۢۜۖ;)V

    return-void
.end method

.method private buildPartial0(Ll/ܳܶ᩻;)V
    .locals 3

    .line 2500
    iget v0, p0, Ll/ܿܶ᩻;->bitField0_:I

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 2503
    iget-wide v1, p0, Ll/ܿܶ᩻;->size_:J

    invoke-static {p1, v1, v2}, Ll/ܳܶ᩻;->-$$Nest$fputsize_(Ll/ܳܶ᩻;J)V

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_1

    .line 2507
    iget-object v0, p0, Ll/ܿܶ᩻;->hash_:Ll/ۛۜۖ;

    invoke-static {p1, v0}, Ll/ܳܶ᩻;->-$$Nest$fputhash_(Ll/ܳܶ᩻;Ll/ۛۜۖ;)V

    or-int/lit8 v1, v1, 0x2

    .line 2510
    :cond_1
    invoke-static {p1}, Ll/ܳܶ᩻;->-$$Nest$fgetbitField0_(Ll/ܳܶ᩻;)I

    move-result v0

    or-int/2addr v0, v1

    invoke-static {p1, v0}, Ll/ܳܶ᩻;->-$$Nest$fputbitField0_(Ll/ܳܶ᩻;I)V

    return-void
.end method

.method public static final getDescriptor()Ll/ᩳۖۖ;
    .locals 1

    .line 2441
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_PartitionInfo_descriptor()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public bridge synthetic build()Ll/ۡ֡ۖ;
    .locals 1

    .line 2435
    invoke-virtual {p0}, Ll/ܿܶ᩻;->build()Ll/ܳܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public build()Ll/ܳܶ᩻;
    .locals 2

    .line 2484
    invoke-virtual {p0}, Ll/ܿܶ᩻;->buildPartial()Ll/ܳܶ᩻;

    move-result-object v0

    .line 2485
    invoke-virtual {v0}, Ll/ܳܶ᩻;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 2486
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public bridge synthetic build()Ll/᩻֡ۖ;
    .locals 1

    .line 2435
    invoke-virtual {p0}, Ll/ܿܶ᩻;->build()Ll/ܳܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Ll/ۡ֡ۖ;
    .locals 1

    .line 2435
    invoke-virtual {p0}, Ll/ܿܶ᩻;->buildPartial()Ll/ܳܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Ll/ܳܶ᩻;
    .locals 2

    .line 2493
    new-instance v0, Ll/ܳܶ᩻;

    invoke-direct {v0, p0}, Ll/ܳܶ᩻;-><init>(Ll/ܿܶ᩻;)V

    .line 2494
    iget v1, p0, Ll/ܿܶ᩻;->bitField0_:I

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, Ll/ܿܶ᩻;->buildPartial0(Ll/ܳܶ᩻;)V

    .line 2495
    :cond_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onBuilt()V

    return-object v0
.end method

.method public bridge synthetic buildPartial()Ll/᩻֡ۖ;
    .locals 1

    .line 2435
    invoke-virtual {p0}, Ll/ܿܶ᩻;->buildPartial()Ll/ܳܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/ۢ֡ۖ;
    .locals 1

    .line 2435
    invoke-virtual {p0}, Ll/ܿܶ᩻;->clear()Ll/ܿܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/ܳ֡ۖ;
    .locals 1

    .line 2435
    invoke-virtual {p0}, Ll/ܿܶ᩻;->clear()Ll/ܿܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public clear()Ll/ܿܶ᩻;
    .locals 2

    .line 2464
    invoke-super {p0}, Ll/᩶ۘۖ;->clear()Ll/᩶ۘۖ;

    const/4 v0, 0x0

    .line 2465
    iput v0, p0, Ll/ܿܶ᩻;->bitField0_:I

    const-wide/16 v0, 0x0

    .line 2466
    iput-wide v0, p0, Ll/ܿܶ᩻;->size_:J

    .line 2467
    sget-object v0, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    iput-object v0, p0, Ll/ܿܶ᩻;->hash_:Ll/ۛۜۖ;

    return-object p0
.end method

.method public bridge synthetic clear()Ll/᩶ۘۖ;
    .locals 1

    .line 2435
    invoke-virtual {p0}, Ll/ܿܶ᩻;->clear()Ll/ܿܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/᩷ۜۖ;
    .locals 1

    .line 2435
    invoke-virtual {p0}, Ll/ܿܶ᩻;->clear()Ll/ܿܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public clearHash()Ll/ܿܶ᩻;
    .locals 1

    .line 2658
    iget v0, p0, Ll/ܿܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Ll/ܿܶ᩻;->bitField0_:I

    .line 2659
    invoke-static {}, Ll/ܳܶ᩻;->getDefaultInstance()Ll/ܳܶ᩻;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܳܶ᩻;->getHash()Ll/ۛۜۖ;

    move-result-object v0

    iput-object v0, p0, Ll/ܿܶ᩻;->hash_:Ll/ۛۜۖ;

    .line 2660
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearSize()Ll/ܿܶ᩻;
    .locals 2

    .line 2618
    iget v0, p0, Ll/ܿܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Ll/ܿܶ᩻;->bitField0_:I

    const-wide/16 v0, 0x0

    .line 2619
    iput-wide v0, p0, Ll/ܿܶ᩻;->size_:J

    .line 2620
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 2435
    invoke-virtual {p0}, Ll/ܿܶ᩻;->getDefaultInstanceForType()Ll/ܳܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Ll/ܳܶ᩻;
    .locals 1

    .line 2479
    invoke-static {}, Ll/ܳܶ᩻;->getDefaultInstance()Ll/ܳܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 2435
    invoke-virtual {p0}, Ll/ܿܶ᩻;->getDefaultInstanceForType()Ll/ܳܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Ll/ᩳۖۖ;
    .locals 1

    .line 2474
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_PartitionInfo_descriptor()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public getHash()Ll/ۛۜۖ;
    .locals 1

    .line 2639
    iget-object v0, p0, Ll/ܿܶ᩻;->hash_:Ll/ۛۜۖ;

    return-object v0
.end method

.method public getSize()J
    .locals 2

    .line 2599
    iget-wide v0, p0, Ll/ܿܶ᩻;->size_:J

    return-wide v0
.end method

.method public hasHash()Z
    .locals 1

    .line 2631
    iget v0, p0, Ll/ܿܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasSize()Z
    .locals 2

    .line 2591
    iget v0, p0, Ll/ܿܶ᩻;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 2447
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_PartitionInfo_fieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/ܳܶ᩻;

    const-class v2, Ll/ܿܶ᩻;

    .line 2448
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۖۜۖ;
    .locals 0

    .line 2435
    invoke-virtual {p0, p1, p2}, Ll/ܿܶ᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܿܶ᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 2435
    invoke-virtual {p0, p1, p2}, Ll/ܿܶ᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܿܶ᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 2435
    invoke-virtual {p0, p1, p2}, Ll/ܿܶ᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܿܶ᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 2435
    invoke-virtual {p0, p1}, Ll/ܿܶ᩻;->mergeFrom(Ll/᩻֡ۖ;)Ll/ܿܶ᩻;

    move-result-object p1

    return-object p1
.end method

.method public mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܿܶ᩻;
    .locals 3

    .line 2547
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :cond_0
    :goto_0
    if-nez v0, :cond_4

    .line 2552
    :try_start_0
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܶ()I

    move-result v1

    if-eqz v1, :cond_3

    const/16 v2, 0x8

    if-eq v1, v2, :cond_2

    const/16 v2, 0x12

    if-eq v1, v2, :cond_1

    .line 2568
    invoke-super {p0, p1, p2, v1}, Ll/᩶ۘۖ;->parseUnknownField(Ll/۟ۜۖ;Ll/ᩳۘۖ;I)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 2563
    :cond_1
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܳ()Ll/ۛۜۖ;

    move-result-object v1

    iput-object v1, p0, Ll/ܿܶ᩻;->hash_:Ll/ۛۜۖ;

    .line 2564
    iget v1, p0, Ll/ܿܶ᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x2

    iput v1, p0, Ll/ܿܶ᩻;->bitField0_:I

    goto :goto_0

    .line 2558
    :cond_2
    invoke-virtual {p1}, Ll/۟ۜۖ;->᩹()J

    move-result-wide v1

    iput-wide v1, p0, Ll/ܿܶ᩻;->size_:J

    .line 2559
    iget v1, p0, Ll/ܿܶ᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ܿܶ᩻;->bitField0_:I
    :try_end_0
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_3
    :goto_1
    const/4 v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 2576
    :try_start_1
    invoke-virtual {p1}, Ll/֫᩵ۖ;->֫()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2578
    :goto_2
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 2579
    throw p1

    .line 2578
    :cond_4
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public mergeFrom(Ll/ܳܶ᩻;)Ll/ܿܶ᩻;
    .locals 2

    .line 2524
    invoke-static {}, Ll/ܳܶ᩻;->getDefaultInstance()Ll/ܳܶ᩻;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 2525
    :cond_0
    invoke-virtual {p1}, Ll/ܳܶ᩻;->hasSize()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2526
    invoke-virtual {p1}, Ll/ܳܶ᩻;->getSize()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ll/ܿܶ᩻;->setSize(J)Ll/ܿܶ᩻;

    .line 2528
    :cond_1
    invoke-virtual {p1}, Ll/ܳܶ᩻;->hasHash()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2529
    invoke-virtual {p1}, Ll/ܳܶ᩻;->getHash()Ll/ۛۜۖ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ܿܶ᩻;->setHash(Ll/ۛۜۖ;)Ll/ܿܶ᩻;

    .line 2531
    :cond_2
    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩶ۘۖ;->mergeUnknownFields(Ll/ۢ֨ۖ;)Ll/᩶ۘۖ;

    .line 2532
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public mergeFrom(Ll/᩻֡ۖ;)Ll/ܿܶ᩻;
    .locals 1

    .line 2515
    instance-of v0, p1, Ll/ܳܶ᩻;

    if-eqz v0, :cond_0

    .line 2516
    check-cast p1, Ll/ܳܶ᩻;

    invoke-virtual {p0, p1}, Ll/ܿܶ᩻;->mergeFrom(Ll/ܳܶ᩻;)Ll/ܿܶ᩻;

    move-result-object p1

    return-object p1

    .line 2518
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 2435
    invoke-virtual {p0, p1, p2}, Ll/ܿܶ᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܿܶ᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 2435
    invoke-virtual {p0, p1}, Ll/ܿܶ᩻;->mergeFrom(Ll/᩻֡ۖ;)Ll/ܿܶ᩻;

    move-result-object p1

    return-object p1
.end method

.method public setHash(Ll/ۛۜۖ;)Ll/ܿܶ᩻;
    .locals 0

    .line 2647
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2648
    iput-object p1, p0, Ll/ܿܶ᩻;->hash_:Ll/ۛۜۖ;

    .line 2649
    iget p1, p0, Ll/ܿܶ᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Ll/ܿܶ᩻;->bitField0_:I

    .line 2650
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setSize(J)Ll/ܿܶ᩻;
    .locals 0

    .line 2608
    iput-wide p1, p0, Ll/ܿܶ᩻;->size_:J

    .line 2609
    iget p1, p0, Ll/ܿܶ᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ܿܶ᩻;->bitField0_:I

    .line 2610
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method
