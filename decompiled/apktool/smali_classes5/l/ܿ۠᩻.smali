.class public final Ll/ܿ۠᩻;
.super Ll/᩶ۘۖ;
.source "C9PC"

# interfaces
.implements Ll/ۢ۠᩻;


# instance fields
.field public bitField0_:I

.field public dstExtentBuilder_:Ll/ܺۚۖ;

.field public dstExtent_:Ll/۫۠᩻;

.field public srcExtentBuilder_:Ll/ܺۚۖ;

.field public srcExtent_:Ll/۫۠᩻;

.field public srcOffset_:I

.field public type_:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 5902
    invoke-direct {p0}, Ll/᩶ۘۖ;-><init>()V

    const/4 v0, 0x0

    .line 6089
    iput v0, p0, Ll/ܿ۠᩻;->type_:I

    .line 5903
    invoke-direct {p0}, Ll/ܿ۠᩻;->maybeForceBuilderInitialization()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܿ۠᩻;-><init>()V

    return-void
.end method

.method public constructor <init>(Ll/ۢۜۖ;)V
    .locals 0

    .line 5908
    invoke-direct {p0, p1}, Ll/᩶ۘۖ;-><init>(Ll/ۢۜۖ;)V

    const/4 p1, 0x0

    .line 6089
    iput p1, p0, Ll/ܿ۠᩻;->type_:I

    .line 5909
    invoke-direct {p0}, Ll/ܿ۠᩻;->maybeForceBuilderInitialization()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۢۜۖ;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ܿ۠᩻;-><init>(Ll/ۢۜۖ;)V

    return-void
.end method

.method private buildPartial0(Ll/ۜ۠᩻;)V
    .locals 3

    .line 5966
    iget v0, p0, Ll/ܿ۠᩻;->bitField0_:I

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 5969
    iget v1, p0, Ll/ܿ۠᩻;->type_:I

    invoke-static {v1, p1}, Ll/ۜ۠᩻;->-$$Nest$fputtype_(ILl/ۜ۠᩻;)V

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_2

    .line 5973
    iget-object v2, p0, Ll/ܿ۠᩻;->srcExtentBuilder_:Ll/ܺۚۖ;

    if-nez v2, :cond_1

    .line 5974
    iget-object v2, p0, Ll/ܿ۠᩻;->srcExtent_:Ll/۫۠᩻;

    goto :goto_1

    .line 5975
    :cond_1
    invoke-virtual {v2}, Ll/ܺۚۖ;->ۧ()Ll/ۘᩴۖ;

    move-result-object v2

    check-cast v2, Ll/۫۠᩻;

    :goto_1
    invoke-static {p1, v2}, Ll/ۜ۠᩻;->-$$Nest$fputsrcExtent_(Ll/ۜ۠᩻;Ll/۫۠᩻;)V

    or-int/lit8 v1, v1, 0x2

    :cond_2
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_4

    .line 5979
    iget-object v2, p0, Ll/ܿ۠᩻;->dstExtentBuilder_:Ll/ܺۚۖ;

    if-nez v2, :cond_3

    .line 5980
    iget-object v2, p0, Ll/ܿ۠᩻;->dstExtent_:Ll/۫۠᩻;

    goto :goto_2

    .line 5981
    :cond_3
    invoke-virtual {v2}, Ll/ܺۚۖ;->ۧ()Ll/ۘᩴۖ;

    move-result-object v2

    check-cast v2, Ll/۫۠᩻;

    :goto_2
    invoke-static {p1, v2}, Ll/ۜ۠᩻;->-$$Nest$fputdstExtent_(Ll/ۜ۠᩻;Ll/۫۠᩻;)V

    or-int/lit8 v1, v1, 0x4

    :cond_4
    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_5

    .line 5985
    iget v0, p0, Ll/ܿ۠᩻;->srcOffset_:I

    invoke-static {v0, p1}, Ll/ۜ۠᩻;->-$$Nest$fputsrcOffset_(ILl/ۜ۠᩻;)V

    or-int/lit8 v1, v1, 0x8

    .line 5988
    :cond_5
    invoke-static {p1}, Ll/ۜ۠᩻;->-$$Nest$fgetbitField0_(Ll/ۜ۠᩻;)I

    move-result v0

    or-int/2addr v0, v1

    invoke-static {v0, p1}, Ll/ۜ۠᩻;->-$$Nest$fputbitField0_(ILl/ۜ۠᩻;)V

    return-void
.end method

.method public static final getDescriptor()Ll/ᩳۖۖ;
    .locals 1

    .line 5890
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_CowMergeOperation_descriptor()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method private getDstExtentFieldBuilder()Ll/ܺۚۖ;
    .locals 4

    .line 6362
    iget-object v0, p0, Ll/ܿ۠᩻;->dstExtentBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 6363
    new-instance v0, Ll/ܺۚۖ;

    .line 6365
    invoke-virtual {p0}, Ll/ܿ۠᩻;->getDstExtent()Ll/۫۠᩻;

    move-result-object v1

    .line 6366
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v2

    .line 6367
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Ll/ܺۚۖ;-><init>(Ll/ۘᩴۖ;Ll/ۢۜۖ;Z)V

    iput-object v0, p0, Ll/ܿ۠᩻;->dstExtentBuilder_:Ll/ܺۚۖ;

    const/4 v0, 0x0

    .line 6368
    iput-object v0, p0, Ll/ܿ۠᩻;->dstExtent_:Ll/۫۠᩻;

    .line 6370
    :cond_0
    iget-object v0, p0, Ll/ܿ۠᩻;->dstExtentBuilder_:Ll/ܺۚۖ;

    return-object v0
.end method

.method private getSrcExtentFieldBuilder()Ll/ܺۚۖ;
    .locals 4

    .line 6241
    iget-object v0, p0, Ll/ܿ۠᩻;->srcExtentBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 6242
    new-instance v0, Ll/ܺۚۖ;

    .line 6244
    invoke-virtual {p0}, Ll/ܿ۠᩻;->getSrcExtent()Ll/۫۠᩻;

    move-result-object v1

    .line 6245
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v2

    .line 6246
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Ll/ܺۚۖ;-><init>(Ll/ۘᩴۖ;Ll/ۢۜۖ;Z)V

    iput-object v0, p0, Ll/ܿ۠᩻;->srcExtentBuilder_:Ll/ܺۚۖ;

    const/4 v0, 0x0

    .line 6247
    iput-object v0, p0, Ll/ܿ۠᩻;->srcExtent_:Ll/۫۠᩻;

    .line 6249
    :cond_0
    iget-object v0, p0, Ll/ܿ۠᩻;->srcExtentBuilder_:Ll/ܺۚۖ;

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 5913
    invoke-static {}, Ll/ۜ۠᩻;->access$300()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5914
    invoke-direct {p0}, Ll/ܿ۠᩻;->getSrcExtentFieldBuilder()Ll/ܺۚۖ;

    .line 5915
    invoke-direct {p0}, Ll/ܿ۠᩻;->getDstExtentFieldBuilder()Ll/ܺۚۖ;

    :cond_0
    return-void
.end method


# virtual methods
.method public build()Ll/ۜ۠᩻;
    .locals 2

    .line 5950
    invoke-virtual {p0}, Ll/ܿ۠᩻;->buildPartial()Ll/ۜ۠᩻;

    move-result-object v0

    .line 5951
    invoke-virtual {v0}, Ll/ۜ۠᩻;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 5952
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public bridge synthetic build()Ll/ۡ֡ۖ;
    .locals 1

    .line 5884
    invoke-virtual {p0}, Ll/ܿ۠᩻;->build()Ll/ۜ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Ll/᩻֡ۖ;
    .locals 1

    .line 5884
    invoke-virtual {p0}, Ll/ܿ۠᩻;->build()Ll/ۜ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Ll/ۜ۠᩻;
    .locals 2

    .line 5959
    new-instance v0, Ll/ۜ۠᩻;

    invoke-direct {v0, p0}, Ll/ۜ۠᩻;-><init>(Ll/ܿ۠᩻;)V

    .line 5960
    iget v1, p0, Ll/ܿ۠᩻;->bitField0_:I

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, Ll/ܿ۠᩻;->buildPartial0(Ll/ۜ۠᩻;)V

    .line 5961
    :cond_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onBuilt()V

    return-object v0
.end method

.method public bridge synthetic buildPartial()Ll/ۡ֡ۖ;
    .locals 1

    .line 5884
    invoke-virtual {p0}, Ll/ܿ۠᩻;->buildPartial()Ll/ۜ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Ll/᩻֡ۖ;
    .locals 1

    .line 5884
    invoke-virtual {p0}, Ll/ܿ۠᩻;->buildPartial()Ll/ۜ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/ۢ֡ۖ;
    .locals 1

    .line 5884
    invoke-virtual {p0}, Ll/ܿ۠᩻;->clear()Ll/ܿ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/ܳ֡ۖ;
    .locals 1

    .line 5884
    invoke-virtual {p0}, Ll/ܿ۠᩻;->clear()Ll/ܿ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public clear()Ll/ܿ۠᩻;
    .locals 3

    .line 5920
    invoke-super {p0}, Ll/᩶ۘۖ;->clear()Ll/᩶ۘۖ;

    const/4 v0, 0x0

    .line 5921
    iput v0, p0, Ll/ܿ۠᩻;->bitField0_:I

    .line 5922
    iput v0, p0, Ll/ܿ۠᩻;->type_:I

    const/4 v1, 0x0

    .line 5923
    iput-object v1, p0, Ll/ܿ۠᩻;->srcExtent_:Ll/۫۠᩻;

    .line 5924
    iget-object v2, p0, Ll/ܿ۠᩻;->srcExtentBuilder_:Ll/ܺۚۖ;

    if-eqz v2, :cond_0

    .line 5925
    invoke-virtual {v2}, Ll/ܺۚۖ;->ܽ()V

    .line 5926
    iput-object v1, p0, Ll/ܿ۠᩻;->srcExtentBuilder_:Ll/ܺۚۖ;

    .line 5928
    :cond_0
    iput-object v1, p0, Ll/ܿ۠᩻;->dstExtent_:Ll/۫۠᩻;

    .line 5929
    iget-object v2, p0, Ll/ܿ۠᩻;->dstExtentBuilder_:Ll/ܺۚۖ;

    if-eqz v2, :cond_1

    .line 5930
    invoke-virtual {v2}, Ll/ܺۚۖ;->ܽ()V

    .line 5931
    iput-object v1, p0, Ll/ܿ۠᩻;->dstExtentBuilder_:Ll/ܺۚۖ;

    .line 5933
    :cond_1
    iput v0, p0, Ll/ܿ۠᩻;->srcOffset_:I

    return-object p0
.end method

.method public bridge synthetic clear()Ll/᩶ۘۖ;
    .locals 1

    .line 5884
    invoke-virtual {p0}, Ll/ܿ۠᩻;->clear()Ll/ܿ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/᩷ۜۖ;
    .locals 1

    .line 5884
    invoke-virtual {p0}, Ll/ܿ۠᩻;->clear()Ll/ܿ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public clearDstExtent()Ll/ܿ۠᩻;
    .locals 2

    .line 6328
    iget v0, p0, Ll/ܿ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Ll/ܿ۠᩻;->bitField0_:I

    const/4 v0, 0x0

    .line 6329
    iput-object v0, p0, Ll/ܿ۠᩻;->dstExtent_:Ll/۫۠᩻;

    .line 6330
    iget-object v1, p0, Ll/ܿ۠᩻;->dstExtentBuilder_:Ll/ܺۚۖ;

    if-eqz v1, :cond_0

    .line 6331
    invoke-virtual {v1}, Ll/ܺۚۖ;->ܽ()V

    .line 6332
    iput-object v0, p0, Ll/ܿ۠᩻;->dstExtentBuilder_:Ll/ܺۚۖ;

    .line 6334
    :cond_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearSrcExtent()Ll/ܿ۠᩻;
    .locals 2

    .line 6207
    iget v0, p0, Ll/ܿ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Ll/ܿ۠᩻;->bitField0_:I

    const/4 v0, 0x0

    .line 6208
    iput-object v0, p0, Ll/ܿ۠᩻;->srcExtent_:Ll/۫۠᩻;

    .line 6209
    iget-object v1, p0, Ll/ܿ۠᩻;->srcExtentBuilder_:Ll/ܺۚۖ;

    if-eqz v1, :cond_0

    .line 6210
    invoke-virtual {v1}, Ll/ܺۚۖ;->ܽ()V

    .line 6211
    iput-object v0, p0, Ll/ܿ۠᩻;->srcExtentBuilder_:Ll/ܺۚۖ;

    .line 6213
    :cond_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearSrcOffset()Ll/ܿ۠᩻;
    .locals 1

    .line 6447
    iget v0, p0, Ll/ܿ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Ll/ܿ۠᩻;->bitField0_:I

    const/4 v0, 0x0

    .line 6448
    iput v0, p0, Ll/ܿ۠᩻;->srcOffset_:I

    .line 6449
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearType()Ll/ܿ۠᩻;
    .locals 1

    .line 6125
    iget v0, p0, Ll/ܿ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Ll/ܿ۠᩻;->bitField0_:I

    const/4 v0, 0x0

    .line 6126
    iput v0, p0, Ll/ܿ۠᩻;->type_:I

    .line 6127
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public getDefaultInstanceForType()Ll/ۜ۠᩻;
    .locals 1

    .line 5945
    invoke-static {}, Ll/ۜ۠᩻;->getDefaultInstance()Ll/ۜ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 5884
    invoke-virtual {p0}, Ll/ܿ۠᩻;->getDefaultInstanceForType()Ll/ۜ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 5884
    invoke-virtual {p0}, Ll/ܿ۠᩻;->getDefaultInstanceForType()Ll/ۜ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Ll/ᩳۖۖ;
    .locals 1

    .line 5940
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_CowMergeOperation_descriptor()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public getDstExtent()Ll/۫۠᩻;
    .locals 1

    .line 6267
    iget-object v0, p0, Ll/ܿ۠᩻;->dstExtentBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_1

    .line 6268
    iget-object v0, p0, Ll/ܿ۠᩻;->dstExtent_:Ll/۫۠᩻;

    if-nez v0, :cond_0

    invoke-static {}, Ll/۫۠᩻;->getDefaultInstance()Ll/۫۠᩻;

    move-result-object v0

    :cond_0
    return-object v0

    .line 6270
    :cond_1
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܿ()Ll/ۘᩴۖ;

    move-result-object v0

    check-cast v0, Ll/۫۠᩻;

    return-object v0
.end method

.method public getDstExtentBuilder()Ll/۬۠᩻;
    .locals 1

    .line 6341
    iget v0, p0, Ll/ܿ۠᩻;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Ll/ܿ۠᩻;->bitField0_:I

    .line 6342
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 6343
    invoke-direct {p0}, Ll/ܿ۠᩻;->getDstExtentFieldBuilder()Ll/ܺۚۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v0

    check-cast v0, Ll/۬۠᩻;

    return-object v0
.end method

.method public getDstExtentOrBuilder()Ll/ۛ۠᩻;
    .locals 1

    .line 6349
    iget-object v0, p0, Ll/ܿ۠᩻;->dstExtentBuilder_:Ll/ܺۚۖ;

    if-eqz v0, :cond_0

    .line 6350
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܳ()Ll/ۘ֡ۖ;

    move-result-object v0

    check-cast v0, Ll/ۛ۠᩻;

    return-object v0

    .line 6352
    :cond_0
    iget-object v0, p0, Ll/ܿ۠᩻;->dstExtent_:Ll/۫۠᩻;

    if-nez v0, :cond_1

    .line 6353
    invoke-static {}, Ll/۫۠᩻;->getDefaultInstance()Ll/۫۠᩻;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public getSrcExtent()Ll/۫۠᩻;
    .locals 1

    .line 6146
    iget-object v0, p0, Ll/ܿ۠᩻;->srcExtentBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_1

    .line 6147
    iget-object v0, p0, Ll/ܿ۠᩻;->srcExtent_:Ll/۫۠᩻;

    if-nez v0, :cond_0

    invoke-static {}, Ll/۫۠᩻;->getDefaultInstance()Ll/۫۠᩻;

    move-result-object v0

    :cond_0
    return-object v0

    .line 6149
    :cond_1
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܿ()Ll/ۘᩴۖ;

    move-result-object v0

    check-cast v0, Ll/۫۠᩻;

    return-object v0
.end method

.method public getSrcExtentBuilder()Ll/۬۠᩻;
    .locals 1

    .line 6220
    iget v0, p0, Ll/ܿ۠᩻;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Ll/ܿ۠᩻;->bitField0_:I

    .line 6221
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 6222
    invoke-direct {p0}, Ll/ܿ۠᩻;->getSrcExtentFieldBuilder()Ll/ܺۚۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v0

    check-cast v0, Ll/۬۠᩻;

    return-object v0
.end method

.method public getSrcExtentOrBuilder()Ll/ۛ۠᩻;
    .locals 1

    .line 6228
    iget-object v0, p0, Ll/ܿ۠᩻;->srcExtentBuilder_:Ll/ܺۚۖ;

    if-eqz v0, :cond_0

    .line 6229
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܳ()Ll/ۘ֡ۖ;

    move-result-object v0

    check-cast v0, Ll/ۛ۠᩻;

    return-object v0

    .line 6231
    :cond_0
    iget-object v0, p0, Ll/ܿ۠᩻;->srcExtent_:Ll/۫۠᩻;

    if-nez v0, :cond_1

    .line 6232
    invoke-static {}, Ll/۫۠᩻;->getDefaultInstance()Ll/۫۠᩻;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public getSrcOffset()I
    .locals 1

    .line 6408
    iget v0, p0, Ll/ܿ۠᩻;->srcOffset_:I

    return v0
.end method

.method public getType()Ll/᩻۠᩻;
    .locals 1

    .line 6103
    iget v0, p0, Ll/ܿ۠᩻;->type_:I

    invoke-static {v0}, Ll/᩻۠᩻;->forNumber(I)Ll/᩻۠᩻;

    move-result-object v0

    if-nez v0, :cond_0

    .line 6104
    sget-object v0, Ll/᩻۠᩻;->COW_COPY:Ll/᩻۠᩻;

    :cond_0
    return-object v0
.end method

.method public hasDstExtent()Z
    .locals 1

    .line 6260
    iget v0, p0, Ll/ܿ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasSrcExtent()Z
    .locals 1

    .line 6139
    iget v0, p0, Ll/ܿ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasSrcOffset()Z
    .locals 1

    .line 6390
    iget v0, p0, Ll/ܿ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasType()Z
    .locals 2

    .line 6095
    iget v0, p0, Ll/ܿ۠᩻;->bitField0_:I

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

    .line 5896
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_CowMergeOperation_fieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/ۜ۠᩻;

    const-class v2, Ll/ܿ۠᩻;

    .line 5897
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public mergeDstExtent(Ll/۫۠᩻;)Ll/ܿ۠᩻;
    .locals 2

    .line 6307
    iget-object v0, p0, Ll/ܿ۠᩻;->dstExtentBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_1

    .line 6308
    iget v0, p0, Ll/ܿ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܿ۠᩻;->dstExtent_:Ll/۫۠᩻;

    if-eqz v0, :cond_0

    .line 6310
    invoke-static {}, Ll/۫۠᩻;->getDefaultInstance()Ll/۫۠᩻;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 6311
    invoke-virtual {p0}, Ll/ܿ۠᩻;->getDstExtentBuilder()Ll/۬۠᩻;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/۬۠᩻;->mergeFrom(Ll/۫۠᩻;)Ll/۬۠᩻;

    goto :goto_0

    .line 6313
    :cond_0
    iput-object p1, p0, Ll/ܿ۠᩻;->dstExtent_:Ll/۫۠᩻;

    goto :goto_0

    .line 6316
    :cond_1
    invoke-virtual {v0, p1}, Ll/ܺۚۖ;->֫(Ll/ۘᩴۖ;)V

    .line 6318
    :goto_0
    iget-object p1, p0, Ll/ܿ۠᩻;->dstExtent_:Ll/۫۠᩻;

    if-eqz p1, :cond_2

    .line 6319
    iget p1, p0, Ll/ܿ۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Ll/ܿ۠᩻;->bitField0_:I

    .line 6320
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    :cond_2
    return-object p0
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۖۜۖ;
    .locals 0

    .line 5884
    invoke-virtual {p0, p1, p2}, Ll/ܿ۠᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܿ۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 5884
    invoke-virtual {p0, p1, p2}, Ll/ܿ۠᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܿ۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 5884
    invoke-virtual {p0, p1, p2}, Ll/ܿ۠᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܿ۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 5884
    invoke-virtual {p0, p1}, Ll/ܿ۠᩻;->mergeFrom(Ll/᩻֡ۖ;)Ll/ܿ۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public mergeFrom(Ll/ۜ۠᩻;)Ll/ܿ۠᩻;
    .locals 1

    .line 6002
    invoke-static {}, Ll/ۜ۠᩻;->getDefaultInstance()Ll/ۜ۠᩻;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 6003
    :cond_0
    invoke-virtual {p1}, Ll/ۜ۠᩻;->hasType()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6004
    invoke-virtual {p1}, Ll/ۜ۠᩻;->getType()Ll/᩻۠᩻;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ܿ۠᩻;->setType(Ll/᩻۠᩻;)Ll/ܿ۠᩻;

    .line 6006
    :cond_1
    invoke-virtual {p1}, Ll/ۜ۠᩻;->hasSrcExtent()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6007
    invoke-virtual {p1}, Ll/ۜ۠᩻;->getSrcExtent()Ll/۫۠᩻;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ܿ۠᩻;->mergeSrcExtent(Ll/۫۠᩻;)Ll/ܿ۠᩻;

    .line 6009
    :cond_2
    invoke-virtual {p1}, Ll/ۜ۠᩻;->hasDstExtent()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 6010
    invoke-virtual {p1}, Ll/ۜ۠᩻;->getDstExtent()Ll/۫۠᩻;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ܿ۠᩻;->mergeDstExtent(Ll/۫۠᩻;)Ll/ܿ۠᩻;

    .line 6012
    :cond_3
    invoke-virtual {p1}, Ll/ۜ۠᩻;->hasSrcOffset()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 6013
    invoke-virtual {p1}, Ll/ۜ۠᩻;->getSrcOffset()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/ܿ۠᩻;->setSrcOffset(I)Ll/ܿ۠᩻;

    .line 6015
    :cond_4
    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩶ۘۖ;->mergeUnknownFields(Ll/ۢ֨ۖ;)Ll/᩶ۘۖ;

    .line 6016
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܿ۠᩻;
    .locals 4

    .line 6031
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :cond_0
    :goto_0
    if-nez v0, :cond_7

    .line 6036
    :try_start_0
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܶ()I

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_6

    const/16 v3, 0x8

    if-eq v1, v3, :cond_4

    const/16 v2, 0x12

    if-eq v1, v2, :cond_3

    const/16 v2, 0x1a

    if-eq v1, v2, :cond_2

    const/16 v2, 0x20

    if-eq v1, v2, :cond_1

    .line 6073
    invoke-super {p0, p1, p2, v1}, Ll/᩶ۘۖ;->parseUnknownField(Ll/۟ۜۖ;Ll/ᩳۘۖ;I)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 6068
    :cond_1
    invoke-virtual {p1}, Ll/۟ۜۖ;->᩸()I

    move-result v1

    iput v1, p0, Ll/ܿ۠᩻;->srcOffset_:I

    .line 6069
    iget v1, p0, Ll/ܿ۠᩻;->bitField0_:I

    or-int/2addr v1, v3

    iput v1, p0, Ll/ܿ۠᩻;->bitField0_:I

    goto :goto_0

    .line 6062
    :cond_2
    invoke-direct {p0}, Ll/ܿ۠᩻;->getDstExtentFieldBuilder()Ll/ܺۚۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v1

    .line 6061
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/ۢ֡ۖ;Ll/ᩳۘۖ;)V

    .line 6064
    iget v1, p0, Ll/ܿ۠᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Ll/ܿ۠᩻;->bitField0_:I

    goto :goto_0

    .line 6055
    :cond_3
    invoke-direct {p0}, Ll/ܿ۠᩻;->getSrcExtentFieldBuilder()Ll/ܺۚۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v1

    .line 6054
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/ۢ֡ۖ;Ll/ᩳۘۖ;)V

    .line 6057
    iget v1, p0, Ll/ܿ۠᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x2

    iput v1, p0, Ll/ܿ۠᩻;->bitField0_:I

    goto :goto_0

    .line 6042
    :cond_4
    invoke-virtual {p1}, Ll/۟ۜۖ;->ۜ()I

    move-result v1

    .line 6044
    invoke-static {v1}, Ll/᩻۠᩻;->forNumber(I)Ll/᩻۠᩻;

    move-result-object v3

    if-nez v3, :cond_5

    .line 6046
    invoke-virtual {p0, v2, v1}, Ll/᩶ۘۖ;->mergeUnknownVarintField(II)V

    goto :goto_0

    .line 6048
    :cond_5
    iput v1, p0, Ll/ܿ۠᩻;->type_:I

    .line 6049
    iget v1, p0, Ll/ܿ۠᩻;->bitField0_:I

    or-int/2addr v1, v2

    iput v1, p0, Ll/ܿ۠᩻;->bitField0_:I
    :try_end_0
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_6
    :goto_1
    const/4 v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 6081
    :try_start_1
    invoke-virtual {p1}, Ll/֫᩵ۖ;->֫()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 6083
    :goto_2
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 6084
    throw p1

    .line 6083
    :cond_7
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public mergeFrom(Ll/᩻֡ۖ;)Ll/ܿ۠᩻;
    .locals 1

    .line 5993
    instance-of v0, p1, Ll/ۜ۠᩻;

    if-eqz v0, :cond_0

    .line 5994
    check-cast p1, Ll/ۜ۠᩻;

    invoke-virtual {p0, p1}, Ll/ܿ۠᩻;->mergeFrom(Ll/ۜ۠᩻;)Ll/ܿ۠᩻;

    move-result-object p1

    return-object p1

    .line 5996
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 5884
    invoke-virtual {p0, p1, p2}, Ll/ܿ۠᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܿ۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 5884
    invoke-virtual {p0, p1}, Ll/ܿ۠᩻;->mergeFrom(Ll/᩻֡ۖ;)Ll/ܿ۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public mergeSrcExtent(Ll/۫۠᩻;)Ll/ܿ۠᩻;
    .locals 2

    .line 6186
    iget-object v0, p0, Ll/ܿ۠᩻;->srcExtentBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_1

    .line 6187
    iget v0, p0, Ll/ܿ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܿ۠᩻;->srcExtent_:Ll/۫۠᩻;

    if-eqz v0, :cond_0

    .line 6189
    invoke-static {}, Ll/۫۠᩻;->getDefaultInstance()Ll/۫۠᩻;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 6190
    invoke-virtual {p0}, Ll/ܿ۠᩻;->getSrcExtentBuilder()Ll/۬۠᩻;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/۬۠᩻;->mergeFrom(Ll/۫۠᩻;)Ll/۬۠᩻;

    goto :goto_0

    .line 6192
    :cond_0
    iput-object p1, p0, Ll/ܿ۠᩻;->srcExtent_:Ll/۫۠᩻;

    goto :goto_0

    .line 6195
    :cond_1
    invoke-virtual {v0, p1}, Ll/ܺۚۖ;->֫(Ll/ۘᩴۖ;)V

    .line 6197
    :goto_0
    iget-object p1, p0, Ll/ܿ۠᩻;->srcExtent_:Ll/۫۠᩻;

    if-eqz p1, :cond_2

    .line 6198
    iget p1, p0, Ll/ܿ۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Ll/ܿ۠᩻;->bitField0_:I

    .line 6199
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    :cond_2
    return-object p0
.end method

.method public setDstExtent(Ll/۫۠᩻;)Ll/ܿ۠᩻;
    .locals 1

    .line 6277
    iget-object v0, p0, Ll/ܿ۠᩻;->dstExtentBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 6279
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6281
    iput-object p1, p0, Ll/ܿ۠᩻;->dstExtent_:Ll/۫۠᩻;

    goto :goto_0

    .line 6283
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܺۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    .line 6285
    :goto_0
    iget p1, p0, Ll/ܿ۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Ll/ܿ۠᩻;->bitField0_:I

    .line 6286
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setDstExtent(Ll/۬۠᩻;)Ll/ܿ۠᩻;
    .locals 1

    .line 6294
    iget-object v0, p0, Ll/ܿ۠᩻;->dstExtentBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 6295
    invoke-virtual {p1}, Ll/۬۠᩻;->build()Ll/۫۠᩻;

    move-result-object p1

    iput-object p1, p0, Ll/ܿ۠᩻;->dstExtent_:Ll/۫۠᩻;

    goto :goto_0

    .line 6297
    :cond_0
    invoke-virtual {p1}, Ll/۬۠᩻;->build()Ll/۫۠᩻;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ܺۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    .line 6299
    :goto_0
    iget p1, p0, Ll/ܿ۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Ll/ܿ۠᩻;->bitField0_:I

    .line 6300
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setSrcExtent(Ll/۫۠᩻;)Ll/ܿ۠᩻;
    .locals 1

    .line 6156
    iget-object v0, p0, Ll/ܿ۠᩻;->srcExtentBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 6158
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6160
    iput-object p1, p0, Ll/ܿ۠᩻;->srcExtent_:Ll/۫۠᩻;

    goto :goto_0

    .line 6162
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܺۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    .line 6164
    :goto_0
    iget p1, p0, Ll/ܿ۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Ll/ܿ۠᩻;->bitField0_:I

    .line 6165
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setSrcExtent(Ll/۬۠᩻;)Ll/ܿ۠᩻;
    .locals 1

    .line 6173
    iget-object v0, p0, Ll/ܿ۠᩻;->srcExtentBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 6174
    invoke-virtual {p1}, Ll/۬۠᩻;->build()Ll/۫۠᩻;

    move-result-object p1

    iput-object p1, p0, Ll/ܿ۠᩻;->srcExtent_:Ll/۫۠᩻;

    goto :goto_0

    .line 6176
    :cond_0
    invoke-virtual {p1}, Ll/۬۠᩻;->build()Ll/۫۠᩻;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ܺۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    .line 6178
    :goto_0
    iget p1, p0, Ll/ܿ۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Ll/ܿ۠᩻;->bitField0_:I

    .line 6179
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setSrcOffset(I)Ll/ܿ۠᩻;
    .locals 0

    .line 6427
    iput p1, p0, Ll/ܿ۠᩻;->srcOffset_:I

    .line 6428
    iget p1, p0, Ll/ܿ۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x8

    iput p1, p0, Ll/ܿ۠᩻;->bitField0_:I

    .line 6429
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setType(Ll/᩻۠᩻;)Ll/ܿ۠᩻;
    .locals 1

    .line 6113
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6115
    iget v0, p0, Ll/ܿ۠᩻;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܿ۠᩻;->bitField0_:I

    .line 6116
    invoke-virtual {p1}, Ll/᩻۠᩻;->getNumber()I

    move-result p1

    iput p1, p0, Ll/ܿ۠᩻;->type_:I

    .line 6117
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method
