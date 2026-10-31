.class public final Ll/ۡܶ᩻;
.super Ll/ۘᩴۖ;
.source "C9PC"

# interfaces
.implements Ll/ۖܶ᩻;


# static fields
.field public static final DEFAULT_INSTANCE:Ll/ۡܶ᩻;

.field public static final ESTIMATE_COW_SIZE_FIELD_NUMBER:I = 0x13

.field public static final ESTIMATE_OP_COUNT_MAX_FIELD_NUMBER:I = 0x14

.field public static final FEC_DATA_EXTENT_FIELD_NUMBER:I = 0xe

.field public static final FEC_EXTENT_FIELD_NUMBER:I = 0xf

.field public static final FEC_ROOTS_FIELD_NUMBER:I = 0x10

.field public static final FILESYSTEM_TYPE_FIELD_NUMBER:I = 0x4

.field public static final HASH_TREE_ALGORITHM_FIELD_NUMBER:I = 0xc

.field public static final HASH_TREE_DATA_EXTENT_FIELD_NUMBER:I = 0xa

.field public static final HASH_TREE_EXTENT_FIELD_NUMBER:I = 0xb

.field public static final HASH_TREE_SALT_FIELD_NUMBER:I = 0xd

.field public static final MERGE_OPERATIONS_FIELD_NUMBER:I = 0x12

.field public static final NEW_PARTITION_INFO_FIELD_NUMBER:I = 0x7

.field public static final NEW_PARTITION_SIGNATURE_FIELD_NUMBER:I = 0x5

.field public static final OLD_PARTITION_INFO_FIELD_NUMBER:I = 0x6

.field public static final OPERATIONS_FIELD_NUMBER:I = 0x8

.field public static final PARSER:Ll/۫֡ۖ;

.field public static final PARTITION_NAME_FIELD_NUMBER:I = 0x1

.field public static final POSTINSTALL_OPTIONAL_FIELD_NUMBER:I = 0x9

.field public static final POSTINSTALL_PATH_FIELD_NUMBER:I = 0x3

.field public static final RUN_POSTINSTALL_FIELD_NUMBER:I = 0x2

.field public static final VERSION_FIELD_NUMBER:I = 0x11

.field public static final serialVersionUID:J


# instance fields
.field public bitField0_:I

.field public estimateCowSize_:J

.field public estimateOpCountMax_:J

.field public fecDataExtent_:Ll/۫۠᩻;

.field public fecExtent_:Ll/۫۠᩻;

.field public fecRoots_:I

.field public volatile filesystemType_:Ljava/lang/Object;

.field public volatile hashTreeAlgorithm_:Ljava/lang/Object;

.field public hashTreeDataExtent_:Ll/۫۠᩻;

.field public hashTreeExtent_:Ll/۫۠᩻;

.field public hashTreeSalt_:Ll/ۛۜۖ;

.field public memoizedIsInitialized:B

.field public mergeOperations_:Ljava/util/List;

.field public newPartitionInfo_:Ll/ܳܶ᩻;

.field public newPartitionSignature_:Ljava/util/List;

.field public oldPartitionInfo_:Ll/ܳܶ᩻;

.field public operations_:Ljava/util/List;

.field public volatile partitionName_:Ljava/lang/Object;

.field public postinstallOptional_:Z

.field public volatile postinstallPath_:Ljava/lang/Object;

.field public runPostinstall_:Z

.field public volatile version_:Ljava/lang/Object;


# direct methods
.method public static bridge synthetic -$$Nest$fgetbitField0_(Ll/ۡܶ᩻;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۡܶ᩻;->bitField0_:I

    return p0
.end method

.method public static bridge synthetic -$$Nest$fgetfilesystemType_(Ll/ۡܶ᩻;)Ljava/lang/Object;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡܶ᩻;->filesystemType_:Ljava/lang/Object;

    return-object p0
.end method

.method public static bridge synthetic -$$Nest$fgethashTreeAlgorithm_(Ll/ۡܶ᩻;)Ljava/lang/Object;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡܶ᩻;->hashTreeAlgorithm_:Ljava/lang/Object;

    return-object p0
.end method

.method public static bridge synthetic -$$Nest$fgetmergeOperations_(Ll/ۡܶ᩻;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡܶ᩻;->mergeOperations_:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic -$$Nest$fgetnewPartitionSignature_(Ll/ۡܶ᩻;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡܶ᩻;->newPartitionSignature_:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic -$$Nest$fgetoperations_(Ll/ۡܶ᩻;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡܶ᩻;->operations_:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic -$$Nest$fgetpartitionName_(Ll/ۡܶ᩻;)Ljava/lang/Object;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡܶ᩻;->partitionName_:Ljava/lang/Object;

    return-object p0
.end method

.method public static bridge synthetic -$$Nest$fgetpostinstallPath_(Ll/ۡܶ᩻;)Ljava/lang/Object;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡܶ᩻;->postinstallPath_:Ljava/lang/Object;

    return-object p0
.end method

.method public static bridge synthetic -$$Nest$fgetversion_(Ll/ۡܶ᩻;)Ljava/lang/Object;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡܶ᩻;->version_:Ljava/lang/Object;

    return-object p0
.end method

.method public static bridge synthetic -$$Nest$fputbitField0_(ILl/ۡܶ᩻;)V
    .locals 0

    .line 0
    iput p0, p1, Ll/ۡܶ᩻;->bitField0_:I

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputestimateCowSize_(Ll/ۡܶ᩻;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/ۡܶ᩻;->estimateCowSize_:J

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputestimateOpCountMax_(Ll/ۡܶ᩻;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/ۡܶ᩻;->estimateOpCountMax_:J

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputfecDataExtent_(Ll/ۡܶ᩻;Ll/۫۠᩻;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۡܶ᩻;->fecDataExtent_:Ll/۫۠᩻;

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputfecExtent_(Ll/ۡܶ᩻;Ll/۫۠᩻;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۡܶ᩻;->fecExtent_:Ll/۫۠᩻;

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputfecRoots_(ILl/ۡܶ᩻;)V
    .locals 0

    .line 0
    iput p0, p1, Ll/ۡܶ᩻;->fecRoots_:I

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputfilesystemType_(Ll/ۡܶ᩻;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۡܶ᩻;->filesystemType_:Ljava/lang/Object;

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputhashTreeAlgorithm_(Ll/ۡܶ᩻;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۡܶ᩻;->hashTreeAlgorithm_:Ljava/lang/Object;

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputhashTreeDataExtent_(Ll/ۡܶ᩻;Ll/۫۠᩻;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۡܶ᩻;->hashTreeDataExtent_:Ll/۫۠᩻;

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputhashTreeExtent_(Ll/ۡܶ᩻;Ll/۫۠᩻;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۡܶ᩻;->hashTreeExtent_:Ll/۫۠᩻;

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputhashTreeSalt_(Ll/ۡܶ᩻;Ll/ۛۜۖ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۡܶ᩻;->hashTreeSalt_:Ll/ۛۜۖ;

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputmergeOperations_(Ll/ۡܶ᩻;Ljava/util/List;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۡܶ᩻;->mergeOperations_:Ljava/util/List;

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputnewPartitionInfo_(Ll/ۡܶ᩻;Ll/ܳܶ᩻;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۡܶ᩻;->newPartitionInfo_:Ll/ܳܶ᩻;

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputnewPartitionSignature_(Ll/ۡܶ᩻;Ljava/util/List;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۡܶ᩻;->newPartitionSignature_:Ljava/util/List;

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputoldPartitionInfo_(Ll/ۡܶ᩻;Ll/ܳܶ᩻;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۡܶ᩻;->oldPartitionInfo_:Ll/ܳܶ᩻;

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputoperations_(Ll/ۡܶ᩻;Ljava/util/List;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۡܶ᩻;->operations_:Ljava/util/List;

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputpartitionName_(Ll/ۡܶ᩻;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۡܶ᩻;->partitionName_:Ljava/lang/Object;

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputpostinstallOptional_(Ll/ۡܶ᩻;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/ۡܶ᩻;->postinstallOptional_:Z

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputpostinstallPath_(Ll/ۡܶ᩻;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۡܶ᩻;->postinstallPath_:Ljava/lang/Object;

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputrunPostinstall_(Ll/ۡܶ᩻;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/ۡܶ᩻;->runPostinstall_:Z

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputversion_(Ll/ۡܶ᩻;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۡܶ᩻;->version_:Ljava/lang/Object;

    return-void
.end method

.method public static constructor <clinit>()V
    .locals 2

    .line 7127
    sget-object v0, Ll/ۜۚۖ;->᩶:Ll/ۜۚۖ;

    const-class v1, Ll/ۡܶ᩻;

    .line 7133
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    .line 7127
    invoke-static {v0, v1}, Ll/᩷ۚۖ;->֫(Ll/ۜۚۖ;Ljava/lang/String;)V

    .line 12044
    new-instance v0, Ll/ۡܶ᩻;

    invoke-direct {v0}, Ll/ۡܶ᩻;-><init>()V

    sput-object v0, Ll/ۡܶ᩻;->DEFAULT_INSTANCE:Ll/ۡܶ᩻;

    .line 12052
    new-instance v0, Ll/᩷ܶ᩻;

    invoke-direct {v0}, Ll/᩷ܶ᩻;-><init>()V

    sput-object v0, Ll/ۡܶ᩻;->PARSER:Ll/۫֡ۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 7139
    invoke-direct {p0}, Ll/ۘᩴۖ;-><init>()V

    const-string v0, ""

    .line 7167
    iput-object v0, p0, Ll/ۡܶ᩻;->partitionName_:Ljava/lang/Object;

    const/4 v1, 0x0

    .line 7231
    iput-boolean v1, p0, Ll/ۡܶ᩻;->runPostinstall_:Z

    .line 7262
    iput-object v0, p0, Ll/ۡܶ᩻;->postinstallPath_:Ljava/lang/Object;

    .line 7332
    iput-object v0, p0, Ll/ۡܶ᩻;->filesystemType_:Ljava/lang/Object;

    .line 7601
    iput-boolean v1, p0, Ll/ۡܶ᩻;->postinstallOptional_:Z

    .line 7709
    iput-object v0, p0, Ll/ۡܶ᩻;->hashTreeAlgorithm_:Ljava/lang/Object;

    .line 7770
    sget-object v1, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    iput-object v1, p0, Ll/ۡܶ᩻;->hashTreeSalt_:Ll/ۛۜۖ;

    const/4 v2, 0x2

    .line 7873
    iput v2, p0, Ll/ۡܶ᩻;->fecRoots_:I

    .line 7900
    iput-object v0, p0, Ll/ۡܶ᩻;->version_:Ljava/lang/Object;

    const-wide/16 v3, 0x0

    .line 8038
    iput-wide v3, p0, Ll/ۡܶ᩻;->estimateCowSize_:J

    .line 8069
    iput-wide v3, p0, Ll/ۡܶ᩻;->estimateOpCountMax_:J

    const/4 v3, -0x1

    .line 8097
    iput-byte v3, p0, Ll/ۡܶ᩻;->memoizedIsInitialized:B

    .line 7140
    iput-object v0, p0, Ll/ۡܶ᩻;->partitionName_:Ljava/lang/Object;

    .line 7141
    iput-object v0, p0, Ll/ۡܶ᩻;->postinstallPath_:Ljava/lang/Object;

    .line 7142
    iput-object v0, p0, Ll/ۡܶ᩻;->filesystemType_:Ljava/lang/Object;

    .line 7143
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v3, p0, Ll/ۡܶ᩻;->newPartitionSignature_:Ljava/util/List;

    .line 7144
    iput-object v3, p0, Ll/ۡܶ᩻;->operations_:Ljava/util/List;

    .line 7145
    iput-object v0, p0, Ll/ۡܶ᩻;->hashTreeAlgorithm_:Ljava/lang/Object;

    .line 7146
    iput-object v1, p0, Ll/ۡܶ᩻;->hashTreeSalt_:Ll/ۛۜۖ;

    .line 7147
    iput v2, p0, Ll/ۡܶ᩻;->fecRoots_:I

    .line 7148
    iput-object v0, p0, Ll/ۡܶ᩻;->version_:Ljava/lang/Object;

    .line 7149
    iput-object v3, p0, Ll/ۡܶ᩻;->mergeOperations_:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۢܶ᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ۡܶ᩻;-><init>(Ll/᩶ۘۖ;)V

    return-void
.end method

.method public constructor <init>(Ll/᩶ۘۖ;)V
    .locals 2

    .line 7137
    invoke-direct {p0, p1}, Ll/ۘᩴۖ;-><init>(Ll/᩶ۘۖ;)V

    const-string p1, ""

    .line 7167
    iput-object p1, p0, Ll/ۡܶ᩻;->partitionName_:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 7231
    iput-boolean v0, p0, Ll/ۡܶ᩻;->runPostinstall_:Z

    .line 7262
    iput-object p1, p0, Ll/ۡܶ᩻;->postinstallPath_:Ljava/lang/Object;

    .line 7332
    iput-object p1, p0, Ll/ۡܶ᩻;->filesystemType_:Ljava/lang/Object;

    .line 7601
    iput-boolean v0, p0, Ll/ۡܶ᩻;->postinstallOptional_:Z

    .line 7709
    iput-object p1, p0, Ll/ۡܶ᩻;->hashTreeAlgorithm_:Ljava/lang/Object;

    .line 7770
    sget-object v0, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    iput-object v0, p0, Ll/ۡܶ᩻;->hashTreeSalt_:Ll/ۛۜۖ;

    const/4 v0, 0x2

    .line 7873
    iput v0, p0, Ll/ۡܶ᩻;->fecRoots_:I

    .line 7900
    iput-object p1, p0, Ll/ۡܶ᩻;->version_:Ljava/lang/Object;

    const-wide/16 v0, 0x0

    .line 8038
    iput-wide v0, p0, Ll/ۡܶ᩻;->estimateCowSize_:J

    .line 8069
    iput-wide v0, p0, Ll/ۡܶ᩻;->estimateOpCountMax_:J

    const/4 p1, -0x1

    .line 8097
    iput-byte p1, p0, Ll/ۡܶ᩻;->memoizedIsInitialized:B

    return-void
.end method

.method public static synthetic access$400()Z
    .locals 1

    .line 7121
    sget-boolean v0, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method public static synthetic access$500()Z
    .locals 1

    .line 7121
    sget-boolean v0, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method public static synthetic access$600()Z
    .locals 1

    .line 7121
    sget-boolean v0, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method public static synthetic access$700()Z
    .locals 1

    .line 7121
    sget-boolean v0, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method public static getDefaultInstance()Ll/ۡܶ᩻;
    .locals 1

    .line 12048
    sget-object v0, Ll/ۡܶ᩻;->DEFAULT_INSTANCE:Ll/ۡܶ᩻;

    return-object v0
.end method

.method public static final getDescriptor()Ll/ᩳۖۖ;
    .locals 1

    .line 7154
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_PartitionUpdate_descriptor()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder()Ll/ۢܶ᩻;
    .locals 1

    .line 8546
    sget-object v0, Ll/ۡܶ᩻;->DEFAULT_INSTANCE:Ll/ۡܶ᩻;

    invoke-virtual {v0}, Ll/ۡܶ᩻;->toBuilder()Ll/ۢܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Ll/ۡܶ᩻;)Ll/ۢܶ᩻;
    .locals 1

    .line 8549
    sget-object v0, Ll/ۡܶ᩻;->DEFAULT_INSTANCE:Ll/ۡܶ᩻;

    invoke-virtual {v0}, Ll/ۡܶ᩻;->toBuilder()Ll/ۢܶ᩻;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/ۢܶ᩻;->mergeFrom(Ll/ۡܶ᩻;)Ll/ۢܶ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Ll/ۡܶ᩻;
    .locals 1

    .line 8518
    sget-object v0, Ll/ۡܶ᩻;->PARSER:Ll/۫֡ۖ;

    .line 8519
    invoke-static {v0, p0}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ljava/io/InputStream;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/ۡܶ᩻;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/ۡܶ᩻;
    .locals 1

    .line 8526
    sget-object v0, Ll/ۡܶ᩻;->PARSER:Ll/۫֡ۖ;

    .line 8527
    invoke-static {v0, p0, p1}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/ۡܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Ll/ۡܶ᩻;
    .locals 1

    .line 8505
    sget-object v0, Ll/ۡܶ᩻;->PARSER:Ll/۫֡ۖ;

    .line 8506
    invoke-static {v0, p0}, Ll/ۘᩴۖ;->ۧ(Ll/۫֡ۖ;Ljava/io/InputStream;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/ۡܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/ۡܶ᩻;
    .locals 1

    .line 8512
    sget-object v0, Ll/ۡܶ᩻;->PARSER:Ll/۫֡ۖ;

    .line 8513
    invoke-static {v0, p0, p1}, Ll/ۘᩴۖ;->ۧ(Ll/۫֡ۖ;Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/ۡܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Ll/ۡܶ᩻;
    .locals 1

    .line 8474
    sget-object v0, Ll/ۡܶ᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0}, Ll/۫֡ۖ;->parseFrom(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۡܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Ll/ᩳۘۖ;)Ll/ۡܶ᩻;
    .locals 1

    .line 8480
    sget-object v0, Ll/ۡܶ᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0, p1}, Ll/۫֡ۖ;->parseFrom(Ljava/nio/ByteBuffer;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۡܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/ۛۜۖ;)Ll/ۡܶ᩻;
    .locals 1

    .line 8485
    sget-object v0, Ll/ۡܶ᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0}, Ll/۫֡ۖ;->parseFrom(Ll/ۛۜۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۡܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ll/ۡܶ᩻;
    .locals 1

    .line 8491
    sget-object v0, Ll/ۡܶ᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0, p1}, Ll/۫֡ۖ;->parseFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۡܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/۟ۜۖ;)Ll/ۡܶ᩻;
    .locals 1

    .line 8532
    sget-object v0, Ll/ۡܶ᩻;->PARSER:Ll/۫֡ۖ;

    .line 8533
    invoke-static {v0, p0}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ll/۟ۜۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/ۡܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۡܶ᩻;
    .locals 1

    .line 8539
    sget-object v0, Ll/ۡܶ᩻;->PARSER:Ll/۫֡ۖ;

    .line 8540
    invoke-static {v0, p0, p1}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/ۡܶ᩻;

    return-object p0
.end method

.method public static parseFrom([B)Ll/ۡܶ᩻;
    .locals 1

    .line 8495
    sget-object v0, Ll/ۡܶ᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0}, Ll/۫֡ۖ;->parseFrom([B)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۡܶ᩻;

    return-object p0
.end method

.method public static parseFrom([BLl/ᩳۘۖ;)Ll/ۡܶ᩻;
    .locals 1

    .line 8501
    sget-object v0, Ll/ۡܶ᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0, p1}, Ll/۫֡ۖ;->parseFrom([BLl/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۡܶ᩻;

    return-object p0
.end method

.method public static parser()Ll/۫֡ۖ;
    .locals 1

    .line 12074
    sget-object v0, Ll/ۡܶ᩻;->PARSER:Ll/۫֡ۖ;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 8275
    :cond_0
    instance-of v1, p1, Ll/ۡܶ᩻;

    if-nez v1, :cond_1

    .line 8276
    invoke-super {p0, p1}, Ll/ۡۜۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 8278
    :cond_1
    check-cast p1, Ll/ۡܶ᩻;

    .line 8280
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasPartitionName()Z

    move-result v1

    invoke-virtual {p1}, Ll/ۡܶ᩻;->hasPartitionName()Z

    move-result v2

    const/4 v3, 0x0

    if-eq v1, v2, :cond_2

    return v3

    .line 8281
    :cond_2
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasPartitionName()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 8282
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getPartitionName()Ljava/lang/String;

    move-result-object v1

    .line 8283
    invoke-virtual {p1}, Ll/ۡܶ᩻;->getPartitionName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v3

    .line 8285
    :cond_3
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasRunPostinstall()Z

    move-result v1

    invoke-virtual {p1}, Ll/ۡܶ᩻;->hasRunPostinstall()Z

    move-result v2

    if-eq v1, v2, :cond_4

    return v3

    .line 8286
    :cond_4
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasRunPostinstall()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 8287
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getRunPostinstall()Z

    move-result v1

    .line 8288
    invoke-virtual {p1}, Ll/ۡܶ᩻;->getRunPostinstall()Z

    move-result v2

    if-eq v1, v2, :cond_5

    return v3

    .line 8290
    :cond_5
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasPostinstallPath()Z

    move-result v1

    invoke-virtual {p1}, Ll/ۡܶ᩻;->hasPostinstallPath()Z

    move-result v2

    if-eq v1, v2, :cond_6

    return v3

    .line 8291
    :cond_6
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasPostinstallPath()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 8292
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getPostinstallPath()Ljava/lang/String;

    move-result-object v1

    .line 8293
    invoke-virtual {p1}, Ll/ۡܶ᩻;->getPostinstallPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v3

    .line 8295
    :cond_7
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasFilesystemType()Z

    move-result v1

    invoke-virtual {p1}, Ll/ۡܶ᩻;->hasFilesystemType()Z

    move-result v2

    if-eq v1, v2, :cond_8

    return v3

    .line 8296
    :cond_8
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasFilesystemType()Z

    move-result v1

    if-eqz v1, :cond_9

    .line 8297
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getFilesystemType()Ljava/lang/String;

    move-result-object v1

    .line 8298
    invoke-virtual {p1}, Ll/ۡܶ᩻;->getFilesystemType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v3

    .line 8300
    :cond_9
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getNewPartitionSignatureList()Ljava/util/List;

    move-result-object v1

    .line 8301
    invoke-virtual {p1}, Ll/ۡܶ᩻;->getNewPartitionSignatureList()Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v3

    .line 8302
    :cond_a
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasOldPartitionInfo()Z

    move-result v1

    invoke-virtual {p1}, Ll/ۡܶ᩻;->hasOldPartitionInfo()Z

    move-result v2

    if-eq v1, v2, :cond_b

    return v3

    .line 8303
    :cond_b
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasOldPartitionInfo()Z

    move-result v1

    if-eqz v1, :cond_c

    .line 8304
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getOldPartitionInfo()Ll/ܳܶ᩻;

    move-result-object v1

    .line 8305
    invoke-virtual {p1}, Ll/ۡܶ᩻;->getOldPartitionInfo()Ll/ܳܶ᩻;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ܳܶ᩻;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v3

    .line 8307
    :cond_c
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasNewPartitionInfo()Z

    move-result v1

    invoke-virtual {p1}, Ll/ۡܶ᩻;->hasNewPartitionInfo()Z

    move-result v2

    if-eq v1, v2, :cond_d

    return v3

    .line 8308
    :cond_d
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasNewPartitionInfo()Z

    move-result v1

    if-eqz v1, :cond_e

    .line 8309
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getNewPartitionInfo()Ll/ܳܶ᩻;

    move-result-object v1

    .line 8310
    invoke-virtual {p1}, Ll/ۡܶ᩻;->getNewPartitionInfo()Ll/ܳܶ᩻;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ܳܶ᩻;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v3

    .line 8312
    :cond_e
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getOperationsList()Ljava/util/List;

    move-result-object v1

    .line 8313
    invoke-virtual {p1}, Ll/ۡܶ᩻;->getOperationsList()Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v3

    .line 8314
    :cond_f
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasPostinstallOptional()Z

    move-result v1

    invoke-virtual {p1}, Ll/ۡܶ᩻;->hasPostinstallOptional()Z

    move-result v2

    if-eq v1, v2, :cond_10

    return v3

    .line 8315
    :cond_10
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasPostinstallOptional()Z

    move-result v1

    if-eqz v1, :cond_11

    .line 8316
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getPostinstallOptional()Z

    move-result v1

    .line 8317
    invoke-virtual {p1}, Ll/ۡܶ᩻;->getPostinstallOptional()Z

    move-result v2

    if-eq v1, v2, :cond_11

    return v3

    .line 8319
    :cond_11
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasHashTreeDataExtent()Z

    move-result v1

    invoke-virtual {p1}, Ll/ۡܶ᩻;->hasHashTreeDataExtent()Z

    move-result v2

    if-eq v1, v2, :cond_12

    return v3

    .line 8320
    :cond_12
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasHashTreeDataExtent()Z

    move-result v1

    if-eqz v1, :cond_13

    .line 8321
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getHashTreeDataExtent()Ll/۫۠᩻;

    move-result-object v1

    .line 8322
    invoke-virtual {p1}, Ll/ۡܶ᩻;->getHashTreeDataExtent()Ll/۫۠᩻;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/۫۠᩻;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v3

    .line 8324
    :cond_13
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasHashTreeExtent()Z

    move-result v1

    invoke-virtual {p1}, Ll/ۡܶ᩻;->hasHashTreeExtent()Z

    move-result v2

    if-eq v1, v2, :cond_14

    return v3

    .line 8325
    :cond_14
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasHashTreeExtent()Z

    move-result v1

    if-eqz v1, :cond_15

    .line 8326
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getHashTreeExtent()Ll/۫۠᩻;

    move-result-object v1

    .line 8327
    invoke-virtual {p1}, Ll/ۡܶ᩻;->getHashTreeExtent()Ll/۫۠᩻;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/۫۠᩻;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v3

    .line 8329
    :cond_15
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasHashTreeAlgorithm()Z

    move-result v1

    invoke-virtual {p1}, Ll/ۡܶ᩻;->hasHashTreeAlgorithm()Z

    move-result v2

    if-eq v1, v2, :cond_16

    return v3

    .line 8330
    :cond_16
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasHashTreeAlgorithm()Z

    move-result v1

    if-eqz v1, :cond_17

    .line 8331
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getHashTreeAlgorithm()Ljava/lang/String;

    move-result-object v1

    .line 8332
    invoke-virtual {p1}, Ll/ۡܶ᩻;->getHashTreeAlgorithm()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v3

    .line 8334
    :cond_17
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasHashTreeSalt()Z

    move-result v1

    invoke-virtual {p1}, Ll/ۡܶ᩻;->hasHashTreeSalt()Z

    move-result v2

    if-eq v1, v2, :cond_18

    return v3

    .line 8335
    :cond_18
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasHashTreeSalt()Z

    move-result v1

    if-eqz v1, :cond_19

    .line 8336
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getHashTreeSalt()Ll/ۛۜۖ;

    move-result-object v1

    .line 8337
    invoke-virtual {p1}, Ll/ۡܶ᩻;->getHashTreeSalt()Ll/ۛۜۖ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۛۜۖ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v3

    .line 8339
    :cond_19
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasFecDataExtent()Z

    move-result v1

    invoke-virtual {p1}, Ll/ۡܶ᩻;->hasFecDataExtent()Z

    move-result v2

    if-eq v1, v2, :cond_1a

    return v3

    .line 8340
    :cond_1a
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasFecDataExtent()Z

    move-result v1

    if-eqz v1, :cond_1b

    .line 8341
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getFecDataExtent()Ll/۫۠᩻;

    move-result-object v1

    .line 8342
    invoke-virtual {p1}, Ll/ۡܶ᩻;->getFecDataExtent()Ll/۫۠᩻;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/۫۠᩻;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    return v3

    .line 8344
    :cond_1b
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasFecExtent()Z

    move-result v1

    invoke-virtual {p1}, Ll/ۡܶ᩻;->hasFecExtent()Z

    move-result v2

    if-eq v1, v2, :cond_1c

    return v3

    .line 8345
    :cond_1c
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasFecExtent()Z

    move-result v1

    if-eqz v1, :cond_1d

    .line 8346
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getFecExtent()Ll/۫۠᩻;

    move-result-object v1

    .line 8347
    invoke-virtual {p1}, Ll/ۡܶ᩻;->getFecExtent()Ll/۫۠᩻;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/۫۠᩻;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    return v3

    .line 8349
    :cond_1d
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasFecRoots()Z

    move-result v1

    invoke-virtual {p1}, Ll/ۡܶ᩻;->hasFecRoots()Z

    move-result v2

    if-eq v1, v2, :cond_1e

    return v3

    .line 8350
    :cond_1e
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasFecRoots()Z

    move-result v1

    if-eqz v1, :cond_1f

    .line 8351
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getFecRoots()I

    move-result v1

    .line 8352
    invoke-virtual {p1}, Ll/ۡܶ᩻;->getFecRoots()I

    move-result v2

    if-eq v1, v2, :cond_1f

    return v3

    .line 8354
    :cond_1f
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasVersion()Z

    move-result v1

    invoke-virtual {p1}, Ll/ۡܶ᩻;->hasVersion()Z

    move-result v2

    if-eq v1, v2, :cond_20

    return v3

    .line 8355
    :cond_20
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasVersion()Z

    move-result v1

    if-eqz v1, :cond_21

    .line 8356
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getVersion()Ljava/lang/String;

    move-result-object v1

    .line 8357
    invoke-virtual {p1}, Ll/ۡܶ᩻;->getVersion()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_21

    return v3

    .line 8359
    :cond_21
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getMergeOperationsList()Ljava/util/List;

    move-result-object v1

    .line 8360
    invoke-virtual {p1}, Ll/ۡܶ᩻;->getMergeOperationsList()Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    return v3

    .line 8361
    :cond_22
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasEstimateCowSize()Z

    move-result v1

    invoke-virtual {p1}, Ll/ۡܶ᩻;->hasEstimateCowSize()Z

    move-result v2

    if-eq v1, v2, :cond_23

    return v3

    .line 8362
    :cond_23
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasEstimateCowSize()Z

    move-result v1

    if-eqz v1, :cond_24

    .line 8363
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getEstimateCowSize()J

    move-result-wide v1

    .line 8364
    invoke-virtual {p1}, Ll/ۡܶ᩻;->getEstimateCowSize()J

    move-result-wide v4

    cmp-long v6, v1, v4

    if-eqz v6, :cond_24

    return v3

    .line 8366
    :cond_24
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasEstimateOpCountMax()Z

    move-result v1

    invoke-virtual {p1}, Ll/ۡܶ᩻;->hasEstimateOpCountMax()Z

    move-result v2

    if-eq v1, v2, :cond_25

    return v3

    .line 8367
    :cond_25
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasEstimateOpCountMax()Z

    move-result v1

    if-eqz v1, :cond_26

    .line 8368
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getEstimateOpCountMax()J

    move-result-wide v1

    .line 8369
    invoke-virtual {p1}, Ll/ۡܶ᩻;->getEstimateOpCountMax()J

    move-result-wide v4

    cmp-long v6, v1, v4

    if-eqz v6, :cond_26

    return v3

    .line 8371
    :cond_26
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/ۢ֨ۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_27

    return v3

    :cond_27
    return v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 7121
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getDefaultInstanceForType()Ll/ۡܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Ll/ۡܶ᩻;
    .locals 1

    .line 12084
    sget-object v0, Ll/ۡܶ᩻;->DEFAULT_INSTANCE:Ll/ۡܶ᩻;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 7121
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getDefaultInstanceForType()Ll/ۡܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public getEstimateCowSize()J
    .locals 2

    .line 8065
    iget-wide v0, p0, Ll/ۡܶ᩻;->estimateCowSize_:J

    return-wide v0
.end method

.method public getEstimateOpCountMax()J
    .locals 2

    .line 8094
    iget-wide v0, p0, Ll/ۡܶ᩻;->estimateOpCountMax_:J

    return-wide v0
.end method

.method public getFecDataExtent()Ll/۫۠᩻;
    .locals 1

    .line 7820
    iget-object v0, p0, Ll/ۡܶ᩻;->fecDataExtent_:Ll/۫۠᩻;

    if-nez v0, :cond_0

    invoke-static {}, Ll/۫۠᩻;->getDefaultInstance()Ll/۫۠᩻;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getFecDataExtentOrBuilder()Ll/ۛ۠᩻;
    .locals 1

    .line 7831
    iget-object v0, p0, Ll/ۡܶ᩻;->fecDataExtent_:Ll/۫۠᩻;

    if-nez v0, :cond_0

    invoke-static {}, Ll/۫۠᩻;->getDefaultInstance()Ll/۫۠᩻;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getFecExtent()Ll/۫۠᩻;
    .locals 1

    .line 7858
    iget-object v0, p0, Ll/ۡܶ᩻;->fecExtent_:Ll/۫۠᩻;

    if-nez v0, :cond_0

    invoke-static {}, Ll/۫۠᩻;->getDefaultInstance()Ll/۫۠᩻;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getFecExtentOrBuilder()Ll/ۛ۠᩻;
    .locals 1

    .line 7869
    iget-object v0, p0, Ll/ۡܶ᩻;->fecExtent_:Ll/۫۠᩻;

    if-nez v0, :cond_0

    invoke-static {}, Ll/۫۠᩻;->getDefaultInstance()Ll/۫۠᩻;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getFecRoots()I
    .locals 1

    .line 7896
    iget v0, p0, Ll/ۡܶ᩻;->fecRoots_:I

    return v0
.end method

.method public getFilesystemType()Ljava/lang/String;
    .locals 2

    .line 7362
    iget-object v0, p0, Ll/ۡܶ᩻;->filesystemType_:Ljava/lang/Object;

    .line 7363
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 7364
    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 7366
    :cond_0
    check-cast v0, Ll/ۛۜۖ;

    .line 7368
    invoke-virtual {v0}, Ll/ۛۜۖ;->ܳ()Ljava/lang/String;

    move-result-object v1

    .line 7369
    invoke-virtual {v0}, Ll/ۛۜۖ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7370
    iput-object v1, p0, Ll/ۡܶ᩻;->filesystemType_:Ljava/lang/Object;

    :cond_1
    return-object v1
.end method

.method public getFilesystemTypeBytes()Ll/ۛۜۖ;
    .locals 2

    .line 7389
    iget-object v0, p0, Ll/ۡܶ᩻;->filesystemType_:Ljava/lang/Object;

    .line 7390
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 7391
    check-cast v0, Ljava/lang/String;

    .line 7392
    invoke-static {v0}, Ll/ۛۜۖ;->֫(Ljava/lang/String;)Ll/ۛۜۖ;

    move-result-object v0

    .line 7394
    iput-object v0, p0, Ll/ۡܶ᩻;->filesystemType_:Ljava/lang/Object;

    return-object v0

    .line 7397
    :cond_0
    check-cast v0, Ll/ۛۜۖ;

    return-object v0
.end method

.method public getHashTreeAlgorithm()Ljava/lang/String;
    .locals 2

    .line 7733
    iget-object v0, p0, Ll/ۡܶ᩻;->hashTreeAlgorithm_:Ljava/lang/Object;

    .line 7734
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 7735
    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 7737
    :cond_0
    check-cast v0, Ll/ۛۜۖ;

    .line 7739
    invoke-virtual {v0}, Ll/ۛۜۖ;->ܳ()Ljava/lang/String;

    move-result-object v1

    .line 7740
    invoke-virtual {v0}, Ll/ۛۜۖ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7741
    iput-object v1, p0, Ll/ۡܶ᩻;->hashTreeAlgorithm_:Ljava/lang/Object;

    :cond_1
    return-object v1
.end method

.method public getHashTreeAlgorithmBytes()Ll/ۛۜۖ;
    .locals 2

    .line 7757
    iget-object v0, p0, Ll/ۡܶ᩻;->hashTreeAlgorithm_:Ljava/lang/Object;

    .line 7758
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 7759
    check-cast v0, Ljava/lang/String;

    .line 7760
    invoke-static {v0}, Ll/ۛۜۖ;->֫(Ljava/lang/String;)Ll/ۛۜۖ;

    move-result-object v0

    .line 7762
    iput-object v0, p0, Ll/ۡܶ᩻;->hashTreeAlgorithm_:Ljava/lang/Object;

    return-object v0

    .line 7765
    :cond_0
    check-cast v0, Ll/ۛۜۖ;

    return-object v0
.end method

.method public getHashTreeDataExtent()Ll/۫۠᩻;
    .locals 1

    .line 7655
    iget-object v0, p0, Ll/ۡܶ᩻;->hashTreeDataExtent_:Ll/۫۠᩻;

    if-nez v0, :cond_0

    invoke-static {}, Ll/۫۠᩻;->getDefaultInstance()Ll/۫۠᩻;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getHashTreeDataExtentOrBuilder()Ll/ۛ۠᩻;
    .locals 1

    .line 7667
    iget-object v0, p0, Ll/ۡܶ᩻;->hashTreeDataExtent_:Ll/۫۠᩻;

    if-nez v0, :cond_0

    invoke-static {}, Ll/۫۠᩻;->getDefaultInstance()Ll/۫۠᩻;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getHashTreeExtent()Ll/۫۠᩻;
    .locals 1

    .line 7694
    iget-object v0, p0, Ll/ۡܶ᩻;->hashTreeExtent_:Ll/۫۠᩻;

    if-nez v0, :cond_0

    invoke-static {}, Ll/۫۠᩻;->getDefaultInstance()Ll/۫۠᩻;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getHashTreeExtentOrBuilder()Ll/ۛ۠᩻;
    .locals 1

    .line 7705
    iget-object v0, p0, Ll/ۡܶ᩻;->hashTreeExtent_:Ll/۫۠᩻;

    if-nez v0, :cond_0

    invoke-static {}, Ll/۫۠᩻;->getDefaultInstance()Ll/۫۠᩻;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getHashTreeSalt()Ll/ۛۜۖ;
    .locals 1

    .line 7793
    iget-object v0, p0, Ll/ۡܶ᩻;->hashTreeSalt_:Ll/ۛۜۖ;

    return-object v0
.end method

.method public getMergeOperations(I)Ll/ۜ۠᩻;
    .locals 1

    .line 8020
    iget-object v0, p0, Ll/ۡܶ᩻;->mergeOperations_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۜ۠᩻;

    return-object p1
.end method

.method public getMergeOperationsCount()I
    .locals 1

    .line 8007
    iget-object v0, p0, Ll/ۡܶ᩻;->mergeOperations_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getMergeOperationsList()Ljava/util/List;
    .locals 1

    .line 7980
    iget-object v0, p0, Ll/ۡܶ᩻;->mergeOperations_:Ljava/util/List;

    return-object v0
.end method

.method public getMergeOperationsOrBuilder(I)Ll/ۢ۠᩻;
    .locals 1

    .line 8034
    iget-object v0, p0, Ll/ۡܶ᩻;->mergeOperations_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۢ۠᩻;

    return-object p1
.end method

.method public getMergeOperationsOrBuilderList()Ljava/util/List;
    .locals 1

    .line 7994
    iget-object v0, p0, Ll/ۡܶ᩻;->mergeOperations_:Ljava/util/List;

    return-object v0
.end method

.method public getNewPartitionInfo()Ll/ܳܶ᩻;
    .locals 1

    .line 7519
    iget-object v0, p0, Ll/ۡܶ᩻;->newPartitionInfo_:Ll/ܳܶ᩻;

    if-nez v0, :cond_0

    invoke-static {}, Ll/ܳܶ᩻;->getDefaultInstance()Ll/ܳܶ᩻;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getNewPartitionInfoOrBuilder()Ll/ۜܶ᩻;
    .locals 1

    .line 7526
    iget-object v0, p0, Ll/ۡܶ᩻;->newPartitionInfo_:Ll/ܳܶ᩻;

    if-nez v0, :cond_0

    invoke-static {}, Ll/ܳܶ᩻;->getDefaultInstance()Ll/ܳܶ᩻;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getNewPartitionSignature(I)Ll/᩵ܶ᩻;
    .locals 1

    .line 7459
    iget-object v0, p0, Ll/ۡܶ᩻;->newPartitionSignature_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩵ܶ᩻;

    return-object p1
.end method

.method public getNewPartitionSignatureCount()I
    .locals 1

    .line 7445
    iget-object v0, p0, Ll/ۡܶ᩻;->newPartitionSignature_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getNewPartitionSignatureList()Ljava/util/List;
    .locals 1

    .line 7416
    iget-object v0, p0, Ll/ۡܶ᩻;->newPartitionSignature_:Ljava/util/List;

    return-object v0
.end method

.method public getNewPartitionSignatureOrBuilder(I)Ll/ۚܶ᩻;
    .locals 1

    .line 7474
    iget-object v0, p0, Ll/ۡܶ᩻;->newPartitionSignature_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚܶ᩻;

    return-object p1
.end method

.method public getNewPartitionSignatureOrBuilderList()Ljava/util/List;
    .locals 1

    .line 7431
    iget-object v0, p0, Ll/ۡܶ᩻;->newPartitionSignature_:Ljava/util/List;

    return-object v0
.end method

.method public getOldPartitionInfo()Ll/ܳܶ᩻;
    .locals 1

    .line 7493
    iget-object v0, p0, Ll/ۡܶ᩻;->oldPartitionInfo_:Ll/ܳܶ᩻;

    if-nez v0, :cond_0

    invoke-static {}, Ll/ܳܶ᩻;->getDefaultInstance()Ll/ܳܶ᩻;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getOldPartitionInfoOrBuilder()Ll/ۜܶ᩻;
    .locals 1

    .line 7500
    iget-object v0, p0, Ll/ۡܶ᩻;->oldPartitionInfo_:Ll/ܳܶ᩻;

    if-nez v0, :cond_0

    invoke-static {}, Ll/ܳܶ᩻;->getDefaultInstance()Ll/ܳܶ᩻;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getOperations(I)Ll/֫ܶ᩻;
    .locals 1

    .line 7583
    iget-object v0, p0, Ll/ۡܶ᩻;->operations_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֫ܶ᩻;

    return-object p1
.end method

.method public getOperationsCount()I
    .locals 1

    .line 7570
    iget-object v0, p0, Ll/ۡܶ᩻;->operations_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getOperationsList()Ljava/util/List;
    .locals 1

    .line 7543
    iget-object v0, p0, Ll/ۡܶ᩻;->operations_:Ljava/util/List;

    return-object v0
.end method

.method public getOperationsOrBuilder(I)Ll/ܽܶ᩻;
    .locals 1

    .line 7597
    iget-object v0, p0, Ll/ۡܶ᩻;->operations_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܽܶ᩻;

    return-object p1
.end method

.method public getOperationsOrBuilderList()Ljava/util/List;
    .locals 1

    .line 7557
    iget-object v0, p0, Ll/ۡܶ᩻;->operations_:Ljava/util/List;

    return-object v0
.end method

.method public getParserForType()Ll/۫֡ۖ;
    .locals 1

    .line 12079
    sget-object v0, Ll/ۡܶ᩻;->PARSER:Ll/۫֡ۖ;

    return-object v0
.end method

.method public getPartitionName()Ljava/lang/String;
    .locals 2

    .line 7193
    iget-object v0, p0, Ll/ۡܶ᩻;->partitionName_:Ljava/lang/Object;

    .line 7194
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 7195
    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 7197
    :cond_0
    check-cast v0, Ll/ۛۜۖ;

    .line 7199
    invoke-virtual {v0}, Ll/ۛۜۖ;->ܳ()Ljava/lang/String;

    move-result-object v1

    .line 7200
    invoke-virtual {v0}, Ll/ۛۜۖ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7201
    iput-object v1, p0, Ll/ۡܶ᩻;->partitionName_:Ljava/lang/Object;

    :cond_1
    return-object v1
.end method

.method public getPartitionNameBytes()Ll/ۛۜۖ;
    .locals 2

    .line 7218
    iget-object v0, p0, Ll/ۡܶ᩻;->partitionName_:Ljava/lang/Object;

    .line 7219
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 7220
    check-cast v0, Ljava/lang/String;

    .line 7221
    invoke-static {v0}, Ll/ۛۜۖ;->֫(Ljava/lang/String;)Ll/ۛۜۖ;

    move-result-object v0

    .line 7223
    iput-object v0, p0, Ll/ۡܶ᩻;->partitionName_:Ljava/lang/Object;

    return-object v0

    .line 7226
    :cond_0
    check-cast v0, Ll/ۛۜۖ;

    return-object v0
.end method

.method public getPostinstallOptional()Z
    .locals 1

    .line 7626
    iget-boolean v0, p0, Ll/ۡܶ᩻;->postinstallOptional_:Z

    return v0
.end method

.method public getPostinstallPath()Ljava/lang/String;
    .locals 2

    .line 7292
    iget-object v0, p0, Ll/ۡܶ᩻;->postinstallPath_:Ljava/lang/Object;

    .line 7293
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 7294
    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 7296
    :cond_0
    check-cast v0, Ll/ۛۜۖ;

    .line 7298
    invoke-virtual {v0}, Ll/ۛۜۖ;->ܳ()Ljava/lang/String;

    move-result-object v1

    .line 7299
    invoke-virtual {v0}, Ll/ۛۜۖ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7300
    iput-object v1, p0, Ll/ۡܶ᩻;->postinstallPath_:Ljava/lang/Object;

    :cond_1
    return-object v1
.end method

.method public getPostinstallPathBytes()Ll/ۛۜۖ;
    .locals 2

    .line 7319
    iget-object v0, p0, Ll/ۡܶ᩻;->postinstallPath_:Ljava/lang/Object;

    .line 7320
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 7321
    check-cast v0, Ljava/lang/String;

    .line 7322
    invoke-static {v0}, Ll/ۛۜۖ;->֫(Ljava/lang/String;)Ll/ۛۜۖ;

    move-result-object v0

    .line 7324
    iput-object v0, p0, Ll/ۡܶ᩻;->postinstallPath_:Ljava/lang/Object;

    return-object v0

    .line 7327
    :cond_0
    check-cast v0, Ll/ۛۜۖ;

    return-object v0
.end method

.method public getRunPostinstall()Z
    .locals 1

    .line 7258
    iget-boolean v0, p0, Ll/ۡܶ᩻;->runPostinstall_:Z

    return v0
.end method

.method public getSerializedSize()I
    .locals 6

    .line 8186
    iget v0, p0, Ll/ۡۜۖ;->memoizedSize:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    .line 8190
    :cond_0
    iget v0, p0, Ll/ۡܶ᩻;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 8191
    iget-object v0, p0, Ll/ۡܶ᩻;->partitionName_:Ljava/lang/Object;

    invoke-static {v1, v0}, Ll/ۘᩴۖ;->֫(ILjava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 8193
    :goto_0
    iget v1, p0, Ll/ۡܶ᩻;->bitField0_:I

    const/4 v3, 0x2

    and-int/2addr v1, v3

    if-eqz v1, :cond_2

    .line 8195
    invoke-static {v3}, Ll/ܳ᩷ۖ;->ᩳ(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 8197
    :cond_2
    iget v1, p0, Ll/ۡܶ᩻;->bitField0_:I

    const/4 v3, 0x4

    and-int/2addr v1, v3

    if-eqz v1, :cond_3

    const/4 v1, 0x3

    .line 8198
    iget-object v4, p0, Ll/ۡܶ᩻;->postinstallPath_:Ljava/lang/Object;

    invoke-static {v1, v4}, Ll/ۘᩴۖ;->֫(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 8200
    :cond_3
    iget v1, p0, Ll/ۡܶ᩻;->bitField0_:I

    const/16 v4, 0x8

    and-int/2addr v1, v4

    if-eqz v1, :cond_4

    .line 8201
    iget-object v1, p0, Ll/ۡܶ᩻;->filesystemType_:Ljava/lang/Object;

    invoke-static {v3, v1}, Ll/ۘᩴۖ;->֫(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    const/4 v1, 0x0

    .line 8203
    :goto_1
    iget-object v3, p0, Ll/ۡܶ᩻;->newPartitionSignature_:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_5

    .line 8204
    iget-object v3, p0, Ll/ۡܶ᩻;->newPartitionSignature_:Ljava/util/List;

    .line 8205
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۡ֡ۖ;

    const/4 v5, 0x5

    invoke-static {v5, v3}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v3

    add-int/2addr v0, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 8207
    :cond_5
    iget v1, p0, Ll/ۡܶ᩻;->bitField0_:I

    const/16 v3, 0x10

    and-int/2addr v1, v3

    if-eqz v1, :cond_6

    const/4 v1, 0x6

    .line 8209
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getOldPartitionInfo()Ll/ܳܶ᩻;

    move-result-object v5

    invoke-static {v1, v5}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v1

    add-int/2addr v0, v1

    .line 8211
    :cond_6
    iget v1, p0, Ll/ۡܶ᩻;->bitField0_:I

    and-int/lit8 v1, v1, 0x20

    if-eqz v1, :cond_7

    const/4 v1, 0x7

    .line 8213
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getNewPartitionInfo()Ll/ܳܶ᩻;

    move-result-object v5

    invoke-static {v1, v5}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_7
    const/4 v1, 0x0

    .line 8215
    :goto_2
    iget-object v5, p0, Ll/ۡܶ᩻;->operations_:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-ge v1, v5, :cond_8

    .line 8216
    iget-object v5, p0, Ll/ۡܶ᩻;->operations_:Ljava/util/List;

    .line 8217
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۡ֡ۖ;

    invoke-static {v4, v5}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v5

    add-int/2addr v0, v5

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 8219
    :cond_8
    iget v1, p0, Ll/ۡܶ᩻;->bitField0_:I

    and-int/lit8 v1, v1, 0x40

    if-eqz v1, :cond_9

    const/16 v1, 0x9

    .line 8221
    invoke-static {v1}, Ll/ܳ᩷ۖ;->ᩳ(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 8223
    :cond_9
    iget v1, p0, Ll/ۡܶ᩻;->bitField0_:I

    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_a

    const/16 v1, 0xa

    .line 8225
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getHashTreeDataExtent()Ll/۫۠᩻;

    move-result-object v4

    invoke-static {v1, v4}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v1

    add-int/2addr v0, v1

    .line 8227
    :cond_a
    iget v1, p0, Ll/ۡܶ᩻;->bitField0_:I

    and-int/lit16 v1, v1, 0x100

    if-eqz v1, :cond_b

    const/16 v1, 0xb

    .line 8229
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getHashTreeExtent()Ll/۫۠᩻;

    move-result-object v4

    invoke-static {v1, v4}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v1

    add-int/2addr v0, v1

    .line 8231
    :cond_b
    iget v1, p0, Ll/ۡܶ᩻;->bitField0_:I

    and-int/lit16 v1, v1, 0x200

    if-eqz v1, :cond_c

    const/16 v1, 0xc

    .line 8232
    iget-object v4, p0, Ll/ۡܶ᩻;->hashTreeAlgorithm_:Ljava/lang/Object;

    invoke-static {v1, v4}, Ll/ۘᩴۖ;->֫(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 8234
    :cond_c
    iget v1, p0, Ll/ۡܶ᩻;->bitField0_:I

    and-int/lit16 v1, v1, 0x400

    if-eqz v1, :cond_d

    const/16 v1, 0xd

    .line 8235
    iget-object v4, p0, Ll/ۡܶ᩻;->hashTreeSalt_:Ll/ۛۜۖ;

    .line 8236
    invoke-static {v1, v4}, Ll/ܳ᩷ۖ;->ܽ(ILl/ۛۜۖ;)I

    move-result v1

    add-int/2addr v0, v1

    .line 8238
    :cond_d
    iget v1, p0, Ll/ۡܶ᩻;->bitField0_:I

    and-int/lit16 v1, v1, 0x800

    if-eqz v1, :cond_e

    const/16 v1, 0xe

    .line 8240
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getFecDataExtent()Ll/۫۠᩻;

    move-result-object v4

    invoke-static {v1, v4}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v1

    add-int/2addr v0, v1

    .line 8242
    :cond_e
    iget v1, p0, Ll/ۡܶ᩻;->bitField0_:I

    and-int/lit16 v1, v1, 0x1000

    if-eqz v1, :cond_f

    const/16 v1, 0xf

    .line 8244
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getFecExtent()Ll/۫۠᩻;

    move-result-object v4

    invoke-static {v1, v4}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v1

    add-int/2addr v0, v1

    .line 8246
    :cond_f
    iget v1, p0, Ll/ۡܶ᩻;->bitField0_:I

    and-int/lit16 v1, v1, 0x2000

    if-eqz v1, :cond_10

    .line 8247
    iget v1, p0, Ll/ۡܶ᩻;->fecRoots_:I

    .line 8248
    invoke-static {v3, v1}, Ll/ܳ᩷ۖ;->᩻(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 8250
    :cond_10
    iget v1, p0, Ll/ۡܶ᩻;->bitField0_:I

    and-int/lit16 v1, v1, 0x4000

    if-eqz v1, :cond_11

    const/16 v1, 0x11

    .line 8251
    iget-object v3, p0, Ll/ۡܶ᩻;->version_:Ljava/lang/Object;

    invoke-static {v1, v3}, Ll/ۘᩴۖ;->֫(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 8253
    :cond_11
    :goto_3
    iget-object v1, p0, Ll/ۡܶ᩻;->mergeOperations_:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v2, v1, :cond_12

    .line 8254
    iget-object v1, p0, Ll/ۡܶ᩻;->mergeOperations_:Ljava/util/List;

    .line 8255
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡ֡ۖ;

    const/16 v3, 0x12

    invoke-static {v3, v1}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 8257
    :cond_12
    iget v1, p0, Ll/ۡܶ᩻;->bitField0_:I

    const v2, 0x8000

    and-int/2addr v1, v2

    if-eqz v1, :cond_13

    const/16 v1, 0x13

    .line 8258
    iget-wide v2, p0, Ll/ۡܶ᩻;->estimateCowSize_:J

    .line 8259
    invoke-static {v1, v2, v3}, Ll/ܳ᩷ۖ;->ᩳ(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 8261
    :cond_13
    iget v1, p0, Ll/ۡܶ᩻;->bitField0_:I

    const/high16 v2, 0x10000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    const/16 v1, 0x14

    .line 8262
    iget-wide v2, p0, Ll/ۡܶ᩻;->estimateOpCountMax_:J

    .line 8263
    invoke-static {v1, v2, v3}, Ll/ܳ᩷ۖ;->ᩳ(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 8265
    :cond_14
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->getSerializedSize()I

    move-result v1

    add-int/2addr v1, v0

    .line 8266
    iput v1, p0, Ll/ۡۜۖ;->memoizedSize:I

    return v1
.end method

.method public getVersion()Ljava/lang/String;
    .locals 2

    .line 7928
    iget-object v0, p0, Ll/ۡܶ᩻;->version_:Ljava/lang/Object;

    .line 7929
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 7930
    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 7932
    :cond_0
    check-cast v0, Ll/ۛۜۖ;

    .line 7934
    invoke-virtual {v0}, Ll/ۛۜۖ;->ܳ()Ljava/lang/String;

    move-result-object v1

    .line 7935
    invoke-virtual {v0}, Ll/ۛۜۖ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7936
    iput-object v1, p0, Ll/ۡܶ᩻;->version_:Ljava/lang/Object;

    :cond_1
    return-object v1
.end method

.method public getVersionBytes()Ll/ۛۜۖ;
    .locals 2

    .line 7954
    iget-object v0, p0, Ll/ۡܶ᩻;->version_:Ljava/lang/Object;

    .line 7955
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 7956
    check-cast v0, Ljava/lang/String;

    .line 7957
    invoke-static {v0}, Ll/ۛۜۖ;->֫(Ljava/lang/String;)Ll/ۛۜۖ;

    move-result-object v0

    .line 7959
    iput-object v0, p0, Ll/ۡܶ᩻;->version_:Ljava/lang/Object;

    return-object v0

    .line 7962
    :cond_0
    check-cast v0, Ll/ۛۜۖ;

    return-object v0
.end method

.method public hasEstimateCowSize()Z
    .locals 2

    .line 8051
    iget v0, p0, Ll/ۡܶ᩻;->bitField0_:I

    const v1, 0x8000

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

    .line 8081
    iget v0, p0, Ll/ۡܶ᩻;->bitField0_:I

    const/high16 v1, 0x10000

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

    .line 7808
    iget v0, p0, Ll/ۡܶ᩻;->bitField0_:I

    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasFecExtent()Z
    .locals 1

    .line 7846
    iget v0, p0, Ll/ۡܶ᩻;->bitField0_:I

    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasFecRoots()Z
    .locals 1

    .line 7884
    iget v0, p0, Ll/ۡܶ᩻;->bitField0_:I

    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasFilesystemType()Z
    .locals 1

    .line 7347
    iget v0, p0, Ll/ۡܶ᩻;->bitField0_:I

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

    .line 7721
    iget v0, p0, Ll/ۡܶ᩻;->bitField0_:I

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasHashTreeDataExtent()Z
    .locals 1

    .line 7642
    iget v0, p0, Ll/ۡܶ᩻;->bitField0_:I

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasHashTreeExtent()Z
    .locals 1

    .line 7682
    iget v0, p0, Ll/ۡܶ᩻;->bitField0_:I

    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasHashTreeSalt()Z
    .locals 1

    .line 7781
    iget v0, p0, Ll/ۡܶ᩻;->bitField0_:I

    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasNewPartitionInfo()Z
    .locals 1

    .line 7511
    iget v0, p0, Ll/ۡܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasOldPartitionInfo()Z
    .locals 1

    .line 7485
    iget v0, p0, Ll/ۡܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasPartitionName()Z
    .locals 2

    .line 7180
    iget v0, p0, Ll/ۡܶ᩻;->bitField0_:I

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

    .line 7613
    iget v0, p0, Ll/ۡܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasPostinstallPath()Z
    .locals 1

    .line 7277
    iget v0, p0, Ll/ۡܶ᩻;->bitField0_:I

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

    .line 7244
    iget v0, p0, Ll/ۡܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasVersion()Z
    .locals 1

    .line 7914
    iget v0, p0, Ll/ۡܶ᩻;->bitField0_:I

    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 6

    .line 8377
    iget v0, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    if-eqz v0, :cond_0

    return v0

    .line 8381
    :cond_0
    invoke-static {}, Ll/ۡܶ᩻;->getDescriptor()Ll/ᩳۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x30b

    .line 8382
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasPartitionName()Z

    move-result v1

    const/16 v2, 0x35

    const/16 v3, 0x25

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    .line 8383
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 8384
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getPartitionName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 8386
    :cond_1
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasRunPostinstall()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    .line 8387
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 8389
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getRunPostinstall()Z

    move-result v1

    .line 8388
    invoke-static {v1}, Ll/ܰᩴۖ;->֫(Z)I

    move-result v1

    add-int/2addr v0, v1

    .line 8391
    :cond_2
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasPostinstallPath()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x3

    .line 8392
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 8393
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getPostinstallPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 8395
    :cond_3
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasFilesystemType()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x4

    .line 8396
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 8397
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getFilesystemType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 8399
    :cond_4
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getNewPartitionSignatureCount()I

    move-result v1

    if-lez v1, :cond_5

    const/4 v1, 0x5

    .line 8400
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 8401
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getNewPartitionSignatureList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 8403
    :cond_5
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasOldPartitionInfo()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, 0x6

    .line 8404
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 8405
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getOldPartitionInfo()Ll/ܳܶ᩻;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܳܶ᩻;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 8407
    :cond_6
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasNewPartitionInfo()Z

    move-result v1

    if-eqz v1, :cond_7

    const/4 v1, 0x7

    .line 8408
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 8409
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getNewPartitionInfo()Ll/ܳܶ᩻;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܳܶ᩻;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 8411
    :cond_7
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getOperationsCount()I

    move-result v1

    if-lez v1, :cond_8

    const/16 v1, 0x8

    .line 8412
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 8413
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getOperationsList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 8415
    :cond_8
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasPostinstallOptional()Z

    move-result v1

    if-eqz v1, :cond_9

    const/16 v1, 0x9

    .line 8416
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 8418
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getPostinstallOptional()Z

    move-result v1

    .line 8417
    invoke-static {v1}, Ll/ܰᩴۖ;->֫(Z)I

    move-result v1

    add-int/2addr v0, v1

    .line 8420
    :cond_9
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasHashTreeDataExtent()Z

    move-result v1

    if-eqz v1, :cond_a

    const/16 v1, 0xa

    .line 8421
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 8422
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getHashTreeDataExtent()Ll/۫۠᩻;

    move-result-object v1

    invoke-virtual {v1}, Ll/۫۠᩻;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 8424
    :cond_a
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasHashTreeExtent()Z

    move-result v1

    if-eqz v1, :cond_b

    const/16 v1, 0xb

    .line 8425
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 8426
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getHashTreeExtent()Ll/۫۠᩻;

    move-result-object v1

    invoke-virtual {v1}, Ll/۫۠᩻;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 8428
    :cond_b
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasHashTreeAlgorithm()Z

    move-result v1

    if-eqz v1, :cond_c

    const/16 v1, 0xc

    .line 8429
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 8430
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getHashTreeAlgorithm()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 8432
    :cond_c
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasHashTreeSalt()Z

    move-result v1

    if-eqz v1, :cond_d

    const/16 v1, 0xd

    .line 8433
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 8434
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getHashTreeSalt()Ll/ۛۜۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۛۜۖ;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 8436
    :cond_d
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasFecDataExtent()Z

    move-result v1

    if-eqz v1, :cond_e

    const/16 v1, 0xe

    .line 8437
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 8438
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getFecDataExtent()Ll/۫۠᩻;

    move-result-object v1

    invoke-virtual {v1}, Ll/۫۠᩻;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 8440
    :cond_e
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasFecExtent()Z

    move-result v1

    if-eqz v1, :cond_f

    const/16 v1, 0xf

    .line 8441
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 8442
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getFecExtent()Ll/۫۠᩻;

    move-result-object v1

    invoke-virtual {v1}, Ll/۫۠᩻;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 8444
    :cond_f
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasFecRoots()Z

    move-result v1

    if-eqz v1, :cond_10

    const/16 v1, 0x10

    .line 8445
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 8446
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getFecRoots()I

    move-result v1

    add-int/2addr v0, v1

    .line 8448
    :cond_10
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasVersion()Z

    move-result v1

    if-eqz v1, :cond_11

    const/16 v1, 0x11

    .line 8449
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 8450
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 8452
    :cond_11
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getMergeOperationsCount()I

    move-result v1

    if-lez v1, :cond_12

    const/16 v1, 0x12

    .line 8453
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 8454
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getMergeOperationsList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 8456
    :cond_12
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasEstimateCowSize()Z

    move-result v1

    if-eqz v1, :cond_13

    const/16 v1, 0x13

    .line 8457
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 8459
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getEstimateCowSize()J

    move-result-wide v4

    .line 8458
    invoke-static {v4, v5}, Ll/ܰᩴۖ;->֫(J)I

    move-result v1

    add-int/2addr v0, v1

    .line 8461
    :cond_13
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasEstimateOpCountMax()Z

    move-result v1

    if-eqz v1, :cond_14

    const/16 v1, 0x14

    .line 8462
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 8464
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getEstimateOpCountMax()J

    move-result-wide v1

    .line 8463
    invoke-static {v1, v2}, Ll/ܰᩴۖ;->֫(J)I

    move-result v1

    add-int/2addr v0, v1

    :cond_14
    mul-int/lit8 v0, v0, 0x1d

    .line 8466
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    .line 8467
    iput v1, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    return v1
.end method

.method public internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 7160
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_PartitionUpdate_fieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/ۡܶ᩻;

    const-class v2, Ll/ۢܶ᩻;

    .line 7161
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 4

    .line 8100
    iget-byte v0, p0, Ll/ۡܶ᩻;->memoizedIsInitialized:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    .line 8104
    :cond_1
    invoke-virtual {p0}, Ll/ۡܶ᩻;->hasPartitionName()Z

    move-result v0

    if-nez v0, :cond_2

    .line 8105
    iput-byte v2, p0, Ll/ۡܶ᩻;->memoizedIsInitialized:B

    return v2

    :cond_2
    const/4 v0, 0x0

    .line 8108
    :goto_0
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getOperationsCount()I

    move-result v3

    if-ge v0, v3, :cond_4

    .line 8109
    invoke-virtual {p0, v0}, Ll/ۡܶ᩻;->getOperations(I)Ll/֫ܶ᩻;

    move-result-object v3

    invoke-virtual {v3}, Ll/֫ܶ᩻;->isInitialized()Z

    move-result v3

    if-nez v3, :cond_3

    .line 8110
    iput-byte v2, p0, Ll/ۡܶ᩻;->memoizedIsInitialized:B

    return v2

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 8114
    :cond_4
    iput-byte v1, p0, Ll/ۡܶ᩻;->memoizedIsInitialized:B

    return v1
.end method

.method public bridge synthetic newBuilderForType()Ll/ۢ֡ۖ;
    .locals 1

    .line 7121
    invoke-virtual {p0}, Ll/ۡܶ᩻;->newBuilderForType()Ll/ۢܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Ll/ۢܶ᩻;
    .locals 1

    .line 8544
    invoke-static {}, Ll/ۡܶ᩻;->newBuilder()Ll/ۢܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType(Ll/ۢۜۖ;)Ll/ۢܶ᩻;
    .locals 2

    .line 8560
    new-instance v0, Ll/ۢܶ᩻;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/ۢܶ᩻;-><init>(Ll/ۢۜۖ;I)V

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Ll/ܳ֡ۖ;
    .locals 1

    .line 7121
    invoke-virtual {p0}, Ll/ۡܶ᩻;->newBuilderForType()Ll/ۢܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Ll/ۢۜۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 7121
    invoke-virtual {p0, p1}, Ll/ۡܶ᩻;->newBuilderForType(Ll/ۢۜۖ;)Ll/ۢܶ᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic toBuilder()Ll/ۢ֡ۖ;
    .locals 1

    .line 7121
    invoke-virtual {p0}, Ll/ۡܶ᩻;->toBuilder()Ll/ۢܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Ll/ۢܶ᩻;
    .locals 2

    .line 8553
    sget-object v0, Ll/ۡܶ᩻;->DEFAULT_INSTANCE:Ll/ۡܶ᩻;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    .line 8554
    new-instance v0, Ll/ۢܶ᩻;

    invoke-direct {v0, v1}, Ll/ۢܶ᩻;-><init>(I)V

    return-object v0

    :cond_0
    new-instance v0, Ll/ۢܶ᩻;

    invoke-direct {v0, v1}, Ll/ۢܶ᩻;-><init>(I)V

    invoke-virtual {v0, p0}, Ll/ۢܶ᩻;->mergeFrom(Ll/ۡܶ᩻;)Ll/ۢܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Ll/ܳ֡ۖ;
    .locals 1

    .line 7121
    invoke-virtual {p0}, Ll/ۡܶ᩻;->toBuilder()Ll/ۢܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Ll/ܳ᩷ۖ;)V
    .locals 5

    .line 8121
    iget v0, p0, Ll/ۡܶ᩻;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    .line 8122
    iget-object v0, p0, Ll/ۡܶ᩻;->partitionName_:Ljava/lang/Object;

    invoke-static {p1, v1, v0}, Ll/ۘᩴۖ;->֫(Ll/ܳ᩷ۖ;ILjava/lang/Object;)V

    .line 8124
    :cond_0
    iget v0, p0, Ll/ۡܶ᩻;->bitField0_:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    .line 8125
    iget-boolean v0, p0, Ll/ۡܶ᩻;->runPostinstall_:Z

    invoke-virtual {p1, v1, v0}, Ll/ܳ᩷ۖ;->֫(IZ)V

    .line 8127
    :cond_1
    iget v0, p0, Ll/ۡܶ᩻;->bitField0_:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-eqz v0, :cond_2

    const/4 v0, 0x3

    .line 8128
    iget-object v2, p0, Ll/ۡܶ᩻;->postinstallPath_:Ljava/lang/Object;

    invoke-static {p1, v0, v2}, Ll/ۘᩴۖ;->֫(Ll/ܳ᩷ۖ;ILjava/lang/Object;)V

    .line 8130
    :cond_2
    iget v0, p0, Ll/ۡܶ᩻;->bitField0_:I

    const/16 v2, 0x8

    and-int/2addr v0, v2

    if-eqz v0, :cond_3

    .line 8131
    iget-object v0, p0, Ll/ۡܶ᩻;->filesystemType_:Ljava/lang/Object;

    invoke-static {p1, v1, v0}, Ll/ۘᩴۖ;->֫(Ll/ܳ᩷ۖ;ILjava/lang/Object;)V

    :cond_3
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 8133
    :goto_0
    iget-object v3, p0, Ll/ۡܶ᩻;->newPartitionSignature_:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_4

    .line 8134
    iget-object v3, p0, Ll/ۡܶ᩻;->newPartitionSignature_:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۡ֡ۖ;

    const/4 v4, 0x5

    invoke-virtual {p1, v4, v3}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 8136
    :cond_4
    iget v1, p0, Ll/ۡܶ᩻;->bitField0_:I

    const/16 v3, 0x10

    and-int/2addr v1, v3

    if-eqz v1, :cond_5

    const/4 v1, 0x6

    .line 8137
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getOldPartitionInfo()Ll/ܳܶ᩻;

    move-result-object v4

    invoke-virtual {p1, v1, v4}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    .line 8139
    :cond_5
    iget v1, p0, Ll/ۡܶ᩻;->bitField0_:I

    and-int/lit8 v1, v1, 0x20

    if-eqz v1, :cond_6

    const/4 v1, 0x7

    .line 8140
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getNewPartitionInfo()Ll/ܳܶ᩻;

    move-result-object v4

    invoke-virtual {p1, v1, v4}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    :cond_6
    const/4 v1, 0x0

    .line 8142
    :goto_1
    iget-object v4, p0, Ll/ۡܶ᩻;->operations_:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v1, v4, :cond_7

    .line 8143
    iget-object v4, p0, Ll/ۡܶ᩻;->operations_:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۡ֡ۖ;

    invoke-virtual {p1, v2, v4}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 8145
    :cond_7
    iget v1, p0, Ll/ۡܶ᩻;->bitField0_:I

    and-int/lit8 v1, v1, 0x40

    if-eqz v1, :cond_8

    const/16 v1, 0x9

    .line 8146
    iget-boolean v2, p0, Ll/ۡܶ᩻;->postinstallOptional_:Z

    invoke-virtual {p1, v1, v2}, Ll/ܳ᩷ۖ;->֫(IZ)V

    .line 8148
    :cond_8
    iget v1, p0, Ll/ۡܶ᩻;->bitField0_:I

    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_9

    const/16 v1, 0xa

    .line 8149
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getHashTreeDataExtent()Ll/۫۠᩻;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    .line 8151
    :cond_9
    iget v1, p0, Ll/ۡܶ᩻;->bitField0_:I

    and-int/lit16 v1, v1, 0x100

    if-eqz v1, :cond_a

    const/16 v1, 0xb

    .line 8152
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getHashTreeExtent()Ll/۫۠᩻;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    .line 8154
    :cond_a
    iget v1, p0, Ll/ۡܶ᩻;->bitField0_:I

    and-int/lit16 v1, v1, 0x200

    if-eqz v1, :cond_b

    const/16 v1, 0xc

    .line 8155
    iget-object v2, p0, Ll/ۡܶ᩻;->hashTreeAlgorithm_:Ljava/lang/Object;

    invoke-static {p1, v1, v2}, Ll/ۘᩴۖ;->֫(Ll/ܳ᩷ۖ;ILjava/lang/Object;)V

    .line 8157
    :cond_b
    iget v1, p0, Ll/ۡܶ᩻;->bitField0_:I

    and-int/lit16 v1, v1, 0x400

    if-eqz v1, :cond_c

    const/16 v1, 0xd

    .line 8158
    iget-object v2, p0, Ll/ۡܶ᩻;->hashTreeSalt_:Ll/ۛۜۖ;

    invoke-virtual {p1, v1, v2}, Ll/ܳ᩷ۖ;->֫(ILl/ۛۜۖ;)V

    .line 8160
    :cond_c
    iget v1, p0, Ll/ۡܶ᩻;->bitField0_:I

    and-int/lit16 v1, v1, 0x800

    if-eqz v1, :cond_d

    const/16 v1, 0xe

    .line 8161
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getFecDataExtent()Ll/۫۠᩻;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    .line 8163
    :cond_d
    iget v1, p0, Ll/ۡܶ᩻;->bitField0_:I

    and-int/lit16 v1, v1, 0x1000

    if-eqz v1, :cond_e

    const/16 v1, 0xf

    .line 8164
    invoke-virtual {p0}, Ll/ۡܶ᩻;->getFecExtent()Ll/۫۠᩻;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    .line 8166
    :cond_e
    iget v1, p0, Ll/ۡܶ᩻;->bitField0_:I

    and-int/lit16 v1, v1, 0x2000

    if-eqz v1, :cond_f

    .line 8167
    iget v1, p0, Ll/ۡܶ᩻;->fecRoots_:I

    invoke-virtual {p1, v3, v1}, Ll/ܳ᩷ۖ;->ᩳ(II)V

    .line 8169
    :cond_f
    iget v1, p0, Ll/ۡܶ᩻;->bitField0_:I

    and-int/lit16 v1, v1, 0x4000

    if-eqz v1, :cond_10

    const/16 v1, 0x11

    .line 8170
    iget-object v2, p0, Ll/ۡܶ᩻;->version_:Ljava/lang/Object;

    invoke-static {p1, v1, v2}, Ll/ۘᩴۖ;->֫(Ll/ܳ᩷ۖ;ILjava/lang/Object;)V

    .line 8172
    :cond_10
    :goto_2
    iget-object v1, p0, Ll/ۡܶ᩻;->mergeOperations_:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_11

    .line 8173
    iget-object v1, p0, Ll/ۡܶ᩻;->mergeOperations_:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡ֡ۖ;

    const/16 v2, 0x12

    invoke-virtual {p1, v2, v1}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 8175
    :cond_11
    iget v0, p0, Ll/ۡܶ᩻;->bitField0_:I

    const v1, 0x8000

    and-int/2addr v0, v1

    if-eqz v0, :cond_12

    const/16 v0, 0x13

    .line 8176
    iget-wide v1, p0, Ll/ۡܶ᩻;->estimateCowSize_:J

    invoke-virtual {p1, v0, v1, v2}, Ll/ܳ᩷ۖ;->ۧ(IJ)V

    .line 8178
    :cond_12
    iget v0, p0, Ll/ۡܶ᩻;->bitField0_:I

    const/high16 v1, 0x10000

    and-int/2addr v0, v1

    if-eqz v0, :cond_13

    const/16 v0, 0x14

    .line 8179
    iget-wide v1, p0, Ll/ۡܶ᩻;->estimateOpCountMax_:J

    invoke-virtual {p1, v0, v1, v2}, Ll/ܳ᩷ۖ;->ۧ(IJ)V

    .line 8181
    :cond_13
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۢ֨ۖ;->writeTo(Ll/ܳ᩷ۖ;)V

    return-void
.end method
