.class public final Ll/۫۠᩻;
.super Ll/ۘᩴۖ;
.source "C9PC"

# interfaces
.implements Ll/ۛ۠᩻;


# static fields
.field public static final DEFAULT_INSTANCE:Ll/۫۠᩻;

.field public static final NUM_BLOCKS_FIELD_NUMBER:I = 0x2

.field public static final PARSER:Ll/۫֡ۖ;

.field public static final START_BLOCK_FIELD_NUMBER:I = 0x1

.field public static final serialVersionUID:J


# instance fields
.field public bitField0_:I

.field public memoizedIsInitialized:B

.field public numBlocks_:J

.field public startBlock_:J


# direct methods
.method public static bridge synthetic -$$Nest$fgetbitField0_(Ll/۫۠᩻;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/۫۠᩻;->bitField0_:I

    return p0
.end method

.method public static bridge synthetic -$$Nest$fputbitField0_(ILl/۫۠᩻;)V
    .locals 0

    .line 0
    iput p0, p1, Ll/۫۠᩻;->bitField0_:I

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputnumBlocks_(Ll/۫۠᩻;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/۫۠᩻;->numBlocks_:J

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputstartBlock_(Ll/۫۠᩻;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/۫۠᩻;->startBlock_:J

    return-void
.end method

.method public static constructor <clinit>()V
    .locals 2

    .line 78
    sget-object v0, Ll/ۜۚۖ;->᩶:Ll/ۜۚۖ;

    const-class v1, Ll/۫۠᩻;

    .line 84
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    .line 78
    invoke-static {v0, v1}, Ll/᩷ۚۖ;->֫(Ll/ۜۚۖ;Ljava/lang/String;)V

    .line 578
    new-instance v0, Ll/۫۠᩻;

    invoke-direct {v0}, Ll/۫۠᩻;-><init>()V

    sput-object v0, Ll/۫۠᩻;->DEFAULT_INSTANCE:Ll/۫۠᩻;

    .line 586
    new-instance v0, Ll/ۗ۠᩻;

    invoke-direct {v0}, Ll/ۗ۠᩻;-><init>()V

    sput-object v0, Ll/۫۠᩻;->PARSER:Ll/۫֡ۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 90
    invoke-direct {p0}, Ll/ۘᩴۖ;-><init>()V

    const-wide/16 v0, 0x0

    .line 108
    iput-wide v0, p0, Ll/۫۠᩻;->startBlock_:J

    .line 127
    iput-wide v0, p0, Ll/۫۠᩻;->numBlocks_:J

    const/4 v0, -0x1

    .line 145
    iput-byte v0, p0, Ll/۫۠᩻;->memoizedIsInitialized:B

    return-void
.end method

.method public synthetic constructor <init>(Ll/۬۠᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/۫۠᩻;-><init>(Ll/᩶ۘۖ;)V

    return-void
.end method

.method public constructor <init>(Ll/᩶ۘۖ;)V
    .locals 2

    .line 88
    invoke-direct {p0, p1}, Ll/ۘᩴۖ;-><init>(Ll/᩶ۘۖ;)V

    const-wide/16 v0, 0x0

    .line 108
    iput-wide v0, p0, Ll/۫۠᩻;->startBlock_:J

    .line 127
    iput-wide v0, p0, Ll/۫۠᩻;->numBlocks_:J

    const/4 p1, -0x1

    .line 145
    iput-byte p1, p0, Ll/۫۠᩻;->memoizedIsInitialized:B

    return-void
.end method

.method public static getDefaultInstance()Ll/۫۠᩻;
    .locals 1

    .line 582
    sget-object v0, Ll/۫۠᩻;->DEFAULT_INSTANCE:Ll/۫۠᩻;

    return-object v0
.end method

.method public static final getDescriptor()Ll/ᩳۖۖ;
    .locals 1

    .line 95
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_Extent_descriptor()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder()Ll/۬۠᩻;
    .locals 1

    .line 308
    sget-object v0, Ll/۫۠᩻;->DEFAULT_INSTANCE:Ll/۫۠᩻;

    invoke-virtual {v0}, Ll/۫۠᩻;->toBuilder()Ll/۬۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Ll/۫۠᩻;)Ll/۬۠᩻;
    .locals 1

    .line 311
    sget-object v0, Ll/۫۠᩻;->DEFAULT_INSTANCE:Ll/۫۠᩻;

    invoke-virtual {v0}, Ll/۫۠᩻;->toBuilder()Ll/۬۠᩻;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/۬۠᩻;->mergeFrom(Ll/۫۠᩻;)Ll/۬۠᩻;

    move-result-object p0

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Ll/۫۠᩻;
    .locals 1

    .line 280
    sget-object v0, Ll/۫۠᩻;->PARSER:Ll/۫֡ۖ;

    .line 281
    invoke-static {v0, p0}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ljava/io/InputStream;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/۫۠᩻;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/۫۠᩻;
    .locals 1

    .line 288
    sget-object v0, Ll/۫۠᩻;->PARSER:Ll/۫֡ۖ;

    .line 289
    invoke-static {v0, p0, p1}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/۫۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Ll/۫۠᩻;
    .locals 1

    .line 267
    sget-object v0, Ll/۫۠᩻;->PARSER:Ll/۫֡ۖ;

    .line 268
    invoke-static {v0, p0}, Ll/ۘᩴۖ;->ۧ(Ll/۫֡ۖ;Ljava/io/InputStream;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/۫۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/۫۠᩻;
    .locals 1

    .line 274
    sget-object v0, Ll/۫۠᩻;->PARSER:Ll/۫֡ۖ;

    .line 275
    invoke-static {v0, p0, p1}, Ll/ۘᩴۖ;->ۧ(Ll/۫֡ۖ;Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/۫۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Ll/۫۠᩻;
    .locals 1

    .line 236
    sget-object v0, Ll/۫۠᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0}, Ll/۫֡ۖ;->parseFrom(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/۫۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Ll/ᩳۘۖ;)Ll/۫۠᩻;
    .locals 1

    .line 242
    sget-object v0, Ll/۫۠᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0, p1}, Ll/۫֡ۖ;->parseFrom(Ljava/nio/ByteBuffer;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/۫۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/ۛۜۖ;)Ll/۫۠᩻;
    .locals 1

    .line 247
    sget-object v0, Ll/۫۠᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0}, Ll/۫֡ۖ;->parseFrom(Ll/ۛۜۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/۫۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ll/۫۠᩻;
    .locals 1

    .line 253
    sget-object v0, Ll/۫۠᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0, p1}, Ll/۫֡ۖ;->parseFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/۫۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/۟ۜۖ;)Ll/۫۠᩻;
    .locals 1

    .line 294
    sget-object v0, Ll/۫۠᩻;->PARSER:Ll/۫֡ۖ;

    .line 295
    invoke-static {v0, p0}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ll/۟ۜۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/۫۠᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/۫۠᩻;
    .locals 1

    .line 301
    sget-object v0, Ll/۫۠᩻;->PARSER:Ll/۫֡ۖ;

    .line 302
    invoke-static {v0, p0, p1}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/۫۠᩻;

    return-object p0
.end method

.method public static parseFrom([B)Ll/۫۠᩻;
    .locals 1

    .line 257
    sget-object v0, Ll/۫۠᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0}, Ll/۫֡ۖ;->parseFrom([B)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/۫۠᩻;

    return-object p0
.end method

.method public static parseFrom([BLl/ᩳۘۖ;)Ll/۫۠᩻;
    .locals 1

    .line 263
    sget-object v0, Ll/۫۠᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0, p1}, Ll/۫֡ۖ;->parseFrom([BLl/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/۫۠᩻;

    return-object p0
.end method

.method public static parser()Ll/۫֡ۖ;
    .locals 1

    .line 608
    sget-object v0, Ll/۫۠᩻;->PARSER:Ll/۫֡ۖ;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 192
    :cond_0
    instance-of v1, p1, Ll/۫۠᩻;

    if-nez v1, :cond_1

    .line 193
    invoke-super {p0, p1}, Ll/ۡۜۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 195
    :cond_1
    check-cast p1, Ll/۫۠᩻;

    .line 197
    invoke-virtual {p0}, Ll/۫۠᩻;->hasStartBlock()Z

    move-result v1

    invoke-virtual {p1}, Ll/۫۠᩻;->hasStartBlock()Z

    move-result v2

    const/4 v3, 0x0

    if-eq v1, v2, :cond_2

    return v3

    .line 198
    :cond_2
    invoke-virtual {p0}, Ll/۫۠᩻;->hasStartBlock()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 199
    invoke-virtual {p0}, Ll/۫۠᩻;->getStartBlock()J

    move-result-wide v1

    .line 200
    invoke-virtual {p1}, Ll/۫۠᩻;->getStartBlock()J

    move-result-wide v4

    cmp-long v6, v1, v4

    if-eqz v6, :cond_3

    return v3

    .line 202
    :cond_3
    invoke-virtual {p0}, Ll/۫۠᩻;->hasNumBlocks()Z

    move-result v1

    invoke-virtual {p1}, Ll/۫۠᩻;->hasNumBlocks()Z

    move-result v2

    if-eq v1, v2, :cond_4

    return v3

    .line 203
    :cond_4
    invoke-virtual {p0}, Ll/۫۠᩻;->hasNumBlocks()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 204
    invoke-virtual {p0}, Ll/۫۠᩻;->getNumBlocks()J

    move-result-wide v1

    .line 205
    invoke-virtual {p1}, Ll/۫۠᩻;->getNumBlocks()J

    move-result-wide v4

    cmp-long v6, v1, v4

    if-eqz v6, :cond_5

    return v3

    .line 207
    :cond_5
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/ۢ֨ۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v3

    :cond_6
    return v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 72
    invoke-virtual {p0}, Ll/۫۠᩻;->getDefaultInstanceForType()Ll/۫۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Ll/۫۠᩻;
    .locals 1

    .line 618
    sget-object v0, Ll/۫۠᩻;->DEFAULT_INSTANCE:Ll/۫۠᩻;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 72
    invoke-virtual {p0}, Ll/۫۠᩻;->getDefaultInstanceForType()Ll/۫۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public getNumBlocks()J
    .locals 2

    .line 142
    iget-wide v0, p0, Ll/۫۠᩻;->numBlocks_:J

    return-wide v0
.end method

.method public getParserForType()Ll/۫֡ۖ;
    .locals 1

    .line 613
    sget-object v0, Ll/۫۠᩻;->PARSER:Ll/۫֡ۖ;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 5

    .line 170
    iget v0, p0, Ll/ۡۜۖ;->memoizedSize:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    .line 174
    :cond_0
    iget v0, p0, Ll/۫۠᩻;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    .line 175
    iget-wide v2, p0, Ll/۫۠᩻;->startBlock_:J

    .line 176
    invoke-static {v1, v2, v3}, Ll/ܳ᩷ۖ;->ᩳ(IJ)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 178
    :goto_0
    iget v1, p0, Ll/۫۠᩻;->bitField0_:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-eqz v1, :cond_2

    .line 179
    iget-wide v3, p0, Ll/۫۠᩻;->numBlocks_:J

    .line 180
    invoke-static {v2, v3, v4}, Ll/ܳ᩷ۖ;->ᩳ(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 182
    :cond_2
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->getSerializedSize()I

    move-result v1

    add-int/2addr v1, v0

    .line 183
    iput v1, p0, Ll/ۡۜۖ;->memoizedSize:I

    return v1
.end method

.method public getStartBlock()J
    .locals 2

    .line 123
    iget-wide v0, p0, Ll/۫۠᩻;->startBlock_:J

    return-wide v0
.end method

.method public hasNumBlocks()Z
    .locals 1

    .line 134
    iget v0, p0, Ll/۫۠᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasStartBlock()Z
    .locals 2

    .line 115
    iget v0, p0, Ll/۫۠᩻;->bitField0_:I

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

    .line 213
    iget v0, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    if-eqz v0, :cond_0

    return v0

    .line 217
    :cond_0
    invoke-static {}, Ll/۫۠᩻;->getDescriptor()Ll/ᩳۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x30b

    .line 218
    invoke-virtual {p0}, Ll/۫۠᩻;->hasStartBlock()Z

    move-result v1

    const/16 v2, 0x35

    const/16 v3, 0x25

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    .line 219
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 221
    invoke-virtual {p0}, Ll/۫۠᩻;->getStartBlock()J

    move-result-wide v4

    .line 220
    invoke-static {v4, v5}, Ll/ܰᩴۖ;->֫(J)I

    move-result v1

    add-int/2addr v0, v1

    .line 223
    :cond_1
    invoke-virtual {p0}, Ll/۫۠᩻;->hasNumBlocks()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    .line 224
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 226
    invoke-virtual {p0}, Ll/۫۠᩻;->getNumBlocks()J

    move-result-wide v1

    .line 225
    invoke-static {v1, v2}, Ll/ܰᩴۖ;->֫(J)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    mul-int/lit8 v0, v0, 0x1d

    .line 228
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    .line 229
    iput v1, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    return v1
.end method

.method public internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 101
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_Extent_fieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/۫۠᩻;

    const-class v2, Ll/۬۠᩻;

    .line 102
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 148
    iget-byte v0, p0, Ll/۫۠᩻;->memoizedIsInitialized:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    return v0

    .line 152
    :cond_1
    iput-byte v1, p0, Ll/۫۠᩻;->memoizedIsInitialized:B

    return v1
.end method

.method public bridge synthetic newBuilderForType()Ll/ۢ֡ۖ;
    .locals 1

    .line 72
    invoke-virtual {p0}, Ll/۫۠᩻;->newBuilderForType()Ll/۬۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Ll/۬۠᩻;
    .locals 1

    .line 306
    invoke-static {}, Ll/۫۠᩻;->newBuilder()Ll/۬۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType(Ll/ۢۜۖ;)Ll/۬۠᩻;
    .locals 2

    .line 322
    new-instance v0, Ll/۬۠᩻;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/۬۠᩻;-><init>(Ll/ۢۜۖ;I)V

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Ll/ܳ֡ۖ;
    .locals 1

    .line 72
    invoke-virtual {p0}, Ll/۫۠᩻;->newBuilderForType()Ll/۬۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Ll/ۢۜۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 72
    invoke-virtual {p0, p1}, Ll/۫۠᩻;->newBuilderForType(Ll/ۢۜۖ;)Ll/۬۠᩻;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic toBuilder()Ll/ۢ֡ۖ;
    .locals 1

    .line 72
    invoke-virtual {p0}, Ll/۫۠᩻;->toBuilder()Ll/۬۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Ll/۬۠᩻;
    .locals 2

    .line 315
    sget-object v0, Ll/۫۠᩻;->DEFAULT_INSTANCE:Ll/۫۠᩻;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    .line 316
    new-instance v0, Ll/۬۠᩻;

    invoke-direct {v0, v1}, Ll/۬۠᩻;-><init>(I)V

    return-object v0

    :cond_0
    new-instance v0, Ll/۬۠᩻;

    invoke-direct {v0, v1}, Ll/۬۠᩻;-><init>(I)V

    invoke-virtual {v0, p0}, Ll/۬۠᩻;->mergeFrom(Ll/۫۠᩻;)Ll/۬۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Ll/ܳ֡ۖ;
    .locals 1

    .line 72
    invoke-virtual {p0}, Ll/۫۠᩻;->toBuilder()Ll/۬۠᩻;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Ll/ܳ᩷ۖ;)V
    .locals 4

    .line 159
    iget v0, p0, Ll/۫۠᩻;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    .line 160
    iget-wide v2, p0, Ll/۫۠᩻;->startBlock_:J

    invoke-virtual {p1, v1, v2, v3}, Ll/ܳ᩷ۖ;->ۧ(IJ)V

    .line 162
    :cond_0
    iget v0, p0, Ll/۫۠᩻;->bitField0_:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    .line 163
    iget-wide v2, p0, Ll/۫۠᩻;->numBlocks_:J

    invoke-virtual {p1, v1, v2, v3}, Ll/ܳ᩷ۖ;->ۧ(IJ)V

    .line 165
    :cond_1
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۢ֨ۖ;->writeTo(Ll/ܳ᩷ۖ;)V

    return-void
.end method
