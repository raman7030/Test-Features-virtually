.class public final Ll/֫ۢۖ;
.super Ll/۫ۘۖ;
.source "T9Q9"


# static fields
.field public static final serialVersionUID:J

.field public static final ۛ:Ll/֫ۢۖ;

.field public static final ۨ:Ll/۫֡ۖ;


# instance fields
.field public ۗ:Z

.field public ۙ:Z

.field public ۤ:Ljava/util/List;

.field public ۫:B

.field public ۬:Ll/ۛۢۖ;

.field public ᩶:I

.field public ᩹:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 31942
    sget-object v0, Ll/ۜۚۖ;->᩶:Ll/ۜۚۖ;

    const-class v1, Ll/֫ۢۖ;

    .line 31948
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    .line 31942
    invoke-static {v0, v1}, Ll/᩷ۚۖ;->֫(Ll/ۜۚۖ;Ljava/lang/String;)V

    .line 33112
    new-instance v0, Ll/֫ۢۖ;

    invoke-direct {v0}, Ll/֫ۢۖ;-><init>()V

    sput-object v0, Ll/֫ۢۖ;->ۛ:Ll/֫ۢۖ;

    .line 33120
    new-instance v0, Ll/ܰ᩷ۖ;

    invoke-direct {v0}, Ll/ᩴۜۖ;-><init>()V

    sput-object v0, Ll/֫ۢۖ;->ۨ:Ll/۫֡ۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 31954
    invoke-direct {p0}, Ll/۫ۘۖ;-><init>()V

    const/4 v0, 0x0

    .line 31973
    iput-boolean v0, p0, Ll/֫ۢۖ;->᩹:Z

    .line 31992
    iput-boolean v0, p0, Ll/֫ۢۖ;->ۗ:Z

    .line 32011
    iput-boolean v0, p0, Ll/֫ۢۖ;->ۙ:Z

    const/4 v0, -0x1

    .line 32100
    iput-byte v0, p0, Ll/֫ۢۖ;->۫:B

    .line 31955
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/֫ۢۖ;->ۤ:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ll/۟᩷ۖ;)V
    .locals 0

    .line 31952
    invoke-direct {p0, p1}, Ll/۫ۘۖ;-><init>(Ll/ۗۘۖ;)V

    const/4 p1, 0x0

    .line 31973
    iput-boolean p1, p0, Ll/֫ۢۖ;->᩹:Z

    .line 31992
    iput-boolean p1, p0, Ll/֫ۢۖ;->ۗ:Z

    .line 32011
    iput-boolean p1, p0, Ll/֫ۢۖ;->ۙ:Z

    const/4 p1, -0x1

    .line 32100
    iput-byte p1, p0, Ll/֫ۢۖ;->۫:B

    return-void
.end method

.method public static getDefaultInstance()Ll/֫ۢۖ;
    .locals 1

    .line 33116
    sget-object v0, Ll/֫ۢۖ;->ۛ:Ll/֫ۢۖ;

    return-object v0
.end method

.method public static newBuilder()Ll/۟᩷ۖ;
    .locals 1

    .line 32333
    sget-object v0, Ll/֫ۢۖ;->ۛ:Ll/֫ۢۖ;

    invoke-virtual {v0}, Ll/֫ۢۖ;->toBuilder()Ll/۟᩷ۖ;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic ֫(Ll/֫ۢۖ;)Ljava/util/List;
    .locals 0

    .line 31935
    iget-object p0, p0, Ll/֫ۢۖ;->ۤ:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic ֫(Ll/֫ۢۖ;I)V
    .locals 1

    .line 31935
    iget v0, p0, Ll/֫ۢۖ;->᩶:I

    or-int/2addr p1, v0

    iput p1, p0, Ll/֫ۢۖ;->᩶:I

    return-void
.end method

.method public static synthetic ֫(Ll/֫ۢۖ;Ljava/util/List;)V
    .locals 0

    .line 31935
    iput-object p1, p0, Ll/֫ۢۖ;->ۤ:Ljava/util/List;

    return-void
.end method

.method public static synthetic ֫(Ll/֫ۢۖ;Ll/ۛۢۖ;)V
    .locals 0

    .line 31935
    iput-object p1, p0, Ll/֫ۢۖ;->۬:Ll/ۛۢۖ;

    return-void
.end method

.method public static synthetic ֫(Ll/֫ۢۖ;Z)V
    .locals 0

    .line 31935
    iput-boolean p1, p0, Ll/֫ۢۖ;->᩹:Z

    return-void
.end method

.method public static synthetic ۧ(Ll/֫ۢۖ;Z)V
    .locals 0

    .line 31935
    iput-boolean p1, p0, Ll/֫ۢۖ;->ۗ:Z

    return-void
.end method

.method public static synthetic ܽ(Ll/֫ۢۖ;Z)V
    .locals 0

    .line 31935
    iput-boolean p1, p0, Ll/֫ۢۖ;->ۙ:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 32189
    :cond_0
    instance-of v1, p1, Ll/֫ۢۖ;

    if-nez v1, :cond_1

    .line 32190
    invoke-super {p0, p1}, Ll/ۡۜۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 32192
    :cond_1
    check-cast p1, Ll/֫ۢۖ;

    .line 32194
    invoke-virtual {p0}, Ll/֫ۢۖ;->ᩴ()Z

    move-result v1

    invoke-virtual {p1}, Ll/֫ۢۖ;->ᩴ()Z

    move-result v2

    const/4 v3, 0x0

    if-eq v1, v2, :cond_2

    return v3

    .line 32195
    :cond_2
    invoke-virtual {p0}, Ll/֫ۢۖ;->ᩴ()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 31988
    iget-boolean v1, p0, Ll/֫ۢۖ;->᩹:Z

    iget-boolean v2, p1, Ll/֫ۢۖ;->᩹:Z

    if-eq v1, v2, :cond_3

    return v3

    .line 32199
    :cond_3
    invoke-virtual {p0}, Ll/֫ۢۖ;->᩵()Z

    move-result v1

    invoke-virtual {p1}, Ll/֫ۢۖ;->᩵()Z

    move-result v2

    if-eq v1, v2, :cond_4

    return v3

    .line 32200
    :cond_4
    invoke-virtual {p0}, Ll/֫ۢۖ;->᩵()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 32007
    iget-boolean v1, p0, Ll/֫ۢۖ;->ۗ:Z

    iget-boolean v2, p1, Ll/֫ۢۖ;->ۗ:Z

    if-eq v1, v2, :cond_5

    return v3

    .line 32204
    :cond_5
    invoke-virtual {p0}, Ll/֫ۢۖ;->֡()Z

    move-result v1

    invoke-virtual {p1}, Ll/֫ۢۖ;->֡()Z

    move-result v2

    if-eq v1, v2, :cond_6

    return v3

    .line 32205
    :cond_6
    invoke-virtual {p0}, Ll/֫ۢۖ;->֡()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 32030
    iget-boolean v1, p0, Ll/֫ۢۖ;->ۙ:Z

    iget-boolean v2, p1, Ll/֫ۢۖ;->ۙ:Z

    if-eq v1, v2, :cond_7

    return v3

    .line 32209
    :cond_7
    invoke-virtual {p0}, Ll/֫ۢۖ;->ۚ()Z

    move-result v1

    invoke-virtual {p1}, Ll/֫ۢۖ;->ۚ()Z

    move-result v2

    if-eq v1, v2, :cond_8

    return v3

    .line 32210
    :cond_8
    invoke-virtual {p0}, Ll/֫ۢۖ;->ۚ()Z

    move-result v1

    if-eqz v1, :cond_9

    .line 32211
    invoke-virtual {p0}, Ll/֫ۢۖ;->ۘ()Ll/ۛۢۖ;

    move-result-object v1

    .line 32212
    invoke-virtual {p1}, Ll/֫ۢۖ;->ۘ()Ll/ۛۢۖ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۛۢۖ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v3

    .line 32067
    :cond_9
    iget-object v1, p0, Ll/֫ۢۖ;->ۤ:Ljava/util/List;

    iget-object v2, p1, Ll/֫ۢۖ;->ۤ:Ljava/util/List;

    .line 32215
    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v3

    .line 32216
    :cond_a
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۢ֨ۖ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v3

    .line 32217
    :cond_b
    invoke-virtual {p0}, Ll/۫ۘۖ;->ۢ()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p1}, Ll/۫ۘۖ;->ۢ()Ljava/util/Map;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v3

    :cond_c
    return v0
.end method

.method public final getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 33152
    sget-object v0, Ll/֫ۢۖ;->ۛ:Ll/֫ۢۖ;

    return-object v0
.end method

.method public final getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 33152
    sget-object v0, Ll/֫ۢۖ;->ۛ:Ll/֫ۢۖ;

    return-object v0
.end method

.method public final getParserForType()Ll/۫֡ۖ;
    .locals 1

    .line 33147
    sget-object v0, Ll/֫ۢۖ;->ۨ:Ll/۫֡ۖ;

    return-object v0
.end method

.method public final getSerializedSize()I
    .locals 4

    .line 32154
    iget v0, p0, Ll/ۡۜۖ;->memoizedSize:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    .line 32158
    :cond_0
    iget v0, p0, Ll/֫ۢۖ;->᩶:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 32160
    invoke-static {v1}, Ll/ܳ᩷ۖ;->ᩳ(I)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 32162
    :goto_0
    iget v3, p0, Ll/֫ۢۖ;->᩶:I

    and-int/2addr v1, v3

    if-eqz v1, :cond_2

    const/4 v1, 0x3

    .line 32164
    invoke-static {v1}, Ll/ܳ᩷ۖ;->ᩳ(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 32166
    :cond_2
    iget v1, p0, Ll/֫ۢۖ;->᩶:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_3

    const/4 v1, 0x6

    .line 32168
    invoke-static {v1}, Ll/ܳ᩷ۖ;->ᩳ(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 32170
    :cond_3
    iget v1, p0, Ll/֫ۢۖ;->᩶:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_4

    const/4 v1, 0x7

    .line 32172
    invoke-virtual {p0}, Ll/֫ۢۖ;->ۘ()Ll/ۛۢۖ;

    move-result-object v3

    invoke-static {v1, v3}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v1

    add-int/2addr v0, v1

    .line 32174
    :cond_4
    :goto_1
    iget-object v1, p0, Ll/֫ۢۖ;->ۤ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v2, v1, :cond_5

    .line 32175
    iget-object v1, p0, Ll/֫ۢۖ;->ۤ:Ljava/util/List;

    .line 32176
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡ֡ۖ;

    const/16 v3, 0x3e7

    invoke-static {v3, v1}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 32178
    :cond_5
    invoke-virtual {p0}, Ll/۫ۘۖ;->᩷()I

    move-result v1

    add-int/2addr v0, v1

    .line 32179
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->getSerializedSize()I

    move-result v1

    add-int/2addr v1, v0

    .line 32180
    iput v1, p0, Ll/ۡۜۖ;->memoizedSize:I

    return v1
.end method

.method public final hashCode()I
    .locals 4

    .line 32224
    iget v0, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    if-eqz v0, :cond_0

    return v0

    .line 31960
    :cond_0
    invoke-static {}, Ll/ۧۖۖ;->᩹()Ll/ᩳۖۖ;

    move-result-object v0

    .line 32228
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x30b

    .line 32229
    invoke-virtual {p0}, Ll/֫ۢۖ;->ᩴ()Z

    move-result v1

    const/16 v2, 0x35

    const/16 v3, 0x25

    if-eqz v1, :cond_1

    const/4 v1, 0x2

    .line 32230
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 31988
    iget-boolean v1, p0, Ll/֫ۢۖ;->᩹:Z

    .line 32231
    invoke-static {v1}, Ll/ܰᩴۖ;->֫(Z)I

    move-result v1

    add-int/2addr v0, v1

    .line 32234
    :cond_1
    invoke-virtual {p0}, Ll/֫ۢۖ;->᩵()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x3

    .line 32235
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 32007
    iget-boolean v1, p0, Ll/֫ۢۖ;->ۗ:Z

    .line 32236
    invoke-static {v1}, Ll/ܰᩴۖ;->֫(Z)I

    move-result v1

    add-int/2addr v0, v1

    .line 32239
    :cond_2
    invoke-virtual {p0}, Ll/֫ۢۖ;->֡()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x6

    .line 32240
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 32030
    iget-boolean v1, p0, Ll/֫ۢۖ;->ۙ:Z

    .line 32241
    invoke-static {v1}, Ll/ܰᩴۖ;->֫(Z)I

    move-result v1

    add-int/2addr v0, v1

    .line 32244
    :cond_3
    invoke-virtual {p0}, Ll/֫ۢۖ;->ۚ()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x7

    .line 32245
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 32246
    invoke-virtual {p0}, Ll/֫ۢۖ;->ۘ()Ll/ۛۢۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۛۢۖ;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 32082
    :cond_4
    iget-object v1, p0, Ll/֫ۢۖ;->ۤ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_5

    const/16 v1, 0x3e7

    .line 32249
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 32067
    iget-object v1, p0, Ll/֫ۢۖ;->ۤ:Ljava/util/List;

    .line 32250
    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 32252
    :cond_5
    invoke-virtual {p0}, Ll/۫ۘۖ;->ۢ()Ljava/util/Map;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۡۜۖ;->֫(ILjava/util/Map;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1d

    .line 32253
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    .line 32254
    iput v1, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    return v1
.end method

.method public final internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 31966
    invoke-static {}, Ll/ۧۖۖ;->᩶()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/֫ۢۖ;

    const-class v2, Ll/۟᩷ۖ;

    .line 31967
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 4

    .line 32103
    iget-byte v0, p0, Ll/֫ۢۖ;->۫:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    .line 32107
    :cond_1
    invoke-virtual {p0}, Ll/֫ۢۖ;->ۚ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 32108
    invoke-virtual {p0}, Ll/֫ۢۖ;->ۘ()Ll/ۛۢۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۛۢۖ;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_2

    .line 32109
    iput-byte v2, p0, Ll/֫ۢۖ;->۫:B

    return v2

    :cond_2
    const/4 v0, 0x0

    .line 32082
    :goto_0
    iget-object v3, p0, Ll/֫ۢۖ;->ۤ:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_4

    .line 32089
    iget-object v3, p0, Ll/֫ۢۖ;->ۤ:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֫ۖۖ;

    .line 32114
    invoke-virtual {v3}, Ll/֫ۖۖ;->isInitialized()Z

    move-result v3

    if-nez v3, :cond_3

    .line 32115
    iput-byte v2, p0, Ll/֫ۢۖ;->۫:B

    return v2

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 32119
    :cond_4
    invoke-virtual {p0}, Ll/۫ۘۖ;->ۜ()Z

    move-result v0

    if-nez v0, :cond_5

    .line 32120
    iput-byte v2, p0, Ll/֫ۢۖ;->۫:B

    return v2

    .line 32123
    :cond_5
    iput-byte v1, p0, Ll/֫ۢۖ;->۫:B

    return v1
.end method

.method public final newBuilderForType()Ll/ۢ֡ۖ;
    .locals 1

    .line 32333
    sget-object v0, Ll/֫ۢۖ;->ۛ:Ll/֫ۢۖ;

    invoke-virtual {v0}, Ll/֫ۢۖ;->toBuilder()Ll/۟᩷ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final newBuilderForType()Ll/ܳ֡ۖ;
    .locals 1

    .line 32333
    sget-object v0, Ll/֫ۢۖ;->ۛ:Ll/֫ۢۖ;

    invoke-virtual {v0}, Ll/֫ۢۖ;->toBuilder()Ll/۟᩷ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final newBuilderForType(Ll/ۢۜۖ;)Ll/ܳ֡ۖ;
    .locals 2

    .line 32347
    new-instance v0, Ll/۟᩷ۖ;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/۟᩷ۖ;-><init>(Ll/ۢۜۖ;I)V

    return-object v0
.end method

.method public final toBuilder()Ll/۟᩷ۖ;
    .locals 2

    .line 32340
    sget-object v0, Ll/֫ۢۖ;->ۛ:Ll/֫ۢۖ;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    .line 32341
    new-instance v0, Ll/۟᩷ۖ;

    invoke-direct {v0, v1}, Ll/۟᩷ۖ;-><init>(I)V

    return-object v0

    :cond_0
    new-instance v0, Ll/۟᩷ۖ;

    invoke-direct {v0, v1}, Ll/۟᩷ۖ;-><init>(I)V

    invoke-virtual {v0, p0}, Ll/۟᩷ۖ;->֫(Ll/֫ۢۖ;)V

    return-object v0
.end method

.method public final bridge synthetic toBuilder()Ll/ۢ֡ۖ;
    .locals 1

    .line 31935
    invoke-virtual {p0}, Ll/֫ۢۖ;->toBuilder()Ll/۟᩷ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic toBuilder()Ll/ܳ֡ۖ;
    .locals 1

    .line 31935
    invoke-virtual {p0}, Ll/֫ۢۖ;->toBuilder()Ll/۟᩷ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final writeTo(Ll/ܳ᩷ۖ;)V
    .locals 4

    .line 1079
    new-instance v0, Ll/۬ۘۖ;

    invoke-direct {v0, p0}, Ll/۬ۘۖ;-><init>(Ll/۫ۘۖ;)V

    .line 32133
    iget v1, p0, Ll/֫ۢۖ;->᩶:I

    and-int/lit8 v1, v1, 0x1

    const/4 v2, 0x2

    if-eqz v1, :cond_0

    .line 32134
    iget-boolean v1, p0, Ll/֫ۢۖ;->᩹:Z

    invoke-virtual {p1, v2, v1}, Ll/ܳ᩷ۖ;->֫(IZ)V

    .line 32136
    :cond_0
    iget v1, p0, Ll/֫ۢۖ;->᩶:I

    and-int/2addr v1, v2

    if-eqz v1, :cond_1

    const/4 v1, 0x3

    .line 32137
    iget-boolean v2, p0, Ll/֫ۢۖ;->ۗ:Z

    invoke-virtual {p1, v1, v2}, Ll/ܳ᩷ۖ;->֫(IZ)V

    .line 32139
    :cond_1
    iget v1, p0, Ll/֫ۢۖ;->᩶:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_2

    const/4 v1, 0x6

    .line 32140
    iget-boolean v2, p0, Ll/֫ۢۖ;->ۙ:Z

    invoke-virtual {p1, v1, v2}, Ll/ܳ᩷ۖ;->֫(IZ)V

    .line 32142
    :cond_2
    iget v1, p0, Ll/֫ۢۖ;->᩶:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_3

    const/4 v1, 0x7

    .line 32143
    invoke-virtual {p0}, Ll/֫ۢۖ;->ۘ()Ll/ۛۢۖ;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    :cond_3
    const/4 v1, 0x0

    .line 32145
    :goto_0
    iget-object v2, p0, Ll/֫ۢۖ;->ۤ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_4

    .line 32146
    iget-object v2, p0, Ll/֫ۢۖ;->ۤ:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۡ֡ۖ;

    const/16 v3, 0x3e7

    invoke-virtual {p1, v3, v2}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    const/high16 v1, 0x20000000

    .line 32148
    invoke-virtual {v0, v1, p1}, Ll/۬ۘۖ;->֫(ILl/ܳ᩷ۖ;)V

    .line 32149
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۢ֨ۖ;->writeTo(Ll/ܳ᩷ۖ;)V

    return-void
.end method

.method public final ֡()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 32020
    iget v0, p0, Ll/֫ۢۖ;->᩶:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۖ()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 32030
    iget-boolean v0, p0, Ll/֫ۢۖ;->ۙ:Z

    return v0
.end method

.method public final ۘ()Ll/ۛۢۖ;
    .locals 1

    .line 32049
    iget-object v0, p0, Ll/֫ۢۖ;->۬:Ll/ۛۢۖ;

    if-nez v0, :cond_0

    invoke-static {}, Ll/ۛۢۖ;->getDefaultInstance()Ll/ۛۢۖ;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final ۚ()Z
    .locals 1

    .line 32041
    iget v0, p0, Ll/֫ۢۖ;->᩶:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۡ()Z
    .locals 1

    .line 31988
    iget-boolean v0, p0, Ll/֫ۢۖ;->᩹:Z

    return v0
.end method

.method public final ܺ()Z
    .locals 1

    .line 32007
    iget-boolean v0, p0, Ll/֫ۢۖ;->ۗ:Z

    return v0
.end method

.method public final ᩴ()Z
    .locals 2

    .line 31980
    iget v0, p0, Ll/֫ۢۖ;->᩶:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩵()Z
    .locals 1

    .line 31999
    iget v0, p0, Ll/֫ۢۖ;->᩶:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
