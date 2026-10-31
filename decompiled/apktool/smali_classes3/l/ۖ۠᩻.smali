.class public final Ll/ۖ۠᩻;
.super Ll/ۘᩴۖ;
.source "C9PC"

# interfaces
.implements Ll/ᩴ۠᩻;


# static fields
.field public static final APEX_INFO_FIELD_NUMBER:I = 0x11

.field public static final BLOCK_SIZE_FIELD_NUMBER:I = 0x3

.field public static final DEFAULT_INSTANCE:Ll/ۖ۠᩻;

.field public static final DYNAMIC_PARTITION_METADATA_FIELD_NUMBER:I = 0xf

.field public static final MAX_TIMESTAMP_FIELD_NUMBER:I = 0xe

.field public static final MINOR_VERSION_FIELD_NUMBER:I = 0xc

.field public static final PARSER:Ll/۫֡ۖ;

.field public static final PARTIAL_UPDATE_FIELD_NUMBER:I = 0x10

.field public static final PARTITIONS_FIELD_NUMBER:I = 0xd

.field public static final SECURITY_PATCH_LEVEL_FIELD_NUMBER:I = 0x12

.field public static final SIGNATURES_OFFSET_FIELD_NUMBER:I = 0x4

.field public static final SIGNATURES_SIZE_FIELD_NUMBER:I = 0x5

.field public static final serialVersionUID:J


# instance fields
.field public apexInfo_:Ljava/util/List;

.field public bitField0_:I

.field public blockSize_:I

.field public dynamicPartitionMetadata_:Ll/᩹۠᩻;

.field public maxTimestamp_:J

.field public memoizedIsInitialized:B

.field public minorVersion_:I

.field public partialUpdate_:Z

.field public partitions_:Ljava/util/List;

.field public volatile securityPatchLevel_:Ljava/lang/Object;

.field public signaturesOffset_:J

.field public signaturesSize_:J


# direct methods
.method public static bridge synthetic -$$Nest$fgetapexInfo_(Ll/ۖ۠᩻;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۖ۠᩻;->apexInfo_:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic -$$Nest$fgetbitField0_(Ll/ۖ۠᩻;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۖ۠᩻;->bitField0_:I

    return p0
.end method

.method public static bridge synthetic -$$Nest$fgetpartitions_(Ll/ۖ۠᩻;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۖ۠᩻;->partitions_:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic -$$Nest$fgetsecurityPatchLevel_(Ll/ۖ۠᩻;)Ljava/lang/Object;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۖ۠᩻;->securityPatchLevel_:Ljava/lang/Object;

    return-object p0
.end method

.method public static bridge synthetic -$$Nest$fputapexInfo_(Ll/ۖ۠᩻;Ljava/util/List;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۖ۠᩻;->apexInfo_:Ljava/util/List;

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputbitField0_(Ll/ۖ۠᩻;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۖ۠᩻;->bitField0_:I

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputblockSize_(Ll/ۖ۠᩻;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۖ۠᩻;->blockSize_:I

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputdynamicPartitionMetadata_(Ll/ۖ۠᩻;Ll/᩹۠᩻;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۖ۠᩻;->dynamicPartitionMetadata_:Ll/᩹۠᩻;

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputmaxTimestamp_(Ll/ۖ۠᩻;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/ۖ۠᩻;->maxTimestamp_:J

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputminorVersion_(Ll/ۖ۠᩻;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۖ۠᩻;->minorVersion_:I

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputpartialUpdate_(Ll/ۖ۠᩻;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/ۖ۠᩻;->partialUpdate_:Z

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputpartitions_(Ll/ۖ۠᩻;Ljava/util/List;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۖ۠᩻;->partitions_:Ljava/util/List;

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputsecurityPatchLevel_(Ll/ۖ۠᩻;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۖ۠᩻;->securityPatchLevel_:Ljava/lang/Object;

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputsignaturesOffset_(Ll/ۖ۠᩻;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/ۖ۠᩻;->signaturesOffset_:J

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputsignaturesSize_(Ll/ۖ۠᩻;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/ۖ۠᩻;->signaturesSize_:J

    return-void
.end method

.method public static constructor <clinit>()V
    .locals 2

    .line 17702
    sget-object v0, Ll/ۜۚۖ;->᩶:Ll/ۜۚۖ;

    const-class v1, Ll/ۖ۠᩻;

    .line 17708
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    .line 17702
    invoke-static {v0, v1}, Ll/᩷ۚۖ;->֫(Ll/ۜۚۖ;Ljava/lang/String;)V

    .line 20191
    new-instance v0, Ll/ۖ۠᩻;

    invoke-direct {v0}, Ll/ۖ۠᩻;-><init>()V

    sput-object v0, Ll/ۖ۠᩻;->DEFAULT_INSTANCE:Ll/ۖ۠᩻;

    .line 20199
    new-instance v0, Ll/ۡ۠᩻;

    invoke-direct {v0}, Ll/ۡ۠᩻;-><init>()V

    sput-object v0, Ll/ۖ۠᩻;->PARSER:Ll/۫֡ۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 17714
    invoke-direct {p0}, Ll/ۘᩴۖ;-><init>()V

    const/16 v0, 0x1000

    .line 17736
    iput v0, p0, Ll/ۖ۠᩻;->blockSize_:I

    const-wide/16 v1, 0x0

    .line 17763
    iput-wide v1, p0, Ll/ۖ۠᩻;->signaturesOffset_:J

    .line 17798
    iput-wide v1, p0, Ll/ۖ۠᩻;->signaturesSize_:J

    const/4 v3, 0x0

    .line 17817
    iput v3, p0, Ll/ۖ۠᩻;->minorVersion_:I

    .line 17932
    iput-wide v1, p0, Ll/ۖ۠᩻;->maxTimestamp_:J

    .line 17999
    iput-boolean v3, p0, Ll/ۖ۠᩻;->partialUpdate_:Z

    const-string v1, ""

    .line 18092
    iput-object v1, p0, Ll/ۖ۠᩻;->securityPatchLevel_:Ljava/lang/Object;

    const/4 v2, -0x1

    .line 18155
    iput-byte v2, p0, Ll/ۖ۠᩻;->memoizedIsInitialized:B

    .line 17715
    iput v0, p0, Ll/ۖ۠᩻;->blockSize_:I

    .line 17716
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ۖ۠᩻;->partitions_:Ljava/util/List;

    .line 17717
    iput-object v0, p0, Ll/ۖ۠᩻;->apexInfo_:Ljava/util/List;

    .line 17718
    iput-object v1, p0, Ll/ۖ۠᩻;->securityPatchLevel_:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ll/ܺ۠᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ۖ۠᩻;-><init>(Ll/᩶ۘۖ;)V

    return-void
.end method

.method public constructor <init>(Ll/᩶ۘۖ;)V
    .locals 2

    .line 17712
    invoke-direct {p0, p1}, Ll/ۘᩴۖ;-><init>(Ll/᩶ۘۖ;)V

    const/16 p1, 0x1000

    .line 17736
    iput p1, p0, Ll/ۖ۠᩻;->blockSize_:I

    const-wide/16 v0, 0x0

    .line 17763
    iput-wide v0, p0, Ll/ۖ۠᩻;->signaturesOffset_:J

    .line 17798
    iput-wide v0, p0, Ll/ۖ۠᩻;->signaturesSize_:J

    const/4 p1, 0x0

    .line 17817
    iput p1, p0, Ll/ۖ۠᩻;->minorVersion_:I

    .line 17932
    iput-wide v0, p0, Ll/ۖ۠᩻;->maxTimestamp_:J

    .line 17999
    iput-boolean p1, p0, Ll/ۖ۠᩻;->partialUpdate_:Z

    const-string p1, ""

    .line 18092
    iput-object p1, p0, Ll/ۖ۠᩻;->securityPatchLevel_:Ljava/lang/Object;

    const/4 p1, -0x1

    .line 18155
    iput-byte p1, p0, Ll/ۖ۠᩻;->memoizedIsInitialized:B

    return-void
.end method

.method public static synthetic access$1100()Z
    .locals 1

    .line 17696
    sget-boolean v0, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method public static synthetic access$1200()Z
    .locals 1

    .line 17696
    sget-boolean v0, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method public static synthetic access$1300()Z
    .locals 1

    .line 17696
    sget-boolean v0, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method public static getDefaultInstance()Ll/ۖ۠᩻;
    .locals 1

    .line 20195
    sget-object v0, Ll/ۖ۠᩻;->DEFAULT_INSTANCE:Ll/ۖ۠᩻;

    return-object v0
.end method

.method public static final getDescriptor()Ll/ᩳۖۖ;
    .locals 1

    .line 17723
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_DeltaArchiveManifest_descriptor()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder()Ll/ܺ۠᩻;
    .locals 1

    .line 18453
    sget-object v0, Ll/ۖ۠᩻;->DEFAULT_INSTANCE:Ll/ۖ۠᩻;

    invoke-virtual {v0}, Ll/ۖ۠᩻;->toBuilder()Ll/ܺ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Ll/ۖ۠᩻;)Ll/ܺ۠᩻;
    .locals 1

    .line 18456
    sget-object v0, Ll/ۖ۠᩻;->DEFAULT_INSTANCE:Ll/ۖ۠᩻;

    invoke-virtual {v0}, Ll/ۖ۠᩻;->toBuilder()Ll/ܺ۠᩻;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/ܺ۠᩻;->mergeFrom(Ll/ۖ۠᩻;)Ll/ܺ۠᩻;

    move-result-object p0

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Ll/ۖ۠᩻;
    .locals 1

    .line 18425
    sget-object v0, Ll/ۖ۠᩻;->PARSER:Ll/۫֡ۖ;

    .line 18426
    invoke-static {v0, p0}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ljava/io/InputStream;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/ۖ۠᩻;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/ۖ۠᩻;
    .locals 1

    .line 18433
    sget-object v0, Ll/ۖ۠᩻;->PARSER:Ll/۫֡ۖ;

    .line 18434
    invoke-static {v0, p0, p1}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/ۖ۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Ll/ۖ۠᩻;
    .locals 1

    .line 18412
    sget-object v0, Ll/ۖ۠᩻;->PARSER:Ll/۫֡ۖ;

    .line 18413
    invoke-static {v0, p0}, Ll/ۘᩴۖ;->ۧ(Ll/۫֡ۖ;Ljava/io/InputStream;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/ۖ۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/ۖ۠᩻;
    .locals 1

    .line 18419
    sget-object v0, Ll/ۖ۠᩻;->PARSER:Ll/۫֡ۖ;

    .line 18420
    invoke-static {v0, p0, p1}, Ll/ۘᩴۖ;->ۧ(Ll/۫֡ۖ;Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/ۖ۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Ll/ۖ۠᩻;
    .locals 1

    .line 18381
    sget-object v0, Ll/ۖ۠᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0}, Ll/۫֡ۖ;->parseFrom(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۖ۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Ll/ᩳۘۖ;)Ll/ۖ۠᩻;
    .locals 1

    .line 18387
    sget-object v0, Ll/ۖ۠᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0, p1}, Ll/۫֡ۖ;->parseFrom(Ljava/nio/ByteBuffer;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۖ۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/ۛۜۖ;)Ll/ۖ۠᩻;
    .locals 1

    .line 18392
    sget-object v0, Ll/ۖ۠᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0}, Ll/۫֡ۖ;->parseFrom(Ll/ۛۜۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۖ۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ll/ۖ۠᩻;
    .locals 1

    .line 18398
    sget-object v0, Ll/ۖ۠᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0, p1}, Ll/۫֡ۖ;->parseFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۖ۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/۟ۜۖ;)Ll/ۖ۠᩻;
    .locals 1

    .line 18439
    sget-object v0, Ll/ۖ۠᩻;->PARSER:Ll/۫֡ۖ;

    .line 18440
    invoke-static {v0, p0}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ll/۟ۜۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/ۖ۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۖ۠᩻;
    .locals 1

    .line 18446
    sget-object v0, Ll/ۖ۠᩻;->PARSER:Ll/۫֡ۖ;

    .line 18447
    invoke-static {v0, p0, p1}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/ۖ۠᩻;

    return-object p0
.end method

.method public static parseFrom([B)Ll/ۖ۠᩻;
    .locals 1

    .line 18402
    sget-object v0, Ll/ۖ۠᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0}, Ll/۫֡ۖ;->parseFrom([B)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۖ۠᩻;

    return-object p0
.end method

.method public static parseFrom([BLl/ᩳۘۖ;)Ll/ۖ۠᩻;
    .locals 1

    .line 18408
    sget-object v0, Ll/ۖ۠᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0, p1}, Ll/۫֡ۖ;->parseFrom([BLl/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۖ۠᩻;

    return-object p0
.end method

.method public static parser()Ll/۫֡ۖ;
    .locals 1

    .line 20221
    sget-object v0, Ll/ۖ۠᩻;->PARSER:Ll/۫֡ۖ;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 18269
    :cond_0
    instance-of v1, p1, Ll/ۖ۠᩻;

    if-nez v1, :cond_1

    .line 18270
    invoke-super {p0, p1}, Ll/ۡۜۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 18272
    :cond_1
    check-cast p1, Ll/ۖ۠᩻;

    .line 18274
    invoke-virtual {p0}, Ll/ۖ۠᩻;->hasBlockSize()Z

    move-result v1

    invoke-virtual {p1}, Ll/ۖ۠᩻;->hasBlockSize()Z

    move-result v2

    const/4 v3, 0x0

    if-eq v1, v2, :cond_2

    return v3

    .line 18275
    :cond_2
    invoke-virtual {p0}, Ll/ۖ۠᩻;->hasBlockSize()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 18276
    invoke-virtual {p0}, Ll/ۖ۠᩻;->getBlockSize()I

    move-result v1

    .line 18277
    invoke-virtual {p1}, Ll/ۖ۠᩻;->getBlockSize()I

    move-result v2

    if-eq v1, v2, :cond_3

    return v3

    .line 18279
    :cond_3
    invoke-virtual {p0}, Ll/ۖ۠᩻;->hasSignaturesOffset()Z

    move-result v1

    invoke-virtual {p1}, Ll/ۖ۠᩻;->hasSignaturesOffset()Z

    move-result v2

    if-eq v1, v2, :cond_4

    return v3

    .line 18280
    :cond_4
    invoke-virtual {p0}, Ll/ۖ۠᩻;->hasSignaturesOffset()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 18281
    invoke-virtual {p0}, Ll/ۖ۠᩻;->getSignaturesOffset()J

    move-result-wide v1

    .line 18282
    invoke-virtual {p1}, Ll/ۖ۠᩻;->getSignaturesOffset()J

    move-result-wide v4

    cmp-long v6, v1, v4

    if-eqz v6, :cond_5

    return v3

    .line 18284
    :cond_5
    invoke-virtual {p0}, Ll/ۖ۠᩻;->hasSignaturesSize()Z

    move-result v1

    invoke-virtual {p1}, Ll/ۖ۠᩻;->hasSignaturesSize()Z

    move-result v2

    if-eq v1, v2, :cond_6

    return v3

    .line 18285
    :cond_6
    invoke-virtual {p0}, Ll/ۖ۠᩻;->hasSignaturesSize()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 18286
    invoke-virtual {p0}, Ll/ۖ۠᩻;->getSignaturesSize()J

    move-result-wide v1

    .line 18287
    invoke-virtual {p1}, Ll/ۖ۠᩻;->getSignaturesSize()J

    move-result-wide v4

    cmp-long v6, v1, v4

    if-eqz v6, :cond_7

    return v3

    .line 18289
    :cond_7
    invoke-virtual {p0}, Ll/ۖ۠᩻;->hasMinorVersion()Z

    move-result v1

    invoke-virtual {p1}, Ll/ۖ۠᩻;->hasMinorVersion()Z

    move-result v2

    if-eq v1, v2, :cond_8

    return v3

    .line 18290
    :cond_8
    invoke-virtual {p0}, Ll/ۖ۠᩻;->hasMinorVersion()Z

    move-result v1

    if-eqz v1, :cond_9

    .line 18291
    invoke-virtual {p0}, Ll/ۖ۠᩻;->getMinorVersion()I

    move-result v1

    .line 18292
    invoke-virtual {p1}, Ll/ۖ۠᩻;->getMinorVersion()I

    move-result v2

    if-eq v1, v2, :cond_9

    return v3

    .line 18294
    :cond_9
    invoke-virtual {p0}, Ll/ۖ۠᩻;->getPartitionsList()Ljava/util/List;

    move-result-object v1

    .line 18295
    invoke-virtual {p1}, Ll/ۖ۠᩻;->getPartitionsList()Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v3

    .line 18296
    :cond_a
    invoke-virtual {p0}, Ll/ۖ۠᩻;->hasMaxTimestamp()Z

    move-result v1

    invoke-virtual {p1}, Ll/ۖ۠᩻;->hasMaxTimestamp()Z

    move-result v2

    if-eq v1, v2, :cond_b

    return v3

    .line 18297
    :cond_b
    invoke-virtual {p0}, Ll/ۖ۠᩻;->hasMaxTimestamp()Z

    move-result v1

    if-eqz v1, :cond_c

    .line 18298
    invoke-virtual {p0}, Ll/ۖ۠᩻;->getMaxTimestamp()J

    move-result-wide v1

    .line 18299
    invoke-virtual {p1}, Ll/ۖ۠᩻;->getMaxTimestamp()J

    move-result-wide v4

    cmp-long v6, v1, v4

    if-eqz v6, :cond_c

    return v3

    .line 18301
    :cond_c
    invoke-virtual {p0}, Ll/ۖ۠᩻;->hasDynamicPartitionMetadata()Z

    move-result v1

    invoke-virtual {p1}, Ll/ۖ۠᩻;->hasDynamicPartitionMetadata()Z

    move-result v2

    if-eq v1, v2, :cond_d

    return v3

    .line 18302
    :cond_d
    invoke-virtual {p0}, Ll/ۖ۠᩻;->hasDynamicPartitionMetadata()Z

    move-result v1

    if-eqz v1, :cond_e

    .line 18303
    invoke-virtual {p0}, Ll/ۖ۠᩻;->getDynamicPartitionMetadata()Ll/᩹۠᩻;

    move-result-object v1

    .line 18304
    invoke-virtual {p1}, Ll/ۖ۠᩻;->getDynamicPartitionMetadata()Ll/᩹۠᩻;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/᩹۠᩻;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v3

    .line 18306
    :cond_e
    invoke-virtual {p0}, Ll/ۖ۠᩻;->hasPartialUpdate()Z

    move-result v1

    invoke-virtual {p1}, Ll/ۖ۠᩻;->hasPartialUpdate()Z

    move-result v2

    if-eq v1, v2, :cond_f

    return v3

    .line 18307
    :cond_f
    invoke-virtual {p0}, Ll/ۖ۠᩻;->hasPartialUpdate()Z

    move-result v1

    if-eqz v1, :cond_10

    .line 18308
    invoke-virtual {p0}, Ll/ۖ۠᩻;->getPartialUpdate()Z

    move-result v1

    .line 18309
    invoke-virtual {p1}, Ll/ۖ۠᩻;->getPartialUpdate()Z

    move-result v2

    if-eq v1, v2, :cond_10

    return v3

    .line 18311
    :cond_10
    invoke-virtual {p0}, Ll/ۖ۠᩻;->getApexInfoList()Ljava/util/List;

    move-result-object v1

    .line 18312
    invoke-virtual {p1}, Ll/ۖ۠᩻;->getApexInfoList()Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v3

    .line 18313
    :cond_11
    invoke-virtual {p0}, Ll/ۖ۠᩻;->hasSecurityPatchLevel()Z

    move-result v1

    invoke-virtual {p1}, Ll/ۖ۠᩻;->hasSecurityPatchLevel()Z

    move-result v2

    if-eq v1, v2, :cond_12

    return v3

    .line 18314
    :cond_12
    invoke-virtual {p0}, Ll/ۖ۠᩻;->hasSecurityPatchLevel()Z

    move-result v1

    if-eqz v1, :cond_13

    .line 18315
    invoke-virtual {p0}, Ll/ۖ۠᩻;->getSecurityPatchLevel()Ljava/lang/String;

    move-result-object v1

    .line 18316
    invoke-virtual {p1}, Ll/ۖ۠᩻;->getSecurityPatchLevel()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v3

    .line 18318
    :cond_13
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/ۢ֨ۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_14

    return v3

    :cond_14
    return v0
.end method

.method public getApexInfo(I)Ll/֫۠᩻;
    .locals 1

    .line 18075
    iget-object v0, p0, Ll/ۖ۠᩻;->apexInfo_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֫۠᩻;

    return-object p1
.end method

.method public getApexInfoCount()I
    .locals 1

    .line 18063
    iget-object v0, p0, Ll/ۖ۠᩻;->apexInfo_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getApexInfoList()Ljava/util/List;
    .locals 1

    .line 18038
    iget-object v0, p0, Ll/ۖ۠᩻;->apexInfo_:Ljava/util/List;

    return-object v0
.end method

.method public getApexInfoOrBuilder(I)Ll/ܽ۠᩻;
    .locals 1

    .line 18088
    iget-object v0, p0, Ll/ۖ۠᩻;->apexInfo_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܽ۠᩻;

    return-object p1
.end method

.method public getApexInfoOrBuilderList()Ljava/util/List;
    .locals 1

    .line 18051
    iget-object v0, p0, Ll/ۖ۠᩻;->apexInfo_:Ljava/util/List;

    return-object v0
.end method

.method public getBlockSize()I
    .locals 1

    .line 17759
    iget v0, p0, Ll/ۖ۠᩻;->blockSize_:I

    return v0
.end method

.method public getDefaultInstanceForType()Ll/ۖ۠᩻;
    .locals 1

    .line 20231
    sget-object v0, Ll/ۖ۠᩻;->DEFAULT_INSTANCE:Ll/ۖ۠᩻;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 17696
    invoke-virtual {p0}, Ll/ۖ۠᩻;->getDefaultInstanceForType()Ll/ۖ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 17696
    invoke-virtual {p0}, Ll/ۖ۠᩻;->getDefaultInstanceForType()Ll/ۖ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public getDynamicPartitionMetadata()Ll/᩹۠᩻;
    .locals 1

    .line 17984
    iget-object v0, p0, Ll/ۖ۠᩻;->dynamicPartitionMetadata_:Ll/᩹۠᩻;

    if-nez v0, :cond_0

    invoke-static {}, Ll/᩹۠᩻;->getDefaultInstance()Ll/᩹۠᩻;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getDynamicPartitionMetadataOrBuilder()Ll/ۙ۠᩻;
    .locals 1

    .line 17995
    iget-object v0, p0, Ll/ۖ۠᩻;->dynamicPartitionMetadata_:Ll/᩹۠᩻;

    if-nez v0, :cond_0

    invoke-static {}, Ll/᩹۠᩻;->getDefaultInstance()Ll/᩹۠᩻;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getMaxTimestamp()J
    .locals 2

    .line 17957
    iget-wide v0, p0, Ll/ۖ۠᩻;->maxTimestamp_:J

    return-wide v0
.end method

.method public getMinorVersion()I
    .locals 1

    .line 17842
    iget v0, p0, Ll/ۖ۠᩻;->minorVersion_:I

    return v0
.end method

.method public getParserForType()Ll/۫֡ۖ;
    .locals 1

    .line 20226
    sget-object v0, Ll/ۖ۠᩻;->PARSER:Ll/۫֡ۖ;

    return-object v0
.end method

.method public getPartialUpdate()Z
    .locals 1

    .line 18022
    iget-boolean v0, p0, Ll/ۖ۠᩻;->partialUpdate_:Z

    return v0
.end method

.method public getPartitions(I)Ll/ۡܶ᩻;
    .locals 1

    .line 17911
    iget-object v0, p0, Ll/ۖ۠᩻;->partitions_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۡܶ᩻;

    return-object p1
.end method

.method public getPartitionsCount()I
    .locals 1

    .line 17895
    iget-object v0, p0, Ll/ۖ۠᩻;->partitions_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getPartitionsList()Ljava/util/List;
    .locals 1

    .line 17862
    iget-object v0, p0, Ll/ۖ۠᩻;->partitions_:Ljava/util/List;

    return-object v0
.end method

.method public getPartitionsOrBuilder(I)Ll/ۖܶ᩻;
    .locals 1

    .line 17928
    iget-object v0, p0, Ll/ۖ۠᩻;->partitions_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۖܶ᩻;

    return-object p1
.end method

.method public getPartitionsOrBuilderList()Ljava/util/List;
    .locals 1

    .line 17879
    iget-object v0, p0, Ll/ۖ۠᩻;->partitions_:Ljava/util/List;

    return-object v0
.end method

.method public getSecurityPatchLevel()Ljava/lang/String;
    .locals 2

    .line 18118
    iget-object v0, p0, Ll/ۖ۠᩻;->securityPatchLevel_:Ljava/lang/Object;

    .line 18119
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 18120
    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 18122
    :cond_0
    check-cast v0, Ll/ۛۜۖ;

    .line 18124
    invoke-virtual {v0}, Ll/ۛۜۖ;->ܳ()Ljava/lang/String;

    move-result-object v1

    .line 18125
    invoke-virtual {v0}, Ll/ۛۜۖ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 18126
    iput-object v1, p0, Ll/ۖ۠᩻;->securityPatchLevel_:Ljava/lang/Object;

    :cond_1
    return-object v1
.end method

.method public getSecurityPatchLevelBytes()Ll/ۛۜۖ;
    .locals 2

    .line 18143
    iget-object v0, p0, Ll/ۖ۠᩻;->securityPatchLevel_:Ljava/lang/Object;

    .line 18144
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 18145
    check-cast v0, Ljava/lang/String;

    .line 18146
    invoke-static {v0}, Ll/ۛۜۖ;->֫(Ljava/lang/String;)Ll/ۛۜۖ;

    move-result-object v0

    .line 18148
    iput-object v0, p0, Ll/ۖ۠᩻;->securityPatchLevel_:Ljava/lang/Object;

    return-object v0

    .line 18151
    :cond_0
    check-cast v0, Ll/ۛۜۖ;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 6

    .line 18216
    iget v0, p0, Ll/ۡۜۖ;->memoizedSize:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    .line 18220
    :cond_0
    iget v0, p0, Ll/ۖ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const/4 v0, 0x3

    .line 18221
    iget v2, p0, Ll/ۖ۠᩻;->blockSize_:I

    .line 18222
    invoke-static {v0, v2}, Ll/ܳ᩷ۖ;->᩻(II)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 18224
    :goto_0
    iget v2, p0, Ll/ۖ۠᩻;->bitField0_:I

    and-int/lit8 v2, v2, 0x2

    const/4 v3, 0x4

    if-eqz v2, :cond_2

    .line 18225
    iget-wide v4, p0, Ll/ۖ۠᩻;->signaturesOffset_:J

    .line 18226
    invoke-static {v3, v4, v5}, Ll/ܳ᩷ۖ;->ᩳ(IJ)I

    move-result v2

    add-int/2addr v0, v2

    .line 18228
    :cond_2
    iget v2, p0, Ll/ۖ۠᩻;->bitField0_:I

    and-int/2addr v2, v3

    if-eqz v2, :cond_3

    const/4 v2, 0x5

    .line 18229
    iget-wide v3, p0, Ll/ۖ۠᩻;->signaturesSize_:J

    .line 18230
    invoke-static {v2, v3, v4}, Ll/ܳ᩷ۖ;->ᩳ(IJ)I

    move-result v2

    add-int/2addr v0, v2

    .line 18232
    :cond_3
    iget v2, p0, Ll/ۖ۠᩻;->bitField0_:I

    and-int/lit8 v2, v2, 0x8

    if-eqz v2, :cond_4

    const/16 v2, 0xc

    .line 18233
    iget v3, p0, Ll/ۖ۠᩻;->minorVersion_:I

    .line 18234
    invoke-static {v2, v3}, Ll/ܳ᩷ۖ;->᩻(II)I

    move-result v2

    add-int/2addr v0, v2

    :cond_4
    const/4 v2, 0x0

    .line 18236
    :goto_1
    iget-object v3, p0, Ll/ۖ۠᩻;->partitions_:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_5

    .line 18237
    iget-object v3, p0, Ll/ۖ۠᩻;->partitions_:Ljava/util/List;

    .line 18238
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۡ֡ۖ;

    const/16 v4, 0xd

    invoke-static {v4, v3}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v3

    add-int/2addr v0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 18240
    :cond_5
    iget v2, p0, Ll/ۖ۠᩻;->bitField0_:I

    const/16 v3, 0x10

    and-int/2addr v2, v3

    if-eqz v2, :cond_6

    const/16 v2, 0xe

    .line 18241
    iget-wide v4, p0, Ll/ۖ۠᩻;->maxTimestamp_:J

    .line 18242
    invoke-static {v2, v4, v5}, Ll/ܳ᩷ۖ;->ܽ(IJ)I

    move-result v2

    add-int/2addr v0, v2

    .line 18244
    :cond_6
    iget v2, p0, Ll/ۖ۠᩻;->bitField0_:I

    and-int/lit8 v2, v2, 0x20

    if-eqz v2, :cond_7

    const/16 v2, 0xf

    .line 18246
    invoke-virtual {p0}, Ll/ۖ۠᩻;->getDynamicPartitionMetadata()Ll/᩹۠᩻;

    move-result-object v4

    invoke-static {v2, v4}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v2

    add-int/2addr v0, v2

    .line 18248
    :cond_7
    iget v2, p0, Ll/ۖ۠᩻;->bitField0_:I

    and-int/lit8 v2, v2, 0x40

    if-eqz v2, :cond_8

    .line 18250
    invoke-static {v3}, Ll/ܳ᩷ۖ;->ᩳ(I)I

    move-result v2

    add-int/2addr v0, v2

    .line 18252
    :cond_8
    :goto_2
    iget-object v2, p0, Ll/ۖ۠᩻;->apexInfo_:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_9

    .line 18253
    iget-object v2, p0, Ll/ۖ۠᩻;->apexInfo_:Ljava/util/List;

    .line 18254
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۡ֡ۖ;

    const/16 v3, 0x11

    invoke-static {v3, v2}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v2

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 18256
    :cond_9
    iget v1, p0, Ll/ۖ۠᩻;->bitField0_:I

    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_a

    const/16 v1, 0x12

    .line 18257
    iget-object v2, p0, Ll/ۖ۠᩻;->securityPatchLevel_:Ljava/lang/Object;

    invoke-static {v1, v2}, Ll/ۘᩴۖ;->֫(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 18259
    :cond_a
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->getSerializedSize()I

    move-result v1

    add-int/2addr v1, v0

    .line 18260
    iput v1, p0, Ll/ۡۜۖ;->memoizedSize:I

    return v1
.end method

.method public getSignaturesOffset()J
    .locals 2

    .line 17794
    iget-wide v0, p0, Ll/ۖ۠᩻;->signaturesOffset_:J

    return-wide v0
.end method

.method public getSignaturesSize()J
    .locals 2

    .line 17813
    iget-wide v0, p0, Ll/ۖ۠᩻;->signaturesSize_:J

    return-wide v0
.end method

.method public hasBlockSize()Z
    .locals 2

    .line 17747
    iget v0, p0, Ll/ۖ۠᩻;->bitField0_:I

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

    .line 17972
    iget v0, p0, Ll/ۖ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasMaxTimestamp()Z
    .locals 1

    .line 17944
    iget v0, p0, Ll/ۖ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasMinorVersion()Z
    .locals 1

    .line 17829
    iget v0, p0, Ll/ۖ۠᩻;->bitField0_:I

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

    .line 18010
    iget v0, p0, Ll/ۖ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasSecurityPatchLevel()Z
    .locals 1

    .line 18105
    iget v0, p0, Ll/ۖ۠᩻;->bitField0_:I

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasSignaturesOffset()Z
    .locals 1

    .line 17778
    iget v0, p0, Ll/ۖ۠᩻;->bitField0_:I

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

    .line 17805
    iget v0, p0, Ll/ۖ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 6

    .line 18324
    iget v0, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    if-eqz v0, :cond_0

    return v0

    .line 18328
    :cond_0
    invoke-static {}, Ll/ۖ۠᩻;->getDescriptor()Ll/ᩳۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x30b

    .line 18329
    invoke-virtual {p0}, Ll/ۖ۠᩻;->hasBlockSize()Z

    move-result v1

    const/16 v2, 0x35

    const/16 v3, 0x25

    if-eqz v1, :cond_1

    const/4 v1, 0x3

    .line 18330
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 18331
    invoke-virtual {p0}, Ll/ۖ۠᩻;->getBlockSize()I

    move-result v1

    add-int/2addr v0, v1

    .line 18333
    :cond_1
    invoke-virtual {p0}, Ll/ۖ۠᩻;->hasSignaturesOffset()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x4

    .line 18334
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 18336
    invoke-virtual {p0}, Ll/ۖ۠᩻;->getSignaturesOffset()J

    move-result-wide v4

    .line 18335
    invoke-static {v4, v5}, Ll/ܰᩴۖ;->֫(J)I

    move-result v1

    add-int/2addr v0, v1

    .line 18338
    :cond_2
    invoke-virtual {p0}, Ll/ۖ۠᩻;->hasSignaturesSize()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x5

    .line 18339
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 18341
    invoke-virtual {p0}, Ll/ۖ۠᩻;->getSignaturesSize()J

    move-result-wide v4

    .line 18340
    invoke-static {v4, v5}, Ll/ܰᩴۖ;->֫(J)I

    move-result v1

    add-int/2addr v0, v1

    .line 18343
    :cond_3
    invoke-virtual {p0}, Ll/ۖ۠᩻;->hasMinorVersion()Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0xc

    .line 18344
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 18345
    invoke-virtual {p0}, Ll/ۖ۠᩻;->getMinorVersion()I

    move-result v1

    add-int/2addr v0, v1

    .line 18347
    :cond_4
    invoke-virtual {p0}, Ll/ۖ۠᩻;->getPartitionsCount()I

    move-result v1

    if-lez v1, :cond_5

    const/16 v1, 0xd

    .line 18348
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 18349
    invoke-virtual {p0}, Ll/ۖ۠᩻;->getPartitionsList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 18351
    :cond_5
    invoke-virtual {p0}, Ll/ۖ۠᩻;->hasMaxTimestamp()Z

    move-result v1

    if-eqz v1, :cond_6

    const/16 v1, 0xe

    .line 18352
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 18354
    invoke-virtual {p0}, Ll/ۖ۠᩻;->getMaxTimestamp()J

    move-result-wide v4

    .line 18353
    invoke-static {v4, v5}, Ll/ܰᩴۖ;->֫(J)I

    move-result v1

    add-int/2addr v0, v1

    .line 18356
    :cond_6
    invoke-virtual {p0}, Ll/ۖ۠᩻;->hasDynamicPartitionMetadata()Z

    move-result v1

    if-eqz v1, :cond_7

    const/16 v1, 0xf

    .line 18357
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 18358
    invoke-virtual {p0}, Ll/ۖ۠᩻;->getDynamicPartitionMetadata()Ll/᩹۠᩻;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩹۠᩻;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 18360
    :cond_7
    invoke-virtual {p0}, Ll/ۖ۠᩻;->hasPartialUpdate()Z

    move-result v1

    if-eqz v1, :cond_8

    const/16 v1, 0x10

    .line 18361
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 18363
    invoke-virtual {p0}, Ll/ۖ۠᩻;->getPartialUpdate()Z

    move-result v1

    .line 18362
    invoke-static {v1}, Ll/ܰᩴۖ;->֫(Z)I

    move-result v1

    add-int/2addr v0, v1

    .line 18365
    :cond_8
    invoke-virtual {p0}, Ll/ۖ۠᩻;->getApexInfoCount()I

    move-result v1

    if-lez v1, :cond_9

    const/16 v1, 0x11

    .line 18366
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 18367
    invoke-virtual {p0}, Ll/ۖ۠᩻;->getApexInfoList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 18369
    :cond_9
    invoke-virtual {p0}, Ll/ۖ۠᩻;->hasSecurityPatchLevel()Z

    move-result v1

    if-eqz v1, :cond_a

    const/16 v1, 0x12

    .line 18370
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 18371
    invoke-virtual {p0}, Ll/ۖ۠᩻;->getSecurityPatchLevel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    :cond_a
    mul-int/lit8 v0, v0, 0x1d

    .line 18373
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    .line 18374
    iput v1, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    return v1
.end method

.method public internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 17729
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_DeltaArchiveManifest_fieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/ۖ۠᩻;

    const-class v2, Ll/ܺ۠᩻;

    .line 17730
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 4

    .line 18158
    iget-byte v0, p0, Ll/ۖ۠᩻;->memoizedIsInitialized:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    const/4 v0, 0x0

    .line 18162
    :goto_0
    invoke-virtual {p0}, Ll/ۖ۠᩻;->getPartitionsCount()I

    move-result v3

    if-ge v0, v3, :cond_3

    .line 18163
    invoke-virtual {p0, v0}, Ll/ۖ۠᩻;->getPartitions(I)Ll/ۡܶ᩻;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۡܶ᩻;->isInitialized()Z

    move-result v3

    if-nez v3, :cond_2

    .line 18164
    iput-byte v2, p0, Ll/ۖ۠᩻;->memoizedIsInitialized:B

    return v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 18168
    :cond_3
    invoke-virtual {p0}, Ll/ۖ۠᩻;->hasDynamicPartitionMetadata()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 18169
    invoke-virtual {p0}, Ll/ۖ۠᩻;->getDynamicPartitionMetadata()Ll/᩹۠᩻;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩹۠᩻;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_4

    .line 18170
    iput-byte v2, p0, Ll/ۖ۠᩻;->memoizedIsInitialized:B

    return v2

    .line 18174
    :cond_4
    iput-byte v1, p0, Ll/ۖ۠᩻;->memoizedIsInitialized:B

    return v1
.end method

.method public bridge synthetic newBuilderForType()Ll/ۢ֡ۖ;
    .locals 1

    .line 17696
    invoke-virtual {p0}, Ll/ۖ۠᩻;->newBuilderForType()Ll/ܺ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Ll/ܳ֡ۖ;
    .locals 1

    .line 17696
    invoke-virtual {p0}, Ll/ۖ۠᩻;->newBuilderForType()Ll/ܺ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Ll/ۢۜۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 17696
    invoke-virtual {p0, p1}, Ll/ۖ۠᩻;->newBuilderForType(Ll/ۢۜۖ;)Ll/ܺ۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public newBuilderForType()Ll/ܺ۠᩻;
    .locals 1

    .line 18451
    invoke-static {}, Ll/ۖ۠᩻;->newBuilder()Ll/ܺ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType(Ll/ۢۜۖ;)Ll/ܺ۠᩻;
    .locals 2

    .line 18467
    new-instance v0, Ll/ܺ۠᩻;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/ܺ۠᩻;-><init>(Ll/ۢۜۖ;I)V

    return-object v0
.end method

.method public bridge synthetic toBuilder()Ll/ۢ֡ۖ;
    .locals 1

    .line 17696
    invoke-virtual {p0}, Ll/ۖ۠᩻;->toBuilder()Ll/ܺ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Ll/ܳ֡ۖ;
    .locals 1

    .line 17696
    invoke-virtual {p0}, Ll/ۖ۠᩻;->toBuilder()Ll/ܺ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Ll/ܺ۠᩻;
    .locals 2

    .line 18460
    sget-object v0, Ll/ۖ۠᩻;->DEFAULT_INSTANCE:Ll/ۖ۠᩻;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    .line 18461
    new-instance v0, Ll/ܺ۠᩻;

    invoke-direct {v0, v1}, Ll/ܺ۠᩻;-><init>(I)V

    return-object v0

    :cond_0
    new-instance v0, Ll/ܺ۠᩻;

    invoke-direct {v0, v1}, Ll/ܺ۠᩻;-><init>(I)V

    invoke-virtual {v0, p0}, Ll/ܺ۠᩻;->mergeFrom(Ll/ۖ۠᩻;)Ll/ܺ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Ll/ܳ᩷ۖ;)V
    .locals 5

    .line 18181
    iget v0, p0, Ll/ۖ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    .line 18182
    iget v1, p0, Ll/ۖ۠᩻;->blockSize_:I

    invoke-virtual {p1, v0, v1}, Ll/ܳ᩷ۖ;->ᩳ(II)V

    .line 18184
    :cond_0
    iget v0, p0, Ll/ۖ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x4

    if-eqz v0, :cond_1

    .line 18185
    iget-wide v2, p0, Ll/ۖ۠᩻;->signaturesOffset_:J

    invoke-virtual {p1, v1, v2, v3}, Ll/ܳ᩷ۖ;->ۧ(IJ)V

    .line 18187
    :cond_1
    iget v0, p0, Ll/ۖ۠᩻;->bitField0_:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_2

    const/4 v0, 0x5

    .line 18188
    iget-wide v1, p0, Ll/ۖ۠᩻;->signaturesSize_:J

    invoke-virtual {p1, v0, v1, v2}, Ll/ܳ᩷ۖ;->ۧ(IJ)V

    .line 18190
    :cond_2
    iget v0, p0, Ll/ۖ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_3

    const/16 v0, 0xc

    .line 18191
    iget v1, p0, Ll/ۖ۠᩻;->minorVersion_:I

    invoke-virtual {p1, v0, v1}, Ll/ܳ᩷ۖ;->ᩳ(II)V

    :cond_3
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 18193
    :goto_0
    iget-object v2, p0, Ll/ۖ۠᩻;->partitions_:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_4

    .line 18194
    iget-object v2, p0, Ll/ۖ۠᩻;->partitions_:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۡ֡ۖ;

    const/16 v3, 0xd

    invoke-virtual {p1, v3, v2}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 18196
    :cond_4
    iget v1, p0, Ll/ۖ۠᩻;->bitField0_:I

    const/16 v2, 0x10

    and-int/2addr v1, v2

    if-eqz v1, :cond_5

    const/16 v1, 0xe

    .line 18197
    iget-wide v3, p0, Ll/ۖ۠᩻;->maxTimestamp_:J

    .line 235
    invoke-virtual {p1, v1, v3, v4}, Ll/ܳ᩷ۖ;->ۧ(IJ)V

    .line 18199
    :cond_5
    iget v1, p0, Ll/ۖ۠᩻;->bitField0_:I

    and-int/lit8 v1, v1, 0x20

    if-eqz v1, :cond_6

    const/16 v1, 0xf

    .line 18200
    invoke-virtual {p0}, Ll/ۖ۠᩻;->getDynamicPartitionMetadata()Ll/᩹۠᩻;

    move-result-object v3

    invoke-virtual {p1, v1, v3}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    .line 18202
    :cond_6
    iget v1, p0, Ll/ۖ۠᩻;->bitField0_:I

    and-int/lit8 v1, v1, 0x40

    if-eqz v1, :cond_7

    .line 18203
    iget-boolean v1, p0, Ll/ۖ۠᩻;->partialUpdate_:Z

    invoke-virtual {p1, v2, v1}, Ll/ܳ᩷ۖ;->֫(IZ)V

    .line 18205
    :cond_7
    :goto_1
    iget-object v1, p0, Ll/ۖ۠᩻;->apexInfo_:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_8

    .line 18206
    iget-object v1, p0, Ll/ۖ۠᩻;->apexInfo_:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡ֡ۖ;

    const/16 v2, 0x11

    invoke-virtual {p1, v2, v1}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 18208
    :cond_8
    iget v0, p0, Ll/ۖ۠᩻;->bitField0_:I

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_9

    const/16 v0, 0x12

    .line 18209
    iget-object v1, p0, Ll/ۖ۠᩻;->securityPatchLevel_:Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ll/ۘᩴۖ;->֫(Ll/ܳ᩷ۖ;ILjava/lang/Object;)V

    .line 18211
    :cond_9
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۢ֨ۖ;->writeTo(Ll/ܳ᩷ۖ;)V

    return-void
.end method
