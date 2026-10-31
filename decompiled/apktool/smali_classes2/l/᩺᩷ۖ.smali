.class public final Ll/᩺᩷ۖ;
.super Ll/ۘᩴۖ;
.source "T9Q9"

# interfaces
.implements Ll/ۘ֡ۖ;


# static fields
.field public static final serialVersionUID:J

.field public static final ۛ:Ll/۫֡ۖ;

.field public static final ۤ:Ll/᩺᩷ۖ;


# instance fields
.field public ۗ:Ll/ۖ᩵ۖ;

.field public ۙ:Ll/֫ۢۖ;

.field public ۫:Ljava/util/List;

.field public ۬:Ljava/util/List;

.field public volatile ᩶:Ljava/lang/Object;

.field public ᩸:I

.field public ᩹:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 15336
    sget-object v0, Ll/ۜۚۖ;->᩶:Ll/ۜۚۖ;

    const-class v1, Ll/᩺᩷ۖ;

    .line 15342
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    .line 15336
    invoke-static {v0, v1}, Ll/᩷ۚۖ;->֫(Ll/ۜۚۖ;Ljava/lang/String;)V

    .line 17472
    new-instance v0, Ll/᩺᩷ۖ;

    invoke-direct {v0}, Ll/᩺᩷ۖ;-><init>()V

    sput-object v0, Ll/᩺᩷ۖ;->ۤ:Ll/᩺᩷ۖ;

    .line 17480
    new-instance v0, Ll/۬᩷ۖ;

    invoke-direct {v0}, Ll/ᩴۜۖ;-><init>()V

    sput-object v0, Ll/᩺᩷ۖ;->ۛ:Ll/۫֡ۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 15348
    invoke-direct {p0}, Ll/ۘᩴۖ;-><init>()V

    const-string v0, ""

    .line 15934
    iput-object v0, p0, Ll/᩺᩷ۖ;->᩶:Ljava/lang/Object;

    .line 16093
    invoke-static {}, Ll/ۖ᩵ۖ;->ܽ()Ll/ۖ᩵ۖ;

    move-result-object v1

    iput-object v1, p0, Ll/᩺᩷ۖ;->ۗ:Ll/ۖ᩵ۖ;

    const/4 v1, -0x1

    .line 16127
    iput-byte v1, p0, Ll/᩺᩷ۖ;->᩹:B

    .line 15349
    iput-object v0, p0, Ll/᩺᩷ۖ;->᩶:Ljava/lang/Object;

    .line 15350
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/᩺᩷ۖ;->۫:Ljava/util/List;

    .line 15351
    iput-object v0, p0, Ll/᩺᩷ۖ;->۬:Ljava/util/List;

    .line 15353
    invoke-static {}, Ll/ۖ᩵ۖ;->ܽ()Ll/ۖ᩵ۖ;

    move-result-object v0

    iput-object v0, p0, Ll/᩺᩷ۖ;->ۗ:Ll/ۖ᩵ۖ;

    return-void
.end method

.method public constructor <init>(Ll/۫᩷ۖ;I)V
    .locals 0

    .line 15346
    invoke-direct {p0, p1}, Ll/ۘᩴۖ;-><init>(Ll/᩶ۘۖ;)V

    const-string p1, ""

    .line 15934
    iput-object p1, p0, Ll/᩺᩷ۖ;->᩶:Ljava/lang/Object;

    .line 16093
    invoke-static {}, Ll/ۖ᩵ۖ;->ܽ()Ll/ۖ᩵ۖ;

    move-result-object p1

    iput-object p1, p0, Ll/᩺᩷ۖ;->ۗ:Ll/ۖ᩵ۖ;

    const/4 p1, -0x1

    .line 16127
    iput-byte p1, p0, Ll/᩺᩷ۖ;->᩹:B

    return-void
.end method

.method public static getDefaultInstance()Ll/᩺᩷ۖ;
    .locals 1

    .line 17476
    sget-object v0, Ll/᩺᩷ۖ;->ۤ:Ll/᩺᩷ۖ;

    return-object v0
.end method

.method public static newBuilder()Ll/۫᩷ۖ;
    .locals 1

    .line 16342
    sget-object v0, Ll/᩺᩷ۖ;->ۤ:Ll/᩺᩷ۖ;

    invoke-virtual {v0}, Ll/᩺᩷ۖ;->toBuilder()Ll/۫᩷ۖ;

    move-result-object v0

    return-object v0
.end method

.method public static parser()Ll/۫֡ۖ;
    .locals 1

    .line 17502
    sget-object v0, Ll/᩺᩷ۖ;->ۛ:Ll/۫֡ۖ;

    return-object v0
.end method

.method public static synthetic ֫(Ll/᩺᩷ۖ;)Ljava/util/List;
    .locals 0

    .line 15330
    iget-object p0, p0, Ll/᩺᩷ۖ;->۫:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic ֫(Ll/᩺᩷ۖ;I)V
    .locals 1

    .line 15330
    iget v0, p0, Ll/᩺᩷ۖ;->᩸:I

    or-int/2addr p1, v0

    iput p1, p0, Ll/᩺᩷ۖ;->᩸:I

    return-void
.end method

.method public static synthetic ֫(Ll/᩺᩷ۖ;Ljava/lang/Object;)V
    .locals 0

    .line 15330
    iput-object p1, p0, Ll/᩺᩷ۖ;->᩶:Ljava/lang/Object;

    return-void
.end method

.method public static synthetic ֫(Ll/᩺᩷ۖ;Ljava/util/List;)V
    .locals 0

    .line 15330
    iput-object p1, p0, Ll/᩺᩷ۖ;->۫:Ljava/util/List;

    return-void
.end method

.method public static synthetic ֫(Ll/᩺᩷ۖ;Ll/֫ۢۖ;)V
    .locals 0

    .line 15330
    iput-object p1, p0, Ll/᩺᩷ۖ;->ۙ:Ll/֫ۢۖ;

    return-void
.end method

.method public static synthetic ֫(Ll/᩺᩷ۖ;Ll/ۖ᩵ۖ;)V
    .locals 0

    .line 15330
    iput-object p1, p0, Ll/᩺᩷ۖ;->ۗ:Ll/ۖ᩵ۖ;

    return-void
.end method

.method public static synthetic ۧ(Ll/᩺᩷ۖ;)Ljava/util/List;
    .locals 0

    .line 15330
    iget-object p0, p0, Ll/᩺᩷ۖ;->۬:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic ۧ(Ll/᩺᩷ۖ;Ljava/util/List;)V
    .locals 0

    .line 15330
    iput-object p1, p0, Ll/᩺᩷ۖ;->۬:Ljava/util/List;

    return-void
.end method

.method public static synthetic ܽ(Ll/᩺᩷ۖ;)Ljava/lang/Object;
    .locals 0

    .line 15330
    iget-object p0, p0, Ll/᩺᩷ۖ;->᩶:Ljava/lang/Object;

    return-object p0
.end method

.method public static synthetic ᩳ(Ll/᩺᩷ۖ;)Ll/ۖ᩵ۖ;
    .locals 0

    .line 15330
    iget-object p0, p0, Ll/᩺᩷ۖ;->ۗ:Ll/ۖ᩵ۖ;

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p1, p0, :cond_0

    goto/16 :goto_1

    .line 16210
    :cond_0
    instance-of v0, p1, Ll/᩺᩷ۖ;

    if-nez v0, :cond_1

    .line 16211
    invoke-super {p0, p1}, Ll/ۡۜۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 16213
    :cond_1
    check-cast p1, Ll/᩺᩷ۖ;

    .line 16215
    invoke-virtual {p0}, Ll/᩺᩷ۖ;->hasName()Z

    move-result v0

    invoke-virtual {p1}, Ll/᩺᩷ۖ;->hasName()Z

    move-result v1

    if-eq v0, v1, :cond_2

    goto :goto_0

    .line 16216
    :cond_2
    invoke-virtual {p0}, Ll/᩺᩷ۖ;->hasName()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 16217
    invoke-virtual {p0}, Ll/᩺᩷ۖ;->getName()Ljava/lang/String;

    move-result-object v0

    .line 16218
    invoke-virtual {p1}, Ll/᩺᩷ۖ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    .line 15990
    :cond_3
    iget-object v0, p0, Ll/᩺᩷ۖ;->۫:Ljava/util/List;

    iget-object v1, p1, Ll/᩺᩷ۖ;->۫:Ljava/util/List;

    .line 16221
    invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    .line 16222
    :cond_4
    invoke-virtual {p0}, Ll/᩺᩷ۖ;->ۢ()Z

    move-result v0

    invoke-virtual {p1}, Ll/᩺᩷ۖ;->ۢ()Z

    move-result v1

    if-eq v0, v1, :cond_5

    goto :goto_0

    .line 16223
    :cond_5
    invoke-virtual {p0}, Ll/᩺᩷ۖ;->ۢ()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 16224
    invoke-virtual {p0}, Ll/᩺᩷ۖ;->ۜ()Ll/֫ۢۖ;

    move-result-object v0

    .line 16225
    invoke-virtual {p1}, Ll/᩺᩷ۖ;->ۜ()Ll/֫ۢۖ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/֫ۢۖ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    .line 16057
    :cond_6
    iget-object v0, p0, Ll/᩺᩷ۖ;->۬:Ljava/util/List;

    iget-object v1, p1, Ll/᩺᩷ۖ;->۬:Ljava/util/List;

    .line 16228
    invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    .line 16100
    :cond_7
    iget-object v0, p0, Ll/᩺᩷ۖ;->ۗ:Ll/ۖ᩵ۖ;

    iget-object v1, p1, Ll/᩺᩷ۖ;->ۗ:Ll/ۖ᩵ۖ;

    .line 16230
    invoke-virtual {v0, v1}, Ll/᩵ۜۖ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_0

    .line 16231
    :cond_8
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v0

    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۢ֨ۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_9
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 17512
    sget-object v0, Ll/᩺᩷ۖ;->ۤ:Ll/᩺᩷ۖ;

    return-object v0
.end method

.method public final getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 17512
    sget-object v0, Ll/᩺᩷ۖ;->ۤ:Ll/᩺᩷ۖ;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 2

    .line 15950
    iget-object v0, p0, Ll/᩺᩷ۖ;->᩶:Ljava/lang/Object;

    .line 15951
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 15952
    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 15954
    :cond_0
    check-cast v0, Ll/ۛۜۖ;

    .line 15956
    invoke-virtual {v0}, Ll/ۛۜۖ;->ܳ()Ljava/lang/String;

    move-result-object v1

    .line 15957
    invoke-virtual {v0}, Ll/ۛۜۖ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 15958
    iput-object v1, p0, Ll/᩺᩷ۖ;->᩶:Ljava/lang/Object;

    :cond_1
    return-object v1
.end method

.method public final getParserForType()Ll/۫֡ۖ;
    .locals 1

    .line 17507
    sget-object v0, Ll/᩺᩷ۖ;->ۛ:Ll/۫֡ۖ;

    return-object v0
.end method

.method public final getSerializedSize()I
    .locals 5

    .line 16173
    iget v0, p0, Ll/ۡۜۖ;->memoizedSize:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    .line 16177
    :cond_0
    iget v0, p0, Ll/᩺᩷ۖ;->᩸:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 16178
    iget-object v0, p0, Ll/᩺᩷ۖ;->᩶:Ljava/lang/Object;

    invoke-static {v1, v0}, Ll/ۘᩴۖ;->֫(ILjava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    .line 16180
    :goto_1
    iget-object v3, p0, Ll/᩺᩷ۖ;->۫:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x2

    if-ge v1, v3, :cond_2

    .line 16181
    iget-object v3, p0, Ll/᩺᩷ۖ;->۫:Ljava/util/List;

    .line 16182
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۡ֡ۖ;

    invoke-static {v4, v3}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v3

    add-int/2addr v0, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 16184
    :cond_2
    iget v1, p0, Ll/᩺᩷ۖ;->᩸:I

    and-int/2addr v1, v4

    if-eqz v1, :cond_3

    const/4 v1, 0x3

    .line 16186
    invoke-virtual {p0}, Ll/᩺᩷ۖ;->ۜ()Ll/֫ۢۖ;

    move-result-object v3

    invoke-static {v1, v3}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    const/4 v1, 0x0

    .line 16188
    :goto_2
    iget-object v3, p0, Ll/᩺᩷ۖ;->۬:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_4

    .line 16189
    iget-object v3, p0, Ll/᩺᩷ۖ;->۬:Ljava/util/List;

    .line 16190
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۡ֡ۖ;

    const/4 v4, 0x4

    invoke-static {v4, v3}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v3

    add-int/2addr v0, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_4
    const/4 v1, 0x0

    .line 16194
    :goto_3
    iget-object v3, p0, Ll/᩺᩷ۖ;->ۗ:Ll/ۖ᩵ۖ;

    invoke-virtual {v3}, Ll/ۖ᩵ۖ;->size()I

    move-result v3

    if-ge v2, v3, :cond_5

    .line 16195
    iget-object v3, p0, Ll/᩺᩷ۖ;->ۗ:Ll/ۖ᩵ۖ;

    invoke-virtual {v3, v2}, Ll/ۖ᩵ۖ;->᩵(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ll/ۘᩴۖ;->ܽ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v1, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_5
    add-int/2addr v0, v1

    .line 16100
    iget-object v1, p0, Ll/᩺᩷ۖ;->ۗ:Ll/ۖ᩵ۖ;

    .line 16198
    invoke-virtual {v1}, Ll/ۖ᩵ۖ;->size()I

    move-result v1

    add-int/2addr v1, v0

    .line 16200
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢ֨ۖ;->getSerializedSize()I

    move-result v0

    add-int/2addr v0, v1

    .line 16201
    iput v0, p0, Ll/ۡۜۖ;->memoizedSize:I

    return v0
.end method

.method public final hasName()Z
    .locals 2

    .line 15942
    iget v0, p0, Ll/᩺᩷ۖ;->᩸:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 16237
    iget v0, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    if-eqz v0, :cond_0

    return v0

    .line 15358
    :cond_0
    invoke-static {}, Ll/ۧۖۖ;->֫()Ll/ᩳۖۖ;

    move-result-object v0

    .line 16241
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x30b

    .line 16242
    invoke-virtual {p0}, Ll/᩺᩷ۖ;->hasName()Z

    move-result v1

    const/16 v2, 0x35

    const/16 v3, 0x25

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    .line 16243
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 16244
    invoke-virtual {p0}, Ll/᩺᩷ۖ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 16005
    :cond_1
    iget-object v1, p0, Ll/᩺᩷ۖ;->۫:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_2

    const/4 v1, 0x2

    .line 16247
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 15990
    iget-object v1, p0, Ll/᩺᩷ۖ;->۫:Ljava/util/List;

    .line 16248
    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 16250
    :cond_2
    invoke-virtual {p0}, Ll/᩺᩷ۖ;->ۢ()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x3

    .line 16251
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 16252
    invoke-virtual {p0}, Ll/᩺᩷ۖ;->ۜ()Ll/֫ۢۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֫ۢۖ;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 16072
    :cond_3
    iget-object v1, p0, Ll/᩺᩷ۖ;->۬:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_4

    const/4 v1, 0x4

    .line 16255
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 16057
    iget-object v1, p0, Ll/᩺᩷ۖ;->۬:Ljava/util/List;

    .line 16256
    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 16107
    :cond_4
    iget-object v1, p0, Ll/᩺᩷ۖ;->ۗ:Ll/ۖ᩵ۖ;

    invoke-virtual {v1}, Ll/ۖ᩵ۖ;->size()I

    move-result v1

    if-lez v1, :cond_5

    const/4 v1, 0x5

    .line 16259
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 16100
    iget-object v1, p0, Ll/᩺᩷ۖ;->ۗ:Ll/ۖ᩵ۖ;

    .line 16260
    invoke-virtual {v1}, Ll/᩵ۜۖ;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    :cond_5
    mul-int/lit8 v0, v0, 0x1d

    .line 16262
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    .line 16263
    iput v1, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    return v1
.end method

.method public final internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 15364
    invoke-static {}, Ll/ۧۖۖ;->ۧ()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/᩺᩷ۖ;

    const-class v2, Ll/۫᩷ۖ;

    .line 15365
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 4

    .line 16130
    iget-byte v0, p0, Ll/᩺᩷ۖ;->᩹:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    const/4 v0, 0x0

    .line 16005
    :goto_0
    iget-object v3, p0, Ll/᩺᩷ۖ;->۫:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_3

    .line 16135
    invoke-virtual {p0, v0}, Ll/᩺᩷ۖ;->֫(I)Ll/ᩳۢۖ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ᩳۢۖ;->isInitialized()Z

    move-result v3

    if-nez v3, :cond_2

    .line 16136
    iput-byte v2, p0, Ll/᩺᩷ۖ;->᩹:B

    return v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 16140
    :cond_3
    invoke-virtual {p0}, Ll/᩺᩷ۖ;->ۢ()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 16141
    invoke-virtual {p0}, Ll/᩺᩷ۖ;->ۜ()Ll/֫ۢۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֫ۢۖ;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_4

    .line 16142
    iput-byte v2, p0, Ll/᩺᩷ۖ;->᩹:B

    return v2

    .line 16146
    :cond_4
    iput-byte v1, p0, Ll/᩺᩷ۖ;->᩹:B

    return v1
.end method

.method public final newBuilderForType()Ll/ۢ֡ۖ;
    .locals 1

    .line 16342
    sget-object v0, Ll/᩺᩷ۖ;->ۤ:Ll/᩺᩷ۖ;

    invoke-virtual {v0}, Ll/᩺᩷ۖ;->toBuilder()Ll/۫᩷ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final newBuilderForType()Ll/ܳ֡ۖ;
    .locals 1

    .line 16342
    sget-object v0, Ll/᩺᩷ۖ;->ۤ:Ll/᩺᩷ۖ;

    invoke-virtual {v0}, Ll/᩺᩷ۖ;->toBuilder()Ll/۫᩷ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final newBuilderForType(Ll/ۢۜۖ;)Ll/ܳ֡ۖ;
    .locals 2

    .line 16356
    new-instance v0, Ll/۫᩷ۖ;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/۫᩷ۖ;-><init>(Ll/ۢۜۖ;I)V

    return-object v0
.end method

.method public final bridge synthetic toBuilder()Ll/ۢ֡ۖ;
    .locals 1

    .line 15330
    invoke-virtual {p0}, Ll/᩺᩷ۖ;->toBuilder()Ll/۫᩷ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final toBuilder()Ll/۫᩷ۖ;
    .locals 2

    .line 16349
    sget-object v0, Ll/᩺᩷ۖ;->ۤ:Ll/᩺᩷ۖ;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    .line 16350
    new-instance v0, Ll/۫᩷ۖ;

    invoke-direct {v0, v1}, Ll/۫᩷ۖ;-><init>(I)V

    return-object v0

    :cond_0
    new-instance v0, Ll/۫᩷ۖ;

    invoke-direct {v0, v1}, Ll/۫᩷ۖ;-><init>(I)V

    invoke-virtual {v0, p0}, Ll/۫᩷ۖ;->֫(Ll/᩺᩷ۖ;)V

    return-object v0
.end method

.method public final bridge synthetic toBuilder()Ll/ܳ֡ۖ;
    .locals 1

    .line 15330
    invoke-virtual {p0}, Ll/᩺᩷ۖ;->toBuilder()Ll/۫᩷ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final writeTo(Ll/ܳ᩷ۖ;)V
    .locals 4

    .line 16153
    iget v0, p0, Ll/᩺᩷ۖ;->᩸:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    .line 16154
    iget-object v0, p0, Ll/᩺᩷ۖ;->᩶:Ljava/lang/Object;

    invoke-static {p1, v1, v0}, Ll/ۘᩴۖ;->֫(Ll/ܳ᩷ۖ;ILjava/lang/Object;)V

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 16156
    :goto_0
    iget-object v2, p0, Ll/᩺᩷ۖ;->۫:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x2

    if-ge v1, v2, :cond_1

    .line 16157
    iget-object v2, p0, Ll/᩺᩷ۖ;->۫:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۡ֡ۖ;

    invoke-virtual {p1, v3, v2}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 16159
    :cond_1
    iget v1, p0, Ll/᩺᩷ۖ;->᩸:I

    and-int/2addr v1, v3

    if-eqz v1, :cond_2

    const/4 v1, 0x3

    .line 16160
    invoke-virtual {p0}, Ll/᩺᩷ۖ;->ۜ()Ll/֫ۢۖ;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    :cond_2
    const/4 v1, 0x0

    .line 16162
    :goto_1
    iget-object v2, p0, Ll/᩺᩷ۖ;->۬:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_3

    .line 16163
    iget-object v2, p0, Ll/᩺᩷ۖ;->۬:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۡ֡ۖ;

    const/4 v3, 0x4

    invoke-virtual {p1, v3, v2}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 16165
    :cond_3
    :goto_2
    iget-object v1, p0, Ll/᩺᩷ۖ;->ۗ:Ll/ۖ᩵ۖ;

    invoke-virtual {v1}, Ll/ۖ᩵ۖ;->size()I

    move-result v1

    if-ge v0, v1, :cond_4

    .line 16166
    iget-object v1, p0, Ll/᩺᩷ۖ;->ۗ:Ll/ۖ᩵ۖ;

    invoke-virtual {v1, v0}, Ll/ۖ᩵ۖ;->᩵(I)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x5

    invoke-static {p1, v2, v1}, Ll/ۘᩴۖ;->֫(Ll/ܳ᩷ۖ;ILjava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 16168
    :cond_4
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۢ֨ۖ;->writeTo(Ll/ܳ᩷ۖ;)V

    return-void
.end method

.method public final ֫(I)Ll/ᩳۢۖ;
    .locals 1

    .line 16012
    iget-object v0, p0, Ll/᩺᩷ۖ;->۫:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩳۢۖ;

    return-object p1
.end method

.method public final ۜ()Ll/֫ۢۖ;
    .locals 1

    .line 16039
    iget-object v0, p0, Ll/᩺᩷ۖ;->ۙ:Ll/֫ۢۖ;

    if-nez v0, :cond_0

    invoke-static {}, Ll/֫ۢۖ;->getDefaultInstance()Ll/֫ۢۖ;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final ۢ()Z
    .locals 1

    .line 16031
    iget v0, p0, Ll/᩺᩷ۖ;->᩸:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩷()I
    .locals 1

    .line 16005
    iget-object v0, p0, Ll/᩺᩷ۖ;->۫:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
