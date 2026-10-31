.class public final Ll/ۜܺۖ;
.super Ll/ۗۘۖ;
.source "T9Q9"


# instance fields
.field public ۗ:Ll/ۛۢۖ;

.field public ۙ:Ll/ܺۚۖ;

.field public ۤ:Ljava/util/List;

.field public ۫:Ll/ܳۚۖ;

.field public ۬:I

.field public ᩶:Z

.field public ᩹:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 36215
    invoke-direct {p0}, Ll/ۗۘۖ;-><init>()V

    const/4 v0, 0x0

    .line 36494
    iput v0, p0, Ll/ۜܺۖ;->۬:I

    .line 36658
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ۜܺۖ;->ۤ:Ljava/util/List;

    .line 36225
    sget-boolean v0, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    if-eqz v0, :cond_0

    .line 36227
    invoke-direct {p0}, Ll/ۜܺۖ;->ᩳ()Ll/ܺۚۖ;

    .line 36228
    invoke-direct {p0}, Ll/ۜܺۖ;->ܿ()Ll/ܳۚۖ;

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 36196
    invoke-direct {p0}, Ll/ۜܺۖ;-><init>()V

    return-void
.end method

.method public constructor <init>(Ll/ۢۜۖ;I)V
    .locals 0

    .line 1223
    invoke-direct {p0, p1}, Ll/᩶ۘۖ;-><init>(Ll/ۢۜۖ;)V

    const/4 p1, 0x0

    .line 36494
    iput p1, p0, Ll/ۜܺۖ;->۬:I

    .line 36658
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Ll/ۜܺۖ;->ۤ:Ljava/util/List;

    .line 36225
    sget-boolean p1, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    if-eqz p1, :cond_0

    .line 36227
    invoke-direct {p0}, Ll/ۜܺۖ;->ᩳ()Ll/ܺۚۖ;

    .line 36228
    invoke-direct {p0}, Ll/ۜܺۖ;->ܿ()Ll/ܳۚۖ;

    :cond_0
    return-void
.end method

.method private ܿ()Ll/ܳۚۖ;
    .locals 5

    .line 36885
    iget-object v0, p0, Ll/ۜܺۖ;->۫:Ll/ܳۚۖ;

    if-nez v0, :cond_1

    .line 36886
    new-instance v0, Ll/ܳۚۖ;

    iget-object v1, p0, Ll/ۜܺۖ;->ۤ:Ljava/util/List;

    iget v2, p0, Ll/ۜܺۖ;->᩹:I

    and-int/lit8 v2, v2, 0x8

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 36890
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v3

    .line 36891
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Ll/ܳۚۖ;-><init>(Ljava/util/List;ZLl/ۢۜۖ;Z)V

    iput-object v0, p0, Ll/ۜܺۖ;->۫:Ll/ܳۚۖ;

    const/4 v0, 0x0

    .line 36892
    iput-object v0, p0, Ll/ۜܺۖ;->ۤ:Ljava/util/List;

    .line 36894
    :cond_1
    iget-object v0, p0, Ll/ۜܺۖ;->۫:Ll/ܳۚۖ;

    return-object v0
.end method

.method private ᩳ()Ll/ܺۚۖ;
    .locals 4

    .line 36646
    iget-object v0, p0, Ll/ۜܺۖ;->ۙ:Ll/ܺۚۖ;

    if-nez v0, :cond_2

    .line 36647
    new-instance v1, Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 36552
    iget-object v0, p0, Ll/ۜܺۖ;->ۗ:Ll/ۛۢۖ;

    if-nez v0, :cond_1

    invoke-static {}, Ll/ۛۢۖ;->getDefaultInstance()Ll/ۛۢۖ;

    move-result-object v0

    goto :goto_0

    .line 36554
    :cond_0
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܿ()Ll/ۘᩴۖ;

    move-result-object v0

    check-cast v0, Ll/ۛۢۖ;

    .line 36650
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v2

    .line 36651
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v3

    invoke-direct {v1, v0, v2, v3}, Ll/ܺۚۖ;-><init>(Ll/ۘᩴۖ;Ll/ۢۜۖ;Z)V

    iput-object v1, p0, Ll/ۜܺۖ;->ۙ:Ll/ܺۚۖ;

    const/4 v0, 0x0

    .line 36652
    iput-object v0, p0, Ll/ۜܺۖ;->ۗ:Ll/ۛۢۖ;

    .line 36654
    :cond_2
    iget-object v0, p0, Ll/ۜܺۖ;->ۙ:Ll/ܺۚۖ;

    return-object v0
.end method


# virtual methods
.method public final build()Ll/ۡ֡ۖ;
    .locals 2

    .line 36265
    invoke-virtual {p0}, Ll/ۜܺۖ;->buildPartial()Ll/ۡܺۖ;

    move-result-object v0

    .line 36266
    invoke-virtual {v0}, Ll/ۡܺۖ;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 36267
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public final build()Ll/᩻֡ۖ;
    .locals 2

    .line 36265
    invoke-virtual {p0}, Ll/ۜܺۖ;->buildPartial()Ll/ۡܺۖ;

    move-result-object v0

    .line 36266
    invoke-virtual {v0}, Ll/ۡܺۖ;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 36267
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public final bridge synthetic buildPartial()Ll/ۡ֡ۖ;
    .locals 1

    .line 36196
    invoke-virtual {p0}, Ll/ۜܺۖ;->buildPartial()Ll/ۡܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public final buildPartial()Ll/ۡܺۖ;
    .locals 4

    .line 36274
    new-instance v0, Ll/ۡܺۖ;

    invoke-direct {v0, p0}, Ll/ۡܺۖ;-><init>(Ll/ۜܺۖ;)V

    .line 36282
    iget-object v1, p0, Ll/ۜܺۖ;->۫:Ll/ܳۚۖ;

    if-nez v1, :cond_1

    .line 36283
    iget v1, p0, Ll/ۜܺۖ;->᩹:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_0

    .line 36284
    iget-object v1, p0, Ll/ۜܺۖ;->ۤ:Ljava/util/List;

    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Ll/ۜܺۖ;->ۤ:Ljava/util/List;

    .line 36285
    iget v1, p0, Ll/ۜܺۖ;->᩹:I

    and-int/lit8 v1, v1, -0x9

    iput v1, p0, Ll/ۜܺۖ;->᩹:I

    .line 36287
    :cond_0
    iget-object v1, p0, Ll/ۜܺۖ;->ۤ:Ljava/util/List;

    invoke-static {v0, v1}, Ll/ۡܺۖ;->֫(Ll/ۡܺۖ;Ljava/util/List;)V

    goto :goto_0

    .line 36289
    :cond_1
    invoke-virtual {v1}, Ll/ܳۚۖ;->ۧ()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۡܺۖ;->֫(Ll/ۡܺۖ;Ljava/util/List;)V

    .line 36276
    :goto_0
    iget v1, p0, Ll/ۜܺۖ;->᩹:I

    if-eqz v1, :cond_6

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_2

    .line 36297
    iget-boolean v2, p0, Ll/ۜܺۖ;->᩶:Z

    invoke-static {v0, v2}, Ll/ۡܺۖ;->֫(Ll/ۡܺۖ;Z)V

    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_3

    .line 36301
    iget v3, p0, Ll/ۜܺۖ;->۬:I

    invoke-static {v0, v3}, Ll/ۡܺۖ;->֫(Ll/ۡܺۖ;I)V

    or-int/lit8 v2, v2, 0x2

    :cond_3
    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_5

    .line 36305
    iget-object v1, p0, Ll/ۜܺۖ;->ۙ:Ll/ܺۚۖ;

    if-nez v1, :cond_4

    .line 36306
    iget-object v1, p0, Ll/ۜܺۖ;->ۗ:Ll/ۛۢۖ;

    goto :goto_2

    .line 36307
    :cond_4
    invoke-virtual {v1}, Ll/ܺۚۖ;->ۧ()Ll/ۘᩴۖ;

    move-result-object v1

    check-cast v1, Ll/ۛۢۖ;

    .line 36305
    :goto_2
    invoke-static {v0, v1}, Ll/ۡܺۖ;->֫(Ll/ۡܺۖ;Ll/ۛۢۖ;)V

    or-int/lit8 v2, v2, 0x4

    .line 36310
    :cond_5
    invoke-static {v0, v2}, Ll/ۡܺۖ;->ۧ(Ll/ۡܺۖ;I)V

    .line 36277
    :cond_6
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onBuilt()V

    return-object v0
.end method

.method public final bridge synthetic buildPartial()Ll/᩻֡ۖ;
    .locals 1

    .line 36196
    invoke-virtual {p0}, Ll/ۜܺۖ;->buildPartial()Ll/ۡܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic clear()Ll/ۗۘۖ;
    .locals 0

    .line 36196
    invoke-virtual {p0}, Ll/ۜܺۖ;->ܽ()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/ۢ֡ۖ;
    .locals 0

    .line 36196
    invoke-virtual {p0}, Ll/ۜܺۖ;->ܽ()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/ܳ֡ۖ;
    .locals 0

    .line 36196
    invoke-virtual {p0}, Ll/ۜܺۖ;->ܽ()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/᩶ۘۖ;
    .locals 0

    .line 36196
    invoke-virtual {p0}, Ll/ۜܺۖ;->ܽ()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/᩷ۜۖ;
    .locals 0

    .line 36196
    invoke-virtual {p0}, Ll/ۜܺۖ;->ܽ()V

    return-object p0
.end method

.method public final getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 36260
    invoke-static {}, Ll/ۡܺۖ;->getDefaultInstance()Ll/ۡܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public final getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 36260
    invoke-static {}, Ll/ۡܺۖ;->getDefaultInstance()Ll/ۡܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public final getDescriptorForType()Ll/ᩳۖۖ;
    .locals 1

    .line 36255
    invoke-static {}, Ll/ۧۖۖ;->᩺()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public final internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 36209
    invoke-static {}, Ll/ۧۖۖ;->ܰ()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/ۡܺۖ;

    const-class v2, Ll/ۜܺۖ;

    .line 36210
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 3

    .line 36544
    iget v0, p0, Ll/ۜܺۖ;->᩹:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 36551
    iget-object v0, p0, Ll/ۜܺۖ;->ۙ:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 36552
    iget-object v0, p0, Ll/ۜܺۖ;->ۗ:Ll/ۛۢۖ;

    if-nez v0, :cond_1

    invoke-static {}, Ll/ۛۢۖ;->getDefaultInstance()Ll/ۛۢۖ;

    move-result-object v0

    goto :goto_0

    .line 36554
    :cond_0
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܿ()Ll/ۘᩴۖ;

    move-result-object v0

    check-cast v0, Ll/ۛۢۖ;

    .line 36369
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ll/ۛۢۖ;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_4

    :cond_2
    const/4 v0, 0x0

    .line 36683
    :goto_1
    iget-object v2, p0, Ll/ۜܺۖ;->۫:Ll/ܳۚۖ;

    if-nez v2, :cond_3

    .line 36684
    iget-object v2, p0, Ll/ۜܺۖ;->ۤ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    goto :goto_2

    .line 36686
    :cond_3
    invoke-virtual {v2}, Ll/ܳۚۖ;->ܳ()I

    move-result v2

    :goto_2
    if-ge v0, v2, :cond_6

    .line 36693
    iget-object v2, p0, Ll/ۜܺۖ;->۫:Ll/ܳۚۖ;

    if-nez v2, :cond_4

    .line 36694
    iget-object v2, p0, Ll/ۜܺۖ;->ۤ:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫ۖۖ;

    goto :goto_3

    .line 36696
    :cond_4
    invoke-virtual {v2, v0}, Ll/ܳۚۖ;->ۧ(I)Ll/ۘᩴۖ;

    move-result-object v2

    check-cast v2, Ll/֫ۖۖ;

    .line 36374
    :goto_3
    invoke-virtual {v2}, Ll/֫ۖۖ;->isInitialized()Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_4

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 36378
    :cond_6
    invoke-virtual {p0}, Ll/ۗۘۖ;->֫()Z

    move-result v0

    if-nez v0, :cond_7

    :goto_4
    return v1

    :cond_7
    const/4 v0, 0x1

    return v0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۖۜۖ;
    .locals 0

    .line 36196
    invoke-virtual {p0, p1, p2}, Ll/ۜܺۖ;->֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;)V

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 36196
    invoke-virtual {p0, p1, p2}, Ll/ۜܺۖ;->֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;)V

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 36196
    invoke-virtual {p0, p1, p2}, Ll/ۜܺۖ;->֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;)V

    return-object p0
.end method

.method public final mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;
    .locals 1

    .line 36315
    instance-of v0, p1, Ll/ۡܺۖ;

    if-eqz v0, :cond_0

    .line 36316
    check-cast p1, Ll/ۡܺۖ;

    invoke-virtual {p0, p1}, Ll/ۜܺۖ;->֫(Ll/ۡܺۖ;)V

    return-object p0

    .line 36318
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 36196
    invoke-virtual {p0, p1, p2}, Ll/ۜܺۖ;->֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;)V

    return-object p0
.end method

.method public final mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;
    .locals 1

    .line 36315
    instance-of v0, p1, Ll/ۡܺۖ;

    if-eqz v0, :cond_0

    .line 36316
    check-cast p1, Ll/ۡܺۖ;

    invoke-virtual {p0, p1}, Ll/ۜܺۖ;->֫(Ll/ۡܺۖ;)V

    return-object p0

    .line 36318
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public final ֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;)V
    .locals 4

    .line 36390
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :cond_0
    :goto_0
    if-nez v0, :cond_9

    .line 36395
    :try_start_0
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܶ()I

    move-result v1

    if-eqz v1, :cond_8

    const/16 v2, 0x108

    if-eq v1, v2, :cond_7

    const/16 v2, 0x110

    if-eq v1, v2, :cond_5

    const/16 v2, 0x11a

    if-eq v1, v2, :cond_4

    const/16 v2, 0x1f3a

    if-eq v1, v2, :cond_1

    .line 36438
    invoke-virtual {p0, p1, p2, v1}, Ll/ۗۘۖ;->parseUnknownField(Ll/۟ۜۖ;Ll/ᩳۘۖ;I)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 36427
    :cond_1
    invoke-static {}, Ll/֫ۖۖ;->parser()Ll/۫֡ۖ;

    move-result-object v1

    .line 36426
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/۫֡ۖ;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object v1

    check-cast v1, Ll/֫ۖۖ;

    .line 36429
    iget-object v2, p0, Ll/ۜܺۖ;->۫:Ll/ܳۚۖ;

    if-nez v2, :cond_3

    .line 36660
    iget v2, p0, Ll/ۜܺۖ;->᩹:I

    and-int/lit8 v2, v2, 0x8

    if-nez v2, :cond_2

    .line 36661
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Ll/ۜܺۖ;->ۤ:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, p0, Ll/ۜܺۖ;->ۤ:Ljava/util/List;

    .line 36662
    iget v2, p0, Ll/ۜܺۖ;->᩹:I

    or-int/lit8 v2, v2, 0x8

    iput v2, p0, Ll/ۜܺۖ;->᩹:I

    .line 36431
    :cond_2
    iget-object v2, p0, Ll/ۜܺۖ;->ۤ:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 36433
    :cond_3
    invoke-virtual {v2, v1}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    goto :goto_0

    .line 36419
    :cond_4
    invoke-direct {p0}, Ll/ۜܺۖ;->ᩳ()Ll/ܺۚۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v1

    .line 36418
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/ۢ֡ۖ;Ll/ᩳۘۖ;)V

    .line 36421
    iget v1, p0, Ll/ۜܺۖ;->᩹:I

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Ll/ۜܺۖ;->᩹:I

    goto :goto_0

    .line 36406
    :cond_5
    invoke-virtual {p1}, Ll/۟ۜۖ;->ۜ()I

    move-result v1

    .line 36408
    invoke-static {v1}, Ll/ۢܺۖ;->֫(I)Ll/ۢܺۖ;

    move-result-object v2

    if-nez v2, :cond_6

    const/16 v2, 0x22

    .line 36410
    invoke-virtual {p0, v2, v1}, Ll/᩶ۘۖ;->mergeUnknownVarintField(II)V

    goto :goto_0

    .line 36412
    :cond_6
    iput v1, p0, Ll/ۜܺۖ;->۬:I

    .line 36413
    iget v1, p0, Ll/ۜܺۖ;->᩹:I

    or-int/lit8 v1, v1, 0x2

    iput v1, p0, Ll/ۜܺۖ;->᩹:I

    goto :goto_0

    .line 36401
    :cond_7
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܿ()Z

    move-result v1

    iput-boolean v1, p0, Ll/ۜܺۖ;->᩶:Z

    .line 36402
    iget v1, p0, Ll/ۜܺۖ;->᩹:I

    or-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ۜܺۖ;->᩹:I
    :try_end_0
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    :cond_8
    :goto_1
    const/4 v0, 0x1

    goto/16 :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 36446
    :try_start_1
    invoke-virtual {p1}, Ll/֫᩵ۖ;->֫()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36448
    :goto_2
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 36449
    throw p1

    .line 36448
    :cond_9
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-void
.end method

.method public final ֫(Ll/ۡܺۖ;)V
    .locals 3

    .line 36324
    invoke-static {}, Ll/ۡܺۖ;->getDefaultInstance()Ll/ۡܺۖ;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-void

    .line 36325
    :cond_0
    invoke-virtual {p1}, Ll/ۡܺۖ;->ۘ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 36326
    invoke-virtual {p1}, Ll/ۡܺۖ;->ۡ()Z

    move-result v0

    .line 36478
    iput-boolean v0, p0, Ll/ۜܺۖ;->᩶:Z

    .line 36479
    iget v0, p0, Ll/ۜܺۖ;->᩹:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۜܺۖ;->᩹:I

    .line 36480
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 36328
    :cond_1
    invoke-virtual {p1}, Ll/ۡܺۖ;->᩵()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 36329
    invoke-virtual {p1}, Ll/ۡܺۖ;->ۖ()Ll/ۢܺۖ;

    move-result-object v0

    .line 36518
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36520
    iget v1, p0, Ll/ۜܺۖ;->᩹:I

    or-int/lit8 v1, v1, 0x2

    iput v1, p0, Ll/ۜܺۖ;->᩹:I

    .line 36521
    invoke-virtual {v0}, Ll/ۢܺۖ;->getNumber()I

    move-result v0

    iput v0, p0, Ll/ۜܺۖ;->۬:I

    .line 36522
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 36331
    :cond_2
    invoke-virtual {p1}, Ll/ۡܺۖ;->ᩴ()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 36332
    invoke-virtual {p1}, Ll/ۡܺۖ;->ܺ()Ll/ۛۢۖ;

    move-result-object v0

    .line 36591
    iget-object v1, p0, Ll/ۜܺۖ;->ۙ:Ll/ܺۚۖ;

    if-nez v1, :cond_4

    .line 36592
    iget v1, p0, Ll/ۜܺۖ;->᩹:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_3

    iget-object v1, p0, Ll/ۜܺۖ;->ۗ:Ll/ۛۢۖ;

    if-eqz v1, :cond_3

    .line 36594
    invoke-static {}, Ll/ۛۢۖ;->getDefaultInstance()Ll/ۛۢۖ;

    move-result-object v2

    if-eq v1, v2, :cond_3

    .line 36625
    iget v1, p0, Ll/ۜܺۖ;->᩹:I

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Ll/ۜܺۖ;->᩹:I

    .line 36626
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 36627
    invoke-direct {p0}, Ll/ۜܺۖ;->ᩳ()Ll/ܺۚۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v1

    check-cast v1, Ll/֡ۢۖ;

    .line 36595
    invoke-virtual {v1, v0}, Ll/֡ۢۖ;->֫(Ll/ۛۢۖ;)Ll/֡ۢۖ;

    goto :goto_0

    .line 36597
    :cond_3
    iput-object v0, p0, Ll/ۜܺۖ;->ۗ:Ll/ۛۢۖ;

    goto :goto_0

    .line 36600
    :cond_4
    invoke-virtual {v1, v0}, Ll/ܺۚۖ;->֫(Ll/ۘᩴۖ;)V

    .line 36602
    :goto_0
    iget-object v0, p0, Ll/ۜܺۖ;->ۗ:Ll/ۛۢۖ;

    if-eqz v0, :cond_5

    .line 36603
    iget v0, p0, Ll/ۜܺۖ;->᩹:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Ll/ۜܺۖ;->᩹:I

    .line 36604
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 36334
    :cond_5
    iget-object v0, p0, Ll/ۜܺۖ;->۫:Ll/ܳۚۖ;

    if-nez v0, :cond_8

    .line 36335
    invoke-static {p1}, Ll/ۡܺۖ;->֫(Ll/ۡܺۖ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_b

    .line 36336
    iget-object v0, p0, Ll/ۜܺۖ;->ۤ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 36337
    invoke-static {p1}, Ll/ۡܺۖ;->֫(Ll/ۡܺۖ;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ۜܺۖ;->ۤ:Ljava/util/List;

    .line 36338
    iget v0, p0, Ll/ۜܺۖ;->᩹:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Ll/ۜܺۖ;->᩹:I

    goto :goto_1

    .line 36660
    :cond_6
    iget v0, p0, Ll/ۜܺۖ;->᩹:I

    and-int/lit8 v0, v0, 0x8

    if-nez v0, :cond_7

    .line 36661
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ۜܺۖ;->ۤ:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ll/ۜܺۖ;->ۤ:Ljava/util/List;

    .line 36662
    iget v0, p0, Ll/ۜܺۖ;->᩹:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Ll/ۜܺۖ;->᩹:I

    .line 36341
    :cond_7
    iget-object v0, p0, Ll/ۜܺۖ;->ۤ:Ljava/util/List;

    invoke-static {p1}, Ll/ۡܺۖ;->֫(Ll/ۡܺۖ;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 36343
    :goto_1
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    goto :goto_2

    .line 36346
    :cond_8
    invoke-static {p1}, Ll/ۡܺۖ;->֫(Ll/ۡܺۖ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_b

    .line 36347
    iget-object v0, p0, Ll/ۜܺۖ;->۫:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 36348
    iget-object v0, p0, Ll/ۜܺۖ;->۫:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->ᩳ()V

    const/4 v0, 0x0

    .line 36349
    iput-object v0, p0, Ll/ۜܺۖ;->۫:Ll/ܳۚۖ;

    .line 36350
    invoke-static {p1}, Ll/ۡܺۖ;->֫(Ll/ۡܺۖ;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Ll/ۜܺۖ;->ۤ:Ljava/util/List;

    .line 36351
    iget v1, p0, Ll/ۜܺۖ;->᩹:I

    and-int/lit8 v1, v1, -0x9

    iput v1, p0, Ll/ۜܺۖ;->᩹:I

    .line 36353
    sget-boolean v1, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    if-eqz v1, :cond_9

    .line 36354
    invoke-direct {p0}, Ll/ۜܺۖ;->ܿ()Ll/ܳۚۖ;

    move-result-object v0

    :cond_9
    iput-object v0, p0, Ll/ۜܺۖ;->۫:Ll/ܳۚۖ;

    goto :goto_2

    .line 36356
    :cond_a
    iget-object v0, p0, Ll/ۜܺۖ;->۫:Ll/ܳۚۖ;

    invoke-static {p1}, Ll/ۡܺۖ;->֫(Ll/ۡܺۖ;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܳۚۖ;->֫(Ljava/lang/Iterable;)V

    .line 36360
    :cond_b
    :goto_2
    invoke-virtual {p0, p1}, Ll/ۗۘۖ;->֫(Ll/۫ۘۖ;)V

    .line 36361
    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩶ۘۖ;->mergeUnknownFields(Ll/ۢ֨ۖ;)Ll/᩶ۘۖ;

    .line 36362
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-void
.end method

.method public final ܽ()V
    .locals 2

    .line 36233
    invoke-super {p0}, Ll/ۗۘۖ;->clear()Ll/ۗۘۖ;

    const/4 v0, 0x0

    .line 36234
    iput v0, p0, Ll/ۜܺۖ;->᩹:I

    .line 36235
    iput-boolean v0, p0, Ll/ۜܺۖ;->᩶:Z

    .line 36236
    iput v0, p0, Ll/ۜܺۖ;->۬:I

    const/4 v0, 0x0

    .line 36237
    iput-object v0, p0, Ll/ۜܺۖ;->ۗ:Ll/ۛۢۖ;

    .line 36238
    iget-object v1, p0, Ll/ۜܺۖ;->ۙ:Ll/ܺۚۖ;

    if-eqz v1, :cond_0

    .line 36239
    invoke-virtual {v1}, Ll/ܺۚۖ;->ܽ()V

    .line 36240
    iput-object v0, p0, Ll/ۜܺۖ;->ۙ:Ll/ܺۚۖ;

    .line 36242
    :cond_0
    iget-object v1, p0, Ll/ۜܺۖ;->۫:Ll/ܳۚۖ;

    if-nez v1, :cond_1

    .line 36243
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ۜܺۖ;->ۤ:Ljava/util/List;

    goto :goto_0

    .line 36245
    :cond_1
    iput-object v0, p0, Ll/ۜܺۖ;->ۤ:Ljava/util/List;

    .line 36246
    invoke-virtual {v1}, Ll/ܳۚۖ;->ܽ()V

    .line 36248
    :goto_0
    iget v0, p0, Ll/ۜܺۖ;->᩹:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Ll/ۜܺۖ;->᩹:I

    return-void
.end method
