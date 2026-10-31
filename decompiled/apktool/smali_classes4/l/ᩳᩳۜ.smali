.class public final Ll/ᩳᩳۜ;
.super Ljava/lang/Object;
.source "G7AI"


# instance fields
.field public final ֫:Ll/ܳܳܽ;

.field public final ۜ:Ljava/util/HashSet;

.field public final ۧ:Ll/ᩴܽۜ;

.field public final ܳ:Ljava/lang/String;

.field public final ܽ:Ll/۬ܽۜ;

.field public ܿ:Ll/᩻᩷ۜ;

.field public final ᩳ:Ll/᩻ۜۜ;

.field public final ᩻:Ll/ۧܿۜ;


# direct methods
.method public constructor <init>(Ll/ᩴܽۜ;Ll/᩻ۜۜ;Ljava/lang/String;Ll/۬ܽۜ;Ljava/util/HashSet;Ll/ۧܿۜ;)V
    .locals 0

    .line 2116
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2117
    iput-object p1, p0, Ll/ᩳᩳۜ;->ۧ:Ll/ᩴܽۜ;

    .line 2118
    iget-object p1, p1, Ll/ᩴܽۜ;->ۧ:Ll/ܳܳܽ;

    iput-object p1, p0, Ll/ᩳᩳۜ;->֫:Ll/ܳܳܽ;

    .line 2119
    iput-object p2, p0, Ll/ᩳᩳۜ;->ᩳ:Ll/᩻ۜۜ;

    .line 2120
    iput-object p3, p0, Ll/ᩳᩳۜ;->ܳ:Ljava/lang/String;

    .line 2121
    iput-object p4, p0, Ll/ᩳᩳۜ;->ܽ:Ll/۬ܽۜ;

    .line 2122
    iput-object p5, p0, Ll/ᩳᩳۜ;->ۜ:Ljava/util/HashSet;

    .line 2123
    iput-object p6, p0, Ll/ᩳᩳۜ;->᩻:Ll/ۧܿۜ;

    return-void
.end method

.method private ֫(Ljava/lang/String;Ljava/lang/String;Ll/ۧᩳۜ;)Ll/ۢᩳۜ;
    .locals 2

    if-eqz p1, :cond_2

    .line 2217
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2220
    :cond_0
    iget-object v0, p0, Ll/ᩳᩳۜ;->᩻:Ll/ۧܿۜ;

    const-string v1, "resource_table_value"

    invoke-virtual {v0, p1, v1}, Ll/ۧܿۜ;->֫(Ljava/lang/CharSequence;Ljava/lang/String;)Ll/֫ܿۜ;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 2221
    :cond_1
    new-instance v1, Ll/ۢᩳۜ;

    invoke-direct {v1, p1, v0, p2, p3}, Ll/ۢᩳۜ;-><init>(Ljava/lang/String;Ll/֫ܿۜ;Ljava/lang/String;Ll/ۧᩳۜ;)V

    return-object v1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private ֫(Ll/ۧᩳۜ;Ll/ۢᩳۜ;)Z
    .locals 12

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return v0

    .line 2228
    :cond_0
    iget-object v4, p2, Ll/ۢᩳۜ;->ܽ:Ljava/lang/String;

    iget-object v1, p2, Ll/ۢᩳۜ;->ۧ:Ll/֫ܿۜ;

    iget v2, v1, Ll/֫ܿۜ;->᩻:I

    .line 2231
    iget-object v3, p2, Ll/ۢᩳۜ;->ᩳ:Ljava/lang/String;

    .line 704
    iget-object v5, p0, Ll/ᩳᩳۜ;->ᩳ:Ll/᩻ۜۜ;

    iget-boolean v6, v5, Ll/᩻ۜۜ;->᩻:Z

    const/4 v7, 0x0

    if-eqz v6, :cond_2

    iget v6, v5, Ll/᩻ۜۜ;->ᩴ:I

    if-lez v6, :cond_2

    if-gez v2, :cond_1

    goto :goto_0

    :cond_1
    const/16 v8, 0x12c

    .line 707
    invoke-static {v6, v8}, Ljava/lang/Math;->min(II)I

    move-result v6

    .line 708
    div-int/lit8 v8, v6, 0x3

    invoke-static {v0, v8}, Ljava/lang/Math;->max(II)I

    move-result v0

    neg-int v0, v0

    .line 709
    invoke-static {v2, v0, v3}, Ll/۠ۨ᩻;->ۧ(IILjava/lang/CharSequence;)I

    move-result v0

    .line 219
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v0, v2, v6, v3}, Ll/۠ۨ᩻;->֫(IIILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0xa

    const/16 v3, 0x20

    .line 710
    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    :goto_0
    move-object v0, v7

    .line 2232
    :goto_1
    iget-object p2, p2, Ll/ۢᩳۜ;->֫:Ll/ۧᩳۜ;

    invoke-static {p1, p2, v4, v0}, Ll/ܽᩳۜ;->֫(Ll/ۧᩳۜ;Ll/ۧᩳۜ;Ljava/lang/String;Ljava/lang/String;)Ll/ܽᩳۜ;

    move-result-object v8

    .line 2244
    iget-boolean p1, v5, Ll/᩻ۜۜ;->ܳ:Z

    if-nez p1, :cond_3

    move-object v5, v7

    goto :goto_2

    .line 2247
    :cond_3
    invoke-virtual {v1}, Ll/֫ܿۜ;->ᩳ()V

    move-object v5, v1

    .line 719
    :goto_2
    new-instance p1, Ll/᩻᩷ۜ;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-string v2, "resource"

    iget-object v3, p0, Ll/ᩳᩳۜ;->ܳ:Ljava/lang/String;

    const/4 v6, 0x0

    iget-object v7, p0, Ll/ᩳᩳۜ;->ܽ:Ll/۬ܽۜ;

    const/4 v9, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v11}, Ll/᩻᩷ۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/֫ܿۜ;Ljava/lang/String;Ll/۬ܽۜ;Ll/ܽᩳۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2234
    iput-object p1, p0, Ll/ᩳᩳۜ;->ܿ:Ll/᩻᩷ۜ;

    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public final ֫(Ll/ۜ᩻ܽ;Ll/᩷᩻ܽ;)Z
    .locals 34

    move-object/from16 v0, p0

    .line 2130
    invoke-static/range {p1 .. p1}, Ll/ۖᩳۜ;->֫(Ll/ۜ᩻ܽ;)Ljava/lang/String;

    move-result-object v17

    .line 2131
    invoke-static/range {p2 .. p2}, Ll/ۡᩳۜ;->֫(Ll/᩷᩻ܽ;)Z

    move-result v1

    const/16 v18, 0x0

    iget-object v15, v0, Ll/ᩳᩳۜ;->ۜ:Ljava/util/HashSet;

    iget-object v14, v0, Ll/ᩳᩳۜ;->ۧ:Ll/ᩴܽۜ;

    const-string v13, "value"

    const-string v12, "styledText"

    iget-object v11, v0, Ll/ᩳᩳۜ;->ܳ:Ljava/lang/String;

    const-string v10, "resource_table_file_path"

    const-string v9, "file_path"

    const/4 v8, 0x0

    const/4 v7, 0x0

    if-eqz v1, :cond_4

    move-object/from16 v6, p2

    .line 2132
    invoke-interface {v6, v7}, Ll/᩷᩻ܽ;->getValue(I)Ll/֨᩻ܽ;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v14

    move-object/from16 v5, v17

    move-object v6, v15

    invoke-static/range {v1 .. v6}, Ll/ۡᩳۜ;->֫(Ll/ᩴܽۜ;Ll/֨᩻ܽ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashSet;)Ll/ۧᩳۜ;

    move-result-object v1

    iget-object v2, v1, Ll/ۧᩳۜ;->ۘ:Ljava/lang/String;

    iget-object v3, v1, Ll/ۧᩳۜ;->ᩴ:Ljava/lang/String;

    .line 2157
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 2204
    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 2205
    invoke-direct {v0, v2, v9, v8}, Ll/ᩳᩳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ll/ۧᩳۜ;)Ll/ۢᩳۜ;

    move-result-object v18

    :cond_0
    :goto_0
    move-object/from16 v2, v18

    goto :goto_2

    .line 2161
    :cond_1
    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 2162
    invoke-direct {v0, v2, v9, v8}, Ll/ᩳᩳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ll/ۧᩳۜ;)Ll/ۢᩳۜ;

    move-result-object v3

    goto :goto_1

    :cond_2
    move-object v3, v8

    :goto_1
    if-nez v3, :cond_3

    .line 2165
    iget-boolean v4, v1, Ll/ۧᩳۜ;->᩷:Z

    if-eqz v4, :cond_3

    .line 2166
    invoke-direct {v0, v2, v12, v8}, Ll/ᩳᩳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ll/ۧᩳۜ;)Ll/ۢᩳۜ;

    move-result-object v3

    :cond_3
    move-object/from16 v18, v3

    if-nez v18, :cond_0

    .line 2170
    invoke-direct {v0, v2, v13, v8}, Ll/ᩳᩳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ll/ۧᩳۜ;)Ll/ۢᩳۜ;

    move-result-object v18

    goto :goto_0

    .line 2134
    :goto_2
    invoke-direct {v0, v1, v2}, Ll/ᩳᩳۜ;->֫(Ll/ۧᩳۜ;Ll/ۢᩳۜ;)Z

    move-result v1

    return v1

    :cond_4
    move-object/from16 v6, p2

    .line 2136
    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    .line 2137
    invoke-interface/range {p2 .. p2}, Ll/᩷᩻ܽ;->ܽ֫()I

    move-result v19

    .line 2393
    new-instance v5, Ll/ۧᩳۜ;

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v22, "item_list"

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object v1, v5

    move-object/from16 v4, v17

    move-object/from16 v28, v5

    move-object/from16 v5, v22

    move/from16 v6, v23

    const/16 v22, 0x0

    move/from16 v7, v24

    move-object/from16 v23, v8

    move-object/from16 v8, v25

    move-object/from16 v29, v9

    move-object/from16 v9, v26

    move-object/from16 v30, v10

    move-object/from16 v10, v27

    move-object/from16 v31, v11

    move-object/from16 v11, v20

    move-object/from16 v32, v12

    move-object/from16 v12, v21

    move-object/from16 v33, v13

    move-object/from16 v13, v16

    move-object/from16 v20, v14

    move/from16 v14, v22

    move-object/from16 v21, v15

    move/from16 v15, v19

    move-object/from16 v16, v23

    invoke-direct/range {v1 .. v16}, Ll/ۧᩳۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ܰܽۜ;Ljava/util/ArrayList;ZILl/᩶ᩳۜ;)V

    .line 2138
    invoke-interface/range {p2 .. p2}, Ll/᩷᩻ܽ;->values()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ll/֨᩻ܽ;

    .line 2139
    iget-object v1, v0, Ll/ᩳᩳۜ;->֫:Ll/ܳܳܽ;

    invoke-interface {v2}, Ll/֨᩻ܽ;->ۡ֫()I

    move-result v3

    move-object/from16 v8, p1

    invoke-static {v1, v8, v3}, Ll/ۡᩳۜ;->֫(Ll/ܳܳܽ;Ll/ۜ᩻ܽ;I)Ll/֡ܽۜ;

    move-result-object v1

    .line 2140
    iget-object v3, v1, Ll/֡ܽۜ;->֫:Ljava/lang/String;

    iget-object v4, v1, Ll/֡ܽۜ;->ۧ:Ljava/lang/String;

    move-object/from16 v1, v20

    move-object/from16 v5, v17

    move-object/from16 v6, v21

    invoke-static/range {v1 .. v6}, Ll/ۡᩳۜ;->֫(Ll/ᩴܽۜ;Ll/֨᩻ܽ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashSet;)Ll/ۧᩳۜ;

    move-result-object v1

    iget-object v2, v1, Ll/ۧᩳۜ;->ۘ:Ljava/lang/String;

    iget-object v3, v1, Ll/ۧᩳۜ;->ᩴ:Ljava/lang/String;

    move-object/from16 v5, v30

    move-object/from16 v4, v31

    .line 2142
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    move-object/from16 v6, v29

    .line 2204
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 2205
    invoke-direct {v0, v2, v6, v1}, Ll/ᩳᩳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ll/ۧᩳۜ;)Ll/ۢᩳۜ;

    move-result-object v1

    goto :goto_4

    :cond_5
    move-object/from16 v1, v18

    :goto_4
    move-object/from16 v2, v28

    move-object/from16 v9, v32

    move-object/from16 v10, v33

    goto :goto_8

    :cond_6
    move-object/from16 v6, v29

    .line 2182
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 2183
    invoke-direct {v0, v2, v6, v1}, Ll/ᩳᩳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ll/ۧᩳۜ;)Ll/ۢᩳۜ;

    move-result-object v3

    goto :goto_5

    :cond_7
    move-object/from16 v3, v23

    :goto_5
    if-nez v3, :cond_8

    .line 2186
    iget-boolean v9, v1, Ll/ۧᩳۜ;->᩷:Z

    if-eqz v9, :cond_8

    move-object/from16 v9, v32

    .line 2187
    invoke-direct {v0, v2, v9, v1}, Ll/ᩳᩳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ll/ۧᩳۜ;)Ll/ۢᩳۜ;

    move-result-object v3

    goto :goto_6

    :cond_8
    move-object/from16 v9, v32

    :goto_6
    if-nez v3, :cond_9

    move-object/from16 v10, v33

    .line 2191
    invoke-direct {v0, v2, v10, v1}, Ll/ᩳᩳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ll/ۧᩳۜ;)Ll/ۢᩳۜ;

    move-result-object v1

    goto :goto_7

    :cond_9
    move-object/from16 v10, v33

    move-object v1, v3

    :goto_7
    move-object/from16 v2, v28

    .line 2144
    :goto_8
    invoke-direct {v0, v2, v1}, Ll/ᩳᩳۜ;->֫(Ll/ۧᩳۜ;Ll/ۢᩳۜ;)Z

    move-result v1

    if-eqz v1, :cond_a

    const/4 v1, 0x1

    return v1

    :cond_a
    move-object/from16 v28, v2

    move-object/from16 v31, v4

    move-object/from16 v30, v5

    move-object/from16 v29, v6

    move-object/from16 v32, v9

    move-object/from16 v33, v10

    goto/16 :goto_3

    :cond_b
    return v22
.end method
