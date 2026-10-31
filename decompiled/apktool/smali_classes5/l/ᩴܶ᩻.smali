.class public final Ll/ᩴܶ᩻;
.super Ll/᩶ۘۖ;
.source "C9PC"

# interfaces
.implements Ll/ۚܶ᩻;


# instance fields
.field public bitField0_:I

.field public data_:Ll/ۛۜۖ;

.field public unpaddedSignatureSize_:I

.field public version_:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1099
    invoke-direct {p0}, Ll/᩶ۘۖ;-><init>()V

    .line 1291
    sget-object v0, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    iput-object v0, p0, Ll/ᩴܶ᩻;->data_:Ll/ۛۜۖ;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ᩴܶ᩻;-><init>()V

    return-void
.end method

.method public constructor <init>(Ll/ۢۜۖ;)V
    .locals 0

    .line 1105
    invoke-direct {p0, p1}, Ll/᩶ۘۖ;-><init>(Ll/ۢۜۖ;)V

    .line 1291
    sget-object p1, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    iput-object p1, p0, Ll/ᩴܶ᩻;->data_:Ll/ۛۜۖ;

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۢۜۖ;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ᩴܶ᩻;-><init>(Ll/ۢۜۖ;)V

    return-void
.end method

.method private buildPartial0(Ll/᩵ܶ᩻;)V
    .locals 3

    .line 1147
    iget v0, p0, Ll/ᩴܶ᩻;->bitField0_:I

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 1150
    iget v1, p0, Ll/ᩴܶ᩻;->version_:I

    invoke-static {v1, p1}, Ll/᩵ܶ᩻;->-$$Nest$fputversion_(ILl/᩵ܶ᩻;)V

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    .line 1154
    iget-object v2, p0, Ll/ᩴܶ᩻;->data_:Ll/ۛۜۖ;

    invoke-static {p1, v2}, Ll/᩵ܶ᩻;->-$$Nest$fputdata_(Ll/᩵ܶ᩻;Ll/ۛۜۖ;)V

    or-int/lit8 v1, v1, 0x2

    :cond_1
    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_2

    .line 1158
    iget v0, p0, Ll/ᩴܶ᩻;->unpaddedSignatureSize_:I

    invoke-static {v0, p1}, Ll/᩵ܶ᩻;->-$$Nest$fputunpaddedSignatureSize_(ILl/᩵ܶ᩻;)V

    or-int/lit8 v1, v1, 0x4

    .line 1161
    :cond_2
    invoke-static {p1}, Ll/᩵ܶ᩻;->-$$Nest$fgetbitField0_(Ll/᩵ܶ᩻;)I

    move-result v0

    or-int/2addr v0, v1

    invoke-static {v0, p1}, Ll/᩵ܶ᩻;->-$$Nest$fputbitField0_(ILl/᩵ܶ᩻;)V

    return-void
.end method

.method public static final getDescriptor()Ll/ᩳۖۖ;
    .locals 1

    .line 1087
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_Signatures_Signature_descriptor()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public bridge synthetic build()Ll/ۡ֡ۖ;
    .locals 1

    .line 1081
    invoke-virtual {p0}, Ll/ᩴܶ᩻;->build()Ll/᩵ܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public build()Ll/᩵ܶ᩻;
    .locals 2

    .line 1131
    invoke-virtual {p0}, Ll/ᩴܶ᩻;->buildPartial()Ll/᩵ܶ᩻;

    move-result-object v0

    .line 1132
    invoke-virtual {v0}, Ll/᩵ܶ᩻;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 1133
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public bridge synthetic build()Ll/᩻֡ۖ;
    .locals 1

    .line 1081
    invoke-virtual {p0}, Ll/ᩴܶ᩻;->build()Ll/᩵ܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Ll/ۡ֡ۖ;
    .locals 1

    .line 1081
    invoke-virtual {p0}, Ll/ᩴܶ᩻;->buildPartial()Ll/᩵ܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Ll/᩵ܶ᩻;
    .locals 2

    .line 1140
    new-instance v0, Ll/᩵ܶ᩻;

    invoke-direct {v0, p0}, Ll/᩵ܶ᩻;-><init>(Ll/ᩴܶ᩻;)V

    .line 1141
    iget v1, p0, Ll/ᩴܶ᩻;->bitField0_:I

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, Ll/ᩴܶ᩻;->buildPartial0(Ll/᩵ܶ᩻;)V

    .line 1142
    :cond_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onBuilt()V

    return-object v0
.end method

.method public bridge synthetic buildPartial()Ll/᩻֡ۖ;
    .locals 1

    .line 1081
    invoke-virtual {p0}, Ll/ᩴܶ᩻;->buildPartial()Ll/᩵ܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/ۢ֡ۖ;
    .locals 1

    .line 1081
    invoke-virtual {p0}, Ll/ᩴܶ᩻;->clear()Ll/ᩴܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/ܳ֡ۖ;
    .locals 1

    .line 1081
    invoke-virtual {p0}, Ll/ᩴܶ᩻;->clear()Ll/ᩴܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public clear()Ll/ᩴܶ᩻;
    .locals 2

    .line 1110
    invoke-super {p0}, Ll/᩶ۘۖ;->clear()Ll/᩶ۘۖ;

    const/4 v0, 0x0

    .line 1111
    iput v0, p0, Ll/ᩴܶ᩻;->bitField0_:I

    .line 1112
    iput v0, p0, Ll/ᩴܶ᩻;->version_:I

    .line 1113
    sget-object v1, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    iput-object v1, p0, Ll/ᩴܶ᩻;->data_:Ll/ۛۜۖ;

    .line 1114
    iput v0, p0, Ll/ᩴܶ᩻;->unpaddedSignatureSize_:I

    return-object p0
.end method

.method public bridge synthetic clear()Ll/᩶ۘۖ;
    .locals 1

    .line 1081
    invoke-virtual {p0}, Ll/ᩴܶ᩻;->clear()Ll/ᩴܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/᩷ۜۖ;
    .locals 1

    .line 1081
    invoke-virtual {p0}, Ll/ᩴܶ᩻;->clear()Ll/ᩴܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public clearData()Ll/ᩴܶ᩻;
    .locals 1

    .line 1325
    iget v0, p0, Ll/ᩴܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Ll/ᩴܶ᩻;->bitField0_:I

    .line 1326
    invoke-static {}, Ll/᩵ܶ᩻;->getDefaultInstance()Ll/᩵ܶ᩻;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩵ܶ᩻;->getData()Ll/ۛۜۖ;

    move-result-object v0

    iput-object v0, p0, Ll/ᩴܶ᩻;->data_:Ll/ۛۜۖ;

    .line 1327
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearUnpaddedSignatureSize()Ll/ᩴܶ᩻;
    .locals 1

    .line 1405
    iget v0, p0, Ll/ᩴܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Ll/ᩴܶ᩻;->bitField0_:I

    const/4 v0, 0x0

    .line 1406
    iput v0, p0, Ll/ᩴܶ᩻;->unpaddedSignatureSize_:I

    .line 1407
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearVersion()Ll/ᩴܶ᩻;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1285
    iget v0, p0, Ll/ᩴܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Ll/ᩴܶ᩻;->bitField0_:I

    const/4 v0, 0x0

    .line 1286
    iput v0, p0, Ll/ᩴܶ᩻;->version_:I

    .line 1287
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public getData()Ll/ۛۜۖ;
    .locals 1

    .line 1306
    iget-object v0, p0, Ll/ᩴܶ᩻;->data_:Ll/ۛۜۖ;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 1081
    invoke-virtual {p0}, Ll/ᩴܶ᩻;->getDefaultInstanceForType()Ll/᩵ܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Ll/᩵ܶ᩻;
    .locals 1

    .line 1126
    invoke-static {}, Ll/᩵ܶ᩻;->getDefaultInstance()Ll/᩵ܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 1081
    invoke-virtual {p0}, Ll/ᩴܶ᩻;->getDefaultInstanceForType()Ll/᩵ܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Ll/ᩳۖۖ;
    .locals 1

    .line 1121
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_Signatures_Signature_descriptor()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public getUnpaddedSignatureSize()I
    .locals 1

    .line 1366
    iget v0, p0, Ll/ᩴܶ᩻;->unpaddedSignatureSize_:I

    return v0
.end method

.method public getVersion()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1262
    iget v0, p0, Ll/ᩴܶ᩻;->version_:I

    return v0
.end method

.method public hasData()Z
    .locals 1

    .line 1298
    iget v0, p0, Ll/ᩴܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasUnpaddedSignatureSize()Z
    .locals 1

    .line 1348
    iget v0, p0, Ll/ᩴܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasVersion()Z
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1252
    iget v0, p0, Ll/ᩴܶ᩻;->bitField0_:I

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

    .line 1093
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_Signatures_Signature_fieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/᩵ܶ᩻;

    const-class v2, Ll/ᩴܶ᩻;

    .line 1094
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

    .line 1081
    invoke-virtual {p0, p1, p2}, Ll/ᩴܶ᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ᩴܶ᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 1081
    invoke-virtual {p0, p1, p2}, Ll/ᩴܶ᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ᩴܶ᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 1081
    invoke-virtual {p0, p1, p2}, Ll/ᩴܶ᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ᩴܶ᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 1081
    invoke-virtual {p0, p1}, Ll/ᩴܶ᩻;->mergeFrom(Ll/᩻֡ۖ;)Ll/ᩴܶ᩻;

    move-result-object p1

    return-object p1
.end method

.method public mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ᩴܶ᩻;
    .locals 3

    .line 1201
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :cond_0
    :goto_0
    if-nez v0, :cond_5

    .line 1206
    :try_start_0
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܶ()I

    move-result v1

    if-eqz v1, :cond_4

    const/16 v2, 0x8

    if-eq v1, v2, :cond_3

    const/16 v2, 0x12

    if-eq v1, v2, :cond_2

    const/16 v2, 0x1d

    if-eq v1, v2, :cond_1

    .line 1227
    invoke-super {p0, p1, p2, v1}, Ll/᩶ۘۖ;->parseUnknownField(Ll/۟ۜۖ;Ll/ᩳۘۖ;I)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 1222
    :cond_1
    invoke-virtual {p1}, Ll/۟ۜۖ;->᩷()I

    move-result v1

    iput v1, p0, Ll/ᩴܶ᩻;->unpaddedSignatureSize_:I

    .line 1223
    iget v1, p0, Ll/ᩴܶ᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Ll/ᩴܶ᩻;->bitField0_:I

    goto :goto_0

    .line 1217
    :cond_2
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܳ()Ll/ۛۜۖ;

    move-result-object v1

    iput-object v1, p0, Ll/ᩴܶ᩻;->data_:Ll/ۛۜۖ;

    .line 1218
    iget v1, p0, Ll/ᩴܶ᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x2

    iput v1, p0, Ll/ᩴܶ᩻;->bitField0_:I

    goto :goto_0

    .line 1212
    :cond_3
    invoke-virtual {p1}, Ll/۟ۜۖ;->᩸()I

    move-result v1

    iput v1, p0, Ll/ᩴܶ᩻;->version_:I

    .line 1213
    iget v1, p0, Ll/ᩴܶ᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ᩴܶ᩻;->bitField0_:I
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

    .line 1235
    :try_start_1
    invoke-virtual {p1}, Ll/֫᩵ۖ;->֫()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1237
    :goto_2
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 1238
    throw p1

    .line 1237
    :cond_5
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public mergeFrom(Ll/᩵ܶ᩻;)Ll/ᩴܶ᩻;
    .locals 1

    .line 1175
    invoke-static {}, Ll/᩵ܶ᩻;->getDefaultInstance()Ll/᩵ܶ᩻;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 1176
    :cond_0
    invoke-virtual {p1}, Ll/᩵ܶ᩻;->hasVersion()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1177
    invoke-virtual {p1}, Ll/᩵ܶ᩻;->getVersion()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/ᩴܶ᩻;->setVersion(I)Ll/ᩴܶ᩻;

    .line 1179
    :cond_1
    invoke-virtual {p1}, Ll/᩵ܶ᩻;->hasData()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1180
    invoke-virtual {p1}, Ll/᩵ܶ᩻;->getData()Ll/ۛۜۖ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ᩴܶ᩻;->setData(Ll/ۛۜۖ;)Ll/ᩴܶ᩻;

    .line 1182
    :cond_2
    invoke-virtual {p1}, Ll/᩵ܶ᩻;->hasUnpaddedSignatureSize()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1183
    invoke-virtual {p1}, Ll/᩵ܶ᩻;->getUnpaddedSignatureSize()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/ᩴܶ᩻;->setUnpaddedSignatureSize(I)Ll/ᩴܶ᩻;

    .line 1185
    :cond_3
    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩶ۘۖ;->mergeUnknownFields(Ll/ۢ֨ۖ;)Ll/᩶ۘۖ;

    .line 1186
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public mergeFrom(Ll/᩻֡ۖ;)Ll/ᩴܶ᩻;
    .locals 1

    .line 1166
    instance-of v0, p1, Ll/᩵ܶ᩻;

    if-eqz v0, :cond_0

    .line 1167
    check-cast p1, Ll/᩵ܶ᩻;

    invoke-virtual {p0, p1}, Ll/ᩴܶ᩻;->mergeFrom(Ll/᩵ܶ᩻;)Ll/ᩴܶ᩻;

    move-result-object p1

    return-object p1

    .line 1169
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 1081
    invoke-virtual {p0, p1, p2}, Ll/ᩴܶ᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ᩴܶ᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 1081
    invoke-virtual {p0, p1}, Ll/ᩴܶ᩻;->mergeFrom(Ll/᩻֡ۖ;)Ll/ᩴܶ᩻;

    move-result-object p1

    return-object p1
.end method

.method public setData(Ll/ۛۜۖ;)Ll/ᩴܶ᩻;
    .locals 0

    .line 1314
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1315
    iput-object p1, p0, Ll/ᩴܶ᩻;->data_:Ll/ۛۜۖ;

    .line 1316
    iget p1, p0, Ll/ᩴܶ᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Ll/ᩴܶ᩻;->bitField0_:I

    .line 1317
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setUnpaddedSignatureSize(I)Ll/ᩴܶ᩻;
    .locals 0

    .line 1385
    iput p1, p0, Ll/ᩴܶ᩻;->unpaddedSignatureSize_:I

    .line 1386
    iget p1, p0, Ll/ᩴܶ᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Ll/ᩴܶ᩻;->bitField0_:I

    .line 1387
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setVersion(I)Ll/ᩴܶ᩻;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1273
    iput p1, p0, Ll/ᩴܶ᩻;->version_:I

    .line 1274
    iget p1, p0, Ll/ᩴܶ᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ᩴܶ᩻;->bitField0_:I

    .line 1275
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method
