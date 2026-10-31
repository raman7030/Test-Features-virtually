.class public final Ll/ۙ᩻۠;
.super Ll/᩷ۜ۠;
.source "Z5U8"


# instance fields
.field public final synthetic ܿ:Ll/᩶ۜ۠;


# direct methods
.method public constructor <init>(Ll/᩶ۜ۠;Ll/ۤܶ۠;Ll/ܽ᩻۠;Ljava/util/EnumSet;)V
    .locals 0

    .line 1083
    iput-object p1, p0, Ll/ۙ᩻۠;->ܿ:Ll/᩶ۜ۠;

    invoke-direct {p0, p1, p2, p3, p4}, Ll/᩷ۜ۠;-><init>(Ll/᩶ۜ۠;Ll/ۤܶ۠;Ll/ܽ᩻۠;Ljava/util/Set;)V

    return-void
.end method


# virtual methods
.method public final ֫(ILl/ۛ֡֨;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    .line 1089
    iget-object v2, v1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v3, Ll/֨ᩴ֨;->᩻֫:Ll/֨ᩴ֨;

    if-ne v2, v3, :cond_18

    iget-object v1, v1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v2, v1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v3, Ll/֨ᩴ֨;->۟:Ll/֨ᩴ֨;

    if-ne v2, v3, :cond_18

    .line 1090
    check-cast v1, Ll/֡֡֨;

    iget-object v2, v1, Ll/֡֡֨;->۟:Ljava/util/EnumSet;

    .line 1091
    new-instance v3, Ll/ᩴܶ۠;

    invoke-direct {v3}, Ll/ᩴܶ۠;-><init>()V

    .line 1093
    iget-object v4, v0, Ll/ۙ᩻۠;->ܿ:Ll/᩶ۜ۠;

    iget-object v5, v4, Ll/᩶ۜ۠;->۬:Ll/᩶ۢ۠;

    invoke-virtual {v4}, Ll/᩶ۜ۠;->ۧ()C

    move-result v6

    iget-object v7, v4, Ll/᩶ۜ۠;->᩹:Ll/ۛܶ۠;

    invoke-static {v7}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v8, Ll/᩻ۨۡ;

    invoke-direct {v8, v7}, Ll/᩻ۨۡ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v5, v6, v8}, Ll/᩶ۢ۠;->ۧ(ILl/۬ܶ۠;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۤܶ۠;

    .line 1094
    iget-object v6, v4, Ll/᩶ۜ۠;->᩷:Ll/֡֡֨;

    iget-object v6, v6, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    if-ne v6, v5, :cond_17

    .line 1098
    invoke-virtual {v4}, Ll/᩶ۜ۠;->ۧ()C

    move-result v5

    .line 358
    const-class v6, Ll/ᩴ֡֨;

    invoke-static {v6}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v6

    .line 359
    invoke-static {}, Ll/ᩴ֡֨;->values()[Ll/ᩴ֡֨;

    move-result-object v7

    array-length v8, v7

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v8, :cond_1

    aget-object v10, v7, v9

    .line 360
    iget v11, v10, Ll/ᩴ֡֨;->᩸:I

    and-int/2addr v11, v5

    if-eqz v11, :cond_0

    .line 361
    invoke-interface {v6, v10}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 1099
    :cond_1
    invoke-interface {v2, v6}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 1100
    invoke-virtual {v4}, Ll/᩶ۜ۠;->ۧ()C

    move-result v5

    iget-object v6, v4, Ll/᩶ۜ۠;->۬:Ll/᩶ۢ۠;

    invoke-static {v6}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v7, Ll/ܳ᩻۠;

    invoke-direct {v7, v6}, Ll/ܳ᩻۠;-><init>(Ll/᩶ۢ۠;)V

    const/4 v6, 0x0

    invoke-static {v5, v7, v6}, Ll/᩶ۜ۠;->֫(ILjava/util/function/IntFunction;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۤܶ۠;

    iput-object v5, v1, Ll/֡֡֨;->ۖ֫:Ll/ۤܶ۠;

    .line 1102
    new-instance v5, Ll/ᩴܶ۠;

    invoke-direct {v5}, Ll/ᩴܶ۠;-><init>()V

    .line 1103
    invoke-virtual {v4}, Ll/᩶ۜ۠;->ۧ()C

    move-result v6

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v6, :cond_7

    .line 1105
    iget-object v8, v4, Ll/᩶ۜ۠;->۬:Ll/᩶ۢ۠;

    invoke-virtual {v4}, Ll/᩶ۜ۠;->ۧ()C

    move-result v9

    invoke-virtual {v8, v9}, Ll/᩶ۢ۠;->ܽ(I)Ll/֡֡֨;

    move-result-object v8

    .line 1106
    invoke-virtual {v4}, Ll/᩶ۜ۠;->ۧ()C

    move-result v9

    .line 402
    const-class v10, Ll/ۡᩴ֨;

    invoke-static {v10}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v10

    .line 403
    invoke-static {}, Ll/ۡᩴ֨;->values()[Ll/ۡᩴ֨;

    move-result-object v11

    array-length v12, v11

    const/4 v13, 0x0

    :goto_2
    if-ge v13, v12, :cond_3

    aget-object v14, v11, v13

    .line 404
    iget v15, v14, Ll/ۡᩴ֨;->᩸:I

    and-int/2addr v15, v9

    if-eqz v15, :cond_2

    .line 405
    invoke-interface {v10, v14}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v13, v13, 0x1

    goto :goto_2

    :cond_3
    const/4 v9, 0x0

    .line 1107
    iget-object v11, v4, Ll/᩶ۜ۠;->ܳ֫:Ll/᩷ۚ֨;

    iget-object v11, v11, Ll/᩷ۚ֨;->ܿ֫:Ll/֡֡֨;

    if-ne v8, v11, :cond_6

    iget v11, v4, Ll/᩶ۜ۠;->۠:I

    sget-object v12, Ll/ܽ᩻۠;->ܰ:Ll/ܽ᩻۠;

    iget v12, v12, Ll/ܽ᩻۠;->᩸:I

    if-lt v11, v12, :cond_6

    .line 1108
    sget-object v11, Ll/ۡᩴ֨;->۫:Ll/ۡᩴ֨;

    invoke-interface {v10, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v12

    const-string v13, "bad.requires.flag"

    if-nez v12, :cond_5

    .line 1111
    sget-object v11, Ll/ۡᩴ֨;->ۗ:Ll/ۡᩴ֨;

    invoke-interface {v10, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_4

    goto :goto_3

    :cond_4
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v11, v1, v9

    .line 1112
    invoke-virtual {v4, v13, v1}, Ll/᩶ۜ۠;->֫(Ljava/lang/String;[Ljava/lang/Object;)Ll/᩸ۘ֨;

    move-result-object v1

    throw v1

    :cond_5
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v11, v1, v9

    .line 1109
    invoke-virtual {v4, v13, v1}, Ll/᩶ۜ۠;->֫(Ljava/lang/String;[Ljava/lang/Object;)Ll/᩸ۘ֨;

    move-result-object v1

    throw v1

    .line 1115
    :cond_6
    :goto_3
    invoke-virtual {v4}, Ll/᩶ۜ۠;->ۧ()C

    .line 1116
    new-instance v9, Ll/ۢᩴ֨;

    invoke-direct {v9, v8, v10}, Ll/ۢᩴ֨;-><init>(Ll/֡֡֨;Ljava/util/EnumSet;)V

    .line 227
    invoke-virtual {v5, v9}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 1118
    :cond_7
    invoke-virtual {v5}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v5

    iput-object v5, v1, Ll/֡֡֨;->᩻֫:Ll/ۖܶ۠;

    .line 1119
    invoke-virtual {v3, v5}, Ll/ᩴܶ۠;->addAll(Ljava/util/Collection;)Z

    .line 1121
    new-instance v5, Ll/ᩴܶ۠;

    invoke-direct {v5}, Ll/ᩴܶ۠;-><init>()V

    .line 1122
    invoke-virtual {v4}, Ll/᩶ۜ۠;->ۧ()C

    move-result v7

    const/4 v8, 0x0

    :goto_4
    if-ge v8, v7, :cond_c

    .line 1124
    iget-object v9, v4, Ll/᩶ۜ۠;->۬:Ll/᩶ۢ۠;

    invoke-virtual {v4}, Ll/᩶ۜ۠;->ۧ()C

    move-result v10

    invoke-virtual {v9, v10}, Ll/᩶ۢ۠;->ܳ(I)Ll/۠֡֨;

    move-result-object v9

    .line 1125
    invoke-virtual {v4}, Ll/᩶ۜ۠;->ۧ()C

    move-result v10

    .line 380
    const-class v11, Ll/ܳᩴ֨;

    invoke-static {v11}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v11

    .line 381
    invoke-static {}, Ll/ܳᩴ֨;->values()[Ll/ܳᩴ֨;

    move-result-object v12

    array-length v13, v12

    const/4 v14, 0x0

    :goto_5
    if-ge v14, v13, :cond_9

    aget-object v15, v12, v14

    .line 382
    iget v6, v15, Ll/ܳᩴ֨;->᩸:I

    and-int/2addr v6, v10

    if-eqz v6, :cond_8

    .line 383
    invoke-interface {v11, v15}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_8
    add-int/lit8 v14, v14, 0x1

    goto :goto_5

    .line 1126
    :cond_9
    invoke-virtual {v4}, Ll/᩶ۜ۠;->ۧ()C

    move-result v6

    if-nez v6, :cond_a

    const/4 v6, 0x0

    goto :goto_7

    .line 1131
    :cond_a
    new-instance v10, Ll/ᩴܶ۠;

    invoke-direct {v10}, Ll/ᩴܶ۠;-><init>()V

    const/4 v12, 0x0

    :goto_6
    if-ge v12, v6, :cond_b

    .line 1133
    iget-object v13, v4, Ll/᩶ۜ۠;->۬:Ll/᩶ۢ۠;

    invoke-virtual {v4}, Ll/᩶ۜ۠;->ۧ()C

    move-result v14

    invoke-virtual {v13, v14}, Ll/᩶ۢ۠;->ܽ(I)Ll/֡֡֨;

    move-result-object v13

    invoke-virtual {v10, v13}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    add-int/lit8 v12, v12, 0x1

    goto :goto_6

    .line 1134
    :cond_b
    invoke-virtual {v10}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v6

    .line 1136
    :goto_7
    new-instance v10, Ll/ܿᩴ֨;

    invoke-direct {v10, v9, v6, v11}, Ll/ܿᩴ֨;-><init>(Ll/۠֡֨;Ll/ۖܶ۠;Ljava/util/EnumSet;)V

    .line 227
    invoke-virtual {v5, v10}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    .line 1138
    :cond_c
    invoke-virtual {v5}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v5

    iput-object v5, v1, Ll/֡֡֨;->ܰ:Ll/ۖܶ۠;

    .line 1139
    invoke-virtual {v3, v5}, Ll/ᩴܶ۠;->addAll(Ljava/util/Collection;)Z

    .line 1140
    new-instance v5, Ll/ᩴܶ۠;

    invoke-direct {v5}, Ll/ᩴܶ۠;-><init>()V

    .line 1141
    invoke-virtual {v4}, Ll/᩶ۜ۠;->ۧ()C

    move-result v6

    if-eqz v6, :cond_e

    .line 1142
    sget-object v7, Ll/ᩴ֡֨;->ۙ:Ll/ᩴ֡֨;

    invoke-interface {v2, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    goto :goto_8

    .line 1143
    :cond_d
    iget-object v1, v4, Ll/᩶ۜ۠;->᩷:Ll/֡֡֨;

    iget-object v1, v1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const-string v1, "module.non.zero.opens"

    invoke-virtual {v4, v1, v2}, Ll/᩶ۜ۠;->֫(Ljava/lang/String;[Ljava/lang/Object;)Ll/᩸ۘ֨;

    move-result-object v1

    throw v1

    :cond_e
    :goto_8
    const/4 v2, 0x0

    :goto_9
    if-ge v2, v6, :cond_13

    .line 1146
    iget-object v7, v4, Ll/᩶ۜ۠;->۬:Ll/᩶ۢ۠;

    invoke-virtual {v4}, Ll/᩶ۜ۠;->ۧ()C

    move-result v8

    invoke-virtual {v7, v8}, Ll/᩶ۢ۠;->ܳ(I)Ll/۠֡֨;

    move-result-object v7

    .line 1147
    invoke-virtual {v4}, Ll/᩶ۜ۠;->ۧ()C

    move-result v8

    .line 391
    const-class v9, Ll/ۜᩴ֨;

    invoke-static {v9}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v9

    .line 392
    invoke-static {}, Ll/ۜᩴ֨;->values()[Ll/ۜᩴ֨;

    move-result-object v10

    array-length v11, v10

    const/4 v12, 0x0

    :goto_a
    if-ge v12, v11, :cond_10

    aget-object v13, v10, v12

    .line 393
    iget v14, v13, Ll/ۜᩴ֨;->᩸:I

    and-int/2addr v14, v8

    if-eqz v14, :cond_f

    .line 394
    invoke-interface {v9, v13}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_f
    add-int/lit8 v12, v12, 0x1

    goto :goto_a

    .line 1148
    :cond_10
    invoke-virtual {v4}, Ll/᩶ۜ۠;->ۧ()C

    move-result v8

    if-nez v8, :cond_11

    const/4 v8, 0x0

    goto :goto_c

    .line 1153
    :cond_11
    new-instance v10, Ll/ᩴܶ۠;

    invoke-direct {v10}, Ll/ᩴܶ۠;-><init>()V

    const/4 v11, 0x0

    :goto_b
    if-ge v11, v8, :cond_12

    .line 1155
    iget-object v12, v4, Ll/᩶ۜ۠;->۬:Ll/᩶ۢ۠;

    invoke-virtual {v4}, Ll/᩶ۜ۠;->ۧ()C

    move-result v13

    invoke-virtual {v12, v13}, Ll/᩶ۢ۠;->ܽ(I)Ll/֡֡֨;

    move-result-object v12

    invoke-virtual {v10, v12}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_b

    .line 1156
    :cond_12
    invoke-virtual {v10}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v8

    .line 1158
    :goto_c
    new-instance v10, Ll/᩻ᩴ֨;

    invoke-direct {v10, v7, v8, v9}, Ll/᩻ᩴ֨;-><init>(Ll/۠֡֨;Ll/ۖܶ۠;Ljava/util/EnumSet;)V

    .line 227
    invoke-virtual {v5, v10}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_9

    .line 1160
    :cond_13
    invoke-virtual {v5}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v2

    iput-object v2, v1, Ll/֡֡֨;->ۧ֫:Ll/ۖܶ۠;

    .line 1161
    invoke-virtual {v3, v2}, Ll/ᩴܶ۠;->addAll(Ljava/util/Collection;)Z

    .line 1163
    invoke-virtual {v3}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v2

    iput-object v2, v1, Ll/֡֡֨;->ۨ:Ll/ۖܶ۠;

    .line 1165
    new-instance v1, Ll/ᩴܶ۠;

    invoke-direct {v1}, Ll/ᩴܶ۠;-><init>()V

    .line 1166
    invoke-virtual {v4}, Ll/᩶ۜ۠;->ۧ()C

    move-result v2

    const/4 v3, 0x0

    :goto_d
    if-ge v3, v2, :cond_14

    .line 1168
    iget-object v5, v4, Ll/᩶ۜ۠;->۬:Ll/᩶ۢ۠;

    invoke-virtual {v4}, Ll/᩶ۜ۠;->ۧ()C

    move-result v6

    new-instance v7, Ll/᩶᩻۠;

    invoke-direct {v7, v0}, Ll/᩶᩻۠;-><init>(Ll/ۙ᩻۠;)V

    invoke-virtual {v5, v6, v7}, Ll/᩶ۢ۠;->֫(ILl/۬ܶ۠;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۤܶ۠;

    .line 1169
    new-instance v6, Ll/᩵ۜ۠;

    invoke-direct {v6, v5}, Ll/᩵ۜ۠;-><init>(Ll/ۤܶ۠;)V

    .line 227
    invoke-virtual {v1, v6}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_d

    .line 1171
    :cond_14
    invoke-virtual {v1}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v1

    invoke-static {v4, v1}, Ll/᩶ۜ۠;->ۧ(Ll/᩶ۜ۠;Ll/ۖܶ۠;)V

    .line 1173
    new-instance v1, Ll/ᩴܶ۠;

    invoke-direct {v1}, Ll/ᩴܶ۠;-><init>()V

    .line 1174
    invoke-virtual {v4}, Ll/᩶ۜ۠;->ۧ()C

    move-result v2

    const/4 v3, 0x0

    :goto_e
    if-ge v3, v2, :cond_16

    .line 1176
    iget-object v5, v4, Ll/᩶ۜ۠;->۬:Ll/᩶ۢ۠;

    invoke-virtual {v4}, Ll/᩶ۜ۠;->ۧ()C

    move-result v6

    new-instance v7, Ll/᩶᩻۠;

    invoke-direct {v7, v0}, Ll/᩶᩻۠;-><init>(Ll/ۙ᩻۠;)V

    invoke-virtual {v5, v6, v7}, Ll/᩶ۢ۠;->֫(ILl/۬ܶ۠;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۤܶ۠;

    .line 1177
    invoke-virtual {v4}, Ll/᩶ۜ۠;->ۧ()C

    move-result v6

    .line 1178
    new-instance v7, Ll/ᩴܶ۠;

    invoke-direct {v7}, Ll/ᩴܶ۠;-><init>()V

    const/4 v8, 0x0

    :goto_f
    if-ge v8, v6, :cond_15

    .line 1180
    iget-object v9, v4, Ll/᩶ۜ۠;->۬:Ll/᩶ۢ۠;

    invoke-virtual {v4}, Ll/᩶ۜ۠;->ۧ()C

    move-result v10

    new-instance v11, Ll/᩶᩻۠;

    invoke-direct {v11, v0}, Ll/᩶᩻۠;-><init>(Ll/ۙ᩻۠;)V

    invoke-virtual {v9, v10, v11}, Ll/᩶ۢ۠;->֫(ILl/۬ܶ۠;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۤܶ۠;

    invoke-virtual {v7, v9}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    .line 1181
    new-instance v9, Ll/ᩴۜ۠;

    invoke-virtual {v7}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v10

    invoke-direct {v9, v5, v10}, Ll/ᩴۜ۠;-><init>(Ll/ۤܶ۠;Ll/ۖܶ۠;)V

    .line 227
    invoke-virtual {v1, v9}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_f

    :cond_15
    add-int/lit8 v3, v3, 0x1

    goto :goto_e

    .line 1184
    :cond_16
    invoke-virtual {v1}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v1

    invoke-static {v4, v1}, Ll/᩶ۜ۠;->֫(Ll/᩶ۜ۠;Ll/ۖܶ۠;)V

    return-void

    :cond_17
    const/4 v1, 0x0

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v5, v2, v1

    const/4 v1, 0x1

    aput-object v6, v2, v1

    const-string v1, "module.name.mismatch"

    .line 1095
    invoke-virtual {v4, v1, v2}, Ll/᩶ۜ۠;->֫(Ljava/lang/String;[Ljava/lang/Object;)Ll/᩸ۘ֨;

    move-result-object v1

    throw v1

    :cond_18
    return-void
.end method

.method public final ֫(Ll/ۜۜ۠;)Z
    .locals 0

    .line 1086
    invoke-super {p0, p1}, Ll/᩷ۜ۠;->֫(Ll/ۜۜ۠;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll/ۙ᩻۠;->ܿ:Ll/᩶ۜ۠;

    iget-boolean p1, p1, Ll/᩶ۜ۠;->֫:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
