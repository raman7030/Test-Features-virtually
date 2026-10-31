.class public final Ll/֫۠᩻;
.super Ll/ۘᩴۖ;
.source "C9PC"

# interfaces
.implements Ll/ܽ۠᩻;


# static fields
.field public static final DECOMPRESSED_SIZE_FIELD_NUMBER:I = 0x4

.field public static final DEFAULT_INSTANCE:Ll/֫۠᩻;

.field public static final IS_COMPRESSED_FIELD_NUMBER:I = 0x3

.field public static final PACKAGE_NAME_FIELD_NUMBER:I = 0x1

.field public static final PARSER:Ll/۫֡ۖ;

.field public static final VERSION_FIELD_NUMBER:I = 0x2

.field public static final serialVersionUID:J


# instance fields
.field public bitField0_:I

.field public decompressedSize_:J

.field public isCompressed_:Z

.field public memoizedIsInitialized:B

.field public volatile packageName_:Ljava/lang/Object;

.field public version_:J


# direct methods
.method public static bridge synthetic -$$Nest$fgetbitField0_(Ll/֫۠᩻;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/֫۠᩻;->bitField0_:I

    return p0
.end method

.method public static bridge synthetic -$$Nest$fgetpackageName_(Ll/֫۠᩻;)Ljava/lang/Object;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫۠᩻;->packageName_:Ljava/lang/Object;

    return-object p0
.end method

.method public static bridge synthetic -$$Nest$fputbitField0_(ILl/֫۠᩻;)V
    .locals 0

    .line 0
    iput p0, p1, Ll/֫۠᩻;->bitField0_:I

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputdecompressedSize_(Ll/֫۠᩻;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/֫۠᩻;->decompressedSize_:J

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputisCompressed_(Ll/֫۠᩻;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/֫۠᩻;->isCompressed_:Z

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputpackageName_(Ll/֫۠᩻;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/֫۠᩻;->packageName_:Ljava/lang/Object;

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputversion_(Ll/֫۠᩻;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/֫۠᩻;->version_:J

    return-void
.end method

.method public static constructor <clinit>()V
    .locals 2

    .line 15860
    sget-object v0, Ll/ۜۚۖ;->᩶:Ll/ۜۚۖ;

    const-class v1, Ll/֫۠᩻;

    .line 15866
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    .line 15860
    invoke-static {v0, v1}, Ll/᩷ۚۖ;->֫(Ll/ۜۚۖ;Ljava/lang/String;)V

    .line 16599
    new-instance v0, Ll/֫۠᩻;

    invoke-direct {v0}, Ll/֫۠᩻;-><init>()V

    sput-object v0, Ll/֫۠᩻;->DEFAULT_INSTANCE:Ll/֫۠᩻;

    .line 16607
    new-instance v0, Ll/ܰ֨᩻;

    invoke-direct {v0}, Ll/ܰ֨᩻;-><init>()V

    sput-object v0, Ll/֫۠᩻;->PARSER:Ll/۫֡ۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 15872
    invoke-direct {p0}, Ll/ۘᩴۖ;-><init>()V

    const-string v0, ""

    .line 15891
    iput-object v0, p0, Ll/֫۠᩻;->packageName_:Ljava/lang/Object;

    const-wide/16 v1, 0x0

    .line 15940
    iput-wide v1, p0, Ll/֫۠᩻;->version_:J

    const/4 v3, 0x0

    .line 15959
    iput-boolean v3, p0, Ll/֫۠᩻;->isCompressed_:Z

    .line 15978
    iput-wide v1, p0, Ll/֫۠᩻;->decompressedSize_:J

    const/4 v1, -0x1

    .line 15996
    iput-byte v1, p0, Ll/֫۠᩻;->memoizedIsInitialized:B

    .line 15873
    iput-object v0, p0, Ll/֫۠᩻;->packageName_:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ll/۟֨᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/֫۠᩻;-><init>(Ll/᩶ۘۖ;)V

    return-void
.end method

.method public constructor <init>(Ll/᩶ۘۖ;)V
    .locals 2

    .line 15870
    invoke-direct {p0, p1}, Ll/ۘᩴۖ;-><init>(Ll/᩶ۘۖ;)V

    const-string p1, ""

    .line 15891
    iput-object p1, p0, Ll/֫۠᩻;->packageName_:Ljava/lang/Object;

    const-wide/16 v0, 0x0

    .line 15940
    iput-wide v0, p0, Ll/֫۠᩻;->version_:J

    const/4 p1, 0x0

    .line 15959
    iput-boolean p1, p0, Ll/֫۠᩻;->isCompressed_:Z

    .line 15978
    iput-wide v0, p0, Ll/֫۠᩻;->decompressedSize_:J

    const/4 p1, -0x1

    .line 15996
    iput-byte p1, p0, Ll/֫۠᩻;->memoizedIsInitialized:B

    return-void
.end method

.method public static getDefaultInstance()Ll/֫۠᩻;
    .locals 1

    .line 16603
    sget-object v0, Ll/֫۠᩻;->DEFAULT_INSTANCE:Ll/֫۠᩻;

    return-object v0
.end method

.method public static final getDescriptor()Ll/ᩳۖۖ;
    .locals 1

    .line 15878
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_ApexInfo_descriptor()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder()Ll/۟֨᩻;
    .locals 1

    .line 16191
    sget-object v0, Ll/֫۠᩻;->DEFAULT_INSTANCE:Ll/֫۠᩻;

    invoke-virtual {v0}, Ll/֫۠᩻;->toBuilder()Ll/۟֨᩻;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Ll/֫۠᩻;)Ll/۟֨᩻;
    .locals 1

    .line 16194
    sget-object v0, Ll/֫۠᩻;->DEFAULT_INSTANCE:Ll/֫۠᩻;

    invoke-virtual {v0}, Ll/֫۠᩻;->toBuilder()Ll/۟֨᩻;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/۟֨᩻;->mergeFrom(Ll/֫۠᩻;)Ll/۟֨᩻;

    move-result-object p0

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Ll/֫۠᩻;
    .locals 1

    .line 16163
    sget-object v0, Ll/֫۠᩻;->PARSER:Ll/۫֡ۖ;

    .line 16164
    invoke-static {v0, p0}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ljava/io/InputStream;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/֫۠᩻;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/֫۠᩻;
    .locals 1

    .line 16171
    sget-object v0, Ll/֫۠᩻;->PARSER:Ll/۫֡ۖ;

    .line 16172
    invoke-static {v0, p0, p1}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/֫۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Ll/֫۠᩻;
    .locals 1

    .line 16150
    sget-object v0, Ll/֫۠᩻;->PARSER:Ll/۫֡ۖ;

    .line 16151
    invoke-static {v0, p0}, Ll/ۘᩴۖ;->ۧ(Ll/۫֡ۖ;Ljava/io/InputStream;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/֫۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/֫۠᩻;
    .locals 1

    .line 16157
    sget-object v0, Ll/֫۠᩻;->PARSER:Ll/۫֡ۖ;

    .line 16158
    invoke-static {v0, p0, p1}, Ll/ۘᩴۖ;->ۧ(Ll/۫֡ۖ;Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/֫۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Ll/֫۠᩻;
    .locals 1

    .line 16119
    sget-object v0, Ll/֫۠᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0}, Ll/۫֡ۖ;->parseFrom(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/֫۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Ll/ᩳۘۖ;)Ll/֫۠᩻;
    .locals 1

    .line 16125
    sget-object v0, Ll/֫۠᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0, p1}, Ll/۫֡ۖ;->parseFrom(Ljava/nio/ByteBuffer;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/֫۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/ۛۜۖ;)Ll/֫۠᩻;
    .locals 1

    .line 16130
    sget-object v0, Ll/֫۠᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0}, Ll/۫֡ۖ;->parseFrom(Ll/ۛۜۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/֫۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ll/֫۠᩻;
    .locals 1

    .line 16136
    sget-object v0, Ll/֫۠᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0, p1}, Ll/۫֡ۖ;->parseFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/֫۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/۟ۜۖ;)Ll/֫۠᩻;
    .locals 1

    .line 16177
    sget-object v0, Ll/֫۠᩻;->PARSER:Ll/۫֡ۖ;

    .line 16178
    invoke-static {v0, p0}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ll/۟ۜۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/֫۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/֫۠᩻;
    .locals 1

    .line 16184
    sget-object v0, Ll/֫۠᩻;->PARSER:Ll/۫֡ۖ;

    .line 16185
    invoke-static {v0, p0, p1}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/֫۠᩻;

    return-object p0
.end method

.method public static parseFrom([B)Ll/֫۠᩻;
    .locals 1

    .line 16140
    sget-object v0, Ll/֫۠᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0}, Ll/۫֡ۖ;->parseFrom([B)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/֫۠᩻;

    return-object p0
.end method

.method public static parseFrom([BLl/ᩳۘۖ;)Ll/֫۠᩻;
    .locals 1

    .line 16146
    sget-object v0, Ll/֫۠᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0, p1}, Ll/۫֡ۖ;->parseFrom([BLl/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/֫۠᩻;

    return-object p0
.end method

.method public static parser()Ll/۫֡ۖ;
    .locals 1

    .line 16629
    sget-object v0, Ll/֫۠᩻;->PARSER:Ll/۫֡ۖ;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 16056
    :cond_0
    instance-of v1, p1, Ll/֫۠᩻;

    if-nez v1, :cond_1

    .line 16057
    invoke-super {p0, p1}, Ll/ۡۜۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 16059
    :cond_1
    check-cast p1, Ll/֫۠᩻;

    .line 16061
    invoke-virtual {p0}, Ll/֫۠᩻;->hasPackageName()Z

    move-result v1

    invoke-virtual {p1}, Ll/֫۠᩻;->hasPackageName()Z

    move-result v2

    const/4 v3, 0x0

    if-eq v1, v2, :cond_2

    return v3

    .line 16062
    :cond_2
    invoke-virtual {p0}, Ll/֫۠᩻;->hasPackageName()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 16063
    invoke-virtual {p0}, Ll/֫۠᩻;->getPackageName()Ljava/lang/String;

    move-result-object v1

    .line 16064
    invoke-virtual {p1}, Ll/֫۠᩻;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v3

    .line 16066
    :cond_3
    invoke-virtual {p0}, Ll/֫۠᩻;->hasVersion()Z

    move-result v1

    invoke-virtual {p1}, Ll/֫۠᩻;->hasVersion()Z

    move-result v2

    if-eq v1, v2, :cond_4

    return v3

    .line 16067
    :cond_4
    invoke-virtual {p0}, Ll/֫۠᩻;->hasVersion()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 16068
    invoke-virtual {p0}, Ll/֫۠᩻;->getVersion()J

    move-result-wide v1

    .line 16069
    invoke-virtual {p1}, Ll/֫۠᩻;->getVersion()J

    move-result-wide v4

    cmp-long v6, v1, v4

    if-eqz v6, :cond_5

    return v3

    .line 16071
    :cond_5
    invoke-virtual {p0}, Ll/֫۠᩻;->hasIsCompressed()Z

    move-result v1

    invoke-virtual {p1}, Ll/֫۠᩻;->hasIsCompressed()Z

    move-result v2

    if-eq v1, v2, :cond_6

    return v3

    .line 16072
    :cond_6
    invoke-virtual {p0}, Ll/֫۠᩻;->hasIsCompressed()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 16073
    invoke-virtual {p0}, Ll/֫۠᩻;->getIsCompressed()Z

    move-result v1

    .line 16074
    invoke-virtual {p1}, Ll/֫۠᩻;->getIsCompressed()Z

    move-result v2

    if-eq v1, v2, :cond_7

    return v3

    .line 16076
    :cond_7
    invoke-virtual {p0}, Ll/֫۠᩻;->hasDecompressedSize()Z

    move-result v1

    invoke-virtual {p1}, Ll/֫۠᩻;->hasDecompressedSize()Z

    move-result v2

    if-eq v1, v2, :cond_8

    return v3

    .line 16077
    :cond_8
    invoke-virtual {p0}, Ll/֫۠᩻;->hasDecompressedSize()Z

    move-result v1

    if-eqz v1, :cond_9

    .line 16078
    invoke-virtual {p0}, Ll/֫۠᩻;->getDecompressedSize()J

    move-result-wide v1

    .line 16079
    invoke-virtual {p1}, Ll/֫۠᩻;->getDecompressedSize()J

    move-result-wide v4

    cmp-long v6, v1, v4

    if-eqz v6, :cond_9

    return v3

    .line 16081
    :cond_9
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/ۢ֨ۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v3

    :cond_a
    return v0
.end method

.method public getDecompressedSize()J
    .locals 2

    .line 15993
    iget-wide v0, p0, Ll/֫۠᩻;->decompressedSize_:J

    return-wide v0
.end method

.method public getDefaultInstanceForType()Ll/֫۠᩻;
    .locals 1

    .line 16639
    sget-object v0, Ll/֫۠᩻;->DEFAULT_INSTANCE:Ll/֫۠᩻;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 15854
    invoke-virtual {p0}, Ll/֫۠᩻;->getDefaultInstanceForType()Ll/֫۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 15854
    invoke-virtual {p0}, Ll/֫۠᩻;->getDefaultInstanceForType()Ll/֫۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public getIsCompressed()Z
    .locals 1

    .line 15974
    iget-boolean v0, p0, Ll/֫۠᩻;->isCompressed_:Z

    return v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 2

    .line 15907
    iget-object v0, p0, Ll/֫۠᩻;->packageName_:Ljava/lang/Object;

    .line 15908
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 15909
    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 15911
    :cond_0
    check-cast v0, Ll/ۛۜۖ;

    .line 15913
    invoke-virtual {v0}, Ll/ۛۜۖ;->ܳ()Ljava/lang/String;

    move-result-object v1

    .line 15914
    invoke-virtual {v0}, Ll/ۛۜۖ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 15915
    iput-object v1, p0, Ll/֫۠᩻;->packageName_:Ljava/lang/Object;

    :cond_1
    return-object v1
.end method

.method public getPackageNameBytes()Ll/ۛۜۖ;
    .locals 2

    .line 15927
    iget-object v0, p0, Ll/֫۠᩻;->packageName_:Ljava/lang/Object;

    .line 15928
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 15929
    check-cast v0, Ljava/lang/String;

    .line 15930
    invoke-static {v0}, Ll/ۛۜۖ;->֫(Ljava/lang/String;)Ll/ۛۜۖ;

    move-result-object v0

    .line 15932
    iput-object v0, p0, Ll/֫۠᩻;->packageName_:Ljava/lang/Object;

    return-object v0

    .line 15935
    :cond_0
    check-cast v0, Ll/ۛۜۖ;

    return-object v0
.end method

.method public getParserForType()Ll/۫֡ۖ;
    .locals 1

    .line 16634
    sget-object v0, Ll/֫۠᩻;->PARSER:Ll/۫֡ۖ;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 5

    .line 16027
    iget v0, p0, Ll/ۡۜۖ;->memoizedSize:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    .line 16031
    :cond_0
    iget v0, p0, Ll/֫۠᩻;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    .line 16032
    iget-object v0, p0, Ll/֫۠᩻;->packageName_:Ljava/lang/Object;

    invoke-static {v1, v0}, Ll/ۘᩴۖ;->֫(ILjava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 16034
    :goto_0
    iget v1, p0, Ll/֫۠᩻;->bitField0_:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-eqz v1, :cond_2

    .line 16035
    iget-wide v3, p0, Ll/֫۠᩻;->version_:J

    .line 16036
    invoke-static {v2, v3, v4}, Ll/ܳ᩷ۖ;->ܽ(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 16038
    :cond_2
    iget v1, p0, Ll/֫۠᩻;->bitField0_:I

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-eqz v1, :cond_3

    const/4 v1, 0x3

    .line 16040
    invoke-static {v1}, Ll/ܳ᩷ۖ;->ᩳ(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 16042
    :cond_3
    iget v1, p0, Ll/֫۠᩻;->bitField0_:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_4

    .line 16043
    iget-wide v3, p0, Ll/֫۠᩻;->decompressedSize_:J

    .line 16044
    invoke-static {v2, v3, v4}, Ll/ܳ᩷ۖ;->ܽ(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 16046
    :cond_4
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->getSerializedSize()I

    move-result v1

    add-int/2addr v1, v0

    .line 16047
    iput v1, p0, Ll/ۡۜۖ;->memoizedSize:I

    return v1
.end method

.method public getVersion()J
    .locals 2

    .line 15955
    iget-wide v0, p0, Ll/֫۠᩻;->version_:J

    return-wide v0
.end method

.method public hasDecompressedSize()Z
    .locals 1

    .line 15985
    iget v0, p0, Ll/֫۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasIsCompressed()Z
    .locals 1

    .line 15966
    iget v0, p0, Ll/֫۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasPackageName()Z
    .locals 2

    .line 15899
    iget v0, p0, Ll/֫۠᩻;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasVersion()Z
    .locals 1

    .line 15947
    iget v0, p0, Ll/֫۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 6

    .line 16087
    iget v0, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    if-eqz v0, :cond_0

    return v0

    .line 16091
    :cond_0
    invoke-static {}, Ll/֫۠᩻;->getDescriptor()Ll/ᩳۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x30b

    .line 16092
    invoke-virtual {p0}, Ll/֫۠᩻;->hasPackageName()Z

    move-result v1

    const/16 v2, 0x35

    const/16 v3, 0x25

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    .line 16093
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 16094
    invoke-virtual {p0}, Ll/֫۠᩻;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 16096
    :cond_1
    invoke-virtual {p0}, Ll/֫۠᩻;->hasVersion()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    .line 16097
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 16099
    invoke-virtual {p0}, Ll/֫۠᩻;->getVersion()J

    move-result-wide v4

    .line 16098
    invoke-static {v4, v5}, Ll/ܰᩴۖ;->֫(J)I

    move-result v1

    add-int/2addr v0, v1

    .line 16101
    :cond_2
    invoke-virtual {p0}, Ll/֫۠᩻;->hasIsCompressed()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x3

    .line 16102
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 16104
    invoke-virtual {p0}, Ll/֫۠᩻;->getIsCompressed()Z

    move-result v1

    .line 16103
    invoke-static {v1}, Ll/ܰᩴۖ;->֫(Z)I

    move-result v1

    add-int/2addr v0, v1

    .line 16106
    :cond_3
    invoke-virtual {p0}, Ll/֫۠᩻;->hasDecompressedSize()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x4

    .line 16107
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 16109
    invoke-virtual {p0}, Ll/֫۠᩻;->getDecompressedSize()J

    move-result-wide v1

    .line 16108
    invoke-static {v1, v2}, Ll/ܰᩴۖ;->֫(J)I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    mul-int/lit8 v0, v0, 0x1d

    .line 16111
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    .line 16112
    iput v1, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    return v1
.end method

.method public internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 15884
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_ApexInfo_fieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/֫۠᩻;

    const-class v2, Ll/۟֨᩻;

    .line 15885
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 15999
    iget-byte v0, p0, Ll/֫۠᩻;->memoizedIsInitialized:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    return v0

    .line 16003
    :cond_1
    iput-byte v1, p0, Ll/֫۠᩻;->memoizedIsInitialized:B

    return v1
.end method

.method public newBuilderForType()Ll/۟֨᩻;
    .locals 1

    .line 16189
    invoke-static {}, Ll/֫۠᩻;->newBuilder()Ll/۟֨᩻;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType(Ll/ۢۜۖ;)Ll/۟֨᩻;
    .locals 2

    .line 16205
    new-instance v0, Ll/۟֨᩻;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/۟֨᩻;-><init>(Ll/ۢۜۖ;I)V

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Ll/ۢ֡ۖ;
    .locals 1

    .line 15854
    invoke-virtual {p0}, Ll/֫۠᩻;->newBuilderForType()Ll/۟֨᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Ll/ܳ֡ۖ;
    .locals 1

    .line 15854
    invoke-virtual {p0}, Ll/֫۠᩻;->newBuilderForType()Ll/۟֨᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Ll/ۢۜۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 15854
    invoke-virtual {p0, p1}, Ll/֫۠᩻;->newBuilderForType(Ll/ۢۜۖ;)Ll/۟֨᩻;

    move-result-object p1

    return-object p1
.end method

.method public toBuilder()Ll/۟֨᩻;
    .locals 2

    .line 16198
    sget-object v0, Ll/֫۠᩻;->DEFAULT_INSTANCE:Ll/֫۠᩻;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    .line 16199
    new-instance v0, Ll/۟֨᩻;

    invoke-direct {v0, v1}, Ll/۟֨᩻;-><init>(I)V

    return-object v0

    :cond_0
    new-instance v0, Ll/۟֨᩻;

    invoke-direct {v0, v1}, Ll/۟֨᩻;-><init>(I)V

    invoke-virtual {v0, p0}, Ll/۟֨᩻;->mergeFrom(Ll/֫۠᩻;)Ll/۟֨᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Ll/ۢ֡ۖ;
    .locals 1

    .line 15854
    invoke-virtual {p0}, Ll/֫۠᩻;->toBuilder()Ll/۟֨᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Ll/ܳ֡ۖ;
    .locals 1

    .line 15854
    invoke-virtual {p0}, Ll/֫۠᩻;->toBuilder()Ll/۟֨᩻;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Ll/ܳ᩷ۖ;)V
    .locals 4

    .line 16010
    iget v0, p0, Ll/֫۠᩻;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    .line 16011
    iget-object v0, p0, Ll/֫۠᩻;->packageName_:Ljava/lang/Object;

    invoke-static {p1, v1, v0}, Ll/ۘᩴۖ;->֫(Ll/ܳ᩷ۖ;ILjava/lang/Object;)V

    .line 16013
    :cond_0
    iget v0, p0, Ll/֫۠᩻;->bitField0_:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    .line 16014
    iget-wide v2, p0, Ll/֫۠᩻;->version_:J

    .line 235
    invoke-virtual {p1, v1, v2, v3}, Ll/ܳ᩷ۖ;->ۧ(IJ)V

    .line 16016
    :cond_1
    iget v0, p0, Ll/֫۠᩻;->bitField0_:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-eqz v0, :cond_2

    const/4 v0, 0x3

    .line 16017
    iget-boolean v2, p0, Ll/֫۠᩻;->isCompressed_:Z

    invoke-virtual {p1, v0, v2}, Ll/ܳ᩷ۖ;->֫(IZ)V

    .line 16019
    :cond_2
    iget v0, p0, Ll/֫۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_3

    .line 16020
    iget-wide v2, p0, Ll/֫۠᩻;->decompressedSize_:J

    .line 235
    invoke-virtual {p1, v1, v2, v3}, Ll/ܳ᩷ۖ;->ۧ(IJ)V

    .line 16022
    :cond_3
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۢ֨ۖ;->writeTo(Ll/ܳ᩷ۖ;)V

    return-void
.end method
