.class public final Ll/ۤۨۡ;
.super Ljava/lang/Object;
.source "K50I"

# interfaces
.implements Landroid/content/res/XmlResourceParser;


# instance fields
.field public ֫֫:Ll/۫᩻ܽ;

.field public ۗ:I

.field public ۙ:Z

.field public ۛ:I

.field public ۟:[I

.field public ۤ:I

.field public ۧ֫:I

.field public ۨ:Ll/۬ۨۡ;

.field public ۫:I

.field public ۬:I

.field public ܰ:Ll/۬ۜܽ;

.field public ܽ֫:I

.field public ᩳ֫:Ljava/util/Stack;

.field public ᩶:I

.field public ᩸:I

.field public ᩹:[I

.field public ᩺:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1075
    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    iput-object v0, p0, Ll/ۤۨۡ;->ᩳ֫:Ljava/util/Stack;

    const/4 v0, 0x0

    .line 1095
    iput-boolean v0, p0, Ll/ۤۨۡ;->᩺:Z

    .line 1099
    new-instance v0, Ll/۬ۨۡ;

    invoke-direct {v0}, Ll/۬ۨۡ;-><init>()V

    iput-object v0, p0, Ll/ۤۨۡ;->ۨ:Ll/۬ۨۡ;

    .line 53
    invoke-direct {p0}, Ll/ۤۨۡ;->᩵()V

    return-void
.end method

.method private final ֫(Ljava/lang/String;Ljava/lang/String;)I
    .locals 4

    .line 841
    iget-object v0, p0, Ll/ۤۨۡ;->֫֫:Ll/۫᩻ܽ;

    const/4 v1, -0x1

    if-eqz v0, :cond_5

    if-nez p2, :cond_0

    goto :goto_2

    .line 844
    :cond_0
    check-cast v0, Ll/᩷ܿܽ;

    invoke-virtual {v0, p2}, Ll/᩷ܿܽ;->֫(Ljava/lang/String;)I

    move-result p2

    if-ne p2, v1, :cond_1

    return v1

    :cond_1
    if-eqz p1, :cond_2

    .line 849
    iget-object v0, p0, Ll/ۤۨۡ;->֫֫:Ll/۫᩻ܽ;

    check-cast v0, Ll/᩷ܿܽ;

    invoke-virtual {v0, p1}, Ll/᩷ܿܽ;->֫(Ljava/lang/String;)I

    move-result p1

    goto :goto_0

    :cond_2
    const/4 p1, -0x1

    :goto_0
    const/4 v0, 0x0

    .line 851
    :goto_1
    iget-object v2, p0, Ll/ۤۨۡ;->᩹:[I

    array-length v3, v2

    if-eq v0, v3, :cond_5

    add-int/lit8 v3, v0, 0x1

    .line 852
    aget v3, v2, v3

    if-ne p2, v3, :cond_4

    if-eq p1, v1, :cond_3

    aget v2, v2, v0

    if-ne p1, v2, :cond_4

    .line 854
    :cond_3
    div-int/lit8 v0, v0, 0x5

    return v0

    :cond_4
    add-int/lit8 v0, v0, 0x5

    goto :goto_1

    :cond_5
    :goto_2
    return v1
.end method

.method private ۘ()V
    .locals 15

    .line 888
    iget-object v0, p0, Ll/ۤۨۡ;->֫֫:Ll/۫᩻ܽ;

    const/16 v1, 0x180

    iget-object v2, p0, Ll/ۤۨۡ;->ۨ:Ll/۬ۨۡ;

    const/4 v3, 0x3

    const/4 v4, 0x1

    if-nez v0, :cond_1

    .line 889
    iget-object v0, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    invoke-static {v0}, Ll/֫ᩳܽ;->ۧ(Ll/۬ۜܽ;)Ll/֫ᩳܽ;

    move-result-object v0

    invoke-virtual {v0, v3}, Ll/֫ᩳܽ;->֫(I)V

    .line 890
    iget-object v0, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    invoke-virtual {v0}, Ll/۬ۜܽ;->ᩳ()I

    move-result v0

    if-ne v0, v1, :cond_0

    .line 891
    invoke-direct {p0}, Ll/ۤۨۡ;->ᩴ()V

    .line 893
    :cond_0
    iget-object v0, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    invoke-static {v0}, Ll/ۢۜܽ;->֫(Ll/۬ۜܽ;)Ll/ۢۜܽ;

    move-result-object v0

    iput-object v0, p0, Ll/ۤۨۡ;->֫֫:Ll/۫᩻ܽ;

    .line 894
    invoke-virtual {v2}, Ll/۬ۨۡ;->ܽ()V

    .line 895
    iput-boolean v4, p0, Ll/ۤۨۡ;->᩺:Z

    .line 898
    :cond_1
    iget v0, p0, Ll/ۤۨۡ;->ۗ:I

    if-ne v0, v4, :cond_2

    return-void

    .line 903
    :cond_2
    invoke-direct {p0}, Ll/ۤۨۡ;->᩵()V

    .line 905
    :goto_0
    iget-boolean v5, p0, Ll/ۤۨۡ;->ۙ:Z

    const/4 v6, 0x0

    if-eqz v5, :cond_3

    .line 906
    iput-boolean v6, p0, Ll/ۤۨۡ;->ۙ:Z

    .line 907
    invoke-virtual {v2}, Ll/۬ۨۡ;->֫()V

    :cond_3
    if-ne v0, v3, :cond_4

    .line 911
    iget v5, p0, Ll/ۤۨۡ;->ܽ֫:I

    if-nez v5, :cond_4

    .line 912
    iput v4, p0, Ll/ۤۨۡ;->ۗ:I

    return-void

    .line 917
    :cond_4
    iget-object v5, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    invoke-virtual {v5}, Ll/۬ۜܽ;->available()J

    move-result-wide v7

    const-wide/16 v9, 0x8

    iget-object v5, p0, Ll/ۤۨۡ;->ᩳ֫:Ljava/util/Stack;

    cmp-long v11, v7, v9

    if-gez v11, :cond_6

    .line 918
    invoke-virtual {v5}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 919
    iput v4, p0, Ll/ۤۨۡ;->ۗ:I

    return-void

    .line 921
    :cond_5
    invoke-virtual {v5}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫ۨۡ;

    .line 922
    iget v1, v0, Ll/۫ۨۡ;->ۧ:I

    iput v1, p0, Ll/ۤۨۡ;->ۛ:I

    .line 923
    iget v0, v0, Ll/۫ۨۡ;->֫:I

    iput v0, p0, Ll/ۤۨۡ;->ۤ:I

    .line 924
    iput v3, p0, Ll/ۤۨۡ;->ۗ:I

    .line 925
    iput-boolean v4, p0, Ll/ۤۨۡ;->ۙ:Z

    .line 926
    iget v0, p0, Ll/ۤۨۡ;->ܽ֫:I

    sub-int/2addr v0, v4

    iput v0, p0, Ll/ۤۨۡ;->ܽ֫:I

    return-void

    .line 930
    :cond_6
    iget-object v7, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    invoke-static {v7}, Ll/֫ᩳܽ;->ۧ(Ll/۬ۜܽ;)Ll/֫ᩳܽ;

    move-result-object v7

    iget v8, v7, Ll/֫ᩳܽ;->ܽ:I

    .line 933
    iget-short v9, v7, Ll/֫ᩳܽ;->ᩳ:S

    if-ne v9, v1, :cond_7

    .line 934
    iget-object v5, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    int-to-long v6, v8

    invoke-virtual {v5, v6, v7}, Ll/۬ۜܽ;->seek(J)V

    .line 935
    invoke-direct {p0}, Ll/ۤۨۡ;->ᩴ()V

    goto :goto_0

    :cond_7
    const/16 v10, 0x102

    const/4 v11, -0x1

    if-ne v9, v10, :cond_8

    if-ne v0, v11, :cond_8

    .line 941
    iput v6, p0, Ll/ۤۨۡ;->ۗ:I

    .line 942
    iget-object v0, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    int-to-long v1, v8

    invoke-virtual {v0, v1, v2}, Ll/۬ۜܽ;->seek(J)V

    return-void

    .line 947
    :cond_8
    iget-object v9, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    invoke-virtual {v9}, Ll/۬ۜܽ;->readInt()I

    move-result v9

    .line 949
    iget-object v12, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    .line 84
    iget v13, v7, Ll/֫ᩳܽ;->ۧ:I

    add-int/2addr v8, v13

    int-to-long v13, v8

    invoke-virtual {v12, v13, v14}, Ll/۬ۜܽ;->seek(J)V

    .line 952
    :goto_1
    iget-short v8, v7, Ll/֫ᩳܽ;->ᩳ:S

    const/16 v12, 0x100

    const/4 v13, 0x4

    if-lt v8, v12, :cond_15

    const/16 v14, 0x104

    if-le v8, v14, :cond_9

    goto/16 :goto_6

    :cond_9
    if-ne v8, v12, :cond_a

    .line 966
    iget-object v5, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    invoke-virtual {v5}, Ll/۬ۜܽ;->readInt()I

    move-result v5

    .line 967
    iget-object v6, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    invoke-virtual {v6}, Ll/۬ۜܽ;->readInt()I

    move-result v6

    .line 968
    invoke-virtual {v2, v5, v6}, Ll/۬ۨۡ;->֫(II)V

    .line 969
    iget-object v5, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    invoke-virtual {v7, v5}, Ll/֫ᩳܽ;->֫(Ll/۬ۜܽ;)V

    goto/16 :goto_0

    :cond_a
    const/16 v12, 0x101

    if-ne v8, v12, :cond_b

    .line 974
    iget-object v5, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    .line 89
    invoke-virtual {v5, v13}, Ll/۬ۜܽ;->skipBytes(I)V

    .line 975
    iget-object v5, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    .line 89
    invoke-virtual {v5, v13}, Ll/۬ۜܽ;->skipBytes(I)V

    .line 976
    invoke-virtual {v2}, Ll/۬ۨۡ;->ᩳ()V

    .line 977
    iget-object v5, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    invoke-virtual {v7, v5}, Ll/֫ᩳܽ;->֫(Ll/۬ۜܽ;)V

    goto/16 :goto_0

    .line 981
    :cond_b
    iput v9, p0, Ll/ۤۨۡ;->۫:I

    if-ne v8, v10, :cond_13

    .line 985
    iget-object v0, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    iput v0, p0, Ll/ۤۨۡ;->ۛ:I

    .line 987
    iget-object v0, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    iput v0, p0, Ll/ۤۨۡ;->ۤ:I

    .line 989
    new-instance v1, Ll/۫ۨۡ;

    iget v8, p0, Ll/ۤۨۡ;->ۛ:I

    invoke-direct {v1, v8, v0}, Ll/۫ۨۡ;-><init>(II)V

    .line 990
    invoke-virtual {v5, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 992
    iget-object v0, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    invoke-virtual {v0}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v0

    .line 993
    iget-object v1, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    invoke-virtual {v1}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v1

    .line 995
    iget-object v5, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    invoke-virtual {v5}, Ll/۬ۜܽ;->readInt()I

    move-result v5

    ushr-int/lit8 v8, v5, 0x10

    sub-int/2addr v8, v4

    .line 997
    iput v8, p0, Ll/ۤۨۡ;->۬:I

    const v8, 0xffff

    and-int/2addr v5, v8

    .line 1004
    iget-object v9, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    invoke-virtual {v9}, Ll/۬ۜܽ;->readInt()I

    move-result v9

    ushr-int/lit8 v10, v9, 0x10

    sub-int/2addr v10, v4

    .line 1005
    iput v10, p0, Ll/ۤۨۡ;->ۧ֫:I

    and-int/2addr v8, v9

    sub-int/2addr v8, v4

    .line 1006
    iput v8, p0, Ll/ۤۨۡ;->᩶:I

    const/16 v8, 0x14

    if-le v0, v8, :cond_c

    .line 1008
    iget-object v9, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    sub-int/2addr v0, v8

    invoke-virtual {v9, v0}, Ll/۬ۜܽ;->skipBytes(I)V

    .line 1011
    :cond_c
    iget-object v0, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    invoke-virtual {v0}, Ll/۬ۜܽ;->֫()I

    move-result v0

    iput v0, p0, Ll/ۤۨۡ;->᩸:I

    const/4 v0, 0x5

    if-gt v1, v8, :cond_e

    .line 1013
    iget-object v0, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    mul-int/lit8 v5, v5, 0x5

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    new-array v1, v5, [I

    const/4 v8, 0x0

    :goto_2
    if-ge v8, v5, :cond_d

    .line 206
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v9

    aput v9, v1, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 1013
    :cond_d
    iput-object v1, p0, Ll/ۤۨۡ;->᩹:[I

    goto :goto_5

    :cond_e
    mul-int/lit8 v8, v5, 0x5

    .line 1016
    new-array v8, v8, [I

    iput-object v8, p0, Ll/ۤۨۡ;->᩹:[I

    const/4 v8, 0x0

    :goto_3
    if-lez v5, :cond_10

    const/4 v9, 0x0

    :goto_4
    if-ge v9, v0, :cond_f

    .line 1019
    iget-object v10, p0, Ll/ۤۨۡ;->᩹:[I

    add-int/lit8 v12, v8, 0x1

    iget-object v13, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    invoke-virtual {v13}, Ll/۬ۜܽ;->readInt()I

    move-result v13

    aput v13, v10, v8

    add-int/lit8 v9, v9, 0x1

    move v8, v12

    goto :goto_4

    .line 1021
    :cond_f
    iget-object v9, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    add-int/lit8 v10, v1, -0x14

    invoke-virtual {v9, v10}, Ll/۬ۜܽ;->skipBytes(I)V

    add-int/lit8 v5, v5, -0x1

    goto :goto_3

    .line 1027
    :cond_10
    :goto_5
    iget-object v0, p0, Ll/ۤۨۡ;->᩹:[I

    array-length v1, v0

    if-ge v6, v1, :cond_12

    add-int/lit8 v1, v6, 0x3

    .line 1029
    aget v5, v0, v1

    ushr-int/lit8 v5, v5, 0x18

    .line 1030
    aput v5, v0, v1

    if-ne v5, v3, :cond_11

    add-int/lit8 v1, v6, 0x2

    .line 1032
    aget v5, v0, v1

    if-ne v5, v11, :cond_11

    add-int/lit8 v5, v6, 0x4

    .line 1034
    aget v0, v0, v5

    if-ltz v0, :cond_11

    .line 1035
    iget-object v5, p0, Ll/ۤۨۡ;->֫֫:Ll/۫᩻ܽ;

    invoke-interface {v5}, Ll/۫᩻ܽ;->size()I

    move-result v5

    if-ge v0, v5, :cond_11

    .line 1036
    iget-object v5, p0, Ll/ۤۨۡ;->᩹:[I

    aput v0, v5, v1

    :cond_11
    add-int/lit8 v6, v6, 0x5

    goto :goto_5

    .line 1040
    :cond_12
    invoke-virtual {v2}, Ll/۬ۨۡ;->ܽ()V

    const/4 v0, 0x2

    .line 1041
    iput v0, p0, Ll/ۤۨۡ;->ۗ:I

    .line 1042
    iget v0, p0, Ll/ۤۨۡ;->ܽ֫:I

    add-int/2addr v0, v4

    iput v0, p0, Ll/ۤۨۡ;->ܽ֫:I

    .line 1043
    iget-object v0, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    invoke-virtual {v7, v0}, Ll/֫ᩳܽ;->֫(Ll/۬ۜܽ;)V

    return-void

    :cond_13
    const/16 v0, 0x103

    if-ne v8, v0, :cond_14

    .line 1046
    invoke-virtual {v5}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 1047
    iget-object v0, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    iput v0, p0, Ll/ۤۨۡ;->ۛ:I

    .line 1048
    iget-object v0, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    iput v0, p0, Ll/ۤۨۡ;->ۤ:I

    .line 1049
    iput v3, p0, Ll/ۤۨۡ;->ۗ:I

    .line 1050
    iput-boolean v4, p0, Ll/ۤۨۡ;->ۙ:Z

    .line 1051
    iget v0, p0, Ll/ۤۨۡ;->ܽ֫:I

    sub-int/2addr v0, v4

    iput v0, p0, Ll/ۤۨۡ;->ܽ֫:I

    .line 1052
    iget-object v0, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    invoke-virtual {v7, v0}, Ll/֫ᩳܽ;->֫(Ll/۬ۜܽ;)V

    return-void

    .line 1056
    :cond_14
    iget-object v0, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    iput v0, p0, Ll/ۤۨۡ;->ۤ:I

    .line 1063
    iget-object v0, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    .line 89
    invoke-virtual {v0, v13}, Ll/۬ۜܽ;->skipBytes(I)V

    .line 1065
    iget-object v0, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    .line 89
    invoke-virtual {v0, v13}, Ll/۬ۜܽ;->skipBytes(I)V

    .line 1066
    iput v13, p0, Ll/ۤۨۡ;->ۗ:I

    .line 1067
    iget-object v0, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    invoke-virtual {v7, v0}, Ll/֫ᩳܽ;->֫(Ll/۬ۜܽ;)V

    return-void

    .line 953
    :cond_15
    :goto_6
    iget v1, v7, Ll/֫ᩳܽ;->֫:I

    const/16 v8, 0x10

    if-gt v1, v8, :cond_16

    goto :goto_7

    .line 957
    :cond_16
    rem-int/lit8 v8, v1, 0x4

    rsub-int/lit8 v8, v8, 0x4

    rem-int/2addr v8, v13

    add-int/2addr v8, v1

    .line 959
    :goto_7
    iget-object v1, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    iget v7, v7, Ll/֫ᩳܽ;->ܽ:I

    add-int/2addr v7, v8

    int-to-long v7, v7

    invoke-virtual {v1, v7, v8}, Ll/۬ۜܽ;->seek(J)V

    .line 960
    iget-object v1, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    invoke-static {v1}, Ll/֫ᩳܽ;->ۧ(Ll/۬ۜܽ;)Ll/֫ᩳܽ;

    move-result-object v7

    .line 961
    iget-object v1, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    invoke-virtual {v1}, Ll/۬ۜܽ;->readInt()I

    move-result v9

    .line 962
    iget-object v1, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    .line 89
    invoke-virtual {v1, v13}, Ll/۬ۜܽ;->skipBytes(I)V

    const/16 v1, 0x180

    goto/16 :goto_1
.end method

.method private final ܺ(I)I
    .locals 3

    .line 830
    iget v0, p0, Ll/ۤۨۡ;->ۗ:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    mul-int/lit8 v0, p1, 0x5

    .line 834
    iget-object v1, p0, Ll/ۤۨۡ;->᩹:[I

    array-length v1, v1

    if-ge v0, v1, :cond_0

    return v0

    .line 835
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "Invalid attribute index ("

    const-string v2, ")."

    .line 0
    invoke-static {p1, v1, v2}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 835
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 831
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "Current event is not START_TAG."

    invoke-direct {p1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ᩴ()V
    .locals 6

    .line 874
    iget-object v0, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    invoke-static {v0}, Ll/֫ᩳܽ;->ۧ(Ll/۬ۜܽ;)Ll/֫ᩳܽ;

    move-result-object v0

    .line 875
    iget v1, v0, Ll/֫ᩳܽ;->֫:I

    iget v2, v0, Ll/֫ᩳܽ;->ۧ:I

    sub-int/2addr v1, v2

    .line 876
    rem-int/lit8 v3, v1, 0x4

    if-nez v3, :cond_1

    .line 879
    iget-object v3, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    .line 84
    iget v4, v0, Ll/֫ᩳܽ;->ܽ:I

    add-int/2addr v4, v2

    int-to-long v4, v4

    invoke-virtual {v3, v4, v5}, Ll/۬ۜܽ;->seek(J)V

    .line 880
    iget-object v2, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    div-int/lit8 v1, v1, 0x4

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    new-array v3, v1, [I

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_0

    .line 206
    invoke-virtual {v2}, Ll/۬ۜܽ;->readInt()I

    move-result v5

    aput v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 880
    :cond_0
    iput-object v3, p0, Ll/ۤۨۡ;->۟:[I

    .line 881
    iget-object v1, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    invoke-virtual {v0, v1}, Ll/֫ᩳܽ;->֫(Ll/۬ۜܽ;)V

    return-void

    .line 877
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid resource ids size."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final ᩵()V
    .locals 2

    const/4 v0, -0x1

    .line 861
    iput v0, p0, Ll/ۤۨۡ;->ۗ:I

    .line 862
    iput v0, p0, Ll/ۤۨۡ;->۫:I

    .line 863
    iput v0, p0, Ll/ۤۨۡ;->ۤ:I

    .line 864
    iput v0, p0, Ll/ۤۨۡ;->ۛ:I

    const/4 v1, 0x0

    .line 865
    iput-object v1, p0, Ll/ۤۨۡ;->᩹:[I

    .line 866
    iput v0, p0, Ll/ۤۨۡ;->۬:I

    .line 867
    iput v0, p0, Ll/ۤۨۡ;->᩶:I

    .line 868
    iput v0, p0, Ll/ۤۨۡ;->ۧ֫:I

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 65
    iget-boolean v0, p0, Ll/ۤۨۡ;->᩺:Z

    if-nez v0, :cond_0

    return-void

    .line 68
    :cond_0
    iget-object v0, p0, Ll/ۤۨۡ;->ᩳ֫:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    const/4 v0, 0x0

    .line 69
    iput-boolean v0, p0, Ll/ۤۨۡ;->᩺:Z

    const/4 v1, 0x0

    .line 70
    iput-object v1, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    .line 71
    iput-object v1, p0, Ll/ۤۨۡ;->֫֫:Ll/۫᩻ܽ;

    .line 72
    iput-object v1, p0, Ll/ۤۨۡ;->۟:[I

    .line 73
    iget-object v1, p0, Ll/ۤۨۡ;->ۨ:Ll/۬ۨۡ;

    invoke-virtual {v1}, Ll/۬ۨۡ;->ܿ()V

    .line 74
    iput v0, p0, Ll/ۤۨۡ;->ܽ֫:I

    .line 75
    invoke-direct {p0}, Ll/ۤۨۡ;->᩵()V

    return-void
.end method

.method public final defineEntityReplacementText(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 520
    new-instance p1, Lorg/xmlpull/v1/XmlPullParserException;

    const-string p2, "Method is not supported."

    invoke-direct {p1, p2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getAttributeBooleanValue(IZ)Z
    .locals 0

    .line 391
    invoke-virtual {p0, p1, p2}, Ll/ۤۨۡ;->getAttributeIntValue(II)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final getAttributeBooleanValue(Ljava/lang/String;Ljava/lang/String;Z)Z
    .locals 0

    .line 436
    invoke-direct {p0, p1, p2}, Ll/ۤۨۡ;->֫(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    return p3

    .line 440
    :cond_0
    invoke-virtual {p0, p1, p3}, Ll/ۤۨۡ;->getAttributeBooleanValue(IZ)Z

    move-result p1

    return p1
.end method

.method public final getAttributeCount()I
    .locals 2

    .line 286
    iget v0, p0, Ll/ۤۨۡ;->ۗ:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v0, -0x1

    return v0

    .line 289
    :cond_0
    iget-object v0, p0, Ll/ۤۨۡ;->᩹:[I

    array-length v0, v0

    div-int/lit8 v0, v0, 0x5

    return v0
.end method

.method public final getAttributeFloatValue(IF)F
    .locals 3

    .line 395
    invoke-direct {p0, p1}, Ll/ۤۨۡ;->ܺ(I)I

    move-result p1

    .line 396
    iget-object v0, p0, Ll/ۤۨۡ;->᩹:[I

    add-int/lit8 v1, p1, 0x3

    aget v1, v0, v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    add-int/2addr p1, v2

    .line 398
    aget p1, v0, p1

    .line 399
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    return p1

    :cond_0
    return p2
.end method

.method public final getAttributeFloatValue(Ljava/lang/String;Ljava/lang/String;F)F
    .locals 0

    .line 444
    invoke-direct {p0, p1, p2}, Ll/ۤۨۡ;->֫(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    return p3

    .line 448
    :cond_0
    invoke-virtual {p0, p1, p3}, Ll/ۤۨۡ;->getAttributeFloatValue(IF)F

    move-result p1

    return p1
.end method

.method public final getAttributeIntValue(II)I
    .locals 3

    .line 405
    invoke-direct {p0, p1}, Ll/ۤۨۡ;->ܺ(I)I

    move-result p1

    .line 406
    iget-object v0, p0, Ll/ۤۨۡ;->᩹:[I

    add-int/lit8 v1, p1, 0x3

    aget v1, v0, v1

    const/16 v2, 0x10

    if-lt v1, v2, :cond_0

    const/16 v2, 0x1f

    if-gt v1, v2, :cond_0

    add-int/lit8 p1, p1, 0x4

    .line 409
    aget p1, v0, p1

    return p1

    :cond_0
    return p2
.end method

.method public final getAttributeIntValue(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 0

    .line 452
    invoke-direct {p0, p1, p2}, Ll/ۤۨۡ;->֫(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    return p3

    .line 456
    :cond_0
    invoke-virtual {p0, p1, p3}, Ll/ۤۨۡ;->getAttributeIntValue(II)I

    move-result p1

    return p1
.end method

.method public final getAttributeListValue(I[Ljava/lang/String;I)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final getAttributeListValue(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final getAttributeName(I)Ljava/lang/String;
    .locals 1

    .line 323
    invoke-direct {p0, p1}, Ll/ۤۨۡ;->ܺ(I)I

    move-result p1

    .line 324
    iget-object v0, p0, Ll/ۤۨۡ;->᩹:[I

    add-int/lit8 p1, p1, 0x1

    aget p1, v0, p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const-string p1, ""

    return-object p1

    .line 328
    :cond_0
    iget-object v0, p0, Ll/ۤۨۡ;->֫֫:Ll/۫᩻ܽ;

    check-cast v0, Ll/᩷ܿܽ;

    invoke-virtual {v0, p1}, Ll/᩷ܿܽ;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getAttributeNameResource(I)I
    .locals 2

    .line 341
    invoke-direct {p0, p1}, Ll/ۤۨۡ;->ܺ(I)I

    move-result p1

    .line 342
    iget-object v0, p0, Ll/ۤۨۡ;->᩹:[I

    add-int/lit8 p1, p1, 0x1

    aget p1, v0, p1

    .line 343
    iget-object v0, p0, Ll/ۤۨۡ;->۟:[I

    if-eqz v0, :cond_1

    if-ltz p1, :cond_1

    array-length v1, v0

    if-lt p1, v1, :cond_0

    goto :goto_0

    .line 347
    :cond_0
    aget p1, v0, p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final getAttributeNamespace(I)Ljava/lang/String;
    .locals 1

    .line 293
    invoke-direct {p0, p1}, Ll/ۤۨۡ;->ܺ(I)I

    move-result p1

    .line 294
    iget-object v0, p0, Ll/ۤۨۡ;->᩹:[I

    aget p1, v0, p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const-string p1, ""

    return-object p1

    .line 298
    :cond_0
    iget-object v0, p0, Ll/ۤۨۡ;->֫֫:Ll/۫᩻ܽ;

    check-cast v0, Ll/᩷ܿܽ;

    invoke-virtual {v0, p1}, Ll/᩷ܿܽ;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getAttributePrefix(I)Ljava/lang/String;
    .locals 1

    .line 307
    invoke-direct {p0, p1}, Ll/ۤۨۡ;->ܺ(I)I

    move-result p1

    .line 308
    iget-object v0, p0, Ll/ۤۨۡ;->᩹:[I

    aget p1, v0, p1

    .line 309
    iget-object v0, p0, Ll/ۤۨۡ;->ۨ:Ll/۬ۨۡ;

    invoke-virtual {v0, p1}, Ll/۬ۨۡ;->֫(I)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const-string p1, ""

    return-object p1

    .line 313
    :cond_0
    iget-object v0, p0, Ll/ۤۨۡ;->֫֫:Ll/۫᩻ܽ;

    check-cast v0, Ll/᩷ܿܽ;

    invoke-virtual {v0, p1}, Ll/᩷ܿܽ;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getAttributeResourceValue(II)I
    .locals 3

    .line 419
    invoke-direct {p0, p1}, Ll/ۤۨۡ;->ܺ(I)I

    move-result p1

    .line 420
    iget-object v0, p0, Ll/ۤۨۡ;->᩹:[I

    add-int/lit8 v1, p1, 0x3

    aget v1, v0, v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    add-int/lit8 p1, p1, 0x4

    .line 422
    aget p1, v0, p1

    return p1

    :cond_0
    return p2
.end method

.method public final getAttributeResourceValue(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 0

    .line 468
    invoke-direct {p0, p1, p2}, Ll/ۤۨۡ;->֫(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    return p3

    .line 472
    :cond_0
    invoke-virtual {p0, p1, p3}, Ll/ۤۨۡ;->getAttributeResourceValue(II)I

    move-result p1

    return p1
.end method

.method public final getAttributeType(I)Ljava/lang/String;
    .locals 0

    const-string p1, "CDATA"

    return-object p1
.end method

.method public final getAttributeUnsignedIntValue(II)I
    .locals 0

    .line 415
    invoke-virtual {p0, p1, p2}, Ll/ۤۨۡ;->getAttributeIntValue(II)I

    move-result p1

    return p1
.end method

.method public final getAttributeUnsignedIntValue(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 0

    .line 460
    invoke-direct {p0, p1, p2}, Ll/ۤۨۡ;->֫(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    return p3

    .line 415
    :cond_0
    invoke-virtual {p0, p1, p3}, Ll/ۤۨۡ;->getAttributeIntValue(II)I

    move-result p1

    return p1
.end method

.method public final getAttributeValue(I)Ljava/lang/String;
    .locals 3

    .line 380
    invoke-direct {p0, p1}, Ll/ۤۨۡ;->ܺ(I)I

    move-result p1

    .line 381
    iget-object v0, p0, Ll/ۤۨۡ;->᩹:[I

    add-int/lit8 v1, p1, 0x3

    aget v1, v0, v1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    add-int/lit8 p1, p1, 0x2

    .line 383
    aget p1, v0, p1

    .line 384
    iget-object v0, p0, Ll/ۤۨۡ;->֫֫:Ll/۫᩻ܽ;

    check-cast v0, Ll/᩷ܿܽ;

    invoke-virtual {v0, p1}, Ll/᩷ܿܽ;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, ""

    return-object p1
.end method

.method public final getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 428
    invoke-direct {p0, p1, p2}, Ll/ۤۨۡ;->֫(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 432
    :cond_0
    invoke-virtual {p0, p1}, Ll/ۤۨۡ;->getAttributeValue(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getClassAttribute()Ljava/lang/String;
    .locals 2

    .line 248
    iget v0, p0, Ll/ۤۨۡ;->᩶:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 251
    :cond_0
    invoke-direct {p0, v0}, Ll/ۤۨۡ;->ܺ(I)I

    move-result v0

    .line 252
    iget-object v1, p0, Ll/ۤۨۡ;->᩹:[I

    add-int/lit8 v0, v0, 0x2

    aget v0, v1, v0

    .line 253
    iget-object v1, p0, Ll/ۤۨۡ;->֫֫:Ll/۫᩻ܽ;

    check-cast v1, Ll/᩷ܿܽ;

    invoke-virtual {v1, v0}, Ll/᩷ܿܽ;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getColumnNumber()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public final getDepth()I
    .locals 1

    .line 152
    iget-object v0, p0, Ll/ۤۨۡ;->ۨ:Ll/۬ۨۡ;

    invoke-virtual {v0}, Ll/۬ۨۡ;->ۧ()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public final getEventType()I
    .locals 1

    .line 156
    iget v0, p0, Ll/ۤۨۡ;->ۗ:I

    return v0
.end method

.method public final getFeature(Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final getIdAttribute()Ljava/lang/String;
    .locals 2

    .line 257
    iget v0, p0, Ll/ۤۨۡ;->۬:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 260
    :cond_0
    invoke-direct {p0, v0}, Ll/ۤۨۡ;->ܺ(I)I

    move-result v0

    .line 261
    iget-object v1, p0, Ll/ۤۨۡ;->᩹:[I

    add-int/lit8 v0, v0, 0x2

    aget v0, v1, v0

    .line 262
    iget-object v1, p0, Ll/ۤۨۡ;->֫֫:Ll/۫᩻ܽ;

    check-cast v1, Ll/᩷ܿܽ;

    invoke-virtual {v1, v0}, Ll/᩷ܿܽ;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getIdAttributeResourceValue(I)I
    .locals 4

    .line 266
    iget v0, p0, Ll/ۤۨۡ;->۬:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 269
    :cond_0
    invoke-direct {p0, v0}, Ll/ۤۨۡ;->ܺ(I)I

    move-result v0

    .line 270
    iget-object v1, p0, Ll/ۤۨۡ;->᩹:[I

    add-int/lit8 v2, v0, 0x3

    aget v2, v1, v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    :goto_0
    return p1

    :cond_1
    add-int/lit8 v0, v0, 0x4

    .line 274
    aget p1, v1, v0

    return p1
.end method

.method public final getInputEncoding()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getLineNumber()I
    .locals 1

    .line 160
    iget v0, p0, Ll/ۤۨۡ;->۫:I

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 3

    .line 164
    iget v0, p0, Ll/ۤۨۡ;->ۤ:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    iget v1, p0, Ll/ۤۨۡ;->ۗ:I

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    const/4 v2, 0x3

    if-eq v1, v2, :cond_0

    goto :goto_0

    .line 167
    :cond_0
    iget-object v1, p0, Ll/ۤۨۡ;->֫֫:Ll/۫᩻ܽ;

    check-cast v1, Ll/᩷ܿܽ;

    invoke-virtual {v1, v0}, Ll/᩷ܿܽ;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getNamespace()Ljava/lang/String;
    .locals 2

    .line 202
    iget v0, p0, Ll/ۤۨۡ;->ۛ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 205
    :cond_0
    iget-object v1, p0, Ll/ۤۨۡ;->֫֫:Ll/۫᩻ܽ;

    check-cast v1, Ll/᩷ܿܽ;

    invoke-virtual {v1, v0}, Ll/᩷ܿܽ;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getNamespace(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 524
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Method is not supported."

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getNamespaceCount(I)I
    .locals 1

    .line 225
    iget-object v0, p0, Ll/ۤۨۡ;->ۨ:Ll/۬ۨۡ;

    invoke-virtual {v0, p1}, Ll/۬ۨۡ;->ۧ(I)I

    move-result p1

    return p1
.end method

.method public final getNamespacePrefix(I)Ljava/lang/String;
    .locals 1

    .line 229
    iget-object v0, p0, Ll/ۤۨۡ;->ۨ:Ll/۬ۨۡ;

    invoke-virtual {v0, p1}, Ll/۬ۨۡ;->ܽ(I)I

    move-result p1

    .line 230
    iget-object v0, p0, Ll/ۤۨۡ;->֫֫:Ll/۫᩻ܽ;

    check-cast v0, Ll/᩷ܿܽ;

    invoke-virtual {v0, p1}, Ll/᩷ܿܽ;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getNamespaceUri(I)Ljava/lang/String;
    .locals 1

    .line 238
    iget-object v0, p0, Ll/ۤۨۡ;->ۨ:Ll/۬ۨۡ;

    invoke-virtual {v0, p1}, Ll/۬ۨۡ;->ᩳ(I)I

    move-result p1

    .line 239
    iget-object v0, p0, Ll/ۤۨۡ;->֫֫:Ll/۫᩻ܽ;

    check-cast v0, Ll/᩷ܿܽ;

    invoke-virtual {v0, p1}, Ll/᩷ܿܽ;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getPositionDescription()Ljava/lang/String;
    .locals 2

    .line 221
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "XML line #"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 160
    iget v1, p0, Ll/ۤۨۡ;->۫:I

    .line 221
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getPrefix()Ljava/lang/String;
    .locals 2

    .line 209
    iget-object v0, p0, Ll/ۤۨۡ;->ۨ:Ll/۬ۨۡ;

    iget v1, p0, Ll/ۤۨۡ;->ۛ:I

    invoke-virtual {v0, v1}, Ll/۬ۨۡ;->֫(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 213
    :cond_0
    iget-object v1, p0, Ll/ۤۨۡ;->֫֫:Ll/۫᩻ܽ;

    check-cast v1, Ll/᩷ܿܽ;

    invoke-virtual {v1, v0}, Ll/᩷ܿܽ;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getProperty(Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final getStyleAttribute()I
    .locals 2

    .line 278
    iget v0, p0, Ll/ۤۨۡ;->ۧ֫:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    .line 281
    :cond_0
    invoke-direct {p0, v0}, Ll/ۤۨۡ;->ܺ(I)I

    move-result v0

    .line 282
    iget-object v1, p0, Ll/ۤۨۡ;->᩹:[I

    add-int/lit8 v0, v0, 0x4

    aget v0, v1, v0

    return v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 3

    .line 183
    iget v0, p0, Ll/ۤۨۡ;->ۤ:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    iget v1, p0, Ll/ۤۨۡ;->ۗ:I

    const/4 v2, 0x4

    if-eq v1, v2, :cond_0

    goto :goto_0

    .line 186
    :cond_0
    iget-object v1, p0, Ll/ۤۨۡ;->֫֫:Ll/۫᩻ܽ;

    check-cast v1, Ll/᩷ܿܽ;

    invoke-virtual {v1, v0}, Ll/᩷ܿܽ;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getTextCharacters([I)[C
    .locals 4

    .line 190
    invoke-virtual {p0}, Ll/ۤۨۡ;->getText()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const/4 v1, 0x0

    .line 194
    aput v1, p1, v1

    const/4 v2, 0x1

    .line 195
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    aput v3, p1, v2

    .line 196
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p1

    new-array p1, p1, [C

    .line 197
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v0, v1, v2, p1, v1}, Ljava/lang/String;->getChars(II[CI)V

    return-object p1
.end method

.method public final isAttributeDefault(I)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final isEmptyElementTag()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final isWhitespace()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final next()I
    .locals 3

    .line 81
    iget-object v0, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    if-eqz v0, :cond_0

    .line 85
    :try_start_0
    invoke-direct {p0}, Ll/ۤۨۡ;->ۘ()V

    .line 86
    iget v0, p0, Ll/ۤۨۡ;->ۗ:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    .line 88
    invoke-virtual {p0}, Ll/ۤۨۡ;->close()V

    .line 89
    throw v0

    .line 82
    :cond_0
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v1, "Parser is not opened."

    const/4 v2, 0x0

    invoke-direct {v0, v1, p0, v2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final nextTag()I
    .locals 3

    .line 114
    invoke-virtual {p0}, Ll/ۤۨۡ;->next()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 119
    :cond_0
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v1, "Expected start or end tag."

    const/4 v2, 0x0

    invoke-direct {v0, v1, p0, v2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    :goto_0
    return v0
.end method

.method public final nextText()Ljava/lang/String;
    .locals 4

    .line 156
    iget v0, p0, Ll/ۤۨۡ;->ۗ:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-ne v0, v1, :cond_3

    .line 128
    invoke-virtual {p0}, Ll/ۤۨۡ;->next()I

    move-result v0

    const/4 v1, 0x4

    const/4 v3, 0x3

    if-ne v0, v1, :cond_1

    .line 130
    invoke-virtual {p0}, Ll/ۤۨۡ;->getText()Ljava/lang/String;

    move-result-object v0

    .line 131
    invoke-virtual {p0}, Ll/ۤۨۡ;->next()I

    move-result v1

    if-ne v1, v3, :cond_0

    return-object v0

    .line 133
    :cond_0
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v1, "Event TEXT must be immediately followed by END_TAG."

    invoke-direct {v0, v1, p0, v2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    if-ne v0, v3, :cond_2

    const-string v0, ""

    return-object v0

    .line 139
    :cond_2
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v1, "Parser must be on START_TAG or TEXT to read text."

    invoke-direct {v0, v1, p0, v2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/Throwable;)V

    throw v0

    .line 126
    :cond_3
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v1, "Parser must be on START_TAG to read next text."

    invoke-direct {v0, v1, p0, v2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final nextToken()I
    .locals 1

    .line 110
    invoke-virtual {p0}, Ll/ۤۨۡ;->next()I

    move-result v0

    return v0
.end method

.method public final require(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 156
    iget v0, p0, Ll/ۤۨۡ;->ۗ:I

    if-ne p1, v0, :cond_2

    if-eqz p2, :cond_0

    .line 145
    invoke-virtual {p0}, Ll/ۤۨۡ;->getNamespace()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    :cond_0
    if-eqz p3, :cond_1

    .line 146
    invoke-virtual {p0}, Ll/ۤۨۡ;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    :cond_1
    return-void

    .line 147
    :cond_2
    new-instance p2, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v0, Landroid/content/res/XmlResourceParser;->TYPES:[Ljava/lang/String;

    aget-object p1, v0, p1

    const-string v0, " is expected."

    .line 0
    invoke-static {p3, p1, v0}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 p3, 0x0

    .line 147
    invoke-direct {p2, p1, p0, p3}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final setFeature(Ljava/lang/String;Z)V
    .locals 0

    .line 540
    new-instance p1, Lorg/xmlpull/v1/XmlPullParserException;

    const-string p2, "Method is not supported."

    invoke-direct {p1, p2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setInput(Ljava/io/InputStream;Ljava/lang/String;)V
    .locals 0

    .line 496
    new-instance p1, Lorg/xmlpull/v1/XmlPullParserException;

    const-string p2, "Method is not supported."

    invoke-direct {p1, p2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setInput(Ljava/io/Reader;)V
    .locals 1

    .line 500
    new-instance p1, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v0, "Method is not supported."

    invoke-direct {p1, v0}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 532
    new-instance p1, Lorg/xmlpull/v1/XmlPullParserException;

    const-string p2, "Method is not supported."

    invoke-direct {p1, p2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()I
    .locals 3

    .line 351
    iget-object v0, p0, Ll/ۤۨۡ;->۟:[I

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 353
    :goto_0
    iget-object v1, p0, Ll/ۤۨۡ;->۟:[I

    array-length v2, v1

    if-ge v0, v2, :cond_2

    .line 354
    aget v1, v1, v0

    const v2, 0x1010003

    if-ne v1, v2, :cond_1

    return v0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    const/4 v0, -0x1

    return v0
.end method

.method public final ֫(I)I
    .locals 1

    .line 332
    invoke-direct {p0, p1}, Ll/ۤۨۡ;->ܺ(I)I

    move-result p1

    .line 333
    iget-object v0, p0, Ll/ۤۨۡ;->᩹:[I

    add-int/lit8 p1, p1, 0x1

    aget p1, v0, p1

    return p1
.end method

.method public final ֫(Ljava/io/ByteArrayInputStream;Ll/۫᩻ܽ;)V
    .locals 1

    .line 57
    invoke-virtual {p0}, Ll/ۤۨۡ;->close()V

    .line 58
    new-instance v0, Ll/۬ۜܽ;

    invoke-direct {v0, p1}, Ll/۬ۜܽ;-><init>(Ljava/io/InputStream;)V

    iput-object v0, p0, Ll/ۤۨۡ;->ܰ:Ll/۬ۜܽ;

    .line 59
    iput-object p2, p0, Ll/ۤۨۡ;->֫֫:Ll/۫᩻ܽ;

    .line 60
    iget-object p1, p0, Ll/ۤۨۡ;->ۨ:Ll/۬ۨۡ;

    invoke-virtual {p1}, Ll/۬ۨۡ;->ܽ()V

    const/4 p1, 0x1

    .line 61
    iput-boolean p1, p0, Ll/ۤۨۡ;->᩺:Z

    return-void
.end method

.method public final ۖ()Ll/۫᩻ܽ;
    .locals 1

    .line 812
    iget-object v0, p0, Ll/ۤۨۡ;->֫֫:Ll/۫᩻ܽ;

    return-object v0
.end method

.method public final ۜ(I)I
    .locals 1

    .line 234
    iget-object v0, p0, Ll/ۤۨۡ;->ۨ:Ll/۬ۨۡ;

    invoke-virtual {v0, p1}, Ll/۬ۨۡ;->ܽ(I)I

    move-result p1

    return p1
.end method

.method public final ۜ()[I
    .locals 1

    .line 361
    iget-object v0, p0, Ll/ۤۨۡ;->۟:[I

    return-object v0
.end method

.method public final ۢ(I)Ljava/lang/String;
    .locals 1

    .line 337
    iget-object v0, p0, Ll/ۤۨۡ;->֫֫:Ll/۫᩻ܽ;

    check-cast v0, Ll/᩷ܿܽ;

    invoke-virtual {v0, p1}, Ll/᩷ܿܽ;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(I)I
    .locals 1

    .line 302
    invoke-direct {p0, p1}, Ll/ۤۨۡ;->ܺ(I)I

    move-result p1

    .line 303
    iget-object v0, p0, Ll/ۤۨۡ;->᩹:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ܳ(I)I
    .locals 1

    .line 375
    invoke-direct {p0, p1}, Ll/ۤۨۡ;->ܺ(I)I

    move-result p1

    .line 376
    iget-object v0, p0, Ll/ۤۨۡ;->᩹:[I

    add-int/lit8 p1, p1, 0x2

    aget p1, v0, p1

    return p1
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 2

    .line 171
    invoke-virtual {p0}, Ll/ۤۨۡ;->getPrefix()Ljava/lang/String;

    move-result-object v0

    .line 172
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 173
    invoke-virtual {p0}, Ll/ۤۨۡ;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v1, ":"

    .line 0
    invoke-static {v0, v1}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 175
    invoke-virtual {p0}, Ll/ۤۨۡ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ(I)I
    .locals 1

    .line 317
    invoke-direct {p0, p1}, Ll/ۤۨۡ;->ܺ(I)I

    move-result p1

    .line 318
    iget-object v0, p0, Ll/ۤۨۡ;->᩹:[I

    aget p1, v0, p1

    .line 319
    iget-object v0, p0, Ll/ۤۨۡ;->ۨ:Ll/۬ۨۡ;

    invoke-virtual {v0, p1}, Ll/۬ۨۡ;->֫(I)I

    move-result p1

    return p1
.end method

.method public final ܽ()Ll/۬ܿܽ;
    .locals 2

    .line 816
    iget-object v0, p0, Ll/ۤۨۡ;->֫֫:Ll/۫᩻ܽ;

    if-eqz v0, :cond_1

    .line 819
    instance-of v1, v0, Ll/۬ܿܽ;

    if-eqz v1, :cond_0

    check-cast v0, Ll/۬ܿܽ;

    return-object v0

    .line 822
    :cond_0
    invoke-static {v0}, Ll/۬ܿܽ;->֫(Ll/۫᩻ܽ;)Ll/۬ܿܽ;

    move-result-object v0

    .line 823
    iput-object v0, p0, Ll/ۤۨۡ;->֫֫:Ll/۫᩻ܽ;

    return-object v0

    .line 817
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 179
    iget v0, p0, Ll/ۤۨۡ;->ۤ:I

    return v0
.end method

.method public final ᩳ(I)I
    .locals 1

    .line 370
    invoke-direct {p0, p1}, Ll/ۤۨۡ;->ܺ(I)I

    move-result p1

    .line 371
    iget-object v0, p0, Ll/ۤۨۡ;->᩹:[I

    add-int/lit8 p1, p1, 0x4

    aget p1, v0, p1

    return p1
.end method

.method public final ᩷(I)I
    .locals 1

    .line 243
    iget-object v0, p0, Ll/ۤۨۡ;->ۨ:Ll/۬ۨۡ;

    invoke-virtual {v0, p1}, Ll/۬ۨۡ;->ᩳ(I)I

    move-result p1

    return p1
.end method

.method public final ᩻()I
    .locals 2

    .line 217
    iget-object v0, p0, Ll/ۤۨۡ;->ۨ:Ll/۬ۨۡ;

    iget v1, p0, Ll/ۤۨۡ;->ۛ:I

    invoke-virtual {v0, v1}, Ll/۬ۨۡ;->֫(I)I

    move-result v0

    return v0
.end method

.method public final ᩻(I)I
    .locals 1

    .line 365
    invoke-direct {p0, p1}, Ll/ۤۨۡ;->ܺ(I)I

    move-result p1

    .line 366
    iget-object v0, p0, Ll/ۤۨۡ;->᩹:[I

    add-int/lit8 p1, p1, 0x3

    aget p1, v0, p1

    return p1
.end method
