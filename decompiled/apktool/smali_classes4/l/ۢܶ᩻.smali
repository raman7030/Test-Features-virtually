.class public final Ll/ۢܶ᩻;
.super Ll/᩶ۘۖ;
.source "C9PC"

# interfaces
.implements Ll/ۖܶ᩻;


# instance fields
.field public bitField0_:I

.field public estimateCowSize_:J

.field public estimateOpCountMax_:J

.field public fecDataExtentBuilder_:Ll/ܺۚۖ;

.field public fecDataExtent_:Ll/۫۠᩻;

.field public fecExtentBuilder_:Ll/ܺۚۖ;

.field public fecExtent_:Ll/۫۠᩻;

.field public fecRoots_:I

.field public filesystemType_:Ljava/lang/Object;

.field public hashTreeAlgorithm_:Ljava/lang/Object;

.field public hashTreeDataExtentBuilder_:Ll/ܺۚۖ;

.field public hashTreeDataExtent_:Ll/۫۠᩻;

.field public hashTreeExtentBuilder_:Ll/ܺۚۖ;

.field public hashTreeExtent_:Ll/۫۠᩻;

.field public hashTreeSalt_:Ll/ۛۜۖ;

.field public mergeOperationsBuilder_:Ll/ܳۚۖ;

.field public mergeOperations_:Ljava/util/List;

.field public newPartitionInfoBuilder_:Ll/ܺۚۖ;

.field public newPartitionInfo_:Ll/ܳܶ᩻;

.field public newPartitionSignatureBuilder_:Ll/ܳۚۖ;

.field public newPartitionSignature_:Ljava/util/List;

.field public oldPartitionInfoBuilder_:Ll/ܺۚۖ;

.field public oldPartitionInfo_:Ll/ܳܶ᩻;

.field public operationsBuilder_:Ll/ܳۚۖ;

.field public operations_:Ljava/util/List;

.field public partitionName_:Ljava/lang/Object;

.field public postinstallOptional_:Z

.field public postinstallPath_:Ljava/lang/Object;

.field public runPostinstall_:Z

.field public version_:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 8588
    invoke-direct {p0}, Ll/᩶ۘۖ;-><init>()V

    const-string v0, ""

    .line 9163
    iput-object v0, p0, Ll/ۢܶ᩻;->partitionName_:Ljava/lang/Object;

    .line 9337
    iput-object v0, p0, Ll/ۢܶ᩻;->postinstallPath_:Ljava/lang/Object;

    .line 9459
    iput-object v0, p0, Ll/ۢܶ᩻;->filesystemType_:Ljava/lang/Object;

    .line 9582
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, p0, Ll/ۢܶ᩻;->newPartitionSignature_:Ljava/util/List;

    .line 10190
    iput-object v1, p0, Ll/ۢܶ᩻;->operations_:Ljava/util/List;

    .line 10920
    iput-object v0, p0, Ll/ۢܶ᩻;->hashTreeAlgorithm_:Ljava/lang/Object;

    .line 11024
    sget-object v2, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    iput-object v2, p0, Ll/ۢܶ᩻;->hashTreeSalt_:Ll/ۛۜۖ;

    const/4 v2, 0x2

    .line 11394
    iput v2, p0, Ll/ۢܶ᩻;->fecRoots_:I

    .line 11450
    iput-object v0, p0, Ll/ۢܶ᩻;->version_:Ljava/lang/Object;

    .line 11567
    iput-object v1, p0, Ll/ۢܶ᩻;->mergeOperations_:Ljava/util/List;

    .line 8589
    invoke-direct {p0}, Ll/ۢܶ᩻;->maybeForceBuilderInitialization()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۢܶ᩻;-><init>()V

    return-void
.end method

.method public constructor <init>(Ll/ۢۜۖ;)V
    .locals 2

    .line 8594
    invoke-direct {p0, p1}, Ll/᩶ۘۖ;-><init>(Ll/ۢۜۖ;)V

    const-string p1, ""

    .line 9163
    iput-object p1, p0, Ll/ۢܶ᩻;->partitionName_:Ljava/lang/Object;

    .line 9337
    iput-object p1, p0, Ll/ۢܶ᩻;->postinstallPath_:Ljava/lang/Object;

    .line 9459
    iput-object p1, p0, Ll/ۢܶ᩻;->filesystemType_:Ljava/lang/Object;

    .line 9582
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignature_:Ljava/util/List;

    .line 10190
    iput-object v0, p0, Ll/ۢܶ᩻;->operations_:Ljava/util/List;

    .line 10920
    iput-object p1, p0, Ll/ۢܶ᩻;->hashTreeAlgorithm_:Ljava/lang/Object;

    .line 11024
    sget-object v1, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    iput-object v1, p0, Ll/ۢܶ᩻;->hashTreeSalt_:Ll/ۛۜۖ;

    const/4 v1, 0x2

    .line 11394
    iput v1, p0, Ll/ۢܶ᩻;->fecRoots_:I

    .line 11450
    iput-object p1, p0, Ll/ۢܶ᩻;->version_:Ljava/lang/Object;

    .line 11567
    iput-object v0, p0, Ll/ۢܶ᩻;->mergeOperations_:Ljava/util/List;

    .line 8595
    invoke-direct {p0}, Ll/ۢܶ᩻;->maybeForceBuilderInitialization()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۢۜۖ;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ۢܶ᩻;-><init>(Ll/ۢۜۖ;)V

    return-void
.end method

.method private buildPartial0(Ll/ۡܶ᩻;)V
    .locals 6

    .line 8740
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 8743
    iget-object v1, p0, Ll/ۢܶ᩻;->partitionName_:Ljava/lang/Object;

    invoke-static {p1, v1}, Ll/ۡܶ᩻;->-$$Nest$fputpartitionName_(Ll/ۡܶ᩻;Ljava/lang/Object;)V

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    .line 8747
    iget-boolean v2, p0, Ll/ۢܶ᩻;->runPostinstall_:Z

    invoke-static {p1, v2}, Ll/ۡܶ᩻;->-$$Nest$fputrunPostinstall_(Ll/ۡܶ᩻;Z)V

    or-int/lit8 v1, v1, 0x2

    :cond_1
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_2

    .line 8751
    iget-object v2, p0, Ll/ۢܶ᩻;->postinstallPath_:Ljava/lang/Object;

    invoke-static {p1, v2}, Ll/ۡܶ᩻;->-$$Nest$fputpostinstallPath_(Ll/ۡܶ᩻;Ljava/lang/Object;)V

    or-int/lit8 v1, v1, 0x4

    :cond_2
    and-int/lit8 v2, v0, 0x8

    if-eqz v2, :cond_3

    .line 8755
    iget-object v2, p0, Ll/ۢܶ᩻;->filesystemType_:Ljava/lang/Object;

    invoke-static {p1, v2}, Ll/ۡܶ᩻;->-$$Nest$fputfilesystemType_(Ll/ۡܶ᩻;Ljava/lang/Object;)V

    or-int/lit8 v1, v1, 0x8

    :cond_3
    and-int/lit8 v2, v0, 0x20

    if-eqz v2, :cond_5

    .line 8759
    iget-object v2, p0, Ll/ۢܶ᩻;->oldPartitionInfoBuilder_:Ll/ܺۚۖ;

    if-nez v2, :cond_4

    .line 8760
    iget-object v2, p0, Ll/ۢܶ᩻;->oldPartitionInfo_:Ll/ܳܶ᩻;

    goto :goto_1

    .line 8761
    :cond_4
    invoke-virtual {v2}, Ll/ܺۚۖ;->ۧ()Ll/ۘᩴۖ;

    move-result-object v2

    check-cast v2, Ll/ܳܶ᩻;

    :goto_1
    invoke-static {p1, v2}, Ll/ۡܶ᩻;->-$$Nest$fputoldPartitionInfo_(Ll/ۡܶ᩻;Ll/ܳܶ᩻;)V

    or-int/lit8 v1, v1, 0x10

    :cond_5
    and-int/lit8 v2, v0, 0x40

    if-eqz v2, :cond_7

    .line 8765
    iget-object v2, p0, Ll/ۢܶ᩻;->newPartitionInfoBuilder_:Ll/ܺۚۖ;

    if-nez v2, :cond_6

    .line 8766
    iget-object v2, p0, Ll/ۢܶ᩻;->newPartitionInfo_:Ll/ܳܶ᩻;

    goto :goto_2

    .line 8767
    :cond_6
    invoke-virtual {v2}, Ll/ܺۚۖ;->ۧ()Ll/ۘᩴۖ;

    move-result-object v2

    check-cast v2, Ll/ܳܶ᩻;

    :goto_2
    invoke-static {p1, v2}, Ll/ۡܶ᩻;->-$$Nest$fputnewPartitionInfo_(Ll/ۡܶ᩻;Ll/ܳܶ᩻;)V

    or-int/lit8 v1, v1, 0x20

    :cond_7
    and-int/lit16 v2, v0, 0x100

    if-eqz v2, :cond_8

    .line 8771
    iget-boolean v2, p0, Ll/ۢܶ᩻;->postinstallOptional_:Z

    invoke-static {p1, v2}, Ll/ۡܶ᩻;->-$$Nest$fputpostinstallOptional_(Ll/ۡܶ᩻;Z)V

    or-int/lit8 v1, v1, 0x40

    :cond_8
    and-int/lit16 v2, v0, 0x200

    if-eqz v2, :cond_a

    .line 8775
    iget-object v2, p0, Ll/ۢܶ᩻;->hashTreeDataExtentBuilder_:Ll/ܺۚۖ;

    if-nez v2, :cond_9

    .line 8776
    iget-object v2, p0, Ll/ۢܶ᩻;->hashTreeDataExtent_:Ll/۫۠᩻;

    goto :goto_3

    .line 8777
    :cond_9
    invoke-virtual {v2}, Ll/ܺۚۖ;->ۧ()Ll/ۘᩴۖ;

    move-result-object v2

    check-cast v2, Ll/۫۠᩻;

    :goto_3
    invoke-static {p1, v2}, Ll/ۡܶ᩻;->-$$Nest$fputhashTreeDataExtent_(Ll/ۡܶ᩻;Ll/۫۠᩻;)V

    or-int/lit16 v1, v1, 0x80

    :cond_a
    and-int/lit16 v2, v0, 0x400

    if-eqz v2, :cond_c

    .line 8781
    iget-object v2, p0, Ll/ۢܶ᩻;->hashTreeExtentBuilder_:Ll/ܺۚۖ;

    if-nez v2, :cond_b

    .line 8782
    iget-object v2, p0, Ll/ۢܶ᩻;->hashTreeExtent_:Ll/۫۠᩻;

    goto :goto_4

    .line 8783
    :cond_b
    invoke-virtual {v2}, Ll/ܺۚۖ;->ۧ()Ll/ۘᩴۖ;

    move-result-object v2

    check-cast v2, Ll/۫۠᩻;

    :goto_4
    invoke-static {p1, v2}, Ll/ۡܶ᩻;->-$$Nest$fputhashTreeExtent_(Ll/ۡܶ᩻;Ll/۫۠᩻;)V

    or-int/lit16 v1, v1, 0x100

    :cond_c
    and-int/lit16 v2, v0, 0x800

    if-eqz v2, :cond_d

    .line 8787
    iget-object v2, p0, Ll/ۢܶ᩻;->hashTreeAlgorithm_:Ljava/lang/Object;

    invoke-static {p1, v2}, Ll/ۡܶ᩻;->-$$Nest$fputhashTreeAlgorithm_(Ll/ۡܶ᩻;Ljava/lang/Object;)V

    or-int/lit16 v1, v1, 0x200

    :cond_d
    and-int/lit16 v2, v0, 0x1000

    if-eqz v2, :cond_e

    .line 8791
    iget-object v2, p0, Ll/ۢܶ᩻;->hashTreeSalt_:Ll/ۛۜۖ;

    invoke-static {p1, v2}, Ll/ۡܶ᩻;->-$$Nest$fputhashTreeSalt_(Ll/ۡܶ᩻;Ll/ۛۜۖ;)V

    or-int/lit16 v1, v1, 0x400

    :cond_e
    and-int/lit16 v2, v0, 0x2000

    if-eqz v2, :cond_10

    .line 8795
    iget-object v2, p0, Ll/ۢܶ᩻;->fecDataExtentBuilder_:Ll/ܺۚۖ;

    if-nez v2, :cond_f

    .line 8796
    iget-object v2, p0, Ll/ۢܶ᩻;->fecDataExtent_:Ll/۫۠᩻;

    goto :goto_5

    .line 8797
    :cond_f
    invoke-virtual {v2}, Ll/ܺۚۖ;->ۧ()Ll/ۘᩴۖ;

    move-result-object v2

    check-cast v2, Ll/۫۠᩻;

    :goto_5
    invoke-static {p1, v2}, Ll/ۡܶ᩻;->-$$Nest$fputfecDataExtent_(Ll/ۡܶ᩻;Ll/۫۠᩻;)V

    or-int/lit16 v1, v1, 0x800

    :cond_10
    and-int/lit16 v2, v0, 0x4000

    if-eqz v2, :cond_12

    .line 8801
    iget-object v2, p0, Ll/ۢܶ᩻;->fecExtentBuilder_:Ll/ܺۚۖ;

    if-nez v2, :cond_11

    .line 8802
    iget-object v2, p0, Ll/ۢܶ᩻;->fecExtent_:Ll/۫۠᩻;

    goto :goto_6

    .line 8803
    :cond_11
    invoke-virtual {v2}, Ll/ܺۚۖ;->ۧ()Ll/ۘᩴۖ;

    move-result-object v2

    check-cast v2, Ll/۫۠᩻;

    :goto_6
    invoke-static {p1, v2}, Ll/ۡܶ᩻;->-$$Nest$fputfecExtent_(Ll/ۡܶ᩻;Ll/۫۠᩻;)V

    or-int/lit16 v1, v1, 0x1000

    :cond_12
    const v2, 0x8000

    and-int v3, v0, v2

    if-eqz v3, :cond_13

    .line 8807
    iget v3, p0, Ll/ۢܶ᩻;->fecRoots_:I

    invoke-static {v3, p1}, Ll/ۡܶ᩻;->-$$Nest$fputfecRoots_(ILl/ۡܶ᩻;)V

    or-int/lit16 v1, v1, 0x2000

    :cond_13
    const/high16 v3, 0x10000

    and-int v4, v0, v3

    if-eqz v4, :cond_14

    .line 8811
    iget-object v4, p0, Ll/ۢܶ᩻;->version_:Ljava/lang/Object;

    invoke-static {p1, v4}, Ll/ۡܶ᩻;->-$$Nest$fputversion_(Ll/ۡܶ᩻;Ljava/lang/Object;)V

    or-int/lit16 v1, v1, 0x4000

    :cond_14
    const/high16 v4, 0x40000

    and-int/2addr v4, v0

    if-eqz v4, :cond_15

    .line 8815
    iget-wide v4, p0, Ll/ۢܶ᩻;->estimateCowSize_:J

    invoke-static {p1, v4, v5}, Ll/ۡܶ᩻;->-$$Nest$fputestimateCowSize_(Ll/ۡܶ᩻;J)V

    or-int/2addr v1, v2

    :cond_15
    const/high16 v2, 0x80000

    and-int/2addr v0, v2

    if-eqz v0, :cond_16

    .line 8819
    iget-wide v4, p0, Ll/ۢܶ᩻;->estimateOpCountMax_:J

    invoke-static {p1, v4, v5}, Ll/ۡܶ᩻;->-$$Nest$fputestimateOpCountMax_(Ll/ۡܶ᩻;J)V

    or-int/2addr v1, v3

    .line 8822
    :cond_16
    invoke-static {p1}, Ll/ۡܶ᩻;->-$$Nest$fgetbitField0_(Ll/ۡܶ᩻;)I

    move-result v0

    or-int/2addr v0, v1

    invoke-static {v0, p1}, Ll/ۡܶ᩻;->-$$Nest$fputbitField0_(ILl/ۡܶ᩻;)V

    return-void
.end method

.method private buildPartialRepeatedFields(Ll/ۡܶ᩻;)V
    .locals 2

    .line 8710
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignatureBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_1

    .line 8711
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    .line 8712
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignature_:Ljava/util/List;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignature_:Ljava/util/List;

    .line 8713
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 8715
    :cond_0
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignature_:Ljava/util/List;

    invoke-static {p1, v0}, Ll/ۡܶ᩻;->-$$Nest$fputnewPartitionSignature_(Ll/ۡܶ᩻;Ljava/util/List;)V

    goto :goto_0

    .line 8717
    :cond_1
    invoke-virtual {v0}, Ll/ܳۚۖ;->ۧ()Ljava/util/List;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۡܶ᩻;->-$$Nest$fputnewPartitionSignature_(Ll/ۡܶ᩻;Ljava/util/List;)V

    .line 8719
    :goto_0
    iget-object v0, p0, Ll/ۢܶ᩻;->operationsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_3

    .line 8720
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_2

    .line 8721
    iget-object v0, p0, Ll/ۢܶ᩻;->operations_:Ljava/util/List;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ۢܶ᩻;->operations_:Ljava/util/List;

    .line 8722
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 8724
    :cond_2
    iget-object v0, p0, Ll/ۢܶ᩻;->operations_:Ljava/util/List;

    invoke-static {p1, v0}, Ll/ۡܶ᩻;->-$$Nest$fputoperations_(Ll/ۡܶ᩻;Ljava/util/List;)V

    goto :goto_1

    .line 8726
    :cond_3
    invoke-virtual {v0}, Ll/ܳۚۖ;->ۧ()Ljava/util/List;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۡܶ᩻;->-$$Nest$fputoperations_(Ll/ۡܶ᩻;Ljava/util/List;)V

    .line 8728
    :goto_1
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperationsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_5

    .line 8729
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    const/high16 v1, 0x20000

    and-int/2addr v0, v1

    if-eqz v0, :cond_4

    .line 8730
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperations_:Ljava/util/List;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ۢܶ᩻;->mergeOperations_:Ljava/util/List;

    .line 8731
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    const v1, -0x20001

    and-int/2addr v0, v1

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 8733
    :cond_4
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperations_:Ljava/util/List;

    invoke-static {p1, v0}, Ll/ۡܶ᩻;->-$$Nest$fputmergeOperations_(Ll/ۡܶ᩻;Ljava/util/List;)V

    return-void

    .line 8735
    :cond_5
    invoke-virtual {v0}, Ll/ܳۚۖ;->ۧ()Ljava/util/List;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۡܶ᩻;->-$$Nest$fputmergeOperations_(Ll/ۡܶ᩻;Ljava/util/List;)V

    return-void
.end method

.method private ensureMergeOperationsIsMutable()V
    .locals 3

    .line 11569
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    const/high16 v1, 0x20000

    and-int/2addr v0, v1

    if-nez v0, :cond_0

    .line 11570
    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Ll/ۢܶ᩻;->mergeOperations_:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ll/ۢܶ᩻;->mergeOperations_:Ljava/util/List;

    .line 11571
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/2addr v0, v1

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    :cond_0
    return-void
.end method

.method private ensureNewPartitionSignatureIsMutable()V
    .locals 2

    .line 9584
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    if-nez v0, :cond_0

    .line 9585
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ۢܶ᩻;->newPartitionSignature_:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignature_:Ljava/util/List;

    .line 9586
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    :cond_0
    return-void
.end method

.method private ensureOperationsIsMutable()V
    .locals 2

    .line 10192
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit16 v0, v0, 0x80

    if-nez v0, :cond_0

    .line 10193
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ۢܶ᩻;->operations_:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ll/ۢܶ᩻;->operations_:Ljava/util/List;

    .line 10194
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    :cond_0
    return-void
.end method

.method public static final getDescriptor()Ll/ᩳۖۖ;
    .locals 1

    .line 8576
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_PartitionUpdate_descriptor()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method private getFecDataExtentFieldBuilder()Ll/ܺۚۖ;
    .locals 4

    .line 11226
    iget-object v0, p0, Ll/ۢܶ᩻;->fecDataExtentBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 11227
    new-instance v0, Ll/ܺۚۖ;

    .line 11229
    invoke-virtual {p0}, Ll/ۢܶ᩻;->getFecDataExtent()Ll/۫۠᩻;

    move-result-object v1

    .line 11230
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v2

    .line 11231
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Ll/ܺۚۖ;-><init>(Ll/ۘᩴۖ;Ll/ۢۜۖ;Z)V

    iput-object v0, p0, Ll/ۢܶ᩻;->fecDataExtentBuilder_:Ll/ܺۚۖ;

    const/4 v0, 0x0

    .line 11232
    iput-object v0, p0, Ll/ۢܶ᩻;->fecDataExtent_:Ll/۫۠᩻;

    .line 11234
    :cond_0
    iget-object v0, p0, Ll/ۢܶ᩻;->fecDataExtentBuilder_:Ll/ܺۚۖ;

    return-object v0
.end method

.method private getFecExtentFieldBuilder()Ll/ܺۚۖ;
    .locals 4

    .line 11383
    iget-object v0, p0, Ll/ۢܶ᩻;->fecExtentBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 11384
    new-instance v0, Ll/ܺۚۖ;

    .line 11386
    invoke-virtual {p0}, Ll/ۢܶ᩻;->getFecExtent()Ll/۫۠᩻;

    move-result-object v1

    .line 11387
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v2

    .line 11388
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Ll/ܺۚۖ;-><init>(Ll/ۘᩴۖ;Ll/ۢۜۖ;Z)V

    iput-object v0, p0, Ll/ۢܶ᩻;->fecExtentBuilder_:Ll/ܺۚۖ;

    const/4 v0, 0x0

    .line 11389
    iput-object v0, p0, Ll/ۢܶ᩻;->fecExtent_:Ll/۫۠᩻;

    .line 11391
    :cond_0
    iget-object v0, p0, Ll/ۢܶ᩻;->fecExtentBuilder_:Ll/ܺۚۖ;

    return-object v0
.end method

.method private getHashTreeDataExtentFieldBuilder()Ll/ܺۚۖ;
    .locals 4

    .line 10752
    iget-object v0, p0, Ll/ۢܶ᩻;->hashTreeDataExtentBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 10753
    new-instance v0, Ll/ܺۚۖ;

    .line 10755
    invoke-virtual {p0}, Ll/ۢܶ᩻;->getHashTreeDataExtent()Ll/۫۠᩻;

    move-result-object v1

    .line 10756
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v2

    .line 10757
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Ll/ܺۚۖ;-><init>(Ll/ۘᩴۖ;Ll/ۢۜۖ;Z)V

    iput-object v0, p0, Ll/ۢܶ᩻;->hashTreeDataExtentBuilder_:Ll/ܺۚۖ;

    const/4 v0, 0x0

    .line 10758
    iput-object v0, p0, Ll/ۢܶ᩻;->hashTreeDataExtent_:Ll/۫۠᩻;

    .line 10760
    :cond_0
    iget-object v0, p0, Ll/ۢܶ᩻;->hashTreeDataExtentBuilder_:Ll/ܺۚۖ;

    return-object v0
.end method

.method private getHashTreeExtentFieldBuilder()Ll/ܺۚۖ;
    .locals 4

    .line 10909
    iget-object v0, p0, Ll/ۢܶ᩻;->hashTreeExtentBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 10910
    new-instance v0, Ll/ܺۚۖ;

    .line 10912
    invoke-virtual {p0}, Ll/ۢܶ᩻;->getHashTreeExtent()Ll/۫۠᩻;

    move-result-object v1

    .line 10913
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v2

    .line 10914
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Ll/ܺۚۖ;-><init>(Ll/ۘᩴۖ;Ll/ۢۜۖ;Z)V

    iput-object v0, p0, Ll/ۢܶ᩻;->hashTreeExtentBuilder_:Ll/ܺۚۖ;

    const/4 v0, 0x0

    .line 10915
    iput-object v0, p0, Ll/ۢܶ᩻;->hashTreeExtent_:Ll/۫۠᩻;

    .line 10917
    :cond_0
    iget-object v0, p0, Ll/ۢܶ᩻;->hashTreeExtentBuilder_:Ll/ܺۚۖ;

    return-object v0
.end method

.method private getMergeOperationsFieldBuilder()Ll/ܳۚۖ;
    .locals 5

    .line 11902
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperationsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_1

    .line 11903
    new-instance v0, Ll/ܳۚۖ;

    iget-object v1, p0, Ll/ۢܶ᩻;->mergeOperations_:Ljava/util/List;

    iget v2, p0, Ll/ۢܶ᩻;->bitField0_:I

    const/high16 v3, 0x20000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 11907
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v3

    .line 11908
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Ll/ܳۚۖ;-><init>(Ljava/util/List;ZLl/ۢۜۖ;Z)V

    iput-object v0, p0, Ll/ۢܶ᩻;->mergeOperationsBuilder_:Ll/ܳۚۖ;

    const/4 v0, 0x0

    .line 11909
    iput-object v0, p0, Ll/ۢܶ᩻;->mergeOperations_:Ljava/util/List;

    .line 11911
    :cond_1
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperationsBuilder_:Ll/ܳۚۖ;

    return-object v0
.end method

.method private getNewPartitionInfoFieldBuilder()Ll/ܺۚۖ;
    .locals 4

    .line 10178
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionInfoBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 10179
    new-instance v0, Ll/ܺۚۖ;

    .line 10181
    invoke-virtual {p0}, Ll/ۢܶ᩻;->getNewPartitionInfo()Ll/ܳܶ᩻;

    move-result-object v1

    .line 10182
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v2

    .line 10183
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Ll/ܺۚۖ;-><init>(Ll/ۘᩴۖ;Ll/ۢۜۖ;Z)V

    iput-object v0, p0, Ll/ۢܶ᩻;->newPartitionInfoBuilder_:Ll/ܺۚۖ;

    const/4 v0, 0x0

    .line 10184
    iput-object v0, p0, Ll/ۢܶ᩻;->newPartitionInfo_:Ll/ܳܶ᩻;

    .line 10186
    :cond_0
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionInfoBuilder_:Ll/ܺۚۖ;

    return-object v0
.end method

.method private getNewPartitionSignatureFieldBuilder()Ll/ܳۚۖ;
    .locals 5

    .line 9935
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignatureBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_1

    .line 9936
    new-instance v0, Ll/ܳۚۖ;

    iget-object v1, p0, Ll/ۢܶ᩻;->newPartitionSignature_:Ljava/util/List;

    iget v2, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit8 v2, v2, 0x10

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 9940
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v3

    .line 9941
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Ll/ܳۚۖ;-><init>(Ljava/util/List;ZLl/ۢۜۖ;Z)V

    iput-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignatureBuilder_:Ll/ܳۚۖ;

    const/4 v0, 0x0

    .line 9942
    iput-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignature_:Ljava/util/List;

    .line 9944
    :cond_1
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignatureBuilder_:Ll/ܳۚۖ;

    return-object v0
.end method

.method private getOldPartitionInfoFieldBuilder()Ll/ܺۚۖ;
    .locals 4

    .line 10057
    iget-object v0, p0, Ll/ۢܶ᩻;->oldPartitionInfoBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 10058
    new-instance v0, Ll/ܺۚۖ;

    .line 10060
    invoke-virtual {p0}, Ll/ۢܶ᩻;->getOldPartitionInfo()Ll/ܳܶ᩻;

    move-result-object v1

    .line 10061
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v2

    .line 10062
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Ll/ܺۚۖ;-><init>(Ll/ۘᩴۖ;Ll/ۢۜۖ;Z)V

    iput-object v0, p0, Ll/ۢܶ᩻;->oldPartitionInfoBuilder_:Ll/ܺۚۖ;

    const/4 v0, 0x0

    .line 10063
    iput-object v0, p0, Ll/ۢܶ᩻;->oldPartitionInfo_:Ll/ܳܶ᩻;

    .line 10065
    :cond_0
    iget-object v0, p0, Ll/ۢܶ᩻;->oldPartitionInfoBuilder_:Ll/ܺۚۖ;

    return-object v0
.end method

.method private getOperationsFieldBuilder()Ll/ܳۚۖ;
    .locals 5

    .line 10525
    iget-object v0, p0, Ll/ۢܶ᩻;->operationsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_1

    .line 10526
    new-instance v0, Ll/ܳۚۖ;

    iget-object v1, p0, Ll/ۢܶ᩻;->operations_:Ljava/util/List;

    iget v2, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit16 v2, v2, 0x80

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 10530
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getParentForChildren()Ll/ۢۜۖ;

    move-result-object v3

    .line 10531
    invoke-virtual {p0}, Ll/᩶ۘۖ;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Ll/ܳۚۖ;-><init>(Ljava/util/List;ZLl/ۢۜۖ;Z)V

    iput-object v0, p0, Ll/ۢܶ᩻;->operationsBuilder_:Ll/ܳۚۖ;

    const/4 v0, 0x0

    .line 10532
    iput-object v0, p0, Ll/ۢܶ᩻;->operations_:Ljava/util/List;

    .line 10534
    :cond_1
    iget-object v0, p0, Ll/ۢܶ᩻;->operationsBuilder_:Ll/ܳۚۖ;

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 8599
    invoke-static {}, Ll/ۡܶ᩻;->access$400()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 8600
    invoke-direct {p0}, Ll/ۢܶ᩻;->getNewPartitionSignatureFieldBuilder()Ll/ܳۚۖ;

    .line 8601
    invoke-direct {p0}, Ll/ۢܶ᩻;->getOldPartitionInfoFieldBuilder()Ll/ܺۚۖ;

    .line 8602
    invoke-direct {p0}, Ll/ۢܶ᩻;->getNewPartitionInfoFieldBuilder()Ll/ܺۚۖ;

    .line 8603
    invoke-direct {p0}, Ll/ۢܶ᩻;->getOperationsFieldBuilder()Ll/ܳۚۖ;

    .line 8604
    invoke-direct {p0}, Ll/ۢܶ᩻;->getHashTreeDataExtentFieldBuilder()Ll/ܺۚۖ;

    .line 8605
    invoke-direct {p0}, Ll/ۢܶ᩻;->getHashTreeExtentFieldBuilder()Ll/ܺۚۖ;

    .line 8606
    invoke-direct {p0}, Ll/ۢܶ᩻;->getFecDataExtentFieldBuilder()Ll/ܺۚۖ;

    .line 8607
    invoke-direct {p0}, Ll/ۢܶ᩻;->getFecExtentFieldBuilder()Ll/ܺۚۖ;

    .line 8608
    invoke-direct {p0}, Ll/ۢܶ᩻;->getMergeOperationsFieldBuilder()Ll/ܳۚۖ;

    :cond_0
    return-void
.end method


# virtual methods
.method public addAllMergeOperations(Ljava/lang/Iterable;)Ll/ۢܶ᩻;
    .locals 1

    .line 11765
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperationsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 11766
    invoke-direct {p0}, Ll/ۢܶ᩻;->ensureMergeOperationsIsMutable()V

    .line 11767
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperations_:Ljava/util/List;

    invoke-static {p1, v0}, Ll/ۖۜۖ;->֫(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 11769
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 11771
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->֫(Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public addAllNewPartitionSignature(Ljava/lang/Iterable;)Ll/ۢܶ᩻;
    .locals 1

    .line 9790
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignatureBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 9791
    invoke-direct {p0}, Ll/ۢܶ᩻;->ensureNewPartitionSignatureIsMutable()V

    .line 9792
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignature_:Ljava/util/List;

    invoke-static {p1, v0}, Ll/ۖۜۖ;->֫(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 9794
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 9796
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->֫(Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public addAllOperations(Ljava/lang/Iterable;)Ll/ۢܶ᩻;
    .locals 1

    .line 10388
    iget-object v0, p0, Ll/ۢܶ᩻;->operationsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 10389
    invoke-direct {p0}, Ll/ۢܶ᩻;->ensureOperationsIsMutable()V

    .line 10390
    iget-object v0, p0, Ll/ۢܶ᩻;->operations_:Ljava/util/List;

    invoke-static {p1, v0}, Ll/ۖۜۖ;->֫(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 10392
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 10394
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->֫(Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public addMergeOperations(ILl/ۜ۠᩻;)Ll/ۢܶ᩻;
    .locals 1

    .line 11702
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperationsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 11704
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11706
    invoke-direct {p0}, Ll/ۢܶ᩻;->ensureMergeOperationsIsMutable()V

    .line 11707
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperations_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 11708
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 11710
    :cond_0
    invoke-virtual {v0, p1, p2}, Ll/ܳۚۖ;->ۧ(ILl/ۘᩴۖ;)V

    return-object p0
.end method

.method public addMergeOperations(ILl/ܿ۠᩻;)Ll/ۢܶ᩻;
    .locals 1

    .line 11745
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperationsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 11746
    invoke-direct {p0}, Ll/ۢܶ᩻;->ensureMergeOperationsIsMutable()V

    .line 11747
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperations_:Ljava/util/List;

    invoke-virtual {p2}, Ll/ܿ۠᩻;->build()Ll/ۜ۠᩻;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 11748
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 11750
    :cond_0
    invoke-virtual {p2}, Ll/ܿ۠᩻;->build()Ll/ۜ۠᩻;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ll/ܳۚۖ;->ۧ(ILl/ۘᩴۖ;)V

    return-object p0
.end method

.method public addMergeOperations(Ll/ۜ۠᩻;)Ll/ۢܶ᩻;
    .locals 1

    .line 11679
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperationsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 11681
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11683
    invoke-direct {p0}, Ll/ۢܶ᩻;->ensureMergeOperationsIsMutable()V

    .line 11684
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperations_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11685
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 11687
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    return-object p0
.end method

.method public addMergeOperations(Ll/ܿ۠᩻;)Ll/ۢܶ᩻;
    .locals 1

    .line 11725
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperationsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 11726
    invoke-direct {p0}, Ll/ۢܶ᩻;->ensureMergeOperationsIsMutable()V

    .line 11727
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperations_:Ljava/util/List;

    invoke-virtual {p1}, Ll/ܿ۠᩻;->build()Ll/ۜ۠᩻;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11728
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 11730
    :cond_0
    invoke-virtual {p1}, Ll/ܿ۠᩻;->build()Ll/ۜ۠᩻;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    return-object p0
.end method

.method public addMergeOperationsBuilder()Ll/ܿ۠᩻;
    .locals 2

    .line 11869
    invoke-direct {p0}, Ll/ۢܶ᩻;->getMergeOperationsFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    .line 11870
    invoke-static {}, Ll/ۜ۠᩻;->getDefaultInstance()Ll/ۜ۠᩻;

    move-result-object v1

    .line 11869
    invoke-virtual {v0, v1}, Ll/ܳۚۖ;->֫(Ll/ۘᩴۖ;)Ll/᩶ۘۖ;

    move-result-object v0

    check-cast v0, Ll/ܿ۠᩻;

    return-object v0
.end method

.method public addMergeOperationsBuilder(I)Ll/ܿ۠᩻;
    .locals 2

    .line 11883
    invoke-direct {p0}, Ll/ۢܶ᩻;->getMergeOperationsFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    .line 11884
    invoke-static {}, Ll/ۜ۠᩻;->getDefaultInstance()Ll/ۜ۠᩻;

    move-result-object v1

    .line 11883
    invoke-virtual {v0, p1, v1}, Ll/ܳۚۖ;->֫(ILl/ۘᩴۖ;)Ll/᩶ۘۖ;

    move-result-object p1

    check-cast p1, Ll/ܿ۠᩻;

    return-object p1
.end method

.method public addNewPartitionSignature(ILl/ᩴܶ᩻;)Ll/ۢܶ᩻;
    .locals 1

    .line 9769
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignatureBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 9770
    invoke-direct {p0}, Ll/ۢܶ᩻;->ensureNewPartitionSignatureIsMutable()V

    .line 9771
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignature_:Ljava/util/List;

    invoke-virtual {p2}, Ll/ᩴܶ᩻;->build()Ll/᩵ܶ᩻;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 9772
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 9774
    :cond_0
    invoke-virtual {p2}, Ll/ᩴܶ᩻;->build()Ll/᩵ܶ᩻;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ll/ܳۚۖ;->ۧ(ILl/ۘᩴۖ;)V

    return-object p0
.end method

.method public addNewPartitionSignature(ILl/᩵ܶ᩻;)Ll/ۢܶ᩻;
    .locals 1

    .line 9724
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignatureBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 9726
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9728
    invoke-direct {p0}, Ll/ۢܶ᩻;->ensureNewPartitionSignatureIsMutable()V

    .line 9729
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignature_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 9730
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 9732
    :cond_0
    invoke-virtual {v0, p1, p2}, Ll/ܳۚۖ;->ۧ(ILl/ۘᩴۖ;)V

    return-object p0
.end method

.method public addNewPartitionSignature(Ll/ᩴܶ᩻;)Ll/ۢܶ᩻;
    .locals 1

    .line 9748
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignatureBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 9749
    invoke-direct {p0}, Ll/ۢܶ᩻;->ensureNewPartitionSignatureIsMutable()V

    .line 9750
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignature_:Ljava/util/List;

    invoke-virtual {p1}, Ll/ᩴܶ᩻;->build()Ll/᩵ܶ᩻;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9751
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 9753
    :cond_0
    invoke-virtual {p1}, Ll/ᩴܶ᩻;->build()Ll/᩵ܶ᩻;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    return-object p0
.end method

.method public addNewPartitionSignature(Ll/᩵ܶ᩻;)Ll/ۢܶ᩻;
    .locals 1

    .line 9700
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignatureBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 9702
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9704
    invoke-direct {p0}, Ll/ۢܶ᩻;->ensureNewPartitionSignatureIsMutable()V

    .line 9705
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignature_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9706
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 9708
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    return-object p0
.end method

.method public addNewPartitionSignatureBuilder()Ll/ᩴܶ᩻;
    .locals 2

    .line 9900
    invoke-direct {p0}, Ll/ۢܶ᩻;->getNewPartitionSignatureFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    .line 9901
    invoke-static {}, Ll/᩵ܶ᩻;->getDefaultInstance()Ll/᩵ܶ᩻;

    move-result-object v1

    .line 9900
    invoke-virtual {v0, v1}, Ll/ܳۚۖ;->֫(Ll/ۘᩴۖ;)Ll/᩶ۘۖ;

    move-result-object v0

    check-cast v0, Ll/ᩴܶ᩻;

    return-object v0
.end method

.method public addNewPartitionSignatureBuilder(I)Ll/ᩴܶ᩻;
    .locals 2

    .line 9915
    invoke-direct {p0}, Ll/ۢܶ᩻;->getNewPartitionSignatureFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    .line 9916
    invoke-static {}, Ll/᩵ܶ᩻;->getDefaultInstance()Ll/᩵ܶ᩻;

    move-result-object v1

    .line 9915
    invoke-virtual {v0, p1, v1}, Ll/ܳۚۖ;->֫(ILl/ۘᩴۖ;)Ll/᩶ۘۖ;

    move-result-object p1

    check-cast p1, Ll/ᩴܶ᩻;

    return-object p1
.end method

.method public addOperations(ILl/֫ܶ᩻;)Ll/ۢܶ᩻;
    .locals 1

    .line 10325
    iget-object v0, p0, Ll/ۢܶ᩻;->operationsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 10327
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10329
    invoke-direct {p0}, Ll/ۢܶ᩻;->ensureOperationsIsMutable()V

    .line 10330
    iget-object v0, p0, Ll/ۢܶ᩻;->operations_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 10331
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 10333
    :cond_0
    invoke-virtual {v0, p1, p2}, Ll/ܳۚۖ;->ۧ(ILl/ۘᩴۖ;)V

    return-object p0
.end method

.method public addOperations(ILl/᩺۠᩻;)Ll/ۢܶ᩻;
    .locals 1

    .line 10368
    iget-object v0, p0, Ll/ۢܶ᩻;->operationsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 10369
    invoke-direct {p0}, Ll/ۢܶ᩻;->ensureOperationsIsMutable()V

    .line 10370
    iget-object v0, p0, Ll/ۢܶ᩻;->operations_:Ljava/util/List;

    invoke-virtual {p2}, Ll/᩺۠᩻;->build()Ll/֫ܶ᩻;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 10371
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 10373
    :cond_0
    invoke-virtual {p2}, Ll/᩺۠᩻;->build()Ll/֫ܶ᩻;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ll/ܳۚۖ;->ۧ(ILl/ۘᩴۖ;)V

    return-object p0
.end method

.method public addOperations(Ll/֫ܶ᩻;)Ll/ۢܶ᩻;
    .locals 1

    .line 10302
    iget-object v0, p0, Ll/ۢܶ᩻;->operationsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 10304
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10306
    invoke-direct {p0}, Ll/ۢܶ᩻;->ensureOperationsIsMutable()V

    .line 10307
    iget-object v0, p0, Ll/ۢܶ᩻;->operations_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10308
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 10310
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    return-object p0
.end method

.method public addOperations(Ll/᩺۠᩻;)Ll/ۢܶ᩻;
    .locals 1

    .line 10348
    iget-object v0, p0, Ll/ۢܶ᩻;->operationsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 10349
    invoke-direct {p0}, Ll/ۢܶ᩻;->ensureOperationsIsMutable()V

    .line 10350
    iget-object v0, p0, Ll/ۢܶ᩻;->operations_:Ljava/util/List;

    invoke-virtual {p1}, Ll/᩺۠᩻;->build()Ll/֫ܶ᩻;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10351
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 10353
    :cond_0
    invoke-virtual {p1}, Ll/᩺۠᩻;->build()Ll/֫ܶ᩻;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    return-object p0
.end method

.method public addOperationsBuilder()Ll/᩺۠᩻;
    .locals 2

    .line 10492
    invoke-direct {p0}, Ll/ۢܶ᩻;->getOperationsFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    .line 10493
    invoke-static {}, Ll/֫ܶ᩻;->getDefaultInstance()Ll/֫ܶ᩻;

    move-result-object v1

    .line 10492
    invoke-virtual {v0, v1}, Ll/ܳۚۖ;->֫(Ll/ۘᩴۖ;)Ll/᩶ۘۖ;

    move-result-object v0

    check-cast v0, Ll/᩺۠᩻;

    return-object v0
.end method

.method public addOperationsBuilder(I)Ll/᩺۠᩻;
    .locals 2

    .line 10506
    invoke-direct {p0}, Ll/ۢܶ᩻;->getOperationsFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    .line 10507
    invoke-static {}, Ll/֫ܶ᩻;->getDefaultInstance()Ll/֫ܶ᩻;

    move-result-object v1

    .line 10506
    invoke-virtual {v0, p1, v1}, Ll/ܳۚۖ;->֫(ILl/ۘᩴۖ;)Ll/᩶ۘۖ;

    move-result-object p1

    check-cast p1, Ll/᩺۠᩻;

    return-object p1
.end method

.method public bridge synthetic build()Ll/ۡ֡ۖ;
    .locals 1

    .line 8570
    invoke-virtual {p0}, Ll/ۢܶ᩻;->build()Ll/ۡܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public build()Ll/ۡܶ᩻;
    .locals 2

    .line 8693
    invoke-virtual {p0}, Ll/ۢܶ᩻;->buildPartial()Ll/ۡܶ᩻;

    move-result-object v0

    .line 8694
    invoke-virtual {v0}, Ll/ۡܶ᩻;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 8695
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0
.end method

.method public bridge synthetic build()Ll/᩻֡ۖ;
    .locals 1

    .line 8570
    invoke-virtual {p0}, Ll/ۢܶ᩻;->build()Ll/ۡܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Ll/ۡ֡ۖ;
    .locals 1

    .line 8570
    invoke-virtual {p0}, Ll/ۢܶ᩻;->buildPartial()Ll/ۡܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Ll/ۡܶ᩻;
    .locals 2

    .line 8702
    new-instance v0, Ll/ۡܶ᩻;

    invoke-direct {v0, p0}, Ll/ۡܶ᩻;-><init>(Ll/ۢܶ᩻;)V

    .line 8703
    invoke-direct {p0, v0}, Ll/ۢܶ᩻;->buildPartialRepeatedFields(Ll/ۡܶ᩻;)V

    .line 8704
    iget v1, p0, Ll/ۢܶ᩻;->bitField0_:I

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, Ll/ۢܶ᩻;->buildPartial0(Ll/ۡܶ᩻;)V

    .line 8705
    :cond_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onBuilt()V

    return-object v0
.end method

.method public bridge synthetic buildPartial()Ll/᩻֡ۖ;
    .locals 1

    .line 8570
    invoke-virtual {p0}, Ll/ۢܶ᩻;->buildPartial()Ll/ۡܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/ۢ֡ۖ;
    .locals 1

    .line 8570
    invoke-virtual {p0}, Ll/ۢܶ᩻;->clear()Ll/ۢܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public clear()Ll/ۢܶ᩻;
    .locals 4

    .line 8613
    invoke-super {p0}, Ll/᩶ۘۖ;->clear()Ll/᩶ۘۖ;

    const/4 v0, 0x0

    .line 8614
    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    const-string v1, ""

    .line 8615
    iput-object v1, p0, Ll/ۢܶ᩻;->partitionName_:Ljava/lang/Object;

    .line 8616
    iput-boolean v0, p0, Ll/ۢܶ᩻;->runPostinstall_:Z

    .line 8617
    iput-object v1, p0, Ll/ۢܶ᩻;->postinstallPath_:Ljava/lang/Object;

    .line 8618
    iput-object v1, p0, Ll/ۢܶ᩻;->filesystemType_:Ljava/lang/Object;

    .line 8619
    iget-object v2, p0, Ll/ۢܶ᩻;->newPartitionSignatureBuilder_:Ll/ܳۚۖ;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    .line 8620
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v2, p0, Ll/ۢܶ᩻;->newPartitionSignature_:Ljava/util/List;

    goto :goto_0

    .line 8622
    :cond_0
    iput-object v3, p0, Ll/ۢܶ᩻;->newPartitionSignature_:Ljava/util/List;

    .line 8623
    invoke-virtual {v2}, Ll/ܳۚۖ;->ܽ()V

    .line 8625
    :goto_0
    iget v2, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit8 v2, v2, -0x11

    iput v2, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 8626
    iput-object v3, p0, Ll/ۢܶ᩻;->oldPartitionInfo_:Ll/ܳܶ᩻;

    .line 8627
    iget-object v2, p0, Ll/ۢܶ᩻;->oldPartitionInfoBuilder_:Ll/ܺۚۖ;

    if-eqz v2, :cond_1

    .line 8628
    invoke-virtual {v2}, Ll/ܺۚۖ;->ܽ()V

    .line 8629
    iput-object v3, p0, Ll/ۢܶ᩻;->oldPartitionInfoBuilder_:Ll/ܺۚۖ;

    .line 8631
    :cond_1
    iput-object v3, p0, Ll/ۢܶ᩻;->newPartitionInfo_:Ll/ܳܶ᩻;

    .line 8632
    iget-object v2, p0, Ll/ۢܶ᩻;->newPartitionInfoBuilder_:Ll/ܺۚۖ;

    if-eqz v2, :cond_2

    .line 8633
    invoke-virtual {v2}, Ll/ܺۚۖ;->ܽ()V

    .line 8634
    iput-object v3, p0, Ll/ۢܶ᩻;->newPartitionInfoBuilder_:Ll/ܺۚۖ;

    .line 8636
    :cond_2
    iget-object v2, p0, Ll/ۢܶ᩻;->operationsBuilder_:Ll/ܳۚۖ;

    if-nez v2, :cond_3

    .line 8637
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v2, p0, Ll/ۢܶ᩻;->operations_:Ljava/util/List;

    goto :goto_1

    .line 8639
    :cond_3
    iput-object v3, p0, Ll/ۢܶ᩻;->operations_:Ljava/util/List;

    .line 8640
    invoke-virtual {v2}, Ll/ܳۚۖ;->ܽ()V

    .line 8642
    :goto_1
    iget v2, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit16 v2, v2, -0x81

    iput v2, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 8643
    iput-boolean v0, p0, Ll/ۢܶ᩻;->postinstallOptional_:Z

    .line 8644
    iput-object v3, p0, Ll/ۢܶ᩻;->hashTreeDataExtent_:Ll/۫۠᩻;

    .line 8645
    iget-object v0, p0, Ll/ۢܶ᩻;->hashTreeDataExtentBuilder_:Ll/ܺۚۖ;

    if-eqz v0, :cond_4

    .line 8646
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܽ()V

    .line 8647
    iput-object v3, p0, Ll/ۢܶ᩻;->hashTreeDataExtentBuilder_:Ll/ܺۚۖ;

    .line 8649
    :cond_4
    iput-object v3, p0, Ll/ۢܶ᩻;->hashTreeExtent_:Ll/۫۠᩻;

    .line 8650
    iget-object v0, p0, Ll/ۢܶ᩻;->hashTreeExtentBuilder_:Ll/ܺۚۖ;

    if-eqz v0, :cond_5

    .line 8651
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܽ()V

    .line 8652
    iput-object v3, p0, Ll/ۢܶ᩻;->hashTreeExtentBuilder_:Ll/ܺۚۖ;

    .line 8654
    :cond_5
    iput-object v1, p0, Ll/ۢܶ᩻;->hashTreeAlgorithm_:Ljava/lang/Object;

    .line 8655
    sget-object v0, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    iput-object v0, p0, Ll/ۢܶ᩻;->hashTreeSalt_:Ll/ۛۜۖ;

    .line 8656
    iput-object v3, p0, Ll/ۢܶ᩻;->fecDataExtent_:Ll/۫۠᩻;

    .line 8657
    iget-object v0, p0, Ll/ۢܶ᩻;->fecDataExtentBuilder_:Ll/ܺۚۖ;

    if-eqz v0, :cond_6

    .line 8658
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܽ()V

    .line 8659
    iput-object v3, p0, Ll/ۢܶ᩻;->fecDataExtentBuilder_:Ll/ܺۚۖ;

    .line 8661
    :cond_6
    iput-object v3, p0, Ll/ۢܶ᩻;->fecExtent_:Ll/۫۠᩻;

    .line 8662
    iget-object v0, p0, Ll/ۢܶ᩻;->fecExtentBuilder_:Ll/ܺۚۖ;

    if-eqz v0, :cond_7

    .line 8663
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܽ()V

    .line 8664
    iput-object v3, p0, Ll/ۢܶ᩻;->fecExtentBuilder_:Ll/ܺۚۖ;

    :cond_7
    const/4 v0, 0x2

    .line 8666
    iput v0, p0, Ll/ۢܶ᩻;->fecRoots_:I

    .line 8667
    iput-object v1, p0, Ll/ۢܶ᩻;->version_:Ljava/lang/Object;

    .line 8668
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperationsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_8

    .line 8669
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ۢܶ᩻;->mergeOperations_:Ljava/util/List;

    goto :goto_2

    .line 8671
    :cond_8
    iput-object v3, p0, Ll/ۢܶ᩻;->mergeOperations_:Ljava/util/List;

    .line 8672
    invoke-virtual {v0}, Ll/ܳۚۖ;->ܽ()V

    .line 8674
    :goto_2
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    const v1, -0x20001

    and-int/2addr v0, v1

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    const-wide/16 v0, 0x0

    .line 8675
    iput-wide v0, p0, Ll/ۢܶ᩻;->estimateCowSize_:J

    .line 8676
    iput-wide v0, p0, Ll/ۢܶ᩻;->estimateOpCountMax_:J

    return-object p0
.end method

.method public bridge synthetic clear()Ll/ܳ֡ۖ;
    .locals 1

    .line 8570
    invoke-virtual {p0}, Ll/ۢܶ᩻;->clear()Ll/ۢܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/᩶ۘۖ;
    .locals 1

    .line 8570
    invoke-virtual {p0}, Ll/ۢܶ᩻;->clear()Ll/ۢܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/᩷ۜۖ;
    .locals 1

    .line 8570
    invoke-virtual {p0}, Ll/ۢܶ᩻;->clear()Ll/ۢܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public clearEstimateCowSize()Ll/ۢܶ᩻;
    .locals 2

    .line 11972
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    const v1, -0x40001

    and-int/2addr v0, v1

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    const-wide/16 v0, 0x0

    .line 11973
    iput-wide v0, p0, Ll/ۢܶ᩻;->estimateCowSize_:J

    .line 11974
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearEstimateOpCountMax()Ll/ۢܶ᩻;
    .locals 2

    .line 12032
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    const v1, -0x80001

    and-int/2addr v0, v1

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    const-wide/16 v0, 0x0

    .line 12033
    iput-wide v0, p0, Ll/ۢܶ᩻;->estimateOpCountMax_:J

    .line 12034
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearFecDataExtent()Ll/ۢܶ᩻;
    .locals 2

    .line 11180
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit16 v0, v0, -0x2001

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    const/4 v0, 0x0

    .line 11181
    iput-object v0, p0, Ll/ۢܶ᩻;->fecDataExtent_:Ll/۫۠᩻;

    .line 11182
    iget-object v1, p0, Ll/ۢܶ᩻;->fecDataExtentBuilder_:Ll/ܺۚۖ;

    if-eqz v1, :cond_0

    .line 11183
    invoke-virtual {v1}, Ll/ܺۚۖ;->ܽ()V

    .line 11184
    iput-object v0, p0, Ll/ۢܶ᩻;->fecDataExtentBuilder_:Ll/ܺۚۖ;

    .line 11186
    :cond_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearFecExtent()Ll/ۢܶ᩻;
    .locals 2

    .line 11337
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit16 v0, v0, -0x4001

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    const/4 v0, 0x0

    .line 11338
    iput-object v0, p0, Ll/ۢܶ᩻;->fecExtent_:Ll/۫۠᩻;

    .line 11339
    iget-object v1, p0, Ll/ۢܶ᩻;->fecExtentBuilder_:Ll/ܺۚۖ;

    if-eqz v1, :cond_0

    .line 11340
    invoke-virtual {v1}, Ll/ܺۚۖ;->ܽ()V

    .line 11341
    iput-object v0, p0, Ll/ۢܶ᩻;->fecExtentBuilder_:Ll/ܺۚۖ;

    .line 11343
    :cond_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearFecRoots()Ll/ۢܶ᩻;
    .locals 2

    .line 11444
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    const v1, -0x8001

    and-int/2addr v0, v1

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    const/4 v0, 0x2

    .line 11445
    iput v0, p0, Ll/ۢܶ᩻;->fecRoots_:I

    .line 11446
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearFilesystemType()Ll/ۢܶ᩻;
    .locals 1

    .line 9555
    invoke-static {}, Ll/ۡܶ᩻;->getDefaultInstance()Ll/ۡܶ᩻;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡܶ᩻;->getFilesystemType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۢܶ᩻;->filesystemType_:Ljava/lang/Object;

    .line 9556
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 9557
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearHashTreeAlgorithm()Ll/ۢܶ᩻;
    .locals 1

    .line 11001
    invoke-static {}, Ll/ۡܶ᩻;->getDefaultInstance()Ll/ۡܶ᩻;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡܶ᩻;->getHashTreeAlgorithm()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۢܶ᩻;->hashTreeAlgorithm_:Ljava/lang/Object;

    .line 11002
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit16 v0, v0, -0x801

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 11003
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearHashTreeDataExtent()Ll/ۢܶ᩻;
    .locals 2

    .line 10703
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit16 v0, v0, -0x201

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    const/4 v0, 0x0

    .line 10704
    iput-object v0, p0, Ll/ۢܶ᩻;->hashTreeDataExtent_:Ll/۫۠᩻;

    .line 10705
    iget-object v1, p0, Ll/ۢܶ᩻;->hashTreeDataExtentBuilder_:Ll/ܺۚۖ;

    if-eqz v1, :cond_0

    .line 10706
    invoke-virtual {v1}, Ll/ܺۚۖ;->ܽ()V

    .line 10707
    iput-object v0, p0, Ll/ۢܶ᩻;->hashTreeDataExtentBuilder_:Ll/ܺۚۖ;

    .line 10709
    :cond_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearHashTreeExtent()Ll/ۢܶ᩻;
    .locals 2

    .line 10863
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit16 v0, v0, -0x401

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    const/4 v0, 0x0

    .line 10864
    iput-object v0, p0, Ll/ۢܶ᩻;->hashTreeExtent_:Ll/۫۠᩻;

    .line 10865
    iget-object v1, p0, Ll/ۢܶ᩻;->hashTreeExtentBuilder_:Ll/ܺۚۖ;

    if-eqz v1, :cond_0

    .line 10866
    invoke-virtual {v1}, Ll/ܺۚۖ;->ܽ()V

    .line 10867
    iput-object v0, p0, Ll/ۢܶ᩻;->hashTreeExtentBuilder_:Ll/ܺۚۖ;

    .line 10869
    :cond_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearHashTreeSalt()Ll/ۢܶ᩻;
    .locals 1

    .line 11074
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit16 v0, v0, -0x1001

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 11075
    invoke-static {}, Ll/ۡܶ᩻;->getDefaultInstance()Ll/ۡܶ᩻;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡܶ᩻;->getHashTreeSalt()Ll/ۛۜۖ;

    move-result-object v0

    iput-object v0, p0, Ll/ۢܶ᩻;->hashTreeSalt_:Ll/ۛۜۖ;

    .line 11076
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearMergeOperations()Ll/ۢܶ᩻;
    .locals 2

    .line 11785
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperationsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 11786
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ۢܶ᩻;->mergeOperations_:Ljava/util/List;

    .line 11787
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    const v1, -0x20001

    and-int/2addr v0, v1

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 11788
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 11790
    :cond_0
    invoke-virtual {v0}, Ll/ܳۚۖ;->ܽ()V

    return-object p0
.end method

.method public clearNewPartitionInfo()Ll/ۢܶ᩻;
    .locals 2

    .line 10144
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    const/4 v0, 0x0

    .line 10145
    iput-object v0, p0, Ll/ۢܶ᩻;->newPartitionInfo_:Ll/ܳܶ᩻;

    .line 10146
    iget-object v1, p0, Ll/ۢܶ᩻;->newPartitionInfoBuilder_:Ll/ܺۚۖ;

    if-eqz v1, :cond_0

    .line 10147
    invoke-virtual {v1}, Ll/ܺۚۖ;->ܽ()V

    .line 10148
    iput-object v0, p0, Ll/ۢܶ᩻;->newPartitionInfoBuilder_:Ll/ܺۚۖ;

    .line 10150
    :cond_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearNewPartitionSignature()Ll/ۢܶ᩻;
    .locals 1

    .line 9811
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignatureBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 9812
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignature_:Ljava/util/List;

    .line 9813
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 9814
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 9816
    :cond_0
    invoke-virtual {v0}, Ll/ܳۚۖ;->ܽ()V

    return-object p0
.end method

.method public clearOldPartitionInfo()Ll/ۢܶ᩻;
    .locals 2

    .line 10023
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    const/4 v0, 0x0

    .line 10024
    iput-object v0, p0, Ll/ۢܶ᩻;->oldPartitionInfo_:Ll/ܳܶ᩻;

    .line 10025
    iget-object v1, p0, Ll/ۢܶ᩻;->oldPartitionInfoBuilder_:Ll/ܺۚۖ;

    if-eqz v1, :cond_0

    .line 10026
    invoke-virtual {v1}, Ll/ܺۚۖ;->ܽ()V

    .line 10027
    iput-object v0, p0, Ll/ۢܶ᩻;->oldPartitionInfoBuilder_:Ll/ܺۚۖ;

    .line 10029
    :cond_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearOperations()Ll/ۢܶ᩻;
    .locals 1

    .line 10408
    iget-object v0, p0, Ll/ۢܶ᩻;->operationsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 10409
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ۢܶ᩻;->operations_:Ljava/util/List;

    .line 10410
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 10411
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 10413
    :cond_0
    invoke-virtual {v0}, Ll/ܳۚۖ;->ܽ()V

    return-object p0
.end method

.method public clearPartitionName()Ll/ۢܶ᩻;
    .locals 1

    .line 9249
    invoke-static {}, Ll/ۡܶ᩻;->getDefaultInstance()Ll/ۡܶ᩻;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡܶ᩻;->getPartitionName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۢܶ᩻;->partitionName_:Ljava/lang/Object;

    .line 9250
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 9251
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearPostinstallOptional()Ll/ۢܶ᩻;
    .locals 1

    .line 10591
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    const/4 v0, 0x0

    .line 10592
    iput-boolean v0, p0, Ll/ۢܶ᩻;->postinstallOptional_:Z

    .line 10593
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearPostinstallPath()Ll/ۢܶ᩻;
    .locals 1

    .line 9433
    invoke-static {}, Ll/ۡܶ᩻;->getDefaultInstance()Ll/ۡܶ᩻;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡܶ᩻;->getPostinstallPath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۢܶ᩻;->postinstallPath_:Ljava/lang/Object;

    .line 9434
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 9435
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearRunPostinstall()Ll/ۢܶ᩻;
    .locals 1

    .line 9331
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    const/4 v0, 0x0

    .line 9332
    iput-boolean v0, p0, Ll/ۢܶ᩻;->runPostinstall_:Z

    .line 9333
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public clearVersion()Ll/ۢܶ᩻;
    .locals 2

    .line 11541
    invoke-static {}, Ll/ۡܶ᩻;->getDefaultInstance()Ll/ۡܶ᩻;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡܶ᩻;->getVersion()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۢܶ᩻;->version_:Ljava/lang/Object;

    .line 11542
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    const v1, -0x10001

    and-int/2addr v0, v1

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 11543
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 8570
    invoke-virtual {p0}, Ll/ۢܶ᩻;->getDefaultInstanceForType()Ll/ۡܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Ll/ۡܶ᩻;
    .locals 1

    .line 8688
    invoke-static {}, Ll/ۡܶ᩻;->getDefaultInstance()Ll/ۡܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 8570
    invoke-virtual {p0}, Ll/ۢܶ᩻;->getDefaultInstanceForType()Ll/ۡܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Ll/ᩳۖۖ;
    .locals 1

    .line 8683
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_PartitionUpdate_descriptor()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public getEstimateCowSize()J
    .locals 2

    .line 11941
    iget-wide v0, p0, Ll/ۢܶ᩻;->estimateCowSize_:J

    return-wide v0
.end method

.method public getEstimateOpCountMax()J
    .locals 2

    .line 12003
    iget-wide v0, p0, Ll/ۢܶ᩻;->estimateOpCountMax_:J

    return-wide v0
.end method

.method public getFecDataExtent()Ll/۫۠᩻;
    .locals 1

    .line 11103
    iget-object v0, p0, Ll/ۢܶ᩻;->fecDataExtentBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_1

    .line 11104
    iget-object v0, p0, Ll/ۢܶ᩻;->fecDataExtent_:Ll/۫۠᩻;

    if-nez v0, :cond_0

    invoke-static {}, Ll/۫۠᩻;->getDefaultInstance()Ll/۫۠᩻;

    move-result-object v0

    :cond_0
    return-object v0

    .line 11106
    :cond_1
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܿ()Ll/ۘᩴۖ;

    move-result-object v0

    check-cast v0, Ll/۫۠᩻;

    return-object v0
.end method

.method public getFecDataExtentBuilder()Ll/۬۠᩻;
    .locals 1

    .line 11197
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit16 v0, v0, 0x2000

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 11198
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 11199
    invoke-direct {p0}, Ll/ۢܶ᩻;->getFecDataExtentFieldBuilder()Ll/ܺۚۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v0

    check-cast v0, Ll/۬۠᩻;

    return-object v0
.end method

.method public getFecDataExtentOrBuilder()Ll/ۛ۠᩻;
    .locals 1

    .line 11209
    iget-object v0, p0, Ll/ۢܶ᩻;->fecDataExtentBuilder_:Ll/ܺۚۖ;

    if-eqz v0, :cond_0

    .line 11210
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܳ()Ll/ۘ֡ۖ;

    move-result-object v0

    check-cast v0, Ll/ۛ۠᩻;

    return-object v0

    .line 11212
    :cond_0
    iget-object v0, p0, Ll/ۢܶ᩻;->fecDataExtent_:Ll/۫۠᩻;

    if-nez v0, :cond_1

    .line 11213
    invoke-static {}, Ll/۫۠᩻;->getDefaultInstance()Ll/۫۠᩻;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public getFecExtent()Ll/۫۠᩻;
    .locals 1

    .line 11260
    iget-object v0, p0, Ll/ۢܶ᩻;->fecExtentBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_1

    .line 11261
    iget-object v0, p0, Ll/ۢܶ᩻;->fecExtent_:Ll/۫۠᩻;

    if-nez v0, :cond_0

    invoke-static {}, Ll/۫۠᩻;->getDefaultInstance()Ll/۫۠᩻;

    move-result-object v0

    :cond_0
    return-object v0

    .line 11263
    :cond_1
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܿ()Ll/ۘᩴۖ;

    move-result-object v0

    check-cast v0, Ll/۫۠᩻;

    return-object v0
.end method

.method public getFecExtentBuilder()Ll/۬۠᩻;
    .locals 1

    .line 11354
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit16 v0, v0, 0x4000

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 11355
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 11356
    invoke-direct {p0}, Ll/ۢܶ᩻;->getFecExtentFieldBuilder()Ll/ܺۚۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v0

    check-cast v0, Ll/۬۠᩻;

    return-object v0
.end method

.method public getFecExtentOrBuilder()Ll/ۛ۠᩻;
    .locals 1

    .line 11366
    iget-object v0, p0, Ll/ۢܶ᩻;->fecExtentBuilder_:Ll/ܺۚۖ;

    if-eqz v0, :cond_0

    .line 11367
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܳ()Ll/ۘ֡ۖ;

    move-result-object v0

    check-cast v0, Ll/ۛ۠᩻;

    return-object v0

    .line 11369
    :cond_0
    iget-object v0, p0, Ll/ۢܶ᩻;->fecExtent_:Ll/۫۠᩻;

    if-nez v0, :cond_1

    .line 11370
    invoke-static {}, Ll/۫۠᩻;->getDefaultInstance()Ll/۫۠᩻;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public getFecRoots()I
    .locals 1

    .line 11417
    iget v0, p0, Ll/ۢܶ᩻;->fecRoots_:I

    return v0
.end method

.method public getFilesystemType()Ljava/lang/String;
    .locals 2

    .line 9486
    iget-object v0, p0, Ll/ۢܶ᩻;->filesystemType_:Ljava/lang/Object;

    .line 9487
    instance-of v1, v0, Ljava/lang/String;

    if-nez v1, :cond_1

    .line 9488
    check-cast v0, Ll/ۛۜۖ;

    .line 9490
    invoke-virtual {v0}, Ll/ۛۜۖ;->ܳ()Ljava/lang/String;

    move-result-object v1

    .line 9491
    invoke-virtual {v0}, Ll/ۛۜۖ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 9492
    iput-object v1, p0, Ll/ۢܶ᩻;->filesystemType_:Ljava/lang/Object;

    :cond_0
    return-object v1

    .line 9496
    :cond_1
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getFilesystemTypeBytes()Ll/ۛۜۖ;
    .locals 2

    .line 9512
    iget-object v0, p0, Ll/ۢܶ᩻;->filesystemType_:Ljava/lang/Object;

    .line 9513
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 9514
    check-cast v0, Ljava/lang/String;

    .line 9515
    invoke-static {v0}, Ll/ۛۜۖ;->֫(Ljava/lang/String;)Ll/ۛۜۖ;

    move-result-object v0

    .line 9517
    iput-object v0, p0, Ll/ۢܶ᩻;->filesystemType_:Ljava/lang/Object;

    return-object v0

    .line 9520
    :cond_0
    check-cast v0, Ll/ۛۜۖ;

    return-object v0
.end method

.method public getHashTreeAlgorithm()Ljava/lang/String;
    .locals 2

    .line 10941
    iget-object v0, p0, Ll/ۢܶ᩻;->hashTreeAlgorithm_:Ljava/lang/Object;

    .line 10942
    instance-of v1, v0, Ljava/lang/String;

    if-nez v1, :cond_1

    .line 10943
    check-cast v0, Ll/ۛۜۖ;

    .line 10945
    invoke-virtual {v0}, Ll/ۛۜۖ;->ܳ()Ljava/lang/String;

    move-result-object v1

    .line 10946
    invoke-virtual {v0}, Ll/ۛۜۖ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 10947
    iput-object v1, p0, Ll/ۢܶ᩻;->hashTreeAlgorithm_:Ljava/lang/Object;

    :cond_0
    return-object v1

    .line 10951
    :cond_1
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getHashTreeAlgorithmBytes()Ll/ۛۜۖ;
    .locals 2

    .line 10964
    iget-object v0, p0, Ll/ۢܶ᩻;->hashTreeAlgorithm_:Ljava/lang/Object;

    .line 10965
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 10966
    check-cast v0, Ljava/lang/String;

    .line 10967
    invoke-static {v0}, Ll/ۛۜۖ;->֫(Ljava/lang/String;)Ll/ۛۜۖ;

    move-result-object v0

    .line 10969
    iput-object v0, p0, Ll/ۢܶ᩻;->hashTreeAlgorithm_:Ljava/lang/Object;

    return-object v0

    .line 10972
    :cond_0
    check-cast v0, Ll/ۛۜۖ;

    return-object v0
.end method

.method public getHashTreeDataExtent()Ll/۫۠᩻;
    .locals 1

    .line 10622
    iget-object v0, p0, Ll/ۢܶ᩻;->hashTreeDataExtentBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_1

    .line 10623
    iget-object v0, p0, Ll/ۢܶ᩻;->hashTreeDataExtent_:Ll/۫۠᩻;

    if-nez v0, :cond_0

    invoke-static {}, Ll/۫۠᩻;->getDefaultInstance()Ll/۫۠᩻;

    move-result-object v0

    :cond_0
    return-object v0

    .line 10625
    :cond_1
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܿ()Ll/ۘᩴۖ;

    move-result-object v0

    check-cast v0, Ll/۫۠᩻;

    return-object v0
.end method

.method public getHashTreeDataExtentBuilder()Ll/۬۠᩻;
    .locals 1

    .line 10721
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit16 v0, v0, 0x200

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 10722
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 10723
    invoke-direct {p0}, Ll/ۢܶ᩻;->getHashTreeDataExtentFieldBuilder()Ll/ܺۚۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v0

    check-cast v0, Ll/۬۠᩻;

    return-object v0
.end method

.method public getHashTreeDataExtentOrBuilder()Ll/ۛ۠᩻;
    .locals 1

    .line 10734
    iget-object v0, p0, Ll/ۢܶ᩻;->hashTreeDataExtentBuilder_:Ll/ܺۚۖ;

    if-eqz v0, :cond_0

    .line 10735
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܳ()Ll/ۘ֡ۖ;

    move-result-object v0

    check-cast v0, Ll/ۛ۠᩻;

    return-object v0

    .line 10737
    :cond_0
    iget-object v0, p0, Ll/ۢܶ᩻;->hashTreeDataExtent_:Ll/۫۠᩻;

    if-nez v0, :cond_1

    .line 10738
    invoke-static {}, Ll/۫۠᩻;->getDefaultInstance()Ll/۫۠᩻;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public getHashTreeExtent()Ll/۫۠᩻;
    .locals 1

    .line 10786
    iget-object v0, p0, Ll/ۢܶ᩻;->hashTreeExtentBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_1

    .line 10787
    iget-object v0, p0, Ll/ۢܶ᩻;->hashTreeExtent_:Ll/۫۠᩻;

    if-nez v0, :cond_0

    invoke-static {}, Ll/۫۠᩻;->getDefaultInstance()Ll/۫۠᩻;

    move-result-object v0

    :cond_0
    return-object v0

    .line 10789
    :cond_1
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܿ()Ll/ۘᩴۖ;

    move-result-object v0

    check-cast v0, Ll/۫۠᩻;

    return-object v0
.end method

.method public getHashTreeExtentBuilder()Ll/۬۠᩻;
    .locals 1

    .line 10880
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit16 v0, v0, 0x400

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 10881
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 10882
    invoke-direct {p0}, Ll/ۢܶ᩻;->getHashTreeExtentFieldBuilder()Ll/ܺۚۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v0

    check-cast v0, Ll/۬۠᩻;

    return-object v0
.end method

.method public getHashTreeExtentOrBuilder()Ll/ۛ۠᩻;
    .locals 1

    .line 10892
    iget-object v0, p0, Ll/ۢܶ᩻;->hashTreeExtentBuilder_:Ll/ܺۚۖ;

    if-eqz v0, :cond_0

    .line 10893
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܳ()Ll/ۘ֡ۖ;

    move-result-object v0

    check-cast v0, Ll/ۛ۠᩻;

    return-object v0

    .line 10895
    :cond_0
    iget-object v0, p0, Ll/ۢܶ᩻;->hashTreeExtent_:Ll/۫۠᩻;

    if-nez v0, :cond_1

    .line 10896
    invoke-static {}, Ll/۫۠᩻;->getDefaultInstance()Ll/۫۠᩻;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public getHashTreeSalt()Ll/ۛۜۖ;
    .locals 1

    .line 11047
    iget-object v0, p0, Ll/ۢܶ᩻;->hashTreeSalt_:Ll/ۛۜۖ;

    return-object v0
.end method

.method public getMergeOperations(I)Ll/ۜ۠᩻;
    .locals 1

    .line 11620
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperationsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 11621
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperations_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۜ۠᩻;

    return-object p1

    .line 11623
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ۧ(I)Ll/ۘᩴۖ;

    move-result-object p1

    check-cast p1, Ll/ۜ۠᩻;

    return-object p1
.end method

.method public getMergeOperationsBuilder(I)Ll/ܿ۠᩻;
    .locals 1

    .line 11824
    invoke-direct {p0}, Ll/ۢܶ᩻;->getMergeOperationsFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->֫(I)Ll/᩶ۘۖ;

    move-result-object p1

    check-cast p1, Ll/ܿ۠᩻;

    return-object p1
.end method

.method public getMergeOperationsBuilderList()Ljava/util/List;
    .locals 1

    .line 11897
    invoke-direct {p0}, Ll/ۢܶ᩻;->getMergeOperationsFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܳۚۖ;->ܿ()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getMergeOperationsCount()I
    .locals 1

    .line 11604
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperationsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 11605
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperations_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 11607
    :cond_0
    invoke-virtual {v0}, Ll/ܳۚۖ;->ܳ()I

    move-result v0

    return v0
.end method

.method public getMergeOperationsList()Ljava/util/List;
    .locals 1

    .line 11588
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperationsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 11589
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperations_:Ljava/util/List;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 11591
    :cond_0
    invoke-virtual {v0}, Ll/ܳۚۖ;->᩻()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getMergeOperationsOrBuilder(I)Ll/ۢ۠᩻;
    .locals 1

    .line 11837
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperationsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 11838
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperations_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۢ۠᩻;

    return-object p1

    .line 11839
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ܽ(I)Ll/ۘ֡ۖ;

    move-result-object p1

    check-cast p1, Ll/ۢ۠᩻;

    return-object p1
.end method

.method public getMergeOperationsOrBuilderList()Ljava/util/List;
    .locals 1

    .line 11853
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperationsBuilder_:Ll/ܳۚۖ;

    if-eqz v0, :cond_0

    .line 11854
    invoke-virtual {v0}, Ll/ܳۚۖ;->ۜ()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 11856
    :cond_0
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperations_:Ljava/util/List;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getNewPartitionInfo()Ll/ܳܶ᩻;
    .locals 1

    .line 10083
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionInfoBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_1

    .line 10084
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionInfo_:Ll/ܳܶ᩻;

    if-nez v0, :cond_0

    invoke-static {}, Ll/ܳܶ᩻;->getDefaultInstance()Ll/ܳܶ᩻;

    move-result-object v0

    :cond_0
    return-object v0

    .line 10086
    :cond_1
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܿ()Ll/ۘᩴۖ;

    move-result-object v0

    check-cast v0, Ll/ܳܶ᩻;

    return-object v0
.end method

.method public getNewPartitionInfoBuilder()Ll/ܿܶ᩻;
    .locals 1

    .line 10157
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 10158
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 10159
    invoke-direct {p0}, Ll/ۢܶ᩻;->getNewPartitionInfoFieldBuilder()Ll/ܺۚۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v0

    check-cast v0, Ll/ܿܶ᩻;

    return-object v0
.end method

.method public getNewPartitionInfoOrBuilder()Ll/ۜܶ᩻;
    .locals 1

    .line 10165
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionInfoBuilder_:Ll/ܺۚۖ;

    if-eqz v0, :cond_0

    .line 10166
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܳ()Ll/ۘ֡ۖ;

    move-result-object v0

    check-cast v0, Ll/ۜܶ᩻;

    return-object v0

    .line 10168
    :cond_0
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionInfo_:Ll/ܳܶ᩻;

    if-nez v0, :cond_1

    .line 10169
    invoke-static {}, Ll/ܳܶ᩻;->getDefaultInstance()Ll/ܳܶ᩻;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public getNewPartitionSignature(I)Ll/᩵ܶ᩻;
    .locals 1

    .line 9638
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignatureBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 9639
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignature_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩵ܶ᩻;

    return-object p1

    .line 9641
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ۧ(I)Ll/ۘᩴۖ;

    move-result-object p1

    check-cast p1, Ll/᩵ܶ᩻;

    return-object p1
.end method

.method public getNewPartitionSignatureBuilder(I)Ll/ᩴܶ᩻;
    .locals 1

    .line 9852
    invoke-direct {p0}, Ll/ۢܶ᩻;->getNewPartitionSignatureFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->֫(I)Ll/᩶ۘۖ;

    move-result-object p1

    check-cast p1, Ll/ᩴܶ᩻;

    return-object p1
.end method

.method public getNewPartitionSignatureBuilderList()Ljava/util/List;
    .locals 1

    .line 9930
    invoke-direct {p0}, Ll/ۢܶ᩻;->getNewPartitionSignatureFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܳۚۖ;->ܿ()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getNewPartitionSignatureCount()I
    .locals 1

    .line 9621
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignatureBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 9622
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignature_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 9624
    :cond_0
    invoke-virtual {v0}, Ll/ܳۚۖ;->ܳ()I

    move-result v0

    return v0
.end method

.method public getNewPartitionSignatureList()Ljava/util/List;
    .locals 1

    .line 9604
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignatureBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 9605
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignature_:Ljava/util/List;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 9607
    :cond_0
    invoke-virtual {v0}, Ll/ܳۚۖ;->᩻()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getNewPartitionSignatureOrBuilder(I)Ll/ۚܶ᩻;
    .locals 1

    .line 9866
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignatureBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 9867
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignature_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚܶ᩻;

    return-object p1

    .line 9868
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ܽ(I)Ll/ۘ֡ۖ;

    move-result-object p1

    check-cast p1, Ll/ۚܶ᩻;

    return-object p1
.end method

.method public getNewPartitionSignatureOrBuilderList()Ljava/util/List;
    .locals 1

    .line 9883
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignatureBuilder_:Ll/ܳۚۖ;

    if-eqz v0, :cond_0

    .line 9884
    invoke-virtual {v0}, Ll/ܳۚۖ;->ۜ()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 9886
    :cond_0
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignature_:Ljava/util/List;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getOldPartitionInfo()Ll/ܳܶ᩻;
    .locals 1

    .line 9962
    iget-object v0, p0, Ll/ۢܶ᩻;->oldPartitionInfoBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_1

    .line 9963
    iget-object v0, p0, Ll/ۢܶ᩻;->oldPartitionInfo_:Ll/ܳܶ᩻;

    if-nez v0, :cond_0

    invoke-static {}, Ll/ܳܶ᩻;->getDefaultInstance()Ll/ܳܶ᩻;

    move-result-object v0

    :cond_0
    return-object v0

    .line 9965
    :cond_1
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܿ()Ll/ۘᩴۖ;

    move-result-object v0

    check-cast v0, Ll/ܳܶ᩻;

    return-object v0
.end method

.method public getOldPartitionInfoBuilder()Ll/ܿܶ᩻;
    .locals 1

    .line 10036
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 10037
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 10038
    invoke-direct {p0}, Ll/ۢܶ᩻;->getOldPartitionInfoFieldBuilder()Ll/ܺۚۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v0

    check-cast v0, Ll/ܿܶ᩻;

    return-object v0
.end method

.method public getOldPartitionInfoOrBuilder()Ll/ۜܶ᩻;
    .locals 1

    .line 10044
    iget-object v0, p0, Ll/ۢܶ᩻;->oldPartitionInfoBuilder_:Ll/ܺۚۖ;

    if-eqz v0, :cond_0

    .line 10045
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܳ()Ll/ۘ֡ۖ;

    move-result-object v0

    check-cast v0, Ll/ۜܶ᩻;

    return-object v0

    .line 10047
    :cond_0
    iget-object v0, p0, Ll/ۢܶ᩻;->oldPartitionInfo_:Ll/ܳܶ᩻;

    if-nez v0, :cond_1

    .line 10048
    invoke-static {}, Ll/ܳܶ᩻;->getDefaultInstance()Ll/ܳܶ᩻;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public getOperations(I)Ll/֫ܶ᩻;
    .locals 1

    .line 10243
    iget-object v0, p0, Ll/ۢܶ᩻;->operationsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 10244
    iget-object v0, p0, Ll/ۢܶ᩻;->operations_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֫ܶ᩻;

    return-object p1

    .line 10246
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ۧ(I)Ll/ۘᩴۖ;

    move-result-object p1

    check-cast p1, Ll/֫ܶ᩻;

    return-object p1
.end method

.method public getOperationsBuilder(I)Ll/᩺۠᩻;
    .locals 1

    .line 10447
    invoke-direct {p0}, Ll/ۢܶ᩻;->getOperationsFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->֫(I)Ll/᩶ۘۖ;

    move-result-object p1

    check-cast p1, Ll/᩺۠᩻;

    return-object p1
.end method

.method public getOperationsBuilderList()Ljava/util/List;
    .locals 1

    .line 10520
    invoke-direct {p0}, Ll/ۢܶ᩻;->getOperationsFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܳۚۖ;->ܿ()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getOperationsCount()I
    .locals 1

    .line 10227
    iget-object v0, p0, Ll/ۢܶ᩻;->operationsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 10228
    iget-object v0, p0, Ll/ۢܶ᩻;->operations_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 10230
    :cond_0
    invoke-virtual {v0}, Ll/ܳۚۖ;->ܳ()I

    move-result v0

    return v0
.end method

.method public getOperationsList()Ljava/util/List;
    .locals 1

    .line 10211
    iget-object v0, p0, Ll/ۢܶ᩻;->operationsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 10212
    iget-object v0, p0, Ll/ۢܶ᩻;->operations_:Ljava/util/List;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 10214
    :cond_0
    invoke-virtual {v0}, Ll/ܳۚۖ;->᩻()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getOperationsOrBuilder(I)Ll/ܽܶ᩻;
    .locals 1

    .line 10460
    iget-object v0, p0, Ll/ۢܶ᩻;->operationsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 10461
    iget-object v0, p0, Ll/ۢܶ᩻;->operations_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܽܶ᩻;

    return-object p1

    .line 10462
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ܽ(I)Ll/ۘ֡ۖ;

    move-result-object p1

    check-cast p1, Ll/ܽܶ᩻;

    return-object p1
.end method

.method public getOperationsOrBuilderList()Ljava/util/List;
    .locals 1

    .line 10476
    iget-object v0, p0, Ll/ۢܶ᩻;->operationsBuilder_:Ll/ܳۚۖ;

    if-eqz v0, :cond_0

    .line 10477
    invoke-virtual {v0}, Ll/ܳۚۖ;->ۜ()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 10479
    :cond_0
    iget-object v0, p0, Ll/ۢܶ᩻;->operations_:Ljava/util/List;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getPartitionName()Ljava/lang/String;
    .locals 2

    .line 9186
    iget-object v0, p0, Ll/ۢܶ᩻;->partitionName_:Ljava/lang/Object;

    .line 9187
    instance-of v1, v0, Ljava/lang/String;

    if-nez v1, :cond_1

    .line 9188
    check-cast v0, Ll/ۛۜۖ;

    .line 9190
    invoke-virtual {v0}, Ll/ۛۜۖ;->ܳ()Ljava/lang/String;

    move-result-object v1

    .line 9191
    invoke-virtual {v0}, Ll/ۛۜۖ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 9192
    iput-object v1, p0, Ll/ۢܶ᩻;->partitionName_:Ljava/lang/Object;

    :cond_0
    return-object v1

    .line 9196
    :cond_1
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getPartitionNameBytes()Ll/ۛۜۖ;
    .locals 2

    .line 9210
    iget-object v0, p0, Ll/ۢܶ᩻;->partitionName_:Ljava/lang/Object;

    .line 9211
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 9212
    check-cast v0, Ljava/lang/String;

    .line 9213
    invoke-static {v0}, Ll/ۛۜۖ;->֫(Ljava/lang/String;)Ll/ۛۜۖ;

    move-result-object v0

    .line 9215
    iput-object v0, p0, Ll/ۢܶ᩻;->partitionName_:Ljava/lang/Object;

    return-object v0

    .line 9218
    :cond_0
    check-cast v0, Ll/ۛۜۖ;

    return-object v0
.end method

.method public getPostinstallOptional()Z
    .locals 1

    .line 10562
    iget-boolean v0, p0, Ll/ۢܶ᩻;->postinstallOptional_:Z

    return v0
.end method

.method public getPostinstallPath()Ljava/lang/String;
    .locals 2

    .line 9364
    iget-object v0, p0, Ll/ۢܶ᩻;->postinstallPath_:Ljava/lang/Object;

    .line 9365
    instance-of v1, v0, Ljava/lang/String;

    if-nez v1, :cond_1

    .line 9366
    check-cast v0, Ll/ۛۜۖ;

    .line 9368
    invoke-virtual {v0}, Ll/ۛۜۖ;->ܳ()Ljava/lang/String;

    move-result-object v1

    .line 9369
    invoke-virtual {v0}, Ll/ۛۜۖ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 9370
    iput-object v1, p0, Ll/ۢܶ᩻;->postinstallPath_:Ljava/lang/Object;

    :cond_0
    return-object v1

    .line 9374
    :cond_1
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getPostinstallPathBytes()Ll/ۛۜۖ;
    .locals 2

    .line 9390
    iget-object v0, p0, Ll/ۢܶ᩻;->postinstallPath_:Ljava/lang/Object;

    .line 9391
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 9392
    check-cast v0, Ljava/lang/String;

    .line 9393
    invoke-static {v0}, Ll/ۛۜۖ;->֫(Ljava/lang/String;)Ll/ۛۜۖ;

    move-result-object v0

    .line 9395
    iput-object v0, p0, Ll/ۢܶ᩻;->postinstallPath_:Ljava/lang/Object;

    return-object v0

    .line 9398
    :cond_0
    check-cast v0, Ll/ۛۜۖ;

    return-object v0
.end method

.method public getRunPostinstall()Z
    .locals 1

    .line 9300
    iget-boolean v0, p0, Ll/ۢܶ᩻;->runPostinstall_:Z

    return v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 2

    .line 11475
    iget-object v0, p0, Ll/ۢܶ᩻;->version_:Ljava/lang/Object;

    .line 11476
    instance-of v1, v0, Ljava/lang/String;

    if-nez v1, :cond_1

    .line 11477
    check-cast v0, Ll/ۛۜۖ;

    .line 11479
    invoke-virtual {v0}, Ll/ۛۜۖ;->ܳ()Ljava/lang/String;

    move-result-object v1

    .line 11480
    invoke-virtual {v0}, Ll/ۛۜۖ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 11481
    iput-object v1, p0, Ll/ۢܶ᩻;->version_:Ljava/lang/Object;

    :cond_0
    return-object v1

    .line 11485
    :cond_1
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getVersionBytes()Ll/ۛۜۖ;
    .locals 2

    .line 11500
    iget-object v0, p0, Ll/ۢܶ᩻;->version_:Ljava/lang/Object;

    .line 11501
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 11502
    check-cast v0, Ljava/lang/String;

    .line 11503
    invoke-static {v0}, Ll/ۛۜۖ;->֫(Ljava/lang/String;)Ll/ۛۜۖ;

    move-result-object v0

    .line 11505
    iput-object v0, p0, Ll/ۢܶ᩻;->version_:Ljava/lang/Object;

    return-object v0

    .line 11508
    :cond_0
    check-cast v0, Ll/ۛۜۖ;

    return-object v0
.end method

.method public hasEstimateCowSize()Z
    .locals 2

    .line 11927
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    const/high16 v1, 0x40000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasEstimateOpCountMax()Z
    .locals 2

    .line 11990
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    const/high16 v1, 0x80000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasFecDataExtent()Z
    .locals 1

    .line 11092
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasFecExtent()Z
    .locals 1

    .line 11249
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasFecRoots()Z
    .locals 2

    .line 11405
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    const v1, 0x8000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasFilesystemType()Z
    .locals 1

    .line 9472
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasHashTreeAlgorithm()Z
    .locals 1

    .line 10930
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasHashTreeDataExtent()Z
    .locals 1

    .line 10610
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasHashTreeExtent()Z
    .locals 1

    .line 10775
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasHashTreeSalt()Z
    .locals 1

    .line 11035
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasNewPartitionInfo()Z
    .locals 1

    .line 10076
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasOldPartitionInfo()Z
    .locals 1

    .line 9955
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasPartitionName()Z
    .locals 2

    .line 9174
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasPostinstallOptional()Z
    .locals 1

    .line 10549
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasPostinstallPath()Z
    .locals 1

    .line 9350
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasRunPostinstall()Z
    .locals 1

    .line 9286
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasVersion()Z
    .locals 2

    .line 11462
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    const/high16 v1, 0x10000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 8582
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_PartitionUpdate_fieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/ۡܶ᩻;

    const-class v2, Ll/ۢܶ᩻;

    .line 8583
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 3

    .line 8983
    invoke-virtual {p0}, Ll/ۢܶ᩻;->hasPartitionName()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    .line 8986
    :goto_0
    invoke-virtual {p0}, Ll/ۢܶ᩻;->getOperationsCount()I

    move-result v2

    if-ge v0, v2, :cond_2

    .line 8987
    invoke-virtual {p0, v0}, Ll/ۢܶ᩻;->getOperations(I)Ll/֫ܶ᩻;

    move-result-object v2

    invoke-virtual {v2}, Ll/֫ܶ᩻;->isInitialized()Z

    move-result v2

    if-nez v2, :cond_1

    return v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public mergeFecDataExtent(Ll/۫۠᩻;)Ll/ۢܶ᩻;
    .locals 2

    .line 11155
    iget-object v0, p0, Ll/ۢܶ᩻;->fecDataExtentBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_1

    .line 11156
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۢܶ᩻;->fecDataExtent_:Ll/۫۠᩻;

    if-eqz v0, :cond_0

    .line 11158
    invoke-static {}, Ll/۫۠᩻;->getDefaultInstance()Ll/۫۠᩻;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 11159
    invoke-virtual {p0}, Ll/ۢܶ᩻;->getFecDataExtentBuilder()Ll/۬۠᩻;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/۬۠᩻;->mergeFrom(Ll/۫۠᩻;)Ll/۬۠᩻;

    goto :goto_0

    .line 11161
    :cond_0
    iput-object p1, p0, Ll/ۢܶ᩻;->fecDataExtent_:Ll/۫۠᩻;

    goto :goto_0

    .line 11164
    :cond_1
    invoke-virtual {v0, p1}, Ll/ܺۚۖ;->֫(Ll/ۘᩴۖ;)V

    .line 11166
    :goto_0
    iget-object p1, p0, Ll/ۢܶ᩻;->fecDataExtent_:Ll/۫۠᩻;

    if-eqz p1, :cond_2

    .line 11167
    iget p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit16 p1, p1, 0x2000

    iput p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 11168
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    :cond_2
    return-object p0
.end method

.method public mergeFecExtent(Ll/۫۠᩻;)Ll/ۢܶ᩻;
    .locals 2

    .line 11312
    iget-object v0, p0, Ll/ۢܶ᩻;->fecExtentBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_1

    .line 11313
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۢܶ᩻;->fecExtent_:Ll/۫۠᩻;

    if-eqz v0, :cond_0

    .line 11315
    invoke-static {}, Ll/۫۠᩻;->getDefaultInstance()Ll/۫۠᩻;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 11316
    invoke-virtual {p0}, Ll/ۢܶ᩻;->getFecExtentBuilder()Ll/۬۠᩻;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/۬۠᩻;->mergeFrom(Ll/۫۠᩻;)Ll/۬۠᩻;

    goto :goto_0

    .line 11318
    :cond_0
    iput-object p1, p0, Ll/ۢܶ᩻;->fecExtent_:Ll/۫۠᩻;

    goto :goto_0

    .line 11321
    :cond_1
    invoke-virtual {v0, p1}, Ll/ܺۚۖ;->֫(Ll/ۘᩴۖ;)V

    .line 11323
    :goto_0
    iget-object p1, p0, Ll/ۢܶ᩻;->fecExtent_:Ll/۫۠᩻;

    if-eqz p1, :cond_2

    .line 11324
    iget p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit16 p1, p1, 0x4000

    iput p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 11325
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    :cond_2
    return-object p0
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۖۜۖ;
    .locals 0

    .line 8570
    invoke-virtual {p0, p1, p2}, Ll/ۢܶ᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢܶ᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 8570
    invoke-virtual {p0, p1, p2}, Ll/ۢܶ᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢܶ᩻;

    move-result-object p1

    return-object p1
.end method

.method public mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢܶ᩻;
    .locals 3

    .line 9000
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :cond_0
    :goto_0
    if-nez v0, :cond_4

    .line 9005
    :try_start_0
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܶ()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    .line 9147
    invoke-super {p0, p1, p2, v1}, Ll/᩶ۘۖ;->parseUnknownField(Ll/۟ۜۖ;Ll/ᩳۘۖ;I)Z

    move-result v1

    goto/16 :goto_1

    .line 9142
    :sswitch_0
    invoke-virtual {p1}, Ll/۟ۜۖ;->᩹()J

    move-result-wide v1

    iput-wide v1, p0, Ll/ۢܶ᩻;->estimateOpCountMax_:J

    .line 9143
    iget v1, p0, Ll/ۢܶ᩻;->bitField0_:I

    const/high16 v2, 0x80000

    or-int/2addr v1, v2

    iput v1, p0, Ll/ۢܶ᩻;->bitField0_:I

    goto :goto_0

    .line 9137
    :sswitch_1
    invoke-virtual {p1}, Ll/۟ۜۖ;->᩹()J

    move-result-wide v1

    iput-wide v1, p0, Ll/ۢܶ᩻;->estimateCowSize_:J

    .line 9138
    iget v1, p0, Ll/ۢܶ᩻;->bitField0_:I

    const/high16 v2, 0x40000

    or-int/2addr v1, v2

    iput v1, p0, Ll/ۢܶ᩻;->bitField0_:I

    goto :goto_0

    .line 9126
    :sswitch_2
    invoke-static {}, Ll/ۜ۠᩻;->parser()Ll/۫֡ۖ;

    move-result-object v1

    .line 9125
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/۫֡ۖ;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object v1

    check-cast v1, Ll/ۜ۠᩻;

    .line 9128
    iget-object v2, p0, Ll/ۢܶ᩻;->mergeOperationsBuilder_:Ll/ܳۚۖ;

    if-nez v2, :cond_1

    .line 9129
    invoke-direct {p0}, Ll/ۢܶ᩻;->ensureMergeOperationsIsMutable()V

    .line 9130
    iget-object v2, p0, Ll/ۢܶ᩻;->mergeOperations_:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 9132
    :cond_1
    invoke-virtual {v2, v1}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    goto :goto_0

    .line 9119
    :sswitch_3
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܳ()Ll/ۛۜۖ;

    move-result-object v1

    iput-object v1, p0, Ll/ۢܶ᩻;->version_:Ljava/lang/Object;

    .line 9120
    iget v1, p0, Ll/ۢܶ᩻;->bitField0_:I

    const/high16 v2, 0x10000

    or-int/2addr v1, v2

    iput v1, p0, Ll/ۢܶ᩻;->bitField0_:I

    goto :goto_0

    .line 9114
    :sswitch_4
    invoke-virtual {p1}, Ll/۟ۜۖ;->᩸()I

    move-result v1

    iput v1, p0, Ll/ۢܶ᩻;->fecRoots_:I

    .line 9115
    iget v1, p0, Ll/ۢܶ᩻;->bitField0_:I

    const v2, 0x8000

    or-int/2addr v1, v2

    iput v1, p0, Ll/ۢܶ᩻;->bitField0_:I

    goto :goto_0

    .line 9108
    :sswitch_5
    invoke-direct {p0}, Ll/ۢܶ᩻;->getFecExtentFieldBuilder()Ll/ܺۚۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v1

    .line 9107
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/ۢ֡ۖ;Ll/ᩳۘۖ;)V

    .line 9110
    iget v1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit16 v1, v1, 0x4000

    iput v1, p0, Ll/ۢܶ᩻;->bitField0_:I

    goto :goto_0

    .line 9101
    :sswitch_6
    invoke-direct {p0}, Ll/ۢܶ᩻;->getFecDataExtentFieldBuilder()Ll/ܺۚۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v1

    .line 9100
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/ۢ֡ۖ;Ll/ᩳۘۖ;)V

    .line 9103
    iget v1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit16 v1, v1, 0x2000

    iput v1, p0, Ll/ۢܶ᩻;->bitField0_:I

    goto/16 :goto_0

    .line 9095
    :sswitch_7
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܳ()Ll/ۛۜۖ;

    move-result-object v1

    iput-object v1, p0, Ll/ۢܶ᩻;->hashTreeSalt_:Ll/ۛۜۖ;

    .line 9096
    iget v1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit16 v1, v1, 0x1000

    iput v1, p0, Ll/ۢܶ᩻;->bitField0_:I

    goto/16 :goto_0

    .line 9090
    :sswitch_8
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܳ()Ll/ۛۜۖ;

    move-result-object v1

    iput-object v1, p0, Ll/ۢܶ᩻;->hashTreeAlgorithm_:Ljava/lang/Object;

    .line 9091
    iget v1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit16 v1, v1, 0x800

    iput v1, p0, Ll/ۢܶ᩻;->bitField0_:I

    goto/16 :goto_0

    .line 9084
    :sswitch_9
    invoke-direct {p0}, Ll/ۢܶ᩻;->getHashTreeExtentFieldBuilder()Ll/ܺۚۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v1

    .line 9083
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/ۢ֡ۖ;Ll/ᩳۘۖ;)V

    .line 9086
    iget v1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit16 v1, v1, 0x400

    iput v1, p0, Ll/ۢܶ᩻;->bitField0_:I

    goto/16 :goto_0

    .line 9077
    :sswitch_a
    invoke-direct {p0}, Ll/ۢܶ᩻;->getHashTreeDataExtentFieldBuilder()Ll/ܺۚۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v1

    .line 9076
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/ۢ֡ۖ;Ll/ᩳۘۖ;)V

    .line 9079
    iget v1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit16 v1, v1, 0x200

    iput v1, p0, Ll/ۢܶ᩻;->bitField0_:I

    goto/16 :goto_0

    .line 9071
    :sswitch_b
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܿ()Z

    move-result v1

    iput-boolean v1, p0, Ll/ۢܶ᩻;->postinstallOptional_:Z

    .line 9072
    iget v1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit16 v1, v1, 0x100

    iput v1, p0, Ll/ۢܶ᩻;->bitField0_:I

    goto/16 :goto_0

    .line 9060
    :sswitch_c
    invoke-static {}, Ll/֫ܶ᩻;->parser()Ll/۫֡ۖ;

    move-result-object v1

    .line 9059
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/۫֡ۖ;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object v1

    check-cast v1, Ll/֫ܶ᩻;

    .line 9062
    iget-object v2, p0, Ll/ۢܶ᩻;->operationsBuilder_:Ll/ܳۚۖ;

    if-nez v2, :cond_2

    .line 9063
    invoke-direct {p0}, Ll/ۢܶ᩻;->ensureOperationsIsMutable()V

    .line 9064
    iget-object v2, p0, Ll/ۢܶ᩻;->operations_:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 9066
    :cond_2
    invoke-virtual {v2, v1}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    goto/16 :goto_0

    .line 9052
    :sswitch_d
    invoke-direct {p0}, Ll/ۢܶ᩻;->getNewPartitionInfoFieldBuilder()Ll/ܺۚۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v1

    .line 9051
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/ۢ֡ۖ;Ll/ᩳۘۖ;)V

    .line 9054
    iget v1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x40

    iput v1, p0, Ll/ۢܶ᩻;->bitField0_:I

    goto/16 :goto_0

    .line 9045
    :sswitch_e
    invoke-direct {p0}, Ll/ۢܶ᩻;->getOldPartitionInfoFieldBuilder()Ll/ܺۚۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object v1

    .line 9044
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/ۢ֡ۖ;Ll/ᩳۘۖ;)V

    .line 9047
    iget v1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x20

    iput v1, p0, Ll/ۢܶ᩻;->bitField0_:I

    goto/16 :goto_0

    .line 9033
    :sswitch_f
    invoke-static {}, Ll/᩵ܶ᩻;->parser()Ll/۫֡ۖ;

    move-result-object v1

    .line 9032
    invoke-virtual {p1, v1, p2}, Ll/۟ۜۖ;->֫(Ll/۫֡ۖ;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;

    move-result-object v1

    check-cast v1, Ll/᩵ܶ᩻;

    .line 9035
    iget-object v2, p0, Ll/ۢܶ᩻;->newPartitionSignatureBuilder_:Ll/ܳۚۖ;

    if-nez v2, :cond_3

    .line 9036
    invoke-direct {p0}, Ll/ۢܶ᩻;->ensureNewPartitionSignatureIsMutable()V

    .line 9037
    iget-object v2, p0, Ll/ۢܶ᩻;->newPartitionSignature_:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 9039
    :cond_3
    invoke-virtual {v2, v1}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    goto/16 :goto_0

    .line 9026
    :sswitch_10
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܳ()Ll/ۛۜۖ;

    move-result-object v1

    iput-object v1, p0, Ll/ۢܶ᩻;->filesystemType_:Ljava/lang/Object;

    .line 9027
    iget v1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x8

    iput v1, p0, Ll/ۢܶ᩻;->bitField0_:I

    goto/16 :goto_0

    .line 9021
    :sswitch_11
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܳ()Ll/ۛۜۖ;

    move-result-object v1

    iput-object v1, p0, Ll/ۢܶ᩻;->postinstallPath_:Ljava/lang/Object;

    .line 9022
    iget v1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Ll/ۢܶ᩻;->bitField0_:I

    goto/16 :goto_0

    .line 9016
    :sswitch_12
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܿ()Z

    move-result v1

    iput-boolean v1, p0, Ll/ۢܶ᩻;->runPostinstall_:Z

    .line 9017
    iget v1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x2

    iput v1, p0, Ll/ۢܶ᩻;->bitField0_:I

    goto/16 :goto_0

    .line 9011
    :sswitch_13
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܳ()Ll/ۛۜۖ;

    move-result-object v1

    iput-object v1, p0, Ll/ۢܶ᩻;->partitionName_:Ljava/lang/Object;

    .line 9012
    iget v1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ۢܶ᩻;->bitField0_:I
    :try_end_0
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    :goto_1
    if-nez v1, :cond_0

    :sswitch_14
    const/4 v0, 0x1

    goto/16 :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 9155
    :try_start_1
    invoke-virtual {p1}, Ll/֫᩵ۖ;->֫()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9157
    :goto_2
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 9158
    throw p1

    .line 9157
    :cond_4
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_14
        0xa -> :sswitch_13
        0x10 -> :sswitch_12
        0x1a -> :sswitch_11
        0x22 -> :sswitch_10
        0x2a -> :sswitch_f
        0x32 -> :sswitch_e
        0x3a -> :sswitch_d
        0x42 -> :sswitch_c
        0x48 -> :sswitch_b
        0x52 -> :sswitch_a
        0x5a -> :sswitch_9
        0x62 -> :sswitch_8
        0x6a -> :sswitch_7
        0x72 -> :sswitch_6
        0x7a -> :sswitch_5
        0x80 -> :sswitch_4
        0x8a -> :sswitch_3
        0x92 -> :sswitch_2
        0x98 -> :sswitch_1
        0xa0 -> :sswitch_0
    .end sparse-switch
.end method

.method public mergeFrom(Ll/ۡܶ᩻;)Ll/ۢܶ᩻;
    .locals 3

    .line 8836
    invoke-static {}, Ll/ۡܶ᩻;->getDefaultInstance()Ll/ۡܶ᩻;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 8837
    :cond_0
    invoke-virtual {p1}, Ll/ۡܶ᩻;->hasPartitionName()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 8838
    invoke-static {p1}, Ll/ۡܶ᩻;->-$$Nest$fgetpartitionName_(Ll/ۡܶ᩻;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Ll/ۢܶ᩻;->partitionName_:Ljava/lang/Object;

    .line 8839
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 8840
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 8842
    :cond_1
    invoke-virtual {p1}, Ll/ۡܶ᩻;->hasRunPostinstall()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 8843
    invoke-virtual {p1}, Ll/ۡܶ᩻;->getRunPostinstall()Z

    move-result v0

    invoke-virtual {p0, v0}, Ll/ۢܶ᩻;->setRunPostinstall(Z)Ll/ۢܶ᩻;

    .line 8845
    :cond_2
    invoke-virtual {p1}, Ll/ۡܶ᩻;->hasPostinstallPath()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 8846
    invoke-static {p1}, Ll/ۡܶ᩻;->-$$Nest$fgetpostinstallPath_(Ll/ۡܶ᩻;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Ll/ۢܶ᩻;->postinstallPath_:Ljava/lang/Object;

    .line 8847
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 8848
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 8850
    :cond_3
    invoke-virtual {p1}, Ll/ۡܶ᩻;->hasFilesystemType()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 8851
    invoke-static {p1}, Ll/ۡܶ᩻;->-$$Nest$fgetfilesystemType_(Ll/ۡܶ᩻;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Ll/ۢܶ᩻;->filesystemType_:Ljava/lang/Object;

    .line 8852
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 8853
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 8855
    :cond_4
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignatureBuilder_:Ll/ܳۚۖ;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    .line 8856
    invoke-static {p1}, Ll/ۡܶ᩻;->-$$Nest$fgetnewPartitionSignature_(Ll/ۡܶ᩻;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9

    .line 8857
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignature_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 8858
    invoke-static {p1}, Ll/ۡܶ᩻;->-$$Nest$fgetnewPartitionSignature_(Ll/ۡܶ᩻;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignature_:Ljava/util/List;

    .line 8859
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    goto :goto_0

    .line 8861
    :cond_5
    invoke-direct {p0}, Ll/ۢܶ᩻;->ensureNewPartitionSignatureIsMutable()V

    .line 8862
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignature_:Ljava/util/List;

    invoke-static {p1}, Ll/ۡܶ᩻;->-$$Nest$fgetnewPartitionSignature_(Ll/ۡܶ᩻;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 8864
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    goto :goto_2

    .line 8867
    :cond_6
    invoke-static {p1}, Ll/ۡܶ᩻;->-$$Nest$fgetnewPartitionSignature_(Ll/ۡܶ᩻;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9

    .line 8868
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignatureBuilder_:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 8869
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignatureBuilder_:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->ᩳ()V

    .line 8870
    iput-object v1, p0, Ll/ۢܶ᩻;->newPartitionSignatureBuilder_:Ll/ܳۚۖ;

    .line 8871
    invoke-static {p1}, Ll/ۡܶ᩻;->-$$Nest$fgetnewPartitionSignature_(Ll/ۡܶ᩻;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignature_:Ljava/util/List;

    .line 8872
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 8874
    invoke-static {}, Ll/ۡܶ᩻;->access$500()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 8875
    invoke-direct {p0}, Ll/ۢܶ᩻;->getNewPartitionSignatureFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    goto :goto_1

    :cond_7
    move-object v0, v1

    :goto_1
    iput-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignatureBuilder_:Ll/ܳۚۖ;

    goto :goto_2

    .line 8877
    :cond_8
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignatureBuilder_:Ll/ܳۚۖ;

    invoke-static {p1}, Ll/ۡܶ᩻;->-$$Nest$fgetnewPartitionSignature_(Ll/ۡܶ᩻;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ܳۚۖ;->֫(Ljava/lang/Iterable;)V

    .line 8881
    :cond_9
    :goto_2
    invoke-virtual {p1}, Ll/ۡܶ᩻;->hasOldPartitionInfo()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 8882
    invoke-virtual {p1}, Ll/ۡܶ᩻;->getOldPartitionInfo()Ll/ܳܶ᩻;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۢܶ᩻;->mergeOldPartitionInfo(Ll/ܳܶ᩻;)Ll/ۢܶ᩻;

    .line 8884
    :cond_a
    invoke-virtual {p1}, Ll/ۡܶ᩻;->hasNewPartitionInfo()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 8885
    invoke-virtual {p1}, Ll/ۡܶ᩻;->getNewPartitionInfo()Ll/ܳܶ᩻;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۢܶ᩻;->mergeNewPartitionInfo(Ll/ܳܶ᩻;)Ll/ۢܶ᩻;

    .line 8887
    :cond_b
    iget-object v0, p0, Ll/ۢܶ᩻;->operationsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_d

    .line 8888
    invoke-static {p1}, Ll/ۡܶ᩻;->-$$Nest$fgetoperations_(Ll/ۡܶ᩻;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_10

    .line 8889
    iget-object v0, p0, Ll/ۢܶ᩻;->operations_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 8890
    invoke-static {p1}, Ll/ۡܶ᩻;->-$$Nest$fgetoperations_(Ll/ۡܶ᩻;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ۢܶ᩻;->operations_:Ljava/util/List;

    .line 8891
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    goto :goto_3

    .line 8893
    :cond_c
    invoke-direct {p0}, Ll/ۢܶ᩻;->ensureOperationsIsMutable()V

    .line 8894
    iget-object v0, p0, Ll/ۢܶ᩻;->operations_:Ljava/util/List;

    invoke-static {p1}, Ll/ۡܶ᩻;->-$$Nest$fgetoperations_(Ll/ۡܶ᩻;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 8896
    :goto_3
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    goto :goto_5

    .line 8899
    :cond_d
    invoke-static {p1}, Ll/ۡܶ᩻;->-$$Nest$fgetoperations_(Ll/ۡܶ᩻;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_10

    .line 8900
    iget-object v0, p0, Ll/ۢܶ᩻;->operationsBuilder_:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 8901
    iget-object v0, p0, Ll/ۢܶ᩻;->operationsBuilder_:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->ᩳ()V

    .line 8902
    iput-object v1, p0, Ll/ۢܶ᩻;->operationsBuilder_:Ll/ܳۚۖ;

    .line 8903
    invoke-static {p1}, Ll/ۡܶ᩻;->-$$Nest$fgetoperations_(Ll/ۡܶ᩻;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ۢܶ᩻;->operations_:Ljava/util/List;

    .line 8904
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 8906
    invoke-static {}, Ll/ۡܶ᩻;->access$600()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 8907
    invoke-direct {p0}, Ll/ۢܶ᩻;->getOperationsFieldBuilder()Ll/ܳۚۖ;

    move-result-object v0

    goto :goto_4

    :cond_e
    move-object v0, v1

    :goto_4
    iput-object v0, p0, Ll/ۢܶ᩻;->operationsBuilder_:Ll/ܳۚۖ;

    goto :goto_5

    .line 8909
    :cond_f
    iget-object v0, p0, Ll/ۢܶ᩻;->operationsBuilder_:Ll/ܳۚۖ;

    invoke-static {p1}, Ll/ۡܶ᩻;->-$$Nest$fgetoperations_(Ll/ۡܶ᩻;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ܳۚۖ;->֫(Ljava/lang/Iterable;)V

    .line 8913
    :cond_10
    :goto_5
    invoke-virtual {p1}, Ll/ۡܶ᩻;->hasPostinstallOptional()Z

    move-result v0

    if-eqz v0, :cond_11

    .line 8914
    invoke-virtual {p1}, Ll/ۡܶ᩻;->getPostinstallOptional()Z

    move-result v0

    invoke-virtual {p0, v0}, Ll/ۢܶ᩻;->setPostinstallOptional(Z)Ll/ۢܶ᩻;

    .line 8916
    :cond_11
    invoke-virtual {p1}, Ll/ۡܶ᩻;->hasHashTreeDataExtent()Z

    move-result v0

    if-eqz v0, :cond_12

    .line 8917
    invoke-virtual {p1}, Ll/ۡܶ᩻;->getHashTreeDataExtent()Ll/۫۠᩻;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۢܶ᩻;->mergeHashTreeDataExtent(Ll/۫۠᩻;)Ll/ۢܶ᩻;

    .line 8919
    :cond_12
    invoke-virtual {p1}, Ll/ۡܶ᩻;->hasHashTreeExtent()Z

    move-result v0

    if-eqz v0, :cond_13

    .line 8920
    invoke-virtual {p1}, Ll/ۡܶ᩻;->getHashTreeExtent()Ll/۫۠᩻;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۢܶ᩻;->mergeHashTreeExtent(Ll/۫۠᩻;)Ll/ۢܶ᩻;

    .line 8922
    :cond_13
    invoke-virtual {p1}, Ll/ۡܶ᩻;->hasHashTreeAlgorithm()Z

    move-result v0

    if-eqz v0, :cond_14

    .line 8923
    invoke-static {p1}, Ll/ۡܶ᩻;->-$$Nest$fgethashTreeAlgorithm_(Ll/ۡܶ᩻;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Ll/ۢܶ᩻;->hashTreeAlgorithm_:Ljava/lang/Object;

    .line 8924
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit16 v0, v0, 0x800

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 8925
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 8927
    :cond_14
    invoke-virtual {p1}, Ll/ۡܶ᩻;->hasHashTreeSalt()Z

    move-result v0

    if-eqz v0, :cond_15

    .line 8928
    invoke-virtual {p1}, Ll/ۡܶ᩻;->getHashTreeSalt()Ll/ۛۜۖ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۢܶ᩻;->setHashTreeSalt(Ll/ۛۜۖ;)Ll/ۢܶ᩻;

    .line 8930
    :cond_15
    invoke-virtual {p1}, Ll/ۡܶ᩻;->hasFecDataExtent()Z

    move-result v0

    if-eqz v0, :cond_16

    .line 8931
    invoke-virtual {p1}, Ll/ۡܶ᩻;->getFecDataExtent()Ll/۫۠᩻;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۢܶ᩻;->mergeFecDataExtent(Ll/۫۠᩻;)Ll/ۢܶ᩻;

    .line 8933
    :cond_16
    invoke-virtual {p1}, Ll/ۡܶ᩻;->hasFecExtent()Z

    move-result v0

    if-eqz v0, :cond_17

    .line 8934
    invoke-virtual {p1}, Ll/ۡܶ᩻;->getFecExtent()Ll/۫۠᩻;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۢܶ᩻;->mergeFecExtent(Ll/۫۠᩻;)Ll/ۢܶ᩻;

    .line 8936
    :cond_17
    invoke-virtual {p1}, Ll/ۡܶ᩻;->hasFecRoots()Z

    move-result v0

    if-eqz v0, :cond_18

    .line 8937
    invoke-virtual {p1}, Ll/ۡܶ᩻;->getFecRoots()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/ۢܶ᩻;->setFecRoots(I)Ll/ۢܶ᩻;

    .line 8939
    :cond_18
    invoke-virtual {p1}, Ll/ۡܶ᩻;->hasVersion()Z

    move-result v0

    if-eqz v0, :cond_19

    .line 8940
    invoke-static {p1}, Ll/ۡܶ᩻;->-$$Nest$fgetversion_(Ll/ۡܶ᩻;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Ll/ۢܶ᩻;->version_:Ljava/lang/Object;

    .line 8941
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    const/high16 v2, 0x10000

    or-int/2addr v0, v2

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 8942
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    .line 8944
    :cond_19
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperationsBuilder_:Ll/ܳۚۖ;

    const v2, -0x20001

    if-nez v0, :cond_1b

    .line 8945
    invoke-static {p1}, Ll/ۡܶ᩻;->-$$Nest$fgetmergeOperations_(Ll/ۡܶ᩻;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1e

    .line 8946
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperations_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 8947
    invoke-static {p1}, Ll/ۡܶ᩻;->-$$Nest$fgetmergeOperations_(Ll/ۡܶ᩻;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ۢܶ᩻;->mergeOperations_:Ljava/util/List;

    .line 8948
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/2addr v0, v2

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    goto :goto_6

    .line 8950
    :cond_1a
    invoke-direct {p0}, Ll/ۢܶ᩻;->ensureMergeOperationsIsMutable()V

    .line 8951
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperations_:Ljava/util/List;

    invoke-static {p1}, Ll/ۡܶ᩻;->-$$Nest$fgetmergeOperations_(Ll/ۡܶ᩻;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 8953
    :goto_6
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    goto :goto_7

    .line 8956
    :cond_1b
    invoke-static {p1}, Ll/ۡܶ᩻;->-$$Nest$fgetmergeOperations_(Ll/ۡܶ᩻;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1e

    .line 8957
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperationsBuilder_:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_1d

    .line 8958
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperationsBuilder_:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->ᩳ()V

    .line 8959
    iput-object v1, p0, Ll/ۢܶ᩻;->mergeOperationsBuilder_:Ll/ܳۚۖ;

    .line 8960
    invoke-static {p1}, Ll/ۡܶ᩻;->-$$Nest$fgetmergeOperations_(Ll/ۡܶ᩻;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ۢܶ᩻;->mergeOperations_:Ljava/util/List;

    .line 8961
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/2addr v0, v2

    iput v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 8963
    invoke-static {}, Ll/ۡܶ᩻;->access$700()Z

    move-result v0

    if-eqz v0, :cond_1c

    .line 8964
    invoke-direct {p0}, Ll/ۢܶ᩻;->getMergeOperationsFieldBuilder()Ll/ܳۚۖ;

    move-result-object v1

    :cond_1c
    iput-object v1, p0, Ll/ۢܶ᩻;->mergeOperationsBuilder_:Ll/ܳۚۖ;

    goto :goto_7

    .line 8966
    :cond_1d
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperationsBuilder_:Ll/ܳۚۖ;

    invoke-static {p1}, Ll/ۡܶ᩻;->-$$Nest$fgetmergeOperations_(Ll/ۡܶ᩻;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܳۚۖ;->֫(Ljava/lang/Iterable;)V

    .line 8970
    :cond_1e
    :goto_7
    invoke-virtual {p1}, Ll/ۡܶ᩻;->hasEstimateCowSize()Z

    move-result v0

    if-eqz v0, :cond_1f

    .line 8971
    invoke-virtual {p1}, Ll/ۡܶ᩻;->getEstimateCowSize()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ll/ۢܶ᩻;->setEstimateCowSize(J)Ll/ۢܶ᩻;

    .line 8973
    :cond_1f
    invoke-virtual {p1}, Ll/ۡܶ᩻;->hasEstimateOpCountMax()Z

    move-result v0

    if-eqz v0, :cond_20

    .line 8974
    invoke-virtual {p1}, Ll/ۡܶ᩻;->getEstimateOpCountMax()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ll/ۢܶ᩻;->setEstimateOpCountMax(J)Ll/ۢܶ᩻;

    .line 8976
    :cond_20
    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩶ۘۖ;->mergeUnknownFields(Ll/ۢ֨ۖ;)Ll/᩶ۘۖ;

    .line 8977
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public mergeFrom(Ll/᩻֡ۖ;)Ll/ۢܶ᩻;
    .locals 1

    .line 8827
    instance-of v0, p1, Ll/ۡܶ᩻;

    if-eqz v0, :cond_0

    .line 8828
    check-cast p1, Ll/ۡܶ᩻;

    invoke-virtual {p0, p1}, Ll/ۢܶ᩻;->mergeFrom(Ll/ۡܶ᩻;)Ll/ۢܶ᩻;

    move-result-object p1

    return-object p1

    .line 8830
    :cond_0
    invoke-super {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 8570
    invoke-virtual {p0, p1, p2}, Ll/ۢܶ᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢܶ᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 8570
    invoke-virtual {p0, p1}, Ll/ۢܶ᩻;->mergeFrom(Ll/᩻֡ۖ;)Ll/ۢܶ᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 8570
    invoke-virtual {p0, p1, p2}, Ll/ۢܶ᩻;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢܶ᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 8570
    invoke-virtual {p0, p1}, Ll/ۢܶ᩻;->mergeFrom(Ll/᩻֡ۖ;)Ll/ۢܶ᩻;

    move-result-object p1

    return-object p1
.end method

.method public mergeHashTreeDataExtent(Ll/۫۠᩻;)Ll/ۢܶ᩻;
    .locals 2

    .line 10677
    iget-object v0, p0, Ll/ۢܶ᩻;->hashTreeDataExtentBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_1

    .line 10678
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۢܶ᩻;->hashTreeDataExtent_:Ll/۫۠᩻;

    if-eqz v0, :cond_0

    .line 10680
    invoke-static {}, Ll/۫۠᩻;->getDefaultInstance()Ll/۫۠᩻;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 10681
    invoke-virtual {p0}, Ll/ۢܶ᩻;->getHashTreeDataExtentBuilder()Ll/۬۠᩻;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/۬۠᩻;->mergeFrom(Ll/۫۠᩻;)Ll/۬۠᩻;

    goto :goto_0

    .line 10683
    :cond_0
    iput-object p1, p0, Ll/ۢܶ᩻;->hashTreeDataExtent_:Ll/۫۠᩻;

    goto :goto_0

    .line 10686
    :cond_1
    invoke-virtual {v0, p1}, Ll/ܺۚۖ;->֫(Ll/ۘᩴۖ;)V

    .line 10688
    :goto_0
    iget-object p1, p0, Ll/ۢܶ᩻;->hashTreeDataExtent_:Ll/۫۠᩻;

    if-eqz p1, :cond_2

    .line 10689
    iget p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit16 p1, p1, 0x200

    iput p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 10690
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    :cond_2
    return-object p0
.end method

.method public mergeHashTreeExtent(Ll/۫۠᩻;)Ll/ۢܶ᩻;
    .locals 2

    .line 10838
    iget-object v0, p0, Ll/ۢܶ᩻;->hashTreeExtentBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_1

    .line 10839
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۢܶ᩻;->hashTreeExtent_:Ll/۫۠᩻;

    if-eqz v0, :cond_0

    .line 10841
    invoke-static {}, Ll/۫۠᩻;->getDefaultInstance()Ll/۫۠᩻;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 10842
    invoke-virtual {p0}, Ll/ۢܶ᩻;->getHashTreeExtentBuilder()Ll/۬۠᩻;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/۬۠᩻;->mergeFrom(Ll/۫۠᩻;)Ll/۬۠᩻;

    goto :goto_0

    .line 10844
    :cond_0
    iput-object p1, p0, Ll/ۢܶ᩻;->hashTreeExtent_:Ll/۫۠᩻;

    goto :goto_0

    .line 10847
    :cond_1
    invoke-virtual {v0, p1}, Ll/ܺۚۖ;->֫(Ll/ۘᩴۖ;)V

    .line 10849
    :goto_0
    iget-object p1, p0, Ll/ۢܶ᩻;->hashTreeExtent_:Ll/۫۠᩻;

    if-eqz p1, :cond_2

    .line 10850
    iget p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit16 p1, p1, 0x400

    iput p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 10851
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    :cond_2
    return-object p0
.end method

.method public mergeNewPartitionInfo(Ll/ܳܶ᩻;)Ll/ۢܶ᩻;
    .locals 2

    .line 10123
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionInfoBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_1

    .line 10124
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionInfo_:Ll/ܳܶ᩻;

    if-eqz v0, :cond_0

    .line 10126
    invoke-static {}, Ll/ܳܶ᩻;->getDefaultInstance()Ll/ܳܶ᩻;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 10127
    invoke-virtual {p0}, Ll/ۢܶ᩻;->getNewPartitionInfoBuilder()Ll/ܿܶ᩻;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ܿܶ᩻;->mergeFrom(Ll/ܳܶ᩻;)Ll/ܿܶ᩻;

    goto :goto_0

    .line 10129
    :cond_0
    iput-object p1, p0, Ll/ۢܶ᩻;->newPartitionInfo_:Ll/ܳܶ᩻;

    goto :goto_0

    .line 10132
    :cond_1
    invoke-virtual {v0, p1}, Ll/ܺۚۖ;->֫(Ll/ۘᩴۖ;)V

    .line 10134
    :goto_0
    iget-object p1, p0, Ll/ۢܶ᩻;->newPartitionInfo_:Ll/ܳܶ᩻;

    if-eqz p1, :cond_2

    .line 10135
    iget p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x40

    iput p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 10136
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    :cond_2
    return-object p0
.end method

.method public mergeOldPartitionInfo(Ll/ܳܶ᩻;)Ll/ۢܶ᩻;
    .locals 2

    .line 10002
    iget-object v0, p0, Ll/ۢܶ᩻;->oldPartitionInfoBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_1

    .line 10003
    iget v0, p0, Ll/ۢܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۢܶ᩻;->oldPartitionInfo_:Ll/ܳܶ᩻;

    if-eqz v0, :cond_0

    .line 10005
    invoke-static {}, Ll/ܳܶ᩻;->getDefaultInstance()Ll/ܳܶ᩻;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 10006
    invoke-virtual {p0}, Ll/ۢܶ᩻;->getOldPartitionInfoBuilder()Ll/ܿܶ᩻;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ܿܶ᩻;->mergeFrom(Ll/ܳܶ᩻;)Ll/ܿܶ᩻;

    goto :goto_0

    .line 10008
    :cond_0
    iput-object p1, p0, Ll/ۢܶ᩻;->oldPartitionInfo_:Ll/ܳܶ᩻;

    goto :goto_0

    .line 10011
    :cond_1
    invoke-virtual {v0, p1}, Ll/ܺۚۖ;->֫(Ll/ۘᩴۖ;)V

    .line 10013
    :goto_0
    iget-object p1, p0, Ll/ۢܶ᩻;->oldPartitionInfo_:Ll/ܳܶ᩻;

    if-eqz p1, :cond_2

    .line 10014
    iget p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x20

    iput p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 10015
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    :cond_2
    return-object p0
.end method

.method public removeMergeOperations(I)Ll/ۢܶ᩻;
    .locals 1

    .line 11804
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperationsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 11805
    invoke-direct {p0}, Ll/ۢܶ᩻;->ensureMergeOperationsIsMutable()V

    .line 11806
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperations_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 11807
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 11809
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ᩳ(I)V

    return-object p0
.end method

.method public removeNewPartitionSignature(I)Ll/ۢܶ᩻;
    .locals 1

    .line 9831
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignatureBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 9832
    invoke-direct {p0}, Ll/ۢܶ᩻;->ensureNewPartitionSignatureIsMutable()V

    .line 9833
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignature_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 9834
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 9836
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ᩳ(I)V

    return-object p0
.end method

.method public removeOperations(I)Ll/ۢܶ᩻;
    .locals 1

    .line 10427
    iget-object v0, p0, Ll/ۢܶ᩻;->operationsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 10428
    invoke-direct {p0}, Ll/ۢܶ᩻;->ensureOperationsIsMutable()V

    .line 10429
    iget-object v0, p0, Ll/ۢܶ᩻;->operations_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 10430
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 10432
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ᩳ(I)V

    return-object p0
.end method

.method public setEstimateCowSize(J)Ll/ۢܶ᩻;
    .locals 0

    .line 11956
    iput-wide p1, p0, Ll/ۢܶ᩻;->estimateCowSize_:J

    .line 11957
    iget p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    const/high16 p2, 0x40000

    or-int/2addr p1, p2

    iput p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 11958
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setEstimateOpCountMax(J)Ll/ۢܶ᩻;
    .locals 0

    .line 12017
    iput-wide p1, p0, Ll/ۢܶ᩻;->estimateOpCountMax_:J

    .line 12018
    iget p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    const/high16 p2, 0x80000

    or-int/2addr p1, p2

    iput p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 12019
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setFecDataExtent(Ll/۫۠᩻;)Ll/ۢܶ᩻;
    .locals 1

    .line 11117
    iget-object v0, p0, Ll/ۢܶ᩻;->fecDataExtentBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 11119
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11121
    iput-object p1, p0, Ll/ۢܶ᩻;->fecDataExtent_:Ll/۫۠᩻;

    goto :goto_0

    .line 11123
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܺۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    .line 11125
    :goto_0
    iget p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit16 p1, p1, 0x2000

    iput p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 11126
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setFecDataExtent(Ll/۬۠᩻;)Ll/ۢܶ᩻;
    .locals 1

    .line 11138
    iget-object v0, p0, Ll/ۢܶ᩻;->fecDataExtentBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 11139
    invoke-virtual {p1}, Ll/۬۠᩻;->build()Ll/۫۠᩻;

    move-result-object p1

    iput-object p1, p0, Ll/ۢܶ᩻;->fecDataExtent_:Ll/۫۠᩻;

    goto :goto_0

    .line 11141
    :cond_0
    invoke-virtual {p1}, Ll/۬۠᩻;->build()Ll/۫۠᩻;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ܺۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    .line 11143
    :goto_0
    iget p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit16 p1, p1, 0x2000

    iput p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 11144
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setFecExtent(Ll/۫۠᩻;)Ll/ۢܶ᩻;
    .locals 1

    .line 11274
    iget-object v0, p0, Ll/ۢܶ᩻;->fecExtentBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 11276
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11278
    iput-object p1, p0, Ll/ۢܶ᩻;->fecExtent_:Ll/۫۠᩻;

    goto :goto_0

    .line 11280
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܺۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    .line 11282
    :goto_0
    iget p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit16 p1, p1, 0x4000

    iput p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 11283
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setFecExtent(Ll/۬۠᩻;)Ll/ۢܶ᩻;
    .locals 1

    .line 11295
    iget-object v0, p0, Ll/ۢܶ᩻;->fecExtentBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 11296
    invoke-virtual {p1}, Ll/۬۠᩻;->build()Ll/۫۠᩻;

    move-result-object p1

    iput-object p1, p0, Ll/ۢܶ᩻;->fecExtent_:Ll/۫۠᩻;

    goto :goto_0

    .line 11298
    :cond_0
    invoke-virtual {p1}, Ll/۬۠᩻;->build()Ll/۫۠᩻;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ܺۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    .line 11300
    :goto_0
    iget p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit16 p1, p1, 0x4000

    iput p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 11301
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setFecRoots(I)Ll/ۢܶ᩻;
    .locals 1

    .line 11430
    iput p1, p0, Ll/ۢܶ᩻;->fecRoots_:I

    .line 11431
    iget p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    const v0, 0x8000

    or-int/2addr p1, v0

    iput p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 11432
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setFilesystemType(Ljava/lang/String;)Ll/ۢܶ᩻;
    .locals 0

    .line 9537
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9538
    iput-object p1, p0, Ll/ۢܶ᩻;->filesystemType_:Ljava/lang/Object;

    .line 9539
    iget p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x8

    iput p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 9540
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setFilesystemTypeBytes(Ll/ۛۜۖ;)Ll/ۢܶ᩻;
    .locals 0

    .line 9574
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9575
    iput-object p1, p0, Ll/ۢܶ᩻;->filesystemType_:Ljava/lang/Object;

    .line 9576
    iget p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x8

    iput p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 9577
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setHashTreeAlgorithm(Ljava/lang/String;)Ll/ۢܶ᩻;
    .locals 0

    .line 10986
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10987
    iput-object p1, p0, Ll/ۢܶ᩻;->hashTreeAlgorithm_:Ljava/lang/Object;

    .line 10988
    iget p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit16 p1, p1, 0x800

    iput p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 10989
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setHashTreeAlgorithmBytes(Ll/ۛۜۖ;)Ll/ۢܶ᩻;
    .locals 0

    .line 11017
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11018
    iput-object p1, p0, Ll/ۢܶ᩻;->hashTreeAlgorithm_:Ljava/lang/Object;

    .line 11019
    iget p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit16 p1, p1, 0x800

    iput p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 11020
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setHashTreeDataExtent(Ll/۫۠᩻;)Ll/ۢܶ᩻;
    .locals 1

    .line 10637
    iget-object v0, p0, Ll/ۢܶ᩻;->hashTreeDataExtentBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 10639
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10641
    iput-object p1, p0, Ll/ۢܶ᩻;->hashTreeDataExtent_:Ll/۫۠᩻;

    goto :goto_0

    .line 10643
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܺۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    .line 10645
    :goto_0
    iget p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit16 p1, p1, 0x200

    iput p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 10646
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setHashTreeDataExtent(Ll/۬۠᩻;)Ll/ۢܶ᩻;
    .locals 1

    .line 10659
    iget-object v0, p0, Ll/ۢܶ᩻;->hashTreeDataExtentBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 10660
    invoke-virtual {p1}, Ll/۬۠᩻;->build()Ll/۫۠᩻;

    move-result-object p1

    iput-object p1, p0, Ll/ۢܶ᩻;->hashTreeDataExtent_:Ll/۫۠᩻;

    goto :goto_0

    .line 10662
    :cond_0
    invoke-virtual {p1}, Ll/۬۠᩻;->build()Ll/۫۠᩻;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ܺۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    .line 10664
    :goto_0
    iget p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit16 p1, p1, 0x200

    iput p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 10665
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setHashTreeExtent(Ll/۫۠᩻;)Ll/ۢܶ᩻;
    .locals 1

    .line 10800
    iget-object v0, p0, Ll/ۢܶ᩻;->hashTreeExtentBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 10802
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10804
    iput-object p1, p0, Ll/ۢܶ᩻;->hashTreeExtent_:Ll/۫۠᩻;

    goto :goto_0

    .line 10806
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܺۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    .line 10808
    :goto_0
    iget p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit16 p1, p1, 0x400

    iput p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 10809
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setHashTreeExtent(Ll/۬۠᩻;)Ll/ۢܶ᩻;
    .locals 1

    .line 10821
    iget-object v0, p0, Ll/ۢܶ᩻;->hashTreeExtentBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 10822
    invoke-virtual {p1}, Ll/۬۠᩻;->build()Ll/۫۠᩻;

    move-result-object p1

    iput-object p1, p0, Ll/ۢܶ᩻;->hashTreeExtent_:Ll/۫۠᩻;

    goto :goto_0

    .line 10824
    :cond_0
    invoke-virtual {p1}, Ll/۬۠᩻;->build()Ll/۫۠᩻;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ܺۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    .line 10826
    :goto_0
    iget p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit16 p1, p1, 0x400

    iput p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 10827
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setHashTreeSalt(Ll/ۛۜۖ;)Ll/ۢܶ᩻;
    .locals 0

    .line 11059
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11060
    iput-object p1, p0, Ll/ۢܶ᩻;->hashTreeSalt_:Ll/ۛۜۖ;

    .line 11061
    iget p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit16 p1, p1, 0x1000

    iput p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 11062
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setMergeOperations(ILl/ۜ۠᩻;)Ll/ۢܶ᩻;
    .locals 1

    .line 11637
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperationsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 11639
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11641
    invoke-direct {p0}, Ll/ۢܶ᩻;->ensureMergeOperationsIsMutable()V

    .line 11642
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperations_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 11643
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 11645
    :cond_0
    invoke-virtual {v0, p1, p2}, Ll/ܳۚۖ;->ܽ(ILl/ۘᩴۖ;)V

    return-object p0
.end method

.method public setMergeOperations(ILl/ܿ۠᩻;)Ll/ۢܶ᩻;
    .locals 1

    .line 11660
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperationsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 11661
    invoke-direct {p0}, Ll/ۢܶ᩻;->ensureMergeOperationsIsMutable()V

    .line 11662
    iget-object v0, p0, Ll/ۢܶ᩻;->mergeOperations_:Ljava/util/List;

    invoke-virtual {p2}, Ll/ܿ۠᩻;->build()Ll/ۜ۠᩻;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 11663
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 11665
    :cond_0
    invoke-virtual {p2}, Ll/ܿ۠᩻;->build()Ll/ۜ۠᩻;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ll/ܳۚۖ;->ܽ(ILl/ۘᩴۖ;)V

    return-object p0
.end method

.method public setNewPartitionInfo(Ll/ܳܶ᩻;)Ll/ۢܶ᩻;
    .locals 1

    .line 10093
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionInfoBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 10095
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10097
    iput-object p1, p0, Ll/ۢܶ᩻;->newPartitionInfo_:Ll/ܳܶ᩻;

    goto :goto_0

    .line 10099
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܺۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    .line 10101
    :goto_0
    iget p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x40

    iput p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 10102
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setNewPartitionInfo(Ll/ܿܶ᩻;)Ll/ۢܶ᩻;
    .locals 1

    .line 10110
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionInfoBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 10111
    invoke-virtual {p1}, Ll/ܿܶ᩻;->build()Ll/ܳܶ᩻;

    move-result-object p1

    iput-object p1, p0, Ll/ۢܶ᩻;->newPartitionInfo_:Ll/ܳܶ᩻;

    goto :goto_0

    .line 10113
    :cond_0
    invoke-virtual {p1}, Ll/ܿܶ᩻;->build()Ll/ܳܶ᩻;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ܺۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    .line 10115
    :goto_0
    iget p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x40

    iput p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 10116
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setNewPartitionSignature(ILl/ᩴܶ᩻;)Ll/ۢܶ᩻;
    .locals 1

    .line 9680
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignatureBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 9681
    invoke-direct {p0}, Ll/ۢܶ᩻;->ensureNewPartitionSignatureIsMutable()V

    .line 9682
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignature_:Ljava/util/List;

    invoke-virtual {p2}, Ll/ᩴܶ᩻;->build()Ll/᩵ܶ᩻;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 9683
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 9685
    :cond_0
    invoke-virtual {p2}, Ll/ᩴܶ᩻;->build()Ll/᩵ܶ᩻;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ll/ܳۚۖ;->ܽ(ILl/ۘᩴۖ;)V

    return-object p0
.end method

.method public setNewPartitionSignature(ILl/᩵ܶ᩻;)Ll/ۢܶ᩻;
    .locals 1

    .line 9656
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignatureBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 9658
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9660
    invoke-direct {p0}, Ll/ۢܶ᩻;->ensureNewPartitionSignatureIsMutable()V

    .line 9661
    iget-object v0, p0, Ll/ۢܶ᩻;->newPartitionSignature_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 9662
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 9664
    :cond_0
    invoke-virtual {v0, p1, p2}, Ll/ܳۚۖ;->ܽ(ILl/ۘᩴۖ;)V

    return-object p0
.end method

.method public setOldPartitionInfo(Ll/ܳܶ᩻;)Ll/ۢܶ᩻;
    .locals 1

    .line 9972
    iget-object v0, p0, Ll/ۢܶ᩻;->oldPartitionInfoBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 9974
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9976
    iput-object p1, p0, Ll/ۢܶ᩻;->oldPartitionInfo_:Ll/ܳܶ᩻;

    goto :goto_0

    .line 9978
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܺۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    .line 9980
    :goto_0
    iget p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x20

    iput p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 9981
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setOldPartitionInfo(Ll/ܿܶ᩻;)Ll/ۢܶ᩻;
    .locals 1

    .line 9989
    iget-object v0, p0, Ll/ۢܶ᩻;->oldPartitionInfoBuilder_:Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 9990
    invoke-virtual {p1}, Ll/ܿܶ᩻;->build()Ll/ܳܶ᩻;

    move-result-object p1

    iput-object p1, p0, Ll/ۢܶ᩻;->oldPartitionInfo_:Ll/ܳܶ᩻;

    goto :goto_0

    .line 9992
    :cond_0
    invoke-virtual {p1}, Ll/ܿܶ᩻;->build()Ll/ܳܶ᩻;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ܺۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    .line 9994
    :goto_0
    iget p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x20

    iput p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 9995
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setOperations(ILl/֫ܶ᩻;)Ll/ۢܶ᩻;
    .locals 1

    .line 10260
    iget-object v0, p0, Ll/ۢܶ᩻;->operationsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 10262
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10264
    invoke-direct {p0}, Ll/ۢܶ᩻;->ensureOperationsIsMutable()V

    .line 10265
    iget-object v0, p0, Ll/ۢܶ᩻;->operations_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 10266
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 10268
    :cond_0
    invoke-virtual {v0, p1, p2}, Ll/ܳۚۖ;->ܽ(ILl/ۘᩴۖ;)V

    return-object p0
.end method

.method public setOperations(ILl/᩺۠᩻;)Ll/ۢܶ᩻;
    .locals 1

    .line 10283
    iget-object v0, p0, Ll/ۢܶ᩻;->operationsBuilder_:Ll/ܳۚۖ;

    if-nez v0, :cond_0

    .line 10284
    invoke-direct {p0}, Ll/ۢܶ᩻;->ensureOperationsIsMutable()V

    .line 10285
    iget-object v0, p0, Ll/ۢܶ᩻;->operations_:Ljava/util/List;

    invoke-virtual {p2}, Ll/᩺۠᩻;->build()Ll/֫ܶ᩻;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 10286
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 10288
    :cond_0
    invoke-virtual {p2}, Ll/᩺۠᩻;->build()Ll/֫ܶ᩻;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ll/ܳۚۖ;->ܽ(ILl/ۘᩴۖ;)V

    return-object p0
.end method

.method public setPartitionName(Ljava/lang/String;)Ll/ۢܶ᩻;
    .locals 0

    .line 9233
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9234
    iput-object p1, p0, Ll/ۢܶ᩻;->partitionName_:Ljava/lang/Object;

    .line 9235
    iget p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 9236
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setPartitionNameBytes(Ll/ۛۜۖ;)Ll/ۢܶ᩻;
    .locals 0

    .line 9266
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9267
    iput-object p1, p0, Ll/ۢܶ᩻;->partitionName_:Ljava/lang/Object;

    .line 9268
    iget p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 9269
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setPostinstallOptional(Z)Ll/ۢܶ᩻;
    .locals 0

    .line 10576
    iput-boolean p1, p0, Ll/ۢܶ᩻;->postinstallOptional_:Z

    .line 10577
    iget p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit16 p1, p1, 0x100

    iput p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 10578
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setPostinstallPath(Ljava/lang/String;)Ll/ۢܶ᩻;
    .locals 0

    .line 9415
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9416
    iput-object p1, p0, Ll/ۢܶ᩻;->postinstallPath_:Ljava/lang/Object;

    .line 9417
    iget p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 9418
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setPostinstallPathBytes(Ll/ۛۜۖ;)Ll/ۢܶ᩻;
    .locals 0

    .line 9452
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9453
    iput-object p1, p0, Ll/ۢܶ᩻;->postinstallPath_:Ljava/lang/Object;

    .line 9454
    iget p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 9455
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setRunPostinstall(Z)Ll/ۢܶ᩻;
    .locals 0

    .line 9315
    iput-boolean p1, p0, Ll/ۢܶ᩻;->runPostinstall_:Z

    .line 9316
    iget p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 9317
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setVersion(Ljava/lang/String;)Ll/ۢܶ᩻;
    .locals 1

    .line 11524
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11525
    iput-object p1, p0, Ll/ۢܶ᩻;->version_:Ljava/lang/Object;

    .line 11526
    iget p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    const/high16 v0, 0x10000

    or-int/2addr p1, v0

    iput p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 11527
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method

.method public setVersionBytes(Ll/ۛۜۖ;)Ll/ۢܶ᩻;
    .locals 1

    .line 11559
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11560
    iput-object p1, p0, Ll/ۢܶ᩻;->version_:Ljava/lang/Object;

    .line 11561
    iget p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    const/high16 v0, 0x10000

    or-int/2addr p1, v0

    iput p1, p0, Ll/ۢܶ᩻;->bitField0_:I

    .line 11562
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0
.end method
