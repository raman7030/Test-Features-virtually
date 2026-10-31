.class public final Ll/᩹᩵ۖ;
.super Ll/᩷ۜۖ;
.source "D9PU"


# instance fields
.field public ᩸:Z

.field public ᩹:Z


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    const/4 p1, 0x1

    .line 220
    invoke-direct {p0, p1, p1}, Ll/᩹᩵ۖ;-><init>(ZZ)V

    return-void
.end method

.method public constructor <init>(ZZ)V
    .locals 0

    .line 231
    invoke-direct {p0}, Ll/᩷ۜۖ;-><init>()V

    .line 235
    iput-boolean p1, p0, Ll/᩹᩵ۖ;->᩸:Z

    .line 236
    iput-boolean p2, p0, Ll/᩹᩵ۖ;->᩹:Z

    return-void
.end method


# virtual methods
.method public final addRepeatedField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/ܳ֡ۖ;
    .locals 0

    .line 358
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "There is no repeated field in a map entry message."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final build()Ll/ۡ֡ۖ;
    .locals 1

    .line 273
    invoke-virtual {p0}, Ll/᩹᩵ۖ;->buildPartial()Ll/᩶᩵ۖ;

    const/4 v0, 0x0

    .line 427
    throw v0
.end method

.method public final build()Ll/᩻֡ۖ;
    .locals 1

    .line 273
    invoke-virtual {p0}, Ll/᩹᩵ۖ;->buildPartial()Ll/᩶᩵ۖ;

    const/4 v0, 0x0

    .line 427
    throw v0
.end method

.method public final bridge synthetic buildPartial()Ll/ۡ֡ۖ;
    .locals 1

    .line 220
    invoke-virtual {p0}, Ll/᩹᩵ۖ;->buildPartial()Ll/᩶᩵ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final buildPartial()Ll/᩶᩵ۖ;
    .locals 2

    .line 282
    new-instance v0, Ll/᩶᩵ۖ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/᩶᩵ۖ;-><init>(I)V

    return-object v0
.end method

.method public final bridge synthetic buildPartial()Ll/᩻֡ۖ;
    .locals 1

    .line 220
    invoke-virtual {p0}, Ll/᩹᩵ۖ;->buildPartial()Ll/᩶᩵ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final clearField(Ll/֡ۖۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 291
    invoke-virtual {p1}, Ll/֡ۖۖ;->ᩴ()Ll/ᩳۖۖ;

    const/4 p1, 0x0

    throw p1
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 220
    invoke-virtual {p0}, Ll/᩹᩵ۖ;->clone()Ll/᩹᩵ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic clone()Ll/ۖۜۖ;
    .locals 1

    .line 220
    invoke-virtual {p0}, Ll/᩹᩵ۖ;->clone()Ll/᩹᩵ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic clone()Ll/ۢ֡ۖ;
    .locals 1

    .line 220
    invoke-virtual {p0}, Ll/᩹᩵ۖ;->clone()Ll/᩹᩵ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic clone()Ll/ܳ֡ۖ;
    .locals 1

    .line 220
    invoke-virtual {p0}, Ll/᩹᩵ۖ;->clone()Ll/᩹᩵ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic clone()Ll/᩷ۜۖ;
    .locals 1

    .line 220
    invoke-virtual {p0}, Ll/᩹᩵ۖ;->clone()Ll/᩹᩵ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Ll/᩹᩵ۖ;
    .locals 3

    .line 422
    new-instance v0, Ll/᩹᩵ۖ;

    iget-boolean v1, p0, Ll/᩹᩵ۖ;->᩸:Z

    iget-boolean v2, p0, Ll/᩹᩵ۖ;->᩹:Z

    invoke-direct {v0, v1, v2}, Ll/᩹᩵ۖ;-><init>(ZZ)V

    return-object v0
.end method

.method public final getAllFields()Ljava/util/Map;
    .locals 1

    .line 379
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    const/4 v0, 0x0

    .line 380
    throw v0
.end method

.method public final getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    const/4 v0, 0x0

    .line 369
    throw v0
.end method

.method public final getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    const/4 v0, 0x0

    .line 369
    throw v0
.end method

.method public final getDescriptorForType()Ll/ᩳۖۖ;
    .locals 1

    const/4 v0, 0x0

    .line 287
    throw v0
.end method

.method public final getField(Ll/֡ۖۖ;)Ljava/lang/Object;
    .locals 0

    .line 291
    invoke-virtual {p1}, Ll/֡ۖۖ;->ᩴ()Ll/ᩳۖۖ;

    const/4 p1, 0x0

    throw p1
.end method

.method public final getUnknownFields()Ll/ۢ֨ۖ;
    .locals 1

    .line 417
    invoke-static {}, Ll/ۢ֨ۖ;->ܽ()Ll/ۢ֨ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final hasField(Ll/֡ۖۖ;)Z
    .locals 0

    .line 291
    invoke-virtual {p1}, Ll/֡ۖۖ;->ᩴ()Ll/ᩳۖۖ;

    const/4 p1, 0x0

    throw p1
.end method

.method public final isInitialized()Z
    .locals 1

    const/4 v0, 0x0

    .line 427
    throw v0
.end method

.method public final newBuilderForField(Ll/֡ۖۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 291
    invoke-virtual {p1}, Ll/֡ۖۖ;->ᩴ()Ll/ᩳۖۖ;

    const/4 p1, 0x0

    throw p1
.end method

.method public final setField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/ܳ֡ۖ;
    .locals 0

    .line 291
    invoke-virtual {p1}, Ll/֡ۖۖ;->ᩴ()Ll/ᩳۖۖ;

    const/4 p1, 0x0

    throw p1
.end method

.method public final setUnknownFields(Ll/ۢ֨ۖ;)Ll/ܳ֡ۖ;
    .locals 0

    return-object p0
.end method
