.class public final Ll/ܳܶ᩻;
.super Ll/ۘᩴۖ;
.source "C9PC"

# interfaces
.implements Ll/ۜܶ᩻;


# static fields
.field public static final DEFAULT_INSTANCE:Ll/ܳܶ᩻;

.field public static final HASH_FIELD_NUMBER:I = 0x2

.field public static final PARSER:Ll/۫֡ۖ;

.field public static final SIZE_FIELD_NUMBER:I = 0x1

.field public static final serialVersionUID:J


# instance fields
.field public bitField0_:I

.field public hash_:Ll/ۛۜۖ;

.field public memoizedIsInitialized:B

.field public size_:J


# direct methods
.method public static bridge synthetic -$$Nest$fgetbitField0_(Ll/ܳܶ᩻;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܳܶ᩻;->bitField0_:I

    return p0
.end method

.method public static bridge synthetic -$$Nest$fputbitField0_(Ll/ܳܶ᩻;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܳܶ᩻;->bitField0_:I

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputhash_(Ll/ܳܶ᩻;Ll/ۛۜۖ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܳܶ᩻;->hash_:Ll/ۛۜۖ;

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputsize_(Ll/ܳܶ᩻;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/ܳܶ᩻;->size_:J

    return-void
.end method

.method public static constructor <clinit>()V
    .locals 2

    .line 2185
    sget-object v0, Ll/ۜۚۖ;->᩶:Ll/ۜۚۖ;

    const-class v1, Ll/ܳܶ᩻;

    .line 2191
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    .line 2185
    invoke-static {v0, v1}, Ll/᩷ۚۖ;->֫(Ll/ۜۚۖ;Ljava/lang/String;)V

    .line 2670
    new-instance v0, Ll/ܳܶ᩻;

    invoke-direct {v0}, Ll/ܳܶ᩻;-><init>()V

    sput-object v0, Ll/ܳܶ᩻;->DEFAULT_INSTANCE:Ll/ܳܶ᩻;

    .line 2678
    new-instance v0, Ll/ᩳܶ᩻;

    invoke-direct {v0}, Ll/ᩳܶ᩻;-><init>()V

    sput-object v0, Ll/ܳܶ᩻;->PARSER:Ll/۫֡ۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 2197
    invoke-direct {p0}, Ll/ۘᩴۖ;-><init>()V

    const-wide/16 v0, 0x0

    .line 2216
    iput-wide v0, p0, Ll/ܳܶ᩻;->size_:J

    .line 2235
    sget-object v0, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    const/4 v1, -0x1

    .line 2253
    iput-byte v1, p0, Ll/ܳܶ᩻;->memoizedIsInitialized:B

    .line 2198
    iput-object v0, p0, Ll/ܳܶ᩻;->hash_:Ll/ۛۜۖ;

    return-void
.end method

.method public synthetic constructor <init>(Ll/ܿܶ᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ܳܶ᩻;-><init>(Ll/᩶ۘۖ;)V

    return-void
.end method

.method public constructor <init>(Ll/᩶ۘۖ;)V
    .locals 2

    .line 2195
    invoke-direct {p0, p1}, Ll/ۘᩴۖ;-><init>(Ll/᩶ۘۖ;)V

    const-wide/16 v0, 0x0

    .line 2216
    iput-wide v0, p0, Ll/ܳܶ᩻;->size_:J

    .line 2235
    sget-object p1, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    iput-object p1, p0, Ll/ܳܶ᩻;->hash_:Ll/ۛۜۖ;

    const/4 p1, -0x1

    .line 2253
    iput-byte p1, p0, Ll/ܳܶ᩻;->memoizedIsInitialized:B

    return-void
.end method

.method public static getDefaultInstance()Ll/ܳܶ᩻;
    .locals 1

    .line 2674
    sget-object v0, Ll/ܳܶ᩻;->DEFAULT_INSTANCE:Ll/ܳܶ᩻;

    return-object v0
.end method

.method public static final getDescriptor()Ll/ᩳۖۖ;
    .locals 1

    .line 2203
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_PartitionInfo_descriptor()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder()Ll/ܿܶ᩻;
    .locals 1

    .line 2415
    sget-object v0, Ll/ܳܶ᩻;->DEFAULT_INSTANCE:Ll/ܳܶ᩻;

    invoke-virtual {v0}, Ll/ܳܶ᩻;->toBuilder()Ll/ܿܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Ll/ܳܶ᩻;)Ll/ܿܶ᩻;
    .locals 1

    .line 2418
    sget-object v0, Ll/ܳܶ᩻;->DEFAULT_INSTANCE:Ll/ܳܶ᩻;

    invoke-virtual {v0}, Ll/ܳܶ᩻;->toBuilder()Ll/ܿܶ᩻;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/ܿܶ᩻;->mergeFrom(Ll/ܳܶ᩻;)Ll/ܿܶ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Ll/ܳܶ᩻;
    .locals 1

    .line 2387
    sget-object v0, Ll/ܳܶ᩻;->PARSER:Ll/۫֡ۖ;

    .line 2388
    invoke-static {v0, p0}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ljava/io/InputStream;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/ܳܶ᩻;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/ܳܶ᩻;
    .locals 1

    .line 2395
    sget-object v0, Ll/ܳܶ᩻;->PARSER:Ll/۫֡ۖ;

    .line 2396
    invoke-static {v0, p0, p1}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/ܳܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Ll/ܳܶ᩻;
    .locals 1

    .line 2374
    sget-object v0, Ll/ܳܶ᩻;->PARSER:Ll/۫֡ۖ;

    .line 2375
    invoke-static {v0, p0}, Ll/ۘᩴۖ;->ۧ(Ll/۫֡ۖ;Ljava/io/InputStream;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/ܳܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/ܳܶ᩻;
    .locals 1

    .line 2381
    sget-object v0, Ll/ܳܶ᩻;->PARSER:Ll/۫֡ۖ;

    .line 2382
    invoke-static {v0, p0, p1}, Ll/ۘᩴۖ;->ۧ(Ll/۫֡ۖ;Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/ܳܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Ll/ܳܶ᩻;
    .locals 1

    .line 2343
    sget-object v0, Ll/ܳܶ᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0}, Ll/۫֡ۖ;->parseFrom(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܳܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Ll/ᩳۘۖ;)Ll/ܳܶ᩻;
    .locals 1

    .line 2349
    sget-object v0, Ll/ܳܶ᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0, p1}, Ll/۫֡ۖ;->parseFrom(Ljava/nio/ByteBuffer;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܳܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/ۛۜۖ;)Ll/ܳܶ᩻;
    .locals 1

    .line 2354
    sget-object v0, Ll/ܳܶ᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0}, Ll/۫֡ۖ;->parseFrom(Ll/ۛۜۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܳܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ll/ܳܶ᩻;
    .locals 1

    .line 2360
    sget-object v0, Ll/ܳܶ᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0, p1}, Ll/۫֡ۖ;->parseFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܳܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/۟ۜۖ;)Ll/ܳܶ᩻;
    .locals 1

    .line 2401
    sget-object v0, Ll/ܳܶ᩻;->PARSER:Ll/۫֡ۖ;

    .line 2402
    invoke-static {v0, p0}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ll/۟ۜۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/ܳܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܳܶ᩻;
    .locals 1

    .line 2408
    sget-object v0, Ll/ܳܶ᩻;->PARSER:Ll/۫֡ۖ;

    .line 2409
    invoke-static {v0, p0, p1}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/ܳܶ᩻;

    return-object p0
.end method

.method public static parseFrom([B)Ll/ܳܶ᩻;
    .locals 1

    .line 2364
    sget-object v0, Ll/ܳܶ᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0}, Ll/۫֡ۖ;->parseFrom([B)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܳܶ᩻;

    return-object p0
.end method

.method public static parseFrom([BLl/ᩳۘۖ;)Ll/ܳܶ᩻;
    .locals 1

    .line 2370
    sget-object v0, Ll/ܳܶ᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0, p1}, Ll/۫֡ۖ;->parseFrom([BLl/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܳܶ᩻;

    return-object p0
.end method

.method public static parser()Ll/۫֡ۖ;
    .locals 1

    .line 2700
    sget-object v0, Ll/ܳܶ᩻;->PARSER:Ll/۫֡ۖ;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 2300
    :cond_0
    instance-of v1, p1, Ll/ܳܶ᩻;

    if-nez v1, :cond_1

    .line 2301
    invoke-super {p0, p1}, Ll/ۡۜۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 2303
    :cond_1
    check-cast p1, Ll/ܳܶ᩻;

    .line 2305
    invoke-virtual {p0}, Ll/ܳܶ᩻;->hasSize()Z

    move-result v1

    invoke-virtual {p1}, Ll/ܳܶ᩻;->hasSize()Z

    move-result v2

    const/4 v3, 0x0

    if-eq v1, v2, :cond_2

    return v3

    .line 2306
    :cond_2
    invoke-virtual {p0}, Ll/ܳܶ᩻;->hasSize()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 2307
    invoke-virtual {p0}, Ll/ܳܶ᩻;->getSize()J

    move-result-wide v1

    .line 2308
    invoke-virtual {p1}, Ll/ܳܶ᩻;->getSize()J

    move-result-wide v4

    cmp-long v6, v1, v4

    if-eqz v6, :cond_3

    return v3

    .line 2310
    :cond_3
    invoke-virtual {p0}, Ll/ܳܶ᩻;->hasHash()Z

    move-result v1

    invoke-virtual {p1}, Ll/ܳܶ᩻;->hasHash()Z

    move-result v2

    if-eq v1, v2, :cond_4

    return v3

    .line 2311
    :cond_4
    invoke-virtual {p0}, Ll/ܳܶ᩻;->hasHash()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 2312
    invoke-virtual {p0}, Ll/ܳܶ᩻;->getHash()Ll/ۛۜۖ;

    move-result-object v1

    .line 2313
    invoke-virtual {p1}, Ll/ܳܶ᩻;->getHash()Ll/ۛۜۖ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۛۜۖ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v3

    .line 2315
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

    .line 2179
    invoke-virtual {p0}, Ll/ܳܶ᩻;->getDefaultInstanceForType()Ll/ܳܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Ll/ܳܶ᩻;
    .locals 1

    .line 2710
    sget-object v0, Ll/ܳܶ᩻;->DEFAULT_INSTANCE:Ll/ܳܶ᩻;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 2179
    invoke-virtual {p0}, Ll/ܳܶ᩻;->getDefaultInstanceForType()Ll/ܳܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public getHash()Ll/ۛۜۖ;
    .locals 1

    .line 2250
    iget-object v0, p0, Ll/ܳܶ᩻;->hash_:Ll/ۛۜۖ;

    return-object v0
.end method

.method public getParserForType()Ll/۫֡ۖ;
    .locals 1

    .line 2705
    sget-object v0, Ll/ܳܶ᩻;->PARSER:Ll/۫֡ۖ;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 4

    .line 2278
    iget v0, p0, Ll/ۡۜۖ;->memoizedSize:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    .line 2282
    :cond_0
    iget v0, p0, Ll/ܳܶ᩻;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    .line 2283
    iget-wide v2, p0, Ll/ܳܶ᩻;->size_:J

    .line 2284
    invoke-static {v1, v2, v3}, Ll/ܳ᩷ۖ;->ᩳ(IJ)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 2286
    :goto_0
    iget v1, p0, Ll/ܳܶ᩻;->bitField0_:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-eqz v1, :cond_2

    .line 2287
    iget-object v1, p0, Ll/ܳܶ᩻;->hash_:Ll/ۛۜۖ;

    .line 2288
    invoke-static {v2, v1}, Ll/ܳ᩷ۖ;->ܽ(ILl/ۛۜۖ;)I

    move-result v1

    add-int/2addr v0, v1

    .line 2290
    :cond_2
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->getSerializedSize()I

    move-result v1

    add-int/2addr v1, v0

    .line 2291
    iput v1, p0, Ll/ۡۜۖ;->memoizedSize:I

    return v1
.end method

.method public getSize()J
    .locals 2

    .line 2231
    iget-wide v0, p0, Ll/ܳܶ᩻;->size_:J

    return-wide v0
.end method

.method public hasHash()Z
    .locals 1

    .line 2242
    iget v0, p0, Ll/ܳܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasSize()Z
    .locals 2

    .line 2223
    iget v0, p0, Ll/ܳܶ᩻;->bitField0_:I

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

    .line 2321
    iget v0, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    if-eqz v0, :cond_0

    return v0

    .line 2325
    :cond_0
    invoke-static {}, Ll/ܳܶ᩻;->getDescriptor()Ll/ᩳۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x30b

    .line 2326
    invoke-virtual {p0}, Ll/ܳܶ᩻;->hasSize()Z

    move-result v1

    const/16 v2, 0x35

    const/16 v3, 0x25

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    .line 2327
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 2329
    invoke-virtual {p0}, Ll/ܳܶ᩻;->getSize()J

    move-result-wide v4

    .line 2328
    invoke-static {v4, v5}, Ll/ܰᩴۖ;->֫(J)I

    move-result v1

    add-int/2addr v0, v1

    .line 2331
    :cond_1
    invoke-virtual {p0}, Ll/ܳܶ᩻;->hasHash()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    .line 2332
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 2333
    invoke-virtual {p0}, Ll/ܳܶ᩻;->getHash()Ll/ۛۜۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۛۜۖ;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    mul-int/lit8 v0, v0, 0x1d

    .line 2335
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    .line 2336
    iput v1, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    return v1
.end method

.method public internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 2209
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_PartitionInfo_fieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/ܳܶ᩻;

    const-class v2, Ll/ܿܶ᩻;

    .line 2210
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 2256
    iget-byte v0, p0, Ll/ܳܶ᩻;->memoizedIsInitialized:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    return v0

    .line 2260
    :cond_1
    iput-byte v1, p0, Ll/ܳܶ᩻;->memoizedIsInitialized:B

    return v1
.end method

.method public bridge synthetic newBuilderForType()Ll/ۢ֡ۖ;
    .locals 1

    .line 2179
    invoke-virtual {p0}, Ll/ܳܶ᩻;->newBuilderForType()Ll/ܿܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Ll/ܳ֡ۖ;
    .locals 1

    .line 2179
    invoke-virtual {p0}, Ll/ܳܶ᩻;->newBuilderForType()Ll/ܿܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Ll/ۢۜۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 2179
    invoke-virtual {p0, p1}, Ll/ܳܶ᩻;->newBuilderForType(Ll/ۢۜۖ;)Ll/ܿܶ᩻;

    move-result-object p1

    return-object p1
.end method

.method public newBuilderForType()Ll/ܿܶ᩻;
    .locals 1

    .line 2413
    invoke-static {}, Ll/ܳܶ᩻;->newBuilder()Ll/ܿܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType(Ll/ۢۜۖ;)Ll/ܿܶ᩻;
    .locals 2

    .line 2429
    new-instance v0, Ll/ܿܶ᩻;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/ܿܶ᩻;-><init>(Ll/ۢۜۖ;I)V

    return-object v0
.end method

.method public bridge synthetic toBuilder()Ll/ۢ֡ۖ;
    .locals 1

    .line 2179
    invoke-virtual {p0}, Ll/ܳܶ᩻;->toBuilder()Ll/ܿܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Ll/ܳ֡ۖ;
    .locals 1

    .line 2179
    invoke-virtual {p0}, Ll/ܳܶ᩻;->toBuilder()Ll/ܿܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Ll/ܿܶ᩻;
    .locals 2

    .line 2422
    sget-object v0, Ll/ܳܶ᩻;->DEFAULT_INSTANCE:Ll/ܳܶ᩻;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    .line 2423
    new-instance v0, Ll/ܿܶ᩻;

    invoke-direct {v0, v1}, Ll/ܿܶ᩻;-><init>(I)V

    return-object v0

    :cond_0
    new-instance v0, Ll/ܿܶ᩻;

    invoke-direct {v0, v1}, Ll/ܿܶ᩻;-><init>(I)V

    invoke-virtual {v0, p0}, Ll/ܿܶ᩻;->mergeFrom(Ll/ܳܶ᩻;)Ll/ܿܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Ll/ܳ᩷ۖ;)V
    .locals 4

    .line 2267
    iget v0, p0, Ll/ܳܶ᩻;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    .line 2268
    iget-wide v2, p0, Ll/ܳܶ᩻;->size_:J

    invoke-virtual {p1, v1, v2, v3}, Ll/ܳ᩷ۖ;->ۧ(IJ)V

    .line 2270
    :cond_0
    iget v0, p0, Ll/ܳܶ᩻;->bitField0_:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    .line 2271
    iget-object v0, p0, Ll/ܳܶ᩻;->hash_:Ll/ۛۜۖ;

    invoke-virtual {p1, v1, v0}, Ll/ܳ᩷ۖ;->֫(ILl/ۛۜۖ;)V

    .line 2273
    :cond_1
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۢ֨ۖ;->writeTo(Ll/ܳ᩷ۖ;)V

    return-void
.end method
