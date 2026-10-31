.class public final Ll/֡ᩴ᩷;
.super Ll/۟ܶۡ;
.source "C2R7"


# instance fields
.field public final synthetic ۖ:I

.field public final synthetic ۘ:I

.field public final synthetic ۜ:Ll/֫᩵᩷;

.field public final synthetic ۡ:I

.field public final synthetic ۢ:Ljava/lang/String;

.field public ܳ:Ll/᩵᩶ܿ;

.field public final synthetic ܺ:Ljava/lang/String;

.field public final synthetic ᩷:J

.field public ᩻:Ljava/util/List;


# direct methods
.method public constructor <init>(Ll/֫᩵᩷;JIIILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    const v0, 0x7f427427

    sget v1, Ll/֨ۤ;->ܿۖ᩵:I

    sget v2, Ll/֫ܿ;->ۨ۫ᩳ:I

    .line 604
    iput-object p1, p0, Ll/֡ᩴ᩷;->ۜ:Ll/֫᩵᩷;

    iput-wide p2, p0, Ll/֡ᩴ᩷;->᩷:J

    iput p4, p0, Ll/֡ᩴ᩷;->ۘ:I

    iput p5, p0, Ll/֡ᩴ᩷;->ۖ:I

    iput p6, p0, Ll/֡ᩴ᩷;->ۡ:I

    iput-object p7, p0, Ll/֡ᩴ᩷;->ܺ:Ljava/lang/String;

    iput-object p8, p0, Ll/֡ᩴ᩷;->ۢ:Ljava/lang/String;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    const-string p1, "\u06db\u05a1"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x29d3

    const p3, -0x5f93bede

    xor-int/2addr p2, p3

    const p3, -0x6cb55b70

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v2

    mul-int/lit16 p3, p3, 0x7b53

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 445
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 556
    :sswitch_0
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u06da\u06e1"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x53

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x1775

    const p3, 0x5c9bddb1

    xor-int/2addr p2, p3

    const p3, -0x4647b225

    goto :goto_0

    .line 195
    :sswitch_1
    sget p1, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz p1, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    const-string p1, "\u073f\u06d6"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v1, p1

    mul-int/lit8 p1, p1, 0x13

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x31bd

    const p3, 0x50cff762

    xor-int/2addr p2, p3

    const p3, 0x594a586a

    goto :goto_0

    .line 1
    :sswitch_2
    sget-boolean p1, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez p1, :cond_2

    goto :goto_3

    :cond_2
    :goto_2
    const-string p1, "\u05a8\u06db"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x4b51

    const p3, -0x10742596

    xor-int/2addr p2, p3

    const p3, -0x265c3193

    goto :goto_0

    .line 302
    :sswitch_3
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    :goto_3
    const-string p1, "\u06ec\u06db"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v1, p1

    mul-int/lit8 p1, p1, -0x5f

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x7f83

    const p3, -0x21431ce2

    xor-int/2addr p2, p3

    const p3, 0x46fe6d92

    goto/16 :goto_0

    :sswitch_4
    return-void

    .line 539
    :sswitch_5
    sget p1, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz p1, :cond_3

    const-string p1, "\u05a8\u06e0"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x254f

    const p3, 0x2b79a792

    xor-int/2addr p2, p3

    const p3, -0x5ffd3068

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u0730\u06d7"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x3

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x3499

    const p3, 0x24761a26

    xor-int/2addr p2, p3

    const p3, -0x89bb8a9

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7372c11b -> :sswitch_5
        -0x727f2397 -> :sswitch_3
        -0x33ca3c83 -> :sswitch_2
        -0x28796320 -> :sswitch_4
        -0x17a45e80 -> :sswitch_3
        -0xb09dacf -> :sswitch_4
        -0x192e7ff -> :sswitch_1
        0x1e327bdf -> :sswitch_5
        0x269d609c -> :sswitch_2
        0x2d7a7cc9 -> :sswitch_0
        0x3b7e2d21 -> :sswitch_0
        0x6e7ccc81 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final ֫()V
    .locals 45

    move-object/from16 v0, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const v32, 0x5b16ff61

    sget v33, Ll/֫ܿ;->ۨ۫ᩳ:I

    sget v34, Ll/ۗ᩷;->᩸᩺ᩳ:I

    const-string v35, "\u06d8\u05a8"

    invoke-static/range {v35 .. v35}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v35

    xor-int v35, v35, v34

    mul-int/lit8 v35, v35, 0x2f

    xor-int v1, v35, v33

    mul-int/lit16 v1, v1, 0x1a15

    const v37, 0x228f5738

    xor-int v1, v1, v37

    const v37, -0x2bc7489d

    xor-int v35, v35, v37

    move-object/from16 v24, v3

    move-object/from16 v27, v15

    move-object/from16 v36, v22

    move-object/from16 v3, v25

    move-object/from16 v2, v26

    move-object/from16 v15, v30

    const/4 v0, 0x0

    move-object/from16 v25, v13

    move-object/from16 v26, v14

    move-object/from16 v13, v16

    move-object/from16 v22, v17

    move-object/from16 v30, v18

    move-object/from16 v16, v6

    move-object/from16 v17, v7

    move-object/from16 v18, v8

    move-object v6, v10

    move-object/from16 v7, v21

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object/from16 v21, v19

    move-object/from16 v19, v9

    move-object/from16 v9, v31

    move-object/from16 v31, v23

    const/16 v23, 0x0

    move-object/from16 v42, v11

    move-object v11, v4

    move-object v4, v12

    move-object/from16 v12, v20

    move-object/from16 v20, v5

    move-object/from16 v5, v42

    :goto_0
    xor-int v14, v32, v33

    mul-int/lit16 v14, v14, 0x281

    shr-int/lit8 v14, v14, 0x1f

    and-int/2addr v1, v14

    xor-int v32, v35, v1

    sparse-switch v32, :sswitch_data_0

    move/from16 v37, v0

    move-object/from16 v35, v15

    .line 745
    new-instance v0, Ll/ۙᩴ᩷;

    invoke-direct {v0, v13}, Ll/ۙᩴ᩷;-><init>(Landroid/content/pm/PackageInfo;)V

    invoke-static {v11, v0}, Ll/֫ܺ;->ܽۚ᩸(Ljava/lang/Object;Ljava/lang/Object;)Z

    :goto_1
    move-object/from16 v1, v24

    move-object/from16 v24, v25

    move-object/from16 v15, v27

    move-object/from16 v14, v30

    move-object/from16 v27, v31

    move-object/from16 v30, v36

    move-object/from16 v25, v2

    move-object/from16 v31, v26

    move-object/from16 v26, v3

    move-object/from16 v3, v17

    move-object/from16 v17, v4

    move-object/from16 v4, p0

    move/from16 v42, v23

    move-object/from16 v23, v6

    move-object/from16 v6, v21

    move/from16 v21, v42

    move-object/from16 v43, v18

    move-object/from16 v18, v16

    move-object/from16 v16, v43

    goto/16 :goto_25

    :sswitch_0
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    :goto_2
    move/from16 v37, v0

    move-object/from16 v35, v15

    move-object/from16 v0, v26

    move-object/from16 v15, v27

    move-object/from16 v14, v30

    move-object/from16 v1, v31

    move-object/from16 v30, v36

    :goto_3
    move-object/from16 v26, v3

    move-object/from16 v3, v25

    move-object/from16 v25, v2

    goto/16 :goto_11

    :cond_1
    const-string v1, "\u073f\u06d7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v34, v1

    mul-int/lit8 v1, v1, -0x1d

    xor-int v14, v1, v33

    mul-int/lit16 v14, v14, -0x52eb

    const v35, -0x19c82eac

    xor-int v14, v14, v35

    const v35, 0x1efb9886

    goto/16 :goto_9

    :sswitch_1
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    move-result v1

    if-gez v1, :cond_2

    goto :goto_2

    :cond_2
    move/from16 v37, v0

    move-object/from16 v35, v15

    move-object/from16 v0, v26

    move-object/from16 v15, v27

    move-object/from16 v14, v30

    move-object/from16 v26, v3

    move-object/from16 v3, v25

    move-object/from16 v25, v2

    goto/16 :goto_14

    .line 59
    :sswitch_2
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    sget-boolean v1, Ll/֫֫;->ۢ᩸᩶:Z

    if-nez v1, :cond_3

    goto :goto_5

    :cond_3
    const-string v1, "\u1a74\u06da"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v33

    mul-int/lit8 v1, v1, -0x1b

    xor-int v14, v1, v34

    mul-int/lit16 v14, v14, 0x3a03

    const v35, 0x73ca83e0

    xor-int v14, v14, v35

    const v35, -0x4765cd95

    goto/16 :goto_9

    .line 1456
    :sswitch_3
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    sget-boolean v1, Ll/֡ۨ;->ܽܶۖ:Z

    if-eqz v1, :cond_5

    :cond_4
    :goto_4
    move/from16 v37, v0

    move-object/from16 v35, v15

    goto/16 :goto_c

    :cond_5
    :goto_5
    const-string v1, "\u1a7b\u06e2"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v34

    xor-int v14, v1, v33

    mul-int/lit16 v14, v14, -0x72e7

    const v35, 0x4aa09ad7    # 5262699.5f

    xor-int v14, v14, v35

    const v35, 0x74a4599a

    goto/16 :goto_9

    :sswitch_4
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    sget v1, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-gez v1, :cond_0

    goto :goto_4

    :sswitch_5
    sget v1, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-lez v1, :cond_4

    :goto_6
    move/from16 v37, v0

    move-object/from16 v35, v15

    move-object/from16 v0, v16

    move-object/from16 v16, v18

    move-object/from16 v1, v24

    move-object/from16 v24, v25

    move-object/from16 v15, v27

    move-object/from16 v27, v31

    move-object/from16 v25, v2

    move-object/from16 v31, v26

    move-object/from16 v2, v30

    move-object/from16 v30, v36

    move-object/from16 v26, v3

    move-object/from16 v3, v17

    move-object/from16 v17, v4

    move/from16 v42, v23

    move-object/from16 v23, v6

    move-object/from16 v6, v21

    move/from16 v21, v42

    goto/16 :goto_1f

    .line 275
    :sswitch_6
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    move-result v1

    if-nez v1, :cond_7

    :cond_6
    move/from16 v37, v0

    move-object/from16 v35, v15

    goto/16 :goto_d

    :cond_7
    move/from16 v37, v0

    move-object/from16 v35, v15

    :goto_7
    move-object/from16 v0, v17

    move-object/from16 v1, v24

    move-object/from16 v24, v25

    move-object/from16 v15, v27

    move-object/from16 v14, v30

    move-object/from16 v27, v31

    move-object/from16 v30, v36

    move-object/from16 v25, v2

    move-object/from16 v17, v4

    move-object/from16 v31, v26

    move-object/from16 v4, p0

    move-object/from16 v26, v3

    move/from16 v42, v23

    move-object/from16 v23, v6

    move-object/from16 v6, v21

    move/from16 v21, v42

    goto/16 :goto_21

    :sswitch_7
    sget v1, Ll/ۗ᩵;->֫۠۟:I

    if-gez v1, :cond_6

    goto :goto_6

    .line 774
    :sswitch_8
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    goto :goto_6

    :sswitch_9
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    return-void

    .line 647
    :sswitch_a
    invoke-static {v8}, Ll/֫᩵᩷;->ۗ(Ll/֫᩵᩷;)V

    return-void

    .line 995
    :sswitch_b
    iget-boolean v1, v9, Ll/ۙᩴ᩷;->ۜ:Z

    if-nez v1, :cond_9

    goto :goto_8

    .line 994
    :sswitch_c
    invoke-static/range {v29 .. v29}, Ll/֨۫;->۬ۖܳ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Ll/ۙᩴ᩷;

    if-eqz v9, :cond_9

    const-string v1, "\u06db\u06d6"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v33

    xor-int v14, v1, v34

    mul-int/lit16 v14, v14, 0x2273

    const v35, -0x3c572d1f

    xor-int v14, v14, v35

    const v35, -0x6425c876

    goto/16 :goto_9

    .line 995
    :sswitch_d
    iget-boolean v1, v15, Ll/ۙᩴ᩷;->ۜ:Z

    if-nez v1, :cond_b

    :goto_8
    const-string v1, "\u05a1\u06d9"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v34

    mul-int/lit8 v1, v1, -0x11

    xor-int v14, v1, v33

    mul-int/lit16 v14, v14, -0x81d

    const v35, -0x63dc3ed5

    xor-int v14, v14, v35

    const v35, -0x3ef92267

    goto/16 :goto_9

    .line 994
    :sswitch_e
    invoke-static/range {v29 .. v29}, Ll/֫ۧ;->۫ܶܺ(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    const-string v1, "\u1a78\u06d8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v34

    xor-int v14, v1, v33

    mul-int/lit16 v14, v14, 0x2a99

    const v35, 0x4fba145d

    xor-int v14, v14, v35

    const v35, -0x3aab17d6

    goto/16 :goto_9

    :cond_8
    move-object/from16 v1, p0

    move/from16 v37, v0

    move-object/from16 v38, v5

    move-object v0, v7

    move-object/from16 v35, v15

    goto/16 :goto_b

    :sswitch_f
    invoke-static/range {v28 .. v28}, Ll/ۖۘ;->ᩴۛۚ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v15, v1

    check-cast v15, Ll/ۙᩴ᩷;

    if-eqz v15, :cond_b

    const-string v1, "\u1a76\u06d7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v33, v1

    mul-int/lit8 v1, v1, -0xd

    xor-int v14, v1, v34

    mul-int/lit16 v14, v14, -0x6085

    const v35, -0x441eb795

    xor-int v14, v14, v35

    const v35, -0x613e78f

    goto/16 :goto_9

    .line 646
    :sswitch_10
    invoke-static {v8}, Ll/֫᩵᩷;->֡(Ll/֫᩵᩷;)Ll/ۗᩴ᩷;

    move-result-object v1

    .line 1224
    iget-object v1, v1, Ll/ۗᩴ᩷;->֫:Ll/᩶ᩴ᩷;

    iget-object v1, v1, Ll/᩶ᩴ᩷;->ܿ:Ll/᩵֡ᩴ;

    .line 151
    invoke-virtual {v1, v0}, Ll/᩵֡ᩴ;->listIterator(I)Ll/ۧۚᩴ;

    move-result-object v1

    move-object/from16 v29, v1

    :cond_9
    const-string v1, "\u06dc\u06e2"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v34

    xor-int v14, v1, v33

    mul-int/lit16 v14, v14, -0x30d3

    const v35, -0x16374546

    xor-int v14, v14, v35

    const v35, 0x69873cae

    goto/16 :goto_9

    .line 743
    :sswitch_11
    invoke-static {v11, v7}, Ll/۟;->ᩴۗᩳ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move/from16 v37, v0

    move-object/from16 v35, v15

    goto/16 :goto_1

    .line 994
    :sswitch_12
    invoke-static/range {v28 .. v28}, Ll/֡ܶ;->ۛܿ᩻(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    const-string v1, "\u06d7\u1a7b"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v33

    mul-int/lit8 v1, v1, -0x29

    xor-int v14, v1, v34

    mul-int/lit16 v14, v14, -0x5515

    const v35, 0x5d7919c2

    xor-int v14, v14, v35

    const v35, 0x166a2097

    goto :goto_9

    :cond_a
    const-string v1, "\u06e2\u06dc"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v34

    xor-int v14, v1, v33

    mul-int/lit16 v14, v14, 0x6231

    const v35, 0x26f4c1b2

    xor-int v14, v14, v35

    const v35, -0x42046d31

    goto :goto_9

    .line 956
    :sswitch_13
    iget-object v1, v7, Ll/ۙᩴ᩷;->ۡ:Landroid/content/pm/PackageInfo;

    move v14, v0

    .line 2258
    iget-wide v0, v1, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    move/from16 v37, v14

    move-object/from16 v35, v15

    iget-wide v14, v13, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    cmp-long v38, v0, v14

    if-nez v38, :cond_c

    const-string v0, "\u06dc\u073a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v34

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, -0x658d

    const v14, 0x21ed6f51

    xor-int/2addr v1, v14

    const v14, 0xaa840e8

    goto/16 :goto_e

    :sswitch_14
    move-object/from16 v35, v15

    .line 646
    invoke-static {v8}, Ll/֫᩵᩷;->֨(Ll/֫᩵᩷;)Ll/ۗᩴ᩷;

    move-result-object v0

    .line 1224
    iget-object v0, v0, Ll/ۗᩴ᩷;->֫:Ll/᩶ᩴ᩷;

    iget-object v0, v0, Ll/᩶ᩴ᩷;->ܿ:Ll/᩵֡ᩴ;

    const/4 v1, 0x0

    .line 151
    invoke-virtual {v0, v1}, Ll/᩵֡ᩴ;->listIterator(I)Ll/ۧۚᩴ;

    move-result-object v0

    move-object/from16 v28, v0

    const/4 v0, 0x0

    :cond_b
    const-string v1, "\u1a78\u1a76"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v33

    mul-int/lit8 v1, v1, 0x25

    xor-int v14, v1, v34

    mul-int/lit16 v14, v14, 0x4727

    const v35, 0x604c1e3e

    xor-int v14, v14, v35

    const v35, -0x344914cd    # -2.3975526E7f

    :goto_9
    xor-int v35, v1, v35

    goto/16 :goto_10

    :sswitch_15
    move/from16 v37, v0

    move-object/from16 v35, v15

    .line 955
    iget-object v0, v7, Ll/ۙᩴ᩷;->ܺ:Ljava/lang/String;

    iget-object v1, v13, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 956
    invoke-static {v0, v1}, Ll/֫ܿ;->ܺۤ֨(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    const-string v0, "\u1a79\u1a7a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v34

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, -0x1569

    const v14, 0x50feab85

    xor-int/2addr v1, v14

    const v14, -0x3ce39714

    goto/16 :goto_e

    :cond_c
    move-object/from16 v1, v24

    move-object/from16 v24, v25

    move-object/from16 v0, v26

    move-object/from16 v15, v27

    move-object/from16 v14, v30

    move-object/from16 v27, v31

    move-object/from16 v30, v36

    move-object/from16 v25, v2

    move-object/from16 v26, v3

    goto/16 :goto_15

    :sswitch_16
    move/from16 v37, v0

    move-object/from16 v35, v15

    .line 643
    invoke-static {v8}, Ll/֫᩵᩷;->᩹(Ll/֫᩵᩷;)Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_a

    :cond_d
    const-string v0, "\u06d6\u1a74"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v33

    xor-int v1, v0, v34

    mul-int/lit16 v1, v1, -0x4625

    const v14, -0x5fb95640

    xor-int/2addr v1, v14

    const v14, 0x46e83081

    goto/16 :goto_e

    :sswitch_17
    move/from16 v37, v0

    move-object/from16 v35, v15

    .line 1310
    iget-object v0, v3, Ll/ۗᩴ᩷;->ܿ:Ll/֫᩵᩷;

    invoke-static {v0, v10}, Ll/֫᩵᩷;->ᩳ(Ll/֫᩵᩷;I)V

    .line 658
    invoke-static {v8}, Ll/֫᩵᩷;->ۗ(Ll/֫᩵᩷;)V

    .line 659
    invoke-static {v8}, Ll/֫᩵᩷;->۫(Ll/֫᩵᩷;)V

    :goto_a
    move-object/from16 v1, p0

    move-object/from16 v38, v5

    move-object v0, v7

    :goto_b
    move-object/from16 v41, v17

    move-object/from16 v40, v18

    move-object/from16 v39, v21

    move/from16 v21, v23

    move-object/from16 v15, v27

    move-object/from16 v14, v30

    move-object/from16 v27, v31

    move-object/from16 v30, v36

    move-object/from16 v17, v4

    move-object/from16 v23, v6

    move-object/from16 v18, v16

    move-object/from16 v36, v24

    move-object/from16 v24, v25

    move-object/from16 v31, v26

    move-object/from16 v25, v2

    move-object/from16 v26, v3

    goto/16 :goto_27

    :sswitch_18
    move/from16 v37, v0

    move-object/from16 v35, v15

    .line 1370
    iget v0, v2, Ll/᩶ᩴ᩷;->ܽ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v2, Ll/᩶ᩴ᩷;->ܽ:I

    .line 1309
    invoke-virtual {v12, v2}, Ll/ܿۙۧ;->֫(Ll/᩶ۗۧ;)V

    .line 2004
    sget v0, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v0, :cond_e

    :goto_c
    const-string v0, "\u073a\u0733"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v33

    mul-int/lit8 v0, v0, -0x7b

    xor-int v1, v0, v34

    mul-int/lit16 v1, v1, -0x379f

    const v14, -0x765d1438

    xor-int/2addr v1, v14

    const v14, -0xab84b3d

    goto/16 :goto_e

    :cond_e
    const-string v0, "\u1a7b\u1a73"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v34

    mul-int/lit8 v0, v0, 0x3d

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, 0x1131

    const v14, -0xb6b4f15

    xor-int/2addr v1, v14

    const v14, -0x1478acdb

    goto :goto_e

    :sswitch_19
    move/from16 v37, v0

    move-object/from16 v35, v15

    .line 1377
    iput-object v4, v2, Ll/᩶ᩴ᩷;->ܿ:Ll/᩵֡ᩴ;

    .line 1378
    iput-object v5, v2, Ll/᩶ᩴ᩷;->֫:Ll/᩵֡ᩴ;

    .line 1379
    iget-object v0, v6, Ll/۬ᩴ᩷;->ۧ:Ljava/lang/String;

    iput-object v0, v2, Ll/᩶ᩴ᩷;->ᩳ:Ljava/lang/String;

    sget v0, Ll/᩺;->ۙۛܶ:I

    if-gtz v0, :cond_f

    goto/16 :goto_7

    :cond_f
    const-string v0, "\u0733\u1a78"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v34

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, -0x33a9

    const v14, 0x1d4d5f66

    xor-int/2addr v1, v14

    const v14, 0x59c8e579

    goto :goto_e

    :sswitch_1a
    move/from16 v37, v0

    move-object/from16 v35, v15

    .line 657
    invoke-static {v3}, Ll/ۗ᩷;->ۖۧۙ(Ljava/lang/Object;)Ljava/lang/Class;

    .line 1307
    iget v0, v6, Ll/۬ᩴ᩷;->֫:I

    iput v0, v3, Ll/ۗᩴ᩷;->ۧ:I

    .line 1308
    iget-object v2, v3, Ll/ۗᩴ᩷;->֫:Ll/᩶ᩴ᩷;

    invoke-static {v2}, Ll/֫᩵;->ۡ۬ܳ(Ljava/lang/Object;)Ljava/lang/Class;

    .line 1508
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v0

    if-eqz v0, :cond_10

    :goto_d
    const-string v0, "\u06d9\u1a79"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v33, v0

    mul-int/lit8 v0, v0, -0x4d

    xor-int v1, v0, v34

    mul-int/lit16 v1, v1, 0x7f01

    const v14, -0x22b6d9fc

    xor-int/2addr v1, v14

    const v14, 0x3f1a3d5a

    goto :goto_e

    :cond_10
    const-string v0, "\u0736\u06db"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v33

    mul-int/lit8 v0, v0, 0x11

    xor-int v1, v0, v34

    mul-int/lit16 v1, v1, 0x3efb

    const v14, 0x572cc66a

    xor-int/2addr v1, v14

    const v14, 0xf6b08e9

    :goto_e
    xor-int/2addr v0, v14

    move-object/from16 v15, v35

    move/from16 v35, v0

    goto/16 :goto_1b

    :sswitch_1b
    move/from16 v37, v0

    move-object/from16 v35, v15

    move-object/from16 v0, v36

    .line 1310
    iget-object v1, v0, Ll/ۗᩴ᩷;->ܿ:Ll/֫᩵᩷;

    const/4 v10, -0x1

    invoke-static {v1, v10}, Ll/֫᩵᩷;->ᩳ(Ll/֫᩵᩷;I)V

    .line 657
    invoke-static {v8}, Ll/֫᩵᩷;->֡(Ll/֫᩵᩷;)Ll/ۗᩴ᩷;

    move-result-object v3

    sget v1, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v1, :cond_11

    const-string v1, "\u06eb\u1a74"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v34

    mul-int/lit8 v1, v1, -0xb

    xor-int v14, v1, v33

    mul-int/lit16 v14, v14, -0x6b2f

    const v15, 0x4dddd365    # 4.65202336E8f

    xor-int/2addr v14, v15

    const v15, 0x4ae39d7

    goto :goto_f

    :cond_11
    const-string v1, "\u06db\u073d"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v34

    xor-int v14, v1, v33

    mul-int/lit16 v14, v14, 0x5b43

    const v15, 0x280aa6e2

    xor-int/2addr v14, v15

    const v15, 0x1bb77a93

    :goto_f
    xor-int/2addr v1, v15

    move-object/from16 v36, v0

    move-object/from16 v15, v35

    move/from16 v0, v37

    move/from16 v35, v1

    :goto_10
    move v1, v14

    goto/16 :goto_0

    :sswitch_1c
    move/from16 v37, v0

    move-object/from16 v35, v15

    move-object/from16 v1, v31

    move-object/from16 v0, v36

    .line 1370
    iget v14, v1, Ll/᩶ᩴ᩷;->ܽ:I

    add-int/lit8 v14, v14, 0x1

    iput v14, v1, Ll/᩶ᩴ᩷;->ܽ:I

    move-object/from16 v14, v30

    .line 1309
    invoke-virtual {v14, v1}, Ll/ܿۙۧ;->֫(Ll/᩶ۗۧ;)V

    .line 1832
    sget v15, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v15, :cond_12

    move-object/from16 v30, v0

    move-object/from16 v0, v26

    move-object/from16 v15, v27

    goto/16 :goto_3

    :cond_12
    const-string v15, "\u06d8\u073a"

    invoke-static {v15}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v15

    xor-int v15, v15, v33

    move-object/from16 v30, v0

    xor-int v0, v15, v34

    mul-int/lit16 v0, v0, -0x9a1

    const v31, 0x5a5bc7d5

    xor-int v0, v0, v31

    const v31, 0x307a5bd

    xor-int v15, v15, v31

    move-object/from16 v31, v1

    move-object/from16 v36, v30

    move v1, v0

    move-object/from16 v30, v14

    move/from16 v0, v37

    move-object/from16 v42, v35

    move/from16 v35, v15

    move-object/from16 v15, v42

    goto/16 :goto_0

    :sswitch_1d
    move/from16 v37, v0

    move-object/from16 v35, v15

    move-object/from16 v15, v27

    move-object/from16 v14, v30

    move-object/from16 v1, v31

    move-object/from16 v30, v36

    .line 1377
    iput-object v15, v1, Ll/᩶ᩴ᩷;->ܿ:Ll/᩵֡ᩴ;

    move-object/from16 v0, v26

    .line 1378
    iput-object v0, v1, Ll/᩶ᩴ᩷;->֫:Ll/᩵֡ᩴ;

    move-object/from16 v26, v3

    move-object/from16 v3, v25

    move-object/from16 v25, v2

    .line 1379
    iget-object v2, v3, Ll/۬ᩴ᩷;->ۧ:Ljava/lang/String;

    iput-object v2, v1, Ll/᩶ᩴ᩷;->ᩳ:Ljava/lang/String;

    .line 25
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result v2

    if-eqz v2, :cond_13

    :goto_11
    const-string v2, "\u1a74\u05a8"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v34, v2

    mul-int/lit8 v2, v2, 0x3

    move-object/from16 v27, v1

    xor-int v1, v2, v33

    mul-int/lit16 v1, v1, -0x5be7

    const v31, -0x10f6efe3

    xor-int v1, v1, v31

    const v31, 0x2ae6c818

    xor-int v2, v2, v31

    move-object/from16 v31, v27

    move-object/from16 v36, v30

    move-object/from16 v30, v14

    move-object/from16 v27, v15

    move-object/from16 v15, v35

    move/from16 v35, v2

    goto :goto_13

    :cond_13
    move-object/from16 v27, v1

    const-string v1, "\u06d8\u073d"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v34, v1

    mul-int/lit8 v1, v1, 0x2f

    xor-int v2, v1, v33

    mul-int/lit16 v2, v2, 0x19a5

    const v31, -0x105ab893

    xor-int v2, v2, v31

    const v31, 0x6d5a7f34

    xor-int v1, v1, v31

    move-object/from16 v31, v27

    move-object/from16 v36, v30

    :goto_12
    move-object/from16 v30, v14

    move-object/from16 v27, v15

    move-object/from16 v15, v35

    move/from16 v35, v1

    move v1, v2

    :goto_13
    move-object/from16 v2, v25

    move-object/from16 v25, v3

    goto/16 :goto_1a

    :sswitch_1e
    move/from16 v37, v0

    move-object/from16 v35, v15

    move-object/from16 v0, v26

    move-object/from16 v15, v27

    move-object/from16 v14, v30

    move-object/from16 v26, v3

    move-object/from16 v3, v25

    move-object/from16 v25, v2

    .line 656
    invoke-static {v8}, Ll/֫᩵᩷;->֨(Ll/֫᩵᩷;)Ll/ۗᩴ᩷;

    move-result-object v1

    invoke-static {v1}, Ll/ۗ᩷;->ۖۧۙ(Ljava/lang/Object;)Ljava/lang/Class;

    .line 1307
    iget v2, v3, Ll/۬ᩴ᩷;->֫:I

    iput v2, v1, Ll/ۗᩴ᩷;->ۧ:I

    .line 1308
    iget-object v2, v1, Ll/ۗᩴ᩷;->֫:Ll/᩶ᩴ᩷;

    invoke-static {v2}, Ll/֫᩵;->ۡ۬ܳ(Ljava/lang/Object;)Ljava/lang/Class;

    .line 346
    sget v27, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v27, :cond_14

    move-object/from16 v36, v1

    move-object/from16 v31, v2

    :goto_14
    const-string v1, "\u073a\u05ab"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v33, v1

    mul-int/lit8 v1, v1, -0x63

    xor-int v2, v1, v34

    mul-int/lit16 v2, v2, 0x3c79

    const v27, 0x743461b2

    xor-int v2, v2, v27

    const v27, 0x384621fa

    xor-int v1, v1, v27

    goto :goto_12

    :cond_14
    const-string v27, "\u06e0\u1a73"

    invoke-static/range {v27 .. v27}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v27

    add-int v27, v27, v33

    mul-int/lit8 v27, v27, 0x19

    move-object/from16 v30, v1

    xor-int v1, v27, v34

    mul-int/lit16 v1, v1, 0x4a41

    const v31, 0x3c4d0086

    xor-int v1, v1, v31

    const v31, -0x7301708b

    xor-int v27, v27, v31

    move-object/from16 v31, v2

    move-object/from16 v2, v25

    move-object/from16 v36, v30

    move-object/from16 v25, v3

    move-object/from16 v30, v14

    move-object/from16 v3, v26

    move-object/from16 v26, v0

    move/from16 v0, v37

    move/from16 v42, v27

    move-object/from16 v27, v15

    move-object/from16 v15, v35

    move/from16 v35, v42

    goto/16 :goto_0

    :sswitch_1f
    move/from16 v37, v0

    move-object/from16 v35, v15

    move-object/from16 v1, v24

    move-object/from16 v0, v26

    move-object/from16 v15, v27

    move-object/from16 v14, v30

    move-object/from16 v27, v31

    move-object/from16 v30, v36

    move-object/from16 v26, v3

    move-object/from16 v3, v25

    move-object/from16 v25, v2

    .line 741
    iget-object v2, v1, Ll/ۨᩴ᩷;->֫:Ljava/util/HashMap;

    iget-object v7, v13, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-static {v2, v7}, Ll/ۘ᩻;->۬ۖ۠(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ll/ۙᩴ᩷;

    if-eqz v7, :cond_15

    const-string v2, "\u05a8\u0733"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v34

    mul-int/lit8 v2, v2, 0x5f

    move-object/from16 v24, v3

    xor-int v3, v2, v33

    mul-int/lit16 v3, v3, -0x709d

    const v31, -0x2da175da

    xor-int v3, v3, v31

    const v31, -0x46f5371e

    goto :goto_16

    :cond_15
    move-object/from16 v24, v3

    :goto_15
    const-string v2, "\u05ab\u05a8"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v33

    mul-int/lit8 v2, v2, 0x49

    xor-int v3, v2, v34

    mul-int/lit16 v3, v3, 0x54cf

    const v31, 0x312138aa

    xor-int v3, v3, v31

    const v31, -0x668f1cf2

    :goto_16
    xor-int v2, v2, v31

    move-object/from16 v31, v27

    move-object/from16 v36, v30

    move-object/from16 v30, v14

    move-object/from16 v27, v15

    move-object/from16 v15, v35

    move/from16 v35, v2

    move-object/from16 v2, v25

    move-object/from16 v25, v24

    move-object/from16 v24, v1

    move v1, v3

    goto/16 :goto_1a

    :sswitch_20
    move/from16 v37, v0

    move-object/from16 v35, v15

    move-object/from16 v1, v24

    move-object/from16 v24, v25

    move-object/from16 v0, v26

    move-object/from16 v15, v27

    move-object/from16 v14, v30

    move-object/from16 v27, v31

    move-object/from16 v30, v36

    move-object/from16 v25, v2

    move-object/from16 v26, v3

    .line 643
    invoke-static {v8}, Ll/֫᩵᩷;->᩷(Ll/֫᩵᩷;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v2

    invoke-static {v2}, Ll/ۖ;->֡᩹۫(Ljava/lang/Object;)I

    move-result v2

    move/from16 v3, v23

    if-ne v3, v2, :cond_16

    const-string v2, "\u06d8\u06e1"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v33

    move-object/from16 v23, v6

    xor-int v6, v2, v34

    mul-int/lit16 v6, v6, -0x5e1b

    const v31, 0x3b674728

    xor-int v6, v6, v31

    const v31, -0x13c02ba7

    goto/16 :goto_18

    :cond_16
    move-object/from16 v31, v0

    move-object/from16 v36, v1

    move-object/from16 v38, v5

    move-object/from16 v23, v6

    :goto_17
    move-object v0, v7

    move-object/from16 v41, v17

    move-object/from16 v40, v18

    move-object/from16 v39, v21

    move-object/from16 v1, p0

    move/from16 v21, v3

    goto/16 :goto_19

    :sswitch_21
    move/from16 v37, v0

    move-object/from16 v35, v15

    move-object/from16 v1, v24

    move-object/from16 v24, v25

    move-object/from16 v0, v26

    move-object/from16 v15, v27

    move-object/from16 v14, v30

    move-object/from16 v27, v31

    move-object/from16 v30, v36

    move-object/from16 v25, v2

    move-object/from16 v26, v3

    move/from16 v3, v23

    move-object/from16 v23, v6

    .line 653
    invoke-static {v8}, Ll/֫᩵᩷;->᩹(Ll/֫᩵᩷;)Z

    move-result v2

    if-nez v2, :cond_17

    move-object/from16 v31, v0

    move-object/from16 v36, v1

    move-object/from16 v38, v5

    goto :goto_17

    :cond_17
    const-string v2, "\u0736\u073d"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v33

    xor-int v6, v2, v34

    mul-int/lit16 v6, v6, -0x7745

    const v31, -0x2c00b54e

    xor-int v6, v6, v31

    const v31, 0x1591910b

    goto/16 :goto_18

    :sswitch_22
    move/from16 v37, v0

    move-object/from16 v35, v15

    move-object/from16 v1, v24

    move-object/from16 v24, v25

    move-object/from16 v0, v26

    move-object/from16 v15, v27

    move-object/from16 v14, v30

    move-object/from16 v27, v31

    move-object/from16 v30, v36

    move-object/from16 v25, v2

    move-object/from16 v26, v3

    move/from16 v3, v23

    move-object/from16 v23, v6

    move-object/from16 v6, v22

    .line 738
    iget-object v2, v6, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    if-nez v2, :cond_18

    move-object/from16 v31, v0

    move-object/from16 v22, v6

    move-object/from16 v6, v21

    move/from16 v21, v3

    goto/16 :goto_1c

    :cond_18
    const-string v2, "\u1a78\u1a74"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v34

    move-object/from16 v22, v6

    xor-int v6, v2, v33

    mul-int/lit16 v6, v6, -0x3579

    const v31, -0x71fd0354

    xor-int v6, v6, v31

    const v31, -0x1e259d2b

    goto :goto_18

    :sswitch_23
    move/from16 v37, v0

    move-object/from16 v35, v15

    move-object/from16 v1, v24

    move-object/from16 v24, v25

    move-object/from16 v0, v26

    move-object/from16 v15, v27

    move-object/from16 v14, v30

    move-object/from16 v27, v31

    move-object/from16 v30, v36

    move-object/from16 v25, v2

    move-object/from16 v26, v3

    move/from16 v3, v23

    move-object/from16 v23, v6

    .line 641
    iget-object v2, v1, Ll/ۨᩴ᩷;->ܽ:Ll/᩵֡ᩴ;

    .line 642
    invoke-static {v2, v4}, Ll/֫᩵᩷;->֫(Ll/᩵֡ᩴ;Ll/᩵֡ᩴ;)Z

    move-result v2

    if-eqz v2, :cond_19

    const-string v2, "\u05a8\u1a77"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v33

    xor-int v6, v2, v34

    mul-int/lit16 v6, v6, -0x4395

    const v31, 0x29533b74

    xor-int v6, v6, v31

    const v31, -0x49355456

    :goto_18
    xor-int v2, v2, v31

    move-object/from16 v31, v27

    move-object/from16 v36, v30

    move-object/from16 v30, v14

    move-object/from16 v27, v15

    move-object/from16 v15, v35

    move/from16 v35, v2

    move-object/from16 v2, v25

    move-object/from16 v25, v24

    move-object/from16 v24, v1

    move v1, v6

    move-object/from16 v6, v23

    move/from16 v23, v3

    goto/16 :goto_1a

    :cond_19
    move-object/from16 v6, v21

    move/from16 v21, v3

    move-object/from16 v3, v24

    move-object/from16 v24, v15

    move-object v15, v0

    goto/16 :goto_1d

    :sswitch_24
    move/from16 v37, v0

    move-object/from16 v35, v15

    move-object/from16 v1, v24

    move-object/from16 v24, v25

    move-object/from16 v0, v26

    move-object/from16 v15, v27

    move-object/from16 v14, v30

    move-object/from16 v27, v31

    move-object/from16 v30, v36

    move-object/from16 v25, v2

    move-object/from16 v26, v3

    move/from16 v3, v23

    move-object/from16 v23, v6

    .line 907
    new-instance v2, Ll/ۚᩴ᩷;

    move-object/from16 v6, v21

    invoke-direct {v2, v6, v5}, Ll/ۚᩴ᩷;-><init>(Ll/᩵֡ᩴ;Ljava/util/List;)V

    invoke-static {v2}, Ll/᩷ۙۧ;->֫(Ll/ۧۙۧ;)Ll/ܿۙۧ;

    move-result-object v12

    .line 653
    invoke-static {v8}, Ll/֫᩵᩷;->᩷(Ll/֫᩵᩷;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v2

    invoke-static {v2}, Ll/֡᩺;->᩺ᩴ᩹(Ljava/lang/Object;)I

    move-result v2

    if-ne v3, v2, :cond_1a

    const-string v2, "\u0736\u1a75"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v34

    move/from16 v21, v3

    xor-int v3, v2, v33

    mul-int/lit16 v3, v3, -0x63cb

    const v31, 0x3ffba7fb

    xor-int v3, v3, v31

    const v31, 0x1175d343

    xor-int v2, v2, v31

    move-object/from16 v31, v27

    move-object/from16 v36, v30

    move-object/from16 v30, v14

    move-object/from16 v27, v15

    move-object/from16 v15, v35

    move/from16 v35, v2

    move-object/from16 v2, v25

    move-object/from16 v25, v24

    move-object/from16 v24, v1

    move v1, v3

    move-object/from16 v3, v26

    move-object/from16 v26, v0

    goto/16 :goto_1e

    :cond_1a
    move/from16 v21, v3

    move-object/from16 v31, v0

    move-object/from16 v36, v1

    move-object/from16 v38, v5

    move-object/from16 v39, v6

    move-object v0, v7

    move-object/from16 v41, v17

    move-object/from16 v40, v18

    move-object/from16 v1, p0

    :goto_19
    move-object/from16 v17, v4

    move-object/from16 v18, v16

    goto/16 :goto_27

    :sswitch_25
    move/from16 v37, v0

    move-object/from16 v35, v15

    move/from16 v21, v23

    move-object/from16 v1, v24

    move-object/from16 v24, v25

    move-object/from16 v0, v26

    move-object/from16 v15, v27

    move-object/from16 v27, v31

    move-object/from16 v30, v36

    move-object/from16 v25, v2

    move-object/from16 v26, v3

    move-object/from16 v23, v6

    .line 651
    iget-object v2, v1, Ll/ۨᩴ᩷;->᩻:Ll/᩵֡ᩴ;

    .line 907
    new-instance v3, Ll/ۚᩴ᩷;

    invoke-direct {v3, v2, v0}, Ll/ۚᩴ᩷;-><init>(Ll/᩵֡ᩴ;Ljava/util/List;)V

    invoke-static {v3}, Ll/᩷ۙۧ;->֫(Ll/ۧۙۧ;)Ll/ܿۙۧ;

    move-result-object v2

    .line 652
    iget-object v3, v1, Ll/ۨᩴ᩷;->ᩳ:Ll/᩵֡ᩴ;

    .line 212
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    move-result v6

    if-eqz v6, :cond_1b

    move-object/from16 v31, v0

    move-object v6, v3

    move-object/from16 v0, v16

    move-object/from16 v3, v17

    move-object/from16 v16, v18

    move-object/from16 v17, v4

    goto/16 :goto_1f

    :cond_1b
    const-string v6, "\u073f\u06eb"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v34

    xor-int v14, v6, v33

    mul-int/lit16 v14, v14, -0x3c3f

    const v31, 0x2f5574ae

    xor-int v14, v14, v31

    const v31, 0x74467083

    xor-int v6, v6, v31

    move-object/from16 v31, v27

    move-object/from16 v36, v30

    move-object/from16 v30, v2

    move-object/from16 v27, v15

    move-object/from16 v2, v25

    move-object/from16 v15, v35

    move/from16 v35, v6

    move-object/from16 v6, v23

    move-object/from16 v25, v24

    move-object/from16 v24, v1

    move v1, v14

    move/from16 v23, v21

    move-object/from16 v21, v3

    :goto_1a
    move-object/from16 v3, v26

    move-object/from16 v26, v0

    :goto_1b
    move/from16 v0, v37

    goto/16 :goto_0

    :sswitch_26
    move/from16 v37, v0

    move-object/from16 v35, v15

    move-object/from16 v1, v24

    move-object/from16 v24, v25

    move-object/from16 v0, v26

    move-object/from16 v15, v27

    move-object/from16 v14, v30

    move-object/from16 v27, v31

    move-object/from16 v30, v36

    move-object/from16 v25, v2

    move-object/from16 v26, v3

    move/from16 v42, v23

    move-object/from16 v23, v6

    move-object/from16 v6, v21

    move/from16 v21, v42

    .line 737
    invoke-static/range {v20 .. v20}, Ll/ۖۘ;->ᩴۛۚ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Landroid/content/pm/PackageInfo;

    .line 738
    iget-object v2, v13, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-eqz v2, :cond_1c

    const-string v3, "\u05a1\u073d"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v33

    mul-int/lit8 v3, v3, -0x53

    move-object/from16 v31, v0

    xor-int v0, v3, v34

    mul-int/lit16 v0, v0, -0x1901

    const v22, -0x4017591

    xor-int v0, v0, v22

    const v22, 0x36a9c30c

    xor-int v3, v3, v22

    move-object/from16 v22, v2

    move-object/from16 v2, v25

    move-object/from16 v36, v30

    move-object/from16 v30, v14

    goto/16 :goto_22

    :cond_1c
    move-object/from16 v31, v0

    move-object/from16 v22, v2

    :goto_1c
    move-object/from16 v3, v17

    move-object/from16 v17, v4

    move-object/from16 v4, p0

    move-object/from16 v42, v18

    move-object/from16 v18, v16

    move-object/from16 v16, v42

    goto/16 :goto_25

    :sswitch_27
    move/from16 v37, v0

    move-object/from16 v25, v2

    move-object/from16 v26, v3

    move-object/from16 v35, v15

    move-object/from16 v0, v19

    move-object/from16 v6, v21

    move/from16 v21, v23

    move-object/from16 v1, v24

    move-object/from16 v14, v30

    move-object/from16 v27, v31

    move-object/from16 v30, v36

    .line 639
    iget-object v2, v0, Ll/ۛᩴ᩷;->֫:Ll/۬ᩴ᩷;

    iget-object v5, v2, Ll/۬ᩴ᩷;->ᩳ:Ll/᩵֡ᩴ;

    iget-object v4, v2, Ll/۬ᩴ᩷;->ܽ:Ll/᩵֡ᩴ;

    iget-object v3, v0, Ll/ۛᩴ᩷;->ۧ:Ll/۬ᩴ᩷;

    iget-object v15, v3, Ll/۬ᩴ᩷;->ᩳ:Ll/᩵֡ᩴ;

    iget-object v0, v3, Ll/۬ᩴ᩷;->ܽ:Ll/᩵֡ᩴ;

    move-object/from16 v23, v2

    .line 641
    iget-object v2, v1, Ll/ۨᩴ᩷;->ܳ:Ll/᩵֡ᩴ;

    invoke-static {v2, v0}, Ll/֫᩵᩷;->֫(Ll/᩵֡ᩴ;Ll/᩵֡ᩴ;)Z

    move-result v2

    if-eqz v2, :cond_1d

    const-string v2, "\u06eb\u06d6"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v34

    mul-int/lit8 v2, v2, 0x79

    move-object/from16 v24, v0

    xor-int v0, v2, v33

    mul-int/lit16 v0, v0, 0x6747

    const v31, 0x41b61a9d

    xor-int v0, v0, v31

    const v31, 0x1f21f0c9

    xor-int v2, v2, v31

    move-object/from16 v31, v27

    move-object/from16 v36, v30

    move-object/from16 v30, v14

    move-object/from16 v27, v24

    move-object/from16 v24, v1

    move v1, v0

    move/from16 v0, v37

    move-object/from16 v42, v35

    move/from16 v35, v2

    move-object/from16 v2, v25

    move-object/from16 v25, v3

    move-object/from16 v3, v26

    move-object/from16 v26, v15

    goto/16 :goto_23

    :cond_1d
    move-object/from16 v24, v0

    :goto_1d
    const-string v0, "\u1a7a\u06db"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v33

    mul-int/lit8 v0, v0, 0x23

    xor-int v2, v0, v34

    mul-int/lit16 v2, v2, 0x481b

    const v31, 0x13ef714f

    xor-int v2, v2, v31

    const v31, -0x7ea383b8

    xor-int v0, v0, v31

    move-object/from16 v31, v27

    move-object/from16 v36, v30

    move-object/from16 v30, v14

    move-object/from16 v27, v24

    move-object/from16 v24, v1

    move v1, v2

    move-object/from16 v2, v25

    move-object/from16 v25, v3

    move-object/from16 v3, v26

    move-object/from16 v26, v15

    move-object/from16 v15, v35

    move/from16 v35, v0

    :goto_1e
    move/from16 v0, v37

    move/from16 v42, v21

    move-object/from16 v21, v6

    move-object/from16 v6, v23

    move/from16 v23, v42

    goto/16 :goto_0

    :sswitch_28
    move/from16 v37, v0

    move-object/from16 v35, v15

    move-object/from16 v0, v16

    move-object/from16 v1, v24

    move-object/from16 v24, v25

    move-object/from16 v15, v27

    move-object/from16 v14, v30

    move-object/from16 v27, v31

    move-object/from16 v30, v36

    move-object/from16 v25, v2

    move-object/from16 v2, v18

    move-object/from16 v31, v26

    move-object/from16 v26, v3

    move-object/from16 v3, v17

    move/from16 v42, v23

    move-object/from16 v23, v6

    move-object/from16 v6, v21

    move/from16 v21, v42

    .line 638
    invoke-static {v8, v2, v0, v3}, Ll/֫᩵᩷;->֫(Ll/֫᩵᩷;Ll/᩵᩶ܿ;Ll/᩵֡ᩴ;Ll/᩵֡ᩴ;)V

    move-object/from16 v16, v2

    .line 639
    iget-object v2, v1, Ll/ۨᩴ᩷;->ܿ:Ljava/lang/String;

    move-object/from16 v17, v4

    iget-object v4, v1, Ll/ۨᩴ᩷;->ۧ:Ljava/lang/String;

    invoke-static {v8, v0, v3, v2, v4}, Ll/֫᩵᩷;->֫(Ll/֫᩵᩷;Ll/᩵֡ᩴ;Ll/᩵֡ᩴ;Ljava/lang/String;Ljava/lang/String;)Ll/ۛᩴ᩷;

    move-result-object v19

    .line 1816
    sget v2, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v2, :cond_1e

    move-object v2, v14

    :goto_1f
    const-string v4, "\u0730\u06db"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v33

    mul-int/lit8 v4, v4, 0xd

    xor-int v14, v4, v34

    mul-int/lit16 v14, v14, -0x5c2f

    const v18, 0x74421c5c

    xor-int v14, v14, v18

    const v18, 0x49ad9206    # 1421888.8f

    xor-int v4, v4, v18

    move-object/from16 v18, v16

    move-object/from16 v36, v30

    move-object/from16 v16, v0

    move-object/from16 v30, v2

    move-object/from16 v2, v25

    move/from16 v0, v37

    move-object/from16 v25, v24

    move-object/from16 v24, v1

    move v1, v14

    move-object/from16 v42, v17

    move-object/from16 v17, v3

    move-object/from16 v3, v26

    move-object/from16 v26, v31

    move-object/from16 v31, v27

    move-object/from16 v27, v15

    move-object/from16 v15, v35

    move/from16 v35, v4

    move-object/from16 v4, v42

    goto/16 :goto_24

    :cond_1e
    const-string v2, "\u06df\u1a77"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v33

    mul-int/lit8 v2, v2, -0x7f

    xor-int v4, v2, v34

    mul-int/lit16 v4, v4, -0x6e41

    const v18, 0xc399452

    xor-int v4, v4, v18

    const v18, 0x16a25a54

    xor-int v2, v2, v18

    move-object/from16 v18, v16

    move-object/from16 v36, v30

    move-object/from16 v16, v0

    move-object/from16 v30, v14

    move/from16 v0, v37

    move-object/from16 v42, v24

    move-object/from16 v24, v1

    move v1, v4

    move-object/from16 v4, v17

    move-object/from16 v17, v3

    :goto_20
    move-object/from16 v3, v26

    move-object/from16 v26, v31

    move-object/from16 v31, v27

    move-object/from16 v27, v15

    move-object/from16 v15, v35

    move/from16 v35, v2

    move-object/from16 v2, v25

    move-object/from16 v25, v42

    goto/16 :goto_24

    :sswitch_29
    move/from16 v37, v0

    move-object/from16 v17, v4

    move-object/from16 v35, v15

    move-object/from16 v1, v24

    move-object/from16 v24, v25

    move-object/from16 v15, v27

    move-object/from16 v14, v30

    move-object/from16 v27, v31

    move-object/from16 v30, v36

    move-object/from16 v25, v2

    move-object/from16 v31, v26

    move-object/from16 v26, v3

    move/from16 v42, v23

    move-object/from16 v23, v6

    move-object/from16 v6, v21

    move/from16 v21, v42

    .line 636
    invoke-static {v8}, Ll/֫᩵᩷;->֨(Ll/֫᩵᩷;)Ll/ۗᩴ᩷;

    move-result-object v0

    invoke-virtual {v0, v11}, Ll/ۗᩴ᩷;->֫(Ljava/util/ArrayList;)Ll/᩵֡ᩴ;

    move-result-object v16

    .line 637
    invoke-static {v8}, Ll/֫᩵᩷;->֡(Ll/֫᩵᩷;)Ll/ۗᩴ᩷;

    move-result-object v0

    invoke-virtual {v0, v11}, Ll/ۗᩴ᩷;->֫(Ljava/util/ArrayList;)Ll/᩵֡ᩴ;

    move-result-object v0

    move-object/from16 v4, p0

    .line 638
    iget-object v2, v4, Ll/֡ᩴ᩷;->ܳ:Ll/᩵᩶ܿ;

    sget v3, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v3, :cond_1f

    move-object/from16 v18, v2

    :goto_21
    const-string v2, "\u06e8\u06dc"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v34

    mul-int/lit8 v2, v2, -0x2b

    xor-int v3, v2, v33

    mul-int/lit16 v3, v3, 0x6319

    const v36, -0x2a45db02

    xor-int v3, v3, v36

    const v36, -0x6591e115

    xor-int v2, v2, v36

    move-object/from16 v4, v17

    move-object/from16 v36, v30

    move-object/from16 v17, v0

    move-object/from16 v30, v14

    move/from16 v0, v37

    move-object/from16 v42, v24

    move-object/from16 v24, v1

    move v1, v3

    goto :goto_20

    :cond_1f
    const-string v3, "\u1a7b\u06e0"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v34

    mul-int/lit8 v3, v3, -0x59

    move-object/from16 v18, v0

    xor-int v0, v3, v33

    mul-int/lit16 v0, v0, -0x20df

    const v36, 0x347490d2

    xor-int v0, v0, v36

    const v36, -0x6dee87fd

    xor-int v3, v3, v36

    move-object/from16 v4, v17

    move-object/from16 v17, v18

    move-object/from16 v36, v30

    move-object/from16 v18, v2

    move-object/from16 v30, v14

    move-object/from16 v2, v25

    :goto_22
    move-object/from16 v25, v24

    move-object/from16 v24, v1

    move v1, v0

    move/from16 v0, v37

    move-object/from16 v42, v35

    move/from16 v35, v3

    move-object/from16 v3, v26

    move-object/from16 v26, v31

    move-object/from16 v31, v27

    move-object/from16 v27, v15

    :goto_23
    move-object/from16 v15, v42

    :goto_24
    move/from16 v43, v21

    move-object/from16 v21, v6

    move-object/from16 v6, v23

    move/from16 v23, v43

    goto/16 :goto_0

    :sswitch_2a
    move/from16 v37, v0

    move-object/from16 v35, v15

    move-object/from16 v0, v16

    move-object/from16 v16, v18

    move-object/from16 v1, v24

    move-object/from16 v24, v25

    move-object/from16 v15, v27

    move-object/from16 v14, v30

    move-object/from16 v27, v31

    move-object/from16 v30, v36

    move-object/from16 v25, v2

    move-object/from16 v31, v26

    move-object/from16 v26, v3

    move-object/from16 v3, v17

    move-object/from16 v17, v4

    move-object/from16 v4, p0

    move/from16 v42, v23

    move-object/from16 v23, v6

    move-object/from16 v6, v21

    move/from16 v21, v42

    .line 737
    invoke-static/range {v20 .. v20}, Ll/֫ۧ;->۫ܶܺ(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_20

    const-string v2, "\u1a78\u06e1"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v34

    move-object/from16 v18, v0

    xor-int v0, v2, v33

    mul-int/lit16 v0, v0, -0x433b

    const v36, 0xa7231a2

    xor-int v0, v0, v36

    const v36, -0x53ed717

    xor-int v2, v2, v36

    move-object/from16 v4, v17

    move-object/from16 v36, v30

    move-object/from16 v17, v3

    move-object/from16 v30, v14

    move-object/from16 v3, v26

    move-object/from16 v26, v31

    move-object/from16 v31, v27

    move-object/from16 v27, v15

    move-object/from16 v15, v35

    move/from16 v35, v2

    move-object/from16 v2, v25

    move-object/from16 v25, v24

    move-object/from16 v24, v1

    move v1, v0

    move/from16 v0, v37

    move/from16 v42, v21

    move-object/from16 v21, v6

    move-object/from16 v6, v23

    move/from16 v23, v42

    move-object/from16 v43, v18

    move-object/from16 v18, v16

    move-object/from16 v16, v43

    goto/16 :goto_0

    :cond_20
    move-object/from16 v18, v0

    const-string v0, "\u0733\u0736"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v33

    xor-int v2, v0, v34

    mul-int/lit16 v2, v2, -0x2523

    const v36, 0x3ec606df

    xor-int v2, v2, v36

    const v36, -0x474aebf1

    goto :goto_26

    :sswitch_2b
    move/from16 v37, v0

    move-object/from16 v35, v15

    move-object/from16 v24, v25

    move-object/from16 v15, v27

    move-object/from16 v14, v30

    move-object/from16 v27, v31

    move-object/from16 v30, v36

    move-object/from16 v25, v2

    move-object/from16 v31, v26

    move-object/from16 v26, v3

    move-object/from16 v3, v17

    move-object/from16 v17, v4

    move-object/from16 v4, p0

    move/from16 v42, v23

    move-object/from16 v23, v6

    move-object/from16 v6, v21

    move/from16 v21, v42

    move-object/from16 v43, v18

    move-object/from16 v18, v16

    move-object/from16 v16, v43

    .line 634
    invoke-static {v8}, Ll/֫᩵᩷;->᩶(Ll/֫᩵᩷;)Ll/ۨᩴ᩷;

    move-result-object v0

    .line 635
    iget-object v1, v4, Ll/֡ᩴ᩷;->᩻:Ljava/util/List;

    .line 736
    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v1}, Ll/֫᩺;->ۗ᩷᩻(Ljava/lang/Object;)I

    move-result v11

    invoke-direct {v2, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 737
    invoke-static {v1}, Ll/֫ܽ;->֨ۚܿ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    move-object/from16 v20, v1

    move-object v11, v2

    move-object v1, v0

    :goto_25
    const-string v0, "\u06dc\u06db"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v34, v0

    mul-int/lit8 v0, v0, -0x41

    xor-int v2, v0, v33

    mul-int/lit16 v2, v2, -0x2ecd

    const v36, 0x4443e9c5

    xor-int v2, v2, v36

    const v36, 0x43530f07

    :goto_26
    xor-int v0, v0, v36

    move-object/from16 v4, v17

    move-object/from16 v36, v30

    move-object/from16 v17, v3

    move-object/from16 v30, v14

    move-object/from16 v3, v26

    move-object/from16 v26, v31

    move-object/from16 v31, v27

    move-object/from16 v27, v15

    move-object/from16 v15, v35

    move/from16 v35, v0

    move/from16 v0, v37

    move-object/from16 v42, v24

    move-object/from16 v24, v1

    move v1, v2

    move-object/from16 v2, v25

    move-object/from16 v25, v42

    move/from16 v43, v21

    move-object/from16 v21, v6

    move-object/from16 v6, v23

    move/from16 v23, v43

    move-object/from16 v44, v18

    move-object/from16 v18, v16

    move-object/from16 v16, v44

    goto/16 :goto_0

    :sswitch_2c
    move/from16 v37, v0

    move-object/from16 v35, v15

    move-object/from16 v1, v24

    move-object/from16 v24, v25

    move-object/from16 v15, v27

    move-object/from16 v14, v30

    move-object/from16 v27, v31

    move-object/from16 v30, v36

    move-object/from16 v25, v2

    move-object/from16 v31, v26

    move-object/from16 v26, v3

    move-object/from16 v3, v17

    move-object/from16 v17, v4

    move-object/from16 v4, p0

    move/from16 v42, v23

    move-object/from16 v23, v6

    move-object/from16 v6, v21

    move/from16 v21, v42

    move-object/from16 v43, v18

    move-object/from16 v18, v16

    move-object/from16 v16, v43

    .line 630
    iget-object v0, v4, Ll/֡ᩴ᩷;->ܺ:Ljava/lang/String;

    iget-object v2, v4, Ll/֡ᩴ᩷;->ۢ:Ljava/lang/String;

    move-object/from16 v36, v1

    iget v1, v4, Ll/֡ᩴ᩷;->ۘ:I

    move-object/from16 v38, v5

    iget v5, v4, Ll/֡ᩴ᩷;->ۖ:I

    move-object/from16 v39, v6

    iget v6, v4, Ll/֡ᩴ᩷;->ۡ:I

    move-object/from16 v40, v16

    move-object/from16 v16, v2

    move-object v2, v8

    move-object/from16 v41, v3

    move v3, v1

    move-object v1, v4

    move v4, v5

    move v5, v6

    move-object v6, v0

    move-object v0, v7

    move-object/from16 v7, v16

    invoke-static/range {v2 .. v7}, Ll/֫᩵᩷;->֫(Ll/֫᩵᩷;IIILjava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_21

    goto/16 :goto_27

    :cond_21
    const-string v2, "\u1a73\u05a8"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v33

    xor-int v3, v2, v34

    mul-int/lit16 v3, v3, -0x5089

    const v4, 0x5e3f8f55

    xor-int/2addr v3, v4

    const v4, 0x4dec1951    # 4.95135264E8f

    goto/16 :goto_28

    :sswitch_2d
    move-object/from16 v1, p0

    move/from16 v37, v0

    move-object/from16 v38, v5

    move-object v0, v7

    move-object/from16 v35, v15

    move-object/from16 v41, v17

    move-object/from16 v40, v18

    move-object/from16 v39, v21

    move/from16 v21, v23

    move-object/from16 v15, v27

    move-object/from16 v14, v30

    move-object/from16 v27, v31

    move-object/from16 v30, v36

    move-object/from16 v17, v4

    move-object/from16 v23, v6

    move-object/from16 v18, v16

    move-object/from16 v36, v24

    move-object/from16 v24, v25

    move-object/from16 v31, v26

    move-object/from16 v25, v2

    move-object/from16 v26, v3

    .line 627
    invoke-static {v8}, Ll/֫᩵᩷;->᩹(Ll/֫᩵᩷;)Z

    move-result v2

    if-nez v2, :cond_22

    goto/16 :goto_27

    :cond_22
    const-string v2, "\u06eb\u06e4"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v33

    mul-int/lit8 v2, v2, 0x69

    xor-int v3, v2, v34

    mul-int/lit16 v3, v3, -0x6dc1

    const v4, -0x842ab4e

    xor-int/2addr v3, v4

    const v4, -0x427b65f5

    goto/16 :goto_28

    :sswitch_2e
    move-object/from16 v1, p0

    move/from16 v37, v0

    move-object/from16 v38, v5

    move-object/from16 v23, v6

    move-object v0, v7

    move-object/from16 v35, v15

    move-object/from16 v41, v17

    move-object/from16 v40, v18

    move-object/from16 v39, v21

    move-object/from16 v15, v27

    move-object/from16 v14, v30

    move-object/from16 v27, v31

    move-object/from16 v30, v36

    move-object/from16 v17, v4

    move-object/from16 v18, v16

    move-object/from16 v36, v24

    move-object/from16 v24, v25

    move-object/from16 v31, v26

    move-object/from16 v25, v2

    move-object/from16 v26, v3

    iget-object v8, v1, Ll/֡ᩴ᩷;->ۜ:Ll/֫᩵᩷;

    invoke-static {v8}, Ll/֫᩵᩷;->᩷(Ll/֫᩵᩷;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v2

    invoke-static {v2}, Ll/ۖ;->֡᩹۫(Ljava/lang/Object;)I

    move-result v2

    iget v3, v1, Ll/֡ᩴ᩷;->ۘ:I

    if-ne v3, v2, :cond_23

    const-string v2, "\u05a1\u0730"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v34

    mul-int/lit8 v2, v2, 0x65

    xor-int v4, v2, v33

    mul-int/lit16 v4, v4, 0x2ac5

    const v5, 0x3761a017

    xor-int/2addr v4, v5

    const v5, -0x43701dc8

    xor-int/2addr v2, v5

    move-object v7, v0

    move v1, v4

    move-object/from16 v4, v17

    move-object/from16 v16, v18

    move-object/from16 v6, v23

    move/from16 v0, v37

    move-object/from16 v5, v38

    move-object/from16 v21, v39

    move-object/from16 v18, v40

    move-object/from16 v17, v41

    move/from16 v23, v3

    move-object/from16 v3, v26

    move-object/from16 v26, v31

    move-object/from16 v31, v27

    goto/16 :goto_29

    :cond_23
    move/from16 v21, v3

    goto :goto_27

    :sswitch_2f
    move-object/from16 v1, p0

    return-void

    :sswitch_30
    move-object/from16 v1, p0

    move/from16 v37, v0

    move-object/from16 v38, v5

    move-object v0, v7

    move-object/from16 v35, v15

    move-object/from16 v41, v17

    move-object/from16 v40, v18

    move-object/from16 v39, v21

    move/from16 v21, v23

    move-object/from16 v15, v27

    move-object/from16 v14, v30

    move-object/from16 v27, v31

    move-object/from16 v30, v36

    move-object/from16 v17, v4

    move-object/from16 v23, v6

    move-object/from16 v18, v16

    move-object/from16 v36, v24

    move-object/from16 v24, v25

    move-object/from16 v31, v26

    move-object/from16 v25, v2

    move-object/from16 v26, v3

    iget-object v2, v1, Ll/֡ᩴ᩷;->᩻:Ljava/util/List;

    if-eqz v2, :cond_24

    const-string v2, "\u1a7b\u1a79"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v34

    mul-int/lit8 v2, v2, 0x7f

    xor-int v3, v2, v33

    mul-int/lit16 v3, v3, -0x69b

    const v4, -0x59454ea2

    xor-int/2addr v3, v4

    const v4, 0x2cc8e818

    goto :goto_28

    :cond_24
    :goto_27
    const-string v2, "\u06d7\u06e8"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v33

    mul-int/lit8 v2, v2, -0x3b

    xor-int v3, v2, v34

    mul-int/lit16 v3, v3, -0x1a2f

    const v4, 0x52f34d71

    xor-int/2addr v3, v4

    const v4, -0x13c07f4b

    :goto_28
    xor-int/2addr v2, v4

    move-object v7, v0

    move v1, v3

    move-object/from16 v4, v17

    move-object/from16 v16, v18

    move-object/from16 v6, v23

    move-object/from16 v3, v26

    move-object/from16 v26, v31

    move/from16 v0, v37

    move-object/from16 v5, v38

    move-object/from16 v18, v40

    move-object/from16 v17, v41

    move/from16 v23, v21

    move-object/from16 v31, v27

    move-object/from16 v21, v39

    :goto_29
    move-object/from16 v27, v15

    move-object/from16 v15, v35

    move/from16 v35, v2

    move-object/from16 v2, v25

    move-object/from16 v25, v24

    move-object/from16 v24, v36

    move-object/from16 v36, v30

    move-object/from16 v30, v14

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fcc1e7c -> :sswitch_1f
        -0x79c33aba -> :sswitch_11
        -0x767f8071 -> :sswitch_2a
        -0x71f7731d -> :sswitch_22
        -0x716aa991 -> :sswitch_8
        -0x6fb15f66 -> :sswitch_f
        -0x6b86c0ea -> :sswitch_1a
        -0x6b56fbf4 -> :sswitch_1c
        -0x6a861747 -> :sswitch_15
        -0x6934eebb -> :sswitch_1
        -0x67eaf262 -> :sswitch_3
        -0x66f9c34b -> :sswitch_19
        -0x64d721d3 -> :sswitch_26
        -0x60e843a0 -> :sswitch_12
        -0x5d0a15a0 -> :sswitch_13
        -0x5b42e119 -> :sswitch_c
        -0x57b239cb -> :sswitch_0
        -0x571c7858 -> :sswitch_13
        -0x56fca327 -> :sswitch_17
        -0x53cde47c -> :sswitch_14
        -0x4e85c748 -> :sswitch_f
        -0x4cf5f2ce -> :sswitch_22
        -0x499a57fa -> :sswitch_28
        -0x4885a01e -> :sswitch_1f
        -0x47e35499 -> :sswitch_16
        -0x46177f93 -> :sswitch_2e
        -0x45ba83a1 -> :sswitch_2b
        -0x44931e31 -> :sswitch_1d
        -0x43706e30 -> :sswitch_c
        -0x431e3166 -> :sswitch_24
        -0x41c446ec -> :sswitch_17
        -0x41a56ece -> :sswitch_a
        -0x38ac23d0 -> :sswitch_16
        -0x370ebeba -> :sswitch_6
        -0x31be983d -> :sswitch_0
        -0x3006b71a -> :sswitch_b
        -0x29fb60bb -> :sswitch_23
        -0x23ee7ca8 -> :sswitch_10
        -0x212aa459 -> :sswitch_9
        -0x1d1639ae -> :sswitch_20
        -0x1c88fbc2 -> :sswitch_12
        -0x17c90056 -> :sswitch_2c
        -0x167ed5ac -> :sswitch_2d
        -0x1369a9a5 -> :sswitch_29
        -0x1345f573 -> :sswitch_2
        -0x10f68408 -> :sswitch_15
        -0x9848c87 -> :sswitch_1
        -0xf68b4c -> :sswitch_b
        0xce6c0 -> :sswitch_25
        0x22f7132 -> :sswitch_4
        0x86d2a85 -> :sswitch_e
        0xc67c6ea -> :sswitch_9
        0xf5073f3 -> :sswitch_5
        0xfca0f68 -> :sswitch_25
        0x12cb7ae8 -> :sswitch_14
        0x14bbf939 -> :sswitch_2e
        0x154daff0 -> :sswitch_4
        0x15ac5aa2 -> :sswitch_24
        0x166478ca -> :sswitch_1c
        0x17c108e6 -> :sswitch_7
        0x19a4a735 -> :sswitch_1b
        0x19cc84f3 -> :sswitch_2b
        0x1d0ebaf2 -> :sswitch_2d
        0x271592a1 -> :sswitch_20
        0x29373003 -> :sswitch_21
        0x2dc17590 -> :sswitch_30
        0x3144964d -> :sswitch_a
        0x36c64976 -> :sswitch_3
        0x37f3a770 -> :sswitch_26
        0x3822d171 -> :sswitch_18
        0x38f962d3 -> :sswitch_e
        0x3f085415 -> :sswitch_2c
        0x41b2d3fb -> :sswitch_1e
        0x43b6b193 -> :sswitch_d
        0x4ed673d4 -> :sswitch_2
        0x4fe9bb0d -> :sswitch_d
        0x51f20371 -> :sswitch_29
        0x54e7ef9e -> :sswitch_1d
        0x5724dae8 -> :sswitch_1b
        0x57423ff1 -> :sswitch_23
        0x5778e67b -> :sswitch_27
        0x59ac23d7 -> :sswitch_27
        0x5d45b9a6 -> :sswitch_1e
        0x60446f92 -> :sswitch_5
        0x60ca8d55 -> :sswitch_2a
        0x65d2f9b2 -> :sswitch_7
        0x662fcf5d -> :sswitch_28
        0x66497c85 -> :sswitch_6
        0x6b42569b -> :sswitch_11
        0x6dd77ef3 -> :sswitch_8
        0x6ef09794 -> :sswitch_19
        0x709fe711 -> :sswitch_21
        0x735cb77e -> :sswitch_18
        0x77a9317d -> :sswitch_2f
        0x79c6414a -> :sswitch_10
        0x7a5d6cfc -> :sswitch_1a
        0x7bd89b79 -> :sswitch_2f
        0x7e1474bc -> :sswitch_30
    .end sparse-switch
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 0

    return-void
.end method

.method public final ۧ()V
    .locals 0

    return-void
.end method

.method public final ܿ()V
    .locals 19

    move-object/from16 v0, p0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const v12, -0x47b94bdc

    sget v13, Ll/ۗ᩶;->ۛ֨ۘ:I

    sget v14, Ll/֡֡;->֫ۤܳ:I

    const-string v15, "\u1a74\u05ab"

    invoke-static {v15}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v14

    xor-int v1, v15, v13

    mul-int/lit16 v1, v1, -0x7c0b

    const v2, -0x2135d4a2

    xor-int/2addr v1, v2

    const v2, -0x45691401

    xor-int/2addr v2, v15

    const-wide/16 v16, 0x0

    :goto_0
    xor-int/2addr v12, v13

    mul-int/lit16 v12, v12, 0x6565

    shr-int/lit8 v12, v12, 0x1f

    and-int/2addr v1, v12

    xor-int v12, v2, v1

    sparse-switch v12, :sswitch_data_0

    return-void

    .line 337
    :sswitch_0
    sget-boolean v1, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v1, :cond_c

    goto/16 :goto_2

    .line 595
    :sswitch_1
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    move-result v1

    if-nez v1, :cond_4

    goto/16 :goto_4

    .line 128
    :sswitch_2
    sget v1, Ll/۟;->ۗۤۛ:I

    if-nez v1, :cond_a

    goto/16 :goto_6

    :sswitch_3
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    goto/16 :goto_6

    :sswitch_4
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    invoke-static {}, Ll/۠;->ܿ۠۠()I

    return-void

    .line 622
    :sswitch_5
    invoke-static {v11}, Ll/ۗ᩶ܿ;->ۧ(Z)Ll/᩵᩶ܿ;

    move-result-object v1

    iput-object v1, v0, Ll/֡ᩴ᩷;->ܳ:Ll/᩵᩶ܿ;

    return-void

    .line 546
    :sswitch_6
    invoke-static {}, Ll/ۢ֨ۢ;->ۢ()Z

    move-result v11

    sget v1, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v1, :cond_0

    goto/16 :goto_6

    :cond_0
    const-string v1, "\u06e1\u073a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x2f

    xor-int v2, v1, v13

    mul-int/lit16 v2, v2, -0x10c3

    const v15, -0x627e4fc5

    xor-int/2addr v2, v15

    const v15, -0x7744f48b

    goto/16 :goto_7

    .line 622
    :sswitch_7
    move-object v1, v10

    check-cast v1, Ll/ܶۡ᩷;

    invoke-static {v1}, Ll/֫᩵;->ۡ۬ܳ(Ljava/lang/Object;)Ljava/lang/Class;

    .line 287
    sget v1, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v1, :cond_1

    goto :goto_2

    :cond_1
    const-string v1, "\u06e2\u1a7a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, 0x3009

    const v15, -0x6b69ebc

    xor-int/2addr v2, v15

    const v15, 0x5505d10f

    goto/16 :goto_7

    .line 621
    :sswitch_8
    iput-object v9, v0, Ll/֡ᩴ᩷;->᩻:Ljava/util/List;

    .line 622
    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v10

    .line 33
    sget v1, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v1, :cond_2

    goto :goto_1

    :cond_2
    const-string v1, "\u06d9\u06e2"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v2, v1, v13

    mul-int/lit16 v2, v2, -0x6605

    const v15, 0x38975833

    xor-int/2addr v2, v15

    const v15, -0x61251aa5

    goto/16 :goto_7

    .line 621
    :sswitch_9
    invoke-virtual {v7, v8}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;

    move-result-object v9

    .line 129
    sget-boolean v1, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v1, :cond_3

    :goto_1
    const-string v1, "\u05a1\u06d7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x11

    xor-int v2, v1, v13

    mul-int/lit16 v2, v2, 0x7387

    const v15, 0x221d344f

    xor-int/2addr v2, v15

    const v15, 0x4997e1f5

    goto/16 :goto_7

    :cond_3
    const-string v1, "\u06d7\u06da"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, -0x5ea5

    const v15, -0x1c5ce672

    xor-int/2addr v2, v15

    const v15, -0x4dd1a88

    goto/16 :goto_7

    :sswitch_a
    const/4 v8, 0x0

    .line 128
    sget v1, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v1, :cond_5

    :cond_4
    :goto_2
    const-string v1, "\u073d\u06da"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x69

    xor-int v2, v1, v13

    mul-int/lit16 v2, v2, 0x5b83

    const v15, 0x3cfd5a20

    xor-int/2addr v2, v15

    const v15, 0x3f5e3ce

    goto/16 :goto_7

    :cond_5
    const-string v1, "\u06d7\u1a76"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v2, v1, v13

    mul-int/lit16 v2, v2, 0x6817

    const v15, -0x35377878    # -6570948.0f

    xor-int/2addr v2, v15

    const v15, -0x14218a9b

    goto/16 :goto_7

    .line 620
    :sswitch_b
    invoke-static {}, Ll/ۢ֨ۢ;->ᩴ()V

    .line 621
    invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v7

    sget v1, Ll/᩺;->ۙۛܶ:I

    if-gtz v1, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v1, "\u06e1\u1a77"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v2, v1, v13

    mul-int/lit16 v2, v2, -0x4f5d

    const v15, 0x22300514

    xor-int/2addr v2, v15

    const v15, -0x4245116c

    goto/16 :goto_7

    .line 615
    :sswitch_c
    invoke-static {v3, v4}, Landroid/os/SystemClock;->sleep(J)V

    goto :goto_3

    .line 617
    :sswitch_d
    invoke-static {v6}, Ll/֡᩺;->᩺ᩴ᩹(Ljava/lang/Object;)I

    move-result v1

    iget v2, v0, Ll/֡ᩴ᩷;->ۘ:I

    if-eq v2, v1, :cond_7

    const-string v1, "\u0730\u05a8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, -0x57c3

    const v15, -0x1da786d4

    xor-int/2addr v2, v15

    const v15, -0x4c1b8eb9

    goto/16 :goto_7

    :cond_7
    const-string v1, "\u06e7\u073f"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    mul-int/lit8 v1, v1, -0x63

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, 0x1007

    const v15, -0x2fe90b67

    xor-int/2addr v2, v15

    const v15, -0x4bc66ade

    goto/16 :goto_7

    :sswitch_e
    iget-object v5, v0, Ll/֡ᩴ᩷;->ۜ:Ll/֫᩵᩷;

    invoke-static {v5}, Ll/֫᩵᩷;->᩷(Ll/֫᩵᩷;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v6

    sget v1, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v1, :cond_8

    goto :goto_5

    :cond_8
    const-string v1, "\u1a74\u0730"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, 0x35e1

    const v15, -0x124da9f5

    xor-int/2addr v2, v15

    const v15, 0xe0cc4b5

    goto/16 :goto_7

    .line 614
    :sswitch_f
    iget-wide v3, v0, Ll/֡ᩴ᩷;->᩷:J

    cmp-long v1, v3, v16

    if-lez v1, :cond_9

    const-string v1, "\u1a78\u1a78"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x5d

    xor-int v2, v1, v13

    mul-int/lit16 v2, v2, 0x2a07

    const v15, 0x3cfc8eab

    xor-int/2addr v2, v15

    const v15, 0x382bfb09

    goto/16 :goto_7

    :cond_9
    :goto_3
    const-string v1, "\u1a7a\u06e1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, -0x1011

    const v15, 0x16622e59

    xor-int/2addr v2, v15

    const v15, 0x759147e3

    goto/16 :goto_7

    .line 17
    :sswitch_10
    sget v1, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v1, :cond_b

    :cond_a
    :goto_4
    const-string v1, "\u073a\u05ab"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, 0x36ab

    const v15, -0x72e457d7

    xor-int/2addr v2, v15

    const v15, 0x9750fda

    goto :goto_7

    :cond_b
    const-string v1, "\u0736\u06e1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v2, v1, v13

    mul-int/lit16 v2, v2, -0x2731

    const v15, 0x1087f969

    xor-int/2addr v2, v15

    const v15, 0x56ca5177

    goto :goto_7

    :sswitch_11
    sget v1, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v1, :cond_d

    :cond_c
    :goto_5
    const-string v1, "\u073d\u05ab"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, -0x3311

    const v15, 0x31a8dd1b

    xor-int/2addr v2, v15

    const v15, -0x431f58f7

    goto :goto_7

    :cond_d
    const-string v1, "\u1a76\u06db"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, 0xccb

    const v15, 0x90c61c8

    xor-int/2addr v2, v15

    const v15, 0x595459a3

    goto :goto_7

    :sswitch_12
    const-wide/16 v16, 0x0

    .line 29
    sget-boolean v1, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v1, :cond_e

    :goto_6
    const-string v1, "\u0730\u05ab"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v2, v1, v13

    mul-int/lit16 v2, v2, -0x2921

    const v15, -0x6a8dd870

    xor-int/2addr v2, v15

    const v15, 0x1dff27f2

    goto :goto_7

    :cond_e
    const-string v1, "\u1a7a\u06d9"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v2, v1, v13

    mul-int/lit16 v2, v2, 0x6289

    const v15, 0x2a5b79fa

    xor-int/2addr v2, v15

    const v15, 0xbe6f1be

    :goto_7
    xor-int/2addr v1, v15

    move/from16 v18, v2

    move v2, v1

    move/from16 v1, v18

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x716837e8 -> :sswitch_0
        -0x67b3cdf2 -> :sswitch_2
        -0x669a76cc -> :sswitch_e
        -0x5d0e5846 -> :sswitch_a
        -0x5c1dc7fa -> :sswitch_2
        -0x559055a9 -> :sswitch_f
        -0x4b1c5054 -> :sswitch_7
        -0x4b1883e8 -> :sswitch_6
        -0x4aa12d6e -> :sswitch_4
        -0x4a5f680a -> :sswitch_10
        -0x47d0c653 -> :sswitch_8
        -0x460d3459 -> :sswitch_6
        -0x2c2b5bac -> :sswitch_11
        -0x250abe72 -> :sswitch_f
        -0x1ea5213e -> :sswitch_4
        -0x1d07f507 -> :sswitch_d
        -0x1a7de0e5 -> :sswitch_3
        -0x17ad06f6 -> :sswitch_b
        -0x153c2e77 -> :sswitch_5
        -0xff8e9e9 -> :sswitch_1
        -0xfbfe1ca -> :sswitch_c
        -0x8bf2896 -> :sswitch_11
        0x2b469ee -> :sswitch_5
        0x145931c5 -> :sswitch_9
        0x177b8651 -> :sswitch_9
        0x17d5caeb -> :sswitch_8
        0x2b45219c -> :sswitch_0
        0x3206caa1 -> :sswitch_12
        0x411f1c69 -> :sswitch_a
        0x425095c9 -> :sswitch_e
        0x4630cf03 -> :sswitch_12
        0x47d0b0d5 -> :sswitch_d
        0x5017b477 -> :sswitch_1
        0x564df8b4 -> :sswitch_c
        0x5d33901c -> :sswitch_3
        0x627f2339 -> :sswitch_7
        0x74ff4426 -> :sswitch_b
        0x7a6b26f4 -> :sswitch_10
    .end sparse-switch
.end method

.method public final ᩳ()V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x21a01af1

    sget v2, Ll/ۗ᩺;->ۡ᩺֡:I

    sget v3, Ll/֫ܽ;->ۚ᩷᩹:I

    const-string v4, "\u06eb\u06e7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3165

    const v6, 0xd2f0156

    xor-int/2addr v5, v6

    const v6, 0x3c7fa85a

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x38af

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    goto/16 :goto_5

    :sswitch_0
    sget v4, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-gez v4, :cond_c

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    move-result v4

    if-lez v4, :cond_4

    goto :goto_1

    .line 252
    :sswitch_2
    sget v4, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v4, :cond_0

    goto/16 :goto_5

    :cond_0
    :goto_1
    const-string v4, "\u06dc\u1a79"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x7b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1391

    const v6, 0x2bdb6143

    xor-int/2addr v5, v6

    const v6, 0x41ec3d71    # 29.53f

    goto :goto_0

    .line 274
    :sswitch_3
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    return-void

    .line 672
    :sswitch_4
    invoke-static {v0}, Ll/֫ܽ;->֫۬ۛ(Ljava/lang/Object;)V

    goto :goto_2

    :sswitch_5
    return-void

    .line 671
    :sswitch_6
    iget-object v0, p0, Ll/֡ᩴ᩷;->ܳ:Ll/᩵᩶ܿ;

    if-eqz v0, :cond_1

    const-string v4, "\u1a78\u06d7"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x7

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2f27

    const v6, 0x72c2e8c8

    xor-int/2addr v5, v6

    const v6, 0x2495da

    goto :goto_0

    :cond_1
    :goto_2
    const-string v4, "\u06e1\u1a76"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3c75

    const v6, 0x239a7728

    xor-int/2addr v5, v6

    const v6, 0x20639f03

    goto :goto_0

    .line 280
    :sswitch_7
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v4

    if-nez v4, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v4, "\u1a76\u06e4"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5961

    const v6, -0x2bf09cb3

    xor-int/2addr v5, v6

    const v6, 0x2ec670c1

    goto/16 :goto_0

    :sswitch_8
    sget v4, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v4, "\u06e0\u1a77"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x71

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4f55

    const v6, 0x2cf3540c

    xor-int/2addr v5, v6

    const v6, -0x10afa662

    goto/16 :goto_0

    .line 514
    :sswitch_9
    sget v4, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v4, :cond_5

    :cond_4
    :goto_3
    const-string v4, "\u1a77\u1a76"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3b63

    const v6, 0x3ac0fd1e

    xor-int/2addr v5, v6

    const v6, 0x3482c5b5

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u1a73\u1a74"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x45

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3e47

    const v6, 0x7b17bfe1

    xor-int/2addr v5, v6

    const v6, -0x16518752

    goto/16 :goto_0

    :sswitch_a
    sget-boolean v4, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v4, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v4, "\u0730\u06e8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x8d7

    const v6, -0x39f02895

    xor-int/2addr v5, v6

    const v6, -0x335d6872    # -8.524504E7f

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v4, :cond_7

    goto :goto_4

    :cond_7
    const-string v4, "\u06eb\u05ab"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x33c3

    const v6, 0x1047b6b9

    xor-int/2addr v5, v6

    const v6, -0x13dc1fa8

    goto/16 :goto_0

    .line 115
    :sswitch_c
    sget v4, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v4, :cond_8

    :goto_4
    const-string v4, "\u1a7a\u1a76"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7aa5

    const v6, -0x18ec2ca1

    xor-int/2addr v5, v6

    const v6, 0x4302143b

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u0733\u06d6"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x9

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5687

    const v6, -0x1e255afe

    xor-int/2addr v5, v6

    const v6, 0x2e0c1f77

    goto/16 :goto_0

    .line 216
    :sswitch_d
    sget v4, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v4, :cond_9

    goto :goto_5

    :cond_9
    const-string v4, "\u073a\u06e8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3f5d

    const v6, 0x5d06a757

    xor-int/2addr v5, v6

    const v6, 0x1b3e6e38

    goto/16 :goto_0

    .line 622
    :sswitch_e
    sget-boolean v4, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v4, :cond_a

    goto :goto_5

    :cond_a
    const-string v4, "\u05ab\u06e0"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x6d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5c7f

    const v6, 0x78efad33

    xor-int/2addr v5, v6

    const v6, 0x48e5ee17

    goto/16 :goto_0

    .line 0
    :sswitch_f
    sget v4, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v4, :cond_b

    :goto_5
    const-string v4, "\u073d\u06df"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6395

    const v6, -0x69171f63

    xor-int/2addr v5, v6

    const v6, 0x97e5b58

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u1a73\u06e1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x11a1

    const v6, -0x436a93a5

    xor-int/2addr v5, v6

    const v6, -0x4da8e262

    goto/16 :goto_0

    :sswitch_10
    sget-boolean v4, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v4, :cond_d

    :cond_c
    const-string v4, "\u0730\u06db"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x159b

    const v6, 0x1d0ea6c5

    xor-int/2addr v5, v6

    const v6, 0xe8f1bdf

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u06df\u06df"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5b2d

    const v6, 0x2b3a6904

    xor-int/2addr v5, v6

    const v6, -0x69f57628

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7c0b1a6a -> :sswitch_f
        -0x7758f89a -> :sswitch_6
        -0x67629cd0 -> :sswitch_3
        -0x63518394 -> :sswitch_7
        -0x6093dea2 -> :sswitch_1
        -0x5d3fb28d -> :sswitch_5
        -0x58dcfe65 -> :sswitch_3
        -0x35787b64 -> :sswitch_c
        -0x2d1d7bd3 -> :sswitch_0
        -0x2080ab8e -> :sswitch_1
        -0x1ac778e0 -> :sswitch_2
        -0x123986b4 -> :sswitch_10
        -0xef11d08 -> :sswitch_b
        -0xe258304 -> :sswitch_5
        -0x77f14e7 -> :sswitch_b
        -0x472455f -> :sswitch_c
        -0x28ad39b -> :sswitch_4
        -0x83b85b -> :sswitch_6
        0x7e98d12 -> :sswitch_f
        0x1bb4c83e -> :sswitch_0
        0x1f6c77fe -> :sswitch_4
        0x278124cb -> :sswitch_a
        0x3d9a3032 -> :sswitch_a
        0x40a861b6 -> :sswitch_10
        0x4634b51f -> :sswitch_9
        0x4b9944ee -> :sswitch_d
        0x51973cd3 -> :sswitch_e
        0x5531e844 -> :sswitch_d
        0x55fb7fe3 -> :sswitch_2
        0x5c392d4d -> :sswitch_8
        0x5d41ad1c -> :sswitch_9
        0x63ed2b1a -> :sswitch_e
        0x6e9dad39 -> :sswitch_8
        0x75841983 -> :sswitch_7
    .end sparse-switch
.end method
