.class public final Ll/֨᩷ۖ;
.super Ll/᩶ۘۖ;
.source "T9Q9"

# interfaces
.implements Ll/ۘ֡ۖ;


# instance fields
.field public ۗ:I

.field public ۙ:Ll/ᩴۢۖ;

.field public ᩶:Ll/ܺۚۖ;

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 5156
    invoke-direct {p0}, Ll/᩶ۘۖ;-><init>()V

    .line 5166
    sget-boolean v0, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    if-eqz v0, :cond_0

    .line 5168
    invoke-direct {p0}, Ll/֨᩷ۖ;->ܽ()Ll/ܺۚۖ;

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 5138
    invoke-direct {p0}, Ll/֨᩷ۖ;-><init>()V

    return-void
.end method

.method public constructor <init>(Ll/ۢۜۖ;I)V
    .locals 0

    .line 5162
    invoke-direct {p0, p1}, Ll/᩶ۘۖ;-><init>(Ll/ۢۜۖ;)V

    .line 5166
    sget-boolean p1, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    if-eqz p1, :cond_0

    .line 5168
    invoke-direct {p0}, Ll/֨᩷ۖ;->ܽ()Ll/ܺۚۖ;

    :cond_0
    return-void
.end method

.method private ܽ()Ll/ܺۚۖ;
    .locals 4

    .line 5509
    iget-object v0, p0, Ll/֨᩷ۖ;->᩶:Ll/ܺۚۖ;

    if-nez v0, :cond_2

    .line 5510
    new-instance v1, Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 5415
    iget-object v0, p0, Ll/֨᩷ۖ;->ۙ:Ll/ᩴۢۖ;

    if-nez v0, :cond_1

    invoke-static {}, Ll/ᩴۢۖ;->getDefaultInstance()Ll/ᩴۢۖ;

    move-result-object v0

    goto :goto_0

    .line 5417
    :cond_0
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܿ()Ll/ۘᩴۖ;

    move-result-object v0

    check-cast v0, Ll/ᩴۢۖ;

    .line 5513
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v2

    .line 5514
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v3

    invoke-direct {v1, v0, v2, v3}, Ll/ܺۚۖ;-><init>(Ll/ۘᩴۖ;Ll/ۢۜۖ;Z)V

    iput-object v1, p0, Ll/֨᩷ۖ;->᩶:Ll/ܺۚۖ;

    const/4 v0, 0x0

    .line 5515
    iput-object v0, p0, Ll/֨᩷ۖ;->ۙ:Ll/ᩴۢۖ;

    .line 5517
    :cond_2
    iget-object v0, p0, Ll/֨᩷ۖ;->᩶:Ll/ܺۚۖ;

    return-object v0
.end method


# virtual methods
.method public final build()Ll/ۡ֡ۖ;
    .locals 2

    .line 5198
    invoke-virtual {p0}, Ll/֨᩷ۖ;->buildPartial()Ll/۠᩷ۖ;

    move-result-object v0

    .line 5199
    invoke-virtual {v0}, Ll/۠᩷ۖ;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 5200
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public final build()Ll/᩻֡ۖ;
    .locals 2

    .line 5198
    invoke-virtual {p0}, Ll/֨᩷ۖ;->buildPartial()Ll/۠᩷ۖ;

    move-result-object v0

    .line 5199
    invoke-virtual {v0}, Ll/۠᩷ۖ;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 5200
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public final buildPartial()Ll/۠᩷ۖ;
    .locals 4

    .line 5207
    new-instance v0, Ll/۠᩷ۖ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll/۠᩷ۖ;-><init>(Ll/֨᩷ۖ;I)V

    .line 5208
    iget v2, p0, Ll/֨᩷ۖ;->᩸:I

    if-eqz v2, :cond_4

    and-int/lit8 v3, v2, 0x1

    if-eqz v3, :cond_0

    .line 5217
    iget v1, p0, Ll/֨᩷ۖ;->ۗ:I

    invoke-static {v0, v1}, Ll/۠᩷ۖ;->֫(Ll/۠᩷ۖ;I)V

    const/4 v1, 0x1

    :cond_0
    and-int/lit8 v3, v2, 0x2

    if-eqz v3, :cond_1

    .line 5221
    iget v3, p0, Ll/֨᩷ۖ;->᩹:I

    invoke-static {v0, v3}, Ll/۠᩷ۖ;->ۧ(Ll/۠᩷ۖ;I)V

    or-int/lit8 v1, v1, 0x2

    :cond_1
    and-int/lit8 v2, v2, 0x4

    if-eqz v2, :cond_3

    .line 5225
    iget-object v2, p0, Ll/֨᩷ۖ;->᩶:Ll/ܺۚۖ;

    if-nez v2, :cond_2

    .line 5226
    iget-object v2, p0, Ll/֨᩷ۖ;->ۙ:Ll/ᩴۢۖ;

    goto :goto_0

    .line 5227
    :cond_2
    invoke-virtual {v2}, Ll/ܺۚۖ;->ۧ()Ll/ۘᩴۖ;

    move-result-object v2

    check-cast v2, Ll/ᩴۢۖ;

    .line 5225
    :goto_0
    invoke-static {v0, v2}, Ll/۠᩷ۖ;->֫(Ll/۠᩷ۖ;Ll/ᩴۢۖ;)V

    or-int/lit8 v1, v1, 0x4

    .line 5230
    :cond_3
    invoke-static {v0, v1}, Ll/۠᩷ۖ;->ܽ(Ll/۠᩷ۖ;I)V

    .line 5209
    :cond_4
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onBuilt()V

    return-object v0
.end method

.method public final bridge synthetic buildPartial()Ll/ۡ֡ۖ;
    .locals 1

    .line 5138
    invoke-virtual {p0}, Ll/֨᩷ۖ;->buildPartial()Ll/۠᩷ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic buildPartial()Ll/᩻֡ۖ;
    .locals 1

    .line 5138
    invoke-virtual {p0}, Ll/֨᩷ۖ;->buildPartial()Ll/۠᩷ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic clear()Ll/ۢ֡ۖ;
    .locals 0

    .line 5138
    invoke-virtual {p0}, Ll/֨᩷ۖ;->֫()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/ܳ֡ۖ;
    .locals 0

    .line 5138
    invoke-virtual {p0}, Ll/֨᩷ۖ;->֫()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/᩶ۘۖ;
    .locals 0

    .line 5138
    invoke-virtual {p0}, Ll/֨᩷ۖ;->֫()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/᩷ۜۖ;
    .locals 0

    .line 5138
    invoke-virtual {p0}, Ll/֨᩷ۖ;->֫()V

    return-object p0
.end method

.method public final getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 5193
    invoke-static {}, Ll/۠᩷ۖ;->getDefaultInstance()Ll/۠᩷ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 5193
    invoke-static {}, Ll/۠᩷ۖ;->getDefaultInstance()Ll/۠᩷ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final getDescriptorForType()Ll/ᩳۖۖ;
    .locals 1

    .line 5188
    invoke-static {}, Ll/ۧۖۖ;->ۨ()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public final internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 5150
    invoke-static {}, Ll/ۧۖۖ;->۟()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/۠᩷ۖ;

    const-class v2, Ll/֨᩷ۖ;

    .line 5151
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 5407
    iget v0, p0, Ll/֨᩷ۖ;->᩸:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_2

    .line 5414
    iget-object v0, p0, Ll/֨᩷ۖ;->᩶:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 5415
    iget-object v0, p0, Ll/֨᩷ۖ;->ۙ:Ll/ᩴۢۖ;

    if-nez v0, :cond_1

    invoke-static {}, Ll/ᩴۢۖ;->getDefaultInstance()Ll/ᩴۢۖ;

    move-result-object v0

    goto :goto_0

    .line 5417
    :cond_0
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܿ()Ll/ۘᩴۖ;

    move-result-object v0

    check-cast v0, Ll/ᩴۢۖ;

    .line 5262
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ll/ᩴۢۖ;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x0

    return v0

    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public final mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/֨᩷ۖ;
    .locals 3

    .line 5275
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :cond_0
    :goto_0
    if-nez v0, :cond_5

    .line 5280
    :try_start_0
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܶ()I

    move-result v1

    if-eqz v1, :cond_4

    const/16 v2, 0x8

    if-eq v1, v2, :cond_3

    const/16 v2, 0x10

    if-eq v1, v2, :cond_2

    const/16 v2, 0x1a

    if-eq v1, v2, :cond_1

    .line 5303
    invoke-super {p0, p1, p2, v1}, Ll/᩶ۘۖ;->parseUnknownField(Ll/۟ۜۖ;Ll/ᩳۘۖ;I)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 5297
    :cond_1
    invoke-direct {p0}, Ll/֨᩷ۖ;->ܽ()Ll/ܺۚۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v1

    .line 5296
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/ۢ֡ۖ;Ll/ᩳۘۖ;)V

    .line 5299
    iget v1, p0, Ll/֨᩷ۖ;->᩸:I

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Ll/֨᩷ۖ;->᩸:I

    goto :goto_0

    .line 5291
    :cond_2
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܺ()I

    move-result v1

    iput v1, p0, Ll/֨᩷ۖ;->᩹:I

    .line 5292
    iget v1, p0, Ll/֨᩷ۖ;->᩸:I

    or-int/lit8 v1, v1, 0x2

    iput v1, p0, Ll/֨᩷ۖ;->᩸:I

    goto :goto_0

    .line 5286
    :cond_3
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܺ()I

    move-result v1

    iput v1, p0, Ll/֨᩷ۖ;->ۗ:I

    .line 5287
    iget v1, p0, Ll/֨᩷ۖ;->᩸:I

    or-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/֨᩷ۖ;->᩸:I
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

    .line 5311
    :try_start_1
    invoke-virtual {p1}, Ll/֫᩵ۖ;->֫()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 5313
    :goto_2
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 5314
    throw p1

    .line 5313
    :cond_5
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۖۜۖ;
    .locals 0

    .line 5138
    invoke-virtual {p0, p1, p2}, Ll/֨᩷ۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/֨᩷ۖ;

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 5138
    invoke-virtual {p0, p1, p2}, Ll/֨᩷ۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/֨᩷ۖ;

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 5138
    invoke-virtual {p0, p1, p2}, Ll/֨᩷ۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/֨᩷ۖ;

    return-object p0
.end method

.method public final mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;
    .locals 1

    .line 5235
    instance-of v0, p1, Ll/۠᩷ۖ;

    if-eqz v0, :cond_0

    .line 5236
    check-cast p1, Ll/۠᩷ۖ;

    invoke-virtual {p0, p1}, Ll/֨᩷ۖ;->֫(Ll/۠᩷ۖ;)Ll/֨᩷ۖ;

    return-object p0

    .line 5238
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 5138
    invoke-virtual {p0, p1, p2}, Ll/֨᩷ۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/֨᩷ۖ;

    return-object p0
.end method

.method public final mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;
    .locals 1

    .line 5235
    instance-of v0, p1, Ll/۠᩷ۖ;

    if-eqz v0, :cond_0

    .line 5236
    check-cast p1, Ll/۠᩷ۖ;

    invoke-virtual {p0, p1}, Ll/֨᩷ۖ;->֫(Ll/۠᩷ۖ;)Ll/֨᩷ۖ;

    return-object p0

    .line 5238
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public final ֫(Ll/۠᩷ۖ;)Ll/֨᩷ۖ;
    .locals 3

    .line 5244
    invoke-static {}, Ll/۠᩷ۖ;->getDefaultInstance()Ll/۠᩷ۖ;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 5245
    :cond_0
    invoke-virtual {p1}, Ll/۠᩷ۖ;->ۖ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5246
    invoke-virtual {p1}, Ll/۠᩷ۖ;->ۢ()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/֨᩷ۖ;->ܽ(I)V

    .line 5248
    :cond_1
    invoke-virtual {p1}, Ll/۠᩷ۖ;->ۡ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 5249
    invoke-virtual {p1}, Ll/۠᩷ۖ;->ۜ()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/֨᩷ۖ;->֫(I)V

    .line 5251
    :cond_2
    invoke-virtual {p1}, Ll/۠᩷ۖ;->ܺ()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 5252
    invoke-virtual {p1}, Ll/۠᩷ۖ;->᩷()Ll/ᩴۢۖ;

    move-result-object v0

    .line 5454
    iget-object v1, p0, Ll/֨᩷ۖ;->᩶:Ll/ܺۚۖ;

    if-nez v1, :cond_4

    .line 5455
    iget v1, p0, Ll/֨᩷ۖ;->᩸:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_3

    iget-object v1, p0, Ll/֨᩷ۖ;->ۙ:Ll/ᩴۢۖ;

    if-eqz v1, :cond_3

    .line 5457
    invoke-static {}, Ll/ᩴۢۖ;->getDefaultInstance()Ll/ᩴۢۖ;

    move-result-object v2

    if-eq v1, v2, :cond_3

    .line 5488
    iget v1, p0, Ll/֨᩷ۖ;->᩸:I

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Ll/֨᩷ۖ;->᩸:I

    .line 5489
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 5490
    invoke-direct {p0}, Ll/֨᩷ۖ;->ܽ()Ll/ܺۚۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v1

    check-cast v1, Ll/᩷ۢۖ;

    .line 5458
    invoke-virtual {v1, v0}, Ll/᩷ۢۖ;->֫(Ll/ᩴۢۖ;)V

    goto :goto_0

    .line 5460
    :cond_3
    iput-object v0, p0, Ll/֨᩷ۖ;->ۙ:Ll/ᩴۢۖ;

    goto :goto_0

    .line 5463
    :cond_4
    invoke-virtual {v1, v0}, Ll/ܺۚۖ;->֫(Ll/ۘᩴۖ;)V

    .line 5465
    :goto_0
    iget-object v0, p0, Ll/֨᩷ۖ;->ۙ:Ll/ᩴۢۖ;

    if-eqz v0, :cond_5

    .line 5466
    iget v0, p0, Ll/֨᩷ۖ;->᩸:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Ll/֨᩷ۖ;->᩸:I

    .line 5467
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 5254
    :cond_5
    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩶ۘۖ;->mergeUnknownFields(Ll/ۢ֨ۖ;)Ll/᩶ۘۖ;

    .line 5255
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public final ֫()V
    .locals 2

    .line 5173
    invoke-super {p0}, Ll/᩶ۘۖ;->clear()Ll/᩶ۘۖ;

    const/4 v0, 0x0

    .line 5174
    iput v0, p0, Ll/֨᩷ۖ;->᩸:I

    .line 5175
    iput v0, p0, Ll/֨᩷ۖ;->ۗ:I

    .line 5176
    iput v0, p0, Ll/֨᩷ۖ;->᩹:I

    const/4 v0, 0x0

    .line 5177
    iput-object v0, p0, Ll/֨᩷ۖ;->ۙ:Ll/ᩴۢۖ;

    .line 5178
    iget-object v1, p0, Ll/֨᩷ۖ;->᩶:Ll/ܺۚۖ;

    if-eqz v1, :cond_0

    .line 5179
    invoke-virtual {v1}, Ll/ܺۚۖ;->ܽ()V

    .line 5180
    iput-object v0, p0, Ll/֨᩷ۖ;->᩶:Ll/ܺۚۖ;

    :cond_0
    return-void
.end method

.method public final ֫(I)V
    .locals 0

    .line 5383
    iput p1, p0, Ll/֨᩷ۖ;->᩹:I

    .line 5384
    iget p1, p0, Ll/֨᩷ۖ;->᩸:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Ll/֨᩷ۖ;->᩸:I

    .line 5385
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-void
.end method

.method public final ܽ(I)V
    .locals 0

    .line 5343
    iput p1, p0, Ll/֨᩷ۖ;->ۗ:I

    .line 5344
    iget p1, p0, Ll/֨᩷ۖ;->᩸:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/֨᩷ۖ;->᩸:I

    .line 5345
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-void
.end method
