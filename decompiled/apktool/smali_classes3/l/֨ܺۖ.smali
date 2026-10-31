.class public final Ll/֨ܺۖ;
.super Ll/᩶ۘۖ;
.source "T9Q9"

# interfaces
.implements Ll/ۘ֡ۖ;


# instance fields
.field public ۗ:Ll/ܺۚۖ;

.field public ۙ:Ljava/lang/Object;

.field public ۬:Ll/᩹ܺۖ;

.field public ᩶:Ljava/util/List;

.field public ᩸:I

.field public ᩹:Ll/ܳۚۖ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18813
    invoke-direct {p0}, Ll/᩶ۘۖ;-><init>()V

    const-string v0, ""

    .line 19030
    iput-object v0, p0, Ll/֨ܺۖ;->ۙ:Ljava/lang/Object;

    .line 19111
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/֨ܺۖ;->᩶:Ljava/util/List;

    .line 18823
    sget-boolean v0, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    if-eqz v0, :cond_0

    .line 18825
    invoke-direct {p0}, Ll/֨ܺۖ;->ܽ()Ll/ܳۚۖ;

    .line 18826
    invoke-direct {p0}, Ll/֨ܺۖ;->ᩳ()Ll/ܺۚۖ;

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 18795
    invoke-direct {p0}, Ll/֨ܺۖ;-><init>()V

    return-void
.end method

.method public constructor <init>(Ll/ۢۜۖ;I)V
    .locals 0

    .line 18819
    invoke-direct {p0, p1}, Ll/᩶ۘۖ;-><init>(Ll/ۢۜۖ;)V

    const-string p1, ""

    .line 19030
    iput-object p1, p0, Ll/֨ܺۖ;->ۙ:Ljava/lang/Object;

    .line 19111
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Ll/֨ܺۖ;->᩶:Ljava/util/List;

    .line 18823
    sget-boolean p1, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    if-eqz p1, :cond_0

    .line 18825
    invoke-direct {p0}, Ll/֨ܺۖ;->ܽ()Ll/ܳۚۖ;

    .line 18826
    invoke-direct {p0}, Ll/֨ܺۖ;->ᩳ()Ll/ܺۚۖ;

    :cond_0
    return-void
.end method

.method private ܽ()Ll/ܳۚۖ;
    .locals 5

    .line 19338
    iget-object v0, p0, Ll/֨ܺۖ;->᩹:Ll/ܳۚۖ;

    if-nez v0, :cond_1

    .line 19339
    new-instance v0, Ll/ܳۚۖ;

    iget-object v1, p0, Ll/֨ܺۖ;->᩶:Ljava/util/List;

    iget v2, p0, Ll/֨ܺۖ;->᩸:I

    and-int/lit8 v2, v2, 0x2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 19343
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v3

    .line 19344
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Ll/ܳۚۖ;-><init>(Ljava/util/List;ZLl/ۢۜۖ;Z)V

    iput-object v0, p0, Ll/֨ܺۖ;->᩹:Ll/ܳۚۖ;

    const/4 v0, 0x0

    .line 19345
    iput-object v0, p0, Ll/֨ܺۖ;->᩶:Ljava/util/List;

    .line 19347
    :cond_1
    iget-object v0, p0, Ll/֨ܺۖ;->᩹:Ll/ܳۚۖ;

    return-object v0
.end method

.method private ᩳ()Ll/ܺۚۖ;
    .locals 4

    .line 19460
    iget-object v0, p0, Ll/֨ܺۖ;->ۗ:Ll/ܺۚۖ;

    if-nez v0, :cond_2

    .line 19461
    new-instance v1, Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 19366
    iget-object v0, p0, Ll/֨ܺۖ;->۬:Ll/᩹ܺۖ;

    if-nez v0, :cond_1

    invoke-static {}, Ll/᩹ܺۖ;->getDefaultInstance()Ll/᩹ܺۖ;

    move-result-object v0

    goto :goto_0

    .line 19368
    :cond_0
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܿ()Ll/ۘᩴۖ;

    move-result-object v0

    check-cast v0, Ll/᩹ܺۖ;

    .line 19464
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v2

    .line 19465
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v3

    invoke-direct {v1, v0, v2, v3}, Ll/ܺۚۖ;-><init>(Ll/ۘᩴۖ;Ll/ۢۜۖ;Z)V

    iput-object v1, p0, Ll/֨ܺۖ;->ۗ:Ll/ܺۚۖ;

    const/4 v0, 0x0

    .line 19466
    iput-object v0, p0, Ll/֨ܺۖ;->۬:Ll/᩹ܺۖ;

    .line 19468
    :cond_2
    iget-object v0, p0, Ll/֨ܺۖ;->ۗ:Ll/ܺۚۖ;

    return-object v0
.end method


# virtual methods
.method public final build()Ll/ۡ֡ۖ;
    .locals 2

    .line 18862
    invoke-virtual {p0}, Ll/֨ܺۖ;->buildPartial()Ll/۠ܺۖ;

    move-result-object v0

    .line 18863
    invoke-virtual {v0}, Ll/۠ܺۖ;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 18864
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public final build()Ll/᩻֡ۖ;
    .locals 2

    .line 18862
    invoke-virtual {p0}, Ll/֨ܺۖ;->buildPartial()Ll/۠ܺۖ;

    move-result-object v0

    .line 18863
    invoke-virtual {v0}, Ll/۠ܺۖ;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 18864
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public final buildPartial()Ll/۠ܺۖ;
    .locals 4

    .line 18871
    new-instance v0, Ll/۠ܺۖ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll/۠ܺۖ;-><init>(Ll/֨ܺۖ;I)V

    .line 18879
    iget-object v2, p0, Ll/֨ܺۖ;->᩹:Ll/ܳۚۖ;

    if-nez v2, :cond_1

    .line 18880
    iget v2, p0, Ll/֨ܺۖ;->᩸:I

    and-int/lit8 v2, v2, 0x2

    if-eqz v2, :cond_0

    .line 18881
    iget-object v2, p0, Ll/֨ܺۖ;->᩶:Ljava/util/List;

    invoke-static {v2}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Ll/֨ܺۖ;->᩶:Ljava/util/List;

    .line 18882
    iget v2, p0, Ll/֨ܺۖ;->᩸:I

    and-int/lit8 v2, v2, -0x3

    iput v2, p0, Ll/֨ܺۖ;->᩸:I

    .line 18884
    :cond_0
    iget-object v2, p0, Ll/֨ܺۖ;->᩶:Ljava/util/List;

    invoke-static {v0, v2}, Ll/۠ܺۖ;->֫(Ll/۠ܺۖ;Ljava/util/List;)V

    goto :goto_0

    .line 18886
    :cond_1
    invoke-virtual {v2}, Ll/ܳۚۖ;->ۧ()Ljava/util/List;

    move-result-object v2

    invoke-static {v0, v2}, Ll/۠ܺۖ;->֫(Ll/۠ܺۖ;Ljava/util/List;)V

    .line 18873
    :goto_0
    iget v2, p0, Ll/֨ܺۖ;->᩸:I

    if-eqz v2, :cond_5

    and-int/lit8 v3, v2, 0x1

    if-eqz v3, :cond_2

    .line 18894
    iget-object v1, p0, Ll/֨ܺۖ;->ۙ:Ljava/lang/Object;

    invoke-static {v0, v1}, Ll/۠ܺۖ;->֫(Ll/۠ܺۖ;Ljava/lang/Object;)V

    const/4 v1, 0x1

    :cond_2
    and-int/lit8 v2, v2, 0x4

    if-eqz v2, :cond_4

    .line 18898
    iget-object v2, p0, Ll/֨ܺۖ;->ۗ:Ll/ܺۚۖ;

    if-nez v2, :cond_3

    .line 18899
    iget-object v2, p0, Ll/֨ܺۖ;->۬:Ll/᩹ܺۖ;

    goto :goto_1

    .line 18900
    :cond_3
    invoke-virtual {v2}, Ll/ܺۚۖ;->ۧ()Ll/ۘᩴۖ;

    move-result-object v2

    check-cast v2, Ll/᩹ܺۖ;

    .line 18898
    :goto_1
    invoke-static {v0, v2}, Ll/۠ܺۖ;->֫(Ll/۠ܺۖ;Ll/᩹ܺۖ;)V

    or-int/lit8 v1, v1, 0x2

    .line 18903
    :cond_4
    invoke-static {v0, v1}, Ll/۠ܺۖ;->֫(Ll/۠ܺۖ;I)V

    .line 18874
    :cond_5
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onBuilt()V

    return-object v0
.end method

.method public final bridge synthetic buildPartial()Ll/ۡ֡ۖ;
    .locals 1

    .line 18795
    invoke-virtual {p0}, Ll/֨ܺۖ;->buildPartial()Ll/۠ܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic buildPartial()Ll/᩻֡ۖ;
    .locals 1

    .line 18795
    invoke-virtual {p0}, Ll/֨ܺۖ;->buildPartial()Ll/۠ܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic clear()Ll/ۢ֡ۖ;
    .locals 0

    .line 18795
    invoke-virtual {p0}, Ll/֨ܺۖ;->֫()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/ܳ֡ۖ;
    .locals 0

    .line 18795
    invoke-virtual {p0}, Ll/֨ܺۖ;->֫()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/᩶ۘۖ;
    .locals 0

    .line 18795
    invoke-virtual {p0}, Ll/֨ܺۖ;->֫()V

    return-object p0
.end method

.method public final bridge synthetic clear()Ll/᩷ۜۖ;
    .locals 0

    .line 18795
    invoke-virtual {p0}, Ll/֨ܺۖ;->֫()V

    return-object p0
.end method

.method public final getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 18857
    invoke-static {}, Ll/۠ܺۖ;->getDefaultInstance()Ll/۠ܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public final getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 18857
    invoke-static {}, Ll/۠ܺۖ;->getDefaultInstance()Ll/۠ܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public final getDescriptorForType()Ll/ᩳۖۖ;
    .locals 1

    .line 18852
    invoke-static {}, Ll/ۧۖۖ;->᩻()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public final internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 18807
    invoke-static {}, Ll/ۧۖۖ;->ۜ()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/۠ܺۖ;

    const-class v2, Ll/֨ܺۖ;

    .line 18808
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 19136
    :goto_0
    iget-object v2, p0, Ll/֨ܺۖ;->᩹:Ll/ܳۚۖ;

    if-nez v2, :cond_0

    .line 19137
    iget-object v2, p0, Ll/֨ܺۖ;->᩶:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    goto :goto_1

    .line 19139
    :cond_0
    invoke-virtual {v2}, Ll/ܳۚۖ;->ܳ()I

    move-result v2

    :goto_1
    if-ge v1, v2, :cond_3

    .line 19146
    iget-object v2, p0, Ll/֨ܺۖ;->᩹:Ll/ܳۚۖ;

    if-nez v2, :cond_1

    .line 19147
    iget-object v2, p0, Ll/֨ܺۖ;->᩶:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳܺۖ;

    goto :goto_2

    .line 19149
    :cond_1
    invoke-virtual {v2, v1}, Ll/ܳۚۖ;->ۧ(I)Ll/ۘᩴۖ;

    move-result-object v2

    check-cast v2, Ll/ܳܺۖ;

    .line 18960
    :goto_2
    invoke-virtual {v2}, Ll/ܳܺۖ;->isInitialized()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_4

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 19358
    :cond_3
    iget v1, p0, Ll/֨ܺۖ;->᩸:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_6

    .line 19365
    iget-object v1, p0, Ll/֨ܺۖ;->ۗ:Ll/ܺۚۖ;

    if-nez v1, :cond_4

    .line 19366
    iget-object v1, p0, Ll/֨ܺۖ;->۬:Ll/᩹ܺۖ;

    if-nez v1, :cond_5

    invoke-static {}, Ll/᩹ܺۖ;->getDefaultInstance()Ll/᩹ܺۖ;

    move-result-object v1

    goto :goto_3

    .line 19368
    :cond_4
    invoke-virtual {v1}, Ll/ܺۚۖ;->ܿ()Ll/ۘᩴۖ;

    move-result-object v1

    check-cast v1, Ll/᩹ܺۖ;

    .line 18965
    :cond_5
    :goto_3
    invoke-virtual {v1}, Ll/᩹ܺۖ;->isInitialized()Z

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

    .line 18795
    invoke-virtual {p0, p1, p2}, Ll/֨ܺۖ;->֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;)V

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 18795
    invoke-virtual {p0, p1, p2}, Ll/֨ܺۖ;->֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;)V

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 18795
    invoke-virtual {p0, p1, p2}, Ll/֨ܺۖ;->֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;)V

    return-object p0
.end method

.method public final mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;
    .locals 1

    .line 18908
    instance-of v0, p1, Ll/۠ܺۖ;

    if-eqz v0, :cond_0

    .line 18909
    check-cast p1, Ll/۠ܺۖ;

    invoke-virtual {p0, p1}, Ll/֨ܺۖ;->֫(Ll/۠ܺۖ;)V

    return-object p0

    .line 18911
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 18795
    invoke-virtual {p0, p1, p2}, Ll/֨ܺۖ;->֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;)V

    return-object p0
.end method

.method public final mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;
    .locals 1

    .line 18908
    instance-of v0, p1, Ll/۠ܺۖ;

    if-eqz v0, :cond_0

    .line 18909
    check-cast p1, Ll/۠ܺۖ;

    invoke-virtual {p0, p1}, Ll/֨ܺۖ;->֫(Ll/۠ܺۖ;)V

    return-object p0

    .line 18911
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public final ֫()V
    .locals 2

    .line 18831
    invoke-super {p0}, Ll/᩶ۘۖ;->clear()Ll/᩶ۘۖ;

    const/4 v0, 0x0

    .line 18832
    iput v0, p0, Ll/֨ܺۖ;->᩸:I

    const-string v0, ""

    .line 18833
    iput-object v0, p0, Ll/֨ܺۖ;->ۙ:Ljava/lang/Object;

    .line 18834
    iget-object v0, p0, Ll/֨ܺۖ;->᩹:Ll/ܳۚۖ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 18835
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/֨ܺۖ;->᩶:Ljava/util/List;

    goto :goto_0

    .line 18837
    :cond_0
    iput-object v1, p0, Ll/֨ܺۖ;->᩶:Ljava/util/List;

    .line 18838
    invoke-virtual {v0}, Ll/ܳۚۖ;->ܽ()V

    .line 18840
    :goto_0
    iget v0, p0, Ll/֨ܺۖ;->᩸:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Ll/֨ܺۖ;->᩸:I

    .line 18841
    iput-object v1, p0, Ll/֨ܺۖ;->۬:Ll/᩹ܺۖ;

    .line 18842
    iget-object v0, p0, Ll/֨ܺۖ;->ۗ:Ll/ܺۚۖ;

    if-eqz v0, :cond_1

    .line 18843
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܽ()V

    .line 18844
    iput-object v1, p0, Ll/֨ܺۖ;->ۗ:Ll/ܺۚۖ;

    :cond_1
    return-void
.end method

.method public final ֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;)V
    .locals 4

    .line 18978
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :cond_0
    :goto_0
    if-nez v0, :cond_7

    .line 18983
    :try_start_0
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܶ()I

    move-result v1

    if-eqz v1, :cond_6

    const/16 v2, 0xa

    if-eq v1, v2, :cond_5

    const/16 v2, 0x12

    if-eq v1, v2, :cond_2

    const/16 v2, 0x1a

    if-eq v1, v2, :cond_1

    .line 19014
    invoke-super {p0, p1, p2, v1}, Ll/᩶ۘۖ;->parseUnknownField(Ll/۟ۜۖ;Ll/ᩳۘۖ;I)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 19008
    :cond_1
    invoke-direct {p0}, Ll/֨ܺۖ;->ᩳ()Ll/ܺۚۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v1

    .line 19007
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/ۢ֡ۖ;Ll/ᩳۘۖ;)V

    .line 19010
    iget v1, p0, Ll/֨ܺۖ;->᩸:I

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Ll/֨ܺۖ;->᩸:I

    goto :goto_0

    .line 18996
    :cond_2
    invoke-static {}, Ll/ܳܺۖ;->parser()Ll/۫֡ۖ;

    move-result-object v1

    .line 18995
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/۫֡ۖ;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object v1

    check-cast v1, Ll/ܳܺۖ;

    .line 18998
    iget-object v2, p0, Ll/֨ܺۖ;->᩹:Ll/ܳۚۖ;

    if-nez v2, :cond_4

    .line 19113
    iget v2, p0, Ll/֨ܺۖ;->᩸:I

    and-int/lit8 v2, v2, 0x2

    if-nez v2, :cond_3

    .line 19114
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Ll/֨ܺۖ;->᩶:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, p0, Ll/֨ܺۖ;->᩶:Ljava/util/List;

    .line 19115
    iget v2, p0, Ll/֨ܺۖ;->᩸:I

    or-int/lit8 v2, v2, 0x2

    iput v2, p0, Ll/֨ܺۖ;->᩸:I

    .line 19000
    :cond_3
    iget-object v2, p0, Ll/֨ܺۖ;->᩶:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 19002
    :cond_4
    invoke-virtual {v2, v1}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    goto :goto_0

    .line 18989
    :cond_5
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܳ()Ll/ۛۜۖ;

    move-result-object v1

    iput-object v1, p0, Ll/֨ܺۖ;->ۙ:Ljava/lang/Object;

    .line 18990
    iget v1, p0, Ll/֨ܺۖ;->᩸:I

    or-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/֨ܺۖ;->᩸:I
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

    .line 19022
    :try_start_1
    invoke-virtual {p1}, Ll/֫᩵ۖ;->֫()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19024
    :goto_2
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 19025
    throw p1

    .line 19024
    :cond_7
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-void
.end method

.method public final ֫(Ll/۠ܺۖ;)V
    .locals 3

    .line 18917
    invoke-static {}, Ll/۠ܺۖ;->getDefaultInstance()Ll/۠ܺۖ;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-void

    .line 18918
    :cond_0
    invoke-virtual {p1}, Ll/۠ܺۖ;->hasName()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 18919
    invoke-static {p1}, Ll/۠ܺۖ;->ۧ(Ll/۠ܺۖ;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Ll/֨ܺۖ;->ۙ:Ljava/lang/Object;

    .line 18920
    iget v0, p0, Ll/֨ܺۖ;->᩸:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/֨ܺۖ;->᩸:I

    .line 18921
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 18923
    :cond_1
    iget-object v0, p0, Ll/֨ܺۖ;->᩹:Ll/ܳۚۖ;

    if-nez v0, :cond_4

    .line 18924
    invoke-static {p1}, Ll/۠ܺۖ;->֫(Ll/۠ܺۖ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 18925
    iget-object v0, p0, Ll/֨ܺۖ;->᩶:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 18926
    invoke-static {p1}, Ll/۠ܺۖ;->֫(Ll/۠ܺۖ;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/֨ܺۖ;->᩶:Ljava/util/List;

    .line 18927
    iget v0, p0, Ll/֨ܺۖ;->᩸:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Ll/֨ܺۖ;->᩸:I

    goto :goto_0

    .line 19113
    :cond_2
    iget v0, p0, Ll/֨ܺۖ;->᩸:I

    and-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_3

    .line 19114
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/֨ܺۖ;->᩶:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ll/֨ܺۖ;->᩶:Ljava/util/List;

    .line 19115
    iget v0, p0, Ll/֨ܺۖ;->᩸:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Ll/֨ܺۖ;->᩸:I

    .line 18930
    :cond_3
    iget-object v0, p0, Ll/֨ܺۖ;->᩶:Ljava/util/List;

    invoke-static {p1}, Ll/۠ܺۖ;->֫(Ll/۠ܺۖ;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 18932
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    goto :goto_1

    .line 18935
    :cond_4
    invoke-static {p1}, Ll/۠ܺۖ;->֫(Ll/۠ܺۖ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 18936
    iget-object v0, p0, Ll/֨ܺۖ;->᩹:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 18937
    iget-object v0, p0, Ll/֨ܺۖ;->᩹:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->ᩳ()V

    const/4 v0, 0x0

    .line 18938
    iput-object v0, p0, Ll/֨ܺۖ;->᩹:Ll/ܳۚۖ;

    .line 18939
    invoke-static {p1}, Ll/۠ܺۖ;->֫(Ll/۠ܺۖ;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Ll/֨ܺۖ;->᩶:Ljava/util/List;

    .line 18940
    iget v1, p0, Ll/֨ܺۖ;->᩸:I

    and-int/lit8 v1, v1, -0x3

    iput v1, p0, Ll/֨ܺۖ;->᩸:I

    .line 18942
    sget-boolean v1, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    if-eqz v1, :cond_5

    .line 18943
    invoke-direct {p0}, Ll/֨ܺۖ;->ܽ()Ll/ܳۚۖ;

    move-result-object v0

    :cond_5
    iput-object v0, p0, Ll/֨ܺۖ;->᩹:Ll/ܳۚۖ;

    goto :goto_1

    .line 18945
    :cond_6
    iget-object v0, p0, Ll/֨ܺۖ;->᩹:Ll/ܳۚۖ;

    invoke-static {p1}, Ll/۠ܺۖ;->֫(Ll/۠ܺۖ;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܳۚۖ;->֫(Ljava/lang/Iterable;)V

    .line 18949
    :cond_7
    :goto_1
    invoke-virtual {p1}, Ll/۠ܺۖ;->ۢ()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 18950
    invoke-virtual {p1}, Ll/۠ܺۖ;->᩷()Ll/᩹ܺۖ;

    move-result-object v0

    .line 19405
    iget-object v1, p0, Ll/֨ܺۖ;->ۗ:Ll/ܺۚۖ;

    if-nez v1, :cond_9

    .line 19406
    iget v1, p0, Ll/֨ܺۖ;->᩸:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_8

    iget-object v1, p0, Ll/֨ܺۖ;->۬:Ll/᩹ܺۖ;

    if-eqz v1, :cond_8

    .line 19408
    invoke-static {}, Ll/᩹ܺۖ;->getDefaultInstance()Ll/᩹ܺۖ;

    move-result-object v2

    if-eq v1, v2, :cond_8

    .line 19439
    iget v1, p0, Ll/֨ܺۖ;->᩸:I

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Ll/֨ܺۖ;->᩸:I

    .line 19440
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 19441
    invoke-direct {p0}, Ll/֨ܺۖ;->ᩳ()Ll/ܺۚۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v1

    check-cast v1, Ll/᩸ܺۖ;

    .line 19409
    invoke-virtual {v1, v0}, Ll/᩸ܺۖ;->֫(Ll/᩹ܺۖ;)V

    goto :goto_2

    .line 19411
    :cond_8
    iput-object v0, p0, Ll/֨ܺۖ;->۬:Ll/᩹ܺۖ;

    goto :goto_2

    .line 19414
    :cond_9
    invoke-virtual {v1, v0}, Ll/ܺۚۖ;->֫(Ll/ۘᩴۖ;)V

    .line 19416
    :goto_2
    iget-object v0, p0, Ll/֨ܺۖ;->۬:Ll/᩹ܺۖ;

    if-eqz v0, :cond_a

    .line 19417
    iget v0, p0, Ll/֨ܺۖ;->᩸:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Ll/֨ܺۖ;->᩸:I

    .line 19418
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 18952
    :cond_a
    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩶ۘۖ;->mergeUnknownFields(Ll/ۢ֨ۖ;)Ll/᩶ۘۖ;

    .line 18953
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-void
.end method
