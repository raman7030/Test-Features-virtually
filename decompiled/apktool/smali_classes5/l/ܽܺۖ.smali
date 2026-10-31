.class public final Ll/ܽܺۖ;
.super Ll/۫ۘۖ;
.source "T9Q9"


# static fields
.field public static final serialVersionUID:J

.field public static final ܰ:Ll/۫֡ۖ;

.field public static final ᩺:Ll/ܽܺۖ;


# instance fields
.field public ۗ:Ll/ۛۢۖ;

.field public ۙ:Z

.field public ۛ:Z

.field public ۤ:Z

.field public ۨ:Ljava/util/List;

.field public ۫:B

.field public ۬:Z

.field public ᩶:Z

.field public ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 24745
    sget-object v0, Ll/ۜۚۖ;->᩶:Ll/ۜۚۖ;

    const-class v1, Ll/ܽܺۖ;

    .line 24751
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    .line 24745
    invoke-static {v0, v1}, Ll/᩷ۚۖ;->֫(Ll/ۜۚۖ;Ljava/lang/String;)V

    .line 26093
    new-instance v0, Ll/ܽܺۖ;

    invoke-direct {v0}, Ll/ܽܺۖ;-><init>()V

    sput-object v0, Ll/ܽܺۖ;->᩺:Ll/ܽܺۖ;

    .line 26101
    new-instance v0, Ll/֫ܺۖ;

    invoke-direct {v0}, Ll/ᩴۜۖ;-><init>()V

    sput-object v0, Ll/ܽܺۖ;->ܰ:Ll/۫֡ۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 24757
    invoke-direct {p0}, Ll/۫ۘۖ;-><init>()V

    const/4 v0, 0x0

    .line 24776
    iput-boolean v0, p0, Ll/ܽܺۖ;->ۤ:Z

    .line 24795
    iput-boolean v0, p0, Ll/ܽܺۖ;->ۛ:Z

    .line 24814
    iput-boolean v0, p0, Ll/ܽܺۖ;->ۙ:Z

    .line 24833
    iput-boolean v0, p0, Ll/ܽܺۖ;->۬:Z

    .line 24852
    iput-boolean v0, p0, Ll/ܽܺۖ;->᩶:Z

    const/4 v0, -0x1

    .line 24941
    iput-byte v0, p0, Ll/ܽܺۖ;->۫:B

    .line 24758
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ܽܺۖ;->ۨ:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ll/ۧܺۖ;)V
    .locals 0

    .line 24755
    invoke-direct {p0, p1}, Ll/۫ۘۖ;-><init>(Ll/ۗۘۖ;)V

    const/4 p1, 0x0

    .line 24776
    iput-boolean p1, p0, Ll/ܽܺۖ;->ۤ:Z

    .line 24795
    iput-boolean p1, p0, Ll/ܽܺۖ;->ۛ:Z

    .line 24814
    iput-boolean p1, p0, Ll/ܽܺۖ;->ۙ:Z

    .line 24833
    iput-boolean p1, p0, Ll/ܽܺۖ;->۬:Z

    .line 24852
    iput-boolean p1, p0, Ll/ܽܺۖ;->᩶:Z

    const/4 p1, -0x1

    .line 24941
    iput-byte p1, p0, Ll/ܽܺۖ;->۫:B

    return-void
.end method

.method public static getDefaultInstance()Ll/ܽܺۖ;
    .locals 1

    .line 26097
    sget-object v0, Ll/ܽܺۖ;->᩺:Ll/ܽܺۖ;

    return-object v0
.end method

.method public static newBuilder()Ll/ۧܺۖ;
    .locals 1

    .line 25208
    sget-object v0, Ll/ܽܺۖ;->᩺:Ll/ܽܺۖ;

    invoke-virtual {v0}, Ll/ܽܺۖ;->toBuilder()Ll/ۧܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic ֫(Ll/ܽܺۖ;)Ljava/util/List;
    .locals 0

    .line 24738
    iget-object p0, p0, Ll/ܽܺۖ;->ۨ:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic ֫(Ll/ܽܺۖ;I)V
    .locals 1

    .line 24738
    iget v0, p0, Ll/ܽܺۖ;->᩹:I

    or-int/2addr p1, v0

    iput p1, p0, Ll/ܽܺۖ;->᩹:I

    return-void
.end method

.method public static synthetic ֫(Ll/ܽܺۖ;Ljava/util/List;)V
    .locals 0

    .line 24738
    iput-object p1, p0, Ll/ܽܺۖ;->ۨ:Ljava/util/List;

    return-void
.end method

.method public static synthetic ֫(Ll/ܽܺۖ;Ll/ۛۢۖ;)V
    .locals 0

    .line 24738
    iput-object p1, p0, Ll/ܽܺۖ;->ۗ:Ll/ۛۢۖ;

    return-void
.end method

.method public static synthetic ֫(Ll/ܽܺۖ;Z)V
    .locals 0

    .line 24738
    iput-boolean p1, p0, Ll/ܽܺۖ;->ۤ:Z

    return-void
.end method

.method public static synthetic ۧ(Ll/ܽܺۖ;Z)V
    .locals 0

    .line 24738
    iput-boolean p1, p0, Ll/ܽܺۖ;->ۛ:Z

    return-void
.end method

.method public static synthetic ܽ(Ll/ܽܺۖ;Z)V
    .locals 0

    .line 24738
    iput-boolean p1, p0, Ll/ܽܺۖ;->ۙ:Z

    return-void
.end method

.method public static synthetic ܿ(Ll/ܽܺۖ;Z)V
    .locals 0

    .line 24738
    iput-boolean p1, p0, Ll/ܽܺۖ;->᩶:Z

    return-void
.end method

.method public static synthetic ᩳ(Ll/ܽܺۖ;Z)V
    .locals 0

    .line 24738
    iput-boolean p1, p0, Ll/ܽܺۖ;->۬:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 25044
    :cond_0
    instance-of v1, p1, Ll/ܽܺۖ;

    if-nez v1, :cond_1

    .line 25045
    invoke-super {p0, p1}, Ll/ۡۜۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 25047
    :cond_1
    check-cast p1, Ll/ܽܺۖ;

    .line 25049
    invoke-virtual {p0}, Ll/ܽܺۖ;->ܶ()Z

    move-result v1

    invoke-virtual {p1}, Ll/ܽܺۖ;->ܶ()Z

    move-result v2

    const/4 v3, 0x0

    if-eq v1, v2, :cond_2

    return v3

    .line 25050
    :cond_2
    invoke-virtual {p0}, Ll/ܽܺۖ;->ܶ()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 24791
    iget-boolean v1, p0, Ll/ܽܺۖ;->ۤ:Z

    iget-boolean v2, p1, Ll/ܽܺۖ;->ۤ:Z

    if-eq v1, v2, :cond_3

    return v3

    .line 25054
    :cond_3
    invoke-virtual {p0}, Ll/ܽܺۖ;->᩸()Z

    move-result v1

    invoke-virtual {p1}, Ll/ܽܺۖ;->᩸()Z

    move-result v2

    if-eq v1, v2, :cond_4

    return v3

    .line 25055
    :cond_4
    invoke-virtual {p0}, Ll/ܽܺۖ;->᩸()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 24810
    iget-boolean v1, p0, Ll/ܽܺۖ;->ۛ:Z

    iget-boolean v2, p1, Ll/ܽܺۖ;->ۛ:Z

    if-eq v1, v2, :cond_5

    return v3

    .line 25059
    :cond_5
    invoke-virtual {p0}, Ll/ܽܺۖ;->֡()Z

    move-result v1

    invoke-virtual {p1}, Ll/ܽܺۖ;->֡()Z

    move-result v2

    if-eq v1, v2, :cond_6

    return v3

    .line 25060
    :cond_6
    invoke-virtual {p0}, Ll/ܽܺۖ;->֡()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 24829
    iget-boolean v1, p0, Ll/ܽܺۖ;->ۙ:Z

    iget-boolean v2, p1, Ll/ܽܺۖ;->ۙ:Z

    if-eq v1, v2, :cond_7

    return v3

    .line 25064
    :cond_7
    invoke-virtual {p0}, Ll/ܽܺۖ;->۠()Z

    move-result v1

    invoke-virtual {p1}, Ll/ܽܺۖ;->۠()Z

    move-result v2

    if-eq v1, v2, :cond_8

    return v3

    .line 25065
    :cond_8
    invoke-virtual {p0}, Ll/ܽܺۖ;->۠()Z

    move-result v1

    if-eqz v1, :cond_9

    .line 24848
    iget-boolean v1, p0, Ll/ܽܺۖ;->۬:Z

    iget-boolean v2, p1, Ll/ܽܺۖ;->۬:Z

    if-eq v1, v2, :cond_9

    return v3

    .line 25069
    :cond_9
    invoke-virtual {p0}, Ll/ܽܺۖ;->ۚ()Z

    move-result v1

    invoke-virtual {p1}, Ll/ܽܺۖ;->ۚ()Z

    move-result v2

    if-eq v1, v2, :cond_a

    return v3

    .line 25070
    :cond_a
    invoke-virtual {p0}, Ll/ܽܺۖ;->ۚ()Z

    move-result v1

    if-eqz v1, :cond_b

    .line 24871
    iget-boolean v1, p0, Ll/ܽܺۖ;->᩶:Z

    iget-boolean v2, p1, Ll/ܽܺۖ;->᩶:Z

    if-eq v1, v2, :cond_b

    return v3

    .line 25074
    :cond_b
    invoke-virtual {p0}, Ll/ܽܺۖ;->֨()Z

    move-result v1

    invoke-virtual {p1}, Ll/ܽܺۖ;->֨()Z

    move-result v2

    if-eq v1, v2, :cond_c

    return v3

    .line 25075
    :cond_c
    invoke-virtual {p0}, Ll/ܽܺۖ;->֨()Z

    move-result v1

    if-eqz v1, :cond_d

    .line 25076
    invoke-virtual {p0}, Ll/ܽܺۖ;->ۖ()Ll/ۛۢۖ;

    move-result-object v1

    .line 25077
    invoke-virtual {p1}, Ll/ܽܺۖ;->ۖ()Ll/ۛۢۖ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۛۢۖ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v3

    .line 24908
    :cond_d
    iget-object v1, p0, Ll/ܽܺۖ;->ۨ:Ljava/util/List;

    iget-object v2, p1, Ll/ܽܺۖ;->ۨ:Ljava/util/List;

    .line 25080
    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v3

    .line 25081
    :cond_e
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۢ֨ۖ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v3

    .line 25082
    :cond_f
    invoke-virtual {p0}, Ll/۫ۘۖ;->ۢ()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p1}, Ll/۫ۘۖ;->ۢ()Ljava/util/Map;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    return v3

    :cond_10
    return v0
.end method

.method public final getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 26133
    sget-object v0, Ll/ܽܺۖ;->᩺:Ll/ܽܺۖ;

    return-object v0
.end method

.method public final getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 26133
    sget-object v0, Ll/ܽܺۖ;->᩺:Ll/ܽܺۖ;

    return-object v0
.end method

.method public final getParserForType()Ll/۫֡ۖ;
    .locals 1

    .line 26128
    sget-object v0, Ll/ܽܺۖ;->ܰ:Ll/۫֡ۖ;

    return-object v0
.end method

.method public final getSerializedSize()I
    .locals 4

    .line 25001
    iget v0, p0, Ll/ۡۜۖ;->memoizedSize:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    .line 25005
    :cond_0
    iget v0, p0, Ll/ܽܺۖ;->᩹:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 25007
    invoke-static {v1}, Ll/ܳ᩷ۖ;->ᩳ(I)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 25009
    :goto_0
    iget v1, p0, Ll/ܽܺۖ;->᩹:I

    const/4 v3, 0x2

    and-int/2addr v1, v3

    if-eqz v1, :cond_2

    .line 25011
    invoke-static {v3}, Ll/ܳ᩷ۖ;->ᩳ(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 25013
    :cond_2
    iget v1, p0, Ll/ܽܺۖ;->᩹:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_3

    const/4 v1, 0x3

    .line 25015
    invoke-static {v1}, Ll/ܳ᩷ۖ;->ᩳ(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 25017
    :cond_3
    iget v1, p0, Ll/ܽܺۖ;->᩹:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_4

    const/4 v1, 0x7

    .line 25019
    invoke-static {v1}, Ll/ܳ᩷ۖ;->ᩳ(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 25021
    :cond_4
    iget v1, p0, Ll/ܽܺۖ;->᩹:I

    and-int/lit8 v1, v1, 0x10

    if-eqz v1, :cond_5

    const/16 v1, 0xb

    .line 25023
    invoke-static {v1}, Ll/ܳ᩷ۖ;->ᩳ(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 25025
    :cond_5
    iget v1, p0, Ll/ܽܺۖ;->᩹:I

    and-int/lit8 v1, v1, 0x20

    if-eqz v1, :cond_6

    const/16 v1, 0xc

    .line 25027
    invoke-virtual {p0}, Ll/ܽܺۖ;->ۖ()Ll/ۛۢۖ;

    move-result-object v3

    invoke-static {v1, v3}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v1

    add-int/2addr v0, v1

    .line 25029
    :cond_6
    :goto_1
    iget-object v1, p0, Ll/ܽܺۖ;->ۨ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v2, v1, :cond_7

    .line 25030
    iget-object v1, p0, Ll/ܽܺۖ;->ۨ:Ljava/util/List;

    .line 25031
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡ֡ۖ;

    const/16 v3, 0x3e7

    invoke-static {v3, v1}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 25033
    :cond_7
    invoke-virtual {p0}, Ll/۫ۘۖ;->᩷()I

    move-result v1

    add-int/2addr v0, v1

    .line 25034
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->getSerializedSize()I

    move-result v1

    add-int/2addr v1, v0

    .line 25035
    iput v1, p0, Ll/ۡۜۖ;->memoizedSize:I

    return v1
.end method

.method public final hashCode()I
    .locals 4

    .line 25089
    iget v0, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    if-eqz v0, :cond_0

    return v0

    .line 24763
    :cond_0
    invoke-static {}, Ll/ۧۖۖ;->ۖ()Ll/ᩳۖۖ;

    move-result-object v0

    .line 25093
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x30b

    .line 25094
    invoke-virtual {p0}, Ll/ܽܺۖ;->ܶ()Z

    move-result v1

    const/16 v2, 0x35

    const/16 v3, 0x25

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    .line 25095
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 24791
    iget-boolean v1, p0, Ll/ܽܺۖ;->ۤ:Z

    .line 25096
    invoke-static {v1}, Ll/ܰᩴۖ;->֫(Z)I

    move-result v1

    add-int/2addr v0, v1

    .line 25099
    :cond_1
    invoke-virtual {p0}, Ll/ܽܺۖ;->᩸()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    .line 25100
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 24810
    iget-boolean v1, p0, Ll/ܽܺۖ;->ۛ:Z

    .line 25101
    invoke-static {v1}, Ll/ܰᩴۖ;->֫(Z)I

    move-result v1

    add-int/2addr v0, v1

    .line 25104
    :cond_2
    invoke-virtual {p0}, Ll/ܽܺۖ;->֡()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x3

    .line 25105
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 24829
    iget-boolean v1, p0, Ll/ܽܺۖ;->ۙ:Z

    .line 25106
    invoke-static {v1}, Ll/ܰᩴۖ;->֫(Z)I

    move-result v1

    add-int/2addr v0, v1

    .line 25109
    :cond_3
    invoke-virtual {p0}, Ll/ܽܺۖ;->۠()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x7

    .line 25110
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 24848
    iget-boolean v1, p0, Ll/ܽܺۖ;->۬:Z

    .line 25111
    invoke-static {v1}, Ll/ܰᩴۖ;->֫(Z)I

    move-result v1

    add-int/2addr v0, v1

    .line 25114
    :cond_4
    invoke-virtual {p0}, Ll/ܽܺۖ;->ۚ()Z

    move-result v1

    if-eqz v1, :cond_5

    const/16 v1, 0xb

    .line 25115
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 24871
    iget-boolean v1, p0, Ll/ܽܺۖ;->᩶:Z

    .line 25116
    invoke-static {v1}, Ll/ܰᩴۖ;->֫(Z)I

    move-result v1

    add-int/2addr v0, v1

    .line 25119
    :cond_5
    invoke-virtual {p0}, Ll/ܽܺۖ;->֨()Z

    move-result v1

    if-eqz v1, :cond_6

    const/16 v1, 0xc

    .line 25120
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 25121
    invoke-virtual {p0}, Ll/ܽܺۖ;->ۖ()Ll/ۛۢۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۛۢۖ;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 24923
    :cond_6
    iget-object v1, p0, Ll/ܽܺۖ;->ۨ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_7

    const/16 v1, 0x3e7

    .line 25124
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 24908
    iget-object v1, p0, Ll/ܽܺۖ;->ۨ:Ljava/util/List;

    .line 25125
    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 25127
    :cond_7
    invoke-virtual {p0}, Ll/۫ۘۖ;->ۢ()Ljava/util/Map;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۡۜۖ;->֫(ILjava/util/Map;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1d

    .line 25128
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    .line 25129
    iput v1, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    return v1
.end method

.method public final internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 24769
    invoke-static {}, Ll/ۧۖۖ;->ۘ()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/ܽܺۖ;

    const-class v2, Ll/ۧܺۖ;

    .line 24770
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 4

    .line 24944
    iget-byte v0, p0, Ll/ܽܺۖ;->۫:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    .line 24948
    :cond_1
    invoke-virtual {p0}, Ll/ܽܺۖ;->֨()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 24949
    invoke-virtual {p0}, Ll/ܽܺۖ;->ۖ()Ll/ۛۢۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۛۢۖ;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_2

    .line 24950
    iput-byte v2, p0, Ll/ܽܺۖ;->۫:B

    return v2

    :cond_2
    const/4 v0, 0x0

    .line 24923
    :goto_0
    iget-object v3, p0, Ll/ܽܺۖ;->ۨ:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_4

    .line 24930
    iget-object v3, p0, Ll/ܽܺۖ;->ۨ:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֫ۖۖ;

    .line 24955
    invoke-virtual {v3}, Ll/֫ۖۖ;->isInitialized()Z

    move-result v3

    if-nez v3, :cond_3

    .line 24956
    iput-byte v2, p0, Ll/ܽܺۖ;->۫:B

    return v2

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 24960
    :cond_4
    invoke-virtual {p0}, Ll/۫ۘۖ;->ۜ()Z

    move-result v0

    if-nez v0, :cond_5

    .line 24961
    iput-byte v2, p0, Ll/ܽܺۖ;->۫:B

    return v2

    .line 24964
    :cond_5
    iput-byte v1, p0, Ll/ܽܺۖ;->۫:B

    return v1
.end method

.method public final newBuilderForType()Ll/ۢ֡ۖ;
    .locals 1

    .line 25208
    sget-object v0, Ll/ܽܺۖ;->᩺:Ll/ܽܺۖ;

    invoke-virtual {v0}, Ll/ܽܺۖ;->toBuilder()Ll/ۧܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public final newBuilderForType()Ll/ܳ֡ۖ;
    .locals 1

    .line 25208
    sget-object v0, Ll/ܽܺۖ;->᩺:Ll/ܽܺۖ;

    invoke-virtual {v0}, Ll/ܽܺۖ;->toBuilder()Ll/ۧܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public final newBuilderForType(Ll/ۢۜۖ;)Ll/ܳ֡ۖ;
    .locals 2

    .line 25222
    new-instance v0, Ll/ۧܺۖ;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/ۧܺۖ;-><init>(Ll/ۢۜۖ;I)V

    return-object v0
.end method

.method public final bridge synthetic toBuilder()Ll/ۢ֡ۖ;
    .locals 1

    .line 24738
    invoke-virtual {p0}, Ll/ܽܺۖ;->toBuilder()Ll/ۧܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public final toBuilder()Ll/ۧܺۖ;
    .locals 2

    .line 25215
    sget-object v0, Ll/ܽܺۖ;->᩺:Ll/ܽܺۖ;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    .line 25216
    new-instance v0, Ll/ۧܺۖ;

    invoke-direct {v0, v1}, Ll/ۧܺۖ;-><init>(I)V

    return-object v0

    :cond_0
    new-instance v0, Ll/ۧܺۖ;

    invoke-direct {v0, v1}, Ll/ۧܺۖ;-><init>(I)V

    invoke-virtual {v0, p0}, Ll/ۧܺۖ;->֫(Ll/ܽܺۖ;)Ll/ۧܺۖ;

    return-object v0
.end method

.method public final bridge synthetic toBuilder()Ll/ܳ֡ۖ;
    .locals 1

    .line 24738
    invoke-virtual {p0}, Ll/ܽܺۖ;->toBuilder()Ll/ۧܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public final writeTo(Ll/ܳ᩷ۖ;)V
    .locals 4

    .line 1079
    new-instance v0, Ll/۬ۘۖ;

    invoke-direct {v0, p0}, Ll/۬ۘۖ;-><init>(Ll/۫ۘۖ;)V

    .line 24974
    iget v1, p0, Ll/ܽܺۖ;->᩹:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    .line 24975
    iget-boolean v1, p0, Ll/ܽܺۖ;->ۤ:Z

    invoke-virtual {p1, v2, v1}, Ll/ܳ᩷ۖ;->֫(IZ)V

    .line 24977
    :cond_0
    iget v1, p0, Ll/ܽܺۖ;->᩹:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-eqz v1, :cond_1

    .line 24978
    iget-boolean v1, p0, Ll/ܽܺۖ;->ۛ:Z

    invoke-virtual {p1, v2, v1}, Ll/ܳ᩷ۖ;->֫(IZ)V

    .line 24980
    :cond_1
    iget v1, p0, Ll/ܽܺۖ;->᩹:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_2

    const/4 v1, 0x3

    .line 24981
    iget-boolean v2, p0, Ll/ܽܺۖ;->ۙ:Z

    invoke-virtual {p1, v1, v2}, Ll/ܳ᩷ۖ;->֫(IZ)V

    .line 24983
    :cond_2
    iget v1, p0, Ll/ܽܺۖ;->᩹:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_3

    const/4 v1, 0x7

    .line 24984
    iget-boolean v2, p0, Ll/ܽܺۖ;->۬:Z

    invoke-virtual {p1, v1, v2}, Ll/ܳ᩷ۖ;->֫(IZ)V

    .line 24986
    :cond_3
    iget v1, p0, Ll/ܽܺۖ;->᩹:I

    and-int/lit8 v1, v1, 0x10

    if-eqz v1, :cond_4

    const/16 v1, 0xb

    .line 24987
    iget-boolean v2, p0, Ll/ܽܺۖ;->᩶:Z

    invoke-virtual {p1, v1, v2}, Ll/ܳ᩷ۖ;->֫(IZ)V

    .line 24989
    :cond_4
    iget v1, p0, Ll/ܽܺۖ;->᩹:I

    and-int/lit8 v1, v1, 0x20

    if-eqz v1, :cond_5

    const/16 v1, 0xc

    .line 24990
    invoke-virtual {p0}, Ll/ܽܺۖ;->ۖ()Ll/ۛۢۖ;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    :cond_5
    const/4 v1, 0x0

    .line 24992
    :goto_0
    iget-object v2, p0, Ll/ܽܺۖ;->ۨ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_6

    .line 24993
    iget-object v2, p0, Ll/ܽܺۖ;->ۨ:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۡ֡ۖ;

    const/16 v3, 0x3e7

    invoke-virtual {p1, v3, v2}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_6
    const/high16 v1, 0x20000000

    .line 24995
    invoke-virtual {v0, v1, p1}, Ll/۬ۘۖ;->֫(ILl/ܳ᩷ۖ;)V

    .line 24996
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۢ֨ۖ;->writeTo(Ll/ܳ᩷ۖ;)V

    return-void
.end method

.method public final ֡()Z
    .locals 1

    .line 24821
    iget v0, p0, Ll/ܽܺۖ;->᩹:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ֨()Z
    .locals 1

    .line 24882
    iget v0, p0, Ll/ܽܺۖ;->᩹:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۖ()Ll/ۛۢۖ;
    .locals 1

    .line 24890
    iget-object v0, p0, Ll/ܽܺۖ;->ۗ:Ll/ۛۢۖ;

    if-nez v0, :cond_0

    invoke-static {}, Ll/ۛۢۖ;->getDefaultInstance()Ll/ۛۢۖ;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final ۘ()Z
    .locals 1

    .line 24848
    iget-boolean v0, p0, Ll/ܽܺۖ;->۬:Z

    return v0
.end method

.method public final ۚ()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 24861
    iget v0, p0, Ll/ܽܺۖ;->᩹:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۠()Z
    .locals 1

    .line 24840
    iget v0, p0, Ll/ܽܺۖ;->᩹:I

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

    .line 24829
    iget-boolean v0, p0, Ll/ܽܺۖ;->ۙ:Z

    return v0
.end method

.method public final ܶ()Z
    .locals 2

    .line 24783
    iget v0, p0, Ll/ܽܺۖ;->᩹:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܺ()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 24871
    iget-boolean v0, p0, Ll/ܽܺۖ;->᩶:Z

    return v0
.end method

.method public final ᩴ()Z
    .locals 1

    .line 24791
    iget-boolean v0, p0, Ll/ܽܺۖ;->ۤ:Z

    return v0
.end method

.method public final ᩵()Z
    .locals 1

    .line 24810
    iget-boolean v0, p0, Ll/ܽܺۖ;->ۛ:Z

    return v0
.end method

.method public final ᩸()Z
    .locals 1

    .line 24802
    iget v0, p0, Ll/ܽܺۖ;->᩹:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
