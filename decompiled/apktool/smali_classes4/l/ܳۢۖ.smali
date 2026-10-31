.class public final Ll/ܳۢۖ;
.super Ll/ۗۘۖ;
.source "T9Q9"


# instance fields
.field public ۗ:Ll/ܺۚۖ;

.field public ۙ:Z

.field public ۛ:Ll/ܳۚۖ;

.field public ۤ:Ll/ۛۢۖ;

.field public ۨ:Ljava/util/List;

.field public ۫:Ll/ܺۚۖ;

.field public ۬:Ll/֨ۡۖ;

.field public ᩶:Z

.field public ᩹:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 33680
    invoke-direct {p0}, Ll/ۗۘۖ;-><init>()V

    .line 34257
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ܳۢۖ;->ۨ:Ljava/util/List;

    .line 33690
    sget-boolean v0, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    if-eqz v0, :cond_0

    .line 33692
    invoke-direct {p0}, Ll/ܳۢۖ;->ܿ()Ll/ܺۚۖ;

    .line 33693
    invoke-direct {p0}, Ll/ܳۢۖ;->ᩳ()Ll/ܺۚۖ;

    .line 33694
    invoke-direct {p0}, Ll/ܳۢۖ;->ܳ()Ll/ܳۚۖ;

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 33661
    invoke-direct {p0}, Ll/ܳۢۖ;-><init>()V

    return-void
.end method

.method public constructor <init>(Ll/ۢۜۖ;I)V
    .locals 0

    .line 1223
    invoke-direct {p0, p1}, Ll/᩶ۘۖ;-><init>(Ll/ۢۜۖ;)V

    .line 34257
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Ll/ܳۢۖ;->ۨ:Ljava/util/List;

    .line 33690
    sget-boolean p1, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    if-eqz p1, :cond_0

    .line 33692
    invoke-direct {p0}, Ll/ܳۢۖ;->ܿ()Ll/ܺۚۖ;

    .line 33693
    invoke-direct {p0}, Ll/ܳۢۖ;->ᩳ()Ll/ܺۚۖ;

    .line 33694
    invoke-direct {p0}, Ll/ܳۢۖ;->ܳ()Ll/ܳۚۖ;

    :cond_0
    return-void
.end method

.method private ܳ()Ll/ܳۚۖ;
    .locals 5

    .line 34484
    iget-object v0, p0, Ll/ܳۢۖ;->ۛ:Ll/ܳۚۖ;

    if-nez v0, :cond_1

    .line 34485
    new-instance v0, Ll/ܳۚۖ;

    iget-object v1, p0, Ll/ܳۢۖ;->ۨ:Ljava/util/List;

    iget v2, p0, Ll/ܳۢۖ;->᩹:I

    and-int/lit8 v2, v2, 0x10

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 34489
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v3

    .line 34490
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Ll/ܳۚۖ;-><init>(Ljava/util/List;ZLl/ۢۜۖ;Z)V

    iput-object v0, p0, Ll/ܳۢۖ;->ۛ:Ll/ܳۚۖ;

    const/4 v0, 0x0

    .line 34491
    iput-object v0, p0, Ll/ܳۢۖ;->ۨ:Ljava/util/List;

    .line 34493
    :cond_1
    iget-object v0, p0, Ll/ܳۢۖ;->ۛ:Ll/ܳۚۖ;

    return-object v0
.end method

.method private ܿ()Ll/ܺۚۖ;
    .locals 4

    .line 34084
    iget-object v0, p0, Ll/ܳۢۖ;->۫:Ll/ܺۚۖ;

    if-nez v0, :cond_2

    .line 34085
    new-instance v1, Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 33990
    iget-object v0, p0, Ll/ܳۢۖ;->ۤ:Ll/ۛۢۖ;

    if-nez v0, :cond_1

    invoke-static {}, Ll/ۛۢۖ;->getDefaultInstance()Ll/ۛۢۖ;

    move-result-object v0

    goto :goto_0

    .line 33992
    :cond_0
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܿ()Ll/ۘᩴۖ;

    move-result-object v0

    check-cast v0, Ll/ۛۢۖ;

    .line 34088
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v2

    .line 34089
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v3

    invoke-direct {v1, v0, v2, v3}, Ll/ܺۚۖ;-><init>(Ll/ۘᩴۖ;Ll/ۢۜۖ;Z)V

    iput-object v1, p0, Ll/ܳۢۖ;->۫:Ll/ܺۚۖ;

    const/4 v0, 0x0

    .line 34090
    iput-object v0, p0, Ll/ܳۢۖ;->ۤ:Ll/ۛۢۖ;

    .line 34092
    :cond_2
    iget-object v0, p0, Ll/ܳۢۖ;->۫:Ll/ܺۚۖ;

    return-object v0
.end method

.method private ᩳ()Ll/ܺۚۖ;
    .locals 4

    .line 34245
    iget-object v0, p0, Ll/ܳۢۖ;->ۗ:Ll/ܺۚۖ;

    if-nez v0, :cond_2

    .line 34246
    new-instance v1, Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 34151
    iget-object v0, p0, Ll/ܳۢۖ;->۬:Ll/֨ۡۖ;

    if-nez v0, :cond_1

    invoke-static {}, Ll/֨ۡۖ;->getDefaultInstance()Ll/֨ۡۖ;

    move-result-object v0

    goto :goto_0

    .line 34153
    :cond_0
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܿ()Ll/ۘᩴۖ;

    move-result-object v0

    check-cast v0, Ll/֨ۡۖ;

    .line 34249
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v2

    .line 34250
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v3

    invoke-direct {v1, v0, v2, v3}, Ll/ܺۚۖ;-><init>(Ll/ۘᩴۖ;Ll/ۢۜۖ;Z)V

    iput-object v1, p0, Ll/ܳۢۖ;->ۗ:Ll/ܺۚۖ;

    const/4 v0, 0x0

    .line 34251
    iput-object v0, p0, Ll/ܳۢۖ;->۬:Ll/֨ۡۖ;

    .line 34253
    :cond_2
    iget-object v0, p0, Ll/ܳۢۖ;->ۗ:Ll/ܺۚۖ;

    return-object v0
.end method


# virtual methods
.method public final build()Ll/ۡ֡ۖ;
    .locals 2

    .line 33736
    invoke-virtual {p0}, Ll/ܳۢۖ;->buildPartial()Ll/᩻ۢۖ;

    move-result-object v0

    .line 33737
    invoke-virtual {v0}, Ll/᩻ۢۖ;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 33738
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public final build()Ll/᩻֡ۖ;
    .locals 2

    .line 33736
    invoke-virtual {p0}, Ll/ܳۢۖ;->buildPartial()Ll/᩻ۢۖ;

    move-result-object v0

    .line 33737
    invoke-virtual {v0}, Ll/᩻ۢۖ;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 33738
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public final bridge synthetic buildPartial()Ll/ۡ֡ۖ;
    .locals 1

    .line 33661
    invoke-virtual {p0}, Ll/ܳۢۖ;->buildPartial()Ll/᩻ۢۖ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic buildPartial()Ll/᩻֡ۖ;
    .locals 1

    .line 33661
    invoke-virtual {p0}, Ll/ܳۢۖ;->buildPartial()Ll/᩻ۢۖ;

    move-result-object v0

    return-object v0
.end method

.method public final buildPartial()Ll/᩻ۢۖ;
    .locals 4

    .line 33745
    new-instance v0, Ll/᩻ۢۖ;

    invoke-direct {v0, p0}, Ll/᩻ۢۖ;-><init>(Ll/ܳۢۖ;)V

    .line 33753
    iget-object v1, p0, Ll/ܳۢۖ;->ۛ:Ll/ܳۚۖ;

    if-nez v1, :cond_1

    .line 33754
    iget v1, p0, Ll/ܳۢۖ;->᩹:I

    and-int/lit8 v1, v1, 0x10

    if-eqz v1, :cond_0

    .line 33755
    iget-object v1, p0, Ll/ܳۢۖ;->ۨ:Ljava/util/List;

    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Ll/ܳۢۖ;->ۨ:Ljava/util/List;

    .line 33756
    iget v1, p0, Ll/ܳۢۖ;->᩹:I

    and-int/lit8 v1, v1, -0x11

    iput v1, p0, Ll/ܳۢۖ;->᩹:I

    .line 33758
    :cond_0
    iget-object v1, p0, Ll/ܳۢۖ;->ۨ:Ljava/util/List;

    invoke-static {v0, v1}, Ll/᩻ۢۖ;->֫(Ll/᩻ۢۖ;Ljava/util/List;)V

    goto :goto_0

    .line 33760
    :cond_1
    invoke-virtual {v1}, Ll/ܳۚۖ;->ۧ()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Ll/᩻ۢۖ;->֫(Ll/᩻ۢۖ;Ljava/util/List;)V

    .line 33747
    :goto_0
    iget v1, p0, Ll/ܳۢۖ;->᩹:I

    if-eqz v1, :cond_8

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_2

    .line 33768
    iget-boolean v2, p0, Ll/ܳۢۖ;->ۙ:Z

    invoke-static {v0, v2}, Ll/᩻ۢۖ;->֫(Ll/᩻ۢۖ;Z)V

    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_4

    .line 33772
    iget-object v3, p0, Ll/ܳۢۖ;->۫:Ll/ܺۚۖ;

    if-nez v3, :cond_3

    .line 33773
    iget-object v3, p0, Ll/ܳۢۖ;->ۤ:Ll/ۛۢۖ;

    goto :goto_2

    .line 33774
    :cond_3
    invoke-virtual {v3}, Ll/ܺۚۖ;->ۧ()Ll/ۘᩴۖ;

    move-result-object v3

    check-cast v3, Ll/ۛۢۖ;

    .line 33772
    :goto_2
    invoke-static {v0, v3}, Ll/᩻ۢۖ;->֫(Ll/᩻ۢۖ;Ll/ۛۢۖ;)V

    or-int/lit8 v2, v2, 0x2

    :cond_4
    and-int/lit8 v3, v1, 0x4

    if-eqz v3, :cond_5

    .line 33778
    iget-boolean v3, p0, Ll/ܳۢۖ;->᩶:Z

    invoke-static {v0, v3}, Ll/᩻ۢۖ;->ۧ(Ll/᩻ۢۖ;Z)V

    or-int/lit8 v2, v2, 0x4

    :cond_5
    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_7

    .line 33782
    iget-object v1, p0, Ll/ܳۢۖ;->ۗ:Ll/ܺۚۖ;

    if-nez v1, :cond_6

    .line 33783
    iget-object v1, p0, Ll/ܳۢۖ;->۬:Ll/֨ۡۖ;

    goto :goto_3

    .line 33784
    :cond_6
    invoke-virtual {v1}, Ll/ܺۚۖ;->ۧ()Ll/ۘᩴۖ;

    move-result-object v1

    check-cast v1, Ll/֨ۡۖ;

    .line 33782
    :goto_3
    invoke-static {v0, v1}, Ll/᩻ۢۖ;->֫(Ll/᩻ۢۖ;Ll/֨ۡۖ;)V

    or-int/lit8 v2, v2, 0x8

    .line 33787
    :cond_7
    invoke-static {v0, v2}, Ll/᩻ۢۖ;->֫(Ll/᩻ۢۖ;I)V

    .line 33748
    :cond_8
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onBuilt()V

    return-object v0
.end method

.method public final bridge synthetic clear()Ll/ۗۘۖ;
    .locals 0

    .line 33661
    invoke-virtual {p0}, Ll/ܳۢۖ;->ܽ()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/ۢ֡ۖ;
    .locals 0

    .line 33661
    invoke-virtual {p0}, Ll/ܳۢۖ;->ܽ()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/ܳ֡ۖ;
    .locals 0

    .line 33661
    invoke-virtual {p0}, Ll/ܳۢۖ;->ܽ()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/᩶ۘۖ;
    .locals 0

    .line 33661
    invoke-virtual {p0}, Ll/ܳۢۖ;->ܽ()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/᩷ۜۖ;
    .locals 0

    .line 33661
    invoke-virtual {p0}, Ll/ܳۢۖ;->ܽ()V

    return-object p0
.end method

.method public final getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 33731
    invoke-static {}, Ll/᩻ۢۖ;->getDefaultInstance()Ll/᩻ۢۖ;

    move-result-object v0

    return-object v0
.end method

.method public final getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 33731
    invoke-static {}, Ll/᩻ۢۖ;->getDefaultInstance()Ll/᩻ۢۖ;

    move-result-object v0

    return-object v0
.end method

.method public final getDescriptorForType()Ll/ᩳۖۖ;
    .locals 1

    .line 33726
    invoke-static {}, Ll/ۧۖۖ;->ۗ()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public final internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 33674
    invoke-static {}, Ll/ۧۖۖ;->۬()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/᩻ۢۖ;

    const-class v2, Ll/ܳۢۖ;

    .line 33675
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 3

    .line 33982
    iget v0, p0, Ll/ܳۢۖ;->᩹:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 33989
    iget-object v0, p0, Ll/ܳۢۖ;->۫:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 33990
    iget-object v0, p0, Ll/ܳۢۖ;->ۤ:Ll/ۛۢۖ;

    if-nez v0, :cond_1

    invoke-static {}, Ll/ۛۢۖ;->getDefaultInstance()Ll/ۛۢۖ;

    move-result-object v0

    goto :goto_0

    .line 33992
    :cond_0
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܿ()Ll/ۘᩴۖ;

    move-result-object v0

    check-cast v0, Ll/ۛۢۖ;

    .line 33849
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ll/ۛۢۖ;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_4

    :cond_2
    const/4 v0, 0x0

    .line 34282
    :goto_1
    iget-object v2, p0, Ll/ܳۢۖ;->ۛ:Ll/ܳۚۖ;

    if-nez v2, :cond_3

    .line 34283
    iget-object v2, p0, Ll/ܳۢۖ;->ۨ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    goto :goto_2

    .line 34285
    :cond_3
    invoke-virtual {v2}, Ll/ܳۚۖ;->ܳ()I

    move-result v2

    :goto_2
    if-ge v0, v2, :cond_6

    .line 34292
    iget-object v2, p0, Ll/ܳۢۖ;->ۛ:Ll/ܳۚۖ;

    if-nez v2, :cond_4

    .line 34293
    iget-object v2, p0, Ll/ܳۢۖ;->ۨ:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫ۖۖ;

    goto :goto_3

    .line 34295
    :cond_4
    invoke-virtual {v2, v0}, Ll/ܳۚۖ;->ۧ(I)Ll/ۘᩴۖ;

    move-result-object v2

    check-cast v2, Ll/֫ۖۖ;

    .line 33854
    :goto_3
    invoke-virtual {v2}, Ll/֫ۖۖ;->isInitialized()Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_4

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 33858
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

    .line 33661
    invoke-virtual {p0, p1, p2}, Ll/ܳۢۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܳۢۖ;

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 33661
    invoke-virtual {p0, p1, p2}, Ll/ܳۢۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܳۢۖ;

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 33661
    invoke-virtual {p0, p1, p2}, Ll/ܳۢۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܳۢۖ;

    return-object p0
.end method

.method public final mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;
    .locals 1

    .line 33792
    instance-of v0, p1, Ll/᩻ۢۖ;

    if-eqz v0, :cond_0

    .line 33793
    check-cast p1, Ll/᩻ۢۖ;

    invoke-virtual {p0, p1}, Ll/ܳۢۖ;->֫(Ll/᩻ۢۖ;)V

    return-object p0

    .line 33795
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public final mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܳۢۖ;
    .locals 4

    .line 33870
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :cond_0
    :goto_0
    if-nez v0, :cond_9

    .line 33875
    :try_start_0
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܶ()I

    move-result v1

    if-eqz v1, :cond_8

    const/16 v2, 0x8

    if-eq v1, v2, :cond_7

    const/16 v3, 0x12

    if-eq v1, v3, :cond_6

    const/16 v3, 0x18

    if-eq v1, v3, :cond_5

    const/16 v3, 0x22

    if-eq v1, v3, :cond_4

    const/16 v2, 0x1f3a

    if-eq v1, v2, :cond_1

    .line 33918
    invoke-virtual {p0, p1, p2, v1}, Ll/ۗۘۖ;->parseUnknownField(Ll/۟ۜۖ;Ll/ᩳۘۖ;I)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 33907
    :cond_1
    invoke-static {}, Ll/֫ۖۖ;->parser()Ll/۫֡ۖ;

    move-result-object v1

    .line 33906
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/۫֡ۖ;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object v1

    check-cast v1, Ll/֫ۖۖ;

    .line 33909
    iget-object v2, p0, Ll/ܳۢۖ;->ۛ:Ll/ܳۚۖ;

    if-nez v2, :cond_3

    .line 34259
    iget v2, p0, Ll/ܳۢۖ;->᩹:I

    and-int/lit8 v2, v2, 0x10

    if-nez v2, :cond_2

    .line 34260
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Ll/ܳۢۖ;->ۨ:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, p0, Ll/ܳۢۖ;->ۨ:Ljava/util/List;

    .line 34261
    iget v2, p0, Ll/ܳۢۖ;->᩹:I

    or-int/lit8 v2, v2, 0x10

    iput v2, p0, Ll/ܳۢۖ;->᩹:I

    .line 33911
    :cond_2
    iget-object v2, p0, Ll/ܳۢۖ;->ۨ:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 33913
    :cond_3
    invoke-virtual {v2, v1}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    goto :goto_0

    .line 33899
    :cond_4
    invoke-direct {p0}, Ll/ܳۢۖ;->ᩳ()Ll/ܺۚۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v1

    .line 33898
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/ۢ֡ۖ;Ll/ᩳۘۖ;)V

    .line 33901
    iget v1, p0, Ll/ܳۢۖ;->᩹:I

    or-int/2addr v1, v2

    iput v1, p0, Ll/ܳۢۖ;->᩹:I

    goto :goto_0

    .line 33893
    :cond_5
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܿ()Z

    move-result v1

    iput-boolean v1, p0, Ll/ܳۢۖ;->᩶:Z

    .line 33894
    iget v1, p0, Ll/ܳۢۖ;->᩹:I

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Ll/ܳۢۖ;->᩹:I

    goto :goto_0

    .line 33887
    :cond_6
    invoke-direct {p0}, Ll/ܳۢۖ;->ܿ()Ll/ܺۚۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v1

    .line 33886
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/ۢ֡ۖ;Ll/ᩳۘۖ;)V

    .line 33889
    iget v1, p0, Ll/ܳۢۖ;->᩹:I

    or-int/lit8 v1, v1, 0x2

    iput v1, p0, Ll/ܳۢۖ;->᩹:I

    goto :goto_0

    .line 33881
    :cond_7
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܿ()Z

    move-result v1

    iput-boolean v1, p0, Ll/ܳۢۖ;->ۙ:Z

    .line 33882
    iget v1, p0, Ll/ܳۢۖ;->᩹:I

    or-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ܳۢۖ;->᩹:I
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

    .line 33926
    :try_start_1
    invoke-virtual {p1}, Ll/֫᩵ۖ;->֫()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33928
    :goto_2
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 33929
    throw p1

    .line 33928
    :cond_9
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 33661
    invoke-virtual {p0, p1, p2}, Ll/ܳۢۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܳۢۖ;

    return-object p0
.end method

.method public final mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;
    .locals 1

    .line 33792
    instance-of v0, p1, Ll/᩻ۢۖ;

    if-eqz v0, :cond_0

    .line 33793
    check-cast p1, Ll/᩻ۢۖ;

    invoke-virtual {p0, p1}, Ll/ܳۢۖ;->֫(Ll/᩻ۢۖ;)V

    return-object p0

    .line 33795
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public final ֫(Ll/᩻ۢۖ;)V
    .locals 3

    .line 33801
    invoke-static {}, Ll/᩻ۢۖ;->getDefaultInstance()Ll/᩻ۢۖ;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-void

    .line 33802
    :cond_0
    invoke-virtual {p1}, Ll/᩻ۢۖ;->᩵()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 33803
    invoke-virtual {p1}, Ll/᩻ۢۖ;->ܺ()Z

    move-result v0

    .line 33958
    iput-boolean v0, p0, Ll/ܳۢۖ;->ۙ:Z

    .line 33959
    iget v0, p0, Ll/ܳۢۖ;->᩹:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܳۢۖ;->᩹:I

    .line 33960
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 33805
    :cond_1
    invoke-virtual {p1}, Ll/᩻ۢۖ;->ۚ()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 33806
    invoke-virtual {p1}, Ll/᩻ۢۖ;->ۘ()Ll/ۛۢۖ;

    move-result-object v0

    .line 34029
    iget-object v1, p0, Ll/ܳۢۖ;->۫:Ll/ܺۚۖ;

    if-nez v1, :cond_3

    .line 34030
    iget v1, p0, Ll/ܳۢۖ;->᩹:I

    and-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/ܳۢۖ;->ۤ:Ll/ۛۢۖ;

    if-eqz v1, :cond_2

    .line 34032
    invoke-static {}, Ll/ۛۢۖ;->getDefaultInstance()Ll/ۛۢۖ;

    move-result-object v2

    if-eq v1, v2, :cond_2

    .line 34063
    iget v1, p0, Ll/ܳۢۖ;->᩹:I

    or-int/lit8 v1, v1, 0x2

    iput v1, p0, Ll/ܳۢۖ;->᩹:I

    .line 34064
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 34065
    invoke-direct {p0}, Ll/ܳۢۖ;->ܿ()Ll/ܺۚۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v1

    check-cast v1, Ll/֡ۢۖ;

    .line 34033
    invoke-virtual {v1, v0}, Ll/֡ۢۖ;->֫(Ll/ۛۢۖ;)Ll/֡ۢۖ;

    goto :goto_0

    .line 34035
    :cond_2
    iput-object v0, p0, Ll/ܳۢۖ;->ۤ:Ll/ۛۢۖ;

    goto :goto_0

    .line 34038
    :cond_3
    invoke-virtual {v1, v0}, Ll/ܺۚۖ;->֫(Ll/ۘᩴۖ;)V

    .line 34040
    :goto_0
    iget-object v0, p0, Ll/ܳۢۖ;->ۤ:Ll/ۛۢۖ;

    if-eqz v0, :cond_4

    .line 34041
    iget v0, p0, Ll/ܳۢۖ;->᩹:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Ll/ܳۢۖ;->᩹:I

    .line 34042
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 33808
    :cond_4
    invoke-virtual {p1}, Ll/᩻ۢۖ;->ᩴ()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 33809
    invoke-virtual {p1}, Ll/᩻ۢۖ;->ۡ()Z

    move-result v0

    .line 34119
    iput-boolean v0, p0, Ll/ܳۢۖ;->᩶:Z

    .line 34120
    iget v0, p0, Ll/ܳۢۖ;->᩹:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Ll/ܳۢۖ;->᩹:I

    .line 34121
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 33811
    :cond_5
    invoke-virtual {p1}, Ll/᩻ۢۖ;->֡()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 33812
    invoke-virtual {p1}, Ll/᩻ۢۖ;->ۖ()Ll/֨ۡۖ;

    move-result-object v0

    .line 34190
    iget-object v1, p0, Ll/ܳۢۖ;->ۗ:Ll/ܺۚۖ;

    if-nez v1, :cond_7

    .line 34191
    iget v1, p0, Ll/ܳۢۖ;->᩹:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_6

    iget-object v1, p0, Ll/ܳۢۖ;->۬:Ll/֨ۡۖ;

    if-eqz v1, :cond_6

    .line 34193
    invoke-static {}, Ll/֨ۡۖ;->getDefaultInstance()Ll/֨ۡۖ;

    move-result-object v2

    if-eq v1, v2, :cond_6

    .line 34224
    iget v1, p0, Ll/ܳۢۖ;->᩹:I

    or-int/lit8 v1, v1, 0x8

    iput v1, p0, Ll/ܳۢۖ;->᩹:I

    .line 34225
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 34226
    invoke-direct {p0}, Ll/ܳۢۖ;->ᩳ()Ll/ܺۚۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v1

    check-cast v1, Ll/ۚۡۖ;

    .line 34194
    invoke-virtual {v1, v0}, Ll/ۚۡۖ;->֫(Ll/֨ۡۖ;)V

    goto :goto_1

    .line 34196
    :cond_6
    iput-object v0, p0, Ll/ܳۢۖ;->۬:Ll/֨ۡۖ;

    goto :goto_1

    .line 34199
    :cond_7
    invoke-virtual {v1, v0}, Ll/ܺۚۖ;->֫(Ll/ۘᩴۖ;)V

    .line 34201
    :goto_1
    iget-object v0, p0, Ll/ܳۢۖ;->۬:Ll/֨ۡۖ;

    if-eqz v0, :cond_8

    .line 34202
    iget v0, p0, Ll/ܳۢۖ;->᩹:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Ll/ܳۢۖ;->᩹:I

    .line 34203
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 33814
    :cond_8
    iget-object v0, p0, Ll/ܳۢۖ;->ۛ:Ll/ܳۚۖ;

    if-nez v0, :cond_b

    .line 33815
    invoke-static {p1}, Ll/᩻ۢۖ;->֫(Ll/᩻ۢۖ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_e

    .line 33816
    iget-object v0, p0, Ll/ܳۢۖ;->ۨ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 33817
    invoke-static {p1}, Ll/᩻ۢۖ;->֫(Ll/᩻ۢۖ;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ܳۢۖ;->ۨ:Ljava/util/List;

    .line 33818
    iget v0, p0, Ll/ܳۢۖ;->᩹:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Ll/ܳۢۖ;->᩹:I

    goto :goto_2

    .line 34259
    :cond_9
    iget v0, p0, Ll/ܳۢۖ;->᩹:I

    and-int/lit8 v0, v0, 0x10

    if-nez v0, :cond_a

    .line 34260
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ܳۢۖ;->ۨ:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ll/ܳۢۖ;->ۨ:Ljava/util/List;

    .line 34261
    iget v0, p0, Ll/ܳۢۖ;->᩹:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Ll/ܳۢۖ;->᩹:I

    .line 33821
    :cond_a
    iget-object v0, p0, Ll/ܳۢۖ;->ۨ:Ljava/util/List;

    invoke-static {p1}, Ll/᩻ۢۖ;->֫(Ll/᩻ۢۖ;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 33823
    :goto_2
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    goto :goto_3

    .line 33826
    :cond_b
    invoke-static {p1}, Ll/᩻ۢۖ;->֫(Ll/᩻ۢۖ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_e

    .line 33827
    iget-object v0, p0, Ll/ܳۢۖ;->ۛ:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 33828
    iget-object v0, p0, Ll/ܳۢۖ;->ۛ:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->ᩳ()V

    const/4 v0, 0x0

    .line 33829
    iput-object v0, p0, Ll/ܳۢۖ;->ۛ:Ll/ܳۚۖ;

    .line 33830
    invoke-static {p1}, Ll/᩻ۢۖ;->֫(Ll/᩻ۢۖ;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Ll/ܳۢۖ;->ۨ:Ljava/util/List;

    .line 33831
    iget v1, p0, Ll/ܳۢۖ;->᩹:I

    and-int/lit8 v1, v1, -0x11

    iput v1, p0, Ll/ܳۢۖ;->᩹:I

    .line 33833
    sget-boolean v1, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    if-eqz v1, :cond_c

    .line 33834
    invoke-direct {p0}, Ll/ܳۢۖ;->ܳ()Ll/ܳۚۖ;

    move-result-object v0

    :cond_c
    iput-object v0, p0, Ll/ܳۢۖ;->ۛ:Ll/ܳۚۖ;

    goto :goto_3

    .line 33836
    :cond_d
    iget-object v0, p0, Ll/ܳۢۖ;->ۛ:Ll/ܳۚۖ;

    invoke-static {p1}, Ll/᩻ۢۖ;->֫(Ll/᩻ۢۖ;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܳۚۖ;->֫(Ljava/lang/Iterable;)V

    .line 33840
    :cond_e
    :goto_3
    invoke-virtual {p0, p1}, Ll/ۗۘۖ;->֫(Ll/۫ۘۖ;)V

    .line 33841
    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩶ۘۖ;->mergeUnknownFields(Ll/ۢ֨ۖ;)Ll/᩶ۘۖ;

    .line 33842
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-void
.end method

.method public final ܽ()V
    .locals 3

    .line 33699
    invoke-super {p0}, Ll/ۗۘۖ;->clear()Ll/ۗۘۖ;

    const/4 v0, 0x0

    .line 33700
    iput v0, p0, Ll/ܳۢۖ;->᩹:I

    .line 33701
    iput-boolean v0, p0, Ll/ܳۢۖ;->ۙ:Z

    const/4 v1, 0x0

    .line 33702
    iput-object v1, p0, Ll/ܳۢۖ;->ۤ:Ll/ۛۢۖ;

    .line 33703
    iget-object v2, p0, Ll/ܳۢۖ;->۫:Ll/ܺۚۖ;

    if-eqz v2, :cond_0

    .line 33704
    invoke-virtual {v2}, Ll/ܺۚۖ;->ܽ()V

    .line 33705
    iput-object v1, p0, Ll/ܳۢۖ;->۫:Ll/ܺۚۖ;

    .line 33707
    :cond_0
    iput-boolean v0, p0, Ll/ܳۢۖ;->᩶:Z

    .line 33708
    iput-object v1, p0, Ll/ܳۢۖ;->۬:Ll/֨ۡۖ;

    .line 33709
    iget-object v0, p0, Ll/ܳۢۖ;->ۗ:Ll/ܺۚۖ;

    if-eqz v0, :cond_1

    .line 33710
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܽ()V

    .line 33711
    iput-object v1, p0, Ll/ܳۢۖ;->ۗ:Ll/ܺۚۖ;

    .line 33713
    :cond_1
    iget-object v0, p0, Ll/ܳۢۖ;->ۛ:Ll/ܳۚۖ;

    if-nez v0, :cond_2

    .line 33714
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ܳۢۖ;->ۨ:Ljava/util/List;

    goto :goto_0

    .line 33716
    :cond_2
    iput-object v1, p0, Ll/ܳۢۖ;->ۨ:Ljava/util/List;

    .line 33717
    invoke-virtual {v0}, Ll/ܳۚۖ;->ܽ()V

    .line 33719
    :goto_0
    iget v0, p0, Ll/ܳۢۖ;->᩹:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Ll/ܳۢۖ;->᩹:I

    return-void
.end method
