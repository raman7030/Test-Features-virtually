.class public final Ll/۫᩷ۖ;
.super Ll/᩶ۘۖ;
.source "T9Q9"

# interfaces
.implements Ll/ۘ֡ۖ;


# instance fields
.field public ۗ:Ll/ۖ᩵ۖ;

.field public ۙ:Ll/֫ۢۖ;

.field public ۛ:Ljava/util/List;

.field public ۤ:Ll/ܳۚۖ;

.field public ۫:Ljava/util/List;

.field public ۬:Ll/ܳۚۖ;

.field public ᩶:Ll/ܺۚۖ;

.field public ᩸:I

.field public ᩹:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16380
    invoke-direct {p0}, Ll/᩶ۘۖ;-><init>()V

    const-string v0, ""

    .line 16675
    iput-object v0, p0, Ll/۫᩷ۖ;->᩹:Ljava/lang/Object;

    .line 16756
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/۫᩷ۖ;->ۛ:Ljava/util/List;

    .line 17117
    iput-object v0, p0, Ll/۫᩷ۖ;->۫:Ljava/util/List;

    .line 17357
    invoke-static {}, Ll/ۖ᩵ۖ;->ܽ()Ll/ۖ᩵ۖ;

    move-result-object v0

    iput-object v0, p0, Ll/۫᩷ۖ;->ۗ:Ll/ۖ᩵ۖ;

    .line 16390
    sget-boolean v0, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    if-eqz v0, :cond_0

    .line 16392
    invoke-direct {p0}, Ll/۫᩷ۖ;->ܿ()Ll/ܳۚۖ;

    .line 16393
    invoke-direct {p0}, Ll/۫᩷ۖ;->ܽ()Ll/ܺۚۖ;

    .line 16394
    invoke-direct {p0}, Ll/۫᩷ۖ;->ᩳ()Ll/ܳۚۖ;

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 16362
    invoke-direct {p0}, Ll/۫᩷ۖ;-><init>()V

    return-void
.end method

.method public constructor <init>(Ll/ۢۜۖ;I)V
    .locals 0

    .line 16386
    invoke-direct {p0, p1}, Ll/᩶ۘۖ;-><init>(Ll/ۢۜۖ;)V

    const-string p1, ""

    .line 16675
    iput-object p1, p0, Ll/۫᩷ۖ;->᩹:Ljava/lang/Object;

    .line 16756
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Ll/۫᩷ۖ;->ۛ:Ljava/util/List;

    .line 17117
    iput-object p1, p0, Ll/۫᩷ۖ;->۫:Ljava/util/List;

    .line 17357
    invoke-static {}, Ll/ۖ᩵ۖ;->ܽ()Ll/ۖ᩵ۖ;

    move-result-object p1

    iput-object p1, p0, Ll/۫᩷ۖ;->ۗ:Ll/ۖ᩵ۖ;

    .line 16390
    sget-boolean p1, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    if-eqz p1, :cond_0

    .line 16392
    invoke-direct {p0}, Ll/۫᩷ۖ;->ܿ()Ll/ܳۚۖ;

    .line 16393
    invoke-direct {p0}, Ll/۫᩷ۖ;->ܽ()Ll/ܺۚۖ;

    .line 16394
    invoke-direct {p0}, Ll/۫᩷ۖ;->ᩳ()Ll/ܳۚۖ;

    :cond_0
    return-void
.end method

.method private ܽ()Ll/ܺۚۖ;
    .locals 4

    .line 17105
    iget-object v0, p0, Ll/۫᩷ۖ;->᩶:Ll/ܺۚۖ;

    if-nez v0, :cond_2

    .line 17106
    new-instance v1, Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 17011
    iget-object v0, p0, Ll/۫᩷ۖ;->ۙ:Ll/֫ۢۖ;

    if-nez v0, :cond_1

    invoke-static {}, Ll/֫ۢۖ;->getDefaultInstance()Ll/֫ۢۖ;

    move-result-object v0

    goto :goto_0

    .line 17013
    :cond_0
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܿ()Ll/ۘᩴۖ;

    move-result-object v0

    check-cast v0, Ll/֫ۢۖ;

    .line 17109
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v2

    .line 17110
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v3

    invoke-direct {v1, v0, v2, v3}, Ll/ܺۚۖ;-><init>(Ll/ۘᩴۖ;Ll/ۢۜۖ;Z)V

    iput-object v1, p0, Ll/۫᩷ۖ;->᩶:Ll/ܺۚۖ;

    const/4 v0, 0x0

    .line 17111
    iput-object v0, p0, Ll/۫᩷ۖ;->ۙ:Ll/֫ۢۖ;

    .line 17113
    :cond_2
    iget-object v0, p0, Ll/۫᩷ۖ;->᩶:Ll/ܺۚۖ;

    return-object v0
.end method

.method private ܿ()Ll/ܳۚۖ;
    .locals 5

    .line 16983
    iget-object v0, p0, Ll/۫᩷ۖ;->ۤ:Ll/ܳۚۖ;

    if-nez v0, :cond_1

    .line 16984
    new-instance v0, Ll/ܳۚۖ;

    iget-object v1, p0, Ll/۫᩷ۖ;->ۛ:Ljava/util/List;

    iget v2, p0, Ll/۫᩷ۖ;->᩸:I

    and-int/lit8 v2, v2, 0x2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 16988
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v3

    .line 16989
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Ll/ܳۚۖ;-><init>(Ljava/util/List;ZLl/ۢۜۖ;Z)V

    iput-object v0, p0, Ll/۫᩷ۖ;->ۤ:Ll/ܳۚۖ;

    const/4 v0, 0x0

    .line 16990
    iput-object v0, p0, Ll/۫᩷ۖ;->ۛ:Ljava/util/List;

    .line 16992
    :cond_1
    iget-object v0, p0, Ll/۫᩷ۖ;->ۤ:Ll/ܳۚۖ;

    return-object v0
.end method

.method private ᩳ()Ll/ܳۚۖ;
    .locals 5

    .line 17344
    iget-object v0, p0, Ll/۫᩷ۖ;->۬:Ll/ܳۚۖ;

    if-nez v0, :cond_1

    .line 17345
    new-instance v0, Ll/ܳۚۖ;

    iget-object v1, p0, Ll/۫᩷ۖ;->۫:Ljava/util/List;

    iget v2, p0, Ll/۫᩷ۖ;->᩸:I

    and-int/lit8 v2, v2, 0x8

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 17349
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v3

    .line 17350
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Ll/ܳۚۖ;-><init>(Ljava/util/List;ZLl/ۢۜۖ;Z)V

    iput-object v0, p0, Ll/۫᩷ۖ;->۬:Ll/ܳۚۖ;

    const/4 v0, 0x0

    .line 17351
    iput-object v0, p0, Ll/۫᩷ۖ;->۫:Ljava/util/List;

    .line 17353
    :cond_1
    iget-object v0, p0, Ll/۫᩷ۖ;->۬:Ll/ܳۚۖ;

    return-object v0
.end method


# virtual methods
.method public final build()Ll/ۡ֡ۖ;
    .locals 2

    .line 16439
    invoke-virtual {p0}, Ll/۫᩷ۖ;->buildPartial()Ll/᩺᩷ۖ;

    move-result-object v0

    .line 16440
    invoke-virtual {v0}, Ll/᩺᩷ۖ;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 16441
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public final build()Ll/᩻֡ۖ;
    .locals 2

    .line 16439
    invoke-virtual {p0}, Ll/۫᩷ۖ;->buildPartial()Ll/᩺᩷ۖ;

    move-result-object v0

    .line 16440
    invoke-virtual {v0}, Ll/᩺᩷ۖ;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 16441
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public final bridge synthetic buildPartial()Ll/ۡ֡ۖ;
    .locals 1

    .line 16362
    invoke-virtual {p0}, Ll/۫᩷ۖ;->buildPartial()Ll/᩺᩷ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final buildPartial()Ll/᩺᩷ۖ;
    .locals 4

    .line 16448
    new-instance v0, Ll/᩺᩷ۖ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll/᩺᩷ۖ;-><init>(Ll/۫᩷ۖ;I)V

    .line 16456
    iget-object v2, p0, Ll/۫᩷ۖ;->ۤ:Ll/ܳۚۖ;

    if-nez v2, :cond_1

    .line 16457
    iget v2, p0, Ll/۫᩷ۖ;->᩸:I

    and-int/lit8 v2, v2, 0x2

    if-eqz v2, :cond_0

    .line 16458
    iget-object v2, p0, Ll/۫᩷ۖ;->ۛ:Ljava/util/List;

    invoke-static {v2}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Ll/۫᩷ۖ;->ۛ:Ljava/util/List;

    .line 16459
    iget v2, p0, Ll/۫᩷ۖ;->᩸:I

    and-int/lit8 v2, v2, -0x3

    iput v2, p0, Ll/۫᩷ۖ;->᩸:I

    .line 16461
    :cond_0
    iget-object v2, p0, Ll/۫᩷ۖ;->ۛ:Ljava/util/List;

    invoke-static {v0, v2}, Ll/᩺᩷ۖ;->֫(Ll/᩺᩷ۖ;Ljava/util/List;)V

    goto :goto_0

    .line 16463
    :cond_1
    invoke-virtual {v2}, Ll/ܳۚۖ;->ۧ()Ljava/util/List;

    move-result-object v2

    invoke-static {v0, v2}, Ll/᩺᩷ۖ;->֫(Ll/᩺᩷ۖ;Ljava/util/List;)V

    .line 16465
    :goto_0
    iget-object v2, p0, Ll/۫᩷ۖ;->۬:Ll/ܳۚۖ;

    if-nez v2, :cond_3

    .line 16466
    iget v2, p0, Ll/۫᩷ۖ;->᩸:I

    and-int/lit8 v2, v2, 0x8

    if-eqz v2, :cond_2

    .line 16467
    iget-object v2, p0, Ll/۫᩷ۖ;->۫:Ljava/util/List;

    invoke-static {v2}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Ll/۫᩷ۖ;->۫:Ljava/util/List;

    .line 16468
    iget v2, p0, Ll/۫᩷ۖ;->᩸:I

    and-int/lit8 v2, v2, -0x9

    iput v2, p0, Ll/۫᩷ۖ;->᩸:I

    .line 16470
    :cond_2
    iget-object v2, p0, Ll/۫᩷ۖ;->۫:Ljava/util/List;

    invoke-static {v0, v2}, Ll/᩺᩷ۖ;->ۧ(Ll/᩺᩷ۖ;Ljava/util/List;)V

    goto :goto_1

    .line 16472
    :cond_3
    invoke-virtual {v2}, Ll/ܳۚۖ;->ۧ()Ljava/util/List;

    move-result-object v2

    invoke-static {v0, v2}, Ll/᩺᩷ۖ;->ۧ(Ll/᩺᩷ۖ;Ljava/util/List;)V

    .line 16450
    :goto_1
    iget v2, p0, Ll/۫᩷ۖ;->᩸:I

    if-eqz v2, :cond_8

    and-int/lit8 v3, v2, 0x1

    if-eqz v3, :cond_4

    .line 16480
    iget-object v1, p0, Ll/۫᩷ۖ;->᩹:Ljava/lang/Object;

    invoke-static {v0, v1}, Ll/᩺᩷ۖ;->֫(Ll/᩺᩷ۖ;Ljava/lang/Object;)V

    const/4 v1, 0x1

    :cond_4
    and-int/lit8 v3, v2, 0x4

    if-eqz v3, :cond_6

    .line 16484
    iget-object v3, p0, Ll/۫᩷ۖ;->᩶:Ll/ܺۚۖ;

    if-nez v3, :cond_5

    .line 16485
    iget-object v3, p0, Ll/۫᩷ۖ;->ۙ:Ll/֫ۢۖ;

    goto :goto_2

    .line 16486
    :cond_5
    invoke-virtual {v3}, Ll/ܺۚۖ;->ۧ()Ll/ۘᩴۖ;

    move-result-object v3

    check-cast v3, Ll/֫ۢۖ;

    .line 16484
    :goto_2
    invoke-static {v0, v3}, Ll/᩺᩷ۖ;->֫(Ll/᩺᩷ۖ;Ll/֫ۢۖ;)V

    or-int/lit8 v1, v1, 0x2

    :cond_6
    and-int/lit8 v2, v2, 0x10

    if-eqz v2, :cond_7

    .line 16490
    iget-object v2, p0, Ll/۫᩷ۖ;->ۗ:Ll/ۖ᩵ۖ;

    invoke-virtual {v2}, Ll/᩵ۜۖ;->᩶()V

    .line 16491
    iget-object v2, p0, Ll/۫᩷ۖ;->ۗ:Ll/ۖ᩵ۖ;

    invoke-static {v0, v2}, Ll/᩺᩷ۖ;->֫(Ll/᩺᩷ۖ;Ll/ۖ᩵ۖ;)V

    .line 16493
    :cond_7
    invoke-static {v0, v1}, Ll/᩺᩷ۖ;->֫(Ll/᩺᩷ۖ;I)V

    .line 16451
    :cond_8
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onBuilt()V

    return-object v0
.end method

.method public final bridge synthetic buildPartial()Ll/᩻֡ۖ;
    .locals 1

    .line 16362
    invoke-virtual {p0}, Ll/۫᩷ۖ;->buildPartial()Ll/᩺᩷ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic clear()Ll/ۢ֡ۖ;
    .locals 0

    .line 16362
    invoke-virtual {p0}, Ll/۫᩷ۖ;->֫()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/ܳ֡ۖ;
    .locals 0

    .line 16362
    invoke-virtual {p0}, Ll/۫᩷ۖ;->֫()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/᩶ۘۖ;
    .locals 0

    .line 16362
    invoke-virtual {p0}, Ll/۫᩷ۖ;->֫()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/᩷ۜۖ;
    .locals 0

    .line 16362
    invoke-virtual {p0}, Ll/۫᩷ۖ;->֫()V

    return-object p0
.end method

.method public final getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 16434
    invoke-static {}, Ll/᩺᩷ۖ;->getDefaultInstance()Ll/᩺᩷ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 16434
    invoke-static {}, Ll/᩺᩷ۖ;->getDefaultInstance()Ll/᩺᩷ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final getDescriptorForType()Ll/ᩳۖۖ;
    .locals 1

    .line 16429
    invoke-static {}, Ll/ۧۖۖ;->֫()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public final internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 16374
    invoke-static {}, Ll/ۧۖۖ;->ۧ()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/᩺᩷ۖ;

    const-class v2, Ll/۫᩷ۖ;

    .line 16375
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 16781
    :goto_0
    iget-object v2, p0, Ll/۫᩷ۖ;->ۤ:Ll/ܳۚۖ;

    if-nez v2, :cond_0

    .line 16782
    iget-object v2, p0, Ll/۫᩷ۖ;->ۛ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    goto :goto_1

    .line 16784
    :cond_0
    invoke-virtual {v2}, Ll/ܳۚۖ;->ܳ()I

    move-result v2

    :goto_1
    if-ge v1, v2, :cond_3

    .line 16791
    iget-object v2, p0, Ll/۫᩷ۖ;->ۤ:Ll/ܳۚۖ;

    if-nez v2, :cond_1

    .line 16792
    iget-object v2, p0, Ll/۫᩷ۖ;->ۛ:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۢۖ;

    goto :goto_2

    .line 16794
    :cond_1
    invoke-virtual {v2, v1}, Ll/ܳۚۖ;->ۧ(I)Ll/ۘᩴۖ;

    move-result-object v2

    check-cast v2, Ll/ᩳۢۖ;

    .line 16586
    :goto_2
    invoke-virtual {v2}, Ll/ᩳۢۖ;->isInitialized()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_4

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 17003
    :cond_3
    iget v1, p0, Ll/۫᩷ۖ;->᩸:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_6

    .line 17010
    iget-object v1, p0, Ll/۫᩷ۖ;->᩶:Ll/ܺۚۖ;

    if-nez v1, :cond_4

    .line 17011
    iget-object v1, p0, Ll/۫᩷ۖ;->ۙ:Ll/֫ۢۖ;

    if-nez v1, :cond_5

    invoke-static {}, Ll/֫ۢۖ;->getDefaultInstance()Ll/֫ۢۖ;

    move-result-object v1

    goto :goto_3

    .line 17013
    :cond_4
    invoke-virtual {v1}, Ll/ܺۚۖ;->ܿ()Ll/ۘᩴۖ;

    move-result-object v1

    check-cast v1, Ll/֫ۢۖ;

    .line 16591
    :cond_5
    :goto_3
    invoke-virtual {v1}, Ll/֫ۢۖ;->isInitialized()Z

    move-result v1

    if-nez v1, :cond_6

    :goto_4
    return v0

    :cond_6
    const/4 v0, 0x1

    return v0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۖۜۖ;
    .locals 0

    .line 16362
    invoke-virtual {p0, p1, p2}, Ll/۫᩷ۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/۫᩷ۖ;

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 16362
    invoke-virtual {p0, p1, p2}, Ll/۫᩷ۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/۫᩷ۖ;

    return-object p0
.end method

.method public final mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/۫᩷ۖ;
    .locals 4

    .line 16604
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :cond_0
    :goto_0
    if-nez v0, :cond_c

    .line 16609
    :try_start_0
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܶ()I

    move-result v1

    if-eqz v1, :cond_b

    const/16 v2, 0xa

    if-eq v1, v2, :cond_a

    const/16 v2, 0x12

    if-eq v1, v2, :cond_7

    const/16 v2, 0x1a

    if-eq v1, v2, :cond_6

    const/16 v2, 0x22

    if-eq v1, v2, :cond_3

    const/16 v2, 0x2a

    if-eq v1, v2, :cond_1

    .line 16659
    invoke-super {p0, p1, p2, v1}, Ll/᩶ۘۖ;->parseUnknownField(Ll/۟ۜۖ;Ll/ᩳۘۖ;I)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_1

    .line 16653
    :cond_1
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܳ()Ll/ۛۜۖ;

    move-result-object v1

    .line 17359
    iget-object v2, p0, Ll/۫᩷ۖ;->ۗ:Ll/ۖ᩵ۖ;

    invoke-virtual {v2}, Ll/᩵ۜۖ;->ۤ֫()Z

    move-result v2

    if-nez v2, :cond_2

    .line 17360
    new-instance v2, Ll/ۖ᩵ۖ;

    iget-object v3, p0, Ll/۫᩷ۖ;->ۗ:Ll/ۖ᩵ۖ;

    invoke-direct {v2, v3}, Ll/ۖ᩵ۖ;-><init>(Ll/ۘ᩵ۖ;)V

    iput-object v2, p0, Ll/۫᩷ۖ;->ۗ:Ll/ۖ᩵ۖ;

    .line 17362
    :cond_2
    iget v2, p0, Ll/۫᩷ۖ;->᩸:I

    or-int/lit8 v2, v2, 0x10

    iput v2, p0, Ll/۫᩷ۖ;->᩸:I

    .line 16655
    iget-object v2, p0, Ll/۫᩷ۖ;->ۗ:Ll/ۖ᩵ۖ;

    invoke-virtual {v2, v1}, Ll/ۖ᩵ۖ;->֫(Ll/ۛۜۖ;)V

    goto :goto_0

    .line 16642
    :cond_3
    invoke-static {}, Ll/ۨ᩷ۖ;->parser()Ll/۫֡ۖ;

    move-result-object v1

    .line 16641
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/۫֡ۖ;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object v1

    check-cast v1, Ll/ۨ᩷ۖ;

    .line 16644
    iget-object v2, p0, Ll/۫᩷ۖ;->۬:Ll/ܳۚۖ;

    if-nez v2, :cond_5

    .line 17119
    iget v2, p0, Ll/۫᩷ۖ;->᩸:I

    and-int/lit8 v2, v2, 0x8

    if-nez v2, :cond_4

    .line 17120
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Ll/۫᩷ۖ;->۫:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, p0, Ll/۫᩷ۖ;->۫:Ljava/util/List;

    .line 17121
    iget v2, p0, Ll/۫᩷ۖ;->᩸:I

    or-int/lit8 v2, v2, 0x8

    iput v2, p0, Ll/۫᩷ۖ;->᩸:I

    .line 16646
    :cond_4
    iget-object v2, p0, Ll/۫᩷ۖ;->۫:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 16648
    :cond_5
    invoke-virtual {v2, v1}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    goto :goto_0

    .line 16634
    :cond_6
    invoke-direct {p0}, Ll/۫᩷ۖ;->ܽ()Ll/ܺۚۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v1

    .line 16633
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/ۢ֡ۖ;Ll/ᩳۘۖ;)V

    .line 16636
    iget v1, p0, Ll/۫᩷ۖ;->᩸:I

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Ll/۫᩷ۖ;->᩸:I

    goto/16 :goto_0

    .line 16622
    :cond_7
    invoke-static {}, Ll/ᩳۢۖ;->parser()Ll/۫֡ۖ;

    move-result-object v1

    .line 16621
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/۫֡ۖ;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object v1

    check-cast v1, Ll/ᩳۢۖ;

    .line 16624
    iget-object v2, p0, Ll/۫᩷ۖ;->ۤ:Ll/ܳۚۖ;

    if-nez v2, :cond_9

    .line 16758
    iget v2, p0, Ll/۫᩷ۖ;->᩸:I

    and-int/lit8 v2, v2, 0x2

    if-nez v2, :cond_8

    .line 16759
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Ll/۫᩷ۖ;->ۛ:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, p0, Ll/۫᩷ۖ;->ۛ:Ljava/util/List;

    .line 16760
    iget v2, p0, Ll/۫᩷ۖ;->᩸:I

    or-int/lit8 v2, v2, 0x2

    iput v2, p0, Ll/۫᩷ۖ;->᩸:I

    .line 16626
    :cond_8
    iget-object v2, p0, Ll/۫᩷ۖ;->ۛ:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 16628
    :cond_9
    invoke-virtual {v2, v1}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    goto/16 :goto_0

    .line 16615
    :cond_a
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܳ()Ll/ۛۜۖ;

    move-result-object v1

    iput-object v1, p0, Ll/۫᩷ۖ;->᩹:Ljava/lang/Object;

    .line 16616
    iget v1, p0, Ll/۫᩷ۖ;->᩸:I

    or-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/۫᩷ۖ;->᩸:I
    :try_end_0
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    :cond_b
    :goto_1
    const/4 v0, 0x1

    goto/16 :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 16667
    :try_start_1
    invoke-virtual {p1}, Ll/֫᩵ۖ;->֫()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16669
    :goto_2
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 16670
    throw p1

    .line 16669
    :cond_c
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 16362
    invoke-virtual {p0, p1, p2}, Ll/۫᩷ۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/۫᩷ۖ;

    return-object p0
.end method

.method public final mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;
    .locals 1

    .line 16498
    instance-of v0, p1, Ll/᩺᩷ۖ;

    if-eqz v0, :cond_0

    .line 16499
    check-cast p1, Ll/᩺᩷ۖ;

    invoke-virtual {p0, p1}, Ll/۫᩷ۖ;->֫(Ll/᩺᩷ۖ;)V

    return-object p0

    .line 16501
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 16362
    invoke-virtual {p0, p1, p2}, Ll/۫᩷ۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/۫᩷ۖ;

    return-object p0
.end method

.method public final mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;
    .locals 1

    .line 16498
    instance-of v0, p1, Ll/᩺᩷ۖ;

    if-eqz v0, :cond_0

    .line 16499
    check-cast p1, Ll/᩺᩷ۖ;

    invoke-virtual {p0, p1}, Ll/۫᩷ۖ;->֫(Ll/᩺᩷ۖ;)V

    return-object p0

    .line 16501
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public final ֫()V
    .locals 2

    .line 16399
    invoke-super {p0}, Ll/᩶ۘۖ;->clear()Ll/᩶ۘۖ;

    const/4 v0, 0x0

    .line 16400
    iput v0, p0, Ll/۫᩷ۖ;->᩸:I

    const-string v0, ""

    .line 16401
    iput-object v0, p0, Ll/۫᩷ۖ;->᩹:Ljava/lang/Object;

    .line 16402
    iget-object v0, p0, Ll/۫᩷ۖ;->ۤ:Ll/ܳۚۖ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 16403
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/۫᩷ۖ;->ۛ:Ljava/util/List;

    goto :goto_0

    .line 16405
    :cond_0
    iput-object v1, p0, Ll/۫᩷ۖ;->ۛ:Ljava/util/List;

    .line 16406
    invoke-virtual {v0}, Ll/ܳۚۖ;->ܽ()V

    .line 16408
    :goto_0
    iget v0, p0, Ll/۫᩷ۖ;->᩸:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Ll/۫᩷ۖ;->᩸:I

    .line 16409
    iput-object v1, p0, Ll/۫᩷ۖ;->ۙ:Ll/֫ۢۖ;

    .line 16410
    iget-object v0, p0, Ll/۫᩷ۖ;->᩶:Ll/ܺۚۖ;

    if-eqz v0, :cond_1

    .line 16411
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܽ()V

    .line 16412
    iput-object v1, p0, Ll/۫᩷ۖ;->᩶:Ll/ܺۚۖ;

    .line 16414
    :cond_1
    iget-object v0, p0, Ll/۫᩷ۖ;->۬:Ll/ܳۚۖ;

    if-nez v0, :cond_2

    .line 16415
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/۫᩷ۖ;->۫:Ljava/util/List;

    goto :goto_1

    .line 16417
    :cond_2
    iput-object v1, p0, Ll/۫᩷ۖ;->۫:Ljava/util/List;

    .line 16418
    invoke-virtual {v0}, Ll/ܳۚۖ;->ܽ()V

    .line 16420
    :goto_1
    iget v0, p0, Ll/۫᩷ۖ;->᩸:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Ll/۫᩷ۖ;->᩸:I

    .line 16422
    invoke-static {}, Ll/ۖ᩵ۖ;->ܽ()Ll/ۖ᩵ۖ;

    move-result-object v0

    iput-object v0, p0, Ll/۫᩷ۖ;->ۗ:Ll/ۖ᩵ۖ;

    return-void
.end method

.method public final ֫(Ll/᩺᩷ۖ;)V
    .locals 4

    .line 16507
    invoke-static {}, Ll/᩺᩷ۖ;->getDefaultInstance()Ll/᩺᩷ۖ;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-void

    .line 16508
    :cond_0
    invoke-virtual {p1}, Ll/᩺᩷ۖ;->hasName()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 16509
    invoke-static {p1}, Ll/᩺᩷ۖ;->ܽ(Ll/᩺᩷ۖ;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Ll/۫᩷ۖ;->᩹:Ljava/lang/Object;

    .line 16510
    iget v0, p0, Ll/۫᩷ۖ;->᩸:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/۫᩷ۖ;->᩸:I

    .line 16511
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 16513
    :cond_1
    iget-object v0, p0, Ll/۫᩷ۖ;->ۤ:Ll/ܳۚۖ;

    const/4 v1, 0x0

    if-nez v0, :cond_4

    .line 16514
    invoke-static {p1}, Ll/᩺᩷ۖ;->֫(Ll/᩺᩷ۖ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 16515
    iget-object v0, p0, Ll/۫᩷ۖ;->ۛ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 16516
    invoke-static {p1}, Ll/᩺᩷ۖ;->֫(Ll/᩺᩷ۖ;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/۫᩷ۖ;->ۛ:Ljava/util/List;

    .line 16517
    iget v0, p0, Ll/۫᩷ۖ;->᩸:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Ll/۫᩷ۖ;->᩸:I

    goto :goto_0

    .line 16758
    :cond_2
    iget v0, p0, Ll/۫᩷ۖ;->᩸:I

    and-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_3

    .line 16759
    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Ll/۫᩷ۖ;->ۛ:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ll/۫᩷ۖ;->ۛ:Ljava/util/List;

    .line 16760
    iget v0, p0, Ll/۫᩷ۖ;->᩸:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Ll/۫᩷ۖ;->᩸:I

    .line 16520
    :cond_3
    iget-object v0, p0, Ll/۫᩷ۖ;->ۛ:Ljava/util/List;

    invoke-static {p1}, Ll/᩺᩷ۖ;->֫(Ll/᩺᩷ۖ;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 16522
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    goto :goto_2

    .line 16525
    :cond_4
    invoke-static {p1}, Ll/᩺᩷ۖ;->֫(Ll/᩺᩷ۖ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 16526
    iget-object v0, p0, Ll/۫᩷ۖ;->ۤ:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 16527
    iget-object v0, p0, Ll/۫᩷ۖ;->ۤ:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->ᩳ()V

    .line 16528
    iput-object v1, p0, Ll/۫᩷ۖ;->ۤ:Ll/ܳۚۖ;

    .line 16529
    invoke-static {p1}, Ll/᩺᩷ۖ;->֫(Ll/᩺᩷ۖ;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/۫᩷ۖ;->ۛ:Ljava/util/List;

    .line 16530
    iget v0, p0, Ll/۫᩷ۖ;->᩸:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Ll/۫᩷ۖ;->᩸:I

    .line 16532
    sget-boolean v0, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    if-eqz v0, :cond_5

    .line 16533
    invoke-direct {p0}, Ll/۫᩷ۖ;->ܿ()Ll/ܳۚۖ;

    move-result-object v0

    goto :goto_1

    :cond_5
    move-object v0, v1

    :goto_1
    iput-object v0, p0, Ll/۫᩷ۖ;->ۤ:Ll/ܳۚۖ;

    goto :goto_2

    .line 16535
    :cond_6
    iget-object v0, p0, Ll/۫᩷ۖ;->ۤ:Ll/ܳۚۖ;

    invoke-static {p1}, Ll/᩺᩷ۖ;->֫(Ll/᩺᩷ۖ;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ܳۚۖ;->֫(Ljava/lang/Iterable;)V

    .line 16539
    :cond_7
    :goto_2
    invoke-virtual {p1}, Ll/᩺᩷ۖ;->ۢ()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 16540
    invoke-virtual {p1}, Ll/᩺᩷ۖ;->ۜ()Ll/֫ۢۖ;

    move-result-object v0

    .line 17050
    iget-object v2, p0, Ll/۫᩷ۖ;->᩶:Ll/ܺۚۖ;

    if-nez v2, :cond_9

    .line 17051
    iget v2, p0, Ll/۫᩷ۖ;->᩸:I

    and-int/lit8 v2, v2, 0x4

    if-eqz v2, :cond_8

    iget-object v2, p0, Ll/۫᩷ۖ;->ۙ:Ll/֫ۢۖ;

    if-eqz v2, :cond_8

    .line 17053
    invoke-static {}, Ll/֫ۢۖ;->getDefaultInstance()Ll/֫ۢۖ;

    move-result-object v3

    if-eq v2, v3, :cond_8

    .line 17084
    iget v2, p0, Ll/۫᩷ۖ;->᩸:I

    or-int/lit8 v2, v2, 0x4

    iput v2, p0, Ll/۫᩷ۖ;->᩸:I

    .line 17085
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 17086
    invoke-direct {p0}, Ll/۫᩷ۖ;->ܽ()Ll/ܺۚۖ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v2

    check-cast v2, Ll/۟᩷ۖ;

    .line 17054
    invoke-virtual {v2, v0}, Ll/۟᩷ۖ;->֫(Ll/֫ۢۖ;)V

    goto :goto_3

    .line 17056
    :cond_8
    iput-object v0, p0, Ll/۫᩷ۖ;->ۙ:Ll/֫ۢۖ;

    goto :goto_3

    .line 17059
    :cond_9
    invoke-virtual {v2, v0}, Ll/ܺۚۖ;->֫(Ll/ۘᩴۖ;)V

    .line 17061
    :goto_3
    iget-object v0, p0, Ll/۫᩷ۖ;->ۙ:Ll/֫ۢۖ;

    if-eqz v0, :cond_a

    .line 17062
    iget v0, p0, Ll/۫᩷ۖ;->᩸:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Ll/۫᩷ۖ;->᩸:I

    .line 17063
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 16542
    :cond_a
    iget-object v0, p0, Ll/۫᩷ۖ;->۬:Ll/ܳۚۖ;

    if-nez v0, :cond_d

    .line 16543
    invoke-static {p1}, Ll/᩺᩷ۖ;->ۧ(Ll/᩺᩷ۖ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_10

    .line 16544
    iget-object v0, p0, Ll/۫᩷ۖ;->۫:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 16545
    invoke-static {p1}, Ll/᩺᩷ۖ;->ۧ(Ll/᩺᩷ۖ;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/۫᩷ۖ;->۫:Ljava/util/List;

    .line 16546
    iget v0, p0, Ll/۫᩷ۖ;->᩸:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Ll/۫᩷ۖ;->᩸:I

    goto :goto_4

    .line 17119
    :cond_b
    iget v0, p0, Ll/۫᩷ۖ;->᩸:I

    and-int/lit8 v0, v0, 0x8

    if-nez v0, :cond_c

    .line 17120
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/۫᩷ۖ;->۫:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ll/۫᩷ۖ;->۫:Ljava/util/List;

    .line 17121
    iget v0, p0, Ll/۫᩷ۖ;->᩸:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Ll/۫᩷ۖ;->᩸:I

    .line 16549
    :cond_c
    iget-object v0, p0, Ll/۫᩷ۖ;->۫:Ljava/util/List;

    invoke-static {p1}, Ll/᩺᩷ۖ;->ۧ(Ll/᩺᩷ۖ;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 16551
    :goto_4
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    goto :goto_5

    .line 16554
    :cond_d
    invoke-static {p1}, Ll/᩺᩷ۖ;->ۧ(Ll/᩺᩷ۖ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_10

    .line 16555
    iget-object v0, p0, Ll/۫᩷ۖ;->۬:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 16556
    iget-object v0, p0, Ll/۫᩷ۖ;->۬:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->ᩳ()V

    .line 16557
    iput-object v1, p0, Ll/۫᩷ۖ;->۬:Ll/ܳۚۖ;

    .line 16558
    invoke-static {p1}, Ll/᩺᩷ۖ;->ۧ(Ll/᩺᩷ۖ;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/۫᩷ۖ;->۫:Ljava/util/List;

    .line 16559
    iget v0, p0, Ll/۫᩷ۖ;->᩸:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Ll/۫᩷ۖ;->᩸:I

    .line 16561
    sget-boolean v0, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    if-eqz v0, :cond_e

    .line 16562
    invoke-direct {p0}, Ll/۫᩷ۖ;->ᩳ()Ll/ܳۚۖ;

    move-result-object v1

    :cond_e
    iput-object v1, p0, Ll/۫᩷ۖ;->۬:Ll/ܳۚۖ;

    goto :goto_5

    .line 16564
    :cond_f
    iget-object v0, p0, Ll/۫᩷ۖ;->۬:Ll/ܳۚۖ;

    invoke-static {p1}, Ll/᩺᩷ۖ;->ۧ(Ll/᩺᩷ۖ;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܳۚۖ;->֫(Ljava/lang/Iterable;)V

    .line 16568
    :cond_10
    :goto_5
    invoke-static {p1}, Ll/᩺᩷ۖ;->ᩳ(Ll/᩺᩷ۖ;)Ll/ۖ᩵ۖ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_13

    .line 16569
    iget-object v0, p0, Ll/۫᩷ۖ;->ۗ:Ll/ۖ᩵ۖ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_11

    .line 16570
    invoke-static {p1}, Ll/᩺᩷ۖ;->ᩳ(Ll/᩺᩷ۖ;)Ll/ۖ᩵ۖ;

    move-result-object v0

    iput-object v0, p0, Ll/۫᩷ۖ;->ۗ:Ll/ۖ᩵ۖ;

    .line 16571
    iget v0, p0, Ll/۫᩷ۖ;->᩸:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Ll/۫᩷ۖ;->᩸:I

    goto :goto_6

    .line 17359
    :cond_11
    iget-object v0, p0, Ll/۫᩷ۖ;->ۗ:Ll/ۖ᩵ۖ;

    invoke-virtual {v0}, Ll/᩵ۜۖ;->ۤ֫()Z

    move-result v0

    if-nez v0, :cond_12

    .line 17360
    new-instance v0, Ll/ۖ᩵ۖ;

    iget-object v1, p0, Ll/۫᩷ۖ;->ۗ:Ll/ۖ᩵ۖ;

    invoke-direct {v0, v1}, Ll/ۖ᩵ۖ;-><init>(Ll/ۘ᩵ۖ;)V

    iput-object v0, p0, Ll/۫᩷ۖ;->ۗ:Ll/ۖ᩵ۖ;

    .line 17362
    :cond_12
    iget v0, p0, Ll/۫᩷ۖ;->᩸:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Ll/۫᩷ۖ;->᩸:I

    .line 16574
    iget-object v0, p0, Ll/۫᩷ۖ;->ۗ:Ll/ۖ᩵ۖ;

    invoke-static {p1}, Ll/᩺᩷ۖ;->ᩳ(Ll/᩺᩷ۖ;)Ll/ۖ᩵ۖ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۖ᩵ۖ;->addAll(Ljava/util/Collection;)Z

    .line 16576
    :goto_6
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 16578
    :cond_13
    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩶ۘۖ;->mergeUnknownFields(Ll/ۢ֨ۖ;)Ll/᩶ۘۖ;

    .line 16579
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-void
.end method
