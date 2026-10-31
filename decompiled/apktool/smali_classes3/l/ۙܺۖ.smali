.class public final Ll/ۙܺۖ;
.super Ll/᩶ۘۖ;
.source "T9Q9"

# interfaces
.implements Ll/ۘ֡ۖ;


# instance fields
.field public ᩶:Ljava/util/List;

.field public ᩸:I

.field public ᩹:Ll/ܳۚۖ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 44301
    invoke-direct {p0}, Ll/᩶ۘۖ;-><init>()V

    .line 44464
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ۙܺۖ;->᩶:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 44283
    invoke-direct {p0}, Ll/ۙܺۖ;-><init>()V

    return-void
.end method

.method public constructor <init>(Ll/ۢۜۖ;I)V
    .locals 0

    .line 44307
    invoke-direct {p0, p1}, Ll/᩶ۘۖ;-><init>(Ll/ۢۜۖ;)V

    .line 44464
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Ll/ۙܺۖ;->᩶:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final build()Ll/ۡ֡ۖ;
    .locals 2

    .line 44337
    invoke-virtual {p0}, Ll/ۙܺۖ;->buildPartial()Ll/ۤܺۖ;

    move-result-object v0

    .line 44338
    invoke-virtual {v0}, Ll/ۤܺۖ;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 44339
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public final build()Ll/᩻֡ۖ;
    .locals 2

    .line 44337
    invoke-virtual {p0}, Ll/ۙܺۖ;->buildPartial()Ll/ۤܺۖ;

    move-result-object v0

    .line 44338
    invoke-virtual {v0}, Ll/ۤܺۖ;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 44339
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public final bridge synthetic buildPartial()Ll/ۡ֡ۖ;
    .locals 1

    .line 44283
    invoke-virtual {p0}, Ll/ۙܺۖ;->buildPartial()Ll/ۤܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public final buildPartial()Ll/ۤܺۖ;
    .locals 2

    .line 44346
    new-instance v0, Ll/ۤܺۖ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll/ۤܺۖ;-><init>(Ll/ۙܺۖ;I)V

    .line 44354
    iget-object v1, p0, Ll/ۙܺۖ;->᩹:Ll/ܳۚۖ;

    if-nez v1, :cond_1

    .line 44355
    iget v1, p0, Ll/ۙܺۖ;->᩸:I

    and-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_0

    .line 44356
    iget-object v1, p0, Ll/ۙܺۖ;->᩶:Ljava/util/List;

    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Ll/ۙܺۖ;->᩶:Ljava/util/List;

    .line 44357
    iget v1, p0, Ll/ۙܺۖ;->᩸:I

    and-int/lit8 v1, v1, -0x2

    iput v1, p0, Ll/ۙܺۖ;->᩸:I

    .line 44359
    :cond_0
    iget-object v1, p0, Ll/ۙܺۖ;->᩶:Ljava/util/List;

    invoke-static {v0, v1}, Ll/ۤܺۖ;->֫(Ll/ۤܺۖ;Ljava/util/List;)V

    goto :goto_0

    .line 44361
    :cond_1
    invoke-virtual {v1}, Ll/ܳۚۖ;->ۧ()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۤܺۖ;->֫(Ll/ۤܺۖ;Ljava/util/List;)V

    .line 44349
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onBuilt()V

    return-object v0
.end method

.method public final bridge synthetic buildPartial()Ll/᩻֡ۖ;
    .locals 1

    .line 44283
    invoke-virtual {p0}, Ll/ۙܺۖ;->buildPartial()Ll/ۤܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic clear()Ll/ۢ֡ۖ;
    .locals 0

    .line 44283
    invoke-virtual {p0}, Ll/ۙܺۖ;->֫()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/ܳ֡ۖ;
    .locals 0

    .line 44283
    invoke-virtual {p0}, Ll/ۙܺۖ;->֫()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/᩶ۘۖ;
    .locals 0

    .line 44283
    invoke-virtual {p0}, Ll/ۙܺۖ;->֫()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/᩷ۜۖ;
    .locals 0

    .line 44283
    invoke-virtual {p0}, Ll/ۙܺۖ;->֫()V

    return-object p0
.end method

.method public final getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 44332
    invoke-static {}, Ll/ۤܺۖ;->getDefaultInstance()Ll/ۤܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public final getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 44332
    invoke-static {}, Ll/ۤܺۖ;->getDefaultInstance()Ll/ۤܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public final getDescriptorForType()Ll/ᩳۖۖ;
    .locals 1

    .line 44327
    invoke-static {}, Ll/ۧۖۖ;->ۡ֫()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public final internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 44295
    invoke-static {}, Ll/ۧۖۖ;->ܺ֫()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/ۤܺۖ;

    const-class v2, Ll/ۙܺۖ;

    .line 44296
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

    .line 44283
    invoke-virtual {p0, p1, p2}, Ll/ۙܺۖ;->֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;)V

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 44283
    invoke-virtual {p0, p1, p2}, Ll/ۙܺۖ;->֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;)V

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 44283
    invoke-virtual {p0, p1, p2}, Ll/ۙܺۖ;->֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;)V

    return-object p0
.end method

.method public final mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;
    .locals 1

    .line 44371
    instance-of v0, p1, Ll/ۤܺۖ;

    if-eqz v0, :cond_0

    .line 44372
    check-cast p1, Ll/ۤܺۖ;

    invoke-virtual {p0, p1}, Ll/ۙܺۖ;->֫(Ll/ۤܺۖ;)V

    return-object p0

    .line 44374
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 44283
    invoke-virtual {p0, p1, p2}, Ll/ۙܺۖ;->֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;)V

    return-object p0
.end method

.method public final mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;
    .locals 1

    .line 44371
    instance-of v0, p1, Ll/ۤܺۖ;

    if-eqz v0, :cond_0

    .line 44372
    check-cast p1, Ll/ۤܺۖ;

    invoke-virtual {p0, p1}, Ll/ۙܺۖ;->֫(Ll/ۤܺۖ;)V

    return-object p0

    .line 44374
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public final ֫()V
    .locals 2

    .line 44312
    invoke-super {p0}, Ll/᩶ۘۖ;->clear()Ll/᩶ۘۖ;

    const/4 v0, 0x0

    .line 44313
    iput v0, p0, Ll/ۙܺۖ;->᩸:I

    .line 44314
    iget-object v0, p0, Ll/ۙܺۖ;->᩹:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 44315
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ۙܺۖ;->᩶:Ljava/util/List;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 44317
    iput-object v1, p0, Ll/ۙܺۖ;->᩶:Ljava/util/List;

    .line 44318
    invoke-virtual {v0}, Ll/ܳۚۖ;->ܽ()V

    .line 44320
    :goto_0
    iget v0, p0, Ll/ۙܺۖ;->᩸:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Ll/ۙܺۖ;->᩸:I

    return-void
.end method

.method public final ֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;)V
    .locals 4

    .line 44423
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :cond_0
    :goto_0
    if-nez v0, :cond_5

    .line 44428
    :try_start_0
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܶ()I

    move-result v1

    if-eqz v1, :cond_4

    const/16 v2, 0xa

    if-eq v1, v2, :cond_1

    .line 44447
    invoke-super {p0, p1, p2, v1}, Ll/᩶ۘۖ;->parseUnknownField(Ll/۟ۜۖ;Ll/ᩳۘۖ;I)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 44436
    :cond_1
    invoke-static {}, Ll/۫ܺۖ;->parser()Ll/۫֡ۖ;

    move-result-object v1

    .line 44435
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/۫֡ۖ;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object v1

    check-cast v1, Ll/۫ܺۖ;

    .line 44438
    iget-object v2, p0, Ll/ۙܺۖ;->᩹:Ll/ܳۚۖ;

    if-nez v2, :cond_3

    .line 44466
    iget v2, p0, Ll/ۙܺۖ;->᩸:I

    and-int/lit8 v2, v2, 0x1

    if-nez v2, :cond_2

    .line 44467
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Ll/ۙܺۖ;->᩶:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, p0, Ll/ۙܺۖ;->᩶:Ljava/util/List;

    .line 44468
    iget v2, p0, Ll/ۙܺۖ;->᩸:I

    or-int/lit8 v2, v2, 0x1

    iput v2, p0, Ll/ۙܺۖ;->᩸:I

    .line 44440
    :cond_2
    iget-object v2, p0, Ll/ۙܺۖ;->᩶:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 44442
    :cond_3
    invoke-virtual {v2, v1}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V
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

    .line 44455
    :try_start_1
    invoke-virtual {p1}, Ll/֫᩵ۖ;->֫()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44457
    :goto_2
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 44458
    throw p1

    .line 44457
    :cond_5
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-void
.end method

.method public final ֫(Ll/ۤܺۖ;)V
    .locals 6

    .line 44380
    invoke-static {}, Ll/ۤܺۖ;->getDefaultInstance()Ll/ۤܺۖ;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-void

    .line 44381
    :cond_0
    iget-object v0, p0, Ll/ۙܺۖ;->᩹:Ll/ܳۚۖ;

    if-nez v0, :cond_3

    .line 44382
    invoke-static {p1}, Ll/ۤܺۖ;->֫(Ll/ۤܺۖ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 44383
    iget-object v0, p0, Ll/ۙܺۖ;->᩶:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 44384
    invoke-static {p1}, Ll/ۤܺۖ;->֫(Ll/ۤܺۖ;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ۙܺۖ;->᩶:Ljava/util/List;

    .line 44385
    iget v0, p0, Ll/ۙܺۖ;->᩸:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Ll/ۙܺۖ;->᩸:I

    goto :goto_0

    .line 44466
    :cond_1
    iget v0, p0, Ll/ۙܺۖ;->᩸:I

    and-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_2

    .line 44467
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ۙܺۖ;->᩶:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ll/ۙܺۖ;->᩶:Ljava/util/List;

    .line 44468
    iget v0, p0, Ll/ۙܺۖ;->᩸:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۙܺۖ;->᩸:I

    .line 44388
    :cond_2
    iget-object v0, p0, Ll/ۙܺۖ;->᩶:Ljava/util/List;

    invoke-static {p1}, Ll/ۤܺۖ;->֫(Ll/ۤܺۖ;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 44390
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    goto :goto_1

    .line 44393
    :cond_3
    invoke-static {p1}, Ll/ۤܺۖ;->֫(Ll/ۤܺۖ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 44394
    iget-object v0, p0, Ll/ۙܺۖ;->᩹:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 44395
    iget-object v0, p0, Ll/ۙܺۖ;->᩹:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->ᩳ()V

    const/4 v0, 0x0

    .line 44396
    iput-object v0, p0, Ll/ۙܺۖ;->᩹:Ll/ܳۚۖ;

    .line 44397
    invoke-static {p1}, Ll/ۤܺۖ;->֫(Ll/ۤܺۖ;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Ll/ۙܺۖ;->᩶:Ljava/util/List;

    .line 44398
    iget v2, p0, Ll/ۙܺۖ;->᩸:I

    and-int/lit8 v2, v2, -0x2

    iput v2, p0, Ll/ۙܺۖ;->᩸:I

    .line 44400
    sget-boolean v2, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    if-eqz v2, :cond_5

    .line 44691
    iget-object v2, p0, Ll/ۙܺۖ;->᩹:Ll/ܳۚۖ;

    if-nez v2, :cond_4

    .line 44692
    new-instance v2, Ll/ܳۚۖ;

    .line 44696
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v3

    .line 44697
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v4

    const/4 v5, 0x0

    invoke-direct {v2, v1, v5, v3, v4}, Ll/ܳۚۖ;-><init>(Ljava/util/List;ZLl/ۢۜۖ;Z)V

    iput-object v2, p0, Ll/ۙܺۖ;->᩹:Ll/ܳۚۖ;

    .line 44698
    iput-object v0, p0, Ll/ۙܺۖ;->᩶:Ljava/util/List;

    .line 44700
    :cond_4
    iget-object v0, p0, Ll/ۙܺۖ;->᩹:Ll/ܳۚۖ;

    .line 44401
    :cond_5
    iput-object v0, p0, Ll/ۙܺۖ;->᩹:Ll/ܳۚۖ;

    goto :goto_1

    .line 44403
    :cond_6
    iget-object v0, p0, Ll/ۙܺۖ;->᩹:Ll/ܳۚۖ;

    invoke-static {p1}, Ll/ۤܺۖ;->֫(Ll/ۤܺۖ;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܳۚۖ;->֫(Ljava/lang/Iterable;)V

    .line 44407
    :cond_7
    :goto_1
    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩶ۘۖ;->mergeUnknownFields(Ll/ۢ֨ۖ;)Ll/᩶ۘۖ;

    .line 44408
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-void
.end method
