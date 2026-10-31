.class public final Ll/ᩴۢۖ;
.super Ll/۫ۘۖ;
.source "T9Q9"


# static fields
.field public static final serialVersionUID:J

.field public static final ۛ:Ll/ᩴۢۖ;

.field public static final synthetic ۤ:I

.field public static final ۨ:Ll/۫֡ۖ;


# instance fields
.field public ۗ:B

.field public ۙ:Ll/ۛۢۖ;

.field public ۫:I

.field public ۬:Ljava/util/List;

.field public ᩶:Ljava/util/List;

.field public ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 9613
    sget-object v0, Ll/ۜۚۖ;->᩶:Ll/ۜۚۖ;

    const-class v1, Ll/ᩴۢۖ;

    .line 9619
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    .line 9613
    invoke-static {v0, v1}, Ll/᩷ۚۖ;->֫(Ll/ۜۚۖ;Ljava/lang/String;)V

    .line 12074
    new-instance v0, Ll/ᩴۢۖ;

    invoke-direct {v0}, Ll/ᩴۢۖ;-><init>()V

    sput-object v0, Ll/ᩴۢۖ;->ۛ:Ll/ᩴۢۖ;

    .line 12082
    new-instance v0, Ll/ۜۢۖ;

    invoke-direct {v0}, Ll/ᩴۜۖ;-><init>()V

    sput-object v0, Ll/ᩴۢۖ;->ۨ:Ll/۫֡ۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 9625
    invoke-direct {p0}, Ll/۫ۘۖ;-><init>()V

    const/4 v0, 0x1

    .line 10877
    iput v0, p0, Ll/ᩴۢۖ;->۫:I

    const/4 v1, -0x1

    .line 10894
    iput-byte v1, p0, Ll/ᩴۢۖ;->ۗ:B

    .line 9626
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, p0, Ll/ᩴۢۖ;->۬:Ljava/util/List;

    .line 9627
    iput-object v1, p0, Ll/ᩴۢۖ;->᩶:Ljava/util/List;

    .line 9628
    iput v0, p0, Ll/ᩴۢۖ;->۫:I

    return-void
.end method

.method public constructor <init>(Ll/᩷ۢۖ;)V
    .locals 0

    .line 9623
    invoke-direct {p0, p1}, Ll/۫ۘۖ;-><init>(Ll/ۗۘۖ;)V

    const/4 p1, 0x1

    .line 10877
    iput p1, p0, Ll/ᩴۢۖ;->۫:I

    const/4 p1, -0x1

    .line 10894
    iput-byte p1, p0, Ll/ᩴۢۖ;->ۗ:B

    return-void
.end method

.method public static getDefaultInstance()Ll/ᩴۢۖ;
    .locals 1

    .line 12078
    sget-object v0, Ll/ᩴۢۖ;->ۛ:Ll/ᩴۢۖ;

    return-object v0
.end method

.method public static newBuilder()Ll/᩷ۢۖ;
    .locals 1

    .line 11104
    sget-object v0, Ll/ᩴۢۖ;->ۛ:Ll/ᩴۢۖ;

    invoke-virtual {v0}, Ll/ᩴۢۖ;->toBuilder()Ll/᩷ۢۖ;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic ֫(Ll/ᩴۢۖ;)Ljava/util/List;
    .locals 0

    .line 9606
    iget-object p0, p0, Ll/ᩴۢۖ;->۬:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic ֫(Ll/ᩴۢۖ;I)V
    .locals 0

    .line 9606
    iput p1, p0, Ll/ᩴۢۖ;->۫:I

    return-void
.end method

.method public static synthetic ֫(Ll/ᩴۢۖ;Ljava/util/List;)V
    .locals 0

    .line 9606
    iput-object p1, p0, Ll/ᩴۢۖ;->۬:Ljava/util/List;

    return-void
.end method

.method public static synthetic ֫(Ll/ᩴۢۖ;Ll/ۛۢۖ;)V
    .locals 0

    .line 9606
    iput-object p1, p0, Ll/ᩴۢۖ;->ۙ:Ll/ۛۢۖ;

    return-void
.end method

.method public static synthetic ۧ(Ll/ᩴۢۖ;)Ljava/util/List;
    .locals 0

    .line 9606
    iget-object p0, p0, Ll/ᩴۢۖ;->᩶:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic ۧ(Ll/ᩴۢۖ;I)V
    .locals 1

    .line 9606
    iget v0, p0, Ll/ᩴۢۖ;->᩹:I

    or-int/2addr p1, v0

    iput p1, p0, Ll/ᩴۢۖ;->᩹:I

    return-void
.end method

.method public static synthetic ۧ(Ll/ᩴۢۖ;Ljava/util/List;)V
    .locals 0

    .line 9606
    iput-object p1, p0, Ll/ᩴۢۖ;->᩶:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 10976
    :cond_0
    instance-of v1, p1, Ll/ᩴۢۖ;

    if-nez v1, :cond_1

    .line 10977
    invoke-super {p0, p1}, Ll/ۡۜۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 10979
    :cond_1
    check-cast p1, Ll/ᩴۢۖ;

    .line 10776
    iget-object v1, p0, Ll/ᩴۢۖ;->۬:Ljava/util/List;

    iget-object v2, p1, Ll/ᩴۢۖ;->۬:Ljava/util/List;

    .line 10982
    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    return v2

    .line 10817
    :cond_2
    iget-object v1, p0, Ll/ᩴۢۖ;->᩶:Ljava/util/List;

    iget-object v3, p1, Ll/ᩴۢۖ;->᩶:Ljava/util/List;

    .line 10984
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    .line 10985
    :cond_3
    invoke-virtual {p0}, Ll/ᩴۢۖ;->ۖ()Z

    move-result v1

    invoke-virtual {p1}, Ll/ᩴۢۖ;->ۖ()Z

    move-result v3

    if-eq v1, v3, :cond_4

    return v2

    .line 10986
    :cond_4
    invoke-virtual {p0}, Ll/ᩴۢۖ;->ۖ()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 10987
    invoke-virtual {p0}, Ll/ᩴۢۖ;->ۡ()Ll/ۛۢۖ;

    move-result-object v1

    .line 10988
    invoke-virtual {p1}, Ll/ᩴۢۖ;->ۡ()Ll/ۛۢۖ;

    move-result-object v3

    invoke-virtual {v1, v3}, Ll/ۛۢۖ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    .line 10990
    :cond_5
    invoke-virtual {p0}, Ll/ᩴۢۖ;->ۘ()Z

    move-result v1

    invoke-virtual {p1}, Ll/ᩴۢۖ;->ۘ()Z

    move-result v3

    if-eq v1, v3, :cond_6

    return v2

    .line 10991
    :cond_6
    invoke-virtual {p0}, Ll/ᩴۢۖ;->ۘ()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 10992
    iget v1, p0, Ll/ᩴۢۖ;->۫:I

    iget v3, p1, Ll/ᩴۢۖ;->۫:I

    if-eq v1, v3, :cond_7

    return v2

    .line 10994
    :cond_7
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v3

    invoke-virtual {v1, v3}, Ll/ۢ֨ۖ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    .line 10995
    :cond_8
    invoke-virtual {p0}, Ll/۫ۘۖ;->ۢ()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p1}, Ll/۫ۘۖ;->ۢ()Ljava/util/Map;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 12114
    sget-object v0, Ll/ᩴۢۖ;->ۛ:Ll/ᩴۢۖ;

    return-object v0
.end method

.method public final getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 12114
    sget-object v0, Ll/ᩴۢۖ;->ۛ:Ll/ᩴۢۖ;

    return-object v0
.end method

.method public final getParserForType()Ll/۫֡ۖ;
    .locals 1

    .line 12109
    sget-object v0, Ll/ᩴۢۖ;->ۨ:Ll/۫֡ۖ;

    return-object v0
.end method

.method public final getSerializedSize()I
    .locals 5

    .line 10945
    iget v0, p0, Ll/ۡۜۖ;->memoizedSize:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 10949
    :goto_0
    iget-object v3, p0, Ll/ᩴۢۖ;->᩶:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x2

    if-ge v1, v3, :cond_1

    .line 10950
    iget-object v3, p0, Ll/ᩴۢۖ;->᩶:Ljava/util/List;

    .line 10951
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۡ֡ۖ;

    invoke-static {v4, v3}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 10953
    :cond_1
    iget v1, p0, Ll/ᩴۢۖ;->᩹:I

    and-int/2addr v1, v4

    if-eqz v1, :cond_2

    const/4 v1, 0x3

    .line 10954
    iget v3, p0, Ll/ᩴۢۖ;->۫:I

    .line 10955
    invoke-static {v1, v3}, Ll/ܳ᩷ۖ;->ܿ(II)I

    move-result v1

    add-int/2addr v2, v1

    .line 10957
    :cond_2
    iget v1, p0, Ll/ᩴۢۖ;->᩹:I

    and-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_3

    const/16 v1, 0x32

    .line 10959
    invoke-virtual {p0}, Ll/ᩴۢۖ;->ۡ()Ll/ۛۢۖ;

    move-result-object v3

    invoke-static {v1, v3}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v1

    add-int/2addr v2, v1

    .line 10961
    :cond_3
    :goto_1
    iget-object v1, p0, Ll/ᩴۢۖ;->۬:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_4

    .line 10962
    iget-object v1, p0, Ll/ᩴۢۖ;->۬:Ljava/util/List;

    .line 10963
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡ֡ۖ;

    const/16 v3, 0x3e7

    invoke-static {v3, v1}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v1

    add-int/2addr v2, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 10965
    :cond_4
    invoke-virtual {p0}, Ll/۫ۘۖ;->᩷()I

    move-result v0

    add-int/2addr v2, v0

    .line 10966
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢ֨ۖ;->getSerializedSize()I

    move-result v0

    add-int/2addr v0, v2

    .line 10967
    iput v0, p0, Ll/ۡۜۖ;->memoizedSize:I

    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 11002
    iget v0, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    if-eqz v0, :cond_0

    return v0

    .line 9633
    :cond_0
    invoke-static {}, Ll/ۧۖۖ;->֡֫()Ll/ᩳۖۖ;

    move-result-object v0

    .line 11006
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x30b

    .line 10791
    iget-object v1, p0, Ll/ᩴۢۖ;->۬:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/16 v2, 0x35

    const/16 v3, 0x25

    if-lez v1, :cond_1

    const/16 v1, 0x3e7

    .line 11008
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 10776
    iget-object v1, p0, Ll/ᩴۢۖ;->۬:Ljava/util/List;

    .line 11009
    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 10832
    :cond_1
    iget-object v1, p0, Ll/ᩴۢۖ;->᩶:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_2

    const/4 v1, 0x2

    .line 11012
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 10817
    iget-object v1, p0, Ll/ᩴۢۖ;->᩶:Ljava/util/List;

    .line 11013
    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 11015
    :cond_2
    invoke-virtual {p0}, Ll/ᩴۢۖ;->ۖ()Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x32

    .line 11016
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 11017
    invoke-virtual {p0}, Ll/ᩴۢۖ;->ۡ()Ll/ۛۢۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۛۢۖ;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 11019
    :cond_3
    invoke-virtual {p0}, Ll/ᩴۢۖ;->ۘ()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x3

    .line 11020
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 11021
    iget v1, p0, Ll/ᩴۢۖ;->۫:I

    add-int/2addr v0, v1

    .line 11023
    :cond_4
    invoke-virtual {p0}, Ll/۫ۘۖ;->ۢ()Ljava/util/Map;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۡۜۖ;->֫(ILjava/util/Map;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1d

    .line 11024
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    .line 11025
    iput v1, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    return v1
.end method

.method public final internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 9639
    invoke-static {}, Ll/ۧۖۖ;->ۚ֫()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/ᩴۢۖ;

    const-class v2, Ll/᩷ۢۖ;

    .line 9640
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 4

    .line 10897
    iget-byte v0, p0, Ll/ᩴۢۖ;->ۗ:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    const/4 v0, 0x0

    .line 10791
    :goto_0
    iget-object v3, p0, Ll/ᩴۢۖ;->۬:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_3

    .line 10798
    iget-object v3, p0, Ll/ᩴۢۖ;->۬:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֫ۖۖ;

    .line 10902
    invoke-virtual {v3}, Ll/֫ۖۖ;->isInitialized()Z

    move-result v3

    if-nez v3, :cond_2

    .line 10903
    iput-byte v2, p0, Ll/ᩴۢۖ;->ۗ:B

    return v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 10907
    :cond_3
    invoke-virtual {p0}, Ll/ᩴۢۖ;->ۖ()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 10908
    invoke-virtual {p0}, Ll/ᩴۢۖ;->ۡ()Ll/ۛۢۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۛۢۖ;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_4

    .line 10909
    iput-byte v2, p0, Ll/ᩴۢۖ;->ۗ:B

    return v2

    .line 10913
    :cond_4
    invoke-virtual {p0}, Ll/۫ۘۖ;->ۜ()Z

    move-result v0

    if-nez v0, :cond_5

    .line 10914
    iput-byte v2, p0, Ll/ᩴۢۖ;->ۗ:B

    return v2

    .line 10917
    :cond_5
    iput-byte v1, p0, Ll/ᩴۢۖ;->ۗ:B

    return v1
.end method

.method public final newBuilderForType()Ll/ۢ֡ۖ;
    .locals 1

    .line 11104
    sget-object v0, Ll/ᩴۢۖ;->ۛ:Ll/ᩴۢۖ;

    invoke-virtual {v0}, Ll/ᩴۢۖ;->toBuilder()Ll/᩷ۢۖ;

    move-result-object v0

    return-object v0
.end method

.method public final newBuilderForType()Ll/ܳ֡ۖ;
    .locals 1

    .line 11104
    sget-object v0, Ll/ᩴۢۖ;->ۛ:Ll/ᩴۢۖ;

    invoke-virtual {v0}, Ll/ᩴۢۖ;->toBuilder()Ll/᩷ۢۖ;

    move-result-object v0

    return-object v0
.end method

.method public final newBuilderForType(Ll/ۢۜۖ;)Ll/ܳ֡ۖ;
    .locals 2

    .line 11118
    new-instance v0, Ll/᩷ۢۖ;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/᩷ۢۖ;-><init>(Ll/ۢۜۖ;I)V

    return-object v0
.end method

.method public final bridge synthetic toBuilder()Ll/ۢ֡ۖ;
    .locals 1

    .line 9606
    invoke-virtual {p0}, Ll/ᩴۢۖ;->toBuilder()Ll/᩷ۢۖ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic toBuilder()Ll/ܳ֡ۖ;
    .locals 1

    .line 9606
    invoke-virtual {p0}, Ll/ᩴۢۖ;->toBuilder()Ll/᩷ۢۖ;

    move-result-object v0

    return-object v0
.end method

.method public final toBuilder()Ll/᩷ۢۖ;
    .locals 2

    .line 11111
    sget-object v0, Ll/ᩴۢۖ;->ۛ:Ll/ᩴۢۖ;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    .line 11112
    new-instance v0, Ll/᩷ۢۖ;

    invoke-direct {v0, v1}, Ll/᩷ۢۖ;-><init>(I)V

    return-object v0

    :cond_0
    new-instance v0, Ll/᩷ۢۖ;

    invoke-direct {v0, v1}, Ll/᩷ۢۖ;-><init>(I)V

    invoke-virtual {v0, p0}, Ll/᩷ۢۖ;->֫(Ll/ᩴۢۖ;)V

    return-object v0
.end method

.method public final writeTo(Ll/ܳ᩷ۖ;)V
    .locals 5

    .line 1079
    new-instance v0, Ll/۬ۘۖ;

    invoke-direct {v0, p0}, Ll/۬ۘۖ;-><init>(Ll/۫ۘۖ;)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 10927
    :goto_0
    iget-object v3, p0, Ll/ᩴۢۖ;->᩶:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x2

    if-ge v2, v3, :cond_0

    .line 10928
    iget-object v3, p0, Ll/ᩴۢۖ;->᩶:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۡ֡ۖ;

    invoke-virtual {p1, v4, v3}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 10930
    :cond_0
    iget v2, p0, Ll/ᩴۢۖ;->᩹:I

    and-int/2addr v2, v4

    if-eqz v2, :cond_1

    const/4 v2, 0x3

    .line 10931
    iget v3, p0, Ll/ᩴۢۖ;->۫:I

    .line 275
    invoke-virtual {p1, v2, v3}, Ll/ܳ᩷ۖ;->ۧ(II)V

    .line 10933
    :cond_1
    iget v2, p0, Ll/ᩴۢۖ;->᩹:I

    and-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_2

    const/16 v2, 0x32

    .line 10934
    invoke-virtual {p0}, Ll/ᩴۢۖ;->ۡ()Ll/ۛۢۖ;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    .line 10936
    :cond_2
    :goto_1
    iget-object v2, p0, Ll/ᩴۢۖ;->۬:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_3

    .line 10937
    iget-object v2, p0, Ll/ᩴۢۖ;->۬:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۡ֡ۖ;

    const/16 v3, 0x3e7

    invoke-virtual {p1, v3, v2}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    const/high16 v1, 0x20000000

    .line 10939
    invoke-virtual {v0, v1, p1}, Ll/۬ۘۖ;->֫(ILl/ܳ᩷ۖ;)V

    .line 10940
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۢ֨ۖ;->writeTo(Ll/ܳ᩷ۖ;)V

    return-void
.end method

.method public final ۖ()Z
    .locals 2

    .line 10858
    iget v0, p0, Ll/ᩴۢۖ;->᩹:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۘ()Z
    .locals 1

    .line 10883
    iget v0, p0, Ll/ᩴۢۖ;->᩹:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۡ()Ll/ۛۢۖ;
    .locals 1

    .line 10866
    iget-object v0, p0, Ll/ᩴۢۖ;->ۙ:Ll/ۛۢۖ;

    if-nez v0, :cond_0

    invoke-static {}, Ll/ۛۢۖ;->getDefaultInstance()Ll/ۛۢۖ;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final ܺ()Ll/ۘۢۖ;
    .locals 1

    .line 10890
    iget v0, p0, Ll/ᩴۢۖ;->۫:I

    invoke-static {v0}, Ll/ۘۢۖ;->֫(I)Ll/ۘۢۖ;

    move-result-object v0

    if-nez v0, :cond_0

    .line 10891
    sget-object v0, Ll/ۘۢۖ;->ۗ:Ll/ۘۢۖ;

    :cond_0
    return-object v0
.end method
