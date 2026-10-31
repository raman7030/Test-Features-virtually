.class public final Ll/ۚ۠᩻;
.super Ll/ۘᩴۖ;
.source "C9PC"

# interfaces
.implements Ll/۠۠᩻;


# static fields
.field public static final DEFAULT_INSTANCE:Ll/ۚ۠᩻;

.field public static final NAME_FIELD_NUMBER:I = 0x1

.field public static final PARSER:Ll/۫֡ۖ;

.field public static final PARTITION_NAMES_FIELD_NUMBER:I = 0x3

.field public static final SIZE_FIELD_NUMBER:I = 0x2

.field public static final serialVersionUID:J


# instance fields
.field public bitField0_:I

.field public memoizedIsInitialized:B

.field public volatile name_:Ljava/lang/Object;

.field public partitionNames_:Ll/ۖ᩵ۖ;

.field public size_:J


# direct methods
.method public static bridge synthetic -$$Nest$fgetbitField0_(Ll/ۚ۠᩻;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۚ۠᩻;->bitField0_:I

    return p0
.end method

.method public static bridge synthetic -$$Nest$fgetname_(Ll/ۚ۠᩻;)Ljava/lang/Object;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚ۠᩻;->name_:Ljava/lang/Object;

    return-object p0
.end method

.method public static bridge synthetic -$$Nest$fgetpartitionNames_(Ll/ۚ۠᩻;)Ll/ۖ᩵ۖ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚ۠᩻;->partitionNames_:Ll/ۖ᩵ۖ;

    return-object p0
.end method

.method public static bridge synthetic -$$Nest$fputbitField0_(ILl/ۚ۠᩻;)V
    .locals 0

    .line 0
    iput p0, p1, Ll/ۚ۠᩻;->bitField0_:I

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputname_(Ll/ۚ۠᩻;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۚ۠᩻;->name_:Ljava/lang/Object;

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputpartitionNames_(Ll/ۚ۠᩻;Ll/ۖ᩵ۖ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۚ۠᩻;->partitionNames_:Ll/ۖ᩵ۖ;

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputsize_(Ll/ۚ۠᩻;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/ۚ۠᩻;->size_:J

    return-void
.end method

.method public static constructor <clinit>()V
    .locals 2

    .line 12193
    sget-object v0, Ll/ۜۚۖ;->᩶:Ll/ۜۚۖ;

    const-class v1, Ll/ۚ۠᩻;

    .line 12199
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    .line 12193
    invoke-static {v0, v1}, Ll/᩷ۚۖ;->֫(Ll/ۜۚۖ;Ljava/lang/String;)V

    .line 13062
    new-instance v0, Ll/ۚ۠᩻;

    invoke-direct {v0}, Ll/ۚ۠᩻;-><init>()V

    sput-object v0, Ll/ۚ۠᩻;->DEFAULT_INSTANCE:Ll/ۚ۠᩻;

    .line 13070
    new-instance v0, Ll/᩵۠᩻;

    invoke-direct {v0}, Ll/᩵۠᩻;-><init>()V

    sput-object v0, Ll/ۚ۠᩻;->PARSER:Ll/۫֡ۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 12205
    invoke-direct {p0}, Ll/ۘᩴۖ;-><init>()V

    const-string v0, ""

    .line 12226
    iput-object v0, p0, Ll/ۚ۠᩻;->name_:Ljava/lang/Object;

    const-wide/16 v1, 0x0

    .line 12287
    iput-wide v1, p0, Ll/ۚ۠᩻;->size_:J

    .line 12318
    invoke-static {}, Ll/ۖ᩵ۖ;->ܽ()Ll/ۖ᩵ۖ;

    move-result-object v1

    iput-object v1, p0, Ll/ۚ۠᩻;->partitionNames_:Ll/ۖ᩵ۖ;

    const/4 v1, -0x1

    .line 12368
    iput-byte v1, p0, Ll/ۚ۠᩻;->memoizedIsInitialized:B

    .line 12206
    iput-object v0, p0, Ll/ۚ۠᩻;->name_:Ljava/lang/Object;

    .line 12208
    invoke-static {}, Ll/ۖ᩵ۖ;->ܽ()Ll/ۖ᩵ۖ;

    move-result-object v0

    iput-object v0, p0, Ll/ۚ۠᩻;->partitionNames_:Ll/ۖ᩵ۖ;

    return-void
.end method

.method public synthetic constructor <init>(Ll/֡۠᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ۚ۠᩻;-><init>(Ll/᩶ۘۖ;)V

    return-void
.end method

.method public constructor <init>(Ll/᩶ۘۖ;)V
    .locals 2

    .line 12203
    invoke-direct {p0, p1}, Ll/ۘᩴۖ;-><init>(Ll/᩶ۘۖ;)V

    const-string p1, ""

    .line 12226
    iput-object p1, p0, Ll/ۚ۠᩻;->name_:Ljava/lang/Object;

    const-wide/16 v0, 0x0

    .line 12287
    iput-wide v0, p0, Ll/ۚ۠᩻;->size_:J

    .line 12318
    invoke-static {}, Ll/ۖ᩵ۖ;->ܽ()Ll/ۖ᩵ۖ;

    move-result-object p1

    iput-object p1, p0, Ll/ۚ۠᩻;->partitionNames_:Ll/ۖ᩵ۖ;

    const/4 p1, -0x1

    .line 12368
    iput-byte p1, p0, Ll/ۚ۠᩻;->memoizedIsInitialized:B

    return-void
.end method

.method public static getDefaultInstance()Ll/ۚ۠᩻;
    .locals 1

    .line 13066
    sget-object v0, Ll/ۚ۠᩻;->DEFAULT_INSTANCE:Ll/ۚ۠᩻;

    return-object v0
.end method

.method public static final getDescriptor()Ll/ᩳۖۖ;
    .locals 1

    .line 12213
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_DynamicPartitionGroup_descriptor()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder()Ll/֡۠᩻;
    .locals 1

    .line 12550
    sget-object v0, Ll/ۚ۠᩻;->DEFAULT_INSTANCE:Ll/ۚ۠᩻;

    invoke-virtual {v0}, Ll/ۚ۠᩻;->toBuilder()Ll/֡۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Ll/ۚ۠᩻;)Ll/֡۠᩻;
    .locals 1

    .line 12553
    sget-object v0, Ll/ۚ۠᩻;->DEFAULT_INSTANCE:Ll/ۚ۠᩻;

    invoke-virtual {v0}, Ll/ۚ۠᩻;->toBuilder()Ll/֡۠᩻;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/֡۠᩻;->mergeFrom(Ll/ۚ۠᩻;)Ll/֡۠᩻;

    move-result-object p0

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Ll/ۚ۠᩻;
    .locals 1

    .line 12522
    sget-object v0, Ll/ۚ۠᩻;->PARSER:Ll/۫֡ۖ;

    .line 12523
    invoke-static {v0, p0}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ljava/io/InputStream;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/ۚ۠᩻;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/ۚ۠᩻;
    .locals 1

    .line 12530
    sget-object v0, Ll/ۚ۠᩻;->PARSER:Ll/۫֡ۖ;

    .line 12531
    invoke-static {v0, p0, p1}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/ۚ۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Ll/ۚ۠᩻;
    .locals 1

    .line 12509
    sget-object v0, Ll/ۚ۠᩻;->PARSER:Ll/۫֡ۖ;

    .line 12510
    invoke-static {v0, p0}, Ll/ۘᩴۖ;->ۧ(Ll/۫֡ۖ;Ljava/io/InputStream;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/ۚ۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/ۚ۠᩻;
    .locals 1

    .line 12516
    sget-object v0, Ll/ۚ۠᩻;->PARSER:Ll/۫֡ۖ;

    .line 12517
    invoke-static {v0, p0, p1}, Ll/ۘᩴۖ;->ۧ(Ll/۫֡ۖ;Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/ۚ۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Ll/ۚ۠᩻;
    .locals 1

    .line 12478
    sget-object v0, Ll/ۚ۠᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0}, Ll/۫֡ۖ;->parseFrom(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۚ۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Ll/ᩳۘۖ;)Ll/ۚ۠᩻;
    .locals 1

    .line 12484
    sget-object v0, Ll/ۚ۠᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0, p1}, Ll/۫֡ۖ;->parseFrom(Ljava/nio/ByteBuffer;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۚ۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/ۛۜۖ;)Ll/ۚ۠᩻;
    .locals 1

    .line 12489
    sget-object v0, Ll/ۚ۠᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0}, Ll/۫֡ۖ;->parseFrom(Ll/ۛۜۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۚ۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ll/ۚ۠᩻;
    .locals 1

    .line 12495
    sget-object v0, Ll/ۚ۠᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0, p1}, Ll/۫֡ۖ;->parseFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۚ۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/۟ۜۖ;)Ll/ۚ۠᩻;
    .locals 1

    .line 12536
    sget-object v0, Ll/ۚ۠᩻;->PARSER:Ll/۫֡ۖ;

    .line 12537
    invoke-static {v0, p0}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ll/۟ۜۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/ۚ۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۚ۠᩻;
    .locals 1

    .line 12543
    sget-object v0, Ll/ۚ۠᩻;->PARSER:Ll/۫֡ۖ;

    .line 12544
    invoke-static {v0, p0, p1}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/ۚ۠᩻;

    return-object p0
.end method

.method public static parseFrom([B)Ll/ۚ۠᩻;
    .locals 1

    .line 12499
    sget-object v0, Ll/ۚ۠᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0}, Ll/۫֡ۖ;->parseFrom([B)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۚ۠᩻;

    return-object p0
.end method

.method public static parseFrom([BLl/ᩳۘۖ;)Ll/ۚ۠᩻;
    .locals 1

    .line 12505
    sget-object v0, Ll/ۚ۠᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0, p1}, Ll/۫֡ۖ;->parseFrom([BLl/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۚ۠᩻;

    return-object p0
.end method

.method public static parser()Ll/۫֡ۖ;
    .locals 1

    .line 13092
    sget-object v0, Ll/ۚ۠᩻;->PARSER:Ll/۫֡ۖ;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 12429
    :cond_0
    instance-of v1, p1, Ll/ۚ۠᩻;

    if-nez v1, :cond_1

    .line 12430
    invoke-super {p0, p1}, Ll/ۡۜۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 12432
    :cond_1
    check-cast p1, Ll/ۚ۠᩻;

    .line 12434
    invoke-virtual {p0}, Ll/ۚ۠᩻;->hasName()Z

    move-result v1

    invoke-virtual {p1}, Ll/ۚ۠᩻;->hasName()Z

    move-result v2

    const/4 v3, 0x0

    if-eq v1, v2, :cond_2

    return v3

    .line 12435
    :cond_2
    invoke-virtual {p0}, Ll/ۚ۠᩻;->hasName()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 12436
    invoke-virtual {p0}, Ll/ۚ۠᩻;->getName()Ljava/lang/String;

    move-result-object v1

    .line 12437
    invoke-virtual {p1}, Ll/ۚ۠᩻;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v3

    .line 12439
    :cond_3
    invoke-virtual {p0}, Ll/ۚ۠᩻;->hasSize()Z

    move-result v1

    invoke-virtual {p1}, Ll/ۚ۠᩻;->hasSize()Z

    move-result v2

    if-eq v1, v2, :cond_4

    return v3

    .line 12440
    :cond_4
    invoke-virtual {p0}, Ll/ۚ۠᩻;->hasSize()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 12441
    invoke-virtual {p0}, Ll/ۚ۠᩻;->getSize()J

    move-result-wide v1

    .line 12442
    invoke-virtual {p1}, Ll/ۚ۠᩻;->getSize()J

    move-result-wide v4

    cmp-long v6, v1, v4

    if-eqz v6, :cond_5

    return v3

    .line 12444
    :cond_5
    invoke-virtual {p0}, Ll/ۚ۠᩻;->getPartitionNamesList()Ll/۟֡ۖ;

    move-result-object v1

    .line 12445
    invoke-virtual {p1}, Ll/ۚ۠᩻;->getPartitionNamesList()Ll/۟֡ۖ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v3

    .line 12446
    :cond_6
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/ۢ֨ۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v3

    :cond_7
    return v0
.end method

.method public getDefaultInstanceForType()Ll/ۚ۠᩻;
    .locals 1

    .line 13102
    sget-object v0, Ll/ۚ۠᩻;->DEFAULT_INSTANCE:Ll/ۚ۠᩻;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 12187
    invoke-virtual {p0}, Ll/ۚ۠᩻;->getDefaultInstanceForType()Ll/ۚ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 12187
    invoke-virtual {p0}, Ll/ۚ۠᩻;->getDefaultInstanceForType()Ll/ۚ۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 2

    .line 12250
    iget-object v0, p0, Ll/ۚ۠᩻;->name_:Ljava/lang/Object;

    .line 12251
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 12252
    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 12254
    :cond_0
    check-cast v0, Ll/ۛۜۖ;

    .line 12256
    invoke-virtual {v0}, Ll/ۛۜۖ;->ܳ()Ljava/lang/String;

    move-result-object v1

    .line 12257
    invoke-virtual {v0}, Ll/ۛۜۖ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 12258
    iput-object v1, p0, Ll/ۚ۠᩻;->name_:Ljava/lang/Object;

    :cond_1
    return-object v1
.end method

.method public getNameBytes()Ll/ۛۜۖ;
    .locals 2

    .line 12274
    iget-object v0, p0, Ll/ۚ۠᩻;->name_:Ljava/lang/Object;

    .line 12275
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 12276
    check-cast v0, Ljava/lang/String;

    .line 12277
    invoke-static {v0}, Ll/ۛۜۖ;->֫(Ljava/lang/String;)Ll/ۛۜۖ;

    move-result-object v0

    .line 12279
    iput-object v0, p0, Ll/ۚ۠᩻;->name_:Ljava/lang/Object;

    return-object v0

    .line 12282
    :cond_0
    check-cast v0, Ll/ۛۜۖ;

    return-object v0
.end method

.method public getParserForType()Ll/۫֡ۖ;
    .locals 1

    .line 13097
    sget-object v0, Ll/ۚ۠᩻;->PARSER:Ll/۫֡ۖ;

    return-object v0
.end method

.method public getPartitionNames(I)Ljava/lang/String;
    .locals 1

    .line 12352
    iget-object v0, p0, Ll/ۚ۠᩻;->partitionNames_:Ll/ۖ᩵ۖ;

    invoke-virtual {v0, p1}, Ll/ۖ᩵ۖ;->get(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getPartitionNamesBytes(I)Ll/ۛۜۖ;
    .locals 1

    .line 12365
    iget-object v0, p0, Ll/ۚ۠᩻;->partitionNames_:Ll/ۖ᩵ۖ;

    invoke-virtual {v0, p1}, Ll/ۖ᩵ۖ;->֫(I)Ll/ۛۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public getPartitionNamesCount()I
    .locals 1

    .line 12340
    iget-object v0, p0, Ll/ۚ۠᩻;->partitionNames_:Ll/ۖ᩵ۖ;

    invoke-virtual {v0}, Ll/ۖ᩵ۖ;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getPartitionNamesList()Ljava/util/List;
    .locals 1

    .line 12187
    invoke-virtual {p0}, Ll/ۚ۠᩻;->getPartitionNamesList()Ll/۟֡ۖ;

    move-result-object v0

    return-object v0
.end method

.method public getPartitionNamesList()Ll/۟֡ۖ;
    .locals 1

    .line 12329
    iget-object v0, p0, Ll/ۚ۠᩻;->partitionNames_:Ll/ۖ᩵ۖ;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 6

    .line 12400
    iget v0, p0, Ll/ۡۜۖ;->memoizedSize:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    .line 12404
    :cond_0
    iget v0, p0, Ll/ۚ۠᩻;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 12405
    iget-object v0, p0, Ll/ۚ۠᩻;->name_:Ljava/lang/Object;

    invoke-static {v1, v0}, Ll/ۘᩴۖ;->֫(ILjava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 12407
    :goto_0
    iget v1, p0, Ll/ۚ۠᩻;->bitField0_:I

    const/4 v3, 0x2

    and-int/2addr v1, v3

    if-eqz v1, :cond_2

    .line 12408
    iget-wide v4, p0, Ll/ۚ۠᩻;->size_:J

    .line 12409
    invoke-static {v3, v4, v5}, Ll/ܳ᩷ۖ;->ᩳ(IJ)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    const/4 v1, 0x0

    .line 12413
    :goto_1
    iget-object v3, p0, Ll/ۚ۠᩻;->partitionNames_:Ll/ۖ᩵ۖ;

    invoke-virtual {v3}, Ll/ۖ᩵ۖ;->size()I

    move-result v3

    if-ge v2, v3, :cond_3

    .line 12414
    iget-object v3, p0, Ll/ۚ۠᩻;->partitionNames_:Ll/ۖ᩵ۖ;

    invoke-virtual {v3, v2}, Ll/ۖ᩵ۖ;->᩵(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ll/ۘᩴۖ;->ܽ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v1, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    add-int/2addr v0, v1

    .line 12417
    invoke-virtual {p0}, Ll/ۚ۠᩻;->getPartitionNamesList()Ll/۟֡ۖ;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v1, v0

    .line 12419
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢ֨ۖ;->getSerializedSize()I

    move-result v0

    add-int/2addr v0, v1

    .line 12420
    iput v0, p0, Ll/ۡۜۖ;->memoizedSize:I

    return v0
.end method

.method public getSize()J
    .locals 2

    .line 12312
    iget-wide v0, p0, Ll/ۚ۠᩻;->size_:J

    return-wide v0
.end method

.method public hasName()Z
    .locals 2

    .line 12238
    iget v0, p0, Ll/ۚ۠᩻;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasSize()Z
    .locals 1

    .line 12299
    iget v0, p0, Ll/ۚ۠᩻;->bitField0_:I

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

    .line 12452
    iget v0, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    if-eqz v0, :cond_0

    return v0

    .line 12456
    :cond_0
    invoke-static {}, Ll/ۚ۠᩻;->getDescriptor()Ll/ᩳۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x30b

    .line 12457
    invoke-virtual {p0}, Ll/ۚ۠᩻;->hasName()Z

    move-result v1

    const/16 v2, 0x35

    const/16 v3, 0x25

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    .line 12458
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 12459
    invoke-virtual {p0}, Ll/ۚ۠᩻;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 12461
    :cond_1
    invoke-virtual {p0}, Ll/ۚ۠᩻;->hasSize()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    .line 12462
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 12464
    invoke-virtual {p0}, Ll/ۚ۠᩻;->getSize()J

    move-result-wide v4

    .line 12463
    invoke-static {v4, v5}, Ll/ܰᩴۖ;->֫(J)I

    move-result v1

    add-int/2addr v0, v1

    .line 12466
    :cond_2
    invoke-virtual {p0}, Ll/ۚ۠᩻;->getPartitionNamesCount()I

    move-result v1

    if-lez v1, :cond_3

    const/4 v1, 0x3

    .line 12467
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 12468
    invoke-virtual {p0}, Ll/ۚ۠᩻;->getPartitionNamesList()Ll/۟֡ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    mul-int/lit8 v0, v0, 0x1d

    .line 12470
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    .line 12471
    iput v1, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    return v1
.end method

.method public internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 12219
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_DynamicPartitionGroup_fieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/ۚ۠᩻;

    const-class v2, Ll/֡۠᩻;

    .line 12220
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 3

    .line 12371
    iget-byte v0, p0, Ll/ۚ۠᩻;->memoizedIsInitialized:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    .line 12375
    :cond_1
    invoke-virtual {p0}, Ll/ۚ۠᩻;->hasName()Z

    move-result v0

    if-nez v0, :cond_2

    .line 12376
    iput-byte v2, p0, Ll/ۚ۠᩻;->memoizedIsInitialized:B

    return v2

    .line 12379
    :cond_2
    iput-byte v1, p0, Ll/ۚ۠᩻;->memoizedIsInitialized:B

    return v1
.end method

.method public newBuilderForType()Ll/֡۠᩻;
    .locals 1

    .line 12548
    invoke-static {}, Ll/ۚ۠᩻;->newBuilder()Ll/֡۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType(Ll/ۢۜۖ;)Ll/֡۠᩻;
    .locals 2

    .line 12564
    new-instance v0, Ll/֡۠᩻;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/֡۠᩻;-><init>(Ll/ۢۜۖ;I)V

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Ll/ۢ֡ۖ;
    .locals 1

    .line 12187
    invoke-virtual {p0}, Ll/ۚ۠᩻;->newBuilderForType()Ll/֡۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Ll/ܳ֡ۖ;
    .locals 1

    .line 12187
    invoke-virtual {p0}, Ll/ۚ۠᩻;->newBuilderForType()Ll/֡۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Ll/ۢۜۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 12187
    invoke-virtual {p0, p1}, Ll/ۚ۠᩻;->newBuilderForType(Ll/ۢۜۖ;)Ll/֡۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public toBuilder()Ll/֡۠᩻;
    .locals 2

    .line 12557
    sget-object v0, Ll/ۚ۠᩻;->DEFAULT_INSTANCE:Ll/ۚ۠᩻;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    .line 12558
    new-instance v0, Ll/֡۠᩻;

    invoke-direct {v0, v1}, Ll/֡۠᩻;-><init>(I)V

    return-object v0

    :cond_0
    new-instance v0, Ll/֡۠᩻;

    invoke-direct {v0, v1}, Ll/֡۠᩻;-><init>(I)V

    invoke-virtual {v0, p0}, Ll/֡۠᩻;->mergeFrom(Ll/ۚ۠᩻;)Ll/֡۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Ll/ۢ֡ۖ;
    .locals 1

    .line 12187
    invoke-virtual {p0}, Ll/ۚ۠᩻;->toBuilder()Ll/֡۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Ll/ܳ֡ۖ;
    .locals 1

    .line 12187
    invoke-virtual {p0}, Ll/ۚ۠᩻;->toBuilder()Ll/֡۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Ll/ܳ᩷ۖ;)V
    .locals 4

    .line 12386
    iget v0, p0, Ll/ۚ۠᩻;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    .line 12387
    iget-object v0, p0, Ll/ۚ۠᩻;->name_:Ljava/lang/Object;

    invoke-static {p1, v1, v0}, Ll/ۘᩴۖ;->֫(Ll/ܳ᩷ۖ;ILjava/lang/Object;)V

    .line 12389
    :cond_0
    iget v0, p0, Ll/ۚ۠᩻;->bitField0_:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    .line 12390
    iget-wide v2, p0, Ll/ۚ۠᩻;->size_:J

    invoke-virtual {p1, v1, v2, v3}, Ll/ܳ᩷ۖ;->ۧ(IJ)V

    :cond_1
    const/4 v0, 0x0

    .line 12392
    :goto_0
    iget-object v1, p0, Ll/ۚ۠᩻;->partitionNames_:Ll/ۖ᩵ۖ;

    invoke-virtual {v1}, Ll/ۖ᩵ۖ;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 12393
    iget-object v1, p0, Ll/ۚ۠᩻;->partitionNames_:Ll/ۖ᩵ۖ;

    invoke-virtual {v1, v0}, Ll/ۖ᩵ۖ;->᩵(I)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x3

    invoke-static {p1, v2, v1}, Ll/ۘᩴۖ;->֫(Ll/ܳ᩷ۖ;ILjava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 12395
    :cond_2
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۢ֨ۖ;->writeTo(Ll/ܳ᩷ۖ;)V

    return-void
.end method
