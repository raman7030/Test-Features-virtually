.class public final Ll/ۘ᩺ܽ;
.super Ljava/lang/Object;
.source "F15V"


# instance fields
.field public final ֫:Ljava/util/List;

.field public final ۜ:Ljava/util/List;

.field public final ۡ:Ljava/util/List;

.field public final ۢ:Ljava/util/List;

.field public final ۧ:Ljava/util/List;

.field public final ܳ:Ljava/util/List;

.field public final ܺ:Ll/۬ᩳۚ;

.field public final ܽ:Ljava/util/List;

.field public final ܿ:Ljava/util/List;

.field public final ᩳ:Ljava/util/List;

.field public final ᩷:Ljava/util/List;

.field public final ᩻:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 41

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 102
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 103
    new-instance v2, Ll/۬ᩳۚ;

    const-string v3, "Z"

    invoke-static {v3}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v4

    const-string v5, "a"

    invoke-direct {v2, v1, v5, v4}, Ll/۬ᩳۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܳ۬ܺ;)V

    .line 104
    new-instance v4, Ll/۬ᩳۚ;

    const-string v6, "D"

    invoke-static {v6}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v7

    invoke-direct {v4, v1, v5, v7}, Ll/۬ᩳۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܳ۬ܺ;)V

    .line 105
    new-instance v7, Ll/۬ᩳۚ;

    const-string v8, "F"

    invoke-static {v8}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v9

    invoke-direct {v7, v1, v5, v9}, Ll/۬ᩳۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܳ۬ܺ;)V

    .line 106
    new-instance v9, Ll/۬ᩳۚ;

    const-string v10, "J"

    invoke-static {v10}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v11

    invoke-direct {v9, v1, v5, v11}, Ll/۬ᩳۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܳ۬ܺ;)V

    .line 107
    new-instance v11, Ll/۬ᩳۚ;

    const-string v12, "I"

    invoke-static {v12}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v13

    invoke-direct {v11, v1, v5, v13}, Ll/۬ᩳۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܳ۬ܺ;)V

    .line 108
    new-instance v13, Ll/۬ᩳۚ;

    const-string v14, "C"

    invoke-static {v14}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v15

    invoke-direct {v13, v1, v5, v15}, Ll/۬ᩳۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܳ۬ܺ;)V

    .line 109
    new-instance v15, Ll/۬ᩳۚ;

    const-string v16, "Ljava/lang/Object;"

    move-object/from16 v17, v13

    invoke-static/range {v16 .. v16}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v13

    invoke-direct {v15, v1, v5, v13}, Ll/۬ᩳۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܳ۬ܺ;)V

    .line 110
    new-instance v5, Ll/۬ᩳۚ;

    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v13

    move-object/from16 v18, v15

    const-string v15, "b"

    invoke-direct {v5, v1, v15, v13}, Ll/۬ᩳۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܳ۬ܺ;)V

    .line 111
    new-instance v13, Ljava/util/ArrayList;

    move-object/from16 v19, v11

    const/4 v11, 0x6

    invoke-direct {v13, v11}, Ljava/util/ArrayList;-><init>(I)V

    move-object/from16 v20, v9

    .line 112
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9, v11}, Ljava/util/ArrayList;-><init>(I)V

    move-object/from16 v21, v7

    .line 113
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7, v11}, Ljava/util/ArrayList;-><init>(I)V

    move-object/from16 v22, v4

    .line 114
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v11}, Ljava/util/ArrayList;-><init>(I)V

    move-object/from16 v23, v2

    .line 115
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 116
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v11}, Ljava/util/ArrayList;-><init>(I)V

    move-object/from16 v24, v5

    .line 117
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v11}, Ljava/util/ArrayList;-><init>(I)V

    const/16 v25, 0x1

    move-object/from16 v25, v5

    const/4 v5, 0x1

    :goto_0
    if-gt v5, v11, :cond_0

    .line 119
    new-instance v11, Ll/۬ᩳۚ;

    move-object/from16 v26, v0

    .line 0
    invoke-static {v5, v15}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v27, v14

    .line 119
    invoke-static {v3}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v14

    invoke-direct {v11, v1, v0, v14}, Ll/۬ᩳۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܳ۬ܺ;)V

    invoke-virtual {v13, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    new-instance v0, Ll/۬ᩳۚ;

    .line 0
    invoke-static {v5, v15}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 120
    invoke-static {v6}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v14

    invoke-direct {v0, v1, v11, v14}, Ll/۬ᩳۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܳ۬ܺ;)V

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    new-instance v0, Ll/۬ᩳۚ;

    .line 0
    invoke-static {v5, v15}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 121
    invoke-static {v8}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v14

    invoke-direct {v0, v1, v11, v14}, Ll/۬ᩳۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܳ۬ܺ;)V

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    new-instance v0, Ll/۬ᩳۚ;

    .line 0
    invoke-static {v5, v15}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 122
    invoke-static {v10}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v14

    invoke-direct {v0, v1, v11, v14}, Ll/۬ᩳۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܳ۬ܺ;)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    new-instance v0, Ll/۬ᩳۚ;

    .line 0
    invoke-static {v5, v15}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 123
    invoke-static {v12}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v14

    invoke-direct {v0, v1, v11, v14}, Ll/۬ᩳۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܳ۬ܺ;)V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    new-instance v0, Ll/۬ᩳۚ;

    .line 0
    invoke-static {v5, v15}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 124
    invoke-static/range {v27 .. v27}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v14

    invoke-direct {v0, v1, v11, v14}, Ll/۬ᩳۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܳ۬ܺ;)V

    move-object/from16 v11, v26

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    new-instance v0, Ll/۬ᩳۚ;

    .line 0
    invoke-static {v5, v15}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 125
    invoke-static/range {v16 .. v16}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v11

    invoke-direct {v0, v1, v14, v11}, Ll/۬ᩳۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܳ۬ܺ;)V

    move-object/from16 v11, v25

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    const/4 v0, 0x6

    move-object/from16 v0, v26

    move-object/from16 v14, v27

    const/4 v11, 0x6

    goto/16 :goto_0

    :cond_0
    move-object/from16 v26, v0

    move-object/from16 v27, v14

    move-object/from16 v11, v25

    .line 127
    new-instance v0, Ll/۬ᩳۚ;

    invoke-static {v3}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v5

    const-string v14, "c"

    invoke-direct {v0, v1, v14, v5}, Ll/۬ᩳۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܳ۬ܺ;)V

    .line 128
    new-instance v15, Ll/۬ᩳۚ;

    invoke-static {v6}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v5

    invoke-direct {v15, v1, v14, v5}, Ll/۬ᩳۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܳ۬ܺ;)V

    .line 129
    new-instance v5, Ll/۬ᩳۚ;

    move-object/from16 v29, v15

    invoke-static {v8}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v15

    invoke-direct {v5, v1, v14, v15}, Ll/۬ᩳۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܳ۬ܺ;)V

    .line 130
    new-instance v15, Ll/۬ᩳۚ;

    move-object/from16 v25, v5

    invoke-static {v10}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v5

    invoke-direct {v15, v1, v14, v5}, Ll/۬ᩳۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܳ۬ܺ;)V

    .line 131
    new-instance v5, Ll/۬ᩳۚ;

    move-object/from16 v31, v15

    invoke-static {v12}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v15

    invoke-direct {v5, v1, v14, v15}, Ll/۬ᩳۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܳ۬ܺ;)V

    .line 132
    new-instance v15, Ll/۬ᩳۚ;

    move-object/from16 v28, v5

    invoke-static/range {v27 .. v27}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v5

    invoke-direct {v15, v1, v14, v5}, Ll/۬ᩳۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܳ۬ܺ;)V

    .line 133
    new-instance v5, Ll/۬ᩳۚ;

    move-object/from16 v33, v15

    invoke-static/range {v16 .. v16}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v15

    invoke-direct {v5, v1, v14, v15}, Ll/۬ᩳۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܳ۬ܺ;)V

    .line 134
    new-instance v14, Ll/۬ᩳۚ;

    invoke-static {v3}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v3

    const-string v15, "d"

    invoke-direct {v14, v1, v15, v3}, Ll/۬ᩳۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܳ۬ܺ;)V

    .line 135
    new-instance v3, Ll/۬ᩳۚ;

    invoke-static {v6}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v6

    invoke-direct {v3, v1, v15, v6}, Ll/۬ᩳۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܳ۬ܺ;)V

    .line 136
    new-instance v6, Ll/۬ᩳۚ;

    invoke-static {v8}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v8

    invoke-direct {v6, v1, v15, v8}, Ll/۬ᩳۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܳ۬ܺ;)V

    .line 137
    new-instance v8, Ll/۬ᩳۚ;

    invoke-static {v10}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v10

    invoke-direct {v8, v1, v15, v10}, Ll/۬ᩳۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܳ۬ܺ;)V

    .line 138
    new-instance v10, Ll/۬ᩳۚ;

    invoke-static {v12}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v12

    invoke-direct {v10, v1, v15, v12}, Ll/۬ᩳۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܳ۬ܺ;)V

    .line 139
    new-instance v12, Ll/۬ᩳۚ;

    move-object/from16 v30, v3

    invoke-static/range {v27 .. v27}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v3

    invoke-direct {v12, v1, v15, v3}, Ll/۬ᩳۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܳ۬ܺ;)V

    .line 140
    new-instance v3, Ll/۬ᩳۚ;

    move-object/from16 v27, v5

    invoke-static/range {v16 .. v16}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v5

    invoke-direct {v3, v1, v15, v5}, Ll/۬ᩳۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܳ۬ܺ;)V

    move-object/from16 v15, p0

    move-object/from16 v1, v24

    move-object/from16 v16, v26

    .line 149
    iput-object v1, v15, Ll/ۘ᩺ܽ;->ܺ:Ll/۬ᩳۚ;

    .line 150
    invoke-static {v13}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v15, Ll/ۘ᩺ܽ;->᩻:Ljava/util/List;

    .line 151
    invoke-static {v9}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v15, Ll/ۘ᩺ܽ;->ۧ:Ljava/util/List;

    .line 152
    invoke-static {v7}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v15, Ll/ۘ᩺ܽ;->ܽ:Ljava/util/List;

    .line 153
    invoke-static {v4}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v15, Ll/ۘ᩺ܽ;->ܿ:Ljava/util/List;

    .line 154
    invoke-static {v2}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v15, Ll/ۘ᩺ܽ;->ᩳ:Ljava/util/List;

    .line 155
    invoke-static/range {v16 .. v16}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v15, Ll/ۘ᩺ܽ;->֫:Ljava/util/List;

    .line 156
    invoke-static {v11}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v15, Ll/ۘ᩺ܽ;->ܳ:Ljava/util/List;

    move-object/from16 v1, v23

    move-object/from16 v23, v2

    move-object/from16 v2, v22

    move-object/from16 v40, v3

    move-object/from16 v26, v30

    move-object/from16 v3, v21

    move-object/from16 v22, v4

    move-object/from16 v4, v20

    move-object/from16 v34, v27

    move-object/from16 v32, v28

    move-object/from16 v27, v25

    move-object/from16 v5, v19

    move-object/from16 v36, v6

    move-object/from16 v6, v17

    move-object/from16 v17, v7

    move-object/from16 v7, v18

    .line 172
    invoke-static/range {v1 .. v7}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v1

    iput-object v1, v15, Ll/ۘ᩺ܽ;->᩷:Ljava/util/List;

    move-object/from16 v19, v13

    move-object/from16 v20, v9

    move-object/from16 v21, v17

    move-object/from16 v24, v16

    move-object/from16 v25, v11

    .line 173
    invoke-static/range {v19 .. v25}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v1

    iput-object v1, v15, Ll/ۘ᩺ܽ;->ۜ:Ljava/util/List;

    move-object/from16 v28, v0

    move-object/from16 v30, v27

    .line 174
    invoke-static/range {v28 .. v34}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v0

    iput-object v0, v15, Ll/ۘ᩺ܽ;->ۢ:Ljava/util/List;

    move-object/from16 v34, v14

    move-object/from16 v35, v26

    move-object/from16 v37, v8

    move-object/from16 v38, v10

    move-object/from16 v39, v12

    .line 175
    invoke-static/range {v34 .. v40}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v0

    iput-object v0, v15, Ll/ۘ᩺ܽ;->ۡ:Ljava/util/List;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)I
    .locals 9

    .line 179
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x6

    const/4 v2, 0x5

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, -0x1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "Z"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 p0, 0x8

    goto/16 :goto_1

    :sswitch_1
    const-string v0, "V"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x7

    goto :goto_1

    :sswitch_2
    const-string v0, "S"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    const/4 p0, 0x6

    goto :goto_1

    :sswitch_3
    const-string v0, "J"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    const/4 p0, 0x5

    goto :goto_1

    :sswitch_4
    const-string v0, "I"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_0

    :cond_4
    const/4 p0, 0x4

    goto :goto_1

    :sswitch_5
    const-string v0, "F"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_0

    :cond_5
    const/4 p0, 0x3

    goto :goto_1

    :sswitch_6
    const-string v0, "D"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto :goto_0

    :cond_6
    const/4 p0, 0x2

    goto :goto_1

    :sswitch_7
    const-string v0, "C"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto :goto_0

    :cond_7
    const/4 p0, 0x1

    goto :goto_1

    :sswitch_8
    const-string v0, "B"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    goto :goto_0

    :cond_8
    const/4 p0, 0x0

    goto :goto_1

    :goto_0
    const/4 p0, -0x1

    :goto_1
    packed-switch p0, :pswitch_data_0

    return v1

    :pswitch_0
    return v7

    :pswitch_1
    return v8

    :pswitch_2
    return v4

    :pswitch_3
    return v5

    :pswitch_4
    return v6

    :pswitch_5
    return v2

    :pswitch_6
    return v3

    :sswitch_data_0
    .sparse-switch
        0x42 -> :sswitch_8
        0x43 -> :sswitch_7
        0x44 -> :sswitch_6
        0x46 -> :sswitch_5
        0x49 -> :sswitch_4
        0x4a -> :sswitch_3
        0x53 -> :sswitch_2
        0x56 -> :sswitch_1
        0x5a -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_6
        :pswitch_2
        :pswitch_6
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ll/ۧۧۚ;I)I
    .locals 1

    .line 335
    instance-of v0, p0, Ll/ۤ֫ۚ;

    if-eqz v0, :cond_5

    .line 336
    check-cast p0, Ll/ۤ֫ۚ;

    .line 337
    invoke-interface {p0}, Ll/ۜۧۚ;->᩻()I

    move-result v0

    if-lt p1, v0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_4

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_7

    .line 349
    invoke-interface {p0}, Ll/ۤ֫ۚ;->ۧ()I

    move-result p0

    return p0

    .line 347
    :cond_1
    invoke-interface {p0}, Ll/ۤ֫ۚ;->ܿ()I

    move-result p0

    return p0

    .line 345
    :cond_2
    invoke-interface {p0}, Ll/ۤ֫ۚ;->ܳ()I

    move-result p0

    return p0

    .line 343
    :cond_3
    invoke-interface {p0}, Ll/ۤ֫ۚ;->ܽ()I

    move-result p0

    return p0

    .line 341
    :cond_4
    invoke-interface {p0}, Ll/ۤ֫ۚ;->ᩳ()I

    move-result p0

    return p0

    .line 351
    :cond_5
    instance-of v0, p0, Ll/ܽۧۚ;

    if-eqz v0, :cond_7

    .line 352
    check-cast p0, Ll/ܽۧۚ;

    .line 353
    invoke-interface {p0}, Ll/ۜۧۚ;->᩻()I

    move-result v0

    if-lt p1, v0, :cond_6

    :goto_0
    const/4 p0, -0x1

    return p0

    .line 355
    :cond_6
    invoke-interface {p0}, Ll/ܽۧۚ;->ᩴ()I

    move-result p0

    add-int/2addr p0, p1

    return p0

    .line 357
    :cond_7
    new-instance p0, Ljava/lang/RuntimeException;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0
.end method

.method public static bridge synthetic ֫(Ll/᩵ۡۚ;Ll/ۚܽۚ;IZLl/֨۫֡;I)V
    .locals 0

    .line 0
    invoke-static/range {p0 .. p5}, Ll/ۘ᩺ܽ;->ۧ(Ll/᩵ۡۚ;Ll/ۚܽۚ;IZLl/֨۫֡;I)V

    return-void
.end method

.method public static ۧ(Ll/᩵ۡۚ;Ll/ۚܽۚ;IZLl/֨۫֡;I)V
    .locals 9

    .line 298
    iget-object p0, p0, Ll/᩸ۜۚ;->ۙ:Ll/ۗۢۚ;

    invoke-virtual {p0, p1}, Ll/ۗۢۚ;->ᩳ(Ll/ۚܽۚ;)Ll/۫ۢۚ;

    move-result-object v8

    const/4 p0, 0x2

    const/16 p1, 0xf

    if-nez p3, :cond_0

    if-le p2, p1, :cond_1

    :cond_0
    if-ge p2, p1, :cond_4

    .line 301
    :cond_1
    new-instance p0, Ll/֨ۤ֡;

    sget-object v1, Ll/֨ۗ֡;->֨ᩳ:Ll/֨ۗ֡;

    if-eqz p3, :cond_2

    const/4 p1, 0x2

    const/4 v2, 0x2

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    const/4 v2, 0x1

    :goto_0
    if-eqz p3, :cond_3

    add-int/lit8 p1, p2, 0x1

    move v4, p1

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    const/4 v4, 0x0

    :goto_1
    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move v3, p2

    invoke-direct/range {v0 .. v8}, Ll/֨ۤ֡;-><init>(Ll/֨ۗ֡;IIIIIILl/۠ܽۚ;)V

    goto :goto_3

    .line 303
    :cond_4
    new-instance p1, Ll/᩸ۤ֡;

    sget-object v0, Ll/֨ۗ֡;->۠ᩳ:Ll/֨ۗ֡;

    if-eqz p3, :cond_5

    goto :goto_2

    :cond_5
    const/4 p0, 0x1

    :goto_2
    invoke-direct {p1, v0, p2, p0, v8}, Ll/᩸ۤ֡;-><init>(Ll/֨ۗ֡;IILl/۠ܽۚ;)V

    move-object p0, p1

    .line 305
    :goto_3
    invoke-virtual {p4, p5, p0}, Ll/֨۫֡;->֫(ILl/۟۬֡;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۧۧۚ;)Ljava/util/ArrayList;
    .locals 13

    .line 309
    invoke-interface {p1}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v0

    .line 310
    invoke-interface {p1}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object v1

    check-cast v1, Ll/ۚܽۚ;

    .line 311
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 313
    invoke-interface {v1}, Ll/ۚܽۚ;->ۘ()Ljava/util/List;

    move-result-object v3

    .line 314
    sget-object v4, Ll/֨ۗ֡;->֨ᩳ:Ll/֨ۗ֡;

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eq v0, v4, :cond_0

    sget-object v4, Ll/֨ۗ֡;->۠ᩳ:Ll/֨ۗ֡;

    if-eq v0, v4, :cond_0

    .line 315
    invoke-static {p1, v6}, Ll/ۘ᩺ܽ;->֫(Ll/ۧۧۚ;I)I

    move-result v10

    .line 316
    invoke-interface {v1}, Ll/ۚܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۘ᩺ܽ;->֫(Ljava/lang/String;)I

    move-result v11

    .line 317
    new-instance v0, Ll/ۖ᩺ܽ;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v9

    const/4 v12, 0x0

    move-object v7, v0

    move-object v8, p0

    invoke-direct/range {v7 .. v12}, Ll/ۖ᩺ܽ;-><init>(Ll/ۘ᩺ܽ;IIIZ)V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 319
    :goto_0
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    add-int/lit8 v4, v0, 0x1

    .line 320
    invoke-static {p1, v0}, Ll/ۘ᩺ܽ;->֫(Ll/ۧۧۚ;I)I

    move-result v9

    .line 321
    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/ۘ᩺ܽ;->֫(Ljava/lang/String;)I

    move-result v10

    const/4 v3, 0x3

    if-eq v10, v3, :cond_3

    if-ne v10, v5, :cond_2

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v3, 0x1

    .line 323
    :goto_2
    new-instance v12, Ll/ۖ᩺ܽ;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v8

    move-object v6, v12

    move-object v7, p0

    move v11, v3

    invoke-direct/range {v6 .. v11}, Ll/ۖ᩺ܽ;-><init>(Ll/ۘ᩺ܽ;IIIZ)V

    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v3, :cond_4

    add-int/lit8 v0, v0, 0x2

    goto :goto_3

    :cond_4
    move v0, v4

    .line 327
    :goto_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x6

    if-ne v3, v4, :cond_1

    :cond_5
    return-object v2
.end method

.method public final ֫(Ll/᩵ۡۚ;Ll/۟۬֡;Ll/֨۫֡;I)Z
    .locals 8

    .line 274
    move-object v0, p2

    check-cast v0, Ll/ۧۧۚ;

    invoke-interface {v0}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object v0

    check-cast v0, Ll/ᩴܽۚ;

    invoke-interface {v0}, Ll/ᩴܽۚ;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۘ᩺ܽ;->֫(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    return v2

    .line 278
    :cond_0
    check-cast p2, Ll/֫ۧۚ;

    invoke-interface {p2}, Ll/֫ۧۚ;->֫()I

    move-result v3

    const/4 p2, 0x3

    const/4 v7, 0x1

    if-eq v0, p2, :cond_2

    if-ne v0, v7, :cond_1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    const/4 v4, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p2, 0x1

    const/4 v4, 0x1

    .line 280
    :goto_1
    iget-object p2, p0, Ll/ۘ᩺ܽ;->ۢ:Ljava/util/List;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    move-object v2, p2

    check-cast v2, Ll/ۚܽۚ;

    move-object v1, p1

    move-object v5, p3

    move v6, p4

    .line 281
    invoke-static/range {v1 .. v6}, Ll/ۘ᩺ܽ;->ۧ(Ll/᩵ۡۚ;Ll/ۚܽۚ;IZLl/֨۫֡;I)V

    return v7
.end method

.method public final ֫(Ll/᩵ۡۚ;Ll/ۧۧۚ;Ll/֫ۧۚ;Ll/֨۫֡;I)Z
    .locals 8

    .line 239
    invoke-interface {p2}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object p2

    check-cast p2, Ll/ۚܽۚ;

    invoke-interface {p2}, Ll/ۚܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ll/ۘ᩺ܽ;->֫(Ljava/lang/String;)I

    move-result p2

    const/4 v0, -0x1

    const/4 v1, 0x0

    if-ne p2, v0, :cond_0

    return v1

    .line 243
    :cond_0
    invoke-interface {p3}, Ll/֫ۧۚ;->֫()I

    move-result v4

    const/4 p3, 0x3

    const/4 v0, 0x1

    if-eq p2, p3, :cond_2

    if-ne p2, v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p3, 0x0

    const/4 v5, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p3, 0x1

    const/4 v5, 0x1

    .line 245
    :goto_1
    iget-object p3, p0, Ll/ۘ᩺ܽ;->᩷:Ljava/util/List;

    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    move-object v3, p2

    check-cast v3, Ll/ۚܽۚ;

    move-object v2, p1

    move-object v6, p4

    move v7, p5

    .line 246
    invoke-static/range {v2 .. v7}, Ll/ۘ᩺ܽ;->ۧ(Ll/᩵ۡۚ;Ll/ۚܽۚ;IZLl/֨۫֡;I)V

    .line 248
    invoke-virtual {p4}, Ll/֨۫֡;->֫()Ljava/util/ArrayList;

    move-result-object p1

    .line 250
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    sub-int/2addr p2, v0

    const/4 p3, 0x0

    move-object v1, p3

    :goto_2
    if-ltz p2, :cond_7

    .line 251
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽ۫֡;

    .line 252
    iget-object v3, v2, Ll/ܽ۫֡;->ܽ:Ll/ܿ۫֡;

    iget-object v4, v2, Ll/ܽ۫֡;->ۧ:Ll/ܰ۬֡;

    iget-object v5, v2, Ll/ܽ۫֡;->֫:Ll/ܿ۫֡;

    invoke-virtual {v3}, Ll/ܿ۫֡;->ܳ()Ll/ܺ۫֡;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܺ۫֡;->ܽ()I

    move-result v3

    .line 253
    invoke-virtual {v5}, Ll/ܿ۫֡;->ܳ()Ll/ܺ۫֡;

    move-result-object v6

    invoke-virtual {v6}, Ll/ܺ۫֡;->ܽ()I

    move-result v6

    if-lt p5, v3, :cond_6

    if-ge p5, v6, :cond_6

    .line 255
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    if-eq p5, v3, :cond_4

    if-nez p3, :cond_3

    .line 258
    invoke-virtual {p4, p5}, Ll/֨۫֡;->֫(I)Ll/ܿ۫֡;

    move-result-object p3

    .line 260
    :cond_3
    new-instance v3, Ll/ܽ۫֡;

    iget-object v2, v2, Ll/ܽ۫֡;->ܽ:Ll/ܿ۫֡;

    invoke-direct {v3, v2, p3, v4}, Ll/ܽ۫֡;-><init>(Ll/ܿ۫֡;Ll/ܿ۫֡;Ll/ܰ۬֡;)V

    invoke-virtual {p1, p2, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    :cond_4
    add-int/lit8 v2, p5, 0x1

    if-eq v2, v6, :cond_6

    if-nez v1, :cond_5

    .line 264
    invoke-virtual {p4, v2}, Ll/֨۫֡;->֫(I)Ll/ܿ۫֡;

    move-result-object v1

    .line 266
    :cond_5
    new-instance v2, Ll/ܽ۫֡;

    invoke-direct {v2, v1, v5, v4}, Ll/ܽ۫֡;-><init>(Ll/ܿ۫֡;Ll/ܿ۫֡;Ll/ܰ۬֡;)V

    invoke-virtual {p1, p2, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    :cond_6
    add-int/lit8 p2, p2, -0x1

    goto :goto_2

    :cond_7
    return v0
.end method

.method public final ۧ(Ll/᩵ۡۚ;Ll/۟۬֡;Ll/֨۫֡;I)Z
    .locals 8

    .line 286
    move-object v0, p2

    check-cast v0, Ll/ۧۧۚ;

    invoke-interface {v0}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object v0

    check-cast v0, Ll/ᩴܽۚ;

    invoke-interface {v0}, Ll/ᩴܽۚ;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۘ᩺ܽ;->֫(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    return v2

    .line 290
    :cond_0
    check-cast p2, Ll/֫ۧۚ;

    invoke-interface {p2}, Ll/֫ۧۚ;->֫()I

    move-result v3

    const/4 p2, 0x3

    const/4 v7, 0x1

    if-eq v0, p2, :cond_2

    if-ne v0, v7, :cond_1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    const/4 v4, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p2, 0x1

    const/4 v4, 0x1

    .line 292
    :goto_1
    iget-object p2, p0, Ll/ۘ᩺ܽ;->ۡ:Ljava/util/List;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    move-object v2, p2

    check-cast v2, Ll/ۚܽۚ;

    move-object v1, p1

    move-object v5, p3

    move v6, p4

    .line 293
    invoke-static/range {v1 .. v6}, Ll/ۘ᩺ܽ;->ۧ(Ll/᩵ۡۚ;Ll/ۚܽۚ;IZLl/֨۫֡;I)V

    return v7
.end method
