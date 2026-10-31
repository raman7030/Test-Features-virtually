.class public final Ll/۫ۖۖ;
.super Ll/ۡۜۖ;
.source "69R1"


# instance fields
.field public final ۗ:Ll/ۢ֨ۖ;

.field public final ۙ:Ll/ᩳۖۖ;

.field public final ᩶:[Ll/֡ۖۖ;

.field public final ᩸:Ll/᩵ۘۖ;

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/ᩳۖۖ;Ll/᩵ۘۖ;[Ll/֡ۖۖ;Ll/ۢ֨ۖ;)V
    .locals 1

    .line 48
    invoke-direct {p0}, Ll/ۡۜۖ;-><init>()V

    const/4 v0, -0x1

    .line 34
    iput v0, p0, Ll/۫ۖۖ;->᩹:I

    .line 49
    iput-object p1, p0, Ll/۫ۖۖ;->ۙ:Ll/ᩳۖۖ;

    .line 50
    iput-object p2, p0, Ll/۫ۖۖ;->᩸:Ll/᩵ۘۖ;

    .line 51
    iput-object p3, p0, Ll/۫ۖۖ;->᩶:[Ll/֡ۖۖ;

    .line 52
    iput-object p4, p0, Ll/۫ۖۖ;->ۗ:Ll/ۢ֨ۖ;

    return-void
.end method

.method public static ֫(Ll/ᩳۖۖ;)Ll/۫ۖۖ;
    .locals 4

    .line 57
    invoke-virtual {p0}, Ll/ᩳۖۖ;->ۢ()Ll/᩶᩷ۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩶᩷ۖ;->ۘ()I

    move-result v0

    .line 58
    new-array v0, v0, [Ll/֡ۖۖ;

    .line 59
    new-instance v1, Ll/۫ۖۖ;

    .line 61
    invoke-static {}, Ll/᩵ۘۖ;->ۢ()Ll/᩵ۘۖ;

    move-result-object v2

    .line 63
    invoke-static {}, Ll/ۢ֨ۖ;->ܽ()Ll/ۢ֨ۖ;

    move-result-object v3

    invoke-direct {v1, p0, v2, v0, v3}, Ll/۫ۖۖ;-><init>(Ll/ᩳۖۖ;Ll/᩵ۘۖ;[Ll/֡ۖۖ;Ll/ۢ֨ۖ;)V

    return-object v1
.end method

.method public static synthetic ֫(Ll/۫ۖۖ;)Ll/ᩳۖۖ;
    .locals 0

    .line 29
    iget-object p0, p0, Ll/۫ۖۖ;->ۙ:Ll/ᩳۖۖ;

    return-object p0
.end method

.method public static synthetic ۧ(Ll/۫ۖۖ;)Ll/᩵ۘۖ;
    .locals 0

    .line 29
    iget-object p0, p0, Ll/۫ۖۖ;->᩸:Ll/᩵ۘۖ;

    return-object p0
.end method

.method public static synthetic ܽ(Ll/۫ۖۖ;)Ll/ۢ֨ۖ;
    .locals 0

    .line 29
    iget-object p0, p0, Ll/۫ۖۖ;->ۗ:Ll/ۢ֨ۖ;

    return-object p0
.end method

.method public static synthetic ᩳ(Ll/۫ۖۖ;)[Ll/֡ۖۖ;
    .locals 0

    .line 29
    iget-object p0, p0, Ll/۫ۖۖ;->᩶:[Ll/֡ۖۖ;

    return-object p0
.end method


# virtual methods
.method public final getAllFields()Ljava/util/Map;
    .locals 1

    .line 144
    iget-object v0, p0, Ll/۫ۖۖ;->᩸:Ll/᩵ۘۖ;

    invoke-virtual {v0}, Ll/᩵ۘۖ;->ۧ()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 139
    iget-object v0, p0, Ll/۫ۖۖ;->ۙ:Ll/ᩳۖۖ;

    invoke-static {v0}, Ll/۫ۖۖ;->֫(Ll/ᩳۖۖ;)Ll/۫ۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public final getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 139
    iget-object v0, p0, Ll/۫ۖۖ;->ۙ:Ll/ᩳۖۖ;

    invoke-static {v0}, Ll/۫ۖۖ;->֫(Ll/ᩳۖۖ;)Ll/۫ۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public final getDescriptorForType()Ll/ᩳۖۖ;
    .locals 1

    .line 134
    iget-object v0, p0, Ll/۫ۖۖ;->ۙ:Ll/ᩳۖۖ;

    return-object v0
.end method

.method public final getField(Ll/֡ۖۖ;)Ljava/lang/Object;
    .locals 2

    .line 281
    invoke-virtual {p1}, Ll/֡ۖۖ;->ᩴ()Ll/ᩳۖۖ;

    move-result-object v0

    iget-object v1, p0, Ll/۫ۖۖ;->ۙ:Ll/ᩳۖۖ;

    if-ne v0, v1, :cond_3

    .line 172
    iget-object v0, p0, Ll/۫ۖۖ;->᩸:Ll/᩵ۘۖ;

    invoke-virtual {v0, p1}, Ll/᩵ۘۖ;->֫(Ll/ᩴۘۖ;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    .line 174
    invoke-virtual {p1}, Ll/֡ۖۖ;->۟֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 175
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1

    .line 176
    :cond_0
    invoke-virtual {p1}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    move-result-object v0

    sget-object v1, Ll/ᩴۖۖ;->ۨ:Ll/ᩴۖۖ;

    if-ne v0, v1, :cond_1

    .line 177
    invoke-virtual {p1}, Ll/֡ۖۖ;->᩸()Ll/ᩳۖۖ;

    move-result-object p1

    invoke-static {p1}, Ll/۫ۖۖ;->֫(Ll/ᩳۖۖ;)Ll/۫ۖۖ;

    move-result-object p1

    return-object p1

    .line 179
    :cond_1
    invoke-virtual {p1}, Ll/֡ۖۖ;->֡()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v0

    .line 282
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "FieldDescriptor does not match message type."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getOneofFieldDescriptor(Ll/ܶۖۖ;)Ll/֡ۖۖ;
    .locals 2

    .line 288
    invoke-virtual {p1}, Ll/ܶۖۖ;->ܺ()Ll/ᩳۖۖ;

    move-result-object v0

    iget-object v1, p0, Ll/۫ۖۖ;->ۙ:Ll/ᩳۖۖ;

    if-ne v0, v1, :cond_0

    .line 160
    iget-object v0, p0, Ll/۫ۖۖ;->᩶:[Ll/֡ۖۖ;

    invoke-virtual {p1}, Ll/ܶۖۖ;->֡()I

    move-result p1

    aget-object p1, v0, p1

    return-object p1

    .line 289
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "OneofDescriptor does not match message type."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getParserForType()Ll/۫֡ۖ;
    .locals 1

    .line 261
    new-instance v0, Ll/ۙۖۖ;

    invoke-direct {v0, p0}, Ll/ۙۖۖ;-><init>(Ll/۫ۖۖ;)V

    return-object v0
.end method

.method public final getSerializedSize()I
    .locals 3

    .line 234
    iget v0, p0, Ll/۫ۖۖ;->᩹:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    .line 237
    :cond_0
    iget-object v0, p0, Ll/۫ۖۖ;->ۙ:Ll/ᩳۖۖ;

    invoke-virtual {v0}, Ll/ᩳۖۖ;->۠()Ll/ܽܺۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽܺۖ;->ᩴ()Z

    move-result v0

    iget-object v1, p0, Ll/۫ۖۖ;->ۗ:Ll/ۢ֨ۖ;

    iget-object v2, p0, Ll/۫ۖۖ;->᩸:Ll/᩵ۘۖ;

    if-eqz v0, :cond_1

    .line 238
    invoke-virtual {v2}, Ll/᩵ۘۖ;->ܽ()I

    move-result v0

    .line 239
    invoke-virtual {v1}, Ll/ۢ֨ۖ;->ۧ()I

    move-result v1

    goto :goto_0

    .line 241
    :cond_1
    invoke-virtual {v2}, Ll/᩵ۘۖ;->ᩳ()I

    move-result v0

    .line 242
    invoke-virtual {v1}, Ll/ۢ֨ۖ;->getSerializedSize()I

    move-result v1

    :goto_0
    add-int/2addr v1, v0

    .line 245
    iput v1, p0, Ll/۫ۖۖ;->᩹:I

    return v1
.end method

.method public final getUnknownFields()Ll/ۢ֨ۖ;
    .locals 1

    .line 199
    iget-object v0, p0, Ll/۫ۖۖ;->ۗ:Ll/ۢ֨ۖ;

    return-object v0
.end method

.method public final hasField(Ll/֡ۖۖ;)Z
    .locals 2

    .line 281
    invoke-virtual {p1}, Ll/֡ۖۖ;->ᩴ()Ll/ᩳۖۖ;

    move-result-object v0

    iget-object v1, p0, Ll/۫ۖۖ;->ۙ:Ll/ᩳۖۖ;

    if-ne v0, v1, :cond_0

    .line 166
    iget-object v0, p0, Ll/۫ۖۖ;->᩸:Ll/᩵ۘۖ;

    invoke-virtual {v0, p1}, Ll/᩵ۘۖ;->֫(Ll/֡ۖۖ;)Z

    move-result p1

    return p1

    .line 282
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "FieldDescriptor does not match message type."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final hasOneof(Ll/ܶۖۖ;)Z
    .locals 2

    .line 288
    invoke-virtual {p1}, Ll/ܶۖۖ;->ܺ()Ll/ᩳۖۖ;

    move-result-object v0

    iget-object v1, p0, Ll/۫ۖۖ;->ۙ:Ll/ᩳۖۖ;

    if-ne v0, v1, :cond_1

    .line 150
    iget-object v0, p0, Ll/۫ۖۖ;->᩶:[Ll/֡ۖۖ;

    invoke-virtual {p1}, Ll/ܶۖۖ;->֡()I

    move-result p1

    aget-object p1, v0, p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1

    .line 289
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "OneofDescriptor does not match message type."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final isInitialized()Z
    .locals 4

    .line 204
    iget-object v0, p0, Ll/۫ۖۖ;->ۙ:Ll/ᩳۖۖ;

    invoke-virtual {v0}, Ll/ᩳۖۖ;->getFields()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    iget-object v2, p0, Ll/۫ۖۖ;->᩸:Ll/᩵ۘۖ;

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ۖۖ;

    .line 205
    invoke-virtual {v1}, Ll/֡ۖۖ;->ۛ()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 206
    invoke-virtual {v2, v1}, Ll/᩵ۘۖ;->֫(Ll/֡ۖۖ;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return v0

    .line 213
    :cond_1
    invoke-virtual {v2}, Ll/᩵ۘۖ;->᩻()Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic newBuilderForType()Ll/ۢ֡ۖ;
    .locals 1

    .line 29
    invoke-virtual {p0}, Ll/۫ۖۖ;->newBuilderForType()Ll/۬ۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public final newBuilderForType()Ll/۬ۖۖ;
    .locals 3

    .line 251
    new-instance v0, Ll/۬ۖۖ;

    iget-object v1, p0, Ll/۫ۖۖ;->ۙ:Ll/ᩳۖۖ;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/۬ۖۖ;-><init>(Ll/ᩳۖۖ;I)V

    return-object v0
.end method

.method public final bridge synthetic newBuilderForType()Ll/ܳ֡ۖ;
    .locals 1

    .line 29
    invoke-virtual {p0}, Ll/۫ۖۖ;->newBuilderForType()Ll/۬ۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public final toBuilder()Ll/ۢ֡ۖ;
    .locals 1

    .line 256
    invoke-virtual {p0}, Ll/۫ۖۖ;->newBuilderForType()Ll/۬ۖۖ;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/۬ۖۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/۬ۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public final toBuilder()Ll/ܳ֡ۖ;
    .locals 1

    .line 256
    invoke-virtual {p0}, Ll/۫ۖۖ;->newBuilderForType()Ll/۬ۖۖ;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/۬ۖۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/۬ۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public final writeTo(Ll/ܳ᩷ۖ;)V
    .locals 3

    .line 223
    iget-object v0, p0, Ll/۫ۖۖ;->ۙ:Ll/ᩳۖۖ;

    invoke-virtual {v0}, Ll/ᩳۖۖ;->۠()Ll/ܽܺۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽܺۖ;->ᩴ()Z

    move-result v0

    iget-object v1, p0, Ll/۫ۖۖ;->ۗ:Ll/ۢ֨ۖ;

    iget-object v2, p0, Ll/۫ۖۖ;->᩸:Ll/᩵ۘۖ;

    if-eqz v0, :cond_0

    .line 224
    invoke-virtual {v2, p1}, Ll/᩵ۘۖ;->֫(Ll/ܳ᩷ۖ;)V

    .line 225
    invoke-virtual {v1, p1}, Ll/ۢ֨ۖ;->֫(Ll/ܳ᩷ۖ;)V

    return-void

    .line 227
    :cond_0
    invoke-virtual {v2, p1}, Ll/᩵ۘۖ;->ۧ(Ll/ܳ᩷ۖ;)V

    .line 228
    invoke-virtual {v1, p1}, Ll/ۢ֨ۖ;->writeTo(Ll/ܳ᩷ۖ;)V

    return-void
.end method
