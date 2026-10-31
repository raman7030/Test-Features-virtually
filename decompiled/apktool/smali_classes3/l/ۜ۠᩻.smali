.class public final Ll/ۜ۠᩻;
.super Ll/ۘᩴۖ;
.source "C9PC"

# interfaces
.implements Ll/ۢ۠᩻;


# static fields
.field public static final DEFAULT_INSTANCE:Ll/ۜ۠᩻;

.field public static final DST_EXTENT_FIELD_NUMBER:I = 0x3

.field public static final PARSER:Ll/۫֡ۖ;

.field public static final SRC_EXTENT_FIELD_NUMBER:I = 0x2

.field public static final SRC_OFFSET_FIELD_NUMBER:I = 0x4

.field public static final TYPE_FIELD_NUMBER:I = 0x1

.field public static final serialVersionUID:J


# instance fields
.field public bitField0_:I

.field public dstExtent_:Ll/۫۠᩻;

.field public memoizedIsInitialized:B

.field public srcExtent_:Ll/۫۠᩻;

.field public srcOffset_:I

.field public type_:I


# direct methods
.method public static bridge synthetic -$$Nest$fgetbitField0_(Ll/ۜ۠᩻;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۜ۠᩻;->bitField0_:I

    return p0
.end method

.method public static bridge synthetic -$$Nest$fputbitField0_(ILl/ۜ۠᩻;)V
    .locals 0

    .line 0
    iput p0, p1, Ll/ۜ۠᩻;->bitField0_:I

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputdstExtent_(Ll/ۜ۠᩻;Ll/۫۠᩻;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۜ۠᩻;->dstExtent_:Ll/۫۠᩻;

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputsrcExtent_(Ll/ۜ۠᩻;Ll/۫۠᩻;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۜ۠᩻;->srcExtent_:Ll/۫۠᩻;

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputsrcOffset_(ILl/ۜ۠᩻;)V
    .locals 0

    .line 0
    iput p0, p1, Ll/ۜ۠᩻;->srcOffset_:I

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputtype_(ILl/ۜ۠᩻;)V
    .locals 0

    .line 0
    iput p0, p1, Ll/ۜ۠᩻;->type_:I

    return-void
.end method

.method public static constructor <clinit>()V
    .locals 2

    .line 5386
    sget-object v0, Ll/ۜۚۖ;->᩶:Ll/ۜۚۖ;

    const-class v1, Ll/ۜ۠᩻;

    .line 5392
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    .line 5386
    invoke-static {v0, v1}, Ll/᩷ۚۖ;->֫(Ll/ۜۚۖ;Ljava/lang/String;)V

    .line 6459
    new-instance v0, Ll/ۜ۠᩻;

    invoke-direct {v0}, Ll/ۜ۠᩻;-><init>()V

    sput-object v0, Ll/ۜ۠᩻;->DEFAULT_INSTANCE:Ll/ۜ۠᩻;

    .line 6467
    new-instance v0, Ll/ᩳ۠᩻;

    invoke-direct {v0}, Ll/ᩳ۠᩻;-><init>()V

    sput-object v0, Ll/ۜ۠᩻;->PARSER:Ll/۫֡ۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 5398
    invoke-direct {p0}, Ll/ۘᩴۖ;-><init>()V

    const/4 v0, 0x0

    .line 5625
    iput v0, p0, Ll/ۜ۠᩻;->srcOffset_:I

    const/4 v1, -0x1

    .line 5663
    iput-byte v1, p0, Ll/ۜ۠᩻;->memoizedIsInitialized:B

    .line 5399
    iput v0, p0, Ll/ۜ۠᩻;->type_:I

    return-void
.end method

.method public synthetic constructor <init>(Ll/ܿ۠᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ۜ۠᩻;-><init>(Ll/᩶ۘۖ;)V

    return-void
.end method

.method public constructor <init>(Ll/᩶ۘۖ;)V
    .locals 0

    .line 5396
    invoke-direct {p0, p1}, Ll/ۘᩴۖ;-><init>(Ll/᩶ۘۖ;)V

    const/4 p1, 0x0

    .line 5555
    iput p1, p0, Ll/ۜ۠᩻;->type_:I

    .line 5625
    iput p1, p0, Ll/ۜ۠᩻;->srcOffset_:I

    const/4 p1, -0x1

    .line 5663
    iput-byte p1, p0, Ll/ۜ۠᩻;->memoizedIsInitialized:B

    return-void
.end method

.method public static synthetic access$300()Z
    .locals 1

    .line 5380
    sget-boolean v0, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    return v0
.end method

.method public static getDefaultInstance()Ll/ۜ۠᩻;
    .locals 1

    .line 6463
    sget-object v0, Ll/ۜ۠᩻;->DEFAULT_INSTANCE:Ll/ۜ۠᩻;

    return-object v0
.end method

.method public static final getDescriptor()Ll/ᩳۖۖ;
    .locals 1

    .line 5404
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_CowMergeOperation_descriptor()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder()Ll/ܿ۠᩻;
    .locals 1

    .line 5855
    sget-object v0, Ll/ۜ۠᩻;->DEFAULT_INSTANCE:Ll/ۜ۠᩻;

    invoke-virtual {v0}, Ll/ۜ۠᩻;->toBuilder()Ll/ܿ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Ll/ۜ۠᩻;)Ll/ܿ۠᩻;
    .locals 1

    .line 5858
    sget-object v0, Ll/ۜ۠᩻;->DEFAULT_INSTANCE:Ll/ۜ۠᩻;

    invoke-virtual {v0}, Ll/ۜ۠᩻;->toBuilder()Ll/ܿ۠᩻;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/ܿ۠᩻;->mergeFrom(Ll/ۜ۠᩻;)Ll/ܿ۠᩻;

    move-result-object p0

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Ll/ۜ۠᩻;
    .locals 1

    .line 5827
    sget-object v0, Ll/ۜ۠᩻;->PARSER:Ll/۫֡ۖ;

    .line 5828
    invoke-static {v0, p0}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ljava/io/InputStream;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/ۜ۠᩻;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/ۜ۠᩻;
    .locals 1

    .line 5835
    sget-object v0, Ll/ۜ۠᩻;->PARSER:Ll/۫֡ۖ;

    .line 5836
    invoke-static {v0, p0, p1}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/ۜ۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Ll/ۜ۠᩻;
    .locals 1

    .line 5814
    sget-object v0, Ll/ۜ۠᩻;->PARSER:Ll/۫֡ۖ;

    .line 5815
    invoke-static {v0, p0}, Ll/ۘᩴۖ;->ۧ(Ll/۫֡ۖ;Ljava/io/InputStream;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/ۜ۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/ۜ۠᩻;
    .locals 1

    .line 5821
    sget-object v0, Ll/ۜ۠᩻;->PARSER:Ll/۫֡ۖ;

    .line 5822
    invoke-static {v0, p0, p1}, Ll/ۘᩴۖ;->ۧ(Ll/۫֡ۖ;Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/ۜ۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Ll/ۜ۠᩻;
    .locals 1

    .line 5783
    sget-object v0, Ll/ۜ۠᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0}, Ll/۫֡ۖ;->parseFrom(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۜ۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Ll/ᩳۘۖ;)Ll/ۜ۠᩻;
    .locals 1

    .line 5789
    sget-object v0, Ll/ۜ۠᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0, p1}, Ll/۫֡ۖ;->parseFrom(Ljava/nio/ByteBuffer;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۜ۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/ۛۜۖ;)Ll/ۜ۠᩻;
    .locals 1

    .line 5794
    sget-object v0, Ll/ۜ۠᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0}, Ll/۫֡ۖ;->parseFrom(Ll/ۛۜۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۜ۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ll/ۜ۠᩻;
    .locals 1

    .line 5800
    sget-object v0, Ll/ۜ۠᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0, p1}, Ll/۫֡ۖ;->parseFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۜ۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/۟ۜۖ;)Ll/ۜ۠᩻;
    .locals 1

    .line 5841
    sget-object v0, Ll/ۜ۠᩻;->PARSER:Ll/۫֡ۖ;

    .line 5842
    invoke-static {v0, p0}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ll/۟ۜۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/ۜ۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۜ۠᩻;
    .locals 1

    .line 5848
    sget-object v0, Ll/ۜ۠᩻;->PARSER:Ll/۫֡ۖ;

    .line 5849
    invoke-static {v0, p0, p1}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/ۜ۠᩻;

    return-object p0
.end method

.method public static parseFrom([B)Ll/ۜ۠᩻;
    .locals 1

    .line 5804
    sget-object v0, Ll/ۜ۠᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0}, Ll/۫֡ۖ;->parseFrom([B)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۜ۠᩻;

    return-object p0
.end method

.method public static parseFrom([BLl/ᩳۘۖ;)Ll/ۜ۠᩻;
    .locals 1

    .line 5810
    sget-object v0, Ll/ۜ۠᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0, p1}, Ll/۫֡ۖ;->parseFrom([BLl/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۜ۠᩻;

    return-object p0
.end method

.method public static parser()Ll/۫֡ۖ;
    .locals 1

    .line 6489
    sget-object v0, Ll/ۜ۠᩻;->PARSER:Ll/۫֡ۖ;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 5724
    :cond_0
    instance-of v1, p1, Ll/ۜ۠᩻;

    if-nez v1, :cond_1

    .line 5725
    invoke-super {p0, p1}, Ll/ۡۜۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 5727
    :cond_1
    check-cast p1, Ll/ۜ۠᩻;

    .line 5729
    invoke-virtual {p0}, Ll/ۜ۠᩻;->hasType()Z

    move-result v1

    invoke-virtual {p1}, Ll/ۜ۠᩻;->hasType()Z

    move-result v2

    const/4 v3, 0x0

    if-eq v1, v2, :cond_2

    return v3

    .line 5730
    :cond_2
    invoke-virtual {p0}, Ll/ۜ۠᩻;->hasType()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 5731
    iget v1, p0, Ll/ۜ۠᩻;->type_:I

    iget v2, p1, Ll/ۜ۠᩻;->type_:I

    if-eq v1, v2, :cond_3

    return v3

    .line 5733
    :cond_3
    invoke-virtual {p0}, Ll/ۜ۠᩻;->hasSrcExtent()Z

    move-result v1

    invoke-virtual {p1}, Ll/ۜ۠᩻;->hasSrcExtent()Z

    move-result v2

    if-eq v1, v2, :cond_4

    return v3

    .line 5734
    :cond_4
    invoke-virtual {p0}, Ll/ۜ۠᩻;->hasSrcExtent()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 5735
    invoke-virtual {p0}, Ll/ۜ۠᩻;->getSrcExtent()Ll/۫۠᩻;

    move-result-object v1

    .line 5736
    invoke-virtual {p1}, Ll/ۜ۠᩻;->getSrcExtent()Ll/۫۠᩻;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/۫۠᩻;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v3

    .line 5738
    :cond_5
    invoke-virtual {p0}, Ll/ۜ۠᩻;->hasDstExtent()Z

    move-result v1

    invoke-virtual {p1}, Ll/ۜ۠᩻;->hasDstExtent()Z

    move-result v2

    if-eq v1, v2, :cond_6

    return v3

    .line 5739
    :cond_6
    invoke-virtual {p0}, Ll/ۜ۠᩻;->hasDstExtent()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 5740
    invoke-virtual {p0}, Ll/ۜ۠᩻;->getDstExtent()Ll/۫۠᩻;

    move-result-object v1

    .line 5741
    invoke-virtual {p1}, Ll/ۜ۠᩻;->getDstExtent()Ll/۫۠᩻;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/۫۠᩻;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v3

    .line 5743
    :cond_7
    invoke-virtual {p0}, Ll/ۜ۠᩻;->hasSrcOffset()Z

    move-result v1

    invoke-virtual {p1}, Ll/ۜ۠᩻;->hasSrcOffset()Z

    move-result v2

    if-eq v1, v2, :cond_8

    return v3

    .line 5744
    :cond_8
    invoke-virtual {p0}, Ll/ۜ۠᩻;->hasSrcOffset()Z

    move-result v1

    if-eqz v1, :cond_9

    .line 5745
    invoke-virtual {p0}, Ll/ۜ۠᩻;->getSrcOffset()I

    move-result v1

    .line 5746
    invoke-virtual {p1}, Ll/ۜ۠᩻;->getSrcOffset()I

    move-result v2

    if-eq v1, v2, :cond_9

    return v3

    .line 5748
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

.method public getDefaultInstanceForType()Ll/ۜ۠᩻;
    .locals 1

    .line 6499
    sget-object v0, Ll/ۜ۠᩻;->DEFAULT_INSTANCE:Ll/ۜ۠᩻;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 5380
    invoke-virtual {p0}, Ll/ۜ۠᩻;->getDefaultInstanceForType()Ll/ۜ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 5380
    invoke-virtual {p0}, Ll/ۜ۠᩻;->getDefaultInstanceForType()Ll/ۜ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public getDstExtent()Ll/۫۠᩻;
    .locals 1

    .line 5614
    iget-object v0, p0, Ll/ۜ۠᩻;->dstExtent_:Ll/۫۠᩻;

    if-nez v0, :cond_0

    invoke-static {}, Ll/۫۠᩻;->getDefaultInstance()Ll/۫۠᩻;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getDstExtentOrBuilder()Ll/ۛ۠᩻;
    .locals 1

    .line 5621
    iget-object v0, p0, Ll/ۜ۠᩻;->dstExtent_:Ll/۫۠᩻;

    if-nez v0, :cond_0

    invoke-static {}, Ll/۫۠᩻;->getDefaultInstance()Ll/۫۠᩻;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getParserForType()Ll/۫֡ۖ;
    .locals 1

    .line 6494
    sget-object v0, Ll/ۜ۠᩻;->PARSER:Ll/۫֡ۖ;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 4

    .line 5694
    iget v0, p0, Ll/ۡۜۖ;->memoizedSize:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    .line 5698
    :cond_0
    iget v0, p0, Ll/ۜ۠᩻;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    .line 5699
    iget v0, p0, Ll/ۜ۠᩻;->type_:I

    .line 5700
    invoke-static {v1, v0}, Ll/ܳ᩷ۖ;->ܿ(II)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 5702
    :goto_0
    iget v1, p0, Ll/ۜ۠᩻;->bitField0_:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-eqz v1, :cond_2

    .line 5704
    invoke-virtual {p0}, Ll/ۜ۠᩻;->getSrcExtent()Ll/۫۠᩻;

    move-result-object v1

    invoke-static {v2, v1}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v1

    add-int/2addr v0, v1

    .line 5706
    :cond_2
    iget v1, p0, Ll/ۜ۠᩻;->bitField0_:I

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-eqz v1, :cond_3

    const/4 v1, 0x3

    .line 5708
    invoke-virtual {p0}, Ll/ۜ۠᩻;->getDstExtent()Ll/۫۠᩻;

    move-result-object v3

    invoke-static {v1, v3}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v1

    add-int/2addr v0, v1

    .line 5710
    :cond_3
    iget v1, p0, Ll/ۜ۠᩻;->bitField0_:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_4

    .line 5711
    iget v1, p0, Ll/ۜ۠᩻;->srcOffset_:I

    .line 5712
    invoke-static {v2, v1}, Ll/ܳ᩷ۖ;->᩻(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 5714
    :cond_4
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->getSerializedSize()I

    move-result v1

    add-int/2addr v1, v0

    .line 5715
    iput v1, p0, Ll/ۡۜۖ;->memoizedSize:I

    return v1
.end method

.method public getSrcExtent()Ll/۫۠᩻;
    .locals 1

    .line 5588
    iget-object v0, p0, Ll/ۜ۠᩻;->srcExtent_:Ll/۫۠᩻;

    if-nez v0, :cond_0

    invoke-static {}, Ll/۫۠᩻;->getDefaultInstance()Ll/۫۠᩻;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getSrcExtentOrBuilder()Ll/ۛ۠᩻;
    .locals 1

    .line 5595
    iget-object v0, p0, Ll/ۜ۠᩻;->srcExtent_:Ll/۫۠᩻;

    if-nez v0, :cond_0

    invoke-static {}, Ll/۫۠᩻;->getDefaultInstance()Ll/۫۠᩻;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getSrcOffset()I
    .locals 1

    .line 5660
    iget v0, p0, Ll/ۜ۠᩻;->srcOffset_:I

    return v0
.end method

.method public getType()Ll/᩻۠᩻;
    .locals 1

    .line 5568
    iget v0, p0, Ll/ۜ۠᩻;->type_:I

    invoke-static {v0}, Ll/᩻۠᩻;->forNumber(I)Ll/᩻۠᩻;

    move-result-object v0

    if-nez v0, :cond_0

    .line 5569
    sget-object v0, Ll/᩻۠᩻;->COW_COPY:Ll/᩻۠᩻;

    :cond_0
    return-object v0
.end method

.method public hasDstExtent()Z
    .locals 1

    .line 5606
    iget v0, p0, Ll/ۜ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasSrcExtent()Z
    .locals 1

    .line 5580
    iget v0, p0, Ll/ۜ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasSrcOffset()Z
    .locals 1

    .line 5642
    iget v0, p0, Ll/ۜ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasType()Z
    .locals 2

    .line 5561
    iget v0, p0, Ll/ۜ۠᩻;->bitField0_:I

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

    .line 5754
    iget v0, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    if-eqz v0, :cond_0

    return v0

    .line 5758
    :cond_0
    invoke-static {}, Ll/ۜ۠᩻;->getDescriptor()Ll/ᩳۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x30b

    .line 5759
    invoke-virtual {p0}, Ll/ۜ۠᩻;->hasType()Z

    move-result v1

    const/16 v2, 0x35

    const/16 v3, 0x25

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    .line 5760
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 5761
    iget v1, p0, Ll/ۜ۠᩻;->type_:I

    add-int/2addr v0, v1

    .line 5763
    :cond_1
    invoke-virtual {p0}, Ll/ۜ۠᩻;->hasSrcExtent()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    .line 5764
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 5765
    invoke-virtual {p0}, Ll/ۜ۠᩻;->getSrcExtent()Ll/۫۠᩻;

    move-result-object v1

    invoke-virtual {v1}, Ll/۫۠᩻;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 5767
    :cond_2
    invoke-virtual {p0}, Ll/ۜ۠᩻;->hasDstExtent()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x3

    .line 5768
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 5769
    invoke-virtual {p0}, Ll/ۜ۠᩻;->getDstExtent()Ll/۫۠᩻;

    move-result-object v1

    invoke-virtual {v1}, Ll/۫۠᩻;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 5771
    :cond_3
    invoke-virtual {p0}, Ll/ۜ۠᩻;->hasSrcOffset()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x4

    .line 5772
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 5773
    invoke-virtual {p0}, Ll/ۜ۠᩻;->getSrcOffset()I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    mul-int/lit8 v0, v0, 0x1d

    .line 5775
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    .line 5776
    iput v1, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    return v1
.end method

.method public internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 5410
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_CowMergeOperation_fieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/ۜ۠᩻;

    const-class v2, Ll/ܿ۠᩻;

    .line 5411
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 5666
    iget-byte v0, p0, Ll/ۜ۠᩻;->memoizedIsInitialized:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    return v0

    .line 5670
    :cond_1
    iput-byte v1, p0, Ll/ۜ۠᩻;->memoizedIsInitialized:B

    return v1
.end method

.method public bridge synthetic newBuilderForType()Ll/ۢ֡ۖ;
    .locals 1

    .line 5380
    invoke-virtual {p0}, Ll/ۜ۠᩻;->newBuilderForType()Ll/ܿ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Ll/ܳ֡ۖ;
    .locals 1

    .line 5380
    invoke-virtual {p0}, Ll/ۜ۠᩻;->newBuilderForType()Ll/ܿ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Ll/ۢۜۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 5380
    invoke-virtual {p0, p1}, Ll/ۜ۠᩻;->newBuilderForType(Ll/ۢۜۖ;)Ll/ܿ۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public newBuilderForType()Ll/ܿ۠᩻;
    .locals 1

    .line 5853
    invoke-static {}, Ll/ۜ۠᩻;->newBuilder()Ll/ܿ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType(Ll/ۢۜۖ;)Ll/ܿ۠᩻;
    .locals 2

    .line 5869
    new-instance v0, Ll/ܿ۠᩻;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/ܿ۠᩻;-><init>(Ll/ۢۜۖ;I)V

    return-object v0
.end method

.method public bridge synthetic toBuilder()Ll/ۢ֡ۖ;
    .locals 1

    .line 5380
    invoke-virtual {p0}, Ll/ۜ۠᩻;->toBuilder()Ll/ܿ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Ll/ܳ֡ۖ;
    .locals 1

    .line 5380
    invoke-virtual {p0}, Ll/ۜ۠᩻;->toBuilder()Ll/ܿ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Ll/ܿ۠᩻;
    .locals 2

    .line 5862
    sget-object v0, Ll/ۜ۠᩻;->DEFAULT_INSTANCE:Ll/ۜ۠᩻;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    .line 5863
    new-instance v0, Ll/ܿ۠᩻;

    invoke-direct {v0, v1}, Ll/ܿ۠᩻;-><init>(I)V

    return-object v0

    :cond_0
    new-instance v0, Ll/ܿ۠᩻;

    invoke-direct {v0, v1}, Ll/ܿ۠᩻;-><init>(I)V

    invoke-virtual {v0, p0}, Ll/ܿ۠᩻;->mergeFrom(Ll/ۜ۠᩻;)Ll/ܿ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Ll/ܳ᩷ۖ;)V
    .locals 3

    .line 5677
    iget v0, p0, Ll/ۜ۠᩻;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    .line 5678
    iget v0, p0, Ll/ۜ۠᩻;->type_:I

    .line 275
    invoke-virtual {p1, v1, v0}, Ll/ܳ᩷ۖ;->ۧ(II)V

    .line 5680
    :cond_0
    iget v0, p0, Ll/ۜ۠᩻;->bitField0_:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    .line 5681
    invoke-virtual {p0}, Ll/ۜ۠᩻;->getSrcExtent()Ll/۫۠᩻;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    .line 5683
    :cond_1
    iget v0, p0, Ll/ۜ۠᩻;->bitField0_:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-eqz v0, :cond_2

    const/4 v0, 0x3

    .line 5684
    invoke-virtual {p0}, Ll/ۜ۠᩻;->getDstExtent()Ll/۫۠᩻;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    .line 5686
    :cond_2
    iget v0, p0, Ll/ۜ۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_3

    .line 5687
    iget v0, p0, Ll/ۜ۠᩻;->srcOffset_:I

    invoke-virtual {p1, v1, v0}, Ll/ܳ᩷ۖ;->ᩳ(II)V

    .line 5689
    :cond_3
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۢ֨ۖ;->writeTo(Ll/ܳ᩷ۖ;)V

    return-void
.end method
