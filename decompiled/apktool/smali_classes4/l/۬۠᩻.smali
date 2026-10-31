.class public final Ll/۬۠᩻;
.super Ll/᩶ۘۖ;
.source "C9PC"

# interfaces
.implements Ll/ۛ۠᩻;


# instance fields
.field public bitField0_:I

.field public numBlocks_:J

.field public startBlock_:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 361
    invoke-direct {p0}, Ll/᩶ۘۖ;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/۬۠᩻;-><init>()V

    return-void
.end method

.method public constructor <init>(Ll/ۢۜۖ;)V
    .locals 0

    .line 367
    invoke-direct {p0, p1}, Ll/᩶ۘۖ;-><init>(Ll/ۢۜۖ;)V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۢۜۖ;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/۬۠᩻;-><init>(Ll/ۢۜۖ;)V

    return-void
.end method

.method private buildPartial0(Ll/۫۠᩻;)V
    .locals 4

    .line 408
    iget v0, p0, Ll/۬۠᩻;->bitField0_:I

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 411
    iget-wide v1, p0, Ll/۬۠᩻;->startBlock_:J

    invoke-static {p1, v1, v2}, Ll/۫۠᩻;->-$$Nest$fputstartBlock_(Ll/۫۠᩻;J)V

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_1

    .line 415
    iget-wide v2, p0, Ll/۬۠᩻;->numBlocks_:J

    invoke-static {p1, v2, v3}, Ll/۫۠᩻;->-$$Nest$fputnumBlocks_(Ll/۫۠᩻;J)V

    or-int/lit8 v1, v1, 0x2

    .line 418
    :cond_1
    invoke-static {p1}, Ll/۫۠᩻;->-$$Nest$fgetbitField0_(Ll/۫۠᩻;)I

    move-result v0

    or-int/2addr v0, v1

    invoke-static {v0, p1}, Ll/۫۠᩻;->-$$Nest$fputbitField0_(ILl/۫۠᩻;)V

    return-void
.end method

.method public static final getDescriptor()Ll/ᩳۖۖ;
    .locals 1

    .line 349
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_Extent_descriptor()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public bridge synthetic build()Ll/ۡ֡ۖ;
    .locals 1

    .line 343
    invoke-virtual {p0}, Ll/۬۠᩻;->build()Ll/۫۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public build()Ll/۫۠᩻;
    .locals 2

    .line 392
    invoke-virtual {p0}, Ll/۬۠᩻;->buildPartial()Ll/۫۠᩻;

    move-result-object v0

    .line 393
    invoke-virtual {v0}, Ll/۫۠᩻;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 394
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public bridge synthetic build()Ll/᩻֡ۖ;
    .locals 1

    .line 343
    invoke-virtual {p0}, Ll/۬۠᩻;->build()Ll/۫۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Ll/ۡ֡ۖ;
    .locals 1

    .line 343
    invoke-virtual {p0}, Ll/۬۠᩻;->buildPartial()Ll/۫۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Ll/۫۠᩻;
    .locals 2

    .line 401
    new-instance v0, Ll/۫۠᩻;

    invoke-direct {v0, p0}, Ll/۫۠᩻;-><init>(Ll/۬۠᩻;)V

    .line 402
    iget v1, p0, Ll/۬۠᩻;->bitField0_:I

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, Ll/۬۠᩻;->buildPartial0(Ll/۫۠᩻;)V

    .line 403
    :cond_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onBuilt()V

    return-object v0
.end method

.method public bridge synthetic buildPartial()Ll/᩻֡ۖ;
    .locals 1

    .line 343
    invoke-virtual {p0}, Ll/۬۠᩻;->buildPartial()Ll/۫۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/ۢ֡ۖ;
    .locals 1

    .line 343
    invoke-virtual {p0}, Ll/۬۠᩻;->clear()Ll/۬۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public clear()Ll/۬۠᩻;
    .locals 2

    .line 372
    invoke-super {p0}, Ll/᩶ۘۖ;->clear()Ll/᩶ۘۖ;

    const/4 v0, 0x0

    .line 373
    iput v0, p0, Ll/۬۠᩻;->bitField0_:I

    const-wide/16 v0, 0x0

    .line 374
    iput-wide v0, p0, Ll/۬۠᩻;->startBlock_:J

    .line 375
    iput-wide v0, p0, Ll/۬۠᩻;->numBlocks_:J

    return-object p0
.end method

.method public bridge synthetic clear()Ll/ܳ֡ۖ;
    .locals 1

    .line 343
    invoke-virtual {p0}, Ll/۬۠᩻;->clear()Ll/۬۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/᩶ۘۖ;
    .locals 1

    .line 343
    invoke-virtual {p0}, Ll/۬۠᩻;->clear()Ll/۬۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/᩷ۜۖ;
    .locals 1

    .line 343
    invoke-virtual {p0}, Ll/۬۠᩻;->clear()Ll/۬۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public clearNumBlocks()Ll/۬۠᩻;
    .locals 2

    .line 566
    iget v0, p0, Ll/۬۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Ll/۬۠᩻;->bitField0_:I

    const-wide/16 v0, 0x0

    .line 567
    iput-wide v0, p0, Ll/۬۠᩻;->numBlocks_:J

    .line 568
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearStartBlock()Ll/۬۠᩻;
    .locals 2

    .line 526
    iget v0, p0, Ll/۬۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Ll/۬۠᩻;->bitField0_:I

    const-wide/16 v0, 0x0

    .line 527
    iput-wide v0, p0, Ll/۬۠᩻;->startBlock_:J

    .line 528
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 343
    invoke-virtual {p0}, Ll/۬۠᩻;->getDefaultInstanceForType()Ll/۫۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Ll/۫۠᩻;
    .locals 1

    .line 387
    invoke-static {}, Ll/۫۠᩻;->getDefaultInstance()Ll/۫۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 343
    invoke-virtual {p0}, Ll/۬۠᩻;->getDefaultInstanceForType()Ll/۫۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Ll/ᩳۖۖ;
    .locals 1

    .line 382
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_Extent_descriptor()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public getNumBlocks()J
    .locals 2

    .line 547
    iget-wide v0, p0, Ll/۬۠᩻;->numBlocks_:J

    return-wide v0
.end method

.method public getStartBlock()J
    .locals 2

    .line 507
    iget-wide v0, p0, Ll/۬۠᩻;->startBlock_:J

    return-wide v0
.end method

.method public hasNumBlocks()Z
    .locals 1

    .line 539
    iget v0, p0, Ll/۬۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasStartBlock()Z
    .locals 2

    .line 499
    iget v0, p0, Ll/۬۠᩻;->bitField0_:I

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

    .line 355
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_Extent_fieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/۫۠᩻;

    const-class v2, Ll/۬۠᩻;

    .line 356
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

    .line 343
    invoke-virtual {p0, p1, p2}, Ll/۬۠᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/۬۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 343
    invoke-virtual {p0, p1, p2}, Ll/۬۠᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/۬۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/۬۠᩻;
    .locals 3

    .line 455
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :cond_0
    :goto_0
    if-nez v0, :cond_4

    .line 460
    :try_start_0
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܶ()I

    move-result v1

    if-eqz v1, :cond_3

    const/16 v2, 0x8

    if-eq v1, v2, :cond_2

    const/16 v2, 0x10

    if-eq v1, v2, :cond_1

    .line 476
    invoke-super {p0, p1, p2, v1}, Ll/᩶ۘۖ;->parseUnknownField(Ll/۟ۜۖ;Ll/ᩳۘۖ;I)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 471
    :cond_1
    invoke-virtual {p1}, Ll/۟ۜۖ;->᩹()J

    move-result-wide v1

    iput-wide v1, p0, Ll/۬۠᩻;->numBlocks_:J

    .line 472
    iget v1, p0, Ll/۬۠᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x2

    iput v1, p0, Ll/۬۠᩻;->bitField0_:I

    goto :goto_0

    .line 466
    :cond_2
    invoke-virtual {p1}, Ll/۟ۜۖ;->᩹()J

    move-result-wide v1

    iput-wide v1, p0, Ll/۬۠᩻;->startBlock_:J

    .line 467
    iget v1, p0, Ll/۬۠᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/۬۠᩻;->bitField0_:I
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

    .line 484
    :try_start_1
    invoke-virtual {p1}, Ll/֫᩵ۖ;->֫()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 486
    :goto_2
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 487
    throw p1

    .line 486
    :cond_4
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public mergeFrom(Ll/۫۠᩻;)Ll/۬۠᩻;
    .locals 2

    .line 432
    invoke-static {}, Ll/۫۠᩻;->getDefaultInstance()Ll/۫۠᩻;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 433
    :cond_0
    invoke-virtual {p1}, Ll/۫۠᩻;->hasStartBlock()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 434
    invoke-virtual {p1}, Ll/۫۠᩻;->getStartBlock()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ll/۬۠᩻;->setStartBlock(J)Ll/۬۠᩻;

    .line 436
    :cond_1
    invoke-virtual {p1}, Ll/۫۠᩻;->hasNumBlocks()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 437
    invoke-virtual {p1}, Ll/۫۠᩻;->getNumBlocks()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ll/۬۠᩻;->setNumBlocks(J)Ll/۬۠᩻;

    .line 439
    :cond_2
    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩶ۘۖ;->mergeUnknownFields(Ll/ۢ֨ۖ;)Ll/᩶ۘۖ;

    .line 440
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public mergeFrom(Ll/᩻֡ۖ;)Ll/۬۠᩻;
    .locals 1

    .line 423
    instance-of v0, p1, Ll/۫۠᩻;

    if-eqz v0, :cond_0

    .line 424
    check-cast p1, Ll/۫۠᩻;

    invoke-virtual {p0, p1}, Ll/۬۠᩻;->mergeFrom(Ll/۫۠᩻;)Ll/۬۠᩻;

    move-result-object p1

    return-object p1

    .line 426
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 343
    invoke-virtual {p0, p1, p2}, Ll/۬۠᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/۬۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 343
    invoke-virtual {p0, p1}, Ll/۬۠᩻;->mergeFrom(Ll/᩻֡ۖ;)Ll/۬۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 343
    invoke-virtual {p0, p1, p2}, Ll/۬۠᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/۬۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 343
    invoke-virtual {p0, p1}, Ll/۬۠᩻;->mergeFrom(Ll/᩻֡ۖ;)Ll/۬۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public setNumBlocks(J)Ll/۬۠᩻;
    .locals 0

    .line 556
    iput-wide p1, p0, Ll/۬۠᩻;->numBlocks_:J

    .line 557
    iget p1, p0, Ll/۬۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Ll/۬۠᩻;->bitField0_:I

    .line 558
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setStartBlock(J)Ll/۬۠᩻;
    .locals 0

    .line 516
    iput-wide p1, p0, Ll/۬۠᩻;->startBlock_:J

    .line 517
    iget p1, p0, Ll/۬۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/۬۠᩻;->bitField0_:I

    .line 518
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method
