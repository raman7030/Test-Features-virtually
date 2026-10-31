.class public final Ll/ܺ֫ᩳ;
.super Ll/۟ܶۡ;
.source "B9R5"


# instance fields
.field public final synthetic ܳ:Ll/֨֫ᩳ;


# direct methods
.method public constructor <init>(Ll/֨֫ᩳ;)V
    .locals 0

    .line 122
    iput-object p1, p0, Ll/ܺ֫ᩳ;->ܳ:Ll/֨֫ᩳ;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 214
    iget-object v0, p0, Ll/ܺ֫ᩳ;->ܳ:Ll/֨֫ᩳ;

    invoke-static {v0}, Ll/֨֫ᩳ;->ܿ(Ll/֨֫ᩳ;)Ll/ۢۢۡ;

    move-result-object v1

    new-instance v2, Ll/᩵֫ᩳ;

    invoke-direct {v2, v0}, Ll/᩵֫ᩳ;-><init>(Ll/֨֫ᩳ;)V

    invoke-virtual {v1, v2}, Ll/ۢۢۡ;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 219
    iget-object v0, p0, Ll/ܺ֫ᩳ;->ܳ:Ll/֨֫ᩳ;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Z)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 126
    iget-object v0, p0, Ll/ܺ֫ᩳ;->ܳ:Ll/֨֫ᩳ;

    const v1, 0x7f1203b0

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 23

    .line 131
    invoke-static {}, Ll/֨֫ᩳ;->ۨ()Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    .line 132
    invoke-static {}, Ll/֨֫ᩳ;->ۨ()Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۛ()V

    move-object/from16 v0, p0

    .line 133
    iget-object v1, v0, Ll/ܺ֫ᩳ;->ܳ:Ll/֨֫ᩳ;

    invoke-static {v1}, Ll/֨֫ᩳ;->ᩳ(Ll/֨֫ᩳ;)Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v2

    const/4 v3, 0x0

    .line 51
    invoke-static {v2, v3}, Ll/֡ۤۡ;->֫(Ljava/io/InputStream;I)[B

    move-result-object v2

    .line 134
    new-instance v3, Ll/᩺᩻ܽ;

    invoke-direct {v3, v2}, Ll/᩺᩻ܽ;-><init>([B)V

    .line 135
    invoke-virtual {v3}, Ll/᩺᩻ܽ;->ܳ()V

    .line 136
    invoke-static {}, Ll/֨֫ᩳ;->ۨ()Ll/ܶ᩵ܿ;

    move-result-object v4

    const-string v5, "arsc"

    invoke-virtual {v4, v5}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    .line 137
    invoke-virtual {v4, v2}, Ll/ܶ᩵ܿ;->֫([B)V

    .line 138
    new-instance v2, Ll/ᩳ֫ᩳ;

    invoke-direct {v2, v3}, Ll/ᩳ֫ᩳ;-><init>(Ll/᩺᩻ܽ;)V

    .line 139
    invoke-virtual {v3}, Ll/ۡᩳܽ;->᩺()Ljava/lang/Iterable;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_12

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۘ᩻ܽ;

    .line 140
    invoke-interface {v4}, Ll/ۘ᩻ܽ;->ۖۧ()Ljava/lang/Iterable;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֡᩻ܽ;

    .line 141
    invoke-interface {v5}, Ll/֡᩻ܽ;->getTypeName()Ljava/lang/String;

    move-result-object v6

    const-string v7, "string"

    .line 142
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    const-string v8, "plurals"

    const-string v9, "array"

    if-nez v7, :cond_0

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_0

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_10

    .line 143
    :cond_0
    invoke-interface {v5}, Ll/֡᩻ܽ;->ۢ()Ljava/lang/Iterable;

    move-result-object v5

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_10

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۜ᩻ܽ;

    .line 159
    invoke-interface {v6}, Ll/ۜ᩻ܽ;->۟()Ll/᩸ܽܽ;

    move-result-object v7

    invoke-virtual {v7}, Ll/᩸ܽܽ;->toString()Ljava/lang/String;

    move-result-object v7

    .line 161
    invoke-virtual {v2, v7}, Ll/ᩳ֫ᩳ;->֫(Ljava/lang/String;)Ll/֫֫ᩳ;

    move-result-object v10

    .line 163
    invoke-static {v1}, Ll/֨֫ᩳ;->ܳ(Ll/֨֫ᩳ;)Ljava/util/HashMap;

    move-result-object v11

    invoke-virtual {v11, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/۠֫ᩳ;

    .line 164
    invoke-interface {v6}, Ll/ۜ᩻ܽ;->getType()Ll/֡᩻ܽ;

    move-result-object v12

    invoke-interface {v12}, Ll/֡᩻ܽ;->getTypeName()Ljava/lang/String;

    move-result-object v12

    .line 166
    invoke-interface {v6}, Ll/ۜ᩻ܽ;->ᩳ()Ljava/lang/Iterable;

    move-result-object v13

    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_3
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_f

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/᩷᩻ܽ;

    .line 168
    invoke-interface {v14}, Ll/᩷᩻ܽ;->values()Ljava/lang/Iterable;

    move-result-object v15

    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    const/16 v16, -0x1

    :goto_4
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_e

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Ll/֨᩻ܽ;

    add-int/lit8 v0, v16, 0x1

    .line 170
    invoke-interface/range {v17 .. v17}, Ll/֨᩻ܽ;->ᩳ֫()Z

    move-result v16

    if-nez v16, :cond_1

    move-object/from16 v18, v2

    move-object/from16 v16, v3

    goto :goto_5

    .line 172
    :cond_1
    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v16

    move-object/from16 v18, v2

    const v2, 0x1000004

    if-eqz v16, :cond_3

    move-object/from16 v16, v3

    .line 173
    invoke-interface/range {v17 .. v17}, Ll/֨᩻ܽ;->ۡ֫()I

    move-result v3

    if-lt v3, v2, :cond_2

    const v2, 0x1000009

    if-le v3, v2, :cond_4

    :cond_2
    :goto_5
    move-object/from16 v19, v4

    move-object/from16 v20, v5

    move-object/from16 v21, v13

    goto :goto_7

    :cond_3
    move-object/from16 v16, v3

    :cond_4
    const v2, 0x1000004

    .line 178
    invoke-interface/range {v17 .. v17}, Ll/֨᩻ܽ;->ܿۧ()Ll/ۗ᩻ܽ;

    move-result-object v3

    .line 179
    invoke-interface {v3}, Ll/ۗ᩻ܽ;->᩺֫()Z

    move-result v19

    if-nez v19, :cond_6

    .line 180
    invoke-interface {v3}, Ll/ۗ᩻ܽ;->getValue()Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v19 .. v19}, Ll/ۢ۟ܽ;->֫(Ljava/lang/String;)Z

    move-result v19

    if-nez v19, :cond_6

    move-object/from16 v19, v4

    .line 194
    iget-object v4, v10, Ll/֫֫ᩳ;->֫:Ljava/util/Map;

    if-nez v4, :cond_5

    const/4 v4, 0x0

    move-object/from16 v20, v5

    move-object/from16 v21, v13

    goto :goto_6

    :cond_5
    move-object/from16 v20, v5

    .line 197
    new-instance v5, Ll/ۧ֫ᩳ;

    move-object/from16 v21, v13

    invoke-interface {v14}, Ll/᩷᩻ܽ;->ۧ֫()I

    move-result v13

    invoke-direct {v5, v13, v0}, Ll/ۧ֫ᩳ;-><init>(II)V

    invoke-interface {v4, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    :goto_6
    if-nez v4, :cond_7

    :goto_7
    move-object/from16 v22, v6

    move-object/from16 v17, v7

    goto/16 :goto_c

    :cond_6
    move-object/from16 v19, v4

    move-object/from16 v20, v5

    move-object/from16 v21, v13

    :cond_7
    if-nez v11, :cond_8

    .line 186
    invoke-static {v1}, Ll/֨֫ᩳ;->ܽ(Ll/֨֫ᩳ;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 187
    new-instance v11, Ll/۠֫ᩳ;

    invoke-interface {v6}, Ll/ۜ᩻ܽ;->۟()Ll/᩸ܽܽ;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩸ܽܽ;->ܽ()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v11, v4}, Ll/۠֫ᩳ;-><init>(Ljava/lang/String;)V

    .line 188
    invoke-static {v1}, Ll/֨֫ᩳ;->ܳ(Ll/֨֫ᩳ;)Ljava/util/HashMap;

    move-result-object v4

    invoke-virtual {v4, v7, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    :cond_8
    new-instance v4, Ll/ܶ֫ᩳ;

    invoke-direct {v4}, Ll/ܶ֫ᩳ;-><init>()V

    .line 191
    invoke-interface {v14}, Ll/᩷᩻ܽ;->ۧ֫()I

    move-result v5

    iput v5, v4, Ll/ܶ֫ᩳ;->֫:I

    .line 192
    iput v0, v4, Ll/ܶ֫ᩳ;->ܿ:I

    .line 193
    invoke-interface {v14}, Ll/᩷᩻ܽ;->۟֫()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Ll/ܶ֫ᩳ;->ܽ:Ljava/lang/String;

    .line 194
    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    const-string v13, "]"

    move-object/from16 v22, v6

    const-string v6, "["

    if-eqz v5, :cond_9

    .line 195
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "array:"

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, v4, Ll/ܶ֫ᩳ;->ܽ:Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v4, Ll/ܶ֫ᩳ;->ܽ:Ljava/lang/String;

    goto :goto_8

    .line 196
    :cond_9
    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    .line 197
    invoke-interface/range {v17 .. v17}, Ll/֨᩻ܽ;->ۡ֫()I

    move-result v5

    sub-int/2addr v5, v2

    .line 198
    new-instance v2, Ljava/lang/StringBuilder;

    move-object/from16 v17, v7

    const-string v7, "plurals:"

    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v7, v4, Ll/ܶ֫ᩳ;->ܽ:Ljava/lang/String;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v6, Ll/֨᩻ܽ;->ܳ:[Ljava/lang/String;

    aget-object v5, v6, v5

    .line 0
    invoke-static {v2, v5, v13}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 198
    iput-object v2, v4, Ll/ܶ֫ᩳ;->ܽ:Ljava/lang/String;

    goto :goto_9

    :cond_a
    :goto_8
    move-object/from16 v17, v7

    .line 201
    :goto_9
    iget-object v2, v10, Ll/֫֫ᩳ;->֫:Ljava/util/Map;

    if-eqz v2, :cond_b

    .line 202
    new-instance v2, Ll/ۧ֫ᩳ;

    invoke-interface {v14}, Ll/᩷᩻ܽ;->ۧ֫()I

    move-result v5

    invoke-direct {v2, v5, v0}, Ll/ۧ֫ᩳ;-><init>(II)V

    .line 203
    iget-object v5, v10, Ll/֫֫ᩳ;->֫:Ljava/util/Map;

    invoke-interface {v5, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽ֫ᩳ;

    if-eqz v2, :cond_c

    .line 204
    iget-object v5, v2, Ll/ܽ֫ᩳ;->ۧ:Ll/ۗ᩻ܽ;

    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_c

    .line 205
    iget-object v2, v2, Ll/ܽ֫ᩳ;->֫:Ll/ۗ᩻ܽ;

    goto :goto_a

    .line 207
    :cond_b
    iget-object v2, v10, Ll/֫֫ᩳ;->ۧ:Ljava/util/Map;

    if-eqz v2, :cond_c

    .line 208
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۗ᩻ܽ;

    goto :goto_a

    :cond_c
    const/4 v2, 0x0

    :goto_a
    if-eqz v2, :cond_d

    .line 202
    new-instance v5, Ll/᩹֫ᩳ;

    invoke-direct {v5, v2}, Ll/᩹֫ᩳ;-><init>(Ll/ۗ᩻ܽ;)V

    invoke-virtual {v5}, Ll/᩹֫ᩳ;->ܽ()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v4, Ll/ܶ֫ᩳ;->ۧ:Ljava/lang/String;

    .line 203
    new-instance v2, Ll/᩹֫ᩳ;

    invoke-direct {v2, v3}, Ll/᩹֫ᩳ;-><init>(Ll/ۗ᩻ܽ;)V

    invoke-virtual {v2}, Ll/᩹֫ᩳ;->ܽ()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v4, Ll/ܶ֫ᩳ;->ᩳ:Ljava/lang/String;

    goto :goto_b

    .line 205
    :cond_d
    new-instance v2, Ll/᩹֫ᩳ;

    invoke-direct {v2, v3}, Ll/᩹֫ᩳ;-><init>(Ll/ۗ᩻ܽ;)V

    invoke-virtual {v2}, Ll/᩹֫ᩳ;->ܽ()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v4, Ll/ܶ֫ᩳ;->ۧ:Ljava/lang/String;

    .line 207
    :goto_b
    invoke-virtual {v11, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :goto_c
    move-object/from16 v3, v16

    move-object/from16 v7, v17

    move-object/from16 v2, v18

    move-object/from16 v4, v19

    move-object/from16 v5, v20

    move-object/from16 v13, v21

    move-object/from16 v6, v22

    move/from16 v16, v0

    move-object/from16 v0, p0

    goto/16 :goto_4

    :cond_e
    move-object/from16 v0, p0

    goto/16 :goto_3

    :cond_f
    move-object/from16 v0, p0

    goto/16 :goto_2

    :cond_10
    move-object/from16 v18, v2

    move-object/from16 v16, v3

    move-object/from16 v19, v4

    move-object/from16 v0, p0

    move-object/from16 v3, v16

    move-object/from16 v2, v18

    move-object/from16 v4, v19

    goto/16 :goto_1

    :cond_11
    move-object/from16 v0, p0

    goto/16 :goto_0

    .line 149
    :cond_12
    invoke-static {v1}, Ll/֨֫ᩳ;->ܽ(Ll/֨֫ᩳ;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 151
    invoke-static {v1}, Ll/֨֫ᩳ;->ܳ(Ll/֨֫ᩳ;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۠֫ᩳ;

    .line 152
    invoke-static {}, Ll/֨֫ᩳ;->ۨ()Ll/ܶ᩵ܿ;

    move-result-object v4

    add-int/lit8 v5, v2, 0x1

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 153
    invoke-virtual {v3, v2}, Ll/۠֫ᩳ;->֫(Ll/ܶ᩵ܿ;)V

    move v2, v5

    goto :goto_d

    .line 155
    :cond_13
    invoke-static {v1}, Ll/֨֫ᩳ;->ۜ(Ll/֨֫ᩳ;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ll/֨֫ᩳ;->֫(Ll/֨֫ᩳ;Ljava/lang/String;)V

    return-void
.end method

.method public final ᩳ()V
    .locals 0

    .line 224
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
