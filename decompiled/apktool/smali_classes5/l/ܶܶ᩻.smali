.class public final Ll/ܶܶ᩻;
.super Ll/ۘᩴۖ;
.source "C9PC"

# interfaces
.implements Ll/᩹ܶ᩻;


# static fields
.field public static final BATCH_WRITES_FIELD_NUMBER:I = 0x2

.field public static final DEFAULT_INSTANCE:Ll/ܶܶ᩻;

.field public static final PARSER:Ll/۫֡ۖ;

.field public static final THREADED_FIELD_NUMBER:I = 0x1

.field public static final serialVersionUID:J


# instance fields
.field public batchWrites_:Z

.field public bitField0_:I

.field public memoizedIsInitialized:B

.field public threaded_:Z


# direct methods
.method public static bridge synthetic -$$Nest$fgetbitField0_(Ll/ܶܶ᩻;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܶܶ᩻;->bitField0_:I

    return p0
.end method

.method public static bridge synthetic -$$Nest$fputbatchWrites_(Ll/ܶܶ᩻;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/ܶܶ᩻;->batchWrites_:Z

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputbitField0_(Ll/ܶܶ᩻;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܶܶ᩻;->bitField0_:I

    return-void
.end method

.method public static bridge synthetic -$$Nest$fputthreaded_(Ll/ܶܶ᩻;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/ܶܶ᩻;->threaded_:Z

    return-void
.end method

.method public static constructor <clinit>()V
    .locals 2

    .line 13142
    sget-object v0, Ll/ۜۚۖ;->᩶:Ll/ۜۚۖ;

    const-class v1, Ll/ܶܶ᩻;

    .line 13148
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    .line 13142
    invoke-static {v0, v1}, Ll/᩷ۚۖ;->֫(Ll/ۜۚۖ;Ljava/lang/String;)V

    .line 13627
    new-instance v0, Ll/ܶܶ᩻;

    invoke-direct {v0}, Ll/ܶܶ᩻;-><init>()V

    sput-object v0, Ll/ܶܶ᩻;->DEFAULT_INSTANCE:Ll/ܶܶ᩻;

    .line 13635
    new-instance v0, Ll/֨ܶ᩻;

    invoke-direct {v0}, Ll/֨ܶ᩻;-><init>()V

    sput-object v0, Ll/ܶܶ᩻;->PARSER:Ll/۫֡ۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 13154
    invoke-direct {p0}, Ll/ۘᩴۖ;-><init>()V

    const/4 v0, 0x0

    .line 13172
    iput-boolean v0, p0, Ll/ܶܶ᩻;->threaded_:Z

    .line 13191
    iput-boolean v0, p0, Ll/ܶܶ᩻;->batchWrites_:Z

    const/4 v0, -0x1

    .line 13209
    iput-byte v0, p0, Ll/ܶܶ᩻;->memoizedIsInitialized:B

    return-void
.end method

.method public synthetic constructor <init>(Ll/۠ܶ᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ܶܶ᩻;-><init>(Ll/᩶ۘۖ;)V

    return-void
.end method

.method public constructor <init>(Ll/᩶ۘۖ;)V
    .locals 0

    .line 13152
    invoke-direct {p0, p1}, Ll/ۘᩴۖ;-><init>(Ll/᩶ۘۖ;)V

    const/4 p1, 0x0

    .line 13172
    iput-boolean p1, p0, Ll/ܶܶ᩻;->threaded_:Z

    .line 13191
    iput-boolean p1, p0, Ll/ܶܶ᩻;->batchWrites_:Z

    const/4 p1, -0x1

    .line 13209
    iput-byte p1, p0, Ll/ܶܶ᩻;->memoizedIsInitialized:B

    return-void
.end method

.method public static getDefaultInstance()Ll/ܶܶ᩻;
    .locals 1

    .line 13631
    sget-object v0, Ll/ܶܶ᩻;->DEFAULT_INSTANCE:Ll/ܶܶ᩻;

    return-object v0
.end method

.method public static final getDescriptor()Ll/ᩳۖۖ;
    .locals 1

    .line 13159
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_VABCFeatureSet_descriptor()Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder()Ll/۠ܶ᩻;
    .locals 1

    .line 13372
    sget-object v0, Ll/ܶܶ᩻;->DEFAULT_INSTANCE:Ll/ܶܶ᩻;

    invoke-virtual {v0}, Ll/ܶܶ᩻;->toBuilder()Ll/۠ܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Ll/ܶܶ᩻;)Ll/۠ܶ᩻;
    .locals 1

    .line 13375
    sget-object v0, Ll/ܶܶ᩻;->DEFAULT_INSTANCE:Ll/ܶܶ᩻;

    invoke-virtual {v0}, Ll/ܶܶ᩻;->toBuilder()Ll/۠ܶ᩻;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/۠ܶ᩻;->mergeFrom(Ll/ܶܶ᩻;)Ll/۠ܶ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Ll/ܶܶ᩻;
    .locals 1

    .line 13344
    sget-object v0, Ll/ܶܶ᩻;->PARSER:Ll/۫֡ۖ;

    .line 13345
    invoke-static {v0, p0}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ljava/io/InputStream;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/ܶܶ᩻;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/ܶܶ᩻;
    .locals 1

    .line 13352
    sget-object v0, Ll/ܶܶ᩻;->PARSER:Ll/۫֡ۖ;

    .line 13353
    invoke-static {v0, p0, p1}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/ܶܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Ll/ܶܶ᩻;
    .locals 1

    .line 13331
    sget-object v0, Ll/ܶܶ᩻;->PARSER:Ll/۫֡ۖ;

    .line 13332
    invoke-static {v0, p0}, Ll/ۘᩴۖ;->ۧ(Ll/۫֡ۖ;Ljava/io/InputStream;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/ܶܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/ܶܶ᩻;
    .locals 1

    .line 13338
    sget-object v0, Ll/ܶܶ᩻;->PARSER:Ll/۫֡ۖ;

    .line 13339
    invoke-static {v0, p0, p1}, Ll/ۘᩴۖ;->ۧ(Ll/۫֡ۖ;Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/ܶܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Ll/ܶܶ᩻;
    .locals 1

    .line 13300
    sget-object v0, Ll/ܶܶ᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0}, Ll/۫֡ۖ;->parseFrom(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܶܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Ll/ᩳۘۖ;)Ll/ܶܶ᩻;
    .locals 1

    .line 13306
    sget-object v0, Ll/ܶܶ᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0, p1}, Ll/۫֡ۖ;->parseFrom(Ljava/nio/ByteBuffer;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܶܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/ۛۜۖ;)Ll/ܶܶ᩻;
    .locals 1

    .line 13311
    sget-object v0, Ll/ܶܶ᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0}, Ll/۫֡ۖ;->parseFrom(Ll/ۛۜۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܶܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ll/ܶܶ᩻;
    .locals 1

    .line 13317
    sget-object v0, Ll/ܶܶ᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0, p1}, Ll/۫֡ۖ;->parseFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܶܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/۟ۜۖ;)Ll/ܶܶ᩻;
    .locals 1

    .line 13358
    sget-object v0, Ll/ܶܶ᩻;->PARSER:Ll/۫֡ۖ;

    .line 13359
    invoke-static {v0, p0}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ll/۟ۜۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/ܶܶ᩻;

    return-object p0
.end method

.method public static parseFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܶܶ᩻;
    .locals 1

    .line 13365
    sget-object v0, Ll/ܶܶ᩻;->PARSER:Ll/۫֡ۖ;

    .line 13366
    invoke-static {v0, p0, p1}, Ll/ۘᩴۖ;->֫(Ll/۫֡ۖ;Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩻֡ۖ;

    move-result-object p0

    check-cast p0, Ll/ܶܶ᩻;

    return-object p0
.end method

.method public static parseFrom([B)Ll/ܶܶ᩻;
    .locals 1

    .line 13321
    sget-object v0, Ll/ܶܶ᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0}, Ll/۫֡ۖ;->parseFrom([B)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܶܶ᩻;

    return-object p0
.end method

.method public static parseFrom([BLl/ᩳۘۖ;)Ll/ܶܶ᩻;
    .locals 1

    .line 13327
    sget-object v0, Ll/ܶܶ᩻;->PARSER:Ll/۫֡ۖ;

    invoke-interface {v0, p0, p1}, Ll/۫֡ۖ;->parseFrom([BLl/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܶܶ᩻;

    return-object p0
.end method

.method public static parser()Ll/۫֡ۖ;
    .locals 1

    .line 13657
    sget-object v0, Ll/ܶܶ᩻;->PARSER:Ll/۫֡ۖ;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 13256
    :cond_0
    instance-of v1, p1, Ll/ܶܶ᩻;

    if-nez v1, :cond_1

    .line 13257
    invoke-super {p0, p1}, Ll/ۡۜۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 13259
    :cond_1
    check-cast p1, Ll/ܶܶ᩻;

    .line 13261
    invoke-virtual {p0}, Ll/ܶܶ᩻;->hasThreaded()Z

    move-result v1

    invoke-virtual {p1}, Ll/ܶܶ᩻;->hasThreaded()Z

    move-result v2

    const/4 v3, 0x0

    if-eq v1, v2, :cond_2

    return v3

    .line 13262
    :cond_2
    invoke-virtual {p0}, Ll/ܶܶ᩻;->hasThreaded()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 13263
    invoke-virtual {p0}, Ll/ܶܶ᩻;->getThreaded()Z

    move-result v1

    .line 13264
    invoke-virtual {p1}, Ll/ܶܶ᩻;->getThreaded()Z

    move-result v2

    if-eq v1, v2, :cond_3

    return v3

    .line 13266
    :cond_3
    invoke-virtual {p0}, Ll/ܶܶ᩻;->hasBatchWrites()Z

    move-result v1

    invoke-virtual {p1}, Ll/ܶܶ᩻;->hasBatchWrites()Z

    move-result v2

    if-eq v1, v2, :cond_4

    return v3

    .line 13267
    :cond_4
    invoke-virtual {p0}, Ll/ܶܶ᩻;->hasBatchWrites()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 13268
    invoke-virtual {p0}, Ll/ܶܶ᩻;->getBatchWrites()Z

    move-result v1

    .line 13269
    invoke-virtual {p1}, Ll/ܶܶ᩻;->getBatchWrites()Z

    move-result v2

    if-eq v1, v2, :cond_5

    return v3

    .line 13271
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

.method public getBatchWrites()Z
    .locals 1

    .line 13206
    iget-boolean v0, p0, Ll/ܶܶ᩻;->batchWrites_:Z

    return v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 13136
    invoke-virtual {p0}, Ll/ܶܶ᩻;->getDefaultInstanceForType()Ll/ܶܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Ll/ܶܶ᩻;
    .locals 1

    .line 13667
    sget-object v0, Ll/ܶܶ᩻;->DEFAULT_INSTANCE:Ll/ܶܶ᩻;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 13136
    invoke-virtual {p0}, Ll/ܶܶ᩻;->getDefaultInstanceForType()Ll/ܶܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public getParserForType()Ll/۫֡ۖ;
    .locals 1

    .line 13662
    sget-object v0, Ll/ܶܶ᩻;->PARSER:Ll/۫֡ۖ;

    return-object v0
.end method

.method public getSerializedSize()I
    .locals 3

    .line 13234
    iget v0, p0, Ll/ۡۜۖ;->memoizedSize:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    .line 13238
    :cond_0
    iget v0, p0, Ll/ܶܶ᩻;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    .line 13240
    invoke-static {v1}, Ll/ܳ᩷ۖ;->ᩳ(I)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 13242
    :goto_0
    iget v1, p0, Ll/ܶܶ᩻;->bitField0_:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-eqz v1, :cond_2

    .line 13244
    invoke-static {v2}, Ll/ܳ᩷ۖ;->ᩳ(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 13246
    :cond_2
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->getSerializedSize()I

    move-result v1

    add-int/2addr v1, v0

    .line 13247
    iput v1, p0, Ll/ۡۜۖ;->memoizedSize:I

    return v1
.end method

.method public getThreaded()Z
    .locals 1

    .line 13187
    iget-boolean v0, p0, Ll/ܶܶ᩻;->threaded_:Z

    return v0
.end method

.method public hasBatchWrites()Z
    .locals 1

    .line 13198
    iget v0, p0, Ll/ܶܶ᩻;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasThreaded()Z
    .locals 2

    .line 13179
    iget v0, p0, Ll/ܶܶ᩻;->bitField0_:I

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

    .line 13277
    iget v0, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    if-eqz v0, :cond_0

    return v0

    .line 13281
    :cond_0
    invoke-static {}, Ll/ܶܶ᩻;->getDescriptor()Ll/ᩳۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x30b

    .line 13282
    invoke-virtual {p0}, Ll/ܶܶ᩻;->hasThreaded()Z

    move-result v1

    const/16 v2, 0x35

    const/16 v3, 0x25

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    .line 13283
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 13285
    invoke-virtual {p0}, Ll/ܶܶ᩻;->getThreaded()Z

    move-result v1

    .line 13284
    invoke-static {v1}, Ll/ܰᩴۖ;->֫(Z)I

    move-result v1

    add-int/2addr v0, v1

    .line 13287
    :cond_1
    invoke-virtual {p0}, Ll/ܶܶ᩻;->hasBatchWrites()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    .line 13288
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 13290
    invoke-virtual {p0}, Ll/ܶܶ᩻;->getBatchWrites()Z

    move-result v1

    .line 13289
    invoke-static {v1}, Ll/ܰᩴۖ;->֫(Z)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    mul-int/lit8 v0, v0, 0x1d

    .line 13292
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    .line 13293
    iput v1, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    return v1
.end method

.method public internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 13165
    invoke-static {}, Ll/᩶ܶ᩻;->-$$Nest$sfgetinternal_static_bin_mt_manager_visitor_payload_VABCFeatureSet_fieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/ܶܶ᩻;

    const-class v2, Ll/۠ܶ᩻;

    .line 13166
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 13212
    iget-byte v0, p0, Ll/ܶܶ᩻;->memoizedIsInitialized:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    return v0

    .line 13216
    :cond_1
    iput-byte v1, p0, Ll/ܶܶ᩻;->memoizedIsInitialized:B

    return v1
.end method

.method public newBuilderForType()Ll/۠ܶ᩻;
    .locals 1

    .line 13370
    invoke-static {}, Ll/ܶܶ᩻;->newBuilder()Ll/۠ܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType(Ll/ۢۜۖ;)Ll/۠ܶ᩻;
    .locals 2

    .line 13386
    new-instance v0, Ll/۠ܶ᩻;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/۠ܶ᩻;-><init>(Ll/ۢۜۖ;I)V

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Ll/ۢ֡ۖ;
    .locals 1

    .line 13136
    invoke-virtual {p0}, Ll/ܶܶ᩻;->newBuilderForType()Ll/۠ܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Ll/ܳ֡ۖ;
    .locals 1

    .line 13136
    invoke-virtual {p0}, Ll/ܶܶ᩻;->newBuilderForType()Ll/۠ܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Ll/ۢۜۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 13136
    invoke-virtual {p0, p1}, Ll/ܶܶ᩻;->newBuilderForType(Ll/ۢۜۖ;)Ll/۠ܶ᩻;

    move-result-object p1

    return-object p1
.end method

.method public toBuilder()Ll/۠ܶ᩻;
    .locals 2

    .line 13379
    sget-object v0, Ll/ܶܶ᩻;->DEFAULT_INSTANCE:Ll/ܶܶ᩻;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    .line 13380
    new-instance v0, Ll/۠ܶ᩻;

    invoke-direct {v0, v1}, Ll/۠ܶ᩻;-><init>(I)V

    return-object v0

    :cond_0
    new-instance v0, Ll/۠ܶ᩻;

    invoke-direct {v0, v1}, Ll/۠ܶ᩻;-><init>(I)V

    invoke-virtual {v0, p0}, Ll/۠ܶ᩻;->mergeFrom(Ll/ܶܶ᩻;)Ll/۠ܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Ll/ۢ֡ۖ;
    .locals 1

    .line 13136
    invoke-virtual {p0}, Ll/ܶܶ᩻;->toBuilder()Ll/۠ܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Ll/ܳ֡ۖ;
    .locals 1

    .line 13136
    invoke-virtual {p0}, Ll/ܶܶ᩻;->toBuilder()Ll/۠ܶ᩻;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Ll/ܳ᩷ۖ;)V
    .locals 2

    .line 13223
    iget v0, p0, Ll/ܶܶ᩻;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    .line 13224
    iget-boolean v0, p0, Ll/ܶܶ᩻;->threaded_:Z

    invoke-virtual {p1, v1, v0}, Ll/ܳ᩷ۖ;->֫(IZ)V

    .line 13226
    :cond_0
    iget v0, p0, Ll/ܶܶ᩻;->bitField0_:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    .line 13227
    iget-boolean v0, p0, Ll/ܶܶ᩻;->batchWrites_:Z

    invoke-virtual {p1, v1, v0}, Ll/ܳ᩷ۖ;->֫(IZ)V

    .line 13229
    :cond_1
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۢ֨ۖ;->writeTo(Ll/ܳ᩷ۖ;)V

    return-void
.end method
