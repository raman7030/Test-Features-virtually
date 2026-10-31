.class public final Ll/᩵ܺۖ;
.super Ll/ۗۘۖ;
.source "T9Q9"


# instance fields
.field public ۗ:Ll/ܳۚۖ;

.field public ۙ:Ll/ۛۢۖ;

.field public ۬:Ljava/util/List;

.field public ᩶:Ll/ܺۚۖ;

.field public ᩹:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 31233
    invoke-direct {p0}, Ll/ۗۘۖ;-><init>()V

    .line 31561
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/᩵ܺۖ;->۬:Ljava/util/List;

    .line 31243
    sget-boolean v0, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    if-eqz v0, :cond_0

    .line 31245
    invoke-direct {p0}, Ll/᩵ܺۖ;->ᩳ()Ll/ܺۚۖ;

    .line 31246
    invoke-direct {p0}, Ll/᩵ܺۖ;->ܿ()Ll/ܳۚۖ;

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 31214
    invoke-direct {p0}, Ll/᩵ܺۖ;-><init>()V

    return-void
.end method

.method public constructor <init>(Ll/ۢۜۖ;I)V
    .locals 0

    .line 1223
    invoke-direct {p0, p1}, Ll/᩶ۘۖ;-><init>(Ll/ۢۜۖ;)V

    .line 31561
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Ll/᩵ܺۖ;->۬:Ljava/util/List;

    .line 31243
    sget-boolean p1, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    if-eqz p1, :cond_0

    .line 31245
    invoke-direct {p0}, Ll/᩵ܺۖ;->ᩳ()Ll/ܺۚۖ;

    .line 31246
    invoke-direct {p0}, Ll/᩵ܺۖ;->ܿ()Ll/ܳۚۖ;

    :cond_0
    return-void
.end method

.method private ܿ()Ll/ܳۚۖ;
    .locals 5

    .line 31788
    iget-object v0, p0, Ll/᩵ܺۖ;->ۗ:Ll/ܳۚۖ;

    if-nez v0, :cond_1

    .line 31789
    new-instance v0, Ll/ܳۚۖ;

    iget-object v1, p0, Ll/᩵ܺۖ;->۬:Ljava/util/List;

    iget v2, p0, Ll/᩵ܺۖ;->᩹:I

    and-int/lit8 v2, v2, 0x2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 31793
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v3

    .line 31794
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Ll/ܳۚۖ;-><init>(Ljava/util/List;ZLl/ۢۜۖ;Z)V

    iput-object v0, p0, Ll/᩵ܺۖ;->ۗ:Ll/ܳۚۖ;

    const/4 v0, 0x0

    .line 31795
    iput-object v0, p0, Ll/᩵ܺۖ;->۬:Ljava/util/List;

    .line 31797
    :cond_1
    iget-object v0, p0, Ll/᩵ܺۖ;->ۗ:Ll/ܳۚۖ;

    return-object v0
.end method

.method private ᩳ()Ll/ܺۚۖ;
    .locals 4

    .line 31549
    iget-object v0, p0, Ll/᩵ܺۖ;->᩶:Ll/ܺۚۖ;

    if-nez v0, :cond_2

    .line 31550
    new-instance v1, Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 31455
    iget-object v0, p0, Ll/᩵ܺۖ;->ۙ:Ll/ۛۢۖ;

    if-nez v0, :cond_1

    invoke-static {}, Ll/ۛۢۖ;->getDefaultInstance()Ll/ۛۢۖ;

    move-result-object v0

    goto :goto_0

    .line 31457
    :cond_0
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܿ()Ll/ۘᩴۖ;

    move-result-object v0

    check-cast v0, Ll/ۛۢۖ;

    .line 31553
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v2

    .line 31554
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v3

    invoke-direct {v1, v0, v2, v3}, Ll/ܺۚۖ;-><init>(Ll/ۘᩴۖ;Ll/ۢۜۖ;Z)V

    iput-object v1, p0, Ll/᩵ܺۖ;->᩶:Ll/ܺۚۖ;

    const/4 v0, 0x0

    .line 31555
    iput-object v0, p0, Ll/᩵ܺۖ;->ۙ:Ll/ۛۢۖ;

    .line 31557
    :cond_2
    iget-object v0, p0, Ll/᩵ܺۖ;->᩶:Ll/ܺۚۖ;

    return-object v0
.end method


# virtual methods
.method public final build()Ll/ۡ֡ۖ;
    .locals 2

    .line 31281
    invoke-virtual {p0}, Ll/᩵ܺۖ;->buildPartial()Ll/֡ܺۖ;

    move-result-object v0

    .line 31282
    invoke-virtual {v0}, Ll/֡ܺۖ;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 31283
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public final build()Ll/᩻֡ۖ;
    .locals 2

    .line 31281
    invoke-virtual {p0}, Ll/᩵ܺۖ;->buildPartial()Ll/֡ܺۖ;

    move-result-object v0

    .line 31282
    invoke-virtual {v0}, Ll/֡ܺۖ;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 31283
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public final buildPartial()Ll/֡ܺۖ;
    .locals 3

    .line 31290
    new-instance v0, Ll/֡ܺۖ;

    invoke-direct {v0, p0}, Ll/֡ܺۖ;-><init>(Ll/᩵ܺۖ;)V

    .line 31298
    iget-object v1, p0, Ll/᩵ܺۖ;->ۗ:Ll/ܳۚۖ;

    if-nez v1, :cond_1

    .line 31299
    iget v1, p0, Ll/᩵ܺۖ;->᩹:I

    and-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_0

    .line 31300
    iget-object v1, p0, Ll/᩵ܺۖ;->۬:Ljava/util/List;

    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Ll/᩵ܺۖ;->۬:Ljava/util/List;

    .line 31301
    iget v1, p0, Ll/᩵ܺۖ;->᩹:I

    and-int/lit8 v1, v1, -0x3

    iput v1, p0, Ll/᩵ܺۖ;->᩹:I

    .line 31303
    :cond_0
    iget-object v1, p0, Ll/᩵ܺۖ;->۬:Ljava/util/List;

    invoke-static {v0, v1}, Ll/֡ܺۖ;->֫(Ll/֡ܺۖ;Ljava/util/List;)V

    goto :goto_0

    .line 31305
    :cond_1
    invoke-virtual {v1}, Ll/ܳۚۖ;->ۧ()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Ll/֡ܺۖ;->֫(Ll/֡ܺۖ;Ljava/util/List;)V

    .line 31292
    :goto_0
    iget v1, p0, Ll/᩵ܺۖ;->᩹:I

    if-eqz v1, :cond_4

    const/4 v2, 0x1

    and-int/2addr v1, v2

    if-eqz v1, :cond_3

    .line 31313
    iget-object v1, p0, Ll/᩵ܺۖ;->᩶:Ll/ܺۚۖ;

    if-nez v1, :cond_2

    .line 31314
    iget-object v1, p0, Ll/᩵ܺۖ;->ۙ:Ll/ۛۢۖ;

    goto :goto_1

    .line 31315
    :cond_2
    invoke-virtual {v1}, Ll/ܺۚۖ;->ۧ()Ll/ۘᩴۖ;

    move-result-object v1

    check-cast v1, Ll/ۛۢۖ;

    .line 31313
    :goto_1
    invoke-static {v0, v1}, Ll/֡ܺۖ;->֫(Ll/֡ܺۖ;Ll/ۛۢۖ;)V

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    .line 31318
    :goto_2
    invoke-static {v0, v2}, Ll/֡ܺۖ;->֫(Ll/֡ܺۖ;I)V

    .line 31293
    :cond_4
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onBuilt()V

    return-object v0
.end method

.method public final bridge synthetic buildPartial()Ll/ۡ֡ۖ;
    .locals 1

    .line 31214
    invoke-virtual {p0}, Ll/᩵ܺۖ;->buildPartial()Ll/֡ܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic buildPartial()Ll/᩻֡ۖ;
    .locals 1

    .line 31214
    invoke-virtual {p0}, Ll/᩵ܺۖ;->buildPartial()Ll/֡ܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic clear()Ll/ۗۘۖ;
    .locals 0

    .line 31214
    invoke-virtual {p0}, Ll/᩵ܺۖ;->ܽ()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/ۢ֡ۖ;
    .locals 0

    .line 31214
    invoke-virtual {p0}, Ll/᩵ܺۖ;->ܽ()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/ܳ֡ۖ;
    .locals 0

    .line 31214
    invoke-virtual {p0}, Ll/᩵ܺۖ;->ܽ()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/᩶ۘۖ;
    .locals 0

    .line 31214
    invoke-virtual {p0}, Ll/᩵ܺۖ;->ܽ()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/᩷ۜۖ;
    .locals 0

    .line 31214
    invoke-virtual {p0}, Ll/᩵ܺۖ;->ܽ()V

    return-object p0
.end method

.method public final getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 31276
    invoke-static {}, Ll/֡ܺۖ;->getDefaultInstance()Ll/֡ܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public final getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 31276
    invoke-static {}, Ll/֡ܺۖ;->getDefaultInstance()Ll/֡ܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public final getDescriptorForType()Ll/ᩳۖۖ;
    .locals 1

    .line 31271
    invoke-static {}, Ll/ۧۖۖ;->ܶ()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public final internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 31227
    invoke-static {}, Ll/ۧۖۖ;->᩸()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/֡ܺۖ;

    const-class v2, Ll/᩵ܺۖ;

    .line 31228
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 4

    .line 31447
    iget v0, p0, Ll/᩵ܺۖ;->᩹:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    .line 31454
    iget-object v0, p0, Ll/᩵ܺۖ;->᩶:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 31455
    iget-object v0, p0, Ll/᩵ܺۖ;->ۙ:Ll/ۛۢۖ;

    if-nez v0, :cond_1

    invoke-static {}, Ll/ۛۢۖ;->getDefaultInstance()Ll/ۛۢۖ;

    move-result-object v0

    goto :goto_0

    .line 31457
    :cond_0
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܿ()Ll/ۘᩴۖ;

    move-result-object v0

    check-cast v0, Ll/ۛۢۖ;

    .line 31371
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ll/ۛۢۖ;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_4

    :cond_2
    const/4 v0, 0x0

    .line 31586
    :goto_1
    iget-object v3, p0, Ll/᩵ܺۖ;->ۗ:Ll/ܳۚۖ;

    if-nez v3, :cond_3

    .line 31587
    iget-object v3, p0, Ll/᩵ܺۖ;->۬:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    goto :goto_2

    .line 31589
    :cond_3
    invoke-virtual {v3}, Ll/ܳۚۖ;->ܳ()I

    move-result v3

    :goto_2
    if-ge v0, v3, :cond_6

    .line 31596
    iget-object v3, p0, Ll/᩵ܺۖ;->ۗ:Ll/ܳۚۖ;

    if-nez v3, :cond_4

    .line 31597
    iget-object v3, p0, Ll/᩵ܺۖ;->۬:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֫ۖۖ;

    goto :goto_3

    .line 31599
    :cond_4
    invoke-virtual {v3, v0}, Ll/ܳۚۖ;->ۧ(I)Ll/ۘᩴۖ;

    move-result-object v3

    check-cast v3, Ll/֫ۖۖ;

    .line 31376
    :goto_3
    invoke-virtual {v3}, Ll/֫ۖۖ;->isInitialized()Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_4

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 31380
    :cond_6
    invoke-virtual {p0}, Ll/ۗۘۖ;->֫()Z

    move-result v0

    if-nez v0, :cond_7

    :goto_4
    return v2

    :cond_7
    return v1
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۖۜۖ;
    .locals 0

    .line 31214
    invoke-virtual {p0, p1, p2}, Ll/᩵ܺۖ;->֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;)V

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 31214
    invoke-virtual {p0, p1, p2}, Ll/᩵ܺۖ;->֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;)V

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 31214
    invoke-virtual {p0, p1, p2}, Ll/᩵ܺۖ;->֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;)V

    return-object p0
.end method

.method public final mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;
    .locals 1

    .line 31323
    instance-of v0, p1, Ll/֡ܺۖ;

    if-eqz v0, :cond_0

    .line 31324
    check-cast p1, Ll/֡ܺۖ;

    invoke-virtual {p0, p1}, Ll/᩵ܺۖ;->֫(Ll/֡ܺۖ;)V

    return-object p0

    .line 31326
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 31214
    invoke-virtual {p0, p1, p2}, Ll/᩵ܺۖ;->֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;)V

    return-object p0
.end method

.method public final mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;
    .locals 1

    .line 31323
    instance-of v0, p1, Ll/֡ܺۖ;

    if-eqz v0, :cond_0

    .line 31324
    check-cast p1, Ll/֡ܺۖ;

    invoke-virtual {p0, p1}, Ll/᩵ܺۖ;->֫(Ll/֡ܺۖ;)V

    return-object p0

    .line 31326
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public final ֫(Ll/֡ܺۖ;)V
    .locals 3

    .line 31332
    invoke-static {}, Ll/֡ܺۖ;->getDefaultInstance()Ll/֡ܺۖ;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-void

    .line 31333
    :cond_0
    invoke-virtual {p1}, Ll/֡ܺۖ;->ܺ()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 31334
    invoke-virtual {p1}, Ll/֡ܺۖ;->ۡ()Ll/ۛۢۖ;

    move-result-object v0

    .line 31494
    iget-object v1, p0, Ll/᩵ܺۖ;->᩶:Ll/ܺۚۖ;

    if-nez v1, :cond_2

    .line 31495
    iget v1, p0, Ll/᩵ܺۖ;->᩹:I

    and-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/᩵ܺۖ;->ۙ:Ll/ۛۢۖ;

    if-eqz v1, :cond_1

    .line 31497
    invoke-static {}, Ll/ۛۢۖ;->getDefaultInstance()Ll/ۛۢۖ;

    move-result-object v2

    if-eq v1, v2, :cond_1

    .line 31528
    iget v1, p0, Ll/᩵ܺۖ;->᩹:I

    or-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/᩵ܺۖ;->᩹:I

    .line 31529
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 31530
    invoke-direct {p0}, Ll/᩵ܺۖ;->ᩳ()Ll/ܺۚۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v1

    check-cast v1, Ll/֡ۢۖ;

    .line 31498
    invoke-virtual {v1, v0}, Ll/֡ۢۖ;->֫(Ll/ۛۢۖ;)Ll/֡ۢۖ;

    goto :goto_0

    .line 31500
    :cond_1
    iput-object v0, p0, Ll/᩵ܺۖ;->ۙ:Ll/ۛۢۖ;

    goto :goto_0

    .line 31503
    :cond_2
    invoke-virtual {v1, v0}, Ll/ܺۚۖ;->֫(Ll/ۘᩴۖ;)V

    .line 31505
    :goto_0
    iget-object v0, p0, Ll/᩵ܺۖ;->ۙ:Ll/ۛۢۖ;

    if-eqz v0, :cond_3

    .line 31506
    iget v0, p0, Ll/᩵ܺۖ;->᩹:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/᩵ܺۖ;->᩹:I

    .line 31507
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 31336
    :cond_3
    iget-object v0, p0, Ll/᩵ܺۖ;->ۗ:Ll/ܳۚۖ;

    if-nez v0, :cond_6

    .line 31337
    invoke-static {p1}, Ll/֡ܺۖ;->֫(Ll/֡ܺۖ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9

    .line 31338
    iget-object v0, p0, Ll/᩵ܺۖ;->۬:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 31339
    invoke-static {p1}, Ll/֡ܺۖ;->֫(Ll/֡ܺۖ;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/᩵ܺۖ;->۬:Ljava/util/List;

    .line 31340
    iget v0, p0, Ll/᩵ܺۖ;->᩹:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Ll/᩵ܺۖ;->᩹:I

    goto :goto_1

    .line 31563
    :cond_4
    iget v0, p0, Ll/᩵ܺۖ;->᩹:I

    and-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_5

    .line 31564
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/᩵ܺۖ;->۬:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ll/᩵ܺۖ;->۬:Ljava/util/List;

    .line 31565
    iget v0, p0, Ll/᩵ܺۖ;->᩹:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Ll/᩵ܺۖ;->᩹:I

    .line 31343
    :cond_5
    iget-object v0, p0, Ll/᩵ܺۖ;->۬:Ljava/util/List;

    invoke-static {p1}, Ll/֡ܺۖ;->֫(Ll/֡ܺۖ;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 31345
    :goto_1
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    goto :goto_2

    .line 31348
    :cond_6
    invoke-static {p1}, Ll/֡ܺۖ;->֫(Ll/֡ܺۖ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9

    .line 31349
    iget-object v0, p0, Ll/᩵ܺۖ;->ۗ:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 31350
    iget-object v0, p0, Ll/᩵ܺۖ;->ۗ:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->ᩳ()V

    const/4 v0, 0x0

    .line 31351
    iput-object v0, p0, Ll/᩵ܺۖ;->ۗ:Ll/ܳۚۖ;

    .line 31352
    invoke-static {p1}, Ll/֡ܺۖ;->֫(Ll/֡ܺۖ;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Ll/᩵ܺۖ;->۬:Ljava/util/List;

    .line 31353
    iget v1, p0, Ll/᩵ܺۖ;->᩹:I

    and-int/lit8 v1, v1, -0x3

    iput v1, p0, Ll/᩵ܺۖ;->᩹:I

    .line 31355
    sget-boolean v1, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    if-eqz v1, :cond_7

    .line 31356
    invoke-direct {p0}, Ll/᩵ܺۖ;->ܿ()Ll/ܳۚۖ;

    move-result-object v0

    :cond_7
    iput-object v0, p0, Ll/᩵ܺۖ;->ۗ:Ll/ܳۚۖ;

    goto :goto_2

    .line 31358
    :cond_8
    iget-object v0, p0, Ll/᩵ܺۖ;->ۗ:Ll/ܳۚۖ;

    invoke-static {p1}, Ll/֡ܺۖ;->֫(Ll/֡ܺۖ;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܳۚۖ;->֫(Ljava/lang/Iterable;)V

    .line 31362
    :cond_9
    :goto_2
    invoke-virtual {p0, p1}, Ll/ۗۘۖ;->֫(Ll/۫ۘۖ;)V

    .line 31363
    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩶ۘۖ;->mergeUnknownFields(Ll/ۢ֨ۖ;)Ll/᩶ۘۖ;

    .line 31364
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-void
.end method

.method public final ֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;)V
    .locals 4

    .line 31392
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :cond_0
    :goto_0
    if-nez v0, :cond_6

    .line 31397
    :try_start_0
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܶ()I

    move-result v1

    if-eqz v1, :cond_5

    const/16 v2, 0xa

    if-eq v1, v2, :cond_4

    const/16 v2, 0x1f3a

    if-eq v1, v2, :cond_1

    .line 31423
    invoke-virtual {p0, p1, p2, v1}, Ll/ۗۘۖ;->parseUnknownField(Ll/۟ۜۖ;Ll/ᩳۘۖ;I)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 31412
    :cond_1
    invoke-static {}, Ll/֫ۖۖ;->parser()Ll/۫֡ۖ;

    move-result-object v1

    .line 31411
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/۫֡ۖ;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object v1

    check-cast v1, Ll/֫ۖۖ;

    .line 31414
    iget-object v2, p0, Ll/᩵ܺۖ;->ۗ:Ll/ܳۚۖ;

    if-nez v2, :cond_3

    .line 31563
    iget v2, p0, Ll/᩵ܺۖ;->᩹:I

    and-int/lit8 v2, v2, 0x2

    if-nez v2, :cond_2

    .line 31564
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Ll/᩵ܺۖ;->۬:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, p0, Ll/᩵ܺۖ;->۬:Ljava/util/List;

    .line 31565
    iget v2, p0, Ll/᩵ܺۖ;->᩹:I

    or-int/lit8 v2, v2, 0x2

    iput v2, p0, Ll/᩵ܺۖ;->᩹:I

    .line 31416
    :cond_2
    iget-object v2, p0, Ll/᩵ܺۖ;->۬:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 31418
    :cond_3
    invoke-virtual {v2, v1}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    goto :goto_0

    .line 31404
    :cond_4
    invoke-direct {p0}, Ll/᩵ܺۖ;->ᩳ()Ll/ܺۚۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v1

    .line 31403
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/ۢ֡ۖ;Ll/ᩳۘۖ;)V

    .line 31406
    iget v1, p0, Ll/᩵ܺۖ;->᩹:I

    or-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/᩵ܺۖ;->᩹:I
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

    .line 31431
    :try_start_1
    invoke-virtual {p1}, Ll/֫᩵ۖ;->֫()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31433
    :goto_2
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 31434
    throw p1

    .line 31433
    :cond_6
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-void
.end method

.method public final ܽ()V
    .locals 2

    .line 31251
    invoke-super {p0}, Ll/ۗۘۖ;->clear()Ll/ۗۘۖ;

    const/4 v0, 0x0

    .line 31252
    iput v0, p0, Ll/᩵ܺۖ;->᩹:I

    const/4 v0, 0x0

    .line 31253
    iput-object v0, p0, Ll/᩵ܺۖ;->ۙ:Ll/ۛۢۖ;

    .line 31254
    iget-object v1, p0, Ll/᩵ܺۖ;->᩶:Ll/ܺۚۖ;

    if-eqz v1, :cond_0

    .line 31255
    invoke-virtual {v1}, Ll/ܺۚۖ;->ܽ()V

    .line 31256
    iput-object v0, p0, Ll/᩵ܺۖ;->᩶:Ll/ܺۚۖ;

    .line 31258
    :cond_0
    iget-object v1, p0, Ll/᩵ܺۖ;->ۗ:Ll/ܳۚۖ;

    if-nez v1, :cond_1

    .line 31259
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/᩵ܺۖ;->۬:Ljava/util/List;

    goto :goto_0

    .line 31261
    :cond_1
    iput-object v0, p0, Ll/᩵ܺۖ;->۬:Ljava/util/List;

    .line 31262
    invoke-virtual {v1}, Ll/ܳۚۖ;->ܽ()V

    .line 31264
    :goto_0
    iget v0, p0, Ll/᩵ܺۖ;->᩹:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Ll/᩵ܺۖ;->᩹:I

    return-void
.end method
