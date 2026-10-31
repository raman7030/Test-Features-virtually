.class public final Ll/۠ܶ᩻;
.super Ll/᩶ۘۖ;
.source "C9PC"

# interfaces
.implements Ll/᩹ܶ᩻;


# instance fields
.field public batchWrites_:Z

.field public bitField0_:I

.field public threaded_:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13410
    invoke-direct {p0}, Ll/᩶ۘۖ;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/۠ܶ᩻;-><init>()V

    return-void
.end method

.method public constructor <init>(Ll/ۢۜۖ;)V
    .locals 0

    .line 13416
    invoke-direct {p0, p1}, Ll/᩶ۘۖ;-><init>(Ll/ۢۜۖ;)V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۢۜۖ;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/۠ܶ᩻;-><init>(Ll/ۢۜۖ;)V

    return-void
.end method

.method private buildPartial0(Ll/ܶܶ᩻;)V
    .locals 2

    .line 13457
    iget v0, p0, Ll/۠ܶ᩻;->bitField0_:I

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 13460
    iget-boolean v1, p0, Ll/۠ܶ᩻;->threaded_:Z

    invoke-static {p1, v1}, Ll/ܶܶ᩻;->-$$Nest$fputthreaded_(Ll/ܶܶ᩻;Z)V

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_1

    .line 13464
    iget-boolean v0, p0, Ll/۠ܶ᩻;->batchWrites_:Z

    invoke-static {p1, v0}, Ll/ܶܶ᩻;->-$$Nest$fputbatchWrites_(Ll/ܶܶ᩻;Z)V

    or-int/lit8 v1, v1, 0x2

    .line 13467
    :cond_1
    invoke-static {p1}, Ll/ܶܶ᩻;->-$$Nest$fgetbitField0_(Ll/ܶܶ᩻;)I

    move-result v0

    or-int/2addr v0, v1

    invoke-static {p1, v0}, Ll/ܶܶ᩻;->-$$Nest$fputbitField0_(Ll/ܶܶ᩻;I)V

    return-void
.end method

.method public static final getDescriptor()Ll/ᩳۖۖ;
    .locals 1

    .line 13398
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_VABCFeatureSet_descriptor()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public bridge synthetic build()Ll/ۡ֡ۖ;
    .locals 1

    .line 13392
    invoke-virtual {p0}, Ll/۠ܶ᩻;->build()Ll/ܶܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public build()Ll/ܶܶ᩻;
    .locals 2

    .line 13441
    invoke-virtual {p0}, Ll/۠ܶ᩻;->buildPartial()Ll/ܶܶ᩻;

    move-result-object v0

    .line 13442
    invoke-virtual {v0}, Ll/ܶܶ᩻;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 13443
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public bridge synthetic build()Ll/᩻֡ۖ;
    .locals 1

    .line 13392
    invoke-virtual {p0}, Ll/۠ܶ᩻;->build()Ll/ܶܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Ll/ۡ֡ۖ;
    .locals 1

    .line 13392
    invoke-virtual {p0}, Ll/۠ܶ᩻;->buildPartial()Ll/ܶܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Ll/ܶܶ᩻;
    .locals 2

    .line 13450
    new-instance v0, Ll/ܶܶ᩻;

    invoke-direct {v0, p0}, Ll/ܶܶ᩻;-><init>(Ll/۠ܶ᩻;)V

    .line 13451
    iget v1, p0, Ll/۠ܶ᩻;->bitField0_:I

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, Ll/۠ܶ᩻;->buildPartial0(Ll/ܶܶ᩻;)V

    .line 13452
    :cond_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onBuilt()V

    return-object v0
.end method

.method public bridge synthetic buildPartial()Ll/᩻֡ۖ;
    .locals 1

    .line 13392
    invoke-virtual {p0}, Ll/۠ܶ᩻;->buildPartial()Ll/ܶܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public clear()Ll/۠ܶ᩻;
    .locals 1

    .line 13421
    invoke-super {p0}, Ll/᩶ۘۖ;->clear()Ll/᩶ۘۖ;

    const/4 v0, 0x0

    .line 13422
    iput v0, p0, Ll/۠ܶ᩻;->bitField0_:I

    .line 13423
    iput-boolean v0, p0, Ll/۠ܶ᩻;->threaded_:Z

    .line 13424
    iput-boolean v0, p0, Ll/۠ܶ᩻;->batchWrites_:Z

    return-object p0
.end method

.method public bridge synthetic clear()Ll/ۢ֡ۖ;
    .locals 1

    .line 13392
    invoke-virtual {p0}, Ll/۠ܶ᩻;->clear()Ll/۠ܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/ܳ֡ۖ;
    .locals 1

    .line 13392
    invoke-virtual {p0}, Ll/۠ܶ᩻;->clear()Ll/۠ܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/᩶ۘۖ;
    .locals 1

    .line 13392
    invoke-virtual {p0}, Ll/۠ܶ᩻;->clear()Ll/۠ܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/᩷ۜۖ;
    .locals 1

    .line 13392
    invoke-virtual {p0}, Ll/۠ܶ᩻;->clear()Ll/۠ܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public clearBatchWrites()Ll/۠ܶ᩻;
    .locals 1

    .line 13615
    iget v0, p0, Ll/۠ܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Ll/۠ܶ᩻;->bitField0_:I

    const/4 v0, 0x0

    .line 13616
    iput-boolean v0, p0, Ll/۠ܶ᩻;->batchWrites_:Z

    .line 13617
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearThreaded()Ll/۠ܶ᩻;
    .locals 1

    .line 13575
    iget v0, p0, Ll/۠ܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Ll/۠ܶ᩻;->bitField0_:I

    const/4 v0, 0x0

    .line 13576
    iput-boolean v0, p0, Ll/۠ܶ᩻;->threaded_:Z

    .line 13577
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public getBatchWrites()Z
    .locals 1

    .line 13596
    iget-boolean v0, p0, Ll/۠ܶ᩻;->batchWrites_:Z

    return v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 13392
    invoke-virtual {p0}, Ll/۠ܶ᩻;->getDefaultInstanceForType()Ll/ܶܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Ll/ܶܶ᩻;
    .locals 1

    .line 13436
    invoke-static {}, Ll/ܶܶ᩻;->getDefaultInstance()Ll/ܶܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 13392
    invoke-virtual {p0}, Ll/۠ܶ᩻;->getDefaultInstanceForType()Ll/ܶܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Ll/ᩳۖۖ;
    .locals 1

    .line 13431
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_VABCFeatureSet_descriptor()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public getThreaded()Z
    .locals 1

    .line 13556
    iget-boolean v0, p0, Ll/۠ܶ᩻;->threaded_:Z

    return v0
.end method

.method public hasBatchWrites()Z
    .locals 1

    .line 13588
    iget v0, p0, Ll/۠ܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasThreaded()Z
    .locals 2

    .line 13548
    iget v0, p0, Ll/۠ܶ᩻;->bitField0_:I

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

    .line 13404
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_VABCFeatureSet_fieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/ܶܶ᩻;

    const-class v2, Ll/۠ܶ᩻;

    .line 13405
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

    .line 13392
    invoke-virtual {p0, p1, p2}, Ll/۠ܶ᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/۠ܶ᩻;

    move-result-object p1

    return-object p1
.end method

.method public mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/۠ܶ᩻;
    .locals 3

    .line 13504
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :cond_0
    :goto_0
    if-nez v0, :cond_4

    .line 13509
    :try_start_0
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܶ()I

    move-result v1

    if-eqz v1, :cond_3

    const/16 v2, 0x8

    if-eq v1, v2, :cond_2

    const/16 v2, 0x10

    if-eq v1, v2, :cond_1

    .line 13525
    invoke-super {p0, p1, p2, v1}, Ll/᩶ۘۖ;->parseUnknownField(Ll/۟ۜۖ;Ll/ᩳۘۖ;I)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 13520
    :cond_1
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܿ()Z

    move-result v1

    iput-boolean v1, p0, Ll/۠ܶ᩻;->batchWrites_:Z

    .line 13521
    iget v1, p0, Ll/۠ܶ᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x2

    iput v1, p0, Ll/۠ܶ᩻;->bitField0_:I

    goto :goto_0

    .line 13515
    :cond_2
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܿ()Z

    move-result v1

    iput-boolean v1, p0, Ll/۠ܶ᩻;->threaded_:Z

    .line 13516
    iget v1, p0, Ll/۠ܶ᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/۠ܶ᩻;->bitField0_:I
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

    .line 13533
    :try_start_1
    invoke-virtual {p1}, Ll/֫᩵ۖ;->֫()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13535
    :goto_2
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 13536
    throw p1

    .line 13535
    :cond_4
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public mergeFrom(Ll/ܶܶ᩻;)Ll/۠ܶ᩻;
    .locals 1

    .line 13481
    invoke-static {}, Ll/ܶܶ᩻;->getDefaultInstance()Ll/ܶܶ᩻;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 13482
    :cond_0
    invoke-virtual {p1}, Ll/ܶܶ᩻;->hasThreaded()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 13483
    invoke-virtual {p1}, Ll/ܶܶ᩻;->getThreaded()Z

    move-result v0

    invoke-virtual {p0, v0}, Ll/۠ܶ᩻;->setThreaded(Z)Ll/۠ܶ᩻;

    .line 13485
    :cond_1
    invoke-virtual {p1}, Ll/ܶܶ᩻;->hasBatchWrites()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 13486
    invoke-virtual {p1}, Ll/ܶܶ᩻;->getBatchWrites()Z

    move-result v0

    invoke-virtual {p0, v0}, Ll/۠ܶ᩻;->setBatchWrites(Z)Ll/۠ܶ᩻;

    .line 13488
    :cond_2
    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩶ۘۖ;->mergeUnknownFields(Ll/ۢ֨ۖ;)Ll/᩶ۘۖ;

    .line 13489
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public mergeFrom(Ll/᩻֡ۖ;)Ll/۠ܶ᩻;
    .locals 1

    .line 13472
    instance-of v0, p1, Ll/ܶܶ᩻;

    if-eqz v0, :cond_0

    .line 13473
    check-cast p1, Ll/ܶܶ᩻;

    invoke-virtual {p0, p1}, Ll/۠ܶ᩻;->mergeFrom(Ll/ܶܶ᩻;)Ll/۠ܶ᩻;

    move-result-object p1

    return-object p1

    .line 13475
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 13392
    invoke-virtual {p0, p1, p2}, Ll/۠ܶ᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/۠ܶ᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 13392
    invoke-virtual {p0, p1, p2}, Ll/۠ܶ᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/۠ܶ᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 13392
    invoke-virtual {p0, p1}, Ll/۠ܶ᩻;->mergeFrom(Ll/᩻֡ۖ;)Ll/۠ܶ᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 13392
    invoke-virtual {p0, p1, p2}, Ll/۠ܶ᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/۠ܶ᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 13392
    invoke-virtual {p0, p1}, Ll/۠ܶ᩻;->mergeFrom(Ll/᩻֡ۖ;)Ll/۠ܶ᩻;

    move-result-object p1

    return-object p1
.end method

.method public setBatchWrites(Z)Ll/۠ܶ᩻;
    .locals 0

    .line 13605
    iput-boolean p1, p0, Ll/۠ܶ᩻;->batchWrites_:Z

    .line 13606
    iget p1, p0, Ll/۠ܶ᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Ll/۠ܶ᩻;->bitField0_:I

    .line 13607
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setThreaded(Z)Ll/۠ܶ᩻;
    .locals 0

    .line 13565
    iput-boolean p1, p0, Ll/۠ܶ᩻;->threaded_:Z

    .line 13566
    iget p1, p0, Ll/۠ܶ᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/۠ܶ᩻;->bitField0_:I

    .line 13567
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method
