.class public final Ll/᩵ܶ᩻;
.super Ll/ۘᩴۖ;
.source "C9PC"

# interfaces
.implements Ll/ۚܶ᩻;


# static fields
.field public static final DATA_FIELD_NUMBER:I = 0x2

.field public static final DEFAULT_INSTANCE:Ll/᩵ܶ᩻;

.field public static final PARSER:Ll/۫֡ۖ;

.field public static final UNPADDED_SIGNATURE_SIZE_FIELD_NUMBER:I = 0x3

.field public static final VERSION_FIELD_NUMBER:I = 0x1

.field public static final serialVersionUID:J


# instance fields
.field public bitField0_:I

.field public data_:Ll/ۛۜۖ;

.field public memoizedIsInitialized:B

.field public unpaddedSignatureSize_:I

.field public version_:I


# direct methods
.method public static bridge synthetic -$$Nest$fgetbitField0_(Ll/᩵ܶ᩻;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/᩵ܶ᩻;->bitField0_:I

    return p0
.end method

.method public static bridge synthetic -$$Nest$fputbitField0_(ILl/᩵ܶ᩻;)V
    .locals 0

    .line 0
    iput p0, p1, Ll/᩵ܶ᩻;->bitField0_:I

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputdata_(Ll/᩵ܶ᩻;Ll/ۛۜۖ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩵ܶ᩻;->data_:Ll/ۛۜۖ;

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputunpaddedSignatureSize_(ILl/᩵ܶ᩻;)V
    .locals 0

    .line 0
    iput p0, p1, Ll/᩵ܶ᩻;->unpaddedSignatureSize_:I

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputversion_(ILl/᩵ܶ᩻;)V
    .locals 0

    .line 0
    iput p0, p1, Ll/᩵ܶ᩻;->version_:I

    return-void
.end method

.method public static constructor <clinit>()V
    .locals 2

    .line 773
    sget-object v0, Ll/ۜۚۖ;->᩶:Ll/ۜۚۖ;

    const-class v1, Ll/᩵ܶ᩻;

    .line 779
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    .line 773
    invoke-static {v0, v1}, Ll/᩷ۚۖ;->֫(Ll/ۜۚۖ;Ljava/lang/String;)V

    .line 1417
    new-instance v0, Ll/᩵ܶ᩻;

    invoke-direct {v0}, Ll/᩵ܶ᩻;-><init>()V

    sput-object v0, Ll/᩵ܶ᩻;->DEFAULT_INSTANCE:Ll/᩵ܶ᩻;

    .line 1425
    new-instance v0, Ll/ۘܶ᩻;

    invoke-direct {v0}, Ll/ۘܶ᩻;-><init>()V

    sput-object v0, Ll/᩵ܶ᩻;->PARSER:Ll/۫֡ۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 785
    invoke-direct {p0}, Ll/ۘᩴۖ;-><init>()V

    const/4 v0, 0x0

    .line 804
    iput v0, p0, Ll/᩵ܶ᩻;->version_:I

    .line 827
    sget-object v1, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    .line 846
    iput v0, p0, Ll/᩵ܶ᩻;->unpaddedSignatureSize_:I

    const/4 v0, -0x1

    .line 884
    iput-byte v0, p0, Ll/᩵ܶ᩻;->memoizedIsInitialized:B

    .line 786
    iput-object v1, p0, Ll/᩵ܶ᩻;->data_:Ll/ۛۜۖ;

    return-void
.end method

.method public synthetic constructor <init>(Ll/ᩴܶ᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/᩵ܶ᩻;-><init>(Ll/᩶ۘۖ;)V

    return-void
.end method

.method public constructor <init>(Ll/᩶ۘۖ;)V
    .locals 1

    .line 783
    invoke-direct {p0, p1}, Ll/ۘᩴۖ;-><init>(Ll/᩶ۘۖ;)V

    const/4 p1, 0x0

    .line 804
    iput p1, p0, Ll/᩵ܶ᩻;->version_:I

    .line 827
    sget-object v0, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    iput-object v0, p0, Ll/᩵ܶ᩻;->data_:Ll/ۛۜۖ;

    .line 846
    iput p1, p0, Ll/᩵ܶ᩻;->unpaddedSignatureSize_:I

    const/4 p1, -0x1

    .line 884
    iput-byte p1, p0, Ll/᩵ܶ᩻;->memoizedIsInitialized:B

    return-void
.end method

.method public static getDefaultInstance()Ll/᩵ܶ᩻;
    .locals 1

    .line 1421
    sget-object v0, Ll/᩵ܶ᩻;->DEFAULT_INSTANCE:Ll/᩵ܶ᩻;

    return-object v0
.end method

.method public static final getDescriptor()Ll/ᩳۖۖ;
    .locals 1

    .line 791
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_Signatures_Signature_descriptor()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder()Ll/ᩴܶ᩻;
    .locals 1

    .line 1061
    sget-object v0, Ll/᩵ܶ᩻;->DEFAULT_INSTANCE:Ll/᩵ܶ᩻;

    invoke-virtual {v0}, Ll/᩵ܶ᩻;->toBuilder()Ll/ᩴܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Ll/᩵ܶ᩻;)Ll/ᩴܶ᩻;
    .locals 1

    .line 1064
    sget-object v0, Ll/᩵ܶ᩻;->DEFAULT_INSTANCE:Ll/᩵ܶ᩻;

    invoke-virtual {v0}, Ll/᩵ܶ᩻;->toBuilder()Ll/ᩴܶ᩻;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/ᩴܶ᩻;->mergeFrom(Ll/᩵ܶ᩻;)Ll/ᩴܶ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Ll/᩵ܶ᩻;
    .locals 1

    .line 1033
    sget-object v0, Ll/᩵ܶ᩻;->PARSER:Ll/۫֡ۖ;

    .line 1034
    invoke-static {v0, p0}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ljava/io/InputStream;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/᩵ܶ᩻;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/᩵ܶ᩻;
    .locals 1

    .line 1041
    sget-object v0, Ll/᩵ܶ᩻;->PARSER:Ll/۫֡ۖ;

    .line 1042
    invoke-static {v0, p0, p1}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/᩵ܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Ll/᩵ܶ᩻;
    .locals 1

    .line 1020
    sget-object v0, Ll/᩵ܶ᩻;->PARSER:Ll/۫֡ۖ;

    .line 1021
    invoke-static {v0, p0}, Ll/ۘᩴۖ;->ۧ(Ll/۫֡ۖ;Ljava/io/InputStream;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/᩵ܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/᩵ܶ᩻;
    .locals 1

    .line 1027
    sget-object v0, Ll/᩵ܶ᩻;->PARSER:Ll/۫֡ۖ;

    .line 1028
    invoke-static {v0, p0, p1}, Ll/ۘᩴۖ;->ۧ(Ll/۫֡ۖ;Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/᩵ܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Ll/᩵ܶ᩻;
    .locals 1

    .line 989
    sget-object v0, Ll/᩵ܶ᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0}, Ll/۫֡ۖ;->parseFrom(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩵ܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Ll/ᩳۘۖ;)Ll/᩵ܶ᩻;
    .locals 1

    .line 995
    sget-object v0, Ll/᩵ܶ᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0, p1}, Ll/۫֡ۖ;->parseFrom(Ljava/nio/ByteBuffer;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩵ܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/ۛۜۖ;)Ll/᩵ܶ᩻;
    .locals 1

    .line 1000
    sget-object v0, Ll/᩵ܶ᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0}, Ll/۫֡ۖ;->parseFrom(Ll/ۛۜۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩵ܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ll/᩵ܶ᩻;
    .locals 1

    .line 1006
    sget-object v0, Ll/᩵ܶ᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0, p1}, Ll/۫֡ۖ;->parseFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩵ܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/۟ۜۖ;)Ll/᩵ܶ᩻;
    .locals 1

    .line 1047
    sget-object v0, Ll/᩵ܶ᩻;->PARSER:Ll/۫֡ۖ;

    .line 1048
    invoke-static {v0, p0}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ll/۟ۜۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/᩵ܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩵ܶ᩻;
    .locals 1

    .line 1054
    sget-object v0, Ll/᩵ܶ᩻;->PARSER:Ll/۫֡ۖ;

    .line 1055
    invoke-static {v0, p0, p1}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/᩵ܶ᩻;

    return-object p0
.end method

.method public static parseFrom([B)Ll/᩵ܶ᩻;
    .locals 1

    .line 1010
    sget-object v0, Ll/᩵ܶ᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0}, Ll/۫֡ۖ;->parseFrom([B)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩵ܶ᩻;

    return-object p0
.end method

.method public static parseFrom([BLl/ᩳۘۖ;)Ll/᩵ܶ᩻;
    .locals 1

    .line 1016
    sget-object v0, Ll/᩵ܶ᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0, p1}, Ll/۫֡ۖ;->parseFrom([BLl/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩵ܶ᩻;

    return-object p0
.end method

.method public static parser()Ll/۫֡ۖ;
    .locals 1

    .line 1447
    sget-object v0, Ll/᩵ܶ᩻;->PARSER:Ll/۫֡ۖ;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 938
    :cond_0
    instance-of v1, p1, Ll/᩵ܶ᩻;

    if-nez v1, :cond_1

    .line 939
    invoke-super {p0, p1}, Ll/ۡۜۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 941
    :cond_1
    check-cast p1, Ll/᩵ܶ᩻;

    .line 943
    invoke-virtual {p0}, Ll/᩵ܶ᩻;->hasVersion()Z

    move-result v1

    invoke-virtual {p1}, Ll/᩵ܶ᩻;->hasVersion()Z

    move-result v2

    const/4 v3, 0x0

    if-eq v1, v2, :cond_2

    return v3

    .line 944
    :cond_2
    invoke-virtual {p0}, Ll/᩵ܶ᩻;->hasVersion()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 945
    invoke-virtual {p0}, Ll/᩵ܶ᩻;->getVersion()I

    move-result v1

    .line 946
    invoke-virtual {p1}, Ll/᩵ܶ᩻;->getVersion()I

    move-result v2

    if-eq v1, v2, :cond_3

    return v3

    .line 948
    :cond_3
    invoke-virtual {p0}, Ll/᩵ܶ᩻;->hasData()Z

    move-result v1

    invoke-virtual {p1}, Ll/᩵ܶ᩻;->hasData()Z

    move-result v2

    if-eq v1, v2, :cond_4

    return v3

    .line 949
    :cond_4
    invoke-virtual {p0}, Ll/᩵ܶ᩻;->hasData()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 950
    invoke-virtual {p0}, Ll/᩵ܶ᩻;->getData()Ll/ۛۜۖ;

    move-result-object v1

    .line 951
    invoke-virtual {p1}, Ll/᩵ܶ᩻;->getData()Ll/ۛۜۖ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۛۜۖ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v3

    .line 953
    :cond_5
    invoke-virtual {p0}, Ll/᩵ܶ᩻;->hasUnpaddedSignatureSize()Z

    move-result v1

    invoke-virtual {p1}, Ll/᩵ܶ᩻;->hasUnpaddedSignatureSize()Z

    move-result v2

    if-eq v1, v2, :cond_6

    return v3

    .line 954
    :cond_6
    invoke-virtual {p0}, Ll/᩵ܶ᩻;->hasUnpaddedSignatureSize()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 955
    invoke-virtual {p0}, Ll/᩵ܶ᩻;->getUnpaddedSignatureSize()I

    move-result v1

    .line 956
    invoke-virtual {p1}, Ll/᩵ܶ᩻;->getUnpaddedSignatureSize()I

    move-result v2

    if-eq v1, v2, :cond_7

    return v3

    .line 958
    :cond_7
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/ۢ֨ۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v3

    :cond_8
    return v0
.end method

.method public getData()Ll/ۛۜۖ;
    .locals 1

    .line 842
    iget-object v0, p0, Ll/᩵ܶ᩻;->data_:Ll/ۛۜۖ;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 767
    invoke-virtual {p0}, Ll/᩵ܶ᩻;->getDefaultInstanceForType()Ll/᩵ܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Ll/᩵ܶ᩻;
    .locals 1

    .line 1457
    sget-object v0, Ll/᩵ܶ᩻;->DEFAULT_INSTANCE:Ll/᩵ܶ᩻;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 767
    invoke-virtual {p0}, Ll/᩵ܶ᩻;->getDefaultInstanceForType()Ll/᩵ܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public getParserForType()Ll/۫֡ۖ;
    .locals 1

    .line 1452
    sget-object v0, Ll/᩵ܶ᩻;->PARSER:Ll/۫֡ۖ;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 3

    .line 912
    iget v0, p0, Ll/ۡۜۖ;->memoizedSize:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    .line 916
    :cond_0
    iget v0, p0, Ll/᩵ܶ᩻;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    .line 917
    iget v0, p0, Ll/᩵ܶ᩻;->version_:I

    .line 918
    invoke-static {v1, v0}, Ll/ܳ᩷ۖ;->᩻(II)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 920
    :goto_0
    iget v1, p0, Ll/᩵ܶ᩻;->bitField0_:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-eqz v1, :cond_2

    .line 921
    iget-object v1, p0, Ll/᩵ܶ᩻;->data_:Ll/ۛۜۖ;

    .line 922
    invoke-static {v2, v1}, Ll/ܳ᩷ۖ;->ܽ(ILl/ۛۜۖ;)I

    move-result v1

    add-int/2addr v0, v1

    .line 924
    :cond_2
    iget v1, p0, Ll/᩵ܶ᩻;->bitField0_:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_3

    const/4 v1, 0x3

    .line 926
    invoke-static {v1}, Ll/ܳ᩷ۖ;->ܿ(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 928
    :cond_3
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->getSerializedSize()I

    move-result v1

    add-int/2addr v1, v0

    .line 929
    iput v1, p0, Ll/ۡۜۖ;->memoizedSize:I

    return v1
.end method

.method public getUnpaddedSignatureSize()I
    .locals 1

    .line 881
    iget v0, p0, Ll/᩵ܶ᩻;->unpaddedSignatureSize_:I

    return v0
.end method

.method public getVersion()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 823
    iget v0, p0, Ll/᩵ܶ᩻;->version_:I

    return v0
.end method

.method public hasData()Z
    .locals 1

    .line 834
    iget v0, p0, Ll/᩵ܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasUnpaddedSignatureSize()Z
    .locals 1

    .line 863
    iget v0, p0, Ll/᩵ܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasVersion()Z
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 813
    iget v0, p0, Ll/᩵ܶ᩻;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 4

    .line 964
    iget v0, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    if-eqz v0, :cond_0

    return v0

    .line 968
    :cond_0
    invoke-static {}, Ll/᩵ܶ᩻;->getDescriptor()Ll/ᩳۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x30b

    .line 969
    invoke-virtual {p0}, Ll/᩵ܶ᩻;->hasVersion()Z

    move-result v1

    const/16 v2, 0x35

    const/16 v3, 0x25

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    .line 970
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 971
    invoke-virtual {p0}, Ll/᩵ܶ᩻;->getVersion()I

    move-result v1

    add-int/2addr v0, v1

    .line 973
    :cond_1
    invoke-virtual {p0}, Ll/᩵ܶ᩻;->hasData()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    .line 974
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 975
    invoke-virtual {p0}, Ll/᩵ܶ᩻;->getData()Ll/ۛۜۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۛۜۖ;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 977
    :cond_2
    invoke-virtual {p0}, Ll/᩵ܶ᩻;->hasUnpaddedSignatureSize()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x3

    .line 978
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 979
    invoke-virtual {p0}, Ll/᩵ܶ᩻;->getUnpaddedSignatureSize()I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    mul-int/lit8 v0, v0, 0x1d

    .line 981
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    .line 982
    iput v1, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    return v1
.end method

.method public internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 797
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_Signatures_Signature_fieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/᩵ܶ᩻;

    const-class v2, Ll/ᩴܶ᩻;

    .line 798
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 887
    iget-byte v0, p0, Ll/᩵ܶ᩻;->memoizedIsInitialized:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    return v0

    .line 891
    :cond_1
    iput-byte v1, p0, Ll/᩵ܶ᩻;->memoizedIsInitialized:B

    return v1
.end method

.method public bridge synthetic newBuilderForType()Ll/ۢ֡ۖ;
    .locals 1

    .line 767
    invoke-virtual {p0}, Ll/᩵ܶ᩻;->newBuilderForType()Ll/ᩴܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Ll/ܳ֡ۖ;
    .locals 1

    .line 767
    invoke-virtual {p0}, Ll/᩵ܶ᩻;->newBuilderForType()Ll/ᩴܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Ll/ۢۜۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 767
    invoke-virtual {p0, p1}, Ll/᩵ܶ᩻;->newBuilderForType(Ll/ۢۜۖ;)Ll/ᩴܶ᩻;

    move-result-object p1

    return-object p1
.end method

.method public newBuilderForType()Ll/ᩴܶ᩻;
    .locals 1

    .line 1059
    invoke-static {}, Ll/᩵ܶ᩻;->newBuilder()Ll/ᩴܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType(Ll/ۢۜۖ;)Ll/ᩴܶ᩻;
    .locals 2

    .line 1075
    new-instance v0, Ll/ᩴܶ᩻;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/ᩴܶ᩻;-><init>(Ll/ۢۜۖ;I)V

    return-object v0
.end method

.method public bridge synthetic toBuilder()Ll/ۢ֡ۖ;
    .locals 1

    .line 767
    invoke-virtual {p0}, Ll/᩵ܶ᩻;->toBuilder()Ll/ᩴܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Ll/ܳ֡ۖ;
    .locals 1

    .line 767
    invoke-virtual {p0}, Ll/᩵ܶ᩻;->toBuilder()Ll/ᩴܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Ll/ᩴܶ᩻;
    .locals 2

    .line 1068
    sget-object v0, Ll/᩵ܶ᩻;->DEFAULT_INSTANCE:Ll/᩵ܶ᩻;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    .line 1069
    new-instance v0, Ll/ᩴܶ᩻;

    invoke-direct {v0, v1}, Ll/ᩴܶ᩻;-><init>(I)V

    return-object v0

    :cond_0
    new-instance v0, Ll/ᩴܶ᩻;

    invoke-direct {v0, v1}, Ll/ᩴܶ᩻;-><init>(I)V

    invoke-virtual {v0, p0}, Ll/ᩴܶ᩻;->mergeFrom(Ll/᩵ܶ᩻;)Ll/ᩴܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Ll/ܳ᩷ۖ;)V
    .locals 2

    .line 898
    iget v0, p0, Ll/᩵ܶ᩻;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    .line 899
    iget v0, p0, Ll/᩵ܶ᩻;->version_:I

    invoke-virtual {p1, v1, v0}, Ll/ܳ᩷ۖ;->ᩳ(II)V

    .line 901
    :cond_0
    iget v0, p0, Ll/᩵ܶ᩻;->bitField0_:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    .line 902
    iget-object v0, p0, Ll/᩵ܶ᩻;->data_:Ll/ۛۜۖ;

    invoke-virtual {p1, v1, v0}, Ll/ܳ᩷ۖ;->֫(ILl/ۛۜۖ;)V

    .line 904
    :cond_1
    iget v0, p0, Ll/᩵ܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_2

    const/4 v0, 0x3

    .line 905
    iget v1, p0, Ll/᩵ܶ᩻;->unpaddedSignatureSize_:I

    invoke-virtual {p1, v0, v1}, Ll/ܳ᩷ۖ;->֫(II)V

    .line 907
    :cond_2
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۢ֨ۖ;->writeTo(Ll/ܳ᩷ۖ;)V

    return-void
.end method
