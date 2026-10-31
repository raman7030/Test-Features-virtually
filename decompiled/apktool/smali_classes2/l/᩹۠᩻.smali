.class public final Ll/᩹۠᩻;
.super Ll/ۘᩴۖ;
.source "C9PC"

# interfaces
.implements Ll/ۙ۠᩻;


# static fields
.field public static final COMPRESSION_FACTOR_FIELD_NUMBER:I = 0x7

.field public static final COW_VERSION_FIELD_NUMBER:I = 0x5

.field public static final DEFAULT_INSTANCE:Ll/᩹۠᩻;

.field public static final GROUPS_FIELD_NUMBER:I = 0x1

.field public static final PARSER:Ll/۫֡ۖ;

.field public static final SNAPSHOT_ENABLED_FIELD_NUMBER:I = 0x2

.field public static final VABC_COMPRESSION_PARAM_FIELD_NUMBER:I = 0x4

.field public static final VABC_ENABLED_FIELD_NUMBER:I = 0x3

.field public static final VABC_FEATURE_SET_FIELD_NUMBER:I = 0x6

.field public static final serialVersionUID:J


# instance fields
.field public bitField0_:I

.field public compressionFactor_:J

.field public cowVersion_:I

.field public groups_:Ljava/util/List;

.field public memoizedIsInitialized:B

.field public snapshotEnabled_:Z

.field public volatile vabcCompressionParam_:Ljava/lang/Object;

.field public vabcEnabled_:Z

.field public vabcFeatureSet_:Ll/ܶܶ᩻;


# direct methods
.method public static bridge synthetic -$$Nest$fgetbitField0_(Ll/᩹۠᩻;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/᩹۠᩻;->bitField0_:I

    return p0
.end method

.method public static bridge synthetic -$$Nest$fgetgroups_(Ll/᩹۠᩻;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩹۠᩻;->groups_:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic -$$Nest$fgetvabcCompressionParam_(Ll/᩹۠᩻;)Ljava/lang/Object;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩹۠᩻;->vabcCompressionParam_:Ljava/lang/Object;

    return-object p0
.end method

.method public static bridge synthetic -$$Nest$fputbitField0_(Ll/᩹۠᩻;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩹۠᩻;->bitField0_:I

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputcompressionFactor_(Ll/᩹۠᩻;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/᩹۠᩻;->compressionFactor_:J

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputcowVersion_(Ll/᩹۠᩻;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩹۠᩻;->cowVersion_:I

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputgroups_(Ll/᩹۠᩻;Ljava/util/List;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩹۠᩻;->groups_:Ljava/util/List;

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputsnapshotEnabled_(Ll/᩹۠᩻;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/᩹۠᩻;->snapshotEnabled_:Z

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputvabcCompressionParam_(Ll/᩹۠᩻;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩹۠᩻;->vabcCompressionParam_:Ljava/lang/Object;

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputvabcEnabled_(Ll/᩹۠᩻;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/᩹۠᩻;->vabcEnabled_:Z

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputvabcFeatureSet_(Ll/᩹۠᩻;Ll/ܶܶ᩻;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩹۠᩻;->vabcFeatureSet_:Ll/ܶܶ᩻;

    return-void
.end method

.method public static constructor <clinit>()V
    .locals 2

    .line 13912
    sget-object v0, Ll/ۜۚۖ;->᩶:Ll/ۜۚۖ;

    const-class v1, Ll/᩹۠᩻;

    .line 13918
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    .line 13912
    invoke-static {v0, v1}, Ll/᩷ۚۖ;->֫(Ll/ۜۚۖ;Ljava/lang/String;)V

    .line 15747
    new-instance v0, Ll/᩹۠᩻;

    invoke-direct {v0}, Ll/᩹۠᩻;-><init>()V

    sput-object v0, Ll/᩹۠᩻;->DEFAULT_INSTANCE:Ll/᩹۠᩻;

    .line 15755
    new-instance v0, Ll/ܶ۠᩻;

    invoke-direct {v0}, Ll/ܶ۠᩻;-><init>()V

    sput-object v0, Ll/᩹۠᩻;->PARSER:Ll/۫֡ۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 13924
    invoke-direct {p0}, Ll/ۘᩴۖ;-><init>()V

    const/4 v0, 0x0

    .line 14030
    iput-boolean v0, p0, Ll/᩹۠᩻;->snapshotEnabled_:Z

    .line 14063
    iput-boolean v0, p0, Ll/᩹۠᩻;->vabcEnabled_:Z

    const-string v1, ""

    .line 14096
    iput-object v1, p0, Ll/᩹۠᩻;->vabcCompressionParam_:Ljava/lang/Object;

    .line 14163
    iput v0, p0, Ll/᩹۠᩻;->cowVersion_:I

    const-wide/16 v2, 0x0

    .line 14230
    iput-wide v2, p0, Ll/᩹۠᩻;->compressionFactor_:J

    const/4 v0, -0x1

    .line 14258
    iput-byte v0, p0, Ll/᩹۠᩻;->memoizedIsInitialized:B

    .line 13925
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/᩹۠᩻;->groups_:Ljava/util/List;

    .line 13926
    iput-object v1, p0, Ll/᩹۠᩻;->vabcCompressionParam_:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ll/᩶ۘۖ;)V
    .locals 2

    .line 13922
    invoke-direct {p0, p1}, Ll/ۘᩴۖ;-><init>(Ll/᩶ۘۖ;)V

    const/4 p1, 0x0

    .line 14030
    iput-boolean p1, p0, Ll/᩹۠᩻;->snapshotEnabled_:Z

    .line 14063
    iput-boolean p1, p0, Ll/᩹۠᩻;->vabcEnabled_:Z

    const-string v0, ""

    .line 14096
    iput-object v0, p0, Ll/᩹۠᩻;->vabcCompressionParam_:Ljava/lang/Object;

    .line 14163
    iput p1, p0, Ll/᩹۠᩻;->cowVersion_:I

    const-wide/16 v0, 0x0

    .line 14230
    iput-wide v0, p0, Ll/᩹۠᩻;->compressionFactor_:J

    const/4 p1, -0x1

    .line 14258
    iput-byte p1, p0, Ll/᩹۠᩻;->memoizedIsInitialized:B

    return-void
.end method

.method public synthetic constructor <init>(Ll/᩸۠᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/᩹۠᩻;-><init>(Ll/᩶ۘۖ;)V

    return-void
.end method

.method public static synthetic access$800()Z
    .locals 1

    .line 13906
    sget-boolean v0, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method public static synthetic access$900()Z
    .locals 1

    .line 13906
    sget-boolean v0, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method public static getDefaultInstance()Ll/᩹۠᩻;
    .locals 1

    .line 15751
    sget-object v0, Ll/᩹۠᩻;->DEFAULT_INSTANCE:Ll/᩹۠᩻;

    return-object v0
.end method

.method public static final getDescriptor()Ll/ᩳۖۖ;
    .locals 1

    .line 13931
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_DynamicPartitionMetadata_descriptor()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder()Ll/᩸۠᩻;
    .locals 1

    .line 14504
    sget-object v0, Ll/᩹۠᩻;->DEFAULT_INSTANCE:Ll/᩹۠᩻;

    invoke-virtual {v0}, Ll/᩹۠᩻;->toBuilder()Ll/᩸۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Ll/᩹۠᩻;)Ll/᩸۠᩻;
    .locals 1

    .line 14507
    sget-object v0, Ll/᩹۠᩻;->DEFAULT_INSTANCE:Ll/᩹۠᩻;

    invoke-virtual {v0}, Ll/᩹۠᩻;->toBuilder()Ll/᩸۠᩻;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/᩸۠᩻;->mergeFrom(Ll/᩹۠᩻;)Ll/᩸۠᩻;

    move-result-object p0

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Ll/᩹۠᩻;
    .locals 1

    .line 14476
    sget-object v0, Ll/᩹۠᩻;->PARSER:Ll/۫֡ۖ;

    .line 14477
    invoke-static {v0, p0}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ljava/io/InputStream;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/᩹۠᩻;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/᩹۠᩻;
    .locals 1

    .line 14484
    sget-object v0, Ll/᩹۠᩻;->PARSER:Ll/۫֡ۖ;

    .line 14485
    invoke-static {v0, p0, p1}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/᩹۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Ll/᩹۠᩻;
    .locals 1

    .line 14463
    sget-object v0, Ll/᩹۠᩻;->PARSER:Ll/۫֡ۖ;

    .line 14464
    invoke-static {v0, p0}, Ll/ۘᩴۖ;->ۧ(Ll/۫֡ۖ;Ljava/io/InputStream;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/᩹۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/᩹۠᩻;
    .locals 1

    .line 14470
    sget-object v0, Ll/᩹۠᩻;->PARSER:Ll/۫֡ۖ;

    .line 14471
    invoke-static {v0, p0, p1}, Ll/ۘᩴۖ;->ۧ(Ll/۫֡ۖ;Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/᩹۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Ll/᩹۠᩻;
    .locals 1

    .line 14432
    sget-object v0, Ll/᩹۠᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0}, Ll/۫֡ۖ;->parseFrom(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩹۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Ll/ᩳۘۖ;)Ll/᩹۠᩻;
    .locals 1

    .line 14438
    sget-object v0, Ll/᩹۠᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0, p1}, Ll/۫֡ۖ;->parseFrom(Ljava/nio/ByteBuffer;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩹۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/ۛۜۖ;)Ll/᩹۠᩻;
    .locals 1

    .line 14443
    sget-object v0, Ll/᩹۠᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0}, Ll/۫֡ۖ;->parseFrom(Ll/ۛۜۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩹۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ll/᩹۠᩻;
    .locals 1

    .line 14449
    sget-object v0, Ll/᩹۠᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0, p1}, Ll/۫֡ۖ;->parseFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩹۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/۟ۜۖ;)Ll/᩹۠᩻;
    .locals 1

    .line 14490
    sget-object v0, Ll/᩹۠᩻;->PARSER:Ll/۫֡ۖ;

    .line 14491
    invoke-static {v0, p0}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ll/۟ۜۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/᩹۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩹۠᩻;
    .locals 1

    .line 14497
    sget-object v0, Ll/᩹۠᩻;->PARSER:Ll/۫֡ۖ;

    .line 14498
    invoke-static {v0, p0, p1}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/᩹۠᩻;

    return-object p0
.end method

.method public static parseFrom([B)Ll/᩹۠᩻;
    .locals 1

    .line 14453
    sget-object v0, Ll/᩹۠᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0}, Ll/۫֡ۖ;->parseFrom([B)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩹۠᩻;

    return-object p0
.end method

.method public static parseFrom([BLl/ᩳۘۖ;)Ll/᩹۠᩻;
    .locals 1

    .line 14459
    sget-object v0, Ll/᩹۠᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0, p1}, Ll/۫֡ۖ;->parseFrom([BLl/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩹۠᩻;

    return-object p0
.end method

.method public static parser()Ll/۫֡ۖ;
    .locals 1

    .line 15777
    sget-object v0, Ll/᩹۠᩻;->PARSER:Ll/۫֡ۖ;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 14345
    :cond_0
    instance-of v1, p1, Ll/᩹۠᩻;

    if-nez v1, :cond_1

    .line 14346
    invoke-super {p0, p1}, Ll/ۡۜۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 14348
    :cond_1
    check-cast p1, Ll/᩹۠᩻;

    .line 14350
    invoke-virtual {p0}, Ll/᩹۠᩻;->getGroupsList()Ljava/util/List;

    move-result-object v1

    .line 14351
    invoke-virtual {p1}, Ll/᩹۠᩻;->getGroupsList()Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    return v2

    .line 14352
    :cond_2
    invoke-virtual {p0}, Ll/᩹۠᩻;->hasSnapshotEnabled()Z

    move-result v1

    invoke-virtual {p1}, Ll/᩹۠᩻;->hasSnapshotEnabled()Z

    move-result v3

    if-eq v1, v3, :cond_3

    return v2

    .line 14353
    :cond_3
    invoke-virtual {p0}, Ll/᩹۠᩻;->hasSnapshotEnabled()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 14354
    invoke-virtual {p0}, Ll/᩹۠᩻;->getSnapshotEnabled()Z

    move-result v1

    .line 14355
    invoke-virtual {p1}, Ll/᩹۠᩻;->getSnapshotEnabled()Z

    move-result v3

    if-eq v1, v3, :cond_4

    return v2

    .line 14357
    :cond_4
    invoke-virtual {p0}, Ll/᩹۠᩻;->hasVabcEnabled()Z

    move-result v1

    invoke-virtual {p1}, Ll/᩹۠᩻;->hasVabcEnabled()Z

    move-result v3

    if-eq v1, v3, :cond_5

    return v2

    .line 14358
    :cond_5
    invoke-virtual {p0}, Ll/᩹۠᩻;->hasVabcEnabled()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 14359
    invoke-virtual {p0}, Ll/᩹۠᩻;->getVabcEnabled()Z

    move-result v1

    .line 14360
    invoke-virtual {p1}, Ll/᩹۠᩻;->getVabcEnabled()Z

    move-result v3

    if-eq v1, v3, :cond_6

    return v2

    .line 14362
    :cond_6
    invoke-virtual {p0}, Ll/᩹۠᩻;->hasVabcCompressionParam()Z

    move-result v1

    invoke-virtual {p1}, Ll/᩹۠᩻;->hasVabcCompressionParam()Z

    move-result v3

    if-eq v1, v3, :cond_7

    return v2

    .line 14363
    :cond_7
    invoke-virtual {p0}, Ll/᩹۠᩻;->hasVabcCompressionParam()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 14364
    invoke-virtual {p0}, Ll/᩹۠᩻;->getVabcCompressionParam()Ljava/lang/String;

    move-result-object v1

    .line 14365
    invoke-virtual {p1}, Ll/᩹۠᩻;->getVabcCompressionParam()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    .line 14367
    :cond_8
    invoke-virtual {p0}, Ll/᩹۠᩻;->hasCowVersion()Z

    move-result v1

    invoke-virtual {p1}, Ll/᩹۠᩻;->hasCowVersion()Z

    move-result v3

    if-eq v1, v3, :cond_9

    return v2

    .line 14368
    :cond_9
    invoke-virtual {p0}, Ll/᩹۠᩻;->hasCowVersion()Z

    move-result v1

    if-eqz v1, :cond_a

    .line 14369
    invoke-virtual {p0}, Ll/᩹۠᩻;->getCowVersion()I

    move-result v1

    .line 14370
    invoke-virtual {p1}, Ll/᩹۠᩻;->getCowVersion()I

    move-result v3

    if-eq v1, v3, :cond_a

    return v2

    .line 14372
    :cond_a
    invoke-virtual {p0}, Ll/᩹۠᩻;->hasVabcFeatureSet()Z

    move-result v1

    invoke-virtual {p1}, Ll/᩹۠᩻;->hasVabcFeatureSet()Z

    move-result v3

    if-eq v1, v3, :cond_b

    return v2

    .line 14373
    :cond_b
    invoke-virtual {p0}, Ll/᩹۠᩻;->hasVabcFeatureSet()Z

    move-result v1

    if-eqz v1, :cond_c

    .line 14374
    invoke-virtual {p0}, Ll/᩹۠᩻;->getVabcFeatureSet()Ll/ܶܶ᩻;

    move-result-object v1

    .line 14375
    invoke-virtual {p1}, Ll/᩹۠᩻;->getVabcFeatureSet()Ll/ܶܶ᩻;

    move-result-object v3

    invoke-virtual {v1, v3}, Ll/ܶܶ᩻;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    .line 14377
    :cond_c
    invoke-virtual {p0}, Ll/᩹۠᩻;->hasCompressionFactor()Z

    move-result v1

    invoke-virtual {p1}, Ll/᩹۠᩻;->hasCompressionFactor()Z

    move-result v3

    if-eq v1, v3, :cond_d

    return v2

    .line 14378
    :cond_d
    invoke-virtual {p0}, Ll/᩹۠᩻;->hasCompressionFactor()Z

    move-result v1

    if-eqz v1, :cond_e

    .line 14379
    invoke-virtual {p0}, Ll/᩹۠᩻;->getCompressionFactor()J

    move-result-wide v3

    .line 14380
    invoke-virtual {p1}, Ll/᩹۠᩻;->getCompressionFactor()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-eqz v1, :cond_e

    return v2

    .line 14382
    :cond_e
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/ۢ֨ۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_f

    return v2

    :cond_f
    return v0
.end method

.method public getCompressionFactor()J
    .locals 2

    .line 14255
    iget-wide v0, p0, Ll/᩹۠᩻;->compressionFactor_:J

    return-wide v0
.end method

.method public getCowVersion()I
    .locals 1

    .line 14188
    iget v0, p0, Ll/᩹۠᩻;->cowVersion_:I

    return v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 13906
    invoke-virtual {p0}, Ll/᩹۠᩻;->getDefaultInstanceForType()Ll/᩹۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Ll/᩹۠᩻;
    .locals 1

    .line 15787
    sget-object v0, Ll/᩹۠᩻;->DEFAULT_INSTANCE:Ll/᩹۠᩻;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 13906
    invoke-virtual {p0}, Ll/᩹۠᩻;->getDefaultInstanceForType()Ll/᩹۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public getGroups(I)Ll/ۚ۠᩻;
    .locals 1

    .line 14009
    iget-object v0, p0, Ll/᩹۠᩻;->groups_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚ۠᩻;

    return-object p1
.end method

.method public getGroupsCount()I
    .locals 1

    .line 13993
    iget-object v0, p0, Ll/᩹۠᩻;->groups_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getGroupsList()Ljava/util/List;
    .locals 1

    .line 13960
    iget-object v0, p0, Ll/᩹۠᩻;->groups_:Ljava/util/List;

    return-object v0
.end method

.method public getGroupsOrBuilder(I)Ll/۠۠᩻;
    .locals 1

    .line 14026
    iget-object v0, p0, Ll/᩹۠᩻;->groups_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۠۠᩻;

    return-object p1
.end method

.method public getGroupsOrBuilderList()Ljava/util/List;
    .locals 1

    .line 13977
    iget-object v0, p0, Ll/᩹۠᩻;->groups_:Ljava/util/List;

    return-object v0
.end method

.method public getParserForType()Ll/۫֡ۖ;
    .locals 1

    .line 15782
    sget-object v0, Ll/᩹۠᩻;->PARSER:Ll/۫֡ۖ;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 4

    .line 14304
    iget v0, p0, Ll/ۡۜۖ;->memoizedSize:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 14308
    :goto_0
    iget-object v2, p0, Ll/᩹۠᩻;->groups_:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-ge v0, v2, :cond_1

    .line 14309
    iget-object v2, p0, Ll/᩹۠᩻;->groups_:Ljava/util/List;

    .line 14310
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۡ֡ۖ;

    invoke-static {v3, v2}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 14312
    :cond_1
    iget v0, p0, Ll/᩹۠᩻;->bitField0_:I

    and-int/2addr v0, v3

    const/4 v2, 0x2

    if-eqz v0, :cond_2

    .line 14314
    invoke-static {v2}, Ll/ܳ᩷ۖ;->ᩳ(I)I

    move-result v0

    add-int/2addr v1, v0

    .line 14316
    :cond_2
    iget v0, p0, Ll/᩹۠᩻;->bitField0_:I

    and-int/2addr v0, v2

    if-eqz v0, :cond_3

    const/4 v0, 0x3

    .line 14318
    invoke-static {v0}, Ll/ܳ᩷ۖ;->ᩳ(I)I

    move-result v0

    add-int/2addr v1, v0

    .line 14320
    :cond_3
    iget v0, p0, Ll/᩹۠᩻;->bitField0_:I

    const/4 v2, 0x4

    and-int/2addr v0, v2

    if-eqz v0, :cond_4

    .line 14321
    iget-object v0, p0, Ll/᩹۠᩻;->vabcCompressionParam_:Ljava/lang/Object;

    invoke-static {v2, v0}, Ll/ۘᩴۖ;->֫(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    .line 14323
    :cond_4
    iget v0, p0, Ll/᩹۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_5

    const/4 v0, 0x5

    .line 14324
    iget v2, p0, Ll/᩹۠᩻;->cowVersion_:I

    .line 14325
    invoke-static {v0, v2}, Ll/ܳ᩷ۖ;->᩻(II)I

    move-result v0

    add-int/2addr v1, v0

    .line 14327
    :cond_5
    iget v0, p0, Ll/᩹۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_6

    const/4 v0, 0x6

    .line 14329
    invoke-virtual {p0}, Ll/᩹۠᩻;->getVabcFeatureSet()Ll/ܶܶ᩻;

    move-result-object v2

    invoke-static {v0, v2}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v0

    add-int/2addr v1, v0

    .line 14331
    :cond_6
    iget v0, p0, Ll/᩹۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_7

    const/4 v0, 0x7

    .line 14332
    iget-wide v2, p0, Ll/᩹۠᩻;->compressionFactor_:J

    .line 14333
    invoke-static {v0, v2, v3}, Ll/ܳ᩷ۖ;->ᩳ(IJ)I

    move-result v0

    add-int/2addr v1, v0

    .line 14335
    :cond_7
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢ֨ۖ;->getSerializedSize()I

    move-result v0

    add-int/2addr v0, v1

    .line 14336
    iput v0, p0, Ll/ۡۜۖ;->memoizedSize:I

    return v0
.end method

.method public getSnapshotEnabled()Z
    .locals 1

    .line 14059
    iget-boolean v0, p0, Ll/᩹۠᩻;->snapshotEnabled_:Z

    return v0
.end method

.method public getVabcCompressionParam()Ljava/lang/String;
    .locals 2

    .line 14124
    iget-object v0, p0, Ll/᩹۠᩻;->vabcCompressionParam_:Ljava/lang/Object;

    .line 14125
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 14126
    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 14128
    :cond_0
    check-cast v0, Ll/ۛۜۖ;

    .line 14130
    invoke-virtual {v0}, Ll/ۛۜۖ;->ܳ()Ljava/lang/String;

    move-result-object v1

    .line 14131
    invoke-virtual {v0}, Ll/ۛۜۖ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 14132
    iput-object v1, p0, Ll/᩹۠᩻;->vabcCompressionParam_:Ljava/lang/Object;

    :cond_1
    return-object v1
.end method

.method public getVabcCompressionParamBytes()Ll/ۛۜۖ;
    .locals 2

    .line 14150
    iget-object v0, p0, Ll/᩹۠᩻;->vabcCompressionParam_:Ljava/lang/Object;

    .line 14151
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 14152
    check-cast v0, Ljava/lang/String;

    .line 14153
    invoke-static {v0}, Ll/ۛۜۖ;->֫(Ljava/lang/String;)Ll/ۛۜۖ;

    move-result-object v0

    .line 14155
    iput-object v0, p0, Ll/᩹۠᩻;->vabcCompressionParam_:Ljava/lang/Object;

    return-object v0

    .line 14158
    :cond_0
    check-cast v0, Ll/ۛۜۖ;

    return-object v0
.end method

.method public getVabcEnabled()Z
    .locals 1

    .line 14092
    iget-boolean v0, p0, Ll/᩹۠᩻;->vabcEnabled_:Z

    return v0
.end method

.method public getVabcFeatureSet()Ll/ܶܶ᩻;
    .locals 1

    .line 14215
    iget-object v0, p0, Ll/᩹۠᩻;->vabcFeatureSet_:Ll/ܶܶ᩻;

    if-nez v0, :cond_0

    invoke-static {}, Ll/ܶܶ᩻;->getDefaultInstance()Ll/ܶܶ᩻;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getVabcFeatureSetOrBuilder()Ll/᩹ܶ᩻;
    .locals 1

    .line 14226
    iget-object v0, p0, Ll/᩹۠᩻;->vabcFeatureSet_:Ll/ܶܶ᩻;

    if-nez v0, :cond_0

    invoke-static {}, Ll/ܶܶ᩻;->getDefaultInstance()Ll/ܶܶ᩻;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public hasCompressionFactor()Z
    .locals 1

    .line 14242
    iget v0, p0, Ll/᩹۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasCowVersion()Z
    .locals 1

    .line 14175
    iget v0, p0, Ll/᩹۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasSnapshotEnabled()Z
    .locals 2

    .line 14044
    iget v0, p0, Ll/᩹۠᩻;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasVabcCompressionParam()Z
    .locals 1

    .line 14110
    iget v0, p0, Ll/᩹۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasVabcEnabled()Z
    .locals 1

    .line 14077
    iget v0, p0, Ll/᩹۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasVabcFeatureSet()Z
    .locals 1

    .line 14203
    iget v0, p0, Ll/᩹۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 4

    .line 14388
    iget v0, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    if-eqz v0, :cond_0

    return v0

    .line 14392
    :cond_0
    invoke-static {}, Ll/᩹۠᩻;->getDescriptor()Ll/ᩳۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x30b

    .line 14393
    invoke-virtual {p0}, Ll/᩹۠᩻;->getGroupsCount()I

    move-result v1

    const/16 v2, 0x35

    const/16 v3, 0x25

    if-lez v1, :cond_1

    const/4 v1, 0x1

    .line 14394
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 14395
    invoke-virtual {p0}, Ll/᩹۠᩻;->getGroupsList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 14397
    :cond_1
    invoke-virtual {p0}, Ll/᩹۠᩻;->hasSnapshotEnabled()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    .line 14398
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 14400
    invoke-virtual {p0}, Ll/᩹۠᩻;->getSnapshotEnabled()Z

    move-result v1

    .line 14399
    invoke-static {v1}, Ll/ܰᩴۖ;->֫(Z)I

    move-result v1

    add-int/2addr v0, v1

    .line 14402
    :cond_2
    invoke-virtual {p0}, Ll/᩹۠᩻;->hasVabcEnabled()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x3

    .line 14403
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 14405
    invoke-virtual {p0}, Ll/᩹۠᩻;->getVabcEnabled()Z

    move-result v1

    .line 14404
    invoke-static {v1}, Ll/ܰᩴۖ;->֫(Z)I

    move-result v1

    add-int/2addr v0, v1

    .line 14407
    :cond_3
    invoke-virtual {p0}, Ll/᩹۠᩻;->hasVabcCompressionParam()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x4

    .line 14408
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 14409
    invoke-virtual {p0}, Ll/᩹۠᩻;->getVabcCompressionParam()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 14411
    :cond_4
    invoke-virtual {p0}, Ll/᩹۠᩻;->hasCowVersion()Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v1, 0x5

    .line 14412
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 14413
    invoke-virtual {p0}, Ll/᩹۠᩻;->getCowVersion()I

    move-result v1

    add-int/2addr v0, v1

    .line 14415
    :cond_5
    invoke-virtual {p0}, Ll/᩹۠᩻;->hasVabcFeatureSet()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, 0x6

    .line 14416
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 14417
    invoke-virtual {p0}, Ll/᩹۠᩻;->getVabcFeatureSet()Ll/ܶܶ᩻;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܶܶ᩻;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 14419
    :cond_6
    invoke-virtual {p0}, Ll/᩹۠᩻;->hasCompressionFactor()Z

    move-result v1

    if-eqz v1, :cond_7

    const/4 v1, 0x7

    .line 14420
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 14422
    invoke-virtual {p0}, Ll/᩹۠᩻;->getCompressionFactor()J

    move-result-wide v1

    .line 14421
    invoke-static {v1, v2}, Ll/ܰᩴۖ;->֫(J)I

    move-result v1

    add-int/2addr v0, v1

    :cond_7
    mul-int/lit8 v0, v0, 0x1d

    .line 14424
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    .line 14425
    iput v1, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    return v1
.end method

.method public internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 13937
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_DynamicPartitionMetadata_fieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/᩹۠᩻;

    const-class v2, Ll/᩸۠᩻;

    .line 13938
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 4

    .line 14261
    iget-byte v0, p0, Ll/᩹۠᩻;->memoizedIsInitialized:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    const/4 v0, 0x0

    .line 14265
    :goto_0
    invoke-virtual {p0}, Ll/᩹۠᩻;->getGroupsCount()I

    move-result v3

    if-ge v0, v3, :cond_3

    .line 14266
    invoke-virtual {p0, v0}, Ll/᩹۠᩻;->getGroups(I)Ll/ۚ۠᩻;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۚ۠᩻;->isInitialized()Z

    move-result v3

    if-nez v3, :cond_2

    .line 14267
    iput-byte v2, p0, Ll/᩹۠᩻;->memoizedIsInitialized:B

    return v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 14271
    :cond_3
    iput-byte v1, p0, Ll/᩹۠᩻;->memoizedIsInitialized:B

    return v1
.end method

.method public bridge synthetic newBuilderForType()Ll/ۢ֡ۖ;
    .locals 1

    .line 13906
    invoke-virtual {p0}, Ll/᩹۠᩻;->newBuilderForType()Ll/᩸۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Ll/ܳ֡ۖ;
    .locals 1

    .line 13906
    invoke-virtual {p0}, Ll/᩹۠᩻;->newBuilderForType()Ll/᩸۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Ll/ۢۜۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 13906
    invoke-virtual {p0, p1}, Ll/᩹۠᩻;->newBuilderForType(Ll/ۢۜۖ;)Ll/᩸۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public newBuilderForType()Ll/᩸۠᩻;
    .locals 1

    .line 14502
    invoke-static {}, Ll/᩹۠᩻;->newBuilder()Ll/᩸۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType(Ll/ۢۜۖ;)Ll/᩸۠᩻;
    .locals 2

    .line 14518
    new-instance v0, Ll/᩸۠᩻;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/᩸۠᩻;-><init>(Ll/ۢۜۖ;I)V

    return-object v0
.end method

.method public bridge synthetic toBuilder()Ll/ۢ֡ۖ;
    .locals 1

    .line 13906
    invoke-virtual {p0}, Ll/᩹۠᩻;->toBuilder()Ll/᩸۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Ll/ܳ֡ۖ;
    .locals 1

    .line 13906
    invoke-virtual {p0}, Ll/᩹۠᩻;->toBuilder()Ll/᩸۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Ll/᩸۠᩻;
    .locals 2

    .line 14511
    sget-object v0, Ll/᩹۠᩻;->DEFAULT_INSTANCE:Ll/᩹۠᩻;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    .line 14512
    new-instance v0, Ll/᩸۠᩻;

    invoke-direct {v0, v1}, Ll/᩸۠᩻;-><init>(I)V

    return-object v0

    :cond_0
    new-instance v0, Ll/᩸۠᩻;

    invoke-direct {v0, v1}, Ll/᩸۠᩻;-><init>(I)V

    invoke-virtual {v0, p0}, Ll/᩸۠᩻;->mergeFrom(Ll/᩹۠᩻;)Ll/᩸۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Ll/ܳ᩷ۖ;)V
    .locals 3

    const/4 v0, 0x0

    .line 14278
    :goto_0
    iget-object v1, p0, Ll/᩹۠᩻;->groups_:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ge v0, v1, :cond_0

    .line 14279
    iget-object v1, p0, Ll/᩹۠᩻;->groups_:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡ֡ۖ;

    invoke-virtual {p1, v2, v1}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 14281
    :cond_0
    iget v0, p0, Ll/᩹۠᩻;->bitField0_:I

    and-int/2addr v0, v2

    const/4 v1, 0x2

    if-eqz v0, :cond_1

    .line 14282
    iget-boolean v0, p0, Ll/᩹۠᩻;->snapshotEnabled_:Z

    invoke-virtual {p1, v1, v0}, Ll/ܳ᩷ۖ;->֫(IZ)V

    .line 14284
    :cond_1
    iget v0, p0, Ll/᩹۠᩻;->bitField0_:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_2

    const/4 v0, 0x3

    .line 14285
    iget-boolean v1, p0, Ll/᩹۠᩻;->vabcEnabled_:Z

    invoke-virtual {p1, v0, v1}, Ll/ܳ᩷ۖ;->֫(IZ)V

    .line 14287
    :cond_2
    iget v0, p0, Ll/᩹۠᩻;->bitField0_:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-eqz v0, :cond_3

    .line 14288
    iget-object v0, p0, Ll/᩹۠᩻;->vabcCompressionParam_:Ljava/lang/Object;

    invoke-static {p1, v1, v0}, Ll/ۘᩴۖ;->֫(Ll/ܳ᩷ۖ;ILjava/lang/Object;)V

    .line 14290
    :cond_3
    iget v0, p0, Ll/᩹۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_4

    const/4 v0, 0x5

    .line 14291
    iget v1, p0, Ll/᩹۠᩻;->cowVersion_:I

    invoke-virtual {p1, v0, v1}, Ll/ܳ᩷ۖ;->ᩳ(II)V

    .line 14293
    :cond_4
    iget v0, p0, Ll/᩹۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_5

    const/4 v0, 0x6

    .line 14294
    invoke-virtual {p0}, Ll/᩹۠᩻;->getVabcFeatureSet()Ll/ܶܶ᩻;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    .line 14296
    :cond_5
    iget v0, p0, Ll/᩹۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_6

    const/4 v0, 0x7

    .line 14297
    iget-wide v1, p0, Ll/᩹۠᩻;->compressionFactor_:J

    invoke-virtual {p1, v0, v1, v2}, Ll/ܳ᩷ۖ;->ۧ(IJ)V

    .line 14299
    :cond_6
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۢ֨ۖ;->writeTo(Ll/ܳ᩷ۖ;)V

    return-void
.end method
