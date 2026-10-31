.class public final Ll/֫ܶ᩻;
.super Ll/ۘᩴۖ;
.source "C9PC"

# interfaces
.implements Ll/ܽܶ᩻;


# static fields
.field public static final DATA_LENGTH_FIELD_NUMBER:I = 0x3

.field public static final DATA_OFFSET_FIELD_NUMBER:I = 0x2

.field public static final DATA_SHA256_HASH_FIELD_NUMBER:I = 0x8

.field public static final DEFAULT_INSTANCE:Ll/֫ܶ᩻;

.field public static final DST_EXTENTS_FIELD_NUMBER:I = 0x6

.field public static final DST_LENGTH_FIELD_NUMBER:I = 0x7

.field public static final PARSER:Ll/۫֡ۖ;

.field public static final SRC_EXTENTS_FIELD_NUMBER:I = 0x4

.field public static final SRC_LENGTH_FIELD_NUMBER:I = 0x5

.field public static final SRC_SHA256_HASH_FIELD_NUMBER:I = 0x9

.field public static final TYPE_FIELD_NUMBER:I = 0x1

.field public static final serialVersionUID:J


# instance fields
.field public bitField0_:I

.field public dataLength_:J

.field public dataOffset_:J

.field public dataSha256Hash_:Ll/ۛۜۖ;

.field public dstExtents_:Ljava/util/List;

.field public dstLength_:J

.field public memoizedIsInitialized:B

.field public srcExtents_:Ljava/util/List;

.field public srcLength_:J

.field public srcSha256Hash_:Ll/ۛۜۖ;

.field public type_:I


# direct methods
.method public static bridge synthetic -$$Nest$fgetbitField0_(Ll/֫ܶ᩻;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/֫ܶ᩻;->bitField0_:I

    return p0
.end method

.method public static bridge synthetic -$$Nest$fgetdstExtents_(Ll/֫ܶ᩻;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫ܶ᩻;->dstExtents_:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic -$$Nest$fgetsrcExtents_(Ll/֫ܶ᩻;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫ܶ᩻;->srcExtents_:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic -$$Nest$fputbitField0_(ILl/֫ܶ᩻;)V
    .locals 0

    .line 0
    iput p0, p1, Ll/֫ܶ᩻;->bitField0_:I

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputdataLength_(Ll/֫ܶ᩻;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/֫ܶ᩻;->dataLength_:J

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputdataOffset_(Ll/֫ܶ᩻;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/֫ܶ᩻;->dataOffset_:J

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputdataSha256Hash_(Ll/֫ܶ᩻;Ll/ۛۜۖ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/֫ܶ᩻;->dataSha256Hash_:Ll/ۛۜۖ;

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputdstExtents_(Ll/֫ܶ᩻;Ljava/util/List;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/֫ܶ᩻;->dstExtents_:Ljava/util/List;

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputdstLength_(Ll/֫ܶ᩻;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/֫ܶ᩻;->dstLength_:J

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputsrcExtents_(Ll/֫ܶ᩻;Ljava/util/List;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/֫ܶ᩻;->srcExtents_:Ljava/util/List;

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputsrcLength_(Ll/֫ܶ᩻;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/֫ܶ᩻;->srcLength_:J

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputsrcSha256Hash_(Ll/֫ܶ᩻;Ll/ۛۜۖ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/֫ܶ᩻;->srcSha256Hash_:Ll/ۛۜۖ;

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputtype_(ILl/֫ܶ᩻;)V
    .locals 0

    .line 0
    iput p0, p1, Ll/֫ܶ᩻;->type_:I

    return-void
.end method

.method public static constructor <clinit>()V
    .locals 2

    .line 2949
    sget-object v0, Ll/ۜۚۖ;->᩶:Ll/ۜۚۖ;

    const-class v1, Ll/֫ܶ᩻;

    .line 2955
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    .line 2949
    invoke-static {v0, v1}, Ll/᩷ۚۖ;->֫(Ll/ۜۚۖ;Ljava/lang/String;)V

    .line 5247
    new-instance v0, Ll/֫ܶ᩻;

    invoke-direct {v0}, Ll/֫ܶ᩻;-><init>()V

    sput-object v0, Ll/֫ܶ᩻;->DEFAULT_INSTANCE:Ll/֫ܶ᩻;

    .line 5255
    new-instance v0, Ll/ۨ۠᩻;

    invoke-direct {v0}, Ll/ۨ۠᩻;-><init>()V

    sput-object v0, Ll/֫ܶ᩻;->PARSER:Ll/۫֡ۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 2961
    invoke-direct {p0}, Ll/ۘᩴۖ;-><init>()V

    const/4 v0, 0x0

    .line 3314
    iput v0, p0, Ll/֫ܶ᩻;->type_:I

    const-wide/16 v1, 0x0

    .line 3332
    iput-wide v1, p0, Ll/֫ܶ᩻;->dataOffset_:J

    .line 3365
    iput-wide v1, p0, Ll/֫ܶ᩻;->dataLength_:J

    .line 3453
    iput-wide v1, p0, Ll/֫ܶ᩻;->srcLength_:J

    .line 3527
    iput-wide v1, p0, Ll/֫ܶ᩻;->dstLength_:J

    .line 3558
    sget-object v1, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    iput-object v1, p0, Ll/֫ܶ᩻;->dataSha256Hash_:Ll/ۛۜۖ;

    .line 3593
    iput-object v1, p0, Ll/֫ܶ᩻;->srcSha256Hash_:Ll/ۛۜۖ;

    const/4 v2, -0x1

    .line 3623
    iput-byte v2, p0, Ll/֫ܶ᩻;->memoizedIsInitialized:B

    .line 2962
    iput v0, p0, Ll/֫ܶ᩻;->type_:I

    .line 2963
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/֫ܶ᩻;->srcExtents_:Ljava/util/List;

    .line 2964
    iput-object v0, p0, Ll/֫ܶ᩻;->dstExtents_:Ljava/util/List;

    .line 2965
    iput-object v1, p0, Ll/֫ܶ᩻;->dataSha256Hash_:Ll/ۛۜۖ;

    .line 2966
    iput-object v1, p0, Ll/֫ܶ᩻;->srcSha256Hash_:Ll/ۛۜۖ;

    return-void
.end method

.method public constructor <init>(Ll/᩶ۘۖ;)V
    .locals 2

    .line 2959
    invoke-direct {p0, p1}, Ll/ۘᩴۖ;-><init>(Ll/᩶ۘۖ;)V

    const/4 p1, 0x0

    .line 3314
    iput p1, p0, Ll/֫ܶ᩻;->type_:I

    const-wide/16 v0, 0x0

    .line 3332
    iput-wide v0, p0, Ll/֫ܶ᩻;->dataOffset_:J

    .line 3365
    iput-wide v0, p0, Ll/֫ܶ᩻;->dataLength_:J

    .line 3453
    iput-wide v0, p0, Ll/֫ܶ᩻;->srcLength_:J

    .line 3527
    iput-wide v0, p0, Ll/֫ܶ᩻;->dstLength_:J

    .line 3558
    sget-object p1, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    iput-object p1, p0, Ll/֫ܶ᩻;->dataSha256Hash_:Ll/ۛۜۖ;

    .line 3593
    iput-object p1, p0, Ll/֫ܶ᩻;->srcSha256Hash_:Ll/ۛۜۖ;

    const/4 p1, -0x1

    .line 3623
    iput-byte p1, p0, Ll/֫ܶ᩻;->memoizedIsInitialized:B

    return-void
.end method

.method public synthetic constructor <init>(Ll/᩺۠᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/֫ܶ᩻;-><init>(Ll/᩶ۘۖ;)V

    return-void
.end method

.method public static synthetic access$100()Z
    .locals 1

    .line 2943
    sget-boolean v0, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method public static synthetic access$200()Z
    .locals 1

    .line 2943
    sget-boolean v0, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method public static getDefaultInstance()Ll/֫ܶ᩻;
    .locals 1

    .line 5251
    sget-object v0, Ll/֫ܶ᩻;->DEFAULT_INSTANCE:Ll/֫ܶ᩻;

    return-object v0
.end method

.method public static final getDescriptor()Ll/ᩳۖۖ;
    .locals 1

    .line 2971
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_InstallOperation_descriptor()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder()Ll/᩺۠᩻;
    .locals 1

    .line 3897
    sget-object v0, Ll/֫ܶ᩻;->DEFAULT_INSTANCE:Ll/֫ܶ᩻;

    invoke-virtual {v0}, Ll/֫ܶ᩻;->toBuilder()Ll/᩺۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Ll/֫ܶ᩻;)Ll/᩺۠᩻;
    .locals 1

    .line 3900
    sget-object v0, Ll/֫ܶ᩻;->DEFAULT_INSTANCE:Ll/֫ܶ᩻;

    invoke-virtual {v0}, Ll/֫ܶ᩻;->toBuilder()Ll/᩺۠᩻;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/᩺۠᩻;->mergeFrom(Ll/֫ܶ᩻;)Ll/᩺۠᩻;

    move-result-object p0

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Ll/֫ܶ᩻;
    .locals 1

    .line 3869
    sget-object v0, Ll/֫ܶ᩻;->PARSER:Ll/۫֡ۖ;

    .line 3870
    invoke-static {v0, p0}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ljava/io/InputStream;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/֫ܶ᩻;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/֫ܶ᩻;
    .locals 1

    .line 3877
    sget-object v0, Ll/֫ܶ᩻;->PARSER:Ll/۫֡ۖ;

    .line 3878
    invoke-static {v0, p0, p1}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/֫ܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Ll/֫ܶ᩻;
    .locals 1

    .line 3856
    sget-object v0, Ll/֫ܶ᩻;->PARSER:Ll/۫֡ۖ;

    .line 3857
    invoke-static {v0, p0}, Ll/ۘᩴۖ;->ۧ(Ll/۫֡ۖ;Ljava/io/InputStream;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/֫ܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/֫ܶ᩻;
    .locals 1

    .line 3863
    sget-object v0, Ll/֫ܶ᩻;->PARSER:Ll/۫֡ۖ;

    .line 3864
    invoke-static {v0, p0, p1}, Ll/ۘᩴۖ;->ۧ(Ll/۫֡ۖ;Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/֫ܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Ll/֫ܶ᩻;
    .locals 1

    .line 3825
    sget-object v0, Ll/֫ܶ᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0}, Ll/۫֡ۖ;->parseFrom(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/֫ܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Ll/ᩳۘۖ;)Ll/֫ܶ᩻;
    .locals 1

    .line 3831
    sget-object v0, Ll/֫ܶ᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0, p1}, Ll/۫֡ۖ;->parseFrom(Ljava/nio/ByteBuffer;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/֫ܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/ۛۜۖ;)Ll/֫ܶ᩻;
    .locals 1

    .line 3836
    sget-object v0, Ll/֫ܶ᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0}, Ll/۫֡ۖ;->parseFrom(Ll/ۛۜۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/֫ܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ll/֫ܶ᩻;
    .locals 1

    .line 3842
    sget-object v0, Ll/֫ܶ᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0, p1}, Ll/۫֡ۖ;->parseFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/֫ܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/۟ۜۖ;)Ll/֫ܶ᩻;
    .locals 1

    .line 3883
    sget-object v0, Ll/֫ܶ᩻;->PARSER:Ll/۫֡ۖ;

    .line 3884
    invoke-static {v0, p0}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ll/۟ۜۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/֫ܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/֫ܶ᩻;
    .locals 1

    .line 3890
    sget-object v0, Ll/֫ܶ᩻;->PARSER:Ll/۫֡ۖ;

    .line 3891
    invoke-static {v0, p0, p1}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/֫ܶ᩻;

    return-object p0
.end method

.method public static parseFrom([B)Ll/֫ܶ᩻;
    .locals 1

    .line 3846
    sget-object v0, Ll/֫ܶ᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0}, Ll/۫֡ۖ;->parseFrom([B)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/֫ܶ᩻;

    return-object p0
.end method

.method public static parseFrom([BLl/ᩳۘۖ;)Ll/֫ܶ᩻;
    .locals 1

    .line 3852
    sget-object v0, Ll/֫ܶ᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0, p1}, Ll/۫֡ۖ;->parseFrom([BLl/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/֫ܶ᩻;

    return-object p0
.end method

.method public static parser()Ll/۫֡ۖ;
    .locals 1

    .line 5277
    sget-object v0, Ll/֫ܶ᩻;->PARSER:Ll/۫֡ۖ;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 3723
    :cond_0
    instance-of v1, p1, Ll/֫ܶ᩻;

    if-nez v1, :cond_1

    .line 3724
    invoke-super {p0, p1}, Ll/ۡۜۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 3726
    :cond_1
    check-cast p1, Ll/֫ܶ᩻;

    .line 3728
    invoke-virtual {p0}, Ll/֫ܶ᩻;->hasType()Z

    move-result v1

    invoke-virtual {p1}, Ll/֫ܶ᩻;->hasType()Z

    move-result v2

    const/4 v3, 0x0

    if-eq v1, v2, :cond_2

    return v3

    .line 3729
    :cond_2
    invoke-virtual {p0}, Ll/֫ܶ᩻;->hasType()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 3730
    iget v1, p0, Ll/֫ܶ᩻;->type_:I

    iget v2, p1, Ll/֫ܶ᩻;->type_:I

    if-eq v1, v2, :cond_3

    return v3

    .line 3732
    :cond_3
    invoke-virtual {p0}, Ll/֫ܶ᩻;->hasDataOffset()Z

    move-result v1

    invoke-virtual {p1}, Ll/֫ܶ᩻;->hasDataOffset()Z

    move-result v2

    if-eq v1, v2, :cond_4

    return v3

    .line 3733
    :cond_4
    invoke-virtual {p0}, Ll/֫ܶ᩻;->hasDataOffset()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 3734
    invoke-virtual {p0}, Ll/֫ܶ᩻;->getDataOffset()J

    move-result-wide v1

    .line 3735
    invoke-virtual {p1}, Ll/֫ܶ᩻;->getDataOffset()J

    move-result-wide v4

    cmp-long v6, v1, v4

    if-eqz v6, :cond_5

    return v3

    .line 3737
    :cond_5
    invoke-virtual {p0}, Ll/֫ܶ᩻;->hasDataLength()Z

    move-result v1

    invoke-virtual {p1}, Ll/֫ܶ᩻;->hasDataLength()Z

    move-result v2

    if-eq v1, v2, :cond_6

    return v3

    .line 3738
    :cond_6
    invoke-virtual {p0}, Ll/֫ܶ᩻;->hasDataLength()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 3739
    invoke-virtual {p0}, Ll/֫ܶ᩻;->getDataLength()J

    move-result-wide v1

    .line 3740
    invoke-virtual {p1}, Ll/֫ܶ᩻;->getDataLength()J

    move-result-wide v4

    cmp-long v6, v1, v4

    if-eqz v6, :cond_7

    return v3

    .line 3742
    :cond_7
    invoke-virtual {p0}, Ll/֫ܶ᩻;->getSrcExtentsList()Ljava/util/List;

    move-result-object v1

    .line 3743
    invoke-virtual {p1}, Ll/֫ܶ᩻;->getSrcExtentsList()Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v3

    .line 3744
    :cond_8
    invoke-virtual {p0}, Ll/֫ܶ᩻;->hasSrcLength()Z

    move-result v1

    invoke-virtual {p1}, Ll/֫ܶ᩻;->hasSrcLength()Z

    move-result v2

    if-eq v1, v2, :cond_9

    return v3

    .line 3745
    :cond_9
    invoke-virtual {p0}, Ll/֫ܶ᩻;->hasSrcLength()Z

    move-result v1

    if-eqz v1, :cond_a

    .line 3746
    invoke-virtual {p0}, Ll/֫ܶ᩻;->getSrcLength()J

    move-result-wide v1

    .line 3747
    invoke-virtual {p1}, Ll/֫ܶ᩻;->getSrcLength()J

    move-result-wide v4

    cmp-long v6, v1, v4

    if-eqz v6, :cond_a

    return v3

    .line 3749
    :cond_a
    invoke-virtual {p0}, Ll/֫ܶ᩻;->getDstExtentsList()Ljava/util/List;

    move-result-object v1

    .line 3750
    invoke-virtual {p1}, Ll/֫ܶ᩻;->getDstExtentsList()Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v3

    .line 3751
    :cond_b
    invoke-virtual {p0}, Ll/֫ܶ᩻;->hasDstLength()Z

    move-result v1

    invoke-virtual {p1}, Ll/֫ܶ᩻;->hasDstLength()Z

    move-result v2

    if-eq v1, v2, :cond_c

    return v3

    .line 3752
    :cond_c
    invoke-virtual {p0}, Ll/֫ܶ᩻;->hasDstLength()Z

    move-result v1

    if-eqz v1, :cond_d

    .line 3753
    invoke-virtual {p0}, Ll/֫ܶ᩻;->getDstLength()J

    move-result-wide v1

    .line 3754
    invoke-virtual {p1}, Ll/֫ܶ᩻;->getDstLength()J

    move-result-wide v4

    cmp-long v6, v1, v4

    if-eqz v6, :cond_d

    return v3

    .line 3756
    :cond_d
    invoke-virtual {p0}, Ll/֫ܶ᩻;->hasDataSha256Hash()Z

    move-result v1

    invoke-virtual {p1}, Ll/֫ܶ᩻;->hasDataSha256Hash()Z

    move-result v2

    if-eq v1, v2, :cond_e

    return v3

    .line 3757
    :cond_e
    invoke-virtual {p0}, Ll/֫ܶ᩻;->hasDataSha256Hash()Z

    move-result v1

    if-eqz v1, :cond_f

    .line 3758
    invoke-virtual {p0}, Ll/֫ܶ᩻;->getDataSha256Hash()Ll/ۛۜۖ;

    move-result-object v1

    .line 3759
    invoke-virtual {p1}, Ll/֫ܶ᩻;->getDataSha256Hash()Ll/ۛۜۖ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۛۜۖ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v3

    .line 3761
    :cond_f
    invoke-virtual {p0}, Ll/֫ܶ᩻;->hasSrcSha256Hash()Z

    move-result v1

    invoke-virtual {p1}, Ll/֫ܶ᩻;->hasSrcSha256Hash()Z

    move-result v2

    if-eq v1, v2, :cond_10

    return v3

    .line 3762
    :cond_10
    invoke-virtual {p0}, Ll/֫ܶ᩻;->hasSrcSha256Hash()Z

    move-result v1

    if-eqz v1, :cond_11

    .line 3763
    invoke-virtual {p0}, Ll/֫ܶ᩻;->getSrcSha256Hash()Ll/ۛۜۖ;

    move-result-object v1

    .line 3764
    invoke-virtual {p1}, Ll/֫ܶ᩻;->getSrcSha256Hash()Ll/ۛۜۖ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۛۜۖ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v3

    .line 3766
    :cond_11
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/ۢ֨ۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_12

    return v3

    :cond_12
    return v0
.end method

.method public getDataLength()J
    .locals 2

    .line 3388
    iget-wide v0, p0, Ll/֫ܶ᩻;->dataLength_:J

    return-wide v0
.end method

.method public getDataOffset()J
    .locals 2

    .line 3361
    iget-wide v0, p0, Ll/֫ܶ᩻;->dataOffset_:J

    return-wide v0
.end method

.method public getDataSha256Hash()Ll/ۛۜۖ;
    .locals 1

    .line 3589
    iget-object v0, p0, Ll/֫ܶ᩻;->dataSha256Hash_:Ll/ۛۜۖ;

    return-object v0
.end method

.method public getDefaultInstanceForType()Ll/֫ܶ᩻;
    .locals 1

    .line 5287
    sget-object v0, Ll/֫ܶ᩻;->DEFAULT_INSTANCE:Ll/֫ܶ᩻;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 2943
    invoke-virtual {p0}, Ll/֫ܶ᩻;->getDefaultInstanceForType()Ll/֫ܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 2943
    invoke-virtual {p0}, Ll/֫ܶ᩻;->getDefaultInstanceForType()Ll/֫ܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public getDstExtents(I)Ll/۫۠᩻;
    .locals 1

    .line 3515
    iget-object v0, p0, Ll/֫ܶ᩻;->dstExtents_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۫۠᩻;

    return-object p1
.end method

.method public getDstExtentsCount()I
    .locals 1

    .line 3508
    iget-object v0, p0, Ll/֫ܶ᩻;->dstExtents_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getDstExtentsList()Ljava/util/List;
    .locals 1

    .line 3493
    iget-object v0, p0, Ll/֫ܶ᩻;->dstExtents_:Ljava/util/List;

    return-object v0
.end method

.method public getDstExtentsOrBuilder(I)Ll/ۛ۠᩻;
    .locals 1

    .line 3523
    iget-object v0, p0, Ll/֫ܶ᩻;->dstExtents_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۛ۠᩻;

    return-object p1
.end method

.method public getDstExtentsOrBuilderList()Ljava/util/List;
    .locals 1

    .line 3501
    iget-object v0, p0, Ll/֫ܶ᩻;->dstExtents_:Ljava/util/List;

    return-object v0
.end method

.method public getDstLength()J
    .locals 2

    .line 3554
    iget-wide v0, p0, Ll/֫ܶ᩻;->dstLength_:J

    return-wide v0
.end method

.method public getParserForType()Ll/۫֡ۖ;
    .locals 1

    .line 5282
    sget-object v0, Ll/֫ܶ᩻;->PARSER:Ll/۫֡ۖ;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 6

    .line 3673
    iget v0, p0, Ll/ۡۜۖ;->memoizedSize:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    .line 3677
    :cond_0
    iget v0, p0, Ll/֫ܶ᩻;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 3678
    iget v0, p0, Ll/֫ܶ᩻;->type_:I

    .line 3679
    invoke-static {v1, v0}, Ll/ܳ᩷ۖ;->ܿ(II)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 3681
    :goto_0
    iget v1, p0, Ll/֫ܶ᩻;->bitField0_:I

    const/4 v3, 0x2

    and-int/2addr v1, v3

    if-eqz v1, :cond_2

    .line 3682
    iget-wide v4, p0, Ll/֫ܶ᩻;->dataOffset_:J

    .line 3683
    invoke-static {v3, v4, v5}, Ll/ܳ᩷ۖ;->ᩳ(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 3685
    :cond_2
    iget v1, p0, Ll/֫ܶ᩻;->bitField0_:I

    const/4 v3, 0x4

    and-int/2addr v1, v3

    if-eqz v1, :cond_3

    const/4 v1, 0x3

    .line 3686
    iget-wide v4, p0, Ll/֫ܶ᩻;->dataLength_:J

    .line 3687
    invoke-static {v1, v4, v5}, Ll/ܳ᩷ۖ;->ᩳ(IJ)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    const/4 v1, 0x0

    .line 3689
    :goto_1
    iget-object v4, p0, Ll/֫ܶ᩻;->srcExtents_:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v1, v4, :cond_4

    .line 3690
    iget-object v4, p0, Ll/֫ܶ᩻;->srcExtents_:Ljava/util/List;

    .line 3691
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۡ֡ۖ;

    invoke-static {v3, v4}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v4

    add-int/2addr v0, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 3693
    :cond_4
    iget v1, p0, Ll/֫ܶ᩻;->bitField0_:I

    const/16 v3, 0x8

    and-int/2addr v1, v3

    if-eqz v1, :cond_5

    const/4 v1, 0x5

    .line 3694
    iget-wide v4, p0, Ll/֫ܶ᩻;->srcLength_:J

    .line 3695
    invoke-static {v1, v4, v5}, Ll/ܳ᩷ۖ;->ᩳ(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 3697
    :cond_5
    :goto_2
    iget-object v1, p0, Ll/֫ܶ᩻;->dstExtents_:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v2, v1, :cond_6

    .line 3698
    iget-object v1, p0, Ll/֫ܶ᩻;->dstExtents_:Ljava/util/List;

    .line 3699
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡ֡ۖ;

    const/4 v4, 0x6

    invoke-static {v4, v1}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 3701
    :cond_6
    iget v1, p0, Ll/֫ܶ᩻;->bitField0_:I

    and-int/lit8 v1, v1, 0x10

    if-eqz v1, :cond_7

    const/4 v1, 0x7

    .line 3702
    iget-wide v4, p0, Ll/֫ܶ᩻;->dstLength_:J

    .line 3703
    invoke-static {v1, v4, v5}, Ll/ܳ᩷ۖ;->ᩳ(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 3705
    :cond_7
    iget v1, p0, Ll/֫ܶ᩻;->bitField0_:I

    and-int/lit8 v1, v1, 0x20

    if-eqz v1, :cond_8

    .line 3706
    iget-object v1, p0, Ll/֫ܶ᩻;->dataSha256Hash_:Ll/ۛۜۖ;

    .line 3707
    invoke-static {v3, v1}, Ll/ܳ᩷ۖ;->ܽ(ILl/ۛۜۖ;)I

    move-result v1

    add-int/2addr v0, v1

    .line 3709
    :cond_8
    iget v1, p0, Ll/֫ܶ᩻;->bitField0_:I

    and-int/lit8 v1, v1, 0x40

    if-eqz v1, :cond_9

    const/16 v1, 0x9

    .line 3710
    iget-object v2, p0, Ll/֫ܶ᩻;->srcSha256Hash_:Ll/ۛۜۖ;

    .line 3711
    invoke-static {v1, v2}, Ll/ܳ᩷ۖ;->ܽ(ILl/ۛۜۖ;)I

    move-result v1

    add-int/2addr v0, v1

    .line 3713
    :cond_9
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->getSerializedSize()I

    move-result v1

    add-int/2addr v1, v0

    .line 3714
    iput v1, p0, Ll/ۡۜۖ;->memoizedSize:I

    return v1
.end method

.method public getSrcExtents(I)Ll/۫۠᩻;
    .locals 1

    .line 3437
    iget-object v0, p0, Ll/֫ܶ᩻;->srcExtents_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۫۠᩻;

    return-object p1
.end method

.method public getSrcExtentsCount()I
    .locals 1

    .line 3426
    iget-object v0, p0, Ll/֫ܶ᩻;->srcExtents_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getSrcExtentsList()Ljava/util/List;
    .locals 1

    .line 3403
    iget-object v0, p0, Ll/֫ܶ᩻;->srcExtents_:Ljava/util/List;

    return-object v0
.end method

.method public getSrcExtentsOrBuilder(I)Ll/ۛ۠᩻;
    .locals 1

    .line 3449
    iget-object v0, p0, Ll/֫ܶ᩻;->srcExtents_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۛ۠᩻;

    return-object p1
.end method

.method public getSrcExtentsOrBuilderList()Ljava/util/List;
    .locals 1

    .line 3415
    iget-object v0, p0, Ll/֫ܶ᩻;->srcExtents_:Ljava/util/List;

    return-object v0
.end method

.method public getSrcLength()J
    .locals 2

    .line 3482
    iget-wide v0, p0, Ll/֫ܶ᩻;->srcLength_:J

    return-wide v0
.end method

.method public getSrcSha256Hash()Ll/ۛۜۖ;
    .locals 1

    .line 3620
    iget-object v0, p0, Ll/֫ܶ᩻;->srcSha256Hash_:Ll/ۛۜۖ;

    return-object v0
.end method

.method public getType()Ll/۟۠᩻;
    .locals 1

    .line 3327
    iget v0, p0, Ll/֫ܶ᩻;->type_:I

    invoke-static {v0}, Ll/۟۠᩻;->forNumber(I)Ll/۟۠᩻;

    move-result-object v0

    if-nez v0, :cond_0

    .line 3328
    sget-object v0, Ll/۟۠᩻;->REPLACE:Ll/۟۠᩻;

    :cond_0
    return-object v0
.end method

.method public hasDataLength()Z
    .locals 1

    .line 3376
    iget v0, p0, Ll/֫ܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasDataOffset()Z
    .locals 1

    .line 3346
    iget v0, p0, Ll/֫ܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasDataSha256Hash()Z
    .locals 1

    .line 3573
    iget v0, p0, Ll/֫ܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasDstLength()Z
    .locals 1

    .line 3540
    iget v0, p0, Ll/֫ܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasSrcLength()Z
    .locals 1

    .line 3467
    iget v0, p0, Ll/֫ܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasSrcSha256Hash()Z
    .locals 1

    .line 3606
    iget v0, p0, Ll/֫ܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasType()Z
    .locals 2

    .line 3320
    iget v0, p0, Ll/֫ܶ᩻;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 6

    .line 3772
    iget v0, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    if-eqz v0, :cond_0

    return v0

    .line 3776
    :cond_0
    invoke-static {}, Ll/֫ܶ᩻;->getDescriptor()Ll/ᩳۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x30b

    .line 3777
    invoke-virtual {p0}, Ll/֫ܶ᩻;->hasType()Z

    move-result v1

    const/16 v2, 0x35

    const/16 v3, 0x25

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    .line 3778
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 3779
    iget v1, p0, Ll/֫ܶ᩻;->type_:I

    add-int/2addr v0, v1

    .line 3781
    :cond_1
    invoke-virtual {p0}, Ll/֫ܶ᩻;->hasDataOffset()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    .line 3782
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 3784
    invoke-virtual {p0}, Ll/֫ܶ᩻;->getDataOffset()J

    move-result-wide v4

    .line 3783
    invoke-static {v4, v5}, Ll/ܰᩴۖ;->֫(J)I

    move-result v1

    add-int/2addr v0, v1

    .line 3786
    :cond_2
    invoke-virtual {p0}, Ll/֫ܶ᩻;->hasDataLength()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x3

    .line 3787
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 3789
    invoke-virtual {p0}, Ll/֫ܶ᩻;->getDataLength()J

    move-result-wide v4

    .line 3788
    invoke-static {v4, v5}, Ll/ܰᩴۖ;->֫(J)I

    move-result v1

    add-int/2addr v0, v1

    .line 3791
    :cond_3
    invoke-virtual {p0}, Ll/֫ܶ᩻;->getSrcExtentsCount()I

    move-result v1

    if-lez v1, :cond_4

    const/4 v1, 0x4

    .line 3792
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 3793
    invoke-virtual {p0}, Ll/֫ܶ᩻;->getSrcExtentsList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 3795
    :cond_4
    invoke-virtual {p0}, Ll/֫ܶ᩻;->hasSrcLength()Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v1, 0x5

    .line 3796
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 3798
    invoke-virtual {p0}, Ll/֫ܶ᩻;->getSrcLength()J

    move-result-wide v4

    .line 3797
    invoke-static {v4, v5}, Ll/ܰᩴۖ;->֫(J)I

    move-result v1

    add-int/2addr v0, v1

    .line 3800
    :cond_5
    invoke-virtual {p0}, Ll/֫ܶ᩻;->getDstExtentsCount()I

    move-result v1

    if-lez v1, :cond_6

    const/4 v1, 0x6

    .line 3801
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 3802
    invoke-virtual {p0}, Ll/֫ܶ᩻;->getDstExtentsList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 3804
    :cond_6
    invoke-virtual {p0}, Ll/֫ܶ᩻;->hasDstLength()Z

    move-result v1

    if-eqz v1, :cond_7

    const/4 v1, 0x7

    .line 3805
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 3807
    invoke-virtual {p0}, Ll/֫ܶ᩻;->getDstLength()J

    move-result-wide v4

    .line 3806
    invoke-static {v4, v5}, Ll/ܰᩴۖ;->֫(J)I

    move-result v1

    add-int/2addr v0, v1

    .line 3809
    :cond_7
    invoke-virtual {p0}, Ll/֫ܶ᩻;->hasDataSha256Hash()Z

    move-result v1

    if-eqz v1, :cond_8

    const/16 v1, 0x8

    .line 3810
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 3811
    invoke-virtual {p0}, Ll/֫ܶ᩻;->getDataSha256Hash()Ll/ۛۜۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۛۜۖ;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 3813
    :cond_8
    invoke-virtual {p0}, Ll/֫ܶ᩻;->hasSrcSha256Hash()Z

    move-result v1

    if-eqz v1, :cond_9

    const/16 v1, 0x9

    .line 3814
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 3815
    invoke-virtual {p0}, Ll/֫ܶ᩻;->getSrcSha256Hash()Ll/ۛۜۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۛۜۖ;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    :cond_9
    mul-int/lit8 v0, v0, 0x1d

    .line 3817
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    .line 3818
    iput v1, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    return v1
.end method

.method public internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 2977
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_InstallOperation_fieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/֫ܶ᩻;

    const-class v2, Ll/᩺۠᩻;

    .line 2978
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 3

    .line 3626
    iget-byte v0, p0, Ll/֫ܶ᩻;->memoizedIsInitialized:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    .line 3630
    :cond_1
    invoke-virtual {p0}, Ll/֫ܶ᩻;->hasType()Z

    move-result v0

    if-nez v0, :cond_2

    .line 3631
    iput-byte v2, p0, Ll/֫ܶ᩻;->memoizedIsInitialized:B

    return v2

    .line 3634
    :cond_2
    iput-byte v1, p0, Ll/֫ܶ᩻;->memoizedIsInitialized:B

    return v1
.end method

.method public bridge synthetic newBuilderForType()Ll/ۢ֡ۖ;
    .locals 1

    .line 2943
    invoke-virtual {p0}, Ll/֫ܶ᩻;->newBuilderForType()Ll/᩺۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Ll/ܳ֡ۖ;
    .locals 1

    .line 2943
    invoke-virtual {p0}, Ll/֫ܶ᩻;->newBuilderForType()Ll/᩺۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Ll/ۢۜۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 2943
    invoke-virtual {p0, p1}, Ll/֫ܶ᩻;->newBuilderForType(Ll/ۢۜۖ;)Ll/᩺۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public newBuilderForType()Ll/᩺۠᩻;
    .locals 1

    .line 3895
    invoke-static {}, Ll/֫ܶ᩻;->newBuilder()Ll/᩺۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType(Ll/ۢۜۖ;)Ll/᩺۠᩻;
    .locals 2

    .line 3911
    new-instance v0, Ll/᩺۠᩻;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/᩺۠᩻;-><init>(Ll/ۢۜۖ;I)V

    return-object v0
.end method

.method public bridge synthetic toBuilder()Ll/ۢ֡ۖ;
    .locals 1

    .line 2943
    invoke-virtual {p0}, Ll/֫ܶ᩻;->toBuilder()Ll/᩺۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Ll/ܳ֡ۖ;
    .locals 1

    .line 2943
    invoke-virtual {p0}, Ll/֫ܶ᩻;->toBuilder()Ll/᩺۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Ll/᩺۠᩻;
    .locals 2

    .line 3904
    sget-object v0, Ll/֫ܶ᩻;->DEFAULT_INSTANCE:Ll/֫ܶ᩻;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    .line 3905
    new-instance v0, Ll/᩺۠᩻;

    invoke-direct {v0, v1}, Ll/᩺۠᩻;-><init>(I)V

    return-object v0

    :cond_0
    new-instance v0, Ll/᩺۠᩻;

    invoke-direct {v0, v1}, Ll/᩺۠᩻;-><init>(I)V

    invoke-virtual {v0, p0}, Ll/᩺۠᩻;->mergeFrom(Ll/֫ܶ᩻;)Ll/᩺۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Ll/ܳ᩷ۖ;)V
    .locals 5

    .line 3641
    iget v0, p0, Ll/֫ܶ᩻;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    .line 3642
    iget v0, p0, Ll/֫ܶ᩻;->type_:I

    .line 275
    invoke-virtual {p1, v1, v0}, Ll/ܳ᩷ۖ;->ۧ(II)V

    .line 3644
    :cond_0
    iget v0, p0, Ll/֫ܶ᩻;->bitField0_:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    .line 3645
    iget-wide v2, p0, Ll/֫ܶ᩻;->dataOffset_:J

    invoke-virtual {p1, v1, v2, v3}, Ll/ܳ᩷ۖ;->ۧ(IJ)V

    .line 3647
    :cond_1
    iget v0, p0, Ll/֫ܶ᩻;->bitField0_:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-eqz v0, :cond_2

    const/4 v0, 0x3

    .line 3648
    iget-wide v2, p0, Ll/֫ܶ᩻;->dataLength_:J

    invoke-virtual {p1, v0, v2, v3}, Ll/ܳ᩷ۖ;->ۧ(IJ)V

    :cond_2
    const/4 v0, 0x0

    const/4 v2, 0x0

    .line 3650
    :goto_0
    iget-object v3, p0, Ll/֫ܶ᩻;->srcExtents_:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_3

    .line 3651
    iget-object v3, p0, Ll/֫ܶ᩻;->srcExtents_:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۡ֡ۖ;

    invoke-virtual {p1, v1, v3}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 3653
    :cond_3
    iget v1, p0, Ll/֫ܶ᩻;->bitField0_:I

    const/16 v2, 0x8

    and-int/2addr v1, v2

    if-eqz v1, :cond_4

    const/4 v1, 0x5

    .line 3654
    iget-wide v3, p0, Ll/֫ܶ᩻;->srcLength_:J

    invoke-virtual {p1, v1, v3, v4}, Ll/ܳ᩷ۖ;->ۧ(IJ)V

    .line 3656
    :cond_4
    :goto_1
    iget-object v1, p0, Ll/֫ܶ᩻;->dstExtents_:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_5

    .line 3657
    iget-object v1, p0, Ll/֫ܶ᩻;->dstExtents_:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡ֡ۖ;

    const/4 v3, 0x6

    invoke-virtual {p1, v3, v1}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 3659
    :cond_5
    iget v0, p0, Ll/֫ܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_6

    const/4 v0, 0x7

    .line 3660
    iget-wide v3, p0, Ll/֫ܶ᩻;->dstLength_:J

    invoke-virtual {p1, v0, v3, v4}, Ll/ܳ᩷ۖ;->ۧ(IJ)V

    .line 3662
    :cond_6
    iget v0, p0, Ll/֫ܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_7

    .line 3663
    iget-object v0, p0, Ll/֫ܶ᩻;->dataSha256Hash_:Ll/ۛۜۖ;

    invoke-virtual {p1, v2, v0}, Ll/ܳ᩷ۖ;->֫(ILl/ۛۜۖ;)V

    .line 3665
    :cond_7
    iget v0, p0, Ll/֫ܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_8

    const/16 v0, 0x9

    .line 3666
    iget-object v1, p0, Ll/֫ܶ᩻;->srcSha256Hash_:Ll/ۛۜۖ;

    invoke-virtual {p1, v0, v1}, Ll/ܳ᩷ۖ;->֫(ILl/ۛۜۖ;)V

    .line 3668
    :cond_8
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۢ֨ۖ;->writeTo(Ll/ܳ᩷ۖ;)V

    return-void
.end method
