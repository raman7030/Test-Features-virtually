.class public final Ll/֡ܺۖ;
.super Ll/۫ۘۖ;
.source "T9Q9"


# static fields
.field public static final serialVersionUID:J

.field public static final ۫:Ll/۫֡ۖ;

.field public static final ۬:Ll/֡ܺۖ;


# instance fields
.field public ۗ:Ljava/util/List;

.field public ۙ:B

.field public ᩶:Ll/ۛۢۖ;

.field public ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 30915
    sget-object v0, Ll/ۜۚۖ;->᩶:Ll/ۜۚۖ;

    const-class v1, Ll/֡ܺۖ;

    .line 30921
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    .line 30915
    invoke-static {v0, v1}, Ll/᩷ۚۖ;->֫(Ll/ۜۚۖ;Ljava/lang/String;)V

    .line 31806
    new-instance v0, Ll/֡ܺۖ;

    invoke-direct {v0}, Ll/֡ܺۖ;-><init>()V

    sput-object v0, Ll/֡ܺۖ;->۬:Ll/֡ܺۖ;

    .line 31814
    new-instance v0, Ll/ᩴܺۖ;

    invoke-direct {v0}, Ll/ᩴۜۖ;-><init>()V

    sput-object v0, Ll/֡ܺۖ;->۫:Ll/۫֡ۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 30927
    invoke-direct {p0}, Ll/۫ۘۖ;-><init>()V

    const/4 v0, -0x1

    .line 31012
    iput-byte v0, p0, Ll/֡ܺۖ;->ۙ:B

    .line 30928
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/֡ܺۖ;->ۗ:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ll/᩵ܺۖ;)V
    .locals 0

    .line 30925
    invoke-direct {p0, p1}, Ll/۫ۘۖ;-><init>(Ll/ۗۘۖ;)V

    const/4 p1, -0x1

    .line 31012
    iput-byte p1, p0, Ll/֡ܺۖ;->ۙ:B

    return-void
.end method

.method public static getDefaultInstance()Ll/֡ܺۖ;
    .locals 1

    .line 31810
    sget-object v0, Ll/֡ܺۖ;->۬:Ll/֡ܺۖ;

    return-object v0
.end method

.method public static newBuilder()Ll/᩵ܺۖ;
    .locals 1

    .line 31194
    sget-object v0, Ll/֡ܺۖ;->۬:Ll/֡ܺۖ;

    invoke-virtual {v0}, Ll/֡ܺۖ;->toBuilder()Ll/᩵ܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic ֫(Ll/֡ܺۖ;)Ljava/util/List;
    .locals 0

    .line 30908
    iget-object p0, p0, Ll/֡ܺۖ;->ۗ:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic ֫(Ll/֡ܺۖ;I)V
    .locals 1

    .line 30908
    iget v0, p0, Ll/֡ܺۖ;->᩹:I

    or-int/2addr p1, v0

    iput p1, p0, Ll/֡ܺۖ;->᩹:I

    return-void
.end method

.method public static synthetic ֫(Ll/֡ܺۖ;Ljava/util/List;)V
    .locals 0

    .line 30908
    iput-object p1, p0, Ll/֡ܺۖ;->ۗ:Ljava/util/List;

    return-void
.end method

.method public static synthetic ֫(Ll/֡ܺۖ;Ll/ۛۢۖ;)V
    .locals 0

    .line 30908
    iput-object p1, p0, Ll/֡ܺۖ;->᩶:Ll/ۛۢۖ;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 31080
    :cond_0
    instance-of v1, p1, Ll/֡ܺۖ;

    if-nez v1, :cond_1

    .line 31081
    invoke-super {p0, p1}, Ll/ۡۜۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 31083
    :cond_1
    check-cast p1, Ll/֡ܺۖ;

    .line 31085
    invoke-virtual {p0}, Ll/֡ܺۖ;->ܺ()Z

    move-result v1

    invoke-virtual {p1}, Ll/֡ܺۖ;->ܺ()Z

    move-result v2

    const/4 v3, 0x0

    if-eq v1, v2, :cond_2

    return v3

    .line 31086
    :cond_2
    invoke-virtual {p0}, Ll/֡ܺۖ;->ܺ()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 31087
    invoke-virtual {p0}, Ll/֡ܺۖ;->ۡ()Ll/ۛۢۖ;

    move-result-object v1

    .line 31088
    invoke-virtual {p1}, Ll/֡ܺۖ;->ۡ()Ll/ۛۢۖ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۛۢۖ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v3

    .line 30979
    :cond_3
    iget-object v1, p0, Ll/֡ܺۖ;->ۗ:Ljava/util/List;

    iget-object v2, p1, Ll/֡ܺۖ;->ۗ:Ljava/util/List;

    .line 31091
    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v3

    .line 31092
    :cond_4
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۢ֨ۖ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v3

    .line 31093
    :cond_5
    invoke-virtual {p0}, Ll/۫ۘۖ;->ۢ()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p1}, Ll/۫ۘۖ;->ۢ()Ljava/util/Map;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v3

    :cond_6
    return v0
.end method

.method public final getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 31846
    sget-object v0, Ll/֡ܺۖ;->۬:Ll/֡ܺۖ;

    return-object v0
.end method

.method public final getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 31846
    sget-object v0, Ll/֡ܺۖ;->۬:Ll/֡ܺۖ;

    return-object v0
.end method

.method public final getParserForType()Ll/۫֡ۖ;
    .locals 1

    .line 31841
    sget-object v0, Ll/֡ܺۖ;->۫:Ll/۫֡ۖ;

    return-object v0
.end method

.method public final getSerializedSize()I
    .locals 4

    .line 31057
    iget v0, p0, Ll/ۡۜۖ;->memoizedSize:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    .line 31061
    :cond_0
    iget v0, p0, Ll/֡ܺۖ;->᩹:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 31063
    invoke-virtual {p0}, Ll/֡ܺۖ;->ۡ()Ll/ۛۢۖ;

    move-result-object v0

    invoke-static {v1, v0}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 31065
    :goto_0
    iget-object v1, p0, Ll/֡ܺۖ;->ۗ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v2, v1, :cond_2

    .line 31066
    iget-object v1, p0, Ll/֡ܺۖ;->ۗ:Ljava/util/List;

    .line 31067
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡ֡ۖ;

    const/16 v3, 0x3e7

    invoke-static {v3, v1}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 31069
    :cond_2
    invoke-virtual {p0}, Ll/۫ۘۖ;->᩷()I

    move-result v1

    add-int/2addr v0, v1

    .line 31070
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->getSerializedSize()I

    move-result v1

    add-int/2addr v1, v0

    .line 31071
    iput v1, p0, Ll/ۡۜۖ;->memoizedSize:I

    return v1
.end method

.method public final hashCode()I
    .locals 4

    .line 31100
    iget v0, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    if-eqz v0, :cond_0

    return v0

    .line 30933
    :cond_0
    invoke-static {}, Ll/ۧۖۖ;->ܶ()Ll/ᩳۖۖ;

    move-result-object v0

    .line 31104
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x30b

    .line 31105
    invoke-virtual {p0}, Ll/֡ܺۖ;->ܺ()Z

    move-result v1

    const/16 v2, 0x35

    const/16 v3, 0x25

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    .line 31106
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 31107
    invoke-virtual {p0}, Ll/֡ܺۖ;->ۡ()Ll/ۛۢۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۛۢۖ;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 30994
    :cond_1
    iget-object v1, p0, Ll/֡ܺۖ;->ۗ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_2

    const/16 v1, 0x3e7

    .line 31110
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 30979
    iget-object v1, p0, Ll/֡ܺۖ;->ۗ:Ljava/util/List;

    .line 31111
    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 31113
    :cond_2
    invoke-virtual {p0}, Ll/۫ۘۖ;->ۢ()Ljava/util/Map;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۡۜۖ;->֫(ILjava/util/Map;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1d

    .line 31114
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    .line 31115
    iput v1, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    return v1
.end method

.method public final internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 30939
    invoke-static {}, Ll/ۧۖۖ;->᩸()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/֡ܺۖ;

    const-class v2, Ll/᩵ܺۖ;

    .line 30940
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 4

    .line 31015
    iget-byte v0, p0, Ll/֡ܺۖ;->ۙ:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    .line 31019
    :cond_1
    invoke-virtual {p0}, Ll/֡ܺۖ;->ܺ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 31020
    invoke-virtual {p0}, Ll/֡ܺۖ;->ۡ()Ll/ۛۢۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۛۢۖ;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_2

    .line 31021
    iput-byte v2, p0, Ll/֡ܺۖ;->ۙ:B

    return v2

    :cond_2
    const/4 v0, 0x0

    .line 30994
    :goto_0
    iget-object v3, p0, Ll/֡ܺۖ;->ۗ:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_4

    .line 31001
    iget-object v3, p0, Ll/֡ܺۖ;->ۗ:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֫ۖۖ;

    .line 31026
    invoke-virtual {v3}, Ll/֫ۖۖ;->isInitialized()Z

    move-result v3

    if-nez v3, :cond_3

    .line 31027
    iput-byte v2, p0, Ll/֡ܺۖ;->ۙ:B

    return v2

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 31031
    :cond_4
    invoke-virtual {p0}, Ll/۫ۘۖ;->ۜ()Z

    move-result v0

    if-nez v0, :cond_5

    .line 31032
    iput-byte v2, p0, Ll/֡ܺۖ;->ۙ:B

    return v2

    .line 31035
    :cond_5
    iput-byte v1, p0, Ll/֡ܺۖ;->ۙ:B

    return v1
.end method

.method public final newBuilderForType()Ll/ۢ֡ۖ;
    .locals 1

    .line 31194
    sget-object v0, Ll/֡ܺۖ;->۬:Ll/֡ܺۖ;

    invoke-virtual {v0}, Ll/֡ܺۖ;->toBuilder()Ll/᩵ܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public final newBuilderForType()Ll/ܳ֡ۖ;
    .locals 1

    .line 31194
    sget-object v0, Ll/֡ܺۖ;->۬:Ll/֡ܺۖ;

    invoke-virtual {v0}, Ll/֡ܺۖ;->toBuilder()Ll/᩵ܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public final newBuilderForType(Ll/ۢۜۖ;)Ll/ܳ֡ۖ;
    .locals 2

    .line 31208
    new-instance v0, Ll/᩵ܺۖ;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/᩵ܺۖ;-><init>(Ll/ۢۜۖ;I)V

    return-object v0
.end method

.method public final bridge synthetic toBuilder()Ll/ۢ֡ۖ;
    .locals 1

    .line 30908
    invoke-virtual {p0}, Ll/֡ܺۖ;->toBuilder()Ll/᩵ܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic toBuilder()Ll/ܳ֡ۖ;
    .locals 1

    .line 30908
    invoke-virtual {p0}, Ll/֡ܺۖ;->toBuilder()Ll/᩵ܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public final toBuilder()Ll/᩵ܺۖ;
    .locals 2

    .line 31201
    sget-object v0, Ll/֡ܺۖ;->۬:Ll/֡ܺۖ;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    .line 31202
    new-instance v0, Ll/᩵ܺۖ;

    invoke-direct {v0, v1}, Ll/᩵ܺۖ;-><init>(I)V

    return-object v0

    :cond_0
    new-instance v0, Ll/᩵ܺۖ;

    invoke-direct {v0, v1}, Ll/᩵ܺۖ;-><init>(I)V

    invoke-virtual {v0, p0}, Ll/᩵ܺۖ;->֫(Ll/֡ܺۖ;)V

    return-object v0
.end method

.method public final writeTo(Ll/ܳ᩷ۖ;)V
    .locals 4

    .line 1079
    new-instance v0, Ll/۬ۘۖ;

    invoke-direct {v0, p0}, Ll/۬ۘۖ;-><init>(Ll/۫ۘۖ;)V

    .line 31045
    iget v1, p0, Ll/֡ܺۖ;->᩹:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    .line 31046
    invoke-virtual {p0}, Ll/֡ܺۖ;->ۡ()Ll/ۛۢۖ;

    move-result-object v1

    invoke-virtual {p1, v2, v1}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    :cond_0
    const/4 v1, 0x0

    .line 31048
    :goto_0
    iget-object v2, p0, Ll/֡ܺۖ;->ۗ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 31049
    iget-object v2, p0, Ll/֡ܺۖ;->ۗ:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۡ֡ۖ;

    const/16 v3, 0x3e7

    invoke-virtual {p1, v3, v2}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/high16 v1, 0x20000000

    .line 31051
    invoke-virtual {v0, v1, p1}, Ll/۬ۘۖ;->֫(ILl/ܳ᩷ۖ;)V

    .line 31052
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۢ֨ۖ;->writeTo(Ll/ܳ᩷ۖ;)V

    return-void
.end method

.method public final ۡ()Ll/ۛۢۖ;
    .locals 1

    .line 30961
    iget-object v0, p0, Ll/֡ܺۖ;->᩶:Ll/ۛۢۖ;

    if-nez v0, :cond_0

    invoke-static {}, Ll/ۛۢۖ;->getDefaultInstance()Ll/ۛۢۖ;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final ܺ()Z
    .locals 2

    .line 30953
    iget v0, p0, Ll/֡ܺۖ;->᩹:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
