.class public final Ll/᩸۠᩻;
.super Ll/᩶ۘۖ;
.source "C9PC"

# interfaces
.implements Ll/ۙ۠᩻;


# instance fields
.field public bitField0_:I

.field public compressionFactor_:J

.field public cowVersion_:I

.field public groupsBuilder_:Ll/ܳۚۖ;

.field public groups_:Ljava/util/List;

.field public snapshotEnabled_:Z

.field public vabcCompressionParam_:Ljava/lang/Object;

.field public vabcEnabled_:Z

.field public vabcFeatureSetBuilder_:Ll/ܺۚۖ;

.field public vabcFeatureSet_:Ll/ܶܶ᩻;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14546
    invoke-direct {p0}, Ll/᩶ۘۖ;-><init>()V

    .line 14811
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/᩸۠᩻;->groups_:Ljava/util/List;

    const-string v0, ""

    .line 15348
    iput-object v0, p0, Ll/᩸۠᩻;->vabcCompressionParam_:Ljava/lang/Object;

    .line 14547
    invoke-direct {p0}, Ll/᩸۠᩻;->maybeForceBuilderInitialization()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩸۠᩻;-><init>()V

    return-void
.end method

.method public constructor <init>(Ll/ۢۜۖ;)V
    .locals 0

    .line 14552
    invoke-direct {p0, p1}, Ll/᩶ۘۖ;-><init>(Ll/ۢۜۖ;)V

    .line 14811
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Ll/᩸۠᩻;->groups_:Ljava/util/List;

    const-string p1, ""

    .line 15348
    iput-object p1, p0, Ll/᩸۠᩻;->vabcCompressionParam_:Ljava/lang/Object;

    .line 14553
    invoke-direct {p0}, Ll/᩸۠᩻;->maybeForceBuilderInitialization()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۢۜۖ;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/᩸۠᩻;-><init>(Ll/ۢۜۖ;)V

    return-void
.end method

.method private buildPartial0(Ll/᩹۠᩻;)V
    .locals 4

    .line 14628
    iget v0, p0, Ll/᩸۠᩻;->bitField0_:I

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_0

    .line 14631
    iget-boolean v1, p0, Ll/᩸۠᩻;->snapshotEnabled_:Z

    invoke-static {p1, v1}, Ll/᩹۠᩻;->-$$Nest$fputsnapshotEnabled_(Ll/᩹۠᩻;Z)V

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_1

    .line 14635
    iget-boolean v2, p0, Ll/᩸۠᩻;->vabcEnabled_:Z

    invoke-static {p1, v2}, Ll/᩹۠᩻;->-$$Nest$fputvabcEnabled_(Ll/᩹۠᩻;Z)V

    or-int/lit8 v1, v1, 0x2

    :cond_1
    and-int/lit8 v2, v0, 0x8

    if-eqz v2, :cond_2

    .line 14639
    iget-object v2, p0, Ll/᩸۠᩻;->vabcCompressionParam_:Ljava/lang/Object;

    invoke-static {p1, v2}, Ll/᩹۠᩻;->-$$Nest$fputvabcCompressionParam_(Ll/᩹۠᩻;Ljava/lang/Object;)V

    or-int/lit8 v1, v1, 0x4

    :cond_2
    and-int/lit8 v2, v0, 0x10

    if-eqz v2, :cond_3

    .line 14643
    iget v2, p0, Ll/᩸۠᩻;->cowVersion_:I

    invoke-static {p1, v2}, Ll/᩹۠᩻;->-$$Nest$fputcowVersion_(Ll/᩹۠᩻;I)V

    or-int/lit8 v1, v1, 0x8

    :cond_3
    and-int/lit8 v2, v0, 0x20

    if-eqz v2, :cond_5

    .line 14647
    iget-object v2, p0, Ll/᩸۠᩻;->vabcFeatureSetBuilder_:Ll/ܺۚۖ;

    if-nez v2, :cond_4

    .line 14648
    iget-object v2, p0, Ll/᩸۠᩻;->vabcFeatureSet_:Ll/ܶܶ᩻;

    goto :goto_1

    .line 14649
    :cond_4
    invoke-virtual {v2}, Ll/ܺۚۖ;->ۧ()Ll/ۘᩴۖ;

    move-result-object v2

    check-cast v2, Ll/ܶܶ᩻;

    :goto_1
    invoke-static {p1, v2}, Ll/᩹۠᩻;->-$$Nest$fputvabcFeatureSet_(Ll/᩹۠᩻;Ll/ܶܶ᩻;)V

    or-int/lit8 v1, v1, 0x10

    :cond_5
    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_6

    .line 14653
    iget-wide v2, p0, Ll/᩸۠᩻;->compressionFactor_:J

    invoke-static {p1, v2, v3}, Ll/᩹۠᩻;->-$$Nest$fputcompressionFactor_(Ll/᩹۠᩻;J)V

    or-int/lit8 v1, v1, 0x20

    .line 14656
    :cond_6
    invoke-static {p1}, Ll/᩹۠᩻;->-$$Nest$fgetbitField0_(Ll/᩹۠᩻;)I

    move-result v0

    or-int/2addr v0, v1

    invoke-static {p1, v0}, Ll/᩹۠᩻;->-$$Nest$fputbitField0_(Ll/᩹۠᩻;I)V

    return-void
.end method

.method private buildPartialRepeatedFields(Ll/᩹۠᩻;)V
    .locals 1

    .line 14616
    iget-object v0, p0, Ll/᩸۠᩻;->groupsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_1

    .line 14617
    iget v0, p0, Ll/᩸۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    .line 14618
    iget-object v0, p0, Ll/᩸۠᩻;->groups_:Ljava/util/List;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/᩸۠᩻;->groups_:Ljava/util/List;

    .line 14619
    iget v0, p0, Ll/᩸۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Ll/᩸۠᩻;->bitField0_:I

    .line 14621
    :cond_0
    iget-object v0, p0, Ll/᩸۠᩻;->groups_:Ljava/util/List;

    invoke-static {p1, v0}, Ll/᩹۠᩻;->-$$Nest$fputgroups_(Ll/᩹۠᩻;Ljava/util/List;)V

    return-void

    .line 14623
    :cond_1
    invoke-virtual {v0}, Ll/ܳۚۖ;->ۧ()Ljava/util/List;

    move-result-object v0

    invoke-static {p1, v0}, Ll/᩹۠᩻;->-$$Nest$fputgroups_(Ll/᩹۠᩻;Ljava/util/List;)V

    return-void
.end method

.method private ensureGroupsIsMutable()V
    .locals 2

    .line 14813
    iget v0, p0, Ll/᩸۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_0

    .line 14814
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/᩸۠᩻;->groups_:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ll/᩸۠᩻;->groups_:Ljava/util/List;

    .line 14815
    iget v0, p0, Ll/᩸۠᩻;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/᩸۠᩻;->bitField0_:I

    :cond_0
    return-void
.end method

.method public static final getDescriptor()Ll/ᩳۖۖ;
    .locals 1

    .line 14534
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_DynamicPartitionMetadata_descriptor()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method private getGroupsFieldBuilder()Ll/ܳۚۖ;
    .locals 5

    .line 15200
    iget-object v0, p0, Ll/᩸۠᩻;->groupsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_1

    .line 15201
    new-instance v0, Ll/ܳۚۖ;

    iget-object v1, p0, Ll/᩸۠᩻;->groups_:Ljava/util/List;

    iget v2, p0, Ll/᩸۠᩻;->bitField0_:I

    const/4 v3, 0x1

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 15205
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v2

    .line 15206
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v3, v2, v4}, Ll/ܳۚۖ;-><init>(Ljava/util/List;ZLl/ۢۜۖ;Z)V

    iput-object v0, p0, Ll/᩸۠᩻;->groupsBuilder_:Ll/ܳۚۖ;

    const/4 v0, 0x0

    .line 15207
    iput-object v0, p0, Ll/᩸۠᩻;->groups_:Ljava/util/List;

    .line 15209
    :cond_1
    iget-object v0, p0, Ll/᩸۠᩻;->groupsBuilder_:Ll/ܳۚۖ;

    return-object v0
.end method

.method private getVabcFeatureSetFieldBuilder()Ll/ܺۚۖ;
    .locals 4

    .line 15670
    iget-object v0, p0, Ll/᩸۠᩻;->vabcFeatureSetBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 15671
    new-instance v0, Ll/ܺۚۖ;

    .line 15673
    invoke-virtual {p0}, Ll/᩸۠᩻;->getVabcFeatureSet()Ll/ܶܶ᩻;

    move-result-object v1

    .line 15674
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v2

    .line 15675
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Ll/ܺۚۖ;-><init>(Ll/ۘᩴۖ;Ll/ۢۜۖ;Z)V

    iput-object v0, p0, Ll/᩸۠᩻;->vabcFeatureSetBuilder_:Ll/ܺۚۖ;

    const/4 v0, 0x0

    .line 15676
    iput-object v0, p0, Ll/᩸۠᩻;->vabcFeatureSet_:Ll/ܶܶ᩻;

    .line 15678
    :cond_0
    iget-object v0, p0, Ll/᩸۠᩻;->vabcFeatureSetBuilder_:Ll/ܺۚۖ;

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 14557
    invoke-static {}, Ll/᩹۠᩻;->access$800()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 14558
    invoke-direct {p0}, Ll/᩸۠᩻;->getGroupsFieldBuilder()Ll/ܳۚۖ;

    .line 14559
    invoke-direct {p0}, Ll/᩸۠᩻;->getVabcFeatureSetFieldBuilder()Ll/ܺۚۖ;

    :cond_0
    return-void
.end method


# virtual methods
.method public addAllGroups(Ljava/lang/Iterable;)Ll/᩸۠᩻;
    .locals 1

    .line 15039
    iget-object v0, p0, Ll/᩸۠᩻;->groupsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 15040
    invoke-direct {p0}, Ll/᩸۠᩻;->ensureGroupsIsMutable()V

    .line 15041
    iget-object v0, p0, Ll/᩸۠᩻;->groups_:Ljava/util/List;

    invoke-static {p1, v0}, Ll/ۖۜۖ;->֫(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 15043
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 15045
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->֫(Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public addGroups(ILl/֡۠᩻;)Ll/᩸۠᩻;
    .locals 1

    .line 15016
    iget-object v0, p0, Ll/᩸۠᩻;->groupsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 15017
    invoke-direct {p0}, Ll/᩸۠᩻;->ensureGroupsIsMutable()V

    .line 15018
    iget-object v0, p0, Ll/᩸۠᩻;->groups_:Ljava/util/List;

    invoke-virtual {p2}, Ll/֡۠᩻;->build()Ll/ۚ۠᩻;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 15019
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 15021
    :cond_0
    invoke-virtual {p2}, Ll/֡۠᩻;->build()Ll/ۚ۠᩻;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ll/ܳۚۖ;->ۧ(ILl/ۘᩴۖ;)V

    return-object p0
.end method

.method public addGroups(ILl/ۚ۠᩻;)Ll/᩸۠᩻;
    .locals 1

    .line 14967
    iget-object v0, p0, Ll/᩸۠᩻;->groupsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 14969
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14971
    invoke-direct {p0}, Ll/᩸۠᩻;->ensureGroupsIsMutable()V

    .line 14972
    iget-object v0, p0, Ll/᩸۠᩻;->groups_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 14973
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 14975
    :cond_0
    invoke-virtual {v0, p1, p2}, Ll/ܳۚۖ;->ۧ(ILl/ۘᩴۖ;)V

    return-object p0
.end method

.method public addGroups(Ll/֡۠᩻;)Ll/᩸۠᩻;
    .locals 1

    .line 14993
    iget-object v0, p0, Ll/᩸۠᩻;->groupsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 14994
    invoke-direct {p0}, Ll/᩸۠᩻;->ensureGroupsIsMutable()V

    .line 14995
    iget-object v0, p0, Ll/᩸۠᩻;->groups_:Ljava/util/List;

    invoke-virtual {p1}, Ll/֡۠᩻;->build()Ll/ۚ۠᩻;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14996
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 14998
    :cond_0
    invoke-virtual {p1}, Ll/֡۠᩻;->build()Ll/ۚ۠᩻;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    return-object p0
.end method

.method public addGroups(Ll/ۚ۠᩻;)Ll/᩸۠᩻;
    .locals 1

    .line 14941
    iget-object v0, p0, Ll/᩸۠᩻;->groupsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 14943
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14945
    invoke-direct {p0}, Ll/᩸۠᩻;->ensureGroupsIsMutable()V

    .line 14946
    iget-object v0, p0, Ll/᩸۠᩻;->groups_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14947
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 14949
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    return-object p0
.end method

.method public addGroupsBuilder()Ll/֡۠᩻;
    .locals 2

    .line 15161
    invoke-direct {p0}, Ll/᩸۠᩻;->getGroupsFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    .line 15162
    invoke-static {}, Ll/ۚ۠᩻;->getDefaultInstance()Ll/ۚ۠᩻;

    move-result-object v1

    .line 15161
    invoke-virtual {v0, v1}, Ll/ܳۚۖ;->֫(Ll/ۘᩴۖ;)Ll/᩶ۘۖ;

    move-result-object v0

    check-cast v0, Ll/֡۠᩻;

    return-object v0
.end method

.method public addGroupsBuilder(I)Ll/֡۠᩻;
    .locals 2

    .line 15178
    invoke-direct {p0}, Ll/᩸۠᩻;->getGroupsFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    .line 15179
    invoke-static {}, Ll/ۚ۠᩻;->getDefaultInstance()Ll/ۚ۠᩻;

    move-result-object v1

    .line 15178
    invoke-virtual {v0, p1, v1}, Ll/ܳۚۖ;->֫(ILl/ۘᩴۖ;)Ll/᩶ۘۖ;

    move-result-object p1

    check-cast p1, Ll/֡۠᩻;

    return-object p1
.end method

.method public bridge synthetic build()Ll/ۡ֡ۖ;
    .locals 1

    .line 14528
    invoke-virtual {p0}, Ll/᩸۠᩻;->build()Ll/᩹۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public build()Ll/᩹۠᩻;
    .locals 2

    .line 14599
    invoke-virtual {p0}, Ll/᩸۠᩻;->buildPartial()Ll/᩹۠᩻;

    move-result-object v0

    .line 14600
    invoke-virtual {v0}, Ll/᩹۠᩻;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 14601
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public bridge synthetic build()Ll/᩻֡ۖ;
    .locals 1

    .line 14528
    invoke-virtual {p0}, Ll/᩸۠᩻;->build()Ll/᩹۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Ll/ۡ֡ۖ;
    .locals 1

    .line 14528
    invoke-virtual {p0}, Ll/᩸۠᩻;->buildPartial()Ll/᩹۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Ll/᩹۠᩻;
    .locals 2

    .line 14608
    new-instance v0, Ll/᩹۠᩻;

    invoke-direct {v0, p0}, Ll/᩹۠᩻;-><init>(Ll/᩸۠᩻;)V

    .line 14609
    invoke-direct {p0, v0}, Ll/᩸۠᩻;->buildPartialRepeatedFields(Ll/᩹۠᩻;)V

    .line 14610
    iget v1, p0, Ll/᩸۠᩻;->bitField0_:I

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, Ll/᩸۠᩻;->buildPartial0(Ll/᩹۠᩻;)V

    .line 14611
    :cond_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onBuilt()V

    return-object v0
.end method

.method public bridge synthetic buildPartial()Ll/᩻֡ۖ;
    .locals 1

    .line 14528
    invoke-virtual {p0}, Ll/᩸۠᩻;->buildPartial()Ll/᩹۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/ۢ֡ۖ;
    .locals 1

    .line 14528
    invoke-virtual {p0}, Ll/᩸۠᩻;->clear()Ll/᩸۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/ܳ֡ۖ;
    .locals 1

    .line 14528
    invoke-virtual {p0}, Ll/᩸۠᩻;->clear()Ll/᩸۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/᩶ۘۖ;
    .locals 1

    .line 14528
    invoke-virtual {p0}, Ll/᩸۠᩻;->clear()Ll/᩸۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/᩷ۜۖ;
    .locals 1

    .line 14528
    invoke-virtual {p0}, Ll/᩸۠᩻;->clear()Ll/᩸۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public clear()Ll/᩸۠᩻;
    .locals 3

    .line 14564
    invoke-super {p0}, Ll/᩶ۘۖ;->clear()Ll/᩶ۘۖ;

    const/4 v0, 0x0

    .line 14565
    iput v0, p0, Ll/᩸۠᩻;->bitField0_:I

    .line 14566
    iget-object v1, p0, Ll/᩸۠᩻;->groupsBuilder_:Ll/ܳۚۖ;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 14567
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, p0, Ll/᩸۠᩻;->groups_:Ljava/util/List;

    goto :goto_0

    .line 14569
    :cond_0
    iput-object v2, p0, Ll/᩸۠᩻;->groups_:Ljava/util/List;

    .line 14570
    invoke-virtual {v1}, Ll/ܳۚۖ;->ܽ()V

    .line 14572
    :goto_0
    iget v1, p0, Ll/᩸۠᩻;->bitField0_:I

    and-int/lit8 v1, v1, -0x2

    iput v1, p0, Ll/᩸۠᩻;->bitField0_:I

    .line 14573
    iput-boolean v0, p0, Ll/᩸۠᩻;->snapshotEnabled_:Z

    .line 14574
    iput-boolean v0, p0, Ll/᩸۠᩻;->vabcEnabled_:Z

    const-string v1, ""

    .line 14575
    iput-object v1, p0, Ll/᩸۠᩻;->vabcCompressionParam_:Ljava/lang/Object;

    .line 14576
    iput v0, p0, Ll/᩸۠᩻;->cowVersion_:I

    .line 14577
    iput-object v2, p0, Ll/᩸۠᩻;->vabcFeatureSet_:Ll/ܶܶ᩻;

    .line 14578
    iget-object v0, p0, Ll/᩸۠᩻;->vabcFeatureSetBuilder_:Ll/ܺۚۖ;

    if-eqz v0, :cond_1

    .line 14579
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܽ()V

    .line 14580
    iput-object v2, p0, Ll/᩸۠᩻;->vabcFeatureSetBuilder_:Ll/ܺۚۖ;

    :cond_1
    const-wide/16 v0, 0x0

    .line 14582
    iput-wide v0, p0, Ll/᩸۠᩻;->compressionFactor_:J

    return-object p0
.end method

.method public clearCompressionFactor()Ll/᩸۠᩻;
    .locals 2

    .line 15735
    iget v0, p0, Ll/᩸۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Ll/᩸۠᩻;->bitField0_:I

    const-wide/16 v0, 0x0

    .line 15736
    iput-wide v0, p0, Ll/᩸۠᩻;->compressionFactor_:J

    .line 15737
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearCowVersion()Ll/᩸۠᩻;
    .locals 1

    .line 15518
    iget v0, p0, Ll/᩸۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Ll/᩸۠᩻;->bitField0_:I

    const/4 v0, 0x0

    .line 15519
    iput v0, p0, Ll/᩸۠᩻;->cowVersion_:I

    .line 15520
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearGroups()Ll/᩸۠᩻;
    .locals 1

    .line 15062
    iget-object v0, p0, Ll/᩸۠᩻;->groupsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 15063
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/᩸۠᩻;->groups_:Ljava/util/List;

    .line 15064
    iget v0, p0, Ll/᩸۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Ll/᩸۠᩻;->bitField0_:I

    .line 15065
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 15067
    :cond_0
    invoke-virtual {v0}, Ll/ܳۚۖ;->ܽ()V

    return-object p0
.end method

.method public clearSnapshotEnabled()Ll/᩸۠᩻;
    .locals 1

    .line 15274
    iget v0, p0, Ll/᩸۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Ll/᩸۠᩻;->bitField0_:I

    const/4 v0, 0x0

    .line 15275
    iput-boolean v0, p0, Ll/᩸۠᩻;->snapshotEnabled_:Z

    .line 15276
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearVabcCompressionParam()Ll/᩸۠᩻;
    .locals 1

    .line 15439
    invoke-static {}, Ll/᩹۠᩻;->getDefaultInstance()Ll/᩹۠᩻;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩹۠᩻;->getVabcCompressionParam()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/᩸۠᩻;->vabcCompressionParam_:Ljava/lang/Object;

    .line 15440
    iget v0, p0, Ll/᩸۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Ll/᩸۠᩻;->bitField0_:I

    .line 15441
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearVabcEnabled()Ll/᩸۠᩻;
    .locals 1

    .line 15342
    iget v0, p0, Ll/᩸۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Ll/᩸۠᩻;->bitField0_:I

    const/4 v0, 0x0

    .line 15343
    iput-boolean v0, p0, Ll/᩸۠᩻;->vabcEnabled_:Z

    .line 15344
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearVabcFeatureSet()Ll/᩸۠᩻;
    .locals 2

    .line 15624
    iget v0, p0, Ll/᩸۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Ll/᩸۠᩻;->bitField0_:I

    const/4 v0, 0x0

    .line 15625
    iput-object v0, p0, Ll/᩸۠᩻;->vabcFeatureSet_:Ll/ܶܶ᩻;

    .line 15626
    iget-object v1, p0, Ll/᩸۠᩻;->vabcFeatureSetBuilder_:Ll/ܺۚۖ;

    if-eqz v1, :cond_0

    .line 15627
    invoke-virtual {v1}, Ll/ܺۚۖ;->ܽ()V

    .line 15628
    iput-object v0, p0, Ll/᩸۠᩻;->vabcFeatureSetBuilder_:Ll/ܺۚۖ;

    .line 15630
    :cond_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public getCompressionFactor()J
    .locals 2

    .line 15706
    iget-wide v0, p0, Ll/᩸۠᩻;->compressionFactor_:J

    return-wide v0
.end method

.method public getCowVersion()I
    .locals 1

    .line 15489
    iget v0, p0, Ll/᩸۠᩻;->cowVersion_:I

    return v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 14528
    invoke-virtual {p0}, Ll/᩸۠᩻;->getDefaultInstanceForType()Ll/᩹۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Ll/᩹۠᩻;
    .locals 1

    .line 14594
    invoke-static {}, Ll/᩹۠᩻;->getDefaultInstance()Ll/᩹۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 14528
    invoke-virtual {p0}, Ll/᩸۠᩻;->getDefaultInstanceForType()Ll/᩹۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Ll/ᩳۖۖ;
    .locals 1

    .line 14589
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_DynamicPartitionMetadata_descriptor()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public getGroups(I)Ll/ۚ۠᩻;
    .locals 1

    .line 14873
    iget-object v0, p0, Ll/᩸۠᩻;->groupsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 14874
    iget-object v0, p0, Ll/᩸۠᩻;->groups_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚ۠᩻;

    return-object p1

    .line 14876
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ۧ(I)Ll/ۘᩴۖ;

    move-result-object p1

    check-cast p1, Ll/ۚ۠᩻;

    return-object p1
.end method

.method public getGroupsBuilder(I)Ll/֡۠᩻;
    .locals 1

    .line 15107
    invoke-direct {p0}, Ll/᩸۠᩻;->getGroupsFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->֫(I)Ll/᩶ۘۖ;

    move-result-object p1

    check-cast p1, Ll/֡۠᩻;

    return-object p1
.end method

.method public getGroupsBuilderList()Ljava/util/List;
    .locals 1

    .line 15195
    invoke-direct {p0}, Ll/᩸۠᩻;->getGroupsFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܳۚۖ;->ܿ()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getGroupsCount()I
    .locals 1

    .line 14854
    iget-object v0, p0, Ll/᩸۠᩻;->groupsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 14855
    iget-object v0, p0, Ll/᩸۠᩻;->groups_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 14857
    :cond_0
    invoke-virtual {v0}, Ll/ܳۚۖ;->ܳ()I

    move-result v0

    return v0
.end method

.method public getGroupsList()Ljava/util/List;
    .locals 1

    .line 14835
    iget-object v0, p0, Ll/᩸۠᩻;->groupsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 14836
    iget-object v0, p0, Ll/᩸۠᩻;->groups_:Ljava/util/List;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 14838
    :cond_0
    invoke-virtual {v0}, Ll/ܳۚۖ;->᩻()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getGroupsOrBuilder(I)Ll/۠۠᩻;
    .locals 1

    .line 15123
    iget-object v0, p0, Ll/᩸۠᩻;->groupsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 15124
    iget-object v0, p0, Ll/᩸۠᩻;->groups_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۠۠᩻;

    return-object p1

    .line 15125
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ܽ(I)Ll/ۘ֡ۖ;

    move-result-object p1

    check-cast p1, Ll/۠۠᩻;

    return-object p1
.end method

.method public getGroupsOrBuilderList()Ljava/util/List;
    .locals 1

    .line 15142
    iget-object v0, p0, Ll/᩸۠᩻;->groupsBuilder_:Ll/ܳۚۖ;

    if-eqz v0, :cond_0

    .line 15143
    invoke-virtual {v0}, Ll/ܳۚۖ;->ۜ()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 15145
    :cond_0
    iget-object v0, p0, Ll/᩸۠᩻;->groups_:Ljava/util/List;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getSnapshotEnabled()Z
    .locals 1

    .line 15241
    iget-boolean v0, p0, Ll/᩸۠᩻;->snapshotEnabled_:Z

    return v0
.end method

.method public getVabcCompressionParam()Ljava/lang/String;
    .locals 2

    .line 15373
    iget-object v0, p0, Ll/᩸۠᩻;->vabcCompressionParam_:Ljava/lang/Object;

    .line 15374
    instance-of v1, v0, Ljava/lang/String;

    if-nez v1, :cond_1

    .line 15375
    check-cast v0, Ll/ۛۜۖ;

    .line 15377
    invoke-virtual {v0}, Ll/ۛۜۖ;->ܳ()Ljava/lang/String;

    move-result-object v1

    .line 15378
    invoke-virtual {v0}, Ll/ۛۜۖ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 15379
    iput-object v1, p0, Ll/᩸۠᩻;->vabcCompressionParam_:Ljava/lang/Object;

    :cond_0
    return-object v1

    .line 15383
    :cond_1
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getVabcCompressionParamBytes()Ll/ۛۜۖ;
    .locals 2

    .line 15398
    iget-object v0, p0, Ll/᩸۠᩻;->vabcCompressionParam_:Ljava/lang/Object;

    .line 15399
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 15400
    check-cast v0, Ljava/lang/String;

    .line 15401
    invoke-static {v0}, Ll/ۛۜۖ;->֫(Ljava/lang/String;)Ll/ۛۜۖ;

    move-result-object v0

    .line 15403
    iput-object v0, p0, Ll/᩸۠᩻;->vabcCompressionParam_:Ljava/lang/Object;

    return-object v0

    .line 15406
    :cond_0
    check-cast v0, Ll/ۛۜۖ;

    return-object v0
.end method

.method public getVabcEnabled()Z
    .locals 1

    .line 15309
    iget-boolean v0, p0, Ll/᩸۠᩻;->vabcEnabled_:Z

    return v0
.end method

.method public getVabcFeatureSet()Ll/ܶܶ᩻;
    .locals 1

    .line 15547
    iget-object v0, p0, Ll/᩸۠᩻;->vabcFeatureSetBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_1

    .line 15548
    iget-object v0, p0, Ll/᩸۠᩻;->vabcFeatureSet_:Ll/ܶܶ᩻;

    if-nez v0, :cond_0

    invoke-static {}, Ll/ܶܶ᩻;->getDefaultInstance()Ll/ܶܶ᩻;

    move-result-object v0

    :cond_0
    return-object v0

    .line 15550
    :cond_1
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܿ()Ll/ۘᩴۖ;

    move-result-object v0

    check-cast v0, Ll/ܶܶ᩻;

    return-object v0
.end method

.method public getVabcFeatureSetBuilder()Ll/۠ܶ᩻;
    .locals 1

    .line 15641
    iget v0, p0, Ll/᩸۠᩻;->bitField0_:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Ll/᩸۠᩻;->bitField0_:I

    .line 15642
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 15643
    invoke-direct {p0}, Ll/᩸۠᩻;->getVabcFeatureSetFieldBuilder()Ll/ܺۚۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v0

    check-cast v0, Ll/۠ܶ᩻;

    return-object v0
.end method

.method public getVabcFeatureSetOrBuilder()Ll/᩹ܶ᩻;
    .locals 1

    .line 15653
    iget-object v0, p0, Ll/᩸۠᩻;->vabcFeatureSetBuilder_:Ll/ܺۚۖ;

    if-eqz v0, :cond_0

    .line 15654
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܳ()Ll/ۘ֡ۖ;

    move-result-object v0

    check-cast v0, Ll/᩹ܶ᩻;

    return-object v0

    .line 15656
    :cond_0
    iget-object v0, p0, Ll/᩸۠᩻;->vabcFeatureSet_:Ll/ܶܶ᩻;

    if-nez v0, :cond_1

    .line 15657
    invoke-static {}, Ll/ܶܶ᩻;->getDefaultInstance()Ll/ܶܶ᩻;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public hasCompressionFactor()Z
    .locals 1

    .line 15693
    iget v0, p0, Ll/᩸۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasCowVersion()Z
    .locals 1

    .line 15476
    iget v0, p0, Ll/᩸۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasSnapshotEnabled()Z
    .locals 1

    .line 15226
    iget v0, p0, Ll/᩸۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasVabcCompressionParam()Z
    .locals 1

    .line 15360
    iget v0, p0, Ll/᩸۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasVabcEnabled()Z
    .locals 1

    .line 15294
    iget v0, p0, Ll/᩸۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasVabcFeatureSet()Z
    .locals 1

    .line 15536
    iget v0, p0, Ll/᩸۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 14540
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_DynamicPartitionMetadata_fieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/᩹۠᩻;

    const-class v2, Ll/᩸۠᩻;

    .line 14541
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 14724
    :goto_0
    invoke-virtual {p0}, Ll/᩸۠᩻;->getGroupsCount()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 14725
    invoke-virtual {p0, v1}, Ll/᩸۠᩻;->getGroups(I)Ll/ۚ۠᩻;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۚ۠᩻;->isInitialized()Z

    move-result v2

    if-nez v2, :cond_0

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۖۜۖ;
    .locals 0

    .line 14528
    invoke-virtual {p0, p1, p2}, Ll/᩸۠᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩸۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 14528
    invoke-virtual {p0, p1, p2}, Ll/᩸۠᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩸۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 14528
    invoke-virtual {p0, p1, p2}, Ll/᩸۠᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩸۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 14528
    invoke-virtual {p0, p1}, Ll/᩸۠᩻;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩸۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 14528
    invoke-virtual {p0, p1, p2}, Ll/᩸۠᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩸۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 14528
    invoke-virtual {p0, p1}, Ll/᩸۠᩻;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩸۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩸۠᩻;
    .locals 4

    .line 14738
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :cond_0
    :goto_0
    if-nez v0, :cond_a

    .line 14743
    :try_start_0
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܶ()I

    move-result v1

    if-eqz v1, :cond_9

    const/16 v2, 0xa

    if-eq v1, v2, :cond_7

    const/16 v2, 0x10

    if-eq v1, v2, :cond_6

    const/16 v3, 0x18

    if-eq v1, v3, :cond_5

    const/16 v3, 0x22

    if-eq v1, v3, :cond_4

    const/16 v3, 0x28

    if-eq v1, v3, :cond_3

    const/16 v2, 0x32

    if-eq v1, v2, :cond_2

    const/16 v2, 0x38

    if-eq v1, v2, :cond_1

    .line 14794
    invoke-super {p0, p1, p2, v1}, Ll/᩶ۘۖ;->parseUnknownField(Ll/۟ۜۖ;Ll/ᩳۘۖ;I)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_1

    .line 14789
    :cond_1
    invoke-virtual {p1}, Ll/۟ۜۖ;->᩹()J

    move-result-wide v1

    iput-wide v1, p0, Ll/᩸۠᩻;->compressionFactor_:J

    .line 14790
    iget v1, p0, Ll/᩸۠᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x40

    iput v1, p0, Ll/᩸۠᩻;->bitField0_:I

    goto :goto_0

    .line 14783
    :cond_2
    invoke-direct {p0}, Ll/᩸۠᩻;->getVabcFeatureSetFieldBuilder()Ll/ܺۚۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v1

    .line 14782
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/ۢ֡ۖ;Ll/ᩳۘۖ;)V

    .line 14785
    iget v1, p0, Ll/᩸۠᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x20

    iput v1, p0, Ll/᩸۠᩻;->bitField0_:I

    goto :goto_0

    .line 14777
    :cond_3
    invoke-virtual {p1}, Ll/۟ۜۖ;->᩸()I

    move-result v1

    iput v1, p0, Ll/᩸۠᩻;->cowVersion_:I

    .line 14778
    iget v1, p0, Ll/᩸۠᩻;->bitField0_:I

    or-int/2addr v1, v2

    iput v1, p0, Ll/᩸۠᩻;->bitField0_:I

    goto :goto_0

    .line 14772
    :cond_4
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܳ()Ll/ۛۜۖ;

    move-result-object v1

    iput-object v1, p0, Ll/᩸۠᩻;->vabcCompressionParam_:Ljava/lang/Object;

    .line 14773
    iget v1, p0, Ll/᩸۠᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x8

    iput v1, p0, Ll/᩸۠᩻;->bitField0_:I

    goto :goto_0

    .line 14767
    :cond_5
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܿ()Z

    move-result v1

    iput-boolean v1, p0, Ll/᩸۠᩻;->vabcEnabled_:Z

    .line 14768
    iget v1, p0, Ll/᩸۠᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Ll/᩸۠᩻;->bitField0_:I

    goto :goto_0

    .line 14762
    :cond_6
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܿ()Z

    move-result v1

    iput-boolean v1, p0, Ll/᩸۠᩻;->snapshotEnabled_:Z

    .line 14763
    iget v1, p0, Ll/᩸۠᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x2

    iput v1, p0, Ll/᩸۠᩻;->bitField0_:I

    goto :goto_0

    .line 14751
    :cond_7
    invoke-static {}, Ll/ۚ۠᩻;->parser()Ll/۫֡ۖ;

    move-result-object v1

    .line 14750
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/۫֡ۖ;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object v1

    check-cast v1, Ll/ۚ۠᩻;

    .line 14753
    iget-object v2, p0, Ll/᩸۠᩻;->groupsBuilder_:Ll/ܳۚۖ;

    if-nez v2, :cond_8

    .line 14754
    invoke-direct {p0}, Ll/᩸۠᩻;->ensureGroupsIsMutable()V

    .line 14755
    iget-object v2, p0, Ll/᩸۠᩻;->groups_:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 14757
    :cond_8
    invoke-virtual {v2, v1}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V
    :try_end_0
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    :cond_9
    :goto_1
    const/4 v0, 0x1

    goto/16 :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 14802
    :try_start_1
    invoke-virtual {p1}, Ll/֫᩵ۖ;->֫()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14804
    :goto_2
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 14805
    throw p1

    .line 14804
    :cond_a
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public mergeFrom(Ll/᩹۠᩻;)Ll/᩸۠᩻;
    .locals 2

    .line 14670
    invoke-static {}, Ll/᩹۠᩻;->getDefaultInstance()Ll/᩹۠᩻;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 14671
    :cond_0
    iget-object v0, p0, Ll/᩸۠᩻;->groupsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_2

    .line 14672
    invoke-static {p1}, Ll/᩹۠᩻;->-$$Nest$fgetgroups_(Ll/᩹۠᩻;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 14673
    iget-object v0, p0, Ll/᩸۠᩻;->groups_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 14674
    invoke-static {p1}, Ll/᩹۠᩻;->-$$Nest$fgetgroups_(Ll/᩹۠᩻;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/᩸۠᩻;->groups_:Ljava/util/List;

    .line 14675
    iget v0, p0, Ll/᩸۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Ll/᩸۠᩻;->bitField0_:I

    goto :goto_0

    .line 14677
    :cond_1
    invoke-direct {p0}, Ll/᩸۠᩻;->ensureGroupsIsMutable()V

    .line 14678
    iget-object v0, p0, Ll/᩸۠᩻;->groups_:Ljava/util/List;

    invoke-static {p1}, Ll/᩹۠᩻;->-$$Nest$fgetgroups_(Ll/᩹۠᩻;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 14680
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    goto :goto_1

    .line 14683
    :cond_2
    invoke-static {p1}, Ll/᩹۠᩻;->-$$Nest$fgetgroups_(Ll/᩹۠᩻;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 14684
    iget-object v0, p0, Ll/᩸۠᩻;->groupsBuilder_:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 14685
    iget-object v0, p0, Ll/᩸۠᩻;->groupsBuilder_:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->ᩳ()V

    const/4 v0, 0x0

    .line 14686
    iput-object v0, p0, Ll/᩸۠᩻;->groupsBuilder_:Ll/ܳۚۖ;

    .line 14687
    invoke-static {p1}, Ll/᩹۠᩻;->-$$Nest$fgetgroups_(Ll/᩹۠᩻;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Ll/᩸۠᩻;->groups_:Ljava/util/List;

    .line 14688
    iget v1, p0, Ll/᩸۠᩻;->bitField0_:I

    and-int/lit8 v1, v1, -0x2

    iput v1, p0, Ll/᩸۠᩻;->bitField0_:I

    .line 14690
    invoke-static {}, Ll/᩹۠᩻;->access$900()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 14691
    invoke-direct {p0}, Ll/᩸۠᩻;->getGroupsFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    :cond_3
    iput-object v0, p0, Ll/᩸۠᩻;->groupsBuilder_:Ll/ܳۚۖ;

    goto :goto_1

    .line 14693
    :cond_4
    iget-object v0, p0, Ll/᩸۠᩻;->groupsBuilder_:Ll/ܳۚۖ;

    invoke-static {p1}, Ll/᩹۠᩻;->-$$Nest$fgetgroups_(Ll/᩹۠᩻;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܳۚۖ;->֫(Ljava/lang/Iterable;)V

    .line 14697
    :cond_5
    :goto_1
    invoke-virtual {p1}, Ll/᩹۠᩻;->hasSnapshotEnabled()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 14698
    invoke-virtual {p1}, Ll/᩹۠᩻;->getSnapshotEnabled()Z

    move-result v0

    invoke-virtual {p0, v0}, Ll/᩸۠᩻;->setSnapshotEnabled(Z)Ll/᩸۠᩻;

    .line 14700
    :cond_6
    invoke-virtual {p1}, Ll/᩹۠᩻;->hasVabcEnabled()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 14701
    invoke-virtual {p1}, Ll/᩹۠᩻;->getVabcEnabled()Z

    move-result v0

    invoke-virtual {p0, v0}, Ll/᩸۠᩻;->setVabcEnabled(Z)Ll/᩸۠᩻;

    .line 14703
    :cond_7
    invoke-virtual {p1}, Ll/᩹۠᩻;->hasVabcCompressionParam()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 14704
    invoke-static {p1}, Ll/᩹۠᩻;->-$$Nest$fgetvabcCompressionParam_(Ll/᩹۠᩻;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Ll/᩸۠᩻;->vabcCompressionParam_:Ljava/lang/Object;

    .line 14705
    iget v0, p0, Ll/᩸۠᩻;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Ll/᩸۠᩻;->bitField0_:I

    .line 14706
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 14708
    :cond_8
    invoke-virtual {p1}, Ll/᩹۠᩻;->hasCowVersion()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 14709
    invoke-virtual {p1}, Ll/᩹۠᩻;->getCowVersion()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/᩸۠᩻;->setCowVersion(I)Ll/᩸۠᩻;

    .line 14711
    :cond_9
    invoke-virtual {p1}, Ll/᩹۠᩻;->hasVabcFeatureSet()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 14712
    invoke-virtual {p1}, Ll/᩹۠᩻;->getVabcFeatureSet()Ll/ܶܶ᩻;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/᩸۠᩻;->mergeVabcFeatureSet(Ll/ܶܶ᩻;)Ll/᩸۠᩻;

    .line 14714
    :cond_a
    invoke-virtual {p1}, Ll/᩹۠᩻;->hasCompressionFactor()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 14715
    invoke-virtual {p1}, Ll/᩹۠᩻;->getCompressionFactor()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ll/᩸۠᩻;->setCompressionFactor(J)Ll/᩸۠᩻;

    .line 14717
    :cond_b
    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩶ۘۖ;->mergeUnknownFields(Ll/ۢ֨ۖ;)Ll/᩶ۘۖ;

    .line 14718
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public mergeFrom(Ll/᩻֡ۖ;)Ll/᩸۠᩻;
    .locals 1

    .line 14661
    instance-of v0, p1, Ll/᩹۠᩻;

    if-eqz v0, :cond_0

    .line 14662
    check-cast p1, Ll/᩹۠᩻;

    invoke-virtual {p0, p1}, Ll/᩸۠᩻;->mergeFrom(Ll/᩹۠᩻;)Ll/᩸۠᩻;

    move-result-object p1

    return-object p1

    .line 14664
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public mergeVabcFeatureSet(Ll/ܶܶ᩻;)Ll/᩸۠᩻;
    .locals 2

    .line 15599
    iget-object v0, p0, Ll/᩸۠᩻;->vabcFeatureSetBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_1

    .line 15600
    iget v0, p0, Ll/᩸۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩸۠᩻;->vabcFeatureSet_:Ll/ܶܶ᩻;

    if-eqz v0, :cond_0

    .line 15602
    invoke-static {}, Ll/ܶܶ᩻;->getDefaultInstance()Ll/ܶܶ᩻;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 15603
    invoke-virtual {p0}, Ll/᩸۠᩻;->getVabcFeatureSetBuilder()Ll/۠ܶ᩻;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/۠ܶ᩻;->mergeFrom(Ll/ܶܶ᩻;)Ll/۠ܶ᩻;

    goto :goto_0

    .line 15605
    :cond_0
    iput-object p1, p0, Ll/᩸۠᩻;->vabcFeatureSet_:Ll/ܶܶ᩻;

    goto :goto_0

    .line 15608
    :cond_1
    invoke-virtual {v0, p1}, Ll/ܺۚۖ;->֫(Ll/ۘᩴۖ;)V

    .line 15610
    :goto_0
    iget-object p1, p0, Ll/᩸۠᩻;->vabcFeatureSet_:Ll/ܶܶ᩻;

    if-eqz p1, :cond_2

    .line 15611
    iget p1, p0, Ll/᩸۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x20

    iput p1, p0, Ll/᩸۠᩻;->bitField0_:I

    .line 15612
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    :cond_2
    return-object p0
.end method

.method public removeGroups(I)Ll/᩸۠᩻;
    .locals 1

    .line 15084
    iget-object v0, p0, Ll/᩸۠᩻;->groupsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 15085
    invoke-direct {p0}, Ll/᩸۠᩻;->ensureGroupsIsMutable()V

    .line 15086
    iget-object v0, p0, Ll/᩸۠᩻;->groups_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 15087
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 15089
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ᩳ(I)V

    return-object p0
.end method

.method public setCompressionFactor(J)Ll/᩸۠᩻;
    .locals 0

    .line 15720
    iput-wide p1, p0, Ll/᩸۠᩻;->compressionFactor_:J

    .line 15721
    iget p1, p0, Ll/᩸۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x40

    iput p1, p0, Ll/᩸۠᩻;->bitField0_:I

    .line 15722
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setCowVersion(I)Ll/᩸۠᩻;
    .locals 0

    .line 15503
    iput p1, p0, Ll/᩸۠᩻;->cowVersion_:I

    .line 15504
    iget p1, p0, Ll/᩸۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x10

    iput p1, p0, Ll/᩸۠᩻;->bitField0_:I

    .line 15505
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setGroups(ILl/֡۠᩻;)Ll/᩸۠᩻;
    .locals 1

    .line 14919
    iget-object v0, p0, Ll/᩸۠᩻;->groupsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 14920
    invoke-direct {p0}, Ll/᩸۠᩻;->ensureGroupsIsMutable()V

    .line 14921
    iget-object v0, p0, Ll/᩸۠᩻;->groups_:Ljava/util/List;

    invoke-virtual {p2}, Ll/֡۠᩻;->build()Ll/ۚ۠᩻;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 14922
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 14924
    :cond_0
    invoke-virtual {p2}, Ll/֡۠᩻;->build()Ll/ۚ۠᩻;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ll/ܳۚۖ;->ܽ(ILl/ۘᩴۖ;)V

    return-object p0
.end method

.method public setGroups(ILl/ۚ۠᩻;)Ll/᩸۠᩻;
    .locals 1

    .line 14893
    iget-object v0, p0, Ll/᩸۠᩻;->groupsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 14895
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14897
    invoke-direct {p0}, Ll/᩸۠᩻;->ensureGroupsIsMutable()V

    .line 14898
    iget-object v0, p0, Ll/᩸۠᩻;->groups_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 14899
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 14901
    :cond_0
    invoke-virtual {v0, p1, p2}, Ll/ܳۚۖ;->ܽ(ILl/ۘᩴۖ;)V

    return-object p0
.end method

.method public setSnapshotEnabled(Z)Ll/᩸۠᩻;
    .locals 0

    .line 15257
    iput-boolean p1, p0, Ll/᩸۠᩻;->snapshotEnabled_:Z

    .line 15258
    iget p1, p0, Ll/᩸۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Ll/᩸۠᩻;->bitField0_:I

    .line 15259
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setVabcCompressionParam(Ljava/lang/String;)Ll/᩸۠᩻;
    .locals 0

    .line 15422
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15423
    iput-object p1, p0, Ll/᩸۠᩻;->vabcCompressionParam_:Ljava/lang/Object;

    .line 15424
    iget p1, p0, Ll/᩸۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x8

    iput p1, p0, Ll/᩸۠᩻;->bitField0_:I

    .line 15425
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setVabcCompressionParamBytes(Ll/ۛۜۖ;)Ll/᩸۠᩻;
    .locals 0

    .line 15457
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15458
    iput-object p1, p0, Ll/᩸۠᩻;->vabcCompressionParam_:Ljava/lang/Object;

    .line 15459
    iget p1, p0, Ll/᩸۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x8

    iput p1, p0, Ll/᩸۠᩻;->bitField0_:I

    .line 15460
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setVabcEnabled(Z)Ll/᩸۠᩻;
    .locals 0

    .line 15325
    iput-boolean p1, p0, Ll/᩸۠᩻;->vabcEnabled_:Z

    .line 15326
    iget p1, p0, Ll/᩸۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Ll/᩸۠᩻;->bitField0_:I

    .line 15327
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setVabcFeatureSet(Ll/۠ܶ᩻;)Ll/᩸۠᩻;
    .locals 1

    .line 15582
    iget-object v0, p0, Ll/᩸۠᩻;->vabcFeatureSetBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 15583
    invoke-virtual {p1}, Ll/۠ܶ᩻;->build()Ll/ܶܶ᩻;

    move-result-object p1

    iput-object p1, p0, Ll/᩸۠᩻;->vabcFeatureSet_:Ll/ܶܶ᩻;

    goto :goto_0

    .line 15585
    :cond_0
    invoke-virtual {p1}, Ll/۠ܶ᩻;->build()Ll/ܶܶ᩻;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ܺۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    .line 15587
    :goto_0
    iget p1, p0, Ll/᩸۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x20

    iput p1, p0, Ll/᩸۠᩻;->bitField0_:I

    .line 15588
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setVabcFeatureSet(Ll/ܶܶ᩻;)Ll/᩸۠᩻;
    .locals 1

    .line 15561
    iget-object v0, p0, Ll/᩸۠᩻;->vabcFeatureSetBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 15563
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15565
    iput-object p1, p0, Ll/᩸۠᩻;->vabcFeatureSet_:Ll/ܶܶ᩻;

    goto :goto_0

    .line 15567
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܺۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    .line 15569
    :goto_0
    iget p1, p0, Ll/᩸۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x20

    iput p1, p0, Ll/᩸۠᩻;->bitField0_:I

    .line 15570
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method
