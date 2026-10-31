.class public final Ll/۟֨᩻;
.super Ll/᩶ۘۖ;
.source "C9PC"

# interfaces
.implements Ll/ܽ۠᩻;


# instance fields
.field public bitField0_:I

.field public decompressedSize_:J

.field public isCompressed_:Z

.field public packageName_:Ljava/lang/Object;

.field public version_:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16234
    invoke-direct {p0}, Ll/᩶ۘۖ;-><init>()V

    const-string v0, ""

    .line 16393
    iput-object v0, p0, Ll/۟֨᩻;->packageName_:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/۟֨᩻;-><init>()V

    return-void
.end method

.method public constructor <init>(Ll/ۢۜۖ;)V
    .locals 0

    .line 16240
    invoke-direct {p0, p1}, Ll/᩶ۘۖ;-><init>(Ll/ۢۜۖ;)V

    const-string p1, ""

    .line 16393
    iput-object p1, p0, Ll/۟֨᩻;->packageName_:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۢۜۖ;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/۟֨᩻;-><init>(Ll/ۢۜۖ;)V

    return-void
.end method

.method private buildPartial0(Ll/֫۠᩻;)V
    .locals 4

    .line 16283
    iget v0, p0, Ll/۟֨᩻;->bitField0_:I

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 16286
    iget-object v1, p0, Ll/۟֨᩻;->packageName_:Ljava/lang/Object;

    invoke-static {p1, v1}, Ll/֫۠᩻;->-$$Nest$fputpackageName_(Ll/֫۠᩻;Ljava/lang/Object;)V

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    .line 16290
    iget-wide v2, p0, Ll/۟֨᩻;->version_:J

    invoke-static {p1, v2, v3}, Ll/֫۠᩻;->-$$Nest$fputversion_(Ll/֫۠᩻;J)V

    or-int/lit8 v1, v1, 0x2

    :cond_1
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_2

    .line 16294
    iget-boolean v2, p0, Ll/۟֨᩻;->isCompressed_:Z

    invoke-static {p1, v2}, Ll/֫۠᩻;->-$$Nest$fputisCompressed_(Ll/֫۠᩻;Z)V

    or-int/lit8 v1, v1, 0x4

    :cond_2
    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_3

    .line 16298
    iget-wide v2, p0, Ll/۟֨᩻;->decompressedSize_:J

    invoke-static {p1, v2, v3}, Ll/֫۠᩻;->-$$Nest$fputdecompressedSize_(Ll/֫۠᩻;J)V

    or-int/lit8 v1, v1, 0x8

    .line 16301
    :cond_3
    invoke-static {p1}, Ll/֫۠᩻;->-$$Nest$fgetbitField0_(Ll/֫۠᩻;)I

    move-result v0

    or-int/2addr v0, v1

    invoke-static {v0, p1}, Ll/֫۠᩻;->-$$Nest$fputbitField0_(ILl/֫۠᩻;)V

    return-void
.end method

.method public static final getDescriptor()Ll/ᩳۖۖ;
    .locals 1

    .line 16222
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_ApexInfo_descriptor()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public build()Ll/֫۠᩻;
    .locals 2

    .line 16267
    invoke-virtual {p0}, Ll/۟֨᩻;->buildPartial()Ll/֫۠᩻;

    move-result-object v0

    .line 16268
    invoke-virtual {v0}, Ll/֫۠᩻;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 16269
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public bridge synthetic build()Ll/ۡ֡ۖ;
    .locals 1

    .line 16216
    invoke-virtual {p0}, Ll/۟֨᩻;->build()Ll/֫۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Ll/᩻֡ۖ;
    .locals 1

    .line 16216
    invoke-virtual {p0}, Ll/۟֨᩻;->build()Ll/֫۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Ll/֫۠᩻;
    .locals 2

    .line 16276
    new-instance v0, Ll/֫۠᩻;

    invoke-direct {v0, p0}, Ll/֫۠᩻;-><init>(Ll/۟֨᩻;)V

    .line 16277
    iget v1, p0, Ll/۟֨᩻;->bitField0_:I

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, Ll/۟֨᩻;->buildPartial0(Ll/֫۠᩻;)V

    .line 16278
    :cond_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onBuilt()V

    return-object v0
.end method

.method public bridge synthetic buildPartial()Ll/ۡ֡ۖ;
    .locals 1

    .line 16216
    invoke-virtual {p0}, Ll/۟֨᩻;->buildPartial()Ll/֫۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Ll/᩻֡ۖ;
    .locals 1

    .line 16216
    invoke-virtual {p0}, Ll/۟֨᩻;->buildPartial()Ll/֫۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public clear()Ll/۟֨᩻;
    .locals 3

    .line 16245
    invoke-super {p0}, Ll/᩶ۘۖ;->clear()Ll/᩶ۘۖ;

    const/4 v0, 0x0

    .line 16246
    iput v0, p0, Ll/۟֨᩻;->bitField0_:I

    const-string v1, ""

    .line 16247
    iput-object v1, p0, Ll/۟֨᩻;->packageName_:Ljava/lang/Object;

    const-wide/16 v1, 0x0

    .line 16248
    iput-wide v1, p0, Ll/۟֨᩻;->version_:J

    .line 16249
    iput-boolean v0, p0, Ll/۟֨᩻;->isCompressed_:Z

    .line 16250
    iput-wide v1, p0, Ll/۟֨᩻;->decompressedSize_:J

    return-object p0
.end method

.method public bridge synthetic clear()Ll/ۢ֡ۖ;
    .locals 1

    .line 16216
    invoke-virtual {p0}, Ll/۟֨᩻;->clear()Ll/۟֨᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/ܳ֡ۖ;
    .locals 1

    .line 16216
    invoke-virtual {p0}, Ll/۟֨᩻;->clear()Ll/۟֨᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/᩶ۘۖ;
    .locals 1

    .line 16216
    invoke-virtual {p0}, Ll/۟֨᩻;->clear()Ll/۟֨᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/᩷ۜۖ;
    .locals 1

    .line 16216
    invoke-virtual {p0}, Ll/۟֨᩻;->clear()Ll/۟֨᩻;

    move-result-object v0

    return-object v0
.end method

.method public clearDecompressedSize()Ll/۟֨᩻;
    .locals 2

    .line 16587
    iget v0, p0, Ll/۟֨᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Ll/۟֨᩻;->bitField0_:I

    const-wide/16 v0, 0x0

    .line 16588
    iput-wide v0, p0, Ll/۟֨᩻;->decompressedSize_:J

    .line 16589
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearIsCompressed()Ll/۟֨᩻;
    .locals 1

    .line 16547
    iget v0, p0, Ll/۟֨᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Ll/۟֨᩻;->bitField0_:I

    const/4 v0, 0x0

    .line 16548
    iput-boolean v0, p0, Ll/۟֨᩻;->isCompressed_:Z

    .line 16549
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearPackageName()Ll/۟֨᩻;
    .locals 1

    .line 16454
    invoke-static {}, Ll/֫۠᩻;->getDefaultInstance()Ll/֫۠᩻;

    move-result-object v0

    invoke-virtual {v0}, Ll/֫۠᩻;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/۟֨᩻;->packageName_:Ljava/lang/Object;

    .line 16455
    iget v0, p0, Ll/۟֨᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Ll/۟֨᩻;->bitField0_:I

    .line 16456
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearVersion()Ll/۟֨᩻;
    .locals 2

    .line 16507
    iget v0, p0, Ll/۟֨᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Ll/۟֨᩻;->bitField0_:I

    const-wide/16 v0, 0x0

    .line 16508
    iput-wide v0, p0, Ll/۟֨᩻;->version_:J

    .line 16509
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public getDecompressedSize()J
    .locals 2

    .line 16568
    iget-wide v0, p0, Ll/۟֨᩻;->decompressedSize_:J

    return-wide v0
.end method

.method public getDefaultInstanceForType()Ll/֫۠᩻;
    .locals 1

    .line 16262
    invoke-static {}, Ll/֫۠᩻;->getDefaultInstance()Ll/֫۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 16216
    invoke-virtual {p0}, Ll/۟֨᩻;->getDefaultInstanceForType()Ll/֫۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 16216
    invoke-virtual {p0}, Ll/۟֨᩻;->getDefaultInstanceForType()Ll/֫۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Ll/ᩳۖۖ;
    .locals 1

    .line 16257
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_ApexInfo_descriptor()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public getIsCompressed()Z
    .locals 1

    .line 16528
    iget-boolean v0, p0, Ll/۟֨᩻;->isCompressed_:Z

    return v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 2

    .line 16406
    iget-object v0, p0, Ll/۟֨᩻;->packageName_:Ljava/lang/Object;

    .line 16407
    instance-of v1, v0, Ljava/lang/String;

    if-nez v1, :cond_1

    .line 16408
    check-cast v0, Ll/ۛۜۖ;

    .line 16410
    invoke-virtual {v0}, Ll/ۛۜۖ;->ܳ()Ljava/lang/String;

    move-result-object v1

    .line 16411
    invoke-virtual {v0}, Ll/ۛۜۖ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 16412
    iput-object v1, p0, Ll/۟֨᩻;->packageName_:Ljava/lang/Object;

    :cond_0
    return-object v1

    .line 16416
    :cond_1
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getPackageNameBytes()Ll/ۛۜۖ;
    .locals 2

    .line 16425
    iget-object v0, p0, Ll/۟֨᩻;->packageName_:Ljava/lang/Object;

    .line 16426
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 16427
    check-cast v0, Ljava/lang/String;

    .line 16428
    invoke-static {v0}, Ll/ۛۜۖ;->֫(Ljava/lang/String;)Ll/ۛۜۖ;

    move-result-object v0

    .line 16430
    iput-object v0, p0, Ll/۟֨᩻;->packageName_:Ljava/lang/Object;

    return-object v0

    .line 16433
    :cond_0
    check-cast v0, Ll/ۛۜۖ;

    return-object v0
.end method

.method public getVersion()J
    .locals 2

    .line 16488
    iget-wide v0, p0, Ll/۟֨᩻;->version_:J

    return-wide v0
.end method

.method public hasDecompressedSize()Z
    .locals 1

    .line 16560
    iget v0, p0, Ll/۟֨᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasIsCompressed()Z
    .locals 1

    .line 16520
    iget v0, p0, Ll/۟֨᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasPackageName()Z
    .locals 2

    .line 16399
    iget v0, p0, Ll/۟֨᩻;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasVersion()Z
    .locals 1

    .line 16480
    iget v0, p0, Ll/۟֨᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 16228
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_ApexInfo_fieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/֫۠᩻;

    const-class v2, Ll/۟֨᩻;

    .line 16229
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

    .line 16216
    invoke-virtual {p0, p1, p2}, Ll/۟֨᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/۟֨᩻;

    move-result-object p1

    return-object p1
.end method

.method public mergeFrom(Ll/֫۠᩻;)Ll/۟֨᩻;
    .locals 2

    .line 16315
    invoke-static {}, Ll/֫۠᩻;->getDefaultInstance()Ll/֫۠᩻;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 16316
    :cond_0
    invoke-virtual {p1}, Ll/֫۠᩻;->hasPackageName()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 16317
    invoke-static {p1}, Ll/֫۠᩻;->-$$Nest$fgetpackageName_(Ll/֫۠᩻;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Ll/۟֨᩻;->packageName_:Ljava/lang/Object;

    .line 16318
    iget v0, p0, Ll/۟֨᩻;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/۟֨᩻;->bitField0_:I

    .line 16319
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 16321
    :cond_1
    invoke-virtual {p1}, Ll/֫۠᩻;->hasVersion()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 16322
    invoke-virtual {p1}, Ll/֫۠᩻;->getVersion()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ll/۟֨᩻;->setVersion(J)Ll/۟֨᩻;

    .line 16324
    :cond_2
    invoke-virtual {p1}, Ll/֫۠᩻;->hasIsCompressed()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 16325
    invoke-virtual {p1}, Ll/֫۠᩻;->getIsCompressed()Z

    move-result v0

    invoke-virtual {p0, v0}, Ll/۟֨᩻;->setIsCompressed(Z)Ll/۟֨᩻;

    .line 16327
    :cond_3
    invoke-virtual {p1}, Ll/֫۠᩻;->hasDecompressedSize()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 16328
    invoke-virtual {p1}, Ll/֫۠᩻;->getDecompressedSize()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ll/۟֨᩻;->setDecompressedSize(J)Ll/۟֨᩻;

    .line 16330
    :cond_4
    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩶ۘۖ;->mergeUnknownFields(Ll/ۢ֨ۖ;)Ll/᩶ۘۖ;

    .line 16331
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/۟֨᩻;
    .locals 3

    .line 16346
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :cond_0
    :goto_0
    if-nez v0, :cond_6

    .line 16351
    :try_start_0
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܶ()I

    move-result v1

    if-eqz v1, :cond_5

    const/16 v2, 0xa

    if-eq v1, v2, :cond_4

    const/16 v2, 0x10

    if-eq v1, v2, :cond_3

    const/16 v2, 0x18

    if-eq v1, v2, :cond_2

    const/16 v2, 0x20

    if-eq v1, v2, :cond_1

    .line 16377
    invoke-super {p0, p1, p2, v1}, Ll/᩶ۘۖ;->parseUnknownField(Ll/۟ۜۖ;Ll/ᩳۘۖ;I)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 16372
    :cond_1
    invoke-virtual {p1}, Ll/۟ۜۖ;->ۖ()J

    move-result-wide v1

    iput-wide v1, p0, Ll/۟֨᩻;->decompressedSize_:J

    .line 16373
    iget v1, p0, Ll/۟֨᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x8

    iput v1, p0, Ll/۟֨᩻;->bitField0_:I

    goto :goto_0

    .line 16367
    :cond_2
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܿ()Z

    move-result v1

    iput-boolean v1, p0, Ll/۟֨᩻;->isCompressed_:Z

    .line 16368
    iget v1, p0, Ll/۟֨᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Ll/۟֨᩻;->bitField0_:I

    goto :goto_0

    .line 16362
    :cond_3
    invoke-virtual {p1}, Ll/۟ۜۖ;->ۖ()J

    move-result-wide v1

    iput-wide v1, p0, Ll/۟֨᩻;->version_:J

    .line 16363
    iget v1, p0, Ll/۟֨᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x2

    iput v1, p0, Ll/۟֨᩻;->bitField0_:I

    goto :goto_0

    .line 16357
    :cond_4
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܳ()Ll/ۛۜۖ;

    move-result-object v1

    iput-object v1, p0, Ll/۟֨᩻;->packageName_:Ljava/lang/Object;

    .line 16358
    iget v1, p0, Ll/۟֨᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/۟֨᩻;->bitField0_:I
    :try_end_0
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_5
    :goto_1
    const/4 v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 16385
    :try_start_1
    invoke-virtual {p1}, Ll/֫᩵ۖ;->֫()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16387
    :goto_2
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 16388
    throw p1

    .line 16387
    :cond_6
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public mergeFrom(Ll/᩻֡ۖ;)Ll/۟֨᩻;
    .locals 1

    .line 16306
    instance-of v0, p1, Ll/֫۠᩻;

    if-eqz v0, :cond_0

    .line 16307
    check-cast p1, Ll/֫۠᩻;

    invoke-virtual {p0, p1}, Ll/۟֨᩻;->mergeFrom(Ll/֫۠᩻;)Ll/۟֨᩻;

    move-result-object p1

    return-object p1

    .line 16309
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 16216
    invoke-virtual {p0, p1, p2}, Ll/۟֨᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/۟֨᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 16216
    invoke-virtual {p0, p1, p2}, Ll/۟֨᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/۟֨᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 16216
    invoke-virtual {p0, p1}, Ll/۟֨᩻;->mergeFrom(Ll/᩻֡ۖ;)Ll/۟֨᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 16216
    invoke-virtual {p0, p1, p2}, Ll/۟֨᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/۟֨᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 16216
    invoke-virtual {p0, p1}, Ll/۟֨᩻;->mergeFrom(Ll/᩻֡ۖ;)Ll/۟֨᩻;

    move-result-object p1

    return-object p1
.end method

.method public setDecompressedSize(J)Ll/۟֨᩻;
    .locals 0

    .line 16577
    iput-wide p1, p0, Ll/۟֨᩻;->decompressedSize_:J

    .line 16578
    iget p1, p0, Ll/۟֨᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x8

    iput p1, p0, Ll/۟֨᩻;->bitField0_:I

    .line 16579
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setIsCompressed(Z)Ll/۟֨᩻;
    .locals 0

    .line 16537
    iput-boolean p1, p0, Ll/۟֨᩻;->isCompressed_:Z

    .line 16538
    iget p1, p0, Ll/۟֨᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Ll/۟֨᩻;->bitField0_:I

    .line 16539
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setPackageName(Ljava/lang/String;)Ll/۟֨᩻;
    .locals 0

    .line 16443
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16444
    iput-object p1, p0, Ll/۟֨᩻;->packageName_:Ljava/lang/Object;

    .line 16445
    iget p1, p0, Ll/۟֨᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/۟֨᩻;->bitField0_:I

    .line 16446
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setPackageNameBytes(Ll/ۛۜۖ;)Ll/۟֨᩻;
    .locals 0

    .line 16466
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16467
    iput-object p1, p0, Ll/۟֨᩻;->packageName_:Ljava/lang/Object;

    .line 16468
    iget p1, p0, Ll/۟֨᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/۟֨᩻;->bitField0_:I

    .line 16469
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setVersion(J)Ll/۟֨᩻;
    .locals 0

    .line 16497
    iput-wide p1, p0, Ll/۟֨᩻;->version_:J

    .line 16498
    iget p1, p0, Ll/۟֨᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Ll/۟֨᩻;->bitField0_:I

    .line 16499
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method
