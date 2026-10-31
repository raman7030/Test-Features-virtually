.class public final Ll/᩶᩵ۖ;
.super Ll/ۡۜۖ;
.source "D9PU"


# instance fields
.field public volatile ᩸:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 72
    invoke-direct {p0}, Ll/ۡۜۖ;-><init>()V

    const/4 v0, -0x1

    .line 116
    iput v0, p0, Ll/᩶᩵ۖ;->᩸:I

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ll/᩶᩵ۖ;-><init>()V

    return-void
.end method


# virtual methods
.method public final getAllFields()Ljava/util/Map;
    .locals 1

    .line 166
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    const/4 v0, 0x0

    .line 167
    throw v0
.end method

.method public final getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    const/4 v0, 0x0

    .line 156
    throw v0
.end method

.method public final getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    const/4 v0, 0x0

    .line 156
    throw v0
.end method

.method public final getDescriptorForType()Ll/ᩳۖۖ;
    .locals 1

    const/4 v0, 0x0

    .line 161
    throw v0
.end method

.method public final getField(Ll/֡ۖۖ;)Ljava/lang/Object;
    .locals 0

    .line 176
    invoke-virtual {p1}, Ll/֡ۖۖ;->ᩴ()Ll/ᩳۖۖ;

    const/4 p1, 0x0

    throw p1
.end method

.method public final getParserForType()Ll/۫֡ۖ;
    .locals 1

    const/4 v0, 0x0

    .line 141
    throw v0
.end method

.method public final getSerializedSize()I
    .locals 2

    .line 120
    iget v0, p0, Ll/᩶᩵ۖ;->᩸:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 121
    iget v0, p0, Ll/᩶᩵ۖ;->᩸:I

    return v0

    :cond_0
    const/4 v0, 0x0

    .line 91
    throw v0
.end method

.method public final getUnknownFields()Ll/ۢ֨ۖ;
    .locals 1

    .line 216
    invoke-static {}, Ll/ۢ֨ۖ;->ܽ()Ll/ۢ֨ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final hasField(Ll/֡ۖۖ;)Z
    .locals 0

    const/4 p1, 0x0

    .line 176
    throw p1
.end method

.method public final isInitialized()Z
    .locals 1

    const/4 v0, 0x0

    .line 427
    throw v0
.end method

.method public final newBuilderForType()Ll/ۢ֡ۖ;
    .locals 1

    const/4 v0, 0x0

    .line 228
    throw v0
.end method

.method public final newBuilderForType()Ll/ܳ֡ۖ;
    .locals 1

    const/4 v0, 0x0

    .line 228
    throw v0
.end method

.method public final bridge synthetic toBuilder()Ll/ۢ֡ۖ;
    .locals 1

    .line 27
    invoke-virtual {p0}, Ll/᩶᩵ۖ;->toBuilder()Ll/᩹᩵ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic toBuilder()Ll/ܳ֡ۖ;
    .locals 1

    .line 27
    invoke-virtual {p0}, Ll/᩶᩵ۖ;->toBuilder()Ll/᩹᩵ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final toBuilder()Ll/᩹᩵ۖ;
    .locals 2

    .line 151
    new-instance v0, Ll/᩹᩵ۖ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/᩹᩵ۖ;-><init>(I)V

    return-object v0
.end method

.method public final writeTo(Ll/ܳ᩷ۖ;)V
    .locals 0

    const/4 p1, 0x0

    .line 86
    throw p1
.end method
