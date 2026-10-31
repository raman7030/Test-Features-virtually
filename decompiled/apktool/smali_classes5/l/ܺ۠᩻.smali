.class public final Ll/ܺ۠᩻;
.super Ll/᩶ۘۖ;
.source "C9PC"

# interfaces
.implements Ll/ᩴ۠᩻;


# instance fields
.field public apexInfoBuilder_:Ll/ܳۚۖ;

.field public apexInfo_:Ljava/util/List;

.field public bitField0_:I

.field public blockSize_:I

.field public dynamicPartitionMetadataBuilder_:Ll/ܺۚۖ;

.field public dynamicPartitionMetadata_:Ll/᩹۠᩻;

.field public maxTimestamp_:J

.field public minorVersion_:I

.field public partialUpdate_:Z

.field public partitionsBuilder_:Ll/ܳۚۖ;

.field public partitions_:Ljava/util/List;

.field public securityPatchLevel_:Ljava/lang/Object;

.field public signaturesOffset_:J

.field public signaturesSize_:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18491
    invoke-direct {p0}, Ll/᩶ۘۖ;-><init>()V

    const/16 v0, 0x1000

    .line 18842
    iput v0, p0, Ll/ܺ۠᩻;->blockSize_:I

    .line 19071
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ܺ۠᩻;->partitions_:Ljava/util/List;

    .line 19746
    iput-object v0, p0, Ll/ܺ۠᩻;->apexInfo_:Ljava/util/List;

    const-string v0, ""

    .line 20075
    iput-object v0, p0, Ll/ܺ۠᩻;->securityPatchLevel_:Ljava/lang/Object;

    .line 18492
    invoke-direct {p0}, Ll/ܺ۠᩻;->maybeForceBuilderInitialization()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܺ۠᩻;-><init>()V

    return-void
.end method

.method public constructor <init>(Ll/ۢۜۖ;)V
    .locals 0

    .line 18497
    invoke-direct {p0, p1}, Ll/᩶ۘۖ;-><init>(Ll/ۢۜۖ;)V

    const/16 p1, 0x1000

    .line 18842
    iput p1, p0, Ll/ܺ۠᩻;->blockSize_:I

    .line 19071
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Ll/ܺ۠᩻;->partitions_:Ljava/util/List;

    .line 19746
    iput-object p1, p0, Ll/ܺ۠᩻;->apexInfo_:Ljava/util/List;

    const-string p1, ""

    .line 20075
    iput-object p1, p0, Ll/ܺ۠᩻;->securityPatchLevel_:Ljava/lang/Object;

    .line 18498
    invoke-direct {p0}, Ll/ܺ۠᩻;->maybeForceBuilderInitialization()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۢۜۖ;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ܺ۠᩻;-><init>(Ll/ۢۜۖ;)V

    return-void
.end method

.method private buildPartial0(Ll/ۖ۠᩻;)V
    .locals 4

    .line 18592
    iget v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 18595
    iget v1, p0, Ll/ܺ۠᩻;->blockSize_:I

    invoke-static {p1, v1}, Ll/ۖ۠᩻;->-$$Nest$fputblockSize_(Ll/ۖ۠᩻;I)V

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    .line 18599
    iget-wide v2, p0, Ll/ܺ۠᩻;->signaturesOffset_:J

    invoke-static {p1, v2, v3}, Ll/ۖ۠᩻;->-$$Nest$fputsignaturesOffset_(Ll/ۖ۠᩻;J)V

    or-int/lit8 v1, v1, 0x2

    :cond_1
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_2

    .line 18603
    iget-wide v2, p0, Ll/ܺ۠᩻;->signaturesSize_:J

    invoke-static {p1, v2, v3}, Ll/ۖ۠᩻;->-$$Nest$fputsignaturesSize_(Ll/ۖ۠᩻;J)V

    or-int/lit8 v1, v1, 0x4

    :cond_2
    and-int/lit8 v2, v0, 0x8

    if-eqz v2, :cond_3

    .line 18607
    iget v2, p0, Ll/ܺ۠᩻;->minorVersion_:I

    invoke-static {p1, v2}, Ll/ۖ۠᩻;->-$$Nest$fputminorVersion_(Ll/ۖ۠᩻;I)V

    or-int/lit8 v1, v1, 0x8

    :cond_3
    and-int/lit8 v2, v0, 0x20

    if-eqz v2, :cond_4

    .line 18611
    iget-wide v2, p0, Ll/ܺ۠᩻;->maxTimestamp_:J

    invoke-static {p1, v2, v3}, Ll/ۖ۠᩻;->-$$Nest$fputmaxTimestamp_(Ll/ۖ۠᩻;J)V

    or-int/lit8 v1, v1, 0x10

    :cond_4
    and-int/lit8 v2, v0, 0x40

    if-eqz v2, :cond_6

    .line 18615
    iget-object v2, p0, Ll/ܺ۠᩻;->dynamicPartitionMetadataBuilder_:Ll/ܺۚۖ;

    if-nez v2, :cond_5

    .line 18616
    iget-object v2, p0, Ll/ܺ۠᩻;->dynamicPartitionMetadata_:Ll/᩹۠᩻;

    goto :goto_1

    .line 18617
    :cond_5
    invoke-virtual {v2}, Ll/ܺۚۖ;->ۧ()Ll/ۘᩴۖ;

    move-result-object v2

    check-cast v2, Ll/᩹۠᩻;

    :goto_1
    invoke-static {p1, v2}, Ll/ۖ۠᩻;->-$$Nest$fputdynamicPartitionMetadata_(Ll/ۖ۠᩻;Ll/᩹۠᩻;)V

    or-int/lit8 v1, v1, 0x20

    :cond_6
    and-int/lit16 v2, v0, 0x80

    if-eqz v2, :cond_7

    .line 18621
    iget-boolean v2, p0, Ll/ܺ۠᩻;->partialUpdate_:Z

    invoke-static {p1, v2}, Ll/ۖ۠᩻;->-$$Nest$fputpartialUpdate_(Ll/ۖ۠᩻;Z)V

    or-int/lit8 v1, v1, 0x40

    :cond_7
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_8

    .line 18625
    iget-object v0, p0, Ll/ܺ۠᩻;->securityPatchLevel_:Ljava/lang/Object;

    invoke-static {p1, v0}, Ll/ۖ۠᩻;->-$$Nest$fputsecurityPatchLevel_(Ll/ۖ۠᩻;Ljava/lang/Object;)V

    or-int/lit16 v1, v1, 0x80

    .line 18628
    :cond_8
    invoke-static {p1}, Ll/ۖ۠᩻;->-$$Nest$fgetbitField0_(Ll/ۖ۠᩻;)I

    move-result v0

    or-int/2addr v0, v1

    invoke-static {p1, v0}, Ll/ۖ۠᩻;->-$$Nest$fputbitField0_(Ll/ۖ۠᩻;I)V

    return-void
.end method

.method private buildPartialRepeatedFields(Ll/ۖ۠᩻;)V
    .locals 1

    .line 18571
    iget-object v0, p0, Ll/ܺ۠᩻;->partitionsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_1

    .line 18572
    iget v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    .line 18573
    iget-object v0, p0, Ll/ܺ۠᩻;->partitions_:Ljava/util/List;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ܺ۠᩻;->partitions_:Ljava/util/List;

    .line 18574
    iget v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    .line 18576
    :cond_0
    iget-object v0, p0, Ll/ܺ۠᩻;->partitions_:Ljava/util/List;

    invoke-static {p1, v0}, Ll/ۖ۠᩻;->-$$Nest$fputpartitions_(Ll/ۖ۠᩻;Ljava/util/List;)V

    goto :goto_0

    .line 18578
    :cond_1
    invoke-virtual {v0}, Ll/ܳۚۖ;->ۧ()Ljava/util/List;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۖ۠᩻;->-$$Nest$fputpartitions_(Ll/ۖ۠᩻;Ljava/util/List;)V

    .line 18580
    :goto_0
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfoBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_3

    .line 18581
    iget v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_2

    .line 18582
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfo_:Ljava/util/List;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ܺ۠᩻;->apexInfo_:Ljava/util/List;

    .line 18583
    iget v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    .line 18585
    :cond_2
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfo_:Ljava/util/List;

    invoke-static {p1, v0}, Ll/ۖ۠᩻;->-$$Nest$fputapexInfo_(Ll/ۖ۠᩻;Ljava/util/List;)V

    return-void

    .line 18587
    :cond_3
    invoke-virtual {v0}, Ll/ܳۚۖ;->ۧ()Ljava/util/List;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۖ۠᩻;->-$$Nest$fputapexInfo_(Ll/ۖ۠᩻;Ljava/util/List;)V

    return-void
.end method

.method private ensureApexInfoIsMutable()V
    .locals 2

    .line 19748
    iget v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    and-int/lit16 v0, v0, 0x100

    if-nez v0, :cond_0

    .line 19749
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ܺ۠᩻;->apexInfo_:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ll/ܺ۠᩻;->apexInfo_:Ljava/util/List;

    .line 19750
    iget v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    or-int/lit16 v0, v0, 0x100

    iput v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    :cond_0
    return-void
.end method

.method private ensurePartitionsIsMutable()V
    .locals 2

    .line 19073
    iget v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    if-nez v0, :cond_0

    .line 19074
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ܺ۠᩻;->partitions_:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ll/ܺ۠᩻;->partitions_:Ljava/util/List;

    .line 19075
    iget v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    :cond_0
    return-void
.end method

.method private getApexInfoFieldBuilder()Ll/ܳۚۖ;
    .locals 5

    .line 20063
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfoBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_1

    .line 20064
    new-instance v0, Ll/ܳۚۖ;

    iget-object v1, p0, Ll/ܺ۠᩻;->apexInfo_:Ljava/util/List;

    iget v2, p0, Ll/ܺ۠᩻;->bitField0_:I

    and-int/lit16 v2, v2, 0x100

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 20068
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v3

    .line 20069
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Ll/ܳۚۖ;-><init>(Ljava/util/List;ZLl/ۢۜۖ;Z)V

    iput-object v0, p0, Ll/ܺ۠᩻;->apexInfoBuilder_:Ll/ܳۚۖ;

    const/4 v0, 0x0

    .line 20070
    iput-object v0, p0, Ll/ܺ۠᩻;->apexInfo_:Ljava/util/List;

    .line 20072
    :cond_1
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfoBuilder_:Ll/ܳۚۖ;

    return-object v0
.end method

.method public static final getDescriptor()Ll/ᩳۖۖ;
    .locals 1

    .line 18479
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_DeltaArchiveManifest_descriptor()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method private getDynamicPartitionMetadataFieldBuilder()Ll/ܺۚۖ;
    .locals 4

    .line 19678
    iget-object v0, p0, Ll/ܺ۠᩻;->dynamicPartitionMetadataBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 19679
    new-instance v0, Ll/ܺۚۖ;

    .line 19681
    invoke-virtual {p0}, Ll/ܺ۠᩻;->getDynamicPartitionMetadata()Ll/᩹۠᩻;

    move-result-object v1

    .line 19682
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v2

    .line 19683
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Ll/ܺۚۖ;-><init>(Ll/ۘᩴۖ;Ll/ۢۜۖ;Z)V

    iput-object v0, p0, Ll/ܺ۠᩻;->dynamicPartitionMetadataBuilder_:Ll/ܺۚۖ;

    const/4 v0, 0x0

    .line 19684
    iput-object v0, p0, Ll/ܺ۠᩻;->dynamicPartitionMetadata_:Ll/᩹۠᩻;

    .line 19686
    :cond_0
    iget-object v0, p0, Ll/ܺ۠᩻;->dynamicPartitionMetadataBuilder_:Ll/ܺۚۖ;

    return-object v0
.end method

.method private getPartitionsFieldBuilder()Ll/ܳۚۖ;
    .locals 5

    .line 19460
    iget-object v0, p0, Ll/ܺ۠᩻;->partitionsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_1

    .line 19461
    new-instance v0, Ll/ܳۚۖ;

    iget-object v1, p0, Ll/ܺ۠᩻;->partitions_:Ljava/util/List;

    iget v2, p0, Ll/ܺ۠᩻;->bitField0_:I

    and-int/lit8 v2, v2, 0x10

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 19465
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v3

    .line 19466
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Ll/ܳۚۖ;-><init>(Ljava/util/List;ZLl/ۢۜۖ;Z)V

    iput-object v0, p0, Ll/ܺ۠᩻;->partitionsBuilder_:Ll/ܳۚۖ;

    const/4 v0, 0x0

    .line 19467
    iput-object v0, p0, Ll/ܺ۠᩻;->partitions_:Ljava/util/List;

    .line 19469
    :cond_1
    iget-object v0, p0, Ll/ܺ۠᩻;->partitionsBuilder_:Ll/ܳۚۖ;

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 18502
    invoke-static {}, Ll/ۖ۠᩻;->access$1100()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 18503
    invoke-direct {p0}, Ll/ܺ۠᩻;->getPartitionsFieldBuilder()Ll/ܳۚۖ;

    .line 18504
    invoke-direct {p0}, Ll/ܺ۠᩻;->getDynamicPartitionMetadataFieldBuilder()Ll/ܺۚۖ;

    .line 18505
    invoke-direct {p0}, Ll/ܺ۠᩻;->getApexInfoFieldBuilder()Ll/ܳۚۖ;

    :cond_0
    return-void
.end method


# virtual methods
.method public addAllApexInfo(Ljava/lang/Iterable;)Ll/ܺ۠᩻;
    .locals 1

    .line 19934
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfoBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 19935
    invoke-direct {p0}, Ll/ܺ۠᩻;->ensureApexInfoIsMutable()V

    .line 19936
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfo_:Ljava/util/List;

    invoke-static {p1, v0}, Ll/ۖۜۖ;->֫(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 19938
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 19940
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->֫(Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public addAllPartitions(Ljava/lang/Iterable;)Ll/ܺ۠᩻;
    .locals 1

    .line 19299
    iget-object v0, p0, Ll/ܺ۠᩻;->partitionsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 19300
    invoke-direct {p0}, Ll/ܺ۠᩻;->ensurePartitionsIsMutable()V

    .line 19301
    iget-object v0, p0, Ll/ܺ۠᩻;->partitions_:Ljava/util/List;

    invoke-static {p1, v0}, Ll/ۖۜۖ;->֫(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 19303
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 19305
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->֫(Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public addApexInfo(ILl/֫۠᩻;)Ll/ܺ۠᩻;
    .locals 1

    .line 19874
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfoBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 19876
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19878
    invoke-direct {p0}, Ll/ܺ۠᩻;->ensureApexInfoIsMutable()V

    .line 19879
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfo_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 19880
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 19882
    :cond_0
    invoke-virtual {v0, p1, p2}, Ll/ܳۚۖ;->ۧ(ILl/ۘᩴۖ;)V

    return-object p0
.end method

.method public addApexInfo(ILl/۟֨᩻;)Ll/ܺ۠᩻;
    .locals 1

    .line 19915
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfoBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 19916
    invoke-direct {p0}, Ll/ܺ۠᩻;->ensureApexInfoIsMutable()V

    .line 19917
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfo_:Ljava/util/List;

    invoke-virtual {p2}, Ll/۟֨᩻;->build()Ll/֫۠᩻;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 19918
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 19920
    :cond_0
    invoke-virtual {p2}, Ll/۟֨᩻;->build()Ll/֫۠᩻;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ll/ܳۚۖ;->ۧ(ILl/ۘᩴۖ;)V

    return-object p0
.end method

.method public addApexInfo(Ll/֫۠᩻;)Ll/ܺ۠᩻;
    .locals 1

    .line 19852
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfoBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 19854
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19856
    invoke-direct {p0}, Ll/ܺ۠᩻;->ensureApexInfoIsMutable()V

    .line 19857
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfo_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 19858
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 19860
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    return-object p0
.end method

.method public addApexInfo(Ll/۟֨᩻;)Ll/ܺ۠᩻;
    .locals 1

    .line 19896
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfoBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 19897
    invoke-direct {p0}, Ll/ܺ۠᩻;->ensureApexInfoIsMutable()V

    .line 19898
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfo_:Ljava/util/List;

    invoke-virtual {p1}, Ll/۟֨᩻;->build()Ll/֫۠᩻;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 19899
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 19901
    :cond_0
    invoke-virtual {p1}, Ll/۟֨᩻;->build()Ll/֫۠᩻;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    return-object p0
.end method

.method public addApexInfoBuilder()Ll/۟֨᩻;
    .locals 2

    .line 20032
    invoke-direct {p0}, Ll/ܺ۠᩻;->getApexInfoFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    .line 20033
    invoke-static {}, Ll/֫۠᩻;->getDefaultInstance()Ll/֫۠᩻;

    move-result-object v1

    .line 20032
    invoke-virtual {v0, v1}, Ll/ܳۚۖ;->֫(Ll/ۘᩴۖ;)Ll/᩶ۘۖ;

    move-result-object v0

    check-cast v0, Ll/۟֨᩻;

    return-object v0
.end method

.method public addApexInfoBuilder(I)Ll/۟֨᩻;
    .locals 2

    .line 20045
    invoke-direct {p0}, Ll/ܺ۠᩻;->getApexInfoFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    .line 20046
    invoke-static {}, Ll/֫۠᩻;->getDefaultInstance()Ll/֫۠᩻;

    move-result-object v1

    .line 20045
    invoke-virtual {v0, p1, v1}, Ll/ܳۚۖ;->֫(ILl/ۘᩴۖ;)Ll/᩶ۘۖ;

    move-result-object p1

    check-cast p1, Ll/۟֨᩻;

    return-object p1
.end method

.method public addPartitions(ILl/ۡܶ᩻;)Ll/ܺ۠᩻;
    .locals 1

    .line 19227
    iget-object v0, p0, Ll/ܺ۠᩻;->partitionsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 19229
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19231
    invoke-direct {p0}, Ll/ܺ۠᩻;->ensurePartitionsIsMutable()V

    .line 19232
    iget-object v0, p0, Ll/ܺ۠᩻;->partitions_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 19233
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 19235
    :cond_0
    invoke-virtual {v0, p1, p2}, Ll/ܳۚۖ;->ۧ(ILl/ۘᩴۖ;)V

    return-object p0
.end method

.method public addPartitions(ILl/ۢܶ᩻;)Ll/ܺ۠᩻;
    .locals 1

    .line 19276
    iget-object v0, p0, Ll/ܺ۠᩻;->partitionsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 19277
    invoke-direct {p0}, Ll/ܺ۠᩻;->ensurePartitionsIsMutable()V

    .line 19278
    iget-object v0, p0, Ll/ܺ۠᩻;->partitions_:Ljava/util/List;

    invoke-virtual {p2}, Ll/ۢܶ᩻;->build()Ll/ۡܶ᩻;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 19279
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 19281
    :cond_0
    invoke-virtual {p2}, Ll/ۢܶ᩻;->build()Ll/ۡܶ᩻;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ll/ܳۚۖ;->ۧ(ILl/ۘᩴۖ;)V

    return-object p0
.end method

.method public addPartitions(Ll/ۡܶ᩻;)Ll/ܺ۠᩻;
    .locals 1

    .line 19201
    iget-object v0, p0, Ll/ܺ۠᩻;->partitionsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 19203
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19205
    invoke-direct {p0}, Ll/ܺ۠᩻;->ensurePartitionsIsMutable()V

    .line 19206
    iget-object v0, p0, Ll/ܺ۠᩻;->partitions_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 19207
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 19209
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    return-object p0
.end method

.method public addPartitions(Ll/ۢܶ᩻;)Ll/ܺ۠᩻;
    .locals 1

    .line 19253
    iget-object v0, p0, Ll/ܺ۠᩻;->partitionsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 19254
    invoke-direct {p0}, Ll/ܺ۠᩻;->ensurePartitionsIsMutable()V

    .line 19255
    iget-object v0, p0, Ll/ܺ۠᩻;->partitions_:Ljava/util/List;

    invoke-virtual {p1}, Ll/ۢܶ᩻;->build()Ll/ۡܶ᩻;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 19256
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 19258
    :cond_0
    invoke-virtual {p1}, Ll/ۢܶ᩻;->build()Ll/ۡܶ᩻;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    return-object p0
.end method

.method public addPartitionsBuilder()Ll/ۢܶ᩻;
    .locals 2

    .line 19421
    invoke-direct {p0}, Ll/ܺ۠᩻;->getPartitionsFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    .line 19422
    invoke-static {}, Ll/ۡܶ᩻;->getDefaultInstance()Ll/ۡܶ᩻;

    move-result-object v1

    .line 19421
    invoke-virtual {v0, v1}, Ll/ܳۚۖ;->֫(Ll/ۘᩴۖ;)Ll/᩶ۘۖ;

    move-result-object v0

    check-cast v0, Ll/ۢܶ᩻;

    return-object v0
.end method

.method public addPartitionsBuilder(I)Ll/ۢܶ᩻;
    .locals 2

    .line 19438
    invoke-direct {p0}, Ll/ܺ۠᩻;->getPartitionsFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    .line 19439
    invoke-static {}, Ll/ۡܶ᩻;->getDefaultInstance()Ll/ۡܶ᩻;

    move-result-object v1

    .line 19438
    invoke-virtual {v0, p1, v1}, Ll/ܳۚۖ;->֫(ILl/ۘᩴۖ;)Ll/᩶ۘۖ;

    move-result-object p1

    check-cast p1, Ll/ۢܶ᩻;

    return-object p1
.end method

.method public build()Ll/ۖ۠᩻;
    .locals 2

    .line 18554
    invoke-virtual {p0}, Ll/ܺ۠᩻;->buildPartial()Ll/ۖ۠᩻;

    move-result-object v0

    .line 18555
    invoke-virtual {v0}, Ll/ۖ۠᩻;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 18556
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public bridge synthetic build()Ll/ۡ֡ۖ;
    .locals 1

    .line 18473
    invoke-virtual {p0}, Ll/ܺ۠᩻;->build()Ll/ۖ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Ll/᩻֡ۖ;
    .locals 1

    .line 18473
    invoke-virtual {p0}, Ll/ܺ۠᩻;->build()Ll/ۖ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Ll/ۖ۠᩻;
    .locals 2

    .line 18563
    new-instance v0, Ll/ۖ۠᩻;

    invoke-direct {v0, p0}, Ll/ۖ۠᩻;-><init>(Ll/ܺ۠᩻;)V

    .line 18564
    invoke-direct {p0, v0}, Ll/ܺ۠᩻;->buildPartialRepeatedFields(Ll/ۖ۠᩻;)V

    .line 18565
    iget v1, p0, Ll/ܺ۠᩻;->bitField0_:I

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, Ll/ܺ۠᩻;->buildPartial0(Ll/ۖ۠᩻;)V

    .line 18566
    :cond_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onBuilt()V

    return-object v0
.end method

.method public bridge synthetic buildPartial()Ll/ۡ֡ۖ;
    .locals 1

    .line 18473
    invoke-virtual {p0}, Ll/ܺ۠᩻;->buildPartial()Ll/ۖ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Ll/᩻֡ۖ;
    .locals 1

    .line 18473
    invoke-virtual {p0}, Ll/ܺ۠᩻;->buildPartial()Ll/ۖ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/ۢ֡ۖ;
    .locals 1

    .line 18473
    invoke-virtual {p0}, Ll/ܺ۠᩻;->clear()Ll/ܺ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/ܳ֡ۖ;
    .locals 1

    .line 18473
    invoke-virtual {p0}, Ll/ܺ۠᩻;->clear()Ll/ܺ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public clear()Ll/ܺ۠᩻;
    .locals 5

    .line 18510
    invoke-super {p0}, Ll/᩶ۘۖ;->clear()Ll/᩶ۘۖ;

    const/4 v0, 0x0

    .line 18511
    iput v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    const/16 v1, 0x1000

    .line 18512
    iput v1, p0, Ll/ܺ۠᩻;->blockSize_:I

    const-wide/16 v1, 0x0

    .line 18513
    iput-wide v1, p0, Ll/ܺ۠᩻;->signaturesOffset_:J

    .line 18514
    iput-wide v1, p0, Ll/ܺ۠᩻;->signaturesSize_:J

    .line 18515
    iput v0, p0, Ll/ܺ۠᩻;->minorVersion_:I

    .line 18516
    iget-object v3, p0, Ll/ܺ۠᩻;->partitionsBuilder_:Ll/ܳۚۖ;

    const/4 v4, 0x0

    if-nez v3, :cond_0

    .line 18517
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v3, p0, Ll/ܺ۠᩻;->partitions_:Ljava/util/List;

    goto :goto_0

    .line 18519
    :cond_0
    iput-object v4, p0, Ll/ܺ۠᩻;->partitions_:Ljava/util/List;

    .line 18520
    invoke-virtual {v3}, Ll/ܳۚۖ;->ܽ()V

    .line 18522
    :goto_0
    iget v3, p0, Ll/ܺ۠᩻;->bitField0_:I

    and-int/lit8 v3, v3, -0x11

    iput v3, p0, Ll/ܺ۠᩻;->bitField0_:I

    .line 18523
    iput-wide v1, p0, Ll/ܺ۠᩻;->maxTimestamp_:J

    .line 18524
    iput-object v4, p0, Ll/ܺ۠᩻;->dynamicPartitionMetadata_:Ll/᩹۠᩻;

    .line 18525
    iget-object v1, p0, Ll/ܺ۠᩻;->dynamicPartitionMetadataBuilder_:Ll/ܺۚۖ;

    if-eqz v1, :cond_1

    .line 18526
    invoke-virtual {v1}, Ll/ܺۚۖ;->ܽ()V

    .line 18527
    iput-object v4, p0, Ll/ܺ۠᩻;->dynamicPartitionMetadataBuilder_:Ll/ܺۚۖ;

    .line 18529
    :cond_1
    iput-boolean v0, p0, Ll/ܺ۠᩻;->partialUpdate_:Z

    .line 18530
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfoBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_2

    .line 18531
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ܺ۠᩻;->apexInfo_:Ljava/util/List;

    goto :goto_1

    .line 18533
    :cond_2
    iput-object v4, p0, Ll/ܺ۠᩻;->apexInfo_:Ljava/util/List;

    .line 18534
    invoke-virtual {v0}, Ll/ܳۚۖ;->ܽ()V

    .line 18536
    :goto_1
    iget v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    const-string v0, ""

    .line 18537
    iput-object v0, p0, Ll/ܺ۠᩻;->securityPatchLevel_:Ljava/lang/Object;

    return-object p0
.end method

.method public bridge synthetic clear()Ll/᩶ۘۖ;
    .locals 1

    .line 18473
    invoke-virtual {p0}, Ll/ܺ۠᩻;->clear()Ll/ܺ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/᩷ۜۖ;
    .locals 1

    .line 18473
    invoke-virtual {p0}, Ll/ܺ۠᩻;->clear()Ll/ܺ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public clearApexInfo()Ll/ܺ۠᩻;
    .locals 1

    .line 19953
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfoBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 19954
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ܺ۠᩻;->apexInfo_:Ljava/util/List;

    .line 19955
    iget v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    .line 19956
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 19958
    :cond_0
    invoke-virtual {v0}, Ll/ܳۚۖ;->ܽ()V

    return-object p0
.end method

.method public clearBlockSize()Ll/ܺ۠᩻;
    .locals 1

    .line 18892
    iget v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    const/16 v0, 0x1000

    .line 18893
    iput v0, p0, Ll/ܺ۠᩻;->blockSize_:I

    .line 18894
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearDynamicPartitionMetadata()Ll/ܺ۠᩻;
    .locals 2

    .line 19632
    iget v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    const/4 v0, 0x0

    .line 19633
    iput-object v0, p0, Ll/ܺ۠᩻;->dynamicPartitionMetadata_:Ll/᩹۠᩻;

    .line 19634
    iget-object v1, p0, Ll/ܺ۠᩻;->dynamicPartitionMetadataBuilder_:Ll/ܺۚۖ;

    if-eqz v1, :cond_0

    .line 19635
    invoke-virtual {v1}, Ll/ܺۚۖ;->ܽ()V

    .line 19636
    iput-object v0, p0, Ll/ܺ۠᩻;->dynamicPartitionMetadataBuilder_:Ll/ܺۚۖ;

    .line 19638
    :cond_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearMaxTimestamp()Ll/ܺ۠᩻;
    .locals 2

    .line 19526
    iget v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    const-wide/16 v0, 0x0

    .line 19527
    iput-wide v0, p0, Ll/ܺ۠᩻;->maxTimestamp_:J

    .line 19528
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearMinorVersion()Ll/ܺ۠᩻;
    .locals 1

    .line 19064
    iget v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    const/4 v0, 0x0

    .line 19065
    iput v0, p0, Ll/ܺ۠᩻;->minorVersion_:I

    .line 19066
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearPartialUpdate()Ll/ܺ۠᩻;
    .locals 1

    .line 19739
    iget v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    const/4 v0, 0x0

    .line 19740
    iput-boolean v0, p0, Ll/ܺ۠᩻;->partialUpdate_:Z

    .line 19741
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearPartitions()Ll/ܺ۠᩻;
    .locals 1

    .line 19322
    iget-object v0, p0, Ll/ܺ۠᩻;->partitionsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 19323
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ܺ۠᩻;->partitions_:Ljava/util/List;

    .line 19324
    iget v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    .line 19325
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 19327
    :cond_0
    invoke-virtual {v0}, Ll/ܳۚۖ;->ܽ()V

    return-object p0
.end method

.method public clearSecurityPatchLevel()Ll/ܺ۠᩻;
    .locals 1

    .line 20161
    invoke-static {}, Ll/ۖ۠᩻;->getDefaultInstance()Ll/ۖ۠᩻;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۖ۠᩻;->getSecurityPatchLevel()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܺ۠᩻;->securityPatchLevel_:Ljava/lang/Object;

    .line 20162
    iget v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    and-int/lit16 v0, v0, -0x201

    iput v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    .line 20163
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearSignaturesOffset()Ll/ܺ۠᩻;
    .locals 2

    .line 18964
    iget v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    const-wide/16 v0, 0x0

    .line 18965
    iput-wide v0, p0, Ll/ܺ۠᩻;->signaturesOffset_:J

    .line 18966
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearSignaturesSize()Ll/ܺ۠᩻;
    .locals 2

    .line 19004
    iget v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    const-wide/16 v0, 0x0

    .line 19005
    iput-wide v0, p0, Ll/ܺ۠᩻;->signaturesSize_:J

    .line 19006
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public getApexInfo(I)Ll/֫۠᩻;
    .locals 1

    .line 19796
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfoBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 19797
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfo_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֫۠᩻;

    return-object p1

    .line 19799
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ۧ(I)Ll/ۘᩴۖ;

    move-result-object p1

    check-cast p1, Ll/֫۠᩻;

    return-object p1
.end method

.method public getApexInfoBuilder(I)Ll/۟֨᩻;
    .locals 1

    .line 19990
    invoke-direct {p0}, Ll/ܺ۠᩻;->getApexInfoFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->֫(I)Ll/᩶ۘۖ;

    move-result-object p1

    check-cast p1, Ll/۟֨᩻;

    return-object p1
.end method

.method public getApexInfoBuilderList()Ljava/util/List;
    .locals 1

    .line 20058
    invoke-direct {p0}, Ll/ܺ۠᩻;->getApexInfoFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܳۚۖ;->ܿ()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getApexInfoCount()I
    .locals 1

    .line 19781
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfoBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 19782
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfo_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 19784
    :cond_0
    invoke-virtual {v0}, Ll/ܳۚۖ;->ܳ()I

    move-result v0

    return v0
.end method

.method public getApexInfoList()Ljava/util/List;
    .locals 1

    .line 19766
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfoBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 19767
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfo_:Ljava/util/List;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 19769
    :cond_0
    invoke-virtual {v0}, Ll/ܳۚۖ;->᩻()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getApexInfoOrBuilder(I)Ll/ܽ۠᩻;
    .locals 1

    .line 20002
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfoBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 20003
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfo_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܽ۠᩻;

    return-object p1

    .line 20004
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ܽ(I)Ll/ۘ֡ۖ;

    move-result-object p1

    check-cast p1, Ll/ܽ۠᩻;

    return-object p1
.end method

.method public getApexInfoOrBuilderList()Ljava/util/List;
    .locals 1

    .line 20017
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfoBuilder_:Ll/ܳۚۖ;

    if-eqz v0, :cond_0

    .line 20018
    invoke-virtual {v0}, Ll/ܳۚۖ;->ۜ()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 20020
    :cond_0
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfo_:Ljava/util/List;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getBlockSize()I
    .locals 1

    .line 18865
    iget v0, p0, Ll/ܺ۠᩻;->blockSize_:I

    return v0
.end method

.method public getDefaultInstanceForType()Ll/ۖ۠᩻;
    .locals 1

    .line 18549
    invoke-static {}, Ll/ۖ۠᩻;->getDefaultInstance()Ll/ۖ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 18473
    invoke-virtual {p0}, Ll/ܺ۠᩻;->getDefaultInstanceForType()Ll/ۖ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 18473
    invoke-virtual {p0}, Ll/ܺ۠᩻;->getDefaultInstanceForType()Ll/ۖ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Ll/ᩳۖۖ;
    .locals 1

    .line 18544
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_DeltaArchiveManifest_descriptor()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public getDynamicPartitionMetadata()Ll/᩹۠᩻;
    .locals 1

    .line 19555
    iget-object v0, p0, Ll/ܺ۠᩻;->dynamicPartitionMetadataBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_1

    .line 19556
    iget-object v0, p0, Ll/ܺ۠᩻;->dynamicPartitionMetadata_:Ll/᩹۠᩻;

    if-nez v0, :cond_0

    invoke-static {}, Ll/᩹۠᩻;->getDefaultInstance()Ll/᩹۠᩻;

    move-result-object v0

    :cond_0
    return-object v0

    .line 19558
    :cond_1
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܿ()Ll/ۘᩴۖ;

    move-result-object v0

    check-cast v0, Ll/᩹۠᩻;

    return-object v0
.end method

.method public getDynamicPartitionMetadataBuilder()Ll/᩸۠᩻;
    .locals 1

    .line 19649
    iget v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    .line 19650
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 19651
    invoke-direct {p0}, Ll/ܺ۠᩻;->getDynamicPartitionMetadataFieldBuilder()Ll/ܺۚۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v0

    check-cast v0, Ll/᩸۠᩻;

    return-object v0
.end method

.method public getDynamicPartitionMetadataOrBuilder()Ll/ۙ۠᩻;
    .locals 1

    .line 19661
    iget-object v0, p0, Ll/ܺ۠᩻;->dynamicPartitionMetadataBuilder_:Ll/ܺۚۖ;

    if-eqz v0, :cond_0

    .line 19662
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܳ()Ll/ۘ֡ۖ;

    move-result-object v0

    check-cast v0, Ll/ۙ۠᩻;

    return-object v0

    .line 19664
    :cond_0
    iget-object v0, p0, Ll/ܺ۠᩻;->dynamicPartitionMetadata_:Ll/᩹۠᩻;

    if-nez v0, :cond_1

    .line 19665
    invoke-static {}, Ll/᩹۠᩻;->getDefaultInstance()Ll/᩹۠᩻;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public getMaxTimestamp()J
    .locals 2

    .line 19497
    iget-wide v0, p0, Ll/ܺ۠᩻;->maxTimestamp_:J

    return-wide v0
.end method

.method public getMinorVersion()I
    .locals 1

    .line 19035
    iget v0, p0, Ll/ܺ۠᩻;->minorVersion_:I

    return v0
.end method

.method public getPartialUpdate()Z
    .locals 1

    .line 19712
    iget-boolean v0, p0, Ll/ܺ۠᩻;->partialUpdate_:Z

    return v0
.end method

.method public getPartitions(I)Ll/ۡܶ᩻;
    .locals 1

    .line 19133
    iget-object v0, p0, Ll/ܺ۠᩻;->partitionsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 19134
    iget-object v0, p0, Ll/ܺ۠᩻;->partitions_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۡܶ᩻;

    return-object p1

    .line 19136
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ۧ(I)Ll/ۘᩴۖ;

    move-result-object p1

    check-cast p1, Ll/ۡܶ᩻;

    return-object p1
.end method

.method public getPartitionsBuilder(I)Ll/ۢܶ᩻;
    .locals 1

    .line 19367
    invoke-direct {p0}, Ll/ܺ۠᩻;->getPartitionsFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->֫(I)Ll/᩶ۘۖ;

    move-result-object p1

    check-cast p1, Ll/ۢܶ᩻;

    return-object p1
.end method

.method public getPartitionsBuilderList()Ljava/util/List;
    .locals 1

    .line 19455
    invoke-direct {p0}, Ll/ܺ۠᩻;->getPartitionsFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܳۚۖ;->ܿ()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getPartitionsCount()I
    .locals 1

    .line 19114
    iget-object v0, p0, Ll/ܺ۠᩻;->partitionsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 19115
    iget-object v0, p0, Ll/ܺ۠᩻;->partitions_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 19117
    :cond_0
    invoke-virtual {v0}, Ll/ܳۚۖ;->ܳ()I

    move-result v0

    return v0
.end method

.method public getPartitionsList()Ljava/util/List;
    .locals 1

    .line 19095
    iget-object v0, p0, Ll/ܺ۠᩻;->partitionsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 19096
    iget-object v0, p0, Ll/ܺ۠᩻;->partitions_:Ljava/util/List;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 19098
    :cond_0
    invoke-virtual {v0}, Ll/ܳۚۖ;->᩻()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getPartitionsOrBuilder(I)Ll/ۖܶ᩻;
    .locals 1

    .line 19383
    iget-object v0, p0, Ll/ܺ۠᩻;->partitionsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 19384
    iget-object v0, p0, Ll/ܺ۠᩻;->partitions_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۖܶ᩻;

    return-object p1

    .line 19385
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ܽ(I)Ll/ۘ֡ۖ;

    move-result-object p1

    check-cast p1, Ll/ۖܶ᩻;

    return-object p1
.end method

.method public getPartitionsOrBuilderList()Ljava/util/List;
    .locals 1

    .line 19402
    iget-object v0, p0, Ll/ܺ۠᩻;->partitionsBuilder_:Ll/ܳۚۖ;

    if-eqz v0, :cond_0

    .line 19403
    invoke-virtual {v0}, Ll/ܳۚۖ;->ۜ()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 19405
    :cond_0
    iget-object v0, p0, Ll/ܺ۠᩻;->partitions_:Ljava/util/List;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getSecurityPatchLevel()Ljava/lang/String;
    .locals 2

    .line 20098
    iget-object v0, p0, Ll/ܺ۠᩻;->securityPatchLevel_:Ljava/lang/Object;

    .line 20099
    instance-of v1, v0, Ljava/lang/String;

    if-nez v1, :cond_1

    .line 20100
    check-cast v0, Ll/ۛۜۖ;

    .line 20102
    invoke-virtual {v0}, Ll/ۛۜۖ;->ܳ()Ljava/lang/String;

    move-result-object v1

    .line 20103
    invoke-virtual {v0}, Ll/ۛۜۖ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 20104
    iput-object v1, p0, Ll/ܺ۠᩻;->securityPatchLevel_:Ljava/lang/Object;

    :cond_0
    return-object v1

    .line 20108
    :cond_1
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getSecurityPatchLevelBytes()Ll/ۛۜۖ;
    .locals 2

    .line 20122
    iget-object v0, p0, Ll/ܺ۠᩻;->securityPatchLevel_:Ljava/lang/Object;

    .line 20123
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 20124
    check-cast v0, Ljava/lang/String;

    .line 20125
    invoke-static {v0}, Ll/ۛۜۖ;->֫(Ljava/lang/String;)Ll/ۛۜۖ;

    move-result-object v0

    .line 20127
    iput-object v0, p0, Ll/ܺ۠᩻;->securityPatchLevel_:Ljava/lang/Object;

    return-object v0

    .line 20130
    :cond_0
    check-cast v0, Ll/ۛۜۖ;

    return-object v0
.end method

.method public getSignaturesOffset()J
    .locals 2

    .line 18929
    iget-wide v0, p0, Ll/ܺ۠᩻;->signaturesOffset_:J

    return-wide v0
.end method

.method public getSignaturesSize()J
    .locals 2

    .line 18985
    iget-wide v0, p0, Ll/ܺ۠᩻;->signaturesSize_:J

    return-wide v0
.end method

.method public hasBlockSize()Z
    .locals 2

    .line 18853
    iget v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasDynamicPartitionMetadata()Z
    .locals 1

    .line 19544
    iget v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasMaxTimestamp()Z
    .locals 1

    .line 19484
    iget v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasMinorVersion()Z
    .locals 1

    .line 19022
    iget v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasPartialUpdate()Z
    .locals 1

    .line 19700
    iget v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasSecurityPatchLevel()Z
    .locals 1

    .line 20086
    iget v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasSignaturesOffset()Z
    .locals 1

    .line 18913
    iget v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasSignaturesSize()Z
    .locals 1

    .line 18977
    iget v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 18485
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_DeltaArchiveManifest_fieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/ۖ۠᩻;

    const-class v2, Ll/ܺ۠᩻;

    .line 18486
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 18728
    :goto_0
    invoke-virtual {p0}, Ll/ܺ۠᩻;->getPartitionsCount()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 18729
    invoke-virtual {p0, v1}, Ll/ܺ۠᩻;->getPartitions(I)Ll/ۡܶ᩻;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۡܶ᩻;->isInitialized()Z

    move-result v2

    if-nez v2, :cond_0

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 18733
    :cond_1
    invoke-virtual {p0}, Ll/ܺ۠᩻;->hasDynamicPartitionMetadata()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 18734
    invoke-virtual {p0}, Ll/ܺ۠᩻;->getDynamicPartitionMetadata()Ll/᩹۠᩻;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩹۠᩻;->isInitialized()Z

    move-result v1

    if-nez v1, :cond_2

    return v0

    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public mergeDynamicPartitionMetadata(Ll/᩹۠᩻;)Ll/ܺ۠᩻;
    .locals 2

    .line 19607
    iget-object v0, p0, Ll/ܺ۠᩻;->dynamicPartitionMetadataBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_1

    .line 19608
    iget v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܺ۠᩻;->dynamicPartitionMetadata_:Ll/᩹۠᩻;

    if-eqz v0, :cond_0

    .line 19610
    invoke-static {}, Ll/᩹۠᩻;->getDefaultInstance()Ll/᩹۠᩻;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 19611
    invoke-virtual {p0}, Ll/ܺ۠᩻;->getDynamicPartitionMetadataBuilder()Ll/᩸۠᩻;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/᩸۠᩻;->mergeFrom(Ll/᩹۠᩻;)Ll/᩸۠᩻;

    goto :goto_0

    .line 19613
    :cond_0
    iput-object p1, p0, Ll/ܺ۠᩻;->dynamicPartitionMetadata_:Ll/᩹۠᩻;

    goto :goto_0

    .line 19616
    :cond_1
    invoke-virtual {v0, p1}, Ll/ܺۚۖ;->֫(Ll/ۘᩴۖ;)V

    .line 19618
    :goto_0
    iget-object p1, p0, Ll/ܺ۠᩻;->dynamicPartitionMetadata_:Ll/᩹۠᩻;

    if-eqz p1, :cond_2

    .line 19619
    iget p1, p0, Ll/ܺ۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x40

    iput p1, p0, Ll/ܺ۠᩻;->bitField0_:I

    .line 19620
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    :cond_2
    return-object p0
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۖۜۖ;
    .locals 0

    .line 18473
    invoke-virtual {p0, p1, p2}, Ll/ܺ۠᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܺ۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 18473
    invoke-virtual {p0, p1, p2}, Ll/ܺ۠᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܺ۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 18473
    invoke-virtual {p0, p1, p2}, Ll/ܺ۠᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܺ۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 18473
    invoke-virtual {p0, p1}, Ll/ܺ۠᩻;->mergeFrom(Ll/᩻֡ۖ;)Ll/ܺ۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public mergeFrom(Ll/ۖ۠᩻;)Ll/ܺ۠᩻;
    .locals 4

    .line 18642
    invoke-static {}, Ll/ۖ۠᩻;->getDefaultInstance()Ll/ۖ۠᩻;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 18643
    :cond_0
    invoke-virtual {p1}, Ll/ۖ۠᩻;->hasBlockSize()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 18644
    invoke-virtual {p1}, Ll/ۖ۠᩻;->getBlockSize()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/ܺ۠᩻;->setBlockSize(I)Ll/ܺ۠᩻;

    .line 18646
    :cond_1
    invoke-virtual {p1}, Ll/ۖ۠᩻;->hasSignaturesOffset()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 18647
    invoke-virtual {p1}, Ll/ۖ۠᩻;->getSignaturesOffset()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ll/ܺ۠᩻;->setSignaturesOffset(J)Ll/ܺ۠᩻;

    .line 18649
    :cond_2
    invoke-virtual {p1}, Ll/ۖ۠᩻;->hasSignaturesSize()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 18650
    invoke-virtual {p1}, Ll/ۖ۠᩻;->getSignaturesSize()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ll/ܺ۠᩻;->setSignaturesSize(J)Ll/ܺ۠᩻;

    .line 18652
    :cond_3
    invoke-virtual {p1}, Ll/ۖ۠᩻;->hasMinorVersion()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 18653
    invoke-virtual {p1}, Ll/ۖ۠᩻;->getMinorVersion()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/ܺ۠᩻;->setMinorVersion(I)Ll/ܺ۠᩻;

    .line 18655
    :cond_4
    iget-object v0, p0, Ll/ܺ۠᩻;->partitionsBuilder_:Ll/ܳۚۖ;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    .line 18656
    invoke-static {p1}, Ll/ۖ۠᩻;->-$$Nest$fgetpartitions_(Ll/ۖ۠᩻;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9

    .line 18657
    iget-object v0, p0, Ll/ܺ۠᩻;->partitions_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 18658
    invoke-static {p1}, Ll/ۖ۠᩻;->-$$Nest$fgetpartitions_(Ll/ۖ۠᩻;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ܺ۠᩻;->partitions_:Ljava/util/List;

    .line 18659
    iget v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    goto :goto_0

    .line 18661
    :cond_5
    invoke-direct {p0}, Ll/ܺ۠᩻;->ensurePartitionsIsMutable()V

    .line 18662
    iget-object v0, p0, Ll/ܺ۠᩻;->partitions_:Ljava/util/List;

    invoke-static {p1}, Ll/ۖ۠᩻;->-$$Nest$fgetpartitions_(Ll/ۖ۠᩻;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 18664
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    goto :goto_2

    .line 18667
    :cond_6
    invoke-static {p1}, Ll/ۖ۠᩻;->-$$Nest$fgetpartitions_(Ll/ۖ۠᩻;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9

    .line 18668
    iget-object v0, p0, Ll/ܺ۠᩻;->partitionsBuilder_:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 18669
    iget-object v0, p0, Ll/ܺ۠᩻;->partitionsBuilder_:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->ᩳ()V

    .line 18670
    iput-object v1, p0, Ll/ܺ۠᩻;->partitionsBuilder_:Ll/ܳۚۖ;

    .line 18671
    invoke-static {p1}, Ll/ۖ۠᩻;->-$$Nest$fgetpartitions_(Ll/ۖ۠᩻;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ܺ۠᩻;->partitions_:Ljava/util/List;

    .line 18672
    iget v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    .line 18674
    invoke-static {}, Ll/ۖ۠᩻;->access$1200()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 18675
    invoke-direct {p0}, Ll/ܺ۠᩻;->getPartitionsFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    goto :goto_1

    :cond_7
    move-object v0, v1

    :goto_1
    iput-object v0, p0, Ll/ܺ۠᩻;->partitionsBuilder_:Ll/ܳۚۖ;

    goto :goto_2

    .line 18677
    :cond_8
    iget-object v0, p0, Ll/ܺ۠᩻;->partitionsBuilder_:Ll/ܳۚۖ;

    invoke-static {p1}, Ll/ۖ۠᩻;->-$$Nest$fgetpartitions_(Ll/ۖ۠᩻;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ܳۚۖ;->֫(Ljava/lang/Iterable;)V

    .line 18681
    :cond_9
    :goto_2
    invoke-virtual {p1}, Ll/ۖ۠᩻;->hasMaxTimestamp()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 18682
    invoke-virtual {p1}, Ll/ۖ۠᩻;->getMaxTimestamp()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Ll/ܺ۠᩻;->setMaxTimestamp(J)Ll/ܺ۠᩻;

    .line 18684
    :cond_a
    invoke-virtual {p1}, Ll/ۖ۠᩻;->hasDynamicPartitionMetadata()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 18685
    invoke-virtual {p1}, Ll/ۖ۠᩻;->getDynamicPartitionMetadata()Ll/᩹۠᩻;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ܺ۠᩻;->mergeDynamicPartitionMetadata(Ll/᩹۠᩻;)Ll/ܺ۠᩻;

    .line 18687
    :cond_b
    invoke-virtual {p1}, Ll/ۖ۠᩻;->hasPartialUpdate()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 18688
    invoke-virtual {p1}, Ll/ۖ۠᩻;->getPartialUpdate()Z

    move-result v0

    invoke-virtual {p0, v0}, Ll/ܺ۠᩻;->setPartialUpdate(Z)Ll/ܺ۠᩻;

    .line 18690
    :cond_c
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfoBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_e

    .line 18691
    invoke-static {p1}, Ll/ۖ۠᩻;->-$$Nest$fgetapexInfo_(Ll/ۖ۠᩻;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_11

    .line 18692
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfo_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 18693
    invoke-static {p1}, Ll/ۖ۠᩻;->-$$Nest$fgetapexInfo_(Ll/ۖ۠᩻;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ܺ۠᩻;->apexInfo_:Ljava/util/List;

    .line 18694
    iget v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    goto :goto_3

    .line 18696
    :cond_d
    invoke-direct {p0}, Ll/ܺ۠᩻;->ensureApexInfoIsMutable()V

    .line 18697
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfo_:Ljava/util/List;

    invoke-static {p1}, Ll/ۖ۠᩻;->-$$Nest$fgetapexInfo_(Ll/ۖ۠᩻;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 18699
    :goto_3
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    goto :goto_4

    .line 18702
    :cond_e
    invoke-static {p1}, Ll/ۖ۠᩻;->-$$Nest$fgetapexInfo_(Ll/ۖ۠᩻;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_11

    .line 18703
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfoBuilder_:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_10

    .line 18704
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfoBuilder_:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->ᩳ()V

    .line 18705
    iput-object v1, p0, Ll/ܺ۠᩻;->apexInfoBuilder_:Ll/ܳۚۖ;

    .line 18706
    invoke-static {p1}, Ll/ۖ۠᩻;->-$$Nest$fgetapexInfo_(Ll/ۖ۠᩻;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ܺ۠᩻;->apexInfo_:Ljava/util/List;

    .line 18707
    iget v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    .line 18709
    invoke-static {}, Ll/ۖ۠᩻;->access$1300()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 18710
    invoke-direct {p0}, Ll/ܺ۠᩻;->getApexInfoFieldBuilder()Ll/ܳۚۖ;

    move-result-object v1

    :cond_f
    iput-object v1, p0, Ll/ܺ۠᩻;->apexInfoBuilder_:Ll/ܳۚۖ;

    goto :goto_4

    .line 18712
    :cond_10
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfoBuilder_:Ll/ܳۚۖ;

    invoke-static {p1}, Ll/ۖ۠᩻;->-$$Nest$fgetapexInfo_(Ll/ۖ۠᩻;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܳۚۖ;->֫(Ljava/lang/Iterable;)V

    .line 18716
    :cond_11
    :goto_4
    invoke-virtual {p1}, Ll/ۖ۠᩻;->hasSecurityPatchLevel()Z

    move-result v0

    if-eqz v0, :cond_12

    .line 18717
    invoke-static {p1}, Ll/ۖ۠᩻;->-$$Nest$fgetsecurityPatchLevel_(Ll/ۖ۠᩻;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Ll/ܺ۠᩻;->securityPatchLevel_:Ljava/lang/Object;

    .line 18718
    iget v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    or-int/lit16 v0, v0, 0x200

    iput v0, p0, Ll/ܺ۠᩻;->bitField0_:I

    .line 18719
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 18721
    :cond_12
    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩶ۘۖ;->mergeUnknownFields(Ll/ۢ֨ۖ;)Ll/᩶ۘۖ;

    .line 18722
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܺ۠᩻;
    .locals 3

    .line 18747
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :cond_0
    :goto_0
    if-nez v0, :cond_3

    .line 18752
    :try_start_0
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܶ()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    .line 18826
    invoke-super {p0, p1, p2, v1}, Ll/᩶ۘۖ;->parseUnknownField(Ll/۟ۜۖ;Ll/ᩳۘۖ;I)Z

    move-result v1

    goto/16 :goto_1

    .line 18821
    :sswitch_0
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܳ()Ll/ۛۜۖ;

    move-result-object v1

    iput-object v1, p0, Ll/ܺ۠᩻;->securityPatchLevel_:Ljava/lang/Object;

    .line 18822
    iget v1, p0, Ll/ܺ۠᩻;->bitField0_:I

    or-int/lit16 v1, v1, 0x200

    iput v1, p0, Ll/ܺ۠᩻;->bitField0_:I

    goto :goto_0

    .line 18810
    :sswitch_1
    invoke-static {}, Ll/֫۠᩻;->parser()Ll/۫֡ۖ;

    move-result-object v1

    .line 18809
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/۫֡ۖ;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object v1

    check-cast v1, Ll/֫۠᩻;

    .line 18812
    iget-object v2, p0, Ll/ܺ۠᩻;->apexInfoBuilder_:Ll/ܳۚۖ;

    if-nez v2, :cond_1

    .line 18813
    invoke-direct {p0}, Ll/ܺ۠᩻;->ensureApexInfoIsMutable()V

    .line 18814
    iget-object v2, p0, Ll/ܺ۠᩻;->apexInfo_:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 18816
    :cond_1
    invoke-virtual {v2, v1}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    goto :goto_0

    .line 18803
    :sswitch_2
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܿ()Z

    move-result v1

    iput-boolean v1, p0, Ll/ܺ۠᩻;->partialUpdate_:Z

    .line 18804
    iget v1, p0, Ll/ܺ۠᩻;->bitField0_:I

    or-int/lit16 v1, v1, 0x80

    iput v1, p0, Ll/ܺ۠᩻;->bitField0_:I

    goto :goto_0

    .line 18797
    :sswitch_3
    invoke-direct {p0}, Ll/ܺ۠᩻;->getDynamicPartitionMetadataFieldBuilder()Ll/ܺۚۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v1

    .line 18796
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/ۢ֡ۖ;Ll/ᩳۘۖ;)V

    .line 18799
    iget v1, p0, Ll/ܺ۠᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x40

    iput v1, p0, Ll/ܺ۠᩻;->bitField0_:I

    goto :goto_0

    .line 18791
    :sswitch_4
    invoke-virtual {p1}, Ll/۟ۜۖ;->ۖ()J

    move-result-wide v1

    iput-wide v1, p0, Ll/ܺ۠᩻;->maxTimestamp_:J

    .line 18792
    iget v1, p0, Ll/ܺ۠᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x20

    iput v1, p0, Ll/ܺ۠᩻;->bitField0_:I

    goto :goto_0

    .line 18780
    :sswitch_5
    invoke-static {}, Ll/ۡܶ᩻;->parser()Ll/۫֡ۖ;

    move-result-object v1

    .line 18779
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/۫֡ۖ;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object v1

    check-cast v1, Ll/ۡܶ᩻;

    .line 18782
    iget-object v2, p0, Ll/ܺ۠᩻;->partitionsBuilder_:Ll/ܳۚۖ;

    if-nez v2, :cond_2

    .line 18783
    invoke-direct {p0}, Ll/ܺ۠᩻;->ensurePartitionsIsMutable()V

    .line 18784
    iget-object v2, p0, Ll/ܺ۠᩻;->partitions_:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 18786
    :cond_2
    invoke-virtual {v2, v1}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    goto :goto_0

    .line 18773
    :sswitch_6
    invoke-virtual {p1}, Ll/۟ۜۖ;->᩸()I

    move-result v1

    iput v1, p0, Ll/ܺ۠᩻;->minorVersion_:I

    .line 18774
    iget v1, p0, Ll/ܺ۠᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x8

    iput v1, p0, Ll/ܺ۠᩻;->bitField0_:I

    goto/16 :goto_0

    .line 18768
    :sswitch_7
    invoke-virtual {p1}, Ll/۟ۜۖ;->᩹()J

    move-result-wide v1

    iput-wide v1, p0, Ll/ܺ۠᩻;->signaturesSize_:J

    .line 18769
    iget v1, p0, Ll/ܺ۠᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Ll/ܺ۠᩻;->bitField0_:I

    goto/16 :goto_0

    .line 18763
    :sswitch_8
    invoke-virtual {p1}, Ll/۟ۜۖ;->᩹()J

    move-result-wide v1

    iput-wide v1, p0, Ll/ܺ۠᩻;->signaturesOffset_:J

    .line 18764
    iget v1, p0, Ll/ܺ۠᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x2

    iput v1, p0, Ll/ܺ۠᩻;->bitField0_:I

    goto/16 :goto_0

    .line 18758
    :sswitch_9
    invoke-virtual {p1}, Ll/۟ۜۖ;->᩸()I

    move-result v1

    iput v1, p0, Ll/ܺ۠᩻;->blockSize_:I

    .line 18759
    iget v1, p0, Ll/ܺ۠᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ܺ۠᩻;->bitField0_:I
    :try_end_0
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    :goto_1
    if-nez v1, :cond_0

    :sswitch_a
    const/4 v0, 0x1

    goto/16 :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 18834
    :try_start_1
    invoke-virtual {p1}, Ll/֫᩵ۖ;->֫()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18836
    :goto_2
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 18837
    throw p1

    .line 18836
    :cond_3
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_a
        0x18 -> :sswitch_9
        0x20 -> :sswitch_8
        0x28 -> :sswitch_7
        0x60 -> :sswitch_6
        0x6a -> :sswitch_5
        0x70 -> :sswitch_4
        0x7a -> :sswitch_3
        0x80 -> :sswitch_2
        0x8a -> :sswitch_1
        0x92 -> :sswitch_0
    .end sparse-switch
.end method

.method public mergeFrom(Ll/᩻֡ۖ;)Ll/ܺ۠᩻;
    .locals 1

    .line 18633
    instance-of v0, p1, Ll/ۖ۠᩻;

    if-eqz v0, :cond_0

    .line 18634
    check-cast p1, Ll/ۖ۠᩻;

    invoke-virtual {p0, p1}, Ll/ܺ۠᩻;->mergeFrom(Ll/ۖ۠᩻;)Ll/ܺ۠᩻;

    move-result-object p1

    return-object p1

    .line 18636
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 18473
    invoke-virtual {p0, p1, p2}, Ll/ܺ۠᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܺ۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 18473
    invoke-virtual {p0, p1}, Ll/ܺ۠᩻;->mergeFrom(Ll/᩻֡ۖ;)Ll/ܺ۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public removeApexInfo(I)Ll/ܺ۠᩻;
    .locals 1

    .line 19971
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfoBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 19972
    invoke-direct {p0}, Ll/ܺ۠᩻;->ensureApexInfoIsMutable()V

    .line 19973
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfo_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 19974
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 19976
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ᩳ(I)V

    return-object p0
.end method

.method public removePartitions(I)Ll/ܺ۠᩻;
    .locals 1

    .line 19344
    iget-object v0, p0, Ll/ܺ۠᩻;->partitionsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 19345
    invoke-direct {p0}, Ll/ܺ۠᩻;->ensurePartitionsIsMutable()V

    .line 19346
    iget-object v0, p0, Ll/ܺ۠᩻;->partitions_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 19347
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 19349
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ᩳ(I)V

    return-object p0
.end method

.method public setApexInfo(ILl/֫۠᩻;)Ll/ܺ۠᩻;
    .locals 1

    .line 19812
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfoBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 19814
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19816
    invoke-direct {p0}, Ll/ܺ۠᩻;->ensureApexInfoIsMutable()V

    .line 19817
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfo_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 19818
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 19820
    :cond_0
    invoke-virtual {v0, p1, p2}, Ll/ܳۚۖ;->ܽ(ILl/ۘᩴۖ;)V

    return-object p0
.end method

.method public setApexInfo(ILl/۟֨᩻;)Ll/ܺ۠᩻;
    .locals 1

    .line 19834
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfoBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 19835
    invoke-direct {p0}, Ll/ܺ۠᩻;->ensureApexInfoIsMutable()V

    .line 19836
    iget-object v0, p0, Ll/ܺ۠᩻;->apexInfo_:Ljava/util/List;

    invoke-virtual {p2}, Ll/۟֨᩻;->build()Ll/֫۠᩻;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 19837
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 19839
    :cond_0
    invoke-virtual {p2}, Ll/۟֨᩻;->build()Ll/֫۠᩻;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ll/ܳۚۖ;->ܽ(ILl/ۘᩴۖ;)V

    return-object p0
.end method

.method public setBlockSize(I)Ll/ܺ۠᩻;
    .locals 0

    .line 18878
    iput p1, p0, Ll/ܺ۠᩻;->blockSize_:I

    .line 18879
    iget p1, p0, Ll/ܺ۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ܺ۠᩻;->bitField0_:I

    .line 18880
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setDynamicPartitionMetadata(Ll/᩸۠᩻;)Ll/ܺ۠᩻;
    .locals 1

    .line 19590
    iget-object v0, p0, Ll/ܺ۠᩻;->dynamicPartitionMetadataBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 19591
    invoke-virtual {p1}, Ll/᩸۠᩻;->build()Ll/᩹۠᩻;

    move-result-object p1

    iput-object p1, p0, Ll/ܺ۠᩻;->dynamicPartitionMetadata_:Ll/᩹۠᩻;

    goto :goto_0

    .line 19593
    :cond_0
    invoke-virtual {p1}, Ll/᩸۠᩻;->build()Ll/᩹۠᩻;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ܺۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    .line 19595
    :goto_0
    iget p1, p0, Ll/ܺ۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x40

    iput p1, p0, Ll/ܺ۠᩻;->bitField0_:I

    .line 19596
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setDynamicPartitionMetadata(Ll/᩹۠᩻;)Ll/ܺ۠᩻;
    .locals 1

    .line 19569
    iget-object v0, p0, Ll/ܺ۠᩻;->dynamicPartitionMetadataBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 19571
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19573
    iput-object p1, p0, Ll/ܺ۠᩻;->dynamicPartitionMetadata_:Ll/᩹۠᩻;

    goto :goto_0

    .line 19575
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܺۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    .line 19577
    :goto_0
    iget p1, p0, Ll/ܺ۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x40

    iput p1, p0, Ll/ܺ۠᩻;->bitField0_:I

    .line 19578
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setMaxTimestamp(J)Ll/ܺ۠᩻;
    .locals 0

    .line 19511
    iput-wide p1, p0, Ll/ܺ۠᩻;->maxTimestamp_:J

    .line 19512
    iget p1, p0, Ll/ܺ۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x20

    iput p1, p0, Ll/ܺ۠᩻;->bitField0_:I

    .line 19513
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setMinorVersion(I)Ll/ܺ۠᩻;
    .locals 0

    .line 19049
    iput p1, p0, Ll/ܺ۠᩻;->minorVersion_:I

    .line 19050
    iget p1, p0, Ll/ܺ۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x8

    iput p1, p0, Ll/ܺ۠᩻;->bitField0_:I

    .line 19051
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setPartialUpdate(Z)Ll/ܺ۠᩻;
    .locals 0

    .line 19725
    iput-boolean p1, p0, Ll/ܺ۠᩻;->partialUpdate_:Z

    .line 19726
    iget p1, p0, Ll/ܺ۠᩻;->bitField0_:I

    or-int/lit16 p1, p1, 0x80

    iput p1, p0, Ll/ܺ۠᩻;->bitField0_:I

    .line 19727
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setPartitions(ILl/ۡܶ᩻;)Ll/ܺ۠᩻;
    .locals 1

    .line 19153
    iget-object v0, p0, Ll/ܺ۠᩻;->partitionsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 19155
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19157
    invoke-direct {p0}, Ll/ܺ۠᩻;->ensurePartitionsIsMutable()V

    .line 19158
    iget-object v0, p0, Ll/ܺ۠᩻;->partitions_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 19159
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 19161
    :cond_0
    invoke-virtual {v0, p1, p2}, Ll/ܳۚۖ;->ܽ(ILl/ۘᩴۖ;)V

    return-object p0
.end method

.method public setPartitions(ILl/ۢܶ᩻;)Ll/ܺ۠᩻;
    .locals 1

    .line 19179
    iget-object v0, p0, Ll/ܺ۠᩻;->partitionsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 19180
    invoke-direct {p0}, Ll/ܺ۠᩻;->ensurePartitionsIsMutable()V

    .line 19181
    iget-object v0, p0, Ll/ܺ۠᩻;->partitions_:Ljava/util/List;

    invoke-virtual {p2}, Ll/ۢܶ᩻;->build()Ll/ۡܶ᩻;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 19182
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 19184
    :cond_0
    invoke-virtual {p2}, Ll/ۢܶ᩻;->build()Ll/ۡܶ᩻;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ll/ܳۚۖ;->ܽ(ILl/ۘᩴۖ;)V

    return-object p0
.end method

.method public setSecurityPatchLevel(Ljava/lang/String;)Ll/ܺ۠᩻;
    .locals 0

    .line 20145
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20146
    iput-object p1, p0, Ll/ܺ۠᩻;->securityPatchLevel_:Ljava/lang/Object;

    .line 20147
    iget p1, p0, Ll/ܺ۠᩻;->bitField0_:I

    or-int/lit16 p1, p1, 0x200

    iput p1, p0, Ll/ܺ۠᩻;->bitField0_:I

    .line 20148
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setSecurityPatchLevelBytes(Ll/ۛۜۖ;)Ll/ܺ۠᩻;
    .locals 0

    .line 20178
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20179
    iput-object p1, p0, Ll/ܺ۠᩻;->securityPatchLevel_:Ljava/lang/Object;

    .line 20180
    iget p1, p0, Ll/ܺ۠᩻;->bitField0_:I

    or-int/lit16 p1, p1, 0x200

    iput p1, p0, Ll/ܺ۠᩻;->bitField0_:I

    .line 20181
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setSignaturesOffset(J)Ll/ܺ۠᩻;
    .locals 0

    .line 18946
    iput-wide p1, p0, Ll/ܺ۠᩻;->signaturesOffset_:J

    .line 18947
    iget p1, p0, Ll/ܺ۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Ll/ܺ۠᩻;->bitField0_:I

    .line 18948
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setSignaturesSize(J)Ll/ܺ۠᩻;
    .locals 0

    .line 18994
    iput-wide p1, p0, Ll/ܺ۠᩻;->signaturesSize_:J

    .line 18995
    iget p1, p0, Ll/ܺ۠᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Ll/ܺ۠᩻;->bitField0_:I

    .line 18996
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method
