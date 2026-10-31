.class public final Ll/ۡ᩻֡;
.super Ljava/lang/Object;
.source "KATI"


# instance fields
.field public final ֫:Ll/᩸ܳ֡;


# direct methods
.method public constructor <init>(Ll/᩸ܳ֡;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡ᩻֡;->֫:Ll/᩸ܳ֡;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩺ܳ֡;Ll/ܽۜ֡;Ll/᩻᩷֡;Ljava/util/HashSet;Ljava/util/BitSet;)V
    .locals 16

    move-object/from16 v1, p1

    move-object/from16 v0, p2

    move-object/from16 v8, p3

    move-object/from16 v9, p0

    move-object/from16 v10, p5

    .line 146
    iget-object v11, v9, Ll/ۡ᩻֡;->֫:Ll/᩸ܳ֡;

    iget v12, v11, Ll/᩸ܳ֡;->ᩳ:I

    new-instance v2, Ll/᩹ܳ֡;

    const/4 v13, 0x0

    invoke-direct {v2, v1, v13, v0}, Ll/᩹ܳ֡;-><init>(Ll/᩺ܳ֡;ILl/ܽۜ֡;)V

    move-object/from16 v14, p4

    .line 147
    invoke-virtual {v14, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_8

    :cond_0
    const/4 v2, -0x1

    const/4 v3, -0x2

    if-nez v1, :cond_2

    if-nez v0, :cond_1

    .line 151
    invoke-virtual {v8, v3}, Ll/᩻᩷֡;->֫(I)V

    return-void

    .line 154
    :cond_1
    invoke-virtual/range {p2 .. p2}, Ll/ܽۜ֡;->ۧ()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 155
    invoke-virtual {v8, v2}, Ll/᩻᩷֡;->֫(I)V

    return-void

    .line 160
    :cond_2
    instance-of v4, v1, Ll/ۢۜ֡;

    if-eqz v4, :cond_7

    if-nez v0, :cond_3

    .line 162
    invoke-virtual {v8, v3}, Ll/᩻᩷֡;->֫(I)V

    return-void

    .line 165
    :cond_3
    invoke-virtual/range {p2 .. p2}, Ll/ܽۜ֡;->ۧ()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 166
    invoke-virtual {v8, v2}, Ll/᩻᩷֡;->֫(I)V

    return-void

    .line 170
    :cond_4
    sget-object v2, Ll/᩷᩻֡;->ܿ:Ll/᩷᩻֡;

    if-eq v0, v2, :cond_7

    .line 172
    iget v2, v1, Ll/᩺ܳ֡;->ᩳ:I

    invoke-virtual {v10, v2}, Ljava/util/BitSet;->get(I)Z

    move-result v12

    .line 174
    :try_start_0
    iget v2, v1, Ll/᩺ܳ֡;->ᩳ:I

    invoke-virtual {v10, v2}, Ljava/util/BitSet;->clear(I)V

    .line 175
    :goto_0
    invoke-virtual/range {p2 .. p2}, Ll/ܽۜ֡;->ܽ()I

    move-result v2

    if-ge v13, v2, :cond_5

    .line 176
    iget-object v2, v11, Ll/᩸ܳ֡;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0, v13}, Ll/ܽۜ֡;->ۧ(I)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ll/᩺ܳ֡;

    .line 178
    invoke-virtual {v0, v13}, Ll/ܽۜ֡;->֫(I)Ll/ܽۜ֡;

    move-result-object v4

    move-object/from16 v2, p0

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    invoke-virtual/range {v2 .. v7}, Ll/ۡ᩻֡;->֫(Ll/᩺ܳ֡;Ll/ܽۜ֡;Ll/᩻᩷֡;Ljava/util/HashSet;Ljava/util/BitSet;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_5
    if-eqz v12, :cond_11

    .line 183
    iget v0, v1, Ll/᩺ܳ֡;->ᩳ:I

    invoke-virtual {v10, v0}, Ljava/util/BitSet;->set(I)V

    return-void

    :goto_1
    if-eqz v12, :cond_6

    iget v1, v1, Ll/᩺ܳ֡;->ᩳ:I

    invoke-virtual {v10, v1}, Ljava/util/BitSet;->set(I)V

    .line 185
    :cond_6
    throw v0

    .line 154
    :cond_7
    iget-object v2, v1, Ll/᩺ܳ֡;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v11

    const/4 v2, 0x0

    const/4 v15, 0x0

    :goto_2
    if-ge v15, v11, :cond_11

    .line 192
    invoke-virtual {v1, v15}, Ll/᩺ܳ֡;->֫(I)Ll/۬ۜ֡;

    move-result-object v2

    .line 193
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-class v4, Ll/ۡۜ֡;

    if-ne v3, v4, :cond_9

    .line 194
    move-object v7, v2

    check-cast v7, Ll/ۡۜ֡;

    iget-object v3, v7, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    iget v3, v3, Ll/᩺ܳ֡;->ᩳ:I

    invoke-virtual {v10, v3}, Ljava/util/BitSet;->get(I)Z

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_4

    .line 198
    :cond_8
    iget-object v3, v7, Ll/ۡۜ֡;->ܽ:Ll/᩺ܳ֡;

    iget v3, v3, Ll/᩺ܳ֡;->ܿ:I

    .line 199
    invoke-static {v0, v3}, Ll/۠ۜ֡;->֫(Ll/ܽۜ֡;I)Ll/۠ۜ֡;

    move-result-object v4

    .line 202
    :try_start_1
    move-object v3, v2

    check-cast v3, Ll/ۡۜ֡;

    iget-object v3, v3, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    iget v3, v3, Ll/᩺ܳ֡;->ᩳ:I

    invoke-virtual {v10, v3}, Ljava/util/BitSet;->set(I)V

    .line 203
    iget-object v3, v2, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-object/from16 v2, p0

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object v13, v7

    move-object/from16 v7, p5

    :try_start_2
    invoke-virtual/range {v2 .. v7}, Ll/ۡ᩻֡;->֫(Ll/᩺ܳ֡;Ll/ܽۜ֡;Ll/᩻᩷֡;Ljava/util/HashSet;Ljava/util/BitSet;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 206
    iget-object v2, v13, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    iget v2, v2, Ll/᩺ܳ֡;->ᩳ:I

    invoke-virtual {v10, v2}, Ljava/util/BitSet;->clear(I)V

    goto :goto_4

    :catchall_1
    move-exception v0

    goto :goto_3

    :catchall_2
    move-exception v0

    move-object v13, v7

    :goto_3
    iget-object v1, v13, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    iget v1, v1, Ll/᩺ܳ֡;->ᩳ:I

    invoke-virtual {v10, v1}, Ljava/util/BitSet;->clear(I)V

    .line 207
    throw v0

    .line 209
    :cond_9
    instance-of v3, v2, Ll/۟ܳ֡;

    if-eqz v3, :cond_a

    .line 211
    iget-object v3, v2, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    move-object/from16 v2, p0

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    invoke-virtual/range {v2 .. v7}, Ll/ۡ᩻֡;->֫(Ll/᩺ܳ֡;Ll/ܽۜ֡;Ll/᩻᩷֡;Ljava/util/HashSet;Ljava/util/BitSet;)V

    :goto_4
    const/4 v3, 0x0

    goto :goto_7

    .line 217
    :cond_a
    invoke-virtual {v2}, Ll/۬ۜ֡;->ۧ()Z

    move-result v3

    if-eqz v3, :cond_b

    .line 218
    iget-object v3, v2, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    move-object/from16 v2, p0

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    invoke-virtual/range {v2 .. v7}, Ll/ۡ᩻֡;->֫(Ll/᩺ܳ֡;Ll/ܽۜ֡;Ll/᩻᩷֡;Ljava/util/HashSet;Ljava/util/BitSet;)V

    goto :goto_4

    .line 220
    :cond_b
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-class v4, Ll/۫ۜ֡;

    const/4 v5, 0x1

    if-ne v3, v4, :cond_c

    .line 77
    new-instance v2, Ll/᩻᩷֡;

    const/4 v3, 0x0

    new-array v4, v3, [I

    invoke-direct {v2, v4}, Ll/᩻᩷֡;-><init>([I)V

    .line 78
    invoke-virtual {v2, v5, v12}, Ll/᩻᩷֡;->֫(II)V

    .line 221
    invoke-virtual {v8, v2}, Ll/᩻᩷֡;->֫(Ll/᩻᩷֡;)V

    goto :goto_7

    :cond_c
    const/4 v3, 0x0

    .line 225
    invoke-virtual {v2}, Ll/۬ۜ֡;->ܽ()Ll/᩻᩷֡;

    move-result-object v4

    if-eqz v4, :cond_10

    .line 227
    instance-of v2, v2, Ll/۫᩻֡;

    if-eqz v2, :cond_f

    .line 77
    new-instance v2, Ll/᩻᩷֡;

    new-array v6, v3, [I

    invoke-direct {v2, v6}, Ll/᩻᩷֡;-><init>([I)V

    .line 78
    invoke-virtual {v2, v5, v12}, Ll/᩻᩷֡;->֫(II)V

    .line 192
    invoke-virtual {v2}, Ll/᩻᩷֡;->ۧ()Z

    move-result v5

    if-eqz v5, :cond_d

    const/4 v2, 0x0

    :goto_5
    move-object v4, v2

    goto :goto_6

    .line 210
    :cond_d
    invoke-virtual {v4}, Ll/᩻᩷֡;->ۧ()Z

    move-result v5

    if-eqz v5, :cond_e

    .line 211
    new-instance v4, Ll/᩻᩷֡;

    invoke-direct {v4, v2}, Ll/᩻᩷֡;-><init>(Ll/᩻᩷֡;)V

    goto :goto_6

    .line 215
    :cond_e
    invoke-static {v2, v4}, Ll/᩻᩷֡;->֫(Ll/᩻᩷֡;Ll/᩻᩷֡;)Ll/᩻᩷֡;

    move-result-object v2

    goto :goto_5

    .line 230
    :cond_f
    :goto_6
    invoke-virtual {v8, v4}, Ll/᩻᩷֡;->֫(Ll/᩻᩷֡;)V

    :cond_10
    :goto_7
    add-int/lit8 v15, v15, 0x1

    const/4 v13, 0x0

    goto/16 :goto_2

    :cond_11
    :goto_8
    return-void
.end method
