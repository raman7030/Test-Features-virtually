.class public final Ll/ܰ֫֨;
.super Ll/֫ܽ֨;
.source "37EB"


# instance fields
.field public ۛ֫:I

.field public ۤ֫:I

.field public ۫֫:I

.field public ۬֫:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method private ֨()Ll/᩺֫֨;
    .locals 5

    .line 193
    iget-object v0, p0, Ll/֫ܽ֨;->ۗ֫:Ll/᩷ۧ֨;

    iget-object v1, v0, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    iget v2, p0, Ll/ܰ֫֨;->۫֫:I

    invoke-virtual {v1, v2}, Ll/ۤۧ֨;->֨(I)Ll/ۗۧ֨;

    move-result-object v1

    .line 194
    iget-object v2, v0, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    sget-object v3, Ll/۫ۧ֨;->ۜ֫:Ll/۫ۧ֨;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 548
    new-instance v4, Ll/֨ۧ֨;

    invoke-direct {v4, v2, v3}, Ll/֨ۧ֨;-><init>(Ll/ۤۧ֨;Ll/۫ۧ֨;)V

    .line 195
    instance-of v2, v1, Ll/֨ۧ֨;

    if-eqz v2, :cond_0

    move-object v4, v1

    check-cast v4, Ll/֨ۧ֨;

    .line 197
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Ll/֨ۧ֨;->ܽ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 199
    :cond_0
    iget-object v0, v0, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    const-string v1, "??? Invalid bootstrap method reference"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v3}, Ll/᩶ۗۚ;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 200
    iget-boolean v1, p0, Ll/ۢܽ֨;->֫֫:Z

    if-nez v1, :cond_1

    .line 201
    iget v1, p0, Ll/ܰ֫֨;->۫֫:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v1, v3, v2

    const-string v1, "#%d"

    .line 19
    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x19

    .line 201
    invoke-virtual {p0, v2, v1}, Ll/ۢܽ֨;->ܽ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, " // "

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 204
    :cond_1
    :goto_0
    new-instance v1, Ll/᩺֫֨;

    invoke-direct {v1, v0, v4}, Ll/᩺֫֨;-><init>(Ljava/lang/String;Ll/֨ۧ֨;)V

    return-object v1
.end method


# virtual methods
.method public final ۧ(II)V
    .locals 18

    move-object/from16 v0, p0

    .line 394
    iget-object v1, v0, Ll/֫ܽ֨;->ۙ֫:Ll/۟ۧ֨;

    iget v2, v1, Ll/ۢܽ֨;->᩶:I

    .line 76
    sget v3, Ll/ۢܽ֨;->᩶֫:I

    sub-int/2addr v2, v3

    .line 77
    invoke-direct/range {p0 .. p0}, Ll/ܰ֫֨;->֨()Ll/᩺֫֨;

    move-result-object v3

    .line 79
    sget-object v4, Ll/ܶۨۚ;->ۙ֫:Ll/ܶۨۚ;

    invoke-virtual {v4}, Ll/ܶۨۚ;->᩷()Ljava/lang/String;

    move-result-object v4

    sget v5, Ll/ۢܽ֨;->᩶֫:I

    invoke-virtual {v0, v5, v4}, Ll/ۢܽ֨;->ܽ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ll/ۢܽ֨;->ܽ(Ljava/lang/String;)V

    const/4 v4, 0x0

    .line 80
    sget-object v5, Ll/ۢܽ֨;->᩸֫:Ljava/util/Map;

    iget-boolean v6, v0, Ll/ۢܽ֨;->ܺ֫:Z

    const-string v7, ""

    const-string v8, " // "

    const/4 v9, 0x1

    iget-boolean v10, v0, Ll/ۢܽ֨;->֫֫:Z

    if-eqz v10, :cond_1

    const-string v11, "#%d;"

    if-eqz v6, :cond_0

    .line 82
    iget v12, v0, Ll/ܰ֫֨;->۫֫:I

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    new-array v13, v9, [Ljava/lang/Object;

    aput-object v12, v13, v4

    .line 19
    invoke-static {v11, v13}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 82
    invoke-virtual {v0, v4}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    goto :goto_0

    .line 84
    :cond_0
    iget v12, v0, Ll/ܰ֫֨;->۫֫:I

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    new-array v13, v9, [Ljava/lang/Object;

    aput-object v12, v13, v4

    .line 19
    invoke-static {v11, v13}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 84
    invoke-virtual {v0, v2, v4}, Ll/ۢܽ֨;->ܿ(ILjava/lang/String;)V

    .line 85
    invoke-virtual {v3}, Ll/᩺֫֨;->ܽ()Ljava/lang/String;

    move-result-object v4

    .line 394
    iget v11, v1, Ll/ۢܽ֨;->᩶:I

    .line 86
    invoke-virtual/range {p0 .. p0}, Ll/ۢܽ֨;->ܳ()I

    move-result v12

    add-int/2addr v12, v11

    .line 85
    invoke-virtual {v0, v4, v12, v8, v5}, Ll/ۢܽ֨;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v4

    .line 19
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 85
    invoke-virtual {v0, v4}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    goto :goto_0

    .line 91
    :cond_1
    invoke-virtual {v3}, Ll/᩺֫֨;->ܽ()Ljava/lang/String;

    move-result-object v4

    .line 19
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 91
    sget v11, Ll/ۢܽ֨;->᩶֫:I

    invoke-virtual/range {p0 .. p0}, Ll/ۢܽ֨;->᩻()I

    move-result v12

    add-int/2addr v12, v11

    sget-object v11, Ll/ۢܽ֨;->֨֫:Ljava/util/Map;

    .line 90
    invoke-virtual {v0, v4, v12, v7, v11}, Ll/ۢܽ֨;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    .line 95
    :goto_0
    sget v4, Ll/ۢܽ֨;->᩶֫:I

    const-string v11, " "

    invoke-virtual {v0, v4, v11}, Ll/ۢܽ֨;->ܽ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ll/ۢܽ֨;->ܽ(Ljava/lang/String;)V

    const-string v4, "{ "

    invoke-virtual {v0, v4}, Ll/ۢܽ֨;->ۧ(Ljava/lang/String;)V

    .line 96
    iget v4, v0, Ll/ܰ֫֨;->ۛ֫:I

    if-lez v4, :cond_8

    .line 97
    invoke-virtual/range {p0 .. p0}, Ll/ۢܽ֨;->᩵()V

    const/4 v4, 0x2

    .line 98
    invoke-virtual {v0, v4}, Ll/ۢܽ֨;->ᩳ(I)V

    if-eqz v10, :cond_6

    const/4 v10, 0x0

    .line 100
    :goto_1
    iget v12, v0, Ll/ܰ֫֨;->ۛ֫:I

    if-ge v10, v12, :cond_7

    .line 101
    iget-object v12, v0, Ll/ܰ֫֨;->۬֫:Ljava/util/ArrayList;

    invoke-virtual {v12, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v13

    .line 102
    iget v14, v0, Ll/ܰ֫֨;->ۛ֫:I

    sub-int/2addr v14, v9

    if-eq v10, v14, :cond_2

    const-string v15, ","

    goto :goto_2

    :cond_2
    move-object v15, v7

    :goto_2
    if-eq v10, v14, :cond_3

    const/4 v14, 0x1

    goto :goto_3

    :cond_3
    const/4 v14, 0x0

    :goto_3
    const/16 v16, 0x0

    .line 104
    sget v4, Ll/ۢܽ֨;->᩶֫:I

    invoke-virtual {v0, v4, v11}, Ll/ۢܽ֨;->ܽ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ll/ۢܽ֨;->ܽ(Ljava/lang/String;)V

    const-string v4, "#%d%s"

    if-eqz v6, :cond_4

    move/from16 v17, v6

    const/4 v6, 0x2

    new-array v13, v6, [Ljava/lang/Object;

    aput-object v12, v13, v16

    .line 106
    aput-object v15, v13, v9

    .line 19
    invoke-static {v4, v13}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 106
    invoke-virtual {v0, v4}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    goto :goto_5

    :cond_4
    move/from16 v17, v6

    const/4 v6, 0x1

    .line 108
    invoke-virtual {v3}, Ll/᩺֫֨;->֫()Ll/֨ۧ֨;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v14, :cond_5

    const-string v14, "\u2f80"

    goto :goto_4

    :cond_5
    move-object v14, v7

    .line 1089
    :goto_4
    invoke-virtual {v9, v13, v7, v14}, Ll/֨ۧ֨;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 394
    iget v13, v1, Ll/ۢܽ֨;->᩶:I

    .line 109
    invoke-virtual/range {p0 .. p0}, Ll/ۢܽ֨;->᩻()I

    move-result v14

    add-int/2addr v14, v13

    invoke-virtual {v0, v9, v14, v8, v5}, Ll/ۢܽ֨;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v9

    const/4 v13, 0x2

    new-array v14, v13, [Ljava/lang/Object;

    aput-object v12, v14, v16

    aput-object v15, v14, v6

    .line 19
    invoke-static {v4, v14}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 112
    invoke-virtual/range {p0 .. p0}, Ll/ۢܽ֨;->᩻()I

    move-result v6

    mul-int/lit8 v6, v6, 0x2

    sub-int v6, v2, v6

    invoke-virtual {v0, v6, v4}, Ll/ۢܽ֨;->ܿ(ILjava/lang/String;)V

    .line 19
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 113
    invoke-virtual {v0, v4}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    :goto_5
    add-int/lit8 v10, v10, 0x1

    const/4 v9, 0x1

    move/from16 v6, v17

    const/4 v4, 0x2

    goto/16 :goto_1

    .line 117
    :cond_6
    invoke-virtual {v3}, Ll/᩺֫֨;->֫()Ll/֨ۧ֨;

    move-result-object v1

    .line 1066
    invoke-virtual {v1, v0, v7, v7}, Ll/֨ۧ֨;->֫(Ll/ܰ֫֨;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 118
    sget v2, Ll/ۢܽ֨;->᩶֫:I

    invoke-virtual/range {p0 .. p0}, Ll/ۢܽ֨;->᩻()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {v0, v2, v11}, Ll/ۢܽ֨;->ܽ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ۢܽ֨;->ܽ(Ljava/lang/String;)V

    sget v2, Ll/ۢܽ֨;->᩶֫:I

    .line 119
    invoke-virtual/range {p0 .. p0}, Ll/ۢܽ֨;->᩻()I

    move-result v3

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v3, v2

    sget-object v2, Ll/ۢܽ֨;->ۚ֫:Ljava/util/Map;

    invoke-virtual {v0, v1, v3, v7, v2}, Ll/ۢܽ֨;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    :cond_7
    const/4 v1, 0x2

    .line 122
    invoke-virtual {v0, v1}, Ll/ۢܽ֨;->ۧ(I)V

    .line 123
    sget v1, Ll/ۢܽ֨;->᩶֫:I

    invoke-virtual {v0, v1, v11}, Ll/ۢܽ֨;->ܽ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۢܽ֨;->ܽ(Ljava/lang/String;)V

    :cond_8
    const-string v1, "}"

    .line 125
    invoke-virtual {v0, v1}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    add-int/lit8 v1, p2, -0x1

    move/from16 v2, p1

    if-ge v2, v1, :cond_9

    .line 127
    invoke-virtual/range {p0 .. p0}, Ll/ۢܽ֨;->᩵()V

    :cond_9
    return-void
.end method

.method public final ܽ()Z
    .locals 1

    .line 58
    iget-object v0, p0, Ll/ܰ֫֨;->۬֫:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ(II)V
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p1

    .line 394
    iget-object v2, v0, Ll/֫ܽ֨;->ۙ֫:Ll/۟ۧ֨;

    iget v3, v2, Ll/ۢܽ֨;->᩶:I

    .line 132
    iget v4, v0, Ll/ܰ֫֨;->ۤ֫:I

    sub-int/2addr v3, v4

    invoke-virtual/range {p0 .. p0}, Ll/ۢܽ֨;->ܳ()I

    move-result v5

    sub-int/2addr v3, v5

    .line 133
    invoke-direct/range {p0 .. p0}, Ll/ܰ֫֨;->֨()Ll/᩺֫֨;

    move-result-object v5

    if-nez v1, :cond_0

    .line 136
    sget-object v6, Ll/ܶۨۚ;->ۙ֫:Ll/ܶۨۚ;

    invoke-virtual {v6}, Ll/ܶۨۚ;->֫()Ljava/lang/String;

    move-result-object v6

    .line 19
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " {"

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 136
    invoke-virtual {v0, v6}, Ll/ۢܽ֨;->ᩳ(Ljava/lang/String;)V

    :cond_0
    const/4 v6, 0x1

    .line 260
    invoke-virtual {v0, v6}, Ll/ۢܽ֨;->ᩳ(I)V

    .line 139
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    new-array v8, v6, [Ljava/lang/Object;

    const/4 v9, 0x0

    aput-object v7, v8, v9

    const-string v7, "%2d:"

    invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v4, v7}, Ll/ۢܽ֨;->ܽ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Ll/ۢܽ֨;->ܽ(Ljava/lang/String;)V

    .line 140
    sget-object v7, Ll/ۢܽ֨;->֨֫:Ljava/util/Map;

    iget-boolean v8, v0, Ll/ۢܽ֨;->ܺ֫:Z

    iget-boolean v10, v0, Ll/ۢܽ֨;->֫֫:Z

    const-string v11, ""

    const-string v12, " // "

    if-eqz v10, :cond_2

    const-string v13, "#%d;"

    if-eqz v8, :cond_1

    .line 142
    iget v2, v0, Ll/ܰ֫֨;->۫֫:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v2, v6, v9

    .line 19
    invoke-static {v13, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 142
    invoke-virtual {v0, v2}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    goto :goto_0

    .line 144
    :cond_1
    iget v9, v0, Ll/ܰ֫֨;->۫֫:I

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const/4 v14, 0x0

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v9, v6, v14

    .line 19
    invoke-static {v13, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 144
    invoke-virtual {v0, v3, v6}, Ll/ۢܽ֨;->ܿ(ILjava/lang/String;)V

    .line 146
    invoke-virtual {v5}, Ll/᩺֫֨;->ܽ()Ljava/lang/String;

    move-result-object v6

    .line 19
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 394
    iget v2, v2, Ll/ۢܽ֨;->᩶:I

    .line 147
    invoke-virtual/range {p0 .. p0}, Ll/ۢܽ֨;->᩻()I

    move-result v9

    add-int/2addr v9, v2

    .line 145
    invoke-virtual {v0, v6, v9, v12, v7}, Ll/ۢܽ֨;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    .line 19
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 145
    invoke-virtual {v0, v2}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    :goto_0
    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    .line 152
    invoke-virtual {v5}, Ll/᩺֫֨;->ܽ()Ljava/lang/String;

    move-result-object v6

    .line 19
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 152
    invoke-virtual/range {p0 .. p0}, Ll/ۢܽ֨;->᩻()I

    move-result v9

    mul-int/lit8 v9, v9, 0x2

    add-int/2addr v9, v4

    invoke-virtual {v0, v6, v9, v11, v7}, Ll/ۢܽ֨;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    .line 157
    :goto_1
    iget v6, v0, Ll/ܰ֫֨;->ۛ֫:I

    if-lez v6, :cond_9

    const-string v6, " Arguments:"

    .line 158
    invoke-virtual {v0, v6}, Ll/ۢܽ֨;->ᩳ(Ljava/lang/String;)V

    const-string v6, ";"

    if-eqz v10, :cond_8

    add-int v7, v3, v4

    .line 160
    invoke-virtual/range {p0 .. p0}, Ll/ۢܽ֨;->᩻()I

    move-result v9

    mul-int/lit8 v9, v9, 0x2

    add-int/2addr v9, v7

    const/4 v7, 0x0

    .line 161
    :goto_2
    iget v13, v0, Ll/ܰ֫֨;->ۛ֫:I

    if-ge v7, v13, :cond_9

    .line 162
    iget-object v13, v0, Ll/ܰ֫֨;->۬֫:Ljava/util/ArrayList;

    invoke-virtual {v13, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Integer;

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v14

    .line 163
    iget v15, v0, Ll/ܰ֫֨;->ۛ֫:I

    add-int/lit8 v15, v15, -0x1

    if-eq v7, v15, :cond_3

    const/16 v16, 0x1

    goto :goto_3

    :cond_3
    const/16 v16, 0x0

    :goto_3
    if-eq v7, v15, :cond_4

    const-string v15, ","

    goto :goto_4

    :cond_4
    move-object v15, v6

    .line 165
    :goto_4
    invoke-virtual {v0, v4, v11}, Ll/ۢܽ֨;->ܽ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۢܽ֨;->ܽ(Ljava/lang/String;)V

    if-eqz v10, :cond_7

    const-string v1, "#%d%s"

    if-eqz v8, :cond_5

    const/4 v14, 0x2

    new-array v14, v14, [Ljava/lang/Object;

    .line 168
    aput-object v13, v14, v2

    const/4 v13, 0x1

    aput-object v15, v14, v13

    .line 19
    invoke-static {v1, v14}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 168
    invoke-virtual {v0, v1}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    goto :goto_6

    :cond_5
    move/from16 v17, v8

    .line 170
    invoke-virtual {v5}, Ll/᩺֫֨;->֫()Ll/֨ۧ֨;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v16, :cond_6

    const-string v16, "\u2f80"

    move-object/from16 v18, v16

    move/from16 v16, v10

    move-object/from16 v10, v18

    goto :goto_5

    :cond_6
    move/from16 v16, v10

    move-object v10, v11

    .line 1089
    :goto_5
    invoke-virtual {v8, v14, v11, v10}, Ll/֨ۧ֨;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 171
    sget-object v10, Ll/ۢܽ֨;->᩸֫:Ljava/util/Map;

    invoke-virtual {v0, v8, v9, v12, v10}, Ll/ۢܽ֨;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v8

    const/4 v10, 0x2

    new-array v10, v10, [Ljava/lang/Object;

    .line 172
    aput-object v13, v10, v2

    const/4 v13, 0x1

    aput-object v15, v10, v13

    .line 19
    invoke-static {v1, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 172
    invoke-virtual {v0, v3, v1}, Ll/ۢܽ֨;->ܿ(ILjava/lang/String;)V

    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 172
    invoke-virtual {v0, v1}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    goto :goto_7

    :cond_7
    :goto_6
    move/from16 v17, v8

    move/from16 v16, v10

    :goto_7
    add-int/lit8 v7, v7, 0x1

    move/from16 v1, p1

    move/from16 v10, v16

    move/from16 v8, v17

    goto/16 :goto_2

    .line 177
    :cond_8
    invoke-virtual {v5}, Ll/᩺֫֨;->֫()Ll/֨ۧ֨;

    move-result-object v1

    .line 1066
    invoke-virtual {v1, v0, v11, v11}, Ll/֨ۧ֨;->֫(Ll/ܰ֫֨;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, " "

    .line 178
    invoke-virtual {v0, v4, v2}, Ll/ۢܽ֨;->ܽ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ۢܽ֨;->ܽ(Ljava/lang/String;)V

    .line 179
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p0 .. p0}, Ll/ۢܽ֨;->᩻()I

    move-result v3

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v3, v4

    sget-object v4, Ll/ۢܽ֨;->ۚ֫:Ljava/util/Map;

    invoke-virtual {v0, v1, v3, v11, v4}, Ll/ۢܽ֨;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    :cond_9
    add-int/lit8 v1, p2, -0x1

    move/from16 v2, p1

    if-ge v2, v1, :cond_a

    .line 184
    invoke-virtual/range {p0 .. p0}, Ll/ۢܽ֨;->᩵()V

    return-void

    :cond_a
    const/4 v1, 0x1

    .line 264
    invoke-virtual {v0, v1}, Ll/ۢܽ֨;->ۧ(I)V

    const-string v1, "}"

    .line 187
    invoke-virtual {v0, v1}, Ll/ۢܽ֨;->ᩳ(Ljava/lang/String;)V

    return-void
.end method
