.class public final Ll/۟᩷ۖ;
.super Ll/ۗۘۖ;
.source "T9Q9"


# instance fields
.field public ۗ:Z

.field public ۙ:Z

.field public ۛ:Ljava/util/List;

.field public ۤ:Ll/ܳۚۖ;

.field public ۫:Ll/ۛۢۖ;

.field public ۬:Ll/ܺۚۖ;

.field public ᩶:I

.field public ᩹:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 32372
    invoke-direct {p0}, Ll/ۗۘۖ;-><init>()V

    .line 32867
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/۟᩷ۖ;->ۛ:Ljava/util/List;

    .line 32382
    sget-boolean v0, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    if-eqz v0, :cond_0

    .line 32384
    invoke-direct {p0}, Ll/۟᩷ۖ;->ᩳ()Ll/ܺۚۖ;

    .line 32385
    invoke-direct {p0}, Ll/۟᩷ۖ;->ܿ()Ll/ܳۚۖ;

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 32353
    invoke-direct {p0}, Ll/۟᩷ۖ;-><init>()V

    return-void
.end method

.method public constructor <init>(Ll/ۢۜۖ;I)V
    .locals 0

    .line 1223
    invoke-direct {p0, p1}, Ll/᩶ۘۖ;-><init>(Ll/ۢۜۖ;)V

    .line 32867
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Ll/۟᩷ۖ;->ۛ:Ljava/util/List;

    .line 32382
    sget-boolean p1, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    if-eqz p1, :cond_0

    .line 32384
    invoke-direct {p0}, Ll/۟᩷ۖ;->ᩳ()Ll/ܺۚۖ;

    .line 32385
    invoke-direct {p0}, Ll/۟᩷ۖ;->ܿ()Ll/ܳۚۖ;

    :cond_0
    return-void
.end method

.method private ܿ()Ll/ܳۚۖ;
    .locals 5

    .line 33094
    iget-object v0, p0, Ll/۟᩷ۖ;->ۤ:Ll/ܳۚۖ;

    if-nez v0, :cond_1

    .line 33095
    new-instance v0, Ll/ܳۚۖ;

    iget-object v1, p0, Ll/۟᩷ۖ;->ۛ:Ljava/util/List;

    iget v2, p0, Ll/۟᩷ۖ;->᩶:I

    and-int/lit8 v2, v2, 0x10

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 33099
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v3

    .line 33100
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Ll/ܳۚۖ;-><init>(Ljava/util/List;ZLl/ۢۜۖ;Z)V

    iput-object v0, p0, Ll/۟᩷ۖ;->ۤ:Ll/ܳۚۖ;

    const/4 v0, 0x0

    .line 33101
    iput-object v0, p0, Ll/۟᩷ۖ;->ۛ:Ljava/util/List;

    .line 33103
    :cond_1
    iget-object v0, p0, Ll/۟᩷ۖ;->ۤ:Ll/ܳۚۖ;

    return-object v0
.end method

.method private ᩳ()Ll/ܺۚۖ;
    .locals 4

    .line 32855
    iget-object v0, p0, Ll/۟᩷ۖ;->۬:Ll/ܺۚۖ;

    if-nez v0, :cond_2

    .line 32856
    new-instance v1, Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 32761
    iget-object v0, p0, Ll/۟᩷ۖ;->۫:Ll/ۛۢۖ;

    if-nez v0, :cond_1

    invoke-static {}, Ll/ۛۢۖ;->getDefaultInstance()Ll/ۛۢۖ;

    move-result-object v0

    goto :goto_0

    .line 32763
    :cond_0
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܿ()Ll/ۘᩴۖ;

    move-result-object v0

    check-cast v0, Ll/ۛۢۖ;

    .line 32859
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v2

    .line 32860
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v3

    invoke-direct {v1, v0, v2, v3}, Ll/ܺۚۖ;-><init>(Ll/ۘᩴۖ;Ll/ۢۜۖ;Z)V

    iput-object v1, p0, Ll/۟᩷ۖ;->۬:Ll/ܺۚۖ;

    const/4 v0, 0x0

    .line 32861
    iput-object v0, p0, Ll/۟᩷ۖ;->۫:Ll/ۛۢۖ;

    .line 32863
    :cond_2
    iget-object v0, p0, Ll/۟᩷ۖ;->۬:Ll/ܺۚۖ;

    return-object v0
.end method


# virtual methods
.method public final build()Ll/ۡ֡ۖ;
    .locals 2

    .line 32423
    invoke-virtual {p0}, Ll/۟᩷ۖ;->buildPartial()Ll/֫ۢۖ;

    move-result-object v0

    .line 32424
    invoke-virtual {v0}, Ll/֫ۢۖ;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 32425
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public final build()Ll/᩻֡ۖ;
    .locals 2

    .line 32423
    invoke-virtual {p0}, Ll/۟᩷ۖ;->buildPartial()Ll/֫ۢۖ;

    move-result-object v0

    .line 32424
    invoke-virtual {v0}, Ll/֫ۢۖ;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 32425
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public final buildPartial()Ll/֫ۢۖ;
    .locals 4

    .line 32432
    new-instance v0, Ll/֫ۢۖ;

    invoke-direct {v0, p0}, Ll/֫ۢۖ;-><init>(Ll/۟᩷ۖ;)V

    .line 32440
    iget-object v1, p0, Ll/۟᩷ۖ;->ۤ:Ll/ܳۚۖ;

    if-nez v1, :cond_1

    .line 32441
    iget v1, p0, Ll/۟᩷ۖ;->᩶:I

    and-int/lit8 v1, v1, 0x10

    if-eqz v1, :cond_0

    .line 32442
    iget-object v1, p0, Ll/۟᩷ۖ;->ۛ:Ljava/util/List;

    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Ll/۟᩷ۖ;->ۛ:Ljava/util/List;

    .line 32443
    iget v1, p0, Ll/۟᩷ۖ;->᩶:I

    and-int/lit8 v1, v1, -0x11

    iput v1, p0, Ll/۟᩷ۖ;->᩶:I

    .line 32445
    :cond_0
    iget-object v1, p0, Ll/۟᩷ۖ;->ۛ:Ljava/util/List;

    invoke-static {v0, v1}, Ll/֫ۢۖ;->֫(Ll/֫ۢۖ;Ljava/util/List;)V

    goto :goto_0

    .line 32447
    :cond_1
    invoke-virtual {v1}, Ll/ܳۚۖ;->ۧ()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Ll/֫ۢۖ;->֫(Ll/֫ۢۖ;Ljava/util/List;)V

    .line 32434
    :goto_0
    iget v1, p0, Ll/۟᩷ۖ;->᩶:I

    if-eqz v1, :cond_7

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_2

    .line 32455
    iget-boolean v2, p0, Ll/۟᩷ۖ;->᩹:Z

    invoke-static {v0, v2}, Ll/֫ۢۖ;->֫(Ll/֫ۢۖ;Z)V

    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_3

    .line 32459
    iget-boolean v3, p0, Ll/۟᩷ۖ;->ۗ:Z

    invoke-static {v0, v3}, Ll/֫ۢۖ;->ۧ(Ll/֫ۢۖ;Z)V

    or-int/lit8 v2, v2, 0x2

    :cond_3
    and-int/lit8 v3, v1, 0x4

    if-eqz v3, :cond_4

    .line 32463
    iget-boolean v3, p0, Ll/۟᩷ۖ;->ۙ:Z

    invoke-static {v0, v3}, Ll/֫ۢۖ;->ܽ(Ll/֫ۢۖ;Z)V

    or-int/lit8 v2, v2, 0x4

    :cond_4
    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_6

    .line 32467
    iget-object v1, p0, Ll/۟᩷ۖ;->۬:Ll/ܺۚۖ;

    if-nez v1, :cond_5

    .line 32468
    iget-object v1, p0, Ll/۟᩷ۖ;->۫:Ll/ۛۢۖ;

    goto :goto_2

    .line 32469
    :cond_5
    invoke-virtual {v1}, Ll/ܺۚۖ;->ۧ()Ll/ۘᩴۖ;

    move-result-object v1

    check-cast v1, Ll/ۛۢۖ;

    .line 32467
    :goto_2
    invoke-static {v0, v1}, Ll/֫ۢۖ;->֫(Ll/֫ۢۖ;Ll/ۛۢۖ;)V

    or-int/lit8 v2, v2, 0x8

    .line 32472
    :cond_6
    invoke-static {v0, v2}, Ll/֫ۢۖ;->֫(Ll/֫ۢۖ;I)V

    .line 32435
    :cond_7
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onBuilt()V

    return-object v0
.end method

.method public final bridge synthetic buildPartial()Ll/ۡ֡ۖ;
    .locals 1

    .line 32353
    invoke-virtual {p0}, Ll/۟᩷ۖ;->buildPartial()Ll/֫ۢۖ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic buildPartial()Ll/᩻֡ۖ;
    .locals 1

    .line 32353
    invoke-virtual {p0}, Ll/۟᩷ۖ;->buildPartial()Ll/֫ۢۖ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic clear()Ll/ۗۘۖ;
    .locals 0

    .line 32353
    invoke-virtual {p0}, Ll/۟᩷ۖ;->ܽ()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/ۢ֡ۖ;
    .locals 0

    .line 32353
    invoke-virtual {p0}, Ll/۟᩷ۖ;->ܽ()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/ܳ֡ۖ;
    .locals 0

    .line 32353
    invoke-virtual {p0}, Ll/۟᩷ۖ;->ܽ()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/᩶ۘۖ;
    .locals 0

    .line 32353
    invoke-virtual {p0}, Ll/۟᩷ۖ;->ܽ()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/᩷ۜۖ;
    .locals 0

    .line 32353
    invoke-virtual {p0}, Ll/۟᩷ۖ;->ܽ()V

    return-object p0
.end method

.method public final getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 32418
    invoke-static {}, Ll/֫ۢۖ;->getDefaultInstance()Ll/֫ۢۖ;

    move-result-object v0

    return-object v0
.end method

.method public final getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 32418
    invoke-static {}, Ll/֫ۢۖ;->getDefaultInstance()Ll/֫ۢۖ;

    move-result-object v0

    return-object v0
.end method

.method public final getDescriptorForType()Ll/ᩳۖۖ;
    .locals 1

    .line 32413
    invoke-static {}, Ll/ۧۖۖ;->᩹()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public final internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 32366
    invoke-static {}, Ll/ۧۖۖ;->᩶()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/֫ۢۖ;

    const-class v2, Ll/۟᩷ۖ;

    .line 32367
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 3

    .line 32753
    iget v0, p0, Ll/۟᩷ۖ;->᩶:I

    and-int/lit8 v0, v0, 0x8

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 32760
    iget-object v0, p0, Ll/۟᩷ۖ;->۬:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 32761
    iget-object v0, p0, Ll/۟᩷ۖ;->۫:Ll/ۛۢۖ;

    if-nez v0, :cond_1

    invoke-static {}, Ll/ۛۢۖ;->getDefaultInstance()Ll/ۛۢۖ;

    move-result-object v0

    goto :goto_0

    .line 32763
    :cond_0
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܿ()Ll/ۘᩴۖ;

    move-result-object v0

    check-cast v0, Ll/ۛۢۖ;

    .line 32534
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ll/ۛۢۖ;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_4

    :cond_2
    const/4 v0, 0x0

    .line 32892
    :goto_1
    iget-object v2, p0, Ll/۟᩷ۖ;->ۤ:Ll/ܳۚۖ;

    if-nez v2, :cond_3

    .line 32893
    iget-object v2, p0, Ll/۟᩷ۖ;->ۛ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    goto :goto_2

    .line 32895
    :cond_3
    invoke-virtual {v2}, Ll/ܳۚۖ;->ܳ()I

    move-result v2

    :goto_2
    if-ge v0, v2, :cond_6

    .line 32902
    iget-object v2, p0, Ll/۟᩷ۖ;->ۤ:Ll/ܳۚۖ;

    if-nez v2, :cond_4

    .line 32903
    iget-object v2, p0, Ll/۟᩷ۖ;->ۛ:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫ۖۖ;

    goto :goto_3

    .line 32905
    :cond_4
    invoke-virtual {v2, v0}, Ll/ܳۚۖ;->ۧ(I)Ll/ۘᩴۖ;

    move-result-object v2

    check-cast v2, Ll/֫ۖۖ;

    .line 32539
    :goto_3
    invoke-virtual {v2}, Ll/֫ۖۖ;->isInitialized()Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_4

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 32543
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

    .line 32353
    invoke-virtual {p0, p1, p2}, Ll/۟᩷ۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/۟᩷ۖ;

    return-object p0
.end method

.method public final mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/۟᩷ۖ;
    .locals 5

    .line 32555
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :cond_0
    :goto_0
    if-nez v0, :cond_9

    .line 32560
    :try_start_0
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܶ()I

    move-result v1

    if-eqz v1, :cond_8

    const/16 v2, 0x10

    if-eq v1, v2, :cond_7

    const/16 v3, 0x18

    if-eq v1, v3, :cond_6

    const/16 v3, 0x30

    if-eq v1, v3, :cond_5

    const/16 v3, 0x3a

    if-eq v1, v3, :cond_4

    const/16 v3, 0x1f3a

    if-eq v1, v3, :cond_1

    .line 32601
    invoke-virtual {p0, p1, p2, v1}, Ll/ۗۘۖ;->parseUnknownField(Ll/۟ۜۖ;Ll/ᩳۘۖ;I)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 32590
    :cond_1
    invoke-static {}, Ll/֫ۖۖ;->parser()Ll/۫֡ۖ;

    move-result-object v1

    .line 32589
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/۫֡ۖ;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object v1

    check-cast v1, Ll/֫ۖۖ;

    .line 32592
    iget-object v3, p0, Ll/۟᩷ۖ;->ۤ:Ll/ܳۚۖ;

    if-nez v3, :cond_3

    .line 32869
    iget v3, p0, Ll/۟᩷ۖ;->᩶:I

    and-int/2addr v3, v2

    if-nez v3, :cond_2

    .line 32870
    new-instance v3, Ljava/util/ArrayList;

    iget-object v4, p0, Ll/۟᩷ۖ;->ۛ:Ljava/util/List;

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v3, p0, Ll/۟᩷ۖ;->ۛ:Ljava/util/List;

    .line 32871
    iget v3, p0, Ll/۟᩷ۖ;->᩶:I

    or-int/2addr v2, v3

    iput v2, p0, Ll/۟᩷ۖ;->᩶:I

    .line 32594
    :cond_2
    iget-object v2, p0, Ll/۟᩷ۖ;->ۛ:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 32596
    :cond_3
    invoke-virtual {v3, v1}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    goto :goto_0

    .line 32582
    :cond_4
    invoke-direct {p0}, Ll/۟᩷ۖ;->ᩳ()Ll/ܺۚۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v1

    .line 32581
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/ۢ֡ۖ;Ll/ᩳۘۖ;)V

    .line 32584
    iget v1, p0, Ll/۟᩷ۖ;->᩶:I

    or-int/lit8 v1, v1, 0x8

    iput v1, p0, Ll/۟᩷ۖ;->᩶:I

    goto :goto_0

    .line 32576
    :cond_5
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܿ()Z

    move-result v1

    iput-boolean v1, p0, Ll/۟᩷ۖ;->ۙ:Z

    .line 32577
    iget v1, p0, Ll/۟᩷ۖ;->᩶:I

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Ll/۟᩷ۖ;->᩶:I

    goto :goto_0

    .line 32571
    :cond_6
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܿ()Z

    move-result v1

    iput-boolean v1, p0, Ll/۟᩷ۖ;->ۗ:Z

    .line 32572
    iget v1, p0, Ll/۟᩷ۖ;->᩶:I

    or-int/lit8 v1, v1, 0x2

    iput v1, p0, Ll/۟᩷ۖ;->᩶:I

    goto :goto_0

    .line 32566
    :cond_7
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܿ()Z

    move-result v1

    iput-boolean v1, p0, Ll/۟᩷ۖ;->᩹:Z

    .line 32567
    iget v1, p0, Ll/۟᩷ۖ;->᩶:I

    or-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/۟᩷ۖ;->᩶:I
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

    .line 32609
    :try_start_1
    invoke-virtual {p1}, Ll/֫᩵ۖ;->֫()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32611
    :goto_2
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 32612
    throw p1

    .line 32611
    :cond_9
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 32353
    invoke-virtual {p0, p1, p2}, Ll/۟᩷ۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/۟᩷ۖ;

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 32353
    invoke-virtual {p0, p1, p2}, Ll/۟᩷ۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/۟᩷ۖ;

    return-object p0
.end method

.method public final mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;
    .locals 1

    .line 32477
    instance-of v0, p1, Ll/֫ۢۖ;

    if-eqz v0, :cond_0

    .line 32478
    check-cast p1, Ll/֫ۢۖ;

    invoke-virtual {p0, p1}, Ll/۟᩷ۖ;->֫(Ll/֫ۢۖ;)V

    return-object p0

    .line 32480
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 32353
    invoke-virtual {p0, p1, p2}, Ll/۟᩷ۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/۟᩷ۖ;

    return-object p0
.end method

.method public final mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;
    .locals 1

    .line 32477
    instance-of v0, p1, Ll/֫ۢۖ;

    if-eqz v0, :cond_0

    .line 32478
    check-cast p1, Ll/֫ۢۖ;

    invoke-virtual {p0, p1}, Ll/۟᩷ۖ;->֫(Ll/֫ۢۖ;)V

    return-object p0

    .line 32480
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public final ֫(Ll/֫ۢۖ;)V
    .locals 3

    .line 32486
    invoke-static {}, Ll/֫ۢۖ;->getDefaultInstance()Ll/֫ۢۖ;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-void

    .line 32487
    :cond_0
    invoke-virtual {p1}, Ll/֫ۢۖ;->ᩴ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 32488
    invoke-virtual {p1}, Ll/֫ۢۖ;->ۡ()Z

    move-result v0

    .line 32641
    iput-boolean v0, p0, Ll/۟᩷ۖ;->᩹:Z

    .line 32642
    iget v0, p0, Ll/۟᩷ۖ;->᩶:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/۟᩷ۖ;->᩶:I

    .line 32643
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 32490
    :cond_1
    invoke-virtual {p1}, Ll/֫ۢۖ;->᩵()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 32491
    invoke-virtual {p1}, Ll/֫ۢۖ;->ܺ()Z

    move-result v0

    .line 32681
    iput-boolean v0, p0, Ll/۟᩷ۖ;->ۗ:Z

    .line 32682
    iget v0, p0, Ll/۟᩷ۖ;->᩶:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Ll/۟᩷ۖ;->᩶:I

    .line 32683
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 32493
    :cond_2
    invoke-virtual {p1}, Ll/֫ۢۖ;->֡()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 32494
    invoke-virtual {p1}, Ll/֫ۢۖ;->ۖ()Z

    move-result v0

    .line 32727
    iput-boolean v0, p0, Ll/۟᩷ۖ;->ۙ:Z

    .line 32728
    iget v0, p0, Ll/۟᩷ۖ;->᩶:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Ll/۟᩷ۖ;->᩶:I

    .line 32729
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 32496
    :cond_3
    invoke-virtual {p1}, Ll/֫ۢۖ;->ۚ()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 32497
    invoke-virtual {p1}, Ll/֫ۢۖ;->ۘ()Ll/ۛۢۖ;

    move-result-object v0

    .line 32800
    iget-object v1, p0, Ll/۟᩷ۖ;->۬:Ll/ܺۚۖ;

    if-nez v1, :cond_5

    .line 32801
    iget v1, p0, Ll/۟᩷ۖ;->᩶:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_4

    iget-object v1, p0, Ll/۟᩷ۖ;->۫:Ll/ۛۢۖ;

    if-eqz v1, :cond_4

    .line 32803
    invoke-static {}, Ll/ۛۢۖ;->getDefaultInstance()Ll/ۛۢۖ;

    move-result-object v2

    if-eq v1, v2, :cond_4

    .line 32834
    iget v1, p0, Ll/۟᩷ۖ;->᩶:I

    or-int/lit8 v1, v1, 0x8

    iput v1, p0, Ll/۟᩷ۖ;->᩶:I

    .line 32835
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 32836
    invoke-direct {p0}, Ll/۟᩷ۖ;->ᩳ()Ll/ܺۚۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v1

    check-cast v1, Ll/֡ۢۖ;

    .line 32804
    invoke-virtual {v1, v0}, Ll/֡ۢۖ;->֫(Ll/ۛۢۖ;)Ll/֡ۢۖ;

    goto :goto_0

    .line 32806
    :cond_4
    iput-object v0, p0, Ll/۟᩷ۖ;->۫:Ll/ۛۢۖ;

    goto :goto_0

    .line 32809
    :cond_5
    invoke-virtual {v1, v0}, Ll/ܺۚۖ;->֫(Ll/ۘᩴۖ;)V

    .line 32811
    :goto_0
    iget-object v0, p0, Ll/۟᩷ۖ;->۫:Ll/ۛۢۖ;

    if-eqz v0, :cond_6

    .line 32812
    iget v0, p0, Ll/۟᩷ۖ;->᩶:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Ll/۟᩷ۖ;->᩶:I

    .line 32813
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 32499
    :cond_6
    iget-object v0, p0, Ll/۟᩷ۖ;->ۤ:Ll/ܳۚۖ;

    if-nez v0, :cond_9

    .line 32500
    invoke-static {p1}, Ll/֫ۢۖ;->֫(Ll/֫ۢۖ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_c

    .line 32501
    iget-object v0, p0, Ll/۟᩷ۖ;->ۛ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 32502
    invoke-static {p1}, Ll/֫ۢۖ;->֫(Ll/֫ۢۖ;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/۟᩷ۖ;->ۛ:Ljava/util/List;

    .line 32503
    iget v0, p0, Ll/۟᩷ۖ;->᩶:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Ll/۟᩷ۖ;->᩶:I

    goto :goto_1

    .line 32869
    :cond_7
    iget v0, p0, Ll/۟᩷ۖ;->᩶:I

    and-int/lit8 v0, v0, 0x10

    if-nez v0, :cond_8

    .line 32870
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/۟᩷ۖ;->ۛ:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ll/۟᩷ۖ;->ۛ:Ljava/util/List;

    .line 32871
    iget v0, p0, Ll/۟᩷ۖ;->᩶:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Ll/۟᩷ۖ;->᩶:I

    .line 32506
    :cond_8
    iget-object v0, p0, Ll/۟᩷ۖ;->ۛ:Ljava/util/List;

    invoke-static {p1}, Ll/֫ۢۖ;->֫(Ll/֫ۢۖ;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 32508
    :goto_1
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    goto :goto_2

    .line 32511
    :cond_9
    invoke-static {p1}, Ll/֫ۢۖ;->֫(Ll/֫ۢۖ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_c

    .line 32512
    iget-object v0, p0, Ll/۟᩷ۖ;->ۤ:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 32513
    iget-object v0, p0, Ll/۟᩷ۖ;->ۤ:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->ᩳ()V

    const/4 v0, 0x0

    .line 32514
    iput-object v0, p0, Ll/۟᩷ۖ;->ۤ:Ll/ܳۚۖ;

    .line 32515
    invoke-static {p1}, Ll/֫ۢۖ;->֫(Ll/֫ۢۖ;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Ll/۟᩷ۖ;->ۛ:Ljava/util/List;

    .line 32516
    iget v1, p0, Ll/۟᩷ۖ;->᩶:I

    and-int/lit8 v1, v1, -0x11

    iput v1, p0, Ll/۟᩷ۖ;->᩶:I

    .line 32518
    sget-boolean v1, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    if-eqz v1, :cond_a

    .line 32519
    invoke-direct {p0}, Ll/۟᩷ۖ;->ܿ()Ll/ܳۚۖ;

    move-result-object v0

    :cond_a
    iput-object v0, p0, Ll/۟᩷ۖ;->ۤ:Ll/ܳۚۖ;

    goto :goto_2

    .line 32521
    :cond_b
    iget-object v0, p0, Ll/۟᩷ۖ;->ۤ:Ll/ܳۚۖ;

    invoke-static {p1}, Ll/֫ۢۖ;->֫(Ll/֫ۢۖ;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܳۚۖ;->֫(Ljava/lang/Iterable;)V

    .line 32525
    :cond_c
    :goto_2
    invoke-virtual {p0, p1}, Ll/ۗۘۖ;->֫(Ll/۫ۘۖ;)V

    .line 32526
    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩶ۘۖ;->mergeUnknownFields(Ll/ۢ֨ۖ;)Ll/᩶ۘۖ;

    .line 32527
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-void
.end method

.method public final ܽ()V
    .locals 2

    .line 32390
    invoke-super {p0}, Ll/ۗۘۖ;->clear()Ll/ۗۘۖ;

    const/4 v0, 0x0

    .line 32391
    iput v0, p0, Ll/۟᩷ۖ;->᩶:I

    .line 32392
    iput-boolean v0, p0, Ll/۟᩷ۖ;->᩹:Z

    .line 32393
    iput-boolean v0, p0, Ll/۟᩷ۖ;->ۗ:Z

    .line 32394
    iput-boolean v0, p0, Ll/۟᩷ۖ;->ۙ:Z

    const/4 v0, 0x0

    .line 32395
    iput-object v0, p0, Ll/۟᩷ۖ;->۫:Ll/ۛۢۖ;

    .line 32396
    iget-object v1, p0, Ll/۟᩷ۖ;->۬:Ll/ܺۚۖ;

    if-eqz v1, :cond_0

    .line 32397
    invoke-virtual {v1}, Ll/ܺۚۖ;->ܽ()V

    .line 32398
    iput-object v0, p0, Ll/۟᩷ۖ;->۬:Ll/ܺۚۖ;

    .line 32400
    :cond_0
    iget-object v1, p0, Ll/۟᩷ۖ;->ۤ:Ll/ܳۚۖ;

    if-nez v1, :cond_1

    .line 32401
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/۟᩷ۖ;->ۛ:Ljava/util/List;

    goto :goto_0

    .line 32403
    :cond_1
    iput-object v0, p0, Ll/۟᩷ۖ;->ۛ:Ljava/util/List;

    .line 32404
    invoke-virtual {v1}, Ll/ܳۚۖ;->ܽ()V

    .line 32406
    :goto_0
    iget v0, p0, Ll/۟᩷ۖ;->᩶:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Ll/۟᩷ۖ;->᩶:I

    return-void
.end method
