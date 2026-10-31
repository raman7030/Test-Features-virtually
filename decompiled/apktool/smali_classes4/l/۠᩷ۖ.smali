.class public final Ll/۠᩷ۖ;
.super Ll/ۘᩴۖ;
.source "T9Q9"

# interfaces
.implements Ll/ۘ֡ۖ;


# static fields
.field public static final serialVersionUID:J

.field public static final ۫:Ll/۫֡ۖ;

.field public static final ۬:Ll/۠᩷ۖ;


# instance fields
.field public ۗ:I

.field public ۙ:Ll/ᩴۢۖ;

.field public ᩶:B

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 4842
    sget-object v0, Ll/ۜۚۖ;->᩶:Ll/ۜۚۖ;

    const-class v1, Ll/۠᩷ۖ;

    .line 4848
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    .line 4842
    invoke-static {v0, v1}, Ll/᩷ۚۖ;->֫(Ll/ۜۚۖ;Ljava/lang/String;)V

    .line 5526
    new-instance v0, Ll/۠᩷ۖ;

    invoke-direct {v0}, Ll/۠᩷ۖ;-><init>()V

    sput-object v0, Ll/۠᩷ۖ;->۬:Ll/۠᩷ۖ;

    .line 5534
    new-instance v0, Ll/ۚ᩷ۖ;

    invoke-direct {v0}, Ll/ᩴۜۖ;-><init>()V

    sput-object v0, Ll/۠᩷ۖ;->۫:Ll/۫֡ۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 4854
    invoke-direct {p0}, Ll/ۘᩴۖ;-><init>()V

    const/4 v0, 0x0

    .line 4872
    iput v0, p0, Ll/۠᩷ۖ;->ۗ:I

    .line 4891
    iput v0, p0, Ll/۠᩷ۖ;->᩹:I

    const/4 v0, -0x1

    .line 4935
    iput-byte v0, p0, Ll/۠᩷ۖ;->᩶:B

    return-void
.end method

.method public constructor <init>(Ll/֨᩷ۖ;I)V
    .locals 0

    .line 4852
    invoke-direct {p0, p1}, Ll/ۘᩴۖ;-><init>(Ll/᩶ۘۖ;)V

    const/4 p1, 0x0

    .line 4872
    iput p1, p0, Ll/۠᩷ۖ;->ۗ:I

    .line 4891
    iput p1, p0, Ll/۠᩷ۖ;->᩹:I

    const/4 p1, -0x1

    .line 4935
    iput-byte p1, p0, Ll/۠᩷ۖ;->᩶:B

    return-void
.end method

.method public static getDefaultInstance()Ll/۠᩷ۖ;
    .locals 1

    .line 5530
    sget-object v0, Ll/۠᩷ۖ;->۬:Ll/۠᩷ۖ;

    return-object v0
.end method

.method public static newBuilder()Ll/֨᩷ۖ;
    .locals 1

    .line 5118
    sget-object v0, Ll/۠᩷ۖ;->۬:Ll/۠᩷ۖ;

    invoke-virtual {v0}, Ll/۠᩷ۖ;->toBuilder()Ll/֨᩷ۖ;

    move-result-object v0

    return-object v0
.end method

.method public static parser()Ll/۫֡ۖ;
    .locals 1

    .line 5556
    sget-object v0, Ll/۠᩷ۖ;->۫:Ll/۫֡ۖ;

    return-object v0
.end method

.method public static synthetic ֫(Ll/۠᩷ۖ;I)V
    .locals 0

    .line 4836
    iput p1, p0, Ll/۠᩷ۖ;->ۗ:I

    return-void
.end method

.method public static synthetic ֫(Ll/۠᩷ۖ;Ll/ᩴۢۖ;)V
    .locals 0

    .line 4836
    iput-object p1, p0, Ll/۠᩷ۖ;->ۙ:Ll/ᩴۢۖ;

    return-void
.end method

.method public static synthetic ۧ(Ll/۠᩷ۖ;I)V
    .locals 0

    .line 4836
    iput p1, p0, Ll/۠᩷ۖ;->᩹:I

    return-void
.end method

.method public static synthetic ܽ(Ll/۠᩷ۖ;I)V
    .locals 1

    .line 4836
    iget v0, p0, Ll/۠᩷ۖ;->᩸:I

    or-int/2addr p1, v0

    iput p1, p0, Ll/۠᩷ۖ;->᩸:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 4995
    :cond_0
    instance-of v1, p1, Ll/۠᩷ۖ;

    if-nez v1, :cond_1

    .line 4996
    invoke-super {p0, p1}, Ll/ۡۜۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 4998
    :cond_1
    check-cast p1, Ll/۠᩷ۖ;

    .line 5000
    invoke-virtual {p0}, Ll/۠᩷ۖ;->ۖ()Z

    move-result v1

    invoke-virtual {p1}, Ll/۠᩷ۖ;->ۖ()Z

    move-result v2

    const/4 v3, 0x0

    if-eq v1, v2, :cond_2

    return v3

    .line 5001
    :cond_2
    invoke-virtual {p0}, Ll/۠᩷ۖ;->ۖ()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 4887
    iget v1, p0, Ll/۠᩷ۖ;->ۗ:I

    iget v2, p1, Ll/۠᩷ۖ;->ۗ:I

    if-eq v1, v2, :cond_3

    return v3

    .line 5005
    :cond_3
    invoke-virtual {p0}, Ll/۠᩷ۖ;->ۡ()Z

    move-result v1

    invoke-virtual {p1}, Ll/۠᩷ۖ;->ۡ()Z

    move-result v2

    if-eq v1, v2, :cond_4

    return v3

    .line 5006
    :cond_4
    invoke-virtual {p0}, Ll/۠᩷ۖ;->ۡ()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 4906
    iget v1, p0, Ll/۠᩷ۖ;->᩹:I

    iget v2, p1, Ll/۠᩷ۖ;->᩹:I

    if-eq v1, v2, :cond_5

    return v3

    .line 5010
    :cond_5
    invoke-virtual {p0}, Ll/۠᩷ۖ;->ܺ()Z

    move-result v1

    invoke-virtual {p1}, Ll/۠᩷ۖ;->ܺ()Z

    move-result v2

    if-eq v1, v2, :cond_6

    return v3

    .line 5011
    :cond_6
    invoke-virtual {p0}, Ll/۠᩷ۖ;->ܺ()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 5012
    invoke-virtual {p0}, Ll/۠᩷ۖ;->᩷()Ll/ᩴۢۖ;

    move-result-object v1

    .line 5013
    invoke-virtual {p1}, Ll/۠᩷ۖ;->᩷()Ll/ᩴۢۖ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ᩴۢۖ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v3

    .line 5015
    :cond_7
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/ۢ֨ۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v3

    :cond_8
    return v0
.end method

.method public final getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 5566
    sget-object v0, Ll/۠᩷ۖ;->۬:Ll/۠᩷ۖ;

    return-object v0
.end method

.method public final getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 5566
    sget-object v0, Ll/۠᩷ۖ;->۬:Ll/۠᩷ۖ;

    return-object v0
.end method

.method public final getParserForType()Ll/۫֡ۖ;
    .locals 1

    .line 5561
    sget-object v0, Ll/۠᩷ۖ;->۫:Ll/۫֡ۖ;

    return-object v0
.end method

.method public final getSerializedSize()I
    .locals 3

    .line 4969
    iget v0, p0, Ll/ۡۜۖ;->memoizedSize:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    .line 4973
    :cond_0
    iget v0, p0, Ll/۠᩷ۖ;->᩸:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    .line 4974
    iget v0, p0, Ll/۠᩷ۖ;->ۗ:I

    .line 4975
    invoke-static {v1, v0}, Ll/ܳ᩷ۖ;->ܳ(II)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 4977
    :goto_0
    iget v1, p0, Ll/۠᩷ۖ;->᩸:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-eqz v1, :cond_2

    .line 4978
    iget v1, p0, Ll/۠᩷ۖ;->᩹:I

    .line 4979
    invoke-static {v2, v1}, Ll/ܳ᩷ۖ;->ܳ(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 4981
    :cond_2
    iget v1, p0, Ll/۠᩷ۖ;->᩸:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_3

    const/4 v1, 0x3

    .line 4983
    invoke-virtual {p0}, Ll/۠᩷ۖ;->᩷()Ll/ᩴۢۖ;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v1

    add-int/2addr v0, v1

    .line 4985
    :cond_3
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->getSerializedSize()I

    move-result v1

    add-int/2addr v1, v0

    .line 4986
    iput v1, p0, Ll/ۡۜۖ;->memoizedSize:I

    return v1
.end method

.method public final hashCode()I
    .locals 4

    .line 5021
    iget v0, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    if-eqz v0, :cond_0

    return v0

    .line 4859
    :cond_0
    invoke-static {}, Ll/ۧۖۖ;->ۨ()Ll/ᩳۖۖ;

    move-result-object v0

    .line 5025
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x30b

    .line 5026
    invoke-virtual {p0}, Ll/۠᩷ۖ;->ۖ()Z

    move-result v1

    const/16 v2, 0x35

    const/16 v3, 0x25

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    .line 5027
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 4887
    iget v1, p0, Ll/۠᩷ۖ;->ۗ:I

    add-int/2addr v0, v1

    .line 5030
    :cond_1
    invoke-virtual {p0}, Ll/۠᩷ۖ;->ۡ()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    .line 5031
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 4906
    iget v1, p0, Ll/۠᩷ۖ;->᩹:I

    add-int/2addr v0, v1

    .line 5034
    :cond_2
    invoke-virtual {p0}, Ll/۠᩷ۖ;->ܺ()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x3

    .line 5035
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 5036
    invoke-virtual {p0}, Ll/۠᩷ۖ;->᩷()Ll/ᩴۢۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ᩴۢۖ;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    mul-int/lit8 v0, v0, 0x1d

    .line 5038
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    .line 5039
    iput v1, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    return v1
.end method

.method public final internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 4865
    invoke-static {}, Ll/ۧۖۖ;->۟()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/۠᩷ۖ;

    const-class v2, Ll/֨᩷ۖ;

    .line 4866
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 3

    .line 4938
    iget-byte v0, p0, Ll/۠᩷ۖ;->᩶:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    .line 4942
    :cond_1
    invoke-virtual {p0}, Ll/۠᩷ۖ;->ܺ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 4943
    invoke-virtual {p0}, Ll/۠᩷ۖ;->᩷()Ll/ᩴۢۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩴۢۖ;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_2

    .line 4944
    iput-byte v2, p0, Ll/۠᩷ۖ;->᩶:B

    return v2

    .line 4948
    :cond_2
    iput-byte v1, p0, Ll/۠᩷ۖ;->᩶:B

    return v1
.end method

.method public final newBuilderForType()Ll/ۢ֡ۖ;
    .locals 1

    .line 5118
    sget-object v0, Ll/۠᩷ۖ;->۬:Ll/۠᩷ۖ;

    invoke-virtual {v0}, Ll/۠᩷ۖ;->toBuilder()Ll/֨᩷ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final newBuilderForType()Ll/ܳ֡ۖ;
    .locals 1

    .line 5118
    sget-object v0, Ll/۠᩷ۖ;->۬:Ll/۠᩷ۖ;

    invoke-virtual {v0}, Ll/۠᩷ۖ;->toBuilder()Ll/֨᩷ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final newBuilderForType(Ll/ۢۜۖ;)Ll/ܳ֡ۖ;
    .locals 2

    .line 5132
    new-instance v0, Ll/֨᩷ۖ;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/֨᩷ۖ;-><init>(Ll/ۢۜۖ;I)V

    return-object v0
.end method

.method public final toBuilder()Ll/֨᩷ۖ;
    .locals 2

    .line 5125
    sget-object v0, Ll/۠᩷ۖ;->۬:Ll/۠᩷ۖ;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    .line 5126
    new-instance v0, Ll/֨᩷ۖ;

    invoke-direct {v0, v1}, Ll/֨᩷ۖ;-><init>(I)V

    return-object v0

    :cond_0
    new-instance v0, Ll/֨᩷ۖ;

    invoke-direct {v0, v1}, Ll/֨᩷ۖ;-><init>(I)V

    invoke-virtual {v0, p0}, Ll/֨᩷ۖ;->֫(Ll/۠᩷ۖ;)Ll/֨᩷ۖ;

    return-object v0
.end method

.method public final bridge synthetic toBuilder()Ll/ۢ֡ۖ;
    .locals 1

    .line 4836
    invoke-virtual {p0}, Ll/۠᩷ۖ;->toBuilder()Ll/֨᩷ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic toBuilder()Ll/ܳ֡ۖ;
    .locals 1

    .line 4836
    invoke-virtual {p0}, Ll/۠᩷ۖ;->toBuilder()Ll/֨᩷ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final writeTo(Ll/ܳ᩷ۖ;)V
    .locals 2

    .line 4955
    iget v0, p0, Ll/۠᩷ۖ;->᩸:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    .line 4956
    iget v0, p0, Ll/۠᩷ۖ;->ۗ:I

    invoke-virtual {p1, v1, v0}, Ll/ܳ᩷ۖ;->ۧ(II)V

    .line 4958
    :cond_0
    iget v0, p0, Ll/۠᩷ۖ;->᩸:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    .line 4959
    iget v0, p0, Ll/۠᩷ۖ;->᩹:I

    invoke-virtual {p1, v1, v0}, Ll/ܳ᩷ۖ;->ۧ(II)V

    .line 4961
    :cond_1
    iget v0, p0, Ll/۠᩷ۖ;->᩸:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_2

    const/4 v0, 0x3

    .line 4962
    invoke-virtual {p0}, Ll/۠᩷ۖ;->᩷()Ll/ᩴۢۖ;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    .line 4964
    :cond_2
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۢ֨ۖ;->writeTo(Ll/ܳ᩷ۖ;)V

    return-void
.end method

.method public final ۖ()Z
    .locals 2

    .line 4879
    iget v0, p0, Ll/۠᩷ۖ;->᩸:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۜ()I
    .locals 1

    .line 4906
    iget v0, p0, Ll/۠᩷ۖ;->᩹:I

    return v0
.end method

.method public final ۡ()Z
    .locals 1

    .line 4898
    iget v0, p0, Ll/۠᩷ۖ;->᩸:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۢ()I
    .locals 1

    .line 4887
    iget v0, p0, Ll/۠᩷ۖ;->ۗ:I

    return v0
.end method

.method public final ܺ()Z
    .locals 1

    .line 4917
    iget v0, p0, Ll/۠᩷ۖ;->᩸:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩷()Ll/ᩴۢۖ;
    .locals 1

    .line 4925
    iget-object v0, p0, Ll/۠᩷ۖ;->ۙ:Ll/ᩴۢۖ;

    if-nez v0, :cond_0

    invoke-static {}, Ll/ᩴۢۖ;->getDefaultInstance()Ll/ᩴۢۖ;

    move-result-object v0

    :cond_0
    return-object v0
.end method
