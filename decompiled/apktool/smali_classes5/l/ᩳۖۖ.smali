.class public final Ll/ᩳۖۖ;
.super Ll/֨ۖۖ;
.source "99PI"


# instance fields
.field public volatile ֫֫:Ll/ܽܺۖ;

.field public final ۗ:[I

.field public final ۙ:[Ll/ۢۖۖ;

.field public final ۛ:[Ll/֡ۖۖ;

.field public final ۟:[Ll/ܶۖۖ;

.field public final ۤ:[Ll/֡ۖۖ;

.field public ۧ֫:Ll/᩶᩷ۖ;

.field public final ۨ:Ll/ۚۖۖ;

.field public final ۫:[Ll/֡ۖۖ;

.field public final ۬:[I

.field public final ܰ:[Ll/ᩳۖۖ;

.field public final ܽ֫:I

.field public final ᩶:Ll/ᩳۖۖ;

.field public final ᩺:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 7

    const/4 v0, 0x0

    .line 985
    invoke-direct {p0, v0}, Ll/֨ۖۖ;-><init>(I)V

    const/16 v1, 0x2e

    .line 988
    invoke-virtual {p1, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    add-int/lit8 v2, v1, 0x1

    .line 990
    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    .line 991
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, ""

    move-object v2, p1

    .line 995
    :goto_0
    invoke-static {}, Ll/᩶᩷ۖ;->newBuilder()Ll/֡᩷ۖ;

    move-result-object v3

    .line 996
    invoke-virtual {v3, v2}, Ll/֡᩷ۖ;->setName(Ljava/lang/String;)V

    .line 998
    invoke-static {}, Ll/۠᩷ۖ;->newBuilder()Ll/֨᩷ۖ;

    move-result-object v2

    const/4 v4, 0x1

    invoke-virtual {v2, v4}, Ll/֨᩷ۖ;->ܽ(I)V

    const/high16 v5, 0x20000000

    invoke-virtual {v2, v5}, Ll/֨᩷ۖ;->֫(I)V

    .line 5198
    invoke-virtual {v2}, Ll/֨᩷ۖ;->buildPartial()Ll/۠᩷ۖ;

    move-result-object v2

    .line 5199
    invoke-virtual {v2}, Ll/۠᩷ۖ;->isInitialized()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 997
    invoke-virtual {v3, v2}, Ll/֡᩷ۖ;->֫(Ll/۠᩷ۖ;)V

    .line 999
    invoke-virtual {v3}, Ll/֡᩷ۖ;->build()Ll/᩶᩷ۖ;

    move-result-object v2

    iput-object v2, p0, Ll/ᩳۖۖ;->ۧ֫:Ll/᩶᩷ۖ;

    .line 1000
    iput-object p1, p0, Ll/ᩳۖۖ;->᩺:Ljava/lang/String;

    const/4 p1, 0x0

    .line 1001
    iput-object p1, p0, Ll/ᩳۖۖ;->᩶:Ll/ᩳۖۖ;

    .line 1003
    invoke-static {}, Ll/᩹ۖۖ;->ܽ()[Ll/ᩳۖۖ;

    move-result-object p1

    iput-object p1, p0, Ll/ᩳۖۖ;->ܰ:[Ll/ᩳۖۖ;

    .line 1004
    invoke-static {}, Ll/᩹ۖۖ;->ܿ()[Ll/ۢۖۖ;

    move-result-object p1

    iput-object p1, p0, Ll/ᩳۖۖ;->ۙ:[Ll/ۢۖۖ;

    .line 1005
    invoke-static {}, Ll/᩹ۖۖ;->᩻()[Ll/֡ۖۖ;

    move-result-object p1

    iput-object p1, p0, Ll/ᩳۖۖ;->ۤ:[Ll/֡ۖۖ;

    .line 1006
    invoke-static {}, Ll/᩹ۖۖ;->᩻()[Ll/֡ۖۖ;

    move-result-object p1

    iput-object p1, p0, Ll/ᩳۖۖ;->ۛ:[Ll/֡ۖۖ;

    .line 1007
    invoke-static {}, Ll/᩹ۖۖ;->᩻()[Ll/֡ۖۖ;

    move-result-object p1

    iput-object p1, p0, Ll/ᩳۖۖ;->۫:[Ll/֡ۖۖ;

    .line 1008
    invoke-static {}, Ll/᩹ۖۖ;->ۧ()[Ll/ܶۖۖ;

    move-result-object p1

    iput-object p1, p0, Ll/ᩳۖۖ;->۟:[Ll/ܶۖۖ;

    .line 1009
    iput v0, p0, Ll/ᩳۖۖ;->ܽ֫:I

    .line 1012
    new-instance p1, Ll/ۚۖۖ;

    invoke-direct {p1, v1, p0}, Ll/ۚۖۖ;-><init>(Ljava/lang/String;Ll/ᩳۖۖ;)V

    iput-object p1, p0, Ll/ᩳۖۖ;->ۨ:Ll/ۚۖۖ;

    .line 1013
    iput-object p1, p0, Ll/֨ۖۖ;->᩹:Ll/֨ۖۖ;

    .line 1015
    filled-new-array {v4}, [I

    move-result-object p1

    iput-object p1, p0, Ll/ᩳۖۖ;->ۗ:[I

    .line 1016
    filled-new-array {v5}, [I

    move-result-object p1

    iput-object p1, p0, Ll/ᩳۖۖ;->۬:[I

    return-void

    .line 5200
    :cond_1
    invoke-static {v2}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object p1

    throw p1
.end method

.method public synthetic constructor <init>(Ll/᩶᩷ۖ;Ll/ۚۖۖ;)V
    .locals 1

    const/4 v0, 0x0

    .line 757
    invoke-direct {p0, p1, p2, v0}, Ll/ᩳۖۖ;-><init>(Ll/᩶᩷ۖ;Ll/ۚۖۖ;Ll/ᩳۖۖ;)V

    return-void
.end method

.method public constructor <init>(Ll/᩶᩷ۖ;Ll/ۚۖۖ;Ll/ᩳۖۖ;)V
    .locals 9

    const/4 v0, 0x0

    .line 1024
    invoke-direct {p0, v0}, Ll/֨ۖۖ;-><init>(I)V

    if-nez p3, :cond_0

    .line 1026
    iput-object p2, p0, Ll/֨ۖۖ;->᩹:Ll/֨ۖۖ;

    goto :goto_0

    .line 1028
    :cond_0
    iput-object p3, p0, Ll/֨ۖۖ;->᩹:Ll/֨ۖۖ;

    .line 1031
    :goto_0
    iput-object p1, p0, Ll/ᩳۖۖ;->ۧ֫:Ll/᩶᩷ۖ;

    .line 1032
    invoke-virtual {p1}, Ll/᩶᩷ۖ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p2, p3, v1}, Ll/᩹ۖۖ;->֫(Ll/ۚۖۖ;Ll/ᩳۖۖ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ᩳۖۖ;->᩺:Ljava/lang/String;

    .line 1033
    iput-object p2, p0, Ll/ᩳۖۖ;->ۨ:Ll/ۚۖۖ;

    .line 1034
    iput-object p3, p0, Ll/ᩳۖۖ;->᩶:Ll/ᩳۖۖ;

    .line 1037
    invoke-virtual {p1}, Ll/᩶᩷ۖ;->ۘ()I

    move-result p3

    if-lez p3, :cond_1

    .line 1038
    invoke-virtual {p1}, Ll/᩶᩷ۖ;->ۘ()I

    move-result p3

    new-array p3, p3, [Ll/ܶۖۖ;

    goto :goto_1

    .line 1039
    :cond_1
    invoke-static {}, Ll/᩹ۖۖ;->ۧ()[Ll/ܶۖۖ;

    move-result-object p3

    :goto_1
    iput-object p3, p0, Ll/ᩳۖۖ;->۟:[Ll/ܶۖۖ;

    const/4 p3, 0x0

    .line 1040
    :goto_2
    invoke-virtual {p1}, Ll/᩶᩷ۖ;->ۘ()I

    move-result v1

    if-ge p3, v1, :cond_2

    .line 1041
    iget-object v1, p0, Ll/ᩳۖۖ;->۟:[Ll/ܶۖۖ;

    new-instance v2, Ll/ܶۖۖ;

    invoke-virtual {p1, p3}, Ll/᩶᩷ۖ;->ܿ(I)Ll/ۘܺۖ;

    move-result-object v3

    invoke-direct {v2, v3, p2, p0, p3}, Ll/ܶۖۖ;-><init>(Ll/ۘܺۖ;Ll/ۚۖۖ;Ll/ᩳۖۖ;I)V

    aput-object v2, v1, p3

    add-int/lit8 p3, p3, 0x1

    goto :goto_2

    .line 1045
    :cond_2
    invoke-virtual {p1}, Ll/᩶᩷ۖ;->ۖ()I

    move-result p3

    if-lez p3, :cond_3

    .line 1046
    invoke-virtual {p1}, Ll/᩶᩷ۖ;->ۖ()I

    move-result p3

    new-array p3, p3, [Ll/ᩳۖۖ;

    goto :goto_3

    .line 1047
    :cond_3
    invoke-static {}, Ll/᩹ۖۖ;->ܽ()[Ll/ᩳۖۖ;

    move-result-object p3

    :goto_3
    iput-object p3, p0, Ll/ᩳۖۖ;->ܰ:[Ll/ᩳۖۖ;

    const/4 p3, 0x0

    .line 1048
    :goto_4
    invoke-virtual {p1}, Ll/᩶᩷ۖ;->ۖ()I

    move-result v1

    if-ge p3, v1, :cond_4

    .line 1049
    iget-object v1, p0, Ll/ᩳۖۖ;->ܰ:[Ll/ᩳۖۖ;

    new-instance v2, Ll/ᩳۖۖ;

    invoke-virtual {p1, p3}, Ll/᩶᩷ۖ;->ᩳ(I)Ll/᩶᩷ۖ;

    move-result-object v3

    invoke-direct {v2, v3, p2, p0}, Ll/ᩳۖۖ;-><init>(Ll/᩶᩷ۖ;Ll/ۚۖۖ;Ll/ᩳۖۖ;)V

    aput-object v2, v1, p3

    add-int/lit8 p3, p3, 0x1

    goto :goto_4

    .line 1053
    :cond_4
    invoke-virtual {p1}, Ll/᩶᩷ۖ;->ۜ()I

    move-result p3

    if-lez p3, :cond_5

    .line 1054
    invoke-virtual {p1}, Ll/᩶᩷ۖ;->ۜ()I

    move-result p3

    new-array p3, p3, [Ll/ۢۖۖ;

    goto :goto_5

    .line 1055
    :cond_5
    invoke-static {}, Ll/᩹ۖۖ;->ܿ()[Ll/ۢۖۖ;

    move-result-object p3

    :goto_5
    iput-object p3, p0, Ll/ᩳۖۖ;->ۙ:[Ll/ۢۖۖ;

    const/4 p3, 0x0

    .line 1056
    :goto_6
    invoke-virtual {p1}, Ll/᩶᩷ۖ;->ۜ()I

    move-result v1

    if-ge p3, v1, :cond_6

    .line 1057
    iget-object v1, p0, Ll/ᩳۖۖ;->ۙ:[Ll/ۢۖۖ;

    new-instance v2, Ll/ۢۖۖ;

    invoke-virtual {p1, p3}, Ll/᩶᩷ۖ;->֫(I)Ll/᩺᩷ۖ;

    move-result-object v3

    invoke-direct {v2, v3, p2, p0}, Ll/ۢۖۖ;-><init>(Ll/᩺᩷ۖ;Ll/ۚۖۖ;Ll/ᩳۖۖ;)V

    aput-object v2, v1, p3

    add-int/lit8 p3, p3, 0x1

    goto :goto_6

    .line 1061
    :cond_6
    invoke-virtual {p1}, Ll/᩶᩷ۖ;->ܺ()I

    move-result p3

    if-lez p3, :cond_7

    .line 1062
    invoke-virtual {p1}, Ll/᩶᩷ۖ;->ܺ()I

    move-result p3

    new-array p3, p3, [Ll/֡ۖۖ;

    goto :goto_7

    .line 1063
    :cond_7
    invoke-static {}, Ll/᩹ۖۖ;->᩻()[Ll/֡ۖۖ;

    move-result-object p3

    :goto_7
    iput-object p3, p0, Ll/ᩳۖۖ;->ۤ:[Ll/֡ۖۖ;

    const/4 p3, 0x0

    .line 1064
    :goto_8
    invoke-virtual {p1}, Ll/᩶᩷ۖ;->ܺ()I

    move-result v1

    if-ge p3, v1, :cond_8

    .line 1065
    iget-object v7, p0, Ll/ᩳۖۖ;->ۤ:[Ll/֡ۖۖ;

    new-instance v8, Ll/֡ۖۖ;

    invoke-virtual {p1, p3}, Ll/᩶᩷ۖ;->ܽ(I)Ll/᩷ۡۖ;

    move-result-object v2

    const/4 v6, 0x0

    move-object v1, v8

    move-object v3, p2

    move-object v4, p0

    move v5, p3

    invoke-direct/range {v1 .. v6}, Ll/֡ۖۖ;-><init>(Ll/᩷ۡۖ;Ll/ۚۖۖ;Ll/ᩳۖۖ;IZ)V

    aput-object v8, v7, p3

    add-int/lit8 p3, p3, 0x1

    goto :goto_8

    .line 1068
    :cond_8
    invoke-virtual {p1}, Ll/᩶᩷ۖ;->ܺ()I

    move-result p3

    if-lez p3, :cond_9

    iget-object p3, p0, Ll/ᩳۖۖ;->ۤ:[Ll/֡ۖۖ;

    invoke-virtual {p3}, [Ll/֡ۖۖ;->clone()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [Ll/֡ۖۖ;

    goto :goto_9

    :cond_9
    invoke-static {}, Ll/᩹ۖۖ;->᩻()[Ll/֡ۖۖ;

    move-result-object p3

    :goto_9
    iput-object p3, p0, Ll/ᩳۖۖ;->ۛ:[Ll/֡ۖۖ;

    .line 1071
    invoke-virtual {p1}, Ll/᩶᩷ۖ;->᩷()I

    move-result p3

    if-lez p3, :cond_a

    .line 1072
    invoke-virtual {p1}, Ll/᩶᩷ۖ;->᩷()I

    move-result p3

    new-array p3, p3, [Ll/֡ۖۖ;

    goto :goto_a

    .line 1073
    :cond_a
    invoke-static {}, Ll/᩹ۖۖ;->᩻()[Ll/֡ۖۖ;

    move-result-object p3

    :goto_a
    iput-object p3, p0, Ll/ᩳۖۖ;->۫:[Ll/֡ۖۖ;

    const/4 p3, 0x0

    .line 1074
    :goto_b
    invoke-virtual {p1}, Ll/᩶᩷ۖ;->᩷()I

    move-result v1

    if-ge p3, v1, :cond_b

    .line 1075
    iget-object v7, p0, Ll/ᩳۖۖ;->۫:[Ll/֡ۖۖ;

    new-instance v8, Ll/֡ۖۖ;

    invoke-virtual {p1, p3}, Ll/᩶᩷ۖ;->ۧ(I)Ll/᩷ۡۖ;

    move-result-object v2

    const/4 v6, 0x1

    move-object v1, v8

    move-object v3, p2

    move-object v4, p0

    move v5, p3

    invoke-direct/range {v1 .. v6}, Ll/֡ۖۖ;-><init>(Ll/᩷ۡۖ;Ll/ۚۖۖ;Ll/ᩳۖۖ;IZ)V

    aput-object v8, v7, p3

    add-int/lit8 p3, p3, 0x1

    goto :goto_b

    :cond_b
    const/4 p3, 0x0

    .line 1078
    :goto_c
    invoke-virtual {p1}, Ll/᩶᩷ۖ;->ۘ()I

    move-result v1

    if-ge p3, v1, :cond_c

    .line 1079
    iget-object v1, p0, Ll/ᩳۖۖ;->۟:[Ll/ܶۖۖ;

    aget-object v1, v1, p3

    invoke-virtual {v1}, Ll/ܶۖۖ;->ᩴ()I

    move-result v2

    new-array v2, v2, [Ll/֡ۖۖ;

    invoke-static {v1, v2}, Ll/ܶۖۖ;->֫(Ll/ܶۖۖ;[Ll/֡ۖۖ;)V

    .line 1080
    iget-object v1, p0, Ll/ᩳۖۖ;->۟:[Ll/ܶۖۖ;

    aget-object v1, v1, p3

    invoke-static {v1}, Ll/ܶۖۖ;->ۧ(Ll/ܶۖۖ;)V

    add-int/lit8 p3, p3, 0x1

    goto :goto_c

    :cond_c
    const/4 p3, 0x0

    .line 1082
    :goto_d
    invoke-virtual {p1}, Ll/᩶᩷ۖ;->ܺ()I

    move-result v1

    if-ge p3, v1, :cond_e

    .line 1083
    iget-object v1, p0, Ll/ᩳۖۖ;->ۤ:[Ll/֡ۖۖ;

    aget-object v1, v1, p3

    invoke-virtual {v1}, Ll/֡ۖۖ;->ܺ()Ll/ܶۖۖ;

    move-result-object v1

    if-eqz v1, :cond_d

    .line 1085
    invoke-static {v1}, Ll/ܶۖۖ;->֫(Ll/ܶۖۖ;)[Ll/֡ۖۖ;

    move-result-object v2

    invoke-static {v1}, Ll/ܶۖۖ;->ܽ(Ll/ܶۖۖ;)I

    move-result v1

    iget-object v3, p0, Ll/ᩳۖۖ;->ۤ:[Ll/֡ۖۖ;

    aget-object v3, v3, p3

    aput-object v3, v2, v1

    :cond_d
    add-int/lit8 p3, p3, 0x1

    goto :goto_d

    .line 1090
    :cond_e
    iget-object p3, p0, Ll/ᩳۖۖ;->۟:[Ll/ܶۖۖ;

    array-length v1, p3

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_e
    if-ge v2, v1, :cond_11

    aget-object v4, p3, v2

    .line 1091
    invoke-virtual {v4}, Ll/ܶۖۖ;->ۚ()Z

    move-result v4

    if-eqz v4, :cond_f

    add-int/lit8 v3, v3, 0x1

    goto :goto_f

    :cond_f
    if-gtz v3, :cond_10

    :goto_f
    add-int/lit8 v2, v2, 0x1

    goto :goto_e

    .line 1095
    :cond_10
    new-instance p1, Ll/ۜۖۖ;

    const-string p2, "Synthetic oneofs must come last."

    invoke-direct {p1, p0, p2, v0}, Ll/ۜۖۖ;-><init>(Ll/֨ۖۖ;Ljava/lang/String;I)V

    throw p1

    .line 1099
    :cond_11
    iget-object p3, p0, Ll/ᩳۖۖ;->۟:[Ll/ܶۖۖ;

    array-length p3, p3

    sub-int/2addr p3, v3

    iput p3, p0, Ll/ᩳۖۖ;->ܽ֫:I

    .line 1101
    invoke-static {p2}, Ll/ۚۖۖ;->֫(Ll/ۚۖۖ;)Ll/᩻ۖۖ;

    move-result-object p2

    invoke-virtual {p2, p0}, Ll/᩻ۖۖ;->֫(Ll/֨ۖۖ;)V

    .line 1104
    invoke-virtual {p1}, Ll/᩶᩷ۖ;->ۢ()I

    move-result p2

    if-lez p2, :cond_13

    .line 1105
    invoke-virtual {p1}, Ll/᩶᩷ۖ;->ۢ()I

    move-result p2

    new-array p2, p2, [I

    iput-object p2, p0, Ll/ᩳۖۖ;->ۗ:[I

    .line 1106
    invoke-virtual {p1}, Ll/᩶᩷ۖ;->ۢ()I

    move-result p2

    new-array p2, p2, [I

    iput-object p2, p0, Ll/ᩳۖۖ;->۬:[I

    .line 1108
    invoke-virtual {p1}, Ll/᩶᩷ۖ;->ۡ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_10
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_12

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/۠᩷ۖ;

    .line 1109
    iget-object p3, p0, Ll/ᩳۖۖ;->ۗ:[I

    invoke-virtual {p2}, Ll/۠᩷ۖ;->ۢ()I

    move-result v1

    aput v1, p3, v0

    .line 1110
    iget-object p3, p0, Ll/ᩳۖۖ;->۬:[I

    invoke-virtual {p2}, Ll/۠᩷ۖ;->ۜ()I

    move-result p2

    aput p2, p3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_10

    .line 1115
    :cond_12
    iget-object p1, p0, Ll/ᩳۖۖ;->ۗ:[I

    invoke-static {p1}, Ljava/util/Arrays;->sort([I)V

    .line 1116
    iget-object p1, p0, Ll/ᩳۖۖ;->۬:[I

    invoke-static {p1}, Ljava/util/Arrays;->sort([I)V

    return-void

    .line 1118
    :cond_13
    invoke-static {}, Ll/᩹ۖۖ;->ᩳ()[I

    move-result-object p1

    iput-object p1, p0, Ll/ᩳۖۖ;->ۗ:[I

    .line 1119
    invoke-static {}, Ll/᩹ۖۖ;->ᩳ()[I

    move-result-object p1

    iput-object p1, p0, Ll/ᩳۖۖ;->۬:[I

    return-void
.end method

.method public static synthetic ֫(Ll/ᩳۖۖ;)V
    .locals 0

    .line 757
    invoke-direct {p0}, Ll/ᩳۖۖ;->᩶()V

    return-void
.end method

.method public static synthetic ۧ(Ll/ᩳۖۖ;)V
    .locals 0

    .line 757
    invoke-direct {p0}, Ll/ᩳۖۖ;->᩹()V

    return-void
.end method

.method private ᩶()V
    .locals 5

    .line 1125
    iget-object v0, p0, Ll/ᩳۖۖ;->ۧ֫:Ll/᩶᩷ۖ;

    invoke-virtual {v0}, Ll/᩶᩷ۖ;->ᩴ()Ll/ܽܺۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽܺۖ;->ۖ()Ll/ۛۢۖ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/֨ۖۖ;->֫(Ll/ۛۢۖ;)V

    .line 1127
    iget-object v0, p0, Ll/ᩳۖۖ;->ܰ:[Ll/ᩳۖۖ;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    .line 1128
    invoke-direct {v4}, Ll/ᩳۖۖ;->᩶()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1131
    :cond_0
    iget-object v0, p0, Ll/ᩳۖۖ;->ۙ:[Ll/ۢۖۖ;

    array-length v1, v0

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    .line 1132
    invoke-static {v4}, Ll/ۢۖۖ;->֫(Ll/ۢۖۖ;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 1136
    :cond_1
    iget-object v0, p0, Ll/ᩳۖۖ;->۟:[Ll/ܶۖۖ;

    array-length v1, v0

    const/4 v3, 0x0

    :goto_2
    if-ge v3, v1, :cond_2

    aget-object v4, v0, v3

    .line 1137
    invoke-static {v4}, Ll/ܶۖۖ;->ᩳ(Ll/ܶۖۖ;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 1140
    :cond_2
    iget-object v0, p0, Ll/ᩳۖۖ;->ۤ:[Ll/֡ۖۖ;

    array-length v1, v0

    const/4 v3, 0x0

    :goto_3
    if-ge v3, v1, :cond_3

    aget-object v4, v0, v3

    .line 1141
    invoke-static {v4}, Ll/֡ۖۖ;->֫(Ll/֡ۖۖ;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 1144
    :cond_3
    iget-object v0, p0, Ll/ᩳۖۖ;->۫:[Ll/֡ۖۖ;

    array-length v1, v0

    :goto_4
    if-ge v2, v1, :cond_4

    aget-object v3, v0, v2

    .line 1145
    invoke-static {v3}, Ll/֡ۖۖ;->֫(Ll/֡ۖۖ;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_4
    return-void
.end method

.method private ᩹()V
    .locals 7

    .line 1151
    iget-object v0, p0, Ll/ᩳۖۖ;->ܰ:[Ll/ᩳۖۖ;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    .line 1152
    invoke-direct {v4}, Ll/ᩳۖۖ;->᩹()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1155
    :cond_0
    iget-object v0, p0, Ll/ᩳۖۖ;->ۤ:[Ll/֡ۖۖ;

    array-length v1, v0

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    .line 1156
    invoke-static {v4}, Ll/֡ۖۖ;->ۧ(Ll/֡ۖۖ;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 1158
    :cond_1
    iget-object v0, p0, Ll/ᩳۖۖ;->ۛ:[Ll/֡ۖۖ;

    invoke-static {v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    const/4 v1, 0x0

    :goto_2
    add-int/lit8 v3, v1, 0x1

    .line 1167
    array-length v4, v0

    if-ge v3, v4, :cond_3

    .line 1168
    aget-object v1, v0, v1

    .line 1169
    aget-object v4, v0, v3

    .line 1170
    invoke-virtual {v1}, Ll/֡ۖۖ;->getNumber()I

    move-result v5

    invoke-virtual {v4}, Ll/֡ۖۖ;->getNumber()I

    move-result v6

    if-eq v5, v6, :cond_2

    move v1, v3

    goto :goto_2

    .line 1171
    :cond_2
    new-instance v0, Ll/ۜۖۖ;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "Field number "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1174
    invoke-virtual {v4}, Ll/֡ۖۖ;->getNumber()I

    move-result v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " has already been used in \""

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1176
    invoke-virtual {v4}, Ll/֡ۖۖ;->ᩴ()Ll/ᩳۖۖ;

    move-result-object v5

    .line 804
    iget-object v5, v5, Ll/ᩳۖۖ;->᩺:Ljava/lang/String;

    .line 1176
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "\" by field \""

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1178
    invoke-virtual {v1}, Ll/֡ۖۖ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\"."

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v4, v1, v2}, Ll/ۜۖۖ;-><init>(Ll/֨ۖۖ;Ljava/lang/String;I)V

    throw v0

    .line 1161
    :cond_3
    iget-object v0, p0, Ll/ᩳۖۖ;->۫:[Ll/֡ۖۖ;

    array-length v1, v0

    :goto_3
    if-ge v2, v1, :cond_4

    aget-object v3, v0, v2

    .line 1162
    invoke-static {v3}, Ll/֡ۖۖ;->ۧ(Ll/֡ۖۖ;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_4
    return-void
.end method


# virtual methods
.method public final getFields()Ljava/util/List;
    .locals 1

    .line 839
    iget-object v0, p0, Ll/ᩳۖۖ;->ۤ:[Ll/֡ۖۖ;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 787
    iget-object v0, p0, Ll/ᩳۖۖ;->ۧ֫:Ll/᩶᩷ۖ;

    invoke-virtual {v0}, Ll/᩶᩷ۖ;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()Ljava/util/List;
    .locals 1

    .line 854
    iget-object v0, p0, Ll/ᩳۖۖ;->۫:[Ll/֡ۖۖ;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ֨()Ljava/util/List;
    .locals 1

    .line 844
    iget-object v0, p0, Ll/ᩳۖۖ;->۟:[Ll/ܶۖۖ;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I)Ll/֡ۖۖ;
    .locals 6

    .line 933
    iget-object v0, p0, Ll/ᩳۖۖ;->ۛ:[Ll/֡ۖۖ;

    array-length v1, v0

    .line 934
    invoke-static {}, Ll/֡ۖۖ;->ܰ()Ll/ۘۖۖ;

    .line 933
    sget v2, Ll/᩹ۖۖ;->֫:I

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    :goto_0
    if-gt v2, v1, :cond_2

    add-int v3, v2, v1

    .line 3363
    div-int/lit8 v3, v3, 0x2

    .line 3364
    aget-object v4, v0, v3

    .line 1221
    invoke-virtual {v4}, Ll/֡ۖۖ;->getNumber()I

    move-result v5

    if-ge p1, v5, :cond_0

    add-int/lit8 v1, v3, -0x1

    goto :goto_0

    :cond_0
    if-le p1, v5, :cond_1

    add-int/lit8 v2, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v4

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;)Ll/֡ۖۖ;
    .locals 3

    .line 918
    iget-object v0, p0, Ll/ᩳۖۖ;->ۨ:Ll/ۚۖۖ;

    invoke-static {v0}, Ll/ۚۖۖ;->֫(Ll/ۚۖۖ;)Ll/᩻ۖۖ;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ll/ᩳۖۖ;->᩺:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x2e

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2971
    sget-object v1, Ll/ܳۖۖ;->᩶:Ll/ܳۖۖ;

    invoke-virtual {v0, p1, v1}, Ll/᩻ۖۖ;->֫(Ljava/lang/String;Ll/ܳۖۖ;)Ll/֨ۖۖ;

    move-result-object p1

    .line 919
    instance-of v0, p1, Ll/֡ۖۖ;

    if-eqz v0, :cond_0

    .line 920
    check-cast p1, Ll/֡ۖۖ;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۚ()Ljava/util/List;
    .locals 1

    .line 859
    iget-object v0, p0, Ll/ᩳۖۖ;->ܰ:[Ll/ᩳۖۖ;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ۠()Ll/ܽܺۖ;
    .locals 3

    .line 820
    iget-object v0, p0, Ll/ᩳۖۖ;->֫֫:Ll/ܽܺۖ;

    if-nez v0, :cond_3

    .line 821
    iget-object v0, p0, Ll/ᩳۖۖ;->ۧ֫:Ll/᩶᩷ۖ;

    invoke-virtual {v0}, Ll/᩶᩷ۖ;->ᩴ()Ll/ܽܺۖ;

    move-result-object v0

    .line 822
    invoke-virtual {v0}, Ll/ܽܺۖ;->֨()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 826
    invoke-virtual {v0}, Ll/ܽܺۖ;->toBuilder()Ll/ۧܺۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۧܺۖ;->ᩳ()V

    .line 25300
    invoke-virtual {v0}, Ll/ۧܺۖ;->buildPartial()Ll/ܽܺۖ;

    move-result-object v0

    .line 25301
    invoke-virtual {v0}, Ll/ܽܺۖ;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 25302
    :cond_0
    invoke-static {v0}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object v0

    throw v0

    :cond_1
    :goto_0
    move-object v1, v0

    move-object v0, p0

    .line 828
    monitor-enter v0

    .line 829
    :try_start_0
    iget-object v2, p0, Ll/ᩳۖۖ;->֫֫:Ll/ܽܺۖ;

    if-nez v2, :cond_2

    .line 830
    iput-object v1, p0, Ll/ᩳۖۖ;->֫֫:Ll/ܽܺۖ;

    .line 832
    :cond_2
    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 834
    :cond_3
    :goto_1
    iget-object v0, p0, Ll/ᩳۖۖ;->֫֫:Ll/ܽܺۖ;

    return-object v0
.end method

.method public final ۢ()Ll/᩶᩷ۖ;
    .locals 1

    .line 781
    iget-object v0, p0, Ll/ᩳۖۖ;->ۧ֫:Ll/᩶᩷ۖ;

    return-object v0
.end method

.method public final ۢ()Ll/᩻֡ۖ;
    .locals 1

    .line 781
    iget-object v0, p0, Ll/ᩳۖۖ;->ۧ֫:Ll/᩶᩷ۖ;

    return-object v0
.end method

.method public final ۧ()Ll/ۚۖۖ;
    .locals 1

    .line 810
    iget-object v0, p0, Ll/ᩳۖۖ;->ۨ:Ll/ۚۖۖ;

    return-object v0
.end method

.method public final ۧ(I)Z
    .locals 3

    .line 869
    iget-object v0, p0, Ll/ᩳۖۖ;->ۗ:[I

    invoke-static {v0, p1}, Ljava/util/Arrays;->binarySearch([II)I

    move-result v0

    const/4 v1, 0x1

    if-gez v0, :cond_0

    not-int v0, v0

    sub-int/2addr v0, v1

    :cond_0
    if-ltz v0, :cond_1

    .line 874
    iget-object v2, p0, Ll/ᩳۖۖ;->۬:[I

    aget v0, v2, v0

    if-ge p1, v0, :cond_1

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ܶ()Ljava/util/List;
    .locals 3

    .line 849
    iget-object v0, p0, Ll/ᩳۖۖ;->۟:[Ll/ܶۖۖ;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    iget v2, p0, Ll/ᩳۖۖ;->ܽ֫:I

    invoke-interface {v0, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ܺ()Ll/ᩳۖۖ;
    .locals 1

    .line 815
    iget-object v0, p0, Ll/ᩳۖۖ;->᩶:Ll/ᩳۖۖ;

    return-object v0
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    .line 804
    iget-object v0, p0, Ll/ᩳۖۖ;->᩺:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩴ()Ljava/util/List;
    .locals 1

    .line 864
    iget-object v0, p0, Ll/ᩳۖۖ;->ۙ:[Ll/ۢۖۖ;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ᩸()Z
    .locals 1

    .line 903
    iget-object v0, p0, Ll/ᩳۖۖ;->ۧ֫:Ll/᩶᩷ۖ;

    invoke-virtual {v0}, Ll/᩶᩷ۖ;->ۡ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
