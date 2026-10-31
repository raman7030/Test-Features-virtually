.class public final Ll/ۧۢܿ;
.super Ljava/lang/Object;
.source "N6ZQ"


# instance fields
.field public final ֫:[[I

.field public final ۜ:[[I

.field public final ۡ:[I

.field public final ۢ:[I

.field public final ۧ:[I

.field public ܳ:I

.field public final ܺ:[I

.field public ܽ:[I

.field public final ܿ:[I

.field public final ᩳ:[[I

.field public ᩷:[I

.field public final ᩻:[I


# direct methods
.method public constructor <init>([I[I)V
    .locals 8

    .line 974
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v1, v0, [I

    const/4 v2, 0x1

    const/16 v3, 0x100

    aput v3, v1, v2

    const/4 v4, 0x0

    const/4 v5, 0x4

    aput v5, v1, v4

    .line 960
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v6, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [[I

    iput-object v1, p0, Ll/ۧۢܿ;->ᩳ:[[I

    new-array v1, v0, [I

    const/16 v7, 0x101

    aput v7, v1, v2

    aput v5, v1, v4

    .line 961
    invoke-static {v6, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [[I

    iput-object v1, p0, Ll/ۧۢܿ;->֫:[[I

    new-array v0, v0, [I

    aput v3, v0, v2

    aput v5, v0, v4

    .line 962
    invoke-static {v6, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[I

    iput-object v0, p0, Ll/ۧۢܿ;->ۜ:[[I

    new-array v0, v5, [I

    .line 963
    iput-object v0, p0, Ll/ۧۢܿ;->᩻:[I

    new-array v0, v5, [I

    .line 964
    iput-object v0, p0, Ll/ۧۢܿ;->ܺ:[I

    new-array v0, v5, [I

    .line 965
    iput-object v0, p0, Ll/ۧۢܿ;->ۡ:[I

    new-array v0, v5, [I

    .line 966
    iput-object v0, p0, Ll/ۧۢܿ;->ۢ:[I

    new-array v0, v5, [I

    .line 967
    iput-object v0, p0, Ll/ۧۢܿ;->ܿ:[I

    new-array v0, v5, [I

    .line 968
    iput-object v0, p0, Ll/ۧۢܿ;->ۧ:[I

    .line 975
    invoke-virtual {p0, p1, p2}, Ll/ۧۢܿ;->֫([I[I)V

    return-void
.end method


# virtual methods
.method public final ֫([I[I)V
    .locals 1

    .line 980
    iput-object p1, p0, Ll/ۧۢܿ;->᩷:[I

    .line 981
    iput-object p2, p0, Ll/ۧۢܿ;->ܽ:[I

    const/4 p2, 0x0

    .line 982
    iput p2, p0, Ll/ۧۢܿ;->ܳ:I

    .line 983
    iget-object v0, p0, Ll/ۧۢܿ;->᩻:[I

    aput p2, v0, p2

    .line 984
    iget-object v0, p0, Ll/ۧۢܿ;->ܺ:[I

    array-length p1, p1

    aput p1, v0, p2

    .line 985
    iget-object p1, p0, Ll/ۧۢܿ;->ۡ:[I

    const/16 v0, 0x18

    aput v0, p1, p2

    .line 986
    iget-object p1, p0, Ll/ۧۢܿ;->ۢ:[I

    aput p2, p1, p2

    return-void
.end method

.method public final ֫()Z
    .locals 15

    .line 991
    iget v0, p0, Ll/ۧۢܿ;->ܳ:I

    const/4 v1, 0x1

    if-gez v0, :cond_0

    goto/16 :goto_2

    .line 993
    :cond_0
    iget-object v2, p0, Ll/ۧۢܿ;->ۢ:[I

    aget v3, v2, v0

    iget-object v4, p0, Ll/ۧۢܿ;->ܿ:[I

    iget-object v5, p0, Ll/ۧۢܿ;->ᩳ:[[I

    iget-object v6, p0, Ll/ۧۢܿ;->ܺ:[I

    iget-object v7, p0, Ll/ۧۢܿ;->᩻:[I

    const/4 v8, 0x2

    const/4 v9, 0x0

    if-eqz v3, :cond_d

    iget-object v10, p0, Ll/ۧۢܿ;->ۡ:[I

    iget-object v11, p0, Ll/ۧۢܿ;->֫:[[I

    iget-object v12, p0, Ll/ۧۢܿ;->ۧ:[I

    if-eq v3, v1, :cond_b

    iget-object v4, p0, Ll/ۧۢܿ;->ۜ:[[I

    const/4 v13, 0x3

    const/16 v14, 0x100

    if-eq v3, v8, :cond_9

    const/4 v5, 0x4

    if-eq v3, v13, :cond_5

    if-ne v3, v5, :cond_4

    .line 1073
    aget v3, v10, v0

    if-eqz v3, :cond_3

    aget v3, v12, v0

    if-lt v3, v14, :cond_1

    goto :goto_0

    :cond_1
    add-int/lit8 v4, v3, 0x1

    .line 1077
    aput v4, v12, v0

    .line 1078
    aget-object v5, v11, v0

    aget v3, v5, v3

    .line 1079
    aget v4, v5, v4

    sub-int v5, v4, v3

    if-ge v5, v8, :cond_2

    goto/16 :goto_1

    :cond_2
    add-int/lit8 v5, v0, 0x1

    .line 1081
    iput v5, p0, Ll/ۧۢܿ;->ܳ:I

    .line 1082
    aput v3, v7, v5

    .line 1083
    aput v4, v6, v5

    .line 1084
    aget v0, v10, v0

    add-int/lit8 v0, v0, -0x8

    aput v0, v10, v5

    .line 1085
    aput v9, v2, v5

    goto/16 :goto_1

    :cond_3
    :goto_0
    sub-int/2addr v0, v1

    .line 1074
    iput v0, p0, Ll/ۧۢܿ;->ܳ:I

    goto/16 :goto_1

    .line 999
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Invalid syntax context sort phase"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1048
    :cond_5
    aget v3, v12, v0

    if-lt v3, v14, :cond_6

    .line 1050
    aput v9, v12, v0

    .line 1051
    aput v5, v2, v0

    goto/16 :goto_1

    .line 1054
    :cond_6
    aget-object v2, v11, v0

    add-int/lit8 v5, v3, 0x1

    aget v2, v2, v5

    .line 1055
    aget-object v6, v4, v0

    aget v6, v6, v3

    if-lt v6, v2, :cond_7

    .line 1057
    aput v5, v12, v0

    goto/16 :goto_1

    .line 1060
    :cond_7
    iget-object v2, p0, Ll/ۧۢܿ;->ܽ:[I

    iget-object v5, p0, Ll/ۧۢܿ;->᩷:[I

    aget v5, v5, v6

    aget v2, v2, v5

    aget v5, v10, v0

    invoke-static {v2, v5}, Ll/ᩳۢܿ;->ۧ(II)I

    move-result v2

    if-ne v2, v3, :cond_8

    .line 1062
    aget-object v0, v4, v0

    add-int/2addr v6, v1

    aput v6, v0, v3

    goto/16 :goto_1

    .line 1064
    :cond_8
    aget-object v0, v4, v0

    aget v3, v0, v2

    add-int/lit8 v4, v3, 0x1

    aput v4, v0, v2

    .line 1065
    iget-object v0, p0, Ll/ۧۢܿ;->᩷:[I

    aget v2, v0, v6

    .line 1066
    aget v4, v0, v3

    aput v4, v0, v6

    .line 1067
    aput v2, v0, v3

    goto/16 :goto_1

    .line 1035
    :cond_9
    aget v3, v12, v0

    if-ge v3, v14, :cond_a

    .line 1037
    aget-object v2, v11, v0

    add-int/lit8 v6, v3, 0x1

    aget v7, v2, v3

    aget-object v5, v5, v0

    aget v5, v5, v3

    add-int/2addr v7, v5

    aput v7, v2, v6

    .line 1038
    aget-object v4, v4, v0

    aget v2, v2, v3

    aput v2, v4, v3

    .line 1039
    aput v6, v12, v0

    goto :goto_1

    .line 1042
    :cond_a
    aput v9, v12, v0

    .line 1043
    aput v13, v2, v0

    goto :goto_1

    .line 1021
    :cond_b
    aget v3, v4, v0

    .line 1022
    aget v6, v6, v0

    if-ge v3, v6, :cond_c

    .line 1023
    aget-object v2, v5, v0

    iget-object v5, p0, Ll/ۧۢܿ;->ܽ:[I

    iget-object v6, p0, Ll/ۧۢܿ;->᩷:[I

    aget v6, v6, v3

    aget v5, v5, v6

    aget v6, v10, v0

    invoke-static {v5, v6}, Ll/ᩳۢܿ;->ۧ(II)I

    move-result v5

    aget v6, v2, v5

    add-int/2addr v6, v1

    aput v6, v2, v5

    add-int/2addr v3, v1

    .line 1025
    aput v3, v4, v0

    goto :goto_1

    .line 1028
    :cond_c
    aget-object v3, v11, v0

    aget v4, v7, v0

    aput v4, v3, v9

    .line 1029
    aput v9, v12, v0

    .line 1030
    aput v8, v2, v0

    goto :goto_1

    .line 1006
    :cond_d
    aget v3, v6, v0

    aget v6, v7, v0

    sub-int v10, v3, v6

    if-ge v10, v8, :cond_e

    sub-int/2addr v0, v1

    .line 1008
    iput v0, p0, Ll/ۧۢܿ;->ܳ:I

    goto :goto_1

    :cond_e
    const/16 v8, 0x40

    if-gt v10, v8, :cond_f

    .line 1010
    iget-object v0, p0, Ll/ۧۢܿ;->᩷:[I

    iget-object v2, p0, Ll/ۧۢܿ;->ܽ:[I

    invoke-static {v6, v3, v0, v2}, Ll/ᩳۢܿ;->֫(II[I[I)V

    .line 1011
    iget v0, p0, Ll/ۧۢܿ;->ܳ:I

    sub-int/2addr v0, v1

    iput v0, p0, Ll/ۧۢܿ;->ܳ:I

    goto :goto_1

    .line 1013
    :cond_f
    aget-object v3, v5, v0

    invoke-static {v3, v9}, Ljava/util/Arrays;->fill([II)V

    .line 1014
    aget v3, v7, v0

    aput v3, v4, v0

    .line 1015
    aput v1, v2, v0

    .line 1001
    :goto_1
    iget v0, p0, Ll/ۧۢܿ;->ܳ:I

    if-gez v0, :cond_10

    :goto_2
    return v1

    :cond_10
    return v9
.end method
